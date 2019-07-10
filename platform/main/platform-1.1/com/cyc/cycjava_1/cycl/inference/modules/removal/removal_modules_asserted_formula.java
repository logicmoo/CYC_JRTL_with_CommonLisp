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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_lookup;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_symmetry;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_asserted_formula extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_asserted_formula() {}
  public static final SubLFile me = new removal_modules_asserted_formula();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_asserted_formula";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 883) 
  public static final SubLObject removal_asserted_sentence_cost(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject gaf_sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if ((NIL != variables.fully_bound_p(gaf_sentence))) {
          return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
        } else {
          {
            SubLObject sub_literal = el_utilities.literal_atomic_sentence(gaf_sentence);
            SubLObject sub_sense = el_utilities.literal_sense(gaf_sentence);
            SubLObject cost = ZERO_INTEGER;
            SubLObject source_formula_var = sub_literal;
            SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym1$HL_VAR_), T);
            SubLObject permuted_asent = NIL;
            for (permuted_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permuted_asent = cdolist_list_var.first()) {
              cost = Numbers.add(cost, inference_trampolines.inference_num_gaf_lookup_index(permuted_asent, sub_sense));
            }
            return cost;
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 1937) 
  public static final SubLObject removal_asserted_sentence_lookup_pos_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_asserted_sentence_cost(asent);
  }

  public static final class $removal_asserted_sentence_lookup_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_asserted_sentence_lookup_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_asserted_sentence_lookup_pos_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_asserted_sentence_lookup_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_asserted_sentence_lookup_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_asserted_sentence_lookup_pos_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 2248) 
  public static final SubLObject removal_asserted_sentence_lookup_iterator(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject sub_literal = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject sub_asent = el_utilities.literal_atomic_sentence(sub_literal);
        SubLObject sub_sense = el_utilities.literal_sense(sub_literal);
        SubLObject source_formula_var = sub_asent;
        SubLObject cdolist_list_var = cycl_utilities.canonical_commutative_permutations(source_formula_var, Symbols.symbol_function($sym1$HL_VAR_), T);
        SubLObject permuted_asent = NIL;
        for (permuted_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permuted_asent = cdolist_list_var.first()) {
          {
            SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(permuted_asent, sub_sense);
            SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
            SubLObject pcase_var = method;
            if (pcase_var.eql($kw2$GAF_ARG)) {
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw3$GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    {
                                      SubLObject done_var_1 = NIL;
                                      SubLObject token_var_2 = NIL;
                                      while ((NIL == done_var_1)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                          SubLObject valid_3 = makeBoolean((token_var_2 != assertion));
                                          if ((NIL != valid_3)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_1 = makeBoolean((NIL == valid_3));
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw3$GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    {
                                      SubLObject done_var_4 = NIL;
                                      SubLObject token_var_5 = NIL;
                                      while ((NIL == done_var_4)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                          SubLObject valid_6 = makeBoolean((token_var_5 != assertion));
                                          if ((NIL != valid_6)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_4 = makeBoolean((NIL == valid_6));
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw3$GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    {
                                      SubLObject done_var_7 = NIL;
                                      SubLObject token_var_8 = NIL;
                                      while ((NIL == done_var_7)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                          SubLObject valid_9 = makeBoolean((token_var_8 != assertion));
                                          if ((NIL != valid_9)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_7 = makeBoolean((NIL == valid_9));
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw3$GAF, enumeration_types.sense_truth(sub_sense), NIL);
                                    {
                                      SubLObject done_var_10 = NIL;
                                      SubLObject token_var_11 = NIL;
                                      while ((NIL == done_var_10)) {
                                        {
                                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                          SubLObject valid_12 = makeBoolean((token_var_11 != assertion));
                                          if ((NIL != valid_12)) {
                                            if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                                SubLObject gaf_asent = thread.secondMultipleValue();
                                                SubLObject unify_justification = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != v_bindings)) {
                                                  result = cons(list(v_bindings, assertion), result);
                                                }
                                              }
                                            }
                                          }
                                          done_var_10 = makeBoolean((NIL == valid_12));
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
            } else if (pcase_var.eql($kw4$PREDICATE_EXTENT)) {
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw3$GAF, enumeration_types.sense_truth(sub_sense), NIL);
                              {
                                SubLObject done_var_13 = NIL;
                                SubLObject token_var_14 = NIL;
                                while ((NIL == done_var_13)) {
                                  {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                    SubLObject valid_15 = makeBoolean((token_var_14 != assertion));
                                    if ((NIL != valid_15)) {
                                      if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
                                          SubLObject gaf_asent = thread.secondMultipleValue();
                                          SubLObject unify_justification = thread.thirdMultipleValue();
                                          thread.resetMultipleValues();
                                          if ((NIL != v_bindings)) {
                                            result = cons(list(v_bindings, assertion), result);
                                          }
                                        }
                                      }
                                    }
                                    done_var_13 = makeBoolean((NIL == valid_15));
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
            } else if (pcase_var.eql($kw5$OVERLAP)) {
              {
                SubLObject cdolist_list_var_16 = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5122");
                SubLObject assertion = NIL;
                for (assertion = cdolist_list_var_16.first(); (NIL != cdolist_list_var_16); cdolist_list_var_16 = cdolist_list_var_16.rest(), assertion = cdolist_list_var_16.first()) {
                  if (((NIL == enumeration_types.sense_truth(sub_sense))
                      || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth(sub_sense))))) {
                    if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                      thread.resetMultipleValues();
                      {
                        SubLObject v_bindings = unification_utilities.gaf_asent_unify(permuted_asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED);
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
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30356");
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

  public static final class $removal_asserted_sentence_lookup_iterator$UnaryFunction extends UnaryFunction {
    public $removal_asserted_sentence_lookup_iterator$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR")); }
    public SubLObject processItem(SubLObject arg1) { return removal_asserted_sentence_lookup_iterator(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-asserted-formula.lisp", position = 24753) 
  public static SubLSymbol $term_formulas_defining_mt$ = null;

  public static final SubLObject declare_removal_modules_asserted_formula_file() {
    declareFunction(myName, "removal_asserted_sentence_cost", "REMOVAL-ASSERTED-SENTENCE-COST", 1, 0, false);
    declareFunction(myName, "removal_asserted_sentence_lookup_pos_cost", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false); new $removal_asserted_sentence_lookup_pos_cost$UnaryFunction(); new $removal_asserted_sentence_lookup_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_asserted_sentence_lookup_iterator", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR", 1, 0, false); new $removal_asserted_sentence_lookup_iterator$UnaryFunction();
    declareFunction(myName, "removal_asserted_sentence_unbound_lookup_pos_cost", "REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_sentence_unbound_lookup_iterator", "REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_asserted_sentence_lookup_neg_cost", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_sentence_lookup_neg_expand", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_sentence_lookup_neg_expand_internal", "REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND-INTERNAL", 2, 0, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-COST", 1, 0, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_lookup_pos_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_lookup_iterator", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_unbound_lookup_pos_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_unbound_lookup_iterator", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_lookup_neg_cost", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_exactly_asserted_sentence_lookup_neg_expand", "REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_arg_pos_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_arg_pos_check_expand", "REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_arg_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-CHECK-COST", 1, 0, false);
    declareFunction(myName, "removal_asserted_predicate_arg_check", "REMOVAL-ASSERTED-PREDICATE-ARG-CHECK", 1, 0, false);
    declareFunction(myName, "removal_asserted_predicate_arg_neg_check_cost", "REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_arg_neg_check_expand", "REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_term_arg_var_cost", "REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_term_arg_var_expand", "REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_term_var_var_cost", "REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_term_var_var_expand", "REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_var_arg_pred_cost", "REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_predicate_var_arg_pred_expand", "REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND", 1, 1, false);
    declareFunction(myName, "make_term_formulas_support", "MAKE-TERM-FORMULAS-SUPPORT", 1, 0, false);
    declareFunction(myName, "inference_term_formulas_find", "INFERENCE-TERM-FORMULAS-FIND", 2, 0, false);
    declareFunction(myName, "inference_term_formulas_gather", "INFERENCE-TERM-FORMULAS-GATHER", 1, 0, false);
    declareFunction(myName, "inference_term_formulas_count", "INFERENCE-TERM-FORMULAS-COUNT", 1, 0, false);
    declareFunction(myName, "removal_term_formulas_check_cost_pos", "REMOVAL-TERM-FORMULAS-CHECK-COST-POS", 1, 1, false);
    declareFunction(myName, "removal_term_formulas_check_expand_pos", "REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS", 1, 1, false);
    declareFunction(myName, "removal_term_formulas_check", "REMOVAL-TERM-FORMULAS-CHECK", 1, 0, false);
    declareFunction(myName, "removal_term_formulas_check_cost", "REMOVAL-TERM-FORMULAS-CHECK-COST", 1, 0, false);
    declareFunction(myName, "removal_term_formulas_check_cost_neg", "REMOVAL-TERM-FORMULAS-CHECK-COST-NEG", 1, 1, false);
    declareFunction(myName, "removal_term_formulas_check_expand_neg", "REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG", 1, 1, false);
    declareFunction(myName, "removal_term_formulas_unify_cost", "REMOVAL-TERM-FORMULAS-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_term_formulas_unify_expand", "REMOVAL-TERM-FORMULAS-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_sentence_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-SENTENCE-COST", 1, 0, false);
    declareFunction(myName, "removal_asserted_term_sentences_term_index_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-TERM-INDEX-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_check_pos_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_check_pos_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_check_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-COST", 1, 0, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_check_neg_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_check_neg_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_check_neg_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND-INTERNAL", 3, 0, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_iterate_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_iterate_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_gaf_iterate_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND-INTERNAL", 3, 0, false);
    declareFunction(myName, "removal_asserted_term_sentences_arg_index_unify_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_arg_index_unify_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_unify_expand_internal", "REMOVAL-ASSERTED-TERM-SENTENCES-UNIFY-EXPAND-INTERNAL", 3, 0, false);
    declareFunction(myName, "removal_asserted_term_sentences_index_unify_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_index_unify_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_index_variable_cost", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_sentences_index_variable_expand", "REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_terms_index_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-TERMS-INDEX-COST", 1, 0, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_arg1_bound_asent_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-ARG1-BOUND-ASENT-COST", 1, 0, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_index_variable_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_index_variable_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_gaf_check_pos_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_gaf_check_pos_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_gaf_check_neg_cost", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_gaf_check_neg_expand", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_asserted_term_set_sentences_gaf_check_neg_expand_internal", "REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND-INTERNAL", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_asserted_formula_file() {
    $term_formulas_defining_mt$ = deflexical("*TERM-FORMULAS-DEFINING-MT*", maybeDefault( $sym36$_TERM_FORMULAS_DEFINING_MT_, $term_formulas_defining_mt$, ()-> ($const37$BaseKB)));
    return NIL;
  }

  public static final SubLObject setup_removal_modules_asserted_formula_file() {
    // CVS_ID("Id: removal-modules-asserted-formula.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.register_solely_specific_removal_module_predicate($const0$assertedSentence);
    inference_modules.inference_removal_module($kw6$REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS, $list7);
    inference_modules.inference_removal_module($kw8$REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list9);
    inference_modules.inference_removal_module($kw11$REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG, $list12);
    inference_modules.register_solely_specific_removal_module_predicate($const13$exactlyAssertedSentence);
    inference_modules.inference_removal_module($kw14$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS, $list15);
    inference_modules.inference_removal_module($kw16$REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS, $list17);
    inference_modules.inference_removal_module($kw18$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG, $list19);
    inference_modules.register_solely_specific_removal_module_predicate($const20$assertedPredicateArg);
    inference_modules.inference_removal_module($kw21$REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE, $list22);
    inference_modules.inference_removal_module($kw24$REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK, $list25);
    inference_modules.inference_removal_module($kw26$REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK, $list27);
    inference_modules.inference_removal_module($kw28$REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR, $list29);
    inference_modules.inference_removal_module($kw30$REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR, $list31);
    inference_modules.inference_removal_module($kw33$REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED, $list34);
    inference_modules.register_solely_specific_removal_module_predicate($const35$termFormulas);
    subl_macro_promotions.declare_defglobal($sym36$_TERM_FORMULAS_DEFINING_MT_);
    mt_vars.note_mt_var($sym36$_TERM_FORMULAS_DEFINING_MT_, $const35$termFormulas);
    inference_modules.inference_removal_module($kw43$REMOVAL_TERM_FORMULAS_CHECK_POS, $list44);
    inference_modules.inference_removal_module($kw45$REMOVAL_TERM_FORMULAS_CHECK_NEG, $list46);
    inference_modules.inference_removal_module($kw47$REMOVAL_TERM_FORMULAS_UNIFY, $list48);
    inference_modules.register_solely_specific_removal_module_predicate($const49$assertedTermSentences);
    inference_modules.inference_removal_module($kw51$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS, $list52);
    inference_modules.inference_removal_module($kw53$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG, $list54);
    inference_modules.inference_removal_module($kw55$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE, $list56);
    inference_modules.inference_removal_module($kw57$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY, $list58);
    inference_modules.inference_removal_module($kw59$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY, $list60);
    inference_modules.inference_removal_module($kw61$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE, $list62);
    inference_modules.register_solely_specific_removal_module_predicate($const63$assertedTermSetSentences);
    inference_modules.inference_removal_module($kw64$REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE, $list65);
    inference_modules.inference_removal_module($kw66$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS, $list67);
    inference_modules.inference_removal_module($kw68$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG, $list69);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));
  public static final SubLSymbol $sym1$HL_VAR_ = makeSymbol("HL-VAR?");
  public static final SubLSymbol $kw2$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw3$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw4$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw5$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw6$REMOVAL_ASSERTED_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS");
  public static final SubLList $list7 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedSentence")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(constant_handles.reader_make_constant_shell(makeString("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$assertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedSentence (#$genls #$Predicate ?WHAT))\n    (#$assertedSentence (#$genls #$Predicate #$TruthFunction))")});
  public static final SubLSymbol $kw8$REMOVAL_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS = makeKeyword("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");
  public static final SubLList $list9 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedSentence")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(makeKeyword("OR"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P"))), list(constant_handles.reader_make_constant_shell(makeString("not")), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P")))))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(makeKeyword("CALL"), makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$assertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedSentence (?PRED #$Predicate ?WHAT))")});
  public static final SubLSymbol $kw10$MINIMIZE = makeKeyword("MINIMIZE");
  public static final SubLSymbol $kw11$REMOVAL_ASSERTED_SENTENCE_LOOKUP_NEG = makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG");
  public static final SubLList $list12 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedSentence")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedSentence")), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(constant_handles.reader_make_constant_shell(makeString("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedSentence (#$genls #$Predicate #$Thing)))")});
  public static final SubLObject $const13$exactlyAssertedSentence = constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence"));
  public static final SubLSymbol $kw14$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_POS = makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS");
  public static final SubLList $list15 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING")), list(constant_handles.reader_make_constant_shell(makeString("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("ANYTHING"))))), makeKeyword("COST"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), list(makeKeyword("CALL"), makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$exactlyAssertedSentence (<predicate> . <anything>))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$exactlyAssertedSentence (#$genls #$Predicate ?WHAT))\n    (#$exactlyAssertedSentence (#$genls #$Predicate #$TruthFunction))")});
  public static final SubLSymbol $kw16$REMOVAL_EXACTLY_ASSERTED_SENTENCE_UNBOUND_LOOKUP_POS = makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS");
  public static final SubLList $list17 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), list(makeKeyword("OR"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P"))), list(constant_handles.reader_make_constant_shell(makeString("not")), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P")))))), makeKeyword("COST"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-UNBOUND-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), list(makeKeyword("CALL"), makeSymbol("GAF-EL-FORMULA"), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("DOCUMENTATION"), makeString("(#$exactlyAssertedSentence (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$exactlyAssertedSentence (?PRED #$Predicate ?WHAT))")});
  public static final SubLSymbol $kw18$REMOVAL_EXACTLY_ASSERTED_SENTENCE_LOOKUP_NEG = makeKeyword("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG");
  public static final SubLList $list19 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("exactlyAssertedSentence")), list(makeKeyword("OR"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND")), list(constant_handles.reader_make_constant_shell(makeString("not")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))))), makeKeyword("COST"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXACTLY-ASSERTED-SENTENCE-LOOKUP-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$exactlyAssertedSentence (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$exactlyAssertedSentence (#$genls #$Predicate #$Thing)))")});
  public static final SubLObject $const20$assertedPredicateArg = constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg"));
  public static final SubLSymbol $kw21$REMOVAL_ASSERTED_PREDICATE_ARG_PRUNE = makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-PRUNE");
  public static final SubLList $list22 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("INTEGER"))), makeKeyword("ANYTHING")), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("FORT"))))), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("prune these cases :\n    (#$assertedPredicateArg <non-fort>  <whatever>   <whatever>)\n    (#$assertedPredicateArg <whatever> <non-integer> <whatever>)\n    (#$assertedPredicateArg <whatever>  <whatever>   <non-fort>)"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg (#$YearFn 2002) 1 #$isa)\n    (#$assertedPredicateArg #$Predicate (#$PlusFn 1 1) #$genls)\n    (#$assertedPredicateArg #$Predicate 1 \"genls\")\n   ")});
  public static final SubLSymbol $kw23$OPAQUE = makeKeyword("OPAQUE");
  public static final SubLSymbol $kw24$REMOVAL_ASSERTED_PREDICATE_ARG_POS_CHECK = makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK");
  public static final SubLList $list25 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate 1 #$genls)")});
  public static final SubLSymbol $kw26$REMOVAL_ASSERTED_PREDICATE_ARG_NEG_CHECK = makeKeyword("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK");
  public static final SubLList $list27 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("FORT"), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-ARG-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedPredicateArg <fort> <integer> <fort>))\n     using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedPredicateArg #$and 1 #$arity))")});
  public static final SubLSymbol $kw28$REMOVAL_ASSERTED_PREDICATE_TERM_ARG_VAR = makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR");
  public static final SubLList $list29 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("FORT"), makeKeyword("INTEGER"), list(makeKeyword("NOT"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-ARG-VAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <integer> <non-fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate 1 ?WHAT)")});
  public static final SubLSymbol $kw30$REMOVAL_ASSERTED_PREDICATE_TERM_VAR_VAR = makeKeyword("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR");
  public static final SubLList $list31 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("FORT"), list(makeKeyword("NOT"), makeKeyword("INTEGER")), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-TERM-VAR-VAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <fort> <non-integer> <whatever>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg #$Predicate ?ARG ?PRED)")});
  public static final SubLSymbol $kw32$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw33$REMOVAL_ASSERTED_PREDICATE_VAR_ARG_PRED = makeKeyword("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED");
  public static final SubLList $list34 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedPredicateArg")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("INTEGER"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-PREDICATE-VAR-ARG-PRED-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedPredicateArg <non-fort> <integer> <fort>)\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$assertedPredicateArg ?X 1 #$expansion)")});
  public static final SubLObject $const35$termFormulas = constant_handles.reader_make_constant_shell(makeString("termFormulas"));
  public static final SubLSymbol $sym36$_TERM_FORMULAS_DEFINING_MT_ = makeSymbol("*TERM-FORMULAS-DEFINING-MT*");
  public static final SubLObject $const37$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $kw38$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $sym39$CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");
  public static final SubLSymbol $sym40$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
  public static final SubLSymbol $sym41$CLOSED_ = makeSymbol("CLOSED?");
  public static final SubLSymbol $sym42$HL_TERM_P = makeSymbol("HL-TERM-P");
  public static final SubLSymbol $kw43$REMOVAL_TERM_FORMULAS_CHECK_POS = makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-POS");
  public static final SubLList $list44 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-POS"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-POS"), makeKeyword("DOCUMENTATION"), makeString("(#$termFormulas <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termFormulas #$Predicate (#$genls #$Predicate #$TruthFunction))")});
  public static final SubLSymbol $kw45$REMOVAL_TERM_FORMULAS_CHECK_NEG = makeKeyword("REMOVAL-TERM-FORMULAS-CHECK-NEG");
  public static final SubLList $list46 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-COST-NEG"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-CHECK-EXPAND-NEG"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$termFormulas <fully-bound> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$termFormulas #$Predicate (#$genls #$Quantifier #$TruthFunction)))")});
  public static final SubLSymbol $kw47$REMOVAL_TERM_FORMULAS_UNIFY = makeKeyword("REMOVAL-TERM-FORMULAS-UNIFY");
  public static final SubLList $list48 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("POSSIBLY-QUOTED-CYCL-FORMULA-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-FORMULAS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termFormulas <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$termFormulas ?TERM (#$genls #$Predicate #$TruthFunction))")});
  public static final SubLObject $const49$assertedTermSentences = constant_handles.reader_make_constant_shell(makeString("assertedTermSentences"));
  public static final SubLSymbol $kw50$POS = makeKeyword("POS");
  public static final SubLSymbol $kw51$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS");
  public static final SubLList $list52 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate #$TruthFunction)))")});
  public static final SubLSymbol $kw53$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG");
  public static final SubLList $list54 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedTermSentences <fully-bound> (<predicate> . <fully-bound>)))\n    using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedTermSentences #$Quantifier (#$genls #$Predicate #$TruthFunction)))\n    (#$not (#$assertedTermSentences #$Predicate  (#$genls #$TruthFunction #$Predicate)))\n    ")});
  public static final SubLSymbol $kw55$REMOVAL_ASSERTED_TERM_SENTENCES_GAF_ITERATE = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE");
  public static final SubLList $list56 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("NOT-FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-GAF-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <not fully-bound> (<predicate> . <fully-bound>))\n     using only the KB GAF indexing and explicit assertions involving <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences ?TERM (#$genls #$Predicate #$TruthFunction)))")});
  public static final SubLSymbol $kw57$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY");
  public static final SubLList $list58 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("FORT"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> (<predicate> . <not fully-bound>))\n    using only the KB GAF indexing and explicit assertions involving <predicate> and <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (#$genls #$Predicate ?GENL)))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC ?GENL))\n    (#$assertedTermSentences #$Predicate (#$genls ?SPEC #$TruthFunction))\n    ")});
  public static final SubLSymbol $kw59$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_UNIFY = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY");
  public static final SubLList $list60 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("FORT"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-FORT-ARG-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> (<not fully-bound> ... <fort> ...))\n    using only the KB GAF indexing and explicit assertions involving the two FORTs"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate (?PRED #$Predicate ?TERM))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$Collection))\n    (#$assertedTermSentences #$Predicate (?PRED ?TERM #$TruthFunction))\n    ")});
  public static final SubLSymbol $kw61$REMOVAL_ASSERTED_TERM_SENTENCES_INDEX_VARIABLE = makeKeyword("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE");
  public static final SubLList $list62 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSentences")), makeKeyword("FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSentences <fort> <variable>)\n    using only the KB GAF indexing and explicit assertions involving <fort>"), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSentences #$Predicate ?SENTENCE))")});
  public static final SubLObject $const63$assertedTermSetSentences = constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences"));
  public static final SubLSymbol $kw64$REMOVAL_ASSERTED_TERM_SET_SENTENCES_INDEX_VARIABLE = makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE");
  public static final SubLList $list65 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences")), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSetSentences <fully-dound> <variable>)\n    using the overlap indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) ?SENTENCE))")});
  public static final SubLSymbol $kw66$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_POS = makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS");
  public static final SubLList $list67 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences")), makeKeyword("FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$assertedTermSetSentences <fully-dound> ([predicate] . [fully-bound]))\n    using only the KB GAF indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$assertedTermSetSentences (#$TheSet #$Dog #$Mammal) (#$genls #$Dog #$Mammal))")});
  public static final SubLSymbol $kw68$REMOVAL_ASSERTED_TERM_SET_SENTENCES_GAF_CHECK_NEG = makeKeyword("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG");
  public static final SubLList $list69 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("assertedTermSetSentences")), makeKeyword("FULLY-BOUND"), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PREDICATE-P")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ASSERTED-TERM-SET-SENTENCES-GAF-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$assertedTermSetSentences <fully-dound> ([predicate] . [fully-bound])))\n    using only the overlap indexing and explicit assertions involving the terms in <fully-bound>."), makeKeyword("EXAMPLE"), makeString("(#$not (#$assertedTermSetSentences (#$TheSet #$Predicate) (#$isa #$Collection #$Thing)))\n    (#$not (#$assertedTermSetSentences (#$TheSet #$Predicate #$arity) (#$arity #$Predicate 2))) ")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_asserted_formula_file();
  }

  public void initializeVariables() {
    init_removal_modules_asserted_formula_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_asserted_formula_file();
  }

}
