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
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.inference.modules.simplification_modules;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_worker_restriction extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_restriction() {}
  public static final SubLFile me = new inference_worker_restriction();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction";

  //// Definitions

  public static final class $restriction_link_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $bindings; }
    public SubLObject getField3() { return $hl_module; }
    public SubLObject setField2(SubLObject value) { return $bindings = value; }
    public SubLObject setField3(SubLObject value) { return $hl_module = value; }
    public SubLObject $bindings = NIL;
    public SubLObject $hl_module = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($restriction_link_data_native.class, $sym0$RESTRICTION_LINK_DATA, $sym1$RESTRICTION_LINK_DATA_P, $list2, $list3, new String[] {"$bindings", "$hl_module"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static SubLSymbol $dtp_restriction_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static final SubLObject restriction_link_data_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static final SubLObject restriction_link_data_p(SubLObject object) {
    return ((object.getClass() == $restriction_link_data_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $restriction_link_data_p$UnaryFunction extends UnaryFunction {
    public $restriction_link_data_p$UnaryFunction() { super(extractFunctionNamed("RESTRICTION-LINK-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return restriction_link_data_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static final SubLObject restr_link_data_bindings(SubLObject object) {
    checkType(object, $sym1$RESTRICTION_LINK_DATA_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static final SubLObject restr_link_data_hl_module(SubLObject object) {
    checkType(object, $sym1$RESTRICTION_LINK_DATA_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static final SubLObject _csetf_restr_link_data_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym1$RESTRICTION_LINK_DATA_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1246) 
  public static final SubLObject make_restriction_link_data(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $restriction_link_data_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw12$BINDINGS)) {
            _csetf_restr_link_data_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw13$HL_MODULE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35663");
          } else {
            Errors.error($str14$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  public static final class $restriction_listening_link_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $bindings; }
    public SubLObject getField3() { return $hl_module; }
    public SubLObject getField4() { return $listeners; }
    public SubLObject setField2(SubLObject value) { return $bindings = value; }
    public SubLObject setField3(SubLObject value) { return $hl_module = value; }
    public SubLObject setField4(SubLObject value) { return $listeners = value; }
    public SubLObject $bindings = NIL;
    public SubLObject $hl_module = NIL;
    public SubLObject $listeners = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($restriction_listening_link_data_native.class, $sym15$RESTRICTION_LISTENING_LINK_DATA, $sym16$RESTRICTION_LISTENING_LINK_DATA_P, $list17, $list18, new String[] {"$bindings", "$hl_module", "$listeners"}, $list19, $list20, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1676) 
  public static SubLSymbol $dtp_restriction_listening_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 1676) 
  public static final SubLObject restriction_listening_link_data_p(SubLObject object) {
    return ((object.getClass() == $restriction_listening_link_data_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $restriction_listening_link_data_p$UnaryFunction extends UnaryFunction {
    public $restriction_listening_link_data_p$UnaryFunction() { super(extractFunctionNamed("RESTRICTION-LISTENING-LINK-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return restriction_listening_link_data_p(arg1); }
  }

  /** @return restriction-link-p; 
   @param RESTRICTION-BINDINGS binding-list-p; SUPPORTED-PROBLEM's vars -> restriction.
i.e. bindings to substitute into SUPPORTED-PROBLEM to restrict it.  */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 2315) 
  public static final SubLObject new_restriction_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject hl_module) {
    if ((listening_linkP == UNPROVIDED)) {
      listening_linkP = NIL;
    }
    if ((hl_module == UNPROVIDED)) {
      hl_module = NIL;
    }
    checkType(supported_problem, $sym29$PROBLEM_P);
    if ((NIL != supporting_mapped_problem)) {
      checkType(supporting_mapped_problem, $sym30$MAPPED_PROBLEM_P);
    }
    {
      SubLObject link = inference_datastructures_problem_link.new_problem_link($kw31$RESTRICTION, supported_problem);
      if ((NIL != listening_linkP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35678");
      } else {
        new_restriction_link_data(link);
      }
      if ((NIL != hl_module)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35685");
      }
      set_restriction_link_bindings(link, restriction_bindings);
      clear_restriction_link_listeners(link);
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, link);
      inference_datastructures_problem_link.problem_link_open_all(link);
      inference_worker.propagate_problem_link(link);
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 3322) 
  public static final SubLObject new_restriction_link_data(SubLObject restriction_link) {
    {
      SubLObject data = make_restriction_link_data(UNPROVIDED);
      inference_datastructures_problem_link.set_problem_link_data(restriction_link, data);
    }
    return restriction_link;
  }

  /** The first elements of these bindings are in the space of RESTRICTION-LINK's
supported problem, and their second elements are in the space of
RESTRICTION-LINK's unique supporting problem. */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 4405) 
  public static final SubLObject restriction_link_bindings(SubLObject restriction_link) {
    checkType(restriction_link, $sym34$RESTRICTION_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
      if ((NIL != restriction_link_data_p(data))) {
        return restr_link_data_bindings(data);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35679");
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 4907) 
  public static final SubLObject restriction_link_hl_module(SubLObject restriction_link) {
    checkType(restriction_link, $sym34$RESTRICTION_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
      if ((NIL != restriction_link_data_p(data))) {
        return restr_link_data_hl_module(data);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35680");
      }
    }
  }

  /** @param RESTRICTION-BINDINGS; RESTRICTION-LINK's supported problem vars -> restriction */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 5493) 
  public static final SubLObject set_restriction_link_bindings(SubLObject restriction_link, SubLObject v_bindings) {
    checkType(restriction_link, $sym34$RESTRICTION_LINK_P);
    checkType(v_bindings, $sym35$BINDING_LIST_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
      if ((NIL != restriction_link_data_p(data))) {
        _csetf_restr_link_data_bindings(data, v_bindings);
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35668");
      }
    }
    return restriction_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 6402) 
  public static final SubLObject clear_restriction_link_listeners(SubLObject restriction_link) {
    checkType(restriction_link, $sym34$RESTRICTION_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(restriction_link);
      if ((NIL != restriction_listening_link_data_p(data))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35674");
      }
    }
    return restriction_link;
  }

  /** @return booleanp;  Whether OBJECT is a listening restriction link. */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 7388) 
  public static final SubLObject restriction_listening_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && (NIL != restriction_listening_link_data_p(inference_datastructures_problem_link.problem_link_data(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8674) 
  public static final SubLObject restriction_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw31$RESTRICTION == inference_datastructures_problem_link.problem_link_type(object))));
  }

  /** Creates a new restriction link between SUPPORTING-PROBLEM and SUPPORTED-PROBLEM unless there already is one. */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 8837) 
  public static final SubLObject maybe_new_restriction_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject restriction_bindings, SubLObject listening_linkP, SubLObject tactic) {
    if ((listening_linkP == UNPROVIDED)) {
      listening_linkP = NIL;
    }
    if ((tactic == UNPROVIDED)) {
      tactic = NIL;
    }
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
            if (((NIL != restriction_link_p(dependent_link))
                 && (supported_problem == inference_datastructures_problem_link.problem_link_supported_problem(dependent_link))
                 && (NIL != bindings.bindings_equalP(restriction_bindings, restriction_link_bindings(dependent_link))))) {
              return dependent_link;
            }
          }
        }
      }
    }
    {
      SubLObject hl_module = ((NIL != tactic) ? ((SubLObject) inference_datastructures_tactic.tactic_hl_module(tactic)) : NIL);
      return new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
    }
  }

  /** RESTRICTION-LINK connects a restricted-problem with an unrestricted-problem.
This function bubbles up RESTRICTED-PROOF to the unrestricted-problem via RESTRICTION-LINK.
@param RESTRICTED-VARIABLE-MAP; restricted problem's vars -> unrestricted-problem's vars */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 9797) 
  public static final SubLObject bubble_up_proof_to_restriction_link(SubLObject restricted_proof, SubLObject restricted_variable_map, SubLObject restriction_link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject restricted_bindings = inference_datastructures_proof.proof_bindings(restricted_proof);
        SubLObject restriction_bindings = restriction_link_bindings(restriction_link);
        SubLObject unrestricted_bindings = inference_worker.proof_bindings_from_constituents(restriction_bindings, restricted_bindings, restricted_variable_map);
        thread.resetMultipleValues();
        {
          SubLObject unrestricted_proof = new_restriction_proof(restriction_link, restricted_proof, unrestricted_bindings);
          SubLObject newP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          inference_worker_rewrite.trigger_restriction_link_listeners(restriction_link, restricted_proof);
          if ((NIL != newP)) {
            inference_worker.bubble_up_proof(unrestricted_proof);
          } else {
            inference_worker.possibly_note_proof_processed(restricted_proof);
          }
        }
      }
      return NIL;
    }
  }

  /** Called when a new unrestricted proof is needed.
@return 0 proof-p
@return 1 whether the returned proof was newly created
@param RESTRICTION-BINDINGS; RESTRICTION-LINK's supported problem vars -> restriction */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 11178) 
  public static final SubLObject new_restriction_proof(SubLObject restriction_link, SubLObject restricted_proof, SubLObject unrestricted_bindings) {
    {
      SubLObject subproofs = list(restricted_proof);
      return inference_worker.propose_new_proof_with_bindings(restriction_link, inference_worker.canonicalize_proof_bindings(unrestricted_bindings), subproofs);
    }
  }

  /** When T, simplification tactics are executed early (before backchain required transformation tactics) and pass down T motivation. */
  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12071) 
  public static SubLSymbol $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12331) 
  public static final SubLObject simplification_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(tactic))
           && (NIL != simplification_modules.simplification_module_p(inference_datastructures_tactic.tactic_hl_module(tactic)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12651) 
  public static final SubLObject simplification_link_p(SubLObject object) {
    return makeBoolean(((NIL != restriction_link_p(object))
           && (NIL != simplification_modules.simplification_module_p(restriction_link_hl_module(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12810) 
  public static final SubLObject problem_is_a_simplificationP(SubLObject problem) {
    return inference_datastructures_problem.problem_has_dependent_link_of_typeP(problem, $kw46$SIMPLIFICATION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-restriction.lisp", position = 12939) 
  public static final SubLObject problem_has_a_simplificationP(SubLObject problem) {
    return inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, $kw46$SIMPLIFICATION);
  }

  public static final SubLObject declare_inference_worker_restriction_file() {
    declareFunction(myName, "restriction_link_data_print_function_trampoline", "RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "restriction_link_data_p", "RESTRICTION-LINK-DATA-P", 1, 0, false); new $restriction_link_data_p$UnaryFunction();
    declareFunction(myName, "restr_link_data_bindings", "RESTR-LINK-DATA-BINDINGS", 1, 0, false);
    declareFunction(myName, "restr_link_data_hl_module", "RESTR-LINK-DATA-HL-MODULE", 1, 0, false);
    declareFunction(myName, "_csetf_restr_link_data_bindings", "_CSETF-RESTR-LINK-DATA-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_restr_link_data_hl_module", "_CSETF-RESTR-LINK-DATA-HL-MODULE", 2, 0, false);
    declareFunction(myName, "make_restriction_link_data", "MAKE-RESTRICTION-LINK-DATA", 0, 1, false);
    declareFunction(myName, "restriction_listening_link_data_print_function_trampoline", "RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "restriction_listening_link_data_p", "RESTRICTION-LISTENING-LINK-DATA-P", 1, 0, false); new $restriction_listening_link_data_p$UnaryFunction();
    declareFunction(myName, "restr_listen_link_data_bindings", "RESTR-LISTEN-LINK-DATA-BINDINGS", 1, 0, false);
    declareFunction(myName, "restr_listen_link_data_hl_module", "RESTR-LISTEN-LINK-DATA-HL-MODULE", 1, 0, false);
    declareFunction(myName, "restr_listen_link_data_listeners", "RESTR-LISTEN-LINK-DATA-LISTENERS", 1, 0, false);
    declareFunction(myName, "_csetf_restr_listen_link_data_bindings", "_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_restr_listen_link_data_hl_module", "_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_restr_listen_link_data_listeners", "_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS", 2, 0, false);
    declareFunction(myName, "make_restriction_listening_link_data", "MAKE-RESTRICTION-LISTENING-LINK-DATA", 0, 1, false);
    declareFunction(myName, "new_restriction_link", "NEW-RESTRICTION-LINK", 3, 2, false);
    declareFunction(myName, "new_restriction_link_data", "NEW-RESTRICTION-LINK-DATA", 1, 0, false);
    declareFunction(myName, "new_restriction_listening_link_data", "NEW-RESTRICTION-LISTENING-LINK-DATA", 1, 0, false);
    declareFunction(myName, "destroy_restriction_link", "DESTROY-RESTRICTION-LINK", 1, 0, false);
    declareFunction(myName, "restriction_link_bindings", "RESTRICTION-LINK-BINDINGS", 1, 0, false);
    declareFunction(myName, "restriction_link_hl_module", "RESTRICTION-LINK-HL-MODULE", 1, 0, false);
    declareFunction(myName, "restriction_link_listeners", "RESTRICTION-LINK-LISTENERS", 1, 0, false);
    declareFunction(myName, "set_restriction_link_bindings", "SET-RESTRICTION-LINK-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_restriction_link_hl_module", "SET-RESTRICTION-LINK-HL-MODULE", 2, 0, false);
    declareFunction(myName, "clear_restriction_link_listeners", "CLEAR-RESTRICTION-LINK-LISTENERS", 1, 0, false);
    declareFunction(myName, "add_restriction_link_listener", "ADD-RESTRICTION-LINK-LISTENER", 2, 0, false);
    declareMacro(myName, "do_restriction_link_listeners", "DO-RESTRICTION-LINK-LISTENERS");
    declareFunction(myName, "restriction_listening_link_p", "RESTRICTION-LISTENING-LINK-P", 1, 0, false);
    declareFunction(myName, "restriction_link_supporting_mapped_problem", "RESTRICTION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "restriction_link_supporting_variable_map", "RESTRICTION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "restriction_link_tactic", "RESTRICTION-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "restriction_link_p", "RESTRICTION-LINK-P", 1, 0, false);
    declareFunction(myName, "maybe_new_restriction_link", "MAYBE-NEW-RESTRICTION-LINK", 3, 2, false);
    declareFunction(myName, "bubble_up_proof_to_restriction_link", "BUBBLE-UP-PROOF-TO-RESTRICTION-LINK", 3, 0, false);
    declareFunction(myName, "new_restriction_proof", "NEW-RESTRICTION-PROOF", 3, 0, false);
    declareFunction(myName, "restriction_proof_p", "RESTRICTION-PROOF-P", 1, 0, false);
    declareFunction(myName, "problem_has_restriction_linkP", "PROBLEM-HAS-RESTRICTION-LINK?", 1, 0, false);
    declareFunction(myName, "restriction_proof_hl_module", "RESTRICTION-PROOF-HL-MODULE", 1, 0, false);
    declareFunction(myName, "simplification_tactic_p", "SIMPLIFICATION-TACTIC-P", 1, 0, false);
    declareFunction(myName, "simplification_link_p", "SIMPLIFICATION-LINK-P", 1, 0, false);
    declareFunction(myName, "problem_is_a_simplificationP", "PROBLEM-IS-A-SIMPLIFICATION?", 1, 0, false);
    declareFunction(myName, "problem_has_a_simplificationP", "PROBLEM-HAS-A-SIMPLIFICATION?", 1, 0, false);
    declareFunction(myName, "problem_first_simplified_supporting_problem", "PROBLEM-FIRST-SIMPLIFIED-SUPPORTING-PROBLEM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_restriction_file() {
    $dtp_restriction_link_data$ = defconstant("*DTP-RESTRICTION-LINK-DATA*", $sym0$RESTRICTION_LINK_DATA);
    $dtp_restriction_listening_link_data$ = defconstant("*DTP-RESTRICTION-LISTENING-LINK-DATA*", $sym15$RESTRICTION_LISTENING_LINK_DATA);
    $simplification_tactics_execute_early_and_pass_down_transformation_motivationP$ = defparameter("*SIMPLIFICATION-TACTICS-EXECUTE-EARLY-AND-PASS-DOWN-TRANSFORMATION-MOTIVATION?*", T);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_restriction_file() {
    // CVS_ID("Id: inference-worker-restriction.lisp 128830 2009-09-23 21:54:25Z jantos ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_restriction_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$RESTR_LINK_DATA_BINDINGS, $sym9$_CSETF_RESTR_LINK_DATA_BINDINGS);
    Structures.def_csetf($sym10$RESTR_LINK_DATA_HL_MODULE, $sym11$_CSETF_RESTR_LINK_DATA_HL_MODULE);
    Equality.identity($sym0$RESTRICTION_LINK_DATA);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_restriction_listening_link_data$.getGlobalValue(), Symbols.symbol_function($sym21$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym22$RESTR_LISTEN_LINK_DATA_BINDINGS, $sym23$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS);
    Structures.def_csetf($sym24$RESTR_LISTEN_LINK_DATA_HL_MODULE, $sym25$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE);
    Structures.def_csetf($sym26$RESTR_LISTEN_LINK_DATA_LISTENERS, $sym27$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS);
    Equality.identity($sym15$RESTRICTION_LISTENING_LINK_DATA);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$RESTRICTION_LINK_DATA = makeSymbol("RESTRICTION-LINK-DATA");
  public static final SubLSymbol $sym1$RESTRICTION_LINK_DATA_P = makeSymbol("RESTRICTION-LINK-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("BINDINGS"), makeSymbol("HL-MODULE"));
  public static final SubLList $list3 = list(makeKeyword("BINDINGS"), makeKeyword("HL-MODULE"));
  public static final SubLList $list4 = list(makeSymbol("RESTR-LINK-DATA-BINDINGS"), makeSymbol("RESTR-LINK-DATA-HL-MODULE"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-RESTR-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RESTR-LINK-DATA-HL-MODULE"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$RESTRICTION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RESTRICTION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$RESTR_LINK_DATA_BINDINGS = makeSymbol("RESTR-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym9$_CSETF_RESTR_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RESTR-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym10$RESTR_LINK_DATA_HL_MODULE = makeSymbol("RESTR-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym11$_CSETF_RESTR_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RESTR-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $kw12$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw13$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym15$RESTRICTION_LISTENING_LINK_DATA = makeSymbol("RESTRICTION-LISTENING-LINK-DATA");
  public static final SubLSymbol $sym16$RESTRICTION_LISTENING_LINK_DATA_P = makeSymbol("RESTRICTION-LISTENING-LINK-DATA-P");
  public static final SubLList $list17 = list(makeSymbol("BINDINGS"), makeSymbol("HL-MODULE"), makeSymbol("LISTENERS"));
  public static final SubLList $list18 = list(makeKeyword("BINDINGS"), makeKeyword("HL-MODULE"), makeKeyword("LISTENERS"));
  public static final SubLList $list19 = list(makeSymbol("RESTR-LISTEN-LINK-DATA-BINDINGS"), makeSymbol("RESTR-LISTEN-LINK-DATA-HL-MODULE"), makeSymbol("RESTR-LISTEN-LINK-DATA-LISTENERS"));
  public static final SubLList $list20 = list(makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS"));
  public static final SubLSymbol $sym21$RESTRICTION_LISTENING_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RESTRICTION-LISTENING-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym22$RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol("RESTR-LISTEN-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym23$_CSETF_RESTR_LISTEN_LINK_DATA_BINDINGS = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym24$RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol("RESTR-LISTEN-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym25$_CSETF_RESTR_LISTEN_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym26$RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol("RESTR-LISTEN-LINK-DATA-LISTENERS");
  public static final SubLSymbol $sym27$_CSETF_RESTR_LISTEN_LINK_DATA_LISTENERS = makeSymbol("_CSETF-RESTR-LISTEN-LINK-DATA-LISTENERS");
  public static final SubLSymbol $kw28$LISTENERS = makeKeyword("LISTENERS");
  public static final SubLSymbol $sym29$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym30$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
  public static final SubLSymbol $kw31$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $kw32$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw33$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym34$RESTRICTION_LINK_P = makeSymbol("RESTRICTION-LINK-P");
  public static final SubLSymbol $sym35$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
  public static final SubLSymbol $sym36$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $sym37$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLList $list38 = list(list(makeSymbol("LISTENER"), makeSymbol("RESTRICTION-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list39 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw40$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw41$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym42$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym43$RESTRICTION_LINK_LISTENERS = makeSymbol("RESTRICTION-LINK-LISTENERS");
  public static final SubLString $str44$No_tactic_found_for__S = makeString("No tactic found for ~S");
  public static final SubLSymbol $sym45$RESTRICTION_PROOF_P = makeSymbol("RESTRICTION-PROOF-P");
  public static final SubLSymbol $kw46$SIMPLIFICATION = makeKeyword("SIMPLIFICATION");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_restriction_file();
  }

  public void initializeVariables() {
    init_inference_worker_restriction_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_restriction_file();
  }

}
