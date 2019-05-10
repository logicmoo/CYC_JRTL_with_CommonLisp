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

package  com.cyc.cycjava_1.cycl.sbhl;

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
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_high;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
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
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.set_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.system_parameters;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class sbhl_cache extends SubLTranslatedFile {

  //// Constructor

  private sbhl_cache() {}
  public static final SubLFile me = new sbhl_cache();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_cache";

  //// Definitions

  /** Flag for whether the SBHL caches have been initialized */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 1285) 
  private static SubLSymbol $sbhl_caches_initializedP$ = null;

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2267) 
  public static final SubLObject note_sbhl_caches_initialized() {
    $sbhl_caches_initializedP$.setGlobalValue(T);
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2370) 
  public static final SubLObject sbhl_caches_initialized_p() {
    return $sbhl_caches_initializedP$.getGlobalValue();
  }

  /** The predicates that have their spec-preds and spec-inverses cached */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2454) 
  private static SubLSymbol $cached_genl_predicates$ = null;

  /** The predicates that have their spec-preds and spec-inverses cached */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2617) 
  public static SubLSymbol $cached_genl_predicates_set$ = null;

  /** The dictionary of dictionaries of genl-predicate relations */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2796) 
  public static SubLSymbol $genl_predicate_cache$ = null;

  /** The dictionary of dictionaries of genl-inverse relations */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 2907) 
  public static SubLSymbol $genl_inverse_cache$ = null;

  /** The dictionary of dictionaries of genl-predicate relations with all mts relevance */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3013) 
  public static SubLSymbol $all_mts_genl_predicate_cache$ = null;

  /** The dictionary of dictionaries of genl-inverse relations with all mts relevance */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3155) 
  public static SubLSymbol $all_mts_genl_inverse_cache$ = null;

  /** The collections that have their specs cached. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3292) 
  private static SubLSymbol $cached_genls$ = null;

  /** The collections that have their specs cached. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3686) 
  public static SubLSymbol $cached_genls_set$ = null;

  /** The dictionary of dictionaries of genls relations */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3824) 
  public static SubLSymbol $genls_cache$ = null;

  /** The dictionary of dictionaries of genls relations */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 3917) 
  public static SubLSymbol $all_mts_genls_cache$ = null;

  /** The collections used for fort type definitional typing. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4018) 
  public static SubLSymbol $definitional_fort_typing_collections$ = null;

  /** The additional fort type collections. Those which are not intended to be defining, disjoint types of forts */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 4265) 
  public static SubLSymbol $additional_fort_typing_collections$ = null;

  /** Implicit fort typing collections which are not stored explicitly but can be deduced by the union of other fort types. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 5781) 
  public static SubLSymbol $implicit_fort_typing_collections$ = null;

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6039) 
  public static SubLSymbol $cached_isas$ = null;

  /** All of the collections whose instances (via #$isa) are cached */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6212) 
  public static SubLSymbol $cached_isas_set$ = null;

  /** Accessor. @return booleanp; is TYPE a member of @xref all-fort-types. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6424) 
  public static final SubLObject valid_fort_typeP(SubLObject type) {
    return cached_nodeP(type, $const20$isa);
  }

  public static final class $valid_fort_typeP$UnaryFunction extends UnaryFunction {
    public $valid_fort_typeP$UnaryFunction() { super(extractFunctionNamed("VALID-FORT-TYPE?")); }
    public SubLObject processItem(SubLObject arg1) { return valid_fort_typeP(arg1); }
  }

  /** The dictionary of dictionaries of mts of types of forts */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6573) 
  public static SubLSymbol $isa_cache$ = null;

  /** Table mapping implicit fort types to the explicit fort types of which they are composed. This must be the same in all mts. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6670) 
  public static SubLSymbol $implicit_fort_type_mapping$ = null;

  /** The id-index of forts types* */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6853) 
  public static SubLSymbol $all_mts_isa_cache$ = null;

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 6931) 
  private static SubLSymbol $cached_preds$ = null;

  /** @return booleanp; whether NODE is a cached superior node for PRED */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 7329) 
  public static final SubLObject cached_nodeP(SubLObject node, SubLObject pred) {
    return set.set_memberP(node, get_cached_nodes_set_for_pred(pred));
  }

  /** Does an @xref fort-id-index-lookup on ID-INDEX with NODE, provided node is a fort. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 7545) 
  public static final SubLObject sbhl_id_index_lookup(SubLObject v_id_index, SubLObject node) {
    return ((NIL != forts.fort_p(node)) ? ((SubLObject) forts.fort_id_index_lookup(v_id_index, node)) : NIL);
  }

  /** @return setp; the cached subsuming node set for MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 7754) 
  public static final SubLObject get_cached_nodes_set_for_pred(SubLObject pred) {
    {
      SubLObject pcase_var = pred;
      if (pcase_var.eql($const20$isa)) {
        return $cached_isas_set$.getGlobalValue();
      } else if (pcase_var.eql($const29$genls)) {
        return $cached_genls_set$.getGlobalValue();
      } else if (pcase_var.eql($const30$genlPreds)) {
        return $cached_genl_predicates_set$.getGlobalValue();
      } else if (pcase_var.eql($const31$genlInverse)) {
        return $cached_genl_predicates_set$.getGlobalValue();
      } else {
        return NIL;
      }
    }
  }

  /** @return listp; the cached subsuming nodes for PRED */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 8218) 
  public static final SubLObject get_sbhl_cached_nodes_for_pred(SubLObject pred) {
    {
      SubLObject pcase_var = pred;
      if (pcase_var.eql($const20$isa)) {
        return $cached_isas$.getGlobalValue();
      } else if (pcase_var.eql($const29$genls)) {
        return $cached_genls$.getGlobalValue();
      } else if (pcase_var.eql($const30$genlPreds)) {
        return $cached_genl_predicates$.getGlobalValue();
      } else if (pcase_var.eql($const31$genlInverse)) {
        return $cached_genl_predicates$.getGlobalValue();
      } else {
        return NIL;
      }
    }
  }

  /** @return booleanp; whether PRED has any caching. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 8996) 
  public static final SubLObject sbhl_pred_has_caching_p(SubLObject pred) {
    return list_utilities.member_eqP(pred, $cached_preds$.getGlobalValue());
  }

  /** Accessor. @return booleanp. Determines whether a cache of the relation (PRED NODE1 NODE2) could exist and can currently be used */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9176) 
  public static final SubLObject sbhl_cache_use_possible_p(SubLObject pred, SubLObject node1, SubLObject node2) {
    return makeBoolean(((NIL != sbhl_paranoia.check_sbhl_cachesP())
           && (NIL != sbhl_pred_has_caching_p(pred))
           && (NIL != forts.fort_p(node1))
           && (NIL != cached_nodeP(node2, pred))));
  }

  /** Accessor. @return booleanp.  */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 9746) 
  public static final SubLObject sbhl_cache_use_possible_for_nodes_p(SubLObject pred, SubLObject nodes, SubLObject node) {
    return makeBoolean(((NIL != sbhl_paranoia.check_sbhl_cachesP())
           && (NIL != sbhl_pred_has_caching_p(pred))
           && (NIL != list_utilities.every_in_list($sym32$FORT_P, nodes, UNPROVIDED))
           && (NIL != cached_nodeP(node, pred))));
  }

  /** Accessor. @return booleanp. Returns whether the (PRED SUBNODE NODE):MT relation is cached in the sbhl caches. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 10029) 
  public static final SubLObject sbhl_cached_predicate_relation_p(SubLObject pred, SubLObject subnode, SubLObject node, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_metrics.increment_sbhl_cache_attempt_historical_count();
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
            result = sbhl_cached_relation_p(pred, subnode, node);
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != result)) {
          inference_metrics.increment_sbhl_cache_success_historical_count();
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11480) 
  public static final SubLObject sbhl_cached_relation_p(SubLObject pred, SubLObject subnode, SubLObject node) {
    return ((NIL != mt_relevance_macros.all_mts_are_relevantP()) ? ((SubLObject) cached_all_mts_relation_p(pred, subnode, node)) : cached_relation_p(pred, subnode, node));
  }

  /** Accessor. @return sbhl-cache-p; The cached relations associated with PRED. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 11884) 
  public static final SubLObject get_sbhl_cache_for_pred(SubLObject pred) {
    {
      SubLObject pcase_var = pred;
      if (pcase_var.eql($const20$isa)) {
        return $isa_cache$.getGlobalValue();
      } else if (pcase_var.eql($const30$genlPreds)) {
        return $genl_predicate_cache$.getGlobalValue();
      } else if (pcase_var.eql($const31$genlInverse)) {
        return $genl_inverse_cache$.getGlobalValue();
      } else if (pcase_var.eql($const29$genls)) {
        return $genls_cache$.getGlobalValue();
      } else {
        return NIL;
      }
    }
  }

  /** Accessor. @return listp; the list of mts for the cached (PRED SUBNODE NODE) relations. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 12342) 
  public static final SubLObject get_mts_for_cached_sbhl_relation(SubLObject pred, SubLObject subnode, SubLObject node) {
    checkType(pred, $sym33$SBHL_PREDICATE_P);
    {
      SubLObject v_cache = get_sbhl_cache_for_pred(pred);
      if ((NIL != v_cache)) {
        {
          SubLObject subnode_store = dictionary.dictionary_lookup_without_values(v_cache, node, UNPROVIDED);
          return ((NIL != subnode_store) ? ((SubLObject) dictionary.dictionary_lookup_without_values(subnode_store, subnode, UNPROVIDED)) : NIL);
        }
      } else {
        return NIL;
      }
    }
  }

  /** Accessor. @return booleanp; Whether the (PRED SUBNODE NODE):MT relation is valid, considering cached relations. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 12784) 
  public static final SubLObject cached_relation_p(SubLObject pred, SubLObject subnode, SubLObject node) {
    return mt_relevance_macros.any_relevant_mtP(get_mts_for_cached_sbhl_relation(pred, subnode, node));
  }

  /** Accessor. like @xref sbhl-cached-relation-p, except this looks just in the cache for an exact match for (PRED SUBNODE NODE):MT, and is not predicated on mt-relevance */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 14084) 
  public static final SubLObject cached_relation_in_cache_p(SubLObject pred, SubLObject subnode, SubLObject node, SubLObject mt) {
    return subl_promotions.memberP(mt, dictionary.dictionary_lookup(dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), node, UNPROVIDED), subnode, UNPROVIDED), $sym42$HLMT_EQUAL, UNPROVIDED);
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 14478) 
  public static final SubLObject sbhl_pred_all_mts_cache_uses_id_index_p(SubLObject pred) {
    return Equality.eq(pred, $const20$isa);
  }

  /** Accesor. @return sbhl-all-mts-cache-; The cached all-mts relations for PRED. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 14778) 
  public static final SubLObject get_sbhl_all_mts_cache_for_pred(SubLObject pred) {
    {
      SubLObject pcase_var = pred;
      if (pcase_var.eql($const20$isa)) {
        return $all_mts_isa_cache$.getGlobalValue();
      } else if (pcase_var.eql($const30$genlPreds)) {
        return $all_mts_genl_predicate_cache$.getGlobalValue();
      } else if (pcase_var.eql($const31$genlInverse)) {
        return $all_mts_genl_inverse_cache$.getGlobalValue();
      } else if (pcase_var.eql($const29$genls)) {
        return $all_mts_genls_cache$.getGlobalValue();
      } else {
        return NIL;
      }
    }
  }

  /** Accessor. @return booleanp; Whether the (PRED SUBNODE NODE) relation is cached with all-mts relevance. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 15211) 
  public static final SubLObject cached_all_mts_relation_p(SubLObject pred, SubLObject subnode, SubLObject node) {
    {
      SubLObject pred_uses_id_indexP = sbhl_pred_all_mts_cache_uses_id_index_p(pred);
      SubLObject all_mts_cache = get_sbhl_all_mts_cache_for_pred(pred);
      if ((NIL == all_mts_cache)) {
        Errors.error($str43$All_Mts_cache_is_missing_for__A_, pred);
      }
      {
        SubLObject cached_list = ((NIL != pred_uses_id_indexP) ? ((SubLObject) sbhl_id_index_lookup(all_mts_cache, subnode)) : dictionary.dictionary_lookup_without_values(all_mts_cache, node, UNPROVIDED));
        return ((NIL != set.set_p(cached_list)) ? ((SubLObject) ((NIL != pred_uses_id_indexP) ? ((SubLObject) set.set_memberP(node, cached_list)) : set.set_memberP(subnode, cached_list))) : NIL);
      }
    }
  }

  /** Accessor. @return listp; The cached-nodes s.t. (PRED NODE CACHED-NODE) relation is valid with all-mts relevance. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 15994) 
  public static final SubLObject cached_all_mts_relations_for_node(SubLObject pred, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred))) {
        {
          SubLObject relation_set = sbhl_id_index_lookup(get_sbhl_all_mts_cache_for_pred(pred), node);
          return ((NIL != set.set_p(relation_set)) ? ((SubLObject) set.set_element_list(relation_set)) : NIL);
        }
      } else {
        {
          SubLObject cached_relations = NIL;
          SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_all_mts_cache_for_pred(pred)));
          while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
            thread.resetMultipleValues();
            {
              SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
              SubLObject subnodes = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != set.set_memberP(node, subnodes))) {
                cached_relations = cons(cached_node, cached_relations);
              }
              iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
            }
          }
          dictionary_contents.do_dictionary_contents_finalize(iteration_state);
          return cached_relations;
        }
      }
    }
  }

  /** Modifier. Adds the MT info to the (PRED SUBNODE NODE) cache. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 21530) 
  public static final SubLObject add_to_sbhl_cache(SubLObject pred, SubLObject node, SubLObject subnode, SubLObject mt) {
    {
      SubLObject v_cache = get_sbhl_cache_for_pred(pred);
      SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
      if ((NIL == subnodes)) {
        subnodes = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
      }
      dictionary_utilities.dictionary_pushnew(subnodes, subnode, mt, Symbols.symbol_function(EQ), UNPROVIDED);
      dictionary.dictionary_enter(v_cache, node, subnodes);
    }
    return NIL;
  }

  /** Modifier. Adds the (PRED SUBNODE NODE) info to the all-mts cache. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 22368) 
  public static final SubLObject add_to_sbhl_all_mts_cache(SubLObject pred, SubLObject node, SubLObject subnode) {
    {
      SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
      if ((NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred))) {
        {
          SubLObject nodes = sbhl_id_index_lookup(v_cache, subnode);
          if ((NIL == nodes)) {
            nodes = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
          }
          set.set_add(node, nodes);
          forts.fort_id_index_enter(v_cache, subnode, nodes);
        }
      } else {
        {
          SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
          if ((NIL == subnodes)) {
            subnodes = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
          }
          set.set_add(subnode, subnodes);
          dictionary.dictionary_enter(v_cache, node, subnodes);
        }
      }
    }
    return NIL;
  }

  /** Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-addings of predicates with cached relations. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 23038) 
  public static final SubLObject sbhl_cache_addition_maintainence(SubLObject assertion) {
    if ((NIL != recache_sbhl_cachesP())) {
      if ((NIL != assertions_high.assertion_has_truth(assertion, $kw73$TRUE))) {
        {
          SubLObject pred = assertions_high.gaf_predicate(assertion);
          SubLObject pcase_var = pred;
          if (pcase_var.eql($const20$isa)) {
            isa_cache_addition_maintainence(assertion);
          } else if (pcase_var.eql($const29$genls)) {
            genls_cache_addition_maintainence(assertion);
          } else if (pcase_var.eql($const30$genlPreds)) {
            sbhl_genl_preds_cache_addition_maintainence(assertion);
          } else if (pcase_var.eql($const31$genlInverse)) {
            sbhl_genl_preds_cache_addition_maintainence(assertion);
          }
        }
      }
    }
    return NIL;
  }

  /** Modifier. @return booleanp; Returns whether or not there was addition to the sbhl-caches on account of adding ASSERTION.  This does the general addition maintainence for all preds.  Each particular pred may do additional addition maintainence besides this. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 23688) 
  public static final SubLObject possibly_add_to_sbhl_caches(SubLObject assertion, SubLObject term2_check_pred, SubLObject cache_pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject addedP = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
          try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            {
              SubLObject term1 = assertions_high.gaf_arg1(assertion);
              SubLObject term2 = assertions_high.gaf_arg2(assertion);
              SubLObject new_cached_relations = sbhl_predicate_relation_to_which_cached_nodes(term2_check_pred, term2, cache_pred);
              SubLObject old_cached_relations = cached_all_mts_relations_for_node(cache_pred, term1);
              SubLObject cached_relations_gained = conses_high.set_difference(new_cached_relations, old_cached_relations, Symbols.symbol_function(EQ), UNPROVIDED);
              {
                SubLObject cdolist_list_var = cached_relations_gained;
                SubLObject new_cached_relation = NIL;
                for (new_cached_relation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), new_cached_relation = cdolist_list_var.first()) {
                  addedP = T;
                  add_to_sbhl_all_mts_cache(cache_pred, new_cached_relation, term1);
                }
              }
              {
                SubLObject cdolist_list_var = new_cached_relations;
                SubLObject new_type = NIL;
                for (new_type = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), new_type = cdolist_list_var.first()) {
                  {
                    SubLObject cdolist_list_var_6 = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(cache_pred), term1, term2, UNPROVIDED);
                    SubLObject mt = NIL;
                    for (mt = cdolist_list_var_6.first(); (NIL != cdolist_list_var_6); cdolist_list_var_6 = cdolist_list_var_6.rest(), mt = cdolist_list_var_6.first()) {
                      if ((NIL == cached_relation_in_cache_p(cache_pred, term1, new_type, mt))) {
                        addedP = T;
                        add_to_sbhl_cache(cache_pred, new_type, term1, mt);
                      }
                    }
                  }
                }
              }
            }
          } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
          }
        }
        return addedP;
      }
    }
  }

  /** Modifier. @return booleanp; Removes MT from the cache for NODE, and returns T iff this was the last MT for the PRED SUBNODE NODE relation. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 25516) 
  public static final SubLObject retract_from_sbhl_cache(SubLObject pred, SubLObject node, SubLObject subnode, SubLObject mt) {
    {
      SubLObject nodes_cache = dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), node, UNPROVIDED);
      SubLObject cached_mts = dictionary.dictionary_lookup(nodes_cache, subnode, UNPROVIDED);
      if (((NIL != list_utilities.singletonP(cached_mts))
           && (mt == cached_mts.first()))) {
        dictionary.dictionary_remove(nodes_cache, subnode);
        return T;
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12425");
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 26124) 
  public static final SubLObject retract_from_sbhl_all_mts_cache(SubLObject pred, SubLObject node, SubLObject subnode) {
    {
      SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
      if ((NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred))) {
        {
          SubLObject nodes = sbhl_id_index_lookup(v_cache, subnode);
          set.set_remove(node, nodes);
          if ((NIL != set.set_emptyP(nodes))) {
            forts.fort_id_index_remove(v_cache, subnode);
          } else {
            forts.fort_id_index_enter(v_cache, subnode, nodes);
          }
        }
      } else {
        {
          SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
          set.set_remove(subnode, subnodes);
          if ((NIL != set.set_emptyP(subnodes))) {
            dictionary.dictionary_remove(v_cache, node);
          } else {
            dictionary.dictionary_enter(v_cache, node, subnodes);
          }
        }
      }
    }
    return NIL;
  }

  /** Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-removing of predicates with cached relations. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 26749) 
  public static final SubLObject sbhl_cache_removal_maintainence(SubLObject assertion) {
    if ((NIL != recache_sbhl_cachesP())) {
      if ((NIL != assertions_high.assertion_has_truth(assertion, $kw73$TRUE))) {
        {
          SubLObject pred = assertions_high.gaf_predicate(assertion);
          SubLObject pcase_var = pred;
          if (pcase_var.eql($const20$isa)) {
            isa_cache_removal_maintainence(assertion);
          } else if (pcase_var.eql($const29$genls)) {
            genls_cache_removal_maintainence(assertion);
          } else if (pcase_var.eql($const30$genlPreds)) {
            sbhl_genl_preds_cache_removal_maintainence(assertion);
          } else if (pcase_var.eql($const31$genlInverse)) {
            sbhl_genl_preds_cache_removal_maintainence(assertion);
          }
        }
      }
    }
    return NIL;
  }

  /** Modifier. @return booleanp; Returns whether or not there was removal from the sbhl-caches on account of removing ASSERTION.  This does the general removal maintainence for all preds.  Each particular pred may do additional removal maintainence besides this. */
  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 27394) 
  public static final SubLObject possibly_remove_from_sbhl_caches(SubLObject pred, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject retractedP = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
          try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            {
              SubLObject term1 = assertions_high.gaf_arg1(assertion);
              SubLObject mt = assertions_high.assertion_mt(assertion);
              SubLObject current_cached_relations = cached_all_mts_relations_for_node(pred, term1);
              SubLObject new_cached_relations = sbhl_predicate_relation_to_which_cached_nodes(pred, term1, pred);
              SubLObject cached_relations_lost = conses_high.set_difference(current_cached_relations, new_cached_relations, Symbols.symbol_function(EQ), UNPROVIDED);
              SubLObject cdolist_list_var = cached_relations_lost;
              SubLObject lost_cached_relation = NIL;
              for (lost_cached_relation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lost_cached_relation = cdolist_list_var.first()) {
                retractedP = T;
                retract_from_sbhl_all_mts_cache(pred, lost_cached_relation, term1);
              }
              {
                SubLObject mt_matching_isas = sbhl_link_methods.sbhl_mt_matching_link_nodes(sbhl_module_vars.get_sbhl_module(pred), term1, mt);
                SubLObject v_cache = get_sbhl_cache_for_pred(pred);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache));
                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                  thread.resetMultipleValues();
                  {
                    SubLObject cached_relation = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    SubLObject cached_nodes_store = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != subl_promotions.memberP(mt, dictionary.dictionary_lookup(cached_nodes_store, term1, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
                      if ((!(((NIL != mt_matching_isas)
                             && (NIL != sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), term1, cached_relation, UNPROVIDED, UNPROVIDED)))))) {
                        retractedP = T;
                        retract_from_sbhl_cache(pred, cached_relation, term1, mt);
                      }
                    }
                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                  }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
              }
            }
          } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
          }
        }
        return retractedP;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 28802) 
  public static final SubLObject recache_sbhl_cachesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != sbhl_paranoia.check_sbhl_cachesP())
             && (NIL == sbhl_paranoia.$suppress_sbhl_recachingP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 29209) 
  public static final SubLObject sbhl_predicate_relation_to_which_cached_nodes(SubLObject pred, SubLObject node, SubLObject cache_pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cached_nodes = get_sbhl_cached_nodes_for_pred(cache_pred);
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym68$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const69$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_predicate_relation_to_which(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 29541) 
  public static final SubLObject sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node(SubLObject pred, SubLObject node, SubLObject cache_pred, SubLObject excl_link_node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cached_nodes = get_sbhl_cached_nodes_for_pred(cache_pred);
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym68$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const69$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_predicate_relation_to_which_excluding_link_node(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, excl_link_node, UNPROVIDED, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 32606) 
  public static final SubLObject sbhl_genl_preds_cache_addition_maintainence(SubLObject assertion) {
    {
      SubLObject extendedP = NIL;
      SubLObject pcase_var = assertions_high.gaf_predicate(assertion);
      if (pcase_var.eql($const30$genlPreds)) {
        {
          SubLObject genl_pred_extendedP = possibly_add_to_sbhl_caches(assertion, $const30$genlPreds, $const30$genlPreds);
          SubLObject genl_inverse_extendedP = possibly_add_to_sbhl_caches(assertion, $const31$genlInverse, $const31$genlInverse);
          extendedP = makeBoolean(((NIL != genl_pred_extendedP)
                || (NIL != genl_inverse_extendedP)));
        }
      } else if (pcase_var.eql($const31$genlInverse)) {
        {
          SubLObject genl_pred_extendedP = possibly_add_to_sbhl_caches(assertion, $const30$genlPreds, $const31$genlInverse);
          SubLObject genl_inverse_extendedP = possibly_add_to_sbhl_caches(assertion, $const31$genlInverse, $const30$genlPreds);
          extendedP = makeBoolean(((NIL != genl_pred_extendedP)
                || (NIL != genl_inverse_extendedP)));
        }
      } else {
        sbhl_paranoia.sbhl_error(THREE_INTEGER, $str89$genlPreds___genlInverse_after_add, assertions_high.gaf_predicate(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      if ((NIL != extendedP)) {
        {
          SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1754");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 33651) 
  public static final SubLObject sbhl_genl_preds_cache_removal_maintainence(SubLObject assertion) {
    {
      SubLObject genl_pred_retractedP = possibly_remove_from_sbhl_caches($const30$genlPreds, assertion);
      SubLObject genl_inverse_retractedP = possibly_remove_from_sbhl_caches($const31$genlInverse, assertion);
      SubLObject retractedP = makeBoolean(((NIL != genl_pred_retractedP)
          || (NIL != genl_inverse_retractedP)));
      if ((NIL != retractedP)) {
        {
          SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1755");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 35092) 
  public static final SubLObject genls_cache_addition_maintainence(SubLObject assertion) {
    {
      SubLObject spec = assertions_high.gaf_arg1(assertion);
      SubLObject genl = assertions_high.gaf_arg2(assertion);
      SubLObject extendedP = NIL;
      extendedP = possibly_add_to_sbhl_caches(assertion, $const29$genls, $const29$genls);
      if ((NIL != extendedP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1752");
      }
      {
        SubLObject new_cached_isas = sbhl_predicate_relation_to_which_cached_nodes($const29$genls, spec, $const20$isa);
        SubLObject old_cached_isas = sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node($const29$genls, spec, $const20$isa, genl);
        SubLObject types_gained = conses_high.set_difference(new_cached_isas, old_cached_isas, Symbols.symbol_function(EQ), UNPROVIDED);
        if ((NIL != types_gained)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1756");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 35876) 
  public static final SubLObject genls_cache_removal_maintainence(SubLObject assertion) {
    {
      SubLObject spec = assertions_high.gaf_arg1(assertion);
      SubLObject genl = assertions_high.gaf_arg2(assertion);
      SubLObject retractedP = NIL;
      retractedP = possibly_remove_from_sbhl_caches($const29$genls, assertion);
      if ((NIL != retractedP)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1753");
      }
      {
        SubLObject new_cached_isas = sbhl_predicate_relation_to_which_cached_nodes($const29$genls, spec, $const20$isa);
        SubLObject old_cached_isas = sbhl_predicate_relation_to_which_cached_nodes($const29$genls, genl, $const20$isa);
        SubLObject types_lost = conses_high.set_difference(old_cached_isas, new_cached_isas, UNPROVIDED, UNPROVIDED);
        if ((NIL != types_lost)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1757");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 37495) 
  public static final SubLObject isa_cache_addition_maintainence(SubLObject assertion) {
    possibly_add_to_sbhl_caches(assertion, $const29$genls, $const20$isa);
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-cache.lisp", position = 37653) 
  public static final SubLObject isa_cache_removal_maintainence(SubLObject assertion) {
    possibly_remove_from_sbhl_caches($const20$isa, assertion);
    return NIL;
  }

  public static final SubLObject declare_sbhl_cache_file() {
    declareFunction(myName, "note_sbhl_caches_initialized", "NOTE-SBHL-CACHES-INITIALIZED", 0, 0, false);
    declareFunction(myName, "sbhl_caches_initialized_p", "SBHL-CACHES-INITIALIZED-P", 0, 0, false);
    //declareFunction(myName, "all_fort_types", "ALL-FORT-TYPES", 0, 0, false);
    declareFunction(myName, "valid_fort_typeP", "VALID-FORT-TYPE?", 1, 0, false); new $valid_fort_typeP$UnaryFunction();
    //declareMacro(myName, "do_sbhl_cached_subsumption_nodes", "DO-SBHL-CACHED-SUBSUMPTION-NODES");
    declareFunction(myName, "cached_nodeP", "CACHED-NODE?", 2, 0, false);
    declareFunction(myName, "sbhl_id_index_lookup", "SBHL-ID-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "get_cached_nodes_set_for_pred", "GET-CACHED-NODES-SET-FOR-PRED", 1, 0, false);
    declareFunction(myName, "get_sbhl_cached_nodes_for_pred", "GET-SBHL-CACHED-NODES-FOR-PRED", 1, 0, false);
    //declareFunction(myName, "valid_cached_predicate_p", "VALID-CACHED-PREDICATE-P", 1, 0, false);
    //declareFunction(myName, "valid_cached_fort_type_p", "VALID-CACHED-FORT-TYPE-P", 1, 0, false);
    //declareFunction(myName, "valid_cached_genl_p", "VALID-CACHED-GENL-P", 1, 0, false);
    declareFunction(myName, "sbhl_pred_has_caching_p", "SBHL-PRED-HAS-CACHING-P", 1, 0, false);
    declareFunction(myName, "sbhl_cache_use_possible_p", "SBHL-CACHE-USE-POSSIBLE-P", 3, 0, false);
    declareFunction(myName, "sbhl_cache_use_possible_for_nodes_p", "SBHL-CACHE-USE-POSSIBLE-FOR-NODES-P", 3, 0, false);
    declareFunction(myName, "sbhl_cached_predicate_relation_p", "SBHL-CACHED-PREDICATE-RELATION-P", 3, 1, false);
    //declareFunction(myName, "sbhl_cached_relations_for_node", "SBHL-CACHED-RELATIONS-FOR-NODE", 2, 1, false);
    //declareFunction(myName, "sbhl_all_subnodes_for_cached_node", "SBHL-ALL-SUBNODES-FOR-CACHED-NODE", 2, 0, false);
    declareFunction(myName, "sbhl_cached_relation_p", "SBHL-CACHED-RELATION-P", 3, 0, false);
    //declareFunction(myName, "sbhl_cached_relations", "SBHL-CACHED-RELATIONS", 2, 0, false);
    declareFunction(myName, "get_sbhl_cache_for_pred", "GET-SBHL-CACHE-FOR-PRED", 1, 0, false);
    declareFunction(myName, "get_mts_for_cached_sbhl_relation", "GET-MTS-FOR-CACHED-SBHL-RELATION", 3, 0, false);
    declareFunction(myName, "cached_relation_p", "CACHED-RELATION-P", 3, 0, false);
    //declareMacro(myName, "do_sbhl_cached_relations_for_node", "DO-SBHL-CACHED-RELATIONS-FOR-NODE");
    //declareFunction(myName, "cached_relations_for_node", "CACHED-RELATIONS-FOR-NODE", 2, 0, false);
    declareFunction(myName, "cached_relation_in_cache_p", "CACHED-RELATION-IN-CACHE-P", 4, 0, false);
    declareFunction(myName, "sbhl_pred_all_mts_cache_uses_id_index_p", "SBHL-PRED-ALL-MTS-CACHE-USES-ID-INDEX-P", 1, 0, false);
    //declareFunction(myName, "sbhl_finalize_all_mts_cache", "SBHL-FINALIZE-ALL-MTS-CACHE", 1, 0, false);
    declareFunction(myName, "get_sbhl_all_mts_cache_for_pred", "GET-SBHL-ALL-MTS-CACHE-FOR-PRED", 1, 0, false);
    declareFunction(myName, "cached_all_mts_relation_p", "CACHED-ALL-MTS-RELATION-P", 3, 0, false);
    declareFunction(myName, "cached_all_mts_relations_for_node", "CACHED-ALL-MTS-RELATIONS-FOR-NODE", 2, 0, false);
    //declareMacro(myName, "do_sbhl_cached_all_mts_relations", "DO-SBHL-CACHED-ALL-MTS-RELATIONS");
    //declareMacro(myName, "do_sbhl_cached_link_nodes_for_node_in_mt", "DO-SBHL-CACHED-LINK-NODES-FOR-NODE-IN-MT");
    //declareMacro(myName, "do_sbhl_cached_all_mts_relations_for_node", "DO-SBHL-CACHED-ALL-MTS-RELATIONS-FOR-NODE");
    //declareFunction(myName, "initialize_sbhl_caches", "INITIALIZE-SBHL-CACHES", 0, 0, false);
    //declareFunction(myName, "initialize_all_mts_sbhl_caches", "INITIALIZE-ALL-MTS-SBHL-CACHES", 0, 0, false);
    //declareFunction(myName, "new_sbhl_cache", "NEW-SBHL-CACHE", 0, 0, false);
    //declareFunction(myName, "new_sbhl_sub_cache", "NEW-SBHL-SUB-CACHE", 0, 0, false);
    //declareFunction(myName, "initialize_implicit_fort_type_mapping", "INITIALIZE-IMPLICIT-FORT-TYPE-MAPPING", 0, 0, false);
    //declareFunction(myName, "initialize_all_sbhl_caching", "INITIALIZE-ALL-SBHL-CACHING", 0, 0, false);
    //declareFunction(myName, "initialize_all_mts_caching_for_pred", "INITIALIZE-ALL-MTS-CACHING-FOR-PRED", 1, 0, false);
    //declareFunction(myName, "compute_sbhl_cache_from_all_mts_cache", "COMPUTE-SBHL-CACHE-FROM-ALL-MTS-CACHE", 1, 0, false);
    //declareFunction(myName, "extend_sbhl_caches", "EXTEND-SBHL-CACHES", 4, 0, false);
    declareFunction(myName, "add_to_sbhl_cache", "ADD-TO-SBHL-CACHE", 4, 0, false);
    //declareFunction(myName, "add_to_sbhl_cache_for_relevant_mts", "ADD-TO-SBHL-CACHE-FOR-RELEVANT-MTS", 3, 0, false);
    declareFunction(myName, "add_to_sbhl_all_mts_cache", "ADD-TO-SBHL-ALL-MTS-CACHE", 3, 0, false);
    declareFunction(myName, "sbhl_cache_addition_maintainence", "SBHL-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
    declareFunction(myName, "possibly_add_to_sbhl_caches", "POSSIBLY-ADD-TO-SBHL-CACHES", 3, 0, false);
    //declareFunction(myName, "retract_cached_relation", "RETRACT-CACHED-RELATION", 4, 0, false);
    declareFunction(myName, "retract_from_sbhl_cache", "RETRACT-FROM-SBHL-CACHE", 4, 0, false);
    declareFunction(myName, "retract_from_sbhl_all_mts_cache", "RETRACT-FROM-SBHL-ALL-MTS-CACHE", 3, 0, false);
    declareFunction(myName, "sbhl_cache_removal_maintainence", "SBHL-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
    declareFunction(myName, "possibly_remove_from_sbhl_caches", "POSSIBLY-REMOVE-FROM-SBHL-CACHES", 2, 0, false);
    declareFunction(myName, "recache_sbhl_cachesP", "RECACHE-SBHL-CACHES?", 0, 0, false);
    //declareFunction(myName, "already_in_sbhl_caches_p", "ALREADY-IN-SBHL-CACHES-P", 4, 0, false);
    declareFunction(myName, "sbhl_predicate_relation_to_which_cached_nodes", "SBHL-PREDICATE-RELATION-TO-WHICH-CACHED-NODES", 3, 0, false);
    declareFunction(myName, "sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node", "SBHL-PREDICATE-RELATION-TO-WHICH-CACHED-NODES-EXCLUDING-LINK-NODE", 4, 0, false);
    //declareFunction(myName, "clear_sbhl_cached_all_mts_relations_for_node", "CLEAR-SBHL-CACHED-ALL-MTS-RELATIONS-FOR-NODE", 2, 0, false);
    //declareFunction(myName, "clear_sbhl_cached_relations_for_node", "CLEAR-SBHL-CACHED-RELATIONS-FOR-NODE", 2, 0, false);
    //declareFunction(myName, "reset_cached_sbhl_relations_for_node", "RESET-CACHED-SBHL-RELATIONS-FOR-NODE", 2, 1, false);
    //declareFunction(myName, "initialize_all_mts_cache_for_genl_preds_and_inverse", "INITIALIZE-ALL-MTS-CACHE-FOR-GENL-PREDS-AND-INVERSE", 0, 0, false);
    //declareFunction(myName, "compute_cached_predicates_from_all_mts_cache", "COMPUTE-CACHED-PREDICATES-FROM-ALL-MTS-CACHE", 0, 0, false);
    //declareFunction(myName, "compute_cached_inverses_from_all_mts_cache", "COMPUTE-CACHED-INVERSES-FROM-ALL-MTS-CACHE", 0, 0, false);
    declareFunction(myName, "sbhl_genl_preds_cache_addition_maintainence", "SBHL-GENL-PREDS-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
    declareFunction(myName, "sbhl_genl_preds_cache_removal_maintainence", "SBHL-GENL-PREDS-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
    //declareFunction(myName, "reset_cached_spec_preds_and_spec_inverses", "RESET-CACHED-SPEC-PREDS-AND-SPEC-INVERSES", 1, 0, false);
    //declareFunction(myName, "reset_cached_genl_pred_and_inverse_relations", "RESET-CACHED-GENL-PRED-AND-INVERSE-RELATIONS", 1, 0, false);
    //declareFunction(myName, "initialize_all_mts_cache_for_genls", "INITIALIZE-ALL-MTS-CACHE-FOR-GENLS", 0, 0, false);
    //declareFunction(myName, "compute_cached_genls_from_all_mts_cache", "COMPUTE-CACHED-GENLS-FROM-ALL-MTS-CACHE", 0, 0, false);
    declareFunction(myName, "genls_cache_addition_maintainence", "GENLS-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
    declareFunction(myName, "genls_cache_removal_maintainence", "GENLS-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
    //declareFunction(myName, "reset_sbhl_types_of_all_instances", "RESET-SBHL-TYPES-OF-ALL-INSTANCES", 1, 0, false);
    //declareFunction(myName, "reset_cached_genls_of_all_specs", "RESET-CACHED-GENLS-OF-ALL-SPECS", 1, 0, false);
    //declareFunction(myName, "reset_cached_genls_relations", "RESET-CACHED-GENLS-RELATIONS", 1, 0, false);
    //declareFunction(myName, "initialize_all_mts_cache_for_isa", "INITIALIZE-ALL-MTS-CACHE-FOR-ISA", 0, 0, false);
    //declareFunction(myName, "compute_cached_isas_from_all_mts_cache", "COMPUTE-CACHED-ISAS-FROM-ALL-MTS-CACHE", 0, 0, false);
    declareFunction(myName, "isa_cache_addition_maintainence", "ISA-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
    declareFunction(myName, "isa_cache_removal_maintainence", "ISA-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
    //declareFunction(myName, "reset_cached_isa_relations", "RESET-CACHED-ISA-RELATIONS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_cache_file() {
    $sbhl_caches_initializedP$ = deflexical("*SBHL-CACHES-INITIALIZED?*", ((NIL != Symbols.boundp($sym0$_SBHL_CACHES_INITIALIZED__)) ? ((SubLObject) $sbhl_caches_initializedP$.getGlobalValue()) : NIL));
    $cached_genl_predicates$ = deflexical("*CACHED-GENL-PREDICATES*", ((NIL != Symbols.boundp($sym1$_CACHED_GENL_PREDICATES_)) ? ((SubLObject) $cached_genl_predicates$.getGlobalValue()) : $list2));
    $cached_genl_predicates_set$ = deflexical("*CACHED-GENL-PREDICATES-SET*", ((NIL != Symbols.boundp($sym3$_CACHED_GENL_PREDICATES_SET_)) ? ((SubLObject) $cached_genl_predicates_set$.getGlobalValue()) : set_utilities.construct_set_from_list($cached_genl_predicates$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED)));
    $genl_predicate_cache$ = deflexical("*GENL-PREDICATE-CACHE*", ((NIL != Symbols.boundp($sym4$_GENL_PREDICATE_CACHE_)) ? ((SubLObject) $genl_predicate_cache$.getGlobalValue()) : NIL));
    $genl_inverse_cache$ = deflexical("*GENL-INVERSE-CACHE*", ((NIL != Symbols.boundp($sym5$_GENL_INVERSE_CACHE_)) ? ((SubLObject) $genl_inverse_cache$.getGlobalValue()) : NIL));
    $all_mts_genl_predicate_cache$ = deflexical("*ALL-MTS-GENL-PREDICATE-CACHE*", ((NIL != Symbols.boundp($sym6$_ALL_MTS_GENL_PREDICATE_CACHE_)) ? ((SubLObject) $all_mts_genl_predicate_cache$.getGlobalValue()) : NIL));
    $all_mts_genl_inverse_cache$ = deflexical("*ALL-MTS-GENL-INVERSE-CACHE*", ((NIL != Symbols.boundp($sym7$_ALL_MTS_GENL_INVERSE_CACHE_)) ? ((SubLObject) $all_mts_genl_inverse_cache$.getGlobalValue()) : NIL));
    $cached_genls$ = deflexical("*CACHED-GENLS*", ((NIL != Symbols.boundp($sym8$_CACHED_GENLS_)) ? ((SubLObject) $cached_genls$.getGlobalValue()) : $list9));
    $cached_genls_set$ = deflexical("*CACHED-GENLS-SET*", ((NIL != Symbols.boundp($sym10$_CACHED_GENLS_SET_)) ? ((SubLObject) $cached_genls_set$.getGlobalValue()) : set_utilities.construct_set_from_list($cached_genls$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED)));
    $genls_cache$ = deflexical("*GENLS-CACHE*", ((NIL != Symbols.boundp($sym11$_GENLS_CACHE_)) ? ((SubLObject) $genls_cache$.getGlobalValue()) : NIL));
    $all_mts_genls_cache$ = deflexical("*ALL-MTS-GENLS-CACHE*", ((NIL != Symbols.boundp($sym12$_ALL_MTS_GENLS_CACHE_)) ? ((SubLObject) $all_mts_genls_cache$.getGlobalValue()) : NIL));
    $definitional_fort_typing_collections$ = defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", $list13);
    $additional_fort_typing_collections$ = deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", ((NIL != Symbols.boundp($sym14$_ADDITIONAL_FORT_TYPING_COLLECTIONS_)) ? ((SubLObject) $additional_fort_typing_collections$.getGlobalValue()) : $list15));
    $implicit_fort_typing_collections$ = deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", ((NIL != Symbols.boundp($sym16$_IMPLICIT_FORT_TYPING_COLLECTIONS_)) ? ((SubLObject) $implicit_fort_typing_collections$.getGlobalValue()) : $list17));
    $cached_isas$ = deflexical("*CACHED-ISAS*", ((NIL != Symbols.boundp($sym18$_CACHED_ISAS_)) ? ((SubLObject) $cached_isas$.getGlobalValue()) : ConsesLow.append($definitional_fort_typing_collections$.getGlobalValue(), $additional_fort_typing_collections$.getGlobalValue(), $implicit_fort_typing_collections$.getGlobalValue())));
    $cached_isas_set$ = deflexical("*CACHED-ISAS-SET*", ((NIL != Symbols.boundp($sym19$_CACHED_ISAS_SET_)) ? ((SubLObject) $cached_isas_set$.getGlobalValue()) : set_utilities.construct_set_from_list($cached_isas$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED)));
    $isa_cache$ = deflexical("*ISA-CACHE*", ((NIL != Symbols.boundp($sym21$_ISA_CACHE_)) ? ((SubLObject) $isa_cache$.getGlobalValue()) : NIL));
    $implicit_fort_type_mapping$ = deflexical("*IMPLICIT-FORT-TYPE-MAPPING*", ((NIL != Symbols.boundp($sym22$_IMPLICIT_FORT_TYPE_MAPPING_)) ? ((SubLObject) $implicit_fort_type_mapping$.getGlobalValue()) : NIL));
    $all_mts_isa_cache$ = deflexical("*ALL-MTS-ISA-CACHE*", ((NIL != Symbols.boundp($sym23$_ALL_MTS_ISA_CACHE_)) ? ((SubLObject) $all_mts_isa_cache$.getGlobalValue()) : NIL));
    $cached_preds$ = deflexical("*CACHED-PREDS*", ((NIL != Symbols.boundp($sym24$_CACHED_PREDS_)) ? ((SubLObject) $cached_preds$.getGlobalValue()) : $list25));
    return NIL;
  }

  public static final SubLObject setup_sbhl_cache_file() {
    // CVS_ID("Id: sbhl-cache.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_SBHL_CACHES_INITIALIZED__);
    subl_macro_promotions.declare_defglobal($sym1$_CACHED_GENL_PREDICATES_);
    subl_macro_promotions.declare_defglobal($sym3$_CACHED_GENL_PREDICATES_SET_);
    subl_macro_promotions.declare_defglobal($sym4$_GENL_PREDICATE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym5$_GENL_INVERSE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym6$_ALL_MTS_GENL_PREDICATE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym7$_ALL_MTS_GENL_INVERSE_CACHE_);
    subl_macro_promotions.declare_defglobal($sym8$_CACHED_GENLS_);
    subl_macro_promotions.declare_defglobal($sym10$_CACHED_GENLS_SET_);
    subl_macro_promotions.declare_defglobal($sym11$_GENLS_CACHE_);
    subl_macro_promotions.declare_defglobal($sym12$_ALL_MTS_GENLS_CACHE_);
    subl_macro_promotions.declare_defglobal($sym14$_ADDITIONAL_FORT_TYPING_COLLECTIONS_);
    subl_macro_promotions.declare_defglobal($sym16$_IMPLICIT_FORT_TYPING_COLLECTIONS_);
    subl_macro_promotions.declare_defglobal($sym18$_CACHED_ISAS_);
    subl_macro_promotions.declare_defglobal($sym19$_CACHED_ISAS_SET_);
    subl_macro_promotions.declare_defglobal($sym21$_ISA_CACHE_);
    subl_macro_promotions.declare_defglobal($sym22$_IMPLICIT_FORT_TYPE_MAPPING_);
    subl_macro_promotions.declare_defglobal($sym23$_ALL_MTS_ISA_CACHE_);
    subl_macro_promotions.declare_defglobal($sym24$_CACHED_PREDS_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_SBHL_CACHES_INITIALIZED__ = makeSymbol("*SBHL-CACHES-INITIALIZED?*");
  public static final SubLSymbol $sym1$_CACHED_GENL_PREDICATES_ = makeSymbol("*CACHED-GENL-PREDICATES*");
  public static final SubLList $list2 = list(constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated")));
  public static final SubLSymbol $sym3$_CACHED_GENL_PREDICATES_SET_ = makeSymbol("*CACHED-GENL-PREDICATES-SET*");
  public static final SubLSymbol $sym4$_GENL_PREDICATE_CACHE_ = makeSymbol("*GENL-PREDICATE-CACHE*");
  public static final SubLSymbol $sym5$_GENL_INVERSE_CACHE_ = makeSymbol("*GENL-INVERSE-CACHE*");
  public static final SubLSymbol $sym6$_ALL_MTS_GENL_PREDICATE_CACHE_ = makeSymbol("*ALL-MTS-GENL-PREDICATE-CACHE*");
  public static final SubLSymbol $sym7$_ALL_MTS_GENL_INVERSE_CACHE_ = makeSymbol("*ALL-MTS-GENL-INVERSE-CACHE*");
  public static final SubLSymbol $sym8$_CACHED_GENLS_ = makeSymbol("*CACHED-GENLS*");
  public static final SubLList $list9 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("CycLExpression")), constant_handles.reader_make_constant_shell(makeString("CycLFormula")), constant_handles.reader_make_constant_shell(makeString("CycLIndexedTerm")), constant_handles.reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm")), constant_handles.reader_make_constant_shell(makeString("CycLSentence")), constant_handles.reader_make_constant_shell(makeString("CycLSentence-Askable")), constant_handles.reader_make_constant_shell(makeString("CycLSentence-Assertible")), constant_handles.reader_make_constant_shell(makeString("GenericArgTemplate")), constant_handles.reader_make_constant_shell(makeString("KeywordVariableTemplate")), constant_handles.reader_make_constant_shell(makeString("Microtheory")), constant_handles.reader_make_constant_shell(makeString("SubLList"))});
  public static final SubLSymbol $sym10$_CACHED_GENLS_SET_ = makeSymbol("*CACHED-GENLS-SET*");
  public static final SubLSymbol $sym11$_GENLS_CACHE_ = makeSymbol("*GENLS-CACHE*");
  public static final SubLSymbol $sym12$_ALL_MTS_GENLS_CACHE_ = makeSymbol("*ALL-MTS-GENLS-CACHE*");
  public static final SubLList $list13 = list(constant_handles.reader_make_constant_shell(makeString("Collection")), constant_handles.reader_make_constant_shell(makeString("Predicate")), constant_handles.reader_make_constant_shell(makeString("Function-Denotational")), constant_handles.reader_make_constant_shell(makeString("Microtheory")));
  public static final SubLSymbol $sym14$_ADDITIONAL_FORT_TYPING_COLLECTIONS_ = makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*");
  public static final SubLList $list15 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("AntiTransitiveBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("ArgTypeBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("ArgTypeTernaryPredicate")), constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("BookkeepingPredicate")), constant_handles.reader_make_constant_shell(makeString("BroadMicrotheory")), constant_handles.reader_make_constant_shell(makeString("CommutativeRelation")), constant_handles.reader_make_constant_shell(makeString("DistributingMetaKnowledgePredicate")), constant_handles.reader_make_constant_shell(makeString("DocumentationPredicate")), constant_handles.reader_make_constant_shell(makeString("ELRelation")), constant_handles.reader_make_constant_shell(makeString("EvaluatableFunction")), constant_handles.reader_make_constant_shell(makeString("EvaluatablePredicate")), constant_handles.reader_make_constant_shell(makeString("ExistentialQuantifier")), constant_handles.reader_make_constant_shell(makeString("ExistentialQuantifier-Bounded")), constant_handles.reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("LogicalConnective")), constant_handles.reader_make_constant_shell(makeString("MicrotheoryDesignatingRelation")), constant_handles.reader_make_constant_shell(makeString("NLDefinitenessAttribute")), constant_handles.reader_make_constant_shell(makeString("NLQuantAttribute")), constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativeRelation")), constant_handles.reader_make_constant_shell(makeString("ProblemSolvingCntxt")), constant_handles.reader_make_constant_shell(makeString("Quantifier")), constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("ReifiableFunction")), constant_handles.reader_make_constant_shell(makeString("RuleMacroPredicate")), constant_handles.reader_make_constant_shell(makeString("SKSIContentMicrotheory")), constant_handles.reader_make_constant_shell(makeString("SKSIExternalTermDenotingFunction")), constant_handles.reader_make_constant_shell(makeString("SKSISupportedComparisonPredicate")), constant_handles.reader_make_constant_shell(makeString("SKSISupportedFunction")), constant_handles.reader_make_constant_shell(makeString("SKSISupportedConstant")), constant_handles.reader_make_constant_shell(makeString("CSQLComparisonPredicate")), constant_handles.reader_make_constant_shell(makeString("CSQLFunction")), constant_handles.reader_make_constant_shell(makeString("CSQLConstantFunction")), constant_handles.reader_make_constant_shell(makeString("CSQLLogicalConnective")), constant_handles.reader_make_constant_shell(makeString("CSQLQuantifier")), constant_handles.reader_make_constant_shell(makeString("ScopingRelation")), constant_handles.reader_make_constant_shell(makeString("SiblingDisjointCollectionType")), constant_handles.reader_make_constant_shell(makeString("SkolemFunction")), constant_handles.reader_make_constant_shell(makeString("SpeechPart")), constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate")), constant_handles.reader_make_constant_shell(makeString("TruthFunction")), constant_handles.reader_make_constant_shell(makeString("VariableArityRelation"))});
  public static final SubLSymbol $sym16$_IMPLICIT_FORT_TYPING_COLLECTIONS_ = makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*");
  public static final SubLList $list17 = list(constant_handles.reader_make_constant_shell(makeString("Relation")));
  public static final SubLSymbol $sym18$_CACHED_ISAS_ = makeSymbol("*CACHED-ISAS*");
  public static final SubLSymbol $sym19$_CACHED_ISAS_SET_ = makeSymbol("*CACHED-ISAS-SET*");
  public static final SubLObject $const20$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym21$_ISA_CACHE_ = makeSymbol("*ISA-CACHE*");
  public static final SubLSymbol $sym22$_IMPLICIT_FORT_TYPE_MAPPING_ = makeSymbol("*IMPLICIT-FORT-TYPE-MAPPING*");
  public static final SubLSymbol $sym23$_ALL_MTS_ISA_CACHE_ = makeSymbol("*ALL-MTS-ISA-CACHE*");
  public static final SubLSymbol $sym24$_CACHED_PREDS_ = makeSymbol("*CACHED-PREDS*");
  public static final SubLList $list25 = list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")));
  public static final SubLList $list26 = list(list(makeSymbol("NODE-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym27$DO_SET = makeSymbol("DO-SET");
  public static final SubLSymbol $sym28$GET_CACHED_NODES_SET_FOR_PRED = makeSymbol("GET-CACHED-NODES-SET-FOR-PRED");
  public static final SubLObject $const29$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const30$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const31$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym32$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym33$SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");
  public static final SubLList $list34 = list(list(makeSymbol("CACHED-NODE-VAR"), makeSymbol("MTS-VAR"), makeSymbol("SUBNODE"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$SUBNODES_VAR = makeUninternedSymbol("SUBNODES-VAR");
  public static final SubLSymbol $sym36$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym37$GET_SBHL_CACHE_FOR_PRED = makeSymbol("GET-SBHL-CACHE-FOR-PRED");
  public static final SubLSymbol $sym38$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym39$DICTIONARY_P = makeSymbol("DICTIONARY-P");
  public static final SubLSymbol $sym40$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym41$DICTIONARY_LOOKUP = makeSymbol("DICTIONARY-LOOKUP");
  public static final SubLSymbol $sym42$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLString $str43$All_Mts_cache_is_missing_for__A_ = makeString("All Mts cache is missing for ~A.");
  public static final SubLList $list44 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("SUBNODE-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym45$SUBNODES = makeUninternedSymbol("SUBNODES");
  public static final SubLSymbol $sym46$NODES = makeUninternedSymbol("NODES");
  public static final SubLSymbol $sym47$CACHE = makeUninternedSymbol("CACHE");
  public static final SubLSymbol $sym48$GET_SBHL_ALL_MTS_CACHE_FOR_PRED = makeSymbol("GET-SBHL-ALL-MTS-CACHE-FOR-PRED");
  public static final SubLSymbol $sym49$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym50$FORT_ID_INDEX_P = makeSymbol("FORT-ID-INDEX-P");
  public static final SubLSymbol $sym51$DO_FORT_ID_INDEX = makeSymbol("DO-FORT-ID-INDEX");
  public static final SubLList $list52 = list(list(makeSymbol("CACHED-LINK-NODE"), makeSymbol("PRED"), makeSymbol("SUBNODE"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym53$CACHE = makeUninternedSymbol("CACHE");
  public static final SubLSymbol $sym54$CACHED_NODES_STORE = makeUninternedSymbol("CACHED-NODES-STORE");
  public static final SubLSymbol $sym55$MEMBER_ = makeSymbol("MEMBER?");
  public static final SubLList $list56 = list(list(makeSymbol("CACHED-LINK-NODE"), makeSymbol("PRED"), makeSymbol("SUBNODE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym57$CACHE = makeUninternedSymbol("CACHE");
  public static final SubLSymbol $sym58$SUBNODES = makeUninternedSymbol("SUBNODES");
  public static final SubLSymbol $sym59$SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P = makeSymbol("SBHL-PRED-ALL-MTS-CACHE-USES-ID-INDEX-P");
  public static final SubLSymbol $sym60$SBHL_ID_INDEX_LOOKUP = makeSymbol("SBHL-ID-INDEX-LOOKUP");
  public static final SubLSymbol $sym61$SET_MEMBER_ = makeSymbol("SET-MEMBER?");
  public static final SubLList $list62 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("isa")));
  public static final SubLObject $const63$Relation = constant_handles.reader_make_constant_shell(makeString("Relation"));
  public static final SubLObject $const64$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));
  public static final SubLObject $const65$Function_Denotational = constant_handles.reader_make_constant_shell(makeString("Function-Denotational"));
  public static final SubLObject $const66$LogicalConnective = constant_handles.reader_make_constant_shell(makeString("LogicalConnective"));
  public static final SubLObject $const67$Quantifier = constant_handles.reader_make_constant_shell(makeString("Quantifier"));
  public static final SubLSymbol $sym68$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const69$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLList $list70 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("isa")));
  public static final SubLString $str71$Computing_all_mts_SBHL_caches_ = makeString("Computing all-mts SBHL caches.");
  public static final SubLString $str72$Computing_SBHL_caches_from_all_mt = makeString("Computing SBHL caches from all-mts caches.");
  public static final SubLSymbol $kw73$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const74$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLSymbol $kw75$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw76$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw77$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym78$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw79$ERROR = makeKeyword("ERROR");
  public static final SubLString $str80$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym81$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw82$CERROR = makeKeyword("CERROR");
  public static final SubLString $str83$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw84$WARN = makeKeyword("WARN");
  public static final SubLString $str85$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str86$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str87$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw88$SKIP = makeKeyword("SKIP");
  public static final SubLString $str89$genlPreds___genlInverse_after_add = makeString("genlPreds / genlInverse after adding used for assertion with predicate ~a.");
  public static final SubLSymbol $sym90$RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS = makeSymbol("RESET-CACHED-GENL-PRED-AND-INVERSE-RELATIONS");
  public static final SubLSymbol $kw91$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $sym92$RESET_CACHED_ISA_RELATIONS = makeSymbol("RESET-CACHED-ISA-RELATIONS");
  public static final SubLSymbol $sym93$RESET_CACHED_GENLS_RELATIONS = makeSymbol("RESET-CACHED-GENLS-RELATIONS");
  public static final SubLList $list94 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_cache_file();
  }

  public void initializeVariables() {
    init_sbhl_cache_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_cache_file();
  }

}
