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

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_admitted;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.ghl_search_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tva_inference;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;

public  final class tva_utilities extends SubLTranslatedFile {

  //// Constructor

  private tva_utilities() {}
  public static final SubLFile me = new tva_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.tva_utilities";

  //// Definitions

  /** The predicates used for TVA inference */
  @SubL(source = "cycl/tva-utilities.lisp", position = 892) 
  private static SubLSymbol $tva_predicates$ = null;

  @SubL(source = "cycl/tva-utilities.lisp", position = 1165) 
  public static final SubLObject get_tva_predicates() {
    return $tva_predicates$.getGlobalValue();
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 1364) 
  private static SubLSymbol $tva_precomputes_sksi_closuresP$ = null;

  /** Whether to iterate over the KB predicate extent within TVA */
  @SubL(source = "cycl/tva-utilities.lisp", position = 1546) 
  private static SubLSymbol $tva_iterates_kb_predicate_extentP$ = null;

  /** Whether to iterate over the SKSI predicate extent within TVA */
  @SubL(source = "cycl/tva-utilities.lisp", position = 1789) 
  private static SubLSymbol $tva_iterates_sksi_predicate_extentP$ = null;

  /** The cardinality below which a closure should be marked, regardless of direction */
  @SubL(source = "cycl/tva-utilities.lisp", position = 3389) 
  public static SubLSymbol $tva_precompute_closure_threshold$ = null;

  /** @return booleanp. Returns whether the arg 2 of ASSERTION is a GAF. */
  @SubL(source = "cycl/tva-utilities.lisp", position = 4434) 
  public static final SubLObject tva_assertion_p(SubLObject assertion) {
    return fort_types_interface.transitive_binary_predicate_p(assertions_high.gaf_arg2(assertion));
  }

