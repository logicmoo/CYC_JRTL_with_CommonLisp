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
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.verbosifier;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class precanonicalizer extends SubLTranslatedFile {

  //// Constructor

  private precanonicalizer() {}
  public static final SubLFile me = new precanonicalizer();
  public static final String myName = "com.cyc.cycjava_1.cycl.precanonicalizer";

  //// Definitions

  /** @param FORMULA-IS-AN-ASENT-WITH-NO-SUBFORMULAS?; when called by @xref canon-fast-gaf?,
   we can assume that FORMULA is an atomic sentence with no subformulas, so some of these tests
   can be sped up or bypassed entirely. */
  @SubL(source = "cycl/precanonicalizer.lisp", position = 1642) 
  public static final SubLObject precanonicalizationsP(SubLObject formula, SubLObject mt, SubLObject formula_is_an_asent_with_no_subformulasP) {
    if ((formula_is_an_asent_with_no_subformulasP == UNPROVIDED)) {
      formula_is_an_asent_with_no_subformulasP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == hlmt.hlmt_p(mt))) {
        return NIL;
      }
      {
        SubLObject resultP = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != el_utilities.el_formula_p(formula))) {
              if ((NIL != ((NIL != formula_is_an_asent_with_no_subformulasP) ? ((SubLObject) verbosifier.expandible_el_relation_expressionP(formula, UNPROVIDED)) : cycl_utilities.formula_find_if(Symbols.symbol_function($sym1$EXPANDIBLE_EL_RELATION_EXPRESSION_), formula, NIL, UNPROVIDED)))) {
                resultP = T;
              } else if (((NIL == formula_is_an_asent_with_no_subformulasP)
                   && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym2$EL_EVALUATABLE_EXPRESSION_), formula, NIL, UNPROVIDED)))) {
                resultP = T;
              } else if ((NIL != ((NIL != formula_is_an_asent_with_no_subformulasP) ? ((SubLObject) el_utilities.el_implicit_meta_literal_sentence_p(formula)) : cycl_utilities.formula_find_if(Symbols.symbol_function($sym3$EL_IMPLICIT_META_LITERAL_SENTENCE_P), formula, NIL, UNPROVIDED)))) {
                resultP = T;
              }
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return resultP;
      }
    }
  }

  /** A non-destructive version of @xref precanonicalizations. */
  @SubL(source = "cycl/precanonicalizer.lisp", position = 2833) 
  public static final SubLObject safe_precanonicalizations(SubLObject formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = formula;
        SubLObject result_mt = mt;
        if ((NIL != precanonicalizationsP(formula, mt, UNPROVIDED))) {
          {
            SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
            SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
            try {
              czer_vars.$el_symbol_suffix_table$.bind(((NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? ((SubLObject) czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) : Hashtables.make_hash_table($int4$32, Symbols.symbol_function(EQL), UNPROVIDED)), thread);
              czer_vars.$standardize_variables_memory$.bind(((NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? ((SubLObject) czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) : NIL), thread);
              {
                SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
                  try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    {
                      SubLObject original_memoization_process = NIL;
                      if (((NIL != local_state)
                           && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                        {
                          SubLObject current_proc = Threads.current_process();
                          if ((NIL == original_memoization_process)) {
                            memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                          } else {
                            if ((original_memoization_process != current_proc)) {
                              Errors.error($str5$Invalid_attempt_to_reuse_memoizat);
                            }
                          }
                        }
                      }
                      try {
                        thread.resetMultipleValues();
                        {
                          SubLObject result_2 = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7666");
                          SubLObject result_mt_3 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          result = result_2;
                          result_mt = result_mt_3;
                        }
                      } finally {
                        {
                          SubLObject _prev_bind_0_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                          try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            if (((NIL != local_state)
                                 && (NIL == original_memoization_process))) {
                              memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                            }
                          } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                          }
                        }
                      }
                    }
                  } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                  }
                }
              }
            } finally {
              czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
              czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Values.values(result, result_mt);
      }
    }
  }

  /** Performs some simplifications on FORMULA to prepare it for canonicalization.
   It recursively transforms EL relations, evaluates evaluatable expressions,
   and then it removes exceptions and pragmatic requirements.
   This is a destructive operation.
   Assumes the EL var namespace is bound. */
  @SubL(source = "cycl/precanonicalizer.lisp", position = 3400) 
  public static final SubLObject precanonicalizations(SubLObject formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject new_formula = formula;
        SubLObject new_mt = mt;
        if ((NIL != precanonicalizationsP(formula, mt, UNPROVIDED))) {
          {
            SubLObject local_state = czer_vars.$czer_memoization_state$.getDynamicValue(thread);
            {
              SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
              try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                {
                  SubLObject original_memoization_process = NIL;
                  if (((NIL != local_state)
                       && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                    original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                    {
                      SubLObject current_proc = Threads.current_process();
                      if ((NIL == original_memoization_process)) {
                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                      } else {
                        if ((original_memoization_process != current_proc)) {
                          Errors.error($str5$Invalid_attempt_to_reuse_memoizat);
                        }
                      }
                    }
                  }
                  try {
                    thread.resetMultipleValues();
                    {
                      SubLObject new_formula_5 = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7667");
                      SubLObject new_mt_6 = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      new_formula = new_formula_5;
                      new_mt = new_mt_6;
                    }
                  } finally {
                    {
                      SubLObject _prev_bind_0_7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                      try {
                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                        if (((NIL != local_state)
                             && (NIL == original_memoization_process))) {
                          memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                        }
                      } finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                      }
                    }
                  }
                }
              } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return Values.values(new_formula, new_mt);
      }
    }
  }

  @SubL(source = "cycl/precanonicalizer.lisp", position = 7065) 
  public static final SubLObject el_evaluatable_expressionP(SubLObject object, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != el_evaluatable_functorP(cycl_utilities.formula_arg0(object), mt))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30556"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7656"))));
  }

  public static final class $el_evaluatable_expressionP$UnaryFunction extends UnaryFunction {
    public $el_evaluatable_expressionP$UnaryFunction() { super(extractFunctionNamed("EL-EVALUATABLE-EXPRESSION?")); }
    public SubLObject processItem(SubLObject arg1) { return el_evaluatable_expressionP(arg1, UNPROVIDED); }
  }

  public static final class $el_evaluatable_expressionP$BinaryFunction extends BinaryFunction {
    public $el_evaluatable_expressionP$BinaryFunction() { super(extractFunctionNamed("EL-EVALUATABLE-EXPRESSION?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return el_evaluatable_expressionP(arg1, arg2); }
  }

  @SubL(source = "cycl/precanonicalizer.lisp", position = 7289) 
  public static final SubLObject el_evaluatable_functorP(SubLObject object, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(object))) {
      return makeBoolean(((NIL != el_evaluatable_functor_somewhereP(object))
             && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(object, $const13$evaluateAtEL, mt, UNPROVIDED, UNPROVIDED))));
    }
    return NIL;
  }

  @SubL(source = "cycl/precanonicalizer.lisp", position = 7506) 
  public static final SubLObject el_evaluatable_functor_somewhereP(SubLObject object) {
    return somewhere_cache.some_pred_assertion_somewhereP($const13$evaluateAtEL, object, ONE_INTEGER, UNPROVIDED);
  }

  public static final SubLObject declare_precanonicalizer_file() {
    //declareFunction(myName, "immediate_precanonicalizationsP", "IMMEDIATE-PRECANONICALIZATIONS?", 1, 0, false);
    //declareFunction(myName, "immediate_precanonicalizations", "IMMEDIATE-PRECANONICALIZATIONS", 1, 0, false);
    declareFunction(myName, "precanonicalizationsP", "PRECANONICALIZATIONS?", 2, 1, false);
    declareFunction(myName, "safe_precanonicalizations", "SAFE-PRECANONICALIZATIONS", 2, 0, false);
    declareFunction(myName, "precanonicalizations", "PRECANONICALIZATIONS", 2, 0, false);
    //declareFunction(myName, "precanonicalizations_int_internal", "PRECANONICALIZATIONS-INT-INTERNAL", 2, 0, false);
    //declareFunction(myName, "precanonicalizations_int", "PRECANONICALIZATIONS-INT", 2, 0, false);
    //declareFunction(myName, "el_evaluatable_expressions_out", "EL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
    //declareFunction(myName, "transform_evaluation_expression_or_throw", "TRANSFORM-EVALUATION-EXPRESSION-OR-THROW", 1, 0, false);
    //declareFunction(myName, "transform_evaluation_expression", "TRANSFORM-EVALUATION-EXPRESSION", 1, 0, false);
    declareFunction(myName, "el_evaluatable_expressionP", "EL-EVALUATABLE-EXPRESSION?", 1, 1, false); new $el_evaluatable_expressionP$UnaryFunction(); new $el_evaluatable_expressionP$BinaryFunction();
    declareFunction(myName, "el_evaluatable_functorP", "EL-EVALUATABLE-FUNCTOR?", 1, 1, false);
    declareFunction(myName, "el_evaluatable_functor_somewhereP", "EL-EVALUATABLE-FUNCTOR-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "el_evaluatable_subexpressionsP", "EL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false);
    //declareFunction(myName, "el_unevaluatable_expressionP", "EL-UNEVALUATABLE-EXPRESSION?", 1, 1, false);
    //declareFunction(myName, "immediately_evaluatable_expressions_out", "IMMEDIATELY-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
    //declareFunction(myName, "immediately_evaluatable_expressionP", "IMMEDIATELY-EVALUATABLE-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "immediately_evaluatable_functorP", "IMMEDIATELY-EVALUATABLE-FUNCTOR?", 1, 0, false);
    //declareFunction(myName, "immediately_evaluatable_functor_somewhereP", "IMMEDIATELY-EVALUATABLE-FUNCTOR-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "immediately_evaluatable_subexpressionsP", "IMMEDIATELY-EVALUATABLE-SUBEXPRESSIONS?", 1, 0, false);
    //declareFunction(myName, "immediately_unevaluatable_expressionP", "IMMEDIATELY-UNEVALUATABLE-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "implicit_meta_literals_out", "IMPLICIT-META-LITERALS-OUT", 1, 0, false);
    //declareFunction(myName, "implicit_meta_literals_out_int", "IMPLICIT-META-LITERALS-OUT-INT", 1, 0, false);
    //declareFunction(myName, "implicit_meta_literals_out_for_implict_meta_literal_sentence", "IMPLICIT-META-LITERALS-OUT-FOR-IMPLICT-META-LITERAL-SENTENCE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_precanonicalizer_file() {
    return NIL;
  }

  public static final SubLObject setup_precanonicalizer_file() {
    // CVS_ID("Id: precanonicalizer.lisp 126640 2008-12-04 13:39:36Z builder ");
    memoization_state.note_memoized_function($sym6$PRECANONICALIZATIONS_INT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$IMMEDIATELY_EVALUATABLE_EXPRESSION_ = makeSymbol("IMMEDIATELY-EVALUATABLE-EXPRESSION?");
  public static final SubLSymbol $sym1$EXPANDIBLE_EL_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");
  public static final SubLSymbol $sym2$EL_EVALUATABLE_EXPRESSION_ = makeSymbol("EL-EVALUATABLE-EXPRESSION?");
  public static final SubLSymbol $sym3$EL_IMPLICIT_META_LITERAL_SENTENCE_P = makeSymbol("EL-IMPLICIT-META-LITERAL-SENTENCE-P");
  public static final SubLInteger $int4$32 = makeInteger(32);
  public static final SubLString $str5$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym6$PRECANONICALIZATIONS_INT = makeSymbol("PRECANONICALIZATIONS-INT");
  public static final SubLSymbol $kw7$RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");
  public static final SubLSymbol $kw8$INVALID_EXPANSION = makeKeyword("INVALID-EXPANSION");
  public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw10$EL_UNEVALUATABLE_EXPRESSION = makeKeyword("EL-UNEVALUATABLE-EXPRESSION");
  public static final SubLSymbol $sym11$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");
  public static final SubLSymbol $sym12$TRANSFORM_EVALUATION_EXPRESSION_OR_THROW = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION-OR-THROW");
  public static final SubLObject $const13$evaluateAtEL = constant_handles.reader_make_constant_shell(makeString("evaluateAtEL"));
  public static final SubLSymbol $sym14$EL_UNEVALUATABLE_EXPRESSION_ = makeSymbol("EL-UNEVALUATABLE-EXPRESSION?");
  public static final SubLSymbol $sym15$TRANSFORM_EVALUATION_EXPRESSION = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");
  public static final SubLObject $const16$evaluateImmediately = constant_handles.reader_make_constant_shell(makeString("evaluateImmediately"));
  public static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const18$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym19$IMMEDIATELY_UNEVALUATABLE_EXPRESSION_ = makeSymbol("IMMEDIATELY-UNEVALUATABLE-EXPRESSION?");
  public static final SubLSymbol $sym20$IMPLICIT_META_LITERALS_OUT_INT = makeSymbol("IMPLICIT-META-LITERALS-OUT-INT");
  public static final SubLString $str21$_s_is_not_a_well_formed_sentence = makeString("~s is not a well-formed sentence");
  public static final SubLObject $const22$exceptWhen = constant_handles.reader_make_constant_shell(makeString("exceptWhen"));
  public static final SubLObject $const23$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLObject $const24$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLObject $const25$exceptFor = constant_handles.reader_make_constant_shell(makeString("exceptFor"));
  public static final SubLObject $const26$pragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("pragmaticRequirement"));
  public static final SubLObject $const27$querySentence = constant_handles.reader_make_constant_shell(makeString("querySentence"));
  public static final SubLObject $const28$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("meetsPragmaticRequirement"));
  public static final SubLString $str29$no_assertion_for_meta_arg___s = makeString("no assertion for meta-arg: ~s");

  //// Initializers

  public void declareFunctions() {
    declare_precanonicalizer_file();
  }

  public void initializeVariables() {
    init_precanonicalizer_file();
  }

  public void runTopLevelForms() {
    setup_precanonicalizer_file();
  }

}
