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

package com.cyc.cycjava_1.cycl.inference.modules;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.negation_predicate;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_natfunction;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_symmetry;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class forward_modules extends SubLTranslatedFile {

  //// Constructor

  public static final SubLFile me = new forward_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.forward_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 742) 
  private static SubLSymbol $forward_modules$ = null;

  /** Declare forward module NAME with property list PLIST. */
  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1225) 
  public static final SubLObject forward_module(SubLObject name, SubLObject plist) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject hl_module = inference_modules.setup_module(name, $kw0$FORWARD, plist);
        SubLObject item_var = hl_module;
        if ((NIL == conses_high.member(item_var, $forward_modules$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          $forward_modules$.setDynamicValue(cons(item_var, $forward_modules$.getDynamicValue(thread)), thread);
        }
        return hl_module;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 1918) 
  public static final SubLObject do_forward_modules_list() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $forward_modules$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2024) 
  private static SubLSymbol $forward_tactic_specs$ = null;

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2230) 
  public static final SubLObject forward_module_callback(SubLObject trigger_asent, SubLObject trigger_sense, SubLObject examine_asent, SubLObject examine_sense, SubLObject rule, SubLObject trigger_supports) {
    if ((trigger_supports == UNPROVIDED)) {
      trigger_supports = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      $forward_tactic_specs$.setDynamicValue(cons(list(trigger_asent, trigger_sense, examine_asent, examine_sense, rule, trigger_supports), $forward_tactic_specs$.getDynamicValue(thread)), thread);
      return NIL;
    }
  }

  /** @param SOURCE-ASENT ; an atomic sentence
   @param SOUCE-SENSE  ; sense-p, the sense of SOURCE-ASENT
   @param PROPAGATION-MT ; the mt in which forward expansions are to be done
   @return A list of tuples of the form
     (EXPANDED-ASENT EXPANDED-SOURCE &optional ADDITIONAL-SUPPORTS)
   where :
   EXPANDED-ASENT is an atomic sentence
   EXPANDED-SENSE ; sense-p, the sense of EXPANDED-ASENT
   ADDITIONAL-SUPPORTS ; a list of support-p justifying why :
     SOURCE-ASENT & SOURCE-SENSE => EXPANDED-ASENT & EXPANDED-SENSE */
  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 2494) 
  public static final SubLObject forward_tactic_specs(SubLObject source_asent, SubLObject source_sense, SubLObject propagation_mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        if ((NIL != list_utilities.sublisp_boolean(forward.forward_inference_allowed_rules()))) {
          {
            SubLObject _prev_bind_0 = $forward_tactic_specs$.currentBinding(thread);
            try {
              $forward_tactic_specs$.bind(NIL, thread);
              {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(propagation_mt);
                {
                  SubLObject _prev_bind_0_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject cdolist_list_var = forward_hl_modules(source_asent, source_sense);
                      SubLObject forward_hl_module = NIL;
                      for (forward_hl_module = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), forward_hl_module = cdolist_list_var.first()) {
                        forward_hl_module_apply(forward_hl_module, source_asent);
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_2, thread);
                  }
                }
                answer = Sequences.nreverse($forward_tactic_specs$.getDynamicValue(thread));
              }
            } finally {
              $forward_tactic_specs$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return answer;
      }
    }
  }

  /** Determine the HL modules which could be used to forward expand ASENT with SENSE */
  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 3470) 
  public static final SubLObject forward_hl_modules(SubLObject asent, SubLObject sense) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject hl_modules = NIL;
      SubLObject supplanted_modules = NIL;
      SubLObject exclusive_foundP = NIL;
      SubLObject rest = NIL;
      for (rest = do_forward_modules_list(); (!(((NIL != exclusive_foundP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject hl_module = rest.first();
          if ((NIL != inference_modules.hl_module_activeP(hl_module, NIL))) {
            if ((!(((NIL != supplanted_modules)
                   && (NIL != conses_high.member(hl_module, supplanted_modules, UNPROVIDED, UNPROVIDED)))))) {
              if (((NIL != inference_modules.hl_module_sense_relevant_p(hl_module, sense))
                   && (NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, predicate))
                   && (NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent)))) {
                {
                  SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                  if (((NIL == exclusive_func)
                      || (NIL != Functions.funcall(exclusive_func, asent)))) {
                    if ((NIL != exclusive_func)) {
                      {
                        SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
                        SubLObject pcase_var = supplants_info;
                        if (pcase_var.eql($kw9$ALL)) {
                          hl_modules = NIL;
                          exclusive_foundP = T;
                        } else {
                          {
                            SubLObject newly_supplanted_module_names = supplants_info;
                            SubLObject cdolist_list_var = newly_supplanted_module_names;
                            SubLObject supplanted_module_name = NIL;
                            for (supplanted_module_name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), supplanted_module_name = cdolist_list_var.first()) {
                              {
                                SubLObject supplanted_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                                if ((NIL != supplanted_module)) {
                                  supplanted_modules = cons(supplanted_module, supplanted_modules);
                                  hl_modules = list_utilities.delete_first(supplanted_module, hl_modules, Symbols.symbol_function(EQ));
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    {
                      SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
                      if (((NIL == required_func)
                          || (NIL != Functions.funcall(required_func, asent)))) {
                        hl_modules = cons(hl_module, hl_modules);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return Sequences.nreverse(hl_modules);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 5356) 
  public static final SubLObject forward_hl_module_apply(SubLObject forward_hl_module, SubLObject source_asent) {
    {
      SubLObject candidate_rules = forward_hl_module_rule_select(forward_hl_module, source_asent);
      SubLObject rules = ((NIL != candidate_rules) ? ((SubLObject) forward_hl_module_rule_filter(forward_hl_module, source_asent, candidate_rules)) : NIL);
      return forward_hl_module_expand(forward_hl_module, source_asent, rules);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 5727) 
  public static final SubLObject forward_hl_module_rule_select(SubLObject forward_hl_module, SubLObject source_asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != forward.forward_inference_all_rules_allowedP())) {
        {
          SubLObject rule_select_method = inference_modules.hl_module_rule_select_func(forward_hl_module);
          return (rule_select_method.isFunctionSpec() ? ((SubLObject) Functions.funcall(rule_select_method, source_asent)) : NIL);
        }
      } else {
        return kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
      }
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 6083) 
  public static final SubLObject forward_hl_module_rule_filter(SubLObject forward_hl_module, SubLObject source_asent, SubLObject rules) {
    {
      SubLObject rule_filter_method = inference_modules.hl_module_rule_filter_func(forward_hl_module);
      if ((rule_filter_method.isFunctionSpec()
           && (NIL == forward.forward_inference_all_rules_allowedP()))) {
        {
          SubLObject filtered_rules = NIL;
          SubLObject cdolist_list_var = rules;
          SubLObject rule = NIL;
          for (rule = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
            if ((NIL != Functions.funcall(rule_filter_method, source_asent, rule))) {
              filtered_rules = cons(rule, filtered_rules);
            }
          }
          return Sequences.nreverse(filtered_rules);
        }
      } else {
        return rules;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 6557) 
  public static final SubLObject forward_hl_module_expand(SubLObject forward_hl_module, SubLObject source_asent, SubLObject rules) {
    {
      SubLObject expand_function = inference_modules.hl_module_expand_func(forward_hl_module);
      if (expand_function.isFunctionSpec()) {
        {
          SubLObject cdolist_list_var = rules;
          SubLObject rule = NIL;
          for (rule = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
            Functions.funcall(expand_function, source_asent, rule);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 6846) 
  public static final SubLObject all_antecedent_predicate_forward_rules(SubLObject pred) {
    {
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
        if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, $kw10$NEG, direction))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, $kw10$NEG, direction);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                      {
                        SubLObject done_var_3 = NIL;
                        SubLObject token_var_4 = NIL;
                        while ((NIL == done_var_3)) {
                          {
                            SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                            SubLObject valid_5 = makeBoolean((token_var_4 != rule));
                            if ((NIL != valid_5)) {
                              rules = cons(rule, rules);
                            }
                            done_var_3 = makeBoolean((NIL == valid_5));
                          }
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                          Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                          if ((NIL != final_index_iterator)) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                          }
                        } finally {
                          Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      rules = list_utilities.fast_delete_duplicates(rules, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return rules;
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 7640) 
  public static final SubLObject all_ist_predicate_forward_rules(SubLObject pred) {
    {
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
        if ((NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, NIL, direction))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, NIL, direction);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                      {
                        SubLObject done_var_9 = NIL;
                        SubLObject token_var_10 = NIL;
                        while ((NIL == done_var_9)) {
                          {
                            SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                            SubLObject valid_11 = makeBoolean((token_var_10 != rule));
                            if ((NIL != valid_11)) {
                              rules = cons(rule, rules);
                            }
                            done_var_9 = makeBoolean((NIL == valid_11));
                          }
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                          Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                          if ((NIL != final_index_iterator)) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                          }
                        } finally {
                          Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      rules = list_utilities.fast_delete_duplicates(rules, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return rules;
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8222) 
  public static final SubLObject forward_normal_pos_rule_select(SubLObject asent) {
    return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
  }

  public static final class $forward_normal_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $forward_normal_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("FORWARD-NORMAL-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return forward_normal_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8362) 
  public static final SubLObject forward_normal_pos_rule_filter(SubLObject asent, SubLObject rule) {
    return forward_normal_pos_expand_int(asent, rule, T);
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8477) 
  public static final SubLObject forward_normal_pos_expand(SubLObject asent, SubLObject rule) {
    {
      SubLObject cdolist_list_var = forward_normal_pos_expand_int(asent, rule, UNPROVIDED);
      SubLObject examine_lit = NIL;
      for (examine_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine_lit = cdolist_list_var.first()) {
        forward_module_callback(asent, $kw12$POS, examine_lit, $kw10$NEG, rule, UNPROVIDED);
      }
    }
    return NIL;
  }

  public static final class $forward_normal_pos_expand$BinaryFunction extends BinaryFunction {
    public $forward_normal_pos_expand$BinaryFunction() { super(extractFunctionNamed("FORWARD-NORMAL-POS-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return forward_normal_pos_expand(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 8678) 
  public static final SubLObject forward_normal_pos_expand_int(SubLObject asent, SubLObject rule, SubLObject booleanP) {
    if ((booleanP == UNPROVIDED)) {
      booleanP = NIL;
    }
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject examine_lits = NIL;
      SubLObject predicate_var = pred;
      SubLObject assertion_var = rule;
      SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
      SubLObject rest = NIL;
      for (rest = clauses.neg_lits(cnf_var); (!((((NIL != booleanP)
               && (NIL != examine_lits))
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject lit = rest.first();
          if ((predicate_var == cycl_utilities.atomic_sentence_predicate(lit))) {
            examine_lits = cons(lit, examine_lits);
          }
        }
      }
      return ((NIL != booleanP) ? ((SubLObject) list_utilities.sublisp_boolean(examine_lits)) : examine_lits);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 10646) 
  public static final SubLObject forward_isa_rule_select(SubLObject asent) {
    {
      SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = forward_inference_all_genls(col);
      SubLObject genl = NIL;
      for (genl = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), genl = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_12 = backward_utilities.relevant_directions();
          SubLObject direction = NIL;
          for (direction = cdolist_list_var_12.first(); (NIL != cdolist_list_var_12); cdolist_list_var_12 = cdolist_list_var_12.rest(), direction = cdolist_list_var_12.first()) {
            if ((NIL != kb_mapping_macros.do_isa_rule_index_key_validator(genl, $kw10$NEG, direction))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(genl, $kw10$NEG, direction);
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                          {
                            SubLObject done_var_13 = NIL;
                            SubLObject token_var_14 = NIL;
                            while ((NIL == done_var_13)) {
                              {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                SubLObject valid_15 = makeBoolean((token_var_14 != rule));
                                if ((NIL != valid_15)) {
                                  rules = cons(rule, rules);
                                }
                                done_var_13 = makeBoolean((NIL == valid_15));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                              Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      return rules;
    }
  }

  public static final class $forward_isa_rule_select$UnaryFunction extends UnaryFunction {
    public $forward_isa_rule_select$UnaryFunction() { super(extractFunctionNamed("FORWARD-ISA-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return forward_isa_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11010) 
  public static final SubLObject forward_isa_rule_filter(SubLObject asent, SubLObject rule) {
    return forward_isa_expand_int(asent, rule, T);
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11111) 
  public static final SubLObject forward_isa_expand(SubLObject asent, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        {
          SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
          try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            {
              SubLObject cdolist_list_var = forward_isa_expand_int(asent, rule, UNPROVIDED);
              SubLObject examine_lit = NIL;
              for (examine_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine_lit = cdolist_list_var.first()) {
                {
                  SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                  SubLObject forward_asent = list($const19$isa, arg1, genl);
                  SubLObject more_supports = ((genl == arg2) ? ((SubLObject) NIL) : list(arguments.make_hl_support($kw20$GENLS, list($const21$genls, arg2, genl), UNPROVIDED, UNPROVIDED)));
                  forward_module_callback(forward_asent, $kw12$POS, examine_lit, $kw10$NEG, rule, more_supports);
                }
              }
            }
          } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  public static final class $forward_isa_expand$BinaryFunction extends BinaryFunction {
    public $forward_isa_expand$BinaryFunction() { super(extractFunctionNamed("FORWARD-ISA-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return forward_isa_expand(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 11662) 
  public static final SubLObject forward_isa_expand_int(SubLObject asent, SubLObject rule, SubLObject booleanP) {
    if ((booleanP == UNPROVIDED)) {
      booleanP = NIL;
    }
    {
      SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject examine_lits = NIL;
      SubLObject assertion_var = rule;
      SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
      SubLObject rest = NIL;
      for (rest = clauses.neg_lits(cnf_var); (!((((NIL != booleanP)
               && (NIL != examine_lits))
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject lit = rest.first();
          if (($const19$isa == cycl_utilities.atomic_sentence_predicate(lit))) {
            {
              SubLObject rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
              if (((NIL != variables.fully_bound_p(rule_col))
                   && (NIL != forward_inference_genlP(source_col, rule_col)))) {
                examine_lits = cons(lit, examine_lits);
              }
            }
          }
        }
      }
      return ((NIL != booleanP) ? ((SubLObject) list_utilities.sublisp_boolean(examine_lits)) : examine_lits);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12197) 
  public static final SubLObject forward_inference_genlP(SubLObject source_col, SubLObject rule_col) {
    return list_utilities.member_eqP(rule_col, forward_inference_all_genls(source_col));
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12332) 
  public static final SubLObject forward_inference_all_genls_internal(SubLObject col) {
    return genls.all_genls(col, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 12332) 
  public static final SubLObject forward_inference_all_genls(SubLObject col) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return forward_inference_all_genls_internal(col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym22$FORWARD_INFERENCE_ALL_GENLS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym22$FORWARD_INFERENCE_ALL_GENLS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym22$FORWARD_INFERENCE_ALL_GENLS, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, col, $kw23$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw23$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(forward_inference_all_genls_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 18645) 
  public static final SubLObject forward_genls_rule_select(SubLObject asent) {
    {
      SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = forward_inference_all_genls(col);
      SubLObject genl = NIL;
      for (genl = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), genl = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_28 = backward_utilities.relevant_directions();
          SubLObject direction = NIL;
          for (direction = cdolist_list_var_28.first(); (NIL != cdolist_list_var_28); cdolist_list_var_28 = cdolist_list_var_28.rest(), direction = cdolist_list_var_28.first()) {
            if ((NIL != kb_mapping_macros.do_genls_rule_index_key_validator(genl, $kw10$NEG, direction))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(genl, $kw10$NEG, direction);
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                          {
                            SubLObject done_var_29 = NIL;
                            SubLObject token_var_30 = NIL;
                            while ((NIL == done_var_29)) {
                              {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_30);
                                SubLObject valid_31 = makeBoolean((token_var_30 != rule));
                                if ((NIL != valid_31)) {
                                  rules = cons(rule, rules);
                                }
                                done_var_29 = makeBoolean((NIL == valid_31));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                              Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      return rules;
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 19118) 
  public static final SubLObject forward_genls_expand(SubLObject asent, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        {
          SubLObject _prev_bind_0 = forward.$type_filter_forward_dnf$.currentBinding(thread);
          try {
            forward.$type_filter_forward_dnf$.bind(T, thread);
            {
              SubLObject cdolist_list_var = forward_genls_expand_int(asent, rule, UNPROVIDED);
              SubLObject examine_lit = NIL;
              for (examine_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine_lit = cdolist_list_var.first()) {
                {
                  SubLObject genl = cycl_utilities.atomic_sentence_arg2(examine_lit, UNPROVIDED);
                  SubLObject forward_asent = list($const21$genls, arg1, genl);
                  SubLObject more_supports = ((genl == arg2) ? ((SubLObject) NIL) : list(arguments.make_hl_support($kw20$GENLS, list($const21$genls, arg2, genl), UNPROVIDED, UNPROVIDED)));
                  forward_module_callback(forward_asent, $kw12$POS, examine_lit, $kw10$NEG, rule, more_supports);
                }
              }
            }
          } finally {
            forward.$type_filter_forward_dnf$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 19673) 
  public static final SubLObject forward_genls_expand_int(SubLObject asent, SubLObject rule, SubLObject booleanP) {
    if ((booleanP == UNPROVIDED)) {
      booleanP = NIL;
    }
    {
      SubLObject source_col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject examine_lits = NIL;
      SubLObject assertion_var = rule;
      SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
      SubLObject rest = NIL;
      for (rest = clauses.neg_lits(cnf_var); (!((((NIL != booleanP)
               && (NIL != examine_lits))
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject lit = rest.first();
          if (($const21$genls == cycl_utilities.atomic_sentence_predicate(lit))) {
            {
              SubLObject rule_col = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
              if (((NIL != variables.fully_bound_p(rule_col))
                   && (NIL != forward_inference_genlP(source_col, rule_col)))) {
                examine_lits = cons(lit, examine_lits);
              }
            }
          }
        }
      }
      return ((NIL != booleanP) ? ((SubLObject) list_utilities.sublisp_boolean(examine_lits)) : examine_lits);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22329) 
  public static final SubLObject forward_genlmt_rule_select(SubLObject asent) {
    {
      SubLObject mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = genl_mts.all_genl_mts(mt, UNPROVIDED, UNPROVIDED);
      SubLObject genl_mt = NIL;
      for (genl_mt = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), genl_mt = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_36 = backward_utilities.relevant_directions();
          SubLObject direction = NIL;
          for (direction = cdolist_list_var_36.first(); (NIL != cdolist_list_var_36); cdolist_list_var_36 = cdolist_list_var_36.rest(), direction = cdolist_list_var_36.first()) {
            if ((NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, $kw10$NEG, direction))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, $kw10$NEG, direction);
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                          {
                            SubLObject done_var_37 = NIL;
                            SubLObject token_var_38 = NIL;
                            while ((NIL == done_var_37)) {
                              {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                SubLObject valid_39 = makeBoolean((token_var_38 != rule));
                                if ((NIL != valid_39)) {
                                  rules = cons(rule, rules);
                                }
                                done_var_37 = makeBoolean((NIL == valid_39));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                              Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      return rules;
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 22689) 
  public static final SubLObject forward_genlmt_rule_filter(SubLObject asent, SubLObject rule) {
    return forward_genlmt_expand_int(asent, rule, T);
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 23329) 
  public static final SubLObject forward_genlmt_expand_int(SubLObject asent, SubLObject rule, SubLObject booleanP) {
    if ((booleanP == UNPROVIDED)) {
      booleanP = NIL;
    }
    {
      SubLObject source_mt = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject examine_lits = NIL;
      SubLObject assertion_var = rule;
      SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
      SubLObject rest = NIL;
      for (rest = clauses.neg_lits(cnf_var); (!((((NIL != booleanP)
               && (NIL != examine_lits))
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject lit = rest.first();
          if (($const37$genlMt == cycl_utilities.atomic_sentence_predicate(lit))) {
            {
              SubLObject rule_mt = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
              if (((NIL != variables.fully_bound_p(rule_mt))
                   && (NIL != genl_mts.genl_mtP(source_mt, rule_mt, UNPROVIDED, UNPROVIDED)))) {
                examine_lits = cons(lit, examine_lits);
              }
            }
          }
        }
      }
      return ((NIL != booleanP) ? ((SubLObject) list_utilities.sublisp_boolean(examine_lits)) : examine_lits);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 26129) 
  public static final SubLObject forward_symmetric_pos_rule_select(SubLObject asent) {
    return all_antecedent_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
  }

  public static final class $forward_symmetric_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $forward_symmetric_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("FORWARD-SYMMETRIC-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return forward_symmetric_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 29056) 
  public static final SubLObject forward_asymmetric_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pattern = $list49;
        return makeBoolean(((NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread))
               && (NIL != formula_pattern_match.formula_matches_pattern(asent, pattern))));
      }
    }
  }

  public static final class $forward_asymmetric_required$UnaryFunction extends UnaryFunction {
    public $forward_asymmetric_required$UnaryFunction() { super(extractFunctionNamed("FORWARD-ASYMMETRIC-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return forward_asymmetric_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 38264) 
  public static final SubLObject forward_genlpreds_pos_rule_select(SubLObject asent) {
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = Sequences.delete(pred, genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject genl_pred = NIL;
      for (genl_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), genl_pred = cdolist_list_var.first()) {
        if ((NIL == hl_supports.hl_predicate_p(genl_pred))) {
          {
            SubLObject cdolist_list_var_52 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var_52.first(); (NIL != cdolist_list_var_52); cdolist_list_var_52 = cdolist_list_var_52.rest(), direction = cdolist_list_var_52.first()) {
              if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(genl_pred, $kw10$NEG, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(genl_pred, $kw10$NEG, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                            {
                              SubLObject done_var_53 = NIL;
                              SubLObject token_var_54 = NIL;
                              while ((NIL == done_var_53)) {
                                {
                                  SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_54);
                                  SubLObject valid_55 = makeBoolean((token_var_54 != rule));
                                  if ((NIL != valid_55)) {
                                    rules = cons(rule, rules);
                                  }
                                  done_var_53 = makeBoolean((NIL == valid_55));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                              try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      return rules;
    }
  }

  public static final class $forward_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $forward_genlpreds_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("FORWARD-GENLPREDS-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return forward_genlpreds_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 38779) 
  public static final SubLObject forward_genlpreds_pos_expand(SubLObject asent, SubLObject rule) {
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
      SubLObject cdolist_list_var = forward_genlpreds_pos_expand_int(asent, rule, UNPROVIDED);
      SubLObject examine_lit = NIL;
      for (examine_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine_lit = cdolist_list_var.first()) {
        {
          SubLObject genl_pred = cycl_utilities.atomic_sentence_predicate(examine_lit);
          SubLObject forward_asent = reader.bq_cons(genl_pred, ConsesLow.append(args, NIL));
          SubLObject more_supports = list(arguments.make_hl_support($kw61$GENLPREDS, list($const59$genlPreds, pred, genl_pred), UNPROVIDED, UNPROVIDED));
          forward_module_callback(forward_asent, $kw12$POS, examine_lit, $kw10$NEG, rule, more_supports);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 39301) 
  public static final SubLObject forward_genlpreds_pos_expand_int(SubLObject asent, SubLObject rule, SubLObject booleanP) {
    if ((booleanP == UNPROVIDED)) {
      booleanP = NIL;
    }
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject examine_lits = NIL;
      SubLObject assertion_var = rule;
      SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
      SubLObject rest = NIL;
      for (rest = clauses.neg_lits(cnf_var); (!((((NIL != booleanP)
               && (NIL != examine_lits))
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject lit = rest.first();
          SubLObject rule_pred = cycl_utilities.atomic_sentence_predicate(lit);
          if (((NIL != variables.fully_bound_p(rule_pred))
               && (pred != rule_pred)
               && (NIL == hl_supports.hl_predicate_p(rule_pred))
               && (NIL != genl_predicates.genl_predicateP(pred, rule_pred, UNPROVIDED, UNPROVIDED)))) {
            examine_lits = cons(lit, examine_lits);
          }
        }
      }
      return ((NIL != booleanP) ? ((SubLObject) list_utilities.sublisp_boolean(examine_lits)) : examine_lits);
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 42446) 
  public static final SubLObject forward_genlinverse_gaf_rule_select(SubLObject asent) {
    {
      SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      SubLObject rules = NIL;
      {
        SubLObject genl_preds = Sequences.delete(pred, genl_predicates.all_genl_preds(pred, UNPROVIDED, UNPROVIDED), Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
          if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($const60$genlInverse, $kw10$NEG, direction))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($const60$genlInverse, $kw10$NEG, direction);
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                        {
                          SubLObject done_var_56 = NIL;
                          SubLObject token_var_57 = NIL;
                          while ((NIL == done_var_56)) {
                            {
                              SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_57);
                              SubLObject valid_58 = makeBoolean((token_var_57 != rule));
                              if ((NIL != valid_58)) {
                                {
                                  SubLObject selectedP = NIL;
                                  SubLObject predicate_var = $const59$genlPreds;
                                  SubLObject assertion_var = rule;
                                  SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                  SubLObject rest = NIL;
                                  for (rest = clauses.neg_lits(cnf_var); (!(((NIL != selectedP)
                                        || (NIL == rest)))); rest = rest.rest()) {
                                    {
                                      SubLObject lit = rest.first();
                                      if ((predicate_var == cycl_utilities.atomic_sentence_predicate(lit))) {
                                        {
                                          SubLObject rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                                          if ((NIL != list_utilities.member_eqP(rule_pred, genl_preds))) {
                                            rules = cons(rule, rules);
                                            selectedP = T;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              done_var_56 = makeBoolean((NIL == valid_58));
                            }
                          }
                        }
                      } finally {
                        {
                          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                          try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            if ((NIL != final_index_iterator)) {
                              kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                          } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      {
        SubLObject genl_inverses = genl_predicates.all_genl_inverses(pred, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = backward_utilities.relevant_directions();
        SubLObject direction = NIL;
        for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
          if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator($const59$genlPreds, $kw10$NEG, direction))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator($const59$genlPreds, $kw10$NEG, direction);
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                        {
                          SubLObject done_var_59 = NIL;
                          SubLObject token_var_60 = NIL;
                          while ((NIL == done_var_59)) {
                            {
                              SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_60);
                              SubLObject valid_61 = makeBoolean((token_var_60 != rule));
                              if ((NIL != valid_61)) {
                                {
                                  SubLObject selectedP = NIL;
                                  SubLObject predicate_var = $const60$genlInverse;
                                  SubLObject assertion_var = rule;
                                  SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                                  SubLObject rest = NIL;
                                  for (rest = clauses.neg_lits(cnf_var); (!(((NIL != selectedP)
                                        || (NIL == rest)))); rest = rest.rest()) {
                                    {
                                      SubLObject lit = rest.first();
                                      if ((predicate_var == cycl_utilities.atomic_sentence_predicate(lit))) {
                                        {
                                          SubLObject rule_pred = cycl_utilities.atomic_sentence_arg2(lit, UNPROVIDED);
                                          if ((NIL != list_utilities.member_eqP(rule_pred, genl_inverses))) {
                                            rules = cons(rule, rules);
                                            selectedP = T;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              done_var_59 = makeBoolean((NIL == valid_61));
                            }
                          }
                        }
                      } finally {
                        {
                          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                          try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            if ((NIL != final_index_iterator)) {
                              kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                          } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      return rules;
    }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 46336) 
  public static final SubLObject forward_genlinverse_pos_rule_select(SubLObject asent) {
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject rules = NIL;
      SubLObject cdolist_list_var = genl_predicates.all_genl_inverses(pred, UNPROVIDED, UNPROVIDED);
      SubLObject genl_inverse = NIL;
      for (genl_inverse = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), genl_inverse = cdolist_list_var.first()) {
        if ((NIL == hl_supports.hl_predicate_p(genl_inverse))) {
          {
            SubLObject cdolist_list_var_62 = backward_utilities.relevant_directions();
            SubLObject direction = NIL;
            for (direction = cdolist_list_var_62.first(); (NIL != cdolist_list_var_62); cdolist_list_var_62 = cdolist_list_var_62.rest(), direction = cdolist_list_var_62.first()) {
              if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(genl_inverse, $kw10$NEG, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(genl_inverse, $kw10$NEG, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$RULE, NIL, direction);
                            {
                              SubLObject done_var_63 = NIL;
                              SubLObject token_var_64 = NIL;
                              while ((NIL == done_var_63)) {
                                {
                                  SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_64);
                                  SubLObject valid_65 = makeBoolean((token_var_64 != rule));
                                  if ((NIL != valid_65)) {
                                    rules = cons(rule, rules);
                                  }
                                  done_var_63 = makeBoolean((NIL == valid_65));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                              try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
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
      return rules;
    }
  }

  public static final class $forward_genlinverse_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $forward_genlinverse_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("FORWARD-GENLINVERSE-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return forward_genlinverse_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 50471) 
  public static final SubLObject forward_negationpreds_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread))) {
        {
          SubLObject pattern = $list74;
          return formula_pattern_match.formula_matches_pattern(asent, pattern);
        }
      }
      return NIL;
    }
  }

  public static final class $forward_negationpreds_required$UnaryFunction extends UnaryFunction {
    public $forward_negationpreds_required$UnaryFunction() { super(extractFunctionNamed("FORWARD-NEGATIONPREDS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return forward_negationpreds_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 52763) 
  public static final SubLObject forward_negationinverse_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != kb_control_vars.$forward_propagate_from_negations$.getDynamicValue(thread))) {
        {
          SubLObject pattern = $list79;
          return formula_pattern_match.formula_matches_pattern(asent, pattern);
        }
      }
      return NIL;
    }
  }

  public static final class $forward_negationinverse_required$UnaryFunction extends UnaryFunction {
    public $forward_negationinverse_required$UnaryFunction() { super(extractFunctionNamed("FORWARD-NEGATIONINVERSE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return forward_negationinverse_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 54966) 
  public static final SubLObject forward_eval_exclusive_pos(SubLObject asent) {
    {
      SubLObject pattern = $list83;
      return formula_pattern_match.formula_matches_pattern(asent, pattern);
    }
  }

  public static final class $forward_eval_exclusive_pos$UnaryFunction extends UnaryFunction {
    public $forward_eval_exclusive_pos$UnaryFunction() { super(extractFunctionNamed("FORWARD-EVAL-EXCLUSIVE-POS")); }
    public SubLObject processItem(SubLObject arg1) { return forward_eval_exclusive_pos(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 59062) 
  public static final SubLObject forward_unbound_pred_pos_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread);
    }
  }

  public static final class $forward_unbound_pred_pos_required$UnaryFunction extends UnaryFunction {
    public $forward_unbound_pred_pos_required$UnaryFunction() { super(extractFunctionNamed("FORWARD-UNBOUND-PRED-POS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return forward_unbound_pred_pos_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 61969) 
  public static final SubLObject forward_ist_pos_rule_select(SubLObject asent) {
    return all_ist_predicate_forward_rules(cycl_utilities.atomic_sentence_predicate(asent));
  }

  public static final class $forward_ist_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $forward_ist_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("FORWARD-IST-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return forward_ist_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62099) 
  public static final SubLObject forward_ist_pos_rule_filter(SubLObject asent, SubLObject rule) {
    return forward_ist_pos_expand_int(asent, rule, T);
  }

  public static final class $forward_ist_pos_expand$BinaryFunction extends BinaryFunction {
    public $forward_ist_pos_expand$BinaryFunction() { super(extractFunctionNamed("FORWARD-IST-POS-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32911"); }
  }

  @SubL(source = "cycl/inference/modules/forward-modules.lisp", position = 62674) 
  public static final SubLObject forward_ist_pos_expand_int(SubLObject asent, SubLObject rule, SubLObject booleanP) {
    if ((booleanP == UNPROVIDED)) {
      booleanP = NIL;
    }
    {
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject examine_lits = NIL;
      {
        SubLObject predicate_var = $const98$ist;
        SubLObject assertion_var = rule;
        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
        SubLObject rest = NIL;
        for (rest = clauses.neg_lits(cnf_var); (!((((NIL != booleanP)
                 && (NIL != examine_lits))
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject lit = rest.first();
            if ((predicate_var == cycl_utilities.atomic_sentence_predicate(lit))) {
              {
                SubLObject sub_sentence = el_utilities.literal_arg2(lit, UNPROVIDED);
                if ((NIL == el_utilities.el_negation_p(sub_sentence))) {
                  {
                    SubLObject sub_pred = el_utilities.literal_predicate(sub_sentence, UNPROVIDED);
                    if ((pred == sub_pred)) {
                      examine_lits = cons(lit, examine_lits);
                    }
                  }
                }
              }
            }
          }
        }
      }
      {
        SubLObject predicate_var = $const98$ist;
        SubLObject assertion_var = rule;
        SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
        SubLObject rest = NIL;
        for (rest = clauses.pos_lits(cnf_var); (!((((NIL != booleanP)
                 && (NIL != examine_lits))
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject lit = rest.first();
            if ((predicate_var == cycl_utilities.atomic_sentence_predicate(lit))) {
              {
                SubLObject sub_sentence = el_utilities.literal_arg2(lit, UNPROVIDED);
                if ((NIL != el_utilities.el_negation_p(sub_sentence))) {
                  {
                    SubLObject sub_pred = el_utilities.literal_predicate(sub_sentence, UNPROVIDED);
                    if ((pred == sub_pred)) {
                      examine_lits = cons(lit, examine_lits);
                    }
                  }
                }
              }
            }
          }
        }
      }
      return ((NIL != booleanP) ? ((SubLObject) list_utilities.sublisp_boolean(examine_lits)) : examine_lits);
    }
  }

  public static final SubLObject declare_forward_modules_file() {
    declareFunction("forward_modules", "FORWARD-MODULES", 0, 0, false);
    declareFunction("forward_module_count", "FORWARD-MODULE-COUNT", 0, 0, false);
    declareFunction("forward_module_p", "FORWARD-MODULE-P", 1, 0, false);
    declareFunction("forward_module", "FORWARD-MODULE", 2, 0, false);
    declareFunction("undeclare_forward_module", "UNDECLARE-FORWARD-MODULE", 1, 0, false);
    declareMacro("do_forward_modules", "DO-FORWARD-MODULES");
    declareFunction("do_forward_modules_list", "DO-FORWARD-MODULES-LIST", 0, 0, false);
    declareFunction("forward_module_callback", "FORWARD-MODULE-CALLBACK", 5, 1, false);
    declareFunction("forward_tactic_specs", "FORWARD-TACTIC-SPECS", 3, 0, false);
    declareFunction("forward_hl_modules", "FORWARD-HL-MODULES", 2, 0, false);
    declareFunction("forward_hl_module_apply", "FORWARD-HL-MODULE-APPLY", 2, 0, false);
    declareFunction("forward_hl_module_rule_select", "FORWARD-HL-MODULE-RULE-SELECT", 2, 0, false);
    declareFunction("forward_hl_module_rule_filter", "FORWARD-HL-MODULE-RULE-FILTER", 3, 0, false);
    declareFunction("forward_hl_module_expand", "FORWARD-HL-MODULE-EXPAND", 3, 0, false);
    declareFunction("all_antecedent_predicate_forward_rules", "ALL-ANTECEDENT-PREDICATE-FORWARD-RULES", 1, 0, false);
    declareFunction("all_consequent_predicate_forward_rules", "ALL-CONSEQUENT-PREDICATE-FORWARD-RULES", 1, 0, false);
    declareFunction("all_ist_predicate_forward_rules", "ALL-IST-PREDICATE-FORWARD-RULES", 1, 0, false);
    declareFunction("forward_normal_pos_rule_select", "FORWARD-NORMAL-POS-RULE-SELECT", 1, 0, false); new $forward_normal_pos_rule_select$UnaryFunction();
    declareFunction("forward_normal_pos_rule_filter", "FORWARD-NORMAL-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_normal_pos_expand", "FORWARD-NORMAL-POS-EXPAND", 2, 0, false); new $forward_normal_pos_expand$BinaryFunction();
    declareFunction("forward_normal_pos_expand_int", "FORWARD-NORMAL-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_normal_neg_rule_select", "FORWARD-NORMAL-NEG-RULE-SELECT", 1, 0, false);
    declareFunction("forward_normal_neg_rule_filter", "FORWARD-NORMAL-NEG-RULE-FILTER", 2, 0, false);
    declareFunction("forward_normal_neg_expand", "FORWARD-NORMAL-NEG-EXPAND", 2, 0, false);
    declareFunction("forward_normal_neg_expand_int", "FORWARD-NORMAL-NEG-EXPAND-INT", 2, 1, false);
    declareFunction("forward_isa_rule_select", "FORWARD-ISA-RULE-SELECT", 1, 0, false); new $forward_isa_rule_select$UnaryFunction();
    declareFunction("forward_isa_rule_filter", "FORWARD-ISA-RULE-FILTER", 2, 0, false);
    declareFunction("forward_isa_expand", "FORWARD-ISA-EXPAND", 2, 0, false); new $forward_isa_expand$BinaryFunction();
    declareFunction("forward_isa_expand_int", "FORWARD-ISA-EXPAND-INT", 2, 1, false);
    declareFunction("forward_inference_genlP", "FORWARD-INFERENCE-GENL?", 2, 0, false);
    declareFunction("forward_inference_all_genls_internal", "FORWARD-INFERENCE-ALL-GENLS-INTERNAL", 1, 0, false);
    declareFunction("forward_inference_all_genls", "FORWARD-INFERENCE-ALL-GENLS", 1, 0, false);
    declareFunction("forward_not_isa_rule_select", "FORWARD-NOT-ISA-RULE-SELECT", 1, 0, false);
    declareFunction("forward_not_isa_rule_filter", "FORWARD-NOT-ISA-RULE-FILTER", 2, 0, false);
    declareFunction("forward_not_isa_expand", "FORWARD-NOT-ISA-EXPAND", 2, 0, false);
    declareFunction("forward_not_isa_expand_int", "FORWARD-NOT-ISA-EXPAND-INT", 2, 1, false);
    declareFunction("forward_quoted_isa_rule_select", "FORWARD-QUOTED-ISA-RULE-SELECT", 1, 0, false);
    declareFunction("forward_quoted_isa_rule_filter", "FORWARD-QUOTED-ISA-RULE-FILTER", 2, 0, false);
    declareFunction("forward_quoted_isa_expand", "FORWARD-QUOTED-ISA-EXPAND", 2, 0, false);
    declareFunction("forward_quoted_isa_expand_int", "FORWARD-QUOTED-ISA-EXPAND-INT", 2, 1, false);
    declareFunction("forward_not_quoted_isa_rule_select", "FORWARD-NOT-QUOTED-ISA-RULE-SELECT", 1, 0, false);
    declareFunction("forward_not_quoted_isa_rule_filter", "FORWARD-NOT-QUOTED-ISA-RULE-FILTER", 2, 0, false);
    declareFunction("forward_not_quoted_isa_expand", "FORWARD-NOT-QUOTED-ISA-EXPAND", 2, 0, false);
    declareFunction("forward_not_quoted_isa_expand_int", "FORWARD-NOT-QUOTED-ISA-EXPAND-INT", 2, 1, false);
    declareFunction("forward_genls_rule_select", "FORWARD-GENLS-RULE-SELECT", 1, 0, false);
    declareFunction("forward_genls_rule_filter", "FORWARD-GENLS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_genls_expand", "FORWARD-GENLS-EXPAND", 2, 0, false);
    declareFunction("forward_genls_expand_int", "FORWARD-GENLS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_not_genls_rule_select", "FORWARD-NOT-GENLS-RULE-SELECT", 1, 0, false);
    declareFunction("forward_not_genls_rule_filter", "FORWARD-NOT-GENLS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_not_genls_expand", "FORWARD-NOT-GENLS-EXPAND", 2, 0, false);
    declareFunction("forward_not_genls_expand_int", "FORWARD-NOT-GENLS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_genlmt_rule_select", "FORWARD-GENLMT-RULE-SELECT", 1, 0, false);
    declareFunction("forward_genlmt_rule_filter", "FORWARD-GENLMT-RULE-FILTER", 2, 0, false);
    declareFunction("forward_genlmt_expand", "FORWARD-GENLMT-EXPAND", 2, 0, false);
    declareFunction("forward_genlmt_expand_int", "FORWARD-GENLMT-EXPAND-INT", 2, 1, false);
    declareFunction("forward_not_genlmt_rule_select", "FORWARD-NOT-GENLMT-RULE-SELECT", 1, 0, false);
    declareFunction("forward_not_genlmt_rule_filter", "FORWARD-NOT-GENLMT-RULE-FILTER", 2, 0, false);
    declareFunction("forward_not_genlmt_expand", "FORWARD-NOT-GENLMT-EXPAND", 2, 0, false);
    declareFunction("forward_not_genlmt_expand_int", "FORWARD-NOT-GENLMT-EXPAND-INT", 2, 1, false);
    declareFunction("forward_symmetric_pos_rule_select", "FORWARD-SYMMETRIC-POS-RULE-SELECT", 1, 0, false); new $forward_symmetric_pos_rule_select$UnaryFunction();
    declareFunction("forward_symmetric_pos_rule_filter", "FORWARD-SYMMETRIC-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_symmetric_pos_expand", "FORWARD-SYMMETRIC-POS-EXPAND", 2, 0, false);
    declareFunction("forward_symmetric_pos_expand_int", "FORWARD-SYMMETRIC-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_symmetric_neg_rule_select", "FORWARD-SYMMETRIC-NEG-RULE-SELECT", 1, 0, false);
    declareFunction("forward_symmetric_neg_rule_filter", "FORWARD-SYMMETRIC-NEG-RULE-FILTER", 2, 0, false);
    declareFunction("forward_symmetric_neg_expand", "FORWARD-SYMMETRIC-NEG-EXPAND", 2, 0, false);
    declareFunction("forward_symmetric_neg_expand_int", "FORWARD-SYMMETRIC-NEG-EXPAND-INT", 2, 1, false);
    declareFunction("forward_asymmetric_required", "FORWARD-ASYMMETRIC-REQUIRED", 1, 0, false); new $forward_asymmetric_required$UnaryFunction();
    declareFunction("forward_asymmetric_rule_select", "FORWARD-ASYMMETRIC-RULE-SELECT", 1, 0, false);
    declareFunction("forward_asymmetric_rule_filter", "FORWARD-ASYMMETRIC-RULE-FILTER", 2, 0, false);
    declareFunction("forward_asymmetric_expand", "FORWARD-ASYMMETRIC-EXPAND", 2, 0, false);
    declareFunction("forward_asymmetric_expand_int", "FORWARD-ASYMMETRIC-EXPAND-INT", 2, 1, false);
    declareFunction("forward_commutative_pos_rule_select", "FORWARD-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
    declareFunction("forward_commutative_pos_rule_filter", "FORWARD-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_commutative_pos_expand", "FORWARD-COMMUTATIVE-POS-EXPAND", 2, 0, false);
    declareFunction("forward_commutative_pos_expand_int", "FORWARD-COMMUTATIVE-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_commutative_neg_rule_select", "FORWARD-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
    declareFunction("forward_commutative_neg_rule_filter", "FORWARD-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
    declareFunction("forward_commutative_neg_expand", "FORWARD-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
    declareFunction("forward_commutative_neg_expand_int", "FORWARD-COMMUTATIVE-NEG-EXPAND-INT", 2, 1, false);
    declareFunction("forward_genlpreds_gaf_rule_select", "FORWARD-GENLPREDS-GAF-RULE-SELECT", 1, 0, false);
    declareFunction("forward_genlpreds_gaf_rule_filter", "FORWARD-GENLPREDS-GAF-RULE-FILTER", 2, 0, false);
    declareFunction("forward_genlpreds_gaf_expand", "FORWARD-GENLPREDS-GAF-EXPAND", 2, 0, false);
    declareFunction("forward_genlpreds_gaf_expand_int", "FORWARD-GENLPREDS-GAF-EXPAND-INT", 2, 1, false);
    declareFunction("forward_not_genlpreds_gaf_rule_select", "FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT", 1, 0, false);
    declareFunction("forward_not_genlpreds_gaf_rule_filter", "FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER", 2, 0, false);
    declareFunction("forward_not_genlpreds_gaf_expand", "FORWARD-NOT-GENLPREDS-GAF-EXPAND", 2, 0, false);
    declareFunction("forward_genlpreds_pos_rule_select", "FORWARD-GENLPREDS-POS-RULE-SELECT", 1, 0, false); new $forward_genlpreds_pos_rule_select$UnaryFunction();
    declareFunction("forward_genlpreds_pos_rule_filter", "FORWARD-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_genlpreds_pos_expand", "FORWARD-GENLPREDS-POS-EXPAND", 2, 0, false);
    declareFunction("forward_genlpreds_pos_expand_int", "FORWARD-GENLPREDS-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_genlinverse_gaf_rule_select", "FORWARD-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false);
    declareFunction("forward_genlinverse_gaf_rule_filter", "FORWARD-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false);
    declareFunction("forward_genlinverse_gaf_expand", "FORWARD-GENLINVERSE-GAF-EXPAND", 2, 0, false);
    declareFunction("forward_genlinverse_gaf_expand_int", "FORWARD-GENLINVERSE-GAF-EXPAND-INT", 2, 1, false);
    declareFunction("forward_not_genlinverse_gaf_rule_select", "FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT", 1, 0, false);
    declareFunction("forward_not_genlinverse_gaf_rule_filter", "FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER", 2, 0, false);
    declareFunction("forward_not_genlinverse_gaf_expand", "FORWARD-NOT-GENLINVERSE-GAF-EXPAND", 2, 0, false);
    declareFunction("forward_genlinverse_pos_rule_select", "FORWARD-GENLINVERSE-POS-RULE-SELECT", 1, 0, false); new $forward_genlinverse_pos_rule_select$UnaryFunction();
    declareFunction("forward_genlinverse_pos_rule_filter", "FORWARD-GENLINVERSE-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_genlinverse_pos_expand", "FORWARD-GENLINVERSE-POS-EXPAND", 2, 0, false);
    declareFunction("forward_genlinverse_pos_expand_int", "FORWARD-GENLINVERSE-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_negationpreds_required", "FORWARD-NEGATIONPREDS-REQUIRED", 1, 0, false); new $forward_negationpreds_required$UnaryFunction();
    declareFunction("forward_negationpreds_rule_select", "FORWARD-NEGATIONPREDS-RULE-SELECT", 1, 0, false);
    declareFunction("forward_negationpreds_rule_filter", "FORWARD-NEGATIONPREDS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_negationpreds_expand", "FORWARD-NEGATIONPREDS-EXPAND", 2, 0, false);
    declareFunction("forward_negationpreds_expand_int", "FORWARD-NEGATIONPREDS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_negationinverse_required", "FORWARD-NEGATIONINVERSE-REQUIRED", 1, 0, false); new $forward_negationinverse_required$UnaryFunction();
    declareFunction("forward_negationinverse_rule_select", "FORWARD-NEGATIONINVERSE-RULE-SELECT", 1, 0, false);
    declareFunction("forward_negationinverse_rule_filter", "FORWARD-NEGATIONINVERSE-RULE-FILTER", 2, 0, false);
    declareFunction("forward_negationinverse_expand", "FORWARD-NEGATIONINVERSE-EXPAND", 2, 0, false);
    declareFunction("forward_negationinverse_expand_int", "FORWARD-NEGATIONINVERSE-EXPAND-INT", 2, 1, false);
    declareFunction("forward_eval_exclusive_pos", "FORWARD-EVAL-EXCLUSIVE-POS", 1, 0, false); new $forward_eval_exclusive_pos$UnaryFunction();
    declareFunction("forward_eval_expand_pos", "FORWARD-EVAL-EXPAND-POS", 2, 0, false);
    declareFunction("forward_eval_exclusive_neg", "FORWARD-EVAL-EXCLUSIVE-NEG", 1, 0, false);
    declareFunction("forward_eval_expand_neg", "FORWARD-EVAL-EXPAND-NEG", 2, 0, false);
    declareFunction("forward_term_of_unit_rule_select", "FORWARD-TERM-OF-UNIT-RULE-SELECT", 1, 0, false);
    declareFunction("forward_term_of_unit_rule_filter", "FORWARD-TERM-OF-UNIT-RULE-FILTER", 2, 0, false);
    declareFunction("forward_term_of_unit_expand", "FORWARD-TERM-OF-UNIT-EXPAND", 2, 0, false);
    declareFunction("forward_term_of_unit_expand_int", "FORWARD-TERM-OF-UNIT-EXPAND-INT", 2, 1, false);
    declareFunction("forward_nat_function_rule_select", "FORWARD-NAT-FUNCTION-RULE-SELECT", 1, 0, false);
    declareFunction("forward_nat_function_rule_filter", "FORWARD-NAT-FUNCTION-RULE-FILTER", 2, 0, false);
    declareFunction("forward_nat_function_expand", "FORWARD-NAT-FUNCTION-EXPAND", 2, 0, false);
    declareFunction("forward_nat_function_expand_int", "FORWARD-NAT-FUNCTION-EXPAND-INT", 2, 1, false);
    declareFunction("forward_unbound_pred_pos_required", "FORWARD-UNBOUND-PRED-POS-REQUIRED", 1, 0, false); new $forward_unbound_pred_pos_required$UnaryFunction();
    declareFunction("forward_unbound_pred_pos_rule_select", "FORWARD-UNBOUND-PRED-POS-RULE-SELECT", 1, 0, false);
    declareFunction("forward_unbound_pred_pos_rule_filter", "FORWARD-UNBOUND-PRED-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_unbound_pred_pos_expand", "FORWARD-UNBOUND-PRED-POS-EXPAND", 2, 0, false);
    declareFunction("forward_unbound_pred_pos_expand_int", "FORWARD-UNBOUND-PRED-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_unbound_pred_neg_required", "FORWARD-UNBOUND-PRED-NEG-REQUIRED", 1, 0, false);
    declareFunction("forward_unbound_pred_neg_rule_select", "FORWARD-UNBOUND-PRED-NEG-RULE-SELECT", 1, 0, false);
    declareFunction("forward_unbound_pred_neg_rule_filter", "FORWARD-UNBOUND-PRED-NEG-RULE-FILTER", 2, 0, false);
    declareFunction("forward_unbound_pred_neg_expand", "FORWARD-UNBOUND-PRED-NEG-EXPAND", 2, 0, false);
    declareFunction("forward_unbound_pred_neg_expand_int", "FORWARD-UNBOUND-PRED-NEG-EXPAND-INT", 2, 1, false);
    declareFunction("forward_ist_pos_rule_select", "FORWARD-IST-POS-RULE-SELECT", 1, 0, false); new $forward_ist_pos_rule_select$UnaryFunction();
    declareFunction("forward_ist_pos_rule_filter", "FORWARD-IST-POS-RULE-FILTER", 2, 0, false);
    declareFunction("forward_ist_pos_expand", "FORWARD-IST-POS-EXPAND", 2, 0, false); new $forward_ist_pos_expand$BinaryFunction();
    declareFunction("forward_ist_pos_expand_int", "FORWARD-IST-POS-EXPAND-INT", 2, 1, false);
    declareFunction("forward_ist_neg_rule_select", "FORWARD-IST-NEG-RULE-SELECT", 1, 0, false);
    declareFunction("forward_ist_neg_rule_filter", "FORWARD-IST-NEG-RULE-FILTER", 2, 0, false);
    declareFunction("forward_ist_neg_expand", "FORWARD-IST-NEG-EXPAND", 2, 0, false);
    declareFunction("forward_ist_neg_expand_int", "FORWARD-IST-NEG-EXPAND-INT", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_forward_modules_file() {
    $forward_modules$ = defparameter("*FORWARD-MODULES*", NIL);
    $forward_tactic_specs$ = defparameter("*FORWARD-TACTIC-SPECS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_forward_modules_file() {
        access_macros.register_macro_helper($sym7$DO_FORWARD_MODULES_LIST, $sym8$DO_FORWARD_MODULES);
    forward_module($kw13$FORWARD_NORMAL_POS, $list14);
    forward_module($kw15$FORWARD_NORMAL_NEG, $list16);
    forward_module($kw17$FORWARD_ISA, $list18);
    memoization_state.note_memoized_function($sym22$FORWARD_INFERENCE_ALL_GENLS);
    forward_module($kw24$FORWARD_NOT_ISA, $list25);
    forward_module($kw26$FORWARD_QUOTED_ISA, $list27);
    forward_module($kw29$FORWARD_NOT_QUOTED_ISA, $list30);
    forward_module($kw31$FORWARD_GENLS, $list32);
    forward_module($kw33$FORWARD_NOT_GENLS, $list34);
    forward_module($kw35$FORWARD_GENLMT, $list36);
    forward_module($kw39$FORWARD_NOT_GENLMT, $list40);
    forward_module($kw41$FORWARD_SYMMETRIC_POS, $list42);
    forward_module($kw45$FORWARD_SYMMETRIC_NEG, $list46);
    forward_module($kw47$FORWARD_ASYMMETRIC, $list48);
    forward_module($kw51$FORWARD_COMMUTATIVE_POS, $list52);
    forward_module($kw55$FORWARD_COMMUTATIVE_NEG, $list56);
    forward_module($kw57$FORWARD_GENLPREDS_GAF, $list58);
    forward_module($kw62$FORWARD_NOT_GENLPREDS_GAF, $list63);
    forward_module($kw64$FORWARD_GENLPREDS_POS, $list65);
    forward_module($kw66$FORWARD_GENLINVERSE_GAF, $list67);
    forward_module($kw68$FORWARD_NOT_GENLINVERSE_GAF, $list69);
    forward_module($kw70$FORWARD_GENLINVERSE_POS, $list71);
    forward_module($kw72$FORWARD_NEGATIONPREDS, $list73);
    forward_module($kw77$FORWARD_NEGATIONINVERSE, $list78);
    forward_module($kw81$FORWARD_EVAL_POS, $list82);
    forward_module($kw84$FORWARD_EVAL_NEG, $list85);
    forward_module($kw86$FORWARD_TERM_OF_UNIT, $list87);
    forward_module($kw89$FORWARD_NAT_FUNCTION, $list90);
    forward_module($kw92$FORWARD_UNBOUND_PRED_POS, $list93);
    forward_module($kw94$FORWARD_UNBOUND_PRED_NEG, $list95);
    forward_module($kw96$FORWARD_IST_POS, $list97);
    forward_module($kw99$FORWARD_IST_NEG, $list100);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$FORWARD = makeKeyword("FORWARD");
  public static final SubLList $list1 = list(list(makeSymbol("HL-MODULE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym5$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLList $list6 = list(makeSymbol("DO-FORWARD-MODULES-LIST"));
  public static final SubLSymbol $sym7$DO_FORWARD_MODULES_LIST = makeSymbol("DO-FORWARD-MODULES-LIST");
  public static final SubLSymbol $sym8$DO_FORWARD_MODULES = makeSymbol("DO-FORWARD-MODULES");
  public static final SubLSymbol $kw9$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw10$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw11$RULE = makeKeyword("RULE");
  public static final SubLSymbol $kw12$POS = makeKeyword("POS");
  public static final SubLSymbol $kw13$FORWARD_NORMAL_POS = makeKeyword("FORWARD-NORMAL-POS");
  public static final SubLList $list14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NORMAL-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NORMAL-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NORMAL-POS-EXPAND"));
  public static final SubLSymbol $kw15$FORWARD_NORMAL_NEG = makeKeyword("FORWARD-NORMAL-NEG");
  public static final SubLList $list16 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NORMAL-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NORMAL-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NORMAL-NEG-EXPAND"));
  public static final SubLSymbol $kw17$FORWARD_ISA = makeKeyword("FORWARD-ISA");
  public static final SubLList $list18 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-ISA-EXPAND")});
  public static final SubLObject $const19$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw20$GENLS = makeKeyword("GENLS");
  public static final SubLObject $const21$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym22$FORWARD_INFERENCE_ALL_GENLS = makeSymbol("FORWARD-INFERENCE-ALL-GENLS");
  public static final SubLSymbol $kw23$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw24$FORWARD_NOT_ISA = makeKeyword("FORWARD-NOT-ISA");
  public static final SubLList $list25 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-ISA-EXPAND")});
  public static final SubLSymbol $kw26$FORWARD_QUOTED_ISA = makeKeyword("FORWARD-QUOTED-ISA");
  public static final SubLList $list27 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-QUOTED-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-QUOTED-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-QUOTED-ISA-EXPAND")});
  public static final SubLObject $const28$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $kw29$FORWARD_NOT_QUOTED_ISA = makeKeyword("FORWARD-NOT-QUOTED-ISA");
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-QUOTED-ISA-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-QUOTED-ISA-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-QUOTED-ISA-EXPAND")});
  public static final SubLSymbol $kw31$FORWARD_GENLS = makeKeyword("FORWARD-GENLS");
  public static final SubLList $list32 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLS-EXPAND")});
  public static final SubLSymbol $kw33$FORWARD_NOT_GENLS = makeKeyword("FORWARD-NOT-GENLS");
  public static final SubLList $list34 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLS-EXPAND")});
  public static final SubLSymbol $kw35$FORWARD_GENLMT = makeKeyword("FORWARD-GENLMT");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlMt")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLMT-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLMT-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLMT-EXPAND")});
  public static final SubLObject $const37$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw38$GENLMT = makeKeyword("GENLMT");
  public static final SubLSymbol $kw39$FORWARD_NOT_GENLMT = makeKeyword("FORWARD-NOT-GENLMT");
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlMt")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLMT-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLMT-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLMT-EXPAND")});
  public static final SubLSymbol $kw41$FORWARD_SYMMETRIC_POS = makeKeyword("FORWARD-SYMMETRIC-POS");
  public static final SubLList $list42 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-SYMMETRIC-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-SYMMETRIC-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-SYMMETRIC-POS-EXPAND")});
  public static final SubLSymbol $kw43$ISA = makeKeyword("ISA");
  public static final SubLList $list44 = list(constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate")));
  public static final SubLSymbol $kw45$FORWARD_SYMMETRIC_NEG = makeKeyword("FORWARD-SYMMETRIC-NEG");
  public static final SubLList $list46 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-SYMMETRIC-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-SYMMETRIC-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-SYMMETRIC-NEG-EXPAND")});
  public static final SubLSymbol $kw47$FORWARD_ASYMMETRIC = makeKeyword("FORWARD-ASYMMETRIC");
  public static final SubLList $list48 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-ASYMMETRIC-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-ASYMMETRIC-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-ASYMMETRIC-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-ASYMMETRIC-EXPAND")});
  public static final SubLList $list49 = list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));
  public static final SubLList $list50 = list(constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")));
  public static final SubLSymbol $kw51$FORWARD_COMMUTATIVE_POS = makeKeyword("FORWARD-COMMUTATIVE-POS");
  public static final SubLList $list52 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-COMMUTATIVE-POS-EXPAND")});
  public static final SubLList $list53 = list(constant_handles.reader_make_constant_shell(makeString("CommutativePredicate")));
  public static final SubLList $list54 = list(constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativePredicate")));
  public static final SubLSymbol $kw55$FORWARD_COMMUTATIVE_NEG = makeKeyword("FORWARD-COMMUTATIVE-NEG");
  public static final SubLList $list56 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-COMMUTATIVE-NEG-EXPAND")});
  public static final SubLSymbol $kw57$FORWARD_GENLPREDS_GAF = makeKeyword("FORWARD-GENLPREDS-GAF");
  public static final SubLList $list58 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLPREDS-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLPREDS-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLPREDS-GAF-EXPAND")});
  public static final SubLObject $const59$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const60$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $kw61$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLSymbol $kw62$FORWARD_NOT_GENLPREDS_GAF = makeKeyword("FORWARD-NOT-GENLPREDS-GAF");
  public static final SubLList $list63 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLPREDS-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLPREDS-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLPREDS-GAF-EXPAND")});
  public static final SubLSymbol $kw64$FORWARD_GENLPREDS_POS = makeKeyword("FORWARD-GENLPREDS-POS");
  public static final SubLList $list65 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLPREDS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLPREDS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLPREDS-POS-EXPAND")});
  public static final SubLSymbol $kw66$FORWARD_GENLINVERSE_GAF = makeKeyword("FORWARD-GENLINVERSE-GAF");
  public static final SubLList $list67 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlInverse")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlInverse")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")))), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLINVERSE-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLINVERSE-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLINVERSE-GAF-EXPAND")});
  public static final SubLSymbol $kw68$FORWARD_NOT_GENLINVERSE_GAF = makeKeyword("FORWARD-NOT-GENLINVERSE-GAF");
  public static final SubLList $list69 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlInverse")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NOT-GENLINVERSE-GAF-EXPAND")});
  public static final SubLSymbol $kw70$FORWARD_GENLINVERSE_POS = makeKeyword("FORWARD-GENLINVERSE-POS");
  public static final SubLList $list71 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-GENLINVERSE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-GENLINVERSE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-GENLINVERSE-POS-EXPAND")});
  public static final SubLSymbol $kw72$FORWARD_NEGATIONPREDS = makeKeyword("FORWARD-NEGATIONPREDS");
  public static final SubLList $list73 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-NEGATIONPREDS-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NEGATIONPREDS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NEGATIONPREDS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NEGATIONPREDS-EXPAND")});
  public static final SubLList $list74 = cons(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING"));
  public static final SubLSymbol $kw75$NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
  public static final SubLObject $const76$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLSymbol $kw77$FORWARD_NEGATIONINVERSE = makeKeyword("FORWARD-NEGATIONINVERSE");
  public static final SubLList $list78 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-NEGATIONINVERSE-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NEGATIONINVERSE-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NEGATIONINVERSE-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NEGATIONINVERSE-EXPAND")});
  public static final SubLList $list79 = list(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));
  public static final SubLObject $const80$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $kw81$FORWARD_EVAL_POS = makeKeyword("FORWARD-EVAL-POS");
  public static final SubLList $list82 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("EXCLUSIVE"), makeSymbol("FORWARD-EVAL-EXCLUSIVE-POS"), makeKeyword("EXPAND"), makeSymbol("FORWARD-EVAL-EXPAND-POS"));
  public static final SubLList $list83 = cons(list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?"))), makeKeyword("ANYTHING"));
  public static final SubLSymbol $kw84$FORWARD_EVAL_NEG = makeKeyword("FORWARD-EVAL-NEG");
  public static final SubLList $list85 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("EXCLUSIVE"), makeSymbol("FORWARD-EVAL-EXCLUSIVE-NEG"), makeKeyword("EXPAND"), makeSymbol("FORWARD-EVAL-EXPAND-NEG"));
  public static final SubLSymbol $kw86$FORWARD_TERM_OF_UNIT = makeKeyword("FORWARD-TERM-OF-UNIT");
  public static final SubLList $list87 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-TERM-OF-UNIT-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-TERM-OF-UNIT-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-TERM-OF-UNIT-EXPAND")});
  public static final SubLObject $const88$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $kw89$FORWARD_NAT_FUNCTION = makeKeyword("FORWARD-NAT-FUNCTION");
  public static final SubLList $list90 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-NAT-FUNCTION-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-NAT-FUNCTION-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-NAT-FUNCTION-EXPAND")});
  public static final SubLObject $const91$natFunction = constant_handles.reader_make_constant_shell(makeString("natFunction"));
  public static final SubLSymbol $kw92$FORWARD_UNBOUND_PRED_POS = makeKeyword("FORWARD-UNBOUND-PRED-POS");
  public static final SubLList $list93 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-UNBOUND-PRED-POS-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-UNBOUND-PRED-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-UNBOUND-PRED-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-UNBOUND-PRED-POS-EXPAND")});
  public static final SubLSymbol $kw94$FORWARD_UNBOUND_PRED_NEG = makeKeyword("FORWARD-UNBOUND-PRED-NEG");
  public static final SubLList $list95 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-REQUIRED"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-UNBOUND-PRED-NEG-EXPAND")});
  public static final SubLSymbol $kw96$FORWARD_IST_POS = makeKeyword("FORWARD-IST-POS");
  public static final SubLList $list97 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-IST-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-IST-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-IST-POS-EXPAND"));
  public static final SubLObject $const98$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $kw99$FORWARD_IST_NEG = makeKeyword("FORWARD-IST-NEG");
  public static final SubLList $list100 = list(makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("RULE-SELECT"), makeSymbol("FORWARD-IST-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("FORWARD-IST-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("FORWARD-IST-NEG-EXPAND"));

  //// Initializers

  public void declareFunctions() {
    declare_forward_modules_file();
  }

  public void initializeVariables() {
    init_forward_modules_file();
  }

  public void runTopLevelForms() {
    setup_forward_modules_file();
  }

}
