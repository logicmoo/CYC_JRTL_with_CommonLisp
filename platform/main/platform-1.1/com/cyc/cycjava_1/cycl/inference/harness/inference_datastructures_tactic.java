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

package  com.cyc.cycjava_1.cycl.inference.harness;

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
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_datastructures_tactic extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_tactic() {}
  public static final SubLFile me = new inference_datastructures_tactic();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic";

  //// Definitions

  /** When non-nil, we don't bother to compute the tactic productivity for logical tactics. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 883) 
  public static SubLSymbol $leviathan_avoid_logical_tactic_productivity_computationP$ = null;

  public static final class $tactic_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $suid; }
    public SubLObject getField3() { return $problem; }
    public SubLObject getField4() { return $type; }
    public SubLObject getField5() { return $hl_module; }
    public SubLObject getField6() { return $completeness; }
    public SubLObject getField7() { return $preference_level_justification; }
    public SubLObject getField8() { return $productivity; }
    public SubLObject getField9() { return $original_productivity; }
    public SubLObject getField10() { return $status; }
    public SubLObject getField11() { return $progress_iterator; }
    public SubLObject getField12() { return $data; }
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    public SubLObject setField3(SubLObject value) { return $problem = value; }
    public SubLObject setField4(SubLObject value) { return $type = value; }
    public SubLObject setField5(SubLObject value) { return $hl_module = value; }
    public SubLObject setField6(SubLObject value) { return $completeness = value; }
    public SubLObject setField7(SubLObject value) { return $preference_level_justification = value; }
    public SubLObject setField8(SubLObject value) { return $productivity = value; }
    public SubLObject setField9(SubLObject value) { return $original_productivity = value; }
    public SubLObject setField10(SubLObject value) { return $status = value; }
    public SubLObject setField11(SubLObject value) { return $progress_iterator = value; }
    public SubLObject setField12(SubLObject value) { return $data = value; }
    public SubLObject $suid = NIL;
    public SubLObject $problem = NIL;
    public SubLObject $type = NIL;
    public SubLObject $hl_module = NIL;
    public SubLObject $completeness = NIL;
    public SubLObject $preference_level_justification = NIL;
    public SubLObject $productivity = NIL;
    public SubLObject $original_productivity = NIL;
    public SubLObject $status = NIL;
    public SubLObject $progress_iterator = NIL;
    public SubLObject $data = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tactic_native.class, $sym0$TACTIC, $sym1$TACTIC_P, $list3, $list4, new String[] {"$suid", "$problem", "$type", "$hl_module", "$completeness", "$preference_level_justification", "$productivity", "$original_productivity", "$status", "$progress_iterator", "$data"}, $list5, $list6, $sym7$PRINT_TACTIC);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static SubLSymbol $dtp_tactic$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tactic_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36444");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tactic_p(SubLObject object) {
    return ((object.getClass() == $tactic_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $tactic_p$UnaryFunction extends UnaryFunction {
    public $tactic_p$UnaryFunction() { super(extractFunctionNamed("TACTIC-P")); }
    public SubLObject processItem(SubLObject arg1) { return tactic_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_suid(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_problem(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_type(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_hl_module(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_completeness(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_preference_level_justification(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_productivity(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_original_productivity(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_status(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField10();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_progress_iterator(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField11();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject tact_data(SubLObject object) {
    checkType(object, $sym1$TACTIC_P);
    return object.getField12();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_problem(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_type(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_hl_module(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_completeness(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_preference_level_justification(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_productivity(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_original_productivity(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_status(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_progress_iterator(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject _csetf_tact_data(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TACTIC_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 1313) 
  public static final SubLObject make_tactic(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $tactic_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw31$SUID)) {
            _csetf_tact_suid(v_new, current_value);
          } else if (pcase_var.eql($kw32$PROBLEM)) {
            _csetf_tact_problem(v_new, current_value);
          } else if (pcase_var.eql($kw33$TYPE)) {
            _csetf_tact_type(v_new, current_value);
          } else if (pcase_var.eql($kw34$HL_MODULE)) {
            _csetf_tact_hl_module(v_new, current_value);
          } else if (pcase_var.eql($kw35$COMPLETENESS)) {
            _csetf_tact_completeness(v_new, current_value);
          } else if (pcase_var.eql($kw36$PREFERENCE_LEVEL_JUSTIFICATION)) {
            _csetf_tact_preference_level_justification(v_new, current_value);
          } else if (pcase_var.eql($kw37$PRODUCTIVITY)) {
            _csetf_tact_productivity(v_new, current_value);
          } else if (pcase_var.eql($kw38$ORIGINAL_PRODUCTIVITY)) {
            _csetf_tact_original_productivity(v_new, current_value);
          } else if (pcase_var.eql($kw39$STATUS)) {
            _csetf_tact_status(v_new, current_value);
          } else if (pcase_var.eql($kw40$PROGRESS_ITERATOR)) {
            _csetf_tact_progress_iterator(v_new, current_value);
          } else if (pcase_var.eql($kw41$DATA)) {
            _csetf_tact_data(v_new, current_value);
          } else {
            Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 2880) 
  public static final SubLObject valid_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != tactic_p(tactic))
           && (NIL == tactic_invalid_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 2996) 
  public static final SubLObject tactic_invalid_p(SubLObject tactic) {
    return Equality.eq($kw43$FREE, tactic_status(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 3788) 
  public static final SubLObject sxhash_tactic_method(SubLObject object) {
    {
      SubLObject problem = tactic_problem(object);
      if ((NIL != inference_datastructures_problem.valid_problem_p(problem))) {
        return Numbers.logxor(inference_datastructures_problem.problem_suid(problem), tactic_suid(object));
      }
    }
    return ZERO_INTEGER;
  }

  public static final class $sxhash_tactic_method$UnaryFunction extends UnaryFunction {
    public $sxhash_tactic_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-TACTIC-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_tactic_method(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 4140) 
  public static final SubLObject new_tactic(SubLObject problem, SubLObject hl_module, SubLObject data) {
    if ((data == UNPROVIDED)) {
      data = NIL;
    }
    checkType(problem, $sym47$PROBLEM_P);
    checkType(hl_module, $sym48$HL_MODULE_P);
    {
      SubLObject tactic = make_tactic(UNPROVIDED);
      SubLObject suid = inference_datastructures_problem.problem_next_tactic_suid(problem);
      _csetf_tact_suid(tactic, suid);
      _csetf_tact_problem(tactic, problem);
      _csetf_tact_type(tactic, inference_datastructures_enumerated_types.tactic_type_from_hl_module(hl_module));
      _csetf_tact_hl_module(tactic, hl_module);
      set_tactic_status(tactic, $kw49$POSSIBLE);
      _csetf_tact_progress_iterator(tactic, NIL);
      set_tactic_data(tactic, data);
      inference_datastructures_problem.add_problem_tactic(problem, tactic);
      inference_metrics.increment_tactic_historical_count();
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 4991) 
  public static final SubLObject destroy_problem_tactic(SubLObject tactic) {
    if ((NIL != valid_tactic_p(tactic))) {
      destroy_tactic_progress_iterator(tactic);
      note_tactic_invalid(tactic);
      return destroy_tactic_int(tactic);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 5382) 
  public static final SubLObject destroy_tactic_progress_iterator(SubLObject tactic) {
    {
      SubLObject progress_iterator = tactic_progress_iterator(tactic);
      if ((NIL != tactic_progress_iterator_p(progress_iterator))) {
        finalize_tactic_progress_iterator(progress_iterator);
        _csetf_tact_progress_iterator(tactic, NIL);
      }
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 5691) 
  public static final SubLObject destroy_tactic_int(SubLObject tactic) {
    _csetf_tact_data(tactic, $kw43$FREE);
    _csetf_tact_progress_iterator(tactic, $kw43$FREE);
    _csetf_tact_completeness(tactic, $kw43$FREE);
    _csetf_tact_preference_level_justification(tactic, $kw43$FREE);
    _csetf_tact_productivity(tactic, $kw43$FREE);
    _csetf_tact_original_productivity(tactic, $kw43$FREE);
    _csetf_tact_hl_module(tactic, $kw43$FREE);
    _csetf_tact_problem(tactic, $kw43$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6150) 
  public static final SubLObject note_tactic_invalid(SubLObject tactic) {
    _csetf_tact_status(tactic, $kw43$FREE);
    return tactic;
  }

  /** Return an SUID for tactic that is unique wrt its problem. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6249) 
  public static final SubLObject tactic_suid(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_suid(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6422) 
  public static final SubLObject tactic_problem(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_problem(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6527) 
  public static final SubLObject tactic_hl_module(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_hl_module(tactic);
  }

  /** @return tactic-type-p; the type of tactic, deducible from HL-MODULE, but stored anyway for efficiency */
  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6636) 
  public static final SubLObject tactic_type(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_type(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 6841) 
  public static final SubLObject tactic_completeness(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    {
      SubLObject completeness_or_preference = tact_completeness(tactic);
      if ((NIL != preference_modules.preference_level_p(completeness_or_preference))) {
        completeness_or_preference = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32938");
      }
      return completeness_or_preference;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7286) 
  public static final SubLObject tactic_preference_level(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    {
      SubLObject completeness_or_preference = tact_completeness(tactic);
      if ((NIL != inference_datastructures_enumerated_types.completeness_p(completeness_or_preference))) {
        completeness_or_preference = preference_modules.completeness_to_preference_level(completeness_or_preference);
      }
      return completeness_or_preference;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7735) 
  public static final SubLObject tactic_preference_level_justification(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_preference_level_justification(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 7886) 
  public static final SubLObject tactic_productivity(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(tactic, $sym1$TACTIC_P);
      if (((NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread))
           && (NIL != inference_worker.logical_tactic_p(tactic)))) {
        return Errors.error($str50$tactical_productivity_being_refer, tactic);
      }
      return tact_productivity(tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8183) 
  public static final SubLObject tactic_original_productivity(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(tactic, $sym1$TACTIC_P);
      if (((NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread))
           && (NIL != inference_worker.logical_tactic_p(tactic)))) {
        return Errors.error($str50$tactical_productivity_being_refer, tactic);
      }
      return tact_original_productivity(tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8498) 
  public static final SubLObject tactic_status(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_status(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8601) 
  public static final SubLObject tactic_progress_iterator(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_progress_iterator(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8726) 
  public static final SubLObject tactic_data(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    return tact_data(tactic);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 8825) 
  public static final SubLObject set_tactic_completeness(SubLObject tactic, SubLObject completeness) {
    checkType(tactic, $sym1$TACTIC_P);
    checkType(completeness, $sym51$COMPLETENESS_P);
    _csetf_tact_completeness(tactic, completeness);
    _csetf_tact_preference_level_justification(tactic, $str52$);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9100) 
  public static final SubLObject set_tactic_preference_level(SubLObject tactic, SubLObject preference_level, SubLObject justification) {
    checkType(tactic, $sym1$TACTIC_P);
    checkType(preference_level, $sym53$PREFERENCE_LEVEL_P);
    _csetf_tact_completeness(tactic, preference_level);
    _csetf_tact_preference_level_justification(tactic, justification);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9408) 
  public static final SubLObject set_tactic_productivity(SubLObject tactic, SubLObject productivity, SubLObject set_originalP) {
    if ((set_originalP == UNPROVIDED)) {
      set_originalP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(tactic, $sym1$TACTIC_P);
      checkType(productivity, $sym54$PRODUCTIVITY_P);
      if (((NIL != $leviathan_avoid_logical_tactic_productivity_computationP$.getDynamicValue(thread))
           && (NIL != inference_worker.logical_tactic_p(tactic)))) {
        return tactic;
      }
      _csetf_tact_productivity(tactic, productivity);
      if ((NIL != set_originalP)) {
        _csetf_tact_original_productivity(tactic, productivity);
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 9910) 
  public static final SubLObject set_tactic_status(SubLObject tactic, SubLObject status) {
    checkType(tactic, $sym1$TACTIC_P);
    checkType(status, $sym55$TACTIC_STATUS_P);
    _csetf_tact_status(tactic, status);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10084) 
  public static final SubLObject set_tactic_data(SubLObject tactic, SubLObject data) {
    checkType(tactic, $sym1$TACTIC_P);
    _csetf_tact_data(tactic, data);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 10240) 
  public static final SubLObject set_meta_split_tactic_data(SubLObject tactic, SubLObject data) {
    checkType(tactic, $sym56$META_SPLIT_TACTIC_P);
    return set_tactic_data(tactic, data);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12137) 
  public static final SubLObject tactic_hl_module_name(SubLObject tactic) {
    return inference_modules.hl_module_name(tactic_hl_module(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12239) 
  public static final SubLObject tactic_possibleP(SubLObject tactic) {
    return Equality.eq($kw49$POSSIBLE, tactic_status(tactic));
  }

  public static final class $tactic_possibleP$UnaryFunction extends UnaryFunction {
    public $tactic_possibleP$UnaryFunction() { super(extractFunctionNamed("TACTIC-POSSIBLE?")); }
    public SubLObject processItem(SubLObject arg1) { return tactic_possibleP(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12331) 
  public static final SubLObject tactic_in_progressP(SubLObject tactic) {
    return makeBoolean(((NIL != tactic_possibleP(tactic))
           && (NIL != tactic_progress_iterator_p(tactic_progress_iterator(tactic)))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12490) 
  public static final SubLObject tactic_not_possibleP(SubLObject tactic) {
    return makeBoolean((NIL == tactic_possibleP(tactic)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12581) 
  public static final SubLObject tactic_executedP(SubLObject tactic) {
    return Equality.eq($kw69$EXECUTED, tactic_status(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12673) 
  public static final SubLObject tactic_discardedP(SubLObject tactic) {
    return Equality.eq($kw70$DISCARDED, tactic_status(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 12767) 
  public static final SubLObject tactic_has_statusP(SubLObject tactic, SubLObject status_spec) {
    {
      SubLObject pcase_var = status_spec;
      if (pcase_var.eql($kw71$NON_DISCARDED)) {
        return makeBoolean((NIL == tactic_discardedP(tactic)));
      } else if (pcase_var.eql($kw72$IN_PROGESS)) {
        return tactic_in_progressP(tactic);
      } else {
        return Equality.eq(status_spec, tactic_status(tactic));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 13191) 
  public static final SubLObject tactic_store(SubLObject tactic) {
    return inference_datastructures_problem.problem_store(tactic_problem(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 13716) 
  public static final SubLObject update_tactic_productivity(SubLObject tactic, SubLObject new_productivity) {
    {
      SubLObject old_productivity = tactic_productivity(tactic);
      set_tactic_productivity(tactic, new_productivity, NIL);
    }
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14131) 
  public static final SubLObject decrement_tactic_productivity_for_number_of_children(SubLObject tactic, SubLObject number) {
    if ((number == UNPROVIDED)) {
      number = ONE_INTEGER;
    }
    {
      SubLObject old_productivity = tactic_productivity(tactic);
      SubLObject new_productivity = inference_datastructures_enumerated_types.decrement_productivity_for_number_of_children(old_productivity, number);
      new_productivity = Numbers.max(new_productivity, ZERO_INTEGER);
      set_tactic_productivity(tactic, new_productivity, NIL);
      return new_productivity;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14606) 
  public static final SubLObject note_tactic_executed(SubLObject tactic) {
    set_tactic_status(tactic, $kw69$EXECUTED);
    inference_metrics.increment_executed_tactic_historical_count();
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 14757) 
  public static final SubLObject note_tactic_discarded(SubLObject tactic) {
    clear_tactic_progress_iterator(tactic);
    set_tactic_status(tactic, $kw70$DISCARDED);
    inference_metrics.increment_discarded_tactic_historical_count();
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15014) 
  public static final SubLObject note_tactic_progress_iterator(SubLObject tactic, SubLObject progress_iterator) {
    checkType(tactic, $sym73$TACTIC_POSSIBLE_);
    checkType(progress_iterator, $sym74$TACTIC_PROGRESS_ITERATOR_P);
    _csetf_tact_progress_iterator(tactic, progress_iterator);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15265) 
  public static final SubLObject clear_tactic_progress_iterator(SubLObject tactic) {
    checkType(tactic, $sym73$TACTIC_POSSIBLE_);
    destroy_tactic_progress_iterator(tactic);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15423) 
  public static final SubLObject tactic_in_progress_next(SubLObject tactic) {
    {
      SubLObject progress_iterator = tactic_progress_iterator(tactic);
      SubLObject successP = NIL;
      try {
        if ((NIL == iteration.iteration_done(progress_iterator))) {
          iteration.iteration_next(progress_iterator);
          successP = T;
        }
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            if (((NIL == successP)
                || (NIL != iteration.iteration_done(progress_iterator)))) {
              if ((NIL != tactic_possibleP(tactic))) {
                clear_tactic_progress_iterator(tactic);
              }
            }
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return successP;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 15949) 
  public static final SubLObject possibly_update_tactic_productivity_from_iterator(SubLObject tactic, SubLObject output_iterator) {
    {
      SubLObject number_of_children = NIL;
      SubLObject new_productivity = NIL;
      if ((NIL != iteration.list_iterator_p(output_iterator))) {
        number_of_children = iteration.list_iterator_size(output_iterator);
      }
      if ((NIL != number_of_children)) {
        new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(number_of_children);
      }
      if ((NIL != inference_datastructures_enumerated_types.productivity_p(new_productivity))) {
        update_tactic_productivity(tactic, new_productivity);
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 17743) 
  public static final SubLObject note_tactic_most_recent_executed(SubLObject tactic) {
    checkType(tactic, $sym1$TACTIC_P);
    inference_datastructures_problem_store.note_problem_store_most_recent_tactic_executed(tactic_store(tactic), tactic);
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 18762) 
  public static final SubLObject tactic_progress_iterator_p(SubLObject object) {
    return iteration.iterator_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 18958) 
  public static final SubLObject new_tactic_progress_iterator(SubLObject iteration_type, SubLObject tactic, SubLObject sub_state) {
    return iteration.new_iterator(make_tactic_progress_iterator_state(iteration_type, tactic, sub_state), $sym78$TACTIC_PROGRESS_DONE_, $sym79$TACTIC_PROGRESS_NEXT, $sym80$TACTIC_PROGRESS_FINALIZE);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19250) 
  public static final SubLObject make_tactic_progress_iterator_state(SubLObject iteration_type, SubLObject tactic, SubLObject sub_state) {
    {
      SubLObject current = sub_state;
      return list(current, iteration_type, tactic);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 19416) 
  public static final SubLObject tactic_progress_doneP(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject current_4 = NIL;
      SubLObject iteration_type = NIL;
      SubLObject tactic = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      current_4 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      iteration_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      tactic = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject pcase_var = iteration_type;
          if (pcase_var.eql($kw82$REMOVAL_EXPAND)) {
            return Types.sublisp_null(current_4);
          } else if (pcase_var.eql($kw83$REMOVAL_OUTPUT_GENERATE)) {
            {
              SubLObject datum_5 = current_4;
              SubLObject current_6 = datum_5;
              SubLObject output_iterator = NIL;
              SubLObject v_bindings = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list84);
              output_iterator = current_6.first();
              current_6 = current_6.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list84);
              v_bindings = current_6.first();
              current_6 = current_6.rest();
              if ((NIL == current_6)) {
                return iteration.iteration_done(output_iterator);
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_5, $list84);
              }
            }
          } else if (pcase_var.eql($kw85$CONJUNCTIVE_REMOVAL_EXPAND)) {
            return Types.sublisp_null(current_4);
          } else if (pcase_var.eql($kw86$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
            return iteration.iteration_done(current_4);
          } else if (pcase_var.eql($kw87$TRANSFORMATION_RULE_SELECT)) {
            return Types.sublisp_null(current_4);
          } else if (pcase_var.eql($kw88$META_STRUCTURAL)) {
            return inference_worker_split.meta_structural_progress_iterator_doneP(tactic);
          } else {
            return Errors.error($str89$Time_to_implement_tactic_progress, iteration_type);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list81);
      }
    }
    return NIL;
  }

  public static final class $tactic_progress_doneP$UnaryFunction extends UnaryFunction {
    public $tactic_progress_doneP$UnaryFunction() { super(extractFunctionNamed("TACTIC-PROGRESS-DONE?")); }
    public SubLObject processItem(SubLObject arg1) { return tactic_progress_doneP(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 20217) 
  public static final SubLObject tactic_progress_next(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject current_7 = NIL;
      SubLObject iteration_type = NIL;
      SubLObject tactic = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      current_7 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      iteration_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      tactic = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject pcase_var = iteration_type;
          if (pcase_var.eql($kw82$REMOVAL_EXPAND)) {
            {
              SubLObject expand_result = current_7.first();
              SubLObject update = current_7.rest();
              ConsesLow.rplaca(state, update);
              {
                SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_expand_result(tactic, expand_result);
                return Values.values(side_effect_result, state);
              }
            }
          } else if (pcase_var.eql($kw83$REMOVAL_OUTPUT_GENERATE)) {
            {
              SubLObject datum_8 = current_7;
              SubLObject current_9 = datum_8;
              SubLObject output_iterator = NIL;
              SubLObject encoded_bindings = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current_9, datum_8, $list90);
              output_iterator = current_9.first();
              current_9 = current_9.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_9, datum_8, $list90);
              encoded_bindings = current_9.first();
              current_9 = current_9.rest();
              if ((NIL == current_9)) {
                {
                  SubLObject side_effect_result = inference_worker_removal.handle_one_removal_tactic_output_generate_result(tactic, output_iterator, encoded_bindings);
                  return Values.values(side_effect_result, state);
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_8, $list90);
              }
            }
          } else if (pcase_var.eql($kw85$CONJUNCTIVE_REMOVAL_EXPAND)) {
            {
              SubLObject expand_result = current_7.first();
              SubLObject update = current_7.rest();
              ConsesLow.rplaca(state, update);
              {
                SubLObject side_effect_result = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36228");
                return Values.values(side_effect_result, state);
              }
            }
          } else if (pcase_var.eql($kw86$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
            {
              SubLObject side_effect_result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36227");
              return Values.values(side_effect_result, state);
            }
          } else if (pcase_var.eql($kw87$TRANSFORMATION_RULE_SELECT)) {
            {
              SubLObject rule = current_7.first();
              SubLObject update = current_7.rest();
              ConsesLow.rplaca(state, update);
              {
                SubLObject side_effect_result = inference_worker_transformation.handle_one_transformation_tactic_rule_select_result(tactic, rule);
                return Values.values(side_effect_result, state);
              }
            }
          } else if (pcase_var.eql($kw88$META_STRUCTURAL)) {
            inference_worker_split.execute_meta_split_tactic(tactic);
            return Values.values(NIL, state);
          } else {
            return Errors.error($str91$Time_to_implement_tactic_progress, iteration_type);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list81);
      }
    }
    return NIL;
  }

  public static final class $tactic_progress_next$UnaryFunction extends UnaryFunction {
    public $tactic_progress_next$UnaryFunction() { super(extractFunctionNamed("TACTIC-PROGRESS-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return tactic_progress_next(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 21907) 
  public static final SubLObject tactic_progress_finalize(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject current_10 = NIL;
      SubLObject iteration_type = NIL;
      SubLObject tactic = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      current_10 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      iteration_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list81);
      tactic = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject pcase_var = iteration_type;
          if (pcase_var.eql($kw82$REMOVAL_EXPAND)) {
            return T;
          } else if (pcase_var.eql($kw83$REMOVAL_OUTPUT_GENERATE)) {
            {
              SubLObject datum_11 = current_10;
              SubLObject current_12 = datum_11;
              SubLObject output_iterator = NIL;
              SubLObject encoded_bindings = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current_12, datum_11, $list90);
              output_iterator = current_12.first();
              current_12 = current_12.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_12, datum_11, $list90);
              encoded_bindings = current_12.first();
              current_12 = current_12.rest();
              if ((NIL == current_12)) {
                return iteration.iteration_finalize(output_iterator);
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_11, $list90);
              }
            }
          } else if (pcase_var.eql($kw85$CONJUNCTIVE_REMOVAL_EXPAND)) {
            return T;
          } else if (pcase_var.eql($kw86$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE)) {
            return iteration.iteration_finalize(current_10);
          } else if (pcase_var.eql($kw87$TRANSFORMATION_RULE_SELECT)) {
            return T;
          } else if (pcase_var.eql($kw88$META_STRUCTURAL)) {
            return T;
          } else {
            return Errors.error($str92$Time_to_implement_tactic_progress, iteration_type);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list81);
      }
    }
    return NIL;
  }

  public static final class $tactic_progress_finalize$UnaryFunction extends UnaryFunction {
    public $tactic_progress_finalize$UnaryFunction() { super(extractFunctionNamed("TACTIC-PROGRESS-FINALIZE")); }
    public SubLObject processItem(SubLObject arg1) { return tactic_progress_finalize(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-tactic.lisp", position = 22654) 
  public static final SubLObject finalize_tactic_progress_iterator(SubLObject progress_iterator) {
    checkType(progress_iterator, $sym74$TACTIC_PROGRESS_ITERATOR_P);
    iteration.iteration_finalize(progress_iterator);
    return progress_iterator;
  }

  public static final SubLObject declare_inference_datastructures_tactic_file() {
    declareFunction(myName, "tactic_print_function_trampoline", "TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "tactic_p", "TACTIC-P", 1, 0, false); new $tactic_p$UnaryFunction();
    declareFunction(myName, "tact_suid", "TACT-SUID", 1, 0, false);
    declareFunction(myName, "tact_problem", "TACT-PROBLEM", 1, 0, false);
    declareFunction(myName, "tact_type", "TACT-TYPE", 1, 0, false);
    declareFunction(myName, "tact_hl_module", "TACT-HL-MODULE", 1, 0, false);
    declareFunction(myName, "tact_completeness", "TACT-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "tact_preference_level_justification", "TACT-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "tact_productivity", "TACT-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "tact_original_productivity", "TACT-ORIGINAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "tact_status", "TACT-STATUS", 1, 0, false);
    declareFunction(myName, "tact_progress_iterator", "TACT-PROGRESS-ITERATOR", 1, 0, false);
    declareFunction(myName, "tact_data", "TACT-DATA", 1, 0, false);
    declareFunction(myName, "_csetf_tact_suid", "_CSETF-TACT-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_tact_problem", "_CSETF-TACT-PROBLEM", 2, 0, false);
    declareFunction(myName, "_csetf_tact_type", "_CSETF-TACT-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_tact_hl_module", "_CSETF-TACT-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_tact_completeness", "_CSETF-TACT-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "_csetf_tact_preference_level_justification", "_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION", 2, 0, false);
    declareFunction(myName, "_csetf_tact_productivity", "_CSETF-TACT-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "_csetf_tact_original_productivity", "_CSETF-TACT-ORIGINAL-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "_csetf_tact_status", "_CSETF-TACT-STATUS", 2, 0, false);
    declareFunction(myName, "_csetf_tact_progress_iterator", "_CSETF-TACT-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "_csetf_tact_data", "_CSETF-TACT-DATA", 2, 0, false);
    declareFunction(myName, "make_tactic", "MAKE-TACTIC", 0, 1, false);
    declareFunction(myName, "valid_tactic_p", "VALID-TACTIC-P", 1, 0, false);
    declareFunction(myName, "tactic_invalid_p", "TACTIC-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_tactic", "PRINT-TACTIC", 3, 0, false);
    declareFunction(myName, "sxhash_tactic_method", "SXHASH-TACTIC-METHOD", 1, 0, false); new $sxhash_tactic_method$UnaryFunction();
    declareFunction(myName, "new_tactic", "NEW-TACTIC", 2, 1, false);
    declareFunction(myName, "destroy_problem_tactic", "DESTROY-PROBLEM-TACTIC", 1, 0, false);
    declareFunction(myName, "destroy_problem_tactic_and_backpointers", "DESTROY-PROBLEM-TACTIC-AND-BACKPOINTERS", 1, 0, false);
    declareFunction(myName, "destroy_tactic_progress_iterator", "DESTROY-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
    declareFunction(myName, "destroy_tactic_int", "DESTROY-TACTIC-INT", 1, 0, false);
    declareFunction(myName, "note_tactic_invalid", "NOTE-TACTIC-INVALID", 1, 0, false);
    declareFunction(myName, "tactic_suid", "TACTIC-SUID", 1, 0, false);
    declareFunction(myName, "tactic_problem", "TACTIC-PROBLEM", 1, 0, false);
    declareFunction(myName, "tactic_hl_module", "TACTIC-HL-MODULE", 1, 0, false);
    declareFunction(myName, "tactic_type", "TACTIC-TYPE", 1, 0, false);
    declareFunction(myName, "tactic_completeness", "TACTIC-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "tactic_preference_level", "TACTIC-PREFERENCE-LEVEL", 1, 0, false);
    declareFunction(myName, "tactic_preference_level_justification", "TACTIC-PREFERENCE-LEVEL-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "tactic_productivity", "TACTIC-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "tactic_original_productivity", "TACTIC-ORIGINAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "tactic_status", "TACTIC-STATUS", 1, 0, false);
    declareFunction(myName, "tactic_progress_iterator", "TACTIC-PROGRESS-ITERATOR", 1, 0, false);
    declareFunction(myName, "tactic_data", "TACTIC-DATA", 1, 0, false);
    declareFunction(myName, "set_tactic_completeness", "SET-TACTIC-COMPLETENESS", 2, 0, false);
    declareFunction(myName, "set_tactic_preference_level", "SET-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "set_tactic_productivity", "SET-TACTIC-PRODUCTIVITY", 2, 1, false);
    declareFunction(myName, "set_tactic_status", "SET-TACTIC-STATUS", 2, 0, false);
    declareFunction(myName, "set_tactic_data", "SET-TACTIC-DATA", 2, 0, false);
    declareFunction(myName, "set_meta_split_tactic_data", "SET-META-SPLIT-TACTIC-DATA", 2, 0, false);
    declareMacro(myName, "do_tactic_relevant_strategies", "DO-TACTIC-RELEVANT-STRATEGIES");
    declareMacro(myName, "do_tactic_sibling_tactics", "DO-TACTIC-SIBLING-TACTICS");
    declareFunction(myName, "tactic_ids", "TACTIC-IDS", 1, 0, false);
    declareFunction(myName, "find_tactic_by_id", "FIND-TACTIC-BY-ID", 2, 0, false);
    declareFunction(myName, "find_tactic_by_ids", "FIND-TACTIC-BY-IDS", 3, 0, false);
    declareFunction(myName, "tactic_hl_module_name", "TACTIC-HL-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "tactic_possibleP", "TACTIC-POSSIBLE?", 1, 0, false); new $tactic_possibleP$UnaryFunction();
    declareFunction(myName, "tactic_in_progressP", "TACTIC-IN-PROGRESS?", 1, 0, false);
    declareFunction(myName, "tactic_not_possibleP", "TACTIC-NOT-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "tactic_executedP", "TACTIC-EXECUTED?", 1, 0, false);
    declareFunction(myName, "tactic_discardedP", "TACTIC-DISCARDED?", 1, 0, false);
    declareFunction(myName, "tactic_has_statusP", "TACTIC-HAS-STATUS?", 2, 0, false);
    declareFunction(myName, "abductive_tacticP", "ABDUCTIVE-TACTIC?", 1, 0, false);
    declareFunction(myName, "tactic_store", "TACTIC-STORE", 1, 0, false);
    declareFunction(myName, "tactic_problem_query", "TACTIC-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "tactic_problem_sole_clause", "TACTIC-PROBLEM-SOLE-CLAUSE", 1, 0, false);
    declareFunction(myName, "update_tactic_productivity", "UPDATE-TACTIC-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "decrement_tactic_productivity_for_number_of_children", "DECREMENT-TACTIC-PRODUCTIVITY-FOR-NUMBER-OF-CHILDREN", 1, 1, false);
    declareFunction(myName, "note_tactic_executed", "NOTE-TACTIC-EXECUTED", 1, 0, false);
    declareFunction(myName, "note_tactic_discarded", "NOTE-TACTIC-DISCARDED", 1, 0, false);
    declareFunction(myName, "note_tactic_progress_iterator", "NOTE-TACTIC-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "clear_tactic_progress_iterator", "CLEAR-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
    declareFunction(myName, "tactic_in_progress_next", "TACTIC-IN-PROGRESS-NEXT", 1, 0, false);
    declareFunction(myName, "possibly_update_tactic_productivity_from_iterator", "POSSIBLY-UPDATE-TACTIC-PRODUCTIVITY-FROM-ITERATOR", 2, 0, false);
    declareFunction(myName, "select_least_productive_tactic", "SELECT-LEAST-PRODUCTIVE-TACTIC", 1, 0, false);
    declareFunction(myName, "total_productivity_of_tactics", "TOTAL-PRODUCTIVITY-OF-TACTICS", 1, 0, false);
    declareFunction(myName, "total_productivity_of_problem_possible_tactics", "TOTAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
    declareFunction(myName, "min_productivity_of_problem_possible_tactics", "MIN-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
    declareFunction(myName, "note_tactic_most_recent_executed", "NOTE-TACTIC-MOST-RECENT-EXECUTED", 1, 0, false);
    declareFunction(myName, "problem_store_tactic_execution_count", "PROBLEM-STORE-TACTIC-EXECUTION-COUNT", 1, 0, false);
    declareFunction(myName, "tactic_execution_count", "TACTIC-EXECUTION-COUNT", 1, 0, false);
    declareFunction(myName, "tactic_progress_iterator_p", "TACTIC-PROGRESS-ITERATOR-P", 1, 0, false);
    declareFunction(myName, "new_tactic_progress_iterator", "NEW-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
    declareFunction(myName, "make_tactic_progress_iterator_state", "MAKE-TACTIC-PROGRESS-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "tactic_progress_doneP", "TACTIC-PROGRESS-DONE?", 1, 0, false); new $tactic_progress_doneP$UnaryFunction();
    declareFunction(myName, "tactic_progress_next", "TACTIC-PROGRESS-NEXT", 1, 0, false); new $tactic_progress_next$UnaryFunction();
    declareFunction(myName, "tactic_progress_finalize", "TACTIC-PROGRESS-FINALIZE", 1, 0, false); new $tactic_progress_finalize$UnaryFunction();
    declareFunction(myName, "finalize_tactic_progress_iterator", "FINALIZE-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_tactic_file() {
    $leviathan_avoid_logical_tactic_productivity_computationP$ = defvar("*LEVIATHAN-AVOID-LOGICAL-TACTIC-PRODUCTIVITY-COMPUTATION?*", NIL);
    $dtp_tactic$ = defconstant("*DTP-TACTIC*", $sym0$TACTIC);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_tactic_file() {
    // CVS_ID("Id: inference-datastructures-tactic.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), Symbols.symbol_function($sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$TACT_SUID, $sym10$_CSETF_TACT_SUID);
    Structures.def_csetf($sym11$TACT_PROBLEM, $sym12$_CSETF_TACT_PROBLEM);
    Structures.def_csetf($sym13$TACT_TYPE, $sym14$_CSETF_TACT_TYPE);
    Structures.def_csetf($sym15$TACT_HL_MODULE, $sym16$_CSETF_TACT_HL_MODULE);
    Structures.def_csetf($sym17$TACT_COMPLETENESS, $sym18$_CSETF_TACT_COMPLETENESS);
    Structures.def_csetf($sym19$TACT_PREFERENCE_LEVEL_JUSTIFICATION, $sym20$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION);
    Structures.def_csetf($sym21$TACT_PRODUCTIVITY, $sym22$_CSETF_TACT_PRODUCTIVITY);
    Structures.def_csetf($sym23$TACT_ORIGINAL_PRODUCTIVITY, $sym24$_CSETF_TACT_ORIGINAL_PRODUCTIVITY);
    Structures.def_csetf($sym25$TACT_STATUS, $sym26$_CSETF_TACT_STATUS);
    Structures.def_csetf($sym27$TACT_PROGRESS_ITERATOR, $sym28$_CSETF_TACT_PROGRESS_ITERATOR);
    Structures.def_csetf($sym29$TACT_DATA, $sym30$_CSETF_TACT_DATA);
    Equality.identity($sym0$TACTIC);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_tactic$.getGlobalValue(), Symbols.symbol_function($sym46$SXHASH_TACTIC_METHOD));
    utilities_macros.note_funcall_helper_function($sym78$TACTIC_PROGRESS_DONE_);
    utilities_macros.note_funcall_helper_function($sym79$TACTIC_PROGRESS_NEXT);
    utilities_macros.note_funcall_helper_function($sym80$TACTIC_PROGRESS_FINALIZE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TACTIC = makeSymbol("TACTIC");
  public static final SubLSymbol $sym1$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLInteger $int2$210 = makeInteger(210);
  public static final SubLList $list3 = list(new SubLObject[] {makeSymbol("SUID"), makeSymbol("PROBLEM"), makeSymbol("TYPE"), makeSymbol("HL-MODULE"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("PRODUCTIVITY"), makeSymbol("ORIGINAL-PRODUCTIVITY"), makeSymbol("STATUS"), makeSymbol("PROGRESS-ITERATOR"), makeSymbol("DATA")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("SUID"), makeKeyword("PROBLEM"), makeKeyword("TYPE"), makeKeyword("HL-MODULE"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), makeKeyword("PRODUCTIVITY"), makeKeyword("ORIGINAL-PRODUCTIVITY"), makeKeyword("STATUS"), makeKeyword("PROGRESS-ITERATOR"), makeKeyword("DATA")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("TACT-SUID"), makeSymbol("TACT-PROBLEM"), makeSymbol("TACT-TYPE"), makeSymbol("TACT-HL-MODULE"), makeSymbol("TACT-COMPLETENESS"), makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("TACT-PRODUCTIVITY"), makeSymbol("TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("TACT-STATUS"), makeSymbol("TACT-PROGRESS-ITERATOR"), makeSymbol("TACT-DATA")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("_CSETF-TACT-SUID"), makeSymbol("_CSETF-TACT-PROBLEM"), makeSymbol("_CSETF-TACT-TYPE"), makeSymbol("_CSETF-TACT-HL-MODULE"), makeSymbol("_CSETF-TACT-COMPLETENESS"), makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION"), makeSymbol("_CSETF-TACT-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY"), makeSymbol("_CSETF-TACT-STATUS"), makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR"), makeSymbol("_CSETF-TACT-DATA")});
  public static final SubLSymbol $sym7$PRINT_TACTIC = makeSymbol("PRINT-TACTIC");
  public static final SubLSymbol $sym8$TACTIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TACTIC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$TACT_SUID = makeSymbol("TACT-SUID");
  public static final SubLSymbol $sym10$_CSETF_TACT_SUID = makeSymbol("_CSETF-TACT-SUID");
  public static final SubLSymbol $sym11$TACT_PROBLEM = makeSymbol("TACT-PROBLEM");
  public static final SubLSymbol $sym12$_CSETF_TACT_PROBLEM = makeSymbol("_CSETF-TACT-PROBLEM");
  public static final SubLSymbol $sym13$TACT_TYPE = makeSymbol("TACT-TYPE");
  public static final SubLSymbol $sym14$_CSETF_TACT_TYPE = makeSymbol("_CSETF-TACT-TYPE");
  public static final SubLSymbol $sym15$TACT_HL_MODULE = makeSymbol("TACT-HL-MODULE");
  public static final SubLSymbol $sym16$_CSETF_TACT_HL_MODULE = makeSymbol("_CSETF-TACT-HL-MODULE");
  public static final SubLSymbol $sym17$TACT_COMPLETENESS = makeSymbol("TACT-COMPLETENESS");
  public static final SubLSymbol $sym18$_CSETF_TACT_COMPLETENESS = makeSymbol("_CSETF-TACT-COMPLETENESS");
  public static final SubLSymbol $sym19$TACT_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("TACT-PREFERENCE-LEVEL-JUSTIFICATION");
  public static final SubLSymbol $sym20$_CSETF_TACT_PREFERENCE_LEVEL_JUSTIFICATION = makeSymbol("_CSETF-TACT-PREFERENCE-LEVEL-JUSTIFICATION");
  public static final SubLSymbol $sym21$TACT_PRODUCTIVITY = makeSymbol("TACT-PRODUCTIVITY");
  public static final SubLSymbol $sym22$_CSETF_TACT_PRODUCTIVITY = makeSymbol("_CSETF-TACT-PRODUCTIVITY");
  public static final SubLSymbol $sym23$TACT_ORIGINAL_PRODUCTIVITY = makeSymbol("TACT-ORIGINAL-PRODUCTIVITY");
  public static final SubLSymbol $sym24$_CSETF_TACT_ORIGINAL_PRODUCTIVITY = makeSymbol("_CSETF-TACT-ORIGINAL-PRODUCTIVITY");
  public static final SubLSymbol $sym25$TACT_STATUS = makeSymbol("TACT-STATUS");
  public static final SubLSymbol $sym26$_CSETF_TACT_STATUS = makeSymbol("_CSETF-TACT-STATUS");
  public static final SubLSymbol $sym27$TACT_PROGRESS_ITERATOR = makeSymbol("TACT-PROGRESS-ITERATOR");
  public static final SubLSymbol $sym28$_CSETF_TACT_PROGRESS_ITERATOR = makeSymbol("_CSETF-TACT-PROGRESS-ITERATOR");
  public static final SubLSymbol $sym29$TACT_DATA = makeSymbol("TACT-DATA");
  public static final SubLSymbol $sym30$_CSETF_TACT_DATA = makeSymbol("_CSETF-TACT-DATA");
  public static final SubLSymbol $kw31$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw32$PROBLEM = makeKeyword("PROBLEM");
  public static final SubLSymbol $kw33$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw34$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw35$COMPLETENESS = makeKeyword("COMPLETENESS");
  public static final SubLSymbol $kw36$PREFERENCE_LEVEL_JUSTIFICATION = makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
  public static final SubLSymbol $kw37$PRODUCTIVITY = makeKeyword("PRODUCTIVITY");
  public static final SubLSymbol $kw38$ORIGINAL_PRODUCTIVITY = makeKeyword("ORIGINAL-PRODUCTIVITY");
  public static final SubLSymbol $kw39$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw40$PROGRESS_ITERATOR = makeKeyword("PROGRESS-ITERATOR");
  public static final SubLSymbol $kw41$DATA = makeKeyword("DATA");
  public static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw43$FREE = makeKeyword("FREE");
  public static final SubLString $str44$_Invalid_TACTIC__s_ = makeString("<Invalid TACTIC ~s>");
  public static final SubLString $str45$__a_TACTIC__a__a__a___a__a__ = makeString("<~a TACTIC ~a.~a.~a:(~a ~a)>");
  public static final SubLSymbol $sym46$SXHASH_TACTIC_METHOD = makeSymbol("SXHASH-TACTIC-METHOD");
  public static final SubLSymbol $sym47$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym48$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $kw49$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLString $str50$tactical_productivity_being_refer = makeString("tactical productivity being referenced on ~S");
  public static final SubLSymbol $sym51$COMPLETENESS_P = makeSymbol("COMPLETENESS-P");
  public static final SubLString $str52$ = makeString("");
  public static final SubLSymbol $sym53$PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");
  public static final SubLSymbol $sym54$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
  public static final SubLSymbol $sym55$TACTIC_STATUS_P = makeSymbol("TACTIC-STATUS-P");
  public static final SubLSymbol $sym56$META_SPLIT_TACTIC_P = makeSymbol("META-SPLIT-TACTIC-P");
  public static final SubLList $list57 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("TACTIC")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym58$DO_PROBLEM_RELEVANT_STRATEGIES = makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");
  public static final SubLSymbol $sym59$TACTIC_PROBLEM = makeSymbol("TACTIC-PROBLEM");
  public static final SubLList $list60 = list(list(new SubLObject[] {makeSymbol("SIBLING-TACTIC-VAR"), makeSymbol("TACTIC"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY")}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list61 = list(makeKeyword("DONE"), makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), makeKeyword("TYPE"), makeKeyword("PRODUCTIVITY"));
  public static final SubLSymbol $kw62$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw63$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw64$PREFERENCE_LEVEL = makeKeyword("PREFERENCE-LEVEL");
  public static final SubLSymbol $sym65$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
  public static final SubLSymbol $sym66$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym67$DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");
  public static final SubLSymbol $sym68$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $kw69$EXECUTED = makeKeyword("EXECUTED");
  public static final SubLSymbol $kw70$DISCARDED = makeKeyword("DISCARDED");
  public static final SubLSymbol $kw71$NON_DISCARDED = makeKeyword("NON-DISCARDED");
  public static final SubLSymbol $kw72$IN_PROGESS = makeKeyword("IN-PROGESS");
  public static final SubLSymbol $sym73$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");
  public static final SubLSymbol $sym74$TACTIC_PROGRESS_ITERATOR_P = makeSymbol("TACTIC-PROGRESS-ITERATOR-P");
  public static final SubLSymbol $sym75$_ = makeSymbol("<");
  public static final SubLSymbol $sym76$TACTIC_PRODUCTIVITY = makeSymbol("TACTIC-PRODUCTIVITY");
  public static final SubLSymbol $kw77$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym78$TACTIC_PROGRESS_DONE_ = makeSymbol("TACTIC-PROGRESS-DONE?");
  public static final SubLSymbol $sym79$TACTIC_PROGRESS_NEXT = makeSymbol("TACTIC-PROGRESS-NEXT");
  public static final SubLSymbol $sym80$TACTIC_PROGRESS_FINALIZE = makeSymbol("TACTIC-PROGRESS-FINALIZE");
  public static final SubLList $list81 = list(makeSymbol("CURRENT"), makeSymbol("ITERATION-TYPE"), makeSymbol("TACTIC"));
  public static final SubLSymbol $kw82$REMOVAL_EXPAND = makeKeyword("REMOVAL-EXPAND");
  public static final SubLSymbol $kw83$REMOVAL_OUTPUT_GENERATE = makeKeyword("REMOVAL-OUTPUT-GENERATE");
  public static final SubLList $list84 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("BINDINGS"));
  public static final SubLSymbol $kw85$CONJUNCTIVE_REMOVAL_EXPAND = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
  public static final SubLSymbol $kw86$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
  public static final SubLSymbol $kw87$TRANSFORMATION_RULE_SELECT = makeKeyword("TRANSFORMATION-RULE-SELECT");
  public static final SubLSymbol $kw88$META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
  public static final SubLString $str89$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-done? for ~S");
  public static final SubLList $list90 = list(makeSymbol("OUTPUT-ITERATOR"), makeSymbol("ENCODED-BINDINGS"));
  public static final SubLString $str91$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-next for ~S");
  public static final SubLString $str92$Time_to_implement_tactic_progress = makeString("Time to implement tactic-progress-finalize for ~S");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_tactic_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_tactic_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_tactic_file();
  }

}
