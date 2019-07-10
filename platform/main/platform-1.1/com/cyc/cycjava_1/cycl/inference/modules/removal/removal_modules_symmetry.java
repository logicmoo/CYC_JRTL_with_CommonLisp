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

package com.cyc.cycjava_1.cycl.inference.modules.removal;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_symmetry extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_symmetry() {}
  public static final SubLFile me = new removal_modules_symmetry();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_symmetry";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 1085) 
  public static final SubLObject symmetric_asent(SubLObject asent) {
    return list(cycl_utilities.atomic_sentence_predicate(asent), cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 2866) 
  public static final SubLObject removal_commutativity_lookup_cost(SubLObject asent, SubLObject truth) {
    return ((NIL != variables.fully_bound_p(asent)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32753")) : removal_commutativity_generate_cost(asent, truth));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 3204) 
  public static final SubLObject removal_commutativity_generate_cost(SubLObject asent, SubLObject truth) {
    {
      SubLObject cost = ZERO_INTEGER;
      SubLObject source_formula_var = asent;
      SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym23$HL_VAR_), NIL);
      SubLObject permuted_asent = NIL;
      for (permuted_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permuted_asent = cdolist_list_var.first()) {
        cost = Numbers.add(cost, kb_indexing.num_best_gaf_lookup_index(permuted_asent, truth, UNPROVIDED));
      }
      return cost;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 3449) 
  public static final SubLObject removal_commutativity_lookup_iterator(SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject source_formula_var = asent;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym23$HL_VAR_), NIL);
        SubLObject permuted_asent = NIL;
        for (permuted_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permuted_asent = cdolist_list_var.first()) {
          {
            SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, sense);
            SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
            SubLObject pcase_var = method;
            if (pcase_var.eql($kw24$GAF_ARG)) {
              thread.resetMultipleValues();
              {
                SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                SubLObject argnum = thread.secondMultipleValue();
                SubLObject predicate = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != argnum)) {
                  if ((NIL != predicate)) {
                    {
                      SubLObject pred_var = predicate;
                      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                        {
                          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw21$GAF, enumeration_types.sense_truth(sense), NIL);
                                    {
                                      SubLObject done_var_9 = NIL;
                                      SubLObject token_var_10 = NIL;
                                      while ((NIL == done_var_9)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                          SubLObject valid_11 = makeBoolean((token_var_10 != assertion));
                                          if ((NIL != valid_11)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_9 = makeBoolean((NIL == valid_11));
                                        }
                                      }
                                    }
                                  } finally {
                                    {
                                      SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                      try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != final_index_iterator)) {
                                          kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                      } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    }
                  } else {
                    {
                      SubLObject pred_var = NIL;
                      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                        {
                          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw21$GAF, enumeration_types.sense_truth(sense), NIL);
                                    {
                                      SubLObject done_var_12 = NIL;
                                      SubLObject token_var_13 = NIL;
                                      while ((NIL == done_var_12)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                          SubLObject valid_14 = makeBoolean((token_var_13 != assertion));
                                          if ((NIL != valid_14)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_12 = makeBoolean((NIL == valid_14));
                                        }
                                      }
                                    }
                                  } finally {
                                    {
                                      SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                      try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != final_index_iterator)) {
                                          kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                      } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    }
                  }
                } else {
                  if ((NIL != predicate)) {
                    {
                      SubLObject pred_var = predicate;
                      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var))) {
                        {
                          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw21$GAF, enumeration_types.sense_truth(sense), NIL);
                                    {
                                      SubLObject done_var_15 = NIL;
                                      SubLObject token_var_16 = NIL;
                                      while ((NIL == done_var_15)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
                                          SubLObject valid_17 = makeBoolean((token_var_16 != assertion));
                                          if ((NIL != valid_17)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_15 = makeBoolean((NIL == valid_17));
                                        }
                                      }
                                    }
                                  } finally {
                                    {
                                      SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                      try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != final_index_iterator)) {
                                          kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                      } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    }
                  } else {
                    {
                      SubLObject pred_var = NIL;
                      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var))) {
                        {
                          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw21$GAF, enumeration_types.sense_truth(sense), NIL);
                                    {
                                      SubLObject done_var_18 = NIL;
                                      SubLObject token_var_19 = NIL;
                                      while ((NIL == done_var_18)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_19);
                                          SubLObject valid_20 = makeBoolean((token_var_19 != assertion));
                                          if ((NIL != valid_20)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_18 = makeBoolean((NIL == valid_20));
                                        }
                                      }
                                    }
                                  } finally {
                                    {
                                      SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                      try {
                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != final_index_iterator)) {
                                          kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                      } finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                    }
                  }
                }
              }
            } else if (pcase_var.eql($kw25$PREDICATE_EXTENT)) {
              {
                SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw21$GAF, enumeration_types.sense_truth(sense), NIL);
                              {
                                SubLObject done_var_21 = NIL;
                                SubLObject token_var_22 = NIL;
                                while ((NIL == done_var_21)) {
                                  {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                    SubLObject valid_23 = makeBoolean((token_var_22 != assertion));
                                    if ((NIL != valid_23)) {
                                      if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                                          SubLObject gaf_asent = thread.secondMultipleValue();
                                          SubLObject unify_justification = thread.thirdMultipleValue();
                                          thread.resetMultipleValues();
                                          if ((NIL != v_bindings)) {
                                            result = cons(list(v_bindings, assertion), result);
                                          }
                                        }
                                      }
                                    }
                                    done_var_21 = makeBoolean((NIL == valid_23));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
              }
            } else if (pcase_var.eql($kw26$OVERLAP)) {
              {
                SubLObject cdolist_list_var_24 = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5144");
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var_24.first(); (NIL != cdolist_list_var_24); cdolist_list_var_24 = cdolist_list_var_24.rest(), assertion = cdolist_list_var_24.first()) {
                  if (((NIL == enumeration_types.sense_truth(sense))
                      || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sense))))) {
                    if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                      thread.resetMultipleValues();
                      {
                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), T, T);
                        SubLObject gaf_asent = thread.secondMultipleValue();
                        SubLObject unify_justification = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if ((NIL != v_bindings)) {
                          result = cons(list(v_bindings, assertion), result);
                        }
                      }
                    }
                  }
                }
              }
            } else {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30377");
            }
          }
        }
        if ((NIL != result)) {
          return iteration.new_list_iterator(result);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 4069) 
  public static final SubLObject removal_symmetric_lookup_pos_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_commutativity_lookup_cost(asent, $kw27$TRUE);
  }

  public static final class $removal_symmetric_lookup_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_symmetric_lookup_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-SYMMETRIC-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_symmetric_lookup_pos_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_symmetric_lookup_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_symmetric_lookup_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-SYMMETRIC-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_symmetric_lookup_pos_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 5044) 
  public static final SubLObject removal_symmetric_lookup_pos_iterator(SubLObject asent) {
    return removal_commutativity_lookup_iterator(asent, $kw32$POS);
  }

  public static final class $removal_symmetric_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
    public $removal_symmetric_lookup_pos_iterator$UnaryFunction() { super(extractFunctionNamed("REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR")); }
    public SubLObject processItem(SubLObject arg1) { return removal_symmetric_lookup_pos_iterator(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-symmetry.lisp", position = 5290) 
  public static final SubLObject removal_symmetric_supports(SubLObject assertion) {
    {
      SubLObject predicate = assertions_high.gaf_predicate(assertion);
      return list(assertion, removal_module_utilities.additional_isa_support(predicate, $const33$SymmetricBinaryPredicate));
    }
  }

  public static final class $removal_symmetric_supports$UnaryFunction extends UnaryFunction {
    public $removal_symmetric_supports$UnaryFunction() { super(extractFunctionNamed("REMOVAL-SYMMETRIC-SUPPORTS")); }
    public SubLObject processItem(SubLObject arg1) { return removal_symmetric_supports(arg1); }
  }

  public static final SubLObject declare_removal_modules_symmetry_file() {
    declareFunction(myName, "symmetric_asent", "SYMMETRIC-ASENT", 1, 0, false);
    declareFunction(myName, "symmetric_literal", "SYMMETRIC-LITERAL", 1, 0, false);
    declareMacro(myName, "do_formula_commutative_permutations", "DO-FORMULA-COMMUTATIVE-PERMUTATIONS");
    declareMacro(myName, "do_formula_canonical_commutative_permutations", "DO-FORMULA-CANONICAL-COMMUTATIVE-PERMUTATIONS");
    declareFunction(myName, "commutative_in_args_supports", "COMMUTATIVE-IN-ARGS-SUPPORTS", 1, 0, false);
    declareFunction(myName, "removal_commutativity_lookup_cost", "REMOVAL-COMMUTATIVITY-LOOKUP-COST", 2, 0, false);
    declareFunction(myName, "removal_commutativity_check_cost", "REMOVAL-COMMUTATIVITY-CHECK-COST", 2, 0, false);
    declareFunction(myName, "removal_commutativity_generate_cost", "REMOVAL-COMMUTATIVITY-GENERATE-COST", 2, 0, false);
    declareFunction(myName, "removal_commutativity_lookup_iterator", "REMOVAL-COMMUTATIVITY-LOOKUP-ITERATOR", 2, 0, false);
    declareFunction(myName, "removal_symmetric_lookup_pos_cost", "REMOVAL-SYMMETRIC-LOOKUP-POS-COST", 1, 1, false); new $removal_symmetric_lookup_pos_cost$UnaryFunction(); new $removal_symmetric_lookup_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_symmetric_lookup_neg_cost", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_symmetric_lookup_neg_completeness", "REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_symmetric_lookup_pos_iterator", "REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR", 1, 0, false); new $removal_symmetric_lookup_pos_iterator$UnaryFunction();
    declareFunction(myName, "removal_symmetric_lookup_neg_iterator", "REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_symmetric_supports", "REMOVAL-SYMMETRIC-SUPPORTS", 1, 0, false); new $removal_symmetric_supports$UnaryFunction();
    declareFunction(myName, "removal_commutative_lookup_pos_cost", "REMOVAL-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_commutative_lookup_neg_cost", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_commutative_lookup_neg_completeness", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_commutative_lookup_pos_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_commutative_lookup_neg_iterator", "REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_commutative_supports", "REMOVAL-COMMUTATIVE-SUPPORTS", 1, 0, false);
    declareFunction(myName, "removal_partially_commutative_lookup_pos_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_partially_commutative_lookup_neg_cost", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_partially_commutative_lookup_neg_completeness", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_partially_commutative_lookup_pos_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_partially_commutative_lookup_neg_iterator", "REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_partially_commutative_supports", "REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS", 1, 0, false);
    declareFunction(myName, "removal_asymmetric_lookup_cost", "REMOVAL-ASYMMETRIC-LOOKUP-COST", 1, 1, false);
    declareFunction(myName, "removal_asymmetric_lookup_completeness", "REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_asymmetric_lookup_iterator", "REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_asymmetric_supports", "REMOVAL-ASYMMETRIC-SUPPORTS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_symmetry_file() {
    return NIL;
  }

  public static final SubLObject setup_removal_modules_symmetry_file() {
    // CVS_ID("Id: removal-modules-symmetry.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.define_obsolete_register($sym0$SYMMETRIC_LITERAL, $list1);
    inference_modules.inference_removal_module($kw34$REMOVAL_SYMMETRIC_LOOKUP_POS, $list35);
    inference_modules.inference_removal_module($kw36$REMOVAL_SYMMETRIC_LOOKUP_NEG, $list37);
    inference_modules.inference_removal_module($kw39$REMOVAL_COMMUTATIVE_LOOKUP_POS, $list40);
    inference_modules.inference_removal_module($kw41$REMOVAL_COMMUTATIVE_LOOKUP_NEG, $list42);
    inference_modules.inference_removal_module($kw44$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS, $list45);
    inference_modules.inference_removal_module($kw46$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG, $list47);
    inference_modules.inference_removal_module($kw49$REMOVAL_ASYMMETRIC_LOOKUP, $list50);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SYMMETRIC_LITERAL = makeSymbol("SYMMETRIC-LITERAL");
  public static final SubLList $list1 = list(makeSymbol("SYMMETRIC-ASENT"));
  public static final SubLList $list2 = list(list(makeSymbol("PERMUTED-FORMULA"), makeSymbol("SOURCE-FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list3 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw4$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw5$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym6$SOURCE_FORMULA_VAR = makeUninternedSymbol("SOURCE-FORMULA-VAR");
  public static final SubLSymbol $sym7$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym8$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym9$EL_BINARY_FORMULA_P = makeSymbol("EL-BINARY-FORMULA-P");
  public static final SubLSymbol $sym10$SYMMETRIC_ASENT = makeSymbol("SYMMETRIC-ASENT");
  public static final SubLSymbol $sym11$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym12$FORMULA_COMMUTATIVE_PERMUTATIONS = makeSymbol("FORMULA-COMMUTATIVE-PERMUTATIONS");
  public static final SubLSymbol $sym13$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list14 = list(list(makeSymbol("PERMUTED-FORMULA"), makeSymbol("SOURCE-FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("PENETRATE-ARGS?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list15 = list(makeKeyword("DONE"), makeKeyword("PENETRATE-ARGS?"));
  public static final SubLSymbol $kw16$PENETRATE_ARGS_ = makeKeyword("PENETRATE-ARGS?");
  public static final SubLSymbol $sym17$SOURCE_FORMULA_VAR = makeUninternedSymbol("SOURCE-FORMULA-VAR");
  public static final SubLSymbol $sym18$CANONICAL_COMMUTATIVE_PERMUTATIONS = makeSymbol("CANONICAL-COMMUTATIVE-PERMUTATIONS");
  public static final SubLList $list19 = list(makeSymbol("FUNCTION"), makeSymbol("HL-VAR?"));
  public static final SubLObject $const20$commutativeInArgs = constant_handles.reader_make_constant_shell(makeString("commutativeInArgs"));
  public static final SubLSymbol $kw21$GAF = makeKeyword("GAF");
  public static final SubLObject $const22$commutativeInArgsAndRest = constant_handles.reader_make_constant_shell(makeString("commutativeInArgsAndRest"));
  public static final SubLSymbol $sym23$HL_VAR_ = makeSymbol("HL-VAR?");
  public static final SubLSymbol $kw24$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw25$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw26$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw27$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw28$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw29$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw30$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw31$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw32$POS = makeKeyword("POS");
  public static final SubLObject $const33$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));
  public static final SubLSymbol $kw34$REMOVAL_SYMMETRIC_LOOKUP_POS = makeKeyword("REMOVAL-SYMMETRIC-LOOKUP-POS");
  public static final SubLList $list35 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<symmetric predicate> <whatever> <whatever>)\nfrom (<symmetric predicate> <arg2> <arg1>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$Canada #$UnitedStatesOfAmerica)")});
  public static final SubLSymbol $kw36$REMOVAL_SYMMETRIC_LOOKUP_NEG = makeKeyword("REMOVAL-SYMMETRIC-LOOKUP-NEG");
  public static final SubLList $list37 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-SYMMETRIC-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-SYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<symmetric predicate> <whatever> <whatever>))\nfrom (#$not (<symmetric predicate> <arg2> <arg1>)) assertion")});
  public static final SubLObject $const38$CommutativePredicate = constant_handles.reader_make_constant_shell(makeString("CommutativePredicate"));
  public static final SubLSymbol $kw39$REMOVAL_COMMUTATIVE_LOOKUP_POS = makeKeyword("REMOVAL-COMMUTATIVE-LOOKUP-POS");
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$collinear <some point> <some other point> <some other other point>)")});
  public static final SubLSymbol $kw41$REMOVAL_COMMUTATIVE_LOOKUP_NEG = makeKeyword("REMOVAL-COMMUTATIVE-LOOKUP-NEG");
  public static final SubLList $list42 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-COMMUTATIVE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<commutative predicate> . <args>)\nfrom (<commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(#$not (#$collinear <some point> <some other point> <some other other point>))")});
  public static final SubLObject $const43$PartiallyCommutativePredicate = constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativePredicate"));
  public static final SubLSymbol $kw44$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_POS = makeKeyword("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS");
  public static final SubLList $list45 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\n    from \n    (distanceBetween Sun PlanetEarth ((Mega Mile) 93))")});
  public static final SubLSymbol $kw46$REMOVAL_PARTIALLY_COMMUTATIVE_LOOKUP_NEG = makeKeyword("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG");
  public static final SubLList $list47 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PARTIALLY-COMMUTATIVE-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<partially commutative predicate> . <args>)\nfrom (<partially commutative predicate> . <reordered args>) assertion"), makeKeyword("EXAMPLE"), makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\n    from \n    (not (distanceBetween Sun PlanetEarth (Inch 93)))")});
  public static final SubLObject $const48$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));
  public static final SubLSymbol $kw49$REMOVAL_ASYMMETRIC_LOOKUP = makeKeyword("REMOVAL-ASYMMETRIC-LOOKUP");
  public static final SubLList $list50 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("NOT"), makeKeyword("FORT")), list(makeKeyword("NOT"), makeKeyword("FORT"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASYMMETRIC-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASYMMETRIC-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<asymmetric predicate> <non-fort> <non-fort>))\nfrom (<asymmetric predicate> <arg2> <arg1>) assertion.\nNB: the case in which either arg is a FORT is subsumed by\nnegationInverse modules."), makeKeyword("EXAMPLE"), makeString("(#$not (#$northOf #$UnitedStatesOfAmerica #$Canada))")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_symmetry_file();
  }

  public void initializeVariables() {
    init_removal_modules_symmetry_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_symmetry_file();
  }

}
