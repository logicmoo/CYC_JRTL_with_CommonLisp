package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.sksi.data_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.nl.scg_api;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cure_api
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cure_api";
  public static final String myFingerPrint = "dc0e43d75154ecb77f48ab48e68e8f718869dd6e892b4453c57bbe8b4427b517";
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 832L)
  private static SubLSymbol $term_learner_user_created_term_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 959L)
  private static SubLSymbol $term_learner_user_added_types_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1080L)
  private static SubLSymbol $term_learner_accepted_meanings_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1203L)
  private static SubLSymbol $term_learner_use_lexical_lookup_only$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1448L)
  private static SubLSymbol $current_tl_task$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1555L)
  public static SubLSymbol $term_learner_default_lexical_assertion_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1637L)
  private static SubLSymbol $cure_edit_the_list_termsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1721L)
  public static SubLSymbol $cure_allow_some_predicates_to_be_edited$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 25243L)
  private static SubLSymbol $default_create_as_type_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 27577L)
  private static SubLSymbol $allow_changes_to_focal_term_on_replicate$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 67641L)
  private static SubLSymbol $term_learner_valid_substitution_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 83661L)
  public static SubLSymbol $term_learner_unknown_status$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 83833L)
  public static SubLSymbol $term_learner_known_removable$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 83916L)
  public static SubLSymbol $term_learner_known_derived$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84052L)
  public static SubLSymbol $term_learner_unknown_assertible$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84140L)
  public static SubLSymbol $term_learner_impossible$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84278L)
  public static SubLSymbol $term_learner_cyc_error$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84356L)
  public static SubLSymbol $term_learner_downstream_error$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84445L)
  public static SubLSymbol $term_learner_working$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84516L)
  public static SubLSymbol $term_learner_known_not_removable$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84637L)
  public static SubLSymbol $term_learner_rejected$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84758L)
  public static SubLSymbol $term_learner_incomplete$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 84907L)
  private static SubLSymbol $term_learner_unmodifiable$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 87105L)
  private static SubLSymbol $term_learner_fact_status_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 90366L)
  private static SubLSymbol $followup_query_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97349L)
  private static SubLSymbol $term_learner_category_label_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97989L)
  private static SubLSymbol $get_followup_categories_for_type_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98214L)
  private static SubLSymbol $get_pred_list_order_for_type_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99518L)
  private static SubLSymbol $substitutable_arg_constraint_for_reln_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 101584L)
  private static SubLSymbol $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 103784L)
  private static SubLSymbol $summary_pred_sort_order_for_focal_term_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 107962L)
  private static SubLSymbol $followup_query_mt_for_user_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 108812L)
  private static SubLSymbol $followup_query_mt_for_userXtask_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 109540L)
  private static SubLSymbol $cure_show_best_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 109701L)
  private static SubLSymbol $term_learner_known_bindings_for_sentence_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112364L)
  private static SubLSymbol $term_learner_known_negated_bindings_for_sentence_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112632L)
  private static SubLSymbol $term_learner_types_for_fragment_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 120483L)
  private static SubLSymbol $sources_of_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 124825L)
  private static SubLSymbol $get_arg_positions_for_terms_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 140799L)
  private static SubLSymbol $delete_me_token$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 147332L)
  public static SubLSymbol $term_learner_source_documentation_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 147700L)
  public static SubLSymbol $source_spindle$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 147772L)
  public static SubLSymbol $source_spindle_query_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 148049L)
  private static SubLSymbol $term_learner_default_generation_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157403L)
  private static SubLSymbol $normalize_cure_user_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158194L)
  public static SubLSymbol $term_learner_base_source_creation_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158309L)
  private static SubLSymbol $term_learner_assert_redundant_mt_info$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158766L)
  private static SubLSymbol $default_assert_mt_for_user_and_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 161237L)
  public static SubLSymbol $term_learner_sub_source_creation_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 170936L)
  public static SubLSymbol $needs_approval$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171080L)
  public static SubLSymbol $disapproved$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171132L)
  public static SubLSymbol $approved$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176161L)
  private static SubLSymbol $term_learner_type_prompt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176670L)
  private static SubLSymbol $term_learner_term_header_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179296L)
  private static SubLSymbol $default_task_for_user_int_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179639L)
  private static SubLSymbol $query_mt_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179757L)
  private static SubLSymbol $wff_checking_mt_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179889L)
  private static SubLSymbol $query_mt_for_user_and_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180078L)
  private static SubLSymbol $wff_checking_mt_for_user_and_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 189611L)
  private static SubLSymbol $term_learner_cloud_display_nl_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190017L)
  private static SubLSymbol $term_learner_displayable_generalizationP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190282L)
  private static SubLSymbol $term_learner_possibly_relevant_generalizationP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190714L)
  private static SubLSymbol $term_learner_irrelevance_listener$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 191630L)
  public static SubLSymbol $cb_show_followup_widget$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  private static SubLSymbol $cb_cure_external_host$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  private static SubLSymbol $cb_cure_external_port$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  private static SubLSymbol $cb_cure_external_context_path$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  private static SubLSymbol $cb_cure_internal_context_path$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLSymbol $cb_cure_internal_host_override$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLSymbol $cb_cure_internal_port_override$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLSymbol $cb_show_cure_link$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 195210L)
  private static SubLSymbol $sentence_score_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196168L)
  private static SubLSymbol $sentence_score_for_type_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196865L)
  private static SubLSymbol $set_query_variable_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 198901L)
  private static SubLSymbol $get_fragments_for_terms_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 209392L)
  private static SubLSymbol $collection_via_web_searchP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 216218L)
  private static SubLSymbol $get_concept_tags_from_string_caching_state$;
  private static final SubLString $str0$_cyc_projects_doc_annotation_logs;
  private static final SubLString $str1$_cyc_projects_doc_annotation_logs;
  private static final SubLString $str2$_cyc_projects_doc_annotation_logs;
  private static final SubLObject $const3$EnglishMt;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw7$RENDERERS;
  private static final SubLSymbol $kw8$ORIGINAL_CYCL;
  private static final SubLSymbol $kw9$DISPLAY;
  private static final SubLSymbol $kw10$REQUIRED;
  private static final SubLSymbol $kw11$APPROVAL_CODE;
  private static final SubLSymbol $kw12$UNASSERTIBLE_SENTENCE_IDS;
  private static final SubLSymbol $sym13$NEW_TERM_LEARNER_TYPE_INT;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$ORIGINAL_SENTENCE;
  private static final SubLSymbol $kw17$CURRENT_BINDINGS;
  private static final SubLSymbol $kw18$SUGGESTIONS;
  private static final SubLSymbol $kw19$JUSTIFICATIONS;
  private static final SubLSymbol $kw20$DEFAULT;
  private static final SubLSymbol $kw21$FRAGMENT_JUSTIFICATION;
  private static final SubLSymbol $kw22$NL_MT;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$DISPLAY_CYCL;
  private static final SubLSymbol $kw25$STATUS;
  private static final SubLSymbol $kw26$CLARIFYING_CYCL;
  private static final SubLSymbol $sym27$TERM_LEARNER_TYPE_FOR_FRAGMENT_INT;
  private static final SubLSymbol $sym28$TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING;
  private static final SubLString $str29$___A__entering__S__;
  private static final SubLSymbol $kw30$APPEND;
  private static final SubLString $str31$Unable_to_open__S;
  private static final SubLString $str32$writing_to__S;
  private static final SubLSymbol $sym33$LEARN;
  private static final SubLSymbol $sym34$GET;
  private static final SubLSymbol $kw35$IS_NER_ENTRY_;
  private static final SubLSymbol $kw36$DENOT;
  private static final SubLString $str37$no_new_creation;
  private static final SubLObject $const38$Thing;
  private static final SubLObject $const39$CycAssistedDocumentReader;
  private static final SubLSymbol $kw40$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym41$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str42$_input_date___A___S__input___;
  private static final SubLString $str43$Currently_Unknown_to_Cyc;
  private static final SubLString $str44$vocabMarking;
  private static final SubLSymbol $sym45$TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM;
  private static final SubLSymbol $sym46$TERM_LEARNER_OBJECT_FROM_ID;
  private static final SubLList $list47;
  private static final SubLObject $const48$Individual;
  private static final SubLObject $const49$Collection;
  private static final SubLString $str50$;
  private static final SubLSymbol $kw51$UPCASE;
  private static final SubLSymbol $sym52$CONTROL_CHAR_P;
  private static final SubLObject $const53$inProgressTerm;
  private static final SubLObject $const54$BaseKB;
  private static final SubLObject $const55$isa;
  private static final SubLObject $const56$DocIngesterUserCreatedTerm;
  private static final SubLObject $const57$quotedIsa;
  private static final SubLList $list58;
  private static final SubLObject $const59$termStrings;
  private static final SubLObject $const60$and;
  private static final SubLObject $const61$ist_Asserted;
  private static final SubLSymbol $sym62$__MT;
  private static final SubLList $list63;
  private static final SubLObject $const64$InferencePSC;
  private static final SubLString $str65$___;
  private static final SubLSymbol $kw66$MEANING;
  private static final SubLSymbol $kw67$STRING;
  private static final SubLSymbol $sym68$DELETE_ENTRY_FROM_STRING;
  private static final SubLSymbol $sym69$LEARNED;
  private static final SubLSymbol $sym70$TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$_STRING;
  private static final SubLObject $const73$assertedSentence;
  private static final SubLList $list74;
  private static final SubLObject $const75$is_Underspecified;
  private static final SubLObject $const76$genls;
  private static final SubLSymbol $sym77$_;
  private static final SubLSymbol $sym78$GET_WEIGHT;
  private static final SubLSymbol $kw79$TYPE_PROMPT;
  private static final SubLSymbol $kw80$TYPE_HEADER;
  private static final SubLSymbol $kw81$TYPE_ALT_PHRASES;
  private static final SubLSymbol $kw82$LEXICAL_TYPES;
  private static final SubLSymbol $sym83$GET_TAXONOMIC_RENDERERS_FOR_TERM;
  private static final SubLString $str84$specs;
  private static final SubLString $str85$instances;
  private static final SubLString $str86$superiors;
  private static final SubLString $str87$genls;
  private static final SubLString $str88$isa;
  private static final SubLString $str89$Unimplemented_attempt_to_get__S_f;
  private static final SubLString $str90$string;
  private static final SubLSymbol $sym91$_EXIT;
  private static final SubLSymbol $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_;
  private static final SubLSymbol $sym93$GENLS_;
  private static final SubLSymbol $kw94$ASSERT_SENTENCE;
  private static final SubLSymbol $kw95$ASSERT_MT;
  private static final SubLSymbol $sym96$ASSERTION_IST_FORMULA;
  private static final SubLSymbol $kw97$USER;
  private static final SubLFloat $float98$0_9;
  private static final SubLSymbol $sym99$_EXCLUDE_VULGARITIES__;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$_EXCLUDE_SLANG__;
  private static final SubLSymbol $sym102$_EXCLUDE_ARCHAIC_SPEECH__;
  private static final SubLSymbol $sym103$_EXCLUDE_INDIRECT_RELATIONS__;
  private static final SubLSymbol $sym104$SHORTER_P;
  private static final SubLSymbol $sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS;
  private static final SubLString $str106$_;
  private static final SubLString $str107$_;
  private static final SubLSymbol $sym108$TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE;
  private static final SubLString $str109$_input_cyctermid___A__date___A___;
  private static final SubLObject $const110$CollectionType;
  private static final SubLSymbol $sym111$DEFAULT_CREATE_AS_TYPE;
  private static final SubLSymbol $sym112$_PRED;
  private static final SubLObject $const113$defaultAutotypeSuggestionFromType;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$_DEFAULT_CREATE_AS_TYPE_CACHING_STATE_;
  private static final SubLSymbol $kw117$CYCL;
  private static final SubLSymbol $kw118$WEIGHT;
  private static final SubLSymbol $kw119$CONCEPT_ID;
  private static final SubLSymbol $kw120$NL_STRING;
  private static final SubLSymbol $kw121$LEGEND_STRING;
  private static final SubLSymbol $kw122$ASSERT_SENTENCE_ID;
  private static final SubLSymbol $kw123$STATUS_CODE;
  private static final SubLSymbol $kw124$REPLICATION_SENTENCE_ID;
  private static final SubLSymbol $sym125$GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING;
  private static final SubLSymbol $sym126$GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID;
  private static final SubLSymbol $sym127$GET_TERM_LEARNER_RENDERER_FOR_CYCL;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING;
  private static final SubLSymbol $sym131$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID;
  private static final SubLSymbol $sym132$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL;
  private static final SubLSymbol $sym133$GET_TERM_LEARNER_STRING_RENDERER_FROM_OPEN_SELECT_RENDERER_LIST;
  private static final SubLSymbol $kw134$RENDERER_TYPE;
  private static final SubLSymbol $kw135$OPEN_SELECT_RENDERER;
  private static final SubLSymbol $kw136$INITIALLY_SELECTED;
  private static final SubLSymbol $kw137$SELECTION_RENDERERS;
  private static final SubLSymbol $kw138$STRING_RENDERER;
  private static final SubLSymbol $kw139$DISPLAY_LINK;
  private static final SubLSymbol $kw140$PPH_EMPTY_CYCL;
  private static final SubLSymbol $kw141$GENLS;
  private static final SubLSymbol $kw142$GENLS_CONSTRAINTS;
  private static final SubLSymbol $kw143$ISA;
  private static final SubLSymbol $kw144$ISA_CONSTRAINTS;
  private static final SubLSymbol $kw145$MODIFIABLE_STRING_RENDERER;
  private static final SubLSymbol $kw146$ARG_POS;
  private static final SubLSymbol $kw147$MODIFIABLE_TEXT_RENDERER;
  private static final SubLString $str148$Some_other_;
  private static final SubLString $str149$Something_else;
  private static final SubLList $list150;
  private static final SubLSymbol $kw151$CONSTRAINT_STRING;
  private static final SubLSymbol $kw152$ALLOW_DUPLICATION;
  private static final SubLSymbol $sym153$_;
  private static final SubLSymbol $sym154$GENERALITY_ESTIMATE;
  private static final SubLSymbol $sym155$THCL_FORT_;
  private static final SubLList $list156;
  private static final SubLSymbol $kw157$TEXT_MATCHES;
  private static final SubLList $list158;
  private static final SubLSymbol $kw159$VALID;
  private static final SubLString $str160$newValue;
  private static final SubLSymbol $kw161$CYCL_ID;
  private static final SubLSymbol $kw162$JUSTIFICATION;
  private static final SubLSymbol $sym163$TERM_LEARNER_ADD_LEXICAL_PHRASE;
  private static final SubLString $str164$userAction;
  private static final SubLString $str165$termString;
  private static final SubLString $str166$choiceid;
  private static final SubLString $str167$justifications;
  private static final SubLString $str168$sentenceId;
  private static final SubLString $str169$termId;
  private static final SubLString $str170$title;
  private static final SubLString $str171$url;
  private static final SubLString $str172$code;
  private static final SubLSymbol $kw173$SENTENCE_ID;
  private static final SubLSymbol $kw174$NEW_SENTENCE_ID;
  private static final SubLString $str175$newSentenceId;
  private static final SubLString $str176$status;
  private static final SubLSymbol $kw177$UNINITIALIZED;
  private static final SubLSymbol $kw178$NEW_CYCL;
  private static final SubLString $str179$newCycLSentenceHLIDString;
  private static final SubLSymbol $kw180$NEW_CYCL_HL_ID;
  private static final SubLString $str181$newCycLSentenceDisplayString;
  private static final SubLString $str182$newNLSentence;
  private static final SubLString $str183$justification;
  private static final SubLSymbol $sym184$XML_TERM_LEARNER_USER_CHOICE;
  private static final SubLSymbol $kw185$XML_HANDLER;
  private static final SubLList $list186;
  private static final SubLString $str187$cyclarg;
  private static final SubLString $str188$stringarg;
  private static final SubLString $str189$assert;
  private static final SubLSymbol $kw190$ASSERT;
  private static final SubLString $str191$replace;
  private static final SubLSymbol $kw192$REPLACE;
  private static final SubLString $str193$unassert;
  private static final SubLSymbol $kw194$UNASSERT;
  private static final SubLSymbol $sym195$TERM_LEARNER_USER_CHOICE;
  private static final SubLSymbol $kw196$REJECT;
  private static final SubLList $list197;
  private static final SubLList $list198;
  private static final SubLSymbol $kw199$ACCEPT;
  private static final SubLSymbol $kw200$NEW_NL_SENTENCE;
  private static final SubLSymbol $kw201$NEW_CYCL_SENTENCE_STRING;
  private static final SubLString $str202$argpos;
  private static final SubLString $str203$sentence;
  private static final SubLSymbol $sym204$XML_TERM_LEARNER_CREATE_NEW;
  private static final SubLSymbol $sym205$LISTP;
  private static final SubLSymbol $sym206$_X88928381ASDF;
  private static final SubLSymbol $sym207$CURE_ASSERT_SENTENCE;
  private static final SubLSymbol $sym208$CURE_UNASSERT_SENTENCE;
  private static final SubLSymbol $sym209$CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE;
  private static final SubLObject $const210$termDependsOn;
  private static final SubLObject $const211$UniversalVocabularyMt;
  private static final SubLSymbol $kw212$NL;
  private static final SubLSymbol $kw213$HL_ID;
  private static final SubLSymbol $sym214$TERM_LEARNER_CREATE_NEW;
  private static final SubLSymbol $sym215$HTML_URL_DECODE;
  private static final SubLSymbol $sym216$GET_BASE_SENTENCE_FROM_SENTENCE_STRING;
  private static final SubLSymbol $kw217$NEW_TERM;
  private static final SubLSymbol $sym218$TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE;
  private static final SubLString $str219$spec;
  private static final SubLString $str220$instance;
  private static final SubLSymbol $kw221$INVALID;
  private static final SubLSymbol $sym222$FIND_BY_ID_STRING_P;
  private static final SubLSymbol $sym223$DECODE_ID_STRING;
  private static final SubLSymbol $sym224$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLString $str225$argPos;
  private static final SubLString $str226$limit;
  private static final SubLSymbol $sym227$XML_TERM_LEARNER_USER_SUBSTITUTION;
  private static final SubLSymbol $sym228$TERM_LEARNER_USER_SUBSTITUTION;
  private static final SubLString $str229$100;
  private static final SubLString $str230$_;
  private static final SubLSymbol $sym231$_THIS_QUERY_VAR;
  private static final SubLObject $const232$String;
  private static final SubLSymbol $sym233$NUMBERP;
  private static final SubLSymbol $sym234$SECOND_TRUE;
  private static final SubLSymbol $sym235$THIRD;
  private static final SubLList $list236;
  private static final SubLString $str237$Timeout_attempting_to_call_SCG_on;
  private static final SubLSymbol $sym238$TERM_LEARNER_VALID_SUBSTITUTION;
  private static final SubLSymbol $sym239$_TERM_LEARNER_VALID_SUBSTITUTION_CACHING_STATE_;
  private static final SubLSymbol $sym240$CLEAR_TERM_LEARNER_VALID_SUBSTITUTION;
  private static final SubLSymbol $sym241$LENGTH;
  private static final SubLSymbol $sym242$XML_TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION;
  private static final SubLSymbol $sym243$TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION;
  private static final SubLSymbol $sym244$RKF_STANDARD_STRING_WORDIFY;
  private static final SubLSymbol $kw245$LEXICON;
  private static final SubLSymbol $kw246$OUTPUT_SPEC;
  private static final SubLList $list247;
  private static final SubLSymbol $sym248$FIRST_TRUE;
  private static final SubLSymbol $sym249$TERM_LEARNER_AUTOCOMPLETE_NATIVE;
  private static final SubLList $list250;
  private static final SubLList $list251;
  private static final SubLSymbol $kw252$LIMIT;
  private static final SubLSymbol $kw253$RETURN_ATTRS;
  private static final SubLSymbol $kw254$SENTENCE;
  private static final SubLSymbol $kw255$CASE_SENSITIVE;
  private static final SubLSymbol $kw256$CONSTANTS;
  private static final SubLSymbol $sym257$TERM_LEARNER_AUTOCOMPLETE_INT;
  private static final SubLSymbol $sym258$TO_STRING;
  private static final SubLSymbol $sym259$COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLList $list260;
  private static final SubLSymbol $sym261$TERM_LEARNER_AUTOCOMPLETE;
  private static final SubLList $list262;
  private static final SubLList $list263;
  private static final SubLString $str264$20;
  private static final SubLString $str265$Mww;
  private static final SubLString $str266$nil;
  private static final SubLList $list267;
  private static final SubLString $str268$prefix;
  private static final SubLString $str269$count;
  private static final SubLSymbol $sym270$XML_TERM_LEARNER_AUTOCOMPLETE;
  private static final SubLList $list271;
  private static final SubLSymbol $sym272$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const273$EverythingPSC;
  private static final SubLSymbol $kw274$ISA_FILTER;
  private static final SubLSymbol $kw275$GENLS_FILTER;
  private static final SubLSymbol $kw276$ISA_RESTRICTIONS;
  private static final SubLSymbol $kw277$GENLS_RESTRICTIONS;
  private static final SubLSymbol $kw278$TIMEOUT;
  private static final SubLSymbol $kw279$CASE_SENSITIVE_;
  private static final SubLSymbol $kw280$COMPLETE_ON_CONSTANTS_;
  private static final SubLSymbol $sym281$GET_ALLOTTED_TASKS;
  private static final SubLSymbol $sym282$_X;
  private static final SubLList $list283;
  private static final SubLObject $const284$or;
  private static final SubLObject $const285$thereExists;
  private static final SubLSymbol $sym286$_CURRENT_TASK;
  private static final SubLList $list287;
  private static final SubLObject $const288$cureUserModel;
  private static final SubLSymbol $sym289$_MONAD_USER;
  private static final SubLObject $const290$allottedAgents;
  private static final SubLObject $const291$AnalystDatabaseMt;
  private static final SubLList $list292;
  private static final SubLObject $const293$MtUnionFn;
  private static final SubLList $list294;
  private static final SubLSymbol $sym295$TERM_LEARNER_GET_FACT_SHEET_FOR_TERM;
  private static final SubLString $str296$_html__body_No_known_facts__body_;
  private static final SubLSymbol $kw297$NORMAL;
  private static final SubLString $str298$_;
  private static final SubLSymbol $sym299$TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM;
  private static final SubLList $list300;
  private static final SubLList $list301;
  private static final SubLSymbol $kw302$SLOT_VALUE_PREFERENCE_PATTERN;
  private static final SubLSymbol $kw303$NOT;
  private static final SubLSymbol $kw304$OR;
  private static final SubLString $str305$Fact_sheet_properties___S;
  private static final SubLString $str306$preferSlotValueFormatForTermLearn;
  private static final SubLSymbol $kw307$ALLOW_ABNORMALITY_CHECKING_;
  private static final SubLSymbol $kw308$MAX_PROBLEM_COUNT;
  private static final SubLInteger $int309$1000;
  private static final SubLSymbol $kw310$EVALUATE_SUBL_ALLOWED_;
  private static final SubLSymbol $kw311$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw313$MAX_NUMBER;
  private static final SubLSymbol $kw314$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw315$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw316$CONTINUABLE_;
  private static final SubLSymbol $kw317$PRODUCTIVITY_LIMIT;
  private static final SubLInteger $int318$100;
  private static final SubLString $str319$forbidSlotValueFormatForTermLearn;
  private static final SubLSymbol $kw320$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw321$HL;
  private static final SubLList $list322;
  private static final SubLSymbol $sym323$TERM_LEARNER_FACT_STATUS;
  private static final SubLSymbol $kw324$TERM;
  private static final SubLString $str325$null;
  private static final SubLSymbol $sym326$TERM_LEARNER_FACT_STATUS_INT;
  private static final SubLString $str327$Derived_from_other_assertions;
  private static final SubLSymbol $sym328$_TERM_LEARNER_FACT_STATUS_INT_CACHING_STATE_;
  private static final SubLSymbol $sym329$CLEAR_TERM_LEARNER_FACT_STATUS_INT;
  private static final SubLSymbol $sym330$TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL;
  private static final SubLList $list331;
  private static final SubLString $str332$conceptId;
  private static final SubLString $str333$max;
  private static final SubLString $str334$questionsOnly;
  private static final SubLString $str335$true;
  private static final SubLString $str336$unknownOnly;
  private static final SubLString $str337$user;
  private static final SubLObject $const338$CycAdministrator;
  private static final SubLString $str339$ignoreList;
  private static final SubLSymbol $sym340$XML_TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM;
  private static final SubLSymbol $sym341$TERM_LEARNER_GET_FOLLOWUPS_FOR_CYCL_TERM;
  private static final SubLSymbol $sym342$TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM;
  private static final SubLSymbol $kw343$UNCATEGORIZED;
  private static final SubLSymbol $kw344$TYPES;
  private static final SubLSymbol $kw345$BLANKS;
  private static final SubLSymbol $sym346$EQUALS_EL_;
  private static final SubLSymbol $kw347$CATEGORY_INFO;
  private static final SubLList $list348;
  private static final SubLSymbol $sym349$HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY;
  private static final SubLSymbol $kw350$CATEGORY;
  private static final SubLSymbol $kw351$CATEGORY_NL;
  private static final SubLObject $const352$EnglishParaphraseMt;
  private static final SubLSymbol $sym353$TERM_LEARNER_CATEGORY_LABEL;
  private static final SubLString $str354$Advanced_Info;
  private static final SubLObject $const355$termSummaryPredicateLabel;
  private static final SubLSymbol $kw356$GAF;
  private static final SubLObject $const357$genStringAssertion;
  private static final SubLSymbol $sym358$_TERM_LEARNER_CATEGORY_LABEL_CACHING_STATE_;
  private static final SubLSymbol $sym359$CLEAR_TERM_LEARNER_CATEGORY_LABEL;
  private static final SubLSymbol $sym360$GET_FOLLOWUP_CATEGORIES_FOR_TYPE;
  private static final SubLSymbol $sym361$_CAT;
  private static final SubLObject $const362$subtopicCollectionForCategory;
  private static final SubLSymbol $sym363$_GET_FOLLOWUP_CATEGORIES_FOR_TYPE_CACHING_STATE_;
  private static final SubLInteger $int364$1024;
  private static final SubLSymbol $sym365$CLEAR_GET_FOLLOWUP_CATEGORIES_FOR_TYPE;
  private static final SubLSymbol $sym366$GET_PRED_LIST_ORDER_FOR_TYPE;
  private static final SubLSymbol $sym367$_PRED_LIST;
  private static final SubLObject $const368$summaryPredicateWRTSetOrCollectio;
  private static final SubLList $list369;
  private static final SubLSymbol $sym370$_GET_PRED_LIST_ORDER_FOR_TYPE_CACHING_STATE_;
  private static final SubLSymbol $sym371$CLEAR_GET_PRED_LIST_ORDER_FOR_TYPE;
  private static final SubLObject $const372$not;
  private static final SubLSymbol $sym373$EL_VARIABLE_P;
  private static final SubLSymbol $sym374$SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN;
  private static final SubLSymbol $sym375$_COL;
  private static final SubLObject $const376$argGenl;
  private static final SubLList $list377;
  private static final SubLSymbol $sym378$_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN_CACHING_STATE_;
  private static final SubLInteger $int379$256;
  private static final SubLSymbol $sym380$CLEAR_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN;
  private static final SubLList $list381;
  private static final SubLSymbol $sym382$_N;
  private static final SubLObject $const383$equalSymbols;
  private static final SubLSymbol $sym384$_TERM;
  private static final SubLObject $const385$argN;
  private static final SubLSymbol $sym386$_SENTENCE_PRED;
  private static final SubLList $list387;
  private static final SubLList $list388;
  private static final SubLList $list389;
  private static final SubLList $list390;
  private static final SubLList $list391;
  private static final SubLList $list392;
  private static final SubLList $list393;
  private static final SubLList $list394;
  private static final SubLList $list395;
  private static final SubLSymbol $sym396$CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING;
  private static final SubLList $list397;
  private static final SubLList $list398;
  private static final SubLList $list399;
  private static final SubLSymbol $sym400$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $kw401$TRUE;
  private static final SubLList $list402;
  private static final SubLSymbol $sym403$_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING_CACH;
  private static final SubLSymbol $sym404$CLEAR_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING;
  private static final SubLSymbol $sym405$FIRST;
  private static final SubLSymbol $sym406$SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM;
  private static final SubLList $list407;
  private static final SubLList $list408;
  private static final SubLList $list409;
  private static final SubLSymbol $sym410$GENERALITY_ESTIMATE_;
  private static final SubLList $list411;
  private static final SubLSymbol $sym412$CDADR;
  private static final SubLSymbol $sym413$_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM_CACHING_STATE_;
  private static final SubLInteger $int414$128;
  private static final SubLSymbol $sym415$CLEAR_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM;
  private static final SubLString $str416$_______________________________Fo;
  private static final SubLString $str417$_______________________________Fo;
  private static final SubLString $str418$_______________________________Fr;
  private static final SubLString $str419$_______________________________Fr;
  private static final SubLString $str420$_______________________________Un;
  private static final SubLSymbol $sym421$FOLLOWUP_QUERY_MT_FOR_USER;
  private static final SubLSymbol $sym422$_TOPIC;
  private static final SubLObject $const423$interests;
  private static final SubLList $list424;
  private static final SubLObject $const425$DocumentReaderFollowupsForInteres;
  private static final SubLSymbol $sym426$_FOLLOWUP_QUERY_MT_FOR_USER_CACHING_STATE_;
  private static final SubLSymbol $sym427$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER;
  private static final SubLSymbol $sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK;
  private static final SubLSymbol $sym429$_MT;
  private static final SubLObject $const430$defaultCUREGuidanceMt;
  private static final SubLObject $const431$SpecificationVariantFn;
  private static final SubLList $list432;
  private static final SubLObject $const433$analysisTask;
  private static final SubLList $list434;
  private static final SubLSymbol $sym435$_FOLLOWUP_QUERY_MT_FOR_USER_TASK_CACHING_STATE_;
  private static final SubLSymbol $sym436$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER_TASK;
  private static final SubLSymbol $sym437$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE;
  private static final SubLList $list438;
  private static final SubLObject $const439$nearestIsa;
  private static final SubLObject $const440$nearestGenls;
  private static final SubLObject $const441$commonAilmentCause;
  private static final SubLObject $const442$objectFoundInLocation;
  private static final SubLObject $const443$properlyGeographicallySubsumes;
  private static final SubLObject $const444$MtSpace;
  private static final SubLObject $const445$AnytimePSC;
  private static final SubLSymbol $sym446$_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_CACHING_STATE_;
  private static final SubLSymbol $sym447$CLEAR_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE;
  private static final SubLList $list448;
  private static final SubLSymbol $sym449$TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE;
  private static final SubLSymbol $sym450$_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE_CACHING_STATE_;
  private static final SubLSymbol $sym451$CLEAR_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE;
  private static final SubLSymbol $sym452$TERM_LEARNER_TYPES_FOR_FRAGMENT;
  private static final SubLSymbol $sym453$_TERM_LEARNER_TYPES_FOR_FRAGMENT_CACHING_STATE_;
  private static final SubLSymbol $sym454$CLEAR_TERM_LEARNER_TYPES_FOR_FRAGMENT;
  private static final SubLObject $const455$singleEntryFormatInArgs;
  private static final SubLObject $const456$List;
  private static final SubLObject $const457$CharacterString;
  private static final SubLSymbol $sym458$_Y;
  private static final SubLObject $const459$TheList;
  private static final SubLList $list460;
  private static final SubLList $list461;
  private static final SubLObject $const462$constrainKnownValuesForPredRelati;
  private static final SubLList $list463;
  private static final SubLObject $const464$SentenceOfCWFn;
  private static final SubLList $list465;
  private static final SubLList $list466;
  private static final SubLObject $const467$WebPageCWFn;
  private static final SubLList $list468;
  private static final SubLSymbol $sym469$SOURCES_OF_MT;
  private static final SubLSymbol $sym470$_PCW;
  private static final SubLObject $const471$contextOfPCWInterpretation;
  private static final SubLList $list472;
  private static final SubLSymbol $sym473$_SOURCES_OF_MT_CACHING_STATE_;
  private static final SubLSymbol $sym474$CLEAR_SOURCES_OF_MT;
  private static final SubLSymbol $sym475$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE;
  private static final SubLList $list476;
  private static final SubLSymbol $sym477$JAVA_RENDERING_P;
  private static final SubLSymbol $sym478$JAVA_RENDERING_TO_SELECTION_RENDERER;
  private static final SubLSymbol $sym479$GET_ARG_POSITIONS_FOR_TERMS;
  private static final SubLSymbol $sym480$_GET_ARG_POSITIONS_FOR_TERMS_CACHING_STATE_;
  private static final SubLSymbol $kw481$PPH_UNKNOWN_ARG_POSITION;
  private static final SubLSymbol $sym482$PPH_JAVALIST_ITEM_STRING;
  private static final SubLSymbol $sym483$CB_NAUT_FRAME;
  private static final SubLSymbol $sym484$PPH_NAUT_ID_FN;
  private static final SubLSymbol $kw485$INTERROGATIVE;
  private static final SubLString $str486$__;
  private static final SubLString $str487$_;
  private static final SubLSymbol $sym488$PPH_PHRASE_OUTPUT_LIST_P;
  private static final SubLSymbol $kw489$CHOOSE_A_VALUE;
  private static final SubLString $str490$Choose_a_value;
  private static final SubLInteger $int491$40;
  private static final SubLList $list492;
  private static final SubLSymbol $kw493$IGNORE;
  private static final SubLList $list494;
  private static final SubLSymbol $sym495$TERM_LEARNER_TYPES_FOR_SENTENCE;
  private static final SubLSymbol $sym496$TERM_LEARNER_TYPES_FOR_SENTENCE_ID;
  private static final SubLList $list497;
  private static final SubLString $str498$add_before;
  private static final SubLSymbol $sym499$_NEW_VAR;
  private static final SubLString $str500$remove;
  private static final SubLString $str501$can_t_duplicate_with_uninterpreta;
  private static final SubLSymbol $sym502$CURE_POSSIBLY_DUPLICATE_ARG;
  private static final SubLSymbol $kw503$TEST;
  private static final SubLSymbol $kw504$OWNER;
  private static final SubLSymbol $kw505$CLASSES;
  private static final SubLSymbol $kw506$KB;
  private static final SubLSymbol $kw507$FULL;
  private static final SubLSymbol $kw508$WORKING_;
  private static final SubLList $list509;
  private static final SubLObject $const510$DocumentationPredicate;
  private static final SubLObject $const511$equals;
  private static final SubLSymbol $kw512$LENIENT;
  private static final SubLSymbol $sym513$STRINGP;
  private static final SubLString $str514$WebDocumentsMt;
  private static final SubLObject $const515$WebDocumentsMt;
  private static final SubLObject $const516$MassMediaDataMt;
  private static final SubLString $str517$Unable_to_initialize__A__;
  private static final SubLObject $const518$AssistedReaderSourceSpindle;
  private static final SubLObject $const519$AssistedReaderSourceSpindleCollec;
  private static final SubLObject $const520$TechnicalEnglishLexicalMt;
  private static final SubLObject $const521$MedicalLexicalMt;
  private static final SubLSymbol $kw522$PPH_LEXICAL_CONTEXT;
  private static final SubLSymbol $kw523$PPH_AGREEMENT;
  private static final SubLSymbol $sym524$GET_CYCL;
  private static final SubLList $list525;
  private static final SubLSymbol $sym526$TERM_LEARNER_HANDLE_USER_CHOICE;
  private static final SubLSymbol $sym527$TERM_EXPANSION_EXPECTED_SENTENCE_;
  private static final SubLSymbol $sym528$TRANSFORM_TO_TRUE;
  private static final SubLSymbol $sym529$ASSERTION_MT;
  private static final SubLSymbol $kw530$CHOICE_ID;
  private static final SubLString $str531$Error_while_trying_to_handle_;
  private static final SubLSymbol $kw532$NEW_SENTENCE_CYCL;
  private static final SubLString $str533$_accepted_meaning_date___A__user_;
  private static final SubLObject $const534$True;
  private static final SubLObject $const535$termExpansionExpected;
  private static final SubLObject $const536$UnsourcedDataForUserByTaskMtFn;
  private static final SubLObject $const537$userTaskSortsWorkBySourceDocument;
  private static final SubLSymbol $sym538$NORMALIZE_CURE_USER;
  private static final SubLSymbol $sym539$_BASE_USER;
  private static final SubLSymbol $sym540$_TASK;
  private static final SubLSymbol $sym541$_NORMALIZE_CURE_USER_CACHING_STATE_;
  private static final SubLInteger $int542$32;
  private static final SubLSymbol $kw543$NOTHING;
  private static final SubLSymbol $kw544$TOOL;
  private static final SubLString $str545$term_learner_base_source_creation;
  private static final SubLObject $const546$AssistedReaderSourceSpindleForTas;
  private static final SubLSymbol $sym547$DEFAULT_ASSERT_MT_FOR_USER_AND_TASK;
  private static final SubLObject $const548$assistedReaderAssertionMtForTaskA;
  private static final SubLSymbol $sym549$_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK_CACHING_STATE_;
  private static final SubLSymbol $sym550$CLEAR_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK;
  private static final SubLSymbol $sym551$_CW;
  private static final SubLObject $const552$urlOfCW;
  private static final SubLObject $const553$URLFn;
  private static final SubLList $list554;
  private static final SubLObject $const555$mtSpindleMember;
  private static final SubLObject $const556$ContextOfPCWFn;
  private static final SubLList $list557;
  private static final SubLObject $const558$titleOfWork;
  private static final SubLObject $const559$ContextOfPCWInterpretationFn;
  private static final SubLObject $const560$contextOfPCW;
  private static final SubLString $str561$term_learner_sub_source_creation_;
  private static final SubLObject $const562$asHtmlSourceString;
  private static final SubLList $list563;
  private static final SubLObject $const564$subWorks;
  private static final SubLList $list565;
  private static final SubLInteger $int566$30;
  private static final SubLList $list567;
  private static final SubLObject $const568$AISForFn;
  private static final SubLObject $const569$genlMt;
  private static final SubLObject $const570$Microtheory;
  private static final SubLSymbol $sym571$_SUBWORK;
  private static final SubLList $list572;
  private static final SubLList $list573;
  private static final SubLSymbol $sym574$_WORK;
  private static final SubLSymbol $sym575$CLEAR_MTS_FOR_USER;
  private static final SubLSymbol $sym576$CLEAR_MTS_FOR_URL_USER;
  private static final SubLSymbol $kw577$MT;
  private static final SubLSymbol $kw578$BROAD_MT;
  private static final SubLString $str579$do_broad_mt_index;
  private static final SubLSymbol $kw580$SKIP;
  private static final SubLString $str581$assertionDependsOn;
  private static final SubLList $list582;
  private static final SubLSymbol $sym583$CYCLIST_FORT;
  private static final SubLSymbol $sym584$HUMAN_CYCLIST_;
  private static final SubLString $str585$needsApproval;
  private static final SubLString $str586$disapproved;
  private static final SubLString $str587$approved;
  private static final SubLList $list588;
  private static final SubLSymbol $sym589$STANFORD_NER;
  private static final SubLSymbol $sym590$RUN;
  private static final SubLSymbol $sym591$GET_CYC;
  private static final SubLSymbol $sym592$GET_STRING;
  private static final SubLList $list593;
  private static final SubLObject $const594$PredicateTaxonomy;
  private static final SubLList $list595;
  private static final SubLSymbol $kw596$STANFORD_NER;
  private static final SubLSymbol $sym597$TIGHTEN_TYPE;
  private static final SubLSymbol $kw598$STANFORD_NER_PSP;
  private static final SubLList $list599;
  private static final SubLSymbol $sym600$O;
  private static final SubLSymbol $sym601$GET_TYPE;
  private static final SubLSymbol $kw602$THING;
  private static final SubLSymbol $sym603$TERM_LEARNER_TYPE_PROMPT;
  private static final SubLList $list604;
  private static final SubLString $str605$cat;
  private static final SubLString $str606$_;
  private static final SubLSymbol $sym607$_TERM_LEARNER_TYPE_PROMPT_CACHING_STATE_;
  private static final SubLSymbol $sym608$TERM_LEARNER_TERM_HEADER_STRING;
  private static final SubLSymbol $sym609$_TERM_LEARNER_TERM_HEADER_STRING_CACHING_STATE_;
  private static final SubLInteger $int610$5000;
  private static final SubLSymbol $sym611$CLEAR_TERM_LEARNER_TERM_HEADER_STRING;
  private static final SubLSymbol $sym612$TERM_LEARNER_ALTERNATIVE_PHRASES;
  private static final SubLSymbol $sym613$DELETE;
  private static final SubLSymbol $kw614$NOW;
  private static final SubLObject $const615$ist;
  private static final SubLObject $const616$assertionDependsOn;
  private static final SubLSymbol $sym617$DEFAULT_TASK_FOR_USER;
  private static final SubLSymbol $sym618$DEFAULT_TASK_FOR_USER_INT;
  private static final SubLObject $const619$defaultTask;
  private static final SubLObject $const620$GeneralCycKETask_Allotment;
  private static final SubLSymbol $sym621$_DEFAULT_TASK_FOR_USER_INT_CACHING_STATE_;
  private static final SubLSymbol $sym622$CLEAR_DEFAULT_TASK_FOR_USER_INT;
  private static final SubLSymbol $sym623$QUERY_MT_FOR_TASK;
  private static final SubLSymbol $sym624$_QUERY_MT_FOR_TASK_CACHING_STATE_;
  private static final SubLSymbol $sym625$CLEAR_QUERY_MT_FOR_TASK;
  private static final SubLSymbol $sym626$WFF_CHECKING_MT_FOR_TASK;
  private static final SubLSymbol $sym627$_WFF_CHECKING_MT_FOR_TASK_CACHING_STATE_;
  private static final SubLSymbol $sym628$CLEAR_WFF_CHECKING_MT_FOR_TASK;
  private static final SubLSymbol $sym629$QUERY_MT_FOR_USER_AND_TASK;
  private static final SubLSymbol $sym630$_QUERY_MT_FOR_USER_AND_TASK_CACHING_STATE_;
  private static final SubLSymbol $sym631$CLEAR_QUERY_MT_FOR_USER_AND_TASK;
  private static final SubLSymbol $sym632$WFF_CHECKING_MT_FOR_USER_AND_TASK;
  private static final SubLSymbol $sym633$_WFF_CHECKING_MT_FOR_USER_AND_TASK_CACHING_STATE_;
  private static final SubLSymbol $sym634$CLEAR_WFF_CHECKING_MT_FOR_USER_AND_TASK;
  private static final SubLString $str635$types;
  private static final SubLSymbol $kw636$NOT_FOUND;
  private static final SubLString $str637$category;
  private static final SubLString $str638$categoryNL;
  private static final SubLString $str639$typeSet;
  private static final SubLString $str640$id;
  private static final SubLString $str641$required;
  private static final SubLString $str642$false;
  private static final SubLString $str643$display;
  private static final SubLString $str644$cyclTerm;
  private static final SubLString $str645$nlString;
  private static final SubLString $str646$legendString;
  private static final SubLString $str647$replicationSentenceId;
  private static final SubLString $str648$statusCode;
  private static final SubLString $str649$type;
  private static final SubLString $str650$renderers;
  private static final SubLString $str651$renderer;
  private static final SubLString $str652$isaConstraint;
  private static final SubLString $str653$genlsConstraint;
  private static final SubLString $str654$text_matches;
  private static final SubLString $str655$heading;
  private static final SubLList $list656;
  private static final SubLString $str657$initiallySelected;
  private static final SubLString $str658$selectionRenderer;
  private static final SubLString $str659$cyclId;
  private static final SubLSymbol $sym660$TERM_LEARNER_CONCEPT_CLOUDS;
  private static final SubLSymbol $kw661$TERM_WEIGHT;
  private static final SubLSymbol $kw662$CLOUD;
  private static final SubLSymbol $sym663$TERM_LEARNER_TERM_CONCEPT_CLOUD;
  private static final SubLSymbol $kw664$NEW;
  private static final SubLSymbol $sym665$SIXTH;
  private static final SubLSymbol $sym666$TERM_LEARNER_CONCEPT_CLOUD_AS_XML;
  private static final SubLString $str667$cloud;
  private static final SubLSymbol $kw668$GENL_IDS;
  private static final SubLSymbol $kw669$ISA_IDS;
  private static final SubLString $str670$cycl;
  private static final SubLString $str671$t;
  private static final SubLString $str672$f;
  private static final SubLString $str673$weight;
  private static final SubLString $str674$nl;
  private static final SubLString $str675$concept;
  private static final SubLString $str676$genl;
  private static final SubLSymbol $sym677$TERM_LEARNER_CONCEPT_CLOUD_NEW_INT;
  private static final SubLSymbol $sym678$TERM_LEARNER_ID;
  private static final SubLSymbol $sym679$TERM_LEARNER_CLOUD_DISPLAY_NL;
  private static final SubLSymbol $sym680$_TERM_LEARNER_CLOUD_DISPLAY_NL_CACHING_STATE_;
  private static final SubLInteger $int681$4096;
  private static final SubLSymbol $sym682$CLEAR_TERM_LEARNER_CLOUD_DISPLAY_NL;
  private static final SubLSymbol $sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_;
  private static final SubLSymbol $sym684$_TERM_LEARNER_DISPLAYABLE_GENERALIZATION__CACHING_STATE_;
  private static final SubLSymbol $sym685$CLEAR_TERM_LEARNER_DISPLAYABLE_GENERALIZATION_;
  private static final SubLObject $const686$Now;
  private static final SubLList $list687;
  private static final SubLSymbol $sym688$_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION__CACHING_STATE_;
  private static final SubLSymbol $sym689$CLEAR_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_;
  private static final SubLSymbol $kw690$KB_MODIFY_IRRELEVANCE;
  private static final SubLSymbol $sym691$CLEAR_TERM_LEARNER_IRRELEVANCIES_FOR_TERM;
  private static final SubLSymbol $sym692$CYCL_TERMS_TO_NL_STRINGS_QUICK;
  private static final SubLSymbol $sym693$_CB_SHOW_FOLLOWUP_WIDGET_;
  private static final SubLString $str694$_termId_;
  private static final SubLString $str695$_termString_;
  private static final SubLString $str696$cycFollowup;
  private static final SubLList $list697;
  private static final SubLSymbol $kw698$FOLLOWUP_LOADER;
  private static final SubLSymbol $kw699$CURE;
  private static final SubLString $str700$cure_png;
  private static final SubLString $str701$cure_cyc_com;
  private static final SubLInteger $int702$8080;
  private static final SubLString $str703$_ConceptSearch;
  private static final SubLString $str704$_cure;
  private static final SubLSymbol $sym705$_CB_CURE_INTERNAL_HOST_OVERRIDE_;
  private static final SubLSymbol $sym706$_CB_CURE_INTERNAL_PORT_OVERRIDE_;
  private static final SubLString $str707$CURE;
  private static final SubLSymbol $sym708$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str709$CURE_Broken;
  private static final SubLString $str710$CURE_broken___S;
  private static final SubLString $str711$http___;
  private static final SubLString $str712$_edit_jsp_conceptid_;
  private static final SubLString $str713$_cycHost_;
  private static final SubLString $str714$_cycPort_;
  private static final SubLString $str715$_userName_;
  private static final SubLString $str716$_cure;
  private static final SubLInteger $int717$600;
  private static final SubLInteger $int718$400;
  private static final SubLString $str719$_cycdoc_img_cb_cure_png;
  private static final SubLString $str720$bottom;
  private static final SubLString $str721$height_1_2em;
  private static final SubLSymbol $sym722$SENTENCE_SCORE;
  private static final SubLList $list723;
  private static final SubLSymbol $sym724$ALL_INSTANCES;
  private static final SubLSymbol $sym725$_SENTENCE_SCORE_CACHING_STATE_;
  private static final SubLSymbol $sym726$SENTENCE_SCORE_FOR_TYPE;
  private static final SubLSymbol $sym727$_QUERY_VAR;
  private static final SubLSymbol $sym728$_SENTENCE_SCORE_FOR_TYPE_CACHING_STATE_;
  private static final SubLSymbol $sym729$SET_QUERY_VARIABLE;
  private static final SubLSymbol $sym730$_SET_QUERY_VARIABLE_CACHING_STATE_;
  private static final SubLObject $const731$DaveS;
  private static final SubLString $str732$something;
  private static final SubLObject $const733$GenericInstanceFn;
  private static final SubLSymbol $sym734$SECOND;
  private static final SubLSymbol $sym735$GET_FRAGMENTS_FOR_TERMS_CACHED;
  private static final SubLSymbol $sym736$_GET_FRAGMENTS_FOR_TERMS_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym737$CLEAR_GET_FRAGMENTS_FOR_TERMS_CACHED;
  private static final SubLObject $const738$Restaurant_Organization;
  private static final SubLList $list739;
  private static final SubLList $list740;
  private static final SubLList $list741;
  private static final SubLString $str742$cdolist;
  private static final SubLString $str743$gathering_preds_for_;
  private static final SubLObject $const744$SomeFn;
  private static final SubLList $list745;
  private static final SubLObject $const746$DocumentReaderFollowupsForTaskMtF;
  private static final SubLSymbol $kw747$BREADTH;
  private static final SubLSymbol $kw748$QUEUE;
  private static final SubLSymbol $kw749$STACK;
  private static final SubLSymbol $sym750$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw751$ERROR;
  private static final SubLString $str752$_A_is_not_a__A;
  private static final SubLSymbol $sym753$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw754$CERROR;
  private static final SubLString $str755$continue_anyway;
  private static final SubLSymbol $kw756$WARN;
  private static final SubLString $str757$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str758$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str759$attempting_to_bind_direction_link;
  private static final SubLString $str760$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLFloat $float761$0_001;
  private static final SubLObject $const762$GeneralCycKE;
  private static final SubLSymbol $sym763$CAAR;
  private static final SubLObject $const764$generateFormulasForElements_TermI;
  private static final SubLObject $const765$TheSet;
  private static final SubLSymbol $kw766$CONTEXT_STRING;
  private static final SubLSymbol $kw767$SOURCE;
  private static final SubLSymbol $sym768$RESTART_CONCEPT_SEARCH_DEMO_SERVER;
  private static final SubLString $str769$Restarting_CCF_Demo_Cyc_Server;
  private static final SubLString $str770$_cyc_java_pkg_WebServicesTester_b;
  private static final SubLSymbol $kw771$COLLECTION;
  private static final SubLSymbol $kw772$INDIVIDUAL;
  private static final SubLList $list773;
  private static final SubLSymbol $sym774$COLLECTION_VIA_WEB_SEARCH_;
  private static final SubLFloat $float775$0_01;
  private static final SubLFloat $float776$0_1;
  private static final SubLSymbol $sym777$_COLLECTION_VIA_WEB_SEARCH__CACHING_STATE_;
  private static final SubLInteger $int778$50;
  private static final SubLSymbol $sym779$YAHOO_COUNT_CACHED;
  private static final SubLString $str780$_much_;
  private static final SubLString $str781$_;
  private static final SubLString $str782$_many_;
  private static final SubLSymbol $sym783$GET_CONCEPT_TAGS_FROM_STRING;
  private static final SubLSymbol $sym784$_GET_CONCEPT_TAGS_FROM_STRING_CACHING_STATE_;
  private static final SubLSymbol $sym785$CLEAR_GET_CONCEPT_TAGS_FROM_STRING;
  private static final SubLSymbol $sym786$GET_FILLER_SCORE;
  private static final SubLSymbol $sym787$FIND_SENTENCE_FILLERS;
  private static final SubLList $list788;
  private static final SubLList $list789;
  private static final SubLList $list790;
  private static final SubLSymbol $sym791$GET_QUERIES_FOR_TERM;
  private static final SubLSymbol $sym792$GET_QUERIES_FROM_SENTENCES;
  private static final SubLSymbol $sym793$TERM_LEARNER_AUTOCOMPLETE_NATIVE_WITH_CYCADMINISTRATOR;
  private static final SubLSymbol $sym794$LENGTH_;
  private static final SubLList $list795;
  private static final SubLSymbol $sym796$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE_INT;
  private static final SubLSymbol $sym797$VALID_HIERARCHICAL_CANDIDATES_P;
  private static final SubLList $list798;
  private static final SubLSymbol $sym799$TERM_LEARNER_TYPES_FOR_SENTENCE_ID_TEST_FN;
  private static final SubLSymbol $sym800$SOME_SELECTION_RENDERER_HAS_STRING_P;
  private static final SubLList $list801;
  private static final SubLSymbol $sym802$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_NEG;
  private static final SubLSymbol $sym803$BINDINGS_DONT_MENTION;
  private static final SubLList $list804;
  private static final SubLSymbol $sym805$BINDINGS_MENTION;
  private static final SubLList $list806;

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 1847L)
  public static SubLObject new_term_learner_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cycl = NIL;
    SubLObject weight = NIL;
    SubLObject justifications = NIL;
    SubLObject fragment_justification = NIL;
    SubLObject nl_string = NIL;
    SubLObject assert_sentence = NIL;
    SubLObject status_code = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    cycl = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    weight = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    justifications = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    fragment_justification = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    nl_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    assert_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    status_code = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list4 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list4 );
      if( NIL == conses_high.member( current_$1, $list5, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw6$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    }
    final SubLObject renderers_tail = cdestructuring_bind.property_list_member( $kw7$RENDERERS, current );
    final SubLObject renderers = ( NIL != renderers_tail ) ? conses_high.cadr( renderers_tail ) : NIL;
    final SubLObject original_cycl_tail = cdestructuring_bind.property_list_member( $kw8$ORIGINAL_CYCL, current );
    final SubLObject original_cycl = ( NIL != original_cycl_tail ) ? conses_high.cadr( original_cycl_tail ) : NIL;
    final SubLObject display_tail = cdestructuring_bind.property_list_member( $kw9$DISPLAY, current );
    final SubLObject display = ( NIL != display_tail ) ? conses_high.cadr( display_tail ) : T;
    final SubLObject required_tail = cdestructuring_bind.property_list_member( $kw10$REQUIRED, current );
    final SubLObject required = ( NIL != required_tail ) ? conses_high.cadr( required_tail ) : T;
    final SubLObject approval_code_tail = cdestructuring_bind.property_list_member( $kw11$APPROVAL_CODE, current );
    final SubLObject approval_code = ( NIL != approval_code_tail ) ? conses_high.cadr( approval_code_tail ) : NIL;
    final SubLObject unassertible_sentence_ids_tail = cdestructuring_bind.property_list_member( $kw12$UNASSERTIBLE_SENTENCE_IDS, current );
    final SubLObject unassertible_sentence_ids = ( NIL != unassertible_sentence_ids_tail ) ? conses_high.cadr( unassertible_sentence_ids_tail ) : NIL;
    return ConsesLow.list( new SubLObject[] { $sym13$NEW_TERM_LEARNER_TYPE_INT, cycl, weight, justifications, fragment_justification, nl_string, assert_sentence, status_code, renderers, original_cycl, display, required,
      approval_code, unassertible_sentence_ids
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 2314L)
  public static SubLObject term_learner_type_for_fragment_int_2(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject sentence = NIL;
    SubLObject domain_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    domain_mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list14 );
      if( NIL == conses_high.member( current_$2, $list15, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw6$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
    }
    final SubLObject original_sentence_tail = cdestructuring_bind.property_list_member( $kw16$ORIGINAL_SENTENCE, current );
    final SubLObject original_sentence = ( NIL != original_sentence_tail ) ? conses_high.cadr( original_sentence_tail ) : NIL;
    final SubLObject current_bindings_tail = cdestructuring_bind.property_list_member( $kw17$CURRENT_BINDINGS, current );
    final SubLObject current_bindings = ( NIL != current_bindings_tail ) ? conses_high.cadr( current_bindings_tail ) : NIL;
    final SubLObject suggestions_tail = cdestructuring_bind.property_list_member( $kw18$SUGGESTIONS, current );
    final SubLObject suggestions = ( NIL != suggestions_tail ) ? conses_high.cadr( suggestions_tail ) : NIL;
    final SubLObject justifications_tail = cdestructuring_bind.property_list_member( $kw19$JUSTIFICATIONS, current );
    final SubLObject justifications = ( NIL != justifications_tail ) ? conses_high.cadr( justifications_tail ) : $kw20$DEFAULT;
    final SubLObject fragment_justification_tail = cdestructuring_bind.property_list_member( $kw21$FRAGMENT_JUSTIFICATION, current );
    final SubLObject fragment_justification = ( NIL != fragment_justification_tail ) ? conses_high.cadr( fragment_justification_tail ) : NIL;
    final SubLObject nl_mt_tail = cdestructuring_bind.property_list_member( $kw22$NL_MT, current );
    final SubLObject nl_mt = ( NIL != nl_mt_tail ) ? conses_high.cadr( nl_mt_tail ) : $list23;
    final SubLObject approval_code_tail = cdestructuring_bind.property_list_member( $kw11$APPROVAL_CODE, current );
    final SubLObject approval_code = ( NIL != approval_code_tail ) ? conses_high.cadr( approval_code_tail ) : NIL;
    final SubLObject display_cycl_tail = cdestructuring_bind.property_list_member( $kw24$DISPLAY_CYCL, current );
    final SubLObject display_cycl = ( NIL != display_cycl_tail ) ? conses_high.cadr( display_cycl_tail ) : NIL;
    final SubLObject status_tail = cdestructuring_bind.property_list_member( $kw25$STATUS, current );
    final SubLObject status = ( NIL != status_tail ) ? conses_high.cadr( status_tail ) : NIL;
    final SubLObject clarifying_cycl_tail = cdestructuring_bind.property_list_member( $kw26$CLARIFYING_CYCL, current );
    final SubLObject clarifying_cycl = ( NIL != clarifying_cycl_tail ) ? conses_high.cadr( clarifying_cycl_tail ) : NIL;
    return ConsesLow.list( new SubLObject[] { $sym27$TERM_LEARNER_TYPE_FOR_FRAGMENT_INT, sentence, domain_mt, original_sentence, current_bindings, suggestions, justifications, fragment_justification, nl_mt,
      approval_code, display_cycl, status, clarifying_cycl
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 2922L)
  public static SubLObject term_learner_known_meanings_for_string(final SubLObject v_term, SubLObject context_string, SubLObject app_type, SubLObject user)
  {
    if( context_string == UNPROVIDED )
    {
      context_string = NIL;
    }
    if( app_type == UNPROVIDED )
    {
      app_type = NIL;
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym28$TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING, v_term, context_string, app_type, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym28$TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING, v_term,
            context_string, app_type, user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon( UNPROVIDED );
    final SubLObject learned_entries = methods.funcall_instance_method_with_1_args( lexicon, $sym33$LEARN, unicode_nauts.convert_unicode_nauts_to_utf8_strings( v_term ) );
    final SubLObject entries = methods.funcall_instance_method_with_1_args( lexicon, $sym34$GET, v_term );
    SubLObject result = NIL;
    SubLObject cycls = NIL;
    SubLObject cdolist_list_var = entries;
    SubLObject lex_entry = NIL;
    lex_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == methods.funcall_instance_method_with_1_args( lex_entry, $sym34$GET, $kw35$IS_NER_ENTRY_ ) )
      {
        final SubLObject item_var = methods.funcall_instance_method_with_1_args( lex_entry, $sym34$GET, $kw36$DENOT );
        if( NIL == conses_high.member( item_var, cycls, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          cycls = ConsesLow.cons( item_var, cycls );
        }
      }
      final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( user, thread );
        if( NIL == cycls && !app_type.equal( $str37$no_new_creation ) )
        {
          final SubLObject type = $const38$Thing;
          final SubLObject item_var2 = find_or_create_term_learner_stub_term( v_term, type );
          if( NIL == conses_high.member( item_var2, cycls, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            cycls = ConsesLow.cons( item_var2, cycls );
          }
        }
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_3, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex_entry = cdolist_list_var.first();
    }
    cdolist_list_var = entries;
    lex_entry = NIL;
    lex_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != methods.funcall_instance_method_with_1_args( lex_entry, $sym34$GET, $kw35$IS_NER_ENTRY_ ) )
      {
        cure_remove_lex_entry_from_default_lexicon( lex_entry, v_term );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex_entry = cdolist_list_var.first();
    }
    cdolist_list_var = cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( new_term_learner_term_meaning( cycl, UNPROVIDED, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_4 = rkf_macros.$rkf_asserting_tool$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      rkf_macros.$rkf_asserting_tool$.bind( $const39$CycAssistedDocumentReader, thread );
      if( NIL == result )
      {
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              SubLObject stream2 = NIL;
              try
              {
                final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                try
                {
                  stream_macros.$stream_requires_locking$.bind( NIL, thread );
                  stream2 = compatibility.open_text( $term_learner_user_created_term_log_file$.getDynamicValue( thread ), $kw30$APPEND );
                }
                finally
                {
                  stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$4, thread );
                }
                if( !stream2.isStream() )
                {
                  Errors.error( $str31$Unable_to_open__S, $term_learner_user_created_term_log_file$.getDynamicValue( thread ) );
                }
                final SubLObject s = stream2;
                PrintLow.format( s, $str42$_input_date___A___S__input___, numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ), v_term );
              }
              finally
              {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( stream2.isStream() )
                  {
                    streams_high.close( stream2, UNPROVIDED );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                }
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw40$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( !app_type.equal( $str37$no_new_creation ) )
        {
          final SubLObject base_type = $const38$Thing;
          final SubLObject base_name = ( NIL != fort_types_interface.collectionP( base_type ) ) ? morphology.singularize_string( v_term, UNPROVIDED ) : v_term;
          final SubLObject new_constant = find_or_create_term_learner_stub_term( base_name, base_type );
          result = ConsesLow.cons( new_term_learner_term_meaning( new_constant, $str43$Currently_Unknown_to_Cyc, UNPROVIDED ), result );
        }
      }
    }
    finally
    {
      rkf_macros.$rkf_asserting_tool$.rebind( _prev_bind_4, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_2, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 5624L)
  public static SubLObject term_learner_create_as_individualP(final SubLObject term_string, SubLObject v_context, SubLObject app_type)
  {
    if( v_context == UNPROVIDED )
    {
      v_context = NIL;
    }
    if( app_type == UNPROVIDED )
    {
      app_type = NIL;
    }
    if( app_type.equalp( $str44$vocabMarking ) )
    {
      return NIL;
    }
    return makeBoolean( NIL == string_likely_denotes_collectionP( term_string, v_context ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 5887L)
  public static SubLObject term_learner_meanings_for_tagged_term(final SubLObject concept_id_list, SubLObject known, SubLObject user)
  {
    if( known == UNPROVIDED )
    {
      known = T;
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym45$TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM, concept_id_list ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym45$TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM, concept_id_list ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject initial_meanings = ( NIL != document_annotation_widgets.$term_learner_keep_concepts_distinct$.getDynamicValue( thread ) ) ? Mapping.mapcar( $sym46$TERM_LEARNER_OBJECT_FROM_ID, string_utilities
        .string_tokenize( concept_id_list, $list47, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) : document_annotation_widgets.term_learner_object_from_id( concept_id_list );
    SubLObject result = NIL;
    if( NIL != known )
    {
      SubLObject v_term = NIL;
      SubLObject v_term_$6 = NIL;
      SubLObject string = NIL;
      SubLObject string_$7 = NIL;
      v_term = initial_meanings;
      v_term_$6 = v_term.first();
      string = term_learner_cycl_terms_to_nl_strings( initial_meanings, UNPROVIDED, UNPROVIDED );
      string_$7 = string.first();
      while ( NIL != string || NIL != v_term)
      {
        result = ConsesLow.cons( new_term_learner_term_meaning( v_term_$6, string_$7, UNPROVIDED ), result );
        v_term = v_term.rest();
        v_term_$6 = v_term.first();
        string = string.rest();
        string_$7 = string.first();
      }
    }
    else
    {
      final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( user, thread );
        final SubLObject infn_term = initial_meanings.first();
        final SubLObject term_string = cycl_utilities.formula_arg1( infn_term, UNPROVIDED );
        final SubLObject new_constant = find_or_create_term_learner_stub_term( term_string, $const48$Individual );
        result = ConsesLow.cons( new_term_learner_term_meaning( new_constant, UNPROVIDED, UNPROVIDED ), result );
        cure_remove_from_default_lexicon( infn_term, term_string );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_3, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 6922L)
  public static SubLObject find_or_create_term_learner_stub_term(final SubLObject string, final SubLObject base_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_name = ( NIL != isa.isaP( base_type, $const49$Collection, UNPROVIDED, UNPROVIDED ) ) ? morphology.singularize_string( string, UNPROVIDED ) : string;
    final SubLObject constant_name = constants_high.suggest_constant_name( term_name, $str50$, $str50$, $kw51$UPCASE, NIL, UNPROVIDED );
    SubLObject constant = constants_high.find_or_create_constant( constant_name, UNPROVIDED );
    final SubLObject clean_string = Sequences.remove_if( $sym52$CONTROL_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == term_learner_stub_constantP( constant ) )
    {
      constant = rkf_term_utilities.rkf_create( term_name, NIL, $str50$, UNPROVIDED, UNPROVIDED );
    }
    rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const53$inProgressTerm, constant ), $const54$BaseKB, NIL, T );
    rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const55$isa, constant, base_type ), $const54$BaseKB, NIL, T );
    if( NIL != constant_handles.valid_constantP( $const56$DocIngesterUserCreatedTerm, UNPROVIDED ) )
    {
      rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const57$quotedIsa, constant, $list58 ), $const54$BaseKB, UNPROVIDED, UNPROVIDED );
    }
    rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const59$termStrings, constant, clean_string ), $term_learner_default_lexical_assertion_mt$.getDynamicValue( thread ), T, T );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 7773L)
  public static SubLObject term_learner_stub_constantP(final SubLObject v_const)
  {
    return makeBoolean( kb_indexing.num_index( v_const ).eql( ZERO_INTEGER ) || ( NIL != ask_utilities.query_boolean( ConsesLow.list( $const60$and, ConsesLow.listS( $const57$quotedIsa, v_const, $list58 ), ConsesLow.list(
        $const53$inProgressTerm, v_const ), ConsesLow.list( $const61$ist_Asserted, $sym62$__MT, ConsesLow.listS( $const59$termStrings, v_const, $list63 ) ) ), $const64$InferencePSC, UNPROVIDED ) && kb_indexing.num_index(
            v_const ).numLE( FOUR_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 8095L)
  public static SubLObject new_term_learner_term_meaning(final SubLObject v_term, SubLObject string, SubLObject max_alt_strings)
  {
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    if( max_alt_strings == UNPROVIDED )
    {
      max_alt_strings = THREE_INTEGER;
    }
    final SubLObject primary_string = ( NIL != string ) ? string : term_learner_cycl_term_to_nl_string( v_term, UNPROVIDED ).first();
    final SubLObject alt_strings = Sequences.remove( primary_string, term_learner_alternative_phrases( v_term, Numbers.add( ONE_INTEGER, max_alt_strings ) ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject alt_strings_string = ( NIL != list_utilities.lengthG( alt_strings, max_alt_strings, UNPROVIDED ) ) ? string_utilities.join_strings( list_utilities.snoc( $str65$___, list_utilities.first_n(
        max_alt_strings, alt_strings ) ), UNPROVIDED ) : string_utilities.join_strings( alt_strings, UNPROVIDED );
    return ConsesLow.list( $kw66$MEANING, v_term, primary_string, document_annotation_widgets.term_learner_id( v_term ), cb_utilities.top_level_cb_form_url( v_term ), alt_strings_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 8724L)
  public static SubLObject cure_remove_from_default_lexicon(final SubLObject v_term, final SubLObject delete_string)
  {
    final SubLObject lex = document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = instances.get_slot( lex, $sym69$LEARNED );
    SubLObject learned = NIL;
    learned = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( delete_string.equal( methods.funcall_instance_method_with_1_args( learned, $sym34$GET, $kw67$STRING ) ) && methods.funcall_instance_method_with_1_args( learned, $sym34$GET, $kw36$DENOT ).equal( v_term ) )
      {
        methods.funcall_instance_method_with_2_args( lex, $sym68$DELETE_ENTRY_FROM_STRING, learned, delete_string );
      }
      cdolist_list_var = cdolist_list_var.rest();
      learned = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 9108L)
  public static SubLObject cure_remove_lex_entry_from_default_lexicon(final SubLObject entry, final SubLObject delete_string)
  {
    final SubLObject lex = document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED );
    methods.funcall_instance_method_with_2_args( lex, $sym68$DELETE_ENTRY_FROM_STRING, entry, delete_string );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 9340L)
  public static SubLObject term_learner_ordered_types_for_tagged_term(final SubLObject concept_id, SubLObject user, SubLObject mt)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym70$TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM, concept_id, user, mt ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym70$TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM, concept_id, user,
            mt ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    if( NIL == mt )
    {
      mt = followup_query_mt_for_userXtask( user, default_task_for_user( user ) );
    }
    final SubLObject concept = document_annotation_widgets.term_learner_object_from_id( concept_id );
    final SubLObject type_prompt = term_learner_type_prompt( concept );
    final SubLObject task = default_task_for_user( user );
    final SubLObject nl_mt = cure_default_generation_mt( task );
    SubLObject types = NIL;
    SubLObject type_pred = NIL;
    SubLObject result = NIL;
    SubLObject current;
    final SubLObject datum = current = term_learner_term_header_string( concept, UNPROVIDED );
    SubLObject header_string = NIL;
    SubLObject alt_phrases = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    header_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    alt_phrases = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != term_learner_stub_constantP( concept ) )
      {
        final SubLObject term_string = ask_utilities.query_variable( $sym72$_STRING, ConsesLow.list( $const73$assertedSentence, ConsesLow.listS( $const59$termStrings, concept, $list74 ) ), nl_mt, UNPROVIDED ).first();
        final SubLObject possible_types = types = term_learner_get_word_denots_from_string( term_string, UNPROVIDED );
        type_pred = $const75$is_Underspecified;
      }
      else if( NIL != fort_types_interface.isa_collectionP( concept, UNPROVIDED ) )
      {
        types = term_learner_min_genls( concept, mt, UNPROVIDED );
        type_pred = $const76$genls;
      }
      else
      {
        types = term_learner_min_isa( concept, mt, UNPROVIDED );
        type_pred = $const55$isa;
      }
      SubLObject cdolist_list_var = types;
      SubLObject type = NIL;
      type = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject assertions = term_learner_asserts_for_formula( ConsesLow.list( type_pred, concept, type ), mt );
        final SubLObject assert_sentence = ConsesLow.list( type_pred, concept, type );
        final SubLObject clarifying_cycl = pph_disambiguation.clarification_terms_wrt( type, types, ONE_INTEGER, UNPROVIDED ).first();
        final SubLObject fragment_justification = NIL;
        thread.resetMultipleValues();
        final SubLObject justifications = make_term_learner_justifications_from_asserts( assertions );
        final SubLObject removable = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = ConsesLow.cons( term_learner_type_for_fragment_int( assert_sentence, mt, NIL, NIL, NIL, justifications, fragment_justification, nl_mt, NIL, type, NIL, clarifying_cycl, UNPROVIDED, UNPROVIDED ), result );
        cdolist_list_var = cdolist_list_var.rest();
        type = cdolist_list_var.first();
      }
      result = Sort.sort( result, $sym77$_, $sym78$GET_WEIGHT );
      if( NIL != type_prompt )
      {
        result = ConsesLow.cons( ConsesLow.list( $kw79$TYPE_PROMPT, type_prompt ), result );
      }
      if( NIL != header_string )
      {
        result = ConsesLow.cons( ConsesLow.list( $kw80$TYPE_HEADER, header_string ), result );
      }
      if( NIL != alt_phrases )
      {
        result = ConsesLow.cons( ConsesLow.list( $kw81$TYPE_ALT_PHRASES, alt_phrases ), result );
      }
      final SubLObject lexical_types = term_learner_lexical_types_for_tagged_term( concept, user, nl_mt );
      if( NIL != lexical_types )
      {
        result = ConsesLow.cons( ConsesLow.list( $kw82$LEXICAL_TYPES, lexical_types ), result );
      }
      return result;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 11785L)
  public static SubLObject get_taxonomic_renderers_for_term(final SubLObject v_term, final SubLObject renderer_type, final SubLObject taxonomic_type, SubLObject limit, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym83$GET_TAXONOMIC_RENDERERS_FOR_TERM, v_term, renderer_type, taxonomic_type, limit, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym83$GET_TAXONOMIC_RENDERERS_FOR_TERM, v_term, renderer_type,
            taxonomic_type, limit, user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    SubLObject terms = NIL;
    final SubLObject mt = followup_query_mt_for_userXtask( user, default_task_for_user( user ) );
    SubLObject renderers = NIL;
    if( limit.eql( MINUS_ONE_INTEGER ) )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    if( taxonomic_type.equalp( $str84$specs ) )
    {
      terms = term_learner_max_specs( v_term, mt, limit );
    }
    else if( taxonomic_type.equalp( $str85$instances ) )
    {
      terms = term_learner_max_instances( v_term, mt, limit );
    }
    else if( taxonomic_type.equalp( $str86$superiors ) && NIL != fort_types_interface.collection_p( v_term ) )
    {
      terms = term_learner_min_genls( v_term, mt, limit );
    }
    else if( taxonomic_type.equalp( $str86$superiors ) && NIL == fort_types_interface.collection_p( v_term ) )
    {
      terms = term_learner_min_isa( v_term, mt, limit );
    }
    else if( taxonomic_type.equalp( $str87$genls ) )
    {
      terms = term_learner_min_genls( v_term, mt, limit );
    }
    else if( taxonomic_type.equalp( $str88$isa ) )
    {
      terms = term_learner_min_isa( v_term, mt, limit );
    }
    else
    {
      Errors.warn( $str89$Unimplemented_attempt_to_get__S_f, taxonomic_type, v_term );
    }
    SubLObject cdolist_list_var = terms;
    SubLObject v_term_$8 = NIL;
    v_term_$8 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $str90$string.equal( renderer_type ) )
      {
        renderers = Sequences.cconcatenate( get_term_learner_string_renderer_for_cycl( v_term_$8 ), renderers );
      }
      else
      {
        renderers = Sequences.cconcatenate( get_term_learner_renderer_for_cycl( v_term_$8 ), renderers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term_$8 = cdolist_list_var.first();
    }
    return Sequences.nreverse( renderers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 13199L)
  public static SubLObject term_learner_min_genls(final SubLObject v_term, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      return term_learner_min_genls_int( v_term, limit, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 13380L)
  public static SubLObject term_learner_min_genls_int(final SubLObject v_term, final SubLObject limit, SubLObject already_seen)
  {
    if( already_seen == UNPROVIDED )
    {
      already_seen = NIL;
    }
    final SubLObject v_genls = genls.min_genls( v_term, UNPROVIDED, UNPROVIDED );
    SubLObject new_genls = conses_high.set_difference( v_genls, already_seen, UNPROVIDED, UNPROVIDED );
    SubLObject irrelevant = list_utilities.find_all_if_not( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_genls, UNPROVIDED );
    SubLObject relevant = conses_high.set_difference( new_genls, irrelevant, UNPROVIDED, UNPROVIDED );
    final SubLObject redundant = makeBoolean( NIL != list_utilities.lengthE( new_genls, ONE_INTEGER, UNPROVIDED ) && NIL != genls.genlsP( new_genls.first(), v_term, UNPROVIDED, UNPROVIDED ) );
    if( NIL != redundant )
    {
      new_genls = genls.min_genls_among( v_term, conses_high.set_difference( genls.asserted_genls( v_term, UNPROVIDED ), ConsesLow.cons( v_term, new_genls ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      irrelevant = list_utilities.find_all_if_not( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_genls, UNPROVIDED );
      final SubLObject items_var = conses_high.set_difference( new_genls, irrelevant, UNPROVIDED, UNPROVIDED );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item_var;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = ( item_var = Vectors.aref( vector_var, element_num ) );
          if( NIL == conses_high.member( item_var, relevant, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            relevant = ConsesLow.cons( item_var, relevant );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var2 = item2;
          if( NIL == conses_high.member( item_var2, relevant, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            relevant = ConsesLow.cons( item_var2, relevant );
          }
          cdolist_list_var = cdolist_list_var.rest();
          item2 = cdolist_list_var.first();
        }
      }
    }
    final SubLObject items_var = relevant;
    if( items_var.isVector() )
    {
      final SubLObject vector_var = items_var;
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject item;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        item = Vectors.aref( vector_var, element_num );
        already_seen = ConsesLow.cons( item, already_seen );
      }
    }
    else
    {
      SubLObject cdolist_list_var = items_var;
      SubLObject item2 = NIL;
      item2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        already_seen = ConsesLow.cons( item2, already_seen );
        cdolist_list_var = cdolist_list_var.rest();
        item2 = cdolist_list_var.first();
      }
    }
    if( NIL == list_utilities.lengthGE( relevant, limit, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var2 = irrelevant;
      SubLObject irrel = NIL;
      irrel = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( !$const38$Thing.eql( irrel ) )
        {
          SubLObject cdolist_list_var_$9 = term_learner_min_genls_int( irrel, limit, already_seen );
          SubLObject genl = NIL;
          genl = cdolist_list_var_$9.first();
          while ( NIL != cdolist_list_var_$9)
          {
            if( NIL == genls.any_specP( genl, relevant, UNPROVIDED, UNPROVIDED ) )
            {
              relevant = ConsesLow.cons( genl, relevant );
            }
            cdolist_list_var_$9 = cdolist_list_var_$9.rest();
            genl = cdolist_list_var_$9.first();
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        irrel = cdolist_list_var2.first();
      }
    }
    return list_utilities.first_n( limit, Sequences.nreverse( relevant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 14451L)
  public static SubLObject term_learner_min_isa(final SubLObject v_term, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject isas = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      isas = term_learner_min_isa_int( v_term, limit );
      isas = list_utilities.remove_subsumed_items( isas, $sym93$GENLS_, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return isas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 14724L)
  public static SubLObject term_learner_min_isa_int(final SubLObject v_term, final SubLObject limit)
  {
    SubLObject isas = isa.min_isa( v_term, UNPROVIDED, UNPROVIDED );
    final SubLObject irrelevant = list_utilities.find_all_if_not( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, isas, UNPROVIDED );
    isas = conses_high.set_difference( isas, irrelevant, UNPROVIDED, UNPROVIDED );
    if( NIL == list_utilities.lengthGE( isas, limit, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = Sequences.remove( $const38$Thing, irrelevant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject irrel = NIL;
      irrel = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject items_var = term_learner_min_genls_int( irrel, Numbers.$most_positive_fixnum$.getGlobalValue(), UNPROVIDED );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            isas = ConsesLow.cons( item, isas );
          }
        }
        else
        {
          SubLObject cdolist_list_var_$10 = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var_$10.first();
          while ( NIL != cdolist_list_var_$10)
          {
            isas = ConsesLow.cons( item2, isas );
            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
            item2 = cdolist_list_var_$10.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        irrel = cdolist_list_var.first();
      }
    }
    isas = list_utilities.remove_subsumed_items( isas, $sym93$GENLS_, UNPROVIDED );
    return list_utilities.first_n( limit, isas );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 15242L)
  public static SubLObject term_learner_max_specs(final SubLObject v_term, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( limit.eql( MINUS_ONE_INTEGER ) )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      return term_learner_max_specs_int( v_term, limit, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 15480L)
  public static SubLObject term_learner_max_specs_int(final SubLObject v_term, final SubLObject limit, SubLObject already_seen)
  {
    if( already_seen == UNPROVIDED )
    {
      already_seen = NIL;
    }
    final SubLObject specs = genls.max_specs( v_term, UNPROVIDED, UNPROVIDED );
    SubLObject new_specs = conses_high.set_difference( specs, already_seen, UNPROVIDED, UNPROVIDED );
    SubLObject irrelevant = list_utilities.find_all_if_not( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_specs, UNPROVIDED );
    SubLObject relevant = conses_high.set_difference( new_specs, irrelevant, UNPROVIDED, UNPROVIDED );
    final SubLObject redundant = makeBoolean( NIL != list_utilities.lengthE( new_specs, ONE_INTEGER, UNPROVIDED ) && NIL != genls.genlsP( v_term, new_specs.first(), UNPROVIDED, UNPROVIDED ) );
    if( NIL != redundant )
    {
      new_specs = genls.max_specs_among( v_term, conses_high.set_difference( genls.asserted_specs( v_term, UNPROVIDED ), ConsesLow.cons( v_term, new_specs ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      irrelevant = list_utilities.find_all_if_not( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, new_specs, UNPROVIDED );
      final SubLObject items_var = conses_high.set_difference( new_specs, irrelevant, UNPROVIDED, UNPROVIDED );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item_var;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = ( item_var = Vectors.aref( vector_var, element_num ) );
          if( NIL == conses_high.member( item_var, relevant, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            relevant = ConsesLow.cons( item_var, relevant );
          }
        }
      }
      else
      {
        SubLObject cdolist_list_var = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var2 = item2;
          if( NIL == conses_high.member( item_var2, relevant, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            relevant = ConsesLow.cons( item_var2, relevant );
          }
          cdolist_list_var = cdolist_list_var.rest();
          item2 = cdolist_list_var.first();
        }
      }
    }
    if( NIL == list_utilities.lengthGE( relevant, limit, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var2 = irrelevant;
      SubLObject irrel = NIL;
      irrel = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        SubLObject cdolist_list_var_$11 = term_learner_max_specs_int( irrel, limit, already_seen );
        SubLObject spec = NIL;
        spec = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          if( NIL == genls.any_genlP( spec, relevant, UNPROVIDED, UNPROVIDED ) )
          {
            relevant = ConsesLow.cons( spec, relevant );
          }
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          spec = cdolist_list_var_$11.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        irrel = cdolist_list_var2.first();
      }
    }
    return list_utilities.first_n( limit, Sequences.nreverse( relevant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 16478L)
  public static SubLObject term_learner_max_instances(final SubLObject v_term, final SubLObject mt, SubLObject limit)
  {
    if( limit == UNPROVIDED )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_instances = NIL;
    if( limit.eql( MINUS_ONE_INTEGER ) )
    {
      limit = Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      v_instances = term_learner_max_instances_int( v_term, limit );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return list_utilities.first_n( limit, v_instances );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 16870L)
  public static SubLObject term_learner_max_instances_int(final SubLObject v_term, final SubLObject limit)
  {
    final SubLObject v_instances = isa.instances( v_term, UNPROVIDED, UNPROVIDED );
    final SubLObject irrelevant = list_utilities.find_all_if_not( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, v_instances, UNPROVIDED );
    final SubLObject relevant_instances = conses_high.set_difference( v_instances, irrelevant, UNPROVIDED, UNPROVIDED );
    SubLObject max_instances = NIL;
    SubLObject other_instances = NIL;
    if( NIL != list_utilities.lengthLE( relevant_instances, limit, UNPROVIDED ) )
    {
      return relevant_instances;
    }
    SubLObject cdolist_list_var = relevant_instances;
    SubLObject instance = NIL;
    instance = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( v_term, isa.min_isa( v_instances, UNPROVIDED, UNPROVIDED ), EQUAL, UNPROVIDED ) )
      {
        max_instances = ConsesLow.cons( instance, max_instances );
      }
      else
      {
        other_instances = ConsesLow.cons( instance, other_instances );
      }
      cdolist_list_var = cdolist_list_var.rest();
      instance = cdolist_list_var.first();
    }
    if( NIL != list_utilities.lengthGE( max_instances, limit, UNPROVIDED ) )
    {
      return list_utilities.first_n( limit, max_instances );
    }
    final SubLObject num_other_needed = Numbers.subtract( limit, Sequences.length( max_instances ) );
    return Sequences.cconcatenate( max_instances, list_utilities.first_n( num_other_needed, other_instances ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 17836L)
  public static SubLObject term_learner_asserts_for_formula(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject raw_asserts = kb_indexing.find_all_gafs( formula );
    SubLObject relevant_asserts = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = raw_asserts;
      SubLObject v_assert = NIL;
      v_assert = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( v_assert ) ) )
        {
          relevant_asserts = ConsesLow.cons( v_assert, relevant_asserts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_assert = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return relevant_asserts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 18158L)
  public static SubLObject make_term_learner_justifications_from_asserts(final SubLObject asserts)
  {
    SubLObject justifications = NIL;
    SubLObject removable = T;
    SubLObject cdolist_list_var = asserts;
    SubLObject v_assert = NIL;
    v_assert = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject just = ConsesLow.list( $kw94$ASSERT_SENTENCE, document_annotation_widgets.term_learner_id( uncanonicalizer.assertion_el_formula( v_assert ) ), $kw95$ASSERT_MT, document_annotation_widgets
          .term_learner_id( assertions_high.assertion_mt( v_assert ) ) );
      if( NIL == assertions_high.asserted_assertionP( v_assert ) || NIL != tms.independently_deducible_assertionP( v_assert ) )
      {
        removable = NIL;
      }
      justifications = ConsesLow.cons( just, justifications );
      cdolist_list_var = cdolist_list_var.rest();
      v_assert = cdolist_list_var.first();
    }
    return Values.values( justifications, removable );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 18670L)
  public static SubLObject term_learner_lexical_types_for_tagged_term(final SubLObject v_term, SubLObject user, SubLObject lexical_mt)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject lexical_types = NIL;
    SubLObject sentence = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( term_learner_lexical_assertions_for_term( v_term, lexical_mt ) ) ); NIL == dictionary_contents
        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject string = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject assert_list = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != list_utilities.lengthG( assert_list, ONE_INTEGER, UNPROVIDED ) )
      {
        sentence = assertions_high.assertion_ist_formula( assert_list.first() );
      }
      else
      {
        sentence = simplifier.conjoin( Mapping.mapcar( $sym96$ASSERTION_IST_FORMULA, assert_list ), UNPROVIDED );
      }
      final SubLObject justifications = ConsesLow.list( new_term_learner_justification( string, $str50$, $kw97$USER, NIL, document_annotation_widgets.term_learner_id( lexical_mt ) ) );
      final SubLObject fragment_justification = NIL;
      final SubLObject default_weight = $float98$0_9;
      final SubLObject status = term_learner_fact_status_int( sentence, lexical_mt, user ).first();
      final SubLObject renderers = ConsesLow.list( new_term_learner_string_renderer( string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      lexical_types = ConsesLow.cons( new_term_learner_type_int( sentence, default_weight, justifications, fragment_justification, string, sentence, status, renderers, NIL, T, T, NIL, NIL ), lexical_types );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return lexical_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 19781L)
  public static SubLObject term_learner_lexical_assertions_for_term(final SubLObject v_term, final SubLObject lexical_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filtered_assertions = dictionary.new_dictionary( EQUALP, UNPROVIDED );
    final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = lexicon_vars.$exclude_archaic_speechP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = lexicon_vars.$exclude_indirect_relationsP$.currentBinding( thread );
    try
    {
      lexicon_vars.$exclude_vulgaritiesP$.bind( subl_promotions.memberP( $sym99$_EXCLUDE_VULGARITIES__, $list100, UNPROVIDED, UNPROVIDED ), thread );
      lexicon_vars.$exclude_slangP$.bind( subl_promotions.memberP( $sym101$_EXCLUDE_SLANG__, $list100, UNPROVIDED, UNPROVIDED ), thread );
      lexicon_vars.$exclude_archaic_speechP$.bind( subl_promotions.memberP( $sym102$_EXCLUDE_ARCHAIC_SPEECH__, $list100, UNPROVIDED, UNPROVIDED ), thread );
      lexicon_vars.$exclude_indirect_relationsP$.bind( subl_promotions.memberP( $sym103$_EXCLUDE_INDIRECT_RELATIONS__, $list100, UNPROVIDED, UNPROVIDED ), thread );
      SubLObject cdolist_list_var = lexicon_utilities.all_lexifications_for_term( v_term );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != lexicon_utilities.denot_formula_p( uncanonicalizer.assertion_el_formula( assertion ) ) && NIL != lexicon_accessors.genl_lexicon_mtP( lexical_mt, assertions_high.assertion_mt( assertion ) )
            && NIL == lexicon_accessors.inappropriate_lexical_assertionP( assertion ) )
        {
          final SubLObject phrases = lexification_utilities.phrases_from_semantic_assertion( assertion, UNPROVIDED );
          if( NIL != phrases && !phrases.equal( ConsesLow.list( NIL ) ) )
          {
            dictionary_utilities.dictionary_push( filtered_assertions, string_utilities.join_strings( Sort.sort( phrases, $sym104$SHORTER_P, UNPROVIDED ), UNPROVIDED ), assertion );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$exclude_indirect_relationsP$.rebind( _prev_bind_4, thread );
      lexicon_vars.$exclude_archaic_speechP$.rebind( _prev_bind_3, thread );
      lexicon_vars.$exclude_slangP$.rebind( _prev_bind_2, thread );
      lexicon_vars.$exclude_vulgaritiesP$.rebind( _prev_bind_0, thread );
    }
    return filtered_assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 20786L)
  public static SubLObject term_learner_ordered_types_for_term_in_document_string_merged_justifications(final SubLObject doc_string, final SubLObject v_term, final SubLObject placeholderP, SubLObject lookup_onlyP)
  {
    if( lookup_onlyP == UNPROVIDED )
    {
      lookup_onlyP = $term_learner_use_lexical_lookup_only$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS, doc_string, v_term, placeholderP ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
            $sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS, doc_string, v_term, placeholderP ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject ascii_doc_string = string_utilities.string_substitute( $str106$_, $str107$_, unicode_strings.display_to_subl_string( doc_string, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject ascii_term_string = string_utilities.string_substitute( $str106$_, $str107$_, unicode_strings.display_to_subl_string( v_term, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject _prev_bind_3 = psp_chart.$psp_use_term_lexiconP$.currentBinding( thread );
    try
    {
      psp_chart.$psp_use_term_lexiconP$.bind( NIL, thread );
      result = term_learner_ordered_types_for_term_in_document_string( ascii_doc_string, ascii_term_string, placeholderP, lookup_onlyP, UNPROVIDED );
    }
    finally
    {
      psp_chart.$psp_use_term_lexiconP$.rebind( _prev_bind_3, thread );
    }
    return merge_justifications_for_ordered_types( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 21962L)
  public static SubLObject term_learner_ordered_types_for_user_added_type(final SubLObject term_string, final SubLObject existing_term_id, final SubLObject app_type, SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym108$TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE, term_string, existing_term_id, app_type, user, task ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym108$TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE, term_string,
            existing_term_id, app_type, user, task ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    if( NIL == task )
    {
      task = default_task_for_user( user );
    }
    SubLObject lex_entries = NIL;
    final SubLObject _prev_bind_0 = psp_chart.$psp_use_term_lexiconP$.currentBinding( thread );
    try
    {
      psp_chart.$psp_use_term_lexiconP$.bind( NIL, thread );
      lex_entries = methods.funcall_instance_method_with_1_args( document_annotation_widgets.get_default_document_annotation_lexicon( UNPROVIDED ), $sym34$GET, term_string );
    }
    finally
    {
      psp_chart.$psp_use_term_lexiconP$.rebind( _prev_bind_0, thread );
    }
    final SubLObject existing_term = document_annotation_widgets.term_learner_object_from_id( existing_term_id );
    final SubLObject cycls = term_lexicon.denots_for_term_lexicon_entries( lex_entries );
    final SubLObject query_mt = query_mt_for_user_and_task( user, task );
    final SubLObject followup_mt = followup_query_mt_for_userXtask( user, task );
    SubLObject answers = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject stream2 = NIL;
          try
          {
            final SubLObject _prev_bind_0_$12 = stream_macros.$stream_requires_locking$.currentBinding( thread );
            try
            {
              stream_macros.$stream_requires_locking$.bind( NIL, thread );
              stream2 = compatibility.open_text( $term_learner_user_added_types_log_file$.getDynamicValue( thread ), $kw30$APPEND );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$12, thread );
            }
            if( !stream2.isStream() )
            {
              Errors.error( $str31$Unable_to_open__S, $term_learner_user_added_types_log_file$.getDynamicValue( thread ) );
            }
            final SubLObject s = stream2;
            PrintLow.format( s, $str109$_input_cyctermid___A__date___A___, new SubLObject[] { kb_utilities.compact_hl_external_id_string( existing_term ), numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ),
              term_string
            } );
          }
          finally
          {
            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( stream2.isStream() )
              {
                streams_high.close( stream2, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_3, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw40$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    SubLObject cdolist_list_var = cycls;
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject isa_genls = term_learner_isa_or_genls( existing_term, cycl, app_type, followup_mt );
      final SubLObject cycl_sentence = ConsesLow.list( isa_genls, existing_term, cycl );
      final SubLObject clarifying_term = pph_disambiguation.clarification_terms_wrt( cycl, cycls, ONE_INTEGER, query_mt ).first();
      final SubLObject justifications = ConsesLow.list( new_term_learner_justification( term_string, $str50$, $kw97$USER, UNPROVIDED, UNPROVIDED ) );
      answers = ConsesLow.cons( term_learner_type_for_fragment_int( cycl_sentence, query_mt, NIL, NIL, NIL, justifications, NIL, cure_default_generation_mt( UNPROVIDED ), NIL, cycl, NIL, clarifying_term, UNPROVIDED,
          UNPROVIDED ), answers );
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 24117L)
  public static SubLObject term_learner_isa_or_genls(final SubLObject existing_term, final SubLObject new_possible_type, SubLObject app_type, SubLObject mt)
  {
    if( app_type == UNPROVIDED )
    {
      app_type = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pred = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != isa.isaP( new_possible_type, $const110$CollectionType, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( existing_term, $const49$Collection, UNPROVIDED, UNPROVIDED ) )
      {
        pred = $const55$isa;
      }
      else if( NIL != isa.isaP( existing_term, $const49$Collection, UNPROVIDED, UNPROVIDED ) )
      {
        pred = $const76$genls;
      }
      else if( NIL != isa.isaP( existing_term, $const48$Individual, UNPROVIDED, UNPROVIDED ) )
      {
        pred = $const55$isa;
      }
      else if( NIL != default_create_as_type( new_possible_type, mt ) )
      {
        pred = default_create_as_type( new_possible_type, UNPROVIDED );
      }
      else if( app_type.equalp( $str44$vocabMarking ) )
      {
        pred = $const76$genls;
      }
      else
      {
        pred = $const55$isa;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return pred;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 25243L)
  public static SubLObject clear_default_create_as_type()
  {
    final SubLObject cs = $default_create_as_type_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 25243L)
  public static SubLObject remove_default_create_as_type(final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $default_create_as_type_caching_state$.getGlobalValue(), ConsesLow.list( type, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 25243L)
  public static SubLObject default_create_as_type_internal(final SubLObject type, final SubLObject mt)
  {
    return ask_utilities.query_variable( $sym112$_PRED, ConsesLow.listS( $const113$defaultAutotypeSuggestionFromType, type, $list114 ), mt, $list115 ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 25243L)
  public static SubLObject default_create_as_type(final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    SubLObject caching_state = $default_create_as_type_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym111$DEFAULT_CREATE_AS_TYPE, $sym116$_DEFAULT_CREATE_AS_TYPE_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( type, mt );
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
        if( type.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( default_create_as_type_internal( type, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( type, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 25546L)
  public static SubLObject new_term_learner_type_int(final SubLObject cycl, final SubLObject weight, final SubLObject justifications, final SubLObject fragment_justification, final SubLObject nl_string,
      final SubLObject assert_sentence, final SubLObject status_code, SubLObject renderers, SubLObject original_cycl, SubLObject display, SubLObject required, SubLObject approval_code,
      SubLObject unassertible_sentence_ids)
  {
    if( renderers == UNPROVIDED )
    {
      renderers = NIL;
    }
    if( original_cycl == UNPROVIDED )
    {
      original_cycl = NIL;
    }
    if( display == UNPROVIDED )
    {
      display = T;
    }
    if( required == UNPROVIDED )
    {
      required = T;
    }
    if( approval_code == UNPROVIDED )
    {
      approval_code = NIL;
    }
    if( unassertible_sentence_ids == UNPROVIDED )
    {
      unassertible_sentence_ids = $str50$;
    }
    if( NIL == unassertible_sentence_ids )
    {
      unassertible_sentence_ids = $str50$;
    }
    final SubLObject concept_id = document_annotation_widgets.term_learner_id( cycl );
    final SubLObject legend_string = get_legend_string_from_justifications( justifications );
    SubLObject term_learner_type = ConsesLow.list( new SubLObject[] { $kw117$CYCL, cycl, $kw118$WEIGHT, weight, $kw19$JUSTIFICATIONS, justifications, $kw21$FRAGMENT_JUSTIFICATION, fragment_justification,
      $kw119$CONCEPT_ID, concept_id, $kw120$NL_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings( nl_string ), $kw121$LEGEND_STRING, legend_string, $kw94$ASSERT_SENTENCE, assert_sentence,
      $kw122$ASSERT_SENTENCE_ID, kb_utilities.compact_hl_external_id_string( assert_sentence ), $kw123$STATUS_CODE, status_code, $kw10$REQUIRED, required, $kw9$DISPLAY, display, $kw12$UNASSERTIBLE_SENTENCE_IDS,
      unassertible_sentence_ids
    } );
    if( NIL != approval_code )
    {
      term_learner_type = conses_high.putf( term_learner_type, $kw11$APPROVAL_CODE, approval_code );
    }
    if( NIL != renderers )
    {
      term_learner_type = conses_high.putf( term_learner_type, $kw7$RENDERERS, renderers );
    }
    if( NIL != legend_string )
    {
      term_learner_type = conses_high.putf( term_learner_type, $kw121$LEGEND_STRING, legend_string );
    }
    if( NIL != original_cycl )
    {
      term_learner_type = conses_high.putf( term_learner_type, $kw124$REPLICATION_SENTENCE_ID, document_annotation_widgets.term_learner_id( free_some_variables( assert_sentence ) ) );
    }
    return term_learner_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 27649L)
  public static SubLObject free_some_variables(SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $allow_changes_to_focal_term_on_replicate$.getDynamicValue( thread ) )
    {
      return sentence;
    }
    SubLObject cdolist_list_var = cycl_utilities.formula_args( sentence, UNPROVIDED );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == cycl_grammar.cycl_variable_p( arg ) && NIL == fort_types_interface.predicate_p( arg ) )
      {
        sentence = cycl_utilities.expression_subst( czer_utilities.unique_el_var_wrt_expression( sentence, UNPROVIDED ), arg, sentence, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 27986L)
  public static SubLObject get_term_learner_renderer_for_cycl_string(final SubLObject term_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym125$GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING, term_string ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym125$GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING, term_string ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject v_term = Eval.eval( reader.read_from_string( web_utilities.html_url_decode( term_string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return get_term_learner_renderer_for_cycl( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 28315L)
  public static SubLObject get_term_learner_renderer_for_cycl_id(final SubLObject term_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym126$GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID, term_id ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym126$GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID, term_id ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject v_term = document_annotation_widgets.term_learner_object_from_id( term_id );
    return get_term_learner_renderer_for_cycl( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 28565L)
  public static SubLObject get_term_learner_renderer_for_cycl(final SubLObject v_term)
  {
    final SubLObject nl = pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject constraints = ( NIL != fort_types_interface.collectionP( v_term ) ) ? $list128 : $list129;
    return ConsesLow.list( new_term_learner_open_select_renderer( NIL, ConsesLow.list( ConsesLow.list( nl, v_term, T ) ), v_term, constraints, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 28873L)
  public static SubLObject get_term_learner_string_renderer_for_cycl_string(final SubLObject v_cycl_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym130$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING, v_cycl_string ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym130$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING,
            v_cycl_string ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject v_term = Eval.eval( reader.read_from_string( web_utilities.html_url_decode( v_cycl_string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return get_term_learner_string_renderer_for_cycl( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 29180L)
  public static SubLObject get_term_learner_string_renderer_for_cycl_id(final SubLObject term_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym131$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID, term_id ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym131$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID, term_id ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject v_term = document_annotation_widgets.term_learner_object_from_id( term_id );
    return get_term_learner_string_renderer_for_cycl( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 29451L)
  public static SubLObject get_term_learner_string_renderer_for_cycl(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym132$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL, v_term ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym132$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL, v_term ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject nl = pph_main.generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject constraints = ( NIL != fort_types_interface.collectionP( v_term ) ) ? $list128 : $list129;
    return ConsesLow.list( new_term_learner_string_renderer( nl, v_term, $kw20$DEFAULT, constraints ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 29821L)
  public static SubLObject get_term_learner_string_renderer_from_open_select_renderer_list(final SubLObject renderers)
  {
    SubLObject cdolist_list_var = renderers;
    SubLObject renderer = NIL;
    renderer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( conses_high.getf( renderer, $kw134$RENDERER_TYPE, UNPROVIDED ) == $kw135$OPEN_SELECT_RENDERER )
      {
        SubLObject v_term = NIL;
        if( NIL == v_term )
        {
          SubLObject csome_list_var = conses_high.getf( renderer, $kw137$SELECTION_RENDERERS, UNPROVIDED );
          SubLObject selection_renderer = NIL;
          selection_renderer = csome_list_var.first();
          while ( NIL == v_term && NIL != csome_list_var)
          {
            if( NIL != conses_high.getf( selection_renderer, $kw136$INITIALLY_SELECTED, UNPROVIDED ) )
            {
              v_term = conses_high.getf( selection_renderer, $kw117$CYCL, UNPROVIDED );
            }
            csome_list_var = csome_list_var.rest();
            selection_renderer = csome_list_var.first();
          }
        }
        if( NIL != v_term )
        {
          return get_term_learner_string_renderer_for_cycl( v_term );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      renderer = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 30290L)
  public static SubLObject new_term_learner_string_renderer(final SubLObject string, SubLObject cycl, SubLObject display_linkP, SubLObject arg_constraints)
  {
    if( cycl == UNPROVIDED )
    {
      cycl = NIL;
    }
    if( display_linkP == UNPROVIDED )
    {
      display_linkP = $kw20$DEFAULT;
    }
    if( arg_constraints == UNPROVIDED )
    {
      arg_constraints = NIL;
    }
    SubLObject result = ConsesLow.list( $kw134$RENDERER_TYPE, $kw138$STRING_RENDERER, $kw67$STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings( string ) );
    if( display_linkP == $kw20$DEFAULT )
    {
      display_linkP = makeBoolean( NIL != forts.fort_p( cycl ) && NIL == kb_accessors.relation_in_any_mtP( cycl ) );
    }
    if( NIL != display_linkP )
    {
      result = conses_high.putf( result, $kw139$DISPLAY_LINK, T );
    }
    if( NIL != cycl && !cycl.equal( $kw140$PPH_EMPTY_CYCL ) )
    {
      result = conses_high.putf( result, $kw119$CONCEPT_ID, document_annotation_widgets.term_learner_id( cycl ) );
      result = conses_high.putf( result, $kw117$CYCL, cycl );
    }
    if( NIL != conses_high.getf( arg_constraints, $kw141$GENLS, UNPROVIDED ) )
    {
      result = conses_high.putf( result, $kw142$GENLS_CONSTRAINTS, cyc_terms_to_term_learner_terms( conses_high.getf( arg_constraints, $kw141$GENLS, UNPROVIDED ) ) );
    }
    if( NIL != conses_high.getf( arg_constraints, $kw143$ISA, UNPROVIDED ) )
    {
      result = conses_high.putf( result, $kw144$ISA_CONSTRAINTS, cyc_terms_to_term_learner_terms( conses_high.getf( arg_constraints, $kw143$ISA, UNPROVIDED ) ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 31220L)
  public static SubLObject new_term_learner_modifiable_string_renderer(final SubLObject string, final SubLObject arg_pos)
  {
    return ConsesLow.list( $kw134$RENDERER_TYPE, $kw145$MODIFIABLE_STRING_RENDERER, $kw67$STRING, string, $kw146$ARG_POS, arg_pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 31534L)
  public static SubLObject new_term_learner_modifiable_text_renderer(final SubLObject string, final SubLObject arg_pos)
  {
    return ConsesLow.list( $kw134$RENDERER_TYPE, $kw147$MODIFIABLE_TEXT_RENDERER, $kw67$STRING, string, $kw146$ARG_POS, arg_pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 31809L)
  public static SubLObject new_term_learner_open_select_renderer(final SubLObject arg_pos, final SubLObject nl_cycl_valid_triples, SubLObject selected_cycl, SubLObject arg_constraints, SubLObject allow_duplicationP)
  {
    if( selected_cycl == UNPROVIDED )
    {
      selected_cycl = NIL;
    }
    if( arg_constraints == UNPROVIDED )
    {
      arg_constraints = NIL;
    }
    if( allow_duplicationP == UNPROVIDED )
    {
      allow_duplicationP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ret_value = ConsesLow.list( $kw134$RENDERER_TYPE, $kw135$OPEN_SELECT_RENDERER );
    final SubLObject constraint_nl = arg_constraint_string( arg_constraints );
    if( NIL != arg_pos )
    {
      ret_value = conses_high.putf( ret_value, $kw146$ARG_POS, arg_pos );
    }
    thread.resetMultipleValues();
    SubLObject renderers = new_term_learner_open_select_renderer_int( nl_cycl_valid_triples, selected_cycl );
    final SubLObject new_entry_box_added = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == new_entry_box_added )
    {
      if( NIL != renderers )
      {
        final SubLObject new_cons = ConsesLow.cons( ConsesLow.listS( $kw67$STRING, ( NIL != constraint_nl ) ? Sequences.cconcatenate( $str148$Some_other_, constraint_nl ) : $str149$Something_else, $list150 ), NIL );
        final SubLObject list = renderers;
        if( NIL != list )
        {
          subl_macros.rplacd_last( list, new_cons );
        }
        else
        {
          renderers = new_cons;
        }
      }
      else
      {
        final SubLObject new_cons = ConsesLow.cons( ConsesLow.listS( $kw67$STRING, ( NIL != constraint_nl ) ? constraint_nl : $str50$, $list150 ), NIL );
        final SubLObject list = renderers;
        if( NIL != list )
        {
          subl_macros.rplacd_last( list, new_cons );
        }
        else
        {
          renderers = new_cons;
        }
      }
    }
    ret_value = conses_high.putf( ret_value, $kw137$SELECTION_RENDERERS, renderers );
    if( NIL != conses_high.getf( arg_constraints, $kw141$GENLS, UNPROVIDED ) )
    {
      ret_value = conses_high.putf( ret_value, $kw142$GENLS_CONSTRAINTS, cyc_terms_to_term_learner_terms( conses_high.getf( arg_constraints, $kw141$GENLS, UNPROVIDED ) ) );
    }
    if( NIL != conses_high.getf( arg_constraints, $kw143$ISA, UNPROVIDED ) )
    {
      ret_value = conses_high.putf( ret_value, $kw144$ISA_CONSTRAINTS, cyc_terms_to_term_learner_terms( conses_high.getf( arg_constraints, $kw143$ISA, UNPROVIDED ) ) );
    }
    if( NIL != constraint_nl )
    {
      ret_value = conses_high.putf( ret_value, $kw151$CONSTRAINT_STRING, constraint_nl );
    }
    if( NIL != allow_duplicationP )
    {
      ret_value = conses_high.putf( ret_value, $kw152$ALLOW_DUPLICATION, T );
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 34828L)
  public static SubLObject arg_constraint_string(final SubLObject arg_constraints)
  {
    final SubLObject genls_constraints = conses_high.getf( arg_constraints, $kw141$GENLS, UNPROVIDED );
    final SubLObject isa_constraints = conses_high.getf( arg_constraints, $kw143$ISA, UNPROVIDED );
    final SubLObject sorted_constraints = Sort.sort( Sequences.cconcatenate( isa_constraints, genls_constraints ), $sym153$_, $sym154$GENERALITY_ESTIMATE );
    SubLObject min_constraint = NIL;
    min_constraint = list_utilities.first_n_if( ONE_INTEGER, $sym155$THCL_FORT_, sorted_constraints, UNPROVIDED ).first();
    if( NIL == min_constraint )
    {
      min_constraint = sorted_constraints.first();
    }
    if( NIL != min_constraint )
    {
      return pph_main.generate_phrase( min_constraint, $list156, NIL, cure_default_generation_mt( UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 35651L)
  public static SubLObject new_term_learner_open_select_renderer_int(final SubLObject triple_list, SubLObject selected_cycl)
  {
    if( selected_cycl == UNPROVIDED )
    {
      selected_cycl = NIL;
    }
    SubLObject renderers = NIL;
    SubLObject new_entry_box_added = NIL;
    SubLObject initial_selection_done = NIL;
    SubLObject cdolist_list_var = triple_list;
    SubLObject list_elt = NIL;
    list_elt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( list_elt.first() == $kw157$TEXT_MATCHES )
      {
        renderers = ConsesLow.cons( ConsesLow.list( $kw157$TEXT_MATCHES, conses_high.second( list_elt ), new_term_learner_open_select_renderer_int( conses_high.third( list_elt ), UNPROVIDED ) ), renderers );
      }
      else
      {
        SubLObject current;
        final SubLObject datum = current = list_elt;
        SubLObject nl = NIL;
        SubLObject cycl = NIL;
        SubLObject valid = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
        nl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
        cycl = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
        valid = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject renderer = ConsesLow.list( $kw67$STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings( nl ), $kw159$VALID, valid );
          if( NIL == cycl )
          {
            renderer = conses_high.putf( renderer, $kw117$CYCL, $str160$newValue );
            renderer = conses_high.putf( renderer, $kw161$CYCL_ID, $str160$newValue );
            new_entry_box_added = T;
          }
          else if( NIL != cycl )
          {
            renderer = conses_high.putf( renderer, $kw161$CYCL_ID, document_annotation_widgets.term_learner_id( cycl ) );
            renderer = conses_high.putf( renderer, $kw117$CYCL, cycl );
          }
          if( NIL == initial_selection_done && cycl.eql( selected_cycl ) )
          {
            renderer = conses_high.putf( renderer, $kw136$INITIALLY_SELECTED, T );
            initial_selection_done = T;
          }
          renderers = ConsesLow.cons( renderer, renderers );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      list_elt = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( renderers ), new_entry_box_added );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 37003L)
  public static SubLObject get_legend_string_from_justifications(final SubLObject justifications)
  {
    SubLObject legend_string = NIL;
    if( NIL == legend_string )
    {
      SubLObject csome_list_var;
      SubLObject justification;
      for( csome_list_var = justifications, justification = NIL, justification = csome_list_var.first(); NIL == legend_string && NIL != csome_list_var; legend_string = term_learner_justification_string(
          justification ), csome_list_var = csome_list_var.rest(), justification = csome_list_var.first() )
      {
      }
    }
    return legend_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 37281L)
  public static SubLObject new_term_learner_single_justification_type(final SubLObject cycl, final SubLObject weight, final SubLObject justification, final SubLObject nl_string, final SubLObject assert_sentence,
      final SubLObject status_code, SubLObject displayP, SubLObject requiredP, SubLObject selectedP)
  {
    if( displayP == UNPROVIDED )
    {
      displayP = T;
    }
    if( requiredP == UNPROVIDED )
    {
      requiredP = T;
    }
    if( selectedP == UNPROVIDED )
    {
      selectedP = NIL;
    }
    final SubLObject concept_id = document_annotation_widgets.term_learner_id( cycl );
    return ConsesLow.list( new SubLObject[] { $kw117$CYCL, cycl, $kw118$WEIGHT, weight, $kw162$JUSTIFICATION, justification, $kw119$CONCEPT_ID, concept_id, $kw120$NL_STRING, unicode_nauts
        .convert_unicode_nauts_to_utf8_strings( nl_string ), $kw122$ASSERT_SENTENCE_ID, document_annotation_widgets.term_learner_id( assert_sentence ), $kw123$STATUS_CODE, status_code, $kw9$DISPLAY, displayP,
      $kw10$REQUIRED, requiredP, $kw136$INITIALLY_SELECTED, selectedP
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 38033L)
  public static SubLObject term_learner_add_lexical_phrase(final SubLObject phrase_string, final SubLObject term_id, SubLObject original_string, SubLObject document_url, SubLObject doc_title, SubLObject user,
      SubLObject lexical_mt)
  {
    if( original_string == UNPROVIDED )
    {
      original_string = NIL;
    }
    if( document_url == UNPROVIDED )
    {
      document_url = NIL;
    }
    if( doc_title == UNPROVIDED )
    {
      doc_title = NIL;
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym163$TERM_LEARNER_ADD_LEXICAL_PHRASE, phrase_string, term_id, original_string, document_url, user, lexical_mt ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym163$TERM_LEARNER_ADD_LEXICAL_PHRASE, phrase_string, term_id,
            original_string, document_url, user, lexical_mt ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject v_term = document_annotation_widgets.term_learner_object_from_id( term_id );
    final SubLObject lexical_justifications = ConsesLow.list( new_term_learner_justification( phrase_string, $str50$, $kw97$USER, NIL, document_annotation_widgets.term_learner_id( lexical_mt ) ) );
    final SubLObject fragment_justification = NIL;
    final SubLObject default_weight = $float98$0_9;
    SubLObject result = NIL;
    final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $current_tl_task$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      $current_tl_task$.bind( default_task_for_user( user ), thread );
      final SubLObject domain_mt = query_mt_for_task( $current_tl_task$.getDynamicValue( thread ) );
      final SubLObject lexical_formula = auto_lexifier.auto_lexify( phrase_string, v_term, lexical_mt, domain_mt ).first();
      final SubLObject renderers = ConsesLow.list( new_term_learner_string_renderer( phrase_string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL != result )
      {
        result = ConsesLow.cons( new_term_learner_type_int( lexical_formula, default_weight, lexical_justifications, fragment_justification, phrase_string, lexical_formula, $term_learner_unknown_assertible$
            .getGlobalValue(), renderers, NIL, T, T, NIL, NIL ), result );
      }
      else
      {
        term_learner_assert_lexical_info( v_term, phrase_string, domain_mt, lexical_mt, lexical_formula );
        result = ConsesLow.cons( new_term_learner_type_int( lexical_formula, default_weight, lexical_justifications, fragment_justification, phrase_string, lexical_formula, $term_learner_known_removable$
            .getGlobalValue(), renderers, NIL, T, T, NIL, NIL ), result );
      }
    }
    finally
    {
      $current_tl_task$.rebind( _prev_bind_3, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_2, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 42478L)
  public static SubLObject xml_term_learner_user_choice(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject command = string_to_user_action_keyword( html_utilities.html_extract_input( $str164$userAction, args ) );
    final SubLObject term_string = html_utilities.html_extract_input( $str165$termString, args );
    final SubLObject choice_id = string_utilities.trim_whitespace( web_utilities.html_url_decode( html_utilities.html_extract_input( $str166$choiceid, args ) ) );
    final SubLObject substitutions = get_substitutions_from_args( args );
    final SubLObject justifications = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str167$justifications, args ), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject sentence_id_string = html_utilities.html_extract_input( $str168$sentenceId, args );
    final SubLObject term_id = string_utilities.trim_whitespace( html_utilities.html_extract_input( $str169$termId, args ) );
    final SubLObject title = string_utilities.trim_whitespace( html_utilities.html_extract_input( $str170$title, args ) );
    final SubLObject url = web_utilities.html_url_decode( html_utilities.html_extract_input( $str171$url, args ) );
    final SubLObject result_value = term_learner_user_choice( choice_id, term_string, term_id, sentence_id_string, substitutions, command, justifications, url, title, api_control_vars.$the_cyclist$.getDynamicValue(
        thread ) );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      SubLObject status_attrs = ConsesLow.list( $str172$code, conses_high.getf( result_value, $kw123$STATUS_CODE, UNPROVIDED ) );
      if( NIL != conses_high.getf( result_value, $kw173$SENTENCE_ID, UNPROVIDED ) )
      {
        status_attrs = Sequences.cconcatenate( status_attrs, ConsesLow.list( $str168$sentenceId, conses_high.getf( result_value, $kw173$SENTENCE_ID, UNPROVIDED ) ) );
      }
      if( NIL != conses_high.getf( result_value, $kw174$NEW_SENTENCE_ID, UNPROVIDED ) )
      {
        status_attrs = Sequences.cconcatenate( status_attrs, ConsesLow.list( $str175$newSentenceId, conses_high.getf( result_value, $kw174$NEW_SENTENCE_ID, UNPROVIDED ) ) );
      }
      try
      {
        final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str176$status, status_attrs, NIL, NIL, $kw177$UNINITIALIZED );
          final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
            if( NIL != conses_high.getf( result_value, $kw178$NEW_CYCL, UNPROVIDED ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$16 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str179$newCycLSentenceHLIDString, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$17 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                    xml_utilities.xml_print( web_utilities.html_url_encode( conses_high.getf( result_value, $kw180$NEW_CYCL_HL_ID, UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$17, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$17, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$16, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str179$newCycLSentenceHLIDString );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                }
              }
            }
            if( NIL != conses_high.getf( result_value, $kw178$NEW_CYCL, UNPROVIDED ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str181$newCycLSentenceDisplayString, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                    xml_utilities.xml_print( web_utilities.html_url_encode( kb_utilities.pretty_print_cycl_to_string( conses_high.getf( result_value, $kw178$NEW_CYCL, UNPROVIDED ), UNPROVIDED ), UNPROVIDED ),
                        UNPROVIDED );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$20, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$19, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str181$newCycLSentenceDisplayString );
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                }
              }
            }
            if( NIL != conses_high.getf( result_value, $kw120$NL_STRING, UNPROVIDED ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str182$newNLSentence, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                    xml_utilities.xml_print( web_utilities.html_url_encode( conses_high.getf( result_value, $kw120$NL_STRING, UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$23, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$19, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$22, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str182$newNLSentence );
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
                }
              }
            }
            try
            {
              final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str183$justification, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                  xml_utilities.xml_print( conses_high.getf( result_value, $kw162$JUSTIFICATION, UNPROVIDED ), UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$26, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$20, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$25, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str183$justification );
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$15, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$14, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values5 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str176$status );
          Values.restoreValuesFromVector( _values5 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 44598L)
  public static SubLObject get_substitutions_from_args(final SubLObject args)
  {
    SubLObject substitutions = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list186 );
      key = current.first();
      current = ( value = current.rest() );
      if( NIL != string_utilities.starts_with( key, $str187$cyclarg ) )
      {
        substitutions = ConsesLow.cons( ConsesLow.list( web_utilities.html_url_decode( string_utilities.substring( key, SEVEN_INTEGER, UNPROVIDED ) ), web_utilities.html_url_decode( value.first() ), $kw161$CYCL_ID ),
            substitutions );
      }
      if( NIL != string_utilities.starts_with( key, $str188$stringarg ) )
      {
        substitutions = ConsesLow.cons( ConsesLow.list( web_utilities.html_url_decode( string_utilities.substring( key, NINE_INTEGER, UNPROVIDED ) ), web_utilities.html_url_decode( value.first() ), $kw67$STRING ),
            substitutions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return substitutions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 45080L)
  public static SubLObject string_to_user_action_keyword(final SubLObject string)
  {
    if( string.equalp( $str189$assert ) )
    {
      return $kw190$ASSERT;
    }
    if( string.equalp( $str191$replace ) )
    {
      return $kw192$REPLACE;
    }
    if( string.equalp( $str193$unassert ) )
    {
      return $kw194$UNASSERT;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 45307L)
  public static SubLObject term_learner_user_choice(final SubLObject choice_id, final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_id_string, final SubLObject substitutions,
      final SubLObject command, final SubLObject justifications, final SubLObject url, final SubLObject doc_title, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] {
        $sym195$TERM_LEARNER_USER_CHOICE, choice_id, term_string, term_id, sentence_id_string, substitutions, command, justifications, url, doc_title, user
      } ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] { $sym195$TERM_LEARNER_USER_CHOICE, choice_id,
          term_string, term_id, sentence_id_string, substitutions, command, justifications, url, doc_title, user
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject sentence_template = kb_utilities.maybe_find_object_by_compact_hl_external_id_string( sentence_id_string );
    if( command == $kw194$UNASSERT )
    {
      return term_learner_handle_user_choice( choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, $kw196$REJECT, T );
    }
    if( command == $kw192$REPLACE )
    {
      term_learner_handle_user_choice( choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, $kw196$REJECT, T );
    }
    if( NIL != conses_high.member( command, $list197, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject new_sentence = sentence_template;
      SubLObject cdolist_list_var = substitutions;
      SubLObject substitution = NIL;
      substitution = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = substitution;
        SubLObject argpos_string = NIL;
        SubLObject raw_new_value = NIL;
        SubLObject type = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
        argpos_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
        raw_new_value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
        type = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject arg_pos = reader.read_from_string_ignoring_errors( argpos_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject new_value = ( type == $kw67$STRING ) ? raw_new_value : document_annotation_widgets.term_learner_object_from_id( string_utilities.trim_whitespace( raw_new_value ) );
          new_sentence = el_utilities.replace_formula_arg_position( arg_pos, new_value, new_sentence );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list198 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        substitution = cdolist_list_var.first();
      }
      SubLObject assert_result = term_learner_handle_user_choice( choice_id, term_string, term_id, new_sentence, justifications, url, doc_title, user, $kw199$ACCEPT, T );
      final SubLObject nl_sentence_string = get_nl_generation_for_user_added_sentence( new_sentence );
      final SubLObject utf8_sentence = unicode_nauts.convert_unicode_nauts_to_utf8_strings( new_sentence );
      assert_result = conses_high.putf( assert_result, $kw178$NEW_CYCL, utf8_sentence );
      assert_result = conses_high.putf( assert_result, $kw174$NEW_SENTENCE_ID, document_annotation_widgets.term_learner_id( new_sentence ) );
      if( NIL != nl_sentence_string )
      {
        assert_result = conses_high.putf( assert_result, $kw200$NEW_NL_SENTENCE, nl_sentence_string );
      }
      assert_result = conses_high.putf( assert_result, $kw201$NEW_CYCL_SENTENCE_STRING, utf8_sentence );
      assert_result = conses_high.putf( assert_result, $kw173$SENTENCE_ID, document_annotation_widgets.term_learner_id( sentence_template ) );
      return assert_result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 47829L)
  public static SubLObject xml_term_learner_create_new(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_pos = html_utilities.html_extract_input( $str202$argpos, args );
    final SubLObject doc_url = html_utilities.html_extract_input( $str171$url, args );
    final SubLObject doc_title = html_utilities.html_extract_input( $str170$title, args );
    final SubLObject justifications = NIL;
    SubLObject assert_sentence_strings = NIL;
    SubLObject nl_strings = NIL;
    SubLObject renderers = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.starts_with( arg.first(), $str203$sentence ) )
      {
        assert_sentence_strings = ConsesLow.cons( conses_high.second( arg ), assert_sentence_strings );
      }
      else if( NIL != string_utilities.starts_with( arg.first(), $str165$termString ) )
      {
        nl_strings = ConsesLow.cons( conses_high.second( arg ), nl_strings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    renderers = term_learner_create_new( assert_sentence_strings, nl_strings, arg_pos, justifications, doc_title, doc_url, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      xml_output_renderers( renderers );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 48568L)
  public static SubLObject is_formula_arg_position_a_collectionP(SubLObject formula, final SubLObject arg_pos, SubLObject mt, SubLObject col)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( col == UNPROVIDED )
    {
      col = $const49$Collection;
    }
    assert NIL != Types.listp( formula ) : formula;
    formula = el_utilities.replace_formula_arg_position( arg_pos, $sym206$_X88928381ASDF, formula );
    return genls.any_specP( col, at_var_types.formula_variable_isa_constraints( $sym206$_X88928381ASDF, formula, mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 48949L)
  public static SubLObject cure_assert_sentence(final SubLObject el_sentence, SubLObject user, SubLObject task, SubLObject mt)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = default_task_for_user( user );
    }
    if( mt == UNPROVIDED )
    {
      mt = hlmt_czer.coerce_to_hlmt( default_assert_mt_for_user_and_task( user, task ) );
    }
    return ke.ke_assert_now( el_sentence, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 49347L)
  public static SubLObject cure_unassert_sentence(final SubLObject el_sentence, SubLObject user, SubLObject task, SubLObject mt)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = default_task_for_user( user );
    }
    if( mt == UNPROVIDED )
    {
      mt = hlmt_czer.coerce_to_hlmt( default_assert_mt_for_user_and_task( user, task ) );
    }
    return ke.ke_unassert_now( el_sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 49738L)
  public static SubLObject create_new_cure_term_and_assert_sentence(final SubLObject nl_string, final SubLObject el_sentence, final SubLObject arg_pos, SubLObject tag_term, SubLObject user, SubLObject task,
      SubLObject mt, SubLObject lexical_mt)
  {
    if( tag_term == UNPROVIDED )
    {
      tag_term = $const56$DocIngesterUserCreatedTerm;
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = default_task_for_user( user );
    }
    if( mt == UNPROVIDED )
    {
      mt = hlmt_czer.coerce_to_hlmt( default_assert_mt_for_user_and_task( user, task ) );
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] {
        $sym209$CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE, nl_string, el_sentence, arg_pos, tag_term, user, task, mt, lexical_mt
      } ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] { $sym209$CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE,
          nl_string, el_sentence, arg_pos, tag_term, user, task, mt, lexical_mt
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject new_term = rkf_term_utilities.rkf_create( nl_string, NIL, $str50$, UNPROVIDED, UNPROVIDED );
    final SubLObject term_id = kb_utilities.compact_hl_external_id_string( new_term );
    final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      ke.ke_assert_now( ConsesLow.list( $const210$termDependsOn, new_term, mt ), $const211$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
      if( NIL != is_formula_arg_position_a_collectionP( el_sentence, arg_pos, mt, UNPROVIDED ) && !morphology.singularize_string( nl_string, UNPROVIDED ).equalp( nl_string ) )
      {
        ke.ke_rename( new_term, constants_high.suggest_constant_name( nl_string, $str50$, $str50$, $kw51$UPCASE, UNPROVIDED, UNPROVIDED ) );
      }
      term_learner_add_lexical_phrase( nl_string, term_id, $str50$, NIL, NIL, user, lexical_mt );
      if( NIL != constant_handles.valid_constant( tag_term, UNPROVIDED ) )
      {
        ke.ke_assert_now( ConsesLow.list( $const57$quotedIsa, new_term, tag_term ), $const54$BaseKB, UNPROVIDED, UNPROVIDED );
      }
      cure_assert_sentence( el_utilities.replace_formula_arg_position( arg_pos, new_term, el_sentence ), user, task, mt );
      return ConsesLow.list( $kw117$CYCL, new_term, $kw212$NL, nl_string, $kw213$HL_ID, kb_utilities.compact_hl_external_id_string( new_term ) );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_3, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 51511L)
  public static SubLObject term_learner_create_new(final SubLObject assert_sentence_strings, final SubLObject nl_strings, final SubLObject original_arg_pos, SubLObject justifications, SubLObject doc_title,
      SubLObject doc_url, SubLObject user, SubLObject lexical_mt)
  {
    if( justifications == UNPROVIDED )
    {
      justifications = NIL;
    }
    if( doc_title == UNPROVIDED )
    {
      doc_title = $str50$;
    }
    if( doc_url == UNPROVIDED )
    {
      doc_url = $str50$;
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( lexical_mt == UNPROVIDED )
    {
      lexical_mt = $term_learner_default_lexical_assertion_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] {
        $sym214$TERM_LEARNER_CREATE_NEW, assert_sentence_strings, nl_strings, original_arg_pos, justifications, doc_title, doc_url, user, lexical_mt
      } ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] { $sym214$TERM_LEARNER_CREATE_NEW,
          assert_sentence_strings, nl_strings, original_arg_pos, justifications, doc_title, doc_url, user, lexical_mt
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    SubLObject new_term = NIL;
    SubLObject term_id = NIL;
    final SubLObject term_strings = Mapping.mapcar( $sym215$HTML_URL_DECODE, nl_strings );
    final SubLObject primary_term_string = term_strings.first();
    if( NIL == justifications )
    {
      justifications = ConsesLow.list( new_term_learner_justification( primary_term_string, $str50$, $kw97$USER, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject _prev_bind_3 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      final SubLObject mt = get_mts_for_user_choice( doc_url, doc_title, justifications, user, UNPROVIDED ).first();
      new_term = rkf_term_utilities.rkf_create( primary_term_string, NIL, $str50$, UNPROVIDED, UNPROVIDED );
      term_id = kb_utilities.compact_hl_external_id_string( new_term );
      if( NIL != constant_handles.valid_constant( $const56$DocIngesterUserCreatedTerm, UNPROVIDED ) )
      {
        rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const57$quotedIsa, new_term, $list58 ), $const54$BaseKB, UNPROVIDED, UNPROVIDED );
      }
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const210$termDependsOn, new_term, mt ), $const211$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
      SubLObject non_isa_sentences = NIL;
      final SubLObject base_sentences = Mapping.mapcar( $sym216$GET_BASE_SENTENCE_FROM_SENTENCE_STRING, assert_sentence_strings );
      final SubLObject isa_collection = new_term_will_be_collectionP( base_sentences );
      SubLObject cdolist_list_var = base_sentences;
      SubLObject base_sentence = NIL;
      base_sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sentence = conses_high.subst( new_term, $kw217$NEW_TERM, base_sentence, UNPROVIDED, UNPROVIDED );
        if( cycl_utilities.formula_arg0( sentence ).eql( $const55$isa ) )
        {
          rkf_assertion_utilities.rkf_assert_with_implicature( sentence, ( NIL != isa_collection ) ? $const211$UniversalVocabularyMt : mt, T );
        }
        else
        {
          non_isa_sentences = ConsesLow.cons( sentence, non_isa_sentences );
        }
        cdolist_list_var = cdolist_list_var.rest();
        base_sentence = cdolist_list_var.first();
      }
      cdolist_list_var = non_isa_sentences;
      SubLObject sentence2 = NIL;
      sentence2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject assert_mt = assert_mt_for_sentence( sentence2, mt, isa_collection );
        rkf_assertion_utilities.rkf_assert_with_implicature( sentence2, assert_mt, T );
        cdolist_list_var = cdolist_list_var.rest();
        sentence2 = cdolist_list_var.first();
      }
      if( NIL != fort_types_interface.collectionP( new_term ) && !morphology.singularize_string( primary_term_string, UNPROVIDED ).equalp( primary_term_string ) )
      {
        ke.ke_rename( new_term, constants_high.suggest_constant_name( primary_term_string, $str50$, $str50$, $kw51$UPCASE, UNPROVIDED, UNPROVIDED ) );
      }
      SubLObject cdolist_list_var2 = term_strings;
      SubLObject string = NIL;
      string = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        term_learner_add_lexical_phrase( string, term_id, $str50$, doc_url, doc_title, user, lexical_mt );
        cdolist_list_var2 = cdolist_list_var2.rest();
        string = cdolist_list_var2.first();
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_3, thread );
    }
    return Values.values( ConsesLow.list( new_term_learner_open_select_renderer( original_arg_pos, ConsesLow.list( ConsesLow.list( primary_term_string, new_term, T ) ), new_term, UNPROVIDED, UNPROVIDED ) ), new_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 55081L)
  public static SubLObject assert_mt_for_sentence(final SubLObject sentence, final SubLObject default_mt, final SubLObject isa_collection)
  {
    if( NIL == isa_collection )
    {
      return default_mt;
    }
    if( NIL != genl_predicates.genl_predP( cycl_utilities.formula_arg0( sentence ), $const55$isa, UNPROVIDED, UNPROVIDED ) )
    {
      return $const211$UniversalVocabularyMt;
    }
    if( NIL != genl_predicates.genl_predP( cycl_utilities.formula_arg0( sentence ), $const76$genls, UNPROVIDED, UNPROVIDED ) )
    {
      return $const211$UniversalVocabularyMt;
    }
    return default_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 55613L)
  public static SubLObject new_term_will_be_collectionP(final SubLObject sentences)
  {
    SubLObject isa_collection = NIL;
    if( NIL == isa_collection )
    {
      SubLObject csome_list_var;
      SubLObject sentence;
      for( csome_list_var = sentences, sentence = NIL, sentence = csome_list_var.first(); NIL == isa_collection && NIL != csome_list_var; isa_collection = makeBoolean( $kw217$NEW_TERM == cycl_utilities.formula_arg1(
          sentence, UNPROVIDED ) && ( $const76$genls.eql( cycl_utilities.formula_arg0( sentence ) ) || NIL != genl_predicates.genl_predP( cycl_utilities.formula_arg0( sentence ), $const76$genls, UNPROVIDED, UNPROVIDED )
              || ( $const55$isa.eql( cycl_utilities.formula_arg0( sentence ) ) && NIL != isa.isaP( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), $const110$CollectionType, UNPROVIDED, UNPROVIDED ) )
              || ( NIL != genl_predicates.genl_predP( cycl_utilities.formula_arg0( sentence ), $const55$isa, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( cycl_utilities.formula_arg2( sentence, UNPROVIDED ),
                  $const110$CollectionType, UNPROVIDED, UNPROVIDED ) ) ) ), csome_list_var = csome_list_var.rest(), sentence = csome_list_var.first() )
      {
      }
    }
    return isa_collection;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 56259L)
  public static SubLObject term_learner_renderer_for_new_taxonomic_relative(final SubLObject term_string, final SubLObject term_id, final SubLObject type_id, final SubLObject relation_type, SubLObject user,
      SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = default_task_for_user( user );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym218$TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE, term_string, term_id, type_id, relation_type, user, task ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym218$TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE,
            term_string, term_id, type_id, relation_type, user, task ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject type = document_annotation_widgets.term_learner_object_from_id( type_id );
    final SubLObject cycl_sentence = term_learner_get_taxonomic_sentence_for_new_type( relation_type, type );
    final SubLObject new_sentence_id = kb_utilities.compact_hl_external_id_string( cycl_sentence );
    final SubLObject new_term = ( NIL != string_utilities.non_empty_stringP( term_id ) ) ? document_annotation_widgets.term_learner_object_from_id( term_id )
        : Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), term_learner_create_new( ConsesLow.list( new_sentence_id ), ConsesLow.list( term_string ), $str50$, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) );
    final SubLObject assert_sentence = cycl_utilities.expression_subst( new_term, $kw217$NEW_TERM, cycl_sentence, UNPROVIDED, UNPROVIDED );
    rkf_assertion_utilities.rkf_assert_now( assert_sentence, default_assert_mt_for_user_and_task( user, task ) );
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_3 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject stream2 = NIL;
          try
          {
            final SubLObject _prev_bind_0_$33 = stream_macros.$stream_requires_locking$.currentBinding( thread );
            try
            {
              stream_macros.$stream_requires_locking$.bind( NIL, thread );
              stream2 = compatibility.open_text( $term_learner_user_added_types_log_file$.getDynamicValue( thread ), $kw30$APPEND );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$33, thread );
            }
            if( !stream2.isStream() )
            {
              Errors.error( $str31$Unable_to_open__S, $term_learner_user_added_types_log_file$.getDynamicValue( thread ) );
            }
            final SubLObject s = stream2;
            PrintLow.format( s, $str109$_input_cyctermid___A__date___A___, new SubLObject[] { kb_utilities.compact_hl_external_id_string( type ), numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ), term_string
            } );
          }
          finally
          {
            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              if( stream2.isStream() )
              {
                streams_high.close( stream2, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_3, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw40$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return get_term_learner_string_renderer_for_cycl( new_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 58300L)
  public static SubLObject term_learner_get_taxonomic_sentence_for_new_type(final SubLObject relation_type, final SubLObject existing_term)
  {
    if( relation_type.equal( $str219$spec ) )
    {
      return ConsesLow.list( $const76$genls, $kw217$NEW_TERM, existing_term );
    }
    if( relation_type.equal( $str220$instance ) )
    {
      return ConsesLow.list( $const55$isa, $kw217$NEW_TERM, existing_term );
    }
    return $kw221$INVALID;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 58584L)
  public static SubLObject get_base_sentence_from_sentence_string(final SubLObject sentence_string)
  {
    if( NIL != kb_utilities.compact_hl_external_id_string_p( sentence_string ) )
    {
      return kb_utilities.maybe_find_object_by_compact_hl_external_id_string( sentence_string );
    }
    return transform_list_utilities.transform( reader.read_from_string_ignoring_errors( sentence_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym222$FIND_BY_ID_STRING_P, $sym223$DECODE_ID_STRING,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 58917L)
  public static SubLObject find_by_id_string_p(final SubLObject cons)
  {
    return makeBoolean( cons.isList() && cons.first() == $sym224$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 59066L)
  public static SubLObject decode_id_string(final SubLObject cons)
  {
    return kb_utilities.maybe_find_object_by_compact_hl_external_id_string( conses_high.second( cons ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 59183L)
  public static SubLObject xml_term_learner_user_substitution(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject raw_sentence_id = html_utilities.html_extract_input( $str168$sentenceId, args );
    final SubLObject term_string = html_utilities.html_extract_input( $str165$termString, args );
    final SubLObject arg_pos_string = html_utilities.html_extract_input( $str225$argPos, args );
    final SubLObject limit_string = html_utilities.html_extract_input( $str226$limit, args );
    final SubLObject renderers = term_learner_user_substitution( raw_sentence_id, term_string, arg_pos_string, limit_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      xml_output_renderers( renderers );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return renderers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 59694L)
  public static SubLObject term_learner_user_substitution(SubLObject raw_sentence_id, final SubLObject term_string, SubLObject argpos_string, SubLObject limit_string, SubLObject raw_explicit_isa_constraints,
      SubLObject raw_explicit_genls_constraints, SubLObject user, SubLObject task, SubLObject allow_cycl_entryP)
  {
    if( raw_explicit_isa_constraints == UNPROVIDED )
    {
      raw_explicit_isa_constraints = NIL;
    }
    if( raw_explicit_genls_constraints == UNPROVIDED )
    {
      raw_explicit_genls_constraints = NIL;
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    if( allow_cycl_entryP == UNPROVIDED )
    {
      allow_cycl_entryP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] {
        $sym228$TERM_LEARNER_USER_SUBSTITUTION, raw_sentence_id, term_string, argpos_string, limit_string, raw_explicit_isa_constraints, raw_explicit_genls_constraints, user, task, allow_cycl_entryP
      } ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] { $sym228$TERM_LEARNER_USER_SUBSTITUTION,
          raw_sentence_id, term_string, argpos_string, limit_string, raw_explicit_isa_constraints, raw_explicit_genls_constraints, user, task, allow_cycl_entryP
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    if( NIL == raw_sentence_id )
    {
      raw_sentence_id = $str50$;
    }
    if( NIL == argpos_string )
    {
      argpos_string = $str50$;
    }
    if( NIL == limit_string )
    {
      limit_string = $str229$100;
    }
    if( NIL == task )
    {
      task = default_task_for_user( user );
    }
    final SubLObject original_sentence_id = string_utilities.string_subst( $str230$_, $str106$_, raw_sentence_id, UNPROVIDED );
    final SubLObject mt = wff_checking_mt_for_user_and_task( user, task );
    final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id( original_sentence_id );
    final SubLObject argpos = reader.read_from_string_ignoring_errors( argpos_string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject arg_value = ( NIL != sentence && NIL != argpos ) ? cycl_utilities.formula_arg_position( sentence, argpos, UNPROVIDED ) : NIL;
    final SubLObject limit = reader.read_from_string_ignoring_errors( limit_string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject query_var = $sym231$_THIS_QUERY_VAR;
    final SubLObject query_sentence = ( NIL != arg_value && NIL != sentence ) ? cycl_utilities.formula_subst( query_var, arg_value, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED ) : NIL;
    final SubLObject explicit_isa_constraints = term_learner_constraint_list_from_string( raw_explicit_isa_constraints );
    final SubLObject implied_isa_constraints = at_var_types.formula_variable_isa_constraints( query_var, query_sentence, mt, UNPROVIDED );
    final SubLObject isa_constraints = Sequences.cconcatenate( implied_isa_constraints, explicit_isa_constraints );
    final SubLObject duplicatableP = conses_high.member( argpos, cure_list_item_arg_poses( sentence ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject utf8_term_string = unicode_nauts.convert_unicode_nauts_to_utf8_strings( term_string );
    final SubLObject nl_mt = parsing_mt_for_task( task );
    if( NIL != constraint_filters.any_spec_ofP( isa_constraints, $const232$String, $const64$InferencePSC ) )
    {
      return new_term_learner_modifiable_string_renderer( term_string, argpos );
    }
    methods.funcall_instance_method_with_1_args( document_annotation_widgets.get_default_document_ingester_annotation_lexicon( nl_mt ), $sym33$LEARN, unicode_nauts.convert_unicode_nauts_to_utf8_strings( term_string ) );
    final SubLObject explicit_genls_constraints = term_learner_constraint_list_from_string( raw_explicit_genls_constraints );
    final SubLObject implied_genls_constraints = at_var_types.formula_variable_genl_constraints( query_var, query_sentence, mt, UNPROVIDED );
    final SubLObject genls_constraints = Sequences.cconcatenate( implied_genls_constraints, explicit_genls_constraints );
    final SubLObject lex_entries = methods.funcall_instance_method_with_1_args( document_annotation_widgets.get_default_document_ingester_annotation_lexicon( nl_mt ), $sym34$GET, utf8_term_string );
    final SubLObject cycl_entry_terms = ( NIL != allow_cycl_entryP ) ? cb_frames.terms_for_browsing( term_string, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject denot_cycls = Sequences.delete_duplicates( Sequences.cconcatenate( cycl_entry_terms, term_lexicon.denots_for_term_lexicon_entries( lex_entries ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject valid_denot_cycls = NIL;
    SubLObject initial_selection = NIL;
    final SubLObject denot_nls = term_learner_cycl_terms_to_nl_strings( denot_cycls, UNPROVIDED, UNPROVIDED );
    final SubLObject look_for_subwordsP = makeBoolean( NIL == Sequences.find_if( $sym233$NUMBERP, denot_cycls, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject subword_cycl_nl_pairs = ( NIL != look_for_subwordsP ) ? subword_nl_cycl_pairs_from_string( term_string ) : NIL;
    SubLObject nl_cycl_valid_triples = NIL;
    SubLObject cycl = NIL;
    SubLObject cycl_$35 = NIL;
    SubLObject nl_string = NIL;
    SubLObject nl_string_$36 = NIL;
    cycl = denot_cycls;
    cycl_$35 = cycl.first();
    nl_string = denot_nls;
    nl_string_$36 = nl_string.first();
    while ( NIL != nl_string || NIL != cycl)
    {
      thread.resetMultipleValues();
      final SubLObject not_invalid = term_learner_valid_substitution( cycl_$35, isa_constraints, genls_constraints, query_sentence, mt );
      final SubLObject passed_constraints = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != not_invalid && passed_constraints.numG( ZERO_INTEGER ) )
      {
        valid_denot_cycls = ConsesLow.cons( cycl_$35, valid_denot_cycls );
        nl_cycl_valid_triples = ConsesLow.cons( ConsesLow.list( nl_string_$36, cycl_$35, not_invalid ), nl_cycl_valid_triples );
      }
      cycl = cycl.rest();
      cycl_$35 = cycl.first();
      nl_string = nl_string.rest();
      nl_string_$36 = nl_string.first();
    }
    if( NIL == nl_cycl_valid_triples )
    {
      cycl = NIL;
      SubLObject cycl_$36 = NIL;
      nl_string = NIL;
      SubLObject nl_string_$37 = NIL;
      cycl = denot_cycls;
      cycl_$36 = cycl.first();
      nl_string = denot_nls;
      nl_string_$37 = nl_string.first();
      while ( NIL != nl_string || NIL != cycl)
      {
        final SubLObject not_invalid = term_learner_valid_substitution( cycl_$36, isa_constraints, genls_constraints, query_sentence, mt );
        if( NIL != not_invalid )
        {
          valid_denot_cycls = ConsesLow.cons( cycl_$36, valid_denot_cycls );
        }
        nl_cycl_valid_triples = ConsesLow.cons( ConsesLow.list( nl_string_$37, cycl_$36, not_invalid ), nl_cycl_valid_triples );
        cycl = cycl.rest();
        cycl_$36 = cycl.first();
        nl_string = nl_string.rest();
        nl_string_$37 = nl_string.first();
      }
    }
    if( NIL != list_utilities.lengthE( valid_denot_cycls, ONE_INTEGER, UNPROVIDED ) )
    {
      initial_selection = valid_denot_cycls.first();
    }
    nl_cycl_valid_triples = Sort.sort( nl_cycl_valid_triples, $sym234$SECOND_TRUE, $sym235$THIRD );
    SubLObject valid_text_match_triples = NIL;
    SubLObject invalid_text_match_triples = NIL;
    SubLObject cdolist_list_var = subword_cycl_nl_pairs;
    SubLObject cycl_nl = NIL;
    cycl_nl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cycl_nl;
      SubLObject cycl2 = NIL;
      SubLObject nl = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list236 );
      cycl2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list236 );
      nl = current.first();
      current = current.rest();
      if( NIL == current )
      {
        thread.resetMultipleValues();
        final SubLObject not_invalid2 = term_learner_valid_substitution( cycl2, isa_constraints, genls_constraints, query_sentence, mt );
        final SubLObject constraints_passed = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != not_invalid2 && constraints_passed.numG( ZERO_INTEGER ) )
        {
          valid_text_match_triples = ConsesLow.cons( ConsesLow.list( nl, cycl2, T ), valid_text_match_triples );
        }
        else
        {
          invalid_text_match_triples = ConsesLow.cons( ConsesLow.list( nl, cycl2, NIL ), invalid_text_match_triples );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list236 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl_nl = cdolist_list_var.first();
    }
    if( NIL != valid_text_match_triples )
    {
      final SubLObject text_match_count = ( NIL != limit ) ? Numbers.subtract( limit, Sequences.length( valid_denot_cycls ) ) : NIL;
      final SubLObject limited_matches = ( NIL != text_match_count ) ? list_utilities.random_n( text_match_count, valid_text_match_triples ) : valid_text_match_triples;
      final SubLObject remaining_needed = ( NIL != text_match_count ) ? Numbers.subtract( text_match_count, Sequences.length( limited_matches ) ) : NIL;
      final SubLObject limited_invalid_matches = ( NIL == remaining_needed ) ? invalid_text_match_triples
          : ( remaining_needed.numG( ZERO_INTEGER ) ? list_utilities.first_n( remaining_needed, invalid_text_match_triples ) : NIL );
      nl_cycl_valid_triples = ConsesLow.cons( ConsesLow.list( $kw157$TEXT_MATCHES, term_string, Sequences.cconcatenate( limited_matches, limited_invalid_matches ) ), nl_cycl_valid_triples );
    }
    return unicode_nauts.convert_unicode_nauts_to_utf8_strings( ConsesLow.list( new_term_learner_open_select_renderer( argpos, Sequences.nreverse( nl_cycl_valid_triples ), initial_selection, NIL, duplicatableP ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 66482L)
  public static SubLObject get_nl_cycl_valid_triples_via_scg(final SubLObject utf8_string, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject query_sentence, final SubLObject mt,
      SubLObject timeout)
  {
    if( timeout == UNPROVIDED )
    {
      timeout = THREE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject timed_out = NIL;
    SubLObject raw_scg_result = NIL;
    SubLObject triples = NIL;
    SubLObject cycls = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
          try
          {
            thread.throwStack.push( tag );
            final SubLObject _prev_bind_0_$39 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$within_with_timeout$.bind( T, thread );
              SubLObject timer = NIL;
              try
              {
                final SubLObject _prev_bind_0_$40 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                  timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                  raw_scg_result = scg_api.scg_parse_term( utf8_string, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$40, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  subl_macro_promotions.with_timeout_stop_timer( timer );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
                }
              }
            }
            finally
            {
              subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$39, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            timed_out = Errors.handleThrowable( ccatch_env_var, tag );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != timed_out )
          {
            Errors.warn( $str237$Timeout_attempting_to_call_SCG_on, utf8_string );
          }
          SubLObject cdolist_list_var = raw_scg_result;
          SubLObject cycl = NIL;
          cycl = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            thread.resetMultipleValues();
            final SubLObject not_invalid = term_learner_valid_substitution( cycl, isa_constraints, genls_constraints, query_sentence, mt );
            final SubLObject passed_constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != not_invalid && passed_constraints.numG( ZERO_INTEGER ) )
            {
              cycls = ConsesLow.cons( cycl, cycls );
              triples = ConsesLow.cons( ConsesLow.list( term_learner_cycl_term_to_nl_string( cycl, UNPROVIDED ).first(), cycl, not_invalid ), triples );
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw40$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( triples, cycls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 67278L)
  public static SubLObject term_learner_constraint_list_from_string(final SubLObject constraint_string)
  {
    SubLObject constraints = ( NIL == constraint_string || NIL != string_utilities.empty_string_p( constraint_string ) ) ? NIL : document_annotation_widgets.term_learner_object_from_id( constraint_string );
    if( NIL != cycl_grammar.cycl_denotational_term_p( constraints ) )
    {
      constraints = ConsesLow.list( constraints );
    }
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 67641L)
  public static SubLObject clear_term_learner_valid_substitution()
  {
    final SubLObject cs = $term_learner_valid_substitution_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 67641L)
  public static SubLObject remove_term_learner_valid_substitution(final SubLObject cycl_term, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject sentence, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_valid_substitution_caching_state$.getGlobalValue(), ConsesLow.list( cycl_term, isa_constraints, genls_constraints, sentence,
        mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 67641L)
  public static SubLObject term_learner_valid_substitution_internal(final SubLObject cycl_term, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject sentence, final SubLObject mt)
  {
    SubLObject invalid = NIL;
    SubLObject passed_constraints = ZERO_INTEGER;
    if( NIL == invalid )
    {
      SubLObject csome_list_var = isa_constraints;
      SubLObject isa_constraint = NIL;
      isa_constraint = csome_list_var.first();
      while ( NIL == invalid && NIL != csome_list_var)
      {
        if( NIL != lexicon_accessors.denot_has_typeP( cycl_term, isa_constraint, mt ) )
        {
          passed_constraints = Numbers.add( passed_constraints, ONE_INTEGER );
        }
        else if( NIL != at_defns.not_has_typeP( cycl_term, isa_constraint, mt ) )
        {
          invalid = T;
        }
        csome_list_var = csome_list_var.rest();
        isa_constraint = csome_list_var.first();
      }
    }
    if( NIL == invalid )
    {
      SubLObject csome_list_var = genls_constraints;
      SubLObject genls_constraint = NIL;
      genls_constraint = csome_list_var.first();
      while ( NIL == invalid && NIL != csome_list_var)
      {
        if( NIL != genls.genlsP( cycl_term, genls_constraint, mt, UNPROVIDED ) )
        {
          passed_constraints = Numbers.add( passed_constraints, ONE_INTEGER );
        }
        if( NIL != genls.not_genlP( cycl_term, genls_constraint, mt, UNPROVIDED ) )
        {
          invalid = T;
        }
        csome_list_var = csome_list_var.rest();
        genls_constraint = csome_list_var.first();
      }
    }
    return Values.values( makeBoolean( NIL == invalid ), passed_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 67641L)
  public static SubLObject term_learner_valid_substitution(final SubLObject cycl_term, final SubLObject isa_constraints, final SubLObject genls_constraints, final SubLObject sentence, final SubLObject mt)
  {
    SubLObject caching_state = $term_learner_valid_substitution_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym238$TERM_LEARNER_VALID_SUBSTITUTION, $sym239$_TERM_LEARNER_VALID_SUBSTITUTION_CACHING_STATE_, NIL, EQUALP, FIVE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym240$CLEAR_TERM_LEARNER_VALID_SUBSTITUTION );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( cycl_term, isa_constraints, genls_constraints, sentence, mt );
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
        if( cycl_term.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( isa_constraints.equalp( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( genls_constraints.equalp( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( sentence.equalp( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && mt.equalp( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_valid_substitution_internal( cycl_term, isa_constraints, genls_constraints, sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( cycl_term, isa_constraints, genls_constraints, sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 68701L)
  public static SubLObject subword_nl_cycl_pairs_from_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_set = lexicon_subword_index.nl_trie_subword_index_search_set( string, UNPROVIDED );
    SubLObject cycl_nl_pairs = NIL;
    final SubLObject dict = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    if( NIL == set.set_p( v_set ) )
    {
      return NIL;
    }
    if( !set.set_size( v_set ).numG( TWENTY_INTEGER ) )
    {
      final SubLObject set_contents_var = set.do_set_internal( v_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject super_string;
      SubLObject cdolist_list_var;
      SubLObject denot;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        super_string = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, super_string ) )
        {
          cdolist_list_var = lexicon_accessors.denots_of_string( super_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          denot = NIL;
          denot = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            dictionary_utilities.dictionary_push( dict, denot, super_string );
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
          }
        }
      }
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject cycl = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject strings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      cycl_nl_pairs = ConsesLow.cons( ConsesLow.list( cycl, Sort.sort( strings, $sym153$_, $sym241$LENGTH ).first() ), cycl_nl_pairs );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return cycl_nl_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 69216L)
  public static SubLObject xml_term_learner_possible_types_from_substitution(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence_id = html_utilities.html_extract_input( $str168$sentenceId, args );
    final SubLObject term_string = html_utilities.html_extract_input( $str165$termString, args );
    final SubLObject argpos_string = html_utilities.html_extract_input( $str225$argPos, args );
    final SubLObject sexpr_result = term_learner_possible_types_from_substitution( sentence_id, term_string, argpos_string, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      xml_output_term_types( sexpr_result );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 69668L)
  public static SubLObject term_learner_possible_types_from_substitution(final SubLObject sentence_id, final SubLObject term_string, final SubLObject argpos_string, SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym243$TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION, sentence_id, term_string, argpos_string ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym243$TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION, sentence_id,
            term_string, argpos_string ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    methods.funcall_instance_method_with_1_args( document_annotation_widgets.get_default_document_ingester_annotation_lexicon( UNPROVIDED ), $sym33$LEARN, unicode_nauts.convert_unicode_nauts_to_utf8_strings(
        term_string ) );
    final SubLObject mt = query_mt_for_user_and_task( user, task );
    final SubLObject nl_mt = parsing_mt_for_task( task );
    final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id( sentence_id );
    final SubLObject argpos = reader.read_from_string_ignoring_errors( argpos_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject arg_value = cycl_utilities.formula_arg_position( sentence, argpos, UNPROVIDED );
    final SubLObject query_var = $sym231$_THIS_QUERY_VAR;
    final SubLObject query_sentence = cycl_utilities.expression_subst( query_var, arg_value, sentence, UNPROVIDED, UNPROVIDED );
    final SubLObject isa_constraints = at_var_types.formula_variable_isa_constraints( query_var, query_sentence, mt, UNPROVIDED );
    final SubLObject genls_constraints = at_var_types.formula_variable_genl_constraints( query_var, query_sentence, mt, UNPROVIDED );
    final SubLObject denot_cycls = term_learner_get_word_denots_from_string( term_string, nl_mt );
    final SubLObject justification = new_term_learner_justification( term_string, $str50$, $kw97$USER, UNPROVIDED, UNPROVIDED );
    final SubLObject display_isa_constraintsP = list_utilities.lengthE( genls_constraints, ZERO_INTEGER, UNPROVIDED );
    SubLObject new_types = NIL;
    SubLObject cdolist_list_var = isa_constraints;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_types = ConsesLow.cons( new_term_learner_single_justification_type( v_isa, $float98$0_9, justification, term_learner_cycl_term_to_nl_string( v_isa, UNPROVIDED ).first(), ConsesLow.list( $const55$isa,
          $kw217$NEW_TERM, v_isa ), $term_learner_unknown_assertible$.getGlobalValue(), display_isa_constraintsP, UNPROVIDED, UNPROVIDED ), new_types );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    cdolist_list_var = genls_constraints;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_types = ConsesLow.cons( new_term_learner_single_justification_type( genl, $float98$0_9, justification, term_learner_cycl_term_to_nl_string( genl, UNPROVIDED ).first(), ConsesLow.list( $const76$genls,
          $kw217$NEW_TERM, genl ), $term_learner_unknown_assertible$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED ), new_types );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    final SubLObject valid_denots = NIL;
    SubLObject cdolist_list_var2 = denot_cycls;
    SubLObject denot = NIL;
    denot = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      thread.resetMultipleValues();
      final SubLObject not_invalid = term_learner_valid_substitution( denot, isa_constraints, genls_constraints, query_sentence, mt );
      final SubLObject constraints_passed = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != not_invalid && constraints_passed.numG( ZERO_INTEGER ) )
      {
        new_types = ConsesLow.cons( new_term_learner_single_justification_type( denot, $float98$0_9, justification, term_learner_cycl_term_to_nl_string( denot, UNPROVIDED ).first(), ConsesLow.list( $const76$genls,
            $kw217$NEW_TERM, denot ), $term_learner_unknown_assertible$.getGlobalValue(), T, NIL, list_utilities.singletonP( valid_denots ) ), new_types );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      denot = cdolist_list_var2.first();
    }
    if( NIL == new_types )
    {
      cdolist_list_var2 = denot_cycls;
      denot = NIL;
      denot = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        if( NIL != term_learner_valid_substitution( denot, isa_constraints, genls_constraints, query_sentence, mt ) )
        {
          new_types = ConsesLow.cons( new_term_learner_single_justification_type( denot, $float98$0_9, justification, term_learner_cycl_term_to_nl_string( denot, UNPROVIDED ).first(), ConsesLow.list( $const76$genls,
              $kw217$NEW_TERM, denot ), $term_learner_unknown_assertible$.getGlobalValue(), T, NIL, list_utilities.singletonP( valid_denots ) ), new_types );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        denot = cdolist_list_var2.first();
      }
    }
    return new_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 72632L)
  public static SubLObject term_learner_get_word_denots_from_string(final SubLObject string, SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject utf8 = unicode_nauts.convert_unicode_nauts_to_utf8_strings( string );
    final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon( nl_mt );
    final SubLObject sentence_iterator = concept_tagger.tag_concepts( document.new_document( utf8, NIL, $sym244$RKF_STANDARD_STRING_WORDIFY ), ConsesLow.list( $kw245$LEXICON, lexicon, $kw246$OUTPUT_SPEC,
        nl_api_datastructures.new_nl_interpretation_spec( $list247 ) ) );
    SubLObject result_cycls = NIL;
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject sentence_result = iteration.iteration_next( sentence_iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive( sentence_result );
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result_cycls = Sequences.cconcatenate( document.word_cycls( word ), result_cycls );
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return result_cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 73351L)
  public static SubLObject first_true(final SubLObject a, final SubLObject b)
  {
    return a;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 73479L)
  public static SubLObject second_true(final SubLObject a, final SubLObject b)
  {
    return b;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 73609L)
  public static SubLObject term_learner_autocomplete_native(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject prefix = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list250 );
    prefix = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$42 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list250 );
      current_$42 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list250 );
      if( NIL == conses_high.member( current_$42, $list251, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$42 == $kw6$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list250 );
    }
    final SubLObject limit_tail = cdestructuring_bind.property_list_member( $kw252$LIMIT, current );
    final SubLObject limit = ( NIL != limit_tail ) ? conses_high.cadr( limit_tail ) : TWENTY_INTEGER;
    final SubLObject return_attrs_tail = cdestructuring_bind.property_list_member( $kw253$RETURN_ATTRS, current );
    final SubLObject return_attrs = ( NIL != return_attrs_tail ) ? conses_high.cadr( return_attrs_tail ) : $str50$;
    final SubLObject sentence_tail = cdestructuring_bind.property_list_member( $kw254$SENTENCE, current );
    final SubLObject sentence = ( NIL != sentence_tail ) ? conses_high.cadr( sentence_tail ) : NIL;
    final SubLObject arg_pos_tail = cdestructuring_bind.property_list_member( $kw146$ARG_POS, current );
    final SubLObject arg_pos = ( NIL != arg_pos_tail ) ? conses_high.cadr( arg_pos_tail ) : ZERO_INTEGER;
    final SubLObject case_sensitive_tail = cdestructuring_bind.property_list_member( $kw255$CASE_SENSITIVE, current );
    final SubLObject case_sensitive = ( NIL != case_sensitive_tail ) ? conses_high.cadr( case_sensitive_tail ) : NIL;
    final SubLObject constants_tail = cdestructuring_bind.property_list_member( $kw256$CONSTANTS, current );
    final SubLObject constants = ( NIL != constants_tail ) ? conses_high.cadr( constants_tail ) : NIL;
    return ConsesLow.listS( $sym257$TERM_LEARNER_AUTOCOMPLETE_INT, new SubLObject[] { prefix, ConsesLow.list( $sym258$TO_STRING, limit ), return_attrs, ConsesLow.list( $sym259$COMPACT_HL_EXTERNAL_ID_STRING, sentence ),
      ConsesLow.list( $sym258$TO_STRING, arg_pos ), ConsesLow.list( $sym258$TO_STRING, case_sensitive ), ConsesLow.list( $sym258$TO_STRING, constants ), $list260
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 74025L)
  public static SubLObject term_learner_autocomplete(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject prefix = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list262 );
    prefix = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$43 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list262 );
      current_$43 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list262 );
      if( NIL == conses_high.member( current_$43, $list263, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$43 == $kw6$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list262 );
    }
    final SubLObject limit_tail = cdestructuring_bind.property_list_member( $kw252$LIMIT, current );
    final SubLObject limit = ( NIL != limit_tail ) ? conses_high.cadr( limit_tail ) : $str264$20;
    final SubLObject return_attrs_tail = cdestructuring_bind.property_list_member( $kw253$RETURN_ATTRS, current );
    final SubLObject return_attrs = ( NIL != return_attrs_tail ) ? conses_high.cadr( return_attrs_tail ) : $str50$;
    final SubLObject sentence_id_tail = cdestructuring_bind.property_list_member( $kw173$SENTENCE_ID, current );
    final SubLObject sentence_id = ( NIL != sentence_id_tail ) ? conses_high.cadr( sentence_id_tail ) : $str265$Mww;
    final SubLObject arg_pos_tail = cdestructuring_bind.property_list_member( $kw146$ARG_POS, current );
    final SubLObject arg_pos = ( NIL != arg_pos_tail ) ? conses_high.cadr( arg_pos_tail ) : $str50$;
    final SubLObject case_sensitive_tail = cdestructuring_bind.property_list_member( $kw255$CASE_SENSITIVE, current );
    final SubLObject case_sensitive = ( NIL != case_sensitive_tail ) ? conses_high.cadr( case_sensitive_tail ) : $str266$nil;
    final SubLObject constants_tail = cdestructuring_bind.property_list_member( $kw256$CONSTANTS, current );
    final SubLObject constants = ( NIL != constants_tail ) ? conses_high.cadr( constants_tail ) : $str266$nil;
    return ConsesLow.listS( $sym257$TERM_LEARNER_AUTOCOMPLETE_INT, new SubLObject[] { prefix, limit, return_attrs, sentence_id, arg_pos, case_sensitive, constants, $list267
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 74314L)
  public static SubLObject xml_term_learner_autocomplete(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject prefix = html_utilities.html_extract_input( $str268$prefix, args );
    final SubLObject count = ( NIL != html_utilities.html_extract_input( $str269$count, args ) ) ? html_utilities.html_extract_input( $str269$count, args ) : $str264$20;
    final SubLObject sentence_id = html_utilities.html_extract_input( $str168$sentenceId, args );
    final SubLObject arg_pos = html_utilities.html_extract_input( $str225$argPos, args );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      print_high.princ( term_learner_autocomplete_int( prefix, count, $str50$, sentence_id, arg_pos, $str266$nil, $str266$nil, NIL ), xml_vars.$xml_stream$.getDynamicValue( thread ) );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 74778L)
  public static SubLObject term_learner_autocomplete_int(final SubLObject prefix, final SubLObject limit_string, final SubLObject return_attrs_string, final SubLObject sentence_id, final SubLObject arg_pos_string,
      final SubLObject case_sensitive_string, final SubLObject complete_on_constants_string, final SubLObject nativeP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] {
        $sym257$TERM_LEARNER_AUTOCOMPLETE_INT, prefix, limit_string, return_attrs_string, sentence_id, arg_pos_string, case_sensitive_string, complete_on_constants_string, nativeP
      } ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] { $sym257$TERM_LEARNER_AUTOCOMPLETE_INT, prefix,
          limit_string, return_attrs_string, sentence_id, arg_pos_string, case_sensitive_string, complete_on_constants_string, nativeP
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject return_attrs = ( NIL != reader.read_from_string_ignoring_errors( return_attrs_string, NIL, NIL, UNPROVIDED, UNPROVIDED ) ) ? reader.read_from_string_ignoring_errors( return_attrs_string, NIL, NIL,
        UNPROVIDED, UNPROVIDED ) : $list271;
    final SubLObject limit = reader.read_from_string_ignoring_errors( limit_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    final SubLObject case_sensitiveP = reader.read_from_string_ignoring_errors( case_sensitive_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id( sentence_id );
    final SubLObject arg_pos = reader.read_from_string_ignoring_errors( arg_pos_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    final SubLObject arg_constraints = ( NIL != sentence ) ? html_complete.get_arg_constraints_for_arg( sentence, arg_pos, $const64$InferencePSC ) : NIL;
    final SubLObject isa_filter = html_complete.get_isa_filter_from_arg_constraints( arg_constraints );
    final SubLObject genls_filter = html_complete.get_genls_filter_from_arg_constraints( arg_constraints );
    final SubLObject isa_restrictions = NIL;
    final SubLObject genls_restrictions = NIL;
    final SubLObject complete_on_constantsP = reader.read_from_string_ignoring_errors( complete_on_constants_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject output_string = NIL;
    final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon( UNPROVIDED );
    final SubLObject timeout = TWENTY_INTEGER;
    if( NIL == nativeP )
    {
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym272$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const273$EverythingPSC, thread );
        final SubLObject _prev_bind_0_$44 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( NIL, thread );
          try
          {
            xml_vars.$xml_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
            html_complete.xml_complete_int( prefix, ConsesLow.list( new SubLObject[] { $kw253$RETURN_ATTRS, return_attrs, $kw274$ISA_FILTER, isa_filter, $kw275$GENLS_FILTER, genls_filter, $kw276$ISA_RESTRICTIONS,
              isa_restrictions, $kw277$GENLS_RESTRICTIONS, genls_restrictions, $kw252$LIMIT, limit, $kw278$TIMEOUT, timeout, $kw279$CASE_SENSITIVE_, case_sensitiveP, $kw280$COMPLETE_ON_CONSTANTS_, complete_on_constantsP,
              $kw245$LEXICON, lexicon
            } ) );
            output_string = streams_high.get_output_stream_string( xml_vars.$xml_stream$.getDynamicValue( thread ) );
          }
          finally
          {
            final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              streams_high.close( xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
            }
          }
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_0_$44, thread );
        }
        return output_string;
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
      }
    }
    return html_complete.native_complete_int( prefix, ConsesLow.list( new SubLObject[] { $kw253$RETURN_ATTRS, return_attrs, $kw274$ISA_FILTER, isa_filter, $kw275$GENLS_FILTER, genls_filter, $kw276$ISA_RESTRICTIONS,
      isa_restrictions, $kw277$GENLS_RESTRICTIONS, genls_restrictions, $kw252$LIMIT, limit, $kw278$TIMEOUT, timeout, $kw279$CASE_SENSITIVE_, case_sensitiveP, $kw280$COMPLETE_ON_CONSTANTS_, complete_on_constantsP,
      $kw245$LEXICON, lexicon
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 78450L)
  public static SubLObject get_allotted_tasks(final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym281$GET_ALLOTTED_TASKS, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym281$GET_ALLOTTED_TASKS, user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    SubLObject tasks = ask_utilities.query_variable( $sym282$_X, ConsesLow.list( $const60$and, $list283, ConsesLow.list( $const284$or, ConsesLow.list( $const285$thereExists, $sym286$_CURRENT_TASK, ConsesLow.list(
        $const60$and, $list287, ConsesLow.list( $const288$cureUserModel, $sym289$_MONAD_USER, $sym286$_CURRENT_TASK, user ) ) ), ConsesLow.list( $const60$and, ConsesLow.list( $const290$allottedAgents, $sym282$_X,
            user ) ) ) ), $const291$AnalystDatabaseMt, $list292 );
    final SubLObject current_task = default_task_for_user( user );
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    tasks = ( cdolist_list_var = list_utilities.snoc( current_task, Sequences.remove( current_task, tasks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    SubLObject task = NIL;
    task = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( new_term_learner_string_renderer( pph_main.generate_phrase( task, $kw20$DEFAULT, NIL, ConsesLow.listS( $const293$MtUnionFn, pph_vars.$pph_language_mt$.getDynamicValue( thread ), $list294 ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), task, UNPROVIDED, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      task = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 79434L)
  public static SubLObject term_learner_get_fact_sheet_for_term(final SubLObject concept_id, SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym295$TERM_LEARNER_GET_FACT_SHEET_FOR_TERM, concept_id ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym295$TERM_LEARNER_GET_FACT_SHEET_FOR_TERM, concept_id ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject cycl = document_annotation_widgets.term_learner_object_from_id( concept_id );
    final SubLObject mt = query_mt_for_user_and_task( user, task );
    SubLObject body_content = NIL;
    if( NIL != concept_naked_for_factsheetP( cycl, mt ) )
    {
      return $str296$_html__body_No_known_facts__body_;
    }
    final SubLObject _prev_bind_3 = fact_sheets.$allow_fact_sheet_evaluationsP$.currentBinding( thread );
    try
    {
      fact_sheets.$allow_fact_sheet_evaluationsP$.bind( ZERO_INTEGER, thread );
      final SubLObject v_properties = list_utilities.merge_plist( term_learner_standard_fact_sheet_properties(), term_learner_context_sensitive_fact_sheet_properties( cycl, user, task ) );
      final SubLObject linkless = fact_sheets.get_linkless_fact_sheet_for_term_in_html( cycl, $kw297$NORMAL, $kw20$DEFAULT, $kw20$DEFAULT, v_properties );
      final SubLObject body_start = Numbers.add( ONE_INTEGER, Sequences.search( $str298$_, linkless, EQUAL, IDENTITY, ZERO_INTEGER, NIL, Sequences.search( html_macros.$html_body_head$.getGlobalValue(), linkless,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
      final SubLObject body_end = Sequences.search( html_macros.$html_body_tail$.getGlobalValue(), linkless, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      body_content = Sequences.subseq( linkless, body_start, body_end );
    }
    finally
    {
      fact_sheets.$allow_fact_sheet_evaluationsP$.rebind( _prev_bind_3, thread );
    }
    return body_content;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 80467L)
  public static SubLObject term_learner_get_fact_sheet_updates_for_term(final SubLObject concept_id, SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym299$TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM, concept_id, user, task ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym299$TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM, concept_id,
            user, task ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject cycl = document_annotation_widgets.term_learner_object_from_id( concept_id );
    final SubLObject mt = query_mt_for_user_and_task( user, task );
    SubLObject body_content = NIL;
    if( NIL != concept_naked_for_factsheetP( cycl, mt ) )
    {
      return $str50$;
    }
    final SubLObject _prev_bind_3 = fact_sheets.$allow_fact_sheet_evaluationsP$.currentBinding( thread );
    try
    {
      fact_sheets.$allow_fact_sheet_evaluationsP$.bind( ZERO_INTEGER, thread );
      final SubLObject v_properties = list_utilities.merge_plist( list_utilities.merge_plist( term_learner_standard_fact_sheet_properties(), term_learner_context_sensitive_fact_sheet_properties( cycl, user, task ) ),
          $list300 );
      final SubLObject linkless = fact_sheets.get_linkless_fact_sheet_for_term_in_html( cycl, $kw297$NORMAL, $kw20$DEFAULT, $kw20$DEFAULT, v_properties );
      final SubLObject body_start = Numbers.add( ONE_INTEGER, Sequences.search( $str298$_, linkless, EQUAL, IDENTITY, ZERO_INTEGER, NIL, Sequences.search( html_macros.$html_body_head$.getGlobalValue(), linkless,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
      final SubLObject body_end = Sequences.search( html_macros.$html_body_tail$.getGlobalValue(), linkless, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      body_content = Sequences.subseq( linkless, body_start, body_end );
    }
    finally
    {
      fact_sheets.$allow_fact_sheet_evaluationsP$.rebind( _prev_bind_3, thread );
    }
    return body_content;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 81530L)
  public static SubLObject term_learner_standard_fact_sheet_properties()
  {
    return $list301;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 81658L)
  public static SubLObject term_learner_context_sensitive_fact_sheet_properties(final SubLObject topic, final SubLObject user, SubLObject task)
  {
    if( NIL == task )
    {
      task = default_task_for_user( user );
    }
    SubLObject v_properties = NIL;
    if( NIL != term_learner_prefer_slot_value_fact_sheetsP( topic, user, task ) )
    {
      final SubLObject except_preds = forbidden_slot_value_fact_sheet_category_preds( topic, user, task );
      v_properties = list_utilities.merge_plist( v_properties, ConsesLow.list( $kw302$SLOT_VALUE_PREFERENCE_PATTERN, ConsesLow.list( $kw303$NOT, reader.bq_cons( $kw304$OR, except_preds ) ) ) );
    }
    Errors.warn( $str305$Fact_sheet_properties___S, v_properties );
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 82192L)
  public static SubLObject term_learner_prefer_slot_value_fact_sheetsP(final SubLObject topic, final SubLObject user, final SubLObject task)
  {
    return cyc_kernel.closed_query_success_token_p( inference_kernel.new_cyc_query( ConsesLow.list( constants_high.find_constant( $str306$preferSlotValueFormatForTermLearn ), topic, user, task ), $const64$InferencePSC,
        ConsesLow.list( new SubLObject[]
        { $kw307$ALLOW_ABNORMALITY_CHECKING_, NIL, $kw308$MAX_PROBLEM_COUNT, $int309$1000, $kw310$EVALUATE_SUBL_ALLOWED_, NIL, $kw311$NEW_TERMS_ALLOWED_, NIL, $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL,
          $kw313$MAX_NUMBER, ONE_INTEGER, $kw314$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw315$MAX_PROOF_DEPTH, ONE_INTEGER, $kw316$CONTINUABLE_, NIL, $kw317$PRODUCTIVITY_LIMIT, $int318$100
        } ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 82725L)
  public static SubLObject forbidden_slot_value_fact_sheet_category_preds(final SubLObject topic, final SubLObject user, final SubLObject task)
  {
    return ask_utilities.query_variable( $sym112$_PRED, ConsesLow.list( constants_high.find_constant( $str319$forbidSlotValueFormatForTermLearn ), $sym112$_PRED, topic, user, task ), $const64$InferencePSC, ConsesLow
        .list( new SubLObject[]
        { $kw307$ALLOW_ABNORMALITY_CHECKING_, NIL, $kw308$MAX_PROBLEM_COUNT, $int309$1000, $kw310$EVALUATE_SUBL_ALLOWED_, NIL, $kw311$NEW_TERMS_ALLOWED_, NIL, $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_, NIL,
          $kw314$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw315$MAX_PROOF_DEPTH, ONE_INTEGER, $kw320$ANSWER_LANGUAGE, $kw321$HL, $kw316$CONTINUABLE_, NIL, $kw317$PRODUCTIVITY_LIMIT, $int318$100
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 83275L)
  public static SubLObject concept_naked_for_factsheetP(final SubLObject cycl, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt, thread );
      final SubLObject reified_cycl = narts_high.nart_substitute( cycl );
      result = makeBoolean( NIL == forts.fort_p( reified_cycl ) || NIL != subl_promotions.memberP( isa.asserted_isa( reified_cycl, UNPROVIDED ), $list322, EQUAL, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 85028L)
  public static SubLObject term_learner_unmodifiable_statusP(final SubLObject code)
  {
    return subl_promotions.memberP( code, $term_learner_unmodifiable$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 85138L)
  public static SubLObject term_learner_known_statusP(final SubLObject code)
  {
    return subl_promotions.memberP( code, ConsesLow.list( $term_learner_known_not_removable$.getGlobalValue(), $term_learner_known_derived$.getGlobalValue(), $term_learner_known_removable$.getGlobalValue() ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 85315L)
  public static SubLObject term_learner_fact_status(final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_template_id, final SubLObject justifications, final SubLObject url,
      final SubLObject doc_title, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym323$TERM_LEARNER_FACT_STATUS, term_string, term_id, sentence_template_id, justifications, url, doc_title, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym323$TERM_LEARNER_FACT_STATUS, term_string, term_id,
            sentence_template_id, justifications, url, doc_title, user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject mt = find_query_mt_from_justifications( justifications, user );
    final SubLObject sentence_template = document_annotation_widgets.term_learner_object_from_id( sentence_template_id );
    final SubLObject sentence = get_sentence_from_template( term_string, term_id, sentence_template );
    final SubLObject pred = cycl_utilities.formula_arg0( sentence );
    final SubLObject specific_sentence = pred.eql( $const75$is_Underspecified ) ? cure_specify_is( sentence, mt ) : sentence;
    if( NIL != cycl_utilities.expression_find( $kw324$TERM, sentence_template, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && term_id.equal( $str325$null ) )
    {
      return ConsesLow.list( ZERO_INTEGER, $str50$ );
    }
    return term_learner_fact_status_int( specific_sentence, mt, user );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 86358L)
  public static SubLObject cure_specify_is(final SubLObject sentence, final SubLObject mt)
  {
    if( NIL != fort_types_interface.collectionP( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) ) )
    {
      return cycl_utilities.formula_subst( $const76$genls, $const75$is_Underspecified, sentence, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != kb_accessors.individualP( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) ) )
    {
      return cycl_utilities.formula_subst( $const55$isa, $const75$is_Underspecified, sentence, UNPROVIDED, UNPROVIDED );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 86715L)
  public static SubLObject find_query_mt_from_justifications(final SubLObject justs, SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = NIL;
    }
    final SubLObject task = default_task_for_user( user );
    SubLObject mts = ConsesLow.list( query_mt_for_task( task ) );
    SubLObject cdolist_list_var = justs;
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assert_mt = term_learner_justification_assert_mt( just );
      if( NIL != assert_mt )
      {
        mts = ConsesLow.cons( assert_mt, mts );
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return ( NIL != list_utilities.lengthG( mts, ONE_INTEGER, UNPROVIDED ) ) ? ConsesLow.cons( $const293$MtUnionFn, mts ) : mts.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 87105L)
  public static SubLObject clear_term_learner_fact_status_int()
  {
    final SubLObject cs = $term_learner_fact_status_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 87105L)
  public static SubLObject remove_term_learner_fact_status_int(final SubLObject sentence, final SubLObject mt, SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_fact_status_int_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt, user ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 87105L)
  public static SubLObject term_learner_fact_status_int_internal(final SubLObject sentence, final SubLObject mt, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != el_utilities.sentence_free_variables( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return ConsesLow.list( $term_learner_incomplete$.getGlobalValue(), $str50$ );
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject knownP = term_learner_knownP( sentence, mt );
      final SubLObject assertibleP = ( NIL != knownP ) ? NIL : term_learner_sentence_assertibleP( sentence, mt );
      final SubLObject removableP = ( NIL != knownP ) ? sentence_removable_by_userP( sentence, user ) : NIL;
      final SubLObject derivedP = ( NIL != knownP ) ? derived_sentenceP( sentence, user ) : NIL;
      if( NIL != knownP && NIL != removableP )
      {
        result = ConsesLow.list( $term_learner_known_removable$.getGlobalValue(), $str50$ );
      }
      else if( NIL != knownP && NIL == removableP )
      {
        result = ConsesLow.list( $term_learner_known_not_removable$.getGlobalValue(), $str50$ );
      }
      else if( NIL != knownP && NIL != derivedP )
      {
        final SubLObject justification = $str327$Derived_from_other_assertions;
        result = ConsesLow.list( $term_learner_known_derived$.getGlobalValue(), justification );
      }
      else if( NIL == knownP && NIL != assertibleP )
      {
        result = ConsesLow.list( $term_learner_unknown_assertible$.getGlobalValue(), $str50$ );
      }
      else if( NIL == knownP && NIL == assertibleP )
      {
        final SubLObject explanation_string = wff.explanation_of_why_not_wff_assert( sentence, mt, UNPROVIDED );
        SubLObject escaped_explanation = NIL;
        if( explanation_string.isString() )
        {
          SubLObject stream = NIL;
          try
          {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0_$46 = xml_vars.$xml_stream$.currentBinding( thread );
            try
            {
              xml_vars.$xml_stream$.bind( stream, thread );
              xml_utilities.xml_write_wXescaped_special_chars( explanation_string );
            }
            finally
            {
              xml_vars.$xml_stream$.rebind( _prev_bind_0_$46, thread );
            }
            escaped_explanation = streams_high.get_output_stream_string( stream );
          }
          finally
          {
            final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              streams_high.close( stream, UNPROVIDED );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$47, thread );
            }
          }
        }
        else
        {
          escaped_explanation = $str50$;
        }
        result = ConsesLow.list( $term_learner_impossible$.getGlobalValue(), escaped_explanation );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 87105L)
  public static SubLObject term_learner_fact_status_int(final SubLObject sentence, final SubLObject mt, SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    SubLObject caching_state = $term_learner_fact_status_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym326$TERM_LEARNER_FACT_STATUS_INT, $sym328$_TERM_LEARNER_FACT_STATUS_INT_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym329$CLEAR_TERM_LEARNER_FACT_STATUS_INT );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, user );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && user.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_fact_status_int_internal( sentence, mt, user ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, user ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 88877L)
  public static SubLObject term_learner_knownP(final SubLObject sentence, final SubLObject mt)
  {
    return makeBoolean( NIL != el_utilities.closedP( sentence, UNPROVIDED ) && NIL != rkf_query_utilities.rkf_known( sentence, mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 88993L)
  public static SubLObject sentence_removable_by_userP(final SubLObject sentence, final SubLObject user)
  {
    final SubLObject user_can_arbitrarily_delete = cure_user_has_arbitrary_deletion_privileges( user );
    final SubLObject asserts = term_learner_find_visible_assertions_cycl( sentence, UNPROVIDED );
    SubLObject must_stay = makeBoolean( NIL == asserts );
    if( NIL == must_stay )
    {
      SubLObject csome_list_var = asserts;
      SubLObject v_assert = NIL;
      v_assert = csome_list_var.first();
      while ( NIL == must_stay && NIL != csome_list_var)
      {
        if( NIL != tms.independently_deducible_assertionP( v_assert ) && NIL == user_can_arbitrarily_delete && NIL == removal_modules_assertion_mt.assertion_asserted_byP( v_assert, user ) )
        {
          must_stay = T;
        }
        csome_list_var = csome_list_var.rest();
        v_assert = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == must_stay );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 89598L)
  public static SubLObject cure_user_has_arbitrary_deletion_privileges(SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLObject task = default_task_for_user( user );
    return query_library_utils.allow_arbitrary_assertion_deletion( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 89792L)
  public static SubLObject derived_sentenceP(final SubLObject sentence, final SubLObject user)
  {
    final SubLObject asserts = term_learner_find_visible_assertions_cycl( sentence, UNPROVIDED );
    SubLObject derived = makeBoolean( NIL == asserts );
    if( NIL == derived )
    {
      SubLObject csome_list_var = asserts;
      SubLObject v_assert = NIL;
      v_assert = csome_list_var.first();
      while ( NIL == derived && NIL != csome_list_var)
      {
        if( NIL != assertions_high.deduced_assertionP( v_assert ) )
        {
          derived = T;
        }
        csome_list_var = csome_list_var.rest();
        v_assert = csome_list_var.first();
      }
    }
    return derived;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 90205L)
  public static SubLObject term_learner_find_visible_assertions_cycl_internal(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return czer_meta.find_visible_assertions_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 90205L)
  public static SubLObject term_learner_find_visible_assertions_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return term_learner_find_visible_assertions_cycl_internal( sentence, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym330$TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym330$TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym330$TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sentence, mt );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( term_learner_find_visible_assertions_cycl_internal( sentence, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 90646L)
  public static SubLObject xml_term_learner_get_followups_for_term(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_id = html_utilities.html_extract_input( $str332$conceptId, args );
    final SubLObject max_s = html_utilities.html_extract_input( $str333$max, args );
    final SubLObject max = max_s.isString() ? reader.read_from_string_ignoring_errors( max_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : ZERO_INTEGER;
    final SubLObject questions_only_s = html_utilities.html_extract_input( $str334$questionsOnly, args );
    final SubLObject questions_only = Equality.equal( questions_only_s, $str335$true );
    final SubLObject unknown_only_s = html_utilities.html_extract_input( $str336$unknownOnly, args );
    final SubLObject unknown_only = Equality.equal( unknown_only_s, $str335$true );
    final SubLObject user_s = html_utilities.html_extract_input( $str337$user, args );
    final SubLObject user = user_s.isString() ? reader.read_from_string_ignoring_errors( user_s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : ( ( NIL != api_control_vars.$the_cyclist$.getDynamicValue( thread ) ) ? api_control_vars.$the_cyclist$.getDynamicValue( thread ) : $const338$CycAdministrator );
    final SubLObject ignore_q_list_s = html_utilities.html_extract_input( $str339$ignoreList, args );
    final SubLObject ignore_q_list = ( NIL != string_utilities.non_empty_stringP( ignore_q_list_s ) ) ? Mapping.mapcar( $sym224$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, string_utilities.split_string(
        ignore_q_list_s, UNPROVIDED ) ) : NIL;
    final SubLObject followups = term_learner_get_followups_for_term( term_id, user, max, unknown_only, questions_only, ignore_q_list );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      xml_output_term_types( followups );
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 91975L)
  public static SubLObject term_learner_get_followups_for_cycl_term(final SubLObject v_term, SubLObject user, SubLObject limit, SubLObject unknown_onlyP, SubLObject questions_onlyP, SubLObject ignore_list)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    if( unknown_onlyP == UNPROVIDED )
    {
      unknown_onlyP = NIL;
    }
    if( questions_onlyP == UNPROVIDED )
    {
      questions_onlyP = NIL;
    }
    if( ignore_list == UNPROVIDED )
    {
      ignore_list = NIL;
    }
    return term_learner_get_followups_for_term( kb_utilities.compact_hl_external_id_string( v_term ), user, limit, unknown_onlyP, questions_onlyP, ignore_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 92257L)
  public static SubLObject term_learner_get_followups_for_term(final SubLObject term_id, SubLObject user, SubLObject limit, SubLObject unknown_onlyP, SubLObject questions_onlyP, SubLObject ignore_list)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    if( unknown_onlyP == UNPROVIDED )
    {
      unknown_onlyP = NIL;
    }
    if( questions_onlyP == UNPROVIDED )
    {
      questions_onlyP = NIL;
    }
    if( ignore_list == UNPROVIDED )
    {
      ignore_list = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym342$TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM, term_id, user, limit, unknown_onlyP, questions_onlyP, ignore_list ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym342$TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM, term_id, user, limit,
            unknown_onlyP, questions_onlyP, ignore_list ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    SubLObject sorted_result = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$48 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$49 = api_control_vars.$the_cyclist$.currentBinding( thread );
          final SubLObject _prev_bind_1_$50 = pph_vars.$pph_addressee$.currentBinding( thread );
          final SubLObject _prev_bind_2_$51 = pph_vars.$pph_use_indexical_datesP$.currentBinding( thread );
          final SubLObject _prev_bind_6 = $current_tl_task$.currentBinding( thread );
          final SubLObject _prev_bind_7 = cae_query_search.$current_cae_task$.currentBinding( thread );
          try
          {
            api_control_vars.$the_cyclist$.bind( user, thread );
            pph_vars.$pph_addressee$.bind( user, thread );
            pph_vars.$pph_use_indexical_datesP$.bind( T, thread );
            $current_tl_task$.bind( default_task_for_user( user ), thread );
            cae_query_search.$current_cae_task$.bind( $current_tl_task$.getDynamicValue( thread ), thread );
            final SubLObject cycl = document_annotation_widgets.term_learner_object_from_id( term_id );
            final SubLObject followup_mt = followup_query_mt_for_userXtask( user, $current_tl_task$.getDynamicValue( thread ) );
            final SubLObject query_mt = query_mt_for_task( $current_tl_task$.getDynamicValue( thread ) );
            final SubLObject result = term_learner_unsorted_fragments_for_term( cycl, followup_mt, query_mt, unknown_onlyP, questions_onlyP, ignore_list );
            final SubLObject sort_style = limit.eql( ONE_INTEGER ) ? $kw343$UNCATEGORIZED : $kw297$NORMAL;
            sorted_result = sort_followups( result, cycl, followup_mt, query_library_utils.cae_default_paraphrase_mt( $current_tl_task$.getDynamicValue( thread ) ), sort_style );
            if( NIL != limit && ZERO_INTEGER.numL( limit ) && limit.numL( Sequences.length( result ) ) )
            {
              SubLObject doneP = NIL;
              SubLObject current_count = ZERO_INTEGER;
              SubLObject temp_result = NIL;
              if( NIL == doneP )
              {
                SubLObject csome_list_var = sorted_result;
                SubLObject category = NIL;
                category = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  final SubLObject followups = conses_high.getf( category, $kw344$TYPES, UNPROVIDED );
                  final SubLObject number_needed = Numbers.subtract( limit, current_count );
                  if( current_count.numGE( limit ) )
                  {
                    doneP = T;
                  }
                  else if( Sequences.length( followups ).numL( number_needed ) )
                  {
                    temp_result = ConsesLow.cons( category, temp_result );
                    current_count = Numbers.add( current_count, Sequences.length( followups ) );
                  }
                  else
                  {
                    temp_result = ConsesLow.cons( conses_high.putf( category, $kw344$TYPES, list_utilities.first_n( number_needed, followups ) ), temp_result );
                    current_count = Numbers.add( current_count, Sequences.length( followups ) );
                  }
                  csome_list_var = csome_list_var.rest();
                  category = csome_list_var.first();
                }
              }
              sorted_result = Sequences.nreverse( temp_result );
            }
          }
          finally
          {
            cae_query_search.$current_cae_task$.rebind( _prev_bind_7, thread );
            $current_tl_task$.rebind( _prev_bind_6, thread );
            pph_vars.$pph_use_indexical_datesP$.rebind( _prev_bind_2_$51, thread );
            pph_vars.$pph_addressee$.rebind( _prev_bind_1_$50, thread );
            api_control_vars.$the_cyclist$.rebind( _prev_bind_0_$49, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$48, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_5, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_4, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
    }
    return sorted_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 94768L)
  public static SubLObject term_learner_unsorted_fragments_for_term(final SubLObject v_term, final SubLObject followup_mt, final SubLObject query_mt, final SubLObject unknown_onlyP, final SubLObject questions_onlyP,
      final SubLObject ignore_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_phrase = term_learner_cycl_term_to_nl_string( v_term, UNPROVIDED ).first();
    final SubLObject _prev_bind_0 = cae_query_search.$cae_query_search_skip_nl_generation$.currentBinding( thread );
    try
    {
      cae_query_search.$cae_query_search_skip_nl_generation$.bind( T, thread );
      final SubLObject raw_fragments = cae_query_search.get_fragments_for_terms( ConsesLow.list( ConsesLow.list( term_phrase, v_term ) ), NIL, followup_mt, $kw345$BLANKS, NIL, UNPROVIDED );
      SubLObject result = NIL;
      SubLObject cdolist_list_var = raw_fragments;
      SubLObject fragment = NIL;
      fragment = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject fragment_cycl = fragment.first();
        final SubLObject focal_arg_poses = cycl_utilities.arg_positions_dfs( v_term, fragment_cycl, UNPROVIDED );
        if( NIL != cycl_utilities.expression_find( v_term, fragment_cycl, T, EQUAL, UNPROVIDED ) && NIL == subl_promotions.memberP( fragment_cycl, ignore_list, $sym346$EQUALS_EL_, UNPROVIDED ) )
        {
          SubLObject cdolist_list_var_$53 = term_learner_types_for_fragment( focal_arg_poses, fragment, term_phrase, cure_default_generation_mt( UNPROVIDED ), query_mt, followup_mt, unknown_onlyP, questions_onlyP );
          SubLObject type = NIL;
          type = cdolist_list_var_$53.first();
          while ( NIL != cdolist_list_var_$53)
          {
            if( !$term_learner_impossible$.getGlobalValue().equal( conses_high.getf( type, $kw123$STATUS_CODE, UNPROVIDED ) ) )
            {
              result = ConsesLow.cons( type, result );
            }
            cdolist_list_var_$53 = cdolist_list_var_$53.rest();
            type = cdolist_list_var_$53.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        fragment = cdolist_list_var.first();
      }
      return result;
    }
    finally
    {
      cae_query_search.$cae_query_search_skip_nl_generation$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 95703L)
  public static SubLObject sort_followups(SubLObject followups, final SubLObject focal_term, final SubLObject mt, SubLObject paraphrase_mt, SubLObject sort_style)
  {
    if( paraphrase_mt == UNPROVIDED )
    {
      paraphrase_mt = pph_vars.pph_language_mt();
    }
    if( sort_style == UNPROVIDED )
    {
      sort_style = $kw297$NORMAL;
    }
    SubLObject categorized_followups = NIL;
    SubLObject ret_value = NIL;
    SubLObject cdolist_list_var = followups;
    SubLObject followup = NIL;
    followup = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject categories_and_types = ( sort_style == $kw343$UNCATEGORIZED ) ? NIL : categories_and_types_for_sentence_and_term( conses_high.getf( followup, $kw117$CYCL, UNPROVIDED ), focal_term, mt );
      final SubLObject new_followup = conses_high.putf( followup, $kw347$CATEGORY_INFO, categories_and_types );
      if( NIL == categories_and_types )
      {
        categories_and_types = ConsesLow.list( NIL );
      }
      SubLObject cdolist_list_var_$54 = categories_and_types;
      SubLObject category_and_type = NIL;
      category_and_type = cdolist_list_var_$54.first();
      while ( NIL != cdolist_list_var_$54)
      {
        categorized_followups = list_utilities.alist_push( categorized_followups, category_and_type.first(), new_followup, UNPROVIDED );
        cdolist_list_var_$54 = cdolist_list_var_$54.rest();
        category_and_type = cdolist_list_var_$54.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      followup = cdolist_list_var.first();
    }
    followups = NIL;
    categorized_followups = ( cdolist_list_var = sort_by_category( categorized_followups, focal_term, mt ) );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject category_pred = NIL;
      SubLObject category_followups = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list348 );
      category_pred = current.first();
      current = ( category_followups = current.rest() );
      final SubLObject sorted_followups = Sort.sort( category_followups, $sym349$HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY, UNPROVIDED );
      final SubLObject category_name = term_learner_category_label( category_pred, paraphrase_mt );
      followups = Sequences.cconcatenate( followups, sorted_followups );
      ret_value = Sequences.cconcatenate( ret_value, ConsesLow.list( ConsesLow.list( $kw350$CATEGORY, category_pred, $kw351$CATEGORY_NL, category_name, $kw344$TYPES, sorted_followups ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97349L)
  public static SubLObject clear_term_learner_category_label()
  {
    final SubLObject cs = $term_learner_category_label_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97349L)
  public static SubLObject remove_term_learner_category_label(final SubLObject category_pred, SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = $const352$EnglishParaphraseMt;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_category_label_caching_state$.getGlobalValue(), ConsesLow.list( category_pred, nl_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97349L)
  public static SubLObject term_learner_category_label_internal(final SubLObject category_pred, final SubLObject nl_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == category_pred )
    {
      return $str354$Advanced_Info;
    }
    SubLObject known_label = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( nl_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pred_var = $const355$termSummaryPredicateLabel;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( category_pred, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( category_pred, ONE_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw356$GAF, NIL, NIL );
              SubLObject done_var_$55 = NIL;
              final SubLObject token_var_$56 = NIL;
              while ( NIL == done_var_$55)
              {
                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$56 );
                final SubLObject valid_$57 = makeBoolean( !token_var_$56.eql( v_assert ) );
                if( NIL != valid_$57 )
                {
                  if( NIL == known_label )
                  {
                    known_label = cycl_utilities.formula_arg2( v_assert, UNPROVIDED );
                  }
                  else if( kb_mapping_utilities.fpred_value_in_relevant_mts( v_assert, $const357$genStringAssertion, nl_mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ).equal( category_pred ) )
                  {
                    known_label = cycl_utilities.formula_arg2( v_assert, UNPROVIDED );
                  }
                }
                done_var_$55 = makeBoolean( NIL == valid_$57 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != known_label ) ? known_label : $str354$Advanced_Info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97349L)
  public static SubLObject term_learner_category_label(final SubLObject category_pred, SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = $const352$EnglishParaphraseMt;
    }
    SubLObject caching_state = $term_learner_category_label_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym353$TERM_LEARNER_CATEGORY_LABEL, $sym358$_TERM_LEARNER_CATEGORY_LABEL_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym359$CLEAR_TERM_LEARNER_CATEGORY_LABEL );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( category_pred, nl_mt );
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
        if( category_pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && nl_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_category_label_internal( category_pred, nl_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( category_pred, nl_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97989L)
  public static SubLObject clear_get_followup_categories_for_type()
  {
    final SubLObject cs = $get_followup_categories_for_type_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97989L)
  public static SubLObject remove_get_followup_categories_for_type(final SubLObject coll, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $get_followup_categories_for_type_caching_state$.getGlobalValue(), ConsesLow.list( coll, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97989L)
  public static SubLObject get_followup_categories_for_type_internal(final SubLObject coll, final SubLObject mt)
  {
    return ask_utilities.query_variable( $sym361$_CAT, ConsesLow.list( $const362$subtopicCollectionForCategory, $sym361$_CAT, coll ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 97989L)
  public static SubLObject get_followup_categories_for_type(final SubLObject coll, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $get_followup_categories_for_type_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym360$GET_FOLLOWUP_CATEGORIES_FOR_TYPE, $sym363$_GET_FOLLOWUP_CATEGORIES_FOR_TYPE_CACHING_STATE_, $int364$1024, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym365$CLEAR_GET_FOLLOWUP_CATEGORIES_FOR_TYPE );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( coll, mt );
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
        if( coll.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_followup_categories_for_type_internal( coll, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( coll, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98214L)
  public static SubLObject clear_get_pred_list_order_for_type()
  {
    final SubLObject cs = $get_pred_list_order_for_type_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98214L)
  public static SubLObject remove_get_pred_list_order_for_type(final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $get_pred_list_order_for_type_caching_state$.getGlobalValue(), ConsesLow.list( type, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98214L)
  public static SubLObject get_pred_list_order_for_type_internal(final SubLObject type, final SubLObject mt)
  {
    return cycl_utilities.formula_args( ask_utilities.query_variable( $sym367$_PRED_LIST, ConsesLow.listS( $const368$summaryPredicateWRTSetOrCollectio, type, $list369 ), mt, UNPROVIDED ).first(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98214L)
  public static SubLObject get_pred_list_order_for_type(final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $get_pred_list_order_for_type_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym366$GET_PRED_LIST_ORDER_FOR_TYPE, $sym370$_GET_PRED_LIST_ORDER_FOR_TYPE_CACHING_STATE_, $int364$1024, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym371$CLEAR_GET_PRED_LIST_ORDER_FOR_TYPE );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( type, mt );
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
        if( type.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_pred_list_order_for_type_internal( type, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( type, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98495L)
  public static SubLObject categories_and_types_for_sentence_and_term(final SubLObject sentence, final SubLObject focal_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject temp_sentence = substitute_arg_constraints_for_vars( sentence, mt );
    final SubLObject non_negated = cycl_utilities.formula_arg0( temp_sentence ).eql( $const372$not ) ? cycl_utilities.formula_arg1( temp_sentence, UNPROVIDED ) : temp_sentence;
    return categories_and_types_for_sentence_and_term_int( non_negated, focal_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 98887L)
  public static SubLObject substitute_arg_constraints_for_vars(SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var;
      final SubLObject var_positions = cdolist_list_var = cycl_utilities.arg_positions_if_dfs( $sym373$EL_VARIABLE_P, sentence, UNPROVIDED );
      SubLObject var_position = NIL;
      var_position = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject relation = cycl_utilities.formula_arg0( cycl_utilities.formula_arg_position( sentence, conses_high.butlast( var_position, UNPROVIDED ), UNPROVIDED ) );
        final SubLObject arg_num = conses_high.last( var_position, UNPROVIDED ).first();
        final SubLObject arg_genl = substitutable_arg_constraint_for_reln( relation, arg_num );
        sentence = cycl_utilities.formula_arg_position_subst( arg_genl, var_position, sentence );
        cdolist_list_var = cdolist_list_var.rest();
        var_position = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99518L)
  public static SubLObject clear_substitutable_arg_constraint_for_reln()
  {
    final SubLObject cs = $substitutable_arg_constraint_for_reln_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99518L)
  public static SubLObject remove_substitutable_arg_constraint_for_reln(final SubLObject reln, final SubLObject arg_num)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $substitutable_arg_constraint_for_reln_caching_state$.getGlobalValue(), ConsesLow.list( reln, arg_num ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99518L)
  public static SubLObject substitutable_arg_constraint_for_reln_internal(final SubLObject reln, final SubLObject arg_num)
  {
    final SubLObject base_genls = ask_utilities.query_variable( $sym375$_COL, ConsesLow.listS( $const376$argGenl, reln, arg_num, $list377 ), UNPROVIDED, UNPROVIDED );
    final SubLObject result = ( NIL != base_genls ) ? base_genls.first() : $const38$Thing;
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99518L)
  public static SubLObject substitutable_arg_constraint_for_reln(final SubLObject reln, final SubLObject arg_num)
  {
    SubLObject caching_state = $substitutable_arg_constraint_for_reln_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym374$SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN, $sym378$_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN_CACHING_STATE_, $int379$256, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym380$CLEAR_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( reln, arg_num );
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
        if( reln.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && arg_num.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( substitutable_arg_constraint_for_reln_internal( reln, arg_num ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( reln, arg_num ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99807L)
  public static SubLObject categories_and_types_for_sentence_and_term_int(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt)
  {
    return categories_and_types_for_sentence_and_term_int_via_indexing( sentence, focal_term, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 99996L)
  public static SubLObject categories_and_types_for_sentence_and_term_int_via_query(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt)
  {
    return ask_utilities.query_template( $list381, ConsesLow.list( $const285$thereExists, $sym112$_PRED, ConsesLow.list( $const285$thereExists, $sym382$_N, ConsesLow.list( $const60$and, ConsesLow.list(
        $const383$equalSymbols, $sym384$_TERM, focal_term ), ConsesLow.list( $const385$argN, $sym386$_SENTENCE_PRED, ZERO_INTEGER, sentence ), $list387, ConsesLow.list( $const385$argN, $sym384$_TERM, $sym382$_N,
            sentence ), ConsesLow.list( $const284$or, $list388, $list389, $list390, $list391, ConsesLow.listS( $const60$and, $list392, ConsesLow.list( $const73$assertedSentence, sentence ), $list393 ), ConsesLow.listS(
                $const60$and, $list394, ConsesLow.list( $const73$assertedSentence, sentence ), $list395 ) ) ) ) ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 101584L)
  public static SubLObject clear_categories_and_types_for_sentence_and_term_int_via_indexing()
  {
    final SubLObject cs = $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 101584L)
  public static SubLObject remove_categories_and_types_for_sentence_and_term_int_via_indexing(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$.getGlobalValue(), ConsesLow.list( sentence, focal_term, mt ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 101584L)
  public static SubLObject categories_and_types_for_sentence_and_term_int_via_indexing_internal(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject hl_mt = narts_high.nart_substitute( mt );
    final SubLObject preds_requiring_isa = $list397;
    final SubLObject preds_requiring_asserted_sentence = $list398;
    final SubLObject preds_allowing_spec_preds = $list399;
    final SubLObject sentence_pred = cycl_utilities.formula_arg0( sentence );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym400$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( hl_mt, thread );
      SubLObject end_var;
      SubLObject arg_num;
      SubLObject cdolist_list_var;
      SubLObject pred;
      SubLObject pred_var;
      SubLObject iterator_var;
      SubLObject done_var;
      SubLObject token_var;
      SubLObject final_index_spec;
      SubLObject valid;
      SubLObject final_index_iterator;
      SubLObject done_var_$59;
      SubLObject token_var_$60;
      SubLObject ass;
      SubLObject valid_$61;
      SubLObject _prev_bind_0_$62;
      SubLObject _values;
      for( end_var = number_utilities.f_1X( el_utilities.formula_arity( sentence, UNPROVIDED ) ), arg_num = NIL, arg_num = ONE_INTEGER; !arg_num.numGE( end_var ); arg_num = number_utilities.f_1X( arg_num ) )
      {
        cdolist_list_var = $list402;
        pred = NIL;
        pred = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg_num, FOUR_INTEGER, pred_var ) )
          {
            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg_num, FOUR_INTEGER, pred_var );
            done_var = NIL;
            token_var = NIL;
            while ( NIL == done_var)
            {
              final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw356$GAF, $kw401$TRUE, NIL );
                  done_var_$59 = NIL;
                  token_var_$60 = NIL;
                  while ( NIL == done_var_$59)
                  {
                    ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$60 );
                    valid_$61 = makeBoolean( !token_var_$60.eql( ass ) );
                    if( NIL != valid_$61 && NIL != ( ( NIL != subl_promotions.memberP( pred, preds_requiring_isa, UNPROVIDED, UNPROVIDED ) ) ? isa.isaP( focal_term, cycl_utilities.formula_arg3( ass, UNPROVIDED ),
                        UNPROVIDED, UNPROVIDED ) : genls.genlP( focal_term, cycl_utilities.formula_arg3( ass, UNPROVIDED ), UNPROVIDED, UNPROVIDED ) ) && ( sentence_pred.equal( cycl_utilities.formula_arg1( ass,
                            UNPROVIDED ) ) || ( NIL != subl_promotions.memberP( pred, preds_allowing_spec_preds, UNPROVIDED, UNPROVIDED ) && NIL != genl_predicates.genl_predP( sentence_pred, cycl_utilities.formula_arg1(
                                ass, UNPROVIDED ), mt, UNPROVIDED ) ) ) && ( NIL == subl_promotions.memberP( pred, preds_requiring_asserted_sentence, UNPROVIDED, UNPROVIDED ) || NIL != czer_meta
                                    .find_visible_assertions_cycl( sentence, mt ) ) )
                    {
                      result = ConsesLow.cons( ConsesLow.list( cycl_utilities.formula_arg2( ass, UNPROVIDED ), cycl_utilities.formula_arg3( ass, UNPROVIDED ) ), result );
                    }
                    done_var_$59 = makeBoolean( NIL == valid_$61 );
                  }
                }
                finally
                {
                  _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          pred = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 101584L)
  public static SubLObject categories_and_types_for_sentence_and_term_int_via_indexing(final SubLObject sentence, final SubLObject focal_term, final SubLObject mt)
  {
    SubLObject caching_state = $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym396$CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING,
          $sym403$_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING_CACH, $int379$256, EQUAL, THREE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym404$CLEAR_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, focal_term, mt );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( focal_term.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( categories_and_types_for_sentence_and_term_int_via_indexing_internal( sentence, focal_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, focal_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 103412L)
  public static SubLObject sort_by_category(final SubLObject categorized_followups, final SubLObject focal_term, final SubLObject mt)
  {
    final SubLObject pred_sort_order = summary_pred_sort_order_for_focal_term( focal_term, mt );
    final SubLObject sorted_followups = list_utilities.sort_via_position( categorized_followups, pred_sort_order, EQUAL, $sym405$FIRST );
    return sorted_followups;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 103784L)
  public static SubLObject clear_summary_pred_sort_order_for_focal_term()
  {
    final SubLObject cs = $summary_pred_sort_order_for_focal_term_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 103784L)
  public static SubLObject remove_summary_pred_sort_order_for_focal_term(final SubLObject focal_term, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $summary_pred_sort_order_for_focal_term_caching_state$.getGlobalValue(), ConsesLow.list( focal_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 103784L)
  public static SubLObject summary_pred_sort_order_for_focal_term_internal(final SubLObject focal_term, final SubLObject mt)
  {
    final SubLObject sorted_preds_from_genls = Sort.sort( ask_utilities.query_template( $list407, ConsesLow.list( $const60$and, $list408, ConsesLow.listS( $const76$genls, focal_term, $list409 ) ), mt, UNPROVIDED ),
        $sym410$GENERALITY_ESTIMATE_, $sym405$FIRST );
    final SubLObject sorted_preds_from_isa = Sort.sort( ask_utilities.query_template( $list407, ConsesLow.list( $const60$and, $list411, ConsesLow.listS( $const55$isa, focal_term, $list409 ) ), mt, UNPROVIDED ),
        $sym410$GENERALITY_ESTIMATE_, $sym405$FIRST );
    final SubLObject pred_sort_order = list_utilities.remove_duplicates_from_end( Mapping.mapcan( $sym412$CDADR, ConsesLow.nconc( sorted_preds_from_genls, sorted_preds_from_isa ), EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return pred_sort_order;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 103784L)
  public static SubLObject summary_pred_sort_order_for_focal_term(final SubLObject focal_term, final SubLObject mt)
  {
    SubLObject caching_state = $summary_pred_sort_order_for_focal_term_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym406$SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM, $sym413$_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM_CACHING_STATE_, $int414$128, EQL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym415$CLEAR_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( focal_term, mt );
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
        if( focal_term.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( summary_pred_sort_order_for_focal_term_internal( focal_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( focal_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 104511L)
  public static SubLObject higher_priority_followup_in_category(final SubLObject followup1, final SubLObject followup2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLObject pred1 = narts_high.nart_substitute( cycl_utilities.formula_arg0( conses_high.getf( followup1, $kw117$CYCL, UNPROVIDED ) ) );
    final SubLObject pred2 = narts_high.nart_substitute( cycl_utilities.formula_arg0( conses_high.getf( followup2, $kw117$CYCL, UNPROVIDED ) ) );
    final SubLObject justifying_type1 = get_justifying_type_from_fragment_justification( conses_high.getf( followup1, $kw21$FRAGMENT_JUSTIFICATION, UNPROVIDED ) );
    final SubLObject justifying_type2 = get_justifying_type_from_fragment_justification( conses_high.getf( followup2, $kw21$FRAGMENT_JUSTIFICATION, UNPROVIDED ) );
    final SubLObject summary_pred1 = get_followup_categories_for_type( justifying_type1, mt ).first();
    final SubLObject summary_pred2 = get_followup_categories_for_type( justifying_type2, mt ).first();
    final SubLObject pred_order_from_type = get_pred_list_order_for_type( justifying_type1, $const64$InferencePSC );
    final SubLObject pred1_position = Sequences.position( pred1, pred_order_from_type, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pred2_position = Sequences.position( pred2, pred_order_from_type, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == pred1 )
    {
      return T;
    }
    if( NIL == pred2 )
    {
      return NIL;
    }
    if( NIL != genl_predicates.proper_genl_predP( pred1, pred2, mt, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != genl_predicates.proper_genl_predP( pred2, pred1, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != justifying_type2 && NIL != justifying_type1 && NIL != cardinality_estimates.generality_estimateL( justifying_type1, justifying_type2 ) )
    {
      return T;
    }
    if( NIL != justifying_type2 && NIL != justifying_type1 && NIL != cardinality_estimates.generality_estimateG( justifying_type1, justifying_type2 ) )
    {
      return NIL;
    }
    if( NIL != summary_pred2 && NIL != summary_pred1 && NIL != kb_utilities.term_L( summary_pred1, summary_pred2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != summary_pred2 && NIL != summary_pred1 && NIL != kb_utilities.term_L( summary_pred2, summary_pred1, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == pred1_position )
    {
      return NIL;
    }
    if( NIL == pred2_position )
    {
      return T;
    }
    if( pred1_position.numL( pred2_position ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 106169L)
  public static SubLObject get_justifying_type_from_fragment_justification(final SubLObject just)
  {
    final SubLObject cdolist_list_var;
    final SubLObject type_positions = cdolist_list_var = Sequences.cconcatenate( cycl_utilities.arg_positions_dfs( $kw143$ISA, just, UNPROVIDED ), cycl_utilities.arg_positions_dfs( $kw141$GENLS, just, UNPROVIDED ) );
    SubLObject position = NIL;
    position = cdolist_list_var.first();
    if( NIL != cdolist_list_var )
    {
      return cycl_utilities.formula_arg_position( just, list_utilities.snoc( TWO_INTEGER, conses_high.butlast( position, UNPROVIDED ) ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 106455L)
  public static SubLObject debug_followups_for_term(final SubLObject v_term, SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$63 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject term_phrase = term_learner_cycl_term_to_nl_string( v_term, UNPROVIDED ).first();
          final SubLObject _prev_bind_0_$64 = $current_tl_task$.currentBinding( thread );
          try
          {
            $current_tl_task$.bind( default_task_for_user( user ), thread );
            final SubLObject followup_query_mt = followup_query_mt_for_userXtask( user, $current_tl_task$.getDynamicValue( thread ) );
            final SubLObject raw_fragments = cae_query_search.get_fragments_for_terms( ConsesLow.list( ConsesLow.list( term_phrase, v_term ) ), NIL, followup_query_mt, $kw345$BLANKS, NIL, UNPROVIDED );
            final SubLObject query_mt = query_mt_for_task( $current_tl_task$.getDynamicValue( thread ) );
            SubLObject fragments_with_term = NIL;
            SubLObject unknown_questions = NIL;
            SubLObject cdolist_list_var = raw_fragments;
            SubLObject fragment = NIL;
            fragment = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != cycl_utilities.expression_find( v_term, fragment.first(), T, EQUAL, UNPROVIDED ) )
              {
                fragments_with_term = ConsesLow.cons( fragment, fragments_with_term );
                final SubLObject focal_arg_positions = cycl_utilities.arg_positions_dfs( v_term, fragment.first(), UNPROVIDED );
                final SubLObject items_var = term_learner_types_for_fragment( focal_arg_positions, fragment, term_phrase, cure_default_generation_mt( UNPROVIDED ), query_mt, followup_query_mt, T, T );
                if( items_var.isVector() )
                {
                  final SubLObject vector_var = items_var;
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject element_num;
                  SubLObject item;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    item = Vectors.aref( vector_var, element_num );
                    unknown_questions = ConsesLow.cons( item, unknown_questions );
                  }
                }
                else
                {
                  SubLObject cdolist_list_var_$65 = items_var;
                  SubLObject item2 = NIL;
                  item2 = cdolist_list_var_$65.first();
                  while ( NIL != cdolist_list_var_$65)
                  {
                    unknown_questions = ConsesLow.cons( item2, unknown_questions );
                    cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                    item2 = cdolist_list_var_$65.first();
                  }
                }
              }
              cdolist_list_var = cdolist_list_var.rest();
              fragment = cdolist_list_var.first();
            }
            PrintLow.format( T, $str416$_______________________________Fo, user );
            PrintLow.format( T, $str417$_______________________________Fo, followup_query_mt );
            PrintLow.format( T, $str418$_______________________________Fr );
            format_nil.print_one_per_line( raw_fragments, UNPROVIDED );
            PrintLow.format( T, $str419$_______________________________Fr, v_term );
            format_nil.print_one_per_line( fragments_with_term, UNPROVIDED );
            PrintLow.format( T, $str420$_______________________________Un, v_term );
            format_nil.print_one_per_line( unknown_questions, UNPROVIDED );
          }
          finally
          {
            $current_tl_task$.rebind( _prev_bind_0_$64, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$65, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$63, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 107962L)
  public static SubLObject clear_followup_query_mt_for_user()
  {
    final SubLObject cs = $followup_query_mt_for_user_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 107962L)
  public static SubLObject remove_followup_query_mt_for_user(final SubLObject user)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $followup_query_mt_for_user_caching_state$.getGlobalValue(), ConsesLow.list( user ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 107962L)
  public static SubLObject followup_query_mt_for_user_internal(final SubLObject user)
  {
    final SubLObject interests = ask_utilities.query_variable( $sym422$_TOPIC, ConsesLow.listS( $const423$interests, user, $list424 ), $const64$InferencePSC, UNPROVIDED );
    SubLObject interest_mts = NIL;
    if( NIL != constant_handles.valid_constantP( $const425$DocumentReaderFollowupsForInteres, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = interests;
      SubLObject interest = NIL;
      interest = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != narts_high.find_nart( ConsesLow.list( $const425$DocumentReaderFollowupsForInteres, interest ) ) )
        {
          interest_mts = ConsesLow.cons( narts_high.nart_substitute( ConsesLow.list( $const425$DocumentReaderFollowupsForInteres, interest ) ), interest_mts );
        }
        cdolist_list_var = cdolist_list_var.rest();
        interest = cdolist_list_var.first();
      }
    }
    if( NIL != list_utilities.lengthG( interest_mts, TWO_INTEGER, UNPROVIDED ) )
    {
      return el_utilities.make_formula( $const293$MtUnionFn, interest_mts, UNPROVIDED );
    }
    if( NIL != interest_mts )
    {
      return interest_mts.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 107962L)
  public static SubLObject followup_query_mt_for_user(final SubLObject user)
  {
    SubLObject caching_state = $followup_query_mt_for_user_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym421$FOLLOWUP_QUERY_MT_FOR_USER, $sym426$_FOLLOWUP_QUERY_MT_FOR_USER_CACHING_STATE_, $int414$128, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym427$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( followup_query_mt_for_user_internal( user ) ) );
      memoization_state.caching_state_put( caching_state, user, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 108658L)
  public static SubLObject default_followup_query_mt(SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    return followup_query_mt_for_userXtask( user, task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 108812L)
  public static SubLObject clear_followup_query_mt_for_userXtask()
  {
    final SubLObject cs = $followup_query_mt_for_userXtask_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 108812L)
  public static SubLObject remove_followup_query_mt_for_userXtask(final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $followup_query_mt_for_userXtask_caching_state$.getGlobalValue(), ConsesLow.list( user, task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 108812L)
  public static SubLObject followup_query_mt_for_userXtask_internal(final SubLObject user, final SubLObject task)
  {
    final SubLObject mt_from_query = ask_utilities.query_variable( $sym429$_MT, ConsesLow.listS( $const430$defaultCUREGuidanceMt, ConsesLow.list( $const431$SpecificationVariantFn, $list432, $const433$analysisTask,
        task ), $list434 ), $const64$InferencePSC, UNPROVIDED ).first();
    final SubLObject mt_from_user = followup_query_mt_for_user( user );
    final SubLObject mt = ( NIL != mt_from_query && NIL != mt_from_user ) ? ConsesLow.list( $const293$MtUnionFn, mt_from_query, mt_from_user )
        : ( ( NIL != mt_from_query ) ? mt_from_query : ( ( NIL != mt_from_user ) ? mt_from_user : NIL ) );
    return czer_main.canonicalize_term( mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 108812L)
  public static SubLObject followup_query_mt_for_userXtask(final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    SubLObject caching_state = $followup_query_mt_for_userXtask_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK, $sym435$_FOLLOWUP_QUERY_MT_FOR_USER_TASK_CACHING_STATE_, $int414$128, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym436$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER_TASK );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( user, task );
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
        if( user.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && task.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( followup_query_mt_for_userXtask_internal( user, task ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( user, task ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 109701L)
  public static SubLObject clear_term_learner_known_bindings_for_sentence()
  {
    final SubLObject cs = $term_learner_known_bindings_for_sentence_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 109701L)
  public static SubLObject remove_term_learner_known_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props)
  {
    if( inference_props == UNPROVIDED )
    {
      inference_props = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_known_bindings_for_sentence_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt, inference_props ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 109701L)
  public static SubLObject term_learner_known_bindings_for_sentence_internal(SubLObject sentence, final SubLObject mt, SubLObject inference_props)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    inference_props = inference_datastructures_enumerated_types.merge_query_properties( inference_props, $list438 );
    final SubLObject arg0 = cycl_utilities.formula_arg0( sentence );
    if( arg0.eql( $const55$isa ) )
    {
      sentence = el_utilities.replace_formula_arg( ZERO_INTEGER, $const439$nearestIsa, sentence );
    }
    else if( NIL == forts.fort_p( arg0 ) || NIL == genl_predicates.genl_predP( arg0, $const55$isa, UNPROVIDED, UNPROVIDED ) )
    {
      if( arg0.eql( $const76$genls ) )
      {
        sentence = el_utilities.replace_formula_arg( ZERO_INTEGER, $const440$nearestGenls, sentence );
      }
      else if( NIL != forts.fort_p( arg0 ) && NIL != genl_predicates.genl_predP( arg0, $const76$genls, UNPROVIDED, UNPROVIDED ) )
      {
        sentence = ConsesLow.list( $const73$assertedSentence, sentence );
      }
      else if( NIL == $cure_show_best_bindings$.getDynamicValue( thread ) && arg0.eql( $const441$commonAilmentCause ) )
      {
        sentence = ConsesLow.list( $const73$assertedSentence, sentence );
      }
      else if( NIL == $cure_show_best_bindings$.getDynamicValue( thread ) && arg0.eql( $const442$objectFoundInLocation ) )
      {
        sentence = ConsesLow.list( $const73$assertedSentence, sentence );
      }
      else if( NIL == $cure_show_best_bindings$.getDynamicValue( thread ) && arg0.eql( $const443$properlyGeographicallySubsumes ) )
      {
        sentence = ConsesLow.list( $const73$assertedSentence, sentence );
      }
    }
    final SubLObject temporal_mt = ( NIL != hlmt.atemporal_hlmtP( mt ) ) ? ConsesLow.list( $const444$MtSpace, $const445$AnytimePSC, mt ) : mt;
    final SubLObject bindings_and_supports = inference_kernel.new_cyc_query( sentence, temporal_mt, inference_props );
    final SubLObject best_bindings = cure_get_best_bindings( bindings_and_supports, temporal_mt );
    return best_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 109701L)
  public static SubLObject term_learner_known_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props)
  {
    if( inference_props == UNPROVIDED )
    {
      inference_props = NIL;
    }
    SubLObject caching_state = $term_learner_known_bindings_for_sentence_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym437$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE, $sym446$_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym447$CLEAR_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, inference_props );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && inference_props.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_known_bindings_for_sentence_internal( sentence, mt, inference_props ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, inference_props ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 111343L)
  public static SubLObject cure_get_best_bindings(final SubLObject bindings_and_supports, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject asserted_bindings = NIL;
    SubLObject derived_bindings = NIL;
    SubLObject cdolist_list_var = bindings_and_supports;
    SubLObject binding_and_supports = NIL;
    binding_and_supports = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding_and_supports;
      SubLObject binding_set = NIL;
      SubLObject support_set = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list448 );
      binding_set = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list448 );
      support_set = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject badP = NIL;
        if( NIL == badP )
        {
          SubLObject csome_list_var = binding_set;
          SubLObject binding = NIL;
          binding = csome_list_var.first();
          while ( NIL == badP && NIL != csome_list_var)
          {
            if( NIL == term_learner_possibly_relevant_generalizationP( binding.rest(), mt ) )
            {
              badP = T;
            }
            csome_list_var = csome_list_var.rest();
            binding = csome_list_var.first();
          }
        }
        if( NIL == badP )
        {
          if( NIL != $cure_show_best_bindings$.getDynamicValue( thread ) )
          {
            SubLObject binding_set_added = NIL;
            SubLObject cdolist_list_var_$67 = support_set;
            SubLObject support = NIL;
            support = cdolist_list_var_$67.first();
            while ( NIL != cdolist_list_var_$67)
            {
              if( NIL != assertion_handles.assertion_p( support ) && NIL != assertions_high.asserted_assertionP( support ) )
              {
                final SubLObject item_var = binding_set;
                if( NIL == conses_high.member( item_var, asserted_bindings, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                {
                  asserted_bindings = ConsesLow.cons( item_var, asserted_bindings );
                }
                binding_set_added = T;
              }
              cdolist_list_var_$67 = cdolist_list_var_$67.rest();
              support = cdolist_list_var_$67.first();
            }
            if( NIL == binding_set_added )
            {
              final SubLObject item_var = binding_set;
              if( NIL == conses_high.member( item_var, derived_bindings, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                derived_bindings = ConsesLow.cons( item_var, derived_bindings );
              }
            }
          }
          else
          {
            final SubLObject item_var2 = binding_set;
            if( NIL == conses_high.member( item_var2, asserted_bindings, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              asserted_bindings = ConsesLow.cons( item_var2, asserted_bindings );
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list448 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_and_supports = cdolist_list_var.first();
    }
    return ( NIL != asserted_bindings ) ? asserted_bindings : derived_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112364L)
  public static SubLObject clear_term_learner_known_negated_bindings_for_sentence()
  {
    final SubLObject cs = $term_learner_known_negated_bindings_for_sentence_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112364L)
  public static SubLObject remove_term_learner_known_negated_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props)
  {
    if( inference_props == UNPROVIDED )
    {
      inference_props = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_known_negated_bindings_for_sentence_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt, inference_props ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112364L)
  public static SubLObject term_learner_known_negated_bindings_for_sentence_internal(final SubLObject sentence, final SubLObject mt, final SubLObject inference_props)
  {
    return term_learner_known_bindings_for_sentence( ConsesLow.list( $const73$assertedSentence, ConsesLow.list( $const372$not, sentence ) ), mt, inference_props );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112364L)
  public static SubLObject term_learner_known_negated_bindings_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject inference_props)
  {
    if( inference_props == UNPROVIDED )
    {
      inference_props = NIL;
    }
    SubLObject caching_state = $term_learner_known_negated_bindings_for_sentence_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym449$TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE, $sym450$_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE_CACHING_STATE_, NIL,
          EQUAL, THREE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym451$CLEAR_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, inference_props );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && inference_props.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_known_negated_bindings_for_sentence_internal( sentence, mt, inference_props ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, inference_props ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112632L)
  public static SubLObject clear_term_learner_types_for_fragment()
  {
    final SubLObject cs = $term_learner_types_for_fragment_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112632L)
  public static SubLObject remove_term_learner_types_for_fragment(final SubLObject focal_arg_positions, final SubLObject fragment, final SubLObject term_phrase, final SubLObject nl_mt, final SubLObject domain_mt,
      final SubLObject followup_query_mt, SubLObject unknown_onlyP, SubLObject questions_onlyP)
  {
    if( unknown_onlyP == UNPROVIDED )
    {
      unknown_onlyP = NIL;
    }
    if( questions_onlyP == UNPROVIDED )
    {
      questions_onlyP = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_types_for_fragment_caching_state$.getGlobalValue(), ConsesLow.list( focal_arg_positions, fragment, term_phrase, nl_mt,
        domain_mt, followup_query_mt, unknown_onlyP, questions_onlyP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112632L)
  public static SubLObject term_learner_types_for_fragment_internal(final SubLObject focal_arg_positions, final SubLObject fragment, final SubLObject term_phrase, final SubLObject nl_mt, final SubLObject domain_mt,
      final SubLObject followup_query_mt, final SubLObject unknown_onlyP, final SubLObject questions_onlyP)
  {
    SubLObject cycl = cae_query_search.cae_query_search_fragment_formula( fragment );
    final SubLObject fragment_justification = cae_query_search.cae_query_search_fragment_justification( fragment );
    SubLObject term_learner_types = NIL;
    final SubLObject known_binding_lists = term_learner_known_bindings_for_sentence( cycl, domain_mt, UNPROVIDED );
    final SubLObject known_negated_binding_lists = term_learner_known_negated_bindings_for_sentence( cycl, domain_mt, UNPROVIDED );
    final SubLObject binding_constraints = term_learner_known_value_constraints_for_sentence( cycl, followup_query_mt );
    final SubLObject available_binding_lists = binding_lists_passing_constraints( known_binding_lists, binding_constraints, domain_mt );
    final SubLObject available_negated_binding_lists = binding_lists_passing_constraints( known_negated_binding_lists, binding_constraints, domain_mt );
    SubLObject bindings_lists = NIL;
    SubLObject negated_bindings_lists = NIL;
    final SubLObject default_unbound_bindings = default_unbound_bindings_for_fragment( cycl, followup_query_mt );
    if( NIL == unknown_onlyP || NIL == available_binding_lists )
    {
      if( NIL != questions_onlyP || NIL != unknown_onlyP )
      {
        cycl = bindings.apply_bindings( default_unbound_bindings, cycl );
        bindings_lists = ConsesLow.list( NIL );
        negated_bindings_lists = ConsesLow.list( NIL );
      }
      else if( NIL != available_binding_lists || NIL != available_negated_binding_lists )
      {
        bindings_lists = available_binding_lists;
        negated_bindings_lists = available_negated_binding_lists;
        if( NIL != should_add_empty_bindingsP( bindings_lists, negated_bindings_lists, cycl, followup_query_mt ) )
        {
          bindings_lists = ConsesLow.cons( NIL, bindings_lists );
        }
      }
      else
      {
        bindings_lists = ConsesLow.list( NIL );
        negated_bindings_lists = NIL;
        cycl = bindings.apply_bindings( default_unbound_bindings, cycl );
      }
    }
    SubLObject cdolist_list_var = bindings_lists;
    SubLObject current_bindings = NIL;
    current_bindings = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_sentence = bindings.apply_bindings( current_bindings, cycl );
      final SubLObject suggestions = term_learner_candidate_replacements_for_sentence( focal_arg_positions, current_sentence, followup_query_mt );
      final SubLObject source_renderers = term_learner_source_renderers_for_sentence( current_sentence, domain_mt );
      final SubLObject justifications = new_term_learner_justifications( term_phrase, $str50$, $kw97$USER, source_renderers, UNPROVIDED );
      term_learner_types = ConsesLow.cons( term_learner_type_for_fragment_int( current_sentence, followup_query_mt, cycl, current_bindings, suggestions, justifications, fragment_justification, nl_mt, UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), term_learner_types );
      cdolist_list_var = cdolist_list_var.rest();
      current_bindings = cdolist_list_var.first();
    }
    cdolist_list_var = negated_bindings_lists;
    current_bindings = NIL;
    current_bindings = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject negated_cycl = ConsesLow.list( $const372$not, cycl );
      final SubLObject current_sentence2 = bindings.apply_bindings( current_bindings, negated_cycl );
      final SubLObject suggestions2 = term_learner_candidate_replacements_for_sentence( focal_arg_positions, current_sentence2, followup_query_mt );
      final SubLObject source_renderers2 = term_learner_source_renderers_for_sentence( current_sentence2, domain_mt );
      final SubLObject justifications2 = new_term_learner_justifications( term_phrase, $str50$, $kw97$USER, source_renderers2, UNPROVIDED );
      term_learner_types = ConsesLow.cons( term_learner_type_for_fragment_int( current_sentence2, followup_query_mt, negated_cycl, current_bindings, suggestions2, justifications2, fragment_justification, nl_mt,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), term_learner_types );
      cdolist_list_var = cdolist_list_var.rest();
      current_bindings = cdolist_list_var.first();
    }
    return term_learner_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 112632L)
  public static SubLObject term_learner_types_for_fragment(final SubLObject focal_arg_positions, final SubLObject fragment, final SubLObject term_phrase, final SubLObject nl_mt, final SubLObject domain_mt,
      final SubLObject followup_query_mt, SubLObject unknown_onlyP, SubLObject questions_onlyP)
  {
    if( unknown_onlyP == UNPROVIDED )
    {
      unknown_onlyP = NIL;
    }
    if( questions_onlyP == UNPROVIDED )
    {
      questions_onlyP = NIL;
    }
    SubLObject caching_state = $term_learner_types_for_fragment_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym452$TERM_LEARNER_TYPES_FOR_FRAGMENT, $sym453$_TERM_LEARNER_TYPES_FOR_FRAGMENT_CACHING_STATE_, NIL, EQUAL, EIGHT_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym454$CLEAR_TERM_LEARNER_TYPES_FOR_FRAGMENT );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_8( focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt, followup_query_mt, unknown_onlyP, questions_onlyP );
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
        if( focal_arg_positions.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( fragment.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( term_phrase.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( nl_mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( domain_mt.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( followup_query_mt.equal( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( unknown_onlyP.equal( cached_args.first() ) )
                    {
                      cached_args = cached_args.rest();
                      if( NIL != cached_args && NIL == cached_args.rest() && questions_onlyP.equal( cached_args.first() ) )
                      {
                        return memoization_state.caching_results( results2 );
                      }
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_types_for_fragment_internal( focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt,
        followup_query_mt, unknown_onlyP, questions_onlyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( focal_arg_positions, fragment, term_phrase, nl_mt, domain_mt, followup_query_mt, unknown_onlyP,
        questions_onlyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 116509L)
  public static SubLObject should_add_empty_bindingsP(final SubLObject known_bindings_lists, final SubLObject known_negated_bindings_lists, final SubLObject cycl, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == known_bindings_lists && NIL != conses_high.member( NIL, known_negated_bindings_lists, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL == known_bindings_lists )
    {
      return T;
    }
    final SubLObject pred = cycl_utilities.formula_arg0( cycl );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      return makeBoolean( NIL == kb_mapping_utilities.pred_values( pred, $const455$singleEntryFormatInArgs, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 117330L)
  public static SubLObject default_unbound_bindings_for_fragment(final SubLObject cycl, final SubLObject mt)
  {
    final SubLObject free_vars = obsolete.formula_free_variables( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject new_bindings = NIL;
    SubLObject cdolist_list_var = free_vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject constraints = html_complete.get_arg_constraints_for_var( cycl, var, mt );
      SubLObject cdolist_list_var_$68;
      final SubLObject isa_constraints = cdolist_list_var_$68 = conses_high.getf( constraints, $kw143$ISA, UNPROVIDED );
      SubLObject constraint_cycl = NIL;
      constraint_cycl = cdolist_list_var_$68.first();
      while ( NIL != cdolist_list_var_$68)
      {
        if( NIL != genls.genlP( constraint_cycl, $const456$List, mt, UNPROVIDED ) && NIL == genls.genlP( constraint_cycl, $const457$CharacterString, mt, UNPROVIDED ) )
        {
          final SubLObject exp_with_all_vars = ConsesLow.list( $const60$and, new_bindings, cycl );
          final SubLObject new_var1 = czer_utilities.unique_el_var_wrt_expression( exp_with_all_vars, $sym282$_X );
          final SubLObject new_var2 = czer_utilities.unique_el_var_wrt_expression( exp_with_all_vars, $sym458$_Y );
          new_bindings = ConsesLow.cons( bindings.make_variable_binding( var, ConsesLow.list( $const459$TheList, new_var1, new_var2 ) ), new_bindings );
        }
        cdolist_list_var_$68 = cdolist_list_var_$68.rest();
        constraint_cycl = cdolist_list_var_$68.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return new_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 118103L)
  public static SubLObject binding_lists_passing_constraints(final SubLObject binding_lists, final SubLObject binding_constraints, final SubLObject mt)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = binding_lists;
    SubLObject binding_list = NIL;
    binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term_learner_meets_constraints( binding_list, binding_constraints, mt ) )
      {
        result = ConsesLow.cons( binding_list, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_list = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 118386L)
  public static SubLObject term_learner_meets_constraints(final SubLObject binding_set, final SubLObject binding_constraints, final SubLObject mt)
  {
    SubLObject cdolist_list_var = binding_constraints;
    SubLObject constraint = NIL;
    constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = constraint;
      SubLObject possibly_met_constraint = NIL;
      SubLObject must_be_met_constraint = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list460 );
      possibly_met_constraint = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list460 );
      must_be_met_constraint = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != ask_utilities.query_boolean( bindings.apply_bindings( binding_set, possibly_met_constraint ), mt, UNPROVIDED ) && NIL == ask_utilities.query_boolean( bindings.apply_bindings( binding_set,
            must_be_met_constraint ), mt, UNPROVIDED ) )
        {
          return NIL;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list460 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 118795L)
  public static SubLObject term_learner_known_value_constraints_for_sentence(final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject pred = cycl_utilities.formula_arg0( sentence );
    final SubLObject raw_constraints = ask_utilities.query_template( $list461, ConsesLow.listS( $const462$constrainKnownValuesForPredRelati, pred, $list461 ), mt, UNPROVIDED );
    SubLObject constraints = NIL;
    SubLObject cdolist_list_var = raw_constraints;
    SubLObject raw_constraint = NIL;
    raw_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = raw_constraint;
      SubLObject allowed_val = NIL;
      SubLObject allowed_pos = NIL;
      SubLObject known_val = NIL;
      SubLObject known_pos = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list463 );
      allowed_val = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list463 );
      allowed_pos = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list463 );
      known_val = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list463 );
      known_pos = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject allowed_var = cycl_utilities.formula_arg( sentence, allowed_pos, UNPROVIDED );
        final SubLObject known_var = cycl_utilities.formula_arg( sentence, known_pos, UNPROVIDED );
        constraints = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $const55$isa, known_var, known_val ), ConsesLow.list( $const55$isa, allowed_var, allowed_val ) ), constraints );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list463 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      raw_constraint = cdolist_list_var.first();
    }
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 119538L)
  public static SubLObject term_learner_source_renderers_for_sentence(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLObject asserts = term_learner_find_visible_assertions_cycl( sentence, domain_mt );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = asserts;
    SubLObject v_assert = NIL;
    v_assert = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mt = assertions_high.assertion_mt( v_assert );
      SubLObject cdolist_list_var_$69;
      final SubLObject v_sources = cdolist_list_var_$69 = sources_of_mt( mt, $const64$InferencePSC );
      SubLObject source = NIL;
      source = cdolist_list_var_$69.first();
      while ( NIL != cdolist_list_var_$69)
      {
        if( cycl_utilities.formula_arg0( source ).equal( $const464$SentenceOfCWFn ) )
        {
          final SubLObject base_source = cycl_utilities.formula_arg_position( source, $list465, UNPROVIDED );
          SubLObject source_string = NIL;
          if( cycl_utilities.formula_arg_position( source, $list466, UNPROVIDED ).equal( $const467$WebPageCWFn ) )
          {
            source_string = cycl_utilities.formula_arg_position( source, $list468, UNPROVIDED );
          }
          else
          {
            source_string = pph_main.generate_phrase( base_source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          result = ConsesLow.cons( new_term_learner_open_select_renderer( NIL, ConsesLow.list( ConsesLow.list( source_string, source, T ) ), source, UNPROVIDED, UNPROVIDED ), result );
        }
        cdolist_list_var_$69 = cdolist_list_var_$69.rest();
        source = cdolist_list_var_$69.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_assert = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 120483L)
  public static SubLObject clear_sources_of_mt()
  {
    final SubLObject cs = $sources_of_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 120483L)
  public static SubLObject remove_sources_of_mt(final SubLObject source_mt, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $sources_of_mt_caching_state$.getGlobalValue(), ConsesLow.list( source_mt, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 120483L)
  public static SubLObject sources_of_mt_internal(final SubLObject source_mt, final SubLObject mt)
  {
    return ask_utilities.query_variable( $sym470$_PCW, ConsesLow.list( $const60$and, ConsesLow.listS( $const471$contextOfPCWInterpretation, $sym470$_PCW, source_mt, $list472 ) ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 120483L)
  public static SubLObject sources_of_mt(final SubLObject source_mt, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    SubLObject caching_state = $sources_of_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym469$SOURCES_OF_MT, $sym473$_SOURCES_OF_MT_CACHING_STATE_, $int318$100, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym474$CLEAR_SOURCES_OF_MT );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( source_mt, mt );
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
        if( source_mt.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sources_of_mt_internal( source_mt, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( source_mt, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 120725L)
  public static SubLObject java_rendering_cycl(final SubLObject obj)
  {
    return conses_high.second( obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 121146L)
  public static SubLObject java_rendering_string(final SubLObject obj)
  {
    return pph_utilities.pph_javalist_string( obj.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 121236L)
  public static SubLObject java_rendering_p(final SubLObject obj)
  {
    return makeBoolean( obj.isList() && NIL != cycl_grammar.cycl_represented_term_p( java_rendering_cycl( obj ) ) && NIL != pph_utilities.pph_javalist_p( obj.first() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 121399L)
  public static SubLObject java_rendering_to_selection_renderer(final SubLObject obj)
  {
    final SubLObject cycl = java_rendering_cycl( obj );
    final SubLObject string = java_rendering_string( obj );
    final SubLObject cycl_id = document_annotation_widgets.term_learner_id( cycl );
    return ConsesLow.list( $kw67$STRING, string, $kw159$VALID, T, $kw117$CYCL, cycl, $kw161$CYCL_ID, cycl_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 121652L)
  public static SubLObject term_learner_candidate_hierarchical_replacements_for_sentence(final SubLObject sentence_id, final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym475$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE, sentence_id, user, task ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
            $sym475$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE, sentence_id, user, task ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject this_task = ( NIL != task ) ? task : default_task_for_user( user );
    final SubLObject mt = followup_query_mt_for_userXtask( user, this_task );
    final SubLObject sentence = kb_utilities.maybe_find_object_by_compact_hl_external_id_string( sentence_id );
    return term_learner_candidate_hierarchical_replacements_for_sentence_int( NIL, sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 122245L)
  public static SubLObject term_learner_candidate_hierarchical_replacements_for_sentence_int(final SubLObject focal_arg_positions, final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject raw_suggestions = gke_main.candidate_replacement_renderers_for_sentence( sentence, mt, UNPROVIDED );
    SubLObject good_suggestions = NIL;
    SubLObject cdolist_list_var = raw_suggestions;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject arg_pos = NIL;
      SubLObject suggestions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list476 );
      arg_pos = current.first();
      current = ( suggestions = current.rest() );
      if( NIL == subl_promotions.memberP( arg_pos, focal_arg_positions, EQUAL, UNPROVIDED ) )
      {
        SubLObject hierarchical = conses_high.second( suggestions );
        final SubLObject alphabetical = suggestions.first();
        if( hierarchical.equal( NIL ) )
        {
          hierarchical = convert_alphabetical_to_hierarchical_replacements( alphabetical );
        }
        hierarchical = ConsesLow.list( hierarchical );
        good_suggestions = list_utilities.alist_enter( good_suggestions, arg_pos, transform_list_utilities.transform( hierarchical, $sym477$JAVA_RENDERING_P, $sym478$JAVA_RENDERING_TO_SELECTION_RENDERER, UNPROVIDED ),
            UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return good_suggestions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 123403L)
  public static SubLObject convert_alphabetical_to_hierarchical_replacements(final SubLObject alpha_suggestions)
  {
    SubLObject hier_suggestions = NIL;
    SubLObject cdolist_list_var = alpha_suggestions;
    SubLObject alpha_suggestion = NIL;
    alpha_suggestion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      hier_suggestions = ConsesLow.cons( ConsesLow.list( alpha_suggestion ), hier_suggestions );
      cdolist_list_var = cdolist_list_var.rest();
      alpha_suggestion = cdolist_list_var.first();
    }
    return Sequences.nreverse( hier_suggestions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 123665L)
  public static SubLObject term_learner_candidate_replacements_for_sentence(final SubLObject focal_arg_positions, final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject raw_suggestions = gke_main.candidate_replacements_for_sentence( sentence, mt );
    SubLObject good_suggestions = NIL;
    SubLObject cdolist_list_var = raw_suggestions;
    SubLObject suggestion = NIL;
    suggestion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg_pos = suggestion.first();
      if( NIL == subl_promotions.memberP( arg_pos, focal_arg_positions, EQUAL, UNPROVIDED ) && NIL == fort_types_interface.predicate_p( cycl_utilities.formula_arg_position( sentence, arg_pos, UNPROVIDED ) ) )
      {
        good_suggestions = ConsesLow.cons( suggestion, good_suggestions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      suggestion = cdolist_list_var.first();
    }
    return good_suggestions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 124277L)
  public static SubLObject term_learner_candidate_replacements_for_arg_positions_in_sentence(final SubLObject arg_positions, final SubLObject sentence, final SubLObject mt)
  {
    final SubLObject raw_suggestions = gke_main.candidate_replacements_for_sentence( sentence, mt );
    SubLObject good_suggestions = NIL;
    SubLObject cdolist_list_var = raw_suggestions;
    SubLObject suggestion = NIL;
    suggestion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arg_pos = suggestion.first();
      if( NIL != subl_promotions.memberP( arg_pos, arg_positions, EQUAL, UNPROVIDED ) )
      {
        good_suggestions = ConsesLow.cons( suggestion, good_suggestions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      suggestion = cdolist_list_var.first();
    }
    return good_suggestions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 124825L)
  public static SubLObject clear_get_arg_positions_for_terms()
  {
    final SubLObject cs = $get_arg_positions_for_terms_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 124825L)
  public static SubLObject remove_get_arg_positions_for_terms(final SubLObject sentence, final SubLObject terms)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_arg_positions_for_terms_caching_state$.getGlobalValue(), ConsesLow.list( sentence, terms ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 124825L)
  public static SubLObject get_arg_positions_for_terms_internal(final SubLObject sentence, final SubLObject terms)
  {
    SubLObject arg_poses = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject items_var = cycl_utilities.arg_positions_dfs( v_term, sentence, UNPROVIDED );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          arg_poses = ConsesLow.cons( item, arg_poses );
        }
      }
      else
      {
        SubLObject cdolist_list_var_$70 = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var_$70.first();
        while ( NIL != cdolist_list_var_$70)
        {
          arg_poses = ConsesLow.cons( item2, arg_poses );
          cdolist_list_var_$70 = cdolist_list_var_$70.rest();
          item2 = cdolist_list_var_$70.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return arg_poses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 124825L)
  public static SubLObject get_arg_positions_for_terms(final SubLObject sentence, final SubLObject terms)
  {
    SubLObject caching_state = $get_arg_positions_for_terms_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym479$GET_ARG_POSITIONS_FOR_TERMS, $sym480$_GET_ARG_POSITIONS_FOR_TERMS_CACHING_STATE_, $int414$128, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sentence, terms );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && terms.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_arg_positions_for_terms_internal( sentence, terms ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, terms ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 125099L)
  public static SubLObject term_learner_consolidate_javalist_for_arg_positions(final SubLObject cycl_sentence, final SubLObject javalist, final SubLObject arg_positions)
  {
    SubLObject new_javalist_items = NIL;
    SubLObject current_items = NIL;
    SubLObject current_argpos = NIL;
    SubLObject csome_list_var = pph_utilities.pph_njavalist_items( javalist );
    SubLObject item = NIL;
    item = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      final SubLObject item_argpos = pph_utilities.pph_javalist_item_arg_position( item );
      if( NIL != current_items && item_argpos.isList() && NIL == list_prefixP( current_argpos, item_argpos ) )
      {
        new_javalist_items = consolidate_and_add_new_javalist_items( new_javalist_items, cycl_sentence, current_argpos, current_items );
        current_argpos = NIL;
        current_items = NIL;
      }
      final SubLObject subsuming_argpos = argpos_subsumes( item_argpos, arg_positions );
      if( NIL != subsuming_argpos )
      {
        current_items = ConsesLow.cons( item, current_items );
        current_argpos = subsuming_argpos;
      }
      else if( !item_argpos.isList() && NIL != current_items )
      {
        current_items = ConsesLow.cons( item, current_items );
      }
      else
      {
        new_javalist_items = ConsesLow.cons( item, new_javalist_items );
      }
      csome_list_var = csome_list_var.rest();
      item = csome_list_var.first();
    }
    new_javalist_items = consolidate_and_add_new_javalist_items( new_javalist_items, cycl_sentence, current_argpos, current_items );
    return pph_utilities.new_pph_javalist( pph_utilities.pph_javalist_string( javalist ), Sequences.nreverse( new_javalist_items ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 126894L)
  public static SubLObject consolidate_and_add_new_javalist_items(SubLObject javalist_items, final SubLObject cycl_sentence, final SubLObject argpos, final SubLObject new_items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject last_item = ( pph_utilities.pph_javalist_item_arg_position( new_items.first() ) == $kw481$PPH_UNKNOWN_ARG_POSITION ) ? new_items.first() : NIL;
    final SubLObject items_to_consolidate = ( NIL != last_item ) ? new_items.rest() : new_items;
    final SubLObject string = string_utilities.join_strings( Mapping.mapcar( $sym482$PPH_JAVALIST_ITEM_STRING, Sequences.reverse( items_to_consolidate ) ), $str50$ );
    final SubLObject start_char = pph_utilities.pph_javalist_item_start_char( conses_high.last( items_to_consolidate, UNPROVIDED ).first() );
    final SubLObject v_term = cycl_utilities.formula_arg_position( cycl_sentence, argpos, UNPROVIDED );
    if( NIL != string_utilities.non_empty_stringP( string ) )
    {
      thread.resetMultipleValues();
      final SubLObject start_tag = term_learner_anchor_tags_for_term( v_term );
      final SubLObject close_tag = thread.secondMultipleValue();
      thread.resetMultipleValues();
      javalist_items = ConsesLow.cons( pph_utilities.new_pph_javalist_item( string, v_term, argpos, start_tag, close_tag, start_char ), javalist_items );
      if( NIL != last_item )
      {
        javalist_items = ConsesLow.cons( last_item, javalist_items );
      }
    }
    return javalist_items;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 127753L)
  public static SubLObject term_learner_anchor_tags_for_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject open_tag = NIL;
    SubLObject close_tag = NIL;
    if( NIL != narts_high.naut_p( v_term ) )
    {
      final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding( thread );
      final SubLObject _prev_bind_3 = pph_vars.$html_generation_term_id_function$.currentBinding( thread );
      try
      {
        pph_vars.$constant_link_function$.bind( $sym483$CB_NAUT_FRAME, thread );
        pph_vars.$html_generation_target$.bind( pph_vars.$html_generation_target$.getDynamicValue( thread ), thread );
        pph_vars.$html_generation_term_id_function$.bind( $sym484$PPH_NAUT_ID_FN, thread );
        thread.resetMultipleValues();
        final SubLObject open_tag_$71 = pph_html.pph_anchor_tags_for_term( v_term );
        final SubLObject close_tag_$72 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        open_tag = open_tag_$71;
        close_tag = close_tag_$72;
      }
      finally
      {
        pph_vars.$html_generation_term_id_function$.rebind( _prev_bind_3, thread );
        pph_vars.$html_generation_target$.rebind( _prev_bind_2, thread );
        pph_vars.$constant_link_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject open_tag_$72 = pph_html.pph_anchor_tags_for_term( v_term );
      final SubLObject close_tag_$73 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      open_tag = open_tag_$72;
      close_tag = close_tag_$73;
    }
    return Values.values( open_tag, close_tag );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 128185L)
  public static SubLObject argpos_subsumes(final SubLObject argpos, final SubLObject argpos_list)
  {
    if( !argpos.isList() )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = argpos_list;
    SubLObject possible_subsumer = NIL;
    possible_subsumer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_prefixP( possible_subsumer, argpos ) )
      {
        return possible_subsumer;
      }
      cdolist_list_var = cdolist_list_var.rest();
      possible_subsumer = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 128490L)
  public static SubLObject list_prefixP(final SubLObject prefix, final SubLObject list)
  {
    if( !list.isList() )
    {
      return NIL;
    }
    return Equality.eq( ZERO_INTEGER, Sequences.search( prefix, list, EQL, IDENTITY, ZERO_INTEGER, Sequences.length( prefix ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 128647L)
  public static SubLObject term_learner_type_for_fragment_int(final SubLObject sentence, final SubLObject domain_mt, SubLObject original_sentence, SubLObject current_bindings, SubLObject suggestions,
      SubLObject justifications, SubLObject fragment_justification, SubLObject nl_mt, SubLObject approval_code, SubLObject display_cycl, SubLObject status, SubLObject clarifying_cycl, SubLObject allow_arbitrary_editsP,
      SubLObject prevent_unassertP)
  {
    if( original_sentence == UNPROVIDED )
    {
      original_sentence = NIL;
    }
    if( current_bindings == UNPROVIDED )
    {
      current_bindings = NIL;
    }
    if( suggestions == UNPROVIDED )
    {
      suggestions = NIL;
    }
    if( justifications == UNPROVIDED )
    {
      justifications = ConsesLow.list( new_term_learner_justification( $str50$, $str50$, $kw97$USER, UNPROVIDED, UNPROVIDED ) );
    }
    if( fragment_justification == UNPROVIDED )
    {
      fragment_justification = NIL;
    }
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = cure_default_generation_mt( UNPROVIDED );
    }
    if( approval_code == UNPROVIDED )
    {
      approval_code = NIL;
    }
    if( display_cycl == UNPROVIDED )
    {
      display_cycl = NIL;
    }
    if( status == UNPROVIDED )
    {
      status = NIL;
    }
    if( clarifying_cycl == UNPROVIDED )
    {
      clarifying_cycl = NIL;
    }
    if( allow_arbitrary_editsP == UNPROVIDED )
    {
      allow_arbitrary_editsP = NIL;
    }
    if( prevent_unassertP == UNPROVIDED )
    {
      prevent_unassertP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == display_cycl )
    {
      display_cycl = sentence;
    }
    if( $kw20$DEFAULT == justifications )
    {
      justifications = ConsesLow.list( new_term_learner_justification( $str50$, $str50$, $kw97$USER, UNPROVIDED, UNPROVIDED ) );
    }
    final SubLObject sentence_status = term_learner_fact_status_int( sentence, domain_mt, UNPROVIDED ).first();
    final SubLObject status_$75 = ( NIL != allow_arbitrary_editsP ) ? $term_learner_unknown_assertible$.getGlobalValue() : sentence_status;
    SubLObject renderers = NIL;
    final SubLObject default_weight = $float98$0_9;
    final SubLObject open_query_variables = el_utilities.sentence_free_variables( original_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject open_query_var_arg_poses = get_arg_positions_for_terms( original_sentence, open_query_variables );
    final SubLObject unassertible_sentence_ids = ( NIL != prevent_unassertP ) ? kb_utilities.compact_hl_external_id_string( sentence ) : $str50$;
    final SubLObject nl_force = ( sentence_status.eql( $term_learner_unknown_assertible$.getGlobalValue() ) && NIL != el_utilities.closedP( display_cycl, UNPROVIDED ) && NIL != cycl_grammar.cycl_sentence_p(
        display_cycl ) ) ? $kw485$INTERROGATIVE : $kw20$DEFAULT;
    SubLObject list_item_arg_poses = NIL;
    SubLObject olist = NIL;
    if( NIL != $cure_edit_the_list_termsP$.getDynamicValue( thread ) )
    {
      list_item_arg_poses = cure_list_item_arg_poses( sentence );
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_consolidate_javalistsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_consolidate_javalistsP$.bind( T, thread );
      pph_vars.$pph_consolidate_output_list_for_natP$.bind( T, thread );
      olist = cae_query_search.get_gloss_olist_for_indexed_query( display_cycl, nl_mt, domain_mt, $kw20$DEFAULT, nl_force, allow_arbitrary_editsP );
      if( NIL == olist )
      {
        return NIL;
      }
      final SubLObject clarifying_olist = ( NIL != clarifying_cycl ) ? pph_main.generate_pph_output_list( clarifying_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
      if( NIL != clarifying_olist )
      {
        olist = Sequences.cconcatenate( olist, new SubLObject[] { ConsesLow.list( pph_question.new_pph_phrase_filler_item( $str486$__ ) ), clarifying_olist, ConsesLow.list( pph_question.new_pph_phrase_filler_item(
            $str487$_ ) )
        } );
      }
    }
    finally
    {
      pph_vars.$pph_consolidate_output_list_for_natP$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_consolidate_javalistsP$.rebind( _prev_bind_0, thread );
    }
    assert NIL != pph_phrase.pph_phrase_output_list_p( olist ) : olist;
    SubLObject start_char_index = ZERO_INTEGER;
    SubLObject end_char_index = ZERO_INTEGER;
    final SubLObject whole_html_string = pph_phrase.pph_phrase_output_list_string( olist, T );
    final SubLObject whole_string = pph_utilities.pph_remove_html_tags( whole_html_string, NIL );
    final SubLObject iterator = pph_data_structures.new_pph_phrase_output_list_iterator( olist );
    while ( NIL == pph_data_structures.pph_phrase_output_list_iterator_empty_p( iterator ))
    {
      final SubLObject item = pph_data_structures.pph_phrase_output_list_iterator_next( iterator );
      final SubLObject raw_item_string = pph_phrase.pph_phrase_output_item_get_string( item, NIL );
      start_char_index = pph_macros.pph_output_list_find_start_char( raw_item_string, whole_string, end_char_index );
      if( start_char_index.numG( end_char_index ) )
      {
        final SubLObject v_pph_string = pph_macros.pph_make_space_string( start_char_index, end_char_index );
        final SubLObject arg_position = pph_utilities.pph_unknown_arg_position();
        final SubLObject html_open_tag = NIL;
        final SubLObject html_close_tag = NIL;
        final SubLObject paranoid_arg = pph_phrase.pph_empty_cycl();
        final SubLObject item_$76 = pph_question.new_pph_phrase_filler_item( v_pph_string );
        final SubLObject start_char_index_$77 = end_char_index;
        final SubLObject string = pph_string.pph_string_to_cycl( v_pph_string );
        final SubLObject item_cycl = pph_data_structures.pph_phrase_output_item_cycl( item_$76 );
        final SubLObject arg_pos = pph_data_structures.pph_phrase_output_item_arg_position( item_$76 );
        final SubLObject current_value = ( NIL != cycl_grammar.cycl_variable_p( item_cycl ) ) ? bindings.variable_lookup( item_cycl, current_bindings ) : item_cycl;
        final SubLObject duplicatableP = subl_promotions.memberP( arg_pos, list_item_arg_poses, EQUAL, UNPROVIDED );
        final SubLObject agr_preds = ( NIL != pph_data_structures.pph_phrase_output_item_agr_pred( item_$76 ) ) ? ConsesLow.list( pph_data_structures.pph_phrase_output_item_agr_pred( item_$76 ) ) : $kw20$DEFAULT;
        if( NIL != term_learner_unmodifiable_statusP( status_$75 ) && item_cycl.isString() )
        {
          renderers = ConsesLow.cons( new_term_learner_string_renderer( string, UNPROVIDED, UNPROVIDED, UNPROVIDED ), renderers );
        }
        else if( NIL != term_learner_unmodifiable_statusP( status_$75 ) )
        {
          renderers = ConsesLow.cons( new_term_learner_string_renderer( string, item_cycl, UNPROVIDED, UNPROVIDED ), renderers );
        }
        else if( item_cycl.isString() && NIL == pph_utilities.pph_unknown_arg_position_p( pph_data_structures.pph_phrase_output_item_arg_position( item_$76 ) ) )
        {
          renderers = ConsesLow.cons( new_term_learner_uninterpreted_renderer( string, arg_pos, sentence ), renderers );
        }
        else if( NIL != subl_promotions.memberP( item_cycl, open_query_variables, UNPROVIDED, UNPROVIDED ) && NIL != constraint_filters.any_spec_ofP( at_var_types.formula_variable_isa_constraints( item_cycl,
            original_sentence, $const64$InferencePSC, UNPROVIDED ), $const457$CharacterString, $const64$InferencePSC ) )
        {
          renderers = ConsesLow.cons( new_term_learner_uninterpreted_renderer( $str50$, arg_pos, sentence ), renderers );
        }
        else if( NIL != constraint_filters.any_spec_ofP( at_var_types.formula_variable_isa_constraints( item_cycl, original_sentence, $const64$InferencePSC, UNPROVIDED ), $const457$CharacterString,
            $const64$InferencePSC ) )
        {
          renderers = ConsesLow.cons( new_term_learner_uninterpreted_renderer( item_cycl, arg_pos, sentence ), renderers );
        }
        else if( NIL != get_suggested_cycls_for_arg_pos( suggestions, arg_pos ) )
        {
          final SubLObject arg_suggestions = get_suggested_cycls_for_arg_pos( suggestions, arg_pos );
          final SubLObject arg_constraints = html_complete.get_arg_constraints_for_arg( sentence, arg_pos, domain_mt );
          final SubLObject suggestions_and_current_value = ( NIL != current_value ) ? list_utilities.snoc( current_value, Sequences.remove( current_value, arg_suggestions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ) ) : list_utilities.snoc( $kw489$CHOOSE_A_VALUE, arg_suggestions );
          final SubLObject selected_suggestion = ( NIL != current_value ) ? get_initial_suggestion_from_suggestions( arg_suggestions, current_value ) : $str490$Choose_a_value;
          final SubLObject triples = ( NIL != list_utilities.lengthL( arg_suggestions, $int491$40, UNPROVIDED ) ) ? make_nl_cycl_valid_triples_for_cycls( suggestions_and_current_value, agr_preds )
              : make_nl_cycl_valid_triples_for_cycls( conses_high.last( suggestions_and_current_value, UNPROVIDED ), agr_preds );
          renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos, triples, selected_suggestion, arg_constraints, UNPROVIDED ), renderers );
        }
        else if( NIL != subl_promotions.memberP( item_cycl, open_query_variables, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos, domain_mt );
          renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos, make_nl_cycl_valid_triples_for_cycls( ( NIL != current_value ) ? ConsesLow.list( current_value ) : NIL, agr_preds ), current_value,
              arg_constraints2, duplicatableP ), renderers );
        }
        else if( NIL != subl_promotions.memberP( arg_pos, open_query_var_arg_poses, UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos, domain_mt );
          renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos, make_nl_cycl_valid_triples_for_cycls( ConsesLow.list( cycl_utilities.formula_arg_position( sentence, arg_pos, UNPROVIDED ) ),
              agr_preds ), current_value, arg_constraints2, T ), renderers );
        }
        else if( NIL != duplicatableP )
        {
          final SubLObject arg_suggestions = get_suggested_cycls_for_arg_pos( suggestions, arg_pos );
          final SubLObject arg_constraints = html_complete.get_arg_constraints_for_arg( sentence, arg_pos, domain_mt );
          final SubLObject suggestions_and_current_value = ( NIL != current_value ) ? list_utilities.snoc( current_value, Sequences.remove( current_value, arg_suggestions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ) ) : list_utilities.snoc( $kw489$CHOOSE_A_VALUE, arg_suggestions );
          final SubLObject selected_suggestion = ( NIL != current_value ) ? get_initial_suggestion_from_suggestions( arg_suggestions, current_value ) : $str490$Choose_a_value;
          final SubLObject triples = ( NIL != list_utilities.lengthL( arg_suggestions, $int491$40, UNPROVIDED ) ) ? make_nl_cycl_valid_triples_for_cycls( suggestions_and_current_value, agr_preds )
              : make_nl_cycl_valid_triples_for_cycls( conses_high.last( suggestions_and_current_value, UNPROVIDED ), agr_preds );
          renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos, triples, selected_suggestion, arg_constraints, T ), renderers );
        }
        else if( ( NIL == $cure_allow_some_predicates_to_be_edited$.getDynamicValue( thread ) || !arg_pos.equalp( $list492 ) ) && NIL != cure_editable_itemP( item_cycl, allow_arbitrary_editsP ) )
        {
          final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos, domain_mt );
          renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos, make_nl_cycl_valid_triples_for_cycls( ( NIL != current_value ) ? ConsesLow.list( item_cycl ) : NIL, agr_preds ), item_cycl,
              arg_constraints2, UNPROVIDED ), renderers );
        }
        else if( NIL != forts.fort_p( item_cycl ) )
        {
          renderers = ConsesLow.cons( new_term_learner_string_renderer( string, item_cycl, UNPROVIDED, UNPROVIDED ), renderers );
        }
        else
        {
          renderers = ConsesLow.cons( new_term_learner_string_renderer( string, UNPROVIDED, UNPROVIDED, UNPROVIDED ), renderers );
        }
      }
      end_char_index = pph_macros.pph_update_end_char_index( start_char_index, raw_item_string );
      final SubLObject v_pph_string = pph_phrase.pph_phrase_output_item_get_string( item, NIL );
      final SubLObject arg_position = pph_data_structures.pph_phrase_output_item_arg_position( item );
      final SubLObject html_open_tag = pph_data_structures.pph_phrase_output_item_html_open_tag( item );
      final SubLObject html_close_tag = pph_data_structures.pph_phrase_output_item_html_close_tag( item );
      final SubLObject paranoid_arg = pph_data_structures.pph_phrase_output_item_cycl( item );
      final SubLObject item_$77 = item;
      final SubLObject string2 = pph_string.pph_string_to_cycl( v_pph_string );
      final SubLObject item_cycl2 = pph_data_structures.pph_phrase_output_item_cycl( item_$77 );
      final SubLObject arg_pos2 = pph_data_structures.pph_phrase_output_item_arg_position( item_$77 );
      final SubLObject current_value2 = ( NIL != cycl_grammar.cycl_variable_p( item_cycl2 ) ) ? bindings.variable_lookup( item_cycl2, current_bindings ) : item_cycl2;
      final SubLObject duplicatableP2 = subl_promotions.memberP( arg_pos2, list_item_arg_poses, EQUAL, UNPROVIDED );
      final SubLObject agr_preds2 = ( NIL != pph_data_structures.pph_phrase_output_item_agr_pred( item_$77 ) ) ? ConsesLow.list( pph_data_structures.pph_phrase_output_item_agr_pred( item_$77 ) ) : $kw20$DEFAULT;
      if( NIL != term_learner_unmodifiable_statusP( status_$75 ) && item_cycl2.isString() )
      {
        renderers = ConsesLow.cons( new_term_learner_string_renderer( string2, UNPROVIDED, UNPROVIDED, UNPROVIDED ), renderers );
      }
      else if( NIL != term_learner_unmodifiable_statusP( status_$75 ) )
      {
        renderers = ConsesLow.cons( new_term_learner_string_renderer( string2, item_cycl2, UNPROVIDED, UNPROVIDED ), renderers );
      }
      else if( item_cycl2.isString() && NIL == pph_utilities.pph_unknown_arg_position_p( pph_data_structures.pph_phrase_output_item_arg_position( item_$77 ) ) )
      {
        renderers = ConsesLow.cons( new_term_learner_uninterpreted_renderer( string2, arg_pos2, sentence ), renderers );
      }
      else if( NIL != subl_promotions.memberP( item_cycl2, open_query_variables, UNPROVIDED, UNPROVIDED ) && NIL != constraint_filters.any_spec_ofP( at_var_types.formula_variable_isa_constraints( item_cycl2,
          original_sentence, $const64$InferencePSC, UNPROVIDED ), $const457$CharacterString, $const64$InferencePSC ) )
      {
        renderers = ConsesLow.cons( new_term_learner_uninterpreted_renderer( $str50$, arg_pos2, sentence ), renderers );
      }
      else if( NIL != constraint_filters.any_spec_ofP( at_var_types.formula_variable_isa_constraints( item_cycl2, original_sentence, $const64$InferencePSC, UNPROVIDED ), $const457$CharacterString,
          $const64$InferencePSC ) )
      {
        renderers = ConsesLow.cons( new_term_learner_uninterpreted_renderer( item_cycl2, arg_pos2, sentence ), renderers );
      }
      else if( NIL != get_suggested_cycls_for_arg_pos( suggestions, arg_pos2 ) )
      {
        final SubLObject arg_suggestions2 = get_suggested_cycls_for_arg_pos( suggestions, arg_pos2 );
        final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos2, domain_mt );
        final SubLObject suggestions_and_current_value2 = ( NIL != current_value2 ) ? list_utilities.snoc( current_value2, Sequences.remove( current_value2, arg_suggestions2, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) ) : list_utilities.snoc( $kw489$CHOOSE_A_VALUE, arg_suggestions2 );
        final SubLObject selected_suggestion2 = ( NIL != current_value2 ) ? get_initial_suggestion_from_suggestions( arg_suggestions2, current_value2 ) : $str490$Choose_a_value;
        final SubLObject triples2 = ( NIL != list_utilities.lengthL( arg_suggestions2, $int491$40, UNPROVIDED ) ) ? make_nl_cycl_valid_triples_for_cycls( suggestions_and_current_value2, agr_preds2 )
            : make_nl_cycl_valid_triples_for_cycls( conses_high.last( suggestions_and_current_value2, UNPROVIDED ), agr_preds2 );
        renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos2, triples2, selected_suggestion2, arg_constraints2, UNPROVIDED ), renderers );
      }
      else if( NIL != subl_promotions.memberP( item_cycl2, open_query_variables, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject arg_constraints3 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos2, domain_mt );
        renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos2, make_nl_cycl_valid_triples_for_cycls( ( NIL != current_value2 ) ? ConsesLow.list( current_value2 ) : NIL, agr_preds2 ), current_value2,
            arg_constraints3, duplicatableP2 ), renderers );
      }
      else if( NIL != subl_promotions.memberP( arg_pos2, open_query_var_arg_poses, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject arg_constraints3 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos2, domain_mt );
        renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos2, make_nl_cycl_valid_triples_for_cycls( ConsesLow.list( cycl_utilities.formula_arg_position( sentence, arg_pos2, UNPROVIDED ) ),
            agr_preds2 ), current_value2, arg_constraints3, T ), renderers );
      }
      else if( NIL != duplicatableP2 )
      {
        final SubLObject arg_suggestions2 = get_suggested_cycls_for_arg_pos( suggestions, arg_pos2 );
        final SubLObject arg_constraints2 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos2, domain_mt );
        final SubLObject suggestions_and_current_value2 = ( NIL != current_value2 ) ? list_utilities.snoc( current_value2, Sequences.remove( current_value2, arg_suggestions2, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) ) : list_utilities.snoc( $kw489$CHOOSE_A_VALUE, arg_suggestions2 );
        final SubLObject selected_suggestion2 = ( NIL != current_value2 ) ? get_initial_suggestion_from_suggestions( arg_suggestions2, current_value2 ) : $str490$Choose_a_value;
        final SubLObject triples2 = ( NIL != list_utilities.lengthL( arg_suggestions2, $int491$40, UNPROVIDED ) ) ? make_nl_cycl_valid_triples_for_cycls( suggestions_and_current_value2, agr_preds2 )
            : make_nl_cycl_valid_triples_for_cycls( conses_high.last( suggestions_and_current_value2, UNPROVIDED ), agr_preds2 );
        renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos2, triples2, selected_suggestion2, arg_constraints2, T ), renderers );
      }
      else if( ( NIL == $cure_allow_some_predicates_to_be_edited$.getDynamicValue( thread ) || !arg_pos2.equalp( $list492 ) ) && NIL != cure_editable_itemP( item_cycl2, allow_arbitrary_editsP ) )
      {
        final SubLObject arg_constraints3 = html_complete.get_arg_constraints_for_arg( sentence, arg_pos2, domain_mt );
        renderers = ConsesLow.cons( new_term_learner_open_select_renderer( arg_pos2, make_nl_cycl_valid_triples_for_cycls( ( NIL != current_value2 ) ? ConsesLow.list( item_cycl2 ) : NIL, agr_preds2 ), item_cycl2,
            arg_constraints3, UNPROVIDED ), renderers );
      }
      else if( NIL != forts.fort_p( item_cycl2 ) )
      {
        renderers = ConsesLow.cons( new_term_learner_string_renderer( string2, item_cycl2, UNPROVIDED, UNPROVIDED ), renderers );
      }
      else
      {
        renderers = ConsesLow.cons( new_term_learner_string_renderer( string2, UNPROVIDED, UNPROVIDED, UNPROVIDED ), renderers );
      }
    }
    return new_term_learner_type_int( sentence, default_weight, justifications, fragment_justification, $str50$, sentence, status_$75, Sequences.nreverse( renderers ), original_sentence, T, T, approval_code,
        unassertible_sentence_ids );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 137406L)
  public static SubLObject cure_list_item_arg_poses(final SubLObject sentence)
  {
    SubLObject unmergeable = NIL;
    SubLObject list_arg_poses = NIL;
    final SubLObject arg_stack = stacks.create_stack();
    final SubLObject pos_stack = stacks.create_stack();
    SubLObject arg = NIL;
    SubLObject argpos = NIL;
    stacks.stack_push( sentence, arg_stack );
    stacks.stack_push( argpos, pos_stack );
    while ( NIL == stacks.stack_empty_p( arg_stack ))
    {
      final SubLObject entry = stacks.stack_pop( arg_stack );
      final SubLObject pos_entry = stacks.stack_pop( pos_stack );
      arg = entry;
      argpos = pos_entry;
      if( cycl_utilities.formula_arg0( arg ).eql( $const459$TheList ) )
      {
        SubLObject arg_num = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( arg, $kw493$IGNORE );
        SubLObject list_arg = NIL;
        list_arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          arg_num = Numbers.add( arg_num, ONE_INTEGER );
          final SubLObject item_var = argpos;
          if( NIL == conses_high.member( item_var, list_arg_poses, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            list_arg_poses = ConsesLow.cons( item_var, list_arg_poses );
          }
          unmergeable = ConsesLow.cons( list_utilities.snoc( arg_num, argpos ), unmergeable );
          cdolist_list_var = cdolist_list_var.rest();
          list_arg = cdolist_list_var.first();
        }
      }
      final SubLObject terms = cycl_utilities.formula_terms( entry, $kw493$IGNORE );
      SubLObject list_var = NIL;
      SubLObject arg_$79 = NIL;
      SubLObject arg_num2 = NIL;
      list_var = terms;
      arg_$79 = list_var.first();
      for( arg_num2 = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), arg_$79 = list_var.first(), arg_num2 = number_utilities.f_1X( arg_num2 ) )
      {
        stacks.stack_push( arg_$79, arg_stack );
        stacks.stack_push( list_utilities.snoc( arg_num2, argpos ), pos_stack );
      }
    }
    return Values.values( unmergeable, list_arg_poses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 138504L)
  public static SubLObject cure_editable_itemP(final SubLObject cycl, SubLObject allow_arbitrary_editsP)
  {
    if( allow_arbitrary_editsP == UNPROVIDED )
    {
      allow_arbitrary_editsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == allow_arbitrary_editsP )
    {
      return NIL;
    }
    if( NIL != $cure_allow_some_predicates_to_be_edited$.getDynamicValue( thread ) && NIL != fort_types_interface.predicate_p( cycl ) )
    {
      return T;
    }
    if( NIL != fort_types_interface.relation_p( cycl ) )
    {
      return NIL;
    }
    if( NIL != cycl_utilities.fort_or_naut_p( cycl ) )
    {
      return T;
    }
    if( cycl.isNumber() )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 138846L)
  public static SubLObject cyc_terms_to_term_learner_terms(final SubLObject terms)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( $kw117$CYCL, v_term, $kw119$CONCEPT_ID, document_annotation_widgets.term_learner_id( v_term ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 139053L)
  public static SubLObject new_term_learner_uninterpreted_renderer(final SubLObject string, final SubLObject arg_pos, SubLObject current_sentence)
  {
    if( current_sentence == UNPROVIDED )
    {
      current_sentence = NIL;
    }
    if( NIL != term_learner_documentation_sentenceP( current_sentence ) )
    {
      return new_term_learner_modifiable_text_renderer( cycl_string.cycl_string_trim( $list494, string ), arg_pos );
    }
    return new_term_learner_modifiable_string_renderer( cycl_string.cycl_string_trim( $list494, string ), arg_pos );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 139417L)
  public static SubLObject term_learner_types_for_sentence(final SubLObject sentence, final SubLObject user, SubLObject allow_arbitrary_editsP)
  {
    if( allow_arbitrary_editsP == UNPROVIDED )
    {
      allow_arbitrary_editsP = NIL;
    }
    return term_learner_types_for_sentence_id( kb_utilities.compact_hl_external_id_string( sentence ), user, allow_arbitrary_editsP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 139631L)
  public static SubLObject term_learner_types_for_sentence_id(final SubLObject sentence_id, final SubLObject user, SubLObject allow_arbitrary_editsP, SubLObject arg_pos_to_modify, SubLObject modify_command,
      SubLObject prevent_unassertP)
  {
    if( allow_arbitrary_editsP == UNPROVIDED )
    {
      allow_arbitrary_editsP = NIL;
    }
    if( arg_pos_to_modify == UNPROVIDED )
    {
      arg_pos_to_modify = NIL;
    }
    if( modify_command == UNPROVIDED )
    {
      modify_command = NIL;
    }
    if( prevent_unassertP == UNPROVIDED )
    {
      prevent_unassertP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym496$TERM_LEARNER_TYPES_FOR_SENTENCE_ID, sentence_id, user, allow_arbitrary_editsP, arg_pos_to_modify, modify_command, prevent_unassertP ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym496$TERM_LEARNER_TYPES_FOR_SENTENCE_ID, sentence_id, user,
            allow_arbitrary_editsP, arg_pos_to_modify, modify_command, prevent_unassertP ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject task = default_task_for_user( user );
    final SubLObject pph_mt = cure_default_generation_mt( task );
    final SubLObject orig_sentence = document_annotation_widgets.term_learner_object_from_id( sentence_id );
    final SubLObject new_sentence = cure_possibly_duplicate_arg( orig_sentence, arg_pos_to_modify, modify_command );
    final SubLObject justifications = ConsesLow.list( new_term_learner_justification( $str50$, $str50$, $kw97$USER, UNPROVIDED, UNPROVIDED ) );
    final SubLObject vars = el_utilities.sentence_free_variables( new_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject arg_positions = get_arg_positions_for_terms_in_sentence( new_sentence, vars );
    final SubLObject domain_mt = query_mt_for_user_and_task( user, task );
    final SubLObject suggestions = term_learner_candidate_replacements_for_arg_positions_in_sentence( arg_positions, new_sentence, $const64$InferencePSC );
    return ConsesLow.list( term_learner_type_for_fragment_int( new_sentence, domain_mt, new_sentence, NIL, suggestions, NIL, justifications, pph_mt, NIL, NIL, NIL, NIL, allow_arbitrary_editsP, prevent_unassertP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 140941L)
  public static SubLObject cure_possibly_duplicate_arg(SubLObject sentence, final SubLObject arg_pos_string, final SubLObject command_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $cure_edit_the_list_termsP$.getDynamicValue( thread ) )
    {
      return sentence;
    }
    if( !arg_pos_string.isString() )
    {
      return sentence;
    }
    final SubLObject arg_pos = reader.read_from_string_ignoring_errors( arg_pos_string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != subl_promotions.memberP( command_string, $list497, Symbols.symbol_function( EQUALP ), UNPROVIDED ) && NIL != cycl_utilities.arg_position_p( arg_pos ) )
    {
      final SubLObject original_arg = cycl_utilities.formula_arg_position( sentence, conses_high.butlast( arg_pos, UNPROVIDED ), UNPROVIDED );
      final SubLObject new_arg_pos = command_string.equal( $str498$add_before ) ? Numbers.subtract( conses_high.last( arg_pos, UNPROVIDED ).first(), ONE_INTEGER ) : conses_high.last( arg_pos, UNPROVIDED ).first();
      SubLObject new_arg = NIL;
      final SubLObject terms = cycl_utilities.formula_terms( original_arg, $kw493$IGNORE );
      SubLObject list_var = NIL;
      SubLObject v_term = NIL;
      SubLObject num = NIL;
      list_var = terms;
      v_term = list_var.first();
      for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), num = number_utilities.f_1X( num ) )
      {
        new_arg = ConsesLow.cons( v_term, new_arg );
        if( num.eql( new_arg_pos ) )
        {
          new_arg = ConsesLow.cons( $sym499$_NEW_VAR, new_arg );
        }
      }
      sentence = el_utilities.replace_formula_arg_position( conses_high.butlast( arg_pos, UNPROVIDED ), Sequences.nreverse( new_arg ), sentence );
    }
    else if( command_string.equal( $str500$remove ) && NIL != cycl_utilities.arg_position_p( arg_pos ) )
    {
      sentence = cycl_utilities.formula_arg_position_subst( $delete_me_token$.getGlobalValue(), arg_pos, sentence );
      sentence = list_utilities.tree_delete( $delete_me_token$.getGlobalValue(), sentence, Symbols.symbol_function( EQ ), UNPROVIDED );
    }
    else
    {
      Errors.warn( $str501$can_t_duplicate_with_uninterpreta, command_string );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 142558L)
  public static SubLObject get_arg_positions_for_terms_in_sentence(final SubLObject sentence, final SubLObject vars)
  {
    SubLObject arg_positions = NIL;
    SubLObject cdolist_list_var = vars;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject items_var = cycl_utilities.arg_positions_dfs( var, sentence, UNPROVIDED );
      if( items_var.isVector() )
      {
        final SubLObject vector_var = items_var;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject item;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          item = Vectors.aref( vector_var, element_num );
          arg_positions = ConsesLow.cons( item, arg_positions );
        }
      }
      else
      {
        SubLObject cdolist_list_var_$80 = items_var;
        SubLObject item2 = NIL;
        item2 = cdolist_list_var_$80.first();
        while ( NIL != cdolist_list_var_$80)
        {
          arg_positions = ConsesLow.cons( item2, arg_positions );
          cdolist_list_var_$80 = cdolist_list_var_$80.rest();
          item2 = cdolist_list_var_$80.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return arg_positions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 142773L)
  public static SubLObject term_learner_documentation_sentenceP(final SubLObject cycl_sentence)
  {
    return isa.isaP( cycl_utilities.formula_arg0( cycl_sentence ), $const510$DocumentationPredicate, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 142913L)
  public static SubLObject get_initial_suggestion_from_suggestions(final SubLObject suggestions, SubLObject current_value)
  {
    if( current_value == UNPROVIDED )
    {
      current_value = NIL;
    }
    if( NIL != current_value )
    {
      return current_value;
    }
    if( NIL != list_utilities.lengthE( suggestions, ONE_INTEGER, UNPROVIDED ) )
    {
      return suggestions.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 143340L)
  public static SubLObject get_suggested_cycls_for_arg_pos(final SubLObject suggestions, final SubLObject arg_pos)
  {
    final SubLObject suggestion_list = Sequences.find( arg_pos, suggestions, EQUAL, $sym405$FIRST, UNPROVIDED, UNPROVIDED );
    return suggestion_list.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 143519L)
  public static SubLObject make_nl_cycl_valid_triples_for_cycls(final SubLObject cycls, SubLObject agr_preds)
  {
    if( agr_preds == UNPROVIDED )
    {
      agr_preds = $kw20$DEFAULT;
    }
    final SubLObject generations = term_learner_cycl_terms_to_nl_strings( cycls, cure_default_generation_mt( UNPROVIDED ), agr_preds );
    SubLObject triples = NIL;
    SubLObject cycl = NIL;
    SubLObject cycl_$81 = NIL;
    SubLObject generation_list = NIL;
    SubLObject generation_list_$82 = NIL;
    cycl = cycls;
    cycl_$81 = cycl.first();
    generation_list = generations;
    generation_list_$82 = generation_list.first();
    while ( NIL != generation_list || NIL != cycl)
    {
      if( cycl_$81.equal( $kw489$CHOOSE_A_VALUE ) )
      {
        triples = ConsesLow.cons( ConsesLow.list( $str490$Choose_a_value, $str490$Choose_a_value, NIL ), triples );
      }
      else if( NIL == cycl_grammar.cycl_variable_p( cycl_$81 ) )
      {
        triples = ConsesLow.cons( ConsesLow.list( generation_list_$82, cycl_$81, T ), triples );
      }
      cycl = cycl.rest();
      cycl_$81 = cycl.first();
      generation_list = generation_list.rest();
      generation_list_$82 = generation_list.first();
    }
    return triples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 144034L)
  public static SubLObject term_learner_terms_mergeableP(final SubLObject t1, final SubLObject t2, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != kb_accessors.individualP( t1 ) && NIL != kb_accessors.individualP( t2 ) )
      {
        result = makeBoolean( NIL == disjoint_with.instances_of_disjoint_collectionsP( t1, t2, UNPROVIDED, UNPROVIDED ) );
      }
      else if( NIL != fort_types_interface.collectionP( t1 ) && NIL != fort_types_interface.collectionP( t2 ) )
      {
        result = makeBoolean( NIL == disjoint_with.collections_disjointP( t1, t2, UNPROVIDED ) );
      }
      else if( ( NIL != fort_types_interface.collectionP( t1 ) && genls.min_genls( t1, UNPROVIDED, UNPROVIDED ).equal( ConsesLow.list( $const49$Collection ) ) ) || ( NIL != fort_types_interface.collectionP( t2 ) && genls
          .min_genls( t2, UNPROVIDED, UNPROVIDED ).equal( ConsesLow.list( $const49$Collection ) ) ) || ( NIL != kb_accessors.individualP( t2 ) && isa.min_isa( t2, UNPROVIDED, UNPROVIDED ).equal( ConsesLow.list(
              $const48$Individual ) ) ) || ( NIL != kb_accessors.individualP( t1 ) && isa.min_isa( t1, UNPROVIDED, UNPROVIDED ).equal( ConsesLow.list( $const48$Individual ) ) ) )
      {
        result = T;
      }
      else if( ( NIL != fort_types_interface.collectionP( t1 ) && NIL != kb_accessors.individualP( t2 ) ) || ( NIL != kb_accessors.individualP( t1 ) && NIL != fort_types_interface.collectionP( t2 ) ) )
      {
        result = NIL;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 145074L)
  public static SubLObject term_learner_string_denots(final SubLObject string)
  {
    final SubLObject lex_entries = methods.funcall_instance_method_with_1_args( document_annotation_widgets.get_default_document_ingester_annotation_lexicon( UNPROVIDED ), $sym34$GET, string );
    final SubLObject cycls = term_lexicon.denots_for_term_lexicon_entries( lex_entries );
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 145431L)
  public static SubLObject term_learner_sentence_assertibleP(final SubLObject sentence, final SubLObject mt)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( sentence, $const511$equals ) )
    {
      return term_learner_terms_mergeableP( cycl_utilities.formula_arg1( sentence, UNPROVIDED ), cycl_utilities.formula_arg2( sentence, UNPROVIDED ), UNPROVIDED );
    }
    return term_learner_sentence_assertible_intP( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 145706L)
  public static SubLObject term_learner_sentence_assertible_intP(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_vars.$validate_expansionsP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = wff_vars.$wff_mode$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      control_vars.$within_assert$.bind( T, thread );
      wff_vars.$validate_expansionsP$.bind( T, thread );
      wff_vars.$wff_mode$.bind( $kw512$LENIENT, thread );
      result = wff.el_wffP( sentence, mt, UNPROVIDED );
    }
    finally
    {
      wff_vars.$wff_mode$.rebind( _prev_bind_6, thread );
      wff_vars.$validate_expansionsP$.rebind( _prev_bind_5, thread );
      control_vars.$within_assert$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 146073L)
  public static SubLObject get_sentence_from_template(final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_template)
  {
    final SubLObject focal_term = document_annotation_widgets.term_learner_object_from_id( term_id );
    final SubLObject sentence = cycl_utilities.expression_subst( focal_term, $kw324$TERM, sentence_template, EQUAL, UNPROVIDED );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 146337L)
  public static SubLObject term_learner_relevant_sentences_from_document(final SubLObject doc, final SubLObject v_term)
  {
    SubLObject relevant_sentences = NIL;
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$83;
    SubLObject backwardP_var_$84;
    SubLObject length_$85;
    SubLObject v_iteration_$86;
    SubLObject element_num_$87;
    SubLObject sentence;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$83 = document.paragraph_sentences( paragraph );
      backwardP_var_$84 = NIL;
      for( length_$85 = Sequences.length( vector_var_$83 ), v_iteration_$86 = NIL, v_iteration_$86 = ZERO_INTEGER; v_iteration_$86.numL( length_$85 ); v_iteration_$86 = Numbers.add( v_iteration_$86, ONE_INTEGER ) )
      {
        element_num_$87 = ( ( NIL != backwardP_var_$84 ) ? Numbers.subtract( length_$85, v_iteration_$86, ONE_INTEGER ) : v_iteration_$86 );
        sentence = Vectors.aref( vector_var_$83, element_num_$87 );
        if( NIL != string_utilities.substringP( v_term, document.sentence_string( sentence ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          relevant_sentences = ConsesLow.cons( sentence, relevant_sentences );
        }
      }
    }
    return relevant_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 146843L)
  public static SubLObject term_learner_relevant_sentences(final SubLObject sentences, final SubLObject v_term)
  {
    assert NIL != Types.listp( sentences ) : sentences;
    assert NIL != Types.stringp( v_term ) : v_term;
    SubLObject relevant_sentences = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_string_p( sentence ) && NIL != string_utilities.substringP( v_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject item_var = sentence;
        if( NIL == conses_high.member( item_var, relevant_sentences, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          relevant_sentences = ConsesLow.cons( item_var, relevant_sentences );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return relevant_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 147332L)
  public static SubLObject term_learner_source_documentation_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $term_learner_source_documentation_mt$.getDynamicValue( thread ) == $kw177$UNINITIALIZED )
    {
      final SubLObject init_value = ( NIL != constants_high.find_constant( $str514$WebDocumentsMt ) ) ? $const515$WebDocumentsMt : $const516$MassMediaDataMt;
      if( init_value == $kw177$UNINITIALIZED )
      {
        Errors.error( $str517$Unable_to_initialize__A__, $term_learner_source_documentation_mt$.getDynamicValue( thread ) );
      }
      $term_learner_source_documentation_mt$.setDynamicValue( init_value, thread );
    }
    return $term_learner_source_documentation_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 147864L)
  public static SubLObject cure_default_generation_mt(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    if( NIL != task )
    {
      return query_library_utils.cae_default_paraphrase_mt( task );
    }
    return term_learner_default_generation_mt();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 148114L)
  public static SubLObject term_learner_default_generation_mt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $term_learner_default_generation_mt$.getDynamicValue( thread ) )
    {
      $term_learner_default_generation_mt$.setDynamicValue( pph_vars.default_pph_language_mt( ConsesLow.list( $const520$TechnicalEnglishLexicalMt, $const521$MedicalLexicalMt ) ), thread );
    }
    return $term_learner_default_generation_mt$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 148401L)
  public static SubLObject term_learner_cycl_terms_to_nl_strings(final SubLObject terms, SubLObject mt, SubLObject preds)
  {
    if( mt == UNPROVIDED )
    {
      mt = cure_default_generation_mt( UNPROVIDED );
    }
    if( preds == UNPROVIDED )
    {
      preds = NIL;
    }
    SubLObject params = ConsesLow.list( $kw522$PPH_LEXICAL_CONTEXT, mt );
    if( NIL != preds )
    {
      params = conses_high.putf( params, $kw523$PPH_AGREEMENT, preds );
    }
    if( NIL == terms )
    {
      return NIL;
    }
    return nl_generation_api.cycl_terms_to_nl_strings_internal( terms, nl_generation_api.new_pph_parameters( params ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 148771L)
  public static SubLObject term_learner_cycl_term_to_nl_string(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = cure_default_generation_mt( UNPROVIDED );
    }
    return nl_generation_api.cycl_term_to_nl_string_internal( v_term, nl_generation_api.new_pph_parameters( ConsesLow.list( $kw522$PPH_LEXICAL_CONTEXT, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 149007L)
  public static SubLObject merge_justifications_for_ordered_types(final SubLObject initial_results)
  {
    SubLObject final_result = NIL;
    SubLObject cdolist_list_var = initial_results;
    SubLObject initial_result = NIL;
    initial_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject initial_cyc_term = get_cycl( initial_result );
      final SubLObject known_results_for_term = Sequences.find( initial_cyc_term, final_result, EQUAL, $sym524$GET_CYCL, UNPROVIDED, UNPROVIDED );
      if( NIL != known_results_for_term )
      {
        final SubLObject new_justification = conses_high.getf( initial_result, $kw162$JUSTIFICATION, UNPROVIDED );
        final SubLObject old_justification = conses_high.getf( known_results_for_term, $kw19$JUSTIFICATIONS, UNPROVIDED );
        conses_high.nsubst( Sequences.cconcatenate( ConsesLow.list( new_justification ), old_justification ), old_justification, known_results_for_term, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        final SubLObject new_just_list = ConsesLow.list( conses_high.getf( initial_result, $kw162$JUSTIFICATION, UNPROVIDED ) );
        SubLObject new_result = initial_result;
        new_result = list_utilities.plist_except( new_result, $list525 );
        new_result = conses_high.putf( new_result, $kw19$JUSTIFICATIONS, new_just_list );
        final_result = ConsesLow.cons( new_result, final_result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      initial_result = cdolist_list_var.first();
    }
    return final_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 149898L)
  public static SubLObject term_learner_handle_user_choice(final SubLObject choice_id, final SubLObject term_string, final SubLObject term_id, final SubLObject sentence_template, final SubLObject justifications,
      final SubLObject url, final SubLObject doc_title, final SubLObject user, final SubLObject accept_rejectP, SubLObject no_substitutions)
  {
    if( no_substitutions == UNPROVIDED )
    {
      no_substitutions = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] {
        $sym526$TERM_LEARNER_HANDLE_USER_CHOICE, choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, accept_rejectP, no_substitutions
      } ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( new SubLObject[] { $sym526$TERM_LEARNER_HANDLE_USER_CHOICE,
          choice_id, term_string, term_id, sentence_template, justifications, url, doc_title, user, accept_rejectP, no_substitutions
        } ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_3 = rkf_macros.$rkf_asserting_tool$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      rkf_macros.$rkf_asserting_tool$.bind( $const39$CycAssistedDocumentReader, thread );
      final SubLObject focal_term = ( NIL != cycl_grammar.cycl_represented_term_p( document_annotation_widgets.maybe_term_learner_object_from_id( term_id ) ) ) ? document_annotation_widgets.term_learner_object_from_id(
          term_id ) : NIL;
      final SubLObject sentence = ( NIL == focal_term || NIL != no_substitutions ) ? sentence_template : cycl_utilities.expression_subst( focal_term, $kw324$TERM, sentence_template, EQUAL, UNPROVIDED );
      final SubLObject sentence_id = document_annotation_widgets.term_learner_id( sentence_template );
      final SubLObject _prev_bind_0_$88 = czer_vars.$simplify_using_semanticsP$.currentBinding( thread );
      try
      {
        czer_vars.$simplify_using_semanticsP$.bind( NIL, thread );
        final SubLObject visible_sentence = simplifier.simplify_cycl_sentence( transform_list_utilities.transform( sentence, $sym527$TERM_EXPANSION_EXPECTED_SENTENCE_, $sym528$TRANSFORM_TO_TRUE, UNPROVIDED ),
            UNPROVIDED );
        SubLObject errors = NIL;
        if( accept_rejectP.eql( $kw199$ACCEPT ) )
        {
          SubLObject cdolist_list_var;
          final SubLObject mts = cdolist_list_var = get_mts_for_user_choice( url, doc_title, justifications, user, UNPROVIDED );
          SubLObject mt = NIL;
          mt = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            errors = ConsesLow.cons( rkf_assertion_utilities.rkf_assert_with_implicature( sentence, mt, T ), errors );
            if( NIL != focal_term && NIL != string_utilities.non_empty_stringP( term_string ) )
            {
              term_learner_assert_lexical_info( focal_term, term_string, mt, $term_learner_default_lexical_assertion_mt$.getDynamicValue( thread ), UNPROVIDED );
            }
            if( NIL != czer_meta.find_assertions_cycl( ConsesLow.list( $const53$inProgressTerm, focal_term ), UNPROVIDED ) )
            {
              rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const210$termDependsOn, focal_term, mts.first() ), $const211$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
              term_learner_lexify_from_termstrings( focal_term, $term_learner_default_lexical_assertion_mt$.getDynamicValue( thread ), mt );
              rkf_assertion_utilities.rkf_unassert( ConsesLow.list( $const53$inProgressTerm, focal_term ), $const211$UniversalVocabularyMt );
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
          }
          note_accepted_choice( term_string, focal_term, sentence, justifications, user );
        }
        else if( accept_rejectP.eql( $kw196$REJECT ) )
        {
          final SubLObject query_mt = find_query_mt_from_justifications( justifications, user );
          SubLObject cdolist_list_var2;
          final SubLObject asserted_mts = cdolist_list_var2 = Mapping.mapcar( $sym529$ASSERTION_MT, czer_meta.find_visible_assertions_cycl( sentence, query_mt ) );
          SubLObject mt2 = NIL;
          mt2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            errors = ConsesLow.cons( rkf_assertion_utilities.rkf_unassert( sentence, mt2 ), errors );
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt2 = cdolist_list_var2.first();
          }
        }
        errors = Sequences.remove( T, errors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != errors )
        {
          result = ConsesLow.list( $kw123$STATUS_CODE, FIVE_INTEGER, $kw530$CHOICE_ID, choice_id, $kw162$JUSTIFICATION, Sequences.cconcatenate( $str531$Error_while_trying_to_handle_, new SubLObject[] { format_nil
              .format_nil_a_no_copy( sentence ), format_nil.$format_nil_percent$.getGlobalValue()
          } ) );
        }
        else if( accept_rejectP == $kw199$ACCEPT )
        {
          final SubLObject nl_string = get_nl_generation_for_user_added_sentence( visible_sentence );
          final SubLObject new_sentence_id = document_annotation_widgets.term_learner_id( sentence );
          final SubLObject utf8_sentence = unicode_nauts.convert_unicode_nauts_to_utf8_strings( sentence );
          result = ConsesLow.list( new SubLObject[] { $kw123$STATUS_CODE, ONE_INTEGER, $kw530$CHOICE_ID, choice_id, $kw173$SENTENCE_ID, sentence_id, $kw532$NEW_SENTENCE_CYCL, utf8_sentence, $kw174$NEW_SENTENCE_ID,
            new_sentence_id, $kw120$NL_STRING, nl_string
          } );
          SubLObject ignore_errors_tag = NIL;
          try
          {
            thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
            final SubLObject _prev_bind_0_$89 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
              try
              {
                fact_sheets.update_fact_sheet_data_for_term_and_user_added_sentence( focal_term, visible_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$89, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw40$IGNORE_ERRORS_TARGET );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
        else
        {
          result = ConsesLow.list( $kw123$STATUS_CODE, THREE_INTEGER, $kw530$CHOICE_ID, choice_id, $kw173$SENTENCE_ID, sentence_id );
          SubLObject ignore_errors_tag2 = NIL;
          try
          {
            thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
            final SubLObject _prev_bind_0_$90 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
              try
              {
                fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence( focal_term, visible_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              catch( final Throwable catch_var2 )
              {
                Errors.handleThrowable( catch_var2, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$90, thread );
            }
          }
          catch( final Throwable ccatch_env_var2 )
          {
            ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw40$IGNORE_ERRORS_TARGET );
          }
          finally
          {
            thread.throwStack.pop();
          }
        }
      }
      finally
      {
        czer_vars.$simplify_using_semanticsP$.rebind( _prev_bind_0_$88, thread );
      }
    }
    finally
    {
      rkf_macros.$rkf_asserting_tool$.rebind( _prev_bind_3, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 153298L)
  public static SubLObject note_accepted_choice(final SubLObject term_string, final SubLObject focal_term, final SubLObject sentence, final SubLObject justifications, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            final SubLObject _prev_bind_0_$91 = stream_macros.$stream_requires_locking$.currentBinding( thread );
            try
            {
              stream_macros.$stream_requires_locking$.bind( NIL, thread );
              stream = compatibility.open_text( $term_learner_accepted_meanings_log_file$.getDynamicValue( thread ), $kw30$APPEND );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$91, thread );
            }
            if( !stream.isStream() )
            {
              Errors.error( $str31$Unable_to_open__S, $term_learner_accepted_meanings_log_file$.getDynamicValue( thread ) );
            }
            final SubLObject s = stream;
            PrintLow.format( s, $str533$_accepted_meaning_date___A__user_, new SubLObject[] { numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ), kb_utilities.compact_hl_external_id_string( user ), term_string,
              kb_utilities.compact_hl_external_id_string( focal_term ), string_utilities.to_string( focal_term ), kb_utilities.compact_hl_external_id_string( sentence ), string_utilities.to_string( sentence ),
              justifications
            } );
          }
          finally
          {
            final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( stream.isStream() )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw40$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 153936L)
  public static SubLObject get_nl_generation_for_user_added_sentence(final SubLObject sentence)
  {
    return term_learner_cycl_term_to_nl_string( sentence, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 154070L)
  public static SubLObject transform_to_true(final SubLObject obj)
  {
    return $const534$True;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 154150L)
  public static SubLObject term_expansion_expected_sentenceP(final SubLObject obj)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_sentence_p( obj ) && NIL != list_utilities.proper_list_p( obj ) && cycl_utilities.formula_arg0( obj ).eql( $const535$termExpansionExpected ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 154333L)
  public static SubLObject get_mts_for_user_choice(final SubLObject url, final SubLObject doc_title, final SubLObject justifications, SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == task )
    {
      task = default_task_for_user( user );
    }
    user = normalize_cure_user( user );
    SubLObject result_mts = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $current_tl_task$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      $current_tl_task$.bind( task, thread );
      if( NIL != cure_sort_work_by_docP( user, task ) && NIL != user_added_term_typeP( justifications ) )
      {
        final SubLObject base_source = find_or_create_base_source_for_url( url, doc_title, user, UNPROVIDED );
        final SubLObject assert_mt = find_or_create_user_addition_mt_for_url( url, doc_title, user );
        result_mts = ConsesLow.list( assert_mt );
      }
      else if( NIL != cure_sort_work_by_docP( user, task ) )
      {
        final SubLObject base_source = find_or_create_base_source_for_url( url, doc_title, user, UNPROVIDED );
        final SubLObject context_sentence = get_context_sentences_from_justifications( justifications ).first();
        final SubLObject base_source_mt = ensure_source_contextualized_in_spindle( base_source, get_task_source_spindle( task, user ), UNPROVIDED, UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject sentence_source = find_or_create_subwork_source( base_source, context_sentence, user );
        final SubLObject sentence_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_mts = ( NIL != sentence_mt ) ? ConsesLow.list( sentence_mt ) : ConsesLow.list( base_source_mt );
      }
      else if( NIL != default_assert_mt_for_user_and_task( user, task ) )
      {
        result_mts = ConsesLow.list( default_assert_mt_for_user_and_task( user, task ) );
      }
      else if( NIL != kb_utilities.compact_hl_external_id_stringP( url ) )
      {
        final SubLObject base_source = document_annotation_widgets.term_learner_object_from_id( url );
        final SubLObject context_sentence = get_context_sentences_from_justifications( justifications ).first();
        final SubLObject base_source_mt = ensure_source_contextualized_in_spindle( base_source, get_task_source_spindle( task, user ), UNPROVIDED, UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject sentence_source = find_or_create_subwork_source( base_source, context_sentence, user );
        final SubLObject sentence_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result_mts = ( NIL != sentence_mt ) ? ConsesLow.list( sentence_mt ) : ConsesLow.list( base_source_mt );
      }
      else if( NIL != all_justifications_have_specified_mtsP( justifications ) )
      {
        SubLObject mts = NIL;
        SubLObject cdolist_list_var = justifications;
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          mts = ConsesLow.cons( document_annotation_widgets.term_learner_object_from_id( conses_high.getf( justification, $kw95$ASSERT_MT, UNPROVIDED ) ), mts );
          cdolist_list_var = cdolist_list_var.rest();
          justification = cdolist_list_var.first();
        }
        result_mts = mts;
      }
      else
      {
        result_mts = ConsesLow.list( get_cure_user_addition_to_spindle_mt( user, task ) );
      }
    }
    finally
    {
      $current_tl_task$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return result_mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157080L)
  public static SubLObject get_cure_user_addition_to_spindle_mt(final SubLObject user, final SubLObject task)
  {
    final SubLObject user_addition_mt = ConsesLow.list( $const536$UnsourcedDataForUserByTaskMtFn, user, task );
    return user_addition_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157252L)
  public static SubLObject cure_sort_work_by_docP(final SubLObject user, final SubLObject task)
  {
    return ask_utilities.query_boolean( ConsesLow.list( $const537$userTaskSortsWorkBySourceDocument, user, task ), $const291$AnalystDatabaseMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157403L)
  public static SubLObject clear_normalize_cure_user()
  {
    final SubLObject cs = $normalize_cure_user_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157403L)
  public static SubLObject remove_normalize_cure_user(final SubLObject user)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $normalize_cure_user_caching_state$.getGlobalValue(), ConsesLow.list( user ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157403L)
  public static SubLObject normalize_cure_user_internal(final SubLObject user)
  {
    final SubLObject base_user = ask_utilities.query_variable( $sym539$_BASE_USER, ConsesLow.list( $const288$cureUserModel, $sym539$_BASE_USER, $sym540$_TASK, user ), $const64$InferencePSC, UNPROVIDED ).first();
    return ( NIL != base_user ) ? base_user : user;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157403L)
  public static SubLObject normalize_cure_user(final SubLObject user)
  {
    SubLObject caching_state = $normalize_cure_user_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym538$NORMALIZE_CURE_USER, $sym541$_NORMALIZE_CURE_USER_CACHING_STATE_, $int542$32, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( normalize_cure_user_internal( user ) ) );
      memoization_state.caching_state_put( caching_state, user, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157655L)
  public static SubLObject all_justifications_have_specified_mtsP(final SubLObject justs)
  {
    if( NIL == justs )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = justs;
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( conses_high.getf( just, $kw95$ASSERT_MT, $kw543$NOTHING ) == $kw543$NOTHING )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 157977L)
  public static SubLObject user_added_term_typeP(final SubLObject justifications)
  {
    SubLObject cdolist_list_var = justifications;
    SubLObject just = NIL;
    just = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.getf( just, $kw162$JUSTIFICATION, UNPROVIDED ) && conses_high.getf( conses_high.getf( just, $kw162$JUSTIFICATION, UNPROVIDED ), $kw544$TOOL, UNPROVIDED ) == $kw97$USER )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      just = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158643L)
  public static SubLObject get_task_source_spindle(final SubLObject task, final SubLObject user)
  {
    return ConsesLow.list( $const546$AssistedReaderSourceSpindleForTas, task, user );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158766L)
  public static SubLObject clear_default_assert_mt_for_user_and_task()
  {
    final SubLObject cs = $default_assert_mt_for_user_and_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158766L)
  public static SubLObject remove_default_assert_mt_for_user_and_task(final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = default_task_for_user( user );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $default_assert_mt_for_user_and_task_caching_state$.getGlobalValue(), ConsesLow.list( user, task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158766L)
  public static SubLObject default_assert_mt_for_user_and_task_internal(final SubLObject user, final SubLObject task)
  {
    return ask_utilities.query_variable( $sym429$_MT, ConsesLow.listS( $const548$assistedReaderAssertionMtForTaskA, task, user, $list434 ), $const64$InferencePSC, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 158766L)
  public static SubLObject default_assert_mt_for_user_and_task(final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = default_task_for_user( user );
    }
    SubLObject caching_state = $default_assert_mt_for_user_and_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym547$DEFAULT_ASSERT_MT_FOR_USER_AND_TASK, $sym549$_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym550$CLEAR_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( user, task );
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
        if( user.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && task.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( default_assert_mt_for_user_and_task_internal( user, task ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( user, task ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 159040L)
  public static SubLObject find_or_create_base_source_for_url(final SubLObject url, final SubLObject title, SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = $current_tl_task$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject source = NIL;
    final SubLObject date = date_utilities.indexical_today();
    final SubLObject source_spindle = get_task_source_spindle( task, user );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $term_learner_base_source_creation_lock$.getGlobalValue() );
      final SubLObject existing_sources = ask_utilities.query_variable( $sym551$_CW, ConsesLow.list( $const552$urlOfCW, $sym551$_CW, ConsesLow.list( $const553$URLFn, url ) ), $const64$InferencePSC, $list554 );
      if( NIL != existing_sources )
      {
        source = existing_sources.first();
      }
      if( NIL == source )
      {
        source = narts_high.nart_substitute( ConsesLow.list( $const467$WebPageCWFn, url ) );
      }
      if( NIL != $term_learner_assert_redundant_mt_info$.getDynamicValue( thread ) || NIL == ask_utilities.query_boolean( ConsesLow.list( $const555$mtSpindleMember, source_spindle, ConsesLow.list(
          $const556$ContextOfPCWFn, source ) ), term_learner_source_documentation_mt(), UNPROVIDED ) )
      {
        rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const55$isa, source, $list557 ), term_learner_source_documentation_mt(), T, T );
        rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const558$titleOfWork, source, title ), $term_learner_default_lexical_assertion_mt$.getDynamicValue( thread ), T, T );
        rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const552$urlOfCW, source, ConsesLow.list( $const553$URLFn, url ) ), term_learner_source_documentation_mt(), T, T );
        ensure_source_contextualized_in_spindle( source, source_spindle, date, user );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $term_learner_base_source_creation_lock$.getGlobalValue() );
      }
    }
    return source;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 160417L)
  public static SubLObject ensure_source_contextualized_in_spindle(SubLObject source, final SubLObject spindle, SubLObject date, SubLObject user)
  {
    if( date == UNPROVIDED )
    {
      date = date_utilities.indexical_today();
    }
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( user, thread );
      final SubLObject contextualized_source = ConsesLow.list( $const556$ContextOfPCWFn, source );
      final SubLObject interpreted_source = ConsesLow.list( $const559$ContextOfPCWInterpretationFn, source, user, date );
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const560$contextOfPCW, source, contextualized_source ), term_learner_source_documentation_mt(), T, T );
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const471$contextOfPCWInterpretation, source, interpreted_source, user, date ), term_learner_source_documentation_mt(), T, T );
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const555$mtSpindleMember, spindle, contextualized_source ), term_learner_source_documentation_mt(), T, T );
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const555$mtSpindleMember, spindle, interpreted_source ), term_learner_source_documentation_mt(), T, T );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.list( $const559$ContextOfPCWInterpretationFn, source, user, date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 161343L)
  public static SubLObject find_or_create_subwork_source(SubLObject source, final SubLObject sentence_string, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject date = date_utilities.indexical_today();
    SubLObject sub_source = NIL;
    SubLObject interpretation_mt = NIL;
    if( NIL == sentence_string )
    {
      return Values.values( NIL, NIL );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $term_learner_sub_source_creation_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( user, thread );
        final SubLObject existing_sources = ask_utilities.query_variable( $sym551$_CW, ConsesLow.list( $const60$and, ConsesLow.list( $const562$asHtmlSourceString, $list563, sentence_string ), ConsesLow.listS(
            $const564$subWorks, source, $list565 ) ), $const64$InferencePSC, UNPROVIDED );
        if( NIL == sub_source )
        {
          SubLObject csome_list_var = existing_sources;
          SubLObject existing_source = NIL;
          existing_source = csome_list_var.first();
          while ( NIL == sub_source && NIL != csome_list_var)
          {
            final SubLObject interp_mts = ask_utilities.query_variable( $sym429$_MT, ConsesLow.list( $const471$contextOfPCWInterpretation, existing_source, $sym429$_MT, api_control_vars.$the_cyclist$.getDynamicValue(
                thread ), date ), $const64$InferencePSC, $list554 );
            if( NIL != interp_mts )
            {
              sub_source = existing_source;
              interpretation_mt = interp_mts.first();
            }
            csome_list_var = csome_list_var.rest();
            existing_source = csome_list_var.first();
          }
        }
        if( NIL != sentence_string && ( NIL != $term_learner_assert_redundant_mt_info$.getDynamicValue( thread ) || NIL == interpretation_mt ) )
        {
          final SubLObject doc_name_length = $int566$30.numG( Sequences.length( sentence_string ) ) ? Sequences.length( sentence_string ) : $int566$30;
          sub_source = ConsesLow.list( $const464$SentenceOfCWFn, source, string_utilities.substring( sentence_string, ZERO_INTEGER, doc_name_length ) );
          interpretation_mt = narts_high.nart_substitute( ConsesLow.list( $const559$ContextOfPCWInterpretationFn, sub_source, user, date ) );
          rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const55$isa, sub_source, $list567 ), term_learner_source_documentation_mt(), T, T );
          rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const562$asHtmlSourceString, ConsesLow.list( $const568$AISForFn, sub_source ), sentence_string ), term_learner_source_documentation_mt(), T, T );
          rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const471$contextOfPCWInterpretation, sub_source, interpretation_mt, user, date ), term_learner_source_documentation_mt(), T, T );
          rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const564$subWorks, source, sub_source ), term_learner_source_documentation_mt(), T, T );
          rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const569$genlMt, ConsesLow.list( $const556$ContextOfPCWFn, source ), interpretation_mt ), term_learner_source_documentation_mt(), T, T );
        }
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $term_learner_sub_source_creation_lock$.getGlobalValue() );
      }
    }
    interpretation_mt = ensure_is_hlmt_p_nart( interpretation_mt );
    return Values.values( sub_source, interpretation_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 163437L)
  public static SubLObject ensure_is_hlmt_p_nart(final SubLObject nat)
  {
    if( NIL == hlmt.hlmt_p( nat ) )
    {
      isa.isaP( nat, $const570$Microtheory, UNPROVIDED, UNPROVIDED );
    }
    return narts_high.nart_substitute( nat );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 163659L)
  public static SubLObject find_or_create_user_addition_mt_for_url(SubLObject source, final SubLObject sentence_string, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject date = date_utilities.indexical_today();
    SubLObject interpretation_mt = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $term_learner_sub_source_creation_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( user, thread );
        final SubLObject interp_mts = ask_utilities.query_variable( $sym429$_MT, ConsesLow.list( $const471$contextOfPCWInterpretation, source, $sym429$_MT, api_control_vars.$the_cyclist$.getDynamicValue( thread ),
            date ), $const64$InferencePSC, $list554 );
        if( NIL != interp_mts )
        {
          interpretation_mt = interp_mts.first();
        }
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
      if( NIL == interpretation_mt || NIL != $term_learner_assert_redundant_mt_info$.getDynamicValue( thread ) )
      {
        interpretation_mt = ConsesLow.list( $const559$ContextOfPCWInterpretationFn, source, user, date );
        rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const471$contextOfPCWInterpretation, source, interpretation_mt, user, date ), term_learner_source_documentation_mt(), T, T );
        rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const569$genlMt, interpretation_mt, ConsesLow.list( $const556$ContextOfPCWFn, source ) ), term_learner_source_documentation_mt(), T, T );
        rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const555$mtSpindleMember, $source_spindle$.getDynamicValue( thread ), interpretation_mt ), term_learner_source_documentation_mt(), T, T );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $term_learner_sub_source_creation_lock$.getGlobalValue() );
      }
    }
    return interpretation_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 164850L)
  public static SubLObject get_mts_for_urlXuser(final SubLObject url, final SubLObject title, final SubLObject user)
  {
    final SubLObject document_pcw = find_or_create_base_source_for_url( url, title, UNPROVIDED, UNPROVIDED );
    final SubLObject subworks = ask_utilities.query_variable( $sym571$_SUBWORK, ConsesLow.listS( $const564$subWorks, document_pcw, $list572 ), $const64$InferencePSC, $list554 );
    SubLObject mts = NIL;
    SubLObject cdolist_list_var = ConsesLow.cons( document_pcw, subworks );
    SubLObject subwork = NIL;
    subwork = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      mts = Sequences.cconcatenate( mts, ask_utilities.query_variable( $sym429$_MT, ConsesLow.listS( $const471$contextOfPCWInterpretation, subwork, $sym429$_MT, user, $list573 ), $const64$InferencePSC, $list554 ) );
      cdolist_list_var = cdolist_list_var.rest();
      subwork = cdolist_list_var.first();
    }
    return mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 165525L)
  public static SubLObject get_mts_for_user(final SubLObject user, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = date_utilities.universal_date_to_cycl_date( numeric_date_utilities.today() );
    }
    return ask_utilities.query_variable( $sym429$_MT, ConsesLow.list( $const471$contextOfPCWInterpretation, $sym574$_WORK, $sym429$_MT, user, date ), $const64$InferencePSC, $list554 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 165746L)
  public static SubLObject clear_mts_for_user(final SubLObject user, SubLObject date)
  {
    if( date == UNPROVIDED )
    {
      date = date_utilities.universal_date_to_cycl_date( numeric_date_utilities.today() );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym575$CLEAR_MTS_FOR_USER, user, date ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym575$CLEAR_MTS_FOR_USER, user, date ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    return clear_contents_from_mts( get_mts_for_user( user, date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 166144L)
  public static SubLObject clear_mts_for_urlXuser(final SubLObject url, final SubLObject title, final SubLObject user)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym576$CLEAR_MTS_FOR_URL_USER, url, title, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym576$CLEAR_MTS_FOR_URL_USER, url, title, user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject mts = get_mts_for_urlXuser( url, title, user );
    return clear_contents_from_mts( mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 166741L)
  public static SubLObject clear_contents_from_mts(final SubLObject mts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$93 = ask_utilities.query_variable( $kw324$TERM, ConsesLow.list( $const210$termDependsOn, $kw324$TERM, mt ), $const64$InferencePSC, UNPROVIDED );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$93.first();
      while ( NIL != cdolist_list_var_$93)
      {
        if( NIL != forts.fort_p( v_term ) )
        {
          ke.ke_kill_now( v_term );
        }
        cdolist_list_var_$93 = cdolist_list_var_$93.rest();
        v_term = cdolist_list_var_$93.first();
      }
      final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( mt );
      if( pcase_var.eql( $kw577$MT ) )
      {
        if( NIL != kb_mapping_macros.do_mt_index_key_validator( mt, NIL ) )
        {
          final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( mt );
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( v_assert ) );
              if( NIL != valid )
              {
                final SubLObject sentence = assertions_high.assertion_formula( v_assert );
                final SubLObject stack = stacks.create_stack();
                SubLObject sentence_term = NIL;
                stacks.stack_push( sentence, stack );
                while ( NIL == stacks.stack_empty_p( stack ))
                {
                  final SubLObject entry = sentence_term = stacks.stack_pop( stack );
                  if( NIL != forts.fort_p( narts_high.nart_substitute( sentence_term ) ) )
                  {
                    SubLObject ignore_errors_tag = NIL;
                    try
                    {
                      thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
                      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
                        try
                        {
                          fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence( sentence_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw40$IGNORE_ERRORS_TARGET );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                  }
                  SubLObject cdolist_list_var_$94 = cycl_utilities.formula_args( entry, UNPROVIDED );
                  SubLObject arg = NIL;
                  arg = cdolist_list_var_$94.first();
                  while ( NIL != cdolist_list_var_$94)
                  {
                    stacks.stack_push( arg, stack );
                    cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                    arg = cdolist_list_var_$94.first();
                  }
                }
                ke.ke_unassert_assertion_now( v_assert );
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw578$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( mt, NIL ) )
      {
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str579$do_broad_mt_index;
        final SubLObject total = id_index.id_index_count( idx );
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp( mess ) : mess;
        final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( mess );
            final SubLObject idx_$95 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$95, $kw580$SKIP ) )
            {
              final SubLObject idx_$96 = idx_$95;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$96, $kw580$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$96 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject a_id;
                SubLObject a_handle;
                SubLObject v_assert2;
                SubLObject sentence2;
                SubLObject stack2;
                SubLObject sentence_term2;
                SubLObject entry2;
                SubLObject ignore_errors_tag2;
                SubLObject _prev_bind_0_$97;
                SubLObject cdolist_list_var_$95;
                SubLObject arg2;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  a_handle = Vectors.aref( vector_var, a_id );
                  if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw580$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                    {
                      a_handle = $kw580$SKIP;
                    }
                    v_assert2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                    if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( v_assert2, mt, NIL, NIL ) )
                    {
                      sentence2 = assertions_high.assertion_formula( v_assert2 );
                      stack2 = stacks.create_stack();
                      sentence_term2 = NIL;
                      stacks.stack_push( sentence2, stack2 );
                      while ( NIL == stacks.stack_empty_p( stack2 ))
                      {
                        entry2 = ( sentence_term2 = stacks.stack_pop( stack2 ) );
                        if( NIL != forts.fort_p( narts_high.nart_substitute( sentence_term2 ) ) )
                        {
                          ignore_errors_tag2 = NIL;
                          try
                          {
                            thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
                            _prev_bind_0_$97 = Errors.$error_handler$.currentBinding( thread );
                            try
                            {
                              Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
                              try
                              {
                                fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence( sentence_term2, sentence2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              catch( final Throwable catch_var2 )
                              {
                                Errors.handleThrowable( catch_var2, NIL );
                              }
                            }
                            finally
                            {
                              Errors.$error_handler$.rebind( _prev_bind_0_$97, thread );
                            }
                          }
                          catch( final Throwable ccatch_env_var2 )
                          {
                            ignore_errors_tag2 = Errors.handleThrowable( ccatch_env_var2, $kw40$IGNORE_ERRORS_TARGET );
                          }
                          finally
                          {
                            thread.throwStack.pop();
                          }
                        }
                        cdolist_list_var_$95 = cycl_utilities.formula_args( entry2, UNPROVIDED );
                        arg2 = NIL;
                        arg2 = cdolist_list_var_$95.first();
                        while ( NIL != cdolist_list_var_$95)
                        {
                          stacks.stack_push( arg2, stack2 );
                          cdolist_list_var_$95 = cdolist_list_var_$95.rest();
                          arg2 = cdolist_list_var_$95.first();
                        }
                      }
                      ke.ke_unassert_assertion_now( v_assert2 );
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
              final SubLObject idx_$97 = idx_$95;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$97 ) || NIL == id_index.id_index_skip_tombstones_p( $kw580$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$97 );
                SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$97 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$97 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw580$SKIP ) ) ? NIL : $kw580$SKIP;
                while ( a_id2.numL( end_id ))
                {
                  final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw580$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                  {
                    final SubLObject v_assert3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                    if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( v_assert3, mt, NIL, NIL ) )
                    {
                      final SubLObject sentence3 = assertions_high.assertion_formula( v_assert3 );
                      final SubLObject stack3 = stacks.create_stack();
                      SubLObject sentence_term3 = NIL;
                      stacks.stack_push( sentence3, stack3 );
                      while ( NIL == stacks.stack_empty_p( stack3 ))
                      {
                        final SubLObject entry3 = sentence_term3 = stacks.stack_pop( stack3 );
                        if( NIL != forts.fort_p( narts_high.nart_substitute( sentence_term3 ) ) )
                        {
                          SubLObject ignore_errors_tag3 = NIL;
                          try
                          {
                            thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
                            final SubLObject _prev_bind_0_$98 = Errors.$error_handler$.currentBinding( thread );
                            try
                            {
                              Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
                              try
                              {
                                fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence( sentence_term3, sentence3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              catch( final Throwable catch_var3 )
                              {
                                Errors.handleThrowable( catch_var3, NIL );
                              }
                            }
                            finally
                            {
                              Errors.$error_handler$.rebind( _prev_bind_0_$98, thread );
                            }
                          }
                          catch( final Throwable ccatch_env_var3 )
                          {
                            ignore_errors_tag3 = Errors.handleThrowable( ccatch_env_var3, $kw40$IGNORE_ERRORS_TARGET );
                          }
                          finally
                          {
                            thread.throwStack.pop();
                          }
                        }
                        SubLObject cdolist_list_var_$96 = cycl_utilities.formula_args( entry3, UNPROVIDED );
                        SubLObject arg3 = NIL;
                        arg3 = cdolist_list_var_$96.first();
                        while ( NIL != cdolist_list_var_$96)
                        {
                          stacks.stack_push( arg3, stack3 );
                          cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                          arg3 = cdolist_list_var_$96.first();
                        }
                      }
                      ke.ke_unassert_assertion_now( v_assert3 );
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                  a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$99, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_6, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_5, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_4, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_3, thread );
        }
      }
      final SubLObject assertiondependson = constants_high.find_constant( $str581$assertionDependsOn );
      if( NIL != constant_handles.valid_constant( assertiondependson, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$97 = ask_utilities.query_variable( $kw190$ASSERT, ConsesLow.list( assertiondependson, $kw190$ASSERT, mt ), $const64$InferencePSC, $list554 );
        SubLObject v_assert4 = NIL;
        v_assert4 = cdolist_list_var_$97.first();
        while ( NIL != cdolist_list_var_$97)
        {
          final SubLObject sentence4 = assertions_high.assertion_formula( v_assert4 );
          final SubLObject stack4 = stacks.create_stack();
          SubLObject sentence_term4 = NIL;
          stacks.stack_push( sentence4, stack4 );
          while ( NIL == stacks.stack_empty_p( stack4 ))
          {
            final SubLObject entry4 = sentence_term4 = stacks.stack_pop( stack4 );
            if( NIL != forts.fort_p( narts_high.nart_substitute( sentence_term4 ) ) )
            {
              SubLObject ignore_errors_tag4 = NIL;
              try
              {
                thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
                final SubLObject _prev_bind_7 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
                  try
                  {
                    fact_sheets.update_fact_sheet_data_for_term_and_removed_sentence( sentence_term4, sentence4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  catch( final Throwable catch_var4 )
                  {
                    Errors.handleThrowable( catch_var4, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_7, thread );
                }
              }
              catch( final Throwable ccatch_env_var4 )
              {
                ignore_errors_tag4 = Errors.handleThrowable( ccatch_env_var4, $kw40$IGNORE_ERRORS_TARGET );
              }
              finally
              {
                thread.throwStack.pop();
              }
            }
            SubLObject cdolist_list_var_$98 = cycl_utilities.formula_args( entry4, UNPROVIDED );
            SubLObject arg4 = NIL;
            arg4 = cdolist_list_var_$98.first();
            while ( NIL != cdolist_list_var_$98)
            {
              stacks.stack_push( arg4, stack4 );
              cdolist_list_var_$98 = cdolist_list_var_$98.rest();
              arg4 = cdolist_list_var_$98.first();
            }
          }
          ke.ke_unassert_assertion_now( v_assert4 );
          cdolist_list_var_$97 = cdolist_list_var_$97.rest();
          v_assert4 = cdolist_list_var_$97.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    cdolist_list_var = ask_utilities.query_variable( $kw324$TERM, $list582, $const64$InferencePSC, UNPROVIDED );
    SubLObject v_term2 = NIL;
    v_term2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.fort_p( v_term2 ) )
      {
        ke.ke_kill_now( v_term2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term2 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 168087L)
  public static SubLObject cyclist_fort(final SubLObject string)
  {
    final SubLObject v_forts = cb_frames.terms_for_browsing( string, UNPROVIDED, UNPROVIDED );
    final SubLObject cyclists = list_utilities.remove_if_not( $sym584$HUMAN_CYCLIST_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return cyclists.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 168259L)
  public static SubLObject term_learner_ordered_types_for_term_in_document_string(final SubLObject doc_string, final SubLObject v_term, final SubLObject placeholderP, SubLObject lookup_onlyP, SubLObject lexicon)
  {
    if( lookup_onlyP == UNPROVIDED )
    {
      lookup_onlyP = $term_learner_use_lexical_lookup_only$.getGlobalValue();
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon( UNPROVIDED );
    }
    return term_learner_ordered_types_for_term_in_document( document.new_document( doc_string, UNPROVIDED, UNPROVIDED ), v_term, placeholderP, lookup_onlyP, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 168714L)
  public static SubLObject term_learner_ordered_types_for_term_in_document(final SubLObject doc, final SubLObject v_term, final SubLObject placeholderP, final SubLObject lookup_onlyP, final SubLObject lexicon)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject timed_outP = NIL;
    final SubLObject _prev_bind_0 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding( thread );
    final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_reachedP$.currentBinding( thread );
    try
    {
      parsing_macros.$parsing_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
      parsing_macros.$parsing_timeout_time$.bind( parsing_macros.parsing_compute_timeout_time( TEN_INTEGER ), thread );
      parsing_macros.$parsing_timeout_reachedP$.bind( parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ), thread );
      parsing_macros.$parsing_timeout_reachedP$.setDynamicValue( parsing_macros.parsing_timeout_time_reachedP(), thread );
      if( NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ) )
      {
        thread.resetMultipleValues();
        final SubLObject types = term_learner_types_for_term_in_document( doc, v_term, placeholderP, lookup_onlyP, lexicon );
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = Sequences.cconcatenate( result, term_learner_types_from_types_and_justifications( v_term, doc, types, justifications ) );
      }
      timed_outP = parsing_macros.parsing_timeout_time_reachedP();
    }
    finally
    {
      parsing_macros.$parsing_timeout_reachedP$.rebind( _prev_bind_3, thread );
      parsing_macros.$parsing_timeout_time$.rebind( _prev_bind_2, thread );
      parsing_macros.$parsing_timeout_time_check_count$.rebind( _prev_bind_0, thread );
    }
    if( NIL != timed_outP && NIL == lookup_onlyP )
    {
      thread.resetMultipleValues();
      final SubLObject types2 = term_learner_types_for_term_in_document( doc, v_term, placeholderP, T, lexicon );
      final SubLObject justifications2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = Sequences.cconcatenate( result, term_learner_types_from_types_and_justifications( v_term, doc, types2, justifications2 ) );
    }
    return Sort.sort( result, $sym77$_, $sym78$GET_WEIGHT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 169880L)
  public static SubLObject term_learner_types_from_types_and_justifications(final SubLObject v_term, final SubLObject doc, final SubLObject types, final SubLObject justifications)
  {
    SubLObject term_learner_types = NIL;
    final SubLObject nl_strings = term_learner_cycl_terms_to_nl_strings( types, UNPROVIDED, UNPROVIDED );
    SubLObject type = NIL;
    SubLObject type_$105 = NIL;
    SubLObject justification = NIL;
    SubLObject justification_$106 = NIL;
    SubLObject nl_string = NIL;
    SubLObject nl_string_$107 = NIL;
    type = types;
    type_$105 = type.first();
    justification = justifications;
    justification_$106 = justification.first();
    nl_string = nl_strings;
    nl_string_$107 = nl_string.first();
    while ( NIL != nl_string || NIL != justification || NIL != type)
    {
      final SubLObject isa_genls = ( NIL != ner_justificationP( justification_$106 ) || NIL != term_learner_create_as_individualP( v_term, doc, UNPROVIDED ) ) ? $kw143$ISA : $kw141$GENLS;
      final SubLObject weight = data_parser.term_log_idf_from_kb( type_$105 );
      final SubLObject basic_sentence = ConsesLow.list( ( isa_genls == $kw143$ISA ) ? $const55$isa : $const76$genls, $kw324$TERM, type_$105 );
      final SubLObject assert_sentence = ( NIL != constant_handles.valid_constantP( $const535$termExpansionExpected, UNPROVIDED ) && NIL != cycl_grammar.cycl_nat_p( type_$105 ) ) ? ConsesLow.list( $const60$and, ConsesLow
          .list( $const535$termExpansionExpected, type_$105 ), basic_sentence ) : basic_sentence;
      term_learner_types = ConsesLow.cons( new_term_learner_single_justification_type( type_$105, weight, justification_$106, nl_string_$107, assert_sentence, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
          term_learner_types );
      type = type.rest();
      type_$105 = type.first();
      justification = justification.rest();
      justification_$106 = justification.first();
      nl_string = nl_string.rest();
      nl_string_$107 = nl_string.first();
    }
    return term_learner_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171178L)
  public static SubLObject get_weight(final SubLObject list)
  {
    return conses_high.getf( list, $kw118$WEIGHT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171283L)
  public static SubLObject get_cycls(final SubLObject list)
  {
    SubLObject cycls = NIL;
    SubLObject cdolist_list_var = conses_high.getf( list, $kw344$TYPES, UNPROVIDED );
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.getf( type, $kw117$CYCL, UNPROVIDED ) )
      {
        cycls = ConsesLow.cons( conses_high.getf( type, $kw117$CYCL, UNPROVIDED ), cycls );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return cycls;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171458L)
  public static SubLObject get_cycl(final SubLObject list)
  {
    SubLObject cdolist_list_var = conses_high.getf( list, $kw344$TYPES, UNPROVIDED );
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != conses_high.getf( type, $kw117$CYCL, UNPROVIDED ) )
      {
        return conses_high.getf( type, $kw117$CYCL, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171603L)
  public static SubLObject ner_justificationP(final SubLObject justification)
  {
    return makeBoolean( NIL != term_learner_justification_p( justification ) && NIL != conses_high.member( term_learner_justification_tool( justification ), $list588, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 171816L)
  public static SubLObject term_learner_types_for_term_in_document(final SubLObject doc, final SubLObject v_term, final SubLObject placeholderP, SubLObject lookup_onlyP, SubLObject lexicon)
  {
    if( lookup_onlyP == UNPROVIDED )
    {
      lookup_onlyP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject types = NIL;
    SubLObject def_strings = NIL;
    final SubLObject current_state = memoization_state.current_memoization_state();
    final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding( thread );
    try
    {
      lexicon_macros.$lexicon_memoization_state$.bind( ( NIL != current_state ) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread );
      final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$108 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          SubLObject cdolist_list_var = term_learner_relevant_sentences_from_document( doc, v_term );
          SubLObject sentence = NIL;
          sentence = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            thread.resetMultipleValues();
            final SubLObject sentence_types = term_learner_collections_for_term_in_sentence( document.sentence_string( sentence ), v_term, placeholderP, lookup_onlyP, lexicon );
            final SubLObject strings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject sentence_type = NIL;
            SubLObject sentence_type_$109 = NIL;
            SubLObject string = NIL;
            SubLObject string_$110 = NIL;
            sentence_type = sentence_types;
            sentence_type_$109 = sentence_type.first();
            string = strings;
            string_$110 = string.first();
            while ( NIL != string || NIL != sentence_type)
            {
              if( NIL == subl_promotions.memberP( sentence_type_$109, types, EQUAL, UNPROVIDED ) )
              {
                types = ConsesLow.cons( sentence_type_$109, types );
                def_strings = ConsesLow.cons( string_$110, def_strings );
              }
              sentence_type = sentence_type.rest();
              sentence_type_$109 = sentence_type.first();
              string = string.rest();
              string_$110 = string.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$109, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$108, thread );
      }
    }
    finally
    {
      lexicon_macros.$lexicon_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( types, def_strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 172483L)
  public static SubLObject term_learner_collections_for_term_in_sentence(final SubLObject sentence, final SubLObject v_term, SubLObject placeholderP, SubLObject lookup_onlyP, SubLObject lexicon)
  {
    if( placeholderP == UNPROVIDED )
    {
      placeholderP = T;
    }
    if( lookup_onlyP == UNPROVIDED )
    {
      lookup_onlyP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ner = object.new_class_instance( $sym589$STANFORD_NER );
    final SubLObject entity_clusters = methods.funcall_instance_method_with_1_args( ner, $sym590$RUN, sentence );
    SubLObject collections = NIL;
    SubLObject definitions = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = matching_named_entities( entity_clusters, v_term, sentence, NIL, lexicon );
        SubLObject named_entity = NIL;
        named_entity = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject type = methods.funcall_instance_method_with_0_args( named_entity, $sym591$GET_CYC );
          final SubLObject string = methods.funcall_instance_method_with_0_args( named_entity, $sym592$GET_STRING );
          final SubLObject _prev_bind_0_$112 = parsing_vars.$psp_concept_filters$.currentBinding( thread );
          try
          {
            parsing_vars.$psp_concept_filters$.bind( ConsesLow.list( $list593, ( NIL != constant_handles.valid_constant( $const594$PredicateTaxonomy, UNPROVIDED ) ) ? $list595 : NIL ), thread );
            if( NIL != placeholderP || !type.eql( $const38$Thing ) )
            {
              collections = ConsesLow.cons( type, collections );
              definitions = ConsesLow.cons( new_term_learner_justification( string, sentence, $kw596$STANFORD_NER, UNPROVIDED, UNPROVIDED ), definitions );
            }
            SubLObject cdolist_list_var_$113;
            final SubLObject tighter_types_n_strings = cdolist_list_var_$113 = list_utilities.cartesian_product( methods.funcall_instance_method_with_2_args( named_entity, $sym597$TIGHTEN_TYPE, NIL, lookup_onlyP ),
                UNPROVIDED, UNPROVIDED, UNPROVIDED );
            SubLObject type_and_string = NIL;
            type_and_string = cdolist_list_var_$113.first();
            while ( NIL != cdolist_list_var_$113)
            {
              collections = ConsesLow.cons( type_and_string.first(), collections );
              definitions = ConsesLow.cons( new_term_learner_justification( conses_high.second( type_and_string ), sentence, $kw598$STANFORD_NER_PSP, UNPROVIDED, UNPROVIDED ), definitions );
              cdolist_list_var_$113 = cdolist_list_var_$113.rest();
              type_and_string = cdolist_list_var_$113.first();
            }
          }
          finally
          {
            parsing_vars.$psp_concept_filters$.rebind( _prev_bind_0_$112, thread );
          }
          cdolist_list_var = cdolist_list_var.rest();
          named_entity = cdolist_list_var.first();
        }
        if( NIL == collections )
        {
          cdolist_list_var = matching_named_entities( entity_clusters, v_term, sentence, T, UNPROVIDED );
          named_entity = NIL;
          named_entity = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject type = methods.funcall_instance_method_with_0_args( named_entity, $sym591$GET_CYC );
            final SubLObject string = methods.funcall_instance_method_with_0_args( named_entity, $sym592$GET_STRING );
            final SubLObject _prev_bind_0_$113 = parsing_vars.$psp_concept_filters$.currentBinding( thread );
            try
            {
              parsing_vars.$psp_concept_filters$.bind( $list599, thread );
              if( NIL != placeholderP || !type.eql( $const38$Thing ) )
              {
                collections = ConsesLow.cons( type, collections );
                definitions = ConsesLow.cons( new_term_learner_justification( string, sentence, $kw97$USER, UNPROVIDED, UNPROVIDED ), definitions );
              }
              SubLObject cdolist_list_var_$114;
              final SubLObject tighter_types_n_strings = cdolist_list_var_$114 = list_utilities.cartesian_product( methods.funcall_instance_method_with_2_args( named_entity, $sym597$TIGHTEN_TYPE, NIL, lookup_onlyP ),
                  UNPROVIDED, UNPROVIDED, UNPROVIDED );
              SubLObject type_and_string = NIL;
              type_and_string = cdolist_list_var_$114.first();
              while ( NIL != cdolist_list_var_$114)
              {
                collections = ConsesLow.cons( type_and_string.first(), collections );
                definitions = ConsesLow.cons( new_term_learner_justification( conses_high.second( type_and_string ), sentence, $kw97$USER, UNPROVIDED, UNPROVIDED ), definitions );
                cdolist_list_var_$114 = cdolist_list_var_$114.rest();
                type_and_string = cdolist_list_var_$114.first();
              }
            }
            finally
            {
              parsing_vars.$psp_concept_filters$.rebind( _prev_bind_0_$113, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            named_entity = cdolist_list_var.first();
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Values.values( collections, definitions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 175321L)
  public static SubLObject matching_named_entities(final SubLObject entity_clusters, final SubLObject term_string, final SubLObject context_string, SubLObject create_if_noneP, SubLObject lexicon)
  {
    if( create_if_noneP == UNPROVIDED )
    {
      create_if_noneP = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    SubLObject matches = NIL;
    SubLObject cdolist_list_var = entity_clusters;
    SubLObject entity_cluster = NIL;
    entity_cluster = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$117 = entity_cluster;
      SubLObject named_entity = NIL;
      named_entity = cdolist_list_var_$117.first();
      while ( NIL != cdolist_list_var_$117)
      {
        if( !$sym600$O.eql( methods.funcall_instance_method_with_0_args( named_entity, $sym601$GET_TYPE ) ) && term_string.equal( methods.funcall_instance_method_with_0_args( named_entity, $sym592$GET_STRING ) ) )
        {
          matches = ConsesLow.cons( named_entity, matches );
        }
        cdolist_list_var_$117 = cdolist_list_var_$117.rest();
        named_entity = cdolist_list_var_$117.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      entity_cluster = cdolist_list_var.first();
    }
    if( NIL != create_if_noneP && NIL == matches )
    {
      final SubLObject contextualized_ne = named_entity_recognizer.new_contextualized_named_entity( term_string, $kw602$THING, $kw97$USER, context_string, NIL, NIL, $const38$Thing );
      matches = ConsesLow.cons( contextualized_ne, matches );
    }
    return matches;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176161L)
  public static SubLObject clear_term_learner_type_prompt()
  {
    final SubLObject cs = $term_learner_type_prompt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176161L)
  public static SubLObject remove_term_learner_type_prompt(final SubLObject concept)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_type_prompt_caching_state$.getGlobalValue(), ConsesLow.list( concept ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176161L)
  public static SubLObject term_learner_type_prompt_internal(SubLObject concept)
  {
    concept = narts_high.nart_substitute( concept );
    if( NIL != lexification_utilities.unlexifiedP( concept, NIL ) )
    {
      return NIL;
    }
    final SubLObject pred = ( NIL != kb_accessors.individualP( concept ) ) ? $const55$isa : $const76$genls;
    final SubLObject cycl_sentence = ConsesLow.listS( pred, concept, $list604 );
    final SubLObject raw_sentence = term_learner_cycl_term_to_nl_string( cycl_sentence, UNPROVIDED ).first();
    final SubLObject final_cat = conses_high.last( string_utilities.search_all( $str605$cat, raw_sentence, UNPROVIDED, UNPROVIDED ), UNPROVIDED ).first();
    final SubLObject prompt = Sequences.cconcatenate( Sequences.subseq( raw_sentence, ZERO_INTEGER, Numbers.subtract( final_cat, ONE_INTEGER ) ), $str606$_ );
    return prompt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176161L)
  public static SubLObject term_learner_type_prompt(final SubLObject concept)
  {
    SubLObject caching_state = $term_learner_type_prompt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym603$TERM_LEARNER_TYPE_PROMPT, $sym607$_TERM_LEARNER_TYPE_PROMPT_CACHING_STATE_, $int318$100, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, concept, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_type_prompt_internal( concept ) ) );
      memoization_state.caching_state_put( caching_state, concept, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176670L)
  public static SubLObject clear_term_learner_term_header_string()
  {
    final SubLObject cs = $term_learner_term_header_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176670L)
  public static SubLObject remove_term_learner_term_header_string(final SubLObject concept, SubLObject max_alts)
  {
    if( max_alts == UNPROVIDED )
    {
      max_alts = THREE_INTEGER;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_term_header_string_caching_state$.getGlobalValue(), ConsesLow.list( concept, max_alts ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176670L)
  public static SubLObject term_learner_term_header_string_internal(SubLObject concept, final SubLObject max_alts)
  {
    concept = narts_high.nart_substitute( concept );
    if( NIL != forts.fort_p( lexification_utilities.unlexifiedP( concept, UNPROVIDED ) ) )
    {
      return NIL;
    }
    final SubLObject phrases = term_learner_alternative_phrases( concept, Numbers.add( TWO_INTEGER, max_alts ) );
    final SubLObject first_phrase = phrases.first();
    final SubLObject aka = list_utilities.first_n( max_alts, phrases.rest() );
    final SubLObject moreP = list_utilities.lengthG( phrases, Numbers.add( ONE_INTEGER, max_alts ), UNPROVIDED );
    final SubLObject result = first_phrase;
    SubLObject sub_header = NIL;
    if( NIL != aka )
    {
      sub_header = aka;
      if( NIL != moreP )
      {
        sub_header = list_utilities.snoc( $str65$___, sub_header );
      }
    }
    return ConsesLow.list( result, sub_header );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 176670L)
  public static SubLObject term_learner_term_header_string(final SubLObject concept, SubLObject max_alts)
  {
    if( max_alts == UNPROVIDED )
    {
      max_alts = THREE_INTEGER;
    }
    SubLObject caching_state = $term_learner_term_header_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym608$TERM_LEARNER_TERM_HEADER_STRING, $sym609$_TERM_LEARNER_TERM_HEADER_STRING_CACHING_STATE_, $int610$5000, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym611$CLEAR_TERM_LEARNER_TERM_HEADER_STRING );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( concept, max_alts );
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
        if( concept.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && max_alts.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_term_header_string_internal( concept, max_alts ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( concept, max_alts ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 177325L)
  public static SubLObject term_learner_alternative_phrases(final SubLObject v_term, SubLObject max_count)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = number_utilities.positive_infinity();
    }
    final SubLObject params_$118;
    final SubLObject params = params_$118 = nl_generation_api.new_pph_parameters( UNPROVIDED );
    pph_parameter_declarations.set_pph_generation_count_internal( params_$118, max_count );
    final SubLObject params_$119 = params;
    pph_parameter_declarations.set_pph_lexical_context_internal( params_$119, cure_default_generation_mt( UNPROVIDED ) );
    final SubLObject params_$120 = params;
    pph_parameter_declarations.set_demerit_cutoff_internal( params_$120, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue() );
    return nl_generation_api.cycl_term_to_nl_string_internal( v_term, params );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 177703L)
  public static SubLObject clear_term_learner_lexical_caches()
  {
    clear_term_learner_term_header_string();
    clear_term_learner_type_prompt();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 177847L)
  public static SubLObject term_learner_lexify_from_termstrings(final SubLObject focal_term, final SubLObject lexical_mt, final SubLObject mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject term_strings_strings = cdolist_list_var = ask_utilities.query_variable( $sym72$_STRING, ConsesLow.list( $const61$ist_Asserted, lexical_mt, ConsesLow.listS( $const59$termStrings, focal_term,
        $list74 ) ), lexical_mt, UNPROVIDED );
    SubLObject term_string = NIL;
    term_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ke.ke_unassert( ConsesLow.list( $const59$termStrings, focal_term, term_string ), lexical_mt );
      term_learner_assert_lexical_info( focal_term, term_string, mt, lexical_mt, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      term_string = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 178280L)
  public static SubLObject term_learner_assert_lexical_info(final SubLObject cycl_term, final SubLObject string, SubLObject mt, final SubLObject lexical_mt, SubLObject lexical_sentence)
  {
    if( lexical_sentence == UNPROVIDED )
    {
      lexical_sentence = NIL;
    }
    clear_term_learner_lexical_caches();
    cure_remove_from_default_lexicon( cycl_term, string );
    methods.funcall_instance_method_with_1_args( document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym613$DELETE, string );
    mt = ensure_is_hlmt_p_nart( mt );
    if( NIL != string_utilities.non_empty_cycl_stringP( string ) && NIL == subl_promotions.memberP( cycl_term, term_lexicon.denots_for_term_lexicon_entries( methods.funcall_instance_method_with_1_args(
        document_annotation_widgets.get_default_document_ingester_annotation_learning_lexicon( UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym34$GET, string ) ), UNPROVIDED, UNPROVIDED ) )
    {
      if( NIL == lexical_sentence )
      {
        lexical_sentence = auto_lexifier.auto_lexify( string, cycl_term, lexical_mt, mt ).first();
      }
      final SubLObject ret_value = rkf_assertion_utilities.rkf_assert_with_implicature( lexical_sentence, lexical_mt, $kw614$NOW );
      final SubLObject lexical_assert = ConsesLow.list( $const615$ist, lexical_mt, lexical_sentence );
      rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const616$assertionDependsOn, lexical_assert, mt ), $const54$BaseKB, UNPROVIDED, UNPROVIDED );
      return ret_value;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179175L)
  public static SubLObject default_task_for_user(final SubLObject user)
  {
    return default_task_for_user_int( user );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179296L)
  public static SubLObject clear_default_task_for_user_int()
  {
    final SubLObject cs = $default_task_for_user_int_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179296L)
  public static SubLObject remove_default_task_for_user_int(final SubLObject user)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $default_task_for_user_int_caching_state$.getGlobalValue(), ConsesLow.list( user ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179296L)
  public static SubLObject default_task_for_user_int_internal(final SubLObject user)
  {
    final SubLObject kb_value = ask_utilities.query_variable( $sym540$_TASK, ConsesLow.list( $const619$defaultTask, $sym540$_TASK, user ), $const64$InferencePSC, $list115 ).first();
    final SubLObject v_default = $const620$GeneralCycKETask_Allotment;
    return ( NIL != kb_value ) ? kb_value : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179296L)
  public static SubLObject default_task_for_user_int(final SubLObject user)
  {
    SubLObject caching_state = $default_task_for_user_int_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym618$DEFAULT_TASK_FOR_USER_INT, $sym621$_DEFAULT_TASK_FOR_USER_INT_CACHING_STATE_, SIXTEEN_INTEGER, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym622$CLEAR_DEFAULT_TASK_FOR_USER_INT );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, user, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( default_task_for_user_int_internal( user ) ) );
      memoization_state.caching_state_put( caching_state, user, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179639L)
  public static SubLObject clear_query_mt_for_task()
  {
    final SubLObject cs = $query_mt_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179639L)
  public static SubLObject remove_query_mt_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_mt_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179639L)
  public static SubLObject query_mt_for_task_internal(final SubLObject task)
  {
    return cae_query_search.cae_default_query_mt( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179639L)
  public static SubLObject query_mt_for_task(final SubLObject task)
  {
    SubLObject caching_state = $query_mt_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym623$QUERY_MT_FOR_TASK, $sym624$_QUERY_MT_FOR_TASK_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym625$CLEAR_QUERY_MT_FOR_TASK );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_mt_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179757L)
  public static SubLObject clear_wff_checking_mt_for_task()
  {
    final SubLObject cs = $wff_checking_mt_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179757L)
  public static SubLObject remove_wff_checking_mt_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wff_checking_mt_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179757L)
  public static SubLObject wff_checking_mt_for_task_internal(final SubLObject task)
  {
    return cae_query_search.cae_default_wff_checking_mt( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179757L)
  public static SubLObject wff_checking_mt_for_task(final SubLObject task)
  {
    SubLObject caching_state = $wff_checking_mt_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym626$WFF_CHECKING_MT_FOR_TASK, $sym627$_WFF_CHECKING_MT_FOR_TASK_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym628$CLEAR_WFF_CHECKING_MT_FOR_TASK );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wff_checking_mt_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179889L)
  public static SubLObject clear_query_mt_for_user_and_task()
  {
    final SubLObject cs = $query_mt_for_user_and_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179889L)
  public static SubLObject remove_query_mt_for_user_and_task(final SubLObject user, final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_mt_for_user_and_task_caching_state$.getGlobalValue(), ConsesLow.list( user, task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179889L)
  public static SubLObject query_mt_for_user_and_task_internal(final SubLObject user, SubLObject task)
  {
    if( NIL == task )
    {
      task = default_task_for_user( user );
    }
    return query_mt_for_task( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 179889L)
  public static SubLObject query_mt_for_user_and_task(final SubLObject user, final SubLObject task)
  {
    SubLObject caching_state = $query_mt_for_user_and_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym629$QUERY_MT_FOR_USER_AND_TASK, $sym630$_QUERY_MT_FOR_USER_AND_TASK_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym631$CLEAR_QUERY_MT_FOR_USER_AND_TASK );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( user, task );
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
        if( user.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && task.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_mt_for_user_and_task_internal( user, task ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( user, task ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180078L)
  public static SubLObject clear_wff_checking_mt_for_user_and_task()
  {
    final SubLObject cs = $wff_checking_mt_for_user_and_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180078L)
  public static SubLObject remove_wff_checking_mt_for_user_and_task(final SubLObject user, final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $wff_checking_mt_for_user_and_task_caching_state$.getGlobalValue(), ConsesLow.list( user, task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180078L)
  public static SubLObject wff_checking_mt_for_user_and_task_internal(final SubLObject user, SubLObject task)
  {
    if( NIL == task )
    {
      task = default_task_for_user( user );
    }
    return wff_checking_mt_for_task( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180078L)
  public static SubLObject wff_checking_mt_for_user_and_task(final SubLObject user, final SubLObject task)
  {
    SubLObject caching_state = $wff_checking_mt_for_user_and_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym632$WFF_CHECKING_MT_FOR_USER_AND_TASK, $sym633$_WFF_CHECKING_MT_FOR_USER_AND_TASK_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym634$CLEAR_WFF_CHECKING_MT_FOR_USER_AND_TASK );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( user, task );
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
        if( user.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && task.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( wff_checking_mt_for_user_and_task_internal( user, task ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( user, task ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180280L)
  public static SubLObject parsing_mt_for_task(final SubLObject task)
  {
    return query_library_utils.cae_default_parsing_mt( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180365L)
  public static SubLObject xml_output_term_types(final SubLObject types)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str635$types, NIL, NIL, NIL, $kw177$UNINITIALIZED );
        final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
          SubLObject cdolist_list_var = types;
          SubLObject type = NIL;
          type = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( conses_high.getf( type, $kw350$CATEGORY, $kw636$NOT_FOUND ) == $kw636$NOT_FOUND )
            {
              xml_output_term_type( type );
            }
            else
            {
              final SubLObject category_label = conses_high.getf( type, $kw351$CATEGORY_NL, $str50$ );
              final SubLObject attrs = ConsesLow.list( $str637$category, string_utilities.to_string( conses_high.getf( type, $kw350$CATEGORY, UNPROVIDED ) ), $str638$categoryNL, category_label );
              try
              {
                final SubLObject _prev_bind_0_$122 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$123 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str639$typeSet, attrs, NIL, NIL, $kw177$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$123 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var_$125 = conses_high.getf( type, $kw344$TYPES, UNPROVIDED );
                    SubLObject real_type = NIL;
                    real_type = cdolist_list_var_$125.first();
                    while ( NIL != cdolist_list_var_$125)
                    {
                      xml_output_term_type( real_type );
                      cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                      real_type = cdolist_list_var_$125.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$123, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$123, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$122, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str639$typeSet );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$124, thread );
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$121, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str635$types );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 180899L)
  public static SubLObject xml_output_term_type(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject attrs = ConsesLow.list( new SubLObject[] { $str640$id, web_utilities.html_url_encode( kb_utilities.compact_hl_external_id_string( conses_high.getf( type, $kw94$ASSERT_SENTENCE, UNPROVIDED ) ),
        UNPROVIDED ), $str641$required, ( NIL != conses_high.getf( type, $kw10$REQUIRED, UNPROVIDED ) ) ? $str335$true : $str642$false, $str643$display, ( NIL != conses_high.getf( type, $kw9$DISPLAY, UNPROVIDED ) )
            ? $str335$true
            : $str642$false, $str644$cyclTerm, web_utilities.html_url_encode( print_high.prin1_to_string( conses_high.getf( type, $kw117$CYCL, UNPROVIDED ) ), UNPROVIDED ), $str332$conceptId, kb_utilities
                .compact_hl_external_id_string( conses_high.getf( type, $kw117$CYCL, UNPROVIDED ) ), $str167$justifications, web_utilities.html_url_encode( print_high.prin1_to_string( conses_high.getf( type,
                    $kw19$JUSTIFICATIONS, UNPROVIDED ) ), UNPROVIDED ), $str645$nlString, web_utilities.html_url_encode( conses_high.getf( type, $kw120$NL_STRING, UNPROVIDED ), UNPROVIDED ), $str646$legendString,
      web_utilities.html_url_encode( conses_high.getf( type, $kw121$LEGEND_STRING, UNPROVIDED ), UNPROVIDED ), $str647$replicationSentenceId, conses_high.getf( type, $kw124$REPLICATION_SENTENCE_ID, UNPROVIDED )
    } );
    if( NIL != conses_high.getf( type, $kw123$STATUS_CODE, UNPROVIDED ) )
    {
      attrs = Sequences.cconcatenate( ConsesLow.list( $str648$statusCode, PrintLow.write_to_string( conses_high.getf( type, $kw123$STATUS_CODE, UNPROVIDED ), EMPTY_SUBL_OBJECT_ARRAY ) ), attrs );
    }
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str649$type, attrs, NIL, NIL, $kw177$UNINITIALIZED );
        final SubLObject _prev_bind_0_$127 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
          xml_output_renderers( conses_high.getf( type, $kw7$RENDERERS, UNPROVIDED ) );
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$127, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str649$type );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 181935L)
  public static SubLObject xml_output_renderers(final SubLObject renderers)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str650$renderers, NIL, NIL, NIL, $kw177$UNINITIALIZED );
        final SubLObject _prev_bind_0_$128 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
          SubLObject cdolist_list_var = renderers;
          SubLObject renderer = NIL;
          renderer = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            xml_output_renderer( renderer );
            cdolist_list_var = cdolist_list_var.rest();
            renderer = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$128, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str650$renderers );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return renderers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 182102L)
  public static SubLObject xml_output_renderer(final SubLObject renderer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str651$renderer, ConsesLow.list( $str649$type, print_high.prin1_to_string( conses_high.getf( renderer, $kw134$RENDERER_TYPE, UNPROVIDED ) ) ), NIL, NIL,
            $kw177$UNINITIALIZED );
        final SubLObject _prev_bind_0_$129 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
          if( NIL != conses_high.getf( renderer, $kw146$ARG_POS, UNPROVIDED ) )
          {
            try
            {
              final SubLObject _prev_bind_0_$130 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$131 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str202$argpos, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                final SubLObject _prev_bind_0_$131 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                  xml_utilities.xml_print( conses_high.getf( renderer, $kw146$ARG_POS, UNPROVIDED ), UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$131, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$131, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$130, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$132 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str202$argpos );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$132, thread );
              }
            }
          }
          if( NIL != conses_high.getf( renderer, $kw67$STRING, UNPROVIDED ) )
          {
            try
            {
              final SubLObject _prev_bind_0_$133 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$132 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str90$string, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                final SubLObject _prev_bind_0_$134 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                  xml_utilities.xml_print( conses_high.getf( renderer, $kw67$STRING, UNPROVIDED ), UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$134, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$132, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$133, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$135 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str90$string );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$135, thread );
              }
            }
          }
          SubLObject cdolist_list_var = conses_high.getf( renderer, $kw137$SELECTION_RENDERERS, UNPROVIDED );
          SubLObject selection_renderer = NIL;
          selection_renderer = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            xml_output_selection_renderer( selection_renderer );
            cdolist_list_var = cdolist_list_var.rest();
            selection_renderer = cdolist_list_var.first();
          }
          cdolist_list_var = conses_high.getf( renderer, $kw144$ISA_CONSTRAINTS, UNPROVIDED );
          SubLObject v_isa = NIL;
          v_isa = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject _prev_bind_0_$136 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$133 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str652$isaConstraint, ConsesLow.list( $str644$cyclTerm, kb_utilities.pretty_print_cycl_to_string( conses_high.getf( v_isa, $kw117$CYCL, UNPROVIDED ), UNPROVIDED ),
                  $str332$conceptId, conses_high.getf( v_isa, $kw119$CONCEPT_ID, UNPROVIDED ) ), T, NIL, $kw177$UNINITIALIZED );
              final SubLObject _prev_bind_0_$137 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$137, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$133, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$136, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
          }
          cdolist_list_var = conses_high.getf( renderer, $kw142$GENLS_CONSTRAINTS, UNPROVIDED );
          SubLObject genl = NIL;
          genl = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject _prev_bind_0_$138 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$134 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str653$genlsConstraint, ConsesLow.list( $str644$cyclTerm, kb_utilities.pretty_print_cycl_to_string( conses_high.getf( genl, $kw117$CYCL, UNPROVIDED ), UNPROVIDED ),
                  $str332$conceptId, conses_high.getf( genl, $kw119$CONCEPT_ID, UNPROVIDED ) ), T, NIL, $kw177$UNINITIALIZED );
              final SubLObject _prev_bind_0_$139 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$139, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$134, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$138, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$129, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str651$renderer );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 183013L)
  public static SubLObject xml_output_selection_renderer(final SubLObject renderer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( renderer.first() == $kw157$TEXT_MATCHES )
    {
      try
      {
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str654$text_matches, ConsesLow.list( $str655$heading, conses_high.second( renderer ) ), NIL, NIL, $kw177$UNINITIALIZED );
          final SubLObject _prev_bind_0_$144 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
            xml_output_selection_renderer( conses_high.third( renderer ) );
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$144, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str654$text_matches );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      return NIL;
    }
    SubLObject attrs = ( conses_high.getf( renderer, $kw159$VALID, UNPROVIDED ) == NIL ) ? $list656 : NIL;
    if( NIL != conses_high.getf( renderer, $kw136$INITIALLY_SELECTED, UNPROVIDED ) )
    {
      attrs = Sequences.cconcatenate( attrs, ConsesLow.list( $str657$initiallySelected, $str335$true ) );
    }
    try
    {
      final SubLObject _prev_bind_4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str658$selectionRenderer, attrs, NIL, NIL, $kw177$UNINITIALIZED );
        final SubLObject _prev_bind_0_$145 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
          if( NIL != conses_high.getf( renderer, $kw67$STRING, UNPROVIDED ) )
          {
            try
            {
              final SubLObject _prev_bind_0_$146 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$147 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str90$string, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                final SubLObject _prev_bind_0_$147 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                  xml_utilities.xml_print( web_utilities.html_url_encode( conses_high.getf( renderer, $kw67$STRING, UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$147, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$147, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$146, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str90$string );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$148, thread );
              }
            }
          }
          if( NIL != conses_high.getf( renderer, $kw117$CYCL, UNPROVIDED ) )
          {
            try
            {
              final SubLObject _prev_bind_0_$149 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$148 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str644$cyclTerm, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                final SubLObject _prev_bind_0_$150 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                  if( conses_high.getf( renderer, $kw117$CYCL, UNPROVIDED ).equal( $str160$newValue ) )
                  {
                    xml_utilities.xml_print( $str160$newValue, UNPROVIDED );
                  }
                  else
                  {
                    xml_utilities.xml_print( web_utilities.html_url_encode( kb_utilities.pretty_print_cycl_to_string( conses_high.getf( renderer, $kw117$CYCL, UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED );
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$150, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$148, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$149, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$151 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str644$cyclTerm );
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$151, thread );
              }
            }
          }
          if( NIL != conses_high.getf( renderer, $kw161$CYCL_ID, UNPROVIDED ) )
          {
            try
            {
              final SubLObject _prev_bind_0_$152 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$149 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str659$cyclId, NIL, NIL, NIL, $kw177$UNINITIALIZED );
                final SubLObject _prev_bind_0_$153 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                  if( conses_high.getf( renderer, $kw117$CYCL, UNPROVIDED ).equal( $str160$newValue ) )
                  {
                    xml_utilities.xml_print( $str160$newValue, UNPROVIDED );
                  }
                  else
                  {
                    xml_utilities.xml_print( kb_utilities.compact_hl_external_id_string( conses_high.getf( renderer, $kw117$CYCL, UNPROVIDED ) ), UNPROVIDED );
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$153, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$149, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$152, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$154 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str659$cyclId );
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$154, thread );
              }
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$145, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_5, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_4, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values5 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str658$selectionRenderer );
        Values.restoreValuesFromVector( _values5 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 184093L)
  public static SubLObject term_learner_concept_clouds(final SubLObject terms, SubLObject user, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym660$TERM_LEARNER_CONCEPT_CLOUDS, terms, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym660$TERM_LEARNER_CONCEPT_CLOUDS, terms, user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    SubLObject result = NIL;
    final SubLObject query_mt = query_mt_for_user_and_task( user, task );
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_5 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( ConsesLow.list( $kw117$CYCL, v_term, $kw119$CONCEPT_ID, document_annotation_widgets.term_learner_id( v_term ), $kw661$TERM_WEIGHT, term_learner_term_weight( v_term ), $kw662$CLOUD,
            term_learner_term_concept_cloud( v_term, query_mt ) ), result );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_5, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_4, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_3, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 184652L)
  public static SubLObject term_learner_term_concept_cloud(final SubLObject v_term, SubLObject query_mt)
  {
    if( query_mt == UNPROVIDED )
    {
      query_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cloud_term_dictionary = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$158 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$159 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$160 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$161 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  if( NIL != fort_types_interface.collection_p( v_term ) )
                  {
                    SubLObject cdolist_list_var = genls.all_genls( v_term, query_mt, UNPROVIDED );
                    SubLObject genl = NIL;
                    genl = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      if( !v_term.equal( genl ) )
                      {
                        final SubLObject displayP = term_learner_displayable_generalizationP( genl, query_mt );
                        final SubLObject nl = ( NIL != displayP ) ? term_learner_cloud_display_nl( genl ) : $str50$;
                        final SubLObject term_weight = term_learner_term_weight( genl );
                        final SubLObject term_info = ConsesLow.list( $kw141$GENLS, displayP, nl, genl, term_weight );
                        dictionary.dictionary_enter( cloud_term_dictionary, document_annotation_widgets.term_learner_id( genl ), term_info );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      genl = cdolist_list_var.first();
                    }
                  }
                  else
                  {
                    SubLObject cdolist_list_var = isa.all_isa( v_term, query_mt, UNPROVIDED );
                    SubLObject v_isa = NIL;
                    v_isa = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject displayP = term_learner_displayable_generalizationP( v_isa, query_mt );
                      final SubLObject nl = ( NIL != displayP ) ? term_learner_cloud_display_nl( v_isa ) : $str50$;
                      final SubLObject term_weight = term_learner_term_weight( v_isa );
                      final SubLObject term_info = ConsesLow.list( $kw143$ISA, displayP, nl, v_isa, term_weight );
                      dictionary.dictionary_enter( cloud_term_dictionary, document_annotation_widgets.term_learner_id( v_isa ), term_info );
                      cdolist_list_var = cdolist_list_var.rest();
                      v_isa = cdolist_list_var.first();
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$162 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$162, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$161, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$160, thread );
            }
            if( new_or_reused == $kw664$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$159, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$163 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$163, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$158, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return Sort.sort( dictionary_utilities.dictionary_to_alist( cloud_term_dictionary ), $sym153$_, $sym665$SIXTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 185884L)
  public static SubLObject term_learner_concept_cloud_as_xml(final SubLObject terms, SubLObject user_id)
  {
    if( user_id == UNPROVIDED )
    {
      user_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cloud_dict = term_learner_concept_cloud_new_int( terms, user_id );
    SubLObject result_string = NIL;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( NIL, thread );
      try
      {
        xml_vars.$xml_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        try
        {
          final SubLObject _prev_bind_0_$164 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str667$cloud, NIL, NIL, NIL, $kw177$UNINITIALIZED );
            final SubLObject _prev_bind_0_$165 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( cloud_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject cloud_elt_plist = thread.secondMultipleValue();
                thread.resetMultipleValues();
                xml_utilities.xml_terpri();
                final SubLObject term_id = conses_high.getf( cloud_elt_plist, $kw161$CYCL_ID, UNPROVIDED );
                final SubLObject genl_ids = conses_high.getf( cloud_elt_plist, $kw668$GENL_IDS, UNPROVIDED );
                final SubLObject isa_ids = conses_high.getf( cloud_elt_plist, $kw669$ISA_IDS, UNPROVIDED );
                final SubLObject display = conses_high.getf( cloud_elt_plist, $kw9$DISPLAY, UNPROVIDED );
                final SubLObject nl = conses_high.getf( cloud_elt_plist, $kw212$NL, UNPROVIDED );
                final SubLObject weight = conses_high.getf( cloud_elt_plist, $kw118$WEIGHT, UNPROVIDED );
                SubLObject attrs = ConsesLow.list( $str670$cycl, PrintLow.write_to_string( v_term, EMPTY_SUBL_OBJECT_ARRAY ), $str659$cyclId, term_id, $str643$display, ( NIL != display ) ? $str671$t : $str672$f,
                    $str673$weight, weight );
                if( NIL != nl )
                {
                  attrs = Sequences.cconcatenate( ConsesLow.list( $str674$nl, nl ), attrs );
                }
                try
                {
                  final SubLObject _prev_bind_0_$166 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$167 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str675$concept, attrs, NIL, NIL, $kw177$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$167 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                      SubLObject cdolist_list_var = genl_ids;
                      SubLObject genl_id = NIL;
                      genl_id = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        xml_utilities.xml_terpri();
                        final SubLObject attrs_$169 = ConsesLow.list( $str659$cyclId, genl_id );
                        final SubLObject _prev_bind_0_$168 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$168 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str676$genl, attrs_$169, T, NIL, $kw177$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$169 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$169, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$168, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$168, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        genl_id = cdolist_list_var.first();
                      }
                      cdolist_list_var = isa_ids;
                      SubLObject isa_id = NIL;
                      isa_id = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        xml_utilities.xml_terpri();
                        final SubLObject attrs_$170 = ConsesLow.list( $str332$conceptId, isa_id );
                        final SubLObject _prev_bind_0_$170 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$169 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str88$isa, attrs_$170, T, NIL, $kw177$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$171 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw177$UNINITIALIZED, thread );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$171, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$169, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$170, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        isa_id = cdolist_list_var.first();
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$167, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$167, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$166, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$172 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal( $str675$concept );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$172, thread );
                  }
                }
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$165, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$164, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$173 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str667$cloud );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$173, thread );
          }
        }
        result_string = streams_high.get_output_stream_string( xml_vars.$xml_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$174 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          streams_high.close( xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$174, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return result_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 187007L)
  public static SubLObject term_learner_concept_cloud_new(final SubLObject terms, SubLObject user_id)
  {
    if( user_id == UNPROVIDED )
    {
      user_id = NIL;
    }
    final SubLObject cloud_dict = term_learner_concept_cloud_new_int( terms, user_id );
    return dictionary.dictionary_values( cloud_dict );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 187198L)
  public static SubLObject term_learner_concept_cloud_new_int(final SubLObject terms, SubLObject user_id)
  {
    if( user_id == UNPROVIDED )
    {
      user_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym677$TERM_LEARNER_CONCEPT_CLOUD_NEW_INT, terms, user_id ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym677$TERM_LEARNER_CONCEPT_CLOUD_NEW_INT, terms, user_id ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject cloud = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject mt = $const64$InferencePSC;
    SubLObject to_do = NIL;
    SubLObject current_todo = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$180 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$181 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
          try
          {
            pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$182 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
            try
            {
              pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
              final SubLObject reuseP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              try
              {
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$183 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                try
                {
                  pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                  final SubLObject new_or_reused = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$184 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                    final SubLObject local_state_$185 = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                    final SubLObject _prev_bind_0_$185 = memoization_state.$memoization_state$.currentBinding( thread );
                    try
                    {
                      memoization_state.$memoization_state$.bind( local_state_$185, thread );
                      final SubLObject original_memoization_process_$187 = memoization_state.memoization_state_original_process( local_state_$185 );
                      try
                      {
                        SubLObject cdolist_list_var = terms;
                        SubLObject v_term = NIL;
                        v_term = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          if( NIL == dictionary.dictionary_lookup( cloud, v_term, UNPROVIDED ) )
                          {
                            add_cloud_entry_for_term( cloud, v_term, mt, T );
                          }
                          if( NIL != fort_types_interface.isa_collectionP( v_term, UNPROVIDED ) )
                          {
                            final SubLObject items_var = genls.genls( v_term, mt, UNPROVIDED );
                            if( items_var.isVector() )
                            {
                              final SubLObject vector_var = items_var;
                              final SubLObject backwardP_var = NIL;
                              SubLObject length;
                              SubLObject v_iteration;
                              SubLObject element_num;
                              SubLObject item;
                              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                              {
                                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                                item = Vectors.aref( vector_var, element_num );
                                to_do = ConsesLow.cons( item, to_do );
                              }
                            }
                            else
                            {
                              SubLObject cdolist_list_var_$188 = items_var;
                              SubLObject item2 = NIL;
                              item2 = cdolist_list_var_$188.first();
                              while ( NIL != cdolist_list_var_$188)
                              {
                                to_do = ConsesLow.cons( item2, to_do );
                                cdolist_list_var_$188 = cdolist_list_var_$188.rest();
                                item2 = cdolist_list_var_$188.first();
                              }
                            }
                          }
                          else
                          {
                            final SubLObject items_var = isa.isa( v_term, mt, UNPROVIDED );
                            if( items_var.isVector() )
                            {
                              final SubLObject vector_var = items_var;
                              final SubLObject backwardP_var = NIL;
                              SubLObject length;
                              SubLObject v_iteration;
                              SubLObject element_num;
                              SubLObject item;
                              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                              {
                                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                                item = Vectors.aref( vector_var, element_num );
                                to_do = ConsesLow.cons( item, to_do );
                              }
                            }
                            else
                            {
                              SubLObject cdolist_list_var_$189 = items_var;
                              SubLObject item2 = NIL;
                              item2 = cdolist_list_var_$189.first();
                              while ( NIL != cdolist_list_var_$189)
                              {
                                to_do = ConsesLow.cons( item2, to_do );
                                cdolist_list_var_$189 = cdolist_list_var_$189.rest();
                                item2 = cdolist_list_var_$189.first();
                              }
                            }
                          }
                          while ( NIL != to_do)
                          {
                            current_todo = to_do.first();
                            to_do = to_do.rest();
                            if( NIL == dictionary.dictionary_lookup( cloud, current_todo, UNPROVIDED ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject updated_cloud = add_cloud_entry_for_term( cloud, current_todo, mt, UNPROVIDED );
                              final SubLObject new_todo = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              final SubLObject items_var2 = new_todo;
                              if( items_var2.isVector() )
                              {
                                final SubLObject vector_var2 = items_var2;
                                final SubLObject backwardP_var2 = NIL;
                                SubLObject length2;
                                SubLObject v_iteration2;
                                SubLObject element_num2;
                                SubLObject item3;
                                for( length2 = Sequences.length( vector_var2 ), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL( length2 ); v_iteration2 = Numbers.add( v_iteration2, ONE_INTEGER ) )
                                {
                                  element_num2 = ( ( NIL != backwardP_var2 ) ? Numbers.subtract( length2, v_iteration2, ONE_INTEGER ) : v_iteration2 );
                                  item3 = Vectors.aref( vector_var2, element_num2 );
                                  to_do = ConsesLow.cons( item3, to_do );
                                }
                              }
                              else
                              {
                                SubLObject cdolist_list_var_$190 = items_var2;
                                SubLObject item4 = NIL;
                                item4 = cdolist_list_var_$190.first();
                                while ( NIL != cdolist_list_var_$190)
                                {
                                  to_do = ConsesLow.cons( item4, to_do );
                                  cdolist_list_var_$190 = cdolist_list_var_$190.rest();
                                  item4 = cdolist_list_var_$190.first();
                                }
                              }
                            }
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          v_term = cdolist_list_var.first();
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$186 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          memoization_state.memoization_state_possibly_clear_original_process( local_state_$185, original_memoization_process_$187 );
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$186, thread );
                        }
                      }
                    }
                    finally
                    {
                      memoization_state.$memoization_state$.rebind( _prev_bind_0_$185, thread );
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$184, thread );
                  }
                  if( new_or_reused == $kw664$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                  {
                    memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                  }
                }
                finally
                {
                  pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$183, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$187 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  if( NIL == reuseP )
                  {
                    pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                  }
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$187, thread );
                }
              }
            }
            finally
            {
              pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$182, thread );
            }
          }
          finally
          {
            pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$181, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$188 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values4 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values4 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$188, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$180, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_2, thread );
    }
    return cloud;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 188148L)
  public static SubLObject add_cloud_entry_for_term(final SubLObject cloud, final SubLObject v_term, final SubLObject mt, SubLObject force_displayP)
  {
    if( force_displayP == UNPROVIDED )
    {
      force_displayP = NIL;
    }
    final SubLObject v_genls = genls.genls( v_term, mt, UNPROVIDED );
    final SubLObject genl_termids = Mapping.mapcar( $sym678$TERM_LEARNER_ID, v_genls );
    final SubLObject isas = ( NIL != v_genls ) ? NIL : isa.isa( v_term, mt, UNPROVIDED );
    final SubLObject isa_term_ids = ( NIL != isas ) ? Mapping.mapcar( $sym678$TERM_LEARNER_ID, isas ) : NIL;
    final SubLObject displayP = ( NIL != force_displayP ) ? force_displayP : term_learner_displayable_generalizationP( v_term, mt );
    final SubLObject nl = ( NIL != displayP ) ? term_learner_cloud_display_nl( v_term ) : $str50$;
    final SubLObject term_weight = term_learner_term_weight( v_term );
    final SubLObject id = document_annotation_widgets.term_learner_id( v_term );
    dictionary.dictionary_enter( cloud, v_term, ConsesLow.list( new SubLObject[] { $kw117$CYCL, v_term, $kw161$CYCL_ID, id, $kw669$ISA_IDS, isa_term_ids, $kw668$GENL_IDS, genl_termids, $kw9$DISPLAY, displayP, $kw212$NL,
      nl, $kw118$WEIGHT, term_weight
    } ) );
    return Values.values( cloud, v_genls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 188833L)
  public static SubLObject term_learner_term_weight(final SubLObject v_term)
  {
    final SubLObject generality = Numbers.log( cardinality_estimates.generality_estimate( v_term ), UNPROVIDED );
    final SubLObject weight = generality.numG( ZERO_INTEGER ) ? Numbers.divide( ONE_INTEGER, generality ) : ONE_INTEGER;
    return weight;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 189611L)
  public static SubLObject clear_term_learner_cloud_display_nl()
  {
    final SubLObject cs = $term_learner_cloud_display_nl_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 189611L)
  public static SubLObject remove_term_learner_cloud_display_nl(final SubLObject v_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_cloud_display_nl_caching_state$.getGlobalValue(), ConsesLow.list( v_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 189611L)
  public static SubLObject term_learner_cloud_display_nl_internal(final SubLObject v_term)
  {
    return nl_generation_api.cycl_term_to_nl_string_internal( v_term, nl_generation_api.new_pph_parameters( ConsesLow.list( $kw522$PPH_LEXICAL_CONTEXT, cure_default_generation_mt( UNPROVIDED ) ) ) ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 189611L)
  public static SubLObject term_learner_cloud_display_nl(final SubLObject v_term)
  {
    SubLObject caching_state = $term_learner_cloud_display_nl_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym679$TERM_LEARNER_CLOUD_DISPLAY_NL, $sym680$_TERM_LEARNER_CLOUD_DISPLAY_NL_CACHING_STATE_, $int681$4096, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym682$CLEAR_TERM_LEARNER_CLOUD_DISPLAY_NL );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_cloud_display_nl_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190017L)
  public static SubLObject clear_term_learner_displayable_generalizationP()
  {
    final SubLObject cs = $term_learner_displayable_generalizationP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190017L)
  public static SubLObject remove_term_learner_displayable_generalizationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_displayable_generalizationP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190017L)
  public static SubLObject term_learner_displayable_generalizationP_internal(final SubLObject v_term, final SubLObject mt)
  {
    return makeBoolean( NIL == thcl.ke_irrelevant_termP( v_term, mt ) && NIL != rkf_concept_clarifier.rkf_clarifying_collectionP( v_term, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190017L)
  public static SubLObject term_learner_displayable_generalizationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $term_learner_displayable_generalizationP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_, $sym684$_TERM_LEARNER_DISPLAYABLE_GENERALIZATION__CACHING_STATE_, $int681$4096, EQUAL,
          TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym685$CLEAR_TERM_LEARNER_DISPLAYABLE_GENERALIZATION_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_displayable_generalizationP_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190282L)
  public static SubLObject clear_term_learner_possibly_relevant_generalizationP()
  {
    final SubLObject cs = $term_learner_possibly_relevant_generalizationP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190282L)
  public static SubLObject remove_term_learner_possibly_relevant_generalizationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_possibly_relevant_generalizationP_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190282L)
  public static SubLObject term_learner_possibly_relevant_generalizationP_internal(final SubLObject v_term, final SubLObject mt)
  {
    return makeBoolean( ( NIL == kb_accessors.indeterminate_termP( v_term ) || v_term.eql( $const686$Now ) ) && ( NIL == cycl_grammar.cycl_nat_p( v_term ) || NIL == subl_promotions.memberP( cycl_utilities.formula_arg0(
        v_term ), $list687, UNPROVIDED, UNPROVIDED ) ) && NIL == thcl.ke_irrelevant_termP( narts_high.nart_substitute( v_term ), mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190282L)
  public static SubLObject term_learner_possibly_relevant_generalizationP(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    SubLObject caching_state = $term_learner_possibly_relevant_generalizationP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_, $sym688$_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION__CACHING_STATE_, $int681$4096,
          EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym689$CLEAR_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_ );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_possibly_relevant_generalizationP_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 190967L)
  public static SubLObject clear_term_learner_irrelevancies_for_term(final SubLObject event, SubLObject param)
  {
    if( param == UNPROVIDED )
    {
      param = NIL;
    }
    final SubLObject modified_term;
    final SubLObject event_info = modified_term = event_model.event_message( event );
    clear_term_learner_possibly_relevant_generalizationP();
    clear_term_learner_displayable_generalizationP();
    clear_term_learner_known_bindings_for_sentence();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 191349L)
  public static SubLObject cycl_terms_to_nl_strings_quick(final SubLObject term_list, SubLObject pph_params)
  {
    if( pph_params == UNPROVIDED )
    {
      pph_params = $kw20$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$194 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$195 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$196 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$197 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  SubLObject cdolist_list_var = term_list;
                  SubLObject v_term = NIL;
                  v_term = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    result = ConsesLow.cons( nl_generation_api.cycl_term_to_nl_string_internal( v_term, pph_params ).first(), result );
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$198 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$198, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$197, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$196, thread );
            }
            if( new_or_reused == $kw664$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$195, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$199 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$199, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$194, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 191765L)
  public static SubLObject cb_show_followup_widget(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject misc_attrs = ConsesLow.list( reader.bq_cons( $str694$_termId_, kb_utilities.compact_hl_external_id_string( fort ) ), reader.bq_cons( $str695$_termString_, pph_main.generate_phrase( fort, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str696$cycFollowup );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    SubLObject cdolist_list_var = misc_attrs;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject attribute = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list697 );
      attribute = current.first();
      current = ( value = current.rest() );
      html_utilities.html_markup( attribute );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( value );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    cyc_file_dependencies.javascript( $kw698$FOLLOWUP_LOADER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLObject cb_cure_host()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $cb_cure_internal_host_override$.getDynamicValue( thread ) ) ? $cb_cure_internal_host_override$.getDynamicValue( thread )
        : ( ( NIL != web_utilities.local_servlet_container_runningP() ) ? misc_utilities.hostname() : $cb_cure_external_host$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLObject cb_cure_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $cb_cure_internal_port_override$.getDynamicValue( thread ) ) ? $cb_cure_internal_port_override$.getDynamicValue( thread )
        : ( ( NIL != web_utilities.local_servlet_container_runningP() ) ? web_utilities.servlet_container_port() : $cb_cure_external_port$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLObject cb_cure_context_path()
  {
    return ( NIL != web_utilities.local_servlet_container_runningP() ) ? $cb_cure_internal_context_path$.getGlobalValue() : $cb_cure_external_context_path$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLObject cb_possibly_add_cure_link(final SubLObject v_term, SubLObject title_string, SubLObject link_string)
  {
    if( title_string == UNPROVIDED )
    {
      title_string = NIL;
    }
    if( link_string == UNPROVIDED )
    {
      link_string = $str707$CURE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject err = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym708$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != default_task_for_user( operation_communication.the_cyclist() ) && NIL != query_mt_for_user_and_task( operation_communication.the_cyclist(), default_task_for_user( operation_communication
              .the_cyclist() ) ) )
          {
            return cb_cure_link( v_term, title_string, link_string );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str709$CURE_Broken );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    Errors.warn( $str710$CURE_broken___S, err );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 192541L)
  public static SubLObject cb_cure_link(final SubLObject v_term, SubLObject title_string, SubLObject link_string)
  {
    if( title_string == UNPROVIDED )
    {
      title_string = NIL;
    }
    if( link_string == UNPROVIDED )
    {
      link_string = $str707$CURE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_script_utilities.html_popup_script();
    final SubLObject href = Sequences.cconcatenate( $str711$http___, new SubLObject[] { format_nil.format_nil_a_no_copy( cb_cure_host() ), $str606$_, format_nil.format_nil_a_no_copy( cb_cure_port() ), format_nil
        .format_nil_a_no_copy( cb_cure_context_path() ), $str712$_edit_jsp_conceptid_, format_nil.format_nil_a_no_copy( kb_utilities.compact_hl_external_id_string( v_term ) ), $str713$_cycHost_, format_nil
            .format_nil_a_no_copy( misc_utilities.hostname() ), $str714$_cycPort_, format_nil.format_nil_a_no_copy( html_kernel.html_port() ), $str715$_userName_, format_nil.format_nil_a_no_copy( web_utilities
                .html_url_encode( kb_paths.fort_name( operation_communication.the_cyclist() ), UNPROVIDED ) )
    } );
    final SubLObject window_name = Sequences.cconcatenate( kb_utilities.compact_hl_external_id_string( v_term ), $str716$_cure );
    final SubLObject onclick = html_script_utilities.html_popup_onclick( window_name, $int717$600, $int718$400, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( href );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != title_string )
    {
      html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( title_string );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( onclick );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str719$_cycdoc_img_cb_cure_png );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != link_string )
      {
        html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( link_string );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $str720$bottom ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_image_style$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str721$height_1_2em );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$200, thread );
      }
      html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 195210L)
  public static SubLObject clear_sentence_score()
  {
    final SubLObject cs = $sentence_score_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 195210L)
  public static SubLObject remove_sentence_score(final SubLObject sentence, final SubLObject focal_term, SubLObject type_limit, SubLObject mt)
  {
    if( type_limit == UNPROVIDED )
    {
      type_limit = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $sentence_score_caching_state$.getGlobalValue(), ConsesLow.list( sentence, focal_term, type_limit, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 195210L)
  public static SubLObject sentence_score_internal(final SubLObject sentence, final SubLObject focal_term, final SubLObject type_limit, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_sentence = get_sentence_for_scoring( sentence, focal_term, UNPROVIDED, UNPROVIDED );
    final SubLObject known_bindings_set = set_query_variable( $sym282$_X, query_sentence, mt, $list723 );
    final SubLObject immediate_parents = isa.min_isa( focal_term, mt, UNPROVIDED );
    SubLObject instance_set = NIL;
    SubLObject score = ZERO_INTEGER;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      instance_set = set_utilities.make_set_from_list( Sequences.remove_duplicates( Mapping.mapcan( $sym724$ALL_INSTANCES, immediate_parents, EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
          EQUAL );
      if( !set.set_size( instance_set ).numE( ZERO_INTEGER ) )
      {
        score = Numbers.divide( set.set_size( set_utilities.set_intersection( ConsesLow.list( instance_set, known_bindings_set ), UNPROVIDED ) ), set.set_size( instance_set ) );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 195210L)
  public static SubLObject sentence_score(final SubLObject sentence, final SubLObject focal_term, SubLObject type_limit, SubLObject mt)
  {
    if( type_limit == UNPROVIDED )
    {
      type_limit = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    SubLObject caching_state = $sentence_score_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym722$SENTENCE_SCORE, $sym725$_SENTENCE_SCORE_CACHING_STATE_, NIL, EQ, FOUR_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( sentence, focal_term, type_limit, mt );
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
        if( sentence.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( focal_term.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( type_limit.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sentence_score_internal( sentence, focal_term, type_limit, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, focal_term, type_limit, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196168L)
  public static SubLObject clear_sentence_score_for_type()
  {
    final SubLObject cs = $sentence_score_for_type_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196168L)
  public static SubLObject remove_sentence_score_for_type(final SubLObject sentence, final SubLObject focal_arg_pos, final SubLObject focal_type, SubLObject type_limit, SubLObject mt)
  {
    if( type_limit == UNPROVIDED )
    {
      type_limit = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $sentence_score_for_type_caching_state$.getGlobalValue(), ConsesLow.list( sentence, focal_arg_pos, focal_type, type_limit, mt ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196168L)
  public static SubLObject sentence_score_for_type_internal(final SubLObject sentence, final SubLObject focal_arg_pos, final SubLObject focal_type, final SubLObject type_limit, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_sentence = get_sentence_for_scoring( sentence, NIL, focal_arg_pos, UNPROVIDED );
    final SubLObject known_bindings_set = set_query_variable( $sym727$_QUERY_VAR, query_sentence, mt, $list723 );
    SubLObject instance_set = NIL;
    SubLObject score = ZERO_INTEGER;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      instance_set = set_utilities.make_set_from_list( isa.all_instances( focal_type, UNPROVIDED, UNPROVIDED ), EQUAL );
      if( !set.set_size( instance_set ).numE( ZERO_INTEGER ) )
      {
        score = Numbers.divide( set.set_size( set_utilities.set_intersection( ConsesLow.list( instance_set, known_bindings_set ), UNPROVIDED ) ), set.set_size( instance_set ) );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196168L)
  public static SubLObject sentence_score_for_type(final SubLObject sentence, final SubLObject focal_arg_pos, final SubLObject focal_type, SubLObject type_limit, SubLObject mt)
  {
    if( type_limit == UNPROVIDED )
    {
      type_limit = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    SubLObject caching_state = $sentence_score_for_type_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym726$SENTENCE_SCORE_FOR_TYPE, $sym728$_SENTENCE_SCORE_FOR_TYPE_CACHING_STATE_, NIL, EQUAL, FIVE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( sentence, focal_arg_pos, focal_type, type_limit, mt );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( focal_arg_pos.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( focal_type.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( type_limit.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sentence_score_for_type_internal( sentence, focal_arg_pos, focal_type, type_limit, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, focal_arg_pos, focal_type, type_limit, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196865L)
  public static SubLObject clear_set_query_variable()
  {
    final SubLObject cs = $set_query_variable_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196865L)
  public static SubLObject remove_set_query_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, final SubLObject params)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $set_query_variable_caching_state$.getGlobalValue(), ConsesLow.list( var, sentence, mt, params ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196865L)
  public static SubLObject set_query_variable_internal(final SubLObject var, final SubLObject sentence, final SubLObject mt, final SubLObject params)
  {
    return set_utilities.make_set_from_list( ask_utilities.query_variable( var, sentence, mt, params ), EQUAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 196865L)
  public static SubLObject set_query_variable(final SubLObject var, final SubLObject sentence, final SubLObject mt, final SubLObject params)
  {
    SubLObject caching_state = $set_query_variable_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym729$SET_QUERY_VARIABLE, $sym730$_SET_QUERY_VARIABLE_CACHING_STATE_, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( var, sentence, mt, params );
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
        if( var.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( sentence.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && params.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( set_query_variable_internal( var, sentence, mt, params ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( var, sentence, mt, params ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 197025L)
  public static SubLObject get_sentence_for_scoring(final SubLObject sentence, final SubLObject focal_term, SubLObject focal_arg_pos, SubLObject asserted_onlyP)
  {
    if( focal_arg_pos == UNPROVIDED )
    {
      focal_arg_pos = NIL;
    }
    if( asserted_onlyP == UNPROVIDED )
    {
      asserted_onlyP = T;
    }
    final SubLObject focal_var = cycl_utilities.formula_arg_position( sentence, focal_arg_pos, UNPROVIDED );
    final SubLObject result_sentence = ( NIL != asserted_onlyP ) ? el_utilities.make_formula( $const73$assertedSentence, ConsesLow.list( sentence ), UNPROVIDED ) : sentence;
    if( NIL != focal_arg_pos )
    {
      return cycl_utilities.formula_subst( $sym727$_QUERY_VAR, focal_var, result_sentence, UNPROVIDED, UNPROVIDED );
    }
    return cycl_utilities.formula_subst( $sym727$_QUERY_VAR, focal_term, result_sentence, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 197468L)
  public static SubLObject preds_w_scores(final SubLObject focal_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentences = NIL;
    final SubLObject _prev_bind_0 = $current_tl_task$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      $current_tl_task$.bind( $const620$GeneralCycKETask_Allotment, thread );
      api_control_vars.$the_cyclist$.bind( $const731$DaveS, thread );
      final SubLObject query_mt = followup_query_mt_for_userXtask( api_control_vars.$the_cyclist$.getDynamicValue( thread ), $current_tl_task$.getDynamicValue( thread ) );
      final SubLObject fragment_sentence = Mapping.mapcar( $sym405$FIRST, cae_query_search.get_fragments_for_terms( ConsesLow.list( ConsesLow.list( $str732$something, focal_term ) ), NIL, query_mt, $kw345$BLANKS, NIL,
          UNPROVIDED ) );
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$201 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$202 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject cdolist_list_var = fragment_sentence;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != cycl_utilities.formula_find( focal_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            sentences = ConsesLow.cons( ConsesLow.list( sentence, sentence_score( sentence, focal_term, UNPROVIDED, UNPROVIDED ) ), sentences );
          }
          cdolist_list_var = cdolist_list_var.rest();
          sentence = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$202, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$201, thread );
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_2, thread );
      $current_tl_task$.rebind( _prev_bind_0, thread );
    }
    return sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 198138L)
  public static SubLObject sentences_with_scores_for_type(final SubLObject type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentences = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $current_tl_task$.currentBinding( thread );
    final SubLObject _prev_bind_5 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      $current_tl_task$.bind( $const620$GeneralCycKETask_Allotment, thread );
      api_control_vars.$the_cyclist$.bind( $const731$DaveS, thread );
      final SubLObject focal_term = czer_main.canonicalize_term_assert( ConsesLow.list( $const733$GenericInstanceFn, type ), UNPROVIDED );
      final SubLObject query_mt = followup_query_mt_for_userXtask( api_control_vars.$the_cyclist$.getDynamicValue( thread ), $current_tl_task$.getDynamicValue( thread ) );
      final SubLObject substituted_fragments = get_fragments_for_terms_cached( ConsesLow.list( ConsesLow.list( $str732$something, focal_term ) ), NIL, query_mt, $kw345$BLANKS );
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0_$203 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_1_$204 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2_$205 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject cdolist_list_var = substituted_fragments;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != cycl_utilities.formula_find( focal_term, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            sentences = ConsesLow.cons( ConsesLow.list( sentence, sentence_score( sentence, focal_term, UNPROVIDED, UNPROVIDED ) ), sentences );
          }
          cdolist_list_var = cdolist_list_var.rest();
          sentence = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$205, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$204, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$203, thread );
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_5, thread );
      $current_tl_task$.rebind( _prev_bind_4, thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return Sort.sort( sentences, $sym77$_, $sym734$SECOND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 198901L)
  public static SubLObject clear_get_fragments_for_terms_cached()
  {
    final SubLObject cs = $get_fragments_for_terms_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 198901L)
  public static SubLObject remove_get_fragments_for_terms_cached(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_fragments_for_terms_cached_caching_state$.getGlobalValue(), ConsesLow.list( arg1, arg2, arg3, arg4 ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 198901L)
  public static SubLObject get_fragments_for_terms_cached_internal(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    return cae_query_search.get_fragments_for_terms( arg1, arg2, arg3, arg4, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 198901L)
  public static SubLObject get_fragments_for_terms_cached(final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4)
  {
    SubLObject caching_state = $get_fragments_for_terms_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym735$GET_FRAGMENTS_FOR_TERMS_CACHED, $sym736$_GET_FRAGMENTS_FOR_TERMS_CACHED_CACHING_STATE_, NIL, EQUALP, FOUR_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym737$CLEAR_GET_FRAGMENTS_FOR_TERMS_CACHED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( arg1, arg2, arg3, arg4 );
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
        if( arg1.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( arg2.equalp( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( arg3.equalp( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && arg4.equalp( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_fragments_for_terms_cached_internal( arg1, arg2, arg3, arg4 ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( arg1, arg2, arg3, arg4 ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 199079L)
  public static SubLObject assert_orderings(SubLObject type, SubLObject assert_mt)
  {
    if( type == UNPROVIDED )
    {
      type = $const738$Restaurant_Organization;
    }
    if( assert_mt == UNPROVIDED )
    {
      assert_mt = $list739;
    }
    SubLObject cdolist_list_var = genls.all_specs( type, $const64$InferencePSC, UNPROVIDED );
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert_ordering_for_type( spec, assert_mt );
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 199359L)
  public static SubLObject assert_ordering_for_type(final SubLObject type, SubLObject assert_mt)
  {
    if( assert_mt == UNPROVIDED )
    {
      assert_mt = $list739;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const731$DaveS, thread );
      SubLObject cdolist_list_var = sentences_with_scores_for_type( type, UNPROVIDED );
      SubLObject sentence_and_score = NIL;
      sentence_and_score = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = sentence_and_score;
        SubLObject sentence = NIL;
        SubLObject score = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list740 );
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list740 );
        score = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( score.numG( ZERO_INTEGER ) )
          {
            preds = ConsesLow.cons( cycl_utilities.formula_arg0( sentence ), preds );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list740 );
        }
        ke.ke_assert( ConsesLow.list( $const368$summaryPredicateWRTSetOrCollectio, type, reader.bq_cons( $const459$TheList, preds ) ), assert_mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        sentence_and_score = cdolist_list_var.first();
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 199889L)
  public static SubLObject pred_score(final SubLObject pred, final SubLObject focal_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLObject pred_arity = arity.arity( pred );
    SubLObject sentence = ConsesLow.list( pred );
    SubLObject el_vars = NIL;
    SubLObject score = ZERO_INTEGER;
    SubLObject n;
    SubLObject el_var;
    for( n = NIL, n = ZERO_INTEGER; n.numL( pred_arity ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      el_var = czer_utilities.unique_el_var_wrt_expression( sentence, UNPROVIDED );
      el_vars = ConsesLow.cons( el_var, el_vars );
      sentence = list_utilities.snoc( el_var, sentence );
    }
    SubLObject this_sentence;
    for( n = NIL, n = ZERO_INTEGER; n.numL( pred_arity ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      this_sentence = bindings.apply_bindings( cae_query_search.xyz_varmap_for_formula( sentence ), sentence );
      ConsesLow.set_nth( Numbers.add( ONE_INTEGER, n ), this_sentence, focal_term );
      score = Numbers.add( score, sentence_score( this_sentence, focal_term, mt, UNPROVIDED ) );
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 200935L)
  public static SubLObject preds_w_scores_from_rules(final SubLObject focal_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predsXscores = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject list_var = applicable_relations.applicable_predicates( focal_term, mt, $list741 );
      final SubLObject _prev_bind_0_$206 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_1_$207 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2_$208 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str742$cdolist, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject pred = NIL;
          pred = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            predsXscores = ConsesLow.cons( ConsesLow.list( pred, pred_score( pred, focal_term, UNPROVIDED ) ), predsXscores );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            pred = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$207 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$207, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_2_$208, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$207, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$206, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sort.sort( predsXscores, $sym77$_, $sym734$SECOND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 201676L)
  public static SubLObject pred_score_for_type(final SubLObject pred, final SubLObject focal_type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLObject pred_arity = arity.arity( pred );
    SubLObject sentence = ConsesLow.list( pred );
    SubLObject el_vars = NIL;
    SubLObject score = ZERO_INTEGER;
    SubLObject n;
    SubLObject el_var;
    for( n = NIL, n = ZERO_INTEGER; n.numL( pred_arity ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      el_var = czer_utilities.unique_el_var_wrt_expression( sentence, UNPROVIDED );
      el_vars = ConsesLow.cons( el_var, el_vars );
      sentence = list_utilities.snoc( el_var, sentence );
    }
    SubLObject this_sentence;
    for( n = NIL, n = ZERO_INTEGER; n.numL( pred_arity ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      this_sentence = bindings.apply_bindings( cae_query_search.xyz_varmap_for_formula( sentence ), sentence );
      score = Numbers.add( score, sentence_score_for_type( this_sentence, ConsesLow.list( Numbers.add( ONE_INTEGER, n ) ), focal_type, mt, UNPROVIDED ) );
    }
    return score;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 202254L)
  public static SubLObject preds_w_scores_for_type_from_rules(final SubLObject focal_type, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject predsXscores = NIL;
    final SubLObject message = Sequences.cconcatenate( $str743$gathering_preds_for_, format_nil.format_nil_s_no_copy( focal_type ) );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject list_var = applicable_relations.applicable_predicates( ConsesLow.list( $const744$SomeFn, focal_type ), mt, $list741 );
      final SubLObject _prev_bind_0_$210 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_1_$211 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2_$212 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != message ) ? message : $str742$cdolist, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject pred = NIL;
          pred = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            predsXscores = ConsesLow.cons( ConsesLow.list( pred, pred_score_for_type( pred, focal_type, UNPROVIDED ) ), predsXscores );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            pred = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$211 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$211, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_2_$212, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$211, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$210, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Sort.sort( predsXscores, $sym77$_, $sym734$SECOND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 202767L)
  public static SubLObject assert_ordering_for_type_from_rules(final SubLObject type, SubLObject assert_mt)
  {
    if( assert_mt == UNPROVIDED )
    {
      assert_mt = $list739;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject preds_and_scores = preds_w_scores_for_type_from_rules( type, UNPROVIDED );
    SubLObject preds = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    final SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const731$DaveS, thread );
      api_control_vars.$ke_purpose$.bind( $const620$GeneralCycKETask_Allotment, thread );
      SubLObject cdolist_list_var = preds_and_scores;
      SubLObject pred_and_score = NIL;
      pred_and_score = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = pred_and_score;
        SubLObject pred = NIL;
        SubLObject score = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list745 );
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list745 );
        score = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( score.numG( ZERO_INTEGER ) )
          {
            preds = ConsesLow.cons( pred, preds );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list745 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred_and_score = cdolist_list_var.first();
      }
      preds = Sequences.nreverse( preds );
      ke.ke_assert( ConsesLow.list( $const368$summaryPredicateWRTSetOrCollectio, type, reader.bq_cons( $const459$TheList, preds ) ), assert_mt, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      api_control_vars.$ke_purpose$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 203433L)
  public static SubLObject assert_ordering_for_specs_from_rules(final SubLObject type, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = $const620$GeneralCycKETask_Allotment;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assert_mt = ConsesLow.list( $const746$DocumentReaderFollowupsForTaskMtF, task );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const64$InferencePSC );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject node_var = type;
      final SubLObject deck_type = $kw749$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$214 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$215 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$216 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym750$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw751$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw754$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str755$continue_anyway, $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw756$WARN ) )
              {
                Errors.warn( $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str757$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str755$continue_anyway, $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$216 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$217 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$219 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const76$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const76$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const76$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const76$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( type, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$217 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$218 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$220 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const76$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject spec = node_var;
                    assert_ordering_for_type_from_rules( spec, assert_mt );
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const76$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$218 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$219 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$226;
                                    for( iteration_state_$226 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$226 ); iteration_state_$226 = dictionary_contents.do_dictionary_contents_next( iteration_state_$226 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$226 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$220 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str758$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$220, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$226 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$219, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str759$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$228;
                          final SubLObject new_list = cdolist_list_var_$228 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$228.first();
                          while ( NIL != cdolist_list_var_$228)
                          {
                            final SubLObject _prev_bind_0_$221 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str758$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$221, thread );
                            }
                            cdolist_list_var_$228 = cdolist_list_var_$228.rest();
                            generating_fn = cdolist_list_var_$228.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$219, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$218, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$220, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$218, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$217, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str760$Node__a_does_not_pass_sbhl_type_t, type, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$219, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$217, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$216, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$216, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$215, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$222 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$222, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$214, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 203758L)
  public static SubLObject assert_applicable_preds_for_specs(final SubLObject type, SubLObject score_limit, SubLObject task)
  {
    if( score_limit == UNPROVIDED )
    {
      score_limit = $float761$0_001;
    }
    if( task == UNPROVIDED )
    {
      task = $const620$GeneralCycKETask_Allotment;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assert_mt = ConsesLow.list( $const746$DocumentReaderFollowupsForTaskMtF, task );
    SubLObject assert_sentences = NIL;
    final SubLObject soon_to_add = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const64$InferencePSC );
    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject node_var = type;
      final SubLObject deck_type = $kw749$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$231 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$232 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$233 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym750$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw751$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw754$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str755$continue_anyway, $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw756$WARN ) )
              {
                Errors.warn( $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str757$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str755$continue_anyway, $str752$_A_is_not_a__A, tv_var, $sym753$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$233 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$234 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$236 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const76$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const76$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const76$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const76$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( type, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$234 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$235 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$237 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const76$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject spec = node_var;
                    assert_sentences = Sequences.cconcatenate( assert_sentences, get_applicable_formula_generators_for_type( spec, assert_mt, soon_to_add, score_limit ) );
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const76$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$235 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$236 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$236 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$243;
                                    for( iteration_state_$243 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$243 ); iteration_state_$243 = dictionary_contents.do_dictionary_contents_next( iteration_state_$243 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$243 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$237 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str758$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$237, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$243 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$236, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str759$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$245;
                          final SubLObject new_list = cdolist_list_var_$245 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$245.first();
                          while ( NIL != cdolist_list_var_$245)
                          {
                            final SubLObject _prev_bind_0_$238 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str758$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$238, thread );
                            }
                            cdolist_list_var_$245 = cdolist_list_var_$245.rest();
                            generating_fn = cdolist_list_var_$245.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$236, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$235, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$237, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$235, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$234, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str760$Node__a_does_not_pass_sbhl_type_t, type, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$236, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$234, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$233, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$233, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$232, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$239 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$239, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$231, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const731$DaveS, thread );
      api_control_vars.$ke_purpose$.bind( $const762$GeneralCycKE, thread );
      SubLObject cdolist_list_var2 = assert_sentences;
      SubLObject assert_sentence = NIL;
      assert_sentence = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        ke.ke_assert( assert_sentence, assert_mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var2 = cdolist_list_var2.rest();
        assert_sentence = cdolist_list_var2.first();
      }
    }
    finally
    {
      api_control_vars.$ke_purpose$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return assert_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 204527L)
  public static SubLObject assert_applicable_preds_for_type(final SubLObject type, SubLObject score_limit, SubLObject task)
  {
    if( score_limit == UNPROVIDED )
    {
      score_limit = $float761$0_001;
    }
    if( task == UNPROVIDED )
    {
      task = $const620$GeneralCycKETask_Allotment;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assert_mt = ConsesLow.list( $const746$DocumentReaderFollowupsForTaskMtF, task );
    SubLObject assert_sentences = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const64$InferencePSC );
    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      assert_sentences = Sequences.cconcatenate( assert_sentences, get_applicable_formula_generators_for_type( type, assert_mt, NIL, score_limit ) );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const731$DaveS, thread );
      api_control_vars.$ke_purpose$.bind( $const762$GeneralCycKE, thread );
      SubLObject cdolist_list_var = assert_sentences;
      SubLObject assert_sentence = NIL;
      assert_sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert( assert_sentence, assert_mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        assert_sentence = cdolist_list_var.first();
      }
    }
    finally
    {
      api_control_vars.$ke_purpose$.rebind( _prev_bind_2, thread );
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return assert_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 205215L)
  public static SubLObject get_applicable_formula_generators_for_type(final SubLObject type, final SubLObject assert_mt, SubLObject soon_to_add, SubLObject score_limit)
  {
    if( soon_to_add == UNPROVIDED )
    {
      soon_to_add = NIL;
    }
    if( score_limit == UNPROVIDED )
    {
      score_limit = $float761$0_001;
    }
    SubLObject assert_sentences = NIL;
    final SubLObject preds_and_scores = preds_w_scores_for_type_from_rules( type, UNPROVIDED );
    final SubLObject search_constraint = ConsesLow.cons( type, assert_mt );
    final SubLObject asserted_search_results = cae_query_search.lookup_isa_queries( search_constraint, UNPROVIDED );
    final SubLObject known_preds = Mapping.mapcar( $sym763$CAAR, asserted_search_results );
    SubLObject cdolist_list_var = preds_and_scores;
    SubLObject pred_and_score = NIL;
    pred_and_score = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pred_and_score;
      SubLObject pred = NIL;
      SubLObject score = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list745 );
      pred = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list745 );
      score = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( !score.numL( score_limit ) && NIL == subl_promotions.memberP( pred, known_preds, EQUAL, UNPROVIDED ) && ( NIL == soon_to_add || NIL == list_utilities.lengthG( genls.all_genls_among( type, dictionary
            .dictionary_lookup( soon_to_add, pred, UNPROVIDED ), UNPROVIDED, UNPROVIDED ), ZERO_INTEGER, UNPROVIDED ) ) )
        {
          if( NIL != soon_to_add )
          {
            dictionary_utilities.dictionary_push( soon_to_add, pred, type );
          }
          assert_sentences = ConsesLow.cons( ConsesLow.list( $const764$generateFormulasForElements_TermI, type, ConsesLow.list( $const765$TheSet, pred ) ), assert_sentences );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list745 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred_and_score = cdolist_list_var.first();
    }
    return assert_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 206130L)
  public static SubLObject new_term_learner_justifications(final SubLObject string, final SubLObject context_string, final SubLObject tool, SubLObject v_sources, SubLObject assert_mt)
  {
    if( v_sources == UNPROVIDED )
    {
      v_sources = NIL;
    }
    if( assert_mt == UNPROVIDED )
    {
      assert_mt = NIL;
    }
    if( NIL == v_sources )
    {
      return ConsesLow.list( new_term_learner_justification( string, context_string, tool, v_sources, assert_mt ) );
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_sources;
    SubLObject source = NIL;
    source = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( new_term_learner_justification( string, context_string, tool, source, assert_mt ), result );
      cdolist_list_var = cdolist_list_var.rest();
      source = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 206698L)
  public static SubLObject new_term_learner_justification(final SubLObject string, final SubLObject context_string, final SubLObject tool, SubLObject source, SubLObject assert_mt)
  {
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    if( assert_mt == UNPROVIDED )
    {
      assert_mt = NIL;
    }
    SubLObject just = ConsesLow.list( $kw67$STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings( string ), $kw121$LEGEND_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings( string ),
        $kw766$CONTEXT_STRING, unicode_nauts.convert_unicode_nauts_to_utf8_strings( context_string ), $kw544$TOOL, tool );
    if( NIL != assert_mt )
    {
      just = conses_high.putf( just, $kw95$ASSERT_MT, assert_mt );
    }
    if( NIL != source )
    {
      just = conses_high.putf( just, $kw767$SOURCE, source );
    }
    return just;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207181L)
  public static SubLObject term_learner_justification_p(final SubLObject just)
  {
    return list_utilities.property_list_p( just );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207266L)
  public static SubLObject term_learner_justification_string(final SubLObject just)
  {
    return conses_high.getf( just, $kw67$STRING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207353L)
  public static SubLObject term_learner_justification_context_string(final SubLObject just)
  {
    return conses_high.getf( just, $kw766$CONTEXT_STRING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207456L)
  public static SubLObject term_learner_justification_tool(final SubLObject just)
  {
    return conses_high.getf( just, $kw544$TOOL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207539L)
  public static SubLObject term_learner_justification_source(final SubLObject just)
  {
    return conses_high.getf( just, $kw767$SOURCE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207626L)
  public static SubLObject term_learner_justification_assert_mt(final SubLObject just)
  {
    final SubLObject mt_id = conses_high.getf( just, $kw95$ASSERT_MT, UNPROVIDED );
    if( NIL != mt_id )
    {
      return document_annotation_widgets.term_learner_object_from_id( mt_id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 207802L)
  public static SubLObject get_context_sentences_from_justifications(final SubLObject justifications)
  {
    SubLObject context_sentences = NIL;
    SubLObject cdolist_list_var = justifications;
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != term_learner_justification_context_string( justification ) )
      {
        final SubLObject item_var = term_learner_justification_context_string( justification );
        if( NIL == conses_high.member( item_var, context_sentences, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
        {
          context_sentences = ConsesLow.cons( item_var, context_sentences );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    return context_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 208150L)
  public static SubLObject restart_concept_search_demo_server(final SubLObject host_name, final SubLObject port_num)
  {
    os_process_utilities.make_os_process( $str769$Restarting_CCF_Demo_Cyc_Server, $str770$_cyc_java_pkg_WebServicesTester_b, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 208489L)
  public static SubLObject string_likely_denotes_collectionP(final SubLObject string, SubLObject doc)
  {
    if( doc == UNPROVIDED )
    {
      doc = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doc_string = string;
    SubLObject type_keyword = NIL;
    SubLObject timed_out = NIL;
    final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
    try
    {
      thread.throwStack.push( tag );
      final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
      try
      {
        subl_macro_promotions.$within_with_timeout$.bind( T, thread );
        SubLObject timer = NIL;
        try
        {
          final SubLObject _prev_bind_0_$248 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( FOUR_INTEGER, tag );
            type_keyword = string_typing.type_string( string );
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$248, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$249 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$249, thread );
          }
        }
      }
      finally
      {
        subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      timed_out = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw40$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym41$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL != doc )
          {
            doc_string = ( doc.isString() ? doc : document.document_string( doc ) );
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_2, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var2, $kw40$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    final SubLObject pcase_var = type_keyword;
    if( pcase_var.eql( $kw771$COLLECTION ) )
    {
      return T;
    }
    if( pcase_var.eql( $kw772$INDIVIDUAL ) )
    {
      return NIL;
    }
    return makeBoolean( NIL == string_utilities.starts_with_one_of( string, $list773 ) && NIL == named_entity_recognizer.named_entityP( doc_string, string ) && NIL != collection_via_web_searchP( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 209392L)
  public static SubLObject clear_collection_via_web_searchP()
  {
    final SubLObject cs = $collection_via_web_searchP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 209392L)
  public static SubLObject remove_collection_via_web_searchP(final SubLObject string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $collection_via_web_searchP_caching_state$.getGlobalValue(), ConsesLow.list( string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 209392L)
  public static SubLObject collection_via_web_searchP_internal(final SubLObject string)
  {
    final SubLObject plural_to_singular_collection_cutoff = $float775$0_01;
    final SubLObject count_to_mass_collection_cutoff = $float776$0_1;
    if( plural_to_singular_ratio( string, UNPROVIDED ).numG( plural_to_singular_collection_cutoff ) )
    {
      return T;
    }
    if( count_to_mass_ratio( string, UNPROVIDED ).numG( count_to_mass_collection_cutoff ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 209392L)
  public static SubLObject collection_via_web_searchP(final SubLObject string)
  {
    SubLObject caching_state = $collection_via_web_searchP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym774$COLLECTION_VIA_WEB_SEARCH_, $sym777$_COLLECTION_VIA_WEB_SEARCH__CACHING_STATE_, $int778$50, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( collection_via_web_searchP_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 215118L)
  public static SubLObject plural_to_singular_ratio(final SubLObject string, SubLObject count_method)
  {
    if( count_method == UNPROVIDED )
    {
      count_method = $sym779$YAHOO_COUNT_CACHED;
    }
    final SubLObject plural_string = ( NIL != morphology.plural_nounP( string ) ) ? string : morphology.pluralize_string( string, UNPROVIDED );
    final SubLObject singular_string = morphology.singularize_string( string, UNPROVIDED );
    final SubLObject plural_count = Functions.funcall( count_method, format_nil.format_nil_s( plural_string ) );
    final SubLObject singular_count = Functions.funcall( count_method, format_nil.format_nil_s( singular_string ) );
    if( singular_count.numE( ZERO_INTEGER ) )
    {
      return Values.values( ZERO_INTEGER, plural_count, singular_count );
    }
    return Values.values( Numbers.divide( plural_count, singular_count ), plural_count, singular_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 215668L)
  public static SubLObject count_to_mass_ratio(final SubLObject string, SubLObject count_method)
  {
    if( count_method == UNPROVIDED )
    {
      count_method = $sym779$YAHOO_COUNT_CACHED;
    }
    final SubLObject plural_string = ( NIL != morphology.plural_nounP( string ) ) ? string : morphology.pluralize_string( string, UNPROVIDED );
    final SubLObject singular_string = morphology.singularize_string( string, UNPROVIDED );
    final SubLObject mass_count = Functions.funcall( count_method, Sequences.cconcatenate( $str780$_much_, new SubLObject[] { singular_string, $str781$_
    } ) );
    final SubLObject count_count = Functions.funcall( count_method, Sequences.cconcatenate( $str782$_many_, new SubLObject[] { plural_string, $str781$_
    } ) );
    if( mass_count.numE( ZERO_INTEGER ) )
    {
      return Values.values( ZERO_INTEGER, count_count, mass_count );
    }
    return Values.values( Numbers.divide( count_count, mass_count ), count_count, mass_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 216218L)
  public static SubLObject clear_get_concept_tags_from_string()
  {
    final SubLObject cs = $get_concept_tags_from_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 216218L)
  public static SubLObject remove_get_concept_tags_from_string(final SubLObject text)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_concept_tags_from_string_caching_state$.getGlobalValue(), ConsesLow.list( text ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 216218L)
  public static SubLObject get_concept_tags_from_string_internal(final SubLObject text)
  {
    SubLObject concept_tags = NIL;
    final SubLObject lexicon = document_annotation_widgets.get_default_document_ingester_annotation_lexicon( UNPROVIDED );
    final SubLObject vector_var = document.document_paragraphs( document_annotation_widgets.new_tagged_document( text, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject par;
    SubLObject par_concept_tags;
    SubLObject vector_var_$250;
    SubLObject backwardP_var_$251;
    SubLObject length_$252;
    SubLObject v_iteration_$253;
    SubLObject element_num_$254;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cdolist_list_var_$255;
    SubLObject word_cycl;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      par = Vectors.aref( vector_var, element_num );
      par_concept_tags = NIL;
      vector_var_$250 = document.paragraph_sentences( par );
      backwardP_var_$251 = NIL;
      for( length_$252 = Sequences.length( vector_var_$250 ), v_iteration_$253 = NIL, v_iteration_$253 = ZERO_INTEGER; v_iteration_$253.numL( length_$252 ); v_iteration_$253 = Numbers.add( v_iteration_$253,
          ONE_INTEGER ) )
      {
        element_num_$254 = ( ( NIL != backwardP_var_$251 ) ? Numbers.subtract( length_$252, v_iteration_$253, ONE_INTEGER ) : v_iteration_$253 );
        sentence = Vectors.aref( vector_var_$250, element_num_$254 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cdolist_list_var_$255 = document.word_cycls( word );
          word_cycl = NIL;
          word_cycl = cdolist_list_var_$255.first();
          while ( NIL != cdolist_list_var_$255)
          {
            par_concept_tags = ConsesLow.cons( make_concept_tag( word_cycl, document.word_offset( word ), document.word_length( word ), document.word_string( word ) ), par_concept_tags );
            cdolist_list_var_$255 = cdolist_list_var_$255.rest();
            word_cycl = cdolist_list_var_$255.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
      concept_tags = ConsesLow.cons( par_concept_tags, concept_tags );
    }
    return concept_tags;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 216218L)
  public static SubLObject get_concept_tags_from_string(final SubLObject text)
  {
    SubLObject caching_state = $get_concept_tags_from_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym783$GET_CONCEPT_TAGS_FROM_STRING, $sym784$_GET_CONCEPT_TAGS_FROM_STRING_CACHING_STATE_, $int364$1024, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym785$CLEAR_GET_CONCEPT_TAGS_FROM_STRING );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, text, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_concept_tags_from_string_internal( text ) ) );
      memoization_state.caching_state_put( caching_state, text, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 217119L)
  public static SubLObject find_fillers_in_text(final SubLObject cycl_sentences, final SubLObject var_lists, final SubLObject text, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    SubLObject results = NIL;
    final SubLObject concept_tags_by_par = get_concept_tags_from_string( text );
    SubLObject cycl_sentence = NIL;
    SubLObject cycl_sentence_$256 = NIL;
    SubLObject var_list = NIL;
    SubLObject var_list_$257 = NIL;
    cycl_sentence = cycl_sentences;
    cycl_sentence_$256 = cycl_sentence.first();
    var_list = var_lists;
    var_list_$257 = var_list.first();
    while ( NIL != var_list || NIL != cycl_sentence)
    {
      SubLObject cdolist_list_var = concept_tags_by_par;
      SubLObject concept_tags = NIL;
      concept_tags = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject tags_in_formula = find_formula_args_among_concept_tags( cycl_sentence_$256, concept_tags, UNPROVIDED );
        if( NIL != tags_in_formula )
        {
          final SubLObject filler_sets = fillers_from_concept_tags_multiple( cycl_sentence_$256, var_list_$257, concept_tags, tags_in_formula, mt, UNPROVIDED );
          results = ConsesLow.cons( ConsesLow.list( cycl_sentence_$256, var_list_$257, filler_sets ), results );
        }
        cdolist_list_var = cdolist_list_var.rest();
        concept_tags = cdolist_list_var.first();
      }
      cycl_sentence = cycl_sentence.rest();
      cycl_sentence_$256 = cycl_sentence.first();
      var_list = var_list.rest();
      var_list_$257 = var_list.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 218170L)
  public static SubLObject fillers_from_concept_tags_multiple(final SubLObject cycl_sentence, final SubLObject var_list, final SubLObject concept_tags, final SubLObject tags_in_formula, SubLObject mt,
      SubLObject use_cutoffP)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    if( use_cutoffP == UNPROVIDED )
    {
      use_cutoffP = NIL;
    }
    SubLObject lists = NIL;
    SubLObject cdolist_list_var = var_list;
    SubLObject var = NIL;
    var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      lists = ConsesLow.cons( fillers_from_concept_tags( cycl_sentence, var, concept_tags, tags_in_formula, mt, use_cutoffP ), lists );
      cdolist_list_var = cdolist_list_var.rest();
      var = cdolist_list_var.first();
    }
    return list_utilities.cartesian_product( lists, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 219143L)
  public static SubLObject fillers_from_concept_tags(final SubLObject cycl_sentence, final SubLObject var, final SubLObject concept_tags, final SubLObject tags_in_formula, SubLObject mt, SubLObject use_cutoffP)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    if( use_cutoffP == UNPROVIDED )
    {
      use_cutoffP = NIL;
    }
    final SubLObject candidate_tags = tags_satisfying_arg_constraints( cycl_sentence, var, concept_tags, mt );
    SubLObject scored_fillers = NIL;
    SubLObject cdolist_list_var = candidate_tags;
    SubLObject tag = NIL;
    tag = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = score_tag( tag, tags_in_formula );
      final SubLObject cycl = get_concept_tag_cycl( tag );
      if( !score.eql( ZERO_INTEGER ) )
      {
        scored_fillers = ConsesLow.cons( make_filler( ConsesLow.cons( var, cycl ), tag, score ), scored_fillers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tag = cdolist_list_var.first();
    }
    if( NIL != use_cutoffP && NIL != scored_fillers )
    {
      final SubLObject cutoff = number_utilities.mean( Mapping.mapcar( Symbols.symbol_function( $sym786$GET_FILLER_SCORE ), scored_fillers ) );
      SubLObject fillers = NIL;
      SubLObject cdolist_list_var2 = scored_fillers;
      SubLObject filler = NIL;
      filler = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject score2 = get_filler_score( filler );
        if( score2.numGE( cutoff ) )
        {
          fillers = ConsesLow.cons( filler, fillers );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        filler = cdolist_list_var2.first();
      }
      return fillers;
    }
    return scored_fillers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 220148L)
  public static SubLObject find_formula_args_among_concept_tags(final SubLObject cycl_sentence, final SubLObject concept_tags, SubLObject first_only)
  {
    if( first_only == UNPROVIDED )
    {
      first_only = NIL;
    }
    SubLObject tags_in_formula = NIL;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( cycl_sentence, $kw493$IGNORE );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$258 = concept_tags;
      SubLObject tag = NIL;
      tag = cdolist_list_var_$258.first();
      while ( NIL != cdolist_list_var_$258)
      {
        final SubLObject concept = get_concept_tag_cycl( tag );
        if( concept.equal( v_term ) )
        {
          if( NIL != first_only )
          {
            return ConsesLow.list( tag );
          }
          tags_in_formula = ConsesLow.cons( tag, tags_in_formula );
        }
        cdolist_list_var_$258 = cdolist_list_var_$258.rest();
        tag = cdolist_list_var_$258.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return tags_in_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 220631L)
  public static SubLObject score_tag(final SubLObject tag, final SubLObject tags_in_formula)
  {
    return Numbers.minus( minimum_tag_distance( tag, tags_in_formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 220736L)
  public static SubLObject minimum_tag_distance(final SubLObject tag, final SubLObject concept_tags)
  {
    SubLObject min_distance = NIL;
    SubLObject cdolist_list_var = concept_tags;
    SubLObject other_tag = NIL;
    other_tag = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject distance = tag_distance( tag, other_tag );
      if( NIL == min_distance )
      {
        min_distance = distance;
      }
      else if( distance.numL( min_distance ) )
      {
        min_distance = distance;
      }
      cdolist_list_var = cdolist_list_var.rest();
      other_tag = cdolist_list_var.first();
    }
    return min_distance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 221082L)
  public static SubLObject tag_distance(final SubLObject tag1, final SubLObject tag2)
  {
    final SubLObject tag1offset = get_concept_tag_offset( tag1 );
    final SubLObject tag2offset = get_concept_tag_offset( tag2 );
    final SubLObject diff = Numbers.subtract( tag1offset, tag2offset );
    return Numbers.abs( diff );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 221360L)
  public static SubLObject tags_satisfying_arg_constraints(final SubLObject cycl_sentence, final SubLObject var, final SubLObject concept_tags, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const64$InferencePSC;
    }
    SubLObject result_tags = NIL;
    final SubLObject arg_constraints = html_complete.get_arg_constraints_for_var( cycl_sentence, var, mt );
    final SubLObject isa_filter = html_complete.get_isa_filter_from_arg_constraints( arg_constraints );
    final SubLObject genls_filter = html_complete.get_genls_filter_from_arg_constraints( arg_constraints );
    if( NIL != arg_constraints )
    {
      SubLObject cdolist_list_var = concept_tags;
      SubLObject tag = NIL;
      tag = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject concept = get_concept_tag_cycl( tag );
        if( NIL != html_complete.term_passes_arg_filters( concept, isa_filter, genls_filter, mt ) )
        {
          result_tags = ConsesLow.cons( tag, result_tags );
        }
        cdolist_list_var = cdolist_list_var.rest();
        tag = cdolist_list_var.first();
      }
    }
    return result_tags;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222104L)
  public static SubLObject make_concept_tag(final SubLObject concept, final SubLObject offset, final SubLObject length, final SubLObject nl)
  {
    return ConsesLow.list( concept, offset, length, nl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222349L)
  public static SubLObject get_concept_tag_cycl(final SubLObject concept_tag)
  {
    return concept_tag.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222430L)
  public static SubLObject get_concept_tag_offset(final SubLObject concept_tag)
  {
    return conses_high.second( concept_tag );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222514L)
  public static SubLObject get_concept_tag_length(final SubLObject concept_tag)
  {
    return conses_high.second( concept_tag );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222598L)
  public static SubLObject get_concept_tag_nl(final SubLObject concept_tag)
  {
    return conses_high.third( concept_tag );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222677L)
  public static SubLObject concept_tag_p(final SubLObject thing)
  {
    return makeBoolean( thing.isList() && ( NIL == thing || ( NIL != cycl_grammar.cycl_expression_p( get_concept_tag_cycl( thing ) ) && get_concept_tag_offset( thing ).isNumber() && get_concept_tag_length( thing )
        .isNumber() && get_concept_tag_nl( thing ).isString() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 222961L)
  public static SubLObject find_sentence_fillers(final SubLObject strings, final SubLObject sentence_ids, final SubLObject arg_pos_list, SubLObject user)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym787$FIND_SENTENCE_FILLERS, strings, sentence_ids, arg_pos_list, user ) );
    }
    if( NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ), $kw30$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str31$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str32$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str29$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym787$FIND_SENTENCE_FILLERS, strings, sentence_ids, arg_pos_list,
            user ) );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    final SubLObject string = unicode_strings.display_to_subl_string( ( NIL != unicode_nauts.unicode_naut_p( conses_high.caar( strings ), UNPROVIDED ) ) ? cycl_utilities.formula_arg1( conses_high.caar( strings ),
        UNPROVIDED ) : conses_high.caar( strings ), UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject sentences = reformat_sentences_and_vars( sentence_ids, arg_pos_list );
    final SubLObject var_lists = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject task = default_task_for_user( user );
    final SubLObject mt = followup_query_mt_for_userXtask( user, task );
    final SubLObject filler_results = find_fillers_in_text( sentences, var_lists, string, mt );
    SubLObject types = NIL;
    SubLObject cdolist_list_var = filler_results;
    SubLObject filler_result = NIL;
    filler_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = filler_result;
      SubLObject sentence = NIL;
      SubLObject vars = NIL;
      SubLObject answer_sets = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list788 );
      sentence = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list788 );
      vars = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list788 );
      answer_sets = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$259 = construct_sentences_from_template_and_bindings( sentence, vars, answer_sets );
        SubLObject cycl = NIL;
        cycl = cdolist_list_var_$259.first();
        while ( NIL != cdolist_list_var_$259)
        {
          if( NIL == term_learner_knownP( cycl, mt ) )
          {
            types = ConsesLow.cons( term_learner_type_for_fragment_int( cycl, mt, $list789, NIL, NIL, $kw20$DEFAULT, NIL, cure_default_generation_mt( UNPROVIDED ), $needs_approval$.getGlobalValue(), NIL, NIL, NIL,
                UNPROVIDED, UNPROVIDED ), types );
          }
          cdolist_list_var_$259 = cdolist_list_var_$259.rest();
          cycl = cdolist_list_var_$259.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list788 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      filler_result = cdolist_list_var.first();
    }
    return types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 224188L)
  public static SubLObject reformat_sentences_and_vars(final SubLObject sentence_ids, final SubLObject arg_pos_lists)
  {
    final SubLObject ordered_sentence_ids = Sort.sort( sentence_ids, $sym77$_, $sym734$SECOND );
    final SubLObject ordered_arg_poses = Sort.sort( arg_pos_lists, $sym77$_, $sym734$SECOND );
    SubLObject result_alist = NIL;
    SubLObject sentences = NIL;
    SubLObject var_lists = NIL;
    SubLObject sentence_id = NIL;
    SubLObject sentence_id_$260 = NIL;
    SubLObject arg_pos_with_index = NIL;
    SubLObject arg_pos_with_index_$261 = NIL;
    sentence_id = ordered_sentence_ids;
    sentence_id_$260 = sentence_id.first();
    arg_pos_with_index = ordered_arg_poses;
    arg_pos_with_index_$261 = arg_pos_with_index.first();
    while ( NIL != arg_pos_with_index || NIL != sentence_id)
    {
      final SubLObject sentence = document_annotation_widgets.term_learner_object_from_id( sentence_id_$260.first() );
      final SubLObject arg_pos = reader.read_from_string_ignoring_errors( arg_pos_with_index_$261.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject var = cycl_utilities.formula_arg_position( sentence, arg_pos, UNPROVIDED );
      result_alist = list_utilities.alist_push( result_alist, sentence, var, EQUAL );
      sentence_id = sentence_id.rest();
      sentence_id_$260 = sentence_id.first();
      arg_pos_with_index = arg_pos_with_index.rest();
      arg_pos_with_index_$261 = arg_pos_with_index.first();
    }
    SubLObject cdolist_list_var = result_alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject cycl_sentence = NIL;
      SubLObject var_list = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list790 );
      cycl_sentence = current.first();
      current = ( var_list = current.rest() );
      sentences = ConsesLow.cons( cycl_sentence, sentences );
      var_lists = ConsesLow.cons( var_list, var_lists );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return Values.values( sentences, var_lists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 225524L)
  public static SubLObject construct_sentences_from_template_and_bindings(final SubLObject sentence, final SubLObject vars, final SubLObject answer_sets)
  {
    SubLObject result_sentences = NIL;
    SubLObject cdolist_list_var = answer_sets;
    SubLObject answer_set = NIL;
    answer_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject temp_sentence = sentence;
      SubLObject cdolist_list_var_$262 = answer_set;
      SubLObject v_answer = NIL;
      v_answer = cdolist_list_var_$262.first();
      while ( NIL != cdolist_list_var_$262)
      {
        temp_sentence = cycl_utilities.expression_subst( get_filler_cycl( v_answer ), get_filler_var( v_answer ), temp_sentence, UNPROVIDED, UNPROVIDED );
        cdolist_list_var_$262 = cdolist_list_var_$262.rest();
        v_answer = cdolist_list_var_$262.first();
      }
      result_sentences = ConsesLow.cons( temp_sentence, result_sentences );
      cdolist_list_var = cdolist_list_var.rest();
      answer_set = cdolist_list_var.first();
    }
    return result_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 225947L)
  public static SubLObject make_filler(final SubLObject var_binding, final SubLObject concept_tag, final SubLObject score)
  {
    return ConsesLow.list( var_binding, concept_tag, score );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226224L)
  public static SubLObject get_filler_var_binding(final SubLObject filler)
  {
    return filler.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226297L)
  public static SubLObject get_filler_tag(final SubLObject filler)
  {
    return conses_high.second( filler );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226363L)
  public static SubLObject get_filler_score(final SubLObject filler)
  {
    return conses_high.third( filler );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226430L)
  public static SubLObject get_filler_cycl(final SubLObject filler)
  {
    return get_filler_var_binding( filler ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226562L)
  public static SubLObject get_filler_var(final SubLObject filler)
  {
    return get_filler_var_binding( filler ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226650L)
  public static SubLObject filler_p(final SubLObject thing)
  {
    return makeBoolean( thing.isList() && ( NIL == thing || ( get_filler_var_binding( thing ).isCons() && NIL != concept_tag_p( get_filler_tag( thing ) ) && ( get_filler_score( thing ).isNumber()
        || NIL == get_filler_score( thing ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 226915L)
  public static SubLObject get_queries_for_term(final SubLObject v_term, final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = NIL;
    }
    final SubLObject user_task = ( NIL != task ) ? task : default_task_for_user( user );
    final SubLObject followup_mt = followup_query_mt_for_userXtask( user, user_task );
    final SubLObject query_mt = query_mt_for_task( user_task );
    final SubLObject queries;
    final SubLObject raw_queries = queries = term_learner_unsorted_fragments_for_term( v_term, followup_mt, query_mt, NIL, T, NIL );
    return queries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 227483L)
  public static SubLObject get_queries_from_sentences(final SubLObject sentences, final SubLObject user, SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = NIL;
    }
    final SubLObject user_task = ( NIL != task ) ? task : default_task_for_user( user );
    final SubLObject domain_mt = query_mt_for_task( user_task );
    final SubLObject nl_mt = cure_default_generation_mt( UNPROVIDED );
    SubLObject queries = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject current_sentence = NIL;
    current_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      queries = ConsesLow.cons( term_learner_type_for_fragment_int( current_sentence, domain_mt, current_sentence, NIL, NIL, NIL, NIL, nl_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
          queries );
      cdolist_list_var = cdolist_list_var.rest();
      current_sentence = cdolist_list_var.first();
    }
    return Sequences.nreverse( queries );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject term_learner_autocomplete_native_with_cycadministrator(final SubLObject prefix, SubLObject limit, SubLObject return_attrs, SubLObject sentence, SubLObject arg_pos, SubLObject case_sensitive,
      SubLObject constants)
  {
    if( limit == UNPROVIDED )
    {
      limit = TWENTY_INTEGER;
    }
    if( return_attrs == UNPROVIDED )
    {
      return_attrs = $str50$;
    }
    if( sentence == UNPROVIDED )
    {
      sentence = NIL;
    }
    if( arg_pos == UNPROVIDED )
    {
      arg_pos = ZERO_INTEGER;
    }
    if( case_sensitive == UNPROVIDED )
    {
      case_sensitive = NIL;
    }
    if( constants == UNPROVIDED )
    {
      constants = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const338$CycAdministrator, thread );
      return term_learner_autocomplete_int( prefix, string_utilities.to_string( limit ), return_attrs, kb_utilities.compact_hl_external_id_string( sentence ), string_utilities.to_string( arg_pos ), string_utilities
          .to_string( case_sensitive ), string_utilities.to_string( constants ), T );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject valid_hierarchical_candidates_p(final SubLObject obj, final SubLObject expected_truth)
  {
    SubLObject cdolist_list_var = obj;
    SubLObject arg_and_candidates = NIL;
    arg_and_candidates = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == list_utilities.proper_list_p( arg_and_candidates ) || NIL == cycl_utilities.arg_position_p( arg_and_candidates.first() ) )
      {
        return NIL;
      }
      SubLObject cdolist_list_var_$263 = conses_high.second( arg_and_candidates );
      SubLObject candidate_hierarchy = NIL;
      candidate_hierarchy = cdolist_list_var_$263.first();
      while ( NIL != cdolist_list_var_$263)
      {
        if( NIL == candidate_renderer_p( candidate_hierarchy.first() ) )
        {
          return NIL;
        }
        cdolist_list_var_$263 = cdolist_list_var_$263.rest();
        candidate_hierarchy = cdolist_list_var_$263.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_and_candidates = cdolist_list_var.first();
    }
    return ( NIL != expected_truth ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject candidate_renderer_p(final SubLObject obj)
  {
    return makeBoolean( NIL != list_utilities.property_list_p( obj ) && NIL != conses_high.getf( obj, $kw67$STRING, UNPROVIDED ) && NIL != cycl_grammar.cycl_denotational_term_p( conses_high.getf( obj, $kw117$CYCL,
        UNPROVIDED ) ) && NIL != conses_high.getf( obj, $kw161$CYCL_ID, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject some_selection_renderer_has_string_p(final SubLObject fragments, final SubLObject desired_string)
  {
    SubLObject cdolist_list_var = fragments;
    SubLObject fragment = NIL;
    fragment = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$264 = conses_high.getf( fragment, $kw7$RENDERERS, UNPROVIDED );
      SubLObject renderer = NIL;
      renderer = cdolist_list_var_$264.first();
      while ( NIL != cdolist_list_var_$264)
      {
        if( conses_high.getf( renderer, $kw134$RENDERER_TYPE, UNPROVIDED ) == $kw135$OPEN_SELECT_RENDERER )
        {
          SubLObject cdolist_list_var_$265 = conses_high.getf( renderer, $kw137$SELECTION_RENDERERS, UNPROVIDED );
          SubLObject selection_renderer = NIL;
          selection_renderer = cdolist_list_var_$265.first();
          while ( NIL != cdolist_list_var_$265)
          {
            if( conses_high.getf( selection_renderer, $kw67$STRING, UNPROVIDED ).equalp( desired_string ) )
            {
              return T;
            }
            cdolist_list_var_$265 = cdolist_list_var_$265.rest();
            selection_renderer = cdolist_list_var_$265.first();
          }
        }
        cdolist_list_var_$264 = cdolist_list_var_$264.rest();
        renderer = cdolist_list_var_$264.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      fragment = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject term_learner_types_for_sentence_id_test_fn(final SubLObject sentence, final SubLObject user, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6)
  {
    return term_learner_types_for_sentence_id( kb_utilities.compact_hl_external_id_string( sentence ), user, arg3, arg4, arg5, arg6 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject term_learner_known_bindings_for_sentence_neg(final SubLObject arg1, final SubLObject arg2)
  {
    return term_learner_known_bindings_for_sentence( arg1, arg2, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject bindings_dont_mention(final SubLObject v_bindings, final SubLObject unmentionable)
  {
    return makeBoolean( NIL == list_utilities.tree_find( unmentionable, v_bindings, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cure-api.lisp", position = 228012L)
  public static SubLObject bindings_mention(final SubLObject v_bindings, final SubLObject unmentionable)
  {
    return list_utilities.tree_find( unmentionable, v_bindings, UNPROVIDED, UNPROVIDED );
  }

  public static SubLObject declare_cure_api_file()
  {
    SubLFiles.declareMacro( me, "new_term_learner_type", "NEW-TERM-LEARNER-TYPE" );
    SubLFiles.declareMacro( me, "term_learner_type_for_fragment_int_2", "TERM-LEARNER-TYPE-FOR-FRAGMENT-INT-2" );
    SubLFiles.declareFunction( me, "term_learner_known_meanings_for_string", "TERM-LEARNER-KNOWN-MEANINGS-FOR-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "term_learner_create_as_individualP", "TERM-LEARNER-CREATE-AS-INDIVIDUAL?", 1, 2, false );
    SubLFiles.declareFunction( me, "term_learner_meanings_for_tagged_term", "TERM-LEARNER-MEANINGS-FOR-TAGGED-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "find_or_create_term_learner_stub_term", "FIND-OR-CREATE-TERM-LEARNER-STUB-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_stub_constantP", "TERM-LEARNER-STUB-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_term_meaning", "NEW-TERM-LEARNER-TERM-MEANING", 1, 2, false );
    SubLFiles.declareFunction( me, "cure_remove_from_default_lexicon", "CURE-REMOVE-FROM-DEFAULT-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "cure_remove_lex_entry_from_default_lexicon", "CURE-REMOVE-LEX-ENTRY-FROM-DEFAULT-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_ordered_types_for_tagged_term", "TERM-LEARNER-ORDERED-TYPES-FOR-TAGGED-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "get_taxonomic_renderers_for_term", "GET-TAXONOMIC-RENDERERS-FOR-TERM", 5, 0, false );
    SubLFiles.declareFunction( me, "term_learner_min_genls", "TERM-LEARNER-MIN-GENLS", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_min_genls_int", "TERM-LEARNER-MIN-GENLS-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_min_isa", "TERM-LEARNER-MIN-ISA", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_min_isa_int", "TERM-LEARNER-MIN-ISA-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_max_specs", "TERM-LEARNER-MAX-SPECS", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_max_specs_int", "TERM-LEARNER-MAX-SPECS-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_max_instances", "TERM-LEARNER-MAX-INSTANCES", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_max_instances_int", "TERM-LEARNER-MAX-INSTANCES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_asserts_for_formula", "TERM-LEARNER-ASSERTS-FOR-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_term_learner_justifications_from_asserts", "MAKE-TERM-LEARNER-JUSTIFICATIONS-FROM-ASSERTS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_lexical_types_for_tagged_term", "TERM-LEARNER-LEXICAL-TYPES-FOR-TAGGED-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "term_learner_lexical_assertions_for_term", "TERM-LEARNER-LEXICAL-ASSERTIONS-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_ordered_types_for_term_in_document_string_merged_justifications", "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT-STRING-MERGED-JUSTIFICATIONS", 3, 1, false );
    SubLFiles.declareFunction( me, "term_learner_ordered_types_for_user_added_type", "TERM-LEARNER-ORDERED-TYPES-FOR-USER-ADDED-TYPE", 3, 2, false );
    SubLFiles.declareFunction( me, "term_learner_isa_or_genls", "TERM-LEARNER-ISA-OR-GENLS", 2, 2, false );
    SubLFiles.declareFunction( me, "clear_default_create_as_type", "CLEAR-DEFAULT-CREATE-AS-TYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_default_create_as_type", "REMOVE-DEFAULT-CREATE-AS-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "default_create_as_type_internal", "DEFAULT-CREATE-AS-TYPE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "default_create_as_type", "DEFAULT-CREATE-AS-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "new_term_learner_type_int", "NEW-TERM-LEARNER-TYPE-INT", 7, 6, false );
    SubLFiles.declareFunction( me, "free_some_variables", "FREE-SOME-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_renderer_for_cycl_string", "GET-TERM-LEARNER-RENDERER-FOR-CYCL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_renderer_for_cycl_id", "GET-TERM-LEARNER-RENDERER-FOR-CYCL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_renderer_for_cycl", "GET-TERM-LEARNER-RENDERER-FOR-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_string_renderer_for_cycl_string", "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_string_renderer_for_cycl_id", "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_string_renderer_for_cycl", "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_string_renderer_from_open_select_renderer_list", "GET-TERM-LEARNER-STRING-RENDERER-FROM-OPEN-SELECT-RENDERER-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_string_renderer", "NEW-TERM-LEARNER-STRING-RENDERER", 1, 3, false );
    SubLFiles.declareFunction( me, "new_term_learner_modifiable_string_renderer", "NEW-TERM-LEARNER-MODIFIABLE-STRING-RENDERER", 2, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_modifiable_text_renderer", "NEW-TERM-LEARNER-MODIFIABLE-TEXT-RENDERER", 2, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_open_select_renderer", "NEW-TERM-LEARNER-OPEN-SELECT-RENDERER", 2, 3, false );
    SubLFiles.declareFunction( me, "arg_constraint_string", "ARG-CONSTRAINT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_open_select_renderer_int", "NEW-TERM-LEARNER-OPEN-SELECT-RENDERER-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "get_legend_string_from_justifications", "GET-LEGEND-STRING-FROM-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_single_justification_type", "NEW-TERM-LEARNER-SINGLE-JUSTIFICATION-TYPE", 6, 3, false );
    SubLFiles.declareFunction( me, "term_learner_add_lexical_phrase", "TERM-LEARNER-ADD-LEXICAL-PHRASE", 2, 5, false );
    SubLFiles.declareFunction( me, "xml_term_learner_user_choice", "XML-TERM-LEARNER-USER-CHOICE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_substitutions_from_args", "GET-SUBSTITUTIONS-FROM-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "string_to_user_action_keyword", "STRING-TO-USER-ACTION-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_user_choice", "TERM-LEARNER-USER-CHOICE", 10, 0, false );
    SubLFiles.declareFunction( me, "xml_term_learner_create_new", "XML-TERM-LEARNER-CREATE-NEW", 1, 0, false );
    SubLFiles.declareFunction( me, "is_formula_arg_position_a_collectionP", "IS-FORMULA-ARG-POSITION-A-COLLECTION?", 2, 2, false );
    SubLFiles.declareFunction( me, "cure_assert_sentence", "CURE-ASSERT-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "cure_unassert_sentence", "CURE-UNASSERT-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "create_new_cure_term_and_assert_sentence", "CREATE-NEW-CURE-TERM-AND-ASSERT-SENTENCE", 3, 5, false );
    SubLFiles.declareFunction( me, "term_learner_create_new", "TERM-LEARNER-CREATE-NEW", 3, 5, false );
    SubLFiles.declareFunction( me, "assert_mt_for_sentence", "ASSERT-MT-FOR-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_term_will_be_collectionP", "NEW-TERM-WILL-BE-COLLECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_renderer_for_new_taxonomic_relative", "TERM-LEARNER-RENDERER-FOR-NEW-TAXONOMIC-RELATIVE", 4, 2, false );
    SubLFiles.declareFunction( me, "term_learner_get_taxonomic_sentence_for_new_type", "TERM-LEARNER-GET-TAXONOMIC-SENTENCE-FOR-NEW-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_base_sentence_from_sentence_string", "GET-BASE-SENTENCE-FROM-SENTENCE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "find_by_id_string_p", "FIND-BY-ID-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_id_string", "DECODE-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_term_learner_user_substitution", "XML-TERM-LEARNER-USER-SUBSTITUTION", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_user_substitution", "TERM-LEARNER-USER-SUBSTITUTION", 4, 5, false );
    SubLFiles.declareFunction( me, "get_nl_cycl_valid_triples_via_scg", "GET-NL-CYCL-VALID-TRIPLES-VIA-SCG", 5, 1, false );
    SubLFiles.declareFunction( me, "term_learner_constraint_list_from_string", "TERM-LEARNER-CONSTRAINT-LIST-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_valid_substitution", "CLEAR-TERM-LEARNER-VALID-SUBSTITUTION", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_valid_substitution", "REMOVE-TERM-LEARNER-VALID-SUBSTITUTION", 5, 0, false );
    SubLFiles.declareFunction( me, "term_learner_valid_substitution_internal", "TERM-LEARNER-VALID-SUBSTITUTION-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "term_learner_valid_substitution", "TERM-LEARNER-VALID-SUBSTITUTION", 5, 0, false );
    SubLFiles.declareFunction( me, "subword_nl_cycl_pairs_from_string", "SUBWORD-NL-CYCL-PAIRS-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_term_learner_possible_types_from_substitution", "XML-TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_possible_types_from_substitution", "TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION", 3, 2, false );
    SubLFiles.declareFunction( me, "term_learner_get_word_denots_from_string", "TERM-LEARNER-GET-WORD-DENOTS-FROM-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "first_true", "FIRST-TRUE", 2, 0, false );
    SubLFiles.declareFunction( me, "second_true", "SECOND-TRUE", 2, 0, false );
    SubLFiles.declareMacro( me, "term_learner_autocomplete_native", "TERM-LEARNER-AUTOCOMPLETE-NATIVE" );
    SubLFiles.declareMacro( me, "term_learner_autocomplete", "TERM-LEARNER-AUTOCOMPLETE" );
    SubLFiles.declareFunction( me, "xml_term_learner_autocomplete", "XML-TERM-LEARNER-AUTOCOMPLETE", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_autocomplete_int", "TERM-LEARNER-AUTOCOMPLETE-INT", 8, 0, false );
    SubLFiles.declareFunction( me, "get_allotted_tasks", "GET-ALLOTTED-TASKS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_get_fact_sheet_for_term", "TERM-LEARNER-GET-FACT-SHEET-FOR-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "term_learner_get_fact_sheet_updates_for_term", "TERM-LEARNER-GET-FACT-SHEET-UPDATES-FOR-TERM", 1, 2, false );
    SubLFiles.declareFunction( me, "term_learner_standard_fact_sheet_properties", "TERM-LEARNER-STANDARD-FACT-SHEET-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "term_learner_context_sensitive_fact_sheet_properties", "TERM-LEARNER-CONTEXT-SENSITIVE-FACT-SHEET-PROPERTIES", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_prefer_slot_value_fact_sheetsP", "TERM-LEARNER-PREFER-SLOT-VALUE-FACT-SHEETS?", 3, 0, false );
    SubLFiles.declareFunction( me, "forbidden_slot_value_fact_sheet_category_preds", "FORBIDDEN-SLOT-VALUE-FACT-SHEET-CATEGORY-PREDS", 3, 0, false );
    SubLFiles.declareFunction( me, "concept_naked_for_factsheetP", "CONCEPT-NAKED-FOR-FACTSHEET?", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_unmodifiable_statusP", "TERM-LEARNER-UNMODIFIABLE-STATUS?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_known_statusP", "TERM-LEARNER-KNOWN-STATUS?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_fact_status", "TERM-LEARNER-FACT-STATUS", 7, 0, false );
    SubLFiles.declareFunction( me, "cure_specify_is", "CURE-SPECIFY-IS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_query_mt_from_justifications", "FIND-QUERY-MT-FROM-JUSTIFICATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_term_learner_fact_status_int", "CLEAR-TERM-LEARNER-FACT-STATUS-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_fact_status_int", "REMOVE-TERM-LEARNER-FACT-STATUS-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_fact_status_int_internal", "TERM-LEARNER-FACT-STATUS-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_fact_status_int", "TERM-LEARNER-FACT-STATUS-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_knownP", "TERM-LEARNER-KNOWN?", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_removable_by_userP", "SENTENCE-REMOVABLE-BY-USER?", 2, 0, false );
    SubLFiles.declareFunction( me, "cure_user_has_arbitrary_deletion_privileges", "CURE-USER-HAS-ARBITRARY-DELETION-PRIVILEGES", 0, 1, false );
    SubLFiles.declareFunction( me, "derived_sentenceP", "DERIVED-SENTENCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_find_visible_assertions_cycl_internal", "TERM-LEARNER-FIND-VISIBLE-ASSERTIONS-CYCL-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_find_visible_assertions_cycl", "TERM-LEARNER-FIND-VISIBLE-ASSERTIONS-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "xml_term_learner_get_followups_for_term", "XML-TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM", 0, 1, false );
    SubLFiles.declareFunction( me, "term_learner_get_followups_for_cycl_term", "TERM-LEARNER-GET-FOLLOWUPS-FOR-CYCL-TERM", 1, 5, false );
    SubLFiles.declareFunction( me, "term_learner_get_followups_for_term", "TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM", 1, 5, false );
    SubLFiles.declareFunction( me, "term_learner_unsorted_fragments_for_term", "TERM-LEARNER-UNSORTED-FRAGMENTS-FOR-TERM", 6, 0, false );
    SubLFiles.declareFunction( me, "sort_followups", "SORT-FOLLOWUPS", 3, 2, false );
    SubLFiles.declareFunction( me, "clear_term_learner_category_label", "CLEAR-TERM-LEARNER-CATEGORY-LABEL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_category_label", "REMOVE-TERM-LEARNER-CATEGORY-LABEL", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_category_label_internal", "TERM-LEARNER-CATEGORY-LABEL-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_category_label", "TERM-LEARNER-CATEGORY-LABEL", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_get_followup_categories_for_type", "CLEAR-GET-FOLLOWUP-CATEGORIES-FOR-TYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_followup_categories_for_type", "REMOVE-GET-FOLLOWUP-CATEGORIES-FOR-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "get_followup_categories_for_type_internal", "GET-FOLLOWUP-CATEGORIES-FOR-TYPE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_followup_categories_for_type", "GET-FOLLOWUP-CATEGORIES-FOR-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_get_pred_list_order_for_type", "CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_pred_list_order_for_type", "REMOVE-GET-PRED-LIST-ORDER-FOR-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "get_pred_list_order_for_type_internal", "GET-PRED-LIST-ORDER-FOR-TYPE-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_pred_list_order_for_type", "GET-PRED-LIST-ORDER-FOR-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "categories_and_types_for_sentence_and_term", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "substitute_arg_constraints_for_vars", "SUBSTITUTE-ARG-CONSTRAINTS-FOR-VARS", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_substitutable_arg_constraint_for_reln", "CLEAR-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_substitutable_arg_constraint_for_reln", "REMOVE-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN", 2, 0, false );
    SubLFiles.declareFunction( me, "substitutable_arg_constraint_for_reln_internal", "SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "substitutable_arg_constraint_for_reln", "SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN", 2, 0, false );
    SubLFiles.declareFunction( me, "categories_and_types_for_sentence_and_term_int", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "categories_and_types_for_sentence_and_term_int_via_query", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_categories_and_types_for_sentence_and_term_int_via_indexing", "CLEAR-CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_categories_and_types_for_sentence_and_term_int_via_indexing", "REMOVE-CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING", 3, 0, false );
    SubLFiles.declareFunction( me, "categories_and_types_for_sentence_and_term_int_via_indexing_internal", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "categories_and_types_for_sentence_and_term_int_via_indexing", "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING", 3, 0, false );
    SubLFiles.declareFunction( me, "sort_by_category", "SORT-BY-CATEGORY", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_summary_pred_sort_order_for_focal_term", "CLEAR-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_summary_pred_sort_order_for_focal_term", "REMOVE-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "summary_pred_sort_order_for_focal_term_internal", "SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "summary_pred_sort_order_for_focal_term", "SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "higher_priority_followup_in_category", "HIGHER-PRIORITY-FOLLOWUP-IN-CATEGORY", 2, 1, false );
    SubLFiles.declareFunction( me, "get_justifying_type_from_fragment_justification", "GET-JUSTIFYING-TYPE-FROM-FRAGMENT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "debug_followups_for_term", "DEBUG-FOLLOWUPS-FOR-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_followup_query_mt_for_user", "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_followup_query_mt_for_user", "REMOVE-FOLLOWUP-QUERY-MT-FOR-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "followup_query_mt_for_user_internal", "FOLLOWUP-QUERY-MT-FOR-USER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "followup_query_mt_for_user", "FOLLOWUP-QUERY-MT-FOR-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "default_followup_query_mt", "DEFAULT-FOLLOWUP-QUERY-MT", 0, 2, false );
    SubLFiles.declareFunction( me, "clear_followup_query_mt_for_userXtask", "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_followup_query_mt_for_userXtask", "REMOVE-FOLLOWUP-QUERY-MT-FOR-USER&TASK", 1, 1, false );
    SubLFiles.declareFunction( me, "followup_query_mt_for_userXtask_internal", "FOLLOWUP-QUERY-MT-FOR-USER&TASK-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "followup_query_mt_for_userXtask", "FOLLOWUP-QUERY-MT-FOR-USER&TASK", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_term_learner_known_bindings_for_sentence", "CLEAR-TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_known_bindings_for_sentence", "REMOVE-TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_known_bindings_for_sentence_internal", "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_known_bindings_for_sentence", "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "cure_get_best_bindings", "CURE-GET-BEST-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_known_negated_bindings_for_sentence", "CLEAR-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_known_negated_bindings_for_sentence", "REMOVE-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_known_negated_bindings_for_sentence_internal", "TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_known_negated_bindings_for_sentence", "TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_term_learner_types_for_fragment", "CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_types_for_fragment", "REMOVE-TERM-LEARNER-TYPES-FOR-FRAGMENT", 6, 2, false );
    SubLFiles.declareFunction( me, "term_learner_types_for_fragment_internal", "TERM-LEARNER-TYPES-FOR-FRAGMENT-INTERNAL", 8, 0, false );
    SubLFiles.declareFunction( me, "term_learner_types_for_fragment", "TERM-LEARNER-TYPES-FOR-FRAGMENT", 6, 2, false );
    SubLFiles.declareFunction( me, "should_add_empty_bindingsP", "SHOULD-ADD-EMPTY-BINDINGS?", 4, 0, false );
    SubLFiles.declareFunction( me, "default_unbound_bindings_for_fragment", "DEFAULT-UNBOUND-BINDINGS-FOR-FRAGMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "binding_lists_passing_constraints", "BINDING-LISTS-PASSING-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_meets_constraints", "TERM-LEARNER-MEETS-CONSTRAINTS", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_known_value_constraints_for_sentence", "TERM-LEARNER-KNOWN-VALUE-CONSTRAINTS-FOR-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_source_renderers_for_sentence", "TERM-LEARNER-SOURCE-RENDERERS-FOR-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_sources_of_mt", "CLEAR-SOURCES-OF-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sources_of_mt", "REMOVE-SOURCES-OF-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "sources_of_mt_internal", "SOURCES-OF-MT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sources_of_mt", "SOURCES-OF-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "java_rendering_cycl", "JAVA-RENDERING-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "java_rendering_string", "JAVA-RENDERING-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "java_rendering_p", "JAVA-RENDERING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "java_rendering_to_selection_renderer", "JAVA-RENDERING-TO-SELECTION-RENDERER", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_candidate_hierarchical_replacements_for_sentence", "TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_candidate_hierarchical_replacements_for_sentence_int", "TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "convert_alphabetical_to_hierarchical_replacements", "CONVERT-ALPHABETICAL-TO-HIERARCHICAL-REPLACEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_candidate_replacements_for_sentence", "TERM-LEARNER-CANDIDATE-REPLACEMENTS-FOR-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_candidate_replacements_for_arg_positions_in_sentence", "TERM-LEARNER-CANDIDATE-REPLACEMENTS-FOR-ARG-POSITIONS-IN-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_get_arg_positions_for_terms", "CLEAR-GET-ARG-POSITIONS-FOR-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_arg_positions_for_terms", "REMOVE-GET-ARG-POSITIONS-FOR-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_arg_positions_for_terms_internal", "GET-ARG-POSITIONS-FOR-TERMS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_arg_positions_for_terms", "GET-ARG-POSITIONS-FOR-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_consolidate_javalist_for_arg_positions", "TERM-LEARNER-CONSOLIDATE-JAVALIST-FOR-ARG-POSITIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "consolidate_and_add_new_javalist_items", "CONSOLIDATE-AND-ADD-NEW-JAVALIST-ITEMS", 4, 0, false );
    SubLFiles.declareFunction( me, "term_learner_anchor_tags_for_term", "TERM-LEARNER-ANCHOR-TAGS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "argpos_subsumes", "ARGPOS-SUBSUMES", 2, 0, false );
    SubLFiles.declareFunction( me, "list_prefixP", "LIST-PREFIX?", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_type_for_fragment_int", "TERM-LEARNER-TYPE-FOR-FRAGMENT-INT", 2, 12, false );
    SubLFiles.declareFunction( me, "cure_list_item_arg_poses", "CURE-LIST-ITEM-ARG-POSES", 1, 0, false );
    SubLFiles.declareFunction( me, "cure_editable_itemP", "CURE-EDITABLE-ITEM?", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_terms_to_term_learner_terms", "CYC-TERMS-TO-TERM-LEARNER-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_term_learner_uninterpreted_renderer", "NEW-TERM-LEARNER-UNINTERPRETED-RENDERER", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_types_for_sentence", "TERM-LEARNER-TYPES-FOR-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_types_for_sentence_id", "TERM-LEARNER-TYPES-FOR-SENTENCE-ID", 2, 4, false );
    SubLFiles.declareFunction( me, "cure_possibly_duplicate_arg", "CURE-POSSIBLY-DUPLICATE-ARG", 3, 0, false );
    SubLFiles.declareFunction( me, "get_arg_positions_for_terms_in_sentence", "GET-ARG-POSITIONS-FOR-TERMS-IN-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_documentation_sentenceP", "TERM-LEARNER-DOCUMENTATION-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_initial_suggestion_from_suggestions", "GET-INITIAL-SUGGESTION-FROM-SUGGESTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_suggested_cycls_for_arg_pos", "GET-SUGGESTED-CYCLS-FOR-ARG-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_nl_cycl_valid_triples_for_cycls", "MAKE-NL-CYCL-VALID-TRIPLES-FOR-CYCLS", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_terms_mergeableP", "TERM-LEARNER-TERMS-MERGEABLE?", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_string_denots", "TERM-LEARNER-STRING-DENOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_sentence_assertibleP", "TERM-LEARNER-SENTENCE-ASSERTIBLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_sentence_assertible_intP", "TERM-LEARNER-SENTENCE-ASSERTIBLE-INT?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sentence_from_template", "GET-SENTENCE-FROM-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_relevant_sentences_from_document", "TERM-LEARNER-RELEVANT-SENTENCES-FROM-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_relevant_sentences", "TERM-LEARNER-RELEVANT-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_source_documentation_mt", "TERM-LEARNER-SOURCE-DOCUMENTATION-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "cure_default_generation_mt", "CURE-DEFAULT-GENERATION-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "term_learner_default_generation_mt", "TERM-LEARNER-DEFAULT-GENERATION-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "term_learner_cycl_terms_to_nl_strings", "TERM-LEARNER-CYCL-TERMS-TO-NL-STRINGS", 1, 2, false );
    SubLFiles.declareFunction( me, "term_learner_cycl_term_to_nl_string", "TERM-LEARNER-CYCL-TERM-TO-NL-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "merge_justifications_for_ordered_types", "MERGE-JUSTIFICATIONS-FOR-ORDERED-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_handle_user_choice", "TERM-LEARNER-HANDLE-USER-CHOICE", 9, 1, false );
    SubLFiles.declareFunction( me, "note_accepted_choice", "NOTE-ACCEPTED-CHOICE", 5, 0, false );
    SubLFiles.declareFunction( me, "get_nl_generation_for_user_added_sentence", "GET-NL-GENERATION-FOR-USER-ADDED-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_to_true", "TRANSFORM-TO-TRUE", 1, 0, false );
    SubLFiles.declareFunction( me, "term_expansion_expected_sentenceP", "TERM-EXPANSION-EXPECTED-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_mts_for_user_choice", "GET-MTS-FOR-USER-CHOICE", 4, 1, false );
    SubLFiles.declareFunction( me, "get_cure_user_addition_to_spindle_mt", "GET-CURE-USER-ADDITION-TO-SPINDLE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "cure_sort_work_by_docP", "CURE-SORT-WORK-BY-DOC?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_normalize_cure_user", "CLEAR-NORMALIZE-CURE-USER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_normalize_cure_user", "REMOVE-NORMALIZE-CURE-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "normalize_cure_user_internal", "NORMALIZE-CURE-USER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "normalize_cure_user", "NORMALIZE-CURE-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "all_justifications_have_specified_mtsP", "ALL-JUSTIFICATIONS-HAVE-SPECIFIED-MTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "user_added_term_typeP", "USER-ADDED-TERM-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_task_source_spindle", "GET-TASK-SOURCE-SPINDLE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_default_assert_mt_for_user_and_task", "CLEAR-DEFAULT-ASSERT-MT-FOR-USER-AND-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_default_assert_mt_for_user_and_task", "REMOVE-DEFAULT-ASSERT-MT-FOR-USER-AND-TASK", 1, 1, false );
    SubLFiles.declareFunction( me, "default_assert_mt_for_user_and_task_internal", "DEFAULT-ASSERT-MT-FOR-USER-AND-TASK-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "default_assert_mt_for_user_and_task", "DEFAULT-ASSERT-MT-FOR-USER-AND-TASK", 1, 1, false );
    SubLFiles.declareFunction( me, "find_or_create_base_source_for_url", "FIND-OR-CREATE-BASE-SOURCE-FOR-URL", 2, 2, false );
    SubLFiles.declareFunction( me, "ensure_source_contextualized_in_spindle", "ENSURE-SOURCE-CONTEXTUALIZED-IN-SPINDLE", 2, 2, false );
    SubLFiles.declareFunction( me, "find_or_create_subwork_source", "FIND-OR-CREATE-SUBWORK-SOURCE", 3, 0, false );
    SubLFiles.declareFunction( me, "ensure_is_hlmt_p_nart", "ENSURE-IS-HLMT-P-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_user_addition_mt_for_url", "FIND-OR-CREATE-USER-ADDITION-MT-FOR-URL", 3, 0, false );
    SubLFiles.declareFunction( me, "get_mts_for_urlXuser", "GET-MTS-FOR-URL&USER", 3, 0, false );
    SubLFiles.declareFunction( me, "get_mts_for_user", "GET-MTS-FOR-USER", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_mts_for_user", "CLEAR-MTS-FOR-USER", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_mts_for_urlXuser", "CLEAR-MTS-FOR-URL&USER", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_contents_from_mts", "CLEAR-CONTENTS-FROM-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyclist_fort", "CYCLIST-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_ordered_types_for_term_in_document_string", "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT-STRING", 3, 2, false );
    SubLFiles.declareFunction( me, "term_learner_ordered_types_for_term_in_document", "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT", 5, 0, false );
    SubLFiles.declareFunction( me, "term_learner_types_from_types_and_justifications", "TERM-LEARNER-TYPES-FROM-TYPES-AND-JUSTIFICATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "get_weight", "GET-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cycls", "GET-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cycl", "GET-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "ner_justificationP", "NER-JUSTIFICATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_types_for_term_in_document", "TERM-LEARNER-TYPES-FOR-TERM-IN-DOCUMENT", 3, 2, false );
    SubLFiles.declareFunction( me, "term_learner_collections_for_term_in_sentence", "TERM-LEARNER-COLLECTIONS-FOR-TERM-IN-SENTENCE", 2, 3, false );
    SubLFiles.declareFunction( me, "matching_named_entities", "MATCHING-NAMED-ENTITIES", 3, 2, false );
    SubLFiles.declareFunction( me, "clear_term_learner_type_prompt", "CLEAR-TERM-LEARNER-TYPE-PROMPT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_type_prompt", "REMOVE-TERM-LEARNER-TYPE-PROMPT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_type_prompt_internal", "TERM-LEARNER-TYPE-PROMPT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_type_prompt", "TERM-LEARNER-TYPE-PROMPT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_term_header_string", "CLEAR-TERM-LEARNER-TERM-HEADER-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_term_header_string", "REMOVE-TERM-LEARNER-TERM-HEADER-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_term_header_string_internal", "TERM-LEARNER-TERM-HEADER-STRING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_term_header_string", "TERM-LEARNER-TERM-HEADER-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_alternative_phrases", "TERM-LEARNER-ALTERNATIVE-PHRASES", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_term_learner_lexical_caches", "CLEAR-TERM-LEARNER-LEXICAL-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "term_learner_lexify_from_termstrings", "TERM-LEARNER-LEXIFY-FROM-TERMSTRINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "term_learner_assert_lexical_info", "TERM-LEARNER-ASSERT-LEXICAL-INFO", 4, 1, false );
    SubLFiles.declareFunction( me, "default_task_for_user", "DEFAULT-TASK-FOR-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_default_task_for_user_int", "CLEAR-DEFAULT-TASK-FOR-USER-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_default_task_for_user_int", "REMOVE-DEFAULT-TASK-FOR-USER-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "default_task_for_user_int_internal", "DEFAULT-TASK-FOR-USER-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "default_task_for_user_int", "DEFAULT-TASK-FOR-USER-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_mt_for_task", "CLEAR-QUERY-MT-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_mt_for_task", "REMOVE-QUERY-MT-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "query_mt_for_task_internal", "QUERY-MT-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_mt_for_task", "QUERY-MT-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_wff_checking_mt_for_task", "CLEAR-WFF-CHECKING-MT-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wff_checking_mt_for_task", "REMOVE-WFF-CHECKING-MT-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_checking_mt_for_task_internal", "WFF-CHECKING-MT-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "wff_checking_mt_for_task", "WFF-CHECKING-MT-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_mt_for_user_and_task", "CLEAR-QUERY-MT-FOR-USER-AND-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_mt_for_user_and_task", "REMOVE-QUERY-MT-FOR-USER-AND-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "query_mt_for_user_and_task_internal", "QUERY-MT-FOR-USER-AND-TASK-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "query_mt_for_user_and_task", "QUERY-MT-FOR-USER-AND-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_wff_checking_mt_for_user_and_task", "CLEAR-WFF-CHECKING-MT-FOR-USER-AND-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_wff_checking_mt_for_user_and_task", "REMOVE-WFF-CHECKING-MT-FOR-USER-AND-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_checking_mt_for_user_and_task_internal", "WFF-CHECKING-MT-FOR-USER-AND-TASK-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "wff_checking_mt_for_user_and_task", "WFF-CHECKING-MT-FOR-USER-AND-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "parsing_mt_for_task", "PARSING-MT-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_term_types", "XML-OUTPUT-TERM-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_term_type", "XML-OUTPUT-TERM-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_renderers", "XML-OUTPUT-RENDERERS", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_renderer", "XML-OUTPUT-RENDERER", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_selection_renderer", "XML-OUTPUT-SELECTION-RENDERER", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_concept_clouds", "TERM-LEARNER-CONCEPT-CLOUDS", 1, 2, false );
    SubLFiles.declareFunction( me, "term_learner_term_concept_cloud", "TERM-LEARNER-TERM-CONCEPT-CLOUD", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_concept_cloud_as_xml", "TERM-LEARNER-CONCEPT-CLOUD-AS-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_concept_cloud_new", "TERM-LEARNER-CONCEPT-CLOUD-NEW", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_concept_cloud_new_int", "TERM-LEARNER-CONCEPT-CLOUD-NEW-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "add_cloud_entry_for_term", "ADD-CLOUD-ENTRY-FOR-TERM", 3, 1, false );
    SubLFiles.declareFunction( me, "term_learner_term_weight", "TERM-LEARNER-TERM-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_cloud_display_nl", "CLEAR-TERM-LEARNER-CLOUD-DISPLAY-NL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_cloud_display_nl", "REMOVE-TERM-LEARNER-CLOUD-DISPLAY-NL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_cloud_display_nl_internal", "TERM-LEARNER-CLOUD-DISPLAY-NL-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_cloud_display_nl", "TERM-LEARNER-CLOUD-DISPLAY-NL", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_displayable_generalizationP", "CLEAR-TERM-LEARNER-DISPLAYABLE-GENERALIZATION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_displayable_generalizationP", "REMOVE-TERM-LEARNER-DISPLAYABLE-GENERALIZATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_displayable_generalizationP_internal", "TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_displayable_generalizationP", "TERM-LEARNER-DISPLAYABLE-GENERALIZATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_term_learner_possibly_relevant_generalizationP", "CLEAR-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_possibly_relevant_generalizationP", "REMOVE-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "term_learner_possibly_relevant_generalizationP_internal", "TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_possibly_relevant_generalizationP", "TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_term_learner_irrelevancies_for_term", "CLEAR-TERM-LEARNER-IRRELEVANCIES-FOR-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "cycl_terms_to_nl_strings_quick", "CYCL-TERMS-TO-NL-STRINGS-QUICK", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_followup_widget", "CB-SHOW-FOLLOWUP-WIDGET", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_cure_host", "CB-CURE-HOST", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_cure_port", "CB-CURE-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_cure_context_path", "CB-CURE-CONTEXT-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_possibly_add_cure_link", "CB-POSSIBLY-ADD-CURE-LINK", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_cure_link", "CB-CURE-LINK", 1, 2, false );
    SubLFiles.declareFunction( me, "clear_sentence_score", "CLEAR-SENTENCE-SCORE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sentence_score", "REMOVE-SENTENCE-SCORE", 2, 2, false );
    SubLFiles.declareFunction( me, "sentence_score_internal", "SENTENCE-SCORE-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "sentence_score", "SENTENCE-SCORE", 2, 2, false );
    SubLFiles.declareFunction( me, "clear_sentence_score_for_type", "CLEAR-SENTENCE-SCORE-FOR-TYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sentence_score_for_type", "REMOVE-SENTENCE-SCORE-FOR-TYPE", 3, 2, false );
    SubLFiles.declareFunction( me, "sentence_score_for_type_internal", "SENTENCE-SCORE-FOR-TYPE-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "sentence_score_for_type", "SENTENCE-SCORE-FOR-TYPE", 3, 2, false );
    SubLFiles.declareFunction( me, "clear_set_query_variable", "CLEAR-SET-QUERY-VARIABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_set_query_variable", "REMOVE-SET-QUERY-VARIABLE", 4, 0, false );
    SubLFiles.declareFunction( me, "set_query_variable_internal", "SET-QUERY-VARIABLE-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "set_query_variable", "SET-QUERY-VARIABLE", 4, 0, false );
    SubLFiles.declareFunction( me, "get_sentence_for_scoring", "GET-SENTENCE-FOR-SCORING", 2, 2, false );
    SubLFiles.declareFunction( me, "preds_w_scores", "PREDS-W-SCORES", 1, 1, false );
    SubLFiles.declareFunction( me, "sentences_with_scores_for_type", "SENTENCES-WITH-SCORES-FOR-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_get_fragments_for_terms_cached", "CLEAR-GET-FRAGMENTS-FOR-TERMS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_fragments_for_terms_cached", "REMOVE-GET-FRAGMENTS-FOR-TERMS-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "get_fragments_for_terms_cached_internal", "GET-FRAGMENTS-FOR-TERMS-CACHED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "get_fragments_for_terms_cached", "GET-FRAGMENTS-FOR-TERMS-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "assert_orderings", "ASSERT-ORDERINGS", 0, 2, false );
    SubLFiles.declareFunction( me, "assert_ordering_for_type", "ASSERT-ORDERING-FOR-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "pred_score", "PRED-SCORE", 2, 1, false );
    SubLFiles.declareFunction( me, "preds_w_scores_from_rules", "PREDS-W-SCORES-FROM-RULES", 1, 1, false );
    SubLFiles.declareFunction( me, "pred_score_for_type", "PRED-SCORE-FOR-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "preds_w_scores_for_type_from_rules", "PREDS-W-SCORES-FOR-TYPE-FROM-RULES", 1, 1, false );
    SubLFiles.declareFunction( me, "assert_ordering_for_type_from_rules", "ASSERT-ORDERING-FOR-TYPE-FROM-RULES", 1, 1, false );
    SubLFiles.declareFunction( me, "assert_ordering_for_specs_from_rules", "ASSERT-ORDERING-FOR-SPECS-FROM-RULES", 1, 1, false );
    SubLFiles.declareFunction( me, "assert_applicable_preds_for_specs", "ASSERT-APPLICABLE-PREDS-FOR-SPECS", 1, 2, false );
    SubLFiles.declareFunction( me, "assert_applicable_preds_for_type", "ASSERT-APPLICABLE-PREDS-FOR-TYPE", 1, 2, false );
    SubLFiles.declareFunction( me, "get_applicable_formula_generators_for_type", "GET-APPLICABLE-FORMULA-GENERATORS-FOR-TYPE", 2, 2, false );
    SubLFiles.declareFunction( me, "new_term_learner_justifications", "NEW-TERM-LEARNER-JUSTIFICATIONS", 3, 2, false );
    SubLFiles.declareFunction( me, "new_term_learner_justification", "NEW-TERM-LEARNER-JUSTIFICATION", 3, 2, false );
    SubLFiles.declareFunction( me, "term_learner_justification_p", "TERM-LEARNER-JUSTIFICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_justification_string", "TERM-LEARNER-JUSTIFICATION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_justification_context_string", "TERM-LEARNER-JUSTIFICATION-CONTEXT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_justification_tool", "TERM-LEARNER-JUSTIFICATION-TOOL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_justification_source", "TERM-LEARNER-JUSTIFICATION-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_justification_assert_mt", "TERM-LEARNER-JUSTIFICATION-ASSERT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_context_sentences_from_justifications", "GET-CONTEXT-SENTENCES-FROM-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "restart_concept_search_demo_server", "RESTART-CONCEPT-SEARCH-DEMO-SERVER", 2, 0, false );
    SubLFiles.declareFunction( me, "string_likely_denotes_collectionP", "STRING-LIKELY-DENOTES-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_collection_via_web_searchP", "CLEAR-COLLECTION-VIA-WEB-SEARCH?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_collection_via_web_searchP", "REMOVE-COLLECTION-VIA-WEB-SEARCH?", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_via_web_searchP_internal", "COLLECTION-VIA-WEB-SEARCH?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_via_web_searchP", "COLLECTION-VIA-WEB-SEARCH?", 1, 0, false );
    SubLFiles.declareFunction( me, "plural_to_singular_ratio", "PLURAL-TO-SINGULAR-RATIO", 1, 1, false );
    SubLFiles.declareFunction( me, "count_to_mass_ratio", "COUNT-TO-MASS-RATIO", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_get_concept_tags_from_string", "CLEAR-GET-CONCEPT-TAGS-FROM-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_concept_tags_from_string", "REMOVE-GET-CONCEPT-TAGS-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_concept_tags_from_string_internal", "GET-CONCEPT-TAGS-FROM-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_concept_tags_from_string", "GET-CONCEPT-TAGS-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "find_fillers_in_text", "FIND-FILLERS-IN-TEXT", 3, 1, false );
    SubLFiles.declareFunction( me, "fillers_from_concept_tags_multiple", "FILLERS-FROM-CONCEPT-TAGS-MULTIPLE", 4, 2, false );
    SubLFiles.declareFunction( me, "fillers_from_concept_tags", "FILLERS-FROM-CONCEPT-TAGS", 4, 2, false );
    SubLFiles.declareFunction( me, "find_formula_args_among_concept_tags", "FIND-FORMULA-ARGS-AMONG-CONCEPT-TAGS", 2, 1, false );
    SubLFiles.declareFunction( me, "score_tag", "SCORE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "minimum_tag_distance", "MINIMUM-TAG-DISTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "tag_distance", "TAG-DISTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "tags_satisfying_arg_constraints", "TAGS-SATISFYING-ARG-CONSTRAINTS", 3, 1, false );
    SubLFiles.declareFunction( me, "make_concept_tag", "MAKE-CONCEPT-TAG", 4, 0, false );
    SubLFiles.declareFunction( me, "get_concept_tag_cycl", "GET-CONCEPT-TAG-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_concept_tag_offset", "GET-CONCEPT-TAG-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "get_concept_tag_length", "GET-CONCEPT-TAG-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_concept_tag_nl", "GET-CONCEPT-TAG-NL", 1, 0, false );
    SubLFiles.declareFunction( me, "concept_tag_p", "CONCEPT-TAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "find_sentence_fillers", "FIND-SENTENCE-FILLERS", 3, 1, false );
    SubLFiles.declareFunction( me, "reformat_sentences_and_vars", "REFORMAT-SENTENCES-AND-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "construct_sentences_from_template_and_bindings", "CONSTRUCT-SENTENCES-FROM-TEMPLATE-AND-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "make_filler", "MAKE-FILLER", 3, 0, false );
    SubLFiles.declareFunction( me, "get_filler_var_binding", "GET-FILLER-VAR-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_filler_tag", "GET-FILLER-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "get_filler_score", "GET-FILLER-SCORE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_filler_cycl", "GET-FILLER-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_filler_var", "GET-FILLER-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "filler_p", "FILLER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_queries_for_term", "GET-QUERIES-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "get_queries_from_sentences", "GET-QUERIES-FROM-SENTENCES", 2, 1, false );
    SubLFiles.declareFunction( me, "term_learner_autocomplete_native_with_cycadministrator", "TERM-LEARNER-AUTOCOMPLETE-NATIVE-WITH-CYCADMINISTRATOR", 1, 6, false );
    SubLFiles.declareFunction( me, "valid_hierarchical_candidates_p", "VALID-HIERARCHICAL-CANDIDATES-P", 2, 0, false );
    SubLFiles.declareFunction( me, "candidate_renderer_p", "CANDIDATE-RENDERER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "some_selection_renderer_has_string_p", "SOME-SELECTION-RENDERER-HAS-STRING-P", 2, 0, false );
    SubLFiles.declareFunction( me, "term_learner_types_for_sentence_id_test_fn", "TERM-LEARNER-TYPES-FOR-SENTENCE-ID-TEST-FN", 6, 0, false );
    SubLFiles.declareFunction( me, "term_learner_known_bindings_for_sentence_neg", "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-NEG", 2, 0, false );
    SubLFiles.declareFunction( me, "bindings_dont_mention", "BINDINGS-DONT-MENTION", 2, 0, false );
    SubLFiles.declareFunction( me, "bindings_mention", "BINDINGS-MENTION", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_cure_api_file()
  {
    $term_learner_user_created_term_log_file$ = SubLFiles.defparameter( "*TERM-LEARNER-USER-CREATED-TERM-LOG-FILE*", $str0$_cyc_projects_doc_annotation_logs );
    $term_learner_user_added_types_log_file$ = SubLFiles.defparameter( "*TERM-LEARNER-USER-ADDED-TYPES-LOG-FILE*", $str1$_cyc_projects_doc_annotation_logs );
    $term_learner_accepted_meanings_log_file$ = SubLFiles.defparameter( "*TERM-LEARNER-ACCEPTED-MEANINGS-LOG-FILE*", $str2$_cyc_projects_doc_annotation_logs );
    $term_learner_use_lexical_lookup_only$ = SubLFiles.deflexical( "*TERM-LEARNER-USE-LEXICAL-LOOKUP-ONLY*", T );
    $current_tl_task$ = SubLFiles.defparameter( "*CURRENT-TL-TASK*", NIL );
    $term_learner_default_lexical_assertion_mt$ = SubLFiles.defparameter( "*TERM-LEARNER-DEFAULT-LEXICAL-ASSERTION-MT*", $const3$EnglishMt );
    $cure_edit_the_list_termsP$ = SubLFiles.defparameter( "*CURE-EDIT-THE-LIST-TERMS?*", T );
    $cure_allow_some_predicates_to_be_edited$ = SubLFiles.defparameter( "*CURE-ALLOW-SOME-PREDICATES-TO-BE-EDITED*", T );
    $default_create_as_type_caching_state$ = SubLFiles.deflexical( "*DEFAULT-CREATE-AS-TYPE-CACHING-STATE*", NIL );
    $allow_changes_to_focal_term_on_replicate$ = SubLFiles.defparameter( "*ALLOW-CHANGES-TO-FOCAL-TERM-ON-REPLICATE*", NIL );
    $term_learner_valid_substitution_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-VALID-SUBSTITUTION-CACHING-STATE*", NIL );
    $term_learner_unknown_status$ = SubLFiles.defconstant( "*TERM-LEARNER-UNKNOWN-STATUS*", ZERO_INTEGER );
    $term_learner_known_removable$ = SubLFiles.defconstant( "*TERM-LEARNER-KNOWN-REMOVABLE*", ONE_INTEGER );
    $term_learner_known_derived$ = SubLFiles.defconstant( "*TERM-LEARNER-KNOWN-DERIVED*", TWO_INTEGER );
    $term_learner_unknown_assertible$ = SubLFiles.defconstant( "*TERM-LEARNER-UNKNOWN-ASSERTIBLE*", THREE_INTEGER );
    $term_learner_impossible$ = SubLFiles.defconstant( "*TERM-LEARNER-IMPOSSIBLE*", FOUR_INTEGER );
    $term_learner_cyc_error$ = SubLFiles.defconstant( "*TERM-LEARNER-CYC-ERROR*", FIVE_INTEGER );
    $term_learner_downstream_error$ = SubLFiles.defconstant( "*TERM-LEARNER-DOWNSTREAM-ERROR*", SIX_INTEGER );
    $term_learner_working$ = SubLFiles.defconstant( "*TERM-LEARNER-WORKING*", SEVEN_INTEGER );
    $term_learner_known_not_removable$ = SubLFiles.defconstant( "*TERM-LEARNER-KNOWN-NOT-REMOVABLE*", EIGHT_INTEGER );
    $term_learner_rejected$ = SubLFiles.defconstant( "*TERM-LEARNER-REJECTED*", NINE_INTEGER );
    $term_learner_incomplete$ = SubLFiles.defconstant( "*TERM-LEARNER-INCOMPLETE*", TEN_INTEGER );
    $term_learner_unmodifiable$ = SubLFiles.deflexical( "*TERM-LEARNER-UNMODIFIABLE*", ConsesLow.list( $term_learner_known_derived$.getGlobalValue(), $term_learner_known_not_removable$.getGlobalValue() ) );
    $term_learner_fact_status_int_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-FACT-STATUS-INT-CACHING-STATE*", NIL );
    $followup_query_mt$ = SubLFiles.defparameter( "*FOLLOWUP-QUERY-MT*", $list331 );
    $term_learner_category_label_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-CATEGORY-LABEL-CACHING-STATE*", NIL );
    $get_followup_categories_for_type_caching_state$ = SubLFiles.deflexical( "*GET-FOLLOWUP-CATEGORIES-FOR-TYPE-CACHING-STATE*", NIL );
    $get_pred_list_order_for_type_caching_state$ = SubLFiles.deflexical( "*GET-PRED-LIST-ORDER-FOR-TYPE-CACHING-STATE*", NIL );
    $substitutable_arg_constraint_for_reln_caching_state$ = SubLFiles.deflexical( "*SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN-CACHING-STATE*", NIL );
    $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$ = SubLFiles.deflexical( "*CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING-CACHING-STATE*", NIL );
    $summary_pred_sort_order_for_focal_term_caching_state$ = SubLFiles.deflexical( "*SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM-CACHING-STATE*", NIL );
    $followup_query_mt_for_user_caching_state$ = SubLFiles.deflexical( "*FOLLOWUP-QUERY-MT-FOR-USER-CACHING-STATE*", NIL );
    $followup_query_mt_for_userXtask_caching_state$ = SubLFiles.deflexical( "*FOLLOWUP-QUERY-MT-FOR-USER&TASK-CACHING-STATE*", NIL );
    $cure_show_best_bindings$ = SubLFiles.defparameter( "*CURE-SHOW-BEST-BINDINGS*", T );
    $term_learner_known_bindings_for_sentence_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-CACHING-STATE*", NIL );
    $term_learner_known_negated_bindings_for_sentence_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE-CACHING-STATE*", NIL );
    $term_learner_types_for_fragment_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-TYPES-FOR-FRAGMENT-CACHING-STATE*", NIL );
    $sources_of_mt_caching_state$ = SubLFiles.deflexical( "*SOURCES-OF-MT-CACHING-STATE*", NIL );
    $get_arg_positions_for_terms_caching_state$ = SubLFiles.deflexical( "*GET-ARG-POSITIONS-FOR-TERMS-CACHING-STATE*", NIL );
    $delete_me_token$ = SubLFiles.deflexical( "*DELETE-ME-TOKEN*", Symbols.gensym( UNPROVIDED ) );
    $term_learner_source_documentation_mt$ = SubLFiles.defparameter( "*TERM-LEARNER-SOURCE-DOCUMENTATION-MT*", $kw177$UNINITIALIZED );
    $source_spindle$ = SubLFiles.defparameter( "*SOURCE-SPINDLE*", $const518$AssistedReaderSourceSpindle );
    $source_spindle_query_mt$ = SubLFiles.defparameter( "*SOURCE-SPINDLE-QUERY-MT*", $const519$AssistedReaderSourceSpindleCollec );
    $term_learner_default_generation_mt$ = SubLFiles.defparameter( "*TERM-LEARNER-DEFAULT-GENERATION-MT*", NIL );
    $normalize_cure_user_caching_state$ = SubLFiles.deflexical( "*NORMALIZE-CURE-USER-CACHING-STATE*", NIL );
    $term_learner_base_source_creation_lock$ = SubLFiles.deflexical( "*TERM-LEARNER-BASE-SOURCE-CREATION-LOCK*", Locks.make_lock( $str545$term_learner_base_source_creation ) );
    $term_learner_assert_redundant_mt_info$ = SubLFiles.defparameter( "*TERM-LEARNER-ASSERT-REDUNDANT-MT-INFO*", T );
    $default_assert_mt_for_user_and_task_caching_state$ = SubLFiles.deflexical( "*DEFAULT-ASSERT-MT-FOR-USER-AND-TASK-CACHING-STATE*", NIL );
    $term_learner_sub_source_creation_lock$ = SubLFiles.deflexical( "*TERM-LEARNER-SUB-SOURCE-CREATION-LOCK*", Locks.make_lock( $str561$term_learner_sub_source_creation_ ) );
    $needs_approval$ = SubLFiles.defconstant( "*NEEDS-APPROVAL*", $str585$needsApproval );
    $disapproved$ = SubLFiles.defconstant( "*DISAPPROVED*", $str586$disapproved );
    $approved$ = SubLFiles.defconstant( "*APPROVED*", $str587$approved );
    $term_learner_type_prompt_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-TYPE-PROMPT-CACHING-STATE*", NIL );
    $term_learner_term_header_string_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-TERM-HEADER-STRING-CACHING-STATE*", NIL );
    $default_task_for_user_int_caching_state$ = SubLFiles.deflexical( "*DEFAULT-TASK-FOR-USER-INT-CACHING-STATE*", NIL );
    $query_mt_for_task_caching_state$ = SubLFiles.deflexical( "*QUERY-MT-FOR-TASK-CACHING-STATE*", NIL );
    $wff_checking_mt_for_task_caching_state$ = SubLFiles.deflexical( "*WFF-CHECKING-MT-FOR-TASK-CACHING-STATE*", NIL );
    $query_mt_for_user_and_task_caching_state$ = SubLFiles.deflexical( "*QUERY-MT-FOR-USER-AND-TASK-CACHING-STATE*", NIL );
    $wff_checking_mt_for_user_and_task_caching_state$ = SubLFiles.deflexical( "*WFF-CHECKING-MT-FOR-USER-AND-TASK-CACHING-STATE*", NIL );
    $term_learner_cloud_display_nl_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-CLOUD-DISPLAY-NL-CACHING-STATE*", NIL );
    $term_learner_displayable_generalizationP_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-CACHING-STATE*", NIL );
    $term_learner_possibly_relevant_generalizationP_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-CACHING-STATE*", NIL );
    $term_learner_irrelevance_listener$ = SubLFiles.deflexical( "*TERM-LEARNER-IRRELEVANCE-LISTENER*", event_broker.describe_funcall_listener( $kw690$KB_MODIFY_IRRELEVANCE,
        $sym691$CLEAR_TERM_LEARNER_IRRELEVANCIES_FOR_TERM, UNPROVIDED, UNPROVIDED ) );
    $cb_show_followup_widget$ = SubLFiles.defparameter( "*CB-SHOW-FOLLOWUP-WIDGET*", NIL );
    $cb_cure_external_host$ = SubLFiles.deflexical( "*CB-CURE-EXTERNAL-HOST*", $str701$cure_cyc_com );
    $cb_cure_external_port$ = SubLFiles.deflexical( "*CB-CURE-EXTERNAL-PORT*", $int702$8080 );
    $cb_cure_external_context_path$ = SubLFiles.deflexical( "*CB-CURE-EXTERNAL-CONTEXT-PATH*", $str703$_ConceptSearch );
    $cb_cure_internal_context_path$ = SubLFiles.deflexical( "*CB-CURE-INTERNAL-CONTEXT-PATH*", $str704$_cure );
    $cb_cure_internal_host_override$ = SubLFiles.defparameter( "*CB-CURE-INTERNAL-HOST-OVERRIDE*", NIL );
    $cb_cure_internal_port_override$ = SubLFiles.defparameter( "*CB-CURE-INTERNAL-PORT-OVERRIDE*", NIL );
    $cb_show_cure_link$ = SubLFiles.deflexical( "*CB-SHOW-CURE-LINK*", NIL );
    $sentence_score_caching_state$ = SubLFiles.deflexical( "*SENTENCE-SCORE-CACHING-STATE*", NIL );
    $sentence_score_for_type_caching_state$ = SubLFiles.deflexical( "*SENTENCE-SCORE-FOR-TYPE-CACHING-STATE*", NIL );
    $set_query_variable_caching_state$ = SubLFiles.deflexical( "*SET-QUERY-VARIABLE-CACHING-STATE*", NIL );
    $get_fragments_for_terms_cached_caching_state$ = SubLFiles.deflexical( "*GET-FRAGMENTS-FOR-TERMS-CACHED-CACHING-STATE*", NIL );
    $collection_via_web_searchP_caching_state$ = SubLFiles.deflexical( "*COLLECTION-VIA-WEB-SEARCH?-CACHING-STATE*", NIL );
    $get_concept_tags_from_string_caching_state$ = SubLFiles.deflexical( "*GET-CONCEPT-TAGS-FROM-STRING-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_cure_api_file()
  {
    access_macros.register_external_symbol( $sym28$TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING );
    access_macros.register_external_symbol( $sym45$TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM );
    access_macros.register_external_symbol( $sym70$TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM );
    access_macros.register_external_symbol( $sym83$GET_TAXONOMIC_RENDERERS_FOR_TERM );
    access_macros.register_external_symbol( $sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS );
    access_macros.register_external_symbol( $sym108$TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE );
    memoization_state.note_globally_cached_function( $sym111$DEFAULT_CREATE_AS_TYPE );
    access_macros.register_external_symbol( $sym125$GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING );
    access_macros.register_external_symbol( $sym126$GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID );
    access_macros.register_external_symbol( $sym127$GET_TERM_LEARNER_RENDERER_FOR_CYCL );
    access_macros.register_external_symbol( $sym130$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING );
    access_macros.register_external_symbol( $sym131$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID );
    access_macros.register_external_symbol( $sym132$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL );
    access_macros.register_external_symbol( $sym133$GET_TERM_LEARNER_STRING_RENDERER_FROM_OPEN_SELECT_RENDERER_LIST );
    access_macros.register_external_symbol( $sym163$TERM_LEARNER_ADD_LEXICAL_PHRASE );
    html_macros.note_cgi_handler_function( $sym184$XML_TERM_LEARNER_USER_CHOICE, $kw185$XML_HANDLER );
    access_macros.register_external_symbol( $sym195$TERM_LEARNER_USER_CHOICE );
    html_macros.note_cgi_handler_function( $sym204$XML_TERM_LEARNER_CREATE_NEW, $kw185$XML_HANDLER );
    access_macros.register_external_symbol( $sym207$CURE_ASSERT_SENTENCE );
    access_macros.register_external_symbol( $sym208$CURE_UNASSERT_SENTENCE );
    access_macros.register_external_symbol( $sym209$CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE );
    access_macros.register_external_symbol( $sym214$TERM_LEARNER_CREATE_NEW );
    access_macros.register_external_symbol( $sym218$TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE );
    html_macros.note_cgi_handler_function( $sym227$XML_TERM_LEARNER_USER_SUBSTITUTION, $kw185$XML_HANDLER );
    access_macros.register_external_symbol( $sym228$TERM_LEARNER_USER_SUBSTITUTION );
    memoization_state.note_globally_cached_function( $sym238$TERM_LEARNER_VALID_SUBSTITUTION );
    html_macros.note_cgi_handler_function( $sym242$XML_TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION, $kw185$XML_HANDLER );
    access_macros.register_external_symbol( $sym243$TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION );
    utilities_macros.note_funcall_helper_function( $sym248$FIRST_TRUE );
    utilities_macros.note_funcall_helper_function( $sym234$SECOND_TRUE );
    access_macros.register_external_symbol( $sym249$TERM_LEARNER_AUTOCOMPLETE_NATIVE );
    access_macros.register_external_symbol( $sym261$TERM_LEARNER_AUTOCOMPLETE );
    html_macros.note_cgi_handler_function( $sym270$XML_TERM_LEARNER_AUTOCOMPLETE, $kw185$XML_HANDLER );
    access_macros.register_external_symbol( $sym281$GET_ALLOTTED_TASKS );
    access_macros.register_external_symbol( $sym295$TERM_LEARNER_GET_FACT_SHEET_FOR_TERM );
    access_macros.register_external_symbol( $sym299$TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM );
    access_macros.register_external_symbol( $sym323$TERM_LEARNER_FACT_STATUS );
    memoization_state.note_globally_cached_function( $sym326$TERM_LEARNER_FACT_STATUS_INT );
    memoization_state.note_memoized_function( $sym330$TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL );
    html_macros.note_cgi_handler_function( $sym340$XML_TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM, $kw185$XML_HANDLER );
    access_macros.register_external_symbol( $sym341$TERM_LEARNER_GET_FOLLOWUPS_FOR_CYCL_TERM );
    access_macros.register_external_symbol( $sym342$TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM );
    memoization_state.note_globally_cached_function( $sym353$TERM_LEARNER_CATEGORY_LABEL );
    memoization_state.note_globally_cached_function( $sym360$GET_FOLLOWUP_CATEGORIES_FOR_TYPE );
    memoization_state.note_globally_cached_function( $sym366$GET_PRED_LIST_ORDER_FOR_TYPE );
    memoization_state.note_globally_cached_function( $sym374$SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN );
    memoization_state.note_globally_cached_function( $sym396$CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING );
    memoization_state.note_globally_cached_function( $sym406$SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM );
    utilities_macros.note_funcall_helper_function( $sym349$HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY );
    memoization_state.note_globally_cached_function( $sym421$FOLLOWUP_QUERY_MT_FOR_USER );
    memoization_state.note_globally_cached_function( $sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK );
    memoization_state.note_globally_cached_function( $sym437$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE );
    memoization_state.note_globally_cached_function( $sym449$TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE );
    memoization_state.note_globally_cached_function( $sym452$TERM_LEARNER_TYPES_FOR_FRAGMENT );
    memoization_state.note_globally_cached_function( $sym469$SOURCES_OF_MT );
    access_macros.register_external_symbol( $sym475$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE );
    memoization_state.note_globally_cached_function( $sym479$GET_ARG_POSITIONS_FOR_TERMS );
    access_macros.register_external_symbol( $sym495$TERM_LEARNER_TYPES_FOR_SENTENCE );
    access_macros.register_external_symbol( $sym496$TERM_LEARNER_TYPES_FOR_SENTENCE_ID );
    generic_testing.define_test_case_table_int( $sym502$CURE_POSSIBLY_DUPLICATE_ARG, ConsesLow.list( new SubLObject[] { $kw503$TEST, Symbols.symbol_function( EQUAL ), $kw504$OWNER, NIL, $kw505$CLASSES, NIL, $kw506$KB,
      $kw507$FULL, $kw508$WORKING_, T
    } ), $list509 );
    access_macros.register_external_symbol( $sym526$TERM_LEARNER_HANDLE_USER_CHOICE );
    utilities_macros.note_funcall_helper_function( $sym528$TRANSFORM_TO_TRUE );
    utilities_macros.note_funcall_helper_function( $sym527$TERM_EXPANSION_EXPECTED_SENTENCE_ );
    memoization_state.note_globally_cached_function( $sym538$NORMALIZE_CURE_USER );
    memoization_state.note_globally_cached_function( $sym547$DEFAULT_ASSERT_MT_FOR_USER_AND_TASK );
    access_macros.register_external_symbol( $sym575$CLEAR_MTS_FOR_USER );
    access_macros.register_external_symbol( $sym576$CLEAR_MTS_FOR_URL_USER );
    access_macros.register_external_symbol( $sym583$CYCLIST_FORT );
    memoization_state.note_globally_cached_function( $sym603$TERM_LEARNER_TYPE_PROMPT );
    memoization_state.note_globally_cached_function( $sym608$TERM_LEARNER_TERM_HEADER_STRING );
    access_macros.register_external_symbol( $sym612$TERM_LEARNER_ALTERNATIVE_PHRASES );
    access_macros.register_external_symbol( $sym617$DEFAULT_TASK_FOR_USER );
    memoization_state.note_globally_cached_function( $sym618$DEFAULT_TASK_FOR_USER_INT );
    memoization_state.note_globally_cached_function( $sym623$QUERY_MT_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym626$WFF_CHECKING_MT_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym629$QUERY_MT_FOR_USER_AND_TASK );
    memoization_state.note_globally_cached_function( $sym632$WFF_CHECKING_MT_FOR_USER_AND_TASK );
    access_macros.register_external_symbol( $sym660$TERM_LEARNER_CONCEPT_CLOUDS );
    access_macros.register_external_symbol( $sym663$TERM_LEARNER_TERM_CONCEPT_CLOUD );
    access_macros.register_external_symbol( $sym666$TERM_LEARNER_CONCEPT_CLOUD_AS_XML );
    memoization_state.note_globally_cached_function( $sym679$TERM_LEARNER_CLOUD_DISPLAY_NL );
    memoization_state.note_globally_cached_function( $sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_ );
    memoization_state.note_globally_cached_function( $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_ );
    kb_modification_event.register_listener_with_kb_modifications_event_dispatcher( $term_learner_irrelevance_listener$.getGlobalValue() );
    access_macros.register_external_symbol( $sym692$CYCL_TERMS_TO_NL_STRINGS_QUICK );
    utilities_macros.register_html_state_variable( $sym693$_CB_SHOW_FOLLOWUP_WIDGET_ );
    Hashtables.sethash( $kw699$CURE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str700$cure_png, NIL ) );
    utilities_macros.register_html_state_variable( $sym705$_CB_CURE_INTERNAL_HOST_OVERRIDE_ );
    utilities_macros.register_html_state_variable( $sym706$_CB_CURE_INTERNAL_PORT_OVERRIDE_ );
    memoization_state.note_globally_cached_function( $sym722$SENTENCE_SCORE );
    memoization_state.note_globally_cached_function( $sym726$SENTENCE_SCORE_FOR_TYPE );
    memoization_state.note_globally_cached_function( $sym729$SET_QUERY_VARIABLE );
    memoization_state.note_globally_cached_function( $sym735$GET_FRAGMENTS_FOR_TERMS_CACHED );
    access_macros.register_external_symbol( $sym768$RESTART_CONCEPT_SEARCH_DEMO_SERVER );
    memoization_state.note_globally_cached_function( $sym774$COLLECTION_VIA_WEB_SEARCH_ );
    memoization_state.note_globally_cached_function( $sym783$GET_CONCEPT_TAGS_FROM_STRING );
    access_macros.register_external_symbol( $sym787$FIND_SENTENCE_FILLERS );
    access_macros.register_external_symbol( $sym791$GET_QUERIES_FOR_TERM );
    access_macros.register_external_symbol( $sym792$GET_QUERIES_FROM_SENTENCES );
    generic_testing.define_test_case_table_int( $sym793$TERM_LEARNER_AUTOCOMPLETE_NATIVE_WITH_CYCADMINISTRATOR, ConsesLow.list( new SubLObject[] { $kw503$TEST, $sym794$LENGTH_, $kw504$OWNER, NIL, $kw505$CLASSES, NIL,
      $kw506$KB, $kw507$FULL, $kw508$WORKING_, T
    } ), $list795 );
    generic_testing.define_test_case_table_int( $sym796$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE_INT, ConsesLow.list( new SubLObject[] { $kw503$TEST, $sym797$VALID_HIERARCHICAL_CANDIDATES_P,
      $kw504$OWNER, NIL, $kw505$CLASSES, NIL, $kw506$KB, $kw507$FULL, $kw508$WORKING_, T
    } ), $list798 );
    generic_testing.define_test_case_table_int( $sym799$TERM_LEARNER_TYPES_FOR_SENTENCE_ID_TEST_FN, ConsesLow.list( new SubLObject[] { $kw503$TEST, $sym800$SOME_SELECTION_RENDERER_HAS_STRING_P, $kw504$OWNER, NIL,
      $kw505$CLASSES, NIL, $kw506$KB, $kw507$FULL, $kw508$WORKING_, T
    } ), $list801 );
    generic_testing.define_test_case_table_int( $sym802$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_NEG, ConsesLow.list( new SubLObject[] { $kw503$TEST, $sym803$BINDINGS_DONT_MENTION, $kw504$OWNER, NIL, $kw505$CLASSES, NIL,
      $kw506$KB, $kw507$FULL, $kw508$WORKING_, T
    } ), $list804 );
    generic_testing.define_test_case_table_int( $sym437$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE, ConsesLow.list( new SubLObject[] { $kw503$TEST, $sym805$BINDINGS_MENTION, $kw504$OWNER, NIL, $kw505$CLASSES, NIL,
      $kw506$KB, $kw507$FULL, $kw508$WORKING_, T
    } ), $list806 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cure_api_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cure_api_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cure_api_file();
  }
  static
  {
    me = new cure_api();
    $term_learner_user_created_term_log_file$ = null;
    $term_learner_user_added_types_log_file$ = null;
    $term_learner_accepted_meanings_log_file$ = null;
    $term_learner_use_lexical_lookup_only$ = null;
    $current_tl_task$ = null;
    $term_learner_default_lexical_assertion_mt$ = null;
    $cure_edit_the_list_termsP$ = null;
    $cure_allow_some_predicates_to_be_edited$ = null;
    $default_create_as_type_caching_state$ = null;
    $allow_changes_to_focal_term_on_replicate$ = null;
    $term_learner_valid_substitution_caching_state$ = null;
    $term_learner_unknown_status$ = null;
    $term_learner_known_removable$ = null;
    $term_learner_known_derived$ = null;
    $term_learner_unknown_assertible$ = null;
    $term_learner_impossible$ = null;
    $term_learner_cyc_error$ = null;
    $term_learner_downstream_error$ = null;
    $term_learner_working$ = null;
    $term_learner_known_not_removable$ = null;
    $term_learner_rejected$ = null;
    $term_learner_incomplete$ = null;
    $term_learner_unmodifiable$ = null;
    $term_learner_fact_status_int_caching_state$ = null;
    $followup_query_mt$ = null;
    $term_learner_category_label_caching_state$ = null;
    $get_followup_categories_for_type_caching_state$ = null;
    $get_pred_list_order_for_type_caching_state$ = null;
    $substitutable_arg_constraint_for_reln_caching_state$ = null;
    $categories_and_types_for_sentence_and_term_int_via_indexing_caching_state$ = null;
    $summary_pred_sort_order_for_focal_term_caching_state$ = null;
    $followup_query_mt_for_user_caching_state$ = null;
    $followup_query_mt_for_userXtask_caching_state$ = null;
    $cure_show_best_bindings$ = null;
    $term_learner_known_bindings_for_sentence_caching_state$ = null;
    $term_learner_known_negated_bindings_for_sentence_caching_state$ = null;
    $term_learner_types_for_fragment_caching_state$ = null;
    $sources_of_mt_caching_state$ = null;
    $get_arg_positions_for_terms_caching_state$ = null;
    $delete_me_token$ = null;
    $term_learner_source_documentation_mt$ = null;
    $source_spindle$ = null;
    $source_spindle_query_mt$ = null;
    $term_learner_default_generation_mt$ = null;
    $normalize_cure_user_caching_state$ = null;
    $term_learner_base_source_creation_lock$ = null;
    $term_learner_assert_redundant_mt_info$ = null;
    $default_assert_mt_for_user_and_task_caching_state$ = null;
    $term_learner_sub_source_creation_lock$ = null;
    $needs_approval$ = null;
    $disapproved$ = null;
    $approved$ = null;
    $term_learner_type_prompt_caching_state$ = null;
    $term_learner_term_header_string_caching_state$ = null;
    $default_task_for_user_int_caching_state$ = null;
    $query_mt_for_task_caching_state$ = null;
    $wff_checking_mt_for_task_caching_state$ = null;
    $query_mt_for_user_and_task_caching_state$ = null;
    $wff_checking_mt_for_user_and_task_caching_state$ = null;
    $term_learner_cloud_display_nl_caching_state$ = null;
    $term_learner_displayable_generalizationP_caching_state$ = null;
    $term_learner_possibly_relevant_generalizationP_caching_state$ = null;
    $term_learner_irrelevance_listener$ = null;
    $cb_show_followup_widget$ = null;
    $cb_cure_external_host$ = null;
    $cb_cure_external_port$ = null;
    $cb_cure_external_context_path$ = null;
    $cb_cure_internal_context_path$ = null;
    $cb_cure_internal_host_override$ = null;
    $cb_cure_internal_port_override$ = null;
    $cb_show_cure_link$ = null;
    $sentence_score_caching_state$ = null;
    $sentence_score_for_type_caching_state$ = null;
    $set_query_variable_caching_state$ = null;
    $get_fragments_for_terms_cached_caching_state$ = null;
    $collection_via_web_searchP_caching_state$ = null;
    $get_concept_tags_from_string_caching_state$ = null;
    $str0$_cyc_projects_doc_annotation_logs = makeString( "/cyc/projects/doc-annotation/logs/user-created-terms.log" );
    $str1$_cyc_projects_doc_annotation_logs = makeString( "/cyc/projects/doc-annotation/logs/user-added-types.log" );
    $str2$_cyc_projects_doc_annotation_logs = makeString( "/cyc/projects/doc-annotation/logs/accepted-meanings.log" );
    $const3$EnglishMt = constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "CYCL" ), makeSymbol( "WEIGHT" ), makeSymbol( "JUSTIFICATIONS" ), makeSymbol( "FRAGMENT-JUSTIFICATION" ), makeSymbol( "NL-STRING" ), makeSymbol(
        "ASSERT-SENTENCE" ), makeSymbol( "STATUS-CODE" ), makeSymbol( "&KEY" ), makeSymbol( "RENDERERS" ), makeSymbol( "ORIGINAL-CYCL" ), ConsesLow.list( makeSymbol( "DISPLAY" ), T ), ConsesLow.list( makeSymbol(
            "REQUIRED" ), T ), makeSymbol( "APPROVAL-CODE" ), makeSymbol( "UNASSERTIBLE-SENTENCE-IDS" )
    } );
    $list5 = ConsesLow.list( makeKeyword( "RENDERERS" ), makeKeyword( "ORIGINAL-CYCL" ), makeKeyword( "DISPLAY" ), makeKeyword( "REQUIRED" ), makeKeyword( "APPROVAL-CODE" ), makeKeyword( "UNASSERTIBLE-SENTENCE-IDS" ) );
    $kw6$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw7$RENDERERS = makeKeyword( "RENDERERS" );
    $kw8$ORIGINAL_CYCL = makeKeyword( "ORIGINAL-CYCL" );
    $kw9$DISPLAY = makeKeyword( "DISPLAY" );
    $kw10$REQUIRED = makeKeyword( "REQUIRED" );
    $kw11$APPROVAL_CODE = makeKeyword( "APPROVAL-CODE" );
    $kw12$UNASSERTIBLE_SENTENCE_IDS = makeKeyword( "UNASSERTIBLE-SENTENCE-IDS" );
    $sym13$NEW_TERM_LEARNER_TYPE_INT = makeSymbol( "NEW-TERM-LEARNER-TYPE-INT" );
    $list14 = ConsesLow.list( new SubLObject[] { makeSymbol( "SENTENCE" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "&KEY" ), makeSymbol( "ORIGINAL-SENTENCE" ), makeSymbol( "CURRENT-BINDINGS" ), makeSymbol(
        "SUGGESTIONS" ), ConsesLow.list( makeSymbol( "JUSTIFICATIONS" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "FRAGMENT-JUSTIFICATION" ) ), ConsesLow.list( makeSymbol( "NL-MT" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "CURE-DEFAULT-GENERATION-MT" ) ) ) ), ConsesLow.list( makeSymbol( "APPROVAL-CODE" ), NIL ), ConsesLow.list( makeSymbol( "DISPLAY-CYCL" ), NIL ), ConsesLow
                .list( makeSymbol( "STATUS" ), NIL ), ConsesLow.list( makeSymbol( "CLARIFYING-CYCL" ), NIL )
    } );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "ORIGINAL-SENTENCE" ), makeKeyword( "CURRENT-BINDINGS" ), makeKeyword( "SUGGESTIONS" ), makeKeyword( "JUSTIFICATIONS" ), makeKeyword(
        "FRAGMENT-JUSTIFICATION" ), makeKeyword( "NL-MT" ), makeKeyword( "APPROVAL-CODE" ), makeKeyword( "DISPLAY-CYCL" ), makeKeyword( "STATUS" ), makeKeyword( "CLARIFYING-CYCL" )
    } );
    $kw16$ORIGINAL_SENTENCE = makeKeyword( "ORIGINAL-SENTENCE" );
    $kw17$CURRENT_BINDINGS = makeKeyword( "CURRENT-BINDINGS" );
    $kw18$SUGGESTIONS = makeKeyword( "SUGGESTIONS" );
    $kw19$JUSTIFICATIONS = makeKeyword( "JUSTIFICATIONS" );
    $kw20$DEFAULT = makeKeyword( "DEFAULT" );
    $kw21$FRAGMENT_JUSTIFICATION = makeKeyword( "FRAGMENT-JUSTIFICATION" );
    $kw22$NL_MT = makeKeyword( "NL-MT" );
    $list23 = ConsesLow.list( makeSymbol( "CURE-DEFAULT-GENERATION-MT" ) );
    $kw24$DISPLAY_CYCL = makeKeyword( "DISPLAY-CYCL" );
    $kw25$STATUS = makeKeyword( "STATUS" );
    $kw26$CLARIFYING_CYCL = makeKeyword( "CLARIFYING-CYCL" );
    $sym27$TERM_LEARNER_TYPE_FOR_FRAGMENT_INT = makeSymbol( "TERM-LEARNER-TYPE-FOR-FRAGMENT-INT" );
    $sym28$TERM_LEARNER_KNOWN_MEANINGS_FOR_STRING = makeSymbol( "TERM-LEARNER-KNOWN-MEANINGS-FOR-STRING" );
    $str29$___A__entering__S__ = makeString( "~&~A: entering ~S~%" );
    $kw30$APPEND = makeKeyword( "APPEND" );
    $str31$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str32$writing_to__S = makeString( "writing to ~S" );
    $sym33$LEARN = makeSymbol( "LEARN" );
    $sym34$GET = makeSymbol( "GET" );
    $kw35$IS_NER_ENTRY_ = makeKeyword( "IS-NER-ENTRY?" );
    $kw36$DENOT = makeKeyword( "DENOT" );
    $str37$no_new_creation = makeString( "no-new-creation" );
    $const38$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const39$CycAssistedDocumentReader = constant_handles.reader_make_constant_shell( makeString( "CycAssistedDocumentReader" ) );
    $kw40$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym41$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str42$_input_date___A___S__input___ = makeString( "<input date='~A'>~S</input>~%" );
    $str43$Currently_Unknown_to_Cyc = makeString( "Currently Unknown to Cyc" );
    $str44$vocabMarking = makeString( "vocabMarking" );
    $sym45$TERM_LEARNER_MEANINGS_FOR_TAGGED_TERM = makeSymbol( "TERM-LEARNER-MEANINGS-FOR-TAGGED-TERM" );
    $sym46$TERM_LEARNER_OBJECT_FROM_ID = makeSymbol( "TERM-LEARNER-OBJECT-FROM-ID" );
    $list47 = ConsesLow.list( Characters.CHAR_space );
    $const48$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $const49$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $str50$ = makeString( "" );
    $kw51$UPCASE = makeKeyword( "UPCASE" );
    $sym52$CONTROL_CHAR_P = makeSymbol( "CONTROL-CHAR-P" );
    $const53$inProgressTerm = constant_handles.reader_make_constant_shell( makeString( "inProgressTerm" ) );
    $const54$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const55$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const56$DocIngesterUserCreatedTerm = constant_handles.reader_make_constant_shell( makeString( "DocIngesterUserCreatedTerm" ) );
    $const57$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $list58 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DocIngesterUserCreatedTerm" ) ) );
    $const59$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $const60$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const61$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $sym62$__MT = makeSymbol( "??MT" );
    $list63 = ConsesLow.list( makeSymbol( "??STRING" ) );
    $const64$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str65$___ = makeString( "..." );
    $kw66$MEANING = makeKeyword( "MEANING" );
    $kw67$STRING = makeKeyword( "STRING" );
    $sym68$DELETE_ENTRY_FROM_STRING = makeSymbol( "DELETE-ENTRY-FROM-STRING" );
    $sym69$LEARNED = makeSymbol( "LEARNED" );
    $sym70$TERM_LEARNER_ORDERED_TYPES_FOR_TAGGED_TERM = makeSymbol( "TERM-LEARNER-ORDERED-TYPES-FOR-TAGGED-TERM" );
    $list71 = ConsesLow.list( makeSymbol( "HEADER-STRING" ), makeSymbol( "ALT-PHRASES" ) );
    $sym72$_STRING = makeSymbol( "?STRING" );
    $const73$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $list74 = ConsesLow.list( makeSymbol( "?STRING" ) );
    $const75$is_Underspecified = constant_handles.reader_make_constant_shell( makeString( "is-Underspecified" ) );
    $const76$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym77$_ = makeSymbol( ">" );
    $sym78$GET_WEIGHT = makeSymbol( "GET-WEIGHT" );
    $kw79$TYPE_PROMPT = makeKeyword( "TYPE-PROMPT" );
    $kw80$TYPE_HEADER = makeKeyword( "TYPE-HEADER" );
    $kw81$TYPE_ALT_PHRASES = makeKeyword( "TYPE-ALT-PHRASES" );
    $kw82$LEXICAL_TYPES = makeKeyword( "LEXICAL-TYPES" );
    $sym83$GET_TAXONOMIC_RENDERERS_FOR_TERM = makeSymbol( "GET-TAXONOMIC-RENDERERS-FOR-TERM" );
    $str84$specs = makeString( "specs" );
    $str85$instances = makeString( "instances" );
    $str86$superiors = makeString( "superiors" );
    $str87$genls = makeString( "genls" );
    $str88$isa = makeString( "isa" );
    $str89$Unimplemented_attempt_to_get__S_f = makeString( "Unimplemented attempt to get ~S for ~S" );
    $str90$string = makeString( "string" );
    $sym91$_EXIT = makeSymbol( "%EXIT" );
    $sym92$TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_ = makeSymbol( "TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?" );
    $sym93$GENLS_ = makeSymbol( "GENLS?" );
    $kw94$ASSERT_SENTENCE = makeKeyword( "ASSERT-SENTENCE" );
    $kw95$ASSERT_MT = makeKeyword( "ASSERT-MT" );
    $sym96$ASSERTION_IST_FORMULA = makeSymbol( "ASSERTION-IST-FORMULA" );
    $kw97$USER = makeKeyword( "USER" );
    $float98$0_9 = makeDouble( 0.9 );
    $sym99$_EXCLUDE_VULGARITIES__ = makeSymbol( "*EXCLUDE-VULGARITIES?*" );
    $list100 = ConsesLow.list( makeSymbol( "*EXCLUDE-INDIRECT-RELATIONS?*" ), makeSymbol( "*EXCLUDE-VULGARITIES?*" ), makeSymbol( "*EXCLUDE-SLANG?*" ), makeSymbol( "*EXCLUDE-ARCHAIC-SPEECH?*" ) );
    $sym101$_EXCLUDE_SLANG__ = makeSymbol( "*EXCLUDE-SLANG?*" );
    $sym102$_EXCLUDE_ARCHAIC_SPEECH__ = makeSymbol( "*EXCLUDE-ARCHAIC-SPEECH?*" );
    $sym103$_EXCLUDE_INDIRECT_RELATIONS__ = makeSymbol( "*EXCLUDE-INDIRECT-RELATIONS?*" );
    $sym104$SHORTER_P = makeSymbol( "SHORTER-P" );
    $sym105$TERM_LEARNER_ORDERED_TYPES_FOR_TERM_IN_DOCUMENT_STRING_MERGED_JUS = makeSymbol( "TERM-LEARNER-ORDERED-TYPES-FOR-TERM-IN-DOCUMENT-STRING-MERGED-JUSTIFICATIONS" );
    $str106$_ = makeString( " " );
    $str107$_ = makeString( "~" );
    $sym108$TERM_LEARNER_ORDERED_TYPES_FOR_USER_ADDED_TYPE = makeSymbol( "TERM-LEARNER-ORDERED-TYPES-FOR-USER-ADDED-TYPE" );
    $str109$_input_cyctermid___A__date___A___ = makeString( "<input cyctermid='~A' date='~A'>~S</input>~%" );
    $const110$CollectionType = constant_handles.reader_make_constant_shell( makeString( "CollectionType" ) );
    $sym111$DEFAULT_CREATE_AS_TYPE = makeSymbol( "DEFAULT-CREATE-AS-TYPE" );
    $sym112$_PRED = makeSymbol( "?PRED" );
    $const113$defaultAutotypeSuggestionFromType = constant_handles.reader_make_constant_shell( makeString( "defaultAutotypeSuggestionFromType" ) );
    $list114 = ConsesLow.list( makeSymbol( "?PRED" ) );
    $list115 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER );
    $sym116$_DEFAULT_CREATE_AS_TYPE_CACHING_STATE_ = makeSymbol( "*DEFAULT-CREATE-AS-TYPE-CACHING-STATE*" );
    $kw117$CYCL = makeKeyword( "CYCL" );
    $kw118$WEIGHT = makeKeyword( "WEIGHT" );
    $kw119$CONCEPT_ID = makeKeyword( "CONCEPT-ID" );
    $kw120$NL_STRING = makeKeyword( "NL-STRING" );
    $kw121$LEGEND_STRING = makeKeyword( "LEGEND-STRING" );
    $kw122$ASSERT_SENTENCE_ID = makeKeyword( "ASSERT-SENTENCE-ID" );
    $kw123$STATUS_CODE = makeKeyword( "STATUS-CODE" );
    $kw124$REPLICATION_SENTENCE_ID = makeKeyword( "REPLICATION-SENTENCE-ID" );
    $sym125$GET_TERM_LEARNER_RENDERER_FOR_CYCL_STRING = makeSymbol( "GET-TERM-LEARNER-RENDERER-FOR-CYCL-STRING" );
    $sym126$GET_TERM_LEARNER_RENDERER_FOR_CYCL_ID = makeSymbol( "GET-TERM-LEARNER-RENDERER-FOR-CYCL-ID" );
    $sym127$GET_TERM_LEARNER_RENDERER_FOR_CYCL = makeSymbol( "GET-TERM-LEARNER-RENDERER-FOR-CYCL" );
    $list128 = ConsesLow.list( makeKeyword( "GENLS" ), ConsesLow.list( ConsesLow.list( makeKeyword( "CYCL" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) );
    $list129 = ConsesLow.list( makeKeyword( "ISA" ), ConsesLow.list( ConsesLow.list( makeKeyword( "CYCL" ), constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) ) ) );
    $sym130$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_STRING = makeSymbol( "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-STRING" );
    $sym131$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL_ID = makeSymbol( "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL-ID" );
    $sym132$GET_TERM_LEARNER_STRING_RENDERER_FOR_CYCL = makeSymbol( "GET-TERM-LEARNER-STRING-RENDERER-FOR-CYCL" );
    $sym133$GET_TERM_LEARNER_STRING_RENDERER_FROM_OPEN_SELECT_RENDERER_LIST = makeSymbol( "GET-TERM-LEARNER-STRING-RENDERER-FROM-OPEN-SELECT-RENDERER-LIST" );
    $kw134$RENDERER_TYPE = makeKeyword( "RENDERER-TYPE" );
    $kw135$OPEN_SELECT_RENDERER = makeKeyword( "OPEN-SELECT-RENDERER" );
    $kw136$INITIALLY_SELECTED = makeKeyword( "INITIALLY-SELECTED" );
    $kw137$SELECTION_RENDERERS = makeKeyword( "SELECTION-RENDERERS" );
    $kw138$STRING_RENDERER = makeKeyword( "STRING-RENDERER" );
    $kw139$DISPLAY_LINK = makeKeyword( "DISPLAY-LINK" );
    $kw140$PPH_EMPTY_CYCL = makeKeyword( "PPH-EMPTY-CYCL" );
    $kw141$GENLS = makeKeyword( "GENLS" );
    $kw142$GENLS_CONSTRAINTS = makeKeyword( "GENLS-CONSTRAINTS" );
    $kw143$ISA = makeKeyword( "ISA" );
    $kw144$ISA_CONSTRAINTS = makeKeyword( "ISA-CONSTRAINTS" );
    $kw145$MODIFIABLE_STRING_RENDERER = makeKeyword( "MODIFIABLE-STRING-RENDERER" );
    $kw146$ARG_POS = makeKeyword( "ARG-POS" );
    $kw147$MODIFIABLE_TEXT_RENDERER = makeKeyword( "MODIFIABLE-TEXT-RENDERER" );
    $str148$Some_other_ = makeString( "Some other " );
    $str149$Something_else = makeString( "Something else" );
    $list150 = ConsesLow.list( makeKeyword( "VALID" ), T, makeKeyword( "CYCL" ), makeString( "newValue" ), makeKeyword( "CYCL-ID" ), makeString( "newValue" ) );
    $kw151$CONSTRAINT_STRING = makeKeyword( "CONSTRAINT-STRING" );
    $kw152$ALLOW_DUPLICATION = makeKeyword( "ALLOW-DUPLICATION" );
    $sym153$_ = makeSymbol( "<" );
    $sym154$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $sym155$THCL_FORT_ = makeSymbol( "THCL-FORT?" );
    $list156 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) );
    $kw157$TEXT_MATCHES = makeKeyword( "TEXT-MATCHES" );
    $list158 = ConsesLow.list( makeSymbol( "NL" ), makeSymbol( "CYCL" ), makeSymbol( "VALID" ) );
    $kw159$VALID = makeKeyword( "VALID" );
    $str160$newValue = makeString( "newValue" );
    $kw161$CYCL_ID = makeKeyword( "CYCL-ID" );
    $kw162$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $sym163$TERM_LEARNER_ADD_LEXICAL_PHRASE = makeSymbol( "TERM-LEARNER-ADD-LEXICAL-PHRASE" );
    $str164$userAction = makeString( "userAction" );
    $str165$termString = makeString( "termString" );
    $str166$choiceid = makeString( "choiceid" );
    $str167$justifications = makeString( "justifications" );
    $str168$sentenceId = makeString( "sentenceId" );
    $str169$termId = makeString( "termId" );
    $str170$title = makeString( "title" );
    $str171$url = makeString( "url" );
    $str172$code = makeString( "code" );
    $kw173$SENTENCE_ID = makeKeyword( "SENTENCE-ID" );
    $kw174$NEW_SENTENCE_ID = makeKeyword( "NEW-SENTENCE-ID" );
    $str175$newSentenceId = makeString( "newSentenceId" );
    $str176$status = makeString( "status" );
    $kw177$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw178$NEW_CYCL = makeKeyword( "NEW-CYCL" );
    $str179$newCycLSentenceHLIDString = makeString( "newCycLSentenceHLIDString" );
    $kw180$NEW_CYCL_HL_ID = makeKeyword( "NEW-CYCL-HL-ID" );
    $str181$newCycLSentenceDisplayString = makeString( "newCycLSentenceDisplayString" );
    $str182$newNLSentence = makeString( "newNLSentence" );
    $str183$justification = makeString( "justification" );
    $sym184$XML_TERM_LEARNER_USER_CHOICE = makeSymbol( "XML-TERM-LEARNER-USER-CHOICE" );
    $kw185$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $list186 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $str187$cyclarg = makeString( "cyclarg" );
    $str188$stringarg = makeString( "stringarg" );
    $str189$assert = makeString( "assert" );
    $kw190$ASSERT = makeKeyword( "ASSERT" );
    $str191$replace = makeString( "replace" );
    $kw192$REPLACE = makeKeyword( "REPLACE" );
    $str193$unassert = makeString( "unassert" );
    $kw194$UNASSERT = makeKeyword( "UNASSERT" );
    $sym195$TERM_LEARNER_USER_CHOICE = makeSymbol( "TERM-LEARNER-USER-CHOICE" );
    $kw196$REJECT = makeKeyword( "REJECT" );
    $list197 = ConsesLow.list( makeKeyword( "REPLACE" ), makeKeyword( "ASSERT" ) );
    $list198 = ConsesLow.list( makeSymbol( "ARGPOS-STRING" ), makeSymbol( "RAW-NEW-VALUE" ), makeSymbol( "TYPE" ) );
    $kw199$ACCEPT = makeKeyword( "ACCEPT" );
    $kw200$NEW_NL_SENTENCE = makeKeyword( "NEW-NL-SENTENCE" );
    $kw201$NEW_CYCL_SENTENCE_STRING = makeKeyword( "NEW-CYCL-SENTENCE-STRING" );
    $str202$argpos = makeString( "argpos" );
    $str203$sentence = makeString( "sentence" );
    $sym204$XML_TERM_LEARNER_CREATE_NEW = makeSymbol( "XML-TERM-LEARNER-CREATE-NEW" );
    $sym205$LISTP = makeSymbol( "LISTP" );
    $sym206$_X88928381ASDF = makeSymbol( "?X88928381ASDF" );
    $sym207$CURE_ASSERT_SENTENCE = makeSymbol( "CURE-ASSERT-SENTENCE" );
    $sym208$CURE_UNASSERT_SENTENCE = makeSymbol( "CURE-UNASSERT-SENTENCE" );
    $sym209$CREATE_NEW_CURE_TERM_AND_ASSERT_SENTENCE = makeSymbol( "CREATE-NEW-CURE-TERM-AND-ASSERT-SENTENCE" );
    $const210$termDependsOn = constant_handles.reader_make_constant_shell( makeString( "termDependsOn" ) );
    $const211$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw212$NL = makeKeyword( "NL" );
    $kw213$HL_ID = makeKeyword( "HL-ID" );
    $sym214$TERM_LEARNER_CREATE_NEW = makeSymbol( "TERM-LEARNER-CREATE-NEW" );
    $sym215$HTML_URL_DECODE = makeSymbol( "HTML-URL-DECODE" );
    $sym216$GET_BASE_SENTENCE_FROM_SENTENCE_STRING = makeSymbol( "GET-BASE-SENTENCE-FROM-SENTENCE-STRING" );
    $kw217$NEW_TERM = makeKeyword( "NEW-TERM" );
    $sym218$TERM_LEARNER_RENDERER_FOR_NEW_TAXONOMIC_RELATIVE = makeSymbol( "TERM-LEARNER-RENDERER-FOR-NEW-TAXONOMIC-RELATIVE" );
    $str219$spec = makeString( "spec" );
    $str220$instance = makeString( "instance" );
    $kw221$INVALID = makeKeyword( "INVALID" );
    $sym222$FIND_BY_ID_STRING_P = makeSymbol( "FIND-BY-ID-STRING-P" );
    $sym223$DECODE_ID_STRING = makeSymbol( "DECODE-ID-STRING" );
    $sym224$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING" );
    $str225$argPos = makeString( "argPos" );
    $str226$limit = makeString( "limit" );
    $sym227$XML_TERM_LEARNER_USER_SUBSTITUTION = makeSymbol( "XML-TERM-LEARNER-USER-SUBSTITUTION" );
    $sym228$TERM_LEARNER_USER_SUBSTITUTION = makeSymbol( "TERM-LEARNER-USER-SUBSTITUTION" );
    $str229$100 = makeString( "100" );
    $str230$_ = makeString( "+" );
    $sym231$_THIS_QUERY_VAR = makeSymbol( "?THIS-QUERY-VAR" );
    $const232$String = constant_handles.reader_make_constant_shell( makeString( "String" ) );
    $sym233$NUMBERP = makeSymbol( "NUMBERP" );
    $sym234$SECOND_TRUE = makeSymbol( "SECOND-TRUE" );
    $sym235$THIRD = makeSymbol( "THIRD" );
    $list236 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "NL" ) );
    $str237$Timeout_attempting_to_call_SCG_on = makeString( "Timeout attempting to call SCG on ~S" );
    $sym238$TERM_LEARNER_VALID_SUBSTITUTION = makeSymbol( "TERM-LEARNER-VALID-SUBSTITUTION" );
    $sym239$_TERM_LEARNER_VALID_SUBSTITUTION_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-VALID-SUBSTITUTION-CACHING-STATE*" );
    $sym240$CLEAR_TERM_LEARNER_VALID_SUBSTITUTION = makeSymbol( "CLEAR-TERM-LEARNER-VALID-SUBSTITUTION" );
    $sym241$LENGTH = makeSymbol( "LENGTH" );
    $sym242$XML_TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION = makeSymbol( "XML-TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION" );
    $sym243$TERM_LEARNER_POSSIBLE_TYPES_FROM_SUBSTITUTION = makeSymbol( "TERM-LEARNER-POSSIBLE-TYPES-FROM-SUBSTITUTION" );
    $sym244$RKF_STANDARD_STRING_WORDIFY = makeSymbol( "RKF-STANDARD-STRING-WORDIFY" );
    $kw245$LEXICON = makeKeyword( "LEXICON" );
    $kw246$OUTPUT_SPEC = makeKeyword( "OUTPUT-SPEC" );
    $list247 = ConsesLow.list( makeKeyword( "CYCL" ), makeKeyword( "T" ), makeKeyword( "INFLECTIONS" ), T );
    $sym248$FIRST_TRUE = makeSymbol( "FIRST-TRUE" );
    $sym249$TERM_LEARNER_AUTOCOMPLETE_NATIVE = makeSymbol( "TERM-LEARNER-AUTOCOMPLETE-NATIVE" );
    $list250 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "LIMIT" ), TWENTY_INTEGER ), ConsesLow.list( makeSymbol( "RETURN-ATTRS" ), makeString( "" ) ), ConsesLow.list(
        makeSymbol( "SENTENCE" ), NIL ), ConsesLow.list( makeSymbol( "ARG-POS" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE" ), NIL ), ConsesLow.list( makeSymbol( "CONSTANTS" ), NIL ) );
    $list251 = ConsesLow.list( makeKeyword( "LIMIT" ), makeKeyword( "RETURN-ATTRS" ), makeKeyword( "SENTENCE" ), makeKeyword( "ARG-POS" ), makeKeyword( "CASE-SENSITIVE" ), makeKeyword( "CONSTANTS" ) );
    $kw252$LIMIT = makeKeyword( "LIMIT" );
    $kw253$RETURN_ATTRS = makeKeyword( "RETURN-ATTRS" );
    $kw254$SENTENCE = makeKeyword( "SENTENCE" );
    $kw255$CASE_SENSITIVE = makeKeyword( "CASE-SENSITIVE" );
    $kw256$CONSTANTS = makeKeyword( "CONSTANTS" );
    $sym257$TERM_LEARNER_AUTOCOMPLETE_INT = makeSymbol( "TERM-LEARNER-AUTOCOMPLETE-INT" );
    $sym258$TO_STRING = makeSymbol( "TO-STRING" );
    $sym259$COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "COMPACT-HL-EXTERNAL-ID-STRING" );
    $list260 = ConsesLow.list( T );
    $sym261$TERM_LEARNER_AUTOCOMPLETE = makeSymbol( "TERM-LEARNER-AUTOCOMPLETE" );
    $list262 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "LIMIT" ), makeString( "20" ) ), ConsesLow.list( makeSymbol( "RETURN-ATTRS" ), makeString( "" ) ), ConsesLow.list(
        makeSymbol( "SENTENCE-ID" ), makeString( "Mww" ) ), ConsesLow.list( makeSymbol( "ARG-POS" ), makeString( "" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE" ), makeString( "nil" ) ), ConsesLow.list( makeSymbol(
            "CONSTANTS" ), makeString( "nil" ) ) );
    $list263 = ConsesLow.list( makeKeyword( "LIMIT" ), makeKeyword( "RETURN-ATTRS" ), makeKeyword( "SENTENCE-ID" ), makeKeyword( "ARG-POS" ), makeKeyword( "CASE-SENSITIVE" ), makeKeyword( "CONSTANTS" ) );
    $str264$20 = makeString( "20" );
    $str265$Mww = makeString( "Mww" );
    $str266$nil = makeString( "nil" );
    $list267 = ConsesLow.list( NIL );
    $str268$prefix = makeString( "prefix" );
    $str269$count = makeString( "count" );
    $sym270$XML_TERM_LEARNER_AUTOCOMPLETE = makeSymbol( "XML-TERM-LEARNER-AUTOCOMPLETE" );
    $list271 = ConsesLow.list( makeKeyword( "CYCL" ), makeKeyword( "NL" ), makeKeyword( "HL-ID" ), makeKeyword( "DISAMBIG-STRING" ) );
    $sym272$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const273$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw274$ISA_FILTER = makeKeyword( "ISA-FILTER" );
    $kw275$GENLS_FILTER = makeKeyword( "GENLS-FILTER" );
    $kw276$ISA_RESTRICTIONS = makeKeyword( "ISA-RESTRICTIONS" );
    $kw277$GENLS_RESTRICTIONS = makeKeyword( "GENLS-RESTRICTIONS" );
    $kw278$TIMEOUT = makeKeyword( "TIMEOUT" );
    $kw279$CASE_SENSITIVE_ = makeKeyword( "CASE-SENSITIVE?" );
    $kw280$COMPLETE_ON_CONSTANTS_ = makeKeyword( "COMPLETE-ON-CONSTANTS?" );
    $sym281$GET_ALLOTTED_TASKS = makeSymbol( "GET-ALLOTTED-TASKS" );
    $sym282$_X = makeSymbol( "?X" );
    $list283 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "CAEAnalysisTask" ) ) );
    $const284$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const285$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym286$_CURRENT_TASK = makeSymbol( "?CURRENT-TASK" );
    $list287 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "allottedAgents" ) ), makeSymbol( "?X" ), makeSymbol( "?MONAD-USER" ) );
    $const288$cureUserModel = constant_handles.reader_make_constant_shell( makeString( "cureUserModel" ) );
    $sym289$_MONAD_USER = makeSymbol( "?MONAD-USER" );
    $const290$allottedAgents = constant_handles.reader_make_constant_shell( makeString( "allottedAgents" ) );
    $const291$AnalystDatabaseMt = constant_handles.reader_make_constant_shell( makeString( "AnalystDatabaseMt" ) );
    $list292 = ConsesLow.list( makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" ), makeKeyword( "COMPUTE-INTERSECTION" ) );
    $const293$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $list294 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AnalystDatabaseMt" ) ) );
    $sym295$TERM_LEARNER_GET_FACT_SHEET_FOR_TERM = makeSymbol( "TERM-LEARNER-GET-FACT-SHEET-FOR-TERM" );
    $str296$_html__body_No_known_facts__body_ = makeString( "<html><body>No known facts</body></html>" );
    $kw297$NORMAL = makeKeyword( "NORMAL" );
    $str298$_ = makeString( ">" );
    $sym299$TERM_LEARNER_GET_FACT_SHEET_UPDATES_FOR_TERM = makeSymbol( "TERM-LEARNER-GET-FACT-SHEET-UPDATES-FOR-TERM" );
    $list300 = ConsesLow.list( makeKeyword( "INCLUDE-SECTIONS" ), ConsesLow.list( makeString( "Recently Added" ) ), makeKeyword( "SHOW-COPYRIGHT?" ), NIL );
    $list301 = ConsesLow.list( makeKeyword( "PRINT-STATS?" ), NIL, makeKeyword( "EXTERNAL-STYLES" ), T, makeKeyword( "STYLESHEET" ), makeString( "" ) );
    $kw302$SLOT_VALUE_PREFERENCE_PATTERN = makeKeyword( "SLOT-VALUE-PREFERENCE-PATTERN" );
    $kw303$NOT = makeKeyword( "NOT" );
    $kw304$OR = makeKeyword( "OR" );
    $str305$Fact_sheet_properties___S = makeString( "Fact-sheet properties: ~S" );
    $str306$preferSlotValueFormatForTermLearn = makeString( "preferSlotValueFormatForTermLearnerFactSheets" );
    $kw307$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword( "ALLOW-ABNORMALITY-CHECKING?" );
    $kw308$MAX_PROBLEM_COUNT = makeKeyword( "MAX-PROBLEM-COUNT" );
    $int309$1000 = makeInteger( 1000 );
    $kw310$EVALUATE_SUBL_ALLOWED_ = makeKeyword( "EVALUATE-SUBL-ALLOWED?" );
    $kw311$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw312$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw313$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw314$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw315$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw316$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw317$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $int318$100 = makeInteger( 100 );
    $str319$forbidSlotValueFormatForTermLearn = makeString( "forbidSlotValueFormatForTermLearnerFactSheets" );
    $kw320$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw321$HL = makeKeyword( "HL" );
    $list322 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) ),
        NIL );
    $sym323$TERM_LEARNER_FACT_STATUS = makeSymbol( "TERM-LEARNER-FACT-STATUS" );
    $kw324$TERM = makeKeyword( "TERM" );
    $str325$null = makeString( "null" );
    $sym326$TERM_LEARNER_FACT_STATUS_INT = makeSymbol( "TERM-LEARNER-FACT-STATUS-INT" );
    $str327$Derived_from_other_assertions = makeString( "Derived from other assertions" );
    $sym328$_TERM_LEARNER_FACT_STATUS_INT_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-FACT-STATUS-INT-CACHING-STATE*" );
    $sym329$CLEAR_TERM_LEARNER_FACT_STATUS_INT = makeSymbol( "CLEAR-TERM-LEARNER-FACT-STATUS-INT" );
    $sym330$TERM_LEARNER_FIND_VISIBLE_ASSERTIONS_CYCL = makeSymbol( "TERM-LEARNER-FIND-VISIBLE-ASSERTIONS-CYCL" );
    $list331 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "DocumentReaderFollowupSuggestionMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) ) );
    $str332$conceptId = makeString( "conceptId" );
    $str333$max = makeString( "max" );
    $str334$questionsOnly = makeString( "questionsOnly" );
    $str335$true = makeString( "true" );
    $str336$unknownOnly = makeString( "unknownOnly" );
    $str337$user = makeString( "user" );
    $const338$CycAdministrator = constant_handles.reader_make_constant_shell( makeString( "CycAdministrator" ) );
    $str339$ignoreList = makeString( "ignoreList" );
    $sym340$XML_TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM = makeSymbol( "XML-TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM" );
    $sym341$TERM_LEARNER_GET_FOLLOWUPS_FOR_CYCL_TERM = makeSymbol( "TERM-LEARNER-GET-FOLLOWUPS-FOR-CYCL-TERM" );
    $sym342$TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM = makeSymbol( "TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM" );
    $kw343$UNCATEGORIZED = makeKeyword( "UNCATEGORIZED" );
    $kw344$TYPES = makeKeyword( "TYPES" );
    $kw345$BLANKS = makeKeyword( "BLANKS" );
    $sym346$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $kw347$CATEGORY_INFO = makeKeyword( "CATEGORY-INFO" );
    $list348 = ConsesLow.cons( makeSymbol( "CATEGORY-PRED" ), makeSymbol( "CATEGORY-FOLLOWUPS" ) );
    $sym349$HIGHER_PRIORITY_FOLLOWUP_IN_CATEGORY = makeSymbol( "HIGHER-PRIORITY-FOLLOWUP-IN-CATEGORY" );
    $kw350$CATEGORY = makeKeyword( "CATEGORY" );
    $kw351$CATEGORY_NL = makeKeyword( "CATEGORY-NL" );
    $const352$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $sym353$TERM_LEARNER_CATEGORY_LABEL = makeSymbol( "TERM-LEARNER-CATEGORY-LABEL" );
    $str354$Advanced_Info = makeString( "Advanced Info" );
    $const355$termSummaryPredicateLabel = constant_handles.reader_make_constant_shell( makeString( "termSummaryPredicateLabel" ) );
    $kw356$GAF = makeKeyword( "GAF" );
    $const357$genStringAssertion = constant_handles.reader_make_constant_shell( makeString( "genStringAssertion" ) );
    $sym358$_TERM_LEARNER_CATEGORY_LABEL_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-CATEGORY-LABEL-CACHING-STATE*" );
    $sym359$CLEAR_TERM_LEARNER_CATEGORY_LABEL = makeSymbol( "CLEAR-TERM-LEARNER-CATEGORY-LABEL" );
    $sym360$GET_FOLLOWUP_CATEGORIES_FOR_TYPE = makeSymbol( "GET-FOLLOWUP-CATEGORIES-FOR-TYPE" );
    $sym361$_CAT = makeSymbol( "?CAT" );
    $const362$subtopicCollectionForCategory = constant_handles.reader_make_constant_shell( makeString( "subtopicCollectionForCategory" ) );
    $sym363$_GET_FOLLOWUP_CATEGORIES_FOR_TYPE_CACHING_STATE_ = makeSymbol( "*GET-FOLLOWUP-CATEGORIES-FOR-TYPE-CACHING-STATE*" );
    $int364$1024 = makeInteger( 1024 );
    $sym365$CLEAR_GET_FOLLOWUP_CATEGORIES_FOR_TYPE = makeSymbol( "CLEAR-GET-FOLLOWUP-CATEGORIES-FOR-TYPE" );
    $sym366$GET_PRED_LIST_ORDER_FOR_TYPE = makeSymbol( "GET-PRED-LIST-ORDER-FOR-TYPE" );
    $sym367$_PRED_LIST = makeSymbol( "?PRED-LIST" );
    $const368$summaryPredicateWRTSetOrCollectio = constant_handles.reader_make_constant_shell( makeString( "summaryPredicateWRTSetOrCollection-RecommendedOrdering" ) );
    $list369 = ConsesLow.list( makeSymbol( "?PRED-LIST" ) );
    $sym370$_GET_PRED_LIST_ORDER_FOR_TYPE_CACHING_STATE_ = makeSymbol( "*GET-PRED-LIST-ORDER-FOR-TYPE-CACHING-STATE*" );
    $sym371$CLEAR_GET_PRED_LIST_ORDER_FOR_TYPE = makeSymbol( "CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE" );
    $const372$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $sym373$EL_VARIABLE_P = makeSymbol( "EL-VARIABLE-P" );
    $sym374$SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN = makeSymbol( "SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN" );
    $sym375$_COL = makeSymbol( "?COL" );
    $const376$argGenl = constant_handles.reader_make_constant_shell( makeString( "argGenl" ) );
    $list377 = ConsesLow.list( makeSymbol( "?COL" ) );
    $sym378$_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN_CACHING_STATE_ = makeSymbol( "*SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN-CACHING-STATE*" );
    $int379$256 = makeInteger( 256 );
    $sym380$CLEAR_SUBSTITUTABLE_ARG_CONSTRAINT_FOR_RELN = makeSymbol( "CLEAR-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN" );
    $list381 = ConsesLow.list( makeSymbol( "?SUMM-PRED" ), makeSymbol( "?GENERAL" ) );
    $sym382$_N = makeSymbol( "?N" );
    $const383$equalSymbols = constant_handles.reader_make_constant_shell( makeString( "equalSymbols" ) );
    $sym384$_TERM = makeSymbol( "?TERM" );
    $const385$argN = constant_handles.reader_make_constant_shell( makeString( "argN" ) );
    $sym386$_SENTENCE_PRED = makeSymbol( "?SENTENCE-PRED" );
    $list387 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol( "?SENTENCE-PRED" ), makeSymbol( "?PRED" ) );
    $list388 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TERM" ), makeSymbol(
        "?GENERAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "specPredsRelevantToTermSummaryPredWRTInstancesInArg" ) ), makeSymbol( "?PRED" ), makeSymbol( "?SUMM-PRED" ), makeSymbol(
            "?GENERAL" ), makeSymbol( "?N" ) ) );
    $list389 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?TERM" ), makeSymbol(
        "?GENERAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "specPredsRelevantToTermSummaryPredWRTSpecsInArg" ) ), makeSymbol( "?PRED" ), makeSymbol( "?SUMM-PRED" ), makeSymbol(
            "?GENERAL" ), makeSymbol( "?N" ) ) );
    $list390 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TERM" ), makeSymbol(
        "?GENERAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "predRelevantToTermSummaryPredWRTInstancesInArg" ) ), makeSymbol( "?SENTENCE-PRED" ), makeSymbol( "?SUMM-PRED" ),
            makeSymbol( "?GENERAL" ), makeSymbol( "?N" ) ) );
    $list391 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?TERM" ), makeSymbol(
        "?GENERAL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "predRelevantToTermSummaryPredWRTSpecsInArg" ) ), makeSymbol( "?SENTENCE-PRED" ), makeSymbol( "?SUMM-PRED" ), makeSymbol(
            "?GENERAL" ), makeSymbol( "?N" ) ) );
    $list392 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TERM" ), makeSymbol( "?GENERAL" ) );
    $list393 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedPredRelevantToTermSummaryPredWRTInstancesInArg" ) ), makeSymbol( "?SENTENCE-PRED" ), makeSymbol(
        "?SUMM-PRED" ), makeSymbol( "?GENERAL" ), makeSymbol( "?N" ) ) );
    $list394 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeSymbol( "?TERM" ), makeSymbol( "?GENERAL" ) );
    $list395 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedPredRelevantToTermSummaryPredWRTSpecsInArg" ) ), makeSymbol( "?SENTENCE-PRED" ), makeSymbol(
        "?SUMM-PRED" ), makeSymbol( "?GENERAL" ), makeSymbol( "?N" ) ) );
    $sym396$CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING = makeSymbol( "CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING" );
    $list397 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "specPredsRelevantToTermSummaryPredWRTInstancesInArg" ) ), constant_handles.reader_make_constant_shell( makeString(
        "predRelevantToTermSummaryPredWRTInstancesInArg" ) ), constant_handles.reader_make_constant_shell( makeString( "assertedPredRelevantToTermSummaryPredWRTInstancesInArg" ) ) );
    $list398 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertedPredRelevantToTermSummaryPredWRTSpecsInArg" ) ), constant_handles.reader_make_constant_shell( makeString(
        "assertedPredRelevantToTermSummaryPredWRTInstancesInArg" ) ) );
    $list399 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "specPredsRelevantToTermSummaryPredWRTInstancesInArg" ) ), constant_handles.reader_make_constant_shell( makeString(
        "specPredsRelevantToTermSummaryPredWRTSpecsInArg" ) ) );
    $sym400$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $kw401$TRUE = makeKeyword( "TRUE" );
    $list402 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "specPredsRelevantToTermSummaryPredWRTInstancesInArg" ) ), constant_handles.reader_make_constant_shell( makeString(
        "predRelevantToTermSummaryPredWRTInstancesInArg" ) ), constant_handles.reader_make_constant_shell( makeString( "assertedPredRelevantToTermSummaryPredWRTInstancesInArg" ) ), constant_handles
            .reader_make_constant_shell( makeString( "specPredsRelevantToTermSummaryPredWRTSpecsInArg" ) ), constant_handles.reader_make_constant_shell( makeString( "predRelevantToTermSummaryPredWRTSpecsInArg" ) ),
        constant_handles.reader_make_constant_shell( makeString( "assertedPredRelevantToTermSummaryPredWRTSpecsInArg" ) ) );
    $sym403$_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING_CACH = makeSymbol( "*CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING-CACHING-STATE*" );
    $sym404$CLEAR_CATEGORIES_AND_TYPES_FOR_SENTENCE_AND_TERM_INT_VIA_INDEXING = makeSymbol( "CLEAR-CATEGORIES-AND-TYPES-FOR-SENTENCE-AND-TERM-INT-VIA-INDEXING" );
    $sym405$FIRST = makeSymbol( "FIRST" );
    $sym406$SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM = makeSymbol( "SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM" );
    $list407 = ConsesLow.list( makeSymbol( "?GENERAL" ), makeSymbol( "?LIST" ) );
    $list408 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "summaryPredicateOrderingForSpecs" ) ), makeSymbol( "?GENERAL" ), makeSymbol( "?LIST" ) );
    $list409 = ConsesLow.list( makeSymbol( "?GENERAL" ) );
    $sym410$GENERALITY_ESTIMATE_ = makeSymbol( "GENERALITY-ESTIMATE>" );
    $list411 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "summaryPredicateOrderingForInstances" ) ), makeSymbol( "?GENERAL" ), makeSymbol( "?LIST" ) );
    $sym412$CDADR = makeSymbol( "CDADR" );
    $sym413$_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM_CACHING_STATE_ = makeSymbol( "*SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM-CACHING-STATE*" );
    $int414$128 = makeInteger( 128 );
    $sym415$CLEAR_SUMMARY_PRED_SORT_ORDER_FOR_FOCAL_TERM = makeSymbol( "CLEAR-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM" );
    $str416$_______________________________Fo = makeString( "~%***************************~%Followup user: ~S~%" );
    $str417$_______________________________Fo = makeString( "~%***************************~%Followup query mt: ~S~%" );
    $str418$_______________________________Fr = makeString( "~%***************************~%Fragments: ~%" );
    $str419$_______________________________Fr = makeString( "~%***************************~%Fragments with ~S: ~%" );
    $str420$_______________________________Un = makeString( "~%***************************~%Unknown Questions about ~S: ~%" );
    $sym421$FOLLOWUP_QUERY_MT_FOR_USER = makeSymbol( "FOLLOWUP-QUERY-MT-FOR-USER" );
    $sym422$_TOPIC = makeSymbol( "?TOPIC" );
    $const423$interests = constant_handles.reader_make_constant_shell( makeString( "interests" ) );
    $list424 = ConsesLow.list( makeSymbol( "?TOPIC" ), constant_handles.reader_make_constant_shell( makeString( "mediumToHighAmountOf" ) ) );
    $const425$DocumentReaderFollowupsForInteres = constant_handles.reader_make_constant_shell( makeString( "DocumentReaderFollowupsForInterestMtFn" ) );
    $sym426$_FOLLOWUP_QUERY_MT_FOR_USER_CACHING_STATE_ = makeSymbol( "*FOLLOWUP-QUERY-MT-FOR-USER-CACHING-STATE*" );
    $sym427$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER = makeSymbol( "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER" );
    $sym428$FOLLOWUP_QUERY_MT_FOR_USER_TASK = makeSymbol( "FOLLOWUP-QUERY-MT-FOR-USER&TASK" );
    $sym429$_MT = makeSymbol( "?MT" );
    $const430$defaultCUREGuidanceMt = constant_handles.reader_make_constant_shell( makeString( "defaultCUREGuidanceMt" ) );
    $const431$SpecificationVariantFn = constant_handles.reader_make_constant_shell( makeString( "SpecificationVariantFn" ) );
    $list432 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DefaultParameterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "CycAnalyticEnvironment-TheProgram" ) ) );
    $const433$analysisTask = constant_handles.reader_make_constant_shell( makeString( "analysisTask" ) );
    $list434 = ConsesLow.list( makeSymbol( "?MT" ) );
    $sym435$_FOLLOWUP_QUERY_MT_FOR_USER_TASK_CACHING_STATE_ = makeSymbol( "*FOLLOWUP-QUERY-MT-FOR-USER&TASK-CACHING-STATE*" );
    $sym436$CLEAR_FOLLOWUP_QUERY_MT_FOR_USER_TASK = makeSymbol( "CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK" );
    $sym437$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE = makeSymbol( "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE" );
    $list438 = ConsesLow.list( makeKeyword( "RETURN" ), makeKeyword( "BINDINGS-AND-SUPPORTS" ) );
    $const439$nearestIsa = constant_handles.reader_make_constant_shell( makeString( "nearestIsa" ) );
    $const440$nearestGenls = constant_handles.reader_make_constant_shell( makeString( "nearestGenls" ) );
    $const441$commonAilmentCause = constant_handles.reader_make_constant_shell( makeString( "commonAilmentCause" ) );
    $const442$objectFoundInLocation = constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) );
    $const443$properlyGeographicallySubsumes = constant_handles.reader_make_constant_shell( makeString( "properlyGeographicallySubsumes" ) );
    $const444$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const445$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $sym446$_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-CACHING-STATE*" );
    $sym447$CLEAR_TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE = makeSymbol( "CLEAR-TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE" );
    $list448 = ConsesLow.list( makeSymbol( "BINDING-SET" ), makeSymbol( "SUPPORT-SET" ) );
    $sym449$TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE = makeSymbol( "TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE" );
    $sym450$_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE-CACHING-STATE*" );
    $sym451$CLEAR_TERM_LEARNER_KNOWN_NEGATED_BINDINGS_FOR_SENTENCE = makeSymbol( "CLEAR-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE" );
    $sym452$TERM_LEARNER_TYPES_FOR_FRAGMENT = makeSymbol( "TERM-LEARNER-TYPES-FOR-FRAGMENT" );
    $sym453$_TERM_LEARNER_TYPES_FOR_FRAGMENT_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-TYPES-FOR-FRAGMENT-CACHING-STATE*" );
    $sym454$CLEAR_TERM_LEARNER_TYPES_FOR_FRAGMENT = makeSymbol( "CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT" );
    $const455$singleEntryFormatInArgs = constant_handles.reader_make_constant_shell( makeString( "singleEntryFormatInArgs" ) );
    $const456$List = constant_handles.reader_make_constant_shell( makeString( "List" ) );
    $const457$CharacterString = constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) );
    $sym458$_Y = makeSymbol( "?Y" );
    $const459$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $list460 = ConsesLow.list( makeSymbol( "POSSIBLY-MET-CONSTRAINT" ), makeSymbol( "MUST-BE-MET-CONSTRAINT" ) );
    $list461 = ConsesLow.list( makeSymbol( "?ALLOWED-VALUE" ), makeSymbol( "?ALLOWED-POS" ), makeSymbol( "?KNOWN-VALUE" ), makeSymbol( "?KNOWN-POS" ) );
    $const462$constrainKnownValuesForPredRelati = constant_handles.reader_make_constant_shell( makeString( "constrainKnownValuesForPredRelativeToIsaInArg-Isa" ) );
    $list463 = ConsesLow.list( makeSymbol( "ALLOWED-VAL" ), makeSymbol( "ALLOWED-POS" ), makeSymbol( "KNOWN-VAL" ), makeSymbol( "KNOWN-POS" ) );
    $const464$SentenceOfCWFn = constant_handles.reader_make_constant_shell( makeString( "SentenceOfCWFn" ) );
    $list465 = ConsesLow.list( ONE_INTEGER );
    $list466 = ConsesLow.list( ONE_INTEGER, ZERO_INTEGER );
    $const467$WebPageCWFn = constant_handles.reader_make_constant_shell( makeString( "WebPageCWFn" ) );
    $list468 = ConsesLow.list( ONE_INTEGER, ONE_INTEGER );
    $sym469$SOURCES_OF_MT = makeSymbol( "SOURCES-OF-MT" );
    $sym470$_PCW = makeSymbol( "?PCW" );
    $const471$contextOfPCWInterpretation = constant_handles.reader_make_constant_shell( makeString( "contextOfPCWInterpretation" ) );
    $list472 = ConsesLow.list( makeSymbol( "?WHO" ), makeSymbol( "?WHEN" ) );
    $sym473$_SOURCES_OF_MT_CACHING_STATE_ = makeSymbol( "*SOURCES-OF-MT-CACHING-STATE*" );
    $sym474$CLEAR_SOURCES_OF_MT = makeSymbol( "CLEAR-SOURCES-OF-MT" );
    $sym475$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE = makeSymbol( "TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE" );
    $list476 = ConsesLow.cons( makeSymbol( "ARG-POS" ), makeSymbol( "SUGGESTIONS" ) );
    $sym477$JAVA_RENDERING_P = makeSymbol( "JAVA-RENDERING-P" );
    $sym478$JAVA_RENDERING_TO_SELECTION_RENDERER = makeSymbol( "JAVA-RENDERING-TO-SELECTION-RENDERER" );
    $sym479$GET_ARG_POSITIONS_FOR_TERMS = makeSymbol( "GET-ARG-POSITIONS-FOR-TERMS" );
    $sym480$_GET_ARG_POSITIONS_FOR_TERMS_CACHING_STATE_ = makeSymbol( "*GET-ARG-POSITIONS-FOR-TERMS-CACHING-STATE*" );
    $kw481$PPH_UNKNOWN_ARG_POSITION = makeKeyword( "PPH-UNKNOWN-ARG-POSITION" );
    $sym482$PPH_JAVALIST_ITEM_STRING = makeSymbol( "PPH-JAVALIST-ITEM-STRING" );
    $sym483$CB_NAUT_FRAME = makeSymbol( "CB-NAUT-FRAME" );
    $sym484$PPH_NAUT_ID_FN = makeSymbol( "PPH-NAUT-ID-FN" );
    $kw485$INTERROGATIVE = makeKeyword( "INTERROGATIVE" );
    $str486$__ = makeString( " (" );
    $str487$_ = makeString( ")" );
    $sym488$PPH_PHRASE_OUTPUT_LIST_P = makeSymbol( "PPH-PHRASE-OUTPUT-LIST-P" );
    $kw489$CHOOSE_A_VALUE = makeKeyword( "CHOOSE-A-VALUE" );
    $str490$Choose_a_value = makeString( "Choose a value" );
    $int491$40 = makeInteger( 40 );
    $list492 = ConsesLow.list( ZERO_INTEGER );
    $kw493$IGNORE = makeKeyword( "IGNORE" );
    $list494 = ConsesLow.list( Characters.CHAR_quotation );
    $sym495$TERM_LEARNER_TYPES_FOR_SENTENCE = makeSymbol( "TERM-LEARNER-TYPES-FOR-SENTENCE" );
    $sym496$TERM_LEARNER_TYPES_FOR_SENTENCE_ID = makeSymbol( "TERM-LEARNER-TYPES-FOR-SENTENCE-ID" );
    $list497 = ConsesLow.list( makeString( "add-before" ), makeString( "add-after" ) );
    $str498$add_before = makeString( "add-before" );
    $sym499$_NEW_VAR = makeSymbol( "?NEW-VAR" );
    $str500$remove = makeString( "remove" );
    $str501$can_t_duplicate_with_uninterpreta = makeString( "can't duplicate with uninterpretable command: ~S" );
    $sym502$CURE_POSSIBLY_DUPLICATE_ARG = makeSymbol( "CURE-POSSIBLY-DUPLICATE-ARG" );
    $kw503$TEST = makeKeyword( "TEST" );
    $kw504$OWNER = makeKeyword( "OWNER" );
    $kw505$CLASSES = makeKeyword( "CLASSES" );
    $kw506$KB = makeKeyword( "KB" );
    $kw507$FULL = makeKeyword( "FULL" );
    $kw508$WORKING_ = makeKeyword( "WORKING?" );
    $list509 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), ConsesLow.list( makeSymbol( "E" ), makeSymbol( "F" ), makeSymbol(
        "G" ) ) ), makeString( "(4 1)" ), makeString( "remove" ) ), ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), ConsesLow.list( makeSymbol( "E" ), makeSymbol( "G" ) ) ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), ConsesLow.list( makeSymbol( "E" ), makeSymbol( "F" ), makeSymbol( "G" ) ) ), makeString(
            "(4 1)" ), makeString( "add-after" ) ), ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), ConsesLow.list( makeSymbol( "E" ), makeSymbol( "F" ), makeSymbol(
                "?NEW-VAR" ), makeSymbol( "G" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), ConsesLow.list( makeSymbol( "E" ),
                    makeSymbol( "F" ), makeSymbol( "G" ) ) ), makeString( "(4 1)" ), makeString( "add-before" ) ), ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), ConsesLow
                        .list( makeSymbol( "E" ), makeSymbol( "?NEW-VAR" ), makeSymbol( "F" ), makeSymbol( "G" ) ) ) ) );
    $const510$DocumentationPredicate = constant_handles.reader_make_constant_shell( makeString( "DocumentationPredicate" ) );
    $const511$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw512$LENIENT = makeKeyword( "LENIENT" );
    $sym513$STRINGP = makeSymbol( "STRINGP" );
    $str514$WebDocumentsMt = makeString( "WebDocumentsMt" );
    $const515$WebDocumentsMt = constant_handles.reader_make_constant_shell( makeString( "WebDocumentsMt" ) );
    $const516$MassMediaDataMt = constant_handles.reader_make_constant_shell( makeString( "MassMediaDataMt" ) );
    $str517$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
    $const518$AssistedReaderSourceSpindle = constant_handles.reader_make_constant_shell( makeString( "AssistedReaderSourceSpindle" ) );
    $const519$AssistedReaderSourceSpindleCollec = constant_handles.reader_make_constant_shell( makeString( "AssistedReaderSourceSpindleCollectorMt" ) );
    $const520$TechnicalEnglishLexicalMt = constant_handles.reader_make_constant_shell( makeString( "TechnicalEnglishLexicalMt" ) );
    $const521$MedicalLexicalMt = constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) );
    $kw522$PPH_LEXICAL_CONTEXT = makeKeyword( "PPH-LEXICAL-CONTEXT" );
    $kw523$PPH_AGREEMENT = makeKeyword( "PPH-AGREEMENT" );
    $sym524$GET_CYCL = makeSymbol( "GET-CYCL" );
    $list525 = ConsesLow.list( makeKeyword( "JUSTIFICATION" ) );
    $sym526$TERM_LEARNER_HANDLE_USER_CHOICE = makeSymbol( "TERM-LEARNER-HANDLE-USER-CHOICE" );
    $sym527$TERM_EXPANSION_EXPECTED_SENTENCE_ = makeSymbol( "TERM-EXPANSION-EXPECTED-SENTENCE?" );
    $sym528$TRANSFORM_TO_TRUE = makeSymbol( "TRANSFORM-TO-TRUE" );
    $sym529$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $kw530$CHOICE_ID = makeKeyword( "CHOICE-ID" );
    $str531$Error_while_trying_to_handle_ = makeString( "Error while trying to handle " );
    $kw532$NEW_SENTENCE_CYCL = makeKeyword( "NEW-SENTENCE-CYCL" );
    $str533$_accepted_meaning_date___A__user_ = makeString(
        "<accepted-meaning date='~A' user-id='~A'><original-string>~S</original-string><focal-term id='~A'>~A</focal-term><sentence id='~a'>~A</sentence-id><justifications>~A</justifications></accepted-meaning>~%" );
    $const534$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const535$termExpansionExpected = constant_handles.reader_make_constant_shell( makeString( "termExpansionExpected" ) );
    $const536$UnsourcedDataForUserByTaskMtFn = constant_handles.reader_make_constant_shell( makeString( "UnsourcedDataForUserByTaskMtFn" ) );
    $const537$userTaskSortsWorkBySourceDocument = constant_handles.reader_make_constant_shell( makeString( "userTaskSortsWorkBySourceDocument" ) );
    $sym538$NORMALIZE_CURE_USER = makeSymbol( "NORMALIZE-CURE-USER" );
    $sym539$_BASE_USER = makeSymbol( "?BASE-USER" );
    $sym540$_TASK = makeSymbol( "?TASK" );
    $sym541$_NORMALIZE_CURE_USER_CACHING_STATE_ = makeSymbol( "*NORMALIZE-CURE-USER-CACHING-STATE*" );
    $int542$32 = makeInteger( 32 );
    $kw543$NOTHING = makeKeyword( "NOTHING" );
    $kw544$TOOL = makeKeyword( "TOOL" );
    $str545$term_learner_base_source_creation = makeString( "term-learner-base-source-creation-lock" );
    $const546$AssistedReaderSourceSpindleForTas = constant_handles.reader_make_constant_shell( makeString( "AssistedReaderSourceSpindleForTaskAndUserFn" ) );
    $sym547$DEFAULT_ASSERT_MT_FOR_USER_AND_TASK = makeSymbol( "DEFAULT-ASSERT-MT-FOR-USER-AND-TASK" );
    $const548$assistedReaderAssertionMtForTaskA = constant_handles.reader_make_constant_shell( makeString( "assistedReaderAssertionMtForTaskAndUser" ) );
    $sym549$_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK_CACHING_STATE_ = makeSymbol( "*DEFAULT-ASSERT-MT-FOR-USER-AND-TASK-CACHING-STATE*" );
    $sym550$CLEAR_DEFAULT_ASSERT_MT_FOR_USER_AND_TASK = makeSymbol( "CLEAR-DEFAULT-ASSERT-MT-FOR-USER-AND-TASK" );
    $sym551$_CW = makeSymbol( "?CW" );
    $const552$urlOfCW = constant_handles.reader_make_constant_shell( makeString( "urlOfCW" ) );
    $const553$URLFn = constant_handles.reader_make_constant_shell( makeString( "URLFn" ) );
    $list554 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $const555$mtSpindleMember = constant_handles.reader_make_constant_shell( makeString( "mtSpindleMember" ) );
    $const556$ContextOfPCWFn = constant_handles.reader_make_constant_shell( makeString( "ContextOfPCWFn" ) );
    $list557 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WorldWideWebPage-PCW" ) ) );
    $const558$titleOfWork = constant_handles.reader_make_constant_shell( makeString( "titleOfWork" ) );
    $const559$ContextOfPCWInterpretationFn = constant_handles.reader_make_constant_shell( makeString( "ContextOfPCWInterpretationFn" ) );
    $const560$contextOfPCW = constant_handles.reader_make_constant_shell( makeString( "contextOfPCW" ) );
    $str561$term_learner_sub_source_creation_ = makeString( "term-learner-sub-source-creation-lock" );
    $const562$asHtmlSourceString = constant_handles.reader_make_constant_shell( makeString( "asHtmlSourceString" ) );
    $list563 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AISForFn" ) ), makeSymbol( "?CW" ) );
    $const564$subWorks = constant_handles.reader_make_constant_shell( makeString( "subWorks" ) );
    $list565 = ConsesLow.list( makeSymbol( "?CW" ) );
    $int566$30 = makeInteger( 30 );
    $list567 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PropositionalConceptualWork" ) ) );
    $const568$AISForFn = constant_handles.reader_make_constant_shell( makeString( "AISForFn" ) );
    $const569$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const570$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $sym571$_SUBWORK = makeSymbol( "?SUBWORK" );
    $list572 = ConsesLow.list( makeSymbol( "?SUBWORK" ) );
    $list573 = ConsesLow.list( makeSymbol( "?DATE" ) );
    $sym574$_WORK = makeSymbol( "?WORK" );
    $sym575$CLEAR_MTS_FOR_USER = makeSymbol( "CLEAR-MTS-FOR-USER" );
    $sym576$CLEAR_MTS_FOR_URL_USER = makeSymbol( "CLEAR-MTS-FOR-URL&USER" );
    $kw577$MT = makeKeyword( "MT" );
    $kw578$BROAD_MT = makeKeyword( "BROAD-MT" );
    $str579$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $kw580$SKIP = makeKeyword( "SKIP" );
    $str581$assertionDependsOn = makeString( "assertionDependsOn" );
    $list582 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inProgressTerm" ) ), makeKeyword( "TERM" ) );
    $sym583$CYCLIST_FORT = makeSymbol( "CYCLIST-FORT" );
    $sym584$HUMAN_CYCLIST_ = makeSymbol( "HUMAN-CYCLIST?" );
    $str585$needsApproval = makeString( "needsApproval" );
    $str586$disapproved = makeString( "disapproved" );
    $str587$approved = makeString( "approved" );
    $list588 = ConsesLow.list( makeKeyword( "STANFORD-NER" ), makeKeyword( "STANFORD-NER-PSP" ) );
    $sym589$STANFORD_NER = makeSymbol( "STANFORD-NER" );
    $sym590$RUN = makeSymbol( "RUN" );
    $sym591$GET_CYC = makeSymbol( "GET-CYC" );
    $sym592$GET_STRING = makeSymbol( "GET-STRING" );
    $list593 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TriggerFromConcept" ) ) );
    $const594$PredicateTaxonomy = constant_handles.reader_make_constant_shell( makeString( "PredicateTaxonomy" ) );
    $list595 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "PredicateTaxonomy" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) );
    $kw596$STANFORD_NER = makeKeyword( "STANFORD-NER" );
    $sym597$TIGHTEN_TYPE = makeSymbol( "TIGHTEN-TYPE" );
    $kw598$STANFORD_NER_PSP = makeKeyword( "STANFORD-NER-PSP" );
    $list599 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TriggerFromConcept" ) ) ) );
    $sym600$O = makeSymbol( "O" );
    $sym601$GET_TYPE = makeSymbol( "GET-TYPE" );
    $kw602$THING = makeKeyword( "THING" );
    $sym603$TERM_LEARNER_TYPE_PROMPT = makeSymbol( "TERM-LEARNER-TYPE-PROMPT" );
    $list604 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Cat" ) ) );
    $str605$cat = makeString( "cat" );
    $str606$_ = makeString( ":" );
    $sym607$_TERM_LEARNER_TYPE_PROMPT_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-TYPE-PROMPT-CACHING-STATE*" );
    $sym608$TERM_LEARNER_TERM_HEADER_STRING = makeSymbol( "TERM-LEARNER-TERM-HEADER-STRING" );
    $sym609$_TERM_LEARNER_TERM_HEADER_STRING_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-TERM-HEADER-STRING-CACHING-STATE*" );
    $int610$5000 = makeInteger( 5000 );
    $sym611$CLEAR_TERM_LEARNER_TERM_HEADER_STRING = makeSymbol( "CLEAR-TERM-LEARNER-TERM-HEADER-STRING" );
    $sym612$TERM_LEARNER_ALTERNATIVE_PHRASES = makeSymbol( "TERM-LEARNER-ALTERNATIVE-PHRASES" );
    $sym613$DELETE = makeSymbol( "DELETE" );
    $kw614$NOW = makeKeyword( "NOW" );
    $const615$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const616$assertionDependsOn = constant_handles.reader_make_constant_shell( makeString( "assertionDependsOn" ) );
    $sym617$DEFAULT_TASK_FOR_USER = makeSymbol( "DEFAULT-TASK-FOR-USER" );
    $sym618$DEFAULT_TASK_FOR_USER_INT = makeSymbol( "DEFAULT-TASK-FOR-USER-INT" );
    $const619$defaultTask = constant_handles.reader_make_constant_shell( makeString( "defaultTask" ) );
    $const620$GeneralCycKETask_Allotment = constant_handles.reader_make_constant_shell( makeString( "GeneralCycKETask-Allotment" ) );
    $sym621$_DEFAULT_TASK_FOR_USER_INT_CACHING_STATE_ = makeSymbol( "*DEFAULT-TASK-FOR-USER-INT-CACHING-STATE*" );
    $sym622$CLEAR_DEFAULT_TASK_FOR_USER_INT = makeSymbol( "CLEAR-DEFAULT-TASK-FOR-USER-INT" );
    $sym623$QUERY_MT_FOR_TASK = makeSymbol( "QUERY-MT-FOR-TASK" );
    $sym624$_QUERY_MT_FOR_TASK_CACHING_STATE_ = makeSymbol( "*QUERY-MT-FOR-TASK-CACHING-STATE*" );
    $sym625$CLEAR_QUERY_MT_FOR_TASK = makeSymbol( "CLEAR-QUERY-MT-FOR-TASK" );
    $sym626$WFF_CHECKING_MT_FOR_TASK = makeSymbol( "WFF-CHECKING-MT-FOR-TASK" );
    $sym627$_WFF_CHECKING_MT_FOR_TASK_CACHING_STATE_ = makeSymbol( "*WFF-CHECKING-MT-FOR-TASK-CACHING-STATE*" );
    $sym628$CLEAR_WFF_CHECKING_MT_FOR_TASK = makeSymbol( "CLEAR-WFF-CHECKING-MT-FOR-TASK" );
    $sym629$QUERY_MT_FOR_USER_AND_TASK = makeSymbol( "QUERY-MT-FOR-USER-AND-TASK" );
    $sym630$_QUERY_MT_FOR_USER_AND_TASK_CACHING_STATE_ = makeSymbol( "*QUERY-MT-FOR-USER-AND-TASK-CACHING-STATE*" );
    $sym631$CLEAR_QUERY_MT_FOR_USER_AND_TASK = makeSymbol( "CLEAR-QUERY-MT-FOR-USER-AND-TASK" );
    $sym632$WFF_CHECKING_MT_FOR_USER_AND_TASK = makeSymbol( "WFF-CHECKING-MT-FOR-USER-AND-TASK" );
    $sym633$_WFF_CHECKING_MT_FOR_USER_AND_TASK_CACHING_STATE_ = makeSymbol( "*WFF-CHECKING-MT-FOR-USER-AND-TASK-CACHING-STATE*" );
    $sym634$CLEAR_WFF_CHECKING_MT_FOR_USER_AND_TASK = makeSymbol( "CLEAR-WFF-CHECKING-MT-FOR-USER-AND-TASK" );
    $str635$types = makeString( "types" );
    $kw636$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $str637$category = makeString( "category" );
    $str638$categoryNL = makeString( "categoryNL" );
    $str639$typeSet = makeString( "typeSet" );
    $str640$id = makeString( "id" );
    $str641$required = makeString( "required" );
    $str642$false = makeString( "false" );
    $str643$display = makeString( "display" );
    $str644$cyclTerm = makeString( "cyclTerm" );
    $str645$nlString = makeString( "nlString" );
    $str646$legendString = makeString( "legendString" );
    $str647$replicationSentenceId = makeString( "replicationSentenceId" );
    $str648$statusCode = makeString( "statusCode" );
    $str649$type = makeString( "type" );
    $str650$renderers = makeString( "renderers" );
    $str651$renderer = makeString( "renderer" );
    $str652$isaConstraint = makeString( "isaConstraint" );
    $str653$genlsConstraint = makeString( "genlsConstraint" );
    $str654$text_matches = makeString( "text-matches" );
    $str655$heading = makeString( "heading" );
    $list656 = ConsesLow.list( makeString( "valid" ), makeString( "false" ) );
    $str657$initiallySelected = makeString( "initiallySelected" );
    $str658$selectionRenderer = makeString( "selectionRenderer" );
    $str659$cyclId = makeString( "cyclId" );
    $sym660$TERM_LEARNER_CONCEPT_CLOUDS = makeSymbol( "TERM-LEARNER-CONCEPT-CLOUDS" );
    $kw661$TERM_WEIGHT = makeKeyword( "TERM-WEIGHT" );
    $kw662$CLOUD = makeKeyword( "CLOUD" );
    $sym663$TERM_LEARNER_TERM_CONCEPT_CLOUD = makeSymbol( "TERM-LEARNER-TERM-CONCEPT-CLOUD" );
    $kw664$NEW = makeKeyword( "NEW" );
    $sym665$SIXTH = makeSymbol( "SIXTH" );
    $sym666$TERM_LEARNER_CONCEPT_CLOUD_AS_XML = makeSymbol( "TERM-LEARNER-CONCEPT-CLOUD-AS-XML" );
    $str667$cloud = makeString( "cloud" );
    $kw668$GENL_IDS = makeKeyword( "GENL-IDS" );
    $kw669$ISA_IDS = makeKeyword( "ISA-IDS" );
    $str670$cycl = makeString( "cycl" );
    $str671$t = makeString( "t" );
    $str672$f = makeString( "f" );
    $str673$weight = makeString( "weight" );
    $str674$nl = makeString( "nl" );
    $str675$concept = makeString( "concept" );
    $str676$genl = makeString( "genl" );
    $sym677$TERM_LEARNER_CONCEPT_CLOUD_NEW_INT = makeSymbol( "TERM-LEARNER-CONCEPT-CLOUD-NEW-INT" );
    $sym678$TERM_LEARNER_ID = makeSymbol( "TERM-LEARNER-ID" );
    $sym679$TERM_LEARNER_CLOUD_DISPLAY_NL = makeSymbol( "TERM-LEARNER-CLOUD-DISPLAY-NL" );
    $sym680$_TERM_LEARNER_CLOUD_DISPLAY_NL_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-CLOUD-DISPLAY-NL-CACHING-STATE*" );
    $int681$4096 = makeInteger( 4096 );
    $sym682$CLEAR_TERM_LEARNER_CLOUD_DISPLAY_NL = makeSymbol( "CLEAR-TERM-LEARNER-CLOUD-DISPLAY-NL" );
    $sym683$TERM_LEARNER_DISPLAYABLE_GENERALIZATION_ = makeSymbol( "TERM-LEARNER-DISPLAYABLE-GENERALIZATION?" );
    $sym684$_TERM_LEARNER_DISPLAYABLE_GENERALIZATION__CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-DISPLAYABLE-GENERALIZATION?-CACHING-STATE*" );
    $sym685$CLEAR_TERM_LEARNER_DISPLAYABLE_GENERALIZATION_ = makeSymbol( "CLEAR-TERM-LEARNER-DISPLAYABLE-GENERALIZATION?" );
    $const686$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $list687 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CollectionUnionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CollectionDifferenceFn" ) ) );
    $sym688$_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION__CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?-CACHING-STATE*" );
    $sym689$CLEAR_TERM_LEARNER_POSSIBLY_RELEVANT_GENERALIZATION_ = makeSymbol( "CLEAR-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?" );
    $kw690$KB_MODIFY_IRRELEVANCE = makeKeyword( "KB-MODIFY-IRRELEVANCE" );
    $sym691$CLEAR_TERM_LEARNER_IRRELEVANCIES_FOR_TERM = makeSymbol( "CLEAR-TERM-LEARNER-IRRELEVANCIES-FOR-TERM" );
    $sym692$CYCL_TERMS_TO_NL_STRINGS_QUICK = makeSymbol( "CYCL-TERMS-TO-NL-STRINGS-QUICK" );
    $sym693$_CB_SHOW_FOLLOWUP_WIDGET_ = makeSymbol( "*CB-SHOW-FOLLOWUP-WIDGET*" );
    $str694$_termId_ = makeString( " termId=" );
    $str695$_termString_ = makeString( " termString=" );
    $str696$cycFollowup = makeString( "cycFollowup" );
    $list697 = ConsesLow.cons( makeUninternedSymbol( "ATTRIBUTE" ), makeUninternedSymbol( "VALUE" ) );
    $kw698$FOLLOWUP_LOADER = makeKeyword( "FOLLOWUP-LOADER" );
    $kw699$CURE = makeKeyword( "CURE" );
    $str700$cure_png = makeString( "cure.png" );
    $str701$cure_cyc_com = makeString( "cure.cyc.com" );
    $int702$8080 = makeInteger( 8080 );
    $str703$_ConceptSearch = makeString( "/ConceptSearch" );
    $str704$_cure = makeString( "/cure" );
    $sym705$_CB_CURE_INTERNAL_HOST_OVERRIDE_ = makeSymbol( "*CB-CURE-INTERNAL-HOST-OVERRIDE*" );
    $sym706$_CB_CURE_INTERNAL_PORT_OVERRIDE_ = makeSymbol( "*CB-CURE-INTERNAL-PORT-OVERRIDE*" );
    $str707$CURE = makeString( "CURE" );
    $sym708$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str709$CURE_Broken = makeString( "CURE Broken" );
    $str710$CURE_broken___S = makeString( "CURE broken: ~S" );
    $str711$http___ = makeString( "http://" );
    $str712$_edit_jsp_conceptid_ = makeString( "/edit.jsp?conceptid=" );
    $str713$_cycHost_ = makeString( "&cycHost=" );
    $str714$_cycPort_ = makeString( "&cycPort=" );
    $str715$_userName_ = makeString( "&userName=" );
    $str716$_cure = makeString( "-cure" );
    $int717$600 = makeInteger( 600 );
    $int718$400 = makeInteger( 400 );
    $str719$_cycdoc_img_cb_cure_png = makeString( "/cycdoc/img/cb/cure.png" );
    $str720$bottom = makeString( "bottom" );
    $str721$height_1_2em = makeString( "height:1.2em" );
    $sym722$SENTENCE_SCORE = makeSymbol( "SENTENCE-SCORE" );
    $list723 = ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL );
    $sym724$ALL_INSTANCES = makeSymbol( "ALL-INSTANCES" );
    $sym725$_SENTENCE_SCORE_CACHING_STATE_ = makeSymbol( "*SENTENCE-SCORE-CACHING-STATE*" );
    $sym726$SENTENCE_SCORE_FOR_TYPE = makeSymbol( "SENTENCE-SCORE-FOR-TYPE" );
    $sym727$_QUERY_VAR = makeSymbol( "?QUERY-VAR" );
    $sym728$_SENTENCE_SCORE_FOR_TYPE_CACHING_STATE_ = makeSymbol( "*SENTENCE-SCORE-FOR-TYPE-CACHING-STATE*" );
    $sym729$SET_QUERY_VARIABLE = makeSymbol( "SET-QUERY-VARIABLE" );
    $sym730$_SET_QUERY_VARIABLE_CACHING_STATE_ = makeSymbol( "*SET-QUERY-VARIABLE-CACHING-STATE*" );
    $const731$DaveS = constant_handles.reader_make_constant_shell( makeString( "DaveS" ) );
    $str732$something = makeString( "something" );
    $const733$GenericInstanceFn = constant_handles.reader_make_constant_shell( makeString( "GenericInstanceFn" ) );
    $sym734$SECOND = makeSymbol( "SECOND" );
    $sym735$GET_FRAGMENTS_FOR_TERMS_CACHED = makeSymbol( "GET-FRAGMENTS-FOR-TERMS-CACHED" );
    $sym736$_GET_FRAGMENTS_FOR_TERMS_CACHED_CACHING_STATE_ = makeSymbol( "*GET-FRAGMENTS-FOR-TERMS-CACHED-CACHING-STATE*" );
    $sym737$CLEAR_GET_FRAGMENTS_FOR_TERMS_CACHED = makeSymbol( "CLEAR-GET-FRAGMENTS-FOR-TERMS-CACHED" );
    $const738$Restaurant_Organization = constant_handles.reader_make_constant_shell( makeString( "Restaurant-Organization" ) );
    $list739 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DocumentReaderFollowupsForTaskMtFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "GeneralCycKETask-Allotment" ) ) );
    $list740 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "SCORE" ) );
    $list741 = ConsesLow.list( makeKeyword( "ISA-HORIZON" ), constant_handles.reader_make_constant_shell( makeString( "Agent-Generic" ) ), makeKeyword( "GENLS-HORIZON" ), constant_handles.reader_make_constant_shell(
        makeString( "Individual" ) ), makeKeyword( "USAGE-THRESHOLD" ), TEN_INTEGER );
    $str742$cdolist = makeString( "cdolist" );
    $str743$gathering_preds_for_ = makeString( "gathering preds for " );
    $const744$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $list745 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "SCORE" ) );
    $const746$DocumentReaderFollowupsForTaskMtF = constant_handles.reader_make_constant_shell( makeString( "DocumentReaderFollowupsForTaskMtFn" ) );
    $kw747$BREADTH = makeKeyword( "BREADTH" );
    $kw748$QUEUE = makeKeyword( "QUEUE" );
    $kw749$STACK = makeKeyword( "STACK" );
    $sym750$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw751$ERROR = makeKeyword( "ERROR" );
    $str752$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym753$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw754$CERROR = makeKeyword( "CERROR" );
    $str755$continue_anyway = makeString( "continue anyway" );
    $kw756$WARN = makeKeyword( "WARN" );
    $str757$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str758$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str759$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str760$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $float761$0_001 = makeDouble( 0.001 );
    $const762$GeneralCycKE = constant_handles.reader_make_constant_shell( makeString( "GeneralCycKE" ) );
    $sym763$CAAR = makeSymbol( "CAAR" );
    $const764$generateFormulasForElements_TermI = constant_handles.reader_make_constant_shell( makeString( "generateFormulasForElements-TermIsa" ) );
    $const765$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $kw766$CONTEXT_STRING = makeKeyword( "CONTEXT-STRING" );
    $kw767$SOURCE = makeKeyword( "SOURCE" );
    $sym768$RESTART_CONCEPT_SEARCH_DEMO_SERVER = makeSymbol( "RESTART-CONCEPT-SEARCH-DEMO-SERVER" );
    $str769$Restarting_CCF_Demo_Cyc_Server = makeString( "Restarting CCF Demo Cyc Server" );
    $str770$_cyc_java_pkg_WebServicesTester_b = makeString( "/cyc/java/pkg/WebServicesTester/bin/restart-ccf-demo-web-services.sh" );
    $kw771$COLLECTION = makeKeyword( "COLLECTION" );
    $kw772$INDIVIDUAL = makeKeyword( "INDIVIDUAL" );
    $list773 = ConsesLow.list( makeString( "the" ), makeString( "The" ) );
    $sym774$COLLECTION_VIA_WEB_SEARCH_ = makeSymbol( "COLLECTION-VIA-WEB-SEARCH?" );
    $float775$0_01 = makeDouble( 0.01 );
    $float776$0_1 = makeDouble( 0.1 );
    $sym777$_COLLECTION_VIA_WEB_SEARCH__CACHING_STATE_ = makeSymbol( "*COLLECTION-VIA-WEB-SEARCH?-CACHING-STATE*" );
    $int778$50 = makeInteger( 50 );
    $sym779$YAHOO_COUNT_CACHED = makeSymbol( "YAHOO-COUNT-CACHED" );
    $str780$_much_ = makeString( "\"much " );
    $str781$_ = makeString( "\"" );
    $str782$_many_ = makeString( "\"many " );
    $sym783$GET_CONCEPT_TAGS_FROM_STRING = makeSymbol( "GET-CONCEPT-TAGS-FROM-STRING" );
    $sym784$_GET_CONCEPT_TAGS_FROM_STRING_CACHING_STATE_ = makeSymbol( "*GET-CONCEPT-TAGS-FROM-STRING-CACHING-STATE*" );
    $sym785$CLEAR_GET_CONCEPT_TAGS_FROM_STRING = makeSymbol( "CLEAR-GET-CONCEPT-TAGS-FROM-STRING" );
    $sym786$GET_FILLER_SCORE = makeSymbol( "GET-FILLER-SCORE" );
    $sym787$FIND_SENTENCE_FILLERS = makeSymbol( "FIND-SENTENCE-FILLERS" );
    $list788 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "VARS" ), makeSymbol( "ANSWER-SETS" ) );
    $list789 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Animal" ) ) );
    $list790 = ConsesLow.cons( makeSymbol( "CYCL-SENTENCE" ), makeSymbol( "VAR-LIST" ) );
    $sym791$GET_QUERIES_FOR_TERM = makeSymbol( "GET-QUERIES-FOR-TERM" );
    $sym792$GET_QUERIES_FROM_SENTENCES = makeSymbol( "GET-QUERIES-FROM-SENTENCES" );
    $sym793$TERM_LEARNER_AUTOCOMPLETE_NATIVE_WITH_CYCADMINISTRATOR = makeSymbol( "TERM-LEARNER-AUTOCOMPLETE-NATIVE-WITH-CYCADMINISTRATOR" );
    $sym794$LENGTH_ = makeSymbol( "LENGTH>" );
    $list795 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "mon" ), TWENTY_INTEGER, makeString( "" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "organismTypeFoundInClimateOfType" ) ), makeSymbol( "?ANIMAL" ), constant_handles.reader_make_constant_shell( makeString( "SunnyClimateCycle" ) ) ), ConsesLow.list( ONE_INTEGER ) ), ONE_INTEGER ), ConsesLow.list(
            ConsesLow.list( makeString( "hor" ), TWENTY_INTEGER, makeString( "" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "organismTypeFoundInClimateOfType" ) ), makeSymbol( "?ANIMAL" ),
                constant_handles.reader_make_constant_shell( makeString( "SunnyClimateCycle" ) ) ), ConsesLow.list( ONE_INTEGER ) ), ONE_INTEGER ) );
    $sym796$TERM_LEARNER_CANDIDATE_HIERARCHICAL_REPLACEMENTS_FOR_SENTENCE_INT = makeSymbol( "TERM-LEARNER-CANDIDATE-HIERARCHICAL-REPLACEMENTS-FOR-SENTENCE-INT" );
    $sym797$VALID_HIERARCHICAL_CANDIDATES_P = makeSymbol( "VALID-HIERARCHICAL-CANDIDATES-P" );
    $list798 = ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationInstanceExistsRange" ) ), constant_handles.reader_make_constant_shell(
        makeString( "organismKilled" ) ), constant_handles.reader_make_constant_shell( makeString( "AttackOnFrenchBarracksInBeirut19831023" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ),
        makeInteger( 59 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "DocumentReaderFollowupsForInterestMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Medicine-FieldOfStudy" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "DocumentReaderFollowupsForTaskMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralCycKETask-Allotment" ) ) ) ) ), T ) );
    $sym799$TERM_LEARNER_TYPES_FOR_SENTENCE_ID_TEST_FN = makeSymbol( "TERM-LEARNER-TYPES-FOR-SENTENCE-ID-TEST-FN" );
    $sym800$SOME_SELECTION_RENDERER_HAS_STRING_P = makeSymbol( "SOME-SELECTION-RENDERER-HAS-STRING-P" );
    $list801 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeBehaviorIncapable" ) ), constant_handles.reader_make_constant_shell(
        makeString( "FlightlessBird" ) ), constant_handles.reader_make_constant_shell( makeString( "Flying-FlappingWings" ) ), constant_handles.reader_make_constant_shell( makeString( "doneBy" ) ) ), constant_handles
            .reader_make_constant_shell( makeString( "DaveS" ) ), makeString( "" ), makeString( "" ), makeString( "" ), makeString( "" ) ), makeString( "fly by flapping wings" ) ), ConsesLow.list( ConsesLow.list(
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "typeBehaviorIncapable" ) ), constant_handles.reader_make_constant_shell( makeString( "FlightlessBird" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "Flying-FlappingWings" ) ), constant_handles.reader_make_constant_shell( makeString( "doneBy" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                        "DaveS" ) ), makeString( "" ), makeString( "" ), makeString( "" ), makeString( "" ) ), makeString( "flightless birds" ) ) );
    $sym802$TERM_LEARNER_KNOWN_BINDINGS_FOR_SENTENCE_NEG = makeSymbol( "TERM-LEARNER-KNOWN-BINDINGS-FOR-SENTENCE-NEG" );
    $sym803$BINDINGS_DONT_MENTION = makeSymbol( "BINDINGS-DONT-MENTION" );
    $list804 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) ), constant_handles.reader_make_constant_shell(
        makeString( "CityOfAustinTX" ) ), makeSymbol( "?X" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), constant_handles.reader_make_constant_shell( makeString(
            "MilkyWay-Galaxy" ) ) ) );
    $sym805$BINDINGS_MENTION = makeSymbol( "BINDINGS-MENTION" );
    $list806 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "objectFoundInLocation" ) ), constant_handles.reader_make_constant_shell(
        makeString( "CityOfAustinTX" ) ), makeSymbol( "?X" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) ), constant_handles.reader_make_constant_shell( makeString(
            "Texas-State" ) ) ) );
  }
}
/*
 * 
 * Total time: 8691 ms
 * 
 */