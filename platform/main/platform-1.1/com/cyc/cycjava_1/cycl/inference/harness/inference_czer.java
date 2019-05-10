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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class inference_czer extends SubLTranslatedFile {

  //// Constructor

  private inference_czer() {}
  public static final SubLFile me = new inference_czer();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_czer";

  //// Definitions

  /** Whether the inference czer sorts in a principled way.  This entails treating
   variables as opaque tokens. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 1315)
  private static SubLSymbol $inference_sort_principledP$ = null;

  /** Used every time a new problem is about to be created. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 1482)
  public static final SubLObject canonicalize_problem_query(SubLObject query) {
    query = conses_high.copy_tree(query);
    {
      SubLObject simplified_query = inference_simplify_problem_query(query);
      SubLObject sorted_query = inference_sort_clauses_and_literals(simplified_query);
      SubLObject reduced_literals_query = inference_delete_duplicate_literals(sorted_query);
      SubLObject reduced_clauses_query = inference_delete_duplicate_clauses(reduced_literals_query);
      return contiguize_hl_vars_in_clauses(reduced_clauses_query);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 2265)
  public static final SubLObject inference_delete_duplicate_literals(SubLObject contextualized_dnf_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject any_reducedP = NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = NIL;
        for (contextualized_dnf_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_dnf_clause = cdolist_list_var.first()) {
          {
            SubLObject literals = clauses.neg_lits(contextualized_dnf_clause);
            if ((!(((NIL == literals)
                  || (NIL != list_utilities.singletonP(literals)))))) {
              thread.resetMultipleValues();
              {
                SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32152");
                if ((NIL != reducedP)) {
                  any_reducedP = T;
                }
              }
            }
          }
          {
            SubLObject literals = clauses.pos_lits(contextualized_dnf_clause);
            if ((!(((NIL == literals)
                  || (NIL != list_utilities.singletonP(literals)))))) {
              thread.resetMultipleValues();
              {
                SubLObject reduced_literals = delete_duplicate_sorted_literals(literals);
                SubLObject reducedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                clauses.set_clause_pos_lits(contextualized_dnf_clause, reduced_literals);
                if ((NIL != reducedP)) {
                  any_reducedP = T;
                }
              }
            }
          }
        }
        if ((NIL != any_reducedP)) {
          contextualized_dnf_clauses = inference_sort_clauses_and_literals(contextualized_dnf_clauses);
        }
        return contextualized_dnf_clauses;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 3387)
  public static final SubLObject inference_delete_duplicate_clauses(SubLObject contextualized_dnf_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != list_utilities.singletonP(contextualized_dnf_clauses))) {
        return contextualized_dnf_clauses;
      }
      thread.resetMultipleValues();
      {
        SubLObject reduced_clauses = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35646");
        SubLObject reducedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != reducedP)) {
          reduced_clauses = inference_sort_clauses_and_literals(reduced_clauses);
        }
        return reduced_clauses;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 3918)
  public static final SubLObject delete_duplicate_sorted_literals(SubLObject literals) {
    {
      SubLObject literal_count = Sequences.length(literals);
      SubLObject reduced_literals = list_utilities.delete_duplicates_sorted(literals, Symbols.symbol_function(EQUAL));
      SubLObject reduced_literal_count = Sequences.length(reduced_literals);
      SubLObject reducedP = Numbers.numL(reduced_literal_count, literal_count);
      return Values.values(reduced_literals, reducedP);
    }
  }

  /** Destructive. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 4561)
  public static final SubLObject inference_simplify_problem_query(SubLObject contextualized_dnf_clauses) {
    {
      SubLObject cdolist_list_var = contextualized_dnf_clauses;
      SubLObject contextualized_dnf_clause = NIL;
      for (contextualized_dnf_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_dnf_clause = cdolist_list_var.first()) {
        inference_simplify_contextualized_dnf_clause(contextualized_dnf_clause);
      }
    }
    return contextualized_dnf_clauses;
  }

  /** Destructive. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 5728)
  public static final SubLObject inference_simplify_contextualized_dnf_clause(SubLObject contextualized_clause) {
    {
      SubLObject neglits_to_become_poslits = NIL;
      SubLObject rest_neglits = NIL;
      for (rest_neglits = contextualized_neg_lits(contextualized_clause); (!(rest_neglits.isAtom())); rest_neglits = rest_neglits.rest()) {
        {
          SubLObject asent = rest_neglits.first();
          if ((NIL != el_utilities.true_sentence_p(inference_datastructures_problem_query.contextualized_asent_asent(asent)))) {
            neglits_to_become_poslits = cons(asent, neglits_to_become_poslits);
          } else {
            ConsesLow.rplaca(rest_neglits, inference_simplify_contextualized_asent(asent));
          }
        }
      }
      if ((NIL != neglits_to_become_poslits)) {
        {
          SubLObject new_neglits = contextualized_neg_lits(contextualized_clause);
          SubLObject cdolist_list_var = neglits_to_become_poslits;
          SubLObject moving_lit = NIL;
          for (moving_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), moving_lit = cdolist_list_var.first()) {
            new_neglits = Sequences.delete(moving_lit, new_neglits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          }
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32153");
        }
        {
          SubLObject canonicalized_new_poslits = list_utilities.nmapcar($sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE, neglits_to_become_poslits);
          clauses.set_clause_pos_lits(contextualized_clause, ConsesLow.nconc(canonicalized_new_poslits, contextualized_pos_lits(contextualized_clause)));
        }
      }
    }
    {
      SubLObject rest_poslits = NIL;
      for (rest_poslits = contextualized_pos_lits(contextualized_clause); (!(rest_poslits.isAtom())); rest_poslits = rest_poslits.rest()) {
        {
          SubLObject asent = rest_poslits.first();
          ConsesLow.rplaca(rest_poslits, inference_simplify_contextualized_asent(asent));
        }
      }
    }
    return contextualized_clause;
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 8027)
  public static final SubLObject inference_simplify_contextualized_asent(SubLObject contextualized_asent) {
    {
      SubLObject datum = contextualized_asent;
      SubLObject current = datum;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
      asent = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if (((NIL != el_utilities.ist_of_atomic_sentence_p(asent))
             && (NIL != variables.fully_bound_p(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30489"))))) {
          {
            SubLObject subsentence = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30512");
            SubLObject sub_mt = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30490");
            return convert_to_hl_contextualized_asent(subsentence, sub_mt);
          }
        } else if ((NIL != el_utilities.true_sentence_of_atomic_sentence_p(asent))) {
          {
            SubLObject subsentence = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
            return convert_to_hl_contextualized_asent(subsentence, mt);
          }
        } else if ((($const6$elementOf == cycl_utilities.atomic_sentence_predicate(asent))
             && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings($list7, asent)))) {
          {
            SubLObject hl_var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            SubLObject el_var_1 = cycl_utilities.atomic_sentence_arg1(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
            SubLObject isa_asent = cycl_utilities.atomic_sentence_arg2(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED), UNPROVIDED);
            SubLObject el_var_2 = cycl_utilities.atomic_sentence_arg1(isa_asent, UNPROVIDED);
            SubLObject collection = cycl_utilities.atomic_sentence_arg2(isa_asent, UNPROVIDED);
            if (((NIL != cycl_grammar.hl_variable_p(hl_var))
                 && (NIL != cycl_grammar.el_variable_p(el_var_1))
                 && (NIL != cycl_grammar.el_variable_p(el_var_2))
                 && (el_var_1 == el_var_2))) {
              return convert_to_hl_contextualized_asent(list($const8$isa, hl_var, collection), mt);
            }
          }
        } else {
          return contextualized_asent;
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
      }
    }
    return NIL;
  }

  /** Treats variables as opaque.  Destructive. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 9540)
  public static final SubLObject inference_sort_clauses_and_literals(SubLObject contextualized_dnf_clauses) {
    if ((NIL != list_utilities.singletonP(contextualized_dnf_clauses))) {
      {
        SubLObject contextualized_dnf_clause = contextualized_dnf_clauses.first();
        SubLObject sorted_contextualized_dnf_clause = inference_sort_contextualized_clause_literals(contextualized_dnf_clause);
        return list(sorted_contextualized_dnf_clause);
      }
    } else {
      {
        SubLObject sorted_contextualized_dnf_clauses = NIL;
        SubLObject cdolist_list_var = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = NIL;
        for (contextualized_dnf_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_dnf_clause = cdolist_list_var.first()) {
          sorted_contextualized_dnf_clauses = cons(inference_sort_contextualized_clause_literals(contextualized_dnf_clause), sorted_contextualized_dnf_clauses);
        }
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35651");
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 10324)
  public static final SubLObject inference_sort_contextualized_clause_literals(SubLObject contextualized_clause) {
    {
      SubLObject neg_lits = contextualized_neg_lits(contextualized_clause);
      SubLObject pos_lits = contextualized_pos_lits(contextualized_clause);
      SubLObject new_neg_lits = inference_sort_contextualized_literals(neg_lits);
      SubLObject new_pos_lits = inference_sort_contextualized_literals(pos_lits);
      if (((neg_lits == new_neg_lits)
           && (pos_lits == new_pos_lits))) {
        return contextualized_clause;
      } else {
        {
          SubLObject new_contextualized_clause = clauses.make_clause(new_neg_lits, new_pos_lits);
          return new_contextualized_clause;
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11042)
  public static final SubLObject inference_sort_contextualized_literals(SubLObject literals) {
    return inference_awesome_sort_contextualized_literals(literals);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11178)
  public static final SubLObject inference_simple_sort_contextualized_literals(SubLObject literals) {
    return Sort.sort(literals, $sym10$INFERENCE_CONTEXTUALIZED_ASENT__, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11427)
  public static final SubLObject inference_contextualized_asent_L(SubLObject asent1, SubLObject asent2) {
    return inference_list_L(asent1, asent2);
  }

  public static final class $inference_contextualized_asent_L$BinaryFunction extends BinaryFunction {
    public $inference_contextualized_asent_L$BinaryFunction() { super(extractFunctionNamed("INFERENCE-CONTEXTUALIZED-ASENT-<")); }
    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return inference_contextualized_asent_L(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11535)
  public static final SubLObject inference_list_L(SubLObject list1, SubLObject list2) {
    return inference_formula_L(list1, list2);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 11626)
  public static final SubLObject inference_formula_L(SubLObject formula1, SubLObject formula2) {
    if ((NIL != el_utilities.formula_arityL(formula1, formula2, UNPROVIDED))) {
      return T;
    } else if ((NIL != el_utilities.formula_arityG(formula1, formula2, UNPROVIDED))) {
      return NIL;
    }
    {
      SubLObject seqvar1P = el_utilities.formula_with_sequence_termP(formula1);
      SubLObject seqvar2P = el_utilities.formula_with_sequence_termP(formula2);
      if (((NIL == seqvar1P)
           && (NIL != seqvar2P))) {
        return T;
      } else if (((NIL != seqvar1P)
           && (NIL == seqvar2P))) {
        return NIL;
      }
    }
    {
      SubLObject terms1 = cycl_utilities.formula_terms(formula1, UNPROVIDED);
      SubLObject terms2 = cycl_utilities.formula_terms(formula2, UNPROVIDED);
      SubLObject term1 = NIL;
      SubLObject term1_1 = NIL;
      SubLObject term2 = NIL;
      SubLObject term2_2 = NIL;
      for (term1 = terms1, term1_1 = term1.first(), term2 = terms2, term2_2 = term2.first(); (!(((NIL == term2)
             && (NIL == term1)))); term1 = term1.rest(), term1_1 = term1.first(), term2 = term2.rest(), term2_2 = term2.first()) {
        if ((NIL != inference_term_L(term1_1, term2_2))) {
          return T;
        } else if ((NIL != inference_term_G(term1_1, term2_2))) {
          return NIL;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 12288)
  public static final SubLObject inference_term_L(SubLObject term1, SubLObject term2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((term1 == term2)) {
        return NIL;
      }
      {
        SubLObject type_code_1 = inference_term_type_code(term1);
        SubLObject type_code_2 = inference_term_type_code(term2);
        if (type_code_1.numL(type_code_2)) {
          return T;
        } else if (type_code_1.numG(type_code_2)) {
          return NIL;
        }
        if ((NIL != constant_handles.constant_p(term1))) {
          return inference_constant_L(term1, term2);
        } else if ((NIL != nart_handles.nart_p(term1))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35650");
        } else if ((NIL != fixed_variable_p(term1))) {
          return Numbers.numL(fixed_variable_id(term1), fixed_variable_id(term2));
        } else if ((NIL != variables.variable_p(term1))) {
          if ((NIL != $inference_sort_principledP$.getDynamicValue(thread))) {
            return NIL;
          } else {
            return Numbers.numL(variables.variable_id(term1), variables.variable_id(term2));
          }
        } else if ((NIL != cycl_variables.el_varP(term1))) {
          return NIL;
        } else if ((NIL != cycl_variables.permissible_keyword_varP(term1))) {
          return NIL;
        } else if ((NIL != el_utilities.el_formula_p(term1))) {
          return inference_formula_L(term1, term2);
        } else if (term1.isNumber()) {
          return Numbers.numL(term1, term2);
        } else if (term1.isString()) {
          return Strings.stringL(term1, term2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else if (term1.isSymbol()) {
          return Strings.stringL(Symbols.symbol_name(term1), Symbols.symbol_name(term2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else if (term1.isChar()) {
          return Characters.charL(term1, term2);
        } else if ((NIL != assertion_handles.assertion_p(term1))) {
          return inference_term_L(fi.assertion_hl_formula(term1, UNPROVIDED), fi.assertion_hl_formula(term2, UNPROVIDED));
        } else {
          Errors.error($str11$The_type_of_object__a_cannot_be_s, term1);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 13639)
  public static final SubLObject inference_term_G(SubLObject term1, SubLObject term2) {
    return inference_term_L(term2, term1);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 13727)
  public static final SubLObject inference_term_type_code(SubLObject v_term) {
    if ((NIL != constant_handles.constant_p(v_term))) {
      return ZERO_INTEGER;
    } else if ((NIL != nart_handles.nart_p(v_term))) {
      return ONE_INTEGER;
    } else if ((NIL != fixed_variable_p(v_term))) {
      return ELEVEN_INTEGER;
    } else if ((NIL != variables.variable_p(v_term))) {
      return TWO_INTEGER;
    } else if ((NIL != cycl_variables.el_varP(v_term))) {
      return THREE_INTEGER;
    } else if ((NIL != cycl_variables.permissible_keyword_varP(v_term))) {
      return FOUR_INTEGER;
    } else if ((NIL != el_utilities.el_formula_p(v_term))) {
      return FIVE_INTEGER;
    } else if (v_term.isNumber()) {
      return SIX_INTEGER;
    } else if (v_term.isString()) {
      return SEVEN_INTEGER;
    } else if (v_term.isSymbol()) {
      return EIGHT_INTEGER;
    } else if (v_term.isChar()) {
      return NINE_INTEGER;
    } else if ((NIL != assertion_handles.assertion_p(v_term))) {
      return TEN_INTEGER;
    } else {
      Errors.error($str12$Got_a_CycL_term_of_unknown_infere, v_term);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14376)
  public static final SubLObject inference_constant_L(SubLObject constant1, SubLObject constant2) {
    {
      SubLObject suid1 = constant_handles.constant_suid(constant1);
      SubLObject suid2 = constant_handles.constant_suid(constant2);
      return Numbers.numL(suid1, suid2);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14680)
  private static SubLSymbol $inference_czer_fixed_vars_table$ = null;

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14824)
  private static SubLSymbol $inference_czer_next_fixed_var_id$ = null;

  /** An HL variable that is not a member of *inference-czer-fixed-vars-table* */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 14898)
  public static final SubLObject non_fixed_variable_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != list_utilities.alist_p($inference_czer_fixed_vars_table$.getDynamicValue(thread)))
             && (NIL != cycl_grammar.hl_variable_p(object))
             && (NIL == list_utilities.alist_has_keyP($inference_czer_fixed_vars_table$.getDynamicValue(thread), object, Symbols.symbol_function(EQ)))));
    }
  }

  public static final class $non_fixed_variable_p$UnaryFunction extends UnaryFunction {
    public $non_fixed_variable_p$UnaryFunction() { super(extractFunctionNamed("NON-FIXED-VARIABLE-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return non_fixed_variable_p(arg1); }
  }

  /** An HL variable that is a member of *inference-czer-fixed-vars-table* */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15187)
  public static final SubLObject fixed_variable_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != list_utilities.alist_p($inference_czer_fixed_vars_table$.getDynamicValue(thread)))
             && (NIL != cycl_grammar.hl_variable_p(object))
             && (NIL != list_utilities.alist_has_keyP($inference_czer_fixed_vars_table$.getDynamicValue(thread), object, Symbols.symbol_function(EQ)))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15461)
  public static final SubLObject fully_fixed_p(SubLObject tree) {
    return makeBoolean((NIL == list_utilities.tree_find_if($sym13$NON_FIXED_VARIABLE_P, tree, UNPROVIDED)));
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 15557)
  public static final SubLObject fixed_variable_id(SubLObject fixed_var) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.alist_lookup_without_values($inference_czer_fixed_vars_table$.getDynamicValue(thread), fixed_var, Symbols.symbol_function(EQ), UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16071)
  private static SubLSymbol $inference_czer_at_least_partially_commutative_relations_alist$ = null;

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16212)
  public static final SubLObject inference_czer_at_least_partially_commutative_relation_p(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject resultP = NIL;
        SubLObject cached_result = list_utilities.alist_lookup_without_values($inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, Symbols.symbol_function(EQ), $kw15$CACHE_MISS);
        if (($kw15$CACHE_MISS == cached_result)) {
          resultP = makeBoolean(((NIL != variables.variable_p(pred))
                || (NIL != sbhl_cache.sbhl_cached_predicate_relation_p($const8$isa, pred, $const16$CommutativeRelation, UNPROVIDED))
                || (NIL != sbhl_cache.sbhl_cached_predicate_relation_p($const8$isa, pred, $const17$PartiallyCommutativeRelation, UNPROVIDED))));
          $inference_czer_at_least_partially_commutative_relations_alist$.setDynamicValue(list_utilities.alist_enter($inference_czer_at_least_partially_commutative_relations_alist$.getDynamicValue(thread), pred, resultP, Symbols.symbol_function(EQ)), thread);
        } else {
          resultP = cached_result;
        }
        return resultP;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 16995)
  public static final SubLObject inference_czer_not_at_all_commutative_relation_p(SubLObject pred) {
    return makeBoolean((NIL == inference_czer_at_least_partially_commutative_relation_p(pred)));
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17148)
  public static final SubLObject not_at_all_commutative_contextualized_asent_p(SubLObject contextualized_asent) {
    {
      SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      return inference_czer_not_at_all_commutative_relation_p(pred);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17414)
  public static final SubLObject at_least_partially_commutative_contextualized_asent_p(SubLObject contextualized_asent) {
    {
      SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      return inference_czer_at_least_partially_commutative_relation_p(pred);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 17696)
  public static final SubLObject inference_awesome_sort_contextualized_literals(SubLObject literals) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $inference_czer_fixed_vars_table$.currentBinding(thread);
          SubLObject _prev_bind_1 = $inference_czer_next_fixed_var_id$.currentBinding(thread);
          SubLObject _prev_bind_2 = $inference_czer_at_least_partially_commutative_relations_alist$.currentBinding(thread);
          try {
            $inference_czer_fixed_vars_table$.bind(NIL, thread);
            $inference_czer_next_fixed_var_id$.bind(ZERO_INTEGER, thread);
            $inference_czer_at_least_partially_commutative_relations_alist$.bind(NIL, thread);
            result = inference_awesome_sort_contextualized_literals_iterative(NIL, literals);
          } finally {
            $inference_czer_at_least_partially_commutative_relations_alist$.rebind(_prev_bind_2, thread);
            $inference_czer_next_fixed_var_id$.rebind(_prev_bind_1, thread);
            $inference_czer_fixed_vars_table$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18089)
  public static final SubLObject inference_awesome_sort_contextualized_literals_iterative(SubLObject already_sorted_literals, SubLObject not_yet_sorted_literals) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject doneP = NIL;
        SubLObject skip_fully_fixed_this_timeP = NIL;
        while ((NIL == doneP)) {
          if ((NIL == not_yet_sorted_literals)) {
            doneP = T;
          } else {
            thread.resetMultipleValues();
            {
              SubLObject new_awesome_literals = pick_some_awesome_lits(not_yet_sorted_literals, skip_fully_fixed_this_timeP);
              SubLObject skip_fully_fixed_next_timeP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              skip_fully_fixed_this_timeP = skip_fully_fixed_next_timeP;
              already_sorted_literals = ConsesLow.nconc(already_sorted_literals, new_awesome_literals);
              not_yet_sorted_literals = conses_high.set_difference(not_yet_sorted_literals, new_awesome_literals, Symbols.symbol_function(EQ), UNPROVIDED);
              if ((NIL != not_yet_sorted_literals)) {
                inference_update_fixed_vars_table(new_awesome_literals);
              }
            }
          }
        }
      }
      return already_sorted_literals;
    }
  }

  /** Result is top-level destructible.  Result is sorted and awesome.
   @param SKIP-FULLY-FIXED? booleanp; if we just got some fully fixed literals last time, we won't get any this time. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 18951)
  public static final SubLObject pick_some_awesome_lits(SubLObject not_yet_sorted_literals, SubLObject skip_fully_fixedP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != list_utilities.singletonP(not_yet_sorted_literals))) {
        return Values.values(conses_high.copy_list(not_yet_sorted_literals), NIL);
      }
      {
        SubLObject awesome_literals = NIL;
        SubLObject skip_fully_fixed_next_timeP = NIL;
        SubLObject principledP = T;
        if ((NIL == skip_fully_fixedP)) {
          awesome_literals = inference_fully_fixed_literals(not_yet_sorted_literals);
        }
        if ((NIL != awesome_literals)) {
          skip_fully_fixed_next_timeP = T;
        } else {
          awesome_literals = inference_unique_commutative_literals(not_yet_sorted_literals);
        }
        if ((NIL == awesome_literals)) {
          awesome_literals = inference_uniquely_constrained_literals(not_yet_sorted_literals);
        }
        if ((NIL == awesome_literals)) {
          awesome_literals = not_yet_sorted_literals;
          principledP = NIL;
        }
        {
          SubLObject _prev_bind_0 = $inference_sort_principledP$.currentBinding(thread);
          try {
            $inference_sort_principledP$.bind(principledP, thread);
            awesome_literals = inference_simple_sort_contextualized_literals(awesome_literals);
          } finally {
            $inference_sort_principledP$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(awesome_literals, skip_fully_fixed_next_timeP);
      }
    }
  }

  /** Return any literals that are fully fixed.  Fully fixed means fully bound or a fixed variable.
   Assumes *inference-czer-fixed-vars-table* is bound. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 20927)
  public static final SubLObject inference_fully_fixed_literals(SubLObject not_yet_sorted_literals) {
    {
      SubLObject fully_fixed_literals = NIL;
      SubLObject cdolist_list_var = not_yet_sorted_literals;
      SubLObject literal = NIL;
      for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
        if (((NIL != fully_fixed_p(literal))
             && (NIL != not_at_all_commutative_contextualized_asent_p(literal)))) {
          fully_fixed_literals = cons(literal, fully_fixed_literals);
        }
      }
      return fully_fixed_literals;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 21503)
  private static SubLSymbol $variable_token$ = null;

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 21561)
  public static final SubLObject variable_token(SubLObject dummy) {
    if ((dummy == UNPROVIDED)) {
      dummy = NIL;
    }
    return $variable_token$.getGlobalValue();
  }

  public static final class $variable_token$ZeroArityFunction extends ZeroArityFunction {
    public $variable_token$ZeroArityFunction() { super(extractFunctionNamed("VARIABLE-TOKEN")); }
    @Override
    public SubLObject processItem() { return variable_token(UNPROVIDED); }
  }

  public static final class $variable_token$UnaryFunction extends UnaryFunction {
    public $variable_token$UnaryFunction() { super(extractFunctionNamed("VARIABLE-TOKEN")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return variable_token(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 21654)
  public static final SubLObject var_tokenized_contextualized_asent_predicate(SubLObject contextualized_asent) {
    {
      SubLObject pred = inference_datastructures_problem_query.contextualized_asent_predicate(contextualized_asent);
      if ((NIL != variables.variable_p(pred))) {
        return $variable_token$.getGlobalValue();
      } else {
        return pred;
      }
    }
  }

  /** Sort commutative literals by their predicates and fort bags.  This is pretty conservative, especially wrt
   partial commutativity, but much better than nothing. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 21878)
  public static final SubLObject inference_unique_commutative_literals(SubLObject not_yet_sorted_literals) {
    {
      SubLObject commutative_literals_alist = NIL;
      {
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          if ((NIL != at_least_partially_commutative_contextualized_asent_p(literal))) {
            commutative_literals_alist = list_utilities.alist_push(commutative_literals_alist, var_tokenized_contextualized_asent_predicate(literal), literal, Symbols.symbol_function(EQ));
          }
        }
      }
      if ((NIL == commutative_literals_alist)) {
        return NIL;
      }
      {
        SubLObject unique_commutative_literals = NIL;
        {
          SubLObject cdolist_list_var = commutative_literals_alist;
          SubLObject cons = NIL;
          for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
            {
              SubLObject datum = cons;
              SubLObject current = datum;
              SubLObject key = NIL;
              SubLObject literals = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
              key = current.first();
              current = current.rest();
              literals = current;
              if ((NIL != list_utilities.singletonP(literals))) {
                unique_commutative_literals = cons(list_utilities.only_one(literals), unique_commutative_literals);
              }
            }
          }
        }
        if ((NIL == unique_commutative_literals)) {
          {
            SubLObject fort_id_alist = NIL;
            {
              SubLObject cdolist_list_var = commutative_literals_alist;
              SubLObject cons = NIL;
              for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
                {
                  SubLObject datum = cons;
                  SubLObject current = datum;
                  SubLObject key = NIL;
                  SubLObject literals = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
                  key = current.first();
                  current = current.rest();
                  literals = current;
                  {
                    SubLObject cdolist_list_var_3 = literals;
                    SubLObject literal = NIL;
                    for (literal = cdolist_list_var_3.first(); (NIL != cdolist_list_var_3); cdolist_list_var_3 = cdolist_list_var_3.rest(), literal = cdolist_list_var_3.first()) {
                      fort_id_alist = list_utilities.alist_push(fort_id_alist, Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29840"), literal, Symbols.symbol_function(EQUAL));
                    }
                  }
                }
              }
            }
            {
              SubLObject cdolist_list_var = fort_id_alist;
              SubLObject cons = NIL;
              for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
                {
                  SubLObject datum = cons;
                  SubLObject current = datum;
                  SubLObject key = NIL;
                  SubLObject literals = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
                  key = current.first();
                  current = current.rest();
                  literals = current;
                  if ((NIL != list_utilities.singletonP(literals))) {
                    unique_commutative_literals = cons(list_utilities.only_one(literals), unique_commutative_literals);
                  }
                }
              }
            }
          }
        }
        return unique_commutative_literals;
      }
    }
  }

  /** Returns literals with not-at-all-commutative predicates that appear uniquely in NOT-YET-SORTED-LITERALS
   assuming that all non-fixed variables are considered to be equal.
   Assumes *inference-czer-fixed-vars-table* is bound. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 23361)
  public static final SubLObject inference_uniquely_constrained_literals(SubLObject not_yet_sorted_literals) {
    {
      SubLObject uniquely_constrained_literals = NIL;
      SubLObject alist = NIL;
      {
        SubLObject cdolist_list_var = not_yet_sorted_literals;
        SubLObject literal = NIL;
        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
          if ((NIL != not_at_all_commutative_contextualized_asent_p(literal))) {
            {
              SubLObject dwimmed_literal = transform_list_utilities.transform(literal, $sym13$NON_FIXED_VARIABLE_P, $sym21$VARIABLE_TOKEN, UNPROVIDED);
              SubLObject alist_entry = conses_high.assoc(dwimmed_literal, alist, Symbols.symbol_function(EQUAL), UNPROVIDED);
              if ((NIL != alist_entry)) {
                ConsesLow.rplacd(alist_entry, $kw22$NOT_UNIQUE);
              } else {
                {
                  SubLObject new_alist_entry = cons(dwimmed_literal, literal);
                  alist = cons(new_alist_entry, alist);
                }
              }
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
          {
            SubLObject datum = cons;
            SubLObject current = datum;
            SubLObject key = NIL;
            SubLObject literal = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list23);
            key = current.first();
            current = current.rest();
            literal = current;
            if (($kw22$NOT_UNIQUE != literal)) {
              uniquely_constrained_literals = cons(literal, uniquely_constrained_literals);
            }
          }
        }
      }
      return uniquely_constrained_literals;
    }
  }

  /** Assumes *inference-czer-fixed-vars-table* is bound */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 24344)
  public static final SubLObject inference_update_fixed_vars_table(SubLObject new_uniquely_constrained_literals) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = list_utilities.tree_gather(new_uniquely_constrained_literals, $sym24$VARIABLE_P, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED);
        SubLObject var = NIL;
        for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
          if ((NIL != non_fixed_variable_p(var))) {
            $inference_czer_fixed_vars_table$.setDynamicValue(list_utilities.alist_enter($inference_czer_fixed_vars_table$.getDynamicValue(thread), var, $inference_czer_next_fixed_var_id$.getDynamicValue(thread), Symbols.symbol_function(EQ)), thread);
            $inference_czer_next_fixed_var_id$.setDynamicValue(Numbers.add($inference_czer_next_fixed_var_id$.getDynamicValue(thread), ONE_INTEGER), thread);
          }
        }
      }
      return NIL;
    }
  }

  /** Destructive */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 24809)
  public static final SubLObject contiguize_hl_vars_in_clauses(SubLObject contextualized_dnf_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.hl_ground_tree_p(contextualized_dnf_clauses))) {
        return Values.values(contextualized_dnf_clauses, NIL);
      }
      thread.resetMultipleValues();
      {
        SubLObject all_goodP = all_hl_vars_contiguous_and_in_orderP(contextualized_dnf_clauses);
        SubLObject largest_hl_var_num = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != all_goodP)) {
          return Values.values(contextualized_dnf_clauses, identity_variable_map(largest_hl_var_num));
        }
      }
      {
        SubLObject hl_var_blist = hl_var_contiguity_alist(contextualized_dnf_clauses);
        return Values.values(bindings.napply_bindings(hl_var_blist, contextualized_dnf_clauses), bindings.invert_bindings(hl_var_blist));
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25587)
  public static final SubLObject identity_variable_map(SubLObject largest_var_num) {
    return bindings.hl_identity_bindings(number_utilities.f_1X(largest_var_num));
  }

  /** lambda used in @xref non-contiguous-hl-var? and possibly-note-hl-var-contiguity-pair */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25699)
  private static SubLSymbol $largest_hl_var_num_so_far$ = null;

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 25848)
  public static final SubLObject non_contiguous_hl_varP(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != cycl_grammar.hl_variable_p(object))) {
        {
          SubLObject var_num = variables.variable_id(object);
          if (var_num.numLE($largest_hl_var_num_so_far$.getDynamicValue(thread))) {
            return NIL;
          } else if (var_num.numE(number_utilities.f_1X($largest_hl_var_num_so_far$.getDynamicValue(thread)))) {
            $largest_hl_var_num_so_far$.setDynamicValue(var_num, thread);
            return NIL;
          } else {
            return T;
          }
        }
      }
      return NIL;
    }
  }

  public static final class $non_contiguous_hl_varP$UnaryFunction extends UnaryFunction {
    public $non_contiguous_hl_varP$UnaryFunction() { super(extractFunctionNamed("NON-CONTIGUOUS-HL-VAR?")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return non_contiguous_hl_varP(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26195)
  public static final SubLObject all_hl_vars_contiguous_and_in_orderP(SubLObject contextualized_dnf_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject largest_num = NIL;
        {
          SubLObject _prev_bind_0 = $largest_hl_var_num_so_far$.currentBinding(thread);
          try {
            $largest_hl_var_num_so_far$.bind(MINUS_ONE_INTEGER, thread);
            result = makeBoolean((NIL == list_utilities.tree_find_if($sym26$NON_CONTIGUOUS_HL_VAR_, contextualized_dnf_clauses, UNPROVIDED)));
            largest_num = $largest_hl_var_num_so_far$.getDynamicValue(thread);
          } finally {
            $largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(result, largest_num);
      }
    }
  }

  /** lambda used in @xref possibly-note-hl-var-contiguity-pair */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26543)
  private static SubLSymbol $hl_var_contiguity_alist$ = null;

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 26663)
  public static final SubLObject possibly_note_hl_var_contiguity_pair(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != cycl_grammar.hl_variable_p(object))) {
        {
          SubLObject new_var_cons = conses_high.assoc(object, $hl_var_contiguity_alist$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          if ((NIL == new_var_cons)) {
            {
              SubLObject next_var_num = number_utilities.f_1X($largest_hl_var_num_so_far$.getDynamicValue(thread));
              SubLObject next_var = variables.get_variable(next_var_num);
              $largest_hl_var_num_so_far$.setDynamicValue(next_var_num, thread);
              $hl_var_contiguity_alist$.setDynamicValue(cons(cons(object, next_var), $hl_var_contiguity_alist$.getDynamicValue(thread)), thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $possibly_note_hl_var_contiguity_pair$UnaryFunction extends UnaryFunction {
    public $possibly_note_hl_var_contiguity_pair$UnaryFunction() { super(extractFunctionNamed("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return possibly_note_hl_var_contiguity_pair(arg1); }
  }

  /** A mapping from old to new.  Will be flipped later. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 27091)
  public static final SubLObject hl_var_contiguity_alist(SubLObject contextualized_dnf_clauses) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $largest_hl_var_num_so_far$.currentBinding(thread);
          SubLObject _prev_bind_1 = $hl_var_contiguity_alist$.currentBinding(thread);
          try {
            $largest_hl_var_num_so_far$.bind(MINUS_ONE_INTEGER, thread);
            $hl_var_contiguity_alist$.bind(NIL, thread);
            list_utilities.tree_find_if($sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR, contextualized_dnf_clauses, UNPROVIDED);
            result = Sequences.nreverse($hl_var_contiguity_alist$.getDynamicValue(thread));
          } finally {
            $hl_var_contiguity_alist$.rebind(_prev_bind_1, thread);
            $largest_hl_var_num_so_far$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28140)
  public static final SubLObject inference_canonicalize_ask_memoized_internal(SubLObject cycl_query, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
    return inference_canonicalize_ask_int(cycl_query, mt, disjunction_free_el_vars_policy);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28140)
  public static final SubLObject inference_canonicalize_ask_memoized(SubLObject cycl_query, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_query, mt, disjunction_free_el_vars_policy);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw34$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (cycl_query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && disjunction_free_el_vars_policy.equal(cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(inference_canonicalize_ask_memoized_internal(cycl_query, mt, disjunction_free_el_vars_policy)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cycl_query, mt, disjunction_free_el_vars_policy));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** Computes the hl-query based on CYCL-QUERY and MT
This is only used for the initial input to the inference
@return 0 :ill-formed, problem-query-p, or cycl-truth-value-p
@return 1 binding-list-p; EL vars -> HL vars
@return 2 listp; a list of free EL vars */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 28385)
  public static final SubLObject inference_canonicalize_ask_int(SubLObject cycl_query, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject czer_result = NIL;
        if ((NIL == mt)) {
          mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        {
          SubLObject _prev_bind_0 = czer_vars.$create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
          try {
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
            thread.resetMultipleValues();
            {
              SubLObject czer_result_4 = czer_main.canonicalize_ask_sentence(cycl_query, mt);
              SubLObject mt_5 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              czer_result = czer_result_4;
              mt = mt_5;
            }
          } finally {
            czer_vars.$create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL == czer_result)) {
          return Values.values($kw35$ILL_FORMED, NIL, NIL);
        } else if ((NIL != cycl_grammar.cycl_truth_value_p(czer_result))) {
          return Values.values(czer_result, NIL, NIL);
        } else if (czer_result.isCons()) {
          {
            SubLObject contextualized_clauses = NIL;
            thread.resetMultipleValues();
            {
              SubLObject v_clauses = inference_standardize_canonicalize_ask_result(czer_result, disjunction_free_el_vars_policy, cycl_query);
              SubLObject blist = thread.secondMultipleValue();
              SubLObject free_el_vars = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if (($kw35$ILL_FORMED == v_clauses)) {
                return Values.values($kw35$ILL_FORMED, NIL, NIL);
              } else {
                {
                  SubLObject cdolist_list_var = v_clauses;
                  SubLObject clause = NIL;
                  for (clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
                    {
                      SubLObject contextualized_clause = contextualize_clause(clause, mt, disjunction_free_el_vars_policy);
                      contextualized_clauses = cons(contextualized_clause, contextualized_clauses);
                    }
                  }
                  return Values.values(contextualized_clauses, blist, free_el_vars);
                }
              }
            }
          }
        } else {
          Errors.error($str36$Got_a_czer_result_of_unexpected_t, czer_result);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 29813)
  public static final SubLObject inference_standardize_canonicalize_ask_result(SubLObject czer_result, SubLObject disjunction_free_el_vars_policy, SubLObject cycl_query) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_clauses = NIL;
        SubLObject master_el_to_hl_variable_map = NIL;
        SubLObject all_free_el_vars = NIL;
        if ((NIL != list_utilities.singletonP(czer_result))) {
          {
            SubLObject datum = czer_result;
            SubLObject current = datum;
            SubLObject tuple = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
            tuple = current.first();
            current = current.rest();
            if ((NIL == current)) {
              {
                SubLObject datum_6 = tuple;
                SubLObject current_7 = datum_6;
                SubLObject clause = NIL;
                SubLObject el_to_hl_variable_map = NIL;
                SubLObject free_el_vars = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_7, datum_6, $list38);
                clause = current_7.first();
                current_7 = current_7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_7, datum_6, $list38);
                el_to_hl_variable_map = current_7.first();
                current_7 = current_7.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_7, datum_6, $list38);
                free_el_vars = current_7.first();
                current_7 = current_7.rest();
                if ((NIL == current_7)) {
                  v_clauses = list(clause);
                  master_el_to_hl_variable_map = el_to_hl_variable_map;
                  all_free_el_vars = free_el_vars;
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum_6, $list38);
                }
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list37);
            }
          }
        } else {
          thread.resetMultipleValues();
          {
            SubLObject master_el_to_hl_variable_map_8 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35649");
            SubLObject all_free_el_vars_9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            master_el_to_hl_variable_map = master_el_to_hl_variable_map_8;
            all_free_el_vars = all_free_el_vars_9;
          }
          if ((master_el_to_hl_variable_map == $kw35$ILL_FORMED)) {
            return Values.values($kw35$ILL_FORMED, NIL, NIL);
          }
          {
            SubLObject cdolist_list_var = czer_result;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tuple = cdolist_list_var.first()) {
              {
                SubLObject datum = tuple;
                SubLObject current = datum;
                SubLObject local_hl_clause = NIL;
                SubLObject local_el_to_hl_variable_map = NIL;
                SubLObject local_free_el_vars = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
                local_hl_clause = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
                local_el_to_hl_variable_map = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
                local_free_el_vars = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  {
                    SubLObject master_el_clause = bindings.apply_bindings_backwards(local_el_to_hl_variable_map, local_hl_clause);
                    SubLObject master_hl_clause = bindings.apply_bindings(master_el_to_hl_variable_map, master_el_clause);
                    v_clauses = cons(master_hl_clause, v_clauses);
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
                }
              }
            }
          }
          v_clauses = Sequences.nreverse(v_clauses);
        }
        all_free_el_vars = canonicalize_free_el_var_ordering(all_free_el_vars, cycl_query);
        master_el_to_hl_variable_map = bindings.stable_sort_bindings(master_el_to_hl_variable_map, all_free_el_vars);
        return Values.values(v_clauses, master_el_to_hl_variable_map, all_free_el_vars);
      }
    }
  }

  /** Sort FREE-EL-VARS based on the apperance order of EL variables in CYCL-QUERY. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 33053)
  public static final SubLObject canonicalize_free_el_var_ordering(SubLObject free_el_vars, SubLObject cycl_query) {
    {
      SubLObject all_el_vars_in_appearance_order = list_utilities.tree_gather(cycl_query, $sym43$EL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject free_el_vars_in_appearance_order = list_utilities.sort_via_position(free_el_vars, all_el_vars_in_appearance_order, UNPROVIDED, UNPROVIDED);
      return free_el_vars_in_appearance_order;
    }
  }

  /** @return problem-query-p */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 34924)
  public static final SubLObject dnf_and_mt_to_hl_query(SubLObject dnf_clause, SubLObject mt) {
    return list(contextualize_clause(dnf_clause, mt, UNPROVIDED));
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35063)
  public static final SubLObject contextualize_clause(SubLObject clause, SubLObject mt, SubLObject disjunction_free_el_vars_policy) {
    if ((disjunction_free_el_vars_policy == UNPROVIDED)) {
      disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
    }
    {
      SubLObject contextualized_neg_lits = convert_to_hl_contextualized_asents(clauses.neg_lits(clause), mt);
      SubLObject contextualized_pos_lits = convert_to_hl_contextualized_asents(clauses.pos_lits(clause), mt);
      SubLObject contextualized_clause = clauses.make_clause(contextualized_neg_lits, contextualized_pos_lits);
      return canonicalize_contextualized_clause(contextualized_clause, disjunction_free_el_vars_policy);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 35601)
  public static final SubLObject canonicalize_contextualized_clause(SubLObject contextualized_clause, SubLObject disjunction_free_el_vars_policy) {
    if ((disjunction_free_el_vars_policy == UNPROVIDED)) {
      disjunction_free_el_vars_policy = inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != clauses.atomic_clause_p(contextualized_clause))
             && (NIL != el_utilities.cyc_const_sentential_relation_p(cycl_utilities.atomic_sentence_predicate(inference_datastructures_problem_query.contextualized_asent_asent(clause_utilities.atomic_clause_asent(contextualized_clause))))))))) {
        return contextualized_clause;
      } else {
        {
          SubLObject not_really_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
          SubLObject subsentence = inference_datastructures_problem_query.contextualized_asent_asent(not_really_asent);
          SubLObject sub_mt = inference_datastructures_problem_query.contextualized_asent_mt(not_really_asent);
          SubLObject contextualized_clauses = inference_canonicalize_ask_memoized(subsentence, sub_mt, disjunction_free_el_vars_policy);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == list_utilities.singletonP(contextualized_clauses))) {
              Errors.error($str44$Something_weird_happened_when_try, contextualized_clause);
            }
          }
          return contextualized_clauses.first();
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 36735)
  public static final SubLObject convert_to_hl_contextualized_asents(SubLObject asents, SubLObject mt) {
    {
      SubLObject contextualized_asents = NIL;
      SubLObject cdolist_list_var = asents;
      SubLObject asent = NIL;
      for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
        {
          SubLObject contextualized_asent = convert_to_hl_contextualized_asent(asent, mt);
          contextualized_asents = cons(contextualized_asent, contextualized_asents);
        }
      }
      contextualized_asents = Sequences.nreverse(contextualized_asents);
      return contextualized_asents;
    }
  }

  /** @return hl-contextualized-asent-p */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 37100)
  public static final SubLObject convert_to_hl_contextualized_asent(SubLObject asent, SubLObject mt) {
    if ((NIL != cycl_variables.cyc_varP(asent))) {
      asent = el_utilities.make_unary_formula($const4$trueSentence, asent);
    }
    {
      SubLObject contextualized_asent = inference_datastructures_problem_query.make_contextualized_asent(mt, asent);
      return inference_simplify_contextualized_asent(contextualized_asent);
    }
  }

  /** Uncanonicalize CONTEXTUALIZED-DNF-CLAUSE into an equivalent CycL sentence.
   @return el-sentence-p */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 39403)
  public static final SubLObject contextualized_dnf_clause_formula(SubLObject contextualized_dnf_clause, SubLObject clause_level_mt) {
    if ((clause_level_mt == UNPROVIDED)) {
      clause_level_mt = $kw45$UNSPECIFIED;
    }
    return contextualized_clause_formula(contextualized_dnf_clause, clause_level_mt, $kw46$DNF);
  }

  /** Return the shared MT for CONTEXTUALIZED-DNF-CLAUSE if there is one, otherwise #$BaseKB.  Be conservative. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40487)
  public static final SubLObject contextualized_dnf_clause_common_mt(SubLObject contextualized_dnf_clause) {
    {
      SubLObject formula = contextualized_dnf_clause_formula(contextualized_dnf_clause, UNPROVIDED);
      if (((NIL != el_utilities.ist_sentence_p(formula))
           && (NIL == cycl_utilities.expression_find_if($sym48$IST_SENTENCE_WITH_CHLMT_P, cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
        return cycl_utilities.formula_arg1(formula, UNPROVIDED);
      } else {
        return mt_vars.$core_mt_floor$.getGlobalValue();
      }
    }
  }

  /** Uncanonicalize CONTEXTUALIZED-CLAUSE into an equivalent CycL sentence.
@param TYPE keywordp; either :DNF or :CNF.
   @return el-sentence-p */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 40944)
  public static final SubLObject contextualized_clause_formula(SubLObject contextualized_clause, SubLObject clause_level_mt, SubLObject type) {
    {
      SubLObject contextualized_neg_lits = contextualized_neg_lits(contextualized_clause);
      SubLObject contextualized_pos_lits = contextualized_pos_lits(contextualized_clause);
      if (((NIL == contextualized_neg_lits)
           && (NIL == contextualized_pos_lits))) {
        return $const3$True;
      } else if (((NIL == contextualized_neg_lits)
           && (NIL != list_utilities.singletonP(contextualized_pos_lits)))) {
        return contextualized_asent_formula(contextualized_pos_lits.first(), clause_level_mt);
      } else if (((NIL == contextualized_pos_lits)
           && (NIL != list_utilities.singletonP(contextualized_neg_lits)))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35635");
      } else if ((type == $kw46$DNF)) {
        return contextualized_clause_conjunction_formula(contextualized_clause, clause_level_mt);
      } else if ((type == $kw47$CNF)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35638");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 42311)
  public static final SubLObject contextualized_neg_lits(SubLObject contextualized_clause) {
    return clauses.neg_lits(contextualized_clause);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 42429)
  public static final SubLObject contextualized_pos_lits(SubLObject contextualized_clause) {
    return clauses.pos_lits(contextualized_clause);
  }

  /** @return EL-FORMULA-P; A decontextualized version of CONTEXTUALIZED-ASENT, assuming CLAUSE-LEVEL-MT
if specified. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 42548)
  public static final SubLObject contextualized_asent_formula(SubLObject contextualized_asent, SubLObject clause_level_mt) {
    if ((clause_level_mt == UNPROVIDED)) {
      clause_level_mt = $kw45$UNSPECIFIED;
    }
    {
      SubLObject datum = contextualized_asent;
      SubLObject current = datum;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
      asent = current.first();
      current = current.rest();
      if ((NIL == current)) {
        if (mt.equal(clause_level_mt)) {
          return asent;
        } else {
          return el_utilities.make_binary_formula($const49$ist, mt, asent);
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
      }
    }
    return NIL;
  }

  /** @param CONTEXTUALIZED-CLAUSE clause-p; a logical conjunction.
@return EL-SENTENCE-P representation of CONTEXTUALIZED-CLAUSE assuming CLAUSE-LEVEL-MT. */
  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 44579)
  public static final SubLObject contextualized_clause_conjunction_formula(SubLObject contextualized_clause, SubLObject clause_level_mt) {
    if ((clause_level_mt == UNPROVIDED)) {
      clause_level_mt = $kw45$UNSPECIFIED;
    }
    return contextualized_clause_juncts_formula(contextualized_clause, clause_level_mt, $kw50$CONJUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 45353)
  public static final SubLObject contextualized_clause_juncts_formula(SubLObject contextualized_clause, SubLObject clause_level_mt, SubLObject type) {
    {
      SubLObject neg_lit_formulas = NIL;
      SubLObject pos_lit_formulas = NIL;
      SubLObject add_ist_wrapperP = makeBoolean((NIL == hlmt.hlmt_p(clause_level_mt)));
      if ((NIL != add_ist_wrapperP)) {
        clause_level_mt = determine_best_clause_level_mt(contextualized_clause);
      }
      {
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
          {
            SubLObject sense = $kw52$NEG;
            if (($kw52$NEG == sense)) {
              neg_lit_formulas = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35636"), neg_lit_formulas);
            } else {
              pos_lit_formulas = cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
          }
          index_var = Numbers.add(index_var, ONE_INTEGER);
        }
      }
      {
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
          {
            SubLObject sense = $kw53$POS;
            if (($kw52$NEG == sense)) {
              neg_lit_formulas = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35637"), neg_lit_formulas);
            } else {
              pos_lit_formulas = cons(contextualized_asent_formula(contextualized_asent, clause_level_mt), pos_lit_formulas);
            }
          }
          index_var = Numbers.add(index_var, ONE_INTEGER);
        }
      }
      neg_lit_formulas = Sequences.nreverse(neg_lit_formulas);
      pos_lit_formulas = Sequences.nreverse(pos_lit_formulas);
      {
        SubLObject juncts = ConsesLow.nconc(neg_lit_formulas, pos_lit_formulas);
        SubLObject decontextualized_formula = ((type == $kw50$CONJUNCTION) ? ((SubLObject) el_utilities.make_conjunction(juncts)) : el_utilities.make_disjunction(juncts));
        return ((NIL != add_ist_wrapperP) ? ((SubLObject) el_utilities.make_binary_formula($const49$ist, clause_level_mt, decontextualized_formula)) : decontextualized_formula);
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 46426)
  public static final SubLObject determine_best_clause_level_mt(SubLObject contextualized_clause) {
    return determine_best_clauses_level_mt(list(contextualized_clause));
  }

  @SubL(source = "cycl/inference/harness/inference-czer.lisp", position = 46570)
  public static final SubLObject determine_best_clauses_level_mt(SubLObject contextualized_clauses) {
    {
      SubLObject frequency_map = NIL;
      SubLObject cdolist_list_var = contextualized_clauses;
      SubLObject contextualized_clause = NIL;
      for (contextualized_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_clause = cdolist_list_var.first()) {
        {
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_11 = clauses.neg_lits(contextualized_clause);
          SubLObject contextualized_asent = NIL;
          for (contextualized_asent = cdolist_list_var_11.first(); (NIL != cdolist_list_var_11); cdolist_list_var_11 = cdolist_list_var_11.rest(), contextualized_asent = cdolist_list_var_11.first()) {
            {
              SubLObject sense = $kw52$NEG;
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
              asent = current.first();
              current = current.rest();
              if ((NIL == current)) {
                {
                  SubLObject total_data = conses_high.assoc(mt, frequency_map, Symbols.symbol_function(EQUAL), UNPROVIDED);
                  if ((NIL == total_data)) {
                    total_data = cons(mt, ZERO_INTEGER);
                    frequency_map = cons(total_data, frequency_map);
                  }
                  ConsesLow.rplacd(total_data, Numbers.add(total_data.rest(), ONE_INTEGER));
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
              }
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
          }
        }
        {
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_12 = clauses.pos_lits(contextualized_clause);
          SubLObject contextualized_asent = NIL;
          for (contextualized_asent = cdolist_list_var_12.first(); (NIL != cdolist_list_var_12); cdolist_list_var_12 = cdolist_list_var_12.rest(), contextualized_asent = cdolist_list_var_12.first()) {
            {
              SubLObject sense = $kw53$POS;
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
              asent = current.first();
              current = current.rest();
              if ((NIL == current)) {
                {
                  SubLObject total_data = conses_high.assoc(mt, frequency_map, Symbols.symbol_function(EQUAL), UNPROVIDED);
                  if ((NIL == total_data)) {
                    total_data = cons(mt, ZERO_INTEGER);
                    frequency_map = cons(total_data, frequency_map);
                  }
                  ConsesLow.rplacd(total_data, Numbers.add(total_data.rest(), ONE_INTEGER));
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
              }
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
          }
        }
      }
      frequency_map = Sequences.nreverse(frequency_map);
      frequency_map = Sort.stable_sort(frequency_map, Symbols.symbol_function($sym54$_), Symbols.symbol_function($sym55$CDR));
      return frequency_map.first().first();
    }
  }

  public static final SubLObject declare_inference_czer_file() {
    declareFunction(myName, "canonicalize_problem_query", "CANONICALIZE-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "inference_delete_duplicate_literals", "INFERENCE-DELETE-DUPLICATE-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_delete_duplicate_clauses", "INFERENCE-DELETE-DUPLICATE-CLAUSES", 1, 0, false);
    declareFunction(myName, "delete_duplicate_sorted_literals", "DELETE-DUPLICATE-SORTED-LITERALS", 1, 0, false);
    declareFunction(myName, "delete_duplicate_sorted_clauses", "DELETE-DUPLICATE-SORTED-CLAUSES", 1, 0, false);
    declareFunction(myName, "inference_simplify_problem_query", "INFERENCE-SIMPLIFY-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "inference_simplify_contextualized_dnf_clause", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-DNF-CLAUSE", 1, 0, false);
    declareFunction(myName, "inference_simplify_negated_true_sentence", "INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE", 1, 0, false);
    declareFunction(myName, "inference_el_dnf", "INFERENCE-EL-DNF", 2, 1, false);
    declareFunction(myName, "inference_simplify_contextualized_asent", "INFERENCE-SIMPLIFY-CONTEXTUALIZED-ASENT", 1, 0, false);
    declareFunction(myName, "inference_sort_clauses_and_literals", "INFERENCE-SORT-CLAUSES-AND-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_sort_contextualized_clause_literals", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSE-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_sort_contextualized_clauses", "INFERENCE-SORT-CONTEXTUALIZED-CLAUSES", 1, 0, false);
    declareFunction(myName, "inference_sort_contextualized_literals", "INFERENCE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_simple_sort_contextualized_literals", "INFERENCE-SIMPLE-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_clause_L", "INFERENCE-CLAUSE-<", 2, 0, false);
    declareFunction(myName, "inference_contextualized_asent_L", "INFERENCE-CONTEXTUALIZED-ASENT-<", 2, 0, false); new $inference_contextualized_asent_L$BinaryFunction();
    declareFunction(myName, "inference_list_L", "INFERENCE-LIST-<", 2, 0, false);
    declareFunction(myName, "inference_formula_L", "INFERENCE-FORMULA-<", 2, 0, false);
    declareFunction(myName, "inference_term_L", "INFERENCE-TERM-<", 2, 0, false);
    declareFunction(myName, "inference_term_G", "INFERENCE-TERM->", 2, 0, false);
    declareFunction(myName, "inference_term_type_code", "INFERENCE-TERM-TYPE-CODE", 1, 0, false);
    declareFunction(myName, "inference_constant_L", "INFERENCE-CONSTANT-<", 2, 0, false);
    declareFunction(myName, "inference_nart_L", "INFERENCE-NART-<", 2, 0, false);
    declareFunction(myName, "non_fixed_variable_p", "NON-FIXED-VARIABLE-P", 1, 0, false); new $non_fixed_variable_p$UnaryFunction();
    declareFunction(myName, "fixed_variable_p", "FIXED-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "fully_fixed_p", "FULLY-FIXED-P", 1, 0, false);
    declareFunction(myName, "fixed_variable_id", "FIXED-VARIABLE-ID", 1, 0, false);
    declareFunction(myName, "fixed_variable_token", "FIXED-VARIABLE-TOKEN", 1, 0, false);
    declareFunction(myName, "fixed_variable_token_p", "FIXED-VARIABLE-TOKEN-P", 1, 0, false);
    declareFunction(myName, "fixed_variable_for_token", "FIXED-VARIABLE-FOR-TOKEN", 1, 0, false);
    declareFunction(myName, "inference_czer_at_least_partially_commutative_relation_p", "INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
    declareFunction(myName, "inference_czer_not_at_all_commutative_relation_p", "INFERENCE-CZER-NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
    declareFunction(myName, "not_at_all_commutative_contextualized_asent_p", "NOT-AT-ALL-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
    declareFunction(myName, "at_least_partially_commutative_contextualized_asent_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-CONTEXTUALIZED-ASENT-P", 1, 0, false);
    declareFunction(myName, "inference_awesome_sort_contextualized_literals", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_awesome_sort_contextualized_literals_iterative", "INFERENCE-AWESOME-SORT-CONTEXTUALIZED-LITERALS-ITERATIVE", 2, 0, false);
    declareFunction(myName, "pick_some_awesome_lits", "PICK-SOME-AWESOME-LITS", 2, 0, false);
    declareFunction(myName, "inference_fully_fixed_literals", "INFERENCE-FULLY-FIXED-LITERALS", 1, 0, false);
    declareFunction(myName, "variable_token", "VARIABLE-TOKEN", 0, 1, false); new $variable_token$ZeroArityFunction(); new $variable_token$UnaryFunction();
    declareFunction(myName, "var_tokenized_contextualized_asent_predicate", "VAR-TOKENIZED-CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
    declareFunction(myName, "inference_unique_commutative_literals", "INFERENCE-UNIQUE-COMMUTATIVE-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_uniquely_constrained_literals", "INFERENCE-UNIQUELY-CONSTRAINED-LITERALS", 1, 0, false);
    declareFunction(myName, "inference_update_fixed_vars_table", "INFERENCE-UPDATE-FIXED-VARS-TABLE", 1, 0, false);
    declareFunction(myName, "contiguize_hl_vars_in_clauses", "CONTIGUIZE-HL-VARS-IN-CLAUSES", 1, 0, false);
    declareFunction(myName, "identity_variable_map", "IDENTITY-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "non_contiguous_hl_varP", "NON-CONTIGUOUS-HL-VAR?", 1, 0, false); new $non_contiguous_hl_varP$UnaryFunction();
    declareFunction(myName, "all_hl_vars_contiguous_and_in_orderP", "ALL-HL-VARS-CONTIGUOUS-AND-IN-ORDER?", 1, 0, false);
    declareFunction(myName, "possibly_note_hl_var_contiguity_pair", "POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR", 1, 0, false); new $possibly_note_hl_var_contiguity_pair$UnaryFunction();
    declareFunction(myName, "hl_var_contiguity_alist", "HL-VAR-CONTIGUITY-ALIST", 1, 0, false);
    declareFunction(myName, "inference_apply_disjunction_free_el_vars_policy", "INFERENCE-APPLY-DISJUNCTION-FREE-EL-VARS-POLICY", 3, 0, false);
    declareFunction(myName, "inference_canonicalize_ask_memoized_internal", "INFERENCE-CANONICALIZE-ASK-MEMOIZED-INTERNAL", 3, 0, false);
    declareFunction(myName, "inference_canonicalize_ask_memoized", "INFERENCE-CANONICALIZE-ASK-MEMOIZED", 3, 0, false);
    declareFunction(myName, "inference_canonicalize_ask_int", "INFERENCE-CANONICALIZE-ASK-INT", 3, 0, false);
    declareFunction(myName, "inference_standardize_canonicalize_ask_result", "INFERENCE-STANDARDIZE-CANONICALIZE-ASK-RESULT", 3, 0, false);
    declareFunction(myName, "inference_master_el_to_hl_variable_map", "INFERENCE-MASTER-EL-TO-HL-VARIABLE-MAP", 2, 0, false);
    declareFunction(myName, "inference_sort_el_variables", "INFERENCE-SORT-EL-VARIABLES", 1, 0, false);
    declareFunction(myName, "canonicalize_free_el_var_ordering", "CANONICALIZE-FREE-EL-VAR-ORDERING", 2, 0, false);
    declareFunction(myName, "decontextualize_clauses_with_best_mt", "DECONTEXTUALIZE-CLAUSES-WITH-BEST-MT", 1, 0, false);
    declareFunction(myName, "decontextualize_clauses", "DECONTEXTUALIZE-CLAUSES", 2, 0, false);
    declareFunction(myName, "decontextualize_clause", "DECONTEXTUALIZE-CLAUSE", 2, 0, false);
    declareFunction(myName, "contextualize_clauses", "CONTEXTUALIZE-CLAUSES", 2, 1, false);
    declareFunction(myName, "dnf_and_mt_to_hl_query", "DNF-AND-MT-TO-HL-QUERY", 2, 0, false);
    declareFunction(myName, "contextualize_clause", "CONTEXTUALIZE-CLAUSE", 2, 1, false);
    declareFunction(myName, "canonicalize_contextualized_clause", "CANONICALIZE-CONTEXTUALIZED-CLAUSE", 1, 1, false);
    declareFunction(myName, "convert_to_hl_contextualized_asents", "CONVERT-TO-HL-CONTEXTUALIZED-ASENTS", 2, 0, false);
    declareFunction(myName, "convert_to_hl_contextualized_asent", "CONVERT-TO-HL-CONTEXTUALIZED-ASENT", 2, 0, false);
    declareFunction(myName, "find_problem_by_el_query", "FIND-PROBLEM-BY-EL-QUERY", 2, 1, false);
    declareFunction(myName, "problem_query_el_formula", "PROBLEM-QUERY-EL-FORMULA", 1, 0, false);
    declareFunction(myName, "problem_query_formula", "PROBLEM-QUERY-FORMULA", 1, 0, false);
    declareFunction(myName, "contextualized_dnf_clauses_formula", "CONTEXTUALIZED-DNF-CLAUSES-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_cnf_clauses_formula", "CONTEXTUALIZED-CNF-CLAUSES-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_dnf_clause_formula", "CONTEXTUALIZED-DNF-CLAUSE-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_cnf_clause_formula", "CONTEXTUALIZED-CNF-CLAUSE-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_dnf_clauses_common_mt", "CONTEXTUALIZED-DNF-CLAUSES-COMMON-MT", 1, 0, false);
    declareFunction(myName, "contextualized_dnf_clause_common_mt", "CONTEXTUALIZED-DNF-CLAUSE-COMMON-MT", 1, 0, false);
    declareFunction(myName, "contextualized_clause_formula", "CONTEXTUALIZED-CLAUSE-FORMULA", 3, 0, false);
    declareFunction(myName, "contextualized_neg_lits", "CONTEXTUALIZED-NEG-LITS", 1, 0, false);
    declareFunction(myName, "contextualized_pos_lits", "CONTEXTUALIZED-POS-LITS", 1, 0, false);
    declareFunction(myName, "contextualized_asent_formula", "CONTEXTUALIZED-ASENT-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_asent_negated_formula", "CONTEXTUALIZED-ASENT-NEGATED-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_dnf_clauses_disjunction_formula", "CONTEXTUALIZED-DNF-CLAUSES-DISJUNCTION-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_cnf_clauses_conjunction_formula", "CONTEXTUALIZED-CNF-CLAUSES-CONJUNCTION-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_clause_conjunction_formula", "CONTEXTUALIZED-CLAUSE-CONJUNCTION-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_clause_disjunction_formula", "CONTEXTUALIZED-CLAUSE-DISJUNCTION-FORMULA", 1, 1, false);
    declareFunction(myName, "contextualized_clause_juncts_formula", "CONTEXTUALIZED-CLAUSE-JUNCTS-FORMULA", 3, 0, false);
    declareFunction(myName, "determine_best_clause_level_mt", "DETERMINE-BEST-CLAUSE-LEVEL-MT", 1, 0, false);
    declareFunction(myName, "determine_best_clauses_level_mt", "DETERMINE-BEST-CLAUSES-LEVEL-MT", 1, 0, false);
    declareFunction(myName, "canonicalize_hypothesis", "CANONICALIZE-HYPOTHESIS", 2, 0, false);
    declareFunction(myName, "canonicalize_hypothesis_recursive", "CANONICALIZE-HYPOTHESIS-RECURSIVE", 2, 0, false);
    declareFunction(myName, "categorize_hypothesis_formulas", "CATEGORIZE-HYPOTHESIS-FORMULAS", 1, 0, false);
    declareFunction(myName, "canonicalize_hypothetical_ask", "CANONICALIZE-HYPOTHETICAL-ASK", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_inference_czer_file() {
    $inference_sort_principledP$ = defparameter("*INFERENCE-SORT-PRINCIPLED?*", T);
    $inference_czer_fixed_vars_table$ = defparameter("*INFERENCE-CZER-FIXED-VARS-TABLE*", misc_utilities.uninitialized());
    $inference_czer_next_fixed_var_id$ = defparameter("*INFERENCE-CZER-NEXT-FIXED-VAR-ID*", misc_utilities.uninitialized());
    $inference_czer_at_least_partially_commutative_relations_alist$ = defparameter("*INFERENCE-CZER-AT-LEAST-PARTIALLY-COMMUTATIVE-RELATIONS-ALIST*", misc_utilities.uninitialized());
    $variable_token$ = deflexical("*VARIABLE-TOKEN*", maybeDefault( $sym18$_VARIABLE_TOKEN_, $variable_token$, ()-> (Symbols.make_symbol($str19$var))));
    $largest_hl_var_num_so_far$ = defparameter("*LARGEST-HL-VAR-NUM-SO-FAR*", $kw25$LAMBDA);
    $hl_var_contiguity_alist$ = defparameter("*HL-VAR-CONTIGUITY-ALIST*", $kw25$LAMBDA);
    return NIL;
  }

  public static final SubLObject setup_inference_czer_file() {
    // CVS_ID("Id: inference-czer.lisp 128085 2009-06-22 16:31:33Z pace ");
    subl_macro_promotions.declare_defglobal($sym18$_VARIABLE_TOKEN_);
    memoization_state.note_memoized_function($sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INFERENCE_SIMPLIFY_NEGATED_TRUE_SENTENCE = makeSymbol("INFERENCE-SIMPLIFY-NEGATED-TRUE-SENTENCE");
  public static final SubLList $list1 = list(makeSymbol("MT"), makeSymbol("TRUE-SENTENCE"));
  public static final SubLObject $const2$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLObject $const3$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const4$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLList $list5 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLObject $const6$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLList $list7 = list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("VARIABLE"), list(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))));
  public static final SubLObject $const8$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym9$INFERENCE_CLAUSE__ = makeSymbol("INFERENCE-CLAUSE-<");
  public static final SubLSymbol $sym10$INFERENCE_CONTEXTUALIZED_ASENT__ = makeSymbol("INFERENCE-CONTEXTUALIZED-ASENT-<");
  public static final SubLString $str11$The_type_of_object__a_cannot_be_s = makeString("The type of object ~a cannot be sorted");
  public static final SubLString $str12$Got_a_CycL_term_of_unknown_infere = makeString("Got a CycL term of unknown inference type: ~a");
  public static final SubLSymbol $sym13$NON_FIXED_VARIABLE_P = makeSymbol("NON-FIXED-VARIABLE-P");
  public static final SubLSymbol $kw14$INFERENCE_CZER_FIXED_VARIABLE = makeKeyword("INFERENCE-CZER-FIXED-VARIABLE");
  public static final SubLSymbol $kw15$CACHE_MISS = makeKeyword("CACHE-MISS");
  public static final SubLObject $const16$CommutativeRelation = constant_handles.reader_make_constant_shell(makeString("CommutativeRelation"));
  public static final SubLObject $const17$PartiallyCommutativeRelation = constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativeRelation"));
  public static final SubLSymbol $sym18$_VARIABLE_TOKEN_ = makeSymbol("*VARIABLE-TOKEN*");
  public static final SubLString $str19$var = makeString("var");
  public static final SubLList $list20 = cons(makeUninternedSymbol("KEY"), makeSymbol("LITERALS"));
  public static final SubLSymbol $sym21$VARIABLE_TOKEN = makeSymbol("VARIABLE-TOKEN");
  public static final SubLSymbol $kw22$NOT_UNIQUE = makeKeyword("NOT-UNIQUE");
  public static final SubLList $list23 = cons(makeUninternedSymbol("KEY"), makeSymbol("LITERAL"));
  public static final SubLSymbol $sym24$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $kw25$LAMBDA = makeKeyword("LAMBDA");
  public static final SubLSymbol $sym26$NON_CONTIGUOUS_HL_VAR_ = makeSymbol("NON-CONTIGUOUS-HL-VAR?");
  public static final SubLSymbol $sym27$POSSIBLY_NOTE_HL_VAR_CONTIGUITY_PAIR = makeSymbol("POSSIBLY-NOTE-HL-VAR-CONTIGUITY-PAIR");
  public static final SubLSymbol $kw28$REQUIRE_EQUAL = makeKeyword("REQUIRE-EQUAL");
  public static final SubLSymbol $kw29$POLICY_VIOLATION = makeKeyword("POLICY-VIOLATION");
  public static final SubLSymbol $kw30$COMPUTE_INTERSECTION = makeKeyword("COMPUTE-INTERSECTION");
  public static final SubLSymbol $kw31$COMPUTE_UNION = makeKeyword("COMPUTE-UNION");
  public static final SubLString $str32$Unexpected_inference_disjunction_ = makeString("Unexpected inference disjunction free el vars policy : ~S");
  public static final SubLSymbol $sym33$INFERENCE_CANONICALIZE_ASK_MEMOIZED = makeSymbol("INFERENCE-CANONICALIZE-ASK-MEMOIZED");
  public static final SubLSymbol $kw34$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw35$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLString $str36$Got_a_czer_result_of_unexpected_t = makeString("Got a czer-result of unexpected type: ~s");
  public static final SubLList $list37 = list(makeSymbol("TUPLE"));
  public static final SubLList $list38 = list(makeSymbol("CLAUSE"), makeSymbol("EL-TO-HL-VARIABLE-MAP"), makeSymbol("FREE-EL-VARS"));
  public static final SubLList $list39 = list(makeSymbol("LOCAL-HL-CLAUSE"), makeSymbol("LOCAL-EL-TO-HL-VARIABLE-MAP"), makeSymbol("LOCAL-FREE-EL-VARS"));
  public static final SubLSymbol $kw40$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLList $list41 = list(makeSymbol("CLAUSE"), makeSymbol("EL-TO-HL-VARIABLE-MAP"), makeSymbol("FREE-HL-VARS"));
  public static final SubLSymbol $sym42$INFERENCE_TERM__ = makeSymbol("INFERENCE-TERM-<");
  public static final SubLSymbol $sym43$EL_VARIABLE_P = makeSymbol("EL-VARIABLE-P");
  public static final SubLString $str44$Something_weird_happened_when_try = makeString("Something weird happened when trying to distribute #$ist across logical operators with ~s");
  public static final SubLSymbol $kw45$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $kw46$DNF = makeKeyword("DNF");
  public static final SubLSymbol $kw47$CNF = makeKeyword("CNF");
  public static final SubLSymbol $sym48$IST_SENTENCE_WITH_CHLMT_P = makeSymbol("IST-SENTENCE-WITH-CHLMT-P");
  public static final SubLObject $const49$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $kw50$CONJUNCTION = makeKeyword("CONJUNCTION");
  public static final SubLSymbol $kw51$DISJUNCTION = makeKeyword("DISJUNCTION");
  public static final SubLSymbol $kw52$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw53$POS = makeKeyword("POS");
  public static final SubLSymbol $sym54$_ = makeSymbol(">");
  public static final SubLSymbol $sym55$CDR = makeSymbol("CDR");
  public static final SubLList $list56 = list(constant_handles.reader_make_constant_shell(makeString("False")));
  public static final SubLString $str57$Can_t_canonicalize_hypothesis__S = makeString("Can't canonicalize hypothesis ~S");
  public static final SubLSymbol $kw58$IGNORE = makeKeyword("IGNORE");
  public static final SubLObject $const59$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $sym60$EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");
  public static final SubLObject $const61$assertionDirection = constant_handles.reader_make_constant_shell(makeString("assertionDirection"));
  public static final SubLObject $const62$constraint = constant_handles.reader_make_constant_shell(makeString("constraint"));
  public static final SubLObject $const63$highlyRelevantAssertion = constant_handles.reader_make_constant_shell(makeString("highlyRelevantAssertion"));
  public static final SubLObject $const64$irrelevantAssertion = constant_handles.reader_make_constant_shell(makeString("irrelevantAssertion"));
  public static final SubLObject $const65$knownAntecedentRule = constant_handles.reader_make_constant_shell(makeString("knownAntecedentRule"));
  public static final SubLObject $const66$queryExtentCached = constant_handles.reader_make_constant_shell(makeString("queryExtentCached"));
  public static final SubLObject $const67$genlRules = constant_handles.reader_make_constant_shell(makeString("genlRules"));

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_czer_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_czer_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_czer_file();
  }

}
