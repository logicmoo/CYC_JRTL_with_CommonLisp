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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_interface;
//dm import com.cyc.cycjava_1.cycl.assertions_low;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.canon_tl;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.hl_storage_modules;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.keyhash;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class assertions_high extends SubLTranslatedFile {

  //// Constructor

  private assertions_high() {}
  public static final SubLFile me = new assertions_high();
  public static final String myName = "com.cyc.cycjava_1.cycl.assertions_high";

  //// Definitions

  /** Return the cnf of ASSERTION.
   @note If you know the assertion is a gaf,
   consider using gaf-formula instead,
   if you do not explicitly need a CNF. */
  @SubL(source = "cycl/assertions-high.lisp", position = 3056) 
  public static final SubLObject assertion_cnf(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_cnf(assertion)) : NIL);
  }

  /** Return the CNF of ASSERTION, or NIL if none can be found. */
  @SubL(source = "cycl/assertions-high.lisp", position = 3915) 
  public static final SubLObject possibly_assertion_cnf(SubLObject assertion) {
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_possibly_assertion_cnf(assertion)) : NIL);
  }

  /** Return the mt of ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 4121) 
  public static final SubLObject assertion_mt(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_mt(assertion)) : NIL);
  }

  public static final class $assertion_mt$UnaryFunction extends UnaryFunction {
    public $assertion_mt$UnaryFunction() { super(extractFunctionNamed("ASSERTION-MT")); }
    public SubLObject processItem(SubLObject arg1) { return assertion_mt(arg1); }
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 4346) 
  public static final SubLObject assertion_gaf_hl_formula(SubLObject assertion) {
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_gaf_hl_formula(assertion)) : NIL);
  }

  /** @return listp; a cons representing ASSERTION's formula in some form,
   maybe a CNF, maybe a GAF formula, or NIL if it's invalid.
   @note result is not destructible. */
  @SubL(source = "cycl/assertions-high.lisp", position = 4494) 
  public static final SubLObject assertion_cons(SubLObject assertion) {
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_cons(assertion)) : NIL);
  }

  /** Return T iff ASSERTION is a ground atomic formula (gaf). */
  @SubL(source = "cycl/assertions-high.lisp", position = 4793) 
  public static final SubLObject gaf_assertionP(SubLObject assertion) {
    return makeBoolean(((NIL != assertion_handles.valid_assertion_handleP(assertion))
           && (NIL != assertions_interface.kb_gaf_assertionP(assertion))));
  }

  /** Return the direction of ASSERTION (either :backward, :forward or :code). */
  @SubL(source = "cycl/assertions-high.lisp", position = 4985) 
  public static final SubLObject assertion_direction(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_direction(assertion)) : NIL);
  }

  /** Return the current truth of ASSERTION -- either :true :false or :unknown. */
  @SubL(source = "cycl/assertions-high.lisp", position = 5274) 
  public static final SubLObject assertion_truth(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_truth(assertion)) : NIL);
  }

  /** Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown. */
  @SubL(source = "cycl/assertions-high.lisp", position = 5552) 
  public static final SubLObject assertion_strength(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_strength(assertion)) : NIL);
  }

  /** Return the variable names for ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 5868) 
  public static final SubLObject assertion_variable_names(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_variable_names(assertion)) : NIL);
  }

  /** Returns the cyclist who asserted ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 6133) 
  public static final SubLObject asserted_by(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_asserted_by(assertion)) : NIL);
  }

  /** Returns the day when ASSERTION was asserted. */
  @SubL(source = "cycl/assertions-high.lisp", position = 6381) 
  public static final SubLObject asserted_when(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_asserted_when(assertion)) : NIL);
  }

  /** Returns the reason why ASSERTION was asserted. */
  @SubL(source = "cycl/assertions-high.lisp", position = 6641) 
  public static final SubLObject asserted_why(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_asserted_why(assertion)) : NIL);
  }

  /** Returns the second of the day when ASSERTION was asserted. */
  @SubL(source = "cycl/assertions-high.lisp", position = 6863) 
  public static final SubLObject asserted_second(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_asserted_second(assertion)) : NIL);
  }

  /** Return a list of the arguments for ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 7103) 
  public static final SubLObject assertion_arguments(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_arguments(assertion)) : NIL);
  }

  /** Return a list of the dependents of ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 7328) 
  public static final SubLObject assertion_dependents(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return ((NIL != assertion_handles.assertion_handle_validP(assertion)) ? ((SubLObject) assertions_interface.kb_assertion_dependents(assertion)) : NIL);
  }

  /** Cyc has its own notion of tv (truth + strength) as a legacy of when the Cyc
and HL sides were entangled. */
  @SubL(source = "cycl/assertions-high.lisp", position = 7555) 
  public static final SubLObject cyc_assertion_tv(SubLObject assertion) {
    {
      SubLObject truth = assertion_truth(assertion);
      SubLObject strength = assertion_strength(assertion);
      return enumeration_types.tv_from_truth_strength(truth, strength);
    }
  }

  /** Return a formula for ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 8066) 
  public static final SubLObject assertion_formula(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    if ((NIL != gaf_assertionP(assertion))) {
      return gaf_el_formula(assertion);
    } else {
      {
        SubLObject cnf = assertion_cnf(assertion);
        if ((NIL != clauses.cnf_p(cnf))) {
          return clauses.cnf_formula(cnf, assertion_truth(assertion));
        } else {
          return NIL;
        }
      }
    }
  }

  public static final class $assertion_formula$UnaryFunction extends UnaryFunction {
    public $assertion_formula$UnaryFunction() { super(extractFunctionNamed("ASSERTION-FORMULA")); }
    public SubLObject processItem(SubLObject arg1) { return assertion_formula(arg1); }
  }

  /** Return T iff ASSERTION is a rule, i.e. not a ground atomic formula (gaf). */
  @SubL(source = "cycl/assertions-high.lisp", position = 11125) 
  public static final SubLObject rule_assertionP(SubLObject assertion) {
    return makeBoolean(((NIL != assertion_handles.assertion_p(assertion))
           && (NIL == gaf_assertionP(assertion))));
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 11477) 
  public static final SubLObject forward_ruleP(SubLObject assertion) {
    return makeBoolean(((NIL != rule_assertionP(assertion))
           && (NIL != forward_assertionP(assertion))));
  }

  /** Return the current type of ASSERTION -- either :GAF or :RULE. */
  @SubL(source = "cycl/assertions-high.lisp", position = 12167) 
  public static final SubLObject assertion_type(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    if ((NIL != gaf_assertionP(assertion))) {
      return $kw60$GAF;
    } else {
      return $kw61$RULE;
    }
  }

  /** Return T iff ASSERTION's current type is TYPE. */
  @SubL(source = "cycl/assertions-high.lisp", position = 12520) 
  public static final SubLObject assertion_has_typeP(SubLObject assertion, SubLObject type) {
    checkType(assertion, $sym21$ASSERTION_P);
    checkType(type, $sym62$ASSERTION_TYPE_P);
    return Equality.eq(type, assertion_type(assertion));
  }

  /** Return the formula for ASSERTION, which must be a gaf.
   Does not put a #$not around negated gafs.
   @owner pace */
  @SubL(source = "cycl/assertions-high.lisp", position = 15164) 
  public static final SubLObject gaf_formula(SubLObject assertion) {
    return gaf_hl_formula(assertion);
  }

  public static final class $gaf_formula$UnaryFunction extends UnaryFunction {
    public $gaf_formula$UnaryFunction() { super(extractFunctionNamed("GAF-FORMULA")); }
    public SubLObject processItem(SubLObject arg1) { return gaf_formula(arg1); }
  }

  /** Return the formula for ASSERTION, which must be a gaf.
   Does not put a #$not around negated gafs.
   @owner pace */
  @SubL(source = "cycl/assertions-high.lisp", position = 15537) 
  public static final SubLObject gaf_hl_formula(SubLObject assertion) {
    checkType(assertion, $sym65$GAF_ASSERTION_);
    return assertion_gaf_hl_formula(assertion);
  }

  /** Return the formula for ASSERTION, which must be a gaf.
   Puts a #$not around negated gafs.
   Does not do any uncanonicalization or conversion of HL terms in args to EL.
   @owner pace */
  @SubL(source = "cycl/assertions-high.lisp", position = 15785) 
  public static final SubLObject gaf_el_formula(SubLObject assertion) {
    checkType(assertion, $sym65$GAF_ASSERTION_);
    return assertion_gaf_el_formula(assertion);
  }

  /** Returns the EL formula of ASSERTION if it's a gaf, otherwise returns nil.
   This will return (#$not <blah>) for negated gafs. */
  @SubL(source = "cycl/assertions-high.lisp", position = 16104) 
  public static final SubLObject assertion_gaf_el_formula(SubLObject assertion) {
    {
      SubLObject formula = assertion_gaf_hl_formula(assertion);
      return (((NIL != formula)
             && ($kw66$FALSE == assertion_truth(assertion))) ? ((SubLObject) cycl_utilities.negate(formula)) : formula);
    }
  }

  /** Return args of the gaf ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 16464) 
  public static final SubLObject gaf_args(SubLObject assertion) {
    return cycl_utilities.formula_args(gaf_formula(assertion), UNPROVIDED);
  }

  /** Return arg N of the gaf ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 16587) 
  public static final SubLObject gaf_arg(SubLObject assertion, SubLObject n) {
    return ConsesLow.nth(n, gaf_formula(assertion));
  }

  /** Return the predicate of gaf ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 16758) 
  public static final SubLObject gaf_predicate(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return cycl_utilities.formula_arg0(gaf_hl_formula(assertion));
  }

  /** Return arg 1 of the gaf ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 17123) 
  public static final SubLObject gaf_arg1(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return gaf_arg(assertion, ONE_INTEGER);
  }

  /** Return arg 2 of the gaf ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 17273) 
  public static final SubLObject gaf_arg2(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return gaf_arg(assertion, TWO_INTEGER);
  }

  /** Return arg 3 of the gaf ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 17423) 
  public static final SubLObject gaf_arg3(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return gaf_arg(assertion, THREE_INTEGER);
  }

  /** Return T iff ASSERTION has DIRECTION as its direction. */
  @SubL(source = "cycl/assertions-high.lisp", position = 17873) 
  public static final SubLObject assertion_has_directionP(SubLObject assertion, SubLObject direction) {
    checkType(assertion, $sym21$ASSERTION_P);
    checkType(direction, $sym81$DIRECTION_P);
    return Equality.eq(direction, assertion_direction(assertion));
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 18165) 
  public static final SubLObject assertion_has_direction(SubLObject assertion, SubLObject direction) {
    return assertion_has_directionP(assertion, direction);
  }

  /** Predicate returns T iff ASSERTION's direction is :FORWARD. */
  @SubL(source = "cycl/assertions-high.lisp", position = 18328) 
  public static final SubLObject forward_assertionP(SubLObject assertion) {
    return makeBoolean(((NIL != assertion_handles.assertion_p(assertion))
           && ($kw84$FORWARD == assertion_direction(assertion))));
  }

  /** Return T iff ASSERTION's current truth is TRUTH. */
  @SubL(source = "cycl/assertions-high.lisp", position = 19006) 
  public static final SubLObject assertion_has_truthP(SubLObject assertion, SubLObject truth) {
    checkType(assertion, $sym21$ASSERTION_P);
    checkType(truth, $sym93$TRUTH_P);
    return Equality.eq(assertion_truth(assertion), truth);
  }

  /** @see assertion-has-truth? */
  @SubL(source = "cycl/assertions-high.lisp", position = 19283) 
  public static final SubLObject assertion_has_truth(SubLObject assertion, SubLObject truth) {
    checkType(assertion, $sym21$ASSERTION_P);
    checkType(truth, $sym93$TRUTH_P);
    return assertion_has_truthP(assertion, truth);
  }

  /** Return a list of the EL variables, for ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 21193) 
  public static final SubLObject assertion_el_variables(SubLObject assertion) {
    return Mapping.mapcar(Symbols.symbol_function($sym100$INTERN_EL_VAR), assertion_variable_names(assertion));
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 22879) 
  public static final SubLObject timestamp_asserted_assertion(SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
    if ((who == UNPROVIDED)) {
      who = NIL;
    }
    if ((when == UNPROVIDED)) {
      when = NIL;
    }
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((second == UNPROVIDED)) {
      second = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != kb_control_vars.$recording_hl_transcript_operationsP$.getDynamicValue(thread))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32158");
      }
      return timestamp_asserted_assertion_int(assertion, who, when, why, second);
    }
  }

  /** A lookaside cache for efficiency of tl-timestamp-asserted-assertion
   TL assertion -> HL assertion */
  @SubL(source = "cycl/assertions-high.lisp", position = 23474) 
  private static SubLSymbol $tl_assertion_lookaside_table$ = null;

  @SubL(source = "cycl/assertions-high.lisp", position = 23633) 
  private static SubLSymbol $tl_assertion_capacity$ = null;

  @SubL(source = "cycl/assertions-high.lisp", position = 24661) 
  public static final SubLObject timestamp_asserted_assertion_int(SubLObject assertion, SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
    if ((who == UNPROVIDED)) {
      who = NIL;
    }
    if ((when == UNPROVIDED)) {
      when = NIL;
    }
    if ((why == UNPROVIDED)) {
      why = NIL;
    }
    if ((second == UNPROVIDED)) {
      second = NIL;
    }
    checkType(assertion, $sym21$ASSERTION_P);
    if ((NIL != asserted_assertionP(assertion))) {
      assertions_interface.kb_set_assertion_asserted_by(assertion, who);
      assertions_interface.kb_set_assertion_asserted_when(assertion, when);
      assertions_interface.kb_set_assertion_asserted_why(assertion, why);
      assertions_interface.kb_set_assertion_asserted_second(assertion, second);
    }
    return assertion;
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 25058) 
  public static final SubLObject invalid_assertionP(SubLObject assertion, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    return makeBoolean(((NIL != assertion_handles.assertion_p(assertion))
           && (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED))));
  }

  public static final class $invalid_assertionP$UnaryFunction extends UnaryFunction {
    public $invalid_assertionP$UnaryFunction() { super(extractFunctionNamed("INVALID-ASSERTION?")); }
    public SubLObject processItem(SubLObject arg1) { return invalid_assertionP(arg1, UNPROVIDED); }
  }

  public static final class $invalid_assertionP$BinaryFunction extends BinaryFunction {
    public $invalid_assertionP$BinaryFunction() { super(extractFunctionNamed("INVALID-ASSERTION?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return invalid_assertionP(arg1, arg2); }
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 25462) 
  public static final SubLObject valid_assertion(SubLObject assertion, SubLObject robustP) {
    if ((robustP == UNPROVIDED)) {
      robustP = NIL;
    }
    return assertion_handles.valid_assertionP(assertion, UNPROVIDED);
  }

  public static final class $valid_assertion$UnaryFunction extends UnaryFunction {
    public $valid_assertion$UnaryFunction() { super(extractFunctionNamed("VALID-ASSERTION")); }
    public SubLObject processItem(SubLObject arg1) { return valid_assertion(arg1, UNPROVIDED); }
  }

  public static final class $valid_assertion$BinaryFunction extends BinaryFunction {
    public $valid_assertion$BinaryFunction() { super(extractFunctionNamed("VALID-ASSERTION")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return valid_assertion(arg1, arg2); }
  }

  /** Create a new assertion with CNF in MT. */
  @SubL(source = "cycl/assertions-high.lisp", position = 26049) 
  public static final SubLObject create_assertion(SubLObject cnf, SubLObject mt, SubLObject var_names, SubLObject direction) {
    if ((var_names == UNPROVIDED)) {
      var_names = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = $kw87$BACKWARD;
    }
    checkType(cnf, $sym109$CNF_P);
    checkType(mt, $sym110$HLMT_P);
    checkType(direction, $sym81$DIRECTION_P);
    return create_assertion_int(cnf, mt, var_names, direction);
  }

  /** Return assertion in MT with CNF, if it exists -- else create it. */
  @SubL(source = "cycl/assertions-high.lisp", position = 26855) 
  public static final SubLObject find_or_create_assertion(SubLObject cnf, SubLObject mt, SubLObject var_names, SubLObject direction) {
    if ((var_names == UNPROVIDED)) {
      var_names = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = $kw87$BACKWARD;
    }
    checkType(cnf, $sym109$CNF_P);
    checkType(mt, $sym110$HLMT_P);
    checkType(direction, $sym81$DIRECTION_P);
    {
      SubLObject assertion = kb_indexing.find_assertion(cnf, mt);
      return ((NIL != assertion) ? ((SubLObject) assertion) : create_assertion(cnf, mt, var_names, direction));
    }
  }

  /** Create a new assertion with CNF in MT. */
  @SubL(source = "cycl/assertions-high.lisp", position = 27565) 
  public static final SubLObject create_assertion_int(SubLObject cnf, SubLObject mt, SubLObject var_names, SubLObject direction) {
    if ((var_names == UNPROVIDED)) {
      var_names = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = $kw87$BACKWARD;
    }
    {
      SubLObject assertion = assertions_interface.kb_create_assertion(cnf, mt);
      if ((NIL != assertion)) {
        assertions_interface.kb_set_assertion_variable_names(assertion, var_names);
        assertions_interface.kb_set_assertion_direction(assertion, direction);
      }
      return assertion;
    }
  }

  /** Remove ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 27921) 
  public static final SubLObject remove_assertion(SubLObject assertion) {
    return assertions_interface.kb_remove_assertion(assertion);
  }

  /** @return boolean; T if ARGUMENT is the sole argument for ASSERTION; NIL if there are other, different arguments. */
  @SubL(source = "cycl/assertions-high.lisp", position = 30142) 
  public static final SubLObject only_argument_of_assertion_p(SubLObject assertion, SubLObject argument) {
    checkType(assertion, $sym21$ASSERTION_P);
    checkType(argument, $sym120$ARGUMENT_P);
    return makeBoolean((NIL == subl_promotions.memberP(argument, assertion_arguments(assertion), $sym122$NOT_EQ, UNPROVIDED)));
  }

  /** Return non-nil IFF assertion has an asserted argument. */
  @SubL(source = "cycl/assertions-high.lisp", position = 30471) 
  public static final SubLObject asserted_assertionP(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function($sym123$ASSERTED_ARGUMENT_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED));
  }

  /** Return the asserted argument for ASSERTION, or nil if none present. */
  @SubL(source = "cycl/assertions-high.lisp", position = 31235) 
  public static final SubLObject get_asserted_argument(SubLObject assertion) {
    checkType(assertion, $sym21$ASSERTION_P);
    return Sequences.find_if(Symbols.symbol_function($sym123$ASSERTED_ARGUMENT_P), assertion_arguments(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** @return integerp; the number of arguments depending on ASSERTION. */
  @SubL(source = "cycl/assertions-high.lisp", position = 31809) 
  public static final SubLObject assertion_dependent_count(SubLObject assertion) {
    return Sequences.length(assertion_dependents(assertion));
  }

  @SubL(source = "cycl/assertions-high.lisp", position = 34499) 
  public static SubLSymbol $assertion_dump_id_table$ = null;

  /** Return the assertion with DUMP-ID during a KB load. */
  @SubL(source = "cycl/assertions-high.lisp", position = 35098) 
  public static final SubLObject find_assertion_by_dump_id(SubLObject dump_id) {
    return assertion_handles.find_assertion_by_id(dump_id);
  }

  public static final SubLObject declare_assertions_high_file() {
    declareMacro(myName, "do_assertion_arguments", "DO-ASSERTION-ARGUMENTS");
    declareMacro(myName, "do_assertion_dependents", "DO-ASSERTION-DEPENDENTS");
    declareMacro(myName, "do_assertion_literals", "DO-ASSERTION-LITERALS");
    declareFunction(myName, "assertion_cnf", "ASSERTION-CNF", 1, 0, false);
    declareFunction(myName, "intuitive_assertion_cnf", "INTUITIVE-ASSERTION-CNF", 1, 0, false);
    declareFunction(myName, "possibly_assertion_cnf", "POSSIBLY-ASSERTION-CNF", 1, 0, false);
    declareFunction(myName, "assertion_mt", "ASSERTION-MT", 1, 0, false); new $assertion_mt$UnaryFunction();
    declareFunction(myName, "assertion_gaf_hl_formula", "ASSERTION-GAF-HL-FORMULA", 1, 0, false);
    declareFunction(myName, "assertion_cons", "ASSERTION-CONS", 1, 0, false);
    declareFunction(myName, "gaf_assertionP", "GAF-ASSERTION?", 1, 0, false);
    declareFunction(myName, "assertion_direction", "ASSERTION-DIRECTION", 1, 0, false);
    declareFunction(myName, "assertion_truth", "ASSERTION-TRUTH", 1, 0, false);
    declareFunction(myName, "assertion_strength", "ASSERTION-STRENGTH", 1, 0, false);
    declareFunction(myName, "assertion_variable_names", "ASSERTION-VARIABLE-NAMES", 1, 0, false);
    declareFunction(myName, "asserted_by", "ASSERTED-BY", 1, 0, false);
    declareFunction(myName, "asserted_when", "ASSERTED-WHEN", 1, 0, false);
    declareFunction(myName, "asserted_why", "ASSERTED-WHY", 1, 0, false);
    declareFunction(myName, "asserted_second", "ASSERTED-SECOND", 1, 0, false);
    declareFunction(myName, "assertion_arguments", "ASSERTION-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "assertion_dependents", "ASSERTION-DEPENDENTS", 1, 0, false);
    declareFunction(myName, "cyc_assertion_tv", "CYC-ASSERTION-TV", 1, 0, false);
    declareFunction(myName, "assertion_formula", "ASSERTION-FORMULA", 1, 0, false); new $assertion_formula$UnaryFunction();
    declareFunction(myName, "assertion_ist_formula", "ASSERTION-IST-FORMULA", 1, 0, false);
    declareFunction(myName, "assertion_to_hl_assertion_spec", "ASSERTION-TO-HL-ASSERTION-SPEC", 1, 0, false);
    declareFunction(myName, "assertion_to_hl_assertibles", "ASSERTION-TO-HL-ASSERTIBLES", 1, 0, false);
    declareFunction(myName, "assertion_mentions_termP", "ASSERTION-MENTIONS-TERM?", 2, 0, false);
    declareFunction(myName, "assertion_mentions_term", "ASSERTION-MENTIONS-TERM", 2, 0, false);
    declareFunction(myName, "assertion_cnf_or_gaf_hl_formula", "ASSERTION-CNF-OR-GAF-HL-FORMULA", 1, 0, false);
    declareFunction(myName, "rule_assertionP", "RULE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "backward_ruleP", "BACKWARD-RULE?", 1, 0, false);
    declareFunction(myName, "forward_ruleP", "FORWARD-RULE?", 1, 0, false);
    declareFunction(myName, "single_literal_ruleP", "SINGLE-LITERAL-RULE?", 1, 0, false);
    declareFunction(myName, "backward_gafP", "BACKWARD-GAF?", 1, 0, false);
    declareFunction(myName, "forward_gafP", "FORWARD-GAF?", 1, 0, false);
    declareFunction(myName, "assertion_type", "ASSERTION-TYPE", 1, 0, false);
    declareFunction(myName, "assertion_has_mtP", "ASSERTION-HAS-MT?", 2, 0, false);
    declareFunction(myName, "assertion_has_typeP", "ASSERTION-HAS-TYPE?", 2, 0, false);
    declareFunction(myName, "assertion_has_type", "ASSERTION-HAS-TYPE", 2, 0, false);
    declareFunction(myName, "ground_assertionP", "GROUND-ASSERTION?", 1, 0, false);
    declareFunction(myName, "atomic_assertionP", "ATOMIC-ASSERTION?", 1, 0, false);
    declareFunction(myName, "meta_assertionP", "META-ASSERTION?", 1, 0, false);
    declareFunction(myName, "lifting_assertion_p", "LIFTING-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "assertion_forts", "ASSERTION-FORTS", 1, 4, false);
    declareFunction(myName, "assertion_constants", "ASSERTION-CONSTANTS", 1, 0, false);
    declareFunction(myName, "gaf_formula", "GAF-FORMULA", 1, 0, false); new $gaf_formula$UnaryFunction();
    declareFunction(myName, "gaf_hl_formula", "GAF-HL-FORMULA", 1, 0, false);
    declareFunction(myName, "gaf_el_formula", "GAF-EL-FORMULA", 1, 0, false);
    declareFunction(myName, "assertion_gaf_el_formula", "ASSERTION-GAF-EL-FORMULA", 1, 0, false);
    declareFunction(myName, "gaf_args", "GAF-ARGS", 1, 0, false);
    declareFunction(myName, "gaf_arg", "GAF-ARG", 2, 0, false);
    declareFunction(myName, "gaf_predicate", "GAF-PREDICATE", 1, 0, false);
    declareFunction(myName, "gaf_arg0", "GAF-ARG0", 1, 0, false);
    declareFunction(myName, "gaf_arg1", "GAF-ARG1", 1, 0, false);
    declareFunction(myName, "gaf_arg2", "GAF-ARG2", 1, 0, false);
    declareFunction(myName, "gaf_arg3", "GAF-ARG3", 1, 0, false);
    declareFunction(myName, "gaf_arg4", "GAF-ARG4", 1, 0, false);
    declareFunction(myName, "gaf_arg5", "GAF-ARG5", 1, 0, false);
    declareFunction(myName, "assertion_has_directionP", "ASSERTION-HAS-DIRECTION?", 2, 0, false);
    declareFunction(myName, "assertion_has_direction", "ASSERTION-HAS-DIRECTION", 2, 0, false);
    declareFunction(myName, "forward_assertionP", "FORWARD-ASSERTION?", 1, 0, false);
    declareFunction(myName, "backward_assertionP", "BACKWARD-ASSERTION?", 1, 0, false);
    declareFunction(myName, "code_assertionP", "CODE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "assertion_has_truthP", "ASSERTION-HAS-TRUTH?", 2, 0, false);
    declareFunction(myName, "assertion_has_truth", "ASSERTION-HAS-TRUTH", 2, 0, false);
    declareFunction(myName, "assertion_el_variables", "ASSERTION-EL-VARIABLES", 1, 0, false);
    declareFunction(myName, "assertion_hl_variables", "ASSERTION-HL-VARIABLES", 1, 0, false);
    declareFunction(myName, "assertion_free_hl_variables", "ASSERTION-FREE-HL-VARIABLES", 1, 0, false);
    declareFunction(myName, "assertion_el_variable_to_hl", "ASSERTION-EL-VARIABLE-TO-HL", 2, 0, false);
    declareFunction(myName, "assertion_hl_variable_to_el", "ASSERTION-HL-VARIABLE-TO-EL", 2, 0, false);
    declareFunction(myName, "timestamp_asserted_assertion", "TIMESTAMP-ASSERTED-ASSERTION", 1, 4, false);
    declareFunction(myName, "remove_asserted_assertion_timestamp", "REMOVE-ASSERTED-ASSERTION-TIMESTAMP", 1, 0, false);
    declareFunction(myName, "tl_timestamp_asserted_assertion", "TL-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false);
    declareFunction(myName, "tl_cache_assertion", "TL-CACHE-ASSERTION", 2, 0, false);
    declareFunction(myName, "tl_find_assertion", "TL-FIND-ASSERTION", 1, 0, false);
    declareFunction(myName, "timestamp_asserted_assertion_int", "TIMESTAMP-ASSERTED-ASSERTION-INT", 1, 4, false);
    declareFunction(myName, "invalid_assertionP", "INVALID-ASSERTION?", 1, 1, false); new $invalid_assertionP$UnaryFunction(); new $invalid_assertionP$BinaryFunction();
    declareFunction(myName, "invalid_assertion_robustP", "INVALID-ASSERTION-ROBUST?", 1, 0, false);
    declareFunction(myName, "valid_assertion", "VALID-ASSERTION", 1, 1, false); new $valid_assertion$UnaryFunction(); new $valid_assertion$BinaryFunction();
    declareFunction(myName, "invalid_assertion", "INVALID-ASSERTION", 1, 1, false);
    declareFunction(myName, "assertion_id_from_recipe", "ASSERTION-ID-FROM-RECIPE", 2, 0, false);
    declareFunction(myName, "create_assertion", "CREATE-ASSERTION", 2, 2, false);
    declareFunction(myName, "create_gaf", "CREATE-GAF", 2, 1, false);
    declareFunction(myName, "find_or_create_assertion", "FIND-OR-CREATE-ASSERTION", 2, 2, false);
    declareFunction(myName, "find_or_create_gaf", "FIND-OR-CREATE-GAF", 2, 1, false);
    declareFunction(myName, "create_assertion_int", "CREATE-ASSERTION-INT", 2, 2, false);
    declareFunction(myName, "remove_assertion", "REMOVE-ASSERTION", 1, 0, false);
    declareFunction(myName, "remove_broken_assertions", "REMOVE-BROKEN-ASSERTIONS", 0, 0, false);
    declareFunction(myName, "possibly_remove_broken_assertion", "POSSIBLY-REMOVE-BROKEN-ASSERTION", 1, 0, false);
    declareFunction(myName, "matching_argument_on_assertion", "MATCHING-ARGUMENT-ON-ASSERTION", 2, 0, false);
    declareFunction(myName, "only_argument_of_assertion_p", "ONLY-ARGUMENT-OF-ASSERTION-P", 2, 0, false);
    declareFunction(myName, "asserted_assertionP", "ASSERTED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "deduced_assertionP", "DEDUCED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "forward_deduced_assertionP", "FORWARD-DEDUCED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "get_asserted_argument", "GET-ASSERTED-ARGUMENT", 1, 0, false);
    declareFunction(myName, "assertion_deductions", "ASSERTION-DEDUCTIONS", 1, 0, false);
    declareFunction(myName, "assertion_dependent_count", "ASSERTION-DEPENDENT-COUNT", 1, 0, false);
    declareFunction(myName, "assertion_has_dependents_p", "ASSERTION-HAS-DEPENDENTS-P", 1, 0, false);
    declareFunction(myName, "random_assertion", "RANDOM-ASSERTION", 0, 1, false);
    declareFunction(myName, "sample_assertions", "SAMPLE-ASSERTIONS", 0, 3, false);
    declareFunction(myName, "random_rule", "RANDOM-RULE", 0, 0, false);
    declareFunction(myName, "random_gaf", "RANDOM-GAF", 0, 0, false);
    declareFunction(myName, "assertion_checkpoint_p", "ASSERTION-CHECKPOINT-P", 1, 0, false);
    declareFunction(myName, "new_assertion_checkpoint", "NEW-ASSERTION-CHECKPOINT", 0, 0, false);
    declareFunction(myName, "assertion_checkpoint_currentP", "ASSERTION-CHECKPOINT-CURRENT?", 1, 0, false);
    declareMacro(myName, "with_assertion_dump_id_table", "WITH-ASSERTION-DUMP-ID-TABLE");
    declareFunction(myName, "assertion_dump_id", "ASSERTION-DUMP-ID", 1, 0, false);
    declareFunction(myName, "find_assertion_by_dump_id", "FIND-ASSERTION-BY-DUMP-ID", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_assertions_high_file() {
    $tl_assertion_lookaside_table$ = deflexical("*TL-ASSERTION-LOOKASIDE-TABLE*", maybeDefault( $sym104$_TL_ASSERTION_LOOKASIDE_TABLE_, $tl_assertion_lookaside_table$, NIL));
    $tl_assertion_capacity$ = deflexical("*TL-ASSERTION-CAPACITY*", FIVE_INTEGER);
    $assertion_dump_id_table$ = defparameter("*ASSERTION-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_assertions_high_file() {
    // CVS_ID("Id: assertions-high.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym19$ASSERTION_CNF, $list22, $str23$Return_the_cnf_of_ASSERTION______, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym26$ASSERTION_MT, $list22, $str27$Return_the_mt_of_ASSERTION_, $list24, $list28);
    utilities_macros.register_cyc_api_function($sym29$ASSERTION_DIRECTION, $list22, $str30$Return_the_direction_of_ASSERTION, $list24, $list31);
    utilities_macros.register_cyc_api_function($sym32$ASSERTION_TRUTH, $list22, $str33$Return_the_current_truth_of_ASSER, $list24, $list34);
    utilities_macros.register_cyc_api_function($sym35$ASSERTION_STRENGTH, $list22, $str36$Return_the_current_argumentation_, $list24, $list37);
    utilities_macros.register_cyc_api_function($sym38$ASSERTION_VARIABLE_NAMES, $list22, $str39$Return_the_variable_names_for_ASS, $list24, $list40);
    utilities_macros.register_cyc_api_function($sym41$ASSERTED_BY, $list22, $str42$Returns_the_cyclist_who_asserted_, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym43$ASSERTED_WHEN, $list22, $str44$Returns_the_day_when_ASSERTION_wa, $list24, $list45);
    utilities_macros.register_cyc_api_function($sym46$ASSERTION_FORMULA, $list22, $str47$Return_a_formula_for_ASSERTION_, $list24, $list48);
    utilities_macros.register_cyc_api_function($sym50$ASSERTION_IST_FORMULA, $list22, $str51$Return_a_formula_in___ist_format_, $list24, $list48);
    utilities_macros.register_cyc_api_function($sym53$ASSERTION_MENTIONS_TERM_, $list54, $str55$Return_T_iff_ASSERTION_s_formula_, $list56, $list57);
    utilities_macros.register_obsolete_cyc_api_function($sym58$ASSERTION_MENTIONS_TERM, NIL, $list54, $str59$_see_assertion_mentions_term_, $list56, $list57);
    access_macros.define_obsolete_register($sym63$ASSERTION_HAS_TYPE, $list64);
    utilities_macros.register_cyc_api_function($sym67$GAF_PREDICATE, $list22, $str68$Return_the_predicate_of_gaf_ASSER, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym69$GAF_ARG0, $list22, $str70$Return_arg_0__the_predicate__of_t, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym71$GAF_ARG1, $list22, $str72$Return_arg_1_of_the_gaf_ASSERTION, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym73$GAF_ARG2, $list22, $str74$Return_arg_2_of_the_gaf_ASSERTION, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym75$GAF_ARG3, $list22, $str76$Return_arg_3_of_the_gaf_ASSERTION, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym77$GAF_ARG4, $list22, $str78$Return_arg_4_of_the_gaf_ASSERTION, $list24, NIL);
    utilities_macros.register_cyc_api_function($sym79$GAF_ARG5, $list22, $str80$Return_arg_5_of_the_gaf_ASSERTION, $list24, NIL);
    access_macros.define_obsolete_register($sym82$ASSERTION_HAS_DIRECTION, $list83);
    utilities_macros.register_cyc_api_function($sym85$FORWARD_ASSERTION_, $list22, $str86$Predicate_returns_T_iff_ASSERTION, NIL, $list57);
    utilities_macros.register_cyc_api_function($sym88$BACKWARD_ASSERTION_, $list22, $str89$Predicate_returns_T_iff_ASSERTION, NIL, $list57);
    utilities_macros.register_cyc_api_function($sym91$CODE_ASSERTION_, $list22, $str92$Predicate_returns_T_iff_ASSERTION, NIL, $list57);
    utilities_macros.register_cyc_api_function($sym94$ASSERTION_HAS_TRUTH_, $list95, $str96$Return_T_iff_ASSERTION_s_current_, $list97, $list57);
    utilities_macros.register_obsolete_cyc_api_function($sym98$ASSERTION_HAS_TRUTH, NIL, $list95, $str99$_see_assertion_has_truth_, $list97, $list57);
    subl_macro_promotions.declare_defglobal($sym104$_TL_ASSERTION_LOOKASIDE_TABLE_);
    access_macros.define_obsolete_register($sym105$VALID_ASSERTION, $list106);
    access_macros.define_obsolete_register($sym107$INVALID_ASSERTION, $list108);
    utilities_macros.register_cyc_api_function($sym124$ASSERTED_ASSERTION_, $list22, $str125$Return_non_nil_IFF_assertion_has_, $list24, $list57);
    utilities_macros.register_cyc_api_function($sym127$DEDUCED_ASSERTION_, $list22, $str128$Return_non_nil_IFF_assertion_has_, $list24, $list57);
    utilities_macros.register_cyc_api_function($sym130$GET_ASSERTED_ARGUMENT, $list22, $str131$Return_the_asserted_argument_for_, $list24, $list132);
    utilities_macros.register_cyc_api_function($sym133$ASSERTION_HAS_DEPENDENTS_P, $list22, $str134$Return_non_nil_IFF_assertion_has_, $list24, $list57);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("ARGUMENT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym4$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym5$ASSERTION_ARGUMENTS = makeSymbol("ASSERTION-ARGUMENTS");
  public static final SubLList $list6 = list(list(makeSymbol("DEDUCTION-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$ASSERTION_DEPENDENTS = makeSymbol("ASSERTION-DEPENDENTS");
  public static final SubLList $list8 = list(list(makeSymbol("LIT-VAR"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("SENSE"), makeSymbol("PREDICATE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list9 = list(makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw10$SENSE = makeKeyword("SENSE");
  public static final SubLSymbol $kw11$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $sym12$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");
  public static final SubLSymbol $sym13$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym14$DO_ASSERTION_LITERALS = makeSymbol("DO-ASSERTION-LITERALS");
  public static final SubLSymbol $sym15$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym16$ATOMIC_SENTENCE_PREDICATE = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
  public static final SubLSymbol $sym17$CNF_VAR = makeUninternedSymbol("CNF-VAR");
  public static final SubLSymbol $sym18$ASSERTION_VAR = makeUninternedSymbol("ASSERTION-VAR");
  public static final SubLSymbol $sym19$ASSERTION_CNF = makeSymbol("ASSERTION-CNF");
  public static final SubLSymbol $sym20$DO_ALL_LITS_AS_ASENTS = makeSymbol("DO-ALL-LITS-AS-ASENTS");
  public static final SubLSymbol $sym21$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLList $list22 = list(makeSymbol("ASSERTION"));
  public static final SubLString $str23$Return_the_cnf_of_ASSERTION______ = makeString("Return the cnf of ASSERTION.\n   @note If you know the assertion is a gaf,\n   consider using gaf-formula instead,\n   if you do not explicitly need a CNF.");
  public static final SubLList $list24 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));
  public static final SubLList $list25 = list(makeSymbol("CNF-P"));
  public static final SubLSymbol $sym26$ASSERTION_MT = makeSymbol("ASSERTION-MT");
  public static final SubLString $str27$Return_the_mt_of_ASSERTION_ = makeString("Return the mt of ASSERTION.");
  public static final SubLList $list28 = list(makeSymbol("HLMT-P"));
  public static final SubLSymbol $sym29$ASSERTION_DIRECTION = makeSymbol("ASSERTION-DIRECTION");
  public static final SubLString $str30$Return_the_direction_of_ASSERTION = makeString("Return the direction of ASSERTION (either :backward, :forward or :code).");
  public static final SubLList $list31 = list(makeSymbol("DIRECTION-P"));
  public static final SubLSymbol $sym32$ASSERTION_TRUTH = makeSymbol("ASSERTION-TRUTH");
  public static final SubLString $str33$Return_the_current_truth_of_ASSER = makeString("Return the current truth of ASSERTION -- either :true :false or :unknown.");
  public static final SubLList $list34 = list(makeSymbol("TRUTH-P"));
  public static final SubLSymbol $sym35$ASSERTION_STRENGTH = makeSymbol("ASSERTION-STRENGTH");
  public static final SubLString $str36$Return_the_current_argumentation_ = makeString("Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown.");
  public static final SubLList $list37 = list(makeSymbol("EL-STRENGTH-P"));
  public static final SubLSymbol $sym38$ASSERTION_VARIABLE_NAMES = makeSymbol("ASSERTION-VARIABLE-NAMES");
  public static final SubLString $str39$Return_the_variable_names_for_ASS = makeString("Return the variable names for ASSERTION.");
  public static final SubLList $list40 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym41$ASSERTED_BY = makeSymbol("ASSERTED-BY");
  public static final SubLString $str42$Returns_the_cyclist_who_asserted_ = makeString("Returns the cyclist who asserted ASSERTION.");
  public static final SubLSymbol $sym43$ASSERTED_WHEN = makeSymbol("ASSERTED-WHEN");
  public static final SubLString $str44$Returns_the_day_when_ASSERTION_wa = makeString("Returns the day when ASSERTION was asserted.");
  public static final SubLList $list45 = list(makeSymbol("INTEGERP"));
  public static final SubLSymbol $sym46$ASSERTION_FORMULA = makeSymbol("ASSERTION-FORMULA");
  public static final SubLString $str47$Return_a_formula_for_ASSERTION_ = makeString("Return a formula for ASSERTION.");
  public static final SubLList $list48 = list(makeSymbol("EL-FORMULA-P"));
  public static final SubLObject $const49$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym50$ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");
  public static final SubLString $str51$Return_a_formula_in___ist_format_ = makeString("Return a formula in #$ist format for ASSERTION.");
  public static final SubLSymbol $sym52$HL_TERM_P = makeSymbol("HL-TERM-P");
  public static final SubLSymbol $sym53$ASSERTION_MENTIONS_TERM_ = makeSymbol("ASSERTION-MENTIONS-TERM?");
  public static final SubLList $list54 = list(makeSymbol("ASSERTION"), makeSymbol("TERM"));
  public static final SubLString $str55$Return_T_iff_ASSERTION_s_formula_ = makeString("Return T iff ASSERTION's formula or mt contains TERM.\n   If assertion is a meta-assertion, recurse down sub-assertions.\n   By convention, negated gafs do not necessarily mention the term #$not.");
  public static final SubLList $list56 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));
  public static final SubLList $list57 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym58$ASSERTION_MENTIONS_TERM = makeSymbol("ASSERTION-MENTIONS-TERM");
  public static final SubLString $str59$_see_assertion_mentions_term_ = makeString("@see assertion-mentions-term?");
  public static final SubLSymbol $kw60$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw61$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym62$ASSERTION_TYPE_P = makeSymbol("ASSERTION-TYPE-P");
  public static final SubLSymbol $sym63$ASSERTION_HAS_TYPE = makeSymbol("ASSERTION-HAS-TYPE");
  public static final SubLList $list64 = list(makeSymbol("ASSERTION-HAS-TYPE?"));
  public static final SubLSymbol $sym65$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $kw66$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $sym67$GAF_PREDICATE = makeSymbol("GAF-PREDICATE");
  public static final SubLString $str68$Return_the_predicate_of_gaf_ASSER = makeString("Return the predicate of gaf ASSERTION.");
  public static final SubLSymbol $sym69$GAF_ARG0 = makeSymbol("GAF-ARG0");
  public static final SubLString $str70$Return_arg_0__the_predicate__of_t = makeString("Return arg 0 (the predicate) of the gaf ASSERTION.");
  public static final SubLSymbol $sym71$GAF_ARG1 = makeSymbol("GAF-ARG1");
  public static final SubLString $str72$Return_arg_1_of_the_gaf_ASSERTION = makeString("Return arg 1 of the gaf ASSERTION.");
  public static final SubLSymbol $sym73$GAF_ARG2 = makeSymbol("GAF-ARG2");
  public static final SubLString $str74$Return_arg_2_of_the_gaf_ASSERTION = makeString("Return arg 2 of the gaf ASSERTION.");
  public static final SubLSymbol $sym75$GAF_ARG3 = makeSymbol("GAF-ARG3");
  public static final SubLString $str76$Return_arg_3_of_the_gaf_ASSERTION = makeString("Return arg 3 of the gaf ASSERTION.");
  public static final SubLSymbol $sym77$GAF_ARG4 = makeSymbol("GAF-ARG4");
  public static final SubLString $str78$Return_arg_4_of_the_gaf_ASSERTION = makeString("Return arg 4 of the gaf ASSERTION.");
  public static final SubLSymbol $sym79$GAF_ARG5 = makeSymbol("GAF-ARG5");
  public static final SubLString $str80$Return_arg_5_of_the_gaf_ASSERTION = makeString("Return arg 5 of the gaf ASSERTION.");
  public static final SubLSymbol $sym81$DIRECTION_P = makeSymbol("DIRECTION-P");
  public static final SubLSymbol $sym82$ASSERTION_HAS_DIRECTION = makeSymbol("ASSERTION-HAS-DIRECTION");
  public static final SubLList $list83 = list(makeSymbol("ASSERTION-HAS-DIRECTION?"));
  public static final SubLSymbol $kw84$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym85$FORWARD_ASSERTION_ = makeSymbol("FORWARD-ASSERTION?");
  public static final SubLString $str86$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :FORWARD.");
  public static final SubLSymbol $kw87$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $sym88$BACKWARD_ASSERTION_ = makeSymbol("BACKWARD-ASSERTION?");
  public static final SubLString $str89$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :BACKWARD.");
  public static final SubLSymbol $kw90$CODE = makeKeyword("CODE");
  public static final SubLSymbol $sym91$CODE_ASSERTION_ = makeSymbol("CODE-ASSERTION?");
  public static final SubLString $str92$Predicate_returns_T_iff_ASSERTION = makeString("Predicate returns T iff ASSERTION's direction is :CODE.");
  public static final SubLSymbol $sym93$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $sym94$ASSERTION_HAS_TRUTH_ = makeSymbol("ASSERTION-HAS-TRUTH?");
  public static final SubLList $list95 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"));
  public static final SubLString $str96$Return_T_iff_ASSERTION_s_current_ = makeString("Return T iff ASSERTION's current truth is TRUTH.");
  public static final SubLList $list97 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLSymbol $sym98$ASSERTION_HAS_TRUTH = makeSymbol("ASSERTION-HAS-TRUTH");
  public static final SubLString $str99$_see_assertion_has_truth_ = makeString("@see assertion-has-truth?");
  public static final SubLSymbol $sym100$INTERN_EL_VAR = makeSymbol("INTERN-EL-VAR");
  public static final SubLSymbol $sym101$EL_VARIABLE_P = makeSymbol("EL-VARIABLE-P");
  public static final SubLSymbol $sym102$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym103$TL_TIMESTAMP_ASSERTED_ASSERTION = makeSymbol("TL-TIMESTAMP-ASSERTED-ASSERTION");
  public static final SubLSymbol $sym104$_TL_ASSERTION_LOOKASIDE_TABLE_ = makeSymbol("*TL-ASSERTION-LOOKASIDE-TABLE*");
  public static final SubLSymbol $sym105$VALID_ASSERTION = makeSymbol("VALID-ASSERTION");
  public static final SubLList $list106 = list(makeSymbol("VALID-ASSERTION?"));
  public static final SubLSymbol $sym107$INVALID_ASSERTION = makeSymbol("INVALID-ASSERTION");
  public static final SubLList $list108 = list(makeSymbol("INVALID-ASSERTION?"));
  public static final SubLSymbol $sym109$CNF_P = makeSymbol("CNF-P");
  public static final SubLSymbol $sym110$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym111$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLString $str112$Removing_broken_assertions__pass_ = makeString("Removing broken assertions: pass ~S");
  public static final SubLSymbol $sym113$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw114$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym115$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLList $list116 = list(NIL);
  public static final SubLSymbol $sym117$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");
  public static final SubLSymbol $kw118$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym119$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym120$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $sym121$ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");
  public static final SubLSymbol $sym122$NOT_EQ = makeSymbol("NOT-EQ");
  public static final SubLSymbol $sym123$ASSERTED_ARGUMENT_P = makeSymbol("ASSERTED-ARGUMENT-P");
  public static final SubLSymbol $sym124$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");
  public static final SubLString $str125$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has an asserted argument.");
  public static final SubLSymbol $sym126$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $sym127$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");
  public static final SubLString $str128$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has some deduced argument");
  public static final SubLSymbol $sym129$FORWARD_DEDUCTION_ = makeSymbol("FORWARD-DEDUCTION?");
  public static final SubLSymbol $sym130$GET_ASSERTED_ARGUMENT = makeSymbol("GET-ASSERTED-ARGUMENT");
  public static final SubLString $str131$Return_the_asserted_argument_for_ = makeString("Return the asserted argument for ASSERTION, or nil if none present.");
  public static final SubLList $list132 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTED-ARGUMENT-P")));
  public static final SubLSymbol $sym133$ASSERTION_HAS_DEPENDENTS_P = makeSymbol("ASSERTION-HAS-DEPENDENTS-P");
  public static final SubLString $str134$Return_non_nil_IFF_assertion_has_ = makeString("Return non-nil IFF assertion has dependents.");
  public static final SubLSymbol $sym135$TRUE = makeSymbol("TRUE");
  public static final SubLInteger $int136$500 = makeInteger(500);
  public static final SubLSymbol $sym137$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLList $list138 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));
  public static final SubLList $list139 = list(list(makeSymbol("*ASSERTION-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-ASSERTION-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTION-DUMP-ID"))));

  //// Initializers

  public void declareFunctions() {
    declare_assertions_high_file();
  }

  public void initializeVariables() {
    init_assertions_high_file();
  }

  public void runTopLevelForms() {
    setup_assertions_high_file();
  }

}