  public static final class $tva_assertion_p$UnaryFunction extends UnaryFunction {
    public $tva_assertion_p$UnaryFunction() { super(extractFunctionNamed("TVA-ASSERTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return tva_assertion_p(arg1); }
  }

  /** @return booleanp. Returns whether PREDICATE should has any pertinent TVA[I] assertions */
  @SubL(source = "cycl/tva-utilities.lisp", position = 4782) 
  public static final SubLObject some_transitive_via_arg_assertionP(SubLObject predicate) {
    return makeBoolean(((NIL != kb_mapping_utilities.some_pred_value_if(predicate, $const18$transitiveViaArg, $sym19$TVA_ASSERTION_P, UNPROVIDED, UNPROVIDED))
          || (NIL != kb_mapping_utilities.some_pred_value_if(predicate, $const20$transitiveViaArgInverse, $sym19$TVA_ASSERTION_P, UNPROVIDED, UNPROVIDED))));
  }

  public static final class $some_transitive_via_arg_assertionP$UnaryFunction extends UnaryFunction {
    public $some_transitive_via_arg_assertionP$UnaryFunction() { super(extractFunctionNamed("SOME-TRANSITIVE-VIA-ARG-ASSERTION?")); }
    public SubLObject processItem(SubLObject arg1) { return some_transitive_via_arg_assertionP(arg1); }
  }

  /** @return booleanp. Returns whether PREDICATE should has any pertinent CVA[I] assertions */
  @SubL(source = "cycl/tva-utilities.lisp", position = 5100) 
  public static final SubLObject some_conservative_via_arg_assertionP(SubLObject predicate) {
    return makeBoolean(((NIL != kb_mapping_utilities.some_pred_value_if(predicate, $const21$conservativeViaArg, $sym22$CVA_ASSERTION_P, UNPROVIDED, UNPROVIDED))
          || (NIL != kb_mapping_utilities.some_pred_value_if(predicate, $const23$conservativeViaArgInverse, $sym22$CVA_ASSERTION_P, UNPROVIDED, UNPROVIDED))));
  }

  public static final class $some_conservative_via_arg_assertionP$UnaryFunction extends UnaryFunction {
    public $some_conservative_via_arg_assertionP$UnaryFunction() { super(extractFunctionNamed("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?")); }
    public SubLObject processItem(SubLObject arg1) { return some_conservative_via_arg_assertionP(arg1); }
  }

  /** @return booleanp. Returns whether PREDICATE has a #$transitiveViaArg... assertion somewhere, and should use the :tva module */
  @SubL(source = "cycl/tva-utilities.lisp", position = 5424) 
  public static final SubLObject some_tva_for_predicate(SubLObject predicate) {
    return cached_some_tva_for_predicate(predicate, UNPROVIDED);
  }

  /** @return booleanp. Returns whether PREDICATE has a #$conservativeViaArg... assertion somewhere should use the :tva module */
  @SubL(source = "cycl/tva-utilities.lisp", position = 5657) 
  public static final SubLObject some_cva_for_predicate(SubLObject predicate) {
    return cached_some_cva_for_predicate(predicate, UNPROVIDED);
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 5887) 
  private static SubLSymbol $cached_some_tva_for_predicate_caching_state$ = null;

  @SubL(source = "cycl/tva-utilities.lisp", position = 5887) 
  public static final SubLObject clear_cached_some_tva_for_predicate() {
    {
      SubLObject cs = $cached_some_tva_for_predicate_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_cached_some_tva_for_predicate$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_some_tva_for_predicate$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE")); }
    public SubLObject processItem() { return clear_cached_some_tva_for_predicate(); }
  }

  /** @return booleanp; Whether PREDICATE is the arg1 of any transitive-via assertion. */
  @SubL(source = "cycl/tva-utilities.lisp", position = 5887) 
  public static final SubLObject cached_some_tva_for_predicate_internal(SubLObject predicate, SubLObject mt_info) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if ((NIL != mt_relevance_macros.mt_function_eq(mt_info, $sym25$RELEVANT_MT_IS_EVERYTHING))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym25$RELEVANT_MT_IS_EVERYTHING, thread);
              mt_relevance_macros.$mt$.bind($const26$EverythingPSC, thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL != mt_relevance_macros.mt_function_eq(mt_info, $sym28$RELEVANT_MT_IS_ANY_MT))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym28$RELEVANT_MT_IS_ANY_MT, thread);
              mt_relevance_macros.$mt$.bind($const29$InferencePSC, thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL != hlmt.mt_union_naut_p(mt_info))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
              mt_relevance_macros.$relevant_mts$.bind(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12318"), thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym31$RELEVANT_MT_IS_GENL_MT, thread);
              mt_relevance_macros.$mt$.bind(mt_info, thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 5887) 
  public static final SubLObject cached_some_tva_for_predicate(SubLObject predicate, SubLObject mt_info) {
    if ((mt_info == UNPROVIDED)) {
      mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
    }
    {
      SubLObject caching_state = $cached_some_tva_for_predicate_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym24$CACHED_SOME_TVA_FOR_PREDICATE, $sym32$_CACHED_SOME_TVA_FOR_PREDICATE_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int33$100);
        memoization_state.register_hl_store_cache_clear_callback($sym34$CLEAR_CACHED_SOME_TVA_FOR_PREDICATE);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                  cached_args = cached_args.rest();
                  if (((NIL != cached_args)
                       && (NIL == cached_args.rest())
                       && mt_info.equal(cached_args.first()))) {
                    return memoization_state.caching_results(results2);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(cached_some_tva_for_predicate_internal(predicate, mt_info)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt_info));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 6296) 
  private static SubLSymbol $cached_some_cva_for_predicate_caching_state$ = null;

  @SubL(source = "cycl/tva-utilities.lisp", position = 6296) 
  public static final SubLObject clear_cached_some_cva_for_predicate() {
    {
      SubLObject cs = $cached_some_cva_for_predicate_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_cached_some_cva_for_predicate$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_some_cva_for_predicate$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE")); }
    public SubLObject processItem() { return clear_cached_some_cva_for_predicate(); }
  }

  /** @return booleanp; Whether PREDICATE is the arg1 of any conservative-via assertion. */
  @SubL(source = "cycl/tva-utilities.lisp", position = 6296) 
  public static final SubLObject cached_some_cva_for_predicate_internal(SubLObject predicate, SubLObject mt_info) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if ((NIL != mt_relevance_macros.mt_function_eq(mt_info, $sym25$RELEVANT_MT_IS_EVERYTHING))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym25$RELEVANT_MT_IS_EVERYTHING, thread);
              mt_relevance_macros.$mt$.bind($const26$EverythingPSC, thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL != mt_relevance_macros.mt_function_eq(mt_info, $sym28$RELEVANT_MT_IS_ANY_MT))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym28$RELEVANT_MT_IS_ANY_MT, thread);
              mt_relevance_macros.$mt$.bind($const29$InferencePSC, thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL != hlmt.mt_union_naut_p(mt_info))) {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
              mt_relevance_macros.$relevant_mts$.bind(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12319"), thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym31$RELEVANT_MT_IS_GENL_MT, thread);
              mt_relevance_macros.$mt$.bind(mt_info, thread);
              ans = genl_predicates.some_all_spec_preds_and_inverses(predicate, $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_, UNPROVIDED, UNPROVIDED);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 6296) 
  public static final SubLObject cached_some_cva_for_predicate(SubLObject predicate, SubLObject mt_info) {
    if ((mt_info == UNPROVIDED)) {
      mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
    }
    {
      SubLObject caching_state = $cached_some_cva_for_predicate_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym36$CACHED_SOME_CVA_FOR_PREDICATE, $sym38$_CACHED_SOME_CVA_FOR_PREDICATE_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int33$100);
        memoization_state.register_hl_store_cache_clear_callback($sym39$CLEAR_CACHED_SOME_CVA_FOR_PREDICATE);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt_info);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                  cached_args = cached_args.rest();
                  if (((NIL != cached_args)
                       && (NIL == cached_args.rest())
                       && mt_info.equal(cached_args.first()))) {
                    return memoization_state.caching_results(results2);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(cached_some_cva_for_predicate_internal(predicate, mt_info)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt_info));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 6853) 
  private static SubLSymbol $cached_tva_spec_preds_and_inverses_caching_state$ = null;

  public static final class $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30788"); }
  }

  /** @return listp; Returns the transitive predicates, X, s.t. (TVA-PRED INDEX-PRED X ARGNUM). */
  @SubL(source = "cycl/tva-utilities.lisp", position = 7691) 
  public static final SubLObject tva_gather_transitive_predicates_for_arg(SubLObject tva_pred, SubLObject index_pred, SubLObject argnum, SubLObject inverseP) {
    return ((NIL != somewhere_cache.some_pred_assertion_somewhereP(tva_pred, index_pred, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) kb_mapping_utilities.pred_arg_values(index_pred, tva_pred, determine_tva_gather_argnum(argnum, inverseP), ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, UNPROVIDED)) : NIL);
  }

  /** For PRED, are there any tva assertions that apply to arg ARGNUM? */
  @SubL(source = "cycl/tva-utilities.lisp", position = 8287) 
  public static final SubLObject any_tva_for_argP(SubLObject pred, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return cached_any_tva_for_argP(pred, argnum, mt_relevance_macros.$mt$.getDynamicValue(thread), mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 8481) 
  public static final SubLObject cached_any_tva_for_argP_internal(SubLObject pred, SubLObject argnum, SubLObject mt, SubLObject relevant_mt_function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject foundP = NIL;
        if ((NIL == foundP)) {
          {
            SubLObject node_var = pred;
            SubLObject deck_type = (false ? ((SubLObject) $kw42$STACK) : $kw43$QUEUE);
            SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            {
              SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
              try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                {
                  SubLObject tv_var = NIL;
                  {
                    SubLObject _prev_bind_0_21 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                      sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym44$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                      if ((NIL != tv_var)) {
                        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                          if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            {
                              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                              if (pcase_var.eql($kw45$ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str46$_A_is_not_a__A, tv_var, $sym47$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                              } else if (pcase_var.eql($kw48$CERROR)) {
                                Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2245");
                              } else if (pcase_var.eql($kw50$WARN)) {
                                Errors.warn($str46$_A_is_not_a__A, tv_var, $sym47$SBHL_TRUE_TV_P);
                              } else {
                                Errors.warn($str51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($str49$continue_anyway, $str46$_A_is_not_a__A, tv_var, $sym47$SBHL_TRUE_TV_P);
                              }
                            }
                          }
                        }
                      }
                      {
                        SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        SubLObject _prev_bind_1_23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const52$genlPreds), thread);
                          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const52$genlPreds)), thread);
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const52$genlPreds)), thread);
                          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                          sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const52$genlPreds), thread);
                          if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                              || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                            {
                              SubLObject _prev_bind_0_24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                              SubLObject _prev_bind_1_25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                              SubLObject _prev_bind_2_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                              try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const52$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                while (((NIL != node_and_predicate_mode)
                                     && (NIL == foundP))) {
                                  {
                                    SubLObject node_var_27 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject spec_pred = node_var_27;
                                    {
                                      SubLObject _prev_bind_0_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                      try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        {
                                          SubLObject inverse_modeP = predicate_mode;
                                          if ((NIL == foundP)) {
                                            {
                                              SubLObject csome_list_var = get_tva_predicates();
                                              SubLObject tva_pred = NIL;
                                              for (tva_pred = csome_list_var.first(); (!(((NIL != foundP)
                                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), tva_pred = csome_list_var.first()) {
                                                if ((NIL != tva_gather_transitive_predicates_for_arg(tva_pred, spec_pred, argnum, inverse_modeP))) {
                                                  foundP = T;
                                                }
                                              }
                                            }
                                          }
                                          {
                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const52$genlPreds));
                                            SubLObject rest = NIL;
                                            for (rest = accessible_modules; (!(((NIL != foundP)
                                                  || (NIL == rest)))); rest = rest.rest()) {
                                              {
                                                SubLObject module_var = rest.first();
                                                {
                                                  SubLObject _prev_bind_0_29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                  try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    {
                                                      SubLObject node = function_terms.naut_to_nart(node_var_27);
                                                      if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                        {
                                                          SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                          if ((NIL != d_link)) {
                                                            {
                                                              SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                              if ((NIL != mt_links)) {
                                                                {
                                                                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                  while ((!(((NIL != foundP)
                                                                        || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                      SubLObject mt_31 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                      SubLObject tv_links = thread.secondMultipleValue();
                                                                      thread.resetMultipleValues();
                                                                      if ((NIL != mt_relevance_macros.relevant_mtP(mt_31))) {
                                                                        {
                                                                          SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                          try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_31, thread);
                                                                            {
                                                                              SubLObject iteration_state_33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                              while ((!(((NIL != foundP)
                                                                                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_33)))))) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                  SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_33);
                                                                                  SubLObject link_nodes = thread.secondMultipleValue();
                                                                                  thread.resetMultipleValues();
                                                                                  if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                    {
                                                                                      SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                      try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        {
                                                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9338")) : link_nodes);
                                                                                          SubLObject rest_35 = NIL;
                                                                                          for (rest_35 = new_list; (!(((NIL != foundP)
                                                                                                || (NIL == rest_35)))); rest_35 = rest_35.rest()) {
                                                                                            {
                                                                                              SubLObject node_vars_link_node = rest_35.first();
                                                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_34, thread);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  iteration_state_33 = dictionary_contents.do_dictionary_contents_next(iteration_state_33);
                                                                                }
                                                                              }
                                                                              dictionary_contents.do_dictionary_contents_finalize(iteration_state_33);
                                                                            }
                                                                          } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_32, thread);
                                                                          }
                                                                        }
                                                                      }
                                                                      iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                  }
                                                                  dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str53$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                          }
                                                        }
                                                      } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                        {
                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9339")) : Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2749"));
                                                          SubLObject rest_36 = NIL;
                                                          for (rest_36 = new_list; (!(((NIL != foundP)
                                                                || (NIL == rest_36)))); rest_36 = rest_36.rest()) {
                                                            {
                                                              SubLObject generating_fn = rest_36.first();
                                                              {
                                                                SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                  sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                  {
                                                                    SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                    SubLObject new_list_38 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9340")) : link_nodes);
                                                                    SubLObject rest_39 = NIL;
                                                                    for (rest_39 = new_list_38; (!(((NIL != foundP)
                                                                          || (NIL == rest_39)))); rest_39 = rest_39.rest()) {
                                                                      {
                                                                        SubLObject node_vars_link_node = rest_39.first();
                                                                        if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                          sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                          deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } finally {
                                                                  sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_37, thread);
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_30, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_29, thread);
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_28, thread);
                                      }
                                    }
                                  }
                                  node_and_predicate_mode = deck.deck_pop(recur_deck);
                                }
                              } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_26, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_25, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_24, thread);
                              }
                            }
                          } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str54$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          }
                        } finally {
                          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                          sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_23, thread);
                          sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_22, thread);
                        }
                      }
                    } finally {
                      sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                      sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_21, thread);
                    }
                  }
                  sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                }
              } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return foundP;
      }
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 8481) 
  public static final SubLObject cached_any_tva_for_argP(SubLObject pred, SubLObject argnum, SubLObject mt, SubLObject relevant_mt_function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym60$CACHED_ANY_TVA_FOR_ARG_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym60$CACHED_ANY_TVA_FOR_ARG_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym60$CACHED_ANY_TVA_FOR_ARG_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(pred, argnum, mt, relevant_mt_function);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args)
                             && (NIL == cached_args.rest())
                             && relevant_mt_function.equal(cached_args.first()))) {
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
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(cached_any_tva_for_argP_internal(pred, argnum, mt, relevant_mt_function)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, argnum, mt, relevant_mt_function));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/tva-utilities.lisp", position = 9818) 
  public static final SubLObject determine_tva_gather_argnum(SubLObject argnum, SubLObject inverseP) {
    if ((NIL != inverseP)) {
      return misc_utilities.other_binary_arg(argnum);
    } else {
      return argnum;
    }
  }

  public static final SubLObject declare_tva_utilities_file() {
    declareFunction(myName, "get_tva_predicates", "GET-TVA-PREDICATES", 0, 0, false);
    declareMacro(myName, "do_tva_predicates", "DO-TVA-PREDICATES");
    declareFunction(myName, "tva_precomputes_sksi_closuresP", "TVA-PRECOMPUTES-SKSI-CLOSURES?", 0, 0, false);
    declareFunction(myName, "tva_iterates_kb_predicate_extentP", "TVA-ITERATES-KB-PREDICATE-EXTENT?", 0, 0, false);
    declareFunction(myName, "tva_iterates_sksi_predicate_extentP", "TVA-ITERATES-SKSI-PREDICATE-EXTENT?", 0, 0, false);
    declareFunction(myName, "tva_arg_admittance_okP", "TVA-ARG-ADMITTANCE-OK?", 5, 0, false);
    declareFunction(myName, "tva_relation_checks_arg_admittance_p", "TVA-RELATION-CHECKS-ARG-ADMITTANCE-P", 4, 0, false);
    declareFunction(myName, "tva_argument_admitted_p", "TVA-ARGUMENT-ADMITTED-P", 1, 0, false);
    declareMacro(myName, "with_tva_precompute_closure_threshold", "WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD");
    declareFunction(myName, "less_than_precompute_closure_thresholdP", "LESS-THAN-PRECOMPUTE-CLOSURE-THRESHOLD?", 1, 0, false);
    declareFunction(myName, "tva_predicate_p", "TVA-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "cva_predicate_p", "CVA-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "tva_assertion_p", "TVA-ASSERTION-P", 1, 0, false); new $tva_assertion_p$UnaryFunction();
    declareFunction(myName, "cva_assertion_p", "CVA-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "some_transitive_via_arg_assertionP", "SOME-TRANSITIVE-VIA-ARG-ASSERTION?", 1, 0, false); new $some_transitive_via_arg_assertionP$UnaryFunction();
    declareFunction(myName, "some_conservative_via_arg_assertionP", "SOME-CONSERVATIVE-VIA-ARG-ASSERTION?", 1, 0, false); new $some_conservative_via_arg_assertionP$UnaryFunction();
    declareFunction(myName, "some_tva_for_predicate", "SOME-TVA-FOR-PREDICATE", 1, 0, false);
    declareFunction(myName, "some_cva_for_predicate", "SOME-CVA-FOR-PREDICATE", 1, 0, false);
    declareFunction(myName, "clear_cached_some_tva_for_predicate", "CLEAR-CACHED-SOME-TVA-FOR-PREDICATE", 0, 0, false); new $clear_cached_some_tva_for_predicate$ZeroArityFunction();
    declareFunction(myName, "remove_cached_some_tva_for_predicate", "REMOVE-CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "cached_some_tva_for_predicate_internal", "CACHED-SOME-TVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cached_some_tva_for_predicate", "CACHED-SOME-TVA-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "clear_cached_some_cva_for_predicate", "CLEAR-CACHED-SOME-CVA-FOR-PREDICATE", 0, 0, false); new $clear_cached_some_cva_for_predicate$ZeroArityFunction();
    declareFunction(myName, "remove_cached_some_cva_for_predicate", "REMOVE-CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "cached_some_cva_for_predicate_internal", "CACHED-SOME-CVA-FOR-PREDICATE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cached_some_cva_for_predicate", "CACHED-SOME-CVA-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "tva_spec_preds_and_inverses", "TVA-SPEC-PREDS-AND-INVERSES", 1, 0, false);
    declareFunction(myName, "clear_cached_tva_spec_preds_and_inverses", "CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 0, 0, false); new $clear_cached_tva_spec_preds_and_inverses$ZeroArityFunction();
    declareFunction(myName, "remove_cached_tva_spec_preds_and_inverses", "REMOVE-CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 0, false);
    declareFunction(myName, "cached_tva_spec_preds_and_inverses_internal", "CACHED-TVA-SPEC-PREDS-AND-INVERSES-INTERNAL", 3, 0, false);
    declareFunction(myName, "cached_tva_spec_preds_and_inverses", "CACHED-TVA-SPEC-PREDS-AND-INVERSES", 3, 0, false);
    declareFunction(myName, "tva_gather_transitive_predicates_for_arg", "TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG", 4, 0, false);
    declareMacro(myName, "do_trans_preds_for_arg_with_mode", "DO-TRANS-PREDS-FOR-ARG-WITH-MODE");
    declareFunction(myName, "any_tva_for_argP", "ANY-TVA-FOR-ARG?", 2, 0, false);
    declareFunction(myName, "cached_any_tva_for_argP_internal", "CACHED-ANY-TVA-FOR-ARG?-INTERNAL", 4, 0, false);
    declareFunction(myName, "cached_any_tva_for_argP", "CACHED-ANY-TVA-FOR-ARG?", 4, 0, false);
    declareFunction(myName, "tva_direction_for_tva_pred", "TVA-DIRECTION-FOR-TVA-PRED", 1, 0, false);
    declareFunction(myName, "tva_direction_to_sbhl_direction", "TVA-DIRECTION-TO-SBHL-DIRECTION", 1, 0, false);
    declareFunction(myName, "tva_direction_to_ghl_direction", "TVA-DIRECTION-TO-GHL-DIRECTION", 1, 0, false);
    declareFunction(myName, "tva_direction_to_ghl_closure_direction", "TVA-DIRECTION-TO-GHL-CLOSURE-DIRECTION", 1, 0, false);
    declareFunction(myName, "determine_tva_gather_argnum", "DETERMINE-TVA-GATHER-ARGNUM", 2, 0, false);
    declareMacro(myName, "do_tva_term_argnums", "DO-TVA-TERM-ARGNUMS");
    declareFunction(myName, "tva_precomputation_p", "TVA-PRECOMPUTATION-P", 1, 0, false);
    declareFunction(myName, "tva_unify_vars", "TVA-UNIFY-VARS", 1, 0, false);
    declareFunction(myName, "tva_support_module_for_pred", "TVA-SUPPORT-MODULE-FOR-PRED", 1, 0, false);
    declareFunction(myName, "genl_preds_support_from_pred_to_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-PRED", 3, 0, false);
    declareFunction(myName, "genl_preds_support_from_pred_to_tva_pred", "GENL-PREDS-SUPPORT-FROM-PRED-TO-TVA-PRED", 2, 0, false);
    declareFunction(myName, "tva_assertion_support", "TVA-ASSERTION-SUPPORT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_tva_utilities_file() {
    $tva_predicates$ = deflexical("*TVA-PREDICATES*", $list0);
    $tva_precomputes_sksi_closuresP$ = deflexical("*TVA-PRECOMPUTES-SKSI-CLOSURES?*", maybeDefault( $sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__, $tva_precomputes_sksi_closuresP$, NIL));
    $tva_iterates_kb_predicate_extentP$ = deflexical("*TVA-ITERATES-KB-PREDICATE-EXTENT?*", maybeDefault( $sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__, $tva_iterates_kb_predicate_extentP$, T));
    $tva_iterates_sksi_predicate_extentP$ = deflexical("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*", maybeDefault( $sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__, $tva_iterates_sksi_predicate_extentP$, NIL));
    $tva_precompute_closure_threshold$ = defparameter("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*", $int11$60);
    $cached_some_tva_for_predicate_caching_state$ = deflexical("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*", NIL);
    $cached_some_cva_for_predicate_caching_state$ = deflexical("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*", NIL);
    $cached_tva_spec_preds_and_inverses_caching_state$ = deflexical("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_tva_utilities_file() {
    // CVS_ID("Id: tva-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__);
    subl_macro_promotions.declare_defglobal($sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__);
    subl_macro_promotions.declare_defglobal($sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__);
    memoization_state.note_globally_cached_function($sym24$CACHED_SOME_TVA_FOR_PREDICATE);
    memoization_state.note_globally_cached_function($sym36$CACHED_SOME_CVA_FOR_PREDICATE);
    memoization_state.note_globally_cached_function($sym40$CACHED_TVA_SPEC_PREDS_AND_INVERSES);
    memoization_state.note_memoized_function($sym60$CACHED_ANY_TVA_FOR_ARG_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(constant_handles.reader_make_constant_shell(makeString("transitiveViaArg")), constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse")), constant_handles.reader_make_constant_shell(makeString("conservativeViaArg")), constant_handles.reader_make_constant_shell(makeString("conservativeViaArgInverse")));
  public static final SubLList $list1 = list(list(makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym5$CSOME = makeSymbol("CSOME");
  public static final SubLList $list6 = list(makeSymbol("GET-TVA-PREDICATES"));
  public static final SubLSymbol $sym7$_TVA_PRECOMPUTES_SKSI_CLOSURES__ = makeSymbol("*TVA-PRECOMPUTES-SKSI-CLOSURES?*");
  public static final SubLSymbol $sym8$_TVA_ITERATES_KB_PREDICATE_EXTENT__ = makeSymbol("*TVA-ITERATES-KB-PREDICATE-EXTENT?*");
  public static final SubLSymbol $sym9$_TVA_ITERATES_SKSI_PREDICATE_EXTENT__ = makeSymbol("*TVA-ITERATES-SKSI-PREDICATE-EXTENT?*");
  public static final SubLObject $const10$argAdmittanceTestedDuringTransiti = constant_handles.reader_make_constant_shell(makeString("argAdmittanceTestedDuringTransitiveViaInference"));
  public static final SubLInteger $int11$60 = makeInteger(60);
  public static final SubLList $list12 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym13$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym14$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list15 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $sym16$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym17$_TVA_PRECOMPUTE_CLOSURE_THRESHOLD_ = makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*");
  public static final SubLObject $const18$transitiveViaArg = constant_handles.reader_make_constant_shell(makeString("transitiveViaArg"));
  public static final SubLSymbol $sym19$TVA_ASSERTION_P = makeSymbol("TVA-ASSERTION-P");
  public static final SubLObject $const20$transitiveViaArgInverse = constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse"));
  public static final SubLObject $const21$conservativeViaArg = constant_handles.reader_make_constant_shell(makeString("conservativeViaArg"));
  public static final SubLSymbol $sym22$CVA_ASSERTION_P = makeSymbol("CVA-ASSERTION-P");
  public static final SubLObject $const23$conservativeViaArgInverse = constant_handles.reader_make_constant_shell(makeString("conservativeViaArgInverse"));
  public static final SubLSymbol $sym24$CACHED_SOME_TVA_FOR_PREDICATE = makeSymbol("CACHED-SOME-TVA-FOR-PREDICATE");
  public static final SubLSymbol $sym25$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const26$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym27$SOME_TRANSITIVE_VIA_ARG_ASSERTION_ = makeSymbol("SOME-TRANSITIVE-VIA-ARG-ASSERTION?");
  public static final SubLSymbol $sym28$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLObject $const29$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym30$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
  public static final SubLSymbol $sym31$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym32$_CACHED_SOME_TVA_FOR_PREDICATE_CACHING_STATE_ = makeSymbol("*CACHED-SOME-TVA-FOR-PREDICATE-CACHING-STATE*");
  public static final SubLInteger $int33$100 = makeInteger(100);
  public static final SubLSymbol $sym34$CLEAR_CACHED_SOME_TVA_FOR_PREDICATE = makeSymbol("CLEAR-CACHED-SOME-TVA-FOR-PREDICATE");
  public static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym36$CACHED_SOME_CVA_FOR_PREDICATE = makeSymbol("CACHED-SOME-CVA-FOR-PREDICATE");
  public static final SubLSymbol $sym37$SOME_CONSERVATIVE_VIA_ARG_ASSERTION_ = makeSymbol("SOME-CONSERVATIVE-VIA-ARG-ASSERTION?");
  public static final SubLSymbol $sym38$_CACHED_SOME_CVA_FOR_PREDICATE_CACHING_STATE_ = makeSymbol("*CACHED-SOME-CVA-FOR-PREDICATE-CACHING-STATE*");
  public static final SubLSymbol $sym39$CLEAR_CACHED_SOME_CVA_FOR_PREDICATE = makeSymbol("CLEAR-CACHED-SOME-CVA-FOR-PREDICATE");
  public static final SubLSymbol $sym40$CACHED_TVA_SPEC_PREDS_AND_INVERSES = makeSymbol("CACHED-TVA-SPEC-PREDS-AND-INVERSES");
  public static final SubLSymbol $kw41$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw42$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw43$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym44$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw45$ERROR = makeKeyword("ERROR");
  public static final SubLString $str46$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym47$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw48$CERROR = makeKeyword("CERROR");
  public static final SubLString $str49$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw50$WARN = makeKeyword("WARN");
  public static final SubLString $str51$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const52$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLString $str53$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str54$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym55$_CACHED_TVA_SPEC_PREDS_AND_INVERSES_CACHING_STATE_ = makeSymbol("*CACHED-TVA-SPEC-PREDS-AND-INVERSES-CACHING-STATE*");
  public static final SubLSymbol $sym56$CLEAR_CACHED_TVA_SPEC_PREDS_AND_INVERSES = makeSymbol("CLEAR-CACHED-TVA-SPEC-PREDS-AND-INVERSES");
  public static final SubLList $list57 = list(list(makeSymbol("TRANS-PRED-VAR"), makeSymbol("TVA-PRED"), makeSymbol("PRED"), makeSymbol("ARGNUM"), makeSymbol("INVERSE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym58$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym59$TVA_GATHER_TRANSITIVE_PREDICATES_FOR_ARG = makeSymbol("TVA-GATHER-TRANSITIVE-PREDICATES-FOR-ARG");
  public static final SubLSymbol $sym60$CACHED_ANY_TVA_FOR_ARG_ = makeSymbol("CACHED-ANY-TVA-FOR-ARG?");
  public static final SubLSymbol $kw61$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw62$FORWARD = makeKeyword("FORWARD");
  public static final SubLString $str63$Continue = makeString("Continue");
  public static final SubLString $str64$Error_in_tva_pred____a = makeString("Error in tva-pred : ~a");
  public static final SubLSymbol $kw65$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw66$INVERSE = makeKeyword("INVERSE");
  public static final SubLString $str67$Error_in_direction____a = makeString("Error in direction : ~a");
  public static final SubLList $list68 = list(list(makeSymbol("ARGNUM-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list69 = list(list(makeSymbol("TVA-TERM-ARGNUMS")));
  public static final SubLList $list70 = list(makeSymbol("VAR"), makeSymbol("ARGNUM"));
  public static final SubLSymbol $kw71$TRANSITIVITY = makeKeyword("TRANSITIVITY");
  public static final SubLSymbol $kw72$CONTEXTUAL_TRANSITIVITY = makeKeyword("CONTEXTUAL-TRANSITIVITY");
  public static final SubLSymbol $kw73$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLObject $const74$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $kw75$CODE = makeKeyword("CODE");

  //// Initializers

  public void declareFunctions() {
    declare_tva_utilities_file();
  }

  public void initializeVariables() {
    init_tva_utilities_file();
  }

  public void runTopLevelForms() {
    setup_tva_utilities_file();
  }

}
