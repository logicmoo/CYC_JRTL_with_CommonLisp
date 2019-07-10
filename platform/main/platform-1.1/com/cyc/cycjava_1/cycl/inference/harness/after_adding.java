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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.rule_after_adding;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class after_adding extends SubLTranslatedFile {

  //// Constructor

  private after_adding() {}
  public static final SubLFile me = new after_adding();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.after_adding";

  //// Definitions

  /** Set this to T if you want to see errors caused by afterAddings instead of catching them */
  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 750) 
  public static SubLSymbol $debug_after_addingsP$ = null;

  /** The predicates whose extent implement the afterAdding and afterRemoving support. */
  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 895) 
  public static SubLSymbol $gaf_after_adding_predicates$ = null;

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1075) 
  private static SubLSymbol $gaf_after_addings_hash$ = null;

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1188) 
  private static SubLSymbol $gaf_after_removings_hash$ = null;

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1251) 
  public static final SubLObject clear_after_addings() {
    clear_gaf_after_addings();
    rule_after_adding.clear_rule_after_addings();
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1400) 
  public static final SubLObject clear_gaf_after_addings() {
    if ((NIL != $gaf_after_addings_hash$.getGlobalValue())) {
      Hashtables.clrhash($gaf_after_addings_hash$.getGlobalValue());
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1535) 
  public static final SubLObject clear_after_removings() {
    clear_gaf_after_removings();
    rule_after_adding.clear_rule_after_removings();
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 1653) 
  public static final SubLObject clear_gaf_after_removings() {
    if ((NIL != $gaf_after_removings_hash$.getGlobalValue())) {
      Hashtables.clrhash($gaf_after_removings_hash$.getGlobalValue());
    }
    return NIL;
  }

  /** When non-nil, afterAddings are disabled. */
  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 2168) 
  public static SubLSymbol $after_addings_disabledP$ = null;

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 2307) 
  public static final SubLObject handle_after_addings(SubLObject argument, SubLObject assertion) {
    handle_gaf_after_addings(argument, assertion);
    if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
      rule_after_adding.handle_rule_after_addings(argument, assertion);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 2575) 
  public static final SubLObject handle_gaf_after_addings(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argument, $sym5$ARGUMENT_P);
      checkType(assertion, $sym6$ASSERTION_P);
      if ((NIL == $after_addings_disabledP$.getDynamicValue(thread))) {
        if ((NIL != assertions_high.gaf_assertionP(assertion))) {
          {
            SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if ((NIL != forts.fort_p(pred))) {
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
                      SubLObject cdolist_list_var = get_gaf_after_addings(pred);
                      SubLObject info = NIL;
                      for (info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), info = cdolist_list_var.first()) {
                        {
                          SubLObject datum = info;
                          SubLObject current = datum;
                          SubLObject fun = NIL;
                          SubLObject fun_mt = NIL;
                          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                          fun = current.first();
                          current = current.rest();
                          fun_mt = current;
                          if ((fun.isFunctionSpec()
                               && (NIL != mt_relevance_macros.relevant_mtP(fun_mt)))) {
                            if ((NIL == $debug_after_addingsP$.getDynamicValue(thread))) {
                              {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                  {
                                    SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                      Errors.$error_handler$.bind(Symbols.symbol_function($sym9$IGNORE_ERRORS_HANDLER), thread);
                                      try {
                                        handle_gaf_after_adding(fun, argument, assertion);
                                      } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                      }
                                    } finally {
                                      Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                    }
                                  }
                                } catch (Throwable ccatch_env_var) {
                                  ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw8$IGNORE_ERRORS_TARGET);
                                }
                              }
                            } else {
                              handle_gaf_after_adding(fun, argument, assertion);
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
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 3258) 
  public static final SubLObject handle_after_removings(SubLObject argument, SubLObject assertion) {
    handle_gaf_after_removings(argument, assertion);
    if ((NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED))) {
      rule_after_adding.handle_rule_after_removings(argument, assertion);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 3534) 
  public static final SubLObject handle_gaf_after_removings(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argument, $sym5$ARGUMENT_P);
      checkType(assertion, $sym6$ASSERTION_P);
      if ((NIL != assertions_high.gaf_assertionP(assertion))) {
        {
          SubLObject pred = assertions_high.gaf_arg(assertion, ZERO_INTEGER);
          SubLObject mt = assertions_high.assertion_mt(assertion);
          if ((NIL != forts.fort_p(pred))) {
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
                    SubLObject cdolist_list_var = get_gaf_after_removings(pred);
                    SubLObject info = NIL;
                    for (info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), info = cdolist_list_var.first()) {
                      {
                        SubLObject datum = info;
                        SubLObject current = datum;
                        SubLObject fun = NIL;
                        SubLObject fun_mt = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                        fun = current.first();
                        current = current.rest();
                        fun_mt = current;
                        if ((fun.isFunctionSpec()
                             && (NIL != mt_relevance_macros.relevant_mtP(fun_mt)))) {
                          if ((NIL == $debug_after_addingsP$.getDynamicValue(thread))) {
                            {
                              SubLObject ignore_errors_tag = NIL;
                              try {
                                {
                                  SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                  try {
                                    Errors.$error_handler$.bind(Symbols.symbol_function($sym9$IGNORE_ERRORS_HANDLER), thread);
                                    try {
                                      handle_gaf_after_removing(fun, argument, assertion);
                                    } catch (Throwable catch_var) {
                                      Errors.handleThrowable(catch_var, NIL);
                                    }
                                  } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                  }
                                }
                              } catch (Throwable ccatch_env_var) {
                                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw8$IGNORE_ERRORS_TARGET);
                              }
                            }
                          } else {
                            handle_gaf_after_removing(fun, argument, assertion);
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
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 4182) 
  public static final SubLObject get_gaf_after_addings(SubLObject pred) {
    if ((NIL == $gaf_after_addings_hash$.getGlobalValue())) {
      initialize_gaf_after_addings_hash();
    }
    {
      SubLObject result = Hashtables.gethash_without_values(pred, $gaf_after_addings_hash$.getGlobalValue(), NIL);
      if ((NIL != somewhere_cache.somewhere_cached_pred_p(pred))) {
        result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 4520) 
  public static final SubLObject get_gaf_after_removings(SubLObject pred) {
    if ((NIL == $gaf_after_removings_hash$.getGlobalValue())) {
      initialize_gaf_after_removings_hash();
    }
    {
      SubLObject result = Hashtables.gethash_without_values(pred, $gaf_after_removings_hash$.getGlobalValue(), NIL);
      if ((NIL != somewhere_cache.somewhere_cached_pred_p(pred))) {
        result = cons(somewhere_cache.$somewhere_cache_gaf_after_adding_info$.getGlobalValue(), result);
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 4852) 
  public static final SubLObject handle_gaf_after_adding(SubLObject function, SubLObject argument, SubLObject assertion) {
    {
      SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        Functions.funcall(function, argument, assertion);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5006) 
  public static final SubLObject handle_gaf_after_removing(SubLObject function, SubLObject argument, SubLObject assertion) {
    {
      SubLObject lock = control_vars.$hl_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        Functions.funcall(function, argument, assertion);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5161) 
  public static final SubLObject rebuild_after_adding_caches() {
    rebuild_gaf_after_adding_caches();
    rule_after_adding.rebuild_rule_after_adding_caches();
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5353) 
  public static final SubLObject rebuild_gaf_after_adding_caches() {
    initialize_gaf_after_addings_hash();
    initialize_gaf_after_removings_hash();
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 5498) 
  public static final SubLObject initialize_gaf_after_addings_hash() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $gaf_after_addings_hash$.getGlobalValue())) {
        Hashtables.clrhash($gaf_after_addings_hash$.getGlobalValue());
      } else {
        $gaf_after_addings_hash$.setGlobalValue(Hashtables.make_hash_table($int10$100, UNPROVIDED, UNPROVIDED));
      }
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const12$EverythingPSC, thread);
          {
            SubLObject pred_var = $const13$afterAdding;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw14$GAF, NIL, NIL);
                          {
                            SubLObject done_var_3 = NIL;
                            SubLObject token_var_4 = NIL;
                            while ((NIL == done_var_3)) {
                              {
                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                SubLObject valid_5 = makeBoolean((token_var_4 != ass));
                                if ((NIL != valid_5)) {
                                  {
                                    SubLObject formula = assertions_high.gaf_formula(ass);
                                    SubLObject datum = formula;
                                    SubLObject current = datum;
                                    SubLObject gaf_after_adding_pred = NIL;
                                    SubLObject pred = NIL;
                                    SubLObject gaf_after_adding = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
                                    gaf_after_adding_pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
                                    pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list15);
                                    gaf_after_adding = current.first();
                                    current = current.rest();
                                    if ((NIL == current)) {
                                      if ((NIL != forts.valid_fortP(pred))) {
                                        gaf_after_adding = el_utilities.cycl_subl_symbol_symbol(gaf_after_adding);
                                        {
                                          SubLObject item_var = cons(gaf_after_adding, assertions_high.assertion_mt(ass));
                                          if ((NIL == conses_high.member(item_var, Hashtables.gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                            Hashtables.sethash(pred, $gaf_after_addings_hash$.getGlobalValue(), cons(item_var, Hashtables.gethash(pred, $gaf_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                          }
                                        }
                                      }
                                    } else {
                                      cdestructuring_bind.cdestructuring_bind_error(datum, $list15);
                                    }
                                  }
                                }
                                done_var_3 = makeBoolean((NIL == valid_5));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
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
        } finally {
          mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/after-adding.lisp", position = 6150) 
  public static final SubLObject initialize_gaf_after_removings_hash() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!($gaf_after_removings_hash$.getGlobalValue().isHashtable()))) {
        $gaf_after_removings_hash$.setGlobalValue(Hashtables.make_hash_table($int10$100, UNPROVIDED, UNPROVIDED));
      } else {
        Hashtables.clrhash($gaf_after_removings_hash$.getGlobalValue());
      }
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym11$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const12$EverythingPSC, thread);
          {
            SubLObject pred_var = $const16$afterRemoving;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw14$GAF, NIL, NIL);
                          {
                            SubLObject done_var_7 = NIL;
                            SubLObject token_var_8 = NIL;
                            while ((NIL == done_var_7)) {
                              {
                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                SubLObject valid_9 = makeBoolean((token_var_8 != ass));
                                if ((NIL != valid_9)) {
                                  {
                                    SubLObject formula = assertions_high.gaf_formula(ass);
                                    SubLObject datum = formula;
                                    SubLObject current = datum;
                                    SubLObject gaf_after_removing_pred = NIL;
                                    SubLObject pred = NIL;
                                    SubLObject gaf_after_removing = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
                                    gaf_after_removing_pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
                                    pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list17);
                                    gaf_after_removing = current.first();
                                    current = current.rest();
                                    if ((NIL == current)) {
                                      if ((NIL != forts.valid_fortP(pred))) {
                                        gaf_after_removing = el_utilities.cycl_subl_symbol_symbol(gaf_after_removing);
                                        {
                                          SubLObject item_var = cons(gaf_after_removing, assertions_high.assertion_mt(ass));
                                          if ((NIL == conses_high.member(item_var, Hashtables.gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                            Hashtables.sethash(pred, $gaf_after_removings_hash$.getGlobalValue(), cons(item_var, Hashtables.gethash(pred, $gaf_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                          }
                                        }
                                      }
                                    } else {
                                      cdestructuring_bind.cdestructuring_bind_error(datum, $list17);
                                    }
                                  }
                                }
                                done_var_7 = makeBoolean((NIL == valid_9));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
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
        } finally {
          mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_after_adding_file() {
    declareFunction(myName, "clear_after_addings", "CLEAR-AFTER-ADDINGS", 0, 0, false);
    declareFunction(myName, "clear_gaf_after_addings", "CLEAR-GAF-AFTER-ADDINGS", 0, 0, false);
    declareFunction(myName, "clear_after_removings", "CLEAR-AFTER-REMOVINGS", 0, 0, false);
    declareFunction(myName, "clear_gaf_after_removings", "CLEAR-GAF-AFTER-REMOVINGS", 0, 0, false);
    declareMacro(myName, "disable_after_addings", "DISABLE-AFTER-ADDINGS");
    declareFunction(myName, "handle_after_addings", "HANDLE-AFTER-ADDINGS", 2, 0, false);
    declareFunction(myName, "handle_gaf_after_addings", "HANDLE-GAF-AFTER-ADDINGS", 2, 0, false);
    declareFunction(myName, "handle_after_removings", "HANDLE-AFTER-REMOVINGS", 2, 0, false);
    declareFunction(myName, "handle_gaf_after_removings", "HANDLE-GAF-AFTER-REMOVINGS", 2, 0, false);
    declareFunction(myName, "get_gaf_after_addings", "GET-GAF-AFTER-ADDINGS", 1, 0, false);
    declareFunction(myName, "get_gaf_after_removings", "GET-GAF-AFTER-REMOVINGS", 1, 0, false);
    declareFunction(myName, "handle_gaf_after_adding", "HANDLE-GAF-AFTER-ADDING", 3, 0, false);
    declareFunction(myName, "handle_gaf_after_removing", "HANDLE-GAF-AFTER-REMOVING", 3, 0, false);
    declareFunction(myName, "rebuild_after_adding_caches", "REBUILD-AFTER-ADDING-CACHES", 0, 0, false);
    declareFunction(myName, "rebuild_gaf_after_adding_caches", "REBUILD-GAF-AFTER-ADDING-CACHES", 0, 0, false);
    declareFunction(myName, "initialize_gaf_after_addings_hash", "INITIALIZE-GAF-AFTER-ADDINGS-HASH", 0, 0, false);
    declareFunction(myName, "initialize_gaf_after_removings_hash", "INITIALIZE-GAF-AFTER-REMOVINGS-HASH", 0, 0, false);
    declareFunction(myName, "recache_gaf_after_addings", "RECACHE-GAF-AFTER-ADDINGS", 1, 0, false);
    declareFunction(myName, "recache_gaf_after_removings", "RECACHE-GAF-AFTER-REMOVINGS", 1, 0, false);
    declareFunction(myName, "propagate_gaf_after_adding", "PROPAGATE-GAF-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "repropagate_gaf_after_adding", "REPROPAGATE-GAF-AFTER-ADDING", 3, 0, false);
    declareFunction(myName, "repropagate_gaf_after_adding_internal", "REPROPAGATE-GAF-AFTER-ADDING-INTERNAL", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_after_adding_file() {
    $debug_after_addingsP$ = defparameter("*DEBUG-AFTER-ADDINGS?*", NIL);
    $gaf_after_adding_predicates$ = deflexical("*GAF-AFTER-ADDING-PREDICATES*", $list0);
    $gaf_after_addings_hash$ = deflexical("*GAF-AFTER-ADDINGS-HASH*", maybeDefault( $sym1$_GAF_AFTER_ADDINGS_HASH_, $gaf_after_addings_hash$, NIL));
    $gaf_after_removings_hash$ = deflexical("*GAF-AFTER-REMOVINGS-HASH*", maybeDefault( $sym2$_GAF_AFTER_REMOVINGS_HASH_, $gaf_after_removings_hash$, NIL));
    $after_addings_disabledP$ = defparameter("*AFTER-ADDINGS-DISABLED?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_after_adding_file() {
    // CVS_ID("Id: after-adding.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym1$_GAF_AFTER_ADDINGS_HASH_);
    subl_macro_promotions.declare_defglobal($sym2$_GAF_AFTER_REMOVINGS_HASH_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(constant_handles.reader_make_constant_shell(makeString("afterAdding")), constant_handles.reader_make_constant_shell(makeString("afterRemoving")));
  public static final SubLSymbol $sym1$_GAF_AFTER_ADDINGS_HASH_ = makeSymbol("*GAF-AFTER-ADDINGS-HASH*");
  public static final SubLSymbol $sym2$_GAF_AFTER_REMOVINGS_HASH_ = makeSymbol("*GAF-AFTER-REMOVINGS-HASH*");
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLList $list4 = list(list(makeSymbol("*AFTER-ADDINGS-DISABLED?*"), T));
  public static final SubLSymbol $sym5$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $sym6$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLList $list7 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));
  public static final SubLSymbol $kw8$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym9$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLInteger $int10$100 = makeInteger(100);
  public static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const12$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const13$afterAdding = constant_handles.reader_make_constant_shell(makeString("afterAdding"));
  public static final SubLSymbol $kw14$GAF = makeKeyword("GAF");
  public static final SubLList $list15 = list(makeSymbol("GAF-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-ADDING"));
  public static final SubLObject $const16$afterRemoving = constant_handles.reader_make_constant_shell(makeString("afterRemoving"));
  public static final SubLList $list17 = list(makeSymbol("GAF-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("GAF-AFTER-REMOVING"));
  public static final SubLSymbol $sym18$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw19$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym20$PROPAGATE_GAF_AFTER_ADDING = makeSymbol("PROPAGATE-GAF-AFTER-ADDING");
  public static final SubLSymbol $sym21$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym22$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym23$RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");
  public static final SubLSymbol $sym24$REPROPAGATE_GAF_AFTER_ADDING_INTERNAL = makeSymbol("REPROPAGATE-GAF-AFTER-ADDING-INTERNAL");
  public static final SubLSymbol $sym25$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");

  //// Initializers

  public void declareFunctions() {
    declare_after_adding_file();
  }

  public void initializeVariables() {
    init_after_adding_file();
  }

  public void runTopLevelForms() {
    setup_after_adding_file();
  }

}
