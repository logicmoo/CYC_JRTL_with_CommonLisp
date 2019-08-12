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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.*;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arg_type;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_routines;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.hlmt_czer;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.precanonicalizer;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.special_variable_state;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.verbosifier;
//dm import com.cyc.cycjava_1.cycl.wff_macros;
//dm import com.cyc.cycjava_1.cycl.wff_module_datastructures;
//dm import com.cyc.cycjava_1.cycl.wff_utilities;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class wff extends SubLTranslatedFile {

  //// Constructor

  private wff() {}
  public static final SubLFile me = new wff();
  public static final String myName = "com.cyc.cycjava_1.cycl.wff";

  //// Definitions

  /** is <sentence> a well-formed el sentence? */
  @SubL(source = "cycl/wff.lisp", position = 1315) 
  public static final SubLObject el_wffP(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject plist_var = v_properties;
        checkType(plist_var, $sym0$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym1$WFF_PROPERTY_P);
            }
          }
        }
      }
      {
        SubLObject wffP = NIL;
        {
          SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
          SubLObject _prev_bind_1 = wff_vars.$wff_original_formula$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$wff_memoization_state$.currentBinding(thread);
          try {
            wff_vars.$wff_formula$.bind(sentence, thread);
            wff_vars.$wff_original_formula$.bind((((NIL != wff_macros.within_wffP())
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32202"))) ? ((SubLObject) Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32203")) : sentence), thread);
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            {
              SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
              {
                SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                  memoization_state.$memoization_state$.bind(local_state, thread);
                  {
                    SubLObject original_memoization_process = NIL;
                    if (((NIL != local_state)
                         && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                      original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                      {
                        SubLObject current_proc = Threads.current_process();
                        if ((NIL == original_memoization_process)) {
                          memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                        } else {
                          if ((original_memoization_process != current_proc)) {
                            Errors.error($str2$Invalid_attempt_to_reuse_memoizat);
                          }
                        }
                      }
                    }
                    try {
                      if ((NIL == wff_macros.within_wffP())) {
                        reset_wff_state();
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                          {
                            SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                            SubLObject svs = wff_svs;
                            {
                              SubLObject _prev_bind_0_3 = wff_vars.$wff_properties$.currentBinding(thread);
                              try {
                                wff_vars.$wff_properties$.bind(svs, thread);
                                {
                                  SubLObject svs_var = svs;
                                  checkType(svs_var, $sym3$SPECIAL_VARIABLE_STATE_P);
                                  {
                                    SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                                    final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                                    try {
                                      Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                                      wffP = wffP(sentence, $kw4$ELF, mt);
                                    } finally {
                                      Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                                    }
                                  }
                                }
                              } finally {
                                wff_vars.$wff_properties$.rebind(_prev_bind_0_3, thread);
                              }
                            }
                          }
                          if (((NIL != local_state)
                               && (NIL == original_memoization_process))) {
                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                          }
                        } finally {
                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                        }
                      }
                    }
                  }
                } finally {
                  memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                }
              }
            }
          } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_original_formula$.rebind(_prev_bind_1, thread);
            wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
          }
        }
        return wffP;
      }
    }
  }

  
  @SubL(source = "cycl/wff.lisp", position = 2284) 
  public static final SubLObject wffP(SubLObject formula, SubLObject type, SubLObject mt) {
    if ((type == UNPROVIDED)) {
      type = $kw4$ELF;
    }
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject wffP = NIL;
        if ((NIL == mt)) {
          mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        {
          SubLObject pcase_var = type;
          if (pcase_var.eql($kw4$ELF)) {
            wffP = wff_elfP(formula, mt);
          } else if (pcase_var.eql($kw5$CNF)) {
            wffP = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8101");
          } else if (pcase_var.eql($kw6$DNF)) {
            wffP = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8103");
          } else if (pcase_var.eql($kw7$NAF)) {
            wffP = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8106");
          } else {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8105");
          }
        }
        return wffP;
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 3002) 
  public static final SubLObject reset_wff_state() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == czer_vars.$within_canonicalizerP$.getDynamicValue(thread))) {
        czer_main.clear_canon_caches();
      }
      reset_wff_violations();
      reset_wff_suggestions();
      at_utilities.reset_at_state();
      return NIL;
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 3259) 
  public static final SubLObject mal_precanonicalizationsP(SubLObject formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject precanonicalized_formula = precanonicalizer.safe_precanonicalizations(formula, mt);
        SubLObject precanonicalized_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == precanonicalized_formula)
            || (NIL == precanonicalized_mt))) {
          if ((NIL == wff_violations())) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8075");
          }
          return T;
        }
      }
      return list_utilities.sublisp_boolean(wff_violations());
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 3866) 
  public static final SubLObject syntactically_wff_elf_intP(SubLObject sentence, SubLObject check_fast_gafP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject wffP = T;
        {
          SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
          try {
            wff_vars.$within_wffP$.bind(T, thread);
            if ((NIL != wff_utilities.mal_variablesP(sentence))) {
              wffP = NIL;
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8076");
            }
          } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
          }
        }
        {
          SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
          try {
            wff_vars.$within_wffP$.bind(T, thread);
            if ((NIL != wffP)) {
              if (((NIL != wff_utilities.$check_wff_constantsP$.getDynamicValue(thread))
                   && (NIL != mal_fortsP(sentence)))) {
                wffP = NIL;
                note_wff_violation(list($kw13$MAL_FORTS,mal_forts(sentence)));
              }
            }
          } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
          }
        }
        {
          SubLObject _prev_bind_0 = wff_vars.$within_wffP$.currentBinding(thread);
          try {
            wff_vars.$within_wffP$.bind(T, thread);
            if ((NIL != wffP)) {
              if (((NIL != check_fast_gafP)
                   && (NIL != wff_fast_gafP(sentence)))) {
                wffP = T;
              } else if ((NIL != cycl_grammar.cycl_sentence_p(sentence))) {
                wffP = T;
              } else {
                wffP = NIL;
              }
            }
          } finally {
            wff_vars.$within_wffP$.rebind(_prev_bind_0, thread);
          }
        }
        return wffP;
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 4516) 
  public static final SubLObject wff_elfP(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject wffP = T;
        SubLObject violations = NIL;
        {
          SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
          try {
            wff_vars.$wff_violations$.bind(NIL, thread);
            wffP = syntactically_wff_elf_intP(sentence, NIL);
            {
              SubLObject wff_mt = cycl_utilities.reify_when_closed_naut(mt);
              if ((NIL == wff_doneP(wffP))) {
                if ((NIL == hlmt.hlmt_p(wff_mt))) {
                  sentence = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30598");
                  wff_mt = $const14$BaseKB;
                }
                if ((NIL != wff_utilities.mal_mt_specP(wff_mt))) {
                  wffP = NIL;
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8078");
                  if (((NIL != provide_wff_suggestionsP())
                       && (NIL != hlmt.hlmt_p(wff_mt))
                       && (NIL != fort_types_interface.mt_in_any_mtP(wff_mt)))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8020");
                  }
                }
              }
              if ((!(((NIL != wff_only_needs_syntactic_checksP())
                    || (NIL == wffP))))) {
                {
                  SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(wff_mt);
                  {
                    SubLObject _prev_bind_0_7 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                      mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                      mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                      mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                      if ((NIL == wff_doneP(wffP))) {
                        {
                          SubLObject _prev_bind_0_8 = wff_vars.$within_wffP$.currentBinding(thread);
                          try {
                            wff_vars.$within_wffP$.bind(T, thread);
                            wffP = makeBoolean((NIL == mal_precanonicalizationsP(sentence, wff_mt)));
                          } finally {
                            wff_vars.$within_wffP$.rebind(_prev_bind_0_8, thread);
                          }
                        }
                      }
                      if ((NIL == wff_doneP(wffP))) {
                        {
                          SubLObject _prev_bind_0_9 = wff_utilities.$check_arityP$.currentBinding(thread);
                          SubLObject _prev_bind_1_10 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                          SubLObject _prev_bind_2_11 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                          SubLObject _prev_bind_3 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                          try {
                            wff_utilities.$check_arityP$.bind(NIL, thread);
                            wff_utilities.$check_arg_typesP$.bind(wff_check_argsP(), thread);
                            wff_utilities.$check_wff_coherenceP$.bind(wff_check_coherenceP(), thread);
                            wff_utilities.$check_var_typesP$.bind(wff_check_varsP(), thread);
                            {
                              SubLObject _prev_bind_0_12 = wff_vars.$within_wffP$.currentBinding(thread);
                              try {
                                wff_vars.$within_wffP$.bind(T, thread);
                                wffP = makeBoolean(((NIL != wff_elf_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread)))
                                       && (NIL != wffP)));
                              } finally {
                                wff_vars.$within_wffP$.rebind(_prev_bind_0_12, thread);
                              }
                            }
                            if ((NIL == wff_doneP(wffP))) {
                              if ((NIL != check_var_typesP(sentence, UNPROVIDED))) {
                                {
                                  SubLObject _prev_bind_0_13 = wff_vars.$within_wffP$.currentBinding(thread);
                                  try {
                                    wff_vars.$within_wffP$.bind(T, thread);
                                    if ((NIL == ((NIL != at_vars.$at_assume_conjuncts_independentP$.getDynamicValue(thread)) ? ((SubLObject) at_var_types.formula_var_types_ok_intP(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread))) : Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11780")))) {
                                      wffP = NIL;
                                      note_wff_violations(Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7235"));
                                    }
                                  } finally {
                                    wff_vars.$within_wffP$.rebind(_prev_bind_0_13, thread);
                                  }
                                }
                              }
                            }
                            if ((NIL == wff_doneP(wffP))) {
                              if ((NIL != check_wff_coherenceP(sentence, $kw4$ELF))) {
                                {
                                  SubLObject _prev_bind_0_14 = wff_vars.$within_wffP$.currentBinding(thread);
                                  try {
                                    wff_vars.$within_wffP$.bind(T, thread);
                                    if ((NIL == Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8102"))) {
                                      wffP = NIL;
                                    }
                                  } finally {
                                    wff_vars.$within_wffP$.rebind(_prev_bind_0_14, thread);
                                  }
                                }
                              }
                            }
                          } finally {
                            wff_utilities.$check_var_typesP$.rebind(_prev_bind_3, thread);
                            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2_11, thread);
                            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_10, thread);
                            wff_utilities.$check_arityP$.rebind(_prev_bind_0_9, thread);
                          }
                        }
                      }
                      if ((NIL == wff_doneP(wffP))) {
                        if ((NIL != check_wff_expansionP(sentence))) {
                          {
                            SubLObject _prev_bind_0_15 = control_vars.$within_assert$.currentBinding(thread);
                            try {
                              control_vars.$within_assert$.bind(NIL, thread);
                              thread.resetMultipleValues();
                              {
                                SubLObject expansion = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8104");
                                SubLObject mt_16 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                  SubLObject _prev_bind_0_17 = at_vars.$relax_arg_constraints_for_disjunctionsP$.currentBinding(thread);
                                  try {
                                    at_vars.$relax_arg_constraints_for_disjunctionsP$.bind(makeBoolean((NIL == el_utilities.atomic_sentenceP(sentence))), thread);
                                    if ((!(((NIL == expansion)
                                          || sentence.equal(expansion))))) {
                                      {
                                        SubLObject _prev_bind_0_18 = wff_vars.$unexpanded_formula$.currentBinding(thread);
                                        SubLObject _prev_bind_1_19 = wff_vars.$validate_expansionsP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_20 = wff_vars.$validating_expansionP$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = wff_vars.$wff_expansion_formula$.currentBinding(thread);
                                        try {
                                          wff_vars.$unexpanded_formula$.bind(sentence, thread);
                                          wff_vars.$validate_expansionsP$.bind(NIL, thread);
                                          wff_vars.$validating_expansionP$.bind(T, thread);
                                          wff_vars.$wff_expansion_formula$.bind((((NIL != wff_macros.within_wffP())
                                                 && (NIL != Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32200"))) ? ((SubLObject) Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32201")) : expansion), thread);
                                          if ((NIL == wff_elfP(expansion, mt_16))) {
                                            wffP = NIL;
                                          }
                                        } finally {
                                          wff_vars.$wff_expansion_formula$.rebind(_prev_bind_3, thread);
                                          wff_vars.$validating_expansionP$.rebind(_prev_bind_2_20, thread);
                                          wff_vars.$validate_expansionsP$.rebind(_prev_bind_1_19, thread);
                                          wff_vars.$unexpanded_formula$.rebind(_prev_bind_0_18, thread);
                                        }
                                      }
                                    }
                                  } finally {
                                    at_vars.$relax_arg_constraints_for_disjunctionsP$.rebind(_prev_bind_0_17, thread);
                                  }
                                }
                              }
                            } finally {
                              control_vars.$within_assert$.rebind(_prev_bind_0_15, thread);
                            }
                          }
                        }
                      }
                    } finally {
                      mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                      mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                      mt_relevance_macros.$mt$.rebind(_prev_bind_0_7, thread);
                    }
                  }
                }
              }
            }
            violations = wff_violations();
          } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
          }
        }
        note_wff_violations(violations);
        return wffP;
      }
    }
  }

  /** Is SENTENCE well-formed wrt syntax? */
  @SubL(source = "cycl/wff.lisp", position = 7833) 
  public static final SubLObject el_wff_syntaxP(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return syntactically_wff_elf_intP(sentence, T);
  }

  @SubL(source = "cycl/wff.lisp", position = 8048) 
  public static final SubLObject wff_elf_intP(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (($const25$True == sentence)) {
      return T;
    } else if (($const26$False == sentence)) {
      return makeBoolean((NIL == control_vars.within_assertP()));
    } else if ((NIL != wff_fast_gafP(sentence))) {
      return T;
    } else {
      return semantically_wff_elf_intP(sentence, mt);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 8700) 
  public static final SubLObject semantically_wff_elf_intP(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != assertion_handles.assertion_p(sentence))) {
        return T;
      } else if ((NIL != el_utilities.el_atomic_sentenceP(sentence))) {
        return semantically_wf_literalP(sentence, mt);
      } else if ((NIL != el_utilities.el_non_atomic_sentenceP(sentence))) {
        return semantically_wf_non_atomic_sentenceP(sentence, mt);
      } else if ((NIL != cycl_variables.cyc_varP(sentence))) {
        return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31894"))) {
        return NIL;
      } else {
        return Errors.error($str27$Got_a_sentence_that_was_neither_a, mt, sentence);
      }
    }
  }

  /** @return boolean; t iff SENTENCE is a gaf which is well-formed (a quick check before a more involved analysis of well-formedness)
   Returning NIL does not mean that SENTENCE is ill-formed. */
  @SubL(source = "cycl/wff.lisp", position = 9545) 
  public static final SubLObject wff_fast_gafP(SubLObject sentence) {
    return makeBoolean(((NIL != no_wff_semanticsP())
           && (NIL != conses_high.member(cycl_utilities.formula_operator(sentence), $list28, UNPROVIDED, UNPROVIDED))
           && (NIL != el_utilities.formula_arityE(sentence, TWO_INTEGER, UNPROVIDED))
           && (NIL == el_utilities.contains_subformula_p(sentence))
           && (NIL != el_utilities.groundP(sentence, Symbols.symbol_function($sym29$EL_VAR_)))));
  }

  /** @return booleanp; t iff arg-type analysis should in fact impose arity checks on nats */
  @SubL(source = "cycl/wff.lisp", position = 13725) 
  public static final SubLObject check_arityP(SubLObject formula_arg0, SubLObject argnum) {
    if ((formula_arg0 == UNPROVIDED)) {
      formula_arg0 = NIL;
    }
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_utilities.$check_arityP$.getDynamicValue(thread))
             && ((!(((NIL != forts.fort_p(formula_arg0))
                   && argnum.isInteger())))
              || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7971")))));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14052) 
  public static final SubLObject wff_check_argsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_utilities.$check_arg_typesP$.getDynamicValue(thread))
             && (NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14153) 
  public static final SubLObject wff_check_coherenceP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))
             && (NIL != wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14263) 
  public static final SubLObject wff_check_varsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread))
             && (NIL != wff_check_argsP())));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14359) 
  public static final SubLObject inhibit_skolem_assertsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$inhibit_skolem_assertsP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14438) 
  public static final SubLObject enforce_evaluatable_satisfiabilityP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$enforce_evaluatable_satisfiabilityP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14541) 
  public static final SubLObject enforce_only_definitional_gafs_in_vocab_mtP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$enforce_only_definitional_gafs_in_vocab_mtP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14660) 
  public static final SubLObject enforce_literal_idiosyncrasiesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$enforce_literal_wff_idiosyncrasiesP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 14759) 
  public static final SubLObject check_var_typesP(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym31$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == wff_macros.within_wffP())) {
        if ((NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread))) {
          return list_utilities.tree_find_if(varP, formula, UNPROVIDED);
        }
      }
      return NIL;
    }
  }

  /** @return boolean; t iff ALL semantic wff checking is disabled. */
  @SubL(source = "cycl/wff.lisp", position = 14980) 
  public static final SubLObject no_wff_semanticsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL == wff_utilities.$check_arg_typesP$.getDynamicValue(thread))
             && (NIL == wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread))
             && (NIL == wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))
             && (NIL == wff_utilities.$check_var_typesP$.getDynamicValue(thread))
             && (NIL == at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread))
             && (NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread))));
    }
  }

  /** Whether the wff-checker can use the CycL grammar instead of the full semantic wff-checker. */
  @SubL(source = "cycl/wff.lisp", position = 15507) 
  public static final SubLObject wff_only_needs_syntactic_checksP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_utilities.$use_cycl_grammar_if_semantic_checking_disabledP$.getDynamicValue(thread))
             && (NIL == wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))
             && (NIL != no_wff_semanticsP())));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 15791) 
  public static final SubLObject check_wff_expansionP(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == wff_macros.within_wffP())) {
        if ((NIL != wff_vars.$validate_expansionsP$.getDynamicValue(thread))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4365");
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 16028) 
  public static final SubLObject check_wff_coherenceP(SubLObject formula, SubLObject form) {
    if ((form == UNPROVIDED)) {
      form = $kw4$ELF;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == wff_macros.within_wffP())) {
        if ((NIL != wff_utilities.$check_wff_coherenceP$.getDynamicValue(thread))) {
          {
            SubLObject pcase_var = form;
            if (pcase_var.eql($kw4$ELF)) {
              return makeBoolean((NIL == el_utilities.el_atomic_sentenceP(formula)));
            } else if (pcase_var.eql($kw5$CNF)) {
              return makeBoolean((NIL == clauses.gaf_cnfP(formula)));
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 16270) 
  public static final SubLObject wff_doneP(SubLObject wffP) {
    if ((wffP == UNPROVIDED)) {
      wffP = T;
    }
    if ((NIL == accumulating_el_violationsP())) {
      return makeBoolean(((NIL == wffP)
            || (NIL != wff_violations())));
    }
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 16405) 
  public static final SubLObject mal_fortsP(SubLObject expression) {
    return cycl_utilities.expression_find_if(Symbols.symbol_function($sym32$NON_WF_FORT_P), expression, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/wff.lisp", position = 16620) 
  public static final SubLObject mal_forts(SubLObject expression) {
    return cycl_utilities.expression_gather(expression, Symbols.symbol_function($sym32$NON_WF_FORT_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/wff.lisp", position = 17715) 
  public static final SubLObject semantically_wf_literalP(SubLObject literal, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != wff_macros.within_wffP())) {
        return memoized_semantically_wf_literalP(literal, mt, no_wff_semanticsP(), wff_utilities.check_assertible_literalP());
      } else {
        {
          SubLObject wffP = NIL;
          {
            SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding(thread);
            try {
              wff_vars.$wff_violations$.bind(NIL, thread);
              wffP = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8010");
              if ((NIL == wff_doneP(wffP))) {
                wffP = memoized_semantically_wf_literalP(literal, mt, no_wff_semanticsP(), wff_utilities.check_assertible_literalP());
              }
            } finally {
              wff_vars.$wff_violations$.rebind(_prev_bind_0, thread);
            }
          }
          return wffP;
        }
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 19021) 
  public static final SubLObject memoized_semantically_wf_literalP_internal(SubLObject literal, SubLObject mt, SubLObject no_semanticsP, SubLObject check_assertibleP) {
    if (((NIL == wff_utilities.check_assertible_literalP())
        || (NIL != assertible_literalP(literal, mt)))) {
      return makeBoolean(((NIL != semantically_wf_sentenceP(literal, mt))
             && (NIL != wff_wrt_literal_idiosyncrasiesP(literal, mt))));
    }
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 19021) 
  public static final SubLObject memoized_semantically_wf_literalP(SubLObject literal, SubLObject mt, SubLObject no_semanticsP, SubLObject check_assertibleP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_semantically_wf_literalP_internal(literal, mt, no_semanticsP, check_assertibleP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(literal, mt, no_semanticsP, check_assertibleP);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (literal.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (no_semanticsP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args)
                             && (NIL == cached_args.rest())
                             && check_assertibleP.equal(cached_args.first()))) {
                          return memoization_state.caching_results(results2);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_semantically_wf_literalP_internal(literal, mt, no_semanticsP, check_assertibleP)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(literal, mt, no_semanticsP, check_assertibleP));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** applies to top-level and sub-formula literals */
  @SubL(source = "cycl/wff.lisp", position = 19371) 
  public static final SubLObject assertible_literalP(SubLObject literal, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject unassertibleP = NIL;
        if ((NIL != inhibit_skolem_assertsP())) {
          if ((NIL == pred_of_editable_skolem_gafP(el_utilities.literal_predicate(literal, UNPROVIDED)))) {
            if ((NIL != non_editable_skolem_referenceP(literal))) {
              unassertibleP = T;
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8082");
            }
          }
        }
        if ((NIL == wff_doneP(makeBoolean((NIL == unassertibleP))))) {
          if ((NIL != enforce_evaluatable_satisfiabilityP())) {
            if ((NIL != el_utilities.closedP(literal, Symbols.symbol_function($sym31$CYC_VAR_)))) {
              if ((NIL != relation_evaluation.evaluatable_predicateP(el_utilities.literal_predicate(literal, UNPROVIDED), mt))) {
                thread.resetMultipleValues();
                {
                  SubLObject answer = relation_evaluation.cyc_evaluate(literal);
                  SubLObject validP = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if ((NIL != validP)) {
                    if ((!(((NIL != answer)
                           && (answer != $const26$False))))) {
                      unassertibleP = T;
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8083");
                    }
                  }
                }
              }
            }
          }
        }
        if ((NIL == wff_doneP(makeBoolean((NIL == unassertibleP))))) {
          thread.resetMultipleValues();
          {
            SubLObject unwrapped_literal = czer_utilities.unwrap_if_ist_permissive(literal, mt);
            SubLObject unwrapped_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject decontextualized_literalP = kb_accessors.decontextualized_literalP(unwrapped_literal);
              SubLObject decontextualized_mt = NIL;
              if ((NIL != decontextualized_literalP)) {
                decontextualized_mt = kb_accessors.decontextualized_literal_convention_mt(unwrapped_literal);
                if ((NIL == kb_accessors.mt_matches_convention_mtP(unwrapped_mt, decontextualized_mt))) {
                  unwrapped_mt = decontextualized_mt;
                }
              }
              if ((!(((NIL != at_vars.$within_functionP$.getDynamicValue(thread))
                    || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread)))))) {
                if (((NIL != unwrapped_mt)
                     && (NIL != kb_accessors.not_assertible_mtP(unwrapped_mt)))) {
                  unassertibleP = T;
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8084");
                }
              }
            }
          }
        }
        if ((NIL == wff_doneP(makeBoolean((NIL == unassertibleP))))) {
          if ((!(((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))
                || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))
                || (NIL == el_utilities.closedP(literal, UNPROVIDED)))))) {
            if ((NIL != kb_accessors.not_assertible_predicateP(el_utilities.literal_predicate(literal, UNPROVIDED), mt))) {
              unassertibleP = T;
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8085");
            } else if (((NIL != el_utilities.isa_litP(literal))
                 && (NIL != kb_accessors.not_assertible_collectionP(el_utilities.literal_arg2(literal, UNPROVIDED), mt)))) {
              unassertibleP = T;
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8086");
            }
          }
        }
        if ((NIL == wff_doneP(makeBoolean((NIL == unassertibleP))))) {
          if ((!(((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))
                || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread)))))) {
            if (((NIL != wff_vars.$reject_sbhl_conflictsP$.getDynamicValue(thread))
                 && (NIL != sbhl_literal_conflictP(literal, mt)))) {
              unassertibleP = T;
            }
          }
        }
        if ((NIL != enforce_only_definitional_gafs_in_vocab_mtP())) {
          if ((NIL == wff_doneP(makeBoolean((NIL == unassertibleP))))) {
            if ((!(((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                  || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))
                  || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))
                  || (NIL == el_utilities.closedP(literal, UNPROVIDED)))))) {
              {
                SubLObject assert_mt = ((NIL != mt) ? ((SubLObject) mt) : mt_relevance_macros.$mt$.getDynamicValue(thread));
                SubLObject assert_pred = el_utilities.literal_predicate(literal, UNPROVIDED);
                if (((NIL != hlmt.hlmt_p(assert_mt))
                     && (NIL != forts.fort_p(assert_pred))
                     && (NIL != isa.isaP(assert_mt, $const41$VocabularyMicrotheory, UNPROVIDED, UNPROVIDED)))) {
                  if ((!(((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7975"))
                        || (NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8011")))))) {
                    unassertibleP = T;
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8087");
                  }
                }
              }
            }
          }
        }
        return makeBoolean((NIL == unassertibleP));
      }
    }
  }

  /** @return boolean; t iff literal, if asserted, establishes a sbhl conflict */
  @SubL(source = "cycl/wff.lisp", position = 23415) 
  public static final SubLObject sbhl_literal_conflictP(SubLObject literal, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject conflictP = NIL;
      if ((NIL != czer_utilities.within_negationP())) {
        if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8096"))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8088");
          conflictP = T;
        }
      } else {
        if ((NIL != sbhl_falseP(literal, mt))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8089");
          conflictP = T;
        }
      }
      return conflictP;
    }
  }

  /** @return boolean; t iff ASENT is known to be false via sbhl inference */
  @SubL(source = "cycl/wff.lisp", position = 24449) 
  public static final SubLObject sbhl_falseP(SubLObject asent, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pred = el_utilities.literal_predicate(asent, UNPROVIDED);
      SubLObject arg1 = el_utilities.literal_arg1(asent, UNPROVIDED);
      SubLObject arg2 = el_utilities.literal_arg2(asent, UNPROVIDED);
      if (((NIL != sbhl_module_utilities.sbhl_non_time_predicate_p(pred))
           && (NIL != term.el_fort_p(arg2)))) {
        {
          SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
          if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
            return sbhl_search_methods.sbhl_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED);
          } else {
            return sbhl_search_implied_relations.sbhl_implied_false_predicate_relation_p(module, arg1, arg2, mt, UNPROVIDED);
          }
        }
      }
    }
    return NIL;
  }

  /** @return term or nil; term is object or a component of object that 
   is returned iff that component has a variable within the scope of 
   a skolem as a functor. */
  @SubL(source = "cycl/wff.lisp", position = 24992) 
  public static final SubLObject non_editable_skolem_referenceP(SubLObject object) {
    if (((NIL != constant_handles.constant_p(object))
         && (NIL != term.fast_reified_skolemP(object)))) {
      return object;
    } else if ((NIL != el_utilities.el_formula_p(object))) {
      if ((NIL != cycl_utilities.formula_find_if($sym48$FAST_REIFIED_SKOLEM_, object, T, UNPROVIDED))) {
        if ((NIL != term.fast_reified_skolemP(cycl_utilities.nat_functor(object)))) {
          if ((NIL != el_utilities.closedP(object, Symbols.symbol_function($sym31$CYC_VAR_)))) {
            {
              SubLObject relation = cycl_utilities.formula_arg0(object);
              SubLObject ans = NIL;
              SubLObject argnum = NIL;
              SubLObject args = NIL;
              SubLObject arg = NIL;
              for (argnum = ZERO_INTEGER, args = cycl_utilities.nat_args(object, UNPROVIDED), arg = args.first(); args.rest().isCons(); argnum = Numbers.add(ONE_INTEGER, argnum), args = args.rest(), arg = args.first()) {
                if ((!(((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8832"))
                      || (NIL != kb_accessors.quoted_argumentP(relation, argnum))
                      || (NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8778")))))) {
                  ans = non_editable_skolem_referenceP(arg);
                  if ((NIL != ans)) {
                    return ans;
                  }
                }
              }
              if ((!(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8833"))
                    || (NIL != kb_accessors.quoted_argumentP(relation, argnum))
                    || (NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8779")))))) {
                ans = non_editable_skolem_referenceP(args.first());
                if ((NIL != ans)) {
                  return ans;
                }
                if ((NIL != args.rest())) {
                  ans = non_editable_skolem_referenceP(args.rest());
                }
              }
              return ans;
            }
          } else {
            return object;
          }
        } else {
          {
            SubLObject relation = cycl_utilities.formula_arg0(object);
            SubLObject ans = NIL;
            SubLObject argnum = NIL;
            SubLObject args = NIL;
            SubLObject arg = NIL;
            for (argnum = ZERO_INTEGER, args = object, arg = args.first(); args.rest().isCons(); argnum = Numbers.add(ONE_INTEGER, argnum), args = args.rest(), arg = args.first()) {
              if ((!(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8834"))
                    || (NIL != kb_accessors.quoted_argumentP(relation, argnum))
                    || (NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8780")))))) {
                ans = non_editable_skolem_referenceP(arg);
                if ((NIL != ans)) {
                  return ans;
                }
              }
            }
            if ((!(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8835"))
                  || (NIL != kb_accessors.quoted_argumentP(relation, argnum))
                  || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8781")))))) {
              ans = non_editable_skolem_referenceP(args.first());
              if ((NIL != ans)) {
                return ans;
              }
              if ((NIL != args.rest())) {
                ans = non_editable_skolem_referenceP(args.rest());
              }
            }
            return ans;
          }
        }
      }
    } else if ((NIL != object)) {
      return non_editable_skolem_referenceP(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10752"));
    }
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 27209) 
  public static final SubLObject pred_of_editable_skolem_gafP(SubLObject pred) {
    return makeBoolean(((NIL != subl_promotions.memberP(pred, czer_vars.$preds_of_editable_skolem_gafs$.getGlobalValue(), UNPROVIDED, UNPROVIDED))
          || (NIL != editable_skolem_predicateP(pred))
          || (NIL != fort_types_interface.bookkeeping_predicate_p(pred))));
  }

  @SubL(source = "cycl/wff.lisp", position = 27429) 
  public static final SubLObject editable_skolem_predicateP(SubLObject pred) {
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 27853) 
  public static final SubLObject wff_wrt_literal_idiosyncrasiesP(SubLObject literal, SubLObject mt) {
    if ((NIL != enforce_literal_idiosyncrasiesP())) {
      {
        SubLObject pcase_var = el_utilities.literal_predicate(literal, UNPROVIDED);
        if (pcase_var.eql($const49$exceptFor)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7992");
        } else if (pcase_var.eql($const50$termOfUnit)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8098");
        } else if (pcase_var.eql($const51$commutativeInArgs)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31087");
        } else if (pcase_var.eql($const52$commutativeInArgsAndRest)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31088");
        } else {
          return T;
        }
      }
    } else {
      return T;
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 28976) 
  public static final SubLObject semantically_wf_non_atomic_sentenceP(SubLObject nasent, SubLObject mt) {
    return makeBoolean(((NIL != semantically_wf_sentenceP(nasent, mt))
           && (NIL != all_subsentences_semantically_wfP(nasent, mt))));
  }

  /** Checks whether all subsentences (passing through sentential relations)
of the non-atomic sentence NASENT are semantically well-formed. */
  @SubL(source = "cycl/wff.lisp", position = 29322) 
  public static final SubLObject all_subsentences_semantically_wfP(SubLObject nasent, SubLObject mt) {
    {
      SubLObject wffP = T;
      SubLObject truth_function = cycl_utilities.sentence_truth_function(nasent);
      if ((NIL != cycl_grammar.cycl_logical_operator_p(truth_function))) {
        {
          SubLObject argnum = ZERO_INTEGER;
          SubLObject args = cycl_utilities.formula_args(nasent, $kw43$IGNORE);
          SubLObject cdolist_list_var = args;
          SubLObject subsentence = NIL;
          for (subsentence = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subsentence = cdolist_list_var.first()) {
            argnum = Numbers.add(argnum, ONE_INTEGER);
            if ((NIL == subsentence_semantically_wfP(nasent, subsentence, argnum, mt))) {
              wffP = NIL;
            }
          }
        }
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30062"))) {
        {
          SubLObject subsentence = el_utilities.quantified_sub_sentence(nasent);
          SubLObject argnum = el_utilities.quantified_sub_sentence_argnum(nasent);
          if ((NIL == subsentence_semantically_wfP(nasent, subsentence, argnum, mt))) {
            wffP = NIL;
          }
        }
      } else {
        Errors.error($str55$Got_an_unexpected_sentential_rela, truth_function, nasent);
      }
      return wffP;
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 30332) 
  public static final SubLObject subsentence_semantically_wfP(SubLObject nasent, SubLObject subsentence, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject wffP = T;
        SubLObject truth_function = cycl_utilities.sentence_truth_function(nasent);
        {
          SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$within_disjunctionP$.currentBinding(thread);
          SubLObject _prev_bind_2 = at_vars.$appraising_disjunctP$.currentBinding(thread);
          try {
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(truth_function, argnum), thread);
            at_vars.$within_disjunctionP$.bind(arg_type.at_within_disjunctP(nasent, argnum), thread);
            at_vars.$appraising_disjunctP$.bind(arg_type.appraising_disjunctP(nasent, mt), thread);
            if ((NIL == wff_doneP(wffP))) {
              if ((NIL == wff_elf_intP(subsentence, mt))) {
                wffP = NIL;
              }
            }
          } finally {
            at_vars.$appraising_disjunctP$.rebind(_prev_bind_2, thread);
            at_vars.$within_disjunctionP$.rebind(_prev_bind_1, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
          }
        }
        return wffP;
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 30822) 
  public static final SubLObject semantically_wf_sentenceP(SubLObject sentence, SubLObject mt) {
    if (((NIL != mt)
         && (NIL != mt_relevance_macros.all_mts_are_relevantP()))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8097");
    } else {
      return memoized_semantically_wf_sentenceP(sentence, mt);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 31244) 
  public static final SubLObject memoized_semantically_wf_sentenceP_internal(SubLObject sentence, SubLObject mt) {
    return makeBoolean((NIL == mal_arg_typesP(sentence, mt)));
  }

  @SubL(source = "cycl/wff.lisp", position = 31244) 
  public static final SubLObject memoized_semantically_wf_sentenceP(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_semantically_wf_sentenceP_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (sentence.equal(cached_args.first())) {
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
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_semantically_wf_sentenceP_internal(sentence, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 31375) 
  public static final SubLObject mal_arityP(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == wff_utilities.$check_arityP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject operator = cycl_utilities.formula_operator(formula);
        if ((NIL != cycl_grammar.cycl_variable_p(operator))) {
          return NIL;
        } else if ((NIL != note_wff_violationP())) {
          return mal_arity_intP(formula);
        } else if ((NIL != el_utilities.sequence_var(formula, UNPROVIDED))) {
          return mal_arity_intP(formula);
        } else {
          {
            SubLObject actual_arity = el_utilities.expression_arity(formula, UNPROVIDED);
            return mal_actual_arity_cachedP(operator, actual_arity);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 32226) 
  private static SubLSymbol $mal_actual_arity_cachedP_caching_state$ = null;

  @SubL(source = "cycl/wff.lisp", position = 32226) 
  public static final SubLObject clear_mal_actual_arity_cachedP() {
    {
      SubLObject cs = $mal_actual_arity_cachedP_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_mal_actual_arity_cachedP$ZeroArityFunction extends ZeroArityFunction {
    public $clear_mal_actual_arity_cachedP$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-MAL-ACTUAL-ARITY-CACHED?")); }
    public SubLObject processItem() { return clear_mal_actual_arity_cachedP(); }
  }

  @SubL(source = "cycl/wff.lisp", position = 32226) 
  public static final SubLObject mal_actual_arity_cachedP_internal(SubLObject operator, SubLObject actual_arity) {
    {
      SubLObject args = ConsesLow.make_list(actual_arity, $kw58$TERM);
      SubLObject formula = el_utilities.make_formula(operator, args, UNPROVIDED);
      return mal_arity_intP(formula);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 32226) 
  public static final SubLObject mal_actual_arity_cachedP(SubLObject operator, SubLObject actual_arity) {
    {
      SubLObject caching_state = $mal_actual_arity_cachedP_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym57$MAL_ACTUAL_ARITY_CACHED_, $sym59$_MAL_ACTUAL_ARITY_CACHED__CACHING_STATE_, $int60$256, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym61$CLEAR_MAL_ACTUAL_ARITY_CACHED_);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_2(operator, actual_arity);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (operator.equal(cached_args.first())) {
                  cached_args = cached_args.rest();
                  if (((NIL != cached_args)
                       && (NIL == cached_args.rest())
                       && actual_arity.equal(cached_args.first()))) {
                    return memoization_state.caching_results(results2);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(mal_actual_arity_cachedP_internal(operator, actual_arity)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(operator, actual_arity));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 32614) 
  public static final SubLObject mal_arity_intP(SubLObject formula) {
    {
      SubLObject relation = cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_operator(formula));
      SubLObject malP = NIL;
      if (((NIL != forts.fort_p(relation))
          || (NIL != el_utilities.kappa_predicate_p(relation))
          || (NIL != el_utilities.lambda_function_p(relation)))) {
        if ((NIL != arity.variable_arityP(relation))) {
          malP = mal_variable_arityP(formula);
        } else {
          malP = mal_fixed_arityP(formula);
        }
      }
      return malP;
    }
  }

  /** does FORMULA, with fixed-arity relation arg0, comply with applicable arity constraints? */
  @SubL(source = "cycl/wff.lisp", position = 33051) 
  public static final SubLObject mal_fixed_arityP(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject relation = cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_arg0(formula));
        SubLObject v_arity = arity.arity(relation);
        SubLObject malP = NIL;
        if ((NIL == v_arity)) {
          if ((!(((NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread))
                 && (NIL != kb_control_vars.within_forward_inferenceP())
                 && (NIL != nart_handles.nart_p(relation)))))) {
            if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6874"))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8012");
              malP = T;
            }
          }
        } else if ((NIL == collection_defns.cyc_non_negative_integer(v_arity))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8013");
          malP = T;
        } else if ((NIL != el_utilities.sequence_var(formula, UNPROVIDED))) {
          if ((!(el_utilities.expression_arity(formula, $kw43$IGNORE).numLE(v_arity)))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8014");
            malP = T;
          }
        } else if ((!(v_arity.numE(el_utilities.expression_arity(formula, UNPROVIDED))))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8015");
          malP = T;
        } else {
          malP = NIL;
        }
        return malP;
      }
    }
  }

  /** does FORMULA, with variable-arity relation arg0, comply with applicable arity constraints? */
  @SubL(source = "cycl/wff.lisp", position = 34281) 
  public static final SubLObject mal_variable_arityP(SubLObject formula) {
    {
      SubLObject relation = cycl_utilities.formula_arg0(formula);
      SubLObject v_arity = el_utilities.expression_arity(formula, $kw43$IGNORE);
      SubLObject arity_min = arity.arity_min(relation);
      SubLObject arity_max = arity.arity_max(relation);
      SubLObject malP = NIL;
      if ((NIL != arity_min)) {
        if ((NIL == collection_defns.cyc_non_negative_integer(arity_min))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8016");
          malP = T;
        } else if (((!(v_arity.numGE(arity_min)))
             && (NIL == el_utilities.sequence_var(formula, UNPROVIDED)))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8017");
          malP = T;
        }
      }
      if ((NIL != arity_max)) {
        if ((NIL == collection_defns.cyc_non_negative_integer(arity_max))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8018");
          malP = T;
        } else if ((!(v_arity.numLE(arity_max)))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8019");
          malP = T;
        }
      }
      return malP;
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 35309) 
  public static final SubLObject mal_arg_typesP(SubLObject formula, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (((NIL != wff_check_argsP())
        || (NIL == el_utilities.atomic_sentenceP(formula))
        || (NIL != el_utilities.ist_sentence_p(formula)))) {
      {
        SubLObject wffP = NIL;
        at_utilities.reset_semantic_violations(UNPROVIDED);
        wffP = wff_wrt_arg_typesP(formula, mt);
        if ((NIL == wffP)) {
          note_wff_violations(at_utilities.semantic_violations());
        }
        return makeBoolean((NIL == wffP));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 35887) 
  public static final SubLObject wff_wrt_arg_typesP(SubLObject formula, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return arg_type.formula_args_ok_wrt_typeP(formula, mt);
  }

  @SubL(source = "cycl/wff.lisp", position = 43044) 
  private static SubLSymbol $wff_trace_level$ = null;

  @SubL(source = "cycl/wff.lisp", position = 44267) 
  public static final SubLObject reset_wff_suggestions() {
    wff_vars.$wff_suggestions$.setDynamicValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 44354) 
  public static final SubLObject provide_wff_suggestionsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$provide_wff_suggestionsP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 48248) 
  public static final SubLObject accumulating_el_violationsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))
            || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))
            || (NIL != czer_vars.$accumulating_semantic_violationsP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 51522) 
  public static final SubLObject reset_wff_violations() {
    wff_vars.$wff_violations$.setDynamicValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/wff.lisp", position = 51608) 
  public static final SubLObject wff_violations() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$wff_violations$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 51671) 
  public static final SubLObject note_wff_violationP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != wff_vars.$noting_wff_violationsP$.getDynamicValue(thread))
             && ((NIL == wff_violations())
              || (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread)))));
    }
  }

  @SubL(source = "cycl/wff.lisp", position = 52223) 
  public static final SubLObject note_wff_violations(SubLObject violations) {
    {
      SubLObject cdolist_list_var = violations;
      SubLObject violation = NIL;
      for (violation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), violation = cdolist_list_var.first()) {
      	note_wff_violation(violation);
      }
    }
    return NIL;
  }
  

  /** @param violation a list, the first element of which is a keyword indicating the type of violation, and the rest provide additional information about the violation. */
  @SubL(source = "cycl/wff.lisp", position = 51821) 
  public static final SubLObject note_wff_violation(SubLObject violation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != wff_vars.wff_debugP())) {
        print_high.print(violation, UNPROVIDED);
      }
      if ((NIL != note_wff_violationP())) {
        {
          SubLObject item_var = violation;
          if ((NIL == conses_high.member(item_var, wff_vars.$wff_violations$.getDynamicValue(thread), Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
            wff_vars.$wff_violations$.setDynamicValue(cons(item_var, wff_vars.$wff_violations$.getDynamicValue(thread)), thread);
          }
        }
      }
      return NIL;
    }
  }


  /** Gives an explanation of why SENTENCE is not wff to be asserted in MT. */
  @SubL(source = "cycl/wff.lisp", position = 55919) 
  public static final SubLObject explanation_of_why_not_wff_assert(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      SubLObject plist_var = v_properties;
      checkType(plist_var, $sym0$PROPERTY_LIST_P);
      {
        SubLObject remainder = NIL;
        for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
          {
            SubLObject property = remainder.first();
            SubLObject value = conses_high.cadr(remainder);
            checkType(property, $sym1$WFF_PROPERTY_P);
          }
        }
      }
    }
    {
      SubLObject io_mode = conses_high.getf(v_properties, $kw104$IO_MODE, $kw96$NL);
      SubLObject violations = conses_high.getf(v_properties, $kw105$VIOLATIONS, NIL);
      return explanation_of_why_not_wff_int(sentence,mt,io_mode,violations,$kw16$ASSERT,v_properties);
    }
  }


  /** @return boolean; t iff FORMULA is a well-formed CycL query in MT wrt syntax and arity */
  @SubL(source = "cycl/wff.lisp", position = 12683) 
  public static final SubLObject wff_queryP(SubLObject formula, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject plist_var = v_properties;
        checkType(plist_var, $sym0$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym1$WFF_PROPERTY_P);
            }
          }
        }
      }
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_ask$.currentBinding(thread);
          try {
            control_vars.$within_ask$.bind(T, thread);
            {
              SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hlmt_czer.canonicalize_hlmt(mt));
              {
                SubLObject _prev_bind_0_30 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                SubLObject _prev_bind_4 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  wff_utilities.$check_wff_semanticsP$.bind(czer_main.check_wff_semanticsP(mt), thread);
                  at_vars.$at_check_relator_constraintsP$.bind(wff_utilities.$check_wff_semanticsP$.getDynamicValue(thread), thread);
                  {
                    SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
                    SubLObject svs = wff_svs;
                    {
                      SubLObject _prev_bind_0_31 = wff_vars.$wff_properties$.currentBinding(thread);
                      try {
                        wff_vars.$wff_properties$.bind(svs, thread);
                        {
                          SubLObject svs_var = svs;
                          checkType(svs_var, $sym3$SPECIAL_VARIABLE_STATE_P);
                          {
                            SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                            final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                            try {
                              Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                              result = el_wff_syntaxP(formula, UNPROVIDED);
                            } finally {
                              Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                            }
                          }
                        }
                      } finally {
                        wff_vars.$wff_properties$.rebind(_prev_bind_0_31, thread);
                      }
                    }
                  }
                } finally {
                  at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_4, thread);
                  wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_30, thread);
                }
              }
            }
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }


  /** @param WFF-CONTEXT; :ask, :assert, or :default */
  @SubL(source = "cycl/wff.lisp", position = 56330) 
  public static final SubLObject explanation_of_why_not_wff_int(SubLObject sentence, SubLObject mt, SubLObject io_mode, SubLObject violations, SubLObject wff_context, SubLObject v_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
        SubLObject svs = wff_svs;
        {
          SubLObject _prev_bind_0 = wff_vars.$wff_properties$.currentBinding(thread);
          try {
            wff_vars.$wff_properties$.bind(svs, thread);
            {
              SubLObject svs_var = svs;
              checkType(svs_var, $sym3$SPECIAL_VARIABLE_STATE_P);
              {
                SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                try {
                  Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                  if ((NIL == violations)) {
                    {
                      SubLObject pcase_var = wff_context;
                      if (pcase_var.eql($kw107$ASK)) {
                        violations = why_not_wff_ask(sentence, mt, UNPROVIDED);
                      } else if (pcase_var.eql($kw16$ASSERT)) {
                        violations = why_not_wff_assert(sentence, mt, UNPROVIDED);
                      } else {
                        violations = why_not_wff(sentence, mt, UNPROVIDED);
                      }
                    }
                  }
                  {
                    SubLObject cdolist_list_var = violations;
                    SubLObject why_not = NIL;
                    for (why_not = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), why_not = cdolist_list_var.first()) {
                      answer = cons(explain_wff_violation(why_not, io_mode), answer);
                    }
                  }
                  if (((NIL != wff_suggestions())
                       && (NIL != provide_wff_suggestionsP())
                       && (io_mode == $kw96$NL))) {
                    {
                      SubLObject suggestions = explanation_of_wff_suggestion(sentence, mt, wff_suggestions());
                      if ((NIL != suggestions)) {
                        answer = cons(PrintLow.format(NIL, $str102$___a, suggestions), answer);
                      }
                    }
                  }
                  answer = Sequences.nreverse(answer);
                  if (($kw96$NL == io_mode)) {
                    answer = string_utilities.strcat(answer);
                  }
                } finally {
                  Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                }
              }
            }
          } finally {
            wff_vars.$wff_properties$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  

  @SubL(source = "cycl/wff.lisp", position = 44716) 
  public static final SubLObject how_make_wffP(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != el_wffP(sentence, mt, UNPROVIDED))) {
      return $const25$True;
    } else {
      return wff_suggestions();
    }
  }


  @SubL(source = "cycl/wff.lisp", position = 44981) 
  public static final SubLObject explanation_of_wff_suggestion(SubLObject sentence, SubLObject mt, SubLObject suggestions) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((suggestions == UNPROVIDED)) {
      suggestions = how_make_wffP(sentence, mt);
    }
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = suggestions;
      SubLObject suggestion = NIL;
      for (suggestion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), suggestion = cdolist_list_var.first()) {
        {
          SubLObject pcase_var = suggestion.first();
          if (pcase_var.eql($kw77$CHANGE_MT)) {
            {
              SubLObject datum = suggestion.rest();
              SubLObject current = datum;
              SubLObject sentence_1 = NIL;
              SubLObject mt_50 = NIL;
              SubLObject accommodating_mts = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list78);
              sentence_1 = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list78);
              mt_50 = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list78);
              accommodating_mts = current.first();
              current = current.rest();
              if ((NIL == current)) {
                if ((NIL == accommodating_mts)) {
                } else if ((!(sentence.equal(sentence_1)))) {
                } else if ((NIL != list_utilities.singletonP(accommodating_mts))) {
                  answer = cons(PrintLow.format(NIL, $str79$__Consider_asserting______s__in_m, sentence, accommodating_mts.first()), answer);
                } else {
                  answer = cons(PrintLow.format(NIL, $str80$__Consider_asserting______s__in_o, sentence, string_utilities.stringify_terms(accommodating_mts, $str81$__, $str82$__or_)), answer);
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list78);
              }
            }
          } else if (pcase_var.eql($kw83$REPLACE_TERM)) {
            {
              SubLObject datum = suggestion.rest();
              SubLObject current = datum;
              SubLObject old_term = NIL;
              SubLObject new_term = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list84);
              old_term = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list84);
              new_term = current.first();
              current = current.rest();
              if ((NIL == current)) {
                if ((NIL == new_term)) {
                } else if (old_term.equal(new_term)) {
                } else {
                  answer = cons(PrintLow.format(NIL, $str85$__Consider_using_term______s__ins, new_term, old_term), answer);
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list84);
              }
            }
          } else if (pcase_var.eql($kw16$ASSERT)) {
            {
              SubLObject datum = suggestion.rest();
              SubLObject current = datum;
              SubLObject sentence_1 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
              sentence_1 = current.first();
              current = current.rest();
              {
                SubLObject mt_51 = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list86);
                current = current.rest();
                if ((NIL == current)) {
                  if ((NIL != mt_51)) {
                    answer = cons(PrintLow.format(NIL, $str87$__Consider_asserting______s____in, sentence_1, mt_51), answer);
                  } else {
                    answer = cons(PrintLow.format(NIL, $str88$__Consider_asserting______s_, sentence_1), answer);
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list86);
                }
              }
            }
          } else if (pcase_var.eql($kw89$UNASSERT)) {
            {
              SubLObject datum = suggestion.rest();
              SubLObject current = datum;
              SubLObject sentence_1 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list86);
              sentence_1 = current.first();
              current = current.rest();
              {
                SubLObject mt_52 = (current.isCons() ? ((SubLObject) current.first()) : NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, $list86);
                current = current.rest();
                if ((NIL == current)) {
                  if ((NIL != mt_52)) {
                    answer = cons(PrintLow.format(NIL, $str90$__Consider_unasserting______s____, sentence_1, mt_52), answer);
                  } else {
                    answer = cons(PrintLow.format(NIL, $str91$__Consider_unasserting______s_, sentence_1), answer);
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list86);
                }
              }
            }
          } else {
            answer = cons(PrintLow.format(NIL, $str92$__No_explanation_template_exists_, suggestion), answer);
          }
        }
      }
      return string_utilities.strcat(Sequences.nreverse(answer));
    }
  }


  @SubL(source = "cycl/wff.lisp", position = 44106) 
  public static final SubLObject wff_suggestions() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return wff_vars.$wff_suggestions$.getDynamicValue(thread);
    }
  }

  

  @SubL(source = "cycl/wff.lisp", position = 58947) 
  public static final SubLObject explain_wff_violation(SubLObject why_not, SubLObject io_mode) {
    if ((io_mode == UNPROVIDED)) {
      io_mode = $kw96$NL;
    }
    checkType(why_not, $sym112$WFF_VIOLATION_P);
    if ((NIL != why_not)) {
      {
        SubLObject explanation_function = wff_module_datastructures.wff_violation_explanation_function(at_utilities.violation_type(why_not));
        if ((NIL != explanation_function)) {
          return Functions.funcall(explanation_function, why_not, io_mode);
        } else {
          return PrintLow.format(NIL, $str113$__No_explanation_template_exists_, why_not);
        }
      }
    }
    return NIL;
  }

  

  @SubL(source = "cycl/wff.lisp", position = 50135) 
  public static final SubLObject why_not_wff_assert(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject plist_var = v_properties;
        checkType(plist_var, $sym0$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym1$WFF_PROPERTY_P);
            }
          }
        }
      }
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
          try {
            control_vars.$within_assert$.bind(T, thread);
            {
              SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
              SubLObject svs = wff_svs;
              {
                SubLObject _prev_bind_0_59 = wff_vars.$wff_properties$.currentBinding(thread);
                try {
                  wff_vars.$wff_properties$.bind(svs, thread);
                  {
                    SubLObject svs_var = svs;
                    checkType(svs_var, $sym3$SPECIAL_VARIABLE_STATE_P);
                    {
                      SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                      final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                      try {
                        Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                        result = why_not_wff(sentence, mt, UNPROVIDED);
                      } finally {
                        Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                      }
                    }
                  }
                } finally {
                  wff_vars.$wff_properties$.rebind(_prev_bind_0_59, thread);
                }
              }
            }
          } finally {
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }


  @SubL(source = "cycl/wff.lisp", position = 49621) 
  public static final SubLObject why_not_wff(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject plist_var = v_properties;
        checkType(plist_var, $sym0$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym1$WFF_PROPERTY_P);
            }
          }
        }
      }
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_4 = wff_vars.$wff_violations$.currentBinding(thread);
          SubLObject _prev_bind_5 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind(T, thread);
            {
              SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
              SubLObject svs = wff_svs;
              {
                SubLObject _prev_bind_0_56 = wff_vars.$wff_properties$.currentBinding(thread);
                try {
                  wff_vars.$wff_properties$.bind(svs, thread);
                  {
                    SubLObject svs_var = svs;
                    checkType(svs_var, $sym3$SPECIAL_VARIABLE_STATE_P);
                    {
                      SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                      final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                      try {
                        Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                        el_wffP(sentence, mt, UNPROVIDED);
                        if ((NIL != hlmt.hlmt_p(mt))) {
                          if ((NIL == wff_violations())) {
                            {
                              SubLObject mt_var = mt;
                              {
                                SubLObject _prev_bind_0_57 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1_58 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                  simplifier.simplify_cycl_sentence(sentence, UNPROVIDED);
                                } finally {
                                  mt_relevance_macros.$mt$.rebind(_prev_bind_1_58, thread);
                                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_57, thread);
                                }
                              }
                            }
                          }
                        }
                        result = wff_violations();
                      } finally {
                        Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                      }
                    }
                  }
                } finally {
                  wff_vars.$wff_properties$.rebind(_prev_bind_0_56, thread);
                }
              }
            }
          } finally {
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_5, thread);
            wff_vars.$wff_violations$.rebind(_prev_bind_4, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }


  @SubL(source = "cycl/wff.lisp", position = 50899) 
  public static final SubLObject why_not_wff_ask(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((v_properties == UNPROVIDED)) {
      v_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject plist_var = v_properties;
        checkType(plist_var, $sym0$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym1$WFF_PROPERTY_P);
            }
          }
        }
      }
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_4 = wff_vars.$wff_violations$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            wff_vars.$wff_violations$.bind(NIL, thread);
            {
              SubLObject wff_svs = wff_macros.new_wff_special_variable_state(v_properties);
              SubLObject svs = wff_svs;
              {
                SubLObject _prev_bind_0_63 = wff_vars.$wff_properties$.currentBinding(thread);
                try {
                  wff_vars.$wff_properties$.bind(svs, thread);
                  {
                    SubLObject svs_var = svs;
                    checkType(svs_var, $sym3$SPECIAL_VARIABLE_STATE_P);
                    {
                      SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(svs_var);
                      final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                      try {
                        Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(svs_var));
                        wff_queryP(sentence, mt, UNPROVIDED);
                        result = wff_violations();
                      } finally {
                        Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                      }
                    }
                  }
                } finally {
                  wff_vars.$wff_properties$.rebind(_prev_bind_0_63, thread);
                }
              }
            }
          } finally {
            wff_vars.$wff_violations$.rebind(_prev_bind_4, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  
  public static final SubLObject declare_wff_file() {
    declareFunction(myName, "el_wffP", "EL-WFF?", 1, 2, false);
    //declareFunction(myName, "el_wff_assertibleP", "EL-WFF-ASSERTIBLE?", 1, 2, false);
    //declareFunction(myName, "hl_wffP", "HL-WFF?", 1, 2, false);
    declareFunction(myName, "wffP", "WFF?", 1, 2, false);
    //declareFunction(myName, "wff_in_any_mtP", "WFF-IN-ANY-MT?", 2, 0, false);
    declareFunction(myName, "reset_wff_state", "RESET-WFF-STATE", 0, 0, false);
    declareFunction(myName, "mal_precanonicalizationsP", "MAL-PRECANONICALIZATIONS?", 2, 0, false);
    declareFunction(myName, "syntactically_wff_elf_intP", "SYNTACTICALLY-WFF-ELF-INT?", 2, 0, false);
    declareFunction(myName, "wff_elfP", "WFF-ELF?", 2, 0, false);
    //declareFunction(myName, "wff_el_expansion", "WFF-EL-EXPANSION", 2, 0, false);
    declareFunction(myName, "el_wff_syntaxP", "EL-WFF-SYNTAX?", 1, 1, false);
    declareFunction(myName, "wff_elf_intP", "WFF-ELF-INT?", 1, 1, false);
    //declareFunction(myName, "why_not_semantically_wf_wrt_types", "WHY-NOT-SEMANTICALLY-WF-WRT-TYPES", 2, 0, false);
    declareFunction(myName, "semantically_wff_elf_intP", "SEMANTICALLY-WFF-ELF-INT?", 2, 0, false);
    declareFunction(myName, "wff_fast_gafP", "WFF-FAST-GAF?", 1, 0, false);
    //declareFunction(myName, "wff_nafP", "WFF-NAF?", 1, 1, false);
    //declareFunction(myName, "wff_cnfP", "WFF-CNF?", 1, 1, false);
    //declareFunction(myName, "wff_cnf_intP", "WFF-CNF-INT?", 1, 0, false);
    //declareFunction(myName, "wff_dnfP", "WFF-DNF?", 1, 1, false);
    //declareFunction(myName, "wff_literalP", "WFF-LITERAL?", 1, 1, false);
    //declareFunction(myName, "wff_queryP", "WFF-QUERY?", 1, 2, false);
    //declareFunction(myName, "wff_check_arityP", "WFF-CHECK-ARITY?", 0, 0, false);
    //declareFunction(myName, "arity_tests_applyP", "ARITY-TESTS-APPLY?", 2, 0, false);
    declareFunction(myName, "check_arityP", "CHECK-ARITY?", 0, 2, false);
    declareFunction(myName, "wff_check_argsP", "WFF-CHECK-ARGS?", 0, 0, false);
    declareFunction(myName, "wff_check_coherenceP", "WFF-CHECK-COHERENCE?", 0, 0, false);
    declareFunction(myName, "wff_check_varsP", "WFF-CHECK-VARS?", 0, 0, false);
    declareFunction(myName, "inhibit_skolem_assertsP", "INHIBIT-SKOLEM-ASSERTS?", 0, 0, false);
    declareFunction(myName, "enforce_evaluatable_satisfiabilityP", "ENFORCE-EVALUATABLE-SATISFIABILITY?", 0, 0, false);
    declareFunction(myName, "enforce_only_definitional_gafs_in_vocab_mtP", "ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?", 0, 0, false);
    declareFunction(myName, "enforce_literal_idiosyncrasiesP", "ENFORCE-LITERAL-IDIOSYNCRASIES?", 0, 0, false);
    declareFunction(myName, "check_var_typesP", "CHECK-VAR-TYPES?", 1, 1, false);
    declareFunction(myName, "no_wff_semanticsP", "NO-WFF-SEMANTICS?", 0, 0, false);
    //declareFunction(myName, "no_wff_semantics_or_arityP", "NO-WFF-SEMANTICS-OR-ARITY?", 0, 0, false);
    declareFunction(myName, "wff_only_needs_syntactic_checksP", "WFF-ONLY-NEEDS-SYNTACTIC-CHECKS?", 0, 0, false);
    declareFunction(myName, "check_wff_expansionP", "CHECK-WFF-EXPANSION?", 1, 0, false);
    declareFunction(myName, "check_wff_coherenceP", "CHECK-WFF-COHERENCE?", 1, 1, false);
    declareFunction(myName, "wff_doneP", "WFF-DONE?", 0, 1, false);
    declareFunction(myName, "mal_fortsP", "MAL-FORTS?", 1, 0, false);
    declareFunction(myName, "mal_forts", "MAL-FORTS", 1, 0, false);
    //declareFunction(myName, "valid_top_level_backward_inference_literalP", "VALID-TOP-LEVEL-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
    //declareFunction(myName, "valid_intermediate_backward_inference_literalP", "VALID-INTERMEDIATE-BACKWARD-INFERENCE-LITERAL?", 1, 0, false);
    //declareFunction(myName, "valid_top_level_forward_inference_literalP", "VALID-TOP-LEVEL-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
    //declareFunction(myName, "valid_intermediate_forward_inference_literalP", "VALID-INTERMEDIATE-FORWARD-INFERENCE-LITERAL?", 1, 0, false);
    declareFunction(myName, "semantically_wf_literalP", "SEMANTICALLY-WF-LITERAL?", 1, 1, false);
    //declareFunction(myName, "memoized_syntactically_wf_formulaP_internal", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?-INTERNAL", 1, 0, false);
    //declareFunction(myName, "memoized_syntactically_wf_formulaP", "MEMOIZED-SYNTACTICALLY-WF-FORMULA?", 1, 0, false);
    //declareFunction(myName, "semantically_wf_literal_in_any_mtP", "SEMANTICALLY-WF-LITERAL-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "memoized_semantically_wf_literalP_internal", "MEMOIZED-SEMANTICALLY-WF-LITERAL?-INTERNAL", 4, 0, false);
    declareFunction(myName, "memoized_semantically_wf_literalP", "MEMOIZED-SEMANTICALLY-WF-LITERAL?", 4, 0, false);
    declareFunction(myName, "assertible_literalP", "ASSERTIBLE-LITERAL?", 1, 1, false);
    //declareFunction(myName, "meta_sentence_referencing_defn_gaf_in_mtP", "META-SENTENCE-REFERENCING-DEFN-GAF-IN-MT?", 2, 0, false);
    //declareFunction(myName, "definitional_predP", "DEFINITIONAL-PRED?", 1, 1, false);
    declareFunction(myName, "sbhl_literal_conflictP", "SBHL-LITERAL-CONFLICT?", 1, 1, false);
    //declareFunction(myName, "sbhl_trueP", "SBHL-TRUE?", 1, 1, false);
    declareFunction(myName, "sbhl_falseP", "SBHL-FALSE?", 1, 1, false);
    declareFunction(myName, "non_editable_skolem_referenceP", "NON-EDITABLE-SKOLEM-REFERENCE?", 1, 0, false);
    declareFunction(myName, "pred_of_editable_skolem_gafP", "PRED-OF-EDITABLE-SKOLEM-GAF?", 1, 0, false);
    declareFunction(myName, "editable_skolem_predicateP", "EDITABLE-SKOLEM-PREDICATE?", 1, 0, false);
    //declareFunction(myName, "inhibit_cyclic_commutative_in_argsP", "INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?", 0, 0, false);
    declareFunction(myName, "wff_wrt_literal_idiosyncrasiesP", "WFF-WRT-LITERAL-IDIOSYNCRASIES?", 2, 0, false);
    //declareFunction(myName, "except_for_wffP", "EXCEPT-FOR-WFF?", 1, 0, false);
    //declareFunction(myName, "tou_mt_okP", "TOU-MT-OK?", 2, 0, false);
    declareFunction(myName, "semantically_wf_non_atomic_sentenceP", "SEMANTICALLY-WF-NON-ATOMIC-SENTENCE?", 2, 0, false);
    declareFunction(myName, "all_subsentences_semantically_wfP", "ALL-SUBSENTENCES-SEMANTICALLY-WF?", 2, 0, false);
    declareFunction(myName, "subsentence_semantically_wfP", "SUBSENTENCE-SEMANTICALLY-WF?", 4, 0, false);
    declareFunction(myName, "semantically_wf_sentenceP", "SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
    //declareFunction(myName, "semantically_wf_sentence_in_any_mtP", "SEMANTICALLY-WF-SENTENCE-IN-ANY-MT?", 1, 0, false);
    declareFunction(myName, "memoized_semantically_wf_sentenceP_internal", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?-INTERNAL", 2, 0, false);
    declareFunction(myName, "memoized_semantically_wf_sentenceP", "MEMOIZED-SEMANTICALLY-WF-SENTENCE?", 2, 0, false);
    declareFunction(myName, "mal_arityP", "MAL-ARITY?", 1, 0, false);
    declareFunction(myName, "clear_mal_actual_arity_cachedP", "CLEAR-MAL-ACTUAL-ARITY-CACHED?", 0, 0, false); new $clear_mal_actual_arity_cachedP$ZeroArityFunction();
    //declareFunction(myName, "remove_mal_actual_arity_cachedP", "REMOVE-MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
    declareFunction(myName, "mal_actual_arity_cachedP_internal", "MAL-ACTUAL-ARITY-CACHED?-INTERNAL", 2, 0, false);
    declareFunction(myName, "mal_actual_arity_cachedP", "MAL-ACTUAL-ARITY-CACHED?", 2, 0, false);
    declareFunction(myName, "mal_arity_intP", "MAL-ARITY-INT?", 1, 0, false);
    declareFunction(myName, "mal_fixed_arityP", "MAL-FIXED-ARITY?", 1, 0, false);
    declareFunction(myName, "mal_variable_arityP", "MAL-VARIABLE-ARITY?", 1, 0, false);
    declareFunction(myName, "mal_arg_typesP", "MAL-ARG-TYPES?", 1, 1, false);
    declareFunction(myName, "wff_wrt_arg_typesP", "WFF-WRT-ARG-TYPES?", 1, 1, false);
    //declareFunction(myName, "wff_coherentP", "WFF-COHERENT?", 1, 1, false);
    //declareFunction(myName, "wff_incoherentP", "WFF-INCOHERENT?", 1, 1, false);
    //declareFunction(myName, "elf_incoherentP", "ELF-INCOHERENT?", 1, 0, false);
    //declareFunction(myName, "cnf_incoherentP", "CNF-INCOHERENT?", 1, 1, false);
    //declareFunction(myName, "kwt_wffP", "KWT-WFF?", 1, 1, false);
    //declareFunction(myName, "gat_wffP", "GAT-WFF?", 1, 1, false);
    //declareFunction(myName, "el_formula_okP", "EL-FORMULA-OK?", 1, 1, false);
    //declareFunction(myName, "formula_okP", "FORMULA-OK?", 1, 1, false);
    //declareFunction(myName, "el_query_okP", "EL-QUERY-OK?", 1, 1, false);
    //declareFunction(myName, "query_okP", "QUERY-OK?", 1, 1, false);
    //declareFunction(myName, "why_not_query_ok", "WHY-NOT-QUERY-OK", 1, 1, false);
    //declareFunction(myName, "el_wft_fastP", "EL-WFT-FAST?", 1, 1, false);
    //declareFunction(myName, "el_wft_fast_in_mtP", "EL-WFT-FAST-IN-MT?", 2, 0, false);
    //declareFunction(myName, "el_wftP", "EL-WFT?", 1, 2, false);
    //declareFunction(myName, "el_wfeP", "EL-WFE?", 1, 2, false);
    //declareFunction(myName, "wfeP", "WFE?", 1, 1, false);
    //declareFunction(myName, "wfe_intP", "WFE-INT?", 1, 0, false);
    //declareFunction(myName, "wff_note", "WFF-NOTE", 2, 5, false);
    //declareFunction(myName, "wff_error", "WFF-ERROR", 2, 5, false);
    //declareFunction(myName, "wff_cerror", "WFF-CERROR", 3, 5, false);
    //declareFunction(myName, "wff_warn", "WFF-WARN", 2, 5, false);
    //declareFunction(myName, "wff_suggestions", "WFF-SUGGESTIONS", 0, 0, false);
    declareFunction(myName, "reset_wff_suggestions", "RESET-WFF-SUGGESTIONS", 0, 0, false);
    declareFunction(myName, "provide_wff_suggestionsP", "PROVIDE-WFF-SUGGESTIONS?", 0, 0, false);
    //declareFunction(myName, "note_wff_suggestion", "NOTE-WFF-SUGGESTION", 1, 0, false);
    //declareFunction(myName, "note_wff_suggestions", "NOTE-WFF-SUGGESTIONS", 1, 0, false);
    //declareFunction(myName, "how_make_wffP", "HOW-MAKE-WFF?", 1, 1, false);
    //declareFunction(myName, "how_make_wft", "HOW-MAKE-WFT", 1, 1, false);
    //declareFunction(myName, "explanation_of_wff_suggestion", "EXPLANATION-OF-WFF-SUGGESTION", 1, 2, false);
    //declareFunction(myName, "explanation_of_wft_suggestion", "EXPLANATION-OF-WFT-SUGGESTION", 1, 2, false);
    declareFunction(myName, "accumulating_el_violationsP", "ACCUMULATING-EL-VIOLATIONS?", 0, 0, false);
    //declareFunction(myName, "note_arity_violation", "NOTE-ARITY-VIOLATION", 1, 0, false);
    //declareFunction(myName, "diagnose_el_formula", "DIAGNOSE-EL-FORMULA", 1, 2, false);
    //declareFunction(myName, "diagnose_el_term", "DIAGNOSE-EL-TERM", 1, 2, false);
    //declareFunction(myName, "why_not_wff", "WHY-NOT-WFF", 1, 2, false);
    //declareFunction(myName, "why_not_wff_assert", "WHY-NOT-WFF-ASSERT", 1, 2, false);
    //declareFunction(myName, "why_not_wft", "WHY-NOT-WFT", 1, 2, false);
    //declareFunction(myName, "why_not_wff_ask", "WHY-NOT-WFF-ASK", 1, 2, false);
    //declareFunction(myName, "cb_why_not_wff", "CB-WHY-NOT-WFF", 1, 1, false);
    declareFunction(myName, "reset_wff_violations", "RESET-WFF-VIOLATIONS", 0, 0, false);
    declareFunction(myName, "wff_violations", "WFF-VIOLATIONS", 0, 0, false);
    declareFunction(myName, "note_wff_violationP", "NOTE-WFF-VIOLATION?", 0, 0, false);
    //declareFunction(myName, "note_wff_violation", "NOTE-WFF-VIOLATION", 1, 0, false);
    declareFunction(myName, "note_wff_violations", "NOTE-WFF-VIOLATIONS", 1, 0, false);
    //declareFunction(myName, "explain_why_not_wff", "EXPLAIN-WHY-NOT-WFF", 1, 2, false);
    //declareFunction(myName, "explain_why_not_wff_ask", "EXPLAIN-WHY-NOT-WFF-ASK", 1, 2, false);
    //declareFunction(myName, "explain_why_not_wff_assert", "EXPLAIN-WHY-NOT-WFF-ASSERT", 1, 2, false);
    //declareFunction(myName, "explain_why_not_wft", "EXPLAIN-WHY-NOT-WFT", 1, 2, false);
    //declareFunction(myName, "hl_explain_why_not_wff", "HL-EXPLAIN-WHY-NOT-WFF", 1, 2, false);
    //declareFunction(myName, "hl_explain_why_not_wft", "HL-EXPLAIN-WHY-NOT-WFT", 1, 2, false);
    //declareFunction(myName, "hl_explanation_of_why_not_wff", "HL-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false);
    //declareFunction(myName, "hl_explanation_of_why_not_wft", "HL-EXPLANATION-OF-WHY-NOT-WFT", 1, 1, false);
    //declareFunction(myName, "hl_why_not_wff", "HL-WHY-NOT-WFF", 1, 1, false);
    //declareFunction(myName, "hl_why_not_wft", "HL-WHY-NOT-WFT", 1, 1, false);
    //declareFunction(myName, "explanation_of_why_not_wff", "EXPLANATION-OF-WHY-NOT-WFF", 1, 2, false);
    //declareFunction(myName, "explanation_of_why_not_wff_ask", "EXPLANATION-OF-WHY-NOT-WFF-ASK", 1, 2, false);
    declareFunction(myName, "explanation_of_why_not_wff_assert", "EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 2, false);
    //declareFunction(myName, "explanation_of_why_not_wff_int", "EXPLANATION-OF-WHY-NOT-WFF-INT", 6, 0, false);
    //declareFunction(myName, "explanation_of_why_not_wft", "EXPLANATION-OF-WHY-NOT-WFT", 1, 2, false);
    //declareFunction(myName, "explain_wff_violations", "EXPLAIN-WFF-VIOLATIONS", 0, 1, false);
    //declareFunction(myName, "explain_wff_violation_with_cycl_sentence", "EXPLAIN-WFF-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
    //declareFunction(myName, "explain_wft_violation_with_cycl_sentence", "EXPLAIN-WFT-VIOLATION-WITH-CYCL-SENTENCE", 2, 0, false);
    //declareFunction(myName, "explain_wff_violation", "EXPLAIN-WFF-VIOLATION", 1, 1, false);
    //declareFunction(myName, "coherence_violations", "COHERENCE-VIOLATIONS", 0, 0, false);
    //declareFunction(myName, "why_not_coherent", "WHY-NOT-COHERENT", 1, 1, false);
    //declareFunction(myName, "reset_coherence_violations", "RESET-COHERENCE-VIOLATIONS", 0, 0, false);
    //declareFunction(myName, "note_coherence_violation", "NOTE-COHERENCE-VIOLATION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_wff_file() {
    $mal_actual_arity_cachedP_caching_state$ = deflexical("*MAL-ACTUAL-ARITY-CACHED?-CACHING-STATE*", NIL);
    $wff_trace_level$ = defvar("*WFF-TRACE-LEVEL*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_wff_file() {
        utilities_macros.register_cyc_api_function($sym21$EL_WFF_SYNTAX_, $list22, $str23$Is_SENTENCE_well_formed_wrt_synta, NIL, $list24);
    memoization_state.note_memoized_function($sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_);
    memoization_state.note_memoized_function($sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_);
    memoization_state.note_memoized_function($sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_);
    memoization_state.note_globally_cached_function($sym57$MAL_ACTUAL_ARITY_CACHED_);
    utilities_macros.register_cyc_api_function($sym69$EL_FORMULA_OK_, $list70, $str71$Is_FORMULA_a_well_formed_el_formu, $list72, $list24);
    utilities_macros.register_cyc_api_function($sym73$EL_QUERY_OK_, $list70, $str74$Is_FORMULA_a_well_formed_el_query, $list72, $list24);
    utilities_macros.register_cyc_api_function($sym98$DIAGNOSE_EL_FORMULA, $list99, $str100$Identify_how_el_sentence_SENTENCE, $list101, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym1$WFF_PROPERTY_P = makeSymbol("WFF-PROPERTY-P");
  public static final SubLString $str2$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym3$SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");
  public static final SubLSymbol $kw4$ELF = makeKeyword("ELF");
  public static final SubLSymbol $kw5$CNF = makeKeyword("CNF");
  public static final SubLSymbol $kw6$DNF = makeKeyword("DNF");
  public static final SubLSymbol $kw7$NAF = makeKeyword("NAF");
  public static final SubLString $str8$invalid_formula_type___s = makeString("invalid formula type: ~s");
  public static final SubLSymbol $sym9$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const10$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw11$MAL_PRECANONICALIZATIONS = makeKeyword("MAL-PRECANONICALIZATIONS");
  public static final SubLSymbol $kw12$INVALID_VARIABLES = makeKeyword("INVALID-VARIABLES");
  public static final SubLSymbol $kw13$MAL_FORTS = makeKeyword("MAL-FORTS");
  public static final SubLObject $const14$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $kw15$INVALID_MT = makeKeyword("INVALID-MT");
  public static final SubLSymbol $kw16$ASSERT = makeKeyword("ASSERT");
  public static final SubLObject $const17$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const18$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLSymbol $kw19$RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");
  public static final SubLSymbol $kw20$INVALID_EXPANSION = makeKeyword("INVALID-EXPANSION");
  public static final SubLSymbol $sym21$EL_WFF_SYNTAX_ = makeSymbol("EL-WFF-SYNTAX?");
  public static final SubLList $list22 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str23$Is_SENTENCE_well_formed_wrt_synta = makeString("Is SENTENCE well-formed wrt syntax?");
  public static final SubLList $list24 = list(makeSymbol("BOOLEANP"));
  public static final SubLObject $const25$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const26$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLString $str27$Got_a_sentence_that_was_neither_a = makeString("Got a sentence that was neither atomic nor non-atomic in mt ~s: ~s");
  public static final SubLList $list28 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("myCreator")), constant_handles.reader_make_constant_shell(makeString("myCreationTime")), constant_handles.reader_make_constant_shell(makeString("myCreationPurpose")), constant_handles.reader_make_constant_shell(makeString("myCreationSecond")));
  public static final SubLSymbol $sym29$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym30$HL_VAR_ = makeSymbol("HL-VAR?");
  public static final SubLSymbol $sym31$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym32$NON_WF_FORT_P = makeSymbol("NON-WF-FORT-P");
  public static final SubLSymbol $sym33$MEMOIZED_SYNTACTICALLY_WF_FORMULA_ = makeSymbol("MEMOIZED-SYNTACTICALLY-WF-FORMULA?");
  public static final SubLSymbol $kw34$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym35$MEMOIZED_SEMANTICALLY_WF_LITERAL_ = makeSymbol("MEMOIZED-SEMANTICALLY-WF-LITERAL?");
  public static final SubLSymbol $kw36$RESTRICTED_SKOLEM_ASSERTION = makeKeyword("RESTRICTED-SKOLEM-ASSERTION");
  public static final SubLSymbol $kw37$EVALUATABLE_LITERAL_FALSE = makeKeyword("EVALUATABLE-LITERAL-FALSE");
  public static final SubLSymbol $kw38$RESTRICTED_MT_ASSERTION = makeKeyword("RESTRICTED-MT-ASSERTION");
  public static final SubLSymbol $kw39$RESTRICTED_PREDICATE_ASSERTION = makeKeyword("RESTRICTED-PREDICATE-ASSERTION");
  public static final SubLSymbol $kw40$RESTRICTED_COLLECTION_ASSERTION = makeKeyword("RESTRICTED-COLLECTION-ASSERTION");
  public static final SubLObject $const41$VocabularyMicrotheory = constant_handles.reader_make_constant_shell(makeString("VocabularyMicrotheory"));
  public static final SubLSymbol $kw42$NON_DEFN_PRED_IN_VOCAB_MT = makeKeyword("NON-DEFN-PRED-IN-VOCAB-MT");
  public static final SubLSymbol $kw43$IGNORE = makeKeyword("IGNORE");
  public static final SubLObject $const44$DefaultVocabConstraintMt = constant_handles.reader_make_constant_shell(makeString("DefaultVocabConstraintMt"));
  public static final SubLList $list45 = list(constant_handles.reader_make_constant_shell(makeString("PossibleDefinitionalPredicate")), constant_handles.reader_make_constant_shell(makeString("DefinitionalPredicate")));
  public static final SubLSymbol $kw46$CONFLICT_ASSERTING_FALSE_SBHL = makeKeyword("CONFLICT-ASSERTING-FALSE-SBHL");
  public static final SubLSymbol $kw47$CONFLICT_ASSERTING_TRUE_SBHL = makeKeyword("CONFLICT-ASSERTING-TRUE-SBHL");
  public static final SubLSymbol $sym48$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");
  public static final SubLObject $const49$exceptFor = constant_handles.reader_make_constant_shell(makeString("exceptFor"));
  public static final SubLObject $const50$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLObject $const51$commutativeInArgs = constant_handles.reader_make_constant_shell(makeString("commutativeInArgs"));
  public static final SubLObject $const52$commutativeInArgsAndRest = constant_handles.reader_make_constant_shell(makeString("commutativeInArgsAndRest"));
  public static final SubLSymbol $kw53$EXCEPT_FOR_W_O_SINGLETON_VAR = makeKeyword("EXCEPT-FOR-W/O-SINGLETON-VAR");
  public static final SubLSymbol $kw54$INVALID_MT_FOR_TOU = makeKeyword("INVALID-MT-FOR-TOU");
  public static final SubLString $str55$Got_an_unexpected_sentential_rela = makeString("Got an unexpected sentential relation ~s in ~s");
  public static final SubLSymbol $sym56$MEMOIZED_SEMANTICALLY_WF_SENTENCE_ = makeSymbol("MEMOIZED-SEMANTICALLY-WF-SENTENCE?");
  public static final SubLSymbol $sym57$MAL_ACTUAL_ARITY_CACHED_ = makeSymbol("MAL-ACTUAL-ARITY-CACHED?");
  public static final SubLSymbol $kw58$TERM = makeKeyword("TERM");
  public static final SubLSymbol $sym59$_MAL_ACTUAL_ARITY_CACHED__CACHING_STATE_ = makeSymbol("*MAL-ACTUAL-ARITY-CACHED?-CACHING-STATE*");
  public static final SubLInteger $int60$256 = makeInteger(256);
  public static final SubLSymbol $sym61$CLEAR_MAL_ACTUAL_ARITY_CACHED_ = makeSymbol("CLEAR-MAL-ACTUAL-ARITY-CACHED?");
  public static final SubLSymbol $kw62$MISSING_ARITY = makeKeyword("MISSING-ARITY");
  public static final SubLSymbol $kw63$MAL_ARITY = makeKeyword("MAL-ARITY");
  public static final SubLObject $const64$arity = constant_handles.reader_make_constant_shell(makeString("arity"));
  public static final SubLSymbol $kw65$VIOLATED_ARITY = makeKeyword("VIOLATED-ARITY");
  public static final SubLObject $const66$arityMin = constant_handles.reader_make_constant_shell(makeString("arityMin"));
  public static final SubLObject $const67$arityMax = constant_handles.reader_make_constant_shell(makeString("arityMax"));
  public static final SubLSymbol $sym68$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym69$EL_FORMULA_OK_ = makeSymbol("EL-FORMULA-OK?");
  public static final SubLList $list70 = list(makeSymbol("FORMULA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str71$Is_FORMULA_a_well_formed_el_formu = makeString("Is FORMULA a well-formed el formula?");
  public static final SubLList $list72 = list(list(makeSymbol("FORMULA"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym73$EL_QUERY_OK_ = makeSymbol("EL-QUERY-OK?");
  public static final SubLString $str74$Is_FORMULA_a_well_formed_el_query = makeString("Is FORMULA a well-formed el query?");
  public static final SubLString $str75$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $sym76$WARN = makeSymbol("WARN");
  public static final SubLSymbol $kw77$CHANGE_MT = makeKeyword("CHANGE-MT");
  public static final SubLList $list78 = list(makeSymbol("SENTENCE-1"), makeSymbol("MT"), makeSymbol("ACCOMMODATING-MTS"));
  public static final SubLString $str79$__Consider_asserting______s__in_m = makeString("~%Consider asserting ~%  ~s~%in mt ~s.");
  public static final SubLString $str80$__Consider_asserting______s__in_o = makeString("~%Consider asserting ~%  ~s~%in one of these mts: ~s.");
  public static final SubLString $str81$__ = makeString(", ");
  public static final SubLString $str82$__or_ = makeString(", or ");
  public static final SubLSymbol $kw83$REPLACE_TERM = makeKeyword("REPLACE-TERM");
  public static final SubLList $list84 = list(makeSymbol("OLD-TERM"), makeSymbol("NEW-TERM"));
  public static final SubLString $str85$__Consider_using_term______s__ins = makeString("~%Consider using term ~%  ~s~%instead of term~%  ~s.");
  public static final SubLList $list86 = list(makeSymbol("SENTENCE-1"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str87$__Consider_asserting______s____in = makeString("~%Consider asserting ~%  ~s~%  in mt ~s.");
  public static final SubLString $str88$__Consider_asserting______s_ = makeString("~%Consider asserting ~%  ~s.");
  public static final SubLSymbol $kw89$UNASSERT = makeKeyword("UNASSERT");
  public static final SubLString $str90$__Consider_unasserting______s____ = makeString("~%Consider unasserting ~%  ~s~%  in mt ~s.");
  public static final SubLString $str91$__Consider_unasserting______s_ = makeString("~%Consider unasserting ~%  ~s.");
  public static final SubLString $str92$__No_explanation_template_exists_ = makeString("~%No explanation template exists for wff suggestion~%~s.");
  public static final SubLList $list93 = list(makeSymbol("TERM-1"), makeSymbol("MT"), makeSymbol("ACCOMMODATING-MTS"));
  public static final SubLString $str94$__Consider_referencing______s__in = makeString("~%Consider referencing ~%  ~s~%in mt ~s.");
  public static final SubLList $list95 = list(makeSymbol("TERM-1"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLSymbol $kw96$NL = makeKeyword("NL");
  public static final SubLSymbol $kw97$HL = makeKeyword("HL");
  public static final SubLSymbol $sym98$DIAGNOSE_EL_FORMULA = makeSymbol("DIAGNOSE-EL-FORMULA");
  public static final SubLList $list99 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("IO-MODE"), makeKeyword("NL")));
  public static final SubLString $str100$Identify_how_el_sentence_SENTENCE = makeString("Identify how el sentence SENTENCE fails syntactic or semantic constraints");
  public static final SubLList $list101 = list(list(makeSymbol("SENTENCE"), makeSymbol("LISTP")));
  public static final SubLString $str102$___a = makeString("~%~a");
  public static final SubLList $list103 = list(makeKeyword("IO-MODE"), makeKeyword("NL"));
  public static final SubLSymbol $kw104$IO_MODE = makeKeyword("IO-MODE");
  public static final SubLSymbol $kw105$VIOLATIONS = makeKeyword("VIOLATIONS");
  public static final SubLSymbol $kw106$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw107$ASK = makeKeyword("ASK");
  public static final SubLObject $const108$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLObject $const109$admittedSentence = constant_handles.reader_make_constant_shell(makeString("admittedSentence"));
  public static final SubLObject $const110$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));
  public static final SubLObject $const111$admittedNAT = constant_handles.reader_make_constant_shell(makeString("admittedNAT"));
  public static final SubLSymbol $sym112$WFF_VIOLATION_P = makeSymbol("WFF-VIOLATION-P");
  public static final SubLString $str113$__No_explanation_template_exists_ = makeString("~%No explanation template exists for wff error~%~s.");

  //// Initializers

  public void declareFunctions() {
    declare_wff_file();
  }

  public void initializeVariables() {
    init_wff_file();
  }

  public void runTopLevelForms() {
    setup_wff_file();
  }

}
