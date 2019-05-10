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
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class removal_modules_evaluation extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_evaluation() {}
  public static final SubLFile me = new removal_modules_evaluation();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluation";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 809) 
  public static final SubLObject make_eval_support(SubLObject sentence, SubLObject contextualizedP) {
    if ((contextualizedP == UNPROVIDED)) {
      contextualizedP = NIL;
    }
    {
      SubLObject module = ((NIL != contextualizedP) ? ((SubLObject) $kw0$CODE) : $kw1$EVAL);
      return arguments.make_hl_support(module, sentence, UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1119) 
  private static SubLSymbol $default_eval_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1322) 
  public static final SubLObject removal_eval_exclusive(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        SubLObject constraint_mt = mt_relevance_macros.conservative_constraint_mt(mt);
        SubLObject exclusiveP = NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(constraint_mt);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            exclusiveP = inference_trampolines.inference_evaluatable_predicateP(pred);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return exclusiveP;
      }
    }
  }

  public static final class $removal_eval_exclusive$UnaryFunction extends UnaryFunction {
    public $removal_eval_exclusive$UnaryFunction() { super(extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE")); }
    public SubLObject processItem(SubLObject arg1) { return removal_eval_exclusive(arg1, UNPROVIDED); }
  }

  public static final class $removal_eval_exclusive$BinaryFunction extends BinaryFunction {
    public $removal_eval_exclusive$BinaryFunction() { super(extractFunctionNamed("REMOVAL-EVAL-EXCLUSIVE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_eval_exclusive(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1688) 
  public static final SubLObject removal_eval_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return variables.fully_bound_p(asent);
  }

  public static final class $removal_eval_required$UnaryFunction extends UnaryFunction {
    public $removal_eval_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-EVAL-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_eval_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_eval_required$BinaryFunction extends BinaryFunction {
    public $removal_eval_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-EVAL-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_eval_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 1799) 
  public static final SubLObject removal_eval_expand(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject answer = relation_evaluation.cyc_evaluate(asent);
        SubLObject validP = thread.secondMultipleValue();
        SubLObject contextualizedP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != validP)) {
          if ((NIL != answer)) {
            {
              SubLObject hl_support_formula = backward_utilities.inference_canonicalize_hl_support_literal(asent);
              SubLObject support = make_eval_support(hl_support_formula, contextualizedP);
              backward.removal_add_node(support, UNPROVIDED, UNPROVIDED);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 4739) 
  private static SubLSymbol $evaluatable_predicates_to_optimize$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-evaluation.lisp", position = 5033) 
  private static SubLSymbol $removal_generic_eval_modules$ = null;

  public static final SubLObject declare_removal_modules_evaluation_file() {
    declareFunction(myName, "make_eval_support", "MAKE-EVAL-SUPPORT", 1, 1, false);
    declareFunction(myName, "removal_eval_exclusive", "REMOVAL-EVAL-EXCLUSIVE", 1, 1, false); new $removal_eval_exclusive$UnaryFunction(); new $removal_eval_exclusive$BinaryFunction();
    declareFunction(myName, "removal_eval_required", "REMOVAL-EVAL-REQUIRED", 1, 1, false); new $removal_eval_required$UnaryFunction(); new $removal_eval_required$BinaryFunction();
    declareFunction(myName, "removal_eval_expand", "REMOVAL-EVAL-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_not_eval_exclusive", "REMOVAL-NOT-EVAL-EXCLUSIVE", 1, 1, false);
    declareFunction(myName, "removal_not_eval_required", "REMOVAL-NOT-EVAL-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_not_eval_expand", "REMOVAL-NOT-EVAL-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_evaluation_file() {
    $default_eval_cost$ = defparameter("*DEFAULT-EVAL-COST*", ONE_INTEGER);
    $evaluatable_predicates_to_optimize$ = deflexical("*EVALUATABLE-PREDICATES-TO-OPTIMIZE*", $list8);
    $removal_generic_eval_modules$ = deflexical("*REMOVAL-GENERIC-EVAL-MODULES*", $list9);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_evaluation_file() {
    // CVS_ID("Id: removal-modules-evaluation.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.inference_removal_module($kw2$REMOVAL_EVAL, $list3);
    inference_modules.inference_removal_module($kw4$REMOVAL_NOT_EVAL, $list5);
    preference_modules.inference_preference_module($kw6$EVALUATABLE_PREDICATE_DELAY_UNTIL_CLOSED, $list7);
    {
      SubLObject cdolist_list_var = $evaluatable_predicates_to_optimize$.getGlobalValue();
      SubLObject pred = NIL;
      for (pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pred = cdolist_list_var.first()) {
        inference_modules.register_solely_specific_removal_module_predicate(pred);
        {
          SubLObject cdolist_list_var_1 = $removal_generic_eval_modules$.getGlobalValue();
          SubLObject module = NIL;
          for (module = cdolist_list_var_1.first(); (NIL != cdolist_list_var_1); cdolist_list_var_1 = cdolist_list_var_1.rest(), module = cdolist_list_var_1.first()) {
            inference_modules.inference_removal_module_use_generic(pred, module);
          }
        }
      }
    }
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$CODE = makeKeyword("CODE");
  public static final SubLSymbol $kw1$EVAL = makeKeyword("EVAL");
  public static final SubLSymbol $kw2$REMOVAL_EVAL = makeKeyword("REMOVAL-EVAL");
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<evaluatable predicate> . <fully bound>)\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)")});
  public static final SubLSymbol $kw4$REMOVAL_NOT_EVAL = makeKeyword("REMOVAL-NOT-EVAL");
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-NOT-EVAL-EXCLUSIVE"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-NOT-EVAL-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-EVAL-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-EVAL-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<evaluatable predicate> . <fully bound>))\nusing (#$evaluationDefn <evaluatable predicate> <symbol>)\nand calling the SubL form (<symbol> . <fully bound>)")});
  public static final SubLSymbol $kw6$EVALUATABLE_PREDICATE_DELAY_UNTIL_CLOSED = makeKeyword("EVALUATABLE-PREDICATE-DELAY-UNTIL-CLOSED");
  public static final SubLList $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-EVALUATABLE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
  public static final SubLList $list8 = list(constant_handles.reader_make_constant_shell(makeString("greaterThan")), constant_handles.reader_make_constant_shell(makeString("greaterThanOrEqualTo")), constant_handles.reader_make_constant_shell(makeString("quantitySubsumes")));
  public static final SubLList $list9 = list(makeKeyword("REMOVAL-EVAL"), makeKeyword("REMOVAL-NOT-EVAL"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_evaluation_file();
  }

  public void initializeVariables() {
    init_removal_modules_evaluation_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_evaluation_file();
  }

}
