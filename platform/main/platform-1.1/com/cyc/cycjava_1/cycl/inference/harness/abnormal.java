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
import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward_results;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class abnormal extends SubLTranslatedFile {

  //// Constructor

  private abnormal() {}
  public static final SubLFile me = new abnormal();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.abnormal";

  //// Definitions

  /** When non-nil, #$abnormal reasoning is performed to defeat proofs. */
  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 499)
  public static SubLSymbol $abnormality_checking_enabled$ = null;

  /** When non-nil, support #$except abnormality checking. */
  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 689)
  private static SubLSymbol $abnormality_except_support_enabled$ = null;

  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 809)
  public static final SubLObject abnormality_except_support_enabledP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $abnormality_except_support_enabled$.getDynamicValue(thread);
    }
  }

  /** Return T iff RULE is a rule that has some exceptions somewhere. */
  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 913)
  public static final SubLObject rule_has_exceptionsP(SubLObject rule) {
    return makeBoolean(((NIL != assertions_high.rule_assertionP(rule))
           && (NIL != assertion_utilities.assertion_has_meta_assertionsP(rule))
           && (kb_indexing.num_gaf_arg_index(rule, TWO_INTEGER, $const0$abnormal, UNPROVIDED).isPositive()
            || Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12775").isPositive()
            || (NIL != ((NIL != abnormality_except_support_enabledP()) ? ((SubLObject) assertion_utilities.excepted_assertionP(rule)) : NIL)))));
  }

  /** Return non-nil iff RULE-BINDINGS can be proven to be abnormal wrt RULE in
   in problem-store STORE under the assumptions of TRANSFORMATION-MT. */
  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 1321)
  public static final SubLObject rule_bindings_abnormalP(SubLObject store, SubLObject rule, SubLObject rule_bindings, SubLObject transformation_mt) {
    if ((NIL != rule_has_exceptionsP(rule))) {
      {
        SubLObject bound_values_to_check = Mapping.mapcar($sym1$VARIABLE_BINDING_VALUE, inference_worker.canonicalize_proof_bindings(rule_bindings));
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35171");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 2775)
  public static SubLSymbol $abnormality_transformation_depth$ = null;

  /** @return booleanp; Like @xref forward-abnormality-check except doesn't throw anything,
just returns a nice, simple boolean. */
  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 5346)
  public static final SubLObject forward_bindings_abnormalP(SubLObject propagation_mt, SubLObject rule, SubLObject trigger_bindings, SubLObject inference_bindings) {
    {
      SubLObject abnormalP = NIL;
      try {
        forward_abnormality_check(propagation_mt, rule, trigger_bindings, inference_bindings);
      } catch (Throwable ccatch_env_var) {
        abnormalP = Errors.handleThrowable(ccatch_env_var, $kw16$INFERENCE_REJECTED);
      }
      return abnormalP;
    }
  }

  /** Reject forward inference if the given bindings are abnormal wrt RULE. */
  @SubL(source = "cycl/inference/harness/abnormal.lisp", position = 5758)
  public static final SubLObject forward_abnormality_check(SubLObject propagation_mt, SubLObject rule, SubLObject trigger_bindings, SubLObject inference_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $abnormality_checking_enabled$.getDynamicValue(thread))) {
        if ((NIL != rule_has_exceptionsP(rule))) {
          {
            SubLObject rule_variables = NIL;
            SubLObject bound_values_to_check = NIL;
            rule_variables = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31007");
            bound_values_to_check = rule_variables;
            bound_values_to_check = conses_high.nsublis(trigger_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
            bound_values_to_check = conses_high.nsublis(inference_bindings, bound_values_to_check, UNPROVIDED, UNPROVIDED);
            if ((NIL == variables.fully_bound_p(bound_values_to_check))) {
              Errors.cerror($str14$Assume_it_isn_t_abnormal, $str17$Abnormality_checker_doesn_t_have_, rule);
              return NIL;
            }
            {
              SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
              try {
                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35173"))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35175");
                }
              } finally {
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_abnormal_file() {
    declareFunction(myName, "abnormality_except_support_enabledP", "ABNORMALITY-EXCEPT-SUPPORT-ENABLED?", 0, 0, false);
    declareFunction(myName, "rule_has_exceptionsP", "RULE-HAS-EXCEPTIONS?", 1, 0, false);
    declareFunction(myName, "rule_bindings_abnormalP", "RULE-BINDINGS-ABNORMAL?", 4, 0, false);
    declareFunction(myName, "abnormality_check_internal", "ABNORMALITY-CHECK-INTERNAL", 4, 0, false);
    declareFunction(myName, "abnormality_check_sentence", "ABNORMALITY-CHECK-SENTENCE", 2, 0, false);
    declareFunction(myName, "abnormality_check_query_properties", "ABNORMALITY-CHECK-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "abnormality_query_used_illegal_proofP", "ABNORMALITY-QUERY-USED-ILLEGAL-PROOF?", 2, 0, false);
    declareFunction(myName, "abnormality_justification_used_illegal_proofP", "ABNORMALITY-JUSTIFICATION-USED-ILLEGAL-PROOF?", 2, 0, false);
    declareFunction(myName, "backward_abnormality_check", "BACKWARD-ABNORMALITY-CHECK", 3, 0, false);
    declareFunction(myName, "forward_bindings_abnormalP", "FORWARD-BINDINGS-ABNORMAL?", 4, 0, false);
    declareFunction(myName, "forward_abnormality_check", "FORWARD-ABNORMALITY-CHECK", 4, 0, false);
    declareFunction(myName, "signal_abnormal", "SIGNAL-ABNORMAL", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_abnormal_file() {
    $abnormality_checking_enabled$ = defvar("*ABNORMALITY-CHECKING-ENABLED*", T);
    $abnormality_except_support_enabled$ = defparameter("*ABNORMALITY-EXCEPT-SUPPORT-ENABLED*", T);
    $abnormality_transformation_depth$ = defvar("*ABNORMALITY-TRANSFORMATION-DEPTH*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_abnormal_file() {
    // CVS_ID("Id: abnormal.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLSymbol $sym1$VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");
  public static final SubLSymbol $kw2$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLObject $const3$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLSymbol $kw4$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw5$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw6$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
  public static final SubLSymbol $kw7$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw8$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw9$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLSymbol $kw10$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw11$HL = makeKeyword("HL");
  public static final SubLSymbol $kw12$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
  public static final SubLSymbol $sym13$SECOND = makeSymbol("SECOND");
  public static final SubLString $str14$Assume_it_isn_t_abnormal = makeString("Assume it isn't abnormal");
  public static final SubLString $str15$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all node-variables for ~S");
  public static final SubLSymbol $kw16$INFERENCE_REJECTED = makeKeyword("INFERENCE-REJECTED");
  public static final SubLString $str17$Abnormality_checker_doesn_t_have_ = makeString("Abnormality checker doesn't have all bindings for ~S");
  public static final SubLSymbol $kw18$ABNORMAL = makeKeyword("ABNORMAL");
  public static final SubLString $str19$_S_are_exceptions_to__S = makeString("~S are exceptions to ~S");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_abnormal_file();
  }

  @Override
  public void initializeVariables() {
    init_abnormal_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_abnormal_file();
  }

}
