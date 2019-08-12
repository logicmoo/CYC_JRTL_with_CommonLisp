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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class wff_utilities extends SubLTranslatedFile {

  //// Constructor

  private wff_utilities() {}
  public static final SubLFile me = new wff_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.wff_utilities";

  //// Definitions

  @SubL(source = "cycl/wff-utilities.lisp", position = 567) 
  public static SubLSymbol $check_wff_constantsP$ = null;

  @SubL(source = "cycl/wff-utilities.lisp", position = 696) 
  public static SubLSymbol $check_wff_semanticsP$ = null;

  @SubL(source = "cycl/wff-utilities.lisp", position = 747) 
  public static SubLSymbol $check_wff_coherenceP$ = null;

  @SubL(source = "cycl/wff-utilities.lisp", position = 800) 
  public static SubLSymbol $check_arg_typesP$ = null;

  @SubL(source = "cycl/wff-utilities.lisp", position = 846) 
  public static SubLSymbol $check_var_typesP$ = null;

  @SubL(source = "cycl/wff-utilities.lisp", position = 892) 
  public static SubLSymbol $check_arityP$ = null;

  /** Whether to use a totally syntactic wff-check if all semantic wff-checking is disabled. */
  @SubL(source = "cycl/wff-utilities.lisp", position = 934) 
  public static SubLSymbol $use_cycl_grammar_if_semantic_checking_disabledP$ = null;

  /** @return BOOLEAN; Should we check literals for assertibility? */
  @SubL(source = "cycl/wff-utilities.lisp", position = 2195) 
  public static final SubLObject check_assertible_literalP() {
    return control_vars.within_assertP();
  }

  @SubL(source = "cycl/wff-utilities.lisp", position = 2331) 
  public static final SubLObject mal_mt_specP(SubLObject mt) {
    return makeBoolean((NIL == valid_mt_specP(mt)));
  }

  @SubL(source = "cycl/wff-utilities.lisp", position = 2594) 
  public static final SubLObject valid_mt_specP(SubLObject mt) {
    return makeBoolean(((NIL != hlmt.hlmtP(mt))
          || ((NIL == mt)
             && (NIL != mt_relevance_macros.all_mts_are_relevantP()))));
  }

  /** @return boolean; t iff OBJECT is a well-formed fort.
   notes a wff violation if OBJECT is an invalid fort. */
  @SubL(source = "cycl/wff-utilities.lisp", position = 2706) 
  public static final SubLObject wf_fort_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != forts.valid_fortP(object))) {
        return T;
      } else if ((NIL == forts.fort_p(object))) {
        return NIL;
      } else if ((NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) {
      	wff.note_wff_violation(list($kw0$MAL_FORT,object));
      }
      return NIL;
    }
  }

  /** @return boolean; t iff OBJECT is an ill-formed fort.
   notes a wff violation if OBJECT is an invalid fort. */
  @SubL(source = "cycl/wff-utilities.lisp", position = 2995) 
  public static final SubLObject non_wf_fort_p(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
           && (NIL == wf_fort_p(object))));
  }

  public static final class $non_wf_fort_p$UnaryFunction extends UnaryFunction {
    public $non_wf_fort_p$UnaryFunction() { super(extractFunctionNamed("NON-WF-FORT-P")); }
    public SubLObject processItem(SubLObject arg1) { return non_wf_fort_p(arg1); }
  }

  /** @return boolean; Returns T iff OBJECT is an invalid el-var. @xref valid-el-var? */
  @SubL(source = "cycl/wff-utilities.lisp", position = 3210) 
  public static final SubLObject non_wf_variable_p(SubLObject object) {
    return makeBoolean(((NIL != cycl_variables.el_varP(object))
           && (NIL == cycl_variables.valid_el_varP(object))));
  }

  public static final class $non_wf_variable_p$UnaryFunction extends UnaryFunction {
    public $non_wf_variable_p$UnaryFunction() { super(extractFunctionNamed("NON-WF-VARIABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return non_wf_variable_p(arg1); }
  }

  /** @return boolean; Return T if SENTENCE has any invalid el-vars. @xref non-wf-variable-p */
  @SubL(source = "cycl/wff-utilities.lisp", position = 3406) 
  public static final SubLObject mal_variablesP(SubLObject sentence) {
    return cycl_utilities.expression_find_if(Symbols.symbol_function($sym1$NON_WF_VARIABLE_P), sentence, UNPROVIDED, UNPROVIDED);
  }

  public static final SubLObject declare_wff_utilities_file() {
    declareFunction(myName, "assertion_not_wffP", "ASSERTION-NOT-WFF?", 1, 0, false);
    declareFunction(myName, "set_dont_check_wff_semantics", "SET-DONT-CHECK-WFF-SEMANTICS", 0, 0, false);
    declareFunction(myName, "set_check_wff_semantics", "SET-CHECK-WFF-SEMANTICS", 0, 0, false);
    declareFunction(myName, "check_assertible_literalP", "CHECK-ASSERTIBLE-LITERAL?", 0, 0, false);
    declareFunction(myName, "mal_mt_specP", "MAL-MT-SPEC?", 1, 0, false);
    declareFunction(myName, "valid_mt_specP", "VALID-MT-SPEC?", 1, 0, false);
    declareFunction(myName, "wf_fort_p", "WF-FORT-P", 1, 0, false);
    declareFunction(myName, "non_wf_fort_p", "NON-WF-FORT-P", 1, 0, false); new $non_wf_fort_p$UnaryFunction();
    declareFunction(myName, "non_wf_variable_p", "NON-WF-VARIABLE-P", 1, 0, false); new $non_wf_variable_p$UnaryFunction();
    declareFunction(myName, "mal_variablesP", "MAL-VARIABLES?", 1, 0, false);
    declareFunction(myName, "mal_variables", "MAL-VARIABLES", 1, 0, false);
    declareFunction(myName, "non_wff_cached_p", "NON-WFF-CACHED-P", 1, 0, false);
    declareFunction(myName, "wff_check_assertion", "WFF-CHECK-ASSERTION", 1, 0, false);
    declareFunction(myName, "wff_check_assertions_via_tl", "WFF-CHECK-ASSERTIONS-VIA-TL", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_wff_utilities_file() {
    $check_wff_constantsP$ = defparameter("*CHECK-WFF-CONSTANTS?*", T);
    $check_wff_semanticsP$ = defparameter("*CHECK-WFF-SEMANTICS?*", T);
    $check_wff_coherenceP$ = defparameter("*CHECK-WFF-COHERENCE?*", NIL);
    $check_arg_typesP$ = defparameter("*CHECK-ARG-TYPES?*", T);
    $check_var_typesP$ = defparameter("*CHECK-VAR-TYPES?*", T);
    $check_arityP$ = defparameter("*CHECK-ARITY?*", T);
    $use_cycl_grammar_if_semantic_checking_disabledP$ = defparameter("*USE-CYCL-GRAMMAR-IF-SEMANTIC-CHECKING-DISABLED?*", T);
    return NIL;
  }

  public static final SubLObject setup_wff_utilities_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$MAL_FORT = makeKeyword("MAL-FORT");
  public static final SubLSymbol $sym1$NON_WF_VARIABLE_P = makeSymbol("NON-WF-VARIABLE-P");
  public static final SubLSymbol $sym2$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym3$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");

  //// Initializers

  public void declareFunctions() {
    declare_wff_utilities_file();
  }

  public void initializeVariables() {
    init_wff_utilities_file();
  }

  public void runTopLevelForms() {
    setup_wff_utilities_file();
  }

}
