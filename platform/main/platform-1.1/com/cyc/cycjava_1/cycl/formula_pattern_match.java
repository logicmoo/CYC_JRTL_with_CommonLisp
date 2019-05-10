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
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.pattern_match;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.unification;

public  final class formula_pattern_match extends SubLTranslatedFile {

  //// Constructor

  private formula_pattern_match() {}
  public static final SubLFile me = new formula_pattern_match();
  public static final String myName = "com.cyc.cycjava_1.cycl.formula_pattern_match";

  //// Definitions

  /** Return T iff PATTERN matches FORMULA. */
  @SubL(source = "cycl/formula-pattern-match.lisp", position = 1171) 
  public static final SubLObject pattern_matches_formula(SubLObject pattern, SubLObject formula) {
    return pattern_matches_formula_internal(pattern, formula);
  }

  public static final class $pattern_matches_formula$BinaryFunction extends BinaryFunction {
    public $pattern_matches_formula$BinaryFunction() { super(extractFunctionNamed("PATTERN-MATCHES-FORMULA")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return pattern_matches_formula(arg1, arg2); }
  }

  /** Return T iff PATTERN matches FORMULA.
   :BIND expressions are not allowed within PATTERN */
  @SubL(source = "cycl/formula-pattern-match.lisp", position = 1618) 
  public static final SubLObject pattern_matches_formula_without_bindings(SubLObject pattern, SubLObject formula) {
    return pattern_matches_formula_without_bindings_internal(pattern, formula);
  }

  /** Return T iff FORMULA matches PATTERN. */
  @SubL(source = "cycl/formula-pattern-match.lisp", position = 1864) 
  public static final SubLObject formula_matches_pattern(SubLObject formula, SubLObject pattern) {
    return pattern_matches_formula_internal(pattern, formula);
  }

  @SubL(source = "cycl/formula-pattern-match.lisp", position = 2024) 
  private static SubLSymbol $pattern_matches_formula_atomic_methods$ = null;

  @SubL(source = "cycl/formula-pattern-match.lisp", position = 2807) 
  private static SubLSymbol $pattern_matches_formula_methods$ = null;

  @SubL(source = "cycl/formula-pattern-match.lisp", position = 3695) 
  public static final SubLObject pattern_matches_formula_internal(SubLObject pattern, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject success = NIL;
        SubLObject v_bindings = NIL;
        {
          SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
          SubLObject _prev_bind_1 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
          try {
            pattern_match.$pattern_matches_tree_atomic_methods$.bind($pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
            pattern_match.$pattern_matches_tree_methods$.bind($pattern_matches_formula_methods$.getGlobalValue(), thread);
            thread.resetMultipleValues();
            {
              SubLObject match_success = pattern_match.pattern_matches_tree(pattern, formula);
              SubLObject match_bindings = thread.secondMultipleValue();
              thread.resetMultipleValues();
              success = match_success;
              v_bindings = match_bindings;
            }
          } finally {
            pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_1, thread);
            pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(success, v_bindings);
      }
    }
  }

