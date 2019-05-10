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
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_meta;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.dumper;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.file_utilities;
import com.cyc.cycjava_1.cycl.file_vector;
import com.cyc.cycjava_1.cycl.file_vector_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.formula_pattern_match;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.hl_supports;
import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.map_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.pattern_match;
import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
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
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.tva_utilities;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class tva_cache extends SubLTranslatedFile {

  //// Constructor

  private tva_cache() {}
  public static final SubLFile me = new tva_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.tva_cache";

  //// Definitions

  @SubL(source = "cycl/tva-cache.lisp", position = 1003) 
  public static SubLSymbol $use_tva_cacheP$ = null;

  @SubL(source = "cycl/tva-cache.lisp", position = 2994) 
  public static final SubLObject tva_cache_predicate_index_arg_cached_p(SubLObject predicate, SubLObject index_arg) {
    return list_utilities.sublisp_boolean(tva_cache_for_predicate_and_index_argnum(predicate, index_arg));
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 4127) 
  public static final SubLObject tva_cache_enabled_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.sublisp_boolean($use_tva_cacheP$.getDynamicValue(thread));
    }
  }

  public static final class $tva_cache_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $pred; }
    public SubLObject getField3() { return $index_argnum; }
    public SubLObject getField4() { return $tva_pred_gafs; }
    public SubLObject getField5() { return $tvai_pred_gafs; }
    public SubLObject getField6() { return $map; }
    public SubLObject setField2(SubLObject value) { return $pred = value; }
    public SubLObject setField3(SubLObject value) { return $index_argnum = value; }
    public SubLObject setField4(SubLObject value) { return $tva_pred_gafs = value; }
    public SubLObject setField5(SubLObject value) { return $tvai_pred_gafs = value; }
    public SubLObject setField6(SubLObject value) { return $map = value; }
    public SubLObject $pred = NIL;
    public SubLObject $index_argnum = NIL;
    public SubLObject $tva_pred_gafs = NIL;
    public SubLObject $tvai_pred_gafs = NIL;
    public SubLObject $map = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tva_cache_native.class, $sym20$TVA_CACHE, $sym21$TVA_CACHE_P, $list22, $list23, new String[] {"$pred", "$index_argnum", "$tva_pred_gafs", "$tvai_pred_gafs", "$map"}, $list24, $list25, $sym26$PPRINT_TVA_CACHE);
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 4782) 
  public static SubLSymbol $dtp_tva_cache$ = null;

  @SubL(source = "cycl/tva-cache.lisp", position = 4782) 
  public static final SubLObject tva_cache_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3819");
    return NIL;
  }

  public static final class $tva_cache_p$UnaryFunction extends UnaryFunction {
    public $tva_cache_p$UnaryFunction() { super(extractFunctionNamed("TVA-CACHE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3866"); }
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 4782) 
  public static final SubLObject tva_cache_index_argnum(SubLObject object) {
    checkType(object, $sym21$TVA_CACHE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 5050) 
  public static final SubLObject sxhash_tva_cache_method(SubLObject object) {
    return Sxhash.sxhash(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3867"));
  }

  /** DICTIONARY-P mapping binary predicates to their TVA-CACHE-P objects. */
  @SubL(source = "cycl/tva-cache.lisp", position = 6834) 
  private static SubLSymbol $tva_cache_registry$ = null;

  @SubL(source = "cycl/tva-cache.lisp", position = 7081) 
  public static final SubLObject tva_cache_registry() {
    return $tva_cache_registry$.getGlobalValue();
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 7322) 
  public static final SubLObject tva_caches_for_predicate(SubLObject predicate) {
    return dictionary.dictionary_lookup_without_values(tva_cache_registry(), predicate, NIL);
  }

  /** @return LISTP of TVA caches that represent facts implied by PREDICATE. */
  @SubL(source = "cycl/tva-cache.lisp", position = 7454) 
  public static final SubLObject tva_caches_implied_by_predicate(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject caches = NIL;
        SubLObject inverse_caches = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($const13$InferencePSC, thread);
            {
              SubLObject module = sbhl_module_vars.get_sbhl_module($const48$genlPreds);
              SubLObject node_var = predicate;
              SubLObject deck_type = (($kw49$BREADTH == $kw50$DEPTH) ? ((SubLObject) $kw51$STACK) : $kw52$QUEUE);
              SubLObject recur_deck = deck.create_deck(deck_type);
              SubLObject node_and_predicate_mode = NIL;
              {
                SubLObject _prev_bind_0_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  {
                    SubLObject tv_var = $const53$True_JustificationTruth;
                    {
                      SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym54$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw55$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str56$_A_is_not_a__A, tv_var, $sym57$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw58$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2231");
                                } else if (pcase_var.eql($kw60$WARN)) {
                                  Errors.warn($str56$_A_is_not_a__A, tv_var, $sym57$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str61$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str59$continue_anyway, $str56$_A_is_not_a__A, tv_var, $sym57$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                          SubLObject _prev_bind_1_12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                              {
                                SubLObject _prev_bind_0_13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                  sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                  sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                  node_and_predicate_mode = list(predicate, sbhl_search_vars.genl_inverse_mode_p());
                                  while ((NIL != node_and_predicate_mode)) {
                                    {
                                      SubLObject node_var_16 = node_and_predicate_mode.first();
                                      SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                      SubLObject genl_pred = node_var_16;
                                      {
                                        SubLObject _prev_bind_0_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                          {
                                            SubLObject inverseP = predicate_mode;
                                            SubLObject cdolist_list_var = tva_caches_for_predicate(genl_pred);
                                            SubLObject v_cache = NIL;
                                            for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
                                              if ((NIL != inverseP)) {
                                                inverse_caches = cons(v_cache, inverse_caches);
                                              } else {
                                                caches = cons(v_cache, caches);
                                              }
                                            }
                                          }
                                          {
                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                            SubLObject cdolist_list_var = accessible_modules;
                                            SubLObject module_var = NIL;
                                            for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                              {
                                                SubLObject _prev_bind_0_18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                SubLObject _prev_bind_1_19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                  sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                  sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                  {
                                                    SubLObject node = function_terms.naut_to_nart(node_var_16);
                                                    if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                      {
                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if ((NIL != d_link)) {
                                                          {
                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if ((NIL != mt_links)) {
                                                              {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                                  thread.resetMultipleValues();
                                                                  {
                                                                    SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                      {
                                                                        SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                          sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                          {
                                                                            SubLObject iteration_state_21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_21))) {
                                                                              thread.resetMultipleValues();
                                                                              {
                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_21);
                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                  {
                                                                                    SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                      sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                      {
                                                                                        SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9332")) : link_nodes);
                                                                                        SubLObject cdolist_list_var_23 = new_list;
                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                        for (node_vars_link_node = cdolist_list_var_23.first(); (NIL != cdolist_list_var_23); cdolist_list_var_23 = cdolist_list_var_23.rest(), node_vars_link_node = cdolist_list_var_23.first()) {
                                                                                          if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } finally {
                                                                                      sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_22, thread);
                                                                                    }
                                                                                  }
                                                                                }
                                                                                iteration_state_21 = dictionary_contents.do_dictionary_contents_next(iteration_state_21);
                                                                              }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_21);
                                                                          }
                                                                        } finally {
                                                                          sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_20, thread);
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
                                                          sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str62$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                      }
                                                    } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                      {
                                                        SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9333")) : Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2715"));
                                                        SubLObject cdolist_list_var_24 = new_list;
                                                        SubLObject generating_fn = NIL;
                                                        for (generating_fn = cdolist_list_var_24.first(); (NIL != cdolist_list_var_24); cdolist_list_var_24 = cdolist_list_var_24.rest(), generating_fn = cdolist_list_var_24.first()) {
                                                          {
                                                            SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                              sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                              {
                                                                SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                SubLObject new_list_26 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9334")) : link_nodes);
                                                                SubLObject cdolist_list_var_27 = new_list_26;
                                                                SubLObject node_vars_link_node = NIL;
                                                                for (node_vars_link_node = cdolist_list_var_27.first(); (NIL != cdolist_list_var_27); cdolist_list_var_27 = cdolist_list_var_27.rest(), node_vars_link_node = cdolist_list_var_27.first()) {
                                                                  if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                  }
                                                                }
                                                              }
                                                            } finally {
                                                              sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_25, thread);
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_19, thread);
                                                  sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_18, thread);
                                                }
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_17, thread);
                                        }
                                      }
                                    }
                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                  }
                                } finally {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_15, thread);
                                  sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_14, thread);
                                  sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_13, thread);
                                }
                              }
                            } else {
                              sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str63$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                          } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_12, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_11, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_10, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_9, thread);
                      }
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                  }
                } finally {
                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_8, thread);
                }
              }
            }
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(caches, inverse_caches);
      }
    }
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 9420) 
  public static final SubLObject tva_cache_for_predicate_and_index_argnum(SubLObject predicate, SubLObject index_argnum) {
    {
      SubLObject caches = tva_caches_for_predicate(predicate);
      SubLObject v_cache = Sequences.find(index_argnum, caches, Symbols.symbol_function(EQL), $sym30$TVA_CACHE_INDEX_ARGNUM, UNPROVIDED, UNPROVIDED);
      return v_cache;
    }
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 16560) 
  private static SubLSymbol $tva_cache_assume_supports_are_validP$ = null;

  /** We've just added a new key->value support to the KB. */
  @SubL(source = "cycl/tva-cache.lisp", position = 19232) 
  public static final SubLObject add_tva_cache_value(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), UNPROVIDED);
        SubLObject current = datum;
        SubLObject bin_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
        bin_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
        arg2 = current.first();
        current = current.rest();
        if ((NIL == current)) {
          thread.resetMultipleValues();
          {
            SubLObject caches = tva_caches_implied_by_predicate(bin_pred);
            SubLObject inverse_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
              {
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject cdolist_list_var = caches;
                    SubLObject v_cache = NIL;
                    for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
                      {
                        SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                        if (pcase_var.eql(ONE_INTEGER)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3889");
                        } else if (pcase_var.eql(TWO_INTEGER)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3890");
                        }
                      }
                    }
                  }
                  {
                    SubLObject cdolist_list_var = inverse_caches;
                    SubLObject v_cache = NIL;
                    for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
                      {
                        SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                        if (pcase_var.eql(TWO_INTEGER)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3891");
                        } else if (pcase_var.eql(ONE_INTEGER)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3892");
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
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list87);
        }
      }
      return NIL;
    }
  }

  /** We're about to remove a key->value support from the KB. */
  @SubL(source = "cycl/tva-cache.lisp", position = 20018) 
  public static final SubLObject remove_tva_cache_value(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), UNPROVIDED);
        SubLObject current = datum;
        SubLObject bin_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
        bin_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list87);
        arg2 = current.first();
        current = current.rest();
        if ((NIL == current)) {
          thread.resetMultipleValues();
          {
            SubLObject caches = tva_caches_implied_by_predicate(bin_pred);
            SubLObject inverse_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            {
              SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
              {
                SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject cdolist_list_var = caches;
                    SubLObject v_cache = NIL;
                    for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
                      {
                        SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                        if (pcase_var.eql(ONE_INTEGER)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3872");
                        } else if (pcase_var.eql(TWO_INTEGER)) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3873");
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
            {
              SubLObject cdolist_list_var = inverse_caches;
              SubLObject v_cache = NIL;
              for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
                {
                  SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                  if (pcase_var.eql(TWO_INTEGER)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3874");
                  } else if (pcase_var.eql(ONE_INTEGER)) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3875");
                  }
                }
              }
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list87);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 27790) 
  private static SubLSymbol $tva_cache_max_instances_to_cache_caching_state$ = null;

  @SubL(source = "cycl/tva-cache.lisp", position = 44996) 
  private static SubLSymbol $cfasl_opcode_tva_cache$ = null;

  @SubL(source = "cycl/tva-cache.lisp", position = 45088) 
  public static final SubLObject cfasl_output_object_tva_cache_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3785");
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 46108) 
  public static final SubLObject tva_cache_unbuiltP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym12$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($const13$InferencePSC, thread);
            result = makeBoolean(((NIL == map_utilities.map_p($tva_cache_registry$.getGlobalValue()))
                  || ((NIL != map_utilities.map_empty_p($tva_cache_registry$.getGlobalValue()))
                     && kb_indexing.num_predicate_extent_index($const11$cacheTransitiveClosureForArgs, UNPROVIDED).numG(ZERO_INTEGER))));
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 46968) 
  public static final SubLObject get_tva_cache_contents_data_file(SubLObject directory_path) {
    if ((directory_path == UNPROVIDED)) {
      directory_path = NIL;
    }
    return dumper.kb_dump_file($str130$tva_cache_contents, directory_path, UNPROVIDED);
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 47108) 
  public static final SubLObject get_tva_cache_contents_index_file(SubLObject directory_path) {
    if ((directory_path == UNPROVIDED)) {
      directory_path = NIL;
    }
    return dumper.kb_dump_file($str131$tva_cache_contents_index, directory_path, UNPROVIDED);
  }

  /** Helper method for system KB initializations code. */
  @SubL(source = "cycl/tva-cache.lisp", position = 47254) 
  public static final SubLObject reconnect_tva_cache_registry(SubLObject directory, SubLObject common_symbols) {
    {
      SubLObject data_file = get_tva_cache_contents_data_file(directory);
      SubLObject index_file = get_tva_cache_contents_index_file(directory);
      return reconnect_tva_cache_registry_to_file_vector_files(data_file, index_file, common_symbols);
    }
  }

  /** Walks the TVA cache registry and reconnects all of the TVA caches registered. */
  @SubL(source = "cycl/tva-cache.lisp", position = 47629) 
  public static final SubLObject reconnect_tva_cache_registry_to_file_vector_files(SubLObject data_file, SubLObject index_file, SubLObject common_symbols) {
    if ((common_symbols == UNPROVIDED)) {
      common_symbols = cfasl.cfasl_current_common_symbols();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject valid_files = makeBoolean(((NIL != file_utilities.file_existsP(data_file))
             && (NIL != file_utilities.file_existsP(index_file))));
        if ((NIL != valid_files)) {
          {
            SubLObject fvector = file_vector.new_file_vector(data_file, index_file, UNPROVIDED);
            SubLObject iterator = map_utilities.new_map_iterator($tva_cache_registry$.getGlobalValue());
            SubLObject done_var = NIL;
            while ((NIL == done_var)) {
              thread.resetMultipleValues();
              {
                SubLObject var = iteration.iteration_next(iterator);
                SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != valid)) {
                  {
                    SubLObject datum = var;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject tva_caches = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list132);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list132);
                    tva_caches = current.first();
                    current = current.rest();
                    if ((NIL == current)) {
                      {
                        SubLObject cdolist_list_var = tva_caches;
                        SubLObject v_tva_cache = NIL;
                        for (v_tva_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_tva_cache = cdolist_list_var.first()) {
                          Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3823");
                        }
                      }
                    } else {
                      cdestructuring_bind.cdestructuring_bind_error(datum, $list132);
                    }
                  }
                }
                done_var = makeBoolean((NIL == valid));
              }
            }
          }
        } else {
          Errors.warn($str133$Reconnecting_to_legacy_unit_files, data_file, index_file);
        }
        return valid_files;
      }
    }
  }

  @SubL(source = "cycl/tva-cache.lisp", position = 49458) 
  public static final SubLObject load_tva_cache_from_stream(SubLObject stream) {
    $tva_cache_registry$.setGlobalValue(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  public static final SubLObject declare_tva_cache_file() {
    //declareMacro(myName, "do_tva_caches", "DO-TVA-CACHES");
    //declareMacro(myName, "do_tva_cache", "DO-TVA-CACHE");
    //declareFunction(myName, "tva_cache_get_values", "TVA-CACHE-GET-VALUES", 4, 0, false);
    //declareFunction(myName, "tva_cache_check_value", "TVA-CACHE-CHECK-VALUE", 4, 2, false);
    declareFunction(myName, "tva_cache_predicate_index_arg_cached_p", "TVA-CACHE-PREDICATE-INDEX-ARG-CACHED-P", 2, 0, false);
    //declareFunction(myName, "initialize_tva_caches", "INITIALIZE-TVA-CACHES", 0, 0, false);
    //declareFunction(myName, "initialize_uninitialized_tva_caches", "INITIALIZE-UNINITIALIZED-TVA-CACHES", 0, 0, false);
    //declareFunction(myName, "initialize_tva_caches_int", "INITIALIZE-TVA-CACHES-INT", 1, 0, false);
    declareFunction(myName, "tva_cache_enabled_p", "TVA-CACHE-ENABLED-P", 0, 0, false);
    //declareFunction(myName, "cached_tva_value_count", "CACHED-TVA-VALUE-COUNT", 0, 0, false);
    declareFunction(myName, "tva_cache_print_function_trampoline", "TVA-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "tva_cache_p", "TVA-CACHE-P", 1, 0, false); new $tva_cache_p$UnaryFunction();
    //declareFunction(myName, "tva_cache_pred", "TVA-CACHE-PRED", 1, 0, false);
    declareFunction(myName, "tva_cache_index_argnum", "TVA-CACHE-INDEX-ARGNUM", 1, 0, false);
    //declareFunction(myName, "tva_cache_tva_pred_gafs", "TVA-CACHE-TVA-PRED-GAFS", 1, 0, false);
    //declareFunction(myName, "tva_cache_tvai_pred_gafs", "TVA-CACHE-TVAI-PRED-GAFS", 1, 0, false);
    //declareFunction(myName, "tva_cache_map", "TVA-CACHE-MAP", 1, 0, false);
    //declareFunction(myName, "_csetf_tva_cache_pred", "_CSETF-TVA-CACHE-PRED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_cache_index_argnum", "_CSETF-TVA-CACHE-INDEX-ARGNUM", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_cache_tva_pred_gafs", "_CSETF-TVA-CACHE-TVA-PRED-GAFS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_cache_tvai_pred_gafs", "_CSETF-TVA-CACHE-TVAI-PRED-GAFS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_cache_map", "_CSETF-TVA-CACHE-MAP", 2, 0, false);
    //declareFunction(myName, "make_tva_cache", "MAKE-TVA-CACHE", 0, 1, false);
    declareFunction(myName, "sxhash_tva_cache_method", "SXHASH-TVA-CACHE-METHOD", 1, 0, false);
    //declareFunction(myName, "pprint_tva_cache", "PPRINT-TVA-CACHE", 1, 2, false);
    //declareFunction(myName, "clone_swappable_tva_cache", "CLONE-SWAPPABLE-TVA-CACHE", 2, 0, false);
    //declareFunction(myName, "reconnect_swappable_tva_cache", "RECONNECT-SWAPPABLE-TVA-CACHE", 2, 1, false);
    declareFunction(myName, "tva_cache_registry", "TVA-CACHE-REGISTRY", 0, 0, false);
    //declareFunction(myName, "register_tva_cache", "REGISTER-TVA-CACHE", 1, 0, false);
    declareFunction(myName, "tva_caches_for_predicate", "TVA-CACHES-FOR-PREDICATE", 1, 0, false);
    declareFunction(myName, "tva_caches_implied_by_predicate", "TVA-CACHES-IMPLIED-BY-PREDICATE", 1, 0, false);
    //declareFunction(myName, "tva_caches_with_transitive_predicate", "TVA-CACHES-WITH-TRANSITIVE-PREDICATE", 1, 0, false);
    declareFunction(myName, "tva_cache_for_predicate_and_index_argnum", "TVA-CACHE-FOR-PREDICATE-AND-INDEX-ARGNUM", 2, 0, false);
    //declareFunction(myName, "ensure_tva_cache_created", "ENSURE-TVA-CACHE-CREATED", 2, 0, false);
    //declareFunction(myName, "deregister_tva_cache", "DEREGISTER-TVA-CACHE", 1, 1, false);
    //declareFunction(myName, "deregister_all_tva_caches_for_predicate", "DEREGISTER-ALL-TVA-CACHES-FOR-PREDICATE", 1, 0, false);
    //declareMacro(myName, "do_tva_sub_caches", "DO-TVA-SUB-CACHES");
    //declareFunction(myName, "find_tva_sub_cache", "FIND-TVA-SUB-CACHE", 3, 0, false);
    //declareFunction(myName, "tva_cache_lookup", "TVA-CACHE-LOOKUP", 2, 3, false);
    //declareFunction(myName, "tva_cache_lookup_recursive", "TVA-CACHE-LOOKUP-RECURSIVE", 6, 0, false);
    //declareFunction(myName, "cleanup_tva_cache_supports_genl_preds_chains", "CLEANUP-TVA-CACHE-SUPPORTS-GENL-PREDS-CHAINS", 1, 0, false);
    //declareFunction(myName, "tva_cache_entry_for_key", "TVA-CACHE-ENTRY-FOR-KEY", 2, 0, false);
    //declareFunction(myName, "tva_cache_lookup_internal", "TVA-CACHE-LOOKUP-INTERNAL", 6, 0, false);
    //declareFunction(myName, "tva_cache_has_keyP", "TVA-CACHE-HAS-KEY?", 2, 0, false);
    //declareFunction(myName, "tva_cache_valid_supportP_internal", "TVA-CACHE-VALID-SUPPORT?-INTERNAL", 1, 0, false);
    //declareFunction(myName, "tva_cache_valid_supportP", "TVA-CACHE-VALID-SUPPORT?", 1, 0, false);
    //declareFunction(myName, "tva_cache_support_gaf", "TVA-CACHE-SUPPORT-GAF", 1, 0, false);
    //declareFunction(myName, "tva_cache_support_equalP", "TVA-CACHE-SUPPORT-EQUAL?", 2, 0, false);
    //declareFunction(myName, "unpack_and_validate_tva_cache_support", "UNPACK-AND-VALIDATE-TVA-CACHE-SUPPORT", 2, 1, false);
    //declareFunction(myName, "unpack_and_validate_tva_cache_complex_support", "UNPACK-AND-VALIDATE-TVA-CACHE-COMPLEX-SUPPORT", 2, 1, false);
    declareFunction(myName, "add_tva_cache_value", "ADD-TVA-CACHE-VALUE", 2, 0, false);
    declareFunction(myName, "remove_tva_cache_value", "REMOVE-TVA-CACHE-VALUE", 2, 0, false);
    //declareFunction(myName, "add_tva_cache_key", "ADD-TVA-CACHE-KEY", 2, 0, false);
    //declareFunction(myName, "remove_tva_cache_key", "REMOVE-TVA-CACHE-KEY", 2, 0, false);
    //declareFunction(myName, "tva_cache_add_transitive_via_arg", "TVA-CACHE-ADD-TRANSITIVE-VIA-ARG", 1, 0, false);
    //declareFunction(myName, "tva_cache_add_transitive_via_arg_inverse", "TVA-CACHE-ADD-TRANSITIVE-VIA-ARG-INVERSE", 1, 0, false);
    //declareFunction(myName, "tva_cache_remove_transitive_via_arg", "TVA-CACHE-REMOVE-TRANSITIVE-VIA-ARG", 1, 0, false);
    //declareFunction(myName, "tva_cache_remove_transitive_via_arg_inverse", "TVA-CACHE-REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 1, 0, false);
    //declareFunction(myName, "tva_cache_add_trans_gaf", "TVA-CACHE-ADD-TRANS-GAF", 4, 0, false);
    //declareFunction(myName, "create_tva_cache", "CREATE-TVA-CACHE", 2, 1, false);
    //declareFunction(myName, "initialize_tva_cache", "INITIALIZE-TVA-CACHE", 1, 0, false);
    //declareFunction(myName, "tva_cache_asserted_values", "TVA-CACHE-ASSERTED-VALUES", 1, 0, false);
    //declareFunction(myName, "tva_cache_relation_all_instance_values", "TVA-CACHE-RELATION-ALL-INSTANCE-VALUES", 1, 0, false);
    //declareFunction(myName, "clear_tva_cache_max_instances_to_cache", "CLEAR-TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
    //declareFunction(myName, "remove_tva_cache_max_instances_to_cache", "REMOVE-TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
    //declareFunction(myName, "tva_cache_max_instances_to_cache_internal", "TVA-CACHE-MAX-INSTANCES-TO-CACHE-INTERNAL", 0, 0, false);
    //declareFunction(myName, "tva_cache_max_instances_to_cache", "TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
    //declareFunction(myName, "tva_cache_add_one_relation_all_instance_gaf", "TVA-CACHE-ADD-ONE-RELATION-ALL-INSTANCE-GAF", 2, 0, false);
    //declareFunction(myName, "tva_cache_add_relation_instance_all_gaf", "TVA-CACHE-ADD-RELATION-INSTANCE-ALL-GAF", 1, 0, false);
    //declareFunction(myName, "tva_cache_add_relation_all_instance_gaf", "TVA-CACHE-ADD-RELATION-ALL-INSTANCE-GAF", 1, 0, false);
    //declareFunction(myName, "tva_cache_remove_relation_all_instance_gaf", "TVA-CACHE-REMOVE-RELATION-ALL-INSTANCE-GAF", 1, 0, false);
    //declareFunction(myName, "tva_cache_remove_one_relation_all_instance_gaf", "TVA-CACHE-REMOVE-ONE-RELATION-ALL-INSTANCE-GAF", 2, 0, false);
    //declareFunction(myName, "tva_cache_remove_relation_instance_all_gaf", "TVA-CACHE-REMOVE-RELATION-INSTANCE-ALL-GAF", 1, 0, false);
    //declareFunction(myName, "tva_cache_remove_one_relation_instance_all_gaf", "TVA-CACHE-REMOVE-ONE-RELATION-INSTANCE-ALL-GAF", 2, 0, false);
    //declareFunction(myName, "tva_cache_relation_instance_all_values", "TVA-CACHE-RELATION-INSTANCE-ALL-VALUES", 1, 0, false);
    //declareFunction(myName, "tva_cache_add_one_relation_instance_all_gaf", "TVA-CACHE-ADD-ONE-RELATION-INSTANCE-ALL-GAF", 2, 0, false);
    //declareFunction(myName, "tva_cache_silent_progressP", "TVA-CACHE-SILENT-PROGRESS?", 3, 0, false);
    //declareFunction(myName, "tva_cache_store_one_gaf", "TVA-CACHE-STORE-ONE-GAF", 5, 0, false);
    //declareFunction(myName, "tva_cache_store_one_value", "TVA-CACHE-STORE-ONE-VALUE", 2, 0, false);
    //declareFunction(myName, "make_tva_cache_complex_support", "MAKE-TVA-CACHE-COMPLEX-SUPPORT", 1, 0, false);
    //declareFunction(myName, "tva_cache_support_component_supports", "TVA-CACHE-SUPPORT-COMPONENT-SUPPORTS", 1, 0, false);
    //declareFunction(myName, "tva_cache_support_complex_p", "TVA-CACHE-SUPPORT-COMPLEX-P", 1, 0, false);
    //declareFunction(myName, "tva_cache_complex_support_equalP", "TVA-CACHE-COMPLEX-SUPPORT-EQUAL?", 2, 0, false);
    //declareFunction(myName, "make_tva_cache_support", "MAKE-TVA-CACHE-SUPPORT", 4, 0, false);
    //declareFunction(myName, "tva_cache_ensure_cache_has_key", "TVA-CACHE-ENSURE-CACHE-HAS-KEY", 2, 0, false);
    //declareFunction(myName, "tva_cache_add_key", "TVA-CACHE-ADD-KEY", 2, 0, false);
    //declareFunction(myName, "tva_cache_note_implicit_keys_from_trans_gaf", "TVA-CACHE-NOTE-IMPLICIT-KEYS-FROM-TRANS-GAF", 3, 2, false);
    //declareFunction(myName, "tva_cache_get_implicit_terms", "TVA-CACHE-GET-IMPLICIT-TERMS", 4, 0, false);
    //declareFunction(myName, "tva_cache_get_implicit_terms_internal", "TVA-CACHE-GET-IMPLICIT-TERMS-INTERNAL", 5, 1, false);
    //declareFunction(myName, "make_tva_cache_hl_support", "MAKE-TVA-CACHE-HL-SUPPORT", 1, 2, false);
    //declareFunction(myName, "tva_cache_tva_pred_from_support", "TVA-CACHE-TVA-PRED-FROM-SUPPORT", 1, 0, false);
    //declareFunction(myName, "tva_cache_transitivity_support", "TVA-CACHE-TRANSITIVITY-SUPPORT", 2, 1, false);
    //declareFunction(myName, "new_tva_cache_entry", "NEW-TVA-CACHE-ENTRY", 0, 0, false);
    //declareFunction(myName, "tva_cache_note_key_value_supports", "TVA-CACHE-NOTE-KEY-VALUE-SUPPORTS", 4, 0, false);
    //declareFunction(myName, "tva_cache_implied_values", "TVA-CACHE-IMPLIED-VALUES", 2, 0, false);
    //declareFunction(myName, "tva_cache_transitive_binary_predicate_support", "TVA-CACHE-TRANSITIVE-BINARY-PREDICATE-SUPPORT", 1, 0, false);
    //declareFunction(myName, "tva_cache_note_implicit_key_supports", "TVA-CACHE-NOTE-IMPLICIT-KEY-SUPPORTS", 4, 0, false);
    //declareFunction(myName, "tva_cache_remove_key_value_support", "TVA-CACHE-REMOVE-KEY-VALUE-SUPPORT", 4, 0, false);
    //declareFunction(myName, "tva_cache_remove_implicit_key_support", "TVA-CACHE-REMOVE-IMPLICIT-KEY-SUPPORT", 4, 0, false);
    //declareFunction(myName, "invert_binary_argnum", "INVERT-BINARY-ARGNUM", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_tva_cache_method", "CFASL-OUTPUT-OBJECT-TVA-CACHE-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_tva_cache", "CFASL-OUTPUT-TVA-CACHE", 2, 0, false);
    //declareFunction(myName, "cfasl_input_tva_cache", "CFASL-INPUT-TVA-CACHE", 1, 0, false);
    declareFunction(myName, "tva_cache_unbuiltP", "TVA-CACHE-UNBUILT?", 0, 0, false);
    //declareFunction(myName, "rebuild_tva_cache", "REBUILD-TVA-CACHE", 0, 0, false);
    declareFunction(myName, "get_tva_cache_contents_data_file", "GET-TVA-CACHE-CONTENTS-DATA-FILE", 0, 1, false);
    declareFunction(myName, "get_tva_cache_contents_index_file", "GET-TVA-CACHE-CONTENTS-INDEX-FILE", 0, 1, false);
    declareFunction(myName, "reconnect_tva_cache_registry", "RECONNECT-TVA-CACHE-REGISTRY", 2, 0, false);
    declareFunction(myName, "reconnect_tva_cache_registry_to_file_vector_files", "RECONNECT-TVA-CACHE-REGISTRY-TO-FILE-VECTOR-FILES", 2, 1, false);
    //declareFunction(myName, "dump_swappable_tva_cache_to_stream", "DUMP-SWAPPABLE-TVA-CACHE-TO-STREAM", 2, 0, false);
    //declareFunction(myName, "dump_tva_cache_to_stream", "DUMP-TVA-CACHE-TO-STREAM", 1, 0, false);
    declareFunction(myName, "load_tva_cache_from_stream", "LOAD-TVA-CACHE-FROM-STREAM", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_tva_cache_file() {
    $use_tva_cacheP$ = defparameter("*USE-TVA-CACHE?*", T);
    $dtp_tva_cache$ = defconstant("*DTP-TVA-CACHE*", $sym20$TVA_CACHE);
    $tva_cache_registry$ = deflexical("*TVA-CACHE-REGISTRY*", ((NIL != Symbols.boundp($sym47$_TVA_CACHE_REGISTRY_)) ? ((SubLObject) $tva_cache_registry$.getGlobalValue()) : dictionary.new_dictionary(Symbols.symbol_function(EQL), UNPROVIDED)));
    $tva_cache_assume_supports_are_validP$ = defparameter("*TVA-CACHE-ASSUME-SUPPORTS-ARE-VALID?*", NIL);
    $tva_cache_max_instances_to_cache_caching_state$ = deflexical("*TVA-CACHE-MAX-INSTANCES-TO-CACHE-CACHING-STATE*", NIL);
    $cfasl_opcode_tva_cache$ = defconstant("*CFASL-OPCODE-TVA-CACHE*", $int127$96);
    return NIL;
  }

  public static final SubLObject setup_tva_cache_file() {
    // CVS_ID("Id: tva-cache.lisp 126841 2009-01-17 16:49:52Z baxter ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function($sym27$TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym28$TVA_CACHE_PRED, $sym29$_CSETF_TVA_CACHE_PRED);
    Structures.def_csetf($sym30$TVA_CACHE_INDEX_ARGNUM, $sym31$_CSETF_TVA_CACHE_INDEX_ARGNUM);
    Structures.def_csetf($sym32$TVA_CACHE_TVA_PRED_GAFS, $sym33$_CSETF_TVA_CACHE_TVA_PRED_GAFS);
    Structures.def_csetf($sym34$TVA_CACHE_TVAI_PRED_GAFS, $sym35$_CSETF_TVA_CACHE_TVAI_PRED_GAFS);
    Structures.def_csetf($sym8$TVA_CACHE_MAP, $sym36$_CSETF_TVA_CACHE_MAP);
    Equality.identity($sym20$TVA_CACHE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function($sym43$SXHASH_TVA_CACHE_METHOD));
    subl_macro_promotions.declare_defglobal($sym47$_TVA_CACHE_REGISTRY_);
    memoization_state.note_memoized_function($sym81$TVA_CACHE_VALID_SUPPORT_);
    utilities_macros.register_kb_function($sym88$ADD_TVA_CACHE_VALUE);
    utilities_macros.register_kb_function($sym89$REMOVE_TVA_CACHE_VALUE);
    utilities_macros.register_kb_function($sym92$ADD_TVA_CACHE_KEY);
    utilities_macros.register_kb_function($sym93$REMOVE_TVA_CACHE_KEY);
    memoization_state.note_globally_cached_function($sym105$TVA_CACHE_MAX_INSTANCES_TO_CACHE);
    cfasl.register_cfasl_input_function($cfasl_opcode_tva_cache$.getGlobalValue(), $sym128$CFASL_INPUT_TVA_CACHE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), Symbols.symbol_function($sym129$CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD));
    access_macros.define_obsolete_register($sym134$DUMP_TVA_CACHE_TO_STREAM, $list135);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("CACHE"), makeSymbol("BIN-PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$PRED_CACHES = makeUninternedSymbol("PRED-CACHES");
  public static final SubLSymbol $sym2$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list3 = list(list(makeSymbol("TVA-CACHE-REGISTRY")));
  public static final SubLSymbol $sym4$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLList $list5 = list(list(makeSymbol("KEY"), makeSymbol("RAW-SUPPORTED-VALUES"), makeSymbol("SUPPORTED-SUBKEYS"), makeSymbol("CACHE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym6$ENTRY = makeUninternedSymbol("ENTRY");
  public static final SubLSymbol $sym7$DO_MAP = makeSymbol("DO-MAP");
  public static final SubLSymbol $sym8$TVA_CACHE_MAP = makeSymbol("TVA-CACHE-MAP");
  public static final SubLSymbol $sym9$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym10$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLObject $const11$cacheTransitiveClosureForArgs = constant_handles.reader_make_constant_shell(makeString("cacheTransitiveClosureForArgs"));
  public static final SubLSymbol $sym12$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLObject $const13$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $kw14$GAF = makeKeyword("GAF");
  public static final SubLList $list15 = list(makeSymbol("BINARY-PREDICATE"), makeSymbol("INDEX-ARGNUM"));
  public static final SubLSymbol $sym16$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str17$Problem_initializing_TVA_CACHE_fo = makeString("Problem initializing TVA-CACHE for ~A: ~A. KB Subset issue?~%");
  public static final SubLList $list18 = list(makeSymbol("KEY"), makeUninternedSymbol("ENTRY"));
  public static final SubLList $list19 = cons(makeSymbol("RAW-SUPPORTED-VALUES"), makeSymbol("SUPPORTED-SUBKEYS"));
  public static final SubLSymbol $sym20$TVA_CACHE = makeSymbol("TVA-CACHE");
  public static final SubLSymbol $sym21$TVA_CACHE_P = makeSymbol("TVA-CACHE-P");
  public static final SubLList $list22 = list(makeSymbol("PRED"), makeSymbol("INDEX-ARGNUM"), makeSymbol("TVA-PRED-GAFS"), makeSymbol("TVAI-PRED-GAFS"), makeSymbol("MAP"));
  public static final SubLList $list23 = list(makeKeyword("PRED"), makeKeyword("INDEX-ARGNUM"), makeKeyword("TVA-PRED-GAFS"), makeKeyword("TVAI-PRED-GAFS"), makeKeyword("MAP"));
  public static final SubLList $list24 = list(makeSymbol("TVA-CACHE-PRED"), makeSymbol("TVA-CACHE-INDEX-ARGNUM"), makeSymbol("TVA-CACHE-TVA-PRED-GAFS"), makeSymbol("TVA-CACHE-TVAI-PRED-GAFS"), makeSymbol("TVA-CACHE-MAP"));
  public static final SubLList $list25 = list(makeSymbol("_CSETF-TVA-CACHE-PRED"), makeSymbol("_CSETF-TVA-CACHE-INDEX-ARGNUM"), makeSymbol("_CSETF-TVA-CACHE-TVA-PRED-GAFS"), makeSymbol("_CSETF-TVA-CACHE-TVAI-PRED-GAFS"), makeSymbol("_CSETF-TVA-CACHE-MAP"));
  public static final SubLSymbol $sym26$PPRINT_TVA_CACHE = makeSymbol("PPRINT-TVA-CACHE");
  public static final SubLSymbol $sym27$TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-CACHE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym28$TVA_CACHE_PRED = makeSymbol("TVA-CACHE-PRED");
  public static final SubLSymbol $sym29$_CSETF_TVA_CACHE_PRED = makeSymbol("_CSETF-TVA-CACHE-PRED");
  public static final SubLSymbol $sym30$TVA_CACHE_INDEX_ARGNUM = makeSymbol("TVA-CACHE-INDEX-ARGNUM");
  public static final SubLSymbol $sym31$_CSETF_TVA_CACHE_INDEX_ARGNUM = makeSymbol("_CSETF-TVA-CACHE-INDEX-ARGNUM");
  public static final SubLSymbol $sym32$TVA_CACHE_TVA_PRED_GAFS = makeSymbol("TVA-CACHE-TVA-PRED-GAFS");
  public static final SubLSymbol $sym33$_CSETF_TVA_CACHE_TVA_PRED_GAFS = makeSymbol("_CSETF-TVA-CACHE-TVA-PRED-GAFS");
  public static final SubLSymbol $sym34$TVA_CACHE_TVAI_PRED_GAFS = makeSymbol("TVA-CACHE-TVAI-PRED-GAFS");
  public static final SubLSymbol $sym35$_CSETF_TVA_CACHE_TVAI_PRED_GAFS = makeSymbol("_CSETF-TVA-CACHE-TVAI-PRED-GAFS");
  public static final SubLSymbol $sym36$_CSETF_TVA_CACHE_MAP = makeSymbol("_CSETF-TVA-CACHE-MAP");
  public static final SubLSymbol $kw37$PRED = makeKeyword("PRED");
  public static final SubLSymbol $kw38$INDEX_ARGNUM = makeKeyword("INDEX-ARGNUM");
  public static final SubLSymbol $kw39$TVA_PRED_GAFS = makeKeyword("TVA-PRED-GAFS");
  public static final SubLSymbol $kw40$TVAI_PRED_GAFS = makeKeyword("TVAI-PRED-GAFS");
  public static final SubLSymbol $kw41$MAP = makeKeyword("MAP");
  public static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym43$SXHASH_TVA_CACHE_METHOD = makeSymbol("SXHASH-TVA-CACHE-METHOD");
  public static final SubLString $str44$__TVA_CACHE__S__S_ = makeString("#<TVA-CACHE ~S ~S>");
  public static final SubLSymbol $kw45$SWAPPED_OUT = makeKeyword("SWAPPED-OUT");
  public static final SubLString $str46$Cannot_reconnect__A__which_is_not = makeString("Cannot reconnect ~A, which is not a swappable TVA cache.");
  public static final SubLSymbol $sym47$_TVA_CACHE_REGISTRY_ = makeSymbol("*TVA-CACHE-REGISTRY*");
  public static final SubLObject $const48$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw49$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw50$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw51$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw52$QUEUE = makeKeyword("QUEUE");
  public static final SubLObject $const53$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $sym54$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw55$ERROR = makeKeyword("ERROR");
  public static final SubLString $str56$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym57$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw58$CERROR = makeKeyword("CERROR");
  public static final SubLString $str59$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw60$WARN = makeKeyword("WARN");
  public static final SubLString $str61$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str62$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str63$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLString $str64$__Creating_TVA_cache_for__S__arg_ = makeString("~&Creating TVA cache for ~S (arg ~D)...~%.");
  public static final SubLList $list65 = list(list(makeSymbol("SUB-CACHE"), makeSymbol("CACHE"), makeSymbol("INVERSE?"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list66 = list(makeKeyword("DONE?"));
  public static final SubLSymbol $kw67$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw68$DONE_ = makeKeyword("DONE?");
  public static final SubLSymbol $sym69$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");
  public static final SubLSymbol $sym70$DO_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol("DO-ALL-SPEC-PREDICATES-AND-INVERSES");
  public static final SubLSymbol $sym71$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym72$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym73$FIND_TVA_SUB_CACHE = makeSymbol("FIND-TVA-SUB-CACHE");
  public static final SubLList $list74 = cons(makeSymbol("VALUE"), makeSymbol("SUPPORTS"));
  public static final SubLList $list75 = cons(makeSymbol("TRANSITIVE-VALUE"), makeSymbol("MORE-SUPPORTS"));
  public static final SubLSymbol $sym76$TVA_CACHE_SUPPORT_EQUAL_ = makeSymbol("TVA-CACHE-SUPPORT-EQUAL?");
  public static final SubLSymbol $kw77$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLList $list78 = list(makeSymbol("VALUE"), makeSymbol("SUPPORTS"));
  public static final SubLList $list79 = list(makeSymbol("SUBKEY"), makeSymbol("SUBKEY-SUPPORTS"));
  public static final SubLList $list80 = cons(makeSymbol("SUBKEY-VALUE"), makeSymbol("SUBKEY-VALUE-SUPPORTS"));
  public static final SubLSymbol $sym81$TVA_CACHE_VALID_SUPPORT_ = makeSymbol("TVA-CACHE-VALID-SUPPORT?");
  public static final SubLSymbol $kw82$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list83 = list(makeSymbol("TYPE"), makeSymbol("GAF"), makeSymbol("&OPTIONAL"), makeSymbol("SPECIFIED-PRED"));
  public static final SubLString $str84$No_specified_pred_for__S = makeString("No specified pred for ~S");
  public static final SubLSymbol $kw85$INVERSE = makeKeyword("INVERSE");
  public static final SubLSymbol $kw86$SPEC_PRED = makeKeyword("SPEC-PRED");
  public static final SubLList $list87 = list(makeSymbol("BIN-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $sym88$ADD_TVA_CACHE_VALUE = makeSymbol("ADD-TVA-CACHE-VALUE");
  public static final SubLSymbol $sym89$REMOVE_TVA_CACHE_VALUE = makeSymbol("REMOVE-TVA-CACHE-VALUE");
  public static final SubLList $list90 = list(makeSymbol("TRANS-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLList $list91 = list(makeSymbol("CACHE"), makeSymbol("INVERSE?"), makeSymbol("ORIGINAL-TRANS-PRED"));
  public static final SubLSymbol $sym92$ADD_TVA_CACHE_KEY = makeSymbol("ADD-TVA-CACHE-KEY");
  public static final SubLSymbol $sym93$REMOVE_TVA_CACHE_KEY = makeSymbol("REMOVE-TVA-CACHE-KEY");
  public static final SubLList $list94 = list(makeSymbol("BIN-PRED"), makeSymbol("ARG2"), makeSymbol("INDEX-ARGNUM"));
  public static final SubLList $list95 = list(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym96$BINARY_PREDICATE_ = makeSymbol("BINARY-PREDICATE?");
  public static final SubLObject $const97$transitiveViaArg = constant_handles.reader_make_constant_shell(makeString("transitiveViaArg"));
  public static final SubLSymbol $kw98$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const99$transitiveViaArgInverse = constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse"));
  public static final SubLString $str100$Error_initializing__S_____S___Der = makeString("Error initializing ~S:~% ~S~% Deregistering cache.");
  public static final SubLString $str101$TVA_Caching_ = makeString("TVA Caching ");
  public static final SubLString $str102$_ = makeString(" ");
  public static final SubLString $str103$_assertions___ = makeString(" assertions...");
  public static final SubLObject $const104$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));
  public static final SubLSymbol $sym105$TVA_CACHE_MAX_INSTANCES_TO_CACHE = makeSymbol("TVA-CACHE-MAX-INSTANCES-TO-CACHE");
  public static final SubLInteger $int106$25 = makeInteger(25);
  public static final SubLSymbol $sym107$_TVA_CACHE_MAX_INSTANCES_TO_CACHE_CACHING_STATE_ = makeSymbol("*TVA-CACHE-MAX-INSTANCES-TO-CACHE-CACHING-STATE*");
  public static final SubLObject $const108$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list109 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLObject $const110$relationInstanceAll = constant_handles.reader_make_constant_shell(makeString("relationInstanceAll"));
  public static final SubLSymbol $kw111$COMPLEX = makeKeyword("COMPLEX");
  public static final SubLString $str112$Complex_TVA_cache_support_in__S = makeString("Complex TVA cache support in ~S");
  public static final SubLList $list113 = cons(makeKeyword("COMPLEX"), makeKeyword("ANYTHING"));
  public static final SubLList $list114 = list(makeSymbol("IMPLICIT-KEY"), makeSymbol("SUPPORTS"));
  public static final SubLSymbol $sym115$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $kw116$TOP = makeKeyword("TOP");
  public static final SubLSymbol $kw117$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLList $list118 = list(constant_handles.reader_make_constant_shell(makeString("isa")), list(makeKeyword("BIND"), makeSymbol("PRED")), constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate")));
  public static final SubLSymbol $sym119$PRED = makeSymbol("PRED");
  public static final SubLString $str120$Don_t_know_how_to_find_the_transi = makeString("Don't know how to find the transitive predicate from~% ~S");
  public static final SubLList $list121 = list(makeKeyword("SPEC-PRED"), makeKeyword("INVERSE"));
  public static final SubLString $str122$Can_t_get_transitivity_support_fr = makeString("Can't get transitivity support from ~S");
  public static final SubLSymbol $sym123$TVA_CACHE_SUPPORT_GAF = makeSymbol("TVA-CACHE-SUPPORT-GAF");
  public static final SubLList $list124 = cons(makeSymbol("IMPLIED-VALUE"), makeSymbol("MORE-SUPPORTS"));
  public static final SubLList $list125 = list(makeSymbol("KEY"), makeSymbol("SUPPORTS"));
  public static final SubLObject $const126$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));
  public static final SubLInteger $int127$96 = makeInteger(96);
  public static final SubLSymbol $sym128$CFASL_INPUT_TVA_CACHE = makeSymbol("CFASL-INPUT-TVA-CACHE");
  public static final SubLSymbol $sym129$CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TVA-CACHE-METHOD");
  public static final SubLString $str130$tva_cache_contents = makeString("tva-cache-contents");
  public static final SubLString $str131$tva_cache_contents_index = makeString("tva-cache-contents-index");
  public static final SubLList $list132 = list(makeSymbol("KEY"), makeSymbol("TVA-CACHES"));
  public static final SubLString $str133$Reconnecting_to_legacy_unit_files = makeString("Reconnecting to legacy unit files w/out TVA cache contents in ~A and ~A.");
  public static final SubLSymbol $sym134$DUMP_TVA_CACHE_TO_STREAM = makeSymbol("DUMP-TVA-CACHE-TO-STREAM");
  public static final SubLList $list135 = list(makeSymbol("DUMP-SWAPPABLE-TVA-CACHE-TO-STREAM"));

  //// Initializers

  public void declareFunctions() {
    declare_tva_cache_file();
  }

  public void initializeVariables() {
    init_tva_cache_file();
  }

  public void runTopLevelForms() {
    setup_tva_cache_file();
  }

}
