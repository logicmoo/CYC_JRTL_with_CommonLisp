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
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class at_cache extends SubLTranslatedFile {

  //// Constructor

  private at_cache() {}
  public static final SubLFile me = new at_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.at_cache";

  //// Definitions

  /** relation -> argnum -> col -> mts
            |         |      |
           hash     list   alist */
  @SubL(source = "cycl/at-cache.lisp", position = 1404) 
  public static SubLSymbol $arg_type_cache$ = null;

  /** The predicates that are used to build the arg-type cache, in ascending numerical order. */
  @SubL(source = "cycl/at-cache.lisp", position = 1627) 
  private static SubLSymbol $arg_type_cache_preds$ = null;

  @SubL(source = "cycl/at-cache.lisp", position = 1829) 
  public static final SubLObject arg_type_cached_pred_p(SubLObject object) {
    return subl_promotions.memberP(object, $arg_type_cache_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 1927) 
  private static SubLSymbol $arg_type_cache_preds_reversed$ = null;

  @SubL(source = "cycl/at-cache.lisp", position = 2014) 
  private static SubLSymbol $arg_type_cache_initializedP$ = null;

  @SubL(source = "cycl/at-cache.lisp", position = 2069) 
  public static final SubLObject some_args_isa_assertion_somewhereP(SubLObject relation) {
    return somewhere_cache.some_pred_assertion_somewhereP($const4$argsIsa, relation, ONE_INTEGER, UNPROVIDED);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 2816) 
  public static final SubLObject some_arg_and_rest_isa_assertion_somewhereP(SubLObject relation) {
    return somewhere_cache.some_pred_assertion_somewhereP($const5$argAndRestIsa, relation, ONE_INTEGER, UNPROVIDED);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 2955) 
  public static final SubLObject cached_arg_isas_in_mt(SubLObject relation, SubLObject argnum, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
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
            result = cached_arg_isas_in_relevant_mts(relation, argnum);
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

  @SubL(source = "cycl/at-cache.lisp", position = 3281) 
  public static final SubLObject cached_arg_isas_in_relevant_mts(SubLObject relation, SubLObject argnum) {
    {
      SubLObject argnum_table = at_cache_lookup_argnum_table(relation);
      SubLObject collection_table = ConsesLow.nth(number_utilities.f_1_(argnum), argnum_table);
      return at_cache_relevant_collections(collection_table);
    }
  }

  @SubL(source = "cycl/at-cache.lisp", position = 3525) 
  public static final SubLObject at_cache_relevant_collections(SubLObject collection_table) {
    {
      SubLObject cols = NIL;
      if ((NIL == forts.fort_p(collection_table))) {
        {
          SubLObject cdolist_list_var = collection_table;
          SubLObject entry = NIL;
          for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
            if ((NIL == forts.fort_p(entry))) {
              {
                SubLObject datum = entry;
                SubLObject current = datum;
                SubLObject col = NIL;
                SubLObject mts = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
                col = current.first();
                current = current.rest();
                mts = current;
                {
                  SubLObject relevant_col = NIL;
                  if ((NIL == relevant_col)) {
                    {
                      SubLObject csome_list_var = mts;
                      SubLObject mt = NIL;
                      for (mt = csome_list_var.first(); (!(((NIL != relevant_col)
                            || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), mt = csome_list_var.first()) {
                        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                          relevant_col = col;
                        }
                      }
                    }
                  }
                  {
                    SubLObject var = relevant_col;
                    if ((NIL != var)) {
                      cols = cons(var, cols);
                    }
                  }
                }
              }
            } else {
              {
                SubLObject col = entry;
                if ((NIL != mt_relevance_macros.relevant_mtP($const7$UniversalVocabularyMt))) {
                  cols = cons(col, cols);
                }
              }
            }
          }
        }
      } else {
        {
          SubLObject col = collection_table;
          if ((NIL != mt_relevance_macros.relevant_mtP($const7$UniversalVocabularyMt))) {
            cols = cons(col, cols);
          }
        }
      }
      return Sequences.nreverse(cols);
    }
  }

  @SubL(source = "cycl/at-cache.lisp", position = 4384) 
  public static final SubLObject at_cache_lookup_argnum_table(SubLObject relation) {
    return Hashtables.gethash_without_values(relation, $arg_type_cache$.getGlobalValue(), UNPROVIDED);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 4805) 
  public static final SubLObject at_cache_use_possibleP(SubLObject constraint_pred, SubLObject argnum) {
    return makeBoolean(((NIL != $arg_type_cache_initializedP$.getGlobalValue())
           && (NIL != arg_type_cached_argnum_p(argnum))
           && (NIL != arg_type_cached_pred_p(constraint_pred))));
  }

  @SubL(source = "cycl/at-cache.lisp", position = 5088) 
  public static final SubLObject arg_type_cached_argnum_p(SubLObject object) {
    return makeBoolean((object.isInteger()
           && object.numGE(ONE_INTEGER)
           && object.numLE(SIX_INTEGER)));
  }

  @SubL(source = "cycl/at-cache.lisp", position = 5227) 
  public static final SubLObject at_cache_initialize_relation(SubLObject relation) {
    {
      SubLObject max_argnum = max_constrained_argnum(relation);
      SubLObject argnum_table = at_cache_initialize_argnum_table(relation, max_argnum);
      at_cache_set_argnum_table(relation, argnum_table);
      return argnum_table;
    }
  }

  @SubL(source = "cycl/at-cache.lisp", position = 5492) 
  public static final SubLObject at_cache_initialize_argnum_table(SubLObject relation, SubLObject max_argnum) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject argnum_list = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const9$EverythingPSC, thread);
            {
              SubLObject cdolist_list_var = $arg_type_cache_preds$.getGlobalValue();
              SubLObject constraint_pred = NIL;
              for (constraint_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), constraint_pred = cdolist_list_var.first()) {
                {
                  SubLObject argnum = constrained_argnum(constraint_pred);
                  if (argnum.numLE(max_argnum)) {
                    {
                      SubLObject col_alist = at_cache_initialize_collection_table(relation, constraint_pred);
                      argnum_list = cons(col_alist, argnum_list);
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
        argnum_list = Sequences.nreverse(argnum_list);
        return argnum_list;
      }
    }
  }

  @SubL(source = "cycl/at-cache.lisp", position = 5955) 
  public static final SubLObject at_cache_initialize_collection_table(SubLObject relation, SubLObject constraint_pred) {
    {
      SubLObject collection_alist = NIL;
      SubLObject pred_var = constraint_pred;
      if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, NIL, pred_var))) {
        {
          SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, NIL, pred_var);
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
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw26$GAF, $kw27$TRUE, NIL);
                    {
                      SubLObject done_var_35 = NIL;
                      SubLObject token_var_36 = NIL;
                      while ((NIL == done_var_35)) {
                        {
                          SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_36);
                          SubLObject valid_37 = makeBoolean((token_var_36 != ass));
                          if ((NIL != valid_37)) {
                            if ((NIL != kb_accessors.assertion_still_thereP(ass, $kw27$TRUE))) {
                              {
                                SubLObject col = assertions_high.gaf_arg2(ass);
                                SubLObject mt = assertions_high.assertion_mt(ass);
                                if ((NIL != forts.fort_p(col))) {
                                  collection_alist = list_utilities.alist_push(collection_alist, col, mt, Symbols.symbol_function(EQ));
                                }
                              }
                            }
                          }
                          done_var_35 = makeBoolean((NIL == valid_37));
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
      {
        SubLObject cons = NIL;
        for (cons = collection_alist; (!(cons.isAtom())); cons = cons.rest()) {
          {
            SubLObject entry = cons.first();
            SubLObject datum = entry;
            SubLObject current = datum;
            SubLObject col = NIL;
            SubLObject mts = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list6);
            col = current.first();
            current = current.rest();
            mts = current;
            if (((NIL != list_utilities.singletonP(mts))
                 && ($const7$UniversalVocabularyMt == mts.first()))) {
              ConsesLow.rplaca(cons, col);
            }
          }
        }
      }
      if (((NIL != list_utilities.singletonP(collection_alist))
           && (NIL != forts.fort_p(collection_alist.first())))) {
        collection_alist = collection_alist.first();
      }
      return collection_alist;
    }
  }

  @SubL(source = "cycl/at-cache.lisp", position = 7197) 
  public static final SubLObject at_cache_set_argnum_table(SubLObject relation, SubLObject argnum_table) {
    return Hashtables.sethash(relation, $arg_type_cache$.getGlobalValue(), argnum_table);
  }

  /** 0 indicates no arg constraints on RELATION */
  @SubL(source = "cycl/at-cache.lisp", position = 7322) 
  public static final SubLObject max_constrained_argnum(SubLObject relation) {
    {
      SubLObject max_argnum = NIL;
      SubLObject cdolist_list_var = $arg_type_cache_preds_reversed$.getGlobalValue();
      SubLObject constraint_pred = NIL;
      for (constraint_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), constraint_pred = cdolist_list_var.first()) {
        {
          SubLObject pred_var = constraint_pred;
          if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, NIL, pred_var))) {
            {
              SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, NIL, pred_var);
              SubLObject done_var = max_argnum;
              SubLObject token_var = NIL;
              while ((NIL == done_var)) {
                {
                  SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                  SubLObject valid = makeBoolean((token_var != final_index_spec));
                  if ((NIL != valid)) {
                    {
                      SubLObject final_index_iterator = NIL;
                      try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw26$GAF, $kw27$TRUE, NIL);
                        {
                          SubLObject done_var_38 = max_argnum;
                          SubLObject token_var_39 = NIL;
                          while ((NIL == done_var_38)) {
                            {
                              SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_39);
                              SubLObject valid_40 = makeBoolean((token_var_39 != ass));
                              if ((NIL != valid_40)) {
                                max_argnum = constrained_argnum(constraint_pred);
                              }
                              done_var_38 = makeBoolean(((NIL == valid_40)
                                    || (NIL != max_argnum)));
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
                  done_var = makeBoolean(((NIL == valid)
                        || (NIL != max_argnum)));
                }
              }
            }
          }
        }
      }
      return ((NIL != max_argnum) ? ((SubLObject) max_argnum) : ZERO_INTEGER);
    }
  }

  @SubL(source = "cycl/at-cache.lisp", position = 7695) 
  public static final SubLObject constrained_argnum(SubLObject constraint_pred) {
    return kb_accessors.isa_pred_arg(constraint_pred);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 7789) 
  public static final SubLObject cyc_add_to_arg_type_cache(SubLObject argument, SubLObject assertion) {
    return cyc_update_arg_type_cache(assertion);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 7962) 
  public static final SubLObject cyc_remove_from_arg_type_cache(SubLObject argument, SubLObject assertion) {
    return cyc_update_arg_type_cache(assertion);
  }

  @SubL(source = "cycl/at-cache.lisp", position = 8105) 
  public static final SubLObject cyc_update_arg_type_cache(SubLObject gaf) {
    checkType(gaf, $sym30$GAF_ASSERTION_);
    {
      SubLObject arg_isa_pred = assertions_high.gaf_predicate(gaf);
      checkType(arg_isa_pred, $sym31$ARG_TYPE_CACHED_PRED_P);
      {
        SubLObject relation = assertions_high.gaf_arg1(gaf);
        if ((NIL != forts.fort_p(relation))) {
          at_cache_initialize_relation(relation);
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/at-cache.lisp", position = 8421) 
  public static final SubLObject note_at_cache_initialized() {
    $arg_type_cache_initializedP$.setGlobalValue(T);
    return T;
  }

  public static final SubLObject declare_at_cache_file() {
    declareFunction(myName, "arg_type_cached_pred_p", "ARG-TYPE-CACHED-PRED-P", 1, 0, false);
    declareFunction(myName, "some_args_isa_assertion_somewhereP", "SOME-ARGS-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "some_arg_and_rest_isa_assertion_somewhereP", "SOME-ARG-AND-REST-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "cached_arg_isas_in_mt", "CACHED-ARG-ISAS-IN-MT", 2, 1, false);
    declareFunction(myName, "cached_arg_isas_in_relevant_mts", "CACHED-ARG-ISAS-IN-RELEVANT-MTS", 2, 0, false);
    declareFunction(myName, "at_cache_relevant_collections", "AT-CACHE-RELEVANT-COLLECTIONS", 1, 0, false);
    declareFunction(myName, "at_cache_lookup_argnum_table", "AT-CACHE-LOOKUP-ARGNUM-TABLE", 1, 0, false);
    declareFunction(myName, "initialize_at_cache", "INITIALIZE-AT-CACHE", 0, 0, false);
    declareFunction(myName, "at_cache_use_possibleP", "AT-CACHE-USE-POSSIBLE?", 2, 0, false);
    declareFunction(myName, "arg_type_cached_argnum_p", "ARG-TYPE-CACHED-ARGNUM-P", 1, 0, false);
    declareFunction(myName, "at_cache_initialize_relation", "AT-CACHE-INITIALIZE-RELATION", 1, 0, false);
    declareFunction(myName, "at_cache_initialize_argnum_table", "AT-CACHE-INITIALIZE-ARGNUM-TABLE", 2, 0, false);
    declareFunction(myName, "at_cache_initialize_collection_table", "AT-CACHE-INITIALIZE-COLLECTION-TABLE", 2, 0, false);
    declareFunction(myName, "at_cache_set_argnum_table", "AT-CACHE-SET-ARGNUM-TABLE", 2, 0, false);
    declareFunction(myName, "max_constrained_argnum", "MAX-CONSTRAINED-ARGNUM", 1, 0, false);
    declareFunction(myName, "constrained_argnum", "CONSTRAINED-ARGNUM", 1, 0, false);
    declareFunction(myName, "cyc_add_to_arg_type_cache", "CYC-ADD-TO-ARG-TYPE-CACHE", 2, 0, false);
    declareFunction(myName, "cyc_remove_from_arg_type_cache", "CYC-REMOVE-FROM-ARG-TYPE-CACHE", 2, 0, false);
    declareFunction(myName, "cyc_update_arg_type_cache", "CYC-UPDATE-ARG-TYPE-CACHE", 1, 0, false);
    declareFunction(myName, "note_at_cache_initialized", "NOTE-AT-CACHE-INITIALIZED", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_at_cache_file() {
    $arg_type_cache$ = deflexical("*ARG-TYPE-CACHE*", maybeDefault( $sym0$_ARG_TYPE_CACHE_, $arg_type_cache$, ()-> (Hashtables.make_hash_table($int1$1024, UNPROVIDED, UNPROVIDED))));
    $arg_type_cache_preds$ = deflexical("*ARG-TYPE-CACHE-PREDS*", $list2);
    $arg_type_cache_preds_reversed$ = deflexical("*ARG-TYPE-CACHE-PREDS-REVERSED*", Sequences.reverse($arg_type_cache_preds$.getGlobalValue()));
    $arg_type_cache_initializedP$ = deflexical("*ARG-TYPE-CACHE-INITIALIZED?*", maybeDefault( $sym3$_ARG_TYPE_CACHE_INITIALIZED__, $arg_type_cache_initializedP$, NIL));
    return NIL;
  }

  public static final SubLObject setup_at_cache_file() {
    // CVS_ID("Id: at-cache.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_ARG_TYPE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym3$_ARG_TYPE_CACHE_INITIALIZED__);
    utilities_macros.register_kb_function($sym28$CYC_ADD_TO_ARG_TYPE_CACHE);
    utilities_macros.register_kb_function($sym29$CYC_REMOVE_FROM_ARG_TYPE_CACHE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_ARG_TYPE_CACHE_ = makeSymbol("*ARG-TYPE-CACHE*");
  public static final SubLInteger $int1$1024 = makeInteger(1024);
  public static final SubLList $list2 = list(constant_handles.reader_make_constant_shell(makeString("arg1Isa")), constant_handles.reader_make_constant_shell(makeString("arg2Isa")), constant_handles.reader_make_constant_shell(makeString("arg3Isa")), constant_handles.reader_make_constant_shell(makeString("arg4Isa")), constant_handles.reader_make_constant_shell(makeString("arg5Isa")), constant_handles.reader_make_constant_shell(makeString("arg6Isa")));
  public static final SubLSymbol $sym3$_ARG_TYPE_CACHE_INITIALIZED__ = makeSymbol("*ARG-TYPE-CACHE-INITIALIZED?*");
  public static final SubLObject $const4$argsIsa = constant_handles.reader_make_constant_shell(makeString("argsIsa"));
  public static final SubLObject $const5$argAndRestIsa = constant_handles.reader_make_constant_shell(makeString("argAndRestIsa"));
  public static final SubLList $list6 = cons(makeSymbol("COL"), makeSymbol("MTS"));
  public static final SubLObject $const7$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const9$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const10$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLObject $const11$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw12$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw13$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw14$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw16$ERROR = makeKeyword("ERROR");
  public static final SubLString $str17$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym18$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw19$CERROR = makeKeyword("CERROR");
  public static final SubLString $str20$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw21$WARN = makeKeyword("WARN");
  public static final SubLString $str22$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str23$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list24 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str25$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw26$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw27$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym28$CYC_ADD_TO_ARG_TYPE_CACHE = makeSymbol("CYC-ADD-TO-ARG-TYPE-CACHE");
  public static final SubLSymbol $sym29$CYC_REMOVE_FROM_ARG_TYPE_CACHE = makeSymbol("CYC-REMOVE-FROM-ARG-TYPE-CACHE");
  public static final SubLSymbol $sym30$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $sym31$ARG_TYPE_CACHED_PRED_P = makeSymbol("ARG-TYPE-CACHED-PRED-P");

  //// Initializers

  public void declareFunctions() {
    declare_at_cache_file();
  }

  public void initializeVariables() {
    init_at_cache_file();
  }

  public void runTopLevelForms() {
    setup_at_cache_file();
  }

}
