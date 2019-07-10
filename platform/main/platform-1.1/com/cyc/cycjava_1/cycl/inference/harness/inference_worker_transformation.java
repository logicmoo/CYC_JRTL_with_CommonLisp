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

import java.util.*;
import java.util.Map.*;

import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.modules.*;
//dm import com.cyc.cycjava_1.cycl.inference.harness.abnormal;
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.*;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.gt_methods;
import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.inference_completeness_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.inference.leviathan;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.inference.modules.transformation_modules;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public  final class inference_worker_transformation extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_transformation() {}
  public static final SubLFile me = new inference_worker_transformation();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation";

  //// Definitions

  public static final class $transformation_link_data_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $hl_module; }
    @Override
    public SubLObject getField3() { return $bindings; }
    @Override
    public SubLObject getField4() { return $supports; }
    @Override
    public SubLObject getField5() { return $non_explanatory_subquery; }
    @Override
    public SubLObject setField2(SubLObject value) { return $hl_module = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $bindings = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $supports = value; }
    @Override
    public SubLObject setField5(SubLObject value) { return $non_explanatory_subquery = value; }
    public SubLObject $hl_module = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $supports = NIL;
    public SubLObject $non_explanatory_subquery = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($transformation_link_data_native.class, $sym0$TRANSFORMATION_LINK_DATA, $sym1$TRANSFORMATION_LINK_DATA_P, $list2, $list3, new String[] {"$hl_module", "$bindings", "$supports", "$non_explanatory_subquery"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static SubLSymbol $dtp_transformation_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject transformation_link_data_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $transformation_link_data_p$UnaryFunction extends UnaryFunction {
    public $transformation_link_data_p$UnaryFunction() { super(extractFunctionNamed("TRANSFORMATION-LINK-DATA-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36436"); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject trans_link_data_hl_module(SubLObject object) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject trans_link_data_bindings(SubLObject object) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject trans_link_data_supports(SubLObject object) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject _csetf_trans_link_data_hl_module(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject _csetf_trans_link_data_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject _csetf_trans_link_data_supports(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject _csetf_trans_link_data_non_explanatory_subquery(SubLObject object, SubLObject value) {
    checkType(object, $sym1$TRANSFORMATION_LINK_DATA_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 1232)
  public static final SubLObject make_transformation_link_data(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $transformation_link_data_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw16$HL_MODULE)) {
            _csetf_trans_link_data_hl_module(v_new, current_value);
          } else if (pcase_var.eql($kw17$BINDINGS)) {
            _csetf_trans_link_data_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw18$SUPPORTS)) {
            _csetf_trans_link_data_supports(v_new, current_value);
          } else if (pcase_var.eql($kw19$NON_EXPLANATORY_SUBQUERY)) {
            _csetf_trans_link_data_non_explanatory_subquery(v_new, current_value);
          } else {
            Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** @return transformation-link-p */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 2410)
  public static final SubLObject new_transformation_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject hl_module, SubLObject transformation_bindings, SubLObject rule_assertion, SubLObject more_supports, SubLObject non_explanatory_subquery) {
    checkType(supported_problem, $sym21$PROBLEM_P);
    if ((NIL != supporting_mapped_problem)) {
      checkType(supporting_mapped_problem, $sym22$MAPPED_PROBLEM_P);
    }
    {
      SubLObject supports = cons(rule_assertion, more_supports);
      SubLObject transformation_link = new_transformation_link_int(supported_problem, hl_module, transformation_bindings, supports, non_explanatory_subquery);
      if ((NIL != supporting_mapped_problem)) {
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, transformation_link);
      }
      inference_datastructures_problem_link.problem_link_open_all(transformation_link);
      inference_worker.propagate_problem_link(transformation_link);
      return transformation_link;
    }
  }

  /** Returns a new :transformation link
with its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,
with a supported problem of PROBLEM, and no supporting problems yet. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 3222)
  public static final SubLObject new_transformation_link_int(SubLObject problem, SubLObject hl_module, SubLObject transformation_bindings, SubLObject supports, SubLObject non_explanatory_subquery) {
    {
      SubLObject transformation_link = inference_datastructures_problem_link.new_problem_link($kw23$TRANSFORMATION, problem);
      new_transformation_link_data(transformation_link);
      set_transformation_link_hl_module(transformation_link, hl_module);
      set_transformation_link_bindings(transformation_link, transformation_bindings);
      set_transformation_link_supports(transformation_link, supports);
      set_transformation_link_non_explanatory_subquery(transformation_link, non_explanatory_subquery);
      if ((NIL != non_explanatory_subquery)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35020");
      }
      return transformation_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4128)
  public static final SubLObject new_transformation_link_data(SubLObject transformation_link) {
    {
      SubLObject data = make_transformation_link_data(UNPROVIDED);
      inference_datastructures_problem_link.set_problem_link_data(transformation_link, data);
    }
    return transformation_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 4845)
  public static final SubLObject transformation_link_hl_module(SubLObject transformation_link) {
    checkType(transformation_link, $sym25$TRANSFORMATION_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      return trans_link_data_hl_module(data);
    }
  }

  /** The first elements of these bindings are in the space of TRANSFORMATION-LINK's
supported problem, and their second elements are in the space of
TRANSFORMATION-LINK's unique supporting problem. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5087)
  public static final SubLObject transformation_link_bindings(SubLObject transformation_link) {
    checkType(transformation_link, $sym25$TRANSFORMATION_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      return trans_link_data_bindings(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5512)
  public static final SubLObject transformation_link_supports(SubLObject transformation_link) {
    checkType(transformation_link, $sym25$TRANSFORMATION_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      return trans_link_data_supports(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 5740)
  public static final SubLObject transformation_link_rule_assertion(SubLObject transformation_link) {
    return transformation_link_supports(transformation_link).first();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6286)
  public static final SubLObject set_transformation_link_hl_module(SubLObject transformation_link, SubLObject hl_module) {
    checkType(hl_module, $sym26$HL_MODULE_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      _csetf_trans_link_data_hl_module(data, hl_module);
    }
    return transformation_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6618)
  public static final SubLObject set_transformation_link_bindings(SubLObject transformation_link, SubLObject v_bindings) {
    checkType(v_bindings, $sym27$BINDING_LIST_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      _csetf_trans_link_data_bindings(data, v_bindings);
    }
    return transformation_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 6936)
  public static final SubLObject set_transformation_link_supports(SubLObject transformation_link, SubLObject supports) {
    checkType(supports, $sym28$HL_JUSTIFICATION_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      _csetf_trans_link_data_supports(data, supports);
    }
    return transformation_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 7258)
  public static final SubLObject set_transformation_link_non_explanatory_subquery(SubLObject transformation_link, SubLObject subquery) {
    checkType(subquery, $sym29$NON_EXPLANATORY_SUBQUERY_SPEC_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(transformation_link);
      _csetf_trans_link_data_non_explanatory_subquery(data, subquery);
    }
    return transformation_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 7625)
  public static final SubLObject transformation_link_tactic(SubLObject transformation_link) {
    checkType(transformation_link, $sym25$TRANSFORMATION_LINK_P);
    {
      SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
      SubLObject hl_module = transformation_link_hl_module(transformation_link);
      SubLObject rule = transformation_link_rule_assertion(transformation_link);
      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
      SubLObject candidate_tactic = NIL;
      for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $kw23$TRANSFORMATION))) {
          if (((hl_module == inference_datastructures_tactic.tactic_hl_module(candidate_tactic))
               && (rule == transformation_tactic_rule(candidate_tactic)))) {
            return candidate_tactic;
          }
        }
      }
      if ((NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem))) {
        return Errors.error($str30$No_tactic_found_for__S, transformation_link);
      }
    }
    return NIL;
  }

  /** @return nil or mapped-problem-p */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9127)
  public static final SubLObject transformation_link_supporting_mapped_problem(SubLObject transformation_link) {
    return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(transformation_link);
  }

  /** @return nil or problem-p */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9326)
  public static final SubLObject transformation_link_supporting_problem(SubLObject transformation_link) {
    {
      SubLObject supporting_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
      if ((NIL != supporting_mapped_problem)) {
        return inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
      } else {
        return NIL;
      }
    }
  }

  /** @return variable-map-p */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9650)
  public static final SubLObject transformation_link_supporting_variable_map(SubLObject transformation_link) {
    {
      SubLObject supporting_mapped_problem = transformation_link_supporting_mapped_problem(transformation_link);
      if ((NIL != supporting_mapped_problem)) {
        return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 9982)
  public static final SubLObject transformation_link_transformation_mt(SubLObject transformation_link) {
    {
      SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
      return inference_datastructures_problem.single_literal_problem_mt(problem);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 12855)
  public static final SubLObject meta_transformation_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
           && (NIL != inference_modules.meta_transformation_module_p(inference_datastructures_tactic.tactic_hl_module(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13048)
  private static SubLSymbol $determine_new_transformation_tactics_module$ = null;

  /** First we add a tactic which, if executed, determines the rest of the transformation tactics for PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13200)
  public static final SubLObject add_tactic_to_determine_new_literal_transformation_tactics(SubLObject problem, SubLObject asent, SubLObject sense, SubLObject mt) {
    if ((NIL == inference_backchain_forbidden_asentP(asent, mt))) {
      new_meta_transformation_tactic(problem, asent, sense);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13554)
  public static final SubLObject inference_backchain_forbidden_asentP(SubLObject asent, SubLObject mt) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if (((NIL != forts.fort_p(predicate))
           && (NIL != inference_trampolines.inference_backchain_forbiddenP(predicate, mt)))) {
        return T;
      } else if ((NIL != inference_completeness_utilities.inference_complete_asentP(asent, mt))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 13861)
  public static final SubLObject new_meta_transformation_tactic(SubLObject problem, SubLObject asent, SubLObject sense) {
    {
      SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $determine_new_transformation_tactics_module$.getGlobalValue(), UNPROVIDED);
      SubLObject productivity = ZERO_INTEGER;
      inference_datastructures_tactic.set_tactic_completeness(tactic, $kw42$GROSSLY_INCOMPLETE);
      inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw43$SKIP))) {
          {
            SubLObject idx_1 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_1, $kw43$SKIP))) {
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
                           && (NIL != id_index.id_index_skip_tombstones_p($kw43$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw43$SKIP;
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
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14507)
  public static final SubLObject transformation_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw23$TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14673)
  public static final SubLObject transformation_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(tactic))
           && ($kw23$TRANSFORMATION == inference_datastructures_tactic.tactic_type(tactic))));
  }

  public static final class $transformation_tactic_p$UnaryFunction extends UnaryFunction {
    public $transformation_tactic_p$UnaryFunction() { super(extractFunctionNamed("TRANSFORMATION-TACTIC-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return transformation_tactic_p(arg1); }
  }

  /** @return rule-assertion?; the rule assertion associated with TACTIC
temporarily sometimes returns NIL while transformation modules are in transition. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 14804)
  public static final SubLObject transformation_tactic_rule(SubLObject transformation_tactic) {
    return inference_datastructures_tactic.tactic_data(transformation_tactic);
  }

  /** @return booleanp; whether OBJECT is a transformation tactic that generates other
transformation tactics. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15223)
  public static final SubLObject transformation_generator_tactic_p(SubLObject object) {
    if ((NIL != transformation_tactic_p(object))) {
      return Types.sublisp_null(transformation_tactic_rule(object));
    }
    return NIL;
  }

  /** Return the next rule that TRANSFORMATION-GENERATOR-TACTIC would generate, if any. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 15488)
  public static final SubLObject transformation_generator_tactic_lookahead_rule(SubLObject transformation_generator_tactic) {
    checkType(transformation_generator_tactic, $sym44$TRANSFORMATION_GENERATOR_TACTIC_P);
    {
      SubLObject iterator = inference_datastructures_tactic.tactic_progress_iterator(transformation_generator_tactic);
      if ((NIL != iteration.iterator_p(iterator))) {
        {
          SubLObject state = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22963");
          if (state.isList()) {
            {
              SubLObject rules = state.first();
              if (rules.isList()) {
                {
                  SubLObject rule = rules.first();
                  if ((NIL != assertion_handles.assertion_p(rule))) {
                    return rule;
                  }
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Return the rule to use for lookahead heuristic analysis of TRANSFORMATION-TACTIC. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16088)
  public static final SubLObject transformation_tactic_lookahead_rule(SubLObject transformation_tactic) {
    {
      SubLObject rule = transformation_tactic_rule(transformation_tactic);
      if ((NIL == rule)) {
        rule = transformation_generator_tactic_lookahead_rule(transformation_tactic);
      }
      return rule;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16445)
  public static final SubLObject transformation_proof_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_proof.proof_p(object))
           && (NIL != transformation_link_p(inference_datastructures_proof.proof_link(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16576)
  public static final SubLObject transformation_proof_rule_assertion(SubLObject proof) {
    checkType(proof, $sym45$TRANSFORMATION_PROOF_P);
    return inference_datastructures_proof.proof_supports(proof).first();
  }

  /** @return nil or proof-p */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 16868)
  public static final SubLObject transformation_proof_subproof(SubLObject proof) {
    checkType(proof, $sym45$TRANSFORMATION_PROOF_P);
    return inference_datastructures_proof.proof_first_subproof(proof);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17034)
  public static final SubLObject generalized_transformation_link_p(SubLObject object) {
    return makeBoolean(((NIL != transformation_link_p(object))
          || (NIL != inference_worker_residual_transformation.residual_transformation_link_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17215)
  public static final SubLObject generalized_transformation_link_rule_assertion(SubLObject link) {
    if ((NIL != transformation_link_p(link))) {
      return transformation_link_rule_assertion(link);
    } else if ((NIL != inference_worker_residual_transformation.residual_transformation_link_p(link))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35091");
    } else {
      return Errors.error($str46$generalized_transformation_link_o, link);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17573)
  public static final SubLObject generalized_transformation_link_unaffected_by_exceptionsP(SubLObject link) {
    return makeBoolean((NIL == abnormal.rule_has_exceptionsP(generalized_transformation_link_rule_assertion(link))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17750)
  public static final SubLObject generalized_transformation_proof_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_proof.proof_p(object))
           && (NIL != generalized_transformation_link_p(inference_datastructures_proof.proof_link(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 17906)
  public static final SubLObject generalized_transformation_proof_rule_assertion(SubLObject proof) {
    if ((NIL != transformation_proof_p(proof))) {
      return transformation_proof_rule_assertion(proof);
    } else if ((NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35104");
    } else {
      return Errors.error($str47$generalized_transformation_proof_, proof);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 19335)
  public static final SubLObject determine_rules_for_literal_transformation_tactics(SubLObject problem, SubLObject asent, SubLObject hl_module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject candidate_rules = NIL;
        thread.resetMultipleValues();
        {
          SubLObject inference = problem_inference_and_non_continuable_problem_store_private(problem);
          SubLObject non_continuable_private_problem_storeP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if (((NIL != non_continuable_private_problem_storeP)
               && (NIL == inference_datastructures_inference.inference_allows_use_of_all_rulesP(inference)))) {
            {
              SubLObject rules = NIL;
              SubLObject set_contents_var = set.do_set_internal(inference_datastructures_inference.inference_allowed_rules(inference));
              SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
              SubLObject state = NIL;
              for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                {
                  SubLObject rule = set_contents.do_set_contents_next(basis_object, state);
                  if ((NIL != set_contents.do_set_contents_element_validP(state, rule))) {
                    rules = cons(rule, rules);
                  }
                }
              }
              candidate_rules = transformation_modules.sort_rules_via_current_inference_rule_preference(rules);
            }
          } else {
            {
              SubLObject rule_select_method = inference_modules.hl_module_rule_select_func(hl_module);
              if (rule_select_method.isFunctionSpec()) {
                candidate_rules = Functions.funcall(rule_select_method, asent);
              }
            }
          }
          {
            SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func(hl_module);
            SubLObject rules = NIL;
            if ((!(rule_filter_method.isFunctionSpec()))) {
              rules = conses_high.copy_list(candidate_rules);
            } else {
              {
                SubLObject cdolist_list_var = candidate_rules;
                SubLObject rule = NIL;
                for (rule = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
                  if ((NIL != Functions.funcall(rule_filter_method, asent, rule))) {
                    rules = cons(rule, rules);
                  }
                }
              }
              rules = Sequences.nreverse(rules);
            }
            rules = Sequences.delete_if(Symbols.symbol_function($sym49$INFERENCE_EXCEPTED_ASSERTION_), rules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != genl_rules_enabledP())) {
              rules = max_rules(rules, UNPROVIDED);
            }
            return rules;
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21109)
  public static final SubLObject inference_excepted_assertionP(SubLObject assertion) {
    return memoized_inference_excepted_assertionP(assertion, mt_relevance_macros.current_mt_relevance_mt());
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21254)
  public static final SubLObject memoized_inference_excepted_assertionP_internal(SubLObject assertion, SubLObject mt) {
    return assertion_utilities.excepted_assertion_in_mtP(assertion, mt_relevance_macros.conservative_constraint_mt(mt));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21254)
  public static final SubLObject memoized_inference_excepted_assertionP(SubLObject assertion, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_inference_excepted_assertionP_internal(assertion, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym50$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym50$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym50$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(assertion, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw51$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (assertion.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && mt.equal(cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_inference_excepted_assertionP_internal(assertion, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(assertion, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** Given a problem get its inference if the problem store it is in is private for its inference
   Also return whether the problem store is private and the inference is non-continuable. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 21440)
  public static final SubLObject problem_inference_and_non_continuable_problem_store_private(SubLObject problem) {
    {
      SubLObject problem_store = inference_datastructures_problem.problem_store(problem);
      SubLObject non_continuableP = NIL;
      SubLObject problem_store_privateP = NIL;
      SubLObject inference = NIL;
      if ((NIL != inference_datastructures_problem_store.problem_store_has_only_one_inferenceP(problem_store))) {
        inference = inference_datastructures_problem_store.first_problem_store_inference(problem_store);
        problem_store_privateP = inference_datastructures_inference.inference_problem_store_privateP(inference);
        non_continuableP = makeBoolean((NIL == inference_datastructures_inference.inference_continuableP(inference)));
      }
      return Values.values(inference, makeBoolean(((NIL != problem_store_privateP)
               && (NIL != non_continuableP))));
    }
  }

  /** Returns lists of the form (hl-module productivity), :complete is the assumed completeness */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 22705)
  public static final SubLObject determine_literal_transformation_tactic_specs(SubLObject asent, SubLObject sense, SubLObject disabled_modules) {
    return determine_literal_transformation_tactic_specs_int(asent, sense, disabled_modules, $kw53$TACTIC_SPECS);
  }

  /** @param RETURN-TYPE keywordp; either :tactic-spec or :total-productivity.
If :tactic-specs, returns lists of the form (hl-module productivity), where :complete is the assumed completeness.
If :total-productivity, returns a productivity-p which is the sum of all the applicable productivities. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 22997)
  public static final SubLObject determine_literal_transformation_tactic_specs_int(SubLObject asent, SubLObject sense, SubLObject disabled_modules, SubLObject return_type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tactic_specs = NIL;
        SubLObject total_productivity = ZERO_INTEGER;
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject supplanted_modules = NIL;
        SubLObject exclusive_foundP = NIL;
        SubLObject rest = NIL;
        for (rest = inference_modules.transformation_modules(); (!(((NIL != exclusive_foundP)
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject hl_module = rest.first();
            if ((NIL != inference_modules.hl_module_activeP(hl_module, disabled_modules))) {
              if ((!(((NIL != supplanted_modules)
                     && (NIL != conses_high.member(hl_module, supplanted_modules, UNPROVIDED, UNPROVIDED)))))) {
                if (((NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense))
                     && (NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, predicate))
                     && (NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent))
                     && (NIL != inference_modules.hl_module_required_mt_relevantP(hl_module))
                     && (NIL != inference_modules.hl_module_direction_relevantP(hl_module)))) {
                  {
                    SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                    if (((NIL == exclusive_func)
                        || (exclusive_func.isFunctionSpec()
                           && (NIL != Functions.funcall(exclusive_func, asent))))) {
                      if ((NIL != exclusive_func)) {
                        thread.resetMultipleValues();
                        {
                          SubLObject exclusive_foundP_3 = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36244");
                          SubLObject tactic_specs_4 = thread.secondMultipleValue();
                          SubLObject supplanted_modules_5 = thread.thirdMultipleValue();
                          thread.resetMultipleValues();
                          exclusive_foundP = exclusive_foundP_3;
                          tactic_specs = tactic_specs_4;
                          supplanted_modules = supplanted_modules_5;
                        }
                      }
                      {
                        SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
                        if (((NIL == required_func)
                            || (required_func.isFunctionSpec()
                               && (NIL != Functions.funcall(required_func, asent))))) {
                          {
                            SubLObject cost = inference_modules.hl_module_asent_cost(hl_module, asent);
                            if ((NIL != cost)) {
                              {
                                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                SubLObject pcase_var = return_type;
                                if (pcase_var.eql($kw53$TACTIC_SPECS)) {
                                  {
                                    SubLObject tactic_spec = list(hl_module, productivity);
                                    tactic_specs = cons(tactic_spec, tactic_specs);
                                  }
                                } else if (pcase_var.eql($kw54$TOTAL_PRODUCTIVITY)) {
                                  total_productivity = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36510");
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
          }
        }
        {
          SubLObject pcase_var = return_type;
          if (pcase_var.eql($kw53$TACTIC_SPECS)) {
            return tactic_specs;
          } else if (pcase_var.eql($kw54$TOTAL_PRODUCTIVITY)) {
            return total_productivity;
          } else {
            Errors.error($str55$unexpected_tactic_specs_return_ty, return_type);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25302)
  public static final SubLObject literal_level_transformation_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != transformation_tactic_p(tactic))
           && (NIL != inference_worker.literal_level_tactic_p(tactic))));
  }

  /** @return nil or transformation-link-p
Creates a new transformation link iff it would be interesting to do so. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 25452)
  public static final SubLObject maybe_new_transformation_link(SubLObject supported_problem, SubLObject supporting_mapped_problem, SubLObject tactic, SubLObject transformation_bindings, SubLObject rule_assertion, SubLObject more_supports, SubLObject non_explanatory_subquery) {
    {
      SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(supported_problem);
      if ((NIL == leviathan.rule_bindings_wff_cachedP(rule_assertion, transformation_bindings, mt))) {
        Errors.warn($str56$pruning__s__s__s, rule_assertion, mt, transformation_bindings);
        return NIL;
      }
    }
    {
      SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
      SubLObject transformation_link = new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
      SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
      inference_datastructures_problem_store.problem_store_note_transformation_rule_considered(store, rule_assertion);
      inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
      if ((NIL != supporting_mapped_problem)) {
        recompute_thrown_away_due_to_new_transformation_link(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem));
      }
      return transformation_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 26691)
  public static final SubLObject recompute_thrown_away_due_to_new_transformation_link(SubLObject problem) {
    {
      SubLObject prob = problem;
      SubLObject store = inference_datastructures_problem.problem_store(prob);
      SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw43$SKIP))) {
        {
          SubLObject idx_6 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_6, $kw43$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_6);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw43$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw43$SKIP;
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
                              inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_motivations(problem, strategy);
                              if ((NIL != inference_abduction_utilities.abductive_strategy_p(strategy))) {
                                {
                                  SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                                  SubLObject sibling_tactic = NIL;
                                  for (sibling_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36463");
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
            }
          }
        }
        {
          SubLObject idx_7 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_7))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_7);
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
                              inference_datastructures_strategy.set_problem_recompute_thrown_away_wrt_all_motivations(problem, strategy);
                              if ((NIL != inference_abduction_utilities.abductive_strategy_p(strategy))) {
                                {
                                  SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
                                  SubLObject sibling_tactic = NIL;
                                  for (sibling_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sibling_tactic = cdolist_list_var.first()) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36464");
                                  }
                                }
                              }
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

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 27084)
  public static final SubLObject new_transformation_tactic(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject rule) {
    {
      SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, rule);
      SubLObject completeness = $kw42$GROSSLY_INCOMPLETE;
      inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
      inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw43$SKIP))) {
          {
            SubLObject idx_8 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_8, $kw43$SKIP))) {
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
                           && (NIL != id_index.id_index_skip_tombstones_p($kw43$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw43$SKIP;
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
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 27482)
  public static final SubLObject compute_strategic_properties_of_transformation_tactic(SubLObject tactic, SubLObject strategy) {
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 28207)
  public static final SubLObject execute_literal_level_transformation_tactic(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tactic_var = tactic;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          SubLObject _prev_bind_3 = backward.$inference_expand_hl_module$.currentBinding(thread);
          SubLObject _prev_bind_4 = backward.$inference_expand_sense$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic_var), thread);
            backward.$inference_expand_sense$.bind(sense, thread);
            {
              SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic_var);
              {
                SubLObject _prev_bind_0_10 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
                SubLObject _prev_bind_1_11 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
                SubLObject _prev_bind_2_12 = control_vars.$evaluatable_backchain_enabled$.currentBinding(thread);
                SubLObject _prev_bind_3_13 = control_vars.$negation_by_failure$.currentBinding(thread);
                try {
                  control_vars.$hl_failure_backchaining$.bind(T, thread);
                  control_vars.$unbound_rule_backchain_enabled$.bind(T, thread);
                  control_vars.$evaluatable_backchain_enabled$.bind(T, thread);
                  control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                  if ((NIL != inference_datastructures_tactic.tactic_in_progressP(tactic))) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                  } else {
                    {
                      SubLObject progress_iterator = maybe_make_transformation_tactic_progress_iterator(tactic, asent, sense);
                      if ((NIL == progress_iterator)) {
                      } else if (progress_iterator.isList()) {
                        {
                          SubLObject cdolist_list_var = progress_iterator;
                          SubLObject rule = NIL;
                          for (rule = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
                            handle_one_transformation_tactic_rule_select_result(tactic, rule);
                          }
                        }
                      } else {
                        inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                      }
                    }
                  }
                } finally {
                  control_vars.$negation_by_failure$.rebind(_prev_bind_3_13, thread);
                  control_vars.$evaluatable_backchain_enabled$.rebind(_prev_bind_2_12, thread);
                  control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_1_11, thread);
                  control_vars.$hl_failure_backchaining$.rebind(_prev_bind_0_10, thread);
                }
              }
            }
          } finally {
            backward.$inference_expand_sense$.rebind(_prev_bind_4, thread);
            backward.$inference_expand_hl_module$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return tactic;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 29186)
  public static final SubLObject maybe_make_transformation_tactic_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
    if ((NIL != meta_transformation_tactic_p(tactic))) {
      return maybe_make_meta_transformation_progress_iterator(tactic, asent, sense);
    } else if ((NIL == transformation_tactic_rule(tactic))) {
      return maybe_make_transformation_rule_select_progress_iterator(tactic, asent);
    } else {
      return maybe_make_transformation_expand_progress_iterator(tactic, asent);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 29621)
  public static final SubLObject maybe_make_meta_transformation_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject name = inference_datastructures_tactic.tactic_hl_module_name(tactic);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((name != $kw41$DETERMINE_NEW_TRANSFORMATION_TACTICS)) {
            Errors.error($str66$time_to_add_meta_transformation_s, name);
          }
        }
      }
      {
        SubLObject progress_iterator = NIL;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject tactic_specs = determine_literal_transformation_tactic_specs(asent, sense, NIL);
        SubLObject cdolist_list_var = tactic_specs;
        SubLObject tactic_spec = NIL;
        for (tactic_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic_spec = cdolist_list_var.first()) {
          {
            SubLObject datum = tactic_spec;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list48);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list48);
            productivity = current.first();
            current = current.rest();
            if ((NIL == current)) {
              new_transformation_tactic(problem, hl_module, productivity, NIL);
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list48);
            }
          }
        }
        return progress_iterator;
      }
    }
  }

  /** The number of expected transformation tactic results at which we generate them iteratively. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 30520)
  private static SubLSymbol $transformation_tactic_iteration_threshold$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 30831)
  public static final SubLObject maybe_make_transformation_rule_select_progress_iterator(SubLObject tactic, SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject rules = NIL;
        SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        rules = determine_rules_for_literal_transformation_tactics(problem, asent, hl_module);
        {
          SubLObject old_productivity = inference_datastructures_tactic.tactic_productivity(tactic);
          SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(rules));
          inference_datastructures_tactic.set_tactic_productivity(tactic, new_productivity, NIL);
        }
        if ((NIL != list_utilities.lengthGE(rules, $transformation_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED))) {
          rules = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36431");
        }
        return rules;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 32031)
  public static final SubLObject handle_one_transformation_tactic_rule_select_result(SubLObject transformation_tactic, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject existing_rule = transformation_tactic_rule(transformation_tactic);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL != existing_rule)) {
            Errors.error($str68$transformation_tactic__S_already_, transformation_tactic, existing_rule);
          }
        }
      }
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
        SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(ONE_INTEGER);
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(transformation_tactic, UNPROVIDED);
        return new_transformation_tactic(problem, hl_module, productivity, rule);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 32731)
  public static final SubLObject maybe_make_transformation_expand_progress_iterator(SubLObject tactic, SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject progress_iterator = NIL;
        {
          SubLObject _prev_bind_0 = backward.$transformation_add_node_method$.currentBinding(thread);
          try {
            backward.$transformation_add_node_method$.bind($sym69$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS, thread);
            {
              SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
              SubLObject rule = transformation_tactic_rule(tactic);
              SubLObject expand_method = inference_modules.hl_module_expand_func(hl_module);
              if (expand_method.isFunctionSpec()) {
                Functions.funcall(expand_method, asent, rule);
              }
            }
          } finally {
            backward.$transformation_add_node_method$.rebind(_prev_bind_0, thread);
          }
        }
        return progress_iterator;
      }
    }
  }

  /** @param UNIFICATION-BINDINGS; current tactic's problem vars -> something
   @param UNIFICATION-DEPENDENT-DNF the new transformed query */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 33455)
  public static final SubLObject handle_transformation_add_node_for_expand_results(SubLObject rule_assertion, SubLObject rule_pivot_asent, SubLObject rule_pivot_sense, SubLObject unification_bindings, SubLObject unification_dependent_dnf, SubLObject more_supports) {
    unification_bindings = bindings.inference_simplify_unification_bindings(unification_bindings);
    unification_bindings = bindings.possibly_optimize_bindings_wrt_equivalence(unification_bindings);
    {
      SubLObject tactic = inference_worker.currently_executing_tactic();
      SubLObject unification_explanatory_dnf = el_utilities.copy_clause(unification_dependent_dnf);
      if ((NIL != rule_assertion_has_some_pragmatic_requirementP(rule_assertion, NIL))) {
        {
          SubLObject pragmatic_requirements_dnf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36427");
          unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, pragmatic_requirements_dnf);
        }
      }
      if ((NIL != rule_assertion_worth_adding_type_constraintsP(rule_assertion))) {
        {
          SubLObject type_constraint_dnf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3444");
          unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, type_constraint_dnf);
        }
      }
      {
        SubLObject dont_care_constraints = transformation_additional_dont_care_constraints(rule_pivot_asent, unification_dependent_dnf, rule_assertion, unification_bindings);
        if ((NIL != dont_care_constraints)) {
          {
            SubLObject dont_care_dnf = clauses.make_dnf(NIL, dont_care_constraints);
            unification_dependent_dnf = nmerge_dnf(unification_dependent_dnf, dont_care_dnf);
          }
        }
      }
      {
        SubLObject unrestricted_transformation_dependent_dnf = unification_dependent_dnf_to_transformation_dependent_dnf(unification_dependent_dnf);
        SubLObject unrestricted_transformation_explanatory_dnf = unification_dependent_dnf_to_transformation_dependent_dnf(unification_explanatory_dnf);
        SubLObject transformation_bindings = unification_bindings_to_transformation_bindings(unification_bindings);
        return complete_execution_of_transformation_tactic(tactic, transformation_bindings, rule_assertion, more_supports, unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf);
      }
    }
  }

  /** Whether we allow the possibility of adding type constraints
during transformation. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 35870)
  public static SubLSymbol $inference_transformation_type_checking_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36037)
  public static final SubLObject rule_assertion_worth_adding_type_constraintsP(SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $inference_transformation_type_checking_enabledP$.getDynamicValue(thread))) {
        return NIL;
      }
      return T;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36315)
  public static final SubLObject transformation_additional_dont_care_constraints(SubLObject rule_pivot_asent, SubLObject unification_dependent_dnf, SubLObject rule_assertion, SubLObject unification_bindings) {
    {
      SubLObject source_var_pos_lits = backward_utilities.additional_source_variable_pos_lits(rule_pivot_asent, unification_dependent_dnf, rule_assertion);
      SubLObject dont_care_constraints = NIL;
      SubLObject cdolist_list_var = source_var_pos_lits;
      SubLObject source_var_pos_lit = NIL;
      for (source_var_pos_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), source_var_pos_lit = cdolist_list_var.first()) {
        {
          SubLObject substituted_pos_lit = bindings.apply_bindings(unification_bindings, source_var_pos_lit);
          if ((NIL == variables.fully_bound_p(substituted_pos_lit))) {
            dont_care_constraints = cons(source_var_pos_lit, dont_care_constraints);
          }
        }
      }
      return Sequences.nreverse(dont_care_constraints);
    }
  }

  /** Destructively modify EXISTING-DNF by merging ADDED-DNF into it.
   Return the modified EXISTING-DNF. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 36915)
  public static final SubLObject nmerge_dnf(SubLObject existing_dnf, SubLObject added_dnf) {
    return clauses.make_dnf(ConsesLow.append(clauses.neg_lits(existing_dnf), clauses.neg_lits(added_dnf)), ConsesLow.append(clauses.pos_lits(existing_dnf), clauses.pos_lits(added_dnf)));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 37434)
  public static final SubLObject complete_execution_of_transformation_tactic(SubLObject tactic, SubLObject transformation_bindings, SubLObject rule_assertion, SubLObject more_supports, SubLObject unrestricted_transformation_dependent_dnf, SubLObject unrestricted_transformation_explanatory_dnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supported_problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        SubLObject restricted_transformation_dependent_dnf = bindings.apply_bindings(transformation_bindings, unrestricted_transformation_dependent_dnf);
        SubLObject supporting_mapped_problem = NIL;
        if ((NIL == clauses.empty_clauseP(restricted_transformation_dependent_dnf))) {
          {
            SubLObject dependent_query = inference_czer.dnf_and_mt_to_hl_query(restricted_transformation_dependent_dnf, mt_relevance_macros.$mt$.getDynamicValue(thread));
            SubLObject abduction_allowedP = inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(inference_datastructures_tactic.tactic_problem(tactic)));
            if ((NIL == potentially_wf_transformation_dependent_query(dependent_query, abduction_allowedP))) {
              return NIL;
            }
            supporting_mapped_problem = inference_worker.find_or_create_problem(store, dependent_query, UNPROVIDED);
          }
        }
        {
          SubLObject non_explanatory_subquery = compute_transformation_non_explanatory_subquery(unrestricted_transformation_dependent_dnf, unrestricted_transformation_explanatory_dnf, restricted_transformation_dependent_dnf, transformation_bindings, supporting_mapped_problem);
          return maybe_new_transformation_link(supported_problem, supporting_mapped_problem, tactic, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 38913)
  public static final SubLObject compute_transformation_non_explanatory_subquery(SubLObject unrestricted_transformation_dependent_dnf, SubLObject unrestricted_transformation_explanatory_dnf, SubLObject restricted_transformation_dependent_dnf, SubLObject transformation_bindings, SubLObject supporting_mapped_problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (unrestricted_transformation_dependent_dnf.equal(unrestricted_transformation_explanatory_dnf)) {
        return NIL;
      }
      {
        SubLObject non_explanatory_dnf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30248");
        SubLObject restricted_non_explanatory_dnf = bindings.apply_bindings(transformation_bindings, non_explanatory_dnf);
        SubLObject non_explanatory_query = inference_czer.dnf_and_mt_to_hl_query(restricted_non_explanatory_dnf, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject non_explanatory_subquery = bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem), non_explanatory_query);
        return non_explanatory_subquery;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 39846)
  public static final SubLObject potentially_wf_transformation_dependent_query(SubLObject dependent_query, SubLObject abduction_allowedP) {
    {
      SubLObject cdolist_list_var = dependent_query;
      SubLObject contextualized_dnf = NIL;
      for (contextualized_dnf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_dnf = cdolist_list_var.first()) {
        {
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_14 = clauses.neg_lits(contextualized_dnf);
          SubLObject contextualized_asent = NIL;
          for (contextualized_asent = cdolist_list_var_14.first(); (NIL != cdolist_list_var_14); cdolist_list_var_14 = cdolist_list_var_14.rest(), contextualized_asent = cdolist_list_var_14.first()) {
            {
              SubLObject sense = $kw70$NEG;
              if ((NIL == potentially_wf_restricted_transformation_dependent_asent(contextualized_asent, sense, abduction_allowedP))) {
                return NIL;
              }
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
          }
        }
        {
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_15 = clauses.pos_lits(contextualized_dnf);
          SubLObject contextualized_asent = NIL;
          for (contextualized_asent = cdolist_list_var_15.first(); (NIL != cdolist_list_var_15); cdolist_list_var_15 = cdolist_list_var_15.rest(), contextualized_asent = cdolist_list_var_15.first()) {
            {
              SubLObject sense = $kw71$POS;
              if ((NIL == potentially_wf_restricted_transformation_dependent_asent(contextualized_asent, sense, abduction_allowedP))) {
                return NIL;
              }
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
          }
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40241)
  public static final SubLObject potentially_wf_restricted_transformation_dependent_asent(SubLObject contextualized_asent, SubLObject sense, SubLObject abduction_allowedP) {
    {
      SubLObject datum = contextualized_asent;
      SubLObject current = datum;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
      asent = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return makeBoolean(((NIL != syntactically_valid_asent(asent))
               && ((!(((NIL == abduction_allowedP)
                     && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const73$termOfUnit)))))
                || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36434")))));
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40723)
  public static final SubLObject syntactically_valid_asent(SubLObject asent) {
    return cycl_grammar.cycl_atomic_sentence_p(asent);
  }

  /** @param SUBPROOF nil or proof-p
@param VARIABLE-MAP; TRANSFORMATION-LINK's supporting problem -> TRANSFORMATION-LINK's extended supported problem
@return 0 proof-p
@return 1 whether the returned proof was newly created
@note see the unit test :heinous-unification-backchain for an example walkthrough of
the bindings processing of this function. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 40984)
  public static final SubLObject new_transformation_proof(SubLObject transformation_link, SubLObject subproof, SubLObject variable_map) {
    checkType(transformation_link, $sym25$TRANSFORMATION_LINK_P);
    if ((NIL != subproof)) {
      checkType(subproof, $sym74$PROOF_P);
    }
    {
      SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
      SubLObject supporting_subproof_bindings = ((NIL != subproof) ? ((SubLObject) inference_datastructures_proof.proof_bindings(subproof)) : NIL);
      SubLObject subproofs = ((NIL != subproof) ? ((SubLObject) list(subproof)) : NIL);
      SubLObject canonical_proof_bindings = compute_canonical_transformation_proof_bindings(variable_map, transformation_bindings, supporting_subproof_bindings);
      return inference_worker.propose_new_proof_with_bindings(transformation_link, canonical_proof_bindings, subproofs);
    }
  }

  /** @param T-LINK-VARIABLE-MAP; TRANSFORMATION-LINK's supporting problem -> TRANSFORMATION-LINK's extended supported problem
   @param TRANSFORMATION-BINDINGS; TRANSFORMATION-LINK's extended supported problem vars -> extended supported problem vars or new contents
   @param SUPPORTING-SUBPROOF-BINDINGS; TRANSFORMATION-LINK's supporting problem vars -> old contents */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 42055)
  public static final SubLObject compute_canonical_transformation_proof_bindings(SubLObject t_link_variable_map, SubLObject transformation_bindings, SubLObject supporting_subproof_bindings) {
    {
      SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(t_link_variable_map, supporting_subproof_bindings);
      SubLObject final_combined_bindings = unify_transformation_and_subproof_bindings(transformation_bindings, subproof_bindings);
      SubLObject proof_bindings = extended_supported_problem_bindings_to_supported_problem_bindings(final_combined_bindings);
      SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
      return canonical_proof_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 43303)
  public static final SubLObject unification_dependent_dnf_to_transformation_dependent_dnf(SubLObject unification_dependent_dnf) {
    return unification.variable_base_inversion(unification_dependent_dnf);
  }

  /** @param UNIFICATION-BINDINGS; the bindings returned by @xref transformation-add-node.
UNIFICATION-BINDINGS has the base variables (0-99) being the variables of the support (the rule),
and the non-base vars (100-199) being the variables of the supported problem.
This swaps the base and non-base variables.
It also does a little bit of bindings simplification. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 43504)
  public static final SubLObject unification_bindings_to_transformation_bindings(SubLObject unification_bindings) {
    {
      SubLObject swapped_unification_bindings = swap_variable_spaces_of_unification_bindings(unification_bindings);
      SubLObject bindings_to_closed = bindings.bindings_to_closed(swapped_unification_bindings);
      if ((NIL != bindings_to_closed)) {
        {
          SubLObject transformation_bindings = NIL;
          SubLObject cdolist_list_var = swapped_unification_bindings;
          SubLObject binding = NIL;
          for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
            {
              SubLObject old_value = bindings.variable_binding_value(binding);
              SubLObject new_value = bindings.apply_bindings(bindings_to_closed, old_value);
              transformation_bindings = cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), new_value), transformation_bindings);
            }
          }
          swapped_unification_bindings = Sequences.nreverse(transformation_bindings);
        }
      }
      return swapped_unification_bindings;
    }
  }

  /** Adds or subtracts 100 from all variables in UNIFICATION-BINDINGS.
This is tied with the assumptions inside the transformation modules about how they
call transformation-asent-unify. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44669)
  public static final SubLObject swap_variable_spaces_of_unification_bindings(SubLObject unification_bindings) {
    return unification.variable_base_inversion(unification_bindings);
  }

  /** @return bindings-p; TRANSFORMATION-LINK's rule assertion vars -> contents
i.e. the variables in the TRANSFORMATION-LINK's rule assertion that were bound by SUBPROOF */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 44996)
  public static final SubLObject transformation_proof_rule_bindings(SubLObject transformation_proof) {
    checkType(transformation_proof, $sym45$TRANSFORMATION_PROOF_P);
    {
      SubLObject transformation_link = inference_datastructures_proof.proof_link(transformation_proof);
      SubLObject subproof = transformation_proof_subproof(transformation_proof);
      SubLObject supporting_subproof_bindings = ((NIL != subproof) ? ((SubLObject) inference_datastructures_proof.proof_bindings(subproof)) : NIL);
      SubLObject rule_bindings = compute_transformation_link_rule_bindings(transformation_link, supporting_subproof_bindings);
      return rule_bindings;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 45787)
  public static final SubLObject compute_transformation_link_rule_bindings(SubLObject transformation_link, SubLObject supporting_subproof_bindings) {
    checkType(transformation_link, $sym25$TRANSFORMATION_LINK_P);
    checkType(supporting_subproof_bindings, $sym75$BINDINGS_P);
    {
      SubLObject t_link_variable_map = transformation_link_supporting_variable_map(transformation_link);
      SubLObject transformation_bindings = transformation_link_bindings(transformation_link);
      SubLObject subproof_bindings = bindings.transfer_variable_map_to_bindings_filtered(t_link_variable_map, supporting_subproof_bindings);
      SubLObject final_combined_bindings = unify_transformation_and_subproof_bindings(transformation_bindings, subproof_bindings);
      SubLObject rule_bindings = extended_supported_problem_bindings_to_rule_bindings(final_combined_bindings);
      return rule_bindings;
    }
  }

  /** @param TRANSFORMATION-BINDINGS; TRANSFORMATION-LINK's extended supported problem vars -> extended supported problem vars or new contents
   @param SUBPROOF-BINDINGS;       TRANSFORMATION-LINK's extended supported problem vars -> old contents
This function recursively reduces all loops and dependencies between TRANSFORMATION-BINDINGS and SUBPROOF-BINDINGS
until all bindings have fully-bound values. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 48877)
  public static final SubLObject unify_transformation_and_subproof_bindings(SubLObject transformation_bindings, SubLObject subproof_bindings) {
    {
      SubLObject combined_bindings = ConsesLow.append(subproof_bindings, transformation_bindings);
      if ((NIL != inference_worker.all_bindings_ground_outP(combined_bindings))) {
        return combined_bindings;
      }
      {
        SubLObject new_unified_bindings = inference_worker.unify_all_equal_bindings(combined_bindings);
        SubLObject recombined_bindings = ConsesLow.append(new_unified_bindings, combined_bindings);
        SubLObject final_bindings = NIL;
        SubLObject working_bindings = NIL;
        SubLObject cdolist_list_var = recombined_bindings;
        SubLObject binding = NIL;
        for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
          if ((NIL != inference_worker.binding_ground_outP(binding))) {
            final_bindings = cons(binding, final_bindings);
          } else {
            working_bindings = cons(binding, working_bindings);
          }
        }
        final_bindings = Sequences.nreverse(final_bindings);
        working_bindings = Sequences.nreverse(working_bindings);
        if ((NIL == final_bindings)) {
          Errors.error($str76$Could_not_ground_out__s_and__s, transformation_bindings, subproof_bindings);
        }
        {
          SubLObject substituted_bindings = bindings.apply_bindings_to_values(final_bindings, working_bindings);
          if ((transformation_bindings.equal(substituted_bindings)
               && subproof_bindings.equal(final_bindings))) {
            Errors.error($str77$Could_not_unify_transformation_bi, transformation_bindings, subproof_bindings);
          }
          return unify_transformation_and_subproof_bindings(substituted_bindings, final_bindings);
        }
      }
    }
  }

  /** Extended supported problem bindings include both base and non-base variables;
the base variables are the variables of the supported problem and the non-base
variables are the variables of the rule assertion.  This function filters out
the non-base variables, leaving only the bindings whose variables are in the space
of the supported problem.  In other words:
@param EXTENDED-SUPPORTED-PROBLEM-BINDINGS; TRANSFORMATION-LINK's extended supported problem bindings -> content
@return         SUPPORTED-PROBLEM-BINDINGS; TRANSFORMATION-LINK's supported problem bindings -> content */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 50925)
  public static final SubLObject extended_supported_problem_bindings_to_supported_problem_bindings(SubLObject extended_supported_problem_bindings) {
    {
      SubLObject supported_problem_bindings = NIL;
      SubLObject cdolist_list_var = extended_supported_problem_bindings;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        {
          SubLObject variable = bindings.variable_binding_variable(binding);
          if ((NIL != supported_problem_variable_p(variable))) {
            supported_problem_bindings = cons(binding, supported_problem_bindings);
          }
        }
      }
      return Sequences.nreverse(supported_problem_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 51939)
  public static final SubLObject supported_problem_variable_p(SubLObject variable) {
    return unification.base_variable_p(variable);
  }

  /** Extended supported problem bindings include both base and non-base variables;
the base variables are the variables of the supported problem and the non-base
variables are the variables of the rule assertion.  This function filters out
the base variables, leaving only the bindings whose variables are in the space
of the rule assertion.  In other words:
@param EXTENDED-SUPPORTED-PROBLEM-BINDINGS; TRANSFORMATION-LINK's extended supported problem bindings -> content
@return                      RULE-BINDINGS; TRANSFORMATION-LINK's rule assertion bindings -> content */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 52032)
  public static final SubLObject extended_supported_problem_bindings_to_rule_bindings(SubLObject extended_supported_problem_bindings) {
    {
      SubLObject rule_bindings = NIL;
      SubLObject cdolist_list_var = extended_supported_problem_bindings;
      SubLObject binding = NIL;
      for (binding = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
        {
          SubLObject variable = bindings.variable_binding_variable(binding);
          if ((NIL != rule_assertion_variable_p(variable))) {
            rule_bindings = cons(binding, rule_bindings);
          }
        }
      }
      return Sequences.nreverse(rule_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 52979)
  public static final SubLObject rule_assertion_variable_p(SubLObject variable) {
    return unification.non_base_variable_p(variable);
  }

  /** Return T iff RULE-ASSERTION has some relevant #$pragmaticRequirement in MT */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 53833)
  public static final SubLObject rule_assertion_has_some_pragmatic_requirementP(SubLObject rule_assertion, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(rule_assertion, $sym78$RULE_ASSERTION_);
      {
        SubLObject answer = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            answer = Numbers.plusp(kb_indexing.relevant_num_pragma_rule_index(rule_assertion));
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** Temporary control variable; whether or not #$pragmaticRequirement is enabled for forward inference. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 54475)
  private static SubLSymbol $forward_pragmatic_requirement_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 54648)
  public static final SubLObject forward_rule_pragmatic_dnf(SubLObject rule, SubLObject propagation_mt) {
    {
      SubLObject pragmatics_mt = ($const79$InferencePSC.equal(propagation_mt) ? ((SubLObject) assertions_high.assertion_mt(rule)) : propagation_mt);
      SubLObject pragmatic_dnf = (((NIL != $forward_pragmatic_requirement_enabledP$.getGlobalValue())
           && (NIL != rule_assertion_has_some_pragmatic_requirementP(rule, pragmatics_mt))) ? ((SubLObject) rule_assertion_pragmatic_requirements_dnf(rule, pragmatics_mt)) : clauses.empty_clause());
      return pragmatic_dnf;
    }
  }

  /** Return a DNF clause expressing all the known #$pragmaticRequirements for RULE-ASSERTION in MT */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 55338)
  public static final SubLObject rule_assertion_pragmatic_requirements_dnf(SubLObject rule_assertion, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(rule_assertion, $sym80$ASSERTION_P);
      {
        SubLObject dnf = clauses.make_dnf(NIL, NIL);
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if ((NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule_assertion, NIL))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule_assertion, NIL);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while ((NIL == done_var)) {
                  {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean((token_var != final_index_spec));
                    if ((NIL != valid)) {
                      {
                        SubLObject final_index_iterator = NIL;
                        try {
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw81$RULE, NIL, NIL);
                          {
                            SubLObject done_var_16 = NIL;
                            SubLObject token_var_17 = NIL;
                            while ((NIL == done_var_16)) {
                              {
                                SubLObject pragma_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                SubLObject valid_18 = makeBoolean((token_var_17 != pragma_assertion));
                                if ((NIL != valid_18)) {
                                  dnf = merge_pragmatic_requirement(rule_assertion, pragma_assertion, dnf);
                                }
                                done_var_16 = makeBoolean((NIL == valid_18));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0_19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                            }
                          }
                        }
                      }
                    }
                    done_var = makeBoolean((NIL == valid));
                  }
                }
              }
            }
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return dnf;
      }
    }
  }

  /** Merge the pragmatic requirements for RULE-ASSERTION expressed in PRAGMA-ASSERTION into MERGE-DNF and return it. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 55782)
  public static final SubLObject merge_pragmatic_requirement(SubLObject rule_assertion, SubLObject pragma_assertion, SubLObject merge_dnf) {
    {
      SubLObject neg_lits = clauses.neg_lits(merge_dnf);
      SubLObject pos_lits = clauses.pos_lits(merge_dnf);
      SubLObject rule_cnf = assertions_high.assertion_cnf(rule_assertion);
      SubLObject pragma_cnf = assertions_high.assertion_cnf(pragma_assertion);
      {
        SubLObject cdolist_list_var = clauses.neg_lits(pragma_cnf);
        SubLObject pragmatic_lit = NIL;
        for (pragmatic_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pragmatic_lit = cdolist_list_var.first()) {
          pragmatic_lit = compute_pragmatic_literal_for_merge(pragmatic_lit, merge_dnf, rule_cnf);
          {
            SubLObject item_var = pragmatic_lit;
            if ((NIL == conses_high.member(item_var, pos_lits, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
              pos_lits = cons(item_var, pos_lits);
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = clauses.pos_lits(pragma_cnf);
        SubLObject pragmatic_lit = NIL;
        for (pragmatic_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pragmatic_lit = cdolist_list_var.first()) {
          if ((NIL == el_utilities.el_meets_pragmatic_requirement_p(pragmatic_lit))) {
            pragmatic_lit = compute_pragmatic_literal_for_merge(pragmatic_lit, merge_dnf, rule_cnf);
            {
              SubLObject item_var = pragmatic_lit;
              if ((NIL == conses_high.member(item_var, neg_lits, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                neg_lits = cons(item_var, neg_lits);
              }
            }
          }
        }
      }
      return clause_utilities.nmake_dnf(neg_lits, pos_lits, merge_dnf);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56656)
  private static SubLSymbol $merge_dnf_lambda_var$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56707)
  private static SubLSymbol $rule_dnf_lambda_var$ = null;

  /** If LITERAL contains any HL variables that are not mentioned in RULE-DNF
but _are_ mentioned in MERGE-DNF, returns a new literal which is LITERAL
with those HL variables substituted with new HL variables which do not occur
in either MERGE-DNF or RULE-DNF.  Otherwise returns LITERAL. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 56757)
  public static final SubLObject compute_pragmatic_literal_for_merge(SubLObject literal, SubLObject merge_dnf, SubLObject rule_dnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = literal;
        {
          SubLObject _prev_bind_0 = $merge_dnf_lambda_var$.currentBinding(thread);
          SubLObject _prev_bind_1 = $rule_dnf_lambda_var$.currentBinding(thread);
          try {
            $merge_dnf_lambda_var$.bind(merge_dnf, thread);
            $rule_dnf_lambda_var$.bind(rule_dnf, thread);
            {
              SubLObject conflicting_hl_var = cycl_utilities.expression_find_if($sym82$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF, literal, NIL, UNPROVIDED);
              if ((NIL != conflicting_hl_var)) {
                {
                  SubLObject unique_hl_var = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8860");
                  SubLObject new_literal = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29724");
                  result = compute_pragmatic_literal_for_merge(new_literal, merge_dnf, rule_dnf);
                }
              }
            }
          } finally {
            $rule_dnf_lambda_var$.rebind(_prev_bind_1, thread);
            $merge_dnf_lambda_var$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 57685)
  public static final SubLObject hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != cycl_grammar.hl_variable_p(object))
             && (NIL == cycl_utilities.expression_find(object, $rule_dnf_lambda_var$.getDynamicValue(thread), NIL, UNPROVIDED, UNPROVIDED))
             && (NIL != cycl_utilities.expression_find(object, $merge_dnf_lambda_var$.getDynamicValue(thread), NIL, UNPROVIDED, UNPROVIDED))));
    }
  }

  public static final class $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction extends UnaryFunction {
    public $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction() { super(extractFunctionNamed("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 57937)
  public static final SubLObject bubble_up_proof_to_transformation_link(SubLObject supporting_proof, SubLObject variable_map, SubLObject transformation_link) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(transformation_link, $sym83$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P);
      thread.resetMultipleValues();
      {
        SubLObject proof = new_transformation_proof(transformation_link, supporting_proof, variable_map);
        SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != newP)) {
          inference_worker.bubble_up_proof(proof);
        } else {
          inference_worker.possibly_note_proof_processed(supporting_proof);
        }
        return proof;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58457)
  public static final SubLObject transformation_proof_abnormalP_internal(SubLObject transformation_proof) {
    return transformation_proof_abnormal_intP(transformation_proof);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58457)
  public static final SubLObject transformation_proof_abnormalP(SubLObject transformation_proof) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return transformation_proof_abnormalP_internal(transformation_proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym84$TRANSFORMATION_PROOF_ABNORMAL_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym84$TRANSFORMATION_PROOF_ABNORMAL_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym84$TRANSFORMATION_PROOF_ABNORMAL_, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, transformation_proof, $kw51$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw51$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(transformation_proof_abnormalP_internal(transformation_proof)));
            memoization_state.caching_state_put(caching_state, transformation_proof, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 58661)
  public static final SubLObject transformation_proof_abnormal_intP(SubLObject transformation_proof) {
    checkType(transformation_proof, $sym45$TRANSFORMATION_PROOF_P);
    {
      SubLObject link = inference_datastructures_proof.proof_link(transformation_proof);
      SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
      SubLObject rule = transformation_link_rule_assertion(link);
      SubLObject transformation_mt = transformation_link_transformation_mt(link);
      SubLObject rule_bindings = transformation_proof_rule_bindings(transformation_proof);
      return abnormal.rule_bindings_abnormalP(store, rule, rule_bindings, transformation_mt);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59199)
  public static final SubLObject proof_depends_on_excepted_assertionP(SubLObject proof) {
    return supports_contain_excepted_assertionP(inference_datastructures_proof.proof_supports(proof));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59334)
  public static final SubLObject supports_contain_excepted_assertionP(SubLObject supports) {
    {
      SubLObject cdolist_list_var = supports;
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        if (((NIL != assertion_handles.assertion_p(support))
             && (NIL != inference_excepted_assertionP(support)))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 59594)
  public static final SubLObject supports_contain_excepted_assertion_in_mtP(SubLObject supports, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = supports_contain_excepted_assertionP(supports);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Temporary control variable; when non-nil #$genlRules is used to filter the
   use of overly specific rules in transformation when a more general rule
   is also applicable.  Eventually should stay T. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62001)
  private static SubLSymbol $genl_rules_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62293)
  public static final SubLObject genl_rules_enabledP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $genl_rules_enabledP$.getDynamicValue(thread);
    }
  }

  /** Returns the most-general rules (via #$genlRules) among RULES,
   which are those rules that have no proper genlRule among RULES. */
  @SubL(source = "cycl/inference/harness/inference-worker-transformation.lisp", position = 62456)
  public static final SubLObject max_rules(SubLObject rules, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL == constant_handles.valid_constantP($const89$genlRules, UNPROVIDED))) {
      return rules;
    }
    return gt_methods.gt_max_nodes($const89$genlRules, rules, mt, UNPROVIDED);
  }

  public static final SubLObject declare_inference_worker_transformation_file() {
    declareFunction(myName, "transformation_link_data_print_function_trampoline", "TRANSFORMATION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "transformation_link_data_p", "TRANSFORMATION-LINK-DATA-P", 1, 0, false); new $transformation_link_data_p$UnaryFunction();
    declareFunction(myName, "trans_link_data_hl_module", "TRANS-LINK-DATA-HL-MODULE", 1, 0, false);
    declareFunction(myName, "trans_link_data_bindings", "TRANS-LINK-DATA-BINDINGS", 1, 0, false);
    declareFunction(myName, "trans_link_data_supports", "TRANS-LINK-DATA-SUPPORTS", 1, 0, false);
    declareFunction(myName, "trans_link_data_non_explanatory_subquery", "TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "_csetf_trans_link_data_hl_module", "_CSETF-TRANS-LINK-DATA-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_trans_link_data_bindings", "_CSETF-TRANS-LINK-DATA-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_trans_link_data_supports", "_CSETF-TRANS-LINK-DATA-SUPPORTS", 2, 0, false);
    declareFunction(myName, "_csetf_trans_link_data_non_explanatory_subquery", "_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "make_transformation_link_data", "MAKE-TRANSFORMATION-LINK-DATA", 0, 1, false);
    declareFunction(myName, "new_transformation_link", "NEW-TRANSFORMATION-LINK", 7, 0, false);
    declareFunction(myName, "new_transformation_link_int", "NEW-TRANSFORMATION-LINK-INT", 5, 0, false);
    declareFunction(myName, "new_transformation_link_data", "NEW-TRANSFORMATION-LINK-DATA", 1, 0, false);
    declareFunction(myName, "destroy_transformation_link", "DESTROY-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "transformation_link_hl_module", "TRANSFORMATION-LINK-HL-MODULE", 1, 0, false);
    declareFunction(myName, "transformation_link_bindings", "TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
    declareFunction(myName, "transformation_link_supports", "TRANSFORMATION-LINK-SUPPORTS", 1, 0, false);
    declareFunction(myName, "transformation_link_rule_assertion", "TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "transformation_link_more_supports", "TRANSFORMATION-LINK-MORE-SUPPORTS", 1, 0, false);
    declareFunction(myName, "transformation_link_non_explanatory_subquery", "TRANSFORMATION-LINK-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
    declareFunction(myName, "set_transformation_link_hl_module", "SET-TRANSFORMATION-LINK-HL-MODULE", 2, 0, false);
    declareFunction(myName, "set_transformation_link_bindings", "SET-TRANSFORMATION-LINK-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_transformation_link_supports", "SET-TRANSFORMATION-LINK-SUPPORTS", 2, 0, false);
    declareFunction(myName, "set_transformation_link_non_explanatory_subquery", "SET-TRANSFORMATION-LINK-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
    declareFunction(myName, "transformation_link_tactic", "TRANSFORMATION-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "transformation_link_pragmatic_requirements", "TRANSFORMATION-LINK-PRAGMATIC-REQUIREMENTS", 1, 0, false);
    declareFunction(myName, "transformation_link_supporting_mapped_problem", "TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "transformation_link_supporting_problem", "TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "transformation_link_supporting_variable_map", "TRANSFORMATION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "transformation_link_transformation_mt", "TRANSFORMATION-LINK-TRANSFORMATION-MT", 1, 0, false);
    declareFunction(myName, "transformation_link_supporting_problem_wholly_explanatoryP", "TRANSFORMATION-LINK-SUPPORTING-PROBLEM-WHOLLY-EXPLANATORY?", 1, 0, false);
    declareFunction(myName, "transformed_problem_using_rule", "TRANSFORMED-PROBLEM-USING-RULE", 2, 0, false);
    declareFunction(myName, "transformed_problem_using_rule_and_hl_module", "TRANSFORMED-PROBLEM-USING-RULE-AND-HL-MODULE", 3, 0, false);
    declareFunction(myName, "transformation_link_rule_bindings_to_closed", "TRANSFORMATION-LINK-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
    declareFunction(myName, "transformation_rule_bindings_to_closed", "TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
    declareMacro(myName, "with_problem_store_transformation_assumptions", "WITH-PROBLEM-STORE-TRANSFORMATION-ASSUMPTIONS");
    declareFunction(myName, "meta_transformation_tactic_p", "META-TRANSFORMATION-TACTIC-P", 1, 0, false);
    declareFunction(myName, "add_tactic_to_determine_new_literal_transformation_tactics", "ADD-TACTIC-TO-DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS", 4, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_asentP", "INFERENCE-BACKCHAIN-FORBIDDEN-ASENT?", 2, 0, false);
    declareFunction(myName, "new_meta_transformation_tactic", "NEW-META-TRANSFORMATION-TACTIC", 3, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_meta_transformation_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-TRANSFORMATION-TACTIC", 2, 0, false);
    declareFunction(myName, "transformation_link_p", "TRANSFORMATION-LINK-P", 1, 0, false);
    declareFunction(myName, "transformation_tactic_p", "TRANSFORMATION-TACTIC-P", 1, 0, false); new $transformation_tactic_p$UnaryFunction();
    declareFunction(myName, "transformation_tactic_rule", "TRANSFORMATION-TACTIC-RULE", 1, 0, false);
    declareFunction(myName, "transformation_rule_tactic_p", "TRANSFORMATION-RULE-TACTIC-P", 1, 0, false);
    declareFunction(myName, "transformation_generator_tactic_p", "TRANSFORMATION-GENERATOR-TACTIC-P", 1, 0, false);
    declareFunction(myName, "transformation_generator_tactic_lookahead_rule", "TRANSFORMATION-GENERATOR-TACTIC-LOOKAHEAD-RULE", 1, 0, false);
    declareFunction(myName, "transformation_tactic_lookahead_rule", "TRANSFORMATION-TACTIC-LOOKAHEAD-RULE", 1, 0, false);
    declareFunction(myName, "transformation_proof_p", "TRANSFORMATION-PROOF-P", 1, 0, false);
    declareFunction(myName, "transformation_proof_rule_assertion", "TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "transformation_proof_additional_supports", "TRANSFORMATION-PROOF-ADDITIONAL-SUPPORTS", 1, 0, false);
    declareFunction(myName, "transformation_proof_subproof", "TRANSFORMATION-PROOF-SUBPROOF", 1, 0, false);
    declareFunction(myName, "generalized_transformation_link_p", "GENERALIZED-TRANSFORMATION-LINK-P", 1, 0, false);
    declareFunction(myName, "generalized_transformation_link_rule_assertion", "GENERALIZED-TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "generalized_transformation_link_unaffected_by_exceptionsP", "GENERALIZED-TRANSFORMATION-LINK-UNAFFECTED-BY-EXCEPTIONS?", 1, 0, false);
    declareFunction(myName, "generalized_transformation_proof_p", "GENERALIZED-TRANSFORMATION-PROOF-P", 1, 0, false);
    declareFunction(myName, "generalized_transformation_proof_rule_assertion", "GENERALIZED-TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "generalized_transformation_proof_transformation_link", "GENERALIZED-TRANSFORMATION-PROOF-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "determine_new_literal_transformation_tactics", "DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS", 3, 0, false);
    declareFunction(myName, "determine_new_literal_transformation_tactics_int", "DETERMINE-NEW-LITERAL-TRANSFORMATION-TACTICS-INT", 3, 1, false);
    declareFunction(myName, "determine_rules_for_literal_transformation_tactics", "DETERMINE-RULES-FOR-LITERAL-TRANSFORMATION-TACTICS", 3, 0, false);
    declareFunction(myName, "inference_excepted_assertionP", "INFERENCE-EXCEPTED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "memoized_inference_excepted_assertionP_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-INTERNAL", 2, 0, false);
    declareFunction(myName, "memoized_inference_excepted_assertionP", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?", 2, 0, false);
    declareFunction(myName, "problem_inference_and_non_continuable_problem_store_private", "PROBLEM-INFERENCE-AND-NON-CONTINUABLE-PROBLEM-STORE-PRIVATE", 1, 0, false);
    declareFunction(myName, "single_literal_problem_candidate_transformation_tactic_specs", "SINGLE-LITERAL-PROBLEM-CANDIDATE-TRANSFORMATION-TACTIC-SPECS", 1, 0, false);
    declareFunction(myName, "determine_literal_transformation_tactic_specs", "DETERMINE-LITERAL-TRANSFORMATION-TACTIC-SPECS", 3, 0, false);
    declareFunction(myName, "determine_literal_transformation_tactic_specs_int", "DETERMINE-LITERAL-TRANSFORMATION-TACTIC-SPECS-INT", 4, 0, false);
    declareFunction(myName, "literal_level_transformation_tactic_p", "LITERAL-LEVEL-TRANSFORMATION-TACTIC-P", 1, 0, false);
    declareFunction(myName, "maybe_new_transformation_link", "MAYBE-NEW-TRANSFORMATION-LINK", 7, 0, false);
    declareFunction(myName, "recompute_thrown_away_due_to_new_transformation_link", "RECOMPUTE-THROWN-AWAY-DUE-TO-NEW-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "new_transformation_tactic", "NEW-TRANSFORMATION-TACTIC", 4, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_transformation_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-TRANSFORMATION-TACTIC", 2, 0, false);
    declareMacro(myName, "with_transformation_tactic_execution_assumptions", "WITH-TRANSFORMATION-TACTIC-EXECUTION-ASSUMPTIONS");
    declareFunction(myName, "execute_literal_level_transformation_tactic", "EXECUTE-LITERAL-LEVEL-TRANSFORMATION-TACTIC", 4, 0, false);
    declareFunction(myName, "maybe_make_transformation_tactic_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
    declareFunction(myName, "maybe_make_meta_transformation_progress_iterator", "MAYBE-MAKE-META-TRANSFORMATION-PROGRESS-ITERATOR", 3, 0, false);
    declareFunction(myName, "maybe_make_transformation_rule_select_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-RULE-SELECT-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "new_transformation_rule_select_progress_iterator", "NEW-TRANSFORMATION-RULE-SELECT-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "handle_one_transformation_tactic_rule_select_result", "HANDLE-ONE-TRANSFORMATION-TACTIC-RULE-SELECT-RESULT", 2, 0, false);
    declareFunction(myName, "maybe_make_transformation_expand_progress_iterator", "MAYBE-MAKE-TRANSFORMATION-EXPAND-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "handle_transformation_add_node_for_expand_results", "HANDLE-TRANSFORMATION-ADD-NODE-FOR-EXPAND-RESULTS", 6, 0, false);
    declareFunction(myName, "rule_assertion_worth_adding_type_constraintsP", "RULE-ASSERTION-WORTH-ADDING-TYPE-CONSTRAINTS?", 1, 0, false);
    declareFunction(myName, "transformation_additional_dont_care_constraints", "TRANSFORMATION-ADDITIONAL-DONT-CARE-CONSTRAINTS", 4, 0, false);
    declareFunction(myName, "nmerge_dnf", "NMERGE-DNF", 2, 0, false);
    declareFunction(myName, "merge_dnf", "MERGE-DNF", 2, 0, false);
    declareFunction(myName, "complete_execution_of_transformation_tactic", "COMPLETE-EXECUTION-OF-TRANSFORMATION-TACTIC", 6, 0, false);
    declareFunction(myName, "compute_transformation_non_explanatory_subquery", "COMPUTE-TRANSFORMATION-NON-EXPLANATORY-SUBQUERY", 5, 0, false);
    declareFunction(myName, "potentially_wf_transformation_dependent_query", "POTENTIALLY-WF-TRANSFORMATION-DEPENDENT-QUERY", 2, 0, false);
    declareFunction(myName, "potentially_wf_restricted_transformation_dependent_asent", "POTENTIALLY-WF-RESTRICTED-TRANSFORMATION-DEPENDENT-ASENT", 3, 0, false);
    declareFunction(myName, "syntactically_valid_asent", "SYNTACTICALLY-VALID-ASENT", 1, 0, false);
    declareFunction(myName, "syntactically_valid_contextualized_term_of_unit_asent", "SYNTACTICALLY-VALID-CONTEXTUALIZED-TERM-OF-UNIT-ASENT", 2, 0, false);
    declareFunction(myName, "new_transformation_proof", "NEW-TRANSFORMATION-PROOF", 3, 0, false);
    declareFunction(myName, "compute_canonical_transformation_proof_bindings", "COMPUTE-CANONICAL-TRANSFORMATION-PROOF-BINDINGS", 3, 0, false);
    declareFunction(myName, "unification_dependent_dnf_to_transformation_dependent_dnf", "UNIFICATION-DEPENDENT-DNF-TO-TRANSFORMATION-DEPENDENT-DNF", 1, 0, false);
    declareFunction(myName, "unification_bindings_to_transformation_bindings", "UNIFICATION-BINDINGS-TO-TRANSFORMATION-BINDINGS", 1, 0, false);
    declareFunction(myName, "swap_variable_spaces_of_unification_bindings", "SWAP-VARIABLE-SPACES-OF-UNIFICATION-BINDINGS", 1, 0, false);
    declareFunction(myName, "transformation_proof_rule_bindings", "TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
    declareFunction(myName, "compute_transformation_link_rule_bindings", "COMPUTE-TRANSFORMATION-LINK-RULE-BINDINGS", 2, 0, false);
    declareFunction(myName, "transformation_proof_rule_el_bindings", "TRANSFORMATION-PROOF-RULE-EL-BINDINGS", 1, 0, false);
    declareFunction(myName, "transformation_proof_el_bindings", "TRANSFORMATION-PROOF-EL-BINDINGS", 1, 0, false);
    declareFunction(myName, "unify_transformation_and_subproof_bindings", "UNIFY-TRANSFORMATION-AND-SUBPROOF-BINDINGS", 2, 0, false);
    declareFunction(myName, "extended_supported_problem_bindings_to_supported_problem_bindings", "EXTENDED-SUPPORTED-PROBLEM-BINDINGS-TO-SUPPORTED-PROBLEM-BINDINGS", 1, 0, false);
    declareFunction(myName, "supported_problem_variable_p", "SUPPORTED-PROBLEM-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "extended_supported_problem_bindings_to_rule_bindings", "EXTENDED-SUPPORTED-PROBLEM-BINDINGS-TO-RULE-BINDINGS", 1, 0, false);
    declareFunction(myName, "rule_assertion_variable_p", "RULE-ASSERTION-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "rule_assertion_variable_map", "RULE-ASSERTION-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "rule_assertion_has_some_pragmatic_requirementP", "RULE-ASSERTION-HAS-SOME-PRAGMATIC-REQUIREMENT?", 1, 1, false);
    declareFunction(myName, "backward_rule_pragmatic_dnf", "BACKWARD-RULE-PRAGMATIC-DNF", 1, 1, false);
    declareFunction(myName, "forward_rule_pragmatic_dnf", "FORWARD-RULE-PRAGMATIC-DNF", 2, 0, false);
    declareFunction(myName, "rule_assertion_pragmatic_requirements_dnf", "RULE-ASSERTION-PRAGMATIC-REQUIREMENTS-DNF", 1, 1, false);
    declareFunction(myName, "merge_pragmatic_requirement", "MERGE-PRAGMATIC-REQUIREMENT", 3, 0, false);
    declareFunction(myName, "compute_pragmatic_literal_for_merge", "COMPUTE-PRAGMATIC-LITERAL-FOR-MERGE", 3, 0, false);
    declareFunction(myName, "hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf", "HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF", 1, 0, false); new $hl_variable_not_mentioned_in_rule_dnf_but_mentioned_in_merge_dnf$UnaryFunction();
    declareFunction(myName, "bubble_up_proof_to_transformation_link", "BUBBLE-UP-PROOF-TO-TRANSFORMATION-LINK", 3, 0, false);
    declareFunction(myName, "transformation_proof_abnormalP_internal", "TRANSFORMATION-PROOF-ABNORMAL?-INTERNAL", 1, 0, false);
    declareFunction(myName, "transformation_proof_abnormalP", "TRANSFORMATION-PROOF-ABNORMAL?", 1, 0, false);
    declareFunction(myName, "transformation_proof_abnormal_intP", "TRANSFORMATION-PROOF-ABNORMAL-INT?", 1, 0, false);
    declareFunction(myName, "proof_depends_on_excepted_assertionP", "PROOF-DEPENDS-ON-EXCEPTED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "supports_contain_excepted_assertionP", "SUPPORTS-CONTAIN-EXCEPTED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "supports_contain_excepted_assertion_in_mtP", "SUPPORTS-CONTAIN-EXCEPTED-ASSERTION-IN-MT?", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_argnums", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_argnums_memoized_internal", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_argnums_memoized", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_asentP", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT?", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_asent_variables", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-VARIABLES", 2, 0, false);
    declareFunction(myName, "inference_backchain_forbidden_unless_arg_chosen_asent_variables_int", "INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASENT-VARIABLES-INT", 3, 0, false);
    declareFunction(myName, "genl_rules_enabledP", "GENL-RULES-ENABLED?", 0, 0, false);
    declareFunction(myName, "genl_rules", "GENL-RULES", 1, 1, false);
    declareFunction(myName, "max_rules", "MAX-RULES", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_transformation_file() {
    $dtp_transformation_link_data$ = defconstant("*DTP-TRANSFORMATION-LINK-DATA*", $sym0$TRANSFORMATION_LINK_DATA);
    $determine_new_transformation_tactics_module$ = deflexical("*DETERMINE-NEW-TRANSFORMATION-TACTICS-MODULE*", maybeDefault( $sym40$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_, $determine_new_transformation_tactics_module$, ()-> (inference_modules.inference_meta_transformation_module($kw41$DETERMINE_NEW_TRANSFORMATION_TACTICS, UNPROVIDED))));
    $transformation_tactic_iteration_threshold$ = defparameter("*TRANSFORMATION-TACTIC-ITERATION-THRESHOLD*", TWO_INTEGER);
    $inference_transformation_type_checking_enabledP$ = defparameter("*INFERENCE-TRANSFORMATION-TYPE-CHECKING-ENABLED?*", NIL);
    $forward_pragmatic_requirement_enabledP$ = deflexical("*FORWARD-PRAGMATIC-REQUIREMENT-ENABLED?*", T);
    $merge_dnf_lambda_var$ = defparameter("*MERGE-DNF-LAMBDA-VAR*", NIL);
    $rule_dnf_lambda_var$ = defparameter("*RULE-DNF-LAMBDA-VAR*", NIL);
    $genl_rules_enabledP$ = defvar("*GENL-RULES-ENABLED?*", T);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_transformation_file() {
    // CVS_ID("Id: inference-worker-transformation.lisp 128648 2009-08-27 17:23:55Z pace ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TRANS_LINK_DATA_HL_MODULE, $sym9$_CSETF_TRANS_LINK_DATA_HL_MODULE);
    Structures.def_csetf($sym10$TRANS_LINK_DATA_BINDINGS, $sym11$_CSETF_TRANS_LINK_DATA_BINDINGS);
    Structures.def_csetf($sym12$TRANS_LINK_DATA_SUPPORTS, $sym13$_CSETF_TRANS_LINK_DATA_SUPPORTS);
    Structures.def_csetf($sym14$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY, $sym15$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY);
    Equality.identity($sym0$TRANSFORMATION_LINK_DATA);
    subl_macro_promotions.declare_defglobal($sym40$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_);
    memoization_state.note_memoized_function($sym50$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_);
    memoization_state.note_memoized_function($sym84$TRANSFORMATION_PROOF_ABNORMAL_);
    memoization_state.note_memoized_function($sym85$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TRANSFORMATION_LINK_DATA = makeSymbol("TRANSFORMATION-LINK-DATA");
  public static final SubLSymbol $sym1$TRANSFORMATION_LINK_DATA_P = makeSymbol("TRANSFORMATION-LINK-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"), makeSymbol("NON-EXPLANATORY-SUBQUERY"));
  public static final SubLList $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"), makeKeyword("NON-EXPLANATORY-SUBQUERY"));
  public static final SubLList $list4 = list(makeSymbol("TRANS-LINK-DATA-HL-MODULE"), makeSymbol("TRANS-LINK-DATA-BINDINGS"), makeSymbol("TRANS-LINK-DATA-SUPPORTS"), makeSymbol("TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-TRANS-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-TRANS-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-TRANS-LINK-DATA-SUPPORTS"), makeSymbol("_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$TRANSFORMATION_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TRANS_LINK_DATA_HL_MODULE = makeSymbol("TRANS-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym9$_CSETF_TRANS_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-TRANS-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym10$TRANS_LINK_DATA_BINDINGS = makeSymbol("TRANS-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym11$_CSETF_TRANS_LINK_DATA_BINDINGS = makeSymbol("_CSETF-TRANS-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym12$TRANS_LINK_DATA_SUPPORTS = makeSymbol("TRANS-LINK-DATA-SUPPORTS");
  public static final SubLSymbol $sym13$_CSETF_TRANS_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-TRANS-LINK-DATA-SUPPORTS");
  public static final SubLSymbol $sym14$TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY = makeSymbol("TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $sym15$_CSETF_TRANS_LINK_DATA_NON_EXPLANATORY_SUBQUERY = makeSymbol("_CSETF-TRANS-LINK-DATA-NON-EXPLANATORY-SUBQUERY");
  public static final SubLSymbol $kw16$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw17$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw18$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $kw19$NON_EXPLANATORY_SUBQUERY = makeKeyword("NON-EXPLANATORY-SUBQUERY");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym21$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym22$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
  public static final SubLSymbol $kw23$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw24$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym25$TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");
  public static final SubLSymbol $sym26$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $sym27$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
  public static final SubLSymbol $sym28$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLSymbol $sym29$NON_EXPLANATORY_SUBQUERY_SPEC_P = makeSymbol("NON-EXPLANATORY-SUBQUERY-SPEC-P");
  public static final SubLString $str30$No_tactic_found_for__S = makeString("No tactic found for ~S");
  public static final SubLList $list31 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLList $list32 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym33$STORE_VAR = makeUninternedSymbol("STORE-VAR");
  public static final SubLSymbol $sym34$CLET = makeSymbol("CLET");
  public static final SubLList $list35 = list(makeSymbol("*HL-FAILURE-BACKCHAINING*"), T);
  public static final SubLList $list36 = list(makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), T);
  public static final SubLList $list37 = list(makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), T);
  public static final SubLSymbol $sym38$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
  public static final SubLSymbol $sym39$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
  public static final SubLSymbol $sym40$_DETERMINE_NEW_TRANSFORMATION_TACTICS_MODULE_ = makeSymbol("*DETERMINE-NEW-TRANSFORMATION-TACTICS-MODULE*");
  public static final SubLSymbol $kw41$DETERMINE_NEW_TRANSFORMATION_TACTICS = makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS");
  public static final SubLSymbol $kw42$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw43$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym44$TRANSFORMATION_GENERATOR_TACTIC_P = makeSymbol("TRANSFORMATION-GENERATOR-TACTIC-P");
  public static final SubLSymbol $sym45$TRANSFORMATION_PROOF_P = makeSymbol("TRANSFORMATION-PROOF-P");
  public static final SubLString $str46$generalized_transformation_link_o = makeString("generalized transformation link of unexpected type: ~s");
  public static final SubLString $str47$generalized_transformation_proof_ = makeString("generalized transformation proof of unexpected type: ~s");
  public static final SubLList $list48 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"));
  public static final SubLSymbol $sym49$INFERENCE_EXCEPTED_ASSERTION_ = makeSymbol("INFERENCE-EXCEPTED-ASSERTION?");
  public static final SubLSymbol $sym50$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_ = makeSymbol("MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?");
  public static final SubLSymbol $kw51$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym52$SINGLE_LITERAL_PROBLEM_P = makeSymbol("SINGLE-LITERAL-PROBLEM-P");
  public static final SubLSymbol $kw53$TACTIC_SPECS = makeKeyword("TACTIC-SPECS");
  public static final SubLSymbol $kw54$TOTAL_PRODUCTIVITY = makeKeyword("TOTAL-PRODUCTIVITY");
  public static final SubLString $str55$unexpected_tactic_specs_return_ty = makeString("unexpected tactic-specs return type ~a");
  public static final SubLString $str56$pruning__s__s__s = makeString("pruning ~s ~s ~s");
  public static final SubLSymbol $kw57$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLList $list58 = list(list(makeSymbol("TACTIC"), makeSymbol("MT"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym59$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
  public static final SubLSymbol $sym60$WITH_INFERENCE_MT_RELEVANCE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym61$_INFERENCE_EXPAND_HL_MODULE_ = makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");
  public static final SubLSymbol $sym62$TACTIC_HL_MODULE = makeSymbol("TACTIC-HL-MODULE");
  public static final SubLSymbol $sym63$_INFERENCE_EXPAND_SENSE_ = makeSymbol("*INFERENCE-EXPAND-SENSE*");
  public static final SubLSymbol $sym64$WITH_PROBLEM_STORE_TRANSFORMATION_ASSUMPTIONS = makeSymbol("WITH-PROBLEM-STORE-TRANSFORMATION-ASSUMPTIONS");
  public static final SubLSymbol $sym65$TACTIC_STORE = makeSymbol("TACTIC-STORE");
  public static final SubLString $str66$time_to_add_meta_transformation_s = makeString("time to add meta-transformation support for ~S");
  public static final SubLSymbol $kw67$TRANSFORMATION_RULE_SELECT = makeKeyword("TRANSFORMATION-RULE-SELECT");
  public static final SubLString $str68$transformation_tactic__S_already_ = makeString("transformation tactic ~S already has rule ~S");
  public static final SubLSymbol $sym69$HANDLE_TRANSFORMATION_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-TRANSFORMATION-ADD-NODE-FOR-EXPAND-RESULTS");
  public static final SubLSymbol $kw70$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw71$POS = makeKeyword("POS");
  public static final SubLList $list72 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLObject $const73$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $sym74$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLSymbol $sym75$BINDINGS_P = makeSymbol("BINDINGS-P");
  public static final SubLString $str76$Could_not_ground_out__s_and__s = makeString("Could not ground out ~s and ~s");
  public static final SubLString $str77$Could_not_unify_transformation_bi = makeString("Could not unify transformation bindings ~a with subproof bindings ~a");
  public static final SubLSymbol $sym78$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLObject $const79$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym80$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $kw81$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym82$HL_VARIABLE_NOT_MENTIONED_IN_RULE_DNF_BUT_MENTIONED_IN_MERGE_DNF = makeSymbol("HL-VARIABLE-NOT-MENTIONED-IN-RULE-DNF-BUT-MENTIONED-IN-MERGE-DNF");
  public static final SubLSymbol $sym83$PROBLEM_LINK_WITH_SINGLE_SUPPORTING_PROBLEM_P = makeSymbol("PROBLEM-LINK-WITH-SINGLE-SUPPORTING-PROBLEM-P");
  public static final SubLSymbol $sym84$TRANSFORMATION_PROOF_ABNORMAL_ = makeSymbol("TRANSFORMATION-PROOF-ABNORMAL?");
  public static final SubLSymbol $sym85$INFERENCE_BACKCHAIN_FORBIDDEN_UNLESS_ARG_CHOSEN_ARGNUMS_MEMOIZED = makeSymbol("INFERENCE-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS-MEMOIZED");
  public static final SubLSymbol $kw86$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym87$_ = makeSymbol("<");
  public static final SubLSymbol $sym88$VARIABLE_ID = makeSymbol("VARIABLE-ID");
  public static final SubLObject $const89$genlRules = constant_handles.reader_make_constant_shell(makeString("genlRules"));

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_worker_transformation_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_worker_transformation_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_worker_transformation_file();
  }

}
