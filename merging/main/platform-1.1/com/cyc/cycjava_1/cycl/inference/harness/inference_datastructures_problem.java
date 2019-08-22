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
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_min_transformation_depth;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.inference.leviathan;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_datastructures_problem extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_problem() {}
  public static final SubLFile me = new inference_datastructures_problem();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem";

  //// Definitions

  public static final class $problem_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $suid; }
    public SubLObject getField3() { return $store; }
    public SubLObject getField4() { return $query; }
    public SubLObject getField5() { return $status; }
    public SubLObject getField6() { return $dependent_links; }
    public SubLObject getField7() { return $argument_links; }
    public SubLObject getField8() { return $tactics; }
    public SubLObject getField9() { return $proof_bindings_index; }
    public SubLObject getField10() { return $argument_link_bindings_index; }
    public SubLObject setField2(SubLObject value) { return $suid = value; }
    public SubLObject setField3(SubLObject value) { return $store = value; }
    public SubLObject setField4(SubLObject value) { return $query = value; }
    public SubLObject setField5(SubLObject value) { return $status = value; }
    public SubLObject setField6(SubLObject value) { return $dependent_links = value; }
    public SubLObject setField7(SubLObject value) { return $argument_links = value; }
    public SubLObject setField8(SubLObject value) { return $tactics = value; }
    public SubLObject setField9(SubLObject value) { return $proof_bindings_index = value; }
    public SubLObject setField10(SubLObject value) { return $argument_link_bindings_index = value; }
    public SubLObject $suid = NIL;
    public SubLObject $store = NIL;
    public SubLObject $query = NIL;
    public SubLObject $status = NIL;
    public SubLObject $dependent_links = NIL;
    public SubLObject $argument_links = NIL;
    public SubLObject $tactics = NIL;
    public SubLObject $proof_bindings_index = NIL;
    public SubLObject $argument_link_bindings_index = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($problem_native.class, $sym0$PROBLEM, $sym1$PROBLEM_P, $list3, $list4, new String[] {"$suid", "$store", "$query", "$status", "$dependent_links", "$argument_links", "$tactics", "$proof_bindings_index", "$argument_link_bindings_index"}, $list5, $list6, $sym7$PRINT_PROBLEM);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static SubLSymbol $dtp_problem$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject problem_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35367");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject problem_p(SubLObject object) {
    return ((object.getClass() == $problem_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $problem_p$UnaryFunction extends UnaryFunction {
    public $problem_p$UnaryFunction() { super(extractFunctionNamed("PROBLEM-P")); }
    public SubLObject processItem(SubLObject arg1) { return problem_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_suid(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField2();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_store(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_query(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_status(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField5();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_dependent_links(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_argument_links(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_tactics(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_proof_bindings_index(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject prob_argument_link_bindings_index(SubLObject object) {
    checkType(object, $sym1$PROBLEM_P);
    return object.getField10();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_store(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_query(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_status(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_dependent_links(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_argument_links(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_tactics(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_proof_bindings_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject _csetf_prob_argument_link_bindings_index(SubLObject object, SubLObject value) {
    checkType(object, $sym1$PROBLEM_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 1177) 
  public static final SubLObject make_problem(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $problem_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw27$SUID)) {
            _csetf_prob_suid(v_new, current_value);
          } else if (pcase_var.eql($kw28$STORE)) {
            _csetf_prob_store(v_new, current_value);
          } else if (pcase_var.eql($kw29$QUERY)) {
            _csetf_prob_query(v_new, current_value);
          } else if (pcase_var.eql($kw30$STATUS)) {
            _csetf_prob_status(v_new, current_value);
          } else if (pcase_var.eql($kw31$DEPENDENT_LINKS)) {
            _csetf_prob_dependent_links(v_new, current_value);
          } else if (pcase_var.eql($kw32$ARGUMENT_LINKS)) {
            _csetf_prob_argument_links(v_new, current_value);
          } else if (pcase_var.eql($kw33$TACTICS)) {
            _csetf_prob_tactics(v_new, current_value);
          } else if (pcase_var.eql($kw34$PROOF_BINDINGS_INDEX)) {
            _csetf_prob_proof_bindings_index(v_new, current_value);
          } else if (pcase_var.eql($kw35$ARGUMENT_LINK_BINDINGS_INDEX)) {
            _csetf_prob_argument_link_bindings_index(v_new, current_value);
          } else {
            Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 2636) 
  public static final SubLObject valid_problem_p(SubLObject object) {
    return makeBoolean(((NIL != problem_p(object))
           && (NIL == problem_invalid_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 2755) 
  public static final SubLObject problem_invalid_p(SubLObject problem) {
    return Equality.eq($kw37$FREE, problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3266) 
  public static final SubLObject sxhash_problem_method(SubLObject object) {
    return prob_suid(object);
  }

  public static final class $sxhash_problem_method$UnaryFunction extends UnaryFunction {
    public $sxhash_problem_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-PROBLEM-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_problem_method(arg1); }
  }

  /** Creates and canonicalizes a new problem. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 3336) 
  public static final SubLObject new_problem(SubLObject store, SubLObject query) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(store, $sym41$PROBLEM_STORE_P);
      checkType(query, $sym42$CONTEXTUALIZED_DNF_CLAUSES_P);
      leviathan.note_new_problem_created();
      if (((NIL != control_vars.$inference_debugP$.getDynamicValue(thread))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33142")))) {
        Errors.cerror($str43$Ignore_the_crazy_problems, $str44$Crazy_amount_of_problems___a__in_, inference_datastructures_problem_store.problem_store_problem_count(store), store);
      }
      {
        SubLObject problem = make_problem(UNPROVIDED);
        SubLObject suid = inference_datastructures_problem_store.problem_store_new_problem_id(store);
        inference_metrics.increment_problem_historical_count();
        if ((NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(query))) {
          inference_metrics.increment_single_literal_problem_historical_count();
        }
        _csetf_prob_suid(problem, suid);
        _csetf_prob_store(problem, store);
        _csetf_prob_query(problem, query);
        set_problem_status(problem, $kw45$NEW);
        _csetf_prob_argument_links(problem, set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ)));
        _csetf_prob_dependent_links(problem, set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ)));
        _csetf_prob_tactics(problem, NIL);
        _csetf_prob_proof_bindings_index(problem, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, Symbols.symbol_function(EQUAL)));
        _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, Symbols.symbol_function(EQUAL)));
        inference_datastructures_problem_store.add_problem_store_problem(store, problem);
        inference_worker.note_problem_created(problem);
        return problem;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 4738) 
  public static SubLSymbol $empty_clauses$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 6276) 
  public static final SubLObject problem_tactics(SubLObject problem) {
    checkType(problem, $sym1$PROBLEM_P);
    return prob_tactics(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 6419) 
  public static final SubLObject do_problem_tactics_status_match(SubLObject tactic, SubLObject status_spec) {
    return makeBoolean(((NIL == status_spec)
          || (NIL != inference_datastructures_tactic.tactic_has_statusP(tactic, status_spec))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 6603) 
  public static final SubLObject do_problem_tactics_completeness_match(SubLObject tactic, SubLObject completeness_spec) {
    if ((NIL == completeness_spec)) {
      return T;
    } else {
      checkType(completeness_spec, $sym71$COMPLETENESS_P);
      return Equality.eq(completeness_spec, inference_datastructures_tactic.tactic_completeness(tactic));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 6942) 
  public static final SubLObject do_problem_tactics_preference_level_match(SubLObject tactic, SubLObject preference_level_spec) {
    if ((NIL == preference_level_spec)) {
      return T;
    } else {
      checkType(preference_level_spec, $sym72$PREFERENCE_LEVEL_P);
      return Equality.eq(preference_level_spec, inference_datastructures_tactic.tactic_preference_level(tactic));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7302) 
  public static final SubLObject do_problem_tactics_productivity_match(SubLObject tactic, SubLObject productivity_spec) {
    if ((NIL == productivity_spec)) {
      return T;
    } else {
      checkType(productivity_spec, $sym73$PRODUCTIVITY_P);
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36506");
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7646) 
  public static final SubLObject do_problem_tactics_hl_module_match(SubLObject tactic, SubLObject hl_module_spec) {
    if ((NIL == hl_module_spec)) {
      return T;
    } else {
      checkType(hl_module_spec, $sym74$HL_MODULE_P);
      return Equality.eq(hl_module_spec, inference_datastructures_tactic.tactic_hl_module(tactic));
    }
  }

  /** Generalized tactic types which specify more than one actual tactic-type-p. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 7963) 
  private static SubLSymbol $generalized_tactic_types$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8662) 
  public static final SubLObject do_problem_tactics_type_match(SubLObject tactic, SubLObject type_spec) {
    return tactic_matches_type_specP(tactic, type_spec);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 8817) 
  public static final SubLObject tactic_matches_type_specP(SubLObject tactic, SubLObject type_spec) {
    if ((NIL == type_spec)) {
      return T;
    } else {
      checkType(type_spec, $sym76$GENERALIZED_TACTIC_TYPE_P);
      {
        SubLObject pcase_var = type_spec;
        if (pcase_var.eql($kw77$NON_TRANSFORMATION)) {
          return makeBoolean((NIL == inference_worker_transformation.transformation_tactic_p(tactic)));
        } else if (pcase_var.eql($kw78$GENERALIZED_REMOVAL)) {
          return inference_worker_removal.generalized_removal_tactic_p(tactic);
        } else if (pcase_var.eql($kw79$GENERALIZED_REMOVAL_OR_REWRITE)) {
          return makeBoolean(((NIL != inference_worker_removal.generalized_removal_tactic_p(tactic))
                || (NIL != inference_worker_rewrite.rewrite_tactic_p(tactic))));
        } else if (pcase_var.eql($kw80$CONNECTED_CONJUNCTION)) {
          return inference_worker.connected_conjunction_tactic_p(tactic);
        } else if (pcase_var.eql($kw81$CONJUNCTIVE)) {
          return inference_worker.conjunctive_tactic_p(tactic);
        } else if (pcase_var.eql($kw82$DISJUNCTIVE)) {
          return inference_worker.disjunctive_tactic_p(tactic);
        } else if (pcase_var.eql($kw83$LOGICAL)) {
          return inference_worker.logical_tactic_p(tactic);
        } else if (pcase_var.eql($kw84$LOGICAL_CONJUNCTIVE)) {
          return inference_worker.logical_conjunctive_tactic_p(tactic);
        } else if (pcase_var.eql($kw85$STRUCTURAL_CONJUNCTIVE)) {
          return inference_worker.logical_conjunctive_tactic_p(tactic);
        } else if (pcase_var.eql($kw86$META_STRUCTURAL)) {
          return inference_worker.meta_structural_tactic_p(tactic);
        } else if (pcase_var.eql($kw87$CONTENT)) {
          return inference_worker.content_tactic_p(tactic);
        } else if (pcase_var.eql($kw88$UNION)) {
          return inference_worker_union.union_tactic_p(tactic);
        } else if (pcase_var.eql($kw89$SPLIT)) {
          return inference_worker_split.split_tactic_p(tactic);
        } else if (pcase_var.eql($kw90$JOIN_ORDERED)) {
          return inference_worker_join_ordered.join_ordered_tactic_p(tactic);
        } else if (pcase_var.eql($kw91$JOIN)) {
          return inference_worker_join.join_tactic_p(tactic);
        } else {
          return Equality.eq(type_spec, inference_datastructures_tactic.tactic_type(tactic));
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 10488) 
  public static final SubLObject problem_argument_links(SubLObject problem) {
    return prob_argument_links(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 11107) 
  public static final SubLObject problem_dependent_links(SubLObject problem) {
    return prob_dependent_links(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 13793) 
  public static final SubLObject problem_proof_bindings_index(SubLObject problem) {
    return prob_proof_bindings_index(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 13928) 
  public static final SubLObject proof_has_statusP(SubLObject proof, SubLObject status) {
    if ((NIL == status)) {
      return T;
    } else {
      return Equality.eq(status, inference_datastructures_proof.proof_status(proof));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 16906) 
  public static final SubLObject destroy_problem_store_problem(SubLObject problem) {
    if ((NIL != valid_problem_p(problem))) {
      note_problem_invalid(problem);
      return destroy_problem_int(problem);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17077) 
  public static final SubLObject destroy_problem_int(SubLObject problem) {
    dictionary_contents.clear_dictionary_contents(prob_argument_link_bindings_index(problem));
    _csetf_prob_argument_link_bindings_index(problem, $kw37$FREE);
    dictionary_contents.clear_dictionary_contents(prob_proof_bindings_index(problem));
    _csetf_prob_proof_bindings_index(problem, $kw37$FREE);
    {
      SubLObject cdolist_list_var = problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        inference_datastructures_tactic.destroy_problem_tactic(tactic);
      }
      _csetf_prob_tactics(problem, $kw37$FREE);
    }
    set_contents.clear_set_contents(prob_dependent_links(problem));
    _csetf_prob_dependent_links(problem, $kw37$FREE);
    set_contents.clear_set_contents(prob_argument_links(problem));
    _csetf_prob_argument_links(problem, $kw37$FREE);
    _csetf_prob_query(problem, $kw37$FREE);
    _csetf_prob_store(problem, $kw37$FREE);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17893) 
  public static final SubLObject note_problem_invalid(SubLObject problem) {
    _csetf_prob_status(problem, $kw37$FREE);
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 17998) 
  public static final SubLObject problem_suid(SubLObject problem) {
    checkType(problem, $sym1$PROBLEM_P);
    return prob_suid(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18114) 
  public static final SubLObject problem_store(SubLObject problem) {
    checkType(problem, $sym1$PROBLEM_P);
    return prob_store(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18220) 
  public static final SubLObject problem_query(SubLObject problem) {
    checkType(problem, $sym1$PROBLEM_P);
    return prob_query(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18326) 
  public static final SubLObject problem_status(SubLObject problem) {
    checkType(problem, $sym1$PROBLEM_P);
    return prob_status(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 18521) 
  public static final SubLObject set_problem_status(SubLObject problem, SubLObject status) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(status, $sym151$PROBLEM_STATUS_P);
    _csetf_prob_status(problem, status);
    return problem;
  }

  /** @return booleanp; whether PROBLEM contains no variables */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19196) 
  public static final SubLObject closed_problem_p(SubLObject problem) {
    return closed_problem_query_p(problem_query(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 19522) 
  public static final SubLObject closed_problem_query_p(SubLObject query) {
    return el_utilities.hl_ground_tree_p(query);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20020) 
  public static final SubLObject problem_variables(SubLObject problem) {
    return inference_datastructures_problem_query.problem_query_variables(problem_query(problem));
  }

  /** @return boolean; whether OBJECT is a problem whose query consists of
a single contextualized literal (either positive or negative). */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20562) 
  public static final SubLObject single_literal_problem_p(SubLObject object) {
    return makeBoolean(((NIL != problem_p(object))
           && (NIL != inference_datastructures_problem_query.problem_query_has_single_literal_p(problem_query(object)))));
  }

  /** Assuming PROBLEM is a @xref single-literal-problem-p,
returns the predicate of its single contextualized literal. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 20853) 
  public static final SubLObject single_literal_problem_predicate(SubLObject problem) {
    return inference_datastructures_problem_query.single_literal_problem_query_predicate(problem_query(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21107) 
  public static final SubLObject single_literal_problem_atomic_sentence(SubLObject problem) {
    return inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(problem_query(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21255) 
  public static final SubLObject single_literal_problem_mt(SubLObject problem) {
    return inference_datastructures_problem_query.single_literal_problem_query_mt(problem_query(problem));
  }

  /** @return sense-p;  Assumes PROBLEM is a single literal problem, and returns the problem's query's sense. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21377) 
  public static final SubLObject single_literal_problem_sense(SubLObject problem) {
    return inference_datastructures_problem_query.single_literal_problem_query_sense(problem_query(problem));
  }

  /** @param problem ; single-literal-problem-p
   @return 0 mt
   @return 1 atomic-sentence-p
   @return 2 sense-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21613) 
  public static final SubLObject mt_asent_sense_from_single_literal_problem(SubLObject problem) {
    return inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(problem_query(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 21867) 
  public static final SubLObject single_clause_problem_p(SubLObject object) {
    if ((NIL != problem_p(object))) {
      {
        SubLObject query = problem_query(object);
        return inference_datastructures_problem_query.single_clause_problem_query_p(query);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22135) 
  public static final SubLObject ist_problem_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != single_literal_problem_p(object))
             && (($const155$ist == single_literal_problem_predicate(object))
              || ((NIL != utilities_macros.within_normal_forward_inferenceP())
                 && (mt_relevance_macros.$mt$.getDynamicValue(thread) != $const156$InferencePSC)))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 22937) 
  public static final SubLObject multi_literal_problem_p(SubLObject object) {
    return makeBoolean(((NIL != single_clause_problem_p(object))
           && (NIL == single_literal_problem_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23176) 
  public static final SubLObject multi_clause_problem_p(SubLObject object) {
    return makeBoolean(((NIL != problem_p(object))
           && (NIL == single_clause_problem_p(object))));
  }

  /** @return contextualized-dnf-clause-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23458) 
  public static final SubLObject problem_sole_clause(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject query = problem_query(problem);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == list_utilities.singletonP(query))) {
            Errors.error($str157$The_problem__S_did_not_have_a_sin, problem);
          }
        }
        return problem_query_sole_clause(query);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23767) 
  public static final SubLObject problem_query_sole_clause(SubLObject query) {
    {
      SubLObject datum = query;
      SubLObject current = datum;
      SubLObject dnf_clause = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list158);
      dnf_clause = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return dnf_clause;
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list158);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 23885) 
  public static final SubLObject problem_in_equality_reasoning_domainP(SubLObject problem) {
    {
      SubLObject query = problem_query(problem);
      SubLObject store = problem_store(problem);
      SubLObject equality_reasoning_domain = inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
      return inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, equality_reasoning_domain);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24741) 
  public static final SubLObject problem_relevant_to_inferenceP(SubLObject problem, SubLObject inference) {
    return set.set_memberP(problem, inference_datastructures_inference.inference_relevant_problems(inference));
  }

  /** @return boolean; t iff PROBLEM is relevant to STRATEGY's inference. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 24882) 
  public static final SubLObject problem_relevant_to_strategyP(SubLObject problem, SubLObject strategy) {
    return problem_relevant_to_inferenceP(problem, inference_datastructures_strategy.strategy_inference(strategy));
  }

  /** @return boolean; t iff PROBLEM has any argument (child) links. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26039) 
  public static final SubLObject problem_has_argument_link_p(SubLObject problem) {
    return makeBoolean((NIL == set_contents.set_contents_emptyP(prob_argument_links(problem))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26231) 
  public static final SubLObject problem_has_argument_link_of_typeP(SubLObject problem, SubLObject type) {
    return list_utilities.sublisp_boolean(problem_first_argument_link_of_type(problem, type));
  }

  /** @return nil or problem-link-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26370) 
  public static final SubLObject problem_first_argument_link_of_type(SubLObject problem, SubLObject type) {
    {
      SubLObject first_link = NIL;
      SubLObject set_contents_var = problem_argument_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type))) {
              if ((NIL == first_link)) {
                first_link = link;
              }
            }
          }
        }
      }
      return first_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 26634) 
  public static final SubLObject problem_sole_argument_link_of_type(SubLObject problem, SubLObject type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject first_link = NIL;
        SubLObject set_contents_var = problem_argument_links(problem);
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject link = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type))) {
                if ((NIL != first_link)) {
                  Errors.error($str159$Found_more_than_one__a_argument_l, type, problem);
                } else {
                  first_link = link;
                }
              }
            }
          }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == first_link)) {
            Errors.error($str160$Expected__a_to_have_a__a_argument, problem, type);
          }
        }
        return first_link;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 29118) 
  public static final SubLObject problem_has_dependent_link_of_typeP(SubLObject problem, SubLObject type) {
    {
      SubLObject set_contents_var = problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject dependent_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(dependent_link, type))) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 30934) 
  public static final SubLObject problem_next_tactic_suid(SubLObject problem) {
    return problem_tactic_count(problem);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31049) 
  public static final SubLObject problem_tactic_count(SubLObject problem) {
    {
      SubLObject tactics = problem_tactics(problem);
      if ((NIL != tactics)) {
        return number_utilities.f_1X(inference_datastructures_tactic.tactic_suid(tactics.first()));
      } else {
        return ZERO_INTEGER;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 31962) 
  public static final SubLObject problem_has_possible_tacticsP(SubLObject problem) {
    checkType(problem, $sym1$PROBLEM_P);
    return list_utilities.sublisp_boolean(Sequences.find_if($sym168$TACTIC_POSSIBLE_, problem_tactics(problem), UNPROVIDED, UNPROVIDED, UNPROVIDED));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 32127) 
  public static final SubLObject problem_no_tactics_possibleP(SubLObject problem) {
    return makeBoolean((NIL == problem_has_possible_tacticsP(problem)));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33617) 
  public static final SubLObject problem_has_tactic_of_type_with_statusP(SubLObject problem, SubLObject type, SubLObject status) {
    if ((status == UNPROVIDED)) {
      status = NIL;
    }
    {
      SubLObject foundP = NIL;
      SubLObject rest = NIL;
      for (rest = problem_tactics(problem); (!(((NIL != foundP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject tactic = rest.first();
          if (((NIL != do_problem_tactics_type_match(tactic, type))
               && (NIL != do_problem_tactics_status_match(tactic, status)))) {
            foundP = T;
          }
        }
      }
      return foundP;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 33854) 
  public static final SubLObject problem_has_tactic_of_typeP(SubLObject problem, SubLObject type) {
    return problem_has_tactic_of_type_with_statusP(problem, type, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34108) 
  public static final SubLObject problem_has_transformation_tacticsP(SubLObject problem) {
    return problem_has_tactic_of_typeP(problem, $kw167$TRANSFORMATION);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34395) 
  public static final SubLObject problem_has_possible_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(strategic_context, $sym175$STRATEGIC_CONTEXT_P);
    return problem_has_tactic_of_type_with_statusP(problem, $kw176$REMOVAL, $kw171$POSSIBLE);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34643) 
  public static final SubLObject problem_has_complete_possible_removal_tacticP(SubLObject problem, SubLObject strategic_context) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(strategic_context, $sym175$STRATEGIC_CONTEXT_P);
    {
      SubLObject cdolist_list_var = problem_tactics(problem);
      SubLObject tactic = NIL;
      for (tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic = cdolist_list_var.first()) {
        if (((NIL != do_problem_tactics_type_match(tactic, $kw176$REMOVAL))
             && (NIL != do_problem_tactics_status_match(tactic, $kw171$POSSIBLE)))) {
          if ((NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, strategic_context))) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 34966) 
  public static final SubLObject problem_has_split_tacticsP(SubLObject problem) {
    {
      SubLObject foundP = NIL;
      SubLObject rest = NIL;
      for (rest = problem_tactics(problem); (!(((NIL != foundP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject tactic = rest.first();
          foundP = inference_worker_split.split_tactic_p(tactic);
        }
      }
      return foundP;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38580) 
  public static final SubLObject problem_proof_count(SubLObject problem, SubLObject proof_status) {
    if ((proof_status == UNPROVIDED)) {
      proof_status = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject status_var = proof_status;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject cdolist_list_var = proof_list;
              SubLObject proof = NIL;
              for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
                if ((NIL != proof_has_statusP(proof, status_var))) {
                  count = Numbers.add(count, ONE_INTEGER);
                }
              }
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 38921) 
  public static final SubLObject problem_has_some_proofP(SubLObject problem, SubLObject proof_status) {
    if ((proof_status == UNPROVIDED)) {
      proof_status = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject status_var = proof_status;
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(problem_proof_bindings_index(problem));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject cdolist_list_var = proof_list;
              SubLObject proof = NIL;
              for (proof = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), proof = cdolist_list_var.first()) {
                if ((NIL != proof_has_statusP(proof, status_var))) {
                  return T;
                }
              }
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39148) 
  public static final SubLObject problem_has_some_proven_proofP(SubLObject problem) {
    return problem_has_some_proofP(problem, $kw178$PROVEN);
  }

  /** @return list-of-proof-p (possibly empty) */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39374) 
  public static final SubLObject problem_proofs_lookup(SubLObject problem, SubLObject v_bindings) {
    {
      SubLObject index = prob_proof_bindings_index(problem);
      SubLObject proofs = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
      return proofs;
    }
  }

  /** @return list-of-problem-link-p (possibly empty) */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 39632) 
  public static final SubLObject problem_argument_links_lookup(SubLObject problem, SubLObject v_bindings) {
    {
      SubLObject index = prob_argument_link_bindings_index(problem);
      SubLObject links = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
      return links;
    }
  }

  /** @return non-negative-integer-p or :undetermined; the number of
links on the shortest path between PROBLEM and INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 41013) 
  public static final SubLObject problem_min_proof_depth(SubLObject problem, SubLObject inference) {
    {
      SubLObject store = problem_store(problem);
      SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, UNPROVIDED);
      if ((NIL != hash)) {
        {
          SubLObject depth = Hashtables.gethash_without_values(problem, hash, UNPROVIDED);
          if ((NIL != subl_promotions.non_negative_integer_p(depth))) {
            return depth;
          }
        }
      }
    }
    return $kw183$UNDETERMINED;
  }

  /** :intuitive or :counterintuitive.  :intuitive means that any transformation or residual transformation
link increments the transformation depth by 1.  This corresponds to the number of times
that the problem has been transformed.  :counterintuitive means that transformation-depth
indicates the maximum number of times that any /literal/ in the problem has been transformed. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 41579) 
  public static SubLSymbol $transformation_depth_computation$ = null;

  /** Temporary control variable; when non-nil min-transformation-depth is computed from the min-transformation-depth-signature.
   Should eventually stay T. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 42030) 
  public static SubLSymbol $problem_min_transformation_depth_from_signature_enabledP$ = null;

  /** @return non-negative-integer-p or :undetermined; the number of
transformation links on the shortest path between PROBLEM and INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 42281) 
  public static final SubLObject problem_min_transformation_depth(SubLObject problem, SubLObject inference) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread))) {
        return inference_min_transformation_depth.problem_min_transformation_depth_from_signature(problem, inference);
      }
      {
        SubLObject store = problem_store(problem);
        SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store), inference, UNPROVIDED);
        if ((NIL != hash)) {
          {
            SubLObject depth = Hashtables.gethash_without_values(problem, hash, UNPROVIDED);
            if ((NIL != subl_promotions.non_negative_integer_p(depth))) {
              return depth;
            }
          }
        }
      }
      return $kw183$UNDETERMINED;
    }
  }

  /** @return problem-query-depth-signature-p or :undetermined; a signature of the the per-literal number of
transformation links on the shortest path between PROBLEM and INFERENCE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43036) 
  public static final SubLObject problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference) {
    {
      SubLObject store = problem_store(problem);
      SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, UNPROVIDED);
      if ((NIL != hash)) {
        {
          SubLObject depth = Hashtables.gethash_without_values(problem, hash, UNPROVIDED);
          if ((NIL != depth)) {
            return depth;
          }
        }
      }
    }
    return $kw183$UNDETERMINED;
  }

  /** Puts ARGUMENT-LINK _below_ PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 43689) 
  public static final SubLObject add_problem_argument_link(SubLObject problem, SubLObject argument_link) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(argument_link, $sym185$PROBLEM_LINK_P);
    _csetf_prob_argument_links(problem, set_contents.set_contents_add(argument_link, prob_argument_links(problem), Symbols.symbol_function(EQ)));
    return problem;
  }

  /** Indexes argument-link by bindings for fast lookup.  Used for removal and restriction links. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 44353) 
  public static final SubLObject index_problem_argument_link(SubLObject problem, SubLObject argument_link) {
    {
      SubLObject index = prob_argument_link_bindings_index(problem);
      SubLObject v_bindings = ((NIL != inference_worker_removal.removal_link_p(argument_link)) ? ((SubLObject) inference_worker_removal.removal_link_bindings(argument_link)) : ((NIL != inference_worker_restriction.restriction_link_p(argument_link)) ? ((SubLObject) inference_worker_restriction.restriction_link_bindings(argument_link)) : NIL));
      SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
      existing = cons(argument_link, existing);
      _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, Symbols.symbol_function(EQUAL)));
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45026) 
  public static final SubLObject deindex_problem_argument_link(SubLObject problem, SubLObject argument_link) {
    {
      SubLObject index = prob_argument_link_bindings_index(problem);
      SubLObject v_bindings = ((NIL != inference_worker_removal.removal_link_p(argument_link)) ? ((SubLObject) inference_worker_removal.removal_link_bindings(argument_link)) : ((NIL != inference_worker_restriction.restriction_link_p(argument_link)) ? ((SubLObject) inference_worker_restriction.restriction_link_bindings(argument_link)) : NIL));
      SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
      SubLObject updated = list_utilities.delete_first(argument_link, existing, Symbols.symbol_function(EQ));
      if ((existing != updated)) {
        if ((NIL == updated)) {
          _csetf_prob_argument_link_bindings_index(problem, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31609"));
        } else {
          _csetf_prob_argument_link_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, updated, Symbols.symbol_function(EQUAL)));
        }
      }
    }
    return problem;
  }

  /** Puts DEPENDENT-LINK _above_ PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 45800) 
  public static final SubLObject add_problem_dependent_link(SubLObject problem, SubLObject dependent_link) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(dependent_link, $sym185$PROBLEM_LINK_P);
    _csetf_prob_dependent_links(problem, set_contents.set_contents_add(dependent_link, prob_dependent_links(problem), Symbols.symbol_function(EQ)));
    inference_metrics.increment_dependent_link_historical_count();
    if ((NIL != single_literal_problem_p(problem))) {
      inference_metrics.increment_single_literal_problem_dependent_link_historical_count();
    }
    return problem;
  }

  /** Removes DEPENDENT-LINK from _above_ PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46282) 
  public static final SubLObject remove_problem_dependent_link(SubLObject problem, SubLObject dependent_link) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(dependent_link, $sym185$PROBLEM_LINK_P);
    _csetf_prob_dependent_links(problem, set_contents.set_contents_delete(dependent_link, prob_dependent_links(problem), Symbols.symbol_function(EQ)));
    return problem;
  }

  /** The maximum number of tactics (of any status) that can be on a single problem.
Attempting to add an additional tactic after this number yields an error. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46616) 
  public static SubLSymbol $max_problem_tactics$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 46950) 
  public static final SubLObject add_problem_tactic(SubLObject problem, SubLObject tactic) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(problem, $sym1$PROBLEM_P);
      checkType(tactic, $sym187$TACTIC_P);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!(problem_tactic_count(problem).numLE($max_problem_tactics$.getGlobalValue())))) {
          Errors.error($str188$Tried_to_add__s_to__s__which_woul, new SubLObject[] {tactic, problem, $max_problem_tactics$.getGlobalValue(), problem});
        }
      }
      _csetf_prob_tactics(problem, cons(tactic, prob_tactics(problem)));
      return problem;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 47668) 
  public static final SubLObject add_problem_proof(SubLObject problem, SubLObject proof) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(proof, $sym189$PROOF_P);
    {
      SubLObject index = prob_proof_bindings_index(problem);
      SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
      SubLObject existing = dictionary_contents.dictionary_contents_lookup_without_values(index, v_bindings, Symbols.symbol_function(EQUAL), UNPROVIDED);
      existing = cons(proof, existing);
      _csetf_prob_proof_bindings_index(problem, dictionary_contents.dictionary_contents_enter(index, v_bindings, existing, Symbols.symbol_function(EQUAL)));
    }
    return problem;
  }

  /** Primitively sets PROBLEM's proof depth wrt INFERENCE to DEPTH. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 49554) 
  public static final SubLObject set_problem_min_proof_depth(SubLObject problem, SubLObject inference, SubLObject depth) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(inference, $sym192$INFERENCE_P);
    checkType(depth, $sym191$NON_NEGATIVE_INTEGER_P);
    {
      SubLObject store = problem_store(problem);
      SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, UNPROVIDED);
      if ((NIL == hash)) {
        hash = Hashtables.make_hash_table(inference_datastructures_problem_store.problem_store_problem_count(store), Symbols.symbol_function(EQ), UNPROVIDED);
        dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_proof_depth_index(store), inference, hash);
      }
      Hashtables.sethash(problem, hash, depth);
    }
    return problem;
  }

  /** Primitively sets PROBLEM's transformation depth signature wrt INFERENCE to PQDS. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 50898) 
  public static final SubLObject set_problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference, SubLObject pqds) {
    checkType(problem, $sym1$PROBLEM_P);
    checkType(inference, $sym192$INFERENCE_P);
    checkType(pqds, $sym193$PROBLEM_QUERY_DEPTH_SIGNATURE_P);
    {
      SubLObject store = problem_store(problem);
      SubLObject hash = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, UNPROVIDED);
      if ((NIL == hash)) {
        hash = Hashtables.make_hash_table(inference_datastructures_problem_store.problem_store_problem_count(store), Symbols.symbol_function(EQ), UNPROVIDED);
        dictionary.dictionary_enter(inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store), inference, hash);
      }
      Hashtables.sethash(problem, hash, pqds);
    }
    {
      SubLObject depth = inference_min_transformation_depth.min_transformation_depth_from_signature(pqds);
      inference_datastructures_inference.inference_note_transformation_depth(inference, depth);
    }
    return problem;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 51774) 
  public static final SubLObject set_root_problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference) {
    {
      SubLObject problem_query = problem_query(problem);
      SubLObject initial_pqds = inference_min_transformation_depth.new_initial_pqds(problem_query, UNPROVIDED);
      return set_problem_min_transformation_depth_signature(problem, inference, initial_pqds);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 52608) 
  public static final SubLObject note_problem_min_transformation_depth_signature(SubLObject problem, SubLObject inference, SubLObject new_pqds) {
    {
      SubLObject old_pqds = problem_min_transformation_depth_signature(problem, inference);
      SubLObject updated_pqds = (($kw183$UNDETERMINED == old_pqds) ? ((SubLObject) new_pqds) : inference_min_transformation_depth.pqds_merge(old_pqds, new_pqds));
      if ((!(old_pqds.equal(updated_pqds)))) {
        set_problem_min_transformation_depth_signature(problem, inference, updated_pqds);
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53246) 
  public static final SubLObject tactically_good_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.good_problem_status_p(problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53359) 
  public static final SubLObject tactically_no_good_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.no_good_problem_status_p(problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 53917) 
  public static final SubLObject tactically_unexamined_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.unexamined_problem_status_p(problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54042) 
  public static final SubLObject tactically_examined_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.examined_problem_status_p(problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54163) 
  public static final SubLObject tactically_possible_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.possible_problem_status_p(problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54284) 
  public static final SubLObject tactically_pending_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.pending_problem_status_p(problem_status(problem));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem.lisp", position = 54403) 
  public static final SubLObject tactically_finished_problem_p(SubLObject problem) {
    return inference_datastructures_enumerated_types.finished_problem_status_p(problem_status(problem));
  }

  public static final SubLObject declare_inference_datastructures_problem_file() {
    declareFunction(myName, "problem_print_function_trampoline", "PROBLEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "problem_p", "PROBLEM-P", 1, 0, false); new $problem_p$UnaryFunction();
    declareFunction(myName, "prob_suid", "PROB-SUID", 1, 0, false);
    declareFunction(myName, "prob_store", "PROB-STORE", 1, 0, false);
    declareFunction(myName, "prob_query", "PROB-QUERY", 1, 0, false);
    declareFunction(myName, "prob_status", "PROB-STATUS", 1, 0, false);
    declareFunction(myName, "prob_dependent_links", "PROB-DEPENDENT-LINKS", 1, 0, false);
    declareFunction(myName, "prob_argument_links", "PROB-ARGUMENT-LINKS", 1, 0, false);
    declareFunction(myName, "prob_tactics", "PROB-TACTICS", 1, 0, false);
    declareFunction(myName, "prob_proof_bindings_index", "PROB-PROOF-BINDINGS-INDEX", 1, 0, false);
    declareFunction(myName, "prob_argument_link_bindings_index", "PROB-ARGUMENT-LINK-BINDINGS-INDEX", 1, 0, false);
    declareFunction(myName, "_csetf_prob_suid", "_CSETF-PROB-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store", "_CSETF-PROB-STORE", 2, 0, false);
    declareFunction(myName, "_csetf_prob_query", "_CSETF-PROB-QUERY", 2, 0, false);
    declareFunction(myName, "_csetf_prob_status", "_CSETF-PROB-STATUS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_dependent_links", "_CSETF-PROB-DEPENDENT-LINKS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_argument_links", "_CSETF-PROB-ARGUMENT-LINKS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_tactics", "_CSETF-PROB-TACTICS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_proof_bindings_index", "_CSETF-PROB-PROOF-BINDINGS-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_argument_link_bindings_index", "_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX", 2, 0, false);
    declareFunction(myName, "make_problem", "MAKE-PROBLEM", 0, 1, false);
    declareFunction(myName, "valid_problem_p", "VALID-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "problem_invalid_p", "PROBLEM-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_problem", "PRINT-PROBLEM", 3, 0, false);
    declareFunction(myName, "sxhash_problem_method", "SXHASH-PROBLEM-METHOD", 1, 0, false); new $sxhash_problem_method$UnaryFunction();
    declareFunction(myName, "new_problem", "NEW-PROBLEM", 2, 0, false);
    declareMacro(myName, "do_problem_literals", "DO-PROBLEM-LITERALS");
    declareMacro(myName, "do_problem_tactics", "DO-PROBLEM-TACTICS");
    declareFunction(myName, "problem_tactics", "PROBLEM-TACTICS", 1, 0, false);
    declareFunction(myName, "do_problem_tactics_status_match", "DO-PROBLEM-TACTICS-STATUS-MATCH", 2, 0, false);
    declareFunction(myName, "do_problem_tactics_completeness_match", "DO-PROBLEM-TACTICS-COMPLETENESS-MATCH", 2, 0, false);
    declareFunction(myName, "do_problem_tactics_preference_level_match", "DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH", 2, 0, false);
    declareFunction(myName, "do_problem_tactics_productivity_match", "DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH", 2, 0, false);
    declareFunction(myName, "do_problem_tactics_hl_module_match", "DO-PROBLEM-TACTICS-HL-MODULE-MATCH", 2, 0, false);
    declareFunction(myName, "generalized_tactic_type_p", "GENERALIZED-TACTIC-TYPE-P", 1, 0, false);
    declareFunction(myName, "do_problem_tactics_type_match", "DO-PROBLEM-TACTICS-TYPE-MATCH", 2, 0, false);
    declareFunction(myName, "tactic_matches_type_specP", "TACTIC-MATCHES-TYPE-SPEC?", 2, 0, false);
    declareFunction(myName, "tactic_matches_any_of_type_specsP", "TACTIC-MATCHES-ANY-OF-TYPE-SPECS?", 2, 0, false);
    declareFunction(myName, "problem_argument_links", "PROBLEM-ARGUMENT-LINKS", 1, 0, false);
    declareFunction(myName, "problem_all_argument_links", "PROBLEM-ALL-ARGUMENT-LINKS", 1, 0, false);
    declareMacro(myName, "do_problem_dependent_links", "DO-PROBLEM-DEPENDENT-LINKS");
    declareFunction(myName, "problem_dependent_links", "PROBLEM-DEPENDENT-LINKS", 1, 0, false);
    declareFunction(myName, "problem_all_dependent_links", "PROBLEM-ALL-DEPENDENT-LINKS", 1, 0, false);
    declareMacro(myName, "do_problem_dependent_link_interpretations", "DO-PROBLEM-DEPENDENT-LINK-INTERPRETATIONS");
    declareMacro(myName, "do_problem_supported_problems", "DO-PROBLEM-SUPPORTED-PROBLEMS");
    declareMacro(myName, "do_problem_supported_inferences", "DO-PROBLEM-SUPPORTED-INFERENCES");
    declareMacro(myName, "do_problem_supporting_problems", "DO-PROBLEM-SUPPORTING-PROBLEMS");
    declareMacro(myName, "do_problem_proofs", "DO-PROBLEM-PROOFS");
    declareFunction(myName, "problem_proof_bindings_index", "PROBLEM-PROOF-BINDINGS-INDEX", 1, 0, false);
    declareFunction(myName, "proof_has_statusP", "PROOF-HAS-STATUS?", 2, 0, false);
    declareMacro(myName, "do_problem_active_inferences", "DO-PROBLEM-ACTIVE-INFERENCES");
    declareMacro(myName, "do_problem_relevant_inferences", "DO-PROBLEM-RELEVANT-INFERENCES");
    declareMacro(myName, "do_problem_active_strategies", "DO-PROBLEM-ACTIVE-STRATEGIES");
    declareMacro(myName, "do_problem_relevant_strategies", "DO-PROBLEM-RELEVANT-STRATEGIES");
    declareMacro(myName, "do_problem_relevant_strategic_contexts", "DO-PROBLEM-RELEVANT-STRATEGIC-CONTEXTS");
    declareFunction(myName, "destroy_problem", "DESTROY-PROBLEM", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_problem", "DESTROY-PROBLEM-STORE-PROBLEM", 1, 0, false);
    declareFunction(myName, "destroy_problem_int", "DESTROY-PROBLEM-INT", 1, 0, false);
    declareFunction(myName, "note_problem_invalid", "NOTE-PROBLEM-INVALID", 1, 0, false);
    declareFunction(myName, "problem_suid", "PROBLEM-SUID", 1, 0, false);
    declareFunction(myName, "problem_store", "PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "problem_query", "PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "problem_status", "PROBLEM-STATUS", 1, 0, false);
    declareFunction(myName, "set_problem_status", "SET-PROBLEM-STATUS", 2, 0, false);
    declareFunction(myName, "problem_formula", "PROBLEM-FORMULA", 1, 0, false);
    declareFunction(myName, "problem_el_formula", "PROBLEM-EL-FORMULA", 1, 0, false);
    declareFunction(myName, "closed_problem_p", "CLOSED-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "open_problem_p", "OPEN-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "closed_problem_query_p", "CLOSED-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "open_problem_query_p", "OPEN-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "closed_single_literal_problem_query_p", "CLOSED-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "open_single_literal_problem_query_p", "OPEN-SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "problem_variables", "PROBLEM-VARIABLES", 1, 0, false);
    declareFunction(myName, "problem_literal_count", "PROBLEM-LITERAL-COUNT", 1, 1, false);
    declareFunction(myName, "problem_query_literal_count", "PROBLEM-QUERY-LITERAL-COUNT", 1, 1, false);
    declareFunction(myName, "single_literal_problem_p", "SINGLE-LITERAL-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "single_literal_problem_predicate", "SINGLE-LITERAL-PROBLEM-PREDICATE", 1, 0, false);
    declareFunction(myName, "single_literal_problem_atomic_sentence", "SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE", 1, 0, false);
    declareFunction(myName, "single_literal_problem_mt", "SINGLE-LITERAL-PROBLEM-MT", 1, 0, false);
    declareFunction(myName, "single_literal_problem_sense", "SINGLE-LITERAL-PROBLEM-SENSE", 1, 0, false);
    declareFunction(myName, "mt_asent_sense_from_single_literal_problem", "MT-ASENT-SENSE-FROM-SINGLE-LITERAL-PROBLEM", 1, 0, false);
    declareFunction(myName, "single_clause_problem_p", "SINGLE-CLAUSE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "conjunctive_problem_p", "CONJUNCTIVE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "ist_problem_p", "IST-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "join_problem_p", "JOIN-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "split_problem_p", "SPLIT-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "multi_literal_problem_p", "MULTI-LITERAL-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "disjunctive_problem_p", "DISJUNCTIVE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "multi_clause_problem_p", "MULTI-CLAUSE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "multi_clause_problem_query_p", "MULTI-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "problem_sole_clause", "PROBLEM-SOLE-CLAUSE", 1, 0, false);
    declareFunction(myName, "problem_query_sole_clause", "PROBLEM-QUERY-SOLE-CLAUSE", 1, 0, false);
    declareFunction(myName, "problem_in_equality_reasoning_domainP", "PROBLEM-IN-EQUALITY-REASONING-DOMAIN?", 1, 0, false);
    declareFunction(myName, "problem_relevant_to_some_inferenceP", "PROBLEM-RELEVANT-TO-SOME-INFERENCE?", 1, 0, false);
    declareFunction(myName, "first_problem_relevant_inference", "FIRST-PROBLEM-RELEVANT-INFERENCE", 1, 0, false);
    declareFunction(myName, "problem_relevant_to_only_one_inferenceP", "PROBLEM-RELEVANT-TO-ONLY-ONE-INFERENCE?", 1, 0, false);
    declareFunction(myName, "problem_relevant_to_inferenceP", "PROBLEM-RELEVANT-TO-INFERENCE?", 2, 0, false);
    declareFunction(myName, "problem_relevant_to_strategyP", "PROBLEM-RELEVANT-TO-STRATEGY?", 2, 0, false);
    declareFunction(myName, "problem_relevant_strategies", "PROBLEM-RELEVANT-STRATEGIES", 1, 0, false);
    declareFunction(myName, "problem_active_in_some_strategyP", "PROBLEM-ACTIVE-IN-SOME-STRATEGY?", 1, 0, false);
    declareFunction(myName, "first_problem_active_strategy", "FIRST-PROBLEM-ACTIVE-STRATEGY", 1, 0, false);
    declareFunction(myName, "problem_argument_link_count", "PROBLEM-ARGUMENT-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_argument_link_of_type_count", "PROBLEM-ARGUMENT-LINK-OF-TYPE-COUNT", 2, 0, false);
    declareFunction(myName, "problem_has_argument_link_p", "PROBLEM-HAS-ARGUMENT-LINK-P", 1, 0, false);
    declareFunction(myName, "problem_has_argument_link_of_typeP", "PROBLEM-HAS-ARGUMENT-LINK-OF-TYPE?", 2, 0, false);
    declareFunction(myName, "problem_first_argument_link_of_type", "PROBLEM-FIRST-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
    declareFunction(myName, "problem_sole_argument_link_of_type", "PROBLEM-SOLE-ARGUMENT-LINK-OF-TYPE", 2, 0, false);
    declareFunction(myName, "problem_all_argument_links_have_typeP", "PROBLEM-ALL-ARGUMENT-LINKS-HAVE-TYPE?", 2, 0, false);
    declareFunction(myName, "problem_has_supporting_problem_p", "PROBLEM-HAS-SUPPORTING-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "all_problem_argument_problems", "ALL-PROBLEM-ARGUMENT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "all_problem_argument_problems_recursive", "ALL-PROBLEM-ARGUMENT-PROBLEMS-RECURSIVE", 2, 0, false);
    declareFunction(myName, "problem_dependent_link_count", "PROBLEM-DEPENDENT-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_sole_dependent_link", "PROBLEM-SOLE-DEPENDENT-LINK", 1, 0, false);
    declareFunction(myName, "problem_has_dependent_link_p", "PROBLEM-HAS-DEPENDENT-LINK-P", 1, 0, false);
    declareFunction(myName, "problem_has_dependent_link_of_typeP", "PROBLEM-HAS-DEPENDENT-LINK-OF-TYPE?", 2, 0, false);
    declareFunction(myName, "problem_has_answer_link_p", "PROBLEM-HAS-ANSWER-LINK-P", 1, 0, false);
    declareFunction(myName, "problem_has_non_answer_dependent_link_p", "PROBLEM-HAS-NON-ANSWER-DEPENDENT-LINK-P", 1, 0, false);
    declareFunction(myName, "problem_has_only_non_abducible_rule_transformation_dependent_linksP", "PROBLEM-HAS-ONLY-NON-ABDUCIBLE-RULE-TRANSFORMATION-DEPENDENT-LINKS?", 1, 0, false);
    declareFunction(myName, "problem_supported_problems", "PROBLEM-SUPPORTED-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_supported_problem_count", "PROBLEM-SUPPORTED-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_next_tactic_suid", "PROBLEM-NEXT-TACTIC-SUID", 1, 0, false);
    declareFunction(myName, "problem_tactic_count", "PROBLEM-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_tactic_count_with_hl_module", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE", 2, 0, false);
    declareFunction(myName, "problem_tactic_count_with_hl_module_and_status", "PROBLEM-TACTIC-COUNT-WITH-HL-MODULE-AND-STATUS", 3, 0, false);
    declareFunction(myName, "problem_possible_tactics", "PROBLEM-POSSIBLE-TACTICS", 1, 0, false);
    declareFunction(myName, "problem_has_possible_tacticsP", "PROBLEM-HAS-POSSIBLE-TACTICS?", 1, 0, false);
    declareFunction(myName, "problem_no_tactics_possibleP", "PROBLEM-NO-TACTICS-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "problem_executed_tactics", "PROBLEM-EXECUTED-TACTICS", 1, 0, false);
    declareFunction(myName, "problem_discarded_tactics", "PROBLEM-DISCARDED-TACTICS", 1, 0, false);
    declareFunction(myName, "problem_possible_tactic_count", "PROBLEM-POSSIBLE-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_executed_tactic_count", "PROBLEM-EXECUTED-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_discarded_tactic_count", "PROBLEM-DISCARDED-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_tactic_of_type_with_status_count", "PROBLEM-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
    declareFunction(myName, "problem_tactic_with_status_count", "PROBLEM-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
    declareFunction(myName, "problem_has_tactic_of_type_with_statusP", "PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?", 2, 1, false);
    declareFunction(myName, "problem_has_tactic_of_typeP", "PROBLEM-HAS-TACTIC-OF-TYPE?", 2, 0, false);
    declareFunction(myName, "problem_has_removal_tacticsP", "PROBLEM-HAS-REMOVAL-TACTICS?", 1, 0, false);
    declareFunction(myName, "problem_has_transformation_tacticsP", "PROBLEM-HAS-TRANSFORMATION-TACTICS?", 1, 0, false);
    declareFunction(myName, "problem_has_possible_transformation_tacticsP", "PROBLEM-HAS-POSSIBLE-TRANSFORMATION-TACTICS?", 1, 0, false);
    declareFunction(myName, "problem_has_possible_removal_tacticP", "PROBLEM-HAS-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "problem_has_complete_possible_removal_tacticP", "PROBLEM-HAS-COMPLETE-POSSIBLE-REMOVAL-TACTIC?", 2, 0, false);
    declareFunction(myName, "problem_has_split_tacticsP", "PROBLEM-HAS-SPLIT-TACTICS?", 1, 0, false);
    declareFunction(myName, "problem_has_an_in_progress_tacticP", "PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
    declareFunction(myName, "any_problem_has_an_in_progress_tacticP", "ANY-PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?", 1, 0, false);
    declareFunction(myName, "problem_has_no_logical_tacticsP", "PROBLEM-HAS-NO-LOGICAL-TACTICS?", 1, 0, false);
    declareFunction(myName, "problem_total_removal_productivity", "PROBLEM-TOTAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "problem_total_deductive_removal_productivity", "PROBLEM-TOTAL-DEDUCTIVE-REMOVAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "problem_total_actual_removal_productivity", "PROBLEM-TOTAL-ACTUAL-REMOVAL-PRODUCTIVITY", 1, 0, false);
    declareFunction(myName, "problem_possible_removal_tactics", "PROBLEM-POSSIBLE-REMOVAL-TACTICS", 1, 0, false);
    declareFunction(myName, "problem_executed_removal_tactic_productivities", "PROBLEM-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
    declareFunction(myName, "all_problem_proofs", "ALL-PROBLEM-PROOFS", 1, 1, false);
    declareFunction(myName, "problem_proof_count", "PROBLEM-PROOF-COUNT", 1, 1, false);
    declareFunction(myName, "problem_proven_proof_count", "PROBLEM-PROVEN-PROOF-COUNT", 1, 0, false);
    declareFunction(myName, "problem_has_some_proofP", "PROBLEM-HAS-SOME-PROOF?", 1, 1, false);
    declareFunction(myName, "problem_has_some_proven_proofP", "PROBLEM-HAS-SOME-PROVEN-PROOF?", 1, 0, false);
    declareFunction(myName, "problem_has_some_rejected_proofP", "PROBLEM-HAS-SOME-REJECTED-PROOF?", 1, 0, false);
    declareFunction(myName, "problem_proofs_lookup", "PROBLEM-PROOFS-LOOKUP", 2, 0, false);
    declareFunction(myName, "problem_argument_links_lookup", "PROBLEM-ARGUMENT-LINKS-LOOKUP", 2, 0, false);
    declareFunction(myName, "problem_indestructibleP", "PROBLEM-INDESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "problem_destructibleP", "PROBLEM-DESTRUCTIBLE?", 1, 0, false);
    declareFunction(myName, "problem_destructibility_status", "PROBLEM-DESTRUCTIBILITY-STATUS", 1, 0, false);
    declareFunction(myName, "problem_min_depth", "PROBLEM-MIN-DEPTH", 1, 0, false);
    declareFunction(myName, "problem_min_proof_depth", "PROBLEM-MIN-PROOF-DEPTH", 2, 0, false);
    declareFunction(myName, "problem_min_transformation_depth", "PROBLEM-MIN-TRANSFORMATION-DEPTH", 2, 0, false);
    declareFunction(myName, "problem_min_transformation_depth_signature", "PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
    declareFunction(myName, "add_problem_argument_link", "ADD-PROBLEM-ARGUMENT-LINK", 2, 0, false);
    declareFunction(myName, "remove_problem_argument_link", "REMOVE-PROBLEM-ARGUMENT-LINK", 2, 0, false);
    declareFunction(myName, "index_problem_argument_link", "INDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
    declareFunction(myName, "deindex_problem_argument_link", "DEINDEX-PROBLEM-ARGUMENT-LINK", 2, 0, false);
    declareFunction(myName, "add_problem_dependent_link", "ADD-PROBLEM-DEPENDENT-LINK", 2, 0, false);
    declareFunction(myName, "remove_problem_dependent_link", "REMOVE-PROBLEM-DEPENDENT-LINK", 2, 0, false);
    declareFunction(myName, "add_problem_tactic", "ADD-PROBLEM-TACTIC", 2, 0, false);
    declareFunction(myName, "remove_problem_tactic", "REMOVE-PROBLEM-TACTIC", 2, 0, false);
    declareFunction(myName, "add_problem_proof", "ADD-PROBLEM-PROOF", 2, 0, false);
    declareFunction(myName, "remove_problem_proof", "REMOVE-PROBLEM-PROOF", 2, 0, false);
    declareFunction(myName, "remove_problem_proof_with_bindings", "REMOVE-PROBLEM-PROOF-WITH-BINDINGS", 3, 0, false);
    declareFunction(myName, "set_problem_min_depth", "SET-PROBLEM-MIN-DEPTH", 2, 0, false);
    declareFunction(myName, "set_problem_min_proof_depth", "SET-PROBLEM-MIN-PROOF-DEPTH", 3, 0, false);
    declareFunction(myName, "set_problem_min_transformation_depth", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH", 3, 0, false);
    declareFunction(myName, "set_problem_min_transformation_depth_signature", "SET-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
    declareFunction(myName, "set_root_problem_min_transformation_depth_signature", "SET-ROOT-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 2, 0, false);
    declareFunction(myName, "note_problem_indestructible", "NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
    declareFunction(myName, "note_problem_destructible", "NOTE-PROBLEM-DESTRUCTIBLE", 1, 0, false);
    declareFunction(myName, "note_problem_min_transformation_depth_signature", "NOTE-PROBLEM-MIN-TRANSFORMATION-DEPTH-SIGNATURE", 3, 0, false);
    declareFunction(myName, "problem_tactical_provability_status", "PROBLEM-TACTICAL-PROVABILITY-STATUS", 1, 0, false);
    declareFunction(myName, "tactically_good_problem_p", "TACTICALLY-GOOD-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_no_good_problem_p", "TACTICALLY-NO-GOOD-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_neutral_problem_p", "TACTICALLY-NEUTRAL-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "problem_tactical_status", "PROBLEM-TACTICAL-STATUS", 1, 0, false);
    declareFunction(myName, "tactically_new_problem_p", "TACTICALLY-NEW-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_unexamined_problem_p", "TACTICALLY-UNEXAMINED-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_examined_problem_p", "TACTICALLY-EXAMINED-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_possible_problem_p", "TACTICALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_pending_problem_p", "TACTICALLY-PENDING-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_finished_problem_p", "TACTICALLY-FINISHED-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactical_problem_p", "TACTICAL-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_potentially_possible_problem_p", "TACTICALLY-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "tactically_not_potentially_possible_problem_p", "TACTICALLY-NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 1, 0, false);
    declareFunction(myName, "problem_store_all_modules", "PROBLEM-STORE-ALL-MODULES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_problem_file() {
    $dtp_problem$ = defconstant("*DTP-PROBLEM*", $sym0$PROBLEM);
    $empty_clauses$ = deflexical("*EMPTY-CLAUSES*", maybeDefault( $sym46$_EMPTY_CLAUSES_, $empty_clauses$, ()-> (list(clauses.empty_clause()))));
    $generalized_tactic_types$ = deflexical("*GENERALIZED-TACTIC-TYPES*", $list75);
    $transformation_depth_computation$ = defvar("*TRANSFORMATION-DEPTH-COMPUTATION*", $kw184$COUNTERINTUITIVE);
    $problem_min_transformation_depth_from_signature_enabledP$ = defparameter("*PROBLEM-MIN-TRANSFORMATION-DEPTH-FROM-SIGNATURE-ENABLED?*", T);
    $max_problem_tactics$ = deflexical("*MAX-PROBLEM-TACTICS*", $int186$10000);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_problem_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), Symbols.symbol_function($sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$PROB_SUID, $sym10$_CSETF_PROB_SUID);
    Structures.def_csetf($sym11$PROB_STORE, $sym12$_CSETF_PROB_STORE);
    Structures.def_csetf($sym13$PROB_QUERY, $sym14$_CSETF_PROB_QUERY);
    Structures.def_csetf($sym15$PROB_STATUS, $sym16$_CSETF_PROB_STATUS);
    Structures.def_csetf($sym17$PROB_DEPENDENT_LINKS, $sym18$_CSETF_PROB_DEPENDENT_LINKS);
    Structures.def_csetf($sym19$PROB_ARGUMENT_LINKS, $sym20$_CSETF_PROB_ARGUMENT_LINKS);
    Structures.def_csetf($sym21$PROB_TACTICS, $sym22$_CSETF_PROB_TACTICS);
    Structures.def_csetf($sym23$PROB_PROOF_BINDINGS_INDEX, $sym24$_CSETF_PROB_PROOF_BINDINGS_INDEX);
    Structures.def_csetf($sym25$PROB_ARGUMENT_LINK_BINDINGS_INDEX, $sym26$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX);
    Equality.identity($sym0$PROBLEM);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem$.getGlobalValue(), Symbols.symbol_function($sym40$SXHASH_PROBLEM_METHOD));
    subl_macro_promotions.declare_defglobal($sym46$_EMPTY_CLAUSES_);
    access_macros.register_macro_helper($sym67$PROBLEM_TACTICS, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym61$DO_PROBLEM_TACTICS_STATUS_MATCH, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym62$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym63$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym65$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym64$DO_PROBLEM_TACTICS_HL_MODULE_MATCH, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym60$DO_PROBLEM_TACTICS_TYPE_MATCH, $sym68$DO_PROBLEM_TACTICS);
    access_macros.register_macro_helper($sym92$PROBLEM_ARGUMENT_LINKS, $sym93$DO_PROBLEM_ARGUMENT_LINKS);
    access_macros.register_macro_helper($sym97$PROBLEM_DEPENDENT_LINKS, $sym98$DO_PROBLEM_DEPENDENT_LINKS);
    access_macros.register_macro_helper($sym122$PROBLEM_PROOF_BINDINGS_INDEX, $sym125$DO_PROBLEM_PROOFS);
    access_macros.register_macro_helper($sym126$PROOF_HAS_STATUS_, $sym125$DO_PROBLEM_PROOFS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$PROBLEM = makeSymbol("PROBLEM");
  public static final SubLSymbol $sym1$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLInteger $int2$212 = makeInteger(212);
  public static final SubLList $list3 = list(new SubLObject[] {makeSymbol("SUID"), makeSymbol("STORE"), makeSymbol("QUERY"), makeSymbol("STATUS"), makeSymbol("DEPENDENT-LINKS"), makeSymbol("ARGUMENT-LINKS"), makeSymbol("TACTICS"), makeSymbol("PROOF-BINDINGS-INDEX"), makeSymbol("ARGUMENT-LINK-BINDINGS-INDEX")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("SUID"), makeKeyword("STORE"), makeKeyword("QUERY"), makeKeyword("STATUS"), makeKeyword("DEPENDENT-LINKS"), makeKeyword("ARGUMENT-LINKS"), makeKeyword("TACTICS"), makeKeyword("PROOF-BINDINGS-INDEX"), makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("PROB-SUID"), makeSymbol("PROB-STORE"), makeSymbol("PROB-QUERY"), makeSymbol("PROB-STATUS"), makeSymbol("PROB-DEPENDENT-LINKS"), makeSymbol("PROB-ARGUMENT-LINKS"), makeSymbol("PROB-TACTICS"), makeSymbol("PROB-PROOF-BINDINGS-INDEX"), makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("_CSETF-PROB-SUID"), makeSymbol("_CSETF-PROB-STORE"), makeSymbol("_CSETF-PROB-QUERY"), makeSymbol("_CSETF-PROB-STATUS"), makeSymbol("_CSETF-PROB-DEPENDENT-LINKS"), makeSymbol("_CSETF-PROB-ARGUMENT-LINKS"), makeSymbol("_CSETF-PROB-TACTICS"), makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX"), makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX")});
  public static final SubLSymbol $sym7$PRINT_PROBLEM = makeSymbol("PRINT-PROBLEM");
  public static final SubLSymbol $sym8$PROBLEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$PROB_SUID = makeSymbol("PROB-SUID");
  public static final SubLSymbol $sym10$_CSETF_PROB_SUID = makeSymbol("_CSETF-PROB-SUID");
  public static final SubLSymbol $sym11$PROB_STORE = makeSymbol("PROB-STORE");
  public static final SubLSymbol $sym12$_CSETF_PROB_STORE = makeSymbol("_CSETF-PROB-STORE");
  public static final SubLSymbol $sym13$PROB_QUERY = makeSymbol("PROB-QUERY");
  public static final SubLSymbol $sym14$_CSETF_PROB_QUERY = makeSymbol("_CSETF-PROB-QUERY");
  public static final SubLSymbol $sym15$PROB_STATUS = makeSymbol("PROB-STATUS");
  public static final SubLSymbol $sym16$_CSETF_PROB_STATUS = makeSymbol("_CSETF-PROB-STATUS");
  public static final SubLSymbol $sym17$PROB_DEPENDENT_LINKS = makeSymbol("PROB-DEPENDENT-LINKS");
  public static final SubLSymbol $sym18$_CSETF_PROB_DEPENDENT_LINKS = makeSymbol("_CSETF-PROB-DEPENDENT-LINKS");
  public static final SubLSymbol $sym19$PROB_ARGUMENT_LINKS = makeSymbol("PROB-ARGUMENT-LINKS");
  public static final SubLSymbol $sym20$_CSETF_PROB_ARGUMENT_LINKS = makeSymbol("_CSETF-PROB-ARGUMENT-LINKS");
  public static final SubLSymbol $sym21$PROB_TACTICS = makeSymbol("PROB-TACTICS");
  public static final SubLSymbol $sym22$_CSETF_PROB_TACTICS = makeSymbol("_CSETF-PROB-TACTICS");
  public static final SubLSymbol $sym23$PROB_PROOF_BINDINGS_INDEX = makeSymbol("PROB-PROOF-BINDINGS-INDEX");
  public static final SubLSymbol $sym24$_CSETF_PROB_PROOF_BINDINGS_INDEX = makeSymbol("_CSETF-PROB-PROOF-BINDINGS-INDEX");
  public static final SubLSymbol $sym25$PROB_ARGUMENT_LINK_BINDINGS_INDEX = makeSymbol("PROB-ARGUMENT-LINK-BINDINGS-INDEX");
  public static final SubLSymbol $sym26$_CSETF_PROB_ARGUMENT_LINK_BINDINGS_INDEX = makeSymbol("_CSETF-PROB-ARGUMENT-LINK-BINDINGS-INDEX");
  public static final SubLSymbol $kw27$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw28$STORE = makeKeyword("STORE");
  public static final SubLSymbol $kw29$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw30$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw31$DEPENDENT_LINKS = makeKeyword("DEPENDENT-LINKS");
  public static final SubLSymbol $kw32$ARGUMENT_LINKS = makeKeyword("ARGUMENT-LINKS");
  public static final SubLSymbol $kw33$TACTICS = makeKeyword("TACTICS");
  public static final SubLSymbol $kw34$PROOF_BINDINGS_INDEX = makeKeyword("PROOF-BINDINGS-INDEX");
  public static final SubLSymbol $kw35$ARGUMENT_LINK_BINDINGS_INDEX = makeKeyword("ARGUMENT-LINK-BINDINGS-INDEX");
  public static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw37$FREE = makeKeyword("FREE");
  public static final SubLString $str38$_Invalid_PROBLEM__s_ = makeString("<Invalid PROBLEM ~s>");
  public static final SubLString $str39$__a_PROBLEM__a__a__s_ = makeString("<~a PROBLEM ~a.~a:~s>");
  public static final SubLSymbol $sym40$SXHASH_PROBLEM_METHOD = makeSymbol("SXHASH-PROBLEM-METHOD");
  public static final SubLSymbol $sym41$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLSymbol $sym42$CONTEXTUALIZED_DNF_CLAUSES_P = makeSymbol("CONTEXTUALIZED-DNF-CLAUSES-P");
  public static final SubLString $str43$Ignore_the_crazy_problems = makeString("Ignore the crazy problems");
  public static final SubLString $str44$Crazy_amount_of_problems___a__in_ = makeString("Crazy amount of problems (~a) in store ~a");
  public static final SubLSymbol $kw45$NEW = makeKeyword("NEW");
  public static final SubLSymbol $sym46$_EMPTY_CLAUSES_ = makeSymbol("*EMPTY-CLAUSES*");
  public static final SubLList $list47 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list48 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw49$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw50$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym51$DO_PROBLEM_QUERY_LITERALS = makeSymbol("DO-PROBLEM-QUERY-LITERALS");
  public static final SubLSymbol $sym52$PROBLEM_QUERY = makeSymbol("PROBLEM-QUERY");
  public static final SubLList $list53 = list(list(new SubLObject[] {makeSymbol("TACTIC-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("STATUS"), makeSymbol("COMPLETENESS"), makeSymbol("PREFERENCE-LEVEL"), makeSymbol("HL-MODULE"), makeSymbol("TYPE"), makeSymbol("PRODUCTIVITY")}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list54 = list(makeKeyword("DONE"), makeKeyword("STATUS"), makeKeyword("COMPLETENESS"), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("HL-MODULE"), makeKeyword("TYPE"), makeKeyword("PRODUCTIVITY"));
  public static final SubLSymbol $kw55$COMPLETENESS = makeKeyword("COMPLETENESS");
  public static final SubLSymbol $kw56$PREFERENCE_LEVEL = makeKeyword("PREFERENCE-LEVEL");
  public static final SubLSymbol $kw57$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw58$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw59$PRODUCTIVITY = makeKeyword("PRODUCTIVITY");
  public static final SubLSymbol $sym60$DO_PROBLEM_TACTICS_TYPE_MATCH = makeSymbol("DO-PROBLEM-TACTICS-TYPE-MATCH");
  public static final SubLSymbol $sym61$DO_PROBLEM_TACTICS_STATUS_MATCH = makeSymbol("DO-PROBLEM-TACTICS-STATUS-MATCH");
  public static final SubLSymbol $sym62$DO_PROBLEM_TACTICS_COMPLETENESS_MATCH = makeSymbol("DO-PROBLEM-TACTICS-COMPLETENESS-MATCH");
  public static final SubLSymbol $sym63$DO_PROBLEM_TACTICS_PREFERENCE_LEVEL_MATCH = makeSymbol("DO-PROBLEM-TACTICS-PREFERENCE-LEVEL-MATCH");
  public static final SubLSymbol $sym64$DO_PROBLEM_TACTICS_HL_MODULE_MATCH = makeSymbol("DO-PROBLEM-TACTICS-HL-MODULE-MATCH");
  public static final SubLSymbol $sym65$DO_PROBLEM_TACTICS_PRODUCTIVITY_MATCH = makeSymbol("DO-PROBLEM-TACTICS-PRODUCTIVITY-MATCH");
  public static final SubLSymbol $sym66$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym67$PROBLEM_TACTICS = makeSymbol("PROBLEM-TACTICS");
  public static final SubLSymbol $sym68$DO_PROBLEM_TACTICS = makeSymbol("DO-PROBLEM-TACTICS");
  public static final SubLSymbol $sym69$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym70$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym71$COMPLETENESS_P = makeSymbol("COMPLETENESS-P");
  public static final SubLSymbol $sym72$PREFERENCE_LEVEL_P = makeSymbol("PREFERENCE-LEVEL-P");
  public static final SubLSymbol $sym73$PRODUCTIVITY_P = makeSymbol("PRODUCTIVITY-P");
  public static final SubLSymbol $sym74$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLList $list75 = list(new SubLObject[] {makeKeyword("NON-TRANSFORMATION"), makeKeyword("GENERALIZED-REMOVAL"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("CONNECTED-CONJUNCTION"), makeKeyword("CONJUNCTIVE"), makeKeyword("DISJUNCTIVE"), makeKeyword("LOGICAL"), makeKeyword("LOGICAL-CONJUNCTIVE"), makeKeyword("STRUCTURAL-CONJUNCTIVE"), makeKeyword("META-STRUCTURAL"), makeKeyword("CONTENT"), makeKeyword("UNION"), makeKeyword("SPLIT"), makeKeyword("JOIN-ORDERED"), makeKeyword("JOIN")});
  public static final SubLSymbol $sym76$GENERALIZED_TACTIC_TYPE_P = makeSymbol("GENERALIZED-TACTIC-TYPE-P");
  public static final SubLSymbol $kw77$NON_TRANSFORMATION = makeKeyword("NON-TRANSFORMATION");
  public static final SubLSymbol $kw78$GENERALIZED_REMOVAL = makeKeyword("GENERALIZED-REMOVAL");
  public static final SubLSymbol $kw79$GENERALIZED_REMOVAL_OR_REWRITE = makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE");
  public static final SubLSymbol $kw80$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");
  public static final SubLSymbol $kw81$CONJUNCTIVE = makeKeyword("CONJUNCTIVE");
  public static final SubLSymbol $kw82$DISJUNCTIVE = makeKeyword("DISJUNCTIVE");
  public static final SubLSymbol $kw83$LOGICAL = makeKeyword("LOGICAL");
  public static final SubLSymbol $kw84$LOGICAL_CONJUNCTIVE = makeKeyword("LOGICAL-CONJUNCTIVE");
  public static final SubLSymbol $kw85$STRUCTURAL_CONJUNCTIVE = makeKeyword("STRUCTURAL-CONJUNCTIVE");
  public static final SubLSymbol $kw86$META_STRUCTURAL = makeKeyword("META-STRUCTURAL");
  public static final SubLSymbol $kw87$CONTENT = makeKeyword("CONTENT");
  public static final SubLSymbol $kw88$UNION = makeKeyword("UNION");
  public static final SubLSymbol $kw89$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw90$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw91$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $sym92$PROBLEM_ARGUMENT_LINKS = makeSymbol("PROBLEM-ARGUMENT-LINKS");
  public static final SubLSymbol $sym93$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");
  public static final SubLList $list94 = list(list(makeSymbol("LINK-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list95 = list(makeKeyword("TYPE"), makeKeyword("DONE"));
  public static final SubLSymbol $sym96$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLSymbol $sym97$PROBLEM_DEPENDENT_LINKS = makeSymbol("PROBLEM-DEPENDENT-LINKS");
  public static final SubLSymbol $sym98$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");
  public static final SubLSymbol $sym99$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");
  public static final SubLList $list100 = list(list(makeSymbol("LINK-VAR"), makeSymbol("MAPPED-PROBLEM-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("OPEN?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list101 = list(makeKeyword("TYPE"), makeKeyword("OPEN?"), makeKeyword("DONE"));
  public static final SubLSymbol $kw102$OPEN_ = makeKeyword("OPEN?");
  public static final SubLSymbol $sym103$PROBLEM_VAR = makeUninternedSymbol("PROBLEM-VAR");
  public static final SubLSymbol $sym104$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym105$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
  public static final SubLSymbol $sym106$MAPPED_PROBLEM_PROBLEM = makeSymbol("MAPPED-PROBLEM-PROBLEM");
  public static final SubLList $list107 = list(list(makeSymbol("SUPPORTED-PROBLEM-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym108$LINK = makeUninternedSymbol("LINK");
  public static final SubLSymbol $sym109$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
  public static final SubLList $list110 = list(list(makeSymbol("SUPPORTED-INFERENCE-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym111$LINK = makeUninternedSymbol("LINK");
  public static final SubLSymbol $sym112$PROBLEM_LINK_SUPPORTED_INFERENCE = makeSymbol("PROBLEM-LINK-SUPPORTED-INFERENCE");
  public static final SubLList $list113 = list(list(makeSymbol("SUPPORTING-PROBLEM-VAR"), makeSymbol("VARIABLE-MAP-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym114$LINK = makeUninternedSymbol("LINK");
  public static final SubLSymbol $sym115$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
  public static final SubLList $list116 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list117 = list(makeKeyword("PROOF-STATUS"), makeKeyword("DONE"));
  public static final SubLSymbol $kw118$PROOF_STATUS = makeKeyword("PROOF-STATUS");
  public static final SubLSymbol $sym119$PROOF_LIST = makeUninternedSymbol("PROOF-LIST");
  public static final SubLSymbol $sym120$BINDINGS = makeUninternedSymbol("BINDINGS");
  public static final SubLSymbol $sym121$DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");
  public static final SubLSymbol $sym122$PROBLEM_PROOF_BINDINGS_INDEX = makeSymbol("PROBLEM-PROOF-BINDINGS-INDEX");
  public static final SubLSymbol $sym123$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym124$STATUS_VAR = makeUninternedSymbol("STATUS-VAR");
  public static final SubLSymbol $sym125$DO_PROBLEM_PROOFS = makeSymbol("DO-PROBLEM-PROOFS");
  public static final SubLSymbol $sym126$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
  public static final SubLList $list127 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym128$STRATEGY = makeUninternedSymbol("STRATEGY");
  public static final SubLSymbol $sym129$DO_PROBLEM_ACTIVE_STRATEGIES = makeSymbol("DO-PROBLEM-ACTIVE-STRATEGIES");
  public static final SubLSymbol $sym130$STRATEGY_INFERENCE = makeSymbol("STRATEGY-INFERENCE");
  public static final SubLList $list131 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym132$STORE = makeUninternedSymbol("STORE");
  public static final SubLSymbol $sym133$PROB = makeUninternedSymbol("PROB");
  public static final SubLSymbol $sym134$PROBLEM_STORE = makeSymbol("PROBLEM-STORE");
  public static final SubLSymbol $sym135$DO_PROBLEM_STORE_INFERENCES = makeSymbol("DO-PROBLEM-STORE-INFERENCES");
  public static final SubLSymbol $sym136$PROBLEM_RELEVANT_TO_INFERENCE_ = makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?");
  public static final SubLList $list137 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("PROBLEM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym138$STORE = makeUninternedSymbol("STORE");
  public static final SubLSymbol $sym139$PROB = makeUninternedSymbol("PROB");
  public static final SubLSymbol $sym140$DO_PROBLEM_STORE_STRATEGIES = makeSymbol("DO-PROBLEM-STORE-STRATEGIES");
  public static final SubLSymbol $sym141$PROBLEM_ACTIVE_IN_STRATEGY_ = makeSymbol("PROBLEM-ACTIVE-IN-STRATEGY?");
  public static final SubLList $list142 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym143$INFERENCE = makeUninternedSymbol("INFERENCE");
  public static final SubLSymbol $sym144$DO_PROBLEM_RELEVANT_INFERENCES = makeSymbol("DO-PROBLEM-RELEVANT-INFERENCES");
  public static final SubLSymbol $sym145$DO_INFERENCE_STRATEGIES = makeSymbol("DO-INFERENCE-STRATEGIES");
  public static final SubLList $list146 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym147$PROGN = makeSymbol("PROGN");
  public static final SubLList $list148 = list(makeKeyword("TACTICAL"));
  public static final SubLSymbol $sym149$DO_PROBLEM_RELEVANT_STRATEGIES = makeSymbol("DO-PROBLEM-RELEVANT-STRATEGIES");
  public static final SubLSymbol $kw150$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym151$PROBLEM_STATUS_P = makeSymbol("PROBLEM-STATUS-P");
  public static final SubLSymbol $kw152$NEG = makeKeyword("NEG");
  public static final SubLList $list153 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $kw154$POS = makeKeyword("POS");
  public static final SubLObject $const155$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLObject $const156$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLString $str157$The_problem__S_did_not_have_a_sin = makeString("The problem ~S did not have a single-clause query.");
  public static final SubLList $list158 = list(makeSymbol("DNF-CLAUSE"));
  public static final SubLString $str159$Found_more_than_one__a_argument_l = makeString("Found more than one ~a argument link on ~a");
  public static final SubLString $str160$Expected__a_to_have_a__a_argument = makeString("Expected ~a to have a ~a argument link");
  public static final SubLSymbol $sym161$PROBLEM_LINK_TYPE_P = makeSymbol("PROBLEM-LINK-TYPE-P");
  public static final SubLSymbol $sym162$_ = makeSymbol("<");
  public static final SubLSymbol $sym163$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
  public static final SubLString $str164$_a_had_more_than_one_dependent_li = makeString("~a had more than one dependent link");
  public static final SubLString $str165$_a_had_no_dependent_links = makeString("~a had no dependent links");
  public static final SubLSymbol $kw166$ANSWER = makeKeyword("ANSWER");
  public static final SubLSymbol $kw167$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $sym168$TACTIC_POSSIBLE_ = makeSymbol("TACTIC-POSSIBLE?");
  public static final SubLSymbol $sym169$TACTIC_EXECUTED_ = makeSymbol("TACTIC-EXECUTED?");
  public static final SubLSymbol $sym170$TACTIC_DISCARDED_ = makeSymbol("TACTIC-DISCARDED?");
  public static final SubLSymbol $kw171$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw172$EXECUTED = makeKeyword("EXECUTED");
  public static final SubLSymbol $kw173$DISCARDED = makeKeyword("DISCARDED");
  public static final SubLSymbol $sym174$TACTIC_STATUS_P = makeSymbol("TACTIC-STATUS-P");
  public static final SubLSymbol $sym175$STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");
  public static final SubLSymbol $kw176$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $sym177$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");
  public static final SubLSymbol $kw178$PROVEN = makeKeyword("PROVEN");
  public static final SubLSymbol $kw179$REJECTED = makeKeyword("REJECTED");
  public static final SubLSymbol $kw180$INDESTRUCTIBLE = makeKeyword("INDESTRUCTIBLE");
  public static final SubLSymbol $kw181$DESTRUCTIBLE = makeKeyword("DESTRUCTIBLE");
  public static final SubLSymbol $kw182$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $kw183$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $kw184$COUNTERINTUITIVE = makeKeyword("COUNTERINTUITIVE");
  public static final SubLSymbol $sym185$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
  public static final SubLInteger $int186$10000 = makeInteger(10000);
  public static final SubLSymbol $sym187$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLString $str188$Tried_to_add__s_to__s__which_woul = makeString("Tried to add ~s to ~s, which would result in more than ~s tactics on ~s");
  public static final SubLSymbol $sym189$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLSymbol $sym190$BINDINGS_P = makeSymbol("BINDINGS-P");
  public static final SubLSymbol $sym191$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym192$INFERENCE_P = makeSymbol("INFERENCE-P");
  public static final SubLSymbol $sym193$PROBLEM_QUERY_DEPTH_SIGNATURE_P = makeSymbol("PROBLEM-QUERY-DEPTH-SIGNATURE-P");
  public static final SubLSymbol $sym194$_ = makeSymbol(">");
  public static final SubLSymbol $sym195$CDR = makeSymbol("CDR");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_problem_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_problem_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_problem_file();
  }

}
