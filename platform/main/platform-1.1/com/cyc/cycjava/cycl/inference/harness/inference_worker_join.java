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
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;

public  final class inference_worker_join extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_join() {}
  public static final SubLFile me = new inference_worker_join();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join";

  //// Definitions

  public static final class $join_link_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $join_vars; }
    public SubLObject getField3() { return $first_proof_index; }
    public SubLObject getField4() { return $second_proof_index; }
    public SubLObject setField2(SubLObject value) { return $join_vars = value; }
    public SubLObject setField3(SubLObject value) { return $first_proof_index = value; }
    public SubLObject setField4(SubLObject value) { return $second_proof_index = value; }
    public SubLObject $join_vars = NIL;
    public SubLObject $first_proof_index = NIL;
    public SubLObject $second_proof_index = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($join_link_data_native.class, $sym0$JOIN_LINK_DATA, $sym1$JOIN_LINK_DATA_P, $list2, $list3, new String[] {"$join_vars", "$first_proof_index", "$second_proof_index"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static SubLSymbol $dtp_join_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject join_link_data_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $join_link_data_p$UnaryFunction extends UnaryFunction {
    public $join_link_data_p$UnaryFunction() { super(extractFunctionNamed("JOIN-LINK-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36481"); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject j_link_data_join_vars(SubLObject object) {
    checkType(object, $sym1$JOIN_LINK_DATA_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject j_link_data_first_proof_index(SubLObject object) {
    checkType(object, $sym1$JOIN_LINK_DATA_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject j_link_data_second_proof_index(SubLObject object) {
    checkType(object, $sym1$JOIN_LINK_DATA_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject _csetf_j_link_data_join_vars(SubLObject object, SubLObject value) {
    checkType(object, $sym1$JOIN_LINK_DATA_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject _csetf_j_link_data_first_proof_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$JOIN_LINK_DATA_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject _csetf_j_link_data_second_proof_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$JOIN_LINK_DATA_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 1716) 
  public static final SubLObject make_join_link_data(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $join_link_data_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw14$JOIN_VARS)) {
            _csetf_j_link_data_join_vars(v_new, current_value);
          } else if (pcase_var.eql($kw15$FIRST_PROOF_INDEX)) {
            _csetf_j_link_data_first_proof_index(v_new, current_value);
          } else if (pcase_var.eql($kw16$SECOND_PROOF_INDEX)) {
            _csetf_j_link_data_second_proof_index(v_new, current_value);
          } else {
            Errors.error($str17$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 2568) 
  public static final SubLObject new_join_link_data(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
    {
      SubLObject data = make_join_link_data(UNPROVIDED);
      _csetf_j_link_data_join_vars(data, shared_sibling_vars(first_mapped_problem, second_mapped_problem));
      _csetf_j_link_data_first_proof_index(data, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
      _csetf_j_link_data_second_proof_index(data, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
      return data;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 3220) 
  public static final SubLObject join_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw18$JOIN == inference_datastructures_problem_link.problem_link_type(object))));
  }

  /** @return join-link-p, either the already existing one or a new one. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 3395) 
  public static final SubLObject maybe_new_join_link(SubLObject supported_problem, SubLObject first_supporting_mapped_problem, SubLObject second_supporting_mapped_problem) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject candidate_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, candidate_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $kw18$JOIN))) {
              if (((NIL != inference_datastructures_problem_link.mapped_problem_equal(first_supporting_mapped_problem, join_link_first_mapped_problem(candidate_link)))
                   && (NIL != inference_datastructures_problem_link.mapped_problem_equal(second_supporting_mapped_problem, join_link_second_mapped_problem(candidate_link))))) {
                return candidate_link;
              }
            }
          }
        }
      }
    }
    return new_join_link(supported_problem, first_supporting_mapped_problem, second_supporting_mapped_problem);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 4065) 
  public static final SubLObject new_join_link(SubLObject supported_problem, SubLObject first_supporting_mapped_problem, SubLObject second_supporting_mapped_problem) {
    checkType(first_supporting_mapped_problem, $sym19$MAPPED_PROBLEM_P);
    checkType(second_supporting_mapped_problem, $sym19$MAPPED_PROBLEM_P);
    {
      SubLObject link = inference_datastructures_problem_link.new_problem_link($kw18$JOIN, supported_problem);
      SubLObject data = new_join_link_data(first_supporting_mapped_problem, second_supporting_mapped_problem);
      inference_datastructures_problem_link.set_problem_link_data(link, data);
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(second_supporting_mapped_problem, link);
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(first_supporting_mapped_problem, link);
      inference_worker.propagate_problem_link(link);
      return link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6166) 
  public static final SubLObject join_link_join_vars(SubLObject join_link) {
    return j_link_data_join_vars(inference_datastructures_problem_link.problem_link_data(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6292) 
  public static final SubLObject join_link_first_proof_index(SubLObject join_link) {
    return j_link_data_first_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6462) 
  public static final SubLObject join_link_second_proof_index(SubLObject join_link) {
    return j_link_data_second_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6635) 
  public static final SubLObject join_link_first_mapped_problem(SubLObject join_link) {
    return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link).first();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6792) 
  public static final SubLObject join_link_second_mapped_problem(SubLObject join_link) {
    return conses_high.second(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 6925) 
  public static final SubLObject join_link_first_problem(SubLObject join_link) {
    return inference_datastructures_problem_link.mapped_problem_problem(join_link_first_mapped_problem(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7057) 
  public static final SubLObject join_link_second_problem(SubLObject join_link) {
    return inference_datastructures_problem_link.mapped_problem_problem(join_link_second_mapped_problem(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7191) 
  public static final SubLObject join_link_trigger_variable_map(SubLObject join_link, SubLObject trigger_is_firstP) {
    return inference_datastructures_problem_link.mapped_problem_variable_map(join_link_trigger_mapped_problem(join_link, trigger_is_firstP));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7372) 
  public static final SubLObject join_link_trigger_mapped_problem(SubLObject join_link, SubLObject trigger_is_firstP) {
    return ((NIL != trigger_is_firstP) ? ((SubLObject) join_link_first_mapped_problem(join_link)) : join_link_second_mapped_problem(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7582) 
  public static final SubLObject join_link_sibling_mapped_problem(SubLObject join_link, SubLObject trigger_is_firstP) {
    return ((NIL != trigger_is_firstP) ? ((SubLObject) join_link_second_mapped_problem(join_link)) : join_link_first_mapped_problem(join_link));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 7792) 
  public static final SubLObject join_link_first_proofs_lookup(SubLObject join_link, SubLObject proof_bindings) {
    {
      SubLObject index = join_link_first_proof_index(join_link);
      SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
      SubLObject first_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
      return first_proofs;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8094) 
  public static final SubLObject join_link_second_proofs_lookup(SubLObject join_link, SubLObject proof_bindings) {
    {
      SubLObject index = join_link_second_proof_index(join_link);
      SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
      SubLObject second_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
      return second_proofs;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8399) 
  public static final SubLObject join_link_sibling_proofs_lookup(SubLObject join_link, SubLObject trigger_proof_bindings_wrt_supported, SubLObject trigger_is_firstP) {
    return ((NIL != trigger_is_firstP) ? ((SubLObject) join_link_second_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported)) : join_link_first_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 8718) 
  public static final SubLObject join_link_shared_proof_bindings(SubLObject join_link, SubLObject trigger_proof_bindings, SubLObject trigger_is_firstP) {
    {
      SubLObject shared_supported_vars = join_link_join_vars(join_link);
      SubLObject trigger_to_supported_variable_map = join_link_trigger_variable_map(join_link, trigger_is_firstP);
      SubLObject trigger_proof_bindings_wrt_supported = bindings.transfer_variable_map_to_bindings_filtered(trigger_to_supported_variable_map, trigger_proof_bindings);
      SubLObject shared_trigger_proof_bindings_wrt_supported = bindings.filter_bindings_by_variables(trigger_proof_bindings_wrt_supported, shared_supported_vars);
      return shared_trigger_proof_bindings_wrt_supported;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 9599) 
  public static final SubLObject join_link_tactic(SubLObject join_link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_tactic = NIL;
        for (join_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), join_tactic = cdolist_list_var.first()) {
          if ((NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_tactic, $join_module$.getDynamicValue(thread)))) {
            if ((join_link == join_tactic_link(join_tactic))) {
              return join_tactic;
            }
          }
        }
        if ((NIL == inference_datastructures_problem.tactically_unexamined_problem_p(supported_problem))) {
          return Errors.error($str33$couldn_t_find_the_join_tactic_for, join_link);
        }
      }
      return NIL;
    }
  }

  /** Indexes PROOF by BINDINGS as a first proof in JOIN-LINK */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 10019) 
  public static final SubLObject add_join_link_first_proof(SubLObject join_link, SubLObject v_bindings, SubLObject proof) {
    checkType(join_link, $sym34$JOIN_LINK_P);
    checkType(proof, $sym35$PROOF_P);
    {
      SubLObject index = join_link_first_proof_index(join_link);
      SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
      dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
    }
    return join_link;
  }

  /** Indexes PROOF by BINDINGS as a second proof in JOIN-LINK */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 10843) 
  public static final SubLObject add_join_link_second_proof(SubLObject join_link, SubLObject v_bindings, SubLObject proof) {
    checkType(join_link, $sym34$JOIN_LINK_P);
    checkType(proof, $sym35$PROOF_P);
    {
      SubLObject index = join_link_second_proof_index(join_link);
      SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
      dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
    }
    return join_link;
  }

  /** @note TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up
to JOIN-LINK. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 11649) 
  public static final SubLObject add_join_link_proof(SubLObject join_link, SubLObject trigger_proof, SubLObject trigger_is_firstP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == inference_datastructures_proof.proof_provenP(trigger_proof))) {
          Errors.error($str36$_a_was_a_rejected_proof, trigger_proof);
        }
      }
      {
        SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings(join_link, inference_datastructures_proof.proof_bindings(trigger_proof), trigger_is_firstP);
        if ((NIL != trigger_is_firstP)) {
          add_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
          add_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 13225) 
  public static final SubLObject find_or_create_join_link_supporting_mapped_problems(SubLObject store, SubLObject dnf_clause, SubLObject first_supporting_problem_spec) {
    {
      SubLObject first_mapped_problem = inference_worker.find_or_create_problem_from_subclause_spec(store, dnf_clause, first_supporting_problem_spec);
      SubLObject second_mapped_problem = inference_worker.find_or_create_problem_without_subclause_spec(store, dnf_clause, first_supporting_problem_spec);
      return Values.values(first_mapped_problem, second_mapped_problem);
    }
  }

  /** @return listp; the sorted list of variables in FIRST-MAPPED-PROBLEM that also appear
 (modulo variable maps) in SECOND-MAPPED-PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 13678) 
  public static final SubLObject first_problem_shared_vars(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
    {
      SubLObject shared_sibling_vars = shared_sibling_vars(first_mapped_problem, second_mapped_problem);
      return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem), shared_sibling_vars);
    }
  }

  /** @return listp; the sorted list of variables in SECOND-MAPPED-PROBLEM that also appear
 (modulo variable maps) in FIRST-MAPPED-PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 14173) 
  public static final SubLObject second_problem_shared_vars(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
    {
      SubLObject shared_sibling_vars = shared_sibling_vars(first_mapped_problem, second_mapped_problem);
      return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem), shared_sibling_vars);
    }
  }

  /** @return listp; the sorted list of variables in both FIRST-MAPPED-PROBLEM and SECOND-MAPPED-PROBLEM
   in the variable space of their common supported problem.
   Since the values (cdrs) of each variable map are already in the variable space of
   their common supported problem, we just take the intersection of the values of
   those two variable maps. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 14670) 
  public static final SubLObject shared_sibling_vars(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
    {
      SubLObject shared_vars = NIL;
      SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
      SubLObject second_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem);
      SubLObject cdolist_list_var = first_variable_map;
      SubLObject variable_binding = NIL;
      for (variable_binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), variable_binding = cdolist_list_var.first()) {
        {
          SubLObject supported_var = bindings.variable_binding_value(variable_binding);
          if ((NIL != subl_promotions.memberP(supported_var, second_variable_map, Symbols.symbol_function(EQ), Symbols.symbol_function($sym37$VARIABLE_BINDING_VALUE)))) {
            shared_vars = cons(supported_var, shared_vars);
          }
        }
      }
      return variables.sort_hl_variable_list(shared_vars);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15597) 
  private static SubLSymbol $join_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15717) 
  public static final SubLObject join_tactic_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
             && ($join_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(object))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 15855) 
  public static final SubLObject new_join_tactic(SubLObject join_link, SubLObject first_supporting_problem_spec) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        SubLObject data = list(join_link, first_supporting_problem_spec);
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $join_module$.getDynamicValue(thread), data);
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw38$SKIP))) {
          {
            SubLObject idx_1 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_1, $kw38$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_1);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw38$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw38$SKIP;
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
                                inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
            SubLObject idx_2 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_2))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_2);
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
                                inference_tactician.strategy_note_new_tactic(strategy, tactic);
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
        return tactic;
      }
    }
  }

  /** @return nil or problem-link-p; the link created by JOIN-TACTIC
   NIL should only occur if the tactic has been discarded. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16244) 
  public static final SubLObject join_tactic_link(SubLObject join_tactic) {
    return inference_datastructures_tactic.tactic_data(join_tactic).first();
  }

  /** @return subclause-spec-p */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16472) 
  public static final SubLObject join_tactic_first_supporting_problem_spec(SubLObject tactic) {
    return conses_high.second(inference_datastructures_tactic.tactic_data(tactic));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16610) 
  public static final SubLObject join_tactic_first_problem(SubLObject join_tactic) {
    {
      SubLObject link = join_tactic_link(join_tactic);
      if ((NIL != link)) {
        return join_link_first_problem(link);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16805) 
  public static final SubLObject join_tactic_second_problem(SubLObject join_tactic) {
    {
      SubLObject link = join_tactic_link(join_tactic);
      if ((NIL != link)) {
        return join_link_second_problem(link);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 16988) 
  public static final SubLObject join_tactic_lookahead_problems(SubLObject join_tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject first_problem = join_tactic_first_problem(join_tactic);
        SubLObject second_problem = join_tactic_second_problem(join_tactic);
        if ((!(((NIL != first_problem)
               && (NIL != second_problem))))) {
          thread.resetMultipleValues();
          {
            SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems(join_tactic);
            SubLObject second_mapped_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
            second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
          }
        }
        return Values.values(first_problem, second_problem);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 17611) 
  public static final SubLObject determine_new_join_tactics(SubLObject supported_problem, SubLObject dnf_clause) {
    if ((NIL != clause_utilities.binary_clause_p(dnf_clause))) {
      if ((NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause))) {
        {
          SubLObject doneP = NIL;
          {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
              {
                SubLObject sense = $kw39$NEG;
                if ((NIL == doneP)) {
                  {
                    SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                    possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                  }
                  doneP = T;
                }
              }
              index = Numbers.add(index, ONE_INTEGER);
            }
          }
          {
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
              {
                SubLObject sense = $kw40$POS;
                if ((NIL == doneP)) {
                  {
                    SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                    possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                  }
                  doneP = T;
                }
              }
              index = Numbers.add(index, ONE_INTEGER);
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Possibly create a new :JOIN tactic for PROBLEM in which FIRST-SUPPORTING-PROBLEM-SPEC 
   specifies the literals of DNF-CLAUSE which should be the first supporting problem 
   and the remaining literals should be the second supporting problem. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 18696) 
  public static final SubLObject possibly_determine_new_join_tactic(SubLObject supported_problem, SubLObject first_supporting_problem_spec, SubLObject dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(first_supporting_problem_spec, $sym41$SUBCLAUSE_SPEC_P);
      {
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        thread.resetMultipleValues();
        {
          SubLObject first_mapped_problem = find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec);
          SubLObject second_mapped_problem = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject join_link = maybe_new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
            return new_join_tactic(join_link, first_supporting_problem_spec);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 19524) 
  public static final SubLObject compute_strategic_properties_of_join_tactic(SubLObject tactic, SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(tactic, $sym42$JOIN_TACTIC_P);
      checkType(strategy, $sym43$STRATEGY_P);
      {
        SubLObject join_link = join_tactic_link(tactic);
        SubLObject first_mapped_problem = join_link_first_mapped_problem(join_link);
        SubLObject second_mapped_problem = join_link_second_mapped_problem(join_link);
        if ((NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic)))) {
          thread.resetMultipleValues();
          {
            SubLObject preference_level = compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, $kw44$TACTICAL);
            SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
          }
        }
        thread.resetMultipleValues();
        {
          SubLObject preference_level = compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, strategy);
          SubLObject justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
        }
        {
          SubLObject productivity = compute_join_tactic_productivity(first_mapped_problem, second_mapped_problem, strategy);
          inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        }
        return tactic;
      }
    }
  }

  /** @hack; a scaling factor by which to reduce the estimated productivities of join tactics.
This should really be done by adding an additional cost factor to consider instead of
lumping it into productivity. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 20657) 
  private static SubLSymbol $join_productivity_scaling_factor$ = null;

  /** The productivity of a :join tactic is the sum of the productivities of its subproblems. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 20927) 
  public static final SubLObject compute_join_tactic_productivity(SubLObject first_mapped_problem, SubLObject second_mapped_problem, SubLObject strategy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(first_mapped_problem, $sym19$MAPPED_PROBLEM_P);
      checkType(second_mapped_problem, $sym19$MAPPED_PROBLEM_P);
      checkType(strategy, $sym43$STRATEGY_P);
      {
        SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy);
        SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy);
        SubLObject raw_join_productivity = inference_datastructures_enumerated_types.productivity_max(first_productivity, second_productivity);
        SubLObject join_productivity = inference_datastructures_enumerated_types.productivity_divide_number(raw_join_productivity, $join_productivity_scaling_factor$.getDynamicValue(thread));
        return join_productivity;
      }
    }
  }

  /** The preference level of a :join tactic is the min of the preference levels of its subproblems. */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 21829) 
  public static final SubLObject compute_join_tactic_preference_level(SubLObject first_mapped_problem, SubLObject second_mapped_problem, SubLObject strategic_context) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(first_mapped_problem, $sym19$MAPPED_PROBLEM_P);
      checkType(second_mapped_problem, $sym19$MAPPED_PROBLEM_P);
      checkType(strategic_context, $sym45$STRATEGIC_CONTEXT_P);
      {
        SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        SubLObject first_problem_shared_vars = first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        SubLObject second_problem_shared_vars = second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        thread.resetMultipleValues();
        {
          SubLObject first_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars);
          SubLObject first_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          thread.resetMultipleValues();
          {
            SubLObject second_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars);
            SubLObject second_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != preference_modules.preference_level_L(first_preference_level, second_preference_level))) {
              {
                SubLObject justification = Sequences.cconcatenate($str46$first_problem__, first_justification);
                return Values.values(first_preference_level, justification);
              }
            } else {
              {
                SubLObject justification = Sequences.cconcatenate($str47$second_problem__, second_justification);
                return Values.values(second_preference_level, justification);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 23298) 
  public static final SubLObject execute_join_tactic(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems(tactic);
        SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject join_link = join_tactic_link(tactic);
          inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, first_mapped_problem);
          inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, second_mapped_problem);
        }
      }
      if ((NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $kw44$TACTICAL))) {
        inference_worker.discard_all_other_possible_structural_conjunctive_tactics(tactic);
      }
      inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 24241) 
  public static final SubLObject find_or_create_join_tactic_supporting_mapped_problems(SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == list_utilities.singletonP(query))) {
            Errors.error($str48$Join_tactics_like__a_must_only_ap, tactic, query);
          }
        }
        {
          SubLObject store = inference_datastructures_problem.problem_store(problem);
          SubLObject dnf_clause = query.first();
          SubLObject first_supporting_problem_spec = join_tactic_first_supporting_problem_spec(tactic);
          return find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec);
        }
      }
    }
  }

  /** @return 0 proof-p
@return 1 whether the returned proof was newly created */
  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 24834) 
  public static final SubLObject new_join_proof(SubLObject join_link, SubLObject subproofs_with_sub_bindings) {
    return inference_worker_join_ordered.new_conjunctive_proof(join_link, subproofs_with_sub_bindings);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 25114) 
  public static final SubLObject join_proof_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_proof.proof_p(object))
           && ($kw18$JOIN == inference_datastructures_proof.proof_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 25239) 
  public static final SubLObject bubble_up_proof_to_join_link(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_link) {
    {
      SubLObject trigger_is_firstP = mapped_proof_is_firstP(trigger_subproof, variable_map, join_link);
      add_join_link_proof(join_link, trigger_subproof, trigger_is_firstP);
      bubble_up_proof_to_join_link_int(trigger_subproof, variable_map, join_link, trigger_is_firstP);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 25626) 
  public static final SubLObject mapped_proof_is_firstP(SubLObject subproof, SubLObject proof_variable_map, SubLObject join_link) {
    {
      SubLObject first_mapped_problem = join_link_first_mapped_problem(join_link);
      SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
      SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
      if ((first_problem == subproof_supported_problem)) {
        {
          SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
          if ((NIL != bindings.bindings_equalP(first_variable_map, proof_variable_map))) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-join.lisp", position = 26166) 
  public static final SubLObject bubble_up_proof_to_join_link_int(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_link, SubLObject trigger_is_firstP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject proofs = NIL;
        SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
        SubLObject join_bindings = join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        SubLObject sibling_proofs = join_link_sibling_proofs_lookup(join_link, join_bindings, trigger_is_firstP);
        if ((NIL != sibling_proofs)) {
          {
            SubLObject sibling_mapped_problem = join_link_sibling_mapped_problem(join_link, trigger_is_firstP);
            SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
            SubLObject sibling_proofs_with_bindings = NIL;
            {
              SubLObject cdolist_list_var = sibling_proofs;
              SubLObject sibling_proof = NIL;
              for (sibling_proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_proof = cdolist_list_var.first()) {
                {
                  SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                  sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                }
              }
            }
            sibling_proofs_with_bindings = Sequences.nreverse(sibling_proofs_with_bindings);
            {
              SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
              SubLObject supporting_mapped_proof_lists_by_supporting_problem = ((NIL != trigger_is_firstP) ? ((SubLObject) list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings)) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings))));
              SubLObject mapped_subproof_lists = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              SubLObject cdolist_list_var = mapped_subproof_lists;
              SubLObject mapped_subproof_list = NIL;
              for (mapped_subproof_list = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mapped_subproof_list = cdolist_list_var.first()) {
                thread.resetMultipleValues();
                {
                  SubLObject proof = new_join_proof(join_link, mapped_subproof_list);
                  SubLObject newP = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if ((NIL != newP)) {
                    proofs = cons(proof, proofs);
                  } else {
                    inference_worker.possibly_note_proof_processed(trigger_subproof);
                  }
                }
              }
            }
          }
          proofs = Sequences.nreverse(proofs);
          {
            SubLObject cdolist_list_var = proofs;
            SubLObject proof = NIL;
            for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
              inference_worker.bubble_up_proof(proof);
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_inference_worker_join_file() {
    declareFunction(myName, "join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false); new $join_link_data_p$UnaryFunction();
    declareFunction(myName, "j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false);
    declareFunction(myName, "j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false);
    declareFunction(myName, "j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false);
    declareFunction(myName, "_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false);
    declareFunction(myName, "_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false);
    declareFunction(myName, "make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false);
    declareFunction(myName, "valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false);
    declareFunction(myName, "new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false);
    declareFunction(myName, "join_link_p", "JOIN-LINK-P", 1, 0, false);
    declareFunction(myName, "maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false);
    declareFunction(myName, "new_join_link", "NEW-JOIN-LINK", 3, 0, false);
    declareFunction(myName, "destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false);
    declareMacro(myName, "do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS");
    declareMacro(myName, "do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS");
    declareFunction(myName, "join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false);
    declareFunction(myName, "join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false);
    declareFunction(myName, "join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false);
    declareFunction(myName, "join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false);
    declareFunction(myName, "join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false);
    declareFunction(myName, "join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false);
    declareFunction(myName, "join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false);
    declareFunction(myName, "join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false);
    declareFunction(myName, "join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
    declareFunction(myName, "join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
    declareFunction(myName, "join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false);
    declareFunction(myName, "remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false);
    declareFunction(myName, "add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false);
    declareFunction(myName, "remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false);
    declareFunction(myName, "add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false);
    declareFunction(myName, "remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false);
    declareFunction(myName, "remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false);
    declareFunction(myName, "find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 3, 0, false);
    declareFunction(myName, "first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false);
    declareFunction(myName, "second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false);
    declareFunction(myName, "shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false);
    declareFunction(myName, "join_tactic_p", "JOIN-TACTIC-P", 1, 0, false);
    declareFunction(myName, "new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false);
    declareFunction(myName, "join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false);
    declareFunction(myName, "join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
    declareFunction(myName, "join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false);
    declareFunction(myName, "join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false);
    declareFunction(myName, "join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false);
    declareFunction(myName, "determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false);
    declareFunction(myName, "possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false);
    declareFunction(myName, "compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false);
    declareFunction(myName, "compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false);
    declareFunction(myName, "find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "new_join_proof", "NEW-JOIN-PROOF", 2, 0, false);
    declareFunction(myName, "join_proof_p", "JOIN-PROOF-P", 1, 0, false);
    declareFunction(myName, "bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false);
    declareFunction(myName, "mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false);
    declareFunction(myName, "bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_join_file() {
    $dtp_join_link_data$ = defconstant("*DTP-JOIN-LINK-DATA*", $sym0$JOIN_LINK_DATA);
    $join_module$ = defparameter("*JOIN-MODULE*", inference_modules.inference_structural_module($kw18$JOIN, UNPROVIDED));
    $join_productivity_scaling_factor$ = defparameter("*JOIN-PRODUCTIVITY-SCALING-FACTOR*", EIGHT_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_join_file() {
    // CVS_ID("Id: inference-worker-join.lisp 128648 2009-08-27 17:23:55Z pace ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_join_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$J_LINK_DATA_JOIN_VARS, $sym9$_CSETF_J_LINK_DATA_JOIN_VARS);
    Structures.def_csetf($sym10$J_LINK_DATA_FIRST_PROOF_INDEX, $sym11$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX);
    Structures.def_csetf($sym12$J_LINK_DATA_SECOND_PROOF_INDEX, $sym13$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX);
    Equality.identity($sym0$JOIN_LINK_DATA);
    access_macros.register_macro_helper($sym25$JOIN_LINK_FIRST_PROOF_INDEX, $sym31$DO_JOIN_LINK_FIRST_PROOFS);
    access_macros.register_macro_helper($sym30$JOIN_LINK_SECOND_PROOF_INDEX, $sym32$DO_JOIN_LINK_SECOND_PROOFS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$JOIN_LINK_DATA = makeSymbol("JOIN-LINK-DATA");
  public static final SubLSymbol $sym1$JOIN_LINK_DATA_P = makeSymbol("JOIN-LINK-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("JOIN-VARS"), makeSymbol("FIRST-PROOF-INDEX"), makeSymbol("SECOND-PROOF-INDEX"));
  public static final SubLList $list3 = list(makeKeyword("JOIN-VARS"), makeKeyword("FIRST-PROOF-INDEX"), makeKeyword("SECOND-PROOF-INDEX"));
  public static final SubLList $list4 = list(makeSymbol("J-LINK-DATA-JOIN-VARS"), makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS"), makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$J_LINK_DATA_JOIN_VARS = makeSymbol("J-LINK-DATA-JOIN-VARS");
  public static final SubLSymbol $sym9$_CSETF_J_LINK_DATA_JOIN_VARS = makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS");
  public static final SubLSymbol $sym10$J_LINK_DATA_FIRST_PROOF_INDEX = makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX");
  public static final SubLSymbol $sym11$_CSETF_J_LINK_DATA_FIRST_PROOF_INDEX = makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX");
  public static final SubLSymbol $sym12$J_LINK_DATA_SECOND_PROOF_INDEX = makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX");
  public static final SubLSymbol $sym13$_CSETF_J_LINK_DATA_SECOND_PROOF_INDEX = makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX");
  public static final SubLSymbol $kw14$JOIN_VARS = makeKeyword("JOIN-VARS");
  public static final SubLSymbol $kw15$FIRST_PROOF_INDEX = makeKeyword("FIRST-PROOF-INDEX");
  public static final SubLSymbol $kw16$SECOND_PROOF_INDEX = makeKeyword("SECOND-PROOF-INDEX");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw18$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $sym19$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
  public static final SubLSymbol $kw20$FREE = makeKeyword("FREE");
  public static final SubLList $list21 = list(list(makeSymbol("BINDINGS-VAR"), makeSymbol("PROOF-VAR"), makeSymbol("JOIN-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym22$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym23$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");
  public static final SubLSymbol $sym24$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym25$JOIN_LINK_FIRST_PROOF_INDEX = makeSymbol("JOIN-LINK-FIRST-PROOF-INDEX");
  public static final SubLSymbol $sym26$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym27$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym28$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym29$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");
  public static final SubLSymbol $sym30$JOIN_LINK_SECOND_PROOF_INDEX = makeSymbol("JOIN-LINK-SECOND-PROOF-INDEX");
  public static final SubLSymbol $sym31$DO_JOIN_LINK_FIRST_PROOFS = makeSymbol("DO-JOIN-LINK-FIRST-PROOFS");
  public static final SubLSymbol $sym32$DO_JOIN_LINK_SECOND_PROOFS = makeSymbol("DO-JOIN-LINK-SECOND-PROOFS");
  public static final SubLString $str33$couldn_t_find_the_join_tactic_for = makeString("couldn't find the join tactic for ~s");
  public static final SubLSymbol $sym34$JOIN_LINK_P = makeSymbol("JOIN-LINK-P");
  public static final SubLSymbol $sym35$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLString $str36$_a_was_a_rejected_proof = makeString("~a was a rejected proof");
  public static final SubLSymbol $sym37$VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");
  public static final SubLSymbol $kw38$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw39$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw40$POS = makeKeyword("POS");
  public static final SubLSymbol $sym41$SUBCLAUSE_SPEC_P = makeSymbol("SUBCLAUSE-SPEC-P");
  public static final SubLSymbol $sym42$JOIN_TACTIC_P = makeSymbol("JOIN-TACTIC-P");
  public static final SubLSymbol $sym43$STRATEGY_P = makeSymbol("STRATEGY-P");
  public static final SubLSymbol $kw44$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $sym45$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
  public static final SubLString $str46$first_problem__ = makeString("first problem: ");
  public static final SubLString $str47$second_problem__ = makeString("second problem: ");
  public static final SubLString $str48$Join_tactics_like__a_must_only_ap = makeString("Join tactics like ~a must only apply to singleton problem queries, but ~s was not a singleton");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_join_file();
  }

  public void initializeVariables() {
    init_inference_worker_join_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_join_file();
  }

}
