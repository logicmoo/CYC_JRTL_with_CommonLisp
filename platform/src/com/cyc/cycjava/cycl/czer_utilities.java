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
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_hl_supports;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.cycjava.cycl.wff;

public  final class czer_utilities extends SubLTranslatedFile {

  //// Constructor

  private czer_utilities() {}
  public static final SubLFile me = new czer_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.czer_utilities";

  //// Definitions

  /** Return T iff RELATION is known to have any canonicalizer-directive assertions stated about it at all. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 1186) 
  public static final SubLObject some_canonicalizer_directive_assertions_somewhereP(SubLObject relation) {
    if ((NIL != forts.fort_p(relation))) {
      {
        SubLObject foundP = NIL;
        if ((NIL == foundP)) {
          {
            SubLObject csome_list_var = czer_vars.$canonicalizer_directive_predicates$.getGlobalValue();
            SubLObject czer_pred = NIL;
            for (czer_pred = csome_list_var.first(); (!(((NIL != foundP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), czer_pred = csome_list_var.first()) {
              if ((NIL != somewhere_cache.some_pred_assertion_somewhereP(czer_pred, relation, ONE_INTEGER, UNPROVIDED))) {
                foundP = T;
              }
            }
          }
        }
        return foundP;
      }
    }
    return NIL;
  }

  /** @return booleanp; whether the canonicalizer should respect DIRECTIVE when
canonicalizing the ARGNUMth argument position of RELATION in MT. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 1696) 
  public static final SubLObject canonicalizer_directive_for_argP(SubLObject relation, SubLObject argnum, SubLObject directive, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject resultP = NIL;
        if ((NIL == some_canonicalizer_directive_assertions_somewhereP(relation))) {
          return NIL;
        }
        {
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              {
                SubLObject pred_var = $const1$canonicalizerDirectiveForArg;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = resultP;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                        if ((NIL != valid)) {
                          {
                            SubLObject final_index_iterator = NIL;
                            try {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, $kw0$TRUE, NIL);
                              {
                                SubLObject done_var_1 = resultP;
                                SubLObject token_var_2 = NIL;
                                while ((NIL == done_var_1)) {
                                  {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                    SubLObject valid_3 = makeBoolean((token_var_2 != ass));
                                    if ((NIL != valid_3)) {
                                      {
                                        SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                        SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                        resultP = makeBoolean((argnum.eql(asserted_argnum)
                                               && (directive == asserted_directive)));
                                      }
                                    }
                                    done_var_1 = makeBoolean(((NIL == valid_3)
                                          || (NIL != resultP)));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                }
                              }
                            }
                          }
                        }
                        done_var = makeBoolean(((NIL == valid)
                              || (NIL != resultP)));
                      }
                    }
                  }
                }
              }
              {
                SubLObject pred_var = $const3$canonicalizerDirectiveForArgAndRe;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = resultP;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                        if ((NIL != valid)) {
                          {
                            SubLObject final_index_iterator = NIL;
                            try {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, $kw0$TRUE, NIL);
                              {
                                SubLObject done_var_5 = resultP;
                                SubLObject token_var_6 = NIL;
                                while ((NIL == done_var_5)) {
                                  {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                    SubLObject valid_7 = makeBoolean((token_var_6 != ass));
                                    if ((NIL != valid_7)) {
                                      {
                                        SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                                        SubLObject asserted_directive = assertions_high.gaf_arg3(ass);
                                        resultP = makeBoolean(((NIL != subl_promotions.non_negative_integer_p(asserted_argnum))
                                               && argnum.numGE(asserted_argnum)
                                               && (directive == asserted_directive)));
                                      }
                                    }
                                    done_var_5 = makeBoolean(((NIL == valid_7)
                                          || (NIL != resultP)));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
                                }
                              }
                            }
                          }
                        }
                        done_var = makeBoolean(((NIL == valid)
                              || (NIL != resultP)));
                      }
                    }
                  }
                }
              }
              {
                SubLObject pred_var = $const4$canonicalizerDirectiveForAllArgs;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
                    SubLObject done_var = resultP;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                        if ((NIL != valid)) {
                          {
                            SubLObject final_index_iterator = NIL;
                            try {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw2$GAF, $kw0$TRUE, NIL);
                              {
                                SubLObject done_var_9 = resultP;
                                SubLObject token_var_10 = NIL;
                                while ((NIL == done_var_9)) {
                                  {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                    SubLObject valid_11 = makeBoolean((token_var_10 != ass));
                                    if ((NIL != valid_11)) {
                                      {
                                        SubLObject asserted_directive = assertions_high.gaf_arg2(ass);
                                        resultP = Equality.eq(directive, asserted_directive);
                                      }
                                    }
                                    done_var_9 = makeBoolean(((NIL == valid_11)
                                          || (NIL != resultP)));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                }
                              }
                            }
                          }
                        }
                        done_var = makeBoolean(((NIL == valid)
                              || (NIL != resultP)));
                      }
                    }
                  }
                }
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        if ((NIL == resultP)) {
          {
            SubLObject csome_list_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8796");
            SubLObject spec_directive = NIL;
            for (spec_directive = csome_list_var.first(); (!(((NIL != resultP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), spec_directive = csome_list_var.first()) {
              if ((NIL != canonicalizer_directive_for_argP(relation, argnum, spec_directive, mt))) {
                resultP = T;
              }
            }
          }
        }
        return resultP;
      }
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 4269) 
  public static final SubLObject get_nth_canonical_variable(SubLObject n, SubLObject type) {
    if ((type == UNPROVIDED)) {
      type = czer_vars.$canonical_variable_type$.getDynamicValue();
    }
    {
      SubLObject pcase_var = type;
      if (pcase_var.eql($kw16$EL_VAR)) {
        return cycl_variables.make_el_var(PrintLow.format(NIL, $str17$X__d, n));
      } else if (pcase_var.eql($kw18$KB_VAR)) {
        return variables.find_variable_by_id(n);
      }
    }
    return NIL;
  }

  /** @return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit generic args as variables. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 4843) 
  public static final SubLObject arg_permits_generic_arg_variablesP(SubLObject reln, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (argnum.numG(ZERO_INTEGER)) {
      return canonicalizer_directive_for_argP(reln, argnum, $const14$AllowGenericArgVariables, mt);
    }
    return NIL;
  }

  /** @return boolean; t iff the arg constraints on arg position ARGNUM of relation RELN permit keywords as variables. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 5153) 
  public static final SubLObject arg_permits_keyword_variablesP(SubLObject reln, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (argnum.numG(ZERO_INTEGER)) {
      return canonicalizer_directive_for_argP(reln, argnum, $const9$AllowKeywordVariables, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 5452) 
  public static final SubLObject relax_arg_type_constraints_for_variables_for_argP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return canonicalizer_directive_for_argP(relation, argnum, $const20$RelaxArgTypeConstraintsForVariabl, mt);
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 5650) 
  public static final SubLObject dont_reorder_commutative_terms_for_args(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject argnums = NIL;
        if ((NIL == some_canonicalizer_directive_assertions_somewhereP(relation))) {
          return NIL;
        }
        {
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
              {
                SubLObject assertions = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30015");
                SubLObject cdolist_list_var = assertions;
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
                  {
                    SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                    if ((NIL != subl_promotions.non_negative_integer_p(asserted_argnum))) {
                      argnums = cons(asserted_argnum, argnums);
                    }
                  }
                }
              }
              {
                SubLObject assertions = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30016");
                SubLObject cdolist_list_var = assertions;
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
                  {
                    SubLObject asserted_argnum = assertions_high.gaf_arg2(ass);
                    SubLObject v_arity = arity.arity(relation);
                    if ((NIL != subl_promotions.non_negative_integer_p(asserted_argnum))) {
                      {
                        SubLObject end_var = Numbers.add(v_arity, ONE_INTEGER);
                        SubLObject argnum = NIL;
                        for (argnum = asserted_argnum; (!(argnum.numGE(end_var))); argnum = number_utilities.f_1X(argnum)) {
                          argnums = cons(argnum, argnums);
                        }
                      }
                    }
                  }
                }
              }
              {
                SubLObject assertions = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30017");
                if ((NIL != assertions)) {
                  {
                    SubLObject v_arity = arity.arity(relation);
                    SubLObject end_var = Numbers.add(v_arity, ONE_INTEGER);
                    SubLObject argnum = NIL;
                    for (argnum = ONE_INTEGER; (!(argnum.numGE(end_var))); argnum = number_utilities.f_1X(argnum)) {
                      argnums = cons(argnum, argnums);
                    }
                  }
                }
              }
            } finally {
              mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return list_utilities.fast_delete_duplicates(argnums, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  /** @return boolean; t iff arg number ARGNUM of RELATION is an CycLExpression .
   (note: such args need only pass syntactic wf tests) */
  @SubL(source = "cycl/czer-utilities.lisp", position = 8109) 
  public static final SubLObject expression_argP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (((NIL != forts.fort_p(relation))
         && argnum.isNumber()
         && argnum.numG(ZERO_INTEGER))) {
      if ((NIL != el_utilities.cyc_const_logical_operator_p(relation))) {
        return T;
      }
      return makeBoolean(((NIL != genls.any_specP($const23$CycLExpression, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED))
            || (NIL != genls.any_specP($const23$CycLExpression, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED))));
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 9190) 
  private static SubLSymbol $formula_arg_intP_caching_state$ = null;

