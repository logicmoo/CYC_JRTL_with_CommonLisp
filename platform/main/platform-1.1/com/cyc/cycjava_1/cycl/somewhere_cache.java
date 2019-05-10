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
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class somewhere_cache extends SubLTranslatedFile {

  //// Constructor

  private somewhere_cache() {}
  public static final SubLFile me = new somewhere_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.somewhere_cache";

  //// Definitions

  /** An alist, each entry of the form (PRED . ARGNUM) where PRED is the predicate to be cached
and ARGNUM specifies the argnum in which to find the indexed terms to be cached.
Currently a predicate CANNOT have more than one cached argnum. */
  @SubL(source = "cycl/somewhere-cache.lisp", position = 1578) 
  private static SubLSymbol $somewhere_cached_preds_table$ = null;

  /** Dictionary of PRED -> set where the set is the set of indexed terms that appear in
the ARGNUMth position of some assertion with PRED as its predicate.
ARGNUM is the value specified in the *somewhere-cached-preds-table* for PRED. */
  @SubL(source = "cycl/somewhere-cache.lisp", position = 7573) 
  private static SubLSymbol $some_pred_assertion_somewhere_cache$ = null;

  /** Return T iff there are any true assertions of the form
     (PRED ... TERM ...)
   where TERM appears in the ARGNUMth position of the assertion,
   where ARGNUM is specified in the *somewhere-cached-preds-table*.
   Does not account for specPreds of PRED.
@param INITIALIZE-IF-UNINITIALIZED? booleanp; if the somewhere cache for PRED and ARGNUM
has not been initialized yet, should we initialize it? If NIL, we'll error instead. */
  @SubL(source = "cycl/somewhere-cache.lisp", position = 7880) 
  public static final SubLObject some_pred_assertion_somewhereP(SubLObject pred, SubLObject v_term, SubLObject argnum, SubLObject initialize_if_uninitializedP) {
    if ((initialize_if_uninitializedP == UNPROVIDED)) {
      initialize_if_uninitializedP = T;
    }
    checkType(pred, $sym5$SOMEWHERE_CACHED_PRED_P);
    checkType(v_term, $sym6$VALID_SOMEWHERE_CACHE_ITEM_);
    {
      SubLObject pcase_var = some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP);
      if (pcase_var.eql($kw7$YES)) {
        return T;
      } else if (pcase_var.eql($kw8$NO)) {
        return NIL;
      } else if (pcase_var.eql($kw9$MAYBE)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32142");
        return NIL;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 10934) 
  public static final SubLObject clear_all_somewhere_caches() {
    $some_pred_assertion_somewhere_cache$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function(EQ), Sequences.length($somewhere_cached_preds_table$.getGlobalValue())));
    return ZERO_INTEGER;
  }

  /** For use by get-after-adding and get-after-removing */
  @SubL(source = "cycl/somewhere-cache.lisp", position = 11101) 
  public static SubLSymbol $somewhere_cache_gaf_after_adding_info$ = null;

  /** 'after-adding' and 'after-removing' for preds in *somewhere-cached-preds-table*.
   This is not asserted as an afterAdding and afterRemoving in the KB, it's hard-coded specially
   in get-after-adding and get-after-removing. */
  @SubL(source = "cycl/somewhere-cache.lisp", position = 11287) 
  public static final SubLObject recache_some_pred_assertion_somewhere(SubLObject argument, SubLObject assertion) {
    checkType(assertion, $sym13$GAF_ASSERTION_);
    {
      SubLObject pred = assertions_high.gaf_predicate(assertion);
      SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
      SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
      checkType(pred, $sym5$SOMEWHERE_CACHED_PRED_P);
      if ((NIL != valid_somewhere_cache_itemP(arg))) {
        recache_some_pred_assertion_somewhere_int(pred, arg);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 12052) 
  public static final SubLObject somewhere_cached_pred_p(SubLObject object) {
    return list_utilities.alist_has_keyP($somewhere_cached_preds_table$.getGlobalValue(), object, Symbols.symbol_function(EQ));
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 12170) 
  public static final SubLObject some_pred_assertion_somewhere_argnum(SubLObject pred) {
    return list_utilities.alist_lookup_without_values($somewhere_cached_preds_table$.getGlobalValue(), pred, Symbols.symbol_function(EQ), UNPROVIDED);
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 12997) 
  private static SubLSymbol $inter_arg_result_isa_somewhere_cache$ = null;

  @SubL(source = "cycl/somewhere-cache.lisp", position = 13883) 
  public static final SubLObject some_pred_assertion_somewhereP_internal(SubLObject pred, SubLObject v_term, SubLObject argnum, SubLObject initialize_if_uninitializedP) {
    {
      SubLObject cached_argnum = some_pred_assertion_somewhere_argnum(pred);
      SubLObject ans = $kw9$MAYBE;
      if (argnum.eql(cached_argnum)) {
        {
          SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
          ans = ((NIL != set.set_memberP(v_term, v_set)) ? ((SubLObject) $kw7$YES) : $kw8$NO);
        }
      }
      return ans;
    }
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 14622) 
  public static final SubLObject lookup_somewhere_set_for_pred(SubLObject pred, SubLObject initialize_if_uninitializedP) {
    {
      SubLObject v_set = dictionary.dictionary_lookup_without_values($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, NIL);
      if (((NIL != initialize_if_uninitializedP)
           && (NIL == v_set))) {
        v_set = initialize_somewhere_cache(pred);
      }
      return v_set;
    }
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 15026) 
  public static final SubLObject initialize_somewhere_cache(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject estimated_size = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        SubLObject v_set = set.new_set(Symbols.symbol_function(EQ), estimated_size);
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym18$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const19$EverythingPSC, thread);
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
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$GAF, $kw21$TRUE, NIL);
                            {
                              SubLObject done_var_1 = NIL;
                              SubLObject token_var_2 = NIL;
                              while ((NIL == done_var_1)) {
                                {
                                  SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                  SubLObject valid_3 = makeBoolean((token_var_2 != gaf));
                                  if ((NIL != valid_3)) {
                                    cache_some_pred_assertion_somewhere(v_set, gaf);
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
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        dictionary.dictionary_enter($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, v_set);
        return v_set;
      }
    }
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 15410) 
  public static final SubLObject recache_some_pred_assertion_somewhere_int(SubLObject pred, SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_set = lookup_somewhere_set_for_pred(pred, T);
        set.set_remove(v_term, v_set);
        {
          SubLObject done = NIL;
          SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
              mt_relevance_macros.$relevant_mt_function$.bind($sym18$RELEVANT_MT_IS_EVERYTHING, thread);
              mt_relevance_macros.$mt$.bind($const19$EverythingPSC, thread);
              {
                SubLObject pred_var = pred;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                    SubLObject done_var = done;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                        if ((NIL != valid)) {
                          {
                            SubLObject final_index_iterator = NIL;
                            try {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw20$GAF, $kw21$TRUE, NIL);
                              {
                                SubLObject done_var_5 = done;
                                SubLObject token_var_6 = NIL;
                                while ((NIL == done_var_5)) {
                                  {
                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                    SubLObject valid_7 = makeBoolean((token_var_6 != gaf));
                                    if ((NIL != valid_7)) {
                                      done = cache_some_pred_assertion_somewhere(v_set, gaf);
                                    }
                                    done_var_5 = makeBoolean(((NIL == valid_7)
                                          || (NIL != done)));
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
                              || (NIL != done)));
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
          if ((NIL != done)) {
            return T;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 15889) 
  public static final SubLObject cache_some_pred_assertion_somewhere(SubLObject v_set, SubLObject gaf) {
    if ((NIL != kb_accessors.assertion_still_thereP(gaf, $kw21$TRUE))) {
      {
        SubLObject mt = assertions_high.assertion_mt(gaf);
        if ((NIL != hlmt.hlmt_p(mt))) {
          {
            SubLObject pred = assertions_high.gaf_predicate(gaf);
            SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
            SubLObject arg = assertions_high.gaf_arg(gaf, argnum);
            if ((NIL != valid_somewhere_cache_itemP(arg))) {
              set.set_add(arg, v_set);
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  /** @return BOOLEANP; Is OBJECT something we can reliably stick in the somewhere cache? */
  @SubL(source = "cycl/somewhere-cache.lisp", position = 16500) 
  public static final SubLObject valid_somewhere_cache_itemP(SubLObject object) {
    return cycl_utilities.reified_term_p(object);
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 17147) 
  public static final SubLObject somewhere_cache_unbuiltP() {
    return makeBoolean((!(((NIL != dictionary.dictionary_p($some_pred_assertion_somewhere_cache$.getGlobalValue()))
             && (NIL == dictionary.dictionary_empty_p($some_pred_assertion_somewhere_cache$.getGlobalValue()))))));
  }

  @SubL(source = "cycl/somewhere-cache.lisp", position = 17754) 
  public static final SubLObject load_somewhere_cache_from_stream(SubLObject stream) {
    {
      SubLObject dummy = NIL;
      $some_pred_assertion_somewhere_cache$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      dummy = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  public static final SubLObject declare_somewhere_cache_file() {
    declareFunction(myName, "some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
    declareFunction(myName, "maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
    declareFunction(myName, "possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
    declareFunction(myName, "initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
    declareFunction(myName, "clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false);
    declareFunction(myName, "recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
    declareFunction(myName, "somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false);
    declareFunction(myName, "somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false);
    declareFunction(myName, "some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false);
    declareFunction(myName, "indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false);
    declareFunction(myName, "inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false);
    declareFunction(myName, "inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false);
    declareFunction(myName, "some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false);
    declareFunction(myName, "check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false);
    declareFunction(myName, "lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false);
    declareFunction(myName, "initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false);
    declareFunction(myName, "recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false);
    declareFunction(myName, "cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
    declareFunction(myName, "valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false);
    declareFunction(myName, "some_pred_value_in_any_mt_with_argumentsP", "SOME-PRED-VALUE-IN-ANY-MT-WITH-ARGUMENTS?", 4, 0, false);
    declareFunction(myName, "somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false);
    declareFunction(myName, "rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false);
    declareFunction(myName, "dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false);
    declareFunction(myName, "load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_somewhere_cache_file() {
    $somewhere_cached_preds_table$ = deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", listS($list0, $list1, reader.bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER), $list2));
    $some_pred_assertion_somewhere_cache$ = deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", ((NIL != Symbols.boundp($sym3$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_)) ? ((SubLObject) $some_pred_assertion_somewhere_cache$.getGlobalValue()) : $kw4$UNINITIALIZED));
    $somewhere_cache_gaf_after_adding_info$ = deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list12);
    $inter_arg_result_isa_somewhere_cache$ = deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", ((NIL != Symbols.boundp($sym15$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_)) ? ((SubLObject) $inter_arg_result_isa_somewhere_cache$.getGlobalValue()) : misc_utilities.uninitialized()));
    return NIL;
  }

  public static final SubLObject setup_somewhere_cache_file() {
    // CVS_ID("Id: somewhere-cache.lisp 128471 2009-08-03 20:26:07Z pace ");
    subl_macro_promotions.declare_defglobal($sym3$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym15$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = cons(constant_handles.reader_make_constant_shell(makeString("argsIsa")), ONE_INTEGER);
  public static final SubLList $list1 = cons(constant_handles.reader_make_constant_shell(makeString("argAndRestIsa")), ONE_INTEGER);
  public static final SubLObject $list2 = _constant_2_initializer();
  public static final SubLSymbol $sym3$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_ = makeSymbol("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*");
  public static final SubLSymbol $kw4$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym5$SOMEWHERE_CACHED_PRED_P = makeSymbol("SOMEWHERE-CACHED-PRED-P");
  public static final SubLSymbol $sym6$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");
  public static final SubLSymbol $kw7$YES = makeKeyword("YES");
  public static final SubLSymbol $kw8$NO = makeKeyword("NO");
  public static final SubLSymbol $kw9$MAYBE = makeKeyword("MAYBE");
  public static final SubLList $list10 = cons(makeSymbol("PRED"), makeSymbol("ARGNUM"));
  public static final SubLString $str11$Initializing_all_somewhere_caches = makeString("Initializing all somewhere caches");
  public static final SubLList $list12 = cons(makeSymbol("RECACHE-SOME-PRED-ASSERTION-SOMEWHERE"), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt")));
  public static final SubLSymbol $sym13$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $sym14$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym15$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_ = makeSymbol("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*");
  public static final SubLObject $const16$interArgResultIsa = constant_handles.reader_make_constant_shell(makeString("interArgResultIsa"));
  public static final SubLString $str17$somewhere_cache_argnum_mismatch_f = makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");
  public static final SubLSymbol $sym18$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const19$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw20$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw21$TRUE = makeKeyword("TRUE");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_2_initializer() {
    return list(new SubLObject[] {cons(constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForAllArgs")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("canonicalizerDirectiveForArgAndRest")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("evaluateAtEL")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("evaluateImmediately")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("genlPreds")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("typedGenlPreds")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("genlInverse")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("functionCorrespondingPredicate")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("highlyRelevantTerm")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgResultIsa")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgResultGenl")), THREE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgGenl1-2")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgGenl2-1")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgGenl2-4")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgDifferent")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgReln")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("irrelevantTerm")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("ruleTrivialForJustificationParaphrase")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("mtTrivialForJustificationParaphrase")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("modalInArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("notAssertible")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("rewriteOf")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("scopingArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("skolemizeForward")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("typeLevelVersionInArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExistsCount")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExistsMany")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExistsMin")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExistsUnique")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExistsSame")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("relationAllExistsAndOnly")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("reflexiveOn")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("requiredActorSlots-Unique")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("collRelation")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("collRelationUnique")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("requiredActorSlots")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("rolesForEventType")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("keRequirementPreds")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("roleTypesForEventType")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("requiredArg1Pred")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("preferredSubjectRole")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("subjectRoles")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("preferredIndirectObjectRole")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("indirectObjectRoles")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("preferredDirectObjectRole")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("directObjectRoles")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("posForms")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("posBaseForms")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("mtTimeIndex")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("genStringAssertion-Terse")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("genStringAssertion-Precise")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("genStringAssertion")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("predTrivialForJustificationParaphrase")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("assertionTrivialForJustificationParaphrase")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("ruleTrivialForJustificationParaphrase")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("salientTermImagePathname")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("formulaTemplateHasArgumentPositionInformation")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("except")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("exceptMt")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgNotIsa1-2")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("interArgNotIsa2-1")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentAsserted")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentAssertedForValueInArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerable")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerableForArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerableForValueInArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentDecidable")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("completeExtentDecidableForValueInArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("transitiveViaArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("conservativeViaArg")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("conservativeViaArgInverse")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("functionalInArgs")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("strictlyFunctionalInArgs")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("parsingConflateTo")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("qaConflateTo")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("qaConflateToCompletely")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("terseDisambiguationString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("denotation")), FOUR_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("headMedialString")), FIVE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("compoundString")), FOUR_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("hyphenString")), FOUR_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("multiWordString")), FOUR_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("preferredNameString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("nameString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("placeName-WithRegion")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("placeName-WithRegionAbbreviation")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("titleOfWork")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("movieTitleString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("gospelName-Short")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("brandNameOfProductType")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("businessName-WithTickerSymbol")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("organizationName-Standard")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("organizationName-Official")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("familyName")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("lastName")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("placeName-ShortForm")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("countryName-ShortForm")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("placeName-Standard")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("countryName-LongForm")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("chemicalFormulaString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("fullName")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("alias")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("definiteDescriptions")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("acronymString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("initialismString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("initialsString")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("pseudonym")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("countryCodeTrigraph")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("atomicSymbol")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("codeMapping")), THREE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("applicableWhenTypedOnlyWhenSpecialization")), THREE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("mostNotableIsa")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("mostNotableGenls")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("facetOfCollectionBasedOnBinaryPred")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("facetOfCollectionBasedOnBinaryPredInverse")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("facetOfCollectionBasedOnTypeBinaryPred")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("facetOfCollectionBasedOnTypeBinaryPredInverse")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("teamSeed")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("denotesArgInReln")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("classificationSystemOf-Focally")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("genlMt-Vocabulary")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("marketTypeDefiningProductType")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("collectionDifference")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("characteristicActivityTypeOfPersonType-Frequently")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("medicalFindingTypeOfType")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("medicalDiagnosisTypeOfType")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("suppressFacetInstancesFromTaxonomy")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("quantifiedBinaryPredicateForPredWithMacro")), THREE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("verbSemTransTemplate")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("evaluationTypeDirectEvalueeType")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("allSubCollectionsAreInstancesOf")), ONE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("typeDeterminesValueOfArgInReln")), THREE_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("hypothesisLevelStrategyForPredAndArgs")), TWO_INTEGER), cons(constant_handles.reader_make_constant_shell(makeString("sourceFixedSemanticValueForRelationArg")), THREE_INTEGER)});
  }

  //// Initializers

  public void declareFunctions() {
    declare_somewhere_cache_file();
  }

  public void initializeVariables() {
    init_somewhere_cache_file();
  }

  public void runTopLevelForms() {
    setup_somewhere_cache_file();
  }

}
