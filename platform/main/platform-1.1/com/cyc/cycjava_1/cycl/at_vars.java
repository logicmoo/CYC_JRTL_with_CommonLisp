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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class at_vars extends SubLTranslatedFile {

  //// Constructor

  private at_vars() {}
  public static final SubLFile me = new at_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.at_vars";

  //// Definitions

  @SubL(source = "cycl/at-vars.lisp", position = 528) 
  public static SubLSymbol $semantic_dnf_hl_filtering_enabled$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 697) 
  public static SubLSymbol $at_check_fn_symbolP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 878) 
  public static SubLSymbol $at_check_arg_genlsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 947) 
  public static SubLSymbol $at_check_arg_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1012) 
  public static SubLSymbol $at_check_arg_quoted_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1089) 
  public static SubLSymbol $at_check_arg_not_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1160) 
  public static SubLSymbol $at_check_arg_typesP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1292) 
  public static SubLSymbol $at_possibly_check_defining_mtsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1395) 
  public static SubLSymbol $at_check_defining_mtsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1470) 
  public static final SubLObject at_check_defining_mts_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $at_check_defining_mtsP$.getDynamicValue(thread))
             && (NIL != $at_possibly_check_defining_mtsP$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 1578) 
  public static SubLSymbol $at_check_inter_arg_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1656) 
  public static SubLSymbol $at_check_inter_arg_not_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1740) 
  public static SubLSymbol $at_check_inter_arg_genlP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1821) 
  public static SubLSymbol $at_check_non_constant_inter_arg_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 1927) 
  public static SubLSymbol $at_check_non_constant_inter_arg_genlP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2035) 
  public static SubLSymbol $at_check_non_constant_inter_arg_formatP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2164) 
  public static SubLSymbol $at_check_not_isa_disjointP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2257) 
  public static SubLSymbol $at_check_not_quoted_isa_disjointP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2363) 
  public static SubLSymbol $at_check_not_genls_disjointP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2459) 
  public static SubLSymbol $at_check_not_mdwP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2547) 
  public static SubLSymbol $at_check_not_sdcP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2635) 
  public static SubLSymbol $at_check_arg_formatP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2707) 
  public static SubLSymbol $at_check_sefP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2798) 
  public static SubLSymbol $at_check_relator_constraintsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 2900) 
  public static SubLSymbol $at_ensure_consistencyP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 3062) 
  public static SubLSymbol $at_pred_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 3428) 
  public static SubLSymbol $at_predicate_violations$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 3505) 
  public static SubLSymbol $at_check_inter_assert_format_wXo_arg_indexP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 3626) 
  public static SubLSymbol $at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 3805) 
  public static SubLSymbol $fag_search_limit$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 3908) 
  public static SubLSymbol $at_gaf_search_limit$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4077) 
  public static SubLSymbol $at_check_inter_arg_formatP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4178) 
  public static SubLSymbol $at_check_inter_arg_differentP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4281) 
  public static SubLSymbol $at_check_genl_predsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4359) 
  public static SubLSymbol $at_check_genl_inversesP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4442) 
  public static SubLSymbol $at_include_isa_literal_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4560) 
  public static SubLSymbol $at_include_genl_literal_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4681) 
  public static SubLSymbol $gather_at_constraintsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4759) 
  public static SubLSymbol $gather_at_assertionsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4835) 
  public static SubLSymbol $gather_at_format_violationsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 4923) 
  public static SubLSymbol $gather_at_different_violationsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5017) 
  public static SubLSymbol $gather_at_predicate_violationsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5144) 
  public static SubLSymbol $at_format_violations$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5215) 
  public static SubLSymbol $at_different_violations$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5292) 
  public static SubLSymbol $within_at_suggestionP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5392) 
  public static SubLSymbol $within_at_mappingP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5482) 
  public static SubLSymbol $at_break_on_failureP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5567) 
  public static SubLSymbol $accumulating_at_violationsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5690) 
  public static SubLSymbol $noting_at_violationsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5789) 
  public static SubLSymbol $at_trace_level$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 5935) 
  public static SubLSymbol $at_test_level$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6027) 
  public static SubLSymbol $appraising_disjunctP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6251) 
  public static SubLSymbol $within_decontextualizedP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6375) 
  public static SubLSymbol $within_disjunctionP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6475) 
  public static SubLSymbol $within_conjunctionP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6575) 
  public static SubLSymbol $within_negated_disjunctionP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6699) 
  public static SubLSymbol $within_negated_conjunctionP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6823) 
  public static SubLSymbol $within_functionP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 6936) 
  public static SubLSymbol $within_predicateP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 7040) 
  public static SubLSymbol $within_tou_gafP$ = null;

  /** @return boolean, t iff the formula being canonicalized isa a termOfUnit gaf? */
  @SubL(source = "cycl/at-vars.lisp", position = 7130) 
  public static final SubLObject within_tou_gafP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $within_tou_gafP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 7266) 
  public static SubLSymbol $relax_arg_constraints_for_disjunctionsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 7418) 
  public static SubLSymbol $at_relax_arg_constraints_for_opaque_expansion_natsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 7570) 
  public static SubLSymbol $at_admit_consistent_nautsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 7906) 
  public static SubLSymbol $at_admit_consistent_nartsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 8331) 
  public static SubLSymbol $at_result$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 8642) 
  public static SubLSymbol $at_some_arg_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 8779) 
  public static SubLSymbol $at_some_arg_isa_requiredP$ = null;

  /** @return boolean; must there be some arg-isa constraint applicable 
   to an arg for a given arg, relation, argnum to be wf? */
  @SubL(source = "cycl/at-vars.lisp", position = 8932) 
  public static final SubLObject at_some_arg_isa_requiredP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $at_some_arg_isa_requiredP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 9135) 
  public static SubLSymbol $at_consider_multiargs_at_predP$ = null;

  /** @return boolean; during arg-type analysis do we consider 
   multi-arg (argsIsa) constraints for specified args (arg1) */
  @SubL(source = "cycl/at-vars.lisp", position = 9286) 
  public static final SubLObject consider_multiargs_at_predP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $at_consider_multiargs_at_predP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 9491) 
  public static SubLSymbol $at_isa_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 9590) 
  public static SubLSymbol $at_genl_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 9690) 
  public static SubLSymbol $at_format_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 9794) 
  public static SubLSymbol $at_different_constraints$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 9904) 
  public static SubLSymbol $at_isa_assertions$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10000) 
  public static SubLSymbol $at_genl_assertions$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10098) 
  public static SubLSymbol $at_format_assertions$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10200) 
  public static SubLSymbol $at_different_assertions$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10308) 
  public static SubLSymbol $at_mode$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10399) 
  public static SubLSymbol $at_constraint_type$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10508) 
  public static SubLSymbol $at_arg_type$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10624) 
  public static SubLSymbol $at_base_fn$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10727) 
  public static SubLSymbol $at_formula$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10786) 
  public static SubLSymbol $at_pred$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 10938) 
  public static SubLSymbol $at_inverse$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11047) 
  public static SubLSymbol $at_reln$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11129) 
  public static SubLSymbol $at_arg$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11209) 
  public static SubLSymbol $at_argnum$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11297) 
  public static SubLSymbol $at_arg1$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11403) 
  public static SubLSymbol $at_arg2$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11509) 
  public static SubLSymbol $at_ind_argnum$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11618) 
  public static SubLSymbol $at_ind_arg$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11724) 
  public static SubLSymbol $at_ind_isa$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11825) 
  public static SubLSymbol $at_ind_genl$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 11928) 
  public static SubLSymbol $at_arg_isa$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12012) 
  public static SubLSymbol $at_source$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12129) 
  public static SubLSymbol $at_mapping_genl_inversesP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12248) 
  public static SubLSymbol $at_search_genl_predsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12333) 
  public static SubLSymbol $at_search_genl_inversesP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12424) 
  public static final SubLObject at_searching_genl_predsP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $at_search_genl_predsP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 12491) 
  public static final SubLObject at_searching_genl_inversesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $at_search_genl_inversesP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 12564) 
  public static SubLSymbol $at_profile_term$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12678) 
  public static SubLSymbol $at_constraint_gaf$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12778) 
  public static SubLSymbol $include_at_constraint_gafP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 12919) 
  public static SubLSymbol $at_var_isa$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 13115) 
  public static SubLSymbol $at_var_genl$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 13241) 
  public static SubLSymbol $at_var_types_standard$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 13368) 
  public static SubLSymbol $at_assume_conjuncts_independentP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 13651) 
  public static SubLSymbol $current_at_violation$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 13799) 
  public static SubLSymbol $at_violations$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 13914) 
  public static SubLSymbol $at_disjoins_space$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14057) 
  public static SubLSymbol $at_isa_space$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14133) 
  public static SubLSymbol $at_genls_space$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14213) 
  public static SubLSymbol $at_defns_availableP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14518) 
  public static SubLSymbol $at_apply_necessary_defnsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14622) 
  public static SubLSymbol $sort_suf_defn_assertionsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14747) 
  public static SubLSymbol $sort_suf_function_assertionsP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 14952) 
  public static SubLSymbol $at_collection_specific_defns$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15105) 
  public static SubLSymbol $defn_trace_level$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15267) 
  public static SubLSymbol $defn_test_level$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15363) 
  public static SubLSymbol $defn_metersP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15449) 
  public static SubLSymbol $suf_defn_cache$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15607) 
  public static SubLSymbol $suf_quoted_defn_cache$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15700) 
  public static SubLSymbol $defn_meter_caches$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 15817) 
  public static SubLSymbol $defn_collection$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 16100) 
  public static SubLSymbol $permitting_denotational_terms_admitted_by_defn_via_isaP$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 16251) 
  public static final SubLObject permitting_denotational_terms_admitted_by_defn_via_isaP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $permitting_denotational_terms_admitted_by_defn_via_isaP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/at-vars.lisp", position = 16587) 
  public static SubLSymbol $at_defn$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 16658) 
  public static SubLSymbol $at_defns$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 16730) 
  public static SubLSymbol $suf_function_cache$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 16802) 
  public static SubLSymbol $suf_quoted_function_cache$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 16898) 
  public static SubLSymbol $at_function$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17006) 
  public static SubLSymbol $at_functions$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17097) 
  public static SubLSymbol $defn_fn_history_default_size$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17235) 
  public static SubLSymbol $defn_col_history_default_size$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17340) 
  public static SubLSymbol $defn_col_history$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17495) 
  public static SubLSymbol $quoted_defn_col_history$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17664) 
  public static SubLSymbol $defn_fn_history$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17815) 
  public static SubLSymbol $quoted_defn_fn_history$ = null;

  @SubL(source = "cycl/at-vars.lisp", position = 17980) 
  public static SubLSymbol $defn_stack$ = null;

  public static final SubLObject declare_at_vars_file() {
    declareFunction(myName, "at_check_arg_types_p", "AT-CHECK-ARG-TYPES-P", 0, 0, false);
    declareFunction(myName, "at_check_defining_mts_p", "AT-CHECK-DEFINING-MTS-P", 0, 0, false);
    declareFunction(myName, "within_tou_gafP", "WITHIN-TOU-GAF?", 0, 0, false);
    declareFunction(myName, "at_some_arg_isa_requiredP", "AT-SOME-ARG-ISA-REQUIRED?", 0, 0, false);
    declareFunction(myName, "consider_multiargs_at_predP", "CONSIDER-MULTIARGS-AT-PRED?", 0, 0, false);
    declareFunction(myName, "at_searching_genl_predsP", "AT-SEARCHING-GENL-PREDS?", 0, 0, false);
    declareFunction(myName, "at_searching_genl_inversesP", "AT-SEARCHING-GENL-INVERSES?", 0, 0, false);
    declareFunction(myName, "defn_collection", "DEFN-COLLECTION", 0, 0, false);
    declareFunction(myName, "permitting_denotational_terms_admitted_by_defn_via_isaP", "PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?", 0, 0, false);
    declareMacro(myName, "without_permitting_denotational_terms_admitted_by_defn_via_isaP", "WITHOUT-PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?");
    declareFunction(myName, "new_at_parameter_state_from_context", "NEW-AT-PARAMETER-STATE-FROM-CONTEXT", 0, 0, false);
    declareFunction(myName, "default_at_parameter_stateP", "DEFAULT-AT-PARAMETER-STATE?", 0, 0, false);
    declareFunction(myName, "no_defining_mts_at_parameter_stateP", "NO-DEFINING-MTS-AT-PARAMETER-STATE?", 0, 0, false);
    declareFunction(myName, "no_arg_types_at_parameter_stateP", "NO-ARG-TYPES-AT-PARAMETER-STATE?", 0, 0, false);
    declareFunction(myName, "no_arg_format_at_parameter_stateP", "NO-ARG-FORMAT-AT-PARAMETER-STATE?", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_at_vars_file() {
    $semantic_dnf_hl_filtering_enabled$ = defparameter("*SEMANTIC-DNF-HL-FILTERING-ENABLED*", NIL);
    $at_check_fn_symbolP$ = defparameter("*AT-CHECK-FN-SYMBOL?*", T);
    $at_check_arg_genlsP$ = defparameter("*AT-CHECK-ARG-GENLS?*", T);
    $at_check_arg_isaP$ = defparameter("*AT-CHECK-ARG-ISA?*", T);
    $at_check_arg_quoted_isaP$ = defparameter("*AT-CHECK-ARG-QUOTED-ISA?*", T);
    $at_check_arg_not_isaP$ = defparameter("*AT-CHECK-ARG-NOT-ISA?*", T);
    $at_check_arg_typesP$ = defparameter("*AT-CHECK-ARG-TYPES?*", T);
    $at_possibly_check_defining_mtsP$ = defparameter("*AT-POSSIBLY-CHECK-DEFINING-MTS?*", NIL);
    $at_check_defining_mtsP$ = defparameter("*AT-CHECK-DEFINING-MTS?*", T);
    $at_check_inter_arg_isaP$ = defparameter("*AT-CHECK-INTER-ARG-ISA?*", T);
    $at_check_inter_arg_not_isaP$ = defparameter("*AT-CHECK-INTER-ARG-NOT-ISA?*", T);
    $at_check_inter_arg_genlP$ = defparameter("*AT-CHECK-INTER-ARG-GENL?*", NIL);
    $at_check_non_constant_inter_arg_isaP$ = defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*", T);
    $at_check_non_constant_inter_arg_genlP$ = defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*", T);
    $at_check_non_constant_inter_arg_formatP$ = defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*", T);
    $at_check_not_isa_disjointP$ = defparameter("*AT-CHECK-NOT-ISA-DISJOINT?*", T);
    $at_check_not_quoted_isa_disjointP$ = defparameter("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*", T);
    $at_check_not_genls_disjointP$ = defparameter("*AT-CHECK-NOT-GENLS-DISJOINT?*", T);
    $at_check_not_mdwP$ = defparameter("*AT-CHECK-NOT-MDW?*", T);
    $at_check_not_sdcP$ = defparameter("*AT-CHECK-NOT-SDC?*", T);
    $at_check_arg_formatP$ = defparameter("*AT-CHECK-ARG-FORMAT?*", T);
    $at_check_sefP$ = defparameter("*AT-CHECK-SEF?*", T);
    $at_check_relator_constraintsP$ = defparameter("*AT-CHECK-RELATOR-CONSTRAINTS?*", T);
    $at_ensure_consistencyP$ = defparameter("*AT-ENSURE-CONSISTENCY?*", NIL);
    $at_pred_constraints$ = defparameter("*AT-PRED-CONSTRAINTS*", $list48);
    $at_predicate_violations$ = defparameter("*AT-PREDICATE-VIOLATIONS*", NIL);
    $at_check_inter_assert_format_wXo_arg_indexP$ = defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*", T);
    $at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$ = defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*", $int54$100);
    $fag_search_limit$ = defparameter("*FAG-SEARCH-LIMIT*", NIL);
    $at_gaf_search_limit$ = defparameter("*AT-GAF-SEARCH-LIMIT*", $int54$100);
    $at_check_inter_arg_formatP$ = defparameter("*AT-CHECK-INTER-ARG-FORMAT?*", T);
    $at_check_inter_arg_differentP$ = defparameter("*AT-CHECK-INTER-ARG-DIFFERENT?*", T);
    $at_check_genl_predsP$ = defparameter("*AT-CHECK-GENL-PREDS?*", T);
    $at_check_genl_inversesP$ = defparameter("*AT-CHECK-GENL-INVERSES?*", T);
    $at_include_isa_literal_constraints$ = defparameter("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*", T);
    $at_include_genl_literal_constraints$ = defparameter("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*", T);
    $gather_at_constraintsP$ = defparameter("*GATHER-AT-CONSTRAINTS?*", NIL);
    $gather_at_assertionsP$ = defparameter("*GATHER-AT-ASSERTIONS?*", NIL);
    $gather_at_format_violationsP$ = defparameter("*GATHER-AT-FORMAT-VIOLATIONS?*", NIL);
    $gather_at_different_violationsP$ = defparameter("*GATHER-AT-DIFFERENT-VIOLATIONS?*", NIL);
    $gather_at_predicate_violationsP$ = defparameter("*GATHER-AT-PREDICATE-VIOLATIONS?*", NIL);
    $at_format_violations$ = defparameter("*AT-FORMAT-VIOLATIONS*", NIL);
    $at_different_violations$ = defparameter("*AT-DIFFERENT-VIOLATIONS*", NIL);
    $within_at_suggestionP$ = defparameter("*WITHIN-AT-SUGGESTION?*", NIL);
    $within_at_mappingP$ = defparameter("*WITHIN-AT-MAPPING?*", NIL);
    $at_break_on_failureP$ = defparameter("*AT-BREAK-ON-FAILURE?*", NIL);
    $accumulating_at_violationsP$ = defparameter("*ACCUMULATING-AT-VIOLATIONS?*", NIL);
    $noting_at_violationsP$ = defparameter("*NOTING-AT-VIOLATIONS?*", NIL);
    $at_trace_level$ = defparameter("*AT-TRACE-LEVEL*", ONE_INTEGER);
    $at_test_level$ = defparameter("*AT-TEST-LEVEL*", THREE_INTEGER);
    $appraising_disjunctP$ = defparameter("*APPRAISING-DISJUNCT?*", NIL);
    $within_decontextualizedP$ = defparameter("*WITHIN-DECONTEXTUALIZED?*", NIL);
    $within_disjunctionP$ = defparameter("*WITHIN-DISJUNCTION?*", NIL);
    $within_conjunctionP$ = defparameter("*WITHIN-CONJUNCTION?*", NIL);
    $within_negated_disjunctionP$ = defparameter("*WITHIN-NEGATED-DISJUNCTION?*", NIL);
    $within_negated_conjunctionP$ = defparameter("*WITHIN-NEGATED-CONJUNCTION?*", NIL);
    $within_functionP$ = defparameter("*WITHIN-FUNCTION?*", NIL);
    $within_predicateP$ = defparameter("*WITHIN-PREDICATE?*", NIL);
    $within_tou_gafP$ = defparameter("*WITHIN-TOU-GAF?*", NIL);
    $relax_arg_constraints_for_disjunctionsP$ = defparameter("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*", T);
    $at_relax_arg_constraints_for_opaque_expansion_natsP$ = defparameter("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*", T);
    $at_admit_consistent_nautsP$ = defparameter("*AT-ADMIT-CONSISTENT-NAUTS?*", T);
    $at_admit_consistent_nartsP$ = defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", T);
    $at_result$ = defparameter("*AT-RESULT*", NIL);
    $at_some_arg_isaP$ = defparameter("*AT-SOME-ARG-ISA?*", NIL);
    $at_some_arg_isa_requiredP$ = defparameter("*AT-SOME-ARG-ISA-REQUIRED?*", NIL);
    $at_consider_multiargs_at_predP$ = defparameter("*AT-CONSIDER-MULTIARGS-AT-PRED?*", T);
    $at_isa_constraints$ = defparameter("*AT-ISA-CONSTRAINTS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_genl_constraints$ = defparameter("*AT-GENL-CONSTRAINTS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_format_constraints$ = defparameter("*AT-FORMAT-CONSTRAINTS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_different_constraints$ = defparameter("*AT-DIFFERENT-CONSTRAINTS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_isa_assertions$ = defparameter("*AT-ISA-ASSERTIONS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_genl_assertions$ = defparameter("*AT-GENL-ASSERTIONS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_format_assertions$ = defparameter("*AT-FORMAT-ASSERTIONS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_different_assertions$ = defparameter("*AT-DIFFERENT-ASSERTIONS*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_mode$ = defparameter("*AT-MODE*", NIL);
    $at_constraint_type$ = defparameter("*AT-CONSTRAINT-TYPE*", NIL);
    $at_arg_type$ = defparameter("*AT-ARG-TYPE*", NIL);
    $at_base_fn$ = defparameter("*AT-BASE-FN*", NIL);
    $at_formula$ = defparameter("*AT-FORMULA*", NIL);
    $at_pred$ = defparameter("*AT-PRED*", NIL);
    $at_inverse$ = defparameter("*AT-INVERSE*", NIL);
    $at_reln$ = defparameter("*AT-RELN*", NIL);
    $at_arg$ = defparameter("*AT-ARG*", NIL);
    $at_argnum$ = defparameter("*AT-ARGNUM*", NIL);
    $at_arg1$ = defparameter("*AT-ARG1*", NIL);
    $at_arg2$ = defparameter("*AT-ARG2*", NIL);
    $at_ind_argnum$ = defparameter("*AT-IND-ARGNUM*", NIL);
    $at_ind_arg$ = defparameter("*AT-IND-ARG*", NIL);
    $at_ind_isa$ = defparameter("*AT-IND-ISA*", NIL);
    $at_ind_genl$ = defparameter("*AT-IND-GENL*", NIL);
    $at_arg_isa$ = defparameter("*AT-ARG-ISA*", NIL);
    $at_source$ = defparameter("*AT-SOURCE*", NIL);
    $at_mapping_genl_inversesP$ = defparameter("*AT-MAPPING-GENL-INVERSES?*", NIL);
    $at_search_genl_predsP$ = defparameter("*AT-SEARCH-GENL-PREDS?*", T);
    $at_search_genl_inversesP$ = defparameter("*AT-SEARCH-GENL-INVERSES?*", T);
    $at_profile_term$ = defparameter("*AT-PROFILE-TERM*", NIL);
    $at_constraint_gaf$ = defparameter("*AT-CONSTRAINT-GAF*", NIL);
    $include_at_constraint_gafP$ = defparameter("*INCLUDE-AT-CONSTRAINT-GAF?*", T);
    $at_var_isa$ = defparameter("*AT-VAR-ISA*", NIL);
    $at_var_genl$ = defparameter("*AT-VAR-GENL*", NIL);
    $at_var_types_standard$ = defparameter("*AT-VAR-TYPES-STANDARD*", $kw204$NOT_DISJOINT);
    $at_assume_conjuncts_independentP$ = defparameter("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*", T);
    $current_at_violation$ = defparameter("*CURRENT-AT-VIOLATION*", NIL);
    $at_violations$ = defparameter("*AT-VIOLATIONS*", NIL);
    $at_disjoins_space$ = defparameter("*AT-DISJOINS-SPACE*", NIL);
    $at_isa_space$ = defparameter("*AT-ISA-SPACE*", NIL);
    $at_genls_space$ = defparameter("*AT-GENLS-SPACE*", NIL);
    $at_defns_availableP$ = defparameter("*AT-DEFNS-AVAILABLE?*", T);
    $at_apply_necessary_defnsP$ = defparameter("*AT-APPLY-NECESSARY-DEFNS?*", T);
    $sort_suf_defn_assertionsP$ = defparameter("*SORT-SUF-DEFN-ASSERTIONS?*", T);
    $sort_suf_function_assertionsP$ = defparameter("*SORT-SUF-FUNCTION-ASSERTIONS?*", NIL);
    $at_collection_specific_defns$ = defvar("*AT-COLLECTION-SPECIFIC-DEFNS*", NIL);
    $defn_trace_level$ = defparameter("*DEFN-TRACE-LEVEL*", ONE_INTEGER);
    $defn_test_level$ = defparameter("*DEFN-TEST-LEVEL*", THREE_INTEGER);
    $defn_metersP$ = defparameter("*DEFN-METERS?*", NIL);
    $suf_defn_cache$ = defvar("*SUF-DEFN-CACHE*", Hashtables.make_hash_table($int233$256, UNPROVIDED, UNPROVIDED));
    $suf_quoted_defn_cache$ = defvar("*SUF-QUOTED-DEFN-CACHE*", Hashtables.make_hash_table($int235$200, UNPROVIDED, UNPROVIDED));
    $defn_meter_caches$ = defparameter("*DEFN-METER-CACHES*", NIL);
    $defn_collection$ = defparameter("*DEFN-COLLECTION*", NIL);
    $permitting_denotational_terms_admitted_by_defn_via_isaP$ = defparameter("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*", T);
    $at_defn$ = defparameter("*AT-DEFN*", NIL);
    $at_defns$ = defparameter("*AT-DEFNS*", NIL);
    $suf_function_cache$ = defvar("*SUF-FUNCTION-CACHE*", Hashtables.make_hash_table($int233$256, UNPROVIDED, UNPROVIDED));
    $suf_quoted_function_cache$ = defvar("*SUF-QUOTED-FUNCTION-CACHE*", Hashtables.make_hash_table($int135$64, UNPROVIDED, UNPROVIDED));
    $at_function$ = defparameter("*AT-FUNCTION*", NIL);
    $at_functions$ = defparameter("*AT-FUNCTIONS*", NIL);
    $defn_fn_history_default_size$ = defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", $int255$32);
    $defn_col_history_default_size$ = defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", $int135$64);
    $defn_col_history$ = defparameter("*DEFN-COL-HISTORY*", $kw260$UNINITIALIZED);
    $quoted_defn_col_history$ = defparameter("*QUOTED-DEFN-COL-HISTORY*", $kw260$UNINITIALIZED);
    $defn_fn_history$ = defparameter("*DEFN-FN-HISTORY*", $kw260$UNINITIALIZED);
    $quoted_defn_fn_history$ = defparameter("*QUOTED-DEFN-FN-HISTORY*", $kw260$UNINITIALIZED);
    $defn_stack$ = defparameter("*DEFN-STACK*", $kw260$UNINITIALIZED);
    return NIL;
  }

  public static final SubLObject setup_at_vars_file() {
    // CVS_ID("Id: at-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    {
      SubLObject item_var = $sym0$_SEMANTIC_DNF_HL_FILTERING_ENABLED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym0$_SEMANTIC_DNF_HL_FILTERING_ENABLED_, $str1$should_the_inference_engine_use_a);
    {
      SubLObject item_var = $sym2$_AT_CHECK_FN_SYMBOL__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym2$_AT_CHECK_FN_SYMBOL__, $str3$require_function_symbols_be_insta);
    {
      SubLObject item_var = $sym4$_AT_CHECK_ARG_GENLS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym4$_AT_CHECK_ARG_GENLS__, $str5$enforce___argGenl_constraints_);
    {
      SubLObject item_var = $sym6$_AT_CHECK_ARG_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym6$_AT_CHECK_ARG_ISA__, $str7$enforce_argIsa_constraints_);
    {
      SubLObject item_var = $sym8$_AT_CHECK_ARG_QUOTED_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym8$_AT_CHECK_ARG_QUOTED_ISA__, $str9$enforce_argQuotedIsa_constraints_);
    {
      SubLObject item_var = $sym10$_AT_CHECK_ARG_NOT_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym10$_AT_CHECK_ARG_NOT_ISA__, $str11$enforce_argNotIsa_constraints_);
    {
      SubLObject item_var = $sym12$_AT_CHECK_ARG_TYPES__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym12$_AT_CHECK_ARG_TYPES__, $str13$enforce_arg_typing_constraints_);
    {
      SubLObject item_var = $sym14$_AT_POSSIBLY_CHECK_DEFINING_MTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym14$_AT_POSSIBLY_CHECK_DEFINING_MTS__, $str15$is___definingMt_constraint_enforc);
    {
      SubLObject item_var = $sym16$_AT_CHECK_DEFINING_MTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym16$_AT_CHECK_DEFINING_MTS__, $str17$enforce___definingMt_constraints_);
    {
      SubLObject item_var = $sym18$_AT_CHECK_INTER_ARG_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym18$_AT_CHECK_INTER_ARG_ISA__, $str19$enforce___interArgIsa_constraints);
    {
      SubLObject item_var = $sym20$_AT_CHECK_INTER_ARG_NOT_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym20$_AT_CHECK_INTER_ARG_NOT_ISA__, $str21$enforce___interArgNotIsa_constrai);
    {
      SubLObject item_var = $sym22$_AT_CHECK_INTER_ARG_GENL__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym22$_AT_CHECK_INTER_ARG_GENL__, $str23$enforce___interArgGenl_constraint);
    {
      SubLObject item_var = $sym24$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym24$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__, $str25$enforce_interArgIsa_constraints_f);
    {
      SubLObject item_var = $sym26$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym26$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__, $str27$enforce_interArgGenl_constraints_);
    {
      SubLObject item_var = $sym28$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym28$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__, $str29$enforce_interArgFormat1_2__and_si);
    {
      SubLObject item_var = $sym30$_AT_CHECK_NOT_ISA_DISJOINT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym30$_AT_CHECK_NOT_ISA_DISJOINT__, $str31$enforce___argIsa_constraints_for_);
    {
      SubLObject item_var = $sym32$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym32$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__, $str33$enforce___argQuotedIsa_constraint);
    {
      SubLObject item_var = $sym34$_AT_CHECK_NOT_GENLS_DISJOINT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym34$_AT_CHECK_NOT_GENLS_DISJOINT__, $str35$enforce___argGenl_constraints_for);
    {
      SubLObject item_var = $sym36$_AT_CHECK_NOT_MDW__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym36$_AT_CHECK_NOT_MDW__, $str37$enforce__not_disjoint_constraints);
    {
      SubLObject item_var = $sym38$_AT_CHECK_NOT_SDC__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym38$_AT_CHECK_NOT_SDC__, $str39$enforce__not_disjoint_constraints);
    {
      SubLObject item_var = $sym40$_AT_CHECK_ARG_FORMAT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym40$_AT_CHECK_ARG_FORMAT__, $str41$enforce___argformat_constraints_);
    {
      SubLObject item_var = $sym42$_AT_CHECK_SEF__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym42$_AT_CHECK_SEF__, $str43$enforce___singleEntryFormatInArgs);
    {
      SubLObject item_var = $sym44$_AT_CHECK_RELATOR_CONSTRAINTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym44$_AT_CHECK_RELATOR_CONSTRAINTS__, $str45$enforce_asymmetric_predicate_and_);
    {
      SubLObject item_var = $sym46$_AT_ENSURE_CONSISTENCY__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym46$_AT_ENSURE_CONSISTENCY__, $str47$enforce_consistency_at_constraint);
    {
      SubLObject item_var = $sym49$_AT_PRED_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym49$_AT_PRED_CONSTRAINTS_, NIL);
    {
      SubLObject item_var = $sym50$_AT_PREDICATE_VIOLATIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym50$_AT_PREDICATE_VIOLATIONS_, $str51$relevant_at_predicate_violations);
    {
      SubLObject item_var = $sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__, $str53$enforce_inter_assert_formats_even);
    {
      SubLObject item_var = $sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_, $str56$max_number_of_relevant_gafs_to_pe);
    {
      SubLObject item_var = $sym57$_FAG_SEARCH_LIMIT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym57$_FAG_SEARCH_LIMIT_, $str58$max_number_of_relevant_gafs_to_pe);
    {
      SubLObject item_var = $sym59$_AT_GAF_SEARCH_LIMIT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym59$_AT_GAF_SEARCH_LIMIT_, $str60$default_max_number_of_relevant_ga);
    {
      SubLObject item_var = $sym61$_AT_CHECK_INTER_ARG_FORMAT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym61$_AT_CHECK_INTER_ARG_FORMAT__, $str62$enforce___interArgFormat1_2__and_);
    {
      SubLObject item_var = $sym63$_AT_CHECK_INTER_ARG_DIFFERENT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym63$_AT_CHECK_INTER_ARG_DIFFERENT__, $str64$enforce___interArgDifferent__and_);
    {
      SubLObject item_var = $sym65$_AT_CHECK_GENL_PREDS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym65$_AT_CHECK_GENL_PREDS__, $str66$enforce_arg_constraints_of_genlPr);
    {
      SubLObject item_var = $sym67$_AT_CHECK_GENL_INVERSES__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym67$_AT_CHECK_GENL_INVERSES__, $str68$enforce_arg_constraints_of_genlIn);
    {
      SubLObject item_var = $sym69$_AT_INCLUDE_ISA_LITERAL_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym69$_AT_INCLUDE_ISA_LITERAL_CONSTRAINTS_, $str70$include_explicit___isa_literals_w);
    {
      SubLObject item_var = $sym71$_AT_INCLUDE_GENL_LITERAL_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym71$_AT_INCLUDE_GENL_LITERAL_CONSTRAINTS_, $str72$include_explicit___genls_literals);
    {
      SubLObject item_var = $sym73$_GATHER_AT_CONSTRAINTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym73$_GATHER_AT_CONSTRAINTS__, $str74$collect_applicable_at_constraints);
    {
      SubLObject item_var = $sym75$_GATHER_AT_ASSERTIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym75$_GATHER_AT_ASSERTIONS__, $str76$collect_applicable_at_assertions_);
    {
      SubLObject item_var = $sym77$_GATHER_AT_FORMAT_VIOLATIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym77$_GATHER_AT_FORMAT_VIOLATIONS__, $str78$collect_relevant_at_format_violat);
    {
      SubLObject item_var = $sym79$_GATHER_AT_DIFFERENT_VIOLATIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym79$_GATHER_AT_DIFFERENT_VIOLATIONS__, $str80$collect_relevant_at_different_vio);
    {
      SubLObject item_var = $sym81$_GATHER_AT_PREDICATE_VIOLATIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym81$_GATHER_AT_PREDICATE_VIOLATIONS__, $str82$collect_relevant_at_predicate_vio);
    {
      SubLObject item_var = $sym83$_AT_FORMAT_VIOLATIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym83$_AT_FORMAT_VIOLATIONS_, $str84$relevant_at_format_violations);
    {
      SubLObject item_var = $sym85$_AT_DIFFERENT_VIOLATIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym85$_AT_DIFFERENT_VIOLATIONS_, $str86$relevant_at_different_violations);
    {
      SubLObject item_var = $sym87$_WITHIN_AT_SUGGESTION__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym87$_WITHIN_AT_SUGGESTION__, $str88$is_at_module_currently_trying_to_);
    {
      SubLObject item_var = $sym89$_WITHIN_AT_MAPPING__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym89$_WITHIN_AT_MAPPING__, $str90$is_at_module_currently_executing_);
    {
      SubLObject item_var = $sym91$_AT_BREAK_ON_FAILURE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym91$_AT_BREAK_ON_FAILURE__, $str92$break_when_an_at_violation_is_enc);
    {
      SubLObject item_var = $sym93$_ACCUMULATING_AT_VIOLATIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym93$_ACCUMULATING_AT_VIOLATIONS__, $str94$continue_at_checks_even_after_con);
    {
      SubLObject item_var = $sym95$_NOTING_AT_VIOLATIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym95$_NOTING_AT_VIOLATIONS__, $str96$should_arg_type_violations_be_rec);
    {
      SubLObject item_var = $sym97$_AT_TRACE_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym97$_AT_TRACE_LEVEL_, $str98$controls_extent_of_tracing__warni);
    {
      SubLObject item_var = $sym99$_AT_TEST_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym99$_AT_TEST_LEVEL_, $str100$controls_extent_of_testing_for_th);
    {
      SubLObject item_var = $sym101$_APPRAISING_DISJUNCT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym101$_APPRAISING_DISJUNCT__, $str102$is_the_formula_being_considered_b);
    {
      SubLObject item_var = $sym103$_WITHIN_DECONTEXTUALIZED__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym103$_WITHIN_DECONTEXTUALIZED__, $str104$is_the_formula_being_considered_b);
    {
      SubLObject item_var = $sym105$_WITHIN_DISJUNCTION__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym105$_WITHIN_DISJUNCTION__, $str106$is_the_subformula_being_canonical);
    {
      SubLObject item_var = $sym107$_WITHIN_CONJUNCTION__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym107$_WITHIN_CONJUNCTION__, $str108$is_the_subformula_being_canonical);
    {
      SubLObject item_var = $sym109$_WITHIN_NEGATED_DISJUNCTION__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym109$_WITHIN_NEGATED_DISJUNCTION__, $str110$is_the_subformula_being_canonical);
    {
      SubLObject item_var = $sym111$_WITHIN_NEGATED_CONJUNCTION__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym111$_WITHIN_NEGATED_CONJUNCTION__, $str112$is_the_subformula_being_canonical);
    {
      SubLObject item_var = $sym113$_WITHIN_FUNCTION__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym113$_WITHIN_FUNCTION__, $str114$is_the_formula_being_canonicalize);
    {
      SubLObject item_var = $sym115$_WITHIN_PREDICATE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym115$_WITHIN_PREDICATE__, $str116$is_the_formula_being_canonicalize);
    {
      SubLObject item_var = $sym117$_WITHIN_TOU_GAF__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym117$_WITHIN_TOU_GAF__, $str118$is_the_formula_being_canonicalize);
    {
      SubLObject item_var = $sym119$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym119$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__, $str120$should_arg_type_constraints_be_we);
    {
      SubLObject item_var = $sym121$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym121$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__, $str122$within_expansions_should_arg_type);
    {
      SubLObject item_var = $sym123$_AT_ADMIT_CONSISTENT_NAUTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym123$_AT_ADMIT_CONSISTENT_NAUTS__, $str124$should_the_arg_type_module_admit_);
    {
      SubLObject item_var = $sym125$_AT_ADMIT_CONSISTENT_NARTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym125$_AT_ADMIT_CONSISTENT_NARTS__, $str126$should_the_arg_type_module_admit_);
    {
      SubLObject item_var = $sym127$_AT_RESULT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym127$_AT_RESULT_, $str128$accumulates_results_of_current_at);
    {
      SubLObject item_var = $sym129$_AT_SOME_ARG_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym129$_AT_SOME_ARG_ISA__, $str130$is_any_arg_isa_constraint_found_d);
    {
      SubLObject item_var = $sym131$_AT_SOME_ARG_ISA_REQUIRED__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym131$_AT_SOME_ARG_ISA_REQUIRED__, $str132$must_there_be_some_arg_isa_constr);
    {
      SubLObject item_var = $sym133$_AT_CONSIDER_MULTIARGS_AT_PRED__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym133$_AT_CONSIDER_MULTIARGS_AT_PRED__, $str134$during_arg_type_analysis_do_we_co);
    {
      SubLObject item_var = $sym136$_AT_ISA_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym136$_AT_ISA_CONSTRAINTS_, $str137$accumulates_applicable_at_isa_con);
    {
      SubLObject item_var = $sym138$_AT_GENL_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym138$_AT_GENL_CONSTRAINTS_, $str139$accumulates_applicable_at_genl_co);
    {
      SubLObject item_var = $sym140$_AT_FORMAT_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym140$_AT_FORMAT_CONSTRAINTS_, $str141$accumulates_applicable_at_format_);
    {
      SubLObject item_var = $sym142$_AT_DIFFERENT_CONSTRAINTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym142$_AT_DIFFERENT_CONSTRAINTS_, $str143$accumulates_applicable_at_differe);
    {
      SubLObject item_var = $sym144$_AT_ISA_ASSERTIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym144$_AT_ISA_ASSERTIONS_, $str145$accumulates_applicable_at_isa_ass);
    {
      SubLObject item_var = $sym146$_AT_GENL_ASSERTIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym146$_AT_GENL_ASSERTIONS_, $str147$accumulates_applicable_at_genl_as);
    {
      SubLObject item_var = $sym148$_AT_FORMAT_ASSERTIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym148$_AT_FORMAT_ASSERTIONS_, $str149$accumulates_applicable_at_format_);
    {
      SubLObject item_var = $sym150$_AT_DIFFERENT_ASSERTIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym150$_AT_DIFFERENT_ASSERTIONS_, $str151$accumulates_applicable_at_differe);
    {
      SubLObject item_var = $sym152$_AT_MODE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym152$_AT_MODE_, $str153$the_type_of_at_test_currently_bei);
    {
      SubLObject item_var = $sym154$_AT_CONSTRAINT_TYPE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym154$_AT_CONSTRAINT_TYPE_, $str155$the_type_of_at_constraint_current);
    {
      SubLObject item_var = $sym156$_AT_ARG_TYPE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym156$_AT_ARG_TYPE_, $str157$type_of_arg_being_considered_with);
    {
      SubLObject item_var = $sym158$_AT_BASE_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym158$_AT_BASE_FN_, $str159$fn_applied_to_each_applicable_arg);
    {
      SubLObject item_var = $sym160$_AT_FORMULA_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym160$_AT_FORMULA_, $str161$the_formula_being_appraised);
    {
      SubLObject item_var = $sym162$_AT_PRED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym162$_AT_PRED_, $str163$the_current_at_module_constraint_);
    {
      SubLObject item_var = $sym164$_AT_INVERSE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym164$_AT_INVERSE_, $str165$the_inverse_of_the_current_at_mod);
    {
      SubLObject item_var = $sym166$_AT_RELN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym166$_AT_RELN_, $str167$the_relation_whose_args_are_curre);
    {
      SubLObject item_var = $sym168$_AT_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym168$_AT_ARG_, $str169$the_particular_arg_that_is_curren);
    {
      SubLObject item_var = $sym170$_AT_ARGNUM_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym170$_AT_ARGNUM_, $str171$the_position_of_the_arg_that_is_c);
    {
      SubLObject item_var = $sym172$_AT_ARG1_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym172$_AT_ARG1_, $str173$the_1st_arg_of_the_literal_or_fun);
    {
      SubLObject item_var = $sym174$_AT_ARG2_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym174$_AT_ARG2_, $str175$the_2nd_arg_of_the_literal_or_fun);
    {
      SubLObject item_var = $sym176$_AT_IND_ARGNUM_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym176$_AT_IND_ARGNUM_, $str177$the_position_of_the_independent_a);
    {
      SubLObject item_var = $sym178$_AT_IND_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym178$_AT_IND_ARG_, $str179$the_independent_arg_that_is_const);
    {
      SubLObject item_var = $sym180$_AT_IND_ISA_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym180$_AT_IND_ISA_, $str181$the_isa_of_the_independent_arg_th);
    {
      SubLObject item_var = $sym182$_AT_IND_GENL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym182$_AT_IND_GENL_, $str183$the_genl_of_the_independent_arg_t);
    {
      SubLObject item_var = $sym184$_AT_ARG_ISA_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym184$_AT_ARG_ISA_, $str185$the_isa_of_the_dependent_arg_that);
    {
      SubLObject item_var = $sym186$_AT_SOURCE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym186$_AT_SOURCE_, $str187$the_constant_indexing_the_current);
    {
      SubLObject item_var = $sym188$_AT_MAPPING_GENL_INVERSES__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym188$_AT_MAPPING_GENL_INVERSES__, $str189$dynamic_state_variable__are_we_lo);
    {
      SubLObject item_var = $sym190$_AT_SEARCH_GENL_PREDS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym190$_AT_SEARCH_GENL_PREDS__, $str191$consider_genlPreds_during_current);
    {
      SubLObject item_var = $sym192$_AT_SEARCH_GENL_INVERSES__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym192$_AT_SEARCH_GENL_INVERSES__, $str193$consider_genlInverses_during_curr);
    {
      SubLObject item_var = $sym194$_AT_PROFILE_TERM_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym194$_AT_PROFILE_TERM_, $str195$the_term__var__constant_______tha);
    {
      SubLObject item_var = $sym196$_AT_CONSTRAINT_GAF_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym196$_AT_CONSTRAINT_GAF_, $str197$the_arg_type_constraint_assertion);
    {
      SubLObject item_var = $sym198$_INCLUDE_AT_CONSTRAINT_GAF__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym198$_INCLUDE_AT_CONSTRAINT_GAF__, $str199$boolean__should_errors_reference_);
    {
      SubLObject item_var = $sym200$_AT_VAR_ISA_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym200$_AT_VAR_ISA_, $str201$the_accumulating_inter_reference_);
    {
      SubLObject item_var = $sym202$_AT_VAR_GENL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym202$_AT_VAR_GENL_, $str203$the_accumulating_inter_reference_);
    {
      SubLObject item_var = $sym205$_AT_VAR_TYPES_STANDARD_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym205$_AT_VAR_TYPES_STANDARD_, $str206$the_standard_for_acceptable_arg_t);
    {
      SubLObject item_var = $sym207$_AT_ASSUME_CONJUNCTS_INDEPENDENT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym207$_AT_ASSUME_CONJUNCTS_INDEPENDENT__, $str208$Whether_arg_type_checking_for_var);
    {
      SubLObject item_var = $sym209$_CURRENT_AT_VIOLATION_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym209$_CURRENT_AT_VIOLATION_, $str210$description_of_most_recent_violat);
    {
      SubLObject item_var = $sym211$_AT_VIOLATIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym211$_AT_VIOLATIONS_, $str212$descriptions_of_how_a_relational_);
    {
      SubLObject item_var = $sym213$_AT_DISJOINS_SPACE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym213$_AT_DISJOINS_SPACE_, $str214$sbhl_space_used_for_marking_disjo);
    {
      SubLObject item_var = $sym215$_AT_ISA_SPACE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym215$_AT_ISA_SPACE_, $str216$sbhl_space_used_for_marking_all_i);
    {
      SubLObject item_var = $sym217$_AT_GENLS_SPACE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$at_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym217$_AT_GENLS_SPACE_, $str218$sbhl_space_used_for_marking_all_g);
    {
      SubLObject item_var = $sym219$_AT_DEFNS_AVAILABLE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym219$_AT_DEFNS_AVAILABLE__, $str220$make_defns_available_for_at_queri);
    {
      SubLObject item_var = $sym221$_AT_APPLY_NECESSARY_DEFNS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym221$_AT_APPLY_NECESSARY_DEFNS__, $str222$enforce_all_applicable_necessary_);
    {
      SubLObject item_var = $sym223$_SORT_SUF_DEFN_ASSERTIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym223$_SORT_SUF_DEFN_ASSERTIONS__, $str224$are_the_cached_suf_defn_assertion);
    {
      SubLObject item_var = $sym225$_SORT_SUF_FUNCTION_ASSERTIONS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym225$_SORT_SUF_FUNCTION_ASSERTIONS__, $str226$are_the_cached_suf_function_asser);
    {
      SubLObject item_var = $sym227$_AT_COLLECTION_SPECIFIC_DEFNS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym227$_AT_COLLECTION_SPECIFIC_DEFNS_, $str228$defns_which_reference__defn_colle);
    {
      SubLObject item_var = $sym229$_DEFN_TRACE_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym229$_DEFN_TRACE_LEVEL_, $str98$controls_extent_of_tracing__warni);
    {
      SubLObject item_var = $sym230$_DEFN_TEST_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym230$_DEFN_TEST_LEVEL_, $str100$controls_extent_of_testing_for_th);
    {
      SubLObject item_var = $sym231$_DEFN_METERS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym231$_DEFN_METERS__, $str232$activate_metering_of_functions_wi);
    {
      SubLObject item_var = $sym234$_SUF_DEFN_CACHE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym234$_SUF_DEFN_CACHE_, NIL);
    {
      SubLObject item_var = $sym236$_SUF_QUOTED_DEFN_CACHE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym236$_SUF_QUOTED_DEFN_CACHE_, NIL);
    {
      SubLObject item_var = $sym237$_DEFN_METER_CACHES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym237$_DEFN_METER_CACHES_, $str238$list_of_caches_used_for_metering_);
    {
      SubLObject item_var = $sym239$_DEFN_COLLECTION_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym239$_DEFN_COLLECTION_, $str240$the_collection_with_which_the_cur);
    {
      SubLObject item_var = $sym241$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym241$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__, $str242$should_defns_admit_a_denotation_t);
    {
      SubLObject item_var = $sym245$_AT_DEFN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym245$_AT_DEFN_, $str246$current_defn_assertion_being_cons);
    {
      SubLObject item_var = $sym247$_AT_DEFNS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym247$_AT_DEFNS_, $str248$current_defn_assertions_being_con);
    {
      SubLObject item_var = $sym249$_SUF_FUNCTION_CACHE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym249$_SUF_FUNCTION_CACHE_, NIL);
    {
      SubLObject item_var = $sym250$_SUF_QUOTED_FUNCTION_CACHE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym250$_SUF_QUOTED_FUNCTION_CACHE_, NIL);
    {
      SubLObject item_var = $sym251$_AT_FUNCTION_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym251$_AT_FUNCTION_, $str252$current_sufficient_function_asser);
    {
      SubLObject item_var = $sym253$_AT_FUNCTIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym253$_AT_FUNCTIONS_, $str254$current_sufficient_function_asser);
    {
      SubLObject item_var = $sym256$_DEFN_FN_HISTORY_DEFAULT_SIZE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym256$_DEFN_FN_HISTORY_DEFAULT_SIZE_, $str257$the_initial_size_of_each_nested_d);
    {
      SubLObject item_var = $sym258$_DEFN_COL_HISTORY_DEFAULT_SIZE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym258$_DEFN_COL_HISTORY_DEFAULT_SIZE_, $str259$the_initial_size_of_each_nested_d);
    {
      SubLObject item_var = $sym261$_DEFN_COL_HISTORY_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym261$_DEFN_COL_HISTORY_, $str262$the_cache_used__by_the_current_de);
    {
      SubLObject item_var = $sym263$_QUOTED_DEFN_COL_HISTORY_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym263$_QUOTED_DEFN_COL_HISTORY_, $str264$the_cache_used__by_the_current_qu);
    {
      SubLObject item_var = $sym265$_DEFN_FN_HISTORY_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym265$_DEFN_FN_HISTORY_, $str266$the_cache_used__by_the_current_de);
    {
      SubLObject item_var = $sym267$_QUOTED_DEFN_FN_HISTORY_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym267$_QUOTED_DEFN_FN_HISTORY_, $str268$the_cache_used__by_the_current_qu);
    {
      SubLObject item_var = $sym269$_DEFN_STACK_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$defn_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym269$_DEFN_STACK_, $str270$A_stack_of_defns_being_called__to);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_SEMANTIC_DNF_HL_FILTERING_ENABLED_ = makeSymbol("*SEMANTIC-DNF-HL-FILTERING-ENABLED*");
  public static final SubLString $str1$should_the_inference_engine_use_a = makeString("should the inference engine use arg-type tests in order to filter-out non-wff inferences?");
  public static final SubLSymbol $sym2$_AT_CHECK_FN_SYMBOL__ = makeSymbol("*AT-CHECK-FN-SYMBOL?*");
  public static final SubLString $str3$require_function_symbols_be_insta = makeString("require function symbols be instances of #$Function-Denotational ?");
  public static final SubLSymbol $sym4$_AT_CHECK_ARG_GENLS__ = makeSymbol("*AT-CHECK-ARG-GENLS?*");
  public static final SubLString $str5$enforce___argGenl_constraints_ = makeString("enforce #$argGenl constraints?");
  public static final SubLSymbol $sym6$_AT_CHECK_ARG_ISA__ = makeSymbol("*AT-CHECK-ARG-ISA?*");
  public static final SubLString $str7$enforce_argIsa_constraints_ = makeString("enforce argIsa constraints?");
  public static final SubLSymbol $sym8$_AT_CHECK_ARG_QUOTED_ISA__ = makeSymbol("*AT-CHECK-ARG-QUOTED-ISA?*");
  public static final SubLString $str9$enforce_argQuotedIsa_constraints_ = makeString("enforce argQuotedIsa constraints?");
  public static final SubLSymbol $sym10$_AT_CHECK_ARG_NOT_ISA__ = makeSymbol("*AT-CHECK-ARG-NOT-ISA?*");
  public static final SubLString $str11$enforce_argNotIsa_constraints_ = makeString("enforce argNotIsa constraints?");
  public static final SubLSymbol $sym12$_AT_CHECK_ARG_TYPES__ = makeSymbol("*AT-CHECK-ARG-TYPES?*");
  public static final SubLString $str13$enforce_arg_typing_constraints_ = makeString("enforce arg-typing constraints?");
  public static final SubLSymbol $sym14$_AT_POSSIBLY_CHECK_DEFINING_MTS__ = makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*");
  public static final SubLString $str15$is___definingMt_constraint_enforc = makeString("is #$definingMt constraint enforcement available?");
  public static final SubLSymbol $sym16$_AT_CHECK_DEFINING_MTS__ = makeSymbol("*AT-CHECK-DEFINING-MTS?*");
  public static final SubLString $str17$enforce___definingMt_constraints_ = makeString("enforce #$definingMt constraints?");
  public static final SubLSymbol $sym18$_AT_CHECK_INTER_ARG_ISA__ = makeSymbol("*AT-CHECK-INTER-ARG-ISA?*");
  public static final SubLString $str19$enforce___interArgIsa_constraints = makeString("enforce #$interArgIsa constraints?");
  public static final SubLSymbol $sym20$_AT_CHECK_INTER_ARG_NOT_ISA__ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-ISA?*");
  public static final SubLString $str21$enforce___interArgNotIsa_constrai = makeString("enforce #$interArgNotIsa constraints?");
  public static final SubLSymbol $sym22$_AT_CHECK_INTER_ARG_GENL__ = makeSymbol("*AT-CHECK-INTER-ARG-GENL?*");
  public static final SubLString $str23$enforce___interArgGenl_constraint = makeString("enforce #$interArgGenl constraints?");
  public static final SubLSymbol $sym24$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*");
  public static final SubLString $str25$enforce_interArgIsa_constraints_f = makeString("enforce interArgIsa constraints for non-constants?");
  public static final SubLSymbol $sym26$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*");
  public static final SubLString $str27$enforce_interArgGenl_constraints_ = makeString("enforce interArgGenl constraints for non-constants?");
  public static final SubLSymbol $sym28$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*");
  public static final SubLString $str29$enforce_interArgFormat1_2__and_si = makeString("enforce interArgFormat1-2 (and similar) constraints for non-constants?");
  public static final SubLSymbol $sym30$_AT_CHECK_NOT_ISA_DISJOINT__ = makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*");
  public static final SubLString $str31$enforce___argIsa_constraints_for_ = makeString("enforce #$argIsa constraints for non-constants?");
  public static final SubLSymbol $sym32$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__ = makeSymbol("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*");
  public static final SubLString $str33$enforce___argQuotedIsa_constraint = makeString("enforce #$argQuotedIsa constraints for non-constants?");
  public static final SubLSymbol $sym34$_AT_CHECK_NOT_GENLS_DISJOINT__ = makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*");
  public static final SubLString $str35$enforce___argGenl_constraints_for = makeString("enforce #$argGenl constraints for non-constants?");
  public static final SubLSymbol $sym36$_AT_CHECK_NOT_MDW__ = makeSymbol("*AT-CHECK-NOT-MDW?*");
  public static final SubLString $str37$enforce__not_disjoint_constraints = makeString("enforce :not-disjoint constraints using mdw module?");
  public static final SubLSymbol $sym38$_AT_CHECK_NOT_SDC__ = makeSymbol("*AT-CHECK-NOT-SDC?*");
  public static final SubLString $str39$enforce__not_disjoint_constraints = makeString("enforce :not-disjoint constraints using sdc module?");
  public static final SubLSymbol $sym40$_AT_CHECK_ARG_FORMAT__ = makeSymbol("*AT-CHECK-ARG-FORMAT?*");
  public static final SubLString $str41$enforce___argformat_constraints_ = makeString("enforce #$argformat constraints?");
  public static final SubLSymbol $sym42$_AT_CHECK_SEF__ = makeSymbol("*AT-CHECK-SEF?*");
  public static final SubLString $str43$enforce___singleEntryFormatInArgs = makeString("enforce #$singleEntryFormatInArgs #$argformat constraints?");
  public static final SubLSymbol $sym44$_AT_CHECK_RELATOR_CONSTRAINTS__ = makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*");
  public static final SubLString $str45$enforce_asymmetric_predicate_and_ = makeString("enforce asymmetric-predicate and similar constraints?");
  public static final SubLSymbol $sym46$_AT_ENSURE_CONSISTENCY__ = makeSymbol("*AT-ENSURE-CONSISTENCY?*");
  public static final SubLString $str47$enforce_consistency_at_constraint = makeString("enforce consistency at constraint standard (:not-isa-disjoint et al) in addition to entails standard (:isa et al)?");
  public static final SubLList $list48 = list(makeKeyword("ASYMMETRIC-PREDICATE"), makeKeyword("ANTI-SYMMETRIC-PREDICATE"), makeKeyword("IRREFLEXIVE-PREDICATE"), makeKeyword("ANTI-TRANSITIVE-PREDICATE"), makeKeyword("NEGATION-PREDS"), makeKeyword("NEGATION-INVERSES"));
  public static final SubLSymbol $sym49$_AT_PRED_CONSTRAINTS_ = makeSymbol("*AT-PRED-CONSTRAINTS*");
  public static final SubLSymbol $sym50$_AT_PREDICATE_VIOLATIONS_ = makeSymbol("*AT-PREDICATE-VIOLATIONS*");
  public static final SubLString $str51$relevant_at_predicate_violations = makeString("relevant at predicate violations");
  public static final SubLSymbol $sym52$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");
  public static final SubLString $str53$enforce_inter_assert_formats_even = makeString("enforce inter-assert formats even when pred is only index?");
  public static final SubLInteger $int54$100 = makeInteger(100);
  public static final SubLSymbol $sym55$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");
  public static final SubLString $str56$max_number_of_relevant_gafs_to_pe = makeString("max number of relevant gafs to permit enforcing inter-assert formats when pred is only index?");
  public static final SubLSymbol $sym57$_FAG_SEARCH_LIMIT_ = makeSymbol("*FAG-SEARCH-LIMIT*");
  public static final SubLString $str58$max_number_of_relevant_gafs_to_pe = makeString("max number of relevant gafs to permit using find-accessible-gaf?");
  public static final SubLSymbol $sym59$_AT_GAF_SEARCH_LIMIT_ = makeSymbol("*AT-GAF-SEARCH-LIMIT*");
  public static final SubLString $str60$default_max_number_of_relevant_ga = makeString("default max number of relevant gafs to permit enforcing at constraints using find-accessible-gaf (e.g., negation-preds et al)?");
  public static final SubLSymbol $sym61$_AT_CHECK_INTER_ARG_FORMAT__ = makeSymbol("*AT-CHECK-INTER-ARG-FORMAT?*");
  public static final SubLString $str62$enforce___interArgFormat1_2__and_ = makeString("enforce #$interArgFormat1-2 (and similar) constraints?");
  public static final SubLSymbol $sym63$_AT_CHECK_INTER_ARG_DIFFERENT__ = makeSymbol("*AT-CHECK-INTER-ARG-DIFFERENT?*");
  public static final SubLString $str64$enforce___interArgDifferent__and_ = makeString("enforce #$interArgDifferent (and similar) constraints?");
  public static final SubLSymbol $sym65$_AT_CHECK_GENL_PREDS__ = makeSymbol("*AT-CHECK-GENL-PREDS?*");
  public static final SubLString $str66$enforce_arg_constraints_of_genlPr = makeString("enforce arg-constraints of genlPreds?");
  public static final SubLSymbol $sym67$_AT_CHECK_GENL_INVERSES__ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");
  public static final SubLString $str68$enforce_arg_constraints_of_genlIn = makeString("enforce arg-constraints of genlInverse?");
  public static final SubLSymbol $sym69$_AT_INCLUDE_ISA_LITERAL_CONSTRAINTS_ = makeSymbol("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*");
  public static final SubLString $str70$include_explicit___isa_literals_w = makeString("include explicit #$isa literals when computing type constraints?");
  public static final SubLSymbol $sym71$_AT_INCLUDE_GENL_LITERAL_CONSTRAINTS_ = makeSymbol("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*");
  public static final SubLString $str72$include_explicit___genls_literals = makeString("include explicit #$genls literals when computing type constraints?");
  public static final SubLSymbol $sym73$_GATHER_AT_CONSTRAINTS__ = makeSymbol("*GATHER-AT-CONSTRAINTS?*");
  public static final SubLString $str74$collect_applicable_at_constraints = makeString("collect applicable at constraints?");
  public static final SubLSymbol $sym75$_GATHER_AT_ASSERTIONS__ = makeSymbol("*GATHER-AT-ASSERTIONS?*");
  public static final SubLString $str76$collect_applicable_at_assertions_ = makeString("collect applicable at assertions?");
  public static final SubLSymbol $sym77$_GATHER_AT_FORMAT_VIOLATIONS__ = makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*");
  public static final SubLString $str78$collect_relevant_at_format_violat = makeString("collect relevant at format violations?");
  public static final SubLSymbol $sym79$_GATHER_AT_DIFFERENT_VIOLATIONS__ = makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*");
  public static final SubLString $str80$collect_relevant_at_different_vio = makeString("collect relevant at different violations?");
  public static final SubLSymbol $sym81$_GATHER_AT_PREDICATE_VIOLATIONS__ = makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*");
  public static final SubLString $str82$collect_relevant_at_predicate_vio = makeString("collect relevant at predicate violations (e.g., asymmetry, negationPreds)?");
  public static final SubLSymbol $sym83$_AT_FORMAT_VIOLATIONS_ = makeSymbol("*AT-FORMAT-VIOLATIONS*");
  public static final SubLString $str84$relevant_at_format_violations = makeString("relevant at format violations");
  public static final SubLSymbol $sym85$_AT_DIFFERENT_VIOLATIONS_ = makeSymbol("*AT-DIFFERENT-VIOLATIONS*");
  public static final SubLString $str86$relevant_at_different_violations = makeString("relevant at different violations");
  public static final SubLSymbol $sym87$_WITHIN_AT_SUGGESTION__ = makeSymbol("*WITHIN-AT-SUGGESTION?*");
  public static final SubLString $str88$is_at_module_currently_trying_to_ = makeString("is at module currently trying to formula a suggested fix?");
  public static final SubLSymbol $sym89$_WITHIN_AT_MAPPING__ = makeSymbol("*WITHIN-AT-MAPPING?*");
  public static final SubLString $str90$is_at_module_currently_executing_ = makeString("is at module currently executing a mapping search?");
  public static final SubLSymbol $sym91$_AT_BREAK_ON_FAILURE__ = makeSymbol("*AT-BREAK-ON-FAILURE?*");
  public static final SubLString $str92$break_when_an_at_violation_is_enc = makeString("break when an at violation is encountered?");
  public static final SubLSymbol $sym93$_ACCUMULATING_AT_VIOLATIONS__ = makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*");
  public static final SubLString $str94$continue_at_checks_even_after_con = makeString("continue at checks even after constraint failure?");
  public static final SubLSymbol $sym95$_NOTING_AT_VIOLATIONS__ = makeSymbol("*NOTING-AT-VIOLATIONS?*");
  public static final SubLString $str96$should_arg_type_violations_be_rec = makeString("should arg-type violations be recorded for presentation?");
  public static final SubLSymbol $sym97$_AT_TRACE_LEVEL_ = makeSymbol("*AT-TRACE-LEVEL*");
  public static final SubLString $str98$controls_extent_of_tracing__warni = makeString("controls extent of tracing, warnings, etc., for the arg-type module [0 .. 5]");
  public static final SubLSymbol $sym99$_AT_TEST_LEVEL_ = makeSymbol("*AT-TEST-LEVEL*");
  public static final SubLString $str100$controls_extent_of_testing_for_th = makeString("controls extent of testing for the arg-type module [0 .. 5]");
  public static final SubLSymbol $sym101$_APPRAISING_DISJUNCT__ = makeSymbol("*APPRAISING-DISJUNCT?*");
  public static final SubLString $str102$is_the_formula_being_considered_b = makeString("is the formula being considered by the arg-type module a disjoined sub-formula?");
  public static final SubLSymbol $sym103$_WITHIN_DECONTEXTUALIZED__ = makeSymbol("*WITHIN-DECONTEXTUALIZED?*");
  public static final SubLString $str104$is_the_formula_being_considered_b = makeString("is the formula being considered by arg-type module a decontextualized literal?");
  public static final SubLSymbol $sym105$_WITHIN_DISJUNCTION__ = makeSymbol("*WITHIN-DISJUNCTION?*");
  public static final SubLString $str106$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within a disjunction?");
  public static final SubLSymbol $sym107$_WITHIN_CONJUNCTION__ = makeSymbol("*WITHIN-CONJUNCTION?*");
  public static final SubLString $str108$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within a conjunction?");
  public static final SubLSymbol $sym109$_WITHIN_NEGATED_DISJUNCTION__ = makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*");
  public static final SubLString $str110$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within both negation and disjunction?");
  public static final SubLSymbol $sym111$_WITHIN_NEGATED_CONJUNCTION__ = makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*");
  public static final SubLString $str112$is_the_subformula_being_canonical = makeString("is the subformula being canonicalized within both negation and conjunction?");
  public static final SubLSymbol $sym113$_WITHIN_FUNCTION__ = makeSymbol("*WITHIN-FUNCTION?*");
  public static final SubLString $str114$is_the_formula_being_canonicalize = makeString("is the formula being canonicalized referenced within a function expression?");
  public static final SubLSymbol $sym115$_WITHIN_PREDICATE__ = makeSymbol("*WITHIN-PREDICATE?*");
  public static final SubLString $str116$is_the_formula_being_canonicalize = makeString("is the formula being canonicalized referenced within a predicate?");
  public static final SubLSymbol $sym117$_WITHIN_TOU_GAF__ = makeSymbol("*WITHIN-TOU-GAF?*");
  public static final SubLString $str118$is_the_formula_being_canonicalize = makeString("is the formula being canonicalized a termOfUnit gaf?");
  public static final SubLSymbol $sym119$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__ = makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*");
  public static final SubLString $str120$should_arg_type_constraints_be_we = makeString("should arg-type constraints be weakened (possibly-true vs provably-true) within disjuncts?");
  public static final SubLSymbol $sym121$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__ = makeSymbol("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*");
  public static final SubLString $str122$within_expansions_should_arg_type = makeString("within expansions should arg-type constraints be forgiven for expandable nats?");
  public static final SubLSymbol $sym123$_AT_ADMIT_CONSISTENT_NAUTS__ = makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*");
  public static final SubLString $str124$should_the_arg_type_module_admit_ = makeString("should the arg-type module admit unreified function terms that are consistent (i.e., possibly-true vs provably-true) wrt arg-type constraints?");
  public static final SubLSymbol $sym125$_AT_ADMIT_CONSISTENT_NARTS__ = makeSymbol("*AT-ADMIT-CONSISTENT-NARTS?*");
  public static final SubLString $str126$should_the_arg_type_module_admit_ = makeString("should the arg-type module admit reified function terms that are consistent (i.e., possibly-true vs provably-true) wrt arg-type constraints?");
  public static final SubLSymbol $sym127$_AT_RESULT_ = makeSymbol("*AT-RESULT*");
  public static final SubLString $str128$accumulates_results_of_current_at = makeString("accumulates results of current at query");
  public static final SubLSymbol $sym129$_AT_SOME_ARG_ISA__ = makeSymbol("*AT-SOME-ARG-ISA?*");
  public static final SubLString $str130$is_any_arg_isa_constraint_found_d = makeString("is any arg-isa constraint found during at arg-isa analysis for a given arg, relation and argnum?");
  public static final SubLSymbol $sym131$_AT_SOME_ARG_ISA_REQUIRED__ = makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*");
  public static final SubLString $str132$must_there_be_some_arg_isa_constr = makeString("must there be some arg-isa constraint applicable to an arg for a given arg, relation, argnum to be wf?");
  public static final SubLSymbol $sym133$_AT_CONSIDER_MULTIARGS_AT_PRED__ = makeSymbol("*AT-CONSIDER-MULTIARGS-AT-PRED?*");
  public static final SubLString $str134$during_arg_type_analysis_do_we_co = makeString("during arg-type analysis do we consider multi-arg (argsIsa) constraints for specified args (arg1)");
  public static final SubLInteger $int135$64 = makeInteger(64);
  public static final SubLSymbol $sym136$_AT_ISA_CONSTRAINTS_ = makeSymbol("*AT-ISA-CONSTRAINTS*");
  public static final SubLString $str137$accumulates_applicable_at_isa_con = makeString("accumulates applicable at isa constraints");
  public static final SubLSymbol $sym138$_AT_GENL_CONSTRAINTS_ = makeSymbol("*AT-GENL-CONSTRAINTS*");
  public static final SubLString $str139$accumulates_applicable_at_genl_co = makeString("accumulates applicable at genl constraints");
  public static final SubLSymbol $sym140$_AT_FORMAT_CONSTRAINTS_ = makeSymbol("*AT-FORMAT-CONSTRAINTS*");
  public static final SubLString $str141$accumulates_applicable_at_format_ = makeString("accumulates applicable at format constraints");
  public static final SubLSymbol $sym142$_AT_DIFFERENT_CONSTRAINTS_ = makeSymbol("*AT-DIFFERENT-CONSTRAINTS*");
  public static final SubLString $str143$accumulates_applicable_at_differe = makeString("accumulates applicable at different constraints");
  public static final SubLSymbol $sym144$_AT_ISA_ASSERTIONS_ = makeSymbol("*AT-ISA-ASSERTIONS*");
  public static final SubLString $str145$accumulates_applicable_at_isa_ass = makeString("accumulates applicable at isa assertions");
  public static final SubLSymbol $sym146$_AT_GENL_ASSERTIONS_ = makeSymbol("*AT-GENL-ASSERTIONS*");
  public static final SubLString $str147$accumulates_applicable_at_genl_as = makeString("accumulates applicable at genl assertions");
  public static final SubLSymbol $sym148$_AT_FORMAT_ASSERTIONS_ = makeSymbol("*AT-FORMAT-ASSERTIONS*");
  public static final SubLString $str149$accumulates_applicable_at_format_ = makeString("accumulates applicable at format assertions");
  public static final SubLSymbol $sym150$_AT_DIFFERENT_ASSERTIONS_ = makeSymbol("*AT-DIFFERENT-ASSERTIONS*");
  public static final SubLString $str151$accumulates_applicable_at_differe = makeString("accumulates applicable at different assertions");
  public static final SubLSymbol $sym152$_AT_MODE_ = makeSymbol("*AT-MODE*");
  public static final SubLString $str153$the_type_of_at_test_currently_bei = makeString("the type of at test currently being applied (e.g., :arg-genls)");
  public static final SubLSymbol $sym154$_AT_CONSTRAINT_TYPE_ = makeSymbol("*AT-CONSTRAINT-TYPE*");
  public static final SubLString $str155$the_type_of_at_constraint_current = makeString("the type of at constraint currently being applied (e.g., :isa :genls)");
  public static final SubLSymbol $sym156$_AT_ARG_TYPE_ = makeSymbol("*AT-ARG-TYPE*");
  public static final SubLString $str157$type_of_arg_being_considered_with = makeString("type of arg being considered within arg-type search [:naut :weak-fort :strong-fort]");
  public static final SubLSymbol $sym158$_AT_BASE_FN_ = makeSymbol("*AT-BASE-FN*");
  public static final SubLString $str159$fn_applied_to_each_applicable_arg = makeString("fn applied to each applicable arg-constraint assertion during at search");
  public static final SubLSymbol $sym160$_AT_FORMULA_ = makeSymbol("*AT-FORMULA*");
  public static final SubLString $str161$the_formula_being_appraised = makeString("the formula being appraised");
  public static final SubLSymbol $sym162$_AT_PRED_ = makeSymbol("*AT-PRED*");
  public static final SubLString $str163$the_current_at_module_constraint_ = makeString("the current at-module constraint pred (e.g., #$interArgIsa1-2)");
  public static final SubLSymbol $sym164$_AT_INVERSE_ = makeSymbol("*AT-INVERSE*");
  public static final SubLString $str165$the_inverse_of_the_current_at_mod = makeString("the inverse of the current at-module constraint pred (e.g., #$interArgIsa2-1)");
  public static final SubLSymbol $sym166$_AT_RELN_ = makeSymbol("*AT-RELN*");
  public static final SubLString $str167$the_relation_whose_args_are_curre = makeString("the relation whose args are currently being appraised");
  public static final SubLSymbol $sym168$_AT_ARG_ = makeSymbol("*AT-ARG*");
  public static final SubLString $str169$the_particular_arg_that_is_curren = makeString("the particular arg that is currently being appraised");
  public static final SubLSymbol $sym170$_AT_ARGNUM_ = makeSymbol("*AT-ARGNUM*");
  public static final SubLString $str171$the_position_of_the_arg_that_is_c = makeString("the position of the arg that is currently being appraised");
  public static final SubLSymbol $sym172$_AT_ARG1_ = makeSymbol("*AT-ARG1*");
  public static final SubLString $str173$the_1st_arg_of_the_literal_or_fun = makeString("the 1st arg of the literal or function-term that is currently being appraised");
  public static final SubLSymbol $sym174$_AT_ARG2_ = makeSymbol("*AT-ARG2*");
  public static final SubLString $str175$the_2nd_arg_of_the_literal_or_fun = makeString("the 2nd arg of the literal or function-term that is currently being appraised");
  public static final SubLSymbol $sym176$_AT_IND_ARGNUM_ = makeSymbol("*AT-IND-ARGNUM*");
  public static final SubLString $str177$the_position_of_the_independent_a = makeString("the position of the independent arg that is constraining the dependent arg");
  public static final SubLSymbol $sym178$_AT_IND_ARG_ = makeSymbol("*AT-IND-ARG*");
  public static final SubLString $str179$the_independent_arg_that_is_const = makeString("the independent arg that is constraining the dependent arg being appraised");
  public static final SubLSymbol $sym180$_AT_IND_ISA_ = makeSymbol("*AT-IND-ISA*");
  public static final SubLString $str181$the_isa_of_the_independent_arg_th = makeString("the isa of the independent arg that is constraining the dependent arg");
  public static final SubLSymbol $sym182$_AT_IND_GENL_ = makeSymbol("*AT-IND-GENL*");
  public static final SubLString $str183$the_genl_of_the_independent_arg_t = makeString("the genl of the independent arg that is constraining the dependent arg");
  public static final SubLSymbol $sym184$_AT_ARG_ISA_ = makeSymbol("*AT-ARG-ISA*");
  public static final SubLString $str185$the_isa_of_the_dependent_arg_that = makeString("the isa of the dependent arg that is being appraised");
  public static final SubLSymbol $sym186$_AT_SOURCE_ = makeSymbol("*AT-SOURCE*");
  public static final SubLString $str187$the_constant_indexing_the_current = makeString("the constant indexing the current at constraint (e.g., may be a genlPred of *at-reln*)");
  public static final SubLSymbol $sym188$_AT_MAPPING_GENL_INVERSES__ = makeSymbol("*AT-MAPPING-GENL-INVERSES?*");
  public static final SubLString $str189$dynamic_state_variable__are_we_lo = makeString("dynamic state variable: are we looking at inverses instead of genlPreds?");
  public static final SubLSymbol $sym190$_AT_SEARCH_GENL_PREDS__ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");
  public static final SubLString $str191$consider_genlPreds_during_current = makeString("consider genlPreds during current at search?");
  public static final SubLSymbol $sym192$_AT_SEARCH_GENL_INVERSES__ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");
  public static final SubLString $str193$consider_genlInverses_during_curr = makeString("consider genlInverses during current at search?");
  public static final SubLSymbol $sym194$_AT_PROFILE_TERM_ = makeSymbol("*AT-PROFILE-TERM*");
  public static final SubLString $str195$the_term__var__constant_______tha = makeString("the term (var, constant, ...) that is being profiled during this at analysis");
  public static final SubLSymbol $sym196$_AT_CONSTRAINT_GAF_ = makeSymbol("*AT-CONSTRAINT-GAF*");
  public static final SubLString $str197$the_arg_type_constraint_assertion = makeString("the arg-type constraint assertion currently being considered.");
  public static final SubLSymbol $sym198$_INCLUDE_AT_CONSTRAINT_GAF__ = makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*");
  public static final SubLString $str199$boolean__should_errors_reference_ = makeString("boolean: should errors reference the arg-type constraint assertion currently being considered.");
  public static final SubLSymbol $sym200$_AT_VAR_ISA_ = makeSymbol("*AT-VAR-ISA*");
  public static final SubLString $str201$the_accumulating_inter_reference_ = makeString("the accumulating inter-reference isa constraints applicable to a given variable in a formula");
  public static final SubLSymbol $sym202$_AT_VAR_GENL_ = makeSymbol("*AT-VAR-GENL*");
  public static final SubLString $str203$the_accumulating_inter_reference_ = makeString("the accumulating inter-reference genl constraints applicable to a given variable in a formula");
  public static final SubLSymbol $kw204$NOT_DISJOINT = makeKeyword("NOT-DISJOINT");
  public static final SubLSymbol $sym205$_AT_VAR_TYPES_STANDARD_ = makeSymbol("*AT-VAR-TYPES-STANDARD*");
  public static final SubLString $str206$the_standard_for_acceptable_arg_t = makeString("the standard for acceptable arg-type constraints applicable to variables.");
  public static final SubLSymbol $sym207$_AT_ASSUME_CONJUNCTS_INDEPENDENT__ = makeSymbol("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*");
  public static final SubLString $str208$Whether_arg_type_checking_for_var = makeString("Whether arg-type checking for variables in a conjunction should assume that each of the conjuncts is independent.\n   This is true, for example, during assert, but false, for example, when wff-checking the results of some parsers.");
  public static final SubLSymbol $sym209$_CURRENT_AT_VIOLATION_ = makeSymbol("*CURRENT-AT-VIOLATION*");
  public static final SubLString $str210$description_of_most_recent_violat = makeString("description of most recent violation of applicable arg-type constraints");
  public static final SubLSymbol $sym211$_AT_VIOLATIONS_ = makeSymbol("*AT-VIOLATIONS*");
  public static final SubLString $str212$descriptions_of_how_a_relational_ = makeString("descriptions of how a relational expresion is not valid wrt arg-type constraints");
  public static final SubLSymbol $sym213$_AT_DISJOINS_SPACE_ = makeSymbol("*AT-DISJOINS-SPACE*");
  public static final SubLString $str214$sbhl_space_used_for_marking_disjo = makeString("sbhl space used for marking disjoins of arg types");
  public static final SubLSymbol $sym215$_AT_ISA_SPACE_ = makeSymbol("*AT-ISA-SPACE*");
  public static final SubLString $str216$sbhl_space_used_for_marking_all_i = makeString("sbhl space used for marking all-isa of arg");
  public static final SubLSymbol $sym217$_AT_GENLS_SPACE_ = makeSymbol("*AT-GENLS-SPACE*");
  public static final SubLString $str218$sbhl_space_used_for_marking_all_g = makeString("sbhl space used for marking all-genls of arg");
  public static final SubLSymbol $sym219$_AT_DEFNS_AVAILABLE__ = makeSymbol("*AT-DEFNS-AVAILABLE?*");
  public static final SubLString $str220$make_defns_available_for_at_queri = makeString("make defns available for at queries?");
  public static final SubLSymbol $sym221$_AT_APPLY_NECESSARY_DEFNS__ = makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*");
  public static final SubLString $str222$enforce_all_applicable_necessary_ = makeString("enforce all applicable necessary defns during defn query?");
  public static final SubLSymbol $sym223$_SORT_SUF_DEFN_ASSERTIONS__ = makeSymbol("*SORT-SUF-DEFN-ASSERTIONS?*");
  public static final SubLString $str224$are_the_cached_suf_defn_assertion = makeString("are the cached suf-defn assertions sorted to promote some optimality criteria?");
  public static final SubLSymbol $sym225$_SORT_SUF_FUNCTION_ASSERTIONS__ = makeSymbol("*SORT-SUF-FUNCTION-ASSERTIONS?*");
  public static final SubLString $str226$are_the_cached_suf_function_asser = makeString("are the cached suf-function assertions sorted to promote some optimality criteria?");
  public static final SubLSymbol $sym227$_AT_COLLECTION_SPECIFIC_DEFNS_ = makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*");
  public static final SubLString $str228$defns_which_reference__defn_colle = makeString("defns which reference (defn-collection) and so cannot be cached in defn-fn-histories");
  public static final SubLSymbol $sym229$_DEFN_TRACE_LEVEL_ = makeSymbol("*DEFN-TRACE-LEVEL*");
  public static final SubLSymbol $sym230$_DEFN_TEST_LEVEL_ = makeSymbol("*DEFN-TEST-LEVEL*");
  public static final SubLSymbol $sym231$_DEFN_METERS__ = makeSymbol("*DEFN-METERS?*");
  public static final SubLString $str232$activate_metering_of_functions_wi = makeString("activate metering of functions within defn module?");
  public static final SubLInteger $int233$256 = makeInteger(256);
  public static final SubLSymbol $sym234$_SUF_DEFN_CACHE_ = makeSymbol("*SUF-DEFN-CACHE*");
  public static final SubLInteger $int235$200 = makeInteger(200);
  public static final SubLSymbol $sym236$_SUF_QUOTED_DEFN_CACHE_ = makeSymbol("*SUF-QUOTED-DEFN-CACHE*");
  public static final SubLSymbol $sym237$_DEFN_METER_CACHES_ = makeSymbol("*DEFN-METER-CACHES*");
  public static final SubLString $str238$list_of_caches_used_for_metering_ = makeString("list of caches used for metering functions in defn module");
  public static final SubLSymbol $sym239$_DEFN_COLLECTION_ = makeSymbol("*DEFN-COLLECTION*");
  public static final SubLString $str240$the_collection_with_which_the_cur = makeString("the collection with which the current defn is associated");
  public static final SubLSymbol $sym241$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__ = makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*");
  public static final SubLString $str242$should_defns_admit_a_denotation_t = makeString("should defns admit a denotation term that #$isa the *defn-collection* ?");
  public static final SubLSymbol $sym243$CLET = makeSymbol("CLET");
  public static final SubLList $list244 = list(list(makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*"), NIL));
  public static final SubLSymbol $sym245$_AT_DEFN_ = makeSymbol("*AT-DEFN*");
  public static final SubLString $str246$current_defn_assertion_being_cons = makeString("current defn-assertion being considered");
  public static final SubLSymbol $sym247$_AT_DEFNS_ = makeSymbol("*AT-DEFNS*");
  public static final SubLString $str248$current_defn_assertions_being_con = makeString("current defn-assertions being considered");
  public static final SubLSymbol $sym249$_SUF_FUNCTION_CACHE_ = makeSymbol("*SUF-FUNCTION-CACHE*");
  public static final SubLSymbol $sym250$_SUF_QUOTED_FUNCTION_CACHE_ = makeSymbol("*SUF-QUOTED-FUNCTION-CACHE*");
  public static final SubLSymbol $sym251$_AT_FUNCTION_ = makeSymbol("*AT-FUNCTION*");
  public static final SubLString $str252$current_sufficient_function_asser = makeString("current sufficient-function assertion being considered");
  public static final SubLSymbol $sym253$_AT_FUNCTIONS_ = makeSymbol("*AT-FUNCTIONS*");
  public static final SubLString $str254$current_sufficient_function_asser = makeString("current sufficient-function assertions being considered");
  public static final SubLInteger $int255$32 = makeInteger(32);
  public static final SubLSymbol $sym256$_DEFN_FN_HISTORY_DEFAULT_SIZE_ = makeSymbol("*DEFN-FN-HISTORY-DEFAULT-SIZE*");
  public static final SubLString $str257$the_initial_size_of_each_nested_d = makeString("the initial size of each nested defn-function cache");
  public static final SubLSymbol $sym258$_DEFN_COL_HISTORY_DEFAULT_SIZE_ = makeSymbol("*DEFN-COL-HISTORY-DEFAULT-SIZE*");
  public static final SubLString $str259$the_initial_size_of_each_nested_d = makeString("the initial size of each nested defn-collection cache");
  public static final SubLSymbol $kw260$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym261$_DEFN_COL_HISTORY_ = makeSymbol("*DEFN-COL-HISTORY*");
  public static final SubLString $str262$the_cache_used__by_the_current_de = makeString("the cache used (by the current defn invocation) to prevent multiple calls to a single defn collection");
  public static final SubLSymbol $sym263$_QUOTED_DEFN_COL_HISTORY_ = makeSymbol("*QUOTED-DEFN-COL-HISTORY*");
  public static final SubLString $str264$the_cache_used__by_the_current_qu = makeString("the cache used (by the current quoted defn invocation) to prevent multiple calls to a single defn collection");
  public static final SubLSymbol $sym265$_DEFN_FN_HISTORY_ = makeSymbol("*DEFN-FN-HISTORY*");
  public static final SubLString $str266$the_cache_used__by_the_current_de = makeString("the cache used (by the current defn invocation) to prevent multiple calls to a single defn function");
  public static final SubLSymbol $sym267$_QUOTED_DEFN_FN_HISTORY_ = makeSymbol("*QUOTED-DEFN-FN-HISTORY*");
  public static final SubLString $str268$the_cache_used__by_the_current_qu = makeString("the cache used (by the current quoted defn invocation) to prevent multiple calls to a single defn function");
  public static final SubLSymbol $sym269$_DEFN_STACK_ = makeSymbol("*DEFN-STACK*");
  public static final SubLString $str270$A_stack_of_defns_being_called__to = makeString("A stack of defns being called, to prevent infinite recursion.  The key for the hashtable is the collection-defn function, and the value is a list of arguments.  It's a list because it's fine to recurse on a defn with a different argument.");
  public static final SubLSymbol $kw271$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw272$NO_DEFINING_MTS = makeKeyword("NO-DEFINING-MTS");
  public static final SubLSymbol $kw273$NO_ARG_TYPES = makeKeyword("NO-ARG-TYPES");
  public static final SubLSymbol $kw274$NO_ARG_FORMAT = makeKeyword("NO-ARG-FORMAT");

  //// Initializers

  public void declareFunctions() {
    declare_at_vars_file();
  }

  public void initializeVariables() {
    init_at_vars_file();
  }

  public void runTopLevelForms() {
    setup_at_vars_file();
  }

}
