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

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class el_utilities extends SubLTranslatedFile {

  //// Constructor

  private el_utilities() {}
  public static final SubLFile me = new el_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.el_utilities";

  //// Definitions

  /** @return boolean; t iff OBJECT is a formula whose arg0 is OPERATOR */
  @SubL(source = "cycl/el-utilities.lisp", position = 1634) 
  public static final SubLObject el_formula_with_operator_p(SubLObject formula, SubLObject operator) {
    return makeBoolean(((NIL != el_formula_p(formula))
           && operator.equal(cycl_utilities.formula_arg0(formula))));
  }



  /** @return boolean; t iff the instances of COLLECTION are constrained to be CycL formulas. */
  @SubL(source = "cycl/el-utilities.lisp", position = 135680) 
  public static final SubLObject formula_denoting_collectionP(SubLObject collection) {
    return genls.genlP(collection, $const127$CycLFormula, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
  }

  /** @return boolean; t iff the instances of COLLECTION are constrained to be CycL sentences. */
  @SubL(source = "cycl/el-utilities.lisp", position = 135973) 
  public static final SubLObject sentence_denoting_collectionP(SubLObject collection) {
    return genls.genlP(collection, $const128$CycLSentence, mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
  }

  
  /** @return boolean; t iff OBJECT is one of the user-defined bounded logical operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 12445) 
  public static final SubLObject user_defined_logical_operator_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
           && (NIL == cyc_const_logical_operator_p(object))
           && (NIL != fort_types_interface.logical_connective_p(object))));
  }

  
  /** @return boolean; t iff OBJECT is a unary formula whose arg0 is the constant #$not.
   The formula is not required to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 2197) 
  public static final SubLObject el_negation_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const0$not))
           && (NIL != el_unary_formula_p(object))));
  }

  public static final class $el_negation_p$UnaryFunction extends UnaryFunction {
    public $el_negation_p$UnaryFunction() { super(extractFunctionNamed("EL-NEGATION-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_negation_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is a formula whose arg0 is the constant #$or.
   The formula is not required to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 2501) 
  public static final SubLObject el_disjunction_p(SubLObject object) {
    return el_formula_with_operator_p(object, $const1$or);
  }

  public static final class $el_disjunction_p$UnaryFunction extends UnaryFunction {
    public $el_disjunction_p$UnaryFunction() { super(extractFunctionNamed("EL-DISJUNCTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_disjunction_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is a formula whose arg0 is the constant #$and.
   The formula is not required to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 2759) 
  public static final SubLObject el_conjunction_p(SubLObject object) {
    return el_formula_with_operator_p(object, $const2$and);
  }

  public static final class $el_conjunction_p$UnaryFunction extends UnaryFunction {
    public $el_conjunction_p$UnaryFunction() { super(extractFunctionNamed("EL-CONJUNCTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_conjunction_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is an implication, i.e. a binary formula whose arg0 is #$implies.
   Note that OBJECT does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 3248) 
  public static final SubLObject el_implication_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const3$implies))
           && (NIL != el_binary_formula_p(object))));
  }

  /** Return T iff OBJECT is a Cyc EL implication operator (#$implies or #$equiv). */
  @SubL(source = "cycl/el-utilities.lisp", position = 4104) 
  public static final SubLObject cyc_const_general_implication_operator_p(SubLObject object) {
    return makeBoolean((($const3$implies == object)
          || ($const4$equiv == object)));
  }

  /** @return boolean; t iff OBJECT is an implicative formula, i.e. a binary formula whose arg0 is #$implies or #$equiv.
   Note that OBJECT does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 4313) 
  public static final SubLObject el_general_implication_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != cyc_const_general_implication_operator_p(cycl_utilities.formula_arg0(object)))
           && (NIL != el_binary_formula_p(object))));
  }

  /** @return boolean; t iff OBJECT is a universally quantified formula, i.e. one whose arg0 is #$forAll.
   Note that OBJECT does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 4954) 
  public static final SubLObject el_universal_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const6$forAll))
           && (NIL != el_binary_formula_p(object))
           && (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(object, UNPROVIDED)))));
  }

  /** Like @xref el-universal-p but admits more terms as variables, e.g. HL variables. */
  @SubL(source = "cycl/el-utilities.lisp", position = 5285) 
  public static final SubLObject cycl_universal_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const6$forAll))
           && (NIL != el_binary_formula_p(object))
           && (NIL != cycl_variables.cyc_varP(cycl_utilities.formula_arg1(object, UNPROVIDED)))));
  }

  /** @return boolean; t iff OBJECT is an existentially quantified formula, i.e. one whose arg0 is #$thereExists,
   whose arg1 is an el variable, and also has an arg2.
   Note that arg2 does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 5547) 
  public static final SubLObject el_existential_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const7$thereExists))
           && (NIL != el_binary_formula_p(object))
           && (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(object, UNPROVIDED)))));
  }

  /** @return boolean; t iff OBJECT is a ternary formula whose arg0 is #$thereExistAtLeast.
   Note that OBJECT does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 5946) 
  public static final SubLObject el_existential_min_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const8$thereExistAtLeast))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30544"))));
  }

  /** @return boolean; t iff OBJECT is a ternary formula whose arg0 is #$thereExistAtMost.
   Note that OBJECT does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 6243) 
  public static final SubLObject el_existential_max_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const9$thereExistAtMost))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30545"))));
  }

  /** @return boolean; t iff OBJECT is a ternary formula whose arg0 is #$thereExistExactly.
   Note that OBJECT does not need to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 6538) 
  public static final SubLObject el_existential_exact_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const10$thereExistExactly))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30546"))));
  }

  /** used in the syntax checker */
  @SubL(source = "cycl/el-utilities.lisp", position = 6837) 
  public static SubLSymbol $cyc_const_unary_logical_ops$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined unary operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 6932) 
  public static final SubLObject cyc_const_unary_logical_op_p(SubLObject object) {
    return Equality.eq(object, $const0$not);
  }

  /** used in the syntax checker */
  @SubL(source = "cycl/el-utilities.lisp", position = 7161) 
  public static SubLSymbol $cyc_const_binary_logical_ops$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined binary operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 7275) 
  public static final SubLObject cyc_const_binary_logical_op_p(SubLObject object) {
    return makeBoolean(((object == $const3$implies)
          || (object == $const5$xor)
          || (object == $const4$equiv)));
  }

  /** used in the syntax checker */
  @SubL(source = "cycl/el-utilities.lisp", position = 7565) 
  public static SubLSymbol $cyc_const_ternary_logical_ops$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined ternary operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 7653) 
  public static final SubLObject cyc_const_ternary_logical_op_p(SubLObject object) {
    return NIL;
  }

  /** used in the syntax checker */
  @SubL(source = "cycl/el-utilities.lisp", position = 7892) 
  public static SubLSymbol $cyc_const_quaternary_logical_ops$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined quaternary operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 7983) 
  public static final SubLObject cyc_const_quaternary_logical_op_p(SubLObject object) {
    return NIL;
  }

  /** used in the syntax checker */
  @SubL(source = "cycl/el-utilities.lisp", position = 8231) 
  public static SubLSymbol $cyc_const_quintary_logical_ops$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined quintary operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 8320) 
  public static final SubLObject cyc_const_quintary_logical_op_p(SubLObject object) {
    return NIL;
  }

  /** used in the syntax checker */
  @SubL(source = "cycl/el-utilities.lisp", position = 8562) 
  public static SubLSymbol $cyc_const_variable_arity_logical_ops$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined variable-arity operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 8671) 
  public static final SubLObject cyc_const_variable_arity_logical_op_p(SubLObject object) {
    return makeBoolean(((object == $const2$and)
          || (object == $const1$or)));
  }

  /** @return boolean; t iff OBJECT is #$thereExists. */
  @SubL(source = "cycl/el-utilities.lisp", position = 8955) 
  public static final SubLObject cyc_const_existential_p(SubLObject object) {
    return Equality.eq(object, $const7$thereExists);
  }

  /** @return boolean; t iff OBJECT is #$forAll. */
  @SubL(source = "cycl/el-utilities.lisp", position = 9091) 
  public static final SubLObject cyc_const_universal_p(SubLObject object) {
    return Equality.eq(object, $const6$forAll);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 9215) 
  public static SubLSymbol $cyc_const_regular_quantifiers$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined regular quantifiers. */
  @SubL(source = "cycl/el-utilities.lisp", position = 9299) 
  public static final SubLObject cyc_const_regular_quantifier_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_existential_p(object))
          || (NIL != cyc_const_universal_p(object))));
  }

  /** @return boolean; t iff OBJECT is a binary sentence whose arg0 is one of the predefined regular quantifiers (#$forAll or #$thereExists). */
  @SubL(source = "cycl/el-utilities.lisp", position = 9595) 
  public static final SubLObject possibly_el_regularly_quantified_sentence_p(SubLObject object) {
    return makeBoolean(((NIL != el_binary_formula_p(object))
           && (NIL != cyc_const_regular_quantifier_p(cycl_utilities.sentence_arg0(object)))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 9911) 
  public static SubLSymbol $cyc_const_bounded_existentials$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined bounded existentials. */
  @SubL(source = "cycl/el-utilities.lisp", position = 10033) 
  public static final SubLObject cyc_const_bounded_existential_operator_p(SubLObject object) {
    return makeBoolean(((object == $const10$thereExistExactly)
          || (object == $const9$thereExistAtMost)
          || (object == $const8$thereExistAtLeast)));
  }

  /** @return boolean; t iff OBJECT is one of the user-defined bounded existential quantifiers. */
  @SubL(source = "cycl/el-utilities.lisp", position = 10375) 
  public static final SubLObject user_defined_bounded_existential_operator_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
           && (NIL == cyc_const_bounded_existential_operator_p(object))
           && (NIL != fort_types_interface.bounded_existential_quantifier_p(object))));
  }

  /** @return boolean; t iff OBJECT is a ternary formula whose arg0 is one of the predefined bounded existential quantifiers. */
  @SubL(source = "cycl/el-utilities.lisp", position = 10681) 
  public static final SubLObject el_bounded_existential_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != cyc_const_bounded_existential_operator_p(cycl_utilities.formula_arg0(object)))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30547"))));
  }

  /** @return boolean; t iff OBJECT is one of the predefined existentials, either regular or bounded. */
  @SubL(source = "cycl/el-utilities.lisp", position = 11000) 
  public static final SubLObject cyc_const_general_existential_operator_p(SubLObject object) {
    return makeBoolean(((object == $const7$thereExists)
          || (NIL != cyc_const_bounded_existential_operator_p(object))));
  }

  public static final class $cyc_const_general_existential_operator_p$UnaryFunction extends UnaryFunction {
    public $cyc_const_general_existential_operator_p$UnaryFunction() { super(extractFunctionNamed("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return cyc_const_general_existential_operator_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is one of the predefined quantifiers, either regular or bounded. */
  @SubL(source = "cycl/el-utilities.lisp", position = 11493) 
  public static final SubLObject cyc_const_quantifier_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_regular_quantifier_p(object))
          || (NIL != cyc_const_bounded_existential_operator_p(object))));
  }

  /** @return boolean; t iff OBJECT is either a regularly quantified formula or a bounded existential formula. */
  @SubL(source = "cycl/el-utilities.lisp", position = 11750) 
  public static final SubLObject possibly_el_quantified_sentence_p(SubLObject object) {
    return makeBoolean(((NIL != possibly_el_regularly_quantified_sentence_p(object))
          || (NIL != el_bounded_existential_p(object))));
  }

  /** @return boolean; t iff OBJECT is any of the predefined logical operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 12025) 
  public static final SubLObject cyc_const_logical_operator_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_unary_logical_op_p(object))
          || (NIL != cyc_const_binary_logical_op_p(object))
          || (NIL != cyc_const_ternary_logical_op_p(object))
          || (NIL != cyc_const_quaternary_logical_op_p(object))
          || (NIL != cyc_const_quintary_logical_op_p(object))
          || (NIL != cyc_const_variable_arity_logical_op_p(object))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 12883) 
  public static SubLSymbol $cyc_const_tense_operators$ = null;

  @SubL(source = "cycl/el-utilities.lisp", position = 12982) 
  public static SubLSymbol $cyc_const_metric_tense_operators$ = null;

  @SubL(source = "cycl/el-utilities.lisp", position = 13070) 
  public static final SubLObject cyc_const_tense_operator_p(SubLObject object) {
    return makeBoolean(((object == $const13$was)
          || (object == $const14$hasAlwaysBeen)
          || (object == $const15$willBe)
          || (object == $const16$willAlwaysBe)));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 13316) 
  public static final SubLObject cyc_const_metric_tense_operator_p(SubLObject object) {
    return makeBoolean(((object == $const17$was_Metric)
          || (object == $const18$willBe_Metric)));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 13525) 
  public static final SubLObject cyc_const_generalized_tense_operator_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_tense_operator_p(object))
          || (NIL != cyc_const_metric_tense_operator_p(object))));
  }

  /** @return boolean; t iff OBJECT is any of the predefined logical operators or quantifiers,
either regular or bounded. */
  @SubL(source = "cycl/el-utilities.lisp", position = 13688) 
  public static final SubLObject cyc_const_sentential_relation_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_logical_operator_p(object))
          || (NIL != cyc_const_quantifier_p(object))));
  }

  /** @return boolean; t iff OBJECT is an EL formula with a logical operator as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 13955) 
  public static final SubLObject el_logical_operator_formula_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != cyc_const_logical_operator_p(cycl_utilities.formula_operator(object)))));
  }

  /** @return boolean; t iff OBJECT is a formula of arity 1.
   OBJECT is not required to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 14459) 
  public static final SubLObject el_unary_formula_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != formula_arityE(object, ONE_INTEGER, UNPROVIDED))));
  }

  /** @return boolean; t iff OBJECT is a formula of arity 2.
   OBJECT is not required to be well-formed. */
  @SubL(source = "cycl/el-utilities.lisp", position = 14677) 
  public static final SubLObject el_binary_formula_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != formula_arityE(object, TWO_INTEGER, UNPROVIDED))));
  }

  /** @return boolean; t iff OBJECT is an escape to SubL,
   which should not be analyzed recursively. */
  @SubL(source = "cycl/el-utilities.lisp", position = 15339) 
  public static final SubLObject subl_escape_p(SubLObject object) {
    if ((NIL != el_formula_p(object))) {
      return makeBoolean(((NIL != expand_subl_fn_p(object))
            || (NIL != subl_quote_p(object))));
    }
    return NIL;
  }

  /** @return boolean; t iff OBJECT is an escape to SubL using #$ExpandSubLFn */
  @SubL(source = "cycl/el-utilities.lisp", position = 15709) 
  public static final SubLObject expand_subl_fn_p(SubLObject object) {
    return makeBoolean((($const19$ExpandSubLFn == cycl_utilities.formula_operator(object))
           && (NIL != formula_arityE(object, TWO_INTEGER, UNPROVIDED))
           && cycl_utilities.formula_arg1(object, UNPROVIDED).isList()
           && (NIL != collection_defns.cyc_subl_template(cycl_utilities.formula_arg2(object, UNPROVIDED)))));
  }

  public static final class $expand_subl_fn_p$UnaryFunction extends UnaryFunction {
    public $expand_subl_fn_p$UnaryFunction() { super(extractFunctionNamed("EXPAND-SUBL-FN-P")); }
    public SubLObject processItem(SubLObject arg1) { return expand_subl_fn_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is an escape to SubL using #$SubLQuoteFn */
  @SubL(source = "cycl/el-utilities.lisp", position = 16002) 
  public static final SubLObject subl_quote_p(SubLObject object) {
    return makeBoolean((($const20$SubLQuoteFn == cycl_utilities.formula_operator(object))
           && (NIL != formula_arityE(object, ONE_INTEGER, UNPROVIDED))
           && (NIL != collection_defns.cyc_subl_template(cycl_utilities.formula_arg1(object, UNPROVIDED)))));
  }

  /** @return boolean; t iff OBJECT is NIL (epsilon) */
  @SubL(source = "cycl/el-utilities.lisp", position = 16646) 
  public static final SubLObject epsilon_p(SubLObject object) {
    return Types.sublisp_null(object);
  }

  /** used in the precanonicalizer */
  @SubL(source = "cycl/el-utilities.lisp", position = 16755) 
  public static SubLSymbol $cyc_const_exception_operators$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined exception operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 16872) 
  public static final SubLObject cyc_const_exception_operator_p(SubLObject object) {
    return makeBoolean(((object == $const22$exceptFor)
          || (object == $const23$exceptWhen)));
  }

  /** Assumes that all exception operators are binary.
   @return boolean; t iff OBJECT is a binary formula whose arg0 is one of the predefined exception operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 17151) 
  public static final SubLObject el_exception_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_exception_operator_p(cycl_utilities.formula_operator(object)))
           && (NIL != el_binary_formula_p(object))));
  }

  /** used in the precanonicalizer */
  @SubL(source = "cycl/el-utilities.lisp", position = 17725) 
  public static SubLSymbol $cyc_const_pragmatic_requirement_operators$ = null;

  /** @return boolean; t iff OBJECT is one of the predefined exception operators. */
  @SubL(source = "cycl/el-utilities.lisp", position = 17852) 
  public static final SubLObject cyc_const_pragmatic_requirement_operator_p(SubLObject object) {
    return Equality.eq(object, $const25$pragmaticRequirement);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 18130) 
  public static final SubLObject el_pragmatic_requirement_p(SubLObject object) {
    return makeBoolean(((NIL != cyc_const_pragmatic_requirement_operator_p(cycl_utilities.formula_operator(object)))
           && (NIL != el_binary_formula_p(object))));
  }

  /** Assumes that #$meetsPragmaticRequirement is a binary operator.
   @return boolean; t iff OBJECT is a binary formula whose arg0 is #$meetsPragmaticRequirement. */
  @SubL(source = "cycl/el-utilities.lisp", position = 18304) 
  public static final SubLObject el_meets_pragmatic_requirement_p(SubLObject object) {
    return makeBoolean(((NIL != el_binary_formula_p(object))
           && ($const26$meetsPragmaticRequirement == cycl_utilities.formula_operator(object))));
  }

  public static final class $el_meets_pragmatic_requirement_p$UnaryFunction extends UnaryFunction {
    public $el_meets_pragmatic_requirement_p$UnaryFunction() { super(extractFunctionNamed("EL-MEETS-PRAGMATIC-REQUIREMENT-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_meets_pragmatic_requirement_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is an EL sentence which indicates an implicit
meta-literal.  The two kinds of EL sentences which indicate implicit
meta-literals are EL exceptions (e.g. #$exceptWhen, #$exceptFor) and
pragmatic requirements (#$pragmaticRequirement). */
  @SubL(source = "cycl/el-utilities.lisp", position = 18913) 
  public static final SubLObject el_implicit_meta_literal_sentence_p(SubLObject object) {
    return makeBoolean(((NIL != el_exception_p(object))
          || (NIL != el_pragmatic_requirement_p(object))));
  }

  public static final class $el_implicit_meta_literal_sentence_p$UnaryFunction extends UnaryFunction {
    public $el_implicit_meta_literal_sentence_p$UnaryFunction() { super(extractFunctionNamed("EL-IMPLICIT-META-LITERAL-SENTENCE-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_implicit_meta_literal_sentence_p(arg1); }
  }

  /** @return boolean; t iff OBJECT is a candidate EL formula (not necessarily well-formed).
   'formula' refers to a formula in the grammar, not a formula in the logic. 
   For example, a non-atomic term is a formula in the grammar, but not a formula in the logic.
   note that #$True and #$False are not considered formulas by this definition. */
  @SubL(source = "cycl/el-utilities.lisp", position = 19321) 
  public static final SubLObject elf_p(SubLObject object) {
    return Types.consp(object);
  }

  /** @return boolean; t iff OBJECT is a candidate EL formula (not necessarily well-formed).
   'formula' refers to a formula in the grammar, not a formula in the logic. 
   For example, a non-atomic term is a formula in the grammar, but not a formula in the logic.
   note that #$True and #$False are not considered formulas by this definition. */
  @SubL(source = "cycl/el-utilities.lisp", position = 19789) 
  public static final SubLObject el_formula_p(SubLObject object) {
    return elf_p(object);
  }

  public static final class $el_formula_p$UnaryFunction extends UnaryFunction {
    public $el_formula_p$UnaryFunction() { super(extractFunctionNamed("EL-FORMULA-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_formula_p(arg1); }
  }

  /** A quick test for whether OBJECT could possibly be a first order naut.
   It is certainly not guaranteed that OBJECT is a first order naut just because this function returns t.
@owner murray */
  @SubL(source = "cycl/el-utilities.lisp", position = 20266) 
  public static final SubLObject possibly_fo_naut_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != forts.fort_p(cycl_utilities.el_formula_operator(object)))));
  }

  /** A quick test for whether OBJECT could possibly be a naut.
   It is certainly not guaranteed that OBJECT is a naut just because this function returns t. */
  @SubL(source = "cycl/el-utilities.lisp", position = 21212) 
  public static final SubLObject possibly_naut_p(SubLObject object) {
    return el_formula_p(object);
  }

  /** A quick test for whether OBJECT could possibly be a CycL sentence.
   It is certainly not guaranteed that OBJECT is a CycL sentence just because this function returns t.
   Passing this test should guarantee that applying the sentence accessors will not trigger an error. */
  @SubL(source = "cycl/el-utilities.lisp", position = 21440) 
  public static final SubLObject possibly_sentence_p(SubLObject object) {
    return el_formula_p(object);
  }

  /** A quick test for whether OBJECT could possibly be an atomic CycL sentence.
   It is certainly not guaranteed that OBJECT is an atomic CycL sentence just because this function returns t. */
  @SubL(source = "cycl/el-utilities.lisp", position = 22670) 
  public static final SubLObject possibly_atomic_sentence_p(SubLObject object) {
    return el_formula_p(object);
  }

  /** @return boolean; t iff OBJECT is an EL formula which contains an EL subformula. */
  @SubL(source = "cycl/el-utilities.lisp", position = 22943) 
  public static final SubLObject contains_subformula_p(SubLObject object) {
    if ((NIL != el_formula_p(object))) {
      {
        SubLObject terms = cycl_utilities.formula_terms(object, $kw28$IGNORE);
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
          if ((NIL != el_formula_p(v_term))) {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 25423) 
  public static final SubLObject el_empty_list_p(SubLObject obj) {
    return makeBoolean(((obj == $const32$TheEmptyList)
          || ((NIL != el_formula_p(obj))
             && (NIL == formula_with_sequence_varP(obj))
             && (cycl_utilities.formula_operator(obj) == $const30$TheList)
             && (NIL == cycl_utilities.formula_args(obj, UNPROVIDED)))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 26007) 
  public static final SubLObject el_extensional_set_p(SubLObject object) {
    return makeBoolean(((NIL != el_empty_set_p(object))
          || (NIL != el_non_empty_set_p(object))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 26125) 
  public static final SubLObject el_empty_set_p(SubLObject object) {
    return makeBoolean(((object == $const33$TheEmptySet)
          || ((NIL != el_formula_p(object))
             && (NIL == formula_with_sequence_varP(object))
             && (cycl_utilities.formula_operator(object) == $const34$TheSet)
             && (NIL == cycl_utilities.formula_args(object, UNPROVIDED)))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 26391) 
  public static final SubLObject el_non_empty_set_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (cycl_utilities.formula_operator(object) == $const34$TheSet)
           && (NIL != cycl_utilities.formula_args(object, $kw31$INCLUDE))));
  }

  /** @return boolean; t iff OBJECT is an el sequence. */
  @SubL(source = "cycl/el-utilities.lisp", position = 27706) 
  public static final SubLObject el_sequence_p(SubLObject object) {
    return Types.consp(object);
  }

  /** Returns whether EXPRESSION is free of any variables? */
  @SubL(source = "cycl/el-utilities.lisp", position = 28319) 
  public static final SubLObject groundP(SubLObject expression, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    return Types.sublisp_null(cycl_utilities.expression_find_if(varP, expression, NIL, UNPROVIDED));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 28548) 
  public static final SubLObject hl_ground_tree_p(SubLObject tree) {
    return variables.fully_bound_p(tree);
  }

  /** is EXPRESSION free of any free variables? (includes ground? check for efficiency) */
  @SubL(source = "cycl/el-utilities.lisp", position = 28618) 
  public static final SubLObject closedP(SubLObject expression, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    return makeBoolean(((NIL != groundP(expression, varP))
          || (NIL != no_free_variablesP(expression, varP))));
  }

  /** is EXPRESSION free of any free variables? (excludes ground? check for efficiency) */
  @SubL(source = "cycl/el-utilities.lisp", position = 28852) 
  public static final SubLObject no_free_variablesP(SubLObject expression, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    return Types.sublisp_null(literal_free_variables(expression, NIL, varP, UNPROVIDED));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 33138) 
  private static SubLSymbol $standard_single_letter_el_var_names$ = null;

  /** Returns the sequence term in FORMULA, if there is one.  Otherwise returns NIL.
   For example, (sequence-term (<pred> ?X ?Y . <term>)) returns <term>.
   However, it will not return nested sequence terms;
   i.e. (sequence-var (#$and <form1> (<pred> ?X ?Y . <term>))) will return NIL.
   @owner pace */
  @SubL(source = "cycl/el-utilities.lisp", position = 36644) 
  public static final SubLObject sequence_term(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$el_supports_dot_syntaxP$.getDynamicValue(thread))) {
        if ((NIL != el_formula_p(formula))) {
          return conses_high.last(formula, UNPROVIDED).rest();
        } else if ((NIL != nart_handles.nart_p(formula))) {
          return NIL;
        }
      }
      return NIL;
    }
  }

  /** Returns the sequence variable in RELATION, if there is one.  Otherwise returns NIL.
   For example, (sequence-var (<pred> ?X ?Y . ?Z)) returns ?Z.
   However, it will not return nested sequence variables;
   i.e. (sequence-var (#$and <form1> (<pred> ?X ?Y . ?Z))) will return NIL.
   @owner pace */
  @SubL(source = "cycl/el-utilities.lisp", position = 37224) 
  public static final SubLObject sequence_var(SubLObject relation, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    {
      SubLObject seqterm = sequence_term(relation);
      if ((NIL == seqterm)) {
        return NIL;
      }
      if ((varP == $sym39$CYC_VAR_)) {
        if ((NIL != cycl_variables.cyc_varP(seqterm))) {
          return seqterm;
        } else {
          return NIL;
        }
      } else {
        if ((NIL != Functions.funcall(varP, seqterm))) {
          return seqterm;
        } else {
          return NIL;
        }
      }
    }
  }

  /** Returns the part of RELATION that should be a sequence variable by its syntax, but isn't.
   Returns NIL if there is no such ill-formed thing in RELATION. */
  @SubL(source = "cycl/el-utilities.lisp", position = 37932) 
  public static final SubLObject sequence_non_var(SubLObject relation, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    {
      SubLObject seqterm = sequence_term(relation);
      if ((NIL == seqterm)) {
        return NIL;
      }
      if ((NIL != Functions.funcall(varP, seqterm))) {
        return NIL;
      } else {
        return seqterm;
      }
    }
  }

  /** @return formula; formula with SEQVAR added to the end, if SEQVAR is non-nil.  Otherwise returns FORMULA unadulterated.
   @example (maybe-add-sequence-var-to-end ?X (#$different #$Muffet #$Pace)) (#$different #$Muffet #$Pace . ?X)
   @example (maybe-add-sequence-var-to-end NIL (#$different #$Muffet #$Pace)) (#$different #$Muffet #$Pace) */
  @SubL(source = "cycl/el-utilities.lisp", position = 38348) 
  public static final SubLObject maybe_add_sequence_var_to_end(SubLObject seqvar, SubLObject formula) {
    return ((NIL != seqvar) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9016")) : formula);
  }

  /** @owner pace */
  @SubL(source = "cycl/el-utilities.lisp", position = 39667) 
  public static final SubLObject formula_with_sequence_termP(SubLObject formula) {
    return list_utilities.sublisp_boolean(sequence_term(formula));
  }

  public static final class $formula_with_sequence_termP$UnaryFunction extends UnaryFunction {
    public $formula_with_sequence_termP$UnaryFunction() { super(extractFunctionNamed("FORMULA-WITH-SEQUENCE-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return formula_with_sequence_termP(arg1); }
  }

  /** @owner ecoppock */
  @SubL(source = "cycl/el-utilities.lisp", position = 39780) 
  public static final SubLObject el_formula_without_sequence_termP(SubLObject formula) {
    return list_utilities.proper_list_p(formula);
  }

  /** @owner pace */
  @SubL(source = "cycl/el-utilities.lisp", position = 39994) 
  public static final SubLObject formula_with_sequence_varP(SubLObject formula) {
    return list_utilities.sublisp_boolean(sequence_var(formula, UNPROVIDED));
  }

  /** @return boolean; t iff FORMULA contains something in sequence variable position,
   but it's not a variable.
   @owner pace */
  @SubL(source = "cycl/el-utilities.lisp", position = 40105) 
  public static final SubLObject formula_with_sequence_non_varP(SubLObject formula) {
    return list_utilities.sublisp_boolean(sequence_non_var(formula, UNPROVIDED));
  }

  /** e.g. transforms (<pred> ?X ?Y . ?Z) into (<pred> ?X ?Y)
   @owner pace */
  @SubL(source = "cycl/el-utilities.lisp", position = 40336) 
  public static final SubLObject ignore_sequence_vars(SubLObject formula) {
    return ((NIL != sequence_var(formula, UNPROVIDED)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30664")) : formula);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 41650) 
  public static final SubLObject term_is_one_of_argsP(SubLObject v_term, SubLObject formula) {
    {
      SubLObject resultP = NIL;
      SubLObject args = cycl_utilities.formula_args(formula, $kw28$IGNORE);
      SubLObject rest = NIL;
      for (rest = args; (!(((NIL != resultP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject arg = rest.first();
          if (v_term.equal(arg)) {
            resultP = T;
          }
        }
      }
      return resultP;
    }
  }

  /** returns the arity of FORMULA (the number of arguments).
   This will be an integer if FORMULA is an EL formula, NART or assertion,
   and NIL otherwise (e.g. the arity of #$True is NIL.)
   The operator itself does not count as an argument.
   If seqvar-handling is :regularize, then sequence variables count as a single argument.
   Hence, (#$and <form1> <form2> <form3>) is a formula of arity 3,
   and (#$and <form1> <form2> <form3> . ?SEQ) is a formula of arity 4.
   If seqvar-handling is :ignore, then sequence variables don't count, so both of those would be arity 3.
   Don't pass it :include. */
  @SubL(source = "cycl/el-utilities.lisp", position = 41970) 
  public static final SubLObject formula_arity(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    if ((NIL != cycl_utilities.possibly_cycl_formula_p(formula))) {
      return Sequences.length(cycl_utilities.formula_args(formula, seqvar_handling));
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 43532) 
  public static final SubLObject expression_arity(SubLObject relational_expression, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return formula_arity(relational_expression, seqvar_handling);
  }

  /** @return integer; the length of the formula.
   In other words, the number of terms.  This is one greater than the arity.
   If seqvar-handling is :regularize, then sequence variables count as a single argument.
   If seqvar-handling is :ignore, then sequence variables don't count at all. */
  @SubL(source = "cycl/el-utilities.lisp", position = 43688) 
  public static final SubLObject formula_length(SubLObject formula, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return Sequences.length(cycl_utilities.formula_terms(formula, seqvar_handling));
  }

  /** @return boolean; T iff FORMULA's arity is less than ARITY. */
  @SubL(source = "cycl/el-utilities.lisp", position = 44116) 
  public static final SubLObject formula_arityL(SubLObject formula, SubLObject v_arity, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return makeBoolean(((NIL != cycl_utilities.possibly_cycl_formula_p(formula))
           && (NIL != subl_promotions.positive_integer_p(v_arity))
           && (NIL != list_utilities.lengthL(cycl_utilities.formula_args(formula, seqvar_handling), v_arity, NIL))));
  }

  /** @return boolean; T iff FORMULA's arity is greater than ARITY. */
  @SubL(source = "cycl/el-utilities.lisp", position = 44708) 
  public static final SubLObject formula_arityG(SubLObject formula, SubLObject v_arity, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return makeBoolean(((NIL != cycl_utilities.possibly_cycl_formula_p(formula))
           && v_arity.isInteger()
           && (NIL != list_utilities.lengthG(cycl_utilities.formula_args(formula, seqvar_handling), v_arity, NIL))));
  }

  /** @return boolean; T iff FORMULA's arity is greater than or equal to ARITY. */
  @SubL(source = "cycl/el-utilities.lisp", position = 44995) 
  public static final SubLObject formula_arityGE(SubLObject formula, SubLObject v_arity, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return makeBoolean(((NIL != cycl_utilities.possibly_cycl_formula_p(formula))
           && v_arity.isInteger()
           && (NIL != list_utilities.lengthGE(cycl_utilities.formula_args(formula, seqvar_handling), v_arity, NIL))));
  }

  /** @return boolean; T iff EL-FORMULA's arity is greater than or equal to ARITY. */
  @SubL(source = "cycl/el-utilities.lisp", position = 45296) 
  public static final SubLObject el_formula_arityGE(SubLObject el_formula, SubLObject v_arity, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return makeBoolean(((NIL != el_formula_p(el_formula))
           && v_arity.isInteger()
           && (NIL != list_utilities.lengthGE(cycl_utilities.el_formula_args(el_formula, seqvar_handling), v_arity, NIL))));
  }

  /** @return boolean; T iff FORMULA's arity is equal to ARITY. */
  @SubL(source = "cycl/el-utilities.lisp", position = 45604) 
  public static final SubLObject formula_arityE(SubLObject formula, SubLObject v_arity, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return makeBoolean(((NIL != cycl_utilities.possibly_cycl_formula_p(formula))
           && v_arity.isInteger()
           && (NIL != list_utilities.lengthE(cycl_utilities.formula_args(formula, seqvar_handling), v_arity, NIL))));
  }

  /** returns the first element of SEQUENCE. */
  @SubL(source = "cycl/el-utilities.lisp", position = 48121) 
  public static final SubLObject first_in_sequence(SubLObject sequence) {
    if ((NIL != el_sequence_p(sequence))) {
      return sequence.first();
    }
    return NIL;
  }

  /** returns (as a list or a variable) all elements but the first of SEQUENCE */
  @SubL(source = "cycl/el-utilities.lisp", position = 48507) 
  public static final SubLObject rest_of_sequence(SubLObject sequence) {
    if ((NIL != el_sequence_p(sequence))) {
      return sequence.rest();
    }
    return NIL;
  }

  /** If SENTENCE is a quantified sentence, returns the quantifier.
   Otherwise returns NIL. */
  @SubL(source = "cycl/el-utilities.lisp", position = 48690) 
  public static final SubLObject sentence_quantifier(SubLObject sentence) {
    if ((NIL != possibly_el_quantified_sentence_p(sentence))) {
      return cycl_utilities.sentence_arg0(sentence);
    }
    return NIL;
  }

  /** returns the quantified variable in a quantified sentence.
   returns NIL if SENTENCE is not a quantified sentence.
   e.g. (quantified-var (#$forAll ?X <form1>)) would return ?X.
    and (quantified-var (#$thereExistExactly 539 ?EVENT <form2>)) would return ?EVENT. */
  @SubL(source = "cycl/el-utilities.lisp", position = 48920) 
  public static final SubLObject quantified_var(SubLObject sentence) {
    if ((NIL != cycl_grammar.cycl_bounded_existential_sentence_p(sentence))) {
      return cycl_utilities.sentence_arg2(sentence, UNPROVIDED);
    } else if ((NIL != possibly_el_regularly_quantified_sentence_p(sentence))) {
      return cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
    }
    return NIL;
  }

  /** returns the quantified subsentence in a quantified sentence.
   Yields an error if SENTENCE is not a quantified sentence.
   e.g. (quantified-sub-sentence (#$forAll ?X <form1>)) would return <form1>.
    and (quantified-sub-sentence (#$thereExistExactly 539 ?EVENT <form2>)) would return <form2>. */
  @SubL(source = "cycl/el-utilities.lisp", position = 50171) 
  public static final SubLObject quantified_sub_sentence(SubLObject sentence) {
    if ((NIL != possibly_el_regularly_quantified_sentence_p(sentence))) {
      return cycl_utilities.sentence_arg2(sentence, UNPROVIDED);
    } else if ((NIL != cycl_grammar.cycl_bounded_existential_sentence_p(sentence))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29838");
    } else {
      el_error(FOUR_INTEGER, $str58$not_quantified_sentence___s, sentence, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** @return nil or integerp; the argnum that contains the quantified subsentence of SENTENCE.
   Yields an error and returns NIL if SENTENCE is not a quantified sentence. */
  @SubL(source = "cycl/el-utilities.lisp", position = 50762) 
  public static final SubLObject quantified_sub_sentence_argnum(SubLObject sentence) {
    return quantified_sub_sentence_argnum_for_operator(cycl_utilities.sentence_arg0(sentence));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 51071) 
  public static final SubLObject quantified_sub_sentence_argnum_for_operator(SubLObject operator) {
    if ((NIL != cycl_grammar.cycl_regular_quantifier_p(operator))) {
      return TWO_INTEGER;
    } else if ((NIL != cycl_grammar.cycl_bounded_existential_quantifier_p(operator))) {
      return THREE_INTEGER;
    } else {
      el_error(FOUR_INTEGER, $str57$not_a_known_quantifier___s, operator, UNPROVIDED, UNPROVIDED);
      return NIL;
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 52564) 
  private static SubLSymbol $dont_enforce_subl_escape_in_symbols$ = null;

  /** When OBJECT is a cycl-subl-symbol-p, returns the SubL symbol part. */
  @SubL(source = "cycl/el-utilities.lisp", position = 52628) 
  public static final SubLObject cycl_subl_symbol_symbol(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != collection_defns.cycl_subl_symbol_p(object))) {
        return cycl_utilities.formula_arg1(object, UNPROVIDED);
      }
      if ((NIL != $dont_enforce_subl_escape_in_symbols$.getDynamicValue(thread))) {
        return object;
      }
      return NIL;
    }
  }

  /** Returns an EL formula constructed from the list LIST.
   Currently this just returns the list itself, since we implement
   EL formulas as lists.  You can't destructively modify
   the returned EL formula without affecting LIST. */
  @SubL(source = "cycl/el-utilities.lisp", position = 53755) 
  public static final SubLObject list_to_elf(SubLObject list) {
    checkType(list, $sym66$CONSP);
    return list;
  }

  /** returns a new EL formula with the operator OPERATOR, the arguments ARGS,
   and the optional sequence variable SEQUENCE-VAR.
   This formula is destructible at the top level. */
  @SubL(source = "cycl/el-utilities.lisp", position = 54442) 
  public static final SubLObject make_el_formula(SubLObject operator, SubLObject args, SubLObject sequence_var) {
    if ((sequence_var == UNPROVIDED)) {
      sequence_var = NIL;
    }
    return ((NIL != sequence_var) ? ((SubLObject) ConsesLow.append(cons(operator, conses_high.copy_list(args)), sequence_var)) : cons(operator, conses_high.copy_list(args)));
  }

  /** returns a new EL formula with the operator OPERATOR, the arguments ARGS,
   and the optional sequence variable SEQUENCE-VAR.
   This formula is destructible at the top level. */
  @SubL(source = "cycl/el-utilities.lisp", position = 54820) 
  public static final SubLObject make_formula(SubLObject operator, SubLObject args, SubLObject sequence_var) {
    if ((sequence_var == UNPROVIDED)) {
      sequence_var = NIL;
    }
    return make_el_formula(operator, args, sequence_var);
  }

  /** Returns a copy of the EL formula FORMULA. */
  @SubL(source = "cycl/el-utilities.lisp", position = 55121) 
  public static final SubLObject copy_formula(SubLObject formula) {
    return conses_high.copy_tree(formula);
  }

  /** Returns a copy of the EL sentence SENTENCE */
  @SubL(source = "cycl/el-utilities.lisp", position = 55235) 
  public static final SubLObject copy_sentence(SubLObject sentence) {
    return conses_high.copy_tree(sentence);
  }

  /** Returns a copy of CLAUSE. */
  @SubL(source = "cycl/el-utilities.lisp", position = 55353) 
  public static final SubLObject copy_clause(SubLObject clause) {
    return conses_high.copy_tree(clause);
  }

  /** Returns a copy of EXPRESSION. */
  @SubL(source = "cycl/el-utilities.lisp", position = 55547) 
  public static final SubLObject copy_expression(SubLObject expression) {
    return conses_high.copy_tree(expression);
  }

  /** returns a new EL sentence with the operator PREDICATE and the arguments ARGS.
   This sentence is destructible at the top level. */
  @SubL(source = "cycl/el-utilities.lisp", position = 55658) 
  public static final SubLObject make_el_literal(SubLObject predicate, SubLObject args, SubLObject sequence_var) {
    if ((sequence_var == UNPROVIDED)) {
      sequence_var = NIL;
    }
    return make_el_formula(predicate, args, sequence_var);
  }

  /** returns a new unary formula with the operator OPERATOR and the single argument ARG. */
  @SubL(source = "cycl/el-utilities.lisp", position = 55918) 
  public static final SubLObject make_unary_formula(SubLObject operator, SubLObject arg) {
    return list(operator, arg);
  }

  /** returns a new binary formula with the operator OPERATOR and the two arguments ARG1 and ARG2. */
  @SubL(source = "cycl/el-utilities.lisp", position = 56085) 
  public static final SubLObject make_binary_formula(SubLObject operator, SubLObject arg1, SubLObject arg2) {
    return list(operator, arg1, arg2);
  }

  /** returns a new ternary formula with the operator OPERATOR and the three arguments ARG1, ARG2, and ARG3. */
  @SubL(source = "cycl/el-utilities.lisp", position = 56274) 
  public static final SubLObject make_ternary_formula(SubLObject operator, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
    return list(operator, arg1, arg2, arg3);
  }

  /** returns the negation of SENTENCE.  Does not perform any simplification.
   i.e. just returns (#$not <sentence>). */
  @SubL(source = "cycl/el-utilities.lisp", position = 56715) 
  public static final SubLObject make_negation(SubLObject sentence) {
    return make_unary_formula($const0$not, sentence);
  }

  /** returns a new disjunction.  Each member of the list ARGS is a disjunct in the new disjunction.
   e.g. (make-disjunction (<form1> <form2> <form3>)) returns (#$or <form1> <form2> <form3>). */
  @SubL(source = "cycl/el-utilities.lisp", position = 56918) 
  public static final SubLObject make_disjunction(SubLObject args) {
    return make_formula($const1$or, args, UNPROVIDED);
  }

  /** returns a new conjunction.  Each member of the list ARGS is a conjunct in the new conjunction.
   e.g. (make-conjunction (<form1> <form2> <form3>)) returns (#$and <form1> <form2> <form3>). */
  @SubL(source = "cycl/el-utilities.lisp", position = 57184) 
  public static final SubLObject make_conjunction(SubLObject args) {
    return make_formula($const2$and, args, UNPROVIDED);
  }

  /** returns a new universally quantified sentence of the form (#$forAll <var> <sentence>). */
  @SubL(source = "cycl/el-utilities.lisp", position = 57653) 
  public static final SubLObject make_universal(SubLObject var, SubLObject sentence) {
    return make_binary_formula($const6$forAll, var, sentence);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 58047) 
  public static final SubLObject make_regularly_quantified_sentence(SubLObject quantifier, SubLObject var, SubLObject subsent) {
    return make_binary_formula(quantifier, var, subsent);
  }

  /** Execute FUNC on each argument (in order) of FORMULA, unless it is an opaque argument.
   e.g. (map-formula-args #'func (#$and <form1> <form2> <form3>)) 
   would return (#$and (func <form1>) (func <form2>) (func <form3>)).
   By default, FUNC is not applied to sequence variables, because they are not arguments per se; 
   rather they are variables that can bind to argument (sub)sequences,
   but if map-seqvar? is t, then FUNC will be applied to sequence variables.
   @example (map-formula-args #'el-var? '(#$isa ?X #$Dog . ?Z))   (#$isa T NIL . ?Z)
   @example (map-formula-args #'el-var? '(#$isa ?X #$Dog . ?Z) t) (#$isa T NIL . T) */
  @SubL(source = "cycl/el-utilities.lisp", position = 63230) 
  public static final SubLObject map_formula_args(SubLObject func, SubLObject formula, SubLObject map_seqvarP) {
    if ((map_seqvarP == UNPROVIDED)) {
      map_seqvarP = NIL;
    }
    if ((NIL != el_formula_p(formula))) {
      {
        SubLObject args = cycl_utilities.formula_args(formula, $kw31$INCLUDE);
        if (args.isCons()) {
          {
            SubLObject new_args = NIL;
            SubLObject arg = NIL;
            SubLObject remaining_args = NIL;
            SubLObject argnum = NIL;
            for (arg = args.first(), remaining_args = args.rest(), argnum = ONE_INTEGER; (!(((NIL == remaining_args)
                  || remaining_args.isAtom()))); arg = remaining_args.first(), remaining_args = remaining_args.rest(), argnum = Numbers.add(ONE_INTEGER, argnum)) {
              new_args = cons(((NIL != cycl_utilities.opaque_argP(formula, argnum)) ? ((SubLObject) arg) : Functions.funcall(func, arg)), new_args);
            }
            new_args = cons(((NIL != cycl_utilities.opaque_argP(formula, argnum)) ? ((SubLObject) arg) : Functions.funcall(func, arg)), new_args);
            if ((NIL != remaining_args)) {
              {
                SubLObject final_args = (((NIL != map_seqvarP)
                     && (NIL == Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29830"))) ? ((SubLObject) Functions.funcall(func, remaining_args)) : remaining_args);
                SubLObject cdolist_list_var = new_args;
                SubLObject new_arg = NIL;
                for (new_arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), new_arg = cdolist_list_var.first()) {
                  final_args = cons(new_arg, final_args);
                }
                return make_formula(cycl_utilities.formula_arg0(formula), final_args, UNPROVIDED);
              }
            } else {
              return make_formula(cycl_utilities.formula_arg0(formula), Sequences.nreverse(new_args), UNPROVIDED);
            }
          }
        } else {
          return formula;
        }
      }
    }
    return NIL;
  }

  /** A destructive version of @xref map-formula-args. */
  @SubL(source = "cycl/el-utilities.lisp", position = 65151) 
  public static final SubLObject nmap_formula_args(SubLObject func, SubLObject formula, SubLObject map_seqvarP) {
    if ((map_seqvarP == UNPROVIDED)) {
      map_seqvarP = NIL;
    }
    if ((NIL != el_formula_p(formula))) {
      {
        SubLObject args = cycl_utilities.formula_args(formula, $kw31$INCLUDE);
        if (args.isCons()) {
          {
            SubLObject curr_args = NIL;
            SubLObject arg = NIL;
            SubLObject argnum = NIL;
            SubLObject remaining_args = NIL;
            for (curr_args = args, arg = curr_args.first(), argnum = ONE_INTEGER, remaining_args = curr_args.rest(); (!(((NIL == remaining_args)
                  || remaining_args.isAtom()))); curr_args = curr_args.rest(), arg = curr_args.first(), argnum = Numbers.add(ONE_INTEGER, argnum), remaining_args = curr_args.rest()) {
              ConsesLow.rplaca(curr_args, ((NIL != cycl_utilities.opaque_argP(formula, argnum)) ? ((SubLObject) arg) : Functions.funcall(func, arg)));
            }
            ConsesLow.rplaca(curr_args, ((NIL != cycl_utilities.opaque_argP(formula, argnum)) ? ((SubLObject) arg) : Functions.funcall(func, arg)));
            if (((NIL != remaining_args)
                 && (NIL != map_seqvarP)
                 && (NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29831")))) {
              ConsesLow.rplacd(curr_args, Functions.funcall(func, remaining_args));
            }
          }
        }
      }
      return formula;
    }
    return NIL;
  }

  /** A destructive version of @xref map-formula-terms. */
  @SubL(source = "cycl/el-utilities.lisp", position = 67679) 
  public static final SubLObject nmap_formula_terms(SubLObject func, SubLObject formula, SubLObject map_seqvarP) {
    if ((map_seqvarP == UNPROVIDED)) {
      map_seqvarP = NIL;
    }
    if ((NIL != el_formula_p(formula))) {
      {
        SubLObject terms = cycl_utilities.formula_terms(formula, $kw31$INCLUDE);
        if (terms.isCons()) {
          {
            SubLObject curr_terms = NIL;
            SubLObject v_term = NIL;
            SubLObject argnum = NIL;
            SubLObject remaining_terms = NIL;
            for (curr_terms = terms, v_term = curr_terms.first(), argnum = ZERO_INTEGER, remaining_terms = curr_terms.rest(); (!(((NIL == remaining_terms)
                  || remaining_terms.isAtom()))); curr_terms = curr_terms.rest(), v_term = curr_terms.first(), argnum = Numbers.add(ONE_INTEGER, argnum), remaining_terms = curr_terms.rest()) {
              ConsesLow.rplaca(curr_terms, ((NIL != cycl_utilities.opaque_argP(formula, argnum)) ? ((SubLObject) v_term) : Functions.funcall(func, v_term)));
            }
            ConsesLow.rplaca(curr_terms, ((NIL != cycl_utilities.opaque_argP(formula, argnum)) ? ((SubLObject) v_term) : Functions.funcall(func, v_term)));
            if (((NIL != remaining_terms)
                 && (NIL != map_seqvarP)
                 && (NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29833")))) {
              ConsesLow.rplacd(curr_terms, Functions.funcall(func, remaining_terms));
            }
          }
        }
      }
      return formula;
    }
    return NIL;
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its arg1 iff
   FORMULA is a negation and its arg1 is not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 72027) 
  public static final SubLObject pass_through_if_negation(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != el_negation_p(formula))
           && (NIL == cycl_utilities.opaque_argP(formula, ONE_INTEGER)))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
            try {
              czer_vars.$within_negationP$.bind(makeBoolean((NIL == czer_vars.$within_negationP$.getDynamicValue(thread))), thread);
              result = make_negation(Functions.funcall(function, cycl_utilities.formula_arg1(formula, UNPROVIDED)));
            } finally {
              czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
            }
          }
          return Values.values(result, T);
        }
      } else {
        return Values.values(formula, NIL);
      }
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its args iff
   FORMULA is a disjunction and its args are not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 72572) 
  public static final SubLObject pass_through_if_disjunction(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_disjunction_p(formula))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
            SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
            try {
              at_vars.$within_disjunctionP$.bind(T, thread);
              at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
              result = nmap_formula_args(function, formula, UNPROVIDED);
            } finally {
              at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
              at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
            }
          }
          return Values.values(result, T);
        }
      } else {
        return Values.values(formula, NIL);
      }
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its args iff
   FORMULA is a conjunction and its args are not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 73006) 
  public static final SubLObject pass_through_if_conjunction(SubLObject function, SubLObject formula) {
    if ((NIL != el_conjunction_p(formula))) {
      return Values.values(nmap_formula_args(function, formula, UNPROVIDED), T);
    } else {
      return Values.values(formula, NIL);
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its quantified subformula iff
   FORMULA is a regularly quantified formula and its quantified subformula is not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 73377) 
  public static final SubLObject pass_through_if_regularly_quantified(SubLObject function, SubLObject formula) {
    if (((NIL != possibly_el_regularly_quantified_sentence_p(formula))
         && (NIL == cycl_utilities.opaque_argP(formula, quantified_sub_sentence_argnum(formula))))) {
      return Values.values(make_regularly_quantified_sentence(sentence_quantifier(formula), quantified_var(formula), Functions.funcall(function, quantified_sub_sentence(formula))), T);
    } else {
      return Values.values(formula, NIL);
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its quantified subformula iff
   FORMULA is a bounded existential formula and its quantified subformula is not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 74025) 
  public static final SubLObject pass_through_if_bounded_existential(SubLObject function, SubLObject formula) {
    if (((NIL != el_bounded_existential_p(formula))
         && (NIL == cycl_utilities.opaque_argP(formula, quantified_sub_sentence_argnum(formula))))) {
      return Values.values(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30588"));
    } else {
      return Values.values(formula, NIL);
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its args iff
   FORMULA is a conjunction or disjunction and its args are not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 74668) 
  public static final SubLObject pass_through_if_junction(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = pass_through_if_disjunction(function, formula);
        SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != changedP)) {
          return Values.values(result, changedP);
        } else {
          return pass_through_if_conjunction(function, formula);
        }
      }
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its args iff
   FORMULA is an EL formula with a logical operator as its arg0 and its args are not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 75123) 
  public static final SubLObject pass_through_if_logical_op(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_logical_operator_formula_p(formula))) {
        thread.resetMultipleValues();
        {
          SubLObject result = pass_through_if_negation(function, formula);
          SubLObject changedP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != changedP)) {
            return Values.values(result, T);
          } else {
            thread.resetMultipleValues();
            {
              SubLObject result_2 = pass_through_if_junction(function, formula);
              SubLObject changed_2P = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != changed_2P)) {
                return Values.values(result_2, T);
              } else {
                return Values.values(nmap_formula_args(function, formula, UNPROVIDED), T);
              }
            }
          }
        }
      } else {
        return Values.values(formula, NIL);
      }
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its quantified subformula iff
   FORMULA is a quantified formula and its quantified subformula is not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 75830) 
  public static final SubLObject pass_through_if_quantified(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = pass_through_if_regularly_quantified(function, formula);
        SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != changedP)) {
          return Values.values(result, T);
        } else {
          return pass_through_if_bounded_existential(function, formula);
        }
      }
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to its quantified subformula iff
   FORMULA is an EL formula with a quantifier or logical operator as its arg0
   and its args are not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 76317) 
  public static final SubLObject pass_through_if_logical_op_or_quantified(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = pass_through_if_logical_op(function, formula);
        SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != changedP)) {
          return Values.values(result, T);
        } else {
          return pass_through_if_quantified(function, formula);
        }
      }
    }
  }

  /** @return 0 formula; FORMULA with FUNCTION applied to all its terms (including the arg0) iff
   FORMULA is an EL formula with the syntax of a relation as its arg0
   and its args are not opaque.
   @return 1 boolean; whether FORMULA was altered. */
  @SubL(source = "cycl/el-utilities.lisp", position = 76829) 
  public static final SubLObject pass_through_if_relation_syntax(SubLObject function, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = pass_through_if_logical_op_or_quantified(function, formula);
        SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != changedP)) {
          return Values.values(result, T);
        } else {
          if ((NIL != term.relation_syntaxP(formula, UNPROVIDED))) {
            return Values.values(nmap_formula_terms(function, formula, UNPROVIDED), T);
          } else {
            return Values.values(formula, NIL);
          }
        }
      }
    }
  }

  /** Calls FUNCTION on the ARGNUMth arg of FORMULA, unless that arg position is opaque. */
  @SubL(source = "cycl/el-utilities.lisp", position = 77424) 
  public static final SubLObject funcall_formula_arg(SubLObject function, SubLObject formula, SubLObject argnum) {
    {
      SubLObject arg = cycl_utilities.formula_arg(formula, argnum, UNPROVIDED);
      if ((NIL != cycl_utilities.opaque_argP(formula, argnum))) {
        return arg;
      } else {
        return Functions.funcall(function, arg);
      }
    }
  }

  /** Replaces the ARGNUMth argument of FORMULA with NEW-ARG.
   This is constructive. */
  @SubL(source = "cycl/el-utilities.lisp", position = 78068) 
  public static final SubLObject replace_formula_arg(SubLObject argnum, SubLObject new_arg, SubLObject formula) {
    {
      SubLObject new_terms = NIL;
      SubLObject seqvar = sequence_var(formula, UNPROVIDED);
      SubLObject terms = cycl_utilities.formula_terms(formula, $kw28$IGNORE);
      SubLObject list_var = NIL;
      SubLObject arg = NIL;
      SubLObject n = NIL;
      for (list_var = terms, arg = list_var.first(), n = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), arg = list_var.first(), n = number_utilities.f_1X(n)) {
        if (n.numE(argnum)) {
          new_terms = cons(new_arg, new_terms);
        } else {
          new_terms = cons(arg, new_terms);
        }
      }
      {
        SubLObject new_formula = Sequences.nreverse(new_terms);
        SubLObject new_operator = cycl_utilities.formula_operator(new_formula);
        SubLObject new_args = cycl_utilities.formula_args(new_formula, UNPROVIDED);
        return make_formula(new_operator, new_args, seqvar);
      }
    }
  }

  /** Replaces the ARGNUMth argument of FORMULA with NEW-ARG.
   This is destructive. */
  @SubL(source = "cycl/el-utilities.lisp", position = 78618) 
  public static final SubLObject nreplace_formula_arg(SubLObject argnum, SubLObject new_arg, SubLObject formula) {
    {
      SubLObject seqvar = sequence_var(formula, UNPROVIDED);
      SubLObject tempformula = formula;
      SubLObject formula_2 = ((NIL != seqvar) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30665")) : tempformula);
      SubLObject result = NIL;
      result = list_utilities.nreplace_nth(argnum, new_arg, formula_2);
      if ((NIL != seqvar)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30614");
      } else {
        return result;
      }
    }
  }

  /** Returns the atomic formula within LITERAL.  This will either be LITERAL itself
   or (if LITERAL is a negation) the atomic formula inside the negation.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 80200) 
  public static final SubLObject literal_atomic_sentence(SubLObject literal) {
    if ((NIL != el_formula_p(literal))) {
      if ((NIL != el_negation_p(literal))) {
        return cycl_utilities.formula_arg1(literal, $kw73$REGULARIZE);
      } else {
        return literal;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 80873) 
  public static final SubLObject literal_truth(SubLObject literal) {
    if ((NIL != el_negation_p(literal))) {
      return $kw74$FALSE;
    } else {
      return $kw75$TRUE;
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 80985) 
  public static final SubLObject literal_sense(SubLObject literal) {
    return enumeration_types.truth_sense(literal_truth(literal));
  }

  /** Returns the arguments of LITERAL.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal.
   If seqvar-handling is :ignore, it chops off the sequence var if there is one.
   If seqvar-handling is :regularize, it treats the sequence var as a regular variable.
   If seqvar-handling is :include, it returns it as a sequence var. */
  @SubL(source = "cycl/el-utilities.lisp", position = 81072) 
  public static final SubLObject literal_args(SubLObject literal, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return cycl_utilities.formula_args(literal_atomic_sentence(literal), seqvar_handling);
  }

  /** returns the ARGNUMth argument of LITERAL.  An ARGNUM of 0 will return the predicate.
   returns NIL if LITERAL is not a formula, or if ARGNUM is out of bounds or not an integer.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal.
   If seqvar-handling is :ignore, it will return NIL if asked for the arg position where the sequence variable is.
   If seqvar-handling is :regularize, it will return the sequence variable if asked for its position.
   e.g. (literal-arg (<pred> <arg1> . ?SEQ) 2 :ignore)     -> NIL
   but  (literal-arg (<pred> <arg1> . ?SEQ) 2 :regularize) -> ?SEQ */
  @SubL(source = "cycl/el-utilities.lisp", position = 82098) 
  public static final SubLObject literal_arg(SubLObject literal, SubLObject argnum, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return cycl_utilities.formula_arg(literal_atomic_sentence(literal), argnum, seqvar_handling);
  }

  /** Returns the predicate (the 0th argument) of LITERAL.
   For example, (literal-predicate (#$isa #$Muffet #$Dog)) would return #$isa.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 82861) 
  public static final SubLObject literal_predicate(SubLObject literal, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return literal_arg0(literal, seqvar_handling);
  }

  /** Returns the 0th argument (the predicate) of LITERAL.
   For example, (literal-arg0 (#$isa #$Muffet #$Dog)) would return #$isa.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 83195) 
  public static final SubLObject literal_arg0(SubLObject literal, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return cycl_utilities.formula_arg0(literal_atomic_sentence(literal));
  }

  /** Returns the 1st argument of LITERAL.
   For example, (literal-arg1 (#$isa #$Muffet #$Dog)) would return #$Muffet.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 83589) 
  public static final SubLObject literal_arg1(SubLObject literal, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return literal_arg(literal, ONE_INTEGER, seqvar_handling);
  }

  /** Returns the 2nd argument of LITERAL.
   For example, (literal-arg2 (#$isa #$Muffet #$Dog)) would return #$Dog.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 83901) 
  public static final SubLObject literal_arg2(SubLObject literal, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return literal_arg(literal, TWO_INTEGER, seqvar_handling);
  }

  /** returns the arity of a literal (the number of arguments).
   The predicate itself does not count as an argument.
   Assumes that LITERAL is a literal.  (#$not . ?X) is not a literal.
   For example, the arity of (#$not (#$isa #$Dog #$Collection)) would be 2, because there are 2 arguments, #$Dog and #$Collection.
   The #$not, if there is one, is ignored.
   If seqvar-handling is :regularize, then sequence variables count as a single argument.
   Hence, (<pred> <form1> <form2> <form3>) is a literal of arity 3,
   and (<pred> <form1> <form2> <form3> . ?SEQ) is a literal of arity 4.
   If seqvar-handling is :ignore, then sequence variables don't count, so both of those would be arity 3.
   Don't pass it :include. */
  @SubL(source = "cycl/el-utilities.lisp", position = 84915) 
  public static final SubLObject literal_arity(SubLObject literal, SubLObject seqvar_handling) {
    if ((seqvar_handling == UNPROVIDED)) {
      seqvar_handling = $kw28$IGNORE;
    }
    return formula_arity(literal_atomic_sentence(literal), seqvar_handling);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 85790) 
  public static final SubLObject asent_and_sense_to_literal(SubLObject asent, SubLObject sense) {
    return asent_and_truth_to_literal(asent, enumeration_types.sense_truth(sense));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 85911) 
  public static final SubLObject asent_and_truth_to_literal(SubLObject asent, SubLObject truth) {
    return (($kw74$FALSE == truth) ? ((SubLObject) cycl_utilities.negate(asent)) : asent);
  }

  /** Returns all the negations in SENTENCES, which is a list of EL sentences.
   @return list; a list of EL sentences, each of which begins with #$not.
   @see el-positive-sentences */
  @SubL(source = "cycl/el-utilities.lisp", position = 86032) 
  public static final SubLObject el_negative_sentences(SubLObject sentences) {
    return list_utilities.remove_if_not($sym76$EL_NEGATION_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Returns all the sentences in SENTENCES that are not negations.  SENTENCES is a list of EL sentences.
   @return list; a list of EL sentences
   @see el-negative-sentences */
  @SubL(source = "cycl/el-utilities.lisp", position = 86397) 
  public static final SubLObject el_positive_sentences(SubLObject sentences) {
    return Sequences.remove_if($sym76$EL_NEGATION_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** @return boolean; t iff LITERAL has exactly one argument.
   Assumes that LITERAL is a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 88694) 
  public static final SubLObject unary_lit_p(SubLObject literal) {
    return el_unary_formula_p(literal_atomic_sentence(literal));
  }

  /** @return boolean; t iff LITERAL has exactly two arguments.
   Assumes that LITERAL is a literal. */
  @SubL(source = "cycl/el-utilities.lisp", position = 88895) 
  public static final SubLObject binary_lit_p(SubLObject literal) {
    return el_binary_formula_p(literal_atomic_sentence(literal));
  }

  /** @return boolean; t iff LITERAL is positive and has PRED as its arg0.
   Returns NIL if LITERAL is negative or is not an EL formula. */
  @SubL(source = "cycl/el-utilities.lisp", position = 89099) 
  public static final SubLObject pred_litP(SubLObject literal, SubLObject pred) {
    if ((NIL != el_formula_p(literal))) {
      if ((NIL == el_negation_p(literal))) {
        return Equality.eq(literal_arg0(literal, UNPROVIDED), pred);
      }
    }
    return NIL;
  }

  /** @return boolean; t iff LIT is a positive binary literal whose predicate is #$isa. */
  @SubL(source = "cycl/el-utilities.lisp", position = 89582) 
  public static final SubLObject isa_litP(SubLObject lit) {
    return makeBoolean(((NIL != pred_litP(lit, $const83$isa))
           && (NIL != binary_lit_p(lit))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 90250) 
  public static final SubLObject isa_hl_var_hl_var_litP(SubLObject lit) {
    return makeBoolean(((NIL != pred_litP(lit, $const83$isa))
           && (NIL != binary_lit_p(lit))
           && (NIL != cycl_grammar.hl_variable_p(cycl_utilities.formula_arg1(lit, UNPROVIDED)))
           && (NIL != cycl_grammar.hl_variable_p(cycl_utilities.formula_arg2(lit, UNPROVIDED)))));
  }

  /** @return boolean; t iff LIT is a positive binary literal whose predicate is #$quoted-isa. */
  @SubL(source = "cycl/el-utilities.lisp", position = 90769) 
  public static final SubLObject quoted_isa_litP(SubLObject lit) {
    return makeBoolean(((NIL != pred_litP(lit, $const85$quotedIsa))
           && (NIL != binary_lit_p(lit))));
  }

  /** @return boolean; t iff LIT is a positive binary literal whose predicate is #$genls. */
  @SubL(source = "cycl/el-utilities.lisp", position = 90969) 
  public static final SubLObject genls_litP(SubLObject lit) {
    return makeBoolean(((NIL != pred_litP(lit, $const86$genls))
           && (NIL != binary_lit_p(lit))));
  }

  /** @return boolean; t iff LIT is a positive binary literal whose predicate is #$termOfUnit. */
  @SubL(source = "cycl/el-utilities.lisp", position = 92150) 
  public static final SubLObject tou_litP(SubLObject lit) {
    return makeBoolean(((NIL != pred_litP(lit, $const92$termOfUnit))
           && (NIL != binary_lit_p(lit))));
  }

  /** @return boolean; t iff ASENT is a binary atomic sentence whose predicate is #$termOfUnit. */
  @SubL(source = "cycl/el-utilities.lisp", position = 92344) 
  public static final SubLObject tou_asentP(SubLObject asent) {
    return makeBoolean(((NIL != el_binary_formula_p(asent))
           && (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const92$termOfUnit))));
  }

  /** @return boolean; t iff LITERAL is a positive binary literal whose predicate is #$holdsIn. */
  @SubL(source = "cycl/el-utilities.lisp", position = 92761) 
  public static final SubLObject holds_in_litP(SubLObject literal) {
    return makeBoolean(((NIL != pred_litP(literal, $const94$holdsIn))
           && (NIL != binary_lit_p(literal))));
  }

  /** @return boolean; t iff LITERAL is a positive unary literal whose predicate is #$trueSentence. */
  @SubL(source = "cycl/el-utilities.lisp", position = 92970) 
  public static final SubLObject true_sentence_litP(SubLObject literal) {
    return makeBoolean(((NIL != pred_litP(literal, $const95$trueSentence))
           && (NIL != unary_lit_p(literal))));
  }

  /** @return boolean; t iff LITERAL is a positive unary literal whose predicate is #$forwardNonTriggerLiteral. */
  @SubL(source = "cycl/el-utilities.lisp", position = 93192) 
  public static final SubLObject forward_non_trigger_literal_litP(SubLObject literal) {
    return makeBoolean(((NIL != pred_litP(literal, $const96$forwardNonTriggerLiteral))
           && (NIL != unary_lit_p(literal))));
  }

  public static final class $forward_non_trigger_literal_litP$UnaryFunction extends UnaryFunction {
    public $forward_non_trigger_literal_litP$UnaryFunction() { super(extractFunctionNamed("FORWARD-NON-TRIGGER-LITERAL-LIT?")); }
    public SubLObject processItem(SubLObject arg1) { return forward_non_trigger_literal_litP(arg1); }
  }

  /** @return boolean; t iff LITERAL is a positive binary literal whose predicate is #evaluate,
   whose arg1 is a variable, string, or number, and whose arg2 is a nat. */
  @SubL(source = "cycl/el-utilities.lisp", position = 93452) 
  public static final SubLObject evaluate_litP(SubLObject literal, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    return makeBoolean(((NIL != pred_litP(literal, $const97$evaluate))
           && (NIL != binary_lit_p(literal))
           && (NIL != term.nautP(literal_arg2(literal, UNPROVIDED), UNPROVIDED))
           && ((NIL != Functions.funcall(varP, literal_arg1(literal, UNPROVIDED)))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30469")))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 94889) 
  public static final SubLObject ist_sentence_p(SubLObject sentence) {
    return makeBoolean(((NIL != possibly_sentence_p(sentence))
           && ($const69$ist == cycl_utilities.sentence_arg0(sentence))
           && (NIL != el_binary_formula_p(sentence))));
  }

  /** @return boolean; t iff SENTENCE is an #$ist around an atomic sentence */
  @SubL(source = "cycl/el-utilities.lisp", position = 95057) 
  public static final SubLObject ist_of_atomic_sentence_p(SubLObject sentence) {
    return ist_of_atomic_sentence_int(sentence, NIL);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 95475) 
  public static final SubLObject ist_of_atomic_sentence_int(SubLObject sentence, SubLObject pred) {
    if ((NIL != ist_sentence_p(sentence))) {
      {
        SubLObject subsentence = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30501");
        if ((NIL != possibly_atomic_sentence_p(subsentence))) {
          {
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(subsentence);
            if ((NIL != pred)) {
              return Equality.eq(pred, predicate);
            } else {
              return makeBoolean(((NIL != forts.fort_p(predicate))
                     && (NIL != fort_types_interface.predicateP(predicate))));
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 95863) 
  public static final SubLObject ist_sentence_with_chlmt_p(SubLObject sentence) {
    return makeBoolean(((NIL != ist_sentence_p(sentence))
           && (NIL != hlmt.chlmt_p(cycl_utilities.sentence_arg1(sentence, UNPROVIDED)))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 95999) 
  public static final SubLObject true_sentence_p(SubLObject sentence) {
    return makeBoolean(((NIL != possibly_sentence_p(sentence))
           && ($const95$trueSentence == cycl_utilities.sentence_arg0(sentence))
           && (NIL != el_unary_formula_p(sentence))));
  }

  /** @return boolean; t iff SENTENCE is a #$trueSentence around an atomic sentence */
  @SubL(source = "cycl/el-utilities.lisp", position = 96176) 
  public static final SubLObject true_sentence_of_atomic_sentence_p(SubLObject sentence) {
    if ((NIL != true_sentence_p(sentence))) {
      {
        SubLObject subsentence = cycl_utilities.sentence_arg1(sentence, UNPROVIDED);
        if ((NIL != possibly_sentence_p(subsentence))) {
          {
            SubLObject predicate = cycl_utilities.sentence_arg0(subsentence);
            return makeBoolean(((NIL != forts.fort_p(predicate))
                   && (NIL != fort_types_interface.predicateP(predicate))));
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 97574) 
  public static final SubLObject kappa_asent_p(SubLObject object) {
    return makeBoolean(((NIL != possibly_atomic_sentence_p(object))
           && (NIL != kappa_predicate_p(cycl_utilities.atomic_sentence_predicate(object)))));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 97758) 
  public static final SubLObject kappa_predicate_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const99$Kappa))
           && (NIL != el_binary_formula_p(object))
           && (NIL != list_utilities.list_of_type_p($sym46$EL_VAR_, cycl_utilities.nat_arg1(object, UNPROVIDED)))));
  }

  public static final class $kappa_predicate_p$UnaryFunction extends UnaryFunction {
    public $kappa_predicate_p$UnaryFunction() { super(extractFunctionNamed("KAPPA-PREDICATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return kappa_predicate_p(arg1); }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 98196) 
  public static final SubLObject lambda_function_p(SubLObject object) {
    return makeBoolean(((NIL != el_formula_with_operator_p(object, $const100$Lambda))
           && (NIL != el_binary_formula_p(object))
           && (NIL != list_utilities.list_of_type_p($sym46$EL_VAR_, cycl_utilities.nat_arg1(object, UNPROVIDED)))));
  }

  /** @return boolean; t iff LITERAL is a literal whose arg0 is a #$MicrotheoryDesignatingRelation */
  @SubL(source = "cycl/el-utilities.lisp", position = 98668) 
  public static final SubLObject mt_designating_literalP(SubLObject literal) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym101$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const102$EverythingPSC, thread);
            result = makeBoolean(((NIL != el_formula_p(literal))
                   && (NIL != term.mt_designating_relationP(literal_arg0(literal, UNPROVIDED)))));
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return boolean; t iff ARG could be a valid arg index for some formula, i.e. if (formula-arg <formula> ARG) is a sensible thing to try. */
  @SubL(source = "cycl/el-utilities.lisp", position = 100481) 
  public static final SubLObject valid_argnum_p(SubLObject arg) {
    return valid_arity_p(arg);
  }

  /** @return boolean; t iff ARG could be a valid arity for some formula. */
  @SubL(source = "cycl/el-utilities.lisp", position = 100761) 
  public static final SubLObject valid_arity_p(SubLObject v_arity) {
    return makeBoolean((v_arity.isInteger()
           && v_arity.numGE(ZERO_INTEGER)));
  }

  /** @return boolean; t iff TERM is a predicate, a variable, or a nat whose result is a predicate. */
  @SubL(source = "cycl/el-utilities.lisp", position = 102431) 
  public static final SubLObject predicate_specP(SubLObject v_term, SubLObject var_func) {
    if ((var_func == UNPROVIDED)) {
      var_func = Symbols.symbol_function($sym106$VAR_SPEC_);
    }
    if ((NIL != fort_types_interface.predicateP(v_term))) {
      return T;
    } else if ((NIL != Functions.funcall(var_func, v_term))) {
      return T;
    } else if ((NIL != term.function_termP(v_term))) {
      {
        SubLObject nat = cycl_utilities.reify_when_closed_naut(v_term);
        if ((NIL != forts.fort_p(nat))) {
          return fort_types_interface.predicateP(nat);
        } else {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3706");
        }
      }
    }
    return NIL;
  }

  /** @return boolean; t iff TERM is a denotational function, a variable, or a nat whose result is a denotational function. */
  @SubL(source = "cycl/el-utilities.lisp", position = 102941) 
  public static final SubLObject function_specP(SubLObject v_term, SubLObject var_func) {
    if ((var_func == UNPROVIDED)) {
      var_func = Symbols.symbol_function($sym106$VAR_SPEC_);
    }
    if ((NIL != fort_types_interface.functorP(v_term))) {
      return T;
    } else if ((NIL != Functions.funcall(var_func, v_term))) {
      return T;
    } else if ((NIL != term.function_termP(v_term))) {
      {
        SubLObject nat = cycl_utilities.reify_when_closed_naut(v_term);
        if ((NIL != forts.fort_p(nat))) {
          return fort_types_interface.functorP(nat);
        } else {
          return genls.any_specP($const108$Function_Denotational, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6974"), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  /** @return boolean; t iff OBJECT is either a naut or an EL formula with a predicate, variable, or logical operator as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 107504) 
  public static final SubLObject el_relation_expressionP(SubLObject object) {
    return makeBoolean(((NIL != el_formulaP(object))
          || (NIL != term.function_termP(object))));
  }

  /** @return boolean; t iff OBJECT is a nart. */
  @SubL(source = "cycl/el-utilities.lisp", position = 108233) 
  public static final SubLObject hl_relation_expressionP(SubLObject object) {
    return nart_handles.nart_p(object);
  }

  /** @return boolean; t iff OBJECT is either a nat or an EL formula with a predicate, variable, or logical operator as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 108353) 
  public static final SubLObject relation_expressionP(SubLObject object) {
    return makeBoolean(((NIL != el_relation_expressionP(object))
          || (NIL != hl_relation_expressionP(object))));
  }

  /** @return boolean; t iff FORMULA is an EL formula with a predicate, variable, or logical operator as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 108613) 
  public static final SubLObject el_formulaP(SubLObject formula) {
    return makeBoolean(((NIL != wf_wrt_sequence_varsP(formula))
           && ((NIL != el_atomic_sentenceP(formula))
            || (NIL != el_non_atomic_sentenceP(formula)))));
  }

  /** @return boolean; t iff FORMULA is an EL formula with a predicate (or variable) as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 108938) 
  public static final SubLObject el_atomic_sentenceP(SubLObject formula) {
    return atomic_sentenceP(formula);
  }

  /** @return boolean; t iff FORMULA is an EL formula with a logical operator as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 109116) 
  public static final SubLObject el_non_atomic_sentenceP(SubLObject formula) {
    return makeBoolean(((NIL != el_formula_p(formula))
           && (NIL != at_utilities.logical_opP(cycl_utilities.formula_arg0(formula)))));
  }

  /** @return boolean; t iff OBJECT is an EL formula with a predicate as its arg0. */
  @SubL(source = "cycl/el-utilities.lisp", position = 109558) 
  public static final SubLObject atomic_sentenceP(SubLObject object) {
    return makeBoolean(((NIL != el_formula_p(object))
           && (NIL != predicate_specP(cycl_utilities.formula_arg0(object), UNPROVIDED))
           && (NIL != term.relation_syntaxP(object, UNPROVIDED))));
  }

  public static final class $gafP$UnaryFunction extends UnaryFunction {
    public $gafP$UnaryFunction() { super(extractFunctionNamed("GAF?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30571"); }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 110395) 
  public static final SubLObject formula_non_var_symbols(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    return Sequences.remove_if(varP, list_utilities.flatten(formula), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 110533) 
  public static final SubLObject referenced_variables(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    return cycl_utilities.formula_gather(formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 112763) 
  public static final SubLObject literal_variables(SubLObject relation, SubLObject varP, SubLObject include_sequence_varsP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    return relation_variables(relation, varP, include_sequence_varsP);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 113084) 
  public static final SubLObject relation_variables(SubLObject literal, SubLObject varP, SubLObject include_sequence_varsP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    if ((NIL != Functions.funcall(varP, literal))) {
      return list(literal);
    }
    if ((NIL != el_negation_p(literal))) {
      return literal_variables(cycl_utilities.formula_arg1(literal, UNPROVIDED), varP, UNPROVIDED);
    } else {
      {
        SubLObject arg = ZERO_INTEGER;
        SubLObject vars = NIL;
        SubLObject terms = cycl_utilities.formula_terms(literal, ((NIL != include_sequence_varsP) ? ((SubLObject) $kw73$REGULARIZE) : $kw28$IGNORE));
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
          if ((NIL != subl_promotions.memberP(v_term, vars, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
          } else if ((NIL != Functions.funcall(varP, v_term))) {
            vars = cons(v_term, vars);
          } else if ((NIL != term.unreified_skolem_termP(v_term))) {
            vars = cons(v_term, vars);
          } else if ((NIL != term.nautP(v_term, UNPROVIDED))) {
            {
              SubLObject cdolist_list_var_4 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30622");
              SubLObject var = NIL;
              for (var = cdolist_list_var_4.first(); (NIL != cdolist_list_var_4); cdolist_list_var_4 = cdolist_list_var_4.rest(), var = cdolist_list_var_4.first()) {
                if ((NIL == subl_promotions.memberP(var, vars, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
                  vars = cons(var, vars);
                }
              }
            }
          } else if ((NIL != term.sentenceP(v_term, UNPROVIDED))) {
            {
              SubLObject cdolist_list_var_5 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30652");
              SubLObject var = NIL;
              for (var = cdolist_list_var_5.first(); (NIL != cdolist_list_var_5); cdolist_list_var_5 = cdolist_list_var_5.rest(), var = cdolist_list_var_5.first()) {
                if ((NIL == subl_promotions.memberP(var, vars, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
                  vars = cons(var, vars);
                }
              }
            }
          }
          arg = Numbers.add(arg, ONE_INTEGER);
        }
        return Sequences.reverse(vars);
      }
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 113987) 
  public static final SubLObject scoped_vars(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    {
      SubLObject relation = cycl_utilities.formula_operator(formula);
      SubLObject scoped_vars = NIL;
      if ((NIL != forts.fort_p(relation))) {
        {
          SubLObject cdolist_list_var = kb_accessors.scoping_args(relation, UNPROVIDED);
          SubLObject position = NIL;
          for (position = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), position = cdolist_list_var.first()) {
            {
              SubLObject arg = cycl_utilities.formula_arg(formula, position, UNPROVIDED);
              if ((NIL != Functions.funcall(varP, arg))) {
                scoped_vars = cons(arg, scoped_vars);
              } else if (arg.isCons()) {
                {
                  SubLObject cdolist_list_var_6 = cycl_utilities.formula_terms(arg, UNPROVIDED);
                  SubLObject sub_arg = NIL;
                  for (sub_arg = cdolist_list_var_6.first(); (NIL != cdolist_list_var_6); cdolist_list_var_6 = cdolist_list_var_6.rest(), sub_arg = cdolist_list_var_6.first()) {
                    if ((NIL != Functions.funcall(varP, sub_arg))) {
                      scoped_vars = cons(sub_arg, scoped_vars);
                    }
                  }
                }
              }
            }
          }
        }
      }
      return Sequences.nreverse(scoped_vars);
    }
  }

  /** @return boolean; t iff FORMULA has no ill-formed sequence variable syntax at the top level. */
  @SubL(source = "cycl/el-utilities.lisp", position = 123929) 
  public static final SubLObject wf_wrt_sequence_varsP(SubLObject formula) {
    return makeBoolean((NIL == formula_with_sequence_non_varP(formula)));
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 125104) 
  public static final SubLObject sentence_free_variables(SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    if ((var_func == UNPROVIDED)) {
      var_func = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    if (((NIL != include_sequence_varsP)
         && (NIL == list_utilities.tree_find_if($sym122$SCOPING_RELATION_P, sentence, UNPROVIDED))
         && (NIL == list_utilities.tree_find_if($sym123$CYCL_QUOTED_TERM_P, sentence, UNPROVIDED))
         && (NIL == list_utilities.tree_find_if($sym124$EXPAND_SUBL_FN_P, sentence, UNPROVIDED)))) {
      return conses_high.set_difference(cycl_utilities.expression_gather(sentence, var_func, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), bound_vars, UNPROVIDED, UNPROVIDED);
    }
    return sentence_free_variables_int(sentence, bound_vars, var_func, include_sequence_varsP);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 125654) 
  public static final SubLObject sentence_free_variables_int(SubLObject sentence, SubLObject bound_vars, SubLObject var_func, SubLObject include_sequence_varsP) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    if ((var_func == UNPROVIDED)) {
      var_func = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != czer_vars.$inside_quote$.getDynamicValue(thread))
           && (NIL == cycl_utilities.expression_find_if(Symbols.symbol_function($sym125$FAST_ESCAPE_QUOTE_TERM_P), sentence, UNPROVIDED, UNPROVIDED)))) {
      } else if ((NIL != subl_promotions.memberP(sentence, bound_vars, UNPROVIDED, UNPROVIDED))) {
      } else if ((NIL != Functions.funcall(var_func, sentence))) {
        return list(sentence);
      } else if (sentence.isAtom()) {
      } else if ((NIL == list_utilities.tree_find_if(var_func, sentence, UNPROVIDED))) {
      } else if ((NIL != el_negation_p(sentence))) {
        return sentence_free_variables_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), bound_vars, var_func, include_sequence_varsP);
      } else if (((NIL != el_conjunction_p(sentence))
          || (NIL != el_disjunction_p(sentence)))) {
        {
          SubLObject result = NIL;
          SubLObject cdolist_list_var = cycl_utilities.sentence_args(sentence, ((NIL != include_sequence_varsP) ? ((SubLObject) $kw73$REGULARIZE) : $kw28$IGNORE));
          SubLObject arg = NIL;
          for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
            {
              SubLObject cdolist_list_var_11 = sentence_free_variables_int(arg, bound_vars, var_func, include_sequence_varsP);
              SubLObject var = NIL;
              for (var = cdolist_list_var_11.first(); (NIL != cdolist_list_var_11); cdolist_list_var_11 = cdolist_list_var_11.rest(), var = cdolist_list_var_11.first()) {
                {
                  SubLObject item_var = var;
                  if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                    result = cons(item_var, result);
                  }
                }
              }
            }
          }
          return result;
        }
      } else if (((NIL != el_general_implication_p(sentence))
          || (NIL != el_exception_p(sentence)))) {
        {
          SubLObject result = Sequences.nreverse(sentence_free_variables_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), bound_vars, var_func, include_sequence_varsP));
          SubLObject cdolist_list_var = sentence_free_variables_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), bound_vars, var_func, include_sequence_varsP);
          SubLObject var = NIL;
          for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
            {
              SubLObject item_var = var;
              if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                result = cons(item_var, result);
              }
            }
          }
          return Sequences.nreverse(result);
        }
      } else if ((NIL != possibly_el_regularly_quantified_sentence_p(sentence))) {
        return sentence_free_variables_int(quantified_sub_sentence(sentence), cons(quantified_var(sentence), bound_vars), var_func, include_sequence_varsP);
      } else if ((NIL != cycl_grammar.cycl_bounded_existential_sentence_p(sentence))) {
        {
          SubLObject result = Sequences.nreverse(sentence_free_variables_int(quantified_sub_sentence(sentence), cons(quantified_var(sentence), bound_vars), var_func, include_sequence_varsP));
          SubLObject possible_var = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30558");
          if ((NIL != cycl_variables.cyc_varP(possible_var))) {
            result = cons(possible_var, result);
          }
          return Sequences.nreverse(result);
        }
      } else if ((NIL != mt_designating_literalP(sentence))) {
        {
          SubLObject mt = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30484");
          SubLObject mtP = fort_types_interface.mtP(mt);
          SubLObject subsentence = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30504");
          SubLObject result = NIL;
          SubLObject mt_var = ((NIL != mtP) ? ((SubLObject) mt) : NIL);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              result = sentence_free_variables_int(subsentence, bound_vars, var_func, include_sequence_varsP);
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
          if ((NIL == mtP)) {
            result = ConsesLow.append(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30619"));
          }
          return result;
        }
      } else if ((NIL != atomic_sentenceP(sentence))) {
        return literal_free_variables(sentence, bound_vars, var_func, include_sequence_varsP);
      } else if (((NIL != el_formula_p(sentence))
           && (NIL != Functions.funcall(var_func, cycl_utilities.sentence_arg0(sentence))))) {
        return literal_free_variables(sentence, bound_vars, var_func, include_sequence_varsP);
      } else {
        {
          SubLObject result = NIL;
          SubLObject cdolist_list_var = cycl_utilities.formula_gather(sentence, var_func, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject var = NIL;
          for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
            if ((NIL == subl_promotions.memberP(var, bound_vars, UNPROVIDED, UNPROVIDED))) {
              {
                SubLObject item_var = var;
                if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                  result = cons(item_var, result);
                }
              }
            }
          }
          return result;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 128651) 
  public static final SubLObject literals_free_variables(SubLObject literals, SubLObject bound_vars, SubLObject varP, SubLObject include_sequence_varsP) {
    if ((bound_vars == UNPROVIDED)) {
      bound_vars = NIL;
    }
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    {
      SubLObject v_variables = NIL;
      if (literals.isCons()) {
        {
          SubLObject cdolist_list_var = literals;
          SubLObject literal = NIL;
          for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
            v_variables = list_utilities.ordered_union(v_variables, literal_free_variables(literal, bound_vars, varP, include_sequence_varsP), UNPROVIDED, UNPROVIDED);
          }
        }
      } else if ((NIL != subl_promotions.memberP(literals, bound_vars, UNPROVIDED, UNPROVIDED))) {
      } else if ((NIL != Functions.funcall(varP, literals))) {
        v_variables = cons(literals, v_variables);
      }
      return v_variables;
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 129176) 
  public static final SubLObject literal_free_variables(SubLObject literal, SubLObject old_bound_vars, SubLObject varP, SubLObject include_sequence_varsP) {
    if ((old_bound_vars == UNPROVIDED)) {
      old_bound_vars = NIL;
    }
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    return relation_free_variables(literal, old_bound_vars, varP, include_sequence_varsP);
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 129575) 
  public static final SubLObject relation_free_variables(SubLObject relation, SubLObject old_bound_vars, SubLObject varP, SubLObject include_sequence_varsP) {
    if ((old_bound_vars == UNPROVIDED)) {
      old_bound_vars = NIL;
    }
    if ((varP == UNPROVIDED)) {
      varP = $sym39$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != subl_quote_p(relation))) {
      } else if ((NIL != expand_subl_fn_p(relation))) {
        return relation_free_variables(cycl_utilities.formula_arg1(relation, UNPROVIDED), old_bound_vars, varP, include_sequence_varsP);
      } else if ((NIL != cycl_grammar.fast_escape_quote_term_p(relation))) {
        {
          SubLObject ans = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
              czer_vars.$inside_quote$.bind(NIL, thread);
              ans = relation_free_variables(cycl_utilities.formula_arg1(relation, UNPROVIDED), old_bound_vars, varP, include_sequence_varsP);
            } finally {
              czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
          }
          return ans;
        }
      } else if ((NIL != subl_promotions.memberP(relation, old_bound_vars, UNPROVIDED, UNPROVIDED))) {
      } else if (((NIL == czer_vars.$inside_quote$.getDynamicValue(thread))
           && (NIL != Functions.funcall(varP, relation)))) {
        return list(relation);
      } else if ((NIL != cycl_grammar.fast_quote_term_p(relation))) {
        {
          SubLObject ans = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
              czer_vars.$inside_quote$.bind(T, thread);
              ans = relation_free_variables(cycl_utilities.formula_arg1(relation, UNPROVIDED), old_bound_vars, varP, include_sequence_varsP);
            } finally {
              czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
          }
          return ans;
        }
      } else if ((NIL != el_negation_p(relation))) {
        return relation_free_variables(cycl_utilities.formula_arg1(relation, UNPROVIDED), old_bound_vars, varP, include_sequence_varsP);
      } else if ((NIL != el_formula_p(relation))) {
        {
          SubLObject reln = cycl_utilities.formula_arg0(relation);
          SubLObject new_bound_vars = scoped_vars(relation, varP);
          SubLObject bound_vars = conses_high.union(old_bound_vars, new_bound_vars, UNPROVIDED, UNPROVIDED);
          SubLObject ans = NIL;
          SubLObject terms = cycl_utilities.formula_terms(relation, ((NIL != include_sequence_varsP) ? ((SubLObject) $kw73$REGULARIZE) : $kw28$IGNORE));
          SubLObject list_var = NIL;
          SubLObject v_term = NIL;
          SubLObject psn = NIL;
          for (list_var = terms, v_term = list_var.first(), psn = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), v_term = list_var.first(), psn = number_utilities.f_1X(psn)) {
            if ((NIL != subl_promotions.memberP(v_term, bound_vars, UNPROVIDED, UNPROVIDED))) {
            } else if (((NIL != list_utilities.proper_list_p(v_term))
                 && (NIL != conses_high.subsetp(v_term, bound_vars, UNPROVIDED, UNPROVIDED)))) {
            } else if (((!(((NIL != control_vars.$within_query$.getDynamicValue(thread))
                     && (NIL != czer_vars.$canonicalize_el_template_vars_during_queriesP$.getDynamicValue(thread)))))
                 && (NIL != czer_utilities.leave_variables_at_el_for_argP(reln, psn, UNPROVIDED)))) {
            } else if (((NIL == czer_vars.$inside_quote$.getDynamicValue(thread))
                 && (NIL != Functions.funcall(varP, v_term)))) {
              {
                SubLObject item_var = v_term;
                if ((NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                  ans = cons(item_var, ans);
                }
              }
            } else if (((NIL != at_vars.within_tou_gafP())
                 && (psn == TWO_INTEGER))) {
            } else if (((NIL == czer_vars.$inside_quote$.getDynamicValue(thread))
                 && (NIL != term.unreified_skolem_termP(v_term)))) {
              {
                SubLObject cdolist_list_var = conses_high.second(v_term);
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  if (((NIL == subl_promotions.memberP(var, bound_vars, UNPROVIDED, UNPROVIDED))
                       && (NIL != Functions.funcall(varP, var)))) {
                    {
                      SubLObject item_var = var;
                      if ((NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                        ans = cons(item_var, ans);
                      }
                    }
                  }
                }
              }
            } else if ((NIL != term.nautP(v_term, UNPROVIDED))) {
              {
                SubLObject cdolist_list_var = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30620");
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  {
                    SubLObject item_var = var;
                    if ((NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                      ans = cons(item_var, ans);
                    }
                  }
                }
              }
            } else if (((NIL != term.sentenceP(v_term, UNPROVIDED))
                || (NIL != cycl_utilities.expression_find_if(Symbols.symbol_function($sym119$SCOPING_RELATION_EXPRESSION_), v_term, NIL, UNPROVIDED)))) {
              {
                SubLObject cdolist_list_var = sentence_free_variables_int(v_term, bound_vars, varP, include_sequence_varsP);
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  {
                    SubLObject item_var = var;
                    if ((NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                      ans = cons(item_var, ans);
                    }
                  }
                }
              }
            } else if ((NIL != czer_vars.$inside_quote$.getDynamicValue(thread))) {
            } else {
              {
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(v_term, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  if ((NIL == subl_promotions.memberP(var, bound_vars, UNPROVIDED, UNPROVIDED))) {
                    {
                      SubLObject item_var = var;
                      if ((NIL == conses_high.member(item_var, ans, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                        ans = cons(item_var, ans);
                      }
                    }
                  }
                }
              }
            }
          }
          return Sequences.nreverse(ans);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 136179) 
  public static final SubLObject scoping_relation_expressionP(SubLObject expression) {
    if ((NIL != relation_expressionP(expression))) {
      {
        SubLObject relation = cycl_utilities.formula_operator(expression);
        return fort_types_interface.scoping_relation_p(relation);
      }
    }
    return NIL;
  }

  public static final class $scoping_relation_expressionP$UnaryFunction extends UnaryFunction {
    public $scoping_relation_expressionP$UnaryFunction() { super(extractFunctionNamed("SCOPING-RELATION-EXPRESSION?")); }
    public SubLObject processItem(SubLObject arg1) { return scoping_relation_expressionP(arg1); }
  }

  /** do the arg-types applicable to arg <pos> of relation <rel> require the arg to be an unreified function? */
  @SubL(source = "cycl/el-utilities.lisp", position = 136641) 
  public static final SubLObject arg_types_prescribe_unreifiedP(SubLObject rel, SubLObject pos) {
    if (((rel == $const92$termOfUnit)
         && (pos == TWO_INTEGER))) {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 137217) 
  private static SubLSymbol $arg1_subl_list_relations$ = null;

  @SubL(source = "cycl/el-utilities.lisp", position = 137453) 
  private static SubLSymbol $arg2_subl_list_relations$ = null;

  /** Do the arg-types applicable to arg <pos> of relation <rel> require the arg to be a SubL list?
   Note that SubL lists are deprecated except for special cases in the CycL grammar itself. */
  @SubL(source = "cycl/el-utilities.lisp", position = 137649) 
  public static final SubLObject arg_types_prescribe_tacit_term_listP(SubLObject rel, SubLObject pos) {
    {
      SubLObject pcase_var = pos;
      if (pcase_var.eql(ONE_INTEGER)) {
        return subl_promotions.memberP(rel, $arg1_subl_list_relations$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return subl_promotions.memberP(rel, $arg2_subl_list_relations$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/el-utilities.lisp", position = 138977) 
  public static final SubLObject el_error(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
    if ((arg1 == UNPROVIDED)) {
      arg1 = NIL;
    }
    if ((arg2 == UNPROVIDED)) {
      arg2 = NIL;
    }
    if ((arg3 == UNPROVIDED)) {
      arg3 = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (czer_vars.$el_trace_level$.getDynamicValue(thread).numGE(level)) {
        Errors.cerror($str134$continue_anyway, format_str, arg1, arg2);
      } else if (Numbers.add(TWO_INTEGER, czer_vars.$el_trace_level$.getDynamicValue(thread)).numGE(level)) {
        Errors.warn(format_str, arg1, arg2, arg3);
      }
      return NIL;
    }
  }

  public static final SubLObject declare_el_utilities_file() {
    declareFunction(myName, "el_formula_with_operator_p", "EL-FORMULA-WITH-OPERATOR-P", 2, 0, false);
    declareFunction(myName, "el_formula_with_any_of_operators_p", "EL-FORMULA-WITH-ANY-OF-OPERATORS-P", 2, 0, false);
    declareFunction(myName, "el_negation_p", "EL-NEGATION-P", 1, 0, false); new $el_negation_p$UnaryFunction();
    declareFunction(myName, "el_disjunction_p", "EL-DISJUNCTION-P", 1, 0, false); new $el_disjunction_p$UnaryFunction();
    declareFunction(myName, "el_conjunction_p", "EL-CONJUNCTION-P", 1, 0, false); new $el_conjunction_p$UnaryFunction();
    declareFunction(myName, "el_junction_p", "EL-JUNCTION-P", 1, 0, false);
    declareFunction(myName, "el_implication_p", "EL-IMPLICATION-P", 1, 0, false);
    declareFunction(myName, "el_equivalence_p", "EL-EQUIVALENCE-P", 1, 0, false);
    declareFunction(myName, "el_xor_p", "EL-XOR-P", 1, 0, false);
    declareFunction(myName, "cyc_const_general_implication_operator_p", "CYC-CONST-GENERAL-IMPLICATION-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "el_general_implication_p", "EL-GENERAL-IMPLICATION-P", 1, 0, false);
    declareFunction(myName, "el_conditional_sentence_p", "EL-CONDITIONAL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "el_universal_p", "EL-UNIVERSAL-P", 1, 0, false);
    declareFunction(myName, "cycl_universal_p", "CYCL-UNIVERSAL-P", 1, 0, false);
    declareFunction(myName, "el_existential_p", "EL-EXISTENTIAL-P", 1, 0, false);
    declareFunction(myName, "el_existential_min_p", "EL-EXISTENTIAL-MIN-P", 1, 0, false);
    declareFunction(myName, "el_existential_max_p", "EL-EXISTENTIAL-MAX-P", 1, 0, false);
    declareFunction(myName, "el_existential_exact_p", "EL-EXISTENTIAL-EXACT-P", 1, 0, false);
    declareFunction(myName, "cyc_const_unary_logical_op_p", "CYC-CONST-UNARY-LOGICAL-OP-P", 1, 0, false);
    declareFunction(myName, "cyc_const_binary_logical_op_p", "CYC-CONST-BINARY-LOGICAL-OP-P", 1, 0, false);
    declareFunction(myName, "cyc_const_ternary_logical_op_p", "CYC-CONST-TERNARY-LOGICAL-OP-P", 1, 0, false);
    declareFunction(myName, "cyc_const_quaternary_logical_op_p", "CYC-CONST-QUATERNARY-LOGICAL-OP-P", 1, 0, false);
    declareFunction(myName, "cyc_const_quintary_logical_op_p", "CYC-CONST-QUINTARY-LOGICAL-OP-P", 1, 0, false);
    declareFunction(myName, "cyc_const_variable_arity_logical_op_p", "CYC-CONST-VARIABLE-ARITY-LOGICAL-OP-P", 1, 0, false);
    declareFunction(myName, "cyc_const_existential_p", "CYC-CONST-EXISTENTIAL-P", 1, 0, false);
    declareFunction(myName, "cyc_const_universal_p", "CYC-CONST-UNIVERSAL-P", 1, 0, false);
    declareFunction(myName, "cyc_const_regular_quantifier_p", "CYC-CONST-REGULAR-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "possibly_el_regularly_quantified_sentence_p", "POSSIBLY-EL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cyc_const_bounded_existential_operator_p", "CYC-CONST-BOUNDED-EXISTENTIAL-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "user_defined_bounded_existential_operator_p", "USER-DEFINED-BOUNDED-EXISTENTIAL-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "el_bounded_existential_p", "EL-BOUNDED-EXISTENTIAL-P", 1, 0, false);
    declareFunction(myName, "cyc_const_general_existential_operator_p", "CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P", 1, 0, false); new $cyc_const_general_existential_operator_p$UnaryFunction();
    declareFunction(myName, "el_general_existential_p", "EL-GENERAL-EXISTENTIAL-P", 1, 0, false);
    declareFunction(myName, "cyc_const_quantifier_p", "CYC-CONST-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "possibly_el_quantified_sentence_p", "POSSIBLY-EL-QUANTIFIED-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cyc_const_logical_operator_p", "CYC-CONST-LOGICAL-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "user_defined_logical_operator_p", "USER-DEFINED-LOGICAL-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "user_defined_sentential_relation_p", "USER-DEFINED-SENTENTIAL-RELATION-P", 1, 0, false);
    declareFunction(myName, "cyc_const_tense_operator_p", "CYC-CONST-TENSE-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "cyc_const_metric_tense_operator_p", "CYC-CONST-METRIC-TENSE-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "cyc_const_generalized_tense_operator_p", "CYC-CONST-GENERALIZED-TENSE-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "cyc_const_sentential_relation_p", "CYC-CONST-SENTENTIAL-RELATION-P", 1, 0, false);
    declareFunction(myName, "el_logical_operator_formula_p", "EL-LOGICAL-OPERATOR-FORMULA-P", 1, 0, false);
    declareFunction(myName, "el_zero_arity_formula_p", "EL-ZERO-ARITY-FORMULA-P", 1, 0, false);
    declareFunction(myName, "el_unary_formula_p", "EL-UNARY-FORMULA-P", 1, 0, false);
    declareFunction(myName, "el_binary_formula_p", "EL-BINARY-FORMULA-P", 1, 0, false);
    declareFunction(myName, "el_ternary_formula_p", "EL-TERNARY-FORMULA-P", 1, 0, false);
    declareFunction(myName, "el_quaternary_formula_p", "EL-QUATERNARY-FORMULA-P", 1, 0, false);
    declareFunction(myName, "subl_escape_p", "SUBL-ESCAPE-P", 1, 0, false);
    declareFunction(myName, "expand_subl_fn_p", "EXPAND-SUBL-FN-P", 1, 0, false); new $expand_subl_fn_p$UnaryFunction();
    declareFunction(myName, "subl_quote_p", "SUBL-QUOTE-P", 1, 0, false);
    declareFunction(myName, "quotify_cycl_term", "QUOTIFY-CYCL-TERM", 1, 0, false);
    declareFunction(myName, "possibly_unquote", "POSSIBLY-UNQUOTE", 1, 0, false);
    declareFunction(myName, "possibly_quote", "POSSIBLY-QUOTE", 1, 0, false);
    declareFunction(myName, "epsilon_p", "EPSILON-P", 1, 0, false);
    declareFunction(myName, "cyc_const_exception_operator_p", "CYC-CONST-EXCEPTION-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "el_exception_p", "EL-EXCEPTION-P", 1, 0, false);
    declareFunction(myName, "el_abnormal_p", "EL-ABNORMAL-P", 1, 0, false);
    declareFunction(myName, "cyc_const_pragmatic_requirement_operator_p", "CYC-CONST-PRAGMATIC-REQUIREMENT-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "el_pragmatic_requirement_p", "EL-PRAGMATIC-REQUIREMENT-P", 1, 0, false);
    declareFunction(myName, "el_meets_pragmatic_requirement_p", "EL-MEETS-PRAGMATIC-REQUIREMENT-P", 1, 0, false); new $el_meets_pragmatic_requirement_p$UnaryFunction();
    declareFunction(myName, "el_query_sentence_p", "EL-QUERY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "el_implicit_meta_literal_sentence_p", "EL-IMPLICIT-META-LITERAL-SENTENCE-P", 1, 0, false); new $el_implicit_meta_literal_sentence_p$UnaryFunction();
    declareFunction(myName, "elf_p", "ELF-P", 1, 0, false);
    declareFunction(myName, "el_formula_p", "EL-FORMULA-P", 1, 0, false); new $el_formula_p$UnaryFunction();
    declareFunction(myName, "possibly_fo_naut_p", "POSSIBLY-FO-NAUT-P", 1, 0, false);
    declareFunction(myName, "possibly_fo_represented_term_p", "POSSIBLY-FO-REPRESENTED-TERM-P", 1, 0, false);
    declareFunction(myName, "possibly_nat_p", "POSSIBLY-NAT-P", 1, 0, false);
    declareFunction(myName, "possibly_naut_p", "POSSIBLY-NAUT-P", 1, 0, false);
    declareFunction(myName, "possibly_sentence_p", "POSSIBLY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "possibly_cycl_sentence_p", "POSSIBLY-CYCL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "possibly_sentence_or_variable_p", "POSSIBLY-SENTENCE-OR-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "possibly_inference_sentence_p", "POSSIBLY-INFERENCE-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "possibly_atomic_sentence_p", "POSSIBLY-ATOMIC-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "contains_subformula_p", "CONTAINS-SUBFORMULA-P", 1, 0, false);
    declareFunction(myName, "el_subformulas", "EL-SUBFORMULAS", 1, 0, false);
    declareFunction(myName, "el_general_existential_negation_p", "EL-GENERAL-EXISTENTIAL-NEGATION-P", 1, 0, false);
    declareFunction(myName, "el_universal_negation_p", "EL-UNIVERSAL-NEGATION-P", 1, 0, false);
    declareFunction(myName, "el_quantified_negation_p", "EL-QUANTIFIED-NEGATION-P", 1, 0, false);
    declareFunction(myName, "el_non_empty_list_p", "EL-NON-EMPTY-LIST-P", 1, 0, false);
    declareFunction(myName, "el_empty_list_p", "EL-EMPTY-LIST-P", 1, 0, false);
    declareFunction(myName, "el_list_p", "EL-LIST-P", 1, 0, false);
    declareFunction(myName, "el_set_or_collection_p", "EL-SET-OR-COLLECTION-P", 1, 0, false);
    declareFunction(myName, "el_set_p", "EL-SET-P", 1, 0, false);
    declareFunction(myName, "el_extensional_set_p", "EL-EXTENSIONAL-SET-P", 1, 0, false);
    declareFunction(myName, "el_empty_set_p", "EL-EMPTY-SET-P", 1, 0, false);
    declareFunction(myName, "el_non_empty_set_p", "EL-NON-EMPTY-SET-P", 1, 0, false);
    declareFunction(myName, "el_intensional_set_p", "EL-INTENSIONAL-SET-P", 1, 0, false);
    declareFunction(myName, "make_el_extensional_set", "MAKE-EL-EXTENSIONAL-SET", 1, 0, false);
    declareFunction(myName, "make_el_non_empty_set", "MAKE-EL-NON-EMPTY-SET", 1, 0, false);
    declareFunction(myName, "extensional_set_elements", "EXTENSIONAL-SET-ELEMENTS", 1, 0, false);
    declareFunction(myName, "specs_fn_naut_p", "SPECS-FN-NAUT-P", 1, 0, false);
    declareFunction(myName, "specs_fn_arg", "SPECS-FN-ARG", 1, 0, false);
    declareFunction(myName, "el_sequence_p", "EL-SEQUENCE-P", 1, 0, false);
    declareFunction(myName, "el_proper_sequence_p", "EL-PROPER-SEQUENCE-P", 1, 0, false);
    declareFunction(myName, "groundP", "GROUND?", 1, 1, false);
    declareFunction(myName, "hl_ground_tree_p", "HL-GROUND-TREE-P", 1, 0, false);
    declareFunction(myName, "closedP", "CLOSED?", 1, 1, false);
    declareFunction(myName, "no_free_variablesP", "NO-FREE-VARIABLES?", 1, 1, false);
    declareFunction(myName, "string_to_el_var_name", "STRING-TO-EL-VAR-NAME", 1, 0, false);
    declareFunction(myName, "string_to_el_var_name_int", "STRING-TO-EL-VAR-NAME-INT", 2, 0, false);
    declareFunction(myName, "optimize_el_formula_variable_names", "OPTIMIZE-EL-FORMULA-VARIABLE-NAMES", 1, 2, false);
    declareFunction(myName, "noptimize_el_formula_variable_names", "NOPTIMIZE-EL-FORMULA-VARIABLE-NAMES", 1, 2, false);
    declareFunction(myName, "optimize_el_formula_variable_name", "OPTIMIZE-EL-FORMULA-VARIABLE-NAME", 2, 2, false);
    declareFunction(myName, "correct_variables", "CORRECT-VARIABLES", 1, 0, false);
    declareFunction(myName, "xyz_ify_el_formula_variable_names", "XYZ-IFY-EL-FORMULA-VARIABLE-NAMES", 1, 0, false);
    declareFunction(myName, "next_named_var", "NEXT-NAMED-VAR", 2, 0, false);
    declareFunction(myName, "correct_variable", "CORRECT-VARIABLE", 1, 0, false);
    declareFunction(myName, "simple_variable_rename_impossibleP", "SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?", 2, 0, false);
    declareFunction(myName, "contains_polycanonicalized_existential_quantifier", "CONTAINS-POLYCANONICALIZED-EXISTENTIAL-QUANTIFIER", 2, 0, false);
    declareFunction(myName, "sequence_term", "SEQUENCE-TERM", 1, 0, false);
    declareFunction(myName, "sequence_var", "SEQUENCE-VAR", 1, 1, false);
    declareFunction(myName, "sequence_non_var", "SEQUENCE-NON-VAR", 1, 1, false);
    declareFunction(myName, "maybe_add_sequence_var_to_end", "MAYBE-ADD-SEQUENCE-VAR-TO-END", 2, 0, false);
    declareFunction(myName, "add_sequence_var_to_end", "ADD-SEQUENCE-VAR-TO-END", 2, 0, false);
    declareFunction(myName, "nadd_sequence_var_to_end", "NADD-SEQUENCE-VAR-TO-END", 2, 0, false);
    declareFunction(myName, "strip_sequence_var", "STRIP-SEQUENCE-VAR", 1, 0, false);
    declareFunction(myName, "safe_strip_sequence_var", "SAFE-STRIP-SEQUENCE-VAR", 1, 0, false);
    declareFunction(myName, "formula_with_sequence_termP", "FORMULA-WITH-SEQUENCE-TERM?", 1, 0, false); new $formula_with_sequence_termP$UnaryFunction();
    declareFunction(myName, "el_formula_without_sequence_termP", "EL-FORMULA-WITHOUT-SEQUENCE-TERM?", 1, 0, false);
    declareFunction(myName, "formula_with_sequence_varP", "FORMULA-WITH-SEQUENCE-VAR?", 1, 0, false);
    declareFunction(myName, "formula_with_sequence_non_varP", "FORMULA-WITH-SEQUENCE-NON-VAR?", 1, 0, false);
    declareFunction(myName, "ignore_sequence_vars", "IGNORE-SEQUENCE-VARS", 1, 0, false);
    declareFunction(myName, "regularize_sequence_vars", "REGULARIZE-SEQUENCE-VARS", 1, 0, false);
    declareFunction(myName, "opaquify_subl_escape", "OPAQUIFY-SUBL-ESCAPE", 1, 0, false);
    declareFunction(myName, "opaquify_subl_escapes", "OPAQUIFY-SUBL-ESCAPES", 1, 0, false);
    declareFunction(myName, "nopaquify_subl_escapes", "NOPAQUIFY-SUBL-ESCAPES", 1, 0, false);
    declareFunction(myName, "term_is_one_of_argsP", "TERM-IS-ONE-OF-ARGS?", 2, 0, false);
    declareFunction(myName, "formula_position", "FORMULA-POSITION", 2, 1, false);
    declareFunction(myName, "formula_arity", "FORMULA-ARITY", 1, 1, false);
    declareFunction(myName, "arglist_arity", "ARGLIST-ARITY", 1, 1, false);
    declareFunction(myName, "expression_arity", "EXPRESSION-ARITY", 1, 1, false);
    declareFunction(myName, "formula_length", "FORMULA-LENGTH", 1, 1, false);
    declareFunction(myName, "formula_arityL", "FORMULA-ARITY<", 2, 1, false);
    declareFunction(myName, "formula_arityLE", "FORMULA-ARITY<=", 2, 1, false);
    declareFunction(myName, "formula_arityG", "FORMULA-ARITY>", 2, 1, false);
    declareFunction(myName, "formula_arityGE", "FORMULA-ARITY>=", 2, 1, false);
    declareFunction(myName, "el_formula_arityGE", "EL-FORMULA-ARITY>=", 2, 1, false);
    declareFunction(myName, "formula_arityE", "FORMULA-ARITY=", 2, 1, false);
    declareFunction(myName, "el_formula_arityE", "EL-FORMULA-ARITY=", 2, 1, false);
    declareFunction(myName, "greater_formula_arity_p", "GREATER-FORMULA-ARITY-P", 2, 1, false);
    declareFunction(myName, "same_formula_arity_p", "SAME-FORMULA-ARITY-P", 2, 1, false);
    declareFunction(myName, "greater_or_same_formula_arity_p", "GREATER-OR-SAME-FORMULA-ARITY-P", 2, 1, false);
    declareFunction(myName, "lesser_formula_arity_p", "LESSER-FORMULA-ARITY-P", 2, 1, false);
    declareFunction(myName, "lesser_or_same_formula_arity_p", "LESSER-OR-SAME-FORMULA-ARITY-P", 2, 1, false);
    declareFunction(myName, "first_in_sequence", "FIRST-IN-SEQUENCE", 1, 0, false);
    declareFunction(myName, "rest_of_sequence", "REST-OF-SEQUENCE", 1, 0, false);
    declareFunction(myName, "sentence_quantifier", "SENTENCE-QUANTIFIER", 1, 0, false);
    declareFunction(myName, "quantified_var", "QUANTIFIED-VAR", 1, 0, false);
    declareFunction(myName, "quantified_var_argnum", "QUANTIFIED-VAR-ARGNUM", 1, 0, false);
    declareFunction(myName, "quantified_var_argnum_for_operator", "QUANTIFIED-VAR-ARGNUM-FOR-OPERATOR", 1, 0, false);
    declareFunction(myName, "existential_bound", "EXISTENTIAL-BOUND", 1, 0, false);
    declareFunction(myName, "quantified_sub_sentence", "QUANTIFIED-SUB-SENTENCE", 1, 0, false);
    declareFunction(myName, "quantified_sub_sentence_argnum", "QUANTIFIED-SUB-SENTENCE-ARGNUM", 1, 0, false);
    declareFunction(myName, "quantified_sub_sentence_argnum_for_operator", "QUANTIFIED-SUB-SENTENCE-ARGNUM-FOR-OPERATOR", 1, 0, false);
    declareFunction(myName, "el_list_items", "EL-LIST-ITEMS", 1, 0, false);
    declareFunction(myName, "el_list_length", "EL-LIST-LENGTH", 1, 0, false);
    declareMacro(myName, "do_el_list", "DO-EL-LIST");
    declareMacro(myName, "do_el_list_numbered", "DO-EL-LIST-NUMBERED");
    declareFunction(myName, "el_list_to_subl_list_recursively", "EL-LIST-TO-SUBL-LIST-RECURSIVELY", 1, 0, false);
    declareFunction(myName, "el_list_to_subl_list_recursively_int", "EL-LIST-TO-SUBL-LIST-RECURSIVELY-INT", 1, 0, false);
    declareFunction(myName, "cycl_subl_symbol_symbol", "CYCL-SUBL-SYMBOL-SYMBOL", 1, 0, false);
    declareFunction(myName, "cycl_subl_symbol_symbol_list", "CYCL-SUBL-SYMBOL-SYMBOL-LIST", 1, 0, false);
    declareFunction(myName, "subl_escape_subl", "SUBL-ESCAPE-SUBL", 1, 0, false);
    declareFunction(myName, "el_extensional_set_elements", "EL-EXTENSIONAL-SET-ELEMENTS", 1, 0, false);
    declareFunction(myName, "list_to_elf", "LIST-TO-ELF", 1, 0, false);
    declareFunction(myName, "elf_to_list", "ELF-TO-LIST", 1, 0, false);
    declareFunction(myName, "make_el_formula", "MAKE-EL-FORMULA", 2, 1, false);
    declareFunction(myName, "make_formula", "MAKE-FORMULA", 2, 1, false);
    declareFunction(myName, "copy_formula", "COPY-FORMULA", 1, 0, false);
    declareFunction(myName, "copy_sentence", "COPY-SENTENCE", 1, 0, false);
    declareFunction(myName, "copy_clause", "COPY-CLAUSE", 1, 0, false);
    declareFunction(myName, "copy_clauses", "COPY-CLAUSES", 1, 0, false);
    declareFunction(myName, "copy_expression", "COPY-EXPRESSION", 1, 0, false);
    declareFunction(myName, "make_el_literal", "MAKE-EL-LITERAL", 2, 1, false);
    declareFunction(myName, "make_unary_formula", "MAKE-UNARY-FORMULA", 2, 0, false);
    declareFunction(myName, "make_binary_formula", "MAKE-BINARY-FORMULA", 3, 0, false);
    declareFunction(myName, "make_ternary_formula", "MAKE-TERNARY-FORMULA", 4, 0, false);
    declareFunction(myName, "make_quaternary_formula", "MAKE-QUATERNARY-FORMULA", 5, 0, false);
    declareFunction(myName, "make_negation", "MAKE-NEGATION", 1, 0, false);
    declareFunction(myName, "make_disjunction", "MAKE-DISJUNCTION", 1, 0, false);
    declareFunction(myName, "make_conjunction", "MAKE-CONJUNCTION", 1, 0, false);
    declareFunction(myName, "make_implication", "MAKE-IMPLICATION", 2, 0, false);
    declareFunction(myName, "make_universal", "MAKE-UNIVERSAL", 2, 0, false);
    declareFunction(myName, "make_existential", "MAKE-EXISTENTIAL", 2, 0, false);
    declareFunction(myName, "make_regularly_quantified_sentence", "MAKE-REGULARLY-QUANTIFIED-SENTENCE", 3, 0, false);
    declareFunction(myName, "make_bounded_existential", "MAKE-BOUNDED-EXISTENTIAL", 4, 0, false);
    declareFunction(myName, "make_existential_min", "MAKE-EXISTENTIAL-MIN", 3, 0, false);
    declareFunction(myName, "make_existential_max", "MAKE-EXISTENTIAL-MAX", 3, 0, false);
    declareFunction(myName, "make_existential_exact", "MAKE-EXISTENTIAL-EXACT", 3, 0, false);
    declareFunction(myName, "make_ist_sentence", "MAKE-IST-SENTENCE", 2, 0, false);
    declareFunction(myName, "make_ist_sentence_from_mt_asent_sense", "MAKE-IST-SENTENCE-FROM-MT-ASENT-SENSE", 3, 0, false);
    declareFunction(myName, "make_unary_nat_formula", "MAKE-UNARY-NAT-FORMULA", 2, 0, false);
    declareFunction(myName, "make_binary_nat_formula", "MAKE-BINARY-NAT-FORMULA", 3, 0, false);
    declareFunction(myName, "make_nat_formula", "MAKE-NAT-FORMULA", 2, 0, false);
    declareFunction(myName, "make_el_list", "MAKE-EL-LIST", 1, 1, false);
    declareFunction(myName, "make_el_list_recursively", "MAKE-EL-LIST-RECURSIVELY", 1, 1, false);
    declareFunction(myName, "make_el_list_recursively_int", "MAKE-EL-LIST-RECURSIVELY-INT", 1, 1, false);
    declareFunction(myName, "make_cycl_subl_symbol", "MAKE-CYCL-SUBL-SYMBOL", 1, 0, false);
    declareFunction(myName, "make_el_set", "MAKE-EL-SET", 1, 1, false);
    declareFunction(myName, "el_set_items", "EL-SET-ITEMS", 1, 0, false);
    declareFunction(myName, "make_instance_named", "MAKE-INSTANCE-NAMED", 2, 0, false);
    declareFunction(myName, "make_specs_fn", "MAKE-SPECS-FN", 1, 0, false);
    declareFunction(myName, "unmake_unary_formula", "UNMAKE-UNARY-FORMULA", 1, 0, false);
    declareFunction(myName, "unmake_binary_formula", "UNMAKE-BINARY-FORMULA", 1, 0, false);
    declareFunction(myName, "unmake_ternary_formula", "UNMAKE-TERNARY-FORMULA", 1, 0, false);
    declareFunction(myName, "unmake_quaternary_formula", "UNMAKE-QUATERNARY-FORMULA", 1, 0, false);
    declareFunction(myName, "map_formula_args", "MAP-FORMULA-ARGS", 2, 1, false);
    declareFunction(myName, "nmap_formula_args", "NMAP-FORMULA-ARGS", 2, 1, false);
    declareFunction(myName, "map_formula_terms", "MAP-FORMULA-TERMS", 2, 1, false);
    declareFunction(myName, "nmap_formula_terms", "NMAP-FORMULA-TERMS", 2, 1, false);
    declareFunction(myName, "map_formula_terms_if", "MAP-FORMULA-TERMS-IF", 3, 1, false);
    declareFunction(myName, "map_formula_terms_if_not", "MAP-FORMULA-TERMS-IF-NOT", 3, 1, false);
    declareFunction(myName, "pass_through_if_negation", "PASS-THROUGH-IF-NEGATION", 2, 0, false);
    declareFunction(myName, "pass_through_if_disjunction", "PASS-THROUGH-IF-DISJUNCTION", 2, 0, false);
    declareFunction(myName, "pass_through_if_conjunction", "PASS-THROUGH-IF-CONJUNCTION", 2, 0, false);
    declareFunction(myName, "pass_through_if_regularly_quantified", "PASS-THROUGH-IF-REGULARLY-QUANTIFIED", 2, 0, false);
    declareFunction(myName, "pass_through_if_bounded_existential", "PASS-THROUGH-IF-BOUNDED-EXISTENTIAL", 2, 0, false);
    declareFunction(myName, "pass_through_if_junction", "PASS-THROUGH-IF-JUNCTION", 2, 0, false);
    declareFunction(myName, "pass_through_if_logical_op", "PASS-THROUGH-IF-LOGICAL-OP", 2, 0, false);
    declareFunction(myName, "pass_through_if_quantified", "PASS-THROUGH-IF-QUANTIFIED", 2, 0, false);
    declareFunction(myName, "pass_through_if_logical_op_or_quantified", "PASS-THROUGH-IF-LOGICAL-OP-OR-QUANTIFIED", 2, 0, false);
    declareFunction(myName, "pass_through_if_relation_syntax", "PASS-THROUGH-IF-RELATION-SYNTAX", 2, 0, false);
    declareFunction(myName, "funcall_formula_arg", "FUNCALL-FORMULA-ARG", 3, 0, false);
    declareFunction(myName, "funcall_formula_arg_binary", "FUNCALL-FORMULA-ARG-BINARY", 4, 0, false);
    declareFunction(myName, "replace_formula_arg", "REPLACE-FORMULA-ARG", 3, 0, false);
    declareFunction(myName, "nreplace_formula_arg", "NREPLACE-FORMULA-ARG", 3, 0, false);
    declareFunction(myName, "remove_formula_arg", "REMOVE-FORMULA-ARG", 2, 0, false);
    declareFunction(myName, "replace_formula_arg_position", "REPLACE-FORMULA-ARG-POSITION", 3, 0, false);
    declareFunction(myName, "nreplace_formula_arg_position", "NREPLACE-FORMULA-ARG-POSITION", 3, 0, false);
    declareFunction(myName, "formula_has_arg_position_p", "FORMULA-HAS-ARG-POSITION-P", 2, 0, false);
    declareFunction(myName, "literal_atomic_sentence", "LITERAL-ATOMIC-SENTENCE", 1, 0, false);
    declareFunction(myName, "literal_truth", "LITERAL-TRUTH", 1, 0, false);
    declareFunction(myName, "literal_sense", "LITERAL-SENSE", 1, 0, false);
    declareFunction(myName, "literal_args", "LITERAL-ARGS", 1, 1, false);
    declareFunction(myName, "literal_terms", "LITERAL-TERMS", 1, 1, false);
    declareFunction(myName, "literal_arg", "LITERAL-ARG", 2, 1, false);
    declareFunction(myName, "literal_predicate", "LITERAL-PREDICATE", 1, 1, false);
    declareFunction(myName, "literal_arg0", "LITERAL-ARG0", 1, 1, false);
    declareFunction(myName, "literal_arg1", "LITERAL-ARG1", 1, 1, false);
    declareFunction(myName, "literal_arg2", "LITERAL-ARG2", 1, 1, false);
    declareFunction(myName, "literal_arg3", "LITERAL-ARG3", 1, 1, false);
    declareFunction(myName, "literal_arg4", "LITERAL-ARG4", 1, 1, false);
    declareFunction(myName, "literal_arg5", "LITERAL-ARG5", 1, 1, false);
    declareFunction(myName, "literal_arity", "LITERAL-ARITY", 1, 1, false);
    declareFunction(myName, "asent_and_sense_to_literal", "ASENT-AND-SENSE-TO-LITERAL", 2, 0, false);
    declareFunction(myName, "asent_and_truth_to_literal", "ASENT-AND-TRUTH-TO-LITERAL", 2, 0, false);
    declareFunction(myName, "el_negative_sentences", "EL-NEGATIVE-SENTENCES", 1, 0, false);
    declareFunction(myName, "el_positive_sentences", "EL-POSITIVE-SENTENCES", 1, 0, false);
    declareFunction(myName, "isa_lits", "ISA-LITS", 1, 0, false);
    declareFunction(myName, "tou_lits", "TOU-LITS", 1, 0, false);
    declareFunction(myName, "equals_lits", "EQUALS-LITS", 1, 0, false);
    declareFunction(myName, "evaluate_lits", "EVALUATE-LITS", 1, 0, false);
    declareFunction(myName, "ab_lits", "AB-LITS", 1, 0, false);
    declareFunction(myName, "meets_pragmatic_requirement_asents", "MEETS-PRAGMATIC-REQUIREMENT-ASENTS", 1, 0, false);
    declareFunction(myName, "pred_lits", "PRED-LITS", 2, 0, false);
    declareFunction(myName, "reflexive_lits", "REFLEXIVE-LITS", 1, 0, false);
    declareFunction(myName, "remove_tou_lits", "REMOVE-TOU-LITS", 1, 0, false);
    declareFunction(myName, "el_negated_literal_p", "EL-NEGATED-LITERAL-P", 1, 0, false);
    declareFunction(myName, "unary_lit_p", "UNARY-LIT-P", 1, 0, false);
    declareFunction(myName, "binary_lit_p", "BINARY-LIT-P", 1, 0, false);
    declareFunction(myName, "pred_litP", "PRED-LIT?", 2, 0, false);
    declareFunction(myName, "ab_litP", "AB-LIT?", 1, 0, false);
    declareFunction(myName, "isa_litP", "ISA-LIT?", 1, 0, false);
    declareFunction(myName, "isa_var_fort_litP", "ISA-VAR-FORT-LIT?", 1, 0, false);
    declareFunction(myName, "isa_var_var_litP", "ISA-VAR-VAR-LIT?", 1, 0, false);
    declareFunction(myName, "isa_hl_var_hl_var_litP", "ISA-HL-VAR-HL-VAR-LIT?", 1, 0, false);
    declareFunction(myName, "isa_hl_var_thing_litP", "ISA-HL-VAR-THING-LIT?", 1, 0, false);
    declareFunction(myName, "quoted_isa_litP", "QUOTED-ISA-LIT?", 1, 0, false);
    declareFunction(myName, "genls_litP", "GENLS-LIT?", 1, 0, false);
    declareFunction(myName, "genl_preds_litP", "GENL-PREDS-LIT?", 1, 0, false);
    declareFunction(myName, "genl_inverse_litP", "GENL-INVERSE-LIT?", 1, 0, false);
    declareFunction(myName, "genl_mt_litP", "GENL-MT-LIT?", 1, 0, false);
    declareFunction(myName, "result_isa_litP", "RESULT-ISA-LIT?", 1, 0, false);
    declareFunction(myName, "result_genl_litP", "RESULT-GENL-LIT?", 1, 0, false);
    declareFunction(myName, "tou_litP", "TOU-LIT?", 1, 0, false);
    declareFunction(myName, "tou_asentP", "TOU-ASENT?", 1, 0, false);
    declareFunction(myName, "equals_litP", "EQUALS-LIT?", 1, 0, false);
    declareFunction(myName, "holds_in_litP", "HOLDS-IN-LIT?", 1, 0, false);
    declareFunction(myName, "true_sentence_litP", "TRUE-SENTENCE-LIT?", 1, 0, false);
    declareFunction(myName, "forward_non_trigger_literal_litP", "FORWARD-NON-TRIGGER-LITERAL-LIT?", 1, 0, false); new $forward_non_trigger_literal_litP$UnaryFunction();
    declareFunction(myName, "evaluate_litP", "EVALUATE-LIT?", 1, 1, false);
    declareFunction(myName, "evaluatable_el_expressionP", "EVALUATABLE-EL-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "datum_constantP", "DATUM-CONSTANT?", 1, 0, false);
    declareFunction(myName, "arg_isa_binary_litP", "ARG-ISA-BINARY-LIT?", 1, 0, false);
    declareFunction(myName, "reflexive_litP", "REFLEXIVE-LIT?", 1, 0, false);
    declareFunction(myName, "naut_equals_litP", "NAUT-EQUALS-LIT?", 1, 0, false);
    declareFunction(myName, "ist_sentence_p", "IST-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "ist_of_atomic_sentence_p", "IST-OF-ATOMIC-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "ist_of_atomic_sentence_with_pred_p", "IST-OF-ATOMIC-SENTENCE-WITH-PRED-P", 2, 0, false);
    declareFunction(myName, "ist_of_atomic_sentence_int", "IST-OF-ATOMIC-SENTENCE-INT", 2, 0, false);
    declareFunction(myName, "ist_sentence_with_chlmt_p", "IST-SENTENCE-WITH-CHLMT-P", 1, 0, false);
    declareFunction(myName, "true_sentence_p", "TRUE-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "true_sentence_of_atomic_sentence_p", "TRUE-SENTENCE-OF-ATOMIC-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "negated_true_sentence_p", "NEGATED-TRUE-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "max_literal_count", "MAX-LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "literal_count", "LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "kappa_asent_p", "KAPPA-ASENT-P", 1, 0, false);
    declareFunction(myName, "kappa_predicate_p", "KAPPA-PREDICATE-P", 1, 0, false); new $kappa_predicate_p$UnaryFunction();
    declareFunction(myName, "kappa_predicate_formal_args", "KAPPA-PREDICATE-FORMAL-ARGS", 1, 0, false);
    declareFunction(myName, "kappa_predicate_arity", "KAPPA-PREDICATE-ARITY", 1, 0, false);
    declareFunction(myName, "kappa_predicate_query", "KAPPA-PREDICATE-QUERY", 1, 0, false);
    declareFunction(myName, "lambda_function_p", "LAMBDA-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "lambda_function_formal_args", "LAMBDA-FUNCTION-FORMAL-ARGS", 1, 0, false);
    declareFunction(myName, "lambda_function_arity", "LAMBDA-FUNCTION-ARITY", 1, 0, false);
    declareFunction(myName, "lambda_function_expression", "LAMBDA-FUNCTION-EXPRESSION", 1, 0, false);
    declareFunction(myName, "mt_designating_literalP", "MT-DESIGNATING-LITERAL?", 1, 0, false);
    declareFunction(myName, "mt_designating_formulaP", "MT-DESIGNATING-FORMULA?", 1, 0, false);
    declareFunction(myName, "mt_designation_argnum", "MT-DESIGNATION-ARGNUM", 1, 0, false);
    declareFunction(myName, "designated_mt", "DESIGNATED-MT", 1, 0, false);
    declareFunction(myName, "sentence_designation_argnum", "SENTENCE-DESIGNATION-ARGNUM", 1, 0, false);
    declareFunction(myName, "designated_sentence", "DESIGNATED-SENTENCE", 1, 0, false);
    declareFunction(myName, "valid_argnum_p", "VALID-ARGNUM-P", 1, 0, false);
    declareFunction(myName, "valid_arity_p", "VALID-ARITY-P", 1, 0, false);
    declareFunction(myName, "explicitify_implicit_universal_quantifiers", "EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false);
    declareFunction(myName, "implicitify_explicit_universal_quantifiers", "IMPLICITIFY-EXPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false);
    declareFunction(myName, "explicitify_implicit_existential_quantifiers", "EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false);
    declareFunction(myName, "recursive_nat_functor", "RECURSIVE-NAT-FUNCTOR", 1, 0, false);
    declareFunction(myName, "predicate_specP", "PREDICATE-SPEC?", 1, 1, false);
    declareFunction(myName, "function_specP", "FUNCTION-SPEC?", 1, 1, false);
    declareFunction(myName, "expand_join_left", "EXPAND-JOIN-LEFT", 1, 0, false);
    declareFunction(myName, "true_sentence_case_insensitive_expansion", "TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION", 1, 0, false);
    declareFunction(myName, "true_sentence_case_insensitive_expansion_int", "TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION-INT", 1, 0, false);
    declareFunction(myName, "sentence_has_true_sentence_case_insensitive_supportP", "SENTENCE-HAS-TRUE-SENTENCE-CASE-INSENSITIVE-SUPPORT?", 1, 0, false);
    declareFunction(myName, "sentence_has_nontrivial_true_sentence_case_insensitive_supportP", "SENTENCE-HAS-NONTRIVIAL-TRUE-SENTENCE-CASE-INSENSITIVE-SUPPORT?", 1, 0, false);
    declareFunction(myName, "el_relation_expressionP", "EL-RELATION-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "hl_relation_expressionP", "HL-RELATION-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "relation_expressionP", "RELATION-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "el_formulaP", "EL-FORMULA?", 1, 0, false);
    declareFunction(myName, "el_atomic_sentenceP", "EL-ATOMIC-SENTENCE?", 1, 0, false);
    declareFunction(myName, "el_non_atomic_sentenceP", "EL-NON-ATOMIC-SENTENCE?", 1, 0, false);
    declareFunction(myName, "literalP", "LITERAL?", 1, 0, false);
    declareFunction(myName, "atomic_sentenceP", "ATOMIC-SENTENCE?", 1, 0, false);
    declareFunction(myName, "gafP", "GAF?", 1, 0, false); new $gafP$UnaryFunction();
    declareFunction(myName, "cafP", "CAF?", 1, 0, false);
    declareFunction(myName, "el_var_listP", "EL-VAR-LIST?", 1, 0, false);
    declareFunction(myName, "formula_non_var_symbols", "FORMULA-NON-VAR-SYMBOLS", 1, 1, false);
    declareFunction(myName, "referenced_variables", "REFERENCED-VARIABLES", 1, 1, false);
    declareFunction(myName, "sentence_variables", "SENTENCE-VARIABLES", 1, 2, false);
    declareFunction(myName, "literal_variables", "LITERAL-VARIABLES", 1, 2, false);
    declareFunction(myName, "naut_variables", "NAUT-VARIABLES", 1, 2, false);
    declareFunction(myName, "relation_variables", "RELATION-VARIABLES", 1, 2, false);
    declareFunction(myName, "scoped_vars", "SCOPED-VARS", 1, 1, false);
    declareFunction(myName, "literals_variables", "LITERALS-VARIABLES", 1, 1, false);
    declareFunction(myName, "literals_free_sequence_variables", "LITERALS-FREE-SEQUENCE-VARIABLES", 1, 2, false);
    declareFunction(myName, "literal_free_sequence_variables", "LITERAL-FREE-SEQUENCE-VARIABLES", 1, 2, false);
    declareFunction(myName, "naut_free_sequence_variables", "NAUT-FREE-SEQUENCE-VARIABLES", 1, 2, false);
    declareFunction(myName, "possibly_formula_with_sequence_variablesP", "POSSIBLY-FORMULA-WITH-SEQUENCE-VARIABLES?", 1, 0, false);
    declareFunction(myName, "relation_free_sequence_variables", "RELATION-FREE-SEQUENCE-VARIABLES", 1, 2, false);
    declareFunction(myName, "sentence_free_term_variables", "SENTENCE-FREE-TERM-VARIABLES", 1, 2, false);
    declareFunction(myName, "sentence_free_sequence_variables", "SENTENCE-FREE-SEQUENCE-VARIABLES", 1, 2, false);
    declareFunction(myName, "occurs_as_sequence_variableP", "OCCURS-AS-SEQUENCE-VARIABLE?", 2, 0, false);
    declareFunction(myName, "occurs_as_term_variableP", "OCCURS-AS-TERM-VARIABLE?", 2, 0, false);
    declareFunction(myName, "occurs_as_sequence_variable_in_clauseP", "OCCURS-AS-SEQUENCE-VARIABLE-IN-CLAUSE?", 2, 0, false);
    declareFunction(myName, "occurs_as_term_variable_in_clauseP", "OCCURS-AS-TERM-VARIABLE-IN-CLAUSE?", 2, 0, false);
    declareFunction(myName, "formula_has_term_in_argnumP", "FORMULA-HAS-TERM-IN-ARGNUM?", 3, 0, false);
    declareFunction(myName, "term_occurs_as_formula_argument", "TERM-OCCURS-AS-FORMULA-ARGUMENT", 2, 0, false);
    declareFunction(myName, "appearing_as_both_sequence_and_term_variables", "APPEARING-AS-BOTH-SEQUENCE-AND-TERM-VARIABLES", 1, 0, false);
    declareFunction(myName, "formula_with_variable_appearing_as_both_sequence_and_term_variableP", "FORMULA-WITH-VARIABLE-APPEARING-AS-BOTH-SEQUENCE-AND-TERM-VARIABLE?", 1, 0, false);
    declareFunction(myName, "sentence_term_variables", "SENTENCE-TERM-VARIABLES", 1, 1, false);
    declareFunction(myName, "sentence_sequence_variables", "SENTENCE-SEQUENCE-VARIABLES", 1, 1, false);
    declareFunction(myName, "wf_wrt_sequence_varsP", "WF-WRT-SEQUENCE-VARS?", 1, 0, false);
    declareFunction(myName, "subformulas_wf_wrt_sequence_varsP", "SUBFORMULAS-WF-WRT-SEQUENCE-VARS?", 1, 0, false);
    declareFunction(myName, "conditional_sentence_free_variables", "CONDITIONAL-SENTENCE-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "sentence_free_variables", "SENTENCE-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "sentence_free_variables_int", "SENTENCE-FREE-VARIABLES-INT", 1, 3, false);
    declareFunction(myName, "literals_free_variables", "LITERALS-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "literal_free_variables", "LITERAL-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "naut_free_variables", "NAUT-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "relation_free_variables", "RELATION-FREE-VARIABLES", 1, 3, false);
    declareFunction(myName, "relation_closed_variables", "RELATION-CLOSED-VARIABLES", 1, 1, false);
    declareFunction(myName, "expression_free_variables", "EXPRESSION-FREE-VARIABLES", 1, 1, false);
    declareFunction(myName, "expression_shared_free_variables", "EXPRESSION-SHARED-FREE-VARIABLES", 2, 1, false);
    declareFunction(myName, "formula_quantified_vars", "FORMULA-QUANTIFIED-VARS", 1, 0, false);
    declareFunction(myName, "formula_quantified_vars_int", "FORMULA-QUANTIFIED-VARS-INT", 1, 0, false);
    declareFunction(myName, "variable_subst", "VARIABLE-SUBST", 3, 0, false);
    declareFunction(myName, "formula_denoting_collectionP", "FORMULA-DENOTING-COLLECTION?", 1, 0, false);
    declareFunction(myName, "sentence_denoting_collectionP", "SENTENCE-DENOTING-COLLECTION?", 1, 0, false);
    declareFunction(myName, "scoping_relation_expressionP", "SCOPING-RELATION-EXPRESSION?", 1, 0, false); new $scoping_relation_expressionP$UnaryFunction();
    declareFunction(myName, "arg_types_of_expression_prescribe_unreifiedP", "ARG-TYPES-OF-EXPRESSION-PRESCRIBE-UNREIFIED?", 2, 0, false);
    declareFunction(myName, "arg_types_prescribe_unreifiedP", "ARG-TYPES-PRESCRIBE-UNREIFIED?", 2, 0, false);
    declareFunction(myName, "arg_types_prescribe_tacit_term_listP", "ARG-TYPES-PRESCRIBE-TACIT-TERM-LIST?", 2, 0, false);
    declareFunction(myName, "to_be_killed_warning", "TO-BE-KILLED-WARNING", 1, 2, false);
    declareFunction(myName, "el_error", "EL-ERROR", 2, 3, false);
    declareFunction(myName, "el_warn", "EL-WARN", 2, 3, false);
    declareFunction(myName, "el_tracing_p", "EL-TRACING-P", 0, 1, false);
    declareFunction(myName, "el_remove_outermost_existentials", "EL-REMOVE-OUTERMOST-EXISTENTIALS", 1, 0, false);
    declareFunction(myName, "el_remove_unnecessary_existentials", "EL-REMOVE-UNNECESSARY-EXISTENTIALS", 1, 0, false);
    declareFunction(myName, "el_remove_unnecessary_existentials_1", "EL-REMOVE-UNNECESSARY-EXISTENTIALS-1", 2, 0, false);
    declareFunction(myName, "el_remove_unnecessary_existentials_2", "EL-REMOVE-UNNECESSARY-EXISTENTIALS-2", 1, 0, false);
    declareFunction(myName, "el_remove_unnecessary_equality", "EL-REMOVE-UNNECESSARY-EQUALITY", 1, 0, false);
    declareFunction(myName, "el_remove_unnecessary_conjunctions", "EL-REMOVE-UNNECESSARY-CONJUNCTIONS", 1, 0, false);
    declareFunction(myName, "el_vars_unifiedP", "EL-VARS-UNIFIED?", 3, 0, false);
    declareFunction(myName, "el_vars_unifiedP_int", "EL-VARS-UNIFIED?-INT", 3, 0, false);
    declareFunction(myName, "el_var_unification_in_expression", "EL-VAR-UNIFICATION-IN-EXPRESSION", 2, 0, false);
    declareFunction(myName, "remove_el_duplicates", "REMOVE-EL-DUPLICATES", 1, 3, false);
    declareFunction(myName, "binding_lists_to_expression", "BINDING-LISTS-TO-EXPRESSION", 1, 0, false);
    declareFunction(myName, "expression_to_binding_lists", "EXPRESSION-TO-BINDING-LISTS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_el_utilities_file() {
    $cyc_const_unary_logical_ops$ = defconstant("*CYC-CONST-UNARY-LOGICAL-OPS*", list($const0$not));
    $cyc_const_binary_logical_ops$ = defconstant("*CYC-CONST-BINARY-LOGICAL-OPS*", list($const3$implies, $const5$xor, $const4$equiv));
    $cyc_const_ternary_logical_ops$ = defconstant("*CYC-CONST-TERNARY-LOGICAL-OPS*", NIL);
    $cyc_const_quaternary_logical_ops$ = defconstant("*CYC-CONST-QUATERNARY-LOGICAL-OPS*", NIL);
    $cyc_const_quintary_logical_ops$ = defconstant("*CYC-CONST-QUINTARY-LOGICAL-OPS*", NIL);
    $cyc_const_variable_arity_logical_ops$ = defconstant("*CYC-CONST-VARIABLE-ARITY-LOGICAL-OPS*", list($const2$and, $const1$or));
    $cyc_const_regular_quantifiers$ = defconstant("*CYC-CONST-REGULAR-QUANTIFIERS*", list($const7$thereExists, $const6$forAll));
    $cyc_const_bounded_existentials$ = defconstant("*CYC-CONST-BOUNDED-EXISTENTIALS*", list($const10$thereExistExactly, $const9$thereExistAtMost, $const8$thereExistAtLeast));
    $cyc_const_tense_operators$ = defconstant("*CYC-CONST-TENSE-OPERATORS*", $list11);
    $cyc_const_metric_tense_operators$ = defconstant("*CYC-CONST-METRIC-TENSE-OPERATORS*", $list12);
    $cyc_const_exception_operators$ = defconstant("*CYC-CONST-EXCEPTION-OPERATORS*", list($const22$exceptFor, $const23$exceptWhen));
    $cyc_const_pragmatic_requirement_operators$ = defconstant("*CYC-CONST-PRAGMATIC-REQUIREMENT-OPERATORS*", list($const25$pragmaticRequirement));
    $standard_single_letter_el_var_names$ = deflexical("*STANDARD-SINGLE-LETTER-EL-VAR-NAMES*", $list48);
    $dont_enforce_subl_escape_in_symbols$ = defparameter("*DONT-ENFORCE-SUBL-ESCAPE-IN-SYMBOLS*", T);
    $arg1_subl_list_relations$ = deflexical("*ARG1-SUBL-LIST-RELATIONS*", $list129);
    $arg2_subl_list_relations$ = deflexical("*ARG2-SUBL-LIST-RELATIONS*", $list130);
    return NIL;
  }

  public static final SubLObject setup_el_utilities_file() {
        utilities_macros.register_cyc_api_function($sym40$GROUND_, $list41, $str42$Returns_whether_EXPRESSION_is_fre, NIL, $list43);
    access_macros.register_external_symbol($sym45$OPTIMIZE_EL_FORMULA_VARIABLE_NAME);
    access_macros.register_external_symbol($sym68$MAKE_EL_FORMULA);
    utilities_macros.register_kb_function($sym109$EXPAND_JOIN_LEFT);
    utilities_macros.register_kb_function($sym110$TRUE_SENTENCE_CASE_INSENSITIVE_EXPANSION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLObject $const1$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLObject $const2$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLObject $const3$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLObject $const4$equiv = constant_handles.reader_make_constant_shell(makeString("equiv"));
  public static final SubLObject $const5$xor = constant_handles.reader_make_constant_shell(makeString("xor"));
  public static final SubLObject $const6$forAll = constant_handles.reader_make_constant_shell(makeString("forAll"));
  public static final SubLObject $const7$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLObject $const8$thereExistAtLeast = constant_handles.reader_make_constant_shell(makeString("thereExistAtLeast"));
  public static final SubLObject $const9$thereExistAtMost = constant_handles.reader_make_constant_shell(makeString("thereExistAtMost"));
  public static final SubLObject $const10$thereExistExactly = constant_handles.reader_make_constant_shell(makeString("thereExistExactly"));
  public static final SubLList $list11 = list(constant_handles.reader_make_constant_shell(makeString("was")), constant_handles.reader_make_constant_shell(makeString("hasAlwaysBeen")), constant_handles.reader_make_constant_shell(makeString("willBe")), constant_handles.reader_make_constant_shell(makeString("willAlwaysBe")));
  public static final SubLList $list12 = list(constant_handles.reader_make_constant_shell(makeString("was-Metric")), constant_handles.reader_make_constant_shell(makeString("willBe-Metric")));
  public static final SubLObject $const13$was = constant_handles.reader_make_constant_shell(makeString("was"));
  public static final SubLObject $const14$hasAlwaysBeen = constant_handles.reader_make_constant_shell(makeString("hasAlwaysBeen"));
  public static final SubLObject $const15$willBe = constant_handles.reader_make_constant_shell(makeString("willBe"));
  public static final SubLObject $const16$willAlwaysBe = constant_handles.reader_make_constant_shell(makeString("willAlwaysBe"));
  public static final SubLObject $const17$was_Metric = constant_handles.reader_make_constant_shell(makeString("was-Metric"));
  public static final SubLObject $const18$willBe_Metric = constant_handles.reader_make_constant_shell(makeString("willBe-Metric"));
  public static final SubLObject $const19$ExpandSubLFn = constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn"));
  public static final SubLObject $const20$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));
  public static final SubLObject $const21$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLObject $const22$exceptFor = constant_handles.reader_make_constant_shell(makeString("exceptFor"));
  public static final SubLObject $const23$exceptWhen = constant_handles.reader_make_constant_shell(makeString("exceptWhen"));
  public static final SubLObject $const24$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLObject $const25$pragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("pragmaticRequirement"));
  public static final SubLObject $const26$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("meetsPragmaticRequirement"));
  public static final SubLObject $const27$querySentence = constant_handles.reader_make_constant_shell(makeString("querySentence"));
  public static final SubLSymbol $kw28$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym29$EL_RELATION_EXPRESSION_ = makeSymbol("EL-RELATION-EXPRESSION?");
  public static final SubLObject $const30$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLSymbol $kw31$INCLUDE = makeKeyword("INCLUDE");
  public static final SubLObject $const32$TheEmptyList = constant_handles.reader_make_constant_shell(makeString("TheEmptyList"));
  public static final SubLObject $const33$TheEmptySet = constant_handles.reader_make_constant_shell(makeString("TheEmptySet"));
  public static final SubLObject $const34$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLObject $const35$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLSymbol $sym36$LISTP = makeSymbol("LISTP");
  public static final SubLString $str37$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
  public static final SubLObject $const38$SpecsFn = constant_handles.reader_make_constant_shell(makeString("SpecsFn"));
  public static final SubLSymbol $sym39$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym40$GROUND_ = makeSymbol("GROUND?");
  public static final SubLList $list41 = list(makeSymbol("EXPRESSION"), makeSymbol("&OPTIONAL"), list(makeSymbol("VAR?"), list(makeSymbol("QUOTE"), makeSymbol("CYC-VAR?"))));
  public static final SubLString $str42$Returns_whether_EXPRESSION_is_fre = makeString("Returns whether EXPRESSION is free of any variables?");
  public static final SubLList $list43 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym44$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLSymbol $sym45$OPTIMIZE_EL_FORMULA_VARIABLE_NAME = makeSymbol("OPTIMIZE-EL-FORMULA-VARIABLE-NAME");
  public static final SubLSymbol $sym46$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym47$EL_SENTENCE_P = makeSymbol("EL-SENTENCE-P");
  public static final SubLList $list48 = list(new SubLObject[] {makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"), makeSymbol("?W"), makeSymbol("?V"), makeSymbol("?U"), makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"), makeSymbol("?F"), makeSymbol("?G"), makeSymbol("?H"), makeSymbol("?I"), makeSymbol("?J"), makeSymbol("?K"), makeSymbol("?L"), makeSymbol("?M"), makeSymbol("?N"), makeSymbol("?O"), makeSymbol("?P"), makeSymbol("?Q"), makeSymbol("?R"), makeSymbol("?S"), makeSymbol("?T")});
  public static final SubLString $str49$_1 = makeString("-1");
  public static final SubLSymbol $sym50$INVALID_VARIABLE_NAME_CHAR = makeSymbol("INVALID-VARIABLE-NAME-CHAR");
  public static final SubLObject $const51$ExistentialQuantifier = constant_handles.reader_make_constant_shell(makeString("ExistentialQuantifier"));
  public static final SubLSymbol $sym52$SUBL_ESCAPE_P = makeSymbol("SUBL-ESCAPE-P");
  public static final SubLList $list53 = list(makeKeyword("OPAQUE-EL-VARIABLE-LIST"), makeKeyword("OPAQUE-SUBL-TEMPLATE"));
  public static final SubLList $list54 = list(makeKeyword("OPAQUE-SUBL-TEMPLATE"));
  public static final SubLString $str55$unexpected_subl_escape_type__s = makeString("unexpected subl escape type ~s");
  public static final SubLSymbol $sym56$OPAQUIFY_SUBL_ESCAPE = makeSymbol("OPAQUIFY-SUBL-ESCAPE");
  public static final SubLString $str57$not_a_known_quantifier___s = makeString("not a known quantifier: ~s");
  public static final SubLString $str58$not_quantified_sentence___s = makeString("not quantified sentence: ~s");
  public static final SubLSymbol $sym59$EL_LIST_P = makeSymbol("EL-LIST-P");
  public static final SubLList $list60 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("EL-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym61$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym62$EL_LIST_ITEMS = makeSymbol("EL-LIST-ITEMS");
  public static final SubLList $list63 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("NUMBER-VAR"), makeSymbol("EL-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym64$CDOLIST_NUMBERED = makeSymbol("CDOLIST-NUMBERED");
  public static final SubLSymbol $sym65$EL_SET_P = makeSymbol("EL-SET-P");
  public static final SubLSymbol $sym66$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym67$ELF_P = makeSymbol("ELF-P");
  public static final SubLSymbol $sym68$MAKE_EL_FORMULA = makeSymbol("MAKE-EL-FORMULA");
  public static final SubLObject $const69$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym70$LIST_WITHOUT_REPETITION_P = makeSymbol("LIST-WITHOUT-REPETITION-P");
  public static final SubLObject $const71$InstanceNamedFn = constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn"));
  public static final SubLSymbol $kw72$HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");
  public static final SubLSymbol $kw73$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLSymbol $kw74$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw75$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym76$EL_NEGATION_P = makeSymbol("EL-NEGATION-P");
  public static final SubLSymbol $sym77$ISA_LIT_ = makeSymbol("ISA-LIT?");
  public static final SubLSymbol $sym78$TOU_LIT_ = makeSymbol("TOU-LIT?");
  public static final SubLSymbol $sym79$EQUALS_LIT_ = makeSymbol("EQUALS-LIT?");
  public static final SubLSymbol $sym80$EVALUATE_LIT_ = makeSymbol("EVALUATE-LIT?");
  public static final SubLSymbol $sym81$AB_LIT_ = makeSymbol("AB-LIT?");
  public static final SubLSymbol $sym82$EL_MEETS_PRAGMATIC_REQUIREMENT_P = makeSymbol("EL-MEETS-PRAGMATIC-REQUIREMENT-P");
  public static final SubLObject $const83$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const84$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLObject $const85$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLObject $const86$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const87$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const88$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const89$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLObject $const90$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLObject $const91$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));
  public static final SubLObject $const92$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLObject $const93$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLObject $const94$holdsIn = constant_handles.reader_make_constant_shell(makeString("holdsIn"));
  public static final SubLObject $const95$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLObject $const96$forwardNonTriggerLiteral = constant_handles.reader_make_constant_shell(makeString("forwardNonTriggerLiteral"));
  public static final SubLObject $const97$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
  public static final SubLSymbol $sym98$CYCL_LITERAL_P = makeSymbol("CYCL-LITERAL-P");
  public static final SubLObject $const99$Kappa = constant_handles.reader_make_constant_shell(makeString("Kappa"));
  public static final SubLObject $const100$Lambda = constant_handles.reader_make_constant_shell(makeString("Lambda"));
  public static final SubLSymbol $sym101$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const102$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const103$microtheoryDesignationArgnum = constant_handles.reader_make_constant_shell(makeString("microtheoryDesignationArgnum"));
  public static final SubLObject $const104$sentenceDesignationArgnum = constant_handles.reader_make_constant_shell(makeString("sentenceDesignationArgnum"));
  public static final SubLString $str105$Tried_to_recursively_determine_th = makeString("Tried to recursively determine the functor of ~A, but it was not either a fort or an EL formula.");
  public static final SubLSymbol $sym106$VAR_SPEC_ = makeSymbol("VAR-SPEC?");
  public static final SubLObject $const107$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));
  public static final SubLObject $const108$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLSymbol $sym109$EXPAND_JOIN_LEFT = makeSymbol("EXPAND-JOIN-LEFT");
  public static final SubLSymbol $sym110$TRUE_SENTENCE_CASE_INSENSITIVE_EXPANSION = makeSymbol("TRUE-SENTENCE-CASE-INSENSITIVE-EXPANSION");
  public static final SubLString $str111$termPhrases_CaseInsensitive = makeString("termPhrases-CaseInsensitive");
  public static final SubLObject $const112$termPhrases = constant_handles.reader_make_constant_shell(makeString("termPhrases"));
  public static final SubLSymbol $sym113$ALPHABETIC_STRING_ = makeSymbol("ALPHABETIC-STRING?");
  public static final SubLObject $const114$regexStringMatch = constant_handles.reader_make_constant_shell(makeString("regexStringMatch"));
  public static final SubLString $str115$regexStringMatch_CaseInsensitive = makeString("regexStringMatch-CaseInsensitive");
  public static final SubLObject $const116$trueSentence_CaseInsensitive = constant_handles.reader_make_constant_shell(makeString("trueSentence-CaseInsensitive"));
  public static final SubLString $str117$_S_is_not_well_formed_ = makeString("~S is not well formed.");
  public static final SubLSymbol $sym118$DOTTED_LIST_P = makeSymbol("DOTTED-LIST-P");
  public static final SubLSymbol $sym119$SCOPING_RELATION_EXPRESSION_ = makeSymbol("SCOPING-RELATION-EXPRESSION?");
  public static final SubLSymbol $sym120$FORMULA_WITH_SEQUENCE_NON_VAR_ = makeSymbol("FORMULA-WITH-SEQUENCE-NON-VAR?");
  public static final SubLSymbol $sym121$EL_IMPLICATION_P = makeSymbol("EL-IMPLICATION-P");
  public static final SubLSymbol $sym122$SCOPING_RELATION_P = makeSymbol("SCOPING-RELATION-P");
  public static final SubLSymbol $sym123$CYCL_QUOTED_TERM_P = makeSymbol("CYCL-QUOTED-TERM-P");
  public static final SubLSymbol $sym124$EXPAND_SUBL_FN_P = makeSymbol("EXPAND-SUBL-FN-P");
  public static final SubLSymbol $sym125$FAST_ESCAPE_QUOTE_TERM_P = makeSymbol("FAST-ESCAPE-QUOTE-TERM-P");
  public static final SubLSymbol $sym126$FORMULA_QUANTIFIED_VARS_INT = makeSymbol("FORMULA-QUANTIFIED-VARS-INT");
  public static final SubLObject $const127$CycLFormula = constant_handles.reader_make_constant_shell(makeString("CycLFormula"));
  public static final SubLObject $const128$CycLSentence = constant_handles.reader_make_constant_shell(makeString("CycLSentence"));
  public static final SubLList $list129 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn")), constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn")), constant_handles.reader_make_constant_shell(makeString("SkolemFuncNFn")), constant_handles.reader_make_constant_shell(makeString("Lambda")), constant_handles.reader_make_constant_shell(makeString("Kappa")), constant_handles.reader_make_constant_shell(makeString("initialSublists")), constant_handles.reader_make_constant_shell(makeString("NestedDagFn")), constant_handles.reader_make_constant_shell(makeString("SubDagFn")), constant_handles.reader_make_constant_shell(makeString("UnifyFn")), constant_handles.reader_make_constant_shell(makeString("DagFn"))});
  public static final SubLList $list130 = list(constant_handles.reader_make_constant_shell(makeString("initialSublists")), constant_handles.reader_make_constant_shell(makeString("accessSlotForType")), constant_handles.reader_make_constant_shell(makeString("ksImportationTemplate")), constant_handles.reader_make_constant_shell(makeString("NestedDagFn")), constant_handles.reader_make_constant_shell(makeString("SubDagFn")), constant_handles.reader_make_constant_shell(makeString("UnifyFn")));
  public static final SubLString $str131$You_re_calling_the_function___A__ = makeString("You're calling the function '~A' which is going to be killed!");
  public static final SubLString $str132$__Replace_all_calls_to_it_with___ = makeString("  Replace all calls to it with '~A' instead!");
  public static final SubLString $str133$__Notify__A_if_you_receive_this_w = makeString("  Notify ~A if you receive this warning and do not know how to fix it.");
  public static final SubLString $str134$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $sym135$EL_VARIABLE_ = makeSymbol("EL-VARIABLE?");
  public static final SubLSymbol $kw136$POS = makeKeyword("POS");
  public static final SubLObject $const137$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const138$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLString $str139$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym140$EQUALS_EL_MEMOIZED_ = makeSymbol("EQUALS-EL-MEMOIZED?");
  public static final SubLList $list141 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLList $list142 = list(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

  //// Initializers

  public void declareFunctions() {
    declare_el_utilities_file();
  }

  public void initializeVariables() {
    init_el_utilities_file();
  }

  public void runTopLevelForms() {
    setup_el_utilities_file();
  }

}
