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
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_cache;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.at_macros;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;

public  final class at_routines extends SubLTranslatedFile {

  //// Constructor

  private at_routines() {}
  public static final SubLFile me = new at_routines();
  public static final String myName = "com.cyc.cycjava.cycl.at_routines";

  //// Definitions

  @SubL(source = "cycl/at-routines.lisp", position = 926) 
  private static SubLSymbol $at_check_quoted_arg_isaP$ = null;

  /** Storage for applicable applicable arg-types (e.g. argIsa argGenls) */
  @SubL(source = "cycl/at-routines.lisp", position = 977) 
  private static SubLSymbol $at_applicable_arg_types$ = null;

  /** Storage for the applicable arg-type (e.g. argIsa argGenls) with the KB assertions  */
  @SubL(source = "cycl/at-routines.lisp", position = 1096) 
  public static SubLSymbol $at_applicable_arg_types_with_assertions$ = null;

  /** do the arg-isa collections applicable to arg 
   number <argnum> of relation <reln> include <arg>? */
  @SubL(source = "cycl/at-routines.lisp", position = 1592) 
  public static final SubLObject mal_arg_isaP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        SubLObject arg_isas_foundP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_1 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw6$ARG_ISA);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          {
                            SubLObject fort_type_arg_isas = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject other_arg_isas = Sequences.remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            arg_isas_foundP = T;
                            if ((NIL == doneP)) {
                              {
                                SubLObject csome_list_var = fort_type_arg_isas;
                                SubLObject col = NIL;
                                for (col = csome_list_var.first(); (!(((NIL != doneP)
                                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                                  {
                                    SubLObject _prev_bind_0_4 = wff_vars.$wff_violations$.currentBinding(thread);
                                    SubLObject _prev_bind_1_5 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                    try {
                                      wff_vars.$wff_violations$.bind(NIL, thread);
                                      at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                      if ((NIL == fort_types_interface.fort_has_typeP(arg, col, UNPROVIDED))) {
                                        if ((NIL == at_defns.defns_admitP(col, arg, UNPROVIDED))) {
                                          if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11260");
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11261");
                                          }
                                          result = T;
                                          doneP = at_utilities.at_finishedP(result);
                                        }
                                      }
                                    } finally {
                                      at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_5, thread);
                                      wff_vars.$wff_violations$.rebind(_prev_bind_0_4, thread);
                                    }
                                  }
                                }
                              }
                            }
                            if ((NIL == doneP)) {
                              {
                                SubLObject csome_list_var = other_arg_isas;
                                SubLObject col = NIL;
                                for (col = csome_list_var.first(); (!(((NIL != doneP)
                                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                                  {
                                    SubLObject _prev_bind_0_6 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                      wff_vars.$wff_violations$.bind(NIL, thread);
                                      if ((NIL == at_defns.has_typeP(arg, col, UNPROVIDED))) {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11262");
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11263");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      }
                                    } finally {
                                      wff_vars.$wff_violations$.rebind(_prev_bind_0_6, thread);
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_2, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_1, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_7 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_8 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw6$ARG_ISA);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      {
                        SubLObject fort_type_arg_isas = list_utilities.remove_if_not($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject other_arg_isas = Sequences.remove_if($sym7$VALID_FORT_TYPE_, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        arg_isas_foundP = T;
                        if ((NIL == doneP)) {
                          {
                            SubLObject csome_list_var = fort_type_arg_isas;
                            SubLObject col = NIL;
                            for (col = csome_list_var.first(); (!(((NIL != doneP)
                                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                              {
                                SubLObject _prev_bind_0_9 = wff_vars.$wff_violations$.currentBinding(thread);
                                SubLObject _prev_bind_1_10 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                try {
                                  wff_vars.$wff_violations$.bind(NIL, thread);
                                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                  if ((NIL == fort_types_interface.fort_has_typeP(arg, col, UNPROVIDED))) {
                                    if ((NIL == at_defns.defns_admitP(col, arg, UNPROVIDED))) {
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11264");
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11265");
                                      }
                                      result = T;
                                      doneP = at_utilities.at_finishedP(result);
                                    }
                                  }
                                } finally {
                                  at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_10, thread);
                                  wff_vars.$wff_violations$.rebind(_prev_bind_0_9, thread);
                                }
                              }
                            }
                          }
                        }
                        if ((NIL == doneP)) {
                          {
                            SubLObject csome_list_var = other_arg_isas;
                            SubLObject col = NIL;
                            for (col = csome_list_var.first(); (!(((NIL != doneP)
                                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                              {
                                SubLObject _prev_bind_0_11 = wff_vars.$wff_violations$.currentBinding(thread);
                                try {
                                  wff_vars.$wff_violations$.bind(NIL, thread);
                                  if ((NIL == at_defns.has_typeP(arg, col, UNPROVIDED))) {
                                    if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11266");
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11267");
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                  }
                                } finally {
                                  wff_vars.$wff_violations$.rebind(_prev_bind_0_11, thread);
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_8, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_7, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        if (((NIL != at_vars.at_some_arg_isa_requiredP())
             && (NIL == doneP))) {
          if ((NIL != arg_isas_foundP)) {
            result = NIL;
          } else {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7213");
            result = T;
          }
        }
        return result;
      }
    }
  }

  /** are any arg-isa collections applicable to arg number 
   <argnum> of relation <reln> known to not include <arg> */
  @SubL(source = "cycl/at-routines.lisp", position = 4912) 
  public static final SubLObject mal_arg_not_isa_disjointP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_12 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_13 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_14 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw6$ARG_ISA);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          {
                            SubLObject isa_collections = arg_collections(arg, $kw17$ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                            {
                              SubLObject _prev_bind_0_15 = sdc.$ignoring_sdcP$.currentBinding(thread);
                              try {
                                sdc.$ignoring_sdcP$.bind(makeBoolean((NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread))), thread);
                                if ((NIL == doneP)) {
                                  {
                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_isa = NIL;
                                    for (arg_isa = csome_list_var.first(); (!(((NIL != doneP)
                                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg_isa = csome_list_var.first()) {
                                      {
                                        SubLObject _prev_bind_0_16 = wff_vars.$wff_violations$.currentBinding(thread);
                                        try {
                                          wff_vars.$wff_violations$.bind(NIL, thread);
                                          if ((NIL == forts.fort_p(arg_isa))) {
                                          } else if ((NIL != disjoint_with.any_disjoint_withP(isa_collections, arg_isa, UNPROVIDED, UNPROVIDED))) {
                                            if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11268");
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                          } else if ((($kw18$NAUT == at_vars.$at_arg_type$.getDynamicValue(thread))
                                               && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED)))) {
                                          } else if ((NIL != at_defns.defns_rejectP(arg_isa, arg, UNPROVIDED))) {
                                            if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11269");
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11270");
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                          }
                                        } finally {
                                          wff_vars.$wff_violations$.rebind(_prev_bind_0_16, thread);
                                        }
                                      }
                                    }
                                  }
                                }
                              } finally {
                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_15, thread);
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_14, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_13, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_12, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_17 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw6$ARG_ISA);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      {
                        SubLObject isa_collections = arg_collections(arg, $kw17$ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                        {
                          SubLObject _prev_bind_0_19 = sdc.$ignoring_sdcP$.currentBinding(thread);
                          try {
                            sdc.$ignoring_sdcP$.bind(makeBoolean((NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread))), thread);
                            if ((NIL == doneP)) {
                              {
                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                SubLObject arg_isa = NIL;
                                for (arg_isa = csome_list_var.first(); (!(((NIL != doneP)
                                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg_isa = csome_list_var.first()) {
                                  {
                                    SubLObject _prev_bind_0_20 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                      wff_vars.$wff_violations$.bind(NIL, thread);
                                      if ((NIL == forts.fort_p(arg_isa))) {
                                      } else if ((NIL != disjoint_with.any_disjoint_withP(isa_collections, arg_isa, UNPROVIDED, UNPROVIDED))) {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11271");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      } else if ((($kw18$NAUT == at_vars.$at_arg_type$.getDynamicValue(thread))
                                           && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED)))) {
                                      } else if ((NIL != at_defns.defns_rejectP(arg_isa, arg, UNPROVIDED))) {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11272");
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11273");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      }
                                    } finally {
                                      wff_vars.$wff_violations$.rebind(_prev_bind_0_20, thread);
                                    }
                                  }
                                }
                              }
                            }
                          } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_19, thread);
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_18, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_17, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** do the arg-quoted-isa collections applicable to arg number 
   <argnum> of relation <reln> include <arg>? */
  @SubL(source = "cycl/at-routines.lisp", position = 7192) 
  public static final SubLObject mal_arg_quoted_isaP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_21 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_22 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_23 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw21$ARG_QUOTED_ISA);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject col = NIL;
                              for (col = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                                {
                                  SubLObject _prev_bind_0_24 = wff_vars.$wff_violations$.currentBinding(thread);
                                  try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    if ((NIL == at_defns.quoted_has_typeP(arg, col, UNPROVIDED))) {
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11274");
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11275");
                                      }
                                      result = T;
                                      doneP = at_utilities.at_finishedP(result);
                                    }
                                  } finally {
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_24, thread);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_23, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_22, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_21, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_25 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_26 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw21$ARG_QUOTED_ISA);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject col = NIL;
                          for (col = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                            {
                              SubLObject _prev_bind_0_27 = wff_vars.$wff_violations$.currentBinding(thread);
                              try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                if ((NIL == at_defns.quoted_has_typeP(arg, col, UNPROVIDED))) {
                                  if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11276");
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11277");
                                  }
                                  result = T;
                                  doneP = at_utilities.at_finishedP(result);
                                }
                              } finally {
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_27, thread);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_26, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_25, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 8577) 
  public static final SubLObject mal_arg_not_quoted_isa_disjointP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_28 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_29 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_30 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw21$ARG_QUOTED_ISA);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          {
                            SubLObject quoted_isa_collections = arg_collections(arg, $kw24$QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                            {
                              SubLObject _prev_bind_0_31 = sdc.$ignoring_sdcP$.currentBinding(thread);
                              try {
                                sdc.$ignoring_sdcP$.bind(makeBoolean((NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread))), thread);
                                if ((NIL == doneP)) {
                                  {
                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_quoted_isa = NIL;
                                    for (arg_quoted_isa = csome_list_var.first(); (!(((NIL != doneP)
                                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg_quoted_isa = csome_list_var.first()) {
                                      {
                                        SubLObject _prev_bind_0_32 = wff_vars.$wff_violations$.currentBinding(thread);
                                        try {
                                          wff_vars.$wff_violations$.bind(NIL, thread);
                                          if ((NIL == forts.fort_p(arg_quoted_isa))) {
                                          } else if (((reln == $const25$termOfUnit)
                                               && (argnum == TWO_INTEGER)
                                               && (arg_quoted_isa == $const26$CycLReifiableNonAtomicTerm)
                                               && (NIL != Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5368")))) {
                                          } else if ((NIL != disjoint_with.any_disjoint_withP(quoted_isa_collections, arg_quoted_isa, UNPROVIDED, UNPROVIDED))) {
                                            if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11278");
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                          } else if ((($kw18$NAUT == at_vars.$at_arg_type$.getDynamicValue(thread))
                                               && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED)))) {
                                          } else if ((NIL != Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5427"))) {
                                            if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11279");
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11280");
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                          }
                                        } finally {
                                          wff_vars.$wff_violations$.rebind(_prev_bind_0_32, thread);
                                        }
                                      }
                                    }
                                  }
                                }
                              } finally {
                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_31, thread);
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_30, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_29, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_28, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_33 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_34 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw21$ARG_QUOTED_ISA);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      {
                        SubLObject quoted_isa_collections = arg_collections(arg, $kw24$QUOTED_ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                        {
                          SubLObject _prev_bind_0_35 = sdc.$ignoring_sdcP$.currentBinding(thread);
                          try {
                            sdc.$ignoring_sdcP$.bind(makeBoolean((NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread))), thread);
                            if ((NIL == doneP)) {
                              {
                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                SubLObject arg_quoted_isa = NIL;
                                for (arg_quoted_isa = csome_list_var.first(); (!(((NIL != doneP)
                                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg_quoted_isa = csome_list_var.first()) {
                                  {
                                    SubLObject _prev_bind_0_36 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                      wff_vars.$wff_violations$.bind(NIL, thread);
                                      if ((NIL == forts.fort_p(arg_quoted_isa))) {
                                      } else if (((reln == $const25$termOfUnit)
                                           && (argnum == TWO_INTEGER)
                                           && (arg_quoted_isa == $const26$CycLReifiableNonAtomicTerm)
                                           && (NIL != Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5369")))) {
                                      } else if ((NIL != disjoint_with.any_disjoint_withP(quoted_isa_collections, arg_quoted_isa, UNPROVIDED, UNPROVIDED))) {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11281");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      } else if ((($kw18$NAUT == at_vars.$at_arg_type$.getDynamicValue(thread))
                                           && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), arg, UNPROVIDED, UNPROVIDED)))) {
                                      } else if ((NIL != Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5428"))) {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11282");
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11283");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      }
                                    } finally {
                                      wff_vars.$wff_violations$.rebind(_prev_bind_0_36, thread);
                                    }
                                  }
                                }
                              }
                            }
                          } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_35, thread);
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_34, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_33, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** do the arg-genl collections applicable to arg 
   number <argnum> of relation <reln> include <arg>? */
  @SubL(source = "cycl/at-routines.lisp", position = 10481) 
  public static final SubLObject mal_arg_genlsP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_37 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_38 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_39 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw28$ARG_GENLS);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL != fort_types_interface.collection_p(arg))) {
                            $at_applicable_arg_types$.setDynamicValue(Sequences.remove($const29$Thing, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                          }
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject col = NIL;
                              for (col = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                                if (((NIL != forts.fort_p(col))
                                     && (NIL != at_defns.at_denotational_term_p(arg, UNPROVIDED)))) {
                                  if ((NIL == genls.genlP(arg, col, UNPROVIDED, UNPROVIDED))) {
                                    if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11284");
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          result = NIL;
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_39, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_38, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_37, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_40 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_41 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw28$ARG_GENLS);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL != fort_types_interface.collection_p(arg))) {
                        $at_applicable_arg_types$.setDynamicValue(Sequences.remove($const29$Thing, $at_applicable_arg_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                      }
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject col = NIL;
                          for (col = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
                            if (((NIL != forts.fort_p(col))
                                 && (NIL != at_defns.at_denotational_term_p(arg, UNPROVIDED)))) {
                              if ((NIL == genls.genlP(arg, col, UNPROVIDED, UNPROVIDED))) {
                                if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11285");
                                }
                                result = T;
                                doneP = at_utilities.at_finishedP(result);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      result = NIL;
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_41, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_40, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** are any arg-isa collections applicable to arg number 
   <argnum> of relation <reln> known to not include <arg>? */
  @SubL(source = "cycl/at-routines.lisp", position = 12280) 
  public static final SubLObject mal_arg_not_genls_disjointP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_42 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_43 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_44 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw28$ARG_GENLS);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          {
                            SubLObject genl_collections = arg_collections(arg, $kw31$GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                            {
                              SubLObject _prev_bind_0_45 = sdc.$ignoring_sdcP$.currentBinding(thread);
                              try {
                                sdc.$ignoring_sdcP$.bind(makeBoolean((NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread))), thread);
                                if ((NIL == doneP)) {
                                  {
                                    SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                    SubLObject arg_genl = NIL;
                                    for (arg_genl = csome_list_var.first(); (!(((NIL != doneP)
                                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg_genl = csome_list_var.first()) {
                                      if ((NIL != forts.fort_p(arg_genl))) {
                                        if ((NIL != disjoint_with.any_disjoint_withP(genl_collections, arg_genl, UNPROVIDED, UNPROVIDED))) {
                                          if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11286");
                                          }
                                          result = T;
                                          doneP = at_utilities.at_finishedP(result);
                                        }
                                      }
                                    }
                                  }
                                }
                              } finally {
                                sdc.$ignoring_sdcP$.rebind(_prev_bind_0_45, thread);
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_44, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_43, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_42, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_46 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_47 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw28$ARG_GENLS);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      {
                        SubLObject genl_collections = arg_collections(arg, $kw31$GENLS, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                        {
                          SubLObject _prev_bind_0_48 = sdc.$ignoring_sdcP$.currentBinding(thread);
                          try {
                            sdc.$ignoring_sdcP$.bind(makeBoolean((NIL == at_vars.$at_check_not_sdcP$.getDynamicValue(thread))), thread);
                            if ((NIL == doneP)) {
                              {
                                SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                                SubLObject arg_genl = NIL;
                                for (arg_genl = csome_list_var.first(); (!(((NIL != doneP)
                                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg_genl = csome_list_var.first()) {
                                  if ((NIL != forts.fort_p(arg_genl))) {
                                    if ((NIL != disjoint_with.any_disjoint_withP(genl_collections, arg_genl, UNPROVIDED, UNPROVIDED))) {
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11287");
                                      }
                                      result = T;
                                      doneP = at_utilities.at_finishedP(result);
                                    }
                                  }
                                }
                              }
                            }
                          } finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_48, thread);
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_47, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_46, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 13816) 
  public static final SubLObject mal_arg_formatP(SubLObject reln, SubLObject arg, SubLObject argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_49 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_50 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_51 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_arg_type_collections(reln, argnum, $kw33$FORMAT);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject format = NIL;
                              for (format = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), format = csome_list_var.first()) {
                                {
                                  SubLObject _prev_bind_0_52 = at_vars.$gather_at_format_violationsP$.currentBinding(thread);
                                  SubLObject _prev_bind_1_53 = at_vars.$at_format_violations$.currentBinding(thread);
                                  try {
                                    at_vars.$gather_at_format_violationsP$.bind(T, thread);
                                    at_vars.$at_format_violations$.bind(NIL, thread);
                                    if ((NIL == arg_type.memoized_format_okP(format, at_vars.$at_formula$.getDynamicValue(thread), argnum, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11288");
                                      }
                                      result = T;
                                      doneP = at_utilities.at_finishedP(result);
                                    }
                                  } finally {
                                    at_vars.$at_format_violations$.rebind(_prev_bind_1_53, thread);
                                    at_vars.$gather_at_format_violationsP$.rebind(_prev_bind_0_52, thread);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_51, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_50, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_49, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_54 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_55 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_arg_type_collections(reln, argnum, $kw33$FORMAT);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject format = NIL;
                          for (format = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), format = csome_list_var.first()) {
                            {
                              SubLObject _prev_bind_0_56 = at_vars.$gather_at_format_violationsP$.currentBinding(thread);
                              SubLObject _prev_bind_1_57 = at_vars.$at_format_violations$.currentBinding(thread);
                              try {
                                at_vars.$gather_at_format_violationsP$.bind(T, thread);
                                at_vars.$at_format_violations$.bind(NIL, thread);
                                if ((NIL == arg_type.memoized_format_okP(format, at_vars.$at_formula$.getDynamicValue(thread), argnum, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
                                  if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11289");
                                  }
                                  result = T;
                                  doneP = at_utilities.at_finishedP(result);
                                }
                              } finally {
                                at_vars.$at_format_violations$.rebind(_prev_bind_1_57, thread);
                                at_vars.$gather_at_format_violationsP$.rebind(_prev_bind_0_56, thread);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_55, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_54, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** the inter-arg-isa collections applicable to arg number 
   <argnum> of relation <reln> that do not include <arg> */
  @SubL(source = "cycl/at-routines.lisp", position = 15079) 
  public static final SubLObject mal_inter_arg_isaP(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))
             && (NIL != reln)
             && (NIL != ind_arg)
             && (NIL != dep_arg)
             && ind_argnum.isInteger())))) {
        return NIL;
      }
      if ((!(((NIL == at_utilities.inter_arg_isa_cache_initializedP())
            || (NIL != at_utilities.some_inter_arg_isa_constraint_somewhereP(reln)))))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_58 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_59 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_60 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw35$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject inter_arg_isas = NIL;
                              for (inter_arg_isas = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_isas = csome_list_var.first()) {
                                {
                                  SubLObject _prev_bind_0_61 = wff_vars.$wff_violations$.currentBinding(thread);
                                  SubLObject _prev_bind_1_62 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                  try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                    {
                                      SubLObject datum = inter_arg_isas;
                                      SubLObject current = datum;
                                      SubLObject ind_arg_isa = NIL;
                                      SubLObject dep_arg_isa = NIL;
                                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                      ind_arg_isa = current.first();
                                      current = current.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                      dep_arg_isa = current.first();
                                      current = current.rest();
                                      if ((NIL == current)) {
                                        if ((NIL != forts.fort_p(dep_arg_isa))) {
                                          if ((NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED))) {
                                          } else if ((NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED))) {
                                          } else {
                                            if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11290");
                                              Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11291");
                                            }
                                            result = T;
                                            doneP = at_utilities.at_finishedP(result);
                                          }
                                        }
                                      } else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                                      }
                                    }
                                  } finally {
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_62, thread);
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_61, thread);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_60, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_59, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_58, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_63 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_64 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw35$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject inter_arg_isas = NIL;
                          for (inter_arg_isas = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_isas = csome_list_var.first()) {
                            {
                              SubLObject _prev_bind_0_65 = wff_vars.$wff_violations$.currentBinding(thread);
                              SubLObject _prev_bind_1_66 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                              try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                {
                                  SubLObject datum = inter_arg_isas;
                                  SubLObject current = datum;
                                  SubLObject ind_arg_isa = NIL;
                                  SubLObject dep_arg_isa = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                  ind_arg_isa = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                  dep_arg_isa = current.first();
                                  current = current.rest();
                                  if ((NIL == current)) {
                                    if ((NIL != forts.fort_p(dep_arg_isa))) {
                                      if ((NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED))) {
                                      } else if ((NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED))) {
                                      } else {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11292");
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11293");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      }
                                    }
                                  } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                                  }
                                }
                              } finally {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_66, thread);
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_65, thread);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_64, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_63, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** the inter-arg-not-isa collections applicable to arg number 
   <argnum> of relation <reln> that do not include <arg> */
  @SubL(source = "cycl/at-routines.lisp", position = 18180) 
  public static final SubLObject mal_inter_arg_not_isaP(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread))
             && (NIL != reln)
             && (NIL != ind_arg)
             && (NIL != dep_arg)
             && ind_argnum.isInteger())))) {
        return NIL;
      }
      if ((NIL == some_inter_arg_not_isa_constraint_somewhereP(reln))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_67 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_68 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_69 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw40$INTER_ARG_NOT_ISA, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject inter_arg_not_isas = NIL;
                              for (inter_arg_not_isas = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_not_isas = csome_list_var.first()) {
                                {
                                  SubLObject _prev_bind_0_70 = wff_vars.$wff_violations$.currentBinding(thread);
                                  SubLObject _prev_bind_1_71 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                                  try {
                                    wff_vars.$wff_violations$.bind(NIL, thread);
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                    {
                                      SubLObject datum = inter_arg_not_isas;
                                      SubLObject current = datum;
                                      SubLObject ind_arg_isa = NIL;
                                      SubLObject dep_arg_isa = NIL;
                                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                      ind_arg_isa = current.first();
                                      current = current.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                      dep_arg_isa = current.first();
                                      current = current.rest();
                                      if ((NIL == current)) {
                                        if ((NIL != forts.fort_p(dep_arg_isa))) {
                                          {
                                            SubLObject module = NIL;
                                            if ((NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED))) {
                                              module = $kw41$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                                              result = T;
                                              doneP = at_utilities.at_finishedP(result);
                                            } else if ((NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED))) {
                                              module = $kw42$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                              result = T;
                                              doneP = at_utilities.at_finishedP(result);
                                            }
                                            if ((NIL != module)) {
                                              if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                                Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11294");
                                                Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11295");
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                                      }
                                    }
                                  } finally {
                                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_71, thread);
                                    wff_vars.$wff_violations$.rebind(_prev_bind_0_70, thread);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_69, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_68, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_67, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_72 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_73 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw40$INTER_ARG_NOT_ISA, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject inter_arg_not_isas = NIL;
                          for (inter_arg_not_isas = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_not_isas = csome_list_var.first()) {
                            {
                              SubLObject _prev_bind_0_74 = wff_vars.$wff_violations$.currentBinding(thread);
                              SubLObject _prev_bind_1_75 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                              try {
                                wff_vars.$wff_violations$.bind(NIL, thread);
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                                {
                                  SubLObject datum = inter_arg_not_isas;
                                  SubLObject current = datum;
                                  SubLObject ind_arg_isa = NIL;
                                  SubLObject dep_arg_isa = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                  ind_arg_isa = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                  dep_arg_isa = current.first();
                                  current = current.rest();
                                  if ((NIL == current)) {
                                    if ((NIL != forts.fort_p(dep_arg_isa))) {
                                      {
                                        SubLObject module = NIL;
                                        if ((NIL != isa.isaP(dep_arg, dep_arg_isa, UNPROVIDED, UNPROVIDED))) {
                                          module = $kw41$MAL_ARG_WRT_INTER_ARG_NOT_ISA;
                                          result = T;
                                          doneP = at_utilities.at_finishedP(result);
                                        } else if ((NIL != at_defns.defns_admitP(dep_arg_isa, dep_arg, UNPROVIDED))) {
                                          module = $kw42$MAL_ARG_WRT_INTER_ARG_NOT_DEFN;
                                          result = T;
                                          doneP = at_utilities.at_finishedP(result);
                                        }
                                        if ((NIL != module)) {
                                          if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11296");
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11297");
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                                  }
                                }
                              } finally {
                                at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_1_75, thread);
                                wff_vars.$wff_violations$.rebind(_prev_bind_0_74, thread);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_73, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_72, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 19729) 
  public static final SubLObject some_inter_arg_not_isa_constraint_somewhereP(SubLObject reln) {
    return makeBoolean(((NIL != somewhere_cache.some_pred_assertion_somewhereP($const43$interArgNotIsa1_2, reln, ONE_INTEGER, UNPROVIDED))
          || (NIL != somewhere_cache.some_pred_assertion_somewhereP($const44$interArgNotIsa2_1, reln, ONE_INTEGER, UNPROVIDED))));
  }

  /** the inter-arg-isa collections applicable to arg number 
   <argnum> of relation <reln> that are known to not include <arg> */
  @SubL(source = "cycl/at-routines.lisp", position = 21980) 
  public static final SubLObject mal_inter_arg_not_isa_disjointP(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread))
             && (NIL != at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread))
             && (NIL != ind_arg)
             && ind_argnum.isInteger())))) {
        return NIL;
      }
      if ((!(((NIL == at_utilities.inter_arg_isa_cache_initializedP())
            || (NIL != at_utilities.some_inter_arg_isa_constraint_somewhereP(reln)))))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_99 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_100 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_101 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw35$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject inter_arg_isas = NIL;
                              for (inter_arg_isas = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_isas = csome_list_var.first()) {
                                {
                                  SubLObject datum = inter_arg_isas;
                                  SubLObject current = datum;
                                  SubLObject ind_arg_isa = NIL;
                                  SubLObject dep_arg_isa = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                  ind_arg_isa = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                                  dep_arg_isa = current.first();
                                  current = current.rest();
                                  if ((NIL == current)) {
                                    if ((NIL != forts.fort_p(dep_arg_isa))) {
                                      {
                                        SubLObject isa_collections = arg_collections(dep_arg, $kw17$ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                        if ((NIL != disjoint_with.any_disjoint_withP(isa_collections, dep_arg_isa, UNPROVIDED, UNPROVIDED))) {
                                          if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11298");
                                          }
                                          result = T;
                                          doneP = at_utilities.at_finishedP(result);
                                        }
                                      }
                                      {
                                        SubLObject _prev_bind_0_102 = wff_vars.$wff_violations$.currentBinding(thread);
                                        try {
                                          wff_vars.$wff_violations$.bind(NIL, thread);
                                          if ((NIL == doneP)) {
                                            if ((($kw18$NAUT == at_vars.$at_arg_type$.getDynamicValue(thread))
                                                 && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), dep_arg, UNPROVIDED, UNPROVIDED)))) {
                                            } else if ((NIL != at_defns.defns_rejectP(dep_arg_isa, dep_arg, UNPROVIDED))) {
                                              if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                                Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11299");
                                                Errors
														.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11300");
                                              }
                                              result = T;
                                              doneP = at_utilities.at_finishedP(result);
                                            }
                                          }
                                        } finally {
                                          wff_vars.$wff_violations$.rebind(_prev_bind_0_102, thread);
                                        }
                                      }
                                    }
                                  } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_101, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_100, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_99, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_103 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_104 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw35$INTER_ARG_ISA, at_vars.$at_check_non_constant_inter_arg_isaP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject inter_arg_isas = NIL;
                          for (inter_arg_isas = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_isas = csome_list_var.first()) {
                            {
                              SubLObject datum = inter_arg_isas;
                              SubLObject current = datum;
                              SubLObject ind_arg_isa = NIL;
                              SubLObject dep_arg_isa = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                              ind_arg_isa = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                              dep_arg_isa = current.first();
                              current = current.rest();
                              if ((NIL == current)) {
                                if ((NIL != forts.fort_p(dep_arg_isa))) {
                                  {
                                    SubLObject isa_collections = arg_collections(dep_arg, $kw17$ISA, at_vars.$at_arg_type$.getDynamicValue(thread), mt_relevance_macros.mt_info(UNPROVIDED));
                                    if ((NIL != disjoint_with.any_disjoint_withP(isa_collections, dep_arg_isa, UNPROVIDED, UNPROVIDED))) {
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11301");
                                      }
                                      result = T;
                                      doneP = at_utilities.at_finishedP(result);
                                    }
                                  }
                                  {
                                    SubLObject _prev_bind_0_105 = wff_vars.$wff_violations$.currentBinding(thread);
                                    try {
                                      wff_vars.$wff_violations$.bind(NIL, thread);
                                      if ((NIL == doneP)) {
                                        if ((($kw18$NAUT == at_vars.$at_arg_type$.getDynamicValue(thread))
                                             && (NIL != cycl_utilities.formula_find_if(Symbols.symbol_function($sym19$VARIABLE_TERM_WRT_ARG_TYPE_), dep_arg, UNPROVIDED, UNPROVIDED)))) {
                                        } else if ((NIL != at_defns.defns_rejectP(dep_arg_isa, dep_arg, UNPROVIDED))) {
                                          if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11302");
                                            Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11303");
                                          }
                                          result = T;
                                          doneP = at_utilities.at_finishedP(result);
                                        }
                                      }
                                    } finally {
                                      wff_vars.$wff_violations$.rebind(_prev_bind_0_105, thread);
                                    }
                                  }
                                }
                              } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_104, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_103, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** the inter-arg-format collections applicable to arg number 
   <argnum> of relation <reln> that do not include <arg> */
  @SubL(source = "cycl/at-routines.lisp", position = 25616) 
  public static final SubLObject mal_inter_arg_formatP(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread))
             && (NIL != ind_arg)
             && ind_argnum.isInteger())))) {
        return NIL;
      }
      if ((!(((NIL == at_utilities.inter_arg_format_cache_initializedP())
            || (NIL != at_utilities.some_inter_arg_format_constraint_somewhereP(reln)))))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_111 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_112 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_113 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw67$INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue(thread));
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject inter_arg_format = NIL;
                              for (inter_arg_format = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_format = csome_list_var.first()) {
                                {
                                  SubLObject datum = inter_arg_format;
                                  SubLObject current = datum;
                                  SubLObject ind_arg_isa = NIL;
                                  SubLObject dep_arg_format = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
                                  ind_arg_isa = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
                                  dep_arg_format = current.first();
                                  current = current.rest();
                                  if ((NIL == current)) {
                                    if ((NIL == arg_type.memoized_format_okP(dep_arg_format, at_vars.$at_formula$.getDynamicValue(thread), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11304");
                                      }
                                      result = T;
                                      doneP = at_utilities.at_finishedP(result);
                                    }
                                  } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list68);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_113, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_112, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_111, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_114 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_115 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw67$INTER_ARG_FORMAT, at_vars.$at_check_non_constant_inter_arg_formatP$.getDynamicValue(thread));
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject inter_arg_format = NIL;
                          for (inter_arg_format = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_format = csome_list_var.first()) {
                            {
                              SubLObject datum = inter_arg_format;
                              SubLObject current = datum;
                              SubLObject ind_arg_isa = NIL;
                              SubLObject dep_arg_format = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
                              ind_arg_isa = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list68);
                              dep_arg_format = current.first();
                              current = current.rest();
                              if ((NIL == current)) {
                                if ((NIL == arg_type.memoized_format_okP(dep_arg_format, at_vars.$at_formula$.getDynamicValue(thread), dep_argnum, mt_relevance_macros.$mt$.getDynamicValue(thread)))) {
                                  if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11305");
                                  }
                                  result = T;
                                  doneP = at_utilities.at_finishedP(result);
                                }
                              } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list68);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_115, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_114, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 27031) 
  public static final SubLObject some_inter_arg_different_assertion_somewhereP(SubLObject reln) {
    return somewhere_cache.some_pred_assertion_somewhereP($const70$interArgDifferent, reln, ONE_INTEGER, UNPROVIDED);
  }

  @SubL(source = "cycl/at-routines.lisp", position = 27215) 
  public static final SubLObject some_inter_arg_different_constraint_somewhereP(SubLObject reln) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject found_oneP = NIL;
        if ((NIL != fort_types_interface.predicateP(reln))) {
          if ((NIL == found_oneP)) {
            {
              SubLObject module = sbhl_module_vars.get_sbhl_module($const48$genlPreds);
              SubLObject node_var = reln;
              SubLObject deck_type = (($kw49$DEPTH == $kw49$DEPTH) ? ((SubLObject) $kw50$STACK) : $kw51$QUEUE);
              SubLObject recur_deck = deck.create_deck(deck_type);
              SubLObject node_and_predicate_mode = NIL;
              {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  {
                    SubLObject tv_var = NIL;
                    {
                      SubLObject _prev_bind_0_116 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym52$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw53$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw56$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2098");
                                } else if (pcase_var.eql($kw58$WARN)) {
                                  Errors.warn($str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str59$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str57$continue_anyway, $str54$_A_is_not_a__A, tv_var, $sym55$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_117 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                          SubLObject _prev_bind_1_118 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(reln, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                              {
                                SubLObject _prev_bind_0_119 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_120 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_121 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                  sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                  sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                  node_and_predicate_mode = list(reln, sbhl_search_vars.genl_inverse_mode_p());
                                  while (((NIL != node_and_predicate_mode)
                                       && (NIL == found_oneP))) {
                                    {
                                      SubLObject node_var_122 = node_and_predicate_mode.first();
                                      SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                      SubLObject genl_pred = node_var_122;
                                      {
                                        SubLObject _prev_bind_0_123 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                          {
                                            SubLObject inverse_mode = predicate_mode;
                                            if ((NIL != some_inter_arg_different_assertion_somewhereP(genl_pred))) {
                                              found_oneP = T;
                                            }
                                            {
                                              SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                              SubLObject rest = NIL;
                                              for (rest = accessible_modules; (!(((NIL != found_oneP)
                                                    || (NIL == rest)))); rest = rest.rest()) {
                                                {
                                                  SubLObject module_var = rest.first();
                                                  {
                                                    SubLObject _prev_bind_0_124 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_125 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                      sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                      {
                                                        SubLObject node = function_terms.naut_to_nart(node_var_122);
                                                        if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                          {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if ((NIL != d_link)) {
                                                              {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if ((NIL != mt_links)) {
                                                                  {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while ((!(((NIL != found_oneP)
                                                                          || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                      thread.resetMultipleValues();
                                                                      {
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                          {
                                                                            SubLObject _prev_bind_0_126 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                              sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                              {
                                                                                SubLObject iteration_state_127 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                while ((!(((NIL != found_oneP)
                                                                                      || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_127)))))) {
                                                                                  thread.resetMultipleValues();
                                                                                  {
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_127);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                      {
                                                                                        SubLObject _prev_bind_0_128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                          {
                                                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9231")) : link_nodes);
                                                                                            SubLObject rest_129 = NIL;
                                                                                            for (rest_129 = new_list; (!(((NIL != found_oneP)
                                                                                                  || (NIL == rest_129)))); rest_129 = rest_129.rest()) {
                                                                                              {
                                                                                                SubLObject node_vars_link_node = rest_129.first();
                                                                                                if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                  deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } finally {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_128, thread);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    iteration_state_127 = dictionary_contents.do_dictionary_contents_next(iteration_state_127);
                                                                                  }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_127);
                                                                              }
                                                                            } finally {
                                                                              sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_126, thread);
                                                                            }
                                                                          }
                                                                        }
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                      }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str60$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                          }
                                                        } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                          {
                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9232")) : Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2507"));
                                                            SubLObject rest_130 = NIL;
                                                            for (rest_130 = new_list; (!(((NIL != found_oneP)
                                                                  || (NIL == rest_130)))); rest_130 = rest_130.rest()) {
                                                              {
                                                                SubLObject generating_fn = rest_130.first();
                                                                {
                                                                  SubLObject _prev_bind_0_131 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                  try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    {
                                                                      SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                      SubLObject new_list_132 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9233")) : link_nodes);
                                                                      SubLObject rest_133 = NIL;
                                                                      for (rest_133 = new_list_132; (!(((NIL != found_oneP)
                                                                            || (NIL == rest_133)))); rest_133 = rest_133.rest()) {
                                                                        {
                                                                          SubLObject node_vars_link_node = rest_133.first();
                                                                          if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_131, thread);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_125, thread);
                                                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_124, thread);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_123, thread);
                                        }
                                      }
                                    }
                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                  }
                                } finally {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_121, thread);
                                  sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_120, thread);
                                  sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_119, thread);
                                }
                              }
                            } else {
                              sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str61$Node__a_does_not_pass_sbhl_type_t, reln, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                          } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_118, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_117, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_116, thread);
                      }
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                  }
                } finally {
                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        } else {
          found_oneP = some_inter_arg_different_assertion_somewhereP(reln);
        }
        return found_oneP;
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 27653) 
  public static final SubLObject mal_inter_arg_differentP(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_arg, SubLObject dep_argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread))) {
        return NIL;
      }
      if ((NIL == some_inter_arg_different_constraint_somewhereP(reln))) {
        return NIL;
      }
      {
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        {
          SubLObject _prev_bind_0 = $at_applicable_arg_types$.currentBinding(thread);
          SubLObject _prev_bind_1 = $at_applicable_arg_types_with_assertions$.currentBinding(thread);
          try {
            $at_applicable_arg_types$.bind(NIL, thread);
            $at_applicable_arg_types_with_assertions$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
            if ((reln == $const5$Quote)) {
              {
                SubLObject _prev_bind_0_134 = cycl_grammar.$within_quote_form$.currentBinding(thread);
                try {
                  cycl_grammar.$within_quote_form$.bind(T, thread);
                  {
                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    {
                      SubLObject _prev_bind_0_135 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                      SubLObject _prev_bind_1_136 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                      SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                      try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw71$INTER_ARG_DIFFERENT, T);
                        if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                          if ((NIL == doneP)) {
                            {
                              SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                              SubLObject inter_arg_different = NIL;
                              for (inter_arg_different = csome_list_var.first(); (!(((NIL != doneP)
                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_different = csome_list_var.first()) {
                                {
                                  SubLObject datum = inter_arg_different;
                                  SubLObject current = datum;
                                  SubLObject argnum1 = NIL;
                                  SubLObject argnum2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                                  argnum1 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                                  argnum2 = current.first();
                                  current = current.rest();
                                  if ((NIL == current)) {
                                    if (((argnum1 == dep_argnum)
                                         && (argnum2 == ind_argnum))) {
                                      if ((NIL != equals.equalsP(dep_arg, ind_arg, UNPROVIDED, UNPROVIDED))) {
                                        if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11306");
                                        }
                                        result = T;
                                        doneP = at_utilities.at_finishedP(result);
                                      }
                                    }
                                  } else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_136, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_135, thread);
                      }
                    }
                  }
                } finally {
                  cycl_grammar.$within_quote_form$.rebind(_prev_bind_0_134, thread);
                }
              }
            } else {
              {
                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                {
                  SubLObject _prev_bind_0_137 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                  SubLObject _prev_bind_1_138 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TEN_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, $kw71$INTER_ARG_DIFFERENT, T);
                    if ((NIL != $at_applicable_arg_types$.getDynamicValue(thread))) {
                      if ((NIL == doneP)) {
                        {
                          SubLObject csome_list_var = $at_applicable_arg_types$.getDynamicValue(thread);
                          SubLObject inter_arg_different = NIL;
                          for (inter_arg_different = csome_list_var.first(); (!(((NIL != doneP)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), inter_arg_different = csome_list_var.first()) {
                            {
                              SubLObject datum = inter_arg_different;
                              SubLObject current = datum;
                              SubLObject argnum1 = NIL;
                              SubLObject argnum2 = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                              argnum1 = current.first();
                              current = current.rest();
                              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                              argnum2 = current.first();
                              current = current.rest();
                              if ((NIL == current)) {
                                if (((argnum1 == dep_argnum)
                                     && (argnum2 == ind_argnum))) {
                                  if ((NIL != equals.equalsP(dep_arg, ind_arg, UNPROVIDED, UNPROVIDED))) {
                                    if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11307");
                                    }
                                    result = T;
                                    doneP = at_utilities.at_finishedP(result);
                                  }
                                }
                              } else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
                              }
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_138, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_137, thread);
                  }
                }
              }
            }
          } finally {
            $at_applicable_arg_types_with_assertions$.rebind(_prev_bind_1, thread);
            $at_applicable_arg_types$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 29199) 
  private static SubLSymbol $arg_collections_caching_state$ = null;

  @SubL(source = "cycl/at-routines.lisp", position = 29199) 
  public static final SubLObject clear_arg_collections() {
    {
      SubLObject cs = $arg_collections_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  public static final class $clear_arg_collections$ZeroArityFunction extends ZeroArityFunction {
    public $clear_arg_collections$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-ARG-COLLECTIONS")); }
    public SubLObject processItem() { return clear_arg_collections(); }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 29199) 
  public static final SubLObject arg_collections_internal(SubLObject arg, SubLObject constraint_type, SubLObject v_arg_type, SubLObject mt_info) {
    {
      SubLObject pcase_var = constraint_type;
      if (pcase_var.eql($kw17$ISA)) {
        {
          SubLObject pcase_var_139 = v_arg_type;
          if (pcase_var_139.eql($kw75$STRONG_FORT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3657");
          } else if (pcase_var_139.eql($kw76$WEAK_FORT)) {
            return weak_fort_isa_collections(arg);
          } else if (pcase_var_139.eql($kw18$NAUT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11258");
          }
        }
      } else if (pcase_var.eql($kw24$QUOTED_ISA)) {
        {
          SubLObject pcase_var_140 = v_arg_type;
          if (pcase_var_140.eql($kw75$STRONG_FORT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3722");
          } else if (pcase_var_140.eql($kw76$WEAK_FORT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11313");
          } else if (pcase_var_140.eql($kw18$NAUT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11259");
          }
        }
      } else if (pcase_var.eql($kw31$GENLS)) {
        {
          SubLObject pcase_var_141 = v_arg_type;
          if (pcase_var_141.eql($kw75$STRONG_FORT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4989");
          } else if (pcase_var_141.eql($kw76$WEAK_FORT)) {
            return weak_fort_genls_collections(arg);
          } else if (pcase_var_141.eql($kw18$NAUT)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11257");
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-routines.lisp", position = 29199) 
  public static final SubLObject arg_collections(SubLObject arg, SubLObject constraint_type, SubLObject v_arg_type, SubLObject mt_info) {
    {
      SubLObject caching_state = $arg_collections_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym74$ARG_COLLECTIONS, $sym77$_ARG_COLLECTIONS_CACHING_STATE_, $int78$1024, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
        memoization_state.register_hl_store_cache_clear_callback($sym79$CLEAR_ARG_COLLECTIONS);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_4(arg, constraint_type, v_arg_type, mt_info);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw80$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (arg.equal(cached_args.first())) {
                  cached_args = cached_args.rest();
                  if (constraint_type.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_arg_type.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && mt_info.equal(cached_args.first()))) {
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
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(arg_collections_internal(arg, constraint_type, v_arg_type, mt_info)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(arg, constraint_type, v_arg_type, mt_info));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 30031) 
  public static final SubLObject weak_fort_isa_collections(SubLObject v_term) {
    if ((NIL != forts.fort_p(v_term))) {
      return isa.asserted_isa(v_term, UNPROVIDED);
    } else if ((NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED))) {
      return isa.asserted_isa(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10324"), UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-routines.lisp", position = 31964) 
  public static final SubLObject weak_fort_genls_collections(SubLObject v_term) {
    if ((NIL != forts.fort_p(v_term))) {
      return genls.asserted_genls(v_term, UNPROVIDED);
    } else if ((NIL != obsolete.reifiable_natP(v_term, UNPROVIDED, UNPROVIDED))) {
      return genls.asserted_genls(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10327"), UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/at-routines.lisp", position = 32969) 
  public static final SubLObject applicable_arg_type_collections(SubLObject reln, SubLObject argnum, SubLObject constraint_type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject constraint_pred = constraint_pred(constraint_type, argnum, reln);
        applicable_arg_type_collections_int(constraint_pred, reln, argnum, constraint_type, $kw11$SELF);
        if ((NIL != forts.fort_p(reln))) {
          {
            SubLObject asserted_genl_preds_or_inverseP = makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(reln, UNPROVIDED))
                || (NIL != genl_predicates.asserted_genl_inversesP(reln, UNPROVIDED))));
            if (((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                 && (NIL != asserted_genl_preds_or_inverseP))) {
              {
                SubLObject cdolist_list_var = genl_predicates.all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                SubLObject reln_genl_pred = NIL;
                for (reln_genl_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), reln_genl_pred = cdolist_list_var.first()) {
                  if ((reln_genl_pred != reln)) {
                    applicable_arg_type_collections_int(constraint_pred, reln_genl_pred, argnum, constraint_type, $kw82$VIA_GENL_PRED);
                  }
                }
              }
            }
            if (((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                 && (NIL != asserted_genl_preds_or_inverseP)
                 && (argnum.numE(ONE_INTEGER)
                  || argnum.numE(TWO_INTEGER)))) {
              {
                SubLObject inverse_constraint_pred = inverse_pred(constraint_type, argnum, reln);
                SubLObject inverse_argnum = kb_accessors.inverse_argnum(argnum);
                SubLObject cdolist_list_var = genl_predicates.all_genl_inverses(reln, UNPROVIDED, UNPROVIDED);
                SubLObject inverse_reln = NIL;
                for (inverse_reln = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), inverse_reln = cdolist_list_var.first()) {
                  if ((inverse_reln != reln)) {
                    applicable_arg_type_collections_int(inverse_constraint_pred, inverse_reln, inverse_argnum, constraint_type, $kw83$VIA_GENL_INVERSE);
                  }
                }
              }
            }
          }
        }
      }
      return $at_applicable_arg_types$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 34372) 
  public static final SubLObject applicable_arg_type_collections_int(SubLObject constraint_pred, SubLObject reln, SubLObject argnum, SubLObject constraint_type, SubLObject via) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == forts.fort_p(constraint_pred))) {
        return NIL;
      }
      if (((NIL == at_vars.$noting_at_violationsP$.getDynamicValue(thread))
           && (NIL != at_cache.at_cache_use_possibleP(constraint_pred, argnum)))) {
        {
          SubLObject cdolist_list_var = at_cache.cached_arg_isas_in_relevant_mts(reln, argnum);
          SubLObject v_arg_type = NIL;
          for (v_arg_type = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_arg_type = cdolist_list_var.first()) {
            {
              SubLObject item_var = v_arg_type;
              if ((NIL == conses_high.member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
              }
            }
          }
        }
      } else {
        {
          SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum(constraint_pred);
          if (constraint_argnum.isInteger()) {
            {
              SubLObject pred_var = constraint_pred;
              if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw84$GAF, $kw85$TRUE, NIL);
                            {
                              SubLObject done_var_142 = NIL;
                              SubLObject token_var_143 = NIL;
                              while ((NIL == done_var_142)) {
                                {
                                  SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_143);
                                  SubLObject valid_144 = makeBoolean((token_var_143 != assertion));
                                  if ((NIL != valid_144)) {
                                    {
                                      SubLObject v_arg_type = assertions_high.gaf_arg(assertion, constraint_argnum);
                                      SubLObject item_var = v_arg_type;
                                      if ((NIL == conses_high.member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                        $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                      }
                                      if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                                      }
                                    }
                                  }
                                  done_var_142 = makeBoolean((NIL == valid_144));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
            }
          }
        }
      }
      if ((NIL != at_vars.consider_multiargs_at_predP())) {
        {
          SubLObject cdolist_list_var = constraint_preds(constraint_type, argnum, reln);
          SubLObject at_pred = NIL;
          for (at_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), at_pred = cdolist_list_var.first()) {
            if ((at_pred != constraint_pred)) {
              if ((($const86$argsIsa != at_pred)
                  || (NIL != at_cache.some_args_isa_assertion_somewhereP(reln)))) {
                if ((($const87$argAndRestIsa != at_pred)
                    || (NIL != at_cache.some_arg_and_rest_isa_assertion_somewhereP(reln)))) {
                  {
                    SubLObject constraint_argnum = at_utilities.constraint_pred_constraint_argnum(at_pred);
                    SubLObject pred_var = at_pred;
                    if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var))) {
                      {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
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
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw84$GAF, $kw85$TRUE, NIL);
                                  {
                                    SubLObject done_var_145 = NIL;
                                    SubLObject token_var_146 = NIL;
                                    while ((NIL == done_var_145)) {
                                      {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_146);
                                        SubLObject valid_147 = makeBoolean((token_var_146 != assertion));
                                        if ((NIL != valid_147)) {
                                          {
                                            SubLObject v_arg_type = assertions_high.gaf_arg(assertion, constraint_argnum);
                                            SubLObject item_var = v_arg_type;
                                            if ((NIL == conses_high.member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                              $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                            }
                                            if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                              dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), v_arg_type, list(reln, via, assertion));
                                            }
                                          }
                                        }
                                        done_var_145 = makeBoolean((NIL == valid_147));
                                      }
                                    }
                                  }
                                } finally {
                                  {
                                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                      if ((NIL != final_index_iterator)) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                      }
                                    } finally {
                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
                  }
                }
              }
            }
          }
        }
      }
      return $at_applicable_arg_types$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 36353) 
  public static final SubLObject constraint_pred(SubLObject constraint_type, SubLObject argnum, SubLObject reln) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = constraint_type;
        if (pcase_var.eql($kw6$ARG_ISA)) {
          return kb_accessors.arg_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw21$ARG_QUOTED_ISA)) {
          return kb_accessors.arg_quoted_isa_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw28$ARG_GENLS)) {
          return kb_accessors.arg_genl_pred(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw33$FORMAT)) {
          return kb_accessors.argn_format_pred(argnum);
        } else {
          Errors.error($str88$Unknown_constraint_type__s, constraint_type);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 36788) 
  public static final SubLObject constraint_preds(SubLObject constraint_type, SubLObject argnum, SubLObject reln) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = constraint_type;
        if (pcase_var.eql($kw6$ARG_ISA)) {
          return kb_accessors.arg_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw21$ARG_QUOTED_ISA)) {
          return kb_accessors.arg_quoted_isa_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw28$ARG_GENLS)) {
          return kb_accessors.arg_genl_preds(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw33$FORMAT)) {
          return NIL;
        } else {
          Errors.error($str88$Unknown_constraint_type__s, constraint_type);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 37176) 
  public static final SubLObject inverse_pred(SubLObject constraint_type, SubLObject argnum, SubLObject reln) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = constraint_type;
        if (pcase_var.eql($kw6$ARG_ISA)) {
          return kb_accessors.arg_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw21$ARG_QUOTED_ISA)) {
          return kb_accessors.arg_quoted_isa_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw28$ARG_GENLS)) {
          return kb_accessors.arg_genl_inverse(argnum, reln, mt_relevance_macros.$mt$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw33$FORMAT)) {
          return kb_accessors.argn_format_inverse(argnum);
        } else {
          Errors.error($str88$Unknown_constraint_type__s, constraint_type);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 37621) 
  private static SubLSymbol $ind_arg_relevant_constraints$ = null;

  @SubL(source = "cycl/at-routines.lisp", position = 37674) 
  public static final SubLObject gather_ind_arg_relevant_constraints(SubLObject ind_arg, SubLObject constraint_type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = constraint_type;
        if (pcase_var.eql($kw35$INTER_ARG_ISA)) {
          $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
        } else if (pcase_var.eql($kw40$INTER_ARG_NOT_ISA)) {
          $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
        } else if (pcase_var.eql($kw62$INTER_ARG_GENL)) {
          $ind_arg_relevant_constraints$.setDynamicValue(genls.all_genls(ind_arg, UNPROVIDED, UNPROVIDED), thread);
        } else if (pcase_var.eql($kw67$INTER_ARG_FORMAT)) {
          $ind_arg_relevant_constraints$.setDynamicValue(isa.all_isa(ind_arg, UNPROVIDED, UNPROVIDED), thread);
        }
      }
      return $ind_arg_relevant_constraints$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 38187) 
  public static final SubLObject relevant_constraintP(SubLObject ind_arg, SubLObject ind_arg_type, SubLObject ind_type, SubLObject constraint_type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((constraint_type == $kw71$INTER_ARG_DIFFERENT)) {
        return T;
      }
      {
        SubLObject pcase_var = ind_type;
        if (pcase_var.eql($kw89$FORT)) {
          return list_utilities.member_eqP(ind_arg_type, $ind_arg_relevant_constraints$.getDynamicValue(thread));
        } else if (pcase_var.eql($kw90$NON_FORT)) {
          {
            SubLObject pcase_var_148 = constraint_type;
            if (pcase_var_148.eql($kw62$INTER_ARG_GENL)) {
              return genls.genlP(ind_arg, ind_arg_type, UNPROVIDED, UNPROVIDED);
            } else {
              return at_defns.quiet_has_typeP(ind_arg, ind_arg_type, UNPROVIDED);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 38611) 
  public static final SubLObject applicable_inter_arg_type_collections(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_argnum, SubLObject constraint_type, SubLObject check_non_constantP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $ind_arg_relevant_constraints$.currentBinding(thread);
        try {
          $ind_arg_relevant_constraints$.bind(NIL, thread);
          if ((NIL != forts.fort_p(ind_arg))) {
            gather_ind_arg_relevant_constraints(ind_arg, constraint_type);
            applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $kw89$FORT);
          } else if ((NIL != arg_type.variable_wrt_arg_typeP(ind_arg))) {
          } else if ((NIL != check_non_constantP)) {
            applicable_inter_arg_type_pred_collections(reln, ind_arg, ind_argnum, dep_argnum, constraint_type, $kw90$NON_FORT);
          }
        } finally {
          $ind_arg_relevant_constraints$.rebind(_prev_bind_0, thread);
        }
      }
      return $at_applicable_arg_types$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 39283) 
  public static final SubLObject applicable_inter_arg_type_pred_collections(SubLObject reln, SubLObject ind_arg, SubLObject ind_argnum, SubLObject dep_argnum, SubLObject constraint_type, SubLObject ind_type) {
    if ((ind_type == UNPROVIDED)) {
      ind_type = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject constraint_pred = inter_arg_constraint_pred(constraint_type, ind_argnum, dep_argnum);
        if ((NIL == forts.fort_p(constraint_pred))) {
          return NIL;
        }
        applicable_inter_arg_type_pred_collections_int(constraint_pred, reln, ind_arg, $kw11$SELF, constraint_type, ind_type);
        if ((NIL != forts.fort_p(reln))) {
          {
            SubLObject asserted_genl_preds_or_inverseP = makeBoolean(((NIL != genl_predicates.asserted_genl_predicatesP(reln, UNPROVIDED))
                || (NIL != genl_predicates.asserted_genl_inversesP(reln, UNPROVIDED))));
            if (((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread))
                 && (NIL != asserted_genl_preds_or_inverseP))) {
              {
                SubLObject cdolist_list_var = genl_predicates.all_genl_preds(reln, UNPROVIDED, UNPROVIDED);
                SubLObject reln_genl_pred = NIL;
                for (reln_genl_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), reln_genl_pred = cdolist_list_var.first()) {
                  if ((reln_genl_pred != reln)) {
                    applicable_inter_arg_type_pred_collections_int(constraint_pred, reln_genl_pred, ind_arg, $kw82$VIA_GENL_PRED, constraint_type, ind_type);
                  }
                }
              }
            }
            if (((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread))
                 && (NIL != asserted_genl_preds_or_inverseP))) {
              {
                SubLObject inverse_constraint_pred = inter_arg_inverse_pred(constraint_type, ind_argnum, dep_argnum);
                SubLObject cdolist_list_var = genl_predicates.all_genl_inverses(reln, UNPROVIDED, UNPROVIDED);
                SubLObject inverse_reln = NIL;
                for (inverse_reln = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), inverse_reln = cdolist_list_var.first()) {
                  if ((inverse_reln != reln)) {
                    applicable_inter_arg_type_pred_collections_int(inverse_constraint_pred, inverse_reln, ind_arg, $kw83$VIA_GENL_INVERSE, constraint_type, ind_type);
                  }
                }
              }
            }
          }
        }
      }
      return $at_applicable_arg_types$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 40800) 
  public static final SubLObject applicable_inter_arg_type_pred_collections_int(SubLObject constraint_pred, SubLObject reln, SubLObject ind_arg, SubLObject via, SubLObject ind_type, SubLObject constraint_type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred_var = constraint_pred;
        if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reln, ONE_INTEGER, pred_var))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reln, ONE_INTEGER, pred_var);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw84$GAF, $kw85$TRUE, NIL);
                      {
                        SubLObject done_var_149 = NIL;
                        SubLObject token_var_150 = NIL;
                        while ((NIL == done_var_149)) {
                          {
                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_150);
                            SubLObject valid_151 = makeBoolean((token_var_150 != assertion));
                            if ((NIL != valid_151)) {
                              {
                                SubLObject ind_arg_type = assertions_high.gaf_arg2(assertion);
                                SubLObject dep_arg_type = assertions_high.gaf_arg3(assertion);
                                SubLObject inter_arg_type = list(ind_arg_type, dep_arg_type);
                                if ((NIL != relevant_constraintP(ind_arg, ind_arg_type, constraint_type, ind_type))) {
                                  {
                                    SubLObject item_var = inter_arg_type;
                                    if ((NIL == conses_high.member(item_var, $at_applicable_arg_types$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                                      $at_applicable_arg_types$.setDynamicValue(cons(item_var, $at_applicable_arg_types$.getDynamicValue(thread)), thread);
                                    }
                                  }
                                  if ((NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                    dictionary_utilities.dictionary_push($at_applicable_arg_types_with_assertions$.getDynamicValue(thread), inter_arg_type, list(reln, via));
                                  }
                                }
                              }
                            }
                            done_var_149 = makeBoolean((NIL == valid_151));
                          }
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                          if ((NIL != final_index_iterator)) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                          }
                        } finally {
                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
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
      }
      return $at_applicable_arg_types$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-routines.lisp", position = 41536) 
  public static final SubLObject inter_arg_constraint_pred(SubLObject constraint_type, SubLObject ind_argnum, SubLObject dep_argnum) {
    {
      SubLObject pcase_var = constraint_type;
      if (pcase_var.eql($kw35$INTER_ARG_ISA)) {
        return at_utilities.inter_arg_isa_pred(ind_argnum, dep_argnum);
      } else if (pcase_var.eql($kw40$INTER_ARG_NOT_ISA)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7195");
      } else if (pcase_var.eql($kw62$INTER_ARG_GENL)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7192");
      } else if (pcase_var.eql($kw67$INTER_ARG_FORMAT)) {
        return kb_accessors.inter_arg_format_pred(ind_argnum, dep_argnum);
      } else if (pcase_var.eql($kw71$INTER_ARG_DIFFERENT)) {
        return $const70$interArgDifferent;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-routines.lisp", position = 42022) 
  public static final SubLObject inter_arg_inverse_pred(SubLObject constraint_type, SubLObject ind_arg, SubLObject dep_arg) {
    {
      SubLObject pcase_var = constraint_type;
      if (pcase_var.eql($kw35$INTER_ARG_ISA)) {
        return at_utilities.inter_arg_isa_inverse(ind_arg, dep_arg);
      } else if (pcase_var.eql($kw40$INTER_ARG_NOT_ISA)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7194");
      } else if (pcase_var.eql($kw62$INTER_ARG_GENL)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7191");
      } else if (pcase_var.eql($kw67$INTER_ARG_FORMAT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6878");
      } else if (pcase_var.eql($kw71$INTER_ARG_DIFFERENT)) {
        return NIL;
      }
    }
    return NIL;
  }

  public static final SubLObject declare_at_routines_file() {
    //declareMacro(myName, "with_applicable_arg_types", "WITH-APPLICABLE-ARG-TYPES");
    declareFunction(myName, "mal_arg_isaP", "MAL-ARG-ISA?", 3, 0, false);
    //declareFunction(myName, "arg_isa_violations", "ARG-ISA-VIOLATIONS", 4, 0, false);
    //declareFunction(myName, "arg_isa_violation", "ARG-ISA-VIOLATION", 5, 0, false);
    //declareFunction(myName, "arg_isa_violation_int", "ARG-ISA-VIOLATION-INT", 6, 0, false);
    //declareFunction(myName, "wff_violation_verbose_data", "WFF-VIOLATION-VERBOSE-DATA", 0, 0, false);
    //declareFunction(myName, "arg_isa_required_violation", "ARG-ISA-REQUIRED-VIOLATION", 2, 1, false);
    declareFunction(myName, "mal_arg_not_isa_disjointP", "MAL-ARG-NOT-ISA-DISJOINT?", 3, 0, false);
    //declareFunction(myName, "arg_not_isa_disjoint_violations", "ARG-NOT-ISA-DISJOINT-VIOLATIONS", 4, 0, false);
    //declareFunction(myName, "arg_not_isa_disjoint_violation_int", "ARG-NOT-ISA-DISJOINT-VIOLATION-INT", 6, 0, false);
    declareFunction(myName, "mal_arg_quoted_isaP", "MAL-ARG-QUOTED-ISA?", 3, 0, false);
    //declareFunction(myName, "arg_quoted_isa_violations", "ARG-QUOTED-ISA-VIOLATIONS", 4, 0, false);
    //declareFunction(myName, "arg_quoted_isa_violation", "ARG-QUOTED-ISA-VIOLATION", 5, 0, false);
    declareFunction(myName, "mal_arg_not_quoted_isa_disjointP", "MAL-ARG-NOT-QUOTED-ISA-DISJOINT?", 3, 0, false);
    //declareFunction(myName, "arg_not_quoted_isa_disjoint_violations", "ARG-NOT-QUOTED-ISA-DISJOINT-VIOLATIONS", 4, 0, false);
    declareFunction(myName, "mal_arg_genlsP", "MAL-ARG-GENLS?", 3, 0, false);
    //declareFunction(myName, "arg_genl_violations", "ARG-GENL-VIOLATIONS", 4, 0, false);
    //declareFunction(myName, "arg_genl_violation", "ARG-GENL-VIOLATION", 5, 0, false);
    declareFunction(myName, "mal_arg_not_genls_disjointP", "MAL-ARG-NOT-GENLS-DISJOINT?", 3, 0, false);
    //declareFunction(myName, "arg_not_genl_disjoint_violations", "ARG-NOT-GENL-DISJOINT-VIOLATIONS", 4, 0, false);
    declareFunction(myName, "mal_arg_formatP", "MAL-ARG-FORMAT?", 3, 0, false);
    //declareFunction(myName, "arg_format_violations", "ARG-FORMAT-VIOLATIONS", 4, 0, false);
    declareFunction(myName, "mal_inter_arg_isaP", "MAL-INTER-ARG-ISA?", 5, 0, false);
    //declareFunction(myName, "inter_arg_isa_violations", "INTER-ARG-ISA-VIOLATIONS", 7, 0, false);
    //declareFunction(myName, "inter_arg_violations", "INTER-ARG-VIOLATIONS", 8, 0, false);
    declareFunction(myName, "mal_inter_arg_not_isaP", "MAL-INTER-ARG-NOT-ISA?", 5, 0, false);
    declareFunction(myName, "some_inter_arg_not_isa_constraint_somewhereP", "SOME-INTER-ARG-NOT-ISA-CONSTRAINT-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_genl_assertion_somewhereP", "SOME-INTER-ARG-GENL-ASSERTION-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "some_inter_arg_genl_constraint_somewhereP", "SOME-INTER-ARG-GENL-CONSTRAINT-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "mal_inter_arg_genlP", "MAL-INTER-ARG-GENL?", 5, 0, false);
    //declareFunction(myName, "inter_arg_genl_violations", "INTER-ARG-GENL-VIOLATIONS", 7, 0, false);
    declareFunction(myName, "mal_inter_arg_not_isa_disjointP", "MAL-INTER-ARG-NOT-ISA-DISJOINT?", 5, 0, false);
    //declareFunction(myName, "inter_arg_not_isa_disjoint_violations", "INTER-ARG-NOT-ISA-DISJOINT-VIOLATIONS", 7, 0, false);
    //declareFunction(myName, "mal_inter_arg_not_genl_disjointP", "MAL-INTER-ARG-NOT-GENL-DISJOINT?", 5, 0, false);
    //declareFunction(myName, "inter_arg_not_genl_disjoint_violations", "INTER-ARG-NOT-GENL-DISJOINT-VIOLATIONS", 7, 0, false);
    declareFunction(myName, "mal_inter_arg_formatP", "MAL-INTER-ARG-FORMAT?", 5, 0, false);
    //declareFunction(myName, "inter_arg_format_violations", "INTER-ARG-FORMAT-VIOLATIONS", 7, 0, false);
    declareFunction(myName, "some_inter_arg_different_assertion_somewhereP", "SOME-INTER-ARG-DIFFERENT-ASSERTION-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "some_inter_arg_different_constraint_somewhereP", "SOME-INTER-ARG-DIFFERENT-CONSTRAINT-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "mal_inter_arg_differentP", "MAL-INTER-ARG-DIFFERENT?", 5, 0, false);
    //declareFunction(myName, "inter_arg_different_violations", "INTER-ARG-DIFFERENT-VIOLATIONS", 5, 0, false);
    declareFunction(myName, "clear_arg_collections", "CLEAR-ARG-COLLECTIONS", 0, 0, false); new $clear_arg_collections$ZeroArityFunction();
    //declareFunction(myName, "remove_arg_collections", "REMOVE-ARG-COLLECTIONS", 4, 0, false);
    declareFunction(myName, "arg_collections_internal", "ARG-COLLECTIONS-INTERNAL", 4, 0, false);
    declareFunction(myName, "arg_collections", "ARG-COLLECTIONS", 4, 0, false);
    declareFunction(myName, "weak_fort_isa_collections", "WEAK-FORT-ISA-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "naut_isa_collections", "NAUT-ISA-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "naut_isa_collections_int", "NAUT-ISA-COLLECTIONS-INT", 2, 0, false);
    //declareFunction(myName, "weak_fort_quoted_isa_collections", "WEAK-FORT-QUOTED-ISA-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "naut_quoted_isa_collections", "NAUT-QUOTED-ISA-COLLECTIONS", 1, 0, false);
    declareFunction(myName, "weak_fort_genls_collections", "WEAK-FORT-GENLS-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "naut_genls_collections", "NAUT-GENLS-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "naut_genls_collections_int", "NAUT-GENLS-COLLECTIONS-INT", 2, 0, false);
    declareFunction(myName, "applicable_arg_type_collections", "APPLICABLE-ARG-TYPE-COLLECTIONS", 3, 0, false);
    declareFunction(myName, "applicable_arg_type_collections_int", "APPLICABLE-ARG-TYPE-COLLECTIONS-INT", 5, 0, false);
    declareFunction(myName, "constraint_pred", "CONSTRAINT-PRED", 3, 0, false);
    declareFunction(myName, "constraint_preds", "CONSTRAINT-PREDS", 3, 0, false);
    declareFunction(myName, "inverse_pred", "INVERSE-PRED", 3, 0, false);
    declareFunction(myName, "gather_ind_arg_relevant_constraints", "GATHER-IND-ARG-RELEVANT-CONSTRAINTS", 2, 0, false);
    declareFunction(myName, "relevant_constraintP", "RELEVANT-CONSTRAINT?", 4, 0, false);
    declareFunction(myName, "applicable_inter_arg_type_collections", "APPLICABLE-INTER-ARG-TYPE-COLLECTIONS", 6, 0, false);
    declareFunction(myName, "applicable_inter_arg_type_pred_collections", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS", 5, 1, false);
    declareFunction(myName, "applicable_inter_arg_type_pred_collections_int", "APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-INT", 6, 0, false);
    declareFunction(myName, "inter_arg_constraint_pred", "INTER-ARG-CONSTRAINT-PRED", 3, 0, false);
    declareFunction(myName, "inter_arg_inverse_pred", "INTER-ARG-INVERSE-PRED", 3, 0, false);
    //declareFunction(myName, "note_at_violations", "NOTE-AT-VIOLATIONS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_at_routines_file() {
    $at_check_quoted_arg_isaP$ = deflexical("*AT-CHECK-QUOTED-ARG-ISA?*", T);
    $at_applicable_arg_types$ = defvar("*AT-APPLICABLE-ARG-TYPES*", NIL);
    $at_applicable_arg_types_with_assertions$ = defvar("*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*", NIL);
    $arg_collections_caching_state$ = deflexical("*ARG-COLLECTIONS-CACHING-STATE*", NIL);
    $ind_arg_relevant_constraints$ = defvar("*IND-ARG-RELEVANT-CONSTRAINTS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_at_routines_file() {
    // CVS_ID("Id: at-routines.lisp 126640 2008-12-04 13:39:36Z builder ");
    memoization_state.note_globally_cached_function($sym74$ARG_COLLECTIONS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(makeSymbol("*AT-APPLICABLE-ARG-TYPES*"), list(makeSymbol("*AT-APPLICABLE-ARG-TYPES-WITH-ASSERTIONS*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("QUOTE"), EQUAL))));
  public static final SubLSymbol $sym2$ALLOW_ESCAPE_QUOTE_WHEN_QUOTE_PREDICATE = makeSymbol("ALLOW-ESCAPE-QUOTE-WHEN-QUOTE-PREDICATE");
  public static final SubLSymbol $sym3$RELN = makeSymbol("RELN");
  public static final SubLSymbol $sym4$WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");
  public static final SubLObject $const5$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
  public static final SubLSymbol $kw6$ARG_ISA = makeKeyword("ARG-ISA");
  public static final SubLSymbol $sym7$VALID_FORT_TYPE_ = makeSymbol("VALID-FORT-TYPE?");
  public static final SubLSymbol $kw8$MAL_ARG_WRT_COL_DEFN = makeKeyword("MAL-ARG-WRT-COL-DEFN");
  public static final SubLSymbol $kw9$MAL_ARG_WRT_ARG_ISA = makeKeyword("MAL-ARG-WRT-ARG-ISA");
  public static final SubLList $list10 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"), makeSymbol("CONSTRAINT-GAF"));
  public static final SubLSymbol $kw11$SELF = makeKeyword("SELF");
  public static final SubLSymbol $kw12$AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");
  public static final SubLSymbol $kw13$WFF_FORMULA = makeKeyword("WFF-FORMULA");
  public static final SubLSymbol $kw14$WFF_EXPANSION_FORMULA = makeKeyword("WFF-EXPANSION-FORMULA");
  public static final SubLSymbol $kw15$WFF_ORIGINAL_FORMULA = makeKeyword("WFF-ORIGINAL-FORMULA");
  public static final SubLSymbol $kw16$MAL_RELN_WRT_ARG_ISA_REQUIRED = makeKeyword("MAL-RELN-WRT-ARG-ISA-REQUIRED");
  public static final SubLSymbol $kw17$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw18$NAUT = makeKeyword("NAUT");
  public static final SubLSymbol $sym19$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol("VARIABLE-TERM-WRT-ARG-TYPE?");
  public static final SubLSymbol $kw20$MAL_ARG_WRT_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-ISA-DISJOINT");
  public static final SubLSymbol $kw21$ARG_QUOTED_ISA = makeKeyword("ARG-QUOTED-ISA");
  public static final SubLSymbol $kw22$MAL_ARG_WRT_COL_QUOTED_DEFN = makeKeyword("MAL-ARG-WRT-COL-QUOTED-DEFN");
  public static final SubLSymbol $kw23$MAL_ARG_WRT_ARG_QUOTED_ISA = makeKeyword("MAL-ARG-WRT-ARG-QUOTED-ISA");
  public static final SubLSymbol $kw24$QUOTED_ISA = makeKeyword("QUOTED-ISA");
  public static final SubLObject $const25$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLObject $const26$CycLReifiableNonAtomicTerm = constant_handles.reader_make_constant_shell(makeString("CycLReifiableNonAtomicTerm"));
  public static final SubLSymbol $kw27$MAL_ARG_WRT_ARG_NOT_QUOTED_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-QUOTED-ISA-DISJOINT");
  public static final SubLSymbol $kw28$ARG_GENLS = makeKeyword("ARG-GENLS");
  public static final SubLObject $const29$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $kw30$MAL_ARG_WRT_ARG_GENL = makeKeyword("MAL-ARG-WRT-ARG-GENL");
  public static final SubLSymbol $kw31$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $kw32$MAL_ARG_WRT_ARG_NOT_GENLS_DISJOINT = makeKeyword("MAL-ARG-WRT-ARG-NOT-GENLS-DISJOINT");
  public static final SubLSymbol $kw33$FORMAT = makeKeyword("FORMAT");
  public static final SubLSymbol $kw34$MAL_ARG_WRT_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-ARG-FORMAT");
  public static final SubLSymbol $kw35$INTER_ARG_ISA = makeKeyword("INTER-ARG-ISA");
  public static final SubLList $list36 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-ISA"));
  public static final SubLSymbol $kw37$MAL_ARG_WRT_INTER_ARG_DEFN = makeKeyword("MAL-ARG-WRT-INTER-ARG-DEFN");
  public static final SubLSymbol $kw38$MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
  public static final SubLList $list39 = list(makeSymbol("CONSTRAINT-RELN"), makeSymbol("VIA"));
  public static final SubLSymbol $kw40$INTER_ARG_NOT_ISA = makeKeyword("INTER-ARG-NOT-ISA");
  public static final SubLSymbol $kw41$MAL_ARG_WRT_INTER_ARG_NOT_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA");
  public static final SubLSymbol $kw42$MAL_ARG_WRT_INTER_ARG_NOT_DEFN = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-DEFN");
  public static final SubLObject $const43$interArgNotIsa1_2 = constant_handles.reader_make_constant_shell(makeString("interArgNotIsa1-2"));
  public static final SubLObject $const44$interArgNotIsa2_1 = constant_handles.reader_make_constant_shell(makeString("interArgNotIsa2-1"));
  public static final SubLObject $const45$interArgGenl1_2 = constant_handles.reader_make_constant_shell(makeString("interArgGenl1-2"));
  public static final SubLObject $const46$interArgGenl2_1 = constant_handles.reader_make_constant_shell(makeString("interArgGenl2-1"));
  public static final SubLObject $const47$interArgGenl2_4 = constant_handles.reader_make_constant_shell(makeString("interArgGenl2-4"));
  public static final SubLObject $const48$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw49$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw50$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw51$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym52$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw53$ERROR = makeKeyword("ERROR");
  public static final SubLString $str54$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym55$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw56$CERROR = makeKeyword("CERROR");
  public static final SubLString $str57$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw58$WARN = makeKeyword("WARN");
  public static final SubLString $str59$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str60$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str61$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw62$INTER_ARG_GENL = makeKeyword("INTER-ARG-GENL");
  public static final SubLList $list63 = list(makeSymbol("IND-ARG-GENL"), makeSymbol("DEP-ARG-GENL"));
  public static final SubLSymbol $kw64$MAL_ARG_WRT_INTER_ARG_GENL = makeKeyword("MAL-ARG-WRT-INTER-ARG-GENL");
  public static final SubLSymbol $kw65$MAL_ARG_WRT_INTER_ARG_NOT_ISA_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-ISA-DISJOINT");
  public static final SubLSymbol $kw66$MAL_ARG_WRT_INTER_ARG_NOT_GENL_DISJOINT = makeKeyword("MAL-ARG-WRT-INTER-ARG-NOT-GENL-DISJOINT");
  public static final SubLSymbol $kw67$INTER_ARG_FORMAT = makeKeyword("INTER-ARG-FORMAT");
  public static final SubLList $list68 = list(makeSymbol("IND-ARG-ISA"), makeSymbol("DEP-ARG-FORMAT"));
  public static final SubLSymbol $kw69$MAL_ARG_WRT_INTER_ARG_FORMAT = makeKeyword("MAL-ARG-WRT-INTER-ARG-FORMAT");
  public static final SubLObject $const70$interArgDifferent = constant_handles.reader_make_constant_shell(makeString("interArgDifferent"));
  public static final SubLSymbol $kw71$INTER_ARG_DIFFERENT = makeKeyword("INTER-ARG-DIFFERENT");
  public static final SubLList $list72 = list(makeSymbol("ARGNUM1"), makeSymbol("ARGNUM2"));
  public static final SubLSymbol $kw73$MAL_ARG_WRT_INTER_ARG_DIFFERENT = makeKeyword("MAL-ARG-WRT-INTER-ARG-DIFFERENT");
  public static final SubLSymbol $sym74$ARG_COLLECTIONS = makeSymbol("ARG-COLLECTIONS");
  public static final SubLSymbol $kw75$STRONG_FORT = makeKeyword("STRONG-FORT");
  public static final SubLSymbol $kw76$WEAK_FORT = makeKeyword("WEAK-FORT");
  public static final SubLSymbol $sym77$_ARG_COLLECTIONS_CACHING_STATE_ = makeSymbol("*ARG-COLLECTIONS-CACHING-STATE*");
  public static final SubLInteger $int78$1024 = makeInteger(1024);
  public static final SubLSymbol $sym79$CLEAR_ARG_COLLECTIONS = makeSymbol("CLEAR-ARG-COLLECTIONS");
  public static final SubLSymbol $kw80$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym81$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $kw82$VIA_GENL_PRED = makeKeyword("VIA-GENL-PRED");
  public static final SubLSymbol $kw83$VIA_GENL_INVERSE = makeKeyword("VIA-GENL-INVERSE");
  public static final SubLSymbol $kw84$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw85$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const86$argsIsa = constant_handles.reader_make_constant_shell(makeString("argsIsa"));
  public static final SubLObject $const87$argAndRestIsa = constant_handles.reader_make_constant_shell(makeString("argAndRestIsa"));
  public static final SubLString $str88$Unknown_constraint_type__s = makeString("Unknown constraint-type ~s");
  public static final SubLSymbol $kw89$FORT = makeKeyword("FORT");
  public static final SubLSymbol $kw90$NON_FORT = makeKeyword("NON-FORT");

  //// Initializers

  public void declareFunctions() {
    declare_at_routines_file();
  }

  public void initializeVariables() {
    init_at_routines_file();
  }

  public void runTopLevelForms() {
    setup_at_routines_file();
  }

}