  @SubL(source = "cycl/czer-utilities.lisp", position = 9414) 
  private static SubLSymbol $quoted_formula_arg_intP_caching_state$ = null;

  /** @return boolean; t iff RELATION's ARGNUMth arg is constrained to be a collection whose instances are Cyc sentences. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 9652) 
  public static final SubLObject sentence_argP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if (((NIL != forts.fort_p(relation))
         && argnum.isInteger()
         && argnum.numG(ZERO_INTEGER))) {
      if ((NIL != el_utilities.cyc_const_logical_operator_p(relation))) {
        return T;
      }
      return makeBoolean(((NIL != sentence_arg_intP(relation, argnum, mt))
            || (NIL != quoted_sentence_arg_intP(relation, argnum, mt))));
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 10119) 
  private static SubLSymbol $sentence_arg_intP_caching_state$ = null;

  @SubL(source = "cycl/czer-utilities.lisp", position = 10119) 
  public static final SubLObject sentence_arg_intP_internal(SubLObject relation, SubLObject argnum, SubLObject mt) {
    return genls.any_specP($const32$CycLSentence, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED);
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 10119) 
  public static final SubLObject sentence_arg_intP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    {
      SubLObject caching_state = $sentence_arg_intP_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym31$SENTENCE_ARG_INT_, $sym33$_SENTENCE_ARG_INT__CACHING_STATE_, $int27$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_)) {
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
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(sentence_arg_intP_internal(relation, argnum, mt)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 10335) 
  private static SubLSymbol $quoted_sentence_arg_intP_caching_state$ = null;

  @SubL(source = "cycl/czer-utilities.lisp", position = 10335) 
  public static final SubLObject quoted_sentence_arg_intP_internal(SubLObject relation, SubLObject argnum, SubLObject mt) {
    return genls.any_specP($const32$CycLSentence, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED);
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 10335) 
  public static final SubLObject quoted_sentence_arg_intP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    {
      SubLObject caching_state = $quoted_sentence_arg_intP_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym34$QUOTED_SENTENCE_ARG_INT_, $sym35$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_, $int27$1024, EQ, THREE_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_3(relation, argnum, mt);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_)) {
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
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (mt == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(quoted_sentence_arg_intP_internal(relation, argnum, mt)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, argnum, mt));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  /** @return boolean; t iff arg number ARGNUM of RELATION is an assertable formula
   (note: such args need pass semantic wf tests) */
  @SubL(source = "cycl/czer-utilities.lisp", position = 11154) 
  public static final SubLObject assertable_formula_argP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (((NIL != forts.fort_p(relation))
         && argnum.isNumber()
         && argnum.numG(ZERO_INTEGER))) {
      if ((NIL != el_utilities.cyc_const_logical_operator_p(relation))) {
        return T;
      }
      return makeBoolean(((NIL != genls.any_specP($const37$CycLSentence_Assertible, kb_accessors.argn_isa(relation, argnum, mt), mt, UNPROVIDED))
            || (NIL != genls.any_specP($const37$CycLSentence_Assertible, kb_accessors.argn_quoted_isa(relation, argnum, mt), mt, UNPROVIDED))));
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 13417) 
  public static final SubLObject leave_variables_at_el_for_argP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return canonicalizer_directive_for_argP(relation, argnum, $const11$LeaveVariablesAtEL, mt);
  }

  /** returns t iff PRED is a #$DistributingMetaKnowledgePredicate. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 13932) 
  public static final SubLObject distributing_meta_predP(SubLObject pred) {
    return fort_types_interface.distributing_meta_knowledge_predicate_p(pred);
  }

  /** @return boolean; t iff OBJECT is a list of clause/binding list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>)), or they could also be triples and the
third elements are ignored.
   This is the return value of @xref canonicalize-cycl. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 15737) 
  public static final SubLObject list_of_clause_binding_list_pairs_p(SubLObject object) {
    if ((!(object.isCons()))) {
      return NIL;
    }
    {
      SubLObject cdolist_list_var = object;
      SubLObject pair = NIL;
      for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
        if ((!(((NIL != list_utilities.lengthLE(pair, THREE_INTEGER, UNPROVIDED))
               && (NIL != clauses.cnf_p(pair.first()))
               && (NIL != bindings.binding_list_p(conses_high.second(pair))))))) {
          return NIL;
        }
      }
    }
    return T;
  }

  /** This is not destructive.
   @param thing list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
   @return list; a list of clauses with the blists ignored and the clauses unmodified. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 17184) 
  public static final SubLObject extract_hl_clauses(SubLObject thing) {
    return ((NIL != list_of_clause_binding_list_pairs_p(thing)) ? ((SubLObject) Mapping.mapcar($sym43$FIRST, thing)) : thing);
  }

  /** This is not destructive.
   @param thing list; a list of clause/binding-list pairs, e.g. ((<clause1> <blist1>) (<clause2> <blist2>))
   @return list; a list of clauses with the clauses ignored and the blists unmodified. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 17890) 
  public static final SubLObject extract_blists(SubLObject thing) {
    return ((NIL != list_of_clause_binding_list_pairs_p(thing)) ? ((SubLObject) Mapping.mapcar($sym44$SECOND, thing)) : thing);
  }

  /** Temporary control variable; should eventually stay T. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 19296) 
  private static SubLSymbol $czer_evaluatable_predicate_fix_enabledP$ = null;

  /** @return boolean; t iff CANDIDATE-VARIABLE is a variable, according to whatever definition of variable the canonicalizer is using at the time.
   @see :function cyc-var?
   @see :variable *canon-var-function* */
  @SubL(source = "cycl/czer-utilities.lisp", position = 22861) 
  public static final SubLObject canon_varP(SubLObject candidate_variable) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != candidate_variable)
             && (NIL != ((czer_vars.$canon_var_function$.getDynamicValue(thread) == $kw54$DEFAULT) ? ((SubLObject) cycl_variables.cyc_varP(candidate_variable)) : Functions.funcall(czer_vars.$canon_var_function$.getDynamicValue(thread), candidate_variable)))));
    }
  }

  public static final class $canon_varP$UnaryFunction extends UnaryFunction {
    public $canon_varP$UnaryFunction() { super(extractFunctionNamed("CANON-VAR?")); }
    public SubLObject processItem(SubLObject arg1) { return canon_varP(arg1); }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 23304) 
  public static final SubLObject true_sentenceP(SubLObject formula) {
    if ((NIL == el_utilities.el_negation_p(formula))) {
      return el_utilities.true_sentence_litP(formula);
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 23511) 
  public static final SubLObject true_negated_varP(SubLObject formula, SubLObject varP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym55$CYC_VAR_;
    }
    return makeBoolean(((NIL != true_sentenceP(formula))
           && (NIL != el_utilities.el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))
           && (NIL != Functions.funcall(varP, cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED)))));
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 23728) 
  public static final SubLObject true_negated_formulaP(SubLObject formula) {
    if ((NIL != true_sentenceP(formula))) {
      return makeBoolean(((NIL != el_utilities.el_negation_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30528"))));
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 24079) 
  public static final SubLObject encapsulate_formulaP(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.sequence_var(formula, UNPROVIDED))) {
        if (((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread))
             && (NIL != el_utilities.el_formula_p(formula))
             && (NIL != el_utilities.cyc_const_logical_operator_p(cycl_utilities.formula_operator(formula)))
             && (NIL != wff.el_wff_syntaxP(formula, UNPROVIDED)))) {
          return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
        } else {
          {
            SubLObject result = NIL;
            SubLObject tempformula = ((NIL != el_utilities.sequence_var(formula, UNPROVIDED)) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30663")) : formula);
            SubLObject formula_13 = tempformula;
            result = encapsulate_formulaP(formula_13);
            return result;
          }
        }
      } else if (((NIL != czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread))
           && (NIL != cycl_variables.el_varP(formula)))) {
        return czer_vars.$encapsulate_var_formulaP$.getDynamicValue(thread);
      } else if (((NIL != czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread))
           && (NIL != intensional_formulaP(formula)))) {
        return czer_vars.$encapsulate_intensional_formulaP$.getDynamicValue(thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 25156) 
  public static final SubLObject intensional_formulaP(SubLObject formula) {
    return makeBoolean((((NIL != within_disjunctionP())
             && (NIL == within_negated_disjunctionP())
             && (((NIL != el_utilities.el_universal_p(formula))
                 && ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30529"))
                  || (NIL == within_negationP())))
              || (((NIL != el_utilities.el_existential_p(formula))
                  || (NIL != el_utilities.el_bounded_existential_p(formula)))
                 && ((NIL != within_negationP())
                  || (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30530"))))))
          || ((NIL != control_vars.within_askP())
             && (((NIL != within_negationP())
                 && ((NIL != el_utilities.el_existential_p(formula))
                  || (NIL != el_utilities.el_bounded_existential_p(formula))))
              || ((NIL == within_negationP())
                 && (NIL != el_utilities.el_universal_p(formula)))))));
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 27972) 
  public static final SubLObject within_negationP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return czer_vars.$within_negationP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 28116) 
  public static final SubLObject within_disjunctionP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return at_vars.$within_disjunctionP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 28317) 
  public static final SubLObject within_negated_disjunctionP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return at_vars.$within_negated_disjunctionP$.getDynamicValue(thread);
    }
  }

  /** is FUNCTOR a reifiable functor?  The two ways FUNCTOR can be reifiable are:
1. FUNCTOR is a fort which is directly asserted to be reifiable
2. FUNCTOR is a reifiable-function-denoting naut,
   i.e. a naut with a fort as its functor (call that fort INNER-FUNCTOR),
   such that INNER-FUNCTOR denotes a reifiable function. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 28810) 
  public static final SubLObject reifiable_functorP(SubLObject functor, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean((((NIL != forts.fort_p(functor))
            || (NIL != term.first_order_nautP(functor)))
           && (NIL != fort_types_interface.isa_reifiable_functionP(functor, mt))));
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 29303) 
  public static final SubLObject reifiable_function_termP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != el_utilities.el_formula_p(v_term))
             && (NIL != ((NIL != czer_vars.$gathering_quantified_fn_termsP$.getDynamicValue(thread)) ? ((SubLObject) makeBoolean(((NIL != cycl_variables.cyc_varP(cycl_utilities.nat_functor(v_term)))
                      || (NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt))))) : makeBoolean(((NIL != reifiable_functorP(cycl_utilities.nat_functor(v_term), mt))
                     && (NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31557"))))))));
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 30294) 
  public static final SubLObject reifiable_nautP(SubLObject v_term, SubLObject varP, SubLObject mt) {
    if ((varP == UNPROVIDED)) {
      varP = Symbols.symbol_function($sym55$CYC_VAR_);
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != term.closed_nautP(v_term, varP))) {
      return makeBoolean(((NIL != reifiable_function_termP(v_term, mt))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10335"))));
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 31014) 
  public static final SubLObject evaluatable_function_symbolP(SubLObject symbol, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != forts.fort_p(symbol))
           && (NIL != fort_types_interface.evaluatable_function_p(symbol))));
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 31196) 
  public static final SubLObject evaluatable_function_termP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != el_utilities.el_formula_p(v_term))
           && (NIL != evaluatable_function_symbolP(cycl_utilities.nat_functor(v_term), mt))));
  }

  /** @return 0 sentence; SENTENCE, with any outermost #$ists stripped.
   @return 1 mt; MT, unless SENTENCE is an #$ist sentence, in which
   case the innermost mt specified by #$ist is returned, and MT is ignored.
   Yields an error if the mt is not specified in either of these two ways. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 42371) 
  public static final SubLObject unwrap_if_ist(SubLObject sentence, SubLObject mt) {
    return unwrap_if_ist_int(sentence, mt, T);
  }

  /** Like @xref unwrap-if-ist except doesn't error if no mt is specified. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 42811) 
  public static final SubLObject unwrap_if_ist_permissive(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return unwrap_if_ist_int(sentence, mt, NIL);
  }

  /** Like @xref unwrap-if-ist-permissive except canonicalizes the returned mt
   if it's different from MT. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 43213) 
  public static final SubLObject unwrap_if_ist_permissive_canonical(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return unwrap_if_ist_canonical_int(sentence, mt, NIL);
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 43453) 
  public static final SubLObject unwrap_if_ist_canonical_int(SubLObject sentence, SubLObject mt, SubLObject errorP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject original_mt = mt;
        thread.resetMultipleValues();
        {
          SubLObject sentence_15 = unwrap_if_ist_int(sentence, mt, errorP);
          SubLObject mt_16 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          sentence = sentence_15;
          mt = mt_16;
        }
        if ((NIL == hlmt.hlmt_equal(original_mt, mt))) {
          mt = czer_main.canonicalize_mt(mt);
        }
      }
      return Values.values(sentence, mt);
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 43751) 
  public static final SubLObject unwrap_if_ist_int(SubLObject sentence, SubLObject mt, SubLObject errorP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject sentence_17 = unwrap_if_ist_recursive(sentence, mt);
        SubLObject mt_18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_17;
        mt = mt_18;
      }
      if ((NIL != errorP)) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == mt)) {
            Errors.error($str76$_s__s_does_not_adequately_specify, sentence, mt);
          }
        }
      }
      return Values.values(sentence, mt);
    }
  }

  /** @return 0 sentence; SENTENCE, with any outermost #$ists stripped.
   @return 1 mt; MT, unless SENTENCE is an #$ist sentence, in which
   case the innermost mt specified by #$ist is returned, and MT is ignored.
   Yields an error if the mt is not specified in either of these two ways. */
  @SubL(source = "cycl/czer-utilities.lisp", position = 44008) 
  public static final SubLObject unwrap_if_ist_recursive(SubLObject sentence, SubLObject mt) {
    if (((NIL != el_utilities.ist_sentence_p(sentence))
         && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12254")))) {
      return unwrap_if_ist_recursive(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), cycl_utilities.sentence_arg1(sentence, UNPROVIDED));
    } else {
      return Values.values(sentence, mt);
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 45141) 
  public static final SubLObject quoted_term_with_hl_varP(SubLObject object) {
    return makeBoolean(((NIL != cycl_grammar.fast_quote_term_p(object))
           && (NIL != cycl_utilities.expression_find_if(Symbols.symbol_function($sym77$HL_VAR_), object, UNPROVIDED, UNPROVIDED))));
  }

  public static final class $quoted_term_with_hl_varP$UnaryFunction extends UnaryFunction {
    public $quoted_term_with_hl_varP$UnaryFunction() { super(extractFunctionNamed("QUOTED-TERM-WITH-HL-VAR?")); }
    public SubLObject processItem(SubLObject arg1) { return quoted_term_with_hl_varP(arg1); }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 45496) 
  public static final SubLObject possibly_escape_quote_hl_vars(SubLObject object, SubLObject destructiveP) {
    if ((destructiveP == UNPROVIDED)) {
      destructiveP = NIL;
    }
    if ((NIL == cycl_utilities.expression_find_if($sym79$QUOTED_TERM_WITH_HL_VAR_, object, UNPROVIDED, UNPROVIDED))) {
      return object;
    } else if ((NIL != destructiveP)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8847");
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8811");
    }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 46644) 
  public static final SubLObject generalized_ist_clauses_p(SubLObject v_clauses) {
    if ((NIL == cycl_grammar.cycl_truth_value_p(v_clauses))) {
      return list_utilities.every_in_list($sym82$GENERALIZED_IST_CLAUSE_P, v_clauses, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 46801) 
  public static final SubLObject generalized_ist_clause_p(SubLObject clause) {
    {
      SubLObject non_istP = NIL;
      {
        SubLObject rest = NIL;
        for (rest = clauses.neg_lits(clause); (!(((NIL != non_istP)
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject asent = rest.first();
            if ((NIL == generalized_ist_literal_p(asent))) {
              non_istP = T;
            }
          }
        }
      }
      {
        SubLObject rest = NIL;
        for (rest = clauses.pos_lits(clause); (!(((NIL != non_istP)
              || (NIL == rest)))); rest = rest.rest()) {
          {
            SubLObject asent = rest.first();
            if ((NIL == generalized_ist_literal_p(asent))) {
              non_istP = T;
            }
          }
        }
      }
      return makeBoolean((NIL == non_istP));
    }
  }

  public static final class $generalized_ist_clause_p$UnaryFunction extends UnaryFunction {
    public $generalized_ist_clause_p$UnaryFunction() { super(extractFunctionNamed("GENERALIZED-IST-CLAUSE-P")); }
    public SubLObject processItem(SubLObject arg1) { return generalized_ist_clause_p(arg1); }
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 47035) 
  public static final SubLObject generalized_ist_literal_p(SubLObject object) {
    return cycl_utilities.atomic_sentence_with_any_of_preds_p(object, $list83);
  }

  @SubL(source = "cycl/czer-utilities.lisp", position = 47167) 
  private static SubLSymbol $opaque_arg_wrt_quoting_target$ = null;

  public static final SubLObject declare_czer_utilities_file() {
    //declareFunction(myName, "some_canonicalizer_directive_assertionsP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS?", 1, 1, false);
    declareFunction(myName, "some_canonicalizer_directive_assertions_somewhereP", "SOME-CANONICALIZER-DIRECTIVE-ASSERTIONS-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "canonicalizer_directive_for_argP", "CANONICALIZER-DIRECTIVE-FOR-ARG?", 4, 0, false);
    //declareFunction(myName, "direct_genl_canonicalizer_directives", "DIRECT-GENL-CANONICALIZER-DIRECTIVES", 1, 0, false);
    //declareFunction(myName, "direct_spec_canonicalizer_directives", "DIRECT-SPEC-CANONICALIZER-DIRECTIVES", 1, 0, false);
    declareFunction(myName, "get_nth_canonical_variable", "GET-NTH-CANONICAL-VARIABLE", 1, 1, false);
    //declareFunction(myName, "canonical_variable_number", "CANONICAL-VARIABLE-NUMBER", 1, 0, false);
    declareFunction(myName, "arg_permits_generic_arg_variablesP", "ARG-PERMITS-GENERIC-ARG-VARIABLES?", 2, 1, false);
    declareFunction(myName, "arg_permits_keyword_variablesP", "ARG-PERMITS-KEYWORD-VARIABLES?", 2, 1, false);
    declareFunction(myName, "relax_arg_type_constraints_for_variables_for_argP", "RELAX-ARG-TYPE-CONSTRAINTS-FOR-VARIABLES-FOR-ARG?", 2, 1, false);
    declareFunction(myName, "dont_reorder_commutative_terms_for_args", "DONT-REORDER-COMMUTATIVE-TERMS-FOR-ARGS", 1, 1, false);
    //declareFunction(myName, "possibly_assertion_argP", "POSSIBLY-ASSERTION-ARG?", 2, 1, false);
    //declareFunction(myName, "assertion_argP", "ASSERTION-ARG?", 2, 1, false);
    //declareFunction(myName, "indexed_argP", "INDEXED-ARG?", 2, 0, false);
    declareFunction(myName, "expression_argP", "EXPRESSION-ARG?", 2, 1, false);
    //declareFunction(myName, "formula_argP", "FORMULA-ARG?", 2, 1, false);
    //declareFunction(myName, "clear_formula_arg_intP", "CLEAR-FORMULA-ARG-INT?", 0, 0, false);
    //declareFunction(myName, "remove_formula_arg_intP", "REMOVE-FORMULA-ARG-INT?", 2, 1, false);
    //declareFunction(myName, "formula_arg_intP_internal", "FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
    //declareFunction(myName, "formula_arg_intP", "FORMULA-ARG-INT?", 2, 1, false);
    //declareFunction(myName, "clear_quoted_formula_arg_intP", "CLEAR-QUOTED-FORMULA-ARG-INT?", 0, 0, false);
    //declareFunction(myName, "remove_quoted_formula_arg_intP", "REMOVE-QUOTED-FORMULA-ARG-INT?", 2, 1, false);
    //declareFunction(myName, "quoted_formula_arg_intP_internal", "QUOTED-FORMULA-ARG-INT?-INTERNAL", 3, 0, false);
    //declareFunction(myName, "quoted_formula_arg_intP", "QUOTED-FORMULA-ARG-INT?", 2, 1, false);
    declareFunction(myName, "sentence_argP", "SENTENCE-ARG?", 2, 1, false);
    //declareFunction(myName, "clear_sentence_arg_intP", "CLEAR-SENTENCE-ARG-INT?", 0, 0, false);
    //declareFunction(myName, "remove_sentence_arg_intP", "REMOVE-SENTENCE-ARG-INT?", 3, 0, false);
    declareFunction(myName, "sentence_arg_intP_internal", "SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
    declareFunction(myName, "sentence_arg_intP", "SENTENCE-ARG-INT?", 3, 0, false);
    //declareFunction(myName, "clear_quoted_sentence_arg_intP", "CLEAR-QUOTED-SENTENCE-ARG-INT?", 0, 0, false);
    //declareFunction(myName, "remove_quoted_sentence_arg_intP", "REMOVE-QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
    declareFunction(myName, "quoted_sentence_arg_intP_internal", "QUOTED-SENTENCE-ARG-INT?-INTERNAL", 3, 0, false);
    declareFunction(myName, "quoted_sentence_arg_intP", "QUOTED-SENTENCE-ARG-INT?", 3, 0, false);
    //declareFunction(myName, "askable_formula_argP", "ASKABLE-FORMULA-ARG?", 2, 1, false);
    declareFunction(myName, "assertable_formula_argP", "ASSERTABLE-FORMULA-ARG?", 2, 1, false);
    //declareFunction(myName, "askable_sentence_argP", "ASKABLE-SENTENCE-ARG?", 2, 1, false);
    //declareFunction(myName, "assertable_sentence_argP", "ASSERTABLE-SENTENCE-ARG?", 2, 1, false);
    //declareFunction(myName, "denotational_term_argP", "DENOTATIONAL-TERM-ARG?", 2, 1, false);
    //declareFunction(myName, "leave_some_terms_at_el_for_argP", "LEAVE-SOME-TERMS-AT-EL-FOR-ARG?", 2, 1, false);
    declareFunction(myName, "leave_variables_at_el_for_argP", "LEAVE-VARIABLES-AT-EL-FOR-ARG?", 2, 1, false);
    //declareFunction(myName, "arg_isa_quotedP", "ARG-ISA-QUOTED?", 2, 1, false);
    declareFunction(myName, "distributing_meta_predP", "DISTRIBUTING-META-PRED?", 1, 0, false);
    //declareFunction(myName, "find_hl_gaf", "FIND-HL-GAF", 1, 1, false);
    //declareFunction(myName, "find_hl_gaf_if", "FIND-HL-GAF-IF", 2, 0, false);
    //declareFunction(myName, "safe_find_gaf_genl_mts", "SAFE-FIND-GAF-GENL-MTS", 2, 0, false);
    //declareFunction(myName, "nput_back_clause_el_variables", "NPUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
    //declareFunction(myName, "put_back_clause_el_variables", "PUT-BACK-CLAUSE-EL-VARIABLES", 1, 0, false);
    declareFunction(myName, "list_of_clause_binding_list_pairs_p", "LIST-OF-CLAUSE-BINDING-LIST-PAIRS-P", 1, 0, false);
    //declareFunction(myName, "nextract_el_clauses", "NEXTRACT-EL-CLAUSES", 1, 0, false);
    //declareFunction(myName, "extract_el_clauses", "EXTRACT-EL-CLAUSES", 1, 0, false);
    declareFunction(myName, "extract_hl_clauses", "EXTRACT-HL-CLAUSES", 1, 0, false);
    //declareFunction(myName, "nextract_hl_clauses", "NEXTRACT-HL-CLAUSES", 1, 0, false);
    declareFunction(myName, "extract_blists", "EXTRACT-BLISTS", 1, 0, false);
    //declareFunction(myName, "nextract_blists", "NEXTRACT-BLISTS", 1, 0, false);
    //declareFunction(myName, "fn_tou_lit", "FN-TOU-LIT", 2, 0, false);
    //declareFunction(myName, "fn_equals_lit", "FN-EQUALS-LIT", 2, 0, false);
    //declareFunction(myName, "fn_evaluate_lit", "FN-EVALUATE-LIT", 2, 1, false);
    //declareFunction(myName, "fn_some_non_evaluatable_referenceP", "FN-SOME-NON-EVALUATABLE-REFERENCE?", 2, 1, false);
    //declareFunction(myName, "make_nart_var_tou_lit", "MAKE-NART-VAR-TOU-LIT", 1, 0, false);
    //declareFunction(myName, "make_nart_var_for_tou_lit", "MAKE-NART-VAR-FOR-TOU-LIT", 1, 0, false);
    //declareFunction(myName, "make_nart_var_equals_lit", "MAKE-NART-VAR-EQUALS-LIT", 1, 0, false);
    //declareFunction(myName, "make_nart_var_evaluate_lit", "MAKE-NART-VAR-EVALUATE-LIT", 1, 0, false);
    //declareFunction(myName, "clause_new_el_var_name", "CLAUSE-NEW-EL-VAR-NAME", 1, 0, false);
    //declareFunction(myName, "unique_var_name_wrt", "UNIQUE-VAR-NAME-WRT", 2, 0, false);
    //declareFunction(myName, "unique_el_var_wrt_expression", "UNIQUE-EL-VAR-WRT-EXPRESSION", 1, 1, false);
    //declareFunction(myName, "unique_hl_var_wrt_expression", "UNIQUE-HL-VAR-WRT-EXPRESSION", 1, 1, false);
    //declareFunction(myName, "make_czer_el_var_name", "MAKE-CZER-EL-VAR-NAME", 1, 0, false);
    declareFunction(myName, "canon_varP", "CANON-VAR?", 1, 0, false); new $canon_varP$UnaryFunction();
    declareFunction(myName, "true_sentenceP", "TRUE-SENTENCE?", 1, 0, false);
    declareFunction(myName, "true_negated_varP", "TRUE-NEGATED-VAR?", 1, 1, false);
    declareFunction(myName, "true_negated_formulaP", "TRUE-NEGATED-FORMULA?", 1, 0, false);
    //declareFunction(myName, "true_var_formulaP", "TRUE-VAR-FORMULA?", 1, 1, false);
    declareFunction(myName, "encapsulate_formulaP", "ENCAPSULATE-FORMULA?", 1, 0, false);
    //declareFunction(myName, "encapsulate_formula", "ENCAPSULATE-FORMULA", 1, 1, false);
    declareFunction(myName, "intensional_formulaP", "INTENSIONAL-FORMULA?", 1, 0, false);
    //declareFunction(myName, "make_var_formula_lit", "MAKE-VAR-FORMULA-LIT", 1, 0, false);
    //declareFunction(myName, "make_intensional_lit", "MAKE-INTENSIONAL-LIT", 1, 0, false);
    //declareFunction(myName, "make_intensional_lit_int", "MAKE-INTENSIONAL-LIT-INT", 1, 0, false);
    //declareFunction(myName, "formula_has_expansionP", "FORMULA-HAS-EXPANSION?", 1, 1, false);
    //declareFunction(myName, "relation_has_expansionP", "RELATION-HAS-EXPANSION?", 1, 1, false);
    declareFunction(myName, "within_negationP", "WITHIN-NEGATION?", 0, 0, false);
    declareFunction(myName, "within_disjunctionP", "WITHIN-DISJUNCTION?", 0, 0, false);
    //declareFunction(myName, "within_conjunctionP", "WITHIN-CONJUNCTION?", 0, 0, false);
    declareFunction(myName, "within_negated_disjunctionP", "WITHIN-NEGATED-DISJUNCTION?", 0, 0, false);
    //declareFunction(myName, "commuting_functionsP", "COMMUTING-FUNCTIONS?", 2, 1, false);
    declareFunction(myName, "reifiable_functorP", "REIFIABLE-FUNCTOR?", 1, 1, false);
    declareFunction(myName, "reifiable_function_termP", "REIFIABLE-FUNCTION-TERM?", 1, 1, false);
    //declareFunction(myName, "wf_reifiable_function_termP", "WF-REIFIABLE-FUNCTION-TERM?", 1, 1, false);
    //declareFunction(myName, "reifiable_termP", "REIFIABLE-TERM?", 1, 0, false);
    //declareFunction(myName, "reifiable_nat_termP", "REIFIABLE-NAT-TERM?", 1, 0, false);
    //declareFunction(myName, "unreified_reifiable_nat_termP", "UNREIFIED-REIFIABLE-NAT-TERM?", 1, 0, false);
    declareFunction(myName, "reifiable_nautP", "REIFIABLE-NAUT?", 1, 2, false);
    //declareFunction(myName, "fort_or_naut_with_corresponding_nartP", "FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
    //declareFunction(myName, "list_of_fort_or_naut_with_corresponding_nartP", "LIST-OF-FORT-OR-NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
    //declareFunction(myName, "naut_with_corresponding_nartP", "NAUT-WITH-CORRESPONDING-NART?", 1, 0, false);
    declareFunction(myName, "evaluatable_function_symbolP", "EVALUATABLE-FUNCTION-SYMBOL?", 1, 1, false);
    declareFunction(myName, "evaluatable_function_termP", "EVALUATABLE-FUNCTION-TERM?", 1, 1, false);
    //declareFunction(myName, "unpackage_cnf_clause", "UNPACKAGE-CNF-CLAUSE", 1, 0, false);
    //declareFunction(myName, "equals_el_memoizedP_internal", "EQUALS-EL-MEMOIZED?-INTERNAL", 2, 2, false);
    //declareFunction(myName, "equals_el_memoizedP", "EQUALS-EL-MEMOIZED?", 2, 2, false);
    //declareFunction(myName, "queries_equal_at_elP", "QUERIES-EQUAL-AT-EL?", 2, 1, false);
    //declareFunction(myName, "equals_elP", "EQUALS-EL?", 2, 2, false);
    //declareFunction(myName, "equals_el_intP", "EQUALS-EL-INT?", 5, 0, false);
    //declareFunction(myName, "el_expression_equalP", "EL-EXPRESSION-EQUAL?", 2, 3, false);
    //declareFunction(myName, "canonicalize_for_equals_el", "CANONICALIZE-FOR-EQUALS-EL", 4, 0, false);
    //declareFunction(myName, "el_expression_equal_unification_successfulP", "EL-EXPRESSION-EQUAL-UNIFICATION-SUCCESSFUL?", 1, 0, false);
    //declareFunction(myName, "non_null_closed_termP", "NON-NULL-CLOSED-TERM?", 1, 0, false);
    //declareFunction(myName, "delete_el_duplicates", "DELETE-EL-DUPLICATES", 1, 0, false);
    //declareFunction(myName, "cnfs_reorder_equalP", "CNFS-REORDER-EQUAL?", 2, 1, false);
    //declareFunction(myName, "cnfs_reorder_literals_equalP", "CNFS-REORDER-LITERALS-EQUAL?", 2, 1, false);
    //declareFunction(myName, "cnfs_reorder_terms_equalP", "CNFS-REORDER-TERMS-EQUAL?", 2, 1, false);
    //declareFunction(myName, "ordered_cnf_unifyP", "ORDERED-CNF-UNIFY?", 2, 0, false);
    //declareFunction(myName, "ordered_literals_unify", "ORDERED-LITERALS-UNIFY", 2, 0, false);
    //declareFunction(myName, "ordered_literals_unify_int", "ORDERED-LITERALS-UNIFY-INT", 2, 0, false);
    //declareFunction(myName, "el_find_nart", "EL-FIND-NART", 1, 0, false);
    //declareFunction(myName, "el_find_if_nart", "EL-FIND-IF-NART", 1, 0, false);
    //declareFunction(myName, "recanonicalized_candidate_nat_equals_nat_formulaP", "RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?", 2, 0, false);
    //declareFunction(myName, "recanonicalize_candidate_nat", "RECANONICALIZE-CANDIDATE-NAT", 1, 0, false);
    //declareFunction(myName, "robust_nart_lookupP", "ROBUST-NART-LOOKUP?", 0, 0, false);
    //declareFunction(myName, "sort_forts_external", "SORT-FORTS-EXTERNAL", 1, 0, false);
    //declareFunction(myName, "definitional_lits_to_front", "DEFINITIONAL-LITS-TO-FRONT", 1, 0, false);
    //declareFunction(myName, "evaluatable_expressions_out", "EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false);
    declareFunction(myName, "unwrap_if_ist", "UNWRAP-IF-IST", 2, 0, false);
    declareFunction(myName, "unwrap_if_ist_permissive", "UNWRAP-IF-IST-PERMISSIVE", 1, 1, false);
    //declareFunction(myName, "unwrap_if_ist_canonical", "UNWRAP-IF-IST-CANONICAL", 1, 1, false);
    declareFunction(myName, "unwrap_if_ist_permissive_canonical", "UNWRAP-IF-IST-PERMISSIVE-CANONICAL", 1, 1, false);
    declareFunction(myName, "unwrap_if_ist_canonical_int", "UNWRAP-IF-IST-CANONICAL-INT", 3, 0, false);
    declareFunction(myName, "unwrap_if_ist_int", "UNWRAP-IF-IST-INT", 3, 0, false);
    declareFunction(myName, "unwrap_if_ist_recursive", "UNWRAP-IF-IST-RECURSIVE", 2, 0, false);
    //declareFunction(myName, "possibly_quoted_cycl_formula_p", "POSSIBLY-QUOTED-CYCL-FORMULA-P", 1, 0, false);
    //declareFunction(myName, "unwrap_quotes", "UNWRAP-QUOTES", 1, 0, false);
    declareFunction(myName, "quoted_term_with_hl_varP", "QUOTED-TERM-WITH-HL-VAR?", 1, 0, false); new $quoted_term_with_hl_varP$UnaryFunction();
    //declareFunction(myName, "escape_term", "ESCAPE-TERM", 1, 0, false);
    declareFunction(myName, "possibly_escape_quote_hl_vars", "POSSIBLY-ESCAPE-QUOTE-HL-VARS", 1, 1, false);
    //declareFunction(myName, "escape_quote_hl_vars", "ESCAPE-QUOTE-HL-VARS", 1, 0, false);
    //declareFunction(myName, "nescape_quote_hl_vars", "NESCAPE-QUOTE-HL-VARS", 1, 0, false);
    //declareFunction(myName, "decontextualized_clausesP", "DECONTEXTUALIZED-CLAUSES?", 1, 0, false);
    //declareFunction(myName, "decontextualized_clauseP", "DECONTEXTUALIZED-CLAUSE?", 1, 0, false);
    declareFunction(myName, "generalized_ist_clauses_p", "GENERALIZED-IST-CLAUSES-P", 1, 0, false);
    declareFunction(myName, "generalized_ist_clause_p", "GENERALIZED-IST-CLAUSE-P", 1, 0, false); new $generalized_ist_clause_p$UnaryFunction();
    declareFunction(myName, "generalized_ist_literal_p", "GENERALIZED-IST-LITERAL-P", 1, 0, false);
    //declareFunction(myName, "opaque_arg_wrt_quoting_seeker", "OPAQUE-ARG-WRT-QUOTING-SEEKER", 2, 0, false);
    //declareFunction(myName, "note_opaque_reference_to_term", "NOTE-OPAQUE-REFERENCE-TO-TERM", 2, 0, false);
    //declareFunction(myName, "formula_references_term_opaquelyP", "FORMULA-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
    //declareFunction(myName, "assertion_references_term_opaquelyP", "ASSERTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
    //declareFunction(myName, "kb_hl_support_references_term_opaquelyP", "KB-HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
    //declareFunction(myName, "hl_support_references_term_opaquelyP", "HL-SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
    //declareFunction(myName, "support_references_term_opaquelyP", "SUPPORT-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
    //declareFunction(myName, "deduction_references_term_opaquelyP", "DEDUCTION-REFERENCES-TERM-OPAQUELY?", 2, 1, false);
    //declareFunction(myName, "term_opaque_assertions", "TERM-OPAQUE-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "all_term_opaque_assertions", "ALL-TERM-OPAQUE-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "term_opaque_deductions", "TERM-OPAQUE-DEDUCTIONS", 1, 1, false);
    //declareFunction(myName, "all_term_opaque_deductions", "ALL-TERM-OPAQUE-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "canonicalize_el_sentence", "CANONICALIZE-EL-SENTENCE", 2, 0, false);
    //declareFunction(myName, "canon_equalP", "CANON-EQUAL?", 2, 3, false);
    //declareFunction(myName, "canon_query_equalP", "CANON-QUERY-EQUAL?", 2, 3, false);
    //declareFunction(myName, "canon_assert_equalP", "CANON-ASSERT-EQUAL?", 2, 3, false);
    //declareFunction(myName, "canon_assert_isomorphicP", "CANON-ASSERT-ISOMORPHIC?", 2, 3, false);
    //declareFunction(myName, "canon_forms_equalP", "CANON-FORMS-EQUAL?", 2, 1, false);
    //declareFunction(myName, "canon_forms_isomorphicP", "CANON-FORMS-ISOMORPHIC?", 2, 1, false);
    //declareFunction(myName, "canon_equal_hl_namesP", "CANON-EQUAL-HL-NAMES?", 2, 4, false);
    //declareFunction(myName, "constant_occurs_in_formulaP", "CONSTANT-OCCURS-IN-FORMULA?", 2, 0, false);
    //declareFunction(myName, "canonicalize_and_return_skolem_vars", "CANONICALIZE-AND-RETURN-SKOLEM-VARS", 1, 1, false);
    //declareFunction(myName, "find_anywhere", "FIND-ANYWHERE", 2, 2, false);
    //declareFunction(myName, "find_all_anywhere", "FIND-ALL-ANYWHERE", 2, 3, false);
    //declareFunction(myName, "return_uncanon", "RETURN-UNCANON", 2, 0, false);
    //declareFunction(myName, "uncanon_original_test", "UNCANON-ORIGINAL-TEST", 2, 0, false);
    //declareFunction(myName, "uncanon_test", "UNCANON-TEST", 2, 2, false);
    //declareFunction(myName, "assert_return_uncanon", "ASSERT-RETURN-UNCANON", 3, 0, false);
    //declareFunction(myName, "canon_mal_resultP", "CANON-MAL-RESULT?", 1, 1, false);
    //declareFunction(myName, "canon_ask_mal_resultP", "CANON-ASK-MAL-RESULT?", 1, 1, false);
    //declareFunction(myName, "canon_query_mal_resultP", "CANON-QUERY-MAL-RESULT?", 1, 1, false);
    //declareFunction(myName, "canon_assert_mal_resultP", "CANON-ASSERT-MAL-RESULT?", 1, 1, false);
    //declareFunction(myName, "canon_form_mal_resultP", "CANON-FORM-MAL-RESULT?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_czer_utilities_file() {
    $formula_arg_intP_caching_state$ = deflexical("*FORMULA-ARG-INT?-CACHING-STATE*", NIL);
    $quoted_formula_arg_intP_caching_state$ = deflexical("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*", NIL);
    $sentence_arg_intP_caching_state$ = deflexical("*SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
    $quoted_sentence_arg_intP_caching_state$ = deflexical("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*", NIL);
    $czer_evaluatable_predicate_fix_enabledP$ = defparameter("*CZER-EVALUATABLE-PREDICATE-FIX-ENABLED?*", NIL);
    $opaque_arg_wrt_quoting_target$ = defparameter("*OPAQUE-ARG-WRT-QUOTING-TARGET*", NIL);
    return NIL;
  }

  public static final SubLObject setup_czer_utilities_file() {
    // CVS_ID("Id: czer-utilities.lisp 127877 2009-05-27 15:07:45Z pace ");
    memoization_state.note_globally_cached_function($sym24$FORMULA_ARG_INT_);
    memoization_state.note_globally_cached_function($sym29$QUOTED_FORMULA_ARG_INT_);
    memoization_state.note_globally_cached_function($sym31$SENTENCE_ARG_INT_);
    memoization_state.note_globally_cached_function($sym34$QUOTED_SENTENCE_ARG_INT_);
    memoization_state.note_memoized_function($sym62$EQUALS_EL_MEMOIZED_);
    utilities_macros.note_funcall_helper_function($sym84$OPAQUE_ARG_WRT_QUOTING_SEEKER);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const1$canonicalizerDirectiveForArg = constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArg"));
  public static final SubLSymbol $kw2$GAF = makeKeyword("GAF");
  public static final SubLObject $const3$canonicalizerDirectiveForArgAndRe = constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArgAndRest"));
  public static final SubLObject $const4$canonicalizerDirectiveForAllArgs = constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForAllArgs"));
  public static final SubLObject $const5$LeaveSomeTermsAtEL = constant_handles.reader_make_constant_shell(makeString("LeaveSomeTermsAtEL"));
  public static final SubLList $list6 = list(constant_handles.reader_make_constant_shell(makeString("LeaveVariablesAtEL")));
  public static final SubLObject $const7$LeaveSomeTermsAtELAndAllowKeyword = constant_handles.reader_make_constant_shell(makeString("LeaveSomeTermsAtELAndAllowKeywordVariables"));
  public static final SubLList $list8 = list(constant_handles.reader_make_constant_shell(makeString("LeaveSomeTermsAtEL")), constant_handles.reader_make_constant_shell(makeString("AllowKeywordVariables")));
  public static final SubLObject $const9$AllowKeywordVariables = constant_handles.reader_make_constant_shell(makeString("AllowKeywordVariables"));
  public static final SubLList $list10 = list(constant_handles.reader_make_constant_shell(makeString("AllowGenericArgVariables")));
  public static final SubLObject $const11$LeaveVariablesAtEL = constant_handles.reader_make_constant_shell(makeString("LeaveVariablesAtEL"));
  public static final SubLList $list12 = list(constant_handles.reader_make_constant_shell(makeString("LeaveSomeTermsAtEL")));
  public static final SubLList $list13 = list(constant_handles.reader_make_constant_shell(makeString("LeaveSomeTermsAtELAndAllowKeywordVariables")));
  public static final SubLObject $const14$AllowGenericArgVariables = constant_handles.reader_make_constant_shell(makeString("AllowGenericArgVariables"));
  public static final SubLList $list15 = list(constant_handles.reader_make_constant_shell(makeString("AllowKeywordVariables")));
  public static final SubLSymbol $kw16$EL_VAR = makeKeyword("EL-VAR");
  public static final SubLString $str17$X__d = makeString("X-~d");
  public static final SubLSymbol $kw18$KB_VAR = makeKeyword("KB-VAR");
  public static final SubLString $str19$_a_was_not_a_canonical_variable = makeString("~a was not a canonical variable");
  public static final SubLObject $const20$RelaxArgTypeConstraintsForVariabl = constant_handles.reader_make_constant_shell(makeString("RelaxArgTypeConstraintsForVariables"));
  public static final SubLObject $const21$DontReOrderCommutativeTerms = constant_handles.reader_make_constant_shell(makeString("DontReOrderCommutativeTerms"));
  public static final SubLObject $const22$CycLIndexedTerm = constant_handles.reader_make_constant_shell(makeString("CycLIndexedTerm"));
  public static final SubLObject $const23$CycLExpression = constant_handles.reader_make_constant_shell(makeString("CycLExpression"));
  public static final SubLSymbol $sym24$FORMULA_ARG_INT_ = makeSymbol("FORMULA-ARG-INT?");
  public static final SubLObject $const25$CycLFormula = constant_handles.reader_make_constant_shell(makeString("CycLFormula"));
  public static final SubLSymbol $sym26$_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*FORMULA-ARG-INT?-CACHING-STATE*");
  public static final SubLInteger $int27$1024 = makeInteger(1024);
  public static final SubLSymbol $kw28$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym29$QUOTED_FORMULA_ARG_INT_ = makeSymbol("QUOTED-FORMULA-ARG-INT?");
  public static final SubLSymbol $sym30$_QUOTED_FORMULA_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-FORMULA-ARG-INT?-CACHING-STATE*");
  public static final SubLSymbol $sym31$SENTENCE_ARG_INT_ = makeSymbol("SENTENCE-ARG-INT?");
  public static final SubLObject $const32$CycLSentence = constant_handles.reader_make_constant_shell(makeString("CycLSentence"));
  public static final SubLSymbol $sym33$_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*SENTENCE-ARG-INT?-CACHING-STATE*");
  public static final SubLSymbol $sym34$QUOTED_SENTENCE_ARG_INT_ = makeSymbol("QUOTED-SENTENCE-ARG-INT?");
  public static final SubLSymbol $sym35$_QUOTED_SENTENCE_ARG_INT__CACHING_STATE_ = makeSymbol("*QUOTED-SENTENCE-ARG-INT?-CACHING-STATE*");
  public static final SubLObject $const36$CycLSentence_Askable = constant_handles.reader_make_constant_shell(makeString("CycLSentence-Askable"));
  public static final SubLObject $const37$CycLSentence_Assertible = constant_handles.reader_make_constant_shell(makeString("CycLSentence-Assertible"));
  public static final SubLObject $const38$CycLDenotationalTerm = constant_handles.reader_make_constant_shell(makeString("CycLDenotationalTerm"));
  public static final SubLObject $const39$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym40$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym41$NPUT_BACK_CLAUSE_EL_VARIABLES = makeSymbol("NPUT-BACK-CLAUSE-EL-VARIABLES");
  public static final SubLSymbol $sym42$PUT_BACK_CLAUSE_EL_VARIABLES = makeSymbol("PUT-BACK-CLAUSE-EL-VARIABLES");
  public static final SubLSymbol $sym43$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym44$SECOND = makeSymbol("SECOND");
  public static final SubLObject $const45$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLString $str46$function = makeString("function");
  public static final SubLObject $const47$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLObject $const48$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
  public static final SubLSymbol $sym49$STRING_ = makeSymbol("STRING=");
  public static final SubLString $str50$ = makeString("");
  public static final SubLString $str51$__s = makeString("-~s");
  public static final SubLSymbol $sym52$_X = makeSymbol("?X");
  public static final SubLString $str53$Could_not_create_a_unique_HL_var_ = makeString("Could not create a unique HL var wrt ~a");
  public static final SubLSymbol $kw54$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym55$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLObject $const56$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLSymbol $sym57$EL_FORMULA_P = makeSymbol("EL-FORMULA-P");
  public static final SubLObject $const58$functionCommutesWith = constant_handles.reader_make_constant_shell(makeString("functionCommutesWith"));
  public static final SubLSymbol $sym59$FORT_OR_NAUT_WITH_CORRESPONDING_NART_ = makeSymbol("FORT-OR-NAUT-WITH-CORRESPONDING-NART?");
  public static final SubLSymbol $sym60$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym61$NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");
  public static final SubLSymbol $sym62$EQUALS_EL_MEMOIZED_ = makeSymbol("EQUALS-EL-MEMOIZED?");
  public static final SubLSymbol $kw63$CNF = makeKeyword("CNF");
  public static final SubLSymbol $kw64$DNF = makeKeyword("DNF");
  public static final SubLSymbol $sym65$CLAUSAL_FORM_P = makeSymbol("CLAUSAL-FORM-P");
  public static final SubLSymbol $sym66$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLString $str67$Unexpected_clausal_form__s = makeString("Unexpected clausal form ~s");
  public static final SubLSymbol $sym68$NON_NULL_CLOSED_TERM_ = makeSymbol("NON-NULL-CLOSED-TERM?");
  public static final SubLSymbol $sym69$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLString $str70$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym71$RECANONICALIZED_CANDIDATE_NAT_EQUALS_NAT_FORMULA_ = makeSymbol("RECANONICALIZED-CANDIDATE-NAT-EQUALS-NAT-FORMULA?");
  public static final SubLSymbol $sym72$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const73$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLSymbol $sym74$EVALUATABLE_EXPRESSION_ = makeSymbol("EVALUATABLE-EXPRESSION?");
  public static final SubLSymbol $sym75$TRANSFORM_EVALUATION_EXPRESSION = makeSymbol("TRANSFORM-EVALUATION-EXPRESSION");
  public static final SubLString $str76$_s__s_does_not_adequately_specify = makeString("~s ~s does not adequately specify a microtheory.");
  public static final SubLSymbol $sym77$HL_VAR_ = makeSymbol("HL-VAR?");
  public static final SubLObject $const78$EscapeQuote = constant_handles.reader_make_constant_shell(makeString("EscapeQuote"));
  public static final SubLSymbol $sym79$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");
  public static final SubLSymbol $sym80$ESCAPE_TERM = makeSymbol("ESCAPE-TERM");
  public static final SubLSymbol $sym81$DECONTEXTUALIZED_CLAUSE_ = makeSymbol("DECONTEXTUALIZED-CLAUSE?");
  public static final SubLSymbol $sym82$GENERALIZED_IST_CLAUSE_P = makeSymbol("GENERALIZED-IST-CLAUSE-P");
  public static final SubLList $list83 = list(constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ist-Asserted")));
  public static final SubLSymbol $sym84$OPAQUE_ARG_WRT_QUOTING_SEEKER = makeSymbol("OPAQUE-ARG-WRT-QUOTING-SEEKER");
  public static final SubLSymbol $kw85$OPAQUE_ARG_FOUND = makeKeyword("OPAQUE-ARG-FOUND");
  public static final SubLSymbol $sym86$CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");
  public static final SubLSymbol $sym87$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym88$KB_HL_SUPPORT_P = makeSymbol("KB-HL-SUPPORT-P");
  public static final SubLSymbol $sym89$HL_SUPPORT_P = makeSymbol("HL-SUPPORT-P");
  public static final SubLSymbol $sym90$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $sym91$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLObject $const92$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym93$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");
  public static final SubLSymbol $sym94$CDR = makeSymbol("CDR");
  public static final SubLSymbol $kw95$ASSERT = makeKeyword("ASSERT");
  public static final SubLString $str96$__Error__assert_failed__S___ = makeString("~%Error: assert failed ~S.~%");
  public static final SubLString $str97$__Error__Can_t_find_assertion___ = makeString("~%Error: Can't find assertion:~%");
  public static final SubLSymbol $kw98$UNASSERT = makeKeyword("UNASSERT");
  public static final SubLString $str99$__Form___A_in__A__ = makeString("~%Form: ~A in ~A~%");
  public static final SubLString $str100$__Error__assert_failed__ = makeString("~%Error: assert failed~%");
  public static final SubLString $str101$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A~%");
  public static final SubLString $str102$__The_assertion_is__S___ = makeString("~%The assertion is ~S.~%");
  public static final SubLString $str103$__Its_EL_form_is__S_in__S___ = makeString("~%Its EL form is ~S in ~S.~%");
  public static final SubLString $str104$__Error__Can_t_find_assertions___ = makeString("~%Error: Can't find assertions: ~A in ~A~%");
  public static final SubLString $str105$__Its_New_EL_form_is__S_in__S___ = makeString("~%Its New EL form is ~S in ~S.~%");
  public static final SubLString $str106$__Error__EL_mismatch___Original__ = makeString("~%Error: EL mismatch:~%Original: ~A ~%From assertion: ~A");
  public static final SubLString $str107$__Error__assert_failed___S__ = makeString("~%Error: assert failed: ~S~%");
  public static final SubLString $str108$__Error__unassert_failed___S__ = makeString("~%Error: unassert failed: ~S~%");
  public static final SubLObject $const109$False = constant_handles.reader_make_constant_shell(makeString("False"));

  //// Initializers

  public void declareFunctions() {
    declare_czer_utilities_file();
  }

  public void initializeVariables() {
    init_czer_utilities_file();
  }

  public void runTopLevelForms() {
    setup_czer_utilities_file();
  }

}
