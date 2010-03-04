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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class control_vars extends SubLTranslatedFile {

  //// Constructor

  private control_vars() {}
  public static final SubLFile me = new control_vars();
  public static final String myName = "com.cyc.cycjava.cycl.control_vars";

  //// Definitions

  /** Does the #$ reader error if the referenced constant does not exist? */
  @SubL(source = "cycl/control-vars.lisp", position = 760) 
  public static SubLSymbol $read_require_constant_exists$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 888) 
  public static SubLSymbol $table_area$ = null;

  /** Controls modification of the HL store */
  @SubL(source = "cycl/control-vars.lisp", position = 1016) 
  public static SubLSymbol $hl_lock$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 1217) 
  public static SubLSymbol $bootstrapping_kbP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 1257) 
  public static SubLSymbol $keyword_package$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 1321) 
  public static SubLSymbol $sublisp_package$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 1384) 
  public static SubLSymbol $cyc_package$ = null;

  /** predicate used to compare two cnfs when searching for an assertion (or axiom) in the kb */
  @SubL(source = "cycl/control-vars.lisp", position = 1443) 
  public static SubLSymbol $cnf_matching_predicate$ = null;

  /** predicate used to compare two gaf formulas when searching for an assertion (or axiom) in the kb */
  @SubL(source = "cycl/control-vars.lisp", position = 1615) 
  public static SubLSymbol $gaf_matching_predicate$ = null;

  /** predicate used to compare two nat formulas when searching for a reified nat in the kb */
  @SubL(source = "cycl/control-vars.lisp", position = 1763) 
  public static SubLSymbol $nat_matching_predicate$ = null;

  /** used for robust assertion lookup in find-assertions-* */
  @SubL(source = "cycl/control-vars.lisp", position = 1987) 
  public static SubLSymbol $candidate_assertion$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2084) 
  public static SubLSymbol $variable_names$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2120) 
  public static SubLSymbol $assertion_truth$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2159) 
  public static SubLSymbol $mapping_answer$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2242) 
  public static SubLSymbol $mapping_pred$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2276) 
  public static SubLSymbol $mapping_source$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2312) 
  public static SubLSymbol $mapping_target$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2348) 
  public static SubLSymbol $mapping_target_arg$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2388) 
  public static SubLSymbol $mapping_index_arg$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2427) 
  public static SubLSymbol $mapping_gather_arg$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2467) 
  public static SubLSymbol $mapping_gather_args$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2508) 
  public static SubLSymbol $mapping_output_stream$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2549) 
  public static SubLSymbol $mapping_equality_test$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2593) 
  public static SubLSymbol $mapping_any_answerP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2634) 
  public static SubLSymbol $mapping_relation$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2672) 
  public static SubLSymbol $mapping_finished_fn$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2713) 
  public static SubLSymbol $mapping_path$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2747) 
  public static SubLSymbol $mapping_data_1$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2783) 
  public static SubLSymbol $mapping_data_2$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2819) 
  public static SubLSymbol $mapping_pivot_arg$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2858) 
  public static SubLSymbol $mapping_gather_key$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2906) 
  public static SubLSymbol $mapping_gather_key_args$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 2951) 
  public static SubLSymbol $mapping_assertion_selection_fn$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 3003) 
  public static SubLSymbol $mapping_assertion_bookkeeping_fn$ = null;

  /** function applied in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3057) 
  public static SubLSymbol $mapping_fn$ = null;

  /** designates non-default argument in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3141) 
  public static SubLSymbol $mapping_fn_arg$ = null;

  /** default arg1 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3232) 
  public static SubLSymbol $mapping_fn_arg1$ = null;

  /** default arg2 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3316) 
  public static SubLSymbol $mapping_fn_arg2$ = null;

  /** default arg3 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3400) 
  public static SubLSymbol $mapping_fn_arg3$ = null;

  /** default arg4 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3484) 
  public static SubLSymbol $mapping_fn_arg4$ = null;

  /** default arg5 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3568) 
  public static SubLSymbol $mapping_fn_arg5$ = null;

  /** default arg6 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3652) 
  public static SubLSymbol $mapping_fn_arg6$ = null;

  /** default arg7 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3736) 
  public static SubLSymbol $mapping_fn_arg7$ = null;

  /** default arg8 in mapping-funcall-arg */
  @SubL(source = "cycl/control-vars.lisp", position = 3820) 
  public static SubLSymbol $mapping_fn_arg8$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 5983) 
  public static SubLSymbol $kba_pred$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 6059) 
  public static SubLSymbol $standard_indent_string$ = null;

  /** The maximum function complexity of CycL allowed by the system.
NIL means 'no limit'. */
  @SubL(source = "cycl/control-vars.lisp", position = 6103) 
  public static SubLSymbol $term_functional_complexity_cutoff$ = null;

  /** The maximum relation complexity of CycL allowed by the system.
NIL means 'no limit'. */
  @SubL(source = "cycl/control-vars.lisp", position = 6308) 
  public static SubLSymbol $term_relational_complexity_cutoff$ = null;

  /** compile successful inference chains into macro rules? */
  @SubL(source = "cycl/control-vars.lisp", position = 6458) 
  public static SubLSymbol $collect_justification_compilationsP$ = null;

  /** candidate macro rules are recorded here */
  @SubL(source = "cycl/control-vars.lisp", position = 6599) 
  public static SubLSymbol $justification_compilations$ = null;

  /** tracing level for ebl module [0..5] */
  @SubL(source = "cycl/control-vars.lisp", position = 6692) 
  public static SubLSymbol $ebl_trace$ = null;

  /** Do we allow skolemization during forward inference? */
  @SubL(source = "cycl/control-vars.lisp", position = 6760) 
  public static SubLSymbol $allow_forward_skolemization$ = null;

  /** Do we prefer skolemization during forward inference?  This option will make forward inference tend not to unify to existing NARTs so that new NARTs can be created if they would come into existence (see nat-lookup-pos-preference.) */
  @SubL(source = "cycl/control-vars.lisp", position = 6919) 
  public static SubLSymbol $prefer_forward_skolemization$ = null;

  /** Do we check for and reject unifications where a variable appears in its own binding? */
  @SubL(source = "cycl/control-vars.lisp", position = 7211) 
  public static SubLSymbol $perform_unification_occurs_check$ = null;

  /** Do we use #$equals assertions within term unification? */
  @SubL(source = "cycl/control-vars.lisp", position = 7360) 
  public static SubLSymbol $perform_equals_unification$ = null;

  /** Do we allow backward gafs? */
  @SubL(source = "cycl/control-vars.lisp", position = 7473) 
  public static SubLSymbol $allow_backward_gafs$ = null;

  /** The direction to use for cached ask results. */
  @SubL(source = "cycl/control-vars.lisp", position = 7573) 
  public static SubLSymbol $cached_ask_result_direction$ = null;

  /** Do we check for circularly justified assertions? */
  @SubL(source = "cycl/control-vars.lisp", position = 7684) 
  public static SubLSymbol $check_for_circular_justs$ = null;

  /** Do we ignore deductions for gafs which are already trivially derivable? */
  @SubL(source = "cycl/control-vars.lisp", position = 7789) 
  public static SubLSymbol $filter_deductions_for_trivially_derivable_gafs$ = null;

  /** Whether the inference engine is to be run in debug mode. */
  @SubL(source = "cycl/control-vars.lisp", position = 7941) 
  public static SubLSymbol $inference_debugP$ = null;

  /** Whether forward inferences will be browsable.  If NIL, they will be destroyed after use, along with their problem stores. If T, problem store destruction may never happen for many problem stores--BE CAREFUL */
  @SubL(source = "cycl/control-vars.lisp", position = 8296) 
  public static SubLSymbol $browse_forward_inferencesP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 8564) 
  public static final SubLObject browse_forward_inferencesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $browse_forward_inferencesP$.getDynamicValue(thread);
    }
  }

  /** The query properties that should be inherited by recursive queries. */
  @SubL(source = "cycl/control-vars.lisp", position = 8651) 
  public static SubLSymbol $query_properties_inherited_by_recursive_queries$ = null;

  /** Are we using the inference engine as a proof-checker? */
  @SubL(source = "cycl/control-vars.lisp", position = 9040) 
  public static SubLSymbol $proof_checking_enabled$ = null;

  /** allowable rules */
  @SubL(source = "cycl/control-vars.lisp", position = 9141) 
  public static SubLSymbol $proof_checker_rules$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9200) 
  public static SubLSymbol $inference_propagate_mt_scope$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9282) 
  public static SubLSymbol $inference_current_node_mt_scope$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9334) 
  public static SubLSymbol $inference_literal$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9374) 
  public static SubLSymbol $inference_sense$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9411) 
  public static SubLSymbol $inference_arg$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9446) 
  public static SubLSymbol $inference_more_supports$ = null;

  /** Axioms specified by #$highlyRelevantAssertion. */
  @SubL(source = "cycl/control-vars.lisp", position = 9491) 
  public static SubLSymbol $inference_highly_relevant_assertions$ = null;

  /** Microtheories specified by highlyRelevantMt. */
  @SubL(source = "cycl/control-vars.lisp", position = 9601) 
  public static SubLSymbol $inference_highly_relevant_mts$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 9701) 
  public static SubLSymbol $within_hl_failure_backchainingP$ = null;

  /** Do we backchain on HL predicates? */
  @SubL(source = "cycl/control-vars.lisp", position = 9755) 
  public static SubLSymbol $hl_failure_backchaining$ = null;

  /** Do we backchain on evaluatable predicates? */
  @SubL(source = "cycl/control-vars.lisp", position = 10148) 
  public static SubLSymbol $evaluatable_backchain_enabled$ = null;

  /** Do we allow the minimization inference methods to fire? */
  @SubL(source = "cycl/control-vars.lisp", position = 10254) 
  public static SubLSymbol $negation_by_failure$ = null;

  /** Do we allow use of the 'complete extent' HL inference modules? */
  @SubL(source = "cycl/control-vars.lisp", position = 10624) 
  public static SubLSymbol $complete_extent_minimization$ = null;

  /** Do we allow backchaining using the unbound rule index. */
  @SubL(source = "cycl/control-vars.lisp", position = 11045) 
  public static SubLSymbol $unbound_rule_backchain_enabled$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 11518) 
  public static SubLSymbol $default_removal_cost_cutoff$ = null;

  /** How expensive a removal do we allow (NIL for no restriction). */
  @SubL(source = "cycl/control-vars.lisp", position = 11578) 
  public static SubLSymbol $removal_cost_cutoff$ = null;

  /** How expensive a removal do we allow during forward inference (NIL for no restriction). */
  @SubL(source = "cycl/control-vars.lisp", position = 11720) 
  public static SubLSymbol $forward_inference_removal_cost_cutoff$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 11908) 
  public static SubLSymbol $application_filtering_enabled$ = null;

  /** When a goal node is rejected, do we mark all its semantically invalid ancestors 
as doomed, thereby cutting off large chunks of search which will fail. */
  @SubL(source = "cycl/control-vars.lisp", position = 11960) 
  public static SubLSymbol $marking_doomed_inference_ancestors$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 12171) 
  public static SubLSymbol $inference_search_strategy$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 12355) 
  public static SubLSymbol $unique_inference_result_bindings$ = null;

  /** The handler function to use when generating the results to return from inference searches. */
  @SubL(source = "cycl/control-vars.lisp", position = 12511) 
  public static SubLSymbol $inference_answer_handler$ = null;

  /** The cost value used for performing an HL module simplification step. */
  @SubL(source = "cycl/control-vars.lisp", position = 12682) 
  public static SubLSymbol $hl_module_simplification_cost$ = null;

  /** The cost value used for performing fully-bound HL module checks. */
  @SubL(source = "cycl/control-vars.lisp", position = 12850) 
  public static SubLSymbol $hl_module_check_cost$ = null;

  /** The cost value used for performing cheap fully-bound HL module checks. */
  @SubL(source = "cycl/control-vars.lisp", position = 12962) 
  public static SubLSymbol $cheap_hl_module_check_cost$ = null;

  /** The cost value used for performing typical fully-bound HL module checks. */
  @SubL(source = "cycl/control-vars.lisp", position = 13084) 
  public static SubLSymbol $typical_hl_module_check_cost$ = null;

  /** The cost value used for performing expensive fully-bound HL module checks. */
  @SubL(source = "cycl/control-vars.lisp", position = 13210) 
  public static SubLSymbol $expensive_hl_module_check_cost$ = null;

  /** The cost value used for performing expensive HL module generations. */
  @SubL(source = "cycl/control-vars.lisp", position = 13340) 
  public static SubLSymbol $expensive_hl_module_singleton_generate_cost$ = null;

  /** When non-nil, the maximum cost value allowable for fully-bound HL module checks. */
  @SubL(source = "cycl/control-vars.lisp", position = 13516) 
  public static SubLSymbol $maximum_hl_module_check_cost$ = null;

  /** An estimate of the total number of types for the average term. */
  @SubL(source = "cycl/control-vars.lisp", position = 13736) 
  public static SubLSymbol $average_all_isa_count$ = null;

  /** An estimate of the total number of superclasses for the average collection. */
  @SubL(source = "cycl/control-vars.lisp", position = 14490) 
  public static SubLSymbol $average_all_genls_count$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 15288) 
  public static SubLSymbol $pgia_activeP$ = null;

  /** Global control of whether we ever allow any the-term reasoning at all. */
  @SubL(source = "cycl/control-vars.lisp", position = 15323) 
  public static SubLSymbol $the_term_inference_enabled$ = null;

  /** Controls whether the unifier treats the-terms as variables.
   Should always be globally NIL and bound to T by the-term inference methods. */
  @SubL(source = "cycl/control-vars.lisp", position = 15500) 
  public static SubLSymbol $allow_the_term_unification$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 15692) 
  public static SubLSymbol $inference_the_term_bindings$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 15741) 
  public static SubLSymbol $the_term_qua_constant$ = null;

  /** Determines whether or not External HL module inferencing is enabled. */
  @SubL(source = "cycl/control-vars.lisp", position = 15872) 
  public static SubLSymbol $external_inference_enabled$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 16047) 
  public static SubLSymbol $suppress_conflict_noticesP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 16136) 
  public static SubLSymbol $ignore_conflictsP$ = null;

  /** Do we treat semantically invalid deductions as conflicts? */
  @SubL(source = "cycl/control-vars.lisp", position = 16175) 
  public static SubLSymbol $conflicts_from_invalid_deductions$ = null;

  /** When non-nil, sets of mutually inconsistent HL supports
are stored on the variable *inconsistent-support-sets* */
  @SubL(source = "cycl/control-vars.lisp", position = 16300) 
  public static SubLSymbol $record_inconsistent_support_sets$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 16477) 
  public static SubLSymbol $last_agenda_op$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 16543) 
  public static SubLSymbol $last_agenda_error_message$ = null;

  /** A list - containing either one or more assertions or 
   a list of the form (#$equals <term> <term>) - the 
   contents of which accounts for the halting of the agenda. */
  @SubL(source = "cycl/control-vars.lisp", position = 16588) 
  public static SubLSymbol $last_agenda_error_explanatory_supports$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 16819) 
  public static SubLSymbol $agenda_display_fi_warnings$ = null;

  /** Do we ignore remote errors or handle them the same way as local errors?. */
  @SubL(source = "cycl/control-vars.lisp", position = 16869) 
  public static SubLSymbol $ignore_remote_errors$ = null;

  /** This determines whether or not the image will change to the next KB when the close-kb transcript operation is reached. */
  @SubL(source = "cycl/control-vars.lisp", position = 16994) 
  public static SubLSymbol $auto_increment_kb$ = null;

  /** Controls whether the running image will load submitted transcripts via
     MAYBE-LOAD-SUBMITTED-TRANSCRIPT. */
  @SubL(source = "cycl/control-vars.lisp", position = 17511) 
  private static SubLSymbol $load_submitted_transcriptsP$ = null;

  /** Controls whether, when a submitted transcript is loaded, the image should
  notify the submitter that it is being loaded as part of a build. */
  @SubL(source = "cycl/control-vars.lisp", position = 18077) 
  private static SubLSymbol $send_submitted_transcript_loading_noticesP$ = null;

  /** A string consisting of `<machine-name>-<universal-time>-<process-id>'
which uniquely identifies every separate Cyc image */
  @SubL(source = "cycl/control-vars.lisp", position = 18775) 
  public static SubLSymbol $cyc_image_id$ = null;

  /** Make a unique identifier for a Cyc image: `<machine-name>-<universal-time>-<process-id>'. */
  @SubL(source = "cycl/control-vars.lisp", position = 18930) 
  public static final SubLObject make_cyc_image_id() {
    {
      SubLObject machine_name = Strings.string_downcase(string_utilities.string_upto(Environment.get_machine_name($str37$UNKNOWN), Characters.CHAR_period), UNPROVIDED, UNPROVIDED);
      SubLObject process_id = Environment.get_process_id(UNPROVIDED);
      SubLObject cyc_universal_time = numeric_date_utilities.universal_timestring(UNPROVIDED);
      return PrintLow.format(NIL, $str38$_a__a__a, new SubLObject[] {machine_name, cyc_universal_time, process_id});
    }
  }

  @SubL(source = "cycl/control-vars.lisp", position = 19367) 
  public static final SubLObject set_cyc_image_id() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      $cyc_image_id$.setDynamicValue(make_cyc_image_id(), thread);
      return $cyc_image_id$.getDynamicValue(thread);
    }
  }

  /** Accessor for *cyc-image-id*. */
  @SubL(source = "cycl/control-vars.lisp", position = 19515) 
  public static final SubLObject cyc_image_id() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $cyc_image_id$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/control-vars.lisp", position = 19604) 
  private static SubLSymbol $build_kb_loaded$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 19929) 
  public static final SubLObject set_build_kb_loaded(SubLObject kb) {
    if ((NIL != kb)) {
      checkType(kb, $sym40$INTEGERP);
    }
    $build_kb_loaded$.setGlobalValue(kb);
    return set_kb_loaded(kb);
  }

  @SubL(source = "cycl/control-vars.lisp", position = 20123) 
  private static SubLSymbol $kb_loaded$ = null;

  /** @return nil or integerp; Return the current KB version. */
  @SubL(source = "cycl/control-vars.lisp", position = 20225) 
  public static final SubLObject kb_loaded() {
    return $kb_loaded$.getGlobalValue();
  }

  @SubL(source = "cycl/control-vars.lisp", position = 20336) 
  public static final SubLObject set_kb_loaded(SubLObject kb) {
    if ((NIL != kb)) {
      checkType(kb, $sym40$INTEGERP);
    }
    $kb_loaded$.setGlobalValue(kb);
    return kb;
  }

  /** Does the KB contain a nontrivial amount that is not the core (tiny) KB? */
  @SubL(source = "cycl/control-vars.lisp", position = 20679) 
  public static final SubLObject non_tiny_kb_loadedP() {
    return makeBoolean((constant_handles.constant_count().numG($int26$10000)
           && EIGHT_INTEGER.numL(Numbers.integerDivide(assertion_handles.assertion_count(), forts.fort_count()))));
  }

  @SubL(source = "cycl/control-vars.lisp", position = 21045) 
  public static SubLSymbol $kb_pedigree$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 21409) 
  public static SubLSymbol $use_transcriptP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 21446) 
  public static SubLSymbol $run_own_operationsP$ = null;

  /** Boolean:  This is used by the agenda to decide whether or not to wait before doing another read. */
  @SubL(source = "cycl/control-vars.lisp", position = 21610) 
  public static SubLSymbol $caught_up_on_master_transcript$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 22257) 
  public static SubLSymbol $communication_mode$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 22301) 
  public static SubLSymbol $unencapsulating_within_agenda$ = null;

  /** Whether to save queries asked into a query transcript. */
  @SubL(source = "cycl/control-vars.lisp", position = 24374) 
  public static SubLSymbol $save_asked_queriesP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 24510) 
  public static final SubLObject save_asked_queriesP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $save_asked_queriesP$.getDynamicValue(thread))
             && (NIL != non_tiny_kb_loadedP())
             && (NIL != subl_promotions.positive_integer_p(kb_loaded()))));
    }
  }

  @SubL(source = "cycl/control-vars.lisp", position = 24657) 
  public static SubLSymbol $init_file_loadedP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 24746) 
  public static SubLSymbol $within_assert$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 24801) 
  public static SubLSymbol $within_unassert$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 24838) 
  public static SubLSymbol $within_ask$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 24870) 
  public static SubLSymbol $within_query$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 24904) 
  public static final SubLObject within_askP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $within_ask$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/control-vars.lisp", position = 24957) 
  public static final SubLObject within_queryP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != $within_ask$.getDynamicValue(thread))
            || (NIL != $within_query$.getDynamicValue(thread))));
    }
  }

  @SubL(source = "cycl/control-vars.lisp", position = 25038) 
  public static final SubLObject within_assertP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $within_assert$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/control-vars.lisp", position = 25160) 
  public static SubLSymbol $compute_inference_results$ = null;

  /** Do we cache the results of successful inference in the KB?. */
  @SubL(source = "cycl/control-vars.lisp", position = 25331) 
  public static SubLSymbol $cache_inference_results$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 25676) 
  public static SubLSymbol $transformation_depth_cutoff$ = null;

  /** boolean; Should assertions be displayed in English? */
  @SubL(source = "cycl/control-vars.lisp", position = 26129) 
  public static SubLSymbol $show_assertions_in_english$ = null;

  /** boolean; Should we assume Cyc is talking to the currently-logged-in Cyclist when generating NL in the CB interface? */
  @SubL(source = "cycl/control-vars.lisp", position = 26614) 
  public static SubLSymbol $assume_cyc_cyclist_dialogP$ = null;

  /** boolean: Should terms have links to edit term with FET? */
  @SubL(source = "cycl/control-vars.lisp", position = 26796) 
  public static SubLSymbol $show_fet_edit_buttonsP$ = null;

  /** boolean: Should collections have links to create instance with FET? */
  @SubL(source = "cycl/control-vars.lisp", position = 26987) 
  public static SubLSymbol $show_fet_create_instance_buttonsP$ = null;

  /** boolean: Should collections have links to create spec with FET? */
  @SubL(source = "cycl/control-vars.lisp", position = 27128) 
  public static SubLSymbol $show_fet_create_spec_buttonsP$ = null;

  /** boolean: Should literal query result terms be displayed one per line? */
  @SubL(source = "cycl/control-vars.lisp", position = 27263) 
  public static SubLSymbol $cb_literal_query_results_one_per_lineP$ = null;

  /** boolean: Should skolem applicable relations be displayed? */
  @SubL(source = "cycl/control-vars.lisp", position = 27465) 
  public static SubLSymbol $cb_skolem_applicable_relationsP$ = null;

  /** boolean: Should applicable relations be displayed one per line? */
  @SubL(source = "cycl/control-vars.lisp", position = 27669) 
  public static SubLSymbol $cb_applicable_relations_one_per_lineP$ = null;

  /** boolean: Should applicable relations be paraphrased? */
  @SubL(source = "cycl/control-vars.lisp", position = 27812) 
  public static SubLSymbol $cb_paraphrase_applicable_relationsP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 27942) 
  public static SubLSymbol $meta_query_start_string$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 28208) 
  public static SubLSymbol $current_cache$ = null;

  /** Has the db meta query init file successfully loaded, or not? */
  @SubL(source = "cycl/control-vars.lisp", position = 28401) 
  public static SubLSymbol $dbm_init_file_loadedP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 29135) 
  public static SubLSymbol $dbm_cache_loading_startedP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 29184) 
  public static SubLSymbol $dbm_cache_loading_finishedP$ = null;

  /** When non-nil, the ACIP subkernel we are currently extracting. */
  @SubL(source = "cycl/control-vars.lisp", position = 29233) 
  public static SubLSymbol $acip_subkernel_extraction$ = null;

  /** When non-nil, the stream we are using for output of the ACIP subkernel we are extracting. */
  @SubL(source = "cycl/control-vars.lisp", position = 29517) 
  public static SubLSymbol $acip_subkernel_output_stream$ = null;

  /** This tag will be inserted into every Janus operation that is logged. */
  @SubL(source = "cycl/control-vars.lisp", position = 29668) 
  public static SubLSymbol $janus_tag$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 29806) 
  public static SubLSymbol $janus_new_constants$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 29858) 
  public static SubLSymbol $janus_test_case_loggingP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 29918) 
  public static SubLSymbol $janus_operations$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 29967) 
  public static SubLSymbol $janus_extraction_deduce_specs$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 30029) 
  public static SubLSymbol $janus_within_somethingP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 30085) 
  public static SubLSymbol $janus_testing_deduce_specs$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 30144) 
  public static SubLSymbol $janus_test_case_runningP$ = null;

  @SubL(source = "cycl/control-vars.lisp", position = 30201) 
  public static SubLSymbol $ask_quirkP$ = null;

  /** Whether to use #$sentenceParameterValueInSpecification, #$microtheoryParameterValueInSpecification,
 and #$inferenceModeParameterValueInSpecification for lookup */
  @SubL(source = "cycl/control-vars.lisp", position = 30263) 
  public static SubLSymbol $curried_kbq_lookupP$ = null;

  /** When non-nil, the inferences and problem-stores generated by KBQ-RUN-QUERY are auto-destroyed. */
  @SubL(source = "cycl/control-vars.lisp", position = 30535) 
  public static SubLSymbol $kbq_run_query_auto_destroy_enabledP$ = null;

  /** When non-nil, the inferences generated by KBQ-RUN-QUERY are always run with :continuable? NIL
   since they won't ever be continued. */
  @SubL(source = "cycl/control-vars.lisp", position = 30700) 
  public static SubLSymbol $kbq_run_query_non_continuable_enabledP$ = null;

  public static final SubLObject declare_control_vars_file() {
    declareMacro(myName, "within_hl_modification", "WITHIN-HL-MODIFICATION");
    declareFunction(myName, "mapping_funcall_arg", "MAPPING-FUNCALL-ARG", 1, 1, false);
    declareFunction(myName, "mapping_funcall_int", "MAPPING-FUNCALL-INT", 0, 0, false);
    declareFunction(myName, "inference_warn", "INFERENCE-WARN", 1, 2, false);
    declareFunction(myName, "browse_forward_inferencesP", "BROWSE-FORWARD-INFERENCES?", 0, 0, false);
    declareFunction(myName, "the_term_qua_constantP", "THE-TERM-QUA-CONSTANT?", 1, 0, false);
    declareFunction(myName, "auto_increment_kb", "AUTO-INCREMENT-KB", 0, 0, false);
    declareFunction(myName, "set_auto_increment_kb", "SET-AUTO-INCREMENT-KB", 1, 0, false);
    declareFunction(myName, "load_submitted_transcriptsP", "LOAD-SUBMITTED-TRANSCRIPTS?", 0, 0, false);
    declareFunction(myName, "set_load_submitted_transcripts", "SET-LOAD-SUBMITTED-TRANSCRIPTS", 1, 0, false);
    declareFunction(myName, "send_submitted_transcript_loading_noticesP", "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?", 0, 0, false);
    declareFunction(myName, "set_send_submitted_transcript_loading_notices", "SET-SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES", 1, 0, false);
    declareFunction(myName, "make_cyc_image_id", "MAKE-CYC-IMAGE-ID", 0, 0, false);
    declareFunction(myName, "set_cyc_image_id", "SET-CYC-IMAGE-ID", 0, 0, false);
    declareFunction(myName, "cyc_image_id", "CYC-IMAGE-ID", 0, 0, false);
    declareFunction(myName, "build_kb_loaded", "BUILD-KB-LOADED", 0, 0, false);
    declareFunction(myName, "set_build_kb_loaded", "SET-BUILD-KB-LOADED", 1, 0, false);
    declareFunction(myName, "kb_loaded", "KB-LOADED", 0, 0, false);
    declareFunction(myName, "set_kb_loaded", "SET-KB-LOADED", 1, 0, false);
    declareFunction(myName, "core_kb_loadedP", "CORE-KB-LOADED?", 0, 0, false);
    declareFunction(myName, "non_tiny_kb_loadedP", "NON-TINY-KB-LOADED?", 0, 0, false);
    declareFunction(myName, "kb_tiny_or_full", "KB-TINY-OR-FULL", 0, 0, false);
    declareFunction(myName, "kb_pedigree", "KB-PEDIGREE", 0, 0, false);
    declareFunction(myName, "caught_up_on_master_transcript", "CAUGHT-UP-ON-MASTER-TRANSCRIPT", 0, 0, false);
    declareFunction(myName, "set_caught_up_on_master_transcript", "SET-CAUGHT-UP-ON-MASTER-TRANSCRIPT", 1, 0, false);
    declareFunction(myName, "save_asked_queriesP", "SAVE-ASKED-QUERIES?", 0, 0, false);
    declareFunction(myName, "within_askP", "WITHIN-ASK?", 0, 0, false);
    declareFunction(myName, "within_queryP", "WITHIN-QUERY?", 0, 0, false);
    declareFunction(myName, "within_assertP", "WITHIN-ASSERT?", 0, 0, false);
    declareFunction(myName, "within_unassertP", "WITHIN-UNASSERT?", 0, 0, false);
    declareFunction(myName, "lexicon_initialized_p", "LEXICON-INITIALIZED-P", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_control_vars_file() {
    $read_require_constant_exists$ = defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", T);
    $table_area$ = deflexical("*TABLE-AREA*", ((NIL != Symbols.boundp($sym0$_TABLE_AREA_)) ? ((SubLObject) $table_area$.getGlobalValue()) : NIL));
    $hl_lock$ = deflexical("*HL-LOCK*", ((NIL != Symbols.boundp($sym1$_HL_LOCK_)) ? ((SubLObject) $hl_lock$.getGlobalValue()) : Locks.make_lock($str2$HL_Store_Lock)));
    $bootstrapping_kbP$ = defparameter("*BOOTSTRAPPING-KB?*", NIL);
    $keyword_package$ = deflexical("*KEYWORD-PACKAGE*", Packages.find_package($str5$KEYWORD));
    $sublisp_package$ = deflexical("*SUBLISP-PACKAGE*", Packages.find_package($str6$SUBLISP));
    $cyc_package$ = deflexical("*CYC-PACKAGE*", Packages.find_package($str7$CYC));
    $cnf_matching_predicate$ = defparameter("*CNF-MATCHING-PREDICATE*", EQUAL);
    $gaf_matching_predicate$ = defparameter("*GAF-MATCHING-PREDICATE*", EQUAL);
    $nat_matching_predicate$ = defparameter("*NAT-MATCHING-PREDICATE*", EQUAL);
    $candidate_assertion$ = defparameter("*CANDIDATE-ASSERTION*", NIL);
    $variable_names$ = defparameter("*VARIABLE-NAMES*", NIL);
    $assertion_truth$ = defparameter("*ASSERTION-TRUTH*", $kw8$TRUE);
    $mapping_answer$ = defparameter("*MAPPING-ANSWER*", NIL);
    $mapping_pred$ = defparameter("*MAPPING-PRED*", NIL);
    $mapping_source$ = defparameter("*MAPPING-SOURCE*", NIL);
    $mapping_target$ = defparameter("*MAPPING-TARGET*", NIL);
    $mapping_target_arg$ = defparameter("*MAPPING-TARGET-ARG*", NIL);
    $mapping_index_arg$ = defparameter("*MAPPING-INDEX-ARG*", NIL);
    $mapping_gather_arg$ = defparameter("*MAPPING-GATHER-ARG*", NIL);
    $mapping_gather_args$ = defparameter("*MAPPING-GATHER-ARGS*", NIL);
    $mapping_output_stream$ = defparameter("*MAPPING-OUTPUT-STREAM*", T);
    $mapping_equality_test$ = defparameter("*MAPPING-EQUALITY-TEST*", Symbols.symbol_function(EQ));
    $mapping_any_answerP$ = defparameter("*MAPPING-ANY-ANSWER?*", NIL);
    $mapping_relation$ = defparameter("*MAPPING-RELATION*", NIL);
    $mapping_finished_fn$ = defparameter("*MAPPING-FINISHED-FN*", NIL);
    $mapping_path$ = defparameter("*MAPPING-PATH*", NIL);
    $mapping_data_1$ = defparameter("*MAPPING-DATA-1*", NIL);
    $mapping_data_2$ = defparameter("*MAPPING-DATA-2*", NIL);
    $mapping_pivot_arg$ = defparameter("*MAPPING-PIVOT-ARG*", NIL);
    $mapping_gather_key$ = defparameter("*MAPPING-GATHER-KEY*", Symbols.symbol_function(IDENTITY));
    $mapping_gather_key_args$ = defparameter("*MAPPING-GATHER-KEY-ARGS*", NIL);
    $mapping_assertion_selection_fn$ = defparameter("*MAPPING-ASSERTION-SELECTION-FN*", NIL);
    $mapping_assertion_bookkeeping_fn$ = defparameter("*MAPPING-ASSERTION-BOOKKEEPING-FN*", NIL);
    $mapping_fn$ = defparameter("*MAPPING-FN*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg$ = defparameter("*MAPPING-FN-ARG*", ONE_INTEGER);
    $mapping_fn_arg1$ = defparameter("*MAPPING-FN-ARG1*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg2$ = defparameter("*MAPPING-FN-ARG2*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg3$ = defparameter("*MAPPING-FN-ARG3*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg4$ = defparameter("*MAPPING-FN-ARG4*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg5$ = defparameter("*MAPPING-FN-ARG5*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg6$ = defparameter("*MAPPING-FN-ARG6*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg7$ = defparameter("*MAPPING-FN-ARG7*", utilities_macros.$unprovided$.getGlobalValue());
    $mapping_fn_arg8$ = defparameter("*MAPPING-FN-ARG8*", utilities_macros.$unprovided$.getGlobalValue());
    $kba_pred$ = defparameter("*KBA-PRED*", NIL);
    $standard_indent_string$ = defparameter("*STANDARD-INDENT-STRING*", $str9$_);
    $term_functional_complexity_cutoff$ = defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", NIL);
    $term_relational_complexity_cutoff$ = defparameter("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", NIL);
    $collect_justification_compilationsP$ = defparameter("*COLLECT-JUSTIFICATION-COMPILATIONS?*", NIL);
    $justification_compilations$ = defparameter("*JUSTIFICATION-COMPILATIONS*", NIL);
    $ebl_trace$ = defparameter("*EBL-TRACE*", ZERO_INTEGER);
    $allow_forward_skolemization$ = defparameter("*ALLOW-FORWARD-SKOLEMIZATION*", NIL);
    $prefer_forward_skolemization$ = defparameter("*PREFER-FORWARD-SKOLEMIZATION*", NIL);
    $perform_unification_occurs_check$ = defparameter("*PERFORM-UNIFICATION-OCCURS-CHECK*", T);
    $perform_equals_unification$ = defparameter("*PERFORM-EQUALS-UNIFICATION*", T);
    $allow_backward_gafs$ = defparameter("*ALLOW-BACKWARD-GAFS*", T);
    $cached_ask_result_direction$ = defparameter("*CACHED-ASK-RESULT-DIRECTION*", $kw10$FORWARD);
    $check_for_circular_justs$ = defparameter("*CHECK-FOR-CIRCULAR-JUSTS*", T);
    $filter_deductions_for_trivially_derivable_gafs$ = defparameter("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", NIL);
    $inference_debugP$ = defparameter("*INFERENCE-DEBUG?*", NIL);
    $browse_forward_inferencesP$ = defvar("*BROWSE-FORWARD-INFERENCES?*", NIL);
    $query_properties_inherited_by_recursive_queries$ = defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list11);
    $proof_checking_enabled$ = defparameter("*PROOF-CHECKING-ENABLED*", NIL);
    $proof_checker_rules$ = defparameter("*PROOF-CHECKER-RULES*", NIL);
    $inference_propagate_mt_scope$ = defparameter("*INFERENCE-PROPAGATE-MT-SCOPE*", NIL);
    $inference_current_node_mt_scope$ = defparameter("*INFERENCE-CURRENT-NODE-MT-SCOPE*", NIL);
    $inference_literal$ = defparameter("*INFERENCE-LITERAL*", NIL);
    $inference_sense$ = defparameter("*INFERENCE-SENSE*", NIL);
    $inference_arg$ = defparameter("*INFERENCE-ARG*", NIL);
    $inference_more_supports$ = defparameter("*INFERENCE-MORE-SUPPORTS*", NIL);
    $inference_highly_relevant_assertions$ = defparameter("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", NIL);
    $inference_highly_relevant_mts$ = defparameter("*INFERENCE-HIGHLY-RELEVANT-MTS*", NIL);
    $within_hl_failure_backchainingP$ = defparameter("*WITHIN-HL-FAILURE-BACKCHAINING?*", NIL);
    $hl_failure_backchaining$ = defparameter("*HL-FAILURE-BACKCHAINING*", NIL);
    $evaluatable_backchain_enabled$ = defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", NIL);
    $negation_by_failure$ = defparameter("*NEGATION-BY-FAILURE*", NIL);
    $complete_extent_minimization$ = defparameter("*COMPLETE-EXTENT-MINIMIZATION*", T);
    $unbound_rule_backchain_enabled$ = defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", NIL);
    $default_removal_cost_cutoff$ = deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", $int26$10000);
    $removal_cost_cutoff$ = defparameter("*REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
    $forward_inference_removal_cost_cutoff$ = defparameter("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
    $application_filtering_enabled$ = defparameter("*APPLICATION-FILTERING-ENABLED*", NIL);
    $marking_doomed_inference_ancestors$ = defparameter("*MARKING-DOOMED-INFERENCE-ANCESTORS*", NIL);
    $inference_search_strategy$ = defparameter("*INFERENCE-SEARCH-STRATEGY*", $kw27$HEURISTIC);
    $unique_inference_result_bindings$ = defparameter("*UNIQUE-INFERENCE-RESULT-BINDINGS*", T);
    $inference_answer_handler$ = defparameter("*INFERENCE-ANSWER-HANDLER*", $sym28$INFERENCE_RETURN_BLISTS);
    $hl_module_simplification_cost$ = defparameter("*HL-MODULE-SIMPLIFICATION-COST*", $float29$0_1);
    $hl_module_check_cost$ = defparameter("*HL-MODULE-CHECK-COST*", $float30$0_5);
    $cheap_hl_module_check_cost$ = deflexical("*CHEAP-HL-MODULE-CHECK-COST*", $float30$0_5);
    $typical_hl_module_check_cost$ = deflexical("*TYPICAL-HL-MODULE-CHECK-COST*", $float31$1_0);
    $expensive_hl_module_check_cost$ = deflexical("*EXPENSIVE-HL-MODULE-CHECK-COST*", $float32$1_5);
    $expensive_hl_module_singleton_generate_cost$ = deflexical("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
    $maximum_hl_module_check_cost$ = defparameter("*MAXIMUM-HL-MODULE-CHECK-COST*", NIL);
    $average_all_isa_count$ = defparameter("*AVERAGE-ALL-ISA-COUNT*", $int33$38);
    $average_all_genls_count$ = defparameter("*AVERAGE-ALL-GENLS-COUNT*", $int34$47);
    $pgia_activeP$ = defparameter("*PGIA-ACTIVE?*", NIL);
    $the_term_inference_enabled$ = defparameter("*THE-TERM-INFERENCE-ENABLED*", NIL);
    $allow_the_term_unification$ = defparameter("*ALLOW-THE-TERM-UNIFICATION*", NIL);
    $inference_the_term_bindings$ = defparameter("*INFERENCE-THE-TERM-BINDINGS*", NIL);
    $the_term_qua_constant$ = defparameter("*THE-TERM-QUA-CONSTANT*", NIL);
    $external_inference_enabled$ = defparameter("*EXTERNAL-INFERENCE-ENABLED*", NIL);
    $suppress_conflict_noticesP$ = defparameter("*SUPPRESS-CONFLICT-NOTICES?*", NIL);
    $ignore_conflictsP$ = defparameter("*IGNORE-CONFLICTS?*", NIL);
    $conflicts_from_invalid_deductions$ = defparameter("*CONFLICTS-FROM-INVALID-DEDUCTIONS*", NIL);
    $record_inconsistent_support_sets$ = defparameter("*RECORD-INCONSISTENT-SUPPORT-SETS*", NIL);
    $last_agenda_op$ = deflexical("*LAST-AGENDA-OP*", NIL);
    $last_agenda_error_message$ = deflexical("*LAST-AGENDA-ERROR-MESSAGE*", NIL);
    $last_agenda_error_explanatory_supports$ = deflexical("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", NIL);
    $agenda_display_fi_warnings$ = defparameter("*AGENDA-DISPLAY-FI-WARNINGS*", NIL);
    $ignore_remote_errors$ = defparameter("*IGNORE-REMOTE-ERRORS*", T);
    $auto_increment_kb$ = deflexical("*AUTO-INCREMENT-KB*", ((NIL != Symbols.boundp($sym35$_AUTO_INCREMENT_KB_)) ? ((SubLObject) $auto_increment_kb$.getGlobalValue()) : NIL));
    $load_submitted_transcriptsP$ = deflexical("*LOAD-SUBMITTED-TRANSCRIPTS?*", NIL);
    $send_submitted_transcript_loading_noticesP$ = deflexical("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", NIL);
    $cyc_image_id$ = defvar("*CYC-IMAGE-ID*", NIL);
    $build_kb_loaded$ = deflexical("*BUILD-KB-LOADED*", ((NIL != Symbols.boundp($sym39$_BUILD_KB_LOADED_)) ? ((SubLObject) $build_kb_loaded$.getGlobalValue()) : NIL));
    $kb_loaded$ = deflexical("*KB-LOADED*", ((NIL != Symbols.boundp($sym41$_KB_LOADED_)) ? ((SubLObject) $kb_loaded$.getGlobalValue()) : NIL));
    $kb_pedigree$ = deflexical("*KB-PEDIGREE*", ((NIL != Symbols.boundp($sym44$_KB_PEDIGREE_)) ? ((SubLObject) $kb_pedigree$.getGlobalValue()) : $kw45$UNKNOWN));
    $use_transcriptP$ = defparameter("*USE-TRANSCRIPT?*", T);
    $run_own_operationsP$ = deflexical("*RUN-OWN-OPERATIONS?*", ((NIL != Symbols.boundp($sym46$_RUN_OWN_OPERATIONS__)) ? ((SubLObject) $run_own_operationsP$.getGlobalValue()) : T));
    $caught_up_on_master_transcript$ = deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", ((NIL != Symbols.boundp($sym47$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_)) ? ((SubLObject) $caught_up_on_master_transcript$.getGlobalValue()) : NIL));
    $communication_mode$ = deflexical("*COMMUNICATION-MODE*", ((NIL != Symbols.boundp($sym48$_COMMUNICATION_MODE_)) ? ((SubLObject) $communication_mode$.getGlobalValue()) : $kw45$UNKNOWN));
    $unencapsulating_within_agenda$ = defparameter("*UNENCAPSULATING-WITHIN-AGENDA*", NIL);
    $save_asked_queriesP$ = defvar("*SAVE-ASKED-QUERIES?*", NIL);
    $init_file_loadedP$ = deflexical("*INIT-FILE-LOADED?*", ((NIL != Symbols.boundp($sym49$_INIT_FILE_LOADED__)) ? ((SubLObject) $init_file_loadedP$.getGlobalValue()) : NIL));
    $within_assert$ = defparameter("*WITHIN-ASSERT*", NIL);
    $within_unassert$ = defparameter("*WITHIN-UNASSERT*", NIL);
    $within_ask$ = defparameter("*WITHIN-ASK*", NIL);
    $within_query$ = defparameter("*WITHIN-QUERY*", NIL);
    $compute_inference_results$ = defparameter("*COMPUTE-INFERENCE-RESULTS*", T);
    $cache_inference_results$ = defparameter("*CACHE-INFERENCE-RESULTS*", NIL);
    $transformation_depth_cutoff$ = defparameter("*TRANSFORMATION-DEPTH-CUTOFF*", NIL);
    $show_assertions_in_english$ = defparameter("*SHOW-ASSERTIONS-IN-ENGLISH*", NIL);
    $assume_cyc_cyclist_dialogP$ = defparameter("*ASSUME-CYC-CYCLIST-DIALOG?*", T);
    $show_fet_edit_buttonsP$ = defparameter("*SHOW-FET-EDIT-BUTTONS?*", T);
    $show_fet_create_instance_buttonsP$ = defparameter("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", T);
    $show_fet_create_spec_buttonsP$ = defparameter("*SHOW-FET-CREATE-SPEC-BUTTONS?*", NIL);
    $cb_literal_query_results_one_per_lineP$ = defparameter("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", NIL);
    $cb_skolem_applicable_relationsP$ = defparameter("*CB-SKOLEM-APPLICABLE-RELATIONS?*", NIL);
    $cb_applicable_relations_one_per_lineP$ = defparameter("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", NIL);
    $cb_paraphrase_applicable_relationsP$ = defparameter("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", NIL);
    $meta_query_start_string$ = defparameter("*META-QUERY-START-STRING*", NIL);
    $current_cache$ = defparameter("*CURRENT-CACHE*", NIL);
    $dbm_init_file_loadedP$ = defparameter("*DBM-INIT-FILE-LOADED?*", NIL);
    $dbm_cache_loading_startedP$ = defparameter("*DBM-CACHE-LOADING-STARTED?*", NIL);
    $dbm_cache_loading_finishedP$ = defparameter("*DBM-CACHE-LOADING-FINISHED?*", NIL);
    $acip_subkernel_extraction$ = deflexical("*ACIP-SUBKERNEL-EXTRACTION*", ((NIL != Symbols.boundp($sym53$_ACIP_SUBKERNEL_EXTRACTION_)) ? ((SubLObject) $acip_subkernel_extraction$.getGlobalValue()) : NIL));
    $acip_subkernel_output_stream$ = deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", ((NIL != Symbols.boundp($sym54$_ACIP_SUBKERNEL_OUTPUT_STREAM_)) ? ((SubLObject) $acip_subkernel_output_stream$.getGlobalValue()) : NIL));
    $janus_tag$ = defparameter("*JANUS-TAG*", NIL);
    $janus_new_constants$ = defparameter("*JANUS-NEW-CONSTANTS*", NIL);
    $janus_test_case_loggingP$ = defparameter("*JANUS-TEST-CASE-LOGGING?*", NIL);
    $janus_operations$ = defparameter("*JANUS-OPERATIONS*", NIL);
    $janus_extraction_deduce_specs$ = defparameter("*JANUS-EXTRACTION-DEDUCE-SPECS*", NIL);
    $janus_within_somethingP$ = defparameter("*JANUS-WITHIN-SOMETHING?*", NIL);
    $janus_testing_deduce_specs$ = defparameter("*JANUS-TESTING-DEDUCE-SPECS*", NIL);
    $janus_test_case_runningP$ = defparameter("*JANUS-TEST-CASE-RUNNING?*", NIL);
    $ask_quirkP$ = defvar("*ASK-QUIRK?*", NIL);
    $curried_kbq_lookupP$ = defvar("*CURRIED-KBQ-LOOKUP?*", T);
    $kbq_run_query_auto_destroy_enabledP$ = defparameter("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", T);
    $kbq_run_query_non_continuable_enabledP$ = defparameter("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", T);
    return NIL;
  }

  public static final SubLObject setup_control_vars_file() {
    // CVS_ID("Id: control-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_TABLE_AREA_);
    subl_macro_promotions.declare_defglobal($sym1$_HL_LOCK_);
    utilities_macros.register_global_lock($sym1$_HL_LOCK_, $str2$HL_Store_Lock);
    utilities_macros.declare_control_parameter_internal($sym12$_HL_FAILURE_BACKCHAINING_, $str13$Enable_HL_predicate_backchaining, $str14$This_controls_whether_or_not_we_a, $list15);
    utilities_macros.declare_control_parameter_internal($sym16$_NEGATION_BY_FAILURE_, $str17$Enable_negation_by_failure, $str18$This_controls_whether_or_not_we_a, $list19);
    utilities_macros.declare_control_parameter_internal($sym20$_COMPLETE_EXTENT_MINIMIZATION_, $str21$Enable_complete_extent_minimizati, $str22$This_controls_whether_or_not_we_a, $list19);
    utilities_macros.declare_control_parameter_internal($sym23$_UNBOUND_RULE_BACKCHAIN_ENABLED_, $str24$Enable_unbound_predicate_rule_bac, $str25$This_controls_whether_or_not_we_a, $list15);
    subl_macro_promotions.declare_defglobal($sym35$_AUTO_INCREMENT_KB_);
    subl_macro_promotions.declare_defglobal($sym39$_BUILD_KB_LOADED_);
    subl_macro_promotions.declare_defglobal($sym41$_KB_LOADED_);
    subl_macro_promotions.declare_defglobal($sym44$_KB_PEDIGREE_);
    subl_macro_promotions.declare_defglobal($sym46$_RUN_OWN_OPERATIONS__);
    subl_macro_promotions.declare_defglobal($sym47$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_);
    subl_macro_promotions.declare_defglobal($sym48$_COMMUNICATION_MODE_);
    subl_macro_promotions.declare_defglobal($sym49$_INIT_FILE_LOADED__);
    utilities_macros.declare_control_parameter_internal($sym50$_CACHE_INFERENCE_RESULTS_, $str51$Cache_backward_query_results, $str52$This_controls_whether_the_results, $list19);
    subl_macro_promotions.declare_defglobal($sym53$_ACIP_SUBKERNEL_EXTRACTION_);
    subl_macro_promotions.declare_defglobal($sym54$_ACIP_SUBKERNEL_OUTPUT_STREAM_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_TABLE_AREA_ = makeSymbol("*TABLE-AREA*");
  public static final SubLSymbol $sym1$_HL_LOCK_ = makeSymbol("*HL-LOCK*");
  public static final SubLString $str2$HL_Store_Lock = makeString("HL Store Lock");
  public static final SubLSymbol $sym3$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLList $list4 = list(makeSymbol("*HL-LOCK*"));
  public static final SubLString $str5$KEYWORD = makeString("KEYWORD");
  public static final SubLString $str6$SUBLISP = makeString("SUBLISP");
  public static final SubLString $str7$CYC = makeString("CYC");
  public static final SubLSymbol $kw8$TRUE = makeKeyword("TRUE");
  public static final SubLString $str9$_ = makeString(" ");
  public static final SubLSymbol $kw10$FORWARD = makeKeyword("FORWARD");
  public static final SubLList $list11 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
  public static final SubLSymbol $sym12$_HL_FAILURE_BACKCHAINING_ = makeSymbol("*HL-FAILURE-BACKCHAINING*");
  public static final SubLString $str13$Enable_HL_predicate_backchaining = makeString("Enable HL predicate backchaining");
  public static final SubLString $str14$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");
  public static final SubLList $list15 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes (expensive)")));
  public static final SubLSymbol $sym16$_NEGATION_BY_FAILURE_ = makeSymbol("*NEGATION-BY-FAILURE*");
  public static final SubLString $str17$Enable_negation_by_failure = makeString("Enable negation by failure");
  public static final SubLString $str18$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");
  public static final SubLList $list19 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));
  public static final SubLSymbol $sym20$_COMPLETE_EXTENT_MINIMIZATION_ = makeSymbol("*COMPLETE-EXTENT-MINIMIZATION*");
  public static final SubLString $str21$Enable_complete_extent_minimizati = makeString("Enable complete extent minimization");
  public static final SubLString $str22$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");
  public static final SubLSymbol $sym23$_UNBOUND_RULE_BACKCHAIN_ENABLED_ = makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*");
  public static final SubLString $str24$Enable_unbound_predicate_rule_bac = makeString("Enable unbound predicate rule backchaining");
  public static final SubLString $str25$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");
  public static final SubLInteger $int26$10000 = makeInteger(10000);
  public static final SubLSymbol $kw27$HEURISTIC = makeKeyword("HEURISTIC");
  public static final SubLSymbol $sym28$INFERENCE_RETURN_BLISTS = makeSymbol("INFERENCE-RETURN-BLISTS");
  public static final SubLFloat $float29$0_1 = makeDouble(0.1);
  public static final SubLFloat $float30$0_5 = makeDouble(0.5);
  public static final SubLFloat $float31$1_0 = makeDouble(1.0);
  public static final SubLFloat $float32$1_5 = makeDouble(1.5);
  public static final SubLInteger $int33$38 = makeInteger(38);
  public static final SubLInteger $int34$47 = makeInteger(47);
  public static final SubLSymbol $sym35$_AUTO_INCREMENT_KB_ = makeSymbol("*AUTO-INCREMENT-KB*");
  public static final SubLSymbol $sym36$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLString $str37$UNKNOWN = makeString("UNKNOWN");
  public static final SubLString $str38$_a__a__a = makeString("~a-~a-~a");
  public static final SubLSymbol $sym39$_BUILD_KB_LOADED_ = makeSymbol("*BUILD-KB-LOADED*");
  public static final SubLSymbol $sym40$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym41$_KB_LOADED_ = makeSymbol("*KB-LOADED*");
  public static final SubLSymbol $kw42$FULL = makeKeyword("FULL");
  public static final SubLSymbol $kw43$TINY = makeKeyword("TINY");
  public static final SubLSymbol $sym44$_KB_PEDIGREE_ = makeSymbol("*KB-PEDIGREE*");
  public static final SubLSymbol $kw45$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $sym46$_RUN_OWN_OPERATIONS__ = makeSymbol("*RUN-OWN-OPERATIONS?*");
  public static final SubLSymbol $sym47$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_ = makeSymbol("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*");
  public static final SubLSymbol $sym48$_COMMUNICATION_MODE_ = makeSymbol("*COMMUNICATION-MODE*");
  public static final SubLSymbol $sym49$_INIT_FILE_LOADED__ = makeSymbol("*INIT-FILE-LOADED?*");
  public static final SubLSymbol $sym50$_CACHE_INFERENCE_RESULTS_ = makeSymbol("*CACHE-INFERENCE-RESULTS*");
  public static final SubLString $str51$Cache_backward_query_results = makeString("Cache backward query results");
  public static final SubLString $str52$This_controls_whether_the_results = makeString("This controls whether the results of successful backward queries are cached in the KB.");
  public static final SubLSymbol $sym53$_ACIP_SUBKERNEL_EXTRACTION_ = makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*");
  public static final SubLSymbol $sym54$_ACIP_SUBKERNEL_OUTPUT_STREAM_ = makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*");

  //// Initializers

  public void declareFunctions() {
    declare_control_vars_file();
  }

  public void initializeVariables() {
    init_control_vars_file();
  }

  public void runTopLevelForms() {
    setup_control_vars_file();
  }

}
