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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;

public  final class cycl_grammar extends SubLTranslatedFile {

  //// Constructor

  private cycl_grammar() {}
  public static final SubLFile me = new cycl_grammar();
  public static final String myName = "com.cyc.cycjava.cycl.cycl_grammar";

  //// Definitions

  /** dynamic variable to control whether the CycL grammar functions permit HL constructs */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 929) 
  public static SubLSymbol $grammar_permits_hlP$ = null;

  /** do we check the KB to see if terms are of the correct types, e.g. #$Predicate (t)
 or do we ignore the KB and only use syntactic information to check syntactic well-formedness (nil) */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 6087) 
  public static SubLSymbol $grammar_uses_kbP$ = null;

  /** do we permit a SubLList as a terminal in the grammar? */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 6366) 
  public static SubLSymbol $grammar_permits_list_as_terminalP$ = null;

  /** do we permit a SubLNonVariableNonKeyWordSymbol as a terminal in the grammar? */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 6487) 
  public static SubLSymbol $grammar_permits_symbol_as_terminalP$ = null;

  /** do we permit strings that contain non-ASCII characters? */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 6633) 
  public static SubLSymbol $grammar_permits_non_ascii_stringsP$ = null;

  /** do we permit a variable to denote anything permitted by the CycL grammar (t)
 or do we treat variables as syntactic, opaque objects, and disallow sentences and formulas to be denoted by variables (nil) ? */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 6757) 
  private static SubLSymbol $grammar_permissive_wrt_variablesP$ = null;

  /** do we permit quoted forms in the grammar? */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 7024) 
  private static SubLSymbol $grammar_permits_quoted_forms$ = null;

  @SubL(source = "cycl/cycl-grammar.lisp", position = 7172) 
  public static SubLSymbol $within_quote_form$ = null;

  @SubL(source = "cycl/cycl-grammar.lisp", position = 7215) 
  public static final SubLObject grammar_permits_hlP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $grammar_permits_hlP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 7368) 
  public static final SubLObject grammar_permits_list_as_terminalP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $grammar_permits_list_as_terminalP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 7467) 
  public static final SubLObject grammar_permits_non_ascii_stringsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $grammar_permits_non_ascii_stringsP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 7667) 
  public static final SubLObject grammar_uses_kbP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $grammar_uses_kbP$.getDynamicValue(thread))
             && (NIL != control_vars.kb_loaded())));
    }
  }

  /** returns t iff OBJECT is a well-formed sentence according to the CycL grammar.
   To meet this specification, OBJECT must be of the form #$True
                                                       or #$False
                                                       or <variable>
                                                       or <HL assertion> (if HL constructs are permitted)
                                                       or <atomic sentence>
                                                       or <unary sentence>
                                                       or <binary sentence>
                                                       or <ternary sentence>
                                                       or <quaternary sentence>
                                                       or <quintary sentence>
                                                       or <user-defined logical operator sentence>
                                                       or <variable-arity sentence>
                                                       or <quantified sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 10335) 
  public static final SubLObject cycl_sentence_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject wffP = NIL;
        wffP = makeBoolean(((NIL != cycl_formulaic_sentence_p(object))
              || (NIL != cycl_truth_value_p(object))));
        if (((NIL == wffP)
             && (NIL == wff_vars.$wff_violations$.getDynamicValue(thread)))) {
          if ((NIL != el_utilities.el_formula_p(object))) {
            if ((NIL != wff.note_wff_violationP())) {
            	wff.note_wff_violation(list($kw16$NOT_A_TRUTH_FUNCTION,cycl_formula_predicate(object)));
            }
          } else {
            if ((NIL != wff.note_wff_violationP())) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8025");
            }
          }
        }
        return wffP;
      }
    }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 11947) 
  public static final SubLObject cycl_formulaic_sentence_p(SubLObject object) {
    if ((NIL != el_utilities.el_formula_p(object))) {
      return makeBoolean(((NIL != cycl_unary_sentence_p(object))
            || (NIL != cycl_binary_sentence_p(object))
            || (NIL != cycl_quantified_sentence_p(object))
            || (NIL != cycl_variable_arity_sentence_p(object))
            || (NIL != cycl_atomic_sentence_p(object))
            || (NIL != cycl_ternary_sentence_p(object))
            || (NIL != cycl_quaternary_sentence_p(object))
            || (NIL != cycl_quintary_sentence_p(object))
            || (NIL != cycl_user_defined_logical_operator_sentence_p(object))));
    } else {
      return makeBoolean((((NIL != grammar_permits_hlP())
               && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31386")))
            || (NIL != cycl_variable_p(object))));
    }
  }


  /** returns t iff OBJECT is of the form <user-defined logical operator> <sentence sequence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 17503) 
  public static final SubLObject cycl_user_defined_logical_operator_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_user_defined_logical_operator_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == el_utilities.user_defined_logical_operator_p(cycl_formula_predicate(object)))) {
    } else {
      return cycl_sentence_sequence_p(cycl_utilities.formula_args(object, $kw27$INCLUDE));
    }
    return NIL;
  }

  

  /** returns t iff OBJECT is of the form <quintary operator> <sentence> <sentence> <sentence> <sentence> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 16160) 
  public static final SubLObject cycl_quintary_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_quintary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == el_utilities.cyc_const_quintary_logical_op_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(FIVE_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        wff.note_wff_violation(list($kw21$ARITY_MISMATCH, object, cycl_formula_predicate(object), $str26$quintary_operator, FIVE_INTEGER, el_utilities.formula_arity(object, UNPROVIDED)));
      }
    } else {
      return makeBoolean(((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg3(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg4(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg5(object, UNPROVIDED)))));
    }
    return NIL;
  }

  
  /** returns t iff OBJECT is of the form <epsilon>
                                    or . <variable>
                                    or <sentence> <sentence sequence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 12520) 
  public static final SubLObject cycl_sentence_sequence_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.epsilon_p(object))
          || (NIL != cycl_variable_p(object))
          || ((NIL != cycl_sentence_p(el_utilities.first_in_sequence(object)))
             && (NIL != cycl_sentence_sequence_p(el_utilities.rest_of_sequence(object))))));
  }

  /** returns t iff OBJECT is of the form <quaternary operator> <sentence> <sentence> <sentence> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 15365) 
  public static final SubLObject cycl_quaternary_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_quaternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == el_utilities.cyc_const_quaternary_logical_op_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(FOUR_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        wff.note_wff_violation(list($kw21$ARITY_MISMATCH, object, cycl_formula_predicate(object), $str25$quaternary_operator, FOUR_INTEGER, el_utilities.formula_arity(object, UNPROVIDED)));
      }
    } else {
      return makeBoolean(((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg3(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg4(object, UNPROVIDED)))));
    }
    return NIL;
  }


  /** returns t iff OBJECT is of the form <ternary operator> <sentence> <sentence> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 14645) 
  public static final SubLObject cycl_ternary_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_ternary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == el_utilities.cyc_const_ternary_logical_op_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(THREE_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        wff.note_wff_violation(list($kw21$ARITY_MISMATCH, object, cycl_formula_predicate(object), $str24$ternary_operator, THREE_INTEGER, el_utilities.formula_arity(object, UNPROVIDED)));
      }
    } else {
      return makeBoolean(((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg3(object, UNPROVIDED)))));
    }
    return NIL;
  }

  
  @SubL(source = "cycl/cycl-grammar.lisp", position = 12920) 
  public static final SubLObject cycl_truth_value_p(SubLObject object) {
    return makeBoolean((($const18$True == object)
          || ($const19$False == object)));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 13124) 
  public static final SubLObject cycl_formula_predicate(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject arg0 = cycl_utilities.formula_arg0(object);
        if (((NIL != $within_quote_form$.getDynamicValue(thread))
             && (NIL != el_utilities.el_formula_p(object))
             && ($const20$EscapeQuote == cycl_utilities.formula_arg0(arg0)))) {
          return cycl_utilities.formula_arg1(arg0, UNPROVIDED);
        } else {
          return arg0;
        }
      }
    }
  }

  /** returns t iff OBJECT is of the form <unary-operator> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 13404) 
  public static final SubLObject cycl_unary_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_unary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == el_utilities.cyc_const_unary_logical_op_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(ONE_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8026");
      }
    } else {
      return cycl_sentence_p(cycl_utilities.formula_arg1(object, UNPROVIDED));
    }
    return NIL;
  }

  /** returns t iff OBJECT is of the form <binary operator> <sentence> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 13990) 
  public static final SubLObject cycl_binary_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_binary_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == el_utilities.cyc_const_binary_logical_op_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(TWO_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8027");
      }
    } else {
      return makeBoolean(((NIL != cycl_sentence_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))
             && (NIL != cycl_sentence_p(cycl_utilities.formula_arg2(object, UNPROVIDED)))));
    }
    return NIL;
  }

  /** returns t iff OBJECT is of the form <variable-arity operator> <sentence sequence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 17005) 
  public static final SubLObject cycl_variable_arity_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_variable_arity_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else {
      return makeBoolean(((NIL != el_utilities.el_formula_p(object))
             && (NIL != el_utilities.cyc_const_variable_arity_logical_op_p(cycl_formula_predicate(object)))
             && (NIL != el_utilities.wf_wrt_sequence_varsP(object))
             && (NIL != cycl_sentence_sequence_p(cycl_utilities.formula_args(object, $kw27$INCLUDE)))));
    }
  }

  /** returns t iff OBJECT is of the form <regular quantifier> <variable> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 18029) 
  public static final SubLObject cycl_regularly_quantified_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_regularly_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == cycl_regular_quantifier_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(TWO_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8031");
      }
    } else if ((NIL == cycl_variable_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8032");
      }
    } else {
      return cycl_sentence_p(cycl_utilities.formula_arg2(object, UNPROVIDED));
    }
    return NIL;
  }

  /** returns t iff OBJECT is of the form <bounded existential> <denotational term> <variable> <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 18863) 
  public static final SubLObject cycl_bounded_existential_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_bounded_existential_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == cycl_bounded_existential_quantifier_p(cycl_formula_predicate(object)))) {
    } else if ((!(el_utilities.formula_arity(object, UNPROVIDED).numE(THREE_INTEGER)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8033");
      }
    } else if ((NIL == cycl_denotational_term_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8034");
      }
    } else if ((NIL == cycl_variable_p(cycl_utilities.formula_arg2(object, UNPROVIDED)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8035");
      }
    } else {
      return cycl_sentence_p(cycl_utilities.formula_arg3(object, UNPROVIDED));
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 19872) 
  public static final SubLObject cycl_logical_operator_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.cyc_const_logical_operator_p(object))
          || (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30706"))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 20174) 
  public static final SubLObject cycl_regular_quantifier_p(SubLObject object) {
    return el_utilities.cyc_const_regular_quantifier_p(object);
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 20283) 
  public static final SubLObject cycl_bounded_existential_quantifier_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.cyc_const_bounded_existential_operator_p(object))
          || (NIL != el_utilities.user_defined_bounded_existential_operator_p(object))));
  }

  /** returns t iff OBJECT is of the form <predicate> <argument sequence>. */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 20472) 
  public static final SubLObject cycl_atomic_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_atomic_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((NIL == cycl_predicate_p(cycl_formula_predicate(object)))) {
    } else if ((NIL == el_utilities.wf_wrt_sequence_varsP(object))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8036");
      }
    } else if ((NIL == cycl_argument_sequence_p(cycl_utilities.formula_args(object, $kw27$INCLUDE)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8037");
      }
    } else if ((NIL == cycl_formula_has_valid_arityP(object))) {
    } else {
      return T;
    }
    return NIL;
  }

  /** returns t iff OBJECT is of the form <epsilon>
                                    or . <variable>
                                    or <term> <argument sequence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 21296) 
  public static final SubLObject cycl_argument_sequence_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.epsilon_p(object))
          || (NIL != cycl_variable_p(object))
          || ((NIL != cycl_term_p(el_utilities.first_in_sequence(object)))
             && (NIL != cycl_argument_sequence_p(el_utilities.rest_of_sequence(object))))));
  }

  /** returns t iff OBJECT is of the form <represented term>
   and not of the form <logical operator> or <quantifier>,
   because predicates are disjoint with logical operators and quantifiers.
   Ensures that OBJECT is a predicate if the grammar uses the KB. */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 21699) 
  public static final SubLObject cycl_predicate_p(SubLObject object) {
    return makeBoolean(((NIL != cycl_represented_term_p(object))
           && (NIL == el_utilities.cyc_const_logical_operator_p(object))
           && (NIL == el_utilities.cyc_const_quantifier_p(object))
           && ((NIL == grammar_uses_kbP())
            || (NIL != el_utilities.predicate_specP(object, $sym35$CYCL_VARIABLE_P)))));
  }

  /** returns t iff OBJECT is of the form <represented term>
   and not of the form <logical operator> or <quantifier>,
   because denotational functions are disjoint with logical operators and quantifiers.
   Ensures that OBJECT is a denotational function if the grammar uses the KB. */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 22224) 
  public static final SubLObject cycl_function_p(SubLObject object) {
    return makeBoolean(((NIL != cycl_represented_term_p(object))
           && (NIL == el_utilities.cyc_const_logical_operator_p(object))
           && (NIL == el_utilities.cyc_const_quantifier_p(object))
           && ((NIL == grammar_uses_kbP())
            || (NIL != el_utilities.function_specP(object, $sym35$CYCL_VARIABLE_P)))));
  }

  /** returns t iff OBJECT is of the form <function> <argument sequence>, or an <HL Non-AtomicTerm> (if HL constructs are permitted) */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 22770) 
  public static final SubLObject cycl_nat_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != nart_handles.nart_p(object)))) {
      return T;
    } else if ((NIL == el_utilities.el_formula_p(object))) {
    } else if ((($const36$Quote == cycl_utilities.formula_arg0(object))
        || ($const37$QuasiQuote == cycl_utilities.formula_arg0(object))
        || ($const20$EscapeQuote == cycl_utilities.formula_arg0(object)))) {
    } else if (($const38$ExpandSubLFn == cycl_utilities.formula_arg0(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30081");
    } else if (($const39$SubLQuoteFn == cycl_utilities.formula_arg0(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30091");
    } else if (($const40$Kappa == cycl_utilities.formula_arg0(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30082");
    } else if (($const41$Lambda == cycl_utilities.formula_arg0(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30083");
    } else if (($const42$SkolemFunctionFn == cycl_utilities.formula_arg0(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30087");
    } else if (($const43$SkolemFuncNFn == cycl_utilities.formula_arg0(object))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30086");
    } else if ((NIL == cycl_function_p(cycl_utilities.formula_arg0(object)))) {
    } else if ((NIL == el_utilities.wf_wrt_sequence_varsP(object))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8038");
      }
    } else if ((NIL == cycl_argument_sequence_p(cycl_utilities.formula_args(object, $kw27$INCLUDE)))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8039");
      }
    } else if ((NIL == cycl_formula_has_valid_arityP(object))) {
    } else {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 24202) 
  public static final SubLObject cycl_formula_has_valid_arityP(SubLObject formula) {
    {
      SubLObject validP = T;
      if ((NIL != grammar_uses_kbP())) {
        if ((NIL != wff.mal_arityP(formula))) {
          validP = NIL;
        }
      }
      return validP;
    }
  }

  /** returns t iff OBJECT is of the form <denotational term>
                                    or <sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 31720) 
  public static final SubLObject cycl_expression_p(SubLObject object) {
    return makeBoolean(((NIL != cycl_denotational_term_p(object))
          || ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30093"))
             && (NIL != escape_quote_syntax_p(object)))
          || (NIL != cycl_sentence_p(object))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 32020) 
  public static final SubLObject cycl_term_p(SubLObject object) {
    return cycl_expression_p(object);
  }

  /** returns t iff OBJECT is of the form <represented term>
                                    or <SubL atomic term> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 32093) 
  public static final SubLObject cycl_denotational_term_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != cycl_represented_term_p(object))
            || (NIL != subl_atomic_term_p(object))
            || (NIL != ((NIL != $grammar_permits_quoted_forms$.getDynamicValue(thread)) ? ((SubLObject) cycl_quoted_term_p(object)) : NIL))));
    }
  }

  /** returns t iff OBJECT is of the form <quote form>
                                    or <quasiquote form> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 32420) 
  public static final SubLObject cycl_quoted_term_p(SubLObject object) {
    return makeBoolean(((NIL != quote_syntax_p(object))
          || (NIL != quasi_quote_syntax_p(object))));
  }

  public static final class $cycl_quoted_term_p$UnaryFunction extends UnaryFunction {
    public $cycl_quoted_term_p$UnaryFunction() { super(extractFunctionNamed("CYCL-QUOTED-TERM-P")); }
    public SubLObject processItem(SubLObject arg1) { return cycl_quoted_term_p(arg1); }
  }

  /** returns t if OBJECT is of form (#$Quote <something>) or (#$QuasiQuote <something>).
   Use this when we know object is syntactically well formed */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 32648) 
  public static final SubLObject fast_cycl_quoted_term_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
           && (($const36$Quote == cycl_utilities.formula_arg0(object))
            || ($const37$QuasiQuote == cycl_utilities.formula_arg0(object)))
           && (NIL != el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 33010) 
  public static final SubLObject fast_quasi_quote_term_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
           && ($const37$QuasiQuote == cycl_utilities.formula_arg0(object))
           && (NIL != el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 33178) 
  public static final SubLObject fast_quote_term_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
           && ($const36$Quote == cycl_utilities.formula_arg0(object))
           && (NIL != el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 33335) 
  public static final SubLObject fast_escape_quote_term_p(SubLObject object) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(object))
           && ($const20$EscapeQuote == cycl_utilities.formula_arg0(object))
           && (NIL != el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 33671) 
  public static final SubLObject quote_syntax_p(SubLObject object) {
    if ((NIL == el_utilities.el_formula_p(object))) {
    } else if (($const36$Quote != cycl_utilities.formula_arg0(object))) {
    } else if ((NIL == el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8061");
      }
    } else if ((NIL == Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30084"))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8062");
      }
    } else {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 34160) 
  public static final SubLObject quasi_quote_syntax_p(SubLObject object) {
    if ((NIL == el_utilities.el_formula_p(object))) {
    } else if (($const37$QuasiQuote != cycl_utilities.formula_arg0(object))) {
    } else if ((NIL == el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8063");
      }
    } else if ((NIL == Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30085"))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8064");
      }
    } else {
      return T;
    }
    return NIL;
  }

  public static final class $quasi_quote_syntax_p$UnaryFunction extends UnaryFunction {
    public $quasi_quote_syntax_p$UnaryFunction() { super(extractFunctionNamed("QUASI-QUOTE-SYNTAX-P")); }
    public SubLObject processItem(SubLObject arg1) { return quasi_quote_syntax_p(arg1); }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 34910) 
  public static final SubLObject escape_quote_syntax_p(SubLObject object) {
    if ((NIL == el_utilities.el_formula_p(object))) {
    } else if (($const20$EscapeQuote != cycl_utilities.formula_arg0(object))) {
    } else if ((NIL == el_utilities.formula_arityE(object, ONE_INTEGER, UNPROVIDED))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8065");
      }
    } else if ((!(((NIL != cycl_expression_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))
          || (NIL != cycl_quoted_term_p(cycl_utilities.formula_arg1(object, UNPROVIDED)))
          || (NIL != escape_quote_syntax_p(cycl_utilities.formula_arg1(object, UNPROVIDED))))))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8066");
      }
    } else {
      return T;
    }
    return NIL;
  }

  public static final class $escape_quote_syntax_p$UnaryFunction extends UnaryFunction {
    public $escape_quote_syntax_p$UnaryFunction() { super(extractFunctionNamed("ESCAPE-QUOTE-SYNTAX-P")); }
    public SubLObject processItem(SubLObject arg1) { return escape_quote_syntax_p(arg1); }
  }

  /** returns t iff OBJECT is of the form <constant>
                                    or <nat>
                                    or <variable> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 35640) 
  public static final SubLObject cycl_represented_term_p(SubLObject object) {
    return makeBoolean(((NIL != cycl_constant_p(object))
          || (NIL != cycl_nat_p(object))
          || (NIL != cycl_variable_p(object))));
  }

  /** returns t iff OBJECT is of the form <string>
                                    or <number> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 35930) 
  public static final SubLObject cycl_unrepresented_term_p(SubLObject object) {
    return makeBoolean(((NIL != subl_string_p(object))
          || (NIL != subl_real_number_p(object))));
  }

  /** returns t iff OBJECT is of the form <SubL strict atomic term>
                                    or <list> if lists are permitted as a terminal */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 36149) 
  public static final SubLObject subl_atomic_term_p(SubLObject object) {
    return makeBoolean(((NIL != subl_strict_atomic_term_p(object))
          || ((NIL != grammar_permits_list_as_terminalP())
             && object.isCons())));
  }

  /** returns t iff OBJECT is of the form <string>
                                    or <number>
                                    or <symbol> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 36455) 
  public static final SubLObject subl_strict_atomic_term_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != cycl_unrepresented_term_p(object))
            || (NIL != ((NIL != $grammar_permits_symbol_as_terminalP$.getDynamicValue(thread)) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30090")) : NIL))));
    }
  }

  /** returns t iff OBJECT is of the form <regularly quantified sentence>
                                    or <bounded existential sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 37699) 
  public static final SubLObject cycl_quantified_sentence_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_quantified_sentence_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else {
      return makeBoolean(((NIL != cycl_regularly_quantified_sentence_p(object))
            || (NIL != cycl_bounded_existential_sentence_p(object))));
    }
  }

  /** returns t iff OBJECT is of the form <atomic sentence>
                                    or <not> <atomic sentence> */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 38258) 
  public static final SubLObject cycl_literal_p(SubLObject object) {
    if (((NIL != grammar_permits_hlP())
         && (NIL != assertion_handles.assertion_p(object)))) {
      return cycl_literal_p(cycl_utilities.careful_hl_term_to_el_term(object));
    } else {
      return makeBoolean(((NIL != cycl_atomic_sentence_p(object))
            || ((NIL != el_utilities.el_formula_p(object))
               && (NIL != el_utilities.el_negation_p(object))
               && (NIL != cycl_atomic_sentence_p(cycl_utilities.formula_arg1(object, UNPROVIDED))))));
    }
  }

  /** returns t iff OBJ is of the form (<generalized tense operator> <atomic sentence>) or is a negated generalized tensed literal. */
  @SubL(source = "cycl/cycl-grammar.lisp", position = 38992) 
  public static final SubLObject cycl_generalized_tensed_literal_p(SubLObject obj) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(obj))
           && (NIL != el_utilities.cyc_const_generalized_tense_operator_p(el_utilities.literal_predicate(obj, UNPROVIDED)))
           && (NIL != cycl_literal_p(obj))));
  }

  public static final class $cycl_generalized_tensed_literal_p$UnaryFunction extends UnaryFunction {
    public $cycl_generalized_tensed_literal_p$UnaryFunction() { super(extractFunctionNamed("CYCL-GENERALIZED-TENSED-LITERAL-P")); }
    public SubLObject processItem(SubLObject arg1) { return cycl_generalized_tensed_literal_p(arg1); }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 41696) 
  public static final SubLObject cycl_constant_p(SubLObject object) {
    return constant_handles.constant_p(object);
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 41841) 
  public static final SubLObject subl_string_p(SubLObject object) {
    if ((!(object.isString()))) {
    } else if ((NIL != grammar_permits_non_ascii_stringsP())) {
      return T;
    } else if ((NIL == unicode_strings.ascii_string_p(object))) {
      if ((NIL != wff.note_wff_violationP())) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8067");
      }
    } else {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 42090) 
  public static final SubLObject subl_real_number_p(SubLObject object) {
    return makeBoolean(((NIL != subl_integer_p(object))
          || (NIL != subl_float_p(object))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 42200) 
  public static final SubLObject subl_float_p(SubLObject object) {
    return makeBoolean((object.isNumber()
           && (NIL == subl_integer_p(object))));
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 42308) 
  public static final SubLObject subl_integer_p(SubLObject object) {
    return Types.integerp(object);
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 42652) 
  public static final SubLObject cycl_variable_p(SubLObject object) {
    return makeBoolean(((NIL != el_variable_p(object))
          || (NIL != meta_variable_p(object))
          || ((NIL != grammar_permits_hlP())
             && (NIL != hl_variable_p(object)))));
  }

  public static final class $cycl_variable_p$UnaryFunction extends UnaryFunction {
    public $cycl_variable_p$UnaryFunction() { super(extractFunctionNamed("CYCL-VARIABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return cycl_variable_p(arg1); }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 42912) 
  public static final SubLObject meta_variable_p(SubLObject object) {
    return cycl_variables.keyword_varP(object);
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 43021) 
  public static final SubLObject el_variable_p(SubLObject object) {
    return cycl_variables.el_varP(object);
  }

  public static final class $el_variable_p$UnaryFunction extends UnaryFunction {
    public $el_variable_p$UnaryFunction() { super(extractFunctionNamed("EL-VARIABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return el_variable_p(arg1); }
  }

  @SubL(source = "cycl/cycl-grammar.lisp", position = 43086) 
  public static final SubLObject hl_variable_p(SubLObject object) {
    return variables.variable_p(object);
  }

  public static final class $hl_variable_p$UnaryFunction extends UnaryFunction {
    public $hl_variable_p$UnaryFunction() { super(extractFunctionNamed("HL-VARIABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return hl_variable_p(arg1); }
  }

  public static final SubLObject declare_cycl_grammar_file() {
    declareFunction(myName, "grammar_permits_hlP", "GRAMMAR-PERMITS-HL?", 0, 0, false);
    declareFunction(myName, "grammar_permits_list_as_terminalP", "GRAMMAR-PERMITS-LIST-AS-TERMINAL?", 0, 0, false);
    declareFunction(myName, "grammar_permits_non_ascii_stringsP", "GRAMMAR-PERMITS-NON-ASCII-STRINGS?", 0, 0, false);
    declareFunction(myName, "grammar_permissive_wrt_variablesP", "GRAMMAR-PERMISSIVE-WRT-VARIABLES?", 0, 0, false);
    declareFunction(myName, "grammar_uses_kbP", "GRAMMAR-USES-KB?", 0, 0, false);
    declareFunction(myName, "within_quote_formP", "WITHIN-QUOTE-FORM?", 0, 0, false);
    declareMacro(myName, "without_grammar_admitting_hl", "WITHOUT-GRAMMAR-ADMITTING-HL");
    declareMacro(myName, "with_grammar_admitting_hl", "WITH-GRAMMAR-ADMITTING-HL");
    declareMacro(myName, "without_grammar_using_kb", "WITHOUT-GRAMMAR-USING-KB");
    declareMacro(myName, "with_grammar_using_kb", "WITH-GRAMMAR-USING-KB");
    declareMacro(myName, "gather_syntax_violations", "GATHER-SYNTAX-VIOLATIONS");
    declareMacro(myName, "dont_gather_syntax_violations", "DONT-GATHER-SYNTAX-VIOLATIONS");
    declareMacro(myName, "handle_syntax_violation", "HANDLE-SYNTAX-VIOLATION");
    declareMacro(myName, "within_quote_form", "WITHIN-QUOTE-FORM");
    declareMacro(myName, "allow_escape_quote_when_quote_predicate", "ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
    declareFunction(myName, "cycl_sentence_p", "CYCL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_formulaic_sentence_p", "CYCL-FORMULAIC-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_sentence_sequence_p", "CYCL-SENTENCE-SEQUENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_truth_value_p", "CYCL-TRUTH-VALUE-P", 1, 0, false);
    declareFunction(myName, "cycl_formula_predicate", "CYCL-FORMULA-PREDICATE", 1, 0, false);
    declareFunction(myName, "cycl_unary_sentence_p", "CYCL-UNARY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_binary_sentence_p", "CYCL-BINARY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_ternary_sentence_p", "CYCL-TERNARY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_quaternary_sentence_p", "CYCL-QUATERNARY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_quintary_sentence_p", "CYCL-QUINTARY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_variable_arity_sentence_p", "CYCL-VARIABLE-ARITY-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_user_defined_logical_operator_sentence_p", "CYCL-USER-DEFINED-LOGICAL-OPERATOR-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_regularly_quantified_sentence_p", "CYCL-REGULARLY-QUANTIFIED-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_bounded_existential_sentence_p", "CYCL-BOUNDED-EXISTENTIAL-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_logical_operator_p", "CYCL-LOGICAL-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "cycl_quantifier_p", "CYCL-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "cycl_regular_quantifier_p", "CYCL-REGULAR-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "cycl_bounded_existential_quantifier_p", "CYCL-BOUNDED-EXISTENTIAL-QUANTIFIER-P", 1, 0, false);
    declareFunction(myName, "cycl_atomic_sentence_p", "CYCL-ATOMIC-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_argument_sequence_p", "CYCL-ARGUMENT-SEQUENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_predicate_p", "CYCL-PREDICATE-P", 1, 0, false);
    declareFunction(myName, "cycl_function_p", "CYCL-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "cycl_nat_p", "CYCL-NAT-P", 1, 0, false);
    declareFunction(myName, "cycl_formula_has_valid_arityP", "CYCL-FORMULA-HAS-VALID-ARITY?", 1, 0, false);
    declareFunction(myName, "expand_subl_fn_syntax_p", "EXPAND-SUBL-FN-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "expand_subl_fn_syntax_p_int", "EXPAND-SUBL-FN-SYNTAX-P-INT", 1, 0, false);
    declareFunction(myName, "subl_quote_fn_syntax_p", "SUBL-QUOTE-FN-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "kappa_syntax_p", "KAPPA-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "lambda_syntax_p", "LAMBDA-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "skolem_function_fn_syntax_p", "SKOLEM-FUNCTION-FN-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "skolem_func_n_fn_syntax_p", "SKOLEM-FUNC-N-FN-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "cycl_variable_sequence_p", "CYCL-VARIABLE-SEQUENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_term_sequence_p", "CYCL-TERM-SEQUENCE-P", 1, 0, false);
    declareFunction(myName, "subl_expression_syntax_p", "SUBL-EXPRESSION-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "cycl_expression_p", "CYCL-EXPRESSION-P", 1, 0, false);
    declareFunction(myName, "cycl_term_p", "CYCL-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_denotational_term_p", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_quoted_term_p", "CYCL-QUOTED-TERM-P", 1, 0, false); new $cycl_quoted_term_p$UnaryFunction();
    declareFunction(myName, "fast_cycl_quoted_term_p", "FAST-CYCL-QUOTED-TERM-P", 1, 0, false);
    declareFunction(myName, "fast_quasi_quote_term_p", "FAST-QUASI-QUOTE-TERM-P", 1, 0, false);
    declareFunction(myName, "fast_quote_term_p", "FAST-QUOTE-TERM-P", 1, 0, false);
    declareFunction(myName, "fast_escape_quote_term_p", "FAST-ESCAPE-QUOTE-TERM-P", 1, 0, false);
    declareFunction(myName, "quiet_quote_syntax_p", "QUIET-QUOTE-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "quote_syntax_p", "QUOTE-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "quasi_quote_syntax_p", "QUASI-QUOTE-SYNTAX-P", 1, 0, false); new $quasi_quote_syntax_p$UnaryFunction();
    declareFunction(myName, "quote_arg1_syntax_p", "QUOTE-ARG1-SYNTAX-P", 1, 0, false);
    declareFunction(myName, "escape_quote_syntax_p", "ESCAPE-QUOTE-SYNTAX-P", 1, 0, false); new $escape_quote_syntax_p$UnaryFunction();
    declareFunction(myName, "cycl_constant_or_nat_p", "CYCL-CONSTANT-OR-NAT-P", 1, 0, false);
    declareFunction(myName, "cycl_represented_term_p", "CYCL-REPRESENTED-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_unrepresented_term_p", "CYCL-UNREPRESENTED-TERM-P", 1, 0, false);
    declareFunction(myName, "subl_atomic_term_p", "SUBL-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "subl_strict_atomic_term_p", "SUBL-STRICT-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_fort_p", "CYCL-FORT-P", 1, 0, false);
    declareFunction(myName, "cycl_nart_p", "CYCL-NART-P", 1, 0, false);
    declareFunction(myName, "cycl_naut_p", "CYCL-NAUT-P", 1, 0, false);
    declareFunction(myName, "cycl_quantified_sentence_p", "CYCL-QUANTIFIED-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_formula_p", "CYCL-FORMULA-P", 1, 0, false);
    declareFunction(myName, "cycl_literal_p", "CYCL-LITERAL-P", 1, 0, false);
    declareFunction(myName, "cycl_tensed_literal_p", "CYCL-TENSED-LITERAL-P", 1, 0, false);
    declareFunction(myName, "cycl_generalized_tensed_literal_p", "CYCL-GENERALIZED-TENSED-LITERAL-P", 1, 0, false); new $cycl_generalized_tensed_literal_p$UnaryFunction();
    declareFunction(myName, "cycl_strict_term_p", "CYCL-STRICT-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_strict_denotational_term_p", "CYCL-STRICT-DENOTATIONAL-TERM-P", 1, 0, false);
    declareFunction(myName, "proposed_el_formula_p", "PROPOSED-EL-FORMULA-P", 1, 0, false);
    declareFunction(myName, "cycl_boolean_sentence_p", "CYCL-BOOLEAN-SENTENCE-P", 1, 0, false);
    declareFunction(myName, "cycl_boolean_combination_of_type", "CYCL-BOOLEAN-COMBINATION-OF-TYPE", 2, 0, false);
    declareFunction(myName, "cycl_constant_p", "CYCL-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "subl_string_p", "SUBL-STRING-P", 1, 0, false);
    declareFunction(myName, "subl_real_number_p", "SUBL-REAL-NUMBER-P", 1, 0, false);
    declareFunction(myName, "subl_float_p", "SUBL-FLOAT-P", 1, 0, false);
    declareFunction(myName, "subl_integer_p", "SUBL-INTEGER-P", 1, 0, false);
    declareFunction(myName, "subl_non_variable_symbol_p", "SUBL-NON-VARIABLE-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "subl_non_variable_non_keyword_symbol_p", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "cycl_variable_p", "CYCL-VARIABLE-P", 1, 0, false); new $cycl_variable_p$UnaryFunction();
    declareFunction(myName, "meta_variable_p", "META-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "el_variable_p", "EL-VARIABLE-P", 1, 0, false); new $el_variable_p$UnaryFunction();
    declareFunction(myName, "hl_variable_p", "HL-VARIABLE-P", 1, 0, false); new $hl_variable_p$UnaryFunction();
    declareFunction(myName, "el_var_list_operator_p", "EL-VAR-LIST-OPERATOR-P", 1, 0, false);
    declareFunction(myName, "why_not_cycl_sentence", "WHY-NOT-CYCL-SENTENCE", 1, 0, false);
    declareFunction(myName, "why_not_cycl_expression", "WHY-NOT-CYCL-EXPRESSION", 1, 0, false);
    declareFunction(myName, "why_not_cycl_term", "WHY-NOT-CYCL-TERM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cycl_grammar_file() {
    $grammar_permits_hlP$ = defvar("*GRAMMAR-PERMITS-HL?*", T);
    $grammar_uses_kbP$ = defvar("*GRAMMAR-USES-KB?*", T);
    $grammar_permits_list_as_terminalP$ = defparameter("*GRAMMAR-PERMITS-LIST-AS-TERMINAL?*", NIL);
    $grammar_permits_symbol_as_terminalP$ = defparameter("*GRAMMAR-PERMITS-SYMBOL-AS-TERMINAL?*", NIL);
    $grammar_permits_non_ascii_stringsP$ = defparameter("*GRAMMAR-PERMITS-NON-ASCII-STRINGS?*", NIL);
    $grammar_permissive_wrt_variablesP$ = defparameter("*GRAMMAR-PERMISSIVE-WRT-VARIABLES?*", T);
    $grammar_permits_quoted_forms$ = defparameter("*GRAMMAR-PERMITS-QUOTED-FORMS*", T);
    $within_quote_form$ = defvar("*WITHIN-QUOTE-FORM*", NIL);
    return NIL;
  }

  public static final SubLObject setup_cycl_grammar_file() {
    // CVS_ID("Id: cycl-grammar.lisp 126866 2009-01-20 19:11:18Z pace ");
    utilities_macros.register_kb_function($sym63$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), NIL));
  public static final SubLList $list2 = list(list(makeSymbol("*GRAMMAR-PERMITS-HL?*"), T));
  public static final SubLList $list3 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), NIL));
  public static final SubLList $list4 = list(list(makeSymbol("*GRAMMAR-USES-KB?*"), T));
  public static final SubLList $list5 = list(list(makeSymbol("*WFF-VIOLATIONS*"), NIL), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));
  public static final SubLList $list6 = list(list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), NIL), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), NIL));
  public static final SubLList $list7 = list(makeSymbol("VIOLATION"));
  public static final SubLSymbol $sym8$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list9 = list(makeSymbol("NOTE-WFF-VIOLATION?"));
  public static final SubLSymbol $sym10$NOTE_WFF_VIOLATION = makeSymbol("NOTE-WFF-VIOLATION");
  public static final SubLList $list11 = list(list(makeSymbol("*WITHIN-QUOTE-FORM*"), T));
  public static final SubLList $list12 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym13$PIF = makeSymbol("PIF");
  public static final SubLList $list14 = list(constant_handles.reader_make_constant_shell(makeString("Quote")));
  public static final SubLSymbol $sym15$WITHIN_QUOTE_FORM = makeSymbol("WITHIN-QUOTE-FORM");
  public static final SubLSymbol $kw16$NOT_A_TRUTH_FUNCTION = makeKeyword("NOT-A-TRUTH-FUNCTION");
  public static final SubLSymbol $kw17$NOT_AN_EL_FORMULA = makeKeyword("NOT-AN-EL-FORMULA");
  public static final SubLObject $const18$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const19$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLObject $const20$EscapeQuote = constant_handles.reader_make_constant_shell(makeString("EscapeQuote"));
  public static final SubLSymbol $kw21$ARITY_MISMATCH = makeKeyword("ARITY-MISMATCH");
  public static final SubLString $str22$unary_operator = makeString("unary operator");
  public static final SubLString $str23$binary_operator = makeString("binary operator");
  public static final SubLString $str24$ternary_operator = makeString("ternary operator");
  public static final SubLString $str25$quaternary_operator = makeString("quaternary operator");
  public static final SubLString $str26$quintary_operator = makeString("quintary operator");
  public static final SubLSymbol $kw27$INCLUDE = makeKeyword("INCLUDE");
  public static final SubLString $str28$regular_quantifier = makeString("regular quantifier");
  public static final SubLSymbol $kw29$NOT_AN_EL_VARIABLE = makeKeyword("NOT-AN-EL-VARIABLE");
  public static final SubLString $str30$bounded_existential = makeString("bounded existential");
  public static final SubLSymbol $kw31$NOT_A_DENOTATIONAL_TERM = makeKeyword("NOT-A-DENOTATIONAL-TERM");
  public static final SubLSymbol $kw32$SEQUENCE_NON_VAR = makeKeyword("SEQUENCE-NON-VAR");
  public static final SubLSymbol $kw33$MALFORMED_ARGS = makeKeyword("MALFORMED-ARGS");
  public static final SubLString $str34$predicate = makeString("predicate");
  public static final SubLSymbol $sym35$CYCL_VARIABLE_P = makeSymbol("CYCL-VARIABLE-P");
  public static final SubLObject $const36$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLObject $const37$QuasiQuote = constant_handles.reader_make_constant_shell(makeString("QuasiQuote"));
  public static final SubLObject $const38$ExpandSubLFn = constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn"));
  public static final SubLObject $const39$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));
  public static final SubLObject $const40$Kappa = constant_handles.reader_make_constant_shell(makeString("Kappa"));
  public static final SubLObject $const41$Lambda = constant_handles.reader_make_constant_shell(makeString("Lambda"));
  public static final SubLObject $const42$SkolemFunctionFn = constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn"));
  public static final SubLObject $const43$SkolemFuncNFn = constant_handles.reader_make_constant_shell(makeString("SkolemFuncNFn"));
  public static final SubLString $str44$functor = makeString("functor");
  public static final SubLString $str45$__ExpandSubLFn_expression = makeString("#$ExpandSubLFn expression");
  public static final SubLString $str46$reserved_constant = makeString("reserved constant");
  public static final SubLSymbol $sym47$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLList $list48 = list(NIL);
  public static final SubLSymbol $kw49$EXPAND_SUBL_FN_IRRELEVANT_TERM_IN_ARG1 = makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");
  public static final SubLString $str50$__SubLQuoteFn_expression = makeString("#$SubLQuoteFn expression");
  public static final SubLString $str51$__Kappa_expression = makeString("#$Kappa expression");
  public static final SubLString $str52$__Lambda_expression = makeString("#$Lambda expression");
  public static final SubLString $str53$__SkolemFunctionFn_expression = makeString("#$SkolemFunctionFn expression");
  public static final SubLString $str54$__SkolemFuncNFn_expression = makeString("#$SkolemFuncNFn expression");
  public static final SubLString $str55$__Quote_expression = makeString("#$Quote expression");
  public static final SubLString $str56$__QuasiQuote_expression = makeString("#$QuasiQuote expression");
  public static final SubLString $str57$__EscapeQuote_expression = makeString("#$EscapeQuote expression");
  public static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const59$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym60$CYCL_BOOLEAN_SENTENCE_P = makeSymbol("CYCL-BOOLEAN-SENTENCE-P");
  public static final SubLSymbol $kw61$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLSymbol $kw62$NOT_AN_ASCII_STRING = makeKeyword("NOT-AN-ASCII-STRING");
  public static final SubLSymbol $sym63$SUBL_NON_VARIABLE_NON_KEYWORD_SYMBOL_P = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");

  //// Initializers

  public void declareFunctions() {
    declare_cycl_grammar_file();
  }

  public void initializeVariables() {
    init_cycl_grammar_file();
  }

  public void runTopLevelForms() {
    setup_cycl_grammar_file();
  }

}
