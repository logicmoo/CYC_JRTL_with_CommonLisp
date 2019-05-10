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
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.at_macros;
import com.cyc.cycjava_1.cycl.at_routines;
import com.cyc.cycjava_1.cycl.at_utilities;
import com.cyc.cycjava_1.cycl.at_vars;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.clausifier;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.cycl_variables;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.disjoint_with;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.kb_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.negation_predicate;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sdc;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.simplifier;
import com.cyc.cycjava_1.cycl.skolems;
import com.cyc.cycjava_1.cycl.somewhere_cache;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.transform_list_utilities;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.verbosifier;
import com.cyc.cycjava_1.cycl.wff;
import com.cyc.cycjava_1.cycl.wff_macros;
import com.cyc.cycjava_1.cycl.wff_vars;

public  final class at_var_types extends SubLTranslatedFile {

  //// Constructor

  private at_var_types() {}
  public static final SubLFile me = new at_var_types();
  public static final String myName = "com.cyc.cycjava_1.cycl.at_var_types";

  //// Definitions

  @SubL(source = "cycl/at-var-types.lisp", position = 2230) 
  public static final SubLObject formula_var_types_ok_intP(SubLObject formula, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject cnfs = at_var_type_cnfs_int(formula, mt, T, T);
        SubLObject new_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(((NIL != cnfs)
               && (NIL != independent_cnfs_variables_arg_constraints_okP(cnfs, new_mt, $sym1$EL_VAR_))));
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 3184) 
  public static final SubLObject independent_cnfs_variables_arg_constraints_okP(SubLObject cnfs, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym2$CYC_VAR_;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        SubLObject formula = wff_vars.unexpanded_formula();
        if (((NIL != wff_vars.$validating_expansionP$.getDynamicValue(thread))
             && (NIL != el_utilities.genls_litP(formula))
             && (NIL != sdc.sdcP(cycl_utilities.formula_arg1(formula, UNPROVIDED), cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED)))) {
          {
            SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
              sdc.$ignoring_sdcP$.bind(T, thread);
              ans = independent_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
            } finally {
              sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          ans = independent_cnfs_variables_arg_constraints_okP_int(cnfs, mt, varP);
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 3683) 
  public static final SubLObject independent_cnfs_variables_arg_constraints_okP_int(SubLObject cnfs, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym2$CYC_VAR_;
    }
    {
      SubLObject okP = T;
      SubLObject skolem_cnfs = NIL;
      SubLObject doneP = NIL;
      if ((NIL == doneP)) {
        {
          SubLObject csome_list_var = cnfs;
          SubLObject cnf = NIL;
          for (cnf = csome_list_var.first(); (!(((NIL != doneP)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), cnf = csome_list_var.first()) {
            if ((NIL != list_utilities.tree_find_if($sym3$UNREIFIED_SKOLEM_TERM_, cnf, UNPROVIDED))) {
              skolem_cnfs = cons(cnf, skolem_cnfs);
            } else {
              okP = makeBoolean(((NIL != cnf_variables_arg_constraints_okP(cnf, mt, varP))
                     && (NIL != okP)));
              doneP = at_utilities.at_finishedP(makeBoolean((NIL == okP)));
            }
          }
        }
      }
      if ((NIL == doneP)) {
        if ((NIL == doneP)) {
          {
            SubLObject csome_list_var = list_utilities.tree_gather(skolem_cnfs, $sym3$UNREIFIED_SKOLEM_TERM_, EQUAL, IDENTITY, NIL);
            SubLObject skolem = NIL;
            for (skolem = csome_list_var.first(); (!(((NIL != doneP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), skolem = csome_list_var.first()) {
              {
                SubLObject cnfs_of_skolem = NIL;
                SubLObject cdolist_list_var = skolem_cnfs;
                SubLObject cnf = NIL;
                for (cnf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cnf = cdolist_list_var.first()) {
                  if ((NIL != list_utilities.tree_find(skolem, cnf, EQUAL, UNPROVIDED))) {
                    cnfs_of_skolem = cons(cnf, cnfs_of_skolem);
                  }
                }
                if ((NIL == doneP)) {
                  {
                    SubLObject csome_list_var_1 = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30255");
                    SubLObject dependent_cnfs_of_skolem = NIL;
                    for (dependent_cnfs_of_skolem = csome_list_var_1.first(); (!(((NIL != doneP)
                          || (NIL == csome_list_var_1)))); csome_list_var_1 = csome_list_var_1.rest(), dependent_cnfs_of_skolem = csome_list_var_1.first()) {
                      okP = makeBoolean(((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11707"))
                             && (NIL != okP)));
                      doneP = at_utilities.at_finishedP(makeBoolean((NIL == okP)));
                    }
                  }
                }
              }
            }
          }
        }
      }
      return okP;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 5278) 
  private static SubLSymbol $at_var_type_dnfs_int_cached_caching_state$ = null;

  /** @note may return NIL if there was a czer problem */
  @SubL(source = "cycl/at-var-types.lisp", position = 5674) 
  public static final SubLObject at_var_type_cnfs_int(SubLObject sentence, SubLObject mt, SubLObject assume_syntax_okP, SubLObject catch_czer_errorsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cnfs = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$simplify_literalP$.currentBinding(thread);
          SubLObject _prev_bind_1 = czer_vars.$expand_el_relationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = czer_vars.$encapsulate_var_formulaP$.currentBinding(thread);
          SubLObject _prev_bind_3 = czer_vars.$encapsulate_intensional_formulaP$.currentBinding(thread);
          try {
            czer_vars.$simplify_literalP$.bind(NIL, thread);
            czer_vars.$expand_el_relationsP$.bind(NIL, thread);
            czer_vars.$encapsulate_var_formulaP$.bind(NIL, thread);
            czer_vars.$encapsulate_intensional_formulaP$.bind(NIL, thread);
            if (((NIL != assume_syntax_okP)
                || (NIL != wff.el_wff_syntaxP(sentence, UNPROVIDED)))) {
              {
                SubLObject _prev_bind_0_10 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_11 = clausifier.$use_cnf_cacheP$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(((NIL != fort_types_interface.mtP(mt)) ? ((SubLObject) mt) : mt_relevance_macros.$mt$.getDynamicValue(thread)), thread);
                  clausifier.$use_cnf_cacheP$.bind(NIL, thread);
                  {
                    SubLObject error = NIL;
                    if ((NIL != catch_czer_errorsP)) {
                      try {
                        thread.resetMultipleValues();
                        {
                          SubLObject cnfs_12 = at_var_types_cnfs_clausify(sentence);
                          SubLObject mt_13 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          cnfs = cnfs_12;
                          mt = mt_13;
                        }
                      } catch (Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $kw10$BAD_EXPONENTIAL_DISJUNCTION);
                      }
                    } else {
                      thread.resetMultipleValues();
                      {
                        SubLObject cnfs_14 = at_var_types_cnfs_clausify(sentence);
                        SubLObject mt_15 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cnfs = cnfs_14;
                        mt = mt_15;
                      }
                    }
                    if ((NIL != error)) {
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7216");
                      cnfs = NIL;
                    }
                  }
                } finally {
                  clausifier.$use_cnf_cacheP$.rebind(_prev_bind_1_11, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_10, thread);
                }
              }
            }
          } finally {
            czer_vars.$encapsulate_intensional_formulaP$.rebind(_prev_bind_3, thread);
            czer_vars.$encapsulate_var_formulaP$.rebind(_prev_bind_2, thread);
            czer_vars.$expand_el_relationsP$.rebind(_prev_bind_1, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_0, thread);
          }
        }
        cnfs = at_var_type_repackage_cnfs(cnfs);
        return Values.values(cnfs, mt);
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 6409) 
  public static final SubLObject at_var_types_cnfs_clausify(SubLObject sentence) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cnfs = NIL;
        SubLObject mt = NIL;
        {
          SubLObject _prev_bind_0 = czer_vars.$el_symbol_suffix_table$.currentBinding(thread);
          SubLObject _prev_bind_1 = czer_vars.$standardize_variables_memory$.currentBinding(thread);
          try {
            czer_vars.$el_symbol_suffix_table$.bind(Hashtables.make_hash_table(FOUR_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED), thread);
            czer_vars.$standardize_variables_memory$.bind(NIL, thread);
            thread.resetMultipleValues();
            {
              SubLObject cnfs_16 = clausifier.cnf_clausal_form(simplifier.simplify_cycl_sentence(simplifier.simplify_sequence_variables(at_transform_true_sentence_negation_preds(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread))), UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread));
              SubLObject mt_17 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              cnfs = cnfs_16;
              mt = mt_17;
            }
          } finally {
            czer_vars.$standardize_variables_memory$.rebind(_prev_bind_1, thread);
            czer_vars.$el_symbol_suffix_table$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(cnfs, mt);
      }
    }
  }

  /** Optimization to avoid checking whether something is a negationPred of #$trueSentence over and over again */
  @SubL(source = "cycl/at-var-types.lisp", position = 6852) 
  private static SubLSymbol $at_true_sentence_negation_preds$ = null;

  /** @return boolean; t iff arg number ARGNUM of FORMULA is opaque by the
   default criteria, or the arg1 of #$pragmaticRequirement. */
  @SubL(source = "cycl/at-var-types.lisp", position = 7034) 
  public static final SubLObject opaque_arg_wrt_pragmatic_requirementP(SubLObject formula, SubLObject argnum) {
    return makeBoolean(((NIL != cycl_utilities.default_opaque_argP(formula, argnum))
          || (ONE_INTEGER.numE(argnum)
             && ($const12$pragmaticRequirement == cycl_utilities.formula_operator(formula)))));
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 7375) 
  public static final SubLObject at_transform_true_sentence_negation_preds(SubLObject sentence, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $at_true_sentence_negation_preds$.currentBinding(thread);
          try {
            $at_true_sentence_negation_preds$.bind(set.new_set(Symbols.symbol_function(EQ), UNPROVIDED), thread);
            {
              SubLObject cdolist_list_var = negation_predicate.all_negation_predicates($const13$trueSentence, mt, NIL);
              SubLObject negation_pred = NIL;
              for (negation_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), negation_pred = cdolist_list_var.first()) {
                set.set_add(negation_pred, $at_true_sentence_negation_preds$.getDynamicValue(thread));
              }
              {
                SubLObject _prev_bind_0_18 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                try {
                  cycl_utilities.$opaque_arg_function$.bind($sym14$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_, thread);
                  result = cycl_utilities.expression_transform(sentence, $sym15$AT_NEGATED_, $sym16$AT_NEGATE, UNPROVIDED, UNPROVIDED);
                } finally {
                  cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0_18, thread);
                }
              }
            }
          } finally {
            $at_true_sentence_negation_preds$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 7967) 
  public static final SubLObject at_negatedP(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject operator = cycl_utilities.formula_arg0(formula);
        if ((NIL != forts.fort_p(operator))) {
          return set.set_memberP(operator, $at_true_sentence_negation_preds$.getDynamicValue(thread));
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 8232) 
  public static final SubLObject at_var_type_repackage_cnfs(SubLObject cnfs) {
    {
      SubLObject result = NIL;
      if (cnfs.isCons()) {
        {
          SubLObject cdolist_list_var = cnfs;
          SubLObject cnf = NIL;
          for (cnf = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cnf = cdolist_list_var.first()) {
            {
              SubLObject neg_lits = clauses.neg_lits(cnf);
              SubLObject pos_lits = clauses.pos_lits(cnf);
              if ((NIL != list_utilities.singletonP(pos_lits))) {
                {
                  SubLObject item_var = cnf;
                  if ((NIL == conses_high.member(item_var, result, EQUAL, Symbols.symbol_function(IDENTITY)))) {
                    result = cons(item_var, result);
                  }
                }
              } else if ((NIL != pos_lits)) {
                {
                  SubLObject cdolist_list_var_19 = pos_lits;
                  SubLObject pos_lit = NIL;
                  for (pos_lit = cdolist_list_var_19.first(); (NIL != cdolist_list_var_19); cdolist_list_var_19 = cdolist_list_var_19.rest(), pos_lit = cdolist_list_var_19.first()) {
                    {
                      SubLObject item_var = clauses.make_cnf(neg_lits, list(transform_list_utilities.transform(pos_lit, $sym3$UNREIFIED_SKOLEM_TERM_, $sym6$SKOLEM_FUNCTION_VAR, UNPROVIDED)));
                      if ((NIL == conses_high.member(item_var, result, EQUAL, Symbols.symbol_function(IDENTITY)))) {
                        result = cons(item_var, result);
                      }
                    }
                  }
                }
              } else {
                {
                  SubLObject item_var = clauses.make_cnf(neg_lits, NIL);
                  if ((NIL == conses_high.member(item_var, result, EQUAL, Symbols.symbol_function(IDENTITY)))) {
                    result = cons(item_var, result);
                  }
                }
              }
            }
          }
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 27280) 
  public static final SubLObject cnf_variables_arg_constraints_okP(SubLObject cnf, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym2$CYC_VAR_;
    }
    {
      SubLObject isa_constraints = cnf_variables_isa_constraints(cnf, mt, varP);
      return makeBoolean(((NIL != var_types_okP(isa_constraints, $kw25$ISA, mt))
             && (NIL != var_types_okP(cnf_variables_quoted_isa_constraints(cnf, mt, varP), $kw26$QUOTED_ISA, mt))
             && (NIL != var_types_okP(cnf_variables_genl_constraints(cnf, mt, varP), $kw27$GENLS, mt))
             && (NIL != cnf_var_constraint_implications_okP(cnf, isa_constraints, mt, varP))));
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 30550) 
  public static final SubLObject cnf_variables_isa_constraints(SubLObject cnf, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym24$VARIABLE_P;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pos_lits = clauses.pos_lits(cnf);
        if ((NIL != pos_lits)) {
          {
            SubLObject vars = Sequences.nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            {
              SubLObject cdolist_list_var = vars;
              SubLObject var = NIL;
              for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                if (((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))
                    || (NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED)))) {
                  {
                    SubLObject cols = at_min_cols(cnf_variable_isa_constraints(var, cnf, mt), mt);
                    constraints = cons(cons(var, cols), constraints);
                  }
                }
              }
            }
            if (((NIL != constraints)
                 && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)))) {
              {
                SubLObject cdolist_list_var = vars;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  {
                    SubLObject cols = at_min_cols(cnf_variable_inter_arg_isa_constraints(var, cnf, constraints, mt), mt);
                    result = cons(cons(var, cols), result);
                  }
                }
              }
            } else {
              result = constraints;
            }
            return result;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 31565) 
  public static final SubLObject cnf_variables_quoted_isa_constraints(SubLObject cnf, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym24$VARIABLE_P;
    }
    {
      SubLObject pos_lits = clauses.pos_lits(cnf);
      if ((NIL != pos_lits)) {
        {
          SubLObject vars = Sequences.nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          SubLObject result = NIL;
          SubLObject constraints = NIL;
          SubLObject cdolist_list_var = vars;
          SubLObject var = NIL;
          for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
            if ((NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
            }
            {
              SubLObject cols = at_min_cols(cnf_variable_quoted_isa_constraints(var, cnf, mt), mt);
              constraints = cons(cons(var, cols), constraints);
            }
          }
          result = constraints;
          return result;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 32247) 
  public static final SubLObject cnf_variables_genl_constraints(SubLObject cnf, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym24$VARIABLE_P;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pos_lits = clauses.pos_lits(cnf);
        if ((NIL != pos_lits)) {
          {
            SubLObject vars = Sequences.nreverse(list_utilities.tree_gather(cnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject result = NIL;
            SubLObject constraints = NIL;
            {
              SubLObject cdolist_list_var = vars;
              SubLObject var = NIL;
              for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                if (((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))
                    || (NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED)))) {
                  {
                    SubLObject cols = at_min_cols(cnf_variable_genl_constraints(var, cnf, mt), mt);
                    constraints = cons(cons(var, cols), constraints);
                  }
                }
              }
            }
            if (((NIL != constraints)
                 && (NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)))) {
              {
                SubLObject cdolist_list_var = vars;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
                  {
                    SubLObject cols = at_min_cols(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11690"), mt);
                    result = cons(cons(var, cols), result);
                  }
                }
              }
            } else {
              result = constraints;
            }
            return result;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 33121) 
  public static final SubLObject cnf_variable_isa_constraints(SubLObject var, SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if ((NIL != pos_lits)) {
          {
            SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
              at_vars.$at_arg$.bind(var, thread);
              {
                SubLObject neg_lits = clauses.neg_lits(cnf);
                SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                {
                  SubLObject _prev_bind_0_39 = at_vars.$within_disjunctionP$.currentBinding(thread);
                  try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits)
                             && (NIL != pos_lits))
                          || (NIL != conses_high.second(neg_lits)))), thread);
                    if (((NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED))
                        || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)))) {
                      {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                          result = ConsesLow.nconc(result, cnf_neg_lit_variable_isa_constraints(var, literal, mt));
                        }
                      }
                      {
                        SubLObject cdolist_list_var = pos_lits;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                          if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                            {
                              SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
                              SubLObject mt_arg = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30470");
                              SubLObject subformula = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30492");
                              SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                              if (((NIL == control_vars.within_askP())
                                  || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11758"));
                              }
                            }
                          }
                          result = ConsesLow.nconc(result, cnf_pos_lit_variable_isa_constraints(var, literal, mt));
                        }
                      }
                      result = list_utilities.delete_duplicate_forts(result);
                    }
                  } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_39, thread);
                  }
                }
              }
            } finally {
              at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 34496) 
  public static final SubLObject cnf_variable_quoted_isa_constraints(SubLObject var, SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if ((NIL != pos_lits)) {
          {
            SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
              at_vars.$at_arg$.bind(var, thread);
              {
                SubLObject neg_lits = clauses.neg_lits(cnf);
                SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                {
                  SubLObject _prev_bind_0_40 = at_vars.$within_disjunctionP$.currentBinding(thread);
                  try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits)
                             && (NIL != pos_lits))
                          || (NIL != conses_high.second(neg_lits)))), thread);
                    if (((NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED))
                        || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)))) {
                      {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                          result = ConsesLow.nconc(result, cnf_neg_lit_variable_quoted_isa_constraints(var, literal, mt));
                        }
                      }
                      {
                        SubLObject cdolist_list_var = pos_lits;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                          if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                            {
                              SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
                              SubLObject mt_arg = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30471");
                              SubLObject subformula = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30493");
                              SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                              if (((NIL == control_vars.within_askP())
                                  || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11762"));
                              }
                            }
                          }
                          result = ConsesLow.nconc(result, cnf_pos_lit_variable_quoted_isa_constraints(var, literal, mt));
                        }
                      }
                      result = list_utilities.delete_duplicate_forts(result);
                    }
                  } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_40, thread);
                  }
                }
              }
            } finally {
              at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 35830) 
  public static final SubLObject cnf_variable_genl_constraints(SubLObject var, SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if ((NIL != pos_lits)) {
          {
            SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
              at_vars.$at_arg$.bind(var, thread);
              {
                SubLObject neg_lits = clauses.neg_lits(cnf);
                SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                {
                  SubLObject _prev_bind_0_41 = at_vars.$within_disjunctionP$.currentBinding(thread);
                  try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits)
                             && (NIL != pos_lits))
                          || (NIL != conses_high.second(neg_lits)))), thread);
                    if (((NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED))
                        || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)))) {
                      {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                          result = ConsesLow.nconc(result, cnf_neg_lit_variable_genl_constraints(var, literal, mt));
                        }
                      }
                      {
                        SubLObject cdolist_list_var = pos_lits;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                          if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                            {
                              SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
                              SubLObject mt_arg = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30472");
                              SubLObject subformula = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30494");
                              SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                              if (((NIL == control_vars.within_askP())
                                  || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11745"));
                              }
                            }
                          }
                          result = ConsesLow.nconc(result, cnf_pos_lit_variable_genl_constraints(var, literal, mt));
                        }
                      }
                      result = list_utilities.delete_duplicate_forts(result);
                    }
                  } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_41, thread);
                  }
                }
              }
            } finally {
              at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  /** @note destroys CONSTRAINTS */
  @SubL(source = "cycl/at-var-types.lisp", position = 38607) 
  public static final SubLObject cnf_variable_inter_arg_isa_constraints(SubLObject var, SubLObject cnf, SubLObject constraints, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = conses_high.assoc(var, constraints, UNPROVIDED, UNPROVIDED).rest();
        {
          SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$at_var_isa$.currentBinding(thread);
          try {
            at_vars.$at_arg$.bind(var, thread);
            at_vars.$at_var_isa$.bind(constraints, thread);
            result = ConsesLow.nconc(result, cnf_variable_inter_arg_isa_constraints_int(var, cnf, mt));
          } finally {
            at_vars.$at_var_isa$.rebind(_prev_bind_1, thread);
            at_vars.$at_arg$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 39376) 
  public static final SubLObject cnf_variable_inter_arg_isa_constraints_int(SubLObject var, SubLObject cnf, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != clause_utilities.atomic_clause_with_all_var_argsP(cnf))
           && (NIL == at_vars.$at_var_isa$.getDynamicValue(thread)))) {
        return NIL;
      }
      {
        SubLObject pos_lits = clauses.pos_lits(cnf);
        SubLObject result = NIL;
        if ((NIL != pos_lits)) {
          {
            SubLObject neg_lits = clauses.neg_lits(cnf);
            SubLObject free_vars = clause_utilities.clause_free_variables(cnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
            {
              SubLObject _prev_bind_0 = at_vars.$within_disjunctionP$.currentBinding(thread);
              try {
                at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits)
                         && (NIL != pos_lits))
                      || (NIL != conses_high.second(neg_lits)))), thread);
                if (((NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED))
                    || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)))) {
                  {
                    SubLObject cdolist_list_var = neg_lits;
                    SubLObject literal = NIL;
                    for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                      result = ConsesLow.nconc(result, neg_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                    }
                  }
                  {
                    SubLObject cdolist_list_var = pos_lits;
                    SubLObject literal = NIL;
                    for (literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), literal = cdolist_list_var.first()) {
                      if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                        {
                          SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
                          SubLObject mt_arg = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30473");
                          SubLObject subformula = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30495");
                          SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                          if (((NIL == control_vars.within_askP())
                              || (NIL != fort_types_interface.mtP(mt_arg)))) {
                            result = ConsesLow.nconc(result, Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11754"));
                          }
                        }
                      }
                      result = ConsesLow.nconc(result, pos_lit_variable_inter_arg_isa_constraints(var, literal, mt));
                    }
                  }
                  result = list_utilities.delete_duplicate_forts(result);
                }
              } finally {
                at_vars.$within_disjunctionP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }

  /** Whether the interArgIsa constraints FROM the cnfs' variables TO fully-bound collections are ok.
Returns NIL if a contradiction is found.  @see :inter-arg-isa-from-variable-to-disjoint-collection in wff-tests
@xref var-types-ok? checks the constraints on the variables.  var-constraint-implications-ok? checks the
constraints from the variables to the ground terms. */
  @SubL(source = "cycl/at-var-types.lisp", position = 42983) 
  public static final SubLObject cnf_var_constraint_implications_okP(SubLObject cnf, SubLObject isa_constraints, SubLObject mt, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym2$CYC_VAR_;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject badP = NIL;
        if (((NIL != isa_constraints)
             && (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))
             && (NIL == clause_utilities.atomic_clause_with_all_var_argsP(cnf)))) {
          {
            SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                {
                  SubLObject rest = NIL;
                  for (rest = clauses.pos_lits(cnf); (!(((NIL != badP)
                        || (NIL == rest)))); rest = rest.rest()) {
                    {
                      SubLObject asent = rest.first();
                      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                      SubLObject asserted_genl_somethingP = ((NIL != forts.fort_p(pred)) ? ((SubLObject) makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(pred, UNPROVIDED))
                              || (NIL != genl_predicates.asserted_genl_inversesP(pred, UNPROVIDED))))) : NIL);
                      {
                        SubLObject _prev_bind_0_42 = at_vars.$at_reln$.currentBinding(thread);
                        SubLObject _prev_bind_1_43 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                        SubLObject _prev_bind_2_44 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                        try {
                          at_vars.$at_reln$.bind(pred, thread);
                          at_vars.$at_search_genl_predsP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                                 && (NIL != asserted_genl_somethingP))), thread);
                          at_vars.$at_search_genl_inversesP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                                 && (NIL != asserted_genl_somethingP))), thread);
                          {
                            SubLObject ind_argnum = ZERO_INTEGER;
                            SubLObject args = cycl_utilities.formula_args(asent, $kw28$IGNORE);
                            SubLObject rest_45 = NIL;
                            for (rest_45 = args; (!(((NIL != badP)
                                  || (NIL == rest_45)))); rest_45 = rest_45.rest()) {
                              {
                                SubLObject ind_arg = rest_45.first();
                                ind_argnum = Numbers.add(ind_argnum, ONE_INTEGER);
                                {
                                  SubLObject ind_arg_isas = list_utilities.alist_lookup(isa_constraints, ind_arg, UNPROVIDED, UNPROVIDED);
                                  if ((NIL != ind_arg_isas)) {
                                    {
                                      SubLObject dep_argnum = ZERO_INTEGER;
                                      SubLObject args_46 = cycl_utilities.formula_args(asent, $kw28$IGNORE);
                                      SubLObject rest_47 = NIL;
                                      for (rest_47 = args_46; (!(((NIL != badP)
                                            || (NIL == rest_47)))); rest_47 = rest_47.rest()) {
                                        {
                                          SubLObject dep_arg = rest_47.first();
                                          dep_argnum = Numbers.add(dep_argnum, ONE_INTEGER);
                                          if ((!(ind_argnum.numE(dep_argnum)))) {
                                            if ((NIL != el_utilities.groundP(dep_arg, varP))) {
                                              {
                                                SubLObject dep_constraints = NIL;
                                                if ((NIL == badP)) {
                                                  {
                                                    SubLObject csome_list_var = ind_arg_isas;
                                                    SubLObject ind_arg_isa = NIL;
                                                    for (ind_arg_isa = csome_list_var.first(); (!(((NIL != badP)
                                                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), ind_arg_isa = csome_list_var.first()) {
                                                      {
                                                        SubLObject items_var = inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                        if (items_var.isVector()) {
                                                          {
                                                            SubLObject vector_var = inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                            SubLObject backwardP_var = NIL;
                                                            SubLObject length = Sequences.length(vector_var);
                                                            SubLObject v_iteration = NIL;
                                                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                                              {
                                                                SubLObject element_num = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                                                                SubLObject item = Vectors.aref(vector_var, element_num);
                                                                dep_constraints = cons(item, dep_constraints);
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          {
                                                            SubLObject cdolist_list_var = inter_arg_isa_from_type(pred, dep_argnum, ind_arg_isa, ind_argnum);
                                                            SubLObject item = NIL;
                                                            for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
                                                              dep_constraints = cons(item, dep_constraints);
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if ((NIL != Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3715"))) {
                                                  Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7218");
                                                  badP = T;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } finally {
                          at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_44, thread);
                          at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_43, thread);
                          at_vars.$at_reln$.rebind(_prev_bind_0_42, thread);
                        }
                      }
                    }
                  }
                }
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return makeBoolean((NIL == badP));
      }
    }
  }

  /** @return a list of tuples of the form (VAR MT COLLECTIONS), where VAR is constrained to be all of COLLECTIONS in MT. */
  @SubL(source = "cycl/at-var-types.lisp", position = 48900) 
  public static final SubLObject contextualized_dnf_variables_isa_constraint_tuples(SubLObject dnf, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym2$CYC_VAR_;
    }
    {
      SubLObject result = NIL;
      SubLObject constraints = NIL;
      SubLObject vars = Sequences.nreverse(list_utilities.tree_gather(dnf, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED));
      SubLObject cdolist_list_var = vars;
      SubLObject var = NIL;
      for (var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), var = cdolist_list_var.first()) {
        {
          SubLObject tuples = contextualized_dnf_variable_isa_constraint_tuples(var, dnf);
          SubLObject items_var = tuples;
          if (items_var.isVector()) {
            {
              SubLObject vector_var = tuples;
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject element_num = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject item = Vectors.aref(vector_var, element_num);
                  constraints = cons(item, constraints);
                }
              }
            }
          } else {
            {
              SubLObject cdolist_list_var_52 = tuples;
              SubLObject item = NIL;
              for (item = cdolist_list_var_52.first(); (NIL != cdolist_list_var_52); cdolist_list_var_52 = cdolist_list_var_52.rest(), item = cdolist_list_var_52.first()) {
                constraints = cons(item, constraints);
              }
            }
          }
        }
      }
      result = constraints;
      return result;
    }
  }

  /** Based on @xref dnf-variable-isa-constraints */
  @SubL(source = "cycl/at-var-types.lisp", position = 54539) 
  public static final SubLObject contextualized_dnf_variable_isa_constraint_tuples(SubLObject var, SubLObject contextualized_dnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pos_lits = clauses.pos_lits(contextualized_dnf);
        SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
        if ((NIL != pos_lits)) {
          {
            SubLObject _prev_bind_0 = at_vars.$at_arg$.currentBinding(thread);
            try {
              at_vars.$at_arg$.bind(var, thread);
              {
                SubLObject neg_lits = clauses.neg_lits(contextualized_dnf);
                SubLObject free_vars = clause_utilities.clause_free_variables(contextualized_dnf, cycl_variables.variable_predicate_fn(var), UNPROVIDED);
                {
                  SubLObject _prev_bind_0_55 = at_vars.$within_disjunctionP$.currentBinding(thread);
                  try {
                    at_vars.$within_disjunctionP$.bind(makeBoolean((((NIL != neg_lits)
                             && (NIL != pos_lits))
                          || (NIL != conses_high.second(neg_lits))
                          || (NIL != conses_high.second(pos_lits)))), thread);
                    if (((NIL != list_utilities.tree_find(var, pos_lits, Symbols.symbol_function(EQUAL), UNPROVIDED))
                        || (NIL == subl_promotions.memberP(var, free_vars, UNPROVIDED, UNPROVIDED)))) {
                      {
                        SubLObject cdolist_list_var = neg_lits;
                        SubLObject contextualized_literal = NIL;
                        for (contextualized_literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_literal = cdolist_list_var.first()) {
                          {
                            SubLObject datum = contextualized_literal;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
                            mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
                            asent = current.first();
                            current = current.rest();
                            if ((NIL == current)) {
                              {
                                SubLObject cdolist_list_var_56 = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11714");
                                SubLObject col = NIL;
                                for (col = cdolist_list_var_56.first(); (NIL != cdolist_list_var_56); cdolist_list_var_56 = cdolist_list_var_56.rest(), col = cdolist_list_var_56.first()) {
                                  dictionary_utilities.dictionary_push(dict, mt, col);
                                }
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum, $list31);
                            }
                          }
                        }
                      }
                      {
                        SubLObject cdolist_list_var = pos_lits;
                        SubLObject contextualized_literal = NIL;
                        for (contextualized_literal = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_literal = cdolist_list_var.first()) {
                          {
                            SubLObject datum = contextualized_literal;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
                            mt = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list31);
                            asent = current.first();
                            current = current.rest();
                            if ((NIL == current)) {
                              {
                                SubLObject cdolist_list_var_57 = dnf_pos_lit_variable_isa_constraints(var, asent, mt);
                                SubLObject col = NIL;
                                for (col = cdolist_list_var_57.first(); (NIL != cdolist_list_var_57); cdolist_list_var_57 = cdolist_list_var_57.rest(), col = cdolist_list_var_57.first()) {
                                  dictionary_utilities.dictionary_push(dict, mt, col);
                                }
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum, $list31);
                            }
                          }
                        }
                      }
                      if ((NIL != Sequences.find_if($sym32$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        {
                          SubLObject cdolist_list_var = list_utilities.remove_if_not($sym32$CONTEXTUALIZED_ISA_X_Y_LIT_, pos_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          SubLObject isa_x_y_contextualized_asent = NIL;
                          for (isa_x_y_contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), isa_x_y_contextualized_asent = cdolist_list_var.first()) {
                            {
                              SubLObject datum = isa_x_y_contextualized_asent;
                              SubLObject current = datum;
                              SubLObject isa_mt = NIL;
                              SubLObject isa_x_y_asent = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list33);
                              isa_mt = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list33);
                              isa_x_y_asent = current.first();
                              current = current.rest();
                              if ((NIL == current)) {
                                {
                                  SubLObject ins_var = cycl_utilities.atomic_sentence_arg1(isa_x_y_asent, UNPROVIDED);
                                  if ((var == ins_var)) {
                                    {
                                      SubLObject isa_col_var = cycl_utilities.atomic_sentence_arg2(isa_x_y_asent, UNPROVIDED);
                                      SubLObject cdolist_list_var_58 = pos_lits;
                                      SubLObject contextualized_literal = NIL;
                                      for (contextualized_literal = cdolist_list_var_58.first(); (NIL != cdolist_list_var_58); cdolist_list_var_58 = cdolist_list_var_58.rest(), contextualized_literal = cdolist_list_var_58.first()) {
                                        {
                                          SubLObject datum_59 = contextualized_literal;
                                          SubLObject current_60 = datum_59;
                                          SubLObject genls_mt = NIL;
                                          SubLObject genls_asent = NIL;
                                          cdestructuring_bind.destructuring_bind_must_consp(current_60, datum_59, $list34);
                                          genls_mt = current_60.first();
                                          current_60 = current_60.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp(current_60, datum_59, $list34);
                                          genls_asent = current_60.first();
                                          current_60 = current_60.rest();
                                          if ((NIL == current_60)) {
                                            if ((NIL != el_utilities.genls_litP(genls_asent))) {
                                              {
                                                SubLObject genls_col_var = cycl_utilities.atomic_sentence_arg1(genls_asent, UNPROVIDED);
                                                if ((isa_col_var == genls_col_var)) {
                                                  if ((NIL != hlmt.hlmt_equalP(isa_mt, genls_mt))) {
                                                    {
                                                      SubLObject col = cycl_utilities.atomic_sentence_arg2(genls_asent, UNPROVIDED);
                                                      if ((NIL != forts.fort_p(col))) {
                                                        dictionary_utilities.dictionary_push(dict, isa_mt, col);
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_59, $list34);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list33);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    at_vars.$within_disjunctionP$.rebind(_prev_bind_0_55, thread);
                  }
                }
              }
            } finally {
              at_vars.$at_arg$.rebind(_prev_bind_0, thread);
            }
          }
        }
        {
          SubLObject result = NIL;
          SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict));
          while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
            thread.resetMultipleValues();
            {
              SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
              SubLObject cols = thread.secondMultipleValue();
              thread.resetMultipleValues();
              {
                SubLObject minimized_cols = at_min_cols(cols, mt);
                result = cons(list(var, mt, minimized_cols), result);
              }
              iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
            }
          }
          dictionary_contents.do_dictionary_contents_finalize(iteration_state);
          return result;
        }
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 56986) 
  public static final SubLObject contextualized_isa_x_y_litP(SubLObject object) {
    if ((NIL != inference_datastructures_problem_query.hl_contextualized_asent_p(object))) {
      {
        SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(object);
        return el_utilities.isa_hl_var_hl_var_litP(asent);
      }
    }
    return NIL;
  }

  public static final class $contextualized_isa_x_y_litP$UnaryFunction extends UnaryFunction {
    public $contextualized_isa_x_y_litP$UnaryFunction() { super(extractFunctionNamed("CONTEXTUALIZED-ISA-X-Y-LIT?")); }
    public SubLObject processItem(SubLObject arg1) { return contextualized_isa_x_y_litP(arg1); }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 64263) 
  public static final SubLObject cnf_neg_lit_variable_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    if ((NIL != czer_utilities.within_disjunctionP())) {
      return neg_lit_variable_isa_constraints(var, literal, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 64538) 
  public static final SubLObject cnf_neg_lit_variable_quoted_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    if ((NIL != czer_utilities.within_disjunctionP())) {
      return neg_lit_variable_quoted_isa_constraints(var, literal, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 64768) 
  public static final SubLObject cnf_neg_lit_variable_genl_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    if ((NIL != czer_utilities.within_disjunctionP())) {
      return neg_lit_variable_genl_constraints(var, literal, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 64987) 
  public static final SubLObject cnf_pos_lit_variable_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    return neg_lit_variable_isa_constraints(var, literal, mt);
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 65169) 
  public static final SubLObject cnf_pos_lit_variable_quoted_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    return neg_lit_variable_quoted_isa_constraints(var, literal, mt);
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 65365) 
  public static final SubLObject cnf_pos_lit_variable_genl_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    return neg_lit_variable_genl_constraints(var, literal, mt);
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 66233) 
  public static final SubLObject dnf_pos_lit_variable_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    return neg_lit_variable_isa_constraints(var, literal, mt);
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 66796) 
  public static final SubLObject vt_unskolemize_term(SubLObject v_term) {
    if ((NIL != term.unreified_skolem_termP(v_term))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22931");
    } else {
      return v_term;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 66937) 
  public static final SubLObject neg_lit_variable_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = pos_lit_variable_isa_constraints(var, literal, mt);
        if (((NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue(thread))
             && (NIL != el_utilities.isa_litP(literal)))) {
          {
            SubLObject arg1 = vt_unskolemize_term(el_utilities.literal_arg1(literal, UNPROVIDED));
            SubLObject arg2 = cycl_utilities.reify_when_closed_naut(el_utilities.literal_arg2(literal, UNPROVIDED));
            if ((var != arg1)) {
            } else if ((NIL != fort_types_interface.collectionP(arg2))) {
              result = cons(arg2, result);
            } else if ((NIL != term.first_order_nautP(arg2))) {
              if ((NIL != el_utilities.groundP(arg2, UNPROVIDED))) {
                result = ConsesLow.nconc(result, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6955"));
              } else {
                result = ConsesLow.nconc(result, Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6959"));
              }
            }
          }
        } else if (((NIL != el_utilities.tou_litP(literal))
            || (NIL != el_utilities.evaluate_litP(literal, UNPROVIDED)))) {
          {
            SubLObject arg1 = vt_unskolemize_term(el_utilities.literal_arg1(literal, UNPROVIDED));
            if ((var == arg1)) {
              result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6973"));
            }
          }
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 67979) 
  public static final SubLObject neg_lit_variable_quoted_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = pos_lit_variable_quoted_isa_constraints(var, literal, mt);
        if (((NIL != at_vars.$at_include_isa_literal_constraints$.getDynamicValue(thread))
             && (NIL != el_utilities.quoted_isa_litP(literal)))) {
          {
            SubLObject arg1 = vt_unskolemize_term(el_utilities.literal_arg1(literal, UNPROVIDED));
            SubLObject arg2 = cycl_utilities.reify_when_closed_naut(el_utilities.literal_arg2(literal, UNPROVIDED));
            if ((var != arg1)) {
            } else if ((NIL != fort_types_interface.collectionP(arg2))) {
              result = cons(arg2, result);
            }
          }
        } else if (((NIL != el_utilities.tou_litP(literal))
            || (NIL != el_utilities.evaluate_litP(literal, UNPROVIDED)))) {
          {
            SubLObject arg1 = vt_unskolemize_term(el_utilities.literal_arg1(literal, UNPROVIDED));
            if ((var == arg1)) {
              {
                SubLObject nat_functor = cycl_utilities.nat_functor(el_utilities.literal_arg2(literal, UNPROVIDED));
                SubLObject evaluation_quoted_isas = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6863");
                SubLObject quoted_isas = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7005");
                result = ConsesLow.nconc(result, evaluation_quoted_isas, quoted_isas);
              }
            }
          }
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 69070) 
  public static final SubLObject neg_lit_variable_genl_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = pos_lit_variable_genl_constraints(var, literal, mt);
        if (((NIL != at_vars.$at_include_genl_literal_constraints$.getDynamicValue(thread))
             && (NIL != el_utilities.genls_litP(literal)))) {
          {
            SubLObject arg1 = vt_unskolemize_term(el_utilities.literal_arg1(literal, UNPROVIDED));
            SubLObject arg2 = cycl_utilities.reify_when_closed_naut(el_utilities.literal_arg2(literal, UNPROVIDED));
            if ((var != arg1)) {
            } else if ((NIL != fort_types_interface.collectionP(arg2))) {
              result = cons(arg2, result);
            } else if ((NIL != term.first_order_nautP(arg2))) {
              result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6945"));
            }
          }
        } else if (((NIL != el_utilities.tou_litP(literal))
            || (NIL != el_utilities.evaluate_litP(literal, UNPROVIDED)))) {
          {
            SubLObject arg1 = vt_unskolemize_term(el_utilities.literal_arg1(literal, UNPROVIDED));
            if ((var == arg1)) {
              result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6946"));
            }
          }
        }
        result = list_utilities.delete_duplicate_forts(result);
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 69983) 
  public static final SubLObject pos_lit_variable_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    return conses_high.copy_list(pos_lit_variable_isa_constraints_memoized(var, literal, mt));
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 70253) 
  public static final SubLObject pos_lit_variable_isa_constraints_memoized_internal(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if ((NIL != list_utilities.tree_find(var, literal, Symbols.symbol_function(EQUAL), UNPROVIDED))) {
          if ((NIL == forts.fort_p(predicate))) {
            predicate = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29731");
          }
          {
            SubLObject scoping_args = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) kb_accessors.scoping_args(predicate, mt)) : NIL);
            SubLObject argnum = ZERO_INTEGER;
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
              try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                {
                  SubLObject asserted_genl_somethingP = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED))
                          || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL);
                  {
                    SubLObject _prev_bind_0_63 = at_vars.$at_reln$.currentBinding(thread);
                    SubLObject _prev_bind_1_64 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                    try {
                      at_vars.$at_reln$.bind(predicate, thread);
                      at_vars.$at_search_genl_predsP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                             && (NIL != asserted_genl_somethingP))), thread);
                      at_vars.$at_search_genl_inversesP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                             && (NIL != asserted_genl_somethingP))), thread);
                      if (var.eql(vt_unskolemize_term(predicate))) {
                        {
                          SubLObject doneP = NIL;
                          SubLObject has_sentence_argP = NIL;
                          SubLObject args = cycl_utilities.formula_args(literal, $kw28$IGNORE);
                          SubLObject rest = NIL;
                          for (rest = args; (!(((NIL != doneP)
                                || (NIL == rest)))); rest = rest.rest()) {
                            {
                              SubLObject arg = rest.first();
                              if ((NIL != term.sentenceP(arg, UNPROVIDED))) {
                                doneP = T;
                                has_sentence_argP = T;
                              }
                            }
                          }
                          if ((NIL != has_sentence_argP)) {
                            result = cons($const36$TruthFunction, result);
                          } else {
                            result = cons($const37$Predicate, result);
                          }
                        }
                      }
                      {
                        SubLObject cdolist_list_var = el_utilities.literal_args(literal, $kw38$REGULARIZE);
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
                          argnum = Numbers.add(argnum, ONE_INTEGER);
                          if ((NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED))) {
                          } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(arg))) {
                          } else if ((NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt))) {
                          } else if (var.equal(arg)) {
                            result = ConsesLow.nconc(result, at_argn_isa(predicate, argnum));
                          } else if ((NIL != modal_in_argP(predicate, argnum, mt))) {
                          } else if ((NIL != term.unreified_skolem_termP(arg))) {
                            if (var.eql(Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29785"))) {
                              result = at_argn_isa(predicate, argnum);
                            }
                            {
                              SubLObject skolem_number = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22935");
                              if ((NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED))) {
                                result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11787"));
                              }
                            }
                          } else if ((NIL != czer_utilities.sentence_argP(predicate, argnum, mt))) {
                            if ((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8768"))) {
                              if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                                {
                                  SubLObject mt_arg = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30474");
                                  SubLObject subformula = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30496");
                                  SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                                  if (((NIL == control_vars.within_askP())
                                      || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                    result = ConsesLow.nconc(result, Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11759"));
                                  }
                                }
                              } else {
                                result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11760"));
                              }
                            }
                          } else if ((NIL != el_utilities.arg_types_prescribe_tacit_term_listP(predicate, argnum))) {
                          } else if ((NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED))) {
                            {
                              SubLObject items_var = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11788");
                              if (items_var.isVector()) {
                                {
                                  SubLObject vector_var = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11789");
                                  SubLObject backwardP_var = NIL;
                                  SubLObject length = Sequences.length(vector_var);
                                  SubLObject v_iteration = NIL;
                                  for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                    {
                                      SubLObject element_num = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                                      SubLObject item = Vectors.aref(vector_var, element_num);
                                      result = cons(item, result);
                                    }
                                  }
                                }
                              } else {
                                {
                                  SubLObject cdolist_list_var_65 = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11790");
                                  SubLObject item = NIL;
                                  for (item = cdolist_list_var_65.first(); (NIL != cdolist_list_var_65); cdolist_list_var_65 = cdolist_list_var_65.rest(), item = cdolist_list_var_65.first()) {
                                    result = cons(item, result);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      result = list_utilities.delete_duplicate_forts(result);
                    } finally {
                      at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                      at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_64, thread);
                      at_vars.$at_reln$.rebind(_prev_bind_0_63, thread);
                    }
                  }
                }
              } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 70253) 
  public static final SubLObject pos_lit_variable_isa_constraints_memoized(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return pos_lit_variable_isa_constraints_memoized_internal(var, literal, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym35$POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym35$POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym35$POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(var, literal, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (var.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && mt.equal(cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(pos_lit_variable_isa_constraints_memoized_internal(var, literal, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(var, literal, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 72871) 
  public static final SubLObject pos_lit_variable_quoted_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if ((NIL == forts.fort_p(predicate))) {
          predicate = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29732");
        }
        {
          SubLObject scoping_args = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) kb_accessors.scoping_args(predicate, mt)) : NIL);
          SubLObject argnum = ZERO_INTEGER;
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              {
                SubLObject asserted_genl_somethingP = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED))
                        || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL);
                {
                  SubLObject _prev_bind_0_66 = at_vars.$at_reln$.currentBinding(thread);
                  SubLObject _prev_bind_1_67 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                  SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                  try {
                    at_vars.$at_reln$.bind(predicate, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                           && (NIL != asserted_genl_somethingP))), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                           && (NIL != asserted_genl_somethingP))), thread);
                    {
                      SubLObject cdolist_list_var = el_utilities.literal_args(literal, $kw38$REGULARIZE);
                      SubLObject arg = NIL;
                      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
                        argnum = Numbers.add(argnum, ONE_INTEGER);
                        if ((NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED))) {
                        } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(arg))) {
                        } else if ((NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt))) {
                        } else if (var.equal(arg)) {
                          result = ConsesLow.nconc(result, at_argn_quoted_isa(predicate, argnum));
                        } else if ((NIL != modal_in_argP(predicate, argnum, mt))) {
                        } else if ((NIL != term.unreified_skolem_termP(arg))) {
                          if (var.eql(Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29786"))) {
                            result = at_argn_quoted_isa(predicate, argnum);
                          }
                          {
                            SubLObject skolem_number = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22936");
                            if ((NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED))) {
                              result = ConsesLow.nconc(result, Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11792"));
                            }
                          }
                        } else if ((NIL != czer_utilities.sentence_argP(predicate, argnum, mt))) {
                          if ((NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8769"))) {
                            if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                              {
                                SubLObject mt_arg = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30475");
                                SubLObject subformula = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30497");
                                SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                                if (((NIL == control_vars.within_askP())
                                    || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                  result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11763"));
                                }
                              }
                            } else {
                              result = ConsesLow.nconc(result, Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11764"));
                            }
                          }
                        } else if ((NIL != el_utilities.arg_types_prescribe_tacit_term_listP(predicate, argnum))) {
                        } else if ((NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED))) {
                          result = ConsesLow.nconc(result, Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11793"));
                        }
                      }
                      result = list_utilities.delete_duplicate_forts(result);
                    }
                  } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_67, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_66, thread);
                  }
                }
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 75093) 
  public static final SubLObject pos_lit_variable_genl_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if ((NIL == forts.fort_p(predicate))) {
          if ((NIL != term.closed_nautP(predicate, UNPROVIDED))) {
            predicate = cycl_utilities.find_closed_naut(predicate);
          }
        }
        {
          SubLObject scoping_args = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) kb_accessors.scoping_args(predicate, mt)) : NIL);
          SubLObject argnum = ZERO_INTEGER;
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              {
                SubLObject asserted_genl_somethingP = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED))
                        || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL);
                {
                  SubLObject _prev_bind_0_68 = at_vars.$at_reln$.currentBinding(thread);
                  SubLObject _prev_bind_1_69 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                  SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                  try {
                    at_vars.$at_reln$.bind(predicate, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                           && (NIL != asserted_genl_somethingP))), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                           && (NIL != asserted_genl_somethingP))), thread);
                    {
                      SubLObject cdolist_list_var = el_utilities.literal_args(literal, $kw38$REGULARIZE);
                      SubLObject arg = NIL;
                      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
                        argnum = Numbers.add(argnum, ONE_INTEGER);
                        if ((NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED))) {
                        } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(arg))) {
                        } else if ((NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt))) {
                        } else if (var.equal(arg)) {
                          result = ConsesLow.nconc(result, at_argn_genl(predicate, argnum));
                        } else if ((NIL != modal_in_argP(predicate, argnum, mt))) {
                        } else if ((NIL != term.unreified_skolem_termP(arg))) {
                          if (var.eql(Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29787"))) {
                            result = at_argn_genl(predicate, argnum);
                          }
                          {
                            SubLObject skolem_number = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22937");
                            if ((NIL != list_utilities.tree_find(var, skolem_number, UNPROVIDED, UNPROVIDED))) {
                              result = ConsesLow.nconc(result, Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11781"));
                            }
                          }
                        } else if ((NIL != czer_utilities.sentence_argP(predicate, argnum, mt))) {
                          if ((NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8770"))) {
                            if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                              {
                                SubLObject mt_arg = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30476");
                                SubLObject subformula = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30498");
                                SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                                if (((NIL == control_vars.within_askP())
                                    || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                  result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11746"));
                                }
                              }
                            } else {
                              result = ConsesLow.nconc(result, Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11747"));
                            }
                          }
                        } else if ((NIL != el_utilities.arg_types_prescribe_tacit_term_listP(predicate, argnum))) {
                        } else if ((NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED))) {
                          result = ConsesLow.nconc(result, Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11782"));
                        }
                      }
                      result = list_utilities.delete_duplicate_forts(result);
                    }
                  } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_69, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_68, thread);
                  }
                }
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 77205) 
  public static final SubLObject neg_lit_variable_inter_arg_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    if ((NIL != czer_utilities.within_disjunctionP())) {
      return pos_lit_variable_inter_arg_isa_constraints(var, literal, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 77567) 
  public static final SubLObject pos_lit_variable_inter_arg_isa_constraints(SubLObject var, SubLObject literal, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        SubLObject result = NIL;
        if ((NIL == forts.fort_p(predicate))) {
          predicate = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29733");
        }
        {
          SubLObject v_arity = el_utilities.literal_arity(literal, UNPROVIDED);
          SubLObject argnum = ZERO_INTEGER;
          SubLObject scoping_args = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) kb_accessors.scoping_args(predicate, mt)) : NIL);
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              {
                SubLObject asserted_genl_somethingP = ((NIL != forts.fort_p(predicate)) ? ((SubLObject) makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(predicate, UNPROVIDED))
                        || (NIL != genl_predicates.asserted_genl_inversesP(predicate, UNPROVIDED))))) : NIL);
                {
                  SubLObject _prev_bind_0_70 = at_vars.$at_reln$.currentBinding(thread);
                  SubLObject _prev_bind_1_71 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                  SubLObject _prev_bind_2 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                  try {
                    at_vars.$at_reln$.bind(predicate, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                           && (NIL != asserted_genl_somethingP))), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean(((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                           && (NIL != asserted_genl_somethingP))), thread);
                    {
                      SubLObject cdolist_list_var = el_utilities.literal_args(literal, $kw38$REGULARIZE);
                      SubLObject arg = NIL;
                      for (arg = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
                        argnum = Numbers.add(argnum, ONE_INTEGER);
                        if ((NIL != subl_promotions.memberP(argnum, scoping_args, UNPROVIDED, UNPROVIDED))) {
                        } else if ((NIL != cycl_grammar.fast_cycl_quoted_term_p(arg))) {
                        } else if ((NIL != czer_utilities.relax_arg_type_constraints_for_variables_for_argP(predicate, argnum, mt))) {
                        } else if (var.equal(vt_unskolemize_term(arg))) {
                          {
                            SubLObject _prev_bind_0_72 = at_vars.$at_profile_term$.currentBinding(thread);
                            try {
                              at_vars.$at_profile_term$.bind((var.equal(at_vars.$at_profile_term$.getDynamicValue(thread)) ? ((SubLObject) at_vars.$at_profile_term$.getDynamicValue(thread)) : NIL), thread);
                              {
                                SubLObject index = NIL;
                                for (index = ZERO_INTEGER; index.numL(v_arity); index = Numbers.add(index, ONE_INTEGER)) {
                                  {
                                    SubLObject ind_argnum = Numbers.add(index, ONE_INTEGER);
                                    if ((!(argnum.numE(ind_argnum)))) {
                                      {
                                        SubLObject ind_arg = el_utilities.literal_arg(literal, ind_argnum, UNPROVIDED);
                                        if ((NIL == ind_arg)) {
                                        } else if ((NIL != at_inter_arg_checkable_objectP(ind_arg))) {
                                          result = ConsesLow.nconc(result, inter_arg_isa(predicate, argnum, ind_arg, ind_argnum));
                                        } else {
                                          {
                                            SubLObject cdolist_list_var_73 = list_utilities.alist_lookup(at_vars.$at_var_isa$.getDynamicValue(thread), ind_arg, UNPROVIDED, UNPROVIDED);
                                            SubLObject ind_type = NIL;
                                            for (ind_type = cdolist_list_var_73.first(); (NIL != cdolist_list_var_73); cdolist_list_var_73 = cdolist_list_var_73.rest(), ind_type = cdolist_list_var_73.first()) {
                                              result = ConsesLow.nconc(result, inter_arg_isa_from_type(predicate, argnum, ind_type, ind_argnum));
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } finally {
                              at_vars.$at_profile_term$.rebind(_prev_bind_0_72, thread);
                            }
                          }
                        } else if ((NIL != modal_in_argP(predicate, argnum, mt))) {
                        } else if ((NIL != term.unreified_skolem_termP(arg))) {
                        } else if ((NIL != czer_utilities.sentence_argP(predicate, argnum, mt))) {
                          if ((NIL != Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8771"))) {
                            if ((NIL != el_utilities.mt_designating_literalP(literal))) {
                              {
                                SubLObject mt_arg = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30477");
                                SubLObject subformula = Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30499");
                                SubLObject lit_mt = ((NIL != fort_types_interface.mtP(mt_arg)) ? ((SubLObject) mt_arg) : mt);
                                if (((NIL == control_vars.within_askP())
                                    || (NIL != fort_types_interface.mtP(mt_arg)))) {
                                  result = ConsesLow.nconc(result, Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11755"));
                                }
                              }
                            } else {
                              result = ConsesLow.nconc(result, Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11756"));
                            }
                          }
                        } else if ((NIL != el_utilities.arg_types_prescribe_tacit_term_listP(predicate, argnum))) {
                        } else if ((NIL != list_utilities.tree_find(var, arg, EQUAL, UNPROVIDED))) {
                          result = ConsesLow.nconc(result, Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11785"));
                        }
                      }
                    }
                  } finally {
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_71, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_70, thread);
                  }
                }
                result = list_utilities.delete_duplicate_forts(result);
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 79924) 
  public static final SubLObject at_inter_arg_checkable_objectP(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
          || (NIL != term.first_order_nautP(object))));
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 96579) 
  public static final SubLObject at_min_cols(SubLObject cols, SubLObject mt) {
    return conses_high.copy_list(at_min_cols_memoized(kb_utilities.sort_terms(cols, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt));
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 96808) 
  public static final SubLObject at_min_cols_memoized_internal(SubLObject cols, SubLObject mt) {
    return genls.min_cols(cols, mt, UNPROVIDED);
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 96808) 
  public static final SubLObject at_min_cols_memoized(SubLObject cols, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return at_min_cols_memoized_internal(cols, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym42$AT_MIN_COLS_MEMOIZED, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym42$AT_MIN_COLS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym42$AT_MIN_COLS_MEMOIZED, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(cols, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (cols.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && mt.equal(cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(at_min_cols_memoized_internal(cols, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cols, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** assumes mt relevance established from outside,
   and that we are within a with-at-reln macro. */
  @SubL(source = "cycl/at-var-types.lisp", position = 98041) 
  public static final SubLObject at_argn_isa(SubLObject relation, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$mapping_assertion_bookkeeping_fn$.currentBinding(thread);
          try {
            at_vars.$at_constraint_type$.bind($kw25$ISA, thread);
            control_vars.$mapping_assertion_bookkeeping_fn$.bind($sym44$GATHER_AT_DATA_ASSERTION, thread);
            result = at_argn_int(relation, argnum, NIL, NIL, $sym45$ARGN_ISA, TWO_INTEGER);
          } finally {
            control_vars.$mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_1, thread);
            at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** assumes mt relevance established from outside,
   and that we are within a with-at-reln macro. */
  @SubL(source = "cycl/at-var-types.lisp", position = 98439) 
  public static final SubLObject at_argn_quoted_isa(SubLObject relation, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$mapping_assertion_bookkeeping_fn$.currentBinding(thread);
          try {
            at_vars.$at_constraint_type$.bind($kw25$ISA, thread);
            control_vars.$mapping_assertion_bookkeeping_fn$.bind($sym44$GATHER_AT_DATA_ASSERTION, thread);
            result = at_argn_int(relation, argnum, NIL, NIL, $sym46$ARGN_QUOTED_ISA, TWO_INTEGER);
          } finally {
            control_vars.$mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_1, thread);
            at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** assumes mt relevance established from outside,
   and that we are within a with-at-reln macro. */
  @SubL(source = "cycl/at-var-types.lisp", position = 98814) 
  public static final SubLObject at_argn_genl(SubLObject relation, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$at_constraint_type$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$mapping_assertion_bookkeeping_fn$.currentBinding(thread);
          try {
            at_vars.$at_constraint_type$.bind($kw27$GENLS, thread);
            control_vars.$mapping_assertion_bookkeeping_fn$.bind($sym44$GATHER_AT_DATA_ASSERTION, thread);
            result = at_argn_int(relation, argnum, NIL, NIL, $sym47$ARGN_GENL, TWO_INTEGER);
          } finally {
            control_vars.$mapping_assertion_bookkeeping_fn$.rebind(_prev_bind_1, thread);
            at_vars.$at_constraint_type$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** assumes mt relevance established from outside,
   and that we are within a with-at-reln macro. */
  @SubL(source = "cycl/at-var-types.lisp", position = 99179) 
  public static final SubLObject inter_arg_isa(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum) {
    return at_argn_int(relation, argnum, ind_arg, ind_argnum, $sym48$INTER_ARG_ISA_INT, FOUR_INTEGER);
  }

  /** assumes mt relevance established from outside,
   and that we are within a with-at-reln macro. */
  @SubL(source = "cycl/at-var-types.lisp", position = 99673) 
  public static final SubLObject inter_arg_isa_from_type(SubLObject relation, SubLObject argnum, SubLObject ind_type, SubLObject ind_argnum) {
    {
      SubLObject result = NIL;
      if ((NIL != term.el_fort_p(ind_type))) {
        result = at_argn_int(relation, argnum, ind_type, ind_argnum, $sym50$INTER_ARG_ISA_FROM_TYPE_INT, FOUR_INTEGER);
      } else {
        result = NIL;
      }
      return result;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 100403) 
  public static final SubLObject at_argn_int(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity) {
    return conses_high.copy_list(at_argn_int_cached(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_relevance_macros.mt_info(UNPROVIDED)));
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 100899) 
  private static SubLSymbol $at_argn_int_cached_caching_state$ = null;

  @SubL(source = "cycl/at-var-types.lisp", position = 100899) 
  public static final SubLObject clear_at_argn_int_cached() {
    {
      SubLObject cs = $at_argn_int_cached_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_at_argn_int_cached$ZeroArityFunction extends ZeroArityFunction {
    public $clear_at_argn_int_cached$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-AT-ARGN-INT-CACHED")); }
    public SubLObject processItem() { return clear_at_argn_int_cached(); }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 100899) 
  public static final SubLObject at_argn_int_cached_internal(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity, SubLObject mt_info) {
    {
      SubLObject result = NIL;
      if (((NIL != at_vars.at_searching_genl_predsP())
          || (NIL != at_vars.at_searching_genl_inversesP()))) {
        result = at_argn_int_funcall(at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum);
        if ((NIL != at_vars.at_searching_genl_predsP())) {
          {
            SubLObject csome_list_var = genl_predicates.all_proper_genl_predicates(relation, NIL, NIL);
            SubLObject pred = NIL;
            for (pred = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {
              result = ConsesLow.nconc(result, at_argn_int_funcall(at_func, at_func_arity, pred, argnum, ind_arg, ind_argnum));
            }
          }
        }
        if ((NIL != at_vars.at_searching_genl_inversesP())) {
          {
            SubLObject csome_list_var = genl_predicates.all_proper_genl_inverses(relation, NIL, NIL);
            SubLObject inverse = NIL;
            for (inverse = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), inverse = csome_list_var.first()) {
              result = ConsesLow.nconc(result, at_argn_int_funcall(at_func, at_func_arity, inverse, kb_accessors.inverse_argnum(argnum), ind_arg, ind_argnum));
            }
          }
        }
        result = list_utilities.delete_duplicate_forts(result);
      } else if ((NIL != term.kb_relationP(relation))) {
        result = at_argn_int_funcall(at_func, at_func_arity, relation, argnum, ind_arg, ind_argnum);
      }
      return result;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 100899) 
  public static final SubLObject at_argn_int_cached(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum, SubLObject at_func, SubLObject at_func_arity, SubLObject mt_info) {
    {
      SubLObject caching_state = $at_argn_int_cached_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym52$AT_ARGN_INT_CACHED, $sym53$_AT_ARGN_INT_CACHED_CACHING_STATE_, $int8$1024, EQ, SEVEN_INTEGER, ZERO_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym54$CLEAR_AT_ARGN_INT_CACHED);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_7(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw9$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if ((relation == cached_args.first())) {
                  cached_args = cached_args.rest();
                  if ((argnum == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if ((ind_arg == cached_args.first())) {
                      cached_args = cached_args.rest();
                      if ((ind_argnum == cached_args.first())) {
                        cached_args = cached_args.rest();
                        if ((at_func == cached_args.first())) {
                          cached_args = cached_args.rest();
                          if ((at_func_arity == cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args)
                                 && (NIL == cached_args.rest())
                                 && (mt_info == cached_args.first()))) {
                              return memoization_state.caching_results(results2);
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(at_argn_int_cached_internal(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, ind_arg, ind_argnum, at_func, at_func_arity, mt_info));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 102017) 
  public static final SubLObject at_argn_int_funcall(SubLObject at_func, SubLObject at_func_arity, SubLObject relation, SubLObject arg, SubLObject ind_arg, SubLObject ind_argnum) {
    {
      SubLObject result = NIL;
      SubLObject pcase_var = at_func_arity;
      if (pcase_var.eql(TWO_INTEGER)) {
        {
          SubLObject pcase_var_90 = at_func;
          if (pcase_var_90.eql($sym45$ARGN_ISA)) {
            result = kb_accessors.argn_isa(relation, arg, UNPROVIDED);
          } else if (pcase_var_90.eql($sym47$ARGN_GENL)) {
            result = kb_accessors.argn_genl(relation, arg, UNPROVIDED);
          } else {
            result = Functions.funcall(at_func, relation, arg);
          }
        }
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        {
          SubLObject pcase_var_91 = at_func;
          if (pcase_var_91.eql($sym48$INTER_ARG_ISA_INT)) {
            result = inter_arg_isa_int(relation, arg, ind_arg, ind_argnum);
          } else if (pcase_var_91.eql($sym49$INTER_ARG_GENL_INT)) {
            result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11776");
          } else if (pcase_var_91.eql($sym50$INTER_ARG_ISA_FROM_TYPE_INT)) {
            result = inter_arg_isa_from_type_int(relation, arg, ind_arg, ind_argnum);
          } else if (pcase_var_91.eql($sym51$INTER_ARG_GENL_FROM_TYPE_INT)) {
            result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11775");
          } else {
            result = Functions.funcall(at_func, relation, arg, ind_arg, ind_argnum);
          }
        }
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7150");
      }
      return result;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 102537) 
  public static final SubLObject inter_arg_isa_int(SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject ind_argnum) {
    {
      SubLObject at_pred = at_utilities.inter_arg_isa_pred(ind_argnum, argnum);
      if ((NIL != at_pred)) {
        return inter_arg_type_int($kw25$ISA, relation, argnum, ind_arg, at_pred);
      }
    }
    return NIL;
  }

  /** param TYPE; :isa or :genls */
  @SubL(source = "cycl/at-var-types.lisp", position = 102987) 
  public static final SubLObject inter_arg_type_int(SubLObject type, SubLObject relation, SubLObject argnum, SubLObject ind_arg, SubLObject at_pred) {
    {
      SubLObject candidates = NIL;
      SubLObject pred_var = at_pred;
      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var))) {
        {
          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
          SubLObject done_var = NIL;
          SubLObject token_var = NIL;
          while ((NIL == done_var)) {
            {
              SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
              SubLObject valid = makeBoolean((token_var != final_index_spec));
              if ((NIL != valid)) {
                {
                  SubLObject final_index_iterator = NIL;
                  try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw56$GAF, $kw57$TRUE, NIL);
                    {
                      SubLObject done_var_92 = NIL;
                      SubLObject token_var_93 = NIL;
                      while ((NIL == done_var_92)) {
                        {
                          SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_93);
                          SubLObject valid_94 = makeBoolean((token_var_93 != assertion));
                          if ((NIL != valid_94)) {
                            {
                              SubLObject ind_col = assertions_high.gaf_arg2(assertion);
                              SubLObject dep_col = assertions_high.gaf_arg3(assertion);
                              candidates = cons(list(ind_col, dep_col, assertion), candidates);
                            }
                          }
                          done_var_92 = makeBoolean((NIL == valid_94));
                        }
                      }
                    }
                  } finally {
                    {
                      SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                      try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                        if ((NIL != final_index_iterator)) {
                          kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                      } finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                      }
                    }
                  }
                }
              }
              done_var = makeBoolean((NIL == valid));
            }
          }
        }
      }
      if ((NIL != candidates)) {
        return inter_arg_type_verify_candidates(candidates, ind_arg, argnum, type);
      }
    }
    return NIL;
  }

  /** @param CANDIDATES; a list of triples of the form (ind-col dep-col assertion)
   @param TYPE; :isa or :genls */
  @SubL(source = "cycl/at-var-types.lisp", position = 103443) 
  public static final SubLObject inter_arg_type_verify_candidates(SubLObject candidates, SubLObject ind_arg, SubLObject argnum, SubLObject type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject candidate_collections = Mapping.mapcar(Symbols.symbol_function($sym58$FIRST), candidates);
        SubLObject actual_collections = ((type == $kw25$ISA) ? ((SubLObject) isa.all_isa_among(ind_arg, candidate_collections, UNPROVIDED, UNPROVIDED)) : Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4942"));
        if ((NIL != actual_collections)) {
          {
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = NIL;
            for (candidate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate = cdolist_list_var.first()) {
              {
                SubLObject datum = candidate;
                SubLObject current = datum;
                SubLObject ind_col = NIL;
                SubLObject dep_col = NIL;
                SubLObject assertion = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
                ind_col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
                dep_col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list59);
                assertion = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  if ((NIL != subl_promotions.memberP(ind_col, actual_collections, UNPROVIDED, UNPROVIDED))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7165");
                    {
                      SubLObject _prev_bind_0 = at_vars.$at_constraint_gaf$.currentBinding(thread);
                      try {
                        at_vars.$at_constraint_gaf$.bind(assertion, thread);
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7183");
                        result = cons(dep_col, result);
                      } finally {
                        at_vars.$at_constraint_gaf$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list59);
                }
              }
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 104302) 
  public static final SubLObject inter_arg_isa_from_type_int(SubLObject relation, SubLObject argnum, SubLObject ind_type, SubLObject ind_argnum) {
    {
      SubLObject at_pred = at_utilities.inter_arg_isa_pred(ind_argnum, argnum);
      if ((NIL != at_pred)) {
        return inter_arg_type_int($kw27$GENLS, relation, argnum, ind_type, at_pred);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 105061) 
  public static final SubLObject var_types_okP(SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
    if ((type == UNPROVIDED)) {
      type = $kw25$ISA;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = at_vars.$at_var_types_standard$.getDynamicValue(thread);
        if (pcase_var.eql($kw61$NOT_DISJOINT)) {
          return var_types_not_disjointP(var_types_pairs, type, mt);
        } else if (pcase_var.eql($kw62$NEGLITS_SUBSUME_POSLITS)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11797");
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 105344) 
  public static final SubLObject var_types_not_disjointP(SubLObject var_types_pairs, SubLObject type, SubLObject mt) {
    if ((type == UNPROVIDED)) {
      type = $kw25$ISA;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject doneP = NIL;
      SubLObject disjointP = NIL;
      SubLObject disjoint = NIL;
      if ((NIL == doneP)) {
        {
          SubLObject csome_list_var = var_types_pairs;
          SubLObject var_types = NIL;
          for (var_types = csome_list_var.first(); (!(((NIL != doneP)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), var_types = csome_list_var.first()) {
            disjoint = disjoint_with.any_disjoint_collection_pair(var_types.rest(), mt);
            if ((NIL != disjoint)) {
              disjointP = T;
              doneP = at_utilities.at_finishedP(T);
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7219");
            }
          }
        }
      }
      return makeBoolean((NIL == disjointP));
    }
  }

  @SubL(source = "cycl/at-var-types.lisp", position = 106830) 
  public static final SubLObject modal_in_argP(SubLObject relation, SubLObject index, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(relation))) {
      return makeBoolean(((NIL != somewhere_cache.some_pred_assertion_somewhereP($const65$modalInArg, relation, ONE_INTEGER, UNPROVIDED))
             && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30023"))));
    }
    return NIL;
  }

  public static final SubLObject declare_at_var_types_file() {
    //declareFunction(myName, "term_var_types_ok_intP", "TERM-VAR-TYPES-OK-INT?", 2, 0, false);
    declareFunction(myName, "formula_var_types_ok_intP", "FORMULA-VAR-TYPES-OK-INT?", 2, 0, false);
    //declareFunction(myName, "inter_formula_var_types_okP", "INTER-FORMULA-VAR-TYPES-OK?", 2, 0, false);
    //declareFunction(myName, "inter_formula_var_types_ok_intP", "INTER-FORMULA-VAR-TYPES-OK-INT?", 4, 0, false);
    declareFunction(myName, "independent_cnfs_variables_arg_constraints_okP", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
    declareFunction(myName, "independent_cnfs_variables_arg_constraints_okP_int", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
    //declareFunction(myName, "at_var_type_dnfs", "AT-VAR-TYPE-DNFS", 3, 0, false);
    //declareFunction(myName, "clear_at_var_type_dnfs_int_cached", "CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED", 0, 0, false);
    //declareFunction(myName, "remove_at_var_type_dnfs_int_cached", "REMOVE-AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
    //declareFunction(myName, "at_var_type_dnfs_int_cached_internal", "AT-VAR-TYPE-DNFS-INT-CACHED-INTERNAL", 2, 0, false);
    //declareFunction(myName, "at_var_type_dnfs_int_cached", "AT-VAR-TYPE-DNFS-INT-CACHED", 2, 0, false);
    //declareFunction(myName, "at_var_type_cnfs", "AT-VAR-TYPE-CNFS", 2, 0, false);
    declareFunction(myName, "at_var_type_cnfs_int", "AT-VAR-TYPE-CNFS-INT", 4, 0, false);
    declareFunction(myName, "at_var_types_cnfs_clausify", "AT-VAR-TYPES-CNFS-CLAUSIFY", 1, 0, false);
    declareFunction(myName, "opaque_arg_wrt_pragmatic_requirementP", "OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?", 2, 0, false);
    declareFunction(myName, "at_transform_true_sentence_negation_preds", "AT-TRANSFORM-TRUE-SENTENCE-NEGATION-PREDS", 2, 0, false);
    declareFunction(myName, "at_negatedP", "AT-NEGATED?", 1, 0, false);
    //declareFunction(myName, "at_negate", "AT-NEGATE", 1, 0, false);
    declareFunction(myName, "at_var_type_repackage_cnfs", "AT-VAR-TYPE-REPACKAGE-CNFS", 1, 0, false);
    //declareFunction(myName, "cnf_var_types_okP", "CNF-VAR-TYPES-OK?", 2, 1, false);
    //declareFunction(myName, "inter_cnf_var_types_okP", "INTER-CNF-VAR-TYPES-OK?", 2, 1, false);
    //declareFunction(myName, "query_var_types_okP", "QUERY-VAR-TYPES-OK?", 2, 1, false);
    //declareFunction(myName, "term_variables_arg_constraints", "TERM-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "formula_variables_arg_constraints", "FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "at_el_expand_all", "AT-EL-EXPAND-ALL", 2, 0, false);
    //declareFunction(myName, "parse_constraint", "PARSE-CONSTRAINT", 2, 0, false);
    //declareFunction(myName, "formula_variables_arg_constraints_dict", "FORMULA-VARIABLES-ARG-CONSTRAINTS-DICT", 2, 2, false);
    //declareFunction(myName, "inter_formula_variables_arg_constraints", "INTER-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "independent_formula_variables_arg_constraints", "INDEPENDENT-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "old_formula_variables_arg_constraints", "OLD-FORMULA-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "query_variables_arg_constraints", "QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_query_variables_arg_constraints", "INTER-QUERY-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "cnfs_variables_arg_constraints", "CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "independent_cnfs_variables_arg_constraints", "INDEPENDENT-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_cnfs_variables_arg_constraints", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_cnfs_variables_isa_constraints", "INTER-CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_cnfs_variables_quoted_isa_constraints", "INTER-CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_cnfs_variables_genl_constraints", "INTER-CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "hl_cnf_variables_arg_constraints", "HL-CNF-VARIABLES-ARG-CONSTRAINTS", 2, 0, false);
    //declareFunction(myName, "cnf_variables_arg_constraints", "CNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_cnfs_variables_arg_constraints_okP", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
    //declareFunction(myName, "inter_cnfs_variables_arg_constraints_okP_int", "INTER-CNFS-VARIABLES-ARG-CONSTRAINTS-OK?-INT", 2, 1, false);
    //declareFunction(myName, "cnfs_variables_arg_constraints_okP", "CNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
    declareFunction(myName, "cnf_variables_arg_constraints_okP", "CNF-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
    //declareFunction(myName, "var_isa_constraints_wrt_cnfs", "VAR-ISA-CONSTRAINTS-WRT-CNFS", 3, 1, false);
    //declareFunction(myName, "var_genl_constraints_wrt_cnfs", "VAR-GENL-CONSTRAINTS-WRT-CNFS", 3, 1, false);
    //declareFunction(myName, "cnfs_variables_isa_constraints", "CNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "cnfs_variables_quoted_isa_constraints", "CNFS-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "cnfs_variables_genl_constraints", "CNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "cnfs_variable_isa_constraints", "CNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "cnfs_variable_quoted_isa_constraints", "CNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "cnfs_variable_genl_constraints", "CNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_variables_isa_constraints", "CNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
    declareFunction(myName, "cnf_variables_quoted_isa_constraints", "CNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
    declareFunction(myName, "cnf_variables_genl_constraints", "CNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
    declareFunction(myName, "cnf_variable_isa_constraints", "CNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_variable_quoted_isa_constraints", "CNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_variable_genl_constraints", "CNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "cnfs_variable_inter_arg_isa_constraints", "CNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "cnfs_variable_inter_arg_genl_constraints", "CNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
    declareFunction(myName, "cnf_variable_inter_arg_isa_constraints", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "cnf_variable_inter_arg_genl_constraints", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
    declareFunction(myName, "cnf_variable_inter_arg_isa_constraints_int", "CNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
    //declareFunction(myName, "cnf_variable_inter_arg_genl_constraints_int", "CNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
    //declareFunction(myName, "cnfs_var_constraint_implications_okP", "CNFS-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
    declareFunction(myName, "cnf_var_constraint_implications_okP", "CNF-VAR-CONSTRAINT-IMPLICATIONS-OK?", 3, 1, false);
    //declareFunction(myName, "dnfs_variables_arg_constraints", "DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "inter_dnfs_variables_arg_constraints", "INTER-DNFS-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "dnf_variables_arg_constraints", "DNF-VARIABLES-ARG-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "dnfs_variables_arg_constraints_okP", "DNFS-VARIABLES-ARG-CONSTRAINTS-OK?", 2, 1, false);
    //declareFunction(myName, "dnfs_variables_isa_constraints", "DNFS-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "dnfs_variables_genl_constraints", "DNFS-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
    declareFunction(myName, "contextualized_dnf_variables_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLES-ISA-CONSTRAINT-TUPLES", 1, 1, false);
    //declareFunction(myName, "var_isa_constraints_wrt_dnfs", "VAR-ISA-CONSTRAINTS-WRT-DNFS", 3, 1, false);
    //declareFunction(myName, "var_genl_constraints_wrt_dnfs", "VAR-GENL-CONSTRAINTS-WRT-DNFS", 3, 1, false);
    //declareFunction(myName, "dnfs_variable_isa_constraints", "DNFS-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnfs_variable_quoted_isa_constraints", "DNFS-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnfs_variable_genl_constraints", "DNFS-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_variables_isa_constraints", "DNF-VARIABLES-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "dnf_variables_quoted_isa_constraints", "DNF-VARIABLES-QUOTED-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "dnf_variables_genl_constraints", "DNF-VARIABLES-GENL-CONSTRAINTS", 2, 1, false);
    //declareFunction(myName, "dnf_variable_isa_constraints", "DNF-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "contextualized_dnf_variable_isa_constraint_tuples", "CONTEXTUALIZED-DNF-VARIABLE-ISA-CONSTRAINT-TUPLES", 2, 0, false);
    declareFunction(myName, "contextualized_isa_x_y_litP", "CONTEXTUALIZED-ISA-X-Y-LIT?", 1, 0, false); new $contextualized_isa_x_y_litP$UnaryFunction();
    //declareFunction(myName, "dnf_variable_quoted_isa_constraints", "DNF-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_variable_genl_constraints", "DNF-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnfs_variable_inter_arg_isa_constraints", "DNFS-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "dnfs_variable_inter_arg_genl_constraints", "DNFS-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "dnf_variable_inter_arg_isa_constraints", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "dnf_variable_inter_arg_genl_constraints", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "dnf_variable_inter_arg_isa_constraints_int", "DNF-VARIABLE-INTER-ARG-ISA-CONSTRAINTS-INT", 3, 0, false);
    //declareFunction(myName, "dnf_variable_inter_arg_genl_constraints_int", "DNF-VARIABLE-INTER-ARG-GENL-CONSTRAINTS-INT", 3, 0, false);
    declareFunction(myName, "cnf_neg_lit_variable_isa_constraints", "CNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_neg_lit_variable_quoted_isa_constraints", "CNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_neg_lit_variable_genl_constraints", "CNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_pos_lit_variable_isa_constraints", "CNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_pos_lit_variable_quoted_isa_constraints", "CNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "cnf_pos_lit_variable_genl_constraints", "CNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_neg_lit_variable_isa_constraints", "DNF-NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_neg_lit_variable_quoted_isa_constraints", "DNF-NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_neg_lit_variable_genl_constraints", "DNF-NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "dnf_pos_lit_variable_isa_constraints", "DNF-POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_pos_lit_variable_quoted_isa_constraints", "DNF-POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "dnf_pos_lit_variable_genl_constraints", "DNF-POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "vt_unskolemize_term", "VT-UNSKOLEMIZE-TERM", 1, 0, false);
    declareFunction(myName, "neg_lit_variable_isa_constraints", "NEG-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "neg_lit_variable_quoted_isa_constraints", "NEG-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "neg_lit_variable_genl_constraints", "NEG-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "pos_lit_variable_isa_constraints", "POS-LIT-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "pos_lit_variable_isa_constraints_memoized_internal", "POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED-INTERNAL", 3, 0, false);
    declareFunction(myName, "pos_lit_variable_isa_constraints_memoized", "POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED", 3, 0, false);
    declareFunction(myName, "pos_lit_variable_quoted_isa_constraints", "POS-LIT-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "pos_lit_variable_genl_constraints", "POS-LIT-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "neg_lit_variable_inter_arg_isa_constraints", "NEG-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "neg_lit_variable_inter_arg_genl_constraints", "NEG-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "pos_lit_variable_inter_arg_isa_constraints", "POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "at_inter_arg_checkable_objectP", "AT-INTER-ARG-CHECKABLE-OBJECT?", 1, 0, false);
    //declareFunction(myName, "pos_lit_variable_inter_arg_genl_constraints", "POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "formula_variable_isa_constraints", "FORMULA-VARIABLE-ISA-CONSTRAINTS", 3, 1, false);
    //declareFunction(myName, "formula_variable_quoted_isa_constraints", "FORMULA-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 1, false);
    //declareFunction(myName, "formula_variable_genl_constraints", "FORMULA-VARIABLE-GENL-CONSTRAINTS", 3, 1, false);
    //declareFunction(myName, "formula_variable_arg_constraints", "FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 1, false);
    //declareFunction(myName, "cnf_formula_variable_arg_constraints", "CNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "dnf_formula_variable_arg_constraints", "DNF-FORMULA-VARIABLE-ARG-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "formula_variable_inter_arg_isa_constraints", "FORMULA-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 1, false);
    //declareFunction(myName, "formula_variable_inter_arg_genl_constraints", "FORMULA-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 1, false);
    //declareFunction(myName, "formula_variable_inter_arg_constraints", "FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 1, false);
    //declareFunction(myName, "cnf_formula_variable_inter_arg_constraints", "CNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "dnf_formula_variable_inter_arg_constraints", "DNF-FORMULA-VARIABLE-INTER-ARG-CONSTRAINTS", 4, 0, false);
    //declareFunction(myName, "relation_variable_isa_constraints", "RELATION-VARIABLE-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "relation_variable_quoted_isa_constraints", "RELATION-VARIABLE-QUOTED-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "relation_variable_genl_constraints", "RELATION-VARIABLE-GENL-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "relation_variable_inter_arg_isa_constraints", "RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS", 3, 0, false);
    //declareFunction(myName, "relation_variable_inter_arg_genl_constraints", "RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS", 3, 0, false);
    declareFunction(myName, "at_min_cols", "AT-MIN-COLS", 2, 0, false);
    declareFunction(myName, "at_min_cols_memoized_internal", "AT-MIN-COLS-MEMOIZED-INTERNAL", 2, 0, false);
    declareFunction(myName, "at_min_cols_memoized", "AT-MIN-COLS-MEMOIZED", 2, 0, false);
    //declareFunction(myName, "query_argP", "QUERY-ARG?", 3, 0, false);
    //declareFunction(myName, "query_denoting_collectionP", "QUERY-DENOTING-COLLECTION?", 2, 0, false);
    //declareFunction(myName, "at_arg_formula_type", "AT-ARG-FORMULA-TYPE", 3, 0, false);
    declareFunction(myName, "at_argn_isa", "AT-ARGN-ISA", 2, 0, false);
    declareFunction(myName, "at_argn_quoted_isa", "AT-ARGN-QUOTED-ISA", 2, 0, false);
    declareFunction(myName, "at_argn_genl", "AT-ARGN-GENL", 2, 0, false);
    declareFunction(myName, "inter_arg_isa", "INTER-ARG-ISA", 4, 0, false);
    //declareFunction(myName, "inter_arg_genl", "INTER-ARG-GENL", 4, 0, false);
    declareFunction(myName, "inter_arg_isa_from_type", "INTER-ARG-ISA-FROM-TYPE", 4, 0, false);
    //declareFunction(myName, "inter_arg_genl_from_type", "INTER-ARG-GENL-FROM-TYPE", 4, 0, false);
    declareFunction(myName, "at_argn_int", "AT-ARGN-INT", 6, 0, false);
    declareFunction(myName, "clear_at_argn_int_cached", "CLEAR-AT-ARGN-INT-CACHED", 0, 0, false); new $clear_at_argn_int_cached$ZeroArityFunction();
    //declareFunction(myName, "remove_at_argn_int_cached", "REMOVE-AT-ARGN-INT-CACHED", 7, 0, false);
    declareFunction(myName, "at_argn_int_cached_internal", "AT-ARGN-INT-CACHED-INTERNAL", 7, 0, false);
    declareFunction(myName, "at_argn_int_cached", "AT-ARGN-INT-CACHED", 7, 0, false);
    declareFunction(myName, "at_argn_int_funcall", "AT-ARGN-INT-FUNCALL", 6, 0, false);
    declareFunction(myName, "inter_arg_isa_int", "INTER-ARG-ISA-INT", 4, 0, false);
    //declareFunction(myName, "inter_arg_genl_int", "INTER-ARG-GENL-INT", 4, 0, false);
    declareFunction(myName, "inter_arg_type_int", "INTER-ARG-TYPE-INT", 5, 0, false);
    declareFunction(myName, "inter_arg_type_verify_candidates", "INTER-ARG-TYPE-VERIFY-CANDIDATES", 4, 0, false);
    declareFunction(myName, "inter_arg_isa_from_type_int", "INTER-ARG-ISA-FROM-TYPE-INT", 4, 0, false);
    //declareFunction(myName, "inter_arg_genl_from_type_int", "INTER-ARG-GENL-FROM-TYPE-INT", 4, 0, false);
    //declareFunction(myName, "constraint_var_types_okP", "CONSTRAINT-VAR-TYPES-OK?", 1, 2, false);
    declareFunction(myName, "var_types_okP", "VAR-TYPES-OK?", 1, 2, false);
    declareFunction(myName, "var_types_not_disjointP", "VAR-TYPES-NOT-DISJOINT?", 1, 2, false);
    //declareFunction(myName, "var_type_disjoint_violation", "VAR-TYPE-DISJOINT-VIOLATION", 4, 0, false);
    //declareFunction(myName, "var_types_neglits_subsume_poslitsP", "VAR-TYPES-NEGLITS-SUBSUME-POSLITS?", 1, 2, false);
    declareFunction(myName, "modal_in_argP", "MODAL-IN-ARG?", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_at_var_types_file() {
    $at_var_type_dnfs_int_cached_caching_state$ = deflexical("*AT-VAR-TYPE-DNFS-INT-CACHED-CACHING-STATE*", NIL);
    $at_true_sentence_negation_preds$ = defparameter("*AT-TRUE-SENTENCE-NEGATION-PREDS*", $kw11$UNINITIALIZED);
    $at_argn_int_cached_caching_state$ = deflexical("*AT-ARGN-INT-CACHED-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_at_var_types_file() {
    // CVS_ID("Id: at-var-types.lisp 128593 2009-08-21 15:54:07Z pace ");
    memoization_state.note_globally_cached_function($sym5$AT_VAR_TYPE_DNFS_INT_CACHED);
    memoization_state.note_memoized_function($sym35$POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED);
    memoization_state.note_memoized_function($sym42$AT_MIN_COLS_MEMOIZED);
    memoization_state.note_globally_cached_function($sym52$AT_ARGN_INT_CACHED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$__PRED_MUFFET_212 = makeSymbol("??PRED-MUFFET-212");
  public static final SubLSymbol $sym1$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym2$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $sym3$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");
  public static final SubLSymbol $kw4$BAD_EXPONENTIAL_CONJUNCTION = makeKeyword("BAD-EXPONENTIAL-CONJUNCTION");
  public static final SubLSymbol $sym5$AT_VAR_TYPE_DNFS_INT_CACHED = makeSymbol("AT-VAR-TYPE-DNFS-INT-CACHED");
  public static final SubLSymbol $sym6$SKOLEM_FUNCTION_VAR = makeSymbol("SKOLEM-FUNCTION-VAR");
  public static final SubLSymbol $sym7$_AT_VAR_TYPE_DNFS_INT_CACHED_CACHING_STATE_ = makeSymbol("*AT-VAR-TYPE-DNFS-INT-CACHED-CACHING-STATE*");
  public static final SubLInteger $int8$1024 = makeInteger(1024);
  public static final SubLSymbol $kw9$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw10$BAD_EXPONENTIAL_DISJUNCTION = makeKeyword("BAD-EXPONENTIAL-DISJUNCTION");
  public static final SubLSymbol $kw11$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLObject $const12$pragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("pragmaticRequirement"));
  public static final SubLObject $const13$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLSymbol $sym14$OPAQUE_ARG_WRT_PRAGMATIC_REQUIREMENT_ = makeSymbol("OPAQUE-ARG-WRT-PRAGMATIC-REQUIREMENT?");
  public static final SubLSymbol $sym15$AT_NEGATED_ = makeSymbol("AT-NEGATED?");
  public static final SubLSymbol $sym16$AT_NEGATE = makeSymbol("AT-NEGATE");
  public static final SubLObject $const17$termChosen = constant_handles.reader_make_constant_shell(makeString("termChosen"));
  public static final SubLObject $const18$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $kw19$RECURSION_LIMIT_EXCEEDED = makeKeyword("RECURSION-LIMIT-EXCEEDED");
  public static final SubLSymbol $kw20$INVALID_EXPANSION = makeKeyword("INVALID-EXPANSION");
  public static final SubLObject $const21$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const22$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const23$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $sym24$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $kw25$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw26$QUOTED_ISA = makeKeyword("QUOTED-ISA");
  public static final SubLSymbol $kw27$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $kw28$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw29$DISJOINT_ARG_ISA = makeKeyword("DISJOINT-ARG-ISA");
  public static final SubLSymbol $sym30$ISA_VAR_VAR_LIT_ = makeSymbol("ISA-VAR-VAR-LIT?");
  public static final SubLList $list31 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym32$CONTEXTUALIZED_ISA_X_Y_LIT_ = makeSymbol("CONTEXTUALIZED-ISA-X-Y-LIT?");
  public static final SubLList $list33 = list(makeSymbol("ISA-MT"), makeSymbol("ISA-X-Y-ASENT"));
  public static final SubLList $list34 = list(makeSymbol("GENLS-MT"), makeSymbol("GENLS-ASENT"));
  public static final SubLSymbol $sym35$POS_LIT_VARIABLE_ISA_CONSTRAINTS_MEMOIZED = makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS-MEMOIZED");
  public static final SubLObject $const36$TruthFunction = constant_handles.reader_make_constant_shell(makeString("TruthFunction"));
  public static final SubLObject $const37$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));
  public static final SubLSymbol $kw38$REGULARIZE = makeKeyword("REGULARIZE");
  public static final SubLSymbol $kw39$DNF = makeKeyword("DNF");
  public static final SubLSymbol $kw40$CNF = makeKeyword("CNF");
  public static final SubLObject $const41$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLSymbol $sym42$AT_MIN_COLS_MEMOIZED = makeSymbol("AT-MIN-COLS-MEMOIZED");
  public static final SubLSymbol $sym43$CYC_QUERY_ = makeSymbol("CYC-QUERY?");
  public static final SubLSymbol $sym44$GATHER_AT_DATA_ASSERTION = makeSymbol("GATHER-AT-DATA-ASSERTION");
  public static final SubLSymbol $sym45$ARGN_ISA = makeSymbol("ARGN-ISA");
  public static final SubLSymbol $sym46$ARGN_QUOTED_ISA = makeSymbol("ARGN-QUOTED-ISA");
  public static final SubLSymbol $sym47$ARGN_GENL = makeSymbol("ARGN-GENL");
  public static final SubLSymbol $sym48$INTER_ARG_ISA_INT = makeSymbol("INTER-ARG-ISA-INT");
  public static final SubLSymbol $sym49$INTER_ARG_GENL_INT = makeSymbol("INTER-ARG-GENL-INT");
  public static final SubLSymbol $sym50$INTER_ARG_ISA_FROM_TYPE_INT = makeSymbol("INTER-ARG-ISA-FROM-TYPE-INT");
  public static final SubLSymbol $sym51$INTER_ARG_GENL_FROM_TYPE_INT = makeSymbol("INTER-ARG-GENL-FROM-TYPE-INT");
  public static final SubLSymbol $sym52$AT_ARGN_INT_CACHED = makeSymbol("AT-ARGN-INT-CACHED");
  public static final SubLSymbol $sym53$_AT_ARGN_INT_CACHED_CACHING_STATE_ = makeSymbol("*AT-ARGN-INT-CACHED-CACHING-STATE*");
  public static final SubLSymbol $sym54$CLEAR_AT_ARGN_INT_CACHED = makeSymbol("CLEAR-AT-ARGN-INT-CACHED");
  public static final SubLString $str55$got_an_unexpected_function__s_wit = makeString("got an unexpected function ~s with arity ~s~%");
  public static final SubLSymbol $kw56$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw57$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym58$FIRST = makeSymbol("FIRST");
  public static final SubLList $list59 = list(makeSymbol("IND-COL"), makeSymbol("DEP-COL"), makeSymbol("ASSERTION"));
  public static final SubLString $str60$__at_var__a_test__arg__s__s__cons = makeString("~%at var ~a test: arg ~s ~s; constraint ~s");
  public static final SubLSymbol $kw61$NOT_DISJOINT = makeKeyword("NOT-DISJOINT");
  public static final SubLSymbol $kw62$NEGLITS_SUBSUME_POSLITS = makeKeyword("NEGLITS-SUBSUME-POSLITS");
  public static final SubLSymbol $kw63$DISJOINT_ARG_QUOTED_ISA = makeKeyword("DISJOINT-ARG-QUOTED-ISA");
  public static final SubLSymbol $kw64$DISJOINT_ARG_GENL = makeKeyword("DISJOINT-ARG-GENL");
  public static final SubLObject $const65$modalInArg = constant_handles.reader_make_constant_shell(makeString("modalInArg"));

  //// Initializers

  public void declareFunctions() {
    declare_at_var_types_file();
  }

  public void initializeVariables() {
    init_at_var_types_file();
  }

  public void runTopLevelForms() {
    setup_at_var_types_file();
  }

}
