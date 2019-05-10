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
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_interface;
import com.cyc.cycjava.cycl.assertions_low;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_strucs;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.keyhash;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;

public  final class assertion_utilities extends SubLTranslatedFile {

  //// Constructor

  private assertion_utilities() {}
  public static final SubLFile me = new assertion_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.assertion_utilities";

  //// Definitions

  @SubL(source = "cycl/assertion-utilities.lisp", position = 3758) 
  public static final SubLObject true_assertionP(SubLObject assertion) {
    return makeBoolean(((NIL != assertion_handles.assertion_p(assertion))
           && (NIL != assertions_high.assertion_has_truthP(assertion, $kw34$TRUE))));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 4658) 
  public static final SubLObject assertion_matches_typeP(SubLObject assertion, SubLObject type_spec) {
    return makeBoolean(((NIL == type_spec)
          || (NIL != assertions_high.assertion_has_typeP(assertion, type_spec))));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 4799) 
  public static final SubLObject assertion_matches_truthP(SubLObject assertion, SubLObject truth_spec) {
    return makeBoolean(((NIL == truth_spec)
          || (NIL != assertions_high.assertion_has_truth(assertion, truth_spec))));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 4944) 
  public static final SubLObject assertion_matches_directionP(SubLObject assertion, SubLObject direction_spec) {
    return makeBoolean(((NIL == direction_spec)
          || (NIL != assertions_high.assertion_has_direction(assertion, direction_spec))));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 5328) 
  public static final SubLObject assertion_matches_type_truth_and_directionP(SubLObject assertion, SubLObject type_spec, SubLObject truth_spec, SubLObject direction_spec) {
    return makeBoolean(((NIL != assertion_matches_typeP(assertion, type_spec))
           && (NIL != assertion_matches_truthP(assertion, truth_spec))
           && (NIL != assertion_matches_directionP(assertion, direction_spec))));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 5614) 
  public static final SubLObject gaf_has_term_in_argnumP(SubLObject assertion, SubLObject v_term, SubLObject argnum) {
    {
      SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
      return Equality.equal(v_term, arg);
    }
  }

