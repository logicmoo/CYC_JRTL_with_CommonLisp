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
import com.cyc.cycjava_1.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.isa;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class genl_mts extends SubLTranslatedFile {

  //// Constructor

  private genl_mts() {}
  public static final SubLFile me = new genl_mts();
  public static final String myName = "com.cyc.cycjava_1.cycl.genl_mts";

  //// Definitions

  /** returns all genls of microtheory <mt> 
   (ascending transitive closure; inexpensive) */
  @SubL(source = "cycl/genl-mts.lisp", position = 3220) 
  public static final SubLObject all_genl_mts(SubLObject mt, SubLObject mt_mt, SubLObject tv) {
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const0$genlMt), mt, mt_mt, tv);
  }

  /** is mt <genl> a genl-mt of <spec>?
   (ascending transitive search; inexpensive) */
  @SubL(source = "cycl/genl-mts.lisp", position = 8803) 
  public static final SubLObject genl_mtP(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return monad_genl_mtP(spec, genl, mt_mt, tv);
  }

  @SubL(source = "cycl/genl-mts.lisp", position = 9261) 
  public static final SubLObject proper_genl_mtP(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return makeBoolean(((NIL != genl_mtP(spec, genl, mt_mt, tv))
           && (NIL == genl_mtP(genl, spec, mt_mt, tv))));
  }

  /** is monad mt <genl> a genl-mt of <spec>?
   (ascending transitive search; inexpensive) */
  @SubL(source = "cycl/genl-mts.lisp", position = 9423) 
  public static final SubLObject monad_genl_mtP(SubLObject spec, SubLObject genl, SubLObject mt_mt, SubLObject tv) {
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym2$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const3$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const0$genlMt), spec, genl, mt_mt, tv);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/genl-mts.lisp", position = 15435) 
  private static SubLSymbol $all_base_mts_caching_state$ = null;

  @SubL(source = "cycl/genl-mts.lisp", position = 15435) 
  public static final SubLObject clear_all_base_mts() {
    {
      SubLObject cs = $all_base_mts_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  /** This controls whether or not MIN-MTS implements a special case for exactly 2 mts. */
  @SubL(source = "cycl/genl-mts.lisp", position = 15857) 
  public static SubLSymbol $min_mts_2_enabledP$ = null;

  /** the most-specific among microtheories <mts> */
  @SubL(source = "cycl/genl-mts.lisp", position = 16016) 
  public static final SubLObject min_mts(SubLObject mts, SubLObject mt_mt) {
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != mt_vars.$core_mt_optimization_enabledP$.getDynamicValue(thread))) {
        mts = mt_vars.minimize_mts_wrt_core(mts);
      }
      if ((NIL != $min_mts_2_enabledP$.getDynamicValue(thread))) {
        if ((NIL != list_utilities.doubletonP(mts))) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23011");
        }
      }
      return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($const0$genlMt), mts, mt_mt, UNPROVIDED);
    }
  }

  /** version of min-mts called inside max-floor-mts */
  @SubL(source = "cycl/genl-mts.lisp", position = 16422) 
  public static final SubLObject min_mts_before_floors(SubLObject mts, SubLObject mt_mt) {
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return min_mts(mts, mt_mt);
  }

  /** the most general common specializations among microtheories <mts>
   (if <candidates> is non-nil, then result is a subset of <candidates>) */
  @SubL(source = "cycl/genl-mts.lisp", position = 17994) 
  public static final SubLObject max_floor_mts(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return max_floor_monad_mts(mts, candidates, mt_mt);
  }

  @SubL(source = "cycl/genl-mts.lisp", position = 18715) 
  public static final SubLObject max_floor_monad_mts_internal(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
    return ((NIL != mts) ? ((SubLObject) sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($const0$genlMt), min_mts_before_floors(mts, mt_mt), candidates, mt_mt, UNPROVIDED, UNPROVIDED)) : NIL);
  }

  @SubL(source = "cycl/genl-mts.lisp", position = 18715) 
  public static final SubLObject max_floor_monad_mts(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return max_floor_monad_mts_internal(mts, candidates, mt_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym19$MAX_FLOOR_MONAD_MTS, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym19$MAX_FLOOR_MONAD_MTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym19$MAX_FLOOR_MONAD_MTS, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_3(mts, candidates, mt_mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw14$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (mts.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (candidates.equal(cached_args.first())) {
                      cached_args = cached_args.rest();
                      if (((NIL != cached_args)
                           && (NIL == cached_args.rest())
                           && mt_mt.equal(cached_args.first()))) {
                        return memoization_state.caching_results(results2);
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(max_floor_monad_mts_internal(mts, candidates, mt_mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(mts, candidates, mt_mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** the most general common specializations among microtheories <mt> such that only one node from any given cycle is returned. if CANDIDATES is non-nil, the result is a subset of CANDIDATES. */
  @SubL(source = "cycl/genl-mts.lisp", position = 18913) 
  public static final SubLObject max_floor_mts_with_cycles_pruned(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    if ((mt_mt == UNPROVIDED)) {
      mt_mt = mt_vars.$mt_mt$.getGlobalValue();
    }
    return max_floor_monad_mts_with_cycles_pruned(mts, candidates, mt_mt);
  }

  @SubL(source = "cycl/genl-mts.lisp", position = 19766) 
  public static final SubLObject max_floor_monad_mts_with_cycles_pruned(SubLObject mts, SubLObject candidates, SubLObject mt_mt) {
    return ((NIL != mts) ? ((SubLObject) sbhl_search_methods.sbhl_max_floors_pruning_cycles(sbhl_module_vars.get_sbhl_module($const0$genlMt), min_mts_before_floors(mts, mt_mt), candidates, mt_mt, UNPROVIDED)) : NIL);
  }

  @SubL(source = "cycl/genl-mts.lisp", position = 20452) 
  private static SubLSymbol $cached_max_floor_mts_from_mt_sets_caching_state$ = null;

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genl-mts.lisp", position = 23397) 
  public static final SubLObject add_base_mt(SubLObject source, SubLObject assertion) {
    return add_genl_mt(source, assertion);
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genl-mts.lisp", position = 23709) 
  public static final SubLObject add_genl_mt(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const0$genlMt));
    after_adding_modules.clear_mt_dependent_caches(source, assertion);
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genl-mts.lisp", position = 24004) 
  public static final SubLObject remove_base_mt(SubLObject source, SubLObject assertion) {
    return remove_genl_mt(source, assertion);
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genl-mts.lisp", position = 24231) 
  public static final SubLObject remove_genl_mt(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($const0$genlMt));
    return NIL;
  }

  public static final SubLObject declare_genl_mts_file() {
    declareFunction(myName, "genl_mts", "GENL-MTS", 1, 2, false);
    declareFunction(myName, "min_genl_mts", "MIN-GENL-MTS", 1, 2, false);
    declareFunction(myName, "not_genl_mts", "NOT-GENL-MTS", 1, 2, false);
    declareFunction(myName, "max_not_genl_mts", "MAX-NOT-GENL-MTS", 1, 2, false);
    declareFunction(myName, "spec_mts", "SPEC-MTS", 1, 2, false);
    declareFunction(myName, "leaf_mtP", "LEAF-MT?", 1, 2, false);
    declareFunction(myName, "max_spec_mts", "MAX-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "not_spec_mts", "NOT-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "min_not_spec_mts", "MIN-NOT-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "genl_mt_siblings", "GENL-MT-SIBLINGS", 1, 2, false);
    declareFunction(myName, "spec_mt_siblings", "SPEC-MT-SIBLINGS", 1, 2, false);
    declareFunction(myName, "all_genl_mts", "ALL-GENL-MTS", 1, 2, false);
    declareFunction(myName, "all_spec_mts", "ALL-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "all_proper_genl_mts", "ALL-PROPER-GENL-MTS", 1, 2, false);
    declareFunction(myName, "all_proper_spec_mts", "ALL-PROPER-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "random_genl_mt", "RANDOM-GENL-MT", 1, 2, false);
    declareFunction(myName, "random_spec_mt", "RANDOM-SPEC-MT", 1, 2, false);
    declareFunction(myName, "random_proper_genl_mt", "RANDOM-PROPER-GENL-MT", 1, 2, false);
    declareFunction(myName, "random_proper_spec_mt", "RANDOM-PROPER-SPEC-MT", 1, 2, false);
    declareFunction(myName, "all_not_genl_mts", "ALL-NOT-GENL-MTS", 1, 2, false);
    declareFunction(myName, "all_not_spec_mts", "ALL-NOT-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "all_genl_mts_between", "ALL-GENL-MTS-BETWEEN", 2, 2, false);
    declareFunction(myName, "union_all_genl_mts", "UNION-ALL-GENL-MTS", 1, 2, false);
    declareFunction(myName, "union_all_spec_mts", "UNION-ALL-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "all_dependent_spec_mts", "ALL-DEPENDENT-SPEC-MTS", 1, 2, false);
    declareFunction(myName, "all_genl_mts_among", "ALL-GENL-MTS-AMONG", 2, 2, false);
    declareFunction(myName, "all_spec_mts_among", "ALL-SPEC-MTS-AMONG", 2, 2, false);
    declareFunction(myName, "selected_genl_mts", "SELECTED-GENL-MTS", 2, 2, false);
    declareFunction(myName, "all_genl_mts_if", "ALL-GENL-MTS-IF", 2, 2, false);
    declareFunction(myName, "all_spec_mts_if", "ALL-SPEC-MTS-IF", 2, 2, false);
    declareFunction(myName, "map_all_genl_mts", "MAP-ALL-GENL-MTS", 2, 2, false);
    declareFunction(myName, "map_all_spec_mts", "MAP-ALL-SPEC-MTS", 2, 2, false);
    declareFunction(myName, "map_union_all_genl_mts", "MAP-UNION-ALL-GENL-MTS", 2, 2, false);
    declareFunction(myName, "map_all_genl_mts_of_all", "MAP-ALL-GENL-MTS-OF-ALL", 2, 2, false);
    declareFunction(myName, "map_union_all_spec_mts", "MAP-UNION-ALL-SPEC-MTS", 2, 2, false);
    declareFunction(myName, "map_all_spec_mts_of_all", "MAP-ALL-SPEC-MTS-OF-ALL", 2, 2, false);
    declareFunction(myName, "genl_mtP", "GENL-MT?", 2, 2, false);
    declareFunction(myName, "proper_genl_mtP", "PROPER-GENL-MT?", 2, 2, false);
    declareFunction(myName, "monad_genl_mtP", "MONAD-GENL-MT?", 2, 2, false);
    declareFunction(myName, "spec_mtP", "SPEC-MT?", 2, 1, false);
    declareFunction(myName, "genl_mt_ofP", "GENL-MT-OF?", 2, 2, false);
    declareFunction(myName, "any_genl_mtP", "ANY-GENL-MT?", 2, 2, false);
    declareFunction(myName, "genl_mt_of_anyP", "GENL-MT-OF-ANY?", 2, 2, false);
    declareFunction(myName, "all_genl_mtP", "ALL-GENL-MT?", 2, 2, false);
    declareFunction(myName, "genl_mt_of_allP", "GENL-MT-OF-ALL?", 2, 2, false);
    declareFunction(myName, "any_genl_mt_of_anyP", "ANY-GENL-MT-OF-ANY?", 2, 2, false);
    declareFunction(myName, "not_genl_mtP", "NOT-GENL-MT?", 2, 2, false);
    declareFunction(myName, "argue_not_genl_mtP", "ARGUE-NOT-GENL-MT?", 2, 2, false);
    declareFunction(myName, "not_spec_mtP", "NOT-SPEC-MT?", 2, 2, false);
    declareFunction(myName, "not_any_genl_mtP", "NOT-ANY-GENL-MT?", 2, 2, false);
    declareFunction(myName, "mts_intersectP", "MTS-INTERSECT?", 2, 1, false);
    declareFunction(myName, "mts_explicitly_intersectP", "MTS-EXPLICITLY-INTERSECT?", 2, 1, false);
    declareFunction(myName, "why_genl_mtP", "WHY-GENL-MT?", 2, 3, false);
    declareFunction(myName, "why_monad_genl_mtP", "WHY-MONAD-GENL-MT?", 2, 3, false);
    declareFunction(myName, "any_just_of_genl_mt", "ANY-JUST-OF-GENL-MT", 2, 1, false);
    declareFunction(myName, "why_not_genl_mtP", "WHY-NOT-GENL-MT?", 2, 3, false);
    declareFunction(myName, "any_just_of_not_genl_mt", "ANY-JUST-OF-NOT-GENL-MT", 2, 1, false);
    declareFunction(myName, "clear_all_base_mts", "CLEAR-ALL-BASE-MTS", 0, 0, false);
    declareFunction(myName, "remove_all_base_mts", "REMOVE-ALL-BASE-MTS", 1, 0, false);
    declareFunction(myName, "all_base_mts_internal", "ALL-BASE-MTS-INTERNAL", 1, 0, false);
    declareFunction(myName, "all_base_mts", "ALL-BASE-MTS", 1, 0, false);
    declareMacro(myName, "do_base_mts", "DO-BASE-MTS");
    declareFunction(myName, "min_mts", "MIN-MTS", 1, 1, false);
    declareFunction(myName, "min_mts_before_floors", "MIN-MTS-BEFORE-FLOORS", 1, 1, false);
    declareFunction(myName, "min_mts_2", "MIN-MTS-2", 2, 1, false);
    declareFunction(myName, "max_mts", "MAX-MTS", 1, 1, false);
    declareFunction(myName, "max_mts_before_ceiling", "MAX-MTS-BEFORE-CEILING", 1, 1, false);
    declareFunction(myName, "min_ceiling_mts", "MIN-CEILING-MTS", 1, 2, false);
    declareFunction(myName, "max_floor_mts", "MAX-FLOOR-MTS", 1, 2, false);
    declareFunction(myName, "max_floor_monad_mts_internal", "MAX-FLOOR-MONAD-MTS-INTERNAL", 3, 0, false);
    declareFunction(myName, "max_floor_monad_mts", "MAX-FLOOR-MONAD-MTS", 3, 0, false);
    declareFunction(myName, "max_floor_mts_with_cycles_pruned", "MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 2, false);
    declareFunction(myName, "max_floor_monad_mts_with_cycles_pruned", "MAX-FLOOR-MONAD-MTS-WITH-CYCLES-PRUNED", 3, 0, false);
    declareFunction(myName, "max_floor_mts_from_mt_sets", "MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false);
    declareFunction(myName, "clear_cached_max_floor_mts_from_mt_sets", "CLEAR-CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 0, 0, false);
    declareFunction(myName, "remove_cached_max_floor_mts_from_mt_sets", "REMOVE-CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false);
    declareFunction(myName, "cached_max_floor_mts_from_mt_sets_internal", "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-INTERNAL", 1, 0, false);
    declareFunction(myName, "cached_max_floor_mts_from_mt_sets", "CACHED-MAX-FLOOR-MTS-FROM-MT-SETS", 1, 0, false);
    declareFunction(myName, "max_floor_mts_of_genl_mt_paths", "MAX-FLOOR-MTS-OF-GENL-MT-PATHS", 2, 0, false);
    declareFunction(myName, "genl_mt_mts", "GENL-MT-MTS", 1, 0, false);
    declareFunction(myName, "asserted_genl_mtsP", "ASSERTED-GENL-MTS?", 1, 1, false);
    declareFunction(myName, "asserted_genl_mts", "ASSERTED-GENL-MTS", 1, 1, false);
    declareFunction(myName, "genl_mts_from_asserted_assertions", "GENL-MTS-FROM-ASSERTED-ASSERTIONS", 1, 0, false);
    declareFunction(myName, "asserted_not_genl_mts", "ASSERTED-NOT-GENL-MTS", 1, 1, false);
    declareFunction(myName, "supported_genl_mts", "SUPPORTED-GENL-MTS", 1, 1, false);
    declareFunction(myName, "supported_not_genl_mts", "SUPPORTED-NOT-GENL-MTS", 1, 1, false);
    declareFunction(myName, "asserted_spec_mts", "ASSERTED-SPEC-MTS", 1, 1, false);
    declareFunction(myName, "asserted_not_spec_mts", "ASSERTED-NOT-SPEC-MTS", 1, 1, false);
    declareFunction(myName, "supported_spec_mts", "SUPPORTED-SPEC-MTS", 1, 1, false);
    declareFunction(myName, "supported_not_spec_mts", "SUPPORTED-NOT-SPEC-MTS", 1, 1, false);
    declareFunction(myName, "add_base_mt", "ADD-BASE-MT", 2, 0, false);
    declareFunction(myName, "add_genl_mt", "ADD-GENL-MT", 2, 0, false);
    declareFunction(myName, "remove_base_mt", "REMOVE-BASE-MT", 2, 0, false);
    declareFunction(myName, "remove_genl_mt", "REMOVE-GENL-MT", 2, 0, false);
    declareFunction(myName, "clear_mt_graph", "CLEAR-MT-GRAPH", 0, 0, false);
    declareFunction(myName, "clear_node_genl_mt_links", "CLEAR-NODE-GENL-MT-LINKS", 2, 0, false);
    declareFunction(myName, "reset_genl_mt_links", "RESET-GENL-MT-LINKS", 1, 1, false);
    declareFunction(myName, "reset_mts_links", "RESET-MTS-LINKS", 1, 1, false);
    declareFunction(myName, "reset_mts_links_in_mt", "RESET-MTS-LINKS-IN-MT", 2, 0, false);
    declareFunction(myName, "reset_mt_graph", "RESET-MT-GRAPH", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_genl_mts_file() {
    $all_base_mts_caching_state$ = deflexical("*ALL-BASE-MTS-CACHING-STATE*", NIL);
    $min_mts_2_enabledP$ = defvar("*MIN-MTS-2-ENABLED?*", NIL);
    $cached_max_floor_mts_from_mt_sets_caching_state$ = deflexical("*CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_genl_mts_file() {
    // CVS_ID("Id: genl-mts.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym6$ANY_GENL_MT_, $list7, $str8$_any_genl_mt__spec_genls__is_t_if, $list9, $list10);
    memoization_state.note_globally_cached_function($sym11$ALL_BASE_MTS);
    memoization_state.note_memoized_function($sym19$MAX_FLOOR_MONAD_MTS);
    memoization_state.note_globally_cached_function($sym22$CACHED_MAX_FLOOR_MTS_FROM_MT_SETS);
    utilities_macros.register_kb_function($sym27$ADD_BASE_MT);
    utilities_macros.register_kb_function($sym28$ADD_GENL_MT);
    utilities_macros.register_kb_function($sym29$REMOVE_BASE_MT);
    utilities_macros.register_kb_function($sym30$REMOVE_GENL_MT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLObject $const1$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLSymbol $sym2$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const3$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym4$EL_FORT_P = makeSymbol("EL-FORT-P");
  public static final SubLSymbol $sym5$CORE_MICROTHEORY_P = makeSymbol("CORE-MICROTHEORY-P");
  public static final SubLSymbol $sym6$ANY_GENL_MT_ = makeSymbol("ANY-GENL-MT?");
  public static final SubLList $list7 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT-MT"), makeSymbol("*MT-MT*")), makeSymbol("TV"));
  public static final SubLString $str8$_any_genl_mt__spec_genls__is_t_if = makeString("(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");
  public static final SubLList $list9 = list(list(makeSymbol("SPEC"), makeSymbol("EL-FORT-P")), list(makeSymbol("GENLS"), makeSymbol("EL-FORT-P")));
  public static final SubLList $list10 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym11$ALL_BASE_MTS = makeSymbol("ALL-BASE-MTS");
  public static final SubLSymbol $sym12$_ALL_BASE_MTS_CACHING_STATE_ = makeSymbol("*ALL-BASE-MTS-CACHING-STATE*");
  public static final SubLInteger $int13$1000 = makeInteger(1000);
  public static final SubLSymbol $kw14$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list15 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym16$BASE_MT = makeUninternedSymbol("BASE-MT");
  public static final SubLSymbol $sym17$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym18$WITH_MT = makeSymbol("WITH-MT");
  public static final SubLSymbol $sym19$MAX_FLOOR_MONAD_MTS = makeSymbol("MAX-FLOOR-MONAD-MTS");
  public static final SubLSymbol $sym20$UNION = makeSymbol("UNION");
  public static final SubLSymbol $sym21$MAX_FLOOR_MTS = makeSymbol("MAX-FLOOR-MTS");
  public static final SubLSymbol $sym22$CACHED_MAX_FLOOR_MTS_FROM_MT_SETS = makeSymbol("CACHED-MAX-FLOOR-MTS-FROM-MT-SETS");
  public static final SubLSymbol $sym23$_CACHED_MAX_FLOOR_MTS_FROM_MT_SETS_CACHING_STATE_ = makeSymbol("*CACHED-MAX-FLOOR-MTS-FROM-MT-SETS-CACHING-STATE*");
  public static final SubLInteger $int24$10000 = makeInteger(10000);
  public static final SubLSymbol $kw25$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw26$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym27$ADD_BASE_MT = makeSymbol("ADD-BASE-MT");
  public static final SubLSymbol $sym28$ADD_GENL_MT = makeSymbol("ADD-GENL-MT");
  public static final SubLSymbol $sym29$REMOVE_BASE_MT = makeSymbol("REMOVE-BASE-MT");
  public static final SubLSymbol $sym30$REMOVE_GENL_MT = makeSymbol("REMOVE-GENL-MT");

  //// Initializers

  public void declareFunctions() {
    declare_genl_mts_file();
  }

  public void initializeVariables() {
    init_genl_mts_file();
  }

  public void runTopLevelForms() {
    setup_genl_mts_file();
  }

}
