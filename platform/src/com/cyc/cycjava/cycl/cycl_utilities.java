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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;

public  final class cycl_utilities extends SubLTranslatedFile {

  //// Constructor

  private cycl_utilities() {}
  public static final SubLFile me = new cycl_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.cycl_utilities";

  //// Definitions

  /** The function to use to determine argument opacity */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 1552) 
  public static SubLSymbol $opaque_arg_function$ = null;

  /** The function to use to determine sequence variable opacity */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 1730) 
  public static SubLSymbol $opaque_seqvar_function$ = null;

  /** @return boolean; t iff FORMULA is opaque in the argument position ARGNUM,
   meaning that it should not be recursed into in that arg position.
   By convention, if ARGNUM is greater than the arity of FORMULA,
   this denotes the sequence variable in FORMULA. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 2441) 
  public static final SubLObject opaque_argP(SubLObject formula, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return opaque_argP_int(formula, argnum, $opaque_arg_function$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 2813) 
  public static final SubLObject opaque_argP_int(SubLObject formula, SubLObject argnum, SubLObject opaque_arg_function) {
    {
      SubLObject result = NIL;
      SubLObject pcase_var = opaque_arg_function;
      if (pcase_var.eql($sym0$DEFAULT_OPAQUE_ARG_)) {
        result = default_opaque_argP(formula, argnum);
      } else if (pcase_var.eql($sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_)) {
        result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29825");
      } else {
        result = Functions.funcall(opaque_arg_function, formula, argnum);
      }
      return result;
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 3265) 
  public static final SubLObject default_opaque_argP(SubLObject formula, SubLObject argnum) {
    if ((NIL != el_utilities.formula_arityL(formula, argnum, UNPROVIDED))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29826");
    }
    return el_utilities.subl_escape_p(formula);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 3438) 
  public static final SubLObject opaque_arg_wrt_free_varsP(SubLObject formula, SubLObject argnum) {
    if ((TWO_INTEGER.eql(argnum)
         && (NIL != el_utilities.el_formula_with_operator_p(formula, $const7$SkolemFunctionFn)))) {
      return T;
    } else if ((NIL != el_utilities.formula_arityL(formula, argnum, UNPROVIDED))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29827");
    } else {
      return el_utilities.subl_quote_p(formula);
    }
  }

  /** @return boolean; t iff arg number ARGNUM of FORMULA is quoted or otherwise opaque. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 4105) 
  public static final SubLObject opaque_arg_wrt_quotingP(SubLObject formula, SubLObject argnum) {
    return makeBoolean(((NIL != default_opaque_argP(formula, argnum))
          || ((NIL == el_utilities.tou_litP(formula))
             && ((NIL != cycl_grammar.fast_quote_term_p(formula_arg(formula, argnum, UNPROVIDED)))
              || (NIL != kb_accessors.quoted_argumentP(formula_arg0(formula), argnum))))));
  }

  public static final class $opaque_arg_wrt_quotingP$BinaryFunction extends BinaryFunction {
    public $opaque_arg_wrt_quotingP$BinaryFunction() { super(extractFunctionNamed("OPAQUE-ARG-WRT-QUOTING?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return opaque_arg_wrt_quotingP(arg1, arg2); }
  }

  /** Like @xref opaque-arg-wrt-quoting? but gives a free pass to logical operators, quantifiers, and trueSentence.
   This is used for identifying skolem defn assertions, to eliminate quoted references but include logical formulas embedded within trueSentence. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 4456) 
  public static final SubLObject opaque_arg_wrt_quoting_not_counting_logical_opsP(SubLObject formula, SubLObject argnum) {
    if (((NIL != el_utilities.el_formula_with_operator_p(formula, $const8$trueSentence))
        || (NIL != el_utilities.cyc_const_logical_operator_p(formula_operator(formula)))
        || (NIL != el_utilities.cyc_const_quantifier_p(formula_operator(formula))))) {
      return NIL;
    } else {
      return opaque_arg_wrt_quotingP(formula, argnum);
    }
  }

  /** @return boolean; t iff OBJECT is an HL term with an EL counterpart. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 5593) 
  public static final SubLObject hl_term_with_el_counterpart_p(SubLObject object) {
    return makeBoolean(((NIL != nart_handles.valid_nart_handleP(object))
          || (NIL != assertion_handles.valid_assertion_handleP(object))
          || (NIL != variables.variable_p(object))));
  }

  public static final class $hl_term_with_el_counterpart_p$UnaryFunction extends UnaryFunction {
    public $hl_term_with_el_counterpart_p$UnaryFunction() { super(extractFunctionNamed("HL-TERM-WITH-EL-COUNTERPART-P")); }
    public SubLObject processItem(SubLObject arg1) { return hl_term_with_el_counterpart_p(arg1); }
  }

  public static final class $hl_term_to_el_term$UnaryFunction extends UnaryFunction {
    public $hl_term_to_el_term$UnaryFunction() { super(extractFunctionNamed("HL-TERM-TO-EL-TERM")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29772"); }
  }

  /** converts HL-TERM to an EL term if HL-TERM has an EL counterpart, otherwise leaves HL-TERM unchanged.
   Not robust against invalid narts or assertions.
   @note Careful: the result is not destructible! */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 6344) 
  public static final SubLObject careful_hl_term_to_el_term(SubLObject hl_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != nart_handles.nart_p(hl_term))) {
        return Functions.funcall(czer_vars.$nart_key$.getDynamicValue(thread), hl_term);
      } else if ((NIL != assertion_handles.assertion_p(hl_term))) {
        return Functions.funcall(czer_vars.$assertion_key$.getDynamicValue(thread), hl_term);
      } else if ((NIL != variables.variable_p(hl_term))) {
        return variables.default_el_var_for_hl_var(hl_term);
      } else {
        return hl_term;
      }
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 8757) 
  public static final SubLObject reified_term_p(SubLObject object) {
    return makeBoolean(((NIL != atomic_reified_term_p(object))
          || (NIL != reified_formula_p(object))));
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 8934) 
  public static final SubLObject atomic_reified_term_p(SubLObject object) {
    return constant_handles.constant_p(object);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 9010) 
  public static final SubLObject reified_formula_p(SubLObject object) {
    return collection_defns.hl_formula_p(object);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 9084) 
  public static final SubLObject expression_gather_int_2(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject key, SubLObject subs_tooP) {
    {
      SubLObject result = ((NIL != Functions.funcall(pred, Functions.funcall(key, expression))) ? ((SubLObject) list(expression)) : NIL);
      if (((NIL != subs_tooP)
          || (NIL == result))) {
        if (((NIL != penetrate_hl_structuresP)
             && (NIL != hl_term_with_el_counterpart_p(expression)))) {
          result = ConsesLow.nconc(expression_gather_int_2(careful_hl_term_to_el_term(expression), pred, T, key, subs_tooP), result);
        } else if ((NIL == el_utilities.el_formula_p(expression))) {
        } else {
          {
            SubLObject terms = formula_terms(expression, $kw12$REGULARIZE);
            SubLObject list_var = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
              if ((NIL == opaque_argP(expression, argnum))) {
                result = ConsesLow.nconc(expression_gather_int_2(v_term, pred, penetrate_hl_structuresP, key, subs_tooP), result);
              }
            }
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 9959) 
  public static final SubLObject expression_gather_int(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
    return list_utilities.fast_delete_duplicates(expression_gather_int_2(expression, pred, penetrate_hl_structuresP, key, subs_tooP), test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** @return list; a list of all objects within EXPRESSION which pass the test PRED, without duplicates but in no particular order.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
   Returns the singleton list containing EXPRESSION if EXPRESSION passes PRED.
   @see tree-gather */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 10437) 
  public static final SubLObject expression_gather(SubLObject expression, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((subs_tooP == UNPROVIDED)) {
      subs_tooP = T;
    }
    return expression_gather_int(expression, pred, penetrate_hl_structuresP, test, key, subs_tooP);
  }

  /** @return list; a list of all objects within ASSERTION which pass the test PRED, without duplicates but in no particular order.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 10987) 
  public static final SubLObject assertion_gather(SubLObject pred, SubLObject assertion, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((subs_tooP == UNPROVIDED)) {
      subs_tooP = T;
    }
    checkType(assertion, $sym13$ASSERTION_P);
    if ((NIL != hl_term_with_el_counterpart_p(assertion))) {
      {
        SubLObject mt_objects = expression_gather_int(assertions_high.assertion_mt(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
        SubLObject formula_objects = expression_gather_int(assertions_high.assertion_cons(assertion), pred, penetrate_hl_structuresP, test, key, subs_tooP);
        if ((NIL == mt_objects)) {
          return formula_objects;
        } else if ((NIL == formula_objects)) {
          return mt_objects;
        } else {
          return list_utilities.fast_delete_duplicates(ConsesLow.nconc(mt_objects, formula_objects), test, key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 11888) 
  private static SubLSymbol $expression_count_item$ = null;

  @SubL(source = "cycl/cycl-utilities.lisp", position = 11944) 
  private static SubLSymbol $expression_count_test$ = null;

  /** @return list; a list of all objects within the EL formula FORMULA which pass the test PRED, without duplicates but in no particular order.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
   @see tree-gather */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 13344) 
  public static final SubLObject formula_gather(SubLObject formula, SubLObject pred, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key, SubLObject subs_tooP) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((subs_tooP == UNPROVIDED)) {
      subs_tooP = T;
    }
    checkType(formula, $sym15$EL_FORMULA_P);
    return expression_gather(formula, pred, penetrate_hl_structuresP, test, key, subs_tooP);
  }

  /** @return list; a list of the narts mentioned in EXPRESSION, without duplicates but in no particular order.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
   Returns the singleton list containing EXPRESSION if EXPRESSION is a nart. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 16774) 
  public static final SubLObject expression_narts(SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject subs_tooP) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((subs_tooP == UNPROVIDED)) {
      subs_tooP = T;
    }
    return expression_gather_int(expression, Symbols.symbol_function($sym18$NART_P), penetrate_hl_structuresP, Symbols.symbol_function(EQ), Symbols.symbol_function(IDENTITY), subs_tooP);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 25316) 
  private static SubLSymbol $containing_subexpressions_lambda_term$ = null;

  @SubL(source = "cycl/cycl-utilities.lisp", position = 26101) 
  public static final SubLObject expression_find_if_int(SubLObject test, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
    {
      SubLObject transformed_expression = ((Symbols.symbol_function(IDENTITY) == key) ? ((SubLObject) expression) : Functions.funcall(key, expression));
      SubLObject test_succeededP = Functions.funcall(test, transformed_expression);
      if ((NIL != test_succeededP)) {
        return expression;
      } else if (((NIL != penetrate_hl_structuresP)
           && (NIL != hl_term_with_el_counterpart_p(expression)))) {
        return expression_find_if_int(test, careful_hl_term_to_el_term(expression), T, key);
      } else if ((NIL == el_utilities.el_formula_p(expression))) {
        return NIL;
      } else {
        {
          SubLObject result = NIL;
          SubLObject terms = formula_terms(expression, $kw12$REGULARIZE);
          SubLObject list_var = NIL;
          SubLObject v_term = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; (!(((NIL != result)
                || (NIL == list_var)))); list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL == opaque_argP(expression, argnum))) {
              result = expression_find_if_int(test, v_term, penetrate_hl_structuresP, key);
            }
          }
          return result;
        }
      }
    }
  }

  /** @return object; an object which passes the test TEST if such an object exists within the CycL expression EXPRESSION.  Otherwise NIL.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
   @see tree-find-if */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 27035) 
  public static final SubLObject expression_find_if(SubLObject test, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject key) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if (((NIL == penetrate_hl_structuresP)
         && (NIL == list_utilities.tree_find_if(test, expression, key)))) {
      return NIL;
    } else {
      return expression_find_if_int(test, expression, penetrate_hl_structuresP, key);
    }
  }

  /** @return object; an object which passes the test TEST if such an object exists within the EL formula FORMULA.  Otherwise NIL.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
   @see expression-find-if */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 27605) 
  public static final SubLObject formula_find_if(SubLObject test, SubLObject formula, SubLObject penetrate_hl_structuresP, SubLObject key) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(formula, $sym15$EL_FORMULA_P);
    return expression_find_if(test, formula, penetrate_hl_structuresP, key);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 29204) 
  public static final SubLObject expression_find_int(SubLObject object, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
    if ((NIL != Functions.funcall(test, object, Functions.funcall(key, expression)))) {
      return expression;
    } else if (((NIL != penetrate_hl_structuresP)
         && (NIL != hl_term_with_el_counterpart_p(expression)))) {
      return expression_find_int(object, careful_hl_term_to_el_term(expression), T, test, key);
    } else if ((NIL == el_utilities.el_formula_p(expression))) {
      return NIL;
    } else {
      {
        SubLObject result = NIL;
        SubLObject terms = formula_terms(expression, $kw12$REGULARIZE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; (!(((NIL != result)
              || (NIL == list_var)))); list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
          if ((NIL == opaque_argP(expression, argnum))) {
            result = expression_find_int(object, v_term, penetrate_hl_structuresP, test, key);
          }
        }
        return result;
      }
    }
  }

  /** @return object; OBJECT if it is found within the CycL expression EXPRESSION, otherwise NIL.
   See file-level documentation for explanation of PENETRATE-HL-STRUCTURES? and #$ExpandSubLFn.
   @see tree-find */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 29981) 
  public static final SubLObject expression_find(SubLObject object, SubLObject expression, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
    if ((penetrate_hl_structuresP == UNPROVIDED)) {
      penetrate_hl_structuresP = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return expression_find_int(object, expression, penetrate_hl_structuresP, test, key);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 35547) 
  private static SubLSymbol $default_transformation_limit$ = null;

  /** opacity can change during transformation - it's unclear what the desired behaviour is, though.
   PRED has a different meaning based on test-pred-on-transformation-result? and negate-pred? */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 35670) 
  public static final SubLObject expression_ntransform_int(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit, SubLObject transformation_level, SubLObject test_pred_on_transformation_resultP, SubLObject negate_predP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (transformation_level.numG(transformation_limit)) {
        Dynamic.sublisp_throw($kw26$TRANSFORMATION_LIMIT_EXCEEDED, transformation_limit);
      }
      {
        SubLObject transformed_expression = NIL;
        if ((NIL != test_pred_on_transformation_resultP)) {
          {
            SubLObject transform_result = Functions.funcall(transform, expression);
            if ((makeBoolean((NIL == negate_predP)) != makeBoolean((NIL == Functions.funcall(pred, transform_result))))) {
              transformed_expression = expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
            } else {
              transformed_expression = expression;
            }
          }
        } else {
          if ((makeBoolean((NIL == negate_predP)) != makeBoolean((NIL == Functions.funcall(pred, expression))))) {
            {
              SubLObject transform_result = Functions.funcall(transform, expression);
              if ((expression != transform_result)) {
                transformed_expression = expression_ntransform_int(transform_result, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP);
              } else {
                transformed_expression = expression;
              }
            }
          } else {
            transformed_expression = expression;
          }
        }
        if ((NIL == el_utilities.el_formula_p(transformed_expression))) {
          return transformed_expression;
        }
        {
          SubLObject seqvar = el_utilities.sequence_var(transformed_expression, UNPROVIDED);
          SubLObject transformed_seqvar = (((NIL != seqvar)
               && (NIL != transform_sequence_variablesP)
               && (NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29828"))) ? ((SubLObject) expression_ntransform_int(seqvar, pred, transform, T, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP)) : seqvar);
          SubLObject ist_sentenceP = el_utilities.ist_sentence_p(transformed_expression);
          SubLObject new_mt = NIL;
          SubLObject rest_of_expression = NIL;
          SubLObject v_term = NIL;
          SubLObject argnum = NIL;
          for (rest_of_expression = transformed_expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add(ONE_INTEGER, argnum)) {
            {
              SubLObject mt_var = new_mt;
              {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                  if ((NIL == opaque_argP(transformed_expression, argnum))) {
                    ConsesLow.rplaca(rest_of_expression, expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
                    if (((NIL != ist_sentenceP)
                         && argnum.numE(ONE_INTEGER))) {
                      new_mt = rest_of_expression.first();
                    }
                  }
                } finally {
                  mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
          if ((NIL == opaque_argP(transformed_expression, argnum))) {
            ConsesLow.rplaca(rest_of_expression, expression_ntransform_int(v_term, pred, transform, transform_sequence_variablesP, transformation_limit, number_utilities.f_1X(transformation_level), test_pred_on_transformation_resultP, negate_predP));
          }
          ConsesLow.rplacd(rest_of_expression, transformed_seqvar);
          return transformed_expression;
        }
      }
    }
  }

  /** Recursively tests PRED within the CycL expression EXPRESSION.  If PRED applies to EXPRESSION
   or a subexpression/subterm of EXPRESSION, TRANSFORM is called on that term or expression.
   If an expression is transformed into another expression, the result is itself subjected
   to the transformation if PRED applies to the result.  Thus one must take care when
   calling this function, to avoid infinite recursion.  It does not penetrate into HL structures.
   @throws :transformation-limit-exceeded */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 39219) 
  public static final SubLObject expression_transform(SubLObject expression, SubLObject pred, SubLObject transform, SubLObject transform_sequence_variablesP, SubLObject transformation_limit) {
    if ((transform_sequence_variablesP == UNPROVIDED)) {
      transform_sequence_variablesP = NIL;
    }
    if ((transformation_limit == UNPROVIDED)) {
      transformation_limit = $default_transformation_limit$.getGlobalValue();
    }
    return expression_ntransform_int(el_utilities.copy_expression(expression), pred, transform, transform_sequence_variablesP, transformation_limit, ZERO_INTEGER, NIL, NIL);
  }

  /** Replaces free vars in the EXPRESSION.  Takes quoting into account.  *canonicalize-variables?* determines whether #$EscapeQuotes will be removed / reduced from the quoted terms.  If variables are to be canonicalized then the #$EscapeQuotes will already contain HL variables due to the various czer steps before.  This step just removes the #$EscapeQuotes to complete the canonicalization of the variables */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 53148) 
  public static final SubLObject expression_nsublis_free_vars_int(SubLObject alist, SubLObject expression, SubLObject test) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject oldXnew = conses_high.assoc(expression, alist, test, UNPROVIDED);
        if ((NIL != oldXnew)) {
          if ((NIL != czer_vars.$inside_quote$.getDynamicValue(thread))) {
            return expression;
          } else {
            return oldXnew.rest();
          }
        }
      }
      if ((NIL == el_utilities.el_formula_p(expression))) {
        return expression;
      } else if (((NIL != cycl_grammar.fast_escape_quote_term_p(expression))
          || (NIL != cycl_grammar.fast_quasi_quote_term_p(expression)))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
              czer_vars.$inside_quote$.bind(NIL, thread);
              if ((NIL != czer_vars.$canonicalize_variablesP$.getDynamicValue(thread))) {
                result = expression_nsublis_free_vars_int(alist, formula_arg1(expression, UNPROVIDED), test);
              } else {
                result = el_utilities.make_unary_formula(formula_arg0(expression), expression_nsublis_free_vars_int(alist, formula_arg1(expression, UNPROVIDED), test));
              }
            } finally {
              czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
          }
          return result;
        }
      } else if ((NIL != cycl_grammar.fast_quote_term_p(expression))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
              czer_vars.$inside_quote$.bind(T, thread);
              result = el_utilities.make_unary_formula($const27$Quote, expression_nsublis_free_vars_int(alist, formula_arg1(expression, UNPROVIDED), test));
            } finally {
              czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
          }
          return result;
        }
      } else if ((NIL != el_utilities.expand_subl_fn_p(expression))) {
        {
          SubLObject arg1 = formula_arg1(expression, UNPROVIDED);
          SubLObject vars = expression_gather(arg1, Symbols.symbol_function($sym29$CYC_VAR_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject non_opaque_var_list = NIL;
          if ((NIL != vars)) {
            {
              SubLObject cdolist_list_var = vars;
              SubLObject var = NIL;
              for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                {
                  SubLObject oldXnew = conses_high.assoc(var, alist, test, UNPROVIDED);
                  if ((NIL != oldXnew)) {
                    non_opaque_var_list = cons(oldXnew, non_opaque_var_list);
                  }
                }
              }
            }
            if ((NIL != non_opaque_var_list)) {
              expression = el_utilities.make_binary_formula($const28$ExpandSubLFn, expression_nsublis_free_vars_int(alist, arg1, test), expression_nsublis_free_vars_int(non_opaque_var_list, formula_arg2(expression, UNPROVIDED), test));
            }
          }
          return expression;
        }
      } else {
        {
          SubLObject seqvar = el_utilities.sequence_var(expression, UNPROVIDED);
          SubLObject substituted_seqvar = (((NIL != seqvar)
               && (NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29829"))) ? ((SubLObject) expression_nsublis_free_vars_int(alist, seqvar, test)) : seqvar);
          SubLObject rest_of_expression = NIL;
          SubLObject v_term = NIL;
          SubLObject argnum = NIL;
          for (rest_of_expression = expression, v_term = rest_of_expression.first(), argnum = ZERO_INTEGER; rest_of_expression.rest().isCons(); rest_of_expression = rest_of_expression.rest(), v_term = rest_of_expression.first(), argnum = Numbers.add(ONE_INTEGER, argnum)) {
            if ((NIL == opaque_arg_wrt_free_varsP(expression, argnum))) {
              ConsesLow.rplaca(rest_of_expression, expression_nsublis_free_vars_int(alist, v_term, test));
            }
          }
          if ((NIL == opaque_arg_wrt_free_varsP(expression, argnum))) {
            ConsesLow.rplaca(rest_of_expression, expression_nsublis_free_vars_int(alist, v_term, test));
          }
          ConsesLow.rplacd(rest_of_expression, substituted_seqvar);
          return expression;
        }
      }
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 55987) 
  public static final SubLObject expression_nsublis_free_vars(SubLObject alist, SubLObject expression, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return expression_nsublis_free_vars_int(alist, expression, test);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 64039) 
  private static SubLSymbol $permute_list_cached_caching_state$ = null;

  /** Return the permutations of the formula that can be possibly canonical.  For fully bound formula, it returns the formula.  For non fully-bound formula, it return the permutations of the variable arg with the other args in canonical order. Doesn't permute sequence vars. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 64801) 
  public static final SubLObject canonical_commutative_permutations(SubLObject formula, SubLObject varP, SubLObject penetrate_argsP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym29$CYC_VAR_);
    }
    if ((penetrate_argsP == UNPROVIDED)) {
      penetrate_argsP = NIL;
    }
    if ((NIL != el_utilities.groundP(formula, varP))) {
      return list(czer_main.canonicalize_literal_commutative_terms(formula));
    }
    {
      SubLObject variable_argnums = variable_argnums(formula, varP);
      SubLObject target_formulas = NIL;
      if (((NIL == penetrate_argsP)
           && (NIL == variable_argnums))) {
        target_formulas = list(czer_main.canonicalize_literal_commutative_args(formula));
        return target_formulas;
      } else if (((NIL != penetrate_argsP)
           && (NIL == variable_argnums))) {
        target_formulas = args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
        return Sequences.nreverse(target_formulas);
      } else if (((NIL != penetrate_argsP)
           && (NIL != variable_argnums))) {
        target_formulas = args_canonical_commutative_permutations(czer_main.canonicalize_literal_commutative_terms(formula), varP);
      } else {
        target_formulas = list(czer_main.canonicalize_literal_commutative_args(formula));
      }
      target_formulas = formulas_canonical_permutations(target_formulas);
      return Sequences.nreverse(target_formulas);
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 66278) 
  public static final SubLObject variable_argnums(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym29$CYC_VAR_);
    }
    if ((NIL != el_utilities.groundP(formula, varP))) {
      return NIL;
    }
    {
      SubLObject argnums = NIL;
      SubLObject argnum = ZERO_INTEGER;
      SubLObject args = formula_args(formula, $kw19$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
        argnum = Numbers.add(argnum, ONE_INTEGER);
        if ((NIL != Functions.funcall(varP, arg))) {
          argnums = cons(argnum, argnums);
        }
      }
      return argnums;
    }
  }

  /** Result is destructible.  If any of the arg of the formula has a commutative relation formula, the commutative permutations for those args are generated. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 66546) 
  public static final SubLObject args_canonical_commutative_permutations(SubLObject formula, SubLObject varP) {
    {
      SubLObject target_formulas = list(el_utilities.copy_formula(formula));
      SubLObject argnum = ZERO_INTEGER;
      SubLObject args = formula_args(formula, $kw19$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
        argnum = Numbers.add(argnum, ONE_INTEGER);
        if ((NIL != el_utilities.subl_escape_p(arg))) {
        } else if ((NIL != term.nautP(arg, UNPROVIDED))) {
          {
            SubLObject cdolist_list_var_10 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29803");
            SubLObject arg_permutation = NIL;
            for (arg_permutation = cdolist_list_var_10.first(); (NIL != cdolist_list_var_10); cdolist_list_var_10 = cdolist_list_var_10.rest(), arg_permutation = cdolist_list_var_10.first()) {
              if ((!(arg_permutation.equal(arg)))) {
                target_formulas = cons(el_utilities.nreplace_formula_arg(argnum, arg_permutation, el_utilities.copy_formula(formula)), target_formulas);
              }
            }
          }
        } else if ((NIL != el_utilities.el_relation_expressionP(arg))) {
          {
            SubLObject cdolist_list_var_11 = canonical_commutative_permutations(arg, varP, T);
            SubLObject formula_permutation = NIL;
            for (formula_permutation = cdolist_list_var_11.first(); (NIL != cdolist_list_var_11); cdolist_list_var_11 = cdolist_list_var_11.rest(), formula_permutation = cdolist_list_var_11.first()) {
              if ((!(formula_permutation.equal(arg)))) {
                target_formulas = cons(el_utilities.nreplace_formula_arg(argnum, formula_permutation, el_utilities.copy_formula(formula)), target_formulas);
              }
            }
          }
        }
      }
      return target_formulas;
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 67503) 
  public static final SubLObject formulas_canonical_permutations(SubLObject source_formulas) {
    {
      SubLObject target_formulas = NIL;
      SubLObject permutedP = NIL;
      SubLObject cdolist_list_var = source_formulas;
      SubLObject source_formula = NIL;
      for (source_formula = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), source_formula = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_12 = czer_main.commutative_argnums(source_formula);
          SubLObject commutative_argnums = NIL;
          for (commutative_argnums = cdolist_list_var_12.first(); (NIL != cdolist_list_var_12); cdolist_list_var_12 = cdolist_list_var_12.rest(), commutative_argnums = cdolist_list_var_12.first()) {
            {
              SubLObject variable_argnums = variable_argnums(source_formula, UNPROVIDED);
              SubLObject argnums_to_permute = keyhash_utilities.fast_intersection(commutative_argnums, variable_argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              SubLObject other_argnums = NIL;
              SubLObject argnum_permutations = NIL;
              if ((NIL != argnums_to_permute)) {
                other_argnums = Sequences.nreverse(conses_high.set_difference(commutative_argnums, argnums_to_permute, UNPROVIDED, UNPROVIDED));
                argnum_permutations = permutations_merge(other_argnums, argnums_to_permute);
                permutedP = T;
                {
                  SubLObject cdolist_list_var_13 = argnum_permutations;
                  SubLObject argnum_permutation = NIL;
                  for (argnum_permutation = cdolist_list_var_13.first(); (NIL != cdolist_list_var_13); cdolist_list_var_13 = cdolist_list_var_13.rest(), argnum_permutation = cdolist_list_var_13.first()) {
                    target_formulas = cons(canonical_permute_formula(source_formula, commutative_argnums, argnum_permutation), target_formulas);
                  }
                }
              } else {
                target_formulas = cons(source_formula, target_formulas);
              }
            }
          }
        }
      }
      if ((NIL != permutedP)) {
        return Sequences.delete_duplicates(target_formulas, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      } else {
        return source_formulas;
      }
    }
  }

  /** Result is destructible */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 68481) 
  public static final SubLObject canonical_permute_formula(SubLObject source_formula, SubLObject argnums_to_permute, SubLObject argnum_permutation) {
    {
      SubLObject target_formula = el_utilities.copy_formula(source_formula);
      SubLObject list_var = NIL;
      SubLObject source_argnum = NIL;
      SubLObject index = NIL;
      for (list_var = argnum_permutation, source_argnum = list_var.first(), index = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), source_argnum = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
        {
          SubLObject target_argnum = ConsesLow.nth(index, argnums_to_permute);
          if ((target_argnum != source_argnum)) {
            {
              SubLObject target_term = formula_arg(source_formula, source_argnum, UNPROVIDED);
              target_formula = el_utilities.nreplace_formula_arg(target_argnum, target_term, target_formula);
            }
          }
        }
      }
      return target_formula;
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 69348) 
  public static final SubLObject split_list_set(SubLObject l) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject splits = list(reader.bq_cons(l, $list34));
        SubLObject length = Sequences.length(l);
        SubLObject end_var = length;
        SubLObject i = NIL;
        for (i = ONE_INTEGER; (!(i.numGE(end_var))); i = number_utilities.f_1X(i)) {
          thread.resetMultipleValues();
          {
            SubLObject list1 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9384");
            SubLObject list2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            splits = cons(list(list1, list2), splits);
          }
        }
        return splits;
      }
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 69592) 
  public static final SubLObject permutations_merge(SubLObject list1, SubLObject list2) {
    {
      SubLObject merged = NIL;
      SubLObject permutations = list_utilities.permute_list(list2, UNPROVIDED);
      SubLObject list1_splits = split_list_set(list1);
      SubLObject cdolist_list_var = list1_splits;
      SubLObject list1_split = NIL;
      for (list1_split = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), list1_split = cdolist_list_var.first()) {
        {
          SubLObject datum = list1_split;
          SubLObject current = datum;
          SubLObject front1 = NIL;
          SubLObject rest1 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list35);
          front1 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list35);
          rest1 = current.first();
          current = current.rest();
          if ((NIL == current)) {
            {
              SubLObject cdolist_list_var_14 = permutations;
              SubLObject permutation = NIL;
              for (permutation = cdolist_list_var_14.first(); (NIL != cdolist_list_var_14); cdolist_list_var_14 = cdolist_list_var_14.rest(), permutation = cdolist_list_var_14.first()) {
                {
                  SubLObject list2_splits = split_list_set(permutation);
                  SubLObject cdolist_list_var_15 = list2_splits;
                  SubLObject list2_split = NIL;
                  for (list2_split = cdolist_list_var_15.first(); (NIL != cdolist_list_var_15); cdolist_list_var_15 = cdolist_list_var_15.rest(), list2_split = cdolist_list_var_15.first()) {
                    {
                      SubLObject datum_16 = list2_split;
                      SubLObject current_17 = datum_16;
                      SubLObject front2 = NIL;
                      SubLObject rest2 = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp(current_17, datum_16, $list36);
                      front2 = current_17.first();
                      current_17 = current_17.rest();
                      cdestructuring_bind.destructuring_bind_must_consp(current_17, datum_16, $list36);
                      rest2 = current_17.first();
                      current_17 = current_17.rest();
                      if ((NIL == current_17)) {
                        merged = cons(ConsesLow.append(front1, front2, rest1, rest2), merged);
                        merged = cons(ConsesLow.append(front2, front1, rest2, rest1), merged);
                      } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_16, $list36);
                      }
                    }
                  }
                }
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list35);
          }
        }
      }
      return Sequences.delete_duplicates(merged, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 72832) 
  private static SubLSymbol $renamed_default_el_var_prefix$ = null;

  public static final class $renamed_default_el_var_p$UnaryFunction extends UnaryFunction {
    public $renamed_default_el_var_p$UnaryFunction() { super(extractFunctionNamed("RENAMED-DEFAULT-EL-VAR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29837"); }
  }

  /** Cyc constants that have no indexing maintained for them.
   All other constants except instances of #$ELRelation are indexed (4/3/00) */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 73682) 
  private static SubLSymbol $non_indexed_constants$ = null;

  /** @return BOOLEANP non-NIL iff PRED is functional in some argument. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 79493) 
  public static final SubLObject functional_in_some_argP(SubLObject pred) {
    checkType(pred, $sym51$VALID_SOMEWHERE_CACHE_ITEM_);
    return makeBoolean(((NIL != somewhere_cache.some_pred_assertion_somewhereP($const52$functionalInArgs, pred, ONE_INTEGER, UNPROVIDED))
          || (NIL != somewhere_cache.some_pred_assertion_somewhereP($const53$strictlyFunctionalInArgs, pred, ONE_INTEGER, UNPROVIDED))));
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 81691) 
  public static final SubLObject reify_arg_when_closed_naut(SubLObject reln, SubLObject psn) {
    {
      SubLObject object = formula_arg(reln, psn, UNPROVIDED);
      if ((NIL != el_utilities.arg_types_prescribe_unreifiedP(reln, psn))) {
        return object;
      } else {
        return reify_when_closed_naut(object);
      }
    }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 81897) 
  public static final SubLObject reify_when_closed_naut(SubLObject object) {
    if ((NIL == el_utilities.possibly_naut_p(object))) {
      return object;
    } else if ((NIL != term.closed_nautP(object, UNPROVIDED))) {
      {
        SubLObject cnat = narts_high.nart_substitute(object);
        if ((NIL != cnat)) {
          return cnat;
        } else {
          return object;
        }
      }
    } else if ((NIL != el_utilities.el_formulaP(object))) {
      {
        SubLObject result = NIL;
        SubLObject cdotimes_end_var = el_utilities.formula_length(object, $kw19$IGNORE);
        SubLObject psn = NIL;
        for (psn = ZERO_INTEGER; psn.numL(cdotimes_end_var); psn = Numbers.add(psn, ONE_INTEGER)) {
          result = cons(reify_arg_when_closed_naut(object, psn), result);
        }
        return Sequences.nreverse(result);
      }
    } else {
      return object;
    }
  }

  /** if OBJECT is a closed, unreified, specification of a reified non-atomic term, 
   then return the NART implementing the reification; otherwise return nil. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 82604) 
  public static final SubLObject find_closed_naut(SubLObject object) {
    if ((NIL != term.closed_nautP(object, UNPROVIDED))) {
      {
        SubLObject nart = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10332");
        if ((NIL != nart_handles.nart_p(nart))) {
          return nart;
        }
      }
    }
    return NIL;
  }

  /** if OBJECT is a ground, unreified, specification of a reified non-atomic term, 
   then return the NART implementing the reification; otherwise return nil. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 82929) 
  public static final SubLObject find_ground_naut(SubLObject object) {
    if ((NIL != term.ground_nautP(object, UNPROVIDED))) {
      {
        SubLObject nat = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10333");
        return ((NIL != nart_handles.nart_p(nat)) ? ((SubLObject) nat) : NIL);
      }
    }
    return NIL;
  }

  /** @return boolean; t iff ASENT is (possibly) an atomic sentence
   with predicate PRED.
   Assumes equality can be tested with #'eq. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 83331) 
  public static final SubLObject atomic_sentence_with_pred_p(SubLObject asent, SubLObject pred) {
    return makeBoolean(((NIL != el_utilities.possibly_atomic_sentence_p(asent))
           && (pred == atomic_sentence_predicate(asent))));
  }

  /** @return boolean; t iff ASENT is (possibly) an atomic sentence
   with a predicate in PREDS.
   Assumes equality can be tested with #'eq. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 83624) 
  public static final SubLObject atomic_sentence_with_any_of_preds_p(SubLObject asent, SubLObject preds) {
    return makeBoolean(((NIL != el_utilities.possibly_atomic_sentence_p(asent))
           && (NIL != list_utilities.member_eqP(atomic_sentence_predicate(asent), preds))));
  }

  /** @return boolean; t iff OBJECT is an EL formula, a nart, or an assertion. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 84035) 
  public static final SubLObject possibly_cycl_formula_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
          || (NIL != nart_handles.nart_p(object))
          || (NIL != assertion_handles.assertion_p(object))));
  }

  /** Assuming FORM is a valid CycL formula, return T IFF it is negated. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 84359) 
  public static final SubLObject negatedP(SubLObject form) {
    checkType(form, $sym15$EL_FORMULA_P);
    return makeBoolean((form.isCons()
           && (form.first() == $const63$not)
           && Sequences.length(form).numE(TWO_INTEGER)));
  }

  /** Assuming FORM is a valid CycL formula, return a negated version of it. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 84618) 
  public static final SubLObject negate(SubLObject form) {
    checkType(form, $sym15$EL_FORMULA_P);
    if ((NIL != negatedP(form))) {
      return formula_arg1(form, UNPROVIDED);
    } else {
      return list($const63$not, form);
    }
  }

  /** Assuming SENTENCE is a CycL sentence, return a negated version of it if
TRUTH is :false */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 84884) 
  public static final SubLObject possibly_negate(SubLObject sentence, SubLObject truth) {
    checkType(truth, $sym72$TRUTH_P);
    if ((truth == $kw73$TRUE)) {
      return sentence;
    } else {
      return negate(sentence);
    }
  }

  /** returns the ARGNUMth argument of FORMULA.  An ARGNUM of 0 will return the operator.
   Works with forts and assertions.
   If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
   If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
   e.g. (formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
   but  (formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 85133) 
  public static final SubLObject formula_arg(SubLObject formula, SubLObject argnum, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    if ((NIL == subl_promotions.non_negative_integer_p(argnum))) {
      return NIL;
    } else if ((NIL != el_utilities.el_formula_p(formula))) {
      return el_formula_arg(formula, argnum, seqvar_handling);
    } else if ((NIL != nart_handles.nart_p(formula))) {
      return el_formula_arg(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10395"), argnum, UNPROVIDED);
    } else if ((NIL != assertion_handles.assertion_p(formula))) {
      return el_formula_arg(fi.assertion_hl_formula(formula, UNPROVIDED), argnum, UNPROVIDED);
    }
    return NIL;
  }

  /** returns the ARGNUMth argument of EL-FORMULA.  An ARGNUM of 0 will return the operator.
   If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
   If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
   e.g. (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
   but  (el-formula-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 86303) 
  public static final SubLObject el_formula_arg(SubLObject el_formula, SubLObject argnum, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    checkType(el_formula, $sym15$EL_FORMULA_P);
    checkType(argnum, $sym74$NON_NEGATIVE_INTEGER_P);
    if ((NIL != el_utilities.el_formula_arityGE(el_formula, argnum, seqvar_handling))) {
      return ConsesLow.nth(argnum, el_formula_terms(el_formula, seqvar_handling));
    }
    return NIL;
  }

  /** returns the 0th argument of FORMULA, which is by convention the operator.
   returns NIL if FORMULA is not a formula. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 87060) 
  public static final SubLObject formula_arg0(SubLObject formula) {
    if ((NIL != el_utilities.el_formula_p(formula))) {
      return el_formula_operator(formula);
    } else if ((NIL != nart_handles.nart_p(formula))) {
      return el_formula_operator(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10396"));
    } else if ((NIL != assertion_handles.assertion_p(formula))) {
      return el_formula_operator(fi.assertion_hl_formula(formula, UNPROVIDED));
    }
    return NIL;
  }

  /** returns the operator of FORMULA.
   returns NIL if FORMULA is not a formula. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 87583) 
  public static final SubLObject formula_operator(SubLObject formula) {
    return formula_arg0(formula);
  }

  /** returns the operator of EL-FORMULA. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 87780) 
  public static final SubLObject el_formula_operator(SubLObject el_formula) {
    checkType(el_formula, $sym15$EL_FORMULA_P);
    return el_formula.first();
  }

  /** returns the 1st argument of FORMULA.
   returns NIL if FORMULA is not a formula. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 87935) 
  public static final SubLObject formula_arg1(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg(formula, ONE_INTEGER, seqvar_handling);
  }

  /** returns the 2nd argument of FORMULA.
   returns NIL if FORMULA is not a formula. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 88144) 
  public static final SubLObject formula_arg2(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg(formula, TWO_INTEGER, seqvar_handling);
  }

  /** returns the 3rd argument of FORMULA.
   returns NIL if FORMULA is not a formula. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 88353) 
  public static final SubLObject formula_arg3(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg(formula, THREE_INTEGER, seqvar_handling);
  }

  /** @return list; the arguments of FORMULA.
   If seqvar-handling is :ignore, it chops off the sequence var if there is one.
   If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
   If seqvar-handling is :include, it returns it as a sequence var.
   Note that using the :include option may cause formula-args to return a variable instead of a list!
   e.g. (formula-args (#$different . ?X) :include) -> ?X
   Does the right thing for narts and assertions, but ignores the MT of the assertion.
   returns NIL if FORMULA is not a possibly-cycl-formula-p. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 88980) 
  public static final SubLObject formula_args(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    if ((NIL != el_utilities.el_formula_p(formula))) {
      return el_formula_args(formula, seqvar_handling);
    } else if ((NIL != nart_handles.nart_p(formula))) {
      return el_formula_args(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10397"), UNPROVIDED);
    } else if ((NIL != assertion_handles.assertion_p(formula))) {
      return el_formula_args(fi.assertion_hl_formula(formula, UNPROVIDED), UNPROVIDED);
    }
    return NIL;
  }

  /** @return list; the arguments of FORMULA.
   If seqvar-handling is :ignore, it chops off the sequence var if there is one.
   If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
   If seqvar-handling is :include, it returns it as a sequence var.
   Note that using the :include option may cause el-formula-args to return a variable instead of a list!
   e.g. (el-formula-args (#$different . ?X) :include) -> ?X */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 89895) 
  public static final SubLObject el_formula_args(SubLObject el_formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    checkType(el_formula, $sym15$EL_FORMULA_P);
    if ((NIL != list_utilities.non_dotted_list_p(el_formula))) {
      return el_formula.rest();
    }
    return formula_terms_int(el_formula.rest(), seqvar_handling, UNPROVIDED);
  }

  /** @return list; a list of the terms in FORMULA.
   If seqvar-handling is :ignore, it chops off the sequence var if there is one.
   If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
   If seqvar-handling is :include, it returns it as a sequence var.
   Does the right thing for narts and assertions, but ignores the MT of the assertion.
   returns NIL if FORMULA is not a possibly-cycl-formula-p. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 92516) 
  public static final SubLObject formula_terms(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    if ((NIL != el_utilities.el_formula_p(formula))) {
      return el_formula_terms(formula, seqvar_handling);
    } else if ((NIL != nart_handles.nart_p(formula))) {
      return el_formula_terms(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10398"), UNPROVIDED);
    } else if ((NIL != assertion_handles.assertion_p(formula))) {
      return el_formula_terms(fi.assertion_hl_formula(formula, UNPROVIDED), UNPROVIDED);
    }
    return NIL;
  }

  /** @return list; a list of the terms in EL-FORMULA.
   If seqvar-handling is :ignore, it chops off the sequence var if there is one.
   If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
   If seqvar-handling is :include, it returns it as a sequence var. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 93283) 
  public static final SubLObject el_formula_terms(SubLObject el_formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    checkType(el_formula, $sym15$EL_FORMULA_P);
    return formula_terms_int(el_formula, seqvar_handling, UNPROVIDED);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 93751) 
  public static final SubLObject formula_terms_int(SubLObject formula, SubLObject seqvar_handling, SubLObject force_one_passP) {
    if ((force_one_passP == UNPROVIDED)) {
      force_one_passP = NIL;
    }
    if ((NIL != force_one_passP)) {
      return formula_terms_int_one_pass(formula, seqvar_handling);
    } else {
      return formula_terms_int_two_pass(formula, seqvar_handling);
    }
  }

  /** @return LISTP; the terms of FORMULA. This version makes two passes if FORMULA has
a sequence variable, but it avoids the consing done by VALUES in Allegro for formulas
without sequence variables.  Also it avoids cdr recursion.
@owner baxter */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 93995) 
  public static final SubLObject formula_terms_int_two_pass(SubLObject formula, SubLObject seqvar_handling) {
    if ((NIL != el_utilities.formula_with_sequence_termP(formula))) {
      return formula_terms_int_one_pass(formula, seqvar_handling);
    } else if (formula.isCons()) {
      return formula;
    } else {
      return formula_terms_int_one_pass(formula, seqvar_handling);
    }
  }

  /** @return 0 list; the terms of FORMULA
   @return 1 boolean; whether to cons
in the case of formula-args having the
optional sequence var argument be :include, we can simply use rest; in the
case it is :ignore or :regularize, we could use a recursive internal function
that recurses down the arg-list until a sequence var is encountered and,
only if one is encountered conses the car (the arg) while unwinding; if no
result is consed-up (e.g., no sequence var is found), it can simply return
rest.  No separate call to proper-list-p would be made.  This would seem
to minimize both consing and cdr'ing through the formula args. -ksm */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 94532) 
  public static final SubLObject formula_terms_int_one_pass(SubLObject formula, SubLObject seqvar_handling) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == formula)) {
        return Values.values(NIL, NIL);
      } else if (formula.isCons()) {
        thread.resetMultipleValues();
        {
          SubLObject subformula = formula_terms_int(formula.rest(), seqvar_handling, T);
          SubLObject consP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != consP)) {
            return Values.values(cons(formula.first(), subformula), T);
          } else {
            return Values.values(formula, NIL);
          }
        }
      } else if ((NIL != cycl_variables.cyc_varP(formula))) {
        {
          SubLObject pcase_var = seqvar_handling;
          if (pcase_var.eql($kw19$IGNORE)) {
            return Values.values(NIL, T);
          } else if (pcase_var.eql($kw12$REGULARIZE)) {
            return Values.values(list(formula), T);
          } else if (pcase_var.eql($kw77$INCLUDE)) {
            return Values.values(formula, NIL);
          } else {
            return Values.values(NIL, T);
          }
        }
      } else {
        el_utilities.el_error(THREE_INTEGER, $str78$formula_terms_int_got_a_non_el_va, formula, UNPROVIDED, UNPROVIDED);
        return Values.values(NIL, T);
      }
    }
  }

  /** returns (as a list or a variable) the arguments of NAT.
   returns NIL if NAT is not a nat.
   If seqvar-handling is :ignore, it chops off the sequence var if there is one.
   If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
   If seqvar-handling is :include, it returns it as a sequence var. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 97643) 
  public static final SubLObject nat_args(SubLObject nat, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_args(nat, seqvar_handling);
  }

  /** return the argument in position N of non-atomic term NAT.
   If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
   If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
   e.g. (nat-arg (<func> <arg1> . ?SEQ) 2 :ignore)     -> NIL
   but  (nat-arg (<func> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 98539) 
  public static final SubLObject nat_arg(SubLObject nat, SubLObject n, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg(nat, n, seqvar_handling);
  }

  /** returns the functor of NAT.
   returns NIL if NAT is not a nat. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 99815) 
  public static final SubLObject nat_functor(SubLObject nat) {
    return nat_arg0(nat);
  }

  /** returns the functor of NAUT. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 99974) 
  public static final SubLObject naut_functor(SubLObject naut) {
    return el_formula_operator(naut);
  }

  /** returns the 0th argument of NAT, which is by convention the functor.
   returns NIL if NAT is not a nat. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 100078) 
  public static final SubLObject nat_arg0(SubLObject nat) {
    if ((NIL != el_utilities.el_formula_p(nat))) {
      return naut_functor(nat);
    } else if ((NIL != nart_handles.nart_p(nat))) {
      return naut_functor(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10400"));
    }
    return NIL;
  }

  /** returns the 1st argument of NAT.
   returns NIL if NAT is not a nat. */
  @SubL(source = "cycl/cycl-utilities.lisp", position = 100346) 
  public static final SubLObject nat_arg1(SubLObject nat, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return nat_arg(nat, ONE_INTEGER, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 101692) 
  public static final SubLObject sentence_arg(SubLObject sentence, SubLObject argnum, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg(sentence, argnum, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 101946) 
  public static final SubLObject sentence_args(SubLObject sentence, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_args(sentence, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 102116) 
  public static final SubLObject sentence_truth_function(SubLObject sentence) {
    return formula_arg0(sentence);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 102233) 
  public static final SubLObject sentence_arg0(SubLObject sentence) {
    return formula_arg0(sentence);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 102306) 
  public static final SubLObject sentence_arg1(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg1(asent, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 102426) 
  public static final SubLObject sentence_arg2(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg2(asent, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 102906) 
  public static final SubLObject atomic_sentence_arg(SubLObject asent, SubLObject argnum, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg(asent, argnum, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 103167) 
  public static final SubLObject atomic_sentence_args(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_args(asent, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 103340) 
  public static final SubLObject atomic_sentence_predicate(SubLObject asent) {
    return formula_arg0(asent);
  }

  public static final class $atomic_sentence_predicate$UnaryFunction extends UnaryFunction {
    public $atomic_sentence_predicate$UnaryFunction() { super(extractFunctionNamed("ATOMIC-SENTENCE-PREDICATE")); }
    public SubLObject processItem(SubLObject arg1) { return atomic_sentence_predicate(arg1); }
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 103534) 
  public static final SubLObject atomic_sentence_arg1(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg1(asent, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 103661) 
  public static final SubLObject atomic_sentence_arg2(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg2(asent, seqvar_handling);
  }

  @SubL(source = "cycl/cycl-utilities.lisp", position = 103788) 
  public static final SubLObject atomic_sentence_arg3(SubLObject asent, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw19$IGNORE;
    }
    return formula_arg3(asent, seqvar_handling);
  }

  public static final SubLObject declare_cycl_utilities_file() {
    declareMacro(myName, "with_opaque_arg_function", "WITH-OPAQUE-ARG-FUNCTION");
    declareMacro(myName, "with_opaque_seqvar_function", "WITH-OPAQUE-SEQVAR-FUNCTION");
    declareFunction(myName, "opaque_argP", "OPAQUE-ARG?", 2, 0, false);
    declareFunction(myName, "opaque_argP_int", "OPAQUE-ARG?-INT", 3, 0, false);
    declareFunction(myName, "opaque_seqvarP", "OPAQUE-SEQVAR?", 1, 0, false);
    declareFunction(myName, "default_opaque_argP", "DEFAULT-OPAQUE-ARG?", 2, 0, false);
    declareFunction(myName, "opaque_arg_wrt_free_varsP", "OPAQUE-ARG-WRT-FREE-VARS?", 2, 0, false);
    declareFunction(myName, "opaque_arg_wrt_el_templateP", "OPAQUE-ARG-WRT-EL-TEMPLATE?", 2, 0, false);
    declareFunction(myName, "opaque_arg_wrt_quotingP", "OPAQUE-ARG-WRT-QUOTING?", 2, 0, false); new $opaque_arg_wrt_quotingP$BinaryFunction();
    declareFunction(myName, "opaque_arg_wrt_quoting_not_counting_logical_opsP", "OPAQUE-ARG-WRT-QUOTING-NOT-COUNTING-LOGICAL-OPS?", 2, 0, false);
    declareFunction(myName, "opaque_arg_wrt_quoteP", "OPAQUE-ARG-WRT-QUOTE?", 2, 0, false);
    declareFunction(myName, "opaque_arg_wrt_skolemP", "OPAQUE-ARG-WRT-SKOLEM?", 2, 0, false);
    declareFunction(myName, "default_opaque_seqvarP", "DEFAULT-OPAQUE-SEQVAR?", 1, 0, false);
    declareFunction(myName, "hl_term_with_el_counterpart_p", "HL-TERM-WITH-EL-COUNTERPART-P", 1, 0, false); new $hl_term_with_el_counterpart_p$UnaryFunction();
    declareFunction(myName, "hl_term_to_el_term", "HL-TERM-TO-EL-TERM", 1, 0, false); new $hl_term_to_el_term$UnaryFunction();
    declareFunction(myName, "careful_hl_term_to_el_term", "CAREFUL-HL-TERM-TO-EL-TERM", 1, 0, false);
    declareFunction(myName, "hl_to_el", "HL-TO-EL", 1, 0, false);
    declareFunction(myName, "hl_to_el_destructive", "HL-TO-EL-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "binding_lists_hl_to_el", "BINDING-LISTS-HL-TO-EL", 1, 0, false);
    declareFunction(myName, "transform_hl_to_el", "TRANSFORM-HL-TO-EL", 1, 0, false);
    declareFunction(myName, "reified_term_p", "REIFIED-TERM-P", 1, 0, false);
    declareFunction(myName, "atomic_reified_term_p", "ATOMIC-REIFIED-TERM-P", 1, 0, false);
    declareFunction(myName, "reified_formula_p", "REIFIED-FORMULA-P", 1, 0, false);
    declareFunction(myName, "expression_gather_int_2", "EXPRESSION-GATHER-INT-2", 5, 0, false);
    declareFunction(myName, "expression_gather_int", "EXPRESSION-GATHER-INT", 6, 0, false);
    declareFunction(myName, "expression_gather_with_duplicates", "EXPRESSION-GATHER-WITH-DUPLICATES", 2, 4, false);
    declareFunction(myName, "expression_gather", "EXPRESSION-GATHER", 2, 4, false);
    declareFunction(myName, "assertion_gather", "ASSERTION-GATHER", 2, 4, false);
    declareFunction(myName, "expression_count", "EXPRESSION-COUNT", 2, 3, false);
    declareFunction(myName, "expression_count_helper", "EXPRESSION-COUNT-HELPER", 1, 0, false);
    declareFunction(myName, "expression_list_gather", "EXPRESSION-LIST-GATHER", 2, 4, false);
    declareFunction(myName, "formula_gather", "FORMULA-GATHER", 2, 4, false);
    declareFunction(myName, "expression_forts", "EXPRESSION-FORTS", 1, 3, false);
    declareFunction(myName, "expression_list_forts", "EXPRESSION-LIST-FORTS", 1, 2, false);
    declareFunction(myName, "formula_forts", "FORMULA-FORTS", 1, 3, false);
    declareFunction(myName, "expression_constants", "EXPRESSION-CONSTANTS", 1, 1, false);
    declareFunction(myName, "expression_list_constants", "EXPRESSION-LIST-CONSTANTS", 1, 1, false);
    declareFunction(myName, "formula_constants", "FORMULA-CONSTANTS", 1, 1, false);
    declareFunction(myName, "expression_narts", "EXPRESSION-NARTS", 1, 2, false);
    declareFunction(myName, "expression_list_narts", "EXPRESSION-LIST-NARTS", 1, 2, false);
    declareFunction(myName, "formula_narts", "FORMULA-NARTS", 1, 2, false);
    declareFunction(myName, "expression_sub_assertions", "EXPRESSION-SUB-ASSERTIONS", 1, 2, false);
    declareFunction(myName, "expression_list_sub_assertions", "EXPRESSION-LIST-SUB-ASSERTIONS", 1, 2, false);
    declareFunction(myName, "formula_sub_assertions", "FORMULA-SUB-ASSERTIONS", 1, 2, false);
    declareFunction(myName, "assertion_sub_assertions", "ASSERTION-SUB-ASSERTIONS", 1, 2, false);
    declareFunction(myName, "nart_sub_assertions", "NART-SUB-ASSERTIONS", 1, 2, false);
    declareFunction(myName, "subnarts", "SUBNARTS", 1, 2, false);
    declareFunction(myName, "all_formula_terms", "ALL-FORMULA-TERMS", 1, 1, false);
    declareFunction(myName, "all_literal_terms", "ALL-LITERAL-TERMS", 1, 1, false);
    declareFunction(myName, "top_level_predicates", "TOP-LEVEL-PREDICATES", 1, 1, false);
    declareFunction(myName, "top_level_predicates_int", "TOP-LEVEL-PREDICATES-INT", 1, 0, false);
    declareFunction(myName, "containing_subexpressions", "CONTAINING-SUBEXPRESSIONS", 2, 0, false);
    declareFunction(myName, "containing_subexpressions_lambda_fn", "CONTAINING-SUBEXPRESSIONS-LAMBDA-FN", 1, 0, false);
    declareFunction(myName, "expression_contains_keywordp", "EXPRESSION-CONTAINS-KEYWORDP", 1, 1, false);
    declareFunction(myName, "expression_find_if_int", "EXPRESSION-FIND-IF-INT", 4, 0, false);
    declareFunction(myName, "expression_find_if", "EXPRESSION-FIND-IF", 2, 2, false);
    declareFunction(myName, "formula_find_if", "FORMULA-FIND-IF", 2, 2, false);
    declareFunction(myName, "assertion_find_if", "ASSERTION-FIND-IF", 2, 2, false);
    declareFunction(myName, "nart_find_if", "NART-FIND-IF", 2, 2, false);
    declareFunction(myName, "expression_find_int", "EXPRESSION-FIND-INT", 5, 0, false);
    declareFunction(myName, "expression_find", "EXPRESSION-FIND", 2, 3, false);
    declareFunction(myName, "formula_find", "FORMULA-FIND", 2, 3, false);
    declareFunction(myName, "assertion_find", "ASSERTION-FIND", 2, 3, false);
    declareFunction(myName, "nart_find", "NART-FIND", 2, 3, false);
    declareFunction(myName, "expression_list_find", "EXPRESSION-LIST-FIND", 2, 3, false);
    declareFunction(myName, "remove_if_not_in_expression", "REMOVE-IF-NOT-IN-EXPRESSION", 2, 3, false);
    declareFunction(myName, "expression_map_int", "EXPRESSION-MAP-INT", 4, 0, false);
    declareFunction(myName, "expression_map", "EXPRESSION-MAP", 2, 2, false);
    declareFunction(myName, "formula_map", "FORMULA-MAP", 2, 2, false);
    declareFunction(myName, "assertion_map", "ASSERTION-MAP", 2, 2, false);
    declareFunction(myName, "nart_map", "NART-MAP", 2, 2, false);
    declareFunction(myName, "expression_ntransform_int", "EXPRESSION-NTRANSFORM-INT", 8, 0, false);
    declareFunction(myName, "expression_transform", "EXPRESSION-TRANSFORM", 3, 2, false);
    declareFunction(myName, "expression_ntransform", "EXPRESSION-NTRANSFORM", 3, 2, false);
    declareFunction(myName, "formula_transform", "FORMULA-TRANSFORM", 3, 2, false);
    declareFunction(myName, "formula_ntransform", "FORMULA-NTRANSFORM", 3, 2, false);
    declareFunction(myName, "expression_transform_if", "EXPRESSION-TRANSFORM-IF", 3, 2, false);
    declareFunction(myName, "expression_ntransform_if", "EXPRESSION-NTRANSFORM-IF", 3, 2, false);
    declareFunction(myName, "formula_transform_if", "FORMULA-TRANSFORM-IF", 3, 2, false);
    declareFunction(myName, "formula_ntransform_if", "FORMULA-NTRANSFORM-IF", 3, 2, false);
    declareFunction(myName, "expression_transform_if_not", "EXPRESSION-TRANSFORM-IF-NOT", 3, 2, false);
    declareFunction(myName, "expression_ntransform_if_not", "EXPRESSION-NTRANSFORM-IF-NOT", 3, 2, false);
    declareFunction(myName, "formula_transform_if_not", "FORMULA-TRANSFORM-IF-NOT", 3, 2, false);
    declareFunction(myName, "formula_ntransform_if_not", "FORMULA-NTRANSFORM-IF-NOT", 3, 2, false);
    declareFunction(myName, "formula_and_mt_transform", "FORMULA-AND-MT-TRANSFORM", 4, 2, false);
    declareFunction(myName, "formula_and_mt_ntransform", "FORMULA-AND-MT-NTRANSFORM", 4, 2, false);
    declareFunction(myName, "sentence_and_mt_transform", "SENTENCE-AND-MT-TRANSFORM", 4, 2, false);
    declareFunction(myName, "sentence_and_mt_ntransform", "SENTENCE-AND-MT-NTRANSFORM", 4, 2, false);
    declareFunction(myName, "expression_nsubst_free_vars_int", "EXPRESSION-NSUBST-FREE-VARS-INT", 4, 0, false);
    declareFunction(myName, "expression_nsubst_free_vars", "EXPRESSION-NSUBST-FREE-VARS", 3, 1, false);
    declareFunction(myName, "expression_nsubst_int", "EXPRESSION-NSUBST-INT", 5, 0, false);
    declareFunction(myName, "expression_subst", "EXPRESSION-SUBST", 3, 2, false);
    declareFunction(myName, "expression_nsubst", "EXPRESSION-NSUBST", 3, 2, false);
    declareFunction(myName, "formula_subst", "FORMULA-SUBST", 3, 2, false);
    declareFunction(myName, "formula_nsubst", "FORMULA-NSUBST", 3, 2, false);
    declareFunction(myName, "expression_nsublis_free_vars_int", "EXPRESSION-NSUBLIS-FREE-VARS-INT", 3, 0, false);
    declareFunction(myName, "expression_nsublis_free_vars", "EXPRESSION-NSUBLIS-FREE-VARS", 2, 1, false);
    declareFunction(myName, "expression_nsublis_int", "EXPRESSION-NSUBLIS-INT", 4, 0, false);
    declareFunction(myName, "expression_sublis", "EXPRESSION-SUBLIS", 2, 2, false);
    declareFunction(myName, "expression_nsublis", "EXPRESSION-NSUBLIS", 2, 2, false);
    declareFunction(myName, "formula_sublis", "FORMULA-SUBLIS", 2, 2, false);
    declareFunction(myName, "formula_nsublis", "FORMULA-NSUBLIS", 2, 2, false);
    declareFunction(myName, "expression_nsublis_el_variables", "EXPRESSION-NSUBLIS-EL-VARIABLES", 2, 0, false);
    declareFunction(myName, "expression_sublis_el_variables", "EXPRESSION-SUBLIS-EL-VARIABLES", 2, 0, false);
    declareFunction(myName, "expression_nsublis_hl_variables", "EXPRESSION-NSUBLIS-HL-VARIABLES", 1, 0, false);
    declareFunction(myName, "expression_sublis_hl_variables", "EXPRESSION-SUBLIS-HL-VARIABLES", 1, 0, false);
    declareFunction(myName, "cnf_nsublis_el_variables", "CNF-NSUBLIS-EL-VARIABLES", 2, 0, false);
    declareFunction(myName, "cnf_sublis_el_variables", "CNF-SUBLIS-EL-VARIABLES", 2, 0, false);
    declareFunction(myName, "formula_arg_position_subst", "FORMULA-ARG-POSITION-SUBST", 3, 0, false);
    declareFunction(myName, "formula_arg_position_nsubst", "FORMULA-ARG-POSITION-NSUBST", 3, 0, false);
    declareFunction(myName, "permute_formula", "PERMUTE-FORMULA", 3, 0, false);
    declareFunction(myName, "formula_permutations", "FORMULA-PERMUTATIONS", 2, 0, false);
    declareFunction(myName, "formulas_permutations", "FORMULAS-PERMUTATIONS", 2, 0, false);
    declareFunction(myName, "formula_arg_permutations", "FORMULA-ARG-PERMUTATIONS", 1, 0, false);
    declareFunction(myName, "nat_commutative_permutations", "NAT-COMMUTATIVE-PERMUTATIONS", 1, 0, false);
    declareFunction(myName, "clear_permute_list_cached", "CLEAR-PERMUTE-LIST-CACHED", 0, 0, false);
    declareFunction(myName, "remove_permute_list_cached", "REMOVE-PERMUTE-LIST-CACHED", 1, 0, false);
    declareFunction(myName, "permute_list_cached_internal", "PERMUTE-LIST-CACHED-INTERNAL", 1, 0, false);
    declareFunction(myName, "permute_list_cached", "PERMUTE-LIST-CACHED", 1, 0, false);
    declareFunction(myName, "formula_commutative_permutations", "FORMULA-COMMUTATIVE-PERMUTATIONS", 1, 1, false);
    declareFunction(myName, "canonical_commutative_permutations", "CANONICAL-COMMUTATIVE-PERMUTATIONS", 1, 2, false);
    declareFunction(myName, "variable_argnums", "VARIABLE-ARGNUMS", 1, 1, false);
    declareFunction(myName, "args_canonical_commutative_permutations", "ARGS-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
    declareFunction(myName, "formulas_canonical_permutations", "FORMULAS-CANONICAL-PERMUTATIONS", 1, 0, false);
    declareFunction(myName, "canonical_permute_formula", "CANONICAL-PERMUTE-FORMULA", 3, 0, false);
    declareFunction(myName, "nat_canonical_commutative_permutations", "NAT-CANONICAL-COMMUTATIVE-PERMUTATIONS", 2, 0, false);
    declareFunction(myName, "split_list_set", "SPLIT-LIST-SET", 1, 0, false);
    declareFunction(myName, "permutations_merge", "PERMUTATIONS-MERGE", 2, 0, false);
    declareFunction(myName, "formula_operator_recursive", "FORMULA-OPERATOR-RECURSIVE", 1, 0, false);
    declareFunction(myName, "rename_default_el_vars_int", "RENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
    declareFunction(myName, "rename_default_el_vars", "RENAME-DEFAULT-EL-VARS", 1, 0, false);
    declareFunction(myName, "rename_default_el_vars_destructive", "RENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "unrename_default_el_vars_int", "UNRENAME-DEFAULT-EL-VARS-INT", 2, 0, false);
    declareFunction(myName, "unrename_default_el_vars", "UNRENAME-DEFAULT-EL-VARS", 1, 0, false);
    declareFunction(myName, "unrename_default_el_vars_destructive", "UNRENAME-DEFAULT-EL-VARS-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "renamed_default_el_var_num", "RENAMED-DEFAULT-EL-VAR-NUM", 1, 0, false);
    declareFunction(myName, "renamed_default_el_var_p", "RENAMED-DEFAULT-EL-VAR-P", 1, 0, false); new $renamed_default_el_var_p$UnaryFunction();
    declareFunction(myName, "get_renamed_default_el_var", "GET-RENAMED-DEFAULT-EL-VAR", 1, 0, false);
    declareFunction(myName, "non_indexed_fort_p", "NON-INDEXED-FORT-P", 1, 0, false);
    declareFunction(myName, "fort_or_naut_p", "FORT-OR-NAUT-P", 1, 0, false);
    declareFunction(myName, "fort_or_possibly_naut_p", "FORT-OR-POSSIBLY-NAUT-P", 1, 0, false);
    declareFunction(myName, "collection_intersection_natP", "COLLECTION-INTERSECTION-NAT?", 1, 0, false);
    declareFunction(myName, "collection_union_natP", "COLLECTION-UNION-NAT?", 1, 0, false);
    declareFunction(myName, "collection_intersection", "COLLECTION-INTERSECTION", 1, 0, false);
    declareFunction(myName, "collection_union", "COLLECTION-UNION", 1, 0, false);
    declareFunction(myName, "sorted_constant_list", "SORTED-CONSTANT-LIST", 1, 0, false);
    declareFunction(myName, "sorted_constant_external_id_list", "SORTED-CONSTANT-EXTERNAL-ID-LIST", 1, 0, false);
    declareFunction(myName, "sorted_constant_internal_id_list", "SORTED-CONSTANT-INTERNAL-ID-LIST", 1, 0, false);
    declareFunction(myName, "constant_list", "CONSTANT-LIST", 1, 1, false);
    declareFunction(myName, "sorted_nat_list", "SORTED-NAT-LIST", 1, 0, false);
    declareFunction(myName, "nat_list", "NAT-LIST", 1, 0, false);
    declareFunction(myName, "sorted_assertion_list", "SORTED-ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "assertion_list", "ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "sorted_fort_id_list", "SORTED-FORT-ID-LIST", 1, 0, false);
    declareFunction(myName, "functional_in_some_argP", "FUNCTIONAL-IN-SOME-ARG?", 1, 0, false);
    declareFunction(myName, "functional_in_arg_positions_internal", "FUNCTIONAL-IN-ARG-POSITIONS-INTERNAL", 1, 1, false);
    declareFunction(myName, "functional_in_arg_positions", "FUNCTIONAL-IN-ARG-POSITIONS", 1, 1, false);
    declareFunction(myName, "nart_cons", "NART-CONS", 1, 0, false);
    declareFunction(myName, "lookup_all_narts", "LOOKUP-ALL-NARTS", 1, 0, false);
    declareFunction(myName, "reify_all_existing_narts", "REIFY-ALL-EXISTING-NARTS", 1, 0, false);
    declareFunction(myName, "opaque_arg_wrt_nat_reificationP", "OPAQUE-ARG-WRT-NAT-REIFICATION?", 2, 0, false);
    declareFunction(myName, "reify_arg_when_closed_naut", "REIFY-ARG-WHEN-CLOSED-NAUT", 2, 0, false);
    declareFunction(myName, "reify_when_closed_naut", "REIFY-WHEN-CLOSED-NAUT", 1, 0, false);
    declareFunction(myName, "find_when_closed_naut", "FIND-WHEN-CLOSED-NAUT", 1, 0, false);
    declareFunction(myName, "find_closed_naut", "FIND-CLOSED-NAUT", 1, 0, false);
    declareFunction(myName, "find_ground_naut", "FIND-GROUND-NAUT", 1, 0, false);
    declareFunction(myName, "ground_hl_formulaP", "GROUND-HL-FORMULA?", 1, 0, false);
    declareFunction(myName, "atomic_sentence_with_pred_p", "ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false);
    declareFunction(myName, "atomic_sentence_with_any_of_preds_p", "ATOMIC-SENTENCE-WITH-ANY-OF-PREDS-P", 2, 0, false);
    declareFunction(myName, "null_or_falseP", "NULL-OR-FALSE?", 1, 0, false);
    declareFunction(myName, "possibly_cycl_formula_p", "POSSIBLY-CYCL-FORMULA-P", 1, 0, false);
    declareFunction(myName, "negatedP", "NEGATED?", 1, 0, false);
    declareFunction(myName, "negate", "NEGATE", 1, 0, false);
    declareFunction(myName, "possibly_negate", "POSSIBLY-NEGATE", 2, 0, false);
    declareFunction(myName, "formula_arg", "FORMULA-ARG", 2, 1, false);
    declareFunction(myName, "el_formula_arg", "EL-FORMULA-ARG", 2, 1, false);
    declareFunction(myName, "formula_arg0", "FORMULA-ARG0", 1, 0, false);
    declareFunction(myName, "formula_operator", "FORMULA-OPERATOR", 1, 0, false);
    declareFunction(myName, "el_formula_operator", "EL-FORMULA-OPERATOR", 1, 0, false);
    declareFunction(myName, "formula_arg1", "FORMULA-ARG1", 1, 1, false);
    declareFunction(myName, "formula_arg2", "FORMULA-ARG2", 1, 1, false);
    declareFunction(myName, "formula_arg3", "FORMULA-ARG3", 1, 1, false);
    declareFunction(myName, "formula_arg4", "FORMULA-ARG4", 1, 1, false);
    declareFunction(myName, "formula_arg5", "FORMULA-ARG5", 1, 1, false);
    declareFunction(myName, "formula_args", "FORMULA-ARGS", 1, 1, false);
    declareFunction(myName, "el_formula_args", "EL-FORMULA-ARGS", 1, 1, false);
    declareFunction(myName, "cycl_formula_args", "CYCL-FORMULA-ARGS", 1, 0, false);
    declareFunction(myName, "cycl_formula_arg0", "CYCL-FORMULA-ARG0", 1, 0, false);
    declareFunction(myName, "cycl_formula_arg1", "CYCL-FORMULA-ARG1", 1, 0, false);
    declareFunction(myName, "cycl_formula_arg2", "CYCL-FORMULA-ARG2", 1, 0, false);
    declareFunction(myName, "cycl_formula_arg3", "CYCL-FORMULA-ARG3", 1, 0, false);
    declareFunction(myName, "formula_terms", "FORMULA-TERMS", 1, 1, false);
    declareFunction(myName, "el_formula_terms", "EL-FORMULA-TERMS", 1, 1, false);
    declareFunction(myName, "formula_terms_int", "FORMULA-TERMS-INT", 2, 1, false);
    declareFunction(myName, "formula_terms_int_two_pass", "FORMULA-TERMS-INT-TWO-PASS", 2, 0, false);
    declareFunction(myName, "formula_terms_int_one_pass", "FORMULA-TERMS-INT-ONE-PASS", 2, 0, false);
    declareFunction(myName, "formula_arg_positions", "FORMULA-ARG-POSITIONS", 2, 1, false);
    declareFunction(myName, "el_formula_arg_positions", "EL-FORMULA-ARG-POSITIONS", 2, 1, false);
    declareFunction(myName, "nat_arity", "NAT-ARITY", 1, 1, false);
    declareFunction(myName, "nat_args", "NAT-ARGS", 1, 1, false);
    declareFunction(myName, "naut_args", "NAUT-ARGS", 1, 1, false);
    declareFunction(myName, "nat_arg", "NAT-ARG", 2, 1, false);
    declareFunction(myName, "naut_arg", "NAUT-ARG", 2, 1, false);
    declareFunction(myName, "nat_function", "NAT-FUNCTION", 1, 0, false);
    declareFunction(myName, "nat_functor", "NAT-FUNCTOR", 1, 0, false);
    declareFunction(myName, "naut_functor", "NAUT-FUNCTOR", 1, 0, false);
    declareFunction(myName, "nat_arg0", "NAT-ARG0", 1, 0, false);
    declareFunction(myName, "nat_arg1", "NAT-ARG1", 1, 1, false);
    declareFunction(myName, "naut_arg1", "NAUT-ARG1", 1, 1, false);
    declareFunction(myName, "nat_arg2", "NAT-ARG2", 1, 1, false);
    declareFunction(myName, "naut_arg2", "NAUT-ARG2", 1, 1, false);
    declareFunction(myName, "nat_arg3", "NAT-ARG3", 1, 1, false);
    declareFunction(myName, "nat_arg4", "NAT-ARG4", 1, 1, false);
    declareFunction(myName, "nat_arg5", "NAT-ARG5", 1, 1, false);
    declareFunction(myName, "cycl_nat_with_functor_p", "CYCL-NAT-WITH-FUNCTOR-P", 2, 0, false);
    declareFunction(myName, "sentence_arg", "SENTENCE-ARG", 2, 1, false);
    declareFunction(myName, "sentence_args", "SENTENCE-ARGS", 1, 1, false);
    declareFunction(myName, "sentence_truth_function", "SENTENCE-TRUTH-FUNCTION", 1, 0, false);
    declareFunction(myName, "sentence_arg0", "SENTENCE-ARG0", 1, 0, false);
    declareFunction(myName, "sentence_arg1", "SENTENCE-ARG1", 1, 1, false);
    declareFunction(myName, "sentence_arg2", "SENTENCE-ARG2", 1, 1, false);
    declareFunction(myName, "sentence_arg3", "SENTENCE-ARG3", 1, 1, false);
    declareFunction(myName, "sentence_arg4", "SENTENCE-ARG4", 1, 1, false);
    declareFunction(myName, "sentence_arg5", "SENTENCE-ARG5", 1, 1, false);
    declareFunction(myName, "atomic_sentence_arg", "ATOMIC-SENTENCE-ARG", 2, 1, false);
    declareFunction(myName, "atomic_sentence_args", "ATOMIC-SENTENCE-ARGS", 1, 1, false);
    declareFunction(myName, "atomic_sentence_predicate", "ATOMIC-SENTENCE-PREDICATE", 1, 0, false); new $atomic_sentence_predicate$UnaryFunction();
    declareFunction(myName, "atomic_sentence_arg0", "ATOMIC-SENTENCE-ARG0", 1, 0, false);
    declareFunction(myName, "atomic_sentence_arg1", "ATOMIC-SENTENCE-ARG1", 1, 1, false);
    declareFunction(myName, "atomic_sentence_arg2", "ATOMIC-SENTENCE-ARG2", 1, 1, false);
    declareFunction(myName, "atomic_sentence_arg3", "ATOMIC-SENTENCE-ARG3", 1, 1, false);
    declareFunction(myName, "atomic_sentence_arg4", "ATOMIC-SENTENCE-ARG4", 1, 1, false);
    declareFunction(myName, "atomic_sentence_arg5", "ATOMIC-SENTENCE-ARG5", 1, 1, false);
    declareFunction(myName, "arg_position_p", "ARG-POSITION-P", 1, 0, false);
    declareFunction(myName, "formula_arg_position", "FORMULA-ARG-POSITION", 2, 1, false);
    declareFunction(myName, "get_nested_nth_arg", "GET-NESTED-NTH-ARG", 2, 1, false);
    declareFunction(myName, "arg_positions_dfs", "ARG-POSITIONS-DFS", 2, 1, false);
    declareFunction(myName, "arg_positions_bfs", "ARG-POSITIONS-BFS", 2, 1, false);
    declareFunction(myName, "arg_positions_if_dfs", "ARG-POSITIONS-IF-DFS", 2, 1, false);
    declareFunction(myName, "arg_positions_if_bfs", "ARG-POSITIONS-IF-BFS", 2, 1, false);
    declareFunction(myName, "smallest_enclosing_cycl_sentence", "SMALLEST-ENCLOSING-CYCL-SENTENCE", 2, 0, false);
    declareFunction(myName, "cycl_arg_position_p", "CYCL-ARG-POSITION-P", 1, 0, false);
    declareFunction(myName, "make_cycl_arg_position", "MAKE-CYCL-ARG-POSITION", 1, 0, false);
    declareFunction(myName, "cycl_arg_position_to_arg_position", "CYCL-ARG-POSITION-TO-ARG-POSITION", 1, 0, false);
    declareFunction(myName, "formula_cycl_arg_position", "FORMULA-CYCL-ARG-POSITION", 2, 1, false);
    declareFunction(myName, "cycl_arg_position_nsubst", "CYCL-ARG-POSITION-NSUBST", 3, 0, false);
    declareFunction(myName, "substitute_terms_into_positions", "SUBSTITUTE-TERMS-INTO-POSITIONS", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_cycl_utilities_file() {
    $opaque_arg_function$ = defparameter("*OPAQUE-ARG-FUNCTION*", $sym0$DEFAULT_OPAQUE_ARG_);
    $opaque_seqvar_function$ = defparameter("*OPAQUE-SEQVAR-FUNCTION*", $sym1$DEFAULT_OPAQUE_SEQVAR_);
    $expression_count_item$ = defparameter("*EXPRESSION-COUNT-ITEM*", NIL);
    $expression_count_test$ = defparameter("*EXPRESSION-COUNT-TEST*", NIL);
    $containing_subexpressions_lambda_term$ = defparameter("*CONTAINING-SUBEXPRESSIONS-LAMBDA-TERM*", NIL);
    $default_transformation_limit$ = deflexical("*DEFAULT-TRANSFORMATION-LIMIT*", $int25$212);
    $permute_list_cached_caching_state$ = deflexical("*PERMUTE-LIST-CACHED-CACHING-STATE*", NIL);
    $renamed_default_el_var_prefix$ = defparameter("*RENAMED-DEFAULT-EL-VAR-PREFIX*", $str39$_RENAMED_VAR);
    $non_indexed_constants$ = deflexical("*NON-INDEXED-CONSTANTS*", ConsesLow.append(new SubLObject[] {el_utilities.$cyc_const_unary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_binary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_ternary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_quaternary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_quintary_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_variable_arity_logical_ops$.getGlobalValue(), el_utilities.$cyc_const_regular_quantifiers$.getGlobalValue(), el_utilities.$cyc_const_bounded_existentials$.getGlobalValue(), el_utilities.$cyc_const_exception_operators$.getGlobalValue(), el_utilities.$cyc_const_pragmatic_requirement_operators$.getGlobalValue()}));
    return NIL;
  }

  public static final SubLObject setup_cycl_utilities_file() {
    // CVS_ID("Id: cycl-utilities.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    access_macros.register_external_symbol($sym23$EXPRESSION_FIND_IF);
    memoization_state.note_globally_cached_function($sym31$PERMUTE_LIST_CACHED);
    memoization_state.note_memoized_function($sym54$FUNCTIONAL_IN_ARG_POSITIONS);
    utilities_macros.register_cyc_api_function($sym64$NEGATED_, $list65, $str66$Assuming_FORM_is_a_valid_CycL_for, $list67, $list68);
    utilities_macros.register_cyc_api_function($sym69$NEGATE, $list65, $str70$Assuming_FORM_is_a_valid_CycL_for, $list67, $list71);
    access_macros.register_external_symbol($sym75$FORMULA_OPERATOR);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$DEFAULT_OPAQUE_ARG_ = makeSymbol("DEFAULT-OPAQUE-ARG?");
  public static final SubLSymbol $sym1$DEFAULT_OPAQUE_SEQVAR_ = makeSymbol("DEFAULT-OPAQUE-SEQVAR?");
  public static final SubLList $list2 = list(makeSymbol("FUNC"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym4$_OPAQUE_ARG_FUNCTION_ = makeSymbol("*OPAQUE-ARG-FUNCTION*");
  public static final SubLSymbol $sym5$_OPAQUE_SEQVAR_FUNCTION_ = makeSymbol("*OPAQUE-SEQVAR-FUNCTION*");
  public static final SubLSymbol $sym6$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");
  public static final SubLObject $const7$SkolemFunctionFn = constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn"));
  public static final SubLObject $const8$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLSymbol $sym9$HL_TERM_WITH_EL_COUNTERPART_P = makeSymbol("HL-TERM-WITH-EL-COUNTERPART-P");
  public static final SubLSymbol $sym10$HL_TERM_TO_EL_TERM = makeSymbol("HL-TERM-TO-EL-TERM");
  public static final SubLSymbol $sym11$CAREFUL_HL_TERM_TO_EL_TERM = makeSymbol("CAREFUL-HL-TERM-TO-EL-TERM");
  public static final SubLSymbol $kw12$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLSymbol $sym13$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym14$EXPRESSION_COUNT_HELPER = makeSymbol("EXPRESSION-COUNT-HELPER");
  public static final SubLSymbol $sym15$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym16$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym17$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym18$NART_P = makeSymbol("NART-P");
  public static final SubLSymbol $kw19$IGNORE = makeKeyword("IGNORE");
  public static final SubLString $str20$_S_is_not_well_formed_ = makeString("~S is not well formed.");
  public static final SubLSymbol $sym21$CONTAINING_SUBEXPRESSIONS_LAMBDA_FN = makeSymbol("CONTAINING-SUBEXPRESSIONS-LAMBDA-FN");
  public static final SubLSymbol $sym22$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym23$EXPRESSION_FIND_IF = makeSymbol("EXPRESSION-FIND-IF");
  public static final SubLSymbol $sym24$LISTP = makeSymbol("LISTP");
  public static final SubLInteger $int25$212 = makeInteger(212);
  public static final SubLSymbol $kw26$TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
  public static final SubLObject $const27$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLObject $const28$ExpandSubLFn = constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn"));
  public static final SubLSymbol $sym29$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym30$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym31$PERMUTE_LIST_CACHED = makeSymbol("PERMUTE-LIST-CACHED");
  public static final SubLSymbol $sym32$_PERMUTE_LIST_CACHED_CACHING_STATE_ = makeSymbol("*PERMUTE-LIST-CACHED-CACHING-STATE*");
  public static final SubLSymbol $kw33$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list34 = list(NIL);
  public static final SubLList $list35 = list(makeSymbol("FRONT1"), makeSymbol("REST1"));
  public static final SubLList $list36 = list(makeSymbol("FRONT2"), makeSymbol("REST2"));
  public static final SubLSymbol $sym37$DEFAULT_EL_VAR_ = makeSymbol("DEFAULT-EL-VAR?");
  public static final SubLSymbol $sym38$RENAMED_DEFAULT_EL_VAR_P = makeSymbol("RENAMED-DEFAULT-EL-VAR-P");
  public static final SubLString $str39$_RENAMED_VAR = makeString("?RENAMED-VAR");
  public static final SubLObject $const40$CollectionIntersectionFn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersectionFn"));
  public static final SubLObject $const41$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersection2Fn"));
  public static final SubLObject $const42$CollectionUnionFn = constant_handles.reader_make_constant_shell(makeString("CollectionUnionFn"));
  public static final SubLObject $const43$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLSymbol $sym44$CONSTANT_EXTERNAL_ID__ = makeSymbol("CONSTANT-EXTERNAL-ID-<");
  public static final SubLSymbol $sym45$CONSTANT_EXTERNAL_ID = makeSymbol("CONSTANT-EXTERNAL-ID");
  public static final SubLSymbol $sym46$_ = makeSymbol("<");
  public static final SubLSymbol $sym47$CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");
  public static final SubLSymbol $sym48$NART_ID = makeSymbol("NART-ID");
  public static final SubLSymbol $sym49$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym50$FORT_INTERNAL_ID = makeSymbol("FORT-INTERNAL-ID");
  public static final SubLSymbol $sym51$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");
  public static final SubLObject $const52$functionalInArgs = constant_handles.reader_make_constant_shell(makeString("functionalInArgs"));
  public static final SubLObject $const53$strictlyFunctionalInArgs = constant_handles.reader_make_constant_shell(makeString("strictlyFunctionalInArgs"));
  public static final SubLSymbol $sym54$FUNCTIONAL_IN_ARG_POSITIONS = makeSymbol("FUNCTIONAL-IN-ARG-POSITIONS");
  public static final SubLSymbol $sym55$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLInteger $int56$100 = makeInteger(100);
  public static final SubLSymbol $sym57$OPAQUE_ARG_WRT_NAT_REIFICATION_ = makeSymbol("OPAQUE-ARG-WRT-NAT-REIFICATION?");
  public static final SubLSymbol $sym58$NART_LOOKUP = makeSymbol("NART-LOOKUP");
  public static final SubLSymbol $sym59$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym60$EL_FIND_IF_NART = makeSymbol("EL-FIND-IF-NART");
  public static final SubLSymbol $sym61$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLObject $const62$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLObject $const63$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLSymbol $sym64$NEGATED_ = makeSymbol("NEGATED?");
  public static final SubLList $list65 = list(makeSymbol("FORM"));
  public static final SubLString $str66$Assuming_FORM_is_a_valid_CycL_for = makeString("Assuming FORM is a valid CycL formula, return T IFF it is negated.");
  public static final SubLList $list67 = list(list(makeSymbol("FORM"), makeSymbol("EL-FORMULA-P")));
  public static final SubLList $list68 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym69$NEGATE = makeSymbol("NEGATE");
  public static final SubLString $str70$Assuming_FORM_is_a_valid_CycL_for = makeString("Assuming FORM is a valid CycL formula, return a negated version of it.");
  public static final SubLList $list71 = list(makeSymbol("EL-FORMULA-P"));
  public static final SubLSymbol $sym72$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $kw73$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym74$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym75$FORMULA_OPERATOR = makeSymbol("FORMULA-OPERATOR");
  public static final SubLSymbol $sym76$CYCL_SENTENCE_P = makeSymbol("CYCL-SENTENCE-P");
  public static final SubLSymbol $kw77$INCLUDE = makeKeyword("INCLUDE");
  public static final SubLString $str78$formula_terms_int_got_a_non_el_va = makeString("formula-terms-int got a non-el-variable or cons: ~A~%");
  public static final SubLSymbol $sym79$POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");
  public static final SubLSymbol $sym80$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLObject $const81$FormulaArgPositionFn = constant_handles.reader_make_constant_shell(makeString("FormulaArgPositionFn"));
  public static final SubLSymbol $sym82$ARG_POSITION_P = makeSymbol("ARG-POSITION-P");
  public static final SubLSymbol $sym83$CYCL_ARG_POSITION_P = makeSymbol("CYCL-ARG-POSITION-P");
  public static final SubLSymbol $sym84$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");

  //// Initializers

  public void declareFunctions() {
    declare_cycl_utilities_file();
  }

  public void initializeVariables() {
    init_cycl_utilities_file();
  }

  public void runTopLevelForms() {
    setup_cycl_utilities_file();
  }

}
