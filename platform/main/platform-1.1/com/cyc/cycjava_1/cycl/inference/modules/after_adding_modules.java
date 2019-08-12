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

package com.cyc.cycjava_1.cycl.inference.modules;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.after_adding;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_low;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.forward;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_cache;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.predicate_relevance_cache;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.inference.harness.rule_after_adding;
//dm import com.cyc.cycjava_1.cycl.sdc;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.tva_cache;
//dm import com.cyc.cycjava_1.cycl.tva_utilities;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class after_adding_modules extends SubLTranslatedFile {

  //// Constructor

  private after_adding_modules() {}
  public static final SubLFile me = new after_adding_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.after_adding_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 1071) 
  private static SubLSymbol $cycl_functions_used_as_after_addings$ = null;

  /** possibly clear all mt dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2444) 
  public static final SubLObject clear_mt_dependent_caches(SubLObject argument, SubLObject assertion) {
    return possibly_clear_mt_dependent_caches(argument, assertion);
  }

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2658) 
  public static final SubLObject possibly_clear_mt_dependent_caches(SubLObject argument, SubLObject assertion) {
    if ((NIL != memoization_state.clear_mt_dependent_cachesP())) {
      clear_mt_dependent_caches_int(argument, assertion);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 2840) 
  public static final SubLObject clear_mt_dependent_caches_int(SubLObject argument, SubLObject assertion) {
    genl_mts.clear_all_base_mts();
    mt_relevance_cache.update_mt_relevance_cache(argument, assertion);
    predicate_relevance_cache.clear_predicate_relevance_cache();
    sdc.clear_cached_all_isa_sdct();
    tva_utilities.clear_cached_some_tva_for_predicate();
    {
      SubLObject cdolist_list_var = memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue();
      SubLObject callback = NIL;
      for (callback = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), callback = cdolist_list_var.first()) {
        if ((NIL != Symbols.fboundp(callback))) {
          Functions.funcall(callback);
        }
      }
    }
    return NIL;
  }

  /** Protection against infinite recursion. */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3350) 
  private static SubLSymbol $inside_clear_genls_dependent_cachesP$ = null;

  /** clear all genls dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3498) 
  public static final SubLObject clear_genls_dependent_caches(SubLObject argument, SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $inside_clear_genls_dependent_cachesP$.getDynamicValue(thread))) {
        {
          SubLObject _prev_bind_0 = $inside_clear_genls_dependent_cachesP$.currentBinding(thread);
          try {
            $inside_clear_genls_dependent_cachesP$.bind(T, thread);
            {
              SubLObject cdolist_list_var = memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue();
              SubLObject callback = NIL;
              for (callback = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), callback = cdolist_list_var.first()) {
                if ((NIL != Symbols.fboundp(callback))) {
                  Functions.funcall(callback);
                }
              }
              clear_isa_dependent_caches_internal();
              clear_quoted_isa_dependent_caches_internal();
            }
          } finally {
            $inside_clear_genls_dependent_cachesP$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** clear all isa dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 3969) 
  public static final SubLObject clear_isa_dependent_caches(SubLObject argument, SubLObject assertion) {
    clear_isa_dependent_caches_internal();
    return NIL;
  }

  public static final class $clear_isa_dependent_caches$BinaryFunction extends BinaryFunction {
    public $clear_isa_dependent_caches$BinaryFunction() { super(extractFunctionNamed("CLEAR-ISA-DEPENDENT-CACHES")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return clear_isa_dependent_caches(arg1, arg2); }
  }

  /** Protection against infinite recursion. */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4188) 
  private static SubLSymbol $inside_clear_isa_dependent_cachesP$ = null;

  /** clear all isa dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4296) 
  public static final SubLObject clear_isa_dependent_caches_internal() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $inside_clear_isa_dependent_cachesP$.getDynamicValue(thread))) {
        {
          SubLObject _prev_bind_0 = $inside_clear_isa_dependent_cachesP$.currentBinding(thread);
          try {
            $inside_clear_isa_dependent_cachesP$.bind(T, thread);
            sdc.clear_cached_all_isa_sdct();
            {
              SubLObject cdolist_list_var = memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue();
              SubLObject callback = NIL;
              for (callback = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), callback = cdolist_list_var.first()) {
                if ((NIL != Symbols.fboundp(callback))) {
                  Functions.funcall(callback);
                }
              }
            }
          } finally {
            $inside_clear_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** clear all quotedIsa dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4710) 
  public static final SubLObject clear_quoted_isa_dependent_caches(SubLObject argument, SubLObject assertion) {
    clear_quoted_isa_dependent_caches_internal();
    return NIL;
  }

  /** Protection against infinite recursion. */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 4955) 
  private static SubLSymbol $inside_clear_quoted_isa_dependent_cachesP$ = null;

  /** clear all quotedIsa dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 5070) 
  public static final SubLObject clear_quoted_isa_dependent_caches_internal() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $inside_clear_quoted_isa_dependent_cachesP$.getDynamicValue(thread))) {
        {
          SubLObject _prev_bind_0 = $inside_clear_quoted_isa_dependent_cachesP$.currentBinding(thread);
          try {
            $inside_clear_quoted_isa_dependent_cachesP$.bind(T, thread);
            {
              SubLObject cdolist_list_var = memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue();
              SubLObject callback = NIL;
              for (callback = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), callback = cdolist_list_var.first()) {
                if ((NIL != Symbols.fboundp(callback))) {
                  Functions.funcall(callback);
                }
              }
            }
          } finally {
            $inside_clear_quoted_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** clear all genlPreds and genlInverse dependent caches */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 5426) 
  public static final SubLObject clear_genl_pred_dependent_caches(SubLObject argument, SubLObject assertion) {
    predicate_relevance_cache.clear_predicate_relevance_cache();
    tva_utilities.clear_cached_some_tva_for_predicate();
    {
      SubLObject cdolist_list_var = memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue();
      SubLObject callback = NIL;
      for (callback = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), callback = cdolist_list_var.first()) {
        if ((NIL != Symbols.fboundp(callback))) {
          Functions.funcall(callback);
        }
      }
    }
    return NIL;
  }

  /** Update the cache after an oldConstantName assertion is added. */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 7599) 
  public static final SubLObject add_old_constant_name(SubLObject argument, SubLObject assertion) {
    if ((NIL != assertions_high.gaf_assertionP(assertion))) {
      {
        SubLObject constant = assertions_high.gaf_arg(assertion, ONE_INTEGER);
        SubLObject string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
        ke.cache_old_constant_name(string, constant);
        return NIL;
      }
    }
    return NIL;
  }

  /** Update the cache after an oldConstantName assertion is removed. */
  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 8004) 
  public static final SubLObject remove_old_constant_name(SubLObject argument, SubLObject assertion) {
    if ((NIL != assertions_high.gaf_assertionP(assertion))) {
      {
        SubLObject constant = assertions_high.gaf_arg(assertion, ONE_INTEGER);
        SubLObject string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
        ke.decache_old_constant_name(string, constant);
        return NIL;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14442) 
  private static SubLSymbol $true_rule_template$ = null;

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 14569) 
  public static SubLSymbol $true_rule_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 17965) 
  public static final SubLObject add_arity(SubLObject argument, SubLObject assertion) {
    if (((NIL != assertion_utilities.true_assertionP(assertion))
         && (NIL != assertions_high.only_argument_of_assertion_p(assertion, argument)))) {
      {
        SubLObject relation = assertions_high.gaf_arg1(assertion);
        SubLObject v_arity = assertions_high.gaf_arg2(assertion);
        arity.maybe_add_arity_for_relation(relation, v_arity);
      }
    }
    return assertion;
  }

  @SubL(source = "cycl/inference/modules/after-adding-modules.lisp", position = 18331) 
  public static final SubLObject remove_arity(SubLObject argument, SubLObject assertion) {
    if ((NIL == kb_accessors.assertion_still_thereP(assertion, $kw68$TRUE))) {
      {
        SubLObject relation = assertions_high.gaf_arg1(assertion);
        SubLObject v_arity = assertions_high.gaf_arg2(assertion);
        arity.maybe_remove_arity_for_relation(relation, v_arity);
      }
    }
    return assertion;
  }

  public static final SubLObject declare_after_adding_modules_file() {
    declareFunction(myName, "decache_after_addings", "DECACHE-AFTER-ADDINGS", 2, 0, false);
    declareFunction(myName, "decache_after_removings", "DECACHE-AFTER-REMOVINGS", 2, 0, false);
    declareFunction(myName, "decache_rule_after_addings", "DECACHE-RULE-AFTER-ADDINGS", 2, 0, false);
    declareFunction(myName, "decache_rule_after_removings", "DECACHE-RULE-AFTER-REMOVINGS", 2, 0, false);
    declareFunction(myName, "clear_mt_dependent_caches", "CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
    declareFunction(myName, "possibly_clear_mt_dependent_caches", "POSSIBLY-CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
    declareFunction(myName, "clear_mt_dependent_caches_int", "CLEAR-MT-DEPENDENT-CACHES-INT", 2, 0, false);
    declareFunction(myName, "clear_genls_dependent_caches", "CLEAR-GENLS-DEPENDENT-CACHES", 2, 0, false);
    declareFunction(myName, "clear_isa_dependent_caches", "CLEAR-ISA-DEPENDENT-CACHES", 2, 0, false); new $clear_isa_dependent_caches$BinaryFunction();
    declareFunction(myName, "clear_isa_dependent_caches_internal", "CLEAR-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
    declareFunction(myName, "clear_quoted_isa_dependent_caches", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES", 2, 0, false);
    declareFunction(myName, "clear_quoted_isa_dependent_caches_internal", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
    declareFunction(myName, "clear_genl_pred_dependent_caches", "CLEAR-GENL-PRED-DEPENDENT-CACHES", 2, 0, false);
    declareFunction(myName, "add_transitive_via_arg", "ADD-TRANSITIVE-VIA-ARG", 2, 0, false);
    declareFunction(myName, "remove_transitive_via_arg", "REMOVE-TRANSITIVE-VIA-ARG", 2, 0, false);
    declareFunction(myName, "add_transitive_via_arg_inverse", "ADD-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
    declareFunction(myName, "remove_transitive_via_arg_inverse", "REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
    declareFunction(myName, "clear_cached_tva_checks", "CLEAR-CACHED-TVA-CHECKS", 2, 0, false);
    declareFunction(myName, "clear_cached_some_tva_checks", "CLEAR-CACHED-SOME-TVA-CHECKS", 2, 0, false);
    declareFunction(myName, "clear_cached_cva_checks", "CLEAR-CACHED-CVA-CHECKS", 2, 0, false);
    declareFunction(myName, "clear_cached_some_cva_checks", "CLEAR-CACHED-SOME-CVA-CHECKS", 2, 0, false);
    declareFunction(myName, "skolem_after_removing", "SKOLEM-AFTER-REMOVING", 2, 0, false);
    declareFunction(myName, "add_old_constant_name", "ADD-OLD-CONSTANT-NAME", 2, 0, false);
    declareFunction(myName, "remove_old_constant_name", "REMOVE-OLD-CONSTANT-NAME", 2, 0, false);
    declareFunction(myName, "propagate_to_isa", "PROPAGATE-TO-ISA", 2, 0, false);
    declareFunction(myName, "propagate_to_genls", "PROPAGATE-TO-GENLS", 2, 0, false);
    declareFunction(myName, "propagate_to_disjointwith", "PROPAGATE-TO-DISJOINTWITH", 2, 0, false);
    declareFunction(myName, "propagate_to_genlmt", "PROPAGATE-TO-GENLMT", 2, 0, false);
    declareFunction(myName, "propagate_to_genlpreds", "PROPAGATE-TO-GENLPREDS", 2, 0, false);
    declareFunction(myName, "propagate_to_negationpreds", "PROPAGATE-TO-NEGATIONPREDS", 2, 0, false);
    declareFunction(myName, "propagate_to_genlinverse", "PROPAGATE-TO-GENLINVERSE", 2, 0, false);
    declareFunction(myName, "propagate_to_negationinverse", "PROPAGATE-TO-NEGATIONINVERSE", 2, 0, false);
    declareFunction(myName, "propagate_inverse_to_isa", "PROPAGATE-INVERSE-TO-ISA", 2, 0, false);
    declareFunction(myName, "propagate_inverse_to_genls", "PROPAGATE-INVERSE-TO-GENLS", 2, 0, false);
    declareFunction(myName, "propagate_inverse_to_genlmt", "PROPAGATE-INVERSE-TO-GENLMT", 2, 0, false);
    declareFunction(myName, "propagate_inverse_to_genlpreds", "PROPAGATE-INVERSE-TO-GENLPREDS", 2, 0, false);
    declareFunction(myName, "propagate_inverse_to_genlinverse", "PROPAGATE-INVERSE-TO-GENLINVERSE", 2, 0, false);
    declareFunction(myName, "propagate_sbhl_spec_pred_uses", "PROPAGATE-SBHL-SPEC-PRED-USES", 2, 0, false);
    declareFunction(myName, "propagate_sbhl_spec_inverse_uses", "PROPAGATE-SBHL-SPEC-INVERSE-USES", 2, 0, false);
    declareFunction(myName, "add_gen_keyword", "ADD-GEN-KEYWORD", 2, 0, false);
    declareFunction(myName, "add_ist", "ADD-IST", 2, 0, false);
    declareFunction(myName, "add_ist_el_support", "ADD-IST-EL-SUPPORT", 1, 0, false);
    declareFunction(myName, "add_true_rule", "ADD-TRUE-RULE", 2, 0, false);
    declareFunction(myName, "true_rule_el_support", "TRUE-RULE-EL-SUPPORT", 0, 0, false);
    declareFunction(myName, "true_rule_support_p", "TRUE-RULE-SUPPORT-P", 1, 0, false);
    declareFunction(myName, "rule_template_direction", "RULE-TEMPLATE-DIRECTION", 1, 1, false);
    declareFunction(myName, "add_rule_template_direction", "ADD-RULE-TEMPLATE-DIRECTION", 2, 0, false);
    declareFunction(myName, "remove_rule_template_direction", "REMOVE-RULE-TEMPLATE-DIRECTION", 2, 0, false);
    declareFunction(myName, "rule_template_instantiations", "RULE-TEMPLATE-INSTANTIATIONS", 1, 1, false);
    declareFunction(myName, "rule_template_instantiation_deduction", "RULE-TEMPLATE-INSTANTIATION-DEDUCTION", 1, 0, false);
    declareFunction(myName, "remove_dependent_term", "REMOVE-DEPENDENT-TERM", 2, 0, false);
    declareFunction(myName, "add_arity", "ADD-ARITY", 2, 0, false);
    declareFunction(myName, "remove_arity", "REMOVE-ARITY", 2, 0, false);
    declareFunction(myName, "add_arity_min", "ADD-ARITY-MIN", 2, 0, false);
    declareFunction(myName, "remove_arity_min", "REMOVE-ARITY-MIN", 2, 0, false);
    declareFunction(myName, "add_arity_max", "ADD-ARITY-MAX", 2, 0, false);
    declareFunction(myName, "remove_arity_max", "REMOVE-ARITY-MAX", 2, 0, false);
    declareFunction(myName, "inter_arg_isa_after_adding", "INTER-ARG-ISA-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "inter_arg_isa_after_removing", "INTER-ARG-ISA-AFTER-REMOVING", 2, 0, false);
    declareFunction(myName, "inter_arg_format_after_adding", "INTER-ARG-FORMAT-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "inter_arg_format_after_removing", "INTER-ARG-FORMAT-AFTER-REMOVING", 2, 0, false);
    declareFunction(myName, "add_to_contraction_ht", "ADD-TO-CONTRACTION-HT", 2, 0, false);
    declareFunction(myName, "remove_from_contraction_ht", "REMOVE-FROM-CONTRACTION-HT", 2, 0, false);
    declareFunction(myName, "add_gen_template_expansion", "ADD-GEN-TEMPLATE-EXPANSION", 2, 0, false);
    declareFunction(myName, "remove_gen_template_expansion", "REMOVE-GEN-TEMPLATE-EXPANSION", 2, 0, false);
    declareFunction(myName, "add_expansion_axiom", "ADD-EXPANSION-AXIOM", 2, 0, false);
    declareFunction(myName, "cyc_add_reformulation_assertion", "CYC-ADD-REFORMULATION-ASSERTION", 2, 0, false);
    declareFunction(myName, "cyc_remove_reformulation_assertion", "CYC-REMOVE-REFORMULATION-ASSERTION", 2, 0, false);
    declareFunction(myName, "cyc_add_element_of", "CYC-ADD-ELEMENT-OF", 2, 0, false);
    declareFunction(myName, "cyc_add_known_antecedent_rule", "CYC-ADD-KNOWN-ANTECEDENT-RULE", 2, 0, false);
    declareFunction(myName, "cyc_remove_known_antecedent_rule", "CYC-REMOVE-KNOWN-ANTECEDENT-RULE", 2, 0, false);
    declareFunction(myName, "add_merged_constant_guid", "ADD-MERGED-CONSTANT-GUID", 2, 0, false);
    declareFunction(myName, "remove_merged_constant_guid", "REMOVE-MERGED-CONSTANT-GUID", 2, 0, false);
    declareFunction(myName, "cyc_except_added", "CYC-EXCEPT-ADDED", 2, 0, false);
    declareFunction(myName, "cyc_except_removed", "CYC-EXCEPT-REMOVED", 2, 0, false);
    declareFunction(myName, "add_relation_instance_all", "ADD-RELATION-INSTANCE-ALL", 2, 0, false);
    declareFunction(myName, "remove_relation_instance_all", "REMOVE-RELATION-INSTANCE-ALL", 2, 0, false);
    declareFunction(myName, "add_relation_all_instance", "ADD-RELATION-ALL-INSTANCE", 2, 0, false);
    declareFunction(myName, "remove_relation_all_instance", "REMOVE-RELATION-ALL-INSTANCE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_after_adding_modules_file() {
    $cycl_functions_used_as_after_addings$ = deflexical("*CYCL-FUNCTIONS-USED-AS-AFTER-ADDINGS*", $list0);
    $inside_clear_genls_dependent_cachesP$ = defparameter("*INSIDE-CLEAR-GENLS-DEPENDENT-CACHES?*", NIL);
    $inside_clear_isa_dependent_cachesP$ = defparameter("*INSIDE-CLEAR-ISA-DEPENDENT-CACHES?*", NIL);
    $inside_clear_quoted_isa_dependent_cachesP$ = defparameter("*INSIDE-CLEAR-QUOTED-ISA-DEPENDENT-CACHES?*", NIL);
    $true_rule_template$ = defparameter("*TRUE-RULE-TEMPLATE*", $list55);
    $true_rule_defining_mt$ = deflexical("*TRUE-RULE-DEFINING-MT*", maybeDefault( $sym56$_TRUE_RULE_DEFINING_MT_, $true_rule_defining_mt$, ()-> ($const57$CoreCycLMt)));
    return NIL;
  }

  public static final SubLObject setup_after_adding_modules_file() {
        {
      SubLObject cdolist_list_var = $cycl_functions_used_as_after_addings$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_kb_function(symbol);
      }
    }
    utilities_macros.register_kb_function($sym2$DECACHE_AFTER_ADDINGS);
    utilities_macros.register_kb_function($sym3$DECACHE_AFTER_REMOVINGS);
    utilities_macros.register_kb_function($sym4$DECACHE_RULE_AFTER_ADDINGS);
    utilities_macros.register_kb_function($sym5$DECACHE_RULE_AFTER_REMOVINGS);
    utilities_macros.register_kb_function($sym6$CLEAR_MT_DEPENDENT_CACHES);
    utilities_macros.register_kb_function($sym7$CLEAR_GENLS_DEPENDENT_CACHES);
    utilities_macros.register_kb_function($sym8$CLEAR_ISA_DEPENDENT_CACHES);
    utilities_macros.register_kb_function($sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES);
    utilities_macros.register_kb_function($sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES);
    utilities_macros.register_kb_function($sym11$ADD_TRANSITIVE_VIA_ARG);
    utilities_macros.register_kb_function($sym12$REMOVE_TRANSITIVE_VIA_ARG);
    utilities_macros.register_kb_function($sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE);
    utilities_macros.register_kb_function($sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE);
    utilities_macros.register_kb_function($sym15$CLEAR_CACHED_TVA_CHECKS);
    utilities_macros.register_kb_function($sym16$CLEAR_CACHED_SOME_TVA_CHECKS);
    utilities_macros.register_kb_function($sym17$CLEAR_CACHED_CVA_CHECKS);
    utilities_macros.register_kb_function($sym18$CLEAR_CACHED_SOME_CVA_CHECKS);
    utilities_macros.register_kb_function($sym19$SKOLEM_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym20$ADD_OLD_CONSTANT_NAME);
    utilities_macros.register_kb_function($sym21$REMOVE_OLD_CONSTANT_NAME);
    utilities_macros.register_kb_function($sym23$PROPAGATE_TO_ISA);
    utilities_macros.register_kb_function($sym25$PROPAGATE_TO_GENLS);
    utilities_macros.register_kb_function($sym27$PROPAGATE_TO_DISJOINTWITH);
    utilities_macros.register_kb_function($sym29$PROPAGATE_TO_GENLMT);
    utilities_macros.register_kb_function($sym31$PROPAGATE_TO_GENLPREDS);
    utilities_macros.register_kb_function($sym33$PROPAGATE_TO_NEGATIONPREDS);
    utilities_macros.register_kb_function($sym35$PROPAGATE_TO_GENLINVERSE);
    utilities_macros.register_kb_function($sym37$PROPAGATE_TO_NEGATIONINVERSE);
    utilities_macros.register_kb_function($sym38$PROPAGATE_INVERSE_TO_ISA);
    utilities_macros.register_kb_function($sym39$PROPAGATE_INVERSE_TO_GENLS);
    utilities_macros.register_kb_function($sym40$PROPAGATE_INVERSE_TO_GENLMT);
    utilities_macros.register_kb_function($sym41$PROPAGATE_INVERSE_TO_GENLPREDS);
    utilities_macros.register_kb_function($sym42$PROPAGATE_INVERSE_TO_GENLINVERSE);
    utilities_macros.register_kb_function($sym46$ADD_GEN_KEYWORD);
    utilities_macros.register_kb_function($sym49$ADD_IST);
    utilities_macros.register_kb_function($sym54$ADD_TRUE_RULE);
    subl_macro_promotions.declare_defglobal($sym56$_TRUE_RULE_DEFINING_MT_);
    mt_vars.note_mt_var($sym56$_TRUE_RULE_DEFINING_MT_, $const58$trueRule);
    utilities_macros.register_kb_function($sym65$ADD_RULE_TEMPLATE_DIRECTION);
    utilities_macros.register_kb_function($sym66$REMOVE_RULE_TEMPLATE_DIRECTION);
    utilities_macros.register_kb_function($sym71$REMOVE_DEPENDENT_TERM);
    utilities_macros.register_kb_function($sym72$ADD_ARITY);
    utilities_macros.register_kb_function($sym73$REMOVE_ARITY);
    utilities_macros.register_kb_function($sym74$ADD_ARITY_MIN);
    utilities_macros.register_kb_function($sym75$REMOVE_ARITY_MIN);
    utilities_macros.register_kb_function($sym76$ADD_ARITY_MAX);
    utilities_macros.register_kb_function($sym77$REMOVE_ARITY_MAX);
    utilities_macros.register_kb_function($sym78$INTER_ARG_ISA_AFTER_ADDING);
    utilities_macros.register_kb_function($sym79$INTER_ARG_ISA_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym80$INTER_ARG_FORMAT_AFTER_ADDING);
    utilities_macros.register_kb_function($sym81$INTER_ARG_FORMAT_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym82$ADD_TO_CONTRACTION_HT);
    utilities_macros.register_kb_function($sym83$REMOVE_FROM_CONTRACTION_HT);
    utilities_macros.register_kb_function($sym84$ADD_GEN_TEMPLATE_EXPANSION);
    utilities_macros.register_kb_function($sym85$REMOVE_GEN_TEMPLATE_EXPANSION);
    utilities_macros.register_kb_function($sym94$ADD_EXPANSION_AXIOM);
    utilities_macros.register_kb_function($sym95$CYC_ADD_REFORMULATION_ASSERTION);
    utilities_macros.register_kb_function($sym96$CYC_REMOVE_REFORMULATION_ASSERTION);
    utilities_macros.register_kb_function($sym101$CYC_ADD_ELEMENT_OF);
    utilities_macros.register_kb_function($sym104$CYC_ADD_KNOWN_ANTECEDENT_RULE);
    utilities_macros.register_kb_function($sym105$CYC_REMOVE_KNOWN_ANTECEDENT_RULE);
    utilities_macros.register_kb_function($sym106$ADD_MERGED_CONSTANT_GUID);
    utilities_macros.register_kb_function($sym107$REMOVE_MERGED_CONSTANT_GUID);
    utilities_macros.register_kb_function($sym108$CYC_EXCEPT_ADDED);
    utilities_macros.register_kb_function($sym109$CYC_EXCEPT_REMOVED);
    utilities_macros.register_kb_function($sym110$ADD_RELATION_INSTANCE_ALL);
    utilities_macros.register_kb_function($sym111$REMOVE_RELATION_INSTANCE_ALL);
    utilities_macros.register_kb_function($sym112$ADD_RELATION_ALL_INSTANCE);
    utilities_macros.register_kb_function($sym113$REMOVE_RELATION_ALL_INSTANCE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("CLEAR-PARAPHRASE-CACHES"));
  public static final SubLSymbol $sym1$ARGUMENT_P = makeSymbol("ARGUMENT-P");
  public static final SubLSymbol $sym2$DECACHE_AFTER_ADDINGS = makeSymbol("DECACHE-AFTER-ADDINGS");
  public static final SubLSymbol $sym3$DECACHE_AFTER_REMOVINGS = makeSymbol("DECACHE-AFTER-REMOVINGS");
  public static final SubLSymbol $sym4$DECACHE_RULE_AFTER_ADDINGS = makeSymbol("DECACHE-RULE-AFTER-ADDINGS");
  public static final SubLSymbol $sym5$DECACHE_RULE_AFTER_REMOVINGS = makeSymbol("DECACHE-RULE-AFTER-REMOVINGS");
  public static final SubLSymbol $sym6$CLEAR_MT_DEPENDENT_CACHES = makeSymbol("CLEAR-MT-DEPENDENT-CACHES");
  public static final SubLSymbol $sym7$CLEAR_GENLS_DEPENDENT_CACHES = makeSymbol("CLEAR-GENLS-DEPENDENT-CACHES");
  public static final SubLSymbol $sym8$CLEAR_ISA_DEPENDENT_CACHES = makeSymbol("CLEAR-ISA-DEPENDENT-CACHES");
  public static final SubLSymbol $sym9$CLEAR_QUOTED_ISA_DEPENDENT_CACHES = makeSymbol("CLEAR-QUOTED-ISA-DEPENDENT-CACHES");
  public static final SubLSymbol $sym10$CLEAR_GENL_PRED_DEPENDENT_CACHES = makeSymbol("CLEAR-GENL-PRED-DEPENDENT-CACHES");
  public static final SubLSymbol $sym11$ADD_TRANSITIVE_VIA_ARG = makeSymbol("ADD-TRANSITIVE-VIA-ARG");
  public static final SubLSymbol $sym12$REMOVE_TRANSITIVE_VIA_ARG = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG");
  public static final SubLSymbol $sym13$ADD_TRANSITIVE_VIA_ARG_INVERSE = makeSymbol("ADD-TRANSITIVE-VIA-ARG-INVERSE");
  public static final SubLSymbol $sym14$REMOVE_TRANSITIVE_VIA_ARG_INVERSE = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG-INVERSE");
  public static final SubLSymbol $sym15$CLEAR_CACHED_TVA_CHECKS = makeSymbol("CLEAR-CACHED-TVA-CHECKS");
  public static final SubLSymbol $sym16$CLEAR_CACHED_SOME_TVA_CHECKS = makeSymbol("CLEAR-CACHED-SOME-TVA-CHECKS");
  public static final SubLSymbol $sym17$CLEAR_CACHED_CVA_CHECKS = makeSymbol("CLEAR-CACHED-CVA-CHECKS");
  public static final SubLSymbol $sym18$CLEAR_CACHED_SOME_CVA_CHECKS = makeSymbol("CLEAR-CACHED-SOME-CVA-CHECKS");
  public static final SubLSymbol $sym19$SKOLEM_AFTER_REMOVING = makeSymbol("SKOLEM-AFTER-REMOVING");
  public static final SubLSymbol $sym20$ADD_OLD_CONSTANT_NAME = makeSymbol("ADD-OLD-CONSTANT-NAME");
  public static final SubLSymbol $sym21$REMOVE_OLD_CONSTANT_NAME = makeSymbol("REMOVE-OLD-CONSTANT-NAME");
  public static final SubLObject $const22$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym23$PROPAGATE_TO_ISA = makeSymbol("PROPAGATE-TO-ISA");
  public static final SubLObject $const24$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym25$PROPAGATE_TO_GENLS = makeSymbol("PROPAGATE-TO-GENLS");
  public static final SubLObject $const26$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));
  public static final SubLSymbol $sym27$PROPAGATE_TO_DISJOINTWITH = makeSymbol("PROPAGATE-TO-DISJOINTWITH");
  public static final SubLObject $const28$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $sym29$PROPAGATE_TO_GENLMT = makeSymbol("PROPAGATE-TO-GENLMT");
  public static final SubLObject $const30$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $sym31$PROPAGATE_TO_GENLPREDS = makeSymbol("PROPAGATE-TO-GENLPREDS");
  public static final SubLObject $const32$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLSymbol $sym33$PROPAGATE_TO_NEGATIONPREDS = makeSymbol("PROPAGATE-TO-NEGATIONPREDS");
  public static final SubLObject $const34$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym35$PROPAGATE_TO_GENLINVERSE = makeSymbol("PROPAGATE-TO-GENLINVERSE");
  public static final SubLObject $const36$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $sym37$PROPAGATE_TO_NEGATIONINVERSE = makeSymbol("PROPAGATE-TO-NEGATIONINVERSE");
  public static final SubLSymbol $sym38$PROPAGATE_INVERSE_TO_ISA = makeSymbol("PROPAGATE-INVERSE-TO-ISA");
  public static final SubLSymbol $sym39$PROPAGATE_INVERSE_TO_GENLS = makeSymbol("PROPAGATE-INVERSE-TO-GENLS");
  public static final SubLSymbol $sym40$PROPAGATE_INVERSE_TO_GENLMT = makeSymbol("PROPAGATE-INVERSE-TO-GENLMT");
  public static final SubLSymbol $sym41$PROPAGATE_INVERSE_TO_GENLPREDS = makeSymbol("PROPAGATE-INVERSE-TO-GENLPREDS");
  public static final SubLSymbol $sym42$PROPAGATE_INVERSE_TO_GENLINVERSE = makeSymbol("PROPAGATE-INVERSE-TO-GENLINVERSE");
  public static final SubLList $list43 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $kw44$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLSymbol $kw45$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLSymbol $sym46$ADD_GEN_KEYWORD = makeSymbol("ADD-GEN-KEYWORD");
  public static final SubLList $list47 = list(makeSymbol("IST"), makeSymbol("MT"), makeSymbol("FORMULA"));
  public static final SubLObject $const48$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym49$ADD_IST = makeSymbol("ADD-IST");
  public static final SubLObject $const50$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLList $list51 = list(makeSymbol("?FORMULA"));
  public static final SubLSymbol $kw52$CODE = makeKeyword("CODE");
  public static final SubLSymbol $sym53$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLSymbol $sym54$ADD_TRUE_RULE = makeSymbol("ADD-TRUE-RULE");
  public static final SubLList $list55 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("trueRule")), makeSymbol("?TEMPLATE"), makeSymbol("?FORMULA")), makeSymbol("?FORMULA"));
  public static final SubLSymbol $sym56$_TRUE_RULE_DEFINING_MT_ = makeSymbol("*TRUE-RULE-DEFINING-MT*");
  public static final SubLObject $const57$CoreCycLMt = constant_handles.reader_make_constant_shell(makeString("CoreCycLMt"));
  public static final SubLObject $const58$trueRule = constant_handles.reader_make_constant_shell(makeString("trueRule"));
  public static final SubLSymbol $sym59$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const60$ruleTemplateDirection = constant_handles.reader_make_constant_shell(makeString("ruleTemplateDirection"));
  public static final SubLObject $const61$Forward_AssertionDirection = constant_handles.reader_make_constant_shell(makeString("Forward-AssertionDirection"));
  public static final SubLSymbol $kw62$FORWARD = makeKeyword("FORWARD");
  public static final SubLObject $const63$Backward_AssertionDirection = constant_handles.reader_make_constant_shell(makeString("Backward-AssertionDirection"));
  public static final SubLSymbol $kw64$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $sym65$ADD_RULE_TEMPLATE_DIRECTION = makeSymbol("ADD-RULE-TEMPLATE-DIRECTION");
  public static final SubLSymbol $sym66$REMOVE_RULE_TEMPLATE_DIRECTION = makeSymbol("REMOVE-RULE-TEMPLATE-DIRECTION");
  public static final SubLSymbol $kw67$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw68$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym69$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $sym70$TRUE_RULE_SUPPORT_P = makeSymbol("TRUE-RULE-SUPPORT-P");
  public static final SubLSymbol $sym71$REMOVE_DEPENDENT_TERM = makeSymbol("REMOVE-DEPENDENT-TERM");
  public static final SubLSymbol $sym72$ADD_ARITY = makeSymbol("ADD-ARITY");
  public static final SubLSymbol $sym73$REMOVE_ARITY = makeSymbol("REMOVE-ARITY");
  public static final SubLSymbol $sym74$ADD_ARITY_MIN = makeSymbol("ADD-ARITY-MIN");
  public static final SubLSymbol $sym75$REMOVE_ARITY_MIN = makeSymbol("REMOVE-ARITY-MIN");
  public static final SubLSymbol $sym76$ADD_ARITY_MAX = makeSymbol("ADD-ARITY-MAX");
  public static final SubLSymbol $sym77$REMOVE_ARITY_MAX = makeSymbol("REMOVE-ARITY-MAX");
  public static final SubLSymbol $sym78$INTER_ARG_ISA_AFTER_ADDING = makeSymbol("INTER-ARG-ISA-AFTER-ADDING");
  public static final SubLSymbol $sym79$INTER_ARG_ISA_AFTER_REMOVING = makeSymbol("INTER-ARG-ISA-AFTER-REMOVING");
  public static final SubLSymbol $sym80$INTER_ARG_FORMAT_AFTER_ADDING = makeSymbol("INTER-ARG-FORMAT-AFTER-ADDING");
  public static final SubLSymbol $sym81$INTER_ARG_FORMAT_AFTER_REMOVING = makeSymbol("INTER-ARG-FORMAT-AFTER-REMOVING");
  public static final SubLSymbol $sym82$ADD_TO_CONTRACTION_HT = makeSymbol("ADD-TO-CONTRACTION-HT");
  public static final SubLSymbol $sym83$REMOVE_FROM_CONTRACTION_HT = makeSymbol("REMOVE-FROM-CONTRACTION-HT");
  public static final SubLSymbol $sym84$ADD_GEN_TEMPLATE_EXPANSION = makeSymbol("ADD-GEN-TEMPLATE-EXPANSION");
  public static final SubLSymbol $sym85$REMOVE_GEN_TEMPLATE_EXPANSION = makeSymbol("REMOVE-GEN-TEMPLATE-EXPANSION");
  public static final SubLSymbol $sym86$NOT_EQ = makeSymbol("NOT-EQ");
  public static final SubLObject $const87$expansion = constant_handles.reader_make_constant_shell(makeString("expansion"));
  public static final SubLList $list88 = list(constant_handles.reader_make_constant_shell(makeString("afterAdding")), constant_handles.reader_make_constant_shell(makeString("expansionAxiom")), makeSymbol("ADD-EXPANSION-AXIOM"));
  public static final SubLObject $const89$expansionAxiom = constant_handles.reader_make_constant_shell(makeString("expansionAxiom"));
  public static final SubLSymbol $sym90$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $kw91$CNF = makeKeyword("CNF");
  public static final SubLSymbol $sym92$NEG_LITS = makeSymbol("NEG-LITS");
  public static final SubLObject $const93$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLSymbol $sym94$ADD_EXPANSION_AXIOM = makeSymbol("ADD-EXPANSION-AXIOM");
  public static final SubLSymbol $sym95$CYC_ADD_REFORMULATION_ASSERTION = makeSymbol("CYC-ADD-REFORMULATION-ASSERTION");
  public static final SubLSymbol $sym96$CYC_REMOVE_REFORMULATION_ASSERTION = makeSymbol("CYC-REMOVE-REFORMULATION-ASSERTION");
  public static final SubLList $list97 = list(makeSymbol("EO"), makeSymbol("TERM"), makeSymbol("SETEXPR"));
  public static final SubLObject $const98$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLObject $const99$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLList $list100 = list(makeSymbol("TSO"), makeSymbol("VAR"), makeSymbol("PROP"));
  public static final SubLSymbol $sym101$CYC_ADD_ELEMENT_OF = makeSymbol("CYC-ADD-ELEMENT-OF");
  public static final SubLSymbol $sym102$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $sym103$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $sym104$CYC_ADD_KNOWN_ANTECEDENT_RULE = makeSymbol("CYC-ADD-KNOWN-ANTECEDENT-RULE");
  public static final SubLSymbol $sym105$CYC_REMOVE_KNOWN_ANTECEDENT_RULE = makeSymbol("CYC-REMOVE-KNOWN-ANTECEDENT-RULE");
  public static final SubLSymbol $sym106$ADD_MERGED_CONSTANT_GUID = makeSymbol("ADD-MERGED-CONSTANT-GUID");
  public static final SubLSymbol $sym107$REMOVE_MERGED_CONSTANT_GUID = makeSymbol("REMOVE-MERGED-CONSTANT-GUID");
  public static final SubLSymbol $sym108$CYC_EXCEPT_ADDED = makeSymbol("CYC-EXCEPT-ADDED");
  public static final SubLSymbol $sym109$CYC_EXCEPT_REMOVED = makeSymbol("CYC-EXCEPT-REMOVED");
  public static final SubLSymbol $sym110$ADD_RELATION_INSTANCE_ALL = makeSymbol("ADD-RELATION-INSTANCE-ALL");
  public static final SubLSymbol $sym111$REMOVE_RELATION_INSTANCE_ALL = makeSymbol("REMOVE-RELATION-INSTANCE-ALL");
  public static final SubLSymbol $sym112$ADD_RELATION_ALL_INSTANCE = makeSymbol("ADD-RELATION-ALL-INSTANCE");
  public static final SubLSymbol $sym113$REMOVE_RELATION_ALL_INSTANCE = makeSymbol("REMOVE-RELATION-ALL-INSTANCE");

  //// Initializers

  public void declareFunctions() {
    declare_after_adding_modules_file();
  }

  public void initializeVariables() {
    init_after_adding_modules_file();
  }

  public void runTopLevelForms() {
    setup_after_adding_modules_file();
  }

}
