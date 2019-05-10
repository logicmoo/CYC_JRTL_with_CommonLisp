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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_gp_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class equality_store extends SubLTranslatedFile {

  //// Constructor

  private equality_store() {}
  public static final SubLFile me = new equality_store();
  public static final String myName = "com.cyc.cycjava_1.cycl.equality_store";

  //// Definitions

  @SubL(source = "cycl/equality-store.lisp", position = 859) 
  public static final SubLObject some_equality_assertionsP(SubLObject obj, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(obj))) {
      return makeBoolean(((NIL != some_equality_assertions_somewhereP(obj))
             && ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4402"))
              || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4403")))));
    }
    return NIL;
  }

  @SubL(source = "cycl/equality-store.lisp", position = 1474) 
  private static SubLSymbol $some_equality_assertions_somewhere_set$ = null;

  /** Return T iff OBJ is known to have any equality assertions stated about it at all. */
  @SubL(source = "cycl/equality-store.lisp", position = 1540) 
  public static final SubLObject some_equality_assertions_somewhereP(SubLObject obj) {
    if ((NIL != forts.fort_p(obj))) {
      if ((NIL == set.set_p($some_equality_assertions_somewhere_set$.getGlobalValue()))) {
        initialize_some_equality_assertions_somewhere_set();
      }
      return set.set_memberP(obj, $some_equality_assertions_somewhere_set$.getGlobalValue());
    }
    return NIL;
  }

  @SubL(source = "cycl/equality-store.lisp", position = 1901) 
  public static final SubLObject clear_some_equality_assertions_somewhere_set() {
    if ((NIL != $some_equality_assertions_somewhere_set$.getGlobalValue())) {
      set.clear_set($some_equality_assertions_somewhere_set$.getGlobalValue());
    }
    return NIL;
  }

  @SubL(source = "cycl/equality-store.lisp", position = 2089) 
  public static final SubLObject initialize_some_equality_assertions_somewhere_set() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != constant_handles.valid_constantP($const0$equals, UNPROVIDED))) {
        {
          SubLObject _prev_bind_0 = utilities_macros.$noting_progress_start_time$.currentBinding(thread);
          try {
            utilities_macros.$noting_progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.noting_progress_preamble($str3$Initializing_some_equality_assert);
            {
              SubLObject estimated_size = Numbers.multiply(TWO_INTEGER, kb_gp_mapping.num_spec_pred_index($const0$equals, UNPROVIDED));
              $some_equality_assertions_somewhere_set$.setGlobalValue(set.new_set(EQL, estimated_size));
              {
                SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                  mt_relevance_macros.$relevant_mt_function$.bind($sym4$RELEVANT_MT_IS_EVERYTHING, thread);
                  mt_relevance_macros.$mt$.bind($const5$EverythingPSC, thread);
                  {
                    SubLObject cdolist_list_var = genl_predicates.all_spec_preds($const0$equals, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_pred = NIL;
                    for (spec_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), spec_pred = cdolist_list_var.first()) {
                      {
                        SubLObject pred_var = spec_pred;
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
                                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw6$GAF, NIL, NIL);
                                      {
                                        SubLObject done_var_2 = NIL;
                                        SubLObject token_var_3 = NIL;
                                        while ((NIL == done_var_2)) {
                                          {
                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                            SubLObject valid_4 = makeBoolean((token_var_3 != ass));
                                            if ((NIL != valid_4)) {
                                              cache_some_equality_assertions_somewhere(ass);
                                            }
                                            done_var_2 = makeBoolean((NIL == valid_4));
                                          }
                                        }
                                      }
                                    } finally {
                                      {
                                        SubLObject _prev_bind_0_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                          if ((NIL != final_index_iterator)) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                          }
                                        } finally {
                                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
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
                } finally {
                  mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                }
              }
            }
            utilities_macros.noting_progress_postamble();
          } finally {
            utilities_macros.$noting_progress_start_time$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/equality-store.lisp", position = 3017) 
  public static final SubLObject cache_some_equality_assertions_somewhere(SubLObject assertion) {
    if (((NIL != assertions_high.gaf_assertionP(assertion))
         && (NIL != assertions_high.assertion_arguments(assertion)))) {
      {
        SubLObject mt = assertions_high.assertion_mt(assertion);
        if ((NIL != hlmt.valid_hlmt_p(mt, UNPROVIDED))) {
          {
            SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            if ((NIL != forts.valid_fortP(arg1))) {
              set.set_add(arg1, $some_equality_assertions_somewhere_set$.getGlobalValue());
            }
            if ((NIL != forts.valid_fortP(arg2))) {
              set.set_add(arg2, $some_equality_assertions_somewhere_set$.getGlobalValue());
            }
          }
        }
      }
    }
    return NIL;
  }

  /** Return T iff OBJ is known to have any true #$rewriteOf assertions stated about it
   where OBJ is the source arg (the one from which the propagation would occur).
   Only works when OBJ is a fort. */
  @SubL(source = "cycl/equality-store.lisp", position = 4514) 
  public static final SubLObject some_source_rewrite_of_assertions_somewhereP(SubLObject obj) {
    if ((NIL != forts.fort_p(obj))) {
      return somewhere_cache.some_pred_assertion_somewhereP($const8$rewriteOf, obj, TWO_INTEGER, UNPROVIDED);
    }
    return NIL;
  }

  public static final SubLObject declare_equality_store_file() {
    declareFunction(myName, "some_equality_assertionsP", "SOME-EQUALITY-ASSERTIONS?", 1, 1, false);
    declareFunction(myName, "some_equality_assertions_somewhereP", "SOME-EQUALITY-ASSERTIONS-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "clear_some_equality_assertions_somewhere_set", "CLEAR-SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET", 0, 0, false);
    declareFunction(myName, "initialize_some_equality_assertions_somewhere_set", "INITIALIZE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET", 0, 0, false);
    declareFunction(myName, "decache_some_equality_assertions_somewhere", "DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 2, 0, false);
    declareFunction(myName, "cache_some_equality_assertions_somewhere", "CACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 1, 0, false);
    declareFunction(myName, "recache_some_equality_assertions_somewhere", "RECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE", 1, 0, false);
    declareFunction(myName, "some_source_rewrite_of_assertionsP", "SOME-SOURCE-REWRITE-OF-ASSERTIONS?", 1, 1, false);
    declareFunction(myName, "some_source_rewrite_of_assertions_somewhereP", "SOME-SOURCE-REWRITE-OF-ASSERTIONS-SOMEWHERE?", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_equality_store_file() {
    $some_equality_assertions_somewhere_set$ = deflexical("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*", maybeDefault( $sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_, $some_equality_assertions_somewhere_set$, NIL));
    return NIL;
  }

  public static final SubLObject setup_equality_store_file() {
    // CVS_ID("Id: equality-store.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_);
    utilities_macros.register_kb_function($sym7$DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLSymbol $kw1$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym2$_SOME_EQUALITY_ASSERTIONS_SOMEWHERE_SET_ = makeSymbol("*SOME-EQUALITY-ASSERTIONS-SOMEWHERE-SET*");
  public static final SubLString $str3$Initializing_some_equality_assert = makeString("Initializing some equality assertions somewhere...");
  public static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const5$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw6$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym7$DECACHE_SOME_EQUALITY_ASSERTIONS_SOMEWHERE = makeSymbol("DECACHE-SOME-EQUALITY-ASSERTIONS-SOMEWHERE");
  public static final SubLObject $const8$rewriteOf = constant_handles.reader_make_constant_shell(makeString("rewriteOf"));

  //// Initializers

  public void declareFunctions() {
    declare_equality_store_file();
  }

  public void initializeVariables() {
    init_equality_store_file();
  }

  public void runTopLevelForms() {
    setup_equality_store_file();
  }

}
