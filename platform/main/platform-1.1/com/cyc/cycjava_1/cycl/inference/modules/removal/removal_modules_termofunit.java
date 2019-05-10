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

package  com.cyc.cycjava_1.cycl.inference.modules.removal;

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
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_lookup;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.unification;
import com.cyc.cycjava_1.cycl.unification_utilities;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_termofunit extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_termofunit() {}
  public static final SubLFile me = new removal_modules_termofunit();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_termofunit";

  //// Definitions

  public static final class $removal_term_of_unit_unify_impossibleP$UnaryFunction extends UnaryFunction {
    public $removal_term_of_unit_unify_impossibleP$UnaryFunction() { super(extractFunctionNamed("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32745"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 4353) 
  private static SubLSymbol $default_skolemize_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 5752) 
  public static final SubLObject skolemization_allowed(SubLObject function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != removal_module_utilities.current_query_allows_new_termsP())
             && (NIL != ((NIL != kb_control_vars.within_forward_inferenceP()) ? ((SubLObject) makeBoolean(((NIL != control_vars.$prefer_forward_skolemization$.getDynamicValue(thread))
                      || (NIL != control_vars.$allow_forward_skolemization$.getDynamicValue(thread))
                      || (NIL != czer_main.forward_inference_reifiable_functionP(function, UNPROVIDED))))) : makeBoolean((NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread)))))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-termofunit.lisp", position = 7548) 
  private static SubLSymbol $default_nat_unify_cost$ = null;

  public static final SubLObject declare_removal_modules_termofunit_file() {
    declareFunction(myName, "nat_lookup_pos_preference", "NAT-LOOKUP-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "make_term_of_unit_support", "MAKE-TERM-OF-UNIT-SUPPORT", 2, 0, false);
    declareFunction(myName, "tou_analog_asentsP", "TOU-ANALOG-ASENTS?", 2, 0, false);
    declareFunction(myName, "tou_sibling_asentsP", "TOU-SIBLING-ASENTS?", 2, 0, false);
    declareFunction(myName, "removal_nat_formula_cost", "REMOVAL-NAT-FORMULA-COST", 1, 1, false);
    declareFunction(myName, "removal_nat_formula_expand", "REMOVAL-NAT-FORMULA-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_term_of_unit_unify_impossibleP", "REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?", 1, 0, false); new $removal_term_of_unit_unify_impossibleP$UnaryFunction();
    declareFunction(myName, "removal_skolemize_create_required", "REMOVAL-SKOLEMIZE-CREATE-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_skolemize_create_expand", "REMOVAL-SKOLEMIZE-CREATE-EXPAND", 1, 1, false);
    declareFunction(myName, "skolemization_allowed", "SKOLEMIZATION-ALLOWED", 1, 0, false);
    declareFunction(myName, "removal_nat_lookup_completeness", "REMOVAL-NAT-LOOKUP-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_nat_lookup_cost", "REMOVAL-NAT-LOOKUP-COST", 1, 1, false);
    declareFunction(myName, "removal_nat_lookup_expand", "REMOVAL-NAT-LOOKUP-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_nat_unify_expand", "REMOVAL-NAT-UNIFY-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_termofunit_file() {
    $default_skolemize_cost$ = defparameter("*DEFAULT-SKOLEMIZE-COST*", ONE_INTEGER);
    $default_nat_unify_cost$ = defparameter("*DEFAULT-NAT-UNIFY-COST*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_termofunit_file() {
    // CVS_ID("Id: removal-modules-termofunit.lisp 127348 2009-03-10 21:59:00Z goolsbey ");
    inference_modules.register_solely_specific_removal_module_predicate($const0$termOfUnit);
    inference_modules.inference_removal_module_use_meta_removal($const0$termOfUnit, $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
    inference_modules.inference_removal_module_use_meta_removal($const0$termOfUnit, $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
    preference_modules.inference_preference_module($kw3$NAT_LOOKUP_POS, $list4);
    utilities_macros.note_funcall_helper_function($sym7$NAT_LOOKUP_POS_PREFERENCE);
    inference_modules.inference_removal_module($kw10$REMOVAL_NAT_FORMULA, $list11);
    inference_modules.inference_removal_module($kw12$REMOVAL_TERM_OF_UNIT_FAIL, $list13);
    inference_modules.inference_removal_module($kw14$REMOVAL_SKOLEMIZE_CREATE, $list15);
    inference_modules.inference_removal_module($kw22$REMOVAL_NAT_LOOKUP, $list23);
    inference_modules.inference_removal_module($kw24$REMOVAL_NAT_UNIFY, $list25);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
  public static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
  public static final SubLSymbol $kw3$NAT_LOOKUP_POS = makeKeyword("NAT-LOOKUP-POS");
  public static final SubLList $list4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NOT-FULLY-BOUND"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("SKOLEMIZATION-ALLOWED"))), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE"), makeSymbol("NAT-LOOKUP-POS-PREFERENCE"));
  public static final SubLSymbol $kw5$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw6$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $sym7$NAT_LOOKUP_POS_PREFERENCE = makeSymbol("NAT-LOOKUP-POS-PREFERENCE");
  public static final SubLSymbol $kw8$EQUALITY = makeKeyword("EQUALITY");
  public static final SubLSymbol $kw9$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw10$REMOVAL_NAT_FORMULA = makeKeyword("REMOVAL-NAT-FORMULA");
  public static final SubLList $list11 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NART"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-FORMULA-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-FORMULA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <reified NAT> <whatever>)\n    using the GAF indexing on <reified NAT>"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))")});
  public static final SubLSymbol $kw12$REMOVAL_TERM_OF_UNIT_FAIL = makeKeyword("REMOVAL-TERM-OF-UNIT-FAIL");
  public static final SubLList $list13 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-ABDUCTION-ALLOWED?"))), list(makeKeyword("OR"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("ATOM")), list(makeKeyword("NOT"), makeKeyword("NART")), list(makeKeyword("NOT"), makeKeyword("VARIABLE"))), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <atom> <whatever>)\n    in all cases where <atom> is not a reified NAT or variable, should immediately fail.\n\n    (#$termOfUnit <arg1> <arg2>)\n    in all cases where ARG1 and ARG2 could not possibly unify, should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit #$Dog (#$JuvenileFn ?WHAT))\n    (#$termOfUnit 1 ?WHAT)\n    (#$termOfUnit (#$IdentityFn #$Dog) (#$JuvenileFn ?WHAT))")});
  public static final SubLSymbol $kw14$REMOVAL_SKOLEMIZE_CREATE = makeKeyword("REMOVAL-SKOLEMIZE-CREATE");
  public static final SubLList $list15 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NOT-FULLY-BOUND"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-SKOLEMIZE-CREATE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SKOLEMIZE-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKOLEMIZE-CREATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <variable> (<fort> . <fully bound>))"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit ?NAT (#$JuvenileFn #$Cougar))")});
  public static final SubLSymbol $kw16$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw17$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw18$NART_ARG = makeKeyword("NART-ARG");
  public static final SubLSymbol $kw19$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw20$FUNCTION_EXTENT = makeKeyword("FUNCTION-EXTENT");
  public static final SubLSymbol $kw21$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw22$REMOVAL_NAT_LOOKUP = makeKeyword("REMOVAL-NAT-LOOKUP");
  public static final SubLList $list23 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NOT-FULLY-BOUND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NAT-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <not fully-bound> (<fort> . <whatever>)) \n    using the function-argument indexing on <fort>"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit ?NAT (#$JuvenileFn ?COL))")});
  public static final SubLSymbol $kw24$REMOVAL_NAT_UNIFY = makeKeyword("REMOVAL-NAT-UNIFY");
  public static final SubLList $list25 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NAT-UNIFY-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit (<fully bound> . <fully bound>) (<whatever . <whatever>))\n    via unification"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_termofunit_file();
  }

  public void initializeVariables() {
    init_removal_modules_termofunit_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_termofunit_file();
  }

}
