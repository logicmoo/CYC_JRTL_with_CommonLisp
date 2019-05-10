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

package com.cyc.cycjava_1.cycl.inference;
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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.equals;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class inference_completeness_utilities extends SubLTranslatedFile {

  //// Constructor

  private inference_completeness_utilities() {}
  public static final SubLFile me = new inference_completeness_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.inference_completeness_utilities";

  //// Definitions

  /** @return nil or gaf-assertion?; a gaf assertion justifying
the fact that PREDICATE's extent is completely asserted in MT and its genlMts.
If there is more than one such assertion, the inferentially strongest one will be returned. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 2177) 
  public static final SubLObject inference_complete_extent_asserted_gaf(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gaf = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.complete_extent_asserted_gaf(predicate, UNPROVIDED);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return gaf;
      }
    }
  }

  /** @return list of gaf-assertion?; a list of gaf assertions, each of which independently
justify the fact that PREDICATE's extent for VALUE in ARGNUM is completely asserted in MT and its genlMts.
The list of assertions is returned in a partial order of strength, with the inferentially
strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 3439) 
  public static final SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs_internal(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gafs = NIL;
        {
          SubLObject stronger_gaf = inference_complete_extent_asserted_gaf(predicate, mt);
          SubLObject var = stronger_gaf;
          if ((NIL != var)) {
            gafs = cons(var, gafs);
          }
        }
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject gaf = kb_accessors.complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
                SubLObject var = gaf;
                if ((NIL != var)) {
                  gafs = cons(var, gafs);
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.nreverse(gafs);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 3439) 
  public static final SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym2$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym2$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym2$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if ((value == cached_args.first())) {
                      cached_args = cached_args.rest();
                      if ((argnum == cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args)
                             && (NIL == cached_args.rest())
                             && (mt == cached_args.first()))) {
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
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, value, argnum, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** @return list of gaf-assertion?; a list of gaf assertions, each of which independently
justify the fact that PREDICATE's extent is completely enumerable in MT.
The list of assertions is returned in a partial order of strength, with the inferentially
strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 4969) 
  public static final SubLObject inference_complete_extent_enumerable_gafs_internal(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gafs = NIL;
        {
          SubLObject stronger_gaf = inference_complete_extent_asserted_gaf(predicate, mt);
          SubLObject var = stronger_gaf;
          if ((NIL != var)) {
            gafs = cons(var, gafs);
          }
        }
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject gaf = kb_accessors.complete_extent_enumerable_gaf(predicate, UNPROVIDED);
                SubLObject var = gaf;
                if ((NIL != var)) {
                  gafs = cons(var, gafs);
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.nreverse(gafs);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 4969) 
  public static final SubLObject inference_complete_extent_enumerable_gafs(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_complete_extent_enumerable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_complete_extent_enumerable_gafs_internal(predicate, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** @return list of gaf-assertion?; a list of gaf assertions, each of which independently
justify the fact that PREDICATE's extent is completely decidable in MT.
The list of assertions is returned in a partial order of strength, with the inferentially
strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 6361) 
  public static final SubLObject inference_complete_extent_decidable_gafs_internal(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gafs = NIL;
        SubLObject stronger_gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject cdolist_list_var = stronger_gafs;
        SubLObject stronger_gaf = NIL;
        for (stronger_gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), stronger_gaf = cdolist_list_var.first()) {
          gafs = cons(stronger_gaf, gafs);
        }
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject gaf = kb_accessors.complete_extent_decidable_gaf(predicate, UNPROVIDED);
                SubLObject var = gaf;
                if ((NIL != var)) {
                  gafs = cons(var, gafs);
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.nreverse(gafs);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 6361) 
  public static final SubLObject inference_complete_extent_decidable_gafs(SubLObject predicate, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_complete_extent_decidable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_complete_extent_decidable_gafs_internal(predicate, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** @return list of gaf-assertion?; a list of gaf assertions, each of which independently
justify the fact that PREDICATE's extent is completely enumerable for ARGNUM in MT.
The list of assertions is returned in a partial order of strength, with the inferentially
strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 7882) 
  public static final SubLObject inference_complete_extent_enumerable_for_arg_gafs_internal(SubLObject predicate, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gafs = NIL;
        SubLObject stronger_gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject cdolist_list_var = stronger_gafs;
        SubLObject stronger_gaf = NIL;
        for (stronger_gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), stronger_gaf = cdolist_list_var.first()) {
          gafs = cons(stronger_gaf, gafs);
        }
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject gaf = kb_accessors.complete_extent_enumerable_for_arg_gaf(predicate, argnum, UNPROVIDED);
                SubLObject var = gaf;
                if ((NIL != var)) {
                  gafs = cons(var, gafs);
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.nreverse(gafs);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 7882) 
  public static final SubLObject inference_complete_extent_enumerable_for_arg_gafs(SubLObject predicate, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, THREE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if ((argnum == cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && (mt == cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, argnum, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** @return list of gaf-assertion?; a list of gaf assertions, each of which independently
justify the fact that PREDICATE's extent is completely enumerable for VALUE in ARGNUM in MT.
The list of assertions is returned in a partial order of strength, with the inferentially
strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 9555) 
  public static final SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gafs = NIL;
        {
          SubLObject stronger_gafs = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
          SubLObject cdolist_list_var = stronger_gafs;
          SubLObject stronger_gaf = NIL;
          for (stronger_gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), stronger_gaf = cdolist_list_var.first()) {
            gafs = cons(stronger_gaf, gafs);
          }
        }
        {
          SubLObject stronger_gafs = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
          SubLObject cdolist_list_var = stronger_gafs;
          SubLObject stronger_gaf = NIL;
          for (stronger_gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), stronger_gaf = cdolist_list_var.first()) {
            gafs = cons(stronger_gaf, gafs);
          }
        }
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject gaf = kb_accessors.complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
                SubLObject var = gaf;
                if ((NIL != var)) {
                  gafs = cons(var, gafs);
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.nreverse(gafs);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 9555) 
  public static final SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if ((value == cached_args.first())) {
                      cached_args = cached_args.rest();
                      if ((argnum == cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args)
                             && (NIL == cached_args.rest())
                             && (mt == cached_args.first()))) {
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
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, value, argnum, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** @return list of gaf-assertion?; a list of gaf assertions, each of which independently
justify the fact that PREDICATE's extent is completely decidable for ARGNUM in MT.
The list of assertions is returned in a partial order of strength, with the inferentially
strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 11665) 
  public static final SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs_internal(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gafs = NIL;
        SubLObject stronger_gafs = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject cdolist_list_var = stronger_gafs;
        SubLObject stronger_gaf = NIL;
        for (stronger_gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), stronger_gaf = cdolist_list_var.first()) {
          gafs = cons(stronger_gaf, gafs);
        }
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject gaf = kb_accessors.complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
                SubLObject var = gaf;
                if ((NIL != var)) {
                  gafs = cons(var, gafs);
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Sequences.nreverse(gafs);
      }
    }
  }

  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 11665) 
  public static final SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if ((value == cached_args.first())) {
                      cached_args = cached_args.rest();
                      if ((argnum == cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args)
                             && (NIL == cached_args.rest())
                             && (mt == cached_args.first()))) {
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
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, value, argnum, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** @return nil or gaf-assertion?; a gaf assertion justifying
the fact that COLLECTION is completely enumerable in MT.
If there is more than one such assertion, the inferentially strongest one will be returned. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 12900) 
  public static final SubLObject inference_completely_enumerable_collection_gaf(SubLObject collection, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      mt = completeness_constraint_mt(mt);
      {
        SubLObject gaf = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.completely_enumerable_collection_gaf(collection, UNPROVIDED);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return gaf;
      }
    }
  }

  /** @return boolean; whether all bindings for free variables in ASENT
can be completely enumerated in MT.  If ASENT is closed, return
whether the truth of ASENT can be completely decided with no transformation. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 14811) 
  public static final SubLObject inference_complete_asentP(SubLObject asent, SubLObject mt) {
    if ((NIL != variables.fully_bound_p(asent))) {
      return inference_completely_decidable_asentP(asent, mt);
    } else {
      return inference_completely_enumerable_asentP(asent, mt);
    }
  }

  /** @return boolean; whether all bindings for free variables in ASENT
are completely asserted in MT.  If ASENT is closed, return
whether the truth of ASENT can be completely decided via assertion lookup. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 15261) 
  public static final SubLObject inference_completely_asserted_asentP(SubLObject asent, SubLObject mt) {
    return list_utilities.sublisp_boolean(inference_completely_asserted_asent_gaf(asent, mt));
  }

  /** @return nil or gaf-assertion?; if all bindings for free variables in ASENT
are completely asserted in MT, or if ASENT is closed and its
truth can be completely decided via assertion lookup, return a gaf
assertion justifying this claim. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 15602) 
  public static final SubLObject inference_completely_asserted_asent_gaf(SubLObject asent, SubLObject mt) {
    return inference_completely_asserted_asent_gafs(asent, mt).first();
  }

  /** @return list of gaf-assertion?; if all bindings for free variables in ASENT
are completely asserted in MT, or if ASENT is closed and its
truth can be completely decided via assertion lookup, return a list of
gaf assertion justifying this claim.  The list of assertions is returned
in a partial order of strength, with the inferentially strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 15981) 
  public static final SubLObject inference_completely_asserted_asent_gafs(SubLObject asent, SubLObject mt) {
    mt = completeness_constraint_mt(mt);
    {
      SubLObject result_gafs = NIL;
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL != forts.fort_p(predicate))) {
        {
          SubLObject gaf = inference_complete_extent_asserted_gaf(predicate, mt);
          if ((NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
            {
              SubLObject var = gaf;
              if ((NIL != var)) {
                result_gafs = cons(var, result_gafs);
              }
            }
          }
        }
        {
          SubLObject terms = cycl_utilities.formula_terms(asent, $kw9$IGNORE);
          SubLObject list_var = NIL;
          SubLObject value = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != variables.fully_bound_p(value))) {
              {
                SubLObject gafs = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
                if ((NIL != gafs)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                    {
                      SubLObject cdolist_list_var = gafs;
                      SubLObject gaf = NIL;
                      for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                        {
                          SubLObject item_var = gaf;
                          if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                            result_gafs = cons(item_var, result_gafs);
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
      return Sequences.nreverse(result_gafs);
    }
  }

  /** @return boolean; whether all bindings for free variables in ASENT
can be completely enumerated in MT.  If ASENT is closed, return
whether the truth of ASENT can be completely decided with no transformation. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 17217) 
  public static final SubLObject inference_completely_enumerable_asentP(SubLObject asent, SubLObject mt) {
    return list_utilities.sublisp_boolean(inference_completely_enumerable_asent_gaf(asent, mt));
  }

  /** @return nil or gaf-assertion?; if all bindings for free variables in ASENT
can be completely enumerated in MT, or if ASENT is closed and its
truth can be completely decided with no transformation, return a gaf
assertion justifying this claim. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 17569) 
  public static final SubLObject inference_completely_enumerable_asent_gaf(SubLObject asent, SubLObject mt) {
    return inference_completely_enumerable_asent_gafs(asent, mt);
  }

  /** @return list of gaf-assertion?; if all bindings for free variables in ASENT
can be completely enumerated in MT, or if ASENT is closed and its
truth can be completely decided with no transformation, return a list of gaf
assertions justifying this claim.  The list of assertions is returned
in a partial order of strength, with the inferentially strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 17951) 
  public static final SubLObject inference_completely_enumerable_asent_gafs(SubLObject asent, SubLObject mt) {
    mt = completeness_constraint_mt(mt);
    {
      SubLObject result_gafs = NIL;
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL != forts.fort_p(predicate))) {
        {
          SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
          if ((NIL != gafs)) {
            if ((NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
              {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                  result_gafs = cons(gaf, result_gafs);
                }
              }
            }
          }
        }
        if (($const10$isa == predicate)) {
          {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL != forts.fort_p(collection))) {
              {
                SubLObject gaf = inference_completely_enumerable_collection_gaf(collection, mt);
                if ((NIL != gaf)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                    result_gafs = cons(gaf, result_gafs);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject terms = cycl_utilities.formula_terms(asent, $kw9$IGNORE);
          SubLObject list_var = NIL;
          SubLObject value = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != variables.fully_bound_p(value))) {
              {
                SubLObject gafs = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                if ((NIL != gafs)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                    {
                      SubLObject cdolist_list_var = gafs;
                      SubLObject gaf = NIL;
                      for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                        {
                          SubLObject item_var = gaf;
                          if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                            result_gafs = cons(item_var, result_gafs);
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
          SubLObject terms = cycl_utilities.formula_terms(asent, $kw9$IGNORE);
          SubLObject list_var = NIL;
          SubLObject value = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != variables.fully_bound_p(value))) {
              {
                SubLObject gafs = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                if ((NIL != gafs)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                    {
                      SubLObject cdolist_list_var = gafs;
                      SubLObject gaf = NIL;
                      for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                        {
                          SubLObject item_var = gaf;
                          if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                            result_gafs = cons(item_var, result_gafs);
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
      return Sequences.nreverse(result_gafs);
    }
  }

  /** @return boolean; whether the truth of ASENT can be completely decided with no transformation. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 19998) 
  public static final SubLObject inference_completely_decidable_asentP(SubLObject asent, SubLObject mt) {
    return list_utilities.sublisp_boolean(inference_completely_decidable_asent_gaf(asent, mt));
  }

  /** @return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,
return a gaf assertion justifying this claim. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 20235) 
  public static final SubLObject inference_completely_decidable_asent_gaf(SubLObject asent, SubLObject mt) {
    return inference_completely_decidable_asent_gafs(asent, mt).first();
  }

  /** @return nil or gaf-assertion?; if the truth of ASENT can be completely decided with no transformation,
return a list of gaf assertions justifying this claim.  The list of assertions is returned
in a partial order of strength, with the inferentially strongest assertion first. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 20529) 
  public static final SubLObject inference_completely_decidable_asent_gafs(SubLObject asent, SubLObject mt) {
    mt = completeness_constraint_mt(mt);
    {
      SubLObject result_gafs = NIL;
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL != forts.fort_p(predicate))) {
        {
          SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
          if ((NIL != gafs)) {
            if ((NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
              {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                  result_gafs = cons(gaf, result_gafs);
                }
              }
            }
          }
        }
        if (($const10$isa == predicate)) {
          {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL != forts.fort_p(collection))) {
              {
                SubLObject gaf = inference_completely_enumerable_collection_gaf(collection, mt);
                if ((NIL != gaf)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                    result_gafs = cons(gaf, result_gafs);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject gafs = inference_complete_extent_decidable_gafs(predicate, mt);
          if ((NIL != gafs)) {
            if ((NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
              {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                  {
                    SubLObject item_var = gaf;
                    if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                      result_gafs = cons(item_var, result_gafs);
                    }
                  }
                }
              }
            }
          }
        }
        if (($const10$isa == predicate)) {
          {
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            if ((NIL != forts.fort_p(collection))) {
              {
                SubLObject gafs = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3454");
                if ((NIL != gafs)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                    {
                      SubLObject cdolist_list_var = gafs;
                      SubLObject gaf = NIL;
                      for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                        {
                          SubLObject item_var = gaf;
                          if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                            result_gafs = cons(item_var, result_gafs);
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
          SubLObject terms = cycl_utilities.formula_terms(asent, $kw9$IGNORE);
          SubLObject list_var = NIL;
          SubLObject value = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != variables.fully_bound_p(value))) {
              {
                SubLObject gafs = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                if ((NIL != gafs)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                    {
                      SubLObject cdolist_list_var = gafs;
                      SubLObject gaf = NIL;
                      for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                        {
                          SubLObject item_var = gaf;
                          if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                            result_gafs = cons(item_var, result_gafs);
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
          SubLObject terms = cycl_utilities.formula_terms(asent, $kw9$IGNORE);
          SubLObject list_var = NIL;
          SubLObject value = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, value = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), value = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != variables.fully_bound_p(value))) {
              {
                SubLObject gafs = inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                if ((NIL != gafs)) {
                  if ((NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                    {
                      SubLObject cdolist_list_var = gafs;
                      SubLObject gaf = NIL;
                      for (gaf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), gaf = cdolist_list_var.first()) {
                        {
                          SubLObject item_var = gaf;
                          if ((NIL == conses_high.member(item_var, result_gafs, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY)))) {
                            result_gafs = cons(item_var, result_gafs);
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
      return Sequences.nreverse(result_gafs);
    }
  }

  /** Assuming that we are doing inference in MT, return the mt in which we look
for completeness assertions.  If all mts are relevant, we need to be conservative
and only look for universally true completeness assertions. */
  @SubL(source = "cycl/inference/inference-completeness-utilities.lisp", position = 23154) 
  public static final SubLObject completeness_constraint_mt(SubLObject mt) {
    return mt_relevance_macros.conservative_constraint_mt(mt);
  }

  public static final SubLObject declare_inference_completeness_utilities_file() {
    //declareFunction(myName, "inference_minimize_extentP_internal", "INFERENCE-MINIMIZE-EXTENT?-INTERNAL", 1, 0, false);
    //declareFunction(myName, "inference_minimize_extentP", "INFERENCE-MINIMIZE-EXTENT?", 1, 0, false);
    //declareFunction(myName, "inference_complete_extent_assertedP", "INFERENCE-COMPLETE-EXTENT-ASSERTED?", 2, 0, false);
    declareFunction(myName, "inference_complete_extent_asserted_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-GAF", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_asserted_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG?", 4, 0, false);
    //declareFunction(myName, "inference_complete_extent_asserted_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
    declareFunction(myName, "inference_complete_extent_asserted_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
    declareFunction(myName, "inference_complete_extent_asserted_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerableP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE?", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAF", 2, 0, false);
    declareFunction(myName, "inference_complete_extent_enumerable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_complete_extent_enumerable_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_decidableP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE?", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_decidable_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAF", 2, 0, false);
    declareFunction(myName, "inference_complete_extent_decidable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS-INTERNAL", 2, 0, false);
    declareFunction(myName, "inference_complete_extent_decidable_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_for_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG?", 3, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_for_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAF", 3, 0, false);
    declareFunction(myName, "inference_complete_extent_enumerable_for_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS-INTERNAL", 3, 0, false);
    declareFunction(myName, "inference_complete_extent_enumerable_for_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS", 3, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
    declareFunction(myName, "inference_complete_extent_enumerable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
    declareFunction(myName, "inference_complete_extent_enumerable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
    //declareFunction(myName, "inference_complete_extent_decidable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
    //declareFunction(myName, "inference_complete_extent_decidable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
    declareFunction(myName, "inference_complete_extent_decidable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
    declareFunction(myName, "inference_complete_extent_decidable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
    //declareFunction(myName, "inference_completely_enumerable_collectionP", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION?", 2, 0, false);
    declareFunction(myName, "inference_completely_enumerable_collection_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION-GAF", 2, 0, false);
    //declareFunction(myName, "inference_completely_decidable_collectionP", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION?", 2, 0, false);
    //declareFunction(myName, "inference_completely_decidable_collection_gaf", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAF", 2, 0, false);
    //declareFunction(myName, "inference_completely_decidable_collection_gafs_internal", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_completely_decidable_collection_gafs", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS", 2, 0, false);
    declareFunction(myName, "inference_complete_asentP", "INFERENCE-COMPLETE-ASENT?", 2, 0, false);
    declareFunction(myName, "inference_completely_asserted_asentP", "INFERENCE-COMPLETELY-ASSERTED-ASENT?", 2, 0, false);
    declareFunction(myName, "inference_completely_asserted_asent_gaf", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAF", 2, 0, false);
    declareFunction(myName, "inference_completely_asserted_asent_gafs", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS", 2, 0, false);
    declareFunction(myName, "inference_completely_enumerable_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT?", 2, 0, false);
    declareFunction(myName, "inference_completely_enumerable_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAF", 2, 0, false);
    declareFunction(myName, "inference_completely_enumerable_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS", 2, 0, false);
    declareFunction(myName, "inference_completely_decidable_asentP", "INFERENCE-COMPLETELY-DECIDABLE-ASENT?", 2, 0, false);
    declareFunction(myName, "inference_completely_decidable_asent_gaf", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAF", 2, 0, false);
    declareFunction(myName, "inference_completely_decidable_asent_gafs", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS", 2, 0, false);
    declareFunction(myName, "completeness_constraint_mt", "COMPLETENESS-CONSTRAINT-MT", 1, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_via_backchainP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_via_backchain_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_via_backchain_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS-INTERNAL", 2, 0, false);
    //declareFunction(myName, "inference_complete_extent_enumerable_via_backchain_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS", 2, 0, false);
    //declareFunction(myName, "inference_collection_completely_enumerable_via_backchainP", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
    //declareFunction(myName, "inference_collection_completely_enumerable_via_backchain_gaf", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
    //declareFunction(myName, "inference_completely_enumerable_via_backchain_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT?", 2, 0, false);
    //declareFunction(myName, "inference_completely_enumerable_via_backchain_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAF", 2, 0, false);
    //declareFunction(myName, "inference_completely_enumerable_via_backchain_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAFS", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_completeness_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_inference_completeness_utilities_file() {
    // CVS_ID("Id: inference-completeness-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    memoization_state.note_memoized_function($sym0$INFERENCE_MINIMIZE_EXTENT_);
    memoization_state.note_memoized_function($sym2$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS);
    memoization_state.note_memoized_function($sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS);
    memoization_state.note_memoized_function($sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS);
    memoization_state.note_memoized_function($sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS);
    memoization_state.note_memoized_function($sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS);
    memoization_state.note_memoized_function($sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS);
    memoization_state.note_memoized_function($sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS);
    memoization_state.note_memoized_function($sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INFERENCE_MINIMIZE_EXTENT_ = makeSymbol("INFERENCE-MINIMIZE-EXTENT?");
  public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym2$INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS");
  public static final SubLSymbol $sym3$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS");
  public static final SubLSymbol $sym4$INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS");
  public static final SubLSymbol $sym5$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS");
  public static final SubLSymbol $sym6$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS");
  public static final SubLSymbol $sym7$INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS");
  public static final SubLSymbol $sym8$INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS = makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS");
  public static final SubLSymbol $kw9$IGNORE = makeKeyword("IGNORE");
  public static final SubLObject $const10$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym11$INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS");

  //// Initializers

  public void declareFunctions() {
    declare_inference_completeness_utilities_file();
  }

  public void initializeVariables() {
    init_inference_completeness_utilities_file();
  }

  public void runTopLevelForms() {
    setup_inference_completeness_utilities_file();
  }

}
