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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class verbosifier extends SubLTranslatedFile {

  //// Constructor

  private verbosifier() {}
  public static final SubLFile me = new verbosifier();
  public static final String myName = "com.cyc.cycjava_1.cycl.verbosifier";

  //// Definitions

  /** How much recursion is allowed in EL relations before yielding an error. */
  @SubL(source = "cycl/verbosifier.lisp", position = 990) 
  private static SubLSymbol $el_relation_recursion_limit$ = null;

  /** Dynamically bound when we are accumulating justifications for expansions */
  @SubL(source = "cycl/verbosifier.lisp", position = 4625) 
  private static SubLSymbol $gather_expansion_justificationsP$ = null;

  /** Dynamically accumulates the justification for an expansion */
  @SubL(source = "cycl/verbosifier.lisp", position = 4902) 
  private static SubLSymbol $expansion_justification$ = null;

  /** @return boolean; t iff OBJECT is an EL formula with an #$ELRelation as its arg0. */
  @SubL(source = "cycl/verbosifier.lisp", position = 12631) 
  public static final SubLObject expandible_el_relation_expressionP(SubLObject object, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
           && (NIL != fort_types_interface.isa_el_relationP(cycl_utilities.formula_arg0(object), mt))));
  }

  public static final class $expandible_el_relation_expressionP$UnaryFunction extends UnaryFunction {
    public $expandible_el_relation_expressionP$UnaryFunction() { super(extractFunctionNamed("EXPANDIBLE-EL-RELATION-EXPRESSION?")); }
    public SubLObject processItem(SubLObject arg1) { return expandible_el_relation_expressionP(arg1, UNPROVIDED); }
  }

  public static final class $expandible_el_relation_expressionP$BinaryFunction extends BinaryFunction {
    public $expandible_el_relation_expressionP$BinaryFunction() { super(extractFunctionNamed("EXPANDIBLE-EL-RELATION-EXPRESSION?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return expandible_el_relation_expressionP(arg1, arg2); }
  }

  public static final SubLObject declare_verbosifier_file() {
    //declareFunction(myName, "verbosify_cycl", "VERBOSIFY-CYCL", 1, 2, false);
    //declareFunction(myName, "el_expansion", "EL-EXPANSION", 2, 0, false);
    //declareFunction(myName, "el_expansion_destructive", "EL-EXPANSION-DESTRUCTIVE", 2, 0, false);
    //declareFunction(myName, "el_expansion_one_step", "EL-EXPANSION-ONE-STEP", 2, 0, false);
    //declareFunction(myName, "el_expansion_one_step_destructive", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE", 2, 0, false);
    //declareFunction(myName, "el_expand_all", "EL-EXPAND-ALL", 2, 0, false);
    //declareFunction(myName, "el_expand_all_destructive", "EL-EXPAND-ALL-DESTRUCTIVE", 2, 0, false);
    //declareFunction(myName, "el_expandible_subformulaP", "EL-EXPANDIBLE-SUBFORMULA?", 1, 1, false);
    //declareFunction(myName, "gathering_expansion_justificationsP", "GATHERING-EXPANSION-JUSTIFICATIONS?", 0, 0, false);
    //declareFunction(myName, "possibly_note_expansion_justification_support", "POSSIBLY-NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false);
    //declareFunction(myName, "note_expansion_justification_support", "NOTE-EXPANSION-JUSTIFICATION-SUPPORT", 1, 0, false);
    //declareFunction(myName, "expansion_justification", "EXPANSION-JUSTIFICATION", 0, 0, false);
    //declareMacro(myName, "gathering_expansion_justifications", "GATHERING-EXPANSION-JUSTIFICATIONS");
    //declareFunction(myName, "verbosify_cycl_justified", "VERBOSIFY-CYCL-JUSTIFIED", 1, 2, false);
    //declareFunction(myName, "el_expansion_justified", "EL-EXPANSION-JUSTIFIED", 2, 0, false);
    //declareFunction(myName, "el_expansion_destructive_justified", "EL-EXPANSION-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
    //declareFunction(myName, "el_expansion_one_step_justified", "EL-EXPANSION-ONE-STEP-JUSTIFIED", 2, 0, false);
    //declareFunction(myName, "el_expansion_one_step_destructive_justified", "EL-EXPANSION-ONE-STEP-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
    //declareFunction(myName, "el_expand_all_justified", "EL-EXPAND-ALL-JUSTIFIED", 2, 0, false);
    //declareFunction(myName, "el_expand_all_destructive_justified", "EL-EXPAND-ALL-DESTRUCTIVE-JUSTIFIED", 2, 0, false);
    //declareFunction(myName, "el_relations_out", "EL-RELATIONS-OUT", 2, 2, false);
    declareFunction(myName, "expandible_el_relation_expressionP", "EXPANDIBLE-EL-RELATION-EXPRESSION?", 1, 1, false); new $expandible_el_relation_expressionP$UnaryFunction(); new $expandible_el_relation_expressionP$BinaryFunction();
    //declareFunction(myName, "el_expandible_formulaP", "EL-EXPANDIBLE-FORMULA?", 1, 0, false);
    //declareFunction(myName, "el_viably_expandible_formulaP", "EL-VIABLY-EXPANDIBLE-FORMULA?", 1, 0, false);
    //declareFunction(myName, "el_expandible_relationP", "EL-EXPANDIBLE-RELATION?", 1, 0, false);
    //declareFunction(myName, "el_expandible_relation_expressionP", "EL-EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "expandible_relation_expressionP", "EXPANDIBLE-RELATION-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "el_viable_relation_expressionP", "EL-VIABLE-RELATION-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "el_expansionP", "EL-EXPANSION?", 1, 0, false);
    //declareFunction(myName, "el_expansion_int", "EL-EXPANSION-INT", 2, 0, false);
    //declareFunction(myName, "el_formula_expansion_int", "EL-FORMULA-EXPANSION-INT", 1, 0, false);
    //declareFunction(myName, "el_expansion_recursive", "EL-EXPANSION-RECURSIVE", 4, 0, false);
    //declareFunction(myName, "has_viable_expansionP", "HAS-VIABLE-EXPANSION?", 1, 0, false);
    //declareFunction(myName, "has_viable_defnP", "HAS-VIABLE-DEFN?", 1, 0, false);
    //declareFunction(myName, "el_uniquify_wrt", "EL-UNIQUIFY-WRT", 2, 0, false);
    //declareFunction(myName, "el_uniquify_formula_vars_wrt", "EL-UNIQUIFY-FORMULA-VARS-WRT", 2, 0, false);
    //declareFunction(myName, "el_nuniquify_formula_vars_wrt", "EL-NUNIQUIFY-FORMULA-VARS-WRT", 2, 0, false);
    //declareFunction(myName, "el_uniquify_formula_vars_wrt_int", "EL-UNIQUIFY-FORMULA-VARS-WRT-INT", 3, 0, false);
    //declareFunction(myName, "expansion_nautP", "EXPANSION-NAUT?", 1, 1, false);
    //declareFunction(myName, "arg0_of_any_expansionP", "ARG0-OF-ANY-EXPANSION?", 1, 0, false);
    //declareFunction(myName, "expansion_arg2_arg0_p", "EXPANSION-ARG2-ARG0-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_verbosifier_file() {
    $el_relation_recursion_limit$ = defparameter("*EL-RELATION-RECURSION-LIMIT*", $int0$212);
    $gather_expansion_justificationsP$ = defparameter("*GATHER-EXPANSION-JUSTIFICATIONS?*", NIL);
    $expansion_justification$ = defparameter("*EXPANSION-JUSTIFICATION*", NIL);
    return NIL;
  }

  public static final SubLObject setup_verbosifier_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$212 = makeInteger(212);
  public static final SubLSymbol $kw1$TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
  public static final SubLSymbol $sym2$EL_VIABLY_EXPANDIBLE_FORMULA_ = makeSymbol("EL-VIABLY-EXPANDIBLE-FORMULA?");
  public static final SubLSymbol $sym3$EL_FORMULA_EXPANSION_INT = makeSymbol("EL-FORMULA-EXPANSION-INT");
  public static final SubLSymbol $kw4$RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");
  public static final SubLSymbol $sym5$EXPANDIBLE_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-RELATION-EXPRESSION?");
  public static final SubLSymbol $sym6$CLET = makeSymbol("CLET");
  public static final SubLList $list7 = list(list(makeSymbol("*GATHER-EXPANSION-JUSTIFICATIONS?*"), T), list(makeSymbol("*EXPANSION-JUSTIFICATION*"), NIL));
  public static final SubLSymbol $sym8$EXPANDIBLE_EL_RELATION_EXPRESSION_ = makeSymbol("EXPANDIBLE-EL-RELATION-EXPRESSION?");
  public static final SubLSymbol $kw9$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw10$INVALID_EXPANSION = makeKeyword("INVALID-EXPANSION");
  public static final SubLObject $const11$expansion = constant_handles.reader_make_constant_shell(makeString("expansion"));
  public static final SubLObject $const12$expansionDefn = constant_handles.reader_make_constant_shell(makeString("expansionDefn"));
  public static final SubLString $str13$Trying_to_expand_a_recursive_EL_r = makeString("Trying to expand a recursive EL relation, hit the recursion limit ~D while expanding ~A~%");
  public static final SubLSymbol $sym14$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym15$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym16$GENERIC_ARG_P = makeSymbol("GENERIC-ARG-P");
  public static final SubLSymbol $sym17$GENERIC_ARG_NUM = makeSymbol("GENERIC-ARG-NUM");
  public static final SubLSymbol $sym18$MAX = makeSymbol("MAX");
  public static final SubLSymbol $sym19$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym20$EXPANSION_ARG2_ARG0_P = makeSymbol("EXPANSION-ARG2-ARG0-P");
  public static final SubLSymbol $kw21$TRUE = makeKeyword("TRUE");

  //// Initializers

  public void declareFunctions() {
    declare_verbosifier_file();
  }

  public void initializeVariables() {
    init_verbosifier_file();
  }

  public void runTopLevelForms() {
    setup_verbosifier_file();
  }

}
