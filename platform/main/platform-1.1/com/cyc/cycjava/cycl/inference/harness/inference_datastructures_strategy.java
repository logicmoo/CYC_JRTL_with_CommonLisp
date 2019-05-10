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
import com.cyc.cycjava.cycl.inference.harness.balancing_tactician;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_balanced_tactician_execution;
import com.cyc.cycjava.cycl.inference.harness.inference_balanced_tactician_motivation;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_answer;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;

public  final class inference_datastructures_strategy extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_strategy() {}
  public static final SubLFile me = new inference_datastructures_strategy();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy";

  //// Definitions

  public static final class $strategy_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $suid; }
    public SubLObject getField3() { return $inference; }
    public SubLObject getField4() { return $result_uniqueness_criterion; }
    public SubLObject getField5() { return $active_problems; }
    public SubLObject getField6() { return $motivated_problems; }
    public SubLObject getField7() { return $set_aside_problems; }
    public SubLObject getField8() { return $should_reconsider_set_asidesP; }
    public SubLObject getField9() { return $productivity_limit; }
    public SubLObject getField10() { return $removal_backtracking_productivity_limit; }
    public SubLObject getField11() { return $proof_spec; }
    public SubLObject getField12() { return $problem_proof_spec_index; }
    public SubLObject getField13() { return $problem_strategic_index; }
    public SubLObject getField14() { return $memoization_state; }
    public SubLObject getField15() { return $type; }
    public SubLObject getField16() { return $data; }
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    public SubLObject setField3(SubLObject value) { return $inference = value; }
    public SubLObject setField4(SubLObject value) { return $result_uniqueness_criterion = value; }
    public SubLObject setField5(SubLObject value) { return $active_problems = value; }
    public SubLObject setField6(SubLObject value) { return $motivated_problems = value; }
    public SubLObject setField7(SubLObject value) { return $set_aside_problems = value; }
    public SubLObject setField8(SubLObject value) { return $should_reconsider_set_asidesP = value; }
    public SubLObject setField9(SubLObject value) { return $productivity_limit = value; }
    public SubLObject setField10(SubLObject value) { return $removal_backtracking_productivity_limit = value; }
    public SubLObject setField11(SubLObject value) { return $proof_spec = value; }
    public SubLObject setField12(SubLObject value) { return $problem_proof_spec_index = value; }
    public SubLObject setField13(SubLObject value) { return $problem_strategic_index = value; }
    public SubLObject setField14(SubLObject value) { return $memoization_state = value; }
    public SubLObject setField15(SubLObject value) { return $type = value; }
    public SubLObject setField16(SubLObject value) { return $data = value; }
    public SubLObject $suid = NIL;
    public SubLObject $inference = NIL;
    public SubLObject $result_uniqueness_criterion = NIL;
    public SubLObject $active_problems = NIL;
    public SubLObject $motivated_problems = NIL;
    public SubLObject $set_aside_problems = NIL;
    public SubLObject $should_reconsider_set_asidesP = NIL;
    public SubLObject $productivity_limit = NIL;
    public SubLObject $removal_backtracking_productivity_limit = NIL;
    public SubLObject $proof_spec = NIL;
    public SubLObject $problem_proof_spec_index = NIL;
    public SubLObject $problem_strategic_index = NIL;
    public SubLObject $memoization_state = NIL;
    public SubLObject $type = NIL;
    public SubLObject $data = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($strategy_native.class, $sym0$STRATEGY, $sym1$STRATEGY_P, $list2, $list3, new String[] {"$suid", "$inference", "$result_uniqueness_criterion", "$active_problems", "$motivated_problems", "$set_aside_problems", "$should_reconsider_set_asidesP", "$productivity_limit", "$removal_backtracking_productivity_limit", "$proof_spec", "$problem_proof_spec_index", "$problem_strategic_index", "$memoization_state", "$type", "$data"}, $list4, $list5, $sym6$PRINT_STRATEGY);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static SubLSymbol $dtp_strategy$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strategy_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36447");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strategy_p(SubLObject object) {
    return ((object.getClass() == $strategy_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $strategy_p$UnaryFunction extends UnaryFunction {
    public $strategy_p$UnaryFunction() { super(extractFunctionNamed("STRATEGY-P")); }
    public SubLObject processItem(SubLObject arg1) { return strategy_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_suid(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_inference(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_result_uniqueness_criterion(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField4();
  }


  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 6867) 
  public static final SubLObject destroy_problem_store_strategy(SubLObject strategy) {
    if ((NIL != valid_strategy_p(strategy))) {
      note_strategy_invalid(strategy);
      return destroy_strategy_int(strategy);
    }
    return NIL;
  }

  
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_active_problems(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_motivated_problems(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_set_aside_problems(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_should_reconsider_set_asidesP(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_productivity_limit(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_removal_backtracking_productivity_limit(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField10();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_proof_spec(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField11();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_problem_proof_spec_index(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField12();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_problem_strategic_index(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField13();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_memoization_state(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField14();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_type(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField15();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject strat_data(SubLObject object) {
    checkType(object, $sym1$STRATEGY_P);
    return object.getField16();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_inference(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_result_uniqueness_criterion(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_active_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_motivated_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_set_aside_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_should_reconsider_set_asidesP(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_productivity_limit(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_removal_backtracking_productivity_limit(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_proof_spec(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_problem_proof_spec_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_problem_strategic_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField13(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_memoization_state(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField14(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_type(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField15(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject _csetf_strat_data(SubLObject object, SubLObject value) {
    checkType(object, $sym1$STRATEGY_P);
    return object.setField16(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 1838) 
  public static final SubLObject make_strategy(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $strategy_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw38$SUID)) {
            _csetf_strat_suid(v_new, current_value);
          } else if (pcase_var.eql($kw39$INFERENCE)) {
            _csetf_strat_inference(v_new, current_value);
          } else if (pcase_var.eql($kw40$RESULT_UNIQUENESS_CRITERION)) {
            _csetf_strat_result_uniqueness_criterion(v_new, current_value);
          } else if (pcase_var.eql($kw41$ACTIVE_PROBLEMS)) {
            _csetf_strat_active_problems(v_new, current_value);
          } else if (pcase_var.eql($kw42$MOTIVATED_PROBLEMS)) {
            _csetf_strat_motivated_problems(v_new, current_value);
          } else if (pcase_var.eql($kw43$SET_ASIDE_PROBLEMS)) {
            _csetf_strat_set_aside_problems(v_new, current_value);
          } else if (pcase_var.eql($kw44$SHOULD_RECONSIDER_SET_ASIDES_)) {
            _csetf_strat_should_reconsider_set_asidesP(v_new, current_value);
          } else if (pcase_var.eql($kw45$PRODUCTIVITY_LIMIT)) {
            _csetf_strat_productivity_limit(v_new, current_value);
          } else if (pcase_var.eql($kw46$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
            _csetf_strat_removal_backtracking_productivity_limit(v_new, current_value);
          } else if (pcase_var.eql($kw47$PROOF_SPEC)) {
            _csetf_strat_proof_spec(v_new, current_value);
          } else if (pcase_var.eql($kw48$PROBLEM_PROOF_SPEC_INDEX)) {
            _csetf_strat_problem_proof_spec_index(v_new, current_value);
          } else if (pcase_var.eql($kw49$PROBLEM_STRATEGIC_INDEX)) {
            _csetf_strat_problem_strategic_index(v_new, current_value);
          } else if (pcase_var.eql($kw50$MEMOIZATION_STATE)) {
            _csetf_strat_memoization_state(v_new, current_value);
          } else if (pcase_var.eql($kw51$TYPE)) {
            _csetf_strat_type(v_new, current_value);
          } else if (pcase_var.eql($kw52$DATA)) {
            _csetf_strat_data(v_new, current_value);
          } else {
            Errors.error($str53$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 3923) 
  public static final SubLObject valid_strategy_p(SubLObject object) {
    return makeBoolean(((NIL != strategy_p(object))
           && (NIL == strategy_invalid_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4045) 
  public static final SubLObject strategy_invalid_p(SubLObject strategy) {
    return Equality.eq($kw54$FREE, strategy_type(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4863) 
  public static final SubLObject sxhash_strategy_method(SubLObject object) {
    return strat_suid(object);
  }

  public static final class $sxhash_strategy_method$UnaryFunction extends UnaryFunction {
    public $sxhash_strategy_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-STRATEGY-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_strategy_method(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 4935) 
  public static final SubLObject new_strategy(SubLObject type, SubLObject inference) {
    checkType(type, $sym58$STRATEGY_TYPE_P);
    checkType(inference, $sym59$INFERENCE_P);
    {
      SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
      SubLObject suid = inference_datastructures_problem_store.problem_store_new_strategy_id(store);
      SubLObject strategy = make_strategy(UNPROVIDED);
      _csetf_strat_suid(strategy, suid);
      _csetf_strat_inference(strategy, inference);
      _csetf_strat_result_uniqueness_criterion(strategy, NIL);
      _csetf_strat_active_problems(strategy, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_strat_motivated_problems(strategy, set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ)));
      _csetf_strat_set_aside_problems(strategy, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_strat_problem_proof_spec_index(strategy, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
      _csetf_strat_productivity_limit(strategy, inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue());
      _csetf_strat_removal_backtracking_productivity_limit(strategy, inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue());
      _csetf_strat_proof_spec(strategy, inference_datastructures_enumerated_types.$default_proof_spec$.getGlobalValue());
      _csetf_strat_problem_strategic_index(strategy, Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_strat_memoization_state(strategy, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
      _csetf_strat_type(strategy, type);
      _csetf_strat_data(strategy, NIL);
      {
        SubLObject subconstructor = strategy_type_property(type, $kw60$CONSTRUCTOR);
        Functions.funcall(subconstructor, strategy);
      }
      inference_datastructures_problem_store.add_problem_store_strategy(store, strategy);
      inference_datastructures_inference.add_inference_strategy(inference, strategy);
      return strategy;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7132) 
  public static final SubLObject destroy_inference_strategy(SubLObject strategy) {
    if ((NIL != valid_strategy_p(strategy))) {
      note_strategy_invalid(strategy);
      inference_datastructures_problem_store.remove_problem_store_strategy(strategy_problem_store(strategy), strategy);
      return destroy_strategy_int(strategy);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 7457) 
  public static final SubLObject destroy_strategy_int(SubLObject strategy) {
    _csetf_strat_data(strategy, $kw54$FREE);
    _csetf_strat_proof_spec(strategy, $kw54$FREE);
    _csetf_strat_removal_backtracking_productivity_limit(strategy, $kw54$FREE);
    _csetf_strat_productivity_limit(strategy, $kw54$FREE);
    _csetf_strat_should_reconsider_set_asidesP(strategy, $kw54$FREE);
    memoization_state.clear_all_memoization(strategy_memoization_state(strategy));
    _csetf_strat_memoization_state(strategy, $kw54$FREE);
    dictionary.clear_dictionary(strat_problem_proof_spec_index(strategy));
    _csetf_strat_problem_proof_spec_index(strategy, $kw54$FREE);
    Hashtables.clrhash(strat_problem_strategic_index(strategy));
    _csetf_strat_problem_strategic_index(strategy, $kw54$FREE);
    set.clear_set(strat_set_aside_problems(strategy));
    _csetf_strat_set_aside_problems(strategy, $kw54$FREE);
    set.clear_set(strat_active_problems(strategy));
    _csetf_strat_active_problems(strategy, $kw54$FREE);
    set_contents.clear_set_contents(strat_motivated_problems(strategy));
    _csetf_strat_motivated_problems(strategy, $kw54$FREE);
    _csetf_strat_result_uniqueness_criterion(strategy, $kw54$FREE);
    _csetf_strat_inference(strategy, $kw54$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 8676) 
  public static final SubLObject note_strategy_invalid(SubLObject strategy) {
    _csetf_strat_type(strategy, $kw54$FREE);
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9075) 
  public static final SubLObject strategy_suid(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_suid(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9197) 
  public static final SubLObject strategy_inference(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_inference(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9317) 
  public static final SubLObject strategy_local_result_uniqueness_criterion(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_result_uniqueness_criterion(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9477) 
  public static final SubLObject strategy_problem_strategic_index(SubLObject strategy) {
    return strat_problem_strategic_index(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9588) 
  public static final SubLObject strategy_type(SubLObject strategy) {
    return strat_type(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9699) 
  public static final SubLObject strategy_data(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_data(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9809) 
  public static final SubLObject strategy_active_problems(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_active_problems(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 9983) 
  public static final SubLObject strategy_motivated_problems(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_motivated_problems(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10166) 
  public static final SubLObject strategy_set_aside_problems(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_set_aside_problems(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10349) 
  public static final SubLObject strategy_should_reconsider_set_asidesP(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_should_reconsider_set_asidesP(strategy);
  }

  /** @return productivity-p
If a tactic's productivity meets or exceeds this limit, it will be
ignored instead of executed. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10509) 
  public static final SubLObject strategy_productivity_limit(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_productivity_limit(strategy);
  }

  /** @return productivity-p
If a tactic's productivity meets or exceeds this limit, it will not be
considered for removal backtracking. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 10770) 
  public static final SubLObject strategy_removal_backtracking_productivity_limit(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_removal_backtracking_productivity_limit(strategy);
  }

  /** @return proof-spec-p
The proof spec that this strategy is allowed to apply. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11085) 
  public static final SubLObject strategy_proof_spec(SubLObject strategy) {
    checkType(strategy, $sym1$STRATEGY_P);
    return strat_proof_spec(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 11812) 
  public static final SubLObject set_strategy_productivity_limit(SubLObject strategy, SubLObject productivity_limit) {
    checkType(strategy, $sym1$STRATEGY_P);
    checkType(productivity_limit, $sym68$PRODUCTIVITY_P);
    _csetf_strat_productivity_limit(strategy, productivity_limit);
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 12556) 
  public static final SubLObject set_strategy_data(SubLObject strategy, SubLObject data) {
    checkType(strategy, $sym1$STRATEGY_P);
    _csetf_strat_data(strategy, data);
    return strategy;
  }

  /** The strategy of the currently active strategy memoization state, if any. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13298) 
  public static SubLSymbol $current_strategy_wrt_memoization$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 13824) 
  public static final SubLObject strategy_memoization_state(SubLObject strategy) {
    return strat_memoization_state(strategy);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14152) 
  public static final SubLObject strategic_context_inference(SubLObject strategic_context) {
    return ((NIL != strategy_p(strategic_context)) ? ((SubLObject) strategy_inference(strategic_context)) : NIL);
  }

  /** @return answer-link-p; The answer-link of the inference of STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14320) 
  public static final SubLObject strategy_answer_link(SubLObject strategy) {
    return inference_datastructures_inference.inference_root_link(strategy_inference(strategy));
  }

  /** Return T iff the answer-link of the inference of STRATEGY has been propagated
   and has not been closed thereafter. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14541) 
  public static final SubLObject strategy_answer_link_propagatedP(SubLObject strategy) {
    return inference_worker_answer.answer_link_propagatedP(strategy_answer_link(strategy));
  }

  /** Return T iff the answer-link of the inference of STRATEGY ought to be propagated. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 14828) 
  public static final SubLObject strategy_should_propagate_answer_linkP(SubLObject strategy) {
    if ((NIL != strategy_answer_link_propagatedP(strategy))) {
      return NIL;
    } else if (((NIL != inference_worker.inference_deems_answer_link_should_be_closedP(strategy_inference(strategy), strategy_answer_link(strategy)))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35765")))) {
      return NIL;
    } else {
      return T;
    }
  }

  /** @return problem-p; The root problem of the inference of STRATEGY. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 15610) 
  public static final SubLObject strategy_root_problem(SubLObject strategy) {
    return inference_datastructures_inference.inference_root_problem(strategy_inference(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 15832) 
  public static final SubLObject strategy_continuableP(SubLObject strategy) {
    return inference_datastructures_inference.inference_continuableP(strategy_inference(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 15948) 
  public static final SubLObject problem_active_in_strategyP(SubLObject problem, SubLObject strategy) {
    return set.set_memberP(problem, strategy_active_problems(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16081) 
  public static final SubLObject problem_motivatedP(SubLObject problem, SubLObject strategy) {
    return set_contents.set_contents_memberP(problem, strategy_motivated_problems(strategy), Symbols.symbol_function(EQ));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16222) 
  public static final SubLObject problem_set_aside_in_strategyP(SubLObject problem, SubLObject strategy) {
    return set.set_memberP(problem, strategy_set_aside_problems(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16362) 
  public static final SubLObject strategy_has_some_set_aside_problemsP(SubLObject strategy) {
    return makeBoolean((NIL == set.set_emptyP(strategy_set_aside_problems(strategy))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16498) 
  public static final SubLObject strategy_all_valid_set_aside_problems(SubLObject strategy) {
    return list_utilities.delete_if_not($sym85$VALID_PROBLEM_P, set.set_element_list(strategy_set_aside_problems(strategy)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16666) 
  public static final SubLObject strategy_problem_store(SubLObject strategy) {
    return inference_datastructures_inference.inference_problem_store(strategy_inference(strategy));
  }

  /** Locally specified result uniqueness criteria on the strategy (if any)
override the one from the inference. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 16785) 
  public static final SubLObject strategy_result_uniqueness_criterion(SubLObject strategy) {
    {
      SubLObject local_criterion = strategy_local_result_uniqueness_criterion(strategy);
      if ((NIL != local_criterion)) {
        return local_criterion;
      } else {
        {
          SubLObject inference = strategy_inference(strategy);
          return inference_datastructures_inference.inference_result_uniqueness_criterion(inference);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17335) 
  public static final SubLObject strategy_unique_wrt_bindingsP(SubLObject strategy) {
    return Equality.eq($kw87$BINDINGS, strategy_result_uniqueness_criterion(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 17467) 
  public static final SubLObject strategy_wants_one_answerP(SubLObject strategy) {
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18273) 
  public static final SubLObject set_strategy_property(SubLObject strategy, SubLObject property, SubLObject value) {
    checkType(strategy, $sym1$STRATEGY_P);
    checkType(property, $sym90$STRATEGY_PROPERTY_P);
    {
      SubLObject pcase_var = property;
      if (pcase_var.eql($kw45$PRODUCTIVITY_LIMIT)) {
        set_strategy_productivity_limit(strategy, value);
      } else if (pcase_var.eql($kw46$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36460");
      } else if (pcase_var.eql($kw47$PROOF_SPEC)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36459");
      } else {
        Errors.error($str91$Unexpected_strategy_property__s_w, property, value);
      }
    }
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 18836) 
  public static final SubLObject set_strategy_properties(SubLObject strategy, SubLObject strategy_properties) {
    checkType(strategy_properties, $sym92$STRATEGY_PROPERTIES_P);
    {
      SubLObject remainder = NIL;
      for (remainder = strategy_properties; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject property = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          set_strategy_property(strategy, property, value);
        }
      }
    }
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19087) 
  public static final SubLObject strategy_note_problem_active(SubLObject strategy, SubLObject problem) {
    set.set_add(problem, strategy_active_problems(strategy));
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19260) 
  public static final SubLObject strategy_note_problem_inactive(SubLObject strategy, SubLObject problem) {
    set.set_remove(problem, strategy_active_problems(strategy));
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19406) 
  public static final SubLObject strategy_note_problem_motivated(SubLObject strategy, SubLObject problem) {
    {
      SubLObject motivated_problems = strategy_motivated_problems(strategy);
      _csetf_strat_motivated_problems(strategy, set_contents.set_contents_add(problem, motivated_problems, Symbols.symbol_function(EQ)));
    }
    controlling_strategy_callback(strategy, $kw93$SUBSTRATEGY_STRATEGEM_MOTIVATED, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 19914) 
  public static final SubLObject strategy_note_problem_set_aside(SubLObject strategy, SubLObject problem) {
    set.set_add(problem, strategy_set_aside_problems(strategy));
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20213) 
  public static final SubLObject strategy_clear_set_asides(SubLObject strategy) {
    set.clear_set(strategy_set_aside_problems(strategy));
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20340) 
  public static final SubLObject note_strategy_should_reconsider_set_asides(SubLObject strategy) {
    _csetf_strat_should_reconsider_set_asidesP(strategy, T);
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 20491) 
  public static final SubLObject clear_strategy_should_reconsider_set_asides(SubLObject strategy) {
    _csetf_strat_should_reconsider_set_asidesP(strategy, NIL);
    return strategy;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 22027) 
  public static final SubLObject strategy_dispatch(SubLObject strategy, SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
    SubLObject arg1_providedP = makeBoolean((arg1 != UNPROVIDED));
    SubLObject arg2_providedP = makeBoolean((arg2 != UNPROVIDED));
    SubLObject arg3_providedP = makeBoolean((arg3 != UNPROVIDED));
    SubLObject arg4_providedP = makeBoolean((arg4 != UNPROVIDED));
    SubLObject arg5_providedP = makeBoolean((arg5 != UNPROVIDED));
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    if ((arg5 == UNPROVIDED)) {
      arg5 = NIL;
    }
    {
      SubLObject handler_func = strategy_dispatch_handler(strategy, method_type);
      if ((NIL == handler_func)) {
        handler_func = inference_datastructures_enumerated_types.strategy_default_method_handler(method_type);
      }
      if (((NIL == handler_func)
           && (NIL != balancing_tactician.balancing_tactician_p(strategy)))) {
        return Errors.error($str101$balancing_tactician_does_not_impl, method_type);
      }
      if ((NIL != arg5_providedP)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36472");
      } else if ((NIL != arg4_providedP)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36471");
      } else if ((NIL != arg3_providedP)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36470");
      } else if ((NIL != arg2_providedP)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36469");
      } else if ((NIL != arg1_providedP)) {
        return strategy_dispatch_funcall_1(handler_func, strategy, arg1);
      } else {
        return strategy_dispatch_funcall_0(handler_func, strategy);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 23203) 
  public static final SubLObject strategy_dispatch_handler(SubLObject strategy, SubLObject method_type) {
    {
      SubLObject strategy_type = strategy_type(strategy);
      return inference_tactician.strategy_type_dispatch_handler(strategy_type, method_type);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 23391) 
  public static final SubLObject strategy_dispatch_funcall_0(SubLObject func, SubLObject strategy) {
    {
      SubLObject pcase_var = func;
      if (pcase_var.eql($sym102$BALANCED_STRATEGY_DEFAULT_SELECT_BEST_STRATEGEM)) {
        return inference_balanced_tactician_execution.balanced_strategy_default_select_best_strategem(strategy);
      } else if (pcase_var.eql($sym103$BALANCED_STRATEGY_DO_ONE_STEP)) {
        return inference_balanced_tactician_execution.balanced_strategy_do_one_step(strategy);
      } else if (pcase_var.eql($sym104$BALANCED_STRATEGY_DONE_)) {
        return inference_balanced_tactician_execution.balanced_strategy_doneP(strategy);
      } else {
        return Functions.funcall(func, strategy);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 25154) 
  public static final SubLObject strategy_dispatch_funcall_1(SubLObject func, SubLObject strategy, SubLObject arg1) {
    {
      SubLObject pcase_var = func;
      if (pcase_var.eql($sym105$BALANCED_STRATEGY_POSSIBLY_ACTIVATE_PROBLEM)) {
        return inference_balanced_tactician_motivation.balanced_strategy_possibly_activate_problem(strategy, arg1);
      } else {
        return Functions.funcall(func, strategy, arg1);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27027) 
  public static final SubLObject controlling_strategy_callback(SubLObject substrategy, SubLObject method_type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
    SubLObject arg1_providedP = makeBoolean((arg1 != UNPROVIDED));
    SubLObject arg2_providedP = makeBoolean((arg2 != UNPROVIDED));
    SubLObject arg3_providedP = makeBoolean((arg3 != UNPROVIDED));
    SubLObject arg4_providedP = makeBoolean((arg4 != UNPROVIDED));
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    if ((arg4 == UNPROVIDED)) {
      arg4 = NIL;
    }
    {
      SubLObject controlling_strategy = inference_tactician.controlling_strategy(substrategy);
      if ((substrategy != controlling_strategy)) {
        if ((NIL != arg4_providedP)) {
          return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, arg4);
        } else if ((NIL != arg3_providedP)) {
          return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, arg3, UNPROVIDED);
        } else if ((NIL != arg2_providedP)) {
          return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, arg2, UNPROVIDED, UNPROVIDED);
        } else if ((NIL != arg1_providedP)) {
          return strategy_dispatch(controlling_strategy, method_type, substrategy, arg1, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
          return strategy_dispatch(controlling_strategy, method_type, substrategy, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 27946) 
  private static SubLSymbol $strategy_type_store$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28385) 
  public static final SubLObject new_strategy_type(SubLObject type, SubLObject plist) {
    checkType(plist, $sym108$PROPERTY_LIST_P);
    deregister_strategy_type(type);
    {
      SubLObject remainder = NIL;
      for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject property = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          set_strategy_type_property(type, property, value);
        }
      }
    }
    return type;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28633) 
  public static final SubLObject deregister_strategy_type(SubLObject type) {
    return dictionary.dictionary_remove($strategy_type_store$.getGlobalValue(), type);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 28856) 
  public static final SubLObject strategy_type_property(SubLObject type, SubLObject property) {
    return dictionary_utilities.dictionary_getf($strategy_type_store$.getGlobalValue(), type, property, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29078) 
  public static final SubLObject set_strategy_type_property(SubLObject type, SubLObject property, SubLObject value) {
    checkType(property, $sym109$STRATEGY_TYPE_PROPERTY_P);
    return dictionary_utilities.dictionary_putf($strategy_type_store$.getGlobalValue(), type, property, value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29288) 
  private static SubLSymbol $uninterestingness_cache_lookup_enabledP$ = null;

  /** all :recompute */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29390) 
  private static SubLSymbol $default_uninterestingness_flags$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29479) 
  private static SubLSymbol $uninterestingness_cache_thrown_away_wrt_removal_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29567) 
  private static SubLSymbol $uninterestingness_cache_thrown_away_wrt_transformation_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29662) 
  private static SubLSymbol $uninterestingness_cache_thrown_away_wrt_new_root_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29751) 
  private static SubLSymbol $uninterestingness_cache_set_aside_wrt_removal_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29837) 
  private static SubLSymbol $uninterestingness_cache_set_aside_wrt_transformation_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 29930) 
  private static SubLSymbol $uninterestingness_cache_set_aside_wrt_new_root_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30018) 
  private static SubLSymbol $uninterestingness_cache_thrown_away_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30095) 
  private static SubLSymbol $uninterestingness_cache_set_aside_byte$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30170) 
  public static final SubLObject uninterestingness_cache_thrown_away_wrt_removal_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_thrown_away_wrt_removal_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30344) 
  public static final SubLObject uninterestingness_cache_thrown_away_wrt_transformation_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_thrown_away_wrt_transformation_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30511) 
  public static final SubLObject uninterestingness_cache_thrown_away_wrt_new_root_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_thrown_away_wrt_new_root_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30666) 
  public static final SubLObject uninterestingness_cache_set_aside_wrt_removal_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_set_aside_wrt_removal_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30815) 
  public static final SubLObject uninterestingness_cache_set_aside_wrt_transformation_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_set_aside_wrt_transformation_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 30978) 
  public static final SubLObject uninterestingness_cache_set_aside_wrt_new_root_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_set_aside_wrt_new_root_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31129) 
  public static final SubLObject uninterestingness_cache_thrown_away_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_thrown_away_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31258) 
  public static final SubLObject uninterestingness_cache_set_aside_code(SubLObject flags) {
    return bytes.ldb($uninterestingness_cache_set_aside_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31383) 
  public static final SubLObject set_uninterestingness_cache_thrown_away_wrt_removal_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_thrown_away_wrt_removal_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31571) 
  public static final SubLObject set_uninterestingness_cache_thrown_away_wrt_transformation_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_thrown_away_wrt_transformation_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31752) 
  public static final SubLObject set_uninterestingness_cache_thrown_away_wrt_new_root_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_thrown_away_wrt_new_root_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 31921) 
  public static final SubLObject set_uninterestingness_cache_set_aside_wrt_removal_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_set_aside_wrt_removal_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32084) 
  public static final SubLObject set_uninterestingness_cache_set_aside_wrt_transformation_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_set_aside_wrt_transformation_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32261) 
  public static final SubLObject set_uninterestingness_cache_set_aside_wrt_new_root_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_set_aside_wrt_new_root_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32426) 
  public static final SubLObject set_uninterestingness_cache_thrown_away_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_thrown_away_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32569) 
  public static final SubLObject set_uninterestingness_cache_set_aside_code(SubLObject flags, SubLObject code) {
    return bytes.dpb(code, $uninterestingness_cache_set_aside_byte$.getGlobalValue(), flags);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32708) 
  public static final SubLObject decode_uninterestingness_cache_code(SubLObject code) {
    {
      SubLObject pcase_var = code;
      if (pcase_var.eql(ZERO_INTEGER)) {
        return $kw110$RECOMPUTE;
      } else if (pcase_var.eql(ONE_INTEGER)) {
        return T;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return NIL;
      } else {
        return Errors.error($str111$invalid_uninterestingness_cache_c, code);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 32953) 
  public static final SubLObject encode_uninterestingness_cache_status(SubLObject status) {
    if (($kw110$RECOMPUTE == status)) {
      return ZERO_INTEGER;
    } else if ((T == status)) {
      return ONE_INTEGER;
    } else if ((NIL == status)) {
      return TWO_INTEGER;
    } else {
      return Errors.error($str112$invalid_uninterestingness_cache_s, status);
    }
  }

  public static final class $problem_strategic_properties_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $status; }
    public SubLObject getField3() { return $tactic_strategic_property_index; }
    public SubLObject getField4() { return $possible_tactic_count; }
    public SubLObject getField5() { return $flags; }
    public SubLObject setField2(SubLObject value) { return $status = value; }
    public SubLObject setField3(SubLObject value) { return $tactic_strategic_property_index = value; }
    public SubLObject setField4(SubLObject value) { return $possible_tactic_count = value; }
    public SubLObject setField5(SubLObject value) { return $flags = value; }
    public SubLObject $status = NIL;
    public SubLObject $tactic_strategic_property_index = NIL;
    public SubLObject $possible_tactic_count = NIL;
    public SubLObject $flags = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($problem_strategic_properties_native.class, $sym113$PROBLEM_STRATEGIC_PROPERTIES, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P, $list115, $list116, new String[] {"$status", "$tactic_strategic_property_index", "$possible_tactic_count", "$flags"}, $list117, $list118, $sym119$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static SubLSymbol $dtp_problem_strategic_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject problem_strategic_properties_p(SubLObject object) {
    return ((object.getClass() == $problem_strategic_properties_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $problem_strategic_properties_p$UnaryFunction extends UnaryFunction {
    public $problem_strategic_properties_p$UnaryFunction() { super(extractFunctionNamed("PROBLEM-STRATEGIC-PROPERTIES-P")); }
    public SubLObject processItem(SubLObject arg1) { return problem_strategic_properties_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject prob_strategic_properties_status(SubLObject object) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject prob_strategic_properties_tactic_strategic_property_index(SubLObject object) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject prob_strategic_properties_possible_tactic_count(SubLObject object) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject prob_strategic_properties_flags(SubLObject object) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject _csetf_prob_strategic_properties_status(SubLObject object, SubLObject value) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject _csetf_prob_strategic_properties_tactic_strategic_property_index(SubLObject object, SubLObject value) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject _csetf_prob_strategic_properties_possible_tactic_count(SubLObject object, SubLObject value) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject _csetf_prob_strategic_properties_flags(SubLObject object, SubLObject value) {
    checkType(object, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 33533) 
  public static final SubLObject make_problem_strategic_properties(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $problem_strategic_properties_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw129$STATUS)) {
            _csetf_prob_strategic_properties_status(v_new, current_value);
          } else if (pcase_var.eql($kw130$TACTIC_STRATEGIC_PROPERTY_INDEX)) {
            _csetf_prob_strategic_properties_tactic_strategic_property_index(v_new, current_value);
          } else if (pcase_var.eql($kw131$POSSIBLE_TACTIC_COUNT)) {
            _csetf_prob_strategic_properties_possible_tactic_count(v_new, current_value);
          } else if (pcase_var.eql($kw132$FLAGS)) {
            _csetf_prob_strategic_properties_flags(v_new, current_value);
          } else {
            Errors.error($str53$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 34084) 
  public static final SubLObject new_problem_strategic_properties() {
    {
      SubLObject problem_strategic_properties = make_problem_strategic_properties(UNPROVIDED);
      _csetf_prob_strategic_properties_status(problem_strategic_properties, $kw133$NEW);
      _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, NIL);
      _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, ZERO_INTEGER);
      _csetf_prob_strategic_properties_flags(problem_strategic_properties, $default_uninterestingness_flags$.getGlobalValue());
      return problem_strategic_properties;
    }
  }

  /** @return problem-strategic-properties-p or NIL if uninitialized */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 34727) 
  public static final SubLObject problem_strategic_properties_int(SubLObject problem, SubLObject strategy) {
    checkType(problem, $sym88$PROBLEM_P);
    checkType(strategy, $sym1$STRATEGY_P);
    {
      SubLObject problem_strategic_properties = Hashtables.gethash_without_values(problem, strategy_problem_strategic_index(strategy), UNPROVIDED);
      return problem_strategic_properties;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35105) 
  public static final SubLObject set_problem_strategic_properties(SubLObject problem, SubLObject strategy, SubLObject v_properties) {
    checkType(problem, $sym88$PROBLEM_P);
    checkType(strategy, $sym1$STRATEGY_P);
    checkType(v_properties, $sym114$PROBLEM_STRATEGIC_PROPERTIES_P);
    {
      SubLObject hash = strategy_problem_strategic_index(strategy);
      Hashtables.sethash(problem, hash, v_properties);
    }
    return problem;
  }

  /** Initializes the problem-strategic-properties if they do not exist yet. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 35617) 
  public static final SubLObject problem_strategic_properties(SubLObject problem, SubLObject strategy) {
    {
      SubLObject problem_strategic_properties = problem_strategic_properties_int(problem, strategy);
      if ((NIL == problem_strategic_properties_p(problem_strategic_properties))) {
        problem_strategic_properties = new_problem_strategic_properties();
        set_problem_strategic_properties(problem, strategy, problem_strategic_properties);
      }
      return problem_strategic_properties;
    }
  }

  /** Initializes the tactic-properties-vector if it does not exist yet. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 36173) 
  public static final SubLObject problem_strategic_properties_tactic_strategic_property_index(SubLObject problem, SubLObject problem_strategic_properties) {
    {
      SubLObject tactic_properties_vector = prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties);
      if ((!(tactic_properties_vector.isVector()))) {
        tactic_properties_vector = Vectors.make_vector(inference_datastructures_problem.problem_tactic_count(problem), UNPROVIDED);
        _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, tactic_properties_vector);
      }
      if (Sequences.length(tactic_properties_vector).numL(inference_datastructures_problem.problem_tactic_count(problem))) {
        tactic_properties_vector = vector_utilities.extend_vector_to(tactic_properties_vector, inference_datastructures_problem.problem_tactic_count(problem), UNPROVIDED);
        _csetf_prob_strategic_properties_tactic_strategic_property_index(problem_strategic_properties, tactic_properties_vector);
      }
      return tactic_properties_vector;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 37595) 
  public static final SubLObject problem_raw_strategic_status(SubLObject problem, SubLObject strategy) {
    {
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      SubLObject strategic_status = prob_strategic_properties_status(problem_strategic_properties);
      if ((($kw133$NEW == strategic_status)
           && ($kw133$NEW != inference_datastructures_problem.problem_status(problem)))) {
        return $kw134$UNEXAMINED;
      } else {
        return strategic_status;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38058) 
  public static final SubLObject problem_strategic_status(SubLObject problem, SubLObject strategy) {
    {
      SubLObject status = problem_raw_strategic_status(problem, strategy);
      SubLObject weak_tactical_status = inference_datastructures_enumerated_types.tactical_status_from_problem_status(status);
      if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem))) {
        return $kw135$FINISHED;
      } else {
        return weak_tactical_status;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 38437) 
  public static final SubLObject problem_strategic_provability_status(SubLObject problem, SubLObject strategy) {
    {
      SubLObject status = problem_raw_strategic_status(problem, strategy);
      SubLObject weak_provability_status = inference_datastructures_enumerated_types.provability_status_from_problem_status(status);
      if ((($kw136$NEUTRAL == weak_provability_status)
           && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem)))) {
        return $kw137$GOOD;
      } else if ((($kw136$NEUTRAL == weak_provability_status)
           && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)))) {
        return $kw138$NO_GOOD;
      } else {
        return weak_provability_status;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40004) 
  public static final SubLObject set_problem_raw_strategic_status(SubLObject problem, SubLObject strategy, SubLObject status) {
    {
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      _csetf_prob_strategic_properties_status(problem_strategic_properties, status);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40296) 
  public static final SubLObject strategically_unexamined_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw134$UNEXAMINED, problem_strategic_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40453) 
  public static final SubLObject strategically_examined_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw140$EXAMINED, problem_strategic_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40592) 
  public static final SubLObject strategically_possible_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw141$POSSIBLE, problem_strategic_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40731) 
  public static final SubLObject strategically_pending_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw142$PENDING, problem_strategic_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 40868) 
  public static final SubLObject strategically_finished_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw135$FINISHED, problem_strategic_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41007) 
  public static final SubLObject strategically_no_good_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw138$NO_GOOD, problem_strategic_provability_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41156) 
  public static final SubLObject strategically_neutral_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw136$NEUTRAL, problem_strategic_provability_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41305) 
  public static final SubLObject strategically_good_problem_p(SubLObject problem, SubLObject strategy) {
    return Equality.eq($kw137$GOOD, problem_strategic_provability_status(problem, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 41913) 
  public static final SubLObject strategically_totally_no_good_problem_p(SubLObject problem, SubLObject strategy) {
    return strategically_no_good_problem_p(problem, inference_tactician.controlling_strategy(strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42074) 
  public static final SubLObject problem_strategic_flags(SubLObject problem, SubLObject strategy) {
    {
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      return prob_strategic_properties_flags(problem_strategic_properties);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42334) 
  public static final SubLObject set_problem_strategic_flags(SubLObject problem, SubLObject strategy, SubLObject flags) {
    checkType(flags, $sym143$FIXNUMP);
    {
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      _csetf_prob_strategic_properties_flags(problem_strategic_properties, flags);
    }
    return flags;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42619) 
  public static final SubLObject problem_thrown_away_cache_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 42826) 
  public static final SubLObject problem_thrown_away_cache_removal_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_removal_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43051) 
  public static final SubLObject problem_thrown_away_cache_transformation_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_transformation_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43290) 
  public static final SubLObject problem_thrown_away_cache_new_root_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_new_root_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43517) 
  public static final SubLObject problem_set_aside_cache_removal_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_wrt_removal_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43738) 
  public static final SubLObject problem_set_aside_cache_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 43941) 
  public static final SubLObject problem_set_aside_cache_transformation_status(SubLObject problem, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_wrt_transformation_code(problem_strategic_flags(problem, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 44399) 
  public static final SubLObject set_problem_thrown_away(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags, encode_uninterestingness_cache_status(T));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 44707) 
  public static final SubLObject set_problem_not_thrown_away(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 46018) 
  public static final SubLObject set_problem_not_thrown_away_wrt_removal(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 46354) 
  public static final SubLObject set_problem_recompute_thrown_away_wrt_removal(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47055) 
  public static final SubLObject set_problem_thrown_away_wrt_transformation(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags, encode_uninterestingness_cache_status(T));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47399) 
  public static final SubLObject set_problem_not_thrown_away_wrt_transformation(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 47749) 
  public static final SubLObject set_problem_recompute_thrown_away_wrt_transformation(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48628) 
  public static final SubLObject set_problem_not_thrown_away_wrt_new_root(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 48966) 
  public static final SubLObject set_problem_recompute_thrown_away_wrt_new_root(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 49495) 
  public static final SubLObject set_problem_set_aside(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags, encode_uninterestingness_cache_status(T));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 49799) 
  public static final SubLObject set_problem_not_set_aside(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 50758) 
  public static final SubLObject set_problem_not_set_aside_wrt_removal(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 51090) 
  public static final SubLObject set_problem_recompute_set_aside_wrt_removal(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 51775) 
  public static final SubLObject set_problem_not_set_aside_wrt_transformation(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 52121) 
  public static final SubLObject set_problem_recompute_set_aside_wrt_transformation(SubLObject problem, SubLObject strategy) {
    {
      SubLObject flags = problem_strategic_flags(problem, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_problem_strategic_flags(problem, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53328) 
  public static final SubLObject set_problem_recompute_set_aside_wrt_new_root(SubLObject problem, SubLObject strategy) {
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 53768) 
  public static final SubLObject set_problem_thrown_away_wrt(SubLObject problem, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36458");
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_problem_thrown_away_wrt_transformation(problem, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36457");
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 54223) 
  public static final SubLObject set_problem_not_thrown_away_wrt(SubLObject problem, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return set_problem_not_thrown_away_wrt_removal(problem, strategy);
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_problem_not_thrown_away_wrt_transformation(problem, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return set_problem_not_thrown_away_wrt_new_root(problem, strategy);
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 55564) 
  public static final SubLObject set_problem_not_set_aside_wrt(SubLObject problem, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return set_problem_not_set_aside_wrt_removal(problem, strategy);
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_problem_not_set_aside_wrt_transformation(problem, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36449");
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 56466) 
  public static final SubLObject problem_thrown_away_cache_status_wrt_motivation(SubLObject problem, SubLObject strategy, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread))) {
        return $kw110$RECOMPUTE;
      }
      {
        SubLObject pcase_var = motivation;
        if (pcase_var.eql($kw144$REMOVAL)) {
          return problem_thrown_away_cache_removal_status(problem, strategy);
        } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
          return problem_thrown_away_cache_transformation_status(problem, strategy);
        } else if (pcase_var.eql($kw146$NEW_ROOT)) {
          return problem_thrown_away_cache_new_root_status(problem, strategy);
        } else {
          return Errors.error($str147$unexpected_motivation__s, motivation);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57007) 
  public static final SubLObject set_problem_recompute_thrown_away_wrt_all_motivations(SubLObject problem, SubLObject strategy) {
    if ((NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36452");
    } else {
      set_problem_recompute_thrown_away_wrt_removal(problem, strategy);
      set_problem_recompute_thrown_away_wrt_transformation(problem, strategy);
      set_problem_recompute_thrown_away_wrt_new_root(problem, strategy);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57449) 
  public static final SubLObject set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(SubLObject problem) {
    {
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw148$SKIP))) {
        {
          SubLObject idx_4 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_4, $kw148$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_4);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw148$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw148$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              set_problem_recompute_thrown_away_wrt_all_motivations(problem, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_5 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_5))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_5);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              set_problem_recompute_thrown_away_wrt_all_motivations(problem, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 57836) 
  public static final SubLObject problem_set_aside_cache_status_wrt_motivation(SubLObject problem, SubLObject strategy, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread))) {
        return $kw110$RECOMPUTE;
      }
      {
        SubLObject pcase_var = motivation;
        if (pcase_var.eql($kw144$REMOVAL)) {
          return problem_set_aside_cache_removal_status(problem, strategy);
        } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
          return problem_set_aside_cache_transformation_status(problem, strategy);
        } else if (pcase_var.eql($kw146$NEW_ROOT)) {
          return NIL;
        } else {
          return Errors.error($str147$unexpected_motivation__s, motivation);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 58361) 
  public static final SubLObject set_problem_recompute_set_aside_wrt_all_motivations(SubLObject problem, SubLObject strategy) {
    if ((NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36450");
    } else {
      set_problem_recompute_set_aside_wrt_removal(problem, strategy);
      set_problem_recompute_set_aside_wrt_transformation(problem, strategy);
      set_problem_recompute_set_aside_wrt_new_root(problem, strategy);
    }
    return NIL;
  }

  public static final class $tactic_strategic_properties_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $preference_level; }
    public SubLObject getField3() { return $preference_level_justification; }
    public SubLObject getField4() { return $productivity; }
    public SubLObject getField5() { return $flags; }
    public SubLObject setField2(SubLObject value) { return $preference_level = value; }
    public SubLObject setField3(SubLObject value) { return $preference_level_justification = value; }
    public SubLObject setField4(SubLObject value) { return $productivity = value; }
    public SubLObject setField5(SubLObject value) { return $flags = value; }
    public SubLObject $preference_level = NIL;
    public SubLObject $preference_level_justification = NIL;
    public SubLObject $productivity = NIL;
    public SubLObject $flags = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tactic_strategic_properties_native.class, $sym149$TACTIC_STRATEGIC_PROPERTIES, $sym150$TACTIC_STRATEGIC_PROPERTIES_P, $list151, $list152, new String[] {"$preference_level", "$preference_level_justification", "$productivity", "$flags"}, $list153, $list154, $sym119$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static SubLSymbol $dtp_tactic_strategic_properties$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject tactic_strategic_properties_p(SubLObject object) {
    return ((object.getClass() == $tactic_strategic_properties_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $tactic_strategic_properties_p$UnaryFunction extends UnaryFunction {
    public $tactic_strategic_properties_p$UnaryFunction() { super(extractFunctionNamed("TACTIC-STRATEGIC-PROPERTIES-P")); }
    public SubLObject processItem(SubLObject arg1) { return tactic_strategic_properties_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject tact_strategic_properties_preference_level(SubLObject object) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject tact_strategic_properties_productivity(SubLObject object) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject tact_strategic_properties_flags(SubLObject object) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject _csetf_tact_strategic_properties_preference_level(SubLObject object, SubLObject value) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject _csetf_tact_strategic_properties_preference_level_justification(SubLObject object, SubLObject value) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject _csetf_tact_strategic_properties_productivity(SubLObject object, SubLObject value) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject _csetf_tact_strategic_properties_flags(SubLObject object, SubLObject value) {
    checkType(object, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59393) 
  public static final SubLObject make_tactic_strategic_properties(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $tactic_strategic_properties_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw164$PREFERENCE_LEVEL)) {
            _csetf_tact_strategic_properties_preference_level(v_new, current_value);
          } else if (pcase_var.eql($kw165$PREFERENCE_LEVEL_JUSTIFICATION)) {
            _csetf_tact_strategic_properties_preference_level_justification(v_new, current_value);
          } else if (pcase_var.eql($kw166$PRODUCTIVITY)) {
            _csetf_tact_strategic_properties_productivity(v_new, current_value);
          } else if (pcase_var.eql($kw132$FLAGS)) {
            _csetf_tact_strategic_properties_flags(v_new, current_value);
          } else {
            Errors.error($str53$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 59961) 
  public static final SubLObject new_tactic_strategic_properties() {
    {
      SubLObject tactic_strategic_properties = make_tactic_strategic_properties(UNPROVIDED);
      _csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, $kw167$DISALLOWED);
      _csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, $str168$);
      _csetf_tact_strategic_properties_productivity(tactic_strategic_properties, number_utilities.positive_infinity());
      _csetf_tact_strategic_properties_flags(tactic_strategic_properties, $default_uninterestingness_flags$.getGlobalValue());
      return tactic_strategic_properties;
    }
  }

  /** @return tactic-strategic-properties-p or NIL if uninitialized */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 60610) 
  public static final SubLObject tactic_strategic_properties_int(SubLObject tactic, SubLObject strategy) {
    checkType(tactic, $sym169$TACTIC_P);
    checkType(strategy, $sym1$STRATEGY_P);
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      if ((NIL != problem_strategic_properties_p(problem_strategic_properties))) {
        {
          SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
          if (tactic_properties_vector.isVector()) {
            {
              SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
              return Vectors.aref(tactic_properties_vector, tactic_suid);
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61322) 
  public static final SubLObject set_tactic_strategic_properties(SubLObject tactic, SubLObject strategy, SubLObject v_properties) {
    checkType(tactic, $sym169$TACTIC_P);
    checkType(strategy, $sym1$STRATEGY_P);
    checkType(v_properties, $sym150$TACTIC_STRATEGIC_PROPERTIES_P);
    {
      SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      SubLObject tactic_properties_vector = problem_strategic_properties_tactic_strategic_property_index(problem, problem_strategic_properties);
      SubLObject tactic_suid = inference_datastructures_tactic.tactic_suid(tactic);
      Vectors.set_aref(tactic_properties_vector, tactic_suid, v_properties);
    }
    return tactic;
  }

  /** Initializes the tactic-strategic-properties if they do not exist yet. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 61924) 
  public static final SubLObject tactic_strategic_properties(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject tactic_strategic_properties = tactic_strategic_properties_int(tactic, strategy);
      if ((NIL == tactic_strategic_properties_p(tactic_strategic_properties))) {
        tactic_strategic_properties = new_tactic_strategic_properties();
        set_tactic_strategic_properties(tactic, strategy, tactic_strategic_properties);
      }
      return tactic_strategic_properties;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62466) 
  public static final SubLObject tactic_strategic_completeness(SubLObject tactic, SubLObject strategic_context) {
    checkType(strategic_context, $sym139$STRATEGIC_CONTEXT_P);
    if (($kw170$TACTICAL == strategic_context)) {
      return inference_datastructures_tactic.tactic_completeness(tactic);
    } else if ((NIL != inference_worker.content_tactic_p(tactic))) {
      return inference_datastructures_tactic.tactic_completeness(tactic);
    } else {
      return Errors.error($str171$structural_tactic__s_cannot_have_, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 62985) 
  public static final SubLObject tactic_strategic_preference_level(SubLObject tactic, SubLObject strategic_context) {
    checkType(strategic_context, $sym139$STRATEGIC_CONTEXT_P);
    if (($kw170$TACTICAL == strategic_context)) {
      return inference_datastructures_tactic.tactic_preference_level(tactic);
    } else if ((NIL != inference_worker.generalized_structural_tactic_p(tactic))) {
      {
        SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
        return tact_strategic_properties_preference_level(tactic_strategic_properties);
      }
    } else {
      return Errors.error($str172$content_tactic__s_cannot_have_a_p, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 63593) 
  public static final SubLObject tactic_strategic_preference_level_justification(SubLObject tactic, SubLObject strategic_context) {
    checkType(strategic_context, $sym139$STRATEGIC_CONTEXT_P);
    if (($kw170$TACTICAL == strategic_context)) {
      return inference_datastructures_tactic.tactic_preference_level_justification(tactic);
    } else if ((NIL != inference_worker.generalized_structural_tactic_p(tactic))) {
      {
        SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36476");
      }
    } else {
      return Errors.error($str173$content_tactic__s_cannot_have_a_p, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 64565) 
  public static final SubLObject conjunctive_tactic_strategic_preference_level(SubLObject tactic, SubLObject strategic_context) {
    checkType(tactic, $sym174$GENERALIZED_CONJUNCTIVE_TACTIC_P);
    if ((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic))) {
      return preference_modules.completeness_to_preference_level(tactic_strategic_completeness(tactic, strategic_context));
    } else {
      return tactic_strategic_preference_level(tactic, strategic_context);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 64938) 
  public static final SubLObject conjunctive_tactic_strategic_preference_level_justification(SubLObject tactic, SubLObject strategic_context) {
    checkType(tactic, $sym174$GENERALIZED_CONJUNCTIVE_TACTIC_P);
    if ((NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic))) {
      return string_utilities.str(tactic_strategic_completeness(tactic, strategic_context));
    } else {
      return tactic_strategic_preference_level_justification(tactic, strategic_context);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 65310) 
  public static final SubLObject tactic_strategic_productivity(SubLObject tactic, SubLObject strategic_context) {
    if (($kw170$TACTICAL == strategic_context)) {
      return inference_datastructures_tactic.tactic_productivity(tactic);
    } else if ((NIL != inference_worker.content_tactic_p(tactic))) {
      return inference_datastructures_tactic.tactic_productivity(tactic);
    } else {
      {
        SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategic_context);
        return tact_strategic_properties_productivity(tactic_strategic_properties);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 65880) 
  public static final SubLObject tactic_strategically_preferredP(SubLObject tactic, SubLObject strategy) {
    return Equality.eq($kw175$PREFERRED, tactic_strategic_preference_level(tactic, strategy));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 66026) 
  public static final SubLObject set_tactic_strategic_preference_level(SubLObject tactic, SubLObject strategy, SubLObject preference_level, SubLObject justification) {
    checkType(preference_level, $sym176$PREFERENCE_LEVEL_P);
    {
      SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
      _csetf_tact_strategic_properties_preference_level(tactic_strategic_properties, preference_level);
      _csetf_tact_strategic_properties_preference_level_justification(tactic_strategic_properties, justification);
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 66955) 
  public static final SubLObject set_tactic_strategic_productivity(SubLObject tactic, SubLObject strategy, SubLObject productivity) {
    {
      SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
      _csetf_tact_strategic_properties_productivity(tactic_strategic_properties, productivity);
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 67674) 
  public static final SubLObject tactic_strategic_flags(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
      return tact_strategic_properties_flags(tactic_strategic_properties);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 67927) 
  public static final SubLObject set_tactic_strategic_flags(SubLObject tactic, SubLObject strategy, SubLObject flags) {
    checkType(flags, $sym143$FIXNUMP);
    {
      SubLObject tactic_strategic_properties = tactic_strategic_properties(tactic, strategy);
      _csetf_tact_strategic_properties_flags(tactic_strategic_properties, flags);
    }
    return flags;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 68206) 
  public static final SubLObject tactic_thrown_away_cache_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 68409) 
  public static final SubLObject tactic_thrown_away_cache_removal_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_removal_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 68630) 
  public static final SubLObject tactic_thrown_away_cache_transformation_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_transformation_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 68865) 
  public static final SubLObject tactic_thrown_away_cache_new_root_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_thrown_away_wrt_new_root_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 69088) 
  public static final SubLObject tactic_set_aside_cache_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 69287) 
  public static final SubLObject tactic_set_aside_cache_removal_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_wrt_removal_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 69504) 
  public static final SubLObject tactic_set_aside_cache_transformation_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_wrt_transformation_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 69735) 
  public static final SubLObject tactic_set_aside_cache_new_root_status(SubLObject tactic, SubLObject strategy) {
    return decode_uninterestingness_cache_code(uninterestingness_cache_set_aside_wrt_new_root_code(tactic_strategic_flags(tactic, strategy)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 69954) 
  public static final SubLObject set_tactic_thrown_away(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags, encode_uninterestingness_cache_status(T));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 70256) 
  public static final SubLObject set_tactic_not_thrown_away(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 71050) 
  public static final SubLObject set_tactic_thrown_away_wrt_removal(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags, encode_uninterestingness_cache_status(T));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 71374) 
  public static final SubLObject set_tactic_not_thrown_away_wrt_removal(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 71704) 
  public static final SubLObject set_tactic_recompute_thrown_away_wrt_removal(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_removal_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 72224) 
  public static final SubLObject set_tactic_thrown_away_wrt_transformation(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags, encode_uninterestingness_cache_status(T));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 72562) 
  public static final SubLObject set_tactic_not_thrown_away_wrt_transformation(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 72906) 
  public static final SubLObject set_tactic_recompute_thrown_away_wrt_transformation(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_transformation_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 73447) 
  public static final SubLObject set_tactic_thrown_away_wrt_new_root(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags, encode_uninterestingness_cache_status(T));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 73773) 
  public static final SubLObject set_tactic_not_thrown_away_wrt_new_root(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 74105) 
  public static final SubLObject set_tactic_recompute_thrown_away_wrt_new_root(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_thrown_away_wrt_new_root_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 74926) 
  public static final SubLObject set_tactic_not_set_aside(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 75867) 
  public static final SubLObject set_tactic_not_set_aside_wrt_removal(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 76193) 
  public static final SubLObject set_tactic_recompute_set_aside_wrt_removal(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_removal_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 76532) 
  public static final SubLObject set_tactic_set_aside_wrt_transformation(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags, encode_uninterestingness_cache_status(T));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 76866) 
  public static final SubLObject set_tactic_not_set_aside_wrt_transformation(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 77206) 
  public static final SubLObject set_tactic_recompute_set_aside_wrt_transformation(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_transformation_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 77881) 
  public static final SubLObject set_tactic_not_set_aside_wrt_new_root(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_new_root_code(flags, encode_uninterestingness_cache_status(NIL));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 78209) 
  public static final SubLObject set_tactic_recompute_set_aside_wrt_new_root(SubLObject tactic, SubLObject strategy) {
    {
      SubLObject flags = tactic_strategic_flags(tactic, strategy);
      SubLObject new_flags = set_uninterestingness_cache_set_aside_wrt_new_root_code(flags, encode_uninterestingness_cache_status($kw110$RECOMPUTE));
      return set_tactic_strategic_flags(tactic, strategy, new_flags);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 78550) 
  public static final SubLObject set_tactic_thrown_away_wrt(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return set_tactic_thrown_away_wrt_removal(tactic, strategy);
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_tactic_thrown_away_wrt_transformation(tactic, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return set_tactic_thrown_away_wrt_new_root(tactic, strategy);
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 78997) 
  public static final SubLObject set_tactic_not_thrown_away_wrt(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return set_tactic_not_thrown_away_wrt_removal(tactic, strategy);
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_tactic_not_thrown_away_wrt_transformation(tactic, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return set_tactic_not_thrown_away_wrt_new_root(tactic, strategy);
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 79899) 
  public static final SubLObject set_tactic_set_aside_wrt(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36467");
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_tactic_set_aside_wrt_transformation(tactic, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36466");
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 80314) 
  public static final SubLObject set_tactic_not_set_aside_wrt(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
    {
      SubLObject pcase_var = motivation;
      if (pcase_var.eql($kw144$REMOVAL)) {
        return set_tactic_not_set_aside_wrt_removal(tactic, strategy);
      } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
        return set_tactic_not_set_aside_wrt_transformation(tactic, strategy);
      } else if (pcase_var.eql($kw146$NEW_ROOT)) {
        return set_tactic_not_set_aside_wrt_new_root(tactic, strategy);
      } else {
        return Errors.error($str147$unexpected_motivation__s, motivation);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 81200) 
  public static final SubLObject tactic_thrown_away_cache_status_wrt_motivation(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread))) {
        return $kw110$RECOMPUTE;
      }
      {
        SubLObject pcase_var = motivation;
        if (pcase_var.eql($kw144$REMOVAL)) {
          return tactic_thrown_away_cache_removal_status(tactic, strategy);
        } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
          return tactic_thrown_away_cache_transformation_status(tactic, strategy);
        } else if (pcase_var.eql($kw146$NEW_ROOT)) {
          return tactic_thrown_away_cache_new_root_status(tactic, strategy);
        } else {
          return Errors.error($str147$unexpected_motivation__s, motivation);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 81733) 
  public static final SubLObject set_tactic_recompute_thrown_away_wrt_all_motivations(SubLObject tactic, SubLObject strategy) {
    if ((NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36462");
    } else {
      set_tactic_recompute_thrown_away_wrt_removal(tactic, strategy);
      set_tactic_recompute_thrown_away_wrt_transformation(tactic, strategy);
      set_tactic_recompute_thrown_away_wrt_new_root(tactic, strategy);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 82165) 
  public static final SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_motivations(SubLObject problem, SubLObject strategy) {
    {
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        set_tactic_recompute_thrown_away_wrt_all_motivations(tactic, strategy);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 82393) 
  public static final SubLObject set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations(SubLObject problem) {
    {
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw148$SKIP))) {
        {
          SubLObject idx_8 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_8, $kw148$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_8);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw148$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw148$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              set_problem_tactics_recompute_thrown_away_wrt_all_motivations(problem, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_9 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_9))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_9);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              set_problem_tactics_recompute_thrown_away_wrt_all_motivations(problem, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 82664) 
  public static final SubLObject tactic_set_aside_cache_status_wrt_motivation(SubLObject tactic, SubLObject strategy, SubLObject motivation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $uninterestingness_cache_lookup_enabledP$.getDynamicValue(thread))) {
        return $kw110$RECOMPUTE;
      }
      {
        SubLObject pcase_var = motivation;
        if (pcase_var.eql($kw144$REMOVAL)) {
          return tactic_set_aside_cache_removal_status(tactic, strategy);
        } else if (pcase_var.eql($kw145$TRANSFORMATION)) {
          return tactic_set_aside_cache_transformation_status(tactic, strategy);
        } else if (pcase_var.eql($kw146$NEW_ROOT)) {
          return tactic_set_aside_cache_new_root_status(tactic, strategy);
        } else {
          return Errors.error($str147$unexpected_motivation__s, motivation);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 83194) 
  public static final SubLObject set_tactic_recompute_set_aside_wrt_all_motivations(SubLObject tactic, SubLObject strategy) {
    if ((NIL != balancing_tactician.balancing_tactician_substrategy_p(strategy))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36461");
    } else {
      set_tactic_recompute_set_aside_wrt_removal(tactic, strategy);
      set_tactic_recompute_set_aside_wrt_transformation(tactic, strategy);
      set_tactic_recompute_set_aside_wrt_new_root(tactic, strategy);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 83616) 
  public static final SubLObject set_tactic_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations(SubLObject tactic) {
    {
      SubLObject prob = inference_datastructures_tactic.tactic_problem(tactic);
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw148$SKIP))) {
        {
          SubLObject idx_10 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_10, $kw148$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_10);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw148$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw148$SKIP;
                    }
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              set_tactic_recompute_set_aside_wrt_all_motivations(tactic, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_11 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_11))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_11);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    if ((NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference))) {
                      {
                        SubLObject inference_var = inference;
                        SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_strategy_set(inference_var));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                          {
                            SubLObject strategy = set_contents.do_set_contents_next(basis_object, state);
                            if ((NIL != set_contents.do_set_contents_element_validP(state, strategy))) {
                              set_tactic_recompute_set_aside_wrt_all_motivations(tactic, strategy);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 84743) 
  public static final SubLObject problem_note_tactic_strategically_possible(SubLObject problem, SubLObject tactic, SubLObject strategy) {
    checkType(problem, $sym88$PROBLEM_P);
    checkType(tactic, $sym169$TACTIC_P);
    checkType(strategy, $sym1$STRATEGY_P);
    {
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, Numbers.add(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-strategy.lisp", position = 85154) 
  public static final SubLObject problem_note_tactic_not_strategically_possible(SubLObject problem, SubLObject tactic, SubLObject strategy) {
    checkType(problem, $sym88$PROBLEM_P);
    checkType(tactic, $sym169$TACTIC_P);
    checkType(strategy, $sym1$STRATEGY_P);
    {
      SubLObject problem_strategic_properties = problem_strategic_properties(problem, strategy);
      _csetf_prob_strategic_properties_possible_tactic_count(problem_strategic_properties, Numbers.subtract(prob_strategic_properties_possible_tactic_count(problem_strategic_properties), ONE_INTEGER));
    }
    return problem;
  }

  public static final SubLObject declare_inference_datastructures_strategy_file() {
    declareFunction(myName, "strategy_print_function_trampoline", "STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "strategy_p", "STRATEGY-P", 1, 0, false); new $strategy_p$UnaryFunction();
    declareFunction(myName, "strat_suid", "STRAT-SUID", 1, 0, false);
    declareFunction(myName, "strat_inference", "STRAT-INFERENCE", 1, 0, false);
    declareFunction(myName, "strat_result_uniqueness_criterion", "STRAT-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
    declareFunction(myName, "strat_active_problems", "STRAT-ACTIVE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strat_motivated_problems", "STRAT-MOTIVATED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strat_set_aside_problems", "STRAT-SET-ASIDE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strat_should_reconsider_set_asidesP", "STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
    declareFunction(myName, "strat_productivity_limit", "STRAT-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "strat_removal_backtracking_productivity_limit", "STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "strat_proof_spec", "STRAT-PROOF-SPEC", 1, 0, false);
    declareFunction(myName, "strat_problem_proof_spec_index", "STRAT-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
    declareFunction(myName, "strat_problem_strategic_index", "STRAT-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
    declareFunction(myName, "strat_memoization_state", "STRAT-MEMOIZATION-STATE", 1, 0, false);
    declareFunction(myName, "strat_type", "STRAT-TYPE", 1, 0, false);
    declareFunction(myName, "strat_data", "STRAT-DATA", 1, 0, false);
    declareFunction(myName, "_csetf_strat_suid", "_CSETF-STRAT-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_strat_inference", "_CSETF-STRAT-INFERENCE", 2, 0, false);
    declareFunction(myName, "_csetf_strat_result_uniqueness_criterion", "_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
    declareFunction(myName, "_csetf_strat_active_problems", "_CSETF-STRAT-ACTIVE-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_strat_motivated_problems", "_CSETF-STRAT-MOTIVATED-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_strat_set_aside_problems", "_CSETF-STRAT-SET-ASIDE-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_strat_should_reconsider_set_asidesP", "_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?", 2, 0, false);
    declareFunction(myName, "_csetf_strat_productivity_limit", "_CSETF-STRAT-PRODUCTIVITY-LIMIT", 2, 0, false);
    declareFunction(myName, "_csetf_strat_removal_backtracking_productivity_limit", "_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
    declareFunction(myName, "_csetf_strat_proof_spec", "_CSETF-STRAT-PROOF-SPEC", 2, 0, false);
    declareFunction(myName, "_csetf_strat_problem_proof_spec_index", "_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_strat_problem_strategic_index", "_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_strat_memoization_state", "_CSETF-STRAT-MEMOIZATION-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_strat_type", "_CSETF-STRAT-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_strat_data", "_CSETF-STRAT-DATA", 2, 0, false);
    declareFunction(myName, "make_strategy", "MAKE-STRATEGY", 0, 1, false);
    declareFunction(myName, "valid_strategy_p", "VALID-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "strategy_invalid_p", "STRATEGY-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_strategy", "PRINT-STRATEGY", 3, 0, false);
    declareFunction(myName, "sxhash_strategy_method", "SXHASH-STRATEGY-METHOD", 1, 0, false); new $sxhash_strategy_method$UnaryFunction();
    declareFunction(myName, "new_strategy", "NEW-STRATEGY", 2, 0, false);
    declareFunction(myName, "destroy_strategy", "DESTROY-STRATEGY", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_strategy", "DESTROY-PROBLEM-STORE-STRATEGY", 1, 0, false);
    declareFunction(myName, "destroy_inference_strategy", "DESTROY-INFERENCE-STRATEGY", 1, 0, false);
    declareFunction(myName, "destroy_strategy_int", "DESTROY-STRATEGY-INT", 1, 0, false);
    declareFunction(myName, "note_strategy_invalid", "NOTE-STRATEGY-INVALID", 1, 0, false);
    declareFunction(myName, "remove_strategy_problem", "REMOVE-STRATEGY-PROBLEM", 2, 0, false);
    declareFunction(myName, "strategy_suid", "STRATEGY-SUID", 1, 0, false);
    declareFunction(myName, "strategy_inference", "STRATEGY-INFERENCE", 1, 0, false);
    declareFunction(myName, "strategy_local_result_uniqueness_criterion", "STRATEGY-LOCAL-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
    declareFunction(myName, "strategy_problem_strategic_index", "STRATEGY-PROBLEM-STRATEGIC-INDEX", 1, 0, false);
    declareFunction(myName, "strategy_type", "STRATEGY-TYPE", 1, 0, false);
    declareFunction(myName, "strategy_data", "STRATEGY-DATA", 1, 0, false);
    declareFunction(myName, "strategy_active_problems", "STRATEGY-ACTIVE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strategy_motivated_problems", "STRATEGY-MOTIVATED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strategy_set_aside_problems", "STRATEGY-SET-ASIDE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strategy_should_reconsider_set_asidesP", "STRATEGY-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
    declareFunction(myName, "strategy_productivity_limit", "STRATEGY-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "strategy_removal_backtracking_productivity_limit", "STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "strategy_proof_spec", "STRATEGY-PROOF-SPEC", 1, 0, false);
    declareFunction(myName, "strategy_problem_proof_spec_index", "STRATEGY-PROBLEM-PROOF-SPEC-INDEX", 1, 0, false);
    declareFunction(myName, "set_strategy_result_uniqueness_criterion", "SET-STRATEGY-RESULT-UNIQUENESS-CRITERION", 2, 0, false);
    declareFunction(myName, "set_strategy_productivity_limit", "SET-STRATEGY-PRODUCTIVITY-LIMIT", 2, 0, false);
    declareFunction(myName, "set_strategy_removal_backtracking_productivity_limit", "SET-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 2, 0, false);
    declareFunction(myName, "set_strategy_proof_spec", "SET-STRATEGY-PROOF-SPEC", 2, 0, false);
    declareFunction(myName, "set_strategy_data", "SET-STRATEGY-DATA", 2, 0, false);
    declareMacro(myName, "do_strategy_active_problems", "DO-STRATEGY-ACTIVE-PROBLEMS");
    declareMacro(myName, "do_strategy_motivated_problems", "DO-STRATEGY-MOTIVATED-PROBLEMS");
    declareMacro(myName, "do_strategy_set_aside_problems", "DO-STRATEGY-SET-ASIDE-PROBLEMS");
    declareMacro(myName, "with_strategy_memoization_state", "WITH-STRATEGY-MEMOIZATION-STATE");
    declareFunction(myName, "strategy_memoization_state", "STRATEGY-MEMOIZATION-STATE", 1, 0, false);
    declareFunction(myName, "current_strategy_wrt_memoization", "CURRENT-STRATEGY-WRT-MEMOIZATION", 0, 0, false);
    declareFunction(myName, "strategic_context_inference", "STRATEGIC-CONTEXT-INFERENCE", 1, 0, false);
    declareFunction(myName, "strategy_answer_link", "STRATEGY-ANSWER-LINK", 1, 0, false);
    declareFunction(myName, "strategy_answer_link_propagatedP", "STRATEGY-ANSWER-LINK-PROPAGATED?", 1, 0, false);
    declareFunction(myName, "strategy_should_propagate_answer_linkP", "STRATEGY-SHOULD-PROPAGATE-ANSWER-LINK?", 1, 0, false);
    declareFunction(myName, "strategy_root_problem", "STRATEGY-ROOT-PROBLEM", 1, 0, false);
    declareFunction(myName, "strategy_continuableP", "STRATEGY-CONTINUABLE?", 1, 0, false);
    declareFunction(myName, "problem_active_in_strategyP", "PROBLEM-ACTIVE-IN-STRATEGY?", 2, 0, false);
    declareFunction(myName, "problem_motivatedP", "PROBLEM-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "problem_set_aside_in_strategyP", "PROBLEM-SET-ASIDE-IN-STRATEGY?", 2, 0, false);
    declareFunction(myName, "strategy_has_some_set_aside_problemsP", "STRATEGY-HAS-SOME-SET-ASIDE-PROBLEMS?", 1, 0, false);
    declareFunction(myName, "strategy_all_valid_set_aside_problems", "STRATEGY-ALL-VALID-SET-ASIDE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "strategy_problem_store", "STRATEGY-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "strategy_result_uniqueness_criterion", "STRATEGY-RESULT-UNIQUENESS-CRITERION", 1, 0, false);
    declareFunction(myName, "strategy_unique_wrt_proofsP", "STRATEGY-UNIQUE-WRT-PROOFS?", 1, 0, false);
    declareFunction(myName, "strategy_unique_wrt_bindingsP", "STRATEGY-UNIQUE-WRT-BINDINGS?", 1, 0, false);
    declareFunction(myName, "strategy_wants_one_answerP", "STRATEGY-WANTS-ONE-ANSWER?", 1, 0, false);
    declareFunction(myName, "strategy_active_problem_count", "STRATEGY-ACTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "strategy_motivated_problem_count", "STRATEGY-MOTIVATED-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "strategy_set_aside_problem_count", "STRATEGY-SET-ASIDE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "strategy_problem_proof_spec", "STRATEGY-PROBLEM-PROOF-SPEC", 2, 0, false);
    declareFunction(myName, "set_strategy_property", "SET-STRATEGY-PROPERTY", 3, 0, false);
    declareFunction(myName, "set_strategy_properties", "SET-STRATEGY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "strategy_note_problem_active", "STRATEGY-NOTE-PROBLEM-ACTIVE", 2, 0, false);
    declareFunction(myName, "strategy_note_problem_inactive", "STRATEGY-NOTE-PROBLEM-INACTIVE", 2, 0, false);
    declareFunction(myName, "strategy_note_problem_motivated", "STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
    declareFunction(myName, "strategy_note_problem_unmotivated", "STRATEGY-NOTE-PROBLEM-UNMOTIVATED", 2, 0, false);
    declareFunction(myName, "strategy_note_problem_set_aside", "STRATEGY-NOTE-PROBLEM-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "strategy_clear_problem_set_aside", "STRATEGY-CLEAR-PROBLEM-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "strategy_clear_set_asides", "STRATEGY-CLEAR-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "note_strategy_should_reconsider_set_asides", "NOTE-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "clear_strategy_should_reconsider_set_asides", "CLEAR-STRATEGY-SHOULD-RECONSIDER-SET-ASIDES", 1, 0, false);
    declareMacro(myName, "with_strategically_active_problem", "WITH-STRATEGICALLY-ACTIVE-PROBLEM");
    declareFunction(myName, "strategy_note_problem_proof_spec", "STRATEGY-NOTE-PROBLEM-PROOF-SPEC", 3, 0, false);
    declareFunction(myName, "strategy_dispatch", "STRATEGY-DISPATCH", 2, 5, false);
    declareFunction(myName, "strategy_dispatch_handler", "STRATEGY-DISPATCH-HANDLER", 2, 0, false);
    declareFunction(myName, "strategy_dispatch_funcall_0", "STRATEGY-DISPATCH-FUNCALL-0", 2, 0, false);
    declareFunction(myName, "strategy_dispatch_funcall_1", "STRATEGY-DISPATCH-FUNCALL-1", 3, 0, false);
    declareFunction(myName, "strategy_dispatch_funcall_2", "STRATEGY-DISPATCH-FUNCALL-2", 4, 0, false);
    declareFunction(myName, "strategy_dispatch_funcall_3", "STRATEGY-DISPATCH-FUNCALL-3", 5, 0, false);
    declareFunction(myName, "strategy_dispatch_funcall_4", "STRATEGY-DISPATCH-FUNCALL-4", 6, 0, false);
    declareFunction(myName, "strategy_dispatch_funcall_5", "STRATEGY-DISPATCH-FUNCALL-5", 7, 0, false);
    declareFunction(myName, "strategy_dispatch_unexpected_strategy_type_error", "STRATEGY-DISPATCH-UNEXPECTED-STRATEGY-TYPE-ERROR", 1, 0, false);
    declareFunction(myName, "controlling_strategy_callback", "CONTROLLING-STRATEGY-CALLBACK", 2, 4, false);
    declareFunction(myName, "strategy_type_p", "STRATEGY-TYPE-P", 1, 0, false);
    declareFunction(myName, "new_strategy_type", "NEW-STRATEGY-TYPE", 2, 0, false);
    declareFunction(myName, "deregister_strategy_type", "DEREGISTER-STRATEGY-TYPE", 1, 0, false);
    declareFunction(myName, "clear_strategy_type_store", "CLEAR-STRATEGY-TYPE-STORE", 0, 0, false);
    declareFunction(myName, "strategy_type_property", "STRATEGY-TYPE-PROPERTY", 2, 0, false);
    declareFunction(myName, "set_strategy_type_property", "SET-STRATEGY-TYPE-PROPERTY", 3, 0, false);
    declareFunction(myName, "uninterestingness_cache_thrown_away_wrt_removal_code", "UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_thrown_away_wrt_transformation_code", "UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_thrown_away_wrt_new_root_code", "UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_set_aside_wrt_removal_code", "UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_set_aside_wrt_transformation_code", "UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_set_aside_wrt_new_root_code", "UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_thrown_away_code", "UNINTERESTINGNESS-CACHE-THROWN-AWAY-CODE", 1, 0, false);
    declareFunction(myName, "uninterestingness_cache_set_aside_code", "UNINTERESTINGNESS-CACHE-SET-ASIDE-CODE", 1, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_thrown_away_wrt_removal_code", "SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_thrown_away_wrt_transformation_code", "SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_thrown_away_wrt_new_root_code", "SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_set_aside_wrt_removal_code", "SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_set_aside_wrt_transformation_code", "SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_set_aside_wrt_new_root_code", "SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_thrown_away_code", "SET-UNINTERESTINGNESS-CACHE-THROWN-AWAY-CODE", 2, 0, false);
    declareFunction(myName, "set_uninterestingness_cache_set_aside_code", "SET-UNINTERESTINGNESS-CACHE-SET-ASIDE-CODE", 2, 0, false);
    declareFunction(myName, "decode_uninterestingness_cache_code", "DECODE-UNINTERESTINGNESS-CACHE-CODE", 1, 0, false);
    declareFunction(myName, "encode_uninterestingness_cache_status", "ENCODE-UNINTERESTINGNESS-CACHE-STATUS", 1, 0, false);
    declareFunction(myName, "problem_strategic_properties_print_function_trampoline", "PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "problem_strategic_properties_p", "PROBLEM-STRATEGIC-PROPERTIES-P", 1, 0, false); new $problem_strategic_properties_p$UnaryFunction();
    declareFunction(myName, "prob_strategic_properties_status", "PROB-STRATEGIC-PROPERTIES-STATUS", 1, 0, false);
    declareFunction(myName, "prob_strategic_properties_tactic_strategic_property_index", "PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 1, 0, false);
    declareFunction(myName, "prob_strategic_properties_possible_tactic_count", "PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "prob_strategic_properties_flags", "PROB-STRATEGIC-PROPERTIES-FLAGS", 1, 0, false);
    declareFunction(myName, "_csetf_prob_strategic_properties_status", "_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_strategic_properties_tactic_strategic_property_index", "_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_strategic_properties_possible_tactic_count", "_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_prob_strategic_properties_flags", "_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS", 2, 0, false);
    declareFunction(myName, "make_problem_strategic_properties", "MAKE-PROBLEM-STRATEGIC-PROPERTIES", 0, 1, false);
    declareFunction(myName, "new_problem_strategic_properties", "NEW-PROBLEM-STRATEGIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "problem_strategic_properties_int", "PROBLEM-STRATEGIC-PROPERTIES-INT", 2, 0, false);
    declareFunction(myName, "set_problem_strategic_properties", "SET-PROBLEM-STRATEGIC-PROPERTIES", 3, 0, false);
    declareFunction(myName, "remove_problem_strategic_properties", "REMOVE-PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "problem_strategic_properties", "PROBLEM-STRATEGIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "problem_strategic_properties_tactic_strategic_property_index", "PROBLEM-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX", 2, 0, false);
    declareFunction(myName, "problem_raw_strategic_status", "PROBLEM-RAW-STRATEGIC-STATUS", 2, 0, false);
    declareFunction(myName, "problem_strategic_status", "PROBLEM-STRATEGIC-STATUS", 2, 0, false);
    declareFunction(myName, "problem_strategic_provability_status", "PROBLEM-STRATEGIC-PROVABILITY-STATUS", 2, 0, false);
    declareFunction(myName, "problem_tactical_or_strategic_status", "PROBLEM-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
    declareFunction(myName, "problem_provability_status", "PROBLEM-PROVABILITY-STATUS", 2, 0, false);
    declareFunction(myName, "set_problem_raw_strategic_status", "SET-PROBLEM-RAW-STRATEGIC-STATUS", 3, 0, false);
    declareFunction(myName, "strategically_unexamined_problem_p", "STRATEGICALLY-UNEXAMINED-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_examined_problem_p", "STRATEGICALLY-EXAMINED-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_possible_problem_p", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_pending_problem_p", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_finished_problem_p", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_no_good_problem_p", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_neutral_problem_p", "STRATEGICALLY-NEUTRAL-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_good_problem_p", "STRATEGICALLY-GOOD-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_potentially_possible_problem_p", "STRATEGICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_not_potentially_possible_problem_p", "STRATEGICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "strategically_totally_no_good_problem_p", "STRATEGICALLY-TOTALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
    declareFunction(myName, "problem_strategic_flags", "PROBLEM-STRATEGIC-FLAGS", 2, 0, false);
    declareFunction(myName, "set_problem_strategic_flags", "SET-PROBLEM-STRATEGIC-FLAGS", 3, 0, false);
    declareFunction(myName, "problem_thrown_away_cache_status", "PROBLEM-THROWN-AWAY-CACHE-STATUS", 2, 0, false);
    declareFunction(myName, "problem_thrown_away_cache_removal_status", "PROBLEM-THROWN-AWAY-CACHE-REMOVAL-STATUS", 2, 0, false);
    declareFunction(myName, "problem_thrown_away_cache_transformation_status", "PROBLEM-THROWN-AWAY-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
    declareFunction(myName, "problem_thrown_away_cache_new_root_status", "PROBLEM-THROWN-AWAY-CACHE-NEW-ROOT-STATUS", 2, 0, false);
    declareFunction(myName, "problem_set_aside_cache_removal_status", "PROBLEM-SET-ASIDE-CACHE-REMOVAL-STATUS", 2, 0, false);
    declareFunction(myName, "problem_set_aside_cache_status", "PROBLEM-SET-ASIDE-CACHE-STATUS", 2, 0, false);
    declareFunction(myName, "problem_set_aside_cache_transformation_status", "PROBLEM-SET-ASIDE-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
    declareFunction(myName, "problem_set_aside_cache_new_root_status", "PROBLEM-SET-ASIDE-CACHE-NEW-ROOT-STATUS", 2, 0, false);
    declareFunction(myName, "set_problem_thrown_away", "SET-PROBLEM-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "set_problem_not_thrown_away", "SET-PROBLEM-NOT-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "set_problem_thrown_away_wrt_removal", "SET-PROBLEM-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_problem_not_thrown_away_wrt_removal", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away_wrt_removal", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_problem_thrown_away_wrt_transformation", "SET-PROBLEM-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_problem_not_thrown_away_wrt_transformation", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away_wrt_transformation", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_problem_thrown_away_wrt_new_root", "SET-PROBLEM-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_problem_not_thrown_away_wrt_new_root", "SET-PROBLEM-NOT-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away_wrt_new_root", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_problem_set_aside", "SET-PROBLEM-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "set_problem_not_set_aside", "SET-PROBLEM-NOT-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside", "SET-PROBLEM-RECOMPUTE-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "set_problem_set_aside_wrt_removal", "SET-PROBLEM-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_problem_not_set_aside_wrt_removal", "SET-PROBLEM-NOT-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside_wrt_removal", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_problem_set_aside_wrt_transformation", "SET-PROBLEM-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_problem_not_set_aside_wrt_transformation", "SET-PROBLEM-NOT-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside_wrt_transformation", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_problem_set_aside_wrt_new_root", "SET-PROBLEM-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_problem_not_set_aside_wrt_new_root", "SET-PROBLEM-NOT-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside_wrt_new_root", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_problem_thrown_away_wrt", "SET-PROBLEM-THROWN-AWAY-WRT", 3, 0, false);
    declareFunction(myName, "set_problem_not_thrown_away_wrt", "SET-PROBLEM-NOT-THROWN-AWAY-WRT", 3, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away_wrt", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT", 3, 0, false);
    declareFunction(myName, "set_problem_set_aside_wrt", "SET-PROBLEM-SET-ASIDE-WRT", 3, 0, false);
    declareFunction(myName, "set_problem_not_set_aside_wrt", "SET-PROBLEM-NOT-SET-ASIDE-WRT", 3, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside_wrt", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT", 3, 0, false);
    declareFunction(myName, "problem_thrown_away_cache_status_wrt_motivation", "PROBLEM-THROWN-AWAY-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away_wrt_all_motivations", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations", "SET-PROBLEM-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
    declareFunction(myName, "problem_set_aside_cache_status_wrt_motivation", "PROBLEM-SET-ASIDE-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside_wrt_all_motivations", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
    declareFunction(myName, "set_problem_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations", "SET-PROBLEM-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
    declareFunction(myName, "tactic_strategic_properties_print_function_trampoline", "TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "tactic_strategic_properties_p", "TACTIC-STRATEGIC-PROPERTIES-P", 1, 0, false); new $tactic_strategic_properties_p$UnaryFunction();
    declareFunction(myName, "tact_strategic_properties_preference_level", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "tact_strategic_properties_preference_level_justification", "TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "tact_strategic_properties_productivity", "TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "tact_strategic_properties_flags", "TACT-STRATEGIC-PROPERTIES-FLAGS", 1, 0, false);
    declareFunction(myName, "_csetf_tact_strategic_properties_preference_level", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "_csetf_tact_strategic_properties_preference_level_justification", "_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "_csetf_tact_strategic_properties_productivity", "_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "_csetf_tact_strategic_properties_flags", "_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS", 2, 0, false);
    declareFunction(myName, "make_tactic_strategic_properties", "MAKE-TACTIC-STRATEGIC-PROPERTIES", 0, 1, false);
    declareFunction(myName, "new_tactic_strategic_properties", "NEW-TACTIC-STRATEGIC-PROPERTIES", 0, 0, false);
    declareFunction(myName, "tactic_strategic_properties_int", "TACTIC-STRATEGIC-PROPERTIES-INT", 2, 0, false);
    declareFunction(myName, "set_tactic_strategic_properties", "SET-TACTIC-STRATEGIC-PROPERTIES", 3, 0, false);
    declareFunction(myName, "tactic_strategic_properties", "TACTIC-STRATEGIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "tactic_strategic_completeness", "TACTIC-STRATEGIC-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "tactic_strategic_preference_level", "TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "tactic_strategic_preference_level_justification", "TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "tactic_strategic_dwimmed_completeness", "TACTIC-STRATEGIC-DWIMMED-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "conjunctive_tactic_strategic_preference_level", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 2, 0, false);
    declareFunction(myName, "conjunctive_tactic_strategic_preference_level_justification", "CONJUNCTIVE-TACTIC-STRATEGIC-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "tactic_strategic_productivity", "TACTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "tactic_strategically_preferredP", "TACTIC-STRATEGICALLY-PREFERRED?", 2, 0, false);
    declareFunction(myName, "set_tactic_strategic_preference_level", "SET-TACTIC-STRATEGIC-PREFERENCE-LEVEL", 4, 0, false);
    declareFunction(myName, "set_tactic_strategic_productivity", "SET-TACTIC-STRATEGIC-PRODUCTIVITY", 3, 0, false);
    declareFunction(myName, "tactic_strategic_flags", "TACTIC-STRATEGIC-FLAGS", 2, 0, false);
    declareFunction(myName, "set_tactic_strategic_flags", "SET-TACTIC-STRATEGIC-FLAGS", 3, 0, false);
    declareFunction(myName, "tactic_thrown_away_cache_status", "TACTIC-THROWN-AWAY-CACHE-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_thrown_away_cache_removal_status", "TACTIC-THROWN-AWAY-CACHE-REMOVAL-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_thrown_away_cache_transformation_status", "TACTIC-THROWN-AWAY-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_thrown_away_cache_new_root_status", "TACTIC-THROWN-AWAY-CACHE-NEW-ROOT-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_set_aside_cache_status", "TACTIC-SET-ASIDE-CACHE-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_set_aside_cache_removal_status", "TACTIC-SET-ASIDE-CACHE-REMOVAL-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_set_aside_cache_transformation_status", "TACTIC-SET-ASIDE-CACHE-TRANSFORMATION-STATUS", 2, 0, false);
    declareFunction(myName, "tactic_set_aside_cache_new_root_status", "TACTIC-SET-ASIDE-CACHE-NEW-ROOT-STATUS", 2, 0, false);
    declareFunction(myName, "set_tactic_thrown_away", "SET-TACTIC-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "set_tactic_not_thrown_away", "SET-TACTIC-NOT-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_thrown_away", "SET-TACTIC-RECOMPUTE-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "set_tactic_thrown_away_wrt_removal", "SET-TACTIC-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_tactic_not_thrown_away_wrt_removal", "SET-TACTIC-NOT-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_thrown_away_wrt_removal", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_tactic_thrown_away_wrt_transformation", "SET-TACTIC-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_tactic_not_thrown_away_wrt_transformation", "SET-TACTIC-NOT-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_thrown_away_wrt_transformation", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_tactic_thrown_away_wrt_new_root", "SET-TACTIC-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_tactic_not_thrown_away_wrt_new_root", "SET-TACTIC-NOT-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_thrown_away_wrt_new_root", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_tactic_set_aside", "SET-TACTIC-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "set_tactic_not_set_aside", "SET-TACTIC-NOT-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside", "SET-TACTIC-RECOMPUTE-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "set_tactic_set_aside_wrt_removal", "SET-TACTIC-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_tactic_not_set_aside_wrt_removal", "SET-TACTIC-NOT-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside_wrt_removal", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "set_tactic_set_aside_wrt_transformation", "SET-TACTIC-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_tactic_not_set_aside_wrt_transformation", "SET-TACTIC-NOT-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside_wrt_transformation", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "set_tactic_set_aside_wrt_new_root", "SET-TACTIC-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_tactic_not_set_aside_wrt_new_root", "SET-TACTIC-NOT-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside_wrt_new_root", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "set_tactic_thrown_away_wrt", "SET-TACTIC-THROWN-AWAY-WRT", 3, 0, false);
    declareFunction(myName, "set_tactic_not_thrown_away_wrt", "SET-TACTIC-NOT-THROWN-AWAY-WRT", 3, 0, false);
    declareFunction(myName, "set_tactic_recompute_thrown_away_wrt", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT", 3, 0, false);
    declareFunction(myName, "set_tactic_set_aside_wrt", "SET-TACTIC-SET-ASIDE-WRT", 3, 0, false);
    declareFunction(myName, "set_tactic_not_set_aside_wrt", "SET-TACTIC-NOT-SET-ASIDE-WRT", 3, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside_wrt", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT", 3, 0, false);
    declareFunction(myName, "tactic_thrown_away_cache_status_wrt_motivation", "TACTIC-THROWN-AWAY-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
    declareFunction(myName, "set_tactic_recompute_thrown_away_wrt_all_motivations", "SET-TACTIC-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
    declareFunction(myName, "set_problem_tactics_recompute_thrown_away_wrt_all_motivations", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-MOTIVATIONS", 2, 0, false);
    declareFunction(myName, "set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies_and_all_motivations", "SET-PROBLEM-TACTICS-RECOMPUTE-THROWN-AWAY-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
    declareFunction(myName, "tactic_set_aside_cache_status_wrt_motivation", "TACTIC-SET-ASIDE-CACHE-STATUS-WRT-MOTIVATION", 3, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside_wrt_all_motivations", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
    declareFunction(myName, "set_tactic_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations", "SET-TACTIC-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
    declareFunction(myName, "set_problem_tactics_recompute_set_aside_wrt_all_motivations", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-MOTIVATIONS", 2, 0, false);
    declareFunction(myName, "set_problem_tactics_recompute_set_aside_wrt_all_relevant_strategies_and_all_motivations", "SET-PROBLEM-TACTICS-RECOMPUTE-SET-ASIDE-WRT-ALL-RELEVANT-STRATEGIES-AND-ALL-MOTIVATIONS", 1, 0, false);
    declareFunction(myName, "problem_strategically_possible_tactic_count", "PROBLEM-STRATEGICALLY-POSSIBLE-TACTIC-COUNT", 2, 0, false);
    declareFunction(myName, "problem_note_tactic_strategically_possible", "PROBLEM-NOTE-TACTIC-STRATEGICALLY-POSSIBLE", 3, 0, false);
    declareFunction(myName, "problem_note_tactic_not_strategically_possible", "PROBLEM-NOTE-TACTIC-NOT-STRATEGICALLY-POSSIBLE", 3, 0, false);
    declareFunction(myName, "problem_note_all_tactics_not_strategically_possible", "PROBLEM-NOTE-ALL-TACTICS-NOT-STRATEGICALLY-POSSIBLE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_strategy_file() {
    $dtp_strategy$ = defconstant("*DTP-STRATEGY*", $sym0$STRATEGY);
    $current_strategy_wrt_memoization$ = defparameter("*CURRENT-STRATEGY-WRT-MEMOIZATION*", NIL);
    $strategy_type_store$ = deflexical("*STRATEGY-TYPE-STORE*", ((NIL != Symbols.boundp($sym107$_STRATEGY_TYPE_STORE_)) ? ((SubLObject) $strategy_type_store$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQ), FIVE_INTEGER)));
    $uninterestingness_cache_lookup_enabledP$ = defparameter("*UNINTERESTINGNESS-CACHE-LOOKUP-ENABLED?*", T);
    $default_uninterestingness_flags$ = defconstant("*DEFAULT-UNINTERESTINGNESS-FLAGS*", ZERO_INTEGER);
    $uninterestingness_cache_thrown_away_wrt_removal_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-REMOVAL-BYTE*", bytes.sublisp_byte(TWO_INTEGER, ZERO_INTEGER));
    $uninterestingness_cache_thrown_away_wrt_transformation_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-TRANSFORMATION-BYTE*", bytes.sublisp_byte(TWO_INTEGER, TWO_INTEGER));
    $uninterestingness_cache_thrown_away_wrt_new_root_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-WRT-NEW-ROOT-BYTE*", bytes.sublisp_byte(TWO_INTEGER, FOUR_INTEGER));
    $uninterestingness_cache_set_aside_wrt_removal_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-REMOVAL-BYTE*", bytes.sublisp_byte(TWO_INTEGER, SIX_INTEGER));
    $uninterestingness_cache_set_aside_wrt_transformation_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-TRANSFORMATION-BYTE*", bytes.sublisp_byte(TWO_INTEGER, EIGHT_INTEGER));
    $uninterestingness_cache_set_aside_wrt_new_root_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-WRT-NEW-ROOT-BYTE*", bytes.sublisp_byte(TWO_INTEGER, TEN_INTEGER));
    $uninterestingness_cache_thrown_away_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-THROWN-AWAY-BYTE*", bytes.sublisp_byte(TWO_INTEGER, TWELVE_INTEGER));
    $uninterestingness_cache_set_aside_byte$ = defconstant("*UNINTERESTINGNESS-CACHE-SET-ASIDE-BYTE*", bytes.sublisp_byte(TWO_INTEGER, FOURTEEN_INTEGER));
    $dtp_problem_strategic_properties$ = defconstant("*DTP-PROBLEM-STRATEGIC-PROPERTIES*", $sym113$PROBLEM_STRATEGIC_PROPERTIES);
    $dtp_tactic_strategic_properties$ = defconstant("*DTP-TACTIC-STRATEGIC-PROPERTIES*", $sym149$TACTIC_STRATEGIC_PROPERTIES);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_strategy_file() {
    // CVS_ID("Id: inference-datastructures-strategy.lisp 128760 2009-09-15 04:40:33Z pace ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), Symbols.symbol_function($sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$STRAT_SUID, $sym9$_CSETF_STRAT_SUID);
    Structures.def_csetf($sym10$STRAT_INFERENCE, $sym11$_CSETF_STRAT_INFERENCE);
    Structures.def_csetf($sym12$STRAT_RESULT_UNIQUENESS_CRITERION, $sym13$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION);
    Structures.def_csetf($sym14$STRAT_ACTIVE_PROBLEMS, $sym15$_CSETF_STRAT_ACTIVE_PROBLEMS);
    Structures.def_csetf($sym16$STRAT_MOTIVATED_PROBLEMS, $sym17$_CSETF_STRAT_MOTIVATED_PROBLEMS);
    Structures.def_csetf($sym18$STRAT_SET_ASIDE_PROBLEMS, $sym19$_CSETF_STRAT_SET_ASIDE_PROBLEMS);
    Structures.def_csetf($sym20$STRAT_SHOULD_RECONSIDER_SET_ASIDES_, $sym21$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_);
    Structures.def_csetf($sym22$STRAT_PRODUCTIVITY_LIMIT, $sym23$_CSETF_STRAT_PRODUCTIVITY_LIMIT);
    Structures.def_csetf($sym24$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, $sym25$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT);
    Structures.def_csetf($sym26$STRAT_PROOF_SPEC, $sym27$_CSETF_STRAT_PROOF_SPEC);
    Structures.def_csetf($sym28$STRAT_PROBLEM_PROOF_SPEC_INDEX, $sym29$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX);
    Structures.def_csetf($sym30$STRAT_PROBLEM_STRATEGIC_INDEX, $sym31$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX);
    Structures.def_csetf($sym32$STRAT_MEMOIZATION_STATE, $sym33$_CSETF_STRAT_MEMOIZATION_STATE);
    Structures.def_csetf($sym34$STRAT_TYPE, $sym35$_CSETF_STRAT_TYPE);
    Structures.def_csetf($sym36$STRAT_DATA, $sym37$_CSETF_STRAT_DATA);
    Equality.identity($sym0$STRATEGY);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_strategy$.getGlobalValue(), Symbols.symbol_function($sym57$SXHASH_STRATEGY_METHOD));
    access_macros.register_macro_helper($sym61$STRATEGY_ACTIVE_PROBLEMS, $sym62$DO_STRATEGY_ACTIVE_PROBLEMS);
    access_macros.register_macro_helper($sym63$STRATEGY_MOTIVATED_PROBLEMS, $sym64$DO_STRATEGY_MOTIVATED_PROBLEMS);
    access_macros.register_macro_helper($sym65$STRATEGY_SET_ASIDE_PROBLEMS, $sym66$DO_STRATEGY_SET_ASIDE_PROBLEMS);
    access_macros.register_macro_helper($sym80$STRATEGY_MEMOIZATION_STATE, $sym83$WITH_STRATEGY_MEMOIZATION_STATE);
    access_macros.register_macro_helper($sym84$CURRENT_STRATEGY_WRT_MEMOIZATION, $sym83$WITH_STRATEGY_MEMOIZATION_STATE);
    subl_macro_promotions.declare_defglobal($sym107$_STRATEGY_TYPE_STORE_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_strategic_properties$.getGlobalValue(), Symbols.symbol_function($sym120$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym121$PROB_STRATEGIC_PROPERTIES_STATUS, $sym122$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS);
    Structures.def_csetf($sym123$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX, $sym124$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX);
    Structures.def_csetf($sym125$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT, $sym126$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT);
    Structures.def_csetf($sym127$PROB_STRATEGIC_PROPERTIES_FLAGS, $sym128$_CSETF_PROB_STRATEGIC_PROPERTIES_FLAGS);
    Equality.identity($sym113$PROBLEM_STRATEGIC_PROPERTIES);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tactic_strategic_properties$.getGlobalValue(), Symbols.symbol_function($sym155$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym156$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL, $sym157$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL);
    Structures.def_csetf($sym158$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION, $sym159$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION);
    Structures.def_csetf($sym160$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY, $sym161$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY);
    Structures.def_csetf($sym162$TACT_STRATEGIC_PROPERTIES_FLAGS, $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_FLAGS);
    Equality.identity($sym149$TACTIC_STRATEGIC_PROPERTIES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$STRATEGY = makeSymbol("STRATEGY");
  public static final SubLSymbol $sym1$STRATEGY_P = makeSymbol("STRATEGY-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("SUID"), makeSymbol("INFERENCE"), makeSymbol("RESULT-UNIQUENESS-CRITERION"), makeSymbol("ACTIVE-PROBLEMS"), makeSymbol("MOTIVATED-PROBLEMS"), makeSymbol("SET-ASIDE-PROBLEMS"), makeSymbol("SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("PRODUCTIVITY-LIMIT"), makeSymbol("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("PROOF-SPEC"), makeSymbol("PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("PROBLEM-STRATEGIC-INDEX"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("TYPE"), makeSymbol("DATA")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("SUID"), makeKeyword("INFERENCE"), makeKeyword("RESULT-UNIQUENESS-CRITERION"), makeKeyword("ACTIVE-PROBLEMS"), makeKeyword("MOTIVATED-PROBLEMS"), makeKeyword("SET-ASIDE-PROBLEMS"), makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PROOF-SPEC"), makeKeyword("PROBLEM-PROOF-SPEC-INDEX"), makeKeyword("PROBLEM-STRATEGIC-INDEX"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("TYPE"), makeKeyword("DATA")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("STRAT-SUID"), makeSymbol("STRAT-INFERENCE"), makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION"), makeSymbol("STRAT-ACTIVE-PROBLEMS"), makeSymbol("STRAT-MOTIVATED-PROBLEMS"), makeSymbol("STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("STRAT-PRODUCTIVITY-LIMIT"), makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("STRAT-PROOF-SPEC"), makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX"), makeSymbol("STRAT-MEMOIZATION-STATE"), makeSymbol("STRAT-TYPE"), makeSymbol("STRAT-DATA")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-STRAT-SUID"), makeSymbol("_CSETF-STRAT-INFERENCE"), makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION"), makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS"), makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS"), makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS"), makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?"), makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT"), makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeSymbol("_CSETF-STRAT-PROOF-SPEC"), makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX"), makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX"), makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE"), makeSymbol("_CSETF-STRAT-TYPE"), makeSymbol("_CSETF-STRAT-DATA")});
  public static final SubLSymbol $sym6$PRINT_STRATEGY = makeSymbol("PRINT-STRATEGY");
  public static final SubLSymbol $sym7$STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("STRATEGY-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$STRAT_SUID = makeSymbol("STRAT-SUID");
  public static final SubLSymbol $sym9$_CSETF_STRAT_SUID = makeSymbol("_CSETF-STRAT-SUID");
  public static final SubLSymbol $sym10$STRAT_INFERENCE = makeSymbol("STRAT-INFERENCE");
  public static final SubLSymbol $sym11$_CSETF_STRAT_INFERENCE = makeSymbol("_CSETF-STRAT-INFERENCE");
  public static final SubLSymbol $sym12$STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol("STRAT-RESULT-UNIQUENESS-CRITERION");
  public static final SubLSymbol $sym13$_CSETF_STRAT_RESULT_UNIQUENESS_CRITERION = makeSymbol("_CSETF-STRAT-RESULT-UNIQUENESS-CRITERION");
  public static final SubLSymbol $sym14$STRAT_ACTIVE_PROBLEMS = makeSymbol("STRAT-ACTIVE-PROBLEMS");
  public static final SubLSymbol $sym15$_CSETF_STRAT_ACTIVE_PROBLEMS = makeSymbol("_CSETF-STRAT-ACTIVE-PROBLEMS");
  public static final SubLSymbol $sym16$STRAT_MOTIVATED_PROBLEMS = makeSymbol("STRAT-MOTIVATED-PROBLEMS");
  public static final SubLSymbol $sym17$_CSETF_STRAT_MOTIVATED_PROBLEMS = makeSymbol("_CSETF-STRAT-MOTIVATED-PROBLEMS");
  public static final SubLSymbol $sym18$STRAT_SET_ASIDE_PROBLEMS = makeSymbol("STRAT-SET-ASIDE-PROBLEMS");
  public static final SubLSymbol $sym19$_CSETF_STRAT_SET_ASIDE_PROBLEMS = makeSymbol("_CSETF-STRAT-SET-ASIDE-PROBLEMS");
  public static final SubLSymbol $sym20$STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol("STRAT-SHOULD-RECONSIDER-SET-ASIDES?");
  public static final SubLSymbol $sym21$_CSETF_STRAT_SHOULD_RECONSIDER_SET_ASIDES_ = makeSymbol("_CSETF-STRAT-SHOULD-RECONSIDER-SET-ASIDES?");
  public static final SubLSymbol $sym22$STRAT_PRODUCTIVITY_LIMIT = makeSymbol("STRAT-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $sym23$_CSETF_STRAT_PRODUCTIVITY_LIMIT = makeSymbol("_CSETF-STRAT-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $sym24$STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol("STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $sym25$_CSETF_STRAT_REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeSymbol("_CSETF-STRAT-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $sym26$STRAT_PROOF_SPEC = makeSymbol("STRAT-PROOF-SPEC");
  public static final SubLSymbol $sym27$_CSETF_STRAT_PROOF_SPEC = makeSymbol("_CSETF-STRAT-PROOF-SPEC");
  public static final SubLSymbol $sym28$STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol("STRAT-PROBLEM-PROOF-SPEC-INDEX");
  public static final SubLSymbol $sym29$_CSETF_STRAT_PROBLEM_PROOF_SPEC_INDEX = makeSymbol("_CSETF-STRAT-PROBLEM-PROOF-SPEC-INDEX");
  public static final SubLSymbol $sym30$STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol("STRAT-PROBLEM-STRATEGIC-INDEX");
  public static final SubLSymbol $sym31$_CSETF_STRAT_PROBLEM_STRATEGIC_INDEX = makeSymbol("_CSETF-STRAT-PROBLEM-STRATEGIC-INDEX");
  public static final SubLSymbol $sym32$STRAT_MEMOIZATION_STATE = makeSymbol("STRAT-MEMOIZATION-STATE");
  public static final SubLSymbol $sym33$_CSETF_STRAT_MEMOIZATION_STATE = makeSymbol("_CSETF-STRAT-MEMOIZATION-STATE");
  public static final SubLSymbol $sym34$STRAT_TYPE = makeSymbol("STRAT-TYPE");
  public static final SubLSymbol $sym35$_CSETF_STRAT_TYPE = makeSymbol("_CSETF-STRAT-TYPE");
  public static final SubLSymbol $sym36$STRAT_DATA = makeSymbol("STRAT-DATA");
  public static final SubLSymbol $sym37$_CSETF_STRAT_DATA = makeSymbol("_CSETF-STRAT-DATA");
  public static final SubLSymbol $kw38$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw39$INFERENCE = makeKeyword("INFERENCE");
  public static final SubLSymbol $kw40$RESULT_UNIQUENESS_CRITERION = makeKeyword("RESULT-UNIQUENESS-CRITERION");
  public static final SubLSymbol $kw41$ACTIVE_PROBLEMS = makeKeyword("ACTIVE-PROBLEMS");
  public static final SubLSymbol $kw42$MOTIVATED_PROBLEMS = makeKeyword("MOTIVATED-PROBLEMS");
  public static final SubLSymbol $kw43$SET_ASIDE_PROBLEMS = makeKeyword("SET-ASIDE-PROBLEMS");
  public static final SubLSymbol $kw44$SHOULD_RECONSIDER_SET_ASIDES_ = makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?");
  public static final SubLSymbol $kw45$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw46$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw47$PROOF_SPEC = makeKeyword("PROOF-SPEC");
  public static final SubLSymbol $kw48$PROBLEM_PROOF_SPEC_INDEX = makeKeyword("PROBLEM-PROOF-SPEC-INDEX");
  public static final SubLSymbol $kw49$PROBLEM_STRATEGIC_INDEX = makeKeyword("PROBLEM-STRATEGIC-INDEX");
  public static final SubLSymbol $kw50$MEMOIZATION_STATE = makeKeyword("MEMOIZATION-STATE");
  public static final SubLSymbol $kw51$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw52$DATA = makeKeyword("DATA");
  public static final SubLString $str53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw54$FREE = makeKeyword("FREE");
  public static final SubLString $str55$_Invalid_STRATEGY__s_ = makeString("<Invalid STRATEGY ~s>");
  public static final SubLString $str56$__a_STRATEGY__a__a_for_inference_ = makeString("<~a STRATEGY ~a.~a for inference ~a.~a>");
  public static final SubLSymbol $sym57$SXHASH_STRATEGY_METHOD = makeSymbol("SXHASH-STRATEGY-METHOD");
  public static final SubLSymbol $sym58$STRATEGY_TYPE_P = makeSymbol("STRATEGY-TYPE-P");
  public static final SubLSymbol $sym59$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $kw60$CONSTRUCTOR = makeKeyword("CONSTRUCTOR");
  public static final SubLSymbol $sym61$STRATEGY_ACTIVE_PROBLEMS = makeSymbol("STRATEGY-ACTIVE-PROBLEMS");
  public static final SubLSymbol $sym62$DO_STRATEGY_ACTIVE_PROBLEMS = makeSymbol("DO-STRATEGY-ACTIVE-PROBLEMS");
  public static final SubLSymbol $sym63$STRATEGY_MOTIVATED_PROBLEMS = makeSymbol("STRATEGY-MOTIVATED-PROBLEMS");
  public static final SubLSymbol $sym64$DO_STRATEGY_MOTIVATED_PROBLEMS = makeSymbol("DO-STRATEGY-MOTIVATED-PROBLEMS");
  public static final SubLSymbol $sym65$STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol("STRATEGY-SET-ASIDE-PROBLEMS");
  public static final SubLSymbol $sym66$DO_STRATEGY_SET_ASIDE_PROBLEMS = makeSymbol("DO-STRATEGY-SET-ASIDE-PROBLEMS");
  public static final SubLSymbol $sym67$RESULT_UNIQUENESS_CRITERION_P = makeSymbol("RESULT-UNIQUENESS-CRITERION-P");
  public static final SubLSymbol $sym68$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
  public static final SubLSymbol $sym69$PROOF_SPEC_P = makeSymbol("PROOF-SPEC-P");
  public static final SubLList $list70 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list71 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw72$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw73$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym74$DO_SET = makeSymbol("DO-SET");
  public static final SubLSymbol $sym75$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLList $list76 = list(makeSymbol("STRATEGY"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym77$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");
  public static final SubLSymbol $sym78$STATE_VAR = makeUninternedSymbol("STATE-VAR");
  public static final SubLSymbol $sym79$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym80$STRATEGY_MEMOIZATION_STATE = makeSymbol("STRATEGY-MEMOIZATION-STATE");
  public static final SubLSymbol $sym81$_CURRENT_STRATEGY_WRT_MEMOIZATION_ = makeSymbol("*CURRENT-STRATEGY-WRT-MEMOIZATION*");
  public static final SubLSymbol $sym82$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
  public static final SubLSymbol $sym83$WITH_STRATEGY_MEMOIZATION_STATE = makeSymbol("WITH-STRATEGY-MEMOIZATION-STATE");
  public static final SubLSymbol $sym84$CURRENT_STRATEGY_WRT_MEMOIZATION = makeSymbol("CURRENT-STRATEGY-WRT-MEMOIZATION");
  public static final SubLSymbol $sym85$VALID_PROBLEM_P = makeSymbol("VALID-PROBLEM-P");
  public static final SubLSymbol $kw86$PROOF = makeKeyword("PROOF");
  public static final SubLSymbol $kw87$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $sym88$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $kw89$ANYTHING = makeKeyword("ANYTHING");
  public static final SubLSymbol $sym90$STRATEGY_PROPERTY_P = makeSymbol("STRATEGY-PROPERTY-P");
  public static final SubLString $str91$Unexpected_strategy_property__s_w = makeString("Unexpected strategy property ~s with value ~s");
  public static final SubLSymbol $sym92$STRATEGY_PROPERTIES_P = makeSymbol("STRATEGY-PROPERTIES-P");
  public static final SubLSymbol $kw93$SUBSTRATEGY_STRATEGEM_MOTIVATED = makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");
  public static final SubLList $list94 = list(list(makeSymbol("STRATEGY"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym95$STRATEGY_VAR = makeUninternedSymbol("STRATEGY-VAR");
  public static final SubLSymbol $sym96$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");
  public static final SubLSymbol $sym97$STRATEGY_NOTE_PROBLEM_ACTIVE = makeSymbol("STRATEGY-NOTE-PROBLEM-ACTIVE");
  public static final SubLSymbol $sym98$STRATEGY_NOTE_PROBLEM_INACTIVE = makeSymbol("STRATEGY-NOTE-PROBLEM-INACTIVE");
  public static final SubLSymbol $sym99$POSSIBLY_REACTIVATE_PROBLEM = makeSymbol("POSSIBLY-REACTIVATE-PROBLEM");
  public static final SubLSymbol $kw100$NOTHING = makeKeyword("NOTHING");
  public static final SubLString $str101$balancing_tactician_does_not_impl = makeString("balancing tactician does not implement ~a");
  public static final SubLSymbol $sym102$BALANCED_STRATEGY_DEFAULT_SELECT_BEST_STRATEGEM = makeSymbol("BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM");
  public static final SubLSymbol $sym103$BALANCED_STRATEGY_DO_ONE_STEP = makeSymbol("BALANCED-STRATEGY-DO-ONE-STEP");
  public static final SubLSymbol $sym104$BALANCED_STRATEGY_DONE_ = makeSymbol("BALANCED-STRATEGY-DONE?");
  public static final SubLSymbol $sym105$BALANCED_STRATEGY_POSSIBLY_ACTIVATE_PROBLEM = makeSymbol("BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM");
  public static final SubLString $str106$Unexpected_strategy_type__a = makeString("Unexpected strategy type ~a");
  public static final SubLSymbol $sym107$_STRATEGY_TYPE_STORE_ = makeSymbol("*STRATEGY-TYPE-STORE*");
  public static final SubLSymbol $sym108$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym109$STRATEGY_TYPE_PROPERTY_P = makeSymbol("STRATEGY-TYPE-PROPERTY-P");
  public static final SubLSymbol $kw110$RECOMPUTE = makeKeyword("RECOMPUTE");
  public static final SubLString $str111$invalid_uninterestingness_cache_c = makeString("invalid uninterestingness cache code ~s");
  public static final SubLString $str112$invalid_uninterestingness_cache_s = makeString("invalid uninterestingness cache status ~s");
  public static final SubLSymbol $sym113$PROBLEM_STRATEGIC_PROPERTIES = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES");
  public static final SubLSymbol $sym114$PROBLEM_STRATEGIC_PROPERTIES_P = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-P");
  public static final SubLList $list115 = list(makeSymbol("STATUS"), makeSymbol("TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("POSSIBLE-TACTIC-COUNT"), makeSymbol("FLAGS"));
  public static final SubLList $list116 = list(makeKeyword("STATUS"), makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX"), makeKeyword("POSSIBLE-TACTIC-COUNT"), makeKeyword("FLAGS"));
  public static final SubLList $list117 = list(makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS"), makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"), makeSymbol("PROB-STRATEGIC-PROPERTIES-FLAGS"));
  public static final SubLList $list118 = list(makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS"), makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX"), makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT"), makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS"));
  public static final SubLSymbol $sym119$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym120$PROBLEM_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym121$PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("PROB-STRATEGIC-PROPERTIES-STATUS");
  public static final SubLSymbol $sym122$_CSETF_PROB_STRATEGIC_PROPERTIES_STATUS = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-STATUS");
  public static final SubLSymbol $sym123$PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol("PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");
  public static final SubLSymbol $sym124$_CSETF_PROB_STRATEGIC_PROPERTIES_TACTIC_STRATEGIC_PROPERTY_INDEX = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-TACTIC-STRATEGIC-PROPERTY-INDEX");
  public static final SubLSymbol $sym125$PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol("PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");
  public static final SubLSymbol $sym126$_CSETF_PROB_STRATEGIC_PROPERTIES_POSSIBLE_TACTIC_COUNT = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-POSSIBLE-TACTIC-COUNT");
  public static final SubLSymbol $sym127$PROB_STRATEGIC_PROPERTIES_FLAGS = makeSymbol("PROB-STRATEGIC-PROPERTIES-FLAGS");
  public static final SubLSymbol $sym128$_CSETF_PROB_STRATEGIC_PROPERTIES_FLAGS = makeSymbol("_CSETF-PROB-STRATEGIC-PROPERTIES-FLAGS");
  public static final SubLSymbol $kw129$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw130$TACTIC_STRATEGIC_PROPERTY_INDEX = makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX");
  public static final SubLSymbol $kw131$POSSIBLE_TACTIC_COUNT = makeKeyword("POSSIBLE-TACTIC-COUNT");
  public static final SubLSymbol $kw132$FLAGS = makeKeyword("FLAGS");
  public static final SubLSymbol $kw133$NEW = makeKeyword("NEW");
  public static final SubLSymbol $kw134$UNEXAMINED = makeKeyword("UNEXAMINED");
  public static final SubLSymbol $kw135$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $kw136$NEUTRAL = makeKeyword("NEUTRAL");
  public static final SubLSymbol $kw137$GOOD = makeKeyword("GOOD");
  public static final SubLSymbol $kw138$NO_GOOD = makeKeyword("NO-GOOD");
  public static final SubLSymbol $sym139$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
  public static final SubLSymbol $kw140$EXAMINED = makeKeyword("EXAMINED");
  public static final SubLSymbol $kw141$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw142$PENDING = makeKeyword("PENDING");
  public static final SubLSymbol $sym143$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $kw144$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw145$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw146$NEW_ROOT = makeKeyword("NEW-ROOT");
  public static final SubLString $str147$unexpected_motivation__s = makeString("unexpected motivation ~s");
  public static final SubLSymbol $kw148$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym149$TACTIC_STRATEGIC_PROPERTIES = makeSymbol("TACTIC-STRATEGIC-PROPERTIES");
  public static final SubLSymbol $sym150$TACTIC_STRATEGIC_PROPERTIES_P = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-P");
  public static final SubLList $list151 = list(makeSymbol("PREFERENCE-LEVEL"), makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("FLAGS"));
  public static final SubLList $list152 = list(makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("FLAGS"));
  public static final SubLList $list153 = list(makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"), makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), makeSymbol("TACT-STRATEGIC-PROPERTIES-FLAGS"));
  public static final SubLList $list154 = list(makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL"), makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS"));
  public static final SubLSymbol $sym155$TACTIC_STRATEGIC_PROPERTIES_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TACTIC-STRATEGIC-PROPERTIES-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym156$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");
  public static final SubLSymbol $sym157$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL");
  public static final SubLSymbol $sym158$TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");
  public static final SubLSymbol $sym159$_CSETF_TACT_STRATEGIC_PROPERTIES_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PREFERENCE-LEVEL-JUSTIFICATION");
  public static final SubLSymbol $sym160$TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol("TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");
  public static final SubLSymbol $sym161$_CSETF_TACT_STRATEGIC_PROPERTIES_PRODUCTIVITY = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-PRODUCTIVITY");
  public static final SubLSymbol $sym162$TACT_STRATEGIC_PROPERTIES_FLAGS = makeSymbol("TACT-STRATEGIC-PROPERTIES-FLAGS");
  public static final SubLSymbol $sym163$_CSETF_TACT_STRATEGIC_PROPERTIES_FLAGS = makeSymbol("_CSETF-TACT-STRATEGIC-PROPERTIES-FLAGS");
  public static final SubLSymbol $kw164$PREFERENCE_LEVEL = makeKeyword("PREFERENCE-LEVEL");
  public static final SubLSymbol $kw165$PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
  public static final SubLSymbol $kw166$PRODUCTIVITY = makeKeyword("PRODUCTIVITY");
  public static final SubLSymbol $kw167$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLString $str168$ = makeString("");
  public static final SubLSymbol $sym169$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $kw170$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLString $str171$structural_tactic__s_cannot_have_ = makeString("structural tactic ~s cannot have a completeness");
  public static final SubLString $str172$content_tactic__s_cannot_have_a_p = makeString("content tactic ~s cannot have a preference level");
  public static final SubLString $str173$content_tactic__s_cannot_have_a_p = makeString("content tactic ~s cannot have a preference level justification");
  public static final SubLSymbol $sym174$GENERALIZED_CONJUNCTIVE_TACTIC_P = makeSymbol("GENERALIZED-CONJUNCTIVE-TACTIC-P");
  public static final SubLSymbol $kw175$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $sym176$PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_strategy_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_strategy_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_strategy_file();
  }

}
