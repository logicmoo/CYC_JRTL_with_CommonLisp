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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.*;
import java.util.Map.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.cfasl_kb_methods;
//dm import com.cyc.cycjava_1.cycl.cfasl_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_queues;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.transcript_utilities;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_analysis extends SubLTranslatedFile {

  //// Constructor

  private inference_analysis() {}
  public static final SubLFile me = new inference_analysis();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_analysis";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 1622)
  private static SubLSymbol $transformation_rule_statistics_table$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 1822)
  private static SubLSymbol $transformation_rule_statistics_lock$ = null;

  /** A list of experience filenames which have been loaded into this image to add to the
transformation rule statistics. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 1939)
  private static SubLSymbol $transformation_rule_statistics_filename_load_history$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2146)
  public static final SubLObject clear_transformation_rule_statistics_filename_load_history() {
    $transformation_rule_statistics_filename_load_history$.setGlobalValue(NIL);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2307)
  public static final SubLObject add_to_transformation_rule_statistics_filename_load_history(SubLObject filename) {
    {
      SubLObject new_cons = cons(filename, NIL);
      SubLObject list = $transformation_rule_statistics_filename_load_history$.getGlobalValue();
      if ((NIL != list)) {
        subl_macros.rplacd_last(list, new_cons);
      } else {
        $transformation_rule_statistics_filename_load_history$.setGlobalValue(new_cons);
      }
    }
    return filename;
  }

  /** When non-nil, the transformation rule statistics are updated during inference. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 2657)
  public static SubLSymbol $transformation_rule_statistics_update_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 4045)
  public static final SubLObject transformation_rule_statistics_table() {
    return $transformation_rule_statistics_table$.getGlobalValue();
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 4498)
  public static final SubLObject transformation_rules_with_statistics_condition_passesP(SubLObject rule, SubLObject recentP) {
    return makeBoolean(((NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED))
           && ((NIL == recentP)
            || (NIL != transformation_rule_has_recent_statisticsP(rule)))));
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 4756)
  public static final SubLObject new_transformation_rule_statistics() {
    return Vectors.make_vector(FOUR_INTEGER, ZERO_INTEGER);
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5242)
  public static final SubLObject clear_all_transformation_rule_statistics() {
    {
      SubLObject lock = $transformation_rule_statistics_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        Hashtables.clrhash($transformation_rule_statistics_table$.getGlobalValue());
        clear_transformation_rule_statistics_filename_load_history();
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5505)
  public static final SubLObject clear_transformation_rule_statistics(SubLObject rule) {
    {
      SubLObject result = NIL;
      SubLObject lock = $transformation_rule_statistics_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        result = Hashtables.remhash(rule, $transformation_rule_statistics_table$.getGlobalValue());
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 5882)
  public static final SubLObject get_transformation_rule_statistics(SubLObject rule) {
    return Hashtables.gethash_without_values(rule, $transformation_rule_statistics_table$.getGlobalValue(), $kw22$UNINITIALIZED);
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 6034)
  public static final SubLObject ensure_transformation_rule_statistics(SubLObject rule) {
    {
      SubLObject statistics = get_transformation_rule_statistics(rule);
      if (($kw22$UNINITIALIZED == statistics)) {
        statistics = new_transformation_rule_statistics();
        {
          SubLObject lock = $transformation_rule_statistics_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            Hashtables.sethash(rule, $transformation_rule_statistics_table$.getGlobalValue(), statistics);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      }
      return statistics;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 7940)
  public static final SubLObject any_recent_experienceP() {
    {
      SubLObject cdohash_table = transformation_rule_statistics_table();
      SubLObject rule = NIL;
      SubLObject statistics_var = NIL;
      {
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
            rule = Hashtables.getEntryKey(cdohash_entry);
            statistics_var = Hashtables.getEntryValue(cdohash_entry);
            if ((NIL != transformation_rules_with_statistics_condition_passesP(rule, T))) {
              return T;
            }
          }
        } finally {
          Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8526)
  public static final SubLObject transformation_rule_considered_count(SubLObject rule) {
    {
      SubLObject statistics = get_transformation_rule_statistics(rule);
      return (($kw22$UNINITIALIZED == statistics) ? ((SubLObject) ZERO_INTEGER) : Vectors.aref(statistics, ZERO_INTEGER));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8739)
  public static final SubLObject transformation_rule_recent_considered_count(SubLObject rule) {
    {
      SubLObject statistics = get_transformation_rule_statistics(rule);
      return (($kw22$UNINITIALIZED == statistics) ? ((SubLObject) ZERO_INTEGER) : Vectors.aref(statistics, TWO_INTEGER));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 8959)
  public static final SubLObject transformation_rule_has_recent_statisticsP(SubLObject rule) {
    return Numbers.plusp(transformation_rule_recent_considered_count(rule));
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 9540)
  public static final SubLObject transformation_rule_success_count(SubLObject rule) {
    {
      SubLObject statistics = get_transformation_rule_statistics(rule);
      return (($kw22$UNINITIALIZED == statistics) ? ((SubLObject) ZERO_INTEGER) : Vectors.aref(statistics, ONE_INTEGER));
    }
  }

  /** Note that RULE has been considered COUNT more times.
   If RECENT?, also queue this information for logging in the experience transcript. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 10443)
  public static final SubLObject increment_transformation_rule_considered_count(SubLObject rule, SubLObject recentP, SubLObject count) {
    if ((count == UNPROVIDED)) {
      count = ONE_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(rule, $sym34$ASSERTION_P);
      checkType(count, $sym35$INTEGERP);
      if ((NIL == subl_promotions.positive_integer_p(count))) {
        Errors.warn($str36$Incrementing_transformation_rule_);
      }
      {
        SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if ((NIL != $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread))) {
          Vectors.set_aref(statistics, ZERO_INTEGER, Numbers.add(Vectors.aref(statistics, ZERO_INTEGER), count));
          if ((NIL != recentP)) {
            Vectors.set_aref(statistics, TWO_INTEGER, Numbers.add(Vectors.aref(statistics, TWO_INTEGER), count));
          }
        }
        return Vectors.aref(statistics, ZERO_INTEGER);
      }
    }
  }

  /** Note that RULE has been successfully used COUNT more times.
   If RECENT?, also queue this information for logging in the experience transcript. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 11161)
  public static final SubLObject increment_transformation_rule_success_count(SubLObject rule, SubLObject recentP, SubLObject count) {
    if ((count == UNPROVIDED)) {
      count = ONE_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(rule, $sym34$ASSERTION_P);
      checkType(count, $sym35$INTEGERP);
      {
        SubLObject statistics = ensure_transformation_rule_statistics(rule);
        if ((NIL != $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread))) {
          Vectors.set_aref(statistics, ONE_INTEGER, Numbers.add(Vectors.aref(statistics, ONE_INTEGER), count));
          if ((NIL != recentP)) {
            Vectors.set_aref(statistics, THREE_INTEGER, Numbers.add(Vectors.aref(statistics, THREE_INTEGER), count));
          }
        }
        return Vectors.aref(statistics, ONE_INTEGER);
      }
    }
  }

  /** Absolute historical success limit, below which rules are never even tried. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13014)
  public static SubLSymbol $transformation_rule_historical_success_pruning_threshold$ = null;

  /** Absolute historical utility limit, below which rules are never even tried. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13188)
  public static SubLSymbol $transformation_rule_historical_utility_pruning_threshold$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 13351)
  public static final SubLObject transformation_rule_has_insufficient_historical_utilityP(SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((ZERO_INTEGER.numE($transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread))
           && $int37$_100.numE($transformation_rule_historical_utility_pruning_threshold$.getDynamicValue(thread)))) {
        return NIL;
      }
      return makeBoolean((transformation_rule_success_count(rule).numL($transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread))
            || transformation_rule_historical_utility(rule).numL($transformation_rule_historical_utility_pruning_threshold$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 23646)
  public static final SubLObject load_transformation_rule_statistics(SubLObject filename, SubLObject mergeP) {
    if ((mergeP == UNPROVIDED)) {
      mergeP = T;
    }
    return load_transformation_rule_statistics_int(filename, mergeP, NIL);
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 24191)
  public static final SubLObject load_transformation_rule_statistics_int(SubLObject filename, SubLObject mergeP, SubLObject exclude_rules) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject exclude_rule_set = ((NIL != exclude_rules) ? ((SubLObject) set_utilities.construct_set_from_list(exclude_rules, UNPROVIDED, UNPROVIDED)) : NIL);
        load_transformation_rule_statistics_bookkeeping(filename, mergeP);
        {
          SubLObject stream = NIL;
          try {
            {
              SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
              try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $kw43$INPUT);
              } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
              }
            }
            if ((!(stream.isStream()))) {
              Errors.error($str42$Unable_to_open__S, filename);
            }
            {
              SubLObject stream_3 = stream;
              SubLObject count = cfasl.cfasl_input(stream_3, UNPROVIDED, UNPROVIDED);
              SubLObject i = NIL;
              for (i = ZERO_INTEGER; i.numL(count); i = Numbers.add(i, ONE_INTEGER)) {
                load_transformation_rule_statistics_for_rule(stream_3, exclude_rule_set);
              }
            }
          } finally {
            {
              SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
              try {
                Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                if (stream.isStream()) {
                  streams_high.close(stream, UNPROVIDED);
                }
              } finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 24653)
  public static final SubLObject load_transformation_rule_statistics_bookkeeping(SubLObject filename, SubLObject mergeP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == $transformation_rule_statistics_update_enabledP$.getDynamicValue(thread))) {
          Errors.error($str44$Transformation_rule_statistics_up);
        }
      }
      if ((NIL == mergeP)) {
        clear_all_transformation_rule_statistics();
      }
      add_to_transformation_rule_statistics_filename_load_history(filename);
      return NIL;
    }
  }

  /** @param EXCLUDE-RULE-SET don't load in statistics for any rule in EXCLUDE-RULE-SET. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 26172)
  public static final SubLObject load_transformation_rule_statistics_for_rule(SubLObject stream, SubLObject exclude_rule_set) {
    {
      SubLObject rule = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject considered = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      SubLObject success = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      if (((NIL != subl_promotions.non_negative_integer_p(considered))
           && (NIL != subl_promotions.non_negative_integer_p(success))
           && (NIL != assertion_handles.valid_assertionP(rule, UNPROVIDED))
           && (!(((NIL != exclude_rule_set)
               && (NIL != set.set_memberP(rule, exclude_rule_set))))))) {
        increment_transformation_rule_considered_count(rule, NIL, considered);
        increment_transformation_rule_success_count(rule, NIL, success);
      }
      return rule;
    }
  }

  /** This lock controls who actually gets to write to the experience transcript file,
   since multiple threads could otherwise open the same file for appending
   and stomp all over each other. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 27857)
  private static SubLSymbol $save_recent_experience_lock$ = null;

  /** Save recent experience, if it appears sensible to do so. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28183)
  public static final SubLObject possibly_save_recent_experience() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != Locks.lock_idle_p($save_recent_experience_lock$.getDynamicValue(thread)))) {
        return save_recent_experience();
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 28385)
  public static final SubLObject save_recent_experience() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != any_recent_experienceP())) {
        {
          SubLObject lock = $save_recent_experience_lock$.getDynamicValue(thread);
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32996");
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        return T;
      }
      return NIL;
    }
  }

  /** Return number between -100 and 100 indicating the historical utility of RULE.
   100 is most useful, 0 is of average utility, and -100 is most useless. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 30513)
  public static final SubLObject transformation_rule_historical_utility(SubLObject rule) {
    checkType(rule, $sym40$RULE_ASSERTION_);
    return rule_historical_utility_from_observations(transformation_rule_success_count(rule), transformation_rule_considered_count(rule));
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 31827)
  private static SubLSymbol $average_rule_historical_success_probability$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 32031)
  private static SubLSymbol $rule_historical_success_happiness_scaling_factor$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 32152)
  public static final SubLObject rule_historical_utility_from_observations(SubLObject success, SubLObject considered) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return historical_utility_from_observations(success, considered, $average_rule_historical_success_probability$.getDynamicValue(thread), $rule_historical_success_happiness_scaling_factor$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 32399)
  public static final SubLObject historical_utility_from_observations(SubLObject success, SubLObject considered, SubLObject average_historical_probability, SubLObject utility_scaling_factor) {
    if ((!(considered.isPositive()))) {
      return ZERO_INTEGER;
    }
    {
      SubLObject probability = Numbers.divide(success, considered);
      if (probability.numG(average_historical_probability)) {
        {
          SubLObject raw_utility = Numbers.multiply(utility_scaling_factor, Numbers.divide(Numbers.subtract(probability, average_historical_probability), Numbers.subtract(ONE_INTEGER, average_historical_probability)), Numbers.integer_length(considered));
          SubLObject utility = Numbers.truncate(Numbers.min($int39$100, raw_utility), UNPROVIDED);
          return utility;
        }
      } else if (probability.numL(average_historical_probability)) {
        {
          SubLObject raw_utility = Numbers.multiply(utility_scaling_factor, Numbers.divide(Numbers.subtract(probability, average_historical_probability), average_historical_probability), Numbers.integer_length(considered));
          SubLObject utility = Numbers.truncate(Numbers.max($int37$_100, raw_utility), UNPROVIDED);
          return utility;
        }
      } else {
        return ZERO_INTEGER;
      }
    }
  }

  /** A hashtable of RULE -> a set-contents of rules that have been used in a successful
   proof together with RULE sometime in the past.  This is an implementation of a graph;
   rules are nodes and edges are indicated by being present in the set-contents. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35373)
  private static SubLSymbol $transformation_rule_historical_connectivity_graph$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 35857)
  private static SubLSymbol $transformation_rule_historical_connectivity_graph_lock$ = null;

  /** Notes that the rules in RULE-SET-CONTENTS have been successfully used together in an inference answer proof. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 38338)
  public static final SubLObject note_inference_answer_proof_rules(SubLObject rules) {
    if ((NIL != list_utilities.lengthGE(rules, TWO_INTEGER, UNPROVIDED))) {
      {
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        for (rule = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), rule = cdolist_list_var.first()) {
          {
            SubLObject cdolist_list_var_12 = rules;
            SubLObject connected_rule = NIL;
            for (connected_rule = cdolist_list_var_12.first(); (NIL != cdolist_list_var_12); cdolist_list_var_12 = cdolist_list_var_12.rest(), connected_rule = cdolist_list_var_12.first()) {
              if ((rule != connected_rule)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32992");
              }
            }
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 39973)
  private static SubLSymbol $hl_module_expand_counts_enabledP$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 40218)
  public static SubLSymbol $hl_module_expand_counts$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 40881)
  public static final SubLObject cinc_hl_module_expand_count(SubLObject hl_module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $hl_module_expand_counts_enabledP$.getDynamicValue(thread))) {
        {
          SubLObject count = dictionary.dictionary_lookup($hl_module_expand_counts$.getDynamicValue(thread), hl_module, ZERO_INTEGER);
          count = Numbers.add(count, ONE_INTEGER);
          dictionary.dictionary_enter($hl_module_expand_counts$.getDynamicValue(thread), hl_module, count);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 41479)
  public static final SubLObject cinc_module_expand_count(SubLObject name) {
    {
      SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
      return cinc_hl_module_expand_count(hl_module);
    }
  }

  /** The queue of asked queries to be written out. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 41649)
  private static SubLSymbol $asked_queries_queue$ = null;

  /** The lock for the asked queries queue. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 41809)
  private static SubLSymbol $save_recent_asked_queries_lock$ = null;

  /** The limit to the number of queries we will store before writing them out. */
  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 41940)
  private static SubLSymbol $asked_queries_queue_limit$ = null;

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42071)
  public static final SubLObject clear_asked_query_queue() {
    queues.clear_queue($asked_queries_queue$.getGlobalValue());
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42165)
  public static final SubLObject possibly_enqueue_asked_query(SubLObject query_sentence, SubLObject query_mt, SubLObject query_properties) {
    {
      SubLObject result = NIL;
      if ((NIL != control_vars.save_asked_queriesP())) {
        if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22953"))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32981");
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 42904)
  public static final SubLObject possibly_enqueue_asked_query_from_inference(SubLObject inference) {
    {
      SubLObject result = NIL;
      if ((NIL != control_vars.save_asked_queriesP())) {
        if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22954"))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32983");
        }
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-analysis.lisp", position = 47247)
  private static SubLSymbol $asked_query_common_symbols$ = null;

  public static final SubLObject declare_inference_analysis_file() {
    declareFunction(myName, "problem_store_estimated_problem_reuses_count", "PROBLEM-STORE-ESTIMATED-PROBLEM-REUSES-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_estimated_reuse_ratio", "PROBLEM-STORE-ESTIMATED-REUSE-RATIO", 1, 0, false);
    declareFunction(myName, "clear_transformation_rule_statistics_filename_load_history", "CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
    declareFunction(myName, "add_to_transformation_rule_statistics_filename_load_history", "ADD-TO-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 1, 0, false);
    declareFunction(myName, "transformation_rule_statistics_filename_load_history", "TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY", 0, 0, false);
    declareFunction(myName, "transformation_rule_statistics_update_enabledP", "TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?", 0, 0, false);
    declareFunction(myName, "enable_transformation_rule_statistics_update", "ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
    declareFunction(myName, "disable_transformation_rule_statistics_update", "DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 0, false);
    declareMacro(myName, "do_transformation_rules_with_statistics", "DO-TRANSFORMATION-RULES-WITH-STATISTICS");
    declareFunction(myName, "transformation_rule_statistics_table", "TRANSFORMATION-RULE-STATISTICS-TABLE", 0, 0, false);
    declareFunction(myName, "transformation_rules_with_statistics_helper", "TRANSFORMATION-RULES-WITH-STATISTICS-HELPER", 0, 0, false);
    declareFunction(myName, "transformation_rules_with_statistics_condition_passesP", "TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?", 2, 0, false);
    declareFunction(myName, "new_transformation_rule_statistics", "NEW-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
    declareFunction(myName, "clear_all_transformation_rule_statistics", "CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
    declareFunction(myName, "clear_transformation_rule_statistics", "CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
    declareFunction(myName, "transformation_rules_with_statistics_count", "TRANSFORMATION-RULES-WITH-STATISTICS-COUNT", 0, 0, false);
    declareFunction(myName, "get_transformation_rule_statistics", "GET-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
    declareFunction(myName, "ensure_transformation_rule_statistics", "ENSURE-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
    declareFunction(myName, "transformation_rules_with_statistics", "TRANSFORMATION-RULES-WITH-STATISTICS", 0, 2, false);
    declareFunction(myName, "transformation_rules_with_recent_statistics", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS", 0, 0, false);
    declareFunction(myName, "transformation_rules_with_recent_statistics_count", "TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT", 0, 0, false);
    declareFunction(myName, "any_recent_experienceP", "ANY-RECENT-EXPERIENCE?", 0, 0, false);
    declareFunction(myName, "total_transformation_rule_considered_count", "TOTAL-TRANSFORMATION-RULE-CONSIDERED-COUNT", 0, 0, false);
    declareFunction(myName, "total_transformation_rule_recent_considered_count", "TOTAL-TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 0, 0, false);
    declareFunction(myName, "transformation_rule_considered_count", "TRANSFORMATION-RULE-CONSIDERED-COUNT", 1, 0, false);
    declareFunction(myName, "transformation_rule_recent_considered_count", "TRANSFORMATION-RULE-RECENT-CONSIDERED-COUNT", 1, 0, false);
    declareFunction(myName, "transformation_rule_has_recent_statisticsP", "TRANSFORMATION-RULE-HAS-RECENT-STATISTICS?", 1, 0, false);
    declareFunction(myName, "total_transformation_rule_success_count", "TOTAL-TRANSFORMATION-RULE-SUCCESS-COUNT", 0, 0, false);
    declareFunction(myName, "total_transformation_rule_recent_success_count", "TOTAL-TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 0, 0, false);
    declareFunction(myName, "transformation_rule_success_count", "TRANSFORMATION-RULE-SUCCESS-COUNT", 1, 0, false);
    declareFunction(myName, "transformation_rule_recent_success_count", "TRANSFORMATION-RULE-RECENT-SUCCESS-COUNT", 1, 0, false);
    declareFunction(myName, "transformation_rule_success_probability", "TRANSFORMATION-RULE-SUCCESS-PROBABILITY", 1, 1, false);
    declareFunction(myName, "increment_transformation_rule_considered_count", "INCREMENT-TRANSFORMATION-RULE-CONSIDERED-COUNT", 2, 1, false);
    declareFunction(myName, "increment_transformation_rule_success_count", "INCREMENT-TRANSFORMATION-RULE-SUCCESS-COUNT", 2, 1, false);
    declareFunction(myName, "clear_all_recent_transformation_rule_statistics", "CLEAR-ALL-RECENT-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
    declareFunction(myName, "clear_transformation_rule_recent_counts", "CLEAR-TRANSFORMATION-RULE-RECENT-COUNTS", 1, 0, false);
    declareFunction(myName, "clean_transformation_rule_statistics", "CLEAN-TRANSFORMATION-RULE-STATISTICS", 0, 0, false);
    declareFunction(myName, "transformation_rule_has_insufficient_historical_utilityP", "TRANSFORMATION-RULE-HAS-INSUFFICIENT-HISTORICAL-UTILITY?", 1, 0, false);
    declareFunction(myName, "rule_historical_utility_success_threshold", "RULE-HISTORICAL-UTILITY-SUCCESS-THRESHOLD", 0, 1, false);
    declareFunction(myName, "rule_historical_utility_saved_considerations", "RULE-HISTORICAL-UTILITY-SAVED-CONSIDERATIONS", 0, 1, false);
    declareFunction(myName, "transformation_rules_considered_with_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS", 0, 0, false);
    declareFunction(myName, "transformation_rules_considered_with_no_success", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
    declareFunction(myName, "transformation_rules_considered_with_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-FROM-MT", 1, 0, false);
    declareFunction(myName, "transformation_rules_considered_with_no_success_from_mt", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-FROM-MT", 1, 0, false);
    declareFunction(myName, "transformation_rules_considered_with_no_success_not_in_mts", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-NOT-IN-MTS", 1, 0, false);
    declareFunction(myName, "transformation_rule_mts_considered_with_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-SUCCESS", 0, 0, false);
    declareFunction(myName, "transformation_rule_mts_considered_with_no_success", "TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
    declareFunction(myName, "transformation_rules_considered_with_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-SUCCESS-PROVING-PREDICATE", 1, 0, false);
    declareFunction(myName, "transformation_rules_considered_with_no_success_proving_predicate", "TRANSFORMATION-RULES-CONSIDERED-WITH-NO-SUCCESS-PROVING-PREDICATE", 1, 0, false);
    declareFunction(myName, "transformation_rule_predicates_considered_with_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-SUCCESS", 0, 0, false);
    declareFunction(myName, "transformation_rule_predicates_considered_with_no_success", "TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-NO-SUCCESS", 0, 0, false);
    declareFunction(myName, "reinforce_transformation_rule", "REINFORCE-TRANSFORMATION-RULE", 1, 1, false);
    declareFunction(myName, "reinforce_inference_transformation_rules_in_answers", "REINFORCE-INFERENCE-TRANSFORMATION-RULES-IN-ANSWERS", 1, 1, false);
    declareFunction(myName, "reinforce_inference_transformation_rules", "REINFORCE-INFERENCE-TRANSFORMATION-RULES", 1, 1, false);
    declareFunction(myName, "save_transformation_rule_statistics", "SAVE-TRANSFORMATION-RULE-STATISTICS", 1, 1, false);
    declareFunction(myName, "load_transformation_rule_statistics", "LOAD-TRANSFORMATION-RULE-STATISTICS", 1, 1, false);
    declareFunction(myName, "load_transformation_rule_statistics_except_for_rules", "LOAD-TRANSFORMATION-RULE-STATISTICS-EXCEPT-FOR-RULES", 2, 1, false);
    declareFunction(myName, "load_transformation_rule_statistics_int", "LOAD-TRANSFORMATION-RULE-STATISTICS-INT", 3, 0, false);
    declareFunction(myName, "load_transformation_rule_statistics_bookkeeping", "LOAD-TRANSFORMATION-RULE-STATISTICS-BOOKKEEPING", 2, 0, false);
    declareFunction(myName, "save_recent_transformation_rule_statistics", "SAVE-RECENT-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
    declareFunction(myName, "save_transformation_rule_statistics_for_rule", "SAVE-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 4, 0, false);
    declareFunction(myName, "load_transformation_rule_statistics_for_rule", "LOAD-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 2, 0, false);
    declareFunction(myName, "show_transformation_rule_statistics", "SHOW-TRANSFORMATION-RULE-STATISTICS", 0, 2, false);
    declareFunction(myName, "possibly_save_recent_experience", "POSSIBLY-SAVE-RECENT-EXPERIENCE", 0, 0, false);
    declareFunction(myName, "save_recent_experience", "SAVE-RECENT-EXPERIENCE", 0, 0, false);
    declareFunction(myName, "local_experience_transcript", "LOCAL-EXPERIENCE-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "save_recent_experience_internal", "SAVE-RECENT-EXPERIENCE-INTERNAL", 0, 0, false);
    declareFunction(myName, "replace_and_collate_experience", "REPLACE-AND-COLLATE-EXPERIENCE", 2, 0, false);
    declareFunction(myName, "collate_experience", "COLLATE-EXPERIENCE", 1, 0, false);
    declareFunction(myName, "load_all_experience_transcripts_from_directory", "LOAD-ALL-EXPERIENCE-TRANSCRIPTS-FROM-DIRECTORY", 1, 0, false);
    declareFunction(myName, "transformation_rule_utility_experience_filenameP", "TRANSFORMATION-RULE-UTILITY-EXPERIENCE-FILENAME?", 1, 0, false);
    declareFunction(myName, "load_experience_transcript", "LOAD-EXPERIENCE-TRANSCRIPT", 1, 0, false);
    declareFunction(myName, "transformation_rule_historical_utility", "TRANSFORMATION-RULE-HISTORICAL-UTILITY", 1, 0, false);
    declareFunction(myName, "transformation_rule_historical_utility_G", "TRANSFORMATION-RULE-HISTORICAL-UTILITY->", 2, 0, false);
    declareFunction(myName, "current_average_rule_historical_success_probability", "CURRENT-AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY", 0, 1, false);
    declareFunction(myName, "rule_historical_utility_from_observations", "RULE-HISTORICAL-UTILITY-FROM-OBSERVATIONS", 2, 0, false);
    declareFunction(myName, "historical_utility_from_observations", "HISTORICAL-UTILITY-FROM-OBSERVATIONS", 4, 0, false);
    declareFunction(myName, "repair_all_experience_files_in_directory", "REPAIR-ALL-EXPERIENCE-FILES-IN-DIRECTORY", 1, 0, false);
    declareFunction(myName, "repair_experience_file", "REPAIR-EXPERIENCE-FILE", 1, 0, false);
    declareFunction(myName, "load_transformation_rule_statistics_ignoring_header", "LOAD-TRANSFORMATION-RULE-STATISTICS-IGNORING-HEADER", 2, 0, false);
    declareFunction(myName, "historically_connected_rules_set_contents", "HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 1, 0, false);
    declareFunction(myName, "set_historically_connected_rules_set_contents", "SET-HISTORICALLY-CONNECTED-RULES-SET-CONTENTS", 2, 0, false);
    declareFunction(myName, "rules_historically_connectedP", "RULES-HISTORICALLY-CONNECTED?", 2, 0, false);
    declareFunction(myName, "historically_connected_rules", "HISTORICALLY-CONNECTED-RULES", 1, 0, false);
    declareFunction(myName, "rule_historical_connectedness_ratio", "RULE-HISTORICAL-CONNECTEDNESS-RATIO", 1, 0, false);
    declareFunction(myName, "rule_historical_connectedness_percentage", "RULE-HISTORICAL-CONNECTEDNESS-PERCENTAGE", 1, 0, false);
    declareFunction(myName, "note_rules_historically_connected", "NOTE-RULES-HISTORICALLY-CONNECTED", 2, 0, false);
    declareFunction(myName, "note_inference_answer_proof_rules", "NOTE-INFERENCE-ANSWER-PROOF-RULES", 1, 0, false);
    declareFunction(myName, "show_transformation_rule_historical_connectivity_graph", "SHOW-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 0, 1, false);
    declareFunction(myName, "save_transformation_rule_historical_connectivity_graph", "SAVE-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 1, false);
    declareFunction(myName, "load_transformation_rule_historical_connectivity_graph", "LOAD-TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH", 1, 0, false);
    declareFunction(myName, "clear_hl_module_expand_counts", "CLEAR-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
    declareMacro(myName, "noting_hl_module_expand_counts", "NOTING-HL-MODULE-EXPAND-COUNTS");
    declareFunction(myName, "hl_module_expand_count", "HL-MODULE-EXPAND-COUNT", 1, 0, false);
    declareFunction(myName, "all_hl_module_expand_counts", "ALL-HL-MODULE-EXPAND-COUNTS", 0, 0, false);
    declareFunction(myName, "cinc_hl_module_expand_count", "CINC-HL-MODULE-EXPAND-COUNT", 1, 0, false);
    declareFunction(myName, "show_hl_module_expand_counts", "SHOW-HL-MODULE-EXPAND-COUNTS", 0, 2, false);
    declareFunction(myName, "cinc_module_expand_count", "CINC-MODULE-EXPAND-COUNT", 1, 0, false);
    declareFunction(myName, "clear_asked_query_queue", "CLEAR-ASKED-QUERY-QUEUE", 0, 0, false);
    declareFunction(myName, "possibly_enqueue_asked_query", "POSSIBLY-ENQUEUE-ASKED-QUERY", 3, 0, false);
    declareFunction(myName, "enqueue_asked_query", "ENQUEUE-ASKED-QUERY", 3, 0, false);
    declareFunction(myName, "possibly_enqueue_asked_query_from_inference", "POSSIBLY-ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
    declareFunction(myName, "enqueue_asked_query_from_inference", "ENQUEUE-ASKED-QUERY-FROM-INFERENCE", 1, 0, false);
    declareFunction(myName, "possibly_save_recent_asked_queries", "POSSIBLY-SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
    declareFunction(myName, "load_asked_queries", "LOAD-ASKED-QUERIES", 1, 1, false);
    declareFunction(myName, "query_info_p", "QUERY-INFO-P", 1, 0, false);
    declareFunction(myName, "valid_query_infoP", "VALID-QUERY-INFO?", 1, 0, false);
    declareFunction(myName, "load_asked_query", "LOAD-ASKED-QUERY", 1, 0, false);
    declareFunction(myName, "save_recent_asked_queries", "SAVE-RECENT-ASKED-QUERIES", 0, 0, false);
    declareFunction(myName, "any_recent_asked_queriesP", "ANY-RECENT-ASKED-QUERIES?", 0, 0, false);
    declareFunction(myName, "local_asked_queries_transcript", "LOCAL-ASKED-QUERIES-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "save_recent_asked_queries_int", "SAVE-RECENT-ASKED-QUERIES-INT", 0, 0, false);
    declareFunction(myName, "save_recent_asked_queries_to_file", "SAVE-RECENT-ASKED-QUERIES-TO-FILE", 1, 0, false);
    declareFunction(myName, "write_asked_query_to_stream", "WRITE-ASKED-QUERY-TO-STREAM", 3, 0, false);
    declareFunction(myName, "load_asked_query_from_stream", "LOAD-ASKED-QUERY-FROM-STREAM", 1, 0, false);
    declareFunction(myName, "asked_queries_filenameP", "ASKED-QUERIES-FILENAME?", 1, 0, false);
    declareFunction(myName, "asked_query_common_symbols", "ASKED-QUERY-COMMON-SYMBOLS", 0, 0, false);
    declareFunction(myName, "show_asked_query_statistics", "SHOW-ASKED-QUERY-STATISTICS", 1, 0, false);
    declareFunction(myName, "show_asked_query_statistics_int", "SHOW-ASKED-QUERY-STATISTICS-INT", 3, 0, false);
    declareFunction(myName, "write_inference_heuristic_ke_file", "WRITE-INFERENCE-HEURISTIC-KE-FILE", 2, 1, false);
    declareFunction(myName, "write_inference_heuristic_ke_file_to_stream", "WRITE-INFERENCE-HEURISTIC-KE-FILE-TO-STREAM", 1, 1, false);
    declareFunction(myName, "write_irrelevant_mts_ke_file_section", "WRITE-IRRELEVANT-MTS-KE-FILE-SECTION", 2, 0, false);
    declareFunction(myName, "write_backchain_forbidden_ke_file_section", "WRITE-BACKCHAIN-FORBIDDEN-KE-FILE-SECTION", 2, 0, false);
    declareFunction(myName, "write_irrelevant_assertion_ke_file_section", "WRITE-IRRELEVANT-ASSERTION-KE-FILE-SECTION", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_analysis_file() {
    $transformation_rule_statistics_table$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-TABLE*", maybeDefault( $sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_, $transformation_rule_statistics_table$, ()-> (Hashtables.make_hash_table($int1$64, Symbols.symbol_function(EQ), UNPROVIDED))));
    $transformation_rule_statistics_lock$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-LOCK*", maybeDefault( $sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_, $transformation_rule_statistics_lock$, ()-> (Locks.make_lock($str3$Transformation_Rule_Statistics_Lo))));
    $transformation_rule_statistics_filename_load_history$ = deflexical("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*", maybeDefault( $sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_, $transformation_rule_statistics_filename_load_history$, NIL));
    $transformation_rule_statistics_update_enabledP$ = defvar("*TRANSFORMATION-RULE-STATISTICS-UPDATE-ENABLED?*", T);
    $transformation_rule_historical_success_pruning_threshold$ = defvar("*TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING-THRESHOLD*", ZERO_INTEGER);
    $transformation_rule_historical_utility_pruning_threshold$ = defvar("*TRANSFORMATION-RULE-HISTORICAL-UTILITY-PRUNING-THRESHOLD*", $int37$_100);
    $save_recent_experience_lock$ = defparameter("*SAVE-RECENT-EXPERIENCE-LOCK*", Locks.make_lock($str48$Save_recent_experience_lock));
    $average_rule_historical_success_probability$ = defparameter("*AVERAGE-RULE-HISTORICAL-SUCCESS-PROBABILITY*", $float59$0_02939361143247565);
    $rule_historical_success_happiness_scaling_factor$ = defparameter("*RULE-HISTORICAL-SUCCESS-HAPPINESS-SCALING-FACTOR*", TEN_INTEGER);
    $transformation_rule_historical_connectivity_graph$ = deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*", maybeDefault( $sym65$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_, $transformation_rule_historical_connectivity_graph$, ()-> (Hashtables.make_hash_table($int66$256, Symbols.symbol_function(EQ), UNPROVIDED))));
    $transformation_rule_historical_connectivity_graph_lock$ = deflexical("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*", maybeDefault( $sym67$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_, $transformation_rule_historical_connectivity_graph_lock$, ()-> (Locks.make_lock($str68$Rule_Historical_Connectivity_Grap))));
    $hl_module_expand_counts_enabledP$ = defvar("*HL-MODULE-EXPAND-COUNTS-ENABLED?*", NIL);
    $hl_module_expand_counts$ = defvar("*HL-MODULE-EXPAND-COUNTS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    $asked_queries_queue$ = deflexical("*ASKED-QUERIES-QUEUE*", maybeDefault( $sym78$_ASKED_QUERIES_QUEUE_,
        $asked_queries_queue$, ()->(queues.create_queue())));
    $save_recent_asked_queries_lock$ = defparameter("*SAVE-RECENT-ASKED-QUERIES-LOCK*", Locks.make_lock($str79$Query_logging_lock));
    $asked_queries_queue_limit$ = deflexical("*ASKED-QUERIES-QUEUE-LIMIT*", $int80$300);
    $asked_query_common_symbols$ = deflexical("*ASKED-QUERY-COMMON-SYMBOLS*", maybeDefault( $sym88$_ASKED_QUERY_COMMON_SYMBOLS_, $asked_query_common_symbols$, NIL));
    return NIL;
  }

  public static final SubLObject setup_inference_analysis_file() {
    // CVS_ID("Id: inference-analysis.lisp 128583 2009-08-20 16:30:45Z rck ");
    subl_macro_promotions.declare_defglobal($sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_);
    subl_macro_promotions.declare_defglobal($sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_);
    subl_macro_promotions.declare_defglobal($sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_);
    access_macros.register_macro_helper($sym19$TRANSFORMATION_RULE_STATISTICS_TABLE, $sym20$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
    access_macros.register_macro_helper($sym21$TRANSFORMATION_RULES_WITH_STATISTICS_HELPER, $sym20$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
    access_macros.register_macro_helper($sym14$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_, $sym20$DO_TRANSFORMATION_RULES_WITH_STATISTICS);
    subl_macro_promotions.declare_defglobal($sym65$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_);
    subl_macro_promotions.declare_defglobal($sym67$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_);
    utilities_macros.register_global_lock($sym67$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_, $str68$Rule_Historical_Connectivity_Grap);
    subl_macro_promotions.declare_defglobal($sym78$_ASKED_QUERIES_QUEUE_);
    subl_macro_promotions.declare_defglobal($sym88$_ASKED_QUERY_COMMON_SYMBOLS_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_TRANSFORMATION_RULE_STATISTICS_TABLE_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-TABLE*");
  public static final SubLInteger $int1$64 = makeInteger(64);
  public static final SubLSymbol $sym2$_TRANSFORMATION_RULE_STATISTICS_LOCK_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-LOCK*");
  public static final SubLString $str3$Transformation_Rule_Statistics_Lo = makeString("Transformation Rule Statistics Lock");
  public static final SubLSymbol $sym4$_TRANSFORMATION_RULE_STATISTICS_FILENAME_LOAD_HISTORY_ = makeSymbol("*TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY*");
  public static final SubLList $list5 = list(list(makeSymbol("RULE-VAR"), makeSymbol("&KEY"), makeSymbol("RECENT?"), makeSymbol("COPY?"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list6 = list(makeKeyword("RECENT?"), makeKeyword("COPY?"), makeKeyword("DONE"));
  public static final SubLSymbol $kw7$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw8$RECENT_ = makeKeyword("RECENT?");
  public static final SubLSymbol $kw9$COPY_ = makeKeyword("COPY?");
  public static final SubLSymbol $kw10$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym11$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLList $list12 = list(makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER"));
  public static final SubLSymbol $sym13$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym14$TRANSFORMATION_RULES_WITH_STATISTICS_CONDITION_PASSES_ = makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-CONDITION-PASSES?");
  public static final SubLSymbol $sym15$STATISTICS_VAR = makeUninternedSymbol("STATISTICS-VAR");
  public static final SubLSymbol $sym16$DO_HASH_TABLE = makeSymbol("DO-HASH-TABLE");
  public static final SubLList $list17 = list(makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE"));
  public static final SubLSymbol $sym18$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym19$TRANSFORMATION_RULE_STATISTICS_TABLE = makeSymbol("TRANSFORMATION-RULE-STATISTICS-TABLE");
  public static final SubLSymbol $sym20$DO_TRANSFORMATION_RULES_WITH_STATISTICS = makeSymbol("DO-TRANSFORMATION-RULES-WITH-STATISTICS");
  public static final SubLSymbol $sym21$TRANSFORMATION_RULES_WITH_STATISTICS_HELPER = makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-HELPER");
  public static final SubLSymbol $kw22$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $kw23$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw24$CONSIDERED = makeKeyword("CONSIDERED");
  public static final SubLSymbol $sym25$_ = makeSymbol(">");
  public static final SubLSymbol $sym26$TRANSFORMATION_RULE_SUCCESS_COUNT = makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT");
  public static final SubLSymbol $sym27$TRANSFORMATION_RULE_CONSIDERED_COUNT = makeSymbol("TRANSFORMATION-RULE-CONSIDERED-COUNT");
  public static final SubLSymbol $kw28$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym29$_ = makeSymbol("<");
  public static final SubLSymbol $kw30$SUCCESS_PROBABILITY = makeKeyword("SUCCESS-PROBABILITY");
  public static final SubLSymbol $sym31$TRANSFORMATION_RULE_SUCCESS_PROBABILITY = makeSymbol("TRANSFORMATION-RULE-SUCCESS-PROBABILITY");
  public static final SubLSymbol $kw32$HISTORICAL_UTILITY = makeKeyword("HISTORICAL-UTILITY");
  public static final SubLSymbol $sym33$TRANSFORMATION_RULE_HISTORICAL_UTILITY = makeSymbol("TRANSFORMATION-RULE-HISTORICAL-UTILITY");
  public static final SubLSymbol $sym34$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym35$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str36$Incrementing_transformation_rule_ = makeString("Incrementing transformation rule considered count by zero; this is is vacuous and suspicious");
  public static final SubLInteger $int37$_100 = makeInteger(-100);
  public static final SubLSymbol $sym38$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLInteger $int39$100 = makeInteger(100);
  public static final SubLSymbol $sym40$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $kw41$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str42$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $kw43$INPUT = makeKeyword("INPUT");
  public static final SubLString $str44$Transformation_rule_statistics_up = makeString("Transformation rule statistics updating is not enabled.");
  public static final SubLString $str45$_________________________________ = makeString("~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
  public static final SubLString $str46$______S_rules__sorted_by__A = makeString("~%;; ~S rules, sorted by ~A");
  public static final SubLString $str47$________S__S___S_____utility____S = makeString("~%~%;; ~S/~S (~S %)  utility : ~S~%~S");
  public static final SubLString $str48$Save_recent_experience_lock = makeString("Save recent experience lock");
  public static final SubLString $str49$experience = makeString("experience");
  public static final SubLString $str50$_TS = makeString(".TS");
  public static final SubLString $str51$_CFASL = makeString(".CFASL");
  public static final SubLString $str52$_ts = makeString(".ts");
  public static final SubLString $str53$_cfasl = makeString(".cfasl");
  public static final SubLSymbol $sym54$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym55$DIRECTORY_P = makeSymbol("DIRECTORY-P");
  public static final SubLString $str56$Loading_transformation_rule_stati = makeString("Loading transformation rule statistics");
  public static final SubLString $str57$_experience_cfasl = makeString("-experience.cfasl");
  public static final SubLString $str58$_A = makeString("~A");
  public static final SubLFloat $float59$0_02939361143247565 = makeDouble(0.02939361143247565);
  public static final SubLString $str60$Repairing_transformation_rule_sta = makeString("Repairing transformation rule statistics");
  public static final SubLString $str61$Repairing__a_spurious_zeroes_in__ = makeString("Repairing ~a spurious zeroes in ~a~%");
  public static final SubLString $str62$_bloated_cfasl = makeString("-bloated.cfasl");
  public static final SubLString $str63$Could_not_load__a = makeString("Could not load ~a");
  public static final SubLSymbol $kw64$EOF = makeKeyword("EOF");
  public static final SubLSymbol $sym65$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH*");
  public static final SubLInteger $int66$256 = makeInteger(256);
  public static final SubLSymbol $sym67$_TRANSFORMATION_RULE_HISTORICAL_CONNECTIVITY_GRAPH_LOCK_ = makeSymbol("*TRANSFORMATION-RULE-HISTORICAL-CONNECTIVITY-GRAPH-LOCK*");
  public static final SubLString $str68$Rule_Historical_Connectivity_Grap = makeString("Rule Historical Connectivity Graph Lock");
  public static final SubLSymbol $sym69$SET_CONTENTS_P = makeSymbol("SET-CONTENTS-P");
  public static final SubLString $str70$Got_a_directed_instead_of_undirec = makeString("Got a directed instead of undirected link in the rule historical connectedness graph while trying to compute the ratio for ~s");
  public static final SubLString $str71$____Rule_____S__Connected_Rules__ = makeString("~%~%Rule :~%~S~%Connected Rules :");
  public static final SubLString $str72$___S = makeString("~%~S");
  public static final SubLSymbol $sym73$CLET = makeSymbol("CLET");
  public static final SubLList $list74 = list(list(makeSymbol("*HL-MODULE-EXPAND-COUNTS-ENABLED?*"), T), list(makeSymbol("*HL-MODULE-EXPAND-COUNTS*"), list(makeSymbol("NEW-DICTIONARY"))));
  public static final SubLSymbol $sym75$CDR = makeSymbol("CDR");
  public static final SubLList $list76 = cons(makeSymbol("HL-MODULE"), makeSymbol("COUNT"));
  public static final SubLString $str77$___4_D__S__ = makeString("~&~4,D ~S~%");
  public static final SubLSymbol $sym78$_ASKED_QUERIES_QUEUE_ = makeSymbol("*ASKED-QUERIES-QUEUE*");
  public static final SubLString $str79$Query_logging_lock = makeString("Query logging lock");
  public static final SubLInteger $int80$300 = makeInteger(300);
  public static final SubLList $list81 = list(makeKeyword("PROBLEM-STORE"));
  public static final SubLString $str82$Read_invalid_query_info__s = makeString("Read invalid query info ~s");
  public static final SubLList $list83 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));
  public static final SubLString $str84$asked_queries = makeString("asked-queries");
  public static final SubLSymbol $kw85$APPEND = makeKeyword("APPEND");
  public static final SubLSymbol $sym86$QUERY_INFO_P = makeSymbol("QUERY-INFO-P");
  public static final SubLString $str87$local_asked_queries_cfasl = makeString("local-asked-queries.cfasl");
  public static final SubLSymbol $sym88$_ASKED_QUERY_COMMON_SYMBOLS_ = makeSymbol("*ASKED-QUERY-COMMON-SYMBOLS*");
  public static final SubLObject $const89$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLObject $const90$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const91$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLObject $const92$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLObject $const93$resultGenls = constant_handles.reader_make_constant_shell(makeString("resultGenls"));
  public static final SubLObject $const94$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLObject $const95$resultQuotedIsa = constant_handles.reader_make_constant_shell(makeString("resultQuotedIsa"));
  public static final SubLObject $const96$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLString $str97$Entering__s__ = makeString("Entering ~s~%");
  public static final SubLInteger $int98$1000 = makeInteger(1000);
  public static final SubLString $str99$_ = makeString(".");
  public static final SubLString $str100$__Number_of_saved_queries_per_dir = makeString("~%Number of saved queries per directory:~%");
  public static final SubLString $str101$__Histogram_of_saved_queries_per_ = makeString("~%Histogram of saved queries per file:~%");
  public static final SubLString $str102$__Total_number_of_saved_queries__ = makeString("~%Total number of saved queries: ~s~%");
  public static final SubLString $str103$__Total_number_of_unique_saved_qu = makeString("~%Total number of unique saved queries: ~s~%~%");
  public static final SubLString $str104$_s_already_exists = makeString("~s already exists");
  public static final SubLString $str105$____Inference_heuristics_KE_file_ = makeString(";;; Inference heuristics KE file automatically generated on ~a~%");
  public static final SubLString $str106$in_mt____a____ = makeString("in mt : ~a .~%");
  public static final SubLObject $const107$irrelevantMt = constant_handles.reader_make_constant_shell(makeString("irrelevantMt"));
  public static final SubLObject $const108$backchainForbidden = constant_handles.reader_make_constant_shell(makeString("backchainForbidden"));
  public static final SubLObject $const109$irrelevantAssertion = constant_handles.reader_make_constant_shell(makeString("irrelevantAssertion"));

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_analysis_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_analysis_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_analysis_file();
  }

}
