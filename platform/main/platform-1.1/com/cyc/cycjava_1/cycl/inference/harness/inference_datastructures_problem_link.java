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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class inference_datastructures_problem_link extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_problem_link() {}
  public static final SubLFile me = new inference_datastructures_problem_link();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link";

  //// Definitions

  /** If T, when a proof is created for a link and subproofs, the proof is also added to the proofs slot of that link and used when finding link-proofs */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 894) 
  public static SubLSymbol $problem_link_datastructure_stores_proofsP$ = null;

  public static final class $problem_link_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $suid; }
    public SubLObject getField3() { return $type; }
    public SubLObject getField4() { return $supported_object; }
    public SubLObject getField5() { return $supporting_mapped_problems; }
    public SubLObject getField6() { return $open_flags; }
    public SubLObject getField7() { return $data; }
    public SubLObject getField8() { return $proofs; }
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    public SubLObject setField3(SubLObject value) { return $type = value; }
    public SubLObject setField4(SubLObject value) { return $supported_object = value; }
    public SubLObject setField5(SubLObject value) { return $supporting_mapped_problems = value; }
    public SubLObject setField6(SubLObject value) { return $open_flags = value; }
    public SubLObject setField7(SubLObject value) { return $data = value; }
    public SubLObject setField8(SubLObject value) { return $proofs = value; }
    public SubLObject $suid = NIL;
    public SubLObject $type = NIL;
    public SubLObject $supported_object = NIL;
    public SubLObject $supporting_mapped_problems = NIL;
    public SubLObject $open_flags = NIL;
    public SubLObject $data = NIL;
    public SubLObject $proofs = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($problem_link_native.class, $sym0$PROBLEM_LINK, $sym1$PROBLEM_LINK_P, $list3, $list4, new String[] {"$suid", "$type", "$supported_object", "$supporting_mapped_problems", "$open_flags", "$data", "$proofs"}, $list5, $list6, $sym7$PRINT_PROBLEM_LINK);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static SubLSymbol $dtp_problem_link$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject problem_link_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35657");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject problem_link_p(SubLObject object) {
    return ((object.getClass() == $problem_link_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $problem_link_p$UnaryFunction extends UnaryFunction {
    public $problem_link_p$UnaryFunction() { super(extractFunctionNamed("PROBLEM-LINK-P")); }
    public SubLObject processItem(SubLObject arg1) { return problem_link_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject prob_link_suid(SubLObject object) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject prob_link_type(SubLObject object) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject prob_link_supported_object(SubLObject object) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject prob_link_supporting_mapped_problems(SubLObject object) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject prob_link_open_flags(SubLObject object) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject prob_link_data(SubLObject object) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject _csetf_prob_link_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject _csetf_prob_link_type(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject _csetf_prob_link_supported_object(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject _csetf_prob_link_supporting_mapped_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject _csetf_prob_link_open_flags(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject _csetf_prob_link_data(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_LINK_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 1395) 
  public static final SubLObject make_problem_link(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $problem_link_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw23$SUID)) {
            _csetf_prob_link_suid(v_new, current_value);
          } else if (pcase_var.eql($kw24$TYPE)) {
            _csetf_prob_link_type(v_new, current_value);
          } else if (pcase_var.eql($kw25$SUPPORTED_OBJECT)) {
            _csetf_prob_link_supported_object(v_new, current_value);
          } else if (pcase_var.eql($kw26$SUPPORTING_MAPPED_PROBLEMS)) {
            _csetf_prob_link_supporting_mapped_problems(v_new, current_value);
          } else if (pcase_var.eql($kw27$OPEN_FLAGS)) {
            _csetf_prob_link_open_flags(v_new, current_value);
          } else if (pcase_var.eql($kw28$DATA)) {
            _csetf_prob_link_data(v_new, current_value);
          } else if (pcase_var.eql($kw29$PROOFS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35652");
          } else {
            Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2432) 
  public static final SubLObject valid_problem_link_p(SubLObject object) {
    return makeBoolean(((NIL != problem_link_p(object))
           && (NIL == problem_link_invalid_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 2566) 
  public static final SubLObject problem_link_invalid_p(SubLObject problem_link) {
    return Equality.eq($kw31$FREE, problem_link_type(problem_link));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3352) 
  public static final SubLObject sxhash_problem_link_method(SubLObject object) {
    return prob_link_suid(object);
  }

  public static final class $sxhash_problem_link_method$UnaryFunction extends UnaryFunction {
    public $sxhash_problem_link_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-PROBLEM-LINK-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_problem_link_method(arg1); }
  }

  /** Creates a new link under SUPPORTED-PROBLEM */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 3432) 
  public static final SubLObject new_problem_link(SubLObject type, SubLObject supported_problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(type, $sym38$PROBLEM_LINK_TYPE_P);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if (($kw34$ANSWER == type)) {
          Errors.error($str39$Can_t_call_new_problem_link_for_a);
        }
      }
      checkType(supported_problem, $sym40$PROBLEM_P);
      {
        SubLObject link = new_problem_link_int(supported_problem, type);
        inference_datastructures_problem.add_problem_argument_link(supported_problem, link);
        return link;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 4041) 
  public static final SubLObject new_problem_link_int(SubLObject supported_object, SubLObject type) {
    {
      SubLObject link = make_problem_link(UNPROVIDED);
      _csetf_prob_link_type(link, type);
      _csetf_prob_link_supported_object(link, supported_object);
      {
        SubLObject store = problem_link_store(link);
        SubLObject suid = inference_datastructures_problem_store.problem_store_new_link_id(store);
        inference_metrics.increment_problem_link_type_historical_counts(type);
        _csetf_prob_link_suid(link, suid);
        _csetf_prob_link_supporting_mapped_problems(link, NIL);
        _csetf_prob_link_open_flags(link, ZERO_INTEGER);
        inference_datastructures_problem_store.add_problem_store_link(store, link);
      }
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 4647) 
  public static final SubLObject destroy_problem_link(SubLObject link) {
    if ((NIL != valid_problem_link_p(link))) {
      {
        SubLObject type = problem_link_type(link);
        SubLObject store = problem_link_store(link);
        note_problem_link_invalid(link);
        {
          SubLObject pcase_var = type;
          if (pcase_var.eql($kw34$ANSWER)) {
            {
              SubLObject inference = problem_link_supported_object(link);
              if ((NIL != inference_datastructures_inference.valid_inference_p(inference))) {
                inference_datastructures_inference.destroy_inference(inference);
              }
            }
          } else if (pcase_var.eql($kw41$REMOVAL)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36224");
          } else if (pcase_var.eql($kw42$TRANSFORMATION)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36429");
          } else if (pcase_var.eql($kw43$RESIDUAL_TRANSFORMATION)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35053");
          } else if (pcase_var.eql($kw44$JOIN_ORDERED)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36361");
          } else if (pcase_var.eql($kw45$JOIN)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36480");
          } else if (pcase_var.eql($kw46$SPLIT)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36477");
          } else if (pcase_var.eql($kw47$UNION)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33006");
          } else if (pcase_var.eql($kw48$RESTRICTION)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35676");
          }
        }
        if (($kw34$ANSWER != type)) {
          {
            SubLObject doomed_proofs = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35660");
            SubLObject cdolist_list_var = doomed_proofs;
            SubLObject proof = NIL;
            for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
              if ((NIL != inference_datastructures_proof.valid_proof_p(proof))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35402");
              }
            }
          }
        }
        {
          SubLObject link_var = link;
          SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link_var);
          SubLObject supporting_mapped_problem = NIL;
          for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
            if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
              {
                SubLObject supporting_problem = mapped_problem_problem(supporting_mapped_problem);
                SubLObject variable_map = mapped_problem_variable_map(supporting_mapped_problem);
                if ((NIL != inference_datastructures_problem.valid_problem_p(supporting_problem))) {
                  inference_datastructures_problem.remove_problem_dependent_link(supporting_problem, link);
                }
              }
            }
          }
        }
        if (($kw34$ANSWER != type)) {
          {
            SubLObject supported_problem = problem_link_supported_problem(link);
            if ((NIL != inference_datastructures_problem.valid_problem_p(supported_problem))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35388");
            }
          }
        }
        inference_datastructures_problem_store.remove_problem_store_link(store, link);
      }
      return destroy_problem_link_int(link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6288) 
  public static final SubLObject destroy_problem_store_link(SubLObject link) {
    if ((NIL != valid_problem_link_p(link))) {
      note_problem_link_invalid(link);
      return destroy_problem_link_int(link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6459) 
  public static final SubLObject destroy_problem_link_int(SubLObject link) {
    _csetf_prob_link_data(link, $kw31$FREE);
    _csetf_prob_link_open_flags(link, $kw31$FREE);
    {
      SubLObject link_var = link;
      SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link_var);
      SubLObject mapped_problem = NIL;
      for (mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, mapped_problem))) {
          destroy_problem_link_mapped_problem(mapped_problem);
        }
      }
    }
    _csetf_prob_link_supporting_mapped_problems(link, $kw31$FREE);
    _csetf_prob_link_supported_object(link, $kw31$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 6899) 
  public static final SubLObject note_problem_link_invalid(SubLObject link) {
    _csetf_prob_link_type(link, $kw31$FREE);
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7001) 
  public static final SubLObject problem_link_suid(SubLObject link) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    return prob_link_suid(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7123) 
  public static final SubLObject problem_link_type(SubLObject link) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    return prob_link_type(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7233) 
  public static final SubLObject problem_link_supported_object(SubLObject link) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    return prob_link_supported_object(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7367) 
  public static final SubLObject problem_link_supporting_mapped_problems(SubLObject link) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    return prob_link_supporting_mapped_problems(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7521) 
  public static final SubLObject problem_link_open_flags(SubLObject link) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    return prob_link_open_flags(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7641) 
  public static final SubLObject problem_link_data(SubLObject link) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    return prob_link_data(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7751) 
  public static final SubLObject set_problem_link_open_flags(SubLObject link, SubLObject flags) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    checkType(flags, $sym49$INTEGERP);
    _csetf_prob_link_open_flags(link, flags);
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 7944) 
  public static final SubLObject set_problem_link_data(SubLObject link, SubLObject data) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    _csetf_prob_link_data(link, data);
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 8904) 
  public static final SubLObject problem_link_store(SubLObject link) {
    if ((NIL != inference_worker_answer.answer_link_p(link))) {
      return inference_datastructures_inference.inference_problem_store(problem_link_supported_inference(link));
    } else {
      return inference_datastructures_problem.problem_store(problem_link_supported_problem(link));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 9125) 
  public static final SubLObject problem_link_has_typeP(SubLObject link, SubLObject type) {
    {
      SubLObject pcase_var = type;
      if (pcase_var.eql($kw50$CONTENT)) {
        return inference_worker.content_link_p(link);
      } else if (pcase_var.eql($kw51$STRUCTURAL)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35352");
      } else if (pcase_var.eql($kw52$DISJUNCTIVE)) {
        return inference_worker.disjunctive_link_p(link);
      } else if (pcase_var.eql($kw53$CONJUNCTIVE)) {
        return inference_worker.conjunctive_link_p(link);
      } else if (pcase_var.eql($kw54$CONNECTED_CONJUNCTION)) {
        return inference_worker.connected_conjunction_link_p(link);
      } else if (pcase_var.eql($kw55$LOGICAL)) {
        return inference_worker.logical_link_p(link);
      } else if (pcase_var.eql($kw56$SPLIT_RESTRICTION)) {
        return makeBoolean(((NIL != inference_worker_split.split_link_p(link))
              || (NIL != inference_worker_restriction.restriction_link_p(link))));
      } else if (pcase_var.eql($kw57$SIMPLIFICATION)) {
        return inference_worker_restriction.simplification_link_p(link);
      } else if (pcase_var.eql($kw58$REMOVAL_CONJUNCTIVE)) {
        return inference_worker_removal.conjunctive_removal_link_p(link);
      } else {
        return Equality.eq(type, problem_link_type(link));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 9862) 
  public static final SubLObject problem_link_supported_inference(SubLObject link) {
    if ((NIL != inference_worker_answer.answer_link_p(link))) {
      return problem_link_supported_object(link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10001) 
  public static final SubLObject problem_link_supported_problem(SubLObject link) {
    if ((NIL == inference_worker_answer.answer_link_p(link))) {
      return problem_link_supported_object(link);
    }
    return NIL;
  }

  /** @return boolean; t iff OBJECT is a problem-link with at least one argument (child) link. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10139) 
  public static final SubLObject problem_link_with_supporting_problem_p(SubLObject object) {
    return makeBoolean(((NIL != problem_link_p(object))
           && (NIL != list_utilities.sublisp_boolean(problem_link_supporting_mapped_problems(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10587) 
  public static final SubLObject problem_link_number_of_supporting_problems(SubLObject link) {
    return problem_link_supporting_mapped_problem_count(link);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10779) 
  public static final SubLObject problem_link_supporting_mapped_problem_count(SubLObject link) {
    return Sequences.length(problem_link_supporting_mapped_problems(link));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 10915) 
  public static final SubLObject problem_link_first_supporting_mapped_problem(SubLObject link) {
    return problem_link_supporting_mapped_problems(link).first();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11050) 
  public static final SubLObject problem_link_sole_supporting_mapped_problem(SubLObject link) {
    checkType(link, $sym61$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
    return problem_link_first_supporting_mapped_problem(link);
  }

  /** @param LINK problem-link-p;
   @return problem-p; The sole supporting problem of LINK. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11692) 
  public static final SubLObject problem_link_sole_supporting_problem(SubLObject link) {
    return mapped_problem_problem(problem_link_sole_supporting_mapped_problem(link));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 11931) 
  public static final SubLObject problem_link_find_supporting_mapped_problem_by_index(SubLObject link, SubLObject index) {
    return ConsesLow.nth(index, problem_link_supporting_mapped_problems(link));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12084) 
  public static final SubLObject problem_link_openP(SubLObject link) {
    return makeBoolean((!(problem_link_open_flags(link).isZero())));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12185) 
  public static final SubLObject problem_link_closedP(SubLObject link) {
    return makeBoolean((NIL == problem_link_openP(link)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12274) 
  public static final SubLObject problem_link_index_openP(SubLObject link, SubLObject index) {
    {
      SubLObject flags = problem_link_open_flags(link);
      return number_utilities.get_bit(flags, index);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12414) 
  public static final SubLObject problem_link_supporting_mapped_problem_openP(SubLObject link, SubLObject supporting_mapped_problem) {
    {
      SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), $sym62$MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return problem_link_index_openP(link, index);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 12685) 
  public static final SubLObject problem_link_sole_supporting_mapped_problem_openP(SubLObject link) {
    checkType(link, $sym61$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
    return problem_link_index_openP(link, ZERO_INTEGER);
  }

  /** Adds SUPPORTING-PROBLEM to the list of problems below LINK */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 15690) 
  public static final SubLObject add_problem_link_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
    checkType(link, $sym1$PROBLEM_LINK_P);
    checkType(supporting_mapped_problem, $sym66$MAPPED_PROBLEM_P);
    _csetf_prob_link_supporting_mapped_problems(link, cons(supporting_mapped_problem, prob_link_supporting_mapped_problems(link)));
    return link;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16059) 
  public static final SubLObject problem_link_open_all(SubLObject link) {
    {
      SubLObject supporting_mapped_problem_count = problem_link_supporting_mapped_problem_count(link);
      SubLObject flags = ZERO_INTEGER;
      SubLObject index = NIL;
      for (index = ZERO_INTEGER; index.numL(supporting_mapped_problem_count); index = Numbers.add(index, ONE_INTEGER)) {
        flags = number_utilities.set_bit(flags, index, T);
      }
      set_problem_link_open_flags(link, flags);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16374) 
  public static final SubLObject problem_link_open_index(SubLObject link, SubLObject index) {
    {
      SubLObject flags = problem_link_open_flags(link);
      flags = number_utilities.set_bit(flags, index, T);
      set_problem_link_open_flags(link, flags);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16580) 
  public static final SubLObject problem_link_open_supporting_mapped_problem(SubLObject link, SubLObject supporting_mapped_problem) {
    {
      SubLObject index = Sequences.position(supporting_mapped_problem, problem_link_supporting_mapped_problems(link), $sym62$MAPPED_PROBLEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return ((NIL != index) ? ((SubLObject) problem_link_open_index(link, index)) : NIL);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 16863) 
  public static final SubLObject problem_link_open_sole_supporting_mapped_problem(SubLObject link) {
    checkType(link, $sym61$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
    return problem_link_open_index(link, ZERO_INTEGER);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17046) 
  public static final SubLObject problem_link_close_index(SubLObject link, SubLObject index) {
    {
      SubLObject flags = problem_link_open_flags(link);
      flags = number_utilities.set_bit(flags, index, NIL);
      set_problem_link_open_flags(link, flags);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17256) 
  public static final SubLObject problem_link_close_all(SubLObject link) {
    set_problem_link_open_flags(link, ZERO_INTEGER);
    return link;
  }

  /** Adds a 'down' edge from LINK (above) to PROBLEM (below) */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 17814) 
  public static final SubLObject connect_supporting_mapped_problem_with_dependent_link(SubLObject supporting_mapped_problem, SubLObject link) {
    checkType(supporting_mapped_problem, $sym66$MAPPED_PROBLEM_P);
    checkType(link, $sym1$PROBLEM_LINK_P);
    add_problem_link_supporting_mapped_problem(link, supporting_mapped_problem);
    inference_datastructures_problem.add_problem_dependent_link(mapped_problem_problem(supporting_mapped_problem), link);
    return NIL;
  }

  /** @return boolean; t iff LINK is a link to goal.
The only links (except for links in the middle of being created) which
have no supporting-mapped-problems are links to goal. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 18278) 
  public static final SubLObject problem_link_to_goal_p(SubLObject link) {
    {
      SubLObject supporting_mapped_problems = problem_link_supporting_mapped_problems(link);
      return Types.sublisp_null(supporting_mapped_problems);
    }
  }

  public static final class $mapped_problem_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $problem; }
    public SubLObject getField3() { return $variable_map; }
    public SubLObject setField2(SubLObject value) { return $problem = value; }
    public SubLObject setField3(SubLObject value) { return $variable_map = value; }
    public SubLObject $problem = NIL;
    public SubLObject $variable_map = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($mapped_problem_native.class, $sym67$MAPPED_PROBLEM, $sym66$MAPPED_PROBLEM_P, $list69, $list70, new String[] {"$problem", "$variable_map"}, $list71, $list72, $sym73$PRINT_MAPPED_PROBLEM);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static SubLSymbol $dtp_mapped_problem$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static final SubLObject mapped_problem_p(SubLObject object) {
    return ((object.getClass() == $mapped_problem_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $mapped_problem_p$UnaryFunction extends UnaryFunction {
    public $mapped_problem_p$UnaryFunction() { super(extractFunctionNamed("MAPPED-PROBLEM-P")); }
    public SubLObject processItem(SubLObject arg1) { return mapped_problem_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static final SubLObject mapped_prob_problem(SubLObject object) {
    checkType(object, $sym66$MAPPED_PROBLEM_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static final SubLObject mapped_prob_variable_map(SubLObject object) {
    checkType(object, $sym66$MAPPED_PROBLEM_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static final SubLObject _csetf_mapped_prob_problem(SubLObject object, SubLObject value) {
    checkType(object, $sym66$MAPPED_PROBLEM_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static final SubLObject _csetf_mapped_prob_variable_map(SubLObject object, SubLObject value) {
    checkType(object, $sym66$MAPPED_PROBLEM_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21380) 
  public static final SubLObject make_mapped_problem(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $mapped_problem_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw79$PROBLEM)) {
            _csetf_mapped_prob_problem(v_new, current_value);
          } else if (pcase_var.eql($kw80$VARIABLE_MAP)) {
            _csetf_mapped_prob_variable_map(v_new, current_value);
          } else {
            Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 21816) 
  public static final SubLObject valid_mapped_problem_p(SubLObject object) {
    return makeBoolean(((NIL != mapped_problem_p(object))
           && ($kw31$FREE != mapped_problem_variable_map(object))
           && (NIL != inference_datastructures_problem.valid_problem_p(mapped_problem_problem(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22026) 
  public static final SubLObject mapped_problem_equal(SubLObject mapped_problem1, SubLObject mapped_problem2) {
    if ((mapped_problem1 == mapped_problem2)) {
      return T;
    }
    {
      SubLObject problem1 = mapped_problem_problem(mapped_problem1);
      SubLObject problem2 = mapped_problem_problem(mapped_problem2);
      if ((problem1 != problem2)) {
        return NIL;
      }
    }
    {
      SubLObject variable_map1 = mapped_problem_variable_map(mapped_problem1);
      SubLObject variable_map2 = mapped_problem_variable_map(mapped_problem2);
      return Equality.equal(variable_map1, variable_map2);
    }
  }

  public static final class $mapped_problem_equal$BinaryFunction extends BinaryFunction {
    public $mapped_problem_equal$BinaryFunction() { super(extractFunctionNamed("MAPPED-PROBLEM-EQUAL")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return mapped_problem_equal(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 22825) 
  public static final SubLObject sxhash_mapped_problem_method(SubLObject object) {
    return Numbers.logxor(Sxhash.sxhash(mapped_prob_problem(object)), Sxhash.sxhash(mapped_prob_variable_map(object)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23280) 
  public static final SubLObject new_mapped_problem(SubLObject problem, SubLObject variable_map) {
    checkType(problem, $sym40$PROBLEM_P);
    checkType(variable_map, $sym86$VARIABLE_MAP_P);
    {
      SubLObject mapped_problem = make_mapped_problem(UNPROVIDED);
      _csetf_mapped_prob_problem(mapped_problem, problem);
      _csetf_mapped_prob_variable_map(mapped_problem, variable_map);
      return mapped_problem;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 23801) 
  public static final SubLObject destroy_problem_link_mapped_problem(SubLObject mapped_problem) {
    if ((NIL != valid_mapped_problem_p(mapped_problem))) {
      note_mapped_problem_invalid(mapped_problem);
      return destroy_mapped_problem_int(mapped_problem);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24041) 
  public static final SubLObject destroy_mapped_problem_int(SubLObject mapped_problem) {
    _csetf_mapped_prob_problem(mapped_problem, $kw31$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24168) 
  public static final SubLObject note_mapped_problem_invalid(SubLObject mapped_problem) {
    _csetf_mapped_prob_variable_map(mapped_problem, $kw31$FREE);
    return mapped_problem;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24312) 
  public static final SubLObject mapped_problem_problem(SubLObject mapped_problem) {
    checkType(mapped_problem, $sym66$MAPPED_PROBLEM_P);
    return mapped_prob_problem(mapped_problem);
  }

  /** Variable maps go UP, i.e. (<supporting problem's vars> -> <supported problem's vars>) */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 24476) 
  public static final SubLObject mapped_problem_variable_map(SubLObject mapped_problem) {
    checkType(mapped_problem, $sym66$MAPPED_PROBLEM_P);
    return mapped_prob_variable_map(mapped_problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-link.lisp", position = 25047) 
  public static final SubLObject find_supporting_mapped_problem_by_index(SubLObject link, SubLObject index) {
    {
      SubLObject candidate_index = ZERO_INTEGER;
      SubLObject link_var = link;
      SubLObject cdolist_list_var = problem_link_supporting_mapped_problems(link_var);
      SubLObject supporting_mapped_problem = NIL;
      for (supporting_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supporting_mapped_problem = cdolist_list_var.first()) {
        if ((NIL != inference_macros.do_problem_link_open_matchP(NIL, link_var, supporting_mapped_problem))) {
          if (index.numE(candidate_index)) {
            return supporting_mapped_problem;
          }
          candidate_index = Numbers.add(candidate_index, ONE_INTEGER);
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_inference_datastructures_problem_link_file() {
    declareFunction(myName, "problem_link_print_function_trampoline", "PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "problem_link_p", "PROBLEM-LINK-P", 1, 0, false); new $problem_link_p$UnaryFunction();
    declareFunction(myName, "prob_link_suid", "PROB-LINK-SUID", 1, 0, false);
    declareFunction(myName, "prob_link_type", "PROB-LINK-TYPE", 1, 0, false);
    declareFunction(myName, "prob_link_supported_object", "PROB-LINK-SUPPORTED-OBJECT", 1, 0, false);
    declareFunction(myName, "prob_link_supporting_mapped_problems", "PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "prob_link_open_flags", "PROB-LINK-OPEN-FLAGS", 1, 0, false);
    declareFunction(myName, "prob_link_data", "PROB-LINK-DATA", 1, 0, false);
    declareFunction(myName, "prob_link_proofs", "PROB-LINK-PROOFS", 1, 0, false);
    declareFunction(myName, "_csetf_prob_link_suid", "_CSETF-PROB-LINK-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_prob_link_type", "_CSETF-PROB-LINK-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_prob_link_supported_object", "_CSETF-PROB-LINK-SUPPORTED-OBJECT", 2, 0, false);
    declareFunction(myName, "_csetf_prob_link_supporting_mapped_problems", "_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_link_open_flags", "_CSETF-PROB-LINK-OPEN-FLAGS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_link_data", "_CSETF-PROB-LINK-DATA", 2, 0, false);
    declareFunction(myName, "_csetf_prob_link_proofs", "_CSETF-PROB-LINK-PROOFS", 2, 0, false);
    declareFunction(myName, "make_problem_link", "MAKE-PROBLEM-LINK", 0, 1, false);
    declareFunction(myName, "valid_problem_link_p", "VALID-PROBLEM-LINK-P", 1, 0, false);
    declareFunction(myName, "problem_link_invalid_p", "PROBLEM-LINK-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_problem_link", "PRINT-PROBLEM-LINK", 3, 0, false);
    declareFunction(myName, "sxhash_problem_link_method", "SXHASH-PROBLEM-LINK-METHOD", 1, 0, false); new $sxhash_problem_link_method$UnaryFunction();
    declareFunction(myName, "new_problem_link", "NEW-PROBLEM-LINK", 2, 0, false);
    declareFunction(myName, "new_problem_link_int", "NEW-PROBLEM-LINK-INT", 2, 0, false);
    declareFunction(myName, "destroy_problem_link", "DESTROY-PROBLEM-LINK", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_link", "DESTROY-PROBLEM-STORE-LINK", 1, 0, false);
    declareFunction(myName, "destroy_problem_link_int", "DESTROY-PROBLEM-LINK-INT", 1, 0, false);
    declareFunction(myName, "note_problem_link_invalid", "NOTE-PROBLEM-LINK-INVALID", 1, 0, false);
    declareFunction(myName, "problem_link_suid", "PROBLEM-LINK-SUID", 1, 0, false);
    declareFunction(myName, "problem_link_type", "PROBLEM-LINK-TYPE", 1, 0, false);
    declareFunction(myName, "problem_link_supported_object", "PROBLEM-LINK-SUPPORTED-OBJECT", 1, 0, false);
    declareFunction(myName, "problem_link_supporting_mapped_problems", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_link_open_flags", "PROBLEM-LINK-OPEN-FLAGS", 1, 0, false);
    declareFunction(myName, "problem_link_data", "PROBLEM-LINK-DATA", 1, 0, false);
    declareFunction(myName, "set_problem_link_open_flags", "SET-PROBLEM-LINK-OPEN-FLAGS", 2, 0, false);
    declareFunction(myName, "set_problem_link_data", "SET-PROBLEM-LINK-DATA", 2, 0, false);
    declareFunction(myName, "add_problem_link_proof", "ADD-PROBLEM-LINK-PROOF", 2, 0, false);
    declareFunction(myName, "remove_problem_link_proof", "REMOVE-PROBLEM-LINK-PROOF", 2, 0, false);
    declareFunction(myName, "problem_link_supporting_problems", "PROBLEM-LINK-SUPPORTING-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_link_store", "PROBLEM-LINK-STORE", 1, 0, false);
    declareFunction(myName, "problem_link_has_typeP", "PROBLEM-LINK-HAS-TYPE?", 2, 0, false);
    declareFunction(myName, "problem_link_supported_inference", "PROBLEM-LINK-SUPPORTED-INFERENCE", 1, 0, false);
    declareFunction(myName, "problem_link_supported_problem", "PROBLEM-LINK-SUPPORTED-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_with_supporting_problem_p", "PROBLEM-LINK-WITH-SUPPORTING-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "problem_link_with_single_supporting_problem_p", "PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "problem_link_number_of_supporting_problems", "PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_link_supporting_mapped_problem_count", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_link_first_supporting_mapped_problem", "PROBLEM-LINK-FIRST-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_sole_supporting_mapped_problem", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_sole_supporting_variable_map", "PROBLEM-LINK-SOLE-SUPPORTING-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "problem_link_first_supporting_problem", "PROBLEM-LINK-FIRST-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_sole_supporting_problem", "PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_find_supporting_mapped_problem_by_index", "PROBLEM-LINK-FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
    declareFunction(myName, "problem_link_openP", "PROBLEM-LINK-OPEN?", 1, 0, false);
    declareFunction(myName, "problem_link_closedP", "PROBLEM-LINK-CLOSED?", 1, 0, false);
    declareFunction(myName, "problem_link_index_openP", "PROBLEM-LINK-INDEX-OPEN?", 2, 0, false);
    declareFunction(myName, "problem_link_supporting_mapped_problem_openP", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-OPEN?", 2, 0, false);
    declareFunction(myName, "problem_link_sole_supporting_mapped_problem_openP", "PROBLEM-LINK-SOLE-SUPPORTING-MAPPED-PROBLEM-OPEN?", 1, 0, false);
    declareFunction(myName, "supporting_mapped_problem_open_wrt_linkP", "SUPPORTING-MAPPED-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
    declareFunction(myName, "supporting_problem_open_wrt_linkP", "SUPPORTING-PROBLEM-OPEN-WRT-LINK?", 2, 0, false);
    declareFunction(myName, "problem_link_completely_openP", "PROBLEM-LINK-COMPLETELY-OPEN?", 1, 0, false);
    declareFunction(myName, "problem_link_has_some_proofP", "PROBLEM-LINK-HAS-SOME-PROOF?", 1, 1, false);
    declareFunction(myName, "problem_link_goodP", "PROBLEM-LINK-GOOD?", 1, 0, false);
    declareFunction(myName, "problem_link_proofs", "PROBLEM-LINK-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_link_all_proofs_computed", "PROBLEM-LINK-ALL-PROOFS-COMPUTED", 1, 0, false);
    declareFunction(myName, "problem_link_all_proofs", "PROBLEM-LINK-ALL-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_link_proof_count", "PROBLEM-LINK-PROOF-COUNT", 1, 0, false);
    declareFunction(myName, "problem_link_destructibleP", "PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "problem_link_destructibility_status", "PROBLEM-LINK-DESTRUCTIBILITY-STATUS", 1, 0, false);
    declareFunction(myName, "add_problem_link_supporting_mapped_problem", "ADD-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "problem_link_open_all", "PROBLEM-LINK-OPEN-ALL", 1, 0, false);
    declareFunction(myName, "problem_link_open_index", "PROBLEM-LINK-OPEN-INDEX", 2, 0, false);
    declareFunction(myName, "problem_link_open_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "problem_link_open_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_link_close_index", "PROBLEM-LINK-CLOSE-INDEX", 2, 0, false);
    declareFunction(myName, "problem_link_close_all", "PROBLEM-LINK-CLOSE-ALL", 1, 0, false);
    declareFunction(myName, "problem_link_close_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "problem_link_close_sole_supporting_mapped_problem", "PROBLEM-LINK-CLOSE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "connect_supporting_mapped_problem_with_dependent_link", "CONNECT-SUPPORTING-MAPPED-PROBLEM-WITH-DEPENDENT-LINK", 2, 0, false);
    declareFunction(myName, "problem_link_to_goal_p", "PROBLEM-LINK-TO-GOAL-P", 1, 0, false);
    declareFunction(myName, "find_problem_link_of_type_between", "FIND-PROBLEM-LINK-OF-TYPE-BETWEEN", 3, 0, false);
    declareFunction(myName, "link_of_type_betweenP", "LINK-OF-TYPE-BETWEEN?", 3, 0, false);
    declareFunction(myName, "find_closed_supporting_problem_by_query", "FIND-CLOSED-SUPPORTING-PROBLEM-BY-QUERY", 2, 0, false);
    declareFunction(myName, "find_supporting_mapped_problem_by_query_and_variable_map", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-QUERY-AND-VARIABLE-MAP", 3, 0, false);
    declareFunction(myName, "problem_link_supporting_mapped_problem_that_isnt", "PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-THAT-ISNT", 2, 0, false);
    declareFunction(myName, "mapped_problem_print_function_trampoline", "MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "mapped_problem_p", "MAPPED-PROBLEM-P", 1, 0, false); new $mapped_problem_p$UnaryFunction();
    declareFunction(myName, "mapped_prob_problem", "MAPPED-PROB-PROBLEM", 1, 0, false);
    declareFunction(myName, "mapped_prob_variable_map", "MAPPED-PROB-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "_csetf_mapped_prob_problem", "_CSETF-MAPPED-PROB-PROBLEM", 2, 0, false);
    declareFunction(myName, "_csetf_mapped_prob_variable_map", "_CSETF-MAPPED-PROB-VARIABLE-MAP", 2, 0, false);
    declareFunction(myName, "make_mapped_problem", "MAKE-MAPPED-PROBLEM", 0, 1, false);
    declareFunction(myName, "valid_mapped_problem_p", "VALID-MAPPED-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "mapped_problem_equal", "MAPPED-PROBLEM-EQUAL", 2, 0, false); new $mapped_problem_equal$BinaryFunction();
    declareFunction(myName, "print_mapped_problem", "PRINT-MAPPED-PROBLEM", 3, 0, false);
    declareFunction(myName, "sxhash_mapped_problem_method", "SXHASH-MAPPED-PROBLEM-METHOD", 1, 0, false);
    declareFunction(myName, "closed_mapped_problem_p", "CLOSED-MAPPED-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "new_mapped_problem", "NEW-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "new_closed_mapped_problem", "NEW-CLOSED-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "destroy_problem_link_mapped_problem", "DESTROY-PROBLEM-LINK-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "destroy_mapped_problem_int", "DESTROY-MAPPED-PROBLEM-INT", 1, 0, false);
    declareFunction(myName, "note_mapped_problem_invalid", "NOTE-MAPPED-PROBLEM-INVALID", 1, 0, false);
    declareFunction(myName, "mapped_problem_problem", "MAPPED-PROBLEM-PROBLEM", 1, 0, false);
    declareFunction(myName, "mapped_problem_variable_map", "MAPPED-PROBLEM-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "supporting_mapped_problem_index", "SUPPORTING-MAPPED-PROBLEM-INDEX", 2, 0, false);
    declareFunction(myName, "find_supporting_mapped_problem_by_index", "FIND-SUPPORTING-MAPPED-PROBLEM-BY-INDEX", 2, 0, false);
    declareFunction(myName, "mapped_problem_query_as_subquery", "MAPPED-PROBLEM-QUERY-AS-SUBQUERY", 1, 0, false);
    declareFunction(myName, "mapped_problem_equals_specP", "MAPPED-PROBLEM-EQUALS-SPEC?", 3, 0, false);
    declareMacro(myName, "do_problem_link_supporting_mapped_problem_interpretations", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
    declareMacro(myName, "do_problem_link_supporting_variable_map_interpretations", "DO-PROBLEM-LINK-SUPPORTING-VARIABLE-MAP-INTERPRETATIONS");
    declareFunction(myName, "link_has_some_sibling_linkP", "LINK-HAS-SOME-SIBLING-LINK?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_problem_link_file() {
    $problem_link_datastructure_stores_proofsP$ = defparameter("*PROBLEM-LINK-DATASTRUCTURE-STORES-PROOFS?*", NIL);
    $dtp_problem_link$ = defconstant("*DTP-PROBLEM-LINK*", $sym0$PROBLEM_LINK);
    $dtp_mapped_problem$ = defconstant("*DTP-MAPPED-PROBLEM*", $sym67$MAPPED_PROBLEM);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_problem_link_file() {
    // CVS_ID("Id: inference-datastructures-problem-link.lisp 128378 2009-07-22 17:22:05Z jantos ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), Symbols.symbol_function($sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$PROB_LINK_SUID, $sym10$_CSETF_PROB_LINK_SUID);
    Structures.def_csetf($sym11$PROB_LINK_TYPE, $sym12$_CSETF_PROB_LINK_TYPE);
    Structures.def_csetf($sym13$PROB_LINK_SUPPORTED_OBJECT, $sym14$_CSETF_PROB_LINK_SUPPORTED_OBJECT);
    Structures.def_csetf($sym15$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS, $sym16$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS);
    Structures.def_csetf($sym17$PROB_LINK_OPEN_FLAGS, $sym18$_CSETF_PROB_LINK_OPEN_FLAGS);
    Structures.def_csetf($sym19$PROB_LINK_DATA, $sym20$_CSETF_PROB_LINK_DATA);
    Structures.def_csetf($sym21$PROB_LINK_PROOFS, $sym22$_CSETF_PROB_LINK_PROOFS);
    Equality.identity($sym0$PROBLEM_LINK);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_link$.getGlobalValue(), Symbols.symbol_function($sym37$SXHASH_PROBLEM_LINK_METHOD));
    access_macros.define_obsolete_register($sym59$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS, $list60);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function($sym74$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym75$MAPPED_PROB_PROBLEM, $sym76$_CSETF_MAPPED_PROB_PROBLEM);
    Structures.def_csetf($sym77$MAPPED_PROB_VARIABLE_MAP, $sym78$_CSETF_MAPPED_PROB_VARIABLE_MAP);
    Equality.identity($sym67$MAPPED_PROBLEM);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_mapped_problem$.getGlobalValue(), Symbols.symbol_function($sym85$SXHASH_MAPPED_PROBLEM_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$PROBLEM_LINK = makeSymbol("PROBLEM-LINK");
  public static final SubLSymbol $sym1$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
  public static final SubLInteger $int2$213 = makeInteger(213);
  public static final SubLList $list3 = list(makeSymbol("SUID"), makeSymbol("TYPE"), makeSymbol("SUPPORTED-OBJECT"), makeSymbol("SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("OPEN-FLAGS"), makeSymbol("DATA"), makeSymbol("PROOFS"));
  public static final SubLList $list4 = list(makeKeyword("SUID"), makeKeyword("TYPE"), makeKeyword("SUPPORTED-OBJECT"), makeKeyword("SUPPORTING-MAPPED-PROBLEMS"), makeKeyword("OPEN-FLAGS"), makeKeyword("DATA"), makeKeyword("PROOFS"));
  public static final SubLList $list5 = list(makeSymbol("PROB-LINK-SUID"), makeSymbol("PROB-LINK-TYPE"), makeSymbol("PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("PROB-LINK-OPEN-FLAGS"), makeSymbol("PROB-LINK-DATA"), makeSymbol("PROB-LINK-PROOFS"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-PROB-LINK-SUID"), makeSymbol("_CSETF-PROB-LINK-TYPE"), makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT"), makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS"), makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS"), makeSymbol("_CSETF-PROB-LINK-DATA"), makeSymbol("_CSETF-PROB-LINK-PROOFS"));
  public static final SubLSymbol $sym7$PRINT_PROBLEM_LINK = makeSymbol("PRINT-PROBLEM-LINK");
  public static final SubLSymbol $sym8$PROBLEM_LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-LINK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$PROB_LINK_SUID = makeSymbol("PROB-LINK-SUID");
  public static final SubLSymbol $sym10$_CSETF_PROB_LINK_SUID = makeSymbol("_CSETF-PROB-LINK-SUID");
  public static final SubLSymbol $sym11$PROB_LINK_TYPE = makeSymbol("PROB-LINK-TYPE");
  public static final SubLSymbol $sym12$_CSETF_PROB_LINK_TYPE = makeSymbol("_CSETF-PROB-LINK-TYPE");
  public static final SubLSymbol $sym13$PROB_LINK_SUPPORTED_OBJECT = makeSymbol("PROB-LINK-SUPPORTED-OBJECT");
  public static final SubLSymbol $sym14$_CSETF_PROB_LINK_SUPPORTED_OBJECT = makeSymbol("_CSETF-PROB-LINK-SUPPORTED-OBJECT");
  public static final SubLSymbol $sym15$PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLSymbol $sym16$_CSETF_PROB_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("_CSETF-PROB-LINK-SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLSymbol $sym17$PROB_LINK_OPEN_FLAGS = makeSymbol("PROB-LINK-OPEN-FLAGS");
  public static final SubLSymbol $sym18$_CSETF_PROB_LINK_OPEN_FLAGS = makeSymbol("_CSETF-PROB-LINK-OPEN-FLAGS");
  public static final SubLSymbol $sym19$PROB_LINK_DATA = makeSymbol("PROB-LINK-DATA");
  public static final SubLSymbol $sym20$_CSETF_PROB_LINK_DATA = makeSymbol("_CSETF-PROB-LINK-DATA");
  public static final SubLSymbol $sym21$PROB_LINK_PROOFS = makeSymbol("PROB-LINK-PROOFS");
  public static final SubLSymbol $sym22$_CSETF_PROB_LINK_PROOFS = makeSymbol("_CSETF-PROB-LINK-PROOFS");
  public static final SubLSymbol $kw23$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw24$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw25$SUPPORTED_OBJECT = makeKeyword("SUPPORTED-OBJECT");
  public static final SubLSymbol $kw26$SUPPORTING_MAPPED_PROBLEMS = makeKeyword("SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLSymbol $kw27$OPEN_FLAGS = makeKeyword("OPEN-FLAGS");
  public static final SubLSymbol $kw28$DATA = makeKeyword("DATA");
  public static final SubLSymbol $kw29$PROOFS = makeKeyword("PROOFS");
  public static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw31$FREE = makeKeyword("FREE");
  public static final SubLString $str32$_Invalid_LINK__s_ = makeString("<Invalid LINK ~s>");
  public static final SubLString $str33$__a_LINK__a__a_supporting_ = makeString("<~a LINK ~a.~a supporting ");
  public static final SubLSymbol $kw34$ANSWER = makeKeyword("ANSWER");
  public static final SubLString $str35$_a_ = makeString("~a>");
  public static final SubLString $str36$_a__a_ = makeString("~a.~a>");
  public static final SubLSymbol $sym37$SXHASH_PROBLEM_LINK_METHOD = makeSymbol("SXHASH-PROBLEM-LINK-METHOD");
  public static final SubLSymbol $sym38$PROBLEM_LINK_TYPE_P = makeSymbol("PROBLEM-LINK-TYPE-P");
  public static final SubLString $str39$Can_t_call_new_problem_link_for_a = makeString("Can't call new-problem-link for an :answer link, call new-answer-link instead");
  public static final SubLSymbol $sym40$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $kw41$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw42$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw43$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $kw44$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw45$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $kw46$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw47$UNION = makeKeyword("UNION");
  public static final SubLSymbol $kw48$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $sym49$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw50$CONTENT = makeKeyword("CONTENT");
  public static final SubLSymbol $kw51$STRUCTURAL = makeKeyword("STRUCTURAL");
  public static final SubLSymbol $kw52$DISJUNCTIVE = makeKeyword("DISJUNCTIVE");
  public static final SubLSymbol $kw53$CONJUNCTIVE = makeKeyword("CONJUNCTIVE");
  public static final SubLSymbol $kw54$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw55$LOGICAL = makeKeyword("LOGICAL");
  public static final SubLSymbol $kw56$SPLIT_RESTRICTION = makeKeyword("SPLIT/RESTRICTION");
  public static final SubLSymbol $kw57$SIMPLIFICATION = makeKeyword("SIMPLIFICATION");
  public static final SubLSymbol $kw58$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLSymbol $sym59$PROBLEM_LINK_NUMBER_OF_SUPPORTING_PROBLEMS = makeSymbol("PROBLEM-LINK-NUMBER-OF-SUPPORTING-PROBLEMS");
  public static final SubLList $list60 = list(makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-COUNT"));
  public static final SubLSymbol $sym61$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
  public static final SubLSymbol $sym62$MAPPED_PROBLEM_EQUAL = makeSymbol("MAPPED-PROBLEM-EQUAL");
  public static final SubLSymbol $kw63$PROVEN = makeKeyword("PROVEN");
  public static final SubLSymbol $kw64$DESTRUCTIBLE = makeKeyword("DESTRUCTIBLE");
  public static final SubLSymbol $kw65$INDESTRUCTIBLE = makeKeyword("INDESTRUCTIBLE");
  public static final SubLSymbol $sym66$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
  public static final SubLSymbol $sym67$MAPPED_PROBLEM = makeSymbol("MAPPED-PROBLEM");
  public static final SubLInteger $int68$214 = makeInteger(214);
  public static final SubLList $list69 = list(makeSymbol("PROBLEM"), makeSymbol("VARIABLE-MAP"));
  public static final SubLList $list70 = list(makeKeyword("PROBLEM"), makeKeyword("VARIABLE-MAP"));
  public static final SubLList $list71 = list(makeSymbol("MAPPED-PROB-PROBLEM"), makeSymbol("MAPPED-PROB-VARIABLE-MAP"));
  public static final SubLList $list72 = list(makeSymbol("_CSETF-MAPPED-PROB-PROBLEM"), makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP"));
  public static final SubLSymbol $sym73$PRINT_MAPPED_PROBLEM = makeSymbol("PRINT-MAPPED-PROBLEM");
  public static final SubLSymbol $sym74$MAPPED_PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MAPPED-PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym75$MAPPED_PROB_PROBLEM = makeSymbol("MAPPED-PROB-PROBLEM");
  public static final SubLSymbol $sym76$_CSETF_MAPPED_PROB_PROBLEM = makeSymbol("_CSETF-MAPPED-PROB-PROBLEM");
  public static final SubLSymbol $sym77$MAPPED_PROB_VARIABLE_MAP = makeSymbol("MAPPED-PROB-VARIABLE-MAP");
  public static final SubLSymbol $sym78$_CSETF_MAPPED_PROB_VARIABLE_MAP = makeSymbol("_CSETF-MAPPED-PROB-VARIABLE-MAP");
  public static final SubLSymbol $kw79$PROBLEM = makeKeyword("PROBLEM");
  public static final SubLSymbol $kw80$VARIABLE_MAP = makeKeyword("VARIABLE-MAP");
  public static final SubLString $str81$_MAPPED_PROBLEM__a__a_ = makeString("<MAPPED PROBLEM:~a ~a>");
  public static final SubLString $str82$__ = makeString("#<");
  public static final SubLSymbol $kw83$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw84$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym85$SXHASH_MAPPED_PROBLEM_METHOD = makeSymbol("SXHASH-MAPPED-PROBLEM-METHOD");
  public static final SubLSymbol $sym86$VARIABLE_MAP_P = makeSymbol("VARIABLE-MAP-P");
  public static final SubLSymbol $sym87$CLOSED_PROBLEM_P = makeSymbol("CLOSED-PROBLEM-P");
  public static final SubLList $list88 = list(list(makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list89 = list(makeKeyword("OPEN?"), makeKeyword("DONE"));
  public static final SubLSymbol $kw90$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw91$OPEN_ = makeKeyword("OPEN?");
  public static final SubLSymbol $kw92$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym93$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");
  public static final SubLSymbol $sym94$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym95$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLSymbol $sym96$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym97$MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");
  public static final SubLList $list98 = list(list(makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("LINK"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym99$SUPPORTING_MAPPED_PROBLEM = makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");
  public static final SubLSymbol $sym100$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEM_INTERPRETATIONS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEM-INTERPRETATIONS");
  public static final SubLSymbol $sym101$MAPPED_PROBLEM_VARIABLE_MAP = makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_problem_link_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_problem_link_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_problem_link_file();
  }

}
