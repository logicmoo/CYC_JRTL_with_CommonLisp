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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;

public  final class backward extends SubLTranslatedFile {

  //// Constructor

  private backward() {}
  public static final SubLFile me = new backward();
  public static final String myName = "com.cyc.cycjava.cycl.backward";

  //// Definitions

  /** When non-nil, the implementation to funcall inside REMOVAL-ADD-NODE. */
  @SubL(source = "cycl/backward.lisp", position = 710) 
  public static SubLSymbol $removal_add_node_method$ = null;

  /** When non-nil, the implementation to funcall inside TRANSFORMATION-ADD-NODE. */
  @SubL(source = "cycl/backward.lisp", position = 911) 
  public static SubLSymbol $transformation_add_node_method$ = null;

  /** If any non-backchain literals exist in the transformation layer,
and they have an estimated removal cost less than this, force these
removals to be done first.
Since the productivity of join-ordered links is doubled, this is equal to DOUBLE
the number of children that the focal problem can have and still be considered for early removal.
NIL means never perform early removals.
T means always perform early removals first. */
  @SubL(source = "cycl/backward.lisp", position = 1062) 
  public static SubLSymbol $transformation_early_removal_threshold$ = null;

  /** Bound by INFERENCE-EXPAND-INTERNAL */
  @SubL(source = "cycl/backward.lisp", position = 1556) 
  private static SubLSymbol $inference_expand_new_children$ = null;

  /** Bound by INFERENCE-EXPAND-INTERNAL */
  @SubL(source = "cycl/backward.lisp", position = 1903) 
  public static SubLSymbol $inference_expand_hl_module$ = null;

