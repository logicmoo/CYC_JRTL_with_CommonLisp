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
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_motivation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_heuristic_balanced_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_balanced_tactician_datastructures extends SubLTranslatedFile {

  //// Constructor

  private inference_balanced_tactician_datastructures() {}
  public static final SubLFile me = new inference_balanced_tactician_datastructures();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures";

  //// Definitions

  public static final class $balanced_strategy_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $problems_motivated_wrt_new_root_table; }
    public SubLObject getField3() { return $problems_motivated_wrt_removal; }
    public SubLObject getField4() { return $problems_motivated_wrt_transformation; }
    public SubLObject getField5() { return $link_heads_motivated_wrt_removal; }
    public SubLObject getField6() { return $link_heads_motivated_wrt_transformation; }
    public SubLObject getField7() { return $problems_pending_wrt_new_root; }
    public SubLObject getField8() { return $problems_pending_wrt_removal; }
    public SubLObject getField9() { return $problems_pending_wrt_transformation; }
    public SubLObject getField10() { return $new_root_index; }
    public SubLObject getField11() { return $new_root_problems; }
    public SubLObject getField12() { return $removal_strategem_index; }
    public SubLObject getField13() { return $problem_total_strategems_active_wrt_removal; }
    public SubLObject getField14() { return $current_new_root_wrt_removal; }
    public SubLObject getField15() { return $transformation_strategem_index; }
    public SubLObject getField16() { return $problem_total_strategems_active_wrt_transformation; }
    public SubLObject getField17() { return $problem_strategems_set_aside_wrt_removal; }
    public SubLObject getField18() { return $problem_strategems_set_aside_wrt_transformation; }
    public SubLObject getField19() { return $problem_strategems_thrown_away_wrt_removal; }
    public SubLObject getField20() { return $problem_strategems_thrown_away_wrt_transformation; }
    public SubLObject setField2(SubLObject value) { return $problems_motivated_wrt_new_root_table = value; }
    public SubLObject setField3(SubLObject value) { return $problems_motivated_wrt_removal = value; }
    public SubLObject setField4(SubLObject value) { return $problems_motivated_wrt_transformation = value; }
    public SubLObject setField5(SubLObject value) { return $link_heads_motivated_wrt_removal = value; }
    public SubLObject setField6(SubLObject value) { return $link_heads_motivated_wrt_transformation = value; }
    public SubLObject setField7(SubLObject value) { return $problems_pending_wrt_new_root = value; }
    public SubLObject setField8(SubLObject value) { return $problems_pending_wrt_removal = value; }
    public SubLObject setField9(SubLObject value) { return $problems_pending_wrt_transformation = value; }
    public SubLObject setField10(SubLObject value) { return $new_root_index = value; }
    public SubLObject setField11(SubLObject value) { return $new_root_problems = value; }
    public SubLObject setField12(SubLObject value) { return $removal_strategem_index = value; }
    public SubLObject setField13(SubLObject value) { return $problem_total_strategems_active_wrt_removal = value; }
    public SubLObject setField14(SubLObject value) { return $current_new_root_wrt_removal = value; }
    public SubLObject setField15(SubLObject value) { return $transformation_strategem_index = value; }
    public SubLObject setField16(SubLObject value) { return $problem_total_strategems_active_wrt_transformation = value; }
    public SubLObject setField17(SubLObject value) { return $problem_strategems_set_aside_wrt_removal = value; }
    public SubLObject setField18(SubLObject value) { return $problem_strategems_set_aside_wrt_transformation = value; }
    public SubLObject setField19(SubLObject value) { return $problem_strategems_thrown_away_wrt_removal = value; }
    public SubLObject setField20(SubLObject value) { return $problem_strategems_thrown_away_wrt_transformation = value; }
    public SubLObject $problems_motivated_wrt_new_root_table = NIL;
    public SubLObject $problems_motivated_wrt_removal = NIL;
    public SubLObject $problems_motivated_wrt_transformation = NIL;
    public SubLObject $link_heads_motivated_wrt_removal = NIL;
    public SubLObject $link_heads_motivated_wrt_transformation = NIL;
    public SubLObject $problems_pending_wrt_new_root = NIL;
    public SubLObject $problems_pending_wrt_removal = NIL;
    public SubLObject $problems_pending_wrt_transformation = NIL;
    public SubLObject $new_root_index = NIL;
    public SubLObject $new_root_problems = NIL;
    public SubLObject $removal_strategem_index = NIL;
    public SubLObject $problem_total_strategems_active_wrt_removal = NIL;
    public SubLObject $current_new_root_wrt_removal = NIL;
    public SubLObject $transformation_strategem_index = NIL;
    public SubLObject $problem_total_strategems_active_wrt_transformation = NIL;
    public SubLObject $problem_strategems_set_aside_wrt_removal = NIL;
    public SubLObject $problem_strategems_set_aside_wrt_transformation = NIL;
    public SubLObject $problem_strategems_thrown_away_wrt_removal = NIL;
    public SubLObject $problem_strategems_thrown_away_wrt_transformation = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($balanced_strategy_data_native.class, $sym1$BALANCED_STRATEGY_DATA, $sym2$BALANCED_STRATEGY_DATA_P, $list3, $list4, new String[] {"$problems_motivated_wrt_new_root_table", "$problems_motivated_wrt_removal", "$problems_motivated_wrt_transformation", "$link_heads_motivated_wrt_removal", "$link_heads_motivated_wrt_transformation", "$problems_pending_wrt_new_root", "$problems_pending_wrt_removal", "$problems_pending_wrt_transformation", "$new_root_index", "$new_root_problems", "$removal_strategem_index", "$problem_total_strategems_active_wrt_removal", "$current_new_root_wrt_removal", "$transformation_strategem_index", "$problem_total_strategems_active_wrt_transformation", "$problem_strategems_set_aside_wrt_removal", "$problem_strategems_set_aside_wrt_transformation", "$problem_strategems_thrown_away_wrt_removal", "$problem_strategems_thrown_away_wrt_transformation"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static SubLSymbol $dtp_balanced_strategy_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject balanced_strategy_data_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $balanced_strategy_data_p$UnaryFunction extends UnaryFunction {
    public $balanced_strategy_data_p$UnaryFunction() { super(extractFunctionNamed("BALANCED-STRATEGY-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36519"); }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problems_motivated_wrt_new_root_table(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problems_motivated_wrt_removal(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problems_motivated_wrt_transformation(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_link_heads_motivated_wrt_removal(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_link_heads_motivated_wrt_transformation(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problems_pending_wrt_new_root(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problems_pending_wrt_removal(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problems_pending_wrt_transformation(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_new_root_index(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField10();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_new_root_problems(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField11();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_removal_strategem_index(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField12();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problem_total_strategems_active_wrt_removal(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField13();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_transformation_strategem_index(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField15();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problem_total_strategems_active_wrt_transformation(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField16();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problem_strategems_set_aside_wrt_removal(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField17();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problem_strategems_set_aside_wrt_transformation(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField18();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problem_strategems_thrown_away_wrt_removal(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField19();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject bal_strat_data_problem_strategems_thrown_away_wrt_transformation(SubLObject object) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.getField20();
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problems_motivated_wrt_new_root_table(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problems_motivated_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problems_motivated_wrt_transformation(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_link_heads_motivated_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_link_heads_motivated_wrt_transformation(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problems_pending_wrt_new_root(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problems_pending_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problems_pending_wrt_transformation(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_new_root_index(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_new_root_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_removal_strategem_index(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problem_total_strategems_active_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField13(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_current_new_root_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField14(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_transformation_strategem_index(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField15(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField16(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField17(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField18(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField19(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation(SubLObject object, SubLObject value) {
    checkType(object, $sym2$BALANCED_STRATEGY_DATA_P);
    return object.setField20(value);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 2207) 
  public static final SubLObject make_balanced_strategy_data(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $balanced_strategy_data_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw47$PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE)) {
            _csetf_bal_strat_data_problems_motivated_wrt_new_root_table(v_new, current_value);
          } else if (pcase_var.eql($kw48$PROBLEMS_MOTIVATED_WRT_REMOVAL)) {
            _csetf_bal_strat_data_problems_motivated_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw49$PROBLEMS_MOTIVATED_WRT_TRANSFORMATION)) {
            _csetf_bal_strat_data_problems_motivated_wrt_transformation(v_new, current_value);
          } else if (pcase_var.eql($kw50$LINK_HEADS_MOTIVATED_WRT_REMOVAL)) {
            _csetf_bal_strat_data_link_heads_motivated_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw51$LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION)) {
            _csetf_bal_strat_data_link_heads_motivated_wrt_transformation(v_new, current_value);
          } else if (pcase_var.eql($kw52$PROBLEMS_PENDING_WRT_NEW_ROOT)) {
            _csetf_bal_strat_data_problems_pending_wrt_new_root(v_new, current_value);
          } else if (pcase_var.eql($kw53$PROBLEMS_PENDING_WRT_REMOVAL)) {
            _csetf_bal_strat_data_problems_pending_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw54$PROBLEMS_PENDING_WRT_TRANSFORMATION)) {
            _csetf_bal_strat_data_problems_pending_wrt_transformation(v_new, current_value);
          } else if (pcase_var.eql($kw55$NEW_ROOT_INDEX)) {
            _csetf_bal_strat_data_new_root_index(v_new, current_value);
          } else if (pcase_var.eql($kw56$NEW_ROOT_PROBLEMS)) {
            _csetf_bal_strat_data_new_root_problems(v_new, current_value);
          } else if (pcase_var.eql($kw57$REMOVAL_STRATEGEM_INDEX)) {
            _csetf_bal_strat_data_removal_strategem_index(v_new, current_value);
          } else if (pcase_var.eql($kw58$PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL)) {
            _csetf_bal_strat_data_problem_total_strategems_active_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw59$CURRENT_NEW_ROOT_WRT_REMOVAL)) {
            _csetf_bal_strat_data_current_new_root_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw60$TRANSFORMATION_STRATEGEM_INDEX)) {
            _csetf_bal_strat_data_transformation_strategem_index(v_new, current_value);
          } else if (pcase_var.eql($kw61$PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION)) {
            _csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation(v_new, current_value);
          } else if (pcase_var.eql($kw62$PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL)) {
            _csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw63$PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION)) {
            _csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation(v_new, current_value);
          } else if (pcase_var.eql($kw64$PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL)) {
            _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal(v_new, current_value);
          } else if (pcase_var.eql($kw65$PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION)) {
            _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation(v_new, current_value);
          } else {
            Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 5847) 
  public static final SubLObject balanced_strategy_p(SubLObject object) {
    return makeBoolean(((NIL != inference_heuristic_balanced_tactician.heuristic_balanced_strategy_p(object))
          || (NIL != inference_abduction_utilities.abductive_strategy_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 6103) 
  public static final SubLObject new_balanced_strategy_data(SubLObject removal_index, SubLObject new_root_index, SubLObject transformation_index) {
    {
      SubLObject data = make_balanced_strategy_data(UNPROVIDED);
      _csetf_bal_strat_data_problems_motivated_wrt_new_root_table(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problems_motivated_wrt_removal(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problems_motivated_wrt_transformation(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_link_heads_motivated_wrt_removal(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_link_heads_motivated_wrt_transformation(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problems_pending_wrt_new_root(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problems_pending_wrt_removal(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problems_pending_wrt_transformation(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_new_root_index(data, new_root_index);
      _csetf_bal_strat_data_new_root_problems(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_removal_strategem_index(data, removal_index);
      _csetf_bal_strat_data_problem_total_strategems_active_wrt_removal(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_current_new_root_wrt_removal(data, NIL);
      _csetf_bal_strat_data_transformation_strategem_index(data, transformation_index);
      _csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      return data;
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 8198) 
  public static final SubLObject balanced_strategy_problems_motivated_wrt_new_root_table(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problems_motivated_wrt_new_root_table(data);
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 8507) 
  public static final SubLObject balanced_strategy_problems_motivated_wrt_removal(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problems_motivated_wrt_removal(data);
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 8766) 
  public static final SubLObject balanced_strategy_problems_motivated_wrt_transformation(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problems_motivated_wrt_transformation(data);
    }
  }

  /** @return set-p of motivation-strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 9039) 
  public static final SubLObject balanced_strategy_link_heads_motivated_wrt_removal(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_link_heads_motivated_wrt_removal(data);
    }
  }

  /** @return set-p of motivation-strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 9315) 
  public static final SubLObject balanced_strategy_link_heads_motivated_wrt_transformation(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_link_heads_motivated_wrt_transformation(data);
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 9605) 
  public static final SubLObject balanced_strategy_problems_pending_wrt_new_root(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problems_pending_wrt_new_root(data);
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 9862) 
  public static final SubLObject balanced_strategy_problems_pending_wrt_removal(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problems_pending_wrt_removal(data);
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 10117) 
  public static final SubLObject balanced_strategy_problems_pending_wrt_transformation(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problems_pending_wrt_transformation(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 10386) 
  public static final SubLObject balanced_strategy_new_root_index(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_new_root_index(data);
    }
  }

  /** @return #'EQ set of problem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 10622) 
  public static final SubLObject balanced_strategy_new_root_problems(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_new_root_problems(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 10858) 
  public static final SubLObject balanced_strategy_removal_strategem_index(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_removal_strategem_index(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> non-negative-integer-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 11112) 
  public static final SubLObject balanced_strategy_problem_total_strategems_active_wrt_removal(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problem_total_strategems_active_wrt_removal(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 11748) 
  public static final SubLObject balanced_strategy_transformation_strategem_index(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_transformation_strategem_index(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> non-negative-integer-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 12016) 
  public static final SubLObject balanced_strategy_problem_total_strategems_active_wrt_transformation(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problem_total_strategems_active_wrt_transformation(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 12353) 
  public static final SubLObject balanced_strategy_problem_strategems_set_aside_wrt_removal(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problem_strategems_set_aside_wrt_removal(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 12672) 
  public static final SubLObject balanced_strategy_problem_strategems_set_aside_wrt_transformation(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problem_strategems_set_aside_wrt_transformation(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 13002) 
  public static final SubLObject balanced_strategy_problem_strategems_thrown_away_wrt_removal(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problem_strategems_thrown_away_wrt_removal(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 13324) 
  public static final SubLObject balanced_strategy_problem_strategems_thrown_away_wrt_transformation(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return bal_strat_data_problem_strategems_thrown_away_wrt_transformation(data);
    }
  }

  /** Return T iff PROBLEM is motivated to be a new root by STRATEGY */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 13854) 
  public static final SubLObject balanced_strategy_problem_motivated_wrt_new_rootP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    return list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, UNPROVIDED));
  }

  /** Return T iff removal is motivated on PROBLEM in STRATEGY */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 15985) 
  public static final SubLObject balanced_strategy_problem_motivated_wrt_removalP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_memberP(problem, balanced_strategy_problems_motivated_wrt_removal(strategy));
  }

  /** Return T iff transformation is motivated on PROBLEM in STRATEGY */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 16437) 
  public static final SubLObject balanced_strategy_problem_motivated_wrt_transformationP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_memberP(problem, balanced_strategy_problems_motivated_wrt_transformation(strategy));
  }

  /** Return T iff removal motivation should propagate through LINK-HEAD in STRATEGY */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 16730) 
  public static final SubLObject balanced_strategy_link_head_motivated_wrt_removalP(SubLObject strategy, SubLObject link_head) {
    checkType(link_head, $sym71$MOTIVATION_STRATEGEM_P);
    return set.set_memberP(link_head, balanced_strategy_link_heads_motivated_wrt_removal(strategy));
  }

  /** Return T iff transformation motivation should propagate through LINK-HEAD in STRATEGY */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 17047) 
  public static final SubLObject balanced_strategy_link_head_motivated_wrt_transformationP(SubLObject strategy, SubLObject link_head) {
    checkType(link_head, $sym71$MOTIVATION_STRATEGEM_P);
    return set.set_memberP(link_head, balanced_strategy_link_heads_motivated_wrt_transformation(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 17385) 
  public static final SubLObject balanced_strategy_link_head_motivatedP(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_link_head_motivated_wrt_removalP(strategy, link_head);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_link_head_motivated_wrt_transformationP(strategy, link_head);
      } else {
        return Errors.error($str74$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 17829) 
  public static final SubLObject balanced_strategy_connected_conjunction_link_motivated_wrt_removalP(SubLObject strategy, SubLObject connected_conjunction_link) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(connected_conjunction_link, $sym75$CONNECTED_CONJUNCTION_LINK_P);
    {
      SubLObject link_head = inference_worker.connected_conjunction_link_tactic(connected_conjunction_link);
      return balanced_strategy_link_head_motivated_wrt_removalP(strategy, link_head);
    }
  }

  /** Return T iff PROBLEM is pending in STRATEGY wrt MOTIVATION */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 18238) 
  public static final SubLObject balanced_strategy_problem_pendingP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    checkType(problem, $sym68$PROBLEM_P);
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw76$NEW_ROOT)) {
        return set.set_memberP(problem, balanced_strategy_problems_pending_wrt_new_root(strategy));
      } else if (pcase_var.eql($kw72$REMOVAL)) {
        return set.set_memberP(problem, balanced_strategy_problems_pending_wrt_removal(strategy));
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return set.set_memberP(problem, balanced_strategy_problems_pending_wrt_transformation(strategy));
      } else {
        return Errors.error($str74$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 18848) 
  public static final SubLObject balanced_strategy_problem_totally_pendingP(SubLObject strategy, SubLObject problem) {
    return makeBoolean(((NIL != balanced_strategy_problem_pendingP(strategy, problem, $kw72$REMOVAL))
           && (NIL != balanced_strategy_problem_pendingP(strategy, problem, $kw73$TRANSFORMATION))));
  }

  /** @return booleanp; whether PROBLEM is actively being considered for MOTIVATION by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 19166) 
  public static final SubLObject balanced_strategy_problem_activeP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw76$NEW_ROOT)) {
        return balanced_strategy_problem_active_wrt_new_rootP(strategy, problem);
      } else if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_problem_active_wrt_removalP(strategy, problem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_problem_active_wrt_transformationP(strategy, problem);
      } else {
        return Errors.error($str74$unexpected_motivation__s, motivation);
      }
    }
  }

  /** @return booleanp; whether PROBLEM is actively being considered a new root by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 19728) 
  public static final SubLObject balanced_strategy_problem_active_wrt_new_rootP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_memberP(problem, balanced_strategy_new_root_problems(strategy));
  }

  /** @return booleanp; whether PROBLEM is actively being considered for removal by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 20113) 
  public static final SubLObject balanced_strategy_problem_active_wrt_removalP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    {
      SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_removal(strategy);
      return Numbers.plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }
  }

  /** @return booleanp; whether PROBLEM is actively being considered for transformation by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 20482) 
  public static final SubLObject balanced_strategy_problem_active_wrt_transformationP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    {
      SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_transformation(strategy);
      return Numbers.plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 20872) 
  public static final SubLObject balanced_strategy_problem_set_asideP(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    checkType(motivation, $sym77$BALANCED_STRATEGY_MOTIVATION_P);
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw76$NEW_ROOT)) {
        return NIL;
      } else if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_problem_set_aside_wrt_removalP(strategy, problem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_problem_set_aside_wrt_transformationP(strategy, problem);
      }
    }
    return NIL;
  }

  /** @return booleanp; whether PROBLEM has been set aside for later removal consideration by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 22463) 
  public static final SubLObject balanced_strategy_problem_set_aside_wrt_removalP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    if ((NIL == balanced_strategy_problem_active_wrt_removalP(strategy, problem))) {
      {
        SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (((NIL != v_set)
             && (NIL == set.set_emptyP(v_set)))) {
          return T;
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; whether PROBLEM has been set aside for later transformation consideration by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 22977) 
  public static final SubLObject balanced_strategy_problem_set_aside_wrt_transformationP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym68$PROBLEM_P);
    if ((NIL == balanced_strategy_problem_active_wrt_transformationP(strategy, problem))) {
      {
        SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (((NIL != v_set)
             && (NIL == set.set_emptyP(v_set)))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 23519) 
  public static final SubLObject balanced_strategy_strategem_set_asideP(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    checkType(motivation, $sym77$BALANCED_STRATEGY_MOTIVATION_P);
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_strategem_set_aside_wrt_removalP(strategy, strategem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_strategem_set_aside_wrt_transformationP(strategy, strategem);
      }
    }
    return NIL;
  }

  /** @return booleanp; whether STRATEGEM has been set aside for later removal consideration by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 23926) 
  public static final SubLObject balanced_strategy_strategem_set_aside_wrt_removalP(SubLObject strategy, SubLObject strategem) {
    checkType(strategem, $sym78$STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      return makeBoolean(((NIL != set.set_p(v_set))
             && (NIL != set.set_memberP(strategem, v_set))));
    }
  }

  /** @return booleanp; whether STRATEGEM has been set aside for later transformation consideration by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 24422) 
  public static final SubLObject balanced_strategy_strategem_set_aside_wrt_transformationP(SubLObject strategy, SubLObject strategem) {
    checkType(strategem, $sym78$STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      return makeBoolean(((NIL != set.set_p(v_set))
             && (NIL != set.set_memberP(strategem, v_set))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 24939) 
  public static final SubLObject balanced_strategy_strategem_thrown_awayP(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    checkType(motivation, $sym77$BALANCED_STRATEGY_MOTIVATION_P);
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_strategem_thrown_away_wrt_removalP(strategy, strategem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_strategem_thrown_away_wrt_transformationP(strategy, strategem);
      }
    }
    return NIL;
  }

  /** @return booleanp; whether STRATEGEM has been thrown away by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 25352) 
  public static final SubLObject balanced_strategy_strategem_thrown_away_wrt_removalP(SubLObject strategy, SubLObject strategem) {
    checkType(strategem, $sym78$STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_removal(strategy);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      return makeBoolean(((NIL != set.set_p(v_set))
             && (NIL != set.set_memberP(strategem, v_set))));
    }
  }

  /** @return booleanp; whether STRATEGEM has been thrown away by STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 25822) 
  public static final SubLObject balanced_strategy_strategem_thrown_away_wrt_transformationP(SubLObject strategy, SubLObject strategem) {
    checkType(strategem, $sym78$STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_transformation(strategy);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      return makeBoolean(((NIL != set.set_p(v_set))
             && (NIL != set.set_memberP(strategem, v_set))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 26306) 
  private static SubLSymbol $balanced_strategy_early_removal_productivity_limit$ = null;

  /** @return nil or productivity-p */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 26736) 
  public static final SubLObject balanced_strategy_removal_backtracking_productivity_limit(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 27002) 
  public static final SubLObject balanced_strategy_peek_strategem_wrt_removal(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw80$PEEK_REMOVAL_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 27164) 
  public static final SubLObject balanced_strategy_peek_new_root(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw81$PEEK_NEW_ROOT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 27304) 
  public static final SubLObject balanced_strategy_peek_strategem_wrt_transformation(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw82$PEEK_TRANSFORMATION_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** note N */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 27480) 
  public static final SubLObject balanced_strategy_note_problem_motivated_wrt_new_root(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return dictionary.dictionary_enter(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, $kw69$UNACTIVATED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 27950) 
  public static final SubLObject balanced_strategy_note_new_root_activated_wrt_removal(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    {
      SubLObject elapsed = inference_datastructures_inference.inference_elapsed_internal_real_time_since_start(inference_datastructures_strategy.strategy_inference(strategy));
      dictionary.dictionary_enter(balanced_strategy_problems_motivated_wrt_new_root_table(strategy), problem, elapsed);
      balanced_strategy_set_current_new_root_wrt_removal(strategy, problem);
      return problem;
    }
  }

  /** note R */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 28581) 
  public static final SubLObject balanced_strategy_note_problem_motivated_wrt_removal(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_add(problem, balanced_strategy_problems_motivated_wrt_removal(strategy));
  }

  /** note T */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 28847) 
  public static final SubLObject balanced_strategy_note_problem_motivated_wrt_transformation(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_add(problem, balanced_strategy_problems_motivated_wrt_transformation(strategy));
  }

  /** note R */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 29127) 
  public static final SubLObject balanced_strategy_note_link_head_motivated_wrt_removal(SubLObject strategy, SubLObject link_head) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(link_head, $sym71$MOTIVATION_STRATEGEM_P);
    return set.set_add(link_head, balanced_strategy_link_heads_motivated_wrt_removal(strategy));
  }

  /** note T */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 29414) 
  public static final SubLObject balanced_strategy_note_link_head_motivated_wrt_transformation(SubLObject strategy, SubLObject link_head) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(link_head, $sym71$MOTIVATION_STRATEGEM_P);
    return set.set_add(link_head, balanced_strategy_link_heads_motivated_wrt_transformation(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 29715) 
  public static final SubLObject balanced_strategy_note_link_head_motivated(SubLObject strategy, SubLObject motivation, SubLObject link_head) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_note_link_head_motivated_wrt_removal(strategy, link_head);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_note_link_head_motivated_wrt_transformation(strategy, link_head);
      } else {
        return Errors.error($str74$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 30216) 
  public static final SubLObject balanced_strategy_note_problem_pending_wrt_new_root(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_add(problem, balanced_strategy_problems_pending_wrt_new_root(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 30468) 
  public static final SubLObject balanced_strategy_note_problem_pending_wrt_removal(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_add(problem, balanced_strategy_problems_pending_wrt_removal(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 30717) 
  public static final SubLObject balanced_strategy_note_problem_pending_wrt_transformation(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_add(problem, balanced_strategy_problems_pending_wrt_transformation(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 30980) 
  public static final SubLObject balanced_strategy_note_problem_pending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    checkType(motivation, $sym77$BALANCED_STRATEGY_MOTIVATION_P);
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw76$NEW_ROOT)) {
        return balanced_strategy_note_problem_pending_wrt_new_root(strategy, problem);
      } else if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_note_problem_pending_wrt_removal(strategy, problem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_note_problem_pending_wrt_transformation(strategy, problem);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 31451) 
  public static final SubLObject balanced_strategy_note_problem_unpending_wrt_removal(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_remove(problem, balanced_strategy_problems_pending_wrt_removal(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 31784) 
  public static final SubLObject balanced_strategy_note_problem_unpending_wrt_transformation(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(problem, $sym68$PROBLEM_P);
    return set.set_remove(problem, balanced_strategy_problems_pending_wrt_transformation(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 32054) 
  public static final SubLObject balanced_strategy_note_problem_unpending(SubLObject strategy, SubLObject problem, SubLObject motivation) {
    checkType(motivation, $sym77$BALANCED_STRATEGY_MOTIVATION_P);
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_note_problem_unpending_wrt_transformation(strategy, problem);
      } else {
        return Errors.error($str83$new_root_unpending_not_yet_suppor);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 32507) 
  public static final SubLObject balanced_strategy_add_new_root(SubLObject strategy, SubLObject problem) {
    {
      SubLObject addedP = NIL;
      addedP = inference_datastructures_strategy.strategy_dispatch(strategy, $kw84$ACTIVATE_NEW_ROOT, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != addedP)) {
        set.set_add(problem, balanced_strategy_new_root_problems(strategy));
      }
      return addedP;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 32777) 
  public static final SubLObject balanced_strategy_pop_new_root(SubLObject strategy) {
    {
      SubLObject problem = NIL;
      problem = inference_datastructures_strategy.strategy_dispatch(strategy, $kw85$POP_NEW_ROOT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != inference_datastructures_problem.problem_p(problem))) {
        set.set_remove(problem, balanced_strategy_new_root_problems(strategy));
      }
      return problem;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 33204) 
  public static final SubLObject balanced_strategy_set_current_new_root_wrt_removal(SubLObject strategy, SubLObject new_root) {
    if ((new_root == UNPROVIDED)) {
      new_root = NIL;
    }
    if ((NIL != new_root)) {
      checkType(new_root, $sym68$PROBLEM_P);
    }
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      _csetf_bal_strat_data_current_new_root_wrt_removal(data, new_root);
    }
    return strategy;
  }

  /** note that REMOVAL-STRATEGEM is in STRATEGY's R-box */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 33516) 
  public static final SubLObject balanced_strategy_activate_strategem_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(removal_strategem, $sym86$REMOVAL_STRATEGEM_P);
    {
      SubLObject result = NIL;
      result = inference_datastructures_strategy.strategy_dispatch(strategy, $kw87$ACTIVATE_REMOVAL_STRATEGEM, removal_strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != result)) {
        {
          SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
          SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_removal(strategy);
          SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
          count = Numbers.add(count, ONE_INTEGER);
          if (ONE_INTEGER.numE(count)) {
            balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
          }
          dictionary.dictionary_enter(index, problem, count);
          return count;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 34280) 
  public static final SubLObject balanced_strategy_pop_strategem_wrt_removal(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw88$POP_REMOVAL_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** note that TRANSFORMATION-STRATEGEM is in STRATEGY's T-box */
  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 34415) 
  public static final SubLObject balanced_strategy_activate_strategem_wrt_transformation(SubLObject strategy, SubLObject transformation_strategem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(transformation_strategem, $sym89$TRANSFORMATION_STRATEGEM_P);
    if (((NIL != inference_worker_transformation.transformation_tactic_p(transformation_strategem))
         && (NIL != inference_datastructures_tactic.tactic_executedP(transformation_strategem)))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35695");
    }
    {
      SubLObject result = NIL;
      result = inference_datastructures_strategy.strategy_dispatch(strategy, $kw90$ACTIVATE_TRANSFORMATION_STRATEGEM, transformation_strategem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != result)) {
        {
          SubLObject problem = inference_tactician.strategem_problem(transformation_strategem);
          SubLObject index = balanced_strategy_problem_total_strategems_active_wrt_transformation(strategy);
          SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
          count = Numbers.add(count, ONE_INTEGER);
          if (ONE_INTEGER.numE(count)) {
            balanced_strategy_note_problem_unpending_wrt_transformation(strategy, problem);
          }
          dictionary.dictionary_enter(index, problem, count);
          return count;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 35701) 
  public static final SubLObject balanced_strategy_activate_strategem(SubLObject strategy, SubLObject strategem, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw72$REMOVAL)) {
        return balanced_strategy_activate_strategem_wrt_removal(strategy, strategem);
      } else if (pcase_var.eql($kw73$TRANSFORMATION)) {
        return balanced_strategy_activate_strategem_wrt_transformation(strategy, strategem);
      } else {
        return Errors.error($str91$new_root_strategem_activation_not);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 36102) 
  public static final SubLObject balanced_strategy_pop_strategem_wrt_transformation(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw92$POP_TRANSFORMATION_STRATEGEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 36802) 
  public static final SubLObject balanced_strategy_clear_strategems_set_aside_wrt_removal(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym67$BALANCED_STRATEGY_P);
      {
        SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_removal(strategy);
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            balanced_strategy_note_problem_unpending_wrt_removal(strategy, problem);
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
      }
      return strategy;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 37824) 
  public static final SubLObject balanced_strategy_clear_strategems_set_aside_wrt_transformation(SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(strategy, $sym67$BALANCED_STRATEGY_P);
      {
        SubLObject index = balanced_strategy_problem_strategems_set_aside_wrt_transformation(strategy);
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject problem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject strategem_set = thread.secondMultipleValue();
            thread.resetMultipleValues();
            balanced_strategy_note_problem_unpending_wrt_transformation(strategy, problem);
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        dictionary.clear_dictionary(index);
      }
      return strategy;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 38676) 
  public static final SubLObject balanced_strategy_note_strategem_thrown_away_wrt_removal(SubLObject strategy, SubLObject removal_strategem) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    checkType(removal_strategem, $sym86$REMOVAL_STRATEGEM_P);
    {
      SubLObject index = balanced_strategy_problem_strategems_thrown_away_wrt_removal(strategy);
      SubLObject problem = inference_tactician.strategem_problem(removal_strategem);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      if ((NIL == set.set_p(v_set))) {
        v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        dictionary.dictionary_enter(index, problem, v_set);
      }
      return set.set_add(removal_strategem, v_set);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 40251) 
  public static final SubLObject balanced_strategy_no_new_rootsP(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw95$NO_NEW_ROOTS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 40410) 
  public static final SubLObject balanced_strategy_no_strategems_active_wrt_removalP(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw96$NO_ACTIVE_REMOVAL_STRATEGEMS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 40604) 
  public static final SubLObject balanced_strategy_no_strategems_active_wrt_transformationP(SubLObject strategy) {
    checkType(strategy, $sym67$BALANCED_STRATEGY_P);
    return inference_datastructures_strategy.strategy_dispatch(strategy, $kw97$NO_ACTIVE_TRANSFORMATION_STRATEGEMS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-balanced-tactician-datastructures.lisp", position = 40812) 
  public static final SubLObject balanced_strategy_clear_set_aside_problems(SubLObject strategy) {
    balanced_strategy_clear_strategems_set_aside_wrt_removal(strategy);
    balanced_strategy_clear_strategems_set_aside_wrt_transformation(strategy);
    return strategy;
  }

  public static final SubLObject declare_inference_balanced_tactician_datastructures_file() {
    declareFunction(myName, "balanced_strategy_motivation_p", "BALANCED-STRATEGY-MOTIVATION-P", 1, 0, false);
    declareFunction(myName, "balanced_strategy_data_print_function_trampoline", "BALANCED-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "balanced_strategy_data_p", "BALANCED-STRATEGY-DATA-P", 1, 0, false); new $balanced_strategy_data_p$UnaryFunction();
    declareFunction(myName, "bal_strat_data_problems_motivated_wrt_new_root_table", "BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problems_motivated_wrt_removal", "BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problems_motivated_wrt_transformation", "BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "bal_strat_data_link_heads_motivated_wrt_removal", "BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_link_heads_motivated_wrt_transformation", "BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problems_pending_wrt_new_root", "BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problems_pending_wrt_removal", "BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problems_pending_wrt_transformation", "BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "bal_strat_data_new_root_index", "BAL-STRAT-DATA-NEW-ROOT-INDEX", 1, 0, false);
    declareFunction(myName, "bal_strat_data_new_root_problems", "BAL-STRAT-DATA-NEW-ROOT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "bal_strat_data_removal_strategem_index", "BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problem_total_strategems_active_wrt_removal", "BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_current_new_root_wrt_removal", "BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_transformation_strategem_index", "BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problem_total_strategems_active_wrt_transformation", "BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problem_strategems_set_aside_wrt_removal", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problem_strategems_set_aside_wrt_transformation", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problem_strategems_thrown_away_wrt_removal", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "bal_strat_data_problem_strategems_thrown_away_wrt_transformation", "BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problems_motivated_wrt_new_root_table", "_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problems_motivated_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problems_motivated_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_link_heads_motivated_wrt_removal", "_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_link_heads_motivated_wrt_transformation", "_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problems_pending_wrt_new_root", "_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problems_pending_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problems_pending_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_new_root_index", "_CSETF-BAL-STRAT-DATA-NEW-ROOT-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_new_root_problems", "_CSETF-BAL-STRAT-DATA-NEW-ROOT-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_removal_strategem_index", "_CSETF-BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problem_total_strategems_active_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_current_new_root_wrt_removal", "_CSETF-BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_transformation_strategem_index", "_CSETF-BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problem_total_strategems_active_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problem_strategems_set_aside_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problem_strategems_set_aside_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problem_strategems_thrown_away_wrt_removal", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "_csetf_bal_strat_data_problem_strategems_thrown_away_wrt_transformation", "_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "make_balanced_strategy_data", "MAKE-BALANCED-STRATEGY-DATA", 0, 1, false);
    declareFunction(myName, "balanced_strategy_p", "BALANCED-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "new_balanced_strategy_data", "NEW-BALANCED-STRATEGY-DATA", 3, 0, false);
    declareFunction(myName, "balanced_strategy_problems_motivated_wrt_new_root_table", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_motivated_wrt_removal", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_motivated_wrt_transformation", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_link_heads_motivated_wrt_removal", "BALANCED-STRATEGY-LINK-HEADS-MOTIVATED-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_link_heads_motivated_wrt_transformation", "BALANCED-STRATEGY-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_pending_wrt_new_root", "BALANCED-STRATEGY-PROBLEMS-PENDING-WRT-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_pending_wrt_removal", "BALANCED-STRATEGY-PROBLEMS-PENDING-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_pending_wrt_transformation", "BALANCED-STRATEGY-PROBLEMS-PENDING-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_new_root_index", "BALANCED-STRATEGY-NEW-ROOT-INDEX", 1, 0, false);
    declareFunction(myName, "balanced_strategy_new_root_problems", "BALANCED-STRATEGY-NEW-ROOT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "balanced_strategy_removal_strategem_index", "BALANCED-STRATEGY-REMOVAL-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_total_strategems_active_wrt_removal", "BALANCED-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_current_new_root_wrt_removal", "BALANCED-STRATEGY-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_transformation_strategem_index", "BALANCED-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_total_strategems_active_wrt_transformation", "BALANCED-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_strategems_set_aside_wrt_removal", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_strategems_set_aside_wrt_transformation", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_strategems_thrown_away_wrt_removal", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_strategems_thrown_away_wrt_transformation", "BALANCED-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_motivated_wrt_new_root_count", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-COUNT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_motivated_wrt_new_rootP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_historical_new_root_count", "BALANCED-STRATEGY-HISTORICAL-NEW-ROOT-COUNT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_historical_new_root_time", "BALANCED-STRATEGY-HISTORICAL-NEW-ROOT-TIME", 2, 0, false);
    declareFunction(myName, "balanced_strategy_historical_new_root_times", "BALANCED-STRATEGY-HISTORICAL-NEW-ROOT-TIMES", 1, 0, false);
    declareFunction(myName, "balanced_strategy_current_new_root_wrt_removal_elapsed_time", "BALANCED-STRATEGY-CURRENT-NEW-ROOT-WRT-REMOVAL-ELAPSED-TIME", 1, 0, false);
    declareFunction(myName, "balanced_strategy_new_root_count", "BALANCED-STRATEGY-NEW-ROOT-COUNT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problems_motivated_wrt_removal_count", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-REMOVAL-COUNT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_motivated_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problems_motivated_wrt_transformation_count", "BALANCED-STRATEGY-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION-COUNT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_problem_motivated_wrt_transformationP", "BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_link_head_motivated_wrt_removalP", "BALANCED-STRATEGY-LINK-HEAD-MOTIVATED-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_link_head_motivated_wrt_transformationP", "BALANCED-STRATEGY-LINK-HEAD-MOTIVATED-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_link_head_motivatedP", "BALANCED-STRATEGY-LINK-HEAD-MOTIVATED?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_connected_conjunction_link_motivated_wrt_removalP", "BALANCED-STRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_pendingP", "BALANCED-STRATEGY-PROBLEM-PENDING?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_problem_totally_pendingP", "BALANCED-STRATEGY-PROBLEM-TOTALLY-PENDING?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_activeP", "BALANCED-STRATEGY-PROBLEM-ACTIVE?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_problem_active_wrt_new_rootP", "BALANCED-STRATEGY-PROBLEM-ACTIVE-WRT-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_active_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-ACTIVE-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_active_wrt_transformationP", "BALANCED-STRATEGY-PROBLEM-ACTIVE-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_set_asideP", "BALANCED-STRATEGY-PROBLEM-SET-ASIDE?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_problem_set_aside_wrt_removalP", "BALANCED-STRATEGY-PROBLEM-SET-ASIDE-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_problem_set_aside_wrt_transformationP", "BALANCED-STRATEGY-PROBLEM-SET-ASIDE-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_strategem_set_asideP", "BALANCED-STRATEGY-STRATEGEM-SET-ASIDE?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_strategem_set_aside_wrt_removalP", "BALANCED-STRATEGY-STRATEGEM-SET-ASIDE-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_strategem_set_aside_wrt_transformationP", "BALANCED-STRATEGY-STRATEGEM-SET-ASIDE-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_strategem_thrown_awayP", "BALANCED-STRATEGY-STRATEGEM-THROWN-AWAY?", 3, 0, false);
    declareFunction(myName, "balanced_strategy_strategem_thrown_away_wrt_removalP", "BALANCED-STRATEGY-STRATEGEM-THROWN-AWAY-WRT-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_strategem_thrown_away_wrt_transformationP", "BALANCED-STRATEGY-STRATEGEM-THROWN-AWAY-WRT-TRANSFORMATION?", 2, 0, false);
    declareFunction(myName, "balanced_strategy_early_removal_productivity_limit", "BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_removal_backtracking_productivity_limit", "BALANCED-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_peek_strategem_wrt_removal", "BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_peek_new_root", "BALANCED-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_peek_strategem_wrt_transformation", "BALANCED-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_motivated_wrt_new_root", "BALANCED-STRATEGY-NOTE-PROBLEM-MOTIVATED-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_new_root_activated_wrt_removal", "BALANCED-STRATEGY-NOTE-NEW-ROOT-ACTIVATED-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_motivated_wrt_removal", "BALANCED-STRATEGY-NOTE-PROBLEM-MOTIVATED-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_motivated_wrt_transformation", "BALANCED-STRATEGY-NOTE-PROBLEM-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_link_head_motivated_wrt_removal", "BALANCED-STRATEGY-NOTE-LINK-HEAD-MOTIVATED-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_link_head_motivated_wrt_transformation", "BALANCED-STRATEGY-NOTE-LINK-HEAD-MOTIVATED-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_link_head_motivated", "BALANCED-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_pending_wrt_new_root", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_pending_wrt_removal", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_pending_wrt_transformation", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_pending", "BALANCED-STRATEGY-NOTE-PROBLEM-PENDING", 3, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_unpending_wrt_removal", "BALANCED-STRATEGY-NOTE-PROBLEM-UNPENDING-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_unpending_wrt_transformation", "BALANCED-STRATEGY-NOTE-PROBLEM-UNPENDING-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_problem_unpending", "BALANCED-STRATEGY-NOTE-PROBLEM-UNPENDING", 3, 0, false);
    declareFunction(myName, "balanced_strategy_add_new_root", "BALANCED-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balanced_strategy_pop_new_root", "BALANCED-STRATEGY-POP-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "balanced_strategy_clear_current_new_root_wrt_removal", "BALANCED-STRATEGY-CLEAR-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_set_current_new_root_wrt_removal", "BALANCED-STRATEGY-SET-CURRENT-NEW-ROOT-WRT-REMOVAL", 1, 1, false);
    declareFunction(myName, "balanced_strategy_activate_strategem_wrt_removal", "BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_pop_strategem_wrt_removal", "BALANCED-STRATEGY-POP-STRATEGEM-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_activate_strategem_wrt_transformation", "BALANCED-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_activate_strategem", "BALANCED-STRATEGY-ACTIVATE-STRATEGEM", 3, 0, false);
    declareFunction(myName, "balanced_strategy_pop_strategem_wrt_transformation", "BALANCED-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_note_strategem_set_aside_wrt_removal", "BALANCED-STRATEGY-NOTE-STRATEGEM-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_clear_strategems_set_aside_wrt_removal", "BALANCED-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "balanced_strategy_note_strategem_set_aside_wrt_transformation", "BALANCED-STRATEGY-NOTE-STRATEGEM-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_clear_strategems_set_aside_wrt_transformation", "BALANCED-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "balanced_strategy_note_strategem_set_aside", "BALANCED-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 3, 0, false);
    declareFunction(myName, "balanced_strategy_note_strategem_thrown_away_wrt_removal", "BALANCED-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_strategem_thrown_away_wrt_transformation", "BALANCED-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "balanced_strategy_note_strategem_thrown_away", "BALANCED-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 3, 0, false);
    declareFunction(myName, "balanced_strategy_no_new_rootsP", "BALANCED-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
    declareFunction(myName, "balanced_strategy_no_strategems_active_wrt_removalP", "BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?", 1, 0, false);
    declareFunction(myName, "balanced_strategy_no_strategems_active_wrt_transformationP", "BALANCED-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "balanced_strategy_clear_set_aside_problems", "BALANCED-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_balanced_tactician_datastructures_file() {
    $dtp_balanced_strategy_data$ = defconstant("*DTP-BALANCED-STRATEGY-DATA*", $sym1$BALANCED_STRATEGY_DATA);
    $balanced_strategy_early_removal_productivity_limit$ = defvar("*BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
    return NIL;
  }

  public static final SubLObject setup_inference_balanced_tactician_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_balanced_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym8$BALANCED_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE, $sym10$_CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE);
    Structures.def_csetf($sym11$BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL, $sym12$_CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL);
    Structures.def_csetf($sym13$BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION, $sym14$_CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION);
    Structures.def_csetf($sym15$BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL, $sym16$_CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL);
    Structures.def_csetf($sym17$BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION, $sym18$_CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION);
    Structures.def_csetf($sym19$BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT, $sym20$_CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT);
    Structures.def_csetf($sym21$BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL, $sym22$_CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL);
    Structures.def_csetf($sym23$BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION, $sym24$_CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION);
    Structures.def_csetf($sym25$BAL_STRAT_DATA_NEW_ROOT_INDEX, $sym26$_CSETF_BAL_STRAT_DATA_NEW_ROOT_INDEX);
    Structures.def_csetf($sym27$BAL_STRAT_DATA_NEW_ROOT_PROBLEMS, $sym28$_CSETF_BAL_STRAT_DATA_NEW_ROOT_PROBLEMS);
    Structures.def_csetf($sym29$BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX, $sym30$_CSETF_BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX);
    Structures.def_csetf($sym31$BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL, $sym32$_CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL);
    Structures.def_csetf($sym33$BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL, $sym34$_CSETF_BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL);
    Structures.def_csetf($sym35$BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, $sym36$_CSETF_BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
    Structures.def_csetf($sym37$BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION, $sym38$_CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFO);
    Structures.def_csetf($sym39$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL, $sym40$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL);
    Structures.def_csetf($sym41$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION, $sym42$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMA);
    Structures.def_csetf($sym43$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL, $sym44$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL);
    Structures.def_csetf($sym45$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION, $sym46$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFOR);
    Equality.identity($sym1$BALANCED_STRATEGY_DATA);
    utilities_macros.note_funcall_helper_function($sym79$BALANCED_STRATEGY_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("NEW-ROOT"), makeKeyword("REMOVAL"), makeKeyword("TRANSFORMATION"));
  public static final SubLSymbol $sym1$BALANCED_STRATEGY_DATA = makeSymbol("BALANCED-STRATEGY-DATA");
  public static final SubLSymbol $sym2$BALANCED_STRATEGY_DATA_P = makeSymbol("BALANCED-STRATEGY-DATA-P");
  public static final SubLList $list3 = list(new SubLObject[] {makeSymbol("PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeSymbol("PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeSymbol("PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeSymbol("LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("PROBLEMS-PENDING-WRT-NEW-ROOT"), makeSymbol("PROBLEMS-PENDING-WRT-REMOVAL"), makeSymbol("PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeSymbol("NEW-ROOT-INDEX"), makeSymbol("NEW-ROOT-PROBLEMS"), makeSymbol("REMOVAL-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeSymbol("CURRENT-NEW-ROOT-WRT-REMOVAL"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeKeyword("PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeKeyword("PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeKeyword("LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeKeyword("LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeKeyword("PROBLEMS-PENDING-WRT-NEW-ROOT"), makeKeyword("PROBLEMS-PENDING-WRT-REMOVAL"), makeKeyword("PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeKeyword("NEW-ROOT-INDEX"), makeKeyword("NEW-ROOT-PROBLEMS"), makeKeyword("REMOVAL-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeKeyword("CURRENT-NEW-ROOT-WRT-REMOVAL"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-NEW-ROOT-INDEX"), makeSymbol("BAL-STRAT-DATA-NEW-ROOT-PROBLEMS"), makeSymbol("BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-INDEX"), makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-PROBLEMS"), makeSymbol("_CSETF-BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL"), makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION")});
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$BALANCED_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BALANCED-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE = makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE");
  public static final SubLSymbol $sym10$_CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE");
  public static final SubLSymbol $sym11$BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL");
  public static final SubLSymbol $sym12$_CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-REMOVAL");
  public static final SubLSymbol $sym13$BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym14$_CSETF_BAL_STRAT_DATA_PROBLEMS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-MOTIVATED-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym15$BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL");
  public static final SubLSymbol $sym16$_CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-REMOVAL");
  public static final SubLSymbol $sym17$BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym18$_CSETF_BAL_STRAT_DATA_LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION = makeSymbol("_CSETF-BAL-STRAT-DATA-LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym19$BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT = makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT");
  public static final SubLSymbol $sym20$_CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_NEW_ROOT = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-NEW-ROOT");
  public static final SubLSymbol $sym21$BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL");
  public static final SubLSymbol $sym22$_CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-REMOVAL");
  public static final SubLSymbol $sym23$BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym24$_CSETF_BAL_STRAT_DATA_PROBLEMS_PENDING_WRT_TRANSFORMATION = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEMS-PENDING-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym25$BAL_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("BAL-STRAT-DATA-NEW-ROOT-INDEX");
  public static final SubLSymbol $sym26$_CSETF_BAL_STRAT_DATA_NEW_ROOT_INDEX = makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-INDEX");
  public static final SubLSymbol $sym27$BAL_STRAT_DATA_NEW_ROOT_PROBLEMS = makeSymbol("BAL-STRAT-DATA-NEW-ROOT-PROBLEMS");
  public static final SubLSymbol $sym28$_CSETF_BAL_STRAT_DATA_NEW_ROOT_PROBLEMS = makeSymbol("_CSETF-BAL-STRAT-DATA-NEW-ROOT-PROBLEMS");
  public static final SubLSymbol $sym29$BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");
  public static final SubLSymbol $sym30$_CSETF_BAL_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("_CSETF-BAL-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");
  public static final SubLSymbol $sym31$BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL");
  public static final SubLSymbol $sym32$_CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL");
  public static final SubLSymbol $sym33$BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL");
  public static final SubLSymbol $sym34$_CSETF_BAL_STRAT_DATA_CURRENT_NEW_ROOT_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-CURRENT-NEW-ROOT-WRT-REMOVAL");
  public static final SubLSymbol $sym35$BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
  public static final SubLSymbol $sym36$_CSETF_BAL_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("_CSETF-BAL-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
  public static final SubLSymbol $sym37$BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym38$_CSETF_BAL_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFO = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym39$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL");
  public static final SubLSymbol $sym40$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL");
  public static final SubLSymbol $sym41$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym42$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMA = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym43$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL");
  public static final SubLSymbol $sym44$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL");
  public static final SubLSymbol $sym45$BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION = makeSymbol("BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym46$_CSETF_BAL_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFOR = makeSymbol("_CSETF-BAL-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION");
  public static final SubLSymbol $kw47$PROBLEMS_MOTIVATED_WRT_NEW_ROOT_TABLE = makeKeyword("PROBLEMS-MOTIVATED-WRT-NEW-ROOT-TABLE");
  public static final SubLSymbol $kw48$PROBLEMS_MOTIVATED_WRT_REMOVAL = makeKeyword("PROBLEMS-MOTIVATED-WRT-REMOVAL");
  public static final SubLSymbol $kw49$PROBLEMS_MOTIVATED_WRT_TRANSFORMATION = makeKeyword("PROBLEMS-MOTIVATED-WRT-TRANSFORMATION");
  public static final SubLSymbol $kw50$LINK_HEADS_MOTIVATED_WRT_REMOVAL = makeKeyword("LINK-HEADS-MOTIVATED-WRT-REMOVAL");
  public static final SubLSymbol $kw51$LINK_HEADS_MOTIVATED_WRT_TRANSFORMATION = makeKeyword("LINK-HEADS-MOTIVATED-WRT-TRANSFORMATION");
  public static final SubLSymbol $kw52$PROBLEMS_PENDING_WRT_NEW_ROOT = makeKeyword("PROBLEMS-PENDING-WRT-NEW-ROOT");
  public static final SubLSymbol $kw53$PROBLEMS_PENDING_WRT_REMOVAL = makeKeyword("PROBLEMS-PENDING-WRT-REMOVAL");
  public static final SubLSymbol $kw54$PROBLEMS_PENDING_WRT_TRANSFORMATION = makeKeyword("PROBLEMS-PENDING-WRT-TRANSFORMATION");
  public static final SubLSymbol $kw55$NEW_ROOT_INDEX = makeKeyword("NEW-ROOT-INDEX");
  public static final SubLSymbol $kw56$NEW_ROOT_PROBLEMS = makeKeyword("NEW-ROOT-PROBLEMS");
  public static final SubLSymbol $kw57$REMOVAL_STRATEGEM_INDEX = makeKeyword("REMOVAL-STRATEGEM-INDEX");
  public static final SubLSymbol $kw58$PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_REMOVAL = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-REMOVAL");
  public static final SubLSymbol $kw59$CURRENT_NEW_ROOT_WRT_REMOVAL = makeKeyword("CURRENT-NEW-ROOT-WRT-REMOVAL");
  public static final SubLSymbol $kw60$TRANSFORMATION_STRATEGEM_INDEX = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");
  public static final SubLSymbol $kw61$PROBLEM_TOTAL_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION");
  public static final SubLSymbol $kw62$PROBLEM_STRATEGEMS_SET_ASIDE_WRT_REMOVAL = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-REMOVAL");
  public static final SubLSymbol $kw63$PROBLEM_STRATEGEMS_SET_ASIDE_WRT_TRANSFORMATION = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE-WRT-TRANSFORMATION");
  public static final SubLSymbol $kw64$PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_REMOVAL = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-REMOVAL");
  public static final SubLSymbol $kw65$PROBLEM_STRATEGEMS_THROWN_AWAY_WRT_TRANSFORMATION = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY-WRT-TRANSFORMATION");
  public static final SubLString $str66$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym67$BALANCED_STRATEGY_P = makeSymbol("BALANCED-STRATEGY-P");
  public static final SubLSymbol $sym68$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $kw69$UNACTIVATED = makeKeyword("UNACTIVATED");
  public static final SubLSymbol $sym70$_ = makeSymbol("<");
  public static final SubLSymbol $sym71$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
  public static final SubLSymbol $kw72$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw73$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLString $str74$unexpected_motivation__s = makeString("unexpected motivation ~s");
  public static final SubLSymbol $sym75$CONNECTED_CONJUNCTION_LINK_P = makeSymbol("CONNECTED-CONJUNCTION-LINK-P");
  public static final SubLSymbol $kw76$NEW_ROOT = makeKeyword("NEW-ROOT");
  public static final SubLSymbol $sym77$BALANCED_STRATEGY_MOTIVATION_P = makeSymbol("BALANCED-STRATEGY-MOTIVATION-P");
  public static final SubLSymbol $sym78$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLSymbol $sym79$BALANCED_STRATEGY_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeSymbol("BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw80$PEEK_REMOVAL_STRATEGEM = makeKeyword("PEEK-REMOVAL-STRATEGEM");
  public static final SubLSymbol $kw81$PEEK_NEW_ROOT = makeKeyword("PEEK-NEW-ROOT");
  public static final SubLSymbol $kw82$PEEK_TRANSFORMATION_STRATEGEM = makeKeyword("PEEK-TRANSFORMATION-STRATEGEM");
  public static final SubLString $str83$new_root_unpending_not_yet_suppor = makeString("new root unpending not yet supported");
  public static final SubLSymbol $kw84$ACTIVATE_NEW_ROOT = makeKeyword("ACTIVATE-NEW-ROOT");
  public static final SubLSymbol $kw85$POP_NEW_ROOT = makeKeyword("POP-NEW-ROOT");
  public static final SubLSymbol $sym86$REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");
  public static final SubLSymbol $kw87$ACTIVATE_REMOVAL_STRATEGEM = makeKeyword("ACTIVATE-REMOVAL-STRATEGEM");
  public static final SubLSymbol $kw88$POP_REMOVAL_STRATEGEM = makeKeyword("POP-REMOVAL-STRATEGEM");
  public static final SubLSymbol $sym89$TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");
  public static final SubLSymbol $kw90$ACTIVATE_TRANSFORMATION_STRATEGEM = makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM");
  public static final SubLString $str91$new_root_strategem_activation_not = makeString("new root strategem activation not yet supported");
  public static final SubLSymbol $kw92$POP_TRANSFORMATION_STRATEGEM = makeKeyword("POP-TRANSFORMATION-STRATEGEM");
  public static final SubLString $str93$new_root_set_asides_not_yet_suppo = makeString("new-root set-asides not yet supported");
  public static final SubLString $str94$new_root_thrown_away_not_yet_supp = makeString("new-root thrown-away not yet supported");
  public static final SubLSymbol $kw95$NO_NEW_ROOTS = makeKeyword("NO-NEW-ROOTS");
  public static final SubLSymbol $kw96$NO_ACTIVE_REMOVAL_STRATEGEMS = makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS");
  public static final SubLSymbol $kw97$NO_ACTIVE_TRANSFORMATION_STRATEGEMS = makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS");

  //// Initializers

  public void declareFunctions() {
    declare_inference_balanced_tactician_datastructures_file();
  }

  public void initializeVariables() {
    init_inference_balanced_tactician_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_inference_balanced_tactician_datastructures_file();
  }

}
