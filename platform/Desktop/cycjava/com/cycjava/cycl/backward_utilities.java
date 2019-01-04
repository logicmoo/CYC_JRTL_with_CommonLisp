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
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.variables;

public  final class backward_utilities extends SubLTranslatedFile {

  //// Constructor

  private backward_utilities() {}
  public static final SubLFile me = new backward_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.backward_utilities";

  //// Definitions

  /** The overhead of doing any recursive ask. */
  @SubL(source = "cycl/backward-utilities.lisp", position = 756) 
  public static SubLSymbol $inference_recursive_query_overhead$ = null;

  @SubL(source = "cycl/backward-utilities.lisp", position = 865) 
  public static final SubLObject rule_relevant_to_proof(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL == control_vars.$proof_checking_enabled$.getDynamicValue(thread))
            || (NIL != conses_high.member(assertion, control_vars.$proof_checker_rules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))));
    }
  }

  @SubL(source = "cycl/backward-utilities.lisp", position = 1088) 
  private static SubLSymbol $directions_for_forward_inference$ = null;

  @SubL(source = "cycl/backward-utilities.lisp", position = 1268) 
  private static SubLSymbol $directions_for_backward_inference$ = null;

  @SubL(source = "cycl/backward-utilities.lisp", position = 1356) 
  public static final SubLObject relevant_directions() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != kb_control_vars.within_forward_inferenceP())
           && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread)))) {
        return $directions_for_forward_inference$.getGlobalValue();
      }
      return $directions_for_backward_inference$.getGlobalValue();
    }
  }

  @SubL(source = "cycl/backward-utilities.lisp", position = 1646) 
  public static final SubLObject direction_is_relevant(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(assertion, $sym2$ASSERTION_P);
      {
        SubLObject direction = assertions_high.assertion_direction(assertion);
        if (((NIL != kb_control_vars.within_forward_inferenceP())
             && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread)))) {
          return conses_high.member(direction, $directions_for_forward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
        return conses_high.member(direction, $directions_for_backward_inference$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
      }
    }
  }

  /** Check for variables mentioned in LITERAL but not also mentioned in DEPENDENT-DNF.
   For such variables, compute their type constraints implied by their originating
   SUPPORT, or #$Thing if the arg-type code yields no type constraints. */
  @SubL(source = "cycl/backward-utilities.lisp", position = 2426) 
  public static final SubLObject additional_source_variable_pos_lits(SubLObject literal, SubLObject dependent_dnf, SubLObject support) {
    {
      SubLObject literal_vars = list_utilities.tree_gather(literal, Symbols.symbol_function($sym3$VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject unintroduced_literal_vars = NIL;
      if ((NIL == literal_vars)) {
        return NIL;
      }
      {
        SubLObject cdolist_list_var = literal_vars;
        SubLObject literal_var = NIL;
        for (literal_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal_var = cdolist_list_var.first()) {
          if ((NIL == list_utilities.tree_find(literal_var, dependent_dnf, UNPROVIDED, UNPROVIDED))) {
            unintroduced_literal_vars = cons(literal_var, unintroduced_literal_vars);
          }
        }
      }
      if ((NIL == unintroduced_literal_vars)) {
        return NIL;
      }
      {
        SubLObject support_cnf = NIL;
        SubLObject additional_pos_lits = NIL;
        if ((NIL != assertion_handles.assertion_p(support))) {
          {
            SubLObject cnf = assertions_high.assertion_cnf(support);
            support_cnf = ((NIL != clause_utilities.neg_atomic_clause_p(cnf)) ? ((SubLObject) clause_utilities.make_gaf_cnf(clauses.neg_lits(cnf).first())) : cnf);
          }
        } else {
          support_cnf = clause_utilities.make_gaf_cnf(literal);
        }
        {
          SubLObject cdolist_list_var = unintroduced_literal_vars;
          SubLObject unintroduced_literal_var = NIL;
          for (unintroduced_literal_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), unintroduced_literal_var = cdolist_list_var.first()) {
            if ((NIL != list_utilities.tree_find(unintroduced_literal_var, support_cnf, UNPROVIDED, UNPROVIDED))) {
              {
                SubLObject some_additional_pos_lits = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30346");
                additional_pos_lits = ConsesLow.nconc(some_additional_pos_lits, additional_pos_lits);
              }
            }
          }
        }
        return Sequences.nreverse(additional_pos_lits);
      }
    }
  }

  @SubL(source = "cycl/backward-utilities.lisp", position = 6504) 
  public static final SubLObject inference_canonicalize_hl_support_asent(SubLObject asent) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      if ((NIL == inference_trampolines.inference_commutative_relationP(predicate))) {
        return asent;
      }
      return inference_make_commutative_asent(predicate, cycl_utilities.atomic_sentence_args(asent, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/backward-utilities.lisp", position = 7014) 
  public static final SubLObject inference_make_commutative_asent(SubLObject predicate, SubLObject args) {
    checkType(args, $sym11$LISTP);
    args = inference_canonicalize_commutative_args(args);
    return reader.bq_cons(predicate, ConsesLow.append(args, NIL));
  }

  @SubL(source = "cycl/backward-utilities.lisp", position = 7201) 
  public static final SubLObject inference_canonicalize_commutative_args(SubLObject args) {
    checkType(args, $sym11$LISTP);
    return kb_utilities.sort_terms(args, T, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/backward-utilities.lisp", position = 7328) 
  public static final SubLObject inference_canonicalize_hl_support_literal(SubLObject asent) {
    return inference_canonicalize_hl_support_asent(asent);
  }

  public static final SubLObject declare_backward_utilities_file() {
    declareFunction(myName, "rule_relevant_to_proof", "RULE-RELEVANT-TO-PROOF", 1, 0, false);
    declareFunction(myName, "relevant_directions", "RELEVANT-DIRECTIONS", 0, 0, false);
    declareFunction(myName, "direction_is_relevant", "DIRECTION-IS-RELEVANT", 1, 0, false);
    declareFunction(myName, "duplicate_literal_cleanup", "DUPLICATE-LITERAL-CLEANUP", 1, 1, false);
    declareFunction(myName, "additional_source_variable_pos_lits", "ADDITIONAL-SOURCE-VARIABLE-POS-LITS", 3, 0, false);
    declareFunction(myName, "constraint_sentences_for_transformation_variable", "CONSTRAINT-SENTENCES-FOR-TRANSFORMATION-VARIABLE", 2, 0, false);
    declareFunction(myName, "inference_backchain_impossible", "INFERENCE-BACKCHAIN-IMPOSSIBLE", 3, 0, false);
    declareFunction(myName, "transformation_backchain_for_predicateP", "TRANSFORMATION-BACKCHAIN-FOR-PREDICATE?", 1, 0, false);
    declareFunction(myName, "inference_canonicalize_hl_support_asent", "INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT", 1, 0, false);
    declareFunction(myName, "inference_make_commutative_asent", "INFERENCE-MAKE-COMMUTATIVE-ASENT", 2, 0, false);
    declareFunction(myName, "inference_canonicalize_commutative_args", "INFERENCE-CANONICALIZE-COMMUTATIVE-ARGS", 1, 0, false);
    declareFunction(myName, "inference_canonicalize_hl_support_literal", "INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL", 1, 0, false);
    declareFunction(myName, "inference_make_commutative_literal", "INFERENCE-MAKE-COMMUTATIVE-LITERAL", 2, 0, false);
    declareFunction(myName, "inference_term_free_variables", "INFERENCE-TERM-FREE-VARIABLES", 1, 0, false);
    declareFunction(myName, "inference_literal_free_variables", "INFERENCE-LITERAL-FREE-VARIABLES", 1, 0, false);
    declareFunction(myName, "inference_clause_free_variables", "INFERENCE-CLAUSE-FREE-VARIABLES", 1, 0, false);
    declareFunction(myName, "temp_term_free_variables", "TEMP-TERM-FREE-VARIABLES", 1, 1, false);
    declareFunction(myName, "inference_closed_termP", "INFERENCE-CLOSED-TERM?", 1, 0, false);
    declareFunction(myName, "inference_closed_literalP", "INFERENCE-CLOSED-LITERAL?", 1, 0, false);
    declareFunction(myName, "inference_closed_clauseP", "INFERENCE-CLOSED-CLAUSE?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_backward_utilities_file() {
    $inference_recursive_query_overhead$ = defparameter("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*", TWENTY_INTEGER);
    $directions_for_forward_inference$ = deflexical("*DIRECTIONS-FOR-FORWARD-INFERENCE*", $list0);
    $directions_for_backward_inference$ = deflexical("*DIRECTIONS-FOR-BACKWARD-INFERENCE*", $list1);
    return NIL;
  }

  public static final SubLObject setup_backward_utilities_file() {
    // CVS_ID("Id: backward-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.define_obsolete_register($sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL, $list13);
    access_macros.define_obsolete_register($sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL, $list15);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("FORWARD"));
  public static final SubLList $list1 = list(makeKeyword("BACKWARD"), makeKeyword("FORWARD"));
  public static final SubLSymbol $sym2$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym3$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLObject $const4$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const5$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const6$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLList $list7 = list(constant_handles.reader_make_constant_shell(makeString("Thing")));
  public static final SubLObject $const8$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLSymbol $kw9$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw10$POS = makeKeyword("POS");
  public static final SubLSymbol $sym11$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym12$INFERENCE_CANONICALIZE_HL_SUPPORT_LITERAL = makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-LITERAL");
  public static final SubLList $list13 = list(makeSymbol("INFERENCE-CANONICALIZE-HL-SUPPORT-ASENT"));
  public static final SubLSymbol $sym14$INFERENCE_MAKE_COMMUTATIVE_LITERAL = makeSymbol("INFERENCE-MAKE-COMMUTATIVE-LITERAL");
  public static final SubLList $list15 = list(makeSymbol("INFERENCE-MAKE-COMMUTATIVE-ASENT"));
  public static final SubLSymbol $sym16$CYC_VAR_ = makeSymbol("CYC-VAR?");

  //// Initializers

  public void declareFunctions() {
    declare_backward_utilities_file();
  }

  public void initializeVariables() {
    init_backward_utilities_file();
  }

  public void runTopLevelForms() {
    setup_backward_utilities_file();
  }

}
