package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class control_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.control_vars";
  public static final String myFingerPrint = "0507d1915100579fd50325342170025a4afec867f5466d069b8843ac8a618bc3";
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 758L)
  public static SubLSymbol $read_require_constant_exists$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 886L)
  public static SubLSymbol $table_area$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1014L)
  public static SubLSymbol $hl_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1215L)
  public static SubLSymbol $bootstrapping_kbP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1255L)
  public static SubLSymbol $keyword_package$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1319L)
  public static SubLSymbol $sublisp_package$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1382L)
  public static SubLSymbol $cyc_package$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2129L)
  public static SubLSymbol $cnf_matching_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2301L)
  public static SubLSymbol $gaf_matching_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2449L)
  public static SubLSymbol $nat_matching_predicate$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2673L)
  public static SubLSymbol $candidate_assertion$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2770L)
  public static SubLSymbol $variable_names$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2806L)
  public static SubLSymbol $assertion_truth$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2845L)
  public static SubLSymbol $mapping_answer$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2928L)
  public static SubLSymbol $mapping_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2962L)
  public static SubLSymbol $mapping_source$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 2998L)
  public static SubLSymbol $mapping_target$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3034L)
  public static SubLSymbol $mapping_target_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3074L)
  public static SubLSymbol $mapping_index_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3113L)
  public static SubLSymbol $mapping_gather_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3153L)
  public static SubLSymbol $mapping_gather_args$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3194L)
  public static SubLSymbol $mapping_output_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3235L)
  public static SubLSymbol $mapping_equality_test$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3282L)
  public static SubLSymbol $mapping_any_answerP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3323L)
  public static SubLSymbol $mapping_relation$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3361L)
  public static SubLSymbol $mapping_finished_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3402L)
  public static SubLSymbol $mapping_path$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3436L)
  public static SubLSymbol $mapping_data_1$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3472L)
  public static SubLSymbol $mapping_data_2$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3508L)
  public static SubLSymbol $mapping_pivot_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3547L)
  public static SubLSymbol $mapping_gather_key$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3595L)
  public static SubLSymbol $mapping_gather_key_args$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3640L)
  public static SubLSymbol $mapping_assertion_selection_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3692L)
  public static SubLSymbol $mapping_assertion_bookkeeping_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3746L)
  public static SubLSymbol $mapping_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3830L)
  public static SubLSymbol $mapping_fn_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 3921L)
  public static SubLSymbol $mapping_fn_arg1$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4005L)
  public static SubLSymbol $mapping_fn_arg2$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4089L)
  public static SubLSymbol $mapping_fn_arg3$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4173L)
  public static SubLSymbol $mapping_fn_arg4$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4257L)
  public static SubLSymbol $mapping_fn_arg5$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4341L)
  public static SubLSymbol $mapping_fn_arg6$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4425L)
  public static SubLSymbol $mapping_fn_arg7$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4509L)
  public static SubLSymbol $mapping_fn_arg8$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 6672L)
  public static SubLSymbol $kba_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 6748L)
  public static SubLSymbol $standard_indent_string$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 6792L)
  public static SubLSymbol $term_functional_complexity_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 6997L)
  public static SubLSymbol $term_relational_complexity_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 7147L)
  public static SubLSymbol $collect_justification_compilationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 7288L)
  public static SubLSymbol $justification_compilations$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 7381L)
  public static SubLSymbol $ebl_trace$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 7449L)
  public static SubLSymbol $allow_forward_skolemization$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 7608L)
  public static SubLSymbol $prefer_forward_skolemization$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 7900L)
  public static SubLSymbol $perform_unification_occurs_check$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8049L)
  public static SubLSymbol $perform_equals_unification$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8162L)
  public static SubLSymbol $allow_backward_gafs$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8262L)
  public static SubLSymbol $cached_ask_result_direction$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8373L)
  public static SubLSymbol $check_for_circular_justs$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8478L)
  public static SubLSymbol $filter_deductions_for_trivially_derivable_gafs$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8630L)
  public static SubLSymbol $inference_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8985L)
  public static SubLSymbol $inference_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 9143L)
  public static SubLSymbol $browse_forward_inferencesP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 9498L)
  public static SubLSymbol $query_properties_inherited_by_recursive_queries$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 9887L)
  public static SubLSymbol $proof_checking_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 9988L)
  public static SubLSymbol $proof_checker_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10047L)
  public static SubLSymbol $inference_propagate_mt_scope$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10129L)
  public static SubLSymbol $inference_current_node_mt_scope$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10181L)
  public static SubLSymbol $inference_literal$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10221L)
  public static SubLSymbol $inference_sense$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10258L)
  public static SubLSymbol $inference_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10293L)
  public static SubLSymbol $inference_more_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10338L)
  public static SubLSymbol $inference_highly_relevant_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10448L)
  public static SubLSymbol $inference_highly_relevant_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10548L)
  public static SubLSymbol $within_hl_failure_backchainingP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10602L)
  public static SubLSymbol $hl_failure_backchaining$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 10995L)
  public static SubLSymbol $evaluatable_backchain_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 11101L)
  public static SubLSymbol $negation_by_failure$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 11471L)
  public static SubLSymbol $complete_extent_minimization$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 11892L)
  public static SubLSymbol $unbound_rule_backchain_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 12365L)
  public static SubLSymbol $default_removal_cost_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 12426L)
  public static SubLSymbol $removal_cost_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 12568L)
  public static SubLSymbol $forward_inference_removal_cost_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 12756L)
  public static SubLSymbol $application_filtering_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 12808L)
  public static SubLSymbol $marking_doomed_inference_ancestors$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13019L)
  public static SubLSymbol $inference_search_strategy$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13203L)
  public static SubLSymbol $unique_inference_result_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13359L)
  public static SubLSymbol $inference_answer_handler$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13530L)
  public static SubLSymbol $hl_module_simplification_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13698L)
  public static SubLSymbol $hl_module_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13810L)
  public static SubLSymbol $cheap_hl_module_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 13932L)
  public static SubLSymbol $typical_hl_module_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 14058L)
  public static SubLSymbol $expensive_hl_module_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 14188L)
  public static SubLSymbol $expensive_hl_module_singleton_generate_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 14364L)
  public static SubLSymbol $maximum_hl_module_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 14584L)
  public static SubLSymbol $average_all_isa_count$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 15338L)
  public static SubLSymbol $average_all_genls_count$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16136L)
  public static SubLSymbol $pgia_activeP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16171L)
  public static SubLSymbol $the_term_inference_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16348L)
  public static SubLSymbol $allow_the_term_unification$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16540L)
  public static SubLSymbol $inference_the_term_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16589L)
  public static SubLSymbol $the_term_qua_constant$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16720L)
  public static SubLSymbol $external_inference_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16895L)
  public static SubLSymbol $suppress_conflict_noticesP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16984L)
  public static SubLSymbol $ignore_conflictsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17023L)
  public static SubLSymbol $ignore_non_definitional_conflictsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17217L)
  public static SubLSymbol $conflicts_from_invalid_deductions$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17342L)
  public static SubLSymbol $record_inconsistent_support_sets$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17519L)
  public static SubLSymbol $last_agenda_op$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17585L)
  public static SubLSymbol $last_agenda_error_message$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17630L)
  public static SubLSymbol $last_agenda_error_explanatory_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17861L)
  public static SubLSymbol $agenda_display_fi_warnings$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 17911L)
  public static SubLSymbol $ignore_remote_errors$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18036L)
  public static SubLSymbol $auto_increment_kb$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18553L)
  private static SubLSymbol $load_submitted_transcriptsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19119L)
  private static SubLSymbol $send_submitted_transcript_loading_noticesP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19817L)
  public static SubLSymbol $cyc_image_id$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19971L)
  private static SubLSymbol $use_tcp_port_in_image_id$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21069L)
  private static SubLSymbol $build_kb_loaded$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21588L)
  private static SubLSymbol $kb_loaded$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22541L)
  public static SubLSymbol $kb_pedigree$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22905L)
  public static SubLSymbol $use_transcriptP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22942L)
  public static SubLSymbol $run_own_operationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23106L)
  public static SubLSymbol $caught_up_on_master_transcript$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23753L)
  public static SubLSymbol $communication_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23797L)
  public static SubLSymbol $unencapsulating_within_agenda$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 25870L)
  public static SubLSymbol $save_asked_queriesP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26219L)
  public static SubLSymbol $init_file_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26308L)
  public static SubLSymbol $within_assert$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26363L)
  public static SubLSymbol $within_unassert$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26400L)
  public static SubLSymbol $within_ask$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26432L)
  public static SubLSymbol $within_query$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26722L)
  public static SubLSymbol $compute_inference_results$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26893L)
  public static SubLSymbol $cache_inference_results$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27238L)
  public static SubLSymbol $transformation_depth_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27288L)
  private static SubLSymbol $lexicon_initializedP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27691L)
  public static SubLSymbol $partial_semanticsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27746L)
  public static SubLSymbol $enforce_mass_vs_countP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27909L)
  public static SubLSymbol $partial_syntaxP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27998L)
  private static SubLSymbol $cb_presentation_languages$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28435L)
  public static SubLSymbol $cb_major_presentation_language$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 29101L)
  public static SubLSymbol $show_assertions_in_english$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 29268L)
  public static SubLSymbol $assume_cyc_cyclist_dialogP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 29450L)
  public static SubLSymbol $generated_phrases_browsableP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 29600L)
  public static SubLSymbol $highlight_demerits_in_generated_phrasesP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 29767L)
  public static SubLSymbol $cb_paraphrase_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 29893L)
  public static SubLSymbol $show_fet_edit_buttonsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 30084L)
  public static SubLSymbol $show_fet_create_instance_buttonsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 30225L)
  public static SubLSymbol $show_fet_create_spec_buttonsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 30360L)
  public static SubLSymbol $cb_literal_query_results_one_per_lineP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 30562L)
  public static SubLSymbol $cb_skolem_applicable_relationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 30766L)
  public static SubLSymbol $cb_applicable_relations_one_per_lineP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 30909L)
  public static SubLSymbol $cb_paraphrase_applicable_relationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 31039L)
  public static SubLSymbol $show_credits$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 31131L)
  public static SubLSymbol $browse_in_meta_query_modeP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 31260L)
  public static SubLSymbol $meta_query_start_string$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 31305L)
  public static SubLSymbol $current_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 31498L)
  public static SubLSymbol $rkf_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32089L)
  public static SubLSymbol $dbm_init_file_loadedP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32232L)
  public static SubLSymbol $dbm_cache_loading_startedP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32281L)
  public static SubLSymbol $dbm_cache_loading_finishedP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32330L)
  public static SubLSymbol $wordnet_initializedP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32418L)
  public static SubLSymbol $use_wn_linksP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32465L)
  public static SubLSymbol $acip_subkernel_extraction$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32614L)
  public static SubLSymbol $acip_subkernel_output_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32765L)
  public static SubLSymbol $janus_tag$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32903L)
  public static SubLSymbol $janus_new_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 32955L)
  public static SubLSymbol $janus_test_case_loggingP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33015L)
  public static SubLSymbol $janus_operations$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33064L)
  public static SubLSymbol $janus_extraction_deduce_specs$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33126L)
  public static SubLSymbol $janus_within_somethingP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33182L)
  public static SubLSymbol $janus_testing_deduce_specs$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33241L)
  public static SubLSymbol $janus_test_case_runningP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33298L)
  public static SubLSymbol $ask_quirkP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33360L)
  public static SubLSymbol $kbq_run_query_auto_destroy_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33559L)
  public static SubLSymbol $kbq_run_query_non_continuable_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 33765L)
  public static SubLSymbol $kbq_run_query_practice_modeP$;
  private static final SubLSymbol $sym0$_TABLE_AREA_;
  private static final SubLSymbol $sym1$_HL_LOCK_;
  private static final SubLString $str2$HL_Store_Lock;
  private static final SubLSymbol $sym3$WITH_LOCK_HELD;
  private static final SubLList $list4;
  private static final SubLString $str5$KEYWORD;
  private static final SubLString $str6$SUBLISP;
  private static final SubLString $str7$CYC;
  private static final SubLSymbol $sym8$SYMBOLP;
  private static final SubLString $str9$Symbol__S_from_package__S_is_not_;
  private static final SubLSymbol $kw10$TRUE;
  private static final SubLString $str11$_;
  private static final SubLSymbol $kw12$FORWARD;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$_HL_FAILURE_BACKCHAINING_;
  private static final SubLString $str15$Enable_HL_predicate_backchaining;
  private static final SubLString $str16$This_controls_whether_or_not_we_a;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$_NEGATION_BY_FAILURE_;
  private static final SubLString $str19$Enable_negation_by_failure;
  private static final SubLString $str20$This_controls_whether_or_not_we_a;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$_COMPLETE_EXTENT_MINIMIZATION_;
  private static final SubLString $str23$Enable_complete_extent_minimizati;
  private static final SubLString $str24$This_controls_whether_or_not_we_a;
  private static final SubLSymbol $sym25$_UNBOUND_RULE_BACKCHAIN_ENABLED_;
  private static final SubLString $str26$Enable_unbound_predicate_rule_bac;
  private static final SubLString $str27$This_controls_whether_or_not_we_a;
  private static final SubLInteger $int28$100000;
  private static final SubLSymbol $kw29$HEURISTIC;
  private static final SubLSymbol $sym30$INFERENCE_RETURN_BLISTS;
  private static final SubLFloat $float31$0_1;
  private static final SubLFloat $float32$0_5;
  private static final SubLFloat $float33$1_0;
  private static final SubLFloat $float34$1_5;
  private static final SubLInteger $int35$38;
  private static final SubLInteger $int36$47;
  private static final SubLSymbol $sym37$_AUTO_INCREMENT_KB_;
  private static final SubLSymbol $sym38$BOOLEANP;
  private static final SubLString $str39$UNKNOWN;
  private static final SubLString $str40$_;
  private static final SubLString $str41$;
  private static final SubLString $str42$_a__a_a__a;
  private static final SubLSymbol $sym43$_BUILD_KB_LOADED_;
  private static final SubLSymbol $sym44$INTEGERP;
  private static final SubLSymbol $sym45$_KB_LOADED_;
  private static final SubLInteger $int46$10000;
  private static final SubLSymbol $kw47$FULL;
  private static final SubLSymbol $kw48$TINY;
  private static final SubLSymbol $sym49$_KB_PEDIGREE_;
  private static final SubLSymbol $kw50$UNKNOWN;
  private static final SubLSymbol $sym51$_RUN_OWN_OPERATIONS__;
  private static final SubLSymbol $sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_;
  private static final SubLSymbol $sym53$_COMMUNICATION_MODE_;
  private static final SubLSymbol $sym54$_INIT_FILE_LOADED__;
  private static final SubLSymbol $sym55$_CACHE_INFERENCE_RESULTS_;
  private static final SubLString $str56$Cache_backward_query_results;
  private static final SubLString $str57$This_controls_whether_the_results;
  private static final SubLSymbol $sym58$_LEXICON_INITIALIZED__;
  private static final SubLList $list59;
  private static final SubLSymbol $kw60$CYCL;
  private static final SubLSymbol $sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_;
  private static final SubLSymbol $kw62$CYC_HALO;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$PWHEN;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$_ASSUME_CYC_CYCLIST_DIALOG__;
  private static final SubLSymbol $sym67$_GENERATED_PHRASES_BROWSABLE__;
  private static final SubLSymbol $sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__;
  private static final SubLSymbol $sym69$_CB_PARAPHRASE_MT_;
  private static final SubLSymbol $sym70$_SHOW_FET_EDIT_BUTTONS__;
  private static final SubLSymbol $sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__;
  private static final SubLSymbol $sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__;
  private static final SubLSymbol $sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__;
  private static final SubLSymbol $sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__;
  private static final SubLSymbol $sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__;
  private static final SubLSymbol $sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__;
  private static final SubLSymbol $sym77$_BROWSE_IN_META_QUERY_MODE__;
  private static final SubLSymbol $sym78$_WORDNET_INITIALIZED__;
  private static final SubLSymbol $sym79$_USE_WN_LINKS__;
  private static final SubLSymbol $sym80$_ACIP_SUBKERNEL_EXTRACTION_;
  private static final SubLSymbol $sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1113L)
  public static SubLObject within_hl_modification(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$WITH_LOCK_HELD, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1441L)
  public static SubLObject subl_symbol_package(final SubLObject symbol)
  {
    assert NIL != Types.symbolp( symbol ) : symbol;
    if( symbol.isKeyword() )
    {
      return $keyword_package$.getGlobalValue();
    }
    final SubLObject v_package = Symbols.symbol_package( symbol );
    if( NIL == v_package )
    {
      return NIL;
    }
    final SubLObject name = Symbols.symbol_name( symbol );
    if( symbol.eql( Packages.find_symbol( name, $sublisp_package$.getGlobalValue() ) ) )
    {
      return $sublisp_package$.getGlobalValue();
    }
    if( symbol.eql( Packages.find_symbol( name, $cyc_package$.getGlobalValue() ) ) )
    {
      return $cyc_package$.getGlobalValue();
    }
    return Errors.error( $str9$Symbol__S_from_package__S_is_not_, symbol, v_package );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4593L)
  public static SubLObject mapping_funcall_arg(final SubLObject arg, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $mapping_fn_arg$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject pcase_var = n;
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg1$.currentBinding( thread );
      try
      {
        $mapping_fn_arg1$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg1$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( TWO_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg2$.currentBinding( thread );
      try
      {
        $mapping_fn_arg2$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg2$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( THREE_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg3$.currentBinding( thread );
      try
      {
        $mapping_fn_arg3$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg3$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( FOUR_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg4$.currentBinding( thread );
      try
      {
        $mapping_fn_arg4$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg4$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( FIVE_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg5$.currentBinding( thread );
      try
      {
        $mapping_fn_arg5$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg5$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( SIX_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg6$.currentBinding( thread );
      try
      {
        $mapping_fn_arg6$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg6$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg7$.currentBinding( thread );
      try
      {
        $mapping_fn_arg7$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg7$.rebind( _prev_bind_0, thread );
      }
    }
    else if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      final SubLObject _prev_bind_0 = $mapping_fn_arg8$.currentBinding( thread );
      try
      {
        $mapping_fn_arg8$.bind( arg, thread );
        result = mapping_funcall_int();
      }
      finally
      {
        $mapping_fn_arg8$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 5349L)
  public static SubLObject mapping_funcall_int()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg2$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), $mapping_fn_arg1$.getDynamicValue( thread ) );
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg3$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ) );
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg4$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ), $mapping_fn_arg3$.getDynamicValue( thread ) );
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg5$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ), $mapping_fn_arg3$.getDynamicValue( thread ),
          $mapping_fn_arg4$.getDynamicValue( thread ) );
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg6$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ), $mapping_fn_arg3$.getDynamicValue( thread ),
          $mapping_fn_arg4$.getDynamicValue( thread ), $mapping_fn_arg5$.getDynamicValue( thread ) );
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg7$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ), $mapping_fn_arg3$.getDynamicValue( thread ),
          $mapping_fn_arg4$.getDynamicValue( thread ), $mapping_fn_arg5$.getDynamicValue( thread ), $mapping_fn_arg6$.getDynamicValue( thread ) );
    }
    if( NIL != utilities_macros.unprovided_argumentP( $mapping_fn_arg8$.getDynamicValue( thread ) ) )
    {
      return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), new SubLObject[] { $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ), $mapping_fn_arg3$.getDynamicValue(
          thread ), $mapping_fn_arg4$.getDynamicValue( thread ), $mapping_fn_arg5$.getDynamicValue( thread ), $mapping_fn_arg6$.getDynamicValue( thread ), $mapping_fn_arg7$.getDynamicValue( thread )
      } );
    }
    return Functions.funcall( $mapping_fn$.getDynamicValue( thread ), new SubLObject[] { $mapping_fn_arg1$.getDynamicValue( thread ), $mapping_fn_arg2$.getDynamicValue( thread ), $mapping_fn_arg3$.getDynamicValue(
        thread ), $mapping_fn_arg4$.getDynamicValue( thread ), $mapping_fn_arg5$.getDynamicValue( thread ), $mapping_fn_arg6$.getDynamicValue( thread ), $mapping_fn_arg7$.getDynamicValue( thread ), $mapping_fn_arg8$
            .getDynamicValue( thread )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8797L)
  public static SubLObject inference_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $inference_debugP$.getDynamicValue( thread ) )
    {
      return Errors.error( format_string, arg1, arg2 );
    }
    return Errors.warn( format_string, arg1, arg2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 9411L)
  public static SubLObject browse_forward_inferencesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $browse_forward_inferencesP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16633L)
  public static SubLObject the_term_qua_constantP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( v_term, $the_term_qua_constant$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18302L)
  public static SubLObject auto_increment_kb()
  {
    return $auto_increment_kb$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18406L)
  public static SubLObject set_auto_increment_kb(final SubLObject v_boolean)
  {
    assert NIL != Types.booleanp( v_boolean ) : v_boolean;
    $auto_increment_kb$.setGlobalValue( v_boolean );
    return $auto_increment_kb$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18724L)
  public static SubLObject load_submitted_transcriptsP()
  {
    return $load_submitted_transcriptsP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18941L)
  public static SubLObject set_load_submitted_transcripts(final SubLObject v_boolean)
  {
    assert NIL != Types.booleanp( v_boolean ) : v_boolean;
    $load_submitted_transcriptsP$.setGlobalValue( v_boolean );
    return $load_submitted_transcriptsP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19335L)
  public static SubLObject send_submitted_transcript_loading_noticesP()
  {
    return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19596L)
  public static SubLObject set_send_submitted_transcript_loading_notices(final SubLObject v_boolean)
  {
    assert NIL != Types.booleanp( v_boolean ) : v_boolean;
    $send_submitted_transcript_loading_noticesP$.setGlobalValue( v_boolean );
    return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 20022L)
  public static SubLObject make_cyc_image_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject machine_name = Strings.string_downcase( string_utilities.string_upto( Environment.get_machine_name( $str39$UNKNOWN ), Characters.CHAR_period ), UNPROVIDED, UNPROVIDED );
    final SubLObject base_port_string = ( NIL != $use_tcp_port_in_image_id$.getGlobalValue() && NIL != system_parameters.$base_tcp_port$.getDynamicValue( thread ) ) ? Sequences.cconcatenate( string_utilities.to_string(
        system_parameters.$base_tcp_port$.getDynamicValue( thread ) ), $str40$_ ) : $str41$;
    final SubLObject process_id = Environment.get_process_id( UNPROVIDED );
    final SubLObject uniquifier = process_id.isZero() ? random.random( Numbers.$most_positive_fixnum$.getGlobalValue() ) : process_id;
    final SubLObject cyc_universal_time = numeric_date_utilities.universal_timestring( UNPROVIDED );
    return PrintLow.format( NIL, $str42$_a__a_a__a, new SubLObject[] { machine_name, base_port_string, cyc_universal_time, uniquifier
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 20832L)
  public static SubLObject set_cyc_image_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cyc_image_id$.setDynamicValue( make_cyc_image_id(), thread );
    return $cyc_image_id$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 20980L)
  public static SubLObject cyc_image_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cyc_image_id$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21251L)
  public static SubLObject build_kb_loaded()
  {
    return $build_kb_loaded$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21394L)
  public static SubLObject set_build_kb_loaded(final SubLObject kb)
  {
    if( NIL != kb && !assertionsDisabledSynth && NIL == Types.integerp( kb ) )
    {
      throw new AssertionError( kb );
    }
    $build_kb_loaded$.setGlobalValue( kb );
    return set_kb_loaded( kb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21690L)
  public static SubLObject kb_loaded()
  {
    return $kb_loaded$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21870L)
  public static SubLObject set_kb_loaded(final SubLObject kb)
  {
    if( NIL != kb && !assertionsDisabledSynth && NIL == Types.integerp( kb ) )
    {
      throw new AssertionError( kb );
    }
    $kb_loaded$.setGlobalValue( kb );
    return kb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22106L)
  public static SubLObject core_kb_loadedP()
  {
    return list_utilities.sublisp_boolean( kb_loaded() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22279L)
  public static SubLObject non_tiny_kb_loadedP()
  {
    return Numbers.numG( constant_handles.constant_count(), $int46$10000 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22437L)
  public static SubLObject kb_tiny_or_full()
  {
    if( NIL != non_tiny_kb_loadedP() )
    {
      return $kw47$FULL;
    }
    return $kw48$TINY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22772L)
  public static SubLObject kb_pedigree()
  {
    return $kb_pedigree$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23397L)
  public static SubLObject caught_up_on_master_transcript()
  {
    return $caught_up_on_master_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23539L)
  public static SubLObject set_caught_up_on_master_transcript(final SubLObject v_boolean)
  {
    $caught_up_on_master_transcript$.setGlobalValue( v_boolean );
    return $caught_up_on_master_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26006L)
  public static SubLObject save_asked_queriesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $save_asked_queriesP$.getDynamicValue( thread ) && NIL != non_tiny_kb_loadedP() && NIL != subl_promotions.positive_integer_p( kb_loaded() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26466L)
  public static SubLObject within_askP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_ask$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26519L)
  public static SubLObject within_queryP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $within_ask$.getDynamicValue( thread ) || NIL != $within_query$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26600L)
  public static SubLObject within_assertP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_assert$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26659L)
  public static SubLObject within_unassertP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $within_unassert$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27288L)
  public static SubLObject note_lexicon_initialized()
  {
    $lexicon_initializedP$.setGlobalValue( T );
    return $lexicon_initializedP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27560L)
  public static SubLObject lexicon_initialized_p()
  {
    return list_utilities.sublisp_boolean( $lexicon_initializedP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28326L)
  public static SubLObject cb_presentation_language_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $cb_presentation_languages$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28583L)
  public static SubLObject cb_silk_presentation_languageP(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    if( NIL != subl_promotions.memberP( $kw62$CYC_HALO, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return $list63;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28973L)
  public static SubLObject pwhen_cb_silk_presentation_language(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym64$PWHEN, $list65, ConsesLow.append( body, NIL ) );
  }

  public static SubLObject declare_control_vars_file()
  {
    SubLFiles.declareMacro( me, "within_hl_modification", "WITHIN-HL-MODIFICATION" );
    SubLFiles.declareFunction( me, "subl_symbol_package", "SUBL-SYMBOL-PACKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "mapping_funcall_arg", "MAPPING-FUNCALL-ARG", 1, 1, false );
    SubLFiles.declareFunction( me, "mapping_funcall_int", "MAPPING-FUNCALL-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_warn", "INFERENCE-WARN", 1, 2, false );
    SubLFiles.declareFunction( me, "browse_forward_inferencesP", "BROWSE-FORWARD-INFERENCES?", 0, 0, false );
    SubLFiles.declareFunction( me, "the_term_qua_constantP", "THE-TERM-QUA-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "auto_increment_kb", "AUTO-INCREMENT-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "set_auto_increment_kb", "SET-AUTO-INCREMENT-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "load_submitted_transcriptsP", "LOAD-SUBMITTED-TRANSCRIPTS?", 0, 0, false );
    SubLFiles.declareFunction( me, "set_load_submitted_transcripts", "SET-LOAD-SUBMITTED-TRANSCRIPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "send_submitted_transcript_loading_noticesP", "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?", 0, 0, false );
    SubLFiles.declareFunction( me, "set_send_submitted_transcript_loading_notices", "SET-SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES", 1, 0, false );
    SubLFiles.declareFunction( me, "make_cyc_image_id", "MAKE-CYC-IMAGE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cyc_image_id", "SET-CYC-IMAGE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_image_id", "CYC-IMAGE-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "build_kb_loaded", "BUILD-KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "set_build_kb_loaded", "SET-BUILD-KB-LOADED", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_loaded", "KB-LOADED", 0, 0, false );
    SubLFiles.declareFunction( me, "set_kb_loaded", "SET-KB-LOADED", 1, 0, false );
    SubLFiles.declareFunction( me, "core_kb_loadedP", "CORE-KB-LOADED?", 0, 0, false );
    SubLFiles.declareFunction( me, "non_tiny_kb_loadedP", "NON-TINY-KB-LOADED?", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_tiny_or_full", "KB-TINY-OR-FULL", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_pedigree", "KB-PEDIGREE", 0, 0, false );
    SubLFiles.declareFunction( me, "caught_up_on_master_transcript", "CAUGHT-UP-ON-MASTER-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_caught_up_on_master_transcript", "SET-CAUGHT-UP-ON-MASTER-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "save_asked_queriesP", "SAVE-ASKED-QUERIES?", 0, 0, false );
    SubLFiles.declareFunction( me, "within_askP", "WITHIN-ASK?", 0, 0, false );
    SubLFiles.declareFunction( me, "within_queryP", "WITHIN-QUERY?", 0, 0, false );
    SubLFiles.declareFunction( me, "within_assertP", "WITHIN-ASSERT?", 0, 0, false );
    SubLFiles.declareFunction( me, "within_unassertP", "WITHIN-UNASSERT?", 0, 0, false );
    SubLFiles.declareFunction( me, "note_lexicon_initialized", "NOTE-LEXICON-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "lexicon_initialized_p", "LEXICON-INITIALIZED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_presentation_language_p", "CB-PRESENTATION-LANGUAGE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "cb_silk_presentation_languageP", "CB-SILK-PRESENTATION-LANGUAGE?" );
    SubLFiles.declareMacro( me, "pwhen_cb_silk_presentation_language", "PWHEN-CB-SILK-PRESENTATION-LANGUAGE" );
    return NIL;
  }

  public static SubLObject init_control_vars_file()
  {
    $read_require_constant_exists$ = SubLFiles.defparameter( "*READ-REQUIRE-CONSTANT-EXISTS*", T );
    $table_area$ = SubLFiles.deflexical( "*TABLE-AREA*", ( maybeDefault( $sym0$_TABLE_AREA_, $table_area$, NIL ) ) );
    $hl_lock$ = SubLFiles.deflexical( "*HL-LOCK*", maybeDefault( $sym1$_HL_LOCK_, $hl_lock$, () -> ( Locks.make_lock( $str2$HL_Store_Lock ) ) ) );
    $bootstrapping_kbP$ = SubLFiles.defparameter( "*BOOTSTRAPPING-KB?*", NIL );
    $keyword_package$ = SubLFiles.deflexical( "*KEYWORD-PACKAGE*", Packages.find_package( $str5$KEYWORD ) );
    $sublisp_package$ = SubLFiles.deflexical( "*SUBLISP-PACKAGE*", Packages.find_package( $str6$SUBLISP ) );
    $cyc_package$ = SubLFiles.deflexical( "*CYC-PACKAGE*", Packages.find_package( $str7$CYC ) );
    $cnf_matching_predicate$ = SubLFiles.defparameter( "*CNF-MATCHING-PREDICATE*", EQUAL );
    $gaf_matching_predicate$ = SubLFiles.defparameter( "*GAF-MATCHING-PREDICATE*", EQUAL );
    $nat_matching_predicate$ = SubLFiles.defparameter( "*NAT-MATCHING-PREDICATE*", EQUAL );
    $candidate_assertion$ = SubLFiles.defparameter( "*CANDIDATE-ASSERTION*", NIL );
    $variable_names$ = SubLFiles.defparameter( "*VARIABLE-NAMES*", NIL );
    $assertion_truth$ = SubLFiles.defparameter( "*ASSERTION-TRUTH*", $kw10$TRUE );
    $mapping_answer$ = SubLFiles.defparameter( "*MAPPING-ANSWER*", NIL );
    $mapping_pred$ = SubLFiles.defparameter( "*MAPPING-PRED*", NIL );
    $mapping_source$ = SubLFiles.defparameter( "*MAPPING-SOURCE*", NIL );
    $mapping_target$ = SubLFiles.defparameter( "*MAPPING-TARGET*", NIL );
    $mapping_target_arg$ = SubLFiles.defparameter( "*MAPPING-TARGET-ARG*", NIL );
    $mapping_index_arg$ = SubLFiles.defparameter( "*MAPPING-INDEX-ARG*", NIL );
    $mapping_gather_arg$ = SubLFiles.defparameter( "*MAPPING-GATHER-ARG*", NIL );
    $mapping_gather_args$ = SubLFiles.defparameter( "*MAPPING-GATHER-ARGS*", NIL );
    $mapping_output_stream$ = SubLFiles.defparameter( "*MAPPING-OUTPUT-STREAM*", T );
    $mapping_equality_test$ = SubLFiles.defparameter( "*MAPPING-EQUALITY-TEST*", Symbols.symbol_function( EQUAL ) );
    $mapping_any_answerP$ = SubLFiles.defparameter( "*MAPPING-ANY-ANSWER?*", NIL );
    $mapping_relation$ = SubLFiles.defparameter( "*MAPPING-RELATION*", NIL );
    $mapping_finished_fn$ = SubLFiles.defparameter( "*MAPPING-FINISHED-FN*", NIL );
    $mapping_path$ = SubLFiles.defparameter( "*MAPPING-PATH*", NIL );
    $mapping_data_1$ = SubLFiles.defparameter( "*MAPPING-DATA-1*", NIL );
    $mapping_data_2$ = SubLFiles.defparameter( "*MAPPING-DATA-2*", NIL );
    $mapping_pivot_arg$ = SubLFiles.defparameter( "*MAPPING-PIVOT-ARG*", NIL );
    $mapping_gather_key$ = SubLFiles.defparameter( "*MAPPING-GATHER-KEY*", Symbols.symbol_function( IDENTITY ) );
    $mapping_gather_key_args$ = SubLFiles.defparameter( "*MAPPING-GATHER-KEY-ARGS*", NIL );
    $mapping_assertion_selection_fn$ = SubLFiles.defparameter( "*MAPPING-ASSERTION-SELECTION-FN*", NIL );
    $mapping_assertion_bookkeeping_fn$ = SubLFiles.defparameter( "*MAPPING-ASSERTION-BOOKKEEPING-FN*", NIL );
    $mapping_fn$ = SubLFiles.defparameter( "*MAPPING-FN*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg$ = SubLFiles.defparameter( "*MAPPING-FN-ARG*", ONE_INTEGER );
    $mapping_fn_arg1$ = SubLFiles.defparameter( "*MAPPING-FN-ARG1*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg2$ = SubLFiles.defparameter( "*MAPPING-FN-ARG2*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg3$ = SubLFiles.defparameter( "*MAPPING-FN-ARG3*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg4$ = SubLFiles.defparameter( "*MAPPING-FN-ARG4*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg5$ = SubLFiles.defparameter( "*MAPPING-FN-ARG5*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg6$ = SubLFiles.defparameter( "*MAPPING-FN-ARG6*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg7$ = SubLFiles.defparameter( "*MAPPING-FN-ARG7*", utilities_macros.$unprovided$.getGlobalValue() );
    $mapping_fn_arg8$ = SubLFiles.defparameter( "*MAPPING-FN-ARG8*", utilities_macros.$unprovided$.getGlobalValue() );
    $kba_pred$ = SubLFiles.defparameter( "*KBA-PRED*", NIL );
    $standard_indent_string$ = SubLFiles.defparameter( "*STANDARD-INDENT-STRING*", $str11$_ );
    $term_functional_complexity_cutoff$ = SubLFiles.defparameter( "*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", NIL );
    $term_relational_complexity_cutoff$ = SubLFiles.defparameter( "*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", NIL );
    $collect_justification_compilationsP$ = SubLFiles.defparameter( "*COLLECT-JUSTIFICATION-COMPILATIONS?*", NIL );
    $justification_compilations$ = SubLFiles.defparameter( "*JUSTIFICATION-COMPILATIONS*", NIL );
    $ebl_trace$ = SubLFiles.defparameter( "*EBL-TRACE*", ZERO_INTEGER );
    $allow_forward_skolemization$ = SubLFiles.defparameter( "*ALLOW-FORWARD-SKOLEMIZATION*", NIL );
    $prefer_forward_skolemization$ = SubLFiles.defparameter( "*PREFER-FORWARD-SKOLEMIZATION*", NIL );
    $perform_unification_occurs_check$ = SubLFiles.defparameter( "*PERFORM-UNIFICATION-OCCURS-CHECK*", T );
    $perform_equals_unification$ = SubLFiles.defparameter( "*PERFORM-EQUALS-UNIFICATION*", T );
    $allow_backward_gafs$ = SubLFiles.defparameter( "*ALLOW-BACKWARD-GAFS*", T );
    $cached_ask_result_direction$ = SubLFiles.defparameter( "*CACHED-ASK-RESULT-DIRECTION*", $kw12$FORWARD );
    $check_for_circular_justs$ = SubLFiles.defparameter( "*CHECK-FOR-CIRCULAR-JUSTS*", T );
    $filter_deductions_for_trivially_derivable_gafs$ = SubLFiles.defparameter( "*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", NIL );
    $inference_debugP$ = SubLFiles.defparameter( "*INFERENCE-DEBUG?*", NIL );
    $inference_trace_level$ = SubLFiles.defparameter( "*INFERENCE-TRACE-LEVEL*", ZERO_INTEGER );
    $browse_forward_inferencesP$ = SubLFiles.defvar( "*BROWSE-FORWARD-INFERENCES?*", NIL );
    $query_properties_inherited_by_recursive_queries$ = SubLFiles.defparameter( "*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list13 );
    $proof_checking_enabled$ = SubLFiles.defparameter( "*PROOF-CHECKING-ENABLED*", NIL );
    $proof_checker_rules$ = SubLFiles.defparameter( "*PROOF-CHECKER-RULES*", NIL );
    $inference_propagate_mt_scope$ = SubLFiles.defparameter( "*INFERENCE-PROPAGATE-MT-SCOPE*", NIL );
    $inference_current_node_mt_scope$ = SubLFiles.defparameter( "*INFERENCE-CURRENT-NODE-MT-SCOPE*", NIL );
    $inference_literal$ = SubLFiles.defparameter( "*INFERENCE-LITERAL*", NIL );
    $inference_sense$ = SubLFiles.defparameter( "*INFERENCE-SENSE*", NIL );
    $inference_arg$ = SubLFiles.defparameter( "*INFERENCE-ARG*", NIL );
    $inference_more_supports$ = SubLFiles.defparameter( "*INFERENCE-MORE-SUPPORTS*", NIL );
    $inference_highly_relevant_assertions$ = SubLFiles.defparameter( "*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", NIL );
    $inference_highly_relevant_mts$ = SubLFiles.defparameter( "*INFERENCE-HIGHLY-RELEVANT-MTS*", NIL );
    $within_hl_failure_backchainingP$ = SubLFiles.defparameter( "*WITHIN-HL-FAILURE-BACKCHAINING?*", NIL );
    $hl_failure_backchaining$ = SubLFiles.defparameter( "*HL-FAILURE-BACKCHAINING*", NIL );
    $evaluatable_backchain_enabled$ = SubLFiles.defparameter( "*EVALUATABLE-BACKCHAIN-ENABLED*", NIL );
    $negation_by_failure$ = SubLFiles.defparameter( "*NEGATION-BY-FAILURE*", NIL );
    $complete_extent_minimization$ = SubLFiles.defparameter( "*COMPLETE-EXTENT-MINIMIZATION*", T );
    $unbound_rule_backchain_enabled$ = SubLFiles.defparameter( "*UNBOUND-RULE-BACKCHAIN-ENABLED*", NIL );
    $default_removal_cost_cutoff$ = SubLFiles.deflexical( "*DEFAULT-REMOVAL-COST-CUTOFF*", $int28$100000 );
    $removal_cost_cutoff$ = SubLFiles.defparameter( "*REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue() );
    $forward_inference_removal_cost_cutoff$ = SubLFiles.defparameter( "*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue() );
    $application_filtering_enabled$ = SubLFiles.defparameter( "*APPLICATION-FILTERING-ENABLED*", NIL );
    $marking_doomed_inference_ancestors$ = SubLFiles.defparameter( "*MARKING-DOOMED-INFERENCE-ANCESTORS*", NIL );
    $inference_search_strategy$ = SubLFiles.defparameter( "*INFERENCE-SEARCH-STRATEGY*", $kw29$HEURISTIC );
    $unique_inference_result_bindings$ = SubLFiles.defparameter( "*UNIQUE-INFERENCE-RESULT-BINDINGS*", T );
    $inference_answer_handler$ = SubLFiles.defparameter( "*INFERENCE-ANSWER-HANDLER*", $sym30$INFERENCE_RETURN_BLISTS );
    $hl_module_simplification_cost$ = SubLFiles.defparameter( "*HL-MODULE-SIMPLIFICATION-COST*", $float31$0_1 );
    $hl_module_check_cost$ = SubLFiles.defparameter( "*HL-MODULE-CHECK-COST*", $float32$0_5 );
    $cheap_hl_module_check_cost$ = SubLFiles.deflexical( "*CHEAP-HL-MODULE-CHECK-COST*", $float32$0_5 );
    $typical_hl_module_check_cost$ = SubLFiles.deflexical( "*TYPICAL-HL-MODULE-CHECK-COST*", $float33$1_0 );
    $expensive_hl_module_check_cost$ = SubLFiles.deflexical( "*EXPENSIVE-HL-MODULE-CHECK-COST*", $float34$1_5 );
    $expensive_hl_module_singleton_generate_cost$ = SubLFiles.deflexical( "*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", $expensive_hl_module_check_cost$.getGlobalValue() );
    $maximum_hl_module_check_cost$ = SubLFiles.defparameter( "*MAXIMUM-HL-MODULE-CHECK-COST*", NIL );
    $average_all_isa_count$ = SubLFiles.defparameter( "*AVERAGE-ALL-ISA-COUNT*", $int35$38 );
    $average_all_genls_count$ = SubLFiles.defparameter( "*AVERAGE-ALL-GENLS-COUNT*", $int36$47 );
    $pgia_activeP$ = SubLFiles.defparameter( "*PGIA-ACTIVE?*", NIL );
    $the_term_inference_enabled$ = SubLFiles.defparameter( "*THE-TERM-INFERENCE-ENABLED*", NIL );
    $allow_the_term_unification$ = SubLFiles.defparameter( "*ALLOW-THE-TERM-UNIFICATION*", NIL );
    $inference_the_term_bindings$ = SubLFiles.defparameter( "*INFERENCE-THE-TERM-BINDINGS*", NIL );
    $the_term_qua_constant$ = SubLFiles.defparameter( "*THE-TERM-QUA-CONSTANT*", NIL );
    $external_inference_enabled$ = SubLFiles.defparameter( "*EXTERNAL-INFERENCE-ENABLED*", NIL );
    $suppress_conflict_noticesP$ = SubLFiles.defparameter( "*SUPPRESS-CONFLICT-NOTICES?*", NIL );
    $ignore_conflictsP$ = SubLFiles.defparameter( "*IGNORE-CONFLICTS?*", NIL );
    $ignore_non_definitional_conflictsP$ = SubLFiles.defparameter( "*IGNORE-NON-DEFINITIONAL-CONFLICTS?*", NIL );
    $conflicts_from_invalid_deductions$ = SubLFiles.defparameter( "*CONFLICTS-FROM-INVALID-DEDUCTIONS*", NIL );
    $record_inconsistent_support_sets$ = SubLFiles.defparameter( "*RECORD-INCONSISTENT-SUPPORT-SETS*", NIL );
    $last_agenda_op$ = SubLFiles.deflexical( "*LAST-AGENDA-OP*", NIL );
    $last_agenda_error_message$ = SubLFiles.deflexical( "*LAST-AGENDA-ERROR-MESSAGE*", NIL );
    $last_agenda_error_explanatory_supports$ = SubLFiles.deflexical( "*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", NIL );
    $agenda_display_fi_warnings$ = SubLFiles.defparameter( "*AGENDA-DISPLAY-FI-WARNINGS*", NIL );
    $ignore_remote_errors$ = SubLFiles.defparameter( "*IGNORE-REMOTE-ERRORS*", T );
    $auto_increment_kb$ = SubLFiles.deflexical( "*AUTO-INCREMENT-KB*", ( maybeDefault( $sym37$_AUTO_INCREMENT_KB_, $auto_increment_kb$, NIL ) ) );
    $load_submitted_transcriptsP$ = SubLFiles.deflexical( "*LOAD-SUBMITTED-TRANSCRIPTS?*", NIL );
    $send_submitted_transcript_loading_noticesP$ = SubLFiles.deflexical( "*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", NIL );
    $cyc_image_id$ = SubLFiles.defvar( "*CYC-IMAGE-ID*", NIL );
    $use_tcp_port_in_image_id$ = SubLFiles.deflexical( "*USE-TCP-PORT-IN-IMAGE-ID*", T );
    $build_kb_loaded$ = SubLFiles.deflexical( "*BUILD-KB-LOADED*", ( maybeDefault( $sym43$_BUILD_KB_LOADED_, $build_kb_loaded$, NIL ) ) );
    $kb_loaded$ = SubLFiles.deflexical( "*KB-LOADED*", ( maybeDefault( $sym45$_KB_LOADED_, $kb_loaded$, NIL ) ) );
    $kb_pedigree$ = SubLFiles.deflexical( "*KB-PEDIGREE*", ( maybeDefault( $sym49$_KB_PEDIGREE_, $kb_pedigree$, $kw50$UNKNOWN ) ) );
    $use_transcriptP$ = SubLFiles.defparameter( "*USE-TRANSCRIPT?*", T );
    $run_own_operationsP$ = SubLFiles.deflexical( "*RUN-OWN-OPERATIONS?*", ( maybeDefault( $sym51$_RUN_OWN_OPERATIONS__, $run_own_operationsP$, T ) ) );
    $caught_up_on_master_transcript$ = SubLFiles.deflexical( "*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", ( maybeDefault( $sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_, $caught_up_on_master_transcript$, NIL ) ) );
    $communication_mode$ = SubLFiles.deflexical( "*COMMUNICATION-MODE*", ( maybeDefault( $sym53$_COMMUNICATION_MODE_, $communication_mode$, $kw50$UNKNOWN ) ) );
    $unencapsulating_within_agenda$ = SubLFiles.defparameter( "*UNENCAPSULATING-WITHIN-AGENDA*", NIL );
    $save_asked_queriesP$ = SubLFiles.defvar( "*SAVE-ASKED-QUERIES?*", NIL );
    $init_file_loadedP$ = SubLFiles.deflexical( "*INIT-FILE-LOADED?*", ( maybeDefault( $sym54$_INIT_FILE_LOADED__, $init_file_loadedP$, NIL ) ) );
    $within_assert$ = SubLFiles.defparameter( "*WITHIN-ASSERT*", NIL );
    $within_unassert$ = SubLFiles.defparameter( "*WITHIN-UNASSERT*", NIL );
    $within_ask$ = SubLFiles.defparameter( "*WITHIN-ASK*", NIL );
    $within_query$ = SubLFiles.defparameter( "*WITHIN-QUERY*", NIL );
    $compute_inference_results$ = SubLFiles.defparameter( "*COMPUTE-INFERENCE-RESULTS*", T );
    $cache_inference_results$ = SubLFiles.defparameter( "*CACHE-INFERENCE-RESULTS*", NIL );
    $transformation_depth_cutoff$ = SubLFiles.defparameter( "*TRANSFORMATION-DEPTH-CUTOFF*", NIL );
    $lexicon_initializedP$ = SubLFiles.deflexical( "*LEXICON-INITIALIZED?*", ( maybeDefault( $sym58$_LEXICON_INITIALIZED__, $lexicon_initializedP$, NIL ) ) );
    $partial_semanticsP$ = SubLFiles.defparameter( "*PARTIAL-SEMANTICS?*", NIL );
    $enforce_mass_vs_countP$ = SubLFiles.defparameter( "*ENFORCE-MASS-VS-COUNT?*", T );
    $partial_syntaxP$ = SubLFiles.defparameter( "*PARTIAL-SYNTAX?*", NIL );
    $cb_presentation_languages$ = SubLFiles.deflexical( "*CB-PRESENTATION-LANGUAGES*", $list59 );
    $cb_major_presentation_language$ = SubLFiles.defparameter( "*CB-MAJOR-PRESENTATION-LANGUAGE*", $kw60$CYCL );
    $show_assertions_in_english$ = SubLFiles.defparameter( "*SHOW-ASSERTIONS-IN-ENGLISH*", NIL );
    $assume_cyc_cyclist_dialogP$ = SubLFiles.defparameter( "*ASSUME-CYC-CYCLIST-DIALOG?*", T );
    $generated_phrases_browsableP$ = SubLFiles.defparameter( "*GENERATED-PHRASES-BROWSABLE?*", T );
    $highlight_demerits_in_generated_phrasesP$ = SubLFiles.defparameter( "*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*", T );
    $cb_paraphrase_mt$ = SubLFiles.defparameter( "*CB-PARAPHRASE-MT*", NIL );
    $show_fet_edit_buttonsP$ = SubLFiles.defparameter( "*SHOW-FET-EDIT-BUTTONS?*", T );
    $show_fet_create_instance_buttonsP$ = SubLFiles.defparameter( "*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", T );
    $show_fet_create_spec_buttonsP$ = SubLFiles.defparameter( "*SHOW-FET-CREATE-SPEC-BUTTONS?*", NIL );
    $cb_literal_query_results_one_per_lineP$ = SubLFiles.defparameter( "*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", NIL );
    $cb_skolem_applicable_relationsP$ = SubLFiles.defparameter( "*CB-SKOLEM-APPLICABLE-RELATIONS?*", NIL );
    $cb_applicable_relations_one_per_lineP$ = SubLFiles.defparameter( "*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", NIL );
    $cb_paraphrase_applicable_relationsP$ = SubLFiles.defparameter( "*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", NIL );
    $show_credits$ = SubLFiles.defparameter( "*SHOW-CREDITS*", NIL );
    $browse_in_meta_query_modeP$ = SubLFiles.defparameter( "*BROWSE-IN-META-QUERY-MODE?*", NIL );
    $meta_query_start_string$ = SubLFiles.defparameter( "*META-QUERY-START-STRING*", NIL );
    $current_cache$ = SubLFiles.defparameter( "*CURRENT-CACHE*", NIL );
    $rkf_mt$ = SubLFiles.defvar( "*RKF-MT*", NIL );
    $dbm_init_file_loadedP$ = SubLFiles.defparameter( "*DBM-INIT-FILE-LOADED?*", NIL );
    $dbm_cache_loading_startedP$ = SubLFiles.defparameter( "*DBM-CACHE-LOADING-STARTED?*", NIL );
    $dbm_cache_loading_finishedP$ = SubLFiles.defparameter( "*DBM-CACHE-LOADING-FINISHED?*", NIL );
    $wordnet_initializedP$ = SubLFiles.deflexical( "*WORDNET-INITIALIZED?*", ( maybeDefault( $sym78$_WORDNET_INITIALIZED__, $wordnet_initializedP$, NIL ) ) );
    $use_wn_linksP$ = SubLFiles.deflexical( "*USE-WN-LINKS?*", ( maybeDefault( $sym79$_USE_WN_LINKS__, $use_wn_linksP$, NIL ) ) );
    $acip_subkernel_extraction$ = SubLFiles.deflexical( "*ACIP-SUBKERNEL-EXTRACTION*", ( maybeDefault( $sym80$_ACIP_SUBKERNEL_EXTRACTION_, $acip_subkernel_extraction$, NIL ) ) );
    $acip_subkernel_output_stream$ = SubLFiles.deflexical( "*ACIP-SUBKERNEL-OUTPUT-STREAM*", ( maybeDefault( $sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_, $acip_subkernel_output_stream$, NIL ) ) );
    $janus_tag$ = SubLFiles.defparameter( "*JANUS-TAG*", NIL );
    $janus_new_constants$ = SubLFiles.defparameter( "*JANUS-NEW-CONSTANTS*", NIL );
    $janus_test_case_loggingP$ = SubLFiles.defparameter( "*JANUS-TEST-CASE-LOGGING?*", NIL );
    $janus_operations$ = SubLFiles.defparameter( "*JANUS-OPERATIONS*", NIL );
    $janus_extraction_deduce_specs$ = SubLFiles.defparameter( "*JANUS-EXTRACTION-DEDUCE-SPECS*", NIL );
    $janus_within_somethingP$ = SubLFiles.defparameter( "*JANUS-WITHIN-SOMETHING?*", NIL );
    $janus_testing_deduce_specs$ = SubLFiles.defparameter( "*JANUS-TESTING-DEDUCE-SPECS*", NIL );
    $janus_test_case_runningP$ = SubLFiles.defparameter( "*JANUS-TEST-CASE-RUNNING?*", NIL );
    $ask_quirkP$ = SubLFiles.defvar( "*ASK-QUIRK?*", NIL );
    $kbq_run_query_auto_destroy_enabledP$ = SubLFiles.defparameter( "*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", T );
    $kbq_run_query_non_continuable_enabledP$ = SubLFiles.defparameter( "*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", T );
    $kbq_run_query_practice_modeP$ = SubLFiles.defvar( "*KBQ-RUN-QUERY-PRACTICE-MODE?*", NIL );
    return NIL;
  }

  public static SubLObject setup_control_vars_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_TABLE_AREA_ );
    subl_macro_promotions.declare_defglobal( $sym1$_HL_LOCK_ );
    utilities_macros.register_global_lock( $sym1$_HL_LOCK_, $str2$HL_Store_Lock );
    utilities_macros.declare_control_parameter_internal( $sym14$_HL_FAILURE_BACKCHAINING_, $str15$Enable_HL_predicate_backchaining, $str16$This_controls_whether_or_not_we_a, $list17 );
    utilities_macros.declare_control_parameter_internal( $sym18$_NEGATION_BY_FAILURE_, $str19$Enable_negation_by_failure, $str20$This_controls_whether_or_not_we_a, $list21 );
    utilities_macros.declare_control_parameter_internal( $sym22$_COMPLETE_EXTENT_MINIMIZATION_, $str23$Enable_complete_extent_minimizati, $str24$This_controls_whether_or_not_we_a, $list21 );
    utilities_macros.declare_control_parameter_internal( $sym25$_UNBOUND_RULE_BACKCHAIN_ENABLED_, $str26$Enable_unbound_predicate_rule_bac, $str27$This_controls_whether_or_not_we_a, $list17 );
    subl_macro_promotions.declare_defglobal( $sym37$_AUTO_INCREMENT_KB_ );
    subl_macro_promotions.declare_defglobal( $sym43$_BUILD_KB_LOADED_ );
    subl_macro_promotions.declare_defglobal( $sym45$_KB_LOADED_ );
    subl_macro_promotions.declare_defglobal( $sym49$_KB_PEDIGREE_ );
    subl_macro_promotions.declare_defglobal( $sym51$_RUN_OWN_OPERATIONS__ );
    subl_macro_promotions.declare_defglobal( $sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_ );
    subl_macro_promotions.declare_defglobal( $sym53$_COMMUNICATION_MODE_ );
    subl_macro_promotions.declare_defglobal( $sym54$_INIT_FILE_LOADED__ );
    utilities_macros.declare_control_parameter_internal( $sym55$_CACHE_INFERENCE_RESULTS_, $str56$Cache_backward_query_results, $str57$This_controls_whether_the_results, $list21 );
    subl_macro_promotions.declare_defglobal( $sym58$_LEXICON_INITIALIZED__ );
    utilities_macros.register_html_state_variable( $sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_ );
    utilities_macros.register_html_interface_variable( $sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_ );
    utilities_macros.register_html_state_variable( $sym66$_ASSUME_CYC_CYCLIST_DIALOG__ );
    utilities_macros.register_html_interface_variable( $sym66$_ASSUME_CYC_CYCLIST_DIALOG__ );
    utilities_macros.register_html_state_variable( $sym67$_GENERATED_PHRASES_BROWSABLE__ );
    utilities_macros.register_html_interface_variable( $sym67$_GENERATED_PHRASES_BROWSABLE__ );
    utilities_macros.register_html_state_variable( $sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ );
    utilities_macros.register_html_interface_variable( $sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ );
    utilities_macros.register_html_state_variable( $sym69$_CB_PARAPHRASE_MT_ );
    utilities_macros.register_html_interface_variable( $sym69$_CB_PARAPHRASE_MT_ );
    utilities_macros.register_html_state_variable( $sym70$_SHOW_FET_EDIT_BUTTONS__ );
    utilities_macros.register_html_interface_variable( $sym70$_SHOW_FET_EDIT_BUTTONS__ );
    utilities_macros.register_html_state_variable( $sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ );
    utilities_macros.register_html_interface_variable( $sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ );
    utilities_macros.register_html_state_variable( $sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__ );
    utilities_macros.register_html_interface_variable( $sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__ );
    utilities_macros.register_html_state_variable( $sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ );
    utilities_macros.register_html_interface_variable( $sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ );
    utilities_macros.register_html_state_variable( $sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__ );
    utilities_macros.register_html_interface_variable( $sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__ );
    utilities_macros.register_html_state_variable( $sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ );
    utilities_macros.register_html_interface_variable( $sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ );
    utilities_macros.register_html_state_variable( $sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ );
    utilities_macros.register_html_interface_variable( $sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ );
    utilities_macros.register_html_state_variable( $sym77$_BROWSE_IN_META_QUERY_MODE__ );
    subl_macro_promotions.declare_defglobal( $sym78$_WORDNET_INITIALIZED__ );
    subl_macro_promotions.declare_defglobal( $sym79$_USE_WN_LINKS__ );
    subl_macro_promotions.declare_defglobal( $sym80$_ACIP_SUBKERNEL_EXTRACTION_ );
    subl_macro_promotions.declare_defglobal( $sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_control_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_control_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_control_vars_file();
  }
  static
  {
    me = new control_vars();
    $read_require_constant_exists$ = null;
    $table_area$ = null;
    $hl_lock$ = null;
    $bootstrapping_kbP$ = null;
    $keyword_package$ = null;
    $sublisp_package$ = null;
    $cyc_package$ = null;
    $cnf_matching_predicate$ = null;
    $gaf_matching_predicate$ = null;
    $nat_matching_predicate$ = null;
    $candidate_assertion$ = null;
    $variable_names$ = null;
    $assertion_truth$ = null;
    $mapping_answer$ = null;
    $mapping_pred$ = null;
    $mapping_source$ = null;
    $mapping_target$ = null;
    $mapping_target_arg$ = null;
    $mapping_index_arg$ = null;
    $mapping_gather_arg$ = null;
    $mapping_gather_args$ = null;
    $mapping_output_stream$ = null;
    $mapping_equality_test$ = null;
    $mapping_any_answerP$ = null;
    $mapping_relation$ = null;
    $mapping_finished_fn$ = null;
    $mapping_path$ = null;
    $mapping_data_1$ = null;
    $mapping_data_2$ = null;
    $mapping_pivot_arg$ = null;
    $mapping_gather_key$ = null;
    $mapping_gather_key_args$ = null;
    $mapping_assertion_selection_fn$ = null;
    $mapping_assertion_bookkeeping_fn$ = null;
    $mapping_fn$ = null;
    $mapping_fn_arg$ = null;
    $mapping_fn_arg1$ = null;
    $mapping_fn_arg2$ = null;
    $mapping_fn_arg3$ = null;
    $mapping_fn_arg4$ = null;
    $mapping_fn_arg5$ = null;
    $mapping_fn_arg6$ = null;
    $mapping_fn_arg7$ = null;
    $mapping_fn_arg8$ = null;
    $kba_pred$ = null;
    $standard_indent_string$ = null;
    $term_functional_complexity_cutoff$ = null;
    $term_relational_complexity_cutoff$ = null;
    $collect_justification_compilationsP$ = null;
    $justification_compilations$ = null;
    $ebl_trace$ = null;
    $allow_forward_skolemization$ = null;
    $prefer_forward_skolemization$ = null;
    $perform_unification_occurs_check$ = null;
    $perform_equals_unification$ = null;
    $allow_backward_gafs$ = null;
    $cached_ask_result_direction$ = null;
    $check_for_circular_justs$ = null;
    $filter_deductions_for_trivially_derivable_gafs$ = null;
    $inference_debugP$ = null;
    $inference_trace_level$ = null;
    $browse_forward_inferencesP$ = null;
    $query_properties_inherited_by_recursive_queries$ = null;
    $proof_checking_enabled$ = null;
    $proof_checker_rules$ = null;
    $inference_propagate_mt_scope$ = null;
    $inference_current_node_mt_scope$ = null;
    $inference_literal$ = null;
    $inference_sense$ = null;
    $inference_arg$ = null;
    $inference_more_supports$ = null;
    $inference_highly_relevant_assertions$ = null;
    $inference_highly_relevant_mts$ = null;
    $within_hl_failure_backchainingP$ = null;
    $hl_failure_backchaining$ = null;
    $evaluatable_backchain_enabled$ = null;
    $negation_by_failure$ = null;
    $complete_extent_minimization$ = null;
    $unbound_rule_backchain_enabled$ = null;
    $default_removal_cost_cutoff$ = null;
    $removal_cost_cutoff$ = null;
    $forward_inference_removal_cost_cutoff$ = null;
    $application_filtering_enabled$ = null;
    $marking_doomed_inference_ancestors$ = null;
    $inference_search_strategy$ = null;
    $unique_inference_result_bindings$ = null;
    $inference_answer_handler$ = null;
    $hl_module_simplification_cost$ = null;
    $hl_module_check_cost$ = null;
    $cheap_hl_module_check_cost$ = null;
    $typical_hl_module_check_cost$ = null;
    $expensive_hl_module_check_cost$ = null;
    $expensive_hl_module_singleton_generate_cost$ = null;
    $maximum_hl_module_check_cost$ = null;
    $average_all_isa_count$ = null;
    $average_all_genls_count$ = null;
    $pgia_activeP$ = null;
    $the_term_inference_enabled$ = null;
    $allow_the_term_unification$ = null;
    $inference_the_term_bindings$ = null;
    $the_term_qua_constant$ = null;
    $external_inference_enabled$ = null;
    $suppress_conflict_noticesP$ = null;
    $ignore_conflictsP$ = null;
    $ignore_non_definitional_conflictsP$ = null;
    $conflicts_from_invalid_deductions$ = null;
    $record_inconsistent_support_sets$ = null;
    $last_agenda_op$ = null;
    $last_agenda_error_message$ = null;
    $last_agenda_error_explanatory_supports$ = null;
    $agenda_display_fi_warnings$ = null;
    $ignore_remote_errors$ = null;
    $auto_increment_kb$ = null;
    $load_submitted_transcriptsP$ = null;
    $send_submitted_transcript_loading_noticesP$ = null;
    $cyc_image_id$ = null;
    $use_tcp_port_in_image_id$ = null;
    $build_kb_loaded$ = null;
    $kb_loaded$ = null;
    $kb_pedigree$ = null;
    $use_transcriptP$ = null;
    $run_own_operationsP$ = null;
    $caught_up_on_master_transcript$ = null;
    $communication_mode$ = null;
    $unencapsulating_within_agenda$ = null;
    $save_asked_queriesP$ = null;
    $init_file_loadedP$ = null;
    $within_assert$ = null;
    $within_unassert$ = null;
    $within_ask$ = null;
    $within_query$ = null;
    $compute_inference_results$ = null;
    $cache_inference_results$ = null;
    $transformation_depth_cutoff$ = null;
    $lexicon_initializedP$ = null;
    $partial_semanticsP$ = null;
    $enforce_mass_vs_countP$ = null;
    $partial_syntaxP$ = null;
    $cb_presentation_languages$ = null;
    $cb_major_presentation_language$ = null;
    $show_assertions_in_english$ = null;
    $assume_cyc_cyclist_dialogP$ = null;
    $generated_phrases_browsableP$ = null;
    $highlight_demerits_in_generated_phrasesP$ = null;
    $cb_paraphrase_mt$ = null;
    $show_fet_edit_buttonsP$ = null;
    $show_fet_create_instance_buttonsP$ = null;
    $show_fet_create_spec_buttonsP$ = null;
    $cb_literal_query_results_one_per_lineP$ = null;
    $cb_skolem_applicable_relationsP$ = null;
    $cb_applicable_relations_one_per_lineP$ = null;
    $cb_paraphrase_applicable_relationsP$ = null;
    $show_credits$ = null;
    $browse_in_meta_query_modeP$ = null;
    $meta_query_start_string$ = null;
    $current_cache$ = null;
    $rkf_mt$ = null;
    $dbm_init_file_loadedP$ = null;
    $dbm_cache_loading_startedP$ = null;
    $dbm_cache_loading_finishedP$ = null;
    $wordnet_initializedP$ = null;
    $use_wn_linksP$ = null;
    $acip_subkernel_extraction$ = null;
    $acip_subkernel_output_stream$ = null;
    $janus_tag$ = null;
    $janus_new_constants$ = null;
    $janus_test_case_loggingP$ = null;
    $janus_operations$ = null;
    $janus_extraction_deduce_specs$ = null;
    $janus_within_somethingP$ = null;
    $janus_testing_deduce_specs$ = null;
    $janus_test_case_runningP$ = null;
    $ask_quirkP$ = null;
    $kbq_run_query_auto_destroy_enabledP$ = null;
    $kbq_run_query_non_continuable_enabledP$ = null;
    $kbq_run_query_practice_modeP$ = null;
    $sym0$_TABLE_AREA_ = makeSymbol( "*TABLE-AREA*" );
    $sym1$_HL_LOCK_ = makeSymbol( "*HL-LOCK*" );
    $str2$HL_Store_Lock = makeString( "HL Store Lock" );
    $sym3$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list4 = ConsesLow.list( makeSymbol( "*HL-LOCK*" ) );
    $str5$KEYWORD = makeString( "KEYWORD" );
    $str6$SUBLISP = makeString( "SUBLISP" );
    $str7$CYC = makeString( "CYC" );
    $sym8$SYMBOLP = makeSymbol( "SYMBOLP" );
    $str9$Symbol__S_from_package__S_is_not_ = makeString( "Symbol ~S from package ~S is not visible to SubL." );
    $kw10$TRUE = makeKeyword( "TRUE" );
    $str11$_ = makeString( " " );
    $kw12$FORWARD = makeKeyword( "FORWARD" );
    $list13 = ConsesLow.list( makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT" ) );
    $sym14$_HL_FAILURE_BACKCHAINING_ = makeSymbol( "*HL-FAILURE-BACKCHAINING*" );
    $str15$Enable_HL_predicate_backchaining = makeString( "Enable HL predicate backchaining" );
    $str16$This_controls_whether_or_not_we_a = makeString( "This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals." );
    $list17 = ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), NIL, makeString( "No" ) ), ConsesLow.list( makeKeyword( "VALUE" ), T, makeString( "Yes (expensive)" ) ) );
    $sym18$_NEGATION_BY_FAILURE_ = makeSymbol( "*NEGATION-BY-FAILURE*" );
    $str19$Enable_negation_by_failure = makeString( "Enable negation by failure" );
    $str20$This_controls_whether_or_not_we_a = makeString( "This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true." );
    $list21 = ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), NIL, makeString( "No" ) ), ConsesLow.list( makeKeyword( "VALUE" ), T, makeString( "Yes" ) ) );
    $sym22$_COMPLETE_EXTENT_MINIMIZATION_ = makeSymbol( "*COMPLETE-EXTENT-MINIMIZATION*" );
    $str23$Enable_complete_extent_minimizati = makeString( "Enable complete extent minimization" );
    $str24$This_controls_whether_or_not_we_a = makeString( "This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions." );
    $sym25$_UNBOUND_RULE_BACKCHAIN_ENABLED_ = makeSymbol( "*UNBOUND-RULE-BACKCHAIN-ENABLED*" );
    $str26$Enable_unbound_predicate_rule_bac = makeString( "Enable unbound predicate rule backchaining" );
    $str27$This_controls_whether_or_not_we_a = makeString(
        "This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form." );
    $int28$100000 = makeInteger( 100000 );
    $kw29$HEURISTIC = makeKeyword( "HEURISTIC" );
    $sym30$INFERENCE_RETURN_BLISTS = makeSymbol( "INFERENCE-RETURN-BLISTS" );
    $float31$0_1 = makeDouble( 0.1 );
    $float32$0_5 = makeDouble( 0.5 );
    $float33$1_0 = makeDouble( 1.0 );
    $float34$1_5 = makeDouble( 1.5 );
    $int35$38 = makeInteger( 38 );
    $int36$47 = makeInteger( 47 );
    $sym37$_AUTO_INCREMENT_KB_ = makeSymbol( "*AUTO-INCREMENT-KB*" );
    $sym38$BOOLEANP = makeSymbol( "BOOLEANP" );
    $str39$UNKNOWN = makeString( "UNKNOWN" );
    $str40$_ = makeString( "-" );
    $str41$ = makeString( "" );
    $str42$_a__a_a__a = makeString( "~a-~a~a-~a" );
    $sym43$_BUILD_KB_LOADED_ = makeSymbol( "*BUILD-KB-LOADED*" );
    $sym44$INTEGERP = makeSymbol( "INTEGERP" );
    $sym45$_KB_LOADED_ = makeSymbol( "*KB-LOADED*" );
    $int46$10000 = makeInteger( 10000 );
    $kw47$FULL = makeKeyword( "FULL" );
    $kw48$TINY = makeKeyword( "TINY" );
    $sym49$_KB_PEDIGREE_ = makeSymbol( "*KB-PEDIGREE*" );
    $kw50$UNKNOWN = makeKeyword( "UNKNOWN" );
    $sym51$_RUN_OWN_OPERATIONS__ = makeSymbol( "*RUN-OWN-OPERATIONS?*" );
    $sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_ = makeSymbol( "*CAUGHT-UP-ON-MASTER-TRANSCRIPT*" );
    $sym53$_COMMUNICATION_MODE_ = makeSymbol( "*COMMUNICATION-MODE*" );
    $sym54$_INIT_FILE_LOADED__ = makeSymbol( "*INIT-FILE-LOADED?*" );
    $sym55$_CACHE_INFERENCE_RESULTS_ = makeSymbol( "*CACHE-INFERENCE-RESULTS*" );
    $str56$Cache_backward_query_results = makeString( "Cache backward query results" );
    $str57$This_controls_whether_the_results = makeString( "This controls whether the results of successful backward queries are cached in the KB." );
    $sym58$_LEXICON_INITIALIZED__ = makeSymbol( "*LEXICON-INITIALIZED?*" );
    $list59 = ConsesLow.list( makeKeyword( "CYCL" ), makeKeyword( "NL" ), makeKeyword( "FOL" ), makeKeyword( "SILK" ) );
    $kw60$CYCL = makeKeyword( "CYCL" );
    $sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_ = makeSymbol( "*CB-MAJOR-PRESENTATION-LANGUAGE*" );
    $kw62$CYC_HALO = makeKeyword( "CYC-HALO" );
    $list63 = ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "FWHEN-FEATURE" ), makeKeyword( "CYC-HALO" ), T ), ConsesLow.list( EQ, makeKeyword( "SILK" ), makeSymbol(
        "*CB-MAJOR-PRESENTATION-LANGUAGE*" ) ) );
    $sym64$PWHEN = makeSymbol( "PWHEN" );
    $list65 = ConsesLow.list( makeSymbol( "CB-SILK-PRESENTATION-LANGUAGE?" ) );
    $sym66$_ASSUME_CYC_CYCLIST_DIALOG__ = makeSymbol( "*ASSUME-CYC-CYCLIST-DIALOG?*" );
    $sym67$_GENERATED_PHRASES_BROWSABLE__ = makeSymbol( "*GENERATED-PHRASES-BROWSABLE?*" );
    $sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ = makeSymbol( "*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*" );
    $sym69$_CB_PARAPHRASE_MT_ = makeSymbol( "*CB-PARAPHRASE-MT*" );
    $sym70$_SHOW_FET_EDIT_BUTTONS__ = makeSymbol( "*SHOW-FET-EDIT-BUTTONS?*" );
    $sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ = makeSymbol( "*SHOW-FET-CREATE-INSTANCE-BUTTONS?*" );
    $sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__ = makeSymbol( "*SHOW-FET-CREATE-SPEC-BUTTONS?*" );
    $sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ = makeSymbol( "*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*" );
    $sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__ = makeSymbol( "*CB-SKOLEM-APPLICABLE-RELATIONS?*" );
    $sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ = makeSymbol( "*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*" );
    $sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ = makeSymbol( "*CB-PARAPHRASE-APPLICABLE-RELATIONS?*" );
    $sym77$_BROWSE_IN_META_QUERY_MODE__ = makeSymbol( "*BROWSE-IN-META-QUERY-MODE?*" );
    $sym78$_WORDNET_INITIALIZED__ = makeSymbol( "*WORDNET-INITIALIZED?*" );
    $sym79$_USE_WN_LINKS__ = makeSymbol( "*USE-WN-LINKS?*" );
    $sym80$_ACIP_SUBKERNEL_EXTRACTION_ = makeSymbol( "*ACIP-SUBKERNEL-EXTRACTION*" );
    $sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_ = makeSymbol( "*ACIP-SUBKERNEL-OUTPUT-STREAM*" );
  }
}
/*
 * 
 * Total time: 366 ms synthetic
 */