  @SubL(source = "cycl/backward.lisp", position = 2047) 
  public static final SubLObject inference_expand_hl_module() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $inference_expand_hl_module$.getDynamicValue(thread);
    }
  }

  /** Bound by INFERENCE-EXPAND-INTERNAL */
  @SubL(source = "cycl/backward.lisp", position = 2248) 
  public static SubLSymbol $inference_expand_sense$ = null;

  @SubL(source = "cycl/backward.lisp", position = 2388) 
  public static final SubLObject inference_expand_sense() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $inference_expand_sense$.getDynamicValue(thread);
    }
  }

  /** @param RULE-PIVOT-ASENT; the asent from RULE-ASSERTION that was used in the transformation.
Computes information for a new link object and a new child node,
creates them, performs unification, and does a bunch of bookkeeping.
If you have (and (p x) (q x)) -> (or (r x) (s x)) and you backchain on (r a),
then the rule-assertion will be (and (p x) (q x)) -> (or (r x) (s x)),
the bindings will be (((x . a))), the new-pos-lits will be ((p a) (q a)), the new-neg-lits
will be ((s a)), more-supports will be, like, an additional genlPreds support if it used one,
no-trans-pos-lits and no-trans-neg-lits will both always be NIL.  Currently no transformation
modules pass these in. */
  @SubL(source = "cycl/backward.lisp", position = 2467) 
  public static final SubLObject transformation_add_node(SubLObject rule_assertion, SubLObject rule_pivot_asent, SubLObject rule_pivot_sense, SubLObject v_bindings, SubLObject more_supports) {
    if ((more_supports == UNPROVIDED)) {
      more_supports = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == v_bindings)) {
        v_bindings = bindings.unification_success_token();
      }
      {
        SubLObject no_trans_pos_lits = NIL;
        SubLObject no_trans_neg_lits = NIL;
        thread.resetMultipleValues();
        {
          SubLObject new_pos_lits = transformation_rule_dependent_lits(rule_assertion, rule_pivot_asent, rule_pivot_sense);
          SubLObject new_neg_lits = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != $transformation_add_node_method$.getDynamicValue(thread))) {
            {
              SubLObject dependent_dnf = clauses.make_clause(ConsesLow.append(new_neg_lits, no_trans_neg_lits), ConsesLow.append(new_pos_lits, no_trans_pos_lits));
              return Functions.funcall($transformation_add_node_method$.getDynamicValue(thread), rule_assertion, rule_pivot_asent, rule_pivot_sense, v_bindings, dependent_dnf, more_supports);
            }
          }
          return Errors.error($str0$The_legacy_harness_is_no_longer_s);
        }
      }
    }
  }

  /** @return 0 new-pos-lits
@return 1 new-neg-lits */
  @SubL(source = "cycl/backward.lisp", position = 4073) 
  public static final SubLObject transformation_rule_dependent_lits(SubLObject rule, SubLObject asent_from_rule, SubLObject asent_sense) {
    {
      SubLObject cnf = assertions_high.assertion_cnf(rule);
      if (($kw1$POS == asent_sense)) {
        return Values.values(clauses.neg_lits(cnf), Sequences.remove(asent_from_rule, clauses.pos_lits(cnf), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
      } else {
        return Values.values(Sequences.remove(asent_from_rule, clauses.neg_lits(cnf), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), clauses.pos_lits(cnf));
      }
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 4425) 
  public static final SubLObject removal_add_node(SubLObject support, SubLObject v_bindings, SubLObject more_supports) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    if ((more_supports == UNPROVIDED)) {
      more_supports = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == v_bindings)) {
        v_bindings = bindings.unification_success_token();
      }
      if ((NIL == $removal_add_node_method$.getDynamicValue(thread))) {
        Errors.error($str0$The_legacy_harness_is_no_longer_s);
      }
      return removal_add_node_funcall($removal_add_node_method$.getDynamicValue(thread), v_bindings, cons(support, more_supports));
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 4887) 
  public static final SubLObject removal_add_node_funcall(SubLObject function, SubLObject v_bindings, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = function;
        if (pcase_var.eql($sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE)) {
          return inference_worker_removal.handle_removal_add_node_for_output_generate(v_bindings, supports);
        } else if (pcase_var.eql($sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS)) {
          return inference_worker_removal.handle_removal_add_node_for_expand_results(v_bindings, supports);
        } else if (pcase_var.eql($sym4$REMOVAL_ASK_ADD_NODE)) {
          return removal_ask_add_node(v_bindings, supports);
        } else {
          return Functions.funcall($removal_add_node_method$.getDynamicValue(thread), v_bindings, supports);
        }
      }
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 5386) 
  private static SubLSymbol $removal_ask_query_properties$ = null;

  @SubL(source = "cycl/backward.lisp", position = 5620) 
  public static final SubLObject removal_ask_query_property_p(SubLObject object) {
    return list_utilities.member_eqP(object, $removal_ask_query_properties$.getGlobalValue());
  }

  /** Perform an exhaustive removal-only ask of HL-level ASENT in MT.
   If MT is NIL, *default-ask-mt* is used.
   TRUTH indicates the truth of asent, either :TRUE or :FALSE.
   @return 0 ; a list of tuples of the form : (bindings hl-supports)
   @return 1 ; query-halt-reason-p
   @return 2 ; metrics values, if :metrics specified in QUERY-PROPERTIES */
  @SubL(source = "cycl/backward.lisp", position = 5795) 
  public static final SubLObject removal_ask(SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw7$TRUE;
    }
    if ((query_properties == UNPROVIDED)) {
      query_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(asent, $sym8$CYCL_ATOMIC_SENTENCE_P);
      {
        SubLObject plist_var = query_properties;
        checkType(plist_var, $sym9$PROPERTY_LIST_P);
        {
          SubLObject remainder = NIL;
          for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
            {
              SubLObject property = remainder.first();
              SubLObject value = conses_high.cadr(remainder);
              checkType(property, $sym10$REMOVAL_ASK_QUERY_PROPERTY_P);
            }
          }
        }
      }
      if ((NIL == mt)) {
        mt = mt_vars.$default_ask_mt$.getGlobalValue();
      }
      {
        SubLObject answers = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metrics = NIL;
        {
          SubLObject _prev_bind_0 = $removal_add_node_method$.currentBinding(thread);
          SubLObject _prev_bind_1 = inference_macros.$controlling_inferences$.currentBinding(thread);
          SubLObject _prev_bind_2 = inference_macros.$controlling_strategy$.currentBinding(thread);
          try {
            $removal_add_node_method$.bind($sym4$REMOVAL_ASK_ADD_NODE, thread);
            inference_macros.$controlling_inferences$.bind(cons(NIL, inference_macros.$controlling_inferences$.getDynamicValue(thread)), thread);
            inference_macros.$controlling_strategy$.bind(NIL, thread);
            {
              SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
              {
                SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  thread.resetMultipleValues();
                  {
                    SubLObject answers_4 = removal_ask_int(asent, truth, query_properties);
                    SubLObject halt_reason_5 = thread.secondMultipleValue();
                    SubLObject metrics_6 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    answers = answers_4;
                    halt_reason = halt_reason_5;
                    metrics = metrics_6;
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_3, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_2, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                }
              }
            }
          } finally {
            inference_macros.$controlling_strategy$.rebind(_prev_bind_2, thread);
            inference_macros.$controlling_inferences$.rebind(_prev_bind_1, thread);
            $removal_add_node_method$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(answers, halt_reason, metrics);
      }
    }
  }

  /** An #'equal dictionary-contents mapping bindings to a list of justifications of those bindings. */
  @SubL(source = "cycl/backward.lisp", position = 11941) 
  private static SubLSymbol $removal_ask_answers$ = null;

  @SubL(source = "cycl/backward.lisp", position = 12112) 
  private static SubLSymbol $removal_ask_max_number$ = null;

  @SubL(source = "cycl/backward.lisp", position = 12173) 
  private static SubLSymbol $removal_ask_disallows_indeterminate_termsP$ = null;

  @SubL(source = "cycl/backward.lisp", position = 12255) 
  private static SubLSymbol $removal_ask_first_answer_elapsed_internal_real_time$ = null;

  @SubL(source = "cycl/backward.lisp", position = 12345) 
  private static SubLSymbol $removal_ask_last_answer_elapsed_internal_real_time$ = null;

  @SubL(source = "cycl/backward.lisp", position = 12434) 
  private static SubLSymbol $removal_ask_start_internal_real_time$ = null;

  @SubL(source = "cycl/backward.lisp", position = 12612) 
  public static final SubLObject removal_ask_add_node(SubLObject v_bindings, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $removal_ask_disallows_indeterminate_termsP$.getDynamicValue(thread))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35566")))) {
        return NIL;
      }
      if ((NIL != dictionary_contents.dictionary_contents_empty_p($removal_ask_answers$.getDynamicValue(thread)))) {
        if ((NIL != $removal_ask_start_internal_real_time$.getDynamicValue(thread))) {
          $removal_ask_first_answer_elapsed_internal_real_time$.setDynamicValue(numeric_date_utilities.elapsed_internal_real_time($removal_ask_start_internal_real_time$.getDynamicValue(thread), UNPROVIDED), thread);
        }
      }
      if ((NIL != $removal_ask_start_internal_real_time$.getDynamicValue(thread))) {
        $removal_ask_last_answer_elapsed_internal_real_time$.setDynamicValue(numeric_date_utilities.elapsed_internal_real_time($removal_ask_start_internal_real_time$.getDynamicValue(thread), UNPROVIDED), thread);
      }
      $removal_ask_answers$.setDynamicValue(dictionary_utilities.dictionary_contents_push($removal_ask_answers$.getDynamicValue(thread), conses_high.copy_tree(v_bindings), conses_high.copy_tree(supports), Symbols.symbol_function(EQUAL)), thread);
      if (((NIL != $removal_ask_max_number$.getDynamicValue(thread))
           && Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31658").numGE($removal_ask_max_number$.getDynamicValue(thread)))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31657");
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 13650) 
  public static final SubLObject removal_ask_int(SubLObject asent, SubLObject truth, SubLObject query_properties) {
    if ((query_properties == UNPROVIDED)) {
      query_properties = NIL;
    }
    {
      SubLObject plist_var = query_properties;
      checkType(plist_var, $sym9$PROPERTY_LIST_P);
      {
        SubLObject remainder = NIL;
        for (remainder = plist_var; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
          {
            SubLObject property = remainder.first();
            SubLObject value = conses_high.cadr(remainder);
            checkType(property, $sym10$REMOVAL_ASK_QUERY_PROPERTY_P);
          }
        }
      }
    }
    {
      SubLObject sense = enumeration_types.truth_sense(truth);
      SubLObject allowed_modules_spec = conses_high.getf(query_properties, $kw15$ALLOWED_MODULES, $kw16$ALL);
      SubLObject allowed_tactic_specs = removal_ask_tactic_specs(asent, sense, allowed_modules_spec);
      if ((NIL != allowed_tactic_specs)) {
        return removal_ask_expand(asent, sense, allowed_tactic_specs, query_properties);
      } else {
        return Values.values(NIL, $kw17$EXHAUST_TOTAL, NIL);
      }
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 14154) 
  public static final SubLObject removal_ask_tactic_specs(SubLObject asent, SubLObject sense, SubLObject allowed_modules_spec) {
    return inference_worker_removal.literal_removal_options(asent, sense, allowed_modules_spec);
  }

  @SubL(source = "cycl/backward.lisp", position = 14299) 
  public static final SubLObject removal_ask_expand(SubLObject asent, SubLObject sense, SubLObject tactic_specs, SubLObject query_properties) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answers = NIL;
        SubLObject halt_reason = NIL;
        SubLObject metric_values = NIL;
        tactic_specs = Sort.sort(conses_high.copy_list(tactic_specs), Symbols.symbol_function($sym18$_), Symbols.symbol_function($sym12$SECOND));
        {
          SubLObject metrics = conses_high.getf(query_properties, $kw19$METRICS, NIL);
          {
            SubLObject _prev_bind_0 = $removal_ask_answers$.currentBinding(thread);
            SubLObject _prev_bind_1 = $removal_ask_max_number$.currentBinding(thread);
            SubLObject _prev_bind_2 = $removal_ask_disallows_indeterminate_termsP$.currentBinding(thread);
            SubLObject _prev_bind_3 = $removal_ask_start_internal_real_time$.currentBinding(thread);
            SubLObject _prev_bind_4 = $removal_ask_first_answer_elapsed_internal_real_time$.currentBinding(thread);
            SubLObject _prev_bind_5 = $removal_ask_last_answer_elapsed_internal_real_time$.currentBinding(thread);
            try {
              $removal_ask_answers$.bind(dictionary_contents.new_dictionary_contents(ZERO_INTEGER, Symbols.symbol_function(EQUAL)), thread);
              $removal_ask_max_number$.bind(conses_high.getf(query_properties, $kw14$MAX_NUMBER, NIL), thread);
              $removal_ask_disallows_indeterminate_termsP$.bind(makeBoolean((NIL == conses_high.getf(query_properties, $kw20$ALLOW_INDETERMINATE_RESULTS_, T))), thread);
              $removal_ask_start_internal_real_time$.bind(((NIL != metrics) ? ((SubLObject) Time.get_internal_real_time()) : NIL), thread);
              $removal_ask_first_answer_elapsed_internal_real_time$.bind(NIL, thread);
              $removal_ask_last_answer_elapsed_internal_real_time$.bind(NIL, thread);
              if ((NIL == halt_reason)) {
                {
                  SubLObject csome_list_var = tactic_specs;
                  SubLObject tactic_spec = NIL;
                  for (tactic_spec = csome_list_var.first(); (!(((NIL != halt_reason)
                        || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), tactic_spec = csome_list_var.first()) {
                    try {
                      {
                        SubLObject datum = tactic_spec;
                        SubLObject current = datum;
                        SubLObject hl_module = NIL;
                        SubLObject productivity = NIL;
                        SubLObject completeness = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
                        hl_module = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
                        productivity = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
                        completeness = current.first();
                        current = current.rest();
                        if ((NIL == current)) {
                          {
                            SubLObject cost = inference_datastructures_enumerated_types.cost_for_productivity(productivity);
                            {
                              SubLObject _prev_bind_0_7 = $inference_expand_hl_module$.currentBinding(thread);
                              try {
                                $inference_expand_hl_module$.bind(hl_module, thread);
                                {
                                  SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                                  SubLObject expand_method = ((NIL != pattern) ? ((SubLObject) NIL) : inference_modules.hl_module_expand_func(hl_module));
                                  if ((NIL == inference_hl_module_cost_too_expensive(hl_module, cost))) {
                                    {
                                      SubLObject _prev_bind_0_8 = $inference_expand_sense$.currentBinding(thread);
                                      try {
                                        $inference_expand_sense$.bind(sense, thread);
                                        if ((NIL != pattern)) {
                                          formula_pattern_match.pattern_transform_formula(pattern, asent, UNPROVIDED);
                                        } else {
                                          Functions.funcall(expand_method, asent, sense);
                                        }
                                      } finally {
                                        $inference_expand_sense$.rebind(_prev_bind_0_8, thread);
                                      }
                                    }
                                  }
                                }
                              } finally {
                                $inference_expand_hl_module$.rebind(_prev_bind_0_7, thread);
                              }
                            }
                          }
                        } else {
                          cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
                        }
                      }
                    } catch (Throwable ccatch_env_var) {
                      halt_reason = Errors.handleThrowable(ccatch_env_var, $kw21$REMOVAL_ASK_DONE);
                    }
                  }
                }
              }
              {
                SubLObject allow_abnormality_checkingP = inference_datastructures_enumerated_types.inference_properties_allow_abnormality_checkingP(query_properties);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state($removal_ask_answers$.getDynamicValue(thread));
                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                  thread.resetMultipleValues();
                  {
                    SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                      SubLObject cdolist_list_var = justifications;
                      SubLObject justification = NIL;
                      for (justification = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), justification = cdolist_list_var.first()) {
                        if ((!(((NIL != allow_abnormality_checkingP)
                               && (NIL != abnormal.abnormality_except_support_enabledP())
                               && (NIL != inference_worker_transformation.supports_contain_excepted_assertionP(justification)))))) {
                          answers = cons(list(v_bindings, justification), answers);
                        }
                      }
                    }
                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                  }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
              }
              if ((NIL == halt_reason)) {
                halt_reason = $kw17$EXHAUST_TOTAL;
              }
              if ((NIL != metrics)) {
                metric_values = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31661");
              }
            } finally {
              $removal_ask_last_answer_elapsed_internal_real_time$.rebind(_prev_bind_5, thread);
              $removal_ask_first_answer_elapsed_internal_real_time$.rebind(_prev_bind_4, thread);
              $removal_ask_start_internal_real_time$.rebind(_prev_bind_3, thread);
              $removal_ask_disallows_indeterminate_termsP$.rebind(_prev_bind_2, thread);
              $removal_ask_max_number$.rebind(_prev_bind_1, thread);
              $removal_ask_answers$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Values.values(Sequences.nreverse(answers), halt_reason, metric_values);
      }
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 18899) 
  public static final SubLObject inference_hl_module_cost_too_expensive(SubLObject hl_module, SubLObject cost) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = inference_modules.hl_module_type(hl_module);
        if (pcase_var.eql($kw33$REMOVAL)) {
          return makeBoolean(((NIL != control_vars.$removal_cost_cutoff$.getDynamicValue(thread))
                 && cost.numG(control_vars.$removal_cost_cutoff$.getDynamicValue(thread))));
        } else {
          return NIL;
        }
      }
    }
  }

  /** Do we enable the transformation-layer semantic pruning heuristics? */
  @SubL(source = "cycl/backward.lisp", position = 21150) 
  public static SubLSymbol $transformation_semantic_pruning_enabled$ = null;

  @SubL(source = "cycl/backward.lisp", position = 21799) 
  public static final SubLObject inference_semantically_valid_dnf(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != semantically_valid_term_of_unit_asents(dnf, mt))
           && (NIL != semantically_valid_closed_asentsP(dnf, mt))));
  }

  @SubL(source = "cycl/backward.lisp", position = 23505) 
  private static SubLSymbol $forward_inference_pruning_mode$ = null;

  @SubL(source = "cycl/backward.lisp", position = 23564) 
  public static final SubLObject semantically_valid_closed_asentsP(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = $forward_inference_pruning_mode$.getDynamicValue(thread);
        if (pcase_var.eql($kw43$NONE)) {
          return T;
        } else if (pcase_var.eql($kw42$LEGACY)) {
          return makeBoolean(((NIL != semantically_valid_asserted_sentence_asents(dnf, mt))
                 && (NIL != semantically_valid_complete_extent_asserted_asents(dnf, mt))
                 && (NIL != semantically_valid_isa_asents(dnf, mt))
                 && (NIL != semantically_valid_genls_asents(dnf, mt))));
        } else if (pcase_var.eql($kw44$TRIVIAL)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31664");
        } else if (pcase_var.eql($kw45$INFERENCE)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31665");
        } else {
          return Errors.error($str46$Unexpected_pruning_mode____S, $forward_inference_pruning_mode$.getDynamicValue(thread));
        }
      }
    }
  }

  /** temporary control parameter; @todo eliminate */
  @SubL(source = "cycl/backward.lisp", position = 24944) 
  private static SubLSymbol $forward_asserted_sentence_pruning_enabledP$ = null;

  @SubL(source = "cycl/backward.lisp", position = 25060) 
  public static final SubLObject semantically_valid_asserted_sentence_asents(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject invalidP = NIL;
        if ((NIL != $forward_asserted_sentence_pruning_enabledP$.getDynamicValue(thread))) {
          {
            SubLObject pos_lits = clauses.pos_lits(dnf);
            if ((NIL != Sequences.find($const48$assertedSentence, pos_lits, Symbols.symbol_function(EQL), Symbols.symbol_function($sym49$ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED))) {
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    if ((NIL == invalidP)) {
                      {
                        SubLObject csome_list_var = pos_lits;
                        SubLObject asent = NIL;
                        for (asent = csome_list_var.first(); (!(((NIL != invalidP)
                              || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), asent = csome_list_var.first()) {
                          if (($const48$assertedSentence == cycl_utilities.atomic_sentence_predicate(asent))) {
                            if ((NIL != semantically_invalid_asserted_sentence_asent(asent))) {
                              invalidP = T;
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
              }
            }
          }
        }
        return makeBoolean((NIL == invalidP));
      }
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 25849) 
  public static final SubLObject forward_complete_extent_asserted_pruning_enabledP() {
    return inference_datastructures_enumerated_types.balancing_tactician_enabledP();
  }

  @SubL(source = "cycl/backward.lisp", position = 25959) 
  public static final SubLObject semantically_valid_complete_extent_asserted_asents(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject invalidP = NIL;
        if ((NIL != forward_complete_extent_asserted_pruning_enabledP())) {
          {
            SubLObject pos_lits = clauses.pos_lits(dnf);
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if ((NIL == invalidP)) {
                  {
                    SubLObject csome_list_var = pos_lits;
                    SubLObject asent = NIL;
                    for (asent = csome_list_var.first(); (!(((NIL != invalidP)
                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), asent = csome_list_var.first()) {
                      {
                        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                        if (((NIL != forts.fort_p(pred))
                             && (NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6840")))) {
                          if ((NIL != non_asserted_asentP(asent))) {
                            invalidP = T;
                          }
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
          }
        }
        return makeBoolean((NIL == invalidP));
      }
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 26619) 
  public static final SubLObject semantically_invalid_asserted_sentence_asent(SubLObject asent) {
    {
      SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
      return non_asserted_asentP(sentence);
    }
  }

  @SubL(source = "cycl/backward.lisp", position = 26782) 
  public static final SubLObject non_asserted_asentP(SubLObject sentence) {
    if ((NIL != el_utilities.el_formula_p(sentence))) {
      if ((NIL != forward_complete_extent_asserted_pruning_enabledP())) {
        if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31656"))) {
          return T;
        }
      }
      if ((NIL != non_asserted_asent_via_gaf_lookupP(sentence))) {
        return T;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/backward.lisp", position = 27748) 
  public static final SubLObject non_asserted_asent_via_gaf_lookupP(SubLObject sentence) {
    if ((NIL != forward_complete_extent_asserted_pruning_enabledP())) {
      return Types.sublisp_null(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12703"));
    }
    if (((NIL != variables.fully_bound_p(sentence))
         && (NIL == kb_indexing.find_gaf_in_relevant_mt(sentence)))) {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/backward.lisp", position = 28044) 
  public static final SubLObject semantically_valid_isa_asents(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pos_lits = clauses.pos_lits(dnf);
      if ((NIL != Sequences.find($const50$isa, pos_lits, Symbols.symbol_function(EQL), Symbols.symbol_function($sym49$ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED))) {
        {
          SubLObject cdolist_list_var = pos_lits;
          SubLObject asent = NIL;
          for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
            if (($const50$isa == cycl_utilities.atomic_sentence_predicate(asent))) {
              {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (((NIL != forts.fort_p(arg1))
                     && (NIL != forts.fort_p(arg2)))) {
                  if ((NIL == at_defns.quiet_has_type_memoizedP(arg1, arg2, mt, UNPROVIDED))) {
                    return NIL;
                  }
                }
              }
            }
          }
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/backward.lisp", position = 28756) 
  public static final SubLObject semantically_valid_genls_asents(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pos_lits = clauses.pos_lits(dnf);
      if ((NIL != Sequences.find($const51$genls, pos_lits, Symbols.symbol_function(EQL), Symbols.symbol_function($sym49$ATOMIC_SENTENCE_PREDICATE), UNPROVIDED, UNPROVIDED))) {
        {
          SubLObject cdolist_list_var = pos_lits;
          SubLObject asent = NIL;
          for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
            if (($const51$genls == cycl_utilities.atomic_sentence_predicate(asent))) {
              {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (((NIL != forts.fort_p(arg1))
                     && (NIL != forts.fort_p(arg2)))) {
                  if ((NIL == genls.genlsP(arg1, arg2, mt, UNPROVIDED))) {
                    return NIL;
                  }
                }
              }
            }
          }
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/backward.lisp", position = 29497) 
  public static final SubLObject semantically_valid_term_of_unit_asents(SubLObject dnf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return syntactically_valid_term_of_unit_asents(dnf);
  }

  @SubL(source = "cycl/backward.lisp", position = 29744) 
  public static final SubLObject syntactically_valid_term_of_unit_asents(SubLObject dnf) {
    {
      SubLObject cdolist_list_var = clauses.pos_lits(dnf);
      SubLObject asent = NIL;
      for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
        if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const52$termOfUnit))) {
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31666"))) {
            return NIL;
          }
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/backward.lisp", position = 31251) 
  private static SubLSymbol $literal_set_sense_table$ = null;

  public static final SubLObject declare_backward_file() {
    declareFunction(myName, "inference_expand_new_children", "INFERENCE-EXPAND-NEW-CHILDREN", 0, 0, false);
    declareFunction(myName, "add_to_inference_expand_new_children", "ADD-TO-INFERENCE-EXPAND-NEW-CHILDREN", 1, 0, false);
    declareFunction(myName, "inference_expand_hl_module", "INFERENCE-EXPAND-HL-MODULE", 0, 0, false);
    declareFunction(myName, "inference_expand_sense", "INFERENCE-EXPAND-SENSE", 0, 0, false);
    declareFunction(myName, "transformation_add_node", "TRANSFORMATION-ADD-NODE", 4, 1, false);
    declareFunction(myName, "transformation_rule_dependent_lits", "TRANSFORMATION-RULE-DEPENDENT-LITS", 3, 0, false);
    declareFunction(myName, "removal_add_node", "REMOVAL-ADD-NODE", 1, 2, false);
    declareFunction(myName, "removal_add_node_funcall", "REMOVAL-ADD-NODE-FUNCALL", 3, 0, false);
    declareFunction(myName, "removal_ask_query_property_p", "REMOVAL-ASK-QUERY-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "removal_ask", "REMOVAL-ASK", 1, 3, false);
    declareFunction(myName, "el_removal_ask", "EL-REMOVAL-ASK", 1, 3, false);
    declareFunction(myName, "removal_ask_bindings", "REMOVAL-ASK-BINDINGS", 1, 3, false);
    declareFunction(myName, "el_removal_ask_bindings", "EL-REMOVAL-ASK-BINDINGS", 1, 3, false);
    declareFunction(myName, "removal_ask_justifications", "REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false);
    declareFunction(myName, "el_removal_ask_justifications", "EL-REMOVAL-ASK-JUSTIFICATIONS", 1, 3, false);
    declareFunction(myName, "removal_ask_template", "REMOVAL-ASK-TEMPLATE", 2, 3, false);
    declareFunction(myName, "el_removal_ask_template", "EL-REMOVAL-ASK-TEMPLATE", 2, 3, false);
    declareFunction(myName, "el_removal_ask_variable", "EL-REMOVAL-ASK-VARIABLE", 2, 3, false);
    declareFunction(myName, "removal_ask_variable", "REMOVAL-ASK-VARIABLE", 2, 3, false);
    declareFunction(myName, "removal_ask_hl_variable", "REMOVAL-ASK-HL-VARIABLE", 2, 3, false);
    declareFunction(myName, "removal_ask_answer_count", "REMOVAL-ASK-ANSWER-COUNT", 0, 0, false);
    declareFunction(myName, "removal_ask_add_node", "REMOVAL-ASK-ADD-NODE", 2, 0, false);
    declareFunction(myName, "removal_ask_int", "REMOVAL-ASK-INT", 2, 1, false);
    declareFunction(myName, "removal_ask_tactic_specs", "REMOVAL-ASK-TACTIC-SPECS", 3, 0, false);
    declareFunction(myName, "removal_ask_expand", "REMOVAL-ASK-EXPAND", 4, 0, false);
    declareFunction(myName, "removal_ask_compute_metric_values", "REMOVAL-ASK-COMPUTE-METRIC-VALUES", 1, 0, false);
    declareFunction(myName, "note_removal_ask_done", "NOTE-REMOVAL-ASK-DONE", 1, 0, false);
    declareFunction(myName, "inference_hl_module_cost_too_expensive", "INFERENCE-HL-MODULE-COST-TOO-EXPENSIVE", 2, 0, false);
    declareFunction(myName, "closed_conjunctive_cycl_sentence_p", "CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_literal_or_conjunction_of_cycl_literals_p", "CYCL-LITERAL-OR-CONJUNCTION-OF-CYCL-LITERALS-P", 1, 0, false);
    declareFunction(myName, "closed_conjunctive_removal_ask", "CLOSED-CONJUNCTIVE-REMOVAL-ASK", 1, 2, false);
    declareFunction(myName, "removal_ask_literal", "REMOVAL-ASK-LITERAL", 3, 0, false);
    declareFunction(myName, "inference_semantically_valid_dnf", "INFERENCE-SEMANTICALLY-VALID-DNF", 1, 1, false);
    declareFunction(myName, "semantically_valid_closed_asentsP", "SEMANTICALLY-VALID-CLOSED-ASENTS?", 1, 1, false);
    declareFunction(myName, "semantically_valid_closed_asentsP_int", "SEMANTICALLY-VALID-CLOSED-ASENTS?-INT", 3, 0, false);
    declareFunction(myName, "semantically_valid_asserted_sentence_asents", "SEMANTICALLY-VALID-ASSERTED-SENTENCE-ASENTS", 1, 1, false);
    declareFunction(myName, "forward_complete_extent_asserted_pruning_enabledP", "FORWARD-COMPLETE-EXTENT-ASSERTED-PRUNING-ENABLED?", 0, 0, false);
    declareFunction(myName, "semantically_valid_complete_extent_asserted_asents", "SEMANTICALLY-VALID-COMPLETE-EXTENT-ASSERTED-ASENTS", 1, 1, false);
    declareFunction(myName, "semantically_invalid_asserted_sentence_asent", "SEMANTICALLY-INVALID-ASSERTED-SENTENCE-ASENT", 1, 0, false);
    declareFunction(myName, "non_asserted_asentP", "NON-ASSERTED-ASENT?", 1, 0, false);
    declareFunction(myName, "non_asserted_asent_via_somewhere_cacheP", "NON-ASSERTED-ASENT-VIA-SOMEWHERE-CACHE?", 1, 0, false);
    declareFunction(myName, "non_asserted_asent_via_gaf_lookupP", "NON-ASSERTED-ASENT-VIA-GAF-LOOKUP?", 1, 0, false);
    declareFunction(myName, "semantically_valid_isa_asents", "SEMANTICALLY-VALID-ISA-ASENTS", 1, 1, false);
    declareFunction(myName, "semantically_valid_genls_asents", "SEMANTICALLY-VALID-GENLS-ASENTS", 1, 1, false);
    declareFunction(myName, "semantically_valid_term_of_unit_asents", "SEMANTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 1, false);
    declareFunction(myName, "syntactically_valid_term_of_unit_asents", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENTS", 1, 0, false);
    declareFunction(myName, "valid_term_of_unit_arg1", "VALID-TERM-OF-UNIT-ARG1", 1, 0, false);
    declareFunction(myName, "valid_term_of_unit_arg2", "VALID-TERM-OF-UNIT-ARG2", 1, 0, false);
    declareFunction(myName, "valid_term_of_unit_args", "VALID-TERM-OF-UNIT-ARGS", 2, 0, false);
    declareFunction(myName, "valid_term_of_unit_inter_args", "VALID-TERM-OF-UNIT-INTER-ARGS", 2, 0, false);
    declareFunction(myName, "syntactically_valid_term_of_unit_asent", "SYNTACTICALLY-VALID-TERM-OF-UNIT-ASENT", 1, 0, false);
    declareFunction(myName, "literal_set_sense", "LITERAL-SET-SENSE", 1, 0, false);
    declareFunction(myName, "literal_set_without", "LITERAL-SET-WITHOUT", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_backward_file() {
    $removal_add_node_method$ = defparameter("*REMOVAL-ADD-NODE-METHOD*", NIL);
    $transformation_add_node_method$ = defparameter("*TRANSFORMATION-ADD-NODE-METHOD*", NIL);
    $transformation_early_removal_threshold$ = defparameter("*TRANSFORMATION-EARLY-REMOVAL-THRESHOLD*", EIGHT_INTEGER);
    $inference_expand_new_children$ = defparameter("*INFERENCE-EXPAND-NEW-CHILDREN*", NIL);
    $inference_expand_hl_module$ = defparameter("*INFERENCE-EXPAND-HL-MODULE*", NIL);
    $inference_expand_sense$ = defparameter("*INFERENCE-EXPAND-SENSE*", NIL);
    $removal_ask_query_properties$ = deflexical("*REMOVAL-ASK-QUERY-PROPERTIES*", $list5);
    $removal_ask_answers$ = defparameter("*REMOVAL-ASK-ANSWERS*", NIL);
    $removal_ask_max_number$ = defparameter("*REMOVAL-ASK-MAX-NUMBER*", NIL);
    $removal_ask_disallows_indeterminate_termsP$ = defparameter("*REMOVAL-ASK-DISALLOWS-INDETERMINATE-TERMS?*", NIL);
    $removal_ask_first_answer_elapsed_internal_real_time$ = defparameter("*REMOVAL-ASK-FIRST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", NIL);
    $removal_ask_last_answer_elapsed_internal_real_time$ = defparameter("*REMOVAL-ASK-LAST-ANSWER-ELAPSED-INTERNAL-REAL-TIME*", NIL);
    $removal_ask_start_internal_real_time$ = defparameter("*REMOVAL-ASK-START-INTERNAL-REAL-TIME*", NIL);
    $transformation_semantic_pruning_enabled$ = defparameter("*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*", NIL);
    $forward_inference_pruning_mode$ = defvar("*FORWARD-INFERENCE-PRUNING-MODE*", $kw42$LEGACY);
    $forward_asserted_sentence_pruning_enabledP$ = defvar("*FORWARD-ASSERTED-SENTENCE-PRUNING-ENABLED?*", T);
    $literal_set_sense_table$ = deflexical("*LITERAL-SET-SENSE-TABLE*", $list53);
    return NIL;
  }

  public static final SubLObject setup_backward_file() {
    // CVS_ID("Id: backward.lisp 128499 2009-08-06 15:49:24Z pace ");
    access_macros.register_external_symbol($sym6$REMOVAL_ASK);
    utilities_macros.declare_control_parameter_internal($sym38$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_, $str39$Semantic_pruning_of_results_of_ba, $str40$This_controls_whether_or_not_the_, $list41);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$The_legacy_harness_is_no_longer_s = makeString("The legacy harness is no longer supported.");
  public static final SubLSymbol $kw1$POS = makeKeyword("POS");
  public static final SubLSymbol $sym2$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");
  public static final SubLSymbol $sym3$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");
  public static final SubLSymbol $sym4$REMOVAL_ASK_ADD_NODE = makeSymbol("REMOVAL-ASK-ADD-NODE");
  public static final SubLList $list5 = list(makeKeyword("MAX-NUMBER"), makeKeyword("ALLOWED-MODULES"), makeKeyword("METRICS"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"));
  public static final SubLSymbol $sym6$REMOVAL_ASK = makeSymbol("REMOVAL-ASK");
  public static final SubLSymbol $kw7$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym8$CYCL_ATOMIC_SENTENCE_P = makeSymbol("CYCL-ATOMIC-SENTENCE-P");
  public static final SubLSymbol $sym9$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym10$REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol("REMOVAL-ASK-QUERY-PROPERTY-P");
  public static final SubLSymbol $sym11$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym12$SECOND = makeSymbol("SECOND");
  public static final SubLList $list13 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
  public static final SubLSymbol $kw14$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw15$ALLOWED_MODULES = makeKeyword("ALLOWED-MODULES");
  public static final SubLSymbol $kw16$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw17$EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
  public static final SubLSymbol $sym18$_ = makeSymbol("<");
  public static final SubLSymbol $kw19$METRICS = makeKeyword("METRICS");
  public static final SubLSymbol $kw20$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw21$REMOVAL_ASK_DONE = makeKeyword("REMOVAL-ASK-DONE");
  public static final SubLList $list22 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));
  public static final SubLSymbol $kw23$ANSWER_COUNT = makeKeyword("ANSWER-COUNT");
  public static final SubLSymbol $kw24$TIME_TO_FIRST_ANSWER = makeKeyword("TIME-TO-FIRST-ANSWER");
  public static final SubLSymbol $kw25$TIME_TO_LAST_ANSWER = makeKeyword("TIME-TO-LAST-ANSWER");
  public static final SubLSymbol $kw26$TOTAL_TIME = makeKeyword("TOTAL-TIME");
  public static final SubLSymbol $kw27$TIME_PER_ANSWER = makeKeyword("TIME-PER-ANSWER");
  public static final SubLSymbol $kw28$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
  public static final SubLSymbol $kw29$COMPLETE_USER_TIME = makeKeyword("COMPLETE-USER-TIME");
  public static final SubLSymbol $kw30$COMPLETE_SYSTEM_TIME = makeKeyword("COMPLETE-SYSTEM-TIME");
  public static final SubLSymbol $kw31$COMPLETE_TOTAL_TIME = makeKeyword("COMPLETE-TOTAL-TIME");
  public static final SubLString $str32$removal_ask_cannot_handle_metric_ = makeString("removal-ask cannot handle metric ~s, using NIL instead");
  public static final SubLSymbol $kw33$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw34$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym35$CLOSED_CONJUNCTIVE_CYCL_SENTENCE_P = makeSymbol("CLOSED-CONJUNCTIVE-CYCL-SENTENCE-P");
  public static final SubLSymbol $sym36$CYCL_LITERAL_P = makeSymbol("CYCL-LITERAL-P");
  public static final SubLSymbol $kw37$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $sym38$_TRANSFORMATION_SEMANTIC_PRUNING_ENABLED_ = makeSymbol("*TRANSFORMATION-SEMANTIC-PRUNING-ENABLED*");
  public static final SubLString $str39$Semantic_pruning_of_results_of_ba = makeString("Semantic pruning of results of backchaining");
  public static final SubLString $str40$This_controls_whether_or_not_the_ = makeString("This controls whether or not the intermediate results of backchaining\nare examined to see if they are provably unsatisfiable.  If so, these\nresults are pruned from the search.  This test takes time, but usually\nprovides substantial pruning of the search tree when backchaining.");
  public static final SubLList $list41 = list(list(makeKeyword("VALUE"), T, makeString("Yes")), list(makeKeyword("VALUE"), NIL, makeString("No")));
  public static final SubLSymbol $kw42$LEGACY = makeKeyword("LEGACY");
  public static final SubLSymbol $kw43$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw44$TRIVIAL = makeKeyword("TRIVIAL");
  public static final SubLSymbol $kw45$INFERENCE = makeKeyword("INFERENCE");
  public static final SubLString $str46$Unexpected_pruning_mode____S = makeString("Unexpected pruning mode : ~S");
  public static final SubLList $list47 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);
  public static final SubLObject $const48$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));
  public static final SubLSymbol $sym49$ATOMIC_SENTENCE_PREDICATE = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
  public static final SubLObject $const50$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const51$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const52$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list53 = list(cons(makeKeyword("NO-POS"), makeKeyword("POS")), cons(makeKeyword("NO-NEG"), makeKeyword("NEG")), cons(makeKeyword("YES-POS"), makeKeyword("POS")), cons(makeKeyword("YES-NEG"), makeKeyword("NEG")));

  //// Initializers

  public void declareFunctions() {
    declare_backward_file();
  }

  public void initializeVariables() {
    init_backward_file();
  }

  public void runTopLevelForms() {
    setup_backward_file();
  }

}
