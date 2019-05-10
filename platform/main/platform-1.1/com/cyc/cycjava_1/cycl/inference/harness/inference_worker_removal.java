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
 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.meta_removal_modules;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.pattern_match;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_abduction;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_asserted_formula;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_conjunctive_pruning;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluation;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_isa;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_natfunction;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_reflexive_on;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_termofunit;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_tva_lookup;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.inference.modules.simplification_modules;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class inference_worker_removal extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_removal() {}
  public static final SubLFile me = new inference_worker_removal();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal";

  //// Definitions

  public static final class $removal_link_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $hl_module; }
    public SubLObject getField3() { return $bindings; }
    public SubLObject getField4() { return $supports; }
    public SubLObject setField2(SubLObject value) { return $hl_module = value; }
    public SubLObject setField3(SubLObject value) { return $bindings = value; }
    public SubLObject setField4(SubLObject value) { return $supports = value; }
    public SubLObject $hl_module = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $supports = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($removal_link_data_native.class, $sym0$REMOVAL_LINK_DATA, $sym1$REMOVAL_LINK_DATA_P, $list2, $list3, new String[] {"$hl_module", "$bindings", "$supports"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static SubLSymbol $dtp_removal_link_data$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject removal_link_data_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $removal_link_data_p$UnaryFunction extends UnaryFunction {
    public $removal_link_data_p$UnaryFunction() { super(extractFunctionNamed("REMOVAL-LINK-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36235"); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject remov_link_data_bindings(SubLObject object) {
    checkType(object, $sym1$REMOVAL_LINK_DATA_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject remov_link_data_supports(SubLObject object) {
    checkType(object, $sym1$REMOVAL_LINK_DATA_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject _csetf_remov_link_data_hl_module(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_LINK_DATA_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject _csetf_remov_link_data_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_LINK_DATA_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject _csetf_remov_link_data_supports(SubLObject object, SubLObject value) {
    checkType(object, $sym1$REMOVAL_LINK_DATA_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject make_removal_link_data(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $removal_link_data_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw14$HL_MODULE)) {
            _csetf_remov_link_data_hl_module(v_new, current_value);
          } else if (pcase_var.eql($kw15$BINDINGS)) {
            _csetf_remov_link_data_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw16$SUPPORTS)) {
            _csetf_remov_link_data_supports(v_new, current_value);
          } else {
            Errors.error($str17$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** @return removal-link-p
This is a link to goal by virtue of the fact that it has no supporting mapped problems. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1758) 
  public static final SubLObject new_removal_link(SubLObject problem, SubLObject hl_module, SubLObject removal_bindings, SubLObject supports) {
    checkType(problem, $sym18$PROBLEM_P);
    {
      SubLObject removal_link = new_removal_link_int(problem, hl_module, removal_bindings, supports);
      inference_worker.propagate_problem_link(removal_link);
      return removal_link;
    }
  }

  /** Returns a new :removal link
with its data properties set to HL-MODULE, BINDINGS, and SUPPORTS,
with a supported problem of PROBLEM, and no supporting problems yet. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2173) 
  public static final SubLObject new_removal_link_int(SubLObject problem, SubLObject hl_module, SubLObject removal_bindings, SubLObject supports) {
    {
      SubLObject removal_link = inference_datastructures_problem_link.new_problem_link($kw19$REMOVAL, problem);
      new_removal_link_data(removal_link);
      set_removal_link_hl_module(removal_link, hl_module);
      set_removal_link_bindings(removal_link, removal_bindings);
      set_removal_link_supports(removal_link, supports);
      inference_datastructures_problem.index_problem_argument_link(problem, removal_link);
      return removal_link;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2781) 
  public static final SubLObject new_removal_link_data(SubLObject removal_link) {
    {
      SubLObject data = make_removal_link_data(UNPROVIDED);
      inference_datastructures_problem_link.set_problem_link_data(removal_link, data);
    }
    return removal_link;
  }

  /** The first elements of these bindings are in the space of REMOVAL-LINK's
supported problem, and their second elements are in the space of
REMOVAL-LINK's unique supporting problem. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3583) 
  public static final SubLObject removal_link_bindings(SubLObject removal_link) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
      return remov_link_data_bindings(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3959) 
  public static final SubLObject removal_link_supports(SubLObject removal_link) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
      return remov_link_data_supports(data);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4152) 
  public static final SubLObject set_removal_link_hl_module(SubLObject removal_link, SubLObject hl_module) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    checkType(hl_module, $sym22$HL_MODULE_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
      _csetf_remov_link_data_hl_module(data, hl_module);
    }
    return removal_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4441) 
  public static final SubLObject set_removal_link_bindings(SubLObject removal_link, SubLObject v_bindings) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    checkType(v_bindings, $sym23$BINDING_LIST_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
      _csetf_remov_link_data_bindings(data, v_bindings);
    }
    return removal_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4716) 
  public static final SubLObject set_removal_link_supports(SubLObject removal_link, SubLObject supports) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    checkType(supports, $sym24$HL_JUSTIFICATION_P);
    if ((NIL != inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem_link.problem_link_store(removal_link)))) {
      {
        SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_supports(data, supports);
      }
    }
    return removal_link;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 6840) 
  public static final SubLObject removal_link_data_equals_specP(SubLObject removal_link, SubLObject removal_bindings, SubLObject supports) {
    {
      SubLObject link_removal_bindings = removal_link_bindings(removal_link);
      SubLObject link_supports = removal_link_supports(removal_link);
      return makeBoolean((removal_bindings.equal(link_removal_bindings)
             && (NIL != arguments.justification_equal(supports, link_supports))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7185) 
  public static final SubLObject generalized_removal_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != removal_tactic_p(object))
          || (NIL != conjunctive_removal_tactic_p(object))
          || (NIL != meta_removal_tactic_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7482) 
  public static final SubLObject conjunctive_removal_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(tactic))
           && ($kw27$REMOVAL_CONJUNCTIVE == inference_datastructures_tactic.tactic_type(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7653) 
  public static final SubLObject conjunctive_removal_link_p(SubLObject link) {
    return makeBoolean(((NIL != removal_link_p(link))
           && (NIL != inference_modules.conjunctive_removal_module_p(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36238")))));
  }

  /** Determines tactics which can solve all of the conjunctive problem PROBLEM at once. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7946) 
  public static final SubLObject determine_new_conjunctive_removal_tactics(SubLObject problem, SubLObject dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem)))) {
        return NIL;
      }
      {
        SubLObject supplanted_hl_modules = NIL;
        SubLObject tactic_specs = NIL;
        SubLObject exclusive_foundP = NIL;
        SubLObject common_mt = inference_czer.contextualized_dnf_clause_common_mt(dnf_clause);
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(common_mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            {
              SubLObject hl_modules = determine_applicable_conjunctive_removal_modules(dnf_clause);
              hl_modules = sort_applicable_conjunctive_removal_modules_by_priority(hl_modules);
              if ((NIL == exclusive_foundP)) {
                {
                  SubLObject csome_list_var = hl_modules;
                  SubLObject hl_module = NIL;
                  for (hl_module = csome_list_var.first(); (!(((NIL != exclusive_foundP)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), hl_module = csome_list_var.first()) {
                    if ((!(((NIL != supplanted_hl_modules)
                           && (NIL != conses_high.member(hl_module, supplanted_hl_modules, UNPROVIDED, UNPROVIDED)))))) {
                      {
                        SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                        if (((NIL == exclusive_func)
                            || (exclusive_func.isFunctionSpec()
                               && (NIL != Functions.funcall(exclusive_func, dnf_clause))))) {
                          if ((NIL != exclusive_func)) {
                            thread.resetMultipleValues();
                            {
                              SubLObject exclusive_foundP_4 = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36243");
                              SubLObject tactic_specs_5 = thread.secondMultipleValue();
                              SubLObject supplanted_hl_modules_6 = thread.thirdMultipleValue();
                              thread.resetMultipleValues();
                              exclusive_foundP = exclusive_foundP_4;
                              tactic_specs = tactic_specs_5;
                              supplanted_hl_modules = supplanted_hl_modules_6;
                            }
                          }
                          {
                            SubLObject cost = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36414");
                            if ((NIL != cost)) {
                              {
                                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                SubLObject completeness = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36413");
                                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                                tactic_specs = cons(tactic_spec, tactic_specs);
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
                SubLObject cdolist_list_var = tactic_specs;
                SubLObject tactic_spec = NIL;
                for (tactic_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic_spec = cdolist_list_var.first()) {
                  {
                    SubLObject datum = tactic_spec;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject productivity = NIL;
                    SubLObject completeness = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
                    hl_module = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
                    productivity = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
                    completeness = current.first();
                    current = current.rest();
                    if ((NIL == current)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36233");
                    } else {
                      cdestructuring_bind.cdestructuring_bind_error(datum, $list28);
                    }
                  }
                }
              }
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return tactic_specs;
      }
    }
  }

  /** Help determine-new-conjunctive-removal-tactics do better by ordering pruning modules before simplification modules and simplification modules before everything else.  This prevents an exclusive simplification module from trumping an exclusive pruning module, for example. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 9814) 
  public static final SubLObject sort_applicable_conjunctive_removal_modules_by_priority(SubLObject hl_modules) {
    return Sort.sort(hl_modules, $sym29$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 10241) 
  public static final SubLObject conjunctive_removal_module_priorityL(SubLObject hl_module1, SubLObject hl_module2) {
    if (((NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1))
         && (NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2)))) {
      return T;
    } else if (((NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2))
         && (NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1)))) {
      return NIL;
    } else if (((NIL != simplification_modules.simplification_module_p(hl_module1))
         && (NIL == simplification_modules.simplification_module_p(hl_module2)))) {
      return T;
    } else if (((NIL != simplification_modules.simplification_module_p(hl_module2))
         && (NIL == simplification_modules.simplification_module_p(hl_module1)))) {
      return NIL;
    } else {
      return T;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 10773) 
  public static final SubLObject determine_applicable_conjunctive_removal_modules(SubLObject contextualized_dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause);
        SubLObject applicable_modules = NIL;
        SubLObject set_contents_var = set.do_set_internal(inference_modules.removal_modules_conjunctive());
        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
        SubLObject state = NIL;
        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
          {
            SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, hl_module))) {
              if (((NIL == some_backchain_requiredP)
                  || (NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module))
                  || ((NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread))
                     && (NIL != simplification_modules.simplification_module_p(hl_module))))) {
                if ((NIL != inference_modules.hl_module_direction_relevantP(hl_module))) {
                  {
                    SubLObject new_subclause_specs = hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause);
                    SubLObject cdolist_list_var = new_subclause_specs;
                    SubLObject subclause_spec = NIL;
                    for (subclause_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first()) {
                      if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30281"))) {
                        applicable_modules = cons(hl_module, applicable_modules);
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return applicable_modules;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 12012) 
  public static final SubLObject motivated_multi_literal_subclause_specs(SubLObject contextualized_dnf_clause) {
    {
      SubLObject subclause_specs = NIL;
      if ((NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause))) {
        {
          SubLObject set_contents_var = set.do_set_internal(inference_modules.removal_modules_conjunctive());
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject hl_module = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, hl_module))) {
                if ((!(((NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module))
                      || (NIL != simplification_modules.simplification_module_p(hl_module)))))) {
                  if ((NIL != inference_modules.hl_module_direction_relevantP(hl_module))) {
                    {
                      SubLObject new_subclause_specs = hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause);
                      SubLObject cdolist_list_var = new_subclause_specs;
                      SubLObject subclause_spec = NIL;
                      for (subclause_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first()) {
                        if ((NIL == Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30282"))) {
                          {
                            SubLObject item_var = subclause_spec;
                            if ((NIL == conses_high.member(item_var, subclause_specs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                              subclause_specs = cons(item_var, subclause_specs);
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
      return Sequences.nreverse(subclause_specs);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 12893) 
  public static final SubLObject hl_module_applicable_subclause_specs(SubLObject hl_module, SubLObject contextualized_dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject every_predicates = inference_modules.hl_module_every_predicates(hl_module);
        SubLObject cdolist_list_var = every_predicates;
        SubLObject predicate = NIL;
        for (predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), predicate = cdolist_list_var.first()) {
          if ((NIL == inference_datastructures_problem_query.contextualized_clause_has_literal_with_predicateP(contextualized_dnf_clause, predicate))) {
            return NIL;
          }
        }
      }
      {
        SubLObject subclause_specs = NIL;
        SubLObject applicability_pattern = inference_modules.hl_module_applicability_pattern(hl_module);
        if ((NIL != applicability_pattern)) {
          subclause_specs = formula_pattern_match.pattern_transform_formula(applicability_pattern, contextualized_dnf_clause, UNPROVIDED);
        } else {
          {
            SubLObject applicability_method = inference_modules.hl_module_applicability_func(hl_module);
            if (applicability_method.isFunctionSpec()) {
              subclause_specs = Functions.funcall(applicability_method, contextualized_dnf_clause);
            }
          }
        }
        {
          SubLObject cdolist_list_var = subclause_specs;
          SubLObject subclause_spec = NIL;
          for (subclause_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subclause_spec = cdolist_list_var.first()) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30264"))) {
                Errors.error($str30$_s_stated_its_applicability_to_th, hl_module, subclause_spec);
              }
            }
          }
        }
        return subclause_specs;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 17200) 
  private static SubLSymbol $conjunctive_removal_tactic_expand_results_queue$ = null;

  /** Suppress the creation of a split link and child problems for conjunctive removals.  This can vastly reduce the number of problems and proofs for queries with excessive amounts of conjunctive removal. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 19337) 
  private static SubLSymbol $conjunctive_removal_suppress_split_justificationP$ = null;

  /** Temporary control variable, eventually should stay T.
   When non-nil, we skip the restriction/closed problem indirection for answers when we aren't computing justifications. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 19663) 
  public static SubLSymbol $conjunctive_removal_optimize_when_no_justificationsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 25769) 
  public static final SubLObject meta_removal_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
           && ($kw45$META_REMOVAL == inference_datastructures_tactic.tactic_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 26100) 
  public static final SubLObject removal_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw19$REMOVAL == inference_datastructures_problem_link.problem_link_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 26259) 
  public static final SubLObject removal_tactic_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
           && ($kw19$REMOVAL == inference_datastructures_tactic.tactic_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 26493) 
  public static final SubLObject removal_module_exclusive_func_funcall(SubLObject func, SubLObject asent, SubLObject sense) {
    return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 26818) 
  public static final SubLObject removal_module_required_func_funcall(SubLObject func, SubLObject asent, SubLObject sense) {
    {
      SubLObject pcase_var = func;
      if (pcase_var.eql($sym46$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED)) {
        return meta_removal_modules.meta_removal_completely_decidable_pos_required(asent, sense);
      } else if (pcase_var.eql($sym47$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED)) {
        return meta_removal_modules.meta_removal_completely_enumerable_pos_required(asent, sense);
      } else if (pcase_var.eql($sym48$REMOVAL_ABDUCTION_POS_REQUIRED)) {
        return removal_modules_abduction.removal_abduction_pos_required(asent, sense);
      } else if (pcase_var.eql($sym49$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED)) {
        return removal_modules_function_corresponding_predicate.removal_evaluatable_fcp_unify_required(asent, sense);
      } else if (pcase_var.eql($sym50$REMOVAL_FCP_CHECK_REQUIRED)) {
        return removal_modules_function_corresponding_predicate.removal_fcp_check_required(asent, sense);
      } else if (pcase_var.eql($sym51$REMOVAL_ISA_DEFN_POS_REQUIRED)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32811");
      } else if (pcase_var.eql($sym52$REMOVAL_TVA_CHECK_REQUIRED)) {
        return removal_modules_tva_lookup.removal_tva_check_required(asent, sense);
      } else if (pcase_var.eql($sym53$REMOVAL_TVA_UNIFY_REQUIRED)) {
        return removal_modules_tva_lookup.removal_tva_unify_required(asent, sense);
      } else {
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 27807) 
  public static final SubLObject removal_module_expand_func_funcall(SubLObject func, SubLObject asent, SubLObject sense) {
    {
      SubLObject pcase_var = func;
      if (pcase_var.eql($sym54$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32642");
      } else if (pcase_var.eql($sym55$REMOVAL_EVAL_EXPAND)) {
        return removal_modules_evaluation.removal_eval_expand(asent, sense);
      } else if (pcase_var.eql($sym56$REMOVAL_EVALUATE_BIND_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1326");
      } else if (pcase_var.eql($sym57$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32809");
      } else if (pcase_var.eql($sym58$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND)) {
        return removal_modules_isa.removal_isa_collection_check_pos_expand(asent, sense);
      } else if (pcase_var.eql($sym59$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND)) {
        return removal_modules_natfunction.removal_nat_argument_lookup_expand(asent, sense);
      } else if (pcase_var.eql($sym60$REMOVAL_NAT_FORMULA_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32743");
      } else if (pcase_var.eql($sym61$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32771");
      } else if (pcase_var.eql($sym62$REMOVAL_NAT_LOOKUP_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32744");
      } else if (pcase_var.eql($sym63$REMOVAL_REFLEXIVE_ON_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32705");
      } else if (pcase_var.eql($sym64$REMOVAL_TVA_CHECK_EXPAND)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32696");
      } else {
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29055) 
  public static final SubLObject determine_new_literal_removal_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem)))) {
        return NIL;
      }
      {
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject tactics = NIL;
        SubLObject store_var = store;
        {
          SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
          try {
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            determine_new_literal_simple_removal_tactics(problem, asent, sense);
            determine_new_literal_meta_removal_tactics(problem, asent, sense);
          } finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
          }
        }
        return tactics;
      }
    }
  }

  /** Figure out all applicable inference meta removal tactics for ASENT with SENSE, and add them to PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29681) 
  public static final SubLObject determine_new_literal_meta_removal_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
    {
      SubLObject hl_modules = literal_meta_removal_candidate_hl_modules(asent, sense);
      return determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }
  }

  /** Figure out all applicable inference removal tactics for ASENT with SENSE, and add them to PROBLEM. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30044) 
  public static final SubLObject determine_new_literal_simple_removal_tactics(SubLObject problem, SubLObject asent, SubLObject sense) {
    {
      SubLObject hl_modules = literal_simple_removal_candidate_hl_modules(asent, sense);
      return determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }
  }

  /** Return a list of inference removal options for ASENT with SENSE. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30963) 
  public static final SubLObject literal_removal_options(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
    if ((allowed_modules_spec == UNPROVIDED)) {
      allowed_modules_spec = $kw65$ALL;
    }
    {
      SubLObject hl_modules = literal_removal_options_hl_modules(asent, sense, allowed_modules_spec);
      return determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 31864) 
  public static final SubLObject literal_removal_options_hl_modules(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
    {
      SubLObject candidate_hl_modules = literal_removal_options_candidate_hl_modules(asent, sense, allowed_modules_spec);
      return filter_modules_wrt_allowed_modules_spec(candidate_hl_modules, allowed_modules_spec);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 32167) 
  public static final SubLObject filter_modules_wrt_allowed_modules_spec(SubLObject candidate_hl_modules, SubLObject allowed_modules_spec) {
    {
      SubLObject hl_modules = NIL;
      if ((allowed_modules_spec == $kw65$ALL)) {
        hl_modules = candidate_hl_modules;
      } else {
        {
          SubLObject cdolist_list_var = candidate_hl_modules;
          SubLObject module = NIL;
          for (module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module = cdolist_list_var.first()) {
            if (((NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(module, allowed_modules_spec))
                || (NIL != inference_modules.hl_module_exclusive_func(module)))) {
              hl_modules = cons(module, hl_modules);
            }
          }
        }
        hl_modules = Sequences.nreverse(hl_modules);
      }
      return hl_modules;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 32725) 
  public static final SubLObject literal_removal_options_candidate_hl_modules(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
    if ((allowed_modules_spec == $kw65$ALL)) {
      return literal_simple_removal_candidate_hl_modules(asent, sense);
    } else if ((NIL != inference_modules.simple_allowed_modules_spec_p(allowed_modules_spec))) {
      return inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_spec);
    } else {
      return literal_simple_removal_candidate_hl_modules(asent, sense);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 33148) 
  public static final SubLObject hl_module_applicable_to_asentP(SubLObject hl_module, SubLObject asent) {
    return makeBoolean(((NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, cycl_utilities.atomic_sentence_predicate(asent)))
           && (NIL != inference_modules.hl_module_arity_relevant_p(hl_module, asent))
           && (NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent))
           && (NIL != inference_modules.hl_module_required_mt_relevantP(hl_module))
           && (NIL != inference_modules.hl_module_direction_relevantP(hl_module))));
  }

  /** Using HL-MODULES, figure out applicable inference removal tactics 
   for ASENT with SENSE, and add them to PROBLEM.
   HL-MODULES is a list of the applicable removal modules to try. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 33613) 
  public static final SubLObject determine_new_removal_tactics_from_hl_modules(SubLObject hl_modules, SubLObject problem, SubLObject asent, SubLObject sense) {
    {
      SubLObject tactic_specs = determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
      SubLObject cdolist_list_var = tactic_specs;
      SubLObject tactic_spec = NIL;
      for (tactic_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tactic_spec = cdolist_list_var.first()) {
        {
          SubLObject datum = tactic_spec;
          SubLObject current = datum;
          SubLObject hl_module = NIL;
          SubLObject productivity = NIL;
          SubLObject completeness = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
          hl_module = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
          productivity = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
          completeness = current.first();
          current = current.rest();
          if ((NIL == current)) {
            new_removal_tactic(problem, hl_module, productivity, completeness);
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list28);
          }
        }
      }
      return tactic_specs;
    }
  }

  /** Using HL-MODULES, figure out applicable inference removal tactic-specs 
   for ASENT with SENSE.
   HL-MODULES is a list of the applicable removal modules to try. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 34207) 
  public static final SubLObject determine_new_removal_tactic_specs_from_hl_modules(SubLObject hl_modules, SubLObject asent, SubLObject sense) {
    return hl_module_guts($kw66$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES, hl_modules, asent, sense, UNPROVIDED, UNPROVIDED);
  }

  /** map over the hl-modules, determining our tactics for this literal */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 34570) 
  public static final SubLObject determine_new_removal_tactic_specs_from_hl_modules_guts(SubLObject candidate_hl_modules, SubLObject asent, SubLObject sense) {
    {
      SubLObject applicable_hl_modules = determine_applicable_hl_modules_for_asent(candidate_hl_modules, asent, sense);
      SubLObject tactic_specs = compute_tactic_specs_for_asent(applicable_hl_modules, asent, sense);
      return tactic_specs;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 35250) 
  public static final SubLObject determine_applicable_hl_modules_for_asent(SubLObject candidate_hl_modules, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject supplanted_hl_modules = NIL;
        SubLObject applicable_hl_modules = NIL;
        SubLObject totally_exclusive_foundP = NIL;
        if ((NIL == totally_exclusive_foundP)) {
          {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = NIL;
            for (hl_module = csome_list_var.first(); (!(((NIL != totally_exclusive_foundP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), hl_module = csome_list_var.first()) {
              if ((NIL == inference_modules.hl_module_exclusive_func(hl_module))) {
                thread.resetMultipleValues();
                {
                  SubLObject totally_exclusive_foundP_10 = update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                  SubLObject applicable_hl_modules_11 = thread.secondMultipleValue();
                  SubLObject supplanted_hl_modules_12 = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  totally_exclusive_foundP = totally_exclusive_foundP_10;
                  applicable_hl_modules = applicable_hl_modules_11;
                  supplanted_hl_modules = supplanted_hl_modules_12;
                }
              }
            }
          }
        }
        if ((NIL == totally_exclusive_foundP)) {
          {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = NIL;
            for (hl_module = csome_list_var.first(); (!(((NIL != totally_exclusive_foundP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), hl_module = csome_list_var.first()) {
              if ((NIL != inference_modules.hl_module_exclusive_func(hl_module))) {
                thread.resetMultipleValues();
                {
                  SubLObject totally_exclusive_foundP_13 = update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                  SubLObject applicable_hl_modules_14 = thread.secondMultipleValue();
                  SubLObject supplanted_hl_modules_15 = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  totally_exclusive_foundP = totally_exclusive_foundP_13;
                  applicable_hl_modules = applicable_hl_modules_14;
                  supplanted_hl_modules = supplanted_hl_modules_15;
                }
              }
            }
          }
        }
        return applicable_hl_modules;
      }
    }
  }

  /** Determine if HL-MODULE applies to ASENT with SENSE 
   @return 0 boolean ; whether HL-MODULE is completely exclusive, allowing us to ignore checking other hl-modules.
   @return 1 applicable-hl-modules ; updated version of APPLICABLE-HL-MODULES
   @return 2 supplanted-hl-modules ; updated version of SUPPLANTED-HL-MODULES if HL-MODULE is at least partially exclusive. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36460) 
  public static final SubLObject update_applicable_hl_modules(SubLObject hl_module, SubLObject asent, SubLObject sense, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject totally_exclusive_foundP = NIL;
        if ((!(((NIL != supplanted_hl_modules)
               && (NIL != list_utilities.member_eqP(hl_module, supplanted_hl_modules)))))) {
          if ((NIL != hl_module_applicable_to_asentP(hl_module, asent))) {
            {
              SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
              if (((NIL == exclusive_func)
                  || ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(exclusive_func))
                     && (NIL != removal_module_exclusive_func_funcall(exclusive_func, asent, sense))))) {
                if ((NIL != exclusive_func)) {
                  thread.resetMultipleValues();
                  {
                    SubLObject totally_exclusive_foundP_16 = update_supplanted_hl_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
                    SubLObject applicable_hl_modules_17 = thread.secondMultipleValue();
                    SubLObject supplanted_hl_modules_18 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_16;
                    applicable_hl_modules = applicable_hl_modules_17;
                    supplanted_hl_modules = supplanted_hl_modules_18;
                  }
                }
                {
                  SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
                  if (((NIL == required_func)
                      || ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(required_func))
                         && (NIL != removal_module_required_func_funcall(required_func, asent, sense))))) {
                    applicable_hl_modules = cons(hl_module, applicable_hl_modules);
                  }
                }
              }
            }
          }
        }
        return Values.values(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
      }
    }
  }

  /** Update the set of APPLICABLE-HL-MODULES and SUPPLANTED-HL-MODULES using the :supplants info on HL-MODULE.
   @return 0 boolean ; T iff HL-MODULE supplants all other hl-modules
   @return 1 applicable-hl-modules ; updated version
   @return 2 supplanted-modules    ; updated version */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 38118) 
  public static final SubLObject update_supplanted_hl_modules(SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
    {
      SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
      SubLObject totally_exclusive_foundP = NIL;
      SubLObject pcase_var = supplants_info;
      if (pcase_var.eql($kw65$ALL)) {
        applicable_hl_modules = NIL;
        totally_exclusive_foundP = T;
      } else {
        {
          SubLObject newly_supplanted_hl_module_patterns = supplants_info;
          SubLObject cdolist_list_var = newly_supplanted_hl_module_patterns;
          SubLObject supplanted_hl_module_pattern = NIL;
          for (supplanted_hl_module_pattern = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supplanted_hl_module_pattern = cdolist_list_var.first()) {
            if (supplanted_hl_module_pattern.isCons()) {
              {
                SubLObject patterns = list(supplanted_hl_module_pattern);
                SubLObject negateP = NIL;
                SubLObject pattern = NIL;
                while ((NIL != patterns)) {
                  pattern = patterns.first();
                  patterns = patterns.rest();
                  {
                    SubLObject directive = pattern.first();
                    SubLObject rest = pattern.rest();
                    SubLObject pcase_var_19 = directive;
                    if (pcase_var_19.eql($kw67$NOT)) {
                      negateP = makeBoolean((NIL == negateP));
                      patterns = cons(rest.first(), patterns);
                    } else if (pcase_var_19.eql($kw68$MODULE_SUBTYPE)) {
                      {
                        SubLObject subtype = rest.first();
                        SubLObject newly_supplanted_hl_modules = applicable_hl_modules;
                        SubLObject cdolist_list_var_20 = newly_supplanted_hl_modules;
                        SubLObject supplanted_hl_module = NIL;
                        for (supplanted_hl_module = cdolist_list_var_20.first(); (NIL != cdolist_list_var_20); cdolist_list_var_20 = cdolist_list_var_20.rest(), supplanted_hl_module = cdolist_list_var_20.first()) {
                          if ((((NIL == negateP)
                                 && (NIL != list_utilities.member_eqP(subtype, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36418"))))
                              || ((NIL != negateP)
                                 && (NIL == list_utilities.member_eqP(subtype, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36419")))))) {
                            applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module, applicable_hl_modules, Symbols.symbol_function(EQ));
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              {
                SubLObject supplanted_hl_module = inference_modules.find_hl_module_by_name(supplanted_hl_module_pattern);
                SubLObject item_var = supplanted_hl_module;
                if ((NIL == conses_high.member(item_var, supplanted_hl_modules, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                  supplanted_hl_modules = cons(item_var, supplanted_hl_modules);
                }
                if ((NIL != list_utilities.member_eqP(supplanted_hl_module, applicable_hl_modules))) {
                  applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module, applicable_hl_modules, Symbols.symbol_function(EQ));
                }
              }
            }
          }
        }
      }
      return Values.values(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 41711) 
  public static final SubLObject compute_tactic_specs_for_asent(SubLObject applicable_hl_modules, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tactic_specs = NIL;
        SubLObject cdolist_list_var = applicable_hl_modules;
        SubLObject hl_module = NIL;
        for (hl_module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), hl_module = cdolist_list_var.first()) {
          {
            SubLObject cost = inference_modules.hl_module_cost(hl_module, asent, sense);
            if ((NIL != cost)) {
              if (((NIL != control_vars.$maximum_hl_module_check_cost$.getDynamicValue(thread))
                   && (NIL != variables.fully_bound_p(asent))
                   && cost.numG(control_vars.$maximum_hl_module_check_cost$.getDynamicValue(thread)))) {
                Errors.error($str70$For_sentence_____S__Maximum_HL_Mo, asent, hl_module, cost);
              }
              {
                SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                SubLObject completeness = inference_modules.hl_module_completeness(hl_module, asent, UNPROVIDED);
                SubLObject tactic_spec = list(hl_module, productivity, completeness);
                tactic_specs = cons(tactic_spec, tactic_specs);
              }
            }
          }
        }
        return tactic_specs;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 42439) 
  public static final SubLObject literal_simple_removal_candidate_hl_modules(SubLObject asent, SubLObject sense) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL != forts.fort_p(predicate))) {
        return literal_removal_candidate_hl_modules_for_predicate_with_sense(predicate, sense);
      } else {
        return inference_modules.generic_removal_modules_for_sense(sense);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 42741) 
  public static final SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense(SubLObject predicate, SubLObject sense) {
    {
      SubLObject inference = inference_macros.current_controlling_inference();
      if (((NIL != inference)
           && (NIL != inference_datastructures_inference.inference_problem_store_privateP(inference)))) {
        {
          SubLObject allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(inference);
          return literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, allowed_modules_spec);
        }
      }
    }
    return literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, $kw65$ALL);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 43253) 
  public static final SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(SubLObject predicate, SubLObject sense, SubLObject allowed_modules_spec) {
    {
      SubLObject predicate_specific_removal_modules = inference_modules.removal_modules_specific_for_sense(predicate, sense);
      SubLObject universal_removal_modules = inference_modules.removal_modules_universal_for_predicate_and_sense(predicate, sense);
      SubLObject v_modules = NIL;
      if ((NIL != inference_modules.solely_specific_removal_module_predicateP(predicate))) {
        v_modules = ConsesLow.nconc(predicate_specific_removal_modules, universal_removal_modules);
      } else {
        v_modules = ConsesLow.nconc(predicate_specific_removal_modules, inference_modules.generic_removal_modules_for_sense(sense), universal_removal_modules);
      }
      v_modules = filter_modules_wrt_allowed_modules_spec(v_modules, allowed_modules_spec);
      return v_modules;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 43253) 
  public static final SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int(SubLObject predicate, SubLObject sense, SubLObject allowed_modules_spec) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym71$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym71$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, THREE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym71$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, sense, allowed_modules_spec);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw72$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if ((sense == cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && (allowed_modules_spec == cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, sense, allowed_modules_spec));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 44195) 
  public static final SubLObject literal_meta_removal_candidate_hl_modules(SubLObject asent, SubLObject sense) {
    if ((sense == $kw38$NEG)) {
      return NIL;
    }
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL != forts.fort_p(predicate))) {
        return literal_meta_removal_candidate_hl_modules_for_predicate(predicate);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36420");
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 44561) 
  public static final SubLObject literal_meta_removal_candidate_hl_modules_for_predicate_internal(SubLObject predicate) {
    {
      SubLObject v_meta_removal_modules = NIL;
      SubLObject cdolist_list_var = inference_modules.meta_removal_modules();
      SubLObject meta_removal_module = NIL;
      for (meta_removal_module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), meta_removal_module = cdolist_list_var.first()) {
        if ((NIL != inference_modules.predicate_uses_meta_removal_moduleP(predicate, meta_removal_module))) {
          v_meta_removal_modules = cons(meta_removal_module, v_meta_removal_modules);
        }
      }
      return Sequences.nreverse(v_meta_removal_modules);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 44561) 
  public static final SubLObject literal_meta_removal_candidate_hl_modules_for_predicate(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym73$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym73$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym73$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw72$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw72$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 44946) 
  public static final SubLObject literal_level_removal_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != removal_tactic_p(tactic))
           && (NIL != inference_worker.literal_level_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 45082) 
  public static final SubLObject literal_level_meta_removal_tactic_p(SubLObject tactic) {
    return makeBoolean(((NIL != meta_removal_tactic_p(tactic))
           && (NIL != inference_worker.literal_level_tactic_p(tactic))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 45228) 
  public static final SubLObject new_removal_tactic(SubLObject problem, SubLObject hl_module, SubLObject productivity, SubLObject completeness) {
    {
      SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, UNPROVIDED);
      inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, UNPROVIDED);
      inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
      {
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if ((NIL == id_index.id_index_objects_empty_p(idx, $kw31$SKIP))) {
          {
            SubLObject idx_21 = idx;
            if ((NIL == id_index.id_index_old_objects_empty_p(idx_21, $kw31$SKIP))) {
              {
                SubLObject vector_var = id_index.id_index_old_objects(idx_21);
                SubLObject backwardP_var = NIL;
                SubLObject length = Sequences.length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                  {
                    SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                    SubLObject inference = Vectors.aref(vector_var, id);
                    if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                           && (NIL != id_index.id_index_skip_tombstones_p($kw31$SKIP)))))) {
                      if ((NIL != id_index.id_index_tombstone_p(inference))) {
                        inference = $kw31$SKIP;
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
            SubLObject idx_22 = idx;
            if ((NIL == id_index.id_index_new_objects_empty_p(idx_22))) {
              {
                SubLObject cdohash_table = id_index.id_index_new_objects(idx_22);
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

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 45649) 
  public static final SubLObject compute_strategic_properties_of_removal_tactic(SubLObject tactic, SubLObject strategy) {
    return tactic;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 46412) 
  public static final SubLObject execute_literal_level_removal_tactic(SubLObject tactic, SubLObject mt, SubLObject asent, SubLObject sense) {
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
                SubLObject _prev_bind_0_23 = control_vars.$negation_by_failure$.currentBinding(thread);
                try {
                  control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                  if ((NIL != inference_datastructures_tactic.tactic_in_progressP(tactic))) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                  } else {
                    {
                      SubLObject progress_iterator = maybe_make_removal_tactic_progress_iterator(tactic, asent, sense);
                      if ((NIL == progress_iterator)) {
                      } else if (progress_iterator.isList()) {
                        {
                          SubLObject cdolist_list_var = progress_iterator;
                          SubLObject execution_result = NIL;
                          for (execution_result = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), execution_result = cdolist_list_var.first()) {
                            handle_one_removal_tactic_expand_result(tactic, execution_result);
                          }
                        }
                      } else {
                        inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                      }
                    }
                  }
                } finally {
                  control_vars.$negation_by_failure$.rebind(_prev_bind_0_23, thread);
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

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 47300) 
  public static final SubLObject maybe_make_removal_tactic_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
    if ((NIL != inference_modules.hl_module_output_generate_pattern(inference_datastructures_tactic.tactic_hl_module(tactic)))) {
      return maybe_make_removal_tactic_output_generate_progress_iterator(tactic, asent);
    } else {
      return maybe_make_removal_tactic_expand_results_progress_iterator(tactic, asent, sense);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 47715) 
  public static final SubLObject maybe_make_removal_tactic_output_generate_progress_iterator(SubLObject tactic, SubLObject cycl_input_asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        thread.resetMultipleValues();
        {
          SubLObject output_iterator = maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
          SubLObject encoded_bindings = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != output_iterator)) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, output_iterator);
            return new_removal_tactic_output_generate_progress_iterator(tactic, output_iterator, encoded_bindings);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48384) 
  public static final SubLObject new_removal_tactic_output_generate_progress_iterator(SubLObject tactic, SubLObject output_iterator, SubLObject encoded_bindings) {
    return inference_datastructures_tactic.new_tactic_progress_iterator($kw82$REMOVAL_OUTPUT_GENERATE, tactic, list(output_iterator, encoded_bindings));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48608) 
  public static final SubLObject handle_one_removal_tactic_output_generate_result(SubLObject removal_tactic, SubLObject output_iterator, SubLObject encoded_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
        SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        SubLObject cycl_input_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        thread.resetMultipleValues();
        {
          SubLObject raw_output = iteration.iteration_next(output_iterator);
          SubLObject validP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != validP)) {
            {
              SubLObject _prev_bind_0 = backward.$removal_add_node_method$.currentBinding(thread);
              try {
                backward.$removal_add_node_method$.bind($sym83$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE, thread);
                inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
                result = handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
              } finally {
                backward.$removal_add_node_method$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }

  /** @return nil or removal-link-p
@param REMOVAL-BINDINGS; current tactic's problem vars -> content */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49408) 
  public static final SubLObject handle_removal_add_node_for_output_generate(SubLObject removal_bindings, SubLObject supports) {
    removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
    {
      SubLObject removal_tactic = inference_worker.currently_executing_tactic();
      return handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
    }
  }

  /** The number of expected removal tactic results at which we generate them iteratively. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49867) 
  private static SubLSymbol $removal_tactic_iteration_threshold$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50128) 
  private static SubLSymbol $removal_tactic_expand_results_queue$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50194) 
  public static final SubLObject maybe_make_removal_tactic_expand_results_progress_iterator(SubLObject tactic, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject expand_results = hl_module_guts($kw84$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR, tactic, asent, sense, UNPROVIDED, UNPROVIDED);
        SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if ((NIL != list_utilities.lengthGE(expand_results, $removal_tactic_iteration_threshold$.getDynamicValue(thread), UNPROVIDED))) {
          expand_results = new_removal_tactic_expand_results_progress_iterator(tactic, expand_results);
        }
        return expand_results;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50947) 
  public static final SubLObject maybe_make_removal_tactic_expand_results_progress_iterator_guts(SubLObject tactic, SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject expand_results = NIL;
        {
          SubLObject _prev_bind_0 = $removal_tactic_expand_results_queue$.currentBinding(thread);
          try {
            $removal_tactic_expand_results_queue$.bind(NIL, thread);
            {
              SubLObject _prev_bind_0_24 = backward.$removal_add_node_method$.currentBinding(thread);
              try {
                backward.$removal_add_node_method$.bind($sym85$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS, thread);
                {
                  SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                  SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                  if ((NIL != pattern)) {
                    formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                  } else {
                    {
                      SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                      if ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(function))) {
                        removal_module_expand_func_funcall(function, asent, sense);
                      }
                    }
                  }
                }
              } finally {
                backward.$removal_add_node_method$.rebind(_prev_bind_0_24, thread);
              }
            }
            if ((NIL != $removal_tactic_expand_results_queue$.getDynamicValue(thread))) {
              expand_results = Sequences.nreverse($removal_tactic_expand_results_queue$.getDynamicValue(thread));
            }
          } finally {
            $removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
          }
        }
        return expand_results;
      }
    }
  }

  /** @return nil or removal-link-p
@param REMOVAL-BINDINGS; current tactic's problem vars -> content */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 51865) 
  public static final SubLObject handle_removal_add_node_for_expand_results(SubLObject removal_bindings, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
      $removal_tactic_expand_results_queue$.setDynamicValue(cons(list(removal_bindings, supports), $removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52273) 
  public static final SubLObject new_removal_tactic_expand_results_progress_iterator(SubLObject tactic, SubLObject expand_results) {
    return inference_datastructures_tactic.new_tactic_progress_iterator($kw86$REMOVAL_EXPAND, tactic, expand_results);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52444) 
  public static final SubLObject handle_one_removal_tactic_expand_result(SubLObject removal_tactic, SubLObject expand_result) {
    {
      SubLObject datum = expand_result;
      SubLObject current = datum;
      SubLObject removal_bindings = NIL;
      SubLObject supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
      removal_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
      supports = current.first();
      current = current.rest();
      if ((NIL == current)) {
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, UNPROVIDED);
        return handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list87);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52817) 
  public static final SubLObject handle_one_removal_tactic_result(SubLObject removal_tactic, SubLObject removal_bindings, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject result = NIL;
        supports = possibly_replace_ist_supports(problem, removal_bindings, supports);
        if ((NIL == variables.fully_bound_p(supports))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32090");
        } else {
          thread.resetMultipleValues();
          {
            SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
            SubLObject asent = thread.secondMultipleValue();
            SubLObject sense = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject tactic_var = removal_tactic;
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
                      SubLObject _prev_bind_0_25 = control_vars.$negation_by_failure$.currentBinding(thread);
                      try {
                        control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                        if (((NIL != removal_bindings)
                             && (NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)))) {
                          result = maybe_new_restriction_and_removal_link(problem, removal_tactic, removal_bindings, supports);
                        } else {
                          result = maybe_new_removal_link(problem, removal_tactic, removal_bindings, supports);
                        }
                      } finally {
                        control_vars.$negation_by_failure$.rebind(_prev_bind_0_25, thread);
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
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54011) 
  public static final SubLObject possibly_replace_ist_supports(SubLObject problem, SubLObject removal_bindings, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != inference_datastructures_problem.ist_problem_p(problem))) {
        {
          SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
          SubLObject sentence = bindings.apply_bindings(removal_bindings, asent);
          supports = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1272");
        }
      }
      return supports;
    }
  }

  /** @param REMOVAL-BINDINGS; PROBLEM's vars -> content */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54461) 
  public static final SubLObject maybe_new_restriction_and_removal_link(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject supports) {
    {
      SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
      maybe_new_removal_link(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem), tactic, NIL, supports);
      return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, UNPROVIDED, UNPROVIDED);
    }
  }

  /** @return nil or removal-link-p
Creates a new removal link to goal iff it would be interesting to do so. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54906) 
  public static final SubLObject maybe_new_removal_link(SubLObject problem, SubLObject tactic, SubLObject removal_bindings, SubLObject supports) {
    checkType(problem, $sym18$PROBLEM_P);
    {
      SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
      if ((NIL == inference_datastructures_problem.tactically_good_problem_p(problem))) {
        return new_removal_link(problem, hl_module, removal_bindings, supports);
      } else if (((NIL != removal_tactic_p(tactic))
           && (NIL == inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(inference_datastructures_problem.problem_store(problem))))) {
        return new_removal_link(problem, hl_module, removal_bindings, supports);
      } else {
        {
          SubLObject existing_link = find_removal_link(problem, tactic, removal_bindings, supports);
          if ((NIL != inference_datastructures_problem_link.problem_link_p(existing_link))) {
            return existing_link;
          } else {
            return new_removal_link(problem, hl_module, removal_bindings, supports);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56404) 
  public static final SubLObject find_removal_link(SubLObject problem, SubLObject tactic, SubLObject v_bindings, SubLObject supports) {
    {
      SubLObject candidate_argument_links = inference_datastructures_problem.problem_argument_links_lookup(problem, v_bindings);
      if ((NIL != candidate_argument_links)) {
        {
          SubLObject cdolist_list_var = candidate_argument_links;
          SubLObject link = NIL;
          for (link = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), link = cdolist_list_var.first()) {
            if (((NIL != removal_link_p(link))
                 && (tactic == removal_link_tactic(link))
                 && (NIL != removal_link_data_equals_specP(link, v_bindings, supports)))) {
              return link;
            }
          }
        }
      }
    }
    return NIL;
  }



  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3376) 
  public static final SubLObject removal_link_hl_module(SubLObject removal_link) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    {
      SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
      return remov_link_data_hl_module(data);
    }
  }


  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243) 
  public static final SubLObject remov_link_data_hl_module(SubLObject object) {
    checkType(object, $sym1$REMOVAL_LINK_DATA_P);
    return object.getField2();
  }



  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 5090) 
  public static final SubLObject removal_link_tactic(SubLObject removal_link) {
    checkType(removal_link, $sym21$REMOVAL_LINK_P);
    {
      SubLObject hl_module = removal_link_hl_module(removal_link);
      SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
      SubLObject store = inference_datastructures_problem_link.problem_link_store(removal_link);
      if ((NIL != inference_modules.removal_module_p(hl_module))) {
        {
          SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
          SubLObject candidate_tactic = NIL;
          for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $kw19$REMOVAL))) {
              if ((inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module)) {
                return candidate_tactic;
              }
            }
          }
        }
        if (((NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store))
             && (NIL != inference_datastructures_problem.closed_problem_p(problem)))) {
          {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
              {
                SubLObject restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, restriction_link))) {
                  if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw25$RESTRICTION))) {
                    {
                      SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                      SubLObject candidate_tactic = NIL;
                      for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $kw19$REMOVAL))) {
                          if ((inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module)) {
                            return candidate_tactic;
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
      } else {
        {
          SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
          SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
          SubLObject state = NIL;
          for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            {
              SubLObject split_link = set_contents.do_set_contents_next(basis_object, state);
              if ((NIL != set_contents.do_set_contents_element_validP(state, split_link))) {
                if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, $kw26$SPLIT))) {
                  {
                    SubLObject split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
                    {
                      SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(split_problem);
                      SubLObject candidate_tactic = NIL;
                      for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
                        if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $kw27$REMOVAL_CONJUNCTIVE))) {
                          if ((inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module)) {
                            return candidate_tactic;
                          }
                        }
                      }
                    }
                    {
                      SubLObject set_contents_var_1 = inference_datastructures_problem.problem_dependent_links(split_problem);
                      SubLObject basis_object_2 = set_contents.do_set_contents_basis_object(set_contents_var_1);
                      SubLObject state_3 = NIL;
                      for (state_3 = set_contents.do_set_contents_initial_state(basis_object_2, set_contents_var_1); (NIL == set_contents.do_set_contents_doneP(basis_object_2, state_3)); state_3 = set_contents.do_set_contents_update_state(state_3)) {
                        {
                          SubLObject restriction_link = set_contents.do_set_contents_next(basis_object_2, state_3);
                          if ((NIL != set_contents.do_set_contents_element_validP(state_3, restriction_link))) {
                            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $kw25$RESTRICTION))) {
                              {
                                SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                                SubLObject candidate_tactic = NIL;
                                for (candidate_tactic = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_tactic = cdolist_list_var.first()) {
                                  if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, $kw27$REMOVAL_CONJUNCTIVE))) {
                                    if ((inference_datastructures_tactic.tactic_hl_module(candidate_tactic) == hl_module)) {
                                      return candidate_tactic;
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
        }
      }
      return NIL;
    }
  }

  
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56820) 
  public static final SubLObject new_removal_proof(SubLObject removal_link) {
    {
      SubLObject removal_bindings = removal_link_bindings(removal_link);
      return inference_worker.propose_new_proof_with_bindings(removal_link, removal_bindings, NIL);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 58088) 
  public static final SubLObject inference_remove_check_default(SubLObject cycl_input_asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject hl_module = inference_current_hl_module();
        thread.resetMultipleValues();
        {
          SubLObject cycl_input = inference_input_extractor(hl_module, cycl_input_asent, NIL);
          SubLObject extracted_bindings = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != inference_input_verifier(hl_module, cycl_input))) {
            thread.resetMultipleValues();
            {
              SubLObject raw_input = inference_input_encoder(hl_module, cycl_input, extracted_bindings);
              SubLObject encoded_bindings = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != inference_output_checker(hl_module, raw_input, encoded_bindings))) {
                thread.resetMultipleValues();
                {
                  SubLObject support = inference_support_constructor(hl_module, cycl_input_asent, encoded_bindings);
                  SubLObject more_supports = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  backward.removal_add_node(support, NIL, more_supports);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 59537) 
  public static final SubLObject inference_remove_unify_default(SubLObject cycl_input_asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject hl_module = inference_current_hl_module();
        thread.resetMultipleValues();
        {
          SubLObject output_iterator = maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
          SubLObject encoded_bindings = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != output_iterator)) {
            {
              SubLObject iterator = output_iterator;
              if ((NIL != iteration.iterator_p(iterator))) {
                try {
                  {
                    SubLObject done_var = NIL;
                    while ((NIL == done_var)) {
                      thread.resetMultipleValues();
                      {
                        SubLObject raw_output = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != valid)) {
                          handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                        }
                        done_var = makeBoolean((NIL == valid));
                      }
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      iteration.iteration_finalize(iterator);
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                  }
                }
              } else {
                {
                  SubLObject cdolist_list_var = iterator;
                  SubLObject raw_output = NIL;
                  for (raw_output = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), raw_output = cdolist_list_var.first()) {
                    handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                  }
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $inference_remove_unify_default$UnaryFunction extends UnaryFunction {
    public $inference_remove_unify_default$UnaryFunction() { super(extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT")); }
    public SubLObject processItem(SubLObject arg1) { return inference_remove_unify_default(arg1, UNPROVIDED); }
  }

  public static final class $inference_remove_unify_default$BinaryFunction extends BinaryFunction {
    public $inference_remove_unify_default$BinaryFunction() { super(extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return inference_remove_unify_default(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60184) 
  public static final SubLObject maybe_make_inference_output_iterator(SubLObject hl_module, SubLObject cycl_input_asent) {
    return hl_module_guts($kw99$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, cycl_input_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60360) 
  public static final SubLObject maybe_make_inference_output_iterator_guts(SubLObject hl_module, SubLObject cycl_input_asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject cycl_input = inference_input_extractor(hl_module, cycl_input_asent, NIL);
        SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != inference_input_verifier(hl_module, cycl_input))) {
          thread.resetMultipleValues();
          {
            SubLObject raw_input = inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject output_iterator = inference_output_generator(hl_module, raw_input, encoded_bindings);
              return Values.values(output_iterator, encoded_bindings);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60905) 
  public static final SubLObject handle_one_output_generate_result(SubLObject cycl_input_asent, SubLObject hl_module, SubLObject raw_output, SubLObject encoded_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject successP = hl_module_guts($kw100$HANDLE_ONE_OUTPUT_GENERATE_RESULT, cycl_input_asent, hl_module, raw_output, encoded_bindings, UNPROVIDED);
        SubLObject support = thread.secondMultipleValue();
        SubLObject unify_bindings = thread.thirdMultipleValue();
        SubLObject more_supports = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != successP)) {
          return backward.removal_add_node(support, unify_bindings, more_supports);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 61328) 
  public static final SubLObject handle_one_output_generate_result_guts(SubLObject cycl_input_asent, SubLObject hl_module, SubLObject raw_output, SubLObject encoded_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject cycl_output = inference_output_decoder(hl_module, raw_output, encoded_bindings);
        SubLObject decoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != inference_output_verifier(hl_module, cycl_output))) {
          thread.resetMultipleValues();
          {
            SubLObject cycl_output_asent = inference_output_constructor(hl_module, cycl_output, decoded_bindings);
            SubLObject constructed_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            {
              SubLObject unify_bindings = unification_utilities.term_unify(cycl_input_asent, cycl_output_asent, T, T);
              SubLObject unify_justification = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != unify_bindings)) {
                thread.resetMultipleValues();
                {
                  SubLObject support = inference_support_constructor(hl_module, cycl_output_asent, constructed_bindings);
                  SubLObject more_supports = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  return Values.values(T, support, unify_bindings, ConsesLow.append(more_supports, unify_justification));
                }
              }
            }
          }
        }
      }
      return Values.values(NIL, NIL, NIL, NIL);
    }
  }

  /** @note: If this is ever used outside of an expand function, we will need something more general. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 62176) 
  public static final SubLObject inference_current_hl_module() {
    return backward.inference_expand_hl_module();
  }

  /** @note: If this is ever used outside of an expand function, we will need something more general. */
  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 62362) 
  public static final SubLObject inference_current_sense() {
    return backward.inference_expand_sense();
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 62540) 
  public static final SubLObject inference_input_extractor(SubLObject hl_module, SubLObject cycl_input_asent, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      SubLObject pattern = inference_modules.hl_module_input_extract_pattern(hl_module);
      return formula_pattern_match.pattern_transform_formula(pattern, cycl_input_asent, v_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 62794) 
  public static final SubLObject inference_input_verifier(SubLObject hl_module, SubLObject cycl_input) {
    {
      SubLObject pattern = inference_modules.hl_module_input_verify_pattern(hl_module);
      return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_input);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63017) 
  public static final SubLObject inference_input_encoder(SubLObject hl_module, SubLObject cycl_input, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      SubLObject pattern = inference_modules.hl_module_input_encode_pattern(hl_module);
      return pattern_match.pattern_transform_tree(pattern, cycl_input, v_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63251) 
  public static final SubLObject inference_output_checker(SubLObject hl_module, SubLObject raw_input, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      SubLObject pattern = inference_modules.hl_module_output_check_pattern(hl_module);
      if ((NIL == pattern)) {
        return NIL;
      }
      {
        SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
        return list_utilities.sublisp_boolean(output);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63587) 
  public static final SubLObject inference_output_generator(SubLObject hl_module, SubLObject raw_input, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      SubLObject pattern = inference_modules.hl_module_output_generate_pattern(hl_module);
      if ((NIL == pattern)) {
        return NIL;
      }
      {
        SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
        if ((NIL != iteration.iterator_p(output))) {
          return output;
        } else if (output.isList()) {
          return iteration.new_list_iterator(output);
        } else {
          return NIL;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64169) 
  public static final SubLObject inference_output_decoder(SubLObject hl_module, SubLObject raw_output, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      SubLObject pattern = inference_modules.hl_module_output_decode_pattern(hl_module);
      return pattern_match.pattern_transform_tree(pattern, raw_output, v_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64407) 
  public static final SubLObject inference_output_verifier(SubLObject hl_module, SubLObject cycl_output) {
    {
      SubLObject pattern = inference_modules.hl_module_output_verify_pattern(hl_module);
      return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_output);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64685) 
  public static final SubLObject inference_output_constructor(SubLObject hl_module, SubLObject cycl_output, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      SubLObject pattern = inference_modules.hl_module_output_construct_pattern(hl_module);
      return pattern_match.pattern_transform_tree(pattern, cycl_output, v_bindings);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64938) 
  public static final SubLObject inference_support_constructor(SubLObject hl_module, SubLObject cycl_output_asent, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject support_sense = inference_current_sense();
        SubLObject support_sentence = el_utilities.asent_and_sense_to_literal(cycl_output_asent, support_sense);
        SubLObject support_mt = inference_modules.hl_module_support_mt_result(hl_module);
        SubLObject pattern = inference_modules.hl_module_support_pattern(hl_module);
        if ((NIL != pattern)) {
          {
            SubLObject datum = formula_pattern_match.pattern_transform_formula(pattern, cycl_output_asent, v_bindings);
            SubLObject current = datum;
            SubLObject support = (current.isCons() ? ((SubLObject) current.first()) : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list101);
            current = current.rest();
            {
              SubLObject more_supports = current;
              return Values.values(support, more_supports);
            }
          }
        }
        {
          SubLObject support_func = inference_modules.hl_module_support_func(hl_module);
          if ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(support_func))) {
            thread.resetMultipleValues();
            {
              SubLObject support = eval_in_api.possibly_cyc_api_funcall_2(support_func, support_sentence, support_mt);
              SubLObject more_supports = thread.secondMultipleValue();
              thread.resetMultipleValues();
              return Values.values(support, more_supports);
            }
          }
        }
        {
          SubLObject support_module = inference_modules.hl_module_support_module(hl_module);
          SubLObject support_strength = inference_modules.hl_module_support_strength(hl_module);
          SubLObject support_tv = enumeration_types.tv_from_truth_strength($kw102$TRUE, support_strength);
          SubLObject support = arguments.make_hl_support(support_module, support_sentence, support_mt, support_tv);
          SubLObject more_supports = NIL;
          return Values.values(support, more_supports);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66426) 
  public static final SubLObject hl_module_guts(SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
      SubLObject pcase_var = type;
      if (pcase_var.eql($kw66$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES)) {
        return determine_new_removal_tactic_specs_from_hl_modules_guts(arg1, arg2, arg3);
      } else if (pcase_var.eql($kw84$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR)) {
        return maybe_make_removal_tactic_expand_results_progress_iterator_guts(arg1, arg2, arg3);
      } else if (pcase_var.eql($kw100$HANDLE_ONE_OUTPUT_GENERATE_RESULT)) {
        return handle_one_output_generate_result_guts(arg1, arg2, arg3, arg4);
      } else if (pcase_var.eql($kw99$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR)) {
        return maybe_make_inference_output_iterator_guts(arg1, arg2);
      } else {
        Errors.error($str103$unknown_thing_to_do_in_the_HL_mod, type);
      }
    }
    return NIL;
  }

  public static final SubLObject declare_inference_worker_removal_file() {
    declareFunction(myName, "removal_link_data_print_function_trampoline", "REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "removal_link_data_p", "REMOVAL-LINK-DATA-P", 1, 0, false); new $removal_link_data_p$UnaryFunction();
    declareFunction(myName, "remov_link_data_hl_module", "REMOV-LINK-DATA-HL-MODULE", 1, 0, false);
    declareFunction(myName, "remov_link_data_bindings", "REMOV-LINK-DATA-BINDINGS", 1, 0, false);
    declareFunction(myName, "remov_link_data_supports", "REMOV-LINK-DATA-SUPPORTS", 1, 0, false);
    declareFunction(myName, "_csetf_remov_link_data_hl_module", "_CSETF-REMOV-LINK-DATA-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_remov_link_data_bindings", "_CSETF-REMOV-LINK-DATA-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_remov_link_data_supports", "_CSETF-REMOV-LINK-DATA-SUPPORTS", 2, 0, false);
    declareFunction(myName, "make_removal_link_data", "MAKE-REMOVAL-LINK-DATA", 0, 1, false);
    declareFunction(myName, "new_removal_link", "NEW-REMOVAL-LINK", 4, 0, false);
    declareFunction(myName, "new_removal_link_int", "NEW-REMOVAL-LINK-INT", 4, 0, false);
    declareFunction(myName, "new_removal_link_data", "NEW-REMOVAL-LINK-DATA", 1, 0, false);
    declareFunction(myName, "destroy_removal_link", "DESTROY-REMOVAL-LINK", 1, 0, false);
    declareFunction(myName, "removal_link_hl_module", "REMOVAL-LINK-HL-MODULE", 1, 0, false);
    declareFunction(myName, "removal_link_bindings", "REMOVAL-LINK-BINDINGS", 1, 0, false);
    declareFunction(myName, "removal_link_supports", "REMOVAL-LINK-SUPPORTS", 1, 0, false);
    declareFunction(myName, "set_removal_link_hl_module", "SET-REMOVAL-LINK-HL-MODULE", 2, 0, false);
    declareFunction(myName, "set_removal_link_bindings", "SET-REMOVAL-LINK-BINDINGS", 2, 0, false);
    declareFunction(myName, "set_removal_link_supports", "SET-REMOVAL-LINK-SUPPORTS", 2, 0, false);
    declareFunction(myName, "removal_link_tactic", "REMOVAL-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "removal_link_data_equals_specP", "REMOVAL-LINK-DATA-EQUALS-SPEC?", 3, 0, false);
    declareFunction(myName, "generalized_removal_tactic_p", "GENERALIZED-REMOVAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_tactic_p", "CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_link_p", "CONJUNCTIVE-REMOVAL-LINK-P", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_proof_p", "CONJUNCTIVE-REMOVAL-PROOF-P", 1, 0, false);
    declareFunction(myName, "determine_new_conjunctive_removal_tactics", "DETERMINE-NEW-CONJUNCTIVE-REMOVAL-TACTICS", 2, 0, false);
    declareFunction(myName, "sort_applicable_conjunctive_removal_modules_by_priority", "SORT-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES-BY-PRIORITY", 1, 0, false);
    declareFunction(myName, "conjunctive_removal_module_priorityL", "CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<", 2, 0, false);
    declareFunction(myName, "determine_applicable_conjunctive_removal_modules", "DETERMINE-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
    declareFunction(myName, "motivated_multi_literal_subclause_specs", "MOTIVATED-MULTI-LITERAL-SUBCLAUSE-SPECS", 1, 0, false);
    declareFunction(myName, "hl_module_applicable_subclause_specs", "HL-MODULE-APPLICABLE-SUBCLAUSE-SPECS", 2, 0, false);
    declareFunction(myName, "new_conjunctive_removal_tactic", "NEW-CONJUNCTIVE-REMOVAL-TACTIC", 4, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_conjunctive_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-CONJUNCTIVE-REMOVAL-TACTIC", 2, 0, false);
    declareFunction(myName, "execute_conjunctive_removal_tactic", "EXECUTE-CONJUNCTIVE-REMOVAL-TACTIC", 1, 0, false);
    declareFunction(myName, "maybe_make_conjunctive_removal_tactic_progress_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
    declareFunction(myName, "maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 1, 0, false);
    declareFunction(myName, "new_conjunctive_removal_tactic_progress_expand_iterative_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 2, 0, false);
    declareFunction(myName, "handle_one_conjunctive_removal_tactic_expand_iterative_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-ITERATIVE-RESULT", 2, 0, false);
    declareFunction(myName, "maybe_make_conjunctive_removal_tactic_progress_expand_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 1, 0, false);
    declareFunction(myName, "new_conjunctive_removal_tactic_progress_expand_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 2, 0, false);
    declareFunction(myName, "conjunctive_removal_callback", "CONJUNCTIVE-REMOVAL-CALLBACK", 2, 0, false);
    declareFunction(myName, "handle_one_conjunctive_removal_tactic_expand_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
    declareFunction(myName, "handle_one_conjunctive_removal_tactic_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-RESULT", 3, 0, false);
    declareFunction(myName, "maybe_new_simplification_link", "MAYBE-NEW-SIMPLIFICATION-LINK", 3, 0, false);
    declareFunction(myName, "maybe_new_restriction_split_and_removal_links", "MAYBE-NEW-RESTRICTION-SPLIT-AND-REMOVAL-LINKS", 4, 0, false);
    declareFunction(myName, "reorder_conjunctive_removal_justifications", "REORDER-CONJUNCTIVE-REMOVAL-JUSTIFICATIONS", 4, 0, false);
    declareFunction(myName, "maybe_new_split_and_removal_links", "MAYBE-NEW-SPLIT-AND-REMOVAL-LINKS", 3, 0, false);
    declareFunction(myName, "maybe_new_removal_link_for_split_link", "MAYBE-NEW-REMOVAL-LINK-FOR-SPLIT-LINK", 5, 0, false);
    declareMacro(myName, "with_problem_store_removal_assumptions", "WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
    declareFunction(myName, "meta_removal_tactic_p", "META-REMOVAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_meta_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-REMOVAL-TACTIC", 2, 0, false);
    declareFunction(myName, "removal_link_p", "REMOVAL-LINK-P", 1, 0, false);
    declareFunction(myName, "removal_tactic_p", "REMOVAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "removal_proof_p", "REMOVAL-PROOF-P", 1, 0, false);
    declareFunction(myName, "removal_module_exclusive_func_funcall", "REMOVAL-MODULE-EXCLUSIVE-FUNC-FUNCALL", 3, 0, false);
    declareFunction(myName, "removal_module_required_func_funcall", "REMOVAL-MODULE-REQUIRED-FUNC-FUNCALL", 3, 0, false);
    declareFunction(myName, "removal_module_expand_func_funcall", "REMOVAL-MODULE-EXPAND-FUNC-FUNCALL", 3, 0, false);
    declareFunction(myName, "determine_new_literal_removal_tactics", "DETERMINE-NEW-LITERAL-REMOVAL-TACTICS", 3, 0, false);
    declareFunction(myName, "determine_new_literal_meta_removal_tactics", "DETERMINE-NEW-LITERAL-META-REMOVAL-TACTICS", 3, 0, false);
    declareFunction(myName, "determine_new_literal_simple_removal_tactics", "DETERMINE-NEW-LITERAL-SIMPLE-REMOVAL-TACTICS", 3, 0, false);
    declareFunction(myName, "literal_removal_options", "LITERAL-REMOVAL-OPTIONS", 2, 1, false);
    declareFunction(myName, "literal_removal_options_hl_modules", "LITERAL-REMOVAL-OPTIONS-HL-MODULES", 3, 0, false);
    declareFunction(myName, "filter_modules_wrt_allowed_modules_spec", "FILTER-MODULES-WRT-ALLOWED-MODULES-SPEC", 2, 0, false);
    declareFunction(myName, "literal_removal_options_candidate_hl_modules", "LITERAL-REMOVAL-OPTIONS-CANDIDATE-HL-MODULES", 3, 0, false);
    declareFunction(myName, "hl_module_applicable_to_asentP", "HL-MODULE-APPLICABLE-TO-ASENT?", 2, 0, false);
    declareFunction(myName, "determine_new_removal_tactics_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTICS-FROM-HL-MODULES", 4, 0, false);
    declareFunction(myName, "determine_new_removal_tactic_specs_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES", 3, 0, false);
    declareFunction(myName, "determine_new_removal_tactic_specs_from_hl_modules_guts", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES-GUTS", 3, 0, false);
    declareFunction(myName, "determine_applicable_hl_modules_for_asent", "DETERMINE-APPLICABLE-HL-MODULES-FOR-ASENT", 3, 0, false);
    declareFunction(myName, "update_applicable_hl_modules", "UPDATE-APPLICABLE-HL-MODULES", 5, 0, false);
    declareFunction(myName, "update_supplanted_hl_modules", "UPDATE-SUPPLANTED-HL-MODULES", 3, 0, false);
    declareFunction(myName, "update_supplanted_modules_wrt_tactic_specs", "UPDATE-SUPPLANTED-MODULES-WRT-TACTIC-SPECS", 3, 0, false);
    declareFunction(myName, "compute_tactic_specs_for_asent", "COMPUTE-TACTIC-SPECS-FOR-ASENT", 3, 0, false);
    declareFunction(myName, "literal_simple_removal_candidate_hl_modules", "LITERAL-SIMPLE-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
    declareFunction(myName, "literal_removal_candidate_hl_modules_for_predicate_with_sense", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE", 2, 0, false);
    declareFunction(myName, "literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT-INTERNAL", 3, 0, false);
    declareFunction(myName, "literal_removal_candidate_hl_modules_for_predicate_with_sense_int", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT", 3, 0, false);
    declareFunction(myName, "literal_meta_removal_candidate_hl_modules", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
    declareFunction(myName, "literal_meta_removal_candidate_hl_modules_for_predicate_internal", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-INTERNAL", 1, 0, false);
    declareFunction(myName, "literal_meta_removal_candidate_hl_modules_for_predicate", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE", 1, 0, false);
    declareFunction(myName, "literal_level_removal_tactic_p", "LITERAL-LEVEL-REMOVAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "literal_level_meta_removal_tactic_p", "LITERAL-LEVEL-META-REMOVAL-TACTIC-P", 1, 0, false);
    declareFunction(myName, "new_removal_tactic", "NEW-REMOVAL-TACTIC", 4, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REMOVAL-TACTIC", 2, 0, false);
    declareMacro(myName, "with_removal_tactic_execution_assumptions", "WITH-REMOVAL-TACTIC-EXECUTION-ASSUMPTIONS");
    declareFunction(myName, "execute_literal_level_removal_tactic", "EXECUTE-LITERAL-LEVEL-REMOVAL-TACTIC", 4, 0, false);
    declareFunction(myName, "maybe_make_removal_tactic_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
    declareFunction(myName, "maybe_make_removal_tactic_output_generate_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "new_removal_tactic_output_generate_progress_iterator", "NEW-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 3, 0, false);
    declareFunction(myName, "handle_one_removal_tactic_output_generate_result", "HANDLE-ONE-REMOVAL-TACTIC-OUTPUT-GENERATE-RESULT", 3, 0, false);
    declareFunction(myName, "handle_removal_add_node_for_output_generate", "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE", 2, 0, false);
    declareFunction(myName, "maybe_make_removal_tactic_expand_results_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 3, 0, false);
    declareFunction(myName, "maybe_make_removal_tactic_expand_results_progress_iterator_guts", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR-GUTS", 3, 0, false);
    declareFunction(myName, "handle_removal_add_node_for_expand_results", "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS", 2, 0, false);
    declareFunction(myName, "new_removal_tactic_expand_results_progress_iterator", "NEW-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 2, 0, false);
    declareFunction(myName, "handle_one_removal_tactic_expand_result", "HANDLE-ONE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
    declareFunction(myName, "handle_one_removal_tactic_result", "HANDLE-ONE-REMOVAL-TACTIC-RESULT", 3, 0, false);
    declareFunction(myName, "possibly_replace_ist_supports", "POSSIBLY-REPLACE-IST-SUPPORTS", 3, 0, false);
    declareFunction(myName, "maybe_new_restriction_and_removal_link", "MAYBE-NEW-RESTRICTION-AND-REMOVAL-LINK", 4, 0, false);
    declareFunction(myName, "maybe_new_removal_link", "MAYBE-NEW-REMOVAL-LINK", 4, 0, false);
    declareFunction(myName, "find_removal_link", "FIND-REMOVAL-LINK", 4, 0, false);
    declareFunction(myName, "new_removal_proof", "NEW-REMOVAL-PROOF", 1, 0, false);
    declareFunction(myName, "execute_literal_level_meta_removal_tactic", "EXECUTE-LITERAL-LEVEL-META-REMOVAL-TACTIC", 4, 0, false);
    declareFunction(myName, "inference_remove_check_default", "INFERENCE-REMOVE-CHECK-DEFAULT", 1, 1, false);
    declareMacro(myName, "do_all_legacy_inference_outputs", "DO-ALL-LEGACY-INFERENCE-OUTPUTS");
    declareFunction(myName, "inference_remove_unify_default", "INFERENCE-REMOVE-UNIFY-DEFAULT", 1, 1, false); new $inference_remove_unify_default$UnaryFunction(); new $inference_remove_unify_default$BinaryFunction();
    declareFunction(myName, "maybe_make_inference_output_iterator", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR", 2, 0, false);
    declareFunction(myName, "maybe_make_inference_output_iterator_guts", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR-GUTS", 2, 0, false);
    declareFunction(myName, "handle_one_output_generate_result", "HANDLE-ONE-OUTPUT-GENERATE-RESULT", 4, 0, false);
    declareFunction(myName, "handle_one_output_generate_result_guts", "HANDLE-ONE-OUTPUT-GENERATE-RESULT-GUTS", 4, 0, false);
    declareFunction(myName, "inference_current_hl_module", "INFERENCE-CURRENT-HL-MODULE", 0, 0, false);
    declareFunction(myName, "inference_current_sense", "INFERENCE-CURRENT-SENSE", 0, 0, false);
    declareFunction(myName, "inference_input_extractor", "INFERENCE-INPUT-EXTRACTOR", 2, 1, false);
    declareFunction(myName, "inference_input_verifier", "INFERENCE-INPUT-VERIFIER", 2, 0, false);
    declareFunction(myName, "inference_input_encoder", "INFERENCE-INPUT-ENCODER", 2, 1, false);
    declareFunction(myName, "inference_output_checker", "INFERENCE-OUTPUT-CHECKER", 2, 1, false);
    declareFunction(myName, "inference_output_generator", "INFERENCE-OUTPUT-GENERATOR", 2, 1, false);
    declareFunction(myName, "inference_output_decoder", "INFERENCE-OUTPUT-DECODER", 2, 1, false);
    declareFunction(myName, "inference_output_verifier", "INFERENCE-OUTPUT-VERIFIER", 2, 0, false);
    declareFunction(myName, "inference_output_constructor", "INFERENCE-OUTPUT-CONSTRUCTOR", 2, 1, false);
    declareFunction(myName, "inference_support_constructor", "INFERENCE-SUPPORT-CONSTRUCTOR", 2, 1, false);
    declareFunction(myName, "hl_module_guts", "HL-MODULE-GUTS", 1, 5, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_removal_file() {
    $dtp_removal_link_data$ = defconstant("*DTP-REMOVAL-LINK-DATA*", $sym0$REMOVAL_LINK_DATA);
    $conjunctive_removal_tactic_expand_results_queue$ = defparameter("*CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", NIL);
    $conjunctive_removal_suppress_split_justificationP$ = defparameter("*CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?*", T);
    $conjunctive_removal_optimize_when_no_justificationsP$ = defparameter("*CONJUNCTIVE-REMOVAL-OPTIMIZE-WHEN-NO-JUSTIFICATIONS?*", T);
    $removal_tactic_iteration_threshold$ = defparameter("*REMOVAL-TACTIC-ITERATION-THRESHOLD*", TWO_INTEGER);
    $removal_tactic_expand_results_queue$ = defparameter("*REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_removal_file() {
    // CVS_ID("Id: inference-worker-removal.lisp 128830 2009-09-23 21:54:25Z jantos ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$REMOV_LINK_DATA_HL_MODULE, $sym9$_CSETF_REMOV_LINK_DATA_HL_MODULE);
    Structures.def_csetf($sym10$REMOV_LINK_DATA_BINDINGS, $sym11$_CSETF_REMOV_LINK_DATA_BINDINGS);
    Structures.def_csetf($sym12$REMOV_LINK_DATA_SUPPORTS, $sym13$_CSETF_REMOV_LINK_DATA_SUPPORTS);
    Equality.identity($sym0$REMOVAL_LINK_DATA);
    memoization_state.note_memoized_function($sym71$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT);
    memoization_state.note_memoized_function($sym73$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$REMOVAL_LINK_DATA = makeSymbol("REMOVAL-LINK-DATA");
  public static final SubLSymbol $sym1$REMOVAL_LINK_DATA_P = makeSymbol("REMOVAL-LINK-DATA-P");
  public static final SubLList $list2 = list(makeSymbol("HL-MODULE"), makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
  public static final SubLList $list3 = list(makeKeyword("HL-MODULE"), makeKeyword("BINDINGS"), makeKeyword("SUPPORTS"));
  public static final SubLList $list4 = list(makeSymbol("REMOV-LINK-DATA-HL-MODULE"), makeSymbol("REMOV-LINK-DATA-BINDINGS"), makeSymbol("REMOV-LINK-DATA-SUPPORTS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE"), makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS"), makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$REMOV_LINK_DATA_HL_MODULE = makeSymbol("REMOV-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym9$_CSETF_REMOV_LINK_DATA_HL_MODULE = makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE");
  public static final SubLSymbol $sym10$REMOV_LINK_DATA_BINDINGS = makeSymbol("REMOV-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym11$_CSETF_REMOV_LINK_DATA_BINDINGS = makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS");
  public static final SubLSymbol $sym12$REMOV_LINK_DATA_SUPPORTS = makeSymbol("REMOV-LINK-DATA-SUPPORTS");
  public static final SubLSymbol $sym13$_CSETF_REMOV_LINK_DATA_SUPPORTS = makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS");
  public static final SubLSymbol $kw14$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw15$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw16$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym18$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $kw19$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw20$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym21$REMOVAL_LINK_P = makeSymbol("REMOVAL-LINK-P");
  public static final SubLSymbol $sym22$HL_MODULE_P = makeSymbol("HL-MODULE-P");
  public static final SubLSymbol $sym23$BINDING_LIST_P = makeSymbol("BINDING-LIST-P");
  public static final SubLSymbol $sym24$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLSymbol $kw25$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $kw26$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw27$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLList $list28 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));
  public static final SubLSymbol $sym29$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_ = makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<");
  public static final SubLString $str30$_s_stated_its_applicability_to_th = makeString("~s stated its applicability to the subclause spec ~s, which does not specify more than one literal.\nConjunctive removal modules must apply to more than one literal in the clause.");
  public static final SubLSymbol $kw31$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw32$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLList $list33 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("JUSTIFICATIONS"));
  public static final SubLSymbol $kw34$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
  public static final SubLSymbol $kw35$CONJUNCTIVE_REMOVAL_EXPAND = makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
  public static final SubLString $str36$Problem_reuse_assumptions_were_vi = makeString("Problem reuse assumptions were violated: ~a did not equal ~a");
  public static final SubLString $str37$Couldn_t_find_the_right_conjuncti = makeString("Couldn't find the right conjunctive removal justification for ~S");
  public static final SubLSymbol $kw38$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw39$POS = makeKeyword("POS");
  public static final SubLList $list40 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym41$STORE_VAR = makeUninternedSymbol("STORE-VAR");
  public static final SubLSymbol $sym42$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym43$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
  public static final SubLSymbol $sym44$PROBLEM_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
  public static final SubLSymbol $kw45$META_REMOVAL = makeKeyword("META-REMOVAL");
  public static final SubLSymbol $sym46$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED = makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED");
  public static final SubLSymbol $sym47$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED = makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED");
  public static final SubLSymbol $sym48$REMOVAL_ABDUCTION_POS_REQUIRED = makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED");
  public static final SubLSymbol $sym49$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED = makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED");
  public static final SubLSymbol $sym50$REMOVAL_FCP_CHECK_REQUIRED = makeSymbol("REMOVAL-FCP-CHECK-REQUIRED");
  public static final SubLSymbol $sym51$REMOVAL_ISA_DEFN_POS_REQUIRED = makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED");
  public static final SubLSymbol $sym52$REMOVAL_TVA_CHECK_REQUIRED = makeSymbol("REMOVAL-TVA-CHECK-REQUIRED");
  public static final SubLSymbol $sym53$REMOVAL_TVA_UNIFY_REQUIRED = makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED");
  public static final SubLSymbol $sym54$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND = makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND");
  public static final SubLSymbol $sym55$REMOVAL_EVAL_EXPAND = makeSymbol("REMOVAL-EVAL-EXPAND");
  public static final SubLSymbol $sym56$REMOVAL_EVALUATE_BIND_EXPAND = makeSymbol("REMOVAL-EVALUATE-BIND-EXPAND");
  public static final SubLSymbol $sym57$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND = makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND");
  public static final SubLSymbol $sym58$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND = makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND");
  public static final SubLSymbol $sym59$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND");
  public static final SubLSymbol $sym60$REMOVAL_NAT_FORMULA_EXPAND = makeSymbol("REMOVAL-NAT-FORMULA-EXPAND");
  public static final SubLSymbol $sym61$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND");
  public static final SubLSymbol $sym62$REMOVAL_NAT_LOOKUP_EXPAND = makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND");
  public static final SubLSymbol $sym63$REMOVAL_REFLEXIVE_ON_EXPAND = makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND");
  public static final SubLSymbol $sym64$REMOVAL_TVA_CHECK_EXPAND = makeSymbol("REMOVAL-TVA-CHECK-EXPAND");
  public static final SubLSymbol $kw65$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw66$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES = makeKeyword("DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES");
  public static final SubLSymbol $kw67$NOT = makeKeyword("NOT");
  public static final SubLSymbol $kw68$MODULE_SUBTYPE = makeKeyword("MODULE-SUBTYPE");
  public static final SubLSymbol $sym69$FIRST = makeSymbol("FIRST");
  public static final SubLString $str70$For_sentence_____S__Maximum_HL_Mo = makeString("For sentence :~%~S~%Maximum HL Module check cost exceeded by ~A (~A).");
  public static final SubLSymbol $sym71$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT = makeSymbol("LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT");
  public static final SubLSymbol $kw72$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym73$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE = makeSymbol("LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE");
  public static final SubLList $list74 = list(list(makeSymbol("TACTIC"), makeSymbol("MT"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym75$TACTIC_VAR = makeUninternedSymbol("TACTIC-VAR");
  public static final SubLSymbol $sym76$WITH_INFERENCE_MT_RELEVANCE = makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym77$_INFERENCE_EXPAND_HL_MODULE_ = makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");
  public static final SubLSymbol $sym78$TACTIC_HL_MODULE = makeSymbol("TACTIC-HL-MODULE");
  public static final SubLSymbol $sym79$_INFERENCE_EXPAND_SENSE_ = makeSymbol("*INFERENCE-EXPAND-SENSE*");
  public static final SubLSymbol $sym80$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS = makeSymbol("WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
  public static final SubLSymbol $sym81$TACTIC_STORE = makeSymbol("TACTIC-STORE");
  public static final SubLSymbol $kw82$REMOVAL_OUTPUT_GENERATE = makeKeyword("REMOVAL-OUTPUT-GENERATE");
  public static final SubLSymbol $sym83$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");
  public static final SubLSymbol $kw84$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR = makeKeyword("MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR");
  public static final SubLSymbol $sym85$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");
  public static final SubLSymbol $kw86$REMOVAL_EXPAND = makeKeyword("REMOVAL-EXPAND");
  public static final SubLList $list87 = list(makeSymbol("REMOVAL-BINDINGS"), makeSymbol("SUPPORTS"));
  public static final SubLString $str88$Ignoring_result_from__S_due_to_op = makeString("Ignoring result from ~S due to open supports");
  public static final SubLSymbol $sym89$PRODUCTIVITY__ = makeSymbol("PRODUCTIVITY-<");
  public static final SubLSymbol $sym90$TACTIC_PRODUCTIVITY = makeSymbol("TACTIC-PRODUCTIVITY");
  public static final SubLList $list91 = list(list(makeSymbol("RAW-OUTPUT"), makeSymbol("RAW-OUTPUT-ITERATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym92$ITERATOR = makeUninternedSymbol("ITERATOR");
  public static final SubLSymbol $sym93$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym94$ITERATOR_P = makeSymbol("ITERATOR-P");
  public static final SubLSymbol $sym95$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym96$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $sym97$ITERATION_FINALIZE = makeSymbol("ITERATION-FINALIZE");
  public static final SubLSymbol $sym98$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $kw99$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
  public static final SubLSymbol $kw100$HANDLE_ONE_OUTPUT_GENERATE_RESULT = makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
  public static final SubLList $list101 = list(makeSymbol("&OPTIONAL"), makeSymbol("SUPPORT"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));
  public static final SubLSymbol $kw102$TRUE = makeKeyword("TRUE");
  public static final SubLString $str103$unknown_thing_to_do_in_the_HL_mod = makeString("unknown thing to do in the HL module guts: ~s");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_removal_file();
  }

  public void initializeVariables() {
    init_inference_worker_removal_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_removal_file();
  }

}
