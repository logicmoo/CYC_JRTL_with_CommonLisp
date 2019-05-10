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
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.pred_relevance_macros;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_gp_mapping extends SubLTranslatedFile {

  //// Constructor

  private kb_gp_mapping() {}
  public static final SubLFile me = new kb_gp_mapping();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_gp_mapping";

  //// Definitions

  @SubL(source = "cycl/kb-gp-mapping.lisp", position = 1072) 
  public static SubLSymbol $mapping_arg_swap$ = null;

  @SubL(source = "cycl/kb-gp-mapping.lisp", position = 2086) 
  public static final SubLObject dgaigp_binaryP(SubLObject predicate) {
    return arity.binaryP(predicate);
  }

  /** Like MAP-ARG-INDEX, except all spec-predicates of PREDICATE are relevant,
   and :true is assumed for TRUTH. */
  @SubL(source = "cycl/kb-gp-mapping.lisp", position = 2812) 
  public static final SubLObject gp_map_arg_index(SubLObject function, SubLObject v_term, SubLObject arg, SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject catch_var = NIL;
        try {
          {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
              pred_relevance_macros.$relevant_pred_function$.bind($sym22$RELEVANT_PRED_IS_SPEC_PRED, thread);
              pred_relevance_macros.$pred$.bind(predicate, thread);
              {
                SubLObject pred_var = NIL;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw23$GAF, $kw9$TRUE, NIL);
                              {
                                SubLObject done_var_3 = NIL;
                                SubLObject token_var_4 = NIL;
                                while ((NIL == done_var_3)) {
                                  {
                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                    SubLObject valid_5 = makeBoolean((token_var_4 != assertion));
                                    if ((NIL != valid_5)) {
                                      Functions.funcall(function, assertion);
                                    }
                                    done_var_3 = makeBoolean((NIL == valid_5));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
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
              pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
              pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
          }
          if ((NIL != dgaigp_binaryP(predicate))) {
            {
              SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
              SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
              try {
                pred_relevance_macros.$relevant_pred_function$.bind($sym24$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                pred_relevance_macros.$pred$.bind(predicate, thread);
                {
                  SubLObject pred_var = NIL;
                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var))) {
                    {
                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw23$GAF, $kw9$TRUE, NIL);
                                {
                                  SubLObject done_var_7 = NIL;
                                  SubLObject token_var_8 = NIL;
                                  while ((NIL == done_var_7)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                      SubLObject valid_9 = makeBoolean((token_var_8 != assertion));
                                      if ((NIL != valid_9)) {
                                        {
                                          SubLObject _prev_bind_0_10 = $mapping_arg_swap$.currentBinding(thread);
                                          try {
                                            $mapping_arg_swap$.bind(makeBoolean((NIL == $mapping_arg_swap$.getDynamicValue(thread))), thread);
                                            Functions.funcall(function, assertion);
                                          } finally {
                                            $mapping_arg_swap$.rebind(_prev_bind_0_10, thread);
                                          }
                                        }
                                      }
                                      done_var_7 = makeBoolean((NIL == valid_9));
                                    }
                                  }
                                }
                              } finally {
                                {
                                  SubLObject _prev_bind_0_11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                  try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    if ((NIL != final_index_iterator)) {
                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                  } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
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
                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } catch (Throwable ccatch_env_var) {
          catch_var = Errors.handleThrowable(ccatch_env_var, $kw21$MAPPING_DONE);
        }
      }
      return NIL;
    }
  }

  /** only use this where PRED is a predicate. */
  @SubL(source = "cycl/kb-gp-mapping.lisp", position = 9428) 
  public static final SubLObject num_spec_pred_index(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            {
              SubLObject cdolist_list_var = genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED);
              SubLObject spec_pred = NIL;
              for (spec_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), spec_pred = cdolist_list_var.first()) {
                count = Numbers.add(count, kb_indexing.num_predicate_extent_index(spec_pred, UNPROVIDED));
              }
            }
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return count;
      }
    }
  }

  public static final SubLObject declare_kb_gp_mapping_file() {
    //declareMacro(myName, "do_gaf_arg_index_gp", "DO-GAF-ARG-INDEX-GP");
    declareFunction(myName, "dgaigp_binaryP", "DGAIGP-BINARY?", 1, 0, false);
    //declareMacro(myName, "do_gaf_arg_index_values_gp", "DO-GAF-ARG-INDEX-VALUES-GP");
    //declareFunction(myName, "dgaivgp_arg", "DGAIVGP-ARG", 2, 0, false);
    declareFunction(myName, "gp_map_arg_index", "GP-MAP-ARG-INDEX", 4, 0, false);
    //declareFunction(myName, "gp_gather_gaf_arg_index", "GP-GATHER-GAF-ARG-INDEX", 3, 1, false);
    //declareFunction(myName, "gp_fpred_value", "GP-FPRED-VALUE", 2, 2, false);
    //declareFunction(myName, "gp_fpred_value_in_mt", "GP-FPRED-VALUE-IN-MT", 3, 2, false);
    //declareFunction(myName, "gp_fpred_value_in_mts", "GP-FPRED-VALUE-IN-MTS", 3, 2, false);
    //declareFunction(myName, "gp_fpred_value_in_any_mt", "GP-FPRED-VALUE-IN-ANY-MT", 2, 2, false);
    //declareFunction(myName, "gp_fpred_value_in_relevant_mts", "GP-FPRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
    //declareFunction(myName, "gp_pred_values", "GP-PRED-VALUES", 2, 2, false);
    //declareFunction(myName, "gp_pred_values_in_mt", "GP-PRED-VALUES-IN-MT", 3, 2, false);
    //declareFunction(myName, "gp_pred_values_in_mts", "GP-PRED-VALUES-IN-MTS", 3, 2, false);
    //declareFunction(myName, "gp_pred_values_in_any_mt", "GP-PRED-VALUES-IN-ANY-MT", 2, 2, false);
    //declareFunction(myName, "gp_pred_values_in_relevant_mts", "GP-PRED-VALUES-IN-RELEVANT-MTS", 2, 3, false);
    //declareMacro(myName, "do_all_spec_predicates2", "DO-ALL-SPEC-PREDICATES2");
    //declareMacro(myName, "do_all_spec_inverses2", "DO-ALL-SPEC-INVERSES2");
    //declareFunction(myName, "some_spec_pred_value_in_relevant_mts", "SOME-SPEC-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
    //declareMacro(myName, "do_spec_pred_index", "DO-SPEC-PRED-INDEX");
    //declareMacro(myName, "do_spec_pred_index_in_any_mt", "DO-SPEC-PRED-INDEX-IN-ANY-MT");
    //declareMacro(myName, "do_arg_index_with_spec_preds", "DO-ARG-INDEX-WITH-SPEC-PREDS");
    //declareMacro(myName, "do_arg_index_in_any_mt_with_spec_preds", "DO-ARG-INDEX-IN-ANY-MT-WITH-SPEC-PREDS");
    declareFunction(myName, "num_spec_pred_index", "NUM-SPEC-PRED-INDEX", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_kb_gp_mapping_file() {
    $mapping_arg_swap$ = defparameter("*MAPPING-ARG-SWAP*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_gp_mapping_file() {
    // CVS_ID("Id: kb-gp-mapping.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym11$DGAIGP_BINARY_, $sym16$DO_GAF_ARG_INDEX_GP);
    access_macros.register_macro_helper($sym19$DGAIVGP_ARG, $sym20$DO_GAF_ARG_INDEX_VALUES_GP);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("INDEX"), makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw4$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym5$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym6$WITH_ALL_SPEC_PREDICATES = makeSymbol("WITH-ALL-SPEC-PREDICATES");
  public static final SubLSymbol $sym7$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLSymbol $kw8$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $kw9$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym10$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym11$DGAIGP_BINARY_ = makeSymbol("DGAIGP-BINARY?");
  public static final SubLSymbol $sym12$WITH_ALL_SPEC_INVERSES = makeSymbol("WITH-ALL-SPEC-INVERSES");
  public static final SubLSymbol $sym13$BINARY_ARG_SWAP = makeSymbol("BINARY-ARG-SWAP");
  public static final SubLSymbol $sym14$CLET = makeSymbol("CLET");
  public static final SubLList $list15 = list(list(makeSymbol("*MAPPING-ARG-SWAP*"), list(makeSymbol("CNOT"), makeSymbol("*MAPPING-ARG-SWAP*"))));
  public static final SubLSymbol $sym16$DO_GAF_ARG_INDEX_GP = makeSymbol("DO-GAF-ARG-INDEX-GP");
  public static final SubLList $list17 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("GATHER-INDEX"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym18$ASSERTION = makeUninternedSymbol("ASSERTION");
  public static final SubLSymbol $sym19$DGAIVGP_ARG = makeSymbol("DGAIVGP-ARG");
  public static final SubLSymbol $sym20$DO_GAF_ARG_INDEX_VALUES_GP = makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP");
  public static final SubLSymbol $kw21$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $sym22$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
  public static final SubLSymbol $kw23$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym24$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
  public static final SubLSymbol $sym25$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const26$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym27$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym28$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym29$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym30$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym31$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym32$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym33$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym34$RELEVANT_MT_IS_IN_LIST = makeSymbol("RELEVANT-MT-IS-IN-LIST");
  public static final SubLList $list35 = list(list(makeSymbol("VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym36$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym37$ALL_SPEC_PREDS = makeSymbol("ALL-SPEC-PREDS");
  public static final SubLSymbol $sym38$ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");
  public static final SubLList $list39 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list40 = list(makeKeyword("TRUTH"), makeKeyword("DONE"));
  public static final SubLSymbol $sym41$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");
  public static final SubLSymbol $sym42$DO_ALL_SPEC_PREDICATES2 = makeSymbol("DO-ALL-SPEC-PREDICATES2");
  public static final SubLSymbol $sym43$DO_PREDICATE_EXTENT_INDEX = makeSymbol("DO-PREDICATE-EXTENT-INDEX");
  public static final SubLSymbol $sym44$BINARY_ = makeSymbol("BINARY?");
  public static final SubLSymbol $sym45$DO_ALL_SPEC_INVERSES2 = makeSymbol("DO-ALL-SPEC-INVERSES2");
  public static final SubLList $list46 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym47$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");
  public static final SubLSymbol $sym48$WITH_ALL_MTS = makeSymbol("WITH-ALL-MTS");
  public static final SubLList $list49 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym50$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");
  public static final SubLSymbol $kw51$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $sym52$DO_ARG_INDEX_WITH_SPEC_PREDS = makeSymbol("DO-ARG-INDEX-WITH-SPEC-PREDS");

  //// Initializers

  public void declareFunctions() {
    declare_kb_gp_mapping_file();
  }

  public void initializeVariables() {
    init_kb_gp_mapping_file();
  }

  public void runTopLevelForms() {
    setup_kb_gp_mapping_file();
  }

}
