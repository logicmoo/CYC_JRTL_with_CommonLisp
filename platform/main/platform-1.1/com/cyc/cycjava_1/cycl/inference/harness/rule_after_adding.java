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

package  com.cyc.cycjava_1.cycl.inference.harness;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.inference.harness.after_adding;
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class rule_after_adding extends SubLTranslatedFile {

  //// Constructor

  private rule_after_adding() {}
  public static final SubLFile me = new rule_after_adding();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.rule_after_adding";

  //// Definitions

  /** The predicates whose extent implement the ruleAfterAdding and ruleAfterRemoving support. */
  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 756) 
  public static SubLSymbol $rule_after_adding_predicates$ = null;

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 959) 
  private static SubLSymbol $rule_after_addings_hash$ = null;

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1073) 
  private static SubLSymbol $rule_after_removings_hash$ = null;

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1137) 
  public static final SubLObject clear_rule_after_addings() {
    if ((NIL != $rule_after_addings_hash$.getGlobalValue())) {
      Hashtables.clrhash($rule_after_addings_hash$.getGlobalValue());
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1310) 
  public static final SubLObject clear_rule_after_removings() {
    if ((NIL != $rule_after_removings_hash$.getGlobalValue())) {
      Hashtables.clrhash($rule_after_removings_hash$.getGlobalValue());
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1452) 
  public static final SubLObject handle_rule_after_addings(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argument, $sym2$ARGUMENT_P);
      checkType(assertion, $sym3$ASSERTION_P);
      if ((NIL == after_adding.$after_addings_disabledP$.getDynamicValue(thread))) {
        if ((NIL != assertions_high.rule_assertionP(assertion))) {
          {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            {
              SubLObject cdolist_list_var = clauses.neg_lits(cnf);
              SubLObject literal = NIL;
              for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                handle_rule_after_addings_int(argument, literal, assertion);
              }
            }
            {
              SubLObject cdolist_list_var = clauses.pos_lits(cnf);
              SubLObject literal = NIL;
              for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                handle_rule_after_addings_int(argument, literal, assertion);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1958) 
  public static final SubLObject handle_rule_after_addings_int(SubLObject argument, SubLObject literal, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = el_utilities.literal_arg(literal, ZERO_INTEGER, UNPROVIDED);
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
                  SubLObject cdolist_list_var = get_rule_after_addings(pred);
                  SubLObject info = NIL;
                  for (info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), info = cdolist_list_var.first()) {
                    {
                      SubLObject datum = info;
                      SubLObject current = datum;
                      SubLObject fun = NIL;
                      SubLObject fun_mt = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
                      fun = current.first();
                      current = current.rest();
                      fun_mt = current;
                      if ((fun.isFunctionSpec()
                           && (NIL != mt_relevance_macros.relevant_mtP(fun_mt)))) {
                        {
                          SubLObject ignore_errors_tag = NIL;
                          try {
                            {
                              SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                              try {
                                Errors.$error_handler$.bind(Symbols.symbol_function($sym6$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33042");
                                } catch (Throwable catch_var) {
                                  Errors.handleThrowable(catch_var, NIL);
                                }
                              } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                              }
                            }
                          } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw5$IGNORE_ERRORS_TARGET);
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
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 2471) 
  public static final SubLObject handle_rule_after_removings(SubLObject argument, SubLObject assertion) {
    checkType(argument, $sym2$ARGUMENT_P);
    checkType(assertion, $sym3$ASSERTION_P);
    if ((NIL != assertions_high.rule_assertionP(assertion))) {
      {
        SubLObject cnf = assertions_high.assertion_cnf(assertion);
        {
          SubLObject cdolist_list_var = clauses.neg_lits(cnf);
          SubLObject literal = NIL;
          for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
            handle_rule_after_removings_int(argument, literal, assertion);
          }
        }
        {
          SubLObject cdolist_list_var = clauses.pos_lits(cnf);
          SubLObject literal = NIL;
          for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
            handle_rule_after_removings_int(argument, literal, assertion);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 2904) 
  public static final SubLObject handle_rule_after_removings_int(SubLObject argument, SubLObject literal, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = el_utilities.literal_arg(assertion, ZERO_INTEGER, UNPROVIDED);
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
                  SubLObject cdolist_list_var = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33041");
                  SubLObject info = NIL;
                  for (info = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), info = cdolist_list_var.first()) {
                    {
                      SubLObject datum = info;
                      SubLObject current = datum;
                      SubLObject fun = NIL;
                      SubLObject fun_mt = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
                      fun = current.first();
                      current = current.rest();
                      fun_mt = current;
                      if ((fun.isFunctionSpec()
                           && (NIL != mt_relevance_macros.relevant_mtP(fun_mt)))) {
                        {
                          SubLObject ignore_errors_tag = NIL;
                          try {
                            {
                              SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                              try {
                                Errors.$error_handler$.bind(Symbols.symbol_function($sym6$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33044");
                                } catch (Throwable catch_var) {
                                  Errors.handleThrowable(catch_var, NIL);
                                }
                              } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                              }
                            }
                          } catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw5$IGNORE_ERRORS_TARGET);
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
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3431) 
  public static final SubLObject get_rule_after_addings(SubLObject pred) {
    if ((NIL == $rule_after_addings_hash$.getGlobalValue())) {
      initialize_rule_after_addings_hash();
    }
    return Hashtables.gethash_without_values(pred, $rule_after_addings_hash$.getGlobalValue(), NIL);
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4185) 
  public static final SubLObject rebuild_rule_after_adding_caches() {
    initialize_rule_after_addings_hash();
    initialize_rule_after_removings_hash();
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4389) 
  public static final SubLObject initialize_rule_after_addings_hash() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $rule_after_addings_hash$.getGlobalValue())) {
        Hashtables.clrhash($rule_after_addings_hash$.getGlobalValue());
      } else {
        $rule_after_addings_hash$.setGlobalValue(Hashtables.make_hash_table($int7$100, UNPROVIDED, UNPROVIDED));
      }
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym8$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const9$EverythingPSC, thread);
          {
            SubLObject pred_var = $const10$ruleAfterAdding;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$GAF, NIL, NIL);
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
                                    SubLObject rule_after_adding_pred = NIL;
                                    SubLObject pred = NIL;
                                    SubLObject v_rule_after_adding = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
                                    rule_after_adding_pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
                                    pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
                                    v_rule_after_adding = current.first();
                                    current = current.rest();
                                    if ((NIL == current)) {
                                      if ((NIL != forts.valid_fortP(pred))) {
                                        v_rule_after_adding = el_utilities.cycl_subl_symbol_symbol(v_rule_after_adding);
                                        {
                                          SubLObject item_var = cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
                                          if ((NIL == conses_high.member(item_var, Hashtables.gethash(pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                            Hashtables.sethash(pred, $rule_after_addings_hash$.getGlobalValue(), cons(item_var, Hashtables.gethash(pred, $rule_after_addings_hash$.getGlobalValue(), UNPROVIDED)));
                                          }
                                        }
                                      }
                                    } else {
                                      cdestructuring_bind.cdestructuring_bind_error(datum, $list12);
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

  @SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 5056) 
  public static final SubLObject initialize_rule_after_removings_hash() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!($rule_after_removings_hash$.getGlobalValue().isHashtable()))) {
        $rule_after_removings_hash$.setGlobalValue(Hashtables.make_hash_table($int7$100, UNPROVIDED, UNPROVIDED));
      } else {
        Hashtables.clrhash($rule_after_removings_hash$.getGlobalValue());
      }
      {
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
          mt_relevance_macros.$relevant_mt_function$.bind($sym8$RELEVANT_MT_IS_EVERYTHING, thread);
          mt_relevance_macros.$mt$.bind($const9$EverythingPSC, thread);
          {
            SubLObject pred_var = $const13$ruleAfterRemoving;
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
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw11$GAF, NIL, NIL);
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
                                    SubLObject rule_after_removing_pred = NIL;
                                    SubLObject pred = NIL;
                                    SubLObject rule_after_removing = NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                                    rule_after_removing_pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                                    pred = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list14);
                                    rule_after_removing = current.first();
                                    current = current.rest();
                                    if ((NIL == current)) {
                                      if ((NIL != forts.valid_fortP(pred))) {
                                        rule_after_removing = el_utilities.cycl_subl_symbol_symbol(rule_after_removing);
                                        {
                                          SubLObject item_var = cons(rule_after_removing, assertions_high.assertion_mt(ass));
                                          if ((NIL == conses_high.member(item_var, Hashtables.gethash(pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                            Hashtables.sethash(pred, $rule_after_removings_hash$.getGlobalValue(), cons(item_var, Hashtables.gethash(pred, $rule_after_removings_hash$.getGlobalValue(), UNPROVIDED)));
                                          }
                                        }
                                      }
                                    } else {
                                      cdestructuring_bind.cdestructuring_bind_error(datum, $list14);
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

  public static final SubLObject declare_rule_after_adding_file() {
    declareFunction(myName, "clear_rule_after_addings", "CLEAR-RULE-AFTER-ADDINGS", 0, 0, false);
    declareFunction(myName, "clear_rule_after_removings", "CLEAR-RULE-AFTER-REMOVINGS", 0, 0, false);
    declareFunction(myName, "handle_rule_after_addings", "HANDLE-RULE-AFTER-ADDINGS", 2, 0, false);
    declareFunction(myName, "handle_rule_after_addings_int", "HANDLE-RULE-AFTER-ADDINGS-INT", 3, 0, false);
    declareFunction(myName, "handle_rule_after_removings", "HANDLE-RULE-AFTER-REMOVINGS", 2, 0, false);
    declareFunction(myName, "handle_rule_after_removings_int", "HANDLE-RULE-AFTER-REMOVINGS-INT", 3, 0, false);
    declareFunction(myName, "get_rule_after_addings", "GET-RULE-AFTER-ADDINGS", 1, 0, false);
    declareFunction(myName, "get_rule_after_removings", "GET-RULE-AFTER-REMOVINGS", 1, 0, false);
    declareFunction(myName, "handle_rule_after_adding", "HANDLE-RULE-AFTER-ADDING", 4, 0, false);
    declareFunction(myName, "handle_rule_after_removing", "HANDLE-RULE-AFTER-REMOVING", 4, 0, false);
    declareFunction(myName, "rebuild_rule_after_adding_caches", "REBUILD-RULE-AFTER-ADDING-CACHES", 0, 0, false);
    declareFunction(myName, "initialize_rule_after_addings_hash", "INITIALIZE-RULE-AFTER-ADDINGS-HASH", 0, 0, false);
    declareFunction(myName, "initialize_rule_after_removings_hash", "INITIALIZE-RULE-AFTER-REMOVINGS-HASH", 0, 0, false);
    declareFunction(myName, "recache_rule_after_addings", "RECACHE-RULE-AFTER-ADDINGS", 1, 0, false);
    declareFunction(myName, "recache_rule_after_removings", "RECACHE-RULE-AFTER-REMOVINGS", 1, 0, false);
    declareFunction(myName, "propagate_rule_after_adding", "PROPAGATE-RULE-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "repropagate_rule_after_adding", "REPROPAGATE-RULE-AFTER-ADDING", 3, 0, false);
    declareFunction(myName, "repropagate_rule_after_adding_internal", "REPROPAGATE-RULE-AFTER-ADDING-INTERNAL", 2, 0, false);
    declareFunction(myName, "gather_literals_with_pred", "GATHER-LITERALS-WITH-PRED", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_rule_after_adding_file() {
    $rule_after_adding_predicates$ = deflexical("*RULE-AFTER-ADDING-PREDICATES*", NIL);
    $rule_after_addings_hash$ = deflexical("*RULE-AFTER-ADDINGS-HASH*", ((NIL != Symbols.boundp($sym0$_RULE_AFTER_ADDINGS_HASH_)) ? ((SubLObject) $rule_after_addings_hash$.getGlobalValue()) : NIL));
    $rule_after_removings_hash$ = deflexical("*RULE-AFTER-REMOVINGS-HASH*", ((NIL != Symbols.boundp($sym1$_RULE_AFTER_REMOVINGS_HASH_)) ? ((SubLObject) $rule_after_removings_hash$.getGlobalValue()) : NIL));
    return NIL;
  }

  public static final SubLObject setup_rule_after_adding_file() {
    // CVS_ID("Id: rule-after-adding.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_RULE_AFTER_ADDINGS_HASH_);
    subl_macro_promotions.declare_defglobal($sym1$_RULE_AFTER_REMOVINGS_HASH_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_RULE_AFTER_ADDINGS_HASH_ = makeSymbol("*RULE-AFTER-ADDINGS-HASH*");
  public static final SubLSymbol $sym1$_RULE_AFTER_REMOVINGS_HASH_ = makeSymbol("*RULE-AFTER-REMOVINGS-HASH*");
  public static final SubLSymbol $sym2$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $sym3$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLList $list4 = cons(makeSymbol("FUN"), makeSymbol("FUN-MT"));
  public static final SubLSymbol $kw5$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym6$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLInteger $int7$100 = makeInteger(100);
  public static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const9$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const10$ruleAfterAdding = constant_handles.reader_make_constant_shell(makeString("ruleAfterAdding"));
  public static final SubLSymbol $kw11$GAF = makeKeyword("GAF");
  public static final SubLList $list12 = list(makeSymbol("RULE-AFTER-ADDING-PRED"), makeSymbol("PRED"), makeSymbol("RULE-AFTER-ADDING"));
  public static final SubLObject $const13$ruleAfterRemoving = constant_handles.reader_make_constant_shell(makeString("ruleAfterRemoving"));
  public static final SubLList $list14 = list(makeSymbol("RULE-AFTER-REMOVING-PRED"), makeSymbol("PRED"), makeSymbol("RULE-AFTER-REMOVING"));
  public static final SubLSymbol $sym15$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw16$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym17$PROPAGATE_RULE_AFTER_ADDING = makeSymbol("PROPAGATE-RULE-AFTER-ADDING");
  public static final SubLSymbol $sym18$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym19$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym20$RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");
  public static final SubLSymbol $kw21$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym22$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");

  //// Initializers

  public void declareFunctions() {
    declare_rule_after_adding_file();
  }

  public void initializeVariables() {
    init_rule_after_adding_file();
  }

  public void runTopLevelForms() {
    setup_rule_after_adding_file();
  }

}
