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

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.equals;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class subl_identifier extends SubLTranslatedFile {

  //// Constructor

  private subl_identifier() {}
  public static final SubLFile me = new subl_identifier();
  public static final String myName = "com.cyc.cycjava_1.cycl.subl_identifier";

  //// Definitions

  /** Maintains a mapping from domains (e.g. #$CycHLTruthValue) to FORTs 
   (e.g., the NART (#$SubLSymbolEntityFn #$CycHLTruthValue :TRUE-DEF)) */
  @SubL(source = "cycl/subl-identifier.lisp", position = 1799) 
  private static SubLSymbol $sublid_domain_to_forts_table$ = null;

  /** Maintains a mapping from identifiers (e.g. :TRUE-DEF) to forts (e.g., the NART
   (#$SubLSymbolEntityFn #$CycHLTruthValue :TRUE-DEF)). */
  @SubL(source = "cycl/subl-identifier.lisp", position = 2061) 
  private static SubLSymbol $sublid_id_to_forts_table$ = null;

  /** Maintains a mapping from forts (e.g., the NART
   (#$SubLSymbolEntityFn #$CycHLTruthValue :TRUE-DEF))
   to identifiers (e.g. :TRUE-DEF). */
  @SubL(source = "cycl/subl-identifier.lisp", position = 2265) 
  private static SubLSymbol $sublid_fort_to_id_table$ = null;

  @SubL(source = "cycl/subl-identifier.lisp", position = 2471) 
  private static SubLSymbol $sublid_pred$ = null;

  @SubL(source = "cycl/subl-identifier.lisp", position = 2525) 
  private static SubLSymbol $sublid_uiit_pred$ = null;

  /** Initialize the SubL identifier mappings from the predicate extents of 
   #$subLIdentifier and #$uniquelyIdentifiedInType. */
  @SubL(source = "cycl/subl-identifier.lisp", position = 7230) 
  public static final SubLObject initialize_sublid_mappings() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      dictionary.clear_dictionary($sublid_domain_to_forts_table$.getGlobalValue());
      dictionary.clear_dictionary($sublid_id_to_forts_table$.getGlobalValue());
      dictionary.clear_dictionary($sublid_fort_to_id_table$.getGlobalValue());
      if (((NIL != fort_types_interface.mtP(mt_vars.$sublid_mt$.getGlobalValue()))
           && (NIL != fort_types_interface.predicateP($sublid_pred$.getGlobalValue())))) {
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$sublid_mt$.getGlobalValue());
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject pred_var = $sublid_pred$.getGlobalValue();
                if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw15$GAF, $kw16$TRUE, NIL);
                              {
                                SubLObject done_var_1 = NIL;
                                SubLObject token_var_2 = NIL;
                                while ((NIL == done_var_1)) {
                                  {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                    SubLObject valid_3 = makeBoolean((token_var_2 != assertion));
                                    if ((NIL != valid_3)) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11210");
                                    }
                                    done_var_1 = makeBoolean((NIL == valid_3));
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
                        done_var = makeBoolean((NIL == valid));
                      }
                    }
                  }
                }
              }
              {
                SubLObject pred_var = $sublid_uiit_pred$.getGlobalValue();
                if ((NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw15$GAF, $kw16$TRUE, NIL);
                              {
                                SubLObject done_var_5 = NIL;
                                SubLObject token_var_6 = NIL;
                                while ((NIL == done_var_5)) {
                                  {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                    SubLObject valid_7 = makeBoolean((token_var_6 != assertion));
                                    if ((NIL != valid_7)) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11212");
                                    }
                                    done_var_5 = makeBoolean((NIL == valid_7));
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
                        done_var = makeBoolean((NIL == valid));
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
      return NIL;
    }
  }

  public static final SubLObject declare_subl_identifier_file() {
    //declareFunction(myName, "sublid_p", "SUBLID-P", 1, 0, false);
    //declareFunction(myName, "sublid_domain_p", "SUBLID-DOMAIN-P", 1, 0, false);
    //declareFunction(myName, "cyc_entity_from_sublid", "CYC-ENTITY-FROM-SUBLID", 2, 0, false);
    //declareFunction(myName, "sublid_from_cyc_entity", "SUBLID-FROM-CYC-ENTITY", 1, 0, false);
    //declareFunction(myName, "sublid_add_domain_to_forts", "SUBLID-ADD-DOMAIN-TO-FORTS", 2, 0, false);
    //declareFunction(myName, "sublid_remove_domain_to_forts", "SUBLID-REMOVE-DOMAIN-TO-FORTS", 2, 0, false);
    //declareFunction(myName, "sublid_domain_to_forts_update", "SUBLID-DOMAIN-TO-FORTS-UPDATE", 3, 0, false);
    //declareFunction(myName, "sublid_domain_to_forts_lookup", "SUBLID-DOMAIN-TO-FORTS-LOOKUP", 1, 0, false);
    //declareFunction(myName, "sublid_add_id_to_forts", "SUBLID-ADD-ID-TO-FORTS", 2, 0, false);
    //declareFunction(myName, "sublid_remove_id_to_forts", "SUBLID-REMOVE-ID-TO-FORTS", 2, 0, false);
    //declareFunction(myName, "sublid_id_to_forts_update", "SUBLID-ID-TO-FORTS-UPDATE", 3, 0, false);
    //declareFunction(myName, "cleanup_sublid_id_to_forts", "CLEANUP-SUBLID-ID-TO-FORTS", 1, 0, false);
    //declareFunction(myName, "sublid_id_to_forts_lookup", "SUBLID-ID-TO-FORTS-LOOKUP", 1, 0, false);
    //declareFunction(myName, "sublid_add_fort_to_id", "SUBLID-ADD-FORT-TO-ID", 2, 0, false);
    //declareFunction(myName, "sublid_remove_fort_to_id", "SUBLID-REMOVE-FORT-TO-ID", 1, 0, false);
    //declareFunction(myName, "sublid_fort_to_id_lookup", "SUBLID-FORT-TO-ID-LOOKUP", 1, 0, false);
    declareFunction(myName, "initialize_sublid_mappings", "INITIALIZE-SUBLID-MAPPINGS", 0, 0, false);
    //declareFunction(myName, "add_sublidentifier", "ADD-SUBLIDENTIFIER", 2, 0, false);
    //declareFunction(myName, "remove_sublidentifier", "REMOVE-SUBLIDENTIFIER", 2, 0, false);
    //declareFunction(myName, "sublid_mappings_add", "SUBLID-MAPPINGS-ADD", 1, 0, false);
    //declareFunction(myName, "sublid_mappings_remove", "SUBLID-MAPPINGS-REMOVE", 1, 0, false);
    //declareFunction(myName, "add_uniquelyidentifiedintype", "ADD-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
    //declareFunction(myName, "remove_uniquelyidentifiedintype", "REMOVE-UNIQUELYIDENTIFIEDINTYPE", 2, 0, false);
    //declareFunction(myName, "uiit_mappings_add", "UIIT-MAPPINGS-ADD", 1, 0, false);
    //declareFunction(myName, "uiit_mappings_remove", "UIIT-MAPPINGS-REMOVE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_subl_identifier_file() {
    $sublid_domain_to_forts_table$ = deflexical("*SUBLID-DOMAIN-TO-FORTS-TABLE*", maybeDefault( $sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_, $sublid_domain_to_forts_table$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $sublid_id_to_forts_table$ = deflexical("*SUBLID-ID-TO-FORTS-TABLE*", maybeDefault( $sym1$_SUBLID_ID_TO_FORTS_TABLE_, $sublid_id_to_forts_table$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $sublid_fort_to_id_table$ = deflexical("*SUBLID-FORT-TO-ID-TABLE*", maybeDefault( $sym2$_SUBLID_FORT_TO_ID_TABLE_, $sublid_fort_to_id_table$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $sublid_pred$ = defconstant("*SUBLID-PRED*", $const3$subLIdentifier);
    $sublid_uiit_pred$ = defconstant("*SUBLID-UIIT-PRED*", $const4$uniquelyIdentifiedInType);
    return NIL;
  }

  public static final SubLObject setup_subl_identifier_file() {
        subl_macro_promotions.declare_defglobal($sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_);
    subl_macro_promotions.declare_defglobal($sym1$_SUBLID_ID_TO_FORTS_TABLE_);
    subl_macro_promotions.declare_defglobal($sym2$_SUBLID_FORT_TO_ID_TABLE_);
    utilities_macros.register_kb_function($sym17$ADD_SUBLIDENTIFIER);
    utilities_macros.register_kb_function($sym18$REMOVE_SUBLIDENTIFIER);
    utilities_macros.register_kb_function($sym19$ADD_UNIQUELYIDENTIFIEDINTYPE);
    utilities_macros.register_kb_function($sym20$REMOVE_UNIQUELYIDENTIFIEDINTYPE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_SUBLID_DOMAIN_TO_FORTS_TABLE_ = makeSymbol("*SUBLID-DOMAIN-TO-FORTS-TABLE*");
  public static final SubLSymbol $sym1$_SUBLID_ID_TO_FORTS_TABLE_ = makeSymbol("*SUBLID-ID-TO-FORTS-TABLE*");
  public static final SubLSymbol $sym2$_SUBLID_FORT_TO_ID_TABLE_ = makeSymbol("*SUBLID-FORT-TO-ID-TABLE*");
  public static final SubLObject $const3$subLIdentifier = constant_handles.reader_make_constant_shell(makeString("subLIdentifier"));
  public static final SubLObject $const4$uniquelyIdentifiedInType = constant_handles.reader_make_constant_shell(makeString("uniquelyIdentifiedInType"));
  public static final SubLString $str5$More_than_one_Cyc_entity_found_fo = makeString("More than one Cyc entity found for ID ~A and domain ~A.");
  public static final SubLSymbol $kw6$ADD = makeKeyword("ADD");
  public static final SubLSymbol $kw7$REMOVE = makeKeyword("REMOVE");
  public static final SubLSymbol $sym8$SUBLID_DOMAIN_P = makeSymbol("SUBLID-DOMAIN-P");
  public static final SubLSymbol $sym9$FORT_P = makeSymbol("FORT-P");
  public static final SubLString $str10$Unknown_sublid_domain_to_forts_up = makeString("Unknown sublid-domain-to-forts-update operation ~A");
  public static final SubLSymbol $sym11$SUBLID_P = makeSymbol("SUBLID-P");
  public static final SubLObject $const12$SubLSymbolEntityFn = constant_handles.reader_make_constant_shell(makeString("SubLSymbolEntityFn"));
  public static final SubLString $str13$Unknown_sublid_forts_update_opera = makeString("Unknown sublid-forts-update operation ~A");
  public static final SubLSymbol $sym14$NAT_FUNCTOR = makeSymbol("NAT-FUNCTOR");
  public static final SubLSymbol $kw15$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw16$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym17$ADD_SUBLIDENTIFIER = makeSymbol("ADD-SUBLIDENTIFIER");
  public static final SubLSymbol $sym18$REMOVE_SUBLIDENTIFIER = makeSymbol("REMOVE-SUBLIDENTIFIER");
  public static final SubLSymbol $sym19$ADD_UNIQUELYIDENTIFIEDINTYPE = makeSymbol("ADD-UNIQUELYIDENTIFIEDINTYPE");
  public static final SubLSymbol $sym20$REMOVE_UNIQUELYIDENTIFIEDINTYPE = makeSymbol("REMOVE-UNIQUELYIDENTIFIEDINTYPE");

  //// Initializers

  public void declareFunctions() {
    declare_subl_identifier_file();
  }

  public void initializeVariables() {
    init_subl_identifier_file();
  }

  public void runTopLevelForms() {
    setup_subl_identifier_file();
  }

}
