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
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_admitted;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_routines;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.equals;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_gp_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.negation_predicate;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transitivity;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.verbosifier;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_macros;
//dm import com.cyc.cycjava_1.cycl.wff_utilities;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class arg_type extends SubLTranslatedFile {

  //// Constructor

  private arg_type() {}
  public static final SubLFile me = new arg_type();
  public static final String myName = "com.cyc.cycjava_1.cycl.arg_type";

  //// Definitions

  @SubL(source = "cycl/arg-type.lisp", position = 1317) 
  public static final SubLObject formula_args_ok_wrt_typeP(SubLObject formula, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != el_utilities.mt_designating_literalP(formula))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23217");
    } else {
      return formula_args_ok_wrt_type_intP(formula, mt);
    }
  }

  /** Returns the variables that are not allowed to occur as sequence variables within RELATION.
   @owner Pace */
  @SubL(source = "cycl/arg-type.lisp", position = 2948) 
  public static final SubLObject seqvars_inhibited_by_relation_expression(SubLObject relation) {
    if (((NIL != el_utilities.scoping_relation_expressionP(relation))
         && ($const0$forAll != cycl_utilities.formula_operator(relation))
         && ($const1$thereExists != cycl_utilities.formula_operator(relation)))) {
      return el_utilities.scoped_vars(relation, UNPROVIDED);
    } else {
      return NIL;
    }
  }

  /** Updates the dynamic variable stack of variables that are currently not allowed to appear as sequence variables.
   @owner Pace */
  @SubL(source = "cycl/arg-type.lisp", position = 3351) 
  public static final SubLObject new_inhibited_seqvars(SubLObject relation) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ConsesLow.append(czer_vars.$variables_that_cannot_be_sequence_variables$.getDynamicValue(thread), seqvars_inhibited_by_relation_expression(relation));
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 3804) 
  public static final SubLObject formula_args_ok_wrt_type_intP(SubLObject formula, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        SubLObject seqvar = el_utilities.sequence_var(formula, UNPROVIDED);
        SubLObject okP = T;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$at_argnum$.currentBinding(thread);
          try {
            at_vars.$fag_search_limit$.bind(at_vars.$at_gaf_search_limit$.getDynamicValue(thread), thread);
            at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
            {
              SubLObject groundP = Types.sublisp_null(el_utilities.sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED));
              {
                SubLObject _prev_bind_0_1 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                SubLObject _prev_bind_1_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                SubLObject _prev_bind_2 = at_vars.$at_formula$.currentBinding(thread);
                SubLObject _prev_bind_3 = at_vars.$at_reln$.currentBinding(thread);
                SubLObject _prev_bind_4 = czer_vars.$variables_that_cannot_be_sequence_variables$.currentBinding(thread);
                try {
                  at_vars.$at_check_arg_formatP$.bind(((NIL != at_vars.$at_check_arg_formatP$.getDynamicValue(thread)) ? ((SubLObject) (((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                            || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))
                            || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))
                            || (NIL != czer_utilities.within_negationP())) ? ((SubLObject) NIL) : groundP)) : NIL), thread);
                  at_vars.$at_check_relator_constraintsP$.bind(((NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread)) ? ((SubLObject) (((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                            || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))
                            || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))
                            || (NIL != czer_utilities.within_negationP())) ? ((SubLObject) NIL) : groundP)) : NIL), thread);
                  at_vars.$at_formula$.bind(formula, thread);
                  at_vars.$at_reln$.bind(cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_arg0(formula)), thread);
                  czer_vars.$variables_that_cannot_be_sequence_variables$.bind(new_inhibited_seqvars(formula), thread);
                  if ((NIL != subl_promotions.memberP(seqvar, czer_vars.$variables_that_cannot_be_sequence_variables$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8022");
                    okP = NIL;
                  }
                  if ((NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread)))) {
                    okP = makeBoolean(((NIL != defining_mts_okP(at_vars.$at_reln$.getDynamicValue(thread), mt))
                           && (NIL != relator_constraints_okP(formula, UNPROVIDED))
                           && (NIL != okP)));
                    doneP = at_utilities.at_finishedP(makeBoolean((NIL == okP)));
                    {
                      SubLObject _prev_bind_0_3 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
                      try {
                        czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
                        if ((NIL == doneP)) {
                          {
                            SubLObject csome_list_var = args;
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); (!(((NIL != doneP)
                                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {
                              at_vars.$at_argnum$.setDynamicValue(Numbers.add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                              {
                                SubLObject _prev_bind_0_4 = czer_vars.$within_negationP$.currentBinding(thread);
                                SubLObject _prev_bind_1_5 = at_vars.$within_functionP$.currentBinding(thread);
                                SubLObject _prev_bind_2_6 = at_vars.$within_predicateP$.currentBinding(thread);
                                SubLObject _prev_bind_3_7 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                SubLObject _prev_bind_4_8 = wff_utilities.$check_arityP$.currentBinding(thread);
                                SubLObject _prev_bind_5 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_6 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
                                SubLObject _prev_bind_7 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                                SubLObject _prev_bind_8 = at_vars.$within_decontextualizedP$.currentBinding(thread);
                                try {
                                  czer_vars.$within_negationP$.bind(at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                  at_vars.$within_functionP$.bind(at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
                                  at_vars.$within_predicateP$.bind(at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
                                  at_vars.$within_disjunctionP$.bind(at_within_disjunctP(formula, at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                  wff_utilities.$check_arityP$.bind(wff.check_arityP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                  at_vars.$at_check_arg_typesP$.bind(at_check_arg_typesP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt), thread);
                                  at_vars.$at_check_defining_mtsP$.bind(at_check_defining_mtsP(formula, at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                  at_vars.$appraising_disjunctP$.bind(appraising_disjunctP(formula, mt), thread);
                                  at_vars.$within_decontextualizedP$.bind(at_within_decontextualizedP(formula), thread);
                                  okP = makeBoolean(((NIL != relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), arg, at_vars.$at_argnum$.getDynamicValue(thread), at_utilities.arg_type_mt(at_vars.$at_reln$.getDynamicValue(thread), args, at_vars.$at_argnum$.getDynamicValue(thread), mt)))
                                         && (NIL != okP)));
                                } finally {
                                  at_vars.$within_decontextualizedP$.rebind(_prev_bind_8, thread);
                                  at_vars.$appraising_disjunctP$.rebind(_prev_bind_7, thread);
                                  at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_6, thread);
                                  at_vars.$at_check_arg_typesP$.rebind(_prev_bind_5, thread);
                                  wff_utilities.$check_arityP$.rebind(_prev_bind_4_8, thread);
                                  at_vars.$within_disjunctionP$.rebind(_prev_bind_3_7, thread);
                                  at_vars.$within_predicateP$.rebind(_prev_bind_2_6, thread);
                                  at_vars.$within_functionP$.rebind(_prev_bind_1_5, thread);
                                  czer_vars.$within_negationP$.rebind(_prev_bind_0_4, thread);
                                }
                              }
                              doneP = at_utilities.at_finishedP(makeBoolean((NIL == okP)));
                            }
                          }
                        }
                      } finally {
                        czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_0_3, thread);
                      }
                    }
                  }
                } finally {
                  czer_vars.$variables_that_cannot_be_sequence_variables$.rebind(_prev_bind_4, thread);
                  at_vars.$at_reln$.rebind(_prev_bind_3, thread);
                  at_vars.$at_formula$.rebind(_prev_bind_2, thread);
                  at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_1_2, thread);
                  at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0_1, thread);
                }
              }
            }
          } finally {
            at_vars.$at_argnum$.rebind(_prev_bind_1, thread);
            at_vars.$fag_search_limit$.rebind(_prev_bind_0, thread);
          }
        }
        return okP;
      }
    }
  }

  /** dynamic variable to work around the lack of 'ignore-this' arguments to cached functions */
  @SubL(source = "cycl/arg-type.lisp", position = 6533) 
  private static SubLSymbol $relation_arg_ok_argnum$ = null;

  @SubL(source = "cycl/arg-type.lisp", position = 6676) 
  public static final SubLObject relation_arg_okP(SubLObject relation, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != wff_macros.within_wffP())
           && (NIL != fort_types_interface.logical_connective_p(relation)))) {
        return T;
      }
      {
        SubLObject okP = NIL;
        {
          SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
          SubLObject _prev_bind_1 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
          try {
            wff_vars.$permit_keyword_variablesP$.bind(makeBoolean(((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread))
                  || (NIL != czer_utilities.arg_permits_keyword_variablesP(relation, argnum, mt)))), thread);
            wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean(((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread))
                  || (NIL != czer_utilities.arg_permits_generic_arg_variablesP(relation, argnum, mt)))), thread);
            if ((NIL != variable_wrt_arg_typeP(arg))) {
              okP = variable_arg_okP(relation, arg, argnum, mt);
            }
            if ((NIL == okP)) {
              okP = relation_arg_ok_intP(relation, arg, argnum, mt);
            }
          } finally {
            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_1, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
          }
        }
        return okP;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 8355) 
  private static SubLSymbol $cached_relation_arg_okP_caching_state$ = null;

  public static final class $clear_cached_relation_arg_okP$ZeroArityFunction extends ZeroArityFunction {
    public $clear_cached_relation_arg_okP$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CACHED-RELATION-ARG-OK?")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23203"); }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 9197) 
  public static final SubLObject relation_arg_ok_intP(SubLObject relation, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject okP = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$at_reln$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$at_arg$.currentBinding(thread);
          SubLObject _prev_bind_2 = at_vars.$at_argnum$.currentBinding(thread);
          try {
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(arg, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            okP = defining_mts_okP(arg, mt);
            if ((NIL != at_utilities.at_finishedP(makeBoolean((NIL == okP))))) {
            } else if ((NIL != tou_wrt_arg_typeP(arg))) {
              okP = makeBoolean(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23239"))
                     && (NIL != okP)));
            } else if ((NIL != weak_fort_wrt_arg_typeP(arg))) {
              okP = makeBoolean(((NIL != weak_fort_arg_okP(relation, arg, argnum, mt))
                     && (NIL != okP)));
            } else if ((NIL != nat_function_wrt_arg_typeP(arg))) {
              okP = makeBoolean(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23219"))
                     && (NIL != okP)));
            } else if ((NIL != nat_argument_wrt_arg_typeP(arg))) {
              okP = makeBoolean(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23218"))
                     && (NIL != okP)));
            } else if ((NIL != naut_wrt_arg_typeP(arg, mt))) {
              okP = makeBoolean(((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23220"))
                     && (NIL != okP)));
            } else if ((NIL != strong_fort_wrt_arg_typeP(arg, UNPROVIDED))) {
              okP = makeBoolean(((NIL != strong_fort_arg_okP(relation, arg, argnum, mt))
                     && (NIL != okP)));
            } else {
              okP = makeBoolean(((NIL != opaque_arg_okP(relation, arg, argnum, mt))
                     && (NIL != okP)));
            }
          } finally {
            at_vars.$at_argnum$.rebind(_prev_bind_2, thread);
            at_vars.$at_arg$.rebind(_prev_bind_1, thread);
            at_vars.$at_reln$.rebind(_prev_bind_0, thread);
          }
        }
        return okP;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 10278) 
  public static final SubLObject at_within_negationP(SubLObject formula_arg0, SubLObject arg) {
    return (((formula_arg0 == $const8$not)
          || ((NIL != at_utilities.implication_opP(formula_arg0))
             && arg.eql(ONE_INTEGER))) ? ((SubLObject) makeBoolean((NIL == czer_utilities.within_negationP()))) : czer_utilities.within_negationP());
  }

  @SubL(source = "cycl/arg-type.lisp", position = 10529) 
  public static final SubLObject at_within_predicateP(SubLObject formula_arg0) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != at_vars.$within_predicateP$.getDynamicValue(thread))
            || (NIL != el_utilities.predicate_specP(formula_arg0, UNPROVIDED))));
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 10688) 
  public static final SubLObject at_within_functionP(SubLObject formula_arg0) {
    if ((formula_arg0 == UNPROVIDED)) {
      formula_arg0 = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != at_vars.$within_functionP$.getDynamicValue(thread))
            || (NIL != fort_types_interface.functorP(formula_arg0))));
    }
  }

  /** @return booleanp; t iff arg-type analysis should in fact impose type checks on args of nats */
  @SubL(source = "cycl/arg-type.lisp", position = 10848) 
  public static final SubLObject at_check_arg_typesP(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((relation == UNPROVIDED)) {
      relation = NIL;
    }
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != at_vars.$at_check_arg_typesP$.getDynamicValue(thread))
             && ((NIL == czer_utilities.expression_argP(relation, argnum, mt))
              || (NIL != czer_utilities.assertable_formula_argP(relation, argnum, mt)))));
    }
  }

  /** @return booleanp; t iff defining-mt should be applied to arg ARGNUM of relation RELATION */
  @SubL(source = "cycl/arg-type.lisp", position = 11253) 
  public static final SubLObject at_check_defining_mtsP(SubLObject formula, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != at_vars.$at_possibly_check_defining_mtsP$.getDynamicValue(thread))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32208")))) {
        {
          SubLObject relation = cycl_utilities.formula_arg0(formula);
          if ((NIL == forts.fort_p(relation))) {
            return T;
          } else if ((NIL != kb_accessors.quoted_argumentP(relation, argnum))) {
          } else {
            return T;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 11824) 
  public static final SubLObject appraising_disjunctP(SubLObject formula, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$relax_arg_constraints_for_disjunctionsP$.getDynamicValue(thread))) {
        if ((NIL == czer_utilities.reifiable_function_termP(formula, mt))) {
          return makeBoolean(((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                || (NIL != czer_utilities.within_disjunctionP())));
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 12143) 
  public static final SubLObject at_within_disjunctP(SubLObject formula, SubLObject argnum) {
    return makeBoolean(((NIL != czer_utilities.within_disjunctionP())
          || ((NIL != el_utilities.formula_arityGE(formula, TWO_INTEGER, UNPROVIDED))
             && (NIL != ((NIL != czer_utilities.within_negationP()) ? ((SubLObject) makeBoolean(((NIL != el_utilities.el_conjunction_p(formula))
                      || ((NIL != el_utilities.el_implication_p(formula))
                         && argnum.eql(ONE_INTEGER))))) : makeBoolean(((NIL != el_utilities.el_disjunction_p(formula))
                    || (NIL != el_utilities.el_implication_p(formula))
                    || (NIL != el_utilities.holds_in_litP(formula))
                    || (NIL != el_utilities.el_exception_p(formula)))))))));
  }

  @SubL(source = "cycl/arg-type.lisp", position = 12783) 
  public static final SubLObject at_within_decontextualizedP(SubLObject formula) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != at_vars.$within_decontextualizedP$.getDynamicValue(thread))
            || (NIL != kb_accessors.decontextualized_literalP(formula))));
    }
  }

  /** Returns t iff <arg> satisfies arg-types as a variable.
   Variables are assumed to satisfy each local arg-type.
   Nats that reference variables are considered variables
   wrt (i.e., are assumed to satisfy) applicable arg-types 
   but each of their args must be ok */
  @SubL(source = "cycl/arg-type.lisp", position = 12922) 
  public static final SubLObject variable_arg_okP(SubLObject relation, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if (relation.eql($const9$termOfUnit)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23240");
    } else if (((NIL != term.first_order_nautP(arg))
         && (NIL == term.unreified_skolem_termP(arg)))) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23221"))) {
        return T;
      }
    } else {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/arg-type.lisp", position = 13558) 
  public static final SubLObject weak_fort_arg_okP(SubLObject relation, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return weak_fort_types_okP(relation, arg, argnum, mt);
  }

  /** Returns t iff <arg> satisfies the stronger arg-types as a fort.
   Adopts negation-as-failure while establishing <arg> is 
   an instance of every applicable arg-type. */
  @SubL(source = "cycl/arg-type.lisp", position = 16312) 
  public static final SubLObject strong_fort_arg_okP(SubLObject relation, SubLObject arg, SubLObject argnum, SubLObject mt) {
    return strong_fort_arg_types_okP(relation, arg, argnum, mt);
  }

  /** Returns t iff <arg> satisfies arg-types as an opaque arg.
   Opaque args must satisfy defns of each applicable arg-type.
   Adopts negation-as-failure while establishing <arg> is 
   an instance of every applicable arg-type. */
  @SubL(source = "cycl/arg-type.lisp", position = 16606) 
  public static final SubLObject opaque_arg_okP(SubLObject relation, SubLObject arg, SubLObject argnum, SubLObject mt) {
    return opaque_arg_types_okP(relation, arg, argnum, mt);
  }

  @SubL(source = "cycl/arg-type.lisp", position = 17898) 
  public static final SubLObject weak_fort_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject isa_okP = makeBoolean((NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread)));
        SubLObject quoted_isa_okP = makeBoolean((NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue(thread)));
        SubLObject not_isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread)));
        SubLObject genls_okP = makeBoolean((NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread)));
        SubLObject different_okP = makeBoolean((NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)));
        SubLObject nat = ((NIL != el_utilities.arg_types_prescribe_unreifiedP(reln, argnum)) ? ((SubLObject) NIL) : cycl_utilities.find_closed_naut(arg));
        SubLObject admit_consistent_nartP = makeBoolean(((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread))
             && (NIL != nart_handles.nart_p(arg))));
        if ((NIL != nart_handles.nart_p(nat))) {
          return relation_arg_okP(reln, nat, argnum, mt);
        } else {
          if ((!(((NIL != isa_okP)
                 && (NIL != quoted_isa_okP)
                 && (NIL != genls_okP)
                 && (NIL != different_okP))))) {
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                SubLObject _prev_bind_3 = at_vars.$at_arg_type$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  at_vars.$at_arg_type$.bind($kw12$WEAK_FORT, thread);
                  if ((NIL == isa_okP)) {
                    if (((NIL != admit_consistent_nartP)
                        || (NIL != isa.asserted_isaP(arg, mt)))) {
                      isa_okP = arg_test_okP(reln, arg, argnum, $kw13$NOT_ISA_DISJOINT);
                    } else {
                      {
                        SubLObject _prev_bind_0_9 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
                        SubLObject _prev_bind_1_10 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        SubLObject _prev_bind_2_11 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                          at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
                          at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                          at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                          isa_okP = opaque_arg_types_okP(reln, arg, argnum, mt);
                        } finally {
                          at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_11, thread);
                          at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_10, thread);
                          at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_0_9, thread);
                        }
                      }
                    }
                  }
                  if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP))))) {
                    if ((NIL == quoted_isa_okP)) {
                      if (((NIL != admit_consistent_nartP)
                          || (NIL != isa.asserted_quoted_isaP(arg, mt)))) {
                        quoted_isa_okP = arg_test_okP(reln, arg, argnum, $kw14$NOT_QUOTED_ISA_DISJOINT);
                      } else {
                        {
                          SubLObject _prev_bind_0_12 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
                          SubLObject _prev_bind_1_13 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                          SubLObject _prev_bind_2_14 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                          try {
                            at_vars.$at_check_arg_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            quoted_isa_okP = opaque_arg_types_okP(reln, arg, argnum, mt);
                          } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_14, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_13, thread);
                            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_0_12, thread);
                          }
                        }
                      }
                    }
                  }
                  if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                               && (NIL != quoted_isa_okP)))))))) {
                    if ((NIL == not_isa_okP)) {
                      not_isa_okP = arg_test_okP(reln, arg, argnum, $kw15$NOT_ISA);
                    }
                  }
                  if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                               && (NIL != quoted_isa_okP)
                               && (NIL != not_isa_okP)))))))) {
                    if ((NIL == genls_okP)) {
                      if (((NIL != admit_consistent_nartP)
                          || (NIL != genls.asserted_genlsP(arg, mt)))) {
                        genls_okP = arg_test_okP(reln, arg, argnum, $kw16$NOT_GENLS_DISJOINT);
                      } else {
                        genls_okP = arg_test_okP(reln, arg, argnum, $kw17$GENLS);
                      }
                    }
                  }
                  if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                               && (NIL != quoted_isa_okP)
                               && (NIL != not_isa_okP)
                               && (NIL != genls_okP)))))))) {
                    if ((NIL == different_okP)) {
                      different_okP = arg_test_okP(reln, arg, argnum, $kw18$DIFFERENT);
                    }
                  }
                } finally {
                  at_vars.$at_arg_type$.rebind(_prev_bind_3, thread);
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        }
        return makeBoolean(((NIL != isa_okP)
               && (NIL != quoted_isa_okP)
               && (NIL != not_isa_okP)
               && (NIL != genls_okP)
               && (NIL != different_okP)));
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 26650) 
  public static final SubLObject strong_fort_arg_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = at_vars.$at_reln$.getDynamicValue();
    }
    if ((arg == UNPROVIDED)) {
      arg = at_vars.$at_arg$.getDynamicValue();
    }
    if ((argnum == UNPROVIDED)) {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread)));
        SubLObject quoted_isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread)));
        SubLObject not_isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread)));
        SubLObject genls_okP = makeBoolean((NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread)));
        SubLObject format_okP = makeBoolean((NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread)));
        SubLObject different_okP = makeBoolean((NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)));
        if ((!(((NIL != isa_okP)
               && (NIL != quoted_isa_okP)
               && (NIL != genls_okP)
               && (NIL != format_okP)
               && (NIL != different_okP))))) {
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              SubLObject _prev_bind_3 = at_vars.$at_arg_type$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                at_vars.$at_arg_type$.bind($kw29$STRONG_FORT, thread);
                if ((NIL == isa_okP)) {
                  isa_okP = arg_test_okP(reln, arg, argnum, $kw23$ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP))))) {
                  if ((NIL == quoted_isa_okP)) {
                    quoted_isa_okP = arg_test_okP(reln, arg, argnum, $kw24$QUOTED_ISA);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)))))))) {
                  if ((NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $kw15$NOT_ISA);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)
                             && (NIL != not_isa_okP)))))))) {
                  if ((NIL == genls_okP)) {
                    genls_okP = arg_test_okP(reln, arg, argnum, $kw17$GENLS);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)
                             && (NIL != not_isa_okP)
                             && (NIL != genls_okP)))))))) {
                  if ((NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $kw22$FORMAT);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)
                             && (NIL != not_isa_okP)
                             && (NIL != genls_okP)
                             && (NIL != format_okP)))))))) {
                  if ((NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $kw18$DIFFERENT);
                  }
                }
              } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return makeBoolean(((NIL != isa_okP)
               && (NIL != quoted_isa_okP)
               && (NIL != not_isa_okP)
               && (NIL != genls_okP)
               && (NIL != format_okP)
               && (NIL != different_okP)
               && ((NIL == at_vars.$at_ensure_consistencyP$.getDynamicValue(thread))
                || (NIL != weak_fort_types_okP(reln, arg, argnum, mt)))));
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 28334) 
  public static final SubLObject opaque_arg_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt) {
    if ((reln == UNPROVIDED)) {
      reln = at_vars.$at_reln$.getDynamicValue();
    }
    if ((arg == UNPROVIDED)) {
      arg = at_vars.$at_arg$.getDynamicValue();
    }
    if ((argnum == UNPROVIDED)) {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread)));
        SubLObject quoted_isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread)));
        SubLObject not_isa_okP = makeBoolean((NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread)));
        SubLObject genls_okP = makeBoolean((NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread)));
        SubLObject format_okP = makeBoolean((NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread)));
        SubLObject different_okP = makeBoolean((NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)));
        if ((!(((NIL != isa_okP)
               && (NIL != quoted_isa_okP)
               && (NIL != genls_okP)
               && (NIL != format_okP)
               && (NIL != different_okP))))) {
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              SubLObject _prev_bind_3 = at_vars.$at_arg_type$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                at_vars.$at_arg_type$.bind($kw28$OPAQUE, thread);
                if ((NIL == isa_okP)) {
                  isa_okP = arg_test_okP(reln, arg, argnum, $kw23$ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP))))) {
                  if ((NIL == quoted_isa_okP)) {
                    quoted_isa_okP = arg_test_okP(reln, arg, argnum, $kw24$QUOTED_ISA);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)))))))) {
                  if ((NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $kw15$NOT_ISA);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)
                             && (NIL != not_isa_okP)))))))) {
                  if ((NIL == genls_okP)) {
                    {
                      SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                      {
                        SubLObject _prev_bind_0_34 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        SubLObject _prev_bind_1_35 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                          sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                          {
                            SubLObject _prev_bind_0_36 = at_vars.$at_genls_space$.currentBinding(thread);
                            SubLObject _prev_bind_1_37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                              at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                              genls_okP = arg_test_okP(reln, arg, argnum, $kw17$GENLS);
                            } finally {
                              sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_37, thread);
                              at_vars.$at_genls_space$.rebind(_prev_bind_0_36, thread);
                            }
                          }
                          sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        } finally {
                          sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_35, thread);
                          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_34, thread);
                        }
                      }
                    }
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)
                             && (NIL != not_isa_okP)
                             && (NIL != genls_okP)))))))) {
                  if ((NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $kw22$FORMAT);
                  }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((!(((NIL != isa_okP)
                             && (NIL != quoted_isa_okP)
                             && (NIL != not_isa_okP)
                             && (NIL != genls_okP)
                             && (NIL != format_okP)))))))) {
                  if ((NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $kw18$DIFFERENT);
                  }
                }
              } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return makeBoolean(((NIL != isa_okP)
               && (NIL != quoted_isa_okP)
               && (NIL != not_isa_okP)
               && (NIL != genls_okP)
               && (NIL != format_okP)
               && (NIL != different_okP)));
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 31473) 
  public static final SubLObject arg_test_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = $kw23$ISA;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject not_okP = NIL;
        if ((reln == $const32$Quote)) {
          {
            SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding(thread);
            try {
              cycl_grammar.$within_quote_form$.bind(T, thread);
              if ((!((($kw28$OPAQUE == at_vars.$at_arg_type$.getDynamicValue(thread))
                     && (NIL != at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$.getDynamicValue(thread))
                     && (NIL != wff_vars.validating_expansionP())
                     && (NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4385")))))) {
                {
                  SubLObject _prev_bind_0_55 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    if ((NIL != subl_promotions.memberP(test, $list33, UNPROVIDED, UNPROVIDED))) {
                      if ((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                        not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                      }
                    } else if (((NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread))
                         && test.eql($kw15$NOT_ISA))) {
                      not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                    } else if (((NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))
                         && (NIL != subl_promotions.memberP(test, $list34, UNPROVIDED, UNPROVIDED)))) {
                      not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                    } else if (((NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread))
                         && test.eql($kw22$FORMAT))) {
                      clear_cached_format_okP();
                      not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                    } else if (((NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread))
                         && test.eql($kw18$DIFFERENT))) {
                      not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                    }
                    if ((NIL == at_utilities.at_finishedP(not_okP))) {
                      not_okP = makeBoolean(((NIL != mal_intra_argP(reln, arg, argnum, test))
                            || (NIL != not_okP)));
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                  } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_55, thread);
                  }
                }
              }
            } finally {
              cycl_grammar.$within_quote_form$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          if ((!((($kw28$OPAQUE == at_vars.$at_arg_type$.getDynamicValue(thread))
                 && (NIL != at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$.getDynamicValue(thread))
                 && (NIL != wff_vars.validating_expansionP())
                 && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4386")))))) {
            {
              SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
              try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                if ((NIL != subl_promotions.memberP(test, $list33, UNPROVIDED, UNPROVIDED))) {
                  if ((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))) {
                    not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                  }
                } else if (((NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread))
                     && test.eql($kw15$NOT_ISA))) {
                  not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                } else if (((NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread))
                     && (NIL != subl_promotions.memberP(test, $list34, UNPROVIDED, UNPROVIDED)))) {
                  not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                } else if (((NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread))
                     && test.eql($kw22$FORMAT))) {
                  clear_cached_format_okP();
                  not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                } else if (((NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread))
                     && test.eql($kw18$DIFFERENT))) {
                  not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                }
                if ((NIL == at_utilities.at_finishedP(not_okP))) {
                  not_okP = makeBoolean(((NIL != mal_intra_argP(reln, arg, argnum, test))
                        || (NIL != not_okP)));
                }
                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
              } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return makeBoolean((NIL == not_okP));
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 32757) 
  public static final SubLObject inter_arg_test_failsP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = $kw23$ISA;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ind_argnum = ZERO_INTEGER;
        SubLObject not_okP = NIL;
        SubLObject doneP = NIL;
        if ((NIL == doneP)) {
          {
            SubLObject csome_list_var = cycl_utilities.formula_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
            SubLObject ind_arg = NIL;
            for (ind_arg = csome_list_var.first(); (!(((NIL != doneP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), ind_arg = csome_list_var.first()) {
              ind_argnum = Numbers.add(ind_argnum, ONE_INTEGER);
              if ((argnum != ind_argnum)) {
                not_okP = makeBoolean(((NIL != mal_inter_argP(reln, ind_arg, ind_argnum, arg, argnum, test))
                      || (NIL != not_okP)));
                doneP = at_utilities.at_finishedP(not_okP);
              }
            }
          }
        }
        return not_okP;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 33142) 
  public static final SubLObject mal_intra_argP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject test) {
    {
      SubLObject pcase_var = test;
      if (pcase_var.eql($kw23$ISA)) {
        return at_routines.mal_arg_isaP(reln, arg, argnum);
      } else if (pcase_var.eql($kw24$QUOTED_ISA)) {
        return at_routines.mal_arg_quoted_isaP(reln, arg, argnum);
      } else if (pcase_var.eql($kw17$GENLS)) {
        return at_routines.mal_arg_genlsP(reln, arg, argnum);
      } else if (pcase_var.eql($kw13$NOT_ISA_DISJOINT)) {
        return at_routines.mal_arg_not_isa_disjointP(reln, arg, argnum);
      } else if (pcase_var.eql($kw14$NOT_QUOTED_ISA_DISJOINT)) {
        return at_routines.mal_arg_not_quoted_isa_disjointP(reln, arg, argnum);
      } else if (pcase_var.eql($kw16$NOT_GENLS_DISJOINT)) {
        return at_routines.mal_arg_not_genls_disjointP(reln, arg, argnum);
      } else if (pcase_var.eql($kw22$FORMAT)) {
        return at_routines.mal_arg_formatP(reln, arg, argnum);
      } else if (pcase_var.eql($kw18$DIFFERENT)) {
        return NIL;
      } else {
        el_utilities.el_error(THREE_INTEGER, $str35$invalid_at_test__s_in_mal_intra_a, test, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/arg-type.lisp", position = 34139) 
  public static final SubLObject mal_inter_argP(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum, SubLObject test) {
    {
      SubLObject pcase_var = test;
      if (pcase_var.eql($kw23$ISA)) {
        return at_routines.mal_inter_arg_isaP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
      } else if (pcase_var.eql($kw15$NOT_ISA)) {
        return at_routines.mal_inter_arg_not_isaP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
      } else if (pcase_var.eql($kw13$NOT_ISA_DISJOINT)) {
        return at_routines.mal_inter_arg_not_isa_disjointP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
      } else if (pcase_var.eql($kw17$GENLS)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11255");
      } else if (pcase_var.eql($kw16$NOT_GENLS_DISJOINT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11256");
      } else if (pcase_var.eql($kw22$FORMAT)) {
        return at_routines.mal_inter_arg_formatP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
      } else if (pcase_var.eql($kw18$DIFFERENT)) {
        return makeBoolean((ind_argnum.numG(dep_argnum)
               && (NIL != at_routines.mal_inter_arg_differentP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum))));
      } else {
        el_utilities.el_error(THREE_INTEGER, $str36$invalid_at_test__s_in_mal_inter_a, test, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** @return booleanp; t iff FORT is ok wrt defining-mt constraints */
  @SubL(source = "cycl/arg-type.lisp", position = 35511) 
  public static final SubLObject defining_mts_okP(SubLObject fort, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((!(((NIL != forts.fort_p(fort))
           && (NIL != at_vars.at_check_defining_mts_p()))))) {
      return T;
    } else if ((NIL != wff_macros.within_wffP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23216");
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23205");
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 36519) 
  public static final SubLObject relator_constraints_okP(SubLObject relation, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject relator = cycl_utilities.formula_arg0(relation);
        SubLObject okP = T;
        if ((NIL == at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread))) {
        } else if ((NIL == forts.fort_p(relator))) {
        } else if ((NIL != term.kb_predicateP(relator))) {
          okP = predicate_constraints_okP(relation, mt);
        }
        return okP;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 36860) 
  public static final SubLObject predicate_constraints_okP(SubLObject literal, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject okP = T;
        SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
        SubLObject doneP = NIL;
        if ((NIL == doneP)) {
          {
            SubLObject csome_list_var = at_vars.$at_pred_constraints$.getDynamicValue(thread);
            {
              SubLObject _prev_bind_0 = at_vars.$at_mode$.currentBinding(thread);
              try {
                at_vars.$at_mode$.bind(NIL, thread);
                for (at_vars.$at_mode$.setDynamicValue(csome_list_var.first(), thread); (!(((NIL != doneP)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), at_vars.$at_mode$.setDynamicValue(csome_list_var.first(), thread)) {
                  {
                    SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue(thread);
                    if (pcase_var.eql($kw40$ASYMMETRIC_PREDICATE)) {
                      if ((NIL != kb_accessors.asymmetric_predicateP(predicate))) {
                        {
                          SubLObject _prev_bind_0_56 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                          SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                          try {
                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                            okP = makeBoolean(((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23211"))
                                   && (NIL != okP)));
                          } finally {
                            at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_56, thread);
                          }
                        }
                      }
                    } else if (pcase_var.eql($kw41$ANTI_SYMMETRIC_PREDICATE)) {
                      if ((NIL != kb_accessors.anti_symmetric_predicateP(predicate))) {
                        {
                          SubLObject _prev_bind_0_57 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                          SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                          try {
                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                            okP = makeBoolean(((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23209"))
                                   && (NIL != okP)));
                          } finally {
                            at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_57, thread);
                          }
                        }
                      }
                    } else if (pcase_var.eql($kw42$IRREFLEXIVE_PREDICATE)) {
                      if ((NIL != kb_accessors.irreflexive_predicateP(predicate))) {
                        {
                          SubLObject _prev_bind_0_58 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                          SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                          try {
                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                            okP = makeBoolean(((NIL != gaf_ok_wrt_irreflexive_predP(literal, mt))
                                   && (NIL != okP)));
                          } finally {
                            at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_58, thread);
                          }
                        }
                      }
                    } else if (pcase_var.eql($kw43$ANTI_TRANSITIVE_PREDICATE)) {
                      if ((NIL != kb_accessors.anti_transitive_predicateP(predicate))) {
                        {
                          SubLObject _prev_bind_0_59 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                          SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                          try {
                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                            okP = makeBoolean(((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23210"))
                                   && (NIL != okP)));
                          } finally {
                            at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_59, thread);
                          }
                        }
                      }
                    } else if (pcase_var.eql($kw44$NEGATION_PREDS)) {
                      {
                        SubLObject _prev_bind_0_60 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                        try {
                          at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                          at_vars.$at_predicate_violations$.bind(NIL, thread);
                          okP = makeBoolean(((NIL != gaf_ok_wrt_negation_predsP(literal, mt))
                                 && (NIL != okP)));
                        } finally {
                          at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                          at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_60, thread);
                        }
                      }
                    } else if (pcase_var.eql($kw45$NEGATION_INVERSES)) {
                      {
                        SubLObject _prev_bind_0_61 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                        SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                        try {
                          at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                          at_vars.$at_predicate_violations$.bind(NIL, thread);
                          okP = makeBoolean(((NIL != gaf_ok_wrt_negation_inversesP(literal, mt))
                                 && (NIL != okP)));
                        } finally {
                          at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                          at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_61, thread);
                        }
                      }
                    } else {
                      el_utilities.el_error(THREE_INTEGER, $str46$unknown_predicate_constraint___s, at_vars.$at_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    }
                  }
                  if ((NIL == okP)) {
                    if ((NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                      doneP = T;
                    }
                  }
                }
              } finally {
                at_vars.$at_mode$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return okP;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 41121) 
  public static final SubLObject gaf_ok_wrt_irreflexive_predP(SubLObject gaf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject okP = T;
        SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != equals.equalsP(arg1, arg2, UNPROVIDED, UNPROVIDED))) {
              okP = NIL;
              {
                SubLObject _prev_bind_0_63 = at_vars.$at_pred$.currentBinding(thread);
                try {
                  at_vars.$at_pred$.bind($const47$isa, thread);
                  if ((NIL != at_vars.$at_pred$.getDynamicValue(thread))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7154");
                  }
                } finally {
                  at_vars.$at_pred$.rebind(_prev_bind_0_63, thread);
                }
              }
            }
            if (((NIL != okP)
                || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)))) {
              {
                SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
                if (((NIL != kb_accessors.transitive_predicateP(pred))
                     && (NIL != transitivity.gtm(pred, $kw59$COMPLETES_CYCLE_, arg1, arg2, mt, UNPROVIDED, UNPROVIDED)))) {
                  okP = NIL;
                  if ((NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue(thread))) {
                    at_vars.$at_predicate_violations$.setDynamicValue(transitivity.gtm(pred, $kw60$WHY_COMPLETES_CYCLE_, arg1, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    if ((NIL != at_vars.$at_predicate_violations$.getDynamicValue(thread))) {
                      at_vars.$at_predicate_violations$.setDynamicValue(ConsesLow.nconc(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5082"), at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                    }
                  }
                  {
                    SubLObject _prev_bind_0_64 = at_vars.$at_pred$.currentBinding(thread);
                    try {
                      at_vars.$at_pred$.bind($const47$isa, thread);
                      if ((NIL != at_vars.$at_pred$.getDynamicValue(thread))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7155");
                      }
                    } finally {
                      at_vars.$at_pred$.rebind(_prev_bind_0_64, thread);
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
        return okP;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 48067) 
  public static final SubLObject find_accessible_gaf(SubLObject gaf, SubLObject index, SubLObject mt, SubLObject truth) {
    if ((index == UNPROVIDED)) {
      index = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw49$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject assertion = NIL;
        {
          SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$mapping_answer$.currentBinding(thread);
          try {
            control_vars.$mapping_target$.bind(gaf, thread);
            control_vars.$mapping_answer$.bind(NIL, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_78 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1_79 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                  if ((ZERO_INTEGER == index)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9471");
                  } else if ((NIL != index)) {
                    kb_gp_mapping.gp_map_arg_index($sym69$SELECT_TARGET_GAF, el_utilities.literal_arg(gaf, index, UNPROVIDED), index, el_utilities.literal_predicate(gaf, UNPROVIDED));
                  } else {
                    {
                      SubLObject best_count = kb_indexing.num_best_gaf_lookup_index(gaf, truth, $list50);
                      if (((!(at_vars.$fag_search_limit$.getDynamicValue(thread).isNumber()))
                          || at_vars.$fag_search_limit$.getDynamicValue(thread).numGE(best_count))) {
                        {
                          SubLObject lookup_index = kb_indexing.best_gaf_lookup_index(gaf, truth, $list50);
                          SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
                          SubLObject pcase_var = index_type;
                          if (pcase_var.eql($kw52$PREDICATE_EXTENT)) {
                            {
                              SubLObject predicate = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12758");
                              Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9472");
                            }
                          } else if (pcase_var.eql($kw54$GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                              SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                              SubLObject argnum = thread.secondMultipleValue();
                              SubLObject predicate = thread.thirdMultipleValue();
                              thread.resetMultipleValues();
                              kb_gp_mapping.gp_map_arg_index($sym69$SELECT_TARGET_GAF, v_term, argnum, predicate);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$mt$.rebind(_prev_bind_1_79, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_78, thread);
                }
              }
              assertion = control_vars.$mapping_answer$.getDynamicValue(thread);
            }
          } finally {
            control_vars.$mapping_answer$.rebind(_prev_bind_1, thread);
            control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
          }
        }
        return assertion;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 49686) 
  public static final SubLObject gaf_ok_wrt_negation_predsP(SubLObject gaf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
        SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject violations = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            violations = negation_pred_violations(pred, arg1, arg2);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return Types.sublisp_null(violations);
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 50188) 
  public static final SubLObject negation_pred_violations(SubLObject pred, SubLObject arg1, SubLObject arg2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject doneP = NIL;
        SubLObject violations = NIL;
        SubLObject args = list(arg1, arg2);
        if ((NIL == doneP)) {
          {
            SubLObject csome_list_var = negation_predicate.max_negation_preds(pred, UNPROVIDED);
            SubLObject negation_pred = NIL;
            for (negation_pred = csome_list_var.first(); (!(((NIL != doneP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), negation_pred = csome_list_var.first()) {
              {
                SubLObject assertion = find_accessible_gaf(czer_main.canonicalize_literal_commutative_terms(el_utilities.make_el_literal(negation_pred, args, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL != term.kb_assertionP(assertion))) {
                  {
                    SubLObject _prev_bind_0 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                    try {
                      at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                      at_vars.$at_predicate_violations$.bind(NIL, thread);
                      {
                        SubLObject item_var = assertion;
                        if ((NIL == conses_high.member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                          at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                        }
                        {
                          SubLObject _prev_bind_0_80 = at_vars.$at_pred$.currentBinding(thread);
                          try {
                            at_vars.$at_pred$.bind($const70$negationPreds, thread);
                            if ((NIL != at_vars.$at_pred$.getDynamicValue(thread))) {
                              Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7157");
                            }
                          } finally {
                            at_vars.$at_pred$.rebind(_prev_bind_0_80, thread);
                          }
                        }
                      }
                    } finally {
                      at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                      at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0, thread);
                    }
                  }
                  violations = cons(negation_pred, violations);
                  if ((NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                    doneP = T;
                  }
                }
              }
            }
          }
        }
        return violations;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 50844) 
  public static final SubLObject gaf_ok_wrt_negation_inversesP(SubLObject gaf, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
        SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject violations = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            violations = negation_inverse_violations(pred, arg1, arg2);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return Types.sublisp_null(violations);
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 51275) 
  public static final SubLObject negation_inverse_violations(SubLObject pred, SubLObject arg1, SubLObject arg2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject doneP = NIL;
        SubLObject violations = NIL;
        SubLObject args = list(arg2, arg1);
        if ((NIL == doneP)) {
          {
            SubLObject csome_list_var = negation_predicate.max_negation_inverses(pred, UNPROVIDED);
            SubLObject negation_inverse = NIL;
            for (negation_inverse = csome_list_var.first(); (!(((NIL != doneP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), negation_inverse = csome_list_var.first()) {
              {
                SubLObject assertion = find_accessible_gaf(czer_main.canonicalize_literal_commutative_terms(el_utilities.make_el_literal(negation_inverse, args, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL != term.kb_assertionP(assertion))) {
                  {
                    SubLObject _prev_bind_0 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_predicate_violations$.currentBinding(thread);
                    try {
                      at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                      at_vars.$at_predicate_violations$.bind(NIL, thread);
                      {
                        SubLObject item_var = assertion;
                        if ((NIL == conses_high.member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                          at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                        }
                        {
                          SubLObject _prev_bind_0_81 = at_vars.$at_pred$.currentBinding(thread);
                          try {
                            at_vars.$at_pred$.bind($const71$negationInverse, thread);
                            if ((NIL != at_vars.$at_pred$.getDynamicValue(thread))) {
                              Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7158");
                            }
                          } finally {
                            at_vars.$at_pred$.rebind(_prev_bind_0_81, thread);
                          }
                        }
                      }
                    } finally {
                      at_vars.$at_predicate_violations$.rebind(_prev_bind_1, thread);
                      at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0, thread);
                    }
                  }
                  violations = cons(negation_inverse, violations);
                  if ((NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                    doneP = T;
                  }
                }
              }
            }
          }
        }
        return violations;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 51954) 
  private static SubLSymbol $cached_format_okP_caching_state$ = null;

  @SubL(source = "cycl/arg-type.lisp", position = 51954) 
  public static final SubLObject clear_cached_format_okP() {
    {
      SubLObject cs = $cached_format_okP_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/arg-type.lisp", position = 52119) 
  public static final SubLObject memoized_format_okP_internal(SubLObject format, SubLObject literal, SubLObject argnum, SubLObject mt) {
    return at_format_okP(format, literal, argnum, mt);
  }

  @SubL(source = "cycl/arg-type.lisp", position = 52119) 
  public static final SubLObject memoized_format_okP(SubLObject format, SubLObject literal, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return memoized_format_okP_internal(format, literal, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym74$MEMOIZED_FORMAT_OK_, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym74$MEMOIZED_FORMAT_OK_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym74$MEMOIZED_FORMAT_OK_, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_4(format, literal, argnum, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw7$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (format.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (argnum.equal(cached_args.first())) {
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
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_format_okP_internal(format, literal, argnum, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(format, literal, argnum, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 52302) 
  public static final SubLObject at_format_okP(SubLObject format, SubLObject literal, SubLObject argnum, SubLObject mt) {
    if ((literal == UNPROVIDED)) {
      literal = at_vars.$at_formula$.getDynamicValue();
    }
    if ((argnum == UNPROVIDED)) {
      argnum = at_vars.$at_argnum$.getDynamicValue();
    }
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      SubLObject pcase_var = format;
      if (pcase_var.eql($const75$SingleEntry)) {
        return single_entry_okP(literal, argnum, mt);
      } else if (pcase_var.eql($const76$IntervalEntry)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23213");
      } else if (pcase_var.eql($const77$SetTheFormat)) {
        return set_entry_okP(literal, argnum, mt);
      } else if (pcase_var.eql($const78$singleEntryFormatInArgs)) {
        return single_entry_okP(literal, argnum, mt);
      } else if (pcase_var.eql($const79$intervalEntryFormatInArgs)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23214");
      } else if (pcase_var.eql($const80$openEntryFormatInArgs)) {
        return set_entry_okP(literal, argnum, mt);
      } else if (pcase_var.eql($const81$temporallyIntersectingEntryFormat)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23238");
      } else if (pcase_var.eql($const82$spatiallyIntersectingEntryFormatI)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23236");
      } else if (pcase_var.eql($const83$spatioTemporallyIntersectingEntry)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23237");
      } else {
        el_utilities.el_error(THREE_INTEGER, $str84$unknown_entry_format___s, format, UNPROVIDED, UNPROVIDED);
        return T;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 53396) 
  public static final SubLObject single_entry_okP(SubLObject literal, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != at_vars.$at_check_sefP$.getDynamicValue(thread))) {
        return Types.sublisp_null(sef_violations(literal, argnum, mt));
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 54432) 
  public static final SubLObject sef_violations(SubLObject literal, SubLObject argnum, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject violations = NIL;
        SubLObject find_formula = list_utilities.replace_nth(argnum, variables.find_variable_by_id(ZERO_INTEGER), literal);
        SubLObject arg = cycl_utilities.reify_arg_when_closed_naut(literal, argnum);
        if ((!(((NIL != wff_vars.validating_expansionP())
               && (NIL != unification_utilities.asent_unify(wff_vars.unexpanded_formula(), find_formula, T, UNPROVIDED)))))) {
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
                {
                  SubLObject lookup_index = kb_indexing.best_gaf_lookup_index(find_formula, $kw49$TRUE, $list50);
                  SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
                  SubLObject doneP = NIL;
                  SubLObject catch_var = NIL;
                  try {
                    {
                      SubLObject _prev_bind_0_82 = at_vars.$within_at_mappingP$.currentBinding(thread);
                      try {
                        at_vars.$within_at_mappingP$.bind(T, thread);
                        {
                          SubLObject pcase_var = index_type;
                          if (pcase_var.eql($kw52$PREDICATE_EXTENT)) {
                            {
                              SubLObject predicate = Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12759");
                              if ((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23202"))) {
                                {
                                  SubLObject pred_var = predicate;
                                  if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
                                    {
                                      SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                      SubLObject done_var = doneP;
                                      SubLObject token_var = NIL;
                                      while ((NIL == done_var)) {
                                        {
                                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                                          if ((NIL != valid)) {
                                            {
                                              SubLObject final_index_iterator = NIL;
                                              try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw85$GAF, NIL, NIL);
                                                {
                                                  SubLObject done_var_83 = doneP;
                                                  SubLObject token_var_84 = NIL;
                                                  while ((NIL == done_var_83)) {
                                                    {
                                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_84);
                                                      SubLObject valid_85 = makeBoolean((token_var_84 != assertion));
                                                      if ((NIL != valid_85)) {
                                                        if ((NIL != sef_violating_assertionP(assertion, find_formula, arg, argnum))) {
                                                          violations = cons(assertion, violations);
                                                          if ((NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                                                            doneP = T;
                                                          }
                                                        }
                                                      }
                                                      done_var_83 = makeBoolean(((NIL == valid_85)
                                                            || (NIL != doneP)));
                                                    }
                                                  }
                                                }
                                              } finally {
                                                {
                                                  SubLObject _prev_bind_0_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                  try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != final_index_iterator)) {
                                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                  } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_86, thread);
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          done_var = makeBoolean(((NIL == valid)
                                                || (NIL != doneP)));
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else if (pcase_var.eql($kw54$GAF_ARG)) {
                            thread.resetMultipleValues();
                            {
                              SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                              SubLObject largnum = thread.secondMultipleValue();
                              SubLObject predicate = thread.thirdMultipleValue();
                              thread.resetMultipleValues();
                              {
                                SubLObject pred_var = predicate;
                                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, largnum, pred_var))) {
                                  {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, largnum, pred_var);
                                    SubLObject done_var = doneP;
                                    SubLObject token_var = NIL;
                                    while ((NIL == done_var)) {
                                      {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                                        if ((NIL != valid)) {
                                          {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw85$GAF, NIL, NIL);
                                              {
                                                SubLObject done_var_87 = doneP;
                                                SubLObject token_var_88 = NIL;
                                                while ((NIL == done_var_87)) {
                                                  {
                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_88);
                                                    SubLObject valid_89 = makeBoolean((token_var_88 != assertion));
                                                    if ((NIL != valid_89)) {
                                                      if ((NIL != sef_violating_assertionP(assertion, find_formula, arg, argnum))) {
                                                        violations = cons(assertion, violations);
                                                        if ((NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                                                          doneP = T;
                                                        }
                                                      }
                                                    }
                                                    done_var_87 = makeBoolean(((NIL == valid_89)
                                                          || (NIL != doneP)));
                                                  }
                                                }
                                              }
                                            } finally {
                                              {
                                                SubLObject _prev_bind_0_90 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                  if ((NIL != final_index_iterator)) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                  }
                                                } finally {
                                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_90, thread);
                                                }
                                              }
                                            }
                                          }
                                        }
                                        done_var = makeBoolean(((NIL == valid)
                                              || (NIL != doneP)));
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        at_vars.$within_at_mappingP$.rebind(_prev_bind_0_82, thread);
                      }
                    }
                  } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $kw51$AT_MAPPING_DONE);
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
        return violations;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 56506) 
  public static final SubLObject sef_violating_assertionP(SubLObject assertion, SubLObject find_formula, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != assertions_high.gaf_assertionP(assertion))) {
        {
          SubLObject gaf = assertions_high.gaf_formula(assertion);
          if ((NIL != unification_utilities.asent_unify(find_formula, gaf, T, UNPROVIDED))) {
            if ((NIL == equals.equalsP(arg, cycl_utilities.reify_arg_when_closed_naut(gaf, argnum), UNPROVIDED, UNPROVIDED))) {
              if ((NIL != at_vars.$gather_at_format_violationsP$.getDynamicValue(thread))) {
                {
                  SubLObject item_var = assertion;
                  if ((NIL == conses_high.member(item_var, at_vars.$at_format_violations$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                    at_vars.$at_format_violations$.setDynamicValue(cons(item_var, at_vars.$at_format_violations$.getDynamicValue(thread)), thread);
                  }
                }
              }
              return T;
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 61364) 
  public static final SubLObject set_entry_okP(SubLObject literal, SubLObject argnum, SubLObject mt) {
    return T;
  }

  @SubL(source = "cycl/arg-type.lisp", position = 61453) 
  public static final SubLObject variable_wrt_arg_typeP(SubLObject arg) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == wff_vars.$recognize_variablesP$.getDynamicValue(thread))) {
        return NIL;
      } else if ((NIL != variable_term_wrt_arg_typeP(arg))) {
        return T;
      } else if (((NIL != term.first_order_nautP(arg))
           && ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6981"))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6985"))
            || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6989"))))) {
        return NIL;
      } else if (((NIL != term.nautP(arg, UNPROVIDED))
           && (NIL != cycl_utilities.formula_find_if($sym21$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED)))) {
        return T;
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 62621) 
  public static final SubLObject variable_term_wrt_arg_typeP(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != cycl_variables.el_varP(v_term))
            || (NIL != cycl_variables.kb_varP(v_term))
            || ((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread))
               && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3469")))
            || ((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread))
               && v_term.isKeyword())
            || (NIL != term.reified_skolem_termP(v_term))
            || (NIL != term.unreified_skolem_termP(v_term))
            || ((NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread))
               && (NIL != nart_handles.nart_p(v_term)))));
    }
  }

  public static final class $variable_term_wrt_arg_typeP$UnaryFunction extends UnaryFunction {
    public $variable_term_wrt_arg_typeP$UnaryFunction() { super(extractFunctionNamed("VARIABLE-TERM-WRT-ARG-TYPE?")); }
    public SubLObject processItem(SubLObject arg1) { return variable_term_wrt_arg_typeP(arg1); }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 63368) 
  public static final SubLObject naut_wrt_arg_typeP(SubLObject v_term, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((((NIL != at_vars.$within_decontextualizedP$.getDynamicValue(thread))
               && (NIL != narts_high.naut_p(v_term)))
            || ((NIL == nart_handles.nart_p(v_term))
               && (NIL != term.function_termP(v_term))
               && ((NIL != forts.fort_p(cycl_utilities.nat_functor(v_term)))
                || (NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8828"))))));
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 63991) 
  public static final SubLObject tou_wrt_arg_typeP(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eql(at_vars.$at_reln$.getDynamicValue(thread), $const9$termOfUnit);
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 64087) 
  public static final SubLObject nat_function_wrt_arg_typeP(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(at_vars.$at_reln$.getDynamicValue(thread), $const86$natFunction);
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 64192) 
  public static final SubLObject nat_argument_wrt_arg_typeP(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(at_vars.$at_reln$.getDynamicValue(thread), $const87$natArgument);
    }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 64297) 
  public static final SubLObject strong_fort_wrt_arg_typeP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return forts.fort_p(v_term);
  }

  @SubL(source = "cycl/arg-type.lisp", position = 64397) 
  public static final SubLObject weak_fort_wrt_arg_typeP(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread))
                || (NIL != at_vars.$within_decontextualizedP$.getDynamicValue(thread))
                || (NIL != wff_vars.wff_lenientP()))
               && (NIL != forts.fort_p(v_term)))
            || ((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread))
               && ((NIL != nart_handles.nart_p(v_term))
                || ((NIL != czer_utilities.reifiable_nautP(v_term, UNPROVIDED, UNPROVIDED))
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10319")))))));
    }
  }

  public static final class $arg_constraint_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $sentence; }
    public SubLObject getField3() { return $mt; }
    public SubLObject getField4() { return $test_function; }
    public SubLObject getField5() { return $test_args; }
    public SubLObject getField6() { return $closedP; }
    public SubLObject getField7() { return $atomicP; }
    public SubLObject setField2(SubLObject value) { return $sentence = value; }
    public SubLObject setField3(SubLObject value) { return $mt = value; }
    public SubLObject setField4(SubLObject value) { return $test_function = value; }
    public SubLObject setField5(SubLObject value) { return $test_args = value; }
    public SubLObject setField6(SubLObject value) { return $closedP = value; }
    public SubLObject setField7(SubLObject value) { return $atomicP = value; }
    public SubLObject $sentence = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $test_function = NIL;
    public SubLObject $test_args = NIL;
    public SubLObject $closedP = NIL;
    public SubLObject $atomicP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($arg_constraint_native.class, $sym90$ARG_CONSTRAINT, $sym91$ARG_CONSTRAINT_P, $list92, $list93, new String[] {"$sentence", "$mt", "$test_function", "$test_args", "$closedP", "$atomicP"}, $list94, $list95, $sym96$PRINT_ARG_CONSTRAINT);
  }

  @SubL(source = "cycl/arg-type.lisp", position = 68831) 
  public static SubLSymbol $dtp_arg_constraint$ = null;

  @SubL(source = "cycl/arg-type.lisp", position = 68831) 
  public static final SubLObject arg_constraint_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23227");
    return NIL;
  }

  public static final class $arg_constraint_p$UnaryFunction extends UnaryFunction {
    public $arg_constraint_p$UnaryFunction() { super(extractFunctionNamed("ARG-CONSTRAINT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23193"); }
  }

  @SubL(source = "cycl/arg-type.lisp", position = 69281) 
  private static SubLSymbol $arg_constraint_struct_printing_verboseP$ = null;

  @SubL(source = "cycl/arg-type.lisp", position = 73017) 
  private static SubLSymbol $sorted_arg_constraint_predicates_caching_state$ = null;

  public static final SubLObject declare_arg_type_file() {
    declareFunction(myName, "formula_args_ok_wrt_typeP", "FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false);
    declareFunction(myName, "why_not_formula_args_ok_wrt_typeP", "WHY-NOT-FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false);
    declareFunction(myName, "mt_literal_args_ok_wrt_typeP", "MT-LITERAL-ARGS-OK-WRT-TYPE?", 2, 0, false);
    declareFunction(myName, "seqvars_inhibited_by_relation_expression", "SEQVARS-INHIBITED-BY-RELATION-EXPRESSION", 1, 0, false);
    declareFunction(myName, "new_inhibited_seqvars", "NEW-INHIBITED-SEQVARS", 1, 0, false);
    declareFunction(myName, "at_considering_atomic_sentence_p", "AT-CONSIDERING-ATOMIC-SENTENCE-P", 0, 0, false);
    declareFunction(myName, "formula_args_ok_wrt_type_intP", "FORMULA-ARGS-OK-WRT-TYPE-INT?", 1, 1, false);
    declareFunction(myName, "relation_arg_okP", "RELATION-ARG-OK?", 3, 1, false);
    declareFunction(myName, "clear_cached_relation_arg_okP", "CLEAR-CACHED-RELATION-ARG-OK?", 0, 0, false); new $clear_cached_relation_arg_okP$ZeroArityFunction();
    declareFunction(myName, "remove_cached_relation_arg_okP", "REMOVE-CACHED-RELATION-ARG-OK?", 6, 0, false);
    declareFunction(myName, "cached_relation_arg_okP_internal", "CACHED-RELATION-ARG-OK?-INTERNAL", 6, 0, false);
    declareFunction(myName, "cached_relation_arg_okP", "CACHED-RELATION-ARG-OK?", 6, 0, false);
    declareFunction(myName, "relation_arg_ok_intP", "RELATION-ARG-OK-INT?", 3, 1, false);
    declareFunction(myName, "at_within_negationP", "AT-WITHIN-NEGATION?", 2, 0, false);
    declareFunction(myName, "at_within_predicateP", "AT-WITHIN-PREDICATE?", 1, 0, false);
    declareFunction(myName, "at_within_functionP", "AT-WITHIN-FUNCTION?", 0, 1, false);
    declareFunction(myName, "at_check_arg_typesP", "AT-CHECK-ARG-TYPES?", 0, 3, false);
    declareFunction(myName, "at_check_defining_mtsP", "AT-CHECK-DEFINING-MTS?", 2, 0, false);
    declareFunction(myName, "appraising_disjunctP", "APPRAISING-DISJUNCT?", 1, 1, false);
    declareFunction(myName, "at_within_disjunctP", "AT-WITHIN-DISJUNCT?", 2, 0, false);
    declareFunction(myName, "appraising_disjunct_cnfP", "APPRAISING-DISJUNCT-CNF?", 1, 0, false);
    declareFunction(myName, "at_within_decontextualizedP", "AT-WITHIN-DECONTEXTUALIZED?", 1, 0, false);
    declareFunction(myName, "variable_arg_okP", "VARIABLE-ARG-OK?", 3, 1, false);
    declareFunction(myName, "weak_fort_arg_okP", "WEAK-FORT-ARG-OK?", 3, 1, false);
    declareFunction(myName, "naut_arg_okP", "NAUT-ARG-OK?", 4, 0, false);
    declareFunction(myName, "at_nat_okP", "AT-NAT-OK?", 1, 1, false);
    declareFunction(myName, "nat_functor_okP", "NAT-FUNCTOR-OK?", 1, 1, false);
    declareFunction(myName, "nat_args_okP", "NAT-ARGS-OK?", 1, 1, false);
    declareFunction(myName, "nart_or_reify_forward_nautP", "NART-OR-REIFY-FORWARD-NAUT?", 2, 0, false);
    declareFunction(myName, "tou_arg_okP", "TOU-ARG-OK?", 2, 0, false);
    declareFunction(myName, "nat_function_arg_okP", "NAT-FUNCTION-ARG-OK?", 2, 0, false);
    declareFunction(myName, "nat_argument_arg_okP", "NAT-ARGUMENT-ARG-OK?", 2, 0, false);
    declareFunction(myName, "tou_naut_okP", "TOU-NAUT-OK?", 1, 0, false);
    declareFunction(myName, "strong_fort_arg_okP", "STRONG-FORT-ARG-OK?", 4, 0, false);
    declareFunction(myName, "opaque_arg_okP", "OPAQUE-ARG-OK?", 4, 0, false);
    declareFunction(myName, "naut_functor_okP", "NAUT-FUNCTOR-OK?", 1, 1, false);
    declareFunction(myName, "naut_args_okP", "NAUT-ARGS-OK?", 1, 1, false);
    declareFunction(myName, "naut_args_ok_wrt_typeP", "NAUT-ARGS-OK-WRT-TYPE?", 1, 1, false);
    declareFunction(myName, "weak_fort_types_okP", "WEAK-FORT-TYPES-OK?", 3, 1, false);
    declareFunction(myName, "naut_arg_types_okP", "NAUT-ARG-TYPES-OK?", 4, 0, false);
    declareFunction(myName, "naut_arg_types_consistentP", "NAUT-ARG-TYPES-CONSISTENT?", 4, 0, false);
    declareFunction(myName, "naut_arg_types_trueP", "NAUT-ARG-TYPES-TRUE?", 4, 0, false);
    declareFunction(myName, "strong_fort_arg_types_okP", "STRONG-FORT-ARG-TYPES-OK?", 0, 4, false);
    declareFunction(myName, "opaque_arg_types_okP", "OPAQUE-ARG-TYPES-OK?", 0, 4, false);
    declareFunction(myName, "arg_isa_arg_types_okP", "ARG-ISA-ARG-TYPES-OK?", 0, 4, false);
    declareFunction(myName, "arg_test_okP", "ARG-TEST-OK?", 3, 1, false);
    declareFunction(myName, "inter_arg_test_failsP", "INTER-ARG-TEST-FAILS?", 3, 1, false);
    declareFunction(myName, "mal_intra_argP", "MAL-INTRA-ARG?", 4, 0, false);
    declareFunction(myName, "mal_inter_argP", "MAL-INTER-ARG?", 6, 0, false);
    declareFunction(myName, "defining_mts_okP", "DEFINING-MTS-OK?", 1, 1, false);
    declareFunction(myName, "memoized_defining_mts_okP_internal", "MEMOIZED-DEFINING-MTS-OK?-INTERNAL", 2, 0, false);
    declareFunction(myName, "memoized_defining_mts_okP", "MEMOIZED-DEFINING-MTS-OK?", 2, 0, false);
    declareFunction(myName, "defining_mts_ok_intP", "DEFINING-MTS-OK-INT?", 1, 1, false);
    declareFunction(myName, "relator_constraints_okP", "RELATOR-CONSTRAINTS-OK?", 1, 1, false);
    declareFunction(myName, "predicate_constraints_okP", "PREDICATE-CONSTRAINTS-OK?", 1, 1, false);
    declareFunction(myName, "gaf_ok_wrt_asymmetric_predP", "GAF-OK-WRT-ASYMMETRIC-PRED?", 1, 1, false);
    declareFunction(myName, "asymmetric_violations", "ASYMMETRIC-VIOLATIONS", 2, 0, false);
    declareFunction(myName, "gather_asymmetric_violations", "GATHER-ASYMMETRIC-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "select_asymmetric_pred_violation", "SELECT-ASYMMETRIC-PRED-VIOLATION", 1, 0, false);
    declareFunction(myName, "gaf_ok_wrt_anti_symmetric_predP", "GAF-OK-WRT-ANTI-SYMMETRIC-PRED?", 1, 1, false);
    declareFunction(myName, "anti_symmetric_violations", "ANTI-SYMMETRIC-VIOLATIONS", 2, 0, false);
    declareFunction(myName, "gaf_ok_wrt_irreflexive_predP", "GAF-OK-WRT-IRREFLEXIVE-PRED?", 1, 1, false);
    declareFunction(myName, "gaf_ok_wrt_anti_transitive_predP", "GAF-OK-WRT-ANTI-TRANSITIVE-PRED?", 1, 1, false);
    declareFunction(myName, "anti_transitive_violations", "ANTI-TRANSITIVE-VIOLATIONS", 2, 0, false);
    declareFunction(myName, "gather_anti_transitive_violations", "GATHER-ANTI-TRANSITIVE-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "search_for_anti_transitive_pred_violation", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION", 1, 0, false);
    declareFunction(myName, "search_for_anti_transitive_pred_violation_pivot", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION-PIVOT", 1, 0, false);
    declareFunction(myName, "search_for_anti_transitive_pred_violation_swap", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION-SWAP", 1, 0, false);
    declareFunction(myName, "select_anti_transitive_pred_violation", "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION", 1, 0, false);
    declareFunction(myName, "select_anti_transitive_pred_violation_via_pred", "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION-VIA-PRED", 1, 0, false);
    declareFunction(myName, "find_accessible_gaf", "FIND-ACCESSIBLE-GAF", 1, 3, false);
    declareFunction(myName, "select_target_gaf", "SELECT-TARGET-GAF", 1, 0, false);
    declareFunction(myName, "gaf_ok_wrt_negation_predsP", "GAF-OK-WRT-NEGATION-PREDS?", 1, 1, false);
    declareFunction(myName, "negation_pred_violations", "NEGATION-PRED-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "gaf_ok_wrt_negation_inversesP", "GAF-OK-WRT-NEGATION-INVERSES?", 1, 1, false);
    declareFunction(myName, "negation_inverse_violations", "NEGATION-INVERSE-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "clear_cached_format_okP", "CLEAR-CACHED-FORMAT-OK?", 0, 0, false);
    declareFunction(myName, "remove_cached_format_okP", "REMOVE-CACHED-FORMAT-OK?", 1, 0, false);
    declareFunction(myName, "cached_format_okP_internal", "CACHED-FORMAT-OK?-INTERNAL", 1, 0, false);
    declareFunction(myName, "cached_format_okP", "CACHED-FORMAT-OK?", 1, 0, false);
    declareFunction(myName, "memoized_format_okP_internal", "MEMOIZED-FORMAT-OK?-INTERNAL", 4, 0, false);
    declareFunction(myName, "memoized_format_okP", "MEMOIZED-FORMAT-OK?", 4, 0, false);
    declareFunction(myName, "at_format_okP", "AT-FORMAT-OK?", 1, 3, false);
    declareFunction(myName, "single_entry_okP", "SINGLE-ENTRY-OK?", 3, 0, false);
    declareFunction(myName, "literal_single_entry_okP", "LITERAL-SINGLE-ENTRY-OK?", 3, 0, false);
    declareFunction(myName, "why_not_literal_single_entry_okP", "WHY-NOT-LITERAL-SINGLE-ENTRY-OK?", 3, 1, false);
    declareFunction(myName, "sef_violations", "SEF-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "check_inter_assert_format_wXo_arg_indexP", "CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?", 1, 0, false);
    declareFunction(myName, "sef_violating_assertionP", "SEF-VIOLATING-ASSERTION?", 4, 0, false);
    declareFunction(myName, "temporally_intersecting_okP", "TEMPORALLY-INTERSECTING-OK?", 3, 0, false);
    declareFunction(myName, "tief_violations", "TIEF-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "spatially_intersecting_okP", "SPATIALLY-INTERSECTING-OK?", 3, 0, false);
    declareFunction(myName, "sief_violations", "SIEF-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "sief_violating_assertionP", "SIEF-VIOLATING-ASSERTION?", 4, 0, false);
    declareFunction(myName, "spatio_temporally__intersecting_okP", "SPATIO-TEMPORALLY--INTERSECTING-OK?", 3, 0, false);
    declareFunction(myName, "stief_violations", "STIEF-VIOLATIONS", 3, 0, false);
    declareFunction(myName, "interval_entry_okP", "INTERVAL-ENTRY-OK?", 3, 0, false);
    declareFunction(myName, "set_entry_okP", "SET-ENTRY-OK?", 3, 0, false);
    declareFunction(myName, "variable_wrt_arg_typeP", "VARIABLE-WRT-ARG-TYPE?", 1, 0, false);
    declareFunction(myName, "variable_term_wrt_arg_typeP", "VARIABLE-TERM-WRT-ARG-TYPE?", 1, 0, false); new $variable_term_wrt_arg_typeP$UnaryFunction();
    declareFunction(myName, "naut_wrt_arg_typeP", "NAUT-WRT-ARG-TYPE?", 2, 0, false);
    declareFunction(myName, "tou_wrt_arg_typeP", "TOU-WRT-ARG-TYPE?", 1, 0, false);
    declareFunction(myName, "nat_function_wrt_arg_typeP", "NAT-FUNCTION-WRT-ARG-TYPE?", 1, 0, false);
    declareFunction(myName, "nat_argument_wrt_arg_typeP", "NAT-ARGUMENT-WRT-ARG-TYPE?", 1, 0, false);
    declareFunction(myName, "strong_fort_wrt_arg_typeP", "STRONG-FORT-WRT-ARG-TYPE?", 1, 1, false);
    declareFunction(myName, "weak_fort_wrt_arg_typeP", "WEAK-FORT-WRT-ARG-TYPE?", 1, 0, false);
    declareFunction(myName, "semantically_valid_dnfP", "SEMANTICALLY-VALID-DNF?", 1, 2, false);
    declareFunction(myName, "semantically_valid_dnf_type_literalsP", "SEMANTICALLY-VALID-DNF-TYPE-LITERALS?", 1, 2, false);
    declareFunction(myName, "semantically_valid_literalP", "SEMANTICALLY-VALID-LITERAL?", 1, 2, false);
    declareFunction(myName, "semantically_valid_literal_intP", "SEMANTICALLY-VALID-LITERAL-INT?", 1, 2, false);
    declareFunction(myName, "why_not_assertion_semantically_validP", "WHY-NOT-ASSERTION-SEMANTICALLY-VALID?", 1, 0, false);
    declareFunction(myName, "why_not_cnf_semantically_validP", "WHY-NOT-CNF-SEMANTICALLY-VALID?", 1, 1, false);
    declareFunction(myName, "why_not_cnf_semantically_valid_int", "WHY-NOT-CNF-SEMANTICALLY-VALID-INT", 2, 0, false);
    declareFunction(myName, "why_not_literal_semantically_validP", "WHY-NOT-LITERAL-SEMANTICALLY-VALID?", 1, 1, false);
    declareFunction(myName, "arg_constraint_print_function_trampoline", "ARG-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "arg_constraint_p", "ARG-CONSTRAINT-P", 1, 0, false); new $arg_constraint_p$UnaryFunction();
    declareFunction(myName, "argconst_sentence", "ARGCONST-SENTENCE", 1, 0, false);
    declareFunction(myName, "argconst_mt", "ARGCONST-MT", 1, 0, false);
    declareFunction(myName, "argconst_test_function", "ARGCONST-TEST-FUNCTION", 1, 0, false);
    declareFunction(myName, "argconst_test_args", "ARGCONST-TEST-ARGS", 1, 0, false);
    declareFunction(myName, "argconst_closedP", "ARGCONST-CLOSED?", 1, 0, false);
    declareFunction(myName, "argconst_atomicP", "ARGCONST-ATOMIC?", 1, 0, false);
    declareFunction(myName, "_csetf_argconst_sentence", "_CSETF-ARGCONST-SENTENCE", 2, 0, false);
    declareFunction(myName, "_csetf_argconst_mt", "_CSETF-ARGCONST-MT", 2, 0, false);
    declareFunction(myName, "_csetf_argconst_test_function", "_CSETF-ARGCONST-TEST-FUNCTION", 2, 0, false);
    declareFunction(myName, "_csetf_argconst_test_args", "_CSETF-ARGCONST-TEST-ARGS", 2, 0, false);
    declareFunction(myName, "_csetf_argconst_closedP", "_CSETF-ARGCONST-CLOSED?", 2, 0, false);
    declareFunction(myName, "_csetf_argconst_atomicP", "_CSETF-ARGCONST-ATOMIC?", 2, 0, false);
    declareFunction(myName, "make_arg_constraint", "MAKE-ARG-CONSTRAINT", 0, 1, false);
    declareFunction(myName, "print_arg_constraint", "PRINT-ARG-CONSTRAINT", 3, 0, false);
    declareFunction(myName, "arg_constraint_sentence", "ARG-CONSTRAINT-SENTENCE", 1, 0, false);
    declareFunction(myName, "arg_constraint_mt", "ARG-CONSTRAINT-MT", 1, 0, false);
    declareFunction(myName, "arg_constraint_test_function", "ARG-CONSTRAINT-TEST-FUNCTION", 1, 0, false);
    declareFunction(myName, "arg_constraint_test_args", "ARG-CONSTRAINT-TEST-ARGS", 1, 0, false);
    declareFunction(myName, "arg_constraint_open_p", "ARG-CONSTRAINT-OPEN-P", 1, 0, false);
    declareFunction(myName, "arg_constraint_closed_p", "ARG-CONSTRAINT-CLOSED-P", 1, 0, false);
    declareFunction(myName, "arg_constraint_atomic_p", "ARG-CONSTRAINT-ATOMIC-P", 1, 0, false);
    declareFunction(myName, "arg_constraint_non_atomic_p", "ARG-CONSTRAINT-NON-ATOMIC-P", 1, 0, false);
    declareFunction(myName, "arg_constraint_gaf_p", "ARG-CONSTRAINT-GAF-P", 1, 0, false);
    declareFunction(myName, "arg_constraint_type_string", "ARG-CONSTRAINT-TYPE-STRING", 1, 0, false);
    declareFunction(myName, "new_arg_constraint", "NEW-ARG-CONSTRAINT", 4, 2, false);
    declareFunction(myName, "determine_arg_constraint_closedP", "DETERMINE-ARG-CONSTRAINT-CLOSED?", 2, 0, false);
    declareFunction(myName, "determine_arg_constraint_atomicP", "DETERMINE-ARG-CONSTRAINT-ATOMIC?", 2, 0, false);
    declareFunction(myName, "new_isa_arg_constraint", "NEW-ISA-ARG-CONSTRAINT", 3, 0, false);
    declareFunction(myName, "new_genls_arg_constraint", "NEW-GENLS-ARG-CONSTRAINT", 3, 0, false);
    declareFunction(myName, "clear_sorted_arg_constraint_predicates", "CLEAR-SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false);
    declareFunction(myName, "remove_sorted_arg_constraint_predicates", "REMOVE-SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false);
    declareFunction(myName, "sorted_arg_constraint_predicates_internal", "SORTED-ARG-CONSTRAINT-PREDICATES-INTERNAL", 0, 0, false);
    declareFunction(myName, "sorted_arg_constraint_predicates", "SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false);
    declareFunction(myName, "sorted_top_level_arg_constraints_on_formula", "SORTED-TOP-LEVEL-ARG-CONSTRAINTS-ON-FORMULA", 1, 0, false);
    declareFunction(myName, "inside_out_arg_constraints_on_formula", "INSIDE-OUT-ARG-CONSTRAINTS-ON-FORMULA", 1, 0, false);
    declareFunction(myName, "arg_constraint_satisfiedP", "ARG-CONSTRAINT-SATISFIED?", 1, 0, false);
    declareFunction(myName, "arg_constraints_on_formula_with_variable_operator", "ARG-CONSTRAINTS-ON-FORMULA-WITH-VARIABLE-OPERATOR", 1, 0, false);
    declareFunction(myName, "compute_constraint_for_assertion_and_formula", "COMPUTE-CONSTRAINT-FOR-ASSERTION-AND-FORMULA", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_arg_type_file() {
    $relation_arg_ok_argnum$ = defparameter("*RELATION-ARG-OK-ARGNUM*", NIL);
    $cached_relation_arg_okP_caching_state$ = deflexical("*CACHED-RELATION-ARG-OK?-CACHING-STATE*", NIL);
    $cached_format_okP_caching_state$ = deflexical("*CACHED-FORMAT-OK?-CACHING-STATE*", NIL);
    $dtp_arg_constraint$ = defconstant("*DTP-ARG-CONSTRAINT*", $sym90$ARG_CONSTRAINT);
    $arg_constraint_struct_printing_verboseP$ = defparameter("*ARG-CONSTRAINT-STRUCT-PRINTING-VERBOSE?*", NIL);
    $sorted_arg_constraint_predicates_caching_state$ = deflexical("*SORTED-ARG-CONSTRAINT-PREDICATES-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_arg_type_file() {
    // CVS_ID("Id: arg-type.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    memoization_state.note_globally_cached_function($sym3$CACHED_RELATION_ARG_OK_);
    memoization_state.note_memoized_function($sym37$MEMOIZED_DEFINING_MTS_OK_);
    memoization_state.note_globally_cached_function($sym72$CACHED_FORMAT_OK_);
    memoization_state.note_memoized_function($sym74$MEMOIZED_FORMAT_OK_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_arg_constraint$.getGlobalValue(), Symbols.symbol_function($sym97$ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym98$ARGCONST_SENTENCE, $sym99$_CSETF_ARGCONST_SENTENCE);
    Structures.def_csetf($sym100$ARGCONST_MT, $sym101$_CSETF_ARGCONST_MT);
    Structures.def_csetf($sym102$ARGCONST_TEST_FUNCTION, $sym103$_CSETF_ARGCONST_TEST_FUNCTION);
    Structures.def_csetf($sym104$ARGCONST_TEST_ARGS, $sym105$_CSETF_ARGCONST_TEST_ARGS);
    Structures.def_csetf($sym106$ARGCONST_CLOSED_, $sym107$_CSETF_ARGCONST_CLOSED_);
    Structures.def_csetf($sym108$ARGCONST_ATOMIC_, $sym109$_CSETF_ARGCONST_ATOMIC_);
    Equality.identity($sym90$ARG_CONSTRAINT);
    memoization_state.note_globally_cached_function($sym126$SORTED_ARG_CONSTRAINT_PREDICATES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$forAll = constant_handles.reader_make_constant_shell(makeString("forAll"));
  public static final SubLObject $const1$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLSymbol $kw2$INHIBITED_SEQUENCE_VARIABLE = makeKeyword("INHIBITED-SEQUENCE-VARIABLE");
  public static final SubLSymbol $sym3$CACHED_RELATION_ARG_OK_ = makeSymbol("CACHED-RELATION-ARG-OK?");
  public static final SubLSymbol $sym4$_CACHED_RELATION_ARG_OK__CACHING_STATE_ = makeSymbol("*CACHED-RELATION-ARG-OK?-CACHING-STATE*");
  public static final SubLInteger $int5$1024 = makeInteger(1024);
  public static final SubLSymbol $sym6$CLEAR_CACHED_RELATION_ARG_OK_ = makeSymbol("CLEAR-CACHED-RELATION-ARG-OK?");
  public static final SubLSymbol $kw7$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const8$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLObject $const9$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $sym10$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const11$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw12$WEAK_FORT = makeKeyword("WEAK-FORT");
  public static final SubLSymbol $kw13$NOT_ISA_DISJOINT = makeKeyword("NOT-ISA-DISJOINT");
  public static final SubLSymbol $kw14$NOT_QUOTED_ISA_DISJOINT = makeKeyword("NOT-QUOTED-ISA-DISJOINT");
  public static final SubLSymbol $kw15$NOT_ISA = makeKeyword("NOT-ISA");
  public static final SubLSymbol $kw16$NOT_GENLS_DISJOINT = makeKeyword("NOT-GENLS-DISJOINT");
  public static final SubLSymbol $kw17$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $kw18$DIFFERENT = makeKeyword("DIFFERENT");
  public static final SubLSymbol $sym19$POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");
  public static final SubLSymbol $kw20$NAUT = makeKeyword("NAUT");
  public static final SubLSymbol $sym21$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol("VARIABLE-TERM-WRT-ARG-TYPE?");
  public static final SubLSymbol $kw22$FORMAT = makeKeyword("FORMAT");
  public static final SubLSymbol $kw23$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw24$QUOTED_ISA = makeKeyword("QUOTED-ISA");
  public static final SubLObject $const25$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLObject $const26$CollectionDenotingFunction = constant_handles.reader_make_constant_shell(makeString("CollectionDenotingFunction"));
  public static final SubLObject $const27$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $kw28$OPAQUE = makeKeyword("OPAQUE");
  public static final SubLSymbol $kw29$STRONG_FORT = makeKeyword("STRONG-FORT");
  public static final SubLSymbol $sym30$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLObject $const31$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const32$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLList $list33 = list(makeKeyword("ISA"), makeKeyword("NOT-ISA-DISJOINT"));
  public static final SubLList $list34 = list(makeKeyword("GENLS"), makeKeyword("NOT-GENLS-DISJOINT"));
  public static final SubLString $str35$invalid_at_test__s_in_mal_intra_a = makeString("invalid at test ~s in mal-intra-arg?");
  public static final SubLString $str36$invalid_at_test__s_in_mal_inter_a = makeString("invalid at test ~s in mal-inter-arg?");
  public static final SubLSymbol $sym37$MEMOIZED_DEFINING_MTS_OK_ = makeSymbol("MEMOIZED-DEFINING-MTS-OK?");
  public static final SubLString $str38$__at_test_fails___s_in__s_fails__ = makeString("~%at test fails: ~s in ~s fails #$definingMt constraint: ~s");
  public static final SubLSymbol $kw39$DEFINING_MT_VIOLATION = makeKeyword("DEFINING-MT-VIOLATION");
  public static final SubLSymbol $kw40$ASYMMETRIC_PREDICATE = makeKeyword("ASYMMETRIC-PREDICATE");
  public static final SubLSymbol $kw41$ANTI_SYMMETRIC_PREDICATE = makeKeyword("ANTI-SYMMETRIC-PREDICATE");
  public static final SubLSymbol $kw42$IRREFLEXIVE_PREDICATE = makeKeyword("IRREFLEXIVE-PREDICATE");
  public static final SubLSymbol $kw43$ANTI_TRANSITIVE_PREDICATE = makeKeyword("ANTI-TRANSITIVE-PREDICATE");
  public static final SubLSymbol $kw44$NEGATION_PREDS = makeKeyword("NEGATION-PREDS");
  public static final SubLSymbol $kw45$NEGATION_INVERSES = makeKeyword("NEGATION-INVERSES");
  public static final SubLString $str46$unknown_predicate_constraint___s = makeString("unknown predicate constraint: ~s");
  public static final SubLObject $const47$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const48$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));
  public static final SubLSymbol $kw49$TRUE = makeKeyword("TRUE");
  public static final SubLList $list50 = list(makeKeyword("PREDICATE-EXTENT"), makeKeyword("GAF-ARG"));
  public static final SubLSymbol $kw51$AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");
  public static final SubLSymbol $kw52$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $sym53$SELECT_ASYMMETRIC_PRED_VIOLATION = makeSymbol("SELECT-ASYMMETRIC-PRED-VIOLATION");
  public static final SubLSymbol $kw54$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLString $str55$Ignore_it = makeString("Ignore it");
  public static final SubLString $str56$Unexpected_index_type_when_gather = makeString("Unexpected index type when gathering asymmetric violations");
  public static final SubLObject $const57$AntiSymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate"));
  public static final SubLObject $const58$IrreflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));
  public static final SubLSymbol $kw59$COMPLETES_CYCLE_ = makeKeyword("COMPLETES-CYCLE?");
  public static final SubLSymbol $kw60$WHY_COMPLETES_CYCLE_ = makeKeyword("WHY-COMPLETES-CYCLE?");
  public static final SubLObject $const61$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));
  public static final SubLObject $const62$AntiTransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AntiTransitiveBinaryPredicate"));
  public static final SubLSymbol $sym63$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION_VIA_PRED = makeSymbol("SELECT-ANTI-TRANSITIVE-PRED-VIOLATION-VIA-PRED");
  public static final SubLList $list64 = list(makeSymbol("*MAPPING-INDEX-ARG*"), makeSymbol("*MAPPING-PIVOT-ARG*"), makeSymbol("*MAPPING-TARGET-ARG*"));
  public static final SubLSymbol $sym65$SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION = makeSymbol("SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION");
  public static final SubLList $list66 = list(list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER), list(TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), list(ONE_INTEGER, ONE_INTEGER, TWO_INTEGER));
  public static final SubLList $list67 = list(list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER), list(TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), list(TWO_INTEGER, TWO_INTEGER, ONE_INTEGER));
  public static final SubLSymbol $sym68$SELECT_ANTI_TRANSITIVE_PRED_VIOLATION = makeSymbol("SELECT-ANTI-TRANSITIVE-PRED-VIOLATION");
  public static final SubLSymbol $sym69$SELECT_TARGET_GAF = makeSymbol("SELECT-TARGET-GAF");
  public static final SubLObject $const70$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLObject $const71$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $sym72$CACHED_FORMAT_OK_ = makeSymbol("CACHED-FORMAT-OK?");
  public static final SubLSymbol $sym73$_CACHED_FORMAT_OK__CACHING_STATE_ = makeSymbol("*CACHED-FORMAT-OK?-CACHING-STATE*");
  public static final SubLSymbol $sym74$MEMOIZED_FORMAT_OK_ = makeSymbol("MEMOIZED-FORMAT-OK?");
  public static final SubLObject $const75$SingleEntry = constant_handles.reader_make_constant_shell(makeString("SingleEntry"));
  public static final SubLObject $const76$IntervalEntry = constant_handles.reader_make_constant_shell(makeString("IntervalEntry"));
  public static final SubLObject $const77$SetTheFormat = constant_handles.reader_make_constant_shell(makeString("SetTheFormat"));
  public static final SubLObject $const78$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("singleEntryFormatInArgs"));
  public static final SubLObject $const79$intervalEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("intervalEntryFormatInArgs"));
  public static final SubLObject $const80$openEntryFormatInArgs = constant_handles.reader_make_constant_shell(makeString("openEntryFormatInArgs"));
  public static final SubLObject $const81$temporallyIntersectingEntryFormat = constant_handles.reader_make_constant_shell(makeString("temporallyIntersectingEntryFormatInArgs"));
  public static final SubLObject $const82$spatiallyIntersectingEntryFormatI = constant_handles.reader_make_constant_shell(makeString("spatiallyIntersectingEntryFormatInArgs"));
  public static final SubLObject $const83$spatioTemporallyIntersectingEntry = constant_handles.reader_make_constant_shell(makeString("spatioTemporallyIntersectingEntryFormatInArgs"));
  public static final SubLString $str84$unknown_entry_format___s = makeString("unknown entry format: ~s");
  public static final SubLSymbol $kw85$GAF = makeKeyword("GAF");
  public static final SubLObject $const86$natFunction = constant_handles.reader_make_constant_shell(makeString("natFunction"));
  public static final SubLObject $const87$natArgument = constant_handles.reader_make_constant_shell(makeString("natArgument"));
  public static final SubLSymbol $sym88$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLList $list89 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLSymbol $sym90$ARG_CONSTRAINT = makeSymbol("ARG-CONSTRAINT");
  public static final SubLSymbol $sym91$ARG_CONSTRAINT_P = makeSymbol("ARG-CONSTRAINT-P");
  public static final SubLList $list92 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TEST-FUNCTION"), makeSymbol("TEST-ARGS"), makeSymbol("CLOSED?"), makeSymbol("ATOMIC?"));
  public static final SubLList $list93 = list(makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("TEST-FUNCTION"), makeKeyword("TEST-ARGS"), makeKeyword("CLOSED?"), makeKeyword("ATOMIC?"));
  public static final SubLList $list94 = list(makeSymbol("ARGCONST-SENTENCE"), makeSymbol("ARGCONST-MT"), makeSymbol("ARGCONST-TEST-FUNCTION"), makeSymbol("ARGCONST-TEST-ARGS"), makeSymbol("ARGCONST-CLOSED?"), makeSymbol("ARGCONST-ATOMIC?"));
  public static final SubLList $list95 = list(makeSymbol("_CSETF-ARGCONST-SENTENCE"), makeSymbol("_CSETF-ARGCONST-MT"), makeSymbol("_CSETF-ARGCONST-TEST-FUNCTION"), makeSymbol("_CSETF-ARGCONST-TEST-ARGS"), makeSymbol("_CSETF-ARGCONST-CLOSED?"), makeSymbol("_CSETF-ARGCONST-ATOMIC?"));
  public static final SubLSymbol $sym96$PRINT_ARG_CONSTRAINT = makeSymbol("PRINT-ARG-CONSTRAINT");
  public static final SubLSymbol $sym97$ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARG-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym98$ARGCONST_SENTENCE = makeSymbol("ARGCONST-SENTENCE");
  public static final SubLSymbol $sym99$_CSETF_ARGCONST_SENTENCE = makeSymbol("_CSETF-ARGCONST-SENTENCE");
  public static final SubLSymbol $sym100$ARGCONST_MT = makeSymbol("ARGCONST-MT");
  public static final SubLSymbol $sym101$_CSETF_ARGCONST_MT = makeSymbol("_CSETF-ARGCONST-MT");
  public static final SubLSymbol $sym102$ARGCONST_TEST_FUNCTION = makeSymbol("ARGCONST-TEST-FUNCTION");
  public static final SubLSymbol $sym103$_CSETF_ARGCONST_TEST_FUNCTION = makeSymbol("_CSETF-ARGCONST-TEST-FUNCTION");
  public static final SubLSymbol $sym104$ARGCONST_TEST_ARGS = makeSymbol("ARGCONST-TEST-ARGS");
  public static final SubLSymbol $sym105$_CSETF_ARGCONST_TEST_ARGS = makeSymbol("_CSETF-ARGCONST-TEST-ARGS");
  public static final SubLSymbol $sym106$ARGCONST_CLOSED_ = makeSymbol("ARGCONST-CLOSED?");
  public static final SubLSymbol $sym107$_CSETF_ARGCONST_CLOSED_ = makeSymbol("_CSETF-ARGCONST-CLOSED?");
  public static final SubLSymbol $sym108$ARGCONST_ATOMIC_ = makeSymbol("ARGCONST-ATOMIC?");
  public static final SubLSymbol $sym109$_CSETF_ARGCONST_ATOMIC_ = makeSymbol("_CSETF-ARGCONST-ATOMIC?");
  public static final SubLSymbol $kw110$SENTENCE = makeKeyword("SENTENCE");
  public static final SubLSymbol $kw111$MT = makeKeyword("MT");
  public static final SubLSymbol $kw112$TEST_FUNCTION = makeKeyword("TEST-FUNCTION");
  public static final SubLSymbol $kw113$TEST_ARGS = makeKeyword("TEST-ARGS");
  public static final SubLSymbol $kw114$CLOSED_ = makeKeyword("CLOSED?");
  public static final SubLSymbol $kw115$ATOMIC_ = makeKeyword("ATOMIC?");
  public static final SubLString $str116$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str117$__a_ARG_CONSTRAINT__a__a__a__a_ = makeString("<~a ARG-CONSTRAINT:~a:~a:~a:~a>");
  public static final SubLString $str118$_ARG_CONSTRAINT__a__a_ = makeString("<ARG-CONSTRAINT:~a:~a>");
  public static final SubLString $str119$GAF = makeString("GAF");
  public static final SubLString $str120$GNAF = makeString("GNAF");
  public static final SubLString $str121$OAF = makeString("OAF");
  public static final SubLString $str122$ONAF = makeString("ONAF");
  public static final SubLSymbol $kw123$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $sym124$ISA_ = makeSymbol("ISA?");
  public static final SubLSymbol $sym125$GENLS_ = makeSymbol("GENLS?");
  public static final SubLSymbol $sym126$SORTED_ARG_CONSTRAINT_PREDICATES = makeSymbol("SORTED-ARG-CONSTRAINT-PREDICATES");
  public static final SubLList $list127 = list(constant_handles.reader_make_constant_shell(makeString("argIsa")), constant_handles.reader_make_constant_shell(makeString("argGenl")));
  public static final SubLObject $const128$ArgTypePredicate = constant_handles.reader_make_constant_shell(makeString("ArgTypePredicate"));
  public static final SubLSymbol $sym129$NO_PREDICATE_EXTENT_P = makeSymbol("NO-PREDICATE-EXTENT-P");
  public static final SubLObject $const130$ArgConstraintPredicate = constant_handles.reader_make_constant_shell(makeString("ArgConstraintPredicate"));
  public static final SubLSymbol $sym131$_SORTED_ARG_CONSTRAINT_PREDICATES_CACHING_STATE_ = makeSymbol("*SORTED-ARG-CONSTRAINT-PREDICATES-CACHING-STATE*");
  public static final SubLSymbol $kw132$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym133$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym134$LISTP = makeSymbol("LISTP");
  public static final SubLObject $const135$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLObject $const136$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));
  public static final SubLObject $const137$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));

  //// Initializers

  public void declareFunctions() {
    declare_arg_type_file();
  }

  public void initializeVariables() {
    init_arg_type_file();
  }

  public void runTopLevelForms() {
    setup_arg_type_file();
  }

}
