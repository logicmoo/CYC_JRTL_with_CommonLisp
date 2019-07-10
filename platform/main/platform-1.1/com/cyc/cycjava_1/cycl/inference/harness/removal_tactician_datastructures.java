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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.stacks;

public  final class removal_tactician_datastructures extends SubLTranslatedFile {

  //// Constructor

  private removal_tactician_datastructures() {}
  public static final SubLFile me = new removal_tactician_datastructures();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.removal_tactician_datastructures";

  //// Definitions

  public static final class $removal_strategy_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $link_heads_motivated; }
    public SubLObject getField3() { return $problems_pending; }
    public SubLObject getField4() { return $removal_strategem_index; }
    public SubLObject getField5() { return $problem_total_strategems_active; }
    public SubLObject getField6() { return $problem_strategems_set_aside; }
    public SubLObject getField7() { return $problem_strategems_thrown_away; }
    public SubLObject setField2(SubLObject value) { return $link_heads_motivated = value; }
    public SubLObject setField3(SubLObject value) { return $problems_pending = value; }
    public SubLObject setField4(SubLObject value) { return $removal_strategem_index = value; }
    public SubLObject setField5(SubLObject value) { return $problem_total_strategems_active = value; }
    public SubLObject setField6(SubLObject value) { return $problem_strategems_set_aside = value; }
    public SubLObject setField7(SubLObject value) { return $problem_strategems_thrown_away = value; }
    public SubLObject $link_heads_motivated = NIL;
    public SubLObject $problems_pending = NIL;
    public SubLObject $removal_strategem_index = NIL;
    public SubLObject $problem_total_strategems_active = NIL;
    public SubLObject $problem_strategems_set_aside = NIL;
    public SubLObject $problem_strategems_thrown_away = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($removal_strategy_data_native.class, $sym0$REMOVAL_STRATEGY_DATA, $sym1$REMOVAL_STRATEGY_DATA_P, $list2, $list3, new String[] {"$link_heads_motivated", "$problems_pending", "$removal_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static SubLSymbol $dtp_removal_strategy_data$ = null;

  public static final class $removal_strategy_data_p$UnaryFunction extends UnaryFunction {
    public $removal_strategy_data_p$UnaryFunction() { super(extractFunctionNamed("REMOVAL-STRATEGY-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36533"); }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject rem_strat_data_link_heads_motivated(SubLObject object) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject rem_strat_data_problems_pending(SubLObject object) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject rem_strat_data_removal_strategem_index(SubLObject object) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject rem_strat_data_problem_total_strategems_active(SubLObject object) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject rem_strat_data_problem_strategems_set_aside(SubLObject object) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject rem_strat_data_problem_strategems_thrown_away(SubLObject object) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject _csetf_rem_strat_data_link_heads_motivated(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject _csetf_rem_strat_data_problems_pending(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject _csetf_rem_strat_data_removal_strategem_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject _csetf_rem_strat_data_problem_total_strategems_active(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject _csetf_rem_strat_data_problem_strategems_set_aside(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject _csetf_rem_strat_data_problem_strategems_thrown_away(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_STRATEGY_DATA_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 1334) 
  public static final SubLObject make_removal_strategy_data(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $removal_strategy_data_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw20$LINK_HEADS_MOTIVATED)) {
            _csetf_rem_strat_data_link_heads_motivated(v_new, current_value);
          } else if (pcase_var.eql($kw21$PROBLEMS_PENDING)) {
            _csetf_rem_strat_data_problems_pending(v_new, current_value);
          } else if (pcase_var.eql($kw22$REMOVAL_STRATEGEM_INDEX)) {
            _csetf_rem_strat_data_removal_strategem_index(v_new, current_value);
          } else if (pcase_var.eql($kw23$PROBLEM_TOTAL_STRATEGEMS_ACTIVE)) {
            _csetf_rem_strat_data_problem_total_strategems_active(v_new, current_value);
          } else if (pcase_var.eql($kw24$PROBLEM_STRATEGEMS_SET_ASIDE)) {
            _csetf_rem_strat_data_problem_strategems_set_aside(v_new, current_value);
          } else if (pcase_var.eql($kw25$PROBLEM_STRATEGEMS_THROWN_AWAY)) {
            _csetf_rem_strat_data_problem_strategems_thrown_away(v_new, current_value);
          } else {
            Errors.error($str26$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 2714) 
  public static final SubLObject new_removal_strategy_data(SubLObject removal_index) {
    {
      SubLObject data = make_removal_strategy_data(UNPROVIDED);
      _csetf_rem_strat_data_link_heads_motivated(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_rem_strat_data_problems_pending(data, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_rem_strat_data_removal_strategem_index(data, removal_index);
      _csetf_rem_strat_data_problem_total_strategems_active(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_rem_strat_data_problem_strategems_set_aside(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      _csetf_rem_strat_data_problem_strategems_thrown_away(data, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
      return data;
    }
  }

  /** @return set-p of motivation-strategem-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 3419) 
  public static final SubLObject removal_strategy_link_heads_motivated(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return rem_strat_data_link_heads_motivated(data);
    }
  }

  /** @return set-p of problem-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 3705) 
  public static final SubLObject removal_strategy_problems_pending(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return rem_strat_data_problems_pending(data);
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 3934) 
  public static final SubLObject removal_strategy_strategem_index(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return rem_strat_data_removal_strategem_index(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> non-negative-integer-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4177) 
  public static final SubLObject removal_strategy_problem_total_strategems_active(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return rem_strat_data_problem_total_strategems_active(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4474) 
  public static final SubLObject removal_strategy_problem_strategems_set_aside(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return rem_strat_data_problem_strategems_set_aside(data);
    }
  }

  /** @return #'EQ dictionary of problem-p -> #'EQ set of strategem-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 4766) 
  public static final SubLObject removal_strategy_problem_strategems_thrown_away(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    {
      SubLObject data = inference_datastructures_strategy.strategy_data(strategy);
      return rem_strat_data_problem_strategems_thrown_away(data);
    }
  }

  /** Return T iff removal motivation should propagate through LINK-HEAD in STRATEGY */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 5062) 
  public static final SubLObject removal_strategy_link_head_motivatedP(SubLObject strategy, SubLObject link_head) {
    checkType(link_head, $sym28$MOTIVATION_STRATEGEM_P);
    return set.set_memberP(link_head, removal_strategy_link_heads_motivated(strategy));
  }

  /** Return T iff PROBLEM is pending in STRATEGY */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 5749) 
  public static final SubLObject removal_strategy_problem_pendingP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym30$PROBLEM_P);
    return set.set_memberP(problem, removal_strategy_problems_pending(strategy));
  }

  /** @return booleanp; whether PROBLEM is actively being considered for removal by STRATEGY. */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 5979) 
  public static final SubLObject removal_strategy_problem_activeP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym30$PROBLEM_P);
    {
      SubLObject index = removal_strategy_problem_total_strategems_active(strategy);
      return Numbers.plusp(dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER));
    }
  }

  /** @return booleanp; whether PROBLEM has been set aside for later removal consideration by STRATEGY. */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 6326) 
  public static final SubLObject removal_strategy_problem_set_asideP(SubLObject strategy, SubLObject problem) {
    checkType(problem, $sym30$PROBLEM_P);
    if ((NIL == removal_strategy_problem_activeP(strategy, problem))) {
      {
        SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
        SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
        if (((NIL != v_set)
             && (NIL == set.set_emptyP(v_set)))) {
          return T;
        }
      }
    }
    return NIL;
  }

  /** @return booleanp; whether STRATEGEM has been set aside for later removal consideration by STRATEGY. */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 6802) 
  public static final SubLObject removal_strategy_strategem_set_asideP(SubLObject strategy, SubLObject strategem) {
    checkType(strategem, $sym31$STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      return makeBoolean(((NIL != set.set_p(v_set))
             && (NIL != set.set_memberP(strategem, v_set))));
    }
  }

  /** @return booleanp; whether STRATEGEM has been thrown away by STRATEGY. */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 7272) 
  public static final SubLObject removal_strategy_strategem_thrown_awayP(SubLObject strategy, SubLObject strategem) {
    checkType(strategem, $sym31$STRATEGEM_P);
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = removal_strategy_problem_strategems_thrown_away(strategy);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      return makeBoolean(((NIL != set.set_p(v_set))
             && (NIL != set.set_memberP(strategem, v_set))));
    }
  }

  /** @return nil or productivity-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 7716) 
  public static final SubLObject removal_strategy_removal_backtracking_productivity_limit(SubLObject strategy) {
    return inference_datastructures_strategy.strategy_removal_backtracking_productivity_limit(strategy);
  }

  /** @return nil or removal-strategem-p */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 7981) 
  public static final SubLObject removal_strategy_peek_strategem(SubLObject strategy) {
    {
      SubLObject removal_index = removal_strategy_strategem_index(strategy);
      if ((NIL == stacks.stack_empty_p(removal_index))) {
        return stacks.stack_peek(removal_index);
      }
    }
    return NIL;
  }

  /** note R */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8262) 
  public static final SubLObject removal_strategy_note_problem_motivated(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(problem, $sym30$PROBLEM_P);
    return inference_datastructures_strategy.strategy_note_problem_motivated(strategy, problem);
  }

  /** note R */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8501) 
  public static final SubLObject removal_strategy_note_link_head_motivated(SubLObject strategy, SubLObject link_head) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(link_head, $sym28$MOTIVATION_STRATEGEM_P);
    return set.set_add(link_head, removal_strategy_link_heads_motivated(strategy));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8763) 
  public static final SubLObject removal_strategy_note_problem_pending(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(problem, $sym30$PROBLEM_P);
    return set.set_add(problem, removal_strategy_problems_pending(strategy));
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 8988) 
  public static final SubLObject removal_strategy_note_problem_unpending(SubLObject strategy, SubLObject problem) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(problem, $sym30$PROBLEM_P);
    return set.set_remove(problem, removal_strategy_problems_pending(strategy));
  }

  /** note that STRATEGEM is in STRATEGY's R-box */
  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 9217) 
  public static final SubLObject removal_strategy_activate_strategem(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(strategem, $sym32$REMOVAL_STRATEGEM_P);
    {
      SubLObject removal_index = removal_strategy_strategem_index(strategy);
      stacks.stack_push(strategem, removal_index);
    }
    {
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject index = removal_strategy_problem_total_strategems_active(strategy);
      SubLObject count = dictionary.dictionary_lookup_without_values(index, problem, ZERO_INTEGER);
      count = Numbers.add(count, ONE_INTEGER);
      if (ONE_INTEGER.numE(count)) {
        removal_strategy_note_problem_unpending(strategy, problem);
      }
      dictionary.dictionary_enter(index, problem, count);
      return count;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 10117) 
  public static final SubLObject removal_strategy_pop_strategem(SubLObject strategy) {
    {
      SubLObject removal_index = removal_strategy_strategem_index(strategy);
      return stacks.stack_pop(removal_index);
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 10300) 
  public static final SubLObject removal_strategy_note_strategem_set_aside(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(strategem, $sym32$REMOVAL_STRATEGEM_P);
    {
      SubLObject index = removal_strategy_problem_strategems_set_aside(strategy);
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      if ((NIL == set.set_p(v_set))) {
        v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        dictionary.dictionary_enter(index, problem, v_set);
      }
      return set.set_add(strategem, v_set);
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 11174) 
  public static final SubLObject removal_strategy_note_strategem_thrown_away(SubLObject strategy, SubLObject strategem) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    checkType(strategem, $sym32$REMOVAL_STRATEGEM_P);
    {
      SubLObject index = removal_strategy_problem_strategems_thrown_away(strategy);
      SubLObject problem = inference_tactician.strategem_problem(strategem);
      SubLObject v_set = dictionary.dictionary_lookup_without_values(index, problem, NIL);
      if ((NIL == set.set_p(v_set))) {
        v_set = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        dictionary.dictionary_enter(index, problem, v_set);
      }
      return set.set_add(strategem, v_set);
    }
  }

  @SubL(source = "cycl/inference/harness/removal-tactician-datastructures.lisp", position = 11670) 
  public static final SubLObject removal_strategy_no_strategems_activeP(SubLObject strategy) {
    checkType(strategy, $sym27$REMOVAL_STRATEGY_P);
    return stacks.stack_empty_p(removal_strategy_strategem_index(strategy));
  }

  public static final SubLObject declare_removal_tactician_datastructures_file() {
    declareFunction(myName, "removal_strategy_data_print_function_trampoline", "REMOVAL-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "removal_strategy_data_p", "REMOVAL-STRATEGY-DATA-P", 1, 0, false); new $removal_strategy_data_p$UnaryFunction();
    declareFunction(myName, "rem_strat_data_link_heads_motivated", "REM-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
    declareFunction(myName, "rem_strat_data_problems_pending", "REM-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
    declareFunction(myName, "rem_strat_data_removal_strategem_index", "REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "rem_strat_data_problem_total_strategems_active", "REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
    declareFunction(myName, "rem_strat_data_problem_strategems_set_aside", "REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
    declareFunction(myName, "rem_strat_data_problem_strategems_thrown_away", "REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
    declareFunction(myName, "_csetf_rem_strat_data_link_heads_motivated", "_CSETF-REM-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
    declareFunction(myName, "_csetf_rem_strat_data_problems_pending", "_CSETF-REM-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
    declareFunction(myName, "_csetf_rem_strat_data_removal_strategem_index", "_CSETF-REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_rem_strat_data_problem_total_strategems_active", "_CSETF-REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
    declareFunction(myName, "_csetf_rem_strat_data_problem_strategems_set_aside", "_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "_csetf_rem_strat_data_problem_strategems_thrown_away", "_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "make_removal_strategy_data", "MAKE-REMOVAL-STRATEGY-DATA", 0, 1, false);
    declareFunction(myName, "new_removal_strategy_data", "NEW-REMOVAL-STRATEGY-DATA", 1, 0, false);
    declareFunction(myName, "removal_strategy_link_heads_motivated", "REMOVAL-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
    declareFunction(myName, "removal_strategy_problems_pending", "REMOVAL-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
    declareFunction(myName, "removal_strategy_strategem_index", "REMOVAL-STRATEGY-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "removal_strategy_problem_total_strategems_active", "REMOVAL-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
    declareFunction(myName, "removal_strategy_problem_strategems_set_aside", "REMOVAL-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
    declareFunction(myName, "removal_strategy_problem_strategems_thrown_away", "REMOVAL-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
    declareFunction(myName, "removal_strategy_link_head_motivatedP", "REMOVAL-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "removal_strategy_connected_conjunction_link_motivatedP", "REMOVAL-STRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "removal_strategy_problem_pendingP", "REMOVAL-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
    declareFunction(myName, "removal_strategy_problem_activeP", "REMOVAL-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_problem_set_asideP", "REMOVAL-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_strategem_set_asideP", "REMOVAL-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "removal_strategy_strategem_thrown_awayP", "REMOVAL-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
    declareFunction(myName, "removal_strategy_removal_backtracking_productivity_limit", "REMOVAL-STRATEGY-REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "removal_strategy_peek_strategem", "REMOVAL-STRATEGY-PEEK-STRATEGEM", 1, 0, false);
    declareFunction(myName, "removal_strategy_note_problem_motivated", "REMOVAL-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
    declareFunction(myName, "removal_strategy_note_link_head_motivated", "REMOVAL-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
    declareFunction(myName, "removal_strategy_note_problem_pending", "REMOVAL-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
    declareFunction(myName, "removal_strategy_note_problem_unpending", "REMOVAL-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
    declareFunction(myName, "removal_strategy_activate_strategem", "REMOVAL-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "removal_strategy_current_contents", "REMOVAL-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
    declareFunction(myName, "removal_strategy_pop_strategem", "REMOVAL-STRATEGY-POP-STRATEGEM", 1, 0, false);
    declareFunction(myName, "removal_strategy_note_strategem_set_aside", "REMOVAL-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "removal_strategy_clear_strategems_set_aside", "REMOVAL-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
    declareFunction(myName, "removal_strategy_note_strategem_thrown_away", "REMOVAL-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "removal_strategy_no_strategems_activeP", "REMOVAL-STRATEGY-NO-STRATEGEMS-ACTIVE?", 1, 0, false);
    declareFunction(myName, "removal_strategy_clear_set_aside_problems", "REMOVAL-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_tactician_datastructures_file() {
    $dtp_removal_strategy_data$ = defconstant("*DTP-REMOVAL-STRATEGY-DATA*", $sym0$REMOVAL_STRATEGY_DATA);
    return NIL;
  }

  public static final SubLObject setup_removal_tactician_datastructures_file() {
    // CVS_ID("Id: inference-removal-tactician-datastructures.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym7$REMOVAL_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$REM_STRAT_DATA_LINK_HEADS_MOTIVATED, $sym9$_CSETF_REM_STRAT_DATA_LINK_HEADS_MOTIVATED);
    Structures.def_csetf($sym10$REM_STRAT_DATA_PROBLEMS_PENDING, $sym11$_CSETF_REM_STRAT_DATA_PROBLEMS_PENDING);
    Structures.def_csetf($sym12$REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX, $sym13$_CSETF_REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX);
    Structures.def_csetf($sym14$REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, $sym15$_CSETF_REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
    Structures.def_csetf($sym16$REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, $sym17$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
    Structures.def_csetf($sym18$REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, $sym19$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
    Equality.identity($sym0$REMOVAL_STRATEGY_DATA);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$REMOVAL_STRATEGY_DATA = makeSymbol("REMOVAL-STRATEGY-DATA");
  public static final SubLSymbol $sym1$REMOVAL_STRATEGY_DATA_P = makeSymbol("REMOVAL-STRATEGY-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("REMOVAL-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLList $list3 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("REMOVAL-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLList $list4 = list(makeSymbol("REM-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("REM-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-REM-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$REMOVAL_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$REM_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("REM-STRAT-DATA-LINK-HEADS-MOTIVATED");
  public static final SubLSymbol $sym9$_CSETF_REM_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("_CSETF-REM-STRAT-DATA-LINK-HEADS-MOTIVATED");
  public static final SubLSymbol $sym10$REM_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("REM-STRAT-DATA-PROBLEMS-PENDING");
  public static final SubLSymbol $sym11$_CSETF_REM_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEMS-PENDING");
  public static final SubLSymbol $sym12$REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");
  public static final SubLSymbol $sym13$_CSETF_REM_STRAT_DATA_REMOVAL_STRATEGEM_INDEX = makeSymbol("_CSETF-REM-STRAT-DATA-REMOVAL-STRATEGEM-INDEX");
  public static final SubLSymbol $sym14$REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
  public static final SubLSymbol $sym15$_CSETF_REM_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
  public static final SubLSymbol $sym16$REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
  public static final SubLSymbol $sym17$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
  public static final SubLSymbol $sym18$REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
  public static final SubLSymbol $sym19$_CSETF_REM_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("_CSETF-REM-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
  public static final SubLSymbol $kw20$LINK_HEADS_MOTIVATED = makeKeyword("LINK-HEADS-MOTIVATED");
  public static final SubLSymbol $kw21$PROBLEMS_PENDING = makeKeyword("PROBLEMS-PENDING");
  public static final SubLSymbol $kw22$REMOVAL_STRATEGEM_INDEX = makeKeyword("REMOVAL-STRATEGEM-INDEX");
  public static final SubLSymbol $kw23$PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
  public static final SubLSymbol $kw24$PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
  public static final SubLSymbol $kw25$PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
  public static final SubLString $str26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym27$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
  public static final SubLSymbol $sym28$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
  public static final SubLSymbol $sym29$CONNECTED_CONJUNCTION_LINK_P = makeSymbol("CONNECTED-CONJUNCTION-LINK-P");
  public static final SubLSymbol $sym30$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym31$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLSymbol $sym32$REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");

  //// Initializers

  public void declareFunctions() {
    declare_removal_tactician_datastructures_file();
  }

  public void initializeVariables() {
    init_removal_tactician_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_removal_tactician_datastructures_file();
  }

}
