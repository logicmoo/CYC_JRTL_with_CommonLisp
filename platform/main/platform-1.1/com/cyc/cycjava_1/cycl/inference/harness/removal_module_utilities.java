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

package  com.cyc.cycjava_1.cycl.inference.harness;

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
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.evaluation_defns;
import com.cyc.cycjava_1.cycl.inference.modules.forward_modules;
import com.cyc.cycjava_1.cycl.hl_storage_modules;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.system_info;
import com.cyc.cycjava_1.cycl.variables;

public  final class removal_module_utilities extends SubLTranslatedFile {

  //// Constructor

  private removal_module_utilities() {}
  public static final SubLFile me = new removal_module_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities";

  //// Definitions

  /** Return a singleton answer list with ANSWER as the sole item. */
  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1259) 
  public static final SubLObject answer_to_singleton(SubLObject answer) {
    return list(answer);
  }

  /** If ANSWER is non-nil, return a singleton answer list with ANSWER as the sole item.
   Otherwise, return an empty answer list. */
  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1524) 
  public static final SubLObject non_null_answer_to_singleton(SubLObject answer) {
    return ((NIL != answer) ? ((SubLObject) answer_to_singleton(answer)) : NIL);
  }

  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 1886) 
  public static final SubLObject additional_isa_support(SubLObject object, SubLObject collection) {
    {
      SubLObject hl_formula = list($const0$isa, object, collection);
      SubLObject hl_support = arguments.make_hl_support($kw1$ISA, hl_formula, UNPROVIDED, UNPROVIDED);
      return hl_support;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2174) 
  public static final SubLObject additional_isa_supports(SubLObject object, SubLObject collection) {
    return list(additional_isa_support(object, collection));
  }

  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 2681) 
  public static final SubLObject make_genl_preds_support(SubLObject spec_pred, SubLObject genl_pred) {
    {
      SubLObject hl_formula = list($const4$genlPreds, spec_pred, genl_pred);
      SubLObject hl_support = arguments.make_hl_support($kw3$GENLPREDS, hl_formula, UNPROVIDED, UNPROVIDED);
      return hl_support;
    }
  }

  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 6910) 
  public static final SubLObject current_query_allows_new_termsP() {
    {
      SubLObject store = inference_worker.currently_active_problem_store();
      if ((NIL != store)) {
        return inference_datastructures_problem_store.problem_store_new_terms_allowedP(store);
      } else {
        return inference_trivial.current_query_property_lookup($kw27$NEW_TERMS_ALLOWED_);
      }
    }
  }

  /** Modules which require :negation-by-failure? parameter to generate a minimize support */
  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 7164) 
  private static SubLSymbol $modules_require_negation_by_failure$ = null;

  /** Modules which require :completness-minization-allowed? parameter to generate the support listed. */
  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 8948) 
  private static SubLSymbol $completeness_minimization_required_modules$ = null;

  /** Modules which require :new-terms-allowed? parameter. */
  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 9665) 
  private static SubLSymbol $new_terms_allowed_required_modules$ = null;

  /** Removal modules that require :evaluate-subl-allowed? to be t to function */
  @SubL(source = "cycl/inference/harness/removal-module-utilities.lisp", position = 10608) 
  private static SubLSymbol $evaluate_subl_required_modules$ = null;

  public static final SubLObject declare_removal_module_utilities_file() {
    declareFunction(myName, "negation_grossly_incompleteP", "NEGATION-GROSSLY-INCOMPLETE?", 2, 0, false);
    declareFunction(myName, "invert_removal_check_cost", "INVERT-REMOVAL-CHECK-COST", 1, 0, false);
    declareFunction(myName, "answer_to_singleton", "ANSWER-TO-SINGLETON", 1, 0, false);
    declareFunction(myName, "non_null_answer_to_singleton", "NON-NULL-ANSWER-TO-SINGLETON", 1, 0, false);
    declareFunction(myName, "invert_boolean_answer", "INVERT-BOOLEAN-ANSWER", 1, 0, false);
    declareFunction(myName, "additional_isa_support", "ADDITIONAL-ISA-SUPPORT", 2, 0, false);
    declareFunction(myName, "additional_isa_supports", "ADDITIONAL-ISA-SUPPORTS", 2, 0, false);
    declareFunction(myName, "make_genl_inverse_support", "MAKE-GENL-INVERSE-SUPPORT", 2, 0, false);
    declareFunction(myName, "additional_genl_inverse_supports", "ADDITIONAL-GENL-INVERSE-SUPPORTS", 2, 0, false);
    declareFunction(myName, "make_genl_preds_support", "MAKE-GENL-PREDS-SUPPORT", 2, 0, false);
    declareFunction(myName, "additional_genl_preds_supports", "ADDITIONAL-GENL-PREDS-SUPPORTS", 2, 0, false);
    declareFunction(myName, "make_simplification_support", "MAKE-SIMPLIFICATION-SUPPORT", 0, 0, false);
    declareFunction(myName, "hl_module_count", "HL-MODULE-COUNT", 0, 0, false);
    declareFunction(myName, "hl_module_statistics", "HL-MODULE-STATISTICS", 0, 1, false);
    declareFunction(myName, "determine_hl_module_name", "DETERMINE-HL-MODULE-NAME", 2, 0, false);
    declareFunction(myName, "make_removal_module_name", "MAKE-REMOVAL-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "current_query_allows_new_termsP", "CURRENT-QUERY-ALLOWS-NEW-TERMS?", 0, 0, false);
    declareFunction(myName, "module_requires_negation_by_failureP", "MODULE-REQUIRES-NEGATION-BY-FAILURE?", 1, 0, false);
    declareFunction(myName, "module_requires_completeness_minimization_for_supportP", "MODULE-REQUIRES-COMPLETENESS-MINIMIZATION-FOR-SUPPORT?", 2, 0, false);
    declareFunction(myName, "module_requires_new_terms_allowedP", "MODULE-REQUIRES-NEW-TERMS-ALLOWED?", 1, 0, false);
    declareFunction(myName, "module_requires_evaluate_sublP", "MODULE-REQUIRES-EVALUATE-SUBL?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_module_utilities_file() {
    $modules_require_negation_by_failure$ = deflexical("*MODULES-REQUIRE-NEGATION-BY-FAILURE*", $list28);
    $completeness_minimization_required_modules$ = deflexical("*COMPLETENESS-MINIMIZATION-REQUIRED-MODULES*", $list29);
    $new_terms_allowed_required_modules$ = deflexical("*NEW-TERMS-ALLOWED-REQUIRED-MODULES*", $list31);
    $evaluate_subl_required_modules$ = deflexical("*EVALUATE-SUBL-REQUIRED-MODULES*", $list32);
    return NIL;
  }

  public static final SubLObject setup_removal_module_utilities_file() {
    // CVS_ID("Id: removal-module-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw1$ISA = makeKeyword("ISA");
  public static final SubLObject $const2$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $kw3$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLObject $const4$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw5$CODE = makeKeyword("CODE");
  public static final SubLList $list6 = list(constant_handles.reader_make_constant_shell(makeString("equals")), makeSymbol("?X"), makeSymbol("?X"));
  public static final SubLSymbol $kw7$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLString $str8$______System__a_HL_module_statist = makeString("~%;;; System ~a HL module statistics");
  public static final SubLString $str9$__HL_Modules_____________________ = makeString("~%HL Modules                   : ~6,' D");
  public static final SubLString $str10$___Removal_Modules_______________ = makeString("~% Removal Modules             : ~6,' D");
  public static final SubLString $str11$___Meta_Removal_Modules__________ = makeString("~% Meta-Removal Modules        : ~6,' D");
  public static final SubLString $str12$___Conjunctive_Removal_Modules___ = makeString("~% Conjunctive Removal Modules : ~6,' D");
  public static final SubLString $str13$___Transformation_Modules________ = makeString("~% Transformation Modules      : ~6,' D");
  public static final SubLString $str14$___Meta_Transformation_Modules___ = makeString("~% Meta-Transformation Modules : ~6,' D");
  public static final SubLString $str15$___Structural_Modules____________ = makeString("~% Structural Modules          : ~6,' D");
  public static final SubLString $str16$___Meta_Structural_Modules_______ = makeString("~% Meta-Structural Modules     : ~6,' D");
  public static final SubLString $str17$___Forward_Modules_______________ = makeString("~% Forward Modules             : ~6,' D");
  public static final SubLString $str18$___Storage_Modules_______________ = makeString("~% Storage Modules             : ~6,' D");
  public static final SubLString $str19$___Evaluatable_Predicates________ = makeString("~% Evaluatable Predicates      : ~6,' D");
  public static final SubLString $str20$___Evaluatable_Functions_________ = makeString("~% Evaluatable Functions       : ~6,' D");
  public static final SubLList $list21 = list(Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_less, Characters.CHAR_greater, makeString("#$"));
  public static final SubLSymbol $sym22$EMPTY_STRING_P = makeSymbol("EMPTY-STRING-P");
  public static final SubLSymbol $kw23$POS = makeKeyword("POS");
  public static final SubLString $str24$pos = makeString("pos");
  public static final SubLSymbol $kw25$NEG = makeKeyword("NEG");
  public static final SubLString $str26$neg = makeString("neg");
  public static final SubLSymbol $kw27$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
  public static final SubLList $list28 = list(new SubLObject[] {makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED"), makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK"), makeKeyword("REMOVAL-NOT-GENLINVERSE-CHECK"), makeKeyword("REMOVAL-NOT-GENLMT-CHECK"), makeKeyword("REMOVAL-NOT-GENLPREDS-CHECK"), makeKeyword("REMOVAL-NOT-SUPERSET"), makeKeyword("REMOVAL-MINIMIZE-EXTENT"), makeKeyword("REMOVAL-NOT-NEGATIONINVERSE-CHECK"), makeKeyword("REMOVAL-NOT-NEGATIONPREDS-CHECK"), makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF"), makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF"), makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF"), makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF"), makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES"), makeKeyword("REMOVAL-NOT-DATE-OF-EVENT"), makeKeyword("REMOVAL-NOT-COTEMPORAL"), makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS"), makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT"), makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL"), makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING"), makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL"), makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER"), makeKeyword("REMOVAL-NOT-STARTS-DURING"), makeKeyword("REMOVAL-NOT-ENDS-DURING"), makeKeyword("REMOVAL-NOT-STARTING-DATE"), makeKeyword("REMOVAL-NOT-ENDING-DATE"), makeKeyword("REMOVAL-NOT-BIRTH-DATE"), makeKeyword("REMOVAL-NOT-DATE-OF-DEATH"), makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY"), makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY"), makeKeyword("REMOVAL-NOT-OVERLAPS-START")});
  public static final SubLList $list29 = list(cons(makeKeyword("REMOVAL-NOT-ISA-COLLECTION-CHECK"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-ISA-DEFN-REJECT"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-QUOTED-ISA-DEFN-REJECT"), makeKeyword("ISA")), cons(makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), makeKeyword("MINIMIZE")));
  public static final SubLList $list30 = cons(makeSymbol("MODULE"), makeSymbol("SUPPORT"));
  public static final SubLList $list31 = list(new SubLObject[] {makeKeyword("REMOVAL-SKOLEMIZE-CREATE"), makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY"), makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1"), makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1"), makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2")});
  public static final SubLList $list32 = list(makeKeyword("REMOVAL-PERFORM-SUBL-POS"), makeKeyword("REMOVAL-PERFORM-SUBL-NEG"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_module_utilities_file();
  }

  public void initializeVariables() {
    init_removal_module_utilities_file();
  }

  public void runTopLevelForms() {
    setup_removal_module_utilities_file();
  }

}