  /** @return booleanp; whether ASSERTION has TERM as one of its top-level arguments. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 5750) 
  public static final SubLObject gaf_has_term_in_some_argnumP(SubLObject assertion, SubLObject v_term) {
    return el_utilities.term_is_one_of_argsP(v_term, assertions_high.gaf_formula(assertion));
  }

  /** @return boolean; t iff ASSERTION is a gaf with PRED as its arg0.
   Assumes equality can be tested with #'eq. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 5957) 
  public static final SubLObject gaf_assertion_with_pred_p(SubLObject assertion, SubLObject pred) {
    return makeBoolean(((NIL != assertions_high.gaf_assertionP(assertion))
           && (pred == assertions_high.gaf_predicate(assertion))));
  }

  /** @return boolean; t iff GAF-ASSERTION has PRED as its arg0.
   Assumes that GAF-ASSERTION is a gaf and that equality can be tested with #'eq. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 6331) 
  public static final SubLObject gaf_assertion_has_pred_p(SubLObject gaf_assertion, SubLObject pred) {
    return Equality.eq(pred, assertions_high.gaf_predicate(gaf_assertion));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 8964) 
  public static final SubLObject excepted_assertionP(SubLObject assertion) {
    return excepted_assertionP_int(assertion, UNPROVIDED);
  }

  /** Check whether ASSERTION is excepted in the current mt context. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 9057) 
  public static final SubLObject excepted_assertionP_int(SubLObject assertion, SubLObject checked_assertions) {
    if ((checked_assertions == UNPROVIDED)) {
      checked_assertions = NIL;
    }
    checkType(assertion, $sym27$ASSERTION_P);
    if ((NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
      return NIL;
    }
    if ((NIL != list_utilities.member_eqP(assertion, checked_assertions))) {
      return NIL;
    }
    checked_assertions = cons(assertion, checked_assertions);
    {
      SubLObject excepted_assertionP = NIL;
      SubLObject mt = assertions_high.assertion_mt(assertion);
      if (((NIL != forts.fort_p(mt))
           && (NIL != somewhere_cache.some_pred_assertion_somewhereP($const41$exceptMt, mt, ONE_INTEGER, UNPROVIDED)))) {
        {
          SubLObject exceptions = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30025");
          if ((NIL == excepted_assertionP)) {
            {
              SubLObject csome_list_var = exceptions;
              SubLObject exception = NIL;
              for (exception = csome_list_var.first(); (!(((NIL != excepted_assertionP)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), exception = csome_list_var.first()) {
                if ((NIL == excepted_assertionP_int(exception, checked_assertions))) {
                  excepted_assertionP = T;
                }
              }
            }
          }
        }
      }
      if ((NIL == excepted_assertionP)) {
        if ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const42$except, assertion, ONE_INTEGER, UNPROVIDED))) {
          {
            SubLObject exceptions = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30026");
            if ((NIL == excepted_assertionP)) {
              {
                SubLObject csome_list_var = exceptions;
                SubLObject exception = NIL;
                for (exception = csome_list_var.first(); (!(((NIL != excepted_assertionP)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), exception = csome_list_var.first()) {
                  if ((NIL == excepted_assertionP_int(exception, checked_assertions))) {
                    excepted_assertionP = T;
                  }
                }
              }
            }
          }
        }
      }
      if ((NIL == excepted_assertionP)) {
        {
          SubLObject non_excepted_support_foundP = NIL;
          SubLObject rest = NIL;
          for (rest = assertions_high.assertion_arguments(assertion); (!(((NIL != non_excepted_support_foundP)
                || (NIL == rest)))); rest = rest.rest()) {
            {
              SubLObject argument = rest.first();
              if ((NIL != arguments.asserted_argument_p(argument))) {
                non_excepted_support_foundP = T;
              } else {
                {
                  SubLObject excepted_support_foundP = NIL;
                  SubLObject rest_4 = NIL;
                  for (rest_4 = deductions_high.deduction_supports(argument); (!(((NIL != excepted_support_foundP)
                        || (NIL == rest_4)))); rest_4 = rest_4.rest()) {
                    {
                      SubLObject support = rest_4.first();
                      if (((NIL != assertion_handles.assertion_p(support))
                           && (NIL != excepted_assertionP_int(support, checked_assertions)))) {
                        excepted_support_foundP = T;
                      }
                    }
                  }
                  if ((NIL == excepted_support_foundP)) {
                    non_excepted_support_foundP = T;
                  }
                }
              }
            }
          }
          excepted_assertionP = makeBoolean((NIL == non_excepted_support_foundP));
        }
      }
      return excepted_assertionP;
    }
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 11078) 
  public static final SubLObject excepted_assertion_in_mtP(SubLObject assertion, SubLObject mt) {
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
            result = excepted_assertionP(assertion);
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

  @SubL(source = "cycl/assertion-utilities.lisp", position = 11261) 
  public static final SubLObject assertion_matches_mtP(SubLObject assertion) {
    return mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion));
  }

  /** @return booleanp			; t iff ASSERTION has at least one argument for it,
  either true or false. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 11364) 
  public static final SubLObject assertion_has_argumentsP(SubLObject assertion) {
    return list_utilities.sublisp_boolean(assertions_high.assertion_arguments(assertion));
  }

  /** If we're searching for this many terms or more, it's more efficient to construct a set. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 12745) 
  private static SubLSymbol $assertion_mentions_any_of_terms_set_watermark$ = null;

  @SubL(source = "cycl/assertion-utilities.lisp", position = 13600) 
  private static SubLSymbol $assertion_mentions_any_of_terms_set_lambda$ = null;

  @SubL(source = "cycl/assertion-utilities.lisp", position = 14323) 
  private static SubLSymbol $assertion_mentions_any_of_terms_dict_lambda$ = null;

  @SubL(source = "cycl/assertion-utilities.lisp", position = 22817) 
  public static final SubLObject rule_literal_count(SubLObject rule) {
    {
      SubLObject cnf = assertions_high.assertion_cnf(rule);
      return clause_utilities.clause_literal_count(cnf);
    }
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 23506) 
  private static SubLSymbol $newest_constant_of_assertions$ = null;

  /** Return T iff ASSERTION has some meta-assertions. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 25317) 
  public static final SubLObject assertion_has_meta_assertionsP(SubLObject assertion) {
    checkType(assertion, $sym27$ASSERTION_P);
    return list_utilities.sublisp_boolean(assertions_low.assertion_index(assertion));
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 30842) 
  private static SubLSymbol $cached_self_looping_rule_assertionP_caching_state$ = null;

  @SubL(source = "cycl/assertion-utilities.lisp", position = 31095) 
  public static final SubLObject self_expanding_ruleP(SubLObject rule) {
    if ((NIL != assertions_high.rule_assertionP(rule))) {
      return cached_self_expanding_rule_assertionP(rule);
    }
    return NIL;
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 31252) 
  private static SubLSymbol $cached_self_expanding_rule_assertionP_caching_state$ = null;

  @SubL(source = "cycl/assertion-utilities.lisp", position = 31252) 
  public static final SubLObject cached_self_expanding_rule_assertionP_internal(SubLObject rule) {
    {
      SubLObject cnf = assertions_high.assertion_cnf(rule);
      SubLObject witness = NIL;
      SubLObject rest = NIL;
      for (rest = clauses.pos_lits(cnf); (!(((NIL != witness)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject pos_lit = rest.first();
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = clauses.neg_lits(cnf);
          SubLObject neg_lit = NIL;
          for (neg_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), neg_lit = cdolist_list_var.first()) {
            if ((NIL != unification.unify_possible(pos_lit, neg_lit))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          if (count.numGE(TWO_INTEGER)) {
            witness = pos_lit;
          }
        }
      }
      return list_utilities.sublisp_boolean(witness);
    }
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 31252) 
  public static final SubLObject cached_self_expanding_rule_assertionP(SubLObject rule) {
    {
      SubLObject caching_state = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_, $sym87$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(cached_self_expanding_rule_assertionP_internal(rule)));
          memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  /** Return a list of all the forward rules involved in a deduction
   that is either an argument* or a dependent* of some assertion
   on FORT.  'argument*' and 'dependent*' mean 'transitive argument'
   and 'transitive dependent'. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 31637) 
  public static final SubLObject all_forward_rules_relevant_to_term(SubLObject fort) {
    checkType(fort, $sym88$FORT_P);
    {
      SubLObject rules = all_forward_rules_relevant_to_term_int(fort);
      rules = Sort.sort(rules, Symbols.symbol_function($sym89$_), Symbols.symbol_function($sym90$ASSERTION_DEPENDENT_COUNT));
      return rules;
    }
  }

  /** Returns all supports of DEDUCTION that are forward rules. */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 32783) 
  public static final SubLObject deduction_forward_rule_supports(SubLObject deduction) {
    {
      SubLObject forward_rules = NIL;
      SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        if ((NIL != assertions_high.forward_ruleP(support))) {
          forward_rules = cons(support, forward_rules);
        }
      }
      return Sequences.nreverse(forward_rules);
    }
  }

  /** to avoid infinite recursion going up */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 33103) 
  private static SubLSymbol $all_forward_rules_relevant_to_term_argument_set$ = null;

  /** to avoid infinite recursion going down */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 33221) 
  private static SubLSymbol $all_forward_rules_relevant_to_term_dependent_set$ = null;

  /** to avoid wasting work on duplicate narts */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 33342) 
  private static SubLSymbol $all_forward_rules_relevant_to_term_nart_set$ = null;

  /** the answer, built up by side effect */
  @SubL(source = "cycl/assertion-utilities.lisp", position = 33460) 
  private static SubLSymbol $all_forward_rules_relevant_to_term_result_set$ = null;

  @SubL(source = "cycl/assertion-utilities.lisp", position = 33575) 
  public static final SubLObject all_forward_rules_relevant_to_term_int(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject rules = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_2 = $all_forward_rules_relevant_to_term_argument_set$.currentBinding(thread);
          SubLObject _prev_bind_3 = $all_forward_rules_relevant_to_term_dependent_set$.currentBinding(thread);
          SubLObject _prev_bind_4 = $all_forward_rules_relevant_to_term_nart_set$.currentBinding(thread);
          SubLObject _prev_bind_5 = $all_forward_rules_relevant_to_term_result_set$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym49$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const50$EverythingPSC, thread);
            $all_forward_rules_relevant_to_term_argument_set$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            $all_forward_rules_relevant_to_term_dependent_set$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            $all_forward_rules_relevant_to_term_nart_set$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            $all_forward_rules_relevant_to_term_result_set$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            compute_all_forward_rules_relevant_to_term(fort, $list92);
            rules = $all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread);
          } finally {
            $all_forward_rules_relevant_to_term_result_set$.rebind(_prev_bind_5, thread);
            $all_forward_rules_relevant_to_term_nart_set$.rebind(_prev_bind_4, thread);
            $all_forward_rules_relevant_to_term_dependent_set$.rebind(_prev_bind_3, thread);
            $all_forward_rules_relevant_to_term_argument_set$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return set.set_element_list(rules);
      }
    }
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 34183) 
  public static final SubLObject compute_all_forward_rules_relevant_to_term(SubLObject fort, SubLObject walk_directions) {
    if ((NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL))) {
      {
        SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                  {
                    SubLObject done_var_31 = NIL;
                    SubLObject token_var_32 = NIL;
                    while ((NIL == done_var_31)) {
                      {
                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                        SubLObject valid_33 = makeBoolean((token_var_32 != assertion));
                        if ((NIL != valid_33)) {
                          if ((NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                            {
                              SubLObject cdolist_list_var = walk_directions;
                              SubLObject walk_direction = NIL;
                              for (walk_direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), walk_direction = cdolist_list_var.first()) {
                                compute_all_forward_rules_relevant_to_assertion(assertion, walk_direction);
                              }
                            }
                          }
                        }
                        done_var_31 = makeBoolean((NIL == valid_33));
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
    return NIL;
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 34442) 
  public static final SubLObject compute_all_forward_rules_relevant_to_assertion(SubLObject assertion, SubLObject walk_direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = walk_direction;
        if (pcase_var.eql($kw93$ARGUMENT_)) {
          if ((NIL != set.set_memberP(assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread)))) {
            return NIL;
          }
          set.set_add(assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw94$DEPENDENT_)) {
          if ((NIL != set.set_memberP(assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread)))) {
            return NIL;
          }
          set.set_add(assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread));
        }
      }
      {
        SubLObject cdolist_list_var = cycl_utilities.expression_narts(assertion, T, UNPROVIDED);
        SubLObject nart = NIL;
        for (nart = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), nart = cdolist_list_var.first()) {
          if ((NIL == set.set_memberP(nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread)))) {
            set.set_add(nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread));
            if ((NIL != kb_accessors.skolemize_forwardP(cycl_utilities.nat_functor(nart), assertions_high.assertion_mt(assertion)))) {
              compute_all_forward_rules_relevant_to_term(nart, list(walk_direction));
            }
          }
        }
      }
      compute_all_forward_rules_relevant_to_assertion_int(assertion, walk_direction);
      return NIL;
    }
  }

  @SubL(source = "cycl/assertion-utilities.lisp", position = 35396) 
  public static final SubLObject compute_all_forward_rules_relevant_to_assertion_int(SubLObject assertion, SubLObject walk_direction) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        for (argument = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argument = cdolist_list_var.first()) {
          if ((NIL != deduction_handles.deduction_p(argument))) {
            set_utilities.set_add_all(deduction_forward_rule_supports(argument), $all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread));
          }
        }
      }
      {
        SubLObject pcase_var = walk_direction;
        if (pcase_var.eql($kw93$ARGUMENT_)) {
          {
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject argument = NIL;
            for (argument = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argument = cdolist_list_var.first()) {
              if ((NIL != deduction_handles.deduction_p(argument))) {
                {
                  SubLObject cdolist_list_var_34 = deductions_high.deduction_supports(argument);
                  SubLObject supporting_assertion = NIL;
                  for (supporting_assertion = cdolist_list_var_34.first(); (NIL != cdolist_list_var_34); cdolist_list_var_34 = cdolist_list_var_34.rest(), supporting_assertion = cdolist_list_var_34.first()) {
                    if ((NIL != assertion_handles.assertion_p(supporting_assertion))) {
                      compute_all_forward_rules_relevant_to_assertion(supporting_assertion, walk_direction);
                    }
                  }
                }
              }
            }
          }
        } else if (pcase_var.eql($kw94$DEPENDENT_)) {
          {
            SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
            SubLObject deduction = NIL;
            for (deduction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), deduction = cdolist_list_var.first()) {
              {
                SubLObject dependent_assertion = deductions_high.deduction_assertion(deduction);
                if ((NIL != assertion_handles.assertion_p(dependent_assertion))) {
                  compute_all_forward_rules_relevant_to_assertion(dependent_assertion, walk_direction);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_assertion_utilities_file() {
    //declareMacro(myName, "do_rules", "DO-RULES");
    //declareMacro(myName, "do_gafs", "DO-GAFS");
    //declareMacro(myName, "do_assertion_dependent_assertions", "DO-ASSERTION-DEPENDENT-ASSERTIONS");
    //declareMacro(myName, "do_assertion_supporting_assertions", "DO-ASSERTION-SUPPORTING-ASSERTIONS");
    //declareFunction(myName, "assertion_list_p", "ASSERTION-LIST-P", 1, 0, false);
    //declareFunction(myName, "list_of_rule_assertion_p", "LIST-OF-RULE-ASSERTION-P", 1, 0, false);
    //declareFunction(myName, "assertion_dependent_assertions", "ASSERTION-DEPENDENT-ASSERTIONS", 1, 0, false);
    declareFunction(myName, "true_assertionP", "TRUE-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "false_assertionP", "FALSE-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "unknown_assertionP", "UNKNOWN-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "true_gaf_assertionP", "TRUE-GAF-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "false_gaf_assertionP", "FALSE-GAF-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "nl_semantic_assertionP", "NL-SEMANTIC-ASSERTION?", 1, 0, false);
    declareFunction(myName, "assertion_matches_typeP", "ASSERTION-MATCHES-TYPE?", 2, 0, false);
    declareFunction(myName, "assertion_matches_truthP", "ASSERTION-MATCHES-TRUTH?", 2, 0, false);
    declareFunction(myName, "assertion_matches_directionP", "ASSERTION-MATCHES-DIRECTION?", 2, 0, false);
    //declareFunction(myName, "assertion_matches_truth_and_directionP", "ASSERTION-MATCHES-TRUTH-AND-DIRECTION?", 3, 0, false);
    declareFunction(myName, "assertion_matches_type_truth_and_directionP", "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?", 4, 0, false);
    declareFunction(myName, "gaf_has_term_in_argnumP", "GAF-HAS-TERM-IN-ARGNUM?", 3, 0, false);
    declareFunction(myName, "gaf_has_term_in_some_argnumP", "GAF-HAS-TERM-IN-SOME-ARGNUM?", 2, 0, false);
    declareFunction(myName, "gaf_assertion_with_pred_p", "GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
    declareFunction(myName, "gaf_assertion_has_pred_p", "GAF-ASSERTION-HAS-PRED-P", 2, 0, false);
    //declareFunction(myName, "gaf_assertion_with_any_of_preds_p", "GAF-ASSERTION-WITH-ANY-OF-PREDS-P", 2, 0, false);
    //declareFunction(myName, "isa_gaf_p", "ISA-GAF-P", 1, 0, false);
    //declareFunction(myName, "genls_gaf_p", "GENLS-GAF-P", 1, 0, false);
    //declareFunction(myName, "assertion_cnf_with_el_vars_only", "ASSERTION-CNF-WITH-EL-VARS-ONLY", 1, 0, false);
    //declareFunction(myName, "except_when_rule_p", "EXCEPT-WHEN-RULE-P", 1, 0, false);
    //declareFunction(myName, "except_for_gaf_p", "EXCEPT-FOR-GAF-P", 1, 0, false);
    //declareFunction(myName, "abnormal_assertion_p", "ABNORMAL-ASSERTION-P", 1, 0, false);
    //declareFunction(myName, "abnormal_literal_from_assertion", "ABNORMAL-LITERAL-FROM-ASSERTION", 1, 0, false);
    declareFunction(myName, "excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 1, false);
    declareFunction(myName, "excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 0, false);
    declareFunction(myName, "assertion_matches_mtP", "ASSERTION-MATCHES-MT?", 1, 0, false);
    declareFunction(myName, "assertion_has_argumentsP", "ASSERTION-HAS-ARGUMENTS?", 1, 0, false);
    //declareFunction(myName, "assertion_has_deduction_with_supportP", "ASSERTION-HAS-DEDUCTION-WITH-SUPPORT?", 2, 0, false);
    //declareFunction(myName, "assertion_has_dependent_with_supportP", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
    //declareFunction(myName, "assertion_mentions_asserted_more_specificallyP", "ASSERTION-MENTIONS-ASSERTED-MORE-SPECIFICALLY?", 1, 0, false);
    //declareFunction(myName, "assertion_mentions_any_of_termsP", "ASSERTION-MENTIONS-ANY-OF-TERMS?", 2, 0, false);
    //declareFunction(myName, "assertion_mentions_any_of_terms_in_set_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA", 1, 0, false);
    //declareFunction(myName, "assertion_mentions_any_of_terms_in_setP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET?", 2, 0, false);
    //declareFunction(myName, "assertion_mentions_any_of_terms_in_dict_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA", 1, 0, false);
    //declareFunction(myName, "assertion_mentions_any_of_terms_in_dictionary_keysP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICTIONARY-KEYS?", 2, 0, false);
    //declareFunction(myName, "random_gaf_with_pred", "RANDOM-GAF-WITH-PRED", 1, 0, false);
    //declareFunction(myName, "random_gaf_with_predicate", "RANDOM-GAF-WITH-PREDICATE", 1, 0, false);
    //declareFunction(myName, "random_gaf_with_predicate_and_arg", "RANDOM-GAF-WITH-PREDICATE-AND-ARG", 3, 0, false);
    //declareFunction(myName, "random_rule_mentioning", "RANDOM-RULE-MENTIONING", 1, 0, false);
    //declareFunction(myName, "rules_mentioning", "RULES-MENTIONING", 1, 0, false);
    //declareFunction(myName, "rule_count_mentioning", "RULE-COUNT-MENTIONING", 1, 0, false);
    //declareFunction(myName, "assertion_earlierP", "ASSERTION-EARLIER?", 2, 0, false);
    //declareFunction(myName, "assertion_laterP", "ASSERTION-LATER?", 2, 0, false);
    //declareFunction(myName, "earliest_assertion", "EARLIEST-ASSERTION", 1, 0, false);
    //declareFunction(myName, "rename_assertion_variables", "RENAME-ASSERTION-VARIABLES", 2, 0, false);
    //declareFunction(myName, "possibly_rename_assertion_variables", "POSSIBLY-RENAME-ASSERTION-VARIABLES", 2, 0, false);
    //declareFunction(myName, "assertion_antecedent_query_formula", "ASSERTION-ANTECEDENT-QUERY-FORMULA", 1, 0, false);
    //declareFunction(myName, "assertion_known_extent_query_formula", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
    //declareFunction(myName, "assertion_unknown_extent_query_formula", "ASSERTION-UNKNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
    //declareFunction(myName, "assertion_known_extent_query_formula_int", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA-INT", 2, 0, false);
    //declareFunction(myName, "assertion_info", "ASSERTION-INFO", 1, 0, false);
    //declareFunction(myName, "assertion_literal_count", "ASSERTION-LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "rule_literal_count", "RULE-LITERAL-COUNT", 1, 0, false);
    //declareFunction(myName, "assertion_universal_time", "ASSERTION-UNIVERSAL-TIME", 1, 0, false);
    //declareFunction(myName, "all_assertions_sorted_by_creation_time_estimate", "ALL-ASSERTIONS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
    //declareFunction(myName, "assertion_newest_constant", "ASSERTION-NEWEST-CONSTANT", 1, 0, false);
    //declareFunction(myName, "initialize_newest_constant_table", "INITIALIZE-NEWEST-CONSTANT-TABLE", 0, 0, false);
    declareFunction(myName, "assertion_has_meta_assertionsP", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false);
    //declareFunction(myName, "all_meta_assertions", "ALL-META-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "meta_assertion_list_for_editing", "META-ASSERTION-LIST-FOR-EDITING", 1, 0, false);
    //declareFunction(myName, "meta_assertion_p", "META-ASSERTION-P", 1, 0, false);
    //declareFunction(myName, "meta_assertion_el_formula", "META-ASSERTION-EL-FORMULA", 3, 0, false);
    //declareFunction(myName, "mt_of_assertions_p", "MT-OF-ASSERTIONS-P", 2, 0, false);
    //declareFunction(myName, "assertions_of_mt", "ASSERTIONS-OF-MT", 2, 0, false);
    //declareFunction(myName, "mts_of_assertions", "MTS-OF-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "sibling_mt_assertions", "SIBLING-MT-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "assertions_min_mt", "ASSERTIONS-MIN-MT", 1, 0, false);
    //declareFunction(myName, "sort_gafs_by_term", "SORT-GAFS-BY-TERM", 1, 2, false);
    //declareFunction(myName, "rule_type_constraints", "RULE-TYPE-CONSTRAINTS", 1, 0, false);
    //declareFunction(myName, "self_looping_ruleP", "SELF-LOOPING-RULE?", 1, 0, false);
    //declareFunction(myName, "clear_cached_self_looping_rule_assertionP", "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?", 0, 0, false);
    //declareFunction(myName, "remove_cached_self_looping_rule_assertionP", "REMOVE-CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "cached_self_looping_rule_assertionP_internal", "CACHED-SELF-LOOPING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_self_looping_rule_assertionP", "CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "self_expanding_ruleP", "SELF-EXPANDING-RULE?", 1, 0, false);
    //declareFunction(myName, "clear_cached_self_expanding_rule_assertionP", "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 0, 0, false);
    //declareFunction(myName, "remove_cached_self_expanding_rule_assertionP", "REMOVE-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cached_self_expanding_rule_assertionP_internal", "CACHED-SELF-EXPANDING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
    declareFunction(myName, "cached_self_expanding_rule_assertionP", "CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "all_forward_rules_relevant_to_term", "ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
    //declareFunction(myName, "all_forward_rules_relevant_to_terms", "ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
    declareFunction(myName, "deduction_forward_rule_supports", "DEDUCTION-FORWARD-RULE-SUPPORTS", 1, 0, false);
    declareFunction(myName, "all_forward_rules_relevant_to_term_int", "ALL-FORWARD-RULES-RELEVANT-TO-TERM-INT", 1, 0, false);
    declareFunction(myName, "compute_all_forward_rules_relevant_to_term", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
    declareFunction(myName, "compute_all_forward_rules_relevant_to_assertion", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION", 2, 0, false);
    declareFunction(myName, "compute_all_forward_rules_relevant_to_assertion_int", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION-INT", 2, 0, false);
    //declareFunction(myName, "gather_all_exception_rules", "GATHER-ALL-EXCEPTION-RULES", 0, 1, false);
    //declareFunction(myName, "gather_all_pragma_rules", "GATHER-ALL-PRAGMA-RULES", 0, 1, false);
    //declareFunction(myName, "gather_all_lifting_rules", "GATHER-ALL-LIFTING-RULES", 0, 0, false);
    //declareFunction(myName, "lifting_ruleP", "LIFTING-RULE?", 1, 0, false);
    //declareFunction(myName, "rule_has_unlabelled_dont_care_variableP", "RULE-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false);
    //declareFunction(myName, "rule_unlabelled_dont_care_variables", "RULE-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false);
    //declareFunction(myName, "assertion_findable_by_idP", "ASSERTION-FINDABLE-BY-ID?", 1, 0, false);
    //declareFunction(myName, "embedded_assertions_findable_by_idP", "EMBEDDED-ASSERTIONS-FINDABLE-BY-ID?", 1, 1, false);
    //declareFunction(myName, "assertions_containing_assertions_not_findable_by_id", "ASSERTIONS-CONTAINING-ASSERTIONS-NOT-FINDABLE-BY-ID", 0, 0, false);
    //declareFunction(myName, "assertions_with_no_arguments", "ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
    //declareFunction(myName, "syntactically_ill_formed_assertion_count", "SYNTACTICALLY-ILL-FORMED-ASSERTION-COUNT", 0, 0, false);
    //declareFunction(myName, "syntactically_ill_formed_assertions", "SYNTACTICALLY-ILL-FORMED-ASSERTIONS", 0, 0, false);
    //declareFunction(myName, "syntactically_ill_formed_assertionP", "SYNTACTICALLY-ILL-FORMED-ASSERTION?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_assertion_utilities_file() {
    $assertion_mentions_any_of_terms_set_watermark$ = deflexical("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-WATERMARK*", $int45$30);
    $assertion_mentions_any_of_terms_set_lambda$ = defparameter("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-LAMBDA*", NIL);
    $assertion_mentions_any_of_terms_dict_lambda$ = defparameter("*ASSERTION-MENTIONS-ANY-OF-TERMS-DICT-LAMBDA*", NIL);
    $newest_constant_of_assertions$ = defparameter("*NEWEST-CONSTANT-OF-ASSERTIONS*", NIL);
    $cached_self_looping_rule_assertionP_caching_state$ = deflexical("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*", NIL);
    $cached_self_expanding_rule_assertionP_caching_state$ = deflexical("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*", NIL);
    $all_forward_rules_relevant_to_term_argument_set$ = defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-ARGUMENT-SET*", NIL);
    $all_forward_rules_relevant_to_term_dependent_set$ = defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-DEPENDENT-SET*", NIL);
    $all_forward_rules_relevant_to_term_nart_set$ = defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-NART-SET*", NIL);
    $all_forward_rules_relevant_to_term_result_set$ = defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-RESULT-SET*", NIL);
    return NIL;
  }

  public static final SubLObject setup_assertion_utilities_file() {
    // CVS_ID("Id: assertion-utilities.lisp 128428 2009-07-28 19:56:06Z goolsbey ");
    utilities_macros.register_cyc_api_function($sym64$ASSERTION_HAS_META_ASSERTIONS_, $list65, $str66$Return_T_iff_ASSERTION_has_some_m, $list67, $list68);
    memoization_state.note_globally_cached_function($sym83$CACHED_SELF_LOOPING_RULE_ASSERTION_);
    memoization_state.note_globally_cached_function($sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("RULE-VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc rules")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLString $str4$mapping_Cyc_rules = makeString("mapping Cyc rules");
  public static final SubLSymbol $kw5$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym6$DO_KEYHASH = makeSymbol("DO-KEYHASH");
  public static final SubLList $list7 = list(makeSymbol("KB-RULE-SET"));
  public static final SubLSymbol $sym8$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym9$TOTAL = makeUninternedSymbol("TOTAL");
  public static final SubLSymbol $sym10$SOFAR = makeUninternedSymbol("SOFAR");
  public static final SubLSymbol $sym11$CLET = makeSymbol("CLET");
  public static final SubLList $list12 = list(list(makeSymbol("RULE-COUNT")));
  public static final SubLList $list13 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym14$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym15$DO_RULES = makeSymbol("DO-RULES");
  public static final SubLSymbol $sym16$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym17$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLList $list18 = list(list(makeSymbol("GAF-VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc GAFs")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str19$mapping_Cyc_GAFs = makeString("mapping Cyc GAFs");
  public static final SubLSymbol $sym20$DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");
  public static final SubLSymbol $sym21$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym22$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLList $list23 = list(list(makeSymbol("DEPENDENT-ASSERTION"), makeSymbol("ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym24$DEDUCTION = makeUninternedSymbol("DEDUCTION");
  public static final SubLSymbol $sym25$DO_ASSERTION_DEPENDENTS = makeSymbol("DO-ASSERTION-DEPENDENTS");
  public static final SubLSymbol $sym26$DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");
  public static final SubLSymbol $sym27$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLList $list28 = list(list(makeSymbol("SUPPORTING-ASSERTION"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list29 = list(makeKeyword("DONE"));
  public static final SubLSymbol $sym30$ARGUMENT = makeUninternedSymbol("ARGUMENT");
  public static final SubLSymbol $sym31$DO_ASSERTION_ARGUMENTS = makeSymbol("DO-ASSERTION-ARGUMENTS");
  public static final SubLSymbol $sym32$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $sym33$DO_DEDUCTION_SUPPORTS = makeSymbol("DO-DEDUCTION-SUPPORTS");
  public static final SubLSymbol $kw34$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw35$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw36$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLObject $const37$NLSemanticPredicate = constant_handles.reader_make_constant_shell(makeString("NLSemanticPredicate"));
  public static final SubLObject $const38$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const39$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym40$ABNORMAL_ASSERTION_P = makeSymbol("ABNORMAL-ASSERTION-P");
  public static final SubLObject $const41$exceptMt = constant_handles.reader_make_constant_shell(makeString("exceptMt"));
  public static final SubLObject $const42$except = constant_handles.reader_make_constant_shell(makeString("except"));
  public static final SubLSymbol $sym43$SUPPORT_P = makeSymbol("SUPPORT-P");
  public static final SubLObject $const44$assertedMoreSpecifically = constant_handles.reader_make_constant_shell(makeString("assertedMoreSpecifically"));
  public static final SubLInteger $int45$30 = makeInteger(30);
  public static final SubLSymbol $sym46$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA = makeSymbol("ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA");
  public static final SubLSymbol $sym47$ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA = makeSymbol("ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA");
  public static final SubLInteger $int48$10000 = makeInteger(10000);
  public static final SubLSymbol $sym49$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const50$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw51$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw52$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym53$ASSERTED_WHEN = makeSymbol("ASSERTED-WHEN");
  public static final SubLSymbol $sym54$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym55$ASSERTED_SECOND = makeSymbol("ASSERTED-SECOND");
  public static final SubLSymbol $sym56$EL_VAR_NAME = makeSymbol("EL-VAR-NAME");
  public static final SubLObject $const57$knownSentence = constant_handles.reader_make_constant_shell(makeString("knownSentence"));
  public static final SubLObject $const58$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));
  public static final SubLString $str59$Sorting_newest_constants___Part_2 = makeString("Sorting newest constants : Part 2");
  public static final SubLSymbol $sym60$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw61$SKIP = makeKeyword("SKIP");
  public static final SubLString $str62$Computing_newest_constants = makeString("Computing newest constants");
  public static final SubLString $str63$Sorting_newest_constants___Part_1 = makeString("Sorting newest constants : Part 1");
  public static final SubLSymbol $sym64$ASSERTION_HAS_META_ASSERTIONS_ = makeSymbol("ASSERTION-HAS-META-ASSERTIONS?");
  public static final SubLList $list65 = list(makeSymbol("ASSERTION"));
  public static final SubLString $str66$Return_T_iff_ASSERTION_has_some_m = makeString("Return T iff ASSERTION has some meta-assertions.");
  public static final SubLList $list67 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));
  public static final SubLList $list68 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym69$ALL_META_ASSERTIONS = makeSymbol("ALL-META-ASSERTIONS");
  public static final SubLSymbol $sym70$META_ASSERTION_P = makeSymbol("META-ASSERTION-P");
  public static final SubLSymbol $sym71$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym72$ASSERTION_LIST_P = makeSymbol("ASSERTION-LIST-P");
  public static final SubLSymbol $sym73$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  public static final SubLSymbol $sym74$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym75$DEFINITIONAL_PRED__ = makeSymbol("DEFINITIONAL-PRED-<");
  public static final SubLSymbol $sym76$_ = makeSymbol("<");
  public static final SubLSymbol $sym77$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym78$GAF_PREDICATE = makeSymbol("GAF-PREDICATE");
  public static final SubLSymbol $sym79$GAF_ARG1 = makeSymbol("GAF-ARG1");
  public static final SubLSymbol $sym80$ISA_HL_VAR_THING_LIT_ = makeSymbol("ISA-HL-VAR-THING-LIT?");
  public static final SubLString $str81$Type_constraint__Mt_should_be_can = makeString("Type constraint: Mt should be canonical ~a, but isn't ~a");
  public static final SubLString $str82$Expected_a_single_DNF_clause_of_c = makeString("Expected a single DNF clause of constraints for ~a but got more than one: ~a");
  public static final SubLSymbol $sym83$CACHED_SELF_LOOPING_RULE_ASSERTION_ = makeSymbol("CACHED-SELF-LOOPING-RULE-ASSERTION?");
  public static final SubLSymbol $sym84$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*");
  public static final SubLSymbol $kw85$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_ = makeSymbol("CACHED-SELF-EXPANDING-RULE-ASSERTION?");
  public static final SubLSymbol $sym87$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*");
  public static final SubLSymbol $sym88$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym89$_ = makeSymbol(">");
  public static final SubLSymbol $sym90$ASSERTION_DEPENDENT_COUNT = makeSymbol("ASSERTION-DEPENDENT-COUNT");
  public static final SubLSymbol $sym91$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLList $list92 = list(makeKeyword("ARGUMENT*"), makeKeyword("DEPENDENT*"));
  public static final SubLSymbol $kw93$ARGUMENT_ = makeKeyword("ARGUMENT*");
  public static final SubLSymbol $kw94$DEPENDENT_ = makeKeyword("DEPENDENT*");
  public static final SubLString $str95$gathering_exception_rules = makeString("gathering exception rules");
  public static final SubLString $str96$gathering_pragma_rules = makeString("gathering pragma rules");
  public static final SubLString $str97$gathering_lifting_rules = makeString("gathering lifting rules");
  public static final SubLObject $const98$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym99$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLString $str100$__ = makeString("??");
  public static final SubLString $str101$Verifying_that_all_embedded_asser = makeString("Verifying that all embedded assertions are findable via ID");
  public static final SubLString $str102$Looking_for_assertions_with_no_ar = makeString("Looking for assertions with no arguments");
  public static final SubLString $str103$mapping_Cyc_assertions = makeString("mapping Cyc assertions");

  //// Initializers

  public void declareFunctions() {
    declare_assertion_utilities_file();
  }

  public void initializeVariables() {
    init_assertion_utilities_file();
  }

  public void runTopLevelForms() {
    setup_assertion_utilities_file();
  }

}
