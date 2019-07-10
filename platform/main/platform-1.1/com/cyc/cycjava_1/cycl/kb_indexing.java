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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.assertions_interface;
//dm import com.cyc.cycjava_1.cycl.assertions_low;
//dm import com.cyc.cycjava_1.cycl.auxiliary_indexing;
//dm import com.cyc.cycjava_1.cycl.clause_strucs;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constant_index_manager;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_macros;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.nart_index_manager;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.simple_indexing;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.unrepresented_term_index_manager;
//dm import com.cyc.cycjava_1.cycl.unrepresented_terms;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class kb_indexing extends SubLTranslatedFile {

  //// Constructor

  private kb_indexing() {}
  public static final SubLFile me = new kb_indexing();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_indexing";

  //// Definitions

  @SubL(source = "cycl/kb-indexing.lisp", position = 717) 
  public static final SubLObject get_subindex(SubLObject v_term, SubLObject keys) {
    {
      SubLObject subindex = kb_indexing_datastructures.term_index(v_term);
      SubLObject cdolist_list_var = keys;
      SubLObject key = NIL;
      for (key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
        if (((NIL != key)
             && (NIL != subindex))) {
          subindex = kb_indexing_datastructures.intermediate_index_lookup(subindex, key);
        }
      }
      return subindex;
    }
  }

  /** Walks down the indexing for TERM by following successive elements of KEYS,
   and once it gets to the bottom, inserts LEAF. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 1075) 
  public static final SubLObject term_add_indexing_leaf(SubLObject v_term, SubLObject keys, SubLObject leaf) {
    mark_term_index_as_muted(v_term);
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      return simple_indexing.add_simple_index(v_term, leaf);
    } else {
      return kb_indexing_datastructures.intermediate_index_insert(kb_indexing_datastructures.term_index(v_term), keys, leaf);
    }
  }

  /** Walks down the indexing for TERM by following successive elements of KEYS,
   and once it gets to the bottom, deletes LEAF. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 1591) 
  public static final SubLObject term_rem_indexing_leaf(SubLObject v_term, SubLObject keys, SubLObject leaf) {
    mark_term_index_as_muted(v_term);
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      return simple_indexing.rem_simple_index(v_term, leaf);
    } else {
      kb_indexing_datastructures.intermediate_index_delete(kb_indexing_datastructures.term_index(v_term), keys, leaf);
      simple_indexing.possibly_toggle_term_index_mode(v_term);
      return leaf;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 2073) 
  public static final SubLObject all_mt_subindex_keys_relevant_p() {
    return mt_relevance_macros.any_or_all_mts_are_relevantP();
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 2809) 
  public static final SubLObject relevant_mt_subindex_count_with_cutoff(SubLObject mt_subindex, SubLObject cutoff) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(mt_subindex, $sym0$INTERMEDIATE_INDEX_P);
      checkType(cutoff, $sym1$NON_NEGATIVE_INTEGER_P);
      if ((NIL != all_mt_subindex_keys_relevant_p())) {
        return Numbers.min(cutoff, kb_indexing_datastructures.subindex_leaf_count(mt_subindex));
      } else if ((NIL != mt_relevance_macros.only_specified_mt_is_relevantP())) {
        {
          SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
          SubLObject subindex = kb_indexing_datastructures.subindex_lookup(mt_subindex, mt);
          return ((NIL != subindex) ? ((SubLObject) Numbers.min(cutoff, kb_indexing_datastructures.subindex_leaf_count(subindex))) : ZERO_INTEGER);
        }
      } else {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject doneP = NIL;
          SubLObject index = mt_subindex;
          if ((NIL != kb_indexing_datastructures.do_intermediate_index_valid_index_p(index))) {
            {
              SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kb_indexing_datastructures.intermediate_index_dictionary(index)));
              while ((!(((NIL != doneP)
                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                thread.resetMultipleValues();
                {
                  SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                  SubLObject subindex = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if ((NIL != kb_indexing_macros.number_has_reached_cutoffP(count, cutoff))) {
                    doneP = T;
                  } else {
                    if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                      count = Numbers.add(count, kb_indexing_datastructures.subindex_leaf_count(subindex));
                    }
                  }
                  iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                }
              }
              dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
          }
          return Numbers.min(cutoff, count);
        }
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 4275) 
  public static final SubLObject mark_term_index_as_muted(SubLObject v_term) {
    if ((NIL != constant_handles.constant_p(v_term))) {
      {
        SubLObject id = constant_handles.constant_suid(v_term);
        if ((NIL != id)) {
          return constant_index_manager.mark_constant_index_as_muted(id);
        }
      }
    } else if ((NIL != nart_handles.nart_p(v_term))) {
      {
        SubLObject id = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30874");
        if ((NIL != id)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32147");
        }
      }
    } else if ((NIL != unrepresented_terms.kb_unrepresented_term_p(v_term))) {
      {
        SubLObject id = unrepresented_terms.unrepresented_term_suid(v_term);
        if ((NIL != id)) {
          return unrepresented_term_index_manager.mark_unrepresented_term_index_as_muted(id);
        }
      }
    }
    return NIL;
  }

  /** Return the number of gafs indexed off of TERM ARGNUM PRED MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 4769) 
  public static final SubLObject num_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred, mt))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = get_gaf_arg_subindex(v_term, argnum, pred, mt);
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  /** Return the assertion count at relevant mts under TERM ARGNUM PRED. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 5100) 
  public static final SubLObject relevant_num_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != all_mt_subindex_keys_relevant_p())) {
        num = num_gaf_arg_index(v_term, argnum, pred, UNPROVIDED);
      } else {
        if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
          {
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
              if ((NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred, UNPROVIDED))) {
                if ((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                  num = Numbers.add(num, ONE_INTEGER);
                }
              }
            }
          }
        } else {
          {
            SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(argnum, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (good_key_count.numE(Numbers.subtract(THREE_INTEGER, ONE_INTEGER))) {
              {
                SubLObject mt_subindex = get_gaf_arg_subindex(v_term, argnum, pred, UNPROVIDED);
                if ((NIL != mt_subindex)) {
                  num = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12807");
                }
              }
            } else {
              {
                SubLObject good_keys = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4718");
                SubLObject next_level_keys = Functions.apply($sym6$KEY_GAF_ARG_INDEX, v_term, good_keys);
                SubLObject cdolist_list_var = next_level_keys;
                SubLObject next_key = NIL;
                for (next_key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), next_key = cdolist_list_var.first()) {
                  num = Numbers.add(num, Functions.apply($sym7$RELEVANT_NUM_GAF_ARG_INDEX, v_term, ConsesLow.append(good_keys, list(next_key))));
                }
              }
            }
          }
        }
      }
      return num;
    }
  }

  /** Return the assertion count at relevant mts under TERM ARGNUM PRED.
@param CUTOFF non-negative-integer-p; a number beyond which to stop counting relevant
assertions and just return CUTOFF. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 5372) 
  public static final SubLObject relevant_num_gaf_arg_index_with_cutoff(SubLObject v_term, SubLObject cutoff, SubLObject argnum, SubLObject pred) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    checkType(cutoff, $sym1$NON_NEGATIVE_INTEGER_P);
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != all_mt_subindex_keys_relevant_p())) {
        num = num_gaf_arg_index(v_term, argnum, pred, UNPROVIDED);
        if ((NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff))) {
          num = cutoff;
        }
      } else {
        if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
          {
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
              if ((NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff))) {
                if ((NIL != simple_indexing.matches_gaf_arg_index(ass, v_term, argnum, pred, UNPROVIDED))) {
                  if ((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                    num = Numbers.add(num, ONE_INTEGER);
                  }
                }
              }
            }
          }
        } else {
          {
            SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(argnum, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (good_key_count.numE(Numbers.subtract(THREE_INTEGER, ONE_INTEGER))) {
              {
                SubLObject mt_subindex = get_gaf_arg_subindex(v_term, argnum, pred, UNPROVIDED);
                if ((NIL != mt_subindex)) {
                  num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
                }
              }
            } else {
              {
                SubLObject good_keys = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4719");
                SubLObject next_level_keys = Functions.apply($sym6$KEY_GAF_ARG_INDEX, v_term, good_keys);
                SubLObject cdolist_list_var = next_level_keys;
                SubLObject next_key = NIL;
                for (next_key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), next_key = cdolist_list_var.first()) {
                  num = Numbers.add(num, Functions.apply($sym10$RELEVANT_NUM_GAF_ARG_INDEX_WITH_CUTOFF, v_term, new SubLObject[] {cutoff, ConsesLow.append(good_keys, list(next_key))}));
                }
              }
            }
          }
        }
      }
      return num;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 5822) 
  private static SubLSymbol $key_gaf_arg_index_cached_caching_state$ = null;

  @SubL(source = "cycl/kb-indexing.lisp", position = 5822) 
  public static final SubLObject clear_key_gaf_arg_index_cached() {
    {
      SubLObject cs = $key_gaf_arg_index_cached_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_key_gaf_arg_index_cached$ZeroArityFunction extends ZeroArityFunction {
    public $clear_key_gaf_arg_index_cached$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-KEY-GAF-ARG-INDEX-CACHED")); }
    public SubLObject processItem() { return clear_key_gaf_arg_index_cached(); }
  }

  /** Return a list of the keys to the next index level below TERM ARGNUM PRED. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 5822) 
  public static final SubLObject key_gaf_arg_index_cached_internal(SubLObject v_term, SubLObject argnum, SubLObject pred) {
    return key_gaf_arg_index(v_term, argnum, pred);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 5822) 
  public static final SubLObject key_gaf_arg_index_cached(SubLObject v_term, SubLObject argnum, SubLObject pred) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    {
      SubLObject caching_state = $key_gaf_arg_index_cached_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym11$KEY_GAF_ARG_INDEX_CACHED, $sym12$_KEY_GAF_ARG_INDEX_CACHED_CACHING_STATE_, $int13$5000, EQ, THREE_INTEGER, ZERO_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym14$CLEAR_KEY_GAF_ARG_INDEX_CACHED);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, argnum, pred);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw15$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if ((v_term == cached_args.first())) {
                  cached_args = cached_args.rest();
                  if ((argnum == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (pred == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(key_gaf_arg_index_cached_internal(v_term, argnum, pred)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, argnum, pred));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  /** Return a list of the keys to the next index level below TERM ARGNUM PRED.
   @note destructible */
  @SubL(source = "cycl/kb-indexing.lisp", position = 6165) 
  public static final SubLObject key_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = simple_indexing.simple_key_gaf_arg_index(ass, keys_accum, v_term, argnum, pred);
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_gaf_arg_subindex(v_term, argnum, pred, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** Return T iff TERM, ARGNUM, PREDICATE and MT 
   are valid keys for the :GAF-ARG INDEX. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 7339) 
  public static final SubLObject gaf_arg_index_key_validator(SubLObject v_term, SubLObject argnum, SubLObject predicate, SubLObject mt) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((predicate == UNPROVIDED)) {
      predicate = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != kb_indexing_datastructures.indexed_term_p(v_term))
           && ((NIL == argnum)
            || (NIL != subl_promotions.positive_integer_p(argnum)))
           && ((NIL == predicate)
            || (NIL != forts.fort_p(predicate)))
           && ((NIL == mt)
            || (NIL != hlmt.hlmt_p(mt)))));
  }

  /** Return the subindex at TERM ARGNUM PRED MT.
   Return NIL if none present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 7801) 
  public static final SubLObject get_gaf_arg_subindex(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return get_subindex(v_term, list($kw18$GAF_ARG, argnum, pred, mt));
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 8012) 
  public static final SubLObject add_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject assertion) {
    return term_add_indexing_leaf(v_term, list($kw18$GAF_ARG, argnum, pred, mt), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 8181) 
  public static final SubLObject rem_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject assertion) {
    return term_rem_indexing_leaf(v_term, list($kw18$GAF_ARG, argnum, pred, mt), assertion);
  }

  /** Return the number of #$termOfUnit gafs indexed off of TERM ARGNUM FUNC. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 8328) 
  public static final SubLObject num_nart_arg_index(SubLObject v_term, SubLObject argnum, SubLObject func) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((func == UNPROVIDED)) {
      func = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_nart_arg_index(ass, v_term, argnum, func))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = get_nart_arg_subindex(v_term, argnum, func);
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  /** Return a list of the keys to the next index level below TERM ARGNUM FUNC. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 9509) 
  public static final SubLObject key_nart_arg_index(SubLObject v_term, SubLObject argnum, SubLObject func) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((func == UNPROVIDED)) {
      func = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = simple_indexing.simple_key_nart_arg_index(ass, keys_accum, v_term, argnum, func);
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_nart_arg_subindex(v_term, argnum, func);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** Return the subindex at TERM ARGNUM FUNC MT.
   Return NIL if none present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 10452) 
  public static final SubLObject get_nart_arg_subindex(SubLObject v_term, SubLObject argnum, SubLObject func) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((func == UNPROVIDED)) {
      func = NIL;
    }
    return get_subindex(v_term, list($kw26$NART_ARG, argnum, func));
  }

  /** Return the assertion count at PRED MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 10982) 
  public static final SubLObject num_predicate_extent_index(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_predicate_extent_index(ass, pred, mt))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = get_predicate_extent_subindex(pred, mt);
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  public static final class $num_predicate_extent_index$UnaryFunction extends UnaryFunction {
    public $num_predicate_extent_index$UnaryFunction() { super(extractFunctionNamed("NUM-PREDICATE-EXTENT-INDEX")); }
    public SubLObject processItem(SubLObject arg1) { return num_predicate_extent_index(arg1, UNPROVIDED); }
  }

  public static final class $num_predicate_extent_index$BinaryFunction extends BinaryFunction {
    public $num_predicate_extent_index$BinaryFunction() { super(extractFunctionNamed("NUM-PREDICATE-EXTENT-INDEX")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return num_predicate_extent_index(arg1, arg2); }
  }

  /** Compute the assertion count at relevant mts under PRED.
@param CUTOFF non-negative-integer-p; a number beyond which to stop counting relevant
assertions and just return CUTOFF. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 11552) 
  public static final SubLObject relevant_num_predicate_extent_index_with_cutoff(SubLObject pred, SubLObject cutoff) {
    checkType(cutoff, $sym1$NON_NEGATIVE_INTEGER_P);
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != all_mt_subindex_keys_relevant_p())) {
        num = num_predicate_extent_index(pred, UNPROVIDED);
        if ((NIL != kb_indexing_macros.number_has_reached_cutoffP(num, cutoff))) {
          num = cutoff;
        }
      } else {
        if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
          {
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
              if ((NIL == kb_indexing_macros.number_has_reached_cutoffP(num, cutoff))) {
                if ((NIL != simple_indexing.matches_predicate_extent_index(ass, pred, UNPROVIDED))) {
                  if ((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                    num = Numbers.add(num, ONE_INTEGER);
                  }
                }
              }
            }
          }
        } else {
          {
            SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (good_key_count.numE(Numbers.subtract(ONE_INTEGER, ONE_INTEGER))) {
              {
                SubLObject mt_subindex = get_predicate_extent_subindex(pred, UNPROVIDED);
                if ((NIL != mt_subindex)) {
                  num = relevant_mt_subindex_count_with_cutoff(mt_subindex, cutoff);
                }
              }
            } else {
              {
                SubLObject good_keys = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4722");
                SubLObject next_level_keys = Functions.apply($sym30$KEY_PREDICATE_EXTENT_INDEX, pred, good_keys);
                SubLObject cdolist_list_var = next_level_keys;
                SubLObject next_key = NIL;
                for (next_key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), next_key = cdolist_list_var.first()) {
                  num = Numbers.add(num, Functions.apply($sym34$RELEVANT_NUM_PREDICATE_EXTENT_INDEX_WITH_CUTOFF, pred, new SubLObject[] {cutoff, ConsesLow.append(good_keys, list(next_key))}));
                }
              }
            }
          }
        }
      }
      return num;
    }
  }

  /** Return a list of the keys to the next predicate-extent index level below PRED. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 12138) 
  public static final SubLObject key_predicate_extent_index(SubLObject pred) {
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30241");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_predicate_extent_subindex(pred, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 12636) 
  public static final SubLObject predicate_extent_top_level_key() {
    return $kw36$PREDICATE_EXTENT;
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 12728) 
  public static final SubLObject add_predicate_extent_index(SubLObject pred, SubLObject mt, SubLObject assertion) {
    return term_add_indexing_leaf(pred, list(predicate_extent_top_level_key(), mt), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 12884) 
  public static final SubLObject rem_predicate_extent_index(SubLObject pred, SubLObject mt, SubLObject assertion) {
    return term_rem_indexing_leaf(pred, list(predicate_extent_top_level_key(), mt), assertion);
  }

  /** @return nil or subindex-p; Return the subindex at PRED MT, or NIL if none present */
  @SubL(source = "cycl/kb-indexing.lisp", position = 13040) 
  public static final SubLObject get_predicate_extent_subindex(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return get_subindex(pred, list(predicate_extent_top_level_key(), mt));
  }

  /** Return the raw assertion count at PRED SENSE MT DIRECTION. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 14991) 
  public static final SubLObject num_predicate_rule_index(SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_predicate_rule_index(ass, pred, sense, mt, direction))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = get_predicate_rule_subindex(pred, sense, mt, direction);
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  /** Return the raw assertion count at relevant mts under PRED SENSE. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 15358) 
  public static final SubLObject relevant_num_predicate_rule_index(SubLObject pred, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != all_mt_subindex_keys_relevant_p())) {
        num = num_predicate_rule_index(pred, sense, UNPROVIDED, UNPROVIDED);
      } else {
        if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
          {
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
              if ((NIL != simple_indexing.matches_predicate_rule_index(ass, pred, sense, UNPROVIDED, UNPROVIDED))) {
                if ((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                  num = Numbers.add(num, ONE_INTEGER);
                }
              }
            }
          }
        } else {
          {
            SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(sense, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (good_key_count.numE(Numbers.subtract(TWO_INTEGER, ONE_INTEGER))) {
              {
                SubLObject mt_subindex = get_predicate_rule_subindex(pred, sense, UNPROVIDED, UNPROVIDED);
                if ((NIL != mt_subindex)) {
                  num = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12809");
                }
              }
            } else {
              {
                SubLObject good_keys = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4724");
                SubLObject next_level_keys = Functions.apply($sym46$KEY_PREDICATE_RULE_INDEX, pred, good_keys);
                SubLObject cdolist_list_var = next_level_keys;
                SubLObject next_key = NIL;
                for (next_key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), next_key = cdolist_list_var.first()) {
                  num = Numbers.add(num, Functions.apply($sym47$RELEVANT_NUM_PREDICATE_RULE_INDEX, pred, ConsesLow.append(good_keys, list(next_key))));
                }
              }
            }
          }
        }
      }
      return num;
    }
  }

  /** Return a list of the keys to the next index level below PRED SENSE MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 16054) 
  public static final SubLObject key_predicate_rule_index(SubLObject pred, SubLObject sense, SubLObject mt) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30242");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_predicate_rule_subindex(pred, sense, mt, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing.lisp", position = 16576) 
  public static final SubLObject get_predicate_rule_subindex(SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return get_subindex(pred, list($kw51$PREDICATE_RULE, sense, mt, direction));
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 16774) 
  public static final SubLObject add_predicate_rule_index(SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction, SubLObject assertion) {
    return term_add_indexing_leaf(pred, list($kw51$PREDICATE_RULE, sense, mt, direction), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 16965) 
  public static final SubLObject rem_predicate_rule_index(SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction, SubLObject assertion) {
    return term_rem_indexing_leaf(pred, list($kw51$PREDICATE_RULE, sense, mt, direction), assertion);
  }

  /** Return a list of the keys to the next index level below PRED SENSE. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 17597) 
  public static final SubLObject key_decontextualized_ist_predicate_rule_index(SubLObject pred, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(pred))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(pred);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30235");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_decontextualized_ist_predicate_rule_subindex(pred, sense, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing.lisp", position = 17892) 
  public static final SubLObject get_decontextualized_ist_predicate_rule_subindex(SubLObject pred, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return get_subindex(pred, list($kw58$DECONTEXTUALIZED_IST_PREDICATE_RULE, sense, direction));
  }

  /** Return a list of the keys to the next index level below COL SENSE MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 19558) 
  public static final SubLObject key_isa_rule_index(SubLObject col, SubLObject sense, SubLObject mt) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(col))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30239");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_isa_rule_subindex(col, sense, mt, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing.lisp", position = 20050) 
  public static final SubLObject get_isa_rule_subindex(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return get_subindex(col, list($kw67$ISA_RULE, sense, mt, direction));
  }

  /** Return the raw assertion count at COL SENSE MT DIRECTION. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 20566) 
  public static final SubLObject num_quoted_isa_rule_index(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(col))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_quoted_isa_rule_index(ass, col, sense, mt, direction))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12741");
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  /** Return the raw assertion count at COL SENSE MT DIRECTION. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 22693) 
  public static final SubLObject num_genls_rule_index(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(col))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_genls_rule_index(ass, col, sense, mt, direction))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = get_genls_rule_subindex(col, sense, mt, direction);
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  /** Return a list of the keys to the next index level below COL SENSE MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 23711) 
  public static final SubLObject key_genls_rule_index(SubLObject col, SubLObject sense, SubLObject mt) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(col))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30238");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_genls_rule_subindex(col, sense, mt, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing.lisp", position = 24211) 
  public static final SubLObject get_genls_rule_subindex(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return get_subindex(col, list($kw77$GENLS_RULE, sense, mt, direction));
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 24399) 
  public static final SubLObject add_genls_rule_index(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction, SubLObject assertion) {
    return term_add_indexing_leaf(col, list($kw77$GENLS_RULE, sense, mt, direction), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 24580) 
  public static final SubLObject rem_genls_rule_index(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction, SubLObject assertion) {
    return term_rem_indexing_leaf(col, list($kw77$GENLS_RULE, sense, mt, direction), assertion);
  }

  /** Return a list of the keys to the next index level below COL SENSE MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 25772) 
  public static final SubLObject key_genl_mt_rule_index(SubLObject col, SubLObject sense, SubLObject mt) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(col))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(col);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30237");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_genl_mt_rule_subindex(col, sense, mt, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing.lisp", position = 26280) 
  public static final SubLObject get_genl_mt_rule_subindex(SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return get_subindex(col, list($kw82$GENL_MT_RULE, sense, mt, direction));
  }

  /** Return a list of the keys to the next index level below FUNC MT. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 27800) 
  public static final SubLObject key_function_rule_index(SubLObject func, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject keys = NIL;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(func))) {
        {
          SubLObject keys_accum = NIL;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(func);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            keys_accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30236");
          }
          keys = keys_accum;
        }
      } else {
        {
          SubLObject next_level_subindex = get_function_rule_subindex(func, mt, UNPROVIDED);
          keys = ((NIL != kb_indexing_datastructures.intermediate_index_p(next_level_subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(next_level_subindex)) : NIL);
        }
      }
      return keys;
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing.lisp", position = 28272) 
  public static final SubLObject get_function_rule_subindex(SubLObject func, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return get_subindex(func, list(function_rule_top_level_key(), mt, direction));
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 28825) 
  public static final SubLObject function_rule_top_level_key() {
    return $kw91$FUNCTION_RULE;
  }

  /** Return the raw assertion count at relevant mts under RULE. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 31505) 
  public static final SubLObject relevant_num_pragma_rule_index(SubLObject rule) {
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != all_mt_subindex_keys_relevant_p())) {
        num = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12801");
      } else {
        if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(rule))) {
          {
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(rule);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
              if ((NIL != simple_indexing.matches_pragma_rule_index(ass, rule, UNPROVIDED, UNPROVIDED))) {
                if ((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                  num = Numbers.add(num, ONE_INTEGER);
                }
              }
            }
          }
        } else {
          {
            SubLObject good_key_count = kb_indexing_macros.number_of_non_null_args_in_order(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (good_key_count.numE(Numbers.subtract(ONE_INTEGER, ONE_INTEGER))) {
              {
                SubLObject mt_subindex = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12737");
                if ((NIL != mt_subindex)) {
                  num = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12816");
                }
              }
            } else {
              {
                SubLObject good_keys = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4745");
                SubLObject next_level_keys = Functions.apply($sym102$KEY_PRAGMA_RULE_INDEX, rule, good_keys);
                SubLObject cdolist_list_var = next_level_keys;
                SubLObject next_key = NIL;
                for (next_key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), next_key = cdolist_list_var.first()) {
                  num = Numbers.add(num, Functions.apply($sym103$RELEVANT_NUM_PRAGMA_RULE_INDEX, rule, ConsesLow.append(good_keys, list(next_key))));
                }
              }
            }
          }
        }
      }
      return num;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 35640) 
  public static final SubLObject add_mt_index(SubLObject v_term, SubLObject assertion) {
    if ((NIL == broad_mtP(v_term))) {
      add_mt_index_internal(v_term, assertion);
    }
    return assertion;
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 35800) 
  public static final SubLObject rem_mt_index(SubLObject v_term, SubLObject assertion) {
    if ((NIL == broad_mtP(v_term))) {
      rem_mt_index_internal(v_term, assertion);
    }
    return assertion;
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 35938) 
  public static final SubLObject add_mt_index_internal(SubLObject v_term, SubLObject assertion) {
    return term_add_indexing_leaf(v_term, list(mt_top_level_key()), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 36113) 
  public static final SubLObject rem_mt_index_internal(SubLObject v_term, SubLObject assertion) {
    return term_rem_indexing_leaf(v_term, list(mt_top_level_key()), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 36282) 
  public static final SubLObject mt_top_level_key() {
    return $kw112$IST;
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 36333) 
  public static final SubLObject broad_mtP(SubLObject mt) {
    {
      SubLObject monad = hlmt.hlmt_monad_mt(mt);
      SubLObject result = NIL;
      if ((NIL != forts.fort_p(monad))) {
        result = fort_types_interface.broad_microtheory_p(monad);
      }
      return result;
    }
  }

  /** Return the number of assertions at the other index for TERM. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 37391) 
  public static final SubLObject num_other_index(SubLObject v_term) {
    {
      SubLObject num = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(v_term);
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != simple_indexing.matches_other_index(ass, v_term))) {
              count = Numbers.add(count, ONE_INTEGER);
            }
          }
          num = count;
        }
      } else {
        {
          SubLObject subindex = get_other_subindex(v_term);
          num = ((NIL != subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(subindex)) : ZERO_INTEGER);
        }
      }
      return num;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 39376) 
  public static final SubLObject get_other_subindex(SubLObject v_term) {
    return kb_indexing_datastructures.term_complex_index_lookup(v_term, other_top_level_key());
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 39499) 
  public static final SubLObject add_other_index(SubLObject v_term, SubLObject assertion) {
    return term_add_indexing_leaf(v_term, list(other_top_level_key()), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 39649) 
  public static final SubLObject rem_other_index(SubLObject v_term, SubLObject assertion) {
    return term_rem_indexing_leaf(v_term, list(other_top_level_key()), assertion);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 39783) 
  public static final SubLObject other_top_level_key() {
    return $kw116$OTHER;
  }

  /** The total number of assertions indexed from TERM. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 39839) 
  public static final SubLObject num_index(SubLObject v_term) {
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      return kb_indexing_datastructures.simple_num_index(v_term);
    } else {
      return kb_indexing_datastructures.complex_index_leaf_count(kb_indexing_datastructures.term_index(v_term));
    }
  }

  public static final class $num_index$UnaryFunction extends UnaryFunction {
    public $num_index$UnaryFunction() { super(extractFunctionNamed("NUM-INDEX")); }
    public SubLObject processItem(SubLObject arg1) { return num_index(arg1); }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 43665) 
  public static final SubLObject add_assertion_indices(SubLObject assertion, SubLObject v_term) {
    if ((v_term == UNPROVIDED)) {
      v_term = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym123$ASSERTION_P);
      {
        SubLObject _prev_bind_0 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
        SubLObject _prev_bind_1 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
        try {
          simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind(T, thread);
          simple_indexing.$terms_to_toggle_indexing_mode$.bind(NIL, thread);
          if ((NIL != assertion_handles.valid_assertion_handleP(assertion))) {
            if ((NIL != assertions_interface.kb_gaf_assertionP(assertion))) {
              add_gaf_indices(assertion, v_term);
            } else {
              add_rule_indices(assertion, v_term);
            }
          }
          if ((NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread))) {
            simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
          }
        } finally {
          simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1, thread);
          simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 44100) 
  public static final SubLObject remove_assertion_indices(SubLObject assertion, SubLObject v_term) {
    if ((v_term == UNPROVIDED)) {
      v_term = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym123$ASSERTION_P);
      {
        SubLObject _prev_bind_0 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
        SubLObject _prev_bind_1 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
        try {
          simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind(T, thread);
          simple_indexing.$terms_to_toggle_indexing_mode$.bind(NIL, thread);
          if ((NIL != assertions_high.gaf_assertionP(assertion))) {
            remove_gaf_indices(assertion, v_term);
          } else {
            remove_rule_indices(assertion, v_term);
          }
          if ((NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread))) {
            simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
          }
        } finally {
          simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1, thread);
          simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0, thread);
        }
      }
      return assertion;
    }
  }

  /** Remove all assertions about TERM from the KB. Return the TERM. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 44398) 
  public static final SubLObject remove_term_indices(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = Errors.$ignore_warnsP$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym106$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const107$EverythingPSC, thread);
          Errors.$ignore_warnsP$.bind(T, thread);
          tms.tms_remove_assertion_list(kb_mapping.gather_other_index(v_term));
          if ((NIL != hlmt.hlmt_p(v_term))) {
            tms.tms_remove_assertion_list(kb_mapping.gather_mt_index(v_term));
          }
          tms.tms_remove_assertion_list(kb_mapping.gather_predicate_rule_index(v_term, $kw124$POS, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_predicate_rule_index(v_term, $kw125$NEG, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_decontextualized_ist_predicate_rule_index(v_term, $kw124$POS, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_decontextualized_ist_predicate_rule_index(v_term, $kw125$NEG, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_isa_rule_index(v_term, $kw125$NEG, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_isa_rule_index(v_term, $kw124$POS, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_quoted_isa_rule_index(v_term, $kw125$NEG, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_quoted_isa_rule_index(v_term, $kw124$POS, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_genls_rule_index(v_term, $kw125$NEG, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_genls_rule_index(v_term, $kw124$POS, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_genl_mt_rule_index(v_term, $kw125$NEG, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_genl_mt_rule_index(v_term, $kw124$POS, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_function_rule_index(v_term, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_exception_rule_index(v_term, UNPROVIDED, UNPROVIDED));
          tms.tms_remove_assertion_list(kb_mapping.gather_pragma_rule_index(v_term, UNPROVIDED, UNPROVIDED));
          if ((NIL != forts.fort_p(v_term))) {
            tms.tms_remove_assertion_list(kb_mapping.gather_predicate_extent_index(v_term, NIL, NIL));
            tms.tms_remove_assertion_list(kb_mapping.gather_function_extent_index(v_term));
          }
          {
            SubLObject nart_indexed_argnums = key_nart_arg_index(v_term, UNPROVIDED, UNPROVIDED);
            nart_indexed_argnums = Sort.sort(nart_indexed_argnums, Symbols.symbol_function($sym126$_), UNPROVIDED);
            {
              SubLObject cdolist_list_var = nart_indexed_argnums;
              SubLObject argnum = NIL;
              for (argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argnum = cdolist_list_var.first()) {
                tms.tms_remove_assertion_list(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9445"));
              }
            }
          }
          {
            SubLObject gaf_indexed_argnums = key_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
            gaf_indexed_argnums = Sort.sort(gaf_indexed_argnums, Symbols.symbol_function($sym126$_), UNPROVIDED);
            {
              SubLObject cdolist_list_var = gaf_indexed_argnums;
              SubLObject argnum = NIL;
              for (argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argnum = cdolist_list_var.first()) {
                if ((!(ONE_INTEGER.numE(argnum)))) {
                  tms.tms_remove_assertion_list(kb_mapping.gather_gaf_arg_index(v_term, argnum, NIL, NIL, NIL));
                }
              }
            }
          }
          {
            SubLObject isa_assertions = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $const127$isa, NIL, NIL);
            SubLObject genls_assertions = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $const128$genls, NIL, NIL);
            SubLObject tou_assertions = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $const129$termOfUnit, NIL, NIL);
            SubLObject arg1_assertions = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, NIL, NIL, NIL);
            SubLObject cdolist_list_var = arg1_assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
              if ((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED))) {
                if ((!(((NIL != subl_promotions.memberP(assertion, isa_assertions, UNPROVIDED, UNPROVIDED))
                      || (NIL != conses_high.member(assertion, genls_assertions, UNPROVIDED, UNPROVIDED))
                      || (NIL != conses_high.member(assertion, tou_assertions, UNPROVIDED, UNPROVIDED)))))) {
                  tms.tms_remove_assertion(assertion);
                }
              }
            }
            tms.tms_remove_assertion_list(genls_assertions);
            tms.tms_remove_assertion_list(isa_assertions);
            tms.tms_remove_assertion_list(tou_assertions);
          }
          {
            SubLObject remaining_assertions = kb_accessors.all_term_assertions(v_term, T);
            if ((NIL != remaining_assertions)) {
              Errors.warn($str130$indexing_problem_while_removing__, v_term);
            }
            tms.tms_remove_assertion_list(remaining_assertions);
          }
        } finally {
          Errors.$ignore_warnsP$.rebind(_prev_bind_2, thread);
          mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
      }
      return v_term;
    }
  }

  /** @return 0 alist-p; a list of (argnum . term) pairs
   @return 1 listp; a list of terms not indexed by any other argnum */
  @SubL(source = "cycl/kb-indexing.lisp", position = 48138) 
  public static final SubLObject determine_formula_indices(SubLObject formula) {
    formula = el_utilities.ignore_sequence_vars(formula);
    {
      SubLObject others = NIL;
      SubLObject pairs = NIL;
      SubLObject terms = cycl_utilities.formula_terms(formula, $kw134$IGNORE);
      SubLObject list_var = NIL;
      SubLObject arg = NIL;
      SubLObject argnum = NIL;
      for (list_var = terms, arg = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
        if ((NIL != kb_indexing_datastructures.valid_indexed_termP(arg))) {
          {
            SubLObject pair = cons(argnum, arg);
            pairs = cons(pair, pairs);
          }
        } else {
          others = conses_high.nunion(list_utilities.tree_gather(arg, Symbols.symbol_function($sym135$VALID_FULLY_INDEXED_TERM_P), UNPROVIDED, UNPROVIDED, UNPROVIDED), others, UNPROVIDED, UNPROVIDED);
        }
      }
      if ((NIL != others)) {
        others = list_utilities.fast_delete_duplicates(others, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        {
          SubLObject filtered_others = NIL;
          SubLObject cdolist_list_var = others;
          SubLObject other = NIL;
          for (other = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), other = cdolist_list_var.first()) {
            if ((NIL == subl_promotions.memberP(other, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function($sym136$CDR)))) {
              filtered_others = cons(other, filtered_others);
            }
          }
          others = filtered_others;
        }
      }
      return Values.values(Sequences.nreverse(pairs), others);
    }
  }

  /** @return 0 alist-p; a list of (argnum . term) pairs
   @return 1 listp; a list of terms not indexed by any other argnum */
  @SubL(source = "cycl/kb-indexing.lisp", position = 49177) 
  public static final SubLObject determine_gaf_indices(SubLObject formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject argnum_pairs = determine_formula_indices(formula);
        SubLObject others = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != forts.fort_p(mt))) {
        } else {
          others = conses_high.nunion(cycl_utilities.formula_gather(mt, $sym137$FULLY_INDEXED_HLMT_TERM_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), others, UNPROVIDED, UNPROVIDED);
        }
        return Values.values(argnum_pairs, others);
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 49768) 
  public static final SubLObject add_gaf_indices(SubLObject assertion, SubLObject v_term) {
    if ((v_term == UNPROVIDED)) {
      v_term = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject literal = assertions_high.gaf_formula(assertion);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        thread.resetMultipleValues();
        {
          SubLObject alist = determine_gaf_indices(literal, mt);
          SubLObject others = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject pred = conses_high.assoc(ZERO_INTEGER, alist, UNPROVIDED, UNPROVIDED).rest();
            if ((!(((NIL != hlmt.hlmt_p(mt))
                   && (NIL != forts.fort_p(pred)))))) {
              Errors.cerror($str138$So_don_t_, $str139$Don_t_know_how_to_index__S, assertion);
              return NIL;
            }
            if (((NIL == v_term)
                || (NIL != hlmt.hlmt_equal(v_term, mt)))) {
              add_mt_index(mt, assertion);
            }
            if (((NIL == v_term)
                || (v_term == pred))) {
              add_predicate_extent_index(pred, mt, assertion);
            }
            {
              SubLObject cdolist_list_var = alist;
              SubLObject pair = NIL;
              for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
                {
                  SubLObject datum = pair;
                  SubLObject current = datum;
                  SubLObject argnum = NIL;
                  SubLObject arg = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
                  argnum = current.first();
                  current = current.rest();
                  arg = current;
                  if ((argnum.isPositive()
                       && (NIL != arg)
                       && ((NIL == v_term)
                        || v_term.equal(arg)))) {
                    add_gaf_arg_index(arg, argnum, pred, mt, assertion);
                  }
                }
              }
            }
            if ((pred == $const129$termOfUnit)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12694");
            } else {
              if ((NIL != others)) {
                {
                  SubLObject cdolist_list_var = others;
                  SubLObject fort = NIL;
                  for (fort = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), fort = cdolist_list_var.first()) {
                    if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(fort))
                         && ((NIL == v_term)
                          || v_term.equal(fort)))) {
                      add_other_index(fort, assertion);
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

  @SubL(source = "cycl/kb-indexing.lisp", position = 50996) 
  public static final SubLObject remove_gaf_indices(SubLObject assertion, SubLObject v_term) {
    if ((v_term == UNPROVIDED)) {
      v_term = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject literal = assertions_high.gaf_formula(assertion);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        thread.resetMultipleValues();
        {
          SubLObject alist = determine_gaf_indices(literal, mt);
          SubLObject others = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject pred = conses_high.assoc(ZERO_INTEGER, alist, UNPROVIDED, UNPROVIDED).rest();
            if ((!(((NIL != hlmt.hlmt_p(mt))
                   && (NIL != forts.fort_p(pred)))))) {
              Errors.cerror($str138$So_don_t_, $str139$Don_t_know_how_to_index__S, assertion);
              return NIL;
            }
            if (((NIL == v_term)
                || (NIL != hlmt.hlmt_equal(v_term, mt)))) {
              rem_mt_index(mt, assertion);
            }
            if (((NIL == v_term)
                || (v_term == pred))) {
              rem_predicate_extent_index(pred, mt, assertion);
            }
            {
              SubLObject cdolist_list_var = alist;
              SubLObject pair = NIL;
              for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
                {
                  SubLObject datum = pair;
                  SubLObject current = datum;
                  SubLObject argnum = NIL;
                  SubLObject arg = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
                  argnum = current.first();
                  current = current.rest();
                  arg = current;
                  if ((argnum.isPositive()
                       && (NIL != arg)
                       && ((NIL == v_term)
                        || v_term.equal(arg)))) {
                    rem_gaf_arg_index(arg, argnum, pred, mt, assertion);
                  }
                }
              }
            }
            if ((pred == $const129$termOfUnit)) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12831");
            } else {
              if ((NIL != others)) {
                {
                  SubLObject cdolist_list_var = others;
                  SubLObject fort = NIL;
                  for (fort = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), fort = cdolist_list_var.first()) {
                    if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(fort))
                         && ((NIL == v_term)
                          || v_term.equal(fort)))) {
                      rem_other_index(fort, assertion);
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

  /** @return 0 a list of pairs.  The first element of each pair
   is the type of indexing: :pred, :ist-pred, :func, :isa, :genls, :genl-mt, :exception, or :pragma.
   and the second element of each pair is the term to be
   indexed with that type of indexing.
   @return 1 a list of terms to be potentially indexed via 'other' indexing. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 54745) 
  public static final SubLObject determine_rule_indices_int(SubLObject asents, SubLObject sense) {
    {
      SubLObject pairs = NIL;
      SubLObject other = NIL;
      SubLObject cdolist_list_var = asents;
      SubLObject asent = NIL;
      for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
        {
          SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
          if ((pred == $const127$isa)) {
            {
              SubLObject collection = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != forts.fort_p(collection))) {
                {
                  SubLObject item_var = list($kw142$ISA, collection);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const127$isa);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if ((pred == $const144$quotedIsa)) {
            {
              SubLObject collection = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != forts.fort_p(collection))) {
                {
                  SubLObject item_var = list($kw145$QUOTED_ISA, collection);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const144$quotedIsa);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if ((pred == $const128$genls)) {
            {
              SubLObject collection = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != forts.fort_p(collection))) {
                {
                  SubLObject item_var = list($kw146$GENLS, collection);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const128$genls);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if ((pred == $const147$genlMt)) {
            {
              SubLObject genl_mt = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != hlmt.hlmt_p(genl_mt))) {
                {
                  SubLObject item_var = list($kw148$GENL_MT, genl_mt);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const147$genlMt);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if (((sense == $kw125$NEG)
               && (pred == $const129$termOfUnit))) {
            {
              SubLObject naut = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != el_utilities.possibly_naut_p(naut))) {
                {
                  SubLObject function = cycl_utilities.nat_functor(naut);
                  if ((NIL != forts.fort_p(function))) {
                    {
                      SubLObject item_var = list($kw149$FUNC, function);
                      if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                        pairs = cons(item_var, pairs);
                      }
                    }
                  } else {
                    {
                      SubLObject item_var = list($kw143$PRED, $const129$termOfUnit);
                      if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                        pairs = cons(item_var, pairs);
                      }
                    }
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const129$termOfUnit);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if (((sense == $kw124$POS)
               && (pred == $const150$abnormal))) {
            {
              SubLObject assertion = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != assertion_handles.assertion_p(assertion))) {
                {
                  SubLObject item_var = list($kw151$EXCEPTION, assertion);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const150$abnormal);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if (((sense == $kw124$POS)
               && (pred == $const152$meetsPragmaticRequirement))) {
            {
              SubLObject assertion = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              if ((NIL != assertion_handles.assertion_p(assertion))) {
                {
                  SubLObject item_var = list($kw153$PRAGMA, assertion);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              } else {
                {
                  SubLObject item_var = list($kw143$PRED, $const152$meetsPragmaticRequirement);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if ((pred == $const154$ist)) {
            {
              SubLObject sub_sentence = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
              SubLObject sub_pred = el_utilities.literal_predicate(sub_sentence, UNPROVIDED);
              if ((NIL != forts.fort_p(sub_pred))) {
                {
                  SubLObject item_var = list($kw155$IST_PRED, sub_pred);
                  if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                    pairs = cons(item_var, pairs);
                  }
                }
              }
            }
          } else if ((NIL != forts.fort_p(pred))) {
            {
              SubLObject item_var = list($kw143$PRED, pred);
              if ((NIL == conses_high.member(item_var, pairs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY)))) {
                pairs = cons(item_var, pairs);
              }
            }
          }
        }
        other = conses_high.nunion(other, list_utilities.tree_gather(cycl_utilities.sentence_args(asent, UNPROVIDED), Symbols.symbol_function($sym156$FULLY_INDEXED_TERM_P), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
      }
      return Values.values(pairs, other);
    }
  }

  /** @return 0 a list of pairs.  The first element of each pair
   is the type of indexing: :pred, :func, :isa, :genls, :genl-mt, :exception, or :pragma.
   and the second element of each pair is the term to be
   indexed with that type of indexing.  All these pairs occurred
   as neg-lits in CNF.
   @return 1 a list of pairs that occurred as pos-lits in CNF.
   @return 2 a list of terms to be indexed via 'other' indexing. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 57665) 
  public static final SubLObject determine_rule_indices(SubLObject cnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject neg_pairs = determine_rule_indices_int(clauses.neg_lits(cnf), $kw125$NEG);
        SubLObject neg_other = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        {
          SubLObject pos_pairs = determine_rule_indices_int(clauses.pos_lits(cnf), $kw124$POS);
          SubLObject pos_other = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject neg_terms = Mapping.mapcar(Symbols.symbol_function($sym157$SECOND), neg_pairs);
            SubLObject pos_terms = Mapping.mapcar(Symbols.symbol_function($sym157$SECOND), pos_pairs);
            SubLObject other = list_utilities.fast_delete_duplicates(conses_high.nunion(neg_other, pos_other, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            other = conses_high.nset_difference(conses_high.nset_difference(other, neg_terms, UNPROVIDED, UNPROVIDED), pos_terms, UNPROVIDED, UNPROVIDED);
            return Values.values(neg_pairs, pos_pairs, other);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 58629) 
  public static final SubLObject add_rule_indices(SubLObject assertion, SubLObject v_term) {
    if ((v_term == UNPROVIDED)) {
      v_term = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject dir = assertions_high.assertion_direction(assertion);
        thread.resetMultipleValues();
        {
          SubLObject neg_pairs = determine_rule_indices(cnf);
          SubLObject pos_pairs = thread.secondMultipleValue();
          SubLObject other = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject cdolist_list_var = neg_pairs;
            SubLObject neg_pair = NIL;
            for (neg_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), neg_pair = cdolist_list_var.first()) {
              {
                SubLObject datum = neg_pair;
                SubLObject current = datum;
                SubLObject neg_indexing_type = NIL;
                SubLObject neg_term = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list158);
                neg_indexing_type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list158);
                neg_term = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(neg_term))
                       && ((NIL == v_term)
                        || neg_term.equal(v_term)))) {
                    {
                      SubLObject pcase_var = neg_indexing_type;
                      if (pcase_var.eql($kw143$PRED)) {
                        add_predicate_rule_index(neg_term, $kw125$NEG, mt, dir, assertion);
                      } else if (pcase_var.eql($kw155$IST_PRED)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12690");
                      } else if (pcase_var.eql($kw149$FUNC)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12695");
                      } else if (pcase_var.eql($kw142$ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12698");
                      } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12701");
                      } else if (pcase_var.eql($kw146$GENLS)) {
                        add_genls_rule_index(neg_term, $kw125$NEG, mt, dir, assertion);
                      } else if (pcase_var.eql($kw148$GENL_MT)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12696");
                      } else if (pcase_var.eql($kw153$PRAGMA)) {
                        Errors.cerror($str138$So_don_t_, $str159$Can_t_index_a_pragmatic_requireme, assertion);
                      } else if (pcase_var.eql($kw151$EXCEPTION)) {
                        Errors.cerror($str138$So_don_t_, $str160$Can_t_index_an_exception_as_a_neg, assertion);
                      } else {
                        Errors.cerror($str138$So_don_t_, $str161$Don_t_know_how_to_handle_indexing, neg_indexing_type);
                      }
                    }
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list158);
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = pos_pairs;
            SubLObject pos_pair = NIL;
            for (pos_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pos_pair = cdolist_list_var.first()) {
              {
                SubLObject datum = pos_pair;
                SubLObject current = datum;
                SubLObject pos_indexing_type = NIL;
                SubLObject pos_term = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list162);
                pos_indexing_type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list162);
                pos_term = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(pos_term))
                       && ((NIL == v_term)
                        || pos_term.equal(v_term)))) {
                    {
                      SubLObject pcase_var = pos_indexing_type;
                      if (pcase_var.eql($kw143$PRED)) {
                        add_predicate_rule_index(pos_term, $kw124$POS, mt, dir, assertion);
                      } else if (pcase_var.eql($kw155$IST_PRED)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12691");
                      } else if (pcase_var.eql($kw142$ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12699");
                      } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12702");
                      } else if (pcase_var.eql($kw146$GENLS)) {
                        add_genls_rule_index(pos_term, $kw124$POS, mt, dir, assertion);
                      } else if (pcase_var.eql($kw148$GENL_MT)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12697");
                      } else if (pcase_var.eql($kw153$PRAGMA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12700");
                      } else if (pcase_var.eql($kw151$EXCEPTION)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12692");
                      } else if (pcase_var.eql($kw149$FUNC)) {
                        Errors.cerror($str138$So_don_t_, $str163$Can_t_index_a_function_rule_as_a_, assertion);
                      } else {
                        Errors.cerror($str138$So_don_t_, $str161$Don_t_know_how_to_handle_indexing, pos_indexing_type);
                      }
                    }
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list162);
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = other;
            SubLObject other_term = NIL;
            for (other_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), other_term = cdolist_list_var.first()) {
              if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(other_term))
                   && ((NIL == v_term)
                    || other_term.equal(v_term)))) {
                add_other_index(other_term, assertion);
              }
            }
          }
          if (((NIL != hlmt.hlmt_p(mt))
               && ((NIL == v_term)
                || (NIL != hlmt.hlmt_equal(mt, v_term))))) {
            add_mt_index(mt, assertion);
          }
        }
      }
      if ((NIL == v_term)) {
        auxiliary_indexing.add_unbound_rule_indices(assertion);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 61511) 
  public static final SubLObject remove_rule_indices(SubLObject assertion, SubLObject v_term) {
    if ((v_term == UNPROVIDED)) {
      v_term = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject dir = assertions_high.assertion_direction(assertion);
        thread.resetMultipleValues();
        {
          SubLObject neg_pairs = determine_rule_indices(cnf);
          SubLObject pos_pairs = thread.secondMultipleValue();
          SubLObject other = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject cdolist_list_var = neg_pairs;
            SubLObject neg_pair = NIL;
            for (neg_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), neg_pair = cdolist_list_var.first()) {
              {
                SubLObject datum = neg_pair;
                SubLObject current = datum;
                SubLObject neg_indexing_type = NIL;
                SubLObject neg_term = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list158);
                neg_indexing_type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list158);
                neg_term = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(neg_term))
                       && ((NIL == v_term)
                        || neg_term.equal(v_term)))) {
                    {
                      SubLObject pcase_var = neg_indexing_type;
                      if (pcase_var.eql($kw143$PRED)) {
                        rem_predicate_rule_index(neg_term, $kw125$NEG, mt, dir, assertion);
                      } else if (pcase_var.eql($kw155$IST_PRED)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12827");
                      } else if (pcase_var.eql($kw142$ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12835");
                      } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12838");
                      } else if (pcase_var.eql($kw146$GENLS)) {
                        rem_genls_rule_index(neg_term, $kw125$NEG, mt, dir, assertion);
                      } else if (pcase_var.eql($kw148$GENL_MT)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12833");
                      } else if (pcase_var.eql($kw149$FUNC)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12832");
                      } else if (pcase_var.eql($kw153$PRAGMA)) {
                        Errors.cerror($str138$So_don_t_, $str164$Can_t_remove_the_index_of_a_pragm, assertion);
                      } else if (pcase_var.eql($kw151$EXCEPTION)) {
                        Errors.cerror($str138$So_don_t_, $str165$Can_t_remove_the_index_of_an_exce, assertion);
                      } else {
                        Errors.cerror($str138$So_don_t_, $str161$Don_t_know_how_to_handle_indexing, neg_indexing_type);
                      }
                    }
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list158);
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = pos_pairs;
            SubLObject pos_pair = NIL;
            for (pos_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pos_pair = cdolist_list_var.first()) {
              {
                SubLObject datum = pos_pair;
                SubLObject current = datum;
                SubLObject pos_indexing_type = NIL;
                SubLObject pos_term = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list162);
                pos_indexing_type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list162);
                pos_term = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(pos_term))
                       && ((NIL == v_term)
                        || pos_term.equal(v_term)))) {
                    {
                      SubLObject pcase_var = pos_indexing_type;
                      if (pcase_var.eql($kw143$PRED)) {
                        rem_predicate_rule_index(pos_term, $kw124$POS, mt, dir, assertion);
                      } else if (pcase_var.eql($kw155$IST_PRED)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12828");
                      } else if (pcase_var.eql($kw142$ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12836");
                      } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12839");
                      } else if (pcase_var.eql($kw146$GENLS)) {
                        rem_genls_rule_index(pos_term, $kw124$POS, mt, dir, assertion);
                      } else if (pcase_var.eql($kw148$GENL_MT)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12834");
                      } else if (pcase_var.eql($kw151$EXCEPTION)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12829");
                      } else if (pcase_var.eql($kw153$PRAGMA)) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12837");
                      } else if (pcase_var.eql($kw149$FUNC)) {
                        Errors.cerror($str138$So_don_t_, $str166$Can_t_remove_the_index_of_a_funct, assertion);
                      } else {
                        Errors.cerror($str138$So_don_t_, $str161$Don_t_know_how_to_handle_indexing, pos_indexing_type);
                      }
                    }
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list162);
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = other;
            SubLObject other_term = NIL;
            for (other_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), other_term = cdolist_list_var.first()) {
              if (((NIL != kb_indexing_datastructures.fully_indexed_term_p(other_term))
                   && ((NIL == v_term)
                    || other_term.equal(v_term)))) {
                rem_other_index(other_term, assertion);
              }
            }
          }
          if (((NIL != hlmt.hlmt_p(mt))
               && ((NIL == v_term)
                || (NIL != hlmt.hlmt_equal(mt, v_term))))) {
            rem_mt_index(mt, assertion);
          }
        }
      }
      if ((NIL == v_term)) {
        auxiliary_indexing.rem_unbound_rule_indices(assertion);
      }
      return NIL;
    }
  }

  /** Return a list of all current NARTs which are are functions of FORT,
   or which have FORT as their functor. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 69685) 
  public static final SubLObject dependent_narts(SubLObject fort) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(fort, $sym168$FORT_P);
      {
        SubLObject answer = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$tou_mt$.getGlobalValue());
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != kb_mapping_macros.do_nart_arg_index_key_validator(fort, NIL, NIL))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(fort, NIL, NIL);
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                          {
                            SubLObject done_var_9 = NIL;
                            SubLObject token_var_10 = NIL;
                            while ((NIL == done_var_9)) {
                              {
                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                SubLObject valid_11 = makeBoolean((token_var_10 != assertion));
                                if ((NIL != valid_11)) {
                                  answer = cons(assertions_high.gaf_arg1(assertion), answer);
                                }
                                done_var_9 = makeBoolean((NIL == valid_11));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
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
            if ((NIL != kb_mapping_macros.do_function_extent_index_key_validator(fort))) {
              {
                SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(fort);
                SubLObject final_index_iterator = NIL;
                try {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                  {
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        SubLObject valid = makeBoolean((token_var != assertion));
                        if ((NIL != valid)) {
                          answer = cons(assertions_high.gaf_arg1(assertion), answer);
                        }
                        done_var = makeBoolean((NIL == valid));
                      }
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      if ((NIL != final_index_iterator)) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                      }
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
                    }
                  }
                }
              }
            }
            if ((NIL != kb_mapping_macros.do_other_index_key_validator(fort, NIL))) {
              {
                SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(fort);
                SubLObject final_index_iterator = NIL;
                try {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                  {
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        SubLObject valid = makeBoolean((token_var != assertion));
                        if ((NIL != valid)) {
                          if ((NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30388"))) {
                            if (((NIL != function_terms.tou_assertionP(assertion))
                                 && (NIL != cycl_utilities.expression_find(fort, assertions_high.gaf_arg2(assertion), T, UNPROVIDED, UNPROVIDED)))) {
                              answer = cons(assertions_high.gaf_arg1(assertion), answer);
                            }
                          }
                        }
                        done_var = makeBoolean((NIL == valid));
                      }
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      if ((NIL != final_index_iterator)) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                      }
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_14, thread);
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
        return list_utilities.fast_delete_duplicates(answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  /** @return 0 keywordp; the type of indexing: :pred-neg, :pred-pos, :ist-pred-neg, :ist-pred-pos, :func, :isa-neg, :isa-pos,
     :genls-neg, :genls-pos, :genl-mt-neg, :genl-mt-pos, :exception, :pragma, or :other.
   @return 1 indexed-term-p; the term to be indexed with that type of indexing. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 71054) 
  public static final SubLObject decent_rule_index(SubLObject rule_cnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject best_type = NIL;
        SubLObject best_term = NIL;
        SubLObject best_total = Numbers.$most_positive_fixnum$.getGlobalValue();
        thread.resetMultipleValues();
        {
          SubLObject neg_pairs = determine_rule_indices(rule_cnf);
          SubLObject pos_pairs = thread.secondMultipleValue();
          SubLObject other = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject cdolist_list_var = pos_pairs;
            SubLObject pos_pair = NIL;
            for (pos_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pos_pair = cdolist_list_var.first()) {
              {
                SubLObject pos_indexing_type = pos_pair.first();
                SubLObject pos_term = conses_high.second(pos_pair);
                if ((NIL != kb_indexing_datastructures.indexed_term_p(pos_term))) {
                  {
                    SubLObject total = Numbers.$most_positive_fixnum$.getGlobalValue();
                    {
                      SubLObject pcase_var = pos_indexing_type;
                      if (pcase_var.eql($kw143$PRED)) {
                        total = num_predicate_rule_index(pos_term, $kw124$POS, UNPROVIDED, UNPROVIDED);
                      } else if (pcase_var.eql($kw155$IST_PRED)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12773");
                      } else if (pcase_var.eql($kw142$ISA)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12795");
                      } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                        total = num_quoted_isa_rule_index(pos_term, $kw124$POS, UNPROVIDED, UNPROVIDED);
                      } else if (pcase_var.eql($kw146$GENLS)) {
                        total = num_genls_rule_index(pos_term, $kw124$POS, UNPROVIDED, UNPROVIDED);
                      } else if (pcase_var.eql($kw148$GENL_MT)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12791");
                      } else if (pcase_var.eql($kw153$PRAGMA)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12803");
                      } else if (pcase_var.eql($kw151$EXCEPTION)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12779");
                      } else {
                        Errors.cerror($str138$So_don_t_, $str161$Don_t_know_how_to_handle_indexing, pos_indexing_type);
                      }
                    }
                    if (total.numL(best_total)) {
                      best_total = total;
                      best_term = pos_term;
                      {
                        SubLObject pcase_var = pos_indexing_type;
                        if (pcase_var.eql($kw143$PRED)) {
                          best_type = $kw174$PRED_POS;
                        } else if (pcase_var.eql($kw155$IST_PRED)) {
                          best_type = $kw175$IST_PRED_POS;
                        } else if (pcase_var.eql($kw142$ISA)) {
                          best_type = $kw176$ISA_POS;
                        } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                          best_type = $kw177$QUOTED_ISA_POS;
                        } else if (pcase_var.eql($kw146$GENLS)) {
                          best_type = $kw178$GENLS_POS;
                        } else if (pcase_var.eql($kw148$GENL_MT)) {
                          best_type = $kw179$GENL_MT_POS;
                        } else {
                          best_type = pos_indexing_type;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = neg_pairs;
            SubLObject neg_pair = NIL;
            for (neg_pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), neg_pair = cdolist_list_var.first()) {
              {
                SubLObject neg_indexing_type = neg_pair.first();
                SubLObject neg_term = conses_high.second(neg_pair);
                if ((NIL != kb_indexing_datastructures.indexed_term_p(neg_term))) {
                  {
                    SubLObject total = Numbers.$most_positive_fixnum$.getGlobalValue();
                    {
                      SubLObject pcase_var = neg_indexing_type;
                      if (pcase_var.eql($kw143$PRED)) {
                        total = num_predicate_rule_index(neg_term, $kw125$NEG, UNPROVIDED, UNPROVIDED);
                      } else if (pcase_var.eql($kw155$IST_PRED)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12774");
                      } else if (pcase_var.eql($kw142$ISA)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12796");
                      } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                        total = num_quoted_isa_rule_index(neg_term, $kw125$NEG, UNPROVIDED, UNPROVIDED);
                      } else if (pcase_var.eql($kw146$GENLS)) {
                        total = num_genls_rule_index(neg_term, $kw125$NEG, UNPROVIDED, UNPROVIDED);
                      } else if (pcase_var.eql($kw148$GENL_MT)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12792");
                      } else if (pcase_var.eql($kw149$FUNC)) {
                        total = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12787");
                      } else {
                        Errors.cerror($str138$So_don_t_, $str161$Don_t_know_how_to_handle_indexing, neg_indexing_type);
                      }
                    }
                    if (total.numL(best_total)) {
                      best_total = total;
                      best_term = neg_term;
                      {
                        SubLObject pcase_var = neg_indexing_type;
                        if (pcase_var.eql($kw143$PRED)) {
                          best_type = $kw180$PRED_NEG;
                        } else if (pcase_var.eql($kw155$IST_PRED)) {
                          best_type = $kw181$IST_PRED_NEG;
                        } else if (pcase_var.eql($kw142$ISA)) {
                          best_type = $kw182$ISA_NEG;
                        } else if (pcase_var.eql($kw145$QUOTED_ISA)) {
                          best_type = $kw183$QUOTED_ISA_NEG;
                        } else if (pcase_var.eql($kw146$GENLS)) {
                          best_type = $kw184$GENLS_NEG;
                        } else if (pcase_var.eql($kw148$GENL_MT)) {
                          best_type = $kw185$GENL_MT_NEG;
                        } else {
                          best_type = neg_indexing_type;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = other;
            SubLObject other_term = NIL;
            for (other_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), other_term = cdolist_list_var.first()) {
              if ((NIL != kb_indexing_datastructures.indexed_term_p(other_term))) {
                {
                  SubLObject total = num_other_index(other_term);
                  if (total.numL(best_total)) {
                    best_total = total;
                    best_term = other_term;
                    best_type = $kw116$OTHER;
                  }
                }
              }
            }
          }
        }
        return Values.values(best_type, best_term);
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 76429) 
  public static final SubLObject lookup_index_get_property(SubLObject lookup_index, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    return conses_high.getf(lookup_index, indicator, v_default);
  }

  /** Usage: (csetq li (lookup-index-set-property li :foo 212)) */
  @SubL(source = "cycl/kb-indexing.lisp", position = 76564) 
  public static final SubLObject lookup_index_set_property(SubLObject lookup_index, SubLObject indicator, SubLObject value) {
    return conses_high.putf(lookup_index, indicator, value);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 76747) 
  public static final SubLObject lookup_index_get_type(SubLObject lookup_index) {
    return lookup_index_get_property(lookup_index, $kw188$INDEX_TYPE, UNPROVIDED);
  }

  /** Assumes LOOKUP-INDEX is of type :gaf-arg.
   @return 0 term
   @return 1 argnum
   @return 2 predicate */
  @SubL(source = "cycl/kb-indexing.lisp", position = 77335) 
  public static final SubLObject lookup_index_gaf_arg_values(SubLObject lookup_index) {
    {
      SubLObject v_term = lookup_index_get_property(lookup_index, $kw190$TERM, UNPROVIDED);
      SubLObject argnum = lookup_index_get_property(lookup_index, $kw191$ARGNUM, UNPROVIDED);
      SubLObject predicate = lookup_index_get_property(lookup_index, $kw189$PREDICATE, UNPROVIDED);
      return Values.values(v_term, argnum, predicate);
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 78240) 
  public static final SubLObject lookup_index_for_predicate_extent(SubLObject predicate) {
    {
      SubLObject lookup_index = NIL;
      lookup_index = lookup_index_set_property(lookup_index, $kw188$INDEX_TYPE, $kw36$PREDICATE_EXTENT);
      lookup_index = lookup_index_set_property(lookup_index, $kw189$PREDICATE, predicate);
      return lookup_index;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 78830) 
  public static final SubLObject lookup_index_for_gaf_arg(SubLObject best_term, SubLObject best_index_argnum, SubLObject index_pred) {
    {
      SubLObject lookup_index = NIL;
      lookup_index = lookup_index_set_property(lookup_index, $kw188$INDEX_TYPE, $kw18$GAF_ARG);
      lookup_index = lookup_index_set_property(lookup_index, $kw190$TERM, best_term);
      lookup_index = lookup_index_set_property(lookup_index, $kw191$ARGNUM, best_index_argnum);
      lookup_index = lookup_index_set_property(lookup_index, $kw189$PREDICATE, index_pred);
      return lookup_index;
    }
  }

  /** @return boolean; t iff INDEX-TYPE is allowable, according to METHODS. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 79794) 
  public static final SubLObject lookup_methods_includeP(SubLObject index_type, SubLObject methods) {
    return makeBoolean(((NIL == methods)
          || (NIL != conses_high.member(index_type, methods, UNPROVIDED, UNPROVIDED))));
  }

  /** @return nil or property-list-p; a property list containing the property :index-type,
   which identifies which type of index is best for lookup of ASENT with TRUTH.
   The remaining elements on the plist are additional information pertaining to
   that type of index.  A nil return value means that no possible index was
   found using the allowable methods.
   @param METHODS; the allowable methods (index-types) that the function can
   return.  If nil, all methods are allowed. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 80245) 
  public static final SubLObject best_gaf_lookup_index(SubLObject asent, SubLObject truth, SubLObject methods) {
    if ((methods == UNPROVIDED)) {
      methods = NIL;
    }
    if (((NIL != lookup_methods_includeP($kw36$PREDICATE_EXTENT, methods))
        || (NIL != lookup_methods_includeP($kw18$GAF_ARG, methods)))) {
      return best_gaf_lookup_index_try_all_allowed(asent, truth, methods);
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12767"))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12754");
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 81201) 
  public static final SubLObject num_best_gaf_lookup_index(SubLObject asent, SubLObject truth, SubLObject methods) {
    if ((methods == UNPROVIDED)) {
      methods = NIL;
    }
    if (((NIL != lookup_methods_includeP($kw36$PREDICATE_EXTENT, methods))
        || (NIL != lookup_methods_includeP($kw18$GAF_ARG, methods)))) {
      return num_best_gaf_lookup_index_try_all_allowed(asent, truth, methods);
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12768"))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5114");
    } else {
      return ZERO_INTEGER;
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 81673) 
  public static final SubLObject best_gaf_lookup_index_try_all_allowed(SubLObject asent, SubLObject truth, SubLObject methods) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject lookup_index = NIL;
        thread.resetMultipleValues();
        {
          SubLObject best_fort = best_gaf_lookup_index_wrt_methods(asent, truth, methods);
          SubLObject best_index_argnum = thread.secondMultipleValue();
          SubLObject index_pred = thread.thirdMultipleValue();
          SubLObject best_count = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if (((NIL != lookup_methods_includeP($kw167$OVERLAP, methods))
               && (NIL != virtual_indexing.lookup_should_use_index_overlapP(asent, best_count)))) {
            lookup_index = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12755");
          } else if (((NIL == best_fort)
               && (NIL == best_index_argnum)
               && (NIL == index_pred)
               && ZERO_INTEGER.eql(best_count))) {
            lookup_index = NIL;
          } else if (((NIL != lookup_methods_includeP($kw36$PREDICATE_EXTENT, methods))
               && ZERO_INTEGER.eql(best_index_argnum))) {
            lookup_index = lookup_index_for_predicate_extent(best_fort);
          } else if (((NIL != lookup_methods_includeP($kw18$GAF_ARG, methods))
               && (NIL != subl_promotions.positive_integer_p(best_index_argnum)))) {
            lookup_index = lookup_index_for_gaf_arg(best_fort, best_index_argnum, index_pred);
          }
        }
        return lookup_index;
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 82844) 
  public static final SubLObject num_best_gaf_lookup_index_try_all_allowed(SubLObject asent, SubLObject truth, SubLObject methods) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject best_fort = best_gaf_lookup_index_wrt_methods(asent, truth, methods);
        SubLObject best_index_argnum = thread.secondMultipleValue();
        SubLObject index_pred = thread.thirdMultipleValue();
        SubLObject best_count = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != lookup_methods_includeP($kw167$OVERLAP, methods))
             && (NIL != virtual_indexing.lookup_should_use_index_overlapP(asent, best_count)))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5115");
        } else {
          return best_count;
        }
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 83368) 
  public static final SubLObject best_gaf_lookup_index_wrt_methods(SubLObject asent, SubLObject truth, SubLObject methods) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tweaked_asent = (((NIL != lookup_methods_includeP($kw36$PREDICATE_EXTENT, methods))
             && (NIL == lookup_methods_includeP($kw18$GAF_ARG, methods))) ? ((SubLObject) el_utilities.make_formula(cycl_utilities.atomic_sentence_predicate(asent), NIL, UNPROVIDED)) : asent);
        thread.resetMultipleValues();
        {
          SubLObject best_term = best_gaf_lookup_index_int(tweaked_asent, truth);
          SubLObject best_index_argnum = thread.secondMultipleValue();
          SubLObject index_pred = thread.thirdMultipleValue();
          SubLObject best_count = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if (((NIL != lookup_methods_includeP($kw18$GAF_ARG, methods))
               && (NIL != subl_promotions.positive_integer_p(best_index_argnum)))) {
          } else if (((NIL != lookup_methods_includeP($kw36$PREDICATE_EXTENT, methods))
               && ZERO_INTEGER.eql(best_index_argnum))) {
          } else if (((NIL != lookup_methods_includeP($kw18$GAF_ARG, methods))
               && ZERO_INTEGER.eql(best_index_argnum))) {
            return Values.values(NIL, NIL, NIL, ZERO_INTEGER);
          }
          return Values.values(best_term, best_index_argnum, index_pred, best_count);
        }
      }
    }
  }

  /** Determine the best gaf lookup index of ASENT with truth value TRUTH.
   First look for mt-insensitive counts,
   then, if not all mts are relevant, try to do better by finding a
   smaller mt-sensitive count, but use the min of the mt-insensitive
   counts as a cutoff so it won't waste time computing the relevance of
   things that aren't going to be any better. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 84280) 
  public static final SubLObject best_gaf_lookup_index_int(SubLObject asent, SubLObject truth) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject argnum_pairs = determine_formula_indices(asent);
        SubLObject others = thread.secondMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject best_count = NIL;
          SubLObject best_fort = NIL;
          SubLObject best_argnum = NIL;
          SubLObject pred = conses_high.assoc(ZERO_INTEGER, argnum_pairs, UNPROVIDED, UNPROVIDED).rest();
          if ((NIL != forts.fort_p(pred))) {
            best_fort = pred;
            best_count = num_predicate_extent_index(pred, UNPROVIDED);
            best_argnum = ZERO_INTEGER;
          } else {
            pred = NIL;
          }
          {
            SubLObject cdolist_list_var = argnum_pairs;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
              {
                SubLObject datum = cons;
                SubLObject current = datum;
                SubLObject argnum = NIL;
                SubLObject arg = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
                argnum = current.first();
                current = current.rest();
                arg = current;
                if (argnum.isPositive()) {
                  {
                    SubLObject num = NIL;
                    if ((NIL != kb_indexing_datastructures.indexed_term_p(arg))) {
                      if ((NIL != pred)) {
                        num = num_gaf_arg_index(arg, argnum, pred, UNPROVIDED);
                      } else {
                        num = num_gaf_arg_index(arg, argnum, UNPROVIDED, UNPROVIDED);
                      }
                      if (((NIL == best_fort)
                          || num.numL(best_count))) {
                        best_count = num;
                        best_fort = arg;
                        best_argnum = argnum;
                      }
                    }
                  }
                }
              }
            }
          }
          if ((NIL == mt_relevance_macros.any_or_all_mts_are_relevantP())) {
            if ((NIL != pred)) {
              {
                SubLObject cdolist_list_var = argnum_pairs;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
                  {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject argnum = NIL;
                    SubLObject arg = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list140);
                    argnum = current.first();
                    current = current.rest();
                    arg = current;
                    if (argnum.isPositive()) {
                      if ((NIL != kb_indexing_datastructures.indexed_term_p(arg))) {
                        {
                          SubLObject arg_count = relevant_num_gaf_arg_index_with_cutoff(arg, best_count, argnum, pred);
                          if (arg_count.numL(best_count)) {
                            best_count = arg_count;
                            best_fort = arg;
                            best_argnum = argnum;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if ((NIL != forts.fort_p(pred))) {
              {
                SubLObject pred_count = relevant_num_predicate_extent_index_with_cutoff(pred, best_count);
                if (pred_count.numL(best_count)) {
                  best_fort = pred;
                  best_count = pred_count;
                  best_argnum = ZERO_INTEGER;
                }
              }
            }
          }
          return Values.values(best_fort, best_argnum, pred, best_count);
        }
      }
    }
  }

  /** When there are more than 10k constant, call (gc-full) to remove old indexes from static space. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 86336) 
  private static SubLSymbol $reindex_all_assertions_full_gc_threshhold_constant_count$ = null;

  /** Controls whether the reindexing process complains about the indexing
     errors or just discards them silently. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 87520) 
  private static SubLSymbol $warn_on_assertion_reindexing_errorsP$ = null;

  /** Find the assertion in MT with CNF.  Return NIL if not present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 89211) 
  public static final SubLObject find_assertion(SubLObject cnf, SubLObject mt) {
    checkType(cnf, $sym206$CNF_P);
    checkType(mt, $sym207$HLMT_P);
    return assertions_interface.kb_lookup_assertion(cnf, mt);
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 89683) 
  public static final SubLObject find_assertion_internal(SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject assertion = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym213$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            assertion = find_cnf(cnf);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return assertion;
      }
    }
  }

  /** Find any assertion in any mt with CNF.  Return NIL if none are present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 89838) 
  public static final SubLObject find_assertion_any_mt(SubLObject cnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(cnf, $sym206$CNF_P);
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const107$EverythingPSC, thread);
            ans = find_cnf(cnf);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** Find the assertion in MT with GAF-FORMULA as its formula.  Return NIL if not present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 91232) 
  public static final SubLObject find_gaf(SubLObject gaf_formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(gaf_formula, $sym221$EL_FORMULA_P);
      checkType(mt, $sym207$HLMT_P);
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym213$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            ans = find_gaf_formula(gaf_formula);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** Find any assertion in any mt with GAF-FORMULA as its formula.  Return NIL if not present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 91651) 
  public static final SubLObject find_gaf_any_mt(SubLObject gaf_formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(gaf_formula, $sym221$EL_FORMULA_P);
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym106$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const107$EverythingPSC, thread);
            ans = find_gaf_formula(gaf_formula);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** Find any assertion in any currently relevant with GAF-FORMULA as its formula.  Return NIL if not present. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 92717) 
  public static final SubLObject find_gaf_in_relevant_mt(SubLObject gaf_formula) {
    return find_gaf_formula(gaf_formula);
  }

  /** Return an assertion which has CNF as its cnf or NIL if none present.
Relevant mts are assumed scoped from the outside. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 93315) 
  public static final SubLObject find_cnf(SubLObject cnf) {
    checkType(cnf, $sym206$CNF_P);
    if ((NIL != clauses.gaf_cnfP(cnf))) {
      return find_gaf_cnf(cnf);
    } else {
      return find_rule_cnf(cnf);
    }
  }

  /** Use the gaf indexing to find any assertion whose hl-cnf is CNF */
  @SubL(source = "cycl/kb-indexing.lisp", position = 93598) 
  public static final SubLObject find_gaf_cnf(SubLObject cnf) {
    return find_gaf_formula(assertions_low.cnf_to_gaf_formula(cnf));
  }

  /** Use the rule indexing to find any assertion whose hl-cnf is CNF */
  @SubL(source = "cycl/kb-indexing.lisp", position = 93754) 
  public static final SubLObject find_rule_cnf(SubLObject cnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject index = decent_rule_index(cnf);
        SubLObject v_term = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return find_rule_cnf_via_index_int(cnf, index, v_term);
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 94329) 
  public static final SubLObject find_rule_cnf_via_index_int(SubLObject cnf, SubLObject index, SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if ((NIL != kb_indexing_datastructures.indexed_term_p(v_term))) {
          {
            SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
            SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
              control_vars.$mapping_target$.bind(cnf, thread);
              control_vars.$mapping_answer$.bind(NIL, thread);
              {
                SubLObject catch_var = NIL;
                try {
                  {
                    SubLObject pcase_var = index;
                    if (pcase_var.eql($kw116$OTHER)) {
                      kb_mapping.map_other_index(Symbols.symbol_function($sym235$FIND_CNF_INTERNAL), v_term, NIL, NIL);
                    } else if (pcase_var.eql($kw180$PRED_NEG)) {
                      kb_mapping.map_predicate_rule_index(Symbols.symbol_function($sym235$FIND_CNF_INTERNAL), v_term, $kw125$NEG, UNPROVIDED, UNPROVIDED);
                    } else if (pcase_var.eql($kw174$PRED_POS)) {
                      kb_mapping.map_predicate_rule_index(Symbols.symbol_function($sym235$FIND_CNF_INTERNAL), v_term, $kw124$POS, UNPROVIDED, UNPROVIDED);
                    } else if (pcase_var.eql($kw181$IST_PRED_NEG)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9446");
                    } else if (pcase_var.eql($kw175$IST_PRED_POS)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9447");
                    } else if (pcase_var.eql($kw182$ISA_NEG)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9463");
                    } else if (pcase_var.eql($kw176$ISA_POS)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9464");
                    } else if (pcase_var.eql($kw183$QUOTED_ISA_NEG)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9476");
                    } else if (pcase_var.eql($kw177$QUOTED_ISA_POS)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9477");
                    } else if (pcase_var.eql($kw184$GENLS_NEG)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9460");
                    } else if (pcase_var.eql($kw178$GENLS_POS)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9461");
                    } else if (pcase_var.eql($kw185$GENL_MT_NEG)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9458");
                    } else if (pcase_var.eql($kw179$GENL_MT_POS)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9459");
                    } else if (pcase_var.eql($kw149$FUNC)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9451");
                    } else if (pcase_var.eql($kw151$EXCEPTION)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9448");
                    } else if (pcase_var.eql($kw153$PRAGMA)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9468");
                    }
                  }
                } catch (Throwable ccatch_env_var) {
                  catch_var = Errors.handleThrowable(ccatch_env_var, $kw234$MAPPING_DONE);
                }
                ans = control_vars.$mapping_answer$.getDynamicValue(thread);
              }
            } finally {
              control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
              control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 95961) 
  public static final SubLObject find_cnf_internal(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != control_vars.$mapping_target$.getDynamicValue(thread))
           && (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)))) {
        {
          SubLObject cnf = assertions_high.assertion_cnf(assertion);
          {
            SubLObject _prev_bind_0 = control_vars.$candidate_assertion$.currentBinding(thread);
            try {
              control_vars.$candidate_assertion$.bind(assertion, thread);
              if ((NIL != Functions.funcall(control_vars.$cnf_matching_predicate$.getDynamicValue(thread), cnf, control_vars.$mapping_target$.getDynamicValue(thread)))) {
                control_vars.$mapping_answer$.setDynamicValue(assertion, thread);
                utilities_macros.mapping_finished();
              }
            } finally {
              control_vars.$candidate_assertion$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Use the gaf indexing to find any assertion whose gaf formula is GAF-FORMULA,
   regardless of truth.  If there are more than one, it will return
   an arbitrary one. */
  @SubL(source = "cycl/kb-indexing.lisp", position = 96374) 
  public static final SubLObject find_gaf_formula(SubLObject gaf_formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject l_index = best_gaf_lookup_index(gaf_formula, NIL, NIL);
        SubLObject method = kb_mapping_macros.do_gli_extract_method(l_index);
        SubLObject pcase_var = method;
        if (pcase_var.eql($kw18$GAF_ARG)) {
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
                      SubLObject done_var = result;
                      SubLObject token_var = NIL;
                      while ((NIL == done_var)) {
                        {
                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                          if ((NIL != valid)) {
                            {
                              SubLObject final_index_iterator = NIL;
                              try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                                {
                                  SubLObject done_var_28 = result;
                                  SubLObject token_var_29 = NIL;
                                  while ((NIL == done_var_28)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_29);
                                      SubLObject valid_30 = makeBoolean((token_var_29 != assertion));
                                      if ((NIL != valid_30)) {
                                        {
                                          SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
                                          if ((NIL != possible_result)) {
                                            result = possible_result;
                                          }
                                        }
                                      }
                                      done_var_28 = makeBoolean(((NIL == valid_30)
                                            || (NIL != result)));
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
                          done_var = makeBoolean(((NIL == valid)
                                || (NIL != result)));
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
                      SubLObject done_var = result;
                      SubLObject token_var = NIL;
                      while ((NIL == done_var)) {
                        {
                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                          if ((NIL != valid)) {
                            {
                              SubLObject final_index_iterator = NIL;
                              try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                                {
                                  SubLObject done_var_31 = result;
                                  SubLObject token_var_32 = NIL;
                                  while ((NIL == done_var_31)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                                      SubLObject valid_33 = makeBoolean((token_var_32 != assertion));
                                      if ((NIL != valid_33)) {
                                        {
                                          SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
                                          if ((NIL != possible_result)) {
                                            result = possible_result;
                                          }
                                        }
                                      }
                                      done_var_31 = makeBoolean(((NIL == valid_33)
                                            || (NIL != result)));
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
                          done_var = makeBoolean(((NIL == valid)
                                || (NIL != result)));
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
                      SubLObject done_var = result;
                      SubLObject token_var = NIL;
                      while ((NIL == done_var)) {
                        {
                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                          if ((NIL != valid)) {
                            {
                              SubLObject final_index_iterator = NIL;
                              try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                                {
                                  SubLObject done_var_34 = result;
                                  SubLObject token_var_35 = NIL;
                                  while ((NIL == done_var_34)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                                      SubLObject valid_36 = makeBoolean((token_var_35 != assertion));
                                      if ((NIL != valid_36)) {
                                        {
                                          SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
                                          if ((NIL != possible_result)) {
                                            result = possible_result;
                                          }
                                        }
                                      }
                                      done_var_34 = makeBoolean(((NIL == valid_36)
                                            || (NIL != result)));
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
                          done_var = makeBoolean(((NIL == valid)
                                || (NIL != result)));
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
                      SubLObject done_var = result;
                      SubLObject token_var = NIL;
                      while ((NIL == done_var)) {
                        {
                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                          if ((NIL != valid)) {
                            {
                              SubLObject final_index_iterator = NIL;
                              try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                                {
                                  SubLObject done_var_37 = result;
                                  SubLObject token_var_38 = NIL;
                                  while ((NIL == done_var_37)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                      SubLObject valid_39 = makeBoolean((token_var_38 != assertion));
                                      if ((NIL != valid_39)) {
                                        {
                                          SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
                                          if ((NIL != possible_result)) {
                                            result = possible_result;
                                          }
                                        }
                                      }
                                      done_var_37 = makeBoolean(((NIL == valid_39)
                                            || (NIL != result)));
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
                          done_var = makeBoolean(((NIL == valid)
                                || (NIL != result)));
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } else if (pcase_var.eql($kw36$PREDICATE_EXTENT)) {
          {
            SubLObject pred_var = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                SubLObject done_var = result;
                SubLObject token_var = NIL;
                while ((NIL == done_var)) {
                  {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean((token_var != final_index_spec));
                    if ((NIL != valid)) {
                      {
                        SubLObject final_index_iterator = NIL;
                        try {
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw169$GAF, NIL, NIL);
                          {
                            SubLObject done_var_40 = result;
                            SubLObject token_var_41 = NIL;
                            while ((NIL == done_var_40)) {
                              {
                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_41);
                                SubLObject valid_42 = makeBoolean((token_var_41 != assertion));
                                if ((NIL != valid_42)) {
                                  {
                                    SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
                                    if ((NIL != possible_result)) {
                                      result = possible_result;
                                    }
                                  }
                                }
                                done_var_40 = makeBoolean(((NIL == valid_42)
                                      || (NIL != result)));
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
                    done_var = makeBoolean(((NIL == valid)
                          || (NIL != result)));
                  }
                }
              }
            }
          }
        } else if (pcase_var.eql($kw167$OVERLAP)) {
          {
            SubLObject rest = NIL;
            for (rest = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5149"); (!(((NIL != result)
                  || (NIL == rest)))); rest = rest.rest()) {
              {
                SubLObject assertion = rest.first();
                SubLObject possible_result = find_gaf_internal(assertion, gaf_formula);
                if ((NIL != possible_result)) {
                  result = possible_result;
                }
              }
            }
          }
        } else {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30381");
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/kb-indexing.lisp", position = 96836) 
  public static final SubLObject find_gaf_internal(SubLObject assertion, SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if (((NIL != sentence)
             && (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED))
             && (NIL != assertions_high.gaf_assertionP(assertion)))) {
          {
            SubLObject gaf = assertions_high.assertion_gaf_hl_formula(assertion);
            {
              SubLObject _prev_bind_0 = control_vars.$candidate_assertion$.currentBinding(thread);
              try {
                control_vars.$candidate_assertion$.bind(assertion, thread);
                if ((NIL != Functions.funcall(control_vars.$gaf_matching_predicate$.getDynamicValue(thread), gaf, sentence))) {
                  result = assertion;
                }
              } finally {
                control_vars.$candidate_assertion$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }

  /** the list of gathered rule assertions */
  @SubL(source = "cycl/kb-indexing.lisp", position = 99448) 
  private static SubLSymbol $gathered_rule_assertions$ = null;

  public static final SubLObject declare_kb_indexing_file() {
    declareFunction(myName, "get_subindex", "GET-SUBINDEX", 2, 0, false);
    declareFunction(myName, "term_add_indexing_leaf", "TERM-ADD-INDEXING-LEAF", 3, 0, false);
    declareFunction(myName, "term_rem_indexing_leaf", "TERM-REM-INDEXING-LEAF", 3, 0, false);
    declareFunction(myName, "all_mt_subindex_keys_relevant_p", "ALL-MT-SUBINDEX-KEYS-RELEVANT-P", 0, 0, false);
    //declareFunction(myName, "relevant_mt_subindex_count", "RELEVANT-MT-SUBINDEX-COUNT", 1, 0, false);
    declareFunction(myName, "relevant_mt_subindex_count_with_cutoff", "RELEVANT-MT-SUBINDEX-COUNT-WITH-CUTOFF", 2, 0, false);
    //declareFunction(myName, "relevant_mt_subindex_keys", "RELEVANT-MT-SUBINDEX-KEYS", 1, 0, false);
    declareFunction(myName, "mark_term_index_as_muted", "MARK-TERM-INDEX-AS-MUTED", 1, 0, false);
    declareFunction(myName, "num_gaf_arg_index", "NUM-GAF-ARG-INDEX", 1, 3, false);
    declareFunction(myName, "relevant_num_gaf_arg_index", "RELEVANT-NUM-GAF-ARG-INDEX", 1, 2, false);
    declareFunction(myName, "relevant_num_gaf_arg_index_with_cutoff", "RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF", 2, 2, false);
    declareFunction(myName, "clear_key_gaf_arg_index_cached", "CLEAR-KEY-GAF-ARG-INDEX-CACHED", 0, 0, false); new $clear_key_gaf_arg_index_cached$ZeroArityFunction();
    //declareFunction(myName, "remove_key_gaf_arg_index_cached", "REMOVE-KEY-GAF-ARG-INDEX-CACHED", 1, 2, false);
    declareFunction(myName, "key_gaf_arg_index_cached_internal", "KEY-GAF-ARG-INDEX-CACHED-INTERNAL", 3, 0, false);
    declareFunction(myName, "key_gaf_arg_index_cached", "KEY-GAF-ARG-INDEX-CACHED", 1, 2, false);
    declareFunction(myName, "key_gaf_arg_index", "KEY-GAF-ARG-INDEX", 1, 2, false);
    //declareFunction(myName, "gaf_arg_indices", "GAF-ARG-INDICES", 1, 0, false);
    //declareFunction(myName, "relevant_key_gaf_arg_index", "RELEVANT-KEY-GAF-ARG-INDEX", 1, 2, false);
    //declareFunction(myName, "mts_gaf_arg_index", "MTS-GAF-ARG-INDEX", 3, 1, false);
    declareFunction(myName, "gaf_arg_index_key_validator", "GAF-ARG-INDEX-KEY-VALIDATOR", 1, 3, false);
    declareFunction(myName, "get_gaf_arg_subindex", "GET-GAF-ARG-SUBINDEX", 1, 3, false);
    declareFunction(myName, "add_gaf_arg_index", "ADD-GAF-ARG-INDEX", 5, 0, false);
    declareFunction(myName, "rem_gaf_arg_index", "REM-GAF-ARG-INDEX", 5, 0, false);
    declareFunction(myName, "num_nart_arg_index", "NUM-NART-ARG-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_num_nart_arg_index", "RELEVANT-NUM-NART-ARG-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_num_nart_arg_index_with_cutoff", "RELEVANT-NUM-NART-ARG-INDEX-WITH-CUTOFF", 2, 2, false);
    declareFunction(myName, "key_nart_arg_index", "KEY-NART-ARG-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_key_nart_arg_index", "RELEVANT-KEY-NART-ARG-INDEX", 1, 2, false);
    //declareFunction(myName, "mts_nart_arg_index", "MTS-NART-ARG-INDEX", 3, 1, false);
    declareFunction(myName, "get_nart_arg_subindex", "GET-NART-ARG-SUBINDEX", 1, 2, false);
    //declareFunction(myName, "add_nart_arg_index", "ADD-NART-ARG-INDEX", 4, 0, false);
    //declareFunction(myName, "rem_nart_arg_index", "REM-NART-ARG-INDEX", 4, 0, false);
    declareFunction(myName, "num_predicate_extent_index", "NUM-PREDICATE-EXTENT-INDEX", 1, 1, false); new $num_predicate_extent_index$UnaryFunction(); new $num_predicate_extent_index$BinaryFunction();
    //declareFunction(myName, "relevant_num_predicate_extent_index", "RELEVANT-NUM-PREDICATE-EXTENT-INDEX", 1, 0, false);
    declareFunction(myName, "relevant_num_predicate_extent_index_with_cutoff", "RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF", 2, 0, false);
    //declareFunction(myName, "no_predicate_extent_p", "NO-PREDICATE-EXTENT-P", 1, 0, false);
    declareFunction(myName, "key_predicate_extent_index", "KEY-PREDICATE-EXTENT-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_key_predicate_extent_index", "RELEVANT-KEY-PREDICATE-EXTENT-INDEX", 1, 0, false);
    declareFunction(myName, "predicate_extent_top_level_key", "PREDICATE-EXTENT-TOP-LEVEL-KEY", 0, 0, false);
    declareFunction(myName, "add_predicate_extent_index", "ADD-PREDICATE-EXTENT-INDEX", 3, 0, false);
    declareFunction(myName, "rem_predicate_extent_index", "REM-PREDICATE-EXTENT-INDEX", 3, 0, false);
    declareFunction(myName, "get_predicate_extent_subindex", "GET-PREDICATE-EXTENT-SUBINDEX", 1, 1, false);
    //declareFunction(myName, "num_function_extent_index", "NUM-FUNCTION-EXTENT-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_function_extent_index", "RELEVANT-NUM-FUNCTION-EXTENT-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_function_extent_index_with_cutoff", "RELEVANT-NUM-FUNCTION-EXTENT-INDEX-WITH-CUTOFF", 2, 0, false);
    //declareFunction(myName, "get_function_extent_subindex", "GET-FUNCTION-EXTENT-SUBINDEX", 1, 0, false);
    //declareFunction(myName, "add_function_extent_index", "ADD-FUNCTION-EXTENT-INDEX", 2, 0, false);
    //declareFunction(myName, "rem_function_extent_index", "REM-FUNCTION-EXTENT-INDEX", 2, 0, false);
    //declareFunction(myName, "function_extent_top_level_key", "FUNCTION-EXTENT-TOP-LEVEL-KEY", 0, 0, false);
    declareFunction(myName, "num_predicate_rule_index", "NUM-PREDICATE-RULE-INDEX", 1, 3, false);
    declareFunction(myName, "relevant_num_predicate_rule_index", "RELEVANT-NUM-PREDICATE-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_num_predicate_rule_index_with_cutoff", "RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
    declareFunction(myName, "key_predicate_rule_index", "KEY-PREDICATE-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_key_predicate_rule_index", "RELEVANT-KEY-PREDICATE-RULE-INDEX", 1, 1, false);
    declareFunction(myName, "get_predicate_rule_subindex", "GET-PREDICATE-RULE-SUBINDEX", 1, 3, false);
    declareFunction(myName, "add_predicate_rule_index", "ADD-PREDICATE-RULE-INDEX", 5, 0, false);
    declareFunction(myName, "rem_predicate_rule_index", "REM-PREDICATE-RULE-INDEX", 5, 0, false);
    //declareFunction(myName, "num_decontextualized_ist_predicate_rule_index", "NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 2, false);
    declareFunction(myName, "key_decontextualized_ist_predicate_rule_index", "KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 1, 1, false);
    declareFunction(myName, "get_decontextualized_ist_predicate_rule_subindex", "GET-DECONTEXTUALIZED-IST-PREDICATE-RULE-SUBINDEX", 1, 2, false);
    //declareFunction(myName, "add_decontextualized_ist_predicate_rule_index", "ADD-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "rem_decontextualized_ist_predicate_rule_index", "REM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "num_isa_rule_index", "NUM-ISA-RULE-INDEX", 1, 3, false);
    //declareFunction(myName, "relevant_num_isa_rule_index", "RELEVANT-NUM-ISA-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_num_isa_rule_index_with_cutoff", "RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
    declareFunction(myName, "key_isa_rule_index", "KEY-ISA-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_key_isa_rule_index", "RELEVANT-KEY-ISA-RULE-INDEX", 1, 1, false);
    declareFunction(myName, "get_isa_rule_subindex", "GET-ISA-RULE-SUBINDEX", 1, 3, false);
    //declareFunction(myName, "add_isa_rule_index", "ADD-ISA-RULE-INDEX", 5, 0, false);
    //declareFunction(myName, "rem_isa_rule_index", "REM-ISA-RULE-INDEX", 5, 0, false);
    declareFunction(myName, "num_quoted_isa_rule_index", "NUM-QUOTED-ISA-RULE-INDEX", 1, 3, false);
    //declareFunction(myName, "relevant_num_quoted_isa_rule_index", "RELEVANT-NUM-QUOTED-ISA-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_num_quoted_isa_rule_index_with_cutoff", "RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
    //declareFunction(myName, "key_quoted_isa_rule_index", "KEY-QUOTED-ISA-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_key_quoted_isa_rule_index", "RELEVANT-KEY-QUOTED-ISA-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "get_quoted_isa_rule_subindex", "GET-QUOTED-ISA-RULE-SUBINDEX", 1, 3, false);
    //declareFunction(myName, "add_quoted_isa_rule_index", "ADD-QUOTED-ISA-RULE-INDEX", 5, 0, false);
    //declareFunction(myName, "rem_quoted_isa_rule_index", "REM-QUOTED-ISA-RULE-INDEX", 5, 0, false);
    declareFunction(myName, "num_genls_rule_index", "NUM-GENLS-RULE-INDEX", 1, 3, false);
    //declareFunction(myName, "relevant_num_genls_rule_index", "RELEVANT-NUM-GENLS-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_num_genls_rule_index_with_cutoff", "RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
    declareFunction(myName, "key_genls_rule_index", "KEY-GENLS-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_key_genls_rule_index", "RELEVANT-KEY-GENLS-RULE-INDEX", 1, 1, false);
    declareFunction(myName, "get_genls_rule_subindex", "GET-GENLS-RULE-SUBINDEX", 1, 3, false);
    declareFunction(myName, "add_genls_rule_index", "ADD-GENLS-RULE-INDEX", 5, 0, false);
    declareFunction(myName, "rem_genls_rule_index", "REM-GENLS-RULE-INDEX", 5, 0, false);
    //declareFunction(myName, "num_genl_mt_rule_index", "NUM-GENL-MT-RULE-INDEX", 1, 3, false);
    //declareFunction(myName, "relevant_num_genl_mt_rule_index", "RELEVANT-NUM-GENL-MT-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_num_genl_mt_rule_index_with_cutoff", "RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF", 2, 1, false);
    declareFunction(myName, "key_genl_mt_rule_index", "KEY-GENL-MT-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_key_genl_mt_rule_index", "RELEVANT-KEY-GENL-MT-RULE-INDEX", 1, 1, false);
    declareFunction(myName, "get_genl_mt_rule_subindex", "GET-GENL-MT-RULE-SUBINDEX", 1, 3, false);
    //declareFunction(myName, "add_genl_mt_rule_index", "ADD-GENL-MT-RULE-INDEX", 5, 0, false);
    //declareFunction(myName, "rem_genl_mt_rule_index", "REM-GENL-MT-RULE-INDEX", 5, 0, false);
    //declareFunction(myName, "num_function_rule_index", "NUM-FUNCTION-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_num_function_rule_index", "RELEVANT-NUM-FUNCTION-RULE-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_function_rule_index_with_cutoff", "RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF", 2, 0, false);
    declareFunction(myName, "key_function_rule_index", "KEY-FUNCTION-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_key_function_rule_index", "RELEVANT-KEY-FUNCTION-RULE-INDEX", 1, 0, false);
    declareFunction(myName, "get_function_rule_subindex", "GET-FUNCTION-RULE-SUBINDEX", 1, 2, false);
    //declareFunction(myName, "add_function_rule_index", "ADD-FUNCTION-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "rem_function_rule_index", "REM-FUNCTION-RULE-INDEX", 4, 0, false);
    declareFunction(myName, "function_rule_top_level_key", "FUNCTION-RULE-TOP-LEVEL-KEY", 0, 0, false);
    //declareFunction(myName, "num_exception_rule_index", "NUM-EXCEPTION-RULE-INDEX", 1, 2, false);
    //declareFunction(myName, "relevant_num_exception_rule_index", "RELEVANT-NUM-EXCEPTION-RULE-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_exception_rule_index_with_cutoff", "RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF", 2, 0, false);
    //declareFunction(myName, "key_exception_rule_index", "KEY-EXCEPTION-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_key_exception_rule_index", "RELEVANT-KEY-EXCEPTION-RULE-INDEX", 1, 0, false);
    //declareFunction(myName, "exception_rule_top_level_key", "EXCEPTION-RULE-TOP-LEVEL-KEY", 0, 0, false);
    //declareFunction(myName, "get_exception_rule_subindex", "GET-EXCEPTION-RULE-SUBINDEX", 1, 2, false);
    //declareFunction(myName, "add_exception_rule_index", "ADD-EXCEPTION-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "rem_exception_rule_index", "REM-EXCEPTION-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "num_pragma_rule_index", "NUM-PRAGMA-RULE-INDEX", 1, 2, false);
    declareFunction(myName, "relevant_num_pragma_rule_index", "RELEVANT-NUM-PRAGMA-RULE-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_pragma_rule_index_with_cutoff", "RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF", 2, 0, false);
    //declareFunction(myName, "key_pragma_rule_index", "KEY-PRAGMA-RULE-INDEX", 1, 1, false);
    //declareFunction(myName, "relevant_key_pragma_rule_index", "RELEVANT-KEY-PRAGMA-RULE-INDEX", 1, 0, false);
    //declareFunction(myName, "pragma_rule_top_level_key", "PRAGMA-RULE-TOP-LEVEL-KEY", 0, 0, false);
    //declareFunction(myName, "get_pragma_rule_subindex", "GET-PRAGMA-RULE-SUBINDEX", 1, 2, false);
    //declareFunction(myName, "add_pragma_rule_index", "ADD-PRAGMA-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "rem_pragma_rule_index", "REM-PRAGMA-RULE-INDEX", 4, 0, false);
    //declareFunction(myName, "rule_with_some_pragmatic_somewhereP", "RULE-WITH-SOME-PRAGMATIC-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "rule_with_some_pragmaticP", "RULE-WITH-SOME-PRAGMATIC?", 1, 1, false);
    //declareFunction(myName, "rule_with_some_asserted_more_specifically_pragmaticP", "RULE-WITH-SOME-ASSERTED-MORE-SPECIFICALLY-PRAGMATIC?", 1, 1, false);
    //declareFunction(myName, "num_mt_index", "NUM-MT-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_mt_index", "RELEVANT-NUM-MT-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_mt_index_with_cutoff", "RELEVANT-NUM-MT-INDEX-WITH-CUTOFF", 2, 0, false);
    //declareFunction(myName, "get_mt_subindex", "GET-MT-SUBINDEX", 1, 0, false);
    declareFunction(myName, "add_mt_index", "ADD-MT-INDEX", 2, 0, false);
    declareFunction(myName, "rem_mt_index", "REM-MT-INDEX", 2, 0, false);
    declareFunction(myName, "add_mt_index_internal", "ADD-MT-INDEX-INTERNAL", 2, 0, false);
    declareFunction(myName, "rem_mt_index_internal", "REM-MT-INDEX-INTERNAL", 2, 0, false);
    declareFunction(myName, "mt_top_level_key", "MT-TOP-LEVEL-KEY", 0, 0, false);
    declareFunction(myName, "broad_mtP", "BROAD-MT?", 1, 0, false);
    //declareFunction(myName, "broad_mt_index_cleanup", "BROAD-MT-INDEX-CLEANUP", 0, 0, false);
    //declareFunction(myName, "rem_broad_mt_index", "REM-BROAD-MT-INDEX", 1, 0, false);
    declareFunction(myName, "num_other_index", "NUM-OTHER-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_other_index", "RELEVANT-NUM-OTHER-INDEX", 1, 0, false);
    //declareFunction(myName, "relevant_num_other_index_with_cutoff", "RELEVANT-NUM-OTHER-INDEX-WITH-CUTOFF", 2, 0, false);
    declareFunction(myName, "get_other_subindex", "GET-OTHER-SUBINDEX", 1, 0, false);
    declareFunction(myName, "add_other_index", "ADD-OTHER-INDEX", 2, 0, false);
    declareFunction(myName, "rem_other_index", "REM-OTHER-INDEX", 2, 0, false);
    declareFunction(myName, "other_top_level_key", "OTHER-TOP-LEVEL-KEY", 0, 0, false);
    declareFunction(myName, "num_index", "NUM-INDEX", 1, 0, false); new $num_index$UnaryFunction();
    //declareFunction(myName, "num_index_slow", "NUM-INDEX-SLOW", 1, 0, false);
    //declareFunction(myName, "relevant_num_index", "RELEVANT-NUM-INDEX", 1, 0, false);
    //declareFunction(myName, "perform_indexing_pre_dump_cleanup", "PERFORM-INDEXING-PRE-DUMP-CLEANUP", 0, 0, false);
    //declareFunction(myName, "unindexed_syntax_constant_index_cleanup", "UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP", 0, 0, false);
    //declareFunction(myName, "unindexed_syntax_constant_index_cleanup_internal", "UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP-INTERNAL", 1, 0, false);
    //declareFunction(myName, "term_mt_count", "TERM-MT-COUNT", 1, 0, false);
    //declareFunction(myName, "mts_of_indexed_term", "MTS-OF-INDEXED-TERM", 1, 0, false);
    declareFunction(myName, "add_assertion_indices", "ADD-ASSERTION-INDICES", 1, 1, false);
    declareFunction(myName, "remove_assertion_indices", "REMOVE-ASSERTION-INDICES", 1, 1, false);
    declareFunction(myName, "remove_term_indices", "REMOVE-TERM-INDICES", 1, 0, false);
    declareFunction(myName, "determine_formula_indices", "DETERMINE-FORMULA-INDICES", 1, 0, false);
    declareFunction(myName, "determine_gaf_indices", "DETERMINE-GAF-INDICES", 2, 0, false);
    declareFunction(myName, "add_gaf_indices", "ADD-GAF-INDICES", 1, 1, false);
    declareFunction(myName, "remove_gaf_indices", "REMOVE-GAF-INDICES", 1, 1, false);
    //declareFunction(myName, "determine_function_indices", "DETERMINE-FUNCTION-INDICES", 1, 0, false);
    //declareFunction(myName, "add_function_indices", "ADD-FUNCTION-INDICES", 1, 1, false);
    //declareFunction(myName, "rem_function_indices", "REM-FUNCTION-INDICES", 1, 1, false);
    declareFunction(myName, "determine_rule_indices_int", "DETERMINE-RULE-INDICES-INT", 2, 0, false);
    declareFunction(myName, "determine_rule_indices", "DETERMINE-RULE-INDICES", 1, 0, false);
    declareFunction(myName, "add_rule_indices", "ADD-RULE-INDICES", 1, 1, false);
    declareFunction(myName, "remove_rule_indices", "REMOVE-RULE-INDICES", 1, 1, false);
    //declareFunction(myName, "best_nat_lookup_index", "BEST-NAT-LOOKUP-INDEX", 1, 1, false);
    //declareFunction(myName, "num_best_nat_lookup_index", "NUM-BEST-NAT-LOOKUP-INDEX", 1, 1, false);
    //declareFunction(myName, "best_nat_lookup_index_try_all_allowed", "BEST-NAT-LOOKUP-INDEX-TRY-ALL-ALLOWED", 2, 0, false);
    //declareFunction(myName, "num_best_nat_lookup_index_try_all_allowed", "NUM-BEST-NAT-LOOKUP-INDEX-TRY-ALL-ALLOWED", 2, 0, false);
    //declareFunction(myName, "best_nat_lookup_index_wrt_methods", "BEST-NAT-LOOKUP-INDEX-WRT-METHODS", 2, 0, false);
    //declareFunction(myName, "best_nat_lookup_index_int", "BEST-NAT-LOOKUP-INDEX-INT", 1, 0, false);
    //declareFunction(myName, "decent_nat_index_from_terms", "DECENT-NAT-INDEX-FROM-TERMS", 1, 0, false);
    declareFunction(myName, "dependent_narts", "DEPENDENT-NARTS", 1, 0, false);
    //declareFunction(myName, "decent_nat_index", "DECENT-NAT-INDEX", 1, 0, false);
    //declareFunction(myName, "best_nat_index_count", "BEST-NAT-INDEX-COUNT", 1, 0, false);
    declareFunction(myName, "decent_rule_index", "DECENT-RULE-INDEX", 1, 0, false);
    //declareFunction(myName, "all_rule_indices", "ALL-RULE-INDICES", 1, 0, false);
    //declareFunction(myName, "lookup_index_p", "LOOKUP-INDEX-P", 1, 0, false);
    declareFunction(myName, "lookup_index_get_property", "LOOKUP-INDEX-GET-PROPERTY", 2, 1, false);
    declareFunction(myName, "lookup_index_set_property", "LOOKUP-INDEX-SET-PROPERTY", 3, 0, false);
    declareFunction(myName, "lookup_index_get_type", "LOOKUP-INDEX-GET-TYPE", 1, 0, false);
    //declareFunction(myName, "lookup_index_predicate_extent_value", "LOOKUP-INDEX-PREDICATE-EXTENT-VALUE", 1, 0, false);
    declareFunction(myName, "lookup_index_gaf_arg_values", "LOOKUP-INDEX-GAF-ARG-VALUES", 1, 0, false);
    //declareFunction(myName, "lookup_index_overlap_value", "LOOKUP-INDEX-OVERLAP-VALUE", 1, 0, false);
    //declareFunction(myName, "lookup_index_for_overlap", "LOOKUP-INDEX-FOR-OVERLAP", 1, 0, false);
    declareFunction(myName, "lookup_index_for_predicate_extent", "LOOKUP-INDEX-FOR-PREDICATE-EXTENT", 1, 0, false);
    //declareFunction(myName, "lookup_index_for_function_extent", "LOOKUP-INDEX-FOR-FUNCTION-EXTENT", 1, 0, false);
    declareFunction(myName, "lookup_index_for_gaf_arg", "LOOKUP-INDEX-FOR-GAF-ARG", 3, 0, false);
    //declareFunction(myName, "lookup_index_for_nart_arg", "LOOKUP-INDEX-FOR-NART-ARG", 3, 0, false);
    declareFunction(myName, "lookup_methods_includeP", "LOOKUP-METHODS-INCLUDE?", 2, 0, false);
    //declareFunction(myName, "lookup_methods_allow_onlyP", "LOOKUP-METHODS-ALLOW-ONLY?", 2, 0, false);
    declareFunction(myName, "best_gaf_lookup_index", "BEST-GAF-LOOKUP-INDEX", 2, 1, false);
    declareFunction(myName, "num_best_gaf_lookup_index", "NUM-BEST-GAF-LOOKUP-INDEX", 2, 1, false);
    declareFunction(myName, "best_gaf_lookup_index_try_all_allowed", "BEST-GAF-LOOKUP-INDEX-TRY-ALL-ALLOWED", 3, 0, false);
    declareFunction(myName, "num_best_gaf_lookup_index_try_all_allowed", "NUM-BEST-GAF-LOOKUP-INDEX-TRY-ALL-ALLOWED", 3, 0, false);
    declareFunction(myName, "best_gaf_lookup_index_wrt_methods", "BEST-GAF-LOOKUP-INDEX-WRT-METHODS", 3, 0, false);
    declareFunction(myName, "best_gaf_lookup_index_int", "BEST-GAF-LOOKUP-INDEX-INT", 2, 0, false);
    //declareFunction(myName, "reindex_all_assertions", "REINDEX-ALL-ASSERTIONS", 0, 0, false);
    //declareFunction(myName, "reindex_one_of_all_assertions", "REINDEX-ONE-OF-ALL-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "reindex_all_term_assertions", "REINDEX-ALL-TERM-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "reindex_assertions", "REINDEX-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "reindex_assertion", "REINDEX-ASSERTION", 1, 1, false);
    declareFunction(myName, "find_assertion", "FIND-ASSERTION", 2, 0, false);
    declareFunction(myName, "find_assertion_internal", "FIND-ASSERTION-INTERNAL", 2, 0, false);
    declareFunction(myName, "find_assertion_any_mt", "FIND-ASSERTION-ANY-MT", 1, 0, false);
    //declareFunction(myName, "find_assertion_genl_mts", "FIND-ASSERTION-GENL-MTS", 2, 0, false);
    //declareFunction(myName, "find_all_assertions", "FIND-ALL-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "find_all_assertions_genl_mts", "FIND-ALL-ASSERTIONS-GENL-MTS", 2, 0, false);
    declareFunction(myName, "find_gaf", "FIND-GAF", 2, 0, false);
    declareFunction(myName, "find_gaf_any_mt", "FIND-GAF-ANY-MT", 1, 0, false);
    //declareFunction(myName, "find_gaf_genl_mts", "FIND-GAF-GENL-MTS", 2, 0, false);
    //declareFunction(myName, "find_all_gafs", "FIND-ALL-GAFS", 1, 0, false);
    declareFunction(myName, "find_gaf_in_relevant_mt", "FIND-GAF-IN-RELEVANT-MT", 1, 0, false);
    //declareFunction(myName, "find_gaf_possibly_in_mt", "FIND-GAF-POSSIBLY-IN-MT", 1, 1, false);
    //declareFunction(myName, "gaf_mts", "GAF-MTS", 1, 0, false);
    declareFunction(myName, "find_cnf", "FIND-CNF", 1, 0, false);
    declareFunction(myName, "find_gaf_cnf", "FIND-GAF-CNF", 1, 0, false);
    declareFunction(myName, "find_rule_cnf", "FIND-RULE-CNF", 1, 0, false);
    //declareFunction(myName, "find_rule_cnf_via_index", "FIND-RULE-CNF-VIA-INDEX", 2, 0, false);
    declareFunction(myName, "find_rule_cnf_via_index_int", "FIND-RULE-CNF-VIA-INDEX-INT", 3, 0, false);
    declareFunction(myName, "find_cnf_internal", "FIND-CNF-INTERNAL", 1, 0, false);
    declareFunction(myName, "find_gaf_formula", "FIND-GAF-FORMULA", 1, 0, false);
    declareFunction(myName, "find_gaf_internal", "FIND-GAF-INTERNAL", 2, 0, false);
    //declareFunction(myName, "asent_kb_lookup", "ASENT-KB-LOOKUP", 1, 0, false);
    //declareFunction(myName, "asent_kb_lookup_in_any_mt", "ASENT-KB-LOOKUP-IN-ANY-MT", 1, 0, false);
    //declareFunction(myName, "find_clause_struc", "FIND-CLAUSE-STRUC", 1, 0, false);
    //declareFunction(myName, "gather_all_el_rule_assertions_for_term", "GATHER-ALL-EL-RULE-ASSERTIONS-FOR-TERM", 1, 0, false);
    //declareFunction(myName, "gather_all_rule_assertions_for_term", "GATHER-ALL-RULE-ASSERTIONS-FOR-TERM", 1, 0, false);
    //declareFunction(myName, "gather_all_rule_assertions_for_pred", "GATHER-ALL-RULE-ASSERTIONS-FOR-PRED", 1, 0, false);
    //declareFunction(myName, "gather_one_rule_assertion", "GATHER-ONE-RULE-ASSERTION", 1, 0, false);
    //declareFunction(myName, "gather_all_isa_rule_assertions_for_col", "GATHER-ALL-ISA-RULE-ASSERTIONS-FOR-COL", 1, 0, false);
    //declareFunction(myName, "gather_all_genls_rule_assertions_for_col", "GATHER-ALL-GENLS-RULE-ASSERTIONS-FOR-COL", 1, 0, false);
    //declareFunction(myName, "gather_all_other_rule_assertions_for_term", "GATHER-ALL-OTHER-RULE-ASSERTIONS-FOR-TERM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_indexing_file() {
    $key_gaf_arg_index_cached_caching_state$ = deflexical("*KEY-GAF-ARG-INDEX-CACHED-CACHING-STATE*", NIL);
    $reindex_all_assertions_full_gc_threshhold_constant_count$ = deflexical("*REINDEX-ALL-ASSERTIONS-FULL-GC-THRESHHOLD-CONSTANT-COUNT*", $int194$10000);
    $warn_on_assertion_reindexing_errorsP$ = defparameter("*WARN-ON-ASSERTION-REINDEXING-ERRORS?*", NIL);
    $gathered_rule_assertions$ = defparameter("*GATHERED-RULE-ASSERTIONS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_indexing_file() {
    // CVS_ID("Id: kb-indexing.lisp 128471 2009-08-03 20:26:07Z pace ");
    utilities_macros.register_cyc_api_function($sym2$NUM_GAF_ARG_INDEX, $list3, $str4$Return_the_number_of_gafs_indexed, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym7$RELEVANT_NUM_GAF_ARG_INDEX, $list8, $str9$Return_the_assertion_count_at_rel, NIL, $list5);
    memoization_state.note_globally_cached_function($sym11$KEY_GAF_ARG_INDEX_CACHED);
    utilities_macros.register_cyc_api_function($sym6$KEY_GAF_ARG_INDEX, $list8, $str16$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym19$NUM_NART_ARG_INDEX, $list20, $str21$Return_the_number_of___termOfUnit, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym22$RELEVANT_NUM_NART_ARG_INDEX, $list20, $str23$Compute_the_assertion_count_at_re, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym24$KEY_NART_ARG_INDEX, $list20, $str25$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym27$NUM_PREDICATE_EXTENT_INDEX, $list28, $str29$Return_the_assertion_count_at_PRE, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym31$RELEVANT_NUM_PREDICATE_EXTENT_INDEX, $list32, $str33$Compute_the_assertion_count_at_re, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym30$KEY_PREDICATE_EXTENT_INDEX, $list32, $str35$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym37$NUM_FUNCTION_EXTENT_INDEX, $list38, $str39$Return_the_function_extent_of_FUN, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym40$RELEVANT_NUM_FUNCTION_EXTENT_INDEX, $list38, $str41$Compute_the_function_extent_at_re, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym43$NUM_PREDICATE_RULE_INDEX, $list44, $str45$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym46$KEY_PREDICATE_RULE_INDEX, $list49, $str50$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym52$NUM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list53, $str54$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym55$KEY_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list56, $str57$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym59$NUM_ISA_RULE_INDEX, $list60, $str61$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym62$KEY_ISA_RULE_INDEX, $list65, $str66$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym68$NUM_QUOTED_ISA_RULE_INDEX, $list60, $str61$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym69$KEY_QUOTED_ISA_RULE_INDEX, $list65, $str66$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym73$NUM_GENLS_RULE_INDEX, $list60, $str61$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym74$KEY_GENLS_RULE_INDEX, $list65, $str66$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym78$NUM_GENL_MT_RULE_INDEX, $list60, $str61$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym79$KEY_GENL_MT_RULE_INDEX, $list65, $str66$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym83$NUM_FUNCTION_RULE_INDEX, $list84, $str85$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym86$KEY_FUNCTION_RULE_INDEX, $list89, $str90$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym92$NUM_EXCEPTION_RULE_INDEX, $list93, $str94$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym95$KEY_EXCEPTION_RULE_INDEX, $list98, $str99$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym101$NUM_PRAGMA_RULE_INDEX, $list93, $str94$Return_the_raw_assertion_count_at, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym102$KEY_PRAGMA_RULE_INDEX, $list98, $str99$Return_a_list_of_the_keys_to_the_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym109$NUM_MT_INDEX, $list110, $str111$Return_the_number_of_assertions_a, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym114$NUM_OTHER_INDEX, $list110, $str115$Return_the_number_of_assertions_a, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym117$NUM_INDEX, $list110, $str118$The_total_number_of_assertions_in, NIL, $list5);
    utilities_macros.register_cyc_api_function($sym131$REMOVE_TERM_INDICES, $list110, $str132$Remove_all_assertions_about_TERM_, NIL, $list133);
    access_macros.define_obsolete_register($sym170$DECENT_NAT_INDEX, $list171);
    access_macros.define_obsolete_register($sym172$BEST_NAT_INDEX_COUNT, $list173);
    utilities_macros.register_cyc_api_function($sym208$FIND_ASSERTION, $list209, $str210$Find_the_assertion_in_MT_with_CNF, $list211, $list212);
    utilities_macros.register_cyc_api_function($sym214$FIND_ASSERTION_ANY_MT, $list215, $str216$Find_any_assertion_in_any_mt_with, $list217, $list212);
    utilities_macros.register_cyc_api_function($sym218$FIND_ALL_ASSERTIONS, $list215, $str219$Return_all_assertions_that_have_C, $list217, $list220);
    utilities_macros.register_cyc_api_function($sym222$FIND_GAF, $list223, $str224$Find_the_assertion_in_MT_with_GAF, $list225, $list212);
    utilities_macros.register_cyc_api_function($sym226$FIND_GAF_ANY_MT, $list227, $str228$Find_any_assertion_in_any_mt_with, $list229, $list212);
    utilities_macros.register_cyc_api_function($sym231$FIND_ALL_GAFS, $list227, $str232$Return_all_assertions_of_GAF_FORM, $list229, $list220);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INTERMEDIATE_INDEX_P = makeSymbol("INTERMEDIATE-INDEX-P");
  public static final SubLSymbol $sym1$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym2$NUM_GAF_ARG_INDEX = makeSymbol("NUM-GAF-ARG-INDEX");
  public static final SubLList $list3 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("ARGNUM"), makeSymbol("PRED"), makeSymbol("MT"));
  public static final SubLString $str4$Return_the_number_of_gafs_indexed = makeString("Return the number of gafs indexed off of TERM ARGNUM PRED MT.");
  public static final SubLList $list5 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $sym6$KEY_GAF_ARG_INDEX = makeSymbol("KEY-GAF-ARG-INDEX");
  public static final SubLSymbol $sym7$RELEVANT_NUM_GAF_ARG_INDEX = makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX");
  public static final SubLList $list8 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("ARGNUM"), makeSymbol("PRED"));
  public static final SubLString $str9$Return_the_assertion_count_at_rel = makeString("Return the assertion count at relevant mts under TERM ARGNUM PRED.");
  public static final SubLSymbol $sym10$RELEVANT_NUM_GAF_ARG_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF");
  public static final SubLSymbol $sym11$KEY_GAF_ARG_INDEX_CACHED = makeSymbol("KEY-GAF-ARG-INDEX-CACHED");
  public static final SubLSymbol $sym12$_KEY_GAF_ARG_INDEX_CACHED_CACHING_STATE_ = makeSymbol("*KEY-GAF-ARG-INDEX-CACHED-CACHING-STATE*");
  public static final SubLInteger $int13$5000 = makeInteger(5000);
  public static final SubLSymbol $sym14$CLEAR_KEY_GAF_ARG_INDEX_CACHED = makeSymbol("CLEAR-KEY-GAF-ARG-INDEX-CACHED");
  public static final SubLSymbol $kw15$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str16$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below TERM ARGNUM PRED.\n   @note destructible");
  public static final SubLList $list17 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $kw18$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $sym19$NUM_NART_ARG_INDEX = makeSymbol("NUM-NART-ARG-INDEX");
  public static final SubLList $list20 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("ARGNUM"), makeSymbol("FUNC"));
  public static final SubLString $str21$Return_the_number_of___termOfUnit = makeString("Return the number of #$termOfUnit gafs indexed off of TERM ARGNUM FUNC.");
  public static final SubLSymbol $sym22$RELEVANT_NUM_NART_ARG_INDEX = makeSymbol("RELEVANT-NUM-NART-ARG-INDEX");
  public static final SubLString $str23$Compute_the_assertion_count_at_re = makeString("Compute the assertion count at relevant mts under TERM ARGNUM FUNC.\n   This will be the entire count extent if *tou-mt* is relevant,\n   and zero otherwise.");
  public static final SubLSymbol $sym24$KEY_NART_ARG_INDEX = makeSymbol("KEY-NART-ARG-INDEX");
  public static final SubLString $str25$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below TERM ARGNUM FUNC.");
  public static final SubLSymbol $kw26$NART_ARG = makeKeyword("NART-ARG");
  public static final SubLSymbol $sym27$NUM_PREDICATE_EXTENT_INDEX = makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
  public static final SubLList $list28 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str29$Return_the_assertion_count_at_PRE = makeString("Return the assertion count at PRED MT.");
  public static final SubLSymbol $sym30$KEY_PREDICATE_EXTENT_INDEX = makeSymbol("KEY-PREDICATE-EXTENT-INDEX");
  public static final SubLSymbol $sym31$RELEVANT_NUM_PREDICATE_EXTENT_INDEX = makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX");
  public static final SubLList $list32 = list(makeSymbol("PRED"));
  public static final SubLString $str33$Compute_the_assertion_count_at_re = makeString("Compute the assertion count at relevant mts under PRED.");
  public static final SubLSymbol $sym34$RELEVANT_NUM_PREDICATE_EXTENT_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF");
  public static final SubLString $str35$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next predicate-extent index level below PRED.");
  public static final SubLSymbol $kw36$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $sym37$NUM_FUNCTION_EXTENT_INDEX = makeSymbol("NUM-FUNCTION-EXTENT-INDEX");
  public static final SubLList $list38 = list(makeSymbol("FUNC"));
  public static final SubLString $str39$Return_the_function_extent_of_FUN = makeString("Return the function extent of FUNC.");
  public static final SubLSymbol $sym40$RELEVANT_NUM_FUNCTION_EXTENT_INDEX = makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX");
  public static final SubLString $str41$Compute_the_function_extent_at_re = makeString("Compute the function extent at relevant mts under FUNC.\n   This will be the entire function extent if *tou-mt* is relevant,\n   and zero otherwise.");
  public static final SubLSymbol $kw42$FUNCTION_EXTENT = makeKeyword("FUNCTION-EXTENT");
  public static final SubLSymbol $sym43$NUM_PREDICATE_RULE_INDEX = makeSymbol("NUM-PREDICATE-RULE-INDEX");
  public static final SubLList $list44 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str45$Return_the_raw_assertion_count_at = makeString("Return the raw assertion count at PRED SENSE MT DIRECTION.");
  public static final SubLSymbol $sym46$KEY_PREDICATE_RULE_INDEX = makeSymbol("KEY-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym47$RELEVANT_NUM_PREDICATE_RULE_INDEX = makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $sym48$RELEVANT_NUM_PREDICATE_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF");
  public static final SubLList $list49 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE"), makeSymbol("MT"));
  public static final SubLString $str50$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below PRED SENSE MT.");
  public static final SubLSymbol $kw51$PREDICATE_RULE = makeKeyword("PREDICATE-RULE");
  public static final SubLSymbol $sym52$NUM_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
  public static final SubLList $list53 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE"), makeSymbol("DIRECTION"));
  public static final SubLString $str54$Return_the_raw_assertion_count_at = makeString("Return the raw assertion count at PRED SENSE DIRECTION.");
  public static final SubLSymbol $sym55$KEY_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
  public static final SubLList $list56 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE"));
  public static final SubLString $str57$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below PRED SENSE.");
  public static final SubLSymbol $kw58$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
  public static final SubLSymbol $sym59$NUM_ISA_RULE_INDEX = makeSymbol("NUM-ISA-RULE-INDEX");
  public static final SubLList $list60 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str61$Return_the_raw_assertion_count_at = makeString("Return the raw assertion count at COL SENSE MT DIRECTION.");
  public static final SubLSymbol $sym62$KEY_ISA_RULE_INDEX = makeSymbol("KEY-ISA-RULE-INDEX");
  public static final SubLSymbol $sym63$RELEVANT_NUM_ISA_RULE_INDEX = makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX");
  public static final SubLSymbol $sym64$RELEVANT_NUM_ISA_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF");
  public static final SubLList $list65 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("SENSE"), makeSymbol("MT"));
  public static final SubLString $str66$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below COL SENSE MT.");
  public static final SubLSymbol $kw67$ISA_RULE = makeKeyword("ISA-RULE");
  public static final SubLSymbol $sym68$NUM_QUOTED_ISA_RULE_INDEX = makeSymbol("NUM-QUOTED-ISA-RULE-INDEX");
  public static final SubLSymbol $sym69$KEY_QUOTED_ISA_RULE_INDEX = makeSymbol("KEY-QUOTED-ISA-RULE-INDEX");
  public static final SubLSymbol $sym70$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX = makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX");
  public static final SubLSymbol $sym71$RELEVANT_NUM_QUOTED_ISA_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF");
  public static final SubLSymbol $kw72$QUOTED_ISA_RULE = makeKeyword("QUOTED-ISA-RULE");
  public static final SubLSymbol $sym73$NUM_GENLS_RULE_INDEX = makeSymbol("NUM-GENLS-RULE-INDEX");
  public static final SubLSymbol $sym74$KEY_GENLS_RULE_INDEX = makeSymbol("KEY-GENLS-RULE-INDEX");
  public static final SubLSymbol $sym75$RELEVANT_NUM_GENLS_RULE_INDEX = makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX");
  public static final SubLSymbol $sym76$RELEVANT_NUM_GENLS_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF");
  public static final SubLSymbol $kw77$GENLS_RULE = makeKeyword("GENLS-RULE");
  public static final SubLSymbol $sym78$NUM_GENL_MT_RULE_INDEX = makeSymbol("NUM-GENL-MT-RULE-INDEX");
  public static final SubLSymbol $sym79$KEY_GENL_MT_RULE_INDEX = makeSymbol("KEY-GENL-MT-RULE-INDEX");
  public static final SubLSymbol $sym80$RELEVANT_NUM_GENL_MT_RULE_INDEX = makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX");
  public static final SubLSymbol $sym81$RELEVANT_NUM_GENL_MT_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF");
  public static final SubLSymbol $kw82$GENL_MT_RULE = makeKeyword("GENL-MT-RULE");
  public static final SubLSymbol $sym83$NUM_FUNCTION_RULE_INDEX = makeSymbol("NUM-FUNCTION-RULE-INDEX");
  public static final SubLList $list84 = list(makeSymbol("FUNC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str85$Return_the_raw_assertion_count_at = makeString("Return the raw assertion count at FUNC MT DIRECTION.");
  public static final SubLSymbol $sym86$KEY_FUNCTION_RULE_INDEX = makeSymbol("KEY-FUNCTION-RULE-INDEX");
  public static final SubLSymbol $sym87$RELEVANT_NUM_FUNCTION_RULE_INDEX = makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX");
  public static final SubLSymbol $sym88$RELEVANT_NUM_FUNCTION_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF");
  public static final SubLList $list89 = list(makeSymbol("FUNC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str90$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below FUNC MT.");
  public static final SubLSymbol $kw91$FUNCTION_RULE = makeKeyword("FUNCTION-RULE");
  public static final SubLSymbol $sym92$NUM_EXCEPTION_RULE_INDEX = makeSymbol("NUM-EXCEPTION-RULE-INDEX");
  public static final SubLList $list93 = list(makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str94$Return_the_raw_assertion_count_at = makeString("Return the raw assertion count at RULE MT DIRECTION.");
  public static final SubLSymbol $sym95$KEY_EXCEPTION_RULE_INDEX = makeSymbol("KEY-EXCEPTION-RULE-INDEX");
  public static final SubLSymbol $sym96$RELEVANT_NUM_EXCEPTION_RULE_INDEX = makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX");
  public static final SubLSymbol $sym97$RELEVANT_NUM_EXCEPTION_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF");
  public static final SubLList $list98 = list(makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str99$Return_a_list_of_the_keys_to_the_ = makeString("Return a list of the keys to the next index level below RULE MT.");
  public static final SubLSymbol $kw100$EXCEPTION_RULE = makeKeyword("EXCEPTION-RULE");
  public static final SubLSymbol $sym101$NUM_PRAGMA_RULE_INDEX = makeSymbol("NUM-PRAGMA-RULE-INDEX");
  public static final SubLSymbol $sym102$KEY_PRAGMA_RULE_INDEX = makeSymbol("KEY-PRAGMA-RULE-INDEX");
  public static final SubLSymbol $sym103$RELEVANT_NUM_PRAGMA_RULE_INDEX = makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX");
  public static final SubLSymbol $sym104$RELEVANT_NUM_PRAGMA_RULE_INDEX_WITH_CUTOFF = makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF");
  public static final SubLSymbol $kw105$PRAGMA_RULE = makeKeyword("PRAGMA-RULE");
  public static final SubLSymbol $sym106$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const107$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw108$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym109$NUM_MT_INDEX = makeSymbol("NUM-MT-INDEX");
  public static final SubLList $list110 = list(makeSymbol("TERM"));
  public static final SubLString $str111$Return_the_number_of_assertions_a = makeString("Return the number of assertions at the mt index for TERM.");
  public static final SubLSymbol $kw112$IST = makeKeyword("IST");
  public static final SubLObject $const113$BroadMicrotheory = constant_handles.reader_make_constant_shell(makeString("BroadMicrotheory"));
  public static final SubLSymbol $sym114$NUM_OTHER_INDEX = makeSymbol("NUM-OTHER-INDEX");
  public static final SubLString $str115$Return_the_number_of_assertions_a = makeString("Return the number of assertions at the other index for TERM.");
  public static final SubLSymbol $kw116$OTHER = makeKeyword("OTHER");
  public static final SubLSymbol $sym117$NUM_INDEX = makeSymbol("NUM-INDEX");
  public static final SubLString $str118$The_total_number_of_assertions_in = makeString("The total number of assertions indexed from TERM.");
  public static final SubLString $str119$Performing_indexing_cleanup___ = makeString("Performing indexing cleanup...");
  public static final SubLSymbol $sym120$UNINDEXED_SYNTAX_CONSTANT_INDEX_CLEANUP_INTERNAL = makeSymbol("UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP-INTERNAL");
  public static final SubLSymbol $sym121$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym122$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  public static final SubLSymbol $sym123$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $kw124$POS = makeKeyword("POS");
  public static final SubLSymbol $kw125$NEG = makeKeyword("NEG");
  public static final SubLSymbol $sym126$_ = makeSymbol(">");
  public static final SubLObject $const127$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const128$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const129$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLString $str130$indexing_problem_while_removing__ = makeString("indexing problem while removing ~S");
  public static final SubLSymbol $sym131$REMOVE_TERM_INDICES = makeSymbol("REMOVE-TERM-INDICES");
  public static final SubLString $str132$Remove_all_assertions_about_TERM_ = makeString("Remove all assertions about TERM from the KB. Return the TERM.");
  public static final SubLList $list133 = list(makeSymbol("INDEXED-TERM-P"));
  public static final SubLSymbol $kw134$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym135$VALID_FULLY_INDEXED_TERM_P = makeSymbol("VALID-FULLY-INDEXED-TERM-P");
  public static final SubLSymbol $sym136$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym137$FULLY_INDEXED_HLMT_TERM_P = makeSymbol("FULLY-INDEXED-HLMT-TERM-P");
  public static final SubLString $str138$So_don_t_ = makeString("So don't!");
  public static final SubLString $str139$Don_t_know_how_to_index__S = makeString("Don't know how to index ~S");
  public static final SubLList $list140 = cons(makeSymbol("ARGNUM"), makeSymbol("ARG"));
  public static final SubLList $list141 = cons(makeSymbol("F-ARGNUM"), makeSymbol("F-ARG"));
  public static final SubLSymbol $kw142$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw143$PRED = makeKeyword("PRED");
  public static final SubLObject $const144$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $kw145$QUOTED_ISA = makeKeyword("QUOTED-ISA");
  public static final SubLSymbol $kw146$GENLS = makeKeyword("GENLS");
  public static final SubLObject $const147$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw148$GENL_MT = makeKeyword("GENL-MT");
  public static final SubLSymbol $kw149$FUNC = makeKeyword("FUNC");
  public static final SubLObject $const150$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLSymbol $kw151$EXCEPTION = makeKeyword("EXCEPTION");
  public static final SubLObject $const152$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("meetsPragmaticRequirement"));
  public static final SubLSymbol $kw153$PRAGMA = makeKeyword("PRAGMA");
  public static final SubLObject $const154$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $kw155$IST_PRED = makeKeyword("IST-PRED");
  public static final SubLSymbol $sym156$FULLY_INDEXED_TERM_P = makeSymbol("FULLY-INDEXED-TERM-P");
  public static final SubLSymbol $sym157$SECOND = makeSymbol("SECOND");
  public static final SubLList $list158 = list(makeSymbol("NEG-INDEXING-TYPE"), makeSymbol("NEG-TERM"));
  public static final SubLString $str159$Can_t_index_a_pragmatic_requireme = makeString("Can't index a pragmatic requirement as a neg-lit ~S");
  public static final SubLString $str160$Can_t_index_an_exception_as_a_neg = makeString("Can't index an exception as a neg-lit ~S");
  public static final SubLString $str161$Don_t_know_how_to_handle_indexing = makeString("Don't know how to handle indexing type ~S");
  public static final SubLList $list162 = list(makeSymbol("POS-INDEXING-TYPE"), makeSymbol("POS-TERM"));
  public static final SubLString $str163$Can_t_index_a_function_rule_as_a_ = makeString("Can't index a function rule as a pos-lit ~S");
  public static final SubLString $str164$Can_t_remove_the_index_of_a_pragm = makeString("Can't remove the index of a pragmatic requirement as a neg-lit ~S");
  public static final SubLString $str165$Can_t_remove_the_index_of_an_exce = makeString("Can't remove the index of an exception as a neg-lit ~S");
  public static final SubLString $str166$Can_t_remove_the_index_of_a_funct = makeString("Can't remove the index of a function rule as a pos-lit ~S");
  public static final SubLSymbol $kw167$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $sym168$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw169$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym170$DECENT_NAT_INDEX = makeSymbol("DECENT-NAT-INDEX");
  public static final SubLList $list171 = list(makeSymbol("BEST-NAT-LOOKUP-INDEX"));
  public static final SubLSymbol $sym172$BEST_NAT_INDEX_COUNT = makeSymbol("BEST-NAT-INDEX-COUNT");
  public static final SubLList $list173 = list(makeSymbol("NUM-BEST-NAT-LOOKUP-INDEX"));
  public static final SubLSymbol $kw174$PRED_POS = makeKeyword("PRED-POS");
  public static final SubLSymbol $kw175$IST_PRED_POS = makeKeyword("IST-PRED-POS");
  public static final SubLSymbol $kw176$ISA_POS = makeKeyword("ISA-POS");
  public static final SubLSymbol $kw177$QUOTED_ISA_POS = makeKeyword("QUOTED-ISA-POS");
  public static final SubLSymbol $kw178$GENLS_POS = makeKeyword("GENLS-POS");
  public static final SubLSymbol $kw179$GENL_MT_POS = makeKeyword("GENL-MT-POS");
  public static final SubLSymbol $kw180$PRED_NEG = makeKeyword("PRED-NEG");
  public static final SubLSymbol $kw181$IST_PRED_NEG = makeKeyword("IST-PRED-NEG");
  public static final SubLSymbol $kw182$ISA_NEG = makeKeyword("ISA-NEG");
  public static final SubLSymbol $kw183$QUOTED_ISA_NEG = makeKeyword("QUOTED-ISA-NEG");
  public static final SubLSymbol $kw184$GENLS_NEG = makeKeyword("GENLS-NEG");
  public static final SubLSymbol $kw185$GENL_MT_NEG = makeKeyword("GENL-MT-NEG");
  public static final SubLList $list186 = list(makeSymbol("NEG-INDEXING-TYPE"), makeSymbol("TERM"));
  public static final SubLList $list187 = list(makeSymbol("POS-INDEXING-TYPE"), makeSymbol("TERM"));
  public static final SubLSymbol $kw188$INDEX_TYPE = makeKeyword("INDEX-TYPE");
  public static final SubLSymbol $kw189$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw190$TERM = makeKeyword("TERM");
  public static final SubLSymbol $kw191$ARGNUM = makeKeyword("ARGNUM");
  public static final SubLSymbol $kw192$TERMS = makeKeyword("TERMS");
  public static final SubLSymbol $kw193$FUNCTOR = makeKeyword("FUNCTOR");
  public static final SubLInteger $int194$10000 = makeInteger(10000);
  public static final SubLString $str195$Clearing_FORT_indexing = makeString("Clearing FORT indexing");
  public static final SubLSymbol $kw196$SKIP = makeKeyword("SKIP");
  public static final SubLString $str197$Clearing_Assertion_indexing = makeString("Clearing Assertion indexing");
  public static final SubLSymbol $sym198$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str199$Reindexing_assertions = makeString("Reindexing assertions");
  public static final SubLSymbol $sym200$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw201$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym202$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str203$Error_when_indexing_assertion__A_ = makeString("Error when indexing assertion ~A: ~A.~%");
  public static final SubLSymbol $sym204$_ = makeSymbol("<");
  public static final SubLSymbol $sym205$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym206$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $sym207$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym208$FIND_ASSERTION = makeSymbol("FIND-ASSERTION");
  public static final SubLList $list209 = list(makeSymbol("CNF"), makeSymbol("MT"));
  public static final SubLString $str210$Find_the_assertion_in_MT_with_CNF = makeString("Find the assertion in MT with CNF.  Return NIL if not present.");
  public static final SubLList $list211 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));
  public static final SubLList $list212 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $sym213$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym214$FIND_ASSERTION_ANY_MT = makeSymbol("FIND-ASSERTION-ANY-MT");
  public static final SubLList $list215 = list(makeSymbol("CNF"));
  public static final SubLString $str216$Find_any_assertion_in_any_mt_with = makeString("Find any assertion in any mt with CNF.  Return NIL if none are present.");
  public static final SubLList $list217 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")));
  public static final SubLSymbol $sym218$FIND_ALL_ASSERTIONS = makeSymbol("FIND-ALL-ASSERTIONS");
  public static final SubLString $str219$Return_all_assertions_that_have_C = makeString("Return all assertions that have CNF or NIL if there aren't any.\n   @note destructible");
  public static final SubLList $list220 = list(list(makeSymbol("NIL-OR"), list(makeSymbol("LIST"), makeSymbol("ASSERTION-P"))));
  public static final SubLSymbol $sym221$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym222$FIND_GAF = makeSymbol("FIND-GAF");
  public static final SubLList $list223 = list(makeSymbol("GAF-FORMULA"), makeSymbol("MT"));
  public static final SubLString $str224$Find_the_assertion_in_MT_with_GAF = makeString("Find the assertion in MT with GAF-FORMULA as its formula.  Return NIL if not present.");
  public static final SubLList $list225 = list(list(makeSymbol("GAF-FORMULA"), makeSymbol("EL-FORMULA-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));
  public static final SubLSymbol $sym226$FIND_GAF_ANY_MT = makeSymbol("FIND-GAF-ANY-MT");
  public static final SubLList $list227 = list(makeSymbol("GAF-FORMULA"));
  public static final SubLString $str228$Find_any_assertion_in_any_mt_with = makeString("Find any assertion in any mt with GAF-FORMULA as its formula.  Return NIL if not present.");
  public static final SubLList $list229 = list(list(makeSymbol("GAF-FORMULA"), makeSymbol("EL-FORMULA-P")));
  public static final SubLSymbol $sym230$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym231$FIND_ALL_GAFS = makeSymbol("FIND-ALL-GAFS");
  public static final SubLString $str232$Return_all_assertions_of_GAF_FORM = makeString("Return all assertions of GAF-FORMULA or NIL if there aren't any.\n   @note destructible");
  public static final SubLList $list233 = list(makeSymbol("INDEX"), makeSymbol("TERM"));
  public static final SubLSymbol $kw234$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $sym235$FIND_CNF_INTERNAL = makeSymbol("FIND-CNF-INTERNAL");
  public static final SubLSymbol $sym236$ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");
  public static final SubLSymbol $sym237$GATHER_ONE_RULE_ASSERTION = makeSymbol("GATHER-ONE-RULE-ASSERTION");
  public static final SubLList $list238 = list(makeKeyword("NEG"), makeKeyword("POS"));
  public static final SubLObject $const239$implies = constant_handles.reader_make_constant_shell(makeString("implies"));

  //// Initializers

  public void declareFunctions() {
    declare_kb_indexing_file();
  }

  public void initializeVariables() {
    init_kb_indexing_file();
  }

  public void runTopLevelForms() {
    setup_kb_indexing_file();
  }

}
