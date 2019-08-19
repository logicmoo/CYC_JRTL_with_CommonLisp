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
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.bookkeeping_store;
//dm import com.cyc.cycjava_1.cycl.canon_tl;
//dm import com.cyc.cycjava_1.cycl.constant_completion;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_bookkeeping;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.hlmt_czer;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.operation_queues;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff;

public  final class ke extends SubLTranslatedFile {

  //// Constructor

  private ke() {}
  public static final SubLFile me = new ke();
  public static final String myName = "com.cyc.cycjava_1.cycl.ke";

  //// Definitions

  /** Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null 
it is used, otherwise a unique identifier is generated.
@return 0 constant ;; new constant if success, o/w nil
@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
@param NAME string
@param EXTERNAL-ID guid-p
@note Assumes cyclist is ok.
@note The salient property of this function is that it never throws an error.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/ke.lisp", position = 1776) 
  public static final SubLObject ke_create_now(SubLObject name, SubLObject external_id) {
    if ((external_id == UNPROVIDED)) {
      external_id = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
          {
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
              Errors.$error_handler$.bind($sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
              try {
                {
                  SubLObject _prev_bind_0_1 = fi.$fi_last_constant$.currentBinding(thread);
                  try {
                    fi.$fi_last_constant$.bind(NIL, thread);
                    result = fi.fi_create_int(name, external_id);
                  } finally {
                    fi.$fi_last_constant$.rebind(_prev_bind_0_1, thread);
                  }
                }
              } catch (Throwable catch_var) {
                Errors.handleThrowable(catch_var, NIL);
              }
            } finally {
              Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
          }
        } catch (Throwable ccatch_env_var) {
          error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        if ((NIL != result)) {
          operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list($sym4$FI_CREATE, list($sym3$QUOTE, constants_high.constant_name(result)), constants_high.constant_external_id(result))));
          {
            SubLObject ignore_errors_tag = NIL;
            try {
              {
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                  Errors.$error_handler$.bind(Symbols.symbol_function($sym7$IGNORE_ERRORS_HANDLER), thread);
                  try {
                    {
                      SubLObject _prev_bind_0_2 = fi.$fi_last_constant$.currentBinding(thread);
                      try {
                        fi.$fi_last_constant$.bind(result, thread);
                        if ((NIL != fi.fi_timestamp_constant_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second()))) {
                          operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list($sym2$FI_TIMESTAMP_CONSTANT, list($sym3$QUOTE, operation_communication.the_cyclist()), list($sym3$QUOTE, fi.the_date()), list($sym3$QUOTE, fi.ke_purpose()), list($sym3$QUOTE, fi.the_second()))));
                        }
                      } finally {
                        fi.$fi_last_constant$.rebind(_prev_bind_0_2, thread);
                      }
                    }
                  } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                  }
                } finally {
                  Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
              }
            } catch (Throwable ccatch_env_var) {
              ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw6$IGNORE_ERRORS_TARGET);
            }
          }
          return result;
        }
        if ((NIL != error_message)) {
          return Values.values(NIL, list($kw8$FATAL_ERROR, error_message));
        }
        if ((NIL != fi.fi_error_signaledP())) {
          return Values.values(NIL, list(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11146").first(), Functions.apply(Symbols.symbol_function($sym9$FORMAT), cons(NIL, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11147").rest()))));
        }
        return Values.values(NIL, $list10);
      }
    }
  }


  @SubL(source = "cycl/ke.lisp", position = 14082) 
  public static final SubLObject ke_assert(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
    if ((strength == UNPROVIDED)) {
      strength = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL == strength)) {
      strength = $kw40$DEFAULT;
    }
    if ((NIL != ensure_cyclist_ok())) {
      mt = hlmt_czer.canonicalize_hlmt(mt);
      {
        SubLObject ans = do_edit_op(listS($sym41$FI_ASSERT, list($sym3$QUOTE, formula), list($sym3$QUOTE, mt), list($sym3$QUOTE, strength), ConsesLow.append(((NIL != direction) ? ((SubLObject) list(list($sym3$QUOTE, direction))) : NIL), NIL)));
        SubLObject error = NIL;
        if ((ans != $kw1$QUEUED)) {
          error = fi.fi_get_error_int();
        }
        do_edit_op(list($sym42$FI_TIMESTAMP_ASSERTION, list($sym3$QUOTE, operation_communication.the_cyclist()), list($sym3$QUOTE, fi.the_date()), list($sym3$QUOTE, fi.ke_purpose()), list($sym3$QUOTE, fi.the_second())));
        if ((ans != $kw1$QUEUED)) {
          fi.signal_fi_error(error);
        }
        return ans;
      }
    }
    return NIL;
  }


  @SubL(source = "cycl/ke.lisp", position = 41490) 
  public static final SubLObject do_edit_op(SubLObject form) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread))) {
        return operation_queues.add_to_local_queue(form, T);
      } else {
        return Eval.eval(form);
      }
    }
  }


  @SubL(source = "cycl/ke.lisp", position = 43260) 
  public static final SubLObject ensure_cyclist_ok() {
    if ((NIL == cyclist_is_guest())) {
      return T;
    }
    Errors.error($str89$KB_editing_is_not_allowed_for_use);
    return NIL;
  }


  /** Test to determine if the user should have editing privileges, or not. */
  @SubL(source = "cycl/ke.lisp", position = 43048) 
  public static final SubLObject cyclist_is_guest() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != system_parameters.$allow_guest_to_editP$.getDynamicValue(thread)) ? ((SubLObject) NIL) : Equality.equalp(operation_communication.the_cyclist(), $const88$Guest));
    }
  }

  
  /** Get the named constant if it exists.  
   Otherwise, Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null 
   it is used, otherwise a unique identifier is generated.
   @return 0 constant ;; relevant constant if success, o/w nil
   @return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
   @param NAME string
   @param EXTERNAL-ID guid-p
   @note Assumes cyclist is ok.
   @note The salient property of this function is that it never throws an error.
   @owner jantos
   @privacy done
    */
  @SubL(source = "cycl/ke.lisp", position = 3334) 
  public static final SubLObject ke_find_or_create_now(SubLObject name, SubLObject external_id) {
    if ((external_id == UNPROVIDED)) {
      external_id = NIL;
    }
    {
      SubLObject constant = fi.fi_find_int(name);
      if ((NIL != constant)) {
        return Values.values(constant, NIL);
      } else {
        return ke_create_now(name, external_id);
      }
    }
  }


  /** Assert FORMULA in MT now and add operation to transcript.
FORMULA is assumed to be WFF.
@return 0 boolean ;; t if success, o/w nil
@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
@param FORMULA list
@param MT microtheory
@param STRENGTH keyword
@param DIRECTION keyword
@note Assumes cyclist is ok.
@note The salient property of this function is that it never throws an error.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/ke.lisp", position = 17661) 
  public static final SubLObject ke_assert_wff_now(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
    if ((strength == UNPROVIDED)) {
      strength = $kw40$DEFAULT;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return ke_assert_now_int(formula, mt, strength, direction, T);
  }

  
  
  /** Do we keep the merged constant name info in the KB? */
  @SubL(source = "cycl/ke.lisp", position = 4754) 
  public static SubLSymbol $note_merged_constant_name$ = null;

  /** Kill FORT now and add operation to transcript.
@return 0 boolean ;; t if success, o/w nil
@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
@param FORT fort
@note Assumes cyclist is ok.
@note The salient property of this function is that it never throws an error.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/ke.lisp", position = 8675) 
  public static final SubLObject ke_kill_now(SubLObject fort) {
    {
      SubLObject result = NIL;
      SubLObject transcript_op = NIL;
      SubLObject error_message = NIL;
      fort = Eval.eval(fort);
      transcript_op = canon_tl.tl_encapsulate(list($sym26$FI_KILL, list($sym3$QUOTE, fort)));
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, $sym5$CATCH_ERROR_MESSAGE_HANDLER);
            try {
              result = fi.fi_kill_int(fort);
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
      }
      if ((NIL != result)) {
        operation_queues.add_to_transcript_queue(transcript_op);
        return result;
      }
      if ((NIL != error_message)) {
        return Values.values(NIL, list($kw8$FATAL_ERROR, error_message));
      }
      if ((NIL != fi.fi_error_signaledP())) {
        return Values.values(NIL, list(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11148").first(), Functions.apply(Symbols.symbol_function($sym9$FORMAT), cons(NIL, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11149").rest()))));
      }
      return Values.values(NIL, $list10);
    }
  }

  /** Do we keep previous constant name info in the KB? */
  @SubL(source = "cycl/ke.lisp", position = 10383) 
  public static SubLSymbol $note_old_constant_name$ = null;

  /** Rename CONSTANT to NAME now and add operation to transcript.
@return 0 constant ;; new constant name if success, o/w nil
@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
@param CONSTANT constant
@param NAME string
@note Assumes cyclist is ok.
@note The salient property of this function is that it never throws an error.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/ke.lisp", position = 12676) 
  public static final SubLObject ke_rename_now(SubLObject constant, SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject old_name = constants_high.constant_name(constant);
        SubLObject result = NIL;
        SubLObject transcript_op = NIL;
        SubLObject error_message = NIL;
        constant = Eval.eval(constant);
        transcript_op = canon_tl.tl_encapsulate(list($sym36$FI_RENAME, list($sym3$QUOTE, constant), list($sym3$QUOTE, name)));
        try {
          {
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
              Errors.$error_handler$.bind($sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
              try {
                result = fi.fi_rename_int(constant, name);
              } catch (Throwable catch_var) {
                Errors.handleThrowable(catch_var, NIL);
              }
            } finally {
              Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
          }
        } catch (Throwable ccatch_env_var) {
          error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        if ((NIL != result)) {
          operation_queues.add_to_transcript_queue(transcript_op);
          if (((NIL != $note_old_constant_name$.getDynamicValue(thread))
               && old_name.isString())) {
            {
              SubLObject ignore_errors_tag = NIL;
              try {
                {
                  SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                  try {
                    Errors.$error_handler$.bind(Symbols.symbol_function($sym7$IGNORE_ERRORS_HANDLER), thread);
                    try {
                      {
                        SubLObject _prev_bind_0_16 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                          mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EQ, thread);
                          mt_relevance_macros.$mt$.bind($const18$BookkeepingMt, thread);
                          {
                            SubLObject pred_var = $const38$oldConstantName;
                            if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(constant, ONE_INTEGER, pred_var))) {
                              {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(constant, ONE_INTEGER, pred_var);
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
                                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw24$GAF, NIL, NIL);
                                          {
                                            SubLObject done_var_17 = NIL;
                                            SubLObject token_var_18 = NIL;
                                            while ((NIL == done_var_17)) {
                                              {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                                                SubLObject valid_19 = makeBoolean((token_var_18 != assertion));
                                                if ((NIL != valid_19)) {
                                                  Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10961");
                                                }
                                                done_var_17 = makeBoolean((NIL == valid_19));
                                              }
                                            }
                                          }
                                        } finally {
                                          {
                                            SubLObject _prev_bind_0_20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                              if ((NIL != final_index_iterator)) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                              }
                                            } finally {
                                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
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
                          mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_16, thread);
                        }
                      }
                    } catch (Throwable catch_var) {
                      Errors.handleThrowable(catch_var, NIL);
                    }
                  } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                  }
                }
              } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw6$IGNORE_ERRORS_TARGET);
              }
            }
            ke_assert_now(list($const38$oldConstantName, constant, old_name), $const18$BookkeepingMt, UNPROVIDED, UNPROVIDED);
            return result;
          }
        }
        if ((NIL != error_message)) {
          return Values.values($kw8$FATAL_ERROR, error_message);
        }
        if ((NIL != fi.fi_error_signaledP())) {
          return Values.values(NIL, list(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11150").first(), Functions.apply(Symbols.symbol_function($sym9$FORMAT), cons(NIL, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11151").rest()))));
        }
        return Values.values(NIL, $list10);
      }
    }
  }

  /** Assert FORMULA in MT now and add operation to transcript.
@return 0 boolean ;; t if success, o/w nil
@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.
@param FORMULA list
@param MT microtheory
@param STRENGTH keyword
@param DIRECTION keyword
@note Assumes cyclist is ok.
@note The salient property of this function is that it never throws an error.
@owner jantos
@privacy done
 */
  @SubL(source = "cycl/ke.lisp", position = 17056) 
  public static final SubLObject ke_assert_now(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction) {
    if ((strength == UNPROVIDED)) {
      strength = $kw40$DEFAULT;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return ke_assert_now_int(formula, mt, strength, direction, NIL);
  }

  @SubL(source = "cycl/ke.lisp", position = 18300) 
  public static final SubLObject ke_assert_now_int(SubLObject formula, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject wffP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        SubLObject v_hlmt = hlmt_czer.canonicalize_hlmt(mt);
        SubLObject assertions = NIL;
        if ((NIL == control_vars.$inference_debugP$.getDynamicValue(thread))) {
          try {
            {
              SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
              try {
                Errors.$error_handler$.bind($sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                  {
                    SubLObject _prev_bind_0_23 = fi.$fi_last_assertions_asserted$.currentBinding(thread);
                    try {
                      fi.$fi_last_assertions_asserted$.bind(NIL, thread);
                      {
                        SubLObject v_properties = list($kw54$STRENGTH, strength, $kw55$DIRECTION, direction);
                        if ((NIL != wffP)) {
                          result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                        } else {
                          result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                        }
                        assertions = fi.$fi_last_assertions_asserted$.getDynamicValue(thread);
                      }
                    } finally {
                      fi.$fi_last_assertions_asserted$.rebind(_prev_bind_0_23, thread);
                    }
                  }
                } catch (Throwable catch_var) {
                  Errors.handleThrowable(catch_var, NIL);
                }
              } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
              }
            }
          } catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
          }
        } else {
          {
            SubLObject _prev_bind_0 = fi.$fi_last_assertions_asserted$.currentBinding(thread);
            try {
              fi.$fi_last_assertions_asserted$.bind(NIL, thread);
              {
                SubLObject v_properties = list($kw54$STRENGTH, strength, $kw55$DIRECTION, direction);
                if ((NIL != wffP)) {
                  result = cyc_kernel.cyc_assert_wff(formula, v_hlmt, v_properties);
                } else {
                  result = cyc_kernel.cyc_assert(formula, v_hlmt, v_properties);
                }
                assertions = fi.$fi_last_assertions_asserted$.getDynamicValue(thread);
              }
            } finally {
              fi.$fi_last_assertions_asserted$.rebind(_prev_bind_0, thread);
            }
          }
        }
        if ((NIL != result)) {
          operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list($sym41$FI_ASSERT, list($sym3$QUOTE, formula), list($sym3$QUOTE, v_hlmt), list($sym3$QUOTE, strength), list($sym3$QUOTE, direction))));
          {
            SubLObject ignore_errors_tag = NIL;
            try {
              {
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                  Errors.$error_handler$.bind(Symbols.symbol_function($sym7$IGNORE_ERRORS_HANDLER), thread);
                  try {
                    {
                      SubLObject _prev_bind_0_24 = fi.$fi_last_assertions_asserted$.currentBinding(thread);
                      try {
                        fi.$fi_last_assertions_asserted$.bind(assertions, thread);
                        if ((NIL != fi.fi_timestamp_assertion_int(operation_communication.the_cyclist(), fi.the_date(), fi.ke_purpose(), fi.the_second()))) {
                          operation_queues.add_to_transcript_queue(canon_tl.tl_encapsulate(list($sym42$FI_TIMESTAMP_ASSERTION, list($sym3$QUOTE, operation_communication.the_cyclist()), list($sym3$QUOTE, fi.the_date()), list($sym3$QUOTE, fi.ke_purpose()), list($sym3$QUOTE, fi.the_second()))));
                        }
                      } finally {
                        fi.$fi_last_assertions_asserted$.rebind(_prev_bind_0_24, thread);
                      }
                    }
                  } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                  }
                } finally {
                  Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
              }
            } catch (Throwable ccatch_env_var) {
              ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw6$IGNORE_ERRORS_TARGET);
            }
          }
          return Values.values(result, NIL);
        }
        if ((NIL != error_message)) {
          return Values.values(NIL, list($kw8$FATAL_ERROR, error_message));
        }
        if ((NIL != fi.fi_error_signaledP())) {
          return Values.values(NIL, list(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11152").first(), Functions.apply(Symbols.symbol_function($sym9$FORMAT), cons(NIL, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11153").rest()))));
        }
        return Values.values(NIL, $list10);
      }
    }
  }

  @SubL(source = "cycl/ke.lisp", position = 20804) 
  public static SubLSymbol $check_if_already_ke_unassertedP$ = null;

  /** Temporary control-variable;
   When non-nil, KE-EDIT uses FI-EDIT,
   otherwise it uses KE-UNASSERT, KE-ASSERT */
  @SubL(source = "cycl/ke.lisp", position = 23075) 
  private static SubLSymbol $ke_edit_use_fi_edit$ = null;

  /** A hash table:  keys are strings, values are lists of constants related to
those strings by #$oldConstantName. */
  @SubL(source = "cycl/ke.lisp", position = 39572) 
  private static SubLSymbol $old_constant_names_table$ = null;

  /** Find any constants for which STRING is an oldConstantName. */
  @SubL(source = "cycl/ke.lisp", position = 39823) 
  public static final SubLObject old_constant_names(SubLObject string) {
    if ((NIL != $old_constant_names_table$.getGlobalValue())) {
      return Values.values(Hashtables.gethash(string, $old_constant_names_table$.getGlobalValue(), UNPROVIDED));
    }
    return NIL;
  }

  /** Set up the *old-constant-names-table* table. */
  @SubL(source = "cycl/ke.lisp", position = 40031) 
  public static final SubLObject initialize_old_constant_names() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject total = kb_indexing.num_predicate_extent_index($const38$oldConstantName, $const18$BookkeepingMt);
        if ((!($old_constant_names_table$.getGlobalValue().isHashtable()))) {
          $old_constant_names_table$.setGlobalValue(Hashtables.make_hash_table(total, Symbols.symbol_function(EQUALP), UNPROVIDED));
        }
        Hashtables.clrhash($old_constant_names_table$.getGlobalValue());
        {
          SubLObject sofar = ZERO_INTEGER;
          {
            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
              utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
              utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
              utilities_macros.$within_noting_percent_progress$.bind(T, thread);
              utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
              utilities_macros.noting_percent_progress_preamble($str83$Initializing_old_constant_name_ta);
              {
                SubLObject _prev_bind_0_25 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1_26 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                  mt_relevance_macros.$relevant_mt_function$.bind($sym23$RELEVANT_MT_IS_EQ, thread);
                  mt_relevance_macros.$mt$.bind($const18$BookkeepingMt, thread);
                  {
                    SubLObject pred_var = $const38$oldConstantName;
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
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw24$GAF, $kw84$TRUE, NIL);
                                  {
                                    SubLObject done_var_27 = NIL;
                                    SubLObject token_var_28 = NIL;
                                    while ((NIL == done_var_27)) {
                                      {
                                        SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_28);
                                        SubLObject valid_29 = makeBoolean((token_var_28 != gaf));
                                        if ((NIL != valid_29)) {
                                          sofar = Numbers.add(sofar, ONE_INTEGER);
                                          utilities_macros.note_percent_progress(sofar, total);
                                          if ((NIL != assertions_high.gaf_assertionP(gaf))) {
                                            {
                                              SubLObject constant = assertions_high.gaf_arg(gaf, ONE_INTEGER);
                                              SubLObject string = assertions_high.gaf_arg(gaf, TWO_INTEGER);
                                              cache_old_constant_name(string, constant);
                                            }
                                          }
                                        }
                                        done_var_27 = makeBoolean((NIL == valid_29));
                                      }
                                    }
                                  }
                                } finally {
                                  {
                                    SubLObject _prev_bind_0_30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                      if ((NIL != final_index_iterator)) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                      }
                                    } finally {
                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_30, thread);
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
                  mt_relevance_macros.$mt$.rebind(_prev_bind_1_26, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_25, thread);
                }
              }
              utilities_macros.noting_percent_progress_postamble();
            } finally {
              utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
              utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
              utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
              utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return Hashtables.hash_table_count($old_constant_names_table$.getGlobalValue());
    }
  }

  @SubL(source = "cycl/ke.lisp", position = 40862) 
  public static final SubLObject cache_old_constant_name(SubLObject string, SubLObject constant) {
    if ((NIL != $old_constant_names_table$.getGlobalValue())) {
      {
        SubLObject entry = old_constant_names(string);
        Hashtables.sethash(string, $old_constant_names_table$.getGlobalValue(), conses_high.adjoin(constant, entry, Symbols.symbol_function(EQUALP), UNPROVIDED));
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/ke.lisp", position = 41120) 
  public static final SubLObject decache_old_constant_name(SubLObject string, SubLObject constant) {
    if ((NIL != $old_constant_names_table$.getGlobalValue())) {
      {
        SubLObject entry = old_constant_names(string);
        if ((NIL != entry)) {
          entry = Sequences.delete(constant, entry, Symbols.symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          if ((NIL == entry)) {
            Hashtables.remhash(string, $old_constant_names_table$.getGlobalValue());
          } else {
            Hashtables.sethash(string, $old_constant_names_table$.getGlobalValue(), entry);
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/ke.lisp", position = 41702) 
  private static SubLSymbol $ke_assertion_edit_formula_find_func$ = null;

  @SubL(source = "cycl/ke.lisp", position = 41834) 
  private static SubLSymbol $ke_assertion_edit_formula_display_func$ = null;

  public static final SubLObject declare_ke_file() {
    //declareFunction("ke_create", "KE-CREATE", 1, 0, false);
    //declareFunction("ke_create_from_serialization", "KE-CREATE-FROM-SERIALIZATION", 2, 0, false);
    //declareFunction("ke_create_internal", "KE-CREATE-INTERNAL", 1, 1, false);
    declareFunction("ke_create_now", "KE-CREATE-NOW", 1, 1, false);
    declareFunction("ke_find_or_create_now", "KE-FIND-OR-CREATE-NOW", 1, 1, false);
    //declareFunction("ke_recreate_now", "KE-RECREATE-NOW", 1, 0, false);
    //declareFunction("ke_merge", "KE-MERGE", 2, 0, false);
    //declareFunction("ke_merge_now", "KE-MERGE-NOW", 2, 0, false);
    //declareFunction("ke_kill", "KE-KILL", 1, 0, false);
    declareFunction("ke_kill_now", "KE-KILL-NOW", 1, 0, false);
    //declareFunction("ke_recreate", "KE-RECREATE", 1, 0, false);
    //declareFunction("rename_code_constant", "RENAME-CODE-CONSTANT", 2, 0, false);
    //declareFunction("ke_rename", "KE-RENAME", 2, 0, false);
    //declareFunction("ke_rename_code_constant", "KE-RENAME-CODE-CONSTANT", 2, 0, false);
    //declareFunction("ke_rename_internal", "KE-RENAME-INTERNAL", 2, 0, false);
    //declareFunction("note_old_constant_name", "NOTE-OLD-CONSTANT-NAME", 2, 0, false);
    declareFunction("ke_rename_now", "KE-RENAME-NOW", 2, 0, false);
    //declareFunction("ke_assert", "KE-ASSERT", 2, 2, false);
    //declareFunction("ke_reassert_assertion_now", "KE-REASSERT-ASSERTION-NOW", 3, 0, false);
    //declareFunction("ke_reassert_assertion_now_int", "KE-REASSERT-ASSERTION-NOW-INT", 3, 0, false);
    //declareFunction("ke_reassert_assertion", "KE-REASSERT-ASSERTION", 3, 0, false);
    //declareFunction("ke_repropagate_assertion_now", "KE-REPROPAGATE-ASSERTION-NOW", 1, 0, false);
    //declareFunction("ke_repropagate_assertion", "KE-REPROPAGATE-ASSERTION", 1, 0, false);
    declareFunction("ke_assert_now", "KE-ASSERT-NOW", 2, 2, false);
    //declareFunction("ke_assert_wff_now", "KE-ASSERT-WFF-NOW", 2, 2, false);
    declareFunction("ke_assert_now_int", "KE-ASSERT-NOW-INT", 5, 0, false);
    //declareFunction("ke_assert_with_implicature", "KE-ASSERT-WITH-IMPLICATURE", 2, 2, false);
    //declareFunction("ke_assert_now_with_implicature", "KE-ASSERT-NOW-WITH-IMPLICATURE", 2, 2, false);
    //declareFunction("ke_assert_with_implicature_int", "KE-ASSERT-WITH-IMPLICATURE-INT", 5, 0, false);
    //declareFunction("ke_assert_with_implicature_int_assert", "KE-ASSERT-WITH-IMPLICATURE-INT-ASSERT", 5, 0, false);
    //declareFunction("ke_unassert", "KE-UNASSERT", 2, 0, false);
    //declareFunction("ke_unassert_assertion", "KE-UNASSERT-ASSERTION", 1, 0, false);
    //declareFunction("ke_unassert_now", "KE-UNASSERT-NOW", 2, 0, false);
    //declareFunction("ke_unassert_assertion_now", "KE-UNASSERT-ASSERTION-NOW", 1, 0, false);
    //declareFunction("ke_edit", "KE-EDIT", 3, 3, false);
    //declareFunction("ke_edit_now", "KE-EDIT-NOW", 3, 3, false);
    //declareFunction("ke_edit_assertion", "KE-EDIT-ASSERTION", 2, 3, false);
    //declareFunction("ke_edit_assertion_preserving_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS", 3, 3, false);
    //declareFunction("ke_edit_assertion_now_preserving_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-META-ASSERTIONS", 3, 3, false);
    //declareFunction("ke_edit_assertion_preserving_meta_assertions_int", "KE-EDIT-ASSERTION-PRESERVING-META-ASSERTIONS-INT", 7, 0, false);
    //declareFunction("ke_edit_assertion_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
    //declareFunction("ke_edit_assertion_now_preserving_all_meta_assertions", "KE-EDIT-ASSERTION-NOW-PRESERVING-ALL-META-ASSERTIONS", 2, 3, false);
    //declareFunction("ke_null_edit_assertion", "KE-NULL-EDIT-ASSERTION", 1, 0, false);
    //declareFunction("ke_edit_compute_new_meta_assertion_assertibles", "KE-EDIT-COMPUTE-NEW-META-ASSERTION-ASSERTIBLES", 4, 0, false);
    //declareFunction("extract_old_meta_assertion_info", "EXTRACT-OLD-META-ASSERTION-INFO", 1, 0, false);
    //declareFunction("ke_edit_assertion_strings", "KE-EDIT-ASSERTION-STRINGS", 2, 1, false);
    //declareFunction("ke_recanonicalize_assertion", "KE-RECANONICALIZE-ASSERTION", 1, 1, false);
    //declareFunction("ke_recanonicalize_assertion_now", "KE-RECANONICALIZE-ASSERTION-NOW", 1, 1, false);
    //declareFunction("ke_edit_assertion_but_not_bookkeeping", "KE-EDIT-ASSERTION-BUT-NOT-BOOKKEEPING", 2, 4, false);
    //declareFunction("ke_edit_assertion_now_but_not_bookkeeping", "KE-EDIT-ASSERTION-NOW-BUT-NOT-BOOKKEEPING", 2, 4, false);
    //declareFunction("formulas_differ_only_in_strings", "FORMULAS-DIFFER-ONLY-IN-STRINGS", 2, 0, false);
    //declareFunction("tree_equal_ignoring_type", "TREE-EQUAL-IGNORING-TYPE", 3, 1, false);
    //declareFunction("ke_blast", "KE-BLAST", 2, 0, false);
    //declareFunction("ke_blast_assertion", "KE-BLAST-ASSERTION", 1, 0, false);
    //declareFunction("ke_rename_variables", "KE-RENAME-VARIABLES", 3, 0, false);
    //declareFunction("ke_remove_argument", "KE-REMOVE-ARGUMENT", 3, 0, false);
    //declareFunction("ke_remove_deduction", "KE-REMOVE-DEDUCTION", 1, 0, false);
    //declareFunction("ke_tms_reconsider_term", "KE-TMS-RECONSIDER-TERM", 1, 1, false);
    //declareFunction("ke_tms_reconsider_formula", "KE-TMS-RECONSIDER-FORMULA", 2, 0, false);
    //declareFunction("ke_tms_reconsider_assertion", "KE-TMS-RECONSIDER-ASSERTION", 1, 0, false);
    //declareFunction("ke_blast_all_dependents", "KE-BLAST-ALL-DEPENDENTS", 1, 0, false);
    //declareFunction("ke_change_assertion_direction", "KE-CHANGE-ASSERTION-DIRECTION", 2, 0, false);
    //declareFunction("ke_change_assertion_strength", "KE-CHANGE-ASSERTION-STRENGTH", 2, 0, false);
    //declareFunction("ke_change_assertion_mt", "KE-CHANGE-ASSERTION-MT", 2, 1, false);
    //declareFunction("ke_convert_assertion", "KE-CONVERT-ASSERTION", 2, 2, false);
    declareFunction("old_constant_names", "OLD-CONSTANT-NAMES", 1, 0, false);
    declareFunction("initialize_old_constant_names", "INITIALIZE-OLD-CONSTANT-NAMES", 0, 0, false);
    declareFunction("cache_old_constant_name", "CACHE-OLD-CONSTANT-NAME", 2, 0, false);
    declareFunction("decache_old_constant_name", "DECACHE-OLD-CONSTANT-NAME", 2, 0, false);
    //declareFunction("do_edit_op", "DO-EDIT-OP", 1, 0, false);
    //declareFunction("find_assertions_via_tl", "FIND-ASSERTIONS-VIA-TL", 2, 0, false);
    //declareFunction("ke_assertion_edit_formula", "KE-ASSERTION-EDIT-FORMULA", 1, 0, false);
    //declareFunction("ke_assertion_find_formula", "KE-ASSERTION-FIND-FORMULA", 1, 0, false);
    //declareFunction("cyclist_is_guest", "CYCLIST-IS-GUEST", 0, 0, false);
    //declareFunction("ensure_cyclist_ok", "ENSURE-CYCLIST-OK", 0, 0, false);
    //declareFunction("ke_eval_now", "KE-EVAL-NOW", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_ke_file() {
    $note_merged_constant_name$ = defparameter("*NOTE-MERGED-CONSTANT-NAME*", T);
    $note_old_constant_name$ = defparameter("*NOTE-OLD-CONSTANT-NAME*", T);
    $check_if_already_ke_unassertedP$ = defparameter("*CHECK-IF-ALREADY-KE-UNASSERTED?*", NIL);
    $ke_edit_use_fi_edit$ = deflexical("*KE-EDIT-USE-FI-EDIT*", maybeDefault( $sym62$_KE_EDIT_USE_FI_EDIT_, $ke_edit_use_fi_edit$, NIL));
    $old_constant_names_table$ = deflexical("*OLD-CONSTANT-NAMES-TABLE*", maybeDefault( $sym82$_OLD_CONSTANT_NAMES_TABLE_, $old_constant_names_table$, NIL));
    $ke_assertion_edit_formula_find_func$ = defparameter("*KE-ASSERTION-EDIT-FORMULA-FIND-FUNC*", $sym85$ASSERTION_TL_IST_FORMULA);
    $ke_assertion_edit_formula_display_func$ = defparameter("*KE-ASSERTION-EDIT-FORMULA-DISPLAY-FUNC*", $sym86$ASSERTION_EL_FORMULA);
    return NIL;
  }

  public static final SubLObject setup_ke_file() {
        access_macros.register_external_symbol($sym0$KE_CREATE);
    utilities_macros.register_cyc_api_function($sym11$KE_CREATE_NOW, $list12, $str13$Create_new_constant_now_and_add_o, NIL, $list14);
    access_macros.register_external_symbol($sym15$KE_MERGE);
    access_macros.register_external_symbol($sym25$KE_KILL);
    utilities_macros.register_cyc_api_function($sym28$KE_KILL_NOW, $list29, $str30$Kill_FORT_now_and_add_operation_t, NIL, $list31);
    access_macros.register_external_symbol($sym39$KE_ASSERT);
    utilities_macros.register_cyc_api_function($sym49$KE_ASSERT_NOW, $list50, $str51$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
    utilities_macros.register_cyc_api_function($sym52$KE_ASSERT_WFF_NOW, $list50, $str53$Assert_FORMULA_in_MT_now_and_add_, NIL, $list31);
    access_macros.register_external_symbol($sym56$KE_UNASSERT);
    utilities_macros.register_cyc_api_function($sym59$KE_UNASSERT_NOW, $list60, $str61$Unassert_FORMULA_in_MT_now_and_ad, NIL, $list31);
    subl_macro_promotions.declare_defglobal($sym62$_KE_EDIT_USE_FI_EDIT_);
    access_macros.register_external_symbol($sym67$KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS);
    subl_macro_promotions.declare_defglobal($sym82$_OLD_CONSTANT_NAMES_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$KE_CREATE = makeSymbol("KE-CREATE");
  public static final SubLSymbol $kw1$QUEUED = makeKeyword("QUEUED");
  public static final SubLSymbol $sym2$FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");
  public static final SubLSymbol $sym3$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym4$FI_CREATE = makeSymbol("FI-CREATE");
  public static final SubLSymbol $sym5$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw6$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym7$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw8$FATAL_ERROR = makeKeyword("FATAL-ERROR");
  public static final SubLSymbol $sym9$FORMAT = makeSymbol("FORMAT");
  public static final SubLList $list10 = list(makeKeyword("UNKNOWN-ERROR"), makeString("An unknown error has occurred"));
  public static final SubLSymbol $sym11$KE_CREATE_NOW = makeSymbol("KE-CREATE-NOW");
  public static final SubLList $list12 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("EXTERNAL-ID"));
  public static final SubLString $str13$Create_new_constant_now_and_add_o = makeString("Create new constant now and add operation to transcript. If EXTERNAL-ID is non-null \nit is used, otherwise a unique identifier is generated.\n@return 0 constant ;; new constant if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param NAME string\n@param EXTERNAL-ID guid-p\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
  public static final SubLList $list14 = list(makeSymbol("CONSTANT-P"), makeSymbol("LISTP"));
  public static final SubLSymbol $sym15$KE_MERGE = makeSymbol("KE-MERGE");
  public static final SubLSymbol $sym16$FI_MERGE = makeSymbol("FI-MERGE");
  public static final SubLObject $const17$mergedConstantName = constant_handles.reader_make_constant_shell(makeString("mergedConstantName"));
  public static final SubLObject $const18$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));
  public static final SubLObject $const19$mergedConstantGUID = constant_handles.reader_make_constant_shell(makeString("mergedConstantGUID"));
  public static final SubLString $str20$Skip_this_operation = makeString("Skip this operation");
  public static final SubLString $str21$Constant__S_cannot_be_merged_beca = makeString("Constant ~S cannot be merged because it is mentioned in code");
  public static final SubLList $list22 = list(makeKeyword("FATAL-ERROR"), list(makeSymbol("FORMAT"), NIL, makeString("~A is mentioned in code and cannot be merged."), makeSymbol("KILL-FORT")));
  public static final SubLSymbol $sym23$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $kw24$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym25$KE_KILL = makeSymbol("KE-KILL");
  public static final SubLSymbol $sym26$FI_KILL = makeSymbol("FI-KILL");
  public static final SubLString $str27$Constant__S_cannot_be_killed_beca = makeString("Constant ~S cannot be killed because it is mentioned in code");
  public static final SubLSymbol $sym28$KE_KILL_NOW = makeSymbol("KE-KILL-NOW");
  public static final SubLList $list29 = list(makeSymbol("FORT"));
  public static final SubLString $str30$Kill_FORT_now_and_add_operation_t = makeString("Kill FORT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORT fort\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
  public static final SubLList $list31 = list(makeSymbol("BOOLEANP"), makeSymbol("LISTP"));
  public static final SubLSymbol $sym32$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str33$Constant__S_cannot_be_renamed_bec = makeString("Constant ~S cannot be renamed because it is mentioned in code");
  public static final SubLString $str34$Use_KE_RENAME = makeString("Use KE-RENAME");
  public static final SubLString $str35$Constant__S_is_not_mentioned_in_c = makeString("Constant ~S is not mentioned in code");
  public static final SubLSymbol $sym36$FI_RENAME = makeSymbol("FI-RENAME");
  public static final SubLSymbol $sym37$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLObject $const38$oldConstantName = constant_handles.reader_make_constant_shell(makeString("oldConstantName"));
  public static final SubLSymbol $sym39$KE_ASSERT = makeSymbol("KE-ASSERT");
  public static final SubLSymbol $kw40$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym41$FI_ASSERT = makeSymbol("FI-ASSERT");
  public static final SubLSymbol $sym42$FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");
  public static final SubLSymbol $sym43$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym44$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLSymbol $sym45$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLSymbol $sym46$FI_REASSERT = makeSymbol("FI-REASSERT");
  public static final SubLSymbol $kw47$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw48$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym49$KE_ASSERT_NOW = makeSymbol("KE-ASSERT-NOW");
  public static final SubLList $list50 = list(makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), makeSymbol("DIRECTION"));
  public static final SubLString $str51$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
  public static final SubLSymbol $sym52$KE_ASSERT_WFF_NOW = makeSymbol("KE-ASSERT-WFF-NOW");
  public static final SubLString $str53$Assert_FORMULA_in_MT_now_and_add_ = makeString("Assert FORMULA in MT now and add operation to transcript.\nFORMULA is assumed to be WFF.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@param STRENGTH keyword\n@param DIRECTION keyword\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
  public static final SubLSymbol $kw54$STRENGTH = makeKeyword("STRENGTH");
  public static final SubLSymbol $kw55$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $sym56$KE_UNASSERT = makeSymbol("KE-UNASSERT");
  public static final SubLSymbol $sym57$FI_UNASSERT = makeSymbol("FI-UNASSERT");
  public static final SubLString $str58$Sentence__S_in_mt__S__is_not_in_t = makeString("Sentence ~S in mt ~S~%is not in the KB and you are trying to unassert it.");
  public static final SubLSymbol $sym59$KE_UNASSERT_NOW = makeSymbol("KE-UNASSERT-NOW");
  public static final SubLList $list60 = list(makeSymbol("FORMULA"), makeSymbol("MT"));
  public static final SubLString $str61$Unassert_FORMULA_in_MT_now_and_ad = makeString("Unassert FORMULA in MT now and add operation to transcript.\n@return 0 boolean ;; t if success, o/w nil\n@return 1 list ;; error list of form (ERROR-TYPE ERROR-STRING) otherwise.\n@param FORMULA list\n@param MT microtheory\n@note Assumes cyclist is ok.\n@note The salient property of this function is that it never throws an error.\n@owner jantos\n@privacy done\n");
  public static final SubLSymbol $sym62$_KE_EDIT_USE_FI_EDIT_ = makeSymbol("*KE-EDIT-USE-FI-EDIT*");
  public static final SubLSymbol $sym63$FI_EDIT = makeSymbol("FI-EDIT");
  public static final SubLString $str64$KE_EDIT_NOW_does_not_yet_use_FI_E = makeString("KE-EDIT-NOW does not yet use FI-EDIT");
  public static final SubLSymbol $kw65$ALL = makeKeyword("ALL");
  public static final SubLList $list66 = list(makeSymbol("NEW-META-ASSERTION-EL-FORMULA"), makeSymbol("NEW-META-ASSERTION-MT"), makeSymbol("NEW-META-ASSERTION-STRENGTH"), makeSymbol("NEW-META-ASSERTION-DIRECTION"));
  public static final SubLSymbol $sym67$KE_EDIT_ASSERTION_PRESERVING_ALL_META_ASSERTIONS = makeSymbol("KE-EDIT-ASSERTION-PRESERVING-ALL-META-ASSERTIONS");
  public static final SubLObject $const68$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLList $list69 = list(makeSymbol("OLD-META-ASSERTION"), makeSymbol("&OPTIONAL"), makeSymbol("NEW-META-ASSERTION-MT"));
  public static final SubLString $str70$Sentences_do_not_differ_only_in_s = makeString("Sentences do not differ only in strings");
  public static final SubLSymbol $sym71$FI_BLAST = makeSymbol("FI-BLAST");
  public static final SubLSymbol $sym72$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym73$ALIST_P = makeSymbol("ALIST-P");
  public static final SubLSymbol $sym74$FI_RENAME_VARIABLES = makeSymbol("FI-RENAME-VARIABLES");
  public static final SubLSymbol $sym75$FI_REMOVE_ARGUMENT = makeSymbol("FI-REMOVE-ARGUMENT");
  public static final SubLSymbol $sym76$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $sym77$CONVERT_HL_SUPPORT_TO_TL_SUPPORT = makeSymbol("CONVERT-HL-SUPPORT-TO-TL-SUPPORT");
  public static final SubLSymbol $sym78$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym79$FI_TMS_RECONSIDER_TERM = makeSymbol("FI-TMS-RECONSIDER-TERM");
  public static final SubLSymbol $sym80$FI_TMS_RECONSIDER_FORMULA = makeSymbol("FI-TMS-RECONSIDER-FORMULA");
  public static final SubLSymbol $sym81$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym82$_OLD_CONSTANT_NAMES_TABLE_ = makeSymbol("*OLD-CONSTANT-NAMES-TABLE*");
  public static final SubLString $str83$Initializing_old_constant_name_ta = makeString("Initializing old constant name table");
  public static final SubLSymbol $kw84$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym85$ASSERTION_TL_IST_FORMULA = makeSymbol("ASSERTION-TL-IST-FORMULA");
  public static final SubLSymbol $sym86$ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");
  public static final SubLSymbol $sym87$ASSERTION_TL_FORMULA = makeSymbol("ASSERTION-TL-FORMULA");
  public static final SubLObject $const88$Guest = constant_handles.reader_make_constant_shell(makeString("Guest"));
  public static final SubLString $str89$KB_editing_is_not_allowed_for_use = makeString("KB editing is not allowed for users logged in as #$Guest.");
  public static final SubLSymbol $kw90$GENERIC_ERROR = makeKeyword("GENERIC-ERROR");
  public static final SubLSymbol $sym91$FI_EVAL = makeSymbol("FI-EVAL");

  //// Initializers

  public void declareFunctions() {
    declare_ke_file();
  }

  public void initializeVariables() {
    init_ke_file();
  }

  public void runTopLevelForms() {
    setup_ke_file();
  }

}
