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

package com.cyc.cycjava_1.cycl.inference.modules.removal;
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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class removal_modules_abduction extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_abduction() {}
  public static final SubLFile me = new removal_modules_abduction();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_abduction";

  //// Definitions

  /** The exhaustive list all abductive removal modules. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 1022) 
  private static SubLSymbol $abductive_removal_modules$ = null;

  /** The id uniqueifer for abduced terms. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 1904) 
  public static SubLSymbol $abduction_term_isg$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 2744) 
  public static SubLSymbol $abduce_subcollection_denoting_termsP$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 7726) 
  public static final SubLObject removal_abduction_required(SubLObject asent, SubLObject sense) {
    return removal_abduction_allowedP(asent, sense);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 7985) 
  public static final SubLObject removal_abduction_allowedP(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = $kw14$POS;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject problem_store = inference_worker.currently_active_problem_store();
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        return makeBoolean(((NIL != problem_store)
               && (NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(problem_store))
               && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33026"))));
      }
    }
  }

  public static final class $removal_abduction_allowedP$UnaryFunction extends UnaryFunction {
    public $removal_abduction_allowedP$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ABDUCTION-ALLOWED?")); }
    public SubLObject processItem(SubLObject arg1) { return removal_abduction_allowedP(arg1, UNPROVIDED); }
  }

  public static final class $removal_abduction_allowedP$BinaryFunction extends BinaryFunction {
    public $removal_abduction_allowedP$BinaryFunction() { super(extractFunctionNamed("REMOVAL-ABDUCTION-ALLOWED?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_abduction_allowedP(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 8396) 
  private static SubLSymbol $default_abduction_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-abduction.lisp", position = 8885) 
  public static final SubLObject removal_abduction_pos_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_abduction_required(asent, sense);
  }

  public static final SubLObject declare_removal_modules_abduction_file() {
    declareFunction(myName, "abductive_removal_modules", "ABDUCTIVE-REMOVAL-MODULES", 0, 0, false);
    declareFunction(myName, "abductive_removal_moduleP", "ABDUCTIVE-REMOVAL-MODULE?", 1, 0, false);
    declareFunction(myName, "abductive_modules_not_allowed_spec", "ABDUCTIVE-MODULES-NOT-ALLOWED-SPEC", 0, 0, false);
    declareFunction(myName, "problem_store_next_abduced_term_id", "PROBLEM-STORE-NEXT-ABDUCED-TERM-ID", 1, 0, false);
    declareFunction(myName, "abducing_completely_enumerable_instancesP", "ABDUCING-COMPLETELY-ENUMERABLE-INSTANCES?", 2, 0, false);
    declareFunction(myName, "candidate_abductive_binding_sets", "CANDIDATE-ABDUCTIVE-BINDING-SETS", 3, 0, false);
    declareFunction(myName, "abduced_collection_for_constraints", "ABDUCED-COLLECTION-FOR-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "abduced_individual_for_constraints", "ABDUCED-INDIVIDUAL-FOR-CONSTRAINTS", 2, 0, false);
    declareFunction(myName, "abduced_term_for_constraints", "ABDUCED-TERM-FOR-CONSTRAINTS", 4, 0, false);
    declareFunction(myName, "abduced_type_from_constraints", "ABDUCED-TYPE-FROM-CONSTRAINTS", 1, 0, false);
    declareFunction(myName, "abductive_asent_var_arg_constraints", "ABDUCTIVE-ASENT-VAR-ARG-CONSTRAINTS", 2, 0, false);
    declareFunction(myName, "removal_abduction_required", "REMOVAL-ABDUCTION-REQUIRED", 2, 0, false);
    declareFunction(myName, "removal_abduction_allowedP", "REMOVAL-ABDUCTION-ALLOWED?", 1, 1, false); new $removal_abduction_allowedP$UnaryFunction(); new $removal_abduction_allowedP$BinaryFunction();
    declareFunction(myName, "removal_abduction_check_sentence", "REMOVAL-ABDUCTION-CHECK-SENTENCE", 3, 0, false);
    declareFunction(myName, "make_abduction_support", "MAKE-ABDUCTION-SUPPORT", 1, 2, false);
    declareFunction(myName, "removal_abduction_pos_required", "REMOVAL-ABDUCTION-POS-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_abduction_pos_check_expand", "REMOVAL-ABDUCTION-POS-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_abduction_unify_sentence", "REMOVAL-ABDUCTION-UNIFY-SENTENCE", 4, 0, false);
    declareFunction(myName, "removal_abduction_pos_unify_expand", "REMOVAL-ABDUCTION-POS-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_abduction_exclusiveP", "REMOVAL-ABDUCTION-EXCLUSIVE?", 1, 1, false);
    declareFunction(myName, "removal_exclusive_abduction_pos_expand", "REMOVAL-EXCLUSIVE-ABDUCTION-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_abduction_neg_required", "REMOVAL-ABDUCTION-NEG-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_abduction_neg_check_expand", "REMOVAL-ABDUCTION-NEG-CHECK-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_abduction_file() {
    $abductive_removal_modules$ = deflexical("*ABDUCTIVE-REMOVAL-MODULES*", $list0);
    $abduction_term_isg$ = deflexical("*ABDUCTION-TERM-ISG*", maybeDefault( $sym3$_ABDUCTION_TERM_ISG_, $abduction_term_isg$, ()-> (integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    $abduce_subcollection_denoting_termsP$ = defparameter("*ABDUCE-SUBCOLLECTION-DENOTING-TERMS?*", NIL);
    $default_abduction_cost$ = deflexical("*DEFAULT-ABDUCTION-COST*", ZERO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_abduction_file() {
    // CVS_ID("Id: removal-modules-abduction.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym3$_ABDUCTION_TERM_ISG_);
    inference_modules.inference_removal_module($kw17$REMOVAL_ABDUCTION_POS_CHECK, $list18);
    inference_modules.inference_removal_module($kw20$REMOVAL_ABDUCTION_POS_UNIFY, $list21);
    inference_modules.inference_removal_module($kw22$REMOVAL_EXCLUSIVE_ABDUCTION_POS, $list23);
    inference_modules.inference_removal_module($kw24$REMOVAL_ABDUCTION_NEG_CHECK, $list25);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY"), makeKeyword("REMOVAL-ABDUCTION-POS-CHECK"), makeKeyword("REMOVAL-EXCLUSIVE-ABDUCTION-POS"));
  public static final SubLSymbol $kw1$NOT = makeKeyword("NOT");
  public static final SubLSymbol $kw2$AND = makeKeyword("AND");
  public static final SubLSymbol $sym3$_ABDUCTION_TERM_ISG_ = makeSymbol("*ABDUCTION-TERM-ISG*");
  public static final SubLSymbol $sym4$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLList $list5 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("COMPLETELY-ENUMERABLE-COLLECTION?")));
  public static final SubLSymbol $sym6$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLObject $const7$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));
  public static final SubLObject $const8$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn"));
  public static final SubLObject $const9$AbducedTermFn = constant_handles.reader_make_constant_shell(makeString("AbducedTermFn"));
  public static final SubLSymbol $sym10$NON_ABDUCIBLE_COLLECTION_ = makeSymbol("NON-ABDUCIBLE-COLLECTION?");
  public static final SubLObject $const11$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));
  public static final SubLString $str12$no_isa_constraints_for_abduced_ty = makeString("no isa constraints for abduced type");
  public static final SubLSymbol $sym13$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");
  public static final SubLSymbol $kw14$POS = makeKeyword("POS");
  public static final SubLSymbol $kw15$ABDUCTION = makeKeyword("ABDUCTION");
  public static final SubLSymbol $kw16$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw17$REMOVAL_ABDUCTION_POS_CHECK = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");
  public static final SubLList $list18 = list(new SubLObject[] {makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABDUCTION-POS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$competitors #$GeorgeWBush #$BillClinton)")});
  public static final SubLSymbol $sym19$ABDUCED_TERM_P = makeSymbol("ABDUCED-TERM-P");
  public static final SubLSymbol $kw20$REMOVAL_ABDUCTION_POS_UNIFY = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");
  public static final SubLList $list21 = list(new SubLObject[] {makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABDUCTION-POS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <whatever>) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$brothers #$GeorgeWBush ?BROTHER)")});
  public static final SubLSymbol $kw22$REMOVAL_EXCLUSIVE_ABDUCTION_POS = makeKeyword("REMOVAL-EXCLUSIVE-ABDUCTION-POS");
  public static final SubLList $list23 = list(new SubLObject[] {makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell(makeString("AbducedTermFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-ABDUCTION-EXCLUSIVE?"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EXCLUSIVE-ABDUCTION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("apply only abduction on (<fort> . <whatever>) where the asent has an abduced term"), makeKeyword("EXAMPLE"), makeString("(#$brothers #$GeorgeWBush (#$AbducedTermFn (#$CycProblemStoreFn 1388) #$MaleAnimal 2))")});
  public static final SubLSymbol $kw24$REMOVAL_ABDUCTION_NEG_CHECK = makeKeyword("REMOVAL-ABDUCTION-NEG-CHECK");
  public static final SubLList $list25 = list(new SubLObject[] {makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"), makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ABDUCTION-NEG-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ABDUCTION-NEG-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<fort> . <fully-bound>)) where the asent is deemed abducible, \n    and the problem store allows abduction"), makeKeyword("EXAMPLE"), makeString("(#$not (#$competitors #$GeorgeWBush #$BillClinton))")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_abduction_file();
  }

  public void initializeVariables() {
    init_removal_modules_abduction_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_abduction_file();
  }

}
