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
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.assertions_interface;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.deductions_interface;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class argumentation extends SubLTranslatedFile {

  //// Constructor

  private argumentation() {}
  public static final SubLFile me = new argumentation();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.argumentation";

  //// Definitions

  @SubL(source = "cycl/inference/harness/argumentation.lisp", position = 682) 
  public static final SubLObject compute_supports_tv(SubLObject supports, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw0$TRUE;
    }
    {
      SubLObject datum = supports;
      SubLObject current = datum;
      SubLObject first_support = NIL;
      SubLObject rest_supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list1);
      first_support = current.first();
      current = current.rest();
      rest_supports = current;
      {
        SubLObject strength = arguments.support_strength(first_support);
        SubLObject cdolist_list_var = rest_supports;
        SubLObject rest_support = NIL;
        for (rest_support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), rest_support = cdolist_list_var.first()) {
          strength = strength_combine(strength, arguments.support_strength(rest_support));
        }
        return enumeration_types.tv_from_truth_strength(truth, strength);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/argumentation.lisp", position = 1557) 
  public static final SubLObject compute_assertion_tv(SubLObject assertion) {
    checkType(assertion, $sym4$ASSERTION_P);
    {
      SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
      SubLObject old_tv = assertions_high.cyc_assertion_tv(assertion);
      SubLObject new_tv = perform_argumentation(v_arguments);
      if ((old_tv != new_tv)) {
        assertions_interface.kb_set_assertion_truth(assertion, enumeration_types.tv_truth(new_tv));
        assertions_interface.kb_set_assertion_strength(assertion, enumeration_types.tv_strength(new_tv));
        sbhl_link_methods.possibly_update_sbhl_links_tv(assertion, old_tv);
      }
      return new_tv;
    }
  }

  @SubL(source = "cycl/inference/harness/argumentation.lisp", position = 2153) 
  public static final SubLObject strength_combine(SubLObject strength1, SubLObject strength2) {
    if (((strength1 == $kw5$UNKNOWN)
        || (strength2 == $kw5$UNKNOWN))) {
      return $kw5$UNKNOWN;
    } else if (((strength1 == $kw6$DEFAULT)
        || (strength2 == $kw6$DEFAULT))) {
      return $kw6$DEFAULT;
    } else {
      return $kw7$MONOTONIC;
    }
  }

  /** @return tv-p */
  @SubL(source = "cycl/inference/harness/argumentation.lisp", position = 2412) 
  public static final SubLObject perform_argumentation(SubLObject v_arguments) {
    {
      SubLObject list_var = v_arguments;
      checkType(list_var, $sym8$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym9$ARGUMENT_P);
        }
      }
    }
    if ((NIL == v_arguments)) {
      return $kw5$UNKNOWN;
    }
    if (Sequences.length(v_arguments).numE(ONE_INTEGER)) {
      return arguments.argument_tv(v_arguments.first());
    }
    {
      SubLObject tv = arguments.argument_tv(v_arguments.first());
      SubLObject done = NIL;
      if ((NIL == done)) {
        {
          SubLObject csome_list_var = v_arguments.rest();
          SubLObject argument = NIL;
          for (argument = csome_list_var.first(); (!(((NIL != done)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {
            done = makeBoolean((tv != arguments.argument_tv(argument)));
          }
        }
      }
      if ((NIL == done)) {
        return tv;
      }
    }
    if (((NIL != subl_promotions.memberP($kw10$TRUE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV)))
         && (NIL != conses_high.member($kw12$FALSE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV))))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35548");
    }
    if ((NIL != subl_promotions.memberP($kw10$TRUE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV)))) {
      return $kw10$TRUE_MON;
    }
    if ((NIL != subl_promotions.memberP($kw12$FALSE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV)))) {
      return $kw12$FALSE_MON;
    }
    {
      SubLObject asserted_argument = Sequences.find_if(Symbols.symbol_function($sym13$ASSERTED_ARGUMENT_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != asserted_argument)) {
        return arguments.argument_tv(asserted_argument);
      }
    }
    if (((NIL != subl_promotions.memberP($kw14$TRUE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV)))
         && (NIL != conses_high.member($kw15$FALSE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV))))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35547");
    }
    if ((NIL != subl_promotions.memberP($kw14$TRUE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV)))) {
      return $kw14$TRUE_DEF;
    }
    if ((NIL != subl_promotions.memberP($kw15$FALSE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym11$ARGUMENT_TV)))) {
      return $kw15$FALSE_DEF;
    }
    return $kw5$UNKNOWN;
  }

  /** When non-nil, monotonic contradictions during argumentation are simply treated as :UNKNOWN rather than erroring. */
  @SubL(source = "cycl/inference/harness/argumentation.lisp", position = 4632) 
  public static SubLSymbol $tms_treat_monotonic_contradiction_as_unknownP$ = null;

  public static final SubLObject declare_argumentation_file() {
    declareFunction(myName, "compute_supports_tv", "COMPUTE-SUPPORTS-TV", 1, 1, false);
    declareFunction(myName, "compute_deduction_tv", "COMPUTE-DEDUCTION-TV", 1, 0, false);
    declareFunction(myName, "compute_assertion_tv", "COMPUTE-ASSERTION-TV", 1, 0, false);
    declareFunction(myName, "strength_combine", "STRENGTH-COMBINE", 2, 0, false);
    declareFunction(myName, "perform_argumentation", "PERFORM-ARGUMENTATION", 1, 0, false);
    declareFunction(myName, "complex_argumentation", "COMPLEX-ARGUMENTATION", 1, 0, false);
    declareFunction(myName, "resolve_contradiction", "RESOLVE-CONTRADICTION", 1, 0, false);
    declareFunction(myName, "tms_deduction_spec_p", "TMS-DEDUCTION-SPEC-P", 1, 0, false);
    declareFunction(myName, "tms_deduction_spec_tv", "TMS-DEDUCTION-SPEC-TV", 1, 0, false);
    declareFunction(myName, "perform_tms_deduction_spec_argumentation", "PERFORM-TMS-DEDUCTION-SPEC-ARGUMENTATION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_argumentation_file() {
    $tms_treat_monotonic_contradiction_as_unknownP$ = defvar("*TMS-TREAT-MONOTONIC-CONTRADICTION-AS-UNKNOWN?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_argumentation_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TRUE = makeKeyword("TRUE");
  public static final SubLList $list1 = cons(makeSymbol("FIRST-SUPPORT"), makeSymbol("REST-SUPPORTS"));
  public static final SubLSymbol $sym2$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLString $str3$_s_attempted_to_change_its_truth_ = makeString("~s attempted to change its truth from ~s to ~s");
  public static final SubLSymbol $sym4$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $kw5$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $kw6$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw7$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLSymbol $sym8$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym9$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $kw10$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $sym11$ARGUMENT_TV = makeSymbol("ARGUMENT-TV");
  public static final SubLSymbol $kw12$FALSE_MON = makeKeyword("FALSE-MON");
  public static final SubLSymbol $sym13$ASSERTED_ARGUMENT_P = makeSymbol("ASSERTED-ARGUMENT-P");
  public static final SubLSymbol $kw14$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw15$FALSE_DEF = makeKeyword("FALSE-DEF");
  public static final SubLString $str16$Use__unknown = makeString("Use :unknown");
  public static final SubLString $str17$_S_results_in_a_contradiction_ = makeString("~S results in a contradiction.");
  public static final SubLSymbol $kw18$SUPPORTS = makeKeyword("SUPPORTS");
  public static final SubLSymbol $kw19$TV = makeKeyword("TV");
  public static final SubLSymbol $sym20$TMS_DEDUCTION_SPEC_P = makeSymbol("TMS-DEDUCTION-SPEC-P");
  public static final SubLSymbol $sym21$TMS_DEDUCTION_SPEC_TV = makeSymbol("TMS-DEDUCTION-SPEC-TV");

  //// Initializers

  public void declareFunctions() {
    declare_argumentation_file();
  }

  public void initializeVariables() {
    init_argumentation_file();
  }

  public void runTopLevelForms() {
    setup_argumentation_file();
  }

}
