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

package  com.cyc.cycjava_1.cycl;

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
import com.cyc.cycjava_1.cycl.at_macros;
import com.cyc.cycjava_1.cycl.at_vars;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.cycl_variables;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.czer_trampolines;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.el_grammar;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.postcanonicalizer;
import com.cyc.cycjava_1.cycl.precanonicalizer;
import com.cyc.cycjava_1.cycl.simplifier;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.uncanonicalizer;
import com.cyc.cycjava_1.cycl.wff;
import com.cyc.cycjava_1.cycl.wff_macros;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class clausifier extends SubLTranslatedFile {

  //// Constructor

  private clausifier() {}
  public static final SubLFile me = new clausifier();
  public static final String myName = "com.cyc.cycjava_1.cycl.clausifier";

  //// Definitions

  /** used for standardizing EL variables in the canonicalizer */
  @SubL(source = "cycl/clausifier.lisp", position = 1166) 
  public static SubLSymbol $canonical_variable_name_stem$ = null;

  /** Whether to cache the function that converts EL sentences to CNF clausal form */
  @SubL(source = "cycl/clausifier.lisp", position = 1903) 
  public static SubLSymbol $use_cnf_cacheP$ = null;

  /** a temporary stack to record universals introduced by the clausifier */
  @SubL(source = "cycl/clausifier.lisp", position = 2024) 
  private static SubLSymbol $newly_introduced_universals$ = null;

  /** bound to the outermost implication in the do-implications recursive descent */
  @SubL(source = "cycl/clausifier.lisp", position = 2155) 
  private static SubLSymbol $outermost_implication$ = null;

  /** bound to the innermost implication in the do-implications recursive descent */
  @SubL(source = "cycl/clausifier.lisp", position = 2501) 
  private static SubLSymbol $innermost_implication$ = null;

  /** Temporary control variable, @todo hard-code to t */
  @SubL(source = "cycl/clausifier.lisp", position = 2644) 
  private static SubLSymbol $eliminate_existential_with_var_only_in_antecedentP$ = null;

  @SubL(source = "cycl/clausifier.lisp", position = 2776) 
  public static final SubLObject do_implications(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $outermost_implication$.currentBinding(thread);
          try {
            $outermost_implication$.bind(sentence, thread);
            result = do_implications_recursive(sentence);
          } finally {
            $outermost_implication$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  public static final class $do_implications$UnaryFunction extends UnaryFunction {
    public $do_implications$UnaryFunction() { super(extractFunctionNamed("DO-IMPLICATIONS")); }
    public SubLObject processItem(SubLObject arg1) { return do_implications(arg1); }
  }

  /** Removes all implications and equivalences from SENTENCE,
   returning a logically equivalent sentence.
   Converts (#$implies <form1> <form2>) to (#$or (#$not <form1>) <form2>).
   Does not simplify nested negations, disjunctions, or conjunctions. */
  @SubL(source = "cycl/clausifier.lisp", position = 2962) 
  public static final SubLObject do_implications_recursive(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_utilities.encapsulate_formulaP(sentence))) {
        if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30299"))) {
          return el_utilities.quantified_sub_sentence(sentence);
        } else {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8799");
        }
      } else if ((NIL == el_utilities.el_formula_p(sentence))) {
        return sentence;
      } else {
        {
          SubLObject seqvar = el_utilities.sequence_var(sentence, UNPROVIDED);
          SubLObject tempformula = sentence;
          SubLObject sentence_1 = ((NIL != seqvar) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30654")) : tempformula);
          SubLObject result = NIL;
          if (((NIL != el_utilities.el_implication_p(sentence_1))
               && (NIL != el_utilities.el_meets_pragmatic_requirement_p(cycl_utilities.sentence_arg2(sentence_1, UNPROVIDED))))) {
            {
              SubLObject disjunct_1 = NIL;
              {
                SubLObject _prev_bind_0 = $innermost_implication$.currentBinding(thread);
                try {
                  $innermost_implication$.bind(sentence_1, thread);
                  {
                    SubLObject _prev_bind_0_2 = control_vars.$within_ask$.currentBinding(thread);
                    try {
                      control_vars.$within_ask$.bind(T, thread);
                      disjunct_1 = el_utilities.make_negation(el_utilities.funcall_formula_arg(Symbols.symbol_function($sym3$DO_IMPLICATIONS_RECURSIVE), sentence_1, ONE_INTEGER));
                    } finally {
                      control_vars.$within_ask$.rebind(_prev_bind_0_2, thread);
                    }
                  }
                  result = el_utilities.make_disjunction(list(disjunct_1, el_utilities.funcall_formula_arg(Symbols.symbol_function($sym3$DO_IMPLICATIONS_RECURSIVE), sentence_1, TWO_INTEGER)));
                } finally {
                  $innermost_implication$.rebind(_prev_bind_0, thread);
                }
              }
            }
          } else if ((NIL != el_utilities.el_implication_p(sentence_1))) {
            {
              SubLObject disjunct_1 = NIL;
              {
                SubLObject _prev_bind_0 = $innermost_implication$.currentBinding(thread);
                try {
                  $innermost_implication$.bind(sentence_1, thread);
                  {
                    SubLObject _prev_bind_0_3 = at_vars.$within_disjunctionP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$within_negated_disjunctionP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = czer_vars.$within_negationP$.currentBinding(thread);
                    try {
                      at_vars.$within_disjunctionP$.bind(T, thread);
                      at_vars.$within_negated_disjunctionP$.bind(czer_vars.$within_negationP$.getDynamicValue(thread), thread);
                      czer_vars.$within_negationP$.bind(makeBoolean((NIL == czer_vars.$within_negationP$.getDynamicValue(thread))), thread);
                      disjunct_1 = el_utilities.make_negation(el_utilities.funcall_formula_arg(Symbols.symbol_function($sym3$DO_IMPLICATIONS_RECURSIVE), sentence_1, ONE_INTEGER));
                    } finally {
                      czer_vars.$within_negationP$.rebind(_prev_bind_2, thread);
                      at_vars.$within_negated_disjunctionP$.rebind(_prev_bind_1, thread);
                      at_vars.$within_disjunctionP$.rebind(_prev_bind_0_3, thread);
                    }
                  }
                  result = el_utilities.make_disjunction(list(disjunct_1, el_utilities.funcall_formula_arg(Symbols.symbol_function($sym3$DO_IMPLICATIONS_RECURSIVE), sentence_1, TWO_INTEGER)));
                } finally {
                  $innermost_implication$.rebind(_prev_bind_0, thread);
                }
              }
            }
          } else {
            result = el_utilities.pass_through_if_logical_op_or_quantified(Symbols.symbol_function($sym3$DO_IMPLICATIONS_RECURSIVE), sentence_1);
          }
          if ((NIL != seqvar)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30604");
          } else {
            return result;
          }
        }
      }
    }
  }

  /** A destructive version of @xref do-negations. */
  @SubL(source = "cycl/clausifier.lisp", position = 5678) 
  public static final SubLObject do_negations_destructive(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject seqvar = el_utilities.sequence_var(sentence, UNPROVIDED);
        SubLObject tempformula = sentence;
        SubLObject sentence_4 = ((NIL != seqvar) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30655")) : tempformula);
        SubLObject result = NIL;
        if ((NIL != czer_utilities.encapsulate_formulaP(sentence_4))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8800");
        } else if ((NIL == el_utilities.el_formula_p(sentence_4))) {
          result = sentence_4;
        } else if ((NIL != czer_utilities.true_negated_varP(sentence_4, UNPROVIDED))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30307");
        } else if ((NIL != czer_utilities.true_negated_formulaP(sentence_4))) {
          if ((NIL != czer_utilities.within_disjunctionP())) {
            result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30308");
          } else {
            {
              SubLObject _prev_bind_0 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
              SubLObject _prev_bind_1 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
              try {
                czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
                czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
                result = el_utilities.make_unary_formula(cycl_utilities.formula_operator(sentence_4), el_utilities.funcall_formula_arg(Symbols.symbol_function($sym4$DO_NEGATIONS_DESTRUCTIVE), sentence_4, ONE_INTEGER));
              } finally {
                czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_1, thread);
                czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else if ((NIL != el_utilities.el_implication_p(sentence_4))) {
          result = do_negations_destructive(do_implications(sentence_4));
        } else if ((NIL != el_utilities.el_negation_p(sentence_4))) {
          if ((NIL != cycl_utilities.opaque_argP(sentence_4, ONE_INTEGER))) {
            result = sentence_4;
          } else {
            {
              SubLObject new_sentence = NIL;
              {
                SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
                try {
                  czer_vars.$within_negationP$.bind(makeBoolean((NIL == czer_vars.$within_negationP$.getDynamicValue(thread))), thread);
                  new_sentence = negation_in(sentence_4);
                } finally {
                  czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
                }
              }
              if ((NIL != el_utilities.el_negation_p(new_sentence))) {
                result = new_sentence;
              } else {
                result = do_negations_destructive(new_sentence);
              }
            }
          }
        } else {
          result = el_utilities.pass_through_if_logical_op_or_quantified(Symbols.symbol_function($sym4$DO_NEGATIONS_DESTRUCTIVE), sentence_4);
        }
        if ((NIL != seqvar)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30605");
        } else {
          return result;
        }
      }
    }
  }

  public static final class $do_negations_destructive$UnaryFunction extends UnaryFunction {
    public $do_negations_destructive$UnaryFunction() { super(extractFunctionNamed("DO-NEGATIONS-DESTRUCTIVE")); }
    public SubLObject processItem(SubLObject arg1) { return do_negations_destructive(arg1); }
  }

  /** Negates SENTENCE by using the following transformations:
   <ol>
   <li>#$True becomes #$False
   <li>#$False becomes #$True
   <li>(#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>))
   <li>(#$or <form1> <form2>) becomes (#$and (#$not <form1>) (#$not <form2>))
   <li>(#$not <form1>) becomes <form1>, but <form1> is recursively simplified
   <li>(#$forAll ?X <form1>) becomes (#$thereExists ?X (#$not <form1>))
   <li>(#$thereExists ?X <form1>) becomes (#$forAll ?X (#$not <form1>))
   <li>(#$thereExistAtLeast NUM ?X <form1>) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
   <li>(#$thereExistAtMost NUM ?X <form1>) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
   <li>(#$thereExistExactly NUM ?X <form1>) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
                                                          (#$thereExistAtMost  (- NUM 1) ?X <form1>)
   </ol>
  Any sentence not meeting any of the above criteria is negated by simply wrapping a #$not around it. */
  @SubL(source = "cycl/clausifier.lisp", position = 7528) 
  public static final SubLObject negate_formula(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((sentence == $const6$True)) {
        return $const7$False;
      } else if ((sentence == $const7$False)) {
        return $const6$True;
      } else if ((NIL != czer_utilities.encapsulate_formulaP(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30311");
      } else if ((NIL != el_utilities.el_conjunction_p(sentence))) {
        return negate_conjunction(sentence);
      } else if ((NIL != el_utilities.el_disjunction_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30310");
      } else if ((NIL != el_utilities.el_negation_p(sentence))) {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$within_negationP$.currentBinding(thread);
            try {
              czer_vars.$within_negationP$.bind(makeBoolean((NIL == czer_vars.$within_negationP$.getDynamicValue(thread))), thread);
              result = negation_in(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30320"));
            } finally {
              czer_vars.$within_negationP$.rebind(_prev_bind_0, thread);
            }
          }
          return result;
        }
      } else if ((NIL != el_utilities.cycl_universal_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30322");
      } else if ((NIL != el_utilities.el_existential_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30312");
      } else if ((NIL != el_utilities.el_existential_min_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30318");
      } else if ((NIL != el_utilities.el_existential_max_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30316");
      } else if ((NIL != el_utilities.el_existential_exact_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30314");
      } else if ((NIL != czer_utilities.true_negated_varP(sentence, UNPROVIDED))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30309");
      } else if ((NIL != czer_utilities.true_negated_formulaP(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30321");
      } else if ((NIL != el_utilities.el_implication_p(sentence))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4215");
      } else {
        return el_utilities.make_negation(sentence);
      }
    }
  }

  /** Moves a negation inwards by the following transformations:
   1. (#$not #$True) becomes #$False
   2. (#$not #$False) becomes #$True
   3. (#$not (#$and <form1> <form2>)) becomes (#$or (#$not <form1>) (#$not <form2>))
   4. (#$not (#$or <form1> <form2>)) becomes (#$and (#$not <form1>) (#$not <form2>))
   5. (#$not (#$not <form1>)) becomes <form1>, but <form1> is recursively simplified
   6. (#$not (#$forAll ?X <form1>)) becomes (#$thereExists ?X (#$not <form1>))
   7. (#$not (#$thereExists ?X <form1>)) becomes (#$forAll ?X (#$not <form1>))
   8. (#$not (#$thereExistAtLeast NUM ?X <form1>)) becomes (#$thereExistAtMost (- NUM 1) ?X (#$not <form1>))
   9. (#$not (#$thereExistAtMost NUM ?X <form1>)) becomes (#$thereExistAtLeast (+ NUM 1) ?X (#$not <form1>))
  10. (#$not (#$thereExistExactly NUM ?X <form1>)) becomes (#$or (#$thereExistAtLeast (+ NUM 1) ?X <form1>)
                                                                 (#$thereExistAtMost  (- NUM 1) ?X <form1>)
  Note that negated implications or other forms are not simplified.
  If this function does make a simplification, it is guaranteed to return something that is not a negation.
  If you pass a sentence that is not a negation, it will return that sentence without any changes. */
  @SubL(source = "cycl/clausifier.lisp", position = 9949) 
  public static final SubLObject negation_in(SubLObject sentence) {
    if ((NIL == el_utilities.el_negation_p(sentence))) {
      return sentence;
    }
    return negate_formula(cycl_utilities.formula_arg1(sentence, $kw8$REGULARIZE));
  }

  /** @return EL sentence; negation of SENTENCE.
   Assumes that SENTENCE is atomic and does no simplification. */
  @SubL(source = "cycl/clausifier.lisp", position = 11925) 
  public static final SubLObject negate_atomic(SubLObject sentence) {
    return el_utilities.make_negation(sentence);
  }

  /** Assumes that CONJUNCTION is a conjunction.
   Moves negations inwards by the following transformation:
   (#$and <form1> <form2>) becomes (#$or (#$not <form1>) (#$not <form2>)) */
  @SubL(source = "cycl/clausifier.lisp", position = 12506) 
  public static final SubLObject negate_conjunction(SubLObject conjunction) {
    return simplifier.ndisjoin(Mapping.mapcar(Symbols.symbol_function($sym11$NEGATE_FORMULA), cycl_utilities.formula_args(conjunction, UNPROVIDED)), UNPROVIDED);
  }

  @SubL(source = "cycl/clausifier.lisp", position = 18552) 
  public static final SubLObject czer_explicitify_implicit_quantifiers(SubLObject sentence) {
    if ((NIL != assume_free_vars_are_existentially_boundP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30286");
    } else {
      return czer_explicitify_implicit_universal_quantifiers(sentence);
    }
  }

  /** Wraps SENTENCE in #$forAll statements (if needed) to quantify all the free variables within SENTENCE.
   Should appear within a binding of *newly-introduced-universals*
   @see explicitify-implicit-universal-quantifiers */
  @SubL(source = "cycl/clausifier.lisp", position = 18956) 
  public static final SubLObject czer_explicitify_implicit_universal_quantifiers(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject free_vars = el_utilities.sentence_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = free_vars;
        SubLObject var = NIL;
        for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
          sentence = el_utilities.make_universal(var, sentence);
          if ($newly_introduced_universals$.getDynamicValue(thread).isList()) {
            $newly_introduced_universals$.setDynamicValue(cons(var, $newly_introduced_universals$.getDynamicValue(thread)), thread);
          }
        }
      }
      return sentence;
    }
  }

  @SubL(source = "cycl/clausifier.lisp", position = 19764) 
  public static final SubLObject assume_free_vars_are_existentially_boundP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return czer_vars.$assume_free_vars_are_existentially_boundP$.getDynamicValue(thread);
    }
  }

  /** Renames all variables into a canonical order, with the innermost variables having smaller indices.
   Assumes that all universal quantification is explicit.
   Assumes that the EL variable namespace is bound.
   @todo check if the variables are already named with a prefix of *canonical-variable-name-stem* */
  @SubL(source = "cycl/clausifier.lisp", position = 20650) 
  public static final SubLObject standardize_variables(SubLObject sentence) {
    if ((NIL != el_utilities.groundP(sentence, UNPROVIDED))) {
      return sentence;
    }
    {
      SubLObject seqvar = el_utilities.sequence_var(sentence, UNPROVIDED);
      SubLObject tempformula = sentence;
      SubLObject sentence_5 = ((NIL != seqvar) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30656")) : tempformula);
      SubLObject result = NIL;
      czer_main.initialize_symbol_suffix_table(sentence_5);
      result = recursively_standardize_variables(sentence_5);
      result = czer_main.el_nununiquify_vars_int(result, T, UNPROVIDED);
      if ((NIL != seqvar)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30606");
      } else {
        return result;
      }
    }
  }

  /** Renames all quantified variables into a canonical order, with the innermost variables having smaller indices.
   Variables at the same depth are ordered from left to right.
   Assumes that *standardize-variables-memory* is bound.
   Also assumes that implications and other weird logical operators have been removed. */
  @SubL(source = "cycl/clausifier.lisp", position = 21316) 
  public static final SubLObject recursively_standardize_variables(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == el_utilities.el_formula_p(sentence))) {
        return sentence;
      } else if (((NIL != cycl_grammar.fast_escape_quote_term_p(sentence))
          || (NIL != cycl_grammar.fast_quasi_quote_term_p(sentence)))) {
        {
          SubLObject standardized = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
              czer_vars.$inside_quote$.bind(NIL, thread);
              standardized = el_utilities.make_unary_formula(cycl_utilities.formula_arg0(sentence), recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, UNPROVIDED)));
            } finally {
              czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
          }
          return standardized;
        }
      } else if ((NIL != cycl_grammar.fast_quote_term_p(sentence))) {
        if ((NIL == list_utilities.tree_find_if($sym17$CYC_VAR_, sentence, UNPROVIDED))) {
          return sentence;
        }
        {
          SubLObject standardized = NIL;
          {
            SubLObject _prev_bind_0 = czer_vars.$inside_quote$.currentBinding(thread);
            try {
              czer_vars.$inside_quote$.bind(T, thread);
              standardized = el_utilities.make_unary_formula($const18$Quote, recursively_standardize_variables(cycl_utilities.formula_arg1(sentence, UNPROVIDED)));
            } finally {
              czer_vars.$inside_quote$.rebind(_prev_bind_0, thread);
            }
          }
          return standardized;
        }
      } else if ((NIL != el_utilities.possibly_el_regularly_quantified_sentence_p(sentence))) {
        thread.resetMultipleValues();
        {
          SubLObject quantifier = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30676");
          SubLObject old_var = thread.secondMultipleValue();
          SubLObject subform = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject standardized_subform = el_utilities.funcall_formula_arg($sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, TWO_INTEGER);
            SubLObject new_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30293");
            SubLObject replace_old_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30295");
            SubLObject replace_new_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30296");
            SubLObject standardized = NIL;
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30323");
            {
              SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
              try {
                czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                standardized = el_utilities.make_binary_formula(quantifier, new_var, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29701"));
              } finally {
                czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
              }
            }
            return standardized;
          }
        }
      } else if ((NIL != el_utilities.el_bounded_existential_p(sentence))) {
        thread.resetMultipleValues();
        {
          SubLObject quantifier = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30693");
          SubLObject bound = thread.secondMultipleValue();
          SubLObject old_var = thread.thirdMultipleValue();
          SubLObject subform = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject standardized_subform = el_utilities.funcall_formula_arg($sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, THREE_INTEGER);
            SubLObject new_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30294");
            SubLObject replace_old_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30297");
            SubLObject replace_new_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30298");
            SubLObject standardized = NIL;
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30324");
            {
              SubLObject _prev_bind_0 = czer_vars.$canonicalize_variablesP$.currentBinding(thread);
              try {
                czer_vars.$canonicalize_variablesP$.bind(NIL, thread);
                standardized = el_utilities.make_ternary_formula(quantifier, bound, new_var, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29702"));
              } finally {
                czer_vars.$canonicalize_variablesP$.rebind(_prev_bind_0, thread);
              }
            }
            return standardized;
          }
        }
      } else if ((NIL != czer_trampolines.czer_scoping_formulaP(sentence))) {
        {
          SubLObject scoped_vars = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30890");
          SubLObject unique_vars = Mapping.mapcar($sym20$EL_UNIQUIFY_STANDARDIZE, scoped_vars);
          SubLObject scoping_args = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30891");
          SubLObject replace_scoped_vars = Mapping.mapcar($sym21$EL_VAR_WITHOUT_QUOTE, scoped_vars);
          SubLObject replace_unique_vars = Mapping.mapcar($sym21$EL_VAR_WITHOUT_QUOTE, unique_vars);
          SubLObject new_sentence = NIL;
          SubLObject terms = cycl_utilities.formula_terms(sentence, $kw22$IGNORE);
          SubLObject list_var = NIL;
          SubLObject arg = NIL;
          SubLObject argnum = NIL;
          for (list_var = terms, arg = list_var.first(), argnum = ZERO_INTEGER; (NIL != list_var); list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED))) {
              new_sentence = cons(arg, new_sentence);
            } else {
              new_sentence = cons(el_utilities.funcall_formula_arg($sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence, argnum), new_sentence);
            }
          }
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30325");
          return Sequences.nreverse(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29720"));
        }
      } else {
        return el_utilities.pass_through_if_relation_syntax($sym19$RECURSIVELY_STANDARDIZE_VARIABLES, sentence);
      }
    }
  }

  public static final class $recursively_standardize_variables$UnaryFunction extends UnaryFunction {
    public $recursively_standardize_variables$UnaryFunction() { super(extractFunctionNamed("RECURSIVELY-STANDARDIZE-VARIABLES")); }
    public SubLObject processItem(SubLObject arg1) { return recursively_standardize_variables(arg1); }
  }

  /** private dynamic variable used for quantification information */
  @SubL(source = "cycl/clausifier.lisp", position = 27993) 
  private static SubLSymbol $quantifier_info_list$ = null;

  /** Removes all existentials by replacing them with Skolem constants or Skolem sentences. */
  @SubL(source = "cycl/clausifier.lisp", position = 28147) 
  public static final SubLObject existentials_out(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != czer_vars.$turn_existentials_into_skolemsP$.getDynamicValue(thread))) {
        if ((NIL == list_utilities.tree_find_if($sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, sentence, UNPROVIDED))) {
          return sentence;
        }
        {
          SubLObject error = NIL;
          try {
            try {
              try {
                {
                  SubLObject _prev_bind_0 = $quantifier_info_list$.currentBinding(thread);
                  try {
                    $quantifier_info_list$.bind(NIL, thread);
                    sentence = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30300");
                  } finally {
                    $quantifier_info_list$.rebind(_prev_bind_0, thread);
                  }
                }
              } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $kw27$QUANTIFIED_SEQUENCE_VARIABLE);
              }
            } catch (Throwable ccatch_env_var) {
              error = Errors.handleThrowable(ccatch_env_var, $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE);
            }
          } catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE);
          }
          if ((NIL != error)) {
            if ((NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8023");
            }
            return NIL;
          }
        }
      }
      return sentence;
    }
  }

  /** removes all #$forAll statements from SENTENCE, unless they are inside an atomic sentence.
   Assumes that the only logical operators in SENTENCE are #$forAll, #$and, #$or, and #$not,
   and that #$not only appears around an atomic sentence.
   Also assumes that the outermost #$ist's have been removed. */
  @SubL(source = "cycl/clausifier.lisp", position = 41571) 
  public static final SubLObject universals_out(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.cycl_universal_p(sentence))) {
        {
          SubLObject result = el_utilities.funcall_formula_arg($sym43$UNIVERSALS_OUT, sentence, el_utilities.quantified_sub_sentence_argnum(sentence));
          if ((NIL != czer_vars.$implicitify_universalsP$.getDynamicValue(thread))) {
            return result;
          } else if ((!($newly_introduced_universals$.getDynamicValue(thread).isList()))) {
            return result;
          } else if ((NIL != conses_high.member(el_utilities.quantified_var(sentence), $newly_introduced_universals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
            return result;
          } else {
            return el_utilities.make_universal(el_utilities.quantified_var(sentence), result);
          }
        }
      } else if (((NIL != el_utilities.el_conjunction_p(sentence))
          || (NIL != el_utilities.el_disjunction_p(sentence)))) {
        return el_utilities.pass_through_if_junction($sym43$UNIVERSALS_OUT, sentence);
      } else if (((NIL != el_utilities.possibly_el_quantified_sentence_p(sentence))
          || (NIL != el_utilities.el_logical_operator_formula_p(sentence)))) {
        return sentence;
      } else if ((NIL != cycl_grammar.cycl_literal_p(sentence))) {
        return sentence;
      } else if ((NIL != el_grammar.el_non_formula_sentence_p(sentence))) {
        return sentence;
      } else {
        el_utilities.el_error(FOUR_INTEGER, $str44$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED);
        return sentence;
      }
    }
  }

  public static final class $universals_out$UnaryFunction extends UnaryFunction {
    public $universals_out$UnaryFunction() { super(extractFunctionNamed("UNIVERSALS-OUT")); }
    public SubLObject processItem(SubLObject arg1) { return universals_out(arg1); }
  }

  @SubL(source = "cycl/clausifier.lisp", position = 42997) 
  public static final SubLObject disjunctions_in(SubLObject sentence) {
    if ((NIL != bad_exponential_disjunctionP(sentence))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30304");
    } else {
      return disjunctions_in_int(sentence);
    }
  }

  /** Moves disjunctions inwards inside SENTENCE by repeatedly applying the following transformation:
   (#$or <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form1> <form2>) (#$or <form1> <form3>)).
   (#$or <form0> <form1> (#$and <form2> <form3>)) becomes (#$and (#$or <form0> <form1> <form2>) (#$or <form0> <form1> <form3>)).
   Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
   and that #$not only encloses atomic sentences.
   The order is scrambled when the disjunctions are pushed inwards.
   @note this is exponential in the worst case -- example:
    (or
      (and A1 A2 A3)
      (and B1 B2 B3)
      ...
      (and Z1 Z2 Z3))
   will take O(3^26).  In general for clauses of this form it is
   O(K^N) where K is the average number of conjuncts and N is the number of disjuncts. */
  @SubL(source = "cycl/clausifier.lisp", position = 43272) 
  public static final SubLObject disjunctions_in_int(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if ((NIL != el_utilities.el_conjunction_p(sentence))) {
              result = el_utilities.nmap_formula_args($sym45$DISJUNCTIONS_IN, sentence, UNPROVIDED);
            } else if ((NIL != el_utilities.el_disjunction_p(sentence))) {
              if ((NIL != cycl_utilities.opaque_argP(sentence, ONE_INTEGER))) {
                result = sentence;
              } else {
                sentence = el_utilities.nmap_formula_args($sym45$DISJUNCTIONS_IN, sentence, UNPROVIDED);
                {
                  SubLObject nested_conjunction = first_conjunction(cycl_utilities.formula_args(sentence, UNPROVIDED));
                  if ((NIL != nested_conjunction)) {
                    {
                      SubLObject other_disjuncts = Sequences.delete(nested_conjunction, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      if ((NIL != other_disjuncts)) {
                        {
                          SubLObject new_conjuncts = NIL;
                          SubLObject args = cycl_utilities.formula_args(nested_conjunction, $kw22$IGNORE);
                          SubLObject cdolist_list_var = args;
                          SubLObject conjunct = NIL;
                          for (conjunct = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunct = cdolist_list_var.first()) {
                            {
                              SubLObject new_disjuncts = cons(conjunct, other_disjuncts);
                              new_conjuncts = cons(simplifier.disjoin(new_disjuncts, UNPROVIDED), new_conjuncts);
                            }
                          }
                          result = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10673");
                        }
                      } else {
                        result = nested_conjunction;
                      }
                    }
                  } else {
                    result = sentence;
                  }
                }
              }
            } else if (((NIL != el_utilities.possibly_el_quantified_sentence_p(sentence))
                || (NIL != el_utilities.el_logical_operator_formula_p(sentence)))) {
              result = sentence;
            } else if ((NIL != el_grammar.el_literal_p(sentence))) {
              result = sentence;
            } else if ((NIL != el_grammar.el_non_formula_sentence_p(sentence))) {
              result = sentence;
            } else {
              el_utilities.el_error(FOUR_INTEGER, $str46$Got_the_unexpected_sentence__S_in, sentence, UNPROVIDED, UNPROVIDED);
              result = sentence;
            }
          } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Returns the first conjunction in the list SENTENCES. */
  @SubL(source = "cycl/clausifier.lisp", position = 45624) 
  public static final SubLObject first_conjunction(SubLObject sentences) {
    return Sequences.find_if(Symbols.symbol_function($sym47$EL_CONJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** @return booleanp; whether SENTENCE is too explosive to be put
into CNF using the straightforward algorithm. */
  @SubL(source = "cycl/clausifier.lisp", position = 45778) 
  public static final SubLObject bad_exponential_disjunctionP(SubLObject sentence) {
    if ((NIL != el_utilities.el_disjunction_p(sentence))) {
      return bad_exponential_sentenceP(sentence, $sym47$EL_CONJUNCTION_P);
    }
    return NIL;
  }

  /** The K^N over which a wff violation will be thrown rather than
descending into exponential madness. */
  @SubL(source = "cycl/clausifier.lisp", position = 46235) 
  private static SubLSymbol $czer_bad_exponential_threshold$ = null;

  @SubL(source = "cycl/clausifier.lisp", position = 46400) 
  public static final SubLObject bad_exponential_sentenceP(SubLObject sentence, SubLObject arg_test_func) {
    {
      SubLObject n = Sequences.count_if(arg_test_func, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if (n.numGE(FIVE_INTEGER)) {
        {
          SubLObject problem_args = list_utilities.remove_if_not(arg_test_func, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          if ((NIL != problem_args)) {
            {
              SubLObject k = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30283");
              if (k.numG(ONE_INTEGER)) {
                {
                  SubLObject kXn = Numbers.expt(k, n);
                  if (kXn.numG($czer_bad_exponential_threshold$.getGlobalValue())) {
                    return T;
                  }
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Assumes that SENTENCE is a subset of CNF (either in cnf, a disjunction, or a literal)
   and returns a version of SENTENCE that is in strict CNF form.
   For example, (#$genls #$Dog #$Mammal) would be forced into (#$and (#or (#$genls #$Dog #$Mammal))).
   Also, it scrambles the order of the arguments inside the conjunctions and disjunctions. */
  @SubL(source = "cycl/clausifier.lisp", position = 46945) 
  public static final SubLObject force_into_cnf(SubLObject sentence) {
    if ((NIL == el_utilities.el_conjunction_p(sentence))) {
      sentence = el_utilities.make_conjunction(list(sentence));
    }
    {
      SubLObject new_args = NIL;
      SubLObject args = cycl_utilities.formula_args(sentence, $kw22$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
        if ((NIL != el_utilities.el_disjunction_p(arg))) {
          new_args = cons(arg, new_args);
        } else {
          new_args = cons(el_utilities.make_disjunction(list(arg)), new_args);
        }
      }
      return el_utilities.make_conjunction(new_args);
    }
  }

  /** @param sentence EL sentence; a conjunction of possibly disjoined literals.
   @return clauses; a list of cnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)
   Removes #$and, #$or and #$not while translating a sentence of the form 
   (#$and (#$or <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...) 
          (#$or (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...) 
          ...) 
   into
   ( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))
     ((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))
     ...
   ) */
  @SubL(source = "cycl/clausifier.lisp", position = 47685) 
  public static final SubLObject cnf_operators_out(SubLObject sentence) {
    if (((NIL == sentence)
        || (sentence == $const6$True)
        || (sentence == $const7$False))) {
      return sentence;
    }
    if ((NIL != cycl_variables.el_varP(sentence))) {
      sentence = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8802");
    }
    sentence = force_into_cnf(sentence);
    if ((NIL == el_utilities.el_conjunction_p(sentence))) {
      el_utilities.el_error(FOUR_INTEGER, $str51$_s_is_not_a_conjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED);
      return NIL;
    }
    {
      SubLObject clause_list = NIL;
      SubLObject args = cycl_utilities.formula_args(sentence, $kw22$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject conjunct = NIL;
      for (conjunct = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunct = cdolist_list_var.first()) {
        if ((NIL == el_utilities.el_disjunction_p(conjunct))) {
          el_utilities.el_error(FOUR_INTEGER, $str52$_s_is_not_a_disjunction__so__S_is, conjunct, sentence, UNPROVIDED);
          return NIL;
        }
        clause_list = cons(package_xnf_clause(cycl_utilities.formula_args(conjunct, UNPROVIDED)), clause_list);
      }
      return Sequences.nreverse(clause_list);
    }
  }

  /** A destructive version of @xref package-cnf-clause. */
  @SubL(source = "cycl/clausifier.lisp", position = 49483) 
  public static final SubLObject npackage_cnf_clause(SubLObject clause) {
    return npackage_xnf_clause(clause);
  }

  @SubL(source = "cycl/clausifier.lisp", position = 49655) 
  public static final SubLObject conjunctions_in(SubLObject sentence) {
    if ((NIL != bad_exponential_conjunctionP(sentence))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30303");
    } else {
      return conjunctions_in_int(sentence);
    }
  }

  public static final class $conjunctions_in$UnaryFunction extends UnaryFunction {
    public $conjunctions_in$UnaryFunction() { super(extractFunctionNamed("CONJUNCTIONS-IN")); }
    public SubLObject processItem(SubLObject arg1) { return conjunctions_in(arg1); }
  }

  /** Moves conjunctions inwards inside SENTENCE by repeatedly applying the following transformation:
   (#$and <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form1> <form2>) (#$and <form1> <form3>)).
   (#$and <form0> <form1> (#$or <form2> <form3>)) becomes (#$or (#$and <form0> <form1> <form2>) (#$and <form0> <form1> <form3>)).
   Assumes that the only logical operators in SENTENCE are #$and, #$or, and #$not,
   and that #$not only encloses atomic sentences.
   The order is scrambled when the conjunctions are pushed inwards.
   @note this is exponential in the worse case, see disjunctions-in for details. */
  @SubL(source = "cycl/clausifier.lisp", position = 49994) 
  public static final SubLObject conjunctions_in_int(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if ((NIL != el_utilities.el_disjunction_p(sentence))) {
              result = el_utilities.nmap_formula_args($sym53$CONJUNCTIONS_IN, sentence, UNPROVIDED);
            } else if ((NIL != el_utilities.el_conjunction_p(sentence))) {
              if ((NIL != cycl_utilities.opaque_argP(sentence, ONE_INTEGER))) {
                result = sentence;
              } else {
                sentence = el_utilities.nmap_formula_args($sym53$CONJUNCTIONS_IN, sentence, UNPROVIDED);
                {
                  SubLObject nested_disjunction = first_disjunction(cycl_utilities.formula_args(sentence, UNPROVIDED));
                  if ((NIL != nested_disjunction)) {
                    {
                      SubLObject other_conjuncts = Sequences.delete(nested_disjunction, cycl_utilities.formula_args(sentence, UNPROVIDED), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      if ((NIL != other_conjuncts)) {
                        {
                          SubLObject new_disjuncts = NIL;
                          SubLObject args = cycl_utilities.formula_args(nested_disjunction, $kw22$IGNORE);
                          SubLObject cdolist_list_var = args;
                          SubLObject disjunct = NIL;
                          for (disjunct = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), disjunct = cdolist_list_var.first()) {
                            {
                              SubLObject new_conjuncts = cons(disjunct, other_conjuncts);
                              new_disjuncts = cons(Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10655"), new_disjuncts);
                            }
                          }
                          result = simplifier.ndisjoin(list_utilities.nmapcar($sym53$CONJUNCTIONS_IN, new_disjuncts), UNPROVIDED);
                        }
                      } else {
                        result = nested_disjunction;
                      }
                    }
                  } else {
                    result = sentence;
                  }
                }
              }
            } else if (((NIL != el_utilities.possibly_el_quantified_sentence_p(sentence))
                || (NIL != el_utilities.el_logical_operator_formula_p(sentence)))) {
              result = sentence;
            } else if ((NIL != el_grammar.el_literal_p(sentence))) {
              result = sentence;
            } else if ((NIL != el_grammar.el_non_formula_sentence_p(sentence))) {
              result = sentence;
            } else {
              el_utilities.el_error(FOUR_INTEGER, $str54$Got_the_unexpected_formula__S_in_, sentence, UNPROVIDED, UNPROVIDED);
              result = sentence;
            }
          } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Returns the first disjunction in the list SENTENCES. */
  @SubL(source = "cycl/clausifier.lisp", position = 52096) 
  public static final SubLObject first_disjunction(SubLObject sentences) {
    return Sequences.find_if(Symbols.symbol_function($sym55$EL_DISJUNCTION_P), sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** @return booleanp; whether SENTENCE is too explosive to be put
into DNF using the straightforward algorithm. */
  @SubL(source = "cycl/clausifier.lisp", position = 52283) 
  public static final SubLObject bad_exponential_conjunctionP(SubLObject sentence) {
    if ((NIL != el_utilities.el_conjunction_p(sentence))) {
      return bad_exponential_sentenceP(sentence, $sym55$EL_DISJUNCTION_P);
    }
    return NIL;
  }

  /** Assumes that SENTENCE is a subset of DNF (either in dnf, a conjunction, or a literal)
   and returns a version of SENTENCE that is in strict DNF form.
   For example, (#$genls #$Dog #$Mammal) would be forced into (#$or (#$and (#$genls #$Dog #$Mammal))).
   Also, it scrambles the order of the arguments inside the disjunctions and conjunctions.
   @hack this function is dumb. */
  @SubL(source = "cycl/clausifier.lisp", position = 52740) 
  public static final SubLObject force_into_dnf(SubLObject sentence) {
    if ((NIL == el_utilities.el_disjunction_p(sentence))) {
      sentence = el_utilities.make_disjunction(list(sentence));
    }
    {
      SubLObject new_args = NIL;
      SubLObject args = cycl_utilities.formula_args(sentence, $kw22$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
        if ((NIL != el_utilities.el_conjunction_p(arg))) {
          new_args = cons(arg, new_args);
        } else {
          new_args = cons(el_utilities.make_conjunction(list(arg)), new_args);
        }
      }
      return el_utilities.make_disjunction(new_args);
    }
  }

  /** @param sentence EL sentence; a disjunction of possibly conjoined literals.
   @return clauses; a list of dnf-clauses, each of which is a pair: ( (<neg-lits> <pos-lits>) ...)
   Removes #$or, #$and and #$not while translating a sentence of the form 
   (#$or (#$and <pos-lit1a> (#$not <neg-lit1a>) <pos-lit1b> ...) 
         (#$and (#$not <neg-lit2a>) <pos-lit2a> (#$not <neg-lit2b>) ...) 
          ...) 
   into
   ( ((<neg-lit1a> ...) (<pos-lit1a> <pos-lit1b> ...))
     ((<neg-lit2a> <neg-lit2b> ...) (<pos-lit2a> ...))
     ...
   ) */
  @SubL(source = "cycl/clausifier.lisp", position = 53483) 
  public static final SubLObject dnf_operators_out(SubLObject sentence) {
    if (((NIL == sentence)
        || (sentence == $const6$True)
        || (sentence == $const7$False))) {
      return sentence;
    }
    if ((NIL != cycl_variables.el_varP(sentence))) {
      sentence = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8803");
    }
    sentence = force_into_dnf(sentence);
    if ((NIL == el_utilities.el_disjunction_p(sentence))) {
      el_utilities.el_error(FOUR_INTEGER, $str57$_s_is_not_a_disjunction__so_it_is, sentence, UNPROVIDED, UNPROVIDED);
      return NIL;
    }
    {
      SubLObject clause_list = NIL;
      SubLObject args = cycl_utilities.formula_args(sentence, $kw22$IGNORE);
      SubLObject cdolist_list_var = args;
      SubLObject disjunct = NIL;
      for (disjunct = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), disjunct = cdolist_list_var.first()) {
        if ((NIL == el_utilities.el_conjunction_p(disjunct))) {
          el_utilities.el_error(FOUR_INTEGER, $str58$_s_is_not_a_conjunction__so__S_is, disjunct, sentence, UNPROVIDED);
          return NIL;
        }
        clause_list = cons(package_xnf_clause(cycl_utilities.formula_args(disjunct, UNPROVIDED)), clause_list);
      }
      return Sequences.nreverse(clause_list);
    }
  }

  /** Stores the sentence provided as input to el-xnf.  Used while reporting wff violations. */
  @SubL(source = "cycl/clausifier.lisp", position = 55248) 
  private static SubLSymbol $clausifier_input_sentence$ = null;

  /** Stores the mt provided as input to el-xnf.  Used while reporting wff violations. */
  @SubL(source = "cycl/clausifier.lisp", position = 55523) 
  private static SubLSymbol $clausifier_input_mt$ = null;

  /** Transforms an EL sentence so that it is ready to be put into either CNF or DNF form.
   At the end of this step, the only operators in SENTENCE will be #$and, #$or, and #$not,
   and #$not will only enclose atomic sentences.
   Most transformations are syntactic except for the precanonicalizations.
   @return 0 EL sentence
   Assumes the EL var namespace is bound. */
  @SubL(source = "cycl/clausifier.lisp", position = 55907) 
  public static final SubLObject el_xnf(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $clausifier_input_sentence$.currentBinding(thread);
        SubLObject _prev_bind_1 = $clausifier_input_mt$.currentBinding(thread);
        try {
          $clausifier_input_sentence$.bind(sentence, thread);
          $clausifier_input_mt$.bind(mt, thread);
          thread.resetMultipleValues();
          {
            SubLObject sentence_6 = el_xnf_int(sentence, mt);
            SubLObject mt_7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_6;
            mt = mt_7;
          }
          thread.resetMultipleValues();
          {
            SubLObject sentence_8 = postcanonicalizer.postcanonicalizations(sentence, mt);
            SubLObject mt_9 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_8;
            mt = mt_9;
          }
        } finally {
          $clausifier_input_mt$.rebind(_prev_bind_1, thread);
          $clausifier_input_sentence$.rebind(_prev_bind_0, thread);
        }
      }
      sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
      return Values.values(sentence, mt);
    }
  }

  @SubL(source = "cycl/clausifier.lisp", position = 56778) 
  public static final SubLObject el_xnf_int(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject sentence_10 = precanonicalizer.precanonicalizations(sentence, mt);
        SubLObject mt_11 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_10;
        mt = mt_11;
      }
      sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
      sentence = do_implications(sentence);
      sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
      sentence = do_negations_destructive(sentence);
      sentence = standardize_variables(sentence);
      {
        SubLObject _prev_bind_0 = $newly_introduced_universals$.currentBinding(thread);
        try {
          $newly_introduced_universals$.bind(NIL, thread);
          sentence = czer_explicitify_implicit_quantifiers(sentence);
          sentence = existentials_out(sentence);
          sentence = universals_out(sentence);
        } finally {
          $newly_introduced_universals$.rebind(_prev_bind_0, thread);
        }
      }
      return Values.values(sentence, mt);
    }
  }

  /** @param clause list; a list of literals.
   Goes through CLAUSE looking for negated atomic sentences.
   It puts them into <neg-lits> and puts the rest into <pos-lits>.
   @return list; (<neg-lits> <pos-lits>) */
  @SubL(source = "cycl/clausifier.lisp", position = 57815) 
  public static final SubLObject package_xnf_clause(SubLObject clause) {
    {
      SubLObject neg_lits = Mapping.mapcar(Symbols.symbol_function($sym60$FORMULA_ARG1), el_utilities.el_negative_sentences(clause));
      SubLObject pos_lits = el_utilities.el_positive_sentences(clause);
      return clauses.make_xnf(neg_lits, pos_lits);
    }
  }

  /** A destructive version of @xref package-xnf-clause. */
  @SubL(source = "cycl/clausifier.lisp", position = 58234) 
  public static final SubLObject npackage_xnf_clause(SubLObject clause) {
    {
      SubLObject neg_lits = list_utilities.nmapcar(Symbols.symbol_function($sym60$FORMULA_ARG1), el_utilities.el_negative_sentences(clause));
      SubLObject pos_lits = el_utilities.el_positive_sentences(clause);
      return clauses.make_xnf(neg_lits, pos_lits);
    }
  }

  @SubL(source = "cycl/clausifier.lisp", position = 58497) 
  public static final SubLObject canon_fast_gafP(SubLObject sentence, SubLObject mt) {
    {
      SubLObject seqvar = el_utilities.sequence_var(sentence, UNPROVIDED);
      SubLObject tempformula = ((NIL != seqvar) ? ((SubLObject) ConsesLow.append(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30657"), list(seqvar))) : sentence);
      SubLObject sentence_12 = tempformula;
      return makeBoolean(((NIL != el_utilities.el_formula_p(sentence_12))
             && (NIL == Sequences.find_if(Symbols.symbol_function($sym15$EL_FORMULA_P), sentence_12, UNPROVIDED, UNPROVIDED, UNPROVIDED))
             && (NIL == Sequences.find_if(Symbols.symbol_function($sym61$EL_VAR_), sentence_12, UNPROVIDED, UNPROVIDED, UNPROVIDED))
             && (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(sentence_12)))
             && (NIL == precanonicalizer.precanonicalizationsP(sentence_12, mt, T))));
    }
  }

  /** Constructively transforms an EL sentence into conjunctive normal form.
   Returns a well-formed EL sentence, or NIL if there was an error.
   Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
   @return 0 EL sentence */
  @SubL(source = "cycl/clausifier.lisp", position = 58919) 
  public static final SubLObject el_cnf(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
        SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
        try {
          czer_vars.$el_symbol_suffix_table$.bind(((NIL != czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) ? ((SubLObject) czer_vars.$el_symbol_suffix_table$.getDynamicValue(thread)) : Hashtables.make_hash_table($int16$32, Symbols.symbol_function(EQL), UNPROVIDED)), thread);
          czer_vars.$standardize_variables_memory$.bind(((NIL != czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) ? ((SubLObject) czer_vars.$standardize_variables_memory$.getDynamicValue(thread)) : NIL), thread);
          thread.resetMultipleValues();
          {
            SubLObject sentence_13 = el_cnf_int(sentence, mt, NIL);
            SubLObject mt_14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_13;
            mt = mt_14;
          }
        } finally {
          czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
          czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
        }
      }
      return Values.values(sentence, mt);
    }
  }

  /** Destructively transforms an EL sentence into conjunctive normal form.
   Returns a well-formed EL sentence, or NIL if there was an error.
   Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
   @return 0 EL sentence
   Assumes the EL variable namespace is bound. */
  @SubL(source = "cycl/clausifier.lisp", position = 59508) 
  public static final SubLObject el_cnf_destructive(SubLObject sentence, SubLObject mt) {
    return el_cnf_int(sentence, mt, T);
  }

  /** Assumes the EL variable namespace is bound. */
  @SubL(source = "cycl/clausifier.lisp", position = 59951) 
  public static final SubLObject el_cnf_int(SubLObject sentence, SubLObject mt, SubLObject destructiveP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == destructiveP)) {
        sentence = el_utilities.copy_sentence(sentence);
      }
      if ((NIL != canon_fast_gafP(sentence, mt))) {
        sentence = simplifier.simplify_cycl_literal_syntax(sentence, UNPROVIDED);
      } else {
        thread.resetMultipleValues();
        {
          SubLObject sentence_15 = el_xnf(sentence, mt);
          SubLObject mt_16 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          sentence = sentence_15;
          mt = mt_16;
        }
        if ((NIL != wff_macros.within_wffP())) {
          sentence = disjunctions_in(sentence);
        } else {
          {
            SubLObject error = NIL;
            try {
              sentence = disjunctions_in(sentence);
            } catch (Throwable ccatch_env_var) {
              error = Errors.handleThrowable(ccatch_env_var, $kw48$BAD_EXPONENTIAL_DISJUNCTION);
            }
            if ((NIL != error)) {
              sentence = NIL;
            }
          }
        }
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
      }
      return Values.values(sentence, mt);
    }
  }

  /** Destructively transforms an EL sentence into disjunctive normal form.
   Returns a well-formed EL sentence, or NIL if there was an error.
   Semantic checks are performed only at the beginning and end - all internal processing is purely syntactic.
   @return 0 EL sentence
   Assumes the EL variable namespace is bound. */
  @SubL(source = "cycl/clausifier.lisp", position = 61303) 
  public static final SubLObject el_dnf_destructive(SubLObject sentence, SubLObject mt) {
    return el_dnf_int(sentence, mt, T);
  }

  /** Assumes the EL variable namespace is bound. */
  @SubL(source = "cycl/clausifier.lisp", position = 61746) 
  public static final SubLObject el_dnf_int(SubLObject sentence, SubLObject mt, SubLObject destructiveP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == destructiveP)) {
        sentence = el_utilities.copy_sentence(sentence);
      }
      if ((NIL != canon_fast_gafP(sentence, mt))) {
        sentence = simplifier.simplify_cycl_literal_syntax(sentence, UNPROVIDED);
      } else {
        thread.resetMultipleValues();
        {
          SubLObject sentence_19 = el_xnf(sentence, mt);
          SubLObject mt_20 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          sentence = sentence_19;
          mt = mt_20;
        }
        if ((NIL != wff_macros.within_wffP())) {
          sentence = conjunctions_in(sentence);
        } else {
          {
            SubLObject error = NIL;
            try {
              sentence = conjunctions_in(sentence);
            } catch (Throwable ccatch_env_var) {
              error = Errors.handleThrowable(ccatch_env_var, $kw56$BAD_EXPONENTIAL_CONJUNCTION);
            }
            if ((NIL != error)) {
              sentence = NIL;
            }
          }
        }
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, UNPROVIDED);
      }
      return Values.values(sentence, mt);
    }
  }

  /** @return 0 EL sentence; the CNF form of the EL sentence SENTENCE. */
  @SubL(source = "cycl/clausifier.lisp", position = 65256) 
  public static final SubLObject cnf_clausal_form(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $use_cnf_cacheP$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30284");
      } else {
        return cnf_clausal_form_int(sentence, mt);
      }
    }
  }

  @SubL(source = "cycl/clausifier.lisp", position = 65498) 
  private static SubLSymbol $cached_cnf_clausal_form_caching_state$ = null;

  @SubL(source = "cycl/clausifier.lisp", position = 65498) 
  public static final SubLObject clear_cached_cnf_clausal_form() {
    {
      SubLObject cs = $cached_cnf_clausal_form_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/clausifier.lisp", position = 65775) 
  public static final SubLObject cnf_clausal_form_int(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject cnf = el_cnf(sentence, mt);
        SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(cnf_operators_out(cnf), new_mt);
      }
    }
  }

  public static final SubLObject declare_clausifier_file() {
    declareFunction(myName, "do_implications", "DO-IMPLICATIONS", 1, 0, false); new $do_implications$UnaryFunction();
    declareFunction(myName, "do_implications_recursive", "DO-IMPLICATIONS-RECURSIVE", 1, 0, false);
    declareFunction(myName, "eliminate_existential_with_var_only_in_antecedentP", "ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?", 3, 0, false);
    declareFunction(myName, "do_negations", "DO-NEGATIONS", 1, 0, false);
    declareFunction(myName, "do_negations_destructive", "DO-NEGATIONS-DESTRUCTIVE", 1, 0, false); new $do_negations_destructive$UnaryFunction();
    declareFunction(myName, "negate_formula", "NEGATE-FORMULA", 1, 0, false);
    declareFunction(myName, "negation_in", "NEGATION-IN", 1, 0, false);
    declareFunction(myName, "negate_quantified_sentence", "NEGATE-QUANTIFIED-SENTENCE", 1, 0, false);
    declareFunction(myName, "negate_atomic", "NEGATE-ATOMIC", 1, 0, false);
    declareFunction(myName, "negate_negation", "NEGATE-NEGATION", 1, 0, false);
    declareFunction(myName, "negate_negations", "NEGATE-NEGATIONS", 1, 0, false);
    declareFunction(myName, "negate_conjunction", "NEGATE-CONJUNCTION", 1, 0, false);
    declareFunction(myName, "negate_conjunction_destructive", "NEGATE-CONJUNCTION-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "negate_disjunction_destructive", "NEGATE-DISJUNCTION-DESTRUCTIVE", 1, 0, false);
    declareFunction(myName, "negate_universal", "NEGATE-UNIVERSAL", 1, 0, false);
    declareFunction(myName, "negate_existential", "NEGATE-EXISTENTIAL", 1, 0, false);
    declareFunction(myName, "negate_existential_min", "NEGATE-EXISTENTIAL-MIN", 1, 0, false);
    declareFunction(myName, "negate_existential_max", "NEGATE-EXISTENTIAL-MAX", 1, 0, false);
    declareFunction(myName, "negate_existential_exact", "NEGATE-EXISTENTIAL-EXACT", 1, 0, false);
    declareFunction(myName, "negate_true_sentence", "NEGATE-TRUE-SENTENCE", 1, 0, false);
    declareFunction(myName, "negate_encapsulate_sentence", "NEGATE-ENCAPSULATE-SENTENCE", 1, 0, false);
    declareFunction(myName, "lift_negation", "LIFT-NEGATION", 1, 0, false);
    declareFunction(myName, "czer_explicitify_implicit_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-QUANTIFIERS", 1, 0, false);
    declareFunction(myName, "czer_explicitify_implicit_universal_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-UNIVERSAL-QUANTIFIERS", 1, 0, false);
    declareFunction(myName, "czer_explicitify_implicit_existential_quantifiers", "CZER-EXPLICITIFY-IMPLICIT-EXISTENTIAL-QUANTIFIERS", 1, 0, false);
    declareFunction(myName, "assume_free_vars_are_existentially_boundP", "ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?", 0, 0, false);
    declareFunction(myName, "standardize_sentence_variables", "STANDARDIZE-SENTENCE-VARIABLES", 1, 0, false);
    declareFunction(myName, "standardize_variables", "STANDARDIZE-VARIABLES", 1, 0, false);
    declareFunction(myName, "recursively_standardize_variables", "RECURSIVELY-STANDARDIZE-VARIABLES", 1, 0, false); new $recursively_standardize_variables$UnaryFunction();
    declareFunction(myName, "el_uniquify_standardize", "EL-UNIQUIFY-STANDARDIZE", 1, 0, false);
    declareFunction(myName, "el_var_without_quote", "EL-VAR-WITHOUT-QUOTE", 1, 0, false);
    declareFunction(myName, "remember_variable_rename", "REMEMBER-VARIABLE-RENAME", 2, 0, false);
    declareFunction(myName, "remember_variables_rename", "REMEMBER-VARIABLES-RENAME", 2, 0, false);
    declareFunction(myName, "el_uniquify", "EL-UNIQUIFY", 1, 0, false);
    declareFunction(myName, "existentials_out", "EXISTENTIALS-OUT", 1, 0, false);
    declareFunction(myName, "existentials_out_int", "EXISTENTIALS-OUT-INT", 1, 0, false);
    declareFunction(myName, "skolemize_atomic_sentence", "SKOLEMIZE-ATOMIC-SENTENCE", 2, 0, false);
    declareFunction(myName, "skolemize_variable", "SKOLEMIZE-VARIABLE", 7, 0, false);
    declareFunction(myName, "determine_skolem_var_status", "DETERMINE-SKOLEM-VAR-STATUS", 5, 0, false);
    declareFunction(myName, "make_skolem_fn_fn", "MAKE-SKOLEM-FN-FN", 5, 0, false);
    declareFunction(myName, "drop_all_existentialsP", "DROP-ALL-EXISTENTIALS?", 0, 0, false);
    declareFunction(myName, "leave_skolem_constants_aloneP", "LEAVE-SKOLEM-CONSTANTS-ALONE?", 0, 0, false);
    declareFunction(myName, "forbid_quantified_sequence_variablesP", "FORBID-QUANTIFIED-SEQUENCE-VARIABLES?", 0, 0, false);
    declareFunction(myName, "universals_out", "UNIVERSALS-OUT", 1, 0, false); new $universals_out$UnaryFunction();
    declareFunction(myName, "disjunctions_in", "DISJUNCTIONS-IN", 1, 0, false);
    declareFunction(myName, "disjunctions_in_int", "DISJUNCTIONS-IN-INT", 1, 0, false);
    declareFunction(myName, "first_conjunction", "FIRST-CONJUNCTION", 1, 0, false);
    declareFunction(myName, "bad_exponential_disjunctionP", "BAD-EXPONENTIAL-DISJUNCTION?", 1, 0, false);
    declareFunction(myName, "handle_bad_exponential_disjunction", "HANDLE-BAD-EXPONENTIAL-DISJUNCTION", 1, 0, false);
    declareFunction(myName, "bad_exponential_sentenceP", "BAD-EXPONENTIAL-SENTENCE?", 2, 0, false);
    declareFunction(myName, "average_arity", "AVERAGE-ARITY", 1, 0, false);
    declareFunction(myName, "force_into_cnf", "FORCE-INTO-CNF", 1, 0, false);
    declareFunction(myName, "cnf_operators_out", "CNF-OPERATORS-OUT", 1, 0, false);
    declareFunction(myName, "package_cnf_clause", "PACKAGE-CNF-CLAUSE", 1, 0, false);
    declareFunction(myName, "npackage_cnf_clause", "NPACKAGE-CNF-CLAUSE", 1, 0, false);
    declareFunction(myName, "conjunctions_in", "CONJUNCTIONS-IN", 1, 0, false); new $conjunctions_in$UnaryFunction();
    declareFunction(myName, "conjunctions_in_int", "CONJUNCTIONS-IN-INT", 1, 0, false);
    declareFunction(myName, "first_disjunction", "FIRST-DISJUNCTION", 1, 0, false);
    declareFunction(myName, "bad_exponential_conjunctionP", "BAD-EXPONENTIAL-CONJUNCTION?", 1, 0, false);
    declareFunction(myName, "handle_bad_exponential_conjunction", "HANDLE-BAD-EXPONENTIAL-CONJUNCTION", 1, 0, false);
    declareFunction(myName, "force_into_dnf", "FORCE-INTO-DNF", 1, 0, false);
    declareFunction(myName, "dnf_operators_out", "DNF-OPERATORS-OUT", 1, 0, false);
    declareFunction(myName, "package_dnf_clause", "PACKAGE-DNF-CLAUSE", 1, 0, false);
    declareFunction(myName, "clausifier_input_sentence", "CLAUSIFIER-INPUT-SENTENCE", 0, 0, false);
    declareFunction(myName, "clausifier_input_mt", "CLAUSIFIER-INPUT-MT", 0, 0, false);
    declareFunction(myName, "el_xnf", "EL-XNF", 2, 0, false);
    declareFunction(myName, "el_xnf_int", "EL-XNF-INT", 2, 0, false);
    declareFunction(myName, "package_xnf_clauses", "PACKAGE-XNF-CLAUSES", 1, 0, false);
    declareFunction(myName, "package_xnf_clause", "PACKAGE-XNF-CLAUSE", 1, 0, false);
    declareFunction(myName, "npackage_xnf_clause", "NPACKAGE-XNF-CLAUSE", 1, 0, false);
    declareFunction(myName, "canon_fast_gafP", "CANON-FAST-GAF?", 2, 0, false);
    declareFunction(myName, "el_cnf", "EL-CNF", 2, 0, false);
    declareFunction(myName, "el_cnf_destructive", "EL-CNF-DESTRUCTIVE", 2, 0, false);
    declareFunction(myName, "el_cnf_int", "EL-CNF-INT", 3, 0, false);
    declareFunction(myName, "el_dnf", "EL-DNF", 2, 0, false);
    declareFunction(myName, "el_dnf_destructive", "EL-DNF-DESTRUCTIVE", 2, 0, false);
    declareFunction(myName, "el_dnf_int", "EL-DNF-INT", 3, 0, false);
    declareFunction(myName, "leading_universal_variables", "LEADING-UNIVERSAL-VARIABLES", 2, 0, false);
    declareFunction(myName, "leading_universal_variables_1", "LEADING-UNIVERSAL-VARIABLES-1", 1, 0, false);
    declareFunction(myName, "sort_vars", "SORT-VARS", 1, 0, false);
    declareFunction(myName, "distribute_conjunction", "DISTRIBUTE-CONJUNCTION", 2, 1, false);
    declareFunction(myName, "clausal_form", "CLAUSAL-FORM", 2, 1, false);
    declareFunction(myName, "cnf_clausal_form", "CNF-CLAUSAL-FORM", 2, 0, false);
    declareFunction(myName, "clear_cached_cnf_clausal_form", "CLEAR-CACHED-CNF-CLAUSAL-FORM", 0, 0, false);
    declareFunction(myName, "remove_cached_cnf_clausal_form", "REMOVE-CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
    declareFunction(myName, "cached_cnf_clausal_form_internal", "CACHED-CNF-CLAUSAL-FORM-INTERNAL", 2, 0, false);
    declareFunction(myName, "cached_cnf_clausal_form", "CACHED-CNF-CLAUSAL-FORM", 2, 0, false);
    declareFunction(myName, "cnf_clausal_form_int", "CNF-CLAUSAL-FORM-INT", 2, 0, false);
    declareFunction(myName, "dnf_clausal_form", "DNF-CLAUSAL-FORM", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_clausifier_file() {
    $canonical_variable_name_stem$ = defparameter("*CANONICAL-VARIABLE-NAME-STEM*", $str0$el_var);
    $use_cnf_cacheP$ = defparameter("*USE-CNF-CACHE?*", T);
    $newly_introduced_universals$ = defparameter("*NEWLY-INTRODUCED-UNIVERSALS*", $kw1$ERROR);
    $outermost_implication$ = defparameter("*OUTERMOST-IMPLICATION*", $kw2$UNINITIALIZED);
    $innermost_implication$ = defparameter("*INNERMOST-IMPLICATION*", $kw2$UNINITIALIZED);
    $eliminate_existential_with_var_only_in_antecedentP$ = defparameter("*ELIMINATE-EXISTENTIAL-WITH-VAR-ONLY-IN-ANTECEDENT?*", T);
    $quantifier_info_list$ = defparameter("*QUANTIFIER-INFO-LIST*", NIL);
    $czer_bad_exponential_threshold$ = deflexical("*CZER-BAD-EXPONENTIAL-THRESHOLD*", $int49$200000);
    $clausifier_input_sentence$ = defparameter("*CLAUSIFIER-INPUT-SENTENCE*", NIL);
    $clausifier_input_mt$ = defparameter("*CLAUSIFIER-INPUT-MT*", NIL);
    $cached_cnf_clausal_form_caching_state$ = deflexical("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_clausifier_file() {
    // CVS_ID("Id: clausifier.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    memoization_state.note_globally_cached_function($sym68$CACHED_CNF_CLAUSAL_FORM);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$el_var = makeString("el-var");
  public static final SubLSymbol $kw1$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw2$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym3$DO_IMPLICATIONS_RECURSIVE = makeSymbol("DO-IMPLICATIONS-RECURSIVE");
  public static final SubLSymbol $sym4$DO_NEGATIONS_DESTRUCTIVE = makeSymbol("DO-NEGATIONS-DESTRUCTIVE");
  public static final SubLSymbol $kw5$HELLO_YOU_SILLY_COMPILER = makeKeyword("HELLO-YOU-SILLY-COMPILER");
  public static final SubLObject $const6$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const7$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLSymbol $kw8$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLString $str9$_s_is_not_a_quantified_sentence = makeString("~s is not a quantified sentence");
  public static final SubLSymbol $sym10$NEGATE_NEGATION = makeSymbol("NEGATE-NEGATION");
  public static final SubLSymbol $sym11$NEGATE_FORMULA = makeSymbol("NEGATE-FORMULA");
  public static final SubLObject $const12$DifferenceFn = constant_handles.reader_make_constant_shell(makeString("DifferenceFn"));
  public static final SubLString $str13$_s_contained_the_invalid_bound__D = makeString("~s contained the invalid bound ~D");
  public static final SubLObject $const14$PlusFn = constant_handles.reader_make_constant_shell(makeString("PlusFn"));
  public static final SubLSymbol $sym15$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLInteger $int16$32 = makeInteger(32);
  public static final SubLSymbol $sym17$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLObject $const18$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLSymbol $sym19$RECURSIVELY_STANDARDIZE_VARIABLES = makeSymbol("RECURSIVELY-STANDARDIZE-VARIABLES");
  public static final SubLSymbol $sym20$EL_UNIQUIFY_STANDARDIZE = makeSymbol("EL-UNIQUIFY-STANDARDIZE");
  public static final SubLSymbol $sym21$EL_VAR_WITHOUT_QUOTE = makeSymbol("EL-VAR-WITHOUT-QUOTE");
  public static final SubLSymbol $kw22$IGNORE = makeKeyword("IGNORE");
  public static final SubLString $str23$_ = makeString("-");
  public static final SubLSymbol $sym24$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P");
  public static final SubLSymbol $kw25$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
  public static final SubLSymbol $kw26$AMBIGUOUS_VAR_TYPE_IN_SKOLEM_SCOPE = makeKeyword("AMBIGUOUS-VAR-TYPE-IN-SKOLEM-SCOPE");
  public static final SubLSymbol $kw27$QUANTIFIED_SEQUENCE_VARIABLE = makeKeyword("QUANTIFIED-SEQUENCE-VARIABLE");
  public static final SubLSymbol $sym28$EXISTENTIALS_OUT_INT = makeSymbol("EXISTENTIALS-OUT-INT");
  public static final SubLString $str29$Unexpected_sentence_type_in_exist = makeString("Unexpected sentence type in existentials-out-int: ~S");
  public static final SubLObject $const30$forAll = constant_handles.reader_make_constant_shell(makeString("forAll"));
  public static final SubLSymbol $kw31$NEITHER = makeKeyword("NEITHER");
  public static final SubLSymbol $kw32$TERM = makeKeyword("TERM");
  public static final SubLSymbol $kw33$SEQ = makeKeyword("SEQ");
  public static final SubLSymbol $kw34$BOTH = makeKeyword("BOTH");
  public static final SubLSymbol $kw35$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLString $str36$Skolemizer_failed_to_classify_var = makeString("Skolemizer failed to classify variable ~a in sentence ~a~%");
  public static final SubLString $str37$skolem_constants_not_yet_supporte = makeString("skolem constants not yet supported");
  public static final SubLObject $const38$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLObject $const39$SkolemFunctionFn = constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn"));
  public static final SubLString $str40$make_skolem_fn_fn_doesn_t_know_ho = makeString("make-skolem-fn-fn doesn't know how to handle the quantifier ~S");
  public static final SubLSymbol $kw41$ASSERT_ONLY = makeKeyword("ASSERT-ONLY");
  public static final SubLString $str42$Unexpected_value_for__forbid_quan = makeString("Unexpected value for *forbid-quantified-sequence-variables?*: ~s");
  public static final SubLSymbol $sym43$UNIVERSALS_OUT = makeSymbol("UNIVERSALS-OUT");
  public static final SubLString $str44$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in universals-out.");
  public static final SubLSymbol $sym45$DISJUNCTIONS_IN = makeSymbol("DISJUNCTIONS-IN");
  public static final SubLString $str46$Got_the_unexpected_sentence__S_in = makeString("Got the unexpected sentence ~S in disjunctions-in.");
  public static final SubLSymbol $sym47$EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");
  public static final SubLSymbol $kw48$BAD_EXPONENTIAL_DISJUNCTION = makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
  public static final SubLInteger $int49$200000 = makeInteger(200000);
  public static final SubLSymbol $sym50$FORMULA_ARITY = makeSymbol("FORMULA-ARITY");
  public static final SubLString $str51$_s_is_not_a_conjunction__so_it_is = makeString("~s is not a conjunction, so it is not a CNF sentence.");
  public static final SubLString $str52$_s_is_not_a_disjunction__so__S_is = makeString("~s is not a disjunction, so ~S is not a CNF sentence.");
  public static final SubLSymbol $sym53$CONJUNCTIONS_IN = makeSymbol("CONJUNCTIONS-IN");
  public static final SubLString $str54$Got_the_unexpected_formula__S_in_ = makeString("Got the unexpected formula ~S in conjunctions-in.");
  public static final SubLSymbol $sym55$EL_DISJUNCTION_P = makeSymbol("EL-DISJUNCTION-P");
  public static final SubLSymbol $kw56$BAD_EXPONENTIAL_CONJUNCTION = makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
  public static final SubLString $str57$_s_is_not_a_disjunction__so_it_is = makeString("~s is not a disjunction, so it is not a DNF sentence.");
  public static final SubLString $str58$_s_is_not_a_conjunction__so__S_is = makeString("~s is not a conjunction, so ~S is not a DNF sentence.");
  public static final SubLSymbol $sym59$PACKAGE_XNF_CLAUSE = makeSymbol("PACKAGE-XNF-CLAUSE");
  public static final SubLSymbol $sym60$FORMULA_ARG1 = makeSymbol("FORMULA-ARG1");
  public static final SubLSymbol $sym61$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym62$LEADING_UNIVERSAL_VARIABLES_1 = makeSymbol("LEADING-UNIVERSAL-VARIABLES-1");
  public static final SubLSymbol $sym63$STRING_ = makeSymbol("STRING<");
  public static final SubLSymbol $sym64$STR = makeSymbol("STR");
  public static final SubLObject $const65$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $kw66$CNF = makeKeyword("CNF");
  public static final SubLSymbol $kw67$DNF = makeKeyword("DNF");
  public static final SubLSymbol $sym68$CACHED_CNF_CLAUSAL_FORM = makeSymbol("CACHED-CNF-CLAUSAL-FORM");
  public static final SubLSymbol $sym69$_CACHED_CNF_CLAUSAL_FORM_CACHING_STATE_ = makeSymbol("*CACHED-CNF-CLAUSAL-FORM-CACHING-STATE*");
  public static final SubLInteger $int70$48 = makeInteger(48);
  public static final SubLSymbol $kw71$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

  //// Initializers

  public void declareFunctions() {
    declare_clausifier_file();
  }

  public void initializeVariables() {
    init_clausifier_file();
  }

  public void runTopLevelForms() {
    setup_clausifier_file();
  }

}
