package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_vars";
  public static final String myFingerPrint = "36761239c690e1826b8b4187d1756f8a9b78e4ee2667d23ff45b5829c3bbfab7";
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 824L)
  public static SubLSymbol $use_parenthetical_disambiguationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1066L)
  public static SubLSymbol $pph_ambiguous_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1292L)
  public static SubLSymbol $pph_use_bulleted_listsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1388L)
  public static SubLSymbol $pph_use_bulleted_lists_min_level$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1532L)
  public static SubLSymbol $pph_replace_bulleted_list_tagsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1683L)
  public static SubLSymbol $pph_italicize_variables_in_html_modeP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1822L)
  public static SubLSymbol $pph_italicize_skolems_in_html_modeP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 1957L)
  public static SubLSymbol $pph_citation_format$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 2064L)
  public static SubLSymbol $pph_html_tags_added_by_system$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 2640L)
  public static SubLSymbol $pph_use_indexical_datesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 2769L)
  public static SubLSymbol $select_string_methods_to_omit$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 2898L)
  public static SubLSymbol $pph_guess_names_for_unlexified_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 2963L)
  public static SubLSymbol $pph_coerce_definite_descriptions_for_unlexified_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 3047L)
  public static SubLSymbol $pph_introduce_anaphorsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 3098L)
  public static SubLSymbol $pph_blanks_for_varsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 3362L)
  public static SubLSymbol $pph_alternative_phrase_generation_level$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 4208L)
  public static SubLSymbol $pph_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 4818L)
  public static SubLSymbol $pph_use_rdfP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 4950L)
  public static SubLSymbol $paraphrase_precision$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 5266L)
  public static SubLSymbol $pph_terse_modeP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 5360L)
  public static SubLSymbol $pph_terse_mt_scopeP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 5523L)
  public static SubLSymbol $pph_use_explicit_temporal_qualification_for_defaultP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 5750L)
  public static SubLSymbol $pph_explicit_temporal_qualification_for_current_factsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 5930L)
  public static SubLSymbol $definite_description_licensed_terms$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6194L)
  public static SubLSymbol $paraphrase_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6286L)
  public static SubLSymbol $pph_language_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6382L)
  public static SubLSymbol $allow_pph_language_mt_broadeningP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6589L)
  public static SubLSymbol $pph_domain_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6816L)
  public static SubLSymbol $pph_term_paraphrase_map$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 7006L)
  public static SubLSymbol $pph_term_paraphrase_blacklist$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 7623L)
  public static SubLSymbol $pph_lexical_assertion_blacklist$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 7995L)
  public static SubLSymbol $pph_basic_var_types$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 8300L)
  public static SubLSymbol $pph_use_basic_var_typesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 8357L)
  public static SubLSymbol $determiners_before_variables$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 8497L)
  public static SubLSymbol $pph_suppressed_final_punctuation_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 8637L)
  public static SubLSymbol $pph_use_expansions_for_precisionP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 8776L)
  public static SubLSymbol $pph_reduce_conjunctionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 8900L)
  public static SubLSymbol $pph_query_antecedents_are_hypothesizedP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9109L)
  public static SubLSymbol $pph_handle_hypotheticalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9305L)
  public static SubLSymbol $pph_use_title_capitalizationP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9435L)
  public static SubLSymbol $pph_expand_e_notation_for_floatsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9548L)
  public static SubLSymbol $pph_quantify_varsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9712L)
  public static SubLSymbol $pph_hide_explicit_universalsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9827L)
  public static SubLSymbol $pph_hypothetical_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 9942L)
  public static SubLSymbol $pph_use_smart_variable_replacementP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 10207L)
  public static SubLSymbol $pph_search_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 10452L)
  public static SubLSymbol $register_vars_by_arg_constraintsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 10516L)
  public static SubLSymbol $pph_register_exception_vars_recursivelyP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 10655L)
  public static SubLSymbol $pph_addressee$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 10819L)
  public static SubLSymbol $pph_speaker$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 10979L)
  public static SubLSymbol $pph_use_online_string_frequenciesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 11110L)
  public static SubLSymbol $pph_ceteris_paribus_choice_method$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 11310L)
  public static SubLSymbol $pph_top_level_demerits$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 11488L)
  public static SubLSymbol $pph_demerit_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 11825L)
  public static SubLSymbol $pph_suggested_demerit_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 12445L)
  public static SubLSymbol $pph_allow_word_form_coercionP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 12570L)
  public static SubLSymbol $pph_max_no_comma_length$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 12790L)
  public static SubLSymbol $pph_significant_digits_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 12964L)
  public static SubLSymbol $pph_show_type_level_violationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13094L)
  public static SubLSymbol $pph_type_level_violations$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13152L)
  public static SubLSymbol $pph_name_string_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13206L)
  public static SubLSymbol $pph_irrelevant_warnP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13324L)
  public static SubLSymbol $pph_inference_answer$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13472L)
  public static SubLSymbol $pph_paraphrase_to_justify$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13542L)
  public static SubLSymbol $constant_link_function$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13777L)
  public static SubLSymbol $allow_utf8_in_pph_text_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 13969L)
  public static SubLSymbol $pph_use_salient_urlP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 14082L)
  public static SubLSymbol $html_generation_target$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 14208L)
  public static SubLSymbol $html_generation_term_id_function$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 14445L)
  public static SubLSymbol $pph_deprecate_old_source_citation_formatP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 14629L)
  public static SubLSymbol $pph_link_arg0P$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 14759L)
  public static SubLSymbol $pph_link_unlinked_phrases_to_matrix_arg0P$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15016L)
  public static SubLSymbol $pph_maximize_linksP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15283L)
  public static SubLSymbol $pph_consolidate_output_list_for_natP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15529L)
  public static SubLSymbol $pph_consolidate_javalistsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15782L)
  public static SubLSymbol $pph_use_showXhideP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15828L)
  public static SubLSymbol $rkf_use_cycl_for_unlexified_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15953L)
  public static SubLSymbol $pph_use_cb_uia_display_methodsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 16091L)
  public static SubLSymbol $rkf_prefer_nouns_for_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 16217L)
  public static SubLSymbol $rkf_use_genl_preds_for_paraphraseP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 16358L)
  private static SubLSymbol $pph_control_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 18216L)
  private static SubLSymbol $pph_max_param_records$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 18306L)
  public static SubLSymbol $pph_latest_parameters$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 19952L)
  private static SubLSymbol $pph_quantifiers$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 20258L)
  public static SubLSymbol $pph_operator_scope_context$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21208L)
  public static SubLSymbol $pph_blank_string$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21372L)
  public static SubLSymbol $gen_template_store_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21460L)
  public static SubLSymbol $last_pph_sentence$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21579L)
  public static SubLSymbol $pph_phrase_fns$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21665L)
  public static SubLSymbol $pph_data_structures_code_revision$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21838L)
  public static SubLSymbol $pph_cycls$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22213L)
  public static SubLSymbol $pph_root_phrase$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22273L)
  public static SubLSymbol $bypass_pph_phrase_destroyerP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22332L)
  public static SubLSymbol $pph_discourse_context$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22512L)
  public static SubLSymbol $pph_track_discourse_referentsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22699L)
  public static SubLSymbol $pph_var_types$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22900L)
  public static SubLSymbol $pph_noted_var_types$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 23041L)
  public static SubLSymbol $pph_possibly_binding_variables_counter$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 23110L)
  public static SubLSymbol $pph_use_wh_for_query_varsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 23227L)
  public static SubLSymbol $pph_unexpressed_negations$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 24446L)
  public static SubLSymbol $pph_allow_contractionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 24686L)
  public static SubLSymbol $pph_use_whomP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 24795L)
  public static SubLSymbol $pph_capitalize_false_stringP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 24937L)
  public static SubLSymbol $pph_keep_generic_argsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25051L)
  public static SubLSymbol $pph_resolve_bindings_phrasesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25154L)
  public static SubLSymbol $verbose_print_pph_phrasesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25309L)
  public static SubLSymbol $pph_formula_for_generic_arg_replacement$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25390L)
  public static SubLSymbol $generation_level$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25696L)
  public static SubLSymbol $pph_current_arg0_position$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25836L)
  public static SubLSymbol $pph_current_arg0$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25975L)
  public static SubLSymbol $pph_problem_reporting_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26182L)
  public static SubLSymbol $pph_problem_reports$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26352L)
  public static SubLSymbol $pph_retain_original_relative_targetsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26572L)
  public static SubLSymbol $meter_pph_queriesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26623L)
  public static SubLSymbol $meter_pph_gaf_paraphraseP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26680L)
  public static SubLSymbol $retain_pph_queriesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26945L)
  private static SubLSymbol $warn_about_pph_query_retention_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 27125L)
  public static SubLSymbol $pph_error_on_bad_templatesP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 27297L)
  public static SubLSymbol $pph_bad_template_dummy$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 27507L)
  public static SubLSymbol $pph_non_explanatory_proofs$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 27708L)
  public static SubLSymbol $pph_show_meta_supports_with_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 27839L)
  public static SubLSymbol $pph_show_assert_info_with_assertionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 27968L)
  public static SubLSymbol $pph_proof_show_facts_usedP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 28098L)
  public static SubLSymbol $pph_proof_show_facts_depth_cutoff$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 28265L)
  public static SubLSymbol $pph_proof_include_phrase_linksP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 28372L)
  public static SubLSymbol $pph_show_trivial_proofsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 28522L)
  public static SubLSymbol $pph_repositioned_proofs$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 28680L)
  public static SubLSymbol $pph_displayed_proofs$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 28844L)
  public static SubLSymbol $pph_justified_proofs$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29006L)
  public static SubLSymbol $pph_displayed_supports$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29171L)
  public static SubLSymbol $rules_used_in_quasi_transformation_proofs$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29307L)
  public static SubLSymbol $pph_proof_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29353L)
  public static SubLSymbol $pph_top_level_proof_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29469L)
  public static SubLSymbol $validate_proof_supportsP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 30683L)
  public static SubLSymbol $pph_phrase_methods$;
  private static final SubLSymbol $kw0$WHEN_NECESSARY;
  private static final SubLSymbol $kw1$SUPERSCRIPTS;
  private static final SubLString $str2$_a_;
  private static final SubLString $str3$_a_;
  private static final SubLSymbol $kw4$NONE;
  private static final SubLSymbol $kw5$TOP_LEVEL_ONLY;
  private static final SubLSymbol $kw6$ALL;
  private static final SubLSymbol $sym7$_PPH_TERSE_MODE__;
  private static final SubLSymbol $kw8$HTML;
  private static final SubLObject $const9$ParaphraseLanguageMt;
  private static final SubLSymbol $sym10$PPH_LANGUAGE_MT;
  private static final SubLObject $const11$ParaphraseDomainMt;
  private static final SubLSymbol $sym12$PPH_DOMAIN_MT;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$UNKNOWN;
  private static final SubLSymbol $kw15$ARBITRARY;
  private static final SubLString $str16$Too_many_demerits___S;
  private static final SubLSymbol $sym17$CB_CF;
  private static final SubLSymbol $sym18$_CONSTANT_LINK_FUNCTION_;
  private static final SubLSymbol $sym19$_ALLOW_UTF8_IN_PPH_TEXT_MODE_;
  private static final SubLSymbol $sym20$_PPH_USE_SALIENT_URL__;
  private static final SubLString $str21$_self;
  private static final SubLSymbol $sym22$_HTML_GENERATION_TARGET_;
  private static final SubLSymbol $sym23$GET_TERM_ID;
  private static final SubLSymbol $sym24$_HTML_GENERATION_TERM_ID_FUNCTION_;
  private static final SubLSymbol $sym25$_PPH_DEPRECATE_OLD_SOURCE_CITATION_FORMAT__;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$BOUNDP;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$PROGN;
  private static final SubLSymbol $sym32$PPH_CHECK_TYPE;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$CLET;
  private static final SubLSymbol $sym35$_PPH_OPERATOR_SCOPE_CONTEXT_;
  private static final SubLSymbol $sym36$CONS;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$PPH_NOTE;
  private static final SubLString $str39$Inside_operator_scope__S;
  private static final SubLString $str40$Leaving_operator_scope__S;
  private static final SubLSymbol $kw41$NO;
  private static final SubLSymbol $kw42$IMPLIES;
  private static final SubLString $str43$______;
  private static final SubLString $str44$Gen_Template_Store_Lock;
  private static final SubLSymbol $sym45$_PPH_DATA_STRUCTURES_CODE_REVISION_;
  private static final SubLSymbol $kw46$UNKNOWN_SOURCE;
  private static final SubLString $str47$Noting_unexpressed_negation_from_;
  private static final SubLString $str48$Assuming_we_just_expressed_the_ne;
  private static final SubLString $str49$Supposedly_expressed_negation_of_;
  private static final SubLSymbol $kw50$UNSPECIFIED;
  private static final SubLList $list51;
  private static final SubLSymbol $kw52$OFF;
  private static final SubLSymbol $kw53$NOT_GATHERING;
  private static final SubLSymbol $sym54$WARN_ABOUT_PPH_QUERY_RETENTION;
  private static final SubLString $str55$Retain_PPH_queries_is__S_for__S;
  private static final SubLSymbol $sym56$_WARN_ABOUT_PPH_QUERY_RETENTION_CACHING_STATE_;
  private static final SubLSymbol $kw57$PPH_BAD_TEMPLATE_DUMMY;
  private static final SubLSymbol $kw58$UNINITIALIZED;
  private static final SubLSymbol $kw59$INITIALIZED;
  private static final SubLString $str60$_PPH_error_level_;
  private static final SubLString $str61$__;
  private static final SubLString $str62$No_KB_loaded__Couldn_t_initialize;
  private static final SubLSymbol $kw63$NO_KB_LOADED;
  private static final SubLList $list64;
  private static final SubLObject $const65$MtUnionFn;
  private static final SubLObject $const66$MtSpace;
  private static final SubLList $list67;

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 3780L)
  public static SubLObject pph_generate_alternative_phrasesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw4$NONE != $pph_alternative_phrase_generation_level$.getDynamicValue( thread ) && ( $kw5$TOP_LEVEL_ONLY != $pph_alternative_phrase_generation_level$.getDynamicValue( thread )
        || NIL != pph_at_top_levelP() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 4127L)
  public static SubLObject pph_at_top_levelP()
  {
    return Numbers.numLE( current_generation_level(), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 4319L)
  public static SubLObject pph_generate_morphological_alternativesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( $kw6$ALL, $pph_alternative_phrase_generation_level$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 4523L)
  public static SubLObject pph_generate_nested_alternativesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $kw4$NONE != $pph_alternative_phrase_generation_level$.getDynamicValue( thread ) && $kw5$TOP_LEVEL_ONLY != $pph_alternative_phrase_generation_level$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6058L)
  public static SubLObject definite_description_licensed_for_termP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( v_term, $definite_description_licensed_terms$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6446L)
  public static SubLObject pph_language_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $pph_language_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 6681L)
  public static SubLObject pph_domain_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $pph_domain_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 7211L)
  public static SubLObject pph_blacklist_active_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Types.consp( $pph_term_paraphrase_blacklist$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 7305L)
  public static SubLObject pph_forbidden_string_for_termP(final SubLObject v_term, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != list_utilities.alist_p( $pph_term_paraphrase_blacklist$.getDynamicValue( thread ) ) && NIL != pph_phrase.pph_known_cycl_p( v_term ) && NIL != conses_high.member( string, list_utilities
        .alist_lookup( $pph_term_paraphrase_blacklist$.getDynamicValue( thread ), v_term, Symbols.symbol_function( EQUAL ), NIL ), Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 7756L)
  public static SubLObject pph_forbidden_lexical_assertionP(final SubLObject lexical_assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != list_utilities.member_eqP( lexical_assertion, $pph_lexical_assertion_blacklist$.getDynamicValue( thread ) ) || NIL != lexicon_accessors.inappropriate_lexical_assertionP(
        lexical_assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 11952L)
  public static SubLObject pph_failure_is_an_option_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return number_utilities.potentially_infinite_number_L( $pph_demerit_cutoff$.getDynamicValue( thread ), number_utilities.positive_infinity() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 12148L)
  public static SubLObject pph_too_many_demerits_p(final SubLObject demerits, SubLObject cutoff)
  {
    if( cutoff == UNPROVIDED )
    {
      cutoff = $pph_demerit_cutoff$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject too_manyP = number_utilities.potentially_infinite_number_G( demerits, cutoff );
    if( NIL != too_manyP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str16$Too_many_demerits___S, demerits );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return too_manyP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 14889L)
  public static SubLObject pph_link_unlinked_phrases_to_matrix_arg0P()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $pph_link_unlinked_phrases_to_matrix_arg0P$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 15201L)
  public static SubLObject pph_maximize_linksP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $pph_maximize_linksP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 18444L)
  public static SubLObject pph_current_parameters(SubLObject check_latestP)
  {
    if( check_latestP == UNPROVIDED )
    {
      check_latestP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != check_latestP )
    {
      SubLObject cdolist_list_var = $pph_latest_parameters$.getDynamicValue( thread );
      SubLObject record = NIL;
      record = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != pph_params_currentP( record ) )
        {
          $pph_latest_parameters$.setDynamicValue( list_utilities.nmove_to_front( record, $pph_latest_parameters$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ) ), thread );
          return record;
        }
        cdolist_list_var = cdolist_list_var.rest();
        record = cdolist_list_var.first();
      }
    }
    return pph_new_parameter_snapshot();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 18910L)
  public static SubLObject pph_new_parameter_snapshot()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject params = list_utilities.remove_if_not( Symbols.symbol_function( $sym27$BOUNDP ), $pph_control_parameters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = params;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject value = pph_param_value( param );
      ans = ConsesLow.cons( ConsesLow.list( param, value ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    if( NIL == subl_promotions.memberP( ans, $pph_latest_parameters$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      $pph_latest_parameters$.setDynamicValue( ConsesLow.cons( ans, $pph_latest_parameters$.getDynamicValue( thread ) ), thread );
      if( NIL != list_utilities.lengthG( $pph_latest_parameters$.getDynamicValue( thread ), $pph_max_param_records$.getGlobalValue(), UNPROVIDED ) )
      {
        $pph_latest_parameters$.setDynamicValue( list_utilities.first_n( $pph_max_param_records$.getGlobalValue(), $pph_latest_parameters$.getDynamicValue( thread ) ), thread );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 19507L)
  public static SubLObject pph_params_currentP(final SubLObject record)
  {
    SubLObject mismatchP = NIL;
    if( NIL == mismatchP )
    {
      SubLObject csome_list_var = record;
      SubLObject pair = NIL;
      pair = csome_list_var.first();
      while ( NIL == mismatchP && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = pair;
        SubLObject param = NIL;
        SubLObject latest_value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
        param = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
        latest_value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject current_value = pph_param_value( param );
          if( !latest_value.equal( current_value ) )
          {
            mismatchP = T;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
        }
        csome_list_var = csome_list_var.rest();
        pair = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == mismatchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 19881L)
  public static SubLObject pph_param_value(final SubLObject param)
  {
    return Symbols.symbol_value( param );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 20095L)
  public static SubLObject pph_quantifier_keyword_p(final SubLObject obj)
  {
    return subl_promotions.memberP( obj, $pph_quantifiers$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 20185L)
  public static SubLObject pph_quantifier_keywords()
  {
    return $pph_quantifiers$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 20316L)
  public static SubLObject with_pph_operator_scope(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject scope_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    scope_type = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym31$PROGN, ConsesLow.listS( $sym32$PPH_CHECK_TYPE, scope_type, $list33 ), ConsesLow.listS( $sym34$CLET, ConsesLow.list( ConsesLow.list( $sym35$_PPH_OPERATOR_SCOPE_CONTEXT_, ConsesLow.listS(
        $sym36$CONS, scope_type, $list37 ) ) ), ConsesLow.list( $sym38$PPH_NOTE, ONE_INTEGER, $str39$Inside_operator_scope__S, scope_type ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym38$PPH_NOTE,
            ONE_INTEGER, $str40$Leaving_operator_scope__S, scope_type ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 20681L)
  public static SubLObject pph_inside_negation_scope_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( $kw41$NO, $pph_operator_scope_context$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 20783L)
  public static SubLObject pph_inside_downward_entailing_environmentP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != subl_promotions.memberP( $kw41$NO, $pph_operator_scope_context$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) || NIL != subl_promotions.memberP( $kw42$IMPLIES,
        $pph_operator_scope_context$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 21984L)
  public static SubLObject pph_top_level_cycl()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.last_one( $pph_cycls$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22102L)
  public static SubLObject pph_current_cycl()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $pph_cycls$.getDynamicValue( thread ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 22812L)
  public static SubLObject pph_tracking_var_types_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return misc_utilities.initialized_p( $pph_var_types$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 23421L)
  public static SubLObject note_unexpressed_negation(final SubLObject arg_position, SubLObject source)
  {
    if( source == UNPROVIDED )
    {
      source = $kw46$UNKNOWN_SOURCE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str47$Noting_unexpressed_negation_from_, source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return set.set_add( arg_position, $pph_unexpressed_negations$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 23636L)
  public static SubLObject note_unexpressed_negation_expressed(SubLObject arg_position, SubLObject source)
  {
    if( source == UNPROVIDED )
    {
      source = $kw46$UNKNOWN_SOURCE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pph_utilities.pph_unknown_arg_position_p( arg_position ) && ONE_INTEGER.eql( set.set_size( $pph_unexpressed_negations$.getDynamicValue( thread ) ) ) )
    {
      final SubLObject only_option = set_utilities.set_arbitrary_element_without_values( $pph_unexpressed_negations$.getDynamicValue( thread ), UNPROVIDED );
      if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
      {
        Errors.warn( $str48$Assuming_we_just_expressed_the_ne, only_option );
        streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
      }
      arg_position = only_option;
    }
    final SubLObject found_itP = set.set_remove( arg_position, $pph_unexpressed_negations$.getDynamicValue( thread ) );
    if( NIL == found_itP && NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) && NIL == pph_error.suppress_pph_warningsP() )
    {
      Errors.warn( $str49$Supposedly_expressed_negation_of_, arg_position );
      streams_high.force_output( StreamsLow.$error_output$.getDynamicValue( thread ) );
    }
    return found_itP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 24326L)
  public static SubLObject unexpressed_negationP(final SubLObject arg_position)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return set.set_memberP( arg_position, $pph_unexpressed_negations$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 24595L)
  public static SubLObject pph_allow_contractionsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $pph_allow_contractionsP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25213L)
  public static SubLObject verbose_print_pph_phrasesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( $verbose_print_pph_phrasesP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 25621L)
  public static SubLObject current_generation_level()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $generation_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26078L)
  public static SubLObject pph_problem_reporting_on_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( $pph_problem_reporting_mode$.getDynamicValue( thread ) != $kw52$OFF );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26731L)
  public static SubLObject retain_pph_queriesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject value = makeBoolean( NIL != $retain_pph_queriesP$.getDynamicValue( thread ) || ( NIL != pph_phrase.http_processP( UNPROVIDED ) && NIL != control_vars.$generated_phrases_browsableP$.getDynamicValue(
        thread ) ) );
    warn_about_pph_query_retention( value, UNPROVIDED );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26945L)
  public static SubLObject clear_warn_about_pph_query_retention()
  {
    final SubLObject cs = $warn_about_pph_query_retention_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26945L)
  public static SubLObject remove_warn_about_pph_query_retention(final SubLObject value, SubLObject process)
  {
    if( process == UNPROVIDED )
    {
      process = Threads.current_process();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $warn_about_pph_query_retention_caching_state$.getGlobalValue(), ConsesLow.list( value, process ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26945L)
  public static SubLObject warn_about_pph_query_retention_internal(final SubLObject value, final SubLObject process)
  {
    if( NIL != pph_error.pph_trace_level_exceeds_minimumP( ONE_INTEGER ) )
    {
      format_nil.force_format( T, $str55$Retain_PPH_queries_is__S_for__S, value, process, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 26945L)
  public static SubLObject warn_about_pph_query_retention(final SubLObject value, SubLObject process)
  {
    if( process == UNPROVIDED )
    {
      process = Threads.current_process();
    }
    SubLObject caching_state = $warn_about_pph_query_retention_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym54$WARN_ABOUT_PPH_QUERY_RETENTION, $sym56$_WARN_ABOUT_PPH_QUERY_RETENTION_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( value, process );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( value.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && process.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( warn_about_pph_query_retention_internal( value, process ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( value, process ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29594L)
  public static SubLObject initialize_pph_vars()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.kb_loaded() )
    {
      $pph_language_mt$.setDynamicValue( default_pph_language_mt( UNPROVIDED ), thread );
      $pph_domain_mt$.setDynamicValue( $pph_language_mt$.getDynamicValue( thread ), thread );
      pph_utilities.initialize_pph_nbar_nart();
      return $kw59$INITIALIZED;
    }
    final SubLObject new_format_string = Sequences.cconcatenate( $str60$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy( ONE_INTEGER ), $str61$__, format_nil.format_nil_a_no_copy(
        $str62$No_KB_loaded__Couldn_t_initialize )
    } );
    pph_error.pph_handle_error( new_format_string, ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ) );
    return $kw63$NO_KB_LOADED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 29952L)
  public static SubLObject default_pph_language_mt(SubLObject union_mts)
  {
    if( union_mts == UNPROVIDED )
    {
      union_mts = NIL;
    }
    SubLObject language_mt = NIL;
    if( NIL == language_mt )
    {
      SubLObject csome_list_var = $list64;
      SubLObject mt_name = NIL;
      mt_name = csome_list_var.first();
      while ( NIL == language_mt && NIL != csome_list_var)
      {
        final SubLObject mt = constants_high.find_constant( mt_name );
        if( NIL != constant_handles.valid_constantP( mt, UNPROVIDED ) )
        {
          language_mt = mt;
        }
        csome_list_var = csome_list_var.rest();
        mt_name = csome_list_var.first();
      }
    }
    if( NIL != union_mts )
    {
      language_mt = el_utilities.make_formula( $const65$MtUnionFn, ConsesLow.cons( language_mt, union_mts ), UNPROVIDED );
    }
    return maybe_temporally_qualify_pph_language_mt( language_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-vars.lisp", position = 30429L)
  public static SubLObject maybe_temporally_qualify_pph_language_mt(SubLObject language_mt)
  {
    if( NIL != hlmt.hlmts_supportedP() )
    {
      language_mt = hlmt_czer.canonicalize_hlmt( ConsesLow.listS( $const66$MtSpace, language_mt, $list67 ) );
    }
    return language_mt;
  }

  public static SubLObject declare_pph_vars_file()
  {
    SubLFiles.declareFunction( me, "pph_generate_alternative_phrasesP", "PPH-GENERATE-ALTERNATIVE-PHRASES?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_at_top_levelP", "PPH-AT-TOP-LEVEL?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_generate_morphological_alternativesP", "PPH-GENERATE-MORPHOLOGICAL-ALTERNATIVES?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_generate_nested_alternativesP", "PPH-GENERATE-NESTED-ALTERNATIVES?", 0, 0, false );
    SubLFiles.declareFunction( me, "definite_description_licensed_for_termP", "DEFINITE-DESCRIPTION-LICENSED-FOR-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_language_mt", "PPH-LANGUAGE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_domain_mt", "PPH-DOMAIN-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_blacklist_active_p", "PPH-BLACKLIST-ACTIVE-P", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_forbidden_string_for_termP", "PPH-FORBIDDEN-STRING-FOR-TERM?", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_forbidden_lexical_assertionP", "PPH-FORBIDDEN-LEXICAL-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_failure_is_an_option_p", "PPH-FAILURE-IS-AN-OPTION-P", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_too_many_demerits_p", "PPH-TOO-MANY-DEMERITS-P", 1, 1, false );
    SubLFiles.declareFunction( me, "pph_link_unlinked_phrases_to_matrix_arg0P", "PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_maximize_linksP", "PPH-MAXIMIZE-LINKS?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_current_parameters", "PPH-CURRENT-PARAMETERS", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_new_parameter_snapshot", "PPH-NEW-PARAMETER-SNAPSHOT", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_params_currentP", "PPH-PARAMS-CURRENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_param_value", "PPH-PARAM-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_quantifier_keyword_p", "PPH-QUANTIFIER-KEYWORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_quantifier_keywords", "PPH-QUANTIFIER-KEYWORDS", 0, 0, false );
    SubLFiles.declareMacro( me, "with_pph_operator_scope", "WITH-PPH-OPERATOR-SCOPE" );
    SubLFiles.declareFunction( me, "pph_inside_negation_scope_p", "PPH-INSIDE-NEGATION-SCOPE-P", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_inside_downward_entailing_environmentP", "PPH-INSIDE-DOWNWARD-ENTAILING-ENVIRONMENT?", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_top_level_cycl", "PPH-TOP-LEVEL-CYCL", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_current_cycl", "PPH-CURRENT-CYCL", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_tracking_var_types_p", "PPH-TRACKING-VAR-TYPES-P", 0, 0, false );
    SubLFiles.declareFunction( me, "note_unexpressed_negation", "NOTE-UNEXPRESSED-NEGATION", 1, 1, false );
    SubLFiles.declareFunction( me, "note_unexpressed_negation_expressed", "NOTE-UNEXPRESSED-NEGATION-EXPRESSED", 1, 1, false );
    SubLFiles.declareFunction( me, "unexpressed_negationP", "UNEXPRESSED-NEGATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_allow_contractionsP", "PPH-ALLOW-CONTRACTIONS?", 0, 0, false );
    SubLFiles.declareFunction( me, "verbose_print_pph_phrasesP", "VERBOSE-PRINT-PPH-PHRASES?", 0, 0, false );
    SubLFiles.declareFunction( me, "current_generation_level", "CURRENT-GENERATION-LEVEL", 0, 0, false );
    SubLFiles.declareFunction( me, "pph_problem_reporting_on_p", "PPH-PROBLEM-REPORTING-ON-P", 0, 0, false );
    SubLFiles.declareFunction( me, "retain_pph_queriesP", "RETAIN-PPH-QUERIES?", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_warn_about_pph_query_retention", "CLEAR-WARN-ABOUT-PPH-QUERY-RETENTION", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_warn_about_pph_query_retention", "REMOVE-WARN-ABOUT-PPH-QUERY-RETENTION", 1, 1, false );
    SubLFiles.declareFunction( me, "warn_about_pph_query_retention_internal", "WARN-ABOUT-PPH-QUERY-RETENTION-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "warn_about_pph_query_retention", "WARN-ABOUT-PPH-QUERY-RETENTION", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_pph_vars", "INITIALIZE-PPH-VARS", 0, 0, false );
    SubLFiles.declareFunction( me, "default_pph_language_mt", "DEFAULT-PPH-LANGUAGE-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "maybe_temporally_qualify_pph_language_mt", "MAYBE-TEMPORALLY-QUALIFY-PPH-LANGUAGE-MT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_vars_file()
  {
    $use_parenthetical_disambiguationsP$ = SubLFiles.defparameter( "*USE-PARENTHETICAL-DISAMBIGUATIONS?*", $kw0$WHEN_NECESSARY );
    $pph_ambiguous_strings$ = SubLFiles.defparameter( "*PPH-AMBIGUOUS-STRINGS*", NIL );
    $pph_use_bulleted_listsP$ = SubLFiles.defparameter( "*PPH-USE-BULLETED-LISTS?*", NIL );
    $pph_use_bulleted_lists_min_level$ = SubLFiles.defparameter( "*PPH-USE-BULLETED-LISTS-MIN-LEVEL*", ONE_INTEGER );
    $pph_replace_bulleted_list_tagsP$ = SubLFiles.defparameter( "*PPH-REPLACE-BULLETED-LIST-TAGS?*", NIL );
    $pph_italicize_variables_in_html_modeP$ = SubLFiles.defparameter( "*PPH-ITALICIZE-VARIABLES-IN-HTML-MODE?*", T );
    $pph_italicize_skolems_in_html_modeP$ = SubLFiles.defparameter( "*PPH-ITALICIZE-SKOLEMS-IN-HTML-MODE?*", T );
    $pph_citation_format$ = SubLFiles.defparameter( "*PPH-CITATION-FORMAT*", $kw1$SUPERSCRIPTS );
    $pph_html_tags_added_by_system$ = SubLFiles.deflexical( "*PPH-HTML-TAGS-ADDED-BY-SYSTEM*", ConsesLow.list( new SubLObject[] { html_macros.$html_italic_head$.getGlobalValue(), html_macros.$html_italic_tail$
        .getGlobalValue(), html_macros.$html_unordered_list_head$.getGlobalValue(), html_macros.$html_unordered_list_tail$.getGlobalValue(), html_macros.$html_list_item_head$.getGlobalValue(),
      html_macros.$html_list_item_tail$.getGlobalValue(), $str2$_a_, $str3$_a_, html_macros.$html_anchor_tail$.getGlobalValue(), html_macros.$html_subscript_head$.getGlobalValue(), html_macros.$html_subscript_tail$
          .getGlobalValue(), html_macros.$html_superscript_head$.getGlobalValue(), html_macros.$html_superscript_tail$.getGlobalValue()
    } ) );
    $pph_use_indexical_datesP$ = SubLFiles.defparameter( "*PPH-USE-INDEXICAL-DATES?*", T );
    $select_string_methods_to_omit$ = SubLFiles.defparameter( "*SELECT-STRING-METHODS-TO-OMIT*", NIL );
    $pph_guess_names_for_unlexified_termsP$ = SubLFiles.defparameter( "*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*", T );
    $pph_coerce_definite_descriptions_for_unlexified_termsP$ = SubLFiles.defparameter( "*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*", NIL );
    $pph_introduce_anaphorsP$ = SubLFiles.defparameter( "*PPH-INTRODUCE-ANAPHORS?*", T );
    $pph_blanks_for_varsP$ = SubLFiles.defparameter( "*PPH-BLANKS-FOR-VARS?*", NIL );
    $pph_alternative_phrase_generation_level$ = SubLFiles.defparameter( "*PPH-ALTERNATIVE-PHRASE-GENERATION-LEVEL*", $kw4$NONE );
    $pph_sentence$ = SubLFiles.defparameter( "*PPH-SENTENCE*", misc_utilities.uninitialized() );
    $pph_use_rdfP$ = SubLFiles.defparameter( "*PPH-USE-RDF?*", NIL );
    $paraphrase_precision$ = SubLFiles.defparameter( "*PARAPHRASE-PRECISION*", NIL );
    $pph_terse_modeP$ = SubLFiles.defparameter( "*PPH-TERSE-MODE?*", T );
    $pph_terse_mt_scopeP$ = SubLFiles.defparameter( "*PPH-TERSE-MT-SCOPE?*", NIL );
    $pph_use_explicit_temporal_qualification_for_defaultP$ = SubLFiles.defparameter( "*PPH-USE-EXPLICIT-TEMPORAL-QUALIFICATION-FOR-DEFAULT?*", NIL );
    $pph_explicit_temporal_qualification_for_current_factsP$ = SubLFiles.defparameter( "*PPH-EXPLICIT-TEMPORAL-QUALIFICATION-FOR-CURRENT-FACTS?*", T );
    $definite_description_licensed_terms$ = SubLFiles.defparameter( "*DEFINITE-DESCRIPTION-LICENSED-TERMS*", NIL );
    $paraphrase_mode$ = SubLFiles.defparameter( "*PARAPHRASE-MODE*", $kw8$HTML );
    $pph_language_mt$ = SubLFiles.defvar( "*PPH-LANGUAGE-MT*", NIL );
    $allow_pph_language_mt_broadeningP$ = SubLFiles.defparameter( "*ALLOW-PPH-LANGUAGE-MT-BROADENING?*", T );
    $pph_domain_mt$ = SubLFiles.defvar( "*PPH-DOMAIN-MT*", NIL );
    $pph_term_paraphrase_map$ = SubLFiles.defparameter( "*PPH-TERM-PARAPHRASE-MAP*", NIL );
    $pph_term_paraphrase_blacklist$ = SubLFiles.defparameter( "*PPH-TERM-PARAPHRASE-BLACKLIST*", NIL );
    $pph_lexical_assertion_blacklist$ = SubLFiles.defparameter( "*PPH-LEXICAL-ASSERTION-BLACKLIST*", NIL );
    $pph_basic_var_types$ = SubLFiles.defparameter( "*PPH-BASIC-VAR-TYPES*", $list13 );
    $pph_use_basic_var_typesP$ = SubLFiles.defparameter( "*PPH-USE-BASIC-VAR-TYPES?*", NIL );
    $determiners_before_variables$ = SubLFiles.defparameter( "*DETERMINERS-BEFORE-VARIABLES*", NIL );
    $pph_suppressed_final_punctuation_strings$ = SubLFiles.defparameter( "*PPH-SUPPRESSED-FINAL-PUNCTUATION-STRINGS*", NIL );
    $pph_use_expansions_for_precisionP$ = SubLFiles.defparameter( "*PPH-USE-EXPANSIONS-FOR-PRECISION?*", T );
    $pph_reduce_conjunctionsP$ = SubLFiles.defparameter( "*PPH-REDUCE-CONJUNCTIONS?*", T );
    $pph_query_antecedents_are_hypothesizedP$ = SubLFiles.defparameter( "*PPH-QUERY-ANTECEDENTS-ARE-HYPOTHESIZED?*", T );
    $pph_handle_hypotheticalsP$ = SubLFiles.defparameter( "*PPH-HANDLE-HYPOTHETICALS?*", NIL );
    $pph_use_title_capitalizationP$ = SubLFiles.defparameter( "*PPH-USE-TITLE-CAPITALIZATION?*", NIL );
    $pph_expand_e_notation_for_floatsP$ = SubLFiles.defparameter( "*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*", T );
    $pph_quantify_varsP$ = SubLFiles.defparameter( "*PPH-QUANTIFY-VARS?*", T );
    $pph_hide_explicit_universalsP$ = SubLFiles.defparameter( "*PPH-HIDE-EXPLICIT-UNIVERSALS?*", T );
    $pph_hypothetical_vars$ = SubLFiles.defparameter( "*PPH-HYPOTHETICAL-VARS*", NIL );
    $pph_use_smart_variable_replacementP$ = SubLFiles.defparameter( "*PPH-USE-SMART-VARIABLE-REPLACEMENT?*", misc_utilities.uninitialized() );
    $pph_search_limit$ = SubLFiles.defparameter( "*PPH-SEARCH-LIMIT*", TWO_INTEGER );
    $register_vars_by_arg_constraintsP$ = SubLFiles.defparameter( "*REGISTER-VARS-BY-ARG-CONSTRAINTS?*", T );
    $pph_register_exception_vars_recursivelyP$ = SubLFiles.defparameter( "*PPH-REGISTER-EXCEPTION-VARS-RECURSIVELY?*", NIL );
    $pph_addressee$ = SubLFiles.defparameter( "*PPH-ADDRESSEE*", $kw14$UNKNOWN );
    $pph_speaker$ = SubLFiles.defparameter( "*PPH-SPEAKER*", $kw14$UNKNOWN );
    $pph_use_online_string_frequenciesP$ = SubLFiles.defparameter( "*PPH-USE-ONLINE-STRING-FREQUENCIES?*", NIL );
    $pph_ceteris_paribus_choice_method$ = SubLFiles.defparameter( "*PPH-CETERIS-PARIBUS-CHOICE-METHOD*", $kw15$ARBITRARY );
    $pph_top_level_demerits$ = SubLFiles.defparameter( "*PPH-TOP-LEVEL-DEMERITS*", misc_utilities.uninitialized() );
    $pph_demerit_cutoff$ = SubLFiles.defparameter( "*PPH-DEMERIT-CUTOFF*", number_utilities.positive_infinity() );
    $pph_suggested_demerit_cutoff$ = SubLFiles.defconstant( "*PPH-SUGGESTED-DEMERIT-CUTOFF*", TWO_INTEGER );
    $pph_allow_word_form_coercionP$ = SubLFiles.defparameter( "*PPH-ALLOW-WORD-FORM-COERCION?*", T );
    $pph_max_no_comma_length$ = SubLFiles.defparameter( "*PPH-MAX-NO-COMMA-LENGTH*", FOUR_INTEGER );
    $pph_significant_digits_cutoff$ = SubLFiles.defparameter( "*PPH-SIGNIFICANT-DIGITS-CUTOFF*", number_utilities.positive_infinity() );
    $pph_show_type_level_violationsP$ = SubLFiles.defparameter( "*PPH-SHOW-TYPE-LEVEL-VIOLATIONS?*", NIL );
    $pph_type_level_violations$ = SubLFiles.defparameter( "*PPH-TYPE-LEVEL-VIOLATIONS*", NIL );
    $pph_name_string_preds$ = SubLFiles.defparameter( "*PPH-NAME-STRING-PREDS*", NIL );
    $pph_irrelevant_warnP$ = SubLFiles.defparameter( "*PPH-IRRELEVANT-WARN?*", NIL );
    $pph_inference_answer$ = SubLFiles.defparameter( "*PPH-INFERENCE-ANSWER*", NIL );
    $pph_paraphrase_to_justify$ = SubLFiles.defparameter( "*PPH-PARAPHRASE-TO-JUSTIFY*", misc_utilities.uninitialized() );
    $constant_link_function$ = SubLFiles.defparameter( "*CONSTANT-LINK-FUNCTION*", $sym17$CB_CF );
    $allow_utf8_in_pph_text_mode$ = SubLFiles.defparameter( "*ALLOW-UTF8-IN-PPH-TEXT-MODE*", NIL );
    $pph_use_salient_urlP$ = SubLFiles.defparameter( "*PPH-USE-SALIENT-URL?*", NIL );
    $html_generation_target$ = SubLFiles.defparameter( "*HTML-GENERATION-TARGET*", $str21$_self );
    $html_generation_term_id_function$ = SubLFiles.defparameter( "*HTML-GENERATION-TERM-ID-FUNCTION*", $sym23$GET_TERM_ID );
    $pph_deprecate_old_source_citation_formatP$ = SubLFiles.defparameter( "*PPH-DEPRECATE-OLD-SOURCE-CITATION-FORMAT?*", T );
    $pph_link_arg0P$ = SubLFiles.defparameter( "*PPH-LINK-ARG0?*", NIL );
    $pph_link_unlinked_phrases_to_matrix_arg0P$ = SubLFiles.defparameter( "*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*", T );
    $pph_maximize_linksP$ = SubLFiles.defparameter( "*PPH-MAXIMIZE-LINKS?*", NIL );
    $pph_consolidate_output_list_for_natP$ = SubLFiles.defparameter( "*PPH-CONSOLIDATE-OUTPUT-LIST-FOR-NAT?*", T );
    $pph_consolidate_javalistsP$ = SubLFiles.defparameter( "*PPH-CONSOLIDATE-JAVALISTS?*", NIL );
    $pph_use_showXhideP$ = SubLFiles.defparameter( "*PPH-USE-SHOW/HIDE?*", T );
    $rkf_use_cycl_for_unlexified_termsP$ = SubLFiles.defparameter( "*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*", T );
    $pph_use_cb_uia_display_methodsP$ = SubLFiles.defparameter( "*PPH-USE-CB-UIA-DISPLAY-METHODS?*", NIL );
    $rkf_prefer_nouns_for_termsP$ = SubLFiles.defparameter( "*RKF-PREFER-NOUNS-FOR-TERMS?*", T );
    $rkf_use_genl_preds_for_paraphraseP$ = SubLFiles.defparameter( "*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*", NIL );
    $pph_control_parameters$ = SubLFiles.deflexical( "*PPH-CONTROL-PARAMETERS*", $list26 );
    $pph_max_param_records$ = SubLFiles.defconstant( "*PPH-MAX-PARAM-RECORDS*", TEN_INTEGER );
    $pph_latest_parameters$ = SubLFiles.defparameter( "*PPH-LATEST-PARAMETERS*", NIL );
    $pph_quantifiers$ = SubLFiles.defconstant( "*PPH-QUANTIFIERS*", $list29 );
    $pph_operator_scope_context$ = SubLFiles.defparameter( "*PPH-OPERATOR-SCOPE-CONTEXT*", NIL );
    $pph_blank_string$ = SubLFiles.defconstant( "*PPH-BLANK-STRING*", $str43$______ );
    $gen_template_store_lock$ = SubLFiles.deflexical( "*GEN-TEMPLATE-STORE-LOCK*", Locks.make_lock( $str44$Gen_Template_Store_Lock ) );
    $last_pph_sentence$ = SubLFiles.defparameter( "*LAST-PPH-SENTENCE*", NIL );
    $pph_phrase_fns$ = SubLFiles.defparameter( "*PPH-PHRASE-FNS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $pph_data_structures_code_revision$ = SubLFiles.deflexical( "*PPH-DATA-STRUCTURES-CODE-REVISION*", ( maybeDefault( $sym45$_PPH_DATA_STRUCTURES_CODE_REVISION_, $pph_data_structures_code_revision$, NIL ) ) );
    $pph_cycls$ = SubLFiles.defparameter( "*PPH-CYCLS*", NIL );
    $pph_root_phrase$ = SubLFiles.defparameter( "*PPH-ROOT-PHRASE*", misc_utilities.uninitialized() );
    $bypass_pph_phrase_destroyerP$ = SubLFiles.defparameter( "*BYPASS-PPH-PHRASE-DESTROYER?*", T );
    $pph_discourse_context$ = SubLFiles.defparameter( "*PPH-DISCOURSE-CONTEXT*", NIL );
    $pph_track_discourse_referentsP$ = SubLFiles.defparameter( "*PPH-TRACK-DISCOURSE-REFERENTS?*", T );
    $pph_var_types$ = SubLFiles.defparameter( "*PPH-VAR-TYPES*", misc_utilities.uninitialized() );
    $pph_noted_var_types$ = SubLFiles.defparameter( "*PPH-NOTED-VAR-TYPES*", NIL );
    $pph_possibly_binding_variables_counter$ = SubLFiles.defparameter( "*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*", ZERO_INTEGER );
    $pph_use_wh_for_query_varsP$ = SubLFiles.defparameter( "*PPH-USE-WH-FOR-QUERY-VARS?*", T );
    $pph_unexpressed_negations$ = SubLFiles.defparameter( "*PPH-UNEXPRESSED-NEGATIONS*", misc_utilities.uninitialized() );
    $pph_allow_contractionsP$ = SubLFiles.defparameter( "*PPH-ALLOW-CONTRACTIONS?*", NIL );
    $pph_use_whomP$ = SubLFiles.defparameter( "*PPH-USE-WHOM?*", T );
    $pph_capitalize_false_stringP$ = SubLFiles.defparameter( "*PPH-CAPITALIZE-FALSE-STRING?*", NIL );
    $pph_keep_generic_argsP$ = SubLFiles.defparameter( "*PPH-KEEP-GENERIC-ARGS?*", NIL );
    $pph_resolve_bindings_phrasesP$ = SubLFiles.defparameter( "*PPH-RESOLVE-BINDINGS-PHRASES?*", T );
    $verbose_print_pph_phrasesP$ = SubLFiles.defparameter( "*VERBOSE-PRINT-PPH-PHRASES?*", NIL );
    $pph_formula_for_generic_arg_replacement$ = SubLFiles.defparameter( "*PPH-FORMULA-FOR-GENERIC-ARG-REPLACEMENT*", $kw50$UNSPECIFIED );
    $generation_level$ = SubLFiles.defparameter( "*GENERATION-LEVEL*", ZERO_INTEGER );
    $pph_current_arg0_position$ = SubLFiles.defparameter( "*PPH-CURRENT-ARG0-POSITION*", $list51 );
    $pph_current_arg0$ = SubLFiles.defparameter( "*PPH-CURRENT-ARG0*", $kw50$UNSPECIFIED );
    $pph_problem_reporting_mode$ = SubLFiles.defparameter( "*PPH-PROBLEM-REPORTING-MODE*", $kw52$OFF );
    $pph_problem_reports$ = SubLFiles.defparameter( "*PPH-PROBLEM-REPORTS*", $kw53$NOT_GATHERING );
    $pph_retain_original_relative_targetsP$ = SubLFiles.defparameter( "*PPH-RETAIN-ORIGINAL-RELATIVE-TARGETS?*", NIL );
    $meter_pph_queriesP$ = SubLFiles.defparameter( "*METER-PPH-QUERIES?*", NIL );
    $meter_pph_gaf_paraphraseP$ = SubLFiles.defparameter( "*METER-PPH-GAF-PARAPHRASE?*", NIL );
    $retain_pph_queriesP$ = SubLFiles.defparameter( "*RETAIN-PPH-QUERIES?*", NIL );
    $warn_about_pph_query_retention_caching_state$ = SubLFiles.deflexical( "*WARN-ABOUT-PPH-QUERY-RETENTION-CACHING-STATE*", NIL );
    $pph_error_on_bad_templatesP$ = SubLFiles.defparameter( "*PPH-ERROR-ON-BAD-TEMPLATES?*", NIL );
    $pph_bad_template_dummy$ = SubLFiles.defconstant( "*PPH-BAD-TEMPLATE-DUMMY*", $kw57$PPH_BAD_TEMPLATE_DUMMY );
    $pph_non_explanatory_proofs$ = SubLFiles.defparameter( "*PPH-NON-EXPLANATORY-PROOFS*", $kw58$UNINITIALIZED );
    $pph_show_meta_supports_with_supportsP$ = SubLFiles.defparameter( "*PPH-SHOW-META-SUPPORTS-WITH-SUPPORTS?*", T );
    $pph_show_assert_info_with_assertionsP$ = SubLFiles.defparameter( "*PPH-SHOW-ASSERT-INFO-WITH-ASSERTIONS?*", T );
    $pph_proof_show_facts_usedP$ = SubLFiles.defparameter( "*PPH-PROOF-SHOW-FACTS-USED?*", T );
    $pph_proof_show_facts_depth_cutoff$ = SubLFiles.defparameter( "*PPH-PROOF-SHOW-FACTS-DEPTH-CUTOFF*", ONE_INTEGER );
    $pph_proof_include_phrase_linksP$ = SubLFiles.defparameter( "*PPH-PROOF-INCLUDE-PHRASE-LINKS?*", NIL );
    $pph_show_trivial_proofsP$ = SubLFiles.defparameter( "*PPH-SHOW-TRIVIAL-PROOFS?*", NIL );
    $pph_repositioned_proofs$ = SubLFiles.defparameter( "*PPH-REPOSITIONED-PROOFS*", NIL );
    $pph_displayed_proofs$ = SubLFiles.defparameter( "*PPH-DISPLAYED-PROOFS*", NIL );
    $pph_justified_proofs$ = SubLFiles.defparameter( "*PPH-JUSTIFIED-PROOFS*", NIL );
    $pph_displayed_supports$ = SubLFiles.defparameter( "*PPH-DISPLAYED-SUPPORTS*", $kw58$UNINITIALIZED );
    $rules_used_in_quasi_transformation_proofs$ = SubLFiles.deflexical( "*RULES-USED-IN-QUASI-TRANSFORMATION-PROOFS*", dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    $pph_proof_depth$ = SubLFiles.defparameter( "*PPH-PROOF-DEPTH*", ZERO_INTEGER );
    $pph_top_level_proof_depth$ = SubLFiles.defconstant( "*PPH-TOP-LEVEL-PROOF-DEPTH*", ONE_INTEGER );
    $validate_proof_supportsP$ = SubLFiles.defparameter( "*VALIDATE-PROOF-SUPPORTS?*", T );
    $pph_phrase_methods$ = SubLFiles.defparameter( "*PPH-PHRASE-METHODS*", misc_utilities.uninitialized() );
    return NIL;
  }

  public static SubLObject setup_pph_vars_file()
  {
    access_macros.register_external_symbol( $sym7$_PPH_TERSE_MODE__ );
    removal_modules_indexical_referent.register_indexical_referent_expansion( $const9$ParaphraseLanguageMt, $sym10$PPH_LANGUAGE_MT );
    removal_modules_indexical_referent.register_indexical_referent_expansion( $const11$ParaphraseDomainMt, $sym12$PPH_DOMAIN_MT );
    utilities_macros.register_html_state_variable( $sym18$_CONSTANT_LINK_FUNCTION_ );
    utilities_macros.register_html_state_variable( $sym19$_ALLOW_UTF8_IN_PPH_TEXT_MODE_ );
    utilities_macros.register_html_state_variable( $sym20$_PPH_USE_SALIENT_URL__ );
    utilities_macros.register_html_state_variable( $sym22$_HTML_GENERATION_TARGET_ );
    utilities_macros.register_html_state_variable( $sym24$_HTML_GENERATION_TERM_ID_FUNCTION_ );
    utilities_macros.register_html_state_variable( $sym25$_PPH_DEPRECATE_OLD_SOURCE_CITATION_FORMAT__ );
    subl_macro_promotions.declare_defglobal( $sym45$_PPH_DATA_STRUCTURES_CODE_REVISION_ );
    memoization_state.note_globally_cached_function( $sym54$WARN_ABOUT_PPH_QUERY_RETENTION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_vars_file();
  }
  static
  {
    me = new pph_vars();
    $use_parenthetical_disambiguationsP$ = null;
    $pph_ambiguous_strings$ = null;
    $pph_use_bulleted_listsP$ = null;
    $pph_use_bulleted_lists_min_level$ = null;
    $pph_replace_bulleted_list_tagsP$ = null;
    $pph_italicize_variables_in_html_modeP$ = null;
    $pph_italicize_skolems_in_html_modeP$ = null;
    $pph_citation_format$ = null;
    $pph_html_tags_added_by_system$ = null;
    $pph_use_indexical_datesP$ = null;
    $select_string_methods_to_omit$ = null;
    $pph_guess_names_for_unlexified_termsP$ = null;
    $pph_coerce_definite_descriptions_for_unlexified_termsP$ = null;
    $pph_introduce_anaphorsP$ = null;
    $pph_blanks_for_varsP$ = null;
    $pph_alternative_phrase_generation_level$ = null;
    $pph_sentence$ = null;
    $pph_use_rdfP$ = null;
    $paraphrase_precision$ = null;
    $pph_terse_modeP$ = null;
    $pph_terse_mt_scopeP$ = null;
    $pph_use_explicit_temporal_qualification_for_defaultP$ = null;
    $pph_explicit_temporal_qualification_for_current_factsP$ = null;
    $definite_description_licensed_terms$ = null;
    $paraphrase_mode$ = null;
    $pph_language_mt$ = null;
    $allow_pph_language_mt_broadeningP$ = null;
    $pph_domain_mt$ = null;
    $pph_term_paraphrase_map$ = null;
    $pph_term_paraphrase_blacklist$ = null;
    $pph_lexical_assertion_blacklist$ = null;
    $pph_basic_var_types$ = null;
    $pph_use_basic_var_typesP$ = null;
    $determiners_before_variables$ = null;
    $pph_suppressed_final_punctuation_strings$ = null;
    $pph_use_expansions_for_precisionP$ = null;
    $pph_reduce_conjunctionsP$ = null;
    $pph_query_antecedents_are_hypothesizedP$ = null;
    $pph_handle_hypotheticalsP$ = null;
    $pph_use_title_capitalizationP$ = null;
    $pph_expand_e_notation_for_floatsP$ = null;
    $pph_quantify_varsP$ = null;
    $pph_hide_explicit_universalsP$ = null;
    $pph_hypothetical_vars$ = null;
    $pph_use_smart_variable_replacementP$ = null;
    $pph_search_limit$ = null;
    $register_vars_by_arg_constraintsP$ = null;
    $pph_register_exception_vars_recursivelyP$ = null;
    $pph_addressee$ = null;
    $pph_speaker$ = null;
    $pph_use_online_string_frequenciesP$ = null;
    $pph_ceteris_paribus_choice_method$ = null;
    $pph_top_level_demerits$ = null;
    $pph_demerit_cutoff$ = null;
    $pph_suggested_demerit_cutoff$ = null;
    $pph_allow_word_form_coercionP$ = null;
    $pph_max_no_comma_length$ = null;
    $pph_significant_digits_cutoff$ = null;
    $pph_show_type_level_violationsP$ = null;
    $pph_type_level_violations$ = null;
    $pph_name_string_preds$ = null;
    $pph_irrelevant_warnP$ = null;
    $pph_inference_answer$ = null;
    $pph_paraphrase_to_justify$ = null;
    $constant_link_function$ = null;
    $allow_utf8_in_pph_text_mode$ = null;
    $pph_use_salient_urlP$ = null;
    $html_generation_target$ = null;
    $html_generation_term_id_function$ = null;
    $pph_deprecate_old_source_citation_formatP$ = null;
    $pph_link_arg0P$ = null;
    $pph_link_unlinked_phrases_to_matrix_arg0P$ = null;
    $pph_maximize_linksP$ = null;
    $pph_consolidate_output_list_for_natP$ = null;
    $pph_consolidate_javalistsP$ = null;
    $pph_use_showXhideP$ = null;
    $rkf_use_cycl_for_unlexified_termsP$ = null;
    $pph_use_cb_uia_display_methodsP$ = null;
    $rkf_prefer_nouns_for_termsP$ = null;
    $rkf_use_genl_preds_for_paraphraseP$ = null;
    $pph_control_parameters$ = null;
    $pph_max_param_records$ = null;
    $pph_latest_parameters$ = null;
    $pph_quantifiers$ = null;
    $pph_operator_scope_context$ = null;
    $pph_blank_string$ = null;
    $gen_template_store_lock$ = null;
    $last_pph_sentence$ = null;
    $pph_phrase_fns$ = null;
    $pph_data_structures_code_revision$ = null;
    $pph_cycls$ = null;
    $pph_root_phrase$ = null;
    $bypass_pph_phrase_destroyerP$ = null;
    $pph_discourse_context$ = null;
    $pph_track_discourse_referentsP$ = null;
    $pph_var_types$ = null;
    $pph_noted_var_types$ = null;
    $pph_possibly_binding_variables_counter$ = null;
    $pph_use_wh_for_query_varsP$ = null;
    $pph_unexpressed_negations$ = null;
    $pph_allow_contractionsP$ = null;
    $pph_use_whomP$ = null;
    $pph_capitalize_false_stringP$ = null;
    $pph_keep_generic_argsP$ = null;
    $pph_resolve_bindings_phrasesP$ = null;
    $verbose_print_pph_phrasesP$ = null;
    $pph_formula_for_generic_arg_replacement$ = null;
    $generation_level$ = null;
    $pph_current_arg0_position$ = null;
    $pph_current_arg0$ = null;
    $pph_problem_reporting_mode$ = null;
    $pph_problem_reports$ = null;
    $pph_retain_original_relative_targetsP$ = null;
    $meter_pph_queriesP$ = null;
    $meter_pph_gaf_paraphraseP$ = null;
    $retain_pph_queriesP$ = null;
    $warn_about_pph_query_retention_caching_state$ = null;
    $pph_error_on_bad_templatesP$ = null;
    $pph_bad_template_dummy$ = null;
    $pph_non_explanatory_proofs$ = null;
    $pph_show_meta_supports_with_supportsP$ = null;
    $pph_show_assert_info_with_assertionsP$ = null;
    $pph_proof_show_facts_usedP$ = null;
    $pph_proof_show_facts_depth_cutoff$ = null;
    $pph_proof_include_phrase_linksP$ = null;
    $pph_show_trivial_proofsP$ = null;
    $pph_repositioned_proofs$ = null;
    $pph_displayed_proofs$ = null;
    $pph_justified_proofs$ = null;
    $pph_displayed_supports$ = null;
    $rules_used_in_quasi_transformation_proofs$ = null;
    $pph_proof_depth$ = null;
    $pph_top_level_proof_depth$ = null;
    $validate_proof_supportsP$ = null;
    $pph_phrase_methods$ = null;
    $kw0$WHEN_NECESSARY = makeKeyword( "WHEN-NECESSARY" );
    $kw1$SUPERSCRIPTS = makeKeyword( "SUPERSCRIPTS" );
    $str2$_a_ = makeString( "<a>" );
    $str3$_a_ = makeString( "<a " );
    $kw4$NONE = makeKeyword( "NONE" );
    $kw5$TOP_LEVEL_ONLY = makeKeyword( "TOP-LEVEL-ONLY" );
    $kw6$ALL = makeKeyword( "ALL" );
    $sym7$_PPH_TERSE_MODE__ = makeSymbol( "*PPH-TERSE-MODE?*" );
    $kw8$HTML = makeKeyword( "HTML" );
    $const9$ParaphraseLanguageMt = constant_handles.reader_make_constant_shell( makeString( "ParaphraseLanguageMt" ) );
    $sym10$PPH_LANGUAGE_MT = makeSymbol( "PPH-LANGUAGE-MT" );
    $const11$ParaphraseDomainMt = constant_handles.reader_make_constant_shell( makeString( "ParaphraseDomainMt" ) );
    $sym12$PPH_DOMAIN_MT = makeSymbol( "PPH-DOMAIN-MT" );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell( makeString( "TimeInterval" ) ), constant_handles.reader_make_constant_shell( makeString( "Time-Quantity" ) ),
        constant_handles.reader_make_constant_shell( makeString( "Event" ) ), constant_handles.reader_make_constant_shell( makeString( "ScalarInterval" ) ) );
    $kw14$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw15$ARBITRARY = makeKeyword( "ARBITRARY" );
    $str16$Too_many_demerits___S = makeString( "Too many demerits: ~S" );
    $sym17$CB_CF = makeSymbol( "CB-CF" );
    $sym18$_CONSTANT_LINK_FUNCTION_ = makeSymbol( "*CONSTANT-LINK-FUNCTION*" );
    $sym19$_ALLOW_UTF8_IN_PPH_TEXT_MODE_ = makeSymbol( "*ALLOW-UTF8-IN-PPH-TEXT-MODE*" );
    $sym20$_PPH_USE_SALIENT_URL__ = makeSymbol( "*PPH-USE-SALIENT-URL?*" );
    $str21$_self = makeString( "_self" );
    $sym22$_HTML_GENERATION_TARGET_ = makeSymbol( "*HTML-GENERATION-TARGET*" );
    $sym23$GET_TERM_ID = makeSymbol( "GET-TERM-ID" );
    $sym24$_HTML_GENERATION_TERM_ID_FUNCTION_ = makeSymbol( "*HTML-GENERATION-TERM-ID-FUNCTION*" );
    $sym25$_PPH_DEPRECATE_OLD_SOURCE_CITATION_FORMAT__ = makeSymbol( "*PPH-DEPRECATE-OLD-SOURCE-CITATION-FORMAT?*" );
    $list26 = ConsesLow.list( new SubLObject[] { makeSymbol( "*USE-PARENTHETICAL-DISAMBIGUATIONS?*" ), makeSymbol( "*PPH-USE-BULLETED-LISTS?*" ), makeSymbol( "*PPH-USE-INDEXICAL-DATES?*" ), makeSymbol(
        "*SELECT-STRING-METHODS-TO-OMIT*" ), makeSymbol( "*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*" ), makeSymbol( "*PPH-INTRODUCE-ANAPHORS?*" ), makeSymbol( "*PPH-BLANKS-FOR-VARS?*" ), makeSymbol(
            "*PPH-SUPPRESSED-FINAL-PUNCTUATION-STRINGS*" ), makeSymbol( "*PPH-QUERY-ANTECEDENTS-ARE-HYPOTHESIZED?*" ), makeSymbol( "*THE-CYCLIST*" ), makeSymbol( "*PPH-USE-TITLE-CAPITALIZATION?*" ), makeSymbol(
                "*PARAPHRASE-PRECISION*" ), makeSymbol( "*PPH-TERSE-MODE?*" ), makeSymbol( "*PPH-USE-EXPANSIONS-FOR-PRECISION?*" ), makeSymbol( "*PARAPHRASE-MODE*" ), makeSymbol( "*PPH-LANGUAGE-MT*" ), makeSymbol(
                    "*PPH-DOMAIN-MT*" ), makeSymbol( "*PPH-TERM-PARAPHRASE-MAP*" ), makeSymbol( "*DETERMINERS-BEFORE-VARIABLES*" ), makeSymbol( "*PPH-QUANTIFY-VARS?*" ), makeSymbol( "*PPH-HIDE-EXPLICIT-UNIVERSALS?*" ),
      makeSymbol( "*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*" ), makeSymbol( "*PPH-CURRENT-ARG0*" ), makeSymbol( "*PPH-CURRENT-ARG0-POSITION*" ), makeSymbol( "*PPH-HYPOTHETICAL-VARS*" ), makeSymbol(
          "*PPH-USE-SMART-VARIABLE-REPLACEMENT?*" ), makeSymbol( "*PPH-SEARCH-LIMIT*" ), makeSymbol( "*REGISTER-VARS-BY-ARG-CONSTRAINTS?*" ), makeSymbol( "*PPH-ADDRESSEE*" ), makeSymbol( "*PPH-SPEAKER*" ), makeSymbol(
              "*PPH-USE-ONLINE-STRING-FREQUENCIES?*" ), makeSymbol( "*PPH-DEMERIT-CUTOFF*" ), makeSymbol( "*PPH-ALLOW-WORD-FORM-COERCION?*" ), makeSymbol( "*PPH-MAX-NO-COMMA-LENGTH*" ), makeSymbol(
                  "*PPH-SIGNIFICANT-DIGITS-CUTOFF*" ), makeSymbol( "*PPH-SHOW-TYPE-LEVEL-VIOLATIONS?*" ), makeSymbol( "*CONSTANT-LINK-FUNCTION*" ), makeSymbol( "*HTML-GENERATION-TARGET*" ), makeSymbol(
                      "*HTML-GENERATION-TERM-ID-FUNCTION*" ), makeSymbol( "*PPH-LINK-ARG0?*" ), makeSymbol( "*PPH-MAXIMIZE-LINKS?*" ), makeSymbol( "*PPH-USE-SHOW/HIDE?*" ), makeSymbol(
                          "*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*" ), makeSymbol( "*RKF-PREFER-NOUNS-FOR-TERMS?*" ), makeSymbol( "*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*" ), makeSymbol( "*PPH-INFERENCE-ANSWER*" )
    } );
    $sym27$BOUNDP = makeSymbol( "BOUNDP" );
    $list28 = ConsesLow.list( makeSymbol( "PARAM" ), makeSymbol( "LATEST-VALUE" ) );
    $list29 = ConsesLow.list( makeKeyword( "UNIVERSAL" ), makeKeyword( "EXISTENTIAL" ), makeKeyword( "NO" ), makeKeyword( "SCOPED" ), makeKeyword( "QUERY" ) );
    $list30 = ConsesLow.list( makeSymbol( "SCOPE-TYPE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym31$PROGN = makeSymbol( "PROGN" );
    $sym32$PPH_CHECK_TYPE = makeSymbol( "PPH-CHECK-TYPE" );
    $list33 = ConsesLow.list( makeSymbol( "PPH-QUANTIFIER-KEYWORD-P" ) );
    $sym34$CLET = makeSymbol( "CLET" );
    $sym35$_PPH_OPERATOR_SCOPE_CONTEXT_ = makeSymbol( "*PPH-OPERATOR-SCOPE-CONTEXT*" );
    $sym36$CONS = makeSymbol( "CONS" );
    $list37 = ConsesLow.list( makeSymbol( "*PPH-OPERATOR-SCOPE-CONTEXT*" ) );
    $sym38$PPH_NOTE = makeSymbol( "PPH-NOTE" );
    $str39$Inside_operator_scope__S = makeString( "Inside operator scope ~S" );
    $str40$Leaving_operator_scope__S = makeString( "Leaving operator scope ~S" );
    $kw41$NO = makeKeyword( "NO" );
    $kw42$IMPLIES = makeKeyword( "IMPLIES" );
    $str43$______ = makeString( "______" );
    $str44$Gen_Template_Store_Lock = makeString( "Gen-Template Store Lock" );
    $sym45$_PPH_DATA_STRUCTURES_CODE_REVISION_ = makeSymbol( "*PPH-DATA-STRUCTURES-CODE-REVISION*" );
    $kw46$UNKNOWN_SOURCE = makeKeyword( "UNKNOWN-SOURCE" );
    $str47$Noting_unexpressed_negation_from_ = makeString( "Noting unexpressed negation from ~S" );
    $str48$Assuming_we_just_expressed_the_ne = makeString( "Assuming we just expressed the negation of ~S" );
    $str49$Supposedly_expressed_negation_of_ = makeString( "Supposedly expressed negation of ~S,~% but didn't realize that it was unexpressed." );
    $kw50$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $list51 = ConsesLow.list( ZERO_INTEGER );
    $kw52$OFF = makeKeyword( "OFF" );
    $kw53$NOT_GATHERING = makeKeyword( "NOT-GATHERING" );
    $sym54$WARN_ABOUT_PPH_QUERY_RETENTION = makeSymbol( "WARN-ABOUT-PPH-QUERY-RETENTION" );
    $str55$Retain_PPH_queries_is__S_for__S = makeString( "Retain PPH queries is ~S for ~S" );
    $sym56$_WARN_ABOUT_PPH_QUERY_RETENTION_CACHING_STATE_ = makeSymbol( "*WARN-ABOUT-PPH-QUERY-RETENTION-CACHING-STATE*" );
    $kw57$PPH_BAD_TEMPLATE_DUMMY = makeKeyword( "PPH-BAD-TEMPLATE-DUMMY" );
    $kw58$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw59$INITIALIZED = makeKeyword( "INITIALIZED" );
    $str60$_PPH_error_level_ = makeString( "(PPH error level " );
    $str61$__ = makeString( ") " );
    $str62$No_KB_loaded__Couldn_t_initialize = makeString( "No KB loaded. Couldn't initialize paraphrase vars." );
    $kw63$NO_KB_LOADED = makeKeyword( "NO-KB-LOADED" );
    $list64 = ConsesLow.list( makeString( "CyclishParaphraseMt" ), makeString( "EnglishParaphraseMt" ), makeString( "BaseKB" ) );
    $const65$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $const66$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $list67 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ) );
  }
}
/*
 * 
 * Total time: 216 ms
 * 
 */