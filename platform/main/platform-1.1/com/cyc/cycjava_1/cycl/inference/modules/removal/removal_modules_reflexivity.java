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
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_modules_reflexivity extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_reflexivity() {}
  public static final SubLFile me = new removal_modules_reflexivity();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_reflexivity";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexivity.lisp", position = 991) 
  private static SubLSymbol $default_reflexive_both_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexivity.lisp", position = 2496) 
  private static SubLSymbol $default_reflexive_one_arg_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexivity.lisp", position = 2806) 
  public static final SubLObject removal_reflexive_one_arg_expand(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
          at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
          {
            SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            {
              SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
              SubLObject justification = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != v_bindings)) {
                {
                  SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                  backward.removal_add_node(arguments.make_hl_support($kw0$REFLEXIVE, formula, UNPROVIDED, UNPROVIDED), v_bindings, justification);
                }
              }
            }
          }
        } finally {
          at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  public static final class $removal_reflexive_one_arg_expand$UnaryFunction extends UnaryFunction {
    public $removal_reflexive_one_arg_expand$UnaryFunction() { super(extractFunctionNamed("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND")); }
    public SubLObject processItem(SubLObject arg1) { return removal_reflexive_one_arg_expand(arg1, UNPROVIDED); }
  }

  public static final class $removal_reflexive_one_arg_expand$BinaryFunction extends BinaryFunction {
    public $removal_reflexive_one_arg_expand$BinaryFunction() { super(extractFunctionNamed("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_reflexive_one_arg_expand(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexivity.lisp", position = 6440) 
  private static SubLSymbol $default_irreflexive_both_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexivity.lisp", position = 7969) 
  private static SubLSymbol $default_irreflexive_one_arg_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-reflexivity.lisp", position = 12621) 
  public static final SubLObject prune_reflexive_use_of_irreflexive_predicate_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return makeBoolean(((cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED) == cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))
           && (NIL != kb_accessors.irreflexive_predicateP(cycl_utilities.atomic_sentence_predicate(asent)))));
  }

  public static final SubLObject declare_removal_modules_reflexivity_file() {
    declareFunction(myName, "removal_reflexive_both_expand", "REMOVAL-REFLEXIVE-BOTH-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_reflexive_one_arg_expand", "REMOVAL-REFLEXIVE-ONE-ARG-EXPAND", 1, 1, false); new $removal_reflexive_one_arg_expand$UnaryFunction(); new $removal_reflexive_one_arg_expand$BinaryFunction();
    declareFunction(myName, "removal_reflexive_map_cost", "REMOVAL-REFLEXIVE-MAP-COST", 1, 1, false);
    declareFunction(myName, "removal_reflexive_map_iterator", "REMOVAL-REFLEXIVE-MAP-ITERATOR", 1, 0, false);
    declareFunction(myName, "best_reflexive_pred_arg_type", "BEST-REFLEXIVE-PRED-ARG-TYPE", 1, 0, false);
    declareFunction(myName, "removal_irreflexive_both_expand", "REMOVAL-IRREFLEXIVE-BOTH-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_irreflexive_one_arg_completeness", "REMOVAL-IRREFLEXIVE-ONE-ARG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_irreflexive_one_arg_expand", "REMOVAL-IRREFLEXIVE-ONE-ARG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_irreflexive_map_cost", "REMOVAL-IRREFLEXIVE-MAP-COST", 1, 1, false);
    declareFunction(myName, "removal_irreflexive_map_completeness", "REMOVAL-IRREFLEXIVE-MAP-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_irreflexive_map_iterator", "REMOVAL-IRREFLEXIVE-MAP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_irreflexive_map_support", "REMOVAL-IRREFLEXIVE-MAP-SUPPORT", 2, 0, false);
    declareFunction(myName, "prune_reflexive_use_of_irreflexive_predicate_required", "PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-REQUIRED", 1, 1, false);
    declareFunction(myName, "prune_reflexive_use_of_irreflexive_predicate_expand", "PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_reflexivity_file() {
    $default_reflexive_both_cost$ = defparameter("*DEFAULT-REFLEXIVE-BOTH-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
    $default_reflexive_one_arg_cost$ = defparameter("*DEFAULT-REFLEXIVE-ONE-ARG-COST*", ONE_INTEGER);
    $default_irreflexive_both_cost$ = defparameter("*DEFAULT-IRREFLEXIVE-BOTH-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
    $default_irreflexive_one_arg_cost$ = defparameter("*DEFAULT-IRREFLEXIVE-ONE-ARG-COST*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_reflexivity_file() {
        inference_modules.inference_removal_module($kw1$REMOVAL_REFLEXIVE_BOTH, $list2);
    inference_modules.inference_removal_module($kw3$REMOVAL_REFLEXIVE_ONE_ARG, $list4);
    inference_modules.inference_removal_module($kw5$REMOVAL_REFLEXIVE_MAP, $list6);
    inference_modules.inference_removal_module($kw8$REMOVAL_IRREFLEXIVE_BOTH, $list9);
    inference_modules.inference_removal_module($kw13$REMOVAL_IRREFLEXIVE_ONE_ARG, $list14);
    inference_modules.inference_removal_module($kw15$REMOVAL_IRREFLEXIVE_MAP, $list16);
    inference_modules.inference_removal_module($kw17$PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE, $list18);
    utilities_macros.note_funcall_helper_function($sym19$PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_REQUIRED);
    utilities_macros.note_funcall_helper_function($sym21$PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_EXPAND);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$REFLEXIVE = makeKeyword("REFLEXIVE");
  public static final SubLSymbol $kw1$REMOVAL_REFLEXIVE_BOTH = makeKeyword("REMOVAL-REFLEXIVE-BOTH");
  public static final SubLList $list2 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REFLEXIVE-BOTH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-BOTH-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <fully-bound> <fully-bound>)\n    by unification of <arg1> and <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$notFarFrom #$Italy #$Italy)\nin\n #$WorldGeographyMt\nvia\n (#$isa #$notFarFrom #$ReflexiveBinaryPredicate)\n\n(#$geographicalSubRegions (#$SchemaObjectFn #$Nima-Gns-LS -4463449) (#$SchemaObjectFn #$Nima-Gns-LS -4463449))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa (#$geographicalSubRegions #$ReflexiveBinaryPredicate))\n")});
  public static final SubLSymbol $kw3$REMOVAL_REFLEXIVE_ONE_ARG = makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG");
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REFLEXIVE-ONE-ARG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <fully-bound> <not-fully-bound>) and\n    (<reflexive predicate> <not-fully-bound> <fully-bound>)\nby unification of <not-fully-bound> and <fully-bound>\n"), makeKeyword("EXAMPLE"), makeString("(#$notFarFrom #$Italy ?WHERE)\nin\n #$WorldGeographyMt\nvia\n (#$isa #$notFarFrom #$ReflexiveBinaryPredicate)\n\n(#$geographicalSubRegions (#$SchemaObjectFn #$Nima-Gns-LS -4463449) ?WHERE)\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$geographicalSubRegions #$ReflexiveBinaryPredicate)")});
  public static final SubLSymbol $kw5$REMOVAL_REFLEXIVE_MAP = makeKeyword("REMOVAL-REFLEXIVE-MAP");
  public static final SubLList $list6 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-REFLEXIVE-MAP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("PREDICATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-REFLEXIVE-MAP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), makeKeyword("INPUT"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <not-fully-bound> <not-fully-bound>)\nby iterating over the instances of the arg-types of <reflexive predicate>"), makeKeyword("EXAMPLE"), makeString("(#$subCultures ?X ?Y)")});
  public static final SubLObject $const7$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $kw8$REMOVAL_IRREFLEXIVE_BOTH = makeKeyword("REMOVAL-IRREFLEXIVE-BOTH");
  public static final SubLList $list9 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-IRREFLEXIVE-BOTH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IRREFLEXIVE-BOTH-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <fully-bound> <fully-bound>))\nby unification of <arg1> and <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$farFrom #$Italy #$Italy))\nin\n #$WorldGeographyMt\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)\n\n(#$not (#$farFrom (#$SchemaObjectFn #$Nima-Gns-LS -4463449) (#$SchemaObjectFn #$Nima-Gns-LS -4463449)))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)")});
  public static final SubLSymbol $kw10$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw11$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw12$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw13$REMOVAL_IRREFLEXIVE_ONE_ARG = makeKeyword("REMOVAL-IRREFLEXIVE-ONE-ARG");
  public static final SubLList $list14 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-IRREFLEXIVE-ONE-ARG-COST*"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IRREFLEXIVE-ONE-ARG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IRREFLEXIVE-ONE-ARG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <fully-bound> <not-fully-bound>)) and\n    (#$not (<irreflexive predicate> <not-fully-bound> <fully-bound>))\nby unification of <not-fully-bound> and <fully-bound>\n"), makeKeyword("EXAMPLE"), makeString("(#$not (#$farFrom ?WHERE #$Italy))\nin\n #$WorldGeographyMt\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)\n\n(#$not (#$farFrom ?WHERE (#$SchemaObjectFn #$Nima-Gns-LS -4463449)))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)")});
  public static final SubLSymbol $kw15$REMOVAL_IRREFLEXIVE_MAP = makeKeyword("REMOVAL-IRREFLEXIVE-MAP");
  public static final SubLList $list16 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("PREDICATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), makeKeyword("INPUT"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <not-fully-bound> <not-fully-bound>)) \nby iterating over the instances of the arg-types of <irreflexive predicate>")});
  public static final SubLSymbol $kw17$PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE = makeKeyword("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE");
  public static final SubLList $list18 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<irreflexive-predicate> <anything> <anything>) pruned when <arg1> and <arg2> are equal."), makeKeyword("EXAMPLE"), makeString("(#$sisters ?var0 ?var0)")});
  public static final SubLSymbol $sym19$PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_REQUIRED = makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-REQUIRED");
  public static final SubLSymbol $kw20$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $sym21$PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_EXPAND = makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-EXPAND");

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_reflexivity_file();
  }

  public void initializeVariables() {
    init_removal_modules_reflexivity_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_reflexivity_file();
  }

}
