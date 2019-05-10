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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.deductions_interface;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.hl_interface_infrastructure;
//dm import com.cyc.cycjava_1.cycl.hl_modifiers;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_hl_supports;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff;

  final class arguments_hide extends SubLTranslatedFile {

  //// Constructor

  private arguments_hide() {}
  public static final SubLFile me = new arguments_hide();
  public static final String myName = "com.cyc.cycjava_1.cycl.arguments_hide";

  //// Definitions

  /** Return T if ARGUMENT is a valid argument.
ROBUST requests more thorough checking. */
  @SubL(source = "cycl/arguments.lisp", position = 2462)
  public static final SubLObject valid_argument(SubLObject argument, SubLObject robust) {
    if ((robust == UNPROVIDED)) {
      robust = NIL;
    }
    if ((NIL != belief_p(argument))) {
      return T;
    } else if ((NIL != deduction_handles.deduction_p(argument))) {
      return deduction_handles.valid_deduction(argument, robust);
    } else {
      return NIL;
    }
  }

  /** Returns the type of the argument specified by ARGUMENT-SPEC */
  @SubL(source = "cycl/arguments.lisp", position = 3194)
  public static final SubLObject argument_spec_type(SubLObject argument_spec) {
    return argument_spec.first();
  }

  @SubL(source = "cycl/arguments.lisp", position = 3340)
  private static SubLSymbol $argument_types$ = null;

  /** A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls).
  hard-codes the type hierarchy:
                        ARGUMENT
                       /
                   BELIEF      DEDUCTION
                    /
          ASSERTED-ARGUMENT
 */
  @SubL(source = "cycl/arguments.lisp", position = 3666)
  private static SubLSymbol $argument_type_hierarchy$ = null;

  /** A list of pairs of the form (ARGUMENT-TYPE list-of-proper-genls) */
  @SubL(source = "cycl/arguments.lisp", position = 4095)
  public static final SubLObject argument_type_hierarchy() {
    return $argument_type_hierarchy$.getGlobalValue();
  }

  /** Returns the proper genls of ARGUMENT-TYPE in the hard-coded hierarchy */
  @SubL(source = "cycl/arguments.lisp", position = 4382)
  public static final SubLObject argument_type_proper_genls(SubLObject argument_type) {
    {
      SubLObject pair = conses_high.assoc(argument_type, argument_type_hierarchy(), UNPROVIDED, UNPROVIDED);
      if ((NIL == pair)) {
        return NIL;
      } else {
        {
          SubLObject immediate_proper_genls = conses_high.copy_list(conses_high.second(pair));
          SubLObject recursive_proper_genls = Mapping.mapcan($sym20$ARGUMENT_TYPE_PROPER_GENLS, immediate_proper_genls, EMPTY_SUBL_OBJECT_ARRAY);
          return ConsesLow.append(immediate_proper_genls, recursive_proper_genls);
        }
      }
    }
  }

  public static final class $argument_type_proper_genls$UnaryFunction extends UnaryFunction {
    public $argument_type_proper_genls$UnaryFunction() { super(extractFunctionNamed("ARGUMENT-TYPE-PROPER-GENLS")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return argument_type_proper_genls(arg1); }
  }

  /** Returns the genls of ARGUMENT-TYPE in the hard-coded hierarchy */
  @SubL(source = "cycl/arguments.lisp", position = 4868)
  public static final SubLObject argument_type_genls(SubLObject argument_type) {
    return cons(argument_type, argument_type_proper_genls(argument_type));
  }

  /** Return the truth of ARGUMENT. */
  @SubL(source = "cycl/arguments.lisp", position = 5533)
  public static final SubLObject argument_truth(SubLObject argument) {
    checkType(argument, $sym13$ARGUMENT_P);
    if ((NIL != belief_p(argument))) {
      return belief_truth(argument);
    } else {
      return deductions_high.deduction_truth(argument);
    }
  }

  /** Return the HL tv of ARGUMENT. */
  @SubL(source = "cycl/arguments.lisp", position = 5790)
  public static final SubLObject argument_tv(SubLObject argument) {
    checkType(argument, $sym13$ARGUMENT_P);
    if ((NIL != belief_p(argument))) {
      return belief_tv(argument);
    } else {
      {
        SubLObject truth = deductions_high.deduction_truth(argument);
        SubLObject strength = deductions_high.deduction_strength(argument);
        return enumeration_types.tv_from_truth_strength(truth, strength);
      }
    }
  }

  /** Return the strength of ARGUMENT. */
  @SubL(source = "cycl/arguments.lisp", position = 6117)
  public static final SubLObject argument_strength(SubLObject argument) {
    checkType(argument, $sym13$ARGUMENT_P);
    if ((NIL != belief_p(argument))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31879");
    } else {
      return deductions_high.deduction_strength(argument);
    }
  }

  /** Remove ARGUMENT from the KB, and unhook it from ASSERTION. */
  @SubL(source = "cycl/arguments.lisp", position = 6392)
  public static final SubLObject remove_argument(SubLObject argument, SubLObject assertion) {
    if ((NIL != belief_p(argument))) {
      return remove_belief(argument, assertion);
    } else {
      return deductions_interface.kb_remove_deduction(argument);
    }
  }

  /** Return T iff OBJECT is an HL belief structure. */
  @SubL(source = "cycl/arguments.lisp", position = 6636)
  public static final SubLObject belief_p(SubLObject object) {
    return asserted_argument_p(object);
  }

  @SubL(source = "cycl/arguments.lisp", position = 7281)
  public static final SubLObject remove_belief(SubLObject belief, SubLObject assertion) {
    return hl_modifiers.kb_remove_asserted_argument(assertion, belief);
  }

  @SubL(source = "cycl/arguments.lisp", position = 7500)
  public static final SubLObject belief_truth(SubLObject belief) {
    return asserted_argument_truth(belief);
  }

  @SubL(source = "cycl/arguments.lisp", position = 7668)
  public static final SubLObject belief_tv(SubLObject belief) {
    return asserted_argument_tv(belief);
  }

  /** Return T iff OBJECT is an HL asserted argument structure. */
  @SubL(source = "cycl/arguments.lisp", position = 7743)
  public static final SubLObject asserted_argument_p(SubLObject object) {
    return asserted_argument_token_p(object);
  }

  public static final class $asserted_argument_p$UnaryFunction extends UnaryFunction {
    public $asserted_argument_p$UnaryFunction() { super(extractFunctionNamed("ASSERTED-ARGUMENT-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return asserted_argument_p(arg1); }
  }

  /** Create an asserted argument for ASSERTION with TV. */
  @SubL(source = "cycl/arguments.lisp", position = 8450)
  public static final SubLObject create_asserted_argument(SubLObject assertion, SubLObject tv) {
    return asserted_argument_token_from_tv(tv);
  }

  @SubL(source = "cycl/arguments.lisp", position = 8621)
  public static final SubLObject create_asserted_argument_spec(SubLObject strength_spec) {
    checkType(strength_spec, $sym35$EL_STRENGTH_SPEC_P);
    return list($kw34$ASSERTED_ARGUMENT, strength_spec);
  }

  @SubL(source = "cycl/arguments.lisp", position = 8780)
  public static final SubLObject asserted_argument_spec_strength_spec(SubLObject asserted_argument_spec) {
    return conses_high.second(asserted_argument_spec);
  }

  @SubL(source = "cycl/arguments.lisp", position = 8899)
  public static final SubLObject kb_remove_asserted_argument_internal(SubLObject asserted_argument) {
    return NIL;
  }

  /** Asserted argument -> HL TV mapping */
  @SubL(source = "cycl/arguments.lisp", position = 9098)
  private static SubLSymbol $asserted_argument_tv_table$ = null;

  /** Tokens representing the possible asserted arguments */
  @SubL(source = "cycl/arguments.lisp", position = 9412)
  private static SubLSymbol $asserted_arguments$ = null;

  @SubL(source = "cycl/arguments.lisp", position = 9565)
  public static final SubLObject asserted_argument_tokens() {
    return $asserted_arguments$.getGlobalValue();
  }

  @SubL(source = "cycl/arguments.lisp", position = 9632)
  public static final SubLObject asserted_argument_token_p(SubLObject object) {
    return subl_promotions.memberP(object, $asserted_arguments$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED);
  }

  @SubL(source = "cycl/arguments.lisp", position = 9738)
  public static final SubLObject asserted_argument_token_from_tv(SubLObject tv) {
    checkType(tv, $sym38$TV_P);
    return Sequences.find(tv, $asserted_argument_tv_table$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function($sym39$SECOND), UNPROVIDED, UNPROVIDED).first();
  }

  @SubL(source = "cycl/arguments.lisp", position = 9885)
  public static final SubLObject tv_from_asserted_argument_token(SubLObject asserted_argument) {
    return conses_high.second(Sequences.find(asserted_argument, $asserted_argument_tv_table$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function($sym37$FIRST), UNPROVIDED, UNPROVIDED));
  }

  @SubL(source = "cycl/arguments.lisp", position = 10248)
  public static final SubLObject asserted_argument_tv(SubLObject asserted_argument) {
    if ((NIL != asserted_argument_token_p(asserted_argument))) {
      return tv_from_asserted_argument_token(asserted_argument);
    }
    return NIL;
  }

  @SubL(source = "cycl/arguments.lisp", position = 10553)
  public static final SubLObject asserted_argument_truth(SubLObject asserted_argument) {
    return enumeration_types.tv_truth(asserted_argument_tv(asserted_argument));
  }

  /** Return T iff OBJECT can be a support in an argument. */
  @SubL(source = "cycl/arguments.lisp", position = 12015)
  public static final SubLObject support_p(SubLObject object) {
    return makeBoolean(((NIL != assertion_handles.assertion_p(object))
          || (NIL != kb_hl_supports.kb_hl_support_p(object))
          || (NIL != hl_support_p(object))));
  }

  public static final class $support_p$UnaryFunction extends UnaryFunction {
    public $support_p$UnaryFunction() { super(extractFunctionNamed("SUPPORT-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return support_p(arg1); }
  }

  /** Return T if SUPPORT is a valid kb deduction support.
ROBUST requests more thorough checking. */
  @SubL(source = "cycl/arguments.lisp", position = 12466)
  public static final SubLObject valid_supportP(SubLObject support, SubLObject robust) {
    if ((robust == UNPROVIDED)) {
      robust = NIL;
    }
    if ((NIL != assertion_handles.assertion_p(support))) {
      return assertion_handles.valid_assertionP(support, UNPROVIDED);
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return kb_hl_supports.valid_kb_hl_supportP(support, robust);
    } else if ((NIL != hl_support_p(support))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31885");
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/arguments.lisp", position = 14530)
  public static final SubLObject support_equal(SubLObject support1, SubLObject support2) {
    if (((NIL != assertion_handles.assertion_p(support1))
        || (NIL != assertion_handles.assertion_p(support2)))) {
      return Equality.eq(support1, support2);
    } else if (((NIL != kb_hl_supports.kb_hl_support_p(support1))
        || (NIL != kb_hl_supports.kb_hl_support_p(support2)))) {
      return Equality.eq(support1, support2);
    } else {
      return Equality.equal(support1, support2);
    }
  }

  public static final class $support_equal$BinaryFunction extends BinaryFunction {
    public $support_equal$BinaryFunction() { super(extractFunctionNamed("SUPPORT-EQUAL")); }
    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return support_equal(arg1, arg2); }
  }

  /** Imposes an arbitrary but consistent total order between supports. */
  @SubL(source = "cycl/arguments.lisp", position = 14831)
  public static final SubLObject support_L(SubLObject support1, SubLObject support2) {
    if ((NIL != assertion_handles.assertion_p(support1))) {
      if ((NIL != assertion_handles.assertion_p(support2))) {
        if ((NIL != assertions_high.rule_assertionP(support1))) {
          if ((NIL != assertions_high.rule_assertionP(support2))) {
            return Numbers.numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
          } else {
            return T;
          }
        } else {
          if ((NIL != assertions_high.rule_assertionP(support2))) {
            return NIL;
          } else {
            return Numbers.numL(assertion_handles.assertion_id(support1), assertion_handles.assertion_id(support2));
          }
        }
      } else {
        return T;
      }
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support1))) {
      if ((NIL != assertion_handles.assertion_p(support2))) {
        return NIL;
      } else if ((NIL != kb_hl_supports.kb_hl_support_p(support2))) {
        return Numbers.numL(kb_hl_supports.kb_hl_support_id(support1), kb_hl_supports.kb_hl_support_id(support2));
      } else {
        return T;
      }
    } else {
      if ((NIL != assertion_handles.assertion_p(support2))) {
        return NIL;
      } else if ((NIL != kb_hl_supports.kb_hl_support_p(support2))) {
        return NIL;
      } else {
        return kb_utilities.term_L(support1, support2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  public static final class $support_L$BinaryFunction extends BinaryFunction {
    public $support_L$BinaryFunction() { super(extractFunctionNamed("SUPPORT-<")); }
    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return support_L(arg1, arg2); }
  }

  /** The module which denotes that an assertion is the support. */
  @SubL(source = "cycl/arguments.lisp", position = 16119)
  public static SubLSymbol $assertion_support_module$ = null;

  /** Return the module of SUPPORT. */
  @SubL(source = "cycl/arguments.lisp", position = 16252)
  public static final SubLObject support_module(SubLObject support) {
    checkType(support, $sym50$SUPPORT_P);
    if ((NIL != assertion_handles.assertion_p(support))) {
      return $assertion_support_module$.getGlobalValue();
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11038");
    } else {
      return hl_support_module(support);
    }
  }

  /** Return the sentence of SUPPORT. */
  @SubL(source = "cycl/arguments.lisp", position = 16591)
  public static final SubLObject support_sentence(SubLObject support) {
    checkType(support, $sym50$SUPPORT_P);
    if ((NIL != assertion_handles.assertion_p(support))) {
      return assertions_high.assertion_formula(support);
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return kb_hl_supports.kb_hl_support_sentence(support);
    } else {
      return hl_support_sentence(support);
    }
  }

  @SubL(source = "cycl/arguments.lisp", position = 17098)
  public static final SubLObject support_formula(SubLObject support) {
    return support_sentence(support);
  }

  /** Return the microtheory of SUPPORT. */
  @SubL(source = "cycl/arguments.lisp", position = 18775)
  public static final SubLObject support_mt(SubLObject support) {
    checkType(support, $sym50$SUPPORT_P);
    if ((NIL != assertion_handles.assertion_p(support))) {
      return assertions_high.assertion_mt(support);
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11039");
    } else {
      return hl_support_mt(support);
    }
  }

  public static final class $support_mt$UnaryFunction extends UnaryFunction {
    public $support_mt$UnaryFunction() { super(extractFunctionNamed("SUPPORT-MT")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return support_mt(arg1); }
  }

  /** Return a justification for SUPPORT. */
  @SubL(source = "cycl/arguments.lisp", position = 19404)
  public static final SubLObject support_justification(SubLObject support) {
    if ((NIL != assertion_handles.assertion_p(support))) {
      return list(support);
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11036");
    } else {
      return hl_supports.hl_support_justify(support);
    }
  }

  /** Return the strength of SUPPORT. */
  @SubL(source = "cycl/arguments.lisp", position = 19973)
  public static final SubLObject support_strength(SubLObject support) {
    checkType(support, $sym50$SUPPORT_P);
    return enumeration_types.tv_strength(support_tv(support));
  }

  @SubL(source = "cycl/arguments.lisp", position = 20170)
  public static final SubLObject support_tv(SubLObject support) {
    if ((NIL != assertion_handles.assertion_p(support))) {
      return assertions_high.cyc_assertion_tv(support);
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return kb_hl_supports.kb_hl_support_tv(support);
    } else {
      return hl_support_tv(support);
    }
  }

  /** Return a sorted list of canonicalized supports.  This is not destructive. */
  @SubL(source = "cycl/arguments.lisp", position = 20420)
  public static final SubLObject canonicalize_supports(SubLObject supports, SubLObject possibly_create_new_kb_hl_supportsP) {
    if ((possibly_create_new_kb_hl_supportsP == UNPROVIDED)) {
      possibly_create_new_kb_hl_supportsP = T;
    }
    {
      SubLObject new_supports = NIL;
      SubLObject cdolist_list_var = supports;
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        new_supports = cons(canonicalize_support(support, possibly_create_new_kb_hl_supportsP), new_supports);
      }
      return Sort.sort(new_supports, $sym54$SUPPORT__, UNPROVIDED);
    }
  }

  /** Canonicalize SUPPORT.  If SUPPORT is an assertion or KB HL support, this simply returns SUPPORT.
   Otherwise, the function attempts to find a KB HL support for SUPPORT or, if POSSIBLY-CREATE-NEW-KB-HL-SUPPORT?
   is non-NIL, it may create a new one. */
  @SubL(source = "cycl/arguments.lisp", position = 20791)
  public static final SubLObject canonicalize_support(SubLObject support, SubLObject possibly_create_new_kb_hl_supportP) {
    if ((possibly_create_new_kb_hl_supportP == UNPROVIDED)) {
      possibly_create_new_kb_hl_supportP = T;
    }
    if ((NIL != assertion_handles.assertion_p(support))) {
      return support;
    } else if ((NIL != kb_hl_supports.kb_hl_support_p(support))) {
      return support;
    } else {
      return canonicalize_hl_support(support, possibly_create_new_kb_hl_supportP);
    }
  }

  @SubL(source = "cycl/arguments.lisp", position = 21325)
  public static final SubLObject canonicalize_hl_support(SubLObject hl_support, SubLObject possibly_create_new_kb_hl_supportP) {
    if ((possibly_create_new_kb_hl_supportP == UNPROVIDED)) {
      possibly_create_new_kb_hl_supportP = T;
    }
    {
      SubLObject canon_support = assertion_from_hl_support(hl_support);
      if ((NIL == canon_support)) {
        if ((NIL != possibly_create_new_kb_hl_supportP)) {
          canon_support = kb_hl_supports.find_or_possibly_create_kb_hl_support(hl_support);
        } else {
          canon_support = kb_hl_supports.find_kb_hl_support(hl_support);
        }
      }
      return ((NIL != canon_support) ? ((SubLObject) canon_support) : hl_support);
    }
  }

  /** Does OBJECT represent an HL support? */
  @SubL(source = "cycl/arguments.lisp", position = 21751)
  public static final SubLObject hl_support_p(SubLObject object) {
    return makeBoolean((object.isList()
           && (NIL != list_utilities.proper_list_p(object))
           && (NIL != list_utilities.lengthE(object, FOUR_INTEGER, UNPROVIDED))
           && (NIL != hl_supports.hl_support_module_p(object.first()))));
  }

  /** Construct a new HL support. */
  @SubL(source = "cycl/arguments.lisp", position = 22030)
  public static final SubLObject make_hl_support(SubLObject hl_module, SubLObject sentence, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((tv == UNPROVIDED)) {
      tv = $kw75$TRUE_DEF;
    }
    checkType(hl_module, $sym76$HL_SUPPORT_MODULE_P);
    checkType(sentence, $sym77$POSSIBLY_CYCL_SENTENCE_P);
    checkType(mt, $sym78$HLMT_P);
    checkType(tv, $sym38$TV_P);
    return list(hl_module, sentence, mt, tv);
  }

  @SubL(source = "cycl/arguments.lisp", position = 22837)
  public static final SubLObject assertion_from_hl_support(SubLObject hl_support) {
    {
      SubLObject assertion = NIL;
      if ((hl_support_module(hl_support) == $assertion_support_module$.getGlobalValue())) {
        assertion = czer_meta.find_assertion_cycl(hl_support_sentence(hl_support), hl_support_mt(hl_support));
      }
      return assertion;
    }
  }

  @SubL(source = "cycl/arguments.lisp", position = 23727)
  public static final SubLObject hl_support_module(SubLObject hl_support) {
    checkType(hl_support, $sym73$HL_SUPPORT_P);
    return hl_support.first();
  }

  @SubL(source = "cycl/arguments.lisp", position = 23858)
  public static final SubLObject hl_support_sentence(SubLObject hl_support) {
    checkType(hl_support, $sym73$HL_SUPPORT_P);
    return conses_high.second(hl_support);
  }

  @SubL(source = "cycl/arguments.lisp", position = 23978)
  public static final SubLObject hl_support_mt(SubLObject hl_support) {
    checkType(hl_support, $sym73$HL_SUPPORT_P);
    return conses_high.third(hl_support);
  }

  @SubL(source = "cycl/arguments.lisp", position = 24091)
  public static final SubLObject hl_support_tv(SubLObject hl_support) {
    checkType(hl_support, $sym73$HL_SUPPORT_P);
    return conses_high.fourth(hl_support);
  }

  @SubL(source = "cycl/arguments.lisp", position = 24616)
  public static final SubLObject non_empty_hl_justification_p(SubLObject object) {
    return makeBoolean(((NIL != list_utilities.proper_list_p(object))
           && (NIL != list_utilities.every_in_list(Symbols.symbol_function($sym50$SUPPORT_P), object, UNPROVIDED))));
  }

  @SubL(source = "cycl/arguments.lisp", position = 24823)
  public static final SubLObject justification_equal(SubLObject justification1, SubLObject justification2) {
    return list_utilities.multisets_equalP(justification1, justification2, $sym87$SUPPORT_EQUAL);
  }

  public static final class $justification_equal$BinaryFunction extends BinaryFunction {
    public $justification_equal$BinaryFunction() { super(extractFunctionNamed("JUSTIFICATION-EQUAL")); }
    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return justification_equal(arg1, arg2); }
  }

  @SubL(source = "cycl/arguments.lisp", position = 24964)
  public static final SubLObject canonicalize_hl_justification(SubLObject hl_justification) {
    checkType(hl_justification, $sym86$HL_JUSTIFICATION_P);
    return Sort.sort(conses_high.copy_list(hl_justification), Symbols.symbol_function($sym54$SUPPORT__), UNPROVIDED);
  }

  public static final SubLObject declare_arguments_file() {
    declareMacro(myName, "do_arguments", "DO-ARGUMENTS");
    declareMacro(myName, "do_beliefs", "DO-BELIEFS");
    declareMacro(myName, "do_asserted_arguments", "DO-ASSERTED-ARGUMENTS");
    declareFunction(myName, "argument_p", "ARGUMENT-P", 1, 0, false);
    declareFunction(myName, "valid_argument", "VALID-ARGUMENT", 1, 1, false);
    declareFunction(myName, "argument_spec_p", "ARGUMENT-SPEC-P", 1, 0, false);
    declareFunction(myName, "argument_to_argument_spec", "ARGUMENT-TO-ARGUMENT-SPEC", 1, 0, false);
    declareFunction(myName, "argument_spec_type", "ARGUMENT-SPEC-TYPE", 1, 0, false);
    declareFunction(myName, "argument_type_p", "ARGUMENT-TYPE-P", 1, 0, false);
    declareFunction(myName, "argument_type_hierarchy", "ARGUMENT-TYPE-HIERARCHY", 0, 0, false);
    declareFunction(myName, "argument_type_proper_genls", "ARGUMENT-TYPE-PROPER-GENLS", 1, 0, false); new $argument_type_proper_genls$UnaryFunction();
    declareFunction(myName, "argument_type_genls", "ARGUMENT-TYPE-GENLS", 1, 0, false);
    declareFunction(myName, "argument_equal", "ARGUMENT-EQUAL", 2, 0, false);
    declareFunction(myName, "argument_truth", "ARGUMENT-TRUTH", 1, 0, false);
    declareFunction(myName, "argument_tv", "ARGUMENT-TV", 1, 0, false);
    declareFunction(myName, "argument_strength", "ARGUMENT-STRENGTH", 1, 0, false);
    declareFunction(myName, "remove_argument", "REMOVE-ARGUMENT", 2, 0, false);
    declareFunction(myName, "belief_p", "BELIEF-P", 1, 0, false);
    declareFunction(myName, "belief_spec_p", "BELIEF-SPEC-P", 1, 0, false);
    declareFunction(myName, "belief_to_belief_spec", "BELIEF-TO-BELIEF-SPEC", 1, 0, false);
    declareFunction(myName, "remove_belief", "REMOVE-BELIEF", 2, 0, false);
    declareFunction(myName, "belief_equal", "BELIEF-EQUAL", 2, 0, false);
    declareFunction(myName, "belief_truth", "BELIEF-TRUTH", 1, 0, false);
    declareFunction(myName, "belief_strength", "BELIEF-STRENGTH", 1, 0, false);
    declareFunction(myName, "belief_tv", "BELIEF-TV", 1, 0, false);
    declareFunction(myName, "asserted_argument_p", "ASSERTED-ARGUMENT-P", 1, 0, false); new $asserted_argument_p$UnaryFunction();
    declareFunction(myName, "asserted_argument_spec_p", "ASSERTED-ARGUMENT-SPEC-P", 1, 0, false);
    declareFunction(myName, "asserted_argument_to_asserted_argument_spec", "ASSERTED-ARGUMENT-TO-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
    declareFunction(myName, "create_asserted_argument", "CREATE-ASSERTED-ARGUMENT", 2, 0, false);
    declareFunction(myName, "create_asserted_argument_spec", "CREATE-ASSERTED-ARGUMENT-SPEC", 1, 0, false);
    declareFunction(myName, "asserted_argument_spec_strength_spec", "ASSERTED-ARGUMENT-SPEC-STRENGTH-SPEC", 1, 0, false);
    declareFunction(myName, "kb_remove_asserted_argument_internal", "KB-REMOVE-ASSERTED-ARGUMENT-INTERNAL", 1, 0, false);
    declareFunction(myName, "asserted_argument_tokens", "ASSERTED-ARGUMENT-TOKENS", 0, 0, false);
    declareFunction(myName, "asserted_argument_token_p", "ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
    declareFunction(myName, "asserted_argument_token_from_tv", "ASSERTED-ARGUMENT-TOKEN-FROM-TV", 1, 0, false);
    declareFunction(myName, "tv_from_asserted_argument_token", "TV-FROM-ASSERTED-ARGUMENT-TOKEN", 1, 0, false);
    declareFunction(myName, "make_empty_local_support_set", "MAKE-EMPTY-LOCAL-SUPPORT-SET", 0, 0, false);
    declareFunction(myName, "asserted_argument_equal", "ASSERTED-ARGUMENT-EQUAL", 2, 0, false);
    declareFunction(myName, "asserted_argument_tv", "ASSERTED-ARGUMENT-TV", 1, 0, false);
    declareFunction(myName, "asserted_argument_strength", "ASSERTED-ARGUMENT-STRENGTH", 1, 0, false);
    declareFunction(myName, "asserted_argument_truth", "ASSERTED-ARGUMENT-TRUTH", 1, 0, false);
    declareFunction(myName, "kb_lookup_asserted_argument", "KB-LOOKUP-ASSERTED-ARGUMENT", 3, 0, false);
    declareFunction(myName, "lookup_asserted_argument", "LOOKUP-ASSERTED-ARGUMENT", 3, 0, false);
    declareFunction(myName, "list_of_cycl_support_p", "LIST-OF-CYCL-SUPPORT-P", 1, 0, false);
    declareFunction(myName, "cycl_support_p", "CYCL-SUPPORT-P", 1, 0, false);
    declareFunction(myName, "support_p", "SUPPORT-P", 1, 0, false); new $support_p$UnaryFunction();
    declareFunction(myName, "supports_p", "SUPPORTS-P", 1, 0, false);
    declareFunction(myName, "support_list_p", "SUPPORT-LIST-P", 1, 0, false);
    declareFunction(myName, "valid_supportP", "VALID-SUPPORT?", 1, 1, false);
    declareFunction(myName, "ill_formed_hl_supportP", "ILL-FORMED-HL-SUPPORT?", 1, 0, false);
    declareFunction(myName, "hl_support_syntactically_illformedP", "HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
    declareFunction(myName, "kb_hl_support_syntactically_illformedP", "KB-HL-SUPPORT-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
    declareFunction(myName, "assertion_syntactically_illformedP", "ASSERTION-SYNTACTICALLY-ILLFORMED?", 1, 0, false);
    declareFunction(myName, "support_equal", "SUPPORT-EQUAL", 2, 0, false); new $support_equal$BinaryFunction();
    declareFunction(myName, "support_L", "SUPPORT-<", 2, 0, false); new $support_L$BinaryFunction();
    declareFunction(myName, "sort_supports", "SORT-SUPPORTS", 1, 0, false);
    declareFunction(myName, "support_module", "SUPPORT-MODULE", 1, 0, false);
    declareFunction(myName, "support_sentence", "SUPPORT-SENTENCE", 1, 0, false);
    declareFunction(myName, "support_sentence_operator", "SUPPORT-SENTENCE-OPERATOR", 1, 0, false);
    declareFunction(myName, "support_formula", "SUPPORT-FORMULA", 1, 0, false);
    declareFunction(myName, "support_el_sentence", "SUPPORT-EL-SENTENCE", 1, 0, false);
    declareFunction(myName, "support_ist_sentence", "SUPPORT-IST-SENTENCE", 1, 0, false);
    declareFunction(myName, "support_el_ist_sentence", "SUPPORT-EL-IST-SENTENCE", 1, 0, false);
    declareFunction(myName, "support_cons", "SUPPORT-CONS", 1, 0, false);
    declareFunction(myName, "support_mt", "SUPPORT-MT", 1, 0, false); new $support_mt$UnaryFunction();
    declareFunction(myName, "support_elmt", "SUPPORT-ELMT", 1, 0, false);
    declareFunction(myName, "support_justification", "SUPPORT-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "support_truth", "SUPPORT-TRUTH", 1, 0, false);
    declareFunction(myName, "support_strength", "SUPPORT-STRENGTH", 1, 0, false);
    declareFunction(myName, "support_tv", "SUPPORT-TV", 1, 0, false);
    declareFunction(myName, "canonicalize_supports", "CANONICALIZE-SUPPORTS", 1, 1, false);
    declareFunction(myName, "canonicalize_support", "CANONICALIZE-SUPPORT", 1, 1, false);
    declareFunction(myName, "canonicalize_hl_support", "CANONICALIZE-HL-SUPPORT", 1, 1, false);
    declareFunction(myName, "hl_support_p", "HL-SUPPORT-P", 1, 0, false);
    declareFunction(myName, "make_hl_support", "MAKE-HL-SUPPORT", 2, 2, false);
    declareFunction(myName, "hl_support_from_assertion", "HL-SUPPORT-FROM-ASSERTION", 1, 0, false);
    declareFunction(myName, "assertion_from_hl_support", "ASSERTION-FROM-HL-SUPPORT", 1, 0, false);
    declareFunction(myName, "valid_hl_supportP", "VALID-HL-SUPPORT?", 1, 0, false);
    declareFunction(myName, "hl_support_with_module_p", "HL-SUPPORT-WITH-MODULE-P", 2, 0, false);
    declareFunction(myName, "hl_support_module", "HL-SUPPORT-MODULE", 1, 0, false);
    declareFunction(myName, "hl_support_sentence", "HL-SUPPORT-SENTENCE", 1, 0, false);
    declareFunction(myName, "hl_support_mt", "HL-SUPPORT-MT", 1, 0, false);
    declareFunction(myName, "hl_support_tv", "HL-SUPPORT-TV", 1, 0, false);
    declareFunction(myName, "genl_preds_support_p", "GENL-PREDS-SUPPORT-P", 1, 0, false);
    declareFunction(myName, "hl_justification_p", "HL-JUSTIFICATION-P", 1, 0, false);
    declareFunction(myName, "hl_justification_list_p", "HL-JUSTIFICATION-LIST-P", 1, 0, false);
    declareFunction(myName, "non_empty_hl_justification_p", "NON-EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
    declareFunction(myName, "empty_hl_justification_p", "EMPTY-HL-JUSTIFICATION-P", 1, 0, false);
    declareFunction(myName, "justification_equal", "JUSTIFICATION-EQUAL", 2, 0, false); new $justification_equal$BinaryFunction();
    declareFunction(myName, "canonicalize_hl_justification", "CANONICALIZE-HL-JUSTIFICATION", 1, 0, false);
    declareFunction(myName, "hl_support_justification_p", "HL-SUPPORT-JUSTIFICATION-P", 1, 0, false);
    declareFunction(myName, "hl_justification_to_hl_support_justification", "HL-JUSTIFICATION-TO-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_arguments_file() {
    $argument_types$ = deflexical("*ARGUMENT-TYPES*", $list18);
    $argument_type_hierarchy$ = deflexical("*ARGUMENT-TYPE-HIERARCHY*", $list19);
    $asserted_argument_tv_table$ = deflexical("*ASSERTED-ARGUMENT-TV-TABLE*", $list36);
    $asserted_arguments$ = deflexical("*ASSERTED-ARGUMENTS*", Mapping.mapcar(Symbols.symbol_function($sym37$FIRST), $asserted_argument_tv_table$.getGlobalValue()));
    $assertion_support_module$ = deflexical("*ASSERTION-SUPPORT-MODULE*", $kw55$ASSERTION);
    return NIL;
  }

  public static final SubLObject setup_arguments_file() {
    // CVS_ID("Id: arguments.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym13$ARGUMENT_P, $list14, $str15$Return_T_iff_OBJECT_is_an_HL_argu, NIL, $list16);
    utilities_macros.register_cyc_api_function($sym21$ARGUMENT_EQUAL, $list22, $str23$Return_T_iff_ARGUMENT1_and_ARGUME, NIL, $list16);
    utilities_macros.register_cyc_api_function($sym24$ARGUMENT_TRUTH, $list25, $str26$Return_the_truth_of_ARGUMENT_, $list27, $list28);
    utilities_macros.register_cyc_api_function($sym29$ARGUMENT_STRENGTH, $list25, $str30$Return_the_strength_of_ARGUMENT_, $list27, $list31);
    utilities_macros.register_cyc_api_function($sym12$ASSERTED_ARGUMENT_P, $list14, $str33$Return_T_iff_OBJECT_is_an_HL_asse, NIL, $list16);
    utilities_macros.register_cyc_api_function($sym44$KB_LOOKUP_ASSERTED_ARGUMENT, $list46, $str47$Return_the_asserted_argument_with, $list48, $list49);
    utilities_macros.register_cyc_api_function($sym50$SUPPORT_P, $list14, $str51$Return_T_iff_OBJECT_can_be_a_supp, NIL, $list16);
    utilities_macros.register_cyc_api_function($sym56$SUPPORT_MODULE, $list57, $str58$Return_the_module_of_SUPPORT_, $list59, $list60);
    utilities_macros.register_cyc_api_function($sym61$SUPPORT_SENTENCE, $list57, $str62$Return_the_sentence_of_SUPPORT_, $list59, $list63);
    access_macros.define_obsolete_register($sym64$SUPPORT_FORMULA, $list65);
    utilities_macros.register_cyc_api_function($sym66$SUPPORT_MT, $list57, $str67$Return_the_microtheory_of_SUPPORT, $list59, $list68);
    utilities_macros.register_cyc_api_function($sym69$SUPPORT_TRUTH, $list57, $str70$Return_the_truth_of_SUPPORT_, $list59, $list28);
    utilities_macros.register_cyc_api_function($sym71$SUPPORT_STRENGTH, $list57, $str72$Return_the_strength_of_SUPPORT_, $list59, $list31);
    utilities_macros.register_cyc_api_function($sym73$HL_SUPPORT_P, $list14, $str74$Does_OBJECT_represent_an_HL_suppo, NIL, $list16);
    utilities_macros.register_cyc_api_function($sym79$MAKE_HL_SUPPORT, $list80, $str81$Construct_a_new_HL_support_, $list82, $list83);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str1$mapping_Cyc_arguments = makeString("mapping Cyc arguments");
  public static final SubLSymbol $sym2$DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");
  public static final SubLSymbol $sym3$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym4$ASSERTION_ARGUMENTS = makeSymbol("ASSERTION-ARGUMENTS");
  public static final SubLList $list5 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc belief arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str6$mapping_Cyc_belief_arguments = makeString("mapping Cyc belief arguments");
  public static final SubLSymbol $sym7$DO_ARGUMENTS = makeSymbol("DO-ARGUMENTS");
  public static final SubLSymbol $sym8$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym9$BELIEF_P = makeSymbol("BELIEF-P");
  public static final SubLList $list10 = list(list(makeSymbol("ASSERTION"), makeSymbol("ARGUMENT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc asserted arguments"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str11$mapping_Cyc_asserted_arguments = makeString("mapping Cyc asserted arguments");
  public static final SubLSymbol $sym12$ASSERTED_ARGUMENT_P = makeSymbol("ASSERTED-ARGUMENT-P");
  public static final SubLSymbol $sym13$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLList $list14 = list(makeSymbol("OBJECT"));
  public static final SubLString $str15$Return_T_iff_OBJECT_is_an_HL_argu = makeString("Return T iff OBJECT is an HL argument structure.");
  public static final SubLList $list16 = list(makeSymbol("BOOLEANP"));
  public static final SubLString $str17$unexpected_argument_type = makeString("unexpected argument type");
  public static final SubLList $list18 = list(makeKeyword("ARGUMENT"), makeKeyword("BELIEF"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("DEDUCTION"));
  public static final SubLList $list19 = list(list(makeKeyword("ARGUMENT"), NIL), list(makeKeyword("BELIEF"), list(makeKeyword("ARGUMENT"))), list(makeKeyword("ASSERTED-ARGUMENT"), list(makeKeyword("BELIEF"))), list(makeKeyword("DEDUCTION"), list(makeKeyword("ARGUMENT"))));
  public static final SubLSymbol $sym20$ARGUMENT_TYPE_PROPER_GENLS = makeSymbol("ARGUMENT-TYPE-PROPER-GENLS");
  public static final SubLSymbol $sym21$ARGUMENT_EQUAL = makeSymbol("ARGUMENT-EQUAL");
  public static final SubLList $list22 = list(makeSymbol("ARGUMENT1"), makeSymbol("ARGUMENT2"));
  public static final SubLString $str23$Return_T_iff_ARGUMENT1_and_ARGUME = makeString("Return T iff ARGUMENT1 and ARGUMENT2 are equivalent arguments.");
  public static final SubLSymbol $sym24$ARGUMENT_TRUTH = makeSymbol("ARGUMENT-TRUTH");
  public static final SubLList $list25 = list(makeSymbol("ARGUMENT"));
  public static final SubLString $str26$Return_the_truth_of_ARGUMENT_ = makeString("Return the truth of ARGUMENT.");
  public static final SubLList $list27 = list(list(makeSymbol("ARGUMENT"), makeSymbol("ARGUMENT-P")));
  public static final SubLList $list28 = list(makeSymbol("TRUTH-P"));
  public static final SubLSymbol $sym29$ARGUMENT_STRENGTH = makeSymbol("ARGUMENT-STRENGTH");
  public static final SubLString $str30$Return_the_strength_of_ARGUMENT_ = makeString("Return the strength of ARGUMENT.");
  public static final SubLList $list31 = list(makeSymbol("EL-STRENGTH-P"));
  public static final SubLString $str32$unexpected_belief_type = makeString("unexpected belief type");
  public static final SubLString $str33$Return_T_iff_OBJECT_is_an_HL_asse = makeString("Return T iff OBJECT is an HL asserted argument structure.");
  public static final SubLSymbol $kw34$ASSERTED_ARGUMENT = makeKeyword("ASSERTED-ARGUMENT");
  public static final SubLSymbol $sym35$EL_STRENGTH_SPEC_P = makeSymbol("EL-STRENGTH-SPEC-P");
  public static final SubLList $list36 = list(list(makeKeyword("ASSERTED-TRUE-MON"), makeKeyword("TRUE-MON")), list(makeKeyword("ASSERTED-TRUE-DEF"), makeKeyword("TRUE-DEF")), list(makeKeyword("ASSERTED-UNKNOWN"), makeKeyword("UNKNOWN")), list(makeKeyword("ASSERTED-FALSE-DEF"), makeKeyword("FALSE-DEF")), list(makeKeyword("ASSERTED-FALSE-MON"), makeKeyword("FALSE-MON")));
  public static final SubLSymbol $sym37$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym38$TV_P = makeSymbol("TV-P");
  public static final SubLSymbol $sym39$SECOND = makeSymbol("SECOND");
  public static final SubLList $list40 = list(makeKeyword("LOCAL"));
  public static final SubLSymbol $sym41$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym42$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $sym43$EL_STRENGTH_P = makeSymbol("EL-STRENGTH-P");
  public static final SubLSymbol $sym44$KB_LOOKUP_ASSERTED_ARGUMENT = makeSymbol("KB-LOOKUP-ASSERTED-ARGUMENT");
  public static final SubLSymbol $sym45$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list46 = list(makeSymbol("ASSERTION"), makeSymbol("TRUTH"), makeSymbol("STRENGTH"));
  public static final SubLString $str47$Return_the_asserted_argument_with = makeString("Return the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.\n   Return NIL otherwise.");
  public static final SubLList $list48 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")), list(makeSymbol("STRENGTH"), makeSymbol("EL-STRENGTH-P")));
  public static final SubLList $list49 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTED-ARGUMENT-P")));
  public static final SubLSymbol $sym50$SUPPORT_P = makeSymbol("SUPPORT-P");
  public static final SubLString $str51$Return_T_iff_OBJECT_can_be_a_supp = makeString("Return T iff OBJECT can be a support in an argument.");
  public static final SubLSymbol $sym52$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw53$SYNTACTICALLY_ILL_FORMED = makeKeyword("SYNTACTICALLY-ILL-FORMED");
  public static final SubLSymbol $sym54$SUPPORT__ = makeSymbol("SUPPORT-<");
  public static final SubLSymbol $kw55$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $sym56$SUPPORT_MODULE = makeSymbol("SUPPORT-MODULE");
  public static final SubLList $list57 = list(makeSymbol("SUPPORT"));
  public static final SubLString $str58$Return_the_module_of_SUPPORT_ = makeString("Return the module of SUPPORT.");
  public static final SubLList $list59 = list(list(makeSymbol("SUPPORT"), makeSymbol("SUPPORT-P")));
  public static final SubLList $list60 = list(makeSymbol("HL-SUPPORT-MODULE-P"));
  public static final SubLSymbol $sym61$SUPPORT_SENTENCE = makeSymbol("SUPPORT-SENTENCE");
  public static final SubLString $str62$Return_the_sentence_of_SUPPORT_ = makeString("Return the sentence of SUPPORT.");
  public static final SubLList $list63 = list(makeSymbol("CONSP"));
  public static final SubLSymbol $sym64$SUPPORT_FORMULA = makeSymbol("SUPPORT-FORMULA");
  public static final SubLList $list65 = list(makeSymbol("SUPPORT-SENTENCE"));
  public static final SubLSymbol $sym66$SUPPORT_MT = makeSymbol("SUPPORT-MT");
  public static final SubLString $str67$Return_the_microtheory_of_SUPPORT = makeString("Return the microtheory of SUPPORT.");
  public static final SubLList $list68 = list(makeSymbol("HLMT-P"));
  public static final SubLSymbol $sym69$SUPPORT_TRUTH = makeSymbol("SUPPORT-TRUTH");
  public static final SubLString $str70$Return_the_truth_of_SUPPORT_ = makeString("Return the truth of SUPPORT.");
  public static final SubLSymbol $sym71$SUPPORT_STRENGTH = makeSymbol("SUPPORT-STRENGTH");
  public static final SubLString $str72$Return_the_strength_of_SUPPORT_ = makeString("Return the strength of SUPPORT.");
  public static final SubLSymbol $sym73$HL_SUPPORT_P = makeSymbol("HL-SUPPORT-P");
  public static final SubLString $str74$Does_OBJECT_represent_an_HL_suppo = makeString("Does OBJECT represent an HL support?");
  public static final SubLSymbol $kw75$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $sym76$HL_SUPPORT_MODULE_P = makeSymbol("HL-SUPPORT-MODULE-P");
  public static final SubLSymbol $sym77$POSSIBLY_CYCL_SENTENCE_P = makeSymbol("POSSIBLY-CYCL-SENTENCE-P");
  public static final SubLSymbol $sym78$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym79$MAKE_HL_SUPPORT = makeSymbol("MAKE-HL-SUPPORT");
  public static final SubLList $list80 = list(makeSymbol("HL-MODULE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeSymbol("*MT*")), list(makeSymbol("TV"), makeKeyword("TRUE-DEF")));
  public static final SubLString $str81$Construct_a_new_HL_support_ = makeString("Construct a new HL support.");
  public static final SubLList $list82 = list(list(makeSymbol("HL-MODULE"), makeSymbol("HL-SUPPORT-MODULE-P")), list(makeSymbol("SENTENCE"), makeSymbol("POSSIBLY-CYCL-SENTENCE-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")), list(makeSymbol("TV"), makeSymbol("TV-P")));
  public static final SubLList $list83 = list(makeSymbol("HL-SUPPORT-P"));
  public static final SubLSymbol $sym84$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");
  public static final SubLSymbol $kw85$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLSymbol $sym86$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLSymbol $sym87$SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_arguments_file();
  }

  @Override
  public void initializeVariables() {
    init_arguments_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_arguments_file();
  }

}
