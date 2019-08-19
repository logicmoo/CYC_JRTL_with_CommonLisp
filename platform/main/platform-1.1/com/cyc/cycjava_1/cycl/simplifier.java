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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_utilities;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class simplifier extends SubLTranslatedFile {

  //// Constructor

  private simplifier() {}
  public static final SubLFile me = new simplifier();
  public static final String myName = "com.cyc.cycjava_1.cycl.simplifier";

  //// Definitions

  /** A destructive version of @xref lift-disjuncts. */
  @SubL(source = "cycl/simplifier.lisp", position = 1191) 
  public static final SubLObject nlift_disjuncts(SubLObject disjuncts) {
    {
      SubLObject last_done = NIL;
      SubLObject undone = NIL;
      SubLObject disjunct = NIL;
      for (undone = disjuncts, disjunct = el_utilities.first_in_sequence(undone); (NIL != undone); undone = el_utilities.rest_of_sequence(undone), disjunct = el_utilities.first_in_sequence(undone)) {
        if ((NIL != el_utilities.el_disjunction_p(disjunct))) {
          {
            SubLObject nested_disjuncts = cycl_utilities.sentence_args(disjunct, UNPROVIDED);
            SubLObject still_undone = el_utilities.rest_of_sequence(undone);
            SubLObject replacements = nlift_disjuncts(nested_disjuncts);
            SubLObject splice_cons = conses_high.last(replacements, UNPROVIDED);
            if ((NIL == replacements)) {
              if ((NIL == last_done)) {
                disjuncts = still_undone;
              } else {
                ConsesLow.rplacd(last_done, still_undone);
              }
            } else {
              if ((replacements == splice_cons)) {
                ConsesLow.rplaca(undone, el_utilities.first_in_sequence(replacements));
              } else {
                ConsesLow.rplacd(splice_cons, still_undone);
                ConsesLow.rplaca(undone, el_utilities.first_in_sequence(replacements));
                ConsesLow.rplacd(undone, el_utilities.rest_of_sequence(replacements));
                undone = splice_cons;
              }
              last_done = undone;
            }
          }
        } else {
          last_done = undone;
        }
      }
      return disjuncts;
    }
  }


  /** Assumes that NON-WFF is an ill-formed sentence.  Tries to simplify it into a well-formed sentence.
   @return 0 sentence; the simplified version of NON-WFF.
   @return 1 boolean; t iff the simplified version of NON-WFF is well-formed.
   Assumes that the EL variable namespace is bound. */
  @SubL(source = "cycl/simplifier.lisp", position = 11456) 
  public static final SubLObject try_to_simplify_non_wff_into_wff(SubLObject non_wff, SubLObject wff_function, SubLObject arg2_to_wff_function) {
    if ((wff_function == UNPROVIDED)) {
      wff_function = Symbols.symbol_function($sym7$EL_WFF_);
    }
    if ((arg2_to_wff_function == UNPROVIDED)) {
      arg2_to_wff_function = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$try_to_simplify_non_wff_into_wffP$.getDynamicValue(thread))) {
        {
          SubLObject simpler_sentence = NIL;
          SubLObject is_it_wff_nowP = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$trying_to_simplify_non_wff_into_wffP$.currentBinding(thread);
            try {
              czer_vars.$trying_to_simplify_non_wff_into_wffP$.bind(T, thread);
              simpler_sentence = simplify_cycl_sentence_deep(non_wff, UNPROVIDED);
              is_it_wff_nowP = makeBoolean(((!(non_wff.equal(simpler_sentence)))
                     && (NIL != ((NIL != arg2_to_wff_function) ? ((SubLObject) Functions.funcall(wff_function, simpler_sentence, arg2_to_wff_function)) : Functions.funcall(wff_function, simpler_sentence)))));
            } finally {
              czer_vars.$trying_to_simplify_non_wff_into_wffP$.rebind(_prev_bind_0, thread);
            }
          }
          return Values.values(simpler_sentence, is_it_wff_nowP);
        }
      } else {
        return Values.values(non_wff, NIL);
      }
    }
  }

  
  /** Returns the disjunction of the sentences in the list SENTENCE-LIST.
   If SIMPLIFY? is true, then if any of the sentences in SENTENCE-LIST are disjunctions themselves, they will be flattened:
   i.e. no resulting disjunct will itself be a disjunct (simplification is destructive).
   e.g. (<form1> (#$or <form2> <form3>)) will become (<form1> <form2> <form3>),
   ((#$or (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>)
   will become (<form1> <form2> <form3> <form4> <form5>),
   but ((#$and (#$or <form1> (#$or <form2> <form3>)) <form4>) <form5>) will not change.
   Also, if SIMPLIFY? is true and SENTENCE-LIST is of length 1, it will return the sentence in SENTENCE-LIST. */
  @SubL(source = "cycl/simplifier.lisp", position = 3667) 
  public static final SubLObject disjoin(SubLObject sentence_list, SubLObject simplifyP) {
    if ((simplifyP == UNPROVIDED)) {
      simplifyP = NIL;
    }
    return ndisjoin(((NIL != simplifyP) ? ((SubLObject) conses_high.copy_tree(sentence_list)) : sentence_list), simplifyP);
  }

  /** A destructive version of @xref disjoin. */
  @SubL(source = "cycl/simplifier.lisp", position = 4506) 
  public static final SubLObject ndisjoin(SubLObject sentence_list, SubLObject simplifyP) {
    if ((simplifyP == UNPROVIDED)) {
      simplifyP = T;
    }
    checkType(sentence_list, $sym0$LISTP);
    {
      SubLObject disjuncts = ((NIL != simplifyP) ? ((SubLObject) nlift_disjuncts(sentence_list)) : sentence_list);
      return el_utilities.make_disjunction(disjuncts);
    }
  }

  /** Performs deeper simplifications on SENTENCE than @xref simplify-cycl-sentence.
   Assumes that the EL variable namespace is bound. */
  @SubL(source = "cycl/simplifier.lisp", position = 12427) 
  public static final SubLObject simplify_cycl_sentence_deep(SubLObject sentence, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    sentence = simplify_sequence_variables_1(sentence);
    sentence = simplify_cycl_sentence(sentence, varP);
    return sentence;
  }

  @SubL(source = "cycl/simplifier.lisp", position = 12782) 
  public static final SubLObject simplify_cycl_sentence(SubLObject sentence, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    sentence = simplify_special_cases(sentence);
    sentence = simplify_cycl_sentence_int(sentence, varP);
    if ((NIL != simplify_transitive_redundanciesP())) {
      sentence = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10691");
    }
    return sentence;
  }

  /** Like @xref simplify-cycl-sentence, but only does syntactic simplification. */
  @SubL(source = "cycl/simplifier.lisp", position = 13104) 
  public static final SubLObject simplify_cycl_sentence_syntax(SubLObject sentence, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$simplify_using_semanticsP$.currentBinding(thread);
          try {
            czer_vars.$simplify_using_semanticsP$.bind(NIL, thread);
            result = simplify_cycl_sentence(sentence, varP);
          } finally {
            czer_vars.$simplify_using_semanticsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 13411) 
  public static final SubLObject simplify_cycl_sentence_int(SubLObject sentence, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = sentence;
        if ((NIL == czer_vars.$simplify_sentenceP$.getDynamicValue(thread))) {
        } else if (($const8$True == sentence)) {
        } else if (($const9$False == sentence)) {
        } else if ((NIL != el_utilities.subl_escape_p(sentence))) {
        } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence))) {
        } else if ((NIL != Functions.funcall(varP, sentence))) {
        } else if ((NIL != assertion_handles.assertion_p(sentence))) {
        } else if (sentence.isAtom()) {
          el_utilities.el_error(FOUR_INTEGER, $str10$_S_is_not_well_formed_, sentence, UNPROVIDED, UNPROVIDED);
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8071");
        } else if ((NIL != el_utilities.el_negation_p(sentence))) {
          {
            SubLObject seqvar = el_utilities.sequence_var(sentence, UNPROVIDED);
            SubLObject sub_sentence = NIL;
            {
              SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
              try {
                czer_vars.$within_negationP$.bind(makeBoolean((NIL == czer_vars.$within_negationP$.getDynamicValue(thread))), thread);
                sub_sentence = simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), varP);
              } finally {
                czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
              }
            }
            result = el_utilities.maybe_add_sequence_var_to_end(seqvar, simplify_cycl_negation(el_utilities.make_unary_formula(cycl_utilities.sentence_arg0(sentence), sub_sentence), varP));
          }
        } else if ((NIL != el_utilities.el_conjunction_p(sentence))) {
          if (((NIL != el_utilities.formula_arityE(sentence, ZERO_INTEGER, $kw12$IGNORE))
               && (NIL != el_utilities.formula_arityE(sentence, ONE_INTEGER, $kw13$REGULARIZE)))) {
            result = sentence;
          } else {
            {
              SubLObject _prev_bind_0 = at_vars.$within_conjunctionP$.currentBinding(thread);
              SubLObject _prev_bind_1 = at_vars.$within_negated_conjunctionP$.currentBinding(thread);
              try {
                at_vars.$within_conjunctionP$.bind(T, thread);
                at_vars.$within_negated_conjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                result = simplify_cycl_conjunction(el_utilities.map_formula_args(Symbols.symbol_function($sym14$SIMPLIFY_CYCL_SENTENCE_INT), sentence, UNPROVIDED), varP);
              } finally {
                at_vars.$within_negated_conjunctionP$.rebind(_prev_bind_1, thread);
                at_vars.$within_conjunctionP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else if ((NIL != el_utilities.el_disjunction_p(sentence))) {
          if (((NIL != el_utilities.formula_arityE(sentence, ZERO_INTEGER, $kw12$IGNORE))
               && (NIL != el_utilities.formula_arityE(sentence, ONE_INTEGER, $kw13$REGULARIZE)))) {
            result = sentence;
          } else {
            {
              SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
              SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
              try {
                at_vars.$within_disjunctionP$.bind(T, thread);
                at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                result = simplify_cycl_disjunction(el_utilities.map_formula_args(Symbols.symbol_function($sym14$SIMPLIFY_CYCL_SENTENCE_INT), sentence, UNPROVIDED), varP);
              } finally {
                at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else if ((NIL != el_utilities.el_implication_p(sentence))) {
          {
            SubLObject seqvar = el_utilities.sequence_var(sentence, UNPROVIDED);
            SubLObject antecedent = NIL;
            SubLObject consequent = NIL;
            {
              SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
              SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
              try {
                at_vars.$within_disjunctionP$.bind(T, thread);
                at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                {
                  SubLObject _prev_bind_0_1 = czer_vars.$within_negationP$.currentBinding(thread);
                  try {
                    czer_vars.$within_negationP$.bind(makeBoolean((NIL == czer_vars.$within_negationP$.getDynamicValue(thread))), thread);
                    antecedent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), varP);
                  } finally {
                    czer_vars.$within_negationP$.rebind(_prev_bind_0_1, thread);
                  }
                }
                consequent = simplify_cycl_sentence_int(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), varP);
              } finally {
                at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
              }
            }
            result = el_utilities.maybe_add_sequence_var_to_end(seqvar, simplify_cycl_implication(el_utilities.make_binary_formula(cycl_utilities.sentence_arg0(sentence), antecedent, consequent), varP));
          }
        } else if ((NIL != el_utilities.el_exception_p(sentence))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10684");
        } else if ((NIL != el_utilities.el_universal_p(sentence))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10683");
        } else if ((NIL != el_utilities.el_existential_p(sentence))) {
          result = simplify_cycl_existential(el_utilities.make_regularly_quantified_sentence(el_utilities.sentence_quantifier(sentence), el_utilities.quantified_var(sentence), simplify_cycl_sentence_int(el_utilities.quantified_sub_sentence(sentence), UNPROVIDED)));
        } else if ((NIL != el_utilities.el_bounded_existential_p(sentence))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30589");
        } else if ((NIL != el_utilities.atomic_sentenceP(sentence))) {
          result = simplify_cycl_literal(sentence, varP);
        } else if ((NIL == czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread))) {
        } else if ((NIL != at_utilities.formula_denoting_functionP(sentence,UNPROVIDED))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10679");
        } else if ((NIL != term.unreified_skolem_termP(sentence))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10680");
        } else if ((NIL != el_utilities.relation_expressionP(sentence))) {
          if ((NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8072");
          }
          thread.resetMultipleValues();
          {
            SubLObject simplified_sentence = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10681");
            SubLObject changedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != changedP)) {
              result = simplify_cycl_sentence_int(simplified_sentence, UNPROVIDED);
            } else {
              result = simplified_sentence;
            }
          }
        } else if ((NIL != wff_vars.$within_wffP$.getDynamicValue(thread))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8073");
        }
        return result;
      }
    }
  }

  public static final class $simplify_cycl_sentence_int$UnaryFunction extends UnaryFunction {
    public $simplify_cycl_sentence_int$UnaryFunction() { super(extractFunctionNamed("SIMPLIFY-CYCL-SENTENCE-INT")); }
    public SubLObject processItem(SubLObject arg1) { return simplify_cycl_sentence_int(arg1, UNPROVIDED); }
  }

  public static final class $simplify_cycl_sentence_int$BinaryFunction extends BinaryFunction {
    public $simplify_cycl_sentence_int$BinaryFunction() { super(extractFunctionNamed("SIMPLIFY-CYCL-SENTENCE-INT")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return simplify_cycl_sentence_int(arg1, arg2); }
  }

  /** Like @xref simplify-cycl-literal, but only does syntactic simplification. */
  @SubL(source = "cycl/simplifier.lisp", position = 19732) 
  public static final SubLObject simplify_cycl_literal_syntax(SubLObject literal, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$simplify_using_semanticsP$.currentBinding(thread);
          try {
            czer_vars.$simplify_using_semanticsP$.bind(NIL, thread);
            result = simplify_cycl_literal(literal, varP);
          } finally {
            czer_vars.$simplify_using_semanticsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 20061) 
  public static final SubLObject simplify_cycl_literal(SubLObject literal, SubLObject var_func) {
    if ((var_func == UNPROVIDED)) {
      var_func = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.subl_escape_p(literal))) {
        return literal;
      } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(literal))) {
        return literal;
      } else if ((NIL != czer_utilities.true_sentenceP(literal))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10695");
      } else if ((NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread))) {
        return literal;
      } else {
        if ((NIL != el_utilities.ist_sentence_p(literal))) {
          {
            SubLObject result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10685");
            if ((!(result.equal(literal)))) {
              return simplify_cycl_sentence(result, UNPROVIDED);
            }
          }
        }
        if ((NIL == czer_vars.$simplify_literalP$.getDynamicValue(thread))) {
          return literal;
        }
        if ((NIL != el_utilities.kappa_asent_p(literal))) {
          {
            SubLObject result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10687");
            if ((!(result.equal(literal)))) {
              return simplify_cycl_sentence(result, UNPROVIDED);
            }
          }
        }
        return simplify_cycl_literal_int(literal, var_func);
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 21079) 
  public static final SubLObject simplify_cycl_literal_int(SubLObject literal, SubLObject var_func) {
    if ((var_func == UNPROVIDED)) {
      var_func = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL != czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread))) {
          {
            SubLObject _prev_bind_0 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
            SubLObject _prev_bind_1 = wff_utilities.$check_var_typesP$.currentBinding(thread);
            SubLObject _prev_bind_2 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
            try {
              wff_utilities.$check_wff_semanticsP$.bind(T, thread);
              wff_utilities.$check_var_typesP$.bind(NIL, thread);
              wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
              if (((NIL != control_vars.within_assertP())
                  || (NIL != czer_vars.$trying_to_simplify_non_wff_into_wffP$.getDynamicValue(thread))
                  || (NIL == czer_vars.$simplify_non_wff_literalP$.getDynamicValue(thread))
                  || (NIL != wff.semantically_wf_literalP(literal, mt_relevance_macros.$mt$.getDynamicValue(thread))))) {
                result = simplify_distributing_out_args(simplify_cycl_literal_terms(literal, var_func));
              } else {
                if ((NIL != czer_vars.$try_to_simplify_non_wff_into_wffP$.getDynamicValue(thread))) {
                  {
                    SubLObject simplified_literal = simplify_distributing_out_args(simplify_cycl_literal_terms(literal, var_func));
                    if ((NIL != wff.semantically_wf_literalP(simplified_literal, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
                      result = simplified_literal;
                    } else {
                      result = $const9$False;
                    }
                  }
                } else {
                  result = $const9$False;
                }
              }
            } finally {
              wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_2, thread);
              wff_utilities.$check_var_typesP$.rebind(_prev_bind_1, thread);
              wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          result = simplify_cycl_literal_terms(literal, UNPROVIDED);
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 22751) 
  public static final SubLObject simplify_distributing_out_args(SubLObject literal) {
    {
      SubLObject pred = el_utilities.literal_arg0(literal, UNPROVIDED);
      SubLObject arg = ZERO_INTEGER;
      SubLObject result = NIL;
      if ((NIL == result)) {
        {
          SubLObject csome_list_var = el_utilities.literal_args(literal, UNPROVIDED);
          SubLObject v_term = NIL;
          for (v_term = csome_list_var.first(); (!(((NIL != result)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), v_term = csome_list_var.first()) {
            arg = Numbers.add(arg, ONE_INTEGER);
            if ((NIL != el_utilities.el_relation_expressionP(v_term))) {
              {
                SubLObject reln = cycl_utilities.formula_arg0(v_term);
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10668"))) {
                  {
                    SubLObject literals = NIL;
                    SubLObject sentence = NIL;
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(v_term, UNPROVIDED);
                    SubLObject sub_arg = NIL;
                    for (sub_arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sub_arg = cdolist_list_var.first()) {
                      literals = cons(list_utilities.replace_nth(arg, sub_arg, literal), literals);
                    }
                    sentence = el_utilities.make_el_formula(reln, Sequences.reverse(literals), UNPROVIDED);
                    if ((NIL != czer_main.canon_wffP(sentence, UNPROVIDED))) {
                      result = sentence;
                    }
                  }
                }
              }
            }
          }
        }
      }
      if ((NIL != result)) {
        return simplify_cycl_sentence_int(result, UNPROVIDED);
      } else {
        return literal;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 23409) 
  public static final SubLObject simplify_cycl_literal_terms(SubLObject literal, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    if ((NIL != el_utilities.mt_designating_literalP(literal))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10688");
    } else {
      return simplify_cycl_literal_terms_int(literal, varP);
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 24675) 
  public static final SubLObject simplify_cycl_literal_terms_int(SubLObject literal, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject pred = el_utilities.literal_arg0(literal, UNPROVIDED);
        SubLObject sequence_var = el_utilities.sequence_var(literal, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject terms = cycl_utilities.formula_terms(literal, $kw12$IGNORE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        for (list_var = terms, v_term = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
          {
            SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
            SubLObject _prev_bind_1 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
            try {
              wff_vars.$permit_keyword_variablesP$.bind(makeBoolean(((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread))
                    || (NIL != czer_utilities.arg_permits_keyword_variablesP(pred, argnum, mt)))), thread);
              wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean(((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread))
                    || (NIL != czer_utilities.arg_permits_generic_arg_variablesP(pred, argnum, mt)))), thread);
              {
                SubLObject sentence_argP = czer_utilities.sentence_argP(pred, argnum, mt);
                SubLObject mal_true_sentence_argP = ((NIL != sentence_argP) ? ((SubLObject) ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8825")) ? ((SubLObject) NIL) : czer_utilities.true_sentenceP(v_term))) : NIL);
                if ((NIL != mal_true_sentence_argP)) {
                  result = cons(simplify_cycl_sentence_int(cycl_utilities.formula_arg1(v_term, UNPROVIDED), varP), result);
                } else if ((NIL != sentence_argP)) {
                  result = cons(simplify_cycl_sentence_int(v_term, varP), result);
                } else {
                  result = cons(simplify_cycl_term(v_term, varP), result);
                }
              }
            } finally {
              wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_1, thread);
              wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
            }
          }
        }
        result = Sequences.nreverse(result);
        if ((NIL != sequence_var)) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30615");
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 25746) 
  public static final SubLObject simplify_cycl_term(SubLObject v_term, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.subl_escape_p(v_term))) {
        return v_term;
      } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(v_term))) {
        return v_term;
      } else if ((NIL != term.nautP(v_term, UNPROVIDED))) {
        {
          SubLObject functor = cycl_utilities.nat_functor(v_term);
          SubLObject sequence_var = el_utilities.sequence_var(v_term, UNPROVIDED);
          SubLObject arg = ZERO_INTEGER;
          SubLObject new_term = NIL;
          SubLObject terms = cycl_utilities.formula_terms(v_term, $kw12$IGNORE);
          SubLObject cdolist_list_var = terms;
          SubLObject subterm = NIL;
          for (subterm = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subterm = cdolist_list_var.first()) {
            {
              SubLObject sentence_argP = czer_utilities.sentence_argP(functor, arg, mt_relevance_macros.$mt$.getDynamicValue(thread));
              SubLObject mal_true_sentence_argP = ((NIL != sentence_argP) ? ((SubLObject) ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8826")) ? ((SubLObject) NIL) : czer_utilities.true_sentenceP(subterm))) : NIL);
              if ((NIL != mal_true_sentence_argP)) {
                new_term = cons(simplify_cycl_sentence_int(cycl_utilities.formula_arg1(subterm, UNPROVIDED), varP), new_term);
              } else if ((NIL != sentence_argP)) {
                new_term = cons(simplify_cycl_sentence_int(subterm, varP), new_term);
              } else {
                new_term = cons(simplify_cycl_term(subterm, varP), new_term);
              }
            }
            arg = Numbers.add(arg, ONE_INTEGER);
          }
          new_term = Sequences.nreverse(new_term);
          if ((NIL != sequence_var)) {
            new_term = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30616");
          }
          return new_term;
        }
      } else if ((NIL != el_utilities.relation_expressionP(v_term))) {
        thread.resetMultipleValues();
        {
          SubLObject simplified_term = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10682");
          SubLObject changedP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != changedP)) {
            return simplify_cycl_term(simplified_term, UNPROVIDED);
          } else {
            return simplified_term;
          }
        }
      } else {
        return v_term;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 27601) 
  public static final SubLObject simplify_cycl_negation(SubLObject negation, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    if ((NIL == el_utilities.el_negation_p(negation))) {
    } else if (($const9$False == cycl_utilities.sentence_arg1(negation, UNPROVIDED))) {
      return $const8$True;
    } else if (($const8$True == cycl_utilities.sentence_arg1(negation, UNPROVIDED))) {
      return $const9$False;
    } else if ((NIL != el_utilities.el_negation_p(cycl_utilities.sentence_arg1(negation, UNPROVIDED)))) {
      return simplify_cycl_sentence_int(cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(negation, UNPROVIDED), UNPROVIDED), varP);
    } else {
      return negation;
    }
    return NIL;
  }

  @SubL(source = "cycl/simplifier.lisp", position = 27998) 
  public static final SubLObject simplify_cycl_conjunction(SubLObject conjunction, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == el_utilities.el_conjunction_p(conjunction))) {
      } else if ((NIL == cycl_utilities.sentence_args(conjunction, $kw13$REGULARIZE))) {
        return $const8$True;
      } else if (((NIL == el_utilities.sequence_var(conjunction, UNPROVIDED))
           && (NIL != list_utilities.singletonP(cycl_utilities.sentence_args(conjunction, $kw12$IGNORE))))) {
        return cycl_utilities.sentence_arg1(conjunction, $kw12$IGNORE);
      } else if ((NIL != subl_promotions.memberP($const9$False, cycl_utilities.sentence_args(conjunction, $kw12$IGNORE), UNPROVIDED, UNPROVIDED))) {
        return $const9$False;
      } else if ((NIL != subl_promotions.memberP($const8$True, cycl_utilities.sentence_args(conjunction, $kw12$IGNORE), UNPROVIDED, UNPROVIDED))) {
        return simplify_cycl_conjunction(Sequences.remove($const8$True, conjunction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), varP);
      } else if ((NIL != list_utilities.duplicatesP(cycl_utilities.sentence_args(conjunction, $kw12$IGNORE), Symbols.symbol_function(EQUAL), UNPROVIDED))) {
        {
          SubLObject seqvar = el_utilities.sequence_var(conjunction, UNPROVIDED);
          SubLObject new_args = Sequences.remove_duplicates(cycl_utilities.sentence_args(conjunction, $kw12$IGNORE), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
          return simplify_cycl_conjunction(el_utilities.make_el_formula(cycl_utilities.sentence_arg0(conjunction), new_args, seqvar), varP);
        }
      } else if ((NIL != Sequences.find_if(Symbols.symbol_function($sym5$EL_CONJUNCTION_P), cycl_utilities.sentence_args(conjunction, $kw12$IGNORE), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
        {
          SubLObject seqvar = el_utilities.sequence_var(conjunction, UNPROVIDED);
          if ((NIL != seqvar)) {
            return simplify_cycl_conjunction(ConsesLow.append(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10674"), seqvar), UNPROVIDED);
          } else {
            return simplify_cycl_conjunction(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10660"), UNPROVIDED);
          }
        }
      }
      {
        SubLObject negations = el_utilities.el_negative_sentences(cycl_utilities.sentence_args(conjunction, $kw12$IGNORE));
        SubLObject positives = (((NIL != negations)
            || (NIL != simplify_redundanciesP())) ? ((SubLObject) el_utilities.el_positive_sentences(cycl_utilities.sentence_args(conjunction, $kw12$IGNORE))) : NIL);
        SubLObject disjunctions = ((NIL != simplify_redundanciesP()) ? ((SubLObject) list_utilities.remove_if_not(Symbols.symbol_function($sym18$EL_DISJUNCTION_P), positives, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : NIL);
        SubLObject falseP = NIL;
        if ((NIL == falseP)) {
          {
            SubLObject csome_list_var = negations;
            SubLObject negation = NIL;
            for (negation = csome_list_var.first(); (!(((NIL != falseP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), negation = csome_list_var.first()) {
              falseP = subl_promotions.memberP(cycl_utilities.sentence_arg1(negation, $kw12$IGNORE), positives, Symbols.symbol_function(EQUAL), UNPROVIDED);
            }
          }
        }
        if ((NIL != falseP)) {
          return $const9$False;
        }
        if ((NIL != disjunctions)) {
          {
            SubLObject non_disjunctions = Sequences.delete_if(Symbols.symbol_function($sym18$EL_DISJUNCTION_P), positives, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject new_conjuncts = NIL;
            SubLObject cdolist_list_var = disjunctions;
            SubLObject disjunction = NIL;
            for (disjunction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), disjunction = cdolist_list_var.first()) {
              {
                SubLObject conjuncts = cycl_utilities.sentence_args(conjunction, UNPROVIDED);
                SubLObject disjuncts = cycl_utilities.sentence_args(disjunction, UNPROVIDED);
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9121"))) {
                  new_conjuncts = cons(disjunction, new_conjuncts);
                }
              }
            }
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10675");
          }
        }
      }
      if (((NIL != czer_vars.$simplify_equal_symbols_literalP$.getDynamicValue(thread))
           && ((NIL == czer_utilities.within_negationP())
            || (NIL != czer_utilities.within_disjunctionP())))) {
        {
          SubLObject argnum = ZERO_INTEGER;
          SubLObject args = cycl_utilities.formula_args(conjunction, $kw12$IGNORE);
          SubLObject cdolist_list_var = args;
          SubLObject conjunct = NIL;
          for (conjunct = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunct = cdolist_list_var.first()) {
            argnum = Numbers.add(argnum, ONE_INTEGER);
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30522"))) {
              thread.resetMultipleValues();
              {
                SubLObject equal_op = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30686");
                SubLObject arg1 = thread.secondMultipleValue();
                SubLObject arg2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                  SubLObject var_arg1P = Functions.funcall(varP, arg1);
                  SubLObject var_arg = ((NIL != var_arg1P) ? ((SubLObject) arg1) : arg2);
                  SubLObject bound_arg = ((NIL != var_arg1P) ? ((SubLObject) arg2) : arg1);
                  if ((NIL != el_utilities.groundP(bound_arg, varP))) {
                    return simplify_cycl_conjunction(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29728"), UNPROVIDED);
                  }
                }
              }
            }
          }
        }
      }
      if ((NIL != simplify_transitive_redundanciesP())) {
        conjunction = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10692");
      }
      return conjunction;
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 31210) 
  public static final SubLObject simplify_cycl_disjunction(SubLObject disjunction, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
          try {
            at_vars.$within_disjunctionP$.bind(T, thread);
            at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
            result = simplify_cycl_disjunction_int(disjunction, varP);
          } finally {
            at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
            at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != simplify_transitive_redundanciesP())) {
          disjunction = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10693");
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 31595) 
  public static final SubLObject simplify_cycl_disjunction_int(SubLObject disjunction, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    if ((NIL == el_utilities.el_disjunction_p(disjunction))) {
    } else if ((NIL == cycl_utilities.sentence_args(disjunction, $kw13$REGULARIZE))) {
      return $const9$False;
    } else if (((NIL == el_utilities.sequence_var(disjunction, UNPROVIDED))
         && (NIL != list_utilities.singletonP(cycl_utilities.sentence_args(disjunction, $kw12$IGNORE))))) {
      return cycl_utilities.sentence_arg1(disjunction, $kw12$IGNORE);
    } else if ((NIL != subl_promotions.memberP($const8$True, cycl_utilities.sentence_args(disjunction, $kw12$IGNORE), UNPROVIDED, UNPROVIDED))) {
      return $const8$True;
    } else if ((NIL != subl_promotions.memberP($const9$False, cycl_utilities.sentence_args(disjunction, $kw12$IGNORE), UNPROVIDED, UNPROVIDED))) {
      return simplify_cycl_disjunction_int(Sequences.remove($const9$False, disjunction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), varP);
    } else if ((NIL != list_utilities.duplicatesP(cycl_utilities.sentence_args(disjunction, $kw12$IGNORE), Symbols.symbol_function(EQUAL), UNPROVIDED))) {
      {
        SubLObject seqvar = el_utilities.sequence_var(disjunction, UNPROVIDED);
        SubLObject new_args = Sequences.remove_duplicates(cycl_utilities.sentence_args(disjunction, $kw12$IGNORE), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return simplify_cycl_disjunction_int(el_utilities.make_el_formula(cycl_utilities.sentence_arg0(disjunction), new_args, seqvar), varP);
      }
    } else if ((NIL != Sequences.find_if(Symbols.symbol_function($sym18$EL_DISJUNCTION_P), cycl_utilities.sentence_args(disjunction, $kw12$IGNORE), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
      {
        SubLObject seqvar = el_utilities.sequence_var(disjunction, UNPROVIDED);
        if ((NIL != seqvar)) {
          return simplify_cycl_disjunction_int(ConsesLow.append(ndisjoin(cycl_utilities.sentence_args(disjunction, $kw12$IGNORE), T), seqvar), UNPROVIDED);
        } else {
          return simplify_cycl_disjunction_int(disjoin(cycl_utilities.sentence_args(disjunction, UNPROVIDED), T), UNPROVIDED);
        }
      }
    } else {
      {
        SubLObject negations = el_utilities.el_negative_sentences(cycl_utilities.sentence_args(disjunction, $kw12$IGNORE));
        SubLObject positives = ((NIL != negations) ? ((SubLObject) el_utilities.el_positive_sentences(cycl_utilities.sentence_args(disjunction, $kw12$IGNORE))) : NIL);
        SubLObject trueP = NIL;
        if ((NIL == trueP)) {
          {
            SubLObject csome_list_var = negations;
            SubLObject negation = NIL;
            for (negation = csome_list_var.first(); (!(((NIL != trueP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), negation = csome_list_var.first()) {
              trueP = subl_promotions.memberP(cycl_utilities.sentence_arg1(negation, $kw12$IGNORE), positives, Symbols.symbol_function(EQUAL), UNPROVIDED);
            }
          }
        }
        if ((NIL != trueP)) {
          return $const8$True;
        } else {
          return disjunction;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/simplifier.lisp", position = 33254) 
  public static final SubLObject simplify_cycl_implication(SubLObject implication, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym6$CYC_VAR_);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == el_utilities.el_implication_p(implication))) {
      } else if ((NIL == czer_vars.$simplify_implicationP$.getDynamicValue(thread))) {
        return implication;
      } else if ((NIL != list_utilities.singletonP(cycl_utilities.sentence_args(implication, UNPROVIDED)))) {
        return simplify_cycl_sentence_int(cycl_utilities.negate(cycl_utilities.sentence_arg1(implication, UNPROVIDED)), varP);
      } else if (($const8$True == cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
        return $const8$True;
      } else if (($const9$False == cycl_utilities.sentence_arg1(implication, UNPROVIDED))) {
        return $const8$True;
      } else if (($const8$True == cycl_utilities.sentence_arg1(implication, UNPROVIDED))) {
        return cycl_utilities.sentence_arg2(implication, UNPROVIDED);
      } else if (($const9$False == cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
        return cycl_utilities.negate(cycl_utilities.sentence_arg1(implication, UNPROVIDED));
      } else if ((NIL != control_vars.$within_unassert$.getDynamicValue(thread))) {
        return implication;
      } else if ((NIL != czer_vars.$recanonicalizingP$.getDynamicValue(thread))) {
        return implication;
      } else if (cycl_utilities.sentence_arg1(implication, UNPROVIDED).equal(cycl_utilities.sentence_arg2(implication, UNPROVIDED))) {
        return $const8$True;
      } else {
        return implication;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 34662) 
  public static final SubLObject simplify_cycl_existential(SubLObject existential) {
    {
      SubLObject var = el_utilities.quantified_var(existential);
      SubLObject sub_sentence = el_utilities.quantified_sub_sentence(existential);
      if ((NIL != cycl_utilities.expression_find(var, sub_sentence, T, UNPROVIDED, UNPROVIDED))) {
        return existential;
      } else {
        return sub_sentence;
      }
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 35103) 
  public static final SubLObject simplify_special_cases(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$simplify_using_semanticsP$.getDynamicValue(thread))) {
        formula = simplify_nested_collectionsubsetfn_expression(formula);
      }
      return formula;
    }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 35355) 
  public static final SubLObject simplify_nested_collectionsubsetfn_expression(SubLObject formula) {
    return transform_list_utilities.transform(formula, Symbols.symbol_function($sym20$NESTED_COLLECTIONSUBSETFN_EXPRESSION_), Symbols.symbol_function($sym21$TRANSFORM_NESTED_COLLECTIONSUBSETFN_EXPRESSION), UNPROVIDED);
  }

  /** @param expression EL formula; assumed to be of the form
   (CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))
                                               (TheSetOf ?Y <bleh>))
   @return EL formula; a simplified version of EXPRESSION, of the form
   (CollectionSubsetFn COL (TheSetOf ?X (and <blah> <bleh[?X/?Y]>))) */
  @SubL(source = "cycl/simplifier.lisp", position = 35546) 
  public static final SubLObject transform_nested_collectionsubsetfn_expression(SubLObject expression) {
    {
      SubLObject nested_expression = cycl_utilities.formula_arg1(expression, UNPROVIDED);
      SubLObject nested_col = cycl_utilities.formula_arg1(nested_expression, UNPROVIDED);
      SubLObject nested_set = cycl_utilities.formula_arg2(nested_expression, UNPROVIDED);
      SubLObject nested_set_var = cycl_utilities.formula_arg1(nested_set, UNPROVIDED);
      SubLObject nested_set_sentence = cycl_utilities.formula_arg2(nested_set, UNPROVIDED);
      SubLObject v_set = cycl_utilities.formula_arg2(expression, UNPROVIDED);
      SubLObject set_var = cycl_utilities.formula_arg1(v_set, UNPROVIDED);
      SubLObject set_sentence = cycl_utilities.formula_arg2(v_set, UNPROVIDED);
      if (((!(set_var.equal(nested_set_var)))
           && (NIL != list_utilities.tree_find(nested_set_var, set_sentence, UNPROVIDED, UNPROVIDED)))) {
        {
          SubLObject done = NIL;
          SubLObject new_var = NIL;
          for (new_var = cycl_variables.make_el_var(Symbols.symbol_name(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31892"))); (NIL == done); new_var = cycl_variables.make_el_var(Symbols.symbol_name(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31893")))) {
            if ((NIL == list_utilities.tree_find(new_var, set_sentence, UNPROVIDED, UNPROVIDED))) {
              conses_high.nsubst(new_var, nested_set_var, set_sentence, UNPROVIDED, UNPROVIDED);
              done = T;
            }
          }
        }
      }
      return el_utilities.make_binary_formula($const22$CollectionSubsetFn, nested_col, el_utilities.make_binary_formula($const23$TheSetOf, nested_set_var, Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10661")));
    }
  }

  /** @return boolean; t iff EXPRESSION is of the form
   (CollectionSubsetFn (CollectionSubsetFn COL (TheSetOf ?X <blah>))
                                               (TheSetOf ?Y <bleh>)) */
  @SubL(source = "cycl/simplifier.lisp", position = 37040) 
  public static final SubLObject nested_collectionsubsetfn_expressionP(SubLObject expression) {
    return makeBoolean(((NIL != el_utilities.el_formula_p(expression))
           && ($const22$CollectionSubsetFn == cycl_utilities.formula_arg0(expression))
           && (NIL != el_utilities.el_formula_p(cycl_utilities.formula_arg1(expression, UNPROVIDED)))
           && ($const22$CollectionSubsetFn == cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(expression, UNPROVIDED)))
           && (NIL != el_utilities.el_formula_p(cycl_utilities.formula_arg2(expression, UNPROVIDED)))
           && ($const23$TheSetOf == cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(expression, UNPROVIDED)))
           && (NIL != el_utilities.el_formula_p(cycl_utilities.formula_arg2(cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED)))
           && ($const23$TheSetOf == cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(cycl_utilities.formula_arg1(expression, UNPROVIDED), UNPROVIDED)))));
  }

  public static final class $nested_collectionsubsetfn_expressionP$UnaryFunction extends UnaryFunction {
    public $nested_collectionsubsetfn_expressionP$UnaryFunction() { super(extractFunctionNamed("NESTED-COLLECTIONSUBSETFN-EXPRESSION?")); }
    public SubLObject processItem(SubLObject arg1) { return nested_collectionsubsetfn_expressionP(arg1); }
  }

  @SubL(source = "cycl/simplifier.lisp", position = 37769) 
  public static final SubLObject simplify_redundanciesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return czer_vars.$simplify_redundanciesP$.getDynamicValue(thread);
    }
  }

  /** dynamically bound to t when we're in @xref simplify-sequence-variables, to avoid unnecessary recursion */
  @SubL(source = "cycl/simplifier.lisp", position = 39221) 
  private static SubLSymbol $simplifying_sequence_variablesP$ = null;

  /** @return EL formula; a recursively simplified version of FORMULA wrt sequence variables. */
  @SubL(source = "cycl/simplifier.lisp", position = 40064) 
  public static final SubLObject simplify_sequence_variables(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
          SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
          try {
            czer_vars.$el_symbol_suffix_table$.bind(((NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? ((SubLObject) czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) : Hashtables.make_hash_table($int26$32, Symbols.symbol_function(EQL), UNPROVIDED)), thread);
            czer_vars.$standardize_variables_memory$.bind(((NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? ((SubLObject) czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) : NIL), thread);
            result = simplify_sequence_variables_1(formula);
          } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** A version of @xref simplify-sequence-variables to call if you already have the EL variable namespace bound. */
  @SubL(source = "cycl/simplifier.lisp", position = 40335) 
  public static final SubLObject simplify_sequence_variables_1(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == el_utilities.possibly_sentence_p(formula))) {
        return formula;
      }
      {
        SubLObject result = NIL;
        if ((NIL != $simplifying_sequence_variablesP$.getDynamicValue(thread))) {
          result = formula;
        } else {
          if ((NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym27$FORMULA_WITH_SEQUENCE_TERM_), formula, NIL, UNPROVIDED))) {
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30666"))) {
              {
                SubLObject _prev_bind_0 = $simplifying_sequence_variablesP$.currentBinding(thread);
                try {
                  $simplifying_sequence_variablesP$.bind(T, thread);
                  result = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10689");
                } finally {
                  $simplifying_sequence_variablesP$.rebind(_prev_bind_0, thread);
                }
              }
            } else {
              result = NIL;
            }
          } else {
            result = formula;
          }
        }
        return result;
      }
    }
  }

  /** dynamically bound to t when we're in @xref simplify-transitive-redundancies to avoid unnecessary recursion */
  @SubL(source = "cycl/simplifier.lisp", position = 49230) 
  private static SubLSymbol $simplifying_redundanciesP$ = null;

  /** Transitive (or sort of transitive) predicates that can be used to constrain arguments, i.e. the argument must bear the relation RELN to something else, where RELN is one of these.  Assumes that they are binary and that the arg1 is constrained to bear the relation to the arg2. */
  @SubL(source = "cycl/simplifier.lisp", position = 49476) 
  private static SubLSymbol $transitive_constraint_preds$ = null;

  @SubL(source = "cycl/simplifier.lisp", position = 58288) 
  public static final SubLObject simplify_transitive_redundanciesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != simplify_redundanciesP())
             && (NIL != czer_vars.$simplify_transitive_redundanciesP$.getDynamicValue(thread))
             && (NIL == $simplifying_redundanciesP$.getDynamicValue(thread))));
    }
  }

  public static final SubLObject declare_simplifier_file() {
    //declareFunction("lift_disjuncts", "LIFT-DISJUNCTS", 1, 0, false);
    declareFunction("nlift_disjuncts", "NLIFT-DISJUNCTS", 1, 0, false);
    declareFunction("disjoin", "DISJOIN", 1, 1, false);
    declareFunction("ndisjoin", "NDISJOIN", 1, 1, false);
    //declareFunction("simplify_unary_junct", "SIMPLIFY-UNARY-JUNCT", 1, 0, false);
    //declareFunction("simplify_unary_juncts", "SIMPLIFY-UNARY-JUNCTS", 1, 0, false);
    //declareFunction("simplify_duplicate_juncts", "SIMPLIFY-DUPLICATE-JUNCTS", 1, 0, false);
    //declareFunction("lift_conjuncts", "LIFT-CONJUNCTS", 1, 0, false);
    //declareFunction("nlift_conjuncts", "NLIFT-CONJUNCTS", 1, 0, false);
    //declareFunction("conjoin", "CONJOIN", 1, 1, false);
    //declareFunction("nconjoin", "NCONJOIN", 1, 1, false);
    //declareFunction("lift_conjuncts_recursive", "LIFT-CONJUNCTS-RECURSIVE", 1, 0, false);
    //declareFunction("liftable_conjunctsP", "LIFTABLE-CONJUNCTS?", 1, 0, false);
    //declareFunction("simplify_el_syntax", "SIMPLIFY-EL-SYNTAX", 1, 1, false);
    //declareFunction("try_to_simplify_non_wff_into_wff", "TRY-TO-SIMPLIFY-NON-WFF-INTO-WFF", 1, 2, false);
    declareFunction("simplify_cycl_sentence_deep", "SIMPLIFY-CYCL-SENTENCE-DEEP", 1, 1, false);
    declareFunction("simplify_cycl_sentence", "SIMPLIFY-CYCL-SENTENCE", 1, 1, false);
    declareFunction("simplify_cycl_sentence_syntax", "SIMPLIFY-CYCL-SENTENCE-SYNTAX", 1, 1, false);
    declareFunction("simplify_cycl_sentence_int", "SIMPLIFY-CYCL-SENTENCE-INT", 1, 1, false); new $simplify_cycl_sentence_int$UnaryFunction(); new $simplify_cycl_sentence_int$BinaryFunction();
    //declareFunction("simplify_true_sentence", "SIMPLIFY-TRUE-SENTENCE", 1, 1, false);
    //declareFunction("simplify_exception", "SIMPLIFY-EXCEPTION", 1, 1, false);
    declareFunction("simplify_cycl_literal_syntax", "SIMPLIFY-CYCL-LITERAL-SYNTAX", 1, 1, false);
    declareFunction("simplify_cycl_literal", "SIMPLIFY-CYCL-LITERAL", 1, 1, false);
    declareFunction("simplify_cycl_literal_int", "SIMPLIFY-CYCL-LITERAL-INT", 1, 1, false);
    //declareFunction("distributes_out_of_argP", "DISTRIBUTES-OUT-OF-ARG?", 3, 1, false);
    declareFunction("simplify_distributing_out_args", "SIMPLIFY-DISTRIBUTING-OUT-ARGS", 1, 0, false);
    declareFunction("simplify_cycl_literal_terms", "SIMPLIFY-CYCL-LITERAL-TERMS", 1, 1, false);
    //declareFunction("simplify_mt_literal_terms", "SIMPLIFY-MT-LITERAL-TERMS", 2, 0, false);
    declareFunction("simplify_cycl_literal_terms_int", "SIMPLIFY-CYCL-LITERAL-TERMS-INT", 1, 1, false);
    declareFunction("simplify_cycl_term", "SIMPLIFY-CYCL-TERM", 1, 1, false);
    //declareFunction("el_negate", "EL-NEGATE", 1, 0, false);
    declareFunction("simplify_cycl_negation", "SIMPLIFY-CYCL-NEGATION", 1, 1, false);
    declareFunction("simplify_cycl_conjunction", "SIMPLIFY-CYCL-CONJUNCTION", 1, 1, false);
    declareFunction("simplify_cycl_disjunction", "SIMPLIFY-CYCL-DISJUNCTION", 1, 1, false);
    declareFunction("simplify_cycl_disjunction_int", "SIMPLIFY-CYCL-DISJUNCTION-INT", 1, 1, false);
    declareFunction("simplify_cycl_implication", "SIMPLIFY-CYCL-IMPLICATION", 1, 1, false);
    //declareFunction("equal_implication_argsP", "EQUAL-IMPLICATION-ARGS?", 1, 1, false);
    //declareFunction("simplify_cycl_universal", "SIMPLIFY-CYCL-UNIVERSAL", 1, 0, false);
    declareFunction("simplify_cycl_existential", "SIMPLIFY-CYCL-EXISTENTIAL", 1, 0, false);
    //declareFunction("simplify_cycl_relation", "SIMPLIFY-CYCL-RELATION", 1, 0, false);
    declareFunction("simplify_special_cases", "SIMPLIFY-SPECIAL-CASES", 1, 0, false);
    declareFunction("simplify_nested_collectionsubsetfn_expression", "SIMPLIFY-NESTED-COLLECTIONSUBSETFN-EXPRESSION", 1, 0, false);
    declareFunction("transform_nested_collectionsubsetfn_expression", "TRANSFORM-NESTED-COLLECTIONSUBSETFN-EXPRESSION", 1, 0, false);
    declareFunction("nested_collectionsubsetfn_expressionP", "NESTED-COLLECTIONSUBSETFN-EXPRESSION?", 1, 0, false); new $nested_collectionsubsetfn_expressionP$UnaryFunction();
    declareFunction("simplify_redundanciesP", "SIMPLIFY-REDUNDANCIES?", 0, 0, false);
    //declareFunction("simplify_kappa_asent", "SIMPLIFY-KAPPA-ASENT", 1, 0, false);
    //declareFunction("simplify_ist_sentence", "SIMPLIFY-IST-SENTENCE", 1, 0, false);
    declareFunction("simplify_sequence_variables", "SIMPLIFY-SEQUENCE-VARIABLES", 1, 0, false);
    declareFunction("simplify_sequence_variables_1", "SIMPLIFY-SEQUENCE-VARIABLES-1", 1, 0, false);
    //declareFunction("simplify_sequence_variables_int", "SIMPLIFY-SEQUENCE-VARIABLES-INT", 3, 0, false);
    //declareFunction("possible_sequence_var_simplification", "POSSIBLE-SEQUENCE-VAR-SIMPLIFICATION", 2, 0, false);
    //declareFunction("simplify_sequence_vars_using_kb_arityP", "SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?", 0, 0, false);
    //declareFunction("ignore_sequence_var_if_wff", "IGNORE-SEQUENCE-VAR-IF-WFF", 2, 1, false);
    //declareFunction("regularize_sequence_var_if_wff", "REGULARIZE-SEQUENCE-VAR-IF-WFF", 2, 1, false);
    //declareFunction("split_sequence_var_if_wff", "SPLIT-SEQUENCE-VAR-IF-WFF", 1, 5, false);
    //declareFunction("sequence_var_simplifiableP", "SEQUENCE-VAR-SIMPLIFIABLE?", 1, 0, false);
    //declareFunction("simplify_transitive_redundancies", "SIMPLIFY-TRANSITIVE-REDUNDANCIES", 1, 1, false);
    //declareFunction("simplify_transitive_redundancies_in_cycl_disjunction", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-IN-CYCL-DISJUNCTION", 1, 1, false);
    //declareFunction("subsumed_by_another_conjunctP", "SUBSUMED-BY-ANOTHER-CONJUNCT?", 2, 0, false);
    //declareFunction("conjunct_subsumed_by_conjunctP", "CONJUNCT-SUBSUMED-BY-CONJUNCT?", 2, 0, false);
    //declareFunction("subsumed_args_by_constsP", "SUBSUMED-ARGS-BY-CONSTS?", 3, 0, false);
    //declareFunction("subsumed_argsP", "SUBSUMED-ARGS?", 3, 0, false);
    //declareFunction("simplify_transitive_redundancies_in_disjunction", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-IN-DISJUNCTION", 1, 0, false);
    //declareFunction("necessary_constraint_dict", "NECESSARY-CONSTRAINT-DICT", 2, 0, false);
    //declareFunction("transitive_constraint_dict", "TRANSITIVE-CONSTRAINT-DICT", 2, 0, false);
    //declareFunction("transitive_constraint_raw_info", "TRANSITIVE-CONSTRAINT-RAW-INFO", 1, 0, false);
    declareFunction("simplify_transitive_redundanciesP", "SIMPLIFY-TRANSITIVE-REDUNDANCIES?", 0, 0, false);
    //declareFunction("simplify_transitive_redundancies_old", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-OLD", 2, 0, false);
    //declareFunction("simplify_transitive_redundancies_in_disjunction_old", "SIMPLIFY-TRANSITIVE-REDUNDANCIES-IN-DISJUNCTION-OLD", 2, 0, false);
    //declareFunction("simplify_number_expression", "SIMPLIFY-NUMBER-EXPRESSION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_simplifier_file() {
    $simplifying_sequence_variablesP$ = defparameter("*SIMPLIFYING-SEQUENCE-VARIABLES?*", NIL);
    $simplifying_redundanciesP$ = defparameter("*SIMPLIFYING-REDUNDANCIES?*", NIL);
    $transitive_constraint_preds$ = defparameter("*TRANSITIVE-CONSTRAINT-PREDS*", $list30);
    return NIL;
  }

  public static final SubLObject setup_simplifier_file() {
        generic_testing.define_test_case_table_int($sym33$SIMPLIFY_IST_SENTENCE, list(new SubLObject[] {$kw34$TEST, NIL, $kw35$OWNER, NIL, $kw36$CLASSES, NIL, $kw37$KB, $kw38$TINY, $kw39$WORKING_, T}), $list40);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym1$SIMPLIFY_UNARY_JUNCTS = makeSymbol("SIMPLIFY-UNARY-JUNCTS");
  public static final SubLSymbol $sym2$SIMPLIFY_DUPLICATE_JUNCTS = makeSymbol("SIMPLIFY-DUPLICATE-JUNCTS");
  public static final SubLSymbol $sym3$LIFTABLE_CONJUNCTS_ = makeSymbol("LIFTABLE-CONJUNCTS?");
  public static final SubLSymbol $sym4$NLIFT_CONJUNCTS = makeSymbol("NLIFT-CONJUNCTS");
  public static final SubLSymbol $sym5$EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");
  public static final SubLSymbol $sym6$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym7$EL_WFF_ = makeSymbol("EL-WFF?");
  public static final SubLObject $const8$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const9$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLString $str10$_S_is_not_well_formed_ = makeString("~S is not well formed.");
  public static final SubLSymbol $kw11$INVALID_SENTENCE = makeKeyword("INVALID-SENTENCE");
  public static final SubLSymbol $kw12$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw13$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLSymbol $sym14$SIMPLIFY_CYCL_SENTENCE_INT = makeSymbol("SIMPLIFY-CYCL-SENTENCE-INT");
  public static final SubLObject $const15$distributesOutOfArg = constant_handles.reader_make_constant_shell(makeString("distributesOutOfArg"));
  public static final SubLSymbol $sym16$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLString $str17$You_tried_to_negate__S___That_was = makeString("You tried to negate ~S.  That was a bad idea, because it's neither a sentence nor a sentence.");
  public static final SubLSymbol $sym18$EL_DISJUNCTION_P = makeSymbol("EL-DISJUNCTION-P");
  public static final SubLList $list19 = list(constant_handles.reader_make_constant_shell(makeString("equalSymbols")));
  public static final SubLSymbol $sym20$NESTED_COLLECTIONSUBSETFN_EXPRESSION_ = makeSymbol("NESTED-COLLECTIONSUBSETFN-EXPRESSION?");
  public static final SubLSymbol $sym21$TRANSFORM_NESTED_COLLECTIONSUBSETFN_EXPRESSION = makeSymbol("TRANSFORM-NESTED-COLLECTIONSUBSETFN-EXPRESSION");
  public static final SubLObject $const22$CollectionSubsetFn = constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn"));
  public static final SubLObject $const23$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLObject $const24$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLObject $const25$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLInteger $int26$32 = makeInteger(32);
  public static final SubLSymbol $sym27$FORMULA_WITH_SEQUENCE_TERM_ = makeSymbol("FORMULA-WITH-SEQUENCE-TERM?");
  public static final SubLSymbol $kw28$SPLIT = makeKeyword("SPLIT");
  public static final SubLString $str29$Splitting_sequence_variables_into = makeString("Splitting sequence variables into other sequence variables is currently not supported. -ECA");
  public static final SubLList $list30 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLSymbol $sym31$WEAKEST_ARGS = makeSymbol("WEAKEST-ARGS");
  public static final SubLSymbol $sym32$STRONGEST_ARGS = makeSymbol("STRONGEST-ARGS");
  public static final SubLSymbol $sym33$SIMPLIFY_IST_SENTENCE = makeSymbol("SIMPLIFY-IST-SENTENCE");
  public static final SubLSymbol $kw34$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw35$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw36$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw37$KB = makeKeyword("KB");
  public static final SubLSymbol $kw38$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw39$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list40 = list(list(list(list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("BaseKB")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeString("a"), constant_handles.reader_make_constant_shell(makeString("Thing"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeString("b"), constant_handles.reader_make_constant_shell(makeString("Thing")))))), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("BaseKB")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeString("a"), constant_handles.reader_make_constant_shell(makeString("Thing")))), list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("BaseKB")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeString("b"), constant_handles.reader_make_constant_shell(makeString("Thing")))))));

  //// Initializers

  public void declareFunctions() {
    declare_simplifier_file();
  }

  public void initializeVariables() {
    init_simplifier_file();
  }

  public void runTopLevelForms() {
    setup_simplifier_file();
  }

}
