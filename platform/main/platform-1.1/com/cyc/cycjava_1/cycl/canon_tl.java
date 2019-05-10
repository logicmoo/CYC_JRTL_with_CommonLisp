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
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.encapsulation;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.skolems;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class canon_tl extends SubLTranslatedFile {

  //// Constructor

  private canon_tl() {}
  public static final SubLFile me = new canon_tl();
  public static final String myName = "com.cyc.cycjava_1.cycl.canon_tl";

  //// Definitions

  /** el var names of current assertion being translated to TL */
  @SubL(source = "cycl/canon-tl.lisp", position = 5758) 
  private static SubLSymbol $el_var_names$ = null;

  @SubL(source = "cycl/canon-tl.lisp", position = 6191) 
  public static final SubLObject transform_hl_terms_to_tl(SubLObject tree) {
    return transform_list_utilities.quiescent_transform(tree, $sym3$HL_NOT_TL_TERM_, $sym4$HL_TERM_TO_TL, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 6310) 
  public static final SubLObject tl_encapsulate(SubLObject tree) {
    return encapsulation.encapsulate(transform_hl_terms_to_tl(tree));
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 8590) 
  public static final SubLObject tlmt_to_hlmt(SubLObject tl_mt) {
    return transform_tl_terms_to_hl(tl_mt);
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 8672) 
  public static final SubLObject transform_tl_terms_to_hl(SubLObject tree) {
    return transform_list_utilities.quiescent_transform(tree, $sym6$TL_TERM_, $sym7$TL_TERM_TO_HL, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 9525) 
  public static final SubLObject tl_termP(SubLObject object) {
    return makeBoolean(((NIL != tl_assertion_termP(object))
          || (NIL != tl_function_termP(object))
          || (NIL != tl_varP(object))));
  }

  public static final class $tl_termP$UnaryFunction extends UnaryFunction {
    public $tl_termP$UnaryFunction() { super(extractFunctionNamed("TL-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return tl_termP(arg1); }
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 9902) 
  public static final SubLObject tl_assertion_termP(SubLObject object) {
    if (((NIL != el_utilities.possibly_naut_p(object))
         && $const11$TLAssertionFn.eql(cycl_utilities.naut_functor(object))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30519")))) {
      {
        SubLObject arg1 = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29817");
        SubLObject arg2 = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29820");
        return makeBoolean(((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30626"))
               && (NIL != el_utilities.el_formula_p(arg2))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 10332) 
  public static final SubLObject tl_function_termP(SubLObject object) {
    if (((NIL != el_utilities.possibly_naut_p(object))
         && $const12$TLReifiedNatFn.eql(cycl_utilities.naut_functor(object))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30520")))) {
      {
        SubLObject arg1 = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29818");
        return el_utilities.possibly_naut_p(arg1);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 10652) 
  public static final SubLObject tl_varP(SubLObject object) {
    if (((NIL != el_utilities.possibly_naut_p(object))
         && $const13$TLVariableFn.eql(cycl_utilities.naut_functor(object))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30521")))) {
      {
        SubLObject arg1 = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29819");
        SubLObject arg2 = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29821");
        return makeBoolean((arg1.isInteger()
               && (arg2.isString()
                || (NIL == arg2))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/canon-tl.lisp", position = 11075) 
  public static final SubLObject hl_not_tl_termP(SubLObject object) {
    return makeBoolean(((NIL != assertion_handles.assertion_p(object))
          || (NIL != nart_handles.nart_p(object))
          || (NIL != variables.variable_p(object))));
  }

  public static final SubLObject declare_canon_tl_file() {
    //declareFunction(myName, "assertion_tl_formula", "ASSERTION-TL-FORMULA", 1, 0, false);
    //declareFunction(myName, "assertion_tl_ist_formula", "ASSERTION-TL-IST-FORMULA", 1, 0, false);
    //declareFunction(myName, "convert_assertions_to_tl_ist_formulas", "CONVERT-ASSERTIONS-TO-TL-IST-FORMULAS", 1, 0, false);
    //declareFunction(myName, "assertion_tl_formulas", "ASSERTION-TL-FORMULAS", 1, 0, false);
    //declareFunction(myName, "assertion_tl_ist_formulas", "ASSERTION-TL-IST-FORMULAS", 1, 0, false);
    //declareFunction(myName, "sibling_tl_assertions", "SIBLING-TL-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "assertion_tl_ist_formula_int", "ASSERTION-TL-IST-FORMULA-INT", 1, 0, false);
    //declareFunction(myName, "assertion_tl_formula_int", "ASSERTION-TL-FORMULA-INT", 1, 0, false);
    //declareFunction(myName, "assertion_tl_cnf", "ASSERTION-TL-CNF", 1, 0, false);
    declareFunction(myName, "transform_hl_terms_to_tl", "TRANSFORM-HL-TERMS-TO-TL", 1, 0, false);
    declareFunction(myName, "tl_encapsulate", "TL-ENCAPSULATE", 1, 0, false);
    //declareFunction(myName, "find_assertion_from_tl_formula", "FIND-ASSERTION-FROM-TL-FORMULA", 2, 0, false);
    //declareFunction(myName, "find_assertions_from_tl_formula", "FIND-ASSERTIONS-FROM-TL-FORMULA", 2, 0, false);
    //declareFunction(myName, "find_assertion_from_tl_cnf_ist_formula", "FIND-ASSERTION-FROM-TL-CNF-IST-FORMULA", 1, 0, false);
    //declareFunction(myName, "find_assertion_from_tl_cnf_formula", "FIND-ASSERTION-FROM-TL-CNF-FORMULA", 2, 0, false);
    //declareFunction(myName, "tl_formula_to_hl_cnf", "TL-FORMULA-TO-HL-CNF", 1, 0, false);
    declareFunction(myName, "tlmt_to_hlmt", "TLMT-TO-HLMT", 1, 0, false);
    declareFunction(myName, "transform_tl_terms_to_hl", "TRANSFORM-TL-TERMS-TO-HL", 1, 0, false);
    //declareFunction(myName, "tl_formula_to_cnf_int", "TL-FORMULA-TO-CNF-INT", 1, 0, false);
    declareFunction(myName, "tl_termP", "TL-TERM?", 1, 0, false); new $tl_termP$UnaryFunction();
    declareFunction(myName, "tl_assertion_termP", "TL-ASSERTION-TERM?", 1, 0, false);
    declareFunction(myName, "tl_function_termP", "TL-FUNCTION-TERM?", 1, 0, false);
    declareFunction(myName, "tl_varP", "TL-VAR?", 1, 0, false);
    declareFunction(myName, "hl_not_tl_termP", "HL-NOT-TL-TERM?", 1, 0, false);
    //declareFunction(myName, "hl_term_to_tl", "HL-TERM-TO-TL", 1, 0, false);
    //declareFunction(myName, "hl_assertion_term_to_tl", "HL-ASSERTION-TERM-TO-TL", 1, 0, false);
    //declareFunction(myName, "hl_function_term_to_tl", "HL-FUNCTION-TERM-TO-TL", 1, 0, false);
    //declareFunction(myName, "hl_var_to_tl", "HL-VAR-TO-TL", 1, 1, false);
    //declareFunction(myName, "tl_quotify", "TL-QUOTIFY", 1, 0, false);
    //declareFunction(myName, "tl_term_to_hl", "TL-TERM-TO-HL", 1, 0, false);
    //declareFunction(myName, "tl_assertion_term_to_hl", "TL-ASSERTION-TERM-TO-HL", 1, 0, false);
    //declareFunction(myName, "tl_function_term_to_hl", "TL-FUNCTION-TERM-TO-HL", 1, 0, false);
    //declareFunction(myName, "tl_var_to_hl", "TL-VAR-TO-HL", 1, 0, false);
    //declareFunction(myName, "tl_term_to_el", "TL-TERM-TO-EL", 1, 0, false);
    //declareFunction(myName, "tl_assertion_term_to_el", "TL-ASSERTION-TERM-TO-EL", 1, 0, false);
    //declareFunction(myName, "tl_function_term_to_el", "TL-FUNCTION-TERM-TO-EL", 1, 0, false);
    //declareFunction(myName, "tl_var_to_el", "TL-VAR-TO-EL", 1, 0, false);
    //declareFunction(myName, "tl_find_nart", "TL-FIND-NART", 1, 0, false);
    //declareFunction(myName, "tl_nart_substitute", "TL-NART-SUBSTITUTE", 1, 0, false);
    //declareFunction(myName, "assertion_findable_via_tlP", "ASSERTION-FINDABLE-VIA-TL?", 1, 0, false);
    //declareFunction(myName, "assertion_unassertible_via_tlP", "ASSERTION-UNASSERTIBLE-VIA-TL?", 1, 0, false);
    //declareFunction(myName, "assertion_unassertible_via_tl_fastP", "ASSERTION-UNASSERTIBLE-VIA-TL-FAST?", 1, 0, false);
    //declareFunction(myName, "duplicate_assertionP", "DUPLICATE-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "unassert_assertion_via_tl", "UNASSERT-ASSERTION-VIA-TL", 1, 0, false);
    //declareFunction(myName, "unassert_tl_formula", "UNASSERT-TL-FORMULA", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_canon_tl_file() {
    $el_var_names$ = defparameter("*EL-VAR-NAMES*", NIL);
    return NIL;
  }

  public static final SubLObject setup_canon_tl_file() {
    // CVS_ID("Id: canon-tl.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_kb_function($sym19$TL_ASSERTION_TERM_TO_EL);
    utilities_macros.register_kb_function($sym20$TL_FUNCTION_TERM_TO_EL);
    utilities_macros.register_kb_function($sym21$TL_VAR_TO_EL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym1$ASSERTION_TL_IST_FORMULA = makeSymbol("ASSERTION-TL-IST-FORMULA");
  public static final SubLObject $const2$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym3$HL_NOT_TL_TERM_ = makeSymbol("HL-NOT-TL-TERM?");
  public static final SubLSymbol $sym4$HL_TERM_TO_TL = makeSymbol("HL-TERM-TO-TL");
  public static final SubLObject $const5$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $sym6$TL_TERM_ = makeSymbol("TL-TERM?");
  public static final SubLSymbol $sym7$TL_TERM_TO_HL = makeSymbol("TL-TERM-TO-HL");
  public static final SubLObject $const8$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLObject $const9$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLObject $const10$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLObject $const11$TLAssertionFn = constant_handles.reader_make_constant_shell(makeString("TLAssertionFn"));
  public static final SubLObject $const12$TLReifiedNatFn = constant_handles.reader_make_constant_shell(makeString("TLReifiedNatFn"));
  public static final SubLObject $const13$TLVariableFn = constant_handles.reader_make_constant_shell(makeString("TLVariableFn"));
  public static final SubLString $str14$referenced_assertion_not_found___ = makeString("referenced assertion not found: ~%  ~s");
  public static final SubLString $str15$referenced_function_not_found____ = makeString("referenced function not found: ~%  ~s");
  public static final SubLSymbol $sym16$QUOTE = makeSymbol("QUOTE");
  public static final SubLString $str17$referenced_TL_assertion_not_found = makeString("referenced TL assertion not found: ~%  ~s");
  public static final SubLString $str18$referenced_TL_nart_not_found_____ = makeString("referenced TL nart not found: ~%  ~s");
  public static final SubLSymbol $sym19$TL_ASSERTION_TERM_TO_EL = makeSymbol("TL-ASSERTION-TERM-TO-EL");
  public static final SubLSymbol $sym20$TL_FUNCTION_TERM_TO_EL = makeSymbol("TL-FUNCTION-TERM-TO-EL");
  public static final SubLSymbol $sym21$TL_VAR_TO_EL = makeSymbol("TL-VAR-TO-EL");
  public static final SubLSymbol $sym22$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym23$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw24$ASSERTION_NOT_PRESENT = makeKeyword("ASSERTION-NOT-PRESENT");
  public static final SubLString $str25$formula__S_in_mt__S_cannot_be_fou = makeString("formula ~S in mt ~S cannot be found");
  public static final SubLSymbol $kw26$ASSERTION_NOT_LOCAL = makeKeyword("ASSERTION-NOT-LOCAL");
  public static final SubLString $str27$CNF__S_in_mt__S_is_not_locally_in = makeString("CNF ~S in mt ~S is not locally in the KB");

  //// Initializers

  public void declareFunctions() {
    declare_canon_tl_file();
  }

  public void initializeVariables() {
    init_canon_tl_file();
  }

  public void runTopLevelForms() {
    setup_canon_tl_file();
  }

}
