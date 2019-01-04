package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class control_vars extends SubLTranslatedFile
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
    static  boolean assertionsDisabledSynth = true;

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1113L)
    public static SubLObject within_hl_modification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)control_vars.$sym3$WITH_LOCK_HELD, (SubLObject)control_vars.$list4, ConsesLow.append(body, (SubLObject)control_vars.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 1441L)
    public static SubLObject subl_symbol_package(final SubLObject symbol) {
        assert control_vars.NIL != Types.symbolp(symbol) : symbol;
        if (symbol.isKeyword()) {
            return control_vars.$keyword_package$.getGlobalValue();
        }
        final SubLObject v_package = Symbols.symbol_package(symbol);
        if (control_vars.NIL == v_package) {
            return (SubLObject)control_vars.NIL;
        }
        final SubLObject name = Symbols.symbol_name(symbol);
        if (symbol.eql(Packages.find_symbol(name, control_vars.$sublisp_package$.getGlobalValue()))) {
            return control_vars.$sublisp_package$.getGlobalValue();
        }
        if (symbol.eql(Packages.find_symbol(name, control_vars.$cyc_package$.getGlobalValue()))) {
            return control_vars.$cyc_package$.getGlobalValue();
        }
        return Errors.error((SubLObject)control_vars.$str9$Symbol__S_from_package__S_is_not_, symbol, v_package);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 4593L)
    public static SubLObject mapping_funcall_arg(final SubLObject arg, SubLObject n) {
        if (n == control_vars.UNPROVIDED) {
            n = control_vars.$mapping_fn_arg$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)control_vars.NIL;
        final SubLObject pcase_var = n;
        if (pcase_var.eql((SubLObject)control_vars.ONE_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg1$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg1$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg1$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.TWO_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg2$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg2$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg2$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.THREE_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg3$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg3$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg3$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.FOUR_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg4$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg4$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg4$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.FIVE_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg5$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg5$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg5$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.SIX_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg6$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg6$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg6$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.SEVEN_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg7$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg7$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg7$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pcase_var.eql((SubLObject)control_vars.EIGHT_INTEGER)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_fn_arg8$.currentBinding(thread);
            try {
                control_vars.$mapping_fn_arg8$.bind(arg, thread);
                result = mapping_funcall_int();
            }
            finally {
                control_vars.$mapping_fn_arg8$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 5349L)
    public static SubLObject mapping_funcall_int() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn$.getDynamicValue(thread))) {
            return (SubLObject)control_vars.NIL;
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg2$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), control_vars.$mapping_fn_arg1$.getDynamicValue(thread));
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg3$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread));
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg4$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread), control_vars.$mapping_fn_arg3$.getDynamicValue(thread));
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg5$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread), control_vars.$mapping_fn_arg3$.getDynamicValue(thread), control_vars.$mapping_fn_arg4$.getDynamicValue(thread));
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg6$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread), control_vars.$mapping_fn_arg3$.getDynamicValue(thread), control_vars.$mapping_fn_arg4$.getDynamicValue(thread), control_vars.$mapping_fn_arg5$.getDynamicValue(thread));
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg7$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread), control_vars.$mapping_fn_arg3$.getDynamicValue(thread), control_vars.$mapping_fn_arg4$.getDynamicValue(thread), control_vars.$mapping_fn_arg5$.getDynamicValue(thread), control_vars.$mapping_fn_arg6$.getDynamicValue(thread));
        }
        if (control_vars.NIL != utilities_macros.unprovided_argumentP(control_vars.$mapping_fn_arg8$.getDynamicValue(thread))) {
            return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), new SubLObject[] { control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread), control_vars.$mapping_fn_arg3$.getDynamicValue(thread), control_vars.$mapping_fn_arg4$.getDynamicValue(thread), control_vars.$mapping_fn_arg5$.getDynamicValue(thread), control_vars.$mapping_fn_arg6$.getDynamicValue(thread), control_vars.$mapping_fn_arg7$.getDynamicValue(thread) });
        }
        return Functions.funcall(control_vars.$mapping_fn$.getDynamicValue(thread), new SubLObject[] { control_vars.$mapping_fn_arg1$.getDynamicValue(thread), control_vars.$mapping_fn_arg2$.getDynamicValue(thread), control_vars.$mapping_fn_arg3$.getDynamicValue(thread), control_vars.$mapping_fn_arg4$.getDynamicValue(thread), control_vars.$mapping_fn_arg5$.getDynamicValue(thread), control_vars.$mapping_fn_arg6$.getDynamicValue(thread), control_vars.$mapping_fn_arg7$.getDynamicValue(thread), control_vars.$mapping_fn_arg8$.getDynamicValue(thread) });
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 8797L)
    public static SubLObject inference_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2) {
        if (arg1 == control_vars.UNPROVIDED) {
            arg1 = (SubLObject)control_vars.NIL;
        }
        if (arg2 == control_vars.UNPROVIDED) {
            arg2 = (SubLObject)control_vars.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (control_vars.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
            return Errors.error(format_string, arg1, arg2);
        }
        return Errors.warn(format_string, arg1, arg2);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 9411L)
    public static SubLObject browse_forward_inferencesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$browse_forward_inferencesP$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 16633L)
    public static SubLObject the_term_qua_constantP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_term, control_vars.$the_term_qua_constant$.getDynamicValue(thread), (SubLObject)control_vars.UNPROVIDED, (SubLObject)control_vars.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18302L)
    public static SubLObject auto_increment_kb() {
        return control_vars.$auto_increment_kb$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18406L)
    public static SubLObject set_auto_increment_kb(final SubLObject v_boolean) {
        assert control_vars.NIL != Types.booleanp(v_boolean) : v_boolean;
        control_vars.$auto_increment_kb$.setGlobalValue(v_boolean);
        return control_vars.$auto_increment_kb$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18724L)
    public static SubLObject load_submitted_transcriptsP() {
        return control_vars.$load_submitted_transcriptsP$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 18941L)
    public static SubLObject set_load_submitted_transcripts(final SubLObject v_boolean) {
        assert control_vars.NIL != Types.booleanp(v_boolean) : v_boolean;
        control_vars.$load_submitted_transcriptsP$.setGlobalValue(v_boolean);
        return control_vars.$load_submitted_transcriptsP$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19335L)
    public static SubLObject send_submitted_transcript_loading_noticesP() {
        return control_vars.$send_submitted_transcript_loading_noticesP$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 19596L)
    public static SubLObject set_send_submitted_transcript_loading_notices(final SubLObject v_boolean) {
        assert control_vars.NIL != Types.booleanp(v_boolean) : v_boolean;
        control_vars.$send_submitted_transcript_loading_noticesP$.setGlobalValue(v_boolean);
        return control_vars.$send_submitted_transcript_loading_noticesP$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 20022L)
    public static SubLObject make_cyc_image_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine_name = Strings.string_downcase(string_utilities.string_upto(Environment.get_machine_name((SubLObject)control_vars.$str39$UNKNOWN), (SubLObject)Characters.CHAR_period), (SubLObject)control_vars.UNPROVIDED, (SubLObject)control_vars.UNPROVIDED);
        final SubLObject base_port_string = (SubLObject)((control_vars.NIL != control_vars.$use_tcp_port_in_image_id$.getGlobalValue() && control_vars.NIL != system_parameters.$base_tcp_port$.getDynamicValue(thread)) ? Sequences.cconcatenate(string_utilities.to_string(system_parameters.$base_tcp_port$.getDynamicValue(thread)), (SubLObject)control_vars.$str40$_) : control_vars.$str41$);
        final SubLObject process_id = Environment.get_process_id((SubLObject)control_vars.UNPROVIDED);
        final SubLObject uniquifier = process_id.isZero() ? random.random(Numbers.$most_positive_fixnum$.getGlobalValue()) : process_id;
        final SubLObject cyc_universal_time = numeric_date_utilities.universal_timestring((SubLObject)control_vars.UNPROVIDED);
        return PrintLow.format((SubLObject)control_vars.NIL, (SubLObject)control_vars.$str42$_a__a_a__a, new SubLObject[] { machine_name, base_port_string, cyc_universal_time, uniquifier });
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 20832L)
    public static SubLObject set_cyc_image_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        control_vars.$cyc_image_id$.setDynamicValue(make_cyc_image_id(), thread);
        return control_vars.$cyc_image_id$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 20980L)
    public static SubLObject cyc_image_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$cyc_image_id$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21251L)
    public static SubLObject build_kb_loaded() {
        return control_vars.$build_kb_loaded$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21394L)
    public static SubLObject set_build_kb_loaded(final SubLObject kb) {
        if (control_vars.NIL != kb && !control_vars.assertionsDisabledSynth && control_vars.NIL == Types.integerp(kb)) {
            throw new AssertionError(kb);
        }
        control_vars.$build_kb_loaded$.setGlobalValue(kb);
        return set_kb_loaded(kb);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21690L)
    public static SubLObject kb_loaded() {
        return control_vars.$kb_loaded$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 21870L)
    public static SubLObject set_kb_loaded(final SubLObject kb) {
        if (control_vars.NIL != kb && !control_vars.assertionsDisabledSynth && control_vars.NIL == Types.integerp(kb)) {
            throw new AssertionError(kb);
        }
        control_vars.$kb_loaded$.setGlobalValue(kb);
        return kb;
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22106L)
    public static SubLObject core_kb_loadedP() {
        return list_utilities.sublisp_boolean(kb_loaded());
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22279L)
    public static SubLObject non_tiny_kb_loadedP() {
        return Numbers.numG(constant_handles.constant_count(), (SubLObject)control_vars.$int46$10000);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22437L)
    public static SubLObject kb_tiny_or_full() {
        if (control_vars.NIL != non_tiny_kb_loadedP()) {
            return (SubLObject)control_vars.$kw47$FULL;
        }
        return (SubLObject)control_vars.$kw48$TINY;
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 22772L)
    public static SubLObject kb_pedigree() {
        return control_vars.$kb_pedigree$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23397L)
    public static SubLObject caught_up_on_master_transcript() {
        return control_vars.$caught_up_on_master_transcript$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 23539L)
    public static SubLObject set_caught_up_on_master_transcript(final SubLObject v_boolean) {
        control_vars.$caught_up_on_master_transcript$.setGlobalValue(v_boolean);
        return control_vars.$caught_up_on_master_transcript$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26006L)
    public static SubLObject save_asked_queriesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(control_vars.NIL != control_vars.$save_asked_queriesP$.getDynamicValue(thread) && control_vars.NIL != non_tiny_kb_loadedP() && control_vars.NIL != subl_promotions.positive_integer_p(kb_loaded()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26466L)
    public static SubLObject within_askP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$within_ask$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26519L)
    public static SubLObject within_queryP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(control_vars.NIL != control_vars.$within_ask$.getDynamicValue(thread) || control_vars.NIL != control_vars.$within_query$.getDynamicValue(thread));
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26600L)
    public static SubLObject within_assertP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$within_assert$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 26659L)
    public static SubLObject within_unassertP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return control_vars.$within_unassert$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27288L)
    public static SubLObject note_lexicon_initialized() {
        control_vars.$lexicon_initializedP$.setGlobalValue((SubLObject)control_vars.T);
        return control_vars.$lexicon_initializedP$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 27560L)
    public static SubLObject lexicon_initialized_p() {
        return list_utilities.sublisp_boolean(control_vars.$lexicon_initializedP$.getGlobalValue());
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28326L)
    public static SubLObject cb_presentation_language_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, control_vars.$cb_presentation_languages$.getGlobalValue());
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28583L)
    public static SubLObject cb_silk_presentation_languageP(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        if (control_vars.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)control_vars.NIL);
        }
        if (control_vars.NIL != subl_promotions.memberP((SubLObject)control_vars.$kw62$CYC_HALO, reader.$features$.getDynamicValue(thread), (SubLObject)control_vars.UNPROVIDED, (SubLObject)control_vars.UNPROVIDED)) {
            return (SubLObject)control_vars.$list63;
        }
        return (SubLObject)control_vars.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/control-vars.lisp", position = 28973L)
    public static SubLObject pwhen_cb_silk_presentation_language(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)control_vars.$sym64$PWHEN, (SubLObject)control_vars.$list65, ConsesLow.append(body, (SubLObject)control_vars.NIL));
    }

    public static SubLObject declare_control_vars_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.control_vars", "within_hl_modification", "WITHIN-HL-MODIFICATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "subl_symbol_package", "SUBL-SYMBOL-PACKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "mapping_funcall_arg", "MAPPING-FUNCALL-ARG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "mapping_funcall_int", "MAPPING-FUNCALL-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "inference_warn", "INFERENCE-WARN", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "browse_forward_inferencesP", "BROWSE-FORWARD-INFERENCES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "the_term_qua_constantP", "THE-TERM-QUA-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "auto_increment_kb", "AUTO-INCREMENT-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_auto_increment_kb", "SET-AUTO-INCREMENT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "load_submitted_transcriptsP", "LOAD-SUBMITTED-TRANSCRIPTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_load_submitted_transcripts", "SET-LOAD-SUBMITTED-TRANSCRIPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "send_submitted_transcript_loading_noticesP", "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_send_submitted_transcript_loading_notices", "SET-SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "make_cyc_image_id", "MAKE-CYC-IMAGE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_cyc_image_id", "SET-CYC-IMAGE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "cyc_image_id", "CYC-IMAGE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "build_kb_loaded", "BUILD-KB-LOADED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_build_kb_loaded", "SET-BUILD-KB-LOADED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "kb_loaded", "KB-LOADED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_kb_loaded", "SET-KB-LOADED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "core_kb_loadedP", "CORE-KB-LOADED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "non_tiny_kb_loadedP", "NON-TINY-KB-LOADED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "kb_tiny_or_full", "KB-TINY-OR-FULL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "kb_pedigree", "KB-PEDIGREE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "caught_up_on_master_transcript", "CAUGHT-UP-ON-MASTER-TRANSCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "set_caught_up_on_master_transcript", "SET-CAUGHT-UP-ON-MASTER-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "save_asked_queriesP", "SAVE-ASKED-QUERIES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "within_askP", "WITHIN-ASK?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "within_queryP", "WITHIN-QUERY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "within_assertP", "WITHIN-ASSERT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "within_unassertP", "WITHIN-UNASSERT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "note_lexicon_initialized", "NOTE-LEXICON-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "lexicon_initialized_p", "LEXICON-INITIALIZED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.control_vars", "cb_presentation_language_p", "CB-PRESENTATION-LANGUAGE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.control_vars", "cb_silk_presentation_languageP", "CB-SILK-PRESENTATION-LANGUAGE?");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.control_vars", "pwhen_cb_silk_presentation_language", "PWHEN-CB-SILK-PRESENTATION-LANGUAGE");
        return (SubLObject)control_vars.NIL;
    }

    public static SubLObject init_control_vars_file() {
        control_vars.$read_require_constant_exists$ = SubLFiles.defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", (SubLObject)control_vars.T);
        control_vars.$table_area$ = SubLFiles.deflexical("*TABLE-AREA*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym0$_TABLE_AREA_)) ? control_vars.$table_area$.getGlobalValue() : control_vars.NIL));
        control_vars.$hl_lock$ = SubLFiles.deflexical("*HL-LOCK*", (control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym1$_HL_LOCK_)) ? control_vars.$hl_lock$.getGlobalValue() : Locks.make_lock((SubLObject)control_vars.$str2$HL_Store_Lock));
        control_vars.$bootstrapping_kbP$ = SubLFiles.defparameter("*BOOTSTRAPPING-KB?*", (SubLObject)control_vars.NIL);
        control_vars.$keyword_package$ = SubLFiles.deflexical("*KEYWORD-PACKAGE*", Packages.find_package((SubLObject)control_vars.$str5$KEYWORD));
        control_vars.$sublisp_package$ = SubLFiles.deflexical("*SUBLISP-PACKAGE*", Packages.find_package((SubLObject)control_vars.$str6$SUBLISP));
        control_vars.$cyc_package$ = SubLFiles.deflexical("*CYC-PACKAGE*", Packages.find_package((SubLObject)control_vars.$str7$CYC));
        control_vars.$cnf_matching_predicate$ = SubLFiles.defparameter("*CNF-MATCHING-PREDICATE*", (SubLObject)control_vars.EQUAL);
        control_vars.$gaf_matching_predicate$ = SubLFiles.defparameter("*GAF-MATCHING-PREDICATE*", (SubLObject)control_vars.EQUAL);
        control_vars.$nat_matching_predicate$ = SubLFiles.defparameter("*NAT-MATCHING-PREDICATE*", (SubLObject)control_vars.EQUAL);
        control_vars.$candidate_assertion$ = SubLFiles.defparameter("*CANDIDATE-ASSERTION*", (SubLObject)control_vars.NIL);
        control_vars.$variable_names$ = SubLFiles.defparameter("*VARIABLE-NAMES*", (SubLObject)control_vars.NIL);
        control_vars.$assertion_truth$ = SubLFiles.defparameter("*ASSERTION-TRUTH*", (SubLObject)control_vars.$kw10$TRUE);
        control_vars.$mapping_answer$ = SubLFiles.defparameter("*MAPPING-ANSWER*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_pred$ = SubLFiles.defparameter("*MAPPING-PRED*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_source$ = SubLFiles.defparameter("*MAPPING-SOURCE*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_target$ = SubLFiles.defparameter("*MAPPING-TARGET*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_target_arg$ = SubLFiles.defparameter("*MAPPING-TARGET-ARG*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_index_arg$ = SubLFiles.defparameter("*MAPPING-INDEX-ARG*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_gather_arg$ = SubLFiles.defparameter("*MAPPING-GATHER-ARG*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_gather_args$ = SubLFiles.defparameter("*MAPPING-GATHER-ARGS*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_output_stream$ = SubLFiles.defparameter("*MAPPING-OUTPUT-STREAM*", (SubLObject)control_vars.T);
        control_vars.$mapping_equality_test$ = SubLFiles.defparameter("*MAPPING-EQUALITY-TEST*", Symbols.symbol_function((SubLObject)control_vars.EQUAL));
        control_vars.$mapping_any_answerP$ = SubLFiles.defparameter("*MAPPING-ANY-ANSWER?*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_relation$ = SubLFiles.defparameter("*MAPPING-RELATION*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_finished_fn$ = SubLFiles.defparameter("*MAPPING-FINISHED-FN*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_path$ = SubLFiles.defparameter("*MAPPING-PATH*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_data_1$ = SubLFiles.defparameter("*MAPPING-DATA-1*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_data_2$ = SubLFiles.defparameter("*MAPPING-DATA-2*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_pivot_arg$ = SubLFiles.defparameter("*MAPPING-PIVOT-ARG*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_gather_key$ = SubLFiles.defparameter("*MAPPING-GATHER-KEY*", Symbols.symbol_function((SubLObject)control_vars.IDENTITY));
        control_vars.$mapping_gather_key_args$ = SubLFiles.defparameter("*MAPPING-GATHER-KEY-ARGS*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_assertion_selection_fn$ = SubLFiles.defparameter("*MAPPING-ASSERTION-SELECTION-FN*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_assertion_bookkeeping_fn$ = SubLFiles.defparameter("*MAPPING-ASSERTION-BOOKKEEPING-FN*", (SubLObject)control_vars.NIL);
        control_vars.$mapping_fn$ = SubLFiles.defparameter("*MAPPING-FN*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg$ = SubLFiles.defparameter("*MAPPING-FN-ARG*", (SubLObject)control_vars.ONE_INTEGER);
        control_vars.$mapping_fn_arg1$ = SubLFiles.defparameter("*MAPPING-FN-ARG1*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg2$ = SubLFiles.defparameter("*MAPPING-FN-ARG2*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg3$ = SubLFiles.defparameter("*MAPPING-FN-ARG3*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg4$ = SubLFiles.defparameter("*MAPPING-FN-ARG4*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg5$ = SubLFiles.defparameter("*MAPPING-FN-ARG5*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg6$ = SubLFiles.defparameter("*MAPPING-FN-ARG6*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg7$ = SubLFiles.defparameter("*MAPPING-FN-ARG7*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$mapping_fn_arg8$ = SubLFiles.defparameter("*MAPPING-FN-ARG8*", utilities_macros.$unprovided$.getGlobalValue());
        control_vars.$kba_pred$ = SubLFiles.defparameter("*KBA-PRED*", (SubLObject)control_vars.NIL);
        control_vars.$standard_indent_string$ = SubLFiles.defparameter("*STANDARD-INDENT-STRING*", (SubLObject)control_vars.$str11$_);
        control_vars.$term_functional_complexity_cutoff$ = SubLFiles.defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", (SubLObject)control_vars.NIL);
        control_vars.$term_relational_complexity_cutoff$ = SubLFiles.defparameter("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", (SubLObject)control_vars.NIL);
        control_vars.$collect_justification_compilationsP$ = SubLFiles.defparameter("*COLLECT-JUSTIFICATION-COMPILATIONS?*", (SubLObject)control_vars.NIL);
        control_vars.$justification_compilations$ = SubLFiles.defparameter("*JUSTIFICATION-COMPILATIONS*", (SubLObject)control_vars.NIL);
        control_vars.$ebl_trace$ = SubLFiles.defparameter("*EBL-TRACE*", (SubLObject)control_vars.ZERO_INTEGER);
        control_vars.$allow_forward_skolemization$ = SubLFiles.defparameter("*ALLOW-FORWARD-SKOLEMIZATION*", (SubLObject)control_vars.NIL);
        control_vars.$prefer_forward_skolemization$ = SubLFiles.defparameter("*PREFER-FORWARD-SKOLEMIZATION*", (SubLObject)control_vars.NIL);
        control_vars.$perform_unification_occurs_check$ = SubLFiles.defparameter("*PERFORM-UNIFICATION-OCCURS-CHECK*", (SubLObject)control_vars.T);
        control_vars.$perform_equals_unification$ = SubLFiles.defparameter("*PERFORM-EQUALS-UNIFICATION*", (SubLObject)control_vars.T);
        control_vars.$allow_backward_gafs$ = SubLFiles.defparameter("*ALLOW-BACKWARD-GAFS*", (SubLObject)control_vars.T);
        control_vars.$cached_ask_result_direction$ = SubLFiles.defparameter("*CACHED-ASK-RESULT-DIRECTION*", (SubLObject)control_vars.$kw12$FORWARD);
        control_vars.$check_for_circular_justs$ = SubLFiles.defparameter("*CHECK-FOR-CIRCULAR-JUSTS*", (SubLObject)control_vars.T);
        control_vars.$filter_deductions_for_trivially_derivable_gafs$ = SubLFiles.defparameter("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", (SubLObject)control_vars.NIL);
        control_vars.$inference_debugP$ = SubLFiles.defparameter("*INFERENCE-DEBUG?*", (SubLObject)control_vars.NIL);
        control_vars.$inference_trace_level$ = SubLFiles.defparameter("*INFERENCE-TRACE-LEVEL*", (SubLObject)control_vars.ZERO_INTEGER);
        control_vars.$browse_forward_inferencesP$ = SubLFiles.defvar("*BROWSE-FORWARD-INFERENCES?*", (SubLObject)control_vars.NIL);
        control_vars.$query_properties_inherited_by_recursive_queries$ = SubLFiles.defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", (SubLObject)control_vars.$list13);
        control_vars.$proof_checking_enabled$ = SubLFiles.defparameter("*PROOF-CHECKING-ENABLED*", (SubLObject)control_vars.NIL);
        control_vars.$proof_checker_rules$ = SubLFiles.defparameter("*PROOF-CHECKER-RULES*", (SubLObject)control_vars.NIL);
        control_vars.$inference_propagate_mt_scope$ = SubLFiles.defparameter("*INFERENCE-PROPAGATE-MT-SCOPE*", (SubLObject)control_vars.NIL);
        control_vars.$inference_current_node_mt_scope$ = SubLFiles.defparameter("*INFERENCE-CURRENT-NODE-MT-SCOPE*", (SubLObject)control_vars.NIL);
        control_vars.$inference_literal$ = SubLFiles.defparameter("*INFERENCE-LITERAL*", (SubLObject)control_vars.NIL);
        control_vars.$inference_sense$ = SubLFiles.defparameter("*INFERENCE-SENSE*", (SubLObject)control_vars.NIL);
        control_vars.$inference_arg$ = SubLFiles.defparameter("*INFERENCE-ARG*", (SubLObject)control_vars.NIL);
        control_vars.$inference_more_supports$ = SubLFiles.defparameter("*INFERENCE-MORE-SUPPORTS*", (SubLObject)control_vars.NIL);
        control_vars.$inference_highly_relevant_assertions$ = SubLFiles.defparameter("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", (SubLObject)control_vars.NIL);
        control_vars.$inference_highly_relevant_mts$ = SubLFiles.defparameter("*INFERENCE-HIGHLY-RELEVANT-MTS*", (SubLObject)control_vars.NIL);
        control_vars.$within_hl_failure_backchainingP$ = SubLFiles.defparameter("*WITHIN-HL-FAILURE-BACKCHAINING?*", (SubLObject)control_vars.NIL);
        control_vars.$hl_failure_backchaining$ = SubLFiles.defparameter("*HL-FAILURE-BACKCHAINING*", (SubLObject)control_vars.NIL);
        control_vars.$evaluatable_backchain_enabled$ = SubLFiles.defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", (SubLObject)control_vars.NIL);
        control_vars.$negation_by_failure$ = SubLFiles.defparameter("*NEGATION-BY-FAILURE*", (SubLObject)control_vars.NIL);
        control_vars.$complete_extent_minimization$ = SubLFiles.defparameter("*COMPLETE-EXTENT-MINIMIZATION*", (SubLObject)control_vars.T);
        control_vars.$unbound_rule_backchain_enabled$ = SubLFiles.defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", (SubLObject)control_vars.NIL);
        control_vars.$default_removal_cost_cutoff$ = SubLFiles.deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", (SubLObject)control_vars.$int28$100000);
        control_vars.$removal_cost_cutoff$ = SubLFiles.defparameter("*REMOVAL-COST-CUTOFF*", control_vars.$default_removal_cost_cutoff$.getGlobalValue());
        control_vars.$forward_inference_removal_cost_cutoff$ = SubLFiles.defparameter("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", control_vars.$default_removal_cost_cutoff$.getGlobalValue());
        control_vars.$application_filtering_enabled$ = SubLFiles.defparameter("*APPLICATION-FILTERING-ENABLED*", (SubLObject)control_vars.NIL);
        control_vars.$marking_doomed_inference_ancestors$ = SubLFiles.defparameter("*MARKING-DOOMED-INFERENCE-ANCESTORS*", (SubLObject)control_vars.NIL);
        control_vars.$inference_search_strategy$ = SubLFiles.defparameter("*INFERENCE-SEARCH-STRATEGY*", (SubLObject)control_vars.$kw29$HEURISTIC);
        control_vars.$unique_inference_result_bindings$ = SubLFiles.defparameter("*UNIQUE-INFERENCE-RESULT-BINDINGS*", (SubLObject)control_vars.T);
        control_vars.$inference_answer_handler$ = SubLFiles.defparameter("*INFERENCE-ANSWER-HANDLER*", (SubLObject)control_vars.$sym30$INFERENCE_RETURN_BLISTS);
        control_vars.$hl_module_simplification_cost$ = SubLFiles.defparameter("*HL-MODULE-SIMPLIFICATION-COST*", (SubLObject)control_vars.$float31$0_1);
        control_vars.$hl_module_check_cost$ = SubLFiles.defparameter("*HL-MODULE-CHECK-COST*", (SubLObject)control_vars.$float32$0_5);
        control_vars.$cheap_hl_module_check_cost$ = SubLFiles.deflexical("*CHEAP-HL-MODULE-CHECK-COST*", (SubLObject)control_vars.$float32$0_5);
        control_vars.$typical_hl_module_check_cost$ = SubLFiles.deflexical("*TYPICAL-HL-MODULE-CHECK-COST*", (SubLObject)control_vars.$float33$1_0);
        control_vars.$expensive_hl_module_check_cost$ = SubLFiles.deflexical("*EXPENSIVE-HL-MODULE-CHECK-COST*", (SubLObject)control_vars.$float34$1_5);
        control_vars.$expensive_hl_module_singleton_generate_cost$ = SubLFiles.deflexical("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        control_vars.$maximum_hl_module_check_cost$ = SubLFiles.defparameter("*MAXIMUM-HL-MODULE-CHECK-COST*", (SubLObject)control_vars.NIL);
        control_vars.$average_all_isa_count$ = SubLFiles.defparameter("*AVERAGE-ALL-ISA-COUNT*", (SubLObject)control_vars.$int35$38);
        control_vars.$average_all_genls_count$ = SubLFiles.defparameter("*AVERAGE-ALL-GENLS-COUNT*", (SubLObject)control_vars.$int36$47);
        control_vars.$pgia_activeP$ = SubLFiles.defparameter("*PGIA-ACTIVE?*", (SubLObject)control_vars.NIL);
        control_vars.$the_term_inference_enabled$ = SubLFiles.defparameter("*THE-TERM-INFERENCE-ENABLED*", (SubLObject)control_vars.NIL);
        control_vars.$allow_the_term_unification$ = SubLFiles.defparameter("*ALLOW-THE-TERM-UNIFICATION*", (SubLObject)control_vars.NIL);
        control_vars.$inference_the_term_bindings$ = SubLFiles.defparameter("*INFERENCE-THE-TERM-BINDINGS*", (SubLObject)control_vars.NIL);
        control_vars.$the_term_qua_constant$ = SubLFiles.defparameter("*THE-TERM-QUA-CONSTANT*", (SubLObject)control_vars.NIL);
        control_vars.$external_inference_enabled$ = SubLFiles.defparameter("*EXTERNAL-INFERENCE-ENABLED*", (SubLObject)control_vars.NIL);
        control_vars.$suppress_conflict_noticesP$ = SubLFiles.defparameter("*SUPPRESS-CONFLICT-NOTICES?*", (SubLObject)control_vars.NIL);
        control_vars.$ignore_conflictsP$ = SubLFiles.defparameter("*IGNORE-CONFLICTS?*", (SubLObject)control_vars.NIL);
        control_vars.$ignore_non_definitional_conflictsP$ = SubLFiles.defparameter("*IGNORE-NON-DEFINITIONAL-CONFLICTS?*", (SubLObject)control_vars.NIL);
        control_vars.$conflicts_from_invalid_deductions$ = SubLFiles.defparameter("*CONFLICTS-FROM-INVALID-DEDUCTIONS*", (SubLObject)control_vars.NIL);
        control_vars.$record_inconsistent_support_sets$ = SubLFiles.defparameter("*RECORD-INCONSISTENT-SUPPORT-SETS*", (SubLObject)control_vars.NIL);
        control_vars.$last_agenda_op$ = SubLFiles.deflexical("*LAST-AGENDA-OP*", (SubLObject)control_vars.NIL);
        control_vars.$last_agenda_error_message$ = SubLFiles.deflexical("*LAST-AGENDA-ERROR-MESSAGE*", (SubLObject)control_vars.NIL);
        control_vars.$last_agenda_error_explanatory_supports$ = SubLFiles.deflexical("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", (SubLObject)control_vars.NIL);
        control_vars.$agenda_display_fi_warnings$ = SubLFiles.defparameter("*AGENDA-DISPLAY-FI-WARNINGS*", (SubLObject)control_vars.NIL);
        control_vars.$ignore_remote_errors$ = SubLFiles.defparameter("*IGNORE-REMOTE-ERRORS*", (SubLObject)control_vars.T);
        control_vars.$auto_increment_kb$ = SubLFiles.deflexical("*AUTO-INCREMENT-KB*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym37$_AUTO_INCREMENT_KB_)) ? control_vars.$auto_increment_kb$.getGlobalValue() : control_vars.NIL));
        control_vars.$load_submitted_transcriptsP$ = SubLFiles.deflexical("*LOAD-SUBMITTED-TRANSCRIPTS?*", (SubLObject)control_vars.NIL);
        control_vars.$send_submitted_transcript_loading_noticesP$ = SubLFiles.deflexical("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", (SubLObject)control_vars.NIL);
        control_vars.$cyc_image_id$ = SubLFiles.defvar("*CYC-IMAGE-ID*", (SubLObject)control_vars.NIL);
        control_vars.$use_tcp_port_in_image_id$ = SubLFiles.deflexical("*USE-TCP-PORT-IN-IMAGE-ID*", (SubLObject)control_vars.T);
        control_vars.$build_kb_loaded$ = SubLFiles.deflexical("*BUILD-KB-LOADED*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym43$_BUILD_KB_LOADED_)) ? control_vars.$build_kb_loaded$.getGlobalValue() : control_vars.NIL));
        control_vars.$kb_loaded$ = SubLFiles.deflexical("*KB-LOADED*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym45$_KB_LOADED_)) ? control_vars.$kb_loaded$.getGlobalValue() : control_vars.NIL));
        control_vars.$kb_pedigree$ = SubLFiles.deflexical("*KB-PEDIGREE*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym49$_KB_PEDIGREE_)) ? control_vars.$kb_pedigree$.getGlobalValue() : control_vars.$kw50$UNKNOWN));
        control_vars.$use_transcriptP$ = SubLFiles.defparameter("*USE-TRANSCRIPT?*", (SubLObject)control_vars.T);
        control_vars.$run_own_operationsP$ = SubLFiles.deflexical("*RUN-OWN-OPERATIONS?*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym51$_RUN_OWN_OPERATIONS__)) ? control_vars.$run_own_operationsP$.getGlobalValue() : control_vars.T));
        control_vars.$caught_up_on_master_transcript$ = SubLFiles.deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_)) ? control_vars.$caught_up_on_master_transcript$.getGlobalValue() : control_vars.NIL));
        control_vars.$communication_mode$ = SubLFiles.deflexical("*COMMUNICATION-MODE*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym53$_COMMUNICATION_MODE_)) ? control_vars.$communication_mode$.getGlobalValue() : control_vars.$kw50$UNKNOWN));
        control_vars.$unencapsulating_within_agenda$ = SubLFiles.defparameter("*UNENCAPSULATING-WITHIN-AGENDA*", (SubLObject)control_vars.NIL);
        control_vars.$save_asked_queriesP$ = SubLFiles.defvar("*SAVE-ASKED-QUERIES?*", (SubLObject)control_vars.NIL);
        control_vars.$init_file_loadedP$ = SubLFiles.deflexical("*INIT-FILE-LOADED?*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym54$_INIT_FILE_LOADED__)) ? control_vars.$init_file_loadedP$.getGlobalValue() : control_vars.NIL));
        control_vars.$within_assert$ = SubLFiles.defparameter("*WITHIN-ASSERT*", (SubLObject)control_vars.NIL);
        control_vars.$within_unassert$ = SubLFiles.defparameter("*WITHIN-UNASSERT*", (SubLObject)control_vars.NIL);
        control_vars.$within_ask$ = SubLFiles.defparameter("*WITHIN-ASK*", (SubLObject)control_vars.NIL);
        control_vars.$within_query$ = SubLFiles.defparameter("*WITHIN-QUERY*", (SubLObject)control_vars.NIL);
        control_vars.$compute_inference_results$ = SubLFiles.defparameter("*COMPUTE-INFERENCE-RESULTS*", (SubLObject)control_vars.T);
        control_vars.$cache_inference_results$ = SubLFiles.defparameter("*CACHE-INFERENCE-RESULTS*", (SubLObject)control_vars.NIL);
        control_vars.$transformation_depth_cutoff$ = SubLFiles.defparameter("*TRANSFORMATION-DEPTH-CUTOFF*", (SubLObject)control_vars.NIL);
        control_vars.$lexicon_initializedP$ = SubLFiles.deflexical("*LEXICON-INITIALIZED?*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym58$_LEXICON_INITIALIZED__)) ? control_vars.$lexicon_initializedP$.getGlobalValue() : control_vars.NIL));
        control_vars.$partial_semanticsP$ = SubLFiles.defparameter("*PARTIAL-SEMANTICS?*", (SubLObject)control_vars.NIL);
        control_vars.$enforce_mass_vs_countP$ = SubLFiles.defparameter("*ENFORCE-MASS-VS-COUNT?*", (SubLObject)control_vars.T);
        control_vars.$partial_syntaxP$ = SubLFiles.defparameter("*PARTIAL-SYNTAX?*", (SubLObject)control_vars.NIL);
        control_vars.$cb_presentation_languages$ = SubLFiles.deflexical("*CB-PRESENTATION-LANGUAGES*", (SubLObject)control_vars.$list59);
        control_vars.$cb_major_presentation_language$ = SubLFiles.defparameter("*CB-MAJOR-PRESENTATION-LANGUAGE*", (SubLObject)control_vars.$kw60$CYCL);
        control_vars.$show_assertions_in_english$ = SubLFiles.defparameter("*SHOW-ASSERTIONS-IN-ENGLISH*", (SubLObject)control_vars.NIL);
        control_vars.$assume_cyc_cyclist_dialogP$ = SubLFiles.defparameter("*ASSUME-CYC-CYCLIST-DIALOG?*", (SubLObject)control_vars.T);
        control_vars.$generated_phrases_browsableP$ = SubLFiles.defparameter("*GENERATED-PHRASES-BROWSABLE?*", (SubLObject)control_vars.T);
        control_vars.$highlight_demerits_in_generated_phrasesP$ = SubLFiles.defparameter("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*", (SubLObject)control_vars.T);
        control_vars.$cb_paraphrase_mt$ = SubLFiles.defparameter("*CB-PARAPHRASE-MT*", (SubLObject)control_vars.NIL);
        control_vars.$show_fet_edit_buttonsP$ = SubLFiles.defparameter("*SHOW-FET-EDIT-BUTTONS?*", (SubLObject)control_vars.T);
        control_vars.$show_fet_create_instance_buttonsP$ = SubLFiles.defparameter("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", (SubLObject)control_vars.T);
        control_vars.$show_fet_create_spec_buttonsP$ = SubLFiles.defparameter("*SHOW-FET-CREATE-SPEC-BUTTONS?*", (SubLObject)control_vars.NIL);
        control_vars.$cb_literal_query_results_one_per_lineP$ = SubLFiles.defparameter("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", (SubLObject)control_vars.NIL);
        control_vars.$cb_skolem_applicable_relationsP$ = SubLFiles.defparameter("*CB-SKOLEM-APPLICABLE-RELATIONS?*", (SubLObject)control_vars.NIL);
        control_vars.$cb_applicable_relations_one_per_lineP$ = SubLFiles.defparameter("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", (SubLObject)control_vars.NIL);
        control_vars.$cb_paraphrase_applicable_relationsP$ = SubLFiles.defparameter("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", (SubLObject)control_vars.NIL);
        control_vars.$show_credits$ = SubLFiles.defparameter("*SHOW-CREDITS*", (SubLObject)control_vars.NIL);
        control_vars.$browse_in_meta_query_modeP$ = SubLFiles.defparameter("*BROWSE-IN-META-QUERY-MODE?*", (SubLObject)control_vars.NIL);
        control_vars.$meta_query_start_string$ = SubLFiles.defparameter("*META-QUERY-START-STRING*", (SubLObject)control_vars.NIL);
        control_vars.$current_cache$ = SubLFiles.defparameter("*CURRENT-CACHE*", (SubLObject)control_vars.NIL);
        control_vars.$rkf_mt$ = SubLFiles.defvar("*RKF-MT*", (SubLObject)control_vars.NIL);
        control_vars.$dbm_init_file_loadedP$ = SubLFiles.defparameter("*DBM-INIT-FILE-LOADED?*", (SubLObject)control_vars.NIL);
        control_vars.$dbm_cache_loading_startedP$ = SubLFiles.defparameter("*DBM-CACHE-LOADING-STARTED?*", (SubLObject)control_vars.NIL);
        control_vars.$dbm_cache_loading_finishedP$ = SubLFiles.defparameter("*DBM-CACHE-LOADING-FINISHED?*", (SubLObject)control_vars.NIL);
        control_vars.$wordnet_initializedP$ = SubLFiles.deflexical("*WORDNET-INITIALIZED?*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym78$_WORDNET_INITIALIZED__)) ? control_vars.$wordnet_initializedP$.getGlobalValue() : control_vars.NIL));
        control_vars.$use_wn_linksP$ = SubLFiles.deflexical("*USE-WN-LINKS?*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym79$_USE_WN_LINKS__)) ? control_vars.$use_wn_linksP$.getGlobalValue() : control_vars.NIL));
        control_vars.$acip_subkernel_extraction$ = SubLFiles.deflexical("*ACIP-SUBKERNEL-EXTRACTION*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym80$_ACIP_SUBKERNEL_EXTRACTION_)) ? control_vars.$acip_subkernel_extraction$.getGlobalValue() : control_vars.NIL));
        control_vars.$acip_subkernel_output_stream$ = SubLFiles.deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", (SubLObject)((control_vars.NIL != Symbols.boundp((SubLObject)control_vars.$sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_)) ? control_vars.$acip_subkernel_output_stream$.getGlobalValue() : control_vars.NIL));
        control_vars.$janus_tag$ = SubLFiles.defparameter("*JANUS-TAG*", (SubLObject)control_vars.NIL);
        control_vars.$janus_new_constants$ = SubLFiles.defparameter("*JANUS-NEW-CONSTANTS*", (SubLObject)control_vars.NIL);
        control_vars.$janus_test_case_loggingP$ = SubLFiles.defparameter("*JANUS-TEST-CASE-LOGGING?*", (SubLObject)control_vars.NIL);
        control_vars.$janus_operations$ = SubLFiles.defparameter("*JANUS-OPERATIONS*", (SubLObject)control_vars.NIL);
        control_vars.$janus_extraction_deduce_specs$ = SubLFiles.defparameter("*JANUS-EXTRACTION-DEDUCE-SPECS*", (SubLObject)control_vars.NIL);
        control_vars.$janus_within_somethingP$ = SubLFiles.defparameter("*JANUS-WITHIN-SOMETHING?*", (SubLObject)control_vars.NIL);
        control_vars.$janus_testing_deduce_specs$ = SubLFiles.defparameter("*JANUS-TESTING-DEDUCE-SPECS*", (SubLObject)control_vars.NIL);
        control_vars.$janus_test_case_runningP$ = SubLFiles.defparameter("*JANUS-TEST-CASE-RUNNING?*", (SubLObject)control_vars.NIL);
        control_vars.$ask_quirkP$ = SubLFiles.defvar("*ASK-QUIRK?*", (SubLObject)control_vars.NIL);
        control_vars.$kbq_run_query_auto_destroy_enabledP$ = SubLFiles.defparameter("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", (SubLObject)control_vars.T);
        control_vars.$kbq_run_query_non_continuable_enabledP$ = SubLFiles.defparameter("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", (SubLObject)control_vars.T);
        control_vars.$kbq_run_query_practice_modeP$ = SubLFiles.defvar("*KBQ-RUN-QUERY-PRACTICE-MODE?*", (SubLObject)control_vars.NIL);
        return (SubLObject)control_vars.NIL;
    }

    public static SubLObject setup_control_vars_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym0$_TABLE_AREA_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym1$_HL_LOCK_);
        utilities_macros.register_global_lock((SubLObject)control_vars.$sym1$_HL_LOCK_, (SubLObject)control_vars.$str2$HL_Store_Lock);
        utilities_macros.declare_control_parameter_internal((SubLObject)control_vars.$sym14$_HL_FAILURE_BACKCHAINING_, (SubLObject)control_vars.$str15$Enable_HL_predicate_backchaining, (SubLObject)control_vars.$str16$This_controls_whether_or_not_we_a, (SubLObject)control_vars.$list17);
        utilities_macros.declare_control_parameter_internal((SubLObject)control_vars.$sym18$_NEGATION_BY_FAILURE_, (SubLObject)control_vars.$str19$Enable_negation_by_failure, (SubLObject)control_vars.$str20$This_controls_whether_or_not_we_a, (SubLObject)control_vars.$list21);
        utilities_macros.declare_control_parameter_internal((SubLObject)control_vars.$sym22$_COMPLETE_EXTENT_MINIMIZATION_, (SubLObject)control_vars.$str23$Enable_complete_extent_minimizati, (SubLObject)control_vars.$str24$This_controls_whether_or_not_we_a, (SubLObject)control_vars.$list21);
        utilities_macros.declare_control_parameter_internal((SubLObject)control_vars.$sym25$_UNBOUND_RULE_BACKCHAIN_ENABLED_, (SubLObject)control_vars.$str26$Enable_unbound_predicate_rule_bac, (SubLObject)control_vars.$str27$This_controls_whether_or_not_we_a, (SubLObject)control_vars.$list17);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym37$_AUTO_INCREMENT_KB_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym43$_BUILD_KB_LOADED_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym45$_KB_LOADED_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym49$_KB_PEDIGREE_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym51$_RUN_OWN_OPERATIONS__);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym53$_COMMUNICATION_MODE_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym54$_INIT_FILE_LOADED__);
        utilities_macros.declare_control_parameter_internal((SubLObject)control_vars.$sym55$_CACHE_INFERENCE_RESULTS_, (SubLObject)control_vars.$str56$Cache_backward_query_results, (SubLObject)control_vars.$str57$This_controls_whether_the_results, (SubLObject)control_vars.$list21);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym58$_LEXICON_INITIALIZED__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym66$_ASSUME_CYC_CYCLIST_DIALOG__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym66$_ASSUME_CYC_CYCLIST_DIALOG__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym67$_GENERATED_PHRASES_BROWSABLE__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym67$_GENERATED_PHRASES_BROWSABLE__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym69$_CB_PARAPHRASE_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym69$_CB_PARAPHRASE_MT_);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym70$_SHOW_FET_EDIT_BUTTONS__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym70$_SHOW_FET_EDIT_BUTTONS__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
        utilities_macros.register_html_interface_variable((SubLObject)control_vars.$sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__);
        utilities_macros.register_html_state_variable((SubLObject)control_vars.$sym77$_BROWSE_IN_META_QUERY_MODE__);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym78$_WORDNET_INITIALIZED__);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym79$_USE_WN_LINKS__);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym80$_ACIP_SUBKERNEL_EXTRACTION_);
        subl_macro_promotions.declare_defglobal((SubLObject)control_vars.$sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_);
        return (SubLObject)control_vars.NIL;
    }

    public void declareFunctions() {
        declare_control_vars_file();
    }

    public void initializeVariables() {
        init_control_vars_file();
    }

    public void runTopLevelForms() {
        setup_control_vars_file();
    }

    static {
        me = (SubLFile)new control_vars();
        control_vars.$read_require_constant_exists$ = null;
        control_vars.$table_area$ = null;
        control_vars.$hl_lock$ = null;
        control_vars.$bootstrapping_kbP$ = null;
        control_vars.$keyword_package$ = null;
        control_vars.$sublisp_package$ = null;
        control_vars.$cyc_package$ = null;
        control_vars.$cnf_matching_predicate$ = null;
        control_vars.$gaf_matching_predicate$ = null;
        control_vars.$nat_matching_predicate$ = null;
        control_vars.$candidate_assertion$ = null;
        control_vars.$variable_names$ = null;
        control_vars.$assertion_truth$ = null;
        control_vars.$mapping_answer$ = null;
        control_vars.$mapping_pred$ = null;
        control_vars.$mapping_source$ = null;
        control_vars.$mapping_target$ = null;
        control_vars.$mapping_target_arg$ = null;
        control_vars.$mapping_index_arg$ = null;
        control_vars.$mapping_gather_arg$ = null;
        control_vars.$mapping_gather_args$ = null;
        control_vars.$mapping_output_stream$ = null;
        control_vars.$mapping_equality_test$ = null;
        control_vars.$mapping_any_answerP$ = null;
        control_vars.$mapping_relation$ = null;
        control_vars.$mapping_finished_fn$ = null;
        control_vars.$mapping_path$ = null;
        control_vars.$mapping_data_1$ = null;
        control_vars.$mapping_data_2$ = null;
        control_vars.$mapping_pivot_arg$ = null;
        control_vars.$mapping_gather_key$ = null;
        control_vars.$mapping_gather_key_args$ = null;
        control_vars.$mapping_assertion_selection_fn$ = null;
        control_vars.$mapping_assertion_bookkeeping_fn$ = null;
        control_vars.$mapping_fn$ = null;
        control_vars.$mapping_fn_arg$ = null;
        control_vars.$mapping_fn_arg1$ = null;
        control_vars.$mapping_fn_arg2$ = null;
        control_vars.$mapping_fn_arg3$ = null;
        control_vars.$mapping_fn_arg4$ = null;
        control_vars.$mapping_fn_arg5$ = null;
        control_vars.$mapping_fn_arg6$ = null;
        control_vars.$mapping_fn_arg7$ = null;
        control_vars.$mapping_fn_arg8$ = null;
        control_vars.$kba_pred$ = null;
        control_vars.$standard_indent_string$ = null;
        control_vars.$term_functional_complexity_cutoff$ = null;
        control_vars.$term_relational_complexity_cutoff$ = null;
        control_vars.$collect_justification_compilationsP$ = null;
        control_vars.$justification_compilations$ = null;
        control_vars.$ebl_trace$ = null;
        control_vars.$allow_forward_skolemization$ = null;
        control_vars.$prefer_forward_skolemization$ = null;
        control_vars.$perform_unification_occurs_check$ = null;
        control_vars.$perform_equals_unification$ = null;
        control_vars.$allow_backward_gafs$ = null;
        control_vars.$cached_ask_result_direction$ = null;
        control_vars.$check_for_circular_justs$ = null;
        control_vars.$filter_deductions_for_trivially_derivable_gafs$ = null;
        control_vars.$inference_debugP$ = null;
        control_vars.$inference_trace_level$ = null;
        control_vars.$browse_forward_inferencesP$ = null;
        control_vars.$query_properties_inherited_by_recursive_queries$ = null;
        control_vars.$proof_checking_enabled$ = null;
        control_vars.$proof_checker_rules$ = null;
        control_vars.$inference_propagate_mt_scope$ = null;
        control_vars.$inference_current_node_mt_scope$ = null;
        control_vars.$inference_literal$ = null;
        control_vars.$inference_sense$ = null;
        control_vars.$inference_arg$ = null;
        control_vars.$inference_more_supports$ = null;
        control_vars.$inference_highly_relevant_assertions$ = null;
        control_vars.$inference_highly_relevant_mts$ = null;
        control_vars.$within_hl_failure_backchainingP$ = null;
        control_vars.$hl_failure_backchaining$ = null;
        control_vars.$evaluatable_backchain_enabled$ = null;
        control_vars.$negation_by_failure$ = null;
        control_vars.$complete_extent_minimization$ = null;
        control_vars.$unbound_rule_backchain_enabled$ = null;
        control_vars.$default_removal_cost_cutoff$ = null;
        control_vars.$removal_cost_cutoff$ = null;
        control_vars.$forward_inference_removal_cost_cutoff$ = null;
        control_vars.$application_filtering_enabled$ = null;
        control_vars.$marking_doomed_inference_ancestors$ = null;
        control_vars.$inference_search_strategy$ = null;
        control_vars.$unique_inference_result_bindings$ = null;
        control_vars.$inference_answer_handler$ = null;
        control_vars.$hl_module_simplification_cost$ = null;
        control_vars.$hl_module_check_cost$ = null;
        control_vars.$cheap_hl_module_check_cost$ = null;
        control_vars.$typical_hl_module_check_cost$ = null;
        control_vars.$expensive_hl_module_check_cost$ = null;
        control_vars.$expensive_hl_module_singleton_generate_cost$ = null;
        control_vars.$maximum_hl_module_check_cost$ = null;
        control_vars.$average_all_isa_count$ = null;
        control_vars.$average_all_genls_count$ = null;
        control_vars.$pgia_activeP$ = null;
        control_vars.$the_term_inference_enabled$ = null;
        control_vars.$allow_the_term_unification$ = null;
        control_vars.$inference_the_term_bindings$ = null;
        control_vars.$the_term_qua_constant$ = null;
        control_vars.$external_inference_enabled$ = null;
        control_vars.$suppress_conflict_noticesP$ = null;
        control_vars.$ignore_conflictsP$ = null;
        control_vars.$ignore_non_definitional_conflictsP$ = null;
        control_vars.$conflicts_from_invalid_deductions$ = null;
        control_vars.$record_inconsistent_support_sets$ = null;
        control_vars.$last_agenda_op$ = null;
        control_vars.$last_agenda_error_message$ = null;
        control_vars.$last_agenda_error_explanatory_supports$ = null;
        control_vars.$agenda_display_fi_warnings$ = null;
        control_vars.$ignore_remote_errors$ = null;
        control_vars.$auto_increment_kb$ = null;
        control_vars.$load_submitted_transcriptsP$ = null;
        control_vars.$send_submitted_transcript_loading_noticesP$ = null;
        control_vars.$cyc_image_id$ = null;
        control_vars.$use_tcp_port_in_image_id$ = null;
        control_vars.$build_kb_loaded$ = null;
        control_vars.$kb_loaded$ = null;
        control_vars.$kb_pedigree$ = null;
        control_vars.$use_transcriptP$ = null;
        control_vars.$run_own_operationsP$ = null;
        control_vars.$caught_up_on_master_transcript$ = null;
        control_vars.$communication_mode$ = null;
        control_vars.$unencapsulating_within_agenda$ = null;
        control_vars.$save_asked_queriesP$ = null;
        control_vars.$init_file_loadedP$ = null;
        control_vars.$within_assert$ = null;
        control_vars.$within_unassert$ = null;
        control_vars.$within_ask$ = null;
        control_vars.$within_query$ = null;
        control_vars.$compute_inference_results$ = null;
        control_vars.$cache_inference_results$ = null;
        control_vars.$transformation_depth_cutoff$ = null;
        control_vars.$lexicon_initializedP$ = null;
        control_vars.$partial_semanticsP$ = null;
        control_vars.$enforce_mass_vs_countP$ = null;
        control_vars.$partial_syntaxP$ = null;
        control_vars.$cb_presentation_languages$ = null;
        control_vars.$cb_major_presentation_language$ = null;
        control_vars.$show_assertions_in_english$ = null;
        control_vars.$assume_cyc_cyclist_dialogP$ = null;
        control_vars.$generated_phrases_browsableP$ = null;
        control_vars.$highlight_demerits_in_generated_phrasesP$ = null;
        control_vars.$cb_paraphrase_mt$ = null;
        control_vars.$show_fet_edit_buttonsP$ = null;
        control_vars.$show_fet_create_instance_buttonsP$ = null;
        control_vars.$show_fet_create_spec_buttonsP$ = null;
        control_vars.$cb_literal_query_results_one_per_lineP$ = null;
        control_vars.$cb_skolem_applicable_relationsP$ = null;
        control_vars.$cb_applicable_relations_one_per_lineP$ = null;
        control_vars.$cb_paraphrase_applicable_relationsP$ = null;
        control_vars.$show_credits$ = null;
        control_vars.$browse_in_meta_query_modeP$ = null;
        control_vars.$meta_query_start_string$ = null;
        control_vars.$current_cache$ = null;
        control_vars.$rkf_mt$ = null;
        control_vars.$dbm_init_file_loadedP$ = null;
        control_vars.$dbm_cache_loading_startedP$ = null;
        control_vars.$dbm_cache_loading_finishedP$ = null;
        control_vars.$wordnet_initializedP$ = null;
        control_vars.$use_wn_linksP$ = null;
        control_vars.$acip_subkernel_extraction$ = null;
        control_vars.$acip_subkernel_output_stream$ = null;
        control_vars.$janus_tag$ = null;
        control_vars.$janus_new_constants$ = null;
        control_vars.$janus_test_case_loggingP$ = null;
        control_vars.$janus_operations$ = null;
        control_vars.$janus_extraction_deduce_specs$ = null;
        control_vars.$janus_within_somethingP$ = null;
        control_vars.$janus_testing_deduce_specs$ = null;
        control_vars.$janus_test_case_runningP$ = null;
        control_vars.$ask_quirkP$ = null;
        control_vars.$kbq_run_query_auto_destroy_enabledP$ = null;
        control_vars.$kbq_run_query_non_continuable_enabledP$ = null;
        control_vars.$kbq_run_query_practice_modeP$ = null;
        $sym0$_TABLE_AREA_ = SubLObjectFactory.makeSymbol("*TABLE-AREA*");
        $sym1$_HL_LOCK_ = SubLObjectFactory.makeSymbol("*HL-LOCK*");
        $str2$HL_Store_Lock = SubLObjectFactory.makeString("HL Store Lock");
        $sym3$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HL-LOCK*"));
        $str5$KEYWORD = SubLObjectFactory.makeString("KEYWORD");
        $str6$SUBLISP = SubLObjectFactory.makeString("SUBLISP");
        $str7$CYC = SubLObjectFactory.makeString("CYC");
        $sym8$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $str9$Symbol__S_from_package__S_is_not_ = SubLObjectFactory.makeString("Symbol ~S from package ~S is not visible to SubL.");
        $kw10$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str11$_ = SubLObjectFactory.makeString(" ");
        $kw12$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
        $sym14$_HL_FAILURE_BACKCHAINING_ = SubLObjectFactory.makeSymbol("*HL-FAILURE-BACKCHAINING*");
        $str15$Enable_HL_predicate_backchaining = SubLObjectFactory.makeString("Enable HL predicate backchaining");
        $str16$This_controls_whether_or_not_we_a = SubLObjectFactory.makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)control_vars.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)control_vars.T, (SubLObject)SubLObjectFactory.makeString("Yes (expensive)")));
        $sym18$_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("*NEGATION-BY-FAILURE*");
        $str19$Enable_negation_by_failure = SubLObjectFactory.makeString("Enable negation by failure");
        $str20$This_controls_whether_or_not_we_a = SubLObjectFactory.makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)control_vars.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)control_vars.T, (SubLObject)SubLObjectFactory.makeString("Yes")));
        $sym22$_COMPLETE_EXTENT_MINIMIZATION_ = SubLObjectFactory.makeSymbol("*COMPLETE-EXTENT-MINIMIZATION*");
        $str23$Enable_complete_extent_minimizati = SubLObjectFactory.makeString("Enable complete extent minimization");
        $str24$This_controls_whether_or_not_we_a = SubLObjectFactory.makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");
        $sym25$_UNBOUND_RULE_BACKCHAIN_ENABLED_ = SubLObjectFactory.makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*");
        $str26$Enable_unbound_predicate_rule_bac = SubLObjectFactory.makeString("Enable unbound predicate rule backchaining");
        $str27$This_controls_whether_or_not_we_a = SubLObjectFactory.makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");
        $int28$100000 = SubLObjectFactory.makeInteger(100000);
        $kw29$HEURISTIC = SubLObjectFactory.makeKeyword("HEURISTIC");
        $sym30$INFERENCE_RETURN_BLISTS = SubLObjectFactory.makeSymbol("INFERENCE-RETURN-BLISTS");
        $float31$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $float32$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $float33$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $float34$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $int35$38 = SubLObjectFactory.makeInteger(38);
        $int36$47 = SubLObjectFactory.makeInteger(47);
        $sym37$_AUTO_INCREMENT_KB_ = SubLObjectFactory.makeSymbol("*AUTO-INCREMENT-KB*");
        $sym38$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $str39$UNKNOWN = SubLObjectFactory.makeString("UNKNOWN");
        $str40$_ = SubLObjectFactory.makeString("-");
        $str41$ = SubLObjectFactory.makeString("");
        $str42$_a__a_a__a = SubLObjectFactory.makeString("~a-~a~a-~a");
        $sym43$_BUILD_KB_LOADED_ = SubLObjectFactory.makeSymbol("*BUILD-KB-LOADED*");
        $sym44$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym45$_KB_LOADED_ = SubLObjectFactory.makeSymbol("*KB-LOADED*");
        $int46$10000 = SubLObjectFactory.makeInteger(10000);
        $kw47$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw48$TINY = SubLObjectFactory.makeKeyword("TINY");
        $sym49$_KB_PEDIGREE_ = SubLObjectFactory.makeSymbol("*KB-PEDIGREE*");
        $kw50$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $sym51$_RUN_OWN_OPERATIONS__ = SubLObjectFactory.makeSymbol("*RUN-OWN-OPERATIONS?*");
        $sym52$_CAUGHT_UP_ON_MASTER_TRANSCRIPT_ = SubLObjectFactory.makeSymbol("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*");
        $sym53$_COMMUNICATION_MODE_ = SubLObjectFactory.makeSymbol("*COMMUNICATION-MODE*");
        $sym54$_INIT_FILE_LOADED__ = SubLObjectFactory.makeSymbol("*INIT-FILE-LOADED?*");
        $sym55$_CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeSymbol("*CACHE-INFERENCE-RESULTS*");
        $str56$Cache_backward_query_results = SubLObjectFactory.makeString("Cache backward query results");
        $str57$This_controls_whether_the_results = SubLObjectFactory.makeString("This controls whether the results of successful backward queries are cached in the KB.");
        $sym58$_LEXICON_INITIALIZED__ = SubLObjectFactory.makeSymbol("*LEXICON-INITIALIZED?*");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("NL"), (SubLObject)SubLObjectFactory.makeKeyword("FOL"), (SubLObject)SubLObjectFactory.makeKeyword("SILK"));
        $kw60$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $sym61$_CB_MAJOR_PRESENTATION_LANGUAGE_ = SubLObjectFactory.makeSymbol("*CB-MAJOR-PRESENTATION-LANGUAGE*");
        $kw62$CYC_HALO = SubLObjectFactory.makeKeyword("CYC-HALO");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-HALO"), (SubLObject)control_vars.T), (SubLObject)ConsesLow.list((SubLObject)control_vars.EQ, (SubLObject)SubLObjectFactory.makeKeyword("SILK"), (SubLObject)SubLObjectFactory.makeSymbol("*CB-MAJOR-PRESENTATION-LANGUAGE*")));
        $sym64$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-SILK-PRESENTATION-LANGUAGE?"));
        $sym66$_ASSUME_CYC_CYCLIST_DIALOG__ = SubLObjectFactory.makeSymbol("*ASSUME-CYC-CYCLIST-DIALOG?*");
        $sym67$_GENERATED_PHRASES_BROWSABLE__ = SubLObjectFactory.makeSymbol("*GENERATED-PHRASES-BROWSABLE?*");
        $sym68$_HIGHLIGHT_DEMERITS_IN_GENERATED_PHRASES__ = SubLObjectFactory.makeSymbol("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*");
        $sym69$_CB_PARAPHRASE_MT_ = SubLObjectFactory.makeSymbol("*CB-PARAPHRASE-MT*");
        $sym70$_SHOW_FET_EDIT_BUTTONS__ = SubLObjectFactory.makeSymbol("*SHOW-FET-EDIT-BUTTONS?*");
        $sym71$_SHOW_FET_CREATE_INSTANCE_BUTTONS__ = SubLObjectFactory.makeSymbol("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*");
        $sym72$_SHOW_FET_CREATE_SPEC_BUTTONS__ = SubLObjectFactory.makeSymbol("*SHOW-FET-CREATE-SPEC-BUTTONS?*");
        $sym73$_CB_LITERAL_QUERY_RESULTS_ONE_PER_LINE__ = SubLObjectFactory.makeSymbol("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*");
        $sym74$_CB_SKOLEM_APPLICABLE_RELATIONS__ = SubLObjectFactory.makeSymbol("*CB-SKOLEM-APPLICABLE-RELATIONS?*");
        $sym75$_CB_APPLICABLE_RELATIONS_ONE_PER_LINE__ = SubLObjectFactory.makeSymbol("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*");
        $sym76$_CB_PARAPHRASE_APPLICABLE_RELATIONS__ = SubLObjectFactory.makeSymbol("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*");
        $sym77$_BROWSE_IN_META_QUERY_MODE__ = SubLObjectFactory.makeSymbol("*BROWSE-IN-META-QUERY-MODE?*");
        $sym78$_WORDNET_INITIALIZED__ = SubLObjectFactory.makeSymbol("*WORDNET-INITIALIZED?*");
        $sym79$_USE_WN_LINKS__ = SubLObjectFactory.makeSymbol("*USE-WN-LINKS?*");
        $sym80$_ACIP_SUBKERNEL_EXTRACTION_ = SubLObjectFactory.makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*");
        $sym81$_ACIP_SUBKERNEL_OUTPUT_STREAM_ = SubLObjectFactory.makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*");
    }
}

/*

	Total time: 366 ms
	 synthetic
*/
