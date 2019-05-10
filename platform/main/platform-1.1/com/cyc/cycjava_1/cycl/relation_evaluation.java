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

package  com.cyc.cycjava_1.cycl;

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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.inference.ask_utilities;
import com.cyc.cycjava_1.cycl.backward_utilities;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.eval_in_api;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava_1.cycl.verbosifier;

public  final class relation_evaluation extends SubLTranslatedFile {

  //// Constructor

  private relation_evaluation() {}
  public static final SubLFile me = new relation_evaluation();
  public static final String myName = "com.cyc.cycjava_1.cycl.relation_evaluation";

  //// Definitions

  /** Admits more than evaluatable-function-p
   @see evaluatable-function-p */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 616) 
  public static final SubLObject evaluatable_functionP(SubLObject function) {
    return makeBoolean((((NIL != forts.fort_p(function))
             && (NIL != fort_types_interface.evaluatable_function_p(function)))
          || (NIL != function_to_arg_function_p(function))
          || (NIL != el_utilities.lambda_function_p(function))));
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 961) 
  public static final SubLObject evaluatable_predicateP(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != forts.fort_p(predicate))
           && (NIL != fort_types_interface.evaluatable_predicate_p(predicate, mt))));
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 1100) 
  public static final SubLObject evaluatable_relationP(SubLObject relation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const1$EverythingPSC, thread);
            result = makeBoolean(((NIL != evaluatable_functionP(relation))
                  || (NIL != evaluatable_predicateP(relation, UNPROVIDED))));
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 1295) 
  public static final SubLObject evaluatable_expressionP(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30349"))
           && (NIL != evaluatable_relationP(cycl_utilities.formula_operator(object)))));
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 1469) 
  public static final SubLObject evaluation_defn(SubLObject fort, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(fort, $const2$evaluationDefn, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 1604) 
  private static SubLSymbol $cyc_evaluate_gather_justificationsP$ = null;

  @SubL(source = "cycl/relation-evaluation.lisp", position = 1743) 
  private static SubLSymbol $cyc_evaluate_supports$ = null;

  @SubL(source = "cycl/relation-evaluation.lisp", position = 1794) 
  public static final SubLObject cyc_evaluate_gathering_justificationsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $cyc_evaluate_gather_justificationsP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 4151) 
  public static final SubLObject note_evaluation_function_support(SubLObject relation, SubLObject evaluation_function) {
    if ((NIL != cyc_evaluate_gathering_justificationsP())) {
      {
        SubLObject gafs = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30022");
        SubLObject support = gafs.first();
        if ((NIL != support)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30333");
          return T;
        }
      }
    }
    return NIL;
  }

  /** This is bound to the current relation being evaluated. */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 4477) 
  public static SubLSymbol $cyc_evaluate_relation$ = null;

  /** Bound to T when a contextualized relation is evaluated. */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 4630) 
  private static SubLSymbol $cyc_evaluate_some_contextualized_relationP$ = null;

  /** Unless we've already found one, check if RELATION is contextualized, and note if it is. */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 4768) 
  public static final SubLObject possibly_note_contextualized_evaluatable_relation(SubLObject relation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread))) {
        $cyc_evaluate_some_contextualized_relationP$.setDynamicValue(fort_types_interface.evaluatable_relation_contextualized_p(relation), thread);
      }
      return $cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread);
    }
  }

  /** Evaluate the evaluatable EXPRESSION and return the result.
A second returned value is T iff the result was valid.
A third returned value is T iff the evaluation included evaluation of a contextualized relation. */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 5164) 
  public static final SubLObject cyc_evaluate(SubLObject expression) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        SubLObject unevaluatable = NIL;
        SubLObject contextualizedP = NIL;
        {
          SubLObject _prev_bind_0 = $cyc_evaluate_some_contextualized_relationP$.currentBinding(thread);
          try {
            $cyc_evaluate_some_contextualized_relationP$.bind(NIL, thread);
            try {
              answer = cyc_evaluate_internal(expression, T);
              contextualizedP = list_utilities.sublisp_boolean($cyc_evaluate_some_contextualized_relationP$.getDynamicValue(thread));
            } catch (Throwable ccatch_env_var) {
              unevaluatable = Errors.handleThrowable(ccatch_env_var, $kw7$UNEVALUATABLE);
            }
          } finally {
            $cyc_evaluate_some_contextualized_relationP$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != unevaluatable)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30334");
        } else {
          return valid_evaluation(answer, contextualizedP);
        }
      }
    }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 6942) 
  public static final SubLObject valid_evaluation(SubLObject answer, SubLObject contextualizedP) {
    return Values.values(answer, T, contextualizedP);
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 7127) 
  public static final SubLObject cyc_evaluate_internal(SubLObject formula, SubLObject consider_expansionP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject relation = cycl_utilities.formula_operator(formula);
        if ((NIL == evaluatable_relationP(relation))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30342");
        }
        {
          SubLObject evaluation_function = evaluation_function(relation);
          if ((!(((NIL != eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function))
                || ((NIL != consider_expansionP)
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8857"))))))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30343");
          }
          {
            SubLObject input_args = cycl_utilities.formula_args(formula, UNPROVIDED);
            SubLObject args = cyc_evaluate_args(input_args);
            SubLObject answer = NIL;
            possibly_note_contextualized_evaluatable_relation(relation);
            if ((NIL != eval_in_api.possibly_cyc_api_function_spec_p(evaluation_function))) {
              {
                SubLObject _prev_bind_0 = $cyc_evaluate_relation$.currentBinding(thread);
                try {
                  $cyc_evaluate_relation$.bind(relation, thread);
                  {
                    SubLObject v_arity = evaluation_arity(relation);
                    if ((NIL == v_arity)) {
                      answer = eval_in_api.possibly_cyc_api_funcall_1(evaluation_function, args);
                    } else {
                      if ((!(v_arity.numE(Sequences.length(args))))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30344");
                      }
                      answer = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10864");
                    }
                  }
                } finally {
                  $cyc_evaluate_relation$.rebind(_prev_bind_0, thread);
                }
              }
              if (input_args.equal(args)) {
                note_evaluation_function_support(relation, evaluation_function);
              } else {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30337");
              }
              return answer;
            } else {
              {
                SubLObject expanded_formula = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4358");
                if ((($kw9$RECURSION_LIMIT_EXCEEDED == expanded_formula)
                    || expanded_formula.equal(formula))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30345");
                }
                {
                  SubLObject answer_1 = NIL;
                  answer_1 = cyc_evaluate_if_evaluatable(expanded_formula, NIL);
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30336");
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30338");
                  return answer_1;
                }
              }
            }
          }
        }
      }
    }
  }

  /** recursively evaluate any evaluatable ARGS */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 9178) 
  public static final SubLObject cyc_evaluate_args(SubLObject args) {
    return Mapping.mapcar(Symbols.symbol_function($sym10$CYC_EVALUATE_ARG), args);
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 9308) 
  public static final SubLObject cyc_evaluate_arg(SubLObject input_arg) {
    return cyc_evaluate_if_evaluatable(input_arg, T);
  }

  public static final class $cyc_evaluate_arg$UnaryFunction extends UnaryFunction {
    public $cyc_evaluate_arg$UnaryFunction() { super(extractFunctionNamed("CYC-EVALUATE-ARG")); }
    public SubLObject processItem(SubLObject arg1) { return cyc_evaluate_arg(arg1); }
  }

  /** Recursively evaluate EXPRESSION if needed. */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 9405) 
  public static final SubLObject cyc_evaluate_if_evaluatable(SubLObject expression, SubLObject consider_expansionP) {
    if ((consider_expansionP == UNPROVIDED)) {
      consider_expansionP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == evaluatable_expressionP(expression))) {
        return expression;
      }
      {
        SubLObject evaluated_expression = NIL;
        {
          SubLObject _prev_bind_0 = $cyc_evaluate_gather_justificationsP$.currentBinding(thread);
          try {
            $cyc_evaluate_gather_justificationsP$.bind(NIL, thread);
            evaluated_expression = cyc_evaluate_internal(expression, consider_expansionP);
          } finally {
            $cyc_evaluate_gather_justificationsP$.rebind(_prev_bind_0, thread);
          }
        }
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30335");
        return evaluated_expression;
      }
    }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 9894) 
  public static final SubLObject evaluation_function(SubLObject relation) {
    if ((NIL != forts.fort_p(relation))) {
      return cached_evaluation_function(relation);
    } else if ((NIL != function_to_arg_function_p(relation))) {
      return $sym11$CYC_FUNCTION_TO_ARG;
    } else if ((NIL != el_utilities.lambda_function_p(relation))) {
      return $sym12$CYC_LAMBDA;
    } else {
      return NIL;
    }
  }

  /** Return the expected evaluation arity for RELATION. */
  @SubL(source = "cycl/relation-evaluation.lisp", position = 10175) 
  public static final SubLObject evaluation_arity(SubLObject relation) {
    if ((NIL != forts.fort_p(relation))) {
      return arity.arity(relation);
    } else if ((NIL != function_to_arg_function_p(relation))) {
      {
        SubLObject predicate = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29793");
        if ((NIL != forts.fort_p(predicate))) {
          {
            SubLObject predicate_arity = arity.arity(predicate);
            if ((predicate_arity.isInteger()
                 && predicate_arity.numG(ZERO_INTEGER))) {
              return Numbers.subtract(predicate_arity, ONE_INTEGER);
            }
          }
        } else if ((NIL != el_utilities.kappa_predicate_p(predicate))) {
          {
            SubLObject predicate_arity = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30573");
            if ((predicate_arity.isInteger()
                 && predicate_arity.numG(ZERO_INTEGER))) {
              return Numbers.subtract(predicate_arity, ONE_INTEGER);
            }
          }
        } else {
          return NIL;
        }
      }
    } else if ((NIL != el_utilities.lambda_function_p(relation))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30575");
    } else {
      return NIL;
    }
    return NIL;
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 10951) 
  private static SubLSymbol $cached_evaluation_function_caching_state$ = null;

  @SubL(source = "cycl/relation-evaluation.lisp", position = 10951) 
  public static final SubLObject clear_cached_evaluation_function() {
    {
      SubLObject cs = $cached_evaluation_function_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_cached_evaluation_function$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_evaluation_function$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-EVALUATION-FUNCTION")); }
    public SubLObject processItem() { return clear_cached_evaluation_function(); }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 10951) 
  public static final SubLObject cached_evaluation_function_internal(SubLObject relation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const1$EverythingPSC, thread);
            result = evaluation_defn(relation, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 10951) 
  public static final SubLObject cached_evaluation_function(SubLObject relation) {
    {
      SubLObject caching_state = $cached_evaluation_function_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym13$CACHED_EVALUATION_FUNCTION, $sym14$_CACHED_EVALUATION_FUNCTION_CACHING_STATE_, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym15$CLEAR_CACHED_EVALUATION_FUNCTION);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, $kw16$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw16$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(cached_evaluation_function_internal(relation)));
          memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/relation-evaluation.lisp", position = 11294) 
  public static final SubLObject function_to_arg_function_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_with_operator_p(object, $const17$FunctionToArg))
           && (NIL != el_utilities.formula_arityE(object, TWO_INTEGER, UNPROVIDED))
           && cycl_utilities.nat_arg1(object, UNPROVIDED).isInteger()
           && ((NIL != forts.fort_p(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29794")))
            || (NIL != el_utilities.kappa_predicate_p(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29795"))))));
  }

  public static final SubLObject declare_relation_evaluation_file() {
    declareFunction(myName, "evaluatable_functionP", "EVALUATABLE-FUNCTION?", 1, 0, false);
    declareFunction(myName, "evaluatable_predicateP", "EVALUATABLE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "evaluatable_relationP", "EVALUATABLE-RELATION?", 1, 0, false);
    declareFunction(myName, "evaluatable_expressionP", "EVALUATABLE-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "evaluation_defn", "EVALUATION-DEFN", 1, 1, false);
    declareFunction(myName, "cyc_evaluate_gathering_justificationsP", "CYC-EVALUATE-GATHERING-JUSTIFICATIONS?", 0, 0, false);
    declareFunction(myName, "cyc_evaluate_note_support", "CYC-EVALUATE-NOTE-SUPPORT", 1, 0, false);
    declareFunction(myName, "cyc_evaluate_justify", "CYC-EVALUATE-JUSTIFY", 1, 0, false);
    declareFunction(myName, "note_cyc_evaluate_argument_support", "NOTE-CYC-EVALUATE-ARGUMENT-SUPPORT", 2, 0, false);
    declareFunction(myName, "note_cyc_evaluate_final_support", "NOTE-CYC-EVALUATE-FINAL-SUPPORT", 3, 0, false);
    declareFunction(myName, "note_cyc_evaluate_expansion_support", "NOTE-CYC-EVALUATE-EXPANSION-SUPPORT", 2, 0, false);
    declareFunction(myName, "note_expansion_support", "NOTE-EXPANSION-SUPPORT", 3, 0, false);
    declareFunction(myName, "note_evaluation_function_support", "NOTE-EVALUATION-FUNCTION-SUPPORT", 2, 0, false);
    declareFunction(myName, "possibly_note_contextualized_evaluatable_relation", "POSSIBLY-NOTE-CONTEXTUALIZED-EVALUATABLE-RELATION", 1, 0, false);
    declareFunction(myName, "cyc_evaluate", "CYC-EVALUATE", 1, 0, false);
    declareFunction(myName, "cyc_evaluate_all_unary", "CYC-EVALUATE-ALL-UNARY", 2, 1, false);
    declareFunction(myName, "cyc_evaluate_sort", "CYC-EVALUATE-SORT", 2, 2, false);
    declareFunction(myName, "throw_unevaluatable", "THROW-UNEVALUATABLE", 0, 0, false);
    declareFunction(myName, "valid_evaluation", "VALID-EVALUATION", 2, 0, false);
    declareFunction(myName, "invalid_evaluation", "INVALID-EVALUATION", 0, 0, false);
    declareFunction(myName, "cyc_evaluate_internal", "CYC-EVALUATE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cyc_evaluate_args", "CYC-EVALUATE-ARGS", 1, 0, false);
    declareFunction(myName, "cyc_evaluate_arg", "CYC-EVALUATE-ARG", 1, 0, false); new $cyc_evaluate_arg$UnaryFunction();
    declareFunction(myName, "cyc_evaluate_if_evaluatable", "CYC-EVALUATE-IF-EVALUATABLE", 1, 1, false);
    declareFunction(myName, "evaluation_function", "EVALUATION-FUNCTION", 1, 0, false);
    declareFunction(myName, "evaluation_arity", "EVALUATION-ARITY", 1, 0, false);
    declareFunction(myName, "clear_cached_evaluation_function", "CLEAR-CACHED-EVALUATION-FUNCTION", 0, 0, false); new $clear_cached_evaluation_function$ZeroArityFunction();
    declareFunction(myName, "remove_cached_evaluation_function", "REMOVE-CACHED-EVALUATION-FUNCTION", 1, 0, false);
    declareFunction(myName, "cached_evaluation_function_internal", "CACHED-EVALUATION-FUNCTION-INTERNAL", 1, 0, false);
    declareFunction(myName, "cached_evaluation_function", "CACHED-EVALUATION-FUNCTION", 1, 0, false);
    declareFunction(myName, "function_to_arg_function_p", "FUNCTION-TO-ARG-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "cyc_function_to_arg", "CYC-FUNCTION-TO-ARG", 0, 6, false);
    declareFunction(myName, "cyc_function_to_arg_query", "CYC-FUNCTION-TO-ARG-QUERY", 2, 0, false);
    declareFunction(myName, "cyc_lambda", "CYC-LAMBDA", 0, 6, false);
    return NIL;
  }

  public static final SubLObject init_relation_evaluation_file() {
    $cyc_evaluate_gather_justificationsP$ = defparameter("*CYC-EVALUATE-GATHER-JUSTIFICATIONS?*", NIL);
    $cyc_evaluate_supports$ = defparameter("*CYC-EVALUATE-SUPPORTS*", NIL);
    $cyc_evaluate_relation$ = defparameter("*CYC-EVALUATE-RELATION*", NIL);
    $cyc_evaluate_some_contextualized_relationP$ = defparameter("*CYC-EVALUATE-SOME-CONTEXTUALIZED-RELATION?*", $kw6$UNBOUND);
    $cached_evaluation_function_caching_state$ = deflexical("*CACHED-EVALUATION-FUNCTION-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_relation_evaluation_file() {
    // CVS_ID("Id: relation-evaluation.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_external_symbol($sym8$THROW_UNEVALUATABLE);
    memoization_state.note_globally_cached_function($sym13$CACHED_EVALUATION_FUNCTION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const1$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const2$evaluationDefn = constant_handles.reader_make_constant_shell(makeString("evaluationDefn"));
  public static final SubLSymbol $sym3$SUPPORT_P = makeSymbol("SUPPORT-P");
  public static final SubLSymbol $sym4$SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");
  public static final SubLSymbol $kw5$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw6$UNBOUND = makeKeyword("UNBOUND");
  public static final SubLSymbol $kw7$UNEVALUATABLE = makeKeyword("UNEVALUATABLE");
  public static final SubLSymbol $sym8$THROW_UNEVALUATABLE = makeSymbol("THROW-UNEVALUATABLE");
  public static final SubLSymbol $kw9$RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");
  public static final SubLSymbol $sym10$CYC_EVALUATE_ARG = makeSymbol("CYC-EVALUATE-ARG");
  public static final SubLSymbol $sym11$CYC_FUNCTION_TO_ARG = makeSymbol("CYC-FUNCTION-TO-ARG");
  public static final SubLSymbol $sym12$CYC_LAMBDA = makeSymbol("CYC-LAMBDA");
  public static final SubLSymbol $sym13$CACHED_EVALUATION_FUNCTION = makeSymbol("CACHED-EVALUATION-FUNCTION");
  public static final SubLSymbol $sym14$_CACHED_EVALUATION_FUNCTION_CACHING_STATE_ = makeSymbol("*CACHED-EVALUATION-FUNCTION-CACHING-STATE*");
  public static final SubLSymbol $sym15$CLEAR_CACHED_EVALUATION_FUNCTION = makeSymbol("CLEAR-CACHED-EVALUATION-FUNCTION");
  public static final SubLSymbol $kw16$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const17$FunctionToArg = constant_handles.reader_make_constant_shell(makeString("FunctionToArg"));
  public static final SubLSymbol $sym18$_VALUE = makeSymbol("?VALUE");
  public static final SubLSymbol $sym19$MAKE_VARIABLE_BINDING = makeSymbol("MAKE-VARIABLE-BINDING");
  public static final SubLSymbol $kw20$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw21$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw22$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw23$HL = makeKeyword("HL");

  //// Initializers

  public void declareFunctions() {
    declare_relation_evaluation_file();
  }

  public void initializeVariables() {
    init_relation_evaluation_file();
  }

  public void runTopLevelForms() {
    setup_relation_evaluation_file();
  }

}
