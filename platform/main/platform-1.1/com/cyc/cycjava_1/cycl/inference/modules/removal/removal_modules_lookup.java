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

package  com.cyc.cycjava_1.cycl.inference.modules.removal;

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
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.backward_utilities;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.unification_utilities;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_lookup extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_lookup() {}
  public static final SubLFile me = new removal_modules_lookup();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_lookup";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 883) 
  public static final SubLObject removal_lookup_pos_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != variables.fully_bound_p(asent))) {
      return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
    } else {
      return inference_trampolines.inference_num_gaf_lookup_index(asent, $kw0$POS);
    }
  }

  public static final class $removal_lookup_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_lookup_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_lookup_pos_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_lookup_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_lookup_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_lookup_pos_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 1590) 
  public static final SubLObject removal_completely_asserted_asentP(SubLObject asent) {
    return inference_completeness_utilities.inference_completely_asserted_asentP(asent, mt_relevance_macros.inference_relevant_mt());
  }

  public static final class $removal_completely_asserted_asentP$UnaryFunction extends UnaryFunction {
    public $removal_completely_asserted_asentP$UnaryFunction() { super(extractFunctionNamed("REMOVAL-COMPLETELY-ASSERTED-ASENT?")); }
    public SubLObject processItem(SubLObject arg1) { return removal_completely_asserted_asentP(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 1730) 
  public static final SubLObject removal_lookup_pos_iterator(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, $kw0$POS);
        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
        SubLObject pcase_var = method;
        if (pcase_var.eql($kw1$GAF_ARG)) {
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, enumeration_types.sense_truth($kw0$POS), NIL);
                                {
                                  SubLObject done_var_1 = NIL;
                                  SubLObject token_var_2 = NIL;
                                  while ((NIL == done_var_1)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                      SubLObject valid_3 = makeBoolean((token_var_2 != assertion));
                                      if ((NIL != valid_3)) {
                                        if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                          if ((NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, enumeration_types.sense_truth($kw0$POS), NIL);
                                {
                                  SubLObject done_var_4 = NIL;
                                  SubLObject token_var_5 = NIL;
                                  while ((NIL == done_var_4)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                      SubLObject valid_6 = makeBoolean((token_var_5 != assertion));
                                      if ((NIL != valid_6)) {
                                        if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                          if ((NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, enumeration_types.sense_truth($kw0$POS), NIL);
                                {
                                  SubLObject done_var_7 = NIL;
                                  SubLObject token_var_8 = NIL;
                                  while ((NIL == done_var_7)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                      SubLObject valid_9 = makeBoolean((token_var_8 != assertion));
                                      if ((NIL != valid_9)) {
                                        if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                          if ((NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, enumeration_types.sense_truth($kw0$POS), NIL);
                                {
                                  SubLObject done_var_10 = NIL;
                                  SubLObject token_var_11 = NIL;
                                  while ((NIL == done_var_10)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_11);
                                      SubLObject valid_12 = makeBoolean((token_var_11 != assertion));
                                      if ((NIL != valid_12)) {
                                        if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                          if ((NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                            result = cons(assertion, result);
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
        } else if (pcase_var.eql($kw3$PREDICATE_EXTENT)) {
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, enumeration_types.sense_truth($kw0$POS), NIL);
                          {
                            SubLObject done_var_13 = NIL;
                            SubLObject token_var_14 = NIL;
                            while ((NIL == done_var_13)) {
                              {
                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                SubLObject valid_15 = makeBoolean((token_var_14 != assertion));
                                if ((NIL != valid_15)) {
                                  if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                                    if ((NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                                      result = cons(assertion, result);
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
        } else if (pcase_var.eql($kw4$OVERLAP)) {
          {
            SubLObject cdolist_list_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5137");
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
              if (((NIL == enumeration_types.sense_truth($kw0$POS))
                  || (NIL != assertions_high.assertion_has_truth(assertion, enumeration_types.sense_truth($kw0$POS))))) {
                if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
                  if ((NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED))) {
                    result = cons(assertion, result);
                  }
                }
              }
            }
          }
        } else {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30370");
        }
        if ((NIL != result)) {
          return iteration.new_list_iterator(result);
        }
      }
      return NIL;
    }
  }

  public static final class $removal_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
    public $removal_lookup_pos_iterator$UnaryFunction() { super(extractFunctionNamed("REMOVAL-LOOKUP-POS-ITERATOR")); }
    public SubLObject processItem(SubLObject arg1) { return removal_lookup_pos_iterator(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 6954) 
  public static final SubLObject formula_has_indexed_term_arg_p(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = NIL;
    }
    return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function($sym20$INDEXED_TERM_P), cycl_utilities.formula_args(formula, seqvar_handling), UNPROVIDED, UNPROVIDED, UNPROVIDED));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7557) 
  public static final SubLObject asent_has_indexed_term_arg_p(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = NIL;
    }
    return formula_has_indexed_term_arg_p(asent, seqvar_handling);
  }

  public static final class $asent_has_indexed_term_arg_p$UnaryFunction extends UnaryFunction {
    public $asent_has_indexed_term_arg_p$UnaryFunction() { super(extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P")); }
    public SubLObject processItem(SubLObject arg1) { return asent_has_indexed_term_arg_p(arg1, UNPROVIDED); }
  }

  public static final class $asent_has_indexed_term_arg_p$BinaryFunction extends BinaryFunction {
    public $asent_has_indexed_term_arg_p$BinaryFunction() { super(extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return asent_has_indexed_term_arg_p(arg1, arg2); }
  }

  public static final SubLObject declare_removal_modules_lookup_file() {
    declareFunction(myName, "removal_lookup_pos_cost", "REMOVAL-LOOKUP-POS-COST", 1, 1, false); new $removal_lookup_pos_cost$UnaryFunction(); new $removal_lookup_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_completely_asserted_asentP", "REMOVAL-COMPLETELY-ASSERTED-ASENT?", 1, 0, false); new $removal_completely_asserted_asentP$UnaryFunction();
    declareFunction(myName, "removal_lookup_pos_iterator", "REMOVAL-LOOKUP-POS-ITERATOR", 1, 0, false); new $removal_lookup_pos_iterator$UnaryFunction();
    declareFunction(myName, "removal_lookup_neg_completeness", "REMOVAL-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_lookup_neg_cost", "REMOVAL-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_lookup_neg_iterator", "REMOVAL-LOOKUP-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_lookup_expand_internal", "REMOVAL-LOOKUP-EXPAND-INTERNAL", 2, 0, false);
    declareFunction(myName, "removal_pred_unbound_cost", "REMOVAL-PRED-UNBOUND-COST", 1, 1, false);
    declareFunction(myName, "removal_pred_unbound_iterator", "REMOVAL-PRED-UNBOUND-ITERATOR", 1, 0, false);
    declareFunction(myName, "pred_unbound_pos_preference", "PRED-UNBOUND-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "formula_contains_indexed_termP", "FORMULA-CONTAINS-INDEXED-TERM?", 1, 1, false);
    declareFunction(myName, "formula_has_indexed_term_arg_p", "FORMULA-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
    declareFunction(myName, "formula_has_fort_arg_p", "FORMULA-HAS-FORT-ARG-P", 1, 1, false);
    declareFunction(myName, "asent_has_fort_arg_p", "ASENT-HAS-FORT-ARG-P", 1, 1, false);
    declareFunction(myName, "asent_has_indexed_term_arg_p", "ASENT-HAS-INDEXED-TERM-ARG-P", 1, 1, false); new $asent_has_indexed_term_arg_p$UnaryFunction(); new $asent_has_indexed_term_arg_p$BinaryFunction();
    return NIL;
  }

  public static final SubLObject init_removal_modules_lookup_file() {
    return NIL;
  }

  public static final SubLObject setup_removal_modules_lookup_file() {
    // CVS_ID("Id: removal-modules-lookup.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.inference_removal_module($kw5$REMOVAL_LOOKUP_POS, $list6);
    inference_modules.inference_removal_module($kw10$REMOVAL_LOOKUP_NEG, $list11);
    inference_modules.inference_removal_module($kw14$REMOVAL_PRED_UNBOUND, $list15);
    preference_modules.inference_preference_module($kw16$PRED_UNBOUND_POS, $list17);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$POS = makeKeyword("POS");
  public static final SubLSymbol $kw1$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw2$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw3$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw4$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw5$REMOVAL_LOOKUP_POS = makeKeyword("REMOVAL-LOOKUP-POS");
  public static final SubLList $list6 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-LOOKUP-POS-COST"), makeKeyword("COMPLETE-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>)\nusing true assertions and GAF indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$UnitedStatesOfAmerica ?COUNTRY)\n (#$bordersOn #$UnitedStatesOfAmerica #$Canada)\n (#$resultIsa #$JuvenileFn #$JuvenileAnimal)")});
  public static final SubLSymbol $kw7$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw8$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw9$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw10$REMOVAL_LOOKUP_NEG = makeKeyword("REMOVAL-LOOKUP-NEG");
  public static final SubLList $list11 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nusing false assertions and GAF indexing in the KB")});
  public static final SubLSymbol $sym12$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const13$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw14$REMOVAL_PRED_UNBOUND = makeKeyword("REMOVAL-PRED-UNBOUND");
  public static final SubLList $list15 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("FORMULA-CONTAINS-INDEXED-TERM?"))), makeKeyword("COST"), makeSymbol("REMOVAL-PRED-UNBOUND-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-PRED-UNBOUND-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(<variable> ... <fort> ... )\nusing true assertions and GAF indexing on <fort>.\nThis is a last-resort if <variable> occurs elsewhere."), makeKeyword("EXAMPLE"), makeString("(?PREDICATE #$UnitedStatesOfAmerica #$Canada)")});
  public static final SubLSymbol $kw16$PRED_UNBOUND_POS = makeKeyword("PRED-UNBOUND-POS");
  public static final SubLList $list17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("PRED-UNBOUND-POS-PREFERENCE"));
  public static final SubLSymbol $kw18$GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
  public static final SubLSymbol $kw19$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $sym20$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym21$FORT_P = makeSymbol("FORT-P");

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_lookup_file();
  }

  public void initializeVariables() {
    init_removal_modules_lookup_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_lookup_file();
  }

}
