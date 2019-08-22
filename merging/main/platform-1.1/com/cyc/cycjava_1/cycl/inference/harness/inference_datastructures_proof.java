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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class inference_datastructures_proof extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_proof() {}
  public static final SubLFile me = new inference_datastructures_proof();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof";

  //// Definitions

  /** If T, when a proof A is made a subproof of another proof B, the proof B is also recorded in the dependents slot the subproof A. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 878) 
  public static SubLSymbol $proof_datastructure_stores_dependent_proofsP$ = null;

  public static final class $proof_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $suid; }
    public SubLObject getField3() { return $bindings; }
    public SubLObject getField4() { return $link; }
    public SubLObject getField5() { return $subproofs; }
    public SubLObject getField6() { return $dependents; }
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    public SubLObject setField3(SubLObject value) { return $bindings = value; }
    public SubLObject setField4(SubLObject value) { return $link = value; }
    public SubLObject setField5(SubLObject value) { return $subproofs = value; }
    public SubLObject setField6(SubLObject value) { return $dependents = value; }
    public SubLObject $suid = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $link = NIL;
    public SubLObject $subproofs = NIL;
    public SubLObject $dependents = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($proof_native.class, $sym0$PROOF, $sym1$PROOF_P, $list3, $list4, new String[] {"$suid", "$bindings", "$link", "$subproofs", "$dependents"}, $list5, $list6, $sym7$PRINT_PROOF);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static SubLSymbol $dtp_proof$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject proof_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35406");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject proof_p(SubLObject object) {
    return ((object.getClass() == $proof_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $proof_p$UnaryFunction extends UnaryFunction {
    public $proof_p$UnaryFunction() { super(extractFunctionNamed("PROOF-P")); }
    public SubLObject processItem(SubLObject arg1) { return proof_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject prf_suid(SubLObject object) {
    checkType(object, $sym1$PROOF_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject prf_bindings(SubLObject object) {
    checkType(object, $sym1$PROOF_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject prf_link(SubLObject object) {
    checkType(object, $sym1$PROOF_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject prf_subproofs(SubLObject object) {
    checkType(object, $sym1$PROOF_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject _csetf_prf_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROOF_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject _csetf_prf_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROOF_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject _csetf_prf_link(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROOF_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject _csetf_prf_subproofs(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROOF_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject _csetf_prf_dependents(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROOF_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 1290) 
  public static final SubLObject make_proof(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $proof_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw19$SUID)) {
            _csetf_prf_suid(v_new, current_value);
          } else if (pcase_var.eql($kw20$BINDINGS)) {
            _csetf_prf_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw21$LINK)) {
            _csetf_prf_link(v_new, current_value);
          } else if (pcase_var.eql($kw22$SUBPROOFS)) {
            _csetf_prf_subproofs(v_new, current_value);
          } else if (pcase_var.eql($kw23$DEPENDENTS)) {
            _csetf_prf_dependents(v_new, current_value);
          } else {
            Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2072) 
  public static final SubLObject valid_proof_p(SubLObject object) {
    return makeBoolean(((NIL != proof_p(object))
           && (NIL == proof_invalid_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 2185) 
  public static final SubLObject proof_invalid_p(SubLObject proof) {
    return Equality.eq($kw25$FREE, proof_bindings(proof));
  }

  public static final class $sxhash_proof_method$UnaryFunction extends UnaryFunction {
    public $sxhash_proof_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-PROOF-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35414"); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 5838) 
  public static final SubLObject new_proof(SubLObject link, SubLObject subproofs) {
    checkType(link, $sym57$PROBLEM_LINK_P);
    checkType(subproofs, $sym58$LIST_OF_PROOF_P);
    {
      SubLObject proof = make_proof(UNPROVIDED);
      SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
      SubLObject suid = inference_datastructures_problem_store.problem_store_new_proof_id(store);
      inference_metrics.increment_proof_historical_count();
      _csetf_prf_suid(proof, suid);
      _csetf_prf_link(proof, link);
      _csetf_prf_subproofs(proof, subproofs);
      return proof;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 6298) 
  public static final SubLObject new_proof_with_bindings(SubLObject link, SubLObject v_bindings, SubLObject subproofs) {
    {
      SubLObject proof = new_proof(link, subproofs);
      set_proof_bindings(proof, v_bindings);
      register_proof(proof);
      return proof;
    }
  }

  /** Adds backpointers to PROOF from other datastructures */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 6521) 
  public static final SubLObject register_proof(SubLObject proof) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject link = proof_link(proof);
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        inference_datastructures_problem.add_problem_proof(supported_problem, proof);
        inference_datastructures_problem_store.add_problem_store_proof(store, proof);
        if ((NIL != inference_datastructures_problem_link.$problem_link_datastructure_stores_proofsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35655");
        }
        if ((NIL != $proof_datastructure_stores_dependent_proofsP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35398");
        }
      }
      return proof;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8817) 
  public static final SubLObject destroy_problem_store_proof(SubLObject proof) {
    if ((NIL != valid_proof_p(proof))) {
      note_proof_invalid(proof);
      return destroy_proof_int(proof);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 8972) 
  public static final SubLObject destroy_proof_int(SubLObject proof) {
    _csetf_prf_subproofs(proof, $kw25$FREE);
    _csetf_prf_dependents(proof, $kw25$FREE);
    _csetf_prf_link(proof, $kw25$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9180) 
  public static final SubLObject note_proof_invalid(SubLObject proof) {
    _csetf_prf_bindings(proof, $kw25$FREE);
    return proof;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9276) 
  public static final SubLObject proof_suid(SubLObject proof) {
    checkType(proof, $sym1$PROOF_P);
    return prf_suid(proof);
  }

  /** Maps PROOF's problem-query -> HL proven-query of PROOF
or equivalently, PROOF's problem-query vars -> content.
Bindings to substitute into the supported-problem-query to get the proven-query.
First elements are variables in the supported-problem-query,
second elements are terms bound by this proof. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9381) 
  public static final SubLObject proof_bindings(SubLObject proof) {
    checkType(proof, $sym1$PROOF_P);
    return prf_bindings(proof);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9786) 
  public static final SubLObject proof_link(SubLObject proof) {
    checkType(proof, $sym1$PROOF_P);
    return prf_link(proof);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 9879) 
  public static final SubLObject proof_direct_subproofs(SubLObject proof) {
    checkType(proof, $sym1$PROOF_P);
    return prf_subproofs(proof);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10094) 
  public static final SubLObject set_proof_bindings(SubLObject proof, SubLObject v_bindings) {
    checkType(proof, $sym1$PROOF_P);
    checkType(v_bindings, $sym59$BINDING_LIST_P);
    _csetf_prf_bindings(proof, v_bindings);
    return proof;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 10907) 
  public static final SubLObject proof_store(SubLObject proof) {
    {
      SubLObject link = proof_link(proof);
      SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
      return store;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11051) 
  public static final SubLObject proof_supported_problem(SubLObject proof) {
    {
      SubLObject link = proof_link(proof);
      return inference_datastructures_problem_link.problem_link_supported_problem(link);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11504) 
  public static final SubLObject proof_supports(SubLObject proof) {
    {
      SubLObject link = proof_link(proof);
      if ((NIL != inference_worker.content_link_p(link))) {
        {
          SubLObject supports = inference_worker.content_link_supports(link);
          return supports;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11801) 
  public static final SubLObject proof_spec_direct_supports(SubLObject link, SubLObject subproofs) {
    return proof_spec_direct_supports_recursive(link, subproofs);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11927) 
  public static final SubLObject proof_direct_supports_recursive(SubLObject proof) {
    {
      SubLObject link = proof_link(proof);
      SubLObject subproofs = proof_direct_subproofs(proof);
      return proof_spec_direct_supports_recursive(link, subproofs);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 12145) 
  public static final SubLObject proof_spec_direct_supports_recursive(SubLObject link, SubLObject subproofs) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem_link.problem_link_store(link)))
           && (NIL != inference_worker_transformation.transformation_link_p(link)))) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == list_utilities.singletonP(subproofs))) {
            Errors.error($str61$Expected_link__a_to_have_exactly_, link);
          }
        }
        {
          SubLObject subproof = subproofs.first();
          return ConsesLow.append(inference_worker.content_link_supports(link), proof_direct_supports_recursive(subproof));
        }
      } else if ((NIL != inference_worker.content_link_p(link))) {
        return inference_worker.content_link_supports(link);
      } else if (((NIL != inference_worker_restriction.restriction_link_p(link))
          || (NIL != inference_worker_union.union_link_p(link)))) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == list_utilities.singletonP(subproofs))) {
            Errors.error($str61$Expected_link__a_to_have_exactly_, link);
          }
        }
        {
          SubLObject subproof = subproofs.first();
          return proof_direct_supports_recursive(subproof);
        }
      } else if ((NIL != inference_worker.conjunctive_link_p(link))) {
        {
          SubLObject direct_supports = NIL;
          SubLObject cdolist_list_var = subproofs;
          SubLObject subproof = NIL;
          for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
            {
              SubLObject cdolist_list_var_5 = proof_direct_supports_recursive(subproof);
              SubLObject direct_support = NIL;
              for (direct_support = cdolist_list_var_5.first(); (NIL != cdolist_list_var_5); cdolist_list_var_5 = cdolist_list_var_5.rest(), direct_support = cdolist_list_var_5.first()) {
                direct_supports = cons(direct_support, direct_supports);
              }
            }
          }
          return Sequences.nreverse(direct_supports);
        }
      } else {
        Errors.error($str62$Unexpected_link_type_for_proof___, link);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14125) 
  public static final SubLObject proof_has_subproofsP(SubLObject proof) {
    return list_utilities.sublisp_boolean(proof_direct_subproofs(proof));
  }

  /** @return nil or proof-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14520) 
  public static final SubLObject proof_first_subproof(SubLObject proof) {
    {
      SubLObject cdolist_list_var = proof_direct_subproofs(proof);
      SubLObject subproof = NIL;
      for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
        return subproof;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14674) 
  public static final SubLObject all_proof_subproofs(SubLObject proof) {
    {
      SubLObject v_set_contents = set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
      v_set_contents = all_proof_subproofs_recursive(proof, v_set_contents);
      return set_contents.set_contents_element_list(v_set_contents);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 14958) 
  public static final SubLObject all_proof_subproofs_recursive(SubLObject proof, SubLObject all_subproofs_set) {
    if ((NIL == set_contents.set_contents_memberP(proof, all_subproofs_set, Symbols.symbol_function(EQ)))) {
      all_subproofs_set = set_contents.set_contents_add(proof, all_subproofs_set, Symbols.symbol_function(EQ));
      {
        SubLObject cdolist_list_var = proof_direct_subproofs(proof);
        SubLObject subproof = NIL;
        for (subproof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subproof = cdolist_list_var.first()) {
          all_subproofs_set = all_proof_subproofs_recursive(subproof, all_subproofs_set);
        }
      }
    }
    return all_subproofs_set;
  }

  /** @return proof-status-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17108) 
  public static final SubLObject proof_status(SubLObject proof) {
    if ((NIL != proof_rejectedP(proof))) {
      return $kw67$REJECTED;
    } else {
      return $kw68$PROVEN;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17273) 
  public static final SubLObject proof_rejectedP(SubLObject proof) {
    {
      SubLObject store = proof_store(proof);
      SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
      return dictionary_utilities.dictionary_has_keyP(rejected_proofs, proof);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 17665) 
  public static final SubLObject proof_provenP(SubLObject proof) {
    return makeBoolean((NIL == proof_rejectedP(proof)));
  }

  public static final class $proof_provenP$UnaryFunction extends UnaryFunction {
    public $proof_provenP$UnaryFunction() { super(extractFunctionNamed("PROOF-PROVEN?")); }
    public SubLObject processItem(SubLObject arg1) { return proof_provenP(arg1); }
  }

  /** @return hl-module-p or problem-link-type-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 19042) 
  public static final SubLObject proof_type(SubLObject proof) {
    if ((NIL != inference_worker.content_proof_p(proof))) {
      return inference_worker.content_proof_hl_module(proof);
    } else {
      return inference_worker.structural_proof_type(proof);
    }
  }

  /** @return boolean; t iff CANDIDATE-PROOF would equal a proof supporting
SUPPORTED-PROBLEM, with bindings PROOF-BINDINGS and direct supports PROOF-DIRECT-SUPPORTS.
   @note assumes PROOF-BINDINGS have been canonicalized, but does not assume that PROOF-DIRECT-SUPPORTS has been canonicalized. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 19893) 
  public static final SubLObject proof_matches_specificationP(SubLObject candidate_proof, SubLObject supported_problem, SubLObject proof_bindings, SubLObject proof_direct_supports) {
    checkType(candidate_proof, $sym1$PROOF_P);
    checkType(supported_problem, $sym71$PROBLEM_P);
    if ((proof_supported_problem(candidate_proof) != supported_problem)) {
      return NIL;
    } else if ((NIL == inference_worker.proof_bindings_equalP(proof_bindings(candidate_proof), proof_bindings))) {
      return NIL;
    } else {
      return arguments.justification_equal(proof_direct_supports(candidate_proof), proof_direct_supports);
    }
  }


  @SubL(source = "cycl/inference/harness/inference-datastructures-proof.lisp", position = 11703) 
  public static final SubLObject proof_direct_supports(SubLObject proof) {
    return proof_direct_supports_recursive(proof);
  }

  
  public static final SubLObject declare_inference_datastructures_proof_file() {
    declareFunction(myName, "proof_print_function_trampoline", "PROOF-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "proof_p", "PROOF-P", 1, 0, false); new $proof_p$UnaryFunction();
    declareFunction(myName, "prf_suid", "PRF-SUID", 1, 0, false);
    declareFunction(myName, "prf_bindings", "PRF-BINDINGS", 1, 0, false);
    declareFunction(myName, "prf_link", "PRF-LINK", 1, 0, false);
    declareFunction(myName, "prf_subproofs", "PRF-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "prf_dependents", "PRF-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "_csetf_prf_suid", "_CSETF-PRF-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_prf_bindings", "_CSETF-PRF-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_prf_link", "_CSETF-PRF-LINK", 2, 0, false);
    declareFunction(myName, "_csetf_prf_subproofs", "_CSETF-PRF-SUBPROOFS", 2, 0, false);
    declareFunction(myName, "_csetf_prf_dependents", "_CSETF-PRF-DEPENDENTS", 2, 0, false);
    declareFunction(myName, "make_proof", "MAKE-PROOF", 0, 1, false);
    declareFunction(myName, "valid_proof_p", "VALID-PROOF-P", 1, 0, false);
    declareFunction(myName, "proof_invalid_p", "PROOF-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_proof", "PRINT-PROOF", 3, 0, false);
    declareFunction(myName, "sxhash_proof_method", "SXHASH-PROOF-METHOD", 1, 0, false); new $sxhash_proof_method$UnaryFunction();
    declareFunction(myName, "list_of_proof_p", "LIST-OF-PROOF-P", 1, 0, false);
    declareFunction(myName, "non_empty_list_of_proof_p", "NON-EMPTY-LIST-OF-PROOF-P", 1, 0, false);
    declareMacro(myName, "do_proof_direct_subproofs", "DO-PROOF-DIRECT-SUBPROOFS");
    declareMacro(myName, "do_proof_all_subproofs", "DO-PROOF-ALL-SUBPROOFS");
    declareMacro(myName, "do_proof_dependent_proofs_computed", "DO-PROOF-DEPENDENT-PROOFS-COMPUTED");
    declareMacro(myName, "do_proof_dependent_proofs_int", "DO-PROOF-DEPENDENT-PROOFS-INT");
    declareMacro(myName, "do_proof_dependent_proofs", "DO-PROOF-DEPENDENT-PROOFS");
    declareFunction(myName, "new_proof", "NEW-PROOF", 2, 0, false);
    declareFunction(myName, "new_proof_with_bindings", "NEW-PROOF-WITH-BINDINGS", 3, 0, false);
    declareFunction(myName, "register_proof", "REGISTER-PROOF", 1, 0, false);
    declareFunction(myName, "add_dependent_proof_references", "ADD-DEPENDENT-PROOF-REFERENCES", 1, 0, false);
    declareFunction(myName, "destroy_proof", "DESTROY-PROOF", 1, 0, false);
    declareFunction(myName, "destroy_dependent_proofs", "DESTROY-DEPENDENT-PROOFS", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_proof", "DESTROY-PROBLEM-STORE-PROOF", 1, 0, false);
    declareFunction(myName, "destroy_proof_int", "DESTROY-PROOF-INT", 1, 0, false);
    declareFunction(myName, "note_proof_invalid", "NOTE-PROOF-INVALID", 1, 0, false);
    declareFunction(myName, "proof_suid", "PROOF-SUID", 1, 0, false);
    declareFunction(myName, "proof_bindings", "PROOF-BINDINGS", 1, 0, false);
    declareFunction(myName, "proof_link", "PROOF-LINK", 1, 0, false);
    declareFunction(myName, "proof_direct_subproofs", "PROOF-DIRECT-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "proof_dependents", "PROOF-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "set_proof_bindings", "SET-PROOF-BINDINGS", 2, 0, false);
    declareFunction(myName, "add_proof_dependent", "ADD-PROOF-DEPENDENT", 2, 0, false);
    declareFunction(myName, "remove_proof_dependent", "REMOVE-PROOF-DEPENDENT", 2, 0, false);
    declareFunction(myName, "proof_store", "PROOF-STORE", 1, 0, false);
    declareFunction(myName, "proof_supported_problem", "PROOF-SUPPORTED-PROBLEM", 1, 0, false);
    declareFunction(myName, "proof_supported_problem_query", "PROOF-SUPPORTED-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "proof_has_supportsP", "PROOF-HAS-SUPPORTS?", 1, 0, false);
    declareFunction(myName, "proof_supports", "PROOF-SUPPORTS", 1, 0, false);
    declareFunction(myName, "proof_direct_supports", "PROOF-DIRECT-SUPPORTS", 1, 0, false);
    declareFunction(myName, "proof_spec_direct_supports", "PROOF-SPEC-DIRECT-SUPPORTS", 2, 0, false);
    declareFunction(myName, "proof_direct_supports_recursive", "PROOF-DIRECT-SUPPORTS-RECURSIVE", 1, 0, false);
    declareFunction(myName, "proof_spec_direct_supports_recursive", "PROOF-SPEC-DIRECT-SUPPORTS-RECURSIVE", 2, 0, false);
    declareFunction(myName, "all_proof_supports", "ALL-PROOF-SUPPORTS", 1, 0, false);
    declareFunction(myName, "all_proof_supports_recursive", "ALL-PROOF-SUPPORTS-RECURSIVE", 2, 0, false);
    declareFunction(myName, "all_proof_supports_of_proofs", "ALL-PROOF-SUPPORTS-OF-PROOFS", 1, 0, false);
    declareFunction(myName, "proof_has_subproofsP", "PROOF-HAS-SUBPROOFS?", 1, 0, false);
    declareFunction(myName, "proof_sole_subproof", "PROOF-SOLE-SUBPROOF", 1, 0, false);
    declareFunction(myName, "proof_first_subproof", "PROOF-FIRST-SUBPROOF", 1, 0, false);
    declareFunction(myName, "all_proof_subproofs", "ALL-PROOF-SUBPROOFS", 1, 0, false);
    declareFunction(myName, "all_proof_subproofs_recursive", "ALL-PROOF-SUBPROOFS-RECURSIVE", 2, 0, false);
    declareFunction(myName, "all_proof_subproblems", "ALL-PROOF-SUBPROBLEMS", 1, 0, false);
    declareFunction(myName, "proof_has_dependent_proofsP", "PROOF-HAS-DEPENDENT-PROOFS?", 1, 0, false);
    declareFunction(myName, "proof_dependent_proofs_computed", "PROOF-DEPENDENT-PROOFS-COMPUTED", 1, 1, false);
    declareFunction(myName, "proof_dependent_proofs_int", "PROOF-DEPENDENT-PROOFS-INT", 1, 1, false);
    declareFunction(myName, "proof_dependent_proofs", "PROOF-DEPENDENT-PROOFS", 1, 1, false);
    declareFunction(myName, "proof_status", "PROOF-STATUS", 1, 0, false);
    declareFunction(myName, "proof_rejectedP", "PROOF-REJECTED?", 1, 0, false);
    declareFunction(myName, "proof_reject_reason", "PROOF-REJECT-REASON", 1, 0, false);
    declareFunction(myName, "proof_provenP", "PROOF-PROVEN?", 1, 0, false); new $proof_provenP$UnaryFunction();
    declareFunction(myName, "proof_processedP", "PROOF-PROCESSED?", 1, 0, false);
    declareFunction(myName, "proof_destructibility_status", "PROOF-DESTRUCTIBILITY-STATUS", 1, 0, false);
    declareFunction(myName, "proof_indestructibleP", "PROOF-INDESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "proof_destructibleP", "PROOF-DESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "proof_note_rejected", "PROOF-NOTE-REJECTED", 2, 0, false);
    declareFunction(myName, "proof_rejected_due_to_ill_formednessP", "PROOF-REJECTED-DUE-TO-ILL-FORMEDNESS?", 1, 0, false);
    declareFunction(myName, "proof_type", "PROOF-TYPE", 1, 0, false);
    declareFunction(myName, "proof_equalP", "PROOF-EQUAL?", 2, 0, false);
    declareFunction(myName, "proof_matches_specificationP", "PROOF-MATCHES-SPECIFICATION?", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_proof_file() {
    $proof_datastructure_stores_dependent_proofsP$ = defparameter("*PROOF-DATASTRUCTURE-STORES-DEPENDENT-PROOFS?*", NIL);
    $dtp_proof$ = defconstant("*DTP-PROOF*", $sym0$PROOF);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_proof_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), Symbols.symbol_function($sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$PRF_SUID, $sym10$_CSETF_PRF_SUID);
    Structures.def_csetf($sym11$PRF_BINDINGS, $sym12$_CSETF_PRF_BINDINGS);
    Structures.def_csetf($sym13$PRF_LINK, $sym14$_CSETF_PRF_LINK);
    Structures.def_csetf($sym15$PRF_SUBPROOFS, $sym16$_CSETF_PRF_SUBPROOFS);
    Structures.def_csetf($sym17$PRF_DEPENDENTS, $sym18$_CSETF_PRF_DEPENDENTS);
    Equality.identity($sym0$PROOF);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_proof$.getGlobalValue(), Symbols.symbol_function($sym29$SXHASH_PROOF_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$PROOF = makeSymbol("PROOF");
  public static final SubLSymbol $sym1$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLInteger $int2$211 = makeInteger(211);
  public static final SubLList $list3 = list(makeSymbol("SUID"), makeSymbol("BINDINGS"), makeSymbol("LINK"), makeSymbol("SUBPROOFS"), makeSymbol("DEPENDENTS"));
  public static final SubLList $list4 = list(makeKeyword("SUID"), makeKeyword("BINDINGS"), makeKeyword("LINK"), makeKeyword("SUBPROOFS"), makeKeyword("DEPENDENTS"));
  public static final SubLList $list5 = list(makeSymbol("PRF-SUID"), makeSymbol("PRF-BINDINGS"), makeSymbol("PRF-LINK"), makeSymbol("PRF-SUBPROOFS"), makeSymbol("PRF-DEPENDENTS"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-PRF-SUID"), makeSymbol("_CSETF-PRF-BINDINGS"), makeSymbol("_CSETF-PRF-LINK"), makeSymbol("_CSETF-PRF-SUBPROOFS"), makeSymbol("_CSETF-PRF-DEPENDENTS"));
  public static final SubLSymbol $sym7$PRINT_PROOF = makeSymbol("PRINT-PROOF");
  public static final SubLSymbol $sym8$PROOF_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROOF-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$PRF_SUID = makeSymbol("PRF-SUID");
  public static final SubLSymbol $sym10$_CSETF_PRF_SUID = makeSymbol("_CSETF-PRF-SUID");
  public static final SubLSymbol $sym11$PRF_BINDINGS = makeSymbol("PRF-BINDINGS");
  public static final SubLSymbol $sym12$_CSETF_PRF_BINDINGS = makeSymbol("_CSETF-PRF-BINDINGS");
  public static final SubLSymbol $sym13$PRF_LINK = makeSymbol("PRF-LINK");
  public static final SubLSymbol $sym14$_CSETF_PRF_LINK = makeSymbol("_CSETF-PRF-LINK");
  public static final SubLSymbol $sym15$PRF_SUBPROOFS = makeSymbol("PRF-SUBPROOFS");
  public static final SubLSymbol $sym16$_CSETF_PRF_SUBPROOFS = makeSymbol("_CSETF-PRF-SUBPROOFS");
  public static final SubLSymbol $sym17$PRF_DEPENDENTS = makeSymbol("PRF-DEPENDENTS");
  public static final SubLSymbol $sym18$_CSETF_PRF_DEPENDENTS = makeSymbol("_CSETF-PRF-DEPENDENTS");
  public static final SubLSymbol $kw19$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw20$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw21$LINK = makeKeyword("LINK");
  public static final SubLSymbol $kw22$SUBPROOFS = makeKeyword("SUBPROOFS");
  public static final SubLSymbol $kw23$DEPENDENTS = makeKeyword("DEPENDENTS");
  public static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw25$FREE = makeKeyword("FREE");
  public static final SubLString $str26$_Invalid_PROOF__s_ = makeString("<Invalid PROOF ~s>");
  public static final SubLSymbol $sym27$PROOF_SUID = makeSymbol("PROOF-SUID");
  public static final SubLString $str28$_PROOF__a__a_for_link__a__a_suppo = makeString("<PROOF ~a.~a for link ~a.~a supported by ~a, supporting ~a>");
  public static final SubLSymbol $sym29$SXHASH_PROOF_METHOD = makeSymbol("SXHASH-PROOF-METHOD");
  public static final SubLList $list30 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym31$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym32$PROOF_DIRECT_SUBPROOFS = makeSymbol("PROOF-DIRECT-SUBPROOFS");
  public static final SubLList $list33 = list(list(makeSymbol("SUBPROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list34 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw35$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw36$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym37$ALL_PROOF_SUBPROOFS = makeSymbol("ALL-PROOF-SUBPROOFS");
  public static final SubLList $list38 = list(list(makeSymbol("DEPENDENT-PROOF-VAR"), makeSymbol("PROOF"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list39 = list(makeKeyword("PROOF-STATUS"), makeKeyword("DONE"));
  public static final SubLSymbol $kw40$PROOF_STATUS = makeKeyword("PROOF-STATUS");
  public static final SubLSymbol $sym41$PROOF_PROBLEM = makeUninternedSymbol("PROOF-PROBLEM");
  public static final SubLSymbol $sym42$SUPPORTED_PROBLEM = makeUninternedSymbol("SUPPORTED-PROBLEM");
  public static final SubLSymbol $sym43$DEPENDENT_PROOF = makeUninternedSymbol("DEPENDENT-PROOF");
  public static final SubLSymbol $sym44$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym45$PROOF_SUPPORTED_PROBLEM = makeSymbol("PROOF-SUPPORTED-PROBLEM");
  public static final SubLSymbol $sym46$DO_PROBLEM_SUPPORTED_PROBLEMS = makeSymbol("DO-PROBLEM-SUPPORTED-PROBLEMS");
  public static final SubLSymbol $sym47$DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");
  public static final SubLSymbol $sym48$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym49$MEMBER_EQ_ = makeSymbol("MEMBER-EQ?");
  public static final SubLSymbol $sym50$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym51$PROOF_DEPENDENTS = makeSymbol("PROOF-DEPENDENTS");
  public static final SubLSymbol $sym52$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
  public static final SubLSymbol $sym53$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym54$_PROOF_DATASTRUCTURE_STORES_DEPENDENT_PROOFS__ = makeSymbol("*PROOF-DATASTRUCTURE-STORES-DEPENDENT-PROOFS?*");
  public static final SubLSymbol $sym55$DO_PROOF_DEPENDENT_PROOFS_INT = makeSymbol("DO-PROOF-DEPENDENT-PROOFS-INT");
  public static final SubLSymbol $sym56$DO_PROOF_DEPENDENT_PROOFS_COMPUTED = makeSymbol("DO-PROOF-DEPENDENT-PROOFS-COMPUTED");
  public static final SubLSymbol $sym57$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
  public static final SubLSymbol $sym58$LIST_OF_PROOF_P = makeSymbol("LIST-OF-PROOF-P");
  public static final SubLSymbol $sym59$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
  public static final SubLString $str60$Could_not_remove_dependent__a_fro = makeString("Could not remove dependent ~a from proof ~a");
  public static final SubLString $str61$Expected_link__a_to_have_exactly_ = makeString("Expected link ~a to have exactly one subproof");
  public static final SubLString $str62$Unexpected_link_type_for_proof___ = makeString("Unexpected link type for proof: ~a");
  public static final SubLSymbol $sym63$SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");
  public static final SubLString $str64$Expected__s_to_have_at_most_one_s = makeString("Expected ~s to have at most one subproof, but it had more");
  public static final SubLSymbol $sym65$_ = makeSymbol("<");
  public static final SubLSymbol $sym66$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
  public static final SubLSymbol $kw67$REJECTED = makeKeyword("REJECTED");
  public static final SubLSymbol $kw68$PROVEN = makeKeyword("PROVEN");
  public static final SubLSymbol $sym69$PROOF_REJECT_REASON_P = makeSymbol("PROOF-REJECT-REASON-P");
  public static final SubLSymbol $kw70$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLSymbol $sym71$PROBLEM_P = makeSymbol("PROBLEM-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_proof_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_proof_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_proof_file();
  }

}
