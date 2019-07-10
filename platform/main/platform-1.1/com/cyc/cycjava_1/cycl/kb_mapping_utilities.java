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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_mapping_utilities extends SubLTranslatedFile {

  //// Constructor

  private kb_mapping_utilities() {}
  public static final SubLFile me = new kb_mapping_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_mapping_utilities";

  //// Definitions

  /** Find the first gaf assertion such that:
 (a) the assertion is in a relevant microtheory (relevance is established outside)
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return T if such an assertion exists, otherwise return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 1395) 
  public static final SubLObject some_pred_value(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject truth) {
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
            SubLObject done_var = answer;
            SubLObject token_var = NIL;
            while ((NIL == done_var)) {
              {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean((token_var != final_index_spec));
                if ((NIL != valid)) {
                  {
                    SubLObject final_index_iterator = NIL;
                    try {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_1 = answer;
                        SubLObject token_var_2 = NIL;
                        while ((NIL == done_var_1)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                            SubLObject valid_3 = makeBoolean((token_var_2 != assertion));
                            if ((NIL != valid_3)) {
                              if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                              }
                              answer = T;
                            }
                            done_var_1 = makeBoolean(((NIL == valid_3)
                                  || (NIL != answer)));
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
                      || (NIL != answer)));
              }
            }
          }
        }
        return answer;
      }
    }
  }

  /** Find the first gaf assertion such that:
 (a) the assertion is allowed to be in any microtheory
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return T if such an assertion exists, otherwise return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 3594) 
  public static final SubLObject some_pred_value_in_any_mt(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject truth) {
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const24$EverythingPSC, thread);
            answer = some_pred_value(v_term, pred, index_arg, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** If MT is NIL, behaves like SOME-PRED-VALUE.  Otherwise, behaves like SOME-PRED-VALUE-IN-MT */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 4245) 
  public static final SubLObject some_pred_value_in_relevant_mts(SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            answer = some_pred_value(v_term, pred, index_arg, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** Find the first gaf assertion such that: 
 (a) the assertion is in a relevant microtheory (relevance is established outside) 
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value 
 (c) PRED is the predicate used. 
 (d) TERM is the term in the INDEX-ARG position.
 (e) TEST returns non-nil when applied to assertion.
 Return T if such an assertion exists, otherwise return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 4694) 
  public static final SubLObject some_pred_value_if(SubLObject v_term, SubLObject pred, SubLObject test, SubLObject index_arg, SubLObject truth) {
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(test, $sym30$FUNCTION_SPEC_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
            SubLObject done_var = answer;
            SubLObject token_var = NIL;
            while ((NIL == done_var)) {
              {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean((token_var != final_index_spec));
                if ((NIL != valid)) {
                  {
                    SubLObject final_index_iterator = NIL;
                    try {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_4 = answer;
                        SubLObject token_var_5 = NIL;
                        while ((NIL == done_var_4)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                            SubLObject valid_6 = makeBoolean((token_var_5 != assertion));
                            if ((NIL != valid_6)) {
                              if ((NIL != Functions.funcall(test, assertion))) {
                                if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                  Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                answer = T;
                              }
                            }
                            done_var_4 = makeBoolean(((NIL == valid_6)
                                  || (NIL != answer)));
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
                      || (NIL != answer)));
              }
            }
          }
        }
        return answer;
      }
    }
  }

  /** Find the first gaf assertion such that:
 (a) the assertion is in a relevant microtheory (relevance is established outside)
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARGNUM position.
 Return the gaf if it exists.
 Otherwise, return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 5754) 
  public static final SubLObject fpred_value_gaf(SubLObject v_term, SubLObject pred, SubLObject index_argnum, SubLObject truth) {
    if ((index_argnum == UNPROVIDED)) {
      index_argnum = ONE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_argnum, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_argnum, pred_var);
            SubLObject done_var = answer;
            SubLObject token_var = NIL;
            while ((NIL == done_var)) {
              {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean((token_var != final_index_spec));
                if ((NIL != valid)) {
                  {
                    SubLObject final_index_iterator = NIL;
                    try {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_7 = answer;
                        SubLObject token_var_8 = NIL;
                        while ((NIL == done_var_7)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                            SubLObject valid_9 = makeBoolean((token_var_8 != assertion));
                            if ((NIL != valid_9)) {
                              if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                              }
                              answer = assertion;
                            }
                            done_var_7 = makeBoolean(((NIL == valid_9)
                                  || (NIL != answer)));
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
                      || (NIL != answer)));
              }
            }
          }
        }
        return answer;
      }
    }
  }

  /** If MT is NIL, behaves like FPRED-VALUE-GAF.  Otherwise, looks in all genlMts of MT. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 6499) 
  public static final SubLObject fpred_value_gaf_in_relevant_mts(SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_argnum, SubLObject truth) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((index_argnum == UNPROVIDED)) {
      index_argnum = ONE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            answer = fpred_value_gaf(v_term, pred, index_argnum, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** Find the first gaf assertion such that:
 (a) the assertion is in a relevant microtheory (relevance is established outside)
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return the term in the GATHER-ARG position if such an assertion exists.
 Otherwise, return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 6819) 
  public static final SubLObject fpred_value(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((gather_arg == UNPROVIDED)) {
      gather_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    checkType(v_term, $sym1$INDEXED_TERM_P);
    checkType(pred, $sym2$FORT_P);
    checkType(index_arg, $sym3$INTEGERP);
    checkType(gather_arg, $sym3$INTEGERP);
    checkType(truth, $sym4$TRUTH_P);
    {
      SubLObject assertion = fpred_value_gaf(v_term, pred, index_arg, truth);
      if ((NIL != assertion)) {
        return assertions_high.gaf_arg(assertion, gather_arg);
      }
    }
    return NIL;
  }

  /** Find the first gaf assertion such that:
 (a) the assertion is allowed to be in any microtheory
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return the term in the GATHER-ARG position if such an assertion exists.
 Otherwise, return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 9081) 
  public static final SubLObject fpred_value_in_any_mt(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((gather_arg == UNPROVIDED)) {
      gather_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(gather_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const24$EverythingPSC, thread);
            answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** If MT is NIL, behaves like FPRED-VALUE.  Otherwise, looks in all genlMts of MT. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 9818) 
  public static final SubLObject fpred_value_in_relevant_mts(SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((gather_arg == UNPROVIDED)) {
      gather_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(gather_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            answer = fpred_value(v_term, pred, index_arg, gather_arg, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** Find all gaf assertions such that:
 (a) the assertion is in a relevant microtheory (relevance is established outside)
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return a list of the terms in the GATHER-ARG position of all such assertions. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 12958) 
  public static final SubLObject pred_values(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((gather_arg == UNPROVIDED)) {
      gather_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(gather_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject values = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_13 = NIL;
                        SubLObject token_var_14 = NIL;
                        while ((NIL == done_var_13)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                            SubLObject valid_15 = makeBoolean((token_var_14 != assertion));
                            if ((NIL != valid_15)) {
                              if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                              }
                              {
                                SubLObject value = assertions_high.gaf_arg(assertion, gather_arg);
                                if ((NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread))) {
                                  {
                                    SubLObject item_var = value;
                                    if ((NIL == conses_high.member(item_var, values, control_vars.$mapping_equality_test$.getDynamicValue(thread), Symbols.symbol_function(IDENTITY)))) {
                                      values = cons(item_var, values);
                                    }
                                  }
                                } else {
                                  values = cons(value, values);
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
        return values;
      }
    }
  }

  /** If MT is NIL, behaves like PRED-VALUES.  Otherwise, behaves like PRED-VALUES-IN-MT */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 16122) 
  public static final SubLObject pred_values_in_relevant_mts(SubLObject v_term, SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg, SubLObject truth) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((index_arg == UNPROVIDED)) {
      index_arg = ONE_INTEGER;
    }
    if ((gather_arg == UNPROVIDED)) {
      gather_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(gather_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            answer = pred_values(v_term, pred, index_arg, gather_arg, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** Find the first gaf assertion such that:
 (a) the assertion is in a relevant microtheory (relevance is established outside)
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) U is the term in the U-ARG position.
 (e) V is the term in the V-ARG position.
 Return T if such an assertion exists, otherwise return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 23149) 
  public static final SubLObject pred_u_v_holds(SubLObject pred, SubLObject u, SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
    if ((u_arg == UNPROVIDED)) {
      u_arg = ONE_INTEGER;
    }
    if ((v_arg == UNPROVIDED)) {
      v_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(pred, $sym2$FORT_P);
      checkType(u, $sym1$INDEXED_TERM_P);
      checkType(v, $sym77$HL_TERM_P);
      checkType(u_arg, $sym3$INTEGERP);
      checkType(v_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(u, u_arg, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(u, u_arg, pred_var);
            SubLObject done_var = answer;
            SubLObject token_var = NIL;
            while ((NIL == done_var)) {
              {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean((token_var != final_index_spec));
                if ((NIL != valid)) {
                  {
                    SubLObject final_index_iterator = NIL;
                    try {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_25 = answer;
                        SubLObject token_var_26 = NIL;
                        while ((NIL == done_var_25)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                            SubLObject valid_27 = makeBoolean((token_var_26 != assertion));
                            if ((NIL != valid_27)) {
                              if ((NIL != Functions.funcall(control_vars.$mapping_equality_test$.getDynamicValue(thread), assertions_high.gaf_arg(assertion, v_arg), v))) {
                                if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                  Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                answer = T;
                              }
                            }
                            done_var_25 = makeBoolean(((NIL == valid_27)
                                  || (NIL != answer)));
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
                      || (NIL != answer)));
              }
            }
          }
        }
        return answer;
      }
    }
  }

  /** Find the first gaf assertion such that:
 (a) the assertion is allowed to be in any microtheory
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) U is the term in the U-ARG position.
 (e) V is the term in the V-ARG position.
 Return T if such an assertion exists, otherwise return NIL. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 25541) 
  public static final SubLObject pred_u_v_holds_in_any_mt(SubLObject pred, SubLObject u, SubLObject v, SubLObject u_arg, SubLObject v_arg, SubLObject truth) {
    if ((u_arg == UNPROVIDED)) {
      u_arg = ONE_INTEGER;
    }
    if ((v_arg == UNPROVIDED)) {
      v_arg = TWO_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(pred, $sym2$FORT_P);
      checkType(u, $sym1$INDEXED_TERM_P);
      checkType(v, $sym77$HL_TERM_P);
      checkType(u_arg, $sym3$INTEGERP);
      checkType(v_arg, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const24$EverythingPSC, thread);
            answer = pred_u_v_holds(pred, u, v, u_arg, v_arg, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 31759) 
  public static final SubLObject pred_arg_values(SubLObject v_term, SubLObject pred, SubLObject arg, SubLObject term_psn, SubLObject arg_psn, SubLObject gather_psn, SubLObject truth) {
    if ((term_psn == UNPROVIDED)) {
      term_psn = ONE_INTEGER;
    }
    if ((arg_psn == UNPROVIDED)) {
      arg_psn = TWO_INTEGER;
    }
    if ((gather_psn == UNPROVIDED)) {
      gather_psn = THREE_INTEGER;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(term_psn, $sym3$INTEGERP);
      checkType(arg_psn, $sym3$INTEGERP);
      checkType(gather_psn, $sym3$INTEGERP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, term_psn, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, term_psn, pred_var);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_34 = NIL;
                        SubLObject token_var_35 = NIL;
                        while ((NIL == done_var_34)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                            SubLObject valid_36 = makeBoolean((token_var_35 != assertion));
                            if ((NIL != valid_36)) {
                              if (arg.equalp(assertions_high.gaf_arg(assertion, arg_psn))) {
                                if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                  Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                if ((NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread))) {
                                  {
                                    SubLObject item_var = assertions_high.gaf_arg(assertion, gather_psn);
                                    if ((NIL == conses_high.member(item_var, answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), Symbols.symbol_function(IDENTITY)))) {
                                      answer = cons(item_var, answer);
                                    }
                                  }
                                } else {
                                  answer = cons(assertions_high.gaf_arg(assertion, gather_psn), answer);
                                }
                              }
                            }
                            done_var_34 = makeBoolean((NIL == valid_36));
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
        return answer;
      }
    }
  }

  /** Find all gaf assertions such that:
 (a) the assertion is in a relevant microtheory (relevance is established outside)
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return a list of tuples formed from the GATHER-ARGS positions of all such assertions. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 33734) 
  public static final SubLObject pred_value_tuples(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject gather_args, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(gather_args, $sym17$LISTP);
      checkType(truth, $sym4$TRUTH_P);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == list_utilities.every_in_list(Symbols.symbol_function($sym3$INTEGERP), gather_args, UNPROVIDED))) {
          Errors.error($str96$_S_is_not_a_valid_arg_position_li);
        }
      }
      {
        SubLObject answer = NIL;
        SubLObject pred_var = pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw5$GAF, truth, NIL);
                      {
                        SubLObject done_var_37 = NIL;
                        SubLObject token_var_38 = NIL;
                        while ((NIL == done_var_37)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                            SubLObject valid_39 = makeBoolean((token_var_38 != assertion));
                            if ((NIL != valid_39)) {
                              {
                                SubLObject tuple = NIL;
                                SubLObject cdolist_list_var = gather_args;
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
                                  tuple = cons(assertions_high.gaf_arg(assertion, arg), tuple);
                                }
                                tuple = Sequences.nreverse(tuple);
                                if ((NIL != control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread))) {
                                  Functions.funcall(control_vars.$mapping_assertion_bookkeeping_fn$.getDynamicValue(thread), assertion);
                                }
                                if ((NIL != control_vars.$mapping_equality_test$.getDynamicValue(thread))) {
                                  {
                                    SubLObject item_var = tuple;
                                    if ((NIL == conses_high.member(item_var, answer, control_vars.$mapping_equality_test$.getDynamicValue(thread), Symbols.symbol_function(IDENTITY)))) {
                                      answer = cons(item_var, answer);
                                    }
                                  }
                                } else {
                                  answer = cons(tuple, answer);
                                }
                              }
                            }
                            done_var_37 = makeBoolean((NIL == valid_39));
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
        return answer;
      }
    }
  }

  /** Find all gaf assertions such that:
 (a) the assertion is allowed to be from any microtheory
 (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value
 (c) PRED is the predicate used.
 (d) TERM is the term in the INDEX-ARG position.
 Return a list of tuples formed from the GATHER-ARGS positions of all such assertions. */
  @SubL(source = "cycl/kb-mapping-utilities.lisp", position = 36426) 
  public static final SubLObject pred_value_tuples_in_any_mt(SubLObject v_term, SubLObject pred, SubLObject index_arg, SubLObject gather_args, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym1$INDEXED_TERM_P);
      checkType(pred, $sym2$FORT_P);
      checkType(index_arg, $sym3$INTEGERP);
      checkType(gather_args, $sym17$LISTP);
      checkType(truth, $sym4$TRUTH_P);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const24$EverythingPSC, thread);
            answer = pred_value_tuples(v_term, pred, index_arg, gather_args, truth);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  public static final SubLObject declare_kb_mapping_utilities_file() {
    declareFunction(myName, "some_pred_value", "SOME-PRED-VALUE", 2, 2, false);
    declareFunction(myName, "some_pred_value_in_mt", "SOME-PRED-VALUE-IN-MT", 3, 2, false);
    declareFunction(myName, "some_pred_value_in_mts", "SOME-PRED-VALUE-IN-MTS", 3, 2, false);
    declareFunction(myName, "some_pred_value_in_any_mt", "SOME-PRED-VALUE-IN-ANY-MT", 2, 2, false);
    declareFunction(myName, "some_pred_value_in_relevant_mts", "SOME-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
    declareFunction(myName, "some_pred_value_if", "SOME-PRED-VALUE-IF", 3, 2, false);
    declareFunction(myName, "fpred_value_gaf", "FPRED-VALUE-GAF", 2, 2, false);
    declareFunction(myName, "fpred_value_gaf_in_relevant_mts", "FPRED-VALUE-GAF-IN-RELEVANT-MTS", 2, 3, false);
    declareFunction(myName, "fpred_value", "FPRED-VALUE", 2, 3, false);
    declareFunction(myName, "fpred_value_in_mt", "FPRED-VALUE-IN-MT", 3, 3, false);
    declareFunction(myName, "fpred_value_in_mts", "FPRED-VALUE-IN-MTS", 3, 3, false);
    declareFunction(myName, "fpred_value_in_any_mt", "FPRED-VALUE-IN-ANY-MT", 2, 3, false);
    declareFunction(myName, "fpred_value_in_relevant_mts", "FPRED-VALUE-IN-RELEVANT-MTS", 2, 4, false);
    declareFunction(myName, "pred_value_gafs", "PRED-VALUE-GAFS", 2, 2, false);
    declareFunction(myName, "pred_value_gafs_in_mt", "PRED-VALUE-GAFS-IN-MT", 3, 2, false);
    declareFunction(myName, "pred_value_gafs_in_relevant_mts", "PRED-VALUE-GAFS-IN-RELEVANT-MTS", 2, 3, false);
    declareFunction(myName, "pred_value_gafs_in_any_mt", "PRED-VALUE-GAFS-IN-ANY-MT", 2, 2, false);
    declareFunction(myName, "pred_values", "PRED-VALUES", 2, 3, false);
    declareFunction(myName, "pred_values_in_mt", "PRED-VALUES-IN-MT", 3, 3, false);
    declareFunction(myName, "pred_values_in_mts", "PRED-VALUES-IN-MTS", 3, 3, false);
    declareFunction(myName, "pred_values_in_any_mt", "PRED-VALUES-IN-ANY-MT", 2, 3, false);
    declareFunction(myName, "pred_values_in_relevant_mts", "PRED-VALUES-IN-RELEVANT-MTS", 2, 4, false);
    declareFunction(myName, "pred_refs", "PRED-REFS", 1, 2, false);
    declareFunction(myName, "pred_refs_in_mt", "PRED-REFS-IN-MT", 2, 2, false);
    declareFunction(myName, "pred_refs_in_mts", "PRED-REFS-IN-MTS", 2, 2, false);
    declareFunction(myName, "pred_refs_in_any_mt", "PRED-REFS-IN-ANY-MT", 1, 2, false);
    declareFunction(myName, "pred_refs_in_relevant_mts", "PRED-REFS-IN-RELEVANT-MTS", 1, 3, false);
    declareFunction(myName, "pred_u_v_holds_gafs", "PRED-U-V-HOLDS-GAFS", 3, 3, false);
    declareFunction(myName, "fpred_u_v_holds_gaf", "FPRED-U-V-HOLDS-GAF", 3, 3, false);
    declareFunction(myName, "pred_u_v_holds_gafs_in_relevant_mts", "PRED-U-V-HOLDS-GAFS-IN-RELEVANT-MTS", 3, 4, false);
    declareFunction(myName, "fpred_u_v_holds_gaf_in_relevant_mts", "FPRED-U-V-HOLDS-GAF-IN-RELEVANT-MTS", 3, 4, false);
    declareFunction(myName, "pred_u_v_holds_gafs_in_any_mt", "PRED-U-V-HOLDS-GAFS-IN-ANY-MT", 3, 3, false);
    declareFunction(myName, "fpred_u_v_holds_gaf_in_any_mt", "FPRED-U-V-HOLDS-GAF-IN-ANY-MT", 3, 3, false);
    declareFunction(myName, "pred_u_v_holds", "PRED-U-V-HOLDS", 3, 3, false);
    declareFunction(myName, "pred_u_v_holds_in_mt", "PRED-U-V-HOLDS-IN-MT", 4, 3, false);
    declareFunction(myName, "pred_u_v_holds_in_mts", "PRED-U-V-HOLDS-IN-MTS", 4, 3, false);
    declareFunction(myName, "pred_u_v_holds_in_any_mt", "PRED-U-V-HOLDS-IN-ANY-MT", 3, 3, false);
    declareFunction(myName, "pred_u_v_holds_in_relevant_mts", "PRED-U-V-HOLDS-IN-RELEVANT-MTS", 3, 4, false);
    declareFunction(myName, "tuple_holds", "TUPLE-HOLDS", 1, 2, false);
    declareFunction(myName, "tuple_holds_in_mt", "TUPLE-HOLDS-IN-MT", 2, 2, false);
    declareFunction(myName, "tuple_holds_in_mts", "TUPLE-HOLDS-IN-MTS", 2, 2, false);
    declareFunction(myName, "tuple_holds_in_any_mt", "TUPLE-HOLDS-IN-ANY-MT", 1, 2, false);
    declareFunction(myName, "tuple_holds_in_relevant_mts", "TUPLE-HOLDS-IN-RELEVANT-MTS", 1, 3, false);
    declareFunction(myName, "pred_values_mentioning", "PRED-VALUES-MENTIONING", 3, 3, false);
    declareFunction(myName, "pred_values_mentioning_in_mt", "PRED-VALUES-MENTIONING-IN-MT", 4, 3, false);
    declareFunction(myName, "pred_values_mentioning_in_mts", "PRED-VALUES-MENTIONING-IN-MTS", 4, 3, false);
    declareFunction(myName, "pred_values_mentioning_in_any_mt", "PRED-VALUES-MENTIONING-IN-ANY-MT", 3, 3, false);
    declareFunction(myName, "pred_values_mentioning_in_relevant_mts", "PRED-VALUES-MENTIONING-IN-RELEVANT-MTS", 3, 4, false);
    declareFunction(myName, "pred_arg_values", "PRED-ARG-VALUES", 3, 4, false);
    declareFunction(myName, "pred_arg_values_in_mt", "PRED-ARG-VALUES-IN-MT", 4, 4, false);
    declareFunction(myName, "pred_arg_values_in_mts", "PRED-ARG-VALUES-IN-MTS", 4, 4, false);
    declareFunction(myName, "pred_arg_values_in_any_mt", "PRED-ARG-VALUES-IN-ANY-MT", 3, 4, false);
    declareFunction(myName, "pred_arg_values_in_relevant_mts", "PRED-ARG-VALUES-IN-RELEVANT-MTS", 3, 5, false);
    declareFunction(myName, "pred_value_tuples", "PRED-VALUE-TUPLES", 4, 1, false);
    declareFunction(myName, "pred_value_tuples_in_mt", "PRED-VALUE-TUPLES-IN-MT", 5, 1, false);
    declareFunction(myName, "pred_value_tuples_in_mts", "PRED-VALUE-TUPLES-IN-MTS", 5, 1, false);
    declareFunction(myName, "pred_value_tuples_in_any_mt", "PRED-VALUE-TUPLES-IN-ANY-MT", 4, 1, false);
    declareFunction(myName, "pred_value_tuples_in_relevant_mts", "PRED-VALUE-TUPLES-IN-RELEVANT-MTS", 4, 2, false);
    return NIL;
  }

  public static final SubLObject init_kb_mapping_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_kb_mapping_utilities_file() {
    // CVS_ID("Id: kb-mapping-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym6$SOME_PRED_VALUE, $list7, $str8$Find_the_first_gaf_assertion_such, $list9, $list10);
    utilities_macros.register_cyc_api_function($sym13$SOME_PRED_VALUE_IN_MT, $list14, $str15$Find_the_first_gaf_assertion_such, $list16, $list10);
    utilities_macros.register_cyc_api_function($sym19$SOME_PRED_VALUE_IN_MTS, $list20, $str21$Find_the_first_gaf_assertion_such, $list22, $list10);
    utilities_macros.register_cyc_api_function($sym25$SOME_PRED_VALUE_IN_ANY_MT, $list7, $str26$Find_the_first_gaf_assertion_such, $list9, $list10);
    utilities_macros.register_cyc_api_function($sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS, $list28, $str29$If_MT_is_NIL__behaves_like_SOME_P, $list9, $list10);
    utilities_macros.register_cyc_api_function($sym31$FPRED_VALUE, $list32, $str33$Find_the_first_gaf_assertion_such, $list34, $list35);
    utilities_macros.register_cyc_api_function($sym36$FPRED_VALUE_IN_MT, $list37, $str38$Find_the_first_gaf_assertion_such, $list39, $list35);
    utilities_macros.register_cyc_api_function($sym40$FPRED_VALUE_IN_MTS, $list41, $str42$Find_the_first_gaf_assertion_such, $list43, $list35);
    utilities_macros.register_cyc_api_function($sym44$FPRED_VALUE_IN_ANY_MT, $list32, $str45$Find_the_first_gaf_assertion_such, $list34, $list35);
    utilities_macros.register_cyc_api_function($sym46$FPRED_VALUE_IN_RELEVANT_MTS, $list47, $str48$If_MT_is_NIL__behaves_like_FPRED_, $list34, $list35);
    utilities_macros.register_cyc_api_function($sym49$PRED_VALUES, $list32, $str50$Find_all_gaf_assertions_such_that, $list34, $list51);
    utilities_macros.register_cyc_api_function($sym52$PRED_VALUES_IN_MT, $list37, $str53$Find_all_gaf_assertions_such_that, $list39, $list51);
    utilities_macros.register_cyc_api_function($sym54$PRED_VALUES_IN_MTS, $list41, $str55$Find_all_gaf_assertions_such_that, $list43, $list51);
    utilities_macros.register_cyc_api_function($sym56$PRED_VALUES_IN_ANY_MT, $list32, $str57$Find_all_gaf_assertions_such_that, $list34, $list51);
    utilities_macros.register_cyc_api_function($sym58$PRED_VALUES_IN_RELEVANT_MTS, $list47, $str59$If_MT_is_NIL__behaves_like_PRED_V, $list34, $list51);
    utilities_macros.register_cyc_api_function($sym60$PRED_REFS, $list61, $str62$Find_all_gaf_assertions_such_that, $list63, $list51);
    utilities_macros.register_cyc_api_function($sym64$PRED_REFS_IN_MT, $list65, $str66$Find_all_gaf_assertions_such_that, $list67, $list51);
    utilities_macros.register_cyc_api_function($sym68$PRED_REFS_IN_MTS, $list69, $str70$Find_all_gaf_assertions_such_that, $list71, $list51);
    utilities_macros.register_cyc_api_function($sym72$PRED_REFS_IN_ANY_MT, $list61, $str73$Find_all_gaf_assertions_such_that, $list63, $list51);
    utilities_macros.register_cyc_api_function($sym74$PRED_REFS_IN_RELEVANT_MTS, $list75, $str76$If_MT_is_NIL__behaves_like_PRED_R, $list63, $list51);
    utilities_macros.register_cyc_api_function($sym78$PRED_U_V_HOLDS, $list79, $str80$Find_the_first_gaf_assertion_such, $list81, $list10);
    utilities_macros.register_cyc_api_function($sym82$PRED_U_V_HOLDS_IN_MT, $list83, $str84$Find_the_first_gaf_assertion_such, $list85, $list10);
    utilities_macros.register_cyc_api_function($sym86$PRED_U_V_HOLDS_IN_MTS, $list87, $str88$Find_the_first_gaf_assertion_such, $list89, $list10);
    utilities_macros.register_cyc_api_function($sym90$PRED_U_V_HOLDS_IN_ANY_MT, $list79, $str91$Find_the_first_gaf_assertion_such, $list81, $list10);
    utilities_macros.register_cyc_api_function($sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS, $list93, $str94$If_MT_is_NIL__behaves_like_PRED_U, $list81, $list10);
    utilities_macros.register_cyc_api_function($sym97$PRED_VALUE_TUPLES, $list98, $str99$Find_all_gaf_assertions_such_that, $list100, $list101);
    utilities_macros.register_cyc_api_function($sym102$PRED_VALUE_TUPLES_IN_MT, $list103, $str104$Find_all_gaf_assertions_such_that, $list105, $list101);
    utilities_macros.register_cyc_api_function($sym106$PRED_VALUE_TUPLES_IN_MTS, $list107, $str108$Find_all_gaf_assertions_such_that, $list109, $list101);
    utilities_macros.register_cyc_api_function($sym110$PRED_VALUE_TUPLES_IN_ANY_MT, $list98, $str111$Find_all_gaf_assertions_such_that, $list100, $list101);
    utilities_macros.register_cyc_api_function($sym112$PRED_VALUE_TUPLES_IN_RELEVANT_MTS, $list113, $str114$If_MT_is_NIL__behaves_like_PRED_V, $list100, $list101);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym1$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym2$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym3$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym4$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $kw5$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym6$SOME_PRED_VALUE = makeSymbol("SOME-PRED-VALUE");
  public static final SubLList $list7 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str8$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLList $list9 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLList $list10 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym11$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym13$SOME_PRED_VALUE_IN_MT = makeSymbol("SOME-PRED-VALUE-IN-MT");
  public static final SubLList $list14 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str15$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLList $list16 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym17$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym18$RELEVANT_MT_IS_IN_LIST = makeSymbol("RELEVANT-MT-IS-IN-LIST");
  public static final SubLSymbol $sym19$SOME_PRED_VALUE_IN_MTS = makeSymbol("SOME-PRED-VALUE-IN-MTS");
  public static final SubLList $list20 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str21$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLList $list22 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym23$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const24$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym25$SOME_PRED_VALUE_IN_ANY_MT = makeSymbol("SOME-PRED-VALUE-IN-ANY-MT");
  public static final SubLString $str26$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLSymbol $sym27$SOME_PRED_VALUE_IN_RELEVANT_MTS = makeSymbol("SOME-PRED-VALUE-IN-RELEVANT-MTS");
  public static final SubLList $list28 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str29$If_MT_is_NIL__behaves_like_SOME_P = makeString("If MT is NIL, behaves like SOME-PRED-VALUE.  Otherwise, behaves like SOME-PRED-VALUE-IN-MT");
  public static final SubLSymbol $sym30$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym31$FPRED_VALUE = makeSymbol("FPRED-VALUE");
  public static final SubLList $list32 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str33$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
  public static final SubLList $list34 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLList $list35 = list(list(makeSymbol("NIL-OR"), makeSymbol("HL-TERM-P")));
  public static final SubLSymbol $sym36$FPRED_VALUE_IN_MT = makeSymbol("FPRED-VALUE-IN-MT");
  public static final SubLList $list37 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str38$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
  public static final SubLList $list39 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym40$FPRED_VALUE_IN_MTS = makeSymbol("FPRED-VALUE-IN-MTS");
  public static final SubLList $list41 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str42$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
  public static final SubLList $list43 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym44$FPRED_VALUE_IN_ANY_MT = makeSymbol("FPRED-VALUE-IN-ANY-MT");
  public static final SubLString $str45$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return the term in the GATHER-ARG position if such an assertion exists.\n Otherwise, return NIL.");
  public static final SubLSymbol $sym46$FPRED_VALUE_IN_RELEVANT_MTS = makeSymbol("FPRED-VALUE-IN-RELEVANT-MTS");
  public static final SubLList $list47 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("INDEX-ARG"), ONE_INTEGER), list(makeSymbol("GATHER-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str48$If_MT_is_NIL__behaves_like_FPRED_ = makeString("If MT is NIL, behaves like FPRED-VALUE.  Otherwise, looks in all genlMts of MT.");
  public static final SubLSymbol $sym49$PRED_VALUES = makeSymbol("PRED-VALUES");
  public static final SubLString $str50$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLList $list51 = list(list(makeSymbol("LIST"), makeSymbol("HL-TERM-P")));
  public static final SubLSymbol $sym52$PRED_VALUES_IN_MT = makeSymbol("PRED-VALUES-IN-MT");
  public static final SubLString $str53$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLSymbol $sym54$PRED_VALUES_IN_MTS = makeSymbol("PRED-VALUES-IN-MTS");
  public static final SubLString $str55$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLSymbol $sym56$PRED_VALUES_IN_ANY_MT = makeSymbol("PRED-VALUES-IN-ANY-MT");
  public static final SubLString $str57$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLSymbol $sym58$PRED_VALUES_IN_RELEVANT_MTS = makeSymbol("PRED-VALUES-IN-RELEVANT-MTS");
  public static final SubLString $str59$If_MT_is_NIL__behaves_like_PRED_V = makeString("If MT is NIL, behaves like PRED-VALUES.  Otherwise, behaves like PRED-VALUES-IN-MT");
  public static final SubLSymbol $sym60$PRED_REFS = makeSymbol("PRED-REFS");
  public static final SubLList $list61 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str62$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLList $list63 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym64$PRED_REFS_IN_MT = makeSymbol("PRED-REFS-IN-MT");
  public static final SubLList $list65 = list(makeSymbol("PRED"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str66$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLList $list67 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym68$PRED_REFS_IN_MTS = makeSymbol("PRED-REFS-IN-MTS");
  public static final SubLList $list69 = list(makeSymbol("PRED"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str70$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLList $list71 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("GATHER-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym72$PRED_REFS_IN_ANY_MT = makeSymbol("PRED-REFS-IN-ANY-MT");
  public static final SubLString $str73$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n Return a list of the terms in the GATHER-ARG position of all such assertions.");
  public static final SubLSymbol $sym74$PRED_REFS_IN_RELEVANT_MTS = makeSymbol("PRED-REFS-IN-RELEVANT-MTS");
  public static final SubLList $list75 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("GATHER-ARG"), ONE_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str76$If_MT_is_NIL__behaves_like_PRED_R = makeString("If MT is NIL, behaves like PRED-REFS.  Otherwise, behaves like PRED-REFS-IN-MT");
  public static final SubLSymbol $sym77$HL_TERM_P = makeSymbol("HL-TERM-P");
  public static final SubLSymbol $sym78$PRED_U_V_HOLDS = makeSymbol("PRED-U-V-HOLDS");
  public static final SubLList $list79 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("&OPTIONAL"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str80$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLList $list81 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("U"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("V"), makeSymbol("HL-TERM-P")), list(makeSymbol("U-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("V-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym82$PRED_U_V_HOLDS_IN_MT = makeSymbol("PRED-U-V-HOLDS-IN-MT");
  public static final SubLList $list83 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str84$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLList $list85 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("U"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("V"), makeSymbol("HL-TERM-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("U-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("V-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym86$PRED_U_V_HOLDS_IN_MTS = makeSymbol("PRED-U-V-HOLDS-IN-MTS");
  public static final SubLList $list87 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str88$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLList $list89 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("U"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("V"), makeSymbol("HL-TERM-P")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("U-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("V-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym90$PRED_U_V_HOLDS_IN_ANY_MT = makeSymbol("PRED-U-V-HOLDS-IN-ANY-MT");
  public static final SubLString $str91$Find_the_first_gaf_assertion_such = makeString("Find the first gaf assertion such that:\n (a) the assertion is allowed to be in any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) U is the term in the U-ARG position.\n (e) V is the term in the V-ARG position.\n Return T if such an assertion exists, otherwise return NIL.");
  public static final SubLSymbol $sym92$PRED_U_V_HOLDS_IN_RELEVANT_MTS = makeSymbol("PRED-U-V-HOLDS-IN-RELEVANT-MTS");
  public static final SubLList $list93 = list(makeSymbol("PRED"), makeSymbol("U"), makeSymbol("V"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("U-ARG"), ONE_INTEGER), list(makeSymbol("V-ARG"), TWO_INTEGER), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str94$If_MT_is_NIL__behaves_like_PRED_U = makeString("If MT is NIL, behaves like PRED-U-V-HOLDS.  Otherwise, behaves like PRED-U-V-HOLDS-IN-MT");
  public static final SubLSymbol $sym95$CONSP = makeSymbol("CONSP");
  public static final SubLString $str96$_S_is_not_a_valid_arg_position_li = makeString("~S is not a valid arg-position list");
  public static final SubLSymbol $sym97$PRED_VALUE_TUPLES = makeSymbol("PRED-VALUE-TUPLES");
  public static final SubLList $list98 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str99$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in a relevant microtheory (relevance is established outside)\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
  public static final SubLList $list100 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARGS"), makeSymbol("LISTP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLList $list101 = list(list(makeSymbol("LIST"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym102$PRED_VALUE_TUPLES_IN_MT = makeSymbol("PRED-VALUE-TUPLES-IN-MT");
  public static final SubLList $list103 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str104$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is microtheory MT\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
  public static final SubLList $list105 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARGS"), makeSymbol("LISTP")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym106$PRED_VALUE_TUPLES_IN_MTS = makeSymbol("PRED-VALUE-TUPLES-IN-MTS");
  public static final SubLList $list107 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("MTS"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str108$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is in one of the microtheories in the list MTS\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
  public static final SubLList $list109 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("INDEX-ARG"), makeSymbol("INTEGERP")), list(makeSymbol("GATHER-ARGS"), makeSymbol("LISTP")), list(makeSymbol("MTS"), makeSymbol("LISTP")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym110$PRED_VALUE_TUPLES_IN_ANY_MT = makeSymbol("PRED-VALUE-TUPLES-IN-ANY-MT");
  public static final SubLString $str111$Find_all_gaf_assertions_such_that = makeString("Find all gaf assertions such that:\n (a) the assertion is allowed to be from any microtheory\n (b) if TRUTH is non-nil, the assertion has TRUTH as its truth value\n (c) PRED is the predicate used.\n (d) TERM is the term in the INDEX-ARG position.\n Return a list of tuples formed from the GATHER-ARGS positions of all such assertions.");
  public static final SubLSymbol $sym112$PRED_VALUE_TUPLES_IN_RELEVANT_MTS = makeSymbol("PRED-VALUE-TUPLES-IN-RELEVANT-MTS");
  public static final SubLList $list113 = list(makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("INDEX-ARG"), makeSymbol("GATHER-ARGS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str114$If_MT_is_NIL__behaves_like_PRED_V = makeString("If MT is NIL, behaves like PRED-VALUE-TUPLES.  Otherwise, behaves like PRED-VALUE-TUPLES-IN-MT");

  //// Initializers

  public void declareFunctions() {
    declare_kb_mapping_utilities_file();
  }

  public void initializeVariables() {
    init_kb_mapping_utilities_file();
  }

  public void runTopLevelForms() {
    setup_kb_mapping_utilities_file();
  }

}
