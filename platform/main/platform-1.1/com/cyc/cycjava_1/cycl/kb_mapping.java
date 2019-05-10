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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.auxiliary_indexing;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.pred_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_mapping extends SubLTranslatedFile {

  //// Constructor

  private kb_mapping() {}
  public static final SubLFile me = new kb_mapping();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_mapping";

  //// Definitions

  @SubL(source = "cycl/kb-mapping.lisp", position = 1578) 
  private static SubLSymbol $mapping_function$ = null;

  @SubL(source = "cycl/kb-mapping.lisp", position = 1666) 
  private static SubLSymbol $mapping_truth$ = null;

  @SubL(source = "cycl/kb-mapping.lisp", position = 1709) 
  private static SubLSymbol $mapping_direction$ = null;

  /** Apply FUNCTION to each #$termOfUnit assertion whose arg2 is a naut
   which mentions TERM in position ARGNUM. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 4656) 
  public static final SubLObject map_nart_arg_index(SubLObject subl_function, SubLObject v_term, SubLObject argnum, SubLObject cycl_function) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((cycl_function == UNPROVIDED)) {
      cycl_function = NIL;
    }
    checkType(subl_function, $sym15$FUNCTION_SPEC_P);
    {
      SubLObject catch_var = NIL;
      try {
        if (((NIL != argnum)
             && (NIL != cycl_function))) {
          if ((NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, cycl_function))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, cycl_function);
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, NIL, NIL);
                        {
                          SubLObject done_var_25 = NIL;
                          SubLObject token_var_26 = NIL;
                          while ((NIL == done_var_25)) {
                            {
                              SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                              SubLObject valid_27 = makeBoolean((token_var_26 != ass));
                              if ((NIL != valid_27)) {
                                Functions.funcall(subl_function, ass);
                              }
                              done_var_25 = makeBoolean((NIL == valid_27));
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
        } else if (((NIL != argnum)
             && (NIL == cycl_function))) {
          if ((NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, NIL, NIL);
                        {
                          SubLObject done_var_28 = NIL;
                          SubLObject token_var_29 = NIL;
                          while ((NIL == done_var_28)) {
                            {
                              SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_29);
                              SubLObject valid_30 = makeBoolean((token_var_29 != ass));
                              if ((NIL != valid_30)) {
                                Functions.funcall(subl_function, ass);
                              }
                              done_var_28 = makeBoolean((NIL == valid_30));
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
        } else if (((NIL == argnum)
             && (NIL != cycl_function))) {
          if ((NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, cycl_function))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, cycl_function);
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, NIL, NIL);
                        {
                          SubLObject done_var_31 = NIL;
                          SubLObject token_var_32 = NIL;
                          while ((NIL == done_var_31)) {
                            {
                              SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                              SubLObject valid_33 = makeBoolean((token_var_32 != ass));
                              if ((NIL != valid_33)) {
                                Functions.funcall(subl_function, ass);
                              }
                              done_var_31 = makeBoolean((NIL == valid_33));
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
        } else if (((NIL == argnum)
             && (NIL == cycl_function))) {
          if ((NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, NIL, NIL);
                        {
                          SubLObject done_var_34 = NIL;
                          SubLObject token_var_35 = NIL;
                          while ((NIL == done_var_34)) {
                            {
                              SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_35);
                              SubLObject valid_36 = makeBoolean((token_var_35 != ass));
                              if ((NIL != valid_36)) {
                                Functions.funcall(subl_function, ass);
                              }
                              done_var_34 = makeBoolean((NIL == valid_36));
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
        }
      } catch (Throwable ccatch_env_var) {
        catch_var = Errors.handleThrowable(ccatch_env_var, $kw17$MAPPING_DONE);
      }
    }
    return NIL;
  }

  /** Apply FUNCTION to each rule assertion which contains a SENSE-lit with
   predicate PRED and has direction DIRECTION.
   If DIRECTION is NIL, assertions are not filtered based on direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 5972) 
  public static final SubLObject map_predicate_rule_index(SubLObject function, SubLObject pred, SubLObject sense, SubLObject direction, SubLObject mt) {
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(function, $sym15$FUNCTION_SPEC_P);
      checkType(sense, $sym19$SENSE_P);
      {
        SubLObject catch_var = NIL;
        try {
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
              try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                if ((NIL != direction)) {
                  if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, direction))) {
                    {
                      SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                                {
                                  SubLObject done_var_37 = NIL;
                                  SubLObject token_var_38 = NIL;
                                  while ((NIL == done_var_37)) {
                                    {
                                      SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_38);
                                      SubLObject valid_39 = makeBoolean((token_var_38 != ass));
                                      if ((NIL != valid_39)) {
                                        Functions.funcall(function, ass);
                                      }
                                      done_var_37 = makeBoolean((NIL == valid_39));
                                    }
                                  }
                                }
                              } finally {
                                {
                                  SubLObject _prev_bind_0_40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                  try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    if ((NIL != final_index_iterator)) {
                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                  } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
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
                } else {
                  if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL))) {
                    {
                      SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                                {
                                  SubLObject done_var_41 = NIL;
                                  SubLObject token_var_42 = NIL;
                                  while ((NIL == done_var_41)) {
                                    {
                                      SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_42);
                                      SubLObject valid_43 = makeBoolean((token_var_42 != ass));
                                      if ((NIL != valid_43)) {
                                        Functions.funcall(function, ass);
                                      }
                                      done_var_41 = makeBoolean((NIL == valid_43));
                                    }
                                  }
                                }
                              } finally {
                                {
                                  SubLObject _prev_bind_0_44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                  try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    if ((NIL != final_index_iterator)) {
                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                  } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_44, thread);
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
                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } catch (Throwable ccatch_env_var) {
          catch_var = Errors.handleThrowable(ccatch_env_var, $kw17$MAPPING_DONE);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-mapping.lisp", position = 14037) 
  private static SubLSymbol $map_term_selective_test$ = null;

  @SubL(source = "cycl/kb-mapping.lisp", position = 14093) 
  private static SubLSymbol $map_term_selective_action$ = null;

  /** Apply FUNCTION to each assertion with TRUTH in MT TERM.
   If TRUTH is nil, all assertions are mapped.
   If GAFS-ONLY, then only gafs are mapped. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 15141) 
  public static final SubLObject map_mt_contents(SubLObject function, SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
    if ((truth == UNPROVIDED)) {
      truth = NIL;
    }
    if ((gafs_only == UNPROVIDED)) {
      gafs_only = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(function, $sym15$FUNCTION_SPEC_P);
      if ((NIL != forts.fort_p(v_term))) {
        if ((NIL != kb_indexing.broad_mtP(v_term))) {
          if ((NIL != mt_relevance_macros.relevant_mtP(v_term))) {
            {
              SubLObject _prev_bind_0 = $mapping_truth$.currentBinding(thread);
              try {
                $mapping_truth$.bind(truth, thread);
                {
                  SubLObject catch_var = NIL;
                  try {
                    {
                      SubLObject idx = assertion_handles.do_assertions_table();
                      SubLObject mess = $str34$mapping_broad_mt_index;
                      SubLObject total = id_index.id_index_count(idx);
                      SubLObject sofar = ZERO_INTEGER;
                      checkType(mess, $sym35$STRINGP);
                      {
                        SubLObject _prev_bind_0_119 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                          utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                          utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                          utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                          utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                          utilities_macros.noting_percent_progress_preamble(mess);
                          {
                            SubLObject idx_120 = idx;
                            if ((NIL == id_index.id_index_objects_empty_p(idx_120, $kw36$SKIP))) {
                              {
                                SubLObject idx_121 = idx_120;
                                if ((NIL == id_index.id_index_old_objects_empty_p(idx_121, $kw36$SKIP))) {
                                  {
                                    SubLObject vector_var = id_index.id_index_old_objects(idx_121);
                                    SubLObject backwardP_var = NIL;
                                    SubLObject length = Sequences.length(vector_var);
                                    SubLObject v_iteration = NIL;
                                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                                      {
                                        SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                                        SubLObject assertion = Vectors.aref(vector_var, id);
                                        if ((!(((NIL != id_index.id_index_tombstone_p(assertion))
                                               && (NIL != id_index.id_index_skip_tombstones_p($kw36$SKIP)))))) {
                                          if ((NIL != id_index.id_index_tombstone_p(assertion))) {
                                            assertion = $kw36$SKIP;
                                          }
                                          utilities_macros.note_percent_progress(sofar, total);
                                          sofar = Numbers.add(sofar, ONE_INTEGER);
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9466");
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              {
                                SubLObject idx_122 = idx_120;
                                if ((!(((NIL != id_index.id_index_new_objects_empty_p(idx_122))
                                       && (NIL != id_index.id_index_skip_tombstones_p($kw36$SKIP)))))) {
                                  {
                                    SubLObject v_new = id_index.id_index_new_objects(idx_122);
                                    SubLObject id = id_index.id_index_new_id_threshold(idx_122);
                                    SubLObject end_id = id_index.id_index_next_id(idx_122);
                                    SubLObject v_default = ((NIL != id_index.id_index_skip_tombstones_p($kw36$SKIP)) ? ((SubLObject) NIL) : $kw36$SKIP);
                                    while (id.numL(end_id)) {
                                      {
                                        SubLObject assertion = Hashtables.gethash_without_values(id, v_new, v_default);
                                        if ((!(((NIL != id_index.id_index_skip_tombstones_p($kw36$SKIP))
                                               && (NIL != id_index.id_index_tombstone_p(assertion)))))) {
                                          utilities_macros.note_percent_progress(sofar, total);
                                          sofar = Numbers.add(sofar, ONE_INTEGER);
                                          Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9467");
                                        }
                                      }
                                      id = Numbers.add(id, ONE_INTEGER);
                                    }
                                  }
                                }
                              }
                            }
                          }
                          utilities_macros.noting_percent_progress_postamble();
                        } finally {
                          utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                          utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                          utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                          utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_119, thread);
                        }
                      }
                    }
                  } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $kw17$MAPPING_DONE);
                  }
                }
              } finally {
                $mapping_truth$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else {
          map_mt_index(function, v_term, truth, gafs_only);
        }
      }
      return NIL;
    }
  }

  /** Apply FUNCTION to each assertion with TRUTH at mt index MT.
   If TRUTH is nil, all assertions are mapped.
   If GAFS-ONLY, then only gafs are mapped. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 16454) 
  public static final SubLObject map_mt_index(SubLObject function, SubLObject mt, SubLObject truth, SubLObject gafs_only) {
    if ((truth == UNPROVIDED)) {
      truth = NIL;
    }
    if ((gafs_only == UNPROVIDED)) {
      gafs_only = NIL;
    }
    checkType(function, $sym15$FUNCTION_SPEC_P);
    if ((NIL != forts.fort_p(mt))) {
      {
        SubLObject type = ((NIL != gafs_only) ? ((SubLObject) $kw18$GAF) : NIL);
        if ((NIL != kb_mapping_macros.do_mt_index_key_validator(mt, type))) {
          {
            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
            SubLObject final_index_iterator = NIL;
            try {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
              {
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while ((NIL == done_var)) {
                  {
                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    SubLObject valid = makeBoolean((token_var != ass));
                    if ((NIL != valid)) {
                      Functions.funcall(function, ass);
                    }
                    done_var = makeBoolean((NIL == valid));
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
      }
    }
    return NIL;
  }

  /** Apply FUNCTION to each assertion with TRUTH at other index TERM.
   If TRUTH is nil, all assertions are mapped.
   If GAFS-ONLY, then only gafs are mapped. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 16978) 
  public static final SubLObject map_other_index(SubLObject function, SubLObject v_term, SubLObject truth, SubLObject gafs_only) {
    if ((truth == UNPROVIDED)) {
      truth = NIL;
    }
    if ((gafs_only == UNPROVIDED)) {
      gafs_only = NIL;
    }
    checkType(function, $sym15$FUNCTION_SPEC_P);
    {
      SubLObject type = ((NIL != gafs_only) ? ((SubLObject) $kw18$GAF) : NIL);
      if ((NIL != kb_mapping_macros.do_other_index_key_validator(v_term, type))) {
        {
          SubLObject final_index_spec = kb_mapping_macros.other_final_index_spec(v_term);
          SubLObject final_index_iterator = NIL;
          try {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, truth, NIL);
            {
              SubLObject done_var = NIL;
              SubLObject token_var = NIL;
              while ((NIL == done_var)) {
                {
                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                  SubLObject valid = makeBoolean((token_var != ass));
                  if ((NIL != valid)) {
                    if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30389"))) {
                      Functions.funcall(function, ass);
                    }
                  }
                  done_var = makeBoolean((NIL == valid));
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
    }
    return NIL;
  }

  /** Return a list of all mt-relevant assertions indexed via TERM.
If REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 17485) 
  public static final SubLObject gather_index(SubLObject v_term, SubLObject remove_duplicatesP) {
    if ((remove_duplicatesP == UNPROVIDED)) {
      remove_duplicatesP = NIL;
    }
    {
      SubLObject result = NIL;
      if ((NIL != auxiliary_indexing.auxiliary_index_p(v_term))) {
        if ((v_term == auxiliary_indexing.unbound_rule_index())) {
          if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30393"))) {
            {
              SubLObject iterator_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30412");
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
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                        {
                          SubLObject done_var_123 = NIL;
                          SubLObject token_var_124 = NIL;
                          while ((NIL == done_var_123)) {
                            {
                              SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_124);
                              SubLObject valid_125 = makeBoolean((token_var_124 != ass));
                              if ((NIL != valid_125)) {
                                result = cons(ass, result);
                              }
                              done_var_123 = makeBoolean((NIL == valid_125));
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
        } else {
          Errors.cerror($str45$So_don_t_, $str46$Can_t_gather_unknown_auxiliary_in, v_term);
        }
      } else {
        if ((NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                      {
                        SubLObject done_var_126 = NIL;
                        SubLObject token_var_127 = NIL;
                        while ((NIL == done_var_126)) {
                          {
                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_127);
                            SubLObject valid_128 = makeBoolean((token_var_127 != ass));
                            if ((NIL != valid_128)) {
                              if ((NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                result = cons(ass, result);
                              }
                            }
                            done_var_126 = makeBoolean((NIL == valid_128));
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
      }
      if ((NIL != remove_duplicatesP)) {
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      return result;
    }
  }

  /** Return a list of all assertions indexed via TERM.
If REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 18321) 
  public static final SubLObject gather_index_in_any_mt(SubLObject v_term, SubLObject remove_duplicatesP) {
    if ((remove_duplicatesP == UNPROVIDED)) {
      remove_duplicatesP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const52$EverythingPSC, thread);
            result = gather_index(v_term, remove_duplicatesP);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Return a list of all gaf assertions such that:
a) TERM is its ARGNUMth argument
b) if TRUTH is non-nil, then TRUTH is its truth value
c) if PRED is non-nil, then PRED must be its predicate
d) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil). */
  @SubL(source = "cycl/kb-mapping.lisp", position = 18685) 
  public static final SubLObject gather_gaf_arg_index(SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt, SubLObject truth) {
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw55$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(argnum, $sym16$POSITIVE_INTEGER_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != pred)) {
              {
                SubLObject pred_var = pred;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, truth, NIL);
                              {
                                SubLObject done_var_129 = NIL;
                                SubLObject token_var_130 = NIL;
                                while ((NIL == done_var_129)) {
                                  {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_130);
                                    SubLObject valid_131 = makeBoolean((token_var_130 != ass));
                                    if ((NIL != valid_131)) {
                                      result = cons(ass, result);
                                    }
                                    done_var_129 = makeBoolean((NIL == valid_131));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_132 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_132, thread);
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
            } else {
              {
                SubLObject pred_var = NIL;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, truth, NIL);
                              {
                                SubLObject done_var_133 = NIL;
                                SubLObject token_var_134 = NIL;
                                while ((NIL == done_var_133)) {
                                  {
                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_134);
                                    SubLObject valid_135 = makeBoolean((token_var_134 != ass));
                                    if ((NIL != valid_135)) {
                                      result = cons(ass, result);
                                    }
                                    done_var_133 = makeBoolean((NIL == valid_135));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_136 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_136, thread);
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
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all gaf assertions such that:
a) PRED is its predicate
b) if TRUTH is non-nil, then TRUTH is its truth value
c) if MT is non-nil, then MT must be its microtheory. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 20371) 
  public static final SubLObject gather_predicate_extent_index(SubLObject pred, SubLObject mt, SubLObject truth) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((truth == UNPROVIDED)) {
      truth = $kw55$TRUE;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            {
              SubLObject pred_var = pred;
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, truth, NIL);
                            {
                              SubLObject done_var_143 = NIL;
                              SubLObject token_var_144 = NIL;
                              while ((NIL == done_var_143)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_144);
                                  SubLObject valid_145 = makeBoolean((token_var_144 != ass));
                                  if ((NIL != valid_145)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_143 = makeBoolean((NIL == valid_145));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_146 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_146, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all #$termOfUnit assertions such that:
FUNC is the functor of the naut arg2. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 20877) 
  public static final SubLObject gather_function_extent_index(SubLObject func) {
    {
      SubLObject result = NIL;
      if ((NIL != kb_mapping_macros.do_function_extent_index_key_validator(func))) {
        {
          SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(func);
          SubLObject final_index_iterator = NIL;
          try {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw18$GAF, NIL, NIL);
            {
              SubLObject done_var = NIL;
              SubLObject token_var = NIL;
              while ((NIL == done_var)) {
                {
                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                  SubLObject valid = makeBoolean((token_var != ass));
                  if ((NIL != valid)) {
                    result = cons(ass, result);
                  }
                  done_var = makeBoolean((NIL == valid));
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
      result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return result;
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) if SENSE is :pos, it has PRED as a predicate in a positive literal
b) if SENSE is :neg, it has PRED as a predicate in a negative literal
c) if MT is non-nil, then MT must be its microtheory
d) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 21227) 
  public static final SubLObject gather_predicate_rule_index(SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sense, $sym19$SENSE_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_147 = NIL;
                              SubLObject token_var_148 = NIL;
                              while ((NIL == done_var_147)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_148);
                                  SubLObject valid_149 = makeBoolean((token_var_148 != ass));
                                  if ((NIL != valid_149)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_147 = makeBoolean((NIL == valid_149));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_150 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_150, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(pred, sense, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_151 = NIL;
                              SubLObject token_var_152 = NIL;
                              while ((NIL == done_var_151)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_152);
                                  SubLObject valid_153 = makeBoolean((token_var_152 != ass));
                                  if ((NIL != valid_153)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_151 = makeBoolean((NIL == valid_153));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_154 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_154, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist
b) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist
c) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 22254) 
  public static final SubLObject gather_decontextualized_ist_predicate_rule_index(SubLObject pred, SubLObject sense, SubLObject direction) {
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(sense, $sym19$SENSE_P);
    {
      SubLObject result = NIL;
      if ((NIL != direction)) {
        if ((NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, direction))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, direction);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                      {
                        SubLObject done_var_155 = NIL;
                        SubLObject token_var_156 = NIL;
                        while ((NIL == done_var_155)) {
                          {
                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_156);
                            SubLObject valid_157 = makeBoolean((token_var_156 != ass));
                            if ((NIL != valid_157)) {
                              result = cons(ass, result);
                            }
                            done_var_155 = makeBoolean((NIL == valid_157));
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
      } else {
        if ((NIL != kb_mapping_macros.do_decontextualized_ist_predicate_rule_index_key_validator(pred, sense, NIL))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_decontextualized_ist_predicate_rule_final_index_spec_iterator(pred, sense, NIL);
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                      {
                        SubLObject done_var_158 = NIL;
                        SubLObject token_var_159 = NIL;
                        while ((NIL == done_var_158)) {
                          {
                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_159);
                            SubLObject valid_160 = makeBoolean((token_var_159 != ass));
                            if ((NIL != valid_160)) {
                              result = cons(ass, result);
                            }
                            done_var_158 = makeBoolean((NIL == valid_160));
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
      }
      result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return result;
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)
b) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)
c) if MT is non-nil, then MT must be its microtheory
d) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 23062) 
  public static final SubLObject gather_isa_rule_index(SubLObject collection, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sense, $sym19$SENSE_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_161 = NIL;
                              SubLObject token_var_162 = NIL;
                              while ((NIL == done_var_161)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_162);
                                  SubLObject valid_163 = makeBoolean((token_var_162 != ass));
                                  if ((NIL != valid_163)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_161 = makeBoolean((NIL == valid_163));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_164 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_164, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_isa_rule_index_key_validator(collection, sense, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_isa_rule_final_index_spec_iterator(collection, sense, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_165 = NIL;
                              SubLObject token_var_166 = NIL;
                              while ((NIL == done_var_165)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_166);
                                  SubLObject valid_167 = makeBoolean((token_var_166 != ass));
                                  if ((NIL != valid_167)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_165 = makeBoolean((NIL == valid_167));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_168 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_168, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)
b) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)
c) if MT is non-nil, then MT must be its microtheory
d) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 23904) 
  public static final SubLObject gather_quoted_isa_rule_index(SubLObject collection, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sense, $sym19$SENSE_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_169 = NIL;
                              SubLObject token_var_170 = NIL;
                              while ((NIL == done_var_169)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_170);
                                  SubLObject valid_171 = makeBoolean((token_var_170 != ass));
                                  if ((NIL != valid_171)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_169 = makeBoolean((NIL == valid_171));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_172 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_172, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_quoted_isa_rule_index_key_validator(collection, sense, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_quoted_isa_rule_final_index_spec_iterator(collection, sense, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_173 = NIL;
                              SubLObject token_var_174 = NIL;
                              while ((NIL == done_var_173)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_174);
                                  SubLObject valid_175 = makeBoolean((token_var_174 != ass));
                                  if ((NIL != valid_175)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_173 = makeBoolean((NIL == valid_175));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_176 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_176, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)
b) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)
c) if MT is non-nil, then MT must be its microtheory
d) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 24779) 
  public static final SubLObject gather_genls_rule_index(SubLObject collection, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sense, $sym19$SENSE_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_177 = NIL;
                              SubLObject token_var_178 = NIL;
                              while ((NIL == done_var_177)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_178);
                                  SubLObject valid_179 = makeBoolean((token_var_178 != ass));
                                  if ((NIL != valid_179)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_177 = makeBoolean((NIL == valid_179));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_180 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_180, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_genls_rule_index_key_validator(collection, sense, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_genls_rule_final_index_spec_iterator(collection, sense, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_181 = NIL;
                              SubLObject token_var_182 = NIL;
                              while ((NIL == done_var_181)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_182);
                                  SubLObject valid_183 = makeBoolean((token_var_182 != ass));
                                  if ((NIL != valid_183)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_181 = makeBoolean((NIL == valid_183));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_184 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_184, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)
b) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)
c) if RULE-MT is non-nil, then RULE-MT must be its microtheory
d) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 25634) 
  public static final SubLObject gather_genl_mt_rule_index(SubLObject genl_mt, SubLObject sense, SubLObject rule_mt, SubLObject direction) {
    if ((rule_mt == UNPROVIDED)) {
      rule_mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(sense, $sym19$SENSE_P);
      {
        SubLObject result = NIL;
        SubLObject mt_var = rule_mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_185 = NIL;
                              SubLObject token_var_186 = NIL;
                              while ((NIL == done_var_185)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_186);
                                  SubLObject valid_187 = makeBoolean((token_var_186 != ass));
                                  if ((NIL != valid_187)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_185 = makeBoolean((NIL == valid_187));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_188 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_188, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_genl_mt_rule_index_key_validator(genl_mt, sense, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_genl_mt_rule_final_index_spec_iterator(genl_mt, sense, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_189 = NIL;
                              SubLObject token_var_190 = NIL;
                              while ((NIL == done_var_189)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_190);
                                  SubLObject valid_191 = makeBoolean((token_var_190 != ass));
                                  if ((NIL != valid_191)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_189 = makeBoolean((NIL == valid_191));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_192 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_192, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))
b) if MT is non-nil, then MT must be its microtheory
c) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 26501) 
  public static final SubLObject gather_function_rule_index(SubLObject func, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_function_rule_index_key_validator(func, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(func, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_193 = NIL;
                              SubLObject token_var_194 = NIL;
                              while ((NIL == done_var_193)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_194);
                                  SubLObject valid_195 = makeBoolean((token_var_194 != ass));
                                  if ((NIL != valid_195)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_193 = makeBoolean((NIL == valid_195));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_196 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_196, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_function_rule_index_key_validator(func, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(func, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_197 = NIL;
                              SubLObject token_var_198 = NIL;
                              while ((NIL == done_var_197)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_198);
                                  SubLObject valid_199 = makeBoolean((token_var_198 != ass));
                                  if ((NIL != valid_199)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_197 = makeBoolean((NIL == valid_199));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_200 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_200, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) it has a positive literal of the form (abnormal <whatever> RULE)
b) if MT is non-nil, then MT must be its microtheory
c) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 27180) 
  public static final SubLObject gather_exception_rule_index(SubLObject rule, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_201 = NIL;
                              SubLObject token_var_202 = NIL;
                              while ((NIL == done_var_201)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_202);
                                  SubLObject valid_203 = makeBoolean((token_var_202 != ass));
                                  if ((NIL != valid_203)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_201 = makeBoolean((NIL == valid_203));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_204 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_204, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_205 = NIL;
                              SubLObject token_var_206 = NIL;
                              while ((NIL == done_var_205)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_206);
                                  SubLObject valid_207 = makeBoolean((token_var_206 != ass));
                                  if ((NIL != valid_207)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_205 = makeBoolean((NIL == valid_207));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_208 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_208, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all non-gaf assertions (rules) such that:
a) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)
b) if MT is non-nil, then MT must be its microtheory
c) if DIRECTION is non-nil, then DIRECTION must be its direction. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 27845) 
  public static final SubLObject gather_pragma_rule_index(SubLObject rule, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
            if ((NIL != direction)) {
              if ((NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, direction))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, direction);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, direction);
                            {
                              SubLObject done_var_209 = NIL;
                              SubLObject token_var_210 = NIL;
                              while ((NIL == done_var_209)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_210);
                                  SubLObject valid_211 = makeBoolean((token_var_210 != ass));
                                  if ((NIL != valid_211)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_209 = makeBoolean((NIL == valid_211));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_212 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_212, thread);
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
            } else {
              if ((NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL))) {
                {
                  SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$RULE, NIL, NIL);
                            {
                              SubLObject done_var_213 = NIL;
                              SubLObject token_var_214 = NIL;
                              while ((NIL == done_var_213)) {
                                {
                                  SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_214);
                                  SubLObject valid_215 = makeBoolean((token_var_214 != ass));
                                  if ((NIL != valid_215)) {
                                    result = cons(ass, result);
                                  }
                                  done_var_213 = makeBoolean((NIL == valid_215));
                                }
                              }
                            }
                          } finally {
                            {
                              SubLObject _prev_bind_0_216 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                              try {
                                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                if ((NIL != final_index_iterator)) {
                                  kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                              } finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_216, thread);
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
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        result = list_utilities.fast_delete_duplicates(result, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
      }
    }
  }

  /** Return a list of all assertions such that TERM is its microtheory. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 28518) 
  public static final SubLObject gather_mt_index(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if (((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))
            || ((NIL != hlmt.hlmt_p(v_term))
               && (NIL != kb_indexing.broad_mtP(hlmt.hlmt_monad_mt(v_term)))))) {
          {
            SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
              control_vars.$mapping_answer$.bind(NIL, thread);
              {
                SubLObject _prev_bind_0_217 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                  mt_relevance_macros.$relevant_mt_function$.bind($sym96$RELEVANT_MT_IS_EQ, thread);
                  mt_relevance_macros.$mt$.bind(v_term, thread);
                  map_mt_contents(Symbols.symbol_function($sym97$GATHER_ASSERTIONS), hlmt.hlmt_monad_mt(v_term), UNPROVIDED, UNPROVIDED);
                } finally {
                  mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_217, thread);
                }
              }
              ans = control_vars.$mapping_answer$.getDynamicValue(thread);
            } finally {
              control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          {
            SubLObject final_index = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12735");
            if ((NIL != final_index)) {
              ans = conses_high.copy_list(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31920"));
            }
          }
        }
        return ans;
      }
    }
  }

  /** Return a list of other assertions mentioning TERM but not indexed in any other more useful manner. */
  @SubL(source = "cycl/kb-mapping.lisp", position = 29282) 
  public static final SubLObject gather_other_index(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
          {
            SubLObject _prev_bind_0 = control_vars.$mapping_answer$.currentBinding(thread);
            try {
              control_vars.$mapping_answer$.bind(NIL, thread);
              map_other_index(Symbols.symbol_function($sym97$GATHER_ASSERTIONS), v_term, UNPROVIDED, UNPROVIDED);
              ans = control_vars.$mapping_answer$.getDynamicValue(thread);
            } finally {
              control_vars.$mapping_answer$.rebind(_prev_bind_0, thread);
            }
          }
        } else {
          {
            SubLObject final_index = kb_indexing.get_other_subindex(v_term);
            if ((NIL != final_index)) {
              ans = conses_high.copy_list(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31921"));
            }
          }
        }
        return ans;
      }
    }
  }

  public static final class $assertion_with_search_term$UnaryFunction extends UnaryFunction {
    public $assertion_with_search_term$UnaryFunction() { super(extractFunctionNamed("ASSERTION-WITH-SEARCH-TERM")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9442"); }
  }

  @SubL(source = "cycl/kb-mapping.lisp", position = 31431) 
  public static final SubLObject gather_assertions(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL == control_vars.$mapping_assertion_selection_fn$.getDynamicValue(thread))
          || (NIL != Functions.funcall(control_vars.$mapping_assertion_selection_fn$.getDynamicValue(thread), assertion)))) {
        control_vars.$mapping_answer$.setDynamicValue(cons(assertion, control_vars.$mapping_answer$.getDynamicValue(thread)), thread);
      }
      return NIL;
    }
  }

  public static final class $gather_assertions$UnaryFunction extends UnaryFunction {
    public $gather_assertions$UnaryFunction() { super(extractFunctionNamed("GATHER-ASSERTIONS")); }
    public SubLObject processItem(SubLObject arg1) { return gather_assertions(arg1); }
  }

  public static final SubLObject declare_kb_mapping_file() {
    //declareMacro(myName, "do_intermediate_index_relevant_preds", "DO-INTERMEDIATE-INDEX-RELEVANT-PREDS");
    //declareMacro(myName, "do_intermediate_index_relevant_mts", "DO-INTERMEDIATE-INDEX-RELEVANT-MTS");
    //declareMacro(myName, "do_intermediate_index_with_direction", "DO-INTERMEDIATE-INDEX-WITH-DIRECTION");
    //declareMacro(myName, "do_final_index_assertions_with_truth", "DO-FINAL-INDEX-ASSERTIONS-WITH-TRUTH");
    //declareFunction(myName, "map_gaf_arg_index", "MAP-GAF-ARG-INDEX", 3, 3, false);
    //declareFunction(myName, "map_predicate_extent_index", "MAP-PREDICATE-EXTENT-INDEX", 2, 2, false);
    declareFunction(myName, "map_nart_arg_index", "MAP-NART-ARG-INDEX", 2, 2, false);
    //declareFunction(myName, "map_function_extent_index", "MAP-FUNCTION-EXTENT-INDEX", 2, 0, false);
    declareFunction(myName, "map_predicate_rule_index", "MAP-PREDICATE-RULE-INDEX", 3, 2, false);
    //declareFunction(myName, "map_decontextualized_ist_predicate_rule_index", "MAP-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 3, 1, false);
    //declareFunction(myName, "map_isa_rule_index", "MAP-ISA-RULE-INDEX", 3, 2, false);
    //declareFunction(myName, "map_quoted_isa_rule_index", "MAP-QUOTED-ISA-RULE-INDEX", 3, 2, false);
    //declareFunction(myName, "map_genls_rule_index", "MAP-GENLS-RULE-INDEX", 3, 2, false);
    //declareFunction(myName, "map_genl_mt_rule_index", "MAP-GENL-MT-RULE-INDEX", 3, 2, false);
    //declareFunction(myName, "map_function_rule_index", "MAP-FUNCTION-RULE-INDEX", 2, 2, false);
    //declareFunction(myName, "map_exception_rule_index", "MAP-EXCEPTION-RULE-INDEX", 2, 2, false);
    //declareFunction(myName, "map_pragma_rule_index", "MAP-PRAGMA-RULE-INDEX", 2, 2, false);
    //declareFunction(myName, "map_unbound_predicate_rule_index", "MAP-UNBOUND-PREDICATE-RULE-INDEX", 2, 1, false);
    //declareFunction(myName, "map_term", "MAP-TERM", 2, 0, false);
    //declareFunction(myName, "selected_map_term", "SELECTED-MAP-TERM", 2, 2, false);
    //declareFunction(myName, "map_term_selective", "MAP-TERM-SELECTIVE", 3, 1, false);
    //declareFunction(myName, "map_term_selective_internal", "MAP-TERM-SELECTIVE-INTERNAL", 1, 0, false);
    //declareFunction(myName, "map_term_gafs", "MAP-TERM-GAFS", 2, 1, false);
    declareFunction(myName, "map_mt_contents", "MAP-MT-CONTENTS", 2, 2, false);
    //declareFunction(myName, "map_mt_index_internal", "MAP-MT-INDEX-INTERNAL", 4, 0, false);
    //declareFunction(myName, "assertion_matching_truthP", "ASSERTION-MATCHING-TRUTH?", 1, 0, false);
    declareFunction(myName, "map_mt_index", "MAP-MT-INDEX", 2, 2, false);
    declareFunction(myName, "map_other_index", "MAP-OTHER-INDEX", 2, 2, false);
    declareFunction(myName, "gather_index", "GATHER-INDEX", 1, 1, false);
    declareFunction(myName, "gather_index_in_any_mt", "GATHER-INDEX-IN-ANY-MT", 1, 1, false);
    declareFunction(myName, "gather_gaf_arg_index", "GATHER-GAF-ARG-INDEX", 2, 3, false);
    //declareFunction(myName, "gather_gaf_arg_index_with_predicate", "GATHER-GAF-ARG-INDEX-WITH-PREDICATE", 3, 2, false);
    //declareFunction(myName, "gather_nart_arg_index", "GATHER-NART-ARG-INDEX", 2, 1, false);
    declareFunction(myName, "gather_predicate_extent_index", "GATHER-PREDICATE-EXTENT-INDEX", 1, 2, false);
    declareFunction(myName, "gather_function_extent_index", "GATHER-FUNCTION-EXTENT-INDEX", 1, 0, false);
    declareFunction(myName, "gather_predicate_rule_index", "GATHER-PREDICATE-RULE-INDEX", 2, 2, false);
    //declareFunction(myName, "gather_predicate_rule_index_in_all_mts", "GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS", 2, 1, false);
    declareFunction(myName, "gather_decontextualized_ist_predicate_rule_index", "GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 1, false);
    declareFunction(myName, "gather_isa_rule_index", "GATHER-ISA-RULE-INDEX", 2, 2, false);
    declareFunction(myName, "gather_quoted_isa_rule_index", "GATHER-QUOTED-ISA-RULE-INDEX", 2, 2, false);
    declareFunction(myName, "gather_genls_rule_index", "GATHER-GENLS-RULE-INDEX", 2, 2, false);
    declareFunction(myName, "gather_genl_mt_rule_index", "GATHER-GENL-MT-RULE-INDEX", 2, 2, false);
    declareFunction(myName, "gather_function_rule_index", "GATHER-FUNCTION-RULE-INDEX", 1, 2, false);
    declareFunction(myName, "gather_exception_rule_index", "GATHER-EXCEPTION-RULE-INDEX", 1, 2, false);
    declareFunction(myName, "gather_pragma_rule_index", "GATHER-PRAGMA-RULE-INDEX", 1, 2, false);
    declareFunction(myName, "gather_mt_index", "GATHER-MT-INDEX", 1, 0, false);
    declareFunction(myName, "gather_other_index", "GATHER-OTHER-INDEX", 1, 0, false);
    //declareFunction(myName, "gather_term_assertions", "GATHER-TERM-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "all_fort_meta_assertions", "ALL-FORT-META-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "mapping_answer_foundP", "MAPPING-ANSWER-FOUND?", 0, 0, false);
    //declareFunction(myName, "mapping_finishedP", "MAPPING-FINISHED?", 0, 0, false);
    //declareFunction(myName, "gather_object", "GATHER-OBJECT", 1, 0, false);
    //declareFunction(myName, "count_object", "COUNT-OBJECT", 1, 0, false);
    //declareFunction(myName, "assertion_with_search_term", "ASSERTION-WITH-SEARCH-TERM", 1, 0, false); new $assertion_with_search_term$UnaryFunction();
    //declareFunction(myName, "assertion_without_search_term", "ASSERTION-WITHOUT-SEARCH-TERM", 1, 0, false);
    //declareFunction(myName, "gather_formula", "GATHER-FORMULA", 1, 0, false);
    declareFunction(myName, "gather_assertions", "GATHER-ASSERTIONS", 1, 0, false); new $gather_assertions$UnaryFunction();
    //declareFunction(myName, "gather_some_assertions", "GATHER-SOME-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "gather_unique_assertions", "GATHER-UNIQUE-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "gather_meta_assertions", "GATHER-META-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "gather_arg", "GATHER-ARG", 1, 2, false);
    //declareFunction(myName, "gather_fn_of_arg", "GATHER-FN-OF-ARG", 1, 3, false);
    return NIL;
  }

  public static final SubLObject init_kb_mapping_file() {
    $mapping_function$ = defparameter("*MAPPING-FUNCTION*", NIL);
    $mapping_truth$ = defparameter("*MAPPING-TRUTH*", NIL);
    $mapping_direction$ = defparameter("*MAPPING-DIRECTION*", NIL);
    $map_term_selective_test$ = defparameter("*MAP-TERM-SELECTIVE-TEST*", NIL);
    $map_term_selective_action$ = defparameter("*MAP-TERM-SELECTIVE-ACTION*", NIL);
    return NIL;
  }

  public static final SubLObject setup_kb_mapping_file() {
    // CVS_ID("Id: kb-mapping.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym21$MAP_TERM, $list22, $str23$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym27$MAP_TERM_SELECTIVE, $list28, $str29$Apply_FUNCTION_to_each_assertion_, $list30, $list25);
    utilities_macros.register_cyc_api_function($sym31$MAP_TERM_GAFS, $list32, $str33$Apply_FUNCTION_to_every_gaf_index, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym37$MAP_MT_CONTENTS, $list38, $str39$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym40$MAP_MT_INDEX, $list41, $str42$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym43$MAP_OTHER_INDEX, $list38, $str44$Apply_FUNCTION_to_each_assertion_, $list24, $list25);
    utilities_macros.register_cyc_api_function($sym47$GATHER_INDEX, $list48, $str49$Return_a_list_of_all_mt_relevant_, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym53$GATHER_INDEX_IN_ANY_MT, $list48, $str54$Return_a_list_of_all_assertions_i, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym56$GATHER_GAF_ARG_INDEX, $list57, $str58$Return_a_list_of_all_gaf_assertio, $list59, $list50);
    access_macros.define_obsolete_register($sym60$GATHER_GAF_ARG_INDEX_WITH_PREDICATE, $list61);
    utilities_macros.register_cyc_api_function($sym62$GATHER_NART_ARG_INDEX, $list63, $str64$Return_a_list_of_all___termOfUnit, $list59, $list50);
    utilities_macros.register_cyc_api_function($sym65$GATHER_PREDICATE_EXTENT_INDEX, $list66, $str67$Return_a_list_of_all_gaf_assertio, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym68$GATHER_FUNCTION_EXTENT_INDEX, $list69, $str70$Return_a_list_of_all___termOfUnit, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym71$GATHER_PREDICATE_RULE_INDEX, $list72, $str73$Return_a_list_of_all_non_gaf_asse, $list74, $list50);
    utilities_macros.register_cyc_api_function($sym75$GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX, $list76, $str77$Return_a_list_of_all_non_gaf_asse, $list74, $list50);
    utilities_macros.register_cyc_api_function($sym78$GATHER_ISA_RULE_INDEX, $list79, $str80$Return_a_list_of_all_non_gaf_asse, $list74, $list50);
    utilities_macros.register_cyc_api_function($sym81$GATHER_QUOTED_ISA_RULE_INDEX, $list79, $str82$Return_a_list_of_all_non_gaf_asse, $list74, $list50);
    utilities_macros.register_cyc_api_function($sym83$GATHER_GENLS_RULE_INDEX, $list79, $str84$Return_a_list_of_all_non_gaf_asse, $list74, $list50);
    utilities_macros.register_cyc_api_function($sym85$GATHER_GENL_MT_RULE_INDEX, $list86, $str87$Return_a_list_of_all_non_gaf_asse, $list74, $list50);
    utilities_macros.register_cyc_api_function($sym88$GATHER_FUNCTION_RULE_INDEX, $list89, $str90$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym91$GATHER_EXCEPTION_RULE_INDEX, $list92, $str93$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym94$GATHER_PRAGMA_RULE_INDEX, $list92, $str95$Return_a_list_of_all_non_gaf_asse, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym98$GATHER_MT_INDEX, $list99, $str100$Return_a_list_of_all_assertions_s, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym101$GATHER_OTHER_INDEX, $list99, $str102$Return_a_list_of_other_assertions, NIL, $list50);
    utilities_macros.register_cyc_api_function($sym103$GATHER_TERM_ASSERTIONS, $list104, $str105$Return_a_list_of_all_mt_relevant_, NIL, $list50);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("SUBINDEX"), makeSymbol("PRED-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym2$DO_INTERMEDIATE_INDEX = makeSymbol("DO-INTERMEDIATE-INDEX");
  public static final SubLSymbol $sym3$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym4$RELEVANT_PRED_ = makeSymbol("RELEVANT-PRED?");
  public static final SubLList $list5 = list(list(makeSymbol("SUBINDEX"), makeSymbol("MT-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym6$MT = makeUninternedSymbol("MT");
  public static final SubLSymbol $sym7$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLList $list8 = list(list(makeSymbol("SUBINDEX"), makeSymbol("DIRECTION-INDEX"), makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym9$CANDIDATE_DIRECTION = makeUninternedSymbol("CANDIDATE-DIRECTION");
  public static final SubLSymbol $sym10$COR = makeSymbol("COR");
  public static final SubLSymbol $sym11$NULL = makeSymbol("NULL");
  public static final SubLList $list12 = list(list(makeSymbol("ASS"), makeSymbol("FINAL-INDEX"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym13$DO_FINAL_INDEX = makeSymbol("DO-FINAL-INDEX");
  public static final SubLSymbol $sym14$ASSERTION_MATCHES_TRUTH_ = makeSymbol("ASSERTION-MATCHES-TRUTH?");
  public static final SubLSymbol $sym15$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym16$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $kw17$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $kw18$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym19$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLSymbol $kw20$RULE = makeKeyword("RULE");
  public static final SubLSymbol $sym21$MAP_TERM = makeSymbol("MAP-TERM");
  public static final SubLList $list22 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"));
  public static final SubLString $str23$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion indexed from TERM.");
  public static final SubLList $list24 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")));
  public static final SubLList $list25 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym26$MAP_TERM_SELECTIVE_INTERNAL = makeSymbol("MAP-TERM-SELECTIVE-INTERNAL");
  public static final SubLSymbol $sym27$MAP_TERM_SELECTIVE = makeSymbol("MAP-TERM-SELECTIVE");
  public static final SubLList $list28 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("TEST"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"));
  public static final SubLString $str29$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion indexed from TERM with TRUTH that passes TEST.\n  If TRUTH is nil, all assertions are mapped.");
  public static final SubLList $list30 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TEST"), makeSymbol("FUNCTION-SPEC-P")));
  public static final SubLSymbol $sym31$MAP_TERM_GAFS = makeSymbol("MAP-TERM-GAFS");
  public static final SubLList $list32 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"));
  public static final SubLString $str33$Apply_FUNCTION_to_every_gaf_index = makeString("Apply FUNCTION to every gaf indexed from TERM.\n   If TRUTH is nil, all assertions are mapped.");
  public static final SubLString $str34$mapping_broad_mt_index = makeString("mapping broad mt index");
  public static final SubLSymbol $sym35$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw36$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym37$MAP_MT_CONTENTS = makeSymbol("MAP-MT-CONTENTS");
  public static final SubLList $list38 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"), makeSymbol("GAFS-ONLY"));
  public static final SubLString $str39$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH in MT TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");
  public static final SubLSymbol $sym40$MAP_MT_INDEX = makeSymbol("MAP-MT-INDEX");
  public static final SubLList $list41 = list(makeSymbol("FUNCTION"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH"), makeSymbol("GAFS-ONLY"));
  public static final SubLString $str42$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH at mt index MT.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");
  public static final SubLSymbol $sym43$MAP_OTHER_INDEX = makeSymbol("MAP-OTHER-INDEX");
  public static final SubLString $str44$Apply_FUNCTION_to_each_assertion_ = makeString("Apply FUNCTION to each assertion with TRUTH at other index TERM.\n   If TRUTH is nil, all assertions are mapped.\n   If GAFS-ONLY, then only gafs are mapped.");
  public static final SubLString $str45$So_don_t_ = makeString("So don't!");
  public static final SubLString $str46$Can_t_gather_unknown_auxiliary_in = makeString("Can't gather unknown auxiliary index ~s~%");
  public static final SubLSymbol $sym47$GATHER_INDEX = makeSymbol("GATHER-INDEX");
  public static final SubLList $list48 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("REMOVE-DUPLICATES?"));
  public static final SubLString $str49$Return_a_list_of_all_mt_relevant_ = makeString("Return a list of all mt-relevant assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");
  public static final SubLList $list50 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $sym51$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const52$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym53$GATHER_INDEX_IN_ANY_MT = makeSymbol("GATHER-INDEX-IN-ANY-MT");
  public static final SubLString $str54$Return_a_list_of_all_assertions_i = makeString("Return a list of all assertions indexed via TERM.\nIf REMOVE-DUPLICATES? is non-nil, assertions are guaranteed to only be listed once.");
  public static final SubLSymbol $kw55$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym56$GATHER_GAF_ARG_INDEX = makeSymbol("GATHER-GAF-ARG-INDEX");
  public static final SubLList $list57 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("PRED"), makeSymbol("MT"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str58$Return_a_list_of_all_gaf_assertio = makeString("Return a list of all gaf assertions such that:\na) TERM is its ARGNUMth argument\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if PRED is non-nil, then PRED must be its predicate\nd) if MT is non-nil, then MT must be its microtheory (and PRED must be non-nil).");
  public static final SubLList $list59 = list(list(makeSymbol("ARGNUM"), makeSymbol("POSITIVE-INTEGER-P")));
  public static final SubLSymbol $sym60$GATHER_GAF_ARG_INDEX_WITH_PREDICATE = makeSymbol("GATHER-GAF-ARG-INDEX-WITH-PREDICATE");
  public static final SubLList $list61 = list(makeSymbol("GATHER-GAF-ARG-INDEX"));
  public static final SubLSymbol $sym62$GATHER_NART_ARG_INDEX = makeSymbol("GATHER-NART-ARG-INDEX");
  public static final SubLList $list63 = list(makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("&OPTIONAL"), makeSymbol("FUNC"));
  public static final SubLString $str64$Return_a_list_of_all___termOfUnit = makeString("Return a list of all #$termOfUnit assertions with a naut arg2 such that:\na) TERM is its ARGNUMth argument\nb) if FUNC is non-nil, then FUNC must be its functor");
  public static final SubLSymbol $sym65$GATHER_PREDICATE_EXTENT_INDEX = makeSymbol("GATHER-PREDICATE-EXTENT-INDEX");
  public static final SubLList $list66 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str67$Return_a_list_of_all_gaf_assertio = makeString("Return a list of all gaf assertions such that:\na) PRED is its predicate\nb) if TRUTH is non-nil, then TRUTH is its truth value\nc) if MT is non-nil, then MT must be its microtheory.");
  public static final SubLSymbol $sym68$GATHER_FUNCTION_EXTENT_INDEX = makeSymbol("GATHER-FUNCTION-EXTENT-INDEX");
  public static final SubLList $list69 = list(makeSymbol("FUNC"));
  public static final SubLString $str70$Return_a_list_of_all___termOfUnit = makeString("Return a list of all #$termOfUnit assertions such that:\nFUNC is the functor of the naut arg2.");
  public static final SubLSymbol $sym71$GATHER_PREDICATE_RULE_INDEX = makeSymbol("GATHER-PREDICATE-RULE-INDEX");
  public static final SubLList $list72 = list(makeSymbol("PRED"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str73$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLList $list74 = list(list(makeSymbol("SENSE"), makeSymbol("SENSE-P")));
  public static final SubLSymbol $sym75$GATHER_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX = makeSymbol("GATHER-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX");
  public static final SubLList $list76 = list(makeSymbol("PRED"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"));
  public static final SubLString $str77$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has PRED as a predicate in a positive literal wrapped in #$ist\nb) if SENSE is :neg, it has PRED as a predicate in a negative literal wrapped in #$ist\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym78$GATHER_ISA_RULE_INDEX = makeSymbol("GATHER-ISA-RULE-INDEX");
  public static final SubLList $list79 = list(makeSymbol("COLLECTION"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str80$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (isa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (isa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym81$GATHER_QUOTED_ISA_RULE_INDEX = makeSymbol("GATHER-QUOTED-ISA-RULE-INDEX");
  public static final SubLString $str82$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (quotedIsa <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (quotedIsa <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym83$GATHER_GENLS_RULE_INDEX = makeSymbol("GATHER-GENLS-RULE-INDEX");
  public static final SubLString $str84$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genls <whatever> COLLECTION)\nb) if SENSE is :neg, it has a negative literal of the form (genls <whatever> COLLECTION)\nc) if MT is non-nil, then MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym85$GATHER_GENL_MT_RULE_INDEX = makeSymbol("GATHER-GENL-MT-RULE-INDEX");
  public static final SubLList $list86 = list(makeSymbol("GENL-MT"), makeSymbol("SENSE"), makeSymbol("&OPTIONAL"), makeSymbol("RULE-MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str87$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) if SENSE is :pos, it has a positive literal of the form (genlMt <whatever> GENL-MT)\nb) if SENSE is :neg, it has a negative literal of the form (genlMt <whatever> GENL-MT)\nc) if RULE-MT is non-nil, then RULE-MT must be its microtheory\nd) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym88$GATHER_FUNCTION_RULE_INDEX = makeSymbol("GATHER-FUNCTION-RULE-INDEX");
  public static final SubLList $list89 = list(makeSymbol("FUNC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str90$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a negative literal of the form (termOfUnit <whatever> (FUNC . <whatever>))\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym91$GATHER_EXCEPTION_RULE_INDEX = makeSymbol("GATHER-EXCEPTION-RULE-INDEX");
  public static final SubLList $list92 = list(makeSymbol("RULE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("DIRECTION"));
  public static final SubLString $str93$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (abnormal <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym94$GATHER_PRAGMA_RULE_INDEX = makeSymbol("GATHER-PRAGMA-RULE-INDEX");
  public static final SubLString $str95$Return_a_list_of_all_non_gaf_asse = makeString("Return a list of all non-gaf assertions (rules) such that:\na) it has a positive literal of the form (meetsPragmaticRequirement <whatever> RULE)\nb) if MT is non-nil, then MT must be its microtheory\nc) if DIRECTION is non-nil, then DIRECTION must be its direction.");
  public static final SubLSymbol $sym96$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym97$GATHER_ASSERTIONS = makeSymbol("GATHER-ASSERTIONS");
  public static final SubLSymbol $sym98$GATHER_MT_INDEX = makeSymbol("GATHER-MT-INDEX");
  public static final SubLList $list99 = list(makeSymbol("TERM"));
  public static final SubLString $str100$Return_a_list_of_all_assertions_s = makeString("Return a list of all assertions such that TERM is its microtheory.");
  public static final SubLSymbol $sym101$GATHER_OTHER_INDEX = makeSymbol("GATHER-OTHER-INDEX");
  public static final SubLString $str102$Return_a_list_of_other_assertions = makeString("Return a list of other assertions mentioning TERM but not indexed in any other more useful manner.");
  public static final SubLSymbol $sym103$GATHER_TERM_ASSERTIONS = makeSymbol("GATHER-TERM-ASSERTIONS");
  public static final SubLList $list104 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str105$Return_a_list_of_all_mt_relevant_ = makeString("Return a list of all mt-relevant assertions of TERM.");
  public static final SubLSymbol $sym106$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym107$GATHER_META_ASSERTIONS = makeSymbol("GATHER-META-ASSERTIONS");

  //// Initializers

  public void declareFunctions() {
    declare_kb_mapping_file();
  }

  public void initializeVariables() {
    init_kb_mapping_file();
  }

  public void runTopLevelForms() {
    setup_kb_mapping_file();
  }

}