  @SubL(source = "cycl/formula-pattern-match.lisp", position = 4364) 
  public static final SubLObject pattern_matches_formula_without_bindings_internal(SubLObject pattern, SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject success = NIL;
        {
          SubLObject _prev_bind_0 = pattern_match.$pattern_matches_tree_atomic_methods$.currentBinding(thread);
          SubLObject _prev_bind_1 = pattern_match.$pattern_matches_tree_methods$.currentBinding(thread);
          try {
            pattern_match.$pattern_matches_tree_atomic_methods$.bind($pattern_matches_formula_atomic_methods$.getGlobalValue(), thread);
            pattern_match.$pattern_matches_tree_methods$.bind($pattern_matches_formula_methods$.getGlobalValue(), thread);
            success = pattern_match.pattern_matches_tree_without_bindings(pattern, formula);
          } finally {
            pattern_match.$pattern_matches_tree_methods$.rebind(_prev_bind_1, thread);
            pattern_match.$pattern_matches_tree_atomic_methods$.rebind(_prev_bind_0, thread);
          }
        }
        return success;
      }
    }
  }

  @SubL(source = "cycl/formula-pattern-match.lisp", position = 7548) 
  public static final SubLObject pattern_matches_formula_nat_method(SubLObject pattern, SubLObject formula) {
    {
      SubLObject datum = pattern;
      SubLObject current = datum;
      SubLObject pattern_operator = NIL;
      SubLObject subpattern = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
      pattern_operator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
      subpattern = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if ((NIL != nart_handles.nart_p(formula))) {
          return pattern_match.pattern_matches_tree_internal(subpattern, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10378"));
        } else {
          return pattern_match.pattern_matches_tree_internal(subpattern, formula);
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list6);
      }
    }
    return NIL;
  }

  public static final class $pattern_matches_formula_nat_method$BinaryFunction extends BinaryFunction {
    public $pattern_matches_formula_nat_method$BinaryFunction() { super(extractFunctionNamed("PATTERN-MATCHES-FORMULA-NAT-METHOD")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return pattern_matches_formula_nat_method(arg1, arg2); }
  }

  /** Use PATTERN to transform FORMULA, assuming BINDINGS. */
  @SubL(source = "cycl/formula-pattern-match.lisp", position = 9261) 
  public static final SubLObject pattern_transform_formula(SubLObject pattern, SubLObject formula, SubLObject v_bindings) {
    if ((v_bindings == UNPROVIDED)) {
      v_bindings = NIL;
    }
    return pattern_transform_formula_internal(pattern, formula, v_bindings);
  }

  @SubL(source = "cycl/formula-pattern-match.lisp", position = 9904) 
  public static final SubLObject pattern_transform_formula_internal(SubLObject pattern, SubLObject formula, SubLObject v_bindings) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer_transform = NIL;
        SubLObject answer_bindings = NIL;
        {
          SubLObject _prev_bind_0 = pattern_match.$pattern_transform_match_method$.currentBinding(thread);
          try {
            pattern_match.$pattern_transform_match_method$.bind($sym8$PATTERN_MATCHES_FORMULA, thread);
            thread.resetMultipleValues();
            {
              SubLObject sub_transform = pattern_match.pattern_transform_tree(pattern, formula, v_bindings);
              SubLObject sub_bindings = thread.secondMultipleValue();
              thread.resetMultipleValues();
              answer_transform = sub_transform;
              answer_bindings = sub_bindings;
            }
          } finally {
            pattern_match.$pattern_transform_match_method$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(answer_transform, answer_bindings);
      }
    }
  }

  public static final SubLObject declare_formula_pattern_match_file() {
    declareFunction(myName, "pattern_matches_formula", "PATTERN-MATCHES-FORMULA", 2, 0, false); new $pattern_matches_formula$BinaryFunction();
    declareFunction(myName, "pattern_matches_formula_without_bindings", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS", 2, 0, false);
    declareFunction(myName, "formula_matches_pattern", "FORMULA-MATCHES-PATTERN", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_internal", "PATTERN-MATCHES-FORMULA-INTERNAL", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_without_bindings_internal", "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS-INTERNAL", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_isa_method", "PATTERN-MATCHES-FORMULA-ISA-METHOD", 2, 0, false);
    declareFunction(myName, "call_pattern_matches_formula_isa_method", "CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 0, false);
    declareFunction(myName, "pattern_matches_formula_isa_memoized_method", "PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD", 2, 0, false);
    declareFunction(myName, "memoized_call_pattern_matches_formula_isa_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD-INTERNAL", 3, 1, false);
    declareFunction(myName, "memoized_call_pattern_matches_formula_isa_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD", 3, 1, false);
    declareFunction(myName, "pattern_matches_formula_not_isa_disjoint_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 2, 0, false);
    declareFunction(myName, "call_pattern_matches_formula_not_isa_disjoint_method", "CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 0, false);
    declareFunction(myName, "pattern_matches_formula_not_isa_disjoint_memoized_method", "PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD", 2, 0, false);
    declareFunction(myName, "memoized_call_pattern_matches_formula_not_isa_disjoint_method_internal", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD-INTERNAL", 3, 1, false);
    declareFunction(myName, "memoized_call_pattern_matches_formula_not_isa_disjoint_method", "MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD", 3, 1, false);
    declareFunction(myName, "pattern_matches_formula_genls_method", "PATTERN-MATCHES-FORMULA-GENLS-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_spec_method", "PATTERN-MATCHES-FORMULA-SPEC-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_nat_method", "PATTERN-MATCHES-FORMULA-NAT-METHOD", 2, 0, false); new $pattern_matches_formula_nat_method$BinaryFunction();
    declareFunction(myName, "pattern_matches_formula_unify_method", "PATTERN-MATCHES-FORMULA-UNIFY-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_genl_pred_method", "PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_genl_inverse_method", "PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_spec_pred_method", "PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_matches_formula_spec_inverse_method", "PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD", 2, 0, false);
    declareFunction(myName, "pattern_transform_formula", "PATTERN-TRANSFORM-FORMULA", 2, 1, false);
    declareFunction(myName, "formula_transform_pattern", "FORMULA-TRANSFORM-PATTERN", 2, 1, false);
    declareFunction(myName, "pattern_transform_formula_internal", "PATTERN-TRANSFORM-FORMULA-INTERNAL", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_formula_pattern_match_file() {
    $pattern_matches_formula_atomic_methods$ = deflexical("*PATTERN-MATCHES-FORMULA-ATOMIC-METHODS*", $list0);
    $pattern_matches_formula_methods$ = deflexical("*PATTERN-MATCHES-FORMULA-METHODS*", $list1);
    return NIL;
  }

  public static final SubLObject setup_formula_pattern_match_file() {
    // CVS_ID("Id: formula-pattern-match.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    memoization_state.note_memoized_function($sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD);
    memoization_state.note_memoized_function($sym5$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(new SubLObject[] {list(makeKeyword("FULLY-BOUND"), makeSymbol("FULLY-BOUND-P")), list(makeKeyword("NOT-FULLY-BOUND"), makeSymbol("NOT-FULLY-BOUND-P")), list(makeKeyword("STRING"), makeSymbol("STRINGP")), list(makeKeyword("INTEGER"), makeSymbol("INTEGERP")), list(makeKeyword("FORT"), makeSymbol("FORT-P")), list(makeKeyword("HLMT"), makeSymbol("HLMT-P")), list(makeKeyword("CLOSED-HLMT"), makeSymbol("CLOSED-HLMT-P")), list(makeKeyword("CONSTANT"), makeSymbol("CONSTANT-P")), list(makeKeyword("NART"), makeSymbol("NART-P")), list(makeKeyword("CLOSED-NAUT"), makeSymbol("CLOSED-NAUT?")), list(makeKeyword("OPEN-NAUT"), makeSymbol("OPEN-NAUT?")), list(makeKeyword("ASSERTION"), makeSymbol("ASSERTION-P")), list(makeKeyword("SENTENCE"), makeSymbol("EL-SENTENCE-P")), list(makeKeyword("VARIABLE"), makeSymbol("VARIABLE-P")), list(makeKeyword("EL-VARIABLE"), makeSymbol("EL-VARIABLE-P")), list(makeKeyword("COLLECTION-FORT"), makeSymbol("COLLECTION-P")), list(makeKeyword("PREDICATE-FORT"), makeSymbol("PREDICATE-P")), list(makeKeyword("FUNCTOR-FORT"), makeSymbol("FUNCTOR-P")), list(makeKeyword("MT-FORT"), makeSymbol("MICROTHEORY-P"))});
  public static final SubLList $list1 = list(new SubLObject[] {list(makeKeyword("ISA"), makeSymbol("PATTERN-MATCHES-FORMULA-ISA-METHOD")), list(makeKeyword("ISA-MEMOIZED"), makeSymbol("PATTERN-MATCHES-FORMULA-ISA-MEMOIZED-METHOD")), list(makeKeyword("NOT-ISA-DISJOINT"), makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD")), list(makeKeyword("NOT-ISA-DISJOINT-MEMOIZED"), makeSymbol("PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-MEMOIZED-METHOD")), list(makeKeyword("GENLS"), makeSymbol("PATTERN-MATCHES-FORMULA-GENLS-METHOD")), list(makeKeyword("SPEC"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-METHOD")), list(makeKeyword("NAT"), makeSymbol("PATTERN-MATCHES-FORMULA-NAT-METHOD")), list(makeKeyword("UNIFY"), makeSymbol("PATTERN-MATCHES-FORMULA-UNIFY-METHOD")), list(makeKeyword("GENL-PRED"), makeSymbol("PATTERN-MATCHES-FORMULA-GENL-PRED-METHOD")), list(makeKeyword("GENL-INVERSE"), makeSymbol("PATTERN-MATCHES-FORMULA-GENL-INVERSE-METHOD")), list(makeKeyword("SPEC-PRED"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-PRED-METHOD")), list(makeKeyword("SPEC-INVERSE"), makeSymbol("PATTERN-MATCHES-FORMULA-SPEC-INVERSE-METHOD"))});
  public static final SubLList $list2 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLSymbol $sym3$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_ISA_METHOD = makeSymbol("MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-ISA-METHOD");
  public static final SubLSymbol $kw4$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym5$MEMOIZED_CALL_PATTERN_MATCHES_FORMULA_NOT_ISA_DISJOINT_METHOD = makeSymbol("MEMOIZED-CALL-PATTERN-MATCHES-FORMULA-NOT-ISA-DISJOINT-METHOD");
  public static final SubLList $list6 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("SUBPATTERN"));
  public static final SubLList $list7 = list(makeSymbol("PATTERN-OPERATOR"), makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLSymbol $sym8$PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");

  //// Initializers

  public void declareFunctions() {
    declare_formula_pattern_match_file();
  }

  public void initializeVariables() {
    init_formula_pattern_match_file();
  }

  public void runTopLevelForms() {
    setup_formula_pattern_match_file();
  }

}
