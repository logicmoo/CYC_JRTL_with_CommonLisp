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

package com.cyc.cycjava_1.cycl.sbhl;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.builder_utilities;
//dm import com.cyc.cycjava_1.cycl.cache_utilities;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.cfasl_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.dumper;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.integer_sequence_generator;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.map_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class sbhl_caching_policies extends SubLTranslatedFile {

  //// Constructor

  private sbhl_caching_policies() {}
  public static final SubLFile me = new sbhl_caching_policies();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_caching_policies";

  //// Definitions

  /** The current caching policies that are active for the respective caches. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 1103) 
  public static SubLSymbol $active_sbhl_caching_policies$ = null;

  /** The list of valid SBHL caching instruction action verbs. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 2695) 
  public static SubLSymbol $valid_sbhl_caching_instruction_verb$ = null;

  /** The list of the valid SBHL caching policy types. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 3837) 
  public static SubLSymbol $valid_sbhl_caching_policy_types$ = null;

  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 4353) 
  public static final SubLObject new_sbhl_caching_policy(SubLObject link_predicate, SubLObject policy_type, SubLObject capacity, SubLObject exemptions, SubLObject prefetch) {
    if ((capacity == UNPROVIDED)) {
      capacity = sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue();
    }
    if ((exemptions == UNPROVIDED)) {
      exemptions = NIL;
    }
    if ((prefetch == UNPROVIDED)) {
      prefetch = NIL;
    }
    checkType(policy_type, $sym3$VALID_SBHL_CACHING_POLICY_TYPE_P);
    {
      SubLObject policy = NIL;
      policy = conses_high.putf(policy, $kw4$LINK_PREDICATE, link_predicate);
      policy = conses_high.putf(policy, $kw5$POLICY, policy_type);
      policy = flesh_out_sbhl_caching_policy(policy, capacity, exemptions, prefetch);
      return policy;
    }
  }

  /** Interpret the arguments and see if they are sensible with respect to the policy. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 5018) 
  public static final SubLObject flesh_out_sbhl_caching_policy(SubLObject policy, SubLObject capacity, SubLObject exemptions, SubLObject prefetch) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject policy_type = conses_high.getf(policy, $kw5$POLICY, $kw6$UNKNOWN);
        SubLObject pcase_var = policy_type;
        if (pcase_var.eql($kw7$STICKY)) {
          if ((NIL == capacity)) {
            capacity = $kw8$UNDEFINED;
          }
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if (($kw8$UNDEFINED != capacity)) {
              Errors.error($str9$Sticky_policy_does_not_support_ca, capacity);
            }
          }
          policy = conses_high.putf(policy, $kw10$CAPACITY, capacity);
          if ((NIL == exemptions)) {
            exemptions = $kw11$ALL;
          }
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if (($kw11$ALL != exemptions)) {
              Errors.error($str12$Invalid_exemption_specification__, exemptions);
            }
          }
          policy = conses_high.putf(policy, $kw13$EXEMPT, exemptions);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!((($kw11$ALL == prefetch)
                  || (NIL != list_utilities.list_of_type_p($sym14$FORT_P, prefetch)))))) {
              Errors.error($str15$Invalid_prefetch_specification__A, prefetch);
            }
          }
          policy = conses_high.putf(policy, $kw16$PREFETCH, prefetch);
        } else if (pcase_var.eql($kw17$SWAPOUT)) {
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == subl_promotions.positive_integer_p(capacity))) {
              Errors.error($str18$Swapout_policy_does_not_support_c, capacity);
            }
          }
          policy = conses_high.putf(policy, $kw10$CAPACITY, capacity);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!((($kw11$ALL == exemptions)
                  || (NIL != list_utilities.list_of_type_p($sym14$FORT_P, exemptions)))))) {
              Errors.error($str19$Invalid_exemption_specification__, exemptions);
            }
          }
          policy = conses_high.putf(policy, $kw13$EXEMPT, exemptions);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == list_utilities.list_of_type_p($sym14$FORT_P, prefetch))) {
              Errors.error($str20$Invalid_prefetch_specification__A, prefetch);
            }
          }
          policy = conses_high.putf(policy, $kw16$PREFETCH, prefetch);
        } else {
          Errors.error($str21$Unknown_policy_type__A_____dont_k, policy);
        }
      }
      return policy;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7350) 
  public static final SubLObject get_sbhl_caching_policy_link_predicate(SubLObject policy) {
    return conses_high.getf(policy, $kw4$LINK_PREDICATE, UNPROVIDED);
  }

  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7457) 
  public static final SubLObject get_sbhl_caching_policy_type(SubLObject policy) {
    return conses_high.getf(policy, $kw5$POLICY, UNPROVIDED);
  }

  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 7855) 
  public static final SubLObject get_sbhl_caching_policy_terms_to_prefetch(SubLObject policy) {
    return conses_high.getf(policy, $kw16$PREFETCH, UNPROVIDED);
  }

  /** Implements the cache policy after having reset the existing 
   infrastructure relevant to the policy. 
   @return the policy */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 8082) 
  public static final SubLObject reset_sbhl_caching_policy(SubLObject policy) {
    {
      SubLObject predicate = get_sbhl_caching_policy_link_predicate(policy);
      SubLObject module = sbhl_module_vars.get_sbhl_module(predicate);
      sbhl_graphs.swap_out_all_pristine_graph_links(module);
      return implement_sbhl_caching_policy(policy);
    }
  }

  /** Apply the policy to the current caching infrastructure for the
   SBHL module, paging in whatever needs to be loaded, in the 
   fasion specified by the policy.
   @return the POLICY */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 8478) 
  public static final SubLObject implement_sbhl_caching_policy(SubLObject policy) {
    {
      SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
      SubLObject needs_to_releaseP = NIL;
      try {
        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
        {
          SubLObject predicate = get_sbhl_caching_policy_link_predicate(policy);
          SubLObject module = sbhl_module_vars.get_sbhl_module(predicate);
          SubLObject policy_type = get_sbhl_caching_policy_type(policy);
          SubLObject pcase_var = policy_type;
          if (pcase_var.eql($kw7$STICKY)) {
            sbhl_graphs.set_cache_strategy_for_sbhl_module(module, $kw22$DONT_CACHE);
          } else if (pcase_var.eql($kw17$SWAPOUT)) {
            {
              SubLObject capacity = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2357");
              SubLObject cache_strategy = sbhl_graphs.new_cache_strategy_for_sbhl_module(module, capacity);
              sbhl_graphs.set_cache_strategy_for_sbhl_module(module, cache_strategy);
            }
            seed_sbhl_module_graph_cache_with_nodes(module, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2358"), $kw23$TOUCH);
          } else {
            Errors.error($str24$Caching_policy_of_type__A_not_yet, policy_type);
          }
          seed_sbhl_module_graph_cache_with_nodes(module, get_sbhl_caching_policy_terms_to_prefetch(policy), UNPROVIDED);
          dictionary.dictionary_enter($active_sbhl_caching_policies$.getGlobalValue(), predicate, policy);
        }
      } finally {
        if ((NIL != needs_to_releaseP)) {
          ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
        }
      }
    }
    return policy;
  }

  /** @note this method ignores invalid fort types on its own
   @param nodes LIST-OF-TYPE-P FORT-P or :all */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 9902) 
  public static final SubLObject seed_sbhl_module_graph_cache_with_nodes(SubLObject module, SubLObject nodes, SubLObject touch_p) {
    if ((touch_p == UNPROVIDED)) {
      touch_p = NIL;
    }
    if ((NIL == nodes)) {
      return Values.values(module, ZERO_INTEGER, touch_p);
    }
    {
      SubLObject paged_in = ZERO_INTEGER;
      SubLObject term_list = nodes;
      if (($kw11$ALL == term_list)) {
        term_list = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2356");
      }
      {
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = NIL;
        for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
          if ((NIL != forts.valid_fortP(v_term))) {
            sbhl_graphs.get_sbhl_graph_link(v_term, module);
            paged_in = Numbers.add(paged_in, ONE_INTEGER);
            if ((NIL != touch_p)) {
              sbhl_graphs.touch_sbhl_graph_link(v_term, sbhl_graphs.get_sbhl_graph_link(v_term, module), module);
            }
          }
        }
      }
      return Values.values(module, paged_in, touch_p);
    }
  }

  /** Given a list of terms and some of the basic information for a caching policy, construct
   one that will meet the structural requirements of the sbhl caching policy description.
   @param exempt the first N of the term list to exempt from caching
   @param prefetch the first N AFTER the exempt of the term list to prefetch
   @return the SBHL caching policy */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 10894) 
  public static final SubLObject create_sbhl_caching_policy_from_term_recommendation_list(SubLObject link_predicate, SubLObject policy_type, SubLObject capacity, SubLObject term_list, SubLObject exempt, SubLObject prefetch) {
    if ((exempt == UNPROVIDED)) {
      exempt = ZERO_INTEGER;
    }
    if ((prefetch == UNPROVIDED)) {
      prefetch = ZERO_INTEGER;
    }
    checkType(term_list, $sym25$LIST_OF_FORT_P);
    checkType(link_predicate, $sym14$FORT_P);
    {
      SubLObject exemptions = NIL;
      SubLObject prefetchers = NIL;
      if ((exempt == $kw11$ALL)) {
        exemptions = $kw11$ALL;
        if ((prefetch == $kw11$ALL)) {
          prefetchers = $kw11$ALL;
        } else {
          prefetchers = (prefetch.isFixnum() ? ((SubLObject) list_utilities.first_n(prefetch, term_list)) : NIL);
        }
      } else {
        exemptions = (exempt.isFixnum() ? ((SubLObject) list_utilities.first_n(exempt, term_list)) : NIL);
        prefetchers = ((exempt.isFixnum()
               && prefetch.isFixnum()) ? ((SubLObject) Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9124")) : NIL);
      }
      return new_sbhl_caching_policy(link_predicate, policy_type, capacity, exemptions, prefetchers);
    }
  }

  /** Do the actual reset of the SBHL caching policies. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13047) 
  public static final SubLObject reset_sbhl_caching_policies_internal(SubLObject policies) {
    sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(NIL);
    dictionary.clear_dictionary($active_sbhl_caching_policies$.getGlobalValue());
    {
      SubLObject cdolist_list_var = policies;
      SubLObject policy = NIL;
      for (policy = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), policy = cdolist_list_var.first()) {
        reset_sbhl_caching_policy(policy);
      }
    }
    return $kw26$RESET;
  }

  /** Attempt to load a standard KB sbhl caching policy file from the
   dump directory. If no such file exists, revert to the legacy
   SBHL caching policy. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 13883) 
  public static final SubLObject enforce_standard_kb_sbhl_caching_policies(SubLObject dump_directory) {
    {
      SubLObject policies_file = get_standard_kb_sbhl_caching_policies_filename(dump_directory);
      SubLObject policies = NIL;
      if ((NIL != Filesys.probe_file(policies_file))) {
        {
          SubLObject msg = NIL;
          try {
            {
              SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
              try {
                Dynamic.bind(Errors.$error_handler$, $sym28$CATCH_ERROR_MESSAGE_HANDLER);
                try {
                  policies = load_sbhl_caching_policies(policies_file);
                } catch (Throwable catch_var) {
                  Errors.handleThrowable(catch_var, NIL);
                }
              } finally {
                Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
              }
            }
          } catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
          }
          if (msg.isString()) {
            Errors.warn($str29$__Skipping_invalid_SBHL_caching_p, policies_file, msg);
          }
        }
      }
      if ((NIL == list_utilities.sublisp_boolean(policies))) {
        policies = builder_utilities.propose_legacy_kb_sbhl_caching_policies(UNPROVIDED);
      }
      reset_sbhl_caching_policies_internal(policies);
    }
    return $kw27$ENFORCED;
  }


  /** Load the SBHL caching policies in the most effective way.
   Return LISTP of caching policies. */
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 12602) 
  public static final SubLObject load_sbhl_caching_policies(SubLObject policies_file) {
    return cfasl_utilities.cfasl_load(policies_file);
  }

  
  @SubL(source = "cycl/sbhl/sbhl-caching-policies.lisp", position = 15295) 
  public static final SubLObject get_standard_kb_sbhl_caching_policies_filename(SubLObject dump_directory) {
    return dumper.kb_dump_file($str30$standard_kb_sbhl_caching_policies, dump_directory, UNPROVIDED);
  }

  public static final SubLObject declare_sbhl_caching_policies_file() {
    //declareFunction(myName, "valid_sbhl_caching_instruction_verb_p", "VALID-SBHL-CACHING-INSTRUCTION-VERB-P", 1, 0, false);
    //declareFunction(myName, "valid_sbhl_caching_policy_type_p", "VALID-SBHL-CACHING-POLICY-TYPE-P", 1, 0, false);
    declareFunction(myName, "new_sbhl_caching_policy", "NEW-SBHL-CACHING-POLICY", 2, 3, false);
    declareFunction(myName, "flesh_out_sbhl_caching_policy", "FLESH-OUT-SBHL-CACHING-POLICY", 4, 0, false);
    //declareFunction(myName, "clone_sbhl_caching_policy", "CLONE-SBHL-CACHING-POLICY", 1, 0, false);
    declareFunction(myName, "get_sbhl_caching_policy_link_predicate", "GET-SBHL-CACHING-POLICY-LINK-PREDICATE", 1, 0, false);
    declareFunction(myName, "get_sbhl_caching_policy_type", "GET-SBHL-CACHING-POLICY-TYPE", 1, 0, false);
    //declareFunction(myName, "get_sbhl_caching_policy_capacity", "GET-SBHL-CACHING-POLICY-CAPACITY", 1, 0, false);
    //declareFunction(myName, "get_sbhl_caching_policy_terms_to_exempt", "GET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 1, 0, false);
    //declareFunction(myName, "set_sbhl_caching_policy_terms_to_exempt", "SET-SBHL-CACHING-POLICY-TERMS-TO-EXEMPT", 2, 0, false);
    declareFunction(myName, "get_sbhl_caching_policy_terms_to_prefetch", "GET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 1, 0, false);
    //declareFunction(myName, "set_sbhl_caching_policy_terms_to_prefetch", "SET-SBHL-CACHING-POLICY-TERMS-TO-PREFETCH", 2, 0, false);
    declareFunction(myName, "reset_sbhl_caching_policy", "RESET-SBHL-CACHING-POLICY", 1, 0, false);
    declareFunction(myName, "implement_sbhl_caching_policy", "IMPLEMENT-SBHL-CACHING-POLICY", 1, 0, false);
    declareFunction(myName, "seed_sbhl_module_graph_cache_with_nodes", "SEED-SBHL-MODULE-GRAPH-CACHE-WITH-NODES", 2, 1, false);
    //declareFunction(myName, "get_all_nodes_for_sbhl_module_graph", "GET-ALL-NODES-FOR-SBHL-MODULE-GRAPH", 1, 0, false);
    declareFunction(myName, "create_sbhl_caching_policy_from_term_recommendation_list", "CREATE-SBHL-CACHING-POLICY-FROM-TERM-RECOMMENDATION-LIST", 4, 2, false);
    //declareFunction(myName, "save_sbhl_caching_policies", "SAVE-SBHL-CACHING-POLICIES", 2, 1, false);
    //declareFunction(myName, "load_sbhl_caching_policies", "LOAD-SBHL-CACHING-POLICIES", 1, 0, false);
    //declareFunction(myName, "reset_sbhl_caching_policies", "RESET-SBHL-CACHING-POLICIES", 1, 0, false);
    declareFunction(myName, "reset_sbhl_caching_policies_internal", "RESET-SBHL-CACHING-POLICIES-INTERNAL", 1, 0, false);
    //declareFunction(myName, "enforce_monolithic_kb_sbhl_caching_policies", "ENFORCE-MONOLITHIC-KB-SBHL-CACHING-POLICIES", 0, 0, false);
    declareFunction(myName, "enforce_standard_kb_sbhl_caching_policies", "ENFORCE-STANDARD-KB-SBHL-CACHING-POLICIES", 1, 0, false);
    //declareFunction(myName, "dump_active_kb_sbhl_caching_policies", "DUMP-ACTIVE-KB-SBHL-CACHING-POLICIES", 1, 1, false);
    declareFunction(myName, "get_standard_kb_sbhl_caching_policies_filename", "GET-STANDARD-KB-SBHL-CACHING-POLICIES-FILENAME", 1, 0, false);
    //declareFunction(myName, "gather_active_kb_sbhl_caching_policies", "GATHER-ACTIVE-KB-SBHL-CACHING-POLICIES", 0, 0, false);
    //declareFunction(myName, "gather_one_active_kb_sbhl_caching_policy", "GATHER-ONE-ACTIVE-KB-SBHL-CACHING-POLICY", 1, 0, false);
    //declareFunction(myName, "prepare_kb_sbhl_caching_policy_term_list_for_dumping", "PREPARE-KB-SBHL-CACHING-POLICY-TERM-LIST-FOR-DUMPING", 1, 0, false);
    //declareFunction(myName, "setup_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false);
    //declareFunction(myName, "setup_sbhl_graphs_for_sbhl_cache_tuning_experiment", "SETUP-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 0, 0, false);
    //declareFunction(myName, "tear_down_sbhl_graphs_for_sbhl_cache_tuning_experiment", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 1, 0, false);
    //declareFunction(myName, "contribute_sbhl_graphs_data_for_sbhl_cache_tuning_experiment", "CONTRIBUTE-SBHL-GRAPHS-DATA-FOR-SBHL-CACHE-TUNING-EXPERIMENT", 2, 0, false);
    //declareFunction(myName, "tear_down_sbhl_graphs_for_sbhl_cache_tuning_data_gathering", "TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING", 0, 0, false);
    //declareFunction(myName, "facade_sbhl_module_cache_strategies_for_recording", "FACADE-SBHL-MODULE-CACHE-STRATEGIES-FOR-RECORDING", 0, 1, false);
    //declareFunction(myName, "unfacade_sbhl_module_cache_strategies_facaded_for_recording", "UNFACADE-SBHL-MODULE-CACHE-STRATEGIES-FACADED-FOR-RECORDING", 0, 1, false);
    //declareFunction(myName, "recommend_sbhl_caching_preference_term_list_from_recordings", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-RECORDINGS", 2, 0, false);
    //declareFunction(myName, "recommend_sbhl_caching_preference_term_list_from_ref_counts", "RECOMMEND-SBHL-CACHING-PREFERENCE-TERM-LIST-FROM-REF-COUNTS", 2, 0, false);
    //declareFunction(myName, "count_references_in_sbhl_cache_strategy_recordings", "COUNT-REFERENCES-IN-SBHL-CACHE-STRATEGY-RECORDINGS", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_caching_policies_file() {
    $active_sbhl_caching_policies$ = deflexical("*ACTIVE-SBHL-CACHING-POLICIES*", maybeDefault( $sym0$_ACTIVE_SBHL_CACHING_POLICIES_, $active_sbhl_caching_policies$, ()-> (dictionary.new_dictionary(UNPROVIDED, UNPROVIDED))));
    $valid_sbhl_caching_instruction_verb$ = deflexical("*VALID-SBHL-CACHING-INSTRUCTION-VERB*", $list1);
    $valid_sbhl_caching_policy_types$ = deflexical("*VALID-SBHL-CACHING-POLICY-TYPES*", $list2);
    return NIL;
  }

  public static final SubLObject setup_sbhl_caching_policies_file() {
        subl_macro_promotions.declare_defglobal($sym0$_ACTIVE_SBHL_CACHING_POLICIES_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_ACTIVE_SBHL_CACHING_POLICIES_ = makeSymbol("*ACTIVE-SBHL-CACHING-POLICIES*");
  public static final SubLList $list1 = list(makeKeyword("LINK-PREDICATE"), makeKeyword("POLICY"), makeKeyword("CAPACITY"), makeKeyword("EXEMPT"), makeKeyword("PREFETCH"));
  public static final SubLList $list2 = list(makeKeyword("STICKY"), makeKeyword("SWAPOUT"));
  public static final SubLSymbol $sym3$VALID_SBHL_CACHING_POLICY_TYPE_P = makeSymbol("VALID-SBHL-CACHING-POLICY-TYPE-P");
  public static final SubLSymbol $kw4$LINK_PREDICATE = makeKeyword("LINK-PREDICATE");
  public static final SubLSymbol $kw5$POLICY = makeKeyword("POLICY");
  public static final SubLSymbol $kw6$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $kw7$STICKY = makeKeyword("STICKY");
  public static final SubLSymbol $kw8$UNDEFINED = makeKeyword("UNDEFINED");
  public static final SubLString $str9$Sticky_policy_does_not_support_ca = makeString("Sticky policy does not support capacity ~A, only :undefined.");
  public static final SubLSymbol $kw10$CAPACITY = makeKeyword("CAPACITY");
  public static final SubLSymbol $kw11$ALL = makeKeyword("ALL");
  public static final SubLString $str12$Invalid_exemption_specification__ = makeString("Invalid exemption specification ~A. Only :all is permitted for sticky policy.");
  public static final SubLSymbol $kw13$EXEMPT = makeKeyword("EXEMPT");
  public static final SubLSymbol $sym14$FORT_P = makeSymbol("FORT-P");
  public static final SubLString $str15$Invalid_prefetch_specification__A = makeString("Invalid prefetch specification ~A. Only :ALL or lists of FORT-P (incl NIL) are permitted.");
  public static final SubLSymbol $kw16$PREFETCH = makeKeyword("PREFETCH");
  public static final SubLSymbol $kw17$SWAPOUT = makeKeyword("SWAPOUT");
  public static final SubLString $str18$Swapout_policy_does_not_support_c = makeString("Swapout policy does not support capacity ~A, only positive integer capacities are supported.");
  public static final SubLString $str19$Invalid_exemption_specification__ = makeString("Invalid exemption specification ~A. Only lists of FORT-P (incl NIL) or :all are permitted.");
  public static final SubLString $str20$Invalid_prefetch_specification__A = makeString("Invalid prefetch specification ~A. Only lists of FORT-P (incl NIL) are permitted.");
  public static final SubLString $str21$Unknown_policy_type__A_____dont_k = makeString("Unknown policy type ~A ... dont know what to do.");
  public static final SubLSymbol $kw22$DONT_CACHE = makeKeyword("DONT-CACHE");
  public static final SubLSymbol $kw23$TOUCH = makeKeyword("TOUCH");
  public static final SubLString $str24$Caching_policy_of_type__A_not_yet = makeString("Caching policy of type ~A not yet implemented.");
  public static final SubLSymbol $sym25$LIST_OF_FORT_P = makeSymbol("LIST-OF-FORT-P");
  public static final SubLSymbol $kw26$RESET = makeKeyword("RESET");
  public static final SubLSymbol $kw27$ENFORCED = makeKeyword("ENFORCED");
  public static final SubLSymbol $sym28$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str29$__Skipping_invalid_SBHL_caching_p = makeString("~&Skipping invalid SBHL caching policies file ~A.~%Load attempt caused error: ~A.~%");
  public static final SubLString $str30$standard_kb_sbhl_caching_policies = makeString("standard-kb-sbhl-caching-policies");
  public static final SubLSymbol $sym31$VALID_FORT_ = makeSymbol("VALID-FORT?");
  public static final SubLInteger $int32$30 = makeInteger(30);
  public static final SubLSymbol $kw33$READY = makeKeyword("READY");
  public static final SubLSymbol $kw34$DONE = makeKeyword("DONE");
  public static final SubLList $list35 = list(makeSymbol("MODULE"), makeSymbol("REF-COUNTS"));
  public static final SubLList $list36 = cons(makeSymbol("SBHL-MODULE"), makeSymbol("CACHE-STRATEGY"));
  public static final SubLObject $const37$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLObject $const38$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym39$_ = makeSymbol(">");
  public static final SubLSymbol $sym40$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");
  public static final SubLObject $const41$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const42$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLList $list43 = list(makeSymbol("TIME-STAMP"), makeSymbol("ACTION-TYPE"), makeSymbol("TERM"));

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_caching_policies_file();
  }

  public void initializeVariables() {
    init_sbhl_caching_policies_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_caching_policies_file();
  }

}
