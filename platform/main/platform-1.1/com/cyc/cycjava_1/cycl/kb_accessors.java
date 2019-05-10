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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.at_cache;
import com.cyc.cycjava_1.cycl.at_defns;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_trampolines;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.fi;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.hlmt_czer;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.kb_gp_mapping;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.kb_macros;
import com.cyc.cycjava_1.cycl.kb_mapping;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.narts_high;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.somewhere_cache;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.transitivity;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;

public  final class kb_accessors extends SubLTranslatedFile {

  //// Constructor

  private kb_accessors() {}
  public static final SubLFile me = new kb_accessors();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_accessors";

  //// Definitions

  /** Return T iff RELATION is a relationship. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 706) 
  public static final SubLObject relationP(SubLObject relation) {
    return fort_types_interface.relation_p(relation);
  }

  /** Return T iff PREDICATE is an irreflexive predicate. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 1487) 
  public static final SubLObject irreflexive_predicateP(SubLObject predicate) {
    return fort_types_interface.irreflexive_binary_predicate_p(predicate);
  }

  /** Return T iff PREDICATE is an asymmetric predicate. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 1850) 
  public static final SubLObject asymmetric_predicateP(SubLObject predicate) {
    return fort_types_interface.asymmetric_binary_predicate_p(predicate);
  }
  

  /** Return a list of the collections that include as instances 
the results of non-predicate function constant FUNCTOR. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 69912) 
  public static final SubLObject result_isa(SubLObject functor, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(functor))) {
      return kb_mapping_utilities.pred_values_in_relevant_mts(functor, $const193$resultIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    } else if ((NIL != czer_utilities.naut_with_corresponding_nartP(functor))) {
      return result_isa(narts_high.find_nart(functor), mt);
    } else if ((NIL != obsolete.reifiable_natP(functor, Symbols.symbol_function($sym79$CYC_VAR_), mt))) {
      return meta_result_isa(cycl_utilities.nat_functor(functor), mt);
    } else if ((NIL != function_to_arg_termP(functor))) {
      return argn_isa(cycl_utilities.nat_arg2(functor, UNPROVIDED), cycl_utilities.nat_arg1(functor, UNPROVIDED), mt);
    }
    return NIL;
  }


  @SubL(source = "cycl/kb-accessors.lisp", position = 61427) 
  public static final SubLObject function_to_arg_termP(SubLObject v_term) {
    return makeBoolean((v_term.isCons()
           && $const198$FunctionToArg.eql(cycl_utilities.nat_functor(v_term))));
  }

  

  /** META-FUNCTOR is the functor of a function-denoting function;
return the resultIsa collections inherited to instances of the 
resultIsa of META-FUNCTOR */
  @SubL(source = "cycl/kb-accessors.lisp", position = 75438) 
  public static final SubLObject meta_result_isa(SubLObject meta_functor, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != forts.fort_p(meta_functor))) {
        {
          SubLObject meta_result_isa = NIL;
          {
            SubLObject _prev_bind_0 = control_vars.$mapping_fn$.currentBinding(thread);
            SubLObject _prev_bind_1 = control_vars.$mapping_fn_arg$.currentBinding(thread);
            SubLObject _prev_bind_2 = control_vars.$mapping_fn_arg2$.currentBinding(thread);
            SubLObject _prev_bind_3 = control_vars.$mapping_fn_arg3$.currentBinding(thread);
            SubLObject _prev_bind_4 = control_vars.$mapping_fn_arg4$.currentBinding(thread);
            SubLObject _prev_bind_5 = control_vars.$mapping_fn_arg5$.currentBinding(thread);
            SubLObject _prev_bind_6 = control_vars.$mapping_fn_arg6$.currentBinding(thread);
            try {
              control_vars.$mapping_fn$.bind(Symbols.symbol_function($sym214$PRED_ARG_VALUES_IN_RELEVANT_MTS), thread);
              control_vars.$mapping_fn_arg$.bind(ONE_INTEGER, thread);
              control_vars.$mapping_fn_arg2$.bind($const200$relationAllInstance, thread);
              control_vars.$mapping_fn_arg3$.bind($const193$resultIsa, thread);
              control_vars.$mapping_fn_arg4$.bind(mt, thread);
              control_vars.$mapping_fn_arg5$.bind(TWO_INTEGER, thread);
              control_vars.$mapping_fn_arg6$.bind(ONE_INTEGER, thread);
              {
                SubLObject _prev_bind_0_16 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  {
                    SubLObject _prev_bind_0_17 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                      sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                      {
                        SubLObject _prev_bind_0_18 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                        try {
                          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
                          {
                            SubLObject cdolist_list_var = result_isa(meta_functor, mt);
                            SubLObject result_isa = NIL;
                            for (result_isa = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), result_isa = cdolist_list_var.first()) {
                              meta_result_isa = ConsesLow.nconc(meta_result_isa, genls.gather_all_genls(Symbols.symbol_function($sym201$MAPPING_FUNCALL_ARG), result_isa, mt, UNPROVIDED, UNPROVIDED));
                            }
                          }
                        } finally {
                          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_18, thread);
                        }
                      }
                      sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    } finally {
                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_17, thread);
                    }
                  }
                  sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                } finally {
                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_16, thread);
                }
              }
              meta_result_isa = genls.min_cols(list_utilities.remove_duplicate_forts(meta_result_isa), UNPROVIDED, UNPROVIDED);
            } finally {
              control_vars.$mapping_fn_arg6$.rebind(_prev_bind_6, thread);
              control_vars.$mapping_fn_arg5$.rebind(_prev_bind_5, thread);
              control_vars.$mapping_fn_arg4$.rebind(_prev_bind_4, thread);
              control_vars.$mapping_fn_arg3$.rebind(_prev_bind_3, thread);
              control_vars.$mapping_fn_arg2$.rebind(_prev_bind_2, thread);
              control_vars.$mapping_fn_arg$.rebind(_prev_bind_1, thread);
              control_vars.$mapping_fn$.rebind(_prev_bind_0, thread);
            }
          }
          return meta_result_isa;
        }
      } else if ((NIL != czer_utilities.naut_with_corresponding_nartP(meta_functor))) {
        return meta_result_isa(narts_high.find_nart(meta_functor), mt);
      }
      return NIL;
    }
  }

  
  /** Return T iff PREDICATE is an anti-symmetric predicate. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 2032) 
  public static final SubLObject anti_symmetric_predicateP(SubLObject predicate) {
    return fort_types_interface.anti_symmetric_binary_predicate_p(predicate);
  }

  /** Return T iff PREDICATE is a transitive predicate. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 2226) 
  public static final SubLObject transitive_predicateP(SubLObject predicate) {
    return fort_types_interface.transitive_binary_predicate_p(predicate);
  }

  /** Return T iff PREDICATE is an anti-transitive predicate. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 2407) 
  public static final SubLObject anti_transitive_predicateP(SubLObject predicate) {
    return fort_types_interface.anti_transitive_binary_predicate_p(predicate);
  }

  /** Return T iff PREDICATE is a predicate of arity 2. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 3766) 
  public static final SubLObject binary_predicateP(SubLObject predicate) {
    return makeBoolean(((NIL != fort_types_interface.predicate_p(predicate))
           && arity.arity(predicate).eql(TWO_INTEGER)));
  }


  @SubL(source = "cycl/kb-accessors.lisp", position = 55888) 
  public static final SubLObject admitting_defnsP(SubLObject col, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != sufficient_defnsP(col, mt))
          || (NIL != defining_defnsP(col, mt))));
  }


  @SubL(source = "cycl/kb-accessors.lisp", position = 56104) 
  public static final SubLObject sufficient_defnsP(SubLObject col, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(col, $const179$defnSufficient, mt, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 56217) 
  public static final SubLObject necessary_defnsP(SubLObject col, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(col, $const180$defnNecessary, mt, UNPROVIDED, UNPROVIDED);
  }


  @SubL(source = "cycl/kb-accessors.lisp", position = 56000) 
  public static final SubLObject defining_defnsP(SubLObject col, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(col, $const178$defnIff, mt, UNPROVIDED, UNPROVIDED);
  }

  
  /** Return T iff TERM is an instance of #$Cyclist somewhere. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 4126) 
  public static final SubLObject cyclistP(SubLObject v_term) {
    return isa.isa_in_any_mtP(v_term, $const25$Cyclist);
  }

  /** Return T iff PREDICATE is decontextualized, i.e. it can be thought of as 
   having its complete extent in all mts. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 6973) 
  public static final SubLObject decontextualized_predicateP(SubLObject predicate) {
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const38$decontextualizedPredicate, mt_vars.$decontextualized_predicate_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 7393) 
  public static final SubLObject predicate_convention_mt(SubLObject predicate) {
    {
      SubLObject kb_value = kb_mapping_utilities.fpred_value_in_any_mt(predicate, $const39$predicateConventionMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return ((NIL != kb_value) ? ((SubLObject) kb_value) : mt_vars.$default_convention_mt$.getGlobalValue());
    }
  }

  /** Return T iff COLLECTION is decontextualized, i.e. it can be thought of as 
   having its complete collection extent in all mts. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 7581) 
  public static final SubLObject decontextualized_collectionP(SubLObject collection) {
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $const40$decontextualizedCollection, mt_vars.$decontextualized_collection_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 7887) 
  public static final SubLObject collection_convention_mt(SubLObject collection) {
    {
      SubLObject kb_value = kb_mapping_utilities.fpred_value_in_any_mt(collection, $const41$collectionConventionMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return ((NIL != kb_value) ? ((SubLObject) kb_value) : mt_vars.$default_convention_mt$.getGlobalValue());
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 8078) 
  public static final SubLObject decontextualized_literalP(SubLObject literal) {
    if ((NIL != el_utilities.el_formula_p(literal))) {
      {
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        return makeBoolean(((NIL != forts.fort_p(predicate))
               && ((NIL != decontextualized_predicateP(predicate))
                || (NIL != decontextualized_collection_literalP(literal)))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 8359) 
  public static final SubLObject decontextualized_literal_convention_mt(SubLObject literal) {
    if ((NIL != decontextualized_collection_literalP(literal))) {
      return collection_convention_mt(cycl_utilities.sentence_arg2(el_utilities.literal_atomic_sentence(literal), UNPROVIDED));
    } else {
      return predicate_convention_mt(el_utilities.literal_predicate(literal, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 8637) 
  public static final SubLObject decontextualized_collection_literalP(SubLObject literal) {
    if ((NIL != el_utilities.el_binary_formula_p(literal))) {
      {
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        SubLObject arg2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        return makeBoolean((($const42$isa.eql(predicate)
                || $const43$genls.eql(predicate))
               && (NIL != forts.fort_p(arg2))
               && (NIL != decontextualized_collectionP(arg2))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 9108) 
  public static final SubLObject decontextualized_atomic_cnfP(SubLObject cnf) {
    if ((NIL != clauses.atomic_clause_p(cnf))) {
      {
        SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        return decontextualized_literalP(asent);
      }
    }
    return NIL;
  }

  /** Temporary control variable;  When non-nil, we don't decontextualize
   to a lower microtheory from a strictly higher one. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 9294) 
  private static SubLSymbol $decontextualized_weakening_prohibitedP$ = null;

  @SubL(source = "cycl/kb-accessors.lisp", position = 9487) 
  public static final SubLObject decontextualized_weakening_prohibitedP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $decontextualized_weakening_prohibitedP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 9598) 
  public static final SubLObject mt_matches_convention_mtP(SubLObject given_mt, SubLObject convention_mt) {
    return makeBoolean(((given_mt == convention_mt)
          || (NIL != hlmt.hlmt_equalP(given_mt, convention_mt))
          || ((NIL != decontextualized_weakening_prohibitedP())
             && (NIL != genl_mts.proper_genl_mtP(convention_mt, given_mt, UNPROVIDED, UNPROVIDED)))));
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 9926) 
  public static final SubLObject possibly_convention_mt_for_decontextualized_cnf(SubLObject mt, SubLObject cnf) {
    if ((NIL != decontextualized_atomic_cnfP(cnf))) {
      {
        SubLObject asent = clause_utilities.atomic_cnf_asent(cnf);
        SubLObject convention_mt = decontextualized_literal_convention_mt(asent);
        if ((NIL != convention_mt)) {
          if ((NIL == mt_matches_convention_mtP(mt, convention_mt))) {
            return convention_mt;
          }
        }
      }
    }
    return mt;
  }

  /** @return boolean; t iff arg number ARGNUM of RELATION is quoted via #$quotedArgument. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 11467) 
  public static final SubLObject quoted_argumentP(SubLObject relation, SubLObject argnum) {
    return makeBoolean(((NIL != forts.fort_p(relation))
           && argnum.isNumber()
           && argnum.numG(ZERO_INTEGER)
           && (NIL != kb_mapping_utilities.pred_u_v_holds_in_any_mt($const45$quotedArgument, relation, argnum, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
  }

  /** @return nil or gaf-assertion?; if PREDICATE's extent has been completely asserted,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 12932) 
  public static final SubLObject complete_extent_asserted_gaf(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    return ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const50$completeExtentAsserted, predicate, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) kb_mapping_utilities.fpred_value_gaf_in_relevant_mts(predicate, $const50$completeExtentAsserted, mt, UNPROVIDED, UNPROVIDED)) : NIL);
  }

  /** @return nil or gaf-assertion?; if PREDICATE's curried extent is completely asserted 
once VALUE is its ARGNUMth argument, returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 13621) 
  public static final SubLObject complete_extent_asserted_for_value_in_arg_gaf(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    checkType(argnum, $sym51$NON_NEGATIVE_INTEGER_P);
    if ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const52$completeExtentAssertedForValueInA, predicate, ONE_INTEGER, UNPROVIDED))) {
      {
        SubLObject asent = el_utilities.make_ternary_formula($const52$completeExtentAssertedForValueInA, predicate, value, argnum);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12717");
      }
    } else {
      return NIL;
    }
  }

  /** @return nil or gaf-assertion?; if PREDICATE's extent can be completely enumerated,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 14455) 
  public static final SubLObject complete_extent_enumerable_gaf(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    return ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const53$completeExtentEnumerable, predicate, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) kb_mapping_utilities.fpred_value_gaf_in_relevant_mts(predicate, $const53$completeExtentEnumerable, mt, UNPROVIDED, UNPROVIDED)) : NIL);
  }

  /** @return nil or gaf-assertion?; if PREDICATE's extent can be completely decided,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 15445) 
  public static final SubLObject complete_extent_decidable_gaf(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    return ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const55$completeExtentDecidable, predicate, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) kb_mapping_utilities.fpred_value_gaf_in_relevant_mts(predicate, $const55$completeExtentDecidable, mt, UNPROVIDED, UNPROVIDED)) : NIL);
  }

  /** @return nil or gaf-assertion?; if PREDICATE's curried extent is enumerable once its ARGNUMth argument is fixed,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 16098) 
  public static final SubLObject complete_extent_enumerable_for_arg_gaf(SubLObject predicate, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    checkType(argnum, $sym51$NON_NEGATIVE_INTEGER_P);
    return ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const56$completeExtentEnumerableForArg, predicate, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30008")) : NIL);
  }

  /** @return nil or gaf-assertion?; if PREDICATE's curried extent is enumerable once VALUE is its ARGNUMth argument,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 16903) 
  public static final SubLObject complete_extent_enumerable_for_value_in_arg_gaf(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    checkType(argnum, $sym51$NON_NEGATIVE_INTEGER_P);
    if ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const57$completeExtentEnumerableForValueI, predicate, ONE_INTEGER, UNPROVIDED))) {
      {
        SubLObject asent = el_utilities.make_ternary_formula($const57$completeExtentEnumerableForValueI, predicate, value, argnum);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12718");
      }
    } else {
      return NIL;
    }
  }

  /** @return nil or gaf-assertion?; if PREDICATE's curried extent is decidable once VALUE is its ARGNUMth argument,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 17819) 
  public static final SubLObject complete_extent_decidable_for_value_in_arg_gaf(SubLObject predicate, SubLObject value, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(predicate, $sym49$FORT_P);
    checkType(argnum, $sym51$NON_NEGATIVE_INTEGER_P);
    if ((NIL != somewhere_cache.some_pred_assertion_somewhereP($const58$completeExtentDecidableForValueIn, predicate, ONE_INTEGER, UNPROVIDED))) {
      {
        SubLObject asent = el_utilities.make_ternary_formula($const58$completeExtentDecidableForValueIn, predicate, value, argnum);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12719");
      }
    } else {
      return NIL;
    }
  }

  /** @return boolean; whether COLLECTION is completely enumerable in MT. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 18445) 
  public static final SubLObject completely_enumerable_collectionP(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean(completely_enumerable_collection_gaf(collection, mt));
  }

  /** @return nil or gaf-assertion?; if COLLECTION is completely enumerable in MT,
returns an assertion justifying this claim. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 18665) 
  public static final SubLObject completely_enumerable_collection_gaf(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(collection))) {
      return kb_mapping_utilities.fpred_value_gaf_in_relevant_mts(collection, $const59$completelyEnumerableCollection, mt, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 19928) 
  public static final SubLObject backchain_requiredP(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const62$backchainRequired, mt, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 20390) 
  public static final SubLObject backchain_forbiddenP(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const65$backchainForbidden, mt, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 20529) 
  public static final SubLObject collection_isa_backchain_requiredP(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $const66$collectionIsaBackchainRequired, mt, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 20696) 
  public static final SubLObject collection_genls_backchain_requiredP(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $const67$collectionGenlsBackchainRequired, mt, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 20867) 
  public static final SubLObject collection_backchain_requiredP(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $const68$collectionBackchainRequired, mt, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 22746) 
  public static final SubLObject skolemize_forward_somewhereP(SubLObject function) {
    return makeBoolean(((NIL != forts.fort_p(function))
           && (NIL != somewhere_cache.some_pred_assertion_somewhereP($const76$skolemizeForward, function, ONE_INTEGER, UNPROVIDED))));
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 22928) 
  public static final SubLObject skolemize_forwardP(SubLObject function, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return makeBoolean(((NIL != forts.fort_p(function))
           && (NIL != skolemize_forward_somewhereP(function))
           && (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(function, $const76$skolemizeForward, mt, UNPROVIDED, UNPROVIDED))));
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 23398) 
  public static final SubLObject forward_reification_ruleP(SubLObject function, SubLObject rule, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if (((NIL != forts.fort_p(function))
             && (NIL != assertions_high.rule_assertionP(rule)))) {
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = kb_mapping_utilities.pred_u_v_holds($const77$forwardReificationRule, function, rule, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }

  /** Returns the smallest integer in an #$argAndRestIsa gaf constraining RELN if one exists, otherwise returns NIL. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 25116) 
  public static final SubLObject arg_and_rest_isa_min_argnum(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject result = NIL;
      if ((NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP(relation))) {
        {
          SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(relation, $const81$argAndRestIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          SubLObject argnum = NIL;
          for (argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argnum = cdolist_list_var.first()) {
            if ((!(argnum.isInteger()))) {
            } else if ((NIL == result)) {
              result = argnum;
            } else if (argnum.numL(result)) {
              result = argnum;
            }
          }
        }
      }
      return result;
    }
  }

  /** @return boolean; t iff ARGNUM of RELN is constrained via #$argAndRestIsa */
  @SubL(source = "cycl/kb-accessors.lisp", position = 25623) 
  public static final SubLObject arg_and_rest_isa_applicableP(SubLObject reln, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject min_argnum = arg_and_rest_isa_min_argnum(reln, mt);
      return makeBoolean((min_argnum.isInteger()
             && argnum.numGE(min_argnum)));
    }
  }

  /** Returns the smallest integer in an #$argAndRestQuotedIsa gaf constraining RELN if one exists, otherwise returns NIL. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 25906) 
  public static final SubLObject arg_and_rest_quoted_isa_min_argnum(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(relation, $const82$argAndRestQuotedIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject argnum = NIL;
      for (argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argnum = cdolist_list_var.first()) {
        if ((!(argnum.isInteger()))) {
        } else if ((NIL == result)) {
          result = argnum;
        } else if (argnum.numL(result)) {
          result = argnum;
        }
      }
      return result;
    }
  }

  /** @return boolean; t iff ARGNUM of RELN is constrained via #$argAndRestIsa */
  @SubL(source = "cycl/kb-accessors.lisp", position = 26372) 
  public static final SubLObject arg_and_rest_quoted_isa_applicableP(SubLObject reln, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject min_argnum = arg_and_rest_quoted_isa_min_argnum(reln, mt);
      return makeBoolean((min_argnum.isInteger()
             && argnum.numGE(min_argnum)));
    }
  }

  /** Returns a list of the local isa constraints applied to the ARGNUMth argument of 
RELATION (#$argsIsa conjoins with #$arg1Isa et al). */
  @SubL(source = "cycl/kb-accessors.lisp", position = 26661) 
  public static final SubLObject argn_isa(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(argnum, $sym83$INTEGERP);
    return argn_isa_int(relation, argnum, mt);
  }

  /** Returns a list of the local isa constraints applied to the ARGNUMth argument of 
RELATION (#$argsIsa conjoins with #$arg1Isa et al). */
  @SubL(source = "cycl/kb-accessors.lisp", position = 26979) 
  public static final SubLObject argn_quoted_isa(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(argnum, $sym83$INTEGERP);
    if ((NIL != czer_trampolines.within_czer_memoization_stateP())) {
      return conses_high.copy_list(czer_trampolines.czer_argn_quoted_isa_int(relation, argnum, mt_relevance_macros.mt_info(mt)));
    } else {
      return argn_quoted_isa_int(relation, argnum, mt);
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 27642) 
  public static final SubLObject argn_isa_int(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((NIL != forts.fort_p(relation))) {
      return argn_isa_int_2(relation, argnum, mt);
    } else if ((NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function($sym79$CYC_VAR_), mt))) {
      return argn_isa(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10348"), argnum, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 27934) 
  public static final SubLObject argn_isa_int_2(SubLObject relation, SubLObject argnum, SubLObject mt) {
    {
      SubLObject result = NIL;
      if ((NIL != at_cache.some_args_isa_assertion_somewhereP(relation))) {
        result = ConsesLow.nconc(result, kb_mapping_utilities.pred_values_in_relevant_mts(relation, $const78$argsIsa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
      }
      if ((NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP(relation))) {
        result = ConsesLow.nconc(result, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6808"));
      }
      if ((NIL != subl_promotions.positive_integer_p(argnum))) {
        {
          SubLObject arg_isa_pred = arg_isa_pred_int(argnum);
          if ((NIL != arg_isa_pred)) {
            if ((NIL != at_cache.at_cache_use_possibleP(arg_isa_pred, argnum))) {
              result = ConsesLow.nconc(result, at_cache.cached_arg_isas_in_mt(relation, argnum, mt));
            } else {
              result = ConsesLow.nconc(result, kb_mapping_utilities.pred_values_in_relevant_mts(relation, arg_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
          }
        }
      }
      return list_utilities.delete_duplicate_forts(result);
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 28736) 
  public static final SubLObject argn_quoted_isa_int(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((NIL != forts.fort_p(relation))) {
      if ((NIL != el_utilities.cyc_const_logical_operator_p(relation))) {
        return list($const89$CycLSentence_Assertible);
      } else if (((NIL != el_utilities.cyc_const_quantifier_p(relation))
           && argnum.numE(el_utilities.quantified_sub_sentence_argnum_for_operator(relation)))) {
        return list($const89$CycLSentence_Assertible);
      } else if (((NIL != el_utilities.cyc_const_quantifier_p(relation))
           && argnum.numE(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30632")))) {
        return list($const90$CycLVariable);
      } else {
        {
          SubLObject result = NIL;
          SubLObject cdolist_list_var = arg_quoted_isa_preds(argnum, relation, mt);
          SubLObject arg_quoted_isa_pred = NIL;
          for (arg_quoted_isa_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg_quoted_isa_pred = cdolist_list_var.first()) {
            if ((NIL != subl_promotions.memberP(arg_quoted_isa_pred, czer_vars.$arg_quoted_isa_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
              result = ConsesLow.nconc(result, kb_mapping_utilities.pred_values_in_relevant_mts(relation, arg_quoted_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else if ((NIL != subl_promotions.memberP(arg_quoted_isa_pred, czer_vars.$arg_quoted_isa_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
              result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6814"));
            } else if ((NIL != isa.isaP(arg_quoted_isa_pred, $const91$ArgQuotedIsaBinaryPredicate, UNPROVIDED, UNPROVIDED))) {
              result = ConsesLow.nconc(result, kb_mapping_utilities.pred_values_in_relevant_mts(relation, arg_quoted_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else if ((NIL != isa.isaP(arg_quoted_isa_pred, $const92$ArgQuotedIsaTernaryPredicate, UNPROVIDED, UNPROVIDED))) {
              result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6815"));
            } else {
              el_utilities.el_error(THREE_INTEGER, $str93$illegal_arg_quoted_isa_pred_encou, arg_quoted_isa_pred, UNPROVIDED, UNPROVIDED);
            }
          }
          return list_utilities.remove_duplicate_forts(result);
        }
      }
    } else if ((NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function($sym79$CYC_VAR_), mt))) {
      return argn_quoted_isa(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10349"), argnum, mt);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 31879) 
  public static final SubLObject arg_isa_pred_int(SubLObject index) {
    {
      SubLObject pcase_var = index;
      if (pcase_var.eql(ONE_INTEGER)) {
        return $const95$arg1Isa;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return $const96$arg2Isa;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        return $const97$arg3Isa;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        return $const98$arg4Isa;
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        return $const99$arg5Isa;
      } else if (pcase_var.eql(SIX_INTEGER)) {
        return $const100$arg6Isa;
      } else if (pcase_var.eql(ZERO_INTEGER)) {
        return $const78$argsIsa;
      } else {
        el_utilities.el_error(THREE_INTEGER, $str101$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Returns the appropriate predicate for constraining the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 32192) 
  public static final SubLObject arg_isa_pred(SubLObject index, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != reln)) {
      {
        SubLObject argnum = arg_and_rest_isa_min_argnum(reln, mt);
        return (argnum.isInteger() ? ((SubLObject) (index.numGE(argnum) ? ((SubLObject) $const81$argAndRestIsa) : arg_isa_pred_int(index))) : ((NIL != arity.variable_arityP(reln)) ? ((SubLObject) $const78$argsIsa) : arg_isa_pred_int(index)));
      }
    } else if ((NIL != el_utilities.valid_argnum_p(index))) {
      return arg_isa_pred_int(index);
    } else {
      el_utilities.el_error(THREE_INTEGER, $str101$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Returns the appropriate predicates for constraining the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 32859) 
  public static final SubLObject arg_isa_preds(SubLObject argnum, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != el_utilities.valid_argnum_p(argnum))) {
      {
        SubLObject result = NIL;
        SubLObject var = arg_isa_pred_int(argnum);
        if ((NIL != var)) {
          result = cons(var, result);
        }
        {
          SubLObject item_var = $const78$argsIsa;
          if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            result = cons(item_var, result);
          }
        }
        if (((NIL != forts.fort_p(reln))
             && (NIL != arg_and_rest_isa_applicableP(reln, argnum, mt)))) {
          result = cons($const81$argAndRestIsa, result);
        }
        return Sequences.nreverse(result);
      }
    } else {
      el_utilities.el_error(THREE_INTEGER, $str102$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 33398) 
  public static final SubLObject arg_quoted_isa_pred_int(SubLObject index) {
    {
      SubLObject pcase_var = index;
      if (pcase_var.eql(ONE_INTEGER)) {
        return $const103$arg1QuotedIsa;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return $const104$arg2QuotedIsa;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        return $const105$arg3QuotedIsa;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        return $const106$arg4QuotedIsa;
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        return $const107$arg5QuotedIsa;
      } else if (pcase_var.eql(SIX_INTEGER)) {
        return $const108$arg6QuotedIsa;
      } else {
        el_utilities.el_error(THREE_INTEGER, $str109$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Returns the appropriate predicate for constraining the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 33770) 
  public static final SubLObject arg_quoted_isa_pred(SubLObject index, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != reln)) {
      {
        SubLObject argnum = arg_and_rest_quoted_isa_min_argnum(reln, mt);
        return (argnum.isInteger() ? ((SubLObject) (index.numGE(argnum) ? ((SubLObject) $const82$argAndRestQuotedIsa) : arg_quoted_isa_pred_int(index))) : ((NIL != arity.variable_arityP(reln)) ? ((SubLObject) $const80$argsQuotedIsa) : arg_quoted_isa_pred_int(index)));
      }
    } else if ((NIL != el_utilities.valid_argnum_p(index))) {
      return arg_quoted_isa_pred_int(index);
    } else {
      el_utilities.el_error(THREE_INTEGER, $str109$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Returns the appropriate predicates for constraining the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 34511) 
  public static final SubLObject arg_quoted_isa_preds(SubLObject argnum, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != el_utilities.valid_argnum_p(argnum))) {
      {
        SubLObject result = NIL;
        SubLObject var = arg_quoted_isa_pred_int(argnum);
        if ((NIL != var)) {
          result = cons(var, result);
        }
        {
          SubLObject item_var = $const80$argsQuotedIsa;
          if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            result = cons(item_var, result);
          }
        }
        if (((NIL != forts.fort_p(reln))
             && (NIL != arg_and_rest_quoted_isa_applicableP(reln, argnum, mt)))) {
          result = cons($const82$argAndRestQuotedIsa, result);
        }
        return Sequences.nreverse(result);
      }
    } else {
      el_utilities.el_error(THREE_INTEGER, $str110$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Returns the appropriate predicate for constraining the inverse of the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 35115) 
  public static final SubLObject arg_isa_inverse(SubLObject index, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pcase_var = index;
      if (pcase_var.eql(ONE_INTEGER)) {
        return arg_isa_pred(TWO_INTEGER, reln, mt);
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return arg_isa_pred(ONE_INTEGER, reln, mt);
      }
    }
    return NIL;
  }

  /** Returns the appropriate predicate for constraining the inverse of the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 35399) 
  public static final SubLObject arg_quoted_isa_inverse(SubLObject index, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pcase_var = index;
      if (pcase_var.eql(ONE_INTEGER)) {
        return arg_quoted_isa_pred(TWO_INTEGER, reln, mt);
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return arg_quoted_isa_pred(ONE_INTEGER, reln, mt);
      }
    }
    return NIL;
  }

  /** @return integer; the inverse argnum of ARGNUM */
  @SubL(source = "cycl/kb-accessors.lisp", position = 35710) 
  public static final SubLObject inverse_argnum(SubLObject argnum) {
    {
      SubLObject pcase_var = argnum;
      if (pcase_var.eql(ONE_INTEGER)) {
        return TWO_INTEGER;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return ONE_INTEGER;
      } else {
        return Errors.error($str111$invalid_argument_to_inverse_argnu, argnum);
      }
    }
  }

  /** return the arg constrained by ISA-PRED (e.g., (isa-pred-arg #$arg1Isa) -> 1));
by convention (isa-pred-arg #$argsIsa) -> 0 */
  @SubL(source = "cycl/kb-accessors.lisp", position = 35921) 
  public static final SubLObject isa_pred_arg(SubLObject isa_pred) {
    {
      SubLObject pcase_var = isa_pred;
      if (pcase_var.eql($const95$arg1Isa)) {
        return ONE_INTEGER;
      } else if (pcase_var.eql($const96$arg2Isa)) {
        return TWO_INTEGER;
      } else if (pcase_var.eql($const97$arg3Isa)) {
        return THREE_INTEGER;
      } else if (pcase_var.eql($const98$arg4Isa)) {
        return FOUR_INTEGER;
      } else if (pcase_var.eql($const99$arg5Isa)) {
        return FIVE_INTEGER;
      } else if (pcase_var.eql($const100$arg6Isa)) {
        return SIX_INTEGER;
      } else if (pcase_var.eql($const78$argsIsa)) {
        return ZERO_INTEGER;
      } else {
        return NIL;
      }
    }
  }

  /** Returns the local genl constraints applied to the ARGNUMth argument of RELATION. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 44998) 
  public static final SubLObject argn_genl(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(argnum, $sym83$INTEGERP);
    if ((NIL != forts.fort_p(relation))) {
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = arg_genl_preds(argnum, relation, mt);
        SubLObject arg_genl_pred = NIL;
        for (arg_genl_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), arg_genl_pred = cdolist_list_var.first()) {
          if ((NIL != subl_promotions.memberP(arg_genl_pred, czer_vars.$arg_genl_binary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            result = ConsesLow.nconc(result, kb_mapping_utilities.pred_values_in_relevant_mts(relation, arg_genl_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          } else if ((NIL != subl_promotions.memberP(arg_genl_pred, czer_vars.$arg_genl_ternary_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6803"));
          } else if ((NIL != isa.isaP(arg_genl_pred, $const129$ArgGenlBinaryPredicate, UNPROVIDED, UNPROVIDED))) {
            result = ConsesLow.nconc(result, kb_mapping_utilities.pred_values_in_relevant_mts(relation, arg_genl_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED));
          } else if ((NIL != isa.isaP(arg_genl_pred, $const130$ArgGenlTernaryPredicate, UNPROVIDED, UNPROVIDED))) {
            result = ConsesLow.nconc(result, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6804"));
          } else {
            el_utilities.el_error(THREE_INTEGER, $str131$illegal_arg_genl_pred_encountered, arg_genl_pred, UNPROVIDED, UNPROVIDED);
          }
        }
        return list_utilities.remove_duplicate_forts(result);
      }
    } else if ((NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function($sym79$CYC_VAR_), mt))) {
      return argn_genl(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10350"), argnum, mt);
    }
    return NIL;
  }

  /** Returns the smallest integer in an #$argAndRestGenl gaf constraining RELN if one exists, otherwise returns NIL. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 47073) 
  public static final SubLObject arg_and_rest_genl_min_argnum(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_relevant_mts(relation, $const134$argAndRestGenl, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      SubLObject argnum = NIL;
      for (argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argnum = cdolist_list_var.first()) {
        if ((!(argnum.isInteger()))) {
        } else if ((NIL == result)) {
          result = argnum;
        } else if (argnum.numL(result)) {
          result = argnum;
        }
      }
      return result;
    }
  }

  /** @return boolean; t iff ARGNUM of RELN is constrained via #$argAndRestGenl */
  @SubL(source = "cycl/kb-accessors.lisp", position = 47523) 
  public static final SubLObject arg_and_rest_genl_applicableP(SubLObject reln, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject min_argnum = arg_and_rest_genl_min_argnum(reln, mt);
      return makeBoolean((min_argnum.isInteger()
             && argnum.numGE(min_argnum)));
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 47801) 
  public static final SubLObject arg_genl_pred_int(SubLObject index) {
    {
      SubLObject pcase_var = index;
      if (pcase_var.eql(ONE_INTEGER)) {
        return $const112$arg1Genl;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return $const113$arg2Genl;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        return $const114$arg3Genl;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        return $const115$arg4Genl;
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        return $const116$arg5Genl;
      } else if (pcase_var.eql(SIX_INTEGER)) {
        return $const117$arg6Genl;
      } else if (pcase_var.eql(ZERO_INTEGER)) {
        return $const118$argsGenl;
      } else {
        el_utilities.el_error(THREE_INTEGER, $str135$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Returns the appropriate predicate for constraining the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 48123) 
  public static final SubLObject arg_genl_pred(SubLObject index, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != reln)) {
      {
        SubLObject argnum = arg_and_rest_genl_min_argnum(reln, mt);
        return (argnum.isInteger() ? ((SubLObject) (index.numGE(argnum) ? ((SubLObject) $const134$argAndRestGenl) : arg_genl_pred_int(index))) : ((NIL != arity.variable_arityP(reln)) ? ((SubLObject) $const118$argsGenl) : arg_genl_pred_int(index)));
      }
    } else if ((NIL != el_utilities.valid_argnum_p(index))) {
      return arg_genl_pred_int(index);
    } else {
      el_utilities.el_error(THREE_INTEGER, $str135$illegal_index_specification_for_a, index, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Returns the appropriate predicates for constraining the ARGNUMth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 48877) 
  public static final SubLObject arg_genl_preds(SubLObject argnum, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != el_utilities.valid_argnum_p(argnum))) {
      {
        SubLObject result = NIL;
        SubLObject var = arg_genl_pred_int(argnum);
        if ((NIL != var)) {
          result = cons(var, result);
        }
        {
          SubLObject item_var = $const118$argsGenl;
          if ((NIL == conses_high.member(item_var, result, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            result = cons(item_var, result);
          }
        }
        if (((NIL != forts.fort_p(reln))
             && (NIL != arg_and_rest_genl_applicableP(reln, argnum, mt)))) {
          result = cons($const134$argAndRestGenl, result);
        }
        return Sequences.nreverse(result);
      }
    } else {
      el_utilities.el_error(THREE_INTEGER, $str136$illegal_argnum_specification_for_, argnum, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Returns the appropriate predicate for constraining the inverse of the INDEXth argument of RELN. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 49466) 
  public static final SubLObject arg_genl_inverse(SubLObject index, SubLObject reln, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pcase_var = index;
      if (pcase_var.eql(ONE_INTEGER)) {
        return arg_genl_pred(TWO_INTEGER, reln, mt);
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return arg_genl_pred(ONE_INTEGER, reln, mt);
      }
    }
    return NIL;
  }

  /** Returns the appropriate arg-format predicate for constraining the inverse of N. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 96687) 
  public static final SubLObject argn_format_inverse(SubLObject n) {
    {
      SubLObject pcase_var = n;
      if (pcase_var.eql(ONE_INTEGER)) {
        return argn_format_pred(TWO_INTEGER);
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return argn_format_pred(ONE_INTEGER);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 96887) 
  public static final SubLObject argn_format_pred(SubLObject n) {
    {
      SubLObject pcase_var = n;
      if (pcase_var.eql(ONE_INTEGER)) {
        return $const221$arg1Format;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return $const222$arg2Format;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        return $const223$arg3Format;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        return $const224$arg4Format;
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        return $const225$arg5Format;
      } else if (pcase_var.eql(SIX_INTEGER)) {
        return $const226$arg6Format;
      } else {
        el_utilities.el_error(THREE_INTEGER, $str227$illegal_arg_specification_for_arg, n, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 101215) 
  public static final SubLObject inter_arg_format_pred(SubLObject ind_arg, SubLObject dep_arg) {
    {
      SubLObject ind_candidates = inter_arg_format_preds_ind(ind_arg);
      SubLObject dep_candidates = inter_arg_format_preds_dep(dep_arg);
      SubLObject pred = NIL;
      if ((NIL == pred)) {
        {
          SubLObject csome_list_var = ind_candidates;
          SubLObject candidate = NIL;
          for (candidate = csome_list_var.first(); (!(((NIL != pred)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), candidate = csome_list_var.first()) {
            if ((NIL != subl_promotions.memberP(candidate, dep_candidates, UNPROVIDED, UNPROVIDED))) {
              pred = candidate;
            }
          }
        }
      }
      return pred;
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 102580) 
  public static final SubLObject inter_arg_format_preds_dep(SubLObject arg) {
    {
      SubLObject pcase_var = arg;
      if (pcase_var.eql(ONE_INTEGER)) {
        return $list233;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return $list234;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        return $list235;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        return $list236;
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        return $list237;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 103122) 
  public static final SubLObject inter_arg_format_preds_ind(SubLObject arg) {
    {
      SubLObject pcase_var = arg;
      if (pcase_var.eql(ONE_INTEGER)) {
        return $list238;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return $list239;
      } else if (pcase_var.eql(THREE_INTEGER)) {
        return $list240;
      } else if (pcase_var.eql(FOUR_INTEGER)) {
        return $list241;
      } else if (pcase_var.eql(FIVE_INTEGER)) {
        return $list242;
      }
    }
    return NIL;
  }

  /** which arg is the #$fanOutArg for hierarchically transitive PRED. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 107530) 
  public static final SubLObject fan_out_arg(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject arg = asserted_fan_out_arg(pred, mt);
      if ((NIL != arg)) {
        return arg;
      } else {
        return ONE_INTEGER;
      }
    }
  }

  /** @return POSITIVE-INTEGER-P or NIL: which arg is asserted to be
the #$fanOutArg for hierarchically transitive PRED. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 107725) 
  public static final SubLObject asserted_fan_out_arg(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return kb_mapping_utilities.fpred_value_in_relevant_mts(pred, $const256$fanOutArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 113260) 
  public static final SubLObject assertion_still_thereP(SubLObject assertion, SubLObject truth) {
    {
      SubLObject ans = NIL;
      if ((NIL == ans)) {
        {
          SubLObject csome_list_var = assertions_high.assertion_arguments(assertion);
          SubLObject argument = NIL;
          for (argument = csome_list_var.first(); (!(((NIL != ans)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {
            ans = Equality.eq(truth, arguments.argument_truth(argument));
          }
        }
      }
      return ans;
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 117184) 
  public static final SubLObject scoping_args(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (((NIL != forts.fort_p(relation))
         && (NIL != some_scoping_arg_somewhereP(relation)))) {
      return kb_mapping_utilities.pred_values_in_relevant_mts(relation, $const297$scopingArg, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 117571) 
  public static final SubLObject some_scoping_arg_somewhereP(SubLObject relation) {
    return somewhere_cache.some_pred_assertion_somewhereP($const297$scopingArg, relation, ONE_INTEGER, UNPROVIDED);
  }

  /** Return a list of all the assertions indexed via the indexed term TERM. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 117692) 
  public static final SubLObject all_term_assertions(SubLObject v_term, SubLObject remove_duplicatesP) {
    if ((remove_duplicatesP == UNPROVIDED)) {
      remove_duplicatesP = NIL;
    }
    checkType(v_term, $sym119$INDEXED_TERM_P);
    return term_assertions(v_term, $const298$InferencePSC, remove_duplicatesP);
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 117988) 
  public static final SubLObject term_assertions(SubLObject v_term, SubLObject mt, SubLObject remove_duplicatesP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((remove_duplicatesP == UNPROVIDED)) {
      remove_duplicatesP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(v_term, $sym119$INDEXED_TERM_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = kb_mapping.gather_index(v_term, remove_duplicatesP);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 133594) 
  public static final SubLObject not_assertible_predicateP(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(pred))) {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts(pred, $const352$notAssertible, mt, UNPROVIDED, UNPROVIDED);
    } else {
      return makeBoolean((NIL == obsolete.reifiable_natP(pred, $sym79$CYC_VAR_, mt)));
    }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 133926) 
  public static final SubLObject not_assertible_collectionP(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(collection))) {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $const353$notAssertibleCollection, mt, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 134113) 
  public static final SubLObject not_assertible_mtP(SubLObject mt) {
    {
      SubLObject reduced_mt = hlmt_czer.canonicalize_hlmt(mt);
      if (((NIL != forts.fort_p(reduced_mt))
           && (NIL != hlmt.possibly_mt_p(reduced_mt)))) {
        return kb_mapping_utilities.some_pred_value_in_any_mt(reduced_mt, $const354$notAssertibleMt, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Functions commonly known to denote non-skolem indeterminate terms. */
  @SubL(source = "cycl/kb-accessors.lisp", position = 134763) 
  private static SubLSymbol $common_non_skolem_indeterminate_term_denoting_functions$ = null;

  @SubL(source = "cycl/kb-accessors.lisp", position = 135093) 
  public static final SubLObject common_non_skolem_indeterminate_term_denoting_functionP(SubLObject object) {
    return list_utilities.member_eqP(object, $common_non_skolem_indeterminate_term_denoting_functions$.getGlobalValue());
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 135334) 
  public static final SubLObject non_skolem_indeterminate_term_denoting_functionP(SubLObject object) {
    return makeBoolean(((NIL != forts.fort_p(object))
           && (NIL != fort_types_interface.functionP(object))
           && (NIL == fort_types_interface.skolem_function_p(object))
           && (NIL != isa.isaP(object, $const357$IndeterminateTermDenotingFunction, UNPROVIDED, UNPROVIDED))));
  }

  /** Will sometimes return false negatives */
  @SubL(source = "cycl/kb-accessors.lisp", position = 135933) 
  public static final SubLObject fast_non_skolem_indeterminate_termP(SubLObject v_term) {
    if (((NIL != variables.variable_p(v_term))
        || (NIL != cycl_grammar.cycl_unrepresented_term_p(v_term)))) {
      return NIL;
    } else if (((NIL != el_utilities.el_formula_p(v_term))
         && (NIL != common_non_skolem_indeterminate_term_denoting_functionP(cycl_utilities.formula_operator(v_term))))) {
      return T;
    } else if (((NIL != el_utilities.el_formula_p(v_term))
         && (NIL != non_skolem_indeterminate_term_denoting_functionP(cycl_utilities.formula_operator(v_term))))) {
      return T;
    } else {
      return NIL;
    }
  }

  public static final class $fast_non_skolem_indeterminate_termP$UnaryFunction extends UnaryFunction {
    public $fast_non_skolem_indeterminate_termP$UnaryFunction() { super(extractFunctionNamed("FAST-NON-SKOLEM-INDETERMINATE-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return fast_non_skolem_indeterminate_termP(arg1); }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 137971) 
  private static SubLSymbol $guess_the_cyclist_from_user_name_caching_state$ = null;

  public static final class $clear_guess_the_cyclist_from_user_name$ZeroArityFunction extends ZeroArityFunction {
    public $clear_guess_the_cyclist_from_user_name$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6836"); }
  }

  @SubL(source = "cycl/kb-accessors.lisp", position = 139901) 
  private static SubLSymbol $smallest_num_index_so_far$ = null;

  @SubL(source = "cycl/kb-accessors.lisp", position = 140011) 
  private static SubLSymbol $most_specialized_fort_so_far$ = null;

  public static final SubLObject declare_kb_accessors_file() {
    declareFunction(myName, "relationP", "RELATION?", 1, 0, false);
    //declareFunction(myName, "relation_in_any_mtP", "RELATION-IN-ANY-MT?", 1, 0, false);
    //declareFunction(myName, "anectP", "ANECT?", 1, 0, false);
    //declareFunction(myName, "reflexive_predicateP", "REFLEXIVE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "irreflexive_predicateP", "IRREFLEXIVE-PREDICATE?", 1, 0, false);
    //declareFunction(myName, "symmetric_predicateP", "SYMMETRIC-PREDICATE?", 1, 0, false);
    declareFunction(myName, "asymmetric_predicateP", "ASYMMETRIC-PREDICATE?", 1, 0, false);
    declareFunction(myName, "anti_symmetric_predicateP", "ANTI-SYMMETRIC-PREDICATE?", 1, 0, false);
    declareFunction(myName, "transitive_predicateP", "TRANSITIVE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "anti_transitive_predicateP", "ANTI-TRANSITIVE-PREDICATE?", 1, 0, false);
    //declareFunction(myName, "documentation_predicate_in_any_mt_p", "DOCUMENTATION-PREDICATE-IN-ANY-MT-P", 1, 0, false);
    //declareFunction(myName, "fast_documentation_predicate_p", "FAST-DOCUMENTATION-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "fast_documentation_assertion_p", "FAST-DOCUMENTATION-ASSERTION-P", 1, 0, false);
    //declareFunction(myName, "at_least_partially_commutative_relationP", "AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION?", 1, 0, false);
    //declareFunction(myName, "commutative_functionP", "COMMUTATIVE-FUNCTION?", 1, 0, false);
    declareFunction(myName, "binary_predicateP", "BINARY-PREDICATE?", 1, 0, false);
    //declareFunction(myName, "ternary_predicateP", "TERNARY-PREDICATE?", 1, 0, false);
    declareFunction(myName, "cyclistP", "CYCLIST?", 1, 0, false);
    //declareFunction(myName, "human_cyclistP", "HUMAN-CYCLIST?", 1, 0, false);
    //declareFunction(myName, "individualP", "INDIVIDUAL?", 1, 0, false);
    //declareFunction(myName, "set_or_collectionP", "SET-OR-COLLECTION?", 1, 0, false);
    //declareFunction(myName, "kb_individual_p", "KB-INDIVIDUAL-P", 1, 0, false);
    //declareFunction(myName, "kb_set_mathematical_p", "KB-SET-MATHEMATICAL-P", 1, 0, false);
    //declareFunction(myName, "kb_set_or_collection_p", "KB-SET-OR-COLLECTION-P", 1, 0, false);
    //declareFunction(myName, "kb_first_order_collection_p", "KB-FIRST-ORDER-COLLECTION-P", 1, 0, false);
    //declareFunction(myName, "kb_thing_p", "KB-THING-P", 1, 0, false);
    //declareFunction(myName, "subcollection_relation_function_p", "SUBCOLLECTION-RELATION-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "subcollection_relation_function_expression_p", "SUBCOLLECTION-RELATION-FUNCTION-EXPRESSION-P", 1, 0, false);
    declareFunction(myName, "decontextualized_predicateP", "DECONTEXTUALIZED-PREDICATE?", 1, 0, false);
    declareFunction(myName, "predicate_convention_mt", "PREDICATE-CONVENTION-MT", 1, 0, false);
    declareFunction(myName, "decontextualized_collectionP", "DECONTEXTUALIZED-COLLECTION?", 1, 0, false);
    declareFunction(myName, "collection_convention_mt", "COLLECTION-CONVENTION-MT", 1, 0, false);
    declareFunction(myName, "decontextualized_literalP", "DECONTEXTUALIZED-LITERAL?", 1, 0, false);
    declareFunction(myName, "decontextualized_literal_convention_mt", "DECONTEXTUALIZED-LITERAL-CONVENTION-MT", 1, 0, false);
    declareFunction(myName, "decontextualized_collection_literalP", "DECONTEXTUALIZED-COLLECTION-LITERAL?", 1, 0, false);
    declareFunction(myName, "decontextualized_atomic_cnfP", "DECONTEXTUALIZED-ATOMIC-CNF?", 1, 0, false);
    declareFunction(myName, "decontextualized_weakening_prohibitedP", "DECONTEXTUALIZED-WEAKENING-PROHIBITED?", 0, 0, false);
    declareFunction(myName, "mt_matches_convention_mtP", "MT-MATCHES-CONVENTION-MT?", 2, 0, false);
    declareFunction(myName, "possibly_convention_mt_for_decontextualized_cnf", "POSSIBLY-CONVENTION-MT-FOR-DECONTEXTUALIZED-CNF", 2, 0, false);
    //declareFunction(myName, "decontextualized_gafP", "DECONTEXTUALIZED-GAF?", 1, 0, false);
    //declareFunction(myName, "decontextualized_ruleP", "DECONTEXTUALIZED-RULE?", 1, 0, false);
    //declareFunction(myName, "decontextualized_assertionP", "DECONTEXTUALIZED-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "decontextualized_assertion_convention_mt", "DECONTEXTUALIZED-ASSERTION-CONVENTION-MT", 1, 0, false);
    //declareFunction(myName, "decontextualized_assertion_in_right_mtP", "DECONTEXTUALIZED-ASSERTION-IN-RIGHT-MT?", 1, 0, false);
    //declareFunction(myName, "quoted_collectionP", "QUOTED-COLLECTION?", 1, 0, false);
    declareFunction(myName, "quoted_argumentP", "QUOTED-ARGUMENT?", 2, 0, false);
    //declareFunction(myName, "some_quoted_argumentP", "SOME-QUOTED-ARGUMENT?", 1, 0, false);
    //declareFunction(myName, "opaque_argumentP", "OPAQUE-ARGUMENT?", 2, 0, false);
    //declareFunction(myName, "some_opaque_argumentP", "SOME-OPAQUE-ARGUMENT?", 1, 0, false);
    //declareFunction(myName, "minimize_collection_extent", "MINIMIZE-COLLECTION-EXTENT", 1, 1, false);
    //declareFunction(myName, "minimize_extent", "MINIMIZE-EXTENT", 1, 1, false);
    //declareFunction(myName, "complete_extent_assertedP", "COMPLETE-EXTENT-ASSERTED?", 1, 1, false);
    declareFunction(myName, "complete_extent_asserted_gaf", "COMPLETE-EXTENT-ASSERTED-GAF", 1, 1, false);
    //declareFunction(myName, "complete_extent_asserted_for_value_in_argP", "COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG?", 3, 1, false);
    declareFunction(myName, "complete_extent_asserted_for_value_in_arg_gaf", "COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAF", 3, 1, false);
    //declareFunction(myName, "complete_extent_enumerableP", "COMPLETE-EXTENT-ENUMERABLE?", 1, 1, false);
    declareFunction(myName, "complete_extent_enumerable_gaf", "COMPLETE-EXTENT-ENUMERABLE-GAF", 1, 1, false);
    //declareFunction(myName, "complete_extent_enumerable_via_backchain_gaf", "COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAF", 1, 1, false);
    //declareFunction(myName, "complete_extent_decidableP", "COMPLETE-EXTENT-DECIDABLE?", 1, 1, false);
    declareFunction(myName, "complete_extent_decidable_gaf", "COMPLETE-EXTENT-DECIDABLE-GAF", 1, 1, false);
    //declareFunction(myName, "complete_extent_enumerable_for_argP", "COMPLETE-EXTENT-ENUMERABLE-FOR-ARG?", 2, 1, false);
    declareFunction(myName, "complete_extent_enumerable_for_arg_gaf", "COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAF", 2, 1, false);
    //declareFunction(myName, "complete_extent_enumerable_for_value_in_argP", "COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG?", 3, 1, false);
    declareFunction(myName, "complete_extent_enumerable_for_value_in_arg_gaf", "COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAF", 3, 1, false);
    //declareFunction(myName, "complete_extent_decidable_for_value_in_argP", "COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG?", 3, 1, false);
    declareFunction(myName, "complete_extent_decidable_for_value_in_arg_gaf", "COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAF", 3, 1, false);
    declareFunction(myName, "completely_enumerable_collectionP", "COMPLETELY-ENUMERABLE-COLLECTION?", 1, 1, false);
    declareFunction(myName, "completely_enumerable_collection_gaf", "COMPLETELY-ENUMERABLE-COLLECTION-GAF", 1, 1, false);
    //declareFunction(myName, "collection_completely_enumerable_via_backchain_gaf", "COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-GAF", 1, 1, false);
    //declareFunction(myName, "completely_decidable_collectionP", "COMPLETELY-DECIDABLE-COLLECTION?", 1, 1, false);
    //declareFunction(myName, "completely_decidable_collection_gaf", "COMPLETELY-DECIDABLE-COLLECTION-GAF", 1, 1, false);
    declareFunction(myName, "backchain_requiredP", "BACKCHAIN-REQUIRED?", 1, 1, false);
    //declareFunction(myName, "backchain_encouragedP", "BACKCHAIN-ENCOURAGED?", 1, 1, false);
    //declareFunction(myName, "backchain_discouragedP", "BACKCHAIN-DISCOURAGED?", 1, 1, false);
    declareFunction(myName, "backchain_forbiddenP", "BACKCHAIN-FORBIDDEN?", 1, 1, false);
    declareFunction(myName, "collection_isa_backchain_requiredP", "COLLECTION-ISA-BACKCHAIN-REQUIRED?", 1, 1, false);
    declareFunction(myName, "collection_genls_backchain_requiredP", "COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 1, 1, false);
    declareFunction(myName, "collection_backchain_requiredP", "COLLECTION-BACKCHAIN-REQUIRED?", 1, 1, false);
    //declareFunction(myName, "collection_isa_backchain_encouragedP", "COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 1, 1, false);
    //declareFunction(myName, "collection_genls_backchain_encouragedP", "COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 1, 1, false);
    //declareFunction(myName, "collection_backchain_encouragedP", "COLLECTION-BACKCHAIN-ENCOURAGED?", 1, 1, false);
    //declareFunction(myName, "some_backchain_forbidden_unless_arg_chosen_assertion_somewhereP", "SOME-BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ASSERTION-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "backchain_forbidden_unless_arg_chosen_argnums", "BACKCHAIN-FORBIDDEN-UNLESS-ARG-CHOSEN-ARGNUMS", 1, 1, false);
    //declareFunction(myName, "highly_relevant_term_somewhereP", "HIGHLY-RELEVANT-TERM-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "irrelevant_term_somewhereP", "IRRELEVANT-TERM-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "skolemize_forward_somewhereP", "SKOLEMIZE-FORWARD-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "skolemize_forwardP", "SKOLEMIZE-FORWARD?", 1, 1, false);
    //declareFunction(myName, "rule_forward_reification_functions", "RULE-FORWARD-REIFICATION-FUNCTIONS", 1, 1, false);
    declareFunction(myName, "forward_reification_ruleP", "FORWARD-REIFICATION-RULE?", 2, 1, false);
    //declareFunction(myName, "arg1_isa", "ARG1-ISA", 1, 1, false);
    //declareFunction(myName, "arg2_isa", "ARG2-ISA", 1, 1, false);
    //declareFunction(myName, "arg3_isa", "ARG3-ISA", 1, 1, false);
    //declareFunction(myName, "arg4_isa", "ARG4-ISA", 1, 1, false);
    //declareFunction(myName, "arg5_isa", "ARG5-ISA", 1, 1, false);
    //declareFunction(myName, "arg6_isa", "ARG6-ISA", 1, 1, false);
    //declareFunction(myName, "args_isa", "ARGS-ISA", 1, 1, false);
    //declareFunction(myName, "args_quoted_isa", "ARGS-QUOTED-ISA", 1, 1, false);
    declareFunction(myName, "arg_and_rest_isa_min_argnum", "ARG-AND-REST-ISA-MIN-ARGNUM", 1, 1, false);
    declareFunction(myName, "arg_and_rest_isa_applicableP", "ARG-AND-REST-ISA-APPLICABLE?", 2, 1, false);
    declareFunction(myName, "arg_and_rest_quoted_isa_min_argnum", "ARG-AND-REST-QUOTED-ISA-MIN-ARGNUM", 1, 1, false);
    declareFunction(myName, "arg_and_rest_quoted_isa_applicableP", "ARG-AND-REST-QUOTED-ISA-APPLICABLE?", 2, 1, false);
    declareFunction(myName, "argn_isa", "ARGN-ISA", 2, 1, false);
    declareFunction(myName, "argn_quoted_isa", "ARGN-QUOTED-ISA", 2, 1, false);
    //declareFunction(myName, "argn_isa_implied", "ARGN-ISA-IMPLIED", 2, 1, false);
    declareFunction(myName, "argn_isa_int", "ARGN-ISA-INT", 3, 0, false);
    declareFunction(myName, "argn_isa_int_2", "ARGN-ISA-INT-2", 3, 0, false);
    declareFunction(myName, "argn_quoted_isa_int", "ARGN-QUOTED-ISA-INT", 3, 0, false);
    //declareFunction(myName, "argn_isa_from_ternary_arg_isa_pred", "ARGN-ISA-FROM-TERNARY-ARG-ISA-PRED", 3, 1, false);
    //declareFunction(myName, "argn_quoted_isa_from_ternary_arg_quoted_isa_pred", "ARGN-QUOTED-ISA-FROM-TERNARY-ARG-QUOTED-ISA-PRED", 3, 1, false);
    declareFunction(myName, "arg_isa_pred_int", "ARG-ISA-PRED-INT", 1, 0, false);
    declareFunction(myName, "arg_isa_pred", "ARG-ISA-PRED", 1, 2, false);
    declareFunction(myName, "arg_isa_preds", "ARG-ISA-PREDS", 1, 2, false);
    declareFunction(myName, "arg_quoted_isa_pred_int", "ARG-QUOTED-ISA-PRED-INT", 1, 0, false);
    declareFunction(myName, "arg_quoted_isa_pred", "ARG-QUOTED-ISA-PRED", 1, 2, false);
    declareFunction(myName, "arg_quoted_isa_preds", "ARG-QUOTED-ISA-PREDS", 1, 2, false);
    declareFunction(myName, "arg_isa_inverse", "ARG-ISA-INVERSE", 1, 2, false);
    declareFunction(myName, "arg_quoted_isa_inverse", "ARG-QUOTED-ISA-INVERSE", 1, 2, false);
    declareFunction(myName, "inverse_argnum", "INVERSE-ARGNUM", 1, 0, false);
    declareFunction(myName, "isa_pred_arg", "ISA-PRED-ARG", 1, 0, false);
    //declareFunction(myName, "quoted_isa_pred_arg", "QUOTED-ISA-PRED-ARG", 1, 0, false);
    //declareFunction(myName, "genl_pred_arg", "GENL-PRED-ARG", 1, 0, false);
    //declareFunction(myName, "min_argn_isa", "MIN-ARGN-ISA", 2, 1, false);
    //declareFunction(myName, "arg_types", "ARG-TYPES", 1, 1, false);
    //declareFunction(myName, "ai", "AI", 1, 1, false);
    //declareFunction(myName, "arg_isa", "ARG-ISA", 1, 1, false);
    //declareFunction(myName, "each_arg_isa", "EACH-ARG-ISA", 1, 1, false);
    //declareFunction(myName, "arg_quoted_isa", "ARG-QUOTED-ISA", 1, 1, false);
    //declareFunction(myName, "each_arg_quoted_isa", "EACH-ARG-QUOTED-ISA", 1, 1, false);
    //declareFunction(myName, "arg1_isa_of", "ARG1-ISA-OF", 1, 1, false);
    //declareFunction(myName, "arg2_isa_of", "ARG2-ISA-OF", 1, 1, false);
    //declareFunction(myName, "arg3_isa_of", "ARG3-ISA-OF", 1, 1, false);
    //declareFunction(myName, "arg4_isa_of", "ARG4-ISA-OF", 1, 1, false);
    //declareFunction(myName, "arg5_isa_of", "ARG5-ISA-OF", 1, 1, false);
    //declareFunction(myName, "arg6_isa_of", "ARG6-ISA-OF", 1, 1, false);
    //declareFunction(myName, "args_isa_of", "ARGS-ISA-OF", 1, 1, false);
    //declareFunction(myName, "aio", "AIO", 1, 1, false);
    //declareFunction(myName, "arg_isa_of", "ARG-ISA-OF", 1, 1, false);
    //declareFunction(myName, "argn_isa_of", "ARGN-ISA-OF", 2, 1, false);
    //declareFunction(myName, "arg1_genl", "ARG1-GENL", 1, 1, false);
    //declareFunction(myName, "arg2_genl", "ARG2-GENL", 1, 1, false);
    //declareFunction(myName, "arg3_genl", "ARG3-GENL", 1, 1, false);
    //declareFunction(myName, "arg4_genl", "ARG4-GENL", 1, 1, false);
    //declareFunction(myName, "arg5_genl", "ARG5-GENL", 1, 1, false);
    //declareFunction(myName, "arg6_genl", "ARG6-GENL", 1, 1, false);
    //declareFunction(myName, "args_genl", "ARGS-GENL", 1, 1, false);
    declareFunction(myName, "argn_genl", "ARGN-GENL", 2, 1, false);
    //declareFunction(myName, "argn_genl_from_ternary_arg_genl_pred", "ARGN-GENL-FROM-TERNARY-ARG-GENL-PRED", 3, 1, false);
    declareFunction(myName, "arg_and_rest_genl_min_argnum", "ARG-AND-REST-GENL-MIN-ARGNUM", 1, 1, false);
    declareFunction(myName, "arg_and_rest_genl_applicableP", "ARG-AND-REST-GENL-APPLICABLE?", 2, 1, false);
    declareFunction(myName, "arg_genl_pred_int", "ARG-GENL-PRED-INT", 1, 0, false);
    declareFunction(myName, "arg_genl_pred", "ARG-GENL-PRED", 1, 2, false);
    declareFunction(myName, "arg_genl_preds", "ARG-GENL-PREDS", 1, 2, false);
    declareFunction(myName, "arg_genl_inverse", "ARG-GENL-INVERSE", 1, 2, false);
    //declareFunction(myName, "min_argn_genl", "MIN-ARGN-GENL", 2, 1, false);
    //declareFunction(myName, "arg_genls", "ARG-GENLS", 1, 1, false);
    //declareFunction(myName, "each_arg_genl", "EACH-ARG-GENL", 1, 1, false);
    //declareFunction(myName, "arg1_genl_of", "ARG1-GENL-OF", 1, 1, false);
    //declareFunction(myName, "arg2_genl_of", "ARG2-GENL-OF", 1, 1, false);
    //declareFunction(myName, "arg3_genl_of", "ARG3-GENL-OF", 1, 1, false);
    //declareFunction(myName, "arg4_genl_of", "ARG4-GENL-OF", 1, 1, false);
    //declareFunction(myName, "arg5_genl_of", "ARG5-GENL-OF", 1, 1, false);
    //declareFunction(myName, "arg6_genl_of", "ARG6-GENL-OF", 1, 1, false);
    //declareFunction(myName, "args_genl_of", "ARGS-GENL-OF", 1, 1, false);
    //declareFunction(myName, "argn_genl_of", "ARGN-GENL-OF", 2, 1, false);
    //declareFunction(myName, "inter_arg_isa1_2", "INTER-ARG-ISA1-2", 1, 1, false);
    //declareFunction(myName, "inter_arg_isa2_1", "INTER-ARG-ISA2-1", 1, 1, false);
    //declareFunction(myName, "inter_arg_isa_dep", "INTER-ARG-ISA-DEP", 2, 1, false);
    //declareFunction(myName, "inter_arg_isa_indep", "INTER-ARG-ISA-INDEP", 2, 1, false);
    //declareFunction(myName, "inter_arg_isa_pred_indep_arg", "INTER-ARG-ISA-PRED-INDEP-ARG", 1, 0, false);
    //declareFunction(myName, "inter_arg_isa_preds_dep", "INTER-ARG-ISA-PREDS-DEP", 1, 0, false);
    //declareFunction(myName, "inter_arg_isa_preds_indep", "INTER-ARG-ISA-PREDS-INDEP", 1, 0, false);
    //declareFunction(myName, "defnsP", "DEFNS?", 1, 1, false);
    //declareFunction(myName, "admitting_defnsP", "ADMITTING-DEFNS?", 1, 1, false);
    //declareFunction(myName, "defining_defnsP", "DEFINING-DEFNS?", 1, 1, false);
    //declareFunction(myName, "sufficient_defnsP", "SUFFICIENT-DEFNS?", 1, 1, false);
    //declareFunction(myName, "necessary_defnsP", "NECESSARY-DEFNS?", 1, 1, false);
    //declareFunction(myName, "admitting_quoted_defnsP", "ADMITTING-QUOTED-DEFNS?", 1, 1, false);
    //declareFunction(myName, "defining_quoted_defnsP", "DEFINING-QUOTED-DEFNS?", 1, 1, false);
    //declareFunction(myName, "sufficient_quoted_defnsP", "SUFFICIENT-QUOTED-DEFNS?", 1, 1, false);
    //declareFunction(myName, "necessary_quoted_defnsP", "NECESSARY-QUOTED-DEFNS?", 1, 1, false);
    //declareFunction(myName, "defns", "DEFNS", 1, 1, false);
    //declareFunction(myName, "admitting_defns", "ADMITTING-DEFNS", 1, 1, false);
    //declareFunction(myName, "defining_defns", "DEFINING-DEFNS", 1, 1, false);
    //declareFunction(myName, "necessary_defns", "NECESSARY-DEFNS", 1, 1, false);
    //declareFunction(myName, "sufficient_defns", "SUFFICIENT-DEFNS", 1, 1, false);
    //declareFunction(myName, "all_sufficient_defns", "ALL-SUFFICIENT-DEFNS", 1, 1, false);
    //declareFunction(myName, "result_isaP", "RESULT-ISA?", 1, 1, false);
    //declareFunction(myName, "result_isa_argP", "RESULT-ISA-ARG?", 1, 1, false);
    //declareFunction(myName, "result_isa_arg_isaP", "RESULT-ISA-ARG-ISA?", 1, 1, false);
    //declareFunction(myName, "result_isa_via_closed_underP", "RESULT-ISA-VIA-CLOSED-UNDER?", 2, 1, false);
    //declareFunction(myName, "result_isa_arg_arg_isaP", "RESULT-ISA-ARG-ARG-ISA?", 1, 1, false);
    //declareFunction(myName, "function_to_arg_termP", "FUNCTION-TO-ARG-TERM?", 1, 0, false);
    //declareFunction(myName, "meta_result_isaP", "META-RESULT-ISA?", 1, 1, false);
    //declareFunction(myName, "meta_result_isa_argP", "META-RESULT-ISA-ARG?", 1, 1, false);
    //declareFunction(myName, "evaluation_result_quoted_isaP", "EVALUATION-RESULT-QUOTED-ISA?", 1, 1, false);
    //declareFunction(myName, "meta_evaluation_result_quoted_isaP", "META-EVALUATION-RESULT-QUOTED-ISA?", 1, 1, false);
    //declareFunction(myName, "result_quoted_isaP", "RESULT-QUOTED-ISA?", 1, 1, false);
    //declareFunction(myName, "meta_result_quoted_isaP", "META-RESULT-QUOTED-ISA?", 1, 1, false);
    //declareFunction(myName, "result_genlP", "RESULT-GENL?", 1, 1, false);
    //declareFunction(myName, "result_genl_argP", "RESULT-GENL-ARG?", 1, 1, false);
    //declareFunction(myName, "result_genl_arg_arg_genlP", "RESULT-GENL-ARG-ARG-GENL?", 1, 1, false);
    //declareFunction(myName, "meta_result_genlP", "META-RESULT-GENL?", 1, 1, false);
    //declareFunction(myName, "meta_result_genl_argP", "META-RESULT-GENL-ARG?", 1, 1, false);
    //declareFunction(myName, "result_type", "RESULT-TYPE", 1, 1, false);
    //declareFunction(myName, "result_types", "RESULT-TYPES", 1, 1, false);
    //declareFunction(myName, "result_isa", "RESULT-ISA", 1, 1, false);
    //declareFunction(myName, "result_isa_via_arg_arg_isa", "RESULT-ISA-VIA-ARG-ARG-ISA", 1, 1, false);
    //declareFunction(myName, "result_isa_args", "RESULT-ISA-ARGS", 1, 1, false);
    //declareFunction(myName, "result_isa_arg_isas", "RESULT-ISA-ARG-ISAS", 1, 1, false);
    //declareFunction(myName, "result_isa_via_closed_under", "RESULT-ISA-VIA-CLOSED-UNDER", 1, 1, false);
    //declareFunction(myName, "result_inter_arg_isa", "RESULT-INTER-ARG-ISA", 1, 1, false);
    //declareFunction(myName, "result_inter_arg_isa_reln", "RESULT-INTER-ARG-ISA-RELN", 1, 1, false);
    //declareFunction(myName, "meta_result_isa", "META-RESULT-ISA", 1, 1, false);
    //declareFunction(myName, "meta_result_isa_args", "META-RESULT-ISA-ARGS", 1, 1, false);
    //declareFunction(myName, "evaluation_result_quoted_isa", "EVALUATION-RESULT-QUOTED-ISA", 1, 1, false);
    //declareFunction(myName, "meta_evaluation_result_quoted_isa", "META-EVALUATION-RESULT-QUOTED-ISA", 1, 1, false);
    //declareFunction(myName, "result_quoted_isa", "RESULT-QUOTED-ISA", 1, 1, false);
    //declareFunction(myName, "meta_result_quoted_isa", "META-RESULT-QUOTED-ISA", 1, 1, false);
    //declareFunction(myName, "result_genl", "RESULT-GENL", 1, 2, false);
    //declareFunction(myName, "result_genl_args", "RESULT-GENL-ARGS", 1, 1, false);
    //declareFunction(myName, "result_genl_via_arg_arg_genl", "RESULT-GENL-VIA-ARG-ARG-GENL", 1, 1, false);
    //declareFunction(myName, "result_inter_arg_genl", "RESULT-INTER-ARG-GENL", 1, 1, false);
    //declareFunction(myName, "result_inter_arg_genl_reln", "RESULT-INTER-ARG-GENL-RELN", 1, 1, false);
    //declareFunction(myName, "meta_result_genl", "META-RESULT-GENL", 1, 1, false);
    //declareFunction(myName, "meta_result_genl_args", "META-RESULT-GENL-ARGS", 1, 1, false);
    //declareFunction(myName, "result_isa_of", "RESULT-ISA-OF", 1, 2, false);
    //declareFunction(myName, "result_genl_of", "RESULT-GENL-OF", 1, 2, false);
    //declareFunction(myName, "result_genl_via_argnums", "RESULT-GENL-VIA-ARGNUMS", 2, 2, false);
    //declareFunction(myName, "result_isa_via_argnums", "RESULT-ISA-VIA-ARGNUMS", 2, 2, false);
    //declareFunction(myName, "result_isa_arg_isa_via_argnums", "RESULT-ISA-ARG-ISA-VIA-ARGNUMS", 2, 2, false);
    //declareFunction(myName, "result_inter_arg_isa_via_which_args", "RESULT-INTER-ARG-ISA-VIA-WHICH-ARGS", 2, 2, false);
    //declareFunction(myName, "result_inter_arg_isa_reln_via_which_args", "RESULT-INTER-ARG-ISA-RELN-VIA-WHICH-ARGS", 2, 2, false);
    //declareFunction(myName, "result_inter_arg_genl_via_which_args", "RESULT-INTER-ARG-GENL-VIA-WHICH-ARGS", 2, 1, false);
    //declareFunction(myName, "result_inter_arg_genl_reln_via_which_args", "RESULT-INTER-ARG-GENL-RELN-VIA-WHICH-ARGS", 2, 2, false);
    //declareFunction(myName, "arg1_format", "ARG1-FORMAT", 1, 1, false);
    //declareFunction(myName, "arg2_format", "ARG2-FORMAT", 1, 1, false);
    //declareFunction(myName, "arg3_format", "ARG3-FORMAT", 1, 1, false);
    //declareFunction(myName, "arg4_format", "ARG4-FORMAT", 1, 1, false);
    //declareFunction(myName, "arg5_format", "ARG5-FORMAT", 1, 1, false);
    //declareFunction(myName, "arg6_format", "ARG6-FORMAT", 1, 1, false);
    declareFunction(myName, "argn_format_inverse", "ARGN-FORMAT-INVERSE", 1, 0, false);
    declareFunction(myName, "argn_format_pred", "ARGN-FORMAT-PRED", 1, 0, false);
    //declareFunction(myName, "argn_format", "ARGN-FORMAT", 2, 1, false);
    //declareFunction(myName, "each_arg_format", "EACH-ARG-FORMAT", 1, 1, false);
    //declareFunction(myName, "arg_n_single_entry_formatP", "ARG-N-SINGLE-ENTRY-FORMAT?", 2, 1, false);
    //declareFunction(myName, "arg1_format_of", "ARG1-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "arg2_format_of", "ARG2-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "arg3_format_of", "ARG3-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "arg4_format_of", "ARG4-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "arg5_format_of", "ARG5-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "arg6_format_of", "ARG6-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "arg_format_of", "ARG-FORMAT-OF", 1, 1, false);
    //declareFunction(myName, "argn_format_of", "ARGN-FORMAT-OF", 2, 1, false);
    //declareFunction(myName, "inter_arg_format_dep", "INTER-ARG-FORMAT-DEP", 2, 1, false);
    declareFunction(myName, "inter_arg_format_pred", "INTER-ARG-FORMAT-PRED", 2, 0, false);
    //declareFunction(myName, "inter_arg_format_inverse", "INTER-ARG-FORMAT-INVERSE", 2, 0, false);
    //declareFunction(myName, "inter_arg_format1_2", "INTER-ARG-FORMAT1-2", 1, 1, false);
    //declareFunction(myName, "inter_arg_format2_1", "INTER-ARG-FORMAT2-1", 1, 1, false);
    declareFunction(myName, "inter_arg_format_preds_dep", "INTER-ARG-FORMAT-PREDS-DEP", 1, 0, false);
    declareFunction(myName, "inter_arg_format_preds_ind", "INTER-ARG-FORMAT-PREDS-IND", 1, 0, false);
    //declareFunction(myName, "required_pred_arg", "REQUIRED-PRED-ARG", 1, 0, false);
    //declareFunction(myName, "required_pred_of_argnum", "REQUIRED-PRED-OF-ARGNUM", 1, 0, false);
    //declareFunction(myName, "required_preds_of_argnum", "REQUIRED-PREDS-OF-ARGNUM", 1, 0, false);
    //declareFunction(myName, "relation_all_preds_of_argnum", "RELATION-ALL-PREDS-OF-ARGNUM", 1, 0, false);
    //declareFunction(myName, "relation_exists_preds_of_argnum", "RELATION-EXISTS-PREDS-OF-ARGNUM", 1, 0, false);
    //declareFunction(myName, "pred_mts", "PRED-MTS", 2, 1, false);
    //declareFunction(myName, "mts_of_fort_wrt_predicate_type", "MTS-OF-FORT-WRT-PREDICATE-TYPE", 2, 1, false);
    //declareFunction(myName, "mts_of_predicate_type_int", "MTS-OF-PREDICATE-TYPE-INT", 1, 0, false);
    //declareFunction(myName, "arg_type_mts", "ARG-TYPE-MTS", 1, 0, false);
    //declareFunction(myName, "root_wrtP", "ROOT-WRT?", 2, 1, false);
    //declareFunction(myName, "leaf_wrtP", "LEAF-WRT?", 2, 1, false);
    declareFunction(myName, "fan_out_arg", "FAN-OUT-ARG", 1, 1, false);
    declareFunction(myName, "asserted_fan_out_arg", "ASSERTED-FAN-OUT-ARG", 1, 1, false);
    //declareFunction(myName, "fan_in_arg", "FAN-IN-ARG", 1, 1, false);
    //declareFunction(myName, "equivalence_class_wrtP", "EQUIVALENCE-CLASS-WRT?", 3, 1, false);
    //declareFunction(myName, "equivalence_classP", "EQUIVALENCE-CLASS?", 3, 1, false);
    //declareFunction(myName, "equivalence_class_predP", "EQUIVALENCE-CLASS-PRED?", 1, 0, false);
    //declareFunction(myName, "equivalence_class_pred_wrt", "EQUIVALENCE-CLASS-PRED-WRT", 1, 1, false);
    //declareFunction(myName, "reviewer", "REVIEWER", 1, 1, false);
    //declareFunction(myName, "comment", "COMMENT", 1, 1, false);
    //declareFunction(myName, "comment_if_fort", "COMMENT-IF-FORT", 1, 1, false);
    //declareFunction(myName, "cyclist_notes", "CYCLIST-NOTES", 1, 1, false);
    //declareFunction(myName, "constants_referencing_me_in_string", "CONSTANTS-REFERENCING-ME-IN-STRING", 1, 4, false);
    //declareFunction(myName, "constants_in_string_assertions", "CONSTANTS-IN-STRING-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "any_of_constants_in_string_assertionP", "ANY-OF-CONSTANTS-IN-STRING-ASSERTION?", 2, 0, false);
    //declareFunction(myName, "strings_in_string_assertions", "STRINGS-IN-STRING-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "any_of_strings_in_string_assertionP", "ANY-OF-STRINGS-IN-STRING-ASSERTION?", 2, 0, false);
    //declareFunction(myName, "any_referenced_in_stringP", "ANY-REFERENCED-IN-STRING?", 2, 1, false);
    //declareFunction(myName, "gather_arg_of_selected_gaf_assertion", "GATHER-ARG-OF-SELECTED-GAF-ASSERTION", 1, 0, false);
    //declareFunction(myName, "index_arg_references_in_stringP", "INDEX-ARG-REFERENCES-IN-STRING?", 1, 0, false);
    //declareFunction(myName, "supported_entries", "SUPPORTED-ENTRIES", 2, 4, false);
    declareFunction(myName, "assertion_still_thereP", "ASSERTION-STILL-THERE?", 2, 0, false);
    //declareFunction(myName, "paraphrase_constant", "PARAPHRASE-CONSTANT", 1, 2, false);
    //declareFunction(myName, "pc", "PC", 1, 2, false);
    //declareFunction(myName, "paraphrase_constant_in_mt", "PARAPHRASE-CONSTANT-IN-MT", 1, 2, false);
    //declareFunction(myName, "mts_of_constant_temp", "MTS-OF-CONSTANT-TEMP", 1, 0, false);
    //declareFunction(myName, "constant_documentation", "CONSTANT-DOCUMENTATION", 1, 2, false);
    //declareFunction(myName, "cd", "CD", 1, 2, false);
    //declareFunction(myName, "constant_documentation_int", "CONSTANT-DOCUMENTATION-INT", 1, 1, false);
    //declareFunction(myName, "print_arg", "PRINT-ARG", 1, 1, false);
    //declareFunction(myName, "print_assertion_args", "PRINT-ASSERTION-ARGS", 1, 2, false);
    declareFunction(myName, "scoping_args", "SCOPING-ARGS", 1, 1, false);
    //declareFunction(myName, "scoping_argP", "SCOPING-ARG?", 2, 1, false);
    declareFunction(myName, "some_scoping_arg_somewhereP", "SOME-SCOPING-ARG-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "all_term_assertions", "ALL-TERM-ASSERTIONS", 1, 1, false);
    declareFunction(myName, "term_assertions", "TERM-ASSERTIONS", 1, 2, false);
    //declareFunction(myName, "ca", "CA", 1, 0, false);
    //declareFunction(myName, "fort_assertions", "FORT-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "any_term_assertion", "ANY-TERM-ASSERTION", 1, 1, false);
    //declareFunction(myName, "ata", "ATA", 1, 1, false);
    //declareFunction(myName, "atf", "ATF", 1, 1, false);
    //declareFunction(myName, "assertion_mentions_kba_predP", "ASSERTION-MENTIONS-KBA-PRED?", 1, 0, false);
    //declareFunction(myName, "ata_wrt_pred", "ATA-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "relevant_term_assertions", "RELEVANT-TERM-ASSERTIONS", 1, 4, false);
    //declareFunction(myName, "term_specified_to_be_retainedP", "TERM-SPECIFIED-TO-BE-RETAINED?", 1, 0, false);
    //declareFunction(myName, "cyclist_with_most_assertions_about", "CYCLIST-WITH-MOST-ASSERTIONS-ABOUT", 1, 0, false);
    //declareFunction(myName, "isa_relevant_assertions", "ISA-RELEVANT-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "ira", "IRA", 1, 1, false);
    //declareFunction(myName, "map_selected_term_assertions_int", "MAP-SELECTED-TERM-ASSERTIONS-INT", 2, 0, false);
    //declareFunction(myName, "ira_wrt_type", "IRA-WRT-TYPE", 2, 1, false);
    //declareFunction(myName, "isa_relevant_assertions_wrt_type", "ISA-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false);
    //declareFunction(myName, "ira_wrt_pred", "IRA-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "isa_relevant_assertions_wrt_pred", "ISA-RELEVANT-ASSERTIONS-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "ira_wrt_type_and_pred", "IRA-WRT-TYPE-AND-PRED", 3, 1, false);
    //declareFunction(myName, "isa_relevant_assertions_wrt_type_and_pred", "ISA-RELEVANT-ASSERTIONS-WRT-TYPE-AND-PRED", 3, 1, false);
    //declareFunction(myName, "ako_relevant_assertions", "AKO-RELEVANT-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "ara", "ARA", 1, 1, false);
    //declareFunction(myName, "ara_wrt_type", "ARA-WRT-TYPE", 2, 1, false);
    //declareFunction(myName, "ako_relevant_assertions_wrt_type", "AKO-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false);
    //declareFunction(myName, "ara_wrt_pred", "ARA-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "ako_relevant_assertions_wrt_pred", "AKO-RELEVANT-ASSERTIONS-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "ara_wrt_type_and_pred", "ARA-WRT-TYPE-AND-PRED", 3, 1, false);
    //declareFunction(myName, "ako_relevant_assertions_wrt_type_and_pred", "AKO-RELEVANT-ASSERTIONS-WRT-TYPE-AND-PRED", 3, 1, false);
    //declareFunction(myName, "possibly_relevant_assertions", "POSSIBLY-RELEVANT-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "pra", "PRA", 1, 1, false);
    //declareFunction(myName, "pra_wrt_type", "PRA-WRT-TYPE", 2, 1, false);
    //declareFunction(myName, "possibly_relevant_assertions_wrt_type", "POSSIBLY-RELEVANT-ASSERTIONS-WRT-TYPE", 2, 1, false);
    //declareFunction(myName, "pra_wrt_pred", "PRA-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "possibly_relevant_assertions_wrt_pred", "POSSIBLY-RELEVANT-ASSERTIONS-WRT-PRED", 2, 1, false);
    //declareFunction(myName, "pra_wrt_type_and_pred", "PRA-WRT-TYPE-AND-PRED", 3, 1, false);
    //declareFunction(myName, "possibly_relevant_assertions_wrt_type_and_pred", "POSSIBLY-RELEVANT-ASSERTIONS-WRT-TYPE-AND-PRED", 3, 1, false);
    //declareFunction(myName, "gafs_re", "GAFS-RE", 1, 2, false);
    //declareFunction(myName, "assertions_re", "ASSERTIONS-RE", 1, 1, false);
    //declareFunction(myName, "selective_gafs_re", "SELECTIVE-GAFS-RE", 2, 2, false);
    //declareFunction(myName, "selective_assertions_re", "SELECTIVE-ASSERTIONS-RE", 2, 1, false);
    //declareFunction(myName, "pred_assertions", "PRED-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "constant_pos_gafs", "CONSTANT-POS-GAFS", 1, 1, false);
    //declareFunction(myName, "constant_pos_gafs_int", "CONSTANT-POS-GAFS-INT", 1, 1, false);
    //declareMacro(myName, "do_gafs_wrt_pred_type", "DO-GAFS-WRT-PRED-TYPE");
    //declareFunction(myName, "term_gafs_wrt_pred_type", "TERM-GAFS-WRT-PRED-TYPE", 2, 2, false);
    //declareFunction(myName, "relation_types", "RELATION-TYPES", 2, 1, false);
    //declareFunction(myName, "gather_relation_types", "GATHER-RELATION-TYPES", 1, 0, false);
    //declareFunction(myName, "relation_types_sp", "RELATION-TYPES-SP", 2, 1, false);
    //declareFunction(myName, "gather_relation_types_sp", "GATHER-RELATION-TYPES-SP", 1, 0, false);
    //declareFunction(myName, "defining_mt_for_fortP", "DEFINING-MT-FOR-FORT?", 1, 0, false);
    //declareFunction(myName, "defining_mt", "DEFINING-MT", 1, 0, false);
    declareFunction(myName, "not_assertible_predicateP", "NOT-ASSERTIBLE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "not_assertible_collectionP", "NOT-ASSERTIBLE-COLLECTION?", 1, 1, false);
    declareFunction(myName, "not_assertible_mtP", "NOT-ASSERTIBLE-MT?", 1, 0, false);
    //declareFunction(myName, "indexical_p", "INDEXICAL-P", 1, 0, false);
    declareFunction(myName, "common_non_skolem_indeterminate_term_denoting_functionP", "COMMON-NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTION?", 1, 0, false);
    declareFunction(myName, "non_skolem_indeterminate_term_denoting_functionP", "NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTION?", 1, 0, false);
    //declareFunction(myName, "indeterminate_termP", "INDETERMINATE-TERM?", 1, 0, false);
    declareFunction(myName, "fast_non_skolem_indeterminate_termP", "FAST-NON-SKOLEM-INDETERMINATE-TERM?", 1, 0, false); new $fast_non_skolem_indeterminate_termP$UnaryFunction();
    //declareFunction(myName, "non_skolem_indeterminate_termP", "NON-SKOLEM-INDETERMINATE-TERM?", 1, 0, false);
    //declareFunction(myName, "non_abducible_ruleP", "NON-ABDUCIBLE-RULE?", 1, 0, false);
    //declareFunction(myName, "term_exempt_from_unique_names_assumptionP", "TERM-EXEMPT-FROM-UNIQUE-NAMES-ASSUMPTION?", 1, 0, false);
    //declareFunction(myName, "email_address_text", "EMAIL-ADDRESS-TEXT", 1, 0, false);
    //declareFunction(myName, "preferred_email_address_text", "PREFERRED-EMAIL-ADDRESS-TEXT", 1, 0, false);
    //declareFunction(myName, "local_email_address_text", "LOCAL-EMAIL-ADDRESS-TEXT", 1, 0, false);
    //declareFunction(myName, "clear_guess_the_cyclist_from_user_name", "CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME", 0, 0, false); new $clear_guess_the_cyclist_from_user_name$ZeroArityFunction();
    //declareFunction(myName, "remove_guess_the_cyclist_from_user_name", "REMOVE-GUESS-THE-CYCLIST-FROM-USER-NAME", 0, 1, false);
    //declareFunction(myName, "guess_the_cyclist_from_user_name_internal", "GUESS-THE-CYCLIST-FROM-USER-NAME-INTERNAL", 1, 0, false);
    //declareFunction(myName, "guess_the_cyclist_from_user_name", "GUESS-THE-CYCLIST-FROM-USER-NAME", 0, 1, false);
    //declareFunction(myName, "possibly_update_most_specialized_fort", "POSSIBLY-UPDATE-MOST-SPECIALIZED-FORT", 1, 0, false);
    //declareFunction(myName, "most_specialized_fort", "MOST-SPECIALIZED-FORT", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_kb_accessors_file() {
    $decontextualized_weakening_prohibitedP$ = defparameter("*DECONTEXTUALIZED-WEAKENING-PROHIBITED?*", T);
    $common_non_skolem_indeterminate_term_denoting_functions$ = deflexical("*COMMON-NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTIONS*", $list356);
    $guess_the_cyclist_from_user_name_caching_state$ = deflexical("*GUESS-THE-CYCLIST-FROM-USER-NAME-CACHING-STATE*", NIL);
    $smallest_num_index_so_far$ = defparameter("*SMALLEST-NUM-INDEX-SO-FAR*", NIL);
    $most_specialized_fort_so_far$ = defparameter("*MOST-SPECIALIZED-FORT-SO-FAR*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_accessors_file() {
    // CVS_ID("Id: kb-accessors.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym0$RELATION_, $list1, $str2$Return_T_iff_RELATION_is_a_relati, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym7$REFLEXIVE_PREDICATE_, $list8, $str9$Return_T_iff_PREDICATE_is_a_refle, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym10$IRREFLEXIVE_PREDICATE_, $list8, $str11$Return_T_iff_PREDICATE_is_an_irre, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym12$SYMMETRIC_PREDICATE_, $list8, $str13$Return_T_iff_PREDICATE_is_a_symme, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym14$ASYMMETRIC_PREDICATE_, $list8, $str15$Return_T_iff_PREDICATE_is_an_asym, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym16$ANTI_SYMMETRIC_PREDICATE_, $list8, $str17$Return_T_iff_PREDICATE_is_an_anti, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym18$TRANSITIVE_PREDICATE_, $list8, $str19$Return_T_iff_PREDICATE_is_a_trans, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym20$COMMUTATIVE_FUNCTION_, $list21, $str22$Return_T_iff_FUNCTION_is_a_commut, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym23$BINARY_PREDICATE_, $list8, $str24$Return_T_iff_PREDICATE_is_a_predi, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym27$INDIVIDUAL_, $list28, $str29$Return_T_iff_TERM_is_an_individua, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym31$SET_OR_COLLECTION_, $list28, $str32$Return_T_iff_TERM_is_a_set_or_col, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym84$ARGN_ISA, $list85, $str86$Returns_a_list_of_the_local_isa_c, $list87, NIL);
    utilities_macros.register_cyc_api_function($sym88$ARGN_QUOTED_ISA, $list85, $str86$Returns_a_list_of_the_local_isa_c, $list87, NIL);
    utilities_macros.register_cyc_api_function($sym120$MIN_ARGN_ISA, $list121, $str122$Returns_a_list_of_the_most_specif, $list123, $list124);
    utilities_macros.register_cyc_api_function($sym126$ARGN_ISA_OF, $list127, $str128$Returns_the_relations_for_which_C, $list87, $list124);
    utilities_macros.register_cyc_api_function($sym132$ARGN_GENL, $list85, $str133$Returns_the_local_genl_constraint, $list87, $list124);
    utilities_macros.register_cyc_api_function($sym137$MIN_ARGN_GENL, $list121, $str138$Return_a_list_of_the_most_specifi, $list139, $list140);
    utilities_macros.register_cyc_api_function($sym142$ARGN_GENL_OF, $list127, $str143$Returns_a_list_of_the_predicates_, $list87, $list140);
    utilities_macros.register_cyc_api_function($sym145$INTER_ARG_ISA1_2, $list146, $str147$return_a_list_of_pairs_of___arg1_, NIL, $list148);
    utilities_macros.register_cyc_api_function($sym184$DEFINING_DEFNS, $list185, $str186$Return_a_list_of_the_local_defini, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym187$NECESSARY_DEFNS, $list185, $str188$Return_a_list_of_the_local_necess, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym189$SUFFICIENT_DEFNS, $list185, $str190$Return_a_list_of_the_local_suffic, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym191$ALL_SUFFICIENT_DEFNS, $list185, $str192$Return_a_list_of_all_sufficient_d, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym206$RESULT_ISA, $list207, $str208$Return_a_list_of_the_collections_, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym215$EVALUATION_RESULT_QUOTED_ISA, $list207, $str216$return_the_collections_that_inclu, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym217$RESULT_QUOTED_ISA, $list207, $str218$return_the_collections_that_inclu, NIL, $list140);
    utilities_macros.register_cyc_api_function($sym262$REVIEWER, $list263, $str264$Identify_the_cyclist_who_reviewed, $list265, $list266);
    utilities_macros.register_cyc_api_function($sym268$COMMENT, $list269, $str270$Return_the_comment_string_for_FOR, $list271, $list272);
    access_macros.register_external_symbol($sym273$COMMENT_IF_FORT);
    access_macros.register_external_symbol($sym274$CYCLIST_NOTES);
    utilities_macros.register_cyc_api_function($sym299$ALL_TERM_ASSERTIONS, $list300, $str301$Return_a_list_of_all_the_assertio, $list302, $list303);
    utilities_macros.register_cyc_api_function($sym311$ISA_RELEVANT_ASSERTIONS, $list312, $str313$Return_a_list_of_all__e_g___inher, NIL, $list303);
    utilities_macros.register_cyc_api_function($sym316$ISA_RELEVANT_ASSERTIONS_WRT_TYPE, $list317, $str318$Returns_a_list_of_all__e_g___inhe, NIL, $list303);
    utilities_macros.register_cyc_api_macro($sym332$DO_GAFS_WRT_PRED_TYPE, $list321, $str333$iterate_over_every_gaf_assertion_);
    memoization_state.note_globally_cached_function($sym366$GUESS_THE_CYCLIST_FROM_USER_NAME);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$RELATION_ = makeSymbol("RELATION?");
  public static final SubLList $list1 = list(makeSymbol("RELATION"));
  public static final SubLString $str2$Return_T_iff_RELATION_is_a_relati = makeString("Return T iff RELATION is a relationship.");
  public static final SubLList $list3 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const5$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const6$AtemporalNecessarilyEssentialColl = constant_handles.reader_make_constant_shell(makeString("AtemporalNecessarilyEssentialCollectionType"));
  public static final SubLSymbol $sym7$REFLEXIVE_PREDICATE_ = makeSymbol("REFLEXIVE-PREDICATE?");
  public static final SubLList $list8 = list(makeSymbol("PREDICATE"));
  public static final SubLString $str9$Return_T_iff_PREDICATE_is_a_refle = makeString("Return T iff PREDICATE is a reflexive predicate.");
  public static final SubLSymbol $sym10$IRREFLEXIVE_PREDICATE_ = makeSymbol("IRREFLEXIVE-PREDICATE?");
  public static final SubLString $str11$Return_T_iff_PREDICATE_is_an_irre = makeString("Return T iff PREDICATE is an irreflexive predicate.");
  public static final SubLSymbol $sym12$SYMMETRIC_PREDICATE_ = makeSymbol("SYMMETRIC-PREDICATE?");
  public static final SubLString $str13$Return_T_iff_PREDICATE_is_a_symme = makeString("Return T iff PREDICATE is a symmetric predicate.");
  public static final SubLSymbol $sym14$ASYMMETRIC_PREDICATE_ = makeSymbol("ASYMMETRIC-PREDICATE?");
  public static final SubLString $str15$Return_T_iff_PREDICATE_is_an_asym = makeString("Return T iff PREDICATE is an asymmetric predicate.");
  public static final SubLSymbol $sym16$ANTI_SYMMETRIC_PREDICATE_ = makeSymbol("ANTI-SYMMETRIC-PREDICATE?");
  public static final SubLString $str17$Return_T_iff_PREDICATE_is_an_anti = makeString("Return T iff PREDICATE is an anti-symmetric predicate.");
  public static final SubLSymbol $sym18$TRANSITIVE_PREDICATE_ = makeSymbol("TRANSITIVE-PREDICATE?");
  public static final SubLString $str19$Return_T_iff_PREDICATE_is_a_trans = makeString("Return T iff PREDICATE is a transitive predicate.");
  public static final SubLSymbol $sym20$COMMUTATIVE_FUNCTION_ = makeSymbol("COMMUTATIVE-FUNCTION?");
  public static final SubLList $list21 = list(makeSymbol("FUNCTION"));
  public static final SubLString $str22$Return_T_iff_FUNCTION_is_a_commut = makeString("Return T iff FUNCTION is a commutative function.");
  public static final SubLSymbol $sym23$BINARY_PREDICATE_ = makeSymbol("BINARY-PREDICATE?");
  public static final SubLString $str24$Return_T_iff_PREDICATE_is_a_predi = makeString("Return T iff PREDICATE is a predicate of arity 2.");
  public static final SubLObject $const25$Cyclist = constant_handles.reader_make_constant_shell(makeString("Cyclist"));
  public static final SubLObject $const26$HumanCyclist = constant_handles.reader_make_constant_shell(makeString("HumanCyclist"));
  public static final SubLSymbol $sym27$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");
  public static final SubLList $list28 = list(makeSymbol("TERM"));
  public static final SubLString $str29$Return_T_iff_TERM_is_an_individua = makeString("Return T iff TERM is an individual (i.e., *not* a collection).");
  public static final SubLObject $const30$Set_Mathematical = constant_handles.reader_make_constant_shell(makeString("Set-Mathematical"));
  public static final SubLSymbol $sym31$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");
  public static final SubLString $str32$Return_T_iff_TERM_is_a_set_or_col = makeString("Return T iff TERM is a set or collection (i.e., *not* an individual).");
  public static final SubLObject $const33$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));
  public static final SubLObject $const34$SetOrCollection = constant_handles.reader_make_constant_shell(makeString("SetOrCollection"));
  public static final SubLObject $const35$FirstOrderCollection = constant_handles.reader_make_constant_shell(makeString("FirstOrderCollection"));
  public static final SubLObject $const36$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLObject $const37$SubcollectionRelationFunction = constant_handles.reader_make_constant_shell(makeString("SubcollectionRelationFunction"));
  public static final SubLObject $const38$decontextualizedPredicate = constant_handles.reader_make_constant_shell(makeString("decontextualizedPredicate"));
  public static final SubLObject $const39$predicateConventionMt = constant_handles.reader_make_constant_shell(makeString("predicateConventionMt"));
  public static final SubLObject $const40$decontextualizedCollection = constant_handles.reader_make_constant_shell(makeString("decontextualizedCollection"));
  public static final SubLObject $const41$collectionConventionMt = constant_handles.reader_make_constant_shell(makeString("collectionConventionMt"));
  public static final SubLObject $const42$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const43$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const44$quotedCollection = constant_handles.reader_make_constant_shell(makeString("quotedCollection"));
  public static final SubLObject $const45$quotedArgument = constant_handles.reader_make_constant_shell(makeString("quotedArgument"));
  public static final SubLObject $const46$opaqueArgument = constant_handles.reader_make_constant_shell(makeString("opaqueArgument"));
  public static final SubLObject $const47$minimizeCollectionExtent = constant_handles.reader_make_constant_shell(makeString("minimizeCollectionExtent"));
  public static final SubLObject $const48$minimizeExtent = constant_handles.reader_make_constant_shell(makeString("minimizeExtent"));
  public static final SubLSymbol $sym49$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const50$completeExtentAsserted = constant_handles.reader_make_constant_shell(makeString("completeExtentAsserted"));
  public static final SubLSymbol $sym51$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLObject $const52$completeExtentAssertedForValueInA = constant_handles.reader_make_constant_shell(makeString("completeExtentAssertedForValueInArg"));
  public static final SubLObject $const53$completeExtentEnumerable = constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerable"));
  public static final SubLObject $const54$completeExtentEnumerableViaBackch = constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerableViaBackchain"));
  public static final SubLObject $const55$completeExtentDecidable = constant_handles.reader_make_constant_shell(makeString("completeExtentDecidable"));
  public static final SubLObject $const56$completeExtentEnumerableForArg = constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerableForArg"));
  public static final SubLObject $const57$completeExtentEnumerableForValueI = constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerableForValueInArg"));
  public static final SubLObject $const58$completeExtentDecidableForValueIn = constant_handles.reader_make_constant_shell(makeString("completeExtentDecidableForValueInArg"));
  public static final SubLObject $const59$completelyEnumerableCollection = constant_handles.reader_make_constant_shell(makeString("completelyEnumerableCollection"));
  public static final SubLObject $const60$collectionCompletelyEnumerableVia = constant_handles.reader_make_constant_shell(makeString("collectionCompletelyEnumerableViaBackchain"));
  public static final SubLObject $const61$completelyDecidableCollection = constant_handles.reader_make_constant_shell(makeString("completelyDecidableCollection"));
  public static final SubLObject $const62$backchainRequired = constant_handles.reader_make_constant_shell(makeString("backchainRequired"));
  public static final SubLObject $const63$backchainEncouraged = constant_handles.reader_make_constant_shell(makeString("backchainEncouraged"));
  public static final SubLObject $const64$backchainDiscouraged = constant_handles.reader_make_constant_shell(makeString("backchainDiscouraged"));
  public static final SubLObject $const65$backchainForbidden = constant_handles.reader_make_constant_shell(makeString("backchainForbidden"));
  public static final SubLObject $const66$collectionIsaBackchainRequired = constant_handles.reader_make_constant_shell(makeString("collectionIsaBackchainRequired"));
  public static final SubLObject $const67$collectionGenlsBackchainRequired = constant_handles.reader_make_constant_shell(makeString("collectionGenlsBackchainRequired"));
  public static final SubLObject $const68$collectionBackchainRequired = constant_handles.reader_make_constant_shell(makeString("collectionBackchainRequired"));
  public static final SubLObject $const69$collectionIsaBackchainEncouraged = constant_handles.reader_make_constant_shell(makeString("collectionIsaBackchainEncouraged"));
  public static final SubLObject $const70$collectionGenlsBackchainEncourage = constant_handles.reader_make_constant_shell(makeString("collectionGenlsBackchainEncouraged"));
  public static final SubLObject $const71$collectionBackchainEncouraged = constant_handles.reader_make_constant_shell(makeString("collectionBackchainEncouraged"));
  public static final SubLSymbol $kw72$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym73$_ = makeSymbol("<");
  public static final SubLObject $const74$highlyRelevantTerm = constant_handles.reader_make_constant_shell(makeString("highlyRelevantTerm"));
  public static final SubLObject $const75$irrelevantTerm = constant_handles.reader_make_constant_shell(makeString("irrelevantTerm"));
  public static final SubLObject $const76$skolemizeForward = constant_handles.reader_make_constant_shell(makeString("skolemizeForward"));
  public static final SubLObject $const77$forwardReificationRule = constant_handles.reader_make_constant_shell(makeString("forwardReificationRule"));
  public static final SubLObject $const78$argsIsa = constant_handles.reader_make_constant_shell(makeString("argsIsa"));
  public static final SubLSymbol $sym79$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLObject $const80$argsQuotedIsa = constant_handles.reader_make_constant_shell(makeString("argsQuotedIsa"));
  public static final SubLObject $const81$argAndRestIsa = constant_handles.reader_make_constant_shell(makeString("argAndRestIsa"));
  public static final SubLObject $const82$argAndRestQuotedIsa = constant_handles.reader_make_constant_shell(makeString("argAndRestQuotedIsa"));
  public static final SubLSymbol $sym83$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym84$ARGN_ISA = makeSymbol("ARGN-ISA");
  public static final SubLList $list85 = list(makeSymbol("RELATION"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str86$Returns_a_list_of_the_local_isa_c = makeString("Returns a list of the local isa constraints applied to the ARGNUMth argument of \nRELATION (#$argsIsa conjoins with #$arg1Isa et al).");
  public static final SubLList $list87 = list(list(makeSymbol("ARGNUM"), makeSymbol("INTEGERP")));
  public static final SubLSymbol $sym88$ARGN_QUOTED_ISA = makeSymbol("ARGN-QUOTED-ISA");
  public static final SubLObject $const89$CycLSentence_Assertible = constant_handles.reader_make_constant_shell(makeString("CycLSentence-Assertible"));
  public static final SubLObject $const90$CycLVariable = constant_handles.reader_make_constant_shell(makeString("CycLVariable"));
  public static final SubLObject $const91$ArgQuotedIsaBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgQuotedIsaBinaryPredicate"));
  public static final SubLObject $const92$ArgQuotedIsaTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgQuotedIsaTernaryPredicate"));
  public static final SubLString $str93$illegal_arg_quoted_isa_pred_encou = makeString("illegal arg-quoted-isa-pred encountered in argn-isa: ~s");
  public static final SubLList $list94 = list(TWO_INTEGER, THREE_INTEGER);
  public static final SubLObject $const95$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));
  public static final SubLObject $const96$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));
  public static final SubLObject $const97$arg3Isa = constant_handles.reader_make_constant_shell(makeString("arg3Isa"));
  public static final SubLObject $const98$arg4Isa = constant_handles.reader_make_constant_shell(makeString("arg4Isa"));
  public static final SubLObject $const99$arg5Isa = constant_handles.reader_make_constant_shell(makeString("arg5Isa"));
  public static final SubLObject $const100$arg6Isa = constant_handles.reader_make_constant_shell(makeString("arg6Isa"));
  public static final SubLString $str101$illegal_index_specification_for_a = makeString("illegal index specification for arg-isa-pred: ~s");
  public static final SubLString $str102$illegal_argnum_specification_for_ = makeString("illegal argnum specification for arg-isa-preds: ~s");
  public static final SubLObject $const103$arg1QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg1QuotedIsa"));
  public static final SubLObject $const104$arg2QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg2QuotedIsa"));
  public static final SubLObject $const105$arg3QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg3QuotedIsa"));
  public static final SubLObject $const106$arg4QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg4QuotedIsa"));
  public static final SubLObject $const107$arg5QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg5QuotedIsa"));
  public static final SubLObject $const108$arg6QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg6QuotedIsa"));
  public static final SubLString $str109$illegal_index_specification_for_a = makeString("illegal index specification for arg-quoted-isa-pred: ~s");
  public static final SubLString $str110$illegal_argnum_specification_for_ = makeString("illegal argnum specification for arg-quoted-isa-preds: ~s");
  public static final SubLString $str111$invalid_argument_to_inverse_argnu = makeString("invalid argument to inverse-argnum: ~s");
  public static final SubLObject $const112$arg1Genl = constant_handles.reader_make_constant_shell(makeString("arg1Genl"));
  public static final SubLObject $const113$arg2Genl = constant_handles.reader_make_constant_shell(makeString("arg2Genl"));
  public static final SubLObject $const114$arg3Genl = constant_handles.reader_make_constant_shell(makeString("arg3Genl"));
  public static final SubLObject $const115$arg4Genl = constant_handles.reader_make_constant_shell(makeString("arg4Genl"));
  public static final SubLObject $const116$arg5Genl = constant_handles.reader_make_constant_shell(makeString("arg5Genl"));
  public static final SubLObject $const117$arg6Genl = constant_handles.reader_make_constant_shell(makeString("arg6Genl"));
  public static final SubLObject $const118$argsGenl = constant_handles.reader_make_constant_shell(makeString("argsGenl"));
  public static final SubLSymbol $sym119$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym120$MIN_ARGN_ISA = makeSymbol("MIN-ARGN-ISA");
  public static final SubLList $list121 = list(makeSymbol("RELATION"), makeSymbol("N"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str122$Returns_a_list_of_the_most_specif = makeString("Returns a list of the most specific local isa-constraints applicable \nto argument N of RELATION.");
  public static final SubLList $list123 = list(list(makeSymbol("RELATION"), makeSymbol("INDEXED-TERM-P")), list(makeSymbol("N"), makeSymbol("INTEGERP")));
  public static final SubLList $list124 = list(list(makeSymbol("LIST"), makeSymbol("INDEXED-TERM-P")));
  public static final SubLObject $const125$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));
  public static final SubLSymbol $sym126$ARGN_ISA_OF = makeSymbol("ARGN-ISA-OF");
  public static final SubLList $list127 = list(makeSymbol("COLLECTION"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str128$Returns_the_relations_for_which_C = makeString("Returns the relations for which COLLECTION is a \nlocal isa constraint applied to argument ARGNUM.");
  public static final SubLObject $const129$ArgGenlBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgGenlBinaryPredicate"));
  public static final SubLObject $const130$ArgGenlTernaryPredicate = constant_handles.reader_make_constant_shell(makeString("ArgGenlTernaryPredicate"));
  public static final SubLString $str131$illegal_arg_genl_pred_encountered = makeString("illegal arg-genl-pred encountered in argn-genl: ~s");
  public static final SubLSymbol $sym132$ARGN_GENL = makeSymbol("ARGN-GENL");
  public static final SubLString $str133$Returns_the_local_genl_constraint = makeString("Returns the local genl constraints applied to the ARGNUMth argument of RELATION.");
  public static final SubLObject $const134$argAndRestGenl = constant_handles.reader_make_constant_shell(makeString("argAndRestGenl"));
  public static final SubLString $str135$illegal_index_specification_for_a = makeString("illegal index specification for arg-genl-pred: ~s");
  public static final SubLString $str136$illegal_argnum_specification_for_ = makeString("illegal argnum specification for arg-genl-preds: ~s");
  public static final SubLSymbol $sym137$MIN_ARGN_GENL = makeSymbol("MIN-ARGN-GENL");
  public static final SubLString $str138$Return_a_list_of_the_most_specifi = makeString("Return a list of the most specific local genl constraints applicable \nto the argument N of RELATION.");
  public static final SubLList $list139 = list(list(makeSymbol("N"), makeSymbol("INTEGERP")));
  public static final SubLList $list140 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));
  public static final SubLObject $const141$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));
  public static final SubLSymbol $sym142$ARGN_GENL_OF = makeSymbol("ARGN-GENL-OF");
  public static final SubLString $str143$Returns_a_list_of_the_predicates_ = makeString("Returns a list of the predicates for which COLLECTION is a \nlocal genl constraint applied to the Nth argument.");
  public static final SubLObject $const144$interArgIsa1_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-2"));
  public static final SubLSymbol $sym145$INTER_ARG_ISA1_2 = makeSymbol("INTER-ARG-ISA1-2");
  public static final SubLList $list146 = list(makeSymbol("RELATION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str147$return_a_list_of_pairs_of___arg1_ = makeString("return a list of pairs of (<arg1-isa> <arg2-isa>) that are \nthe #$interArgIsa1-2 constraints of RELATION");
  public static final SubLList $list148 = list(list(makeSymbol("LIST"), makeSymbol("LISTP")));
  public static final SubLObject $const149$interArgIsa2_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-1"));
  public static final SubLObject $const150$interArgIsa3_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-1"));
  public static final SubLObject $const151$interArgIsa4_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-1"));
  public static final SubLObject $const152$interArgIsa5_1 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-1"));
  public static final SubLObject $const153$interArgIsa3_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-2"));
  public static final SubLObject $const154$interArgIsa4_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-2"));
  public static final SubLObject $const155$interArgIsa5_2 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-2"));
  public static final SubLObject $const156$interArgIsa1_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-3"));
  public static final SubLObject $const157$interArgIsa2_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-3"));
  public static final SubLObject $const158$interArgIsa4_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-3"));
  public static final SubLObject $const159$interArgIsa5_3 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-3"));
  public static final SubLObject $const160$interArgIsa1_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-4"));
  public static final SubLObject $const161$interArgIsa2_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-4"));
  public static final SubLObject $const162$interArgIsa3_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-4"));
  public static final SubLObject $const163$interArgIsa5_4 = constant_handles.reader_make_constant_shell(makeString("interArgIsa5-4"));
  public static final SubLObject $const164$interArgIsa1_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa1-5"));
  public static final SubLObject $const165$interArgIsa2_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa2-5"));
  public static final SubLObject $const166$interArgIsa3_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa3-5"));
  public static final SubLObject $const167$interArgIsa4_5 = constant_handles.reader_make_constant_shell(makeString("interArgIsa4-5"));
  public static final SubLList $list168 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa2-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-1")));
  public static final SubLList $list169 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa1-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-2")));
  public static final SubLList $list170 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa1-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa2-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-3")));
  public static final SubLList $list171 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa1-4")), constant_handles.reader_make_constant_shell(makeString("interArgIsa2-4")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-4")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-4")));
  public static final SubLList $list172 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa1-5")), constant_handles.reader_make_constant_shell(makeString("interArgIsa2-5")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-5")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-5")));
  public static final SubLList $list173 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa1-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa1-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa1-4")), constant_handles.reader_make_constant_shell(makeString("interArgIsa1-5")));
  public static final SubLList $list174 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa2-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa2-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa2-4")), constant_handles.reader_make_constant_shell(makeString("interArgIsa2-5")));
  public static final SubLList $list175 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa3-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-4")), constant_handles.reader_make_constant_shell(makeString("interArgIsa3-5")));
  public static final SubLList $list176 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa4-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa4-5")));
  public static final SubLList $list177 = list(constant_handles.reader_make_constant_shell(makeString("interArgIsa5-1")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-2")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-3")), constant_handles.reader_make_constant_shell(makeString("interArgIsa5-4")));
  public static final SubLObject $const178$defnIff = constant_handles.reader_make_constant_shell(makeString("defnIff"));
  public static final SubLObject $const179$defnSufficient = constant_handles.reader_make_constant_shell(makeString("defnSufficient"));
  public static final SubLObject $const180$defnNecessary = constant_handles.reader_make_constant_shell(makeString("defnNecessary"));
  public static final SubLObject $const181$quotedDefnIff = constant_handles.reader_make_constant_shell(makeString("quotedDefnIff"));
  public static final SubLObject $const182$quotedDefnSufficient = constant_handles.reader_make_constant_shell(makeString("quotedDefnSufficient"));
  public static final SubLObject $const183$quotedDefnNecessary = constant_handles.reader_make_constant_shell(makeString("quotedDefnNecessary"));
  public static final SubLSymbol $sym184$DEFINING_DEFNS = makeSymbol("DEFINING-DEFNS");
  public static final SubLList $list185 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str186$Return_a_list_of_the_local_defini = makeString("Return a list of the local defining (necessary and sufficient definitions) of collection COL.");
  public static final SubLSymbol $sym187$NECESSARY_DEFNS = makeSymbol("NECESSARY-DEFNS");
  public static final SubLString $str188$Return_a_list_of_the_local_necess = makeString("Return a list of the local necessary definitions of collection COL.");
  public static final SubLSymbol $sym189$SUFFICIENT_DEFNS = makeSymbol("SUFFICIENT-DEFNS");
  public static final SubLString $str190$Return_a_list_of_the_local_suffic = makeString("Return a list of the local sufficient definitions of collection COL.");
  public static final SubLSymbol $sym191$ALL_SUFFICIENT_DEFNS = makeSymbol("ALL-SUFFICIENT-DEFNS");
  public static final SubLString $str192$Return_a_list_of_all_sufficient_d = makeString("Return a list of all sufficient definitions of collection COL.");
  public static final SubLObject $const193$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLObject $const194$resultIsaArg = constant_handles.reader_make_constant_shell(makeString("resultIsaArg"));
  public static final SubLObject $const195$resultIsaArgIsa = constant_handles.reader_make_constant_shell(makeString("resultIsaArgIsa"));
  public static final SubLObject $const196$closedUnder = constant_handles.reader_make_constant_shell(makeString("closedUnder"));
  public static final SubLObject $const197$FormulaArgFn = constant_handles.reader_make_constant_shell(makeString("FormulaArgFn"));
  public static final SubLObject $const198$FunctionToArg = constant_handles.reader_make_constant_shell(makeString("FunctionToArg"));
  public static final SubLSymbol $sym199$PRED_U_V_HOLDS_IN_RELEVANT_MTS = makeSymbol("PRED-U-V-HOLDS-IN-RELEVANT-MTS");
  public static final SubLObject $const200$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));
  public static final SubLSymbol $sym201$MAPPING_FUNCALL_ARG = makeSymbol("MAPPING-FUNCALL-ARG");
  public static final SubLObject $const202$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell(makeString("evaluationResultQuotedIsa"));
  public static final SubLObject $const203$resultQuotedIsa = constant_handles.reader_make_constant_shell(makeString("resultQuotedIsa"));
  public static final SubLObject $const204$resultGenl = constant_handles.reader_make_constant_shell(makeString("resultGenl"));
  public static final SubLObject $const205$resultGenlArg = constant_handles.reader_make_constant_shell(makeString("resultGenlArg"));
  public static final SubLSymbol $sym206$RESULT_ISA = makeSymbol("RESULT-ISA");
  public static final SubLList $list207 = list(makeSymbol("FUNCTOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str208$Return_a_list_of_the_collections_ = makeString("Return a list of the collections that include as instances \nthe results of non-predicate function constant FUNCTOR.");
  public static final SubLObject $const209$interArgResultIsa = constant_handles.reader_make_constant_shell(makeString("interArgResultIsa"));
  public static final SubLList $list210 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);
  public static final SubLObject $const211$interArgResultIsaReln = constant_handles.reader_make_constant_shell(makeString("interArgResultIsaReln"));
  public static final SubLList $list212 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);
  public static final SubLList $list213 = list(makeSymbol("ARGNUM"), makeSymbol("REL"), makeSymbol("NAT-TERM-ARG"), makeSymbol("COL-ARG"));
  public static final SubLSymbol $sym214$PRED_ARG_VALUES_IN_RELEVANT_MTS = makeSymbol("PRED-ARG-VALUES-IN-RELEVANT-MTS");
  public static final SubLSymbol $sym215$EVALUATION_RESULT_QUOTED_ISA = makeSymbol("EVALUATION-RESULT-QUOTED-ISA");
  public static final SubLString $str216$return_the_collections_that_inclu = makeString("return the collections that include as quoted instances the evaluation results of non-predicate function constant FUNCTOR.");
  public static final SubLSymbol $sym217$RESULT_QUOTED_ISA = makeSymbol("RESULT-QUOTED-ISA");
  public static final SubLString $str218$return_the_collections_that_inclu = makeString("return the collections that include as quoted instances the results of non-predicate function constant FUNCTOR.");
  public static final SubLObject $const219$interArgResultGenl = constant_handles.reader_make_constant_shell(makeString("interArgResultGenl"));
  public static final SubLObject $const220$interArgResultGenlReln = constant_handles.reader_make_constant_shell(makeString("interArgResultGenlReln"));
  public static final SubLObject $const221$arg1Format = constant_handles.reader_make_constant_shell(makeString("arg1Format"));
  public static final SubLObject $const222$arg2Format = constant_handles.reader_make_constant_shell(makeString("arg2Format"));
  public static final SubLObject $const223$arg3Format = constant_handles.reader_make_constant_shell(makeString("arg3Format"));
  public static final SubLObject $const224$arg4Format = constant_handles.reader_make_constant_shell(makeString("arg4Format"));
  public static final SubLObject $const225$arg5Format = constant_handles.reader_make_constant_shell(makeString("arg5Format"));
  public static final SubLObject $const226$arg6Format = constant_handles.reader_make_constant_shell(makeString("arg6Format"));
  public static final SubLString $str227$illegal_arg_specification_for_arg = makeString("illegal arg specification for argn-format-pred: ~s");
  public static final SubLObject $const228$SingleEntry = constant_handles.reader_make_constant_shell(makeString("SingleEntry"));
  public static final SubLObject $const229$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("singleEntryFormatInArgs"));
  public static final SubLList $list230 = list(ONE_INTEGER, TWO_INTEGER);
  public static final SubLObject $const231$interArgFormat1_2 = constant_handles.reader_make_constant_shell(makeString("interArgFormat1-2"));
  public static final SubLObject $const232$interArgFormat2_1 = constant_handles.reader_make_constant_shell(makeString("interArgFormat2-1"));
  public static final SubLList $list233 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat2-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-1")));
  public static final SubLList $list234 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat1-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-2")));
  public static final SubLList $list235 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat1-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat2-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-3")));
  public static final SubLList $list236 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat1-4")), constant_handles.reader_make_constant_shell(makeString("interArgFormat2-4")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-4")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-4")));
  public static final SubLList $list237 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat1-5")), constant_handles.reader_make_constant_shell(makeString("interArgFormat2-5")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-5")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-5")));
  public static final SubLList $list238 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat1-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat1-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat1-4")), constant_handles.reader_make_constant_shell(makeString("interArgFormat1-5")));
  public static final SubLList $list239 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat2-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat2-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat2-4")), constant_handles.reader_make_constant_shell(makeString("interArgFormat2-5")));
  public static final SubLList $list240 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat3-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-4")), constant_handles.reader_make_constant_shell(makeString("interArgFormat3-5")));
  public static final SubLList $list241 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat4-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat4-5")));
  public static final SubLList $list242 = list(constant_handles.reader_make_constant_shell(makeString("interArgFormat5-1")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-2")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-3")), constant_handles.reader_make_constant_shell(makeString("interArgFormat5-4")));
  public static final SubLObject $const243$requiredArg1Pred = constant_handles.reader_make_constant_shell(makeString("requiredArg1Pred"));
  public static final SubLObject $const244$requiredArg2Pred = constant_handles.reader_make_constant_shell(makeString("requiredArg2Pred"));
  public static final SubLString $str245$illegal_required_pred_for_require = makeString("illegal required-pred for required-pred-arg: ~s");
  public static final SubLString $str246$illegal_arg_number_for_required_p = makeString("illegal arg number for required-pred-arg: ~s");
  public static final SubLList $list247 = list(constant_handles.reader_make_constant_shell(makeString("requiredArg1Pred")));
  public static final SubLList $list248 = list(constant_handles.reader_make_constant_shell(makeString("requiredArg2Pred")));
  public static final SubLList $list249 = list(constant_handles.reader_make_constant_shell(makeString("relationAll")), constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsCount")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsMany")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsMax")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsMin")), constant_handles.reader_make_constant_shell(makeString("relationAllInstance")));
  public static final SubLList $list250 = list(constant_handles.reader_make_constant_shell(makeString("relationExistsAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsCountAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsMaxAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsMinAll")), constant_handles.reader_make_constant_shell(makeString("relationInstanceAll")));
  public static final SubLList $list251 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("relationExistsAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsAllMany")), constant_handles.reader_make_constant_shell(makeString("relationExistsCountAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsCountInstance")), constant_handles.reader_make_constant_shell(makeString("relationExistsExists")), constant_handles.reader_make_constant_shell(makeString("relationExistsInstance")), constant_handles.reader_make_constant_shell(makeString("relationExistsMaxAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsMaxInstance")), constant_handles.reader_make_constant_shell(makeString("relationExistsMinAll")), constant_handles.reader_make_constant_shell(makeString("relationExistsMinInstance"))});
  public static final SubLList $list252 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("relationAllExists")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsCount")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsMany")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsMax")), constant_handles.reader_make_constant_shell(makeString("relationAllExistsMin")), constant_handles.reader_make_constant_shell(makeString("relationExistsExists")), constant_handles.reader_make_constant_shell(makeString("relationInstanceExists")), constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsCount")), constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsMany")), constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsMax")), constant_handles.reader_make_constant_shell(makeString("relationInstanceExistsMin"))});
  public static final SubLSymbol $sym253$MTS_OF_PREDICATE_TYPE_INT = makeSymbol("MTS-OF-PREDICATE-TYPE-INT");
  public static final SubLObject $const254$ArgTypePredicate = constant_handles.reader_make_constant_shell(makeString("ArgTypePredicate"));
  public static final SubLObject $const255$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLObject $const256$fanOutArg = constant_handles.reader_make_constant_shell(makeString("fanOutArg"));
  public static final SubLSymbol $kw257$SUPERIOR_ = makeKeyword("SUPERIOR?");
  public static final SubLObject $const258$coExtensional = constant_handles.reader_make_constant_shell(makeString("coExtensional"));
  public static final SubLObject $const259$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));
  public static final SubLSymbol $sym260$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLObject $const261$myReviewer = constant_handles.reader_make_constant_shell(makeString("myReviewer"));
  public static final SubLSymbol $sym262$REVIEWER = makeSymbol("REVIEWER");
  public static final SubLList $list263 = list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"))));
  public static final SubLString $str264$Identify_the_cyclist_who_reviewed = makeString("Identify the cyclist who reviewed FORT.");
  public static final SubLList $list265 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));
  public static final SubLList $list266 = list(makeSymbol("FORT-P"));
  public static final SubLObject $const267$comment = constant_handles.reader_make_constant_shell(makeString("comment"));
  public static final SubLSymbol $sym268$COMMENT = makeSymbol("COMMENT");
  public static final SubLList $list269 = list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str270$Return_the_comment_string_for_FOR = makeString("Return the comment string for FORT.");
  public static final SubLList $list271 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));
  public static final SubLList $list272 = list(makeSymbol("STRINGP"));
  public static final SubLSymbol $sym273$COMMENT_IF_FORT = makeSymbol("COMMENT-IF-FORT");
  public static final SubLSymbol $sym274$CYCLIST_NOTES = makeSymbol("CYCLIST-NOTES");
  public static final SubLObject $const275$cyclistNotes = constant_handles.reader_make_constant_shell(makeString("cyclistNotes"));
  public static final SubLSymbol $sym276$INDEX_ARG_REFERENCES_IN_STRING_ = makeSymbol("INDEX-ARG-REFERENCES-IN-STRING?");
  public static final SubLSymbol $sym277$GATHER_ARG_OF_SELECTED_GAF_ASSERTION = makeSymbol("GATHER-ARG-OF-SELECTED-GAF-ASSERTION");
  public static final SubLString $str278$mapping_Cyc_assertions = makeString("mapping Cyc assertions");
  public static final SubLSymbol $sym279$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw280$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym281$CONSTANT_NAME = makeSymbol("CONSTANT-NAME");
  public static final SubLSymbol $sym282$STR = makeSymbol("STR");
  public static final SubLSymbol $sym283$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $kw284$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym285$GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");
  public static final SubLString $str286$____in_mt____s_ = makeString("~%~%in mt : ~s.");
  public static final SubLString $str287$__EL____S_ = makeString("~%EL : ~S.");
  public static final SubLSymbol $kw288$ALL = makeKeyword("ALL");
  public static final SubLString $str289$___a___ = makeString("~%~a : ");
  public static final SubLSymbol $sym290$PRINT_ARG = makeSymbol("PRINT-ARG");
  public static final SubLSymbol $sym291$GATHER_FN_OF_ARG = makeSymbol("GATHER-FN-OF-ARG");
  public static final SubLList $list292 = list(constant_handles.reader_make_constant_shell(makeString("comment")), constant_handles.reader_make_constant_shell(makeString("cyclistNotes")));
  public static final SubLString $str293$____missing_doc_preds_ = makeString("~%~%missing doc preds:");
  public static final SubLString $str294$__A = makeString(" ~A");
  public static final SubLString $str295$_____a = makeString("~%  ~a");
  public static final SubLString $str296$_______a = makeString("~%    ~a");
  public static final SubLObject $const297$scopingArg = constant_handles.reader_make_constant_shell(makeString("scopingArg"));
  public static final SubLObject $const298$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym299$ALL_TERM_ASSERTIONS = makeSymbol("ALL-TERM-ASSERTIONS");
  public static final SubLList $list300 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("REMOVE-DUPLICATES?"));
  public static final SubLString $str301$Return_a_list_of_all_the_assertio = makeString("Return a list of all the assertions indexed via the indexed term TERM.");
  public static final SubLList $list302 = list(list(makeSymbol("TERM"), makeSymbol("INDEXED-TERM-P")));
  public static final SubLList $list303 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $sym304$MAPPING_ANSWER_FOUND_ = makeSymbol("MAPPING-ANSWER-FOUND?");
  public static final SubLSymbol $kw305$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $sym306$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym307$GATHER_SOME_ASSERTIONS = makeSymbol("GATHER-SOME-ASSERTIONS");
  public static final SubLSymbol $sym308$ASSERTION_FI_FORMULA = makeSymbol("ASSERTION-FI-FORMULA");
  public static final SubLSymbol $sym309$ASSERTION_MENTIONS_KBA_PRED_ = makeSymbol("ASSERTION-MENTIONS-KBA-PRED?");
  public static final SubLObject $const310$retainTerm = constant_handles.reader_make_constant_shell(makeString("retainTerm"));
  public static final SubLSymbol $sym311$ISA_RELEVANT_ASSERTIONS = makeSymbol("ISA-RELEVANT-ASSERTIONS");
  public static final SubLList $list312 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str313$Return_a_list_of_all__e_g___inher = makeString("Return a list of all (e.g., inheritance) rules relevant to TERM \nby virtue of the collections of which it is an instance.");
  public static final SubLSymbol $kw314$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw315$POS = makeKeyword("POS");
  public static final SubLSymbol $sym316$ISA_RELEVANT_ASSERTIONS_WRT_TYPE = makeSymbol("ISA-RELEVANT-ASSERTIONS-WRT-TYPE");
  public static final SubLList $list317 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str318$Returns_a_list_of_all__e_g___inhe = makeString("Returns a list of all (e.g., inheritance) rules that may apply \nto TERM by virtue of it being an instance of COLLECTION.");
  public static final SubLSymbol $sym319$ASSERTION_FORMULA = makeSymbol("ASSERTION-FORMULA");
  public static final SubLSymbol $sym320$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLList $list321 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("PRED-TYPE"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list322 = list(makeKeyword("MT"), makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $kw323$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw324$MT = makeKeyword("MT");
  public static final SubLSymbol $kw325$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $kw326$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym327$PRED_VAR = makeUninternedSymbol("PRED-VAR");
  public static final SubLSymbol $sym328$DO_ALL_FORT_INSTANCES = makeSymbol("DO-ALL-FORT-INSTANCES");
  public static final SubLSymbol $sym329$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym330$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLSymbol $kw331$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $sym332$DO_GAFS_WRT_PRED_TYPE = makeSymbol("DO-GAFS-WRT-PRED-TYPE");
  public static final SubLString $str333$iterate_over_every_gaf_assertion_ = makeString("iterate over every gaf assertion mentioning TERM and having as a predicate some instance of PRED-TYPE");
  public static final SubLSymbol $kw334$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw335$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw336$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym337$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw338$ERROR = makeKeyword("ERROR");
  public static final SubLString $str339$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym340$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw341$CERROR = makeKeyword("CERROR");
  public static final SubLString $str342$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw343$WARN = makeKeyword("WARN");
  public static final SubLString $str344$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str345$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list346 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str347$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym348$GATHER_RELATION_TYPES = makeSymbol("GATHER-RELATION-TYPES");
  public static final SubLObject $const349$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));
  public static final SubLSymbol $sym350$GATHER_RELATION_TYPES_SP = makeSymbol("GATHER-RELATION-TYPES-SP");
  public static final SubLObject $const351$definingMt = constant_handles.reader_make_constant_shell(makeString("definingMt"));
  public static final SubLObject $const352$notAssertible = constant_handles.reader_make_constant_shell(makeString("notAssertible"));
  public static final SubLObject $const353$notAssertibleCollection = constant_handles.reader_make_constant_shell(makeString("notAssertibleCollection"));
  public static final SubLObject $const354$notAssertibleMt = constant_handles.reader_make_constant_shell(makeString("notAssertibleMt"));
  public static final SubLObject $const355$IndexicalConcept = constant_handles.reader_make_constant_shell(makeString("IndexicalConcept"));
  public static final SubLList $list356 = list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")));
  public static final SubLObject $const357$IndeterminateTermDenotingFunction = constant_handles.reader_make_constant_shell(makeString("IndeterminateTermDenotingFunction"));
  public static final SubLObject $const358$IndeterminateTerm = constant_handles.reader_make_constant_shell(makeString("IndeterminateTerm"));
  public static final SubLObject $const359$NonSkolemIndeterminateTerm = constant_handles.reader_make_constant_shell(makeString("NonSkolemIndeterminateTerm"));
  public static final SubLObject $const360$nonAbducibleRule = constant_handles.reader_make_constant_shell(makeString("nonAbducibleRule"));
  public static final SubLObject $const361$TermExemptFromUniqueNamesAssumpti = constant_handles.reader_make_constant_shell(makeString("TermExemptFromUniqueNamesAssumption"));
  public static final SubLString $str362$_cyc_com = makeString("@cyc.com");
  public static final SubLString $str363$Can_t_get_the_email_address_of_a_ = makeString("Can't get the email address of a non-fort: ~s");
  public static final SubLObject $const364$preferredEMailAddressText = constant_handles.reader_make_constant_shell(makeString("preferredEMailAddressText"));
  public static final SubLObject $const365$localEMailAddressText = constant_handles.reader_make_constant_shell(makeString("localEMailAddressText"));
  public static final SubLSymbol $sym366$GUESS_THE_CYCLIST_FROM_USER_NAME = makeSymbol("GUESS-THE-CYCLIST-FROM-USER-NAME");
  public static final SubLObject $const367$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));
  public static final SubLObject $const368$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLList $list369 = list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?CYCLIST"), constant_handles.reader_make_constant_shell(makeString("HumanCyclist")));
  public static final SubLSymbol $sym370$_CYCLIST = makeSymbol("?CYCLIST");
  public static final SubLList $list371 = list(new SubLObject[] {makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), makeKeyword("JOIN")), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?CYCLIST"))});
  public static final SubLSymbol $sym372$_GUESS_THE_CYCLIST_FROM_USER_NAME_CACHING_STATE_ = makeSymbol("*GUESS-THE-CYCLIST-FROM-USER-NAME-CACHING-STATE*");
  public static final SubLInteger $int373$64 = makeInteger(64);
  public static final SubLSymbol $sym374$CLEAR_GUESS_THE_CYCLIST_FROM_USER_NAME = makeSymbol("CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME");
  public static final SubLSymbol $kw375$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym376$POSSIBLY_UPDATE_MOST_SPECIALIZED_FORT = makeSymbol("POSSIBLY-UPDATE-MOST-SPECIALIZED-FORT");

  //// Initializers

  public void declareFunctions() {
    declare_kb_accessors_file();
  }

  public void initializeVariables() {
    init_kb_accessors_file();
  }

  public void runTopLevelForms() {
    setup_kb_accessors_file();
  }

}
