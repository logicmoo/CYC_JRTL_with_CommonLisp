package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class document_annotation_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.document_annotation_widgets";
  public static final String myFingerPrint = "0791c8f1a8ac8ee4e11d4c48871a2a23877fb45f04c6f9d4a0d9eceada695430";
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 938L)
  public static SubLSymbol $text_index$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 1115L)
  public static SubLSymbol $semantic_index$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 1198L)
  private static SubLSymbol $text_index_override$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 1416L)
  private static SubLSymbol $semantic_index_override$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2286L)
  public static SubLSymbol $trace_doc_search_interface$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2350L)
  public static SubLSymbol $doc_search_trace_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 3078L)
  public static SubLSymbol $predicate_id_table$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 3498L)
  private static SubLSymbol $predicate_template_table$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4046L)
  private static SubLSymbol $upwards_closure_justification_fbc$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4110L)
  private static SubLSymbol $upwards_closure_justification_fht_path$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6647L)
  private static SubLSymbol $doc_annotation_thcl_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
  private static SubLSymbol $term_learner_object_from_id_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
  private static SubLSymbol $term_learner_id_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7824L)
  private static SubLSymbol $upwards_closure_query_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
  private static SubLSymbol $get_upwards_closure_justifications_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 11052L)
  private static SubLSymbol $caching_upwards_closure_justificationsP$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
  private static SubLSymbol $get_treated_condition_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
  private static SubLSymbol $get_treatments_for_condition_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
  private static SubLSymbol $get_affected_parts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
  private static SubLSymbol $get_cooccurring_conditions_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
  private static SubLSymbol $leaders_to_groups_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
  private static SubLSymbol $cities_to_countries_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
  private static SubLSymbol $countries_to_regions_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 18803L)
  private static SubLSymbol $tagged_xml_doc_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19049L)
  public static SubLSymbol $tagged_doc_title_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19096L)
  public static SubLSymbol $tagged_doc_title_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19145L)
  public static SubLSymbol $tagged_doc_title_close_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19201L)
  public static SubLSymbol $tagged_doc_text_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19245L)
  public static SubLSymbol $tagged_doc_text_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19292L)
  public static SubLSymbol $tagged_doc_text_close_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19346L)
  public static SubLSymbol $tagged_doc_keystring_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19400L)
  public static SubLSymbol $tagged_doc_keystring_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19457L)
  public static SubLSymbol $tagged_doc_confirmed_concepts_keystring_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19551L)
  public static SubLSymbol $tagged_doc_confirmed_concepts_keystring_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19644L)
  public static SubLSymbol $tagged_doc_original_filename_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19714L)
  public static SubLSymbol $tagged_doc_original_filename_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19787L)
  public static SubLSymbol $tagged_doc_url_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19829L)
  public static SubLSymbol $tagged_doc_url_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19874L)
  public static SubLSymbol $tagged_doc_url_close_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19926L)
  public static SubLSymbol $tagged_doc_parent_filename_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 19992L)
  public static SubLSymbol $tagged_doc_parent_filename_token$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 20061L)
  private static SubLSymbol $semantic_index_dir_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 20117L)
  private static SubLSymbol $text_index_dir_name$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 33777L)
  private static SubLSymbol $annotated_document_format$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 35781L)
  public static SubLSymbol $term_learner_keep_concepts_distinct$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 43080L)
  public static SubLSymbol $default_medical_tagging_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55345L)
  private static SubLSymbol $doc_annotation_use_hl_ids$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55465L)
  private static SubLSymbol $doc_annotator_term_id_fbc_path$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55559L)
  private static SubLSymbol $doc_annotator_id_term_fbc_path$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55688L)
  private static SubLSymbol $doc_annotator_term_id_fbc$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55780L)
  private static SubLSymbol $doc_annotator_id_term_fbc$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
  private static SubLSymbol $document_annotation_term_id_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
  private static SubLSymbol $document_annotation_term_from_id_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 63078L)
  public static SubLSymbol $default_document_ingester_annotation_learning_lexicons$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
  private static SubLSymbol $get_default_document_ingester_annotation_lexicon_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66096L)
  public static SubLSymbol $default_document_annotation_learning_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66765L)
  public static SubLSymbol $default_document_annotation_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
  private static SubLSymbol $get_default_document_annotation_lexicon_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 68427L)
  public static SubLSymbol $default_document_annotation_rule_disambiguator$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77565L)
  private static SubLSymbol $remove_pictures_regexp$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77646L)
  private static SubLSymbol $remove_hyphens_regexp$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77701L)
  private static SubLSymbol $remove_underscores_regexp$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77759L)
  private static SubLSymbol $remove_equals_regexp$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77811L)
  private static SubLSymbol $remove_dots_regexp$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77872L)
  private static SubLSymbol $remove_unicode_regexp$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77937L)
  private static SubLSymbol $cached_regexps$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 83350L)
  private static SubLSymbol $document_interpretation_rules_by_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 83901L)
  public static SubLSymbol $document_interpretation_default_elmt$;
  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 97793L)
  private static SubLSymbol $manual_document_annotation_instructions$;
  private static final SubLString $str0$_host_george_super_index_hezbolla;
  private static final SubLString $str1$_host_george_super_index_hezbolla;
  private static final SubLString $str2$_cyc_projects_ccf_document_search;
  private static final SubLString $str3$_cyc_projects_ccf_document_search;
  private static final SubLString $str4$_host_achernar_daves_ccf_lucene_t;
  private static final SubLString $str5$_host_achernar_daves_ccf_lucene_s;
  private static final SubLString $str6$_cyc_projects_ccf_document_search;
  private static final SubLString $str7$_cyc_projects_ccf_document_search;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$OUT;
  private static final SubLSymbol $sym10$PROGN;
  private static final SubLSymbol $sym11$PWHEN;
  private static final SubLSymbol $sym12$_TRACE_DOC_SEARCH_INTERFACE_;
  private static final SubLSymbol $sym13$FORMAT;
  private static final SubLSymbol $sym14$_TRACE_OUTPUT_;
  private static final SubLString $str15$___A__entering__S__;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$_DOC_SEARCH_TRACE_LOG_FILE_;
  private static final SubLSymbol $sym18$WITH_PRIVATE_TEXT_FILE;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLString $str23$data_doc_tagging_upwards_closure_;
  private static final SubLSymbol $kw24$UNINITIALIZED;
  private static final SubLString $str25$_host_george_scratch_text_index;
  private static final SubLString $str26$_host_george_scratch_sem_index;
  private static final SubLString $str27$_host_george_simple_tagged_index_;
  private static final SubLString $str28$_host_george_simple_tagged_index_;
  private static final SubLString $str29$_host_george_disambiguated_index_;
  private static final SubLString $str30$_host_george_disambiguated_index_;
  private static final SubLSymbol $kw31$SPEC;
  private static final SubLSymbol $kw32$GENL;
  private static final SubLSymbol $sym33$TERM_LEARNER_OBJECT_FROM_ID;
  private static final SubLSymbol $sym34$_TERM_LEARNER_OBJECT_FROM_ID_CACHING_STATE_;
  private static final SubLInteger $int35$4096;
  private static final SubLSymbol $kw36$ERROR;
  private static final SubLSymbol $sym37$TERM_LEARNER_ID;
  private static final SubLSymbol $sym38$_TERM_LEARNER_ID_CACHING_STATE_;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS;
  private static final SubLObject $const41$genls;
  private static final SubLObject $const42$standardTreatmentTypeForCondition;
  private static final SubLObject $const43$ailmentTypeAfflictsPartType;
  private static final SubLObject $const44$conditionsCommonlyCooccur;
  private static final SubLObject $const45$isa;
  private static final SubLObject $const46$inRegion;
  private static final SubLObject $const47$hasLeaders;
  private static final SubLSymbol $sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED;
  private static final SubLSymbol $kw49$NOT_FOUND;
  private static final SubLSymbol $sym50$_GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED_CACHING_STATE_;
  private static final SubLString $str51$_cyc_top_data_doc_tagging_upwards;
  private static final SubLSymbol $kw52$IMAGE_INDEPENDENT_CFASL;
  private static final SubLString $str53$Caching_upwards_closure_justifica;
  private static final SubLObject $const54$MedicalDevice;
  private static final SubLObject $const55$MedicalTreatmentEvent;
  private static final SubLObject $const56$AilmentCondition;
  private static final SubLObject $const57$IntelligentAgent;
  private static final SubLSymbol $sym58$GET_TREATED_CONDITION;
  private static final SubLSymbol $sym59$_X;
  private static final SubLObject $const60$or;
  private static final SubLObject $const61$deviceTypeTreatsConditionType;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$_GET_TREATED_CONDITION_CACHING_STATE_;
  private static final SubLSymbol $sym65$CLEAR_GET_TREATED_CONDITION;
  private static final SubLSymbol $sym66$GET_TREATMENTS_FOR_CONDITION;
  private static final SubLSymbol $sym67$_GET_TREATMENTS_FOR_CONDITION_CACHING_STATE_;
  private static final SubLSymbol $sym68$CLEAR_GET_TREATMENTS_FOR_CONDITION;
  private static final SubLSymbol $sym69$GET_AFFECTED_PARTS;
  private static final SubLSymbol $sym70$_GET_AFFECTED_PARTS_CACHING_STATE_;
  private static final SubLSymbol $sym71$CLEAR_GET_AFFECTED_PARTS;
  private static final SubLSymbol $sym72$GET_COOCCURRING_CONDITIONS;
  private static final SubLSymbol $sym73$_GET_COOCCURRING_CONDITIONS_CACHING_STATE_;
  private static final SubLSymbol $sym74$CLEAR_GET_COOCCURRING_CONDITIONS;
  private static final SubLSymbol $sym75$_GROUP;
  private static final SubLObject $const76$InferencePSC;
  private static final SubLSymbol $sym77$LEADERS_TO_GROUPS;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$_LEADERS_TO_GROUPS_CACHING_STATE_;
  private static final SubLSymbol $sym82$CITIES_TO_COUNTRIES;
  private static final SubLString $str83$Caching_countries_of_all_cities__;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$_CITIES_TO_COUNTRIES_CACHING_STATE_;
  private static final SubLSymbol $sym88$_COUNTRY;
  private static final SubLObject $const89$countryOfCity;
  private static final SubLSymbol $sym90$_REGION;
  private static final SubLObject $const91$and;
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$COUNTRIES_TO_REGIONS;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$_COUNTRIES_TO_REGIONS_CACHING_STATE_;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$CLET;
  private static final SubLSymbol $sym102$NEW_LUCENE_SESSION;
  private static final SubLSymbol $kw103$TEXT;
  private static final SubLSymbol $kw104$CYC;
  private static final SubLSymbol $sym105$LUCENE_OPTIMIZE;
  private static final SubLSymbol $sym106$LUCENE_FINALIZE;
  private static final SubLString $str107$_indexed_docs_txt;
  private static final SubLSymbol $sym108$DIRECTORY_P;
  private static final SubLString $str109$Indexing_files;
  private static final SubLString $str110$cdolist;
  private static final SubLString $str111$;
  private static final SubLSymbol $kw112$APPEND;
  private static final SubLString $str113$Unable_to_open__S;
  private static final SubLString $str114$_A__;
  private static final SubLString $str115$_host_george_scratch_tagged_xml_d;
  private static final SubLString $str116$title;
  private static final SubLString $str117$_title_;
  private static final SubLString $str118$__title_;
  private static final SubLString $str119$text;
  private static final SubLString $str120$_text_;
  private static final SubLString $str121$__text_;
  private static final SubLString $str122$keystring;
  private static final SubLString $str123$_keystring_;
  private static final SubLString $str124$_confirmed_concept_keystring_;
  private static final SubLString $str125$original_filename;
  private static final SubLString $str126$_original_filename_;
  private static final SubLString $str127$url;
  private static final SubLString $str128$_url_;
  private static final SubLString $str129$__url_;
  private static final SubLString $str130$parent_filename;
  private static final SubLString $str131$_parent_filename_;
  private static final SubLString $str132$sem;
  private static final SubLString $str133$_host_george_scratch_tagged_docs_;
  private static final SubLString $str134$Tagging_files;
  private static final SubLSymbol $kw135$DONE;
  private static final SubLSymbol $kw136$NEW;
  private static final SubLList $list137;
  private static final SubLString $str138$_S_tagging__S__;
  private static final SubLString $str139$_txt;
  private static final SubLString $str140$_cyc_idx;
  private static final SubLList $list141;
  private static final SubLString $str142$_;
  private static final SubLString $str143$_;
  private static final SubLSymbol $kw144$OUTPUT;
  private static final SubLString $str145$Doc;
  private static final SubLString $str146$There_is_no_text_in_the_body_of_t;
  private static final SubLString $str147$Couldn_t_find_source_file__S__Mov;
  private static final SubLSymbol $kw148$INPUT;
  private static final SubLSymbol $sym149$CCONCATENATE;
  private static final SubLList $list150;
  private static final SubLSymbol $sym151$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str152$problem_indexing__a_____moving_on;
  private static final SubLString $str153$http___doc_cyc_com_;
  private static final SubLString $str154$_cyc_;
  private static final SubLString $str155$title___S__;
  private static final SubLString $str156$url___S__;
  private static final SubLSymbol $sym157$LUCENE_ADD_DOCUMENT;
  private static final SubLSymbol $kw158$SIMPLE;
  private static final SubLString $str159$_;
  private static final SubLSymbol $sym160$POS_TAGGING_CONCEPT_TAGGER;
  private static final SubLSymbol $sym161$STRINGP;
  private static final SubLSymbol $kw162$LEXICON;
  private static final SubLSymbol $kw163$SENSE_TAGGER;
  private static final SubLSymbol $sym164$_EXIT;
  private static final SubLSymbol $sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS;
  private static final SubLString $str166$Mww;
  private static final SubLString $str167$writing_to__S;
  private static final SubLSymbol $sym168$TAG_DOCUMENT_NODES_FOR_DISPLAY;
  private static final SubLString $str169$full;
  private static final SubLList $list170;
  private static final SubLString $str171$_ua0_;
  private static final SubLSymbol $sym172$_;
  private static final SubLSymbol $sym173$FIRST;
  private static final SubLSymbol $sym174$CANONICALIZE_TERM;
  private static final SubLList $list175;
  private static final SubLObject $const176$InstanceNamedFn_Ternary;
  private static final SubLList $list177;
  private static final SubLSymbol $sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS;
  private static final SubLString $str179$dogs_have_four_feet;
  private static final SubLList $list180;
  private static final SubLSymbol $sym181$EXCLUDE_POS;
  private static final SubLObject $const182$Verb;
  private static final SubLObject $const183$Adjective;
  private static final SubLObject $const184$Adverb;
  private static final SubLObject $const185$Gerundive;
  private static final SubLSymbol $sym186$ADD_CONCEPT_FILTER_SPEC;
  private static final SubLList $list187;
  private static final SubLString $str188$_tagged_html;
  private static final SubLString $str189$_span_property__cyc_termName__con;
  private static final SubLString $str190$___span_class__cycTerm__id__cycTe;
  private static final SubLString $str191$__property__cyc_termId__content__;
  private static final SubLString $str192$__;
  private static final SubLString $str193$__span___span_;
  private static final SubLList $list194;
  private static final SubLString $str195$http___sw_cyc_com_concept_;
  private static final SubLList $list196;
  private static final SubLString $str197$s;
  private static final SubLString $str198$t;
  private static final SubLString $str199$data_doc_tagging_term_id_fht;
  private static final SubLString $str200$data_doc_tagging_id_term_fht;
  private static final SubLString $str201$Meaning__;
  private static final SubLString $str202$_;
  private static final SubLString $str203$__;
  private static final SubLString $str204$_;
  private static final SubLSymbol $sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING;
  private static final SubLString $str206$Text_Match__;
  private static final SubLString $str207$Invalid_justification_string___S;
  private static final SubLSymbol $sym208$GENERATE_TERM_EXPLANATION;
  private static final SubLSymbol $kw209$DEFAULT;
  private static final SubLObject $const210$userDocComment;
  private static final SubLObject $const211$CCF_CAE_QueryMt;
  private static final SubLSymbol $kw212$DEMERIT_CUTOFF;
  private static final SubLList $list213;
  private static final SubLString $str214$_b_Synonyms__b___;
  private static final SubLString $str215$_b_;
  private static final SubLString $str216$__b___;
  private static final SubLString $str217$_br_;
  private static final SubLString $str218$_div_style__background_color__whi;
  private static final SubLString $str219$__div_;
  private static final SubLObject $const220$SurgicalProcedure;
  private static final SubLObject $const221$Surgery;
  private static final SubLSymbol $sym222$_DOC;
  private static final SubLObject $const223$expertAtSkill;
  private static final SubLObject $const224$CCFPersonnelDataMt;
  private static final SubLString $str225$_b_Specialists____b_;
  private static final SubLSymbol $sym226$DOCUMENT_ANNOTATION_TERM_ID;
  private static final SubLSymbol $sym227$_DOCUMENT_ANNOTATION_TERM_ID_CACHING_STATE_;
  private static final SubLInteger $int228$25000;
  private static final SubLSymbol $sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID;
  private static final SubLSymbol $sym230$_DOCUMENT_ANNOTATION_TERM_FROM_ID_CACHING_STATE_;
  private static final SubLInteger $int231$5000;
  private static final SubLObject $const232$PredicateTaxonomy;
  private static final SubLList $list233;
  private static final SubLString $str234$vocabMarking;
  private static final SubLSymbol $sym235$ADD_LEARNER;
  private static final SubLSymbol $sym236$STANFORD_NER_LEARN;
  private static final SubLSymbol $sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON;
  private static final SubLSymbol $sym238$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw239$OFF;
  private static final SubLSymbol $sym240$EXCLUDE_PREDICATE;
  private static final SubLObject $const241$countryCodeTrigraph;
  private static final SubLObject $const242$countryCodeDigraph;
  private static final SubLSymbol $sym243$ALLOW_POS;
  private static final SubLObject $const244$ClosedClassWord;
  private static final SubLSymbol $sym245$SCALAR_INTERVAL_LEARN;
  private static final SubLSymbol $sym246$DATE_LEARN;
  private static final SubLSymbol $sym247$_GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON_CACHING_STATE_;
  private static final SubLSymbol $sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON;
  private static final SubLSymbol $sym249$_GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON_CACHING_STATE_;
  private static final SubLSymbol $sym250$TERM_LEXICON;
  private static final SubLSymbol $sym251$IGNORE_CACHE;
  private static final SubLSymbol $kw252$PREFERRED;
  private static final SubLSymbol $sym253$ALLOW_PREDICATE;
  private static final SubLObject $const254$preferredNameString;
  private static final SubLObject $const255$ksTermString;
  private static final SubLObject $const256$alias;
  private static final SubLObject $const257$programStrings;
  private static final SubLObject $const258$airportHasIATACode;
  private static final SubLObject $const259$airportHasICAOCode;
  private static final SubLSymbol $sym260$SET_BASE_MT;
  private static final SubLSymbol $sym261$ALLOW_MT;
  private static final SubLObject $const262$TechnicalEnglishLexicalMt;
  private static final SubLObject $const263$MedicalLexicalMt;
  private static final SubLString $str264$CCFLexicalMt;
  private static final SubLObject $const265$CCFLexicalMt;
  private static final SubLList $list266;
  private static final SubLSymbol $kw267$NOTHING_DONE;
  private static final SubLString $str268$rebuilding_term_id_FHT;
  private static final SubLSymbol $kw269$SKIP;
  private static final SubLString $str270$Rebuilding_id__term_map;
  private static final SubLString $str271$Augmenting_term_id_FHT;
  private static final SubLSymbol $kw272$NO_ID;
  private static final SubLSymbol $kw273$INTERP_ID;
  private static final SubLList $list274;
  private static final SubLSymbol $kw275$DOC_TEXT;
  private static final SubLSymbol $kw276$SEARCH_TYPE;
  private static final SubLSymbol $sym277$LUCENE_DOUBLE_QUERY;
  private static final SubLString $str278$0_0_t___;
  private static final SubLString $str279$0_0_s___;
  private static final SubLSymbol $sym280$TERMS_FOR_CYC_SEMANTIC_QUERY;
  private static final SubLSymbol $kw281$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym282$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str283$_cyc_projects_doc_annotation_quer;
  private static final SubLString $str284$_A___S__;
  private static final SubLSymbol $sym285$STOPWORD_IN_SEM_QUERY_;
  private static final SubLSymbol $sym286$REMOVE_CDAR;
  private static final SubLSymbol $sym287$CADAR;
  private static final SubLString $str288$0_0_s;
  private static final SubLSymbol $kw289$INTERP;
  private static final SubLSymbol $sym290$TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY;
  private static final SubLList $list291;
  private static final SubLString $str292$_____a_z0_9A_Z_________;
  private static final SubLString $str293$__;
  private static final SubLString $str294$__;
  private static final SubLString $str295$__;
  private static final SubLString $str296$_____________;
  private static final SubLString $str297$__0_9a_fA_F___;
  private static final SubLSymbol $kw298$SNIPPET;
  private static final SubLSymbol $kw299$TITLE;
  private static final SubLList $list300;
  private static final SubLSymbol $sym301$SEEN_;
  private static final SubLList $list302;
  private static final SubLSymbol $sym303$DO_LEXICON;
  private static final SubLSymbol $sym304$STRING;
  private static final SubLSymbol $sym305$LEX;
  private static final SubLList $list306;
  private static final SubLSymbol $sym307$CSETQ;
  private static final SubLList $list308;
  private static final SubLSymbol $sym309$PUNLESS;
  private static final SubLSymbol $sym310$GETHASH_WITHOUT_VALUES;
  private static final SubLSymbol $sym311$SETHASH;
  private static final SubLList $list312;
  private static final SubLString $str313$_A___A__;
  private static final SubLString $str314$____A__;
  private static final SubLString $str315$_A_;
  private static final SubLString $str316$__;
  private static final SubLSymbol $sym317$REMOVE_PICTURES_REGEXP_TEST;
  private static final SubLSymbol $kw318$TEST;
  private static final SubLSymbol $kw319$OWNER;
  private static final SubLSymbol $kw320$CLASSES;
  private static final SubLSymbol $kw321$KB;
  private static final SubLSymbol $kw322$TINY;
  private static final SubLSymbol $kw323$WORKING_;
  private static final SubLList $list324;
  private static final SubLSymbol $sym325$GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES;
  private static final SubLList $list326;
  private static final SubLSymbol $sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_;
  private static final SubLObject $const328$PiracyReportInterpretationMt;
  private static final SubLList $list329;
  private static final SubLSymbol $sym330$DO_SET;
  private static final SubLSymbol $sym331$RELEVANT_MT_IS_GENL_MT;
  private static final SubLString $str332$Dont_know_yet_how_to_unify_a_sent;
  private static final SubLString $str333$Dont_know_how_to_deal_with_test__;
  private static final SubLSymbol $kw334$ADD_CONCEPT;
  private static final SubLSymbol $kw335$ADD_SENTENCE;
  private static final SubLObject $const336$interpretationSuggestion;
  private static final SubLSymbol $kw337$GAF;
  private static final SubLSymbol $kw338$TRUE;
  private static final SubLSymbol $kw339$ANTECEDENT;
  private static final SubLSymbol $kw340$CONSEQUENT;
  private static final SubLSymbol $kw341$PRECONDITIONS;
  private static final SubLSymbol $kw342$SUGGESTIONS;
  private static final SubLObject $const343$containsProposition_CW;
  private static final SubLObject $const344$thingDescribed;
  private static final SubLObject $const345$The;
  private static final SubLString $str346$Invalid_THE_expression__A___;
  private static final SubLString $str347$Dont_know_how_to_handle_precondit;
  private static final SubLString $str348$If_it_is_the_case_that__;
  private static final SubLString $str349$then_one_might_conclude_that__;
  private static final SubLString $str350$mt;
  private static final SubLString $str351$Document_Interpretation_Suggestio;
  private static final SubLString $str352$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str353$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw354$CB_CYC;
  private static final SubLSymbol $kw355$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw356$SHA1;
  private static final SubLString $str357$yui_skin_sam;
  private static final SubLString $str358$reloadFrameButton;
  private static final SubLString $str359$button;
  private static final SubLString $str360$reload;
  private static final SubLString $str361$Refresh_Frames;
  private static final SubLString $str362$Enter_the_text_to_interpret_;
  private static final SubLString $str363$post;
  private static final SubLString $str364$cb_document_interpretation_sugges;
  private static final SubLString $str365$Submit;
  private static final SubLString $str366$Clear;
  private static final SubLInteger $int367$80;
  private static final SubLString $str368$Rule_Mt__;
  private static final SubLInteger $int369$40;
  private static final SubLString $str370$Complete;
  private static final SubLObject $const371$Microtheory;
  private static final SubLString $str372$Identified_Concepts;
  private static final SubLString $str373$Suggested_Concepts;
  private static final SubLString $str374$Suggested_Sentences;
  private static final SubLString $str375$Applied_Rules;
  private static final SubLSymbol $sym376$CB_DOCUMENT_INTERPRETATION_SUGGESTIONS;
  private static final SubLSymbol $kw377$HTML_HANDLER;
  private static final SubLString $str378$For_each_string____concept_mappin;
  private static final SubLString $str379$previous_input_file;
  private static final SubLString $str380$input_file;
  private static final SubLString $str381$next_index;
  private static final SubLString $str382$0;
  private static final SubLInteger $int383$30;
  private static final SubLString $str384$Manual_Concept_Annotation;
  private static final SubLString $str385$cb_annotate_tagged_concepts;
  private static final SubLString $str386$Tagging_File_Name__;
  private static final SubLString $str387$tr__border_color__black__________;
  private static final SubLList $list388;
  private static final SubLString $str389$first;
  private static final SubLString $str390$other;
  private static final SubLString $str391$_S;
  private static final SubLString $str392$frequency___S__;
  private static final SubLString $str393$30_;
  private static final SubLString $str394$_CCFFCC;
  private static final SubLString $str395$primary;
  private static final SubLString $str396$Primary_Meaning___;
  private static final SubLString $str397$_CCFFFF;
  private static final SubLString $str398$contextual;
  private static final SubLString $str399$Contextually_Dependent___;
  private static final SubLString $str400$_FFCCFF;
  private static final SubLString $str401$very_rare;
  private static final SubLString $str402$Rare___;
  private static final SubLString $str403$_FFCCCC;
  private static final SubLString $str404$indecipherable;
  private static final SubLString $str405$Indecipherable__;
  private static final SubLString $str406$_FFFFCC;
  private static final SubLString $str407$merge_candidate;
  private static final SubLString $str408$Merge_away;
  private static final SubLString $str409$_CCCCFF;
  private static final SubLString $str410$kill_candidate;
  private static final SubLString $str411$Invalid;
  private static final SubLSymbol $sym412$CB_ANNOTATE_TAGGED_CONCEPTS;
  private static final SubLString $str413$_out;
  private static final SubLString $str414$_A__A__A__;
  private static final SubLSymbol $kw415$EOF;
  private static final SubLString $str416$_;
  private static final SubLString $str417$_cyc_projects_sabre_data_july_200;
  private static final SubLList $list418;
  private static final SubLString $str419$_;
  private static final SubLList $list420;
  private static final SubLString $str421$_cyc_projects_sabre_data_july_200;
  private static final SubLList $list422;
  private static final SubLList $list423;
  private static final SubLList $list424;
  private static final SubLString $str425$f_____strengthOfLexicalMapping_;
  private static final SubLString $str426$___PrimaryLexicalMapping__;
  private static final SubLString $str427$___VanishinglyRareLexicalMapping_;
  private static final SubLString $str428$___ContextuallyDependentLexicalMa;
  private static final SubLString $str429$kill__;
  private static final SubLList $list430;
  private static final SubLString $str431$input_file_line___S__;
  private static final SubLList $list432;
  private static final SubLString $str433$__S__S__S___;

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2408L)
  public static SubLObject trace_doc_search(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject out = $sym9$OUT;
      return ConsesLow.list( $sym10$PROGN, ConsesLow.list( $sym11$PWHEN, $sym12$_TRACE_DOC_SEARCH_INTERFACE_, ConsesLow.list( $sym13$FORMAT, $sym14$_TRACE_OUTPUT_, $str15$___A__entering__S__, $list16, list ) ), ConsesLow
          .list( $sym11$PWHEN, $sym17$_DOC_SEARCH_TRACE_LOG_FILE_, ConsesLow.list( $sym18$WITH_PRIVATE_TEXT_FILE, reader.bq_cons( out, $list19 ), $list20, ConsesLow.list( $sym13$FORMAT, out, $str15$___A__entering__S__,
              $list16, list ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2882L)
  public static SubLObject get_text_index()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $text_index_override$.getDynamicValue( thread ) ) ? $text_index_override$.getDynamicValue( thread ) : $text_index$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2974L)
  public static SubLObject get_semantic_index()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $semantic_index_override$.getDynamicValue( thread ) ) ? $semantic_index_override$.getDynamicValue( thread ) : $semantic_index$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4228L)
  public static SubLObject semantic_index_initializedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( $semantic_index$.getDynamicValue( thread ) == $kw24$UNINITIALIZED ) ? NIL : T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4334L)
  public static SubLObject use_daves_temp_indexes()
  {
    $text_index$.setDynamicValue( $str25$_host_george_scratch_text_index );
    $semantic_index$.setDynamicValue( $str26$_host_george_scratch_sem_index );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4501L)
  public static SubLObject use_development_indexes()
  {
    $text_index$.setDynamicValue( $str27$_host_george_simple_tagged_index_ );
    $semantic_index$.setDynamicValue( $str28$_host_george_simple_tagged_index_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4687L)
  public static SubLObject use_development_disambiguated_indexes()
  {
    $text_index$.setDynamicValue( $str29$_host_george_disambiguated_index_ );
    $semantic_index$.setDynamicValue( $str30$_host_george_disambiguated_index_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4879L)
  public static SubLObject use_hezbollah_indexes()
  {
    $text_index$.setDynamicValue( $str0$_host_george_super_index_hezbolla );
    $semantic_index$.setDynamicValue( $str1$_host_george_super_index_hezbolla );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5061L)
  public static SubLObject new_closure_justification(final SubLObject template, final SubLObject spec, final SubLObject genl)
  {
    return ConsesLow.list( template, spec, genl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5209L)
  public static SubLObject get_closure_justification_gaf(final SubLObject cj)
  {
    return cj.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5281L)
  public static SubLObject get_closure_justification_spec(final SubLObject cj)
  {
    return conses_high.second( cj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5355L)
  public static SubLObject get_closure_justification_genl(final SubLObject cj)
  {
    return conses_high.third( cj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5430L)
  public static SubLObject closure_justification_predicate(final SubLObject justification)
  {
    return cycl_utilities.formula_operator( get_closure_justification_gaf( justification ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5617L)
  public static SubLObject closure_justification_pred_id(final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.assoc( closure_justification_predicate( justification ), $predicate_id_table$.getDynamicValue( thread ), EQUAL, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5830L)
  public static SubLObject substitute_template(final SubLObject template, final SubLObject spec, final SubLObject genl)
  {
    SubLObject formula = el_utilities.variable_subst( spec, $kw31$SPEC, template );
    formula = el_utilities.variable_subst( genl, $kw32$GENL, formula );
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6112L)
  public static SubLObject predicate_template(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.assoc( predicate, $predicate_template_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6259L)
  public static SubLObject make_justifications(final SubLObject template, final SubLObject v_term, final SubLObject v_genls)
  {
    SubLObject justifications = NIL;
    SubLObject cdolist_list_var = v_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == doc_annotation_irrelevant_term( genl ) )
      {
        justifications = ConsesLow.cons( new_closure_justification( template, v_term, genl ), justifications );
      }
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    return justifications;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6706L)
  public static SubLObject doc_annotation_irrelevant_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == thcl.thcl_fortP( v_term, $doc_annotation_thcl_verboseP$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
  public static SubLObject clear_term_learner_object_from_id()
  {
    final SubLObject cs = $term_learner_object_from_id_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
  public static SubLObject remove_term_learner_object_from_id(final SubLObject id_string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_object_from_id_caching_state$.getGlobalValue(), ConsesLow.list( id_string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
  public static SubLObject term_learner_object_from_id_internal(final SubLObject id_string)
  {
    if( NIL == id_string )
    {
      return NIL;
    }
    return kb_utilities.maybe_find_object_by_compact_hl_external_id_string( id_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
  public static SubLObject term_learner_object_from_id(final SubLObject id_string)
  {
    SubLObject caching_state = $term_learner_object_from_id_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym33$TERM_LEARNER_OBJECT_FROM_ID, $sym34$_TERM_LEARNER_OBJECT_FROM_ID_CACHING_STATE_, $int35$4096, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, id_string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_object_from_id_internal( id_string ) ) );
      memoization_state.caching_state_put( caching_state, id_string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7067L)
  public static SubLObject maybe_term_learner_object_from_id(final SubLObject id_string)
  {
    final SubLObject v_object = term_learner_object_from_id( id_string );
    if( NIL != cycl_grammar.cycl_represented_term_p( v_object ) )
    {
      return v_object;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7271L)
  public static SubLObject get_term_learner_id_for_cycl_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject cycl = reader.read_from_string_ignoring_errors( string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject error = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( error == $kw36$ERROR ) ? NIL : term_learner_id( cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
  public static SubLObject clear_term_learner_id()
  {
    final SubLObject cs = $term_learner_id_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
  public static SubLObject remove_term_learner_id(final SubLObject v_object)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $term_learner_id_caching_state$.getGlobalValue(), ConsesLow.list( v_object ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
  public static SubLObject term_learner_id_internal(final SubLObject v_object)
  {
    return kb_utilities.compact_hl_external_id_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
  public static SubLObject term_learner_id(final SubLObject v_object)
  {
    SubLObject caching_state = $term_learner_id_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym37$TERM_LEARNER_ID, $sym38$_TERM_LEARNER_ID_CACHING_STATE_, $int35$4096, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( term_learner_id_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7953L)
  public static SubLObject get_upwards_closure_justifications_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject fortified_term = narts_high.nart_substitute( v_term );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $upwards_closure_query_mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != fort_types_interface.collectionP( fortified_term ) )
      {
        result = make_justifications( predicate_template( $const41$genls ), fortified_term, Sequences.remove( fortified_term, genls.all_genls( fortified_term, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) );
        if( NIL != treatment_for_somethingP( fortified_term ) )
        {
          result = Sequences.cconcatenate( result, make_justifications( predicate_template( $const42$standardTreatmentTypeForCondition ), fortified_term, get_treated_condition( fortified_term ) ) );
        }
        if( NIL != ailmentP( fortified_term ) )
        {
          result = Sequences.cconcatenate( result, make_justifications( predicate_template( $const43$ailmentTypeAfflictsPartType ), fortified_term, get_affected_parts( fortified_term ) ) );
          result = Sequences.cconcatenate( result, make_justifications( predicate_template( $const44$conditionsCommonlyCooccur ), fortified_term, get_cooccurring_conditions( fortified_term ) ) );
          SubLObject cdolist_list_var = get_treatments_for_condition( fortified_term );
          SubLObject treatment = NIL;
          treatment = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = Sequences.cconcatenate( make_justifications( predicate_template( $const42$standardTreatmentTypeForCondition ), treatment, ConsesLow.list( fortified_term ) ), result );
            cdolist_list_var = cdolist_list_var.rest();
            treatment = cdolist_list_var.first();
          }
        }
      }
      else if( NIL != kb_accessors.individualP( fortified_term ) )
      {
        result = make_justifications( predicate_template( $const45$isa ), fortified_term, isa.all_isa( fortified_term, UNPROVIDED, UNPROVIDED ) );
        if( NIL != fort_types_interface.city_in_any_mtP( fortified_term ) )
        {
          result = ConsesLow.append( result, make_justifications( predicate_template( $const46$inRegion ), fortified_term, get_city_regions( fortified_term ) ) );
        }
        else if( NIL != fort_types_interface.country_in_any_mtP( fortified_term ) )
        {
          result = ConsesLow.append( result, make_justifications( predicate_template( $const46$inRegion ), fortified_term, get_country_regions( fortified_term ) ) );
        }
        else if( NIL != agentP( fortified_term ) )
        {
          result = ConsesLow.append( result, make_justifications( predicate_template( $const47$hasLeaders ), fortified_term, get_groups( fortified_term ) ) );
        }
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

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7953L)
  public static SubLObject get_upwards_closure_justifications(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_upwards_closure_justifications_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_upwards_closure_justifications_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10260L)
  public static SubLObject get_upwards_closure(final SubLObject v_term)
  {
    SubLObject closure = NIL;
    SubLObject cdolist_list_var = get_upwards_closure_justifications_cached( v_term );
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      closure = ConsesLow.cons( get_closure_justification_genl( justification ), closure );
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    return closure;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
  public static SubLObject clear_get_upwards_closure_justifications_cached()
  {
    final SubLObject cs = $get_upwards_closure_justifications_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
  public static SubLObject remove_get_upwards_closure_justifications_cached(final SubLObject v_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_upwards_closure_justifications_cached_caching_state$.getGlobalValue(), ConsesLow.list( v_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
  public static SubLObject get_upwards_closure_justifications_cached_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == file_backed_cache.file_backed_cache_p( $upwards_closure_justification_fbc$.getDynamicValue( thread ) ) )
    {
      $upwards_closure_justification_fbc$.setDynamicValue( file_backed_cache.file_backed_cache_create( $upwards_closure_justification_fht_path$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), thread );
    }
    SubLObject result = NIL;
    result = file_backed_cache.file_backed_cache_lookup( v_term, $upwards_closure_justification_fbc$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( result == $kw49$NOT_FOUND )
    {
      result = get_upwards_closure_justifications( v_term );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
  public static SubLObject get_upwards_closure_justifications_cached(final SubLObject v_term)
  {
    SubLObject caching_state = $get_upwards_closure_justifications_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED, $sym50$_GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_upwards_closure_justifications_cached_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 11282L)
  public static SubLObject caching_upwards_closure_justificationsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $caching_upwards_closure_justificationsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 11393L)
  public static SubLObject cache_upwards_closure_justifications(SubLObject cache_file)
  {
    if( cache_file == UNPROVIDED )
    {
      cache_file = $str51$_cyc_top_data_doc_tagging_upwards;
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
      final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject v_cache = file_hash_table.create_file_hash_table( cache_file, forts.fort_count(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject _prev_bind_0_$2 = $caching_upwards_closure_justificationsP$.currentBinding( thread );
          try
          {
            $caching_upwards_closure_justificationsP$.bind( T, thread );
            final SubLObject table_var;
            final SubLObject term_fht = table_var = file_hash_table.open_file_hash_table( $doc_annotator_term_id_fbc_path$.getDynamicValue( thread ), file_hash_table.$default_fht_test_function$.getGlobalValue(),
                $kw52$IMAGE_INDEPENDENT_CFASL );
            utilities_macros.$progress_note$.setDynamicValue( $str53$Caching_upwards_closure_justifica, thread );
            utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( table_var ), thread );
            utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
            final SubLObject _prev_bind_0_$3 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
            final SubLObject _prev_bind_1_$4 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
            final SubLObject _prev_bind_2_$5 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
              utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
              utilities_macros.$within_noting_percent_progress$.bind( T, thread );
              utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
              try
              {
                utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
                SubLObject continuation = NIL;
                SubLObject next;
                for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject the_key = file_hash_table.get_file_hash_table_any( table_var, continuation, NIL );
                  final SubLObject the_value = thread.secondMultipleValue();
                  next = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != next )
                  {
                    final SubLObject fort = the_key;
                    final SubLObject id = the_value;
                    utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                    utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                    final SubLObject value = get_upwards_closure_justifications( fort );
                    file_hash_table.put_file_hash_table( fort, v_cache, value );
                  }
                  continuation = next;
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  utilities_macros.noting_percent_progress_postamble();
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                }
              }
            }
            finally
            {
              utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
              utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$5, thread );
              utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$4, thread );
              utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$3, thread );
            }
            file_hash_table.finalize_file_hash_table( v_cache );
            file_hash_table.finalize_file_hash_table( term_fht );
          }
          finally
          {
            $caching_upwards_closure_justificationsP$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return cache_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12173L)
  public static SubLObject cache_upwards_closure_justification(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject fht = NIL;
    try
    {
      fht = file_hash_table.open_file_hash_table( $upwards_closure_justification_fht_path$.getDynamicValue( thread ), file_hash_table.$default_fht_test_function$.getGlobalValue(), $kw52$IMAGE_INDEPENDENT_CFASL );
      final SubLObject _prev_bind_0 = $caching_upwards_closure_justificationsP$.currentBinding( thread );
      try
      {
        $caching_upwards_closure_justificationsP$.bind( T, thread );
        final SubLObject value = get_upwards_closure_justifications( v_term );
        file_hash_table.put_file_hash_table( v_term, fht, value );
      }
      finally
      {
        $caching_upwards_closure_justificationsP$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_hash_table.file_hash_table_p( fht ) )
        {
          file_hash_table.finalize_file_hash_table( fht );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12594L)
  public static SubLObject treatment_for_somethingP(final SubLObject v_term)
  {
    return makeBoolean( NIL != genls.genl_in_any_mtP( v_term, $const54$MedicalDevice ) || NIL != genls.genl_in_any_mtP( v_term, $const55$MedicalTreatmentEvent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12750L)
  public static SubLObject ailmentP(final SubLObject v_term)
  {
    return genls.genl_in_any_mtP( v_term, $const56$AilmentCondition );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12834L)
  public static SubLObject agentP(final SubLObject v_term)
  {
    return isa.isa_in_any_mtP( v_term, $const57$IntelligentAgent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
  public static SubLObject clear_get_treated_condition()
  {
    final SubLObject cs = $get_treated_condition_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
  public static SubLObject remove_get_treated_condition(final SubLObject device_or_treatment)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_treated_condition_caching_state$.getGlobalValue(), ConsesLow.list( device_or_treatment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
  public static SubLObject get_treated_condition_internal(final SubLObject device_or_treatment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ask_utilities.query_variable( $sym59$_X, ConsesLow.list( $const60$or, ConsesLow.listS( $const61$deviceTypeTreatsConditionType, device_or_treatment, $list62 ), ConsesLow.listS(
        $const42$standardTreatmentTypeForCondition, device_or_treatment, $list62 ) ), mt_relevance_macros.$mt$.getDynamicValue( thread ), $list63 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
  public static SubLObject get_treated_condition(final SubLObject device_or_treatment)
  {
    SubLObject caching_state = $get_treated_condition_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym58$GET_TREATED_CONDITION, $sym64$_GET_TREATED_CONDITION_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym65$CLEAR_GET_TREATED_CONDITION );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, device_or_treatment, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_treated_condition_internal( device_or_treatment ) ) );
      memoization_state.caching_state_put( caching_state, device_or_treatment, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
  public static SubLObject clear_get_treatments_for_condition()
  {
    final SubLObject cs = $get_treatments_for_condition_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
  public static SubLObject remove_get_treatments_for_condition(final SubLObject ailment)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_treatments_for_condition_caching_state$.getGlobalValue(), ConsesLow.list( ailment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
  public static SubLObject get_treatments_for_condition_internal(final SubLObject ailment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ask_utilities.query_variable( $sym59$_X, ConsesLow.list( $const60$or, ConsesLow.list( $const61$deviceTypeTreatsConditionType, $sym59$_X, ailment ), ConsesLow.list( $const42$standardTreatmentTypeForCondition,
        $sym59$_X, ailment ) ), mt_relevance_macros.$mt$.getDynamicValue( thread ), $list63 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
  public static SubLObject get_treatments_for_condition(final SubLObject ailment)
  {
    SubLObject caching_state = $get_treatments_for_condition_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym66$GET_TREATMENTS_FOR_CONDITION, $sym67$_GET_TREATMENTS_FOR_CONDITION_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym68$CLEAR_GET_TREATMENTS_FOR_CONDITION );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_treatments_for_condition_internal( ailment ) ) );
      memoization_state.caching_state_put( caching_state, ailment, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
  public static SubLObject clear_get_affected_parts()
  {
    final SubLObject cs = $get_affected_parts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
  public static SubLObject remove_get_affected_parts(final SubLObject ailment)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_affected_parts_caching_state$.getGlobalValue(), ConsesLow.list( ailment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
  public static SubLObject get_affected_parts_internal(final SubLObject ailment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ask_utilities.query_variable( $sym59$_X, ConsesLow.listS( $const43$ailmentTypeAfflictsPartType, ailment, $list62 ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
  public static SubLObject get_affected_parts(final SubLObject ailment)
  {
    SubLObject caching_state = $get_affected_parts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym69$GET_AFFECTED_PARTS, $sym70$_GET_AFFECTED_PARTS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym71$CLEAR_GET_AFFECTED_PARTS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_affected_parts_internal( ailment ) ) );
      memoization_state.caching_state_put( caching_state, ailment, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
  public static SubLObject clear_get_cooccurring_conditions()
  {
    final SubLObject cs = $get_cooccurring_conditions_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
  public static SubLObject remove_get_cooccurring_conditions(final SubLObject ailment)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_cooccurring_conditions_caching_state$.getGlobalValue(), ConsesLow.list( ailment ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
  public static SubLObject get_cooccurring_conditions_internal(final SubLObject ailment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ask_utilities.query_variable( $sym59$_X, ConsesLow.listS( $const44$conditionsCommonlyCooccur, ailment, $list62 ), mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
  public static SubLObject get_cooccurring_conditions(final SubLObject ailment)
  {
    SubLObject caching_state = $get_cooccurring_conditions_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym72$GET_COOCCURRING_CONDITIONS, $sym73$_GET_COOCCURRING_CONDITIONS_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym74$CLEAR_GET_COOCCURRING_CONDITIONS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_cooccurring_conditions_internal( ailment ) ) );
      memoization_state.caching_state_put( caching_state, ailment, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13843L)
  public static SubLObject get_groups(final SubLObject agent)
  {
    if( NIL != caching_upwards_closure_justificationsP() )
    {
      return list_utilities.alist_lookup_without_values( leaders_to_groups(), agent, UNPROVIDED, UNPROVIDED );
    }
    return get_groups_non_cached( agent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14042L)
  public static SubLObject get_groups_non_cached(final SubLObject agent)
  {
    if( NIL == forts.fort_p( narts_high.nart_substitute( agent ) ) )
    {
      return NIL;
    }
    return ask_utilities.query_template( $sym75$_GROUP, ConsesLow.list( $const47$hasLeaders, $sym75$_GROUP, agent ), $const76$InferencePSC, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
  public static SubLObject clear_leaders_to_groups()
  {
    final SubLObject cs = $leaders_to_groups_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
  public static SubLObject remove_leaders_to_groups()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $leaders_to_groups_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
  public static SubLObject leaders_to_groups_internal()
  {
    SubLObject alist = NIL;
    SubLObject cdolist_list_var = ask_utilities.query_template( $list79, $list80, $const76$InferencePSC, UNPROVIDED );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject leader = NIL;
      SubLObject group = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
      leader = current.first();
      current = ( group = current.rest() );
      alist = list_utilities.alist_pushnew( alist, leader, group, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
  public static SubLObject leaders_to_groups()
  {
    SubLObject caching_state = $leaders_to_groups_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym77$LEADERS_TO_GROUPS, $sym81$_LEADERS_TO_GROUPS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( leaders_to_groups_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14550L)
  public static SubLObject get_city_regions(final SubLObject city)
  {
    SubLObject regions = NIL;
    SubLObject cdolist_list_var = get_city_countries( city );
    SubLObject country = NIL;
    country = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      regions = ConsesLow.cons( country, regions );
      regions = ConsesLow.append( get_country_regions( country ), regions );
      cdolist_list_var = cdolist_list_var.rest();
      country = cdolist_list_var.first();
    }
    return regions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14783L)
  public static SubLObject get_city_countries(final SubLObject city)
  {
    if( NIL != caching_upwards_closure_justificationsP() )
    {
      return list_utilities.alist_lookup_without_values( cities_to_countries(), city, UNPROVIDED, UNPROVIDED );
    }
    return get_city_countries_non_cached( city );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
  public static SubLObject clear_cities_to_countries()
  {
    final SubLObject cs = $cities_to_countries_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
  public static SubLObject remove_cities_to_countries()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cities_to_countries_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
  public static SubLObject cities_to_countries_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject alist = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str83$Caching_countries_of_all_cities__ );
        final SubLObject template = $list84;
        final SubLObject sentence = $list85;
        SubLObject cdolist_list_var;
        final SubLObject pairs = cdolist_list_var = ask_utilities.query_template( template, sentence, $const76$InferencePSC, UNPROVIDED );
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = pair;
          SubLObject city = NIL;
          SubLObject country = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
          city = current.first();
          current = ( country = current.rest() );
          alist = list_utilities.alist_pushnew( alist, city, country, UNPROVIDED, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          pair = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
  public static SubLObject cities_to_countries()
  {
    SubLObject caching_state = $cities_to_countries_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym82$CITIES_TO_COUNTRIES, $sym87$_CITIES_TO_COUNTRIES_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cities_to_countries_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 15453L)
  public static SubLObject get_city_countries_non_cached(final SubLObject city)
  {
    if( NIL != forts.fort_p( narts_high.nart_substitute( city ) ) )
    {
      return ask_utilities.query_template( $sym88$_COUNTRY, ConsesLow.list( $const89$countryOfCity, $sym88$_COUNTRY, city ), $const76$InferencePSC, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 15641L)
  public static SubLObject get_country_regions(final SubLObject country)
  {
    if( NIL != caching_upwards_closure_justificationsP() )
    {
      return list_utilities.alist_lookup_without_values( countries_to_regions(), country, UNPROVIDED, UNPROVIDED );
    }
    return get_country_regions_non_cached( country );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 15867L)
  public static SubLObject get_country_regions_non_cached(final SubLObject country)
  {
    if( NIL != forts.fort_p( narts_high.nart_substitute( country ) ) )
    {
      return ask_utilities.query_template( $sym90$_REGION, ConsesLow.listS( $const91$and, $list92, ConsesLow.listS( $const45$isa, country, $list93 ), $list94 ), $const76$InferencePSC, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
  public static SubLObject clear_countries_to_regions()
  {
    final SubLObject cs = $countries_to_regions_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
  public static SubLObject remove_countries_to_regions()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $countries_to_regions_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
  public static SubLObject countries_to_regions_internal()
  {
    SubLObject alist = NIL;
    SubLObject cdolist_list_var = ask_utilities.query_template( $list97, $list98, $const76$InferencePSC, UNPROVIDED );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject country = NIL;
      SubLObject region = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
      country = current.first();
      current = ( region = current.rest() );
      alist = list_utilities.alist_pushnew( alist, country, region, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
  public static SubLObject countries_to_regions()
  {
    SubLObject caching_state = $countries_to_regions_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym95$COUNTRIES_TO_REGIONS, $sym99$_COUNTRIES_TO_REGIONS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( countries_to_regions_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16678L)
  public static SubLObject with_dual_lucene_sessions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject semantic_session = NIL;
    SubLObject keyword_session = NIL;
    SubLObject host = NIL;
    SubLObject port = NIL;
    SubLObject text_index_file = NIL;
    SubLObject sem_index_file = NIL;
    SubLObject overwriteP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    semantic_session = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    keyword_session = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    host = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    port = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    text_index_file = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    sem_index_file = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    overwriteP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym101$CLET, ConsesLow.list( ConsesLow.list( keyword_session, ConsesLow.list( $sym102$NEW_LUCENE_SESSION, host, port, text_index_file, $kw103$TEXT, overwriteP ) ), ConsesLow.list(
          semantic_session, ConsesLow.list( $sym102$NEW_LUCENE_SESSION, host, port, sem_index_file, $kw104$CYC, overwriteP ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym105$LUCENE_OPTIMIZE,
              keyword_session ), ConsesLow.list( $sym105$LUCENE_OPTIMIZE, semantic_session ), ConsesLow.list( $sym106$LUCENE_FINALIZE, keyword_session ), ConsesLow.list( $sym106$LUCENE_FINALIZE, semantic_session ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 17222L)
  public static SubLObject add_fully_indexed_documents_from_dir(final SubLObject directory, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file,
      final SubLObject overwriteP)
  {
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
      final SubLObject keyword_session = lucene_session.new_lucene_session( host, port, text_index_file, $kw103$TEXT, overwriteP );
      final SubLObject semantic_session = lucene_session.new_lucene_session( host, port, sem_index_file, $kw104$CYC, overwriteP );
      if( NIL != overwriteP )
      {
        file_utilities.delete_file_if_exists( Sequences.cconcatenate( lucene_session.lucene_index( semantic_session ), $str107$_indexed_docs_txt ) );
        file_utilities.delete_file_if_exists( Sequences.cconcatenate( lucene_session.lucene_index( keyword_session ), $str107$_indexed_docs_txt ) );
      }
      assert NIL != Filesys.directory_p( directory ) : directory;
      SubLObject directory_contents_var = Filesys.directory( directory, T );
      final SubLObject progress_message_var = $str109$Indexing_files;
      final SubLObject _prev_bind_0_$9 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
        if( NIL.isFunctionSpec() )
        {
          directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
        }
        final SubLObject list_var = directory_contents_var;
        final SubLObject _prev_bind_0_$10 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_1_$11 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2_$12 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str110$cdolist, thread );
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
            SubLObject file = NIL;
            file = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              if( NIL == Filesys.directory_p( file ) )
              {
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0_$11 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    final SubLObject doc_string = string_utilities.read_string_from_file( file, UNPROVIDED, UNPROVIDED );
                    add_fully_indexed_document( doc_string, file, $str111$, semantic_session, keyword_session );
                    SubLObject cdolist_list_var = ConsesLow.list( keyword_session, semantic_session );
                    SubLObject session = NIL;
                    session = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      SubLObject stream = NIL;
                      try
                      {
                        stream = compatibility.open_text( Sequences.cconcatenate( lucene_session.lucene_index( session ), $str107$_indexed_docs_txt ), $kw112$APPEND );
                        if( !stream.isStream() )
                        {
                          Errors.error( $str113$Unable_to_open__S, Sequences.cconcatenate( lucene_session.lucene_index( session ), $str107$_indexed_docs_txt ) );
                        }
                        final SubLObject s = stream;
                        PrintLow.format( s, $str114$_A__, file );
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                        }
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      session = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$11, thread );
                }
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              file = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
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
          utilities_macros.$progress_total$.rebind( _prev_bind_2_$12, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$11, thread );
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$10, thread );
        }
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_0_$9, thread );
      }
      lucene_session.lucene_optimize( keyword_session );
      lucene_session.lucene_optimize( semantic_session );
      lucene_session.lucene_finalize( keyword_session );
      lucene_session.lucene_finalize( semantic_session );
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 18315L)
  public static SubLObject add_fully_indexed_documents(final SubLObject doc_strings, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file,
      final SubLObject overwriteP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject keyword_session = lucene_session.new_lucene_session( host, port, text_index_file, $kw103$TEXT, overwriteP );
    final SubLObject semantic_session = lucene_session.new_lucene_session( host, port, sem_index_file, $kw104$CYC, overwriteP );
    SubLObject cdolist_list_var = doc_strings;
    SubLObject doc_string = NIL;
    doc_string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          add_fully_indexed_document( doc_string, $str111$, $str111$, semantic_session, keyword_session );
        }
        finally
        {
          final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      doc_string = cdolist_list_var.first();
    }
    lucene_session.lucene_optimize( keyword_session );
    lucene_session.lucene_optimize( semantic_session );
    lucene_session.lucene_finalize( keyword_session );
    lucene_session.lucene_finalize( semantic_session );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 20169L)
  public static SubLObject tag_xml_documents_with_urls(final SubLObject filespecs, SubLObject overwriteP, SubLObject out_directory)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = NIL;
    }
    if( out_directory == UNPROVIDED )
    {
      out_directory = $str133$_host_george_scratch_tagged_docs_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED );
          final SubLObject _prev_bind_0_$19 = utilities_macros.$progress_note$.currentBinding( thread );
          final SubLObject _prev_bind_1_$20 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2_$21 = utilities_macros.$progress_total$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_note$.bind( $str134$Tagging_files, thread );
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_total$.bind( Sequences.length( filespecs ), thread );
            utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
              SubLObject csome_list_var = filespecs;
              SubLObject filespec = NIL;
              filespec = csome_list_var.first();
              while ( NIL != csome_list_var)
              {
                tag_xml_document_filespec( filespec, overwriteP, out_directory, disambiguator );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                csome_list_var = csome_list_var.rest();
                filespec = csome_list_var.first();
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
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
            utilities_macros.$progress_total$.rebind( _prev_bind_2_$21, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_1_$20, thread );
            utilities_macros.$progress_note$.rebind( _prev_bind_0_$19, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$18, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return $kw135$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 21099L)
  public static SubLObject tag_xml_document_filespec(final SubLObject filespec, final SubLObject overwriteP, final SubLObject out_directory, SubLObject disambiguator)
  {
    if( disambiguator == UNPROVIDED )
    {
      disambiguator = $kw136$NEW;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_disambiguator = Equality.eq( disambiguator, $kw136$NEW );
    SubLObject original_file = NIL;
    SubLObject text_file_path = NIL;
    SubLObject url = NIL;
    SubLObject parent_file = NIL;
    if( NIL != new_disambiguator )
    {
      disambiguator = rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED );
    }
    if( filespec.isString() )
    {
      original_file = filespec;
      text_file_path = filespec;
    }
    if( filespec.isList() )
    {
      SubLObject org_file = NIL;
      SubLObject text_fpath = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( filespec, filespec, $list137 );
      org_file = filespec.first();
      SubLObject current = filespec.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, filespec, $list137 );
      text_fpath = current.first();
      current = current.rest();
      final SubLObject the_url = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, filespec, $list137 );
      current = current.rest();
      final SubLObject the_parent = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, filespec, $list137 );
      current = current.rest();
      if( NIL == current )
      {
        original_file = org_file;
        text_file_path = text_fpath;
        url = the_url;
        parent_file = the_parent;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( filespec, $list137 );
      }
    }
    Errors.warn( $str138$_S_tagging__S__, numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ), text_file_path );
    thread.resetMultipleValues();
    final SubLObject path = file_utilities.deconstruct_path( text_file_path );
    final SubLObject filename = thread.secondMultipleValue();
    final SubLObject type = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != Filesys.probe_file( text_file_path ) )
    {
      final SubLObject out_file = Sequences.cconcatenate( out_directory, new SubLObject[] { string_utilities.post_remove( filename, $str139$_txt, UNPROVIDED ), $str140$_cyc_idx
      } );
      if( NIL == string_utilities.ends_with( original_file, $str140$_cyc_idx, UNPROVIDED ) && ( NIL != overwriteP || NIL == Filesys.probe_file( out_file ) ) )
      {
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
        try
        {
          memoization_state.$memoization_state$.bind( local_state, thread );
          final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
          try
          {
            SubLObject current2;
            final SubLObject datum = current2 = read_original_doc( text_file_path );
            SubLObject title = NIL;
            SubLObject doc_text = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current2, datum, $list141 );
            title = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current2, datum, $list141 );
            doc_text = current2.first();
            current2 = current2.rest();
            if( NIL == current2 )
            {
              if( NIL != doc_text )
              {
                if( NIL != Sequences.search( $str142$_, doc_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.search( $str143$_, doc_text, UNPROVIDED, UNPROVIDED,
                    UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  doc_text = string_utilities.remove_substring( string_utilities.remove_substring( doc_text, $str142$_ ), $str143$_ );
                }
                SubLObject stream = NIL;
                try
                {
                  stream = compatibility.open_text( text_file_path, $kw144$OUTPUT );
                  if( !stream.isStream() )
                  {
                    Errors.error( $str113$Unable_to_open__S, text_file_path );
                  }
                  final SubLObject s = stream;
                  final SubLObject _prev_bind_0_$24 = xml_vars.$xml_stream$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_stream$.bind( s, thread );
                    final SubLObject name_var = $str145$Doc;
                    xml_utilities.xml_start_tag_internal( name_var, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    final SubLObject name_var_$25 = $tagged_doc_title_name$.getGlobalValue();
                    xml_utilities.xml_start_tag_internal( name_var_$25, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    xml_utilities.xml_markup( title );
                    xml_utilities.xml_end_tag_internal( name_var_$25 );
                    final SubLObject name_var_$26 = $tagged_doc_text_name$.getGlobalValue();
                    xml_utilities.xml_start_tag_internal( name_var_$26, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    xml_utilities.xml_markup( doc_text );
                    xml_utilities.xml_end_tag_internal( name_var_$26 );
                    if( parent_file.isString() )
                    {
                      final SubLObject name_var_$27 = $tagged_doc_parent_filename_name$.getGlobalValue();
                      xml_utilities.xml_start_tag_internal( name_var_$27, NIL, NIL, UNPROVIDED, UNPROVIDED );
                      xml_utilities.xml_markup( parent_file );
                      xml_utilities.xml_end_tag_internal( name_var_$27 );
                    }
                    xml_utilities.xml_end_tag_internal( name_var );
                  }
                  finally
                  {
                    xml_vars.$xml_stream$.rebind( _prev_bind_0_$24, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
                  }
                }
                stream = NIL;
                try
                {
                  stream = compatibility.open_text( out_file, $kw144$OUTPUT );
                  if( !stream.isStream() )
                  {
                    Errors.error( $str113$Unable_to_open__S, out_file );
                  }
                  final SubLObject out = stream;
                  final SubLObject _prev_bind_0_$26 = xml_vars.$xml_stream$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_stream$.bind( out, thread );
                    SubLObject tagged_doc_text = tag_document_for_indexing_with_offsets( doc_text, disambiguator, UNPROVIDED, UNPROVIDED );
                    if( NIL == tagged_doc_text )
                    {
                      Errors.warn( $str146$There_is_no_text_in_the_body_of_t );
                      tagged_doc_text = $str111$;
                    }
                    final SubLObject name_var2 = $str145$Doc;
                    xml_utilities.xml_start_tag_internal( name_var2, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    final SubLObject name_var_$28 = $tagged_doc_title_name$.getGlobalValue();
                    xml_utilities.xml_start_tag_internal( name_var_$28, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    xml_utilities.xml_markup( title );
                    xml_utilities.xml_end_tag_internal( name_var_$28 );
                    final SubLObject name_var_$29 = $tagged_doc_original_filename_name$.getGlobalValue();
                    xml_utilities.xml_start_tag_internal( name_var_$29, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    xml_utilities.xml_markup( original_file );
                    xml_utilities.xml_end_tag_internal( name_var_$29 );
                    if( NIL != url )
                    {
                      final SubLObject name_var_$30 = $tagged_doc_url_name$.getGlobalValue();
                      xml_utilities.xml_start_tag_internal( name_var_$30, NIL, NIL, UNPROVIDED, UNPROVIDED );
                      xml_utilities.xml_markup( url );
                      xml_utilities.xml_end_tag_internal( name_var_$30 );
                    }
                    xml_utilities.xml_terpri();
                    if( parent_file.isString() )
                    {
                      final SubLObject name_var_$31 = $tagged_doc_parent_filename_name$.getGlobalValue();
                      xml_utilities.xml_start_tag_internal( name_var_$31, NIL, NIL, UNPROVIDED, UNPROVIDED );
                      xml_utilities.xml_markup( parent_file );
                      xml_utilities.xml_end_tag_internal( name_var_$31 );
                      xml_utilities.xml_terpri();
                    }
                    final SubLObject name_var_$32 = $tagged_doc_keystring_name$.getGlobalValue();
                    xml_utilities.xml_start_tag_internal( name_var_$32, NIL, NIL, UNPROVIDED, UNPROVIDED );
                    xml_utilities.xml_write_string( tagged_doc_text, UNPROVIDED, UNPROVIDED );
                    xml_utilities.xml_end_tag_internal( name_var_$32 );
                    xml_utilities.xml_end_tag_internal( name_var2 );
                  }
                  finally
                  {
                    xml_vars.$xml_stream$.rebind( _prev_bind_0_$26, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( stream.isStream() )
                    {
                      streams_high.close( stream, UNPROVIDED );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list141 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values3 = Values.getValuesAsVector();
              memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
              Values.restoreValuesFromVector( _values3 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
            }
          }
        }
        finally
        {
          memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      Errors.warn( $str147$Couldn_t_find_source_file__S__Mov, text_file_path );
    }
    if( NIL != new_disambiguator )
    {
      rule_disambiguation.finalize_rule_disambiguator( disambiguator );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 24790L)
  public static SubLObject read_original_doc(final SubLObject path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doc_string = $str111$;
    SubLObject title = $str111$;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( path, $kw148$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, path );
      }
      final SubLObject s = stream;
      SubLObject tokens = xml_parsing_utilities.xml_tokenize( s, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      while ( NIL != tokens)
      {
        final SubLObject token_head = tokens.first();
        if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_title_token$.getGlobalValue() ) )
        {
          if( NIL != xml_parsing_utilities.xml_token_matches( conses_high.second( tokens ), $tagged_doc_title_close_token$.getGlobalValue() ) )
          {
            tokens = xml_parsing_utilities.advance_xml_tokens( tokens, TWO_INTEGER );
          }
          else
          {
            title = conses_high.second( tokens );
            tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
          }
        }
        else if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_text_token$.getGlobalValue() ) )
        {
          final SubLObject close_tag_location = xml_parsing_utilities.next_xml_token_position( tokens, $tagged_doc_text_close_token$.getGlobalValue(), UNPROVIDED );
          final SubLObject text_tokens = Sequences.subseq( tokens, ONE_INTEGER, close_tag_location );
          final SubLObject text = doc_string = Functions.apply( $sym149$CCONCATENATE, text_tokens );
          tokens = xml_parsing_utilities.advance_xml_tokens( tokens, close_tag_location );
        }
        else
        {
          tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
        }
      }
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
    return ConsesLow.list( title, doc_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 25773L)
  public static SubLObject tag_xml_doc_set_with_urls(final SubLObject filename, SubLObject overwriteP, SubLObject out_directory)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = NIL;
    }
    if( out_directory == UNPROVIDED )
    {
      out_directory = $tagged_xml_doc_directory$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject file_list = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw148$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, filename );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject in_file;
        SubLObject line;
        for( in_file = NIL, in_file = file_utilities.cdolines_get_next_line( infile ); NIL != in_file; in_file = file_utilities.cdolines_get_next_line( infile ) )
        {
          line = reader.read_from_string_ignoring_errors( in_file, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( line.isList() )
          {
            file_list = ConsesLow.cons( line, file_list );
          }
        }
      }
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
    return tag_xml_documents_with_urls( file_list, overwriteP, out_directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 26688L)
  public static SubLObject index_xml_doc_set_from_map_file(final SubLObject filename, final SubLObject out_dir, SubLObject overwriteP, SubLObject port, SubLObject tagged_doc_directory, SubLObject lucene_host)
  {
    if( overwriteP == UNPROVIDED )
    {
      overwriteP = T;
    }
    if( port == UNPROVIDED )
    {
      port = lucene_session.get_lucene_port();
    }
    if( tagged_doc_directory == UNPROVIDED )
    {
      tagged_doc_directory = $tagged_xml_doc_directory$.getDynamicValue();
    }
    if( lucene_host == UNPROVIDED )
    {
      lucene_host = lucene_session.get_lucene_host();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject text_index_file = Sequences.cconcatenate( out_dir, $text_index_dir_name$.getDynamicValue( thread ) );
    final SubLObject sem_index_file = Sequences.cconcatenate( out_dir, $semantic_index_dir_name$.getDynamicValue( thread ) );
    SubLObject file_list = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw148$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, filename );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject line;
        SubLObject file_line_as_list;
        SubLObject txt_file;
        SubLObject path;
        SubLObject simple_filename;
        SubLObject type;
        for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
        {
          file_line_as_list = reader.read_from_string_ignoring_errors( line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( file_line_as_list.isList() )
          {
            txt_file = conses_high.second( file_line_as_list );
            thread.resetMultipleValues();
            path = file_utilities.deconstruct_path( txt_file );
            simple_filename = thread.secondMultipleValue();
            type = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            file_list = ConsesLow.cons( ConsesLow.list( Sequences.cconcatenate( tagged_doc_directory, new SubLObject[] { string_utilities.post_remove( simple_filename, $str139$_txt, UNPROVIDED ), $str140$_cyc_idx
            } ), txt_file ), file_list );
          }
        }
      }
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
    return index_pre_tagged_xml_docs( file_list, lucene_host, port, text_index_file, sem_index_file, overwriteP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 28246L)
  public static SubLObject index_pre_tagged_xml_docs(final SubLObject filenames, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file,
      final SubLObject overwriteP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject keyword_session = lucene_session.new_lucene_session( host, port, text_index_file, $kw103$TEXT, overwriteP );
    final SubLObject semantic_session = lucene_session.new_lucene_session( host, port, sem_index_file, $kw104$CYC, overwriteP );
    if( NIL != overwriteP )
    {
      file_utilities.delete_file_if_exists( Sequences.cconcatenate( lucene_session.lucene_index( semantic_session ), $str107$_indexed_docs_txt ) );
      file_utilities.delete_file_if_exists( Sequences.cconcatenate( lucene_session.lucene_index( keyword_session ), $str107$_indexed_docs_txt ) );
    }
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str109$Indexing_files, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( filenames ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = filenames;
        SubLObject file = NIL;
        file = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = file;
          SubLObject idx_file = NIL;
          SubLObject txt_file = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
          idx_file = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list150 );
          txt_file = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == Filesys.directory_p( idx_file ) && NIL != string_utilities.ends_with( idx_file, $str140$_cyc_idx, UNPROVIDED ) )
            {
              SubLObject error_message = NIL;
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym151$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    index_pre_tagged_xml_doc( idx_file, txt_file, keyword_session, semantic_session );
                  }
                  catch( final Throwable catch_var )
                  {
                    Errors.handleThrowable( catch_var, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$37, thread );
                }
              }
              catch( final Throwable ccatch_env_var )
              {
                error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( NIL != error_message )
              {
                Errors.warn( $str152$problem_indexing__a_____moving_on, file, error_message );
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list150 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          file = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
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
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    lucene_session.lucene_optimize( keyword_session );
    lucene_session.lucene_optimize( semantic_session );
    lucene_session.lucene_finalize( keyword_session );
    lucene_session.lucene_finalize( semantic_session );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 29859L)
  public static SubLObject index_pre_tagged_xml_doc(final SubLObject idx_doc_name, final SubLObject txt_xml_doc_name, final SubLObject keyword_session, final SubLObject semantic_session)
  {
    SubLObject original_filename = $str111$;
    SubLObject key_string = $str111$;
    SubLObject confirmed_concepts_key_string = $str111$;
    SubLObject title = $str111$;
    final SubLObject text_xml = string_utilities.read_string_from_file( txt_xml_doc_name, UNPROVIDED, UNPROVIDED );
    SubLObject tokens = xml_parsing_utilities.xml_string_tokenize( text_xml, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject url = $str111$;
    SubLObject parent_file = NIL;
    SubLObject text = NIL;
    while ( NIL != tokens)
    {
      final SubLObject token_head = tokens.first();
      if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_original_filename_token$.getGlobalValue() ) )
      {
        original_filename = conses_high.second( tokens );
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_parent_filename_token$.getGlobalValue() ) )
      {
        parent_file = conses_high.second( tokens );
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_keystring_token$.getGlobalValue() ) )
      {
        key_string = conses_high.second( tokens );
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_url_token$.getGlobalValue() ) )
      {
        url = conses_high.second( tokens );
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_title_token$.getGlobalValue() ) )
      {
        if( NIL != xml_parsing_utilities.xml_token_matches( conses_high.second( tokens ), $tagged_doc_title_close_token$.getGlobalValue() ) )
        {
          tokens = xml_parsing_utilities.advance_xml_tokens( tokens, TWO_INTEGER );
        }
        else
        {
          title = conses_high.second( tokens );
          tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
        }
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head, $tagged_doc_text_token$.getGlobalValue() ) )
      {
        text = conses_high.second( tokens );
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, THREE_INTEGER );
      }
      else
      {
        tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
      }
    }
    final SubLObject idx_xml = string_utilities.read_string_from_file( idx_doc_name, UNPROVIDED, UNPROVIDED );
    SubLObject tokens_$39 = xml_parsing_utilities.xml_string_tokenize( idx_xml, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    while ( NIL != tokens_$39)
    {
      final SubLObject token_head2 = tokens_$39.first();
      if( NIL != xml_parsing_utilities.xml_token_matches( token_head2, $tagged_doc_original_filename_token$.getGlobalValue() ) )
      {
        original_filename = conses_high.second( tokens_$39 );
        tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head2, $tagged_doc_keystring_token$.getGlobalValue() ) )
      {
        key_string = conses_high.second( tokens_$39 );
        tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head2, $tagged_doc_confirmed_concepts_keystring_token$.getGlobalValue() ) )
      {
        confirmed_concepts_key_string = conses_high.second( tokens_$39 );
        tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head2, $tagged_doc_title_token$.getGlobalValue() ) )
      {
        if( NIL != xml_parsing_utilities.xml_token_matches( conses_high.second( tokens_$39 ), $tagged_doc_title_close_token$.getGlobalValue() ) )
        {
          tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, TWO_INTEGER );
        }
        else
        {
          title = conses_high.second( tokens_$39 );
          tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, THREE_INTEGER );
        }
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head2, $tagged_doc_text_token$.getGlobalValue() ) )
      {
        text = conses_high.second( tokens_$39 );
        tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, THREE_INTEGER );
      }
      else if( NIL != xml_parsing_utilities.xml_token_matches( token_head2, $tagged_doc_url_token$.getGlobalValue() ) )
      {
        url = conses_high.second( tokens_$39 );
        tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, THREE_INTEGER );
      }
      else
      {
        tokens_$39 = xml_parsing_utilities.advance_xml_tokens( tokens_$39, UNPROVIDED );
      }
    }
    if( NIL != string_utilities.empty_string_p( url ) )
    {
      url = Sequences.cconcatenate( $str153$http___doc_cyc_com_, format_nil.format_nil_a_no_copy( string_utilities.pre_remove( original_filename, $str154$_cyc_, UNPROVIDED ) ) );
    }
    Errors.warn( $str155$title___S__, title );
    Errors.warn( $str156$url___S__, url );
    SubLObject semantics = ConsesLow.list( semantic_session, text, key_string, confirmed_concepts_key_string, url, title, lucene_session.default_lucene_confirmed_terms_boost() );
    if( parent_file.isString() )
    {
      semantics = ConsesLow.append( semantics, ConsesLow.list( parent_file ) );
    }
    Functions.apply( $sym157$LUCENE_ADD_DOCUMENT, semantics );
    lucene_session.lucene_add_document( keyword_session, text, text, $str111$, url, title, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = ConsesLow.list( keyword_session, semantic_session );
    SubLObject session = NIL;
    session = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( Sequences.cconcatenate( lucene_session.lucene_index( session ), $str107$_indexed_docs_txt ), $kw112$APPEND );
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, Sequences.cconcatenate( lucene_session.lucene_index( session ), $str107$_indexed_docs_txt ) );
        }
        final SubLObject s = stream;
        PrintLow.format( s, $str114$_A__, idx_doc_name );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      session = cdolist_list_var.first();
    }
    return $kw135$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 33853L)
  public static SubLObject lucene_add_document_semantic(final SubLObject session, final SubLObject text, final SubLObject keystring, final SubLObject confirmed_term_keystring, final SubLObject url,
      final SubLObject title)
  {
    return lucene_session.lucene_add_document( session, text, keystring, confirmed_term_keystring, url, title, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34047L)
  public static SubLObject lucene_add_document_keyword(final SubLObject session, final SubLObject text, final SubLObject url, final SubLObject title)
  {
    return lucene_session.lucene_add_document( session, text, text, $str111$, url, title, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34178L)
  public static SubLObject add_fully_indexed_document(final SubLObject doc_string, final SubLObject url, final SubLObject title, final SubLObject sem_session, final SubLObject keyword_session)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject keystring = tag_document_for_indexing_with_offsets( doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject confirmed_term_keystring = thread.secondMultipleValue();
    thread.resetMultipleValues();
    lucene_add_document_semantic( sem_session, doc_string, keystring, confirmed_term_keystring, url, title );
    lucene_add_document_keyword( keyword_session, doc_string, url, title );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34590L)
  public static SubLObject print_offset_info(final SubLObject stream, final SubLObject offset, final SubLObject end)
  {
    print_high.princ( offset, stream );
    print_high.princ( $str142$_, stream );
    print_high.princ( end, stream );
    print_high.princ( $str142$_, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34747L)
  public static SubLObject print_term_and_reln(final SubLObject stream, final SubLObject v_term, final SubLObject reln)
  {
    print_high.princ( reln, stream );
    print_high.princ( $str143$_, stream );
    print_high.princ( v_term, stream );
    print_high.princ( $str142$_, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34902L)
  public static SubLObject print_token(final SubLObject stream, final SubLObject offset, final SubLObject end, final SubLObject term_reln_pairs)
  {
    print_offset_info( stream, offset, end );
    SubLObject cdolist_list_var = term_reln_pairs;
    SubLObject term_reln_pair = NIL;
    term_reln_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_term_and_reln( stream, term_reln_pair.first(), conses_high.second( term_reln_pair ) );
      cdolist_list_var = cdolist_list_var.rest();
      term_reln_pair = cdolist_list_var.first();
    }
    print_high.princ( $str159$_, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 35166L)
  public static SubLObject new_tagged_document(final SubLObject doc_string, SubLObject lexicon, SubLObject disambiguateP, SubLObject tagger, SubLObject sentencifyP)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = get_default_document_annotation_lexicon( UNPROVIDED );
    }
    if( disambiguateP == UNPROVIDED )
    {
      disambiguateP = NIL;
    }
    if( tagger == UNPROVIDED )
    {
      tagger = $sym160$POS_TAGGING_CONCEPT_TAGGER;
    }
    if( sentencifyP == UNPROVIDED )
    {
      sentencifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( doc_string ) : doc_string;
    final SubLObject _prev_bind_0 = document.$perform_dot_analysis_on_docs$.currentBinding( thread );
    try
    {
      document.$perform_dot_analysis_on_docs$.bind( T, thread );
      final SubLObject doc = document.new_document( doc_string, sentencifyP, UNPROVIDED );
      final SubLObject si = concept_tagger.tag_concepts( doc, ConsesLow.list( $kw162$LEXICON, lexicon, $kw163$SENSE_TAGGER, tagger ) );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject sentence = iteration.iteration_next( si );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
        }
      }
      if( NIL != disambiguateP )
      {
        final SubLObject rdis = rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED );
        rule_disambiguation.rdis_disambiguate( rdis, doc, UNPROVIDED );
        rule_disambiguation.finalize_rule_disambiguator( rdis );
      }
      return doc;
    }
    finally
    {
      document.$perform_dot_analysis_on_docs$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 36135L)
  public static SubLObject find_concepts_for_document_segments(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec_id, SubLObject user)
  {
    if( app_type == UNPROVIDED )
    {
      app_type = NIL;
    }
    if( filter_spec_id == UNPROVIDED )
    {
      filter_spec_id = $str166$Mww;
    }
    if( user == UNPROVIDED )
    {
      user = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == filter_spec_id )
    {
      filter_spec_id = $str166$Mww;
    }
    if( NIL != $trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user ) );
    }
    if( NIL != $doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $doc_search_trace_log_file$.getDynamicValue( thread ), $kw112$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings,
            app_type, filter_spec_id, user ) );
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
    return tag_document_nodes_for_display( node_ids_and_strings, app_type, term_learner_object_from_id( filter_spec_id ), NIL, user );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 36569L)
  public static SubLObject tag_document_nodes_for_display(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec, SubLObject lexicon, SubLObject user)
  {
    if( app_type == UNPROVIDED )
    {
      app_type = $str169$full;
    }
    if( filter_spec == UNPROVIDED )
    {
      filter_spec = NIL;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = NIL;
    }
    if( user == UNPROVIDED )
    {
      user = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == lexicon )
    {
      final SubLObject task = ( NIL != user ) ? cure_api.default_task_for_user( user ) : NIL;
      final SubLObject nl_mt = ( NIL != task ) ? cure_api.parsing_mt_for_task( task ) : NIL;
      lexicon = get_default_document_ingester_annotation_learning_lexicon( app_type, filter_spec, nl_mt );
    }
    thread.resetMultipleValues();
    final SubLObject doc_string = get_doc_string_from_node_ids_and_strings( node_ids_and_strings );
    final SubLObject offset_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject doc = new_tagged_document( doc_string, lexicon, T, UNPROVIDED, UNPROVIDED );
    SubLObject output = NIL;
    final SubLObject vector_var = document.document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$40;
    SubLObject backwardP_var_$41;
    SubLObject length_$42;
    SubLObject v_iteration_$43;
    SubLObject element_num_$44;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$40 = document.paragraph_sentences( paragraph );
      backwardP_var_$41 = NIL;
      for( length_$42 = Sequences.length( vector_var_$40 ), v_iteration_$43 = NIL, v_iteration_$43 = ZERO_INTEGER; v_iteration_$43.numL( length_$42 ); v_iteration_$43 = Numbers.add( v_iteration_$43, ONE_INTEGER ) )
      {
        element_num_$44 = ( ( NIL != backwardP_var_$41 ) ? Numbers.subtract( length_$42, v_iteration_$43, ONE_INTEGER ) : v_iteration_$43 );
        sentence = Vectors.aref( vector_var_$40, element_num_$44 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != document.word_cycls( word ) )
          {
            output = Sequences.cconcatenate( get_output_lists_for_word( word, offset_list, UNPROVIDED ), output );
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return Sequences.nreverse( output );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 38128L)
  public static SubLObject get_doc_string_from_node_ids_and_strings(final SubLObject node_ids_and_strings)
  {
    SubLObject doc_string = NIL;
    SubLObject offset_list = NIL;
    SubLObject current_offset = ZERO_INTEGER;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject cdolist_list_var = Sort.sort( node_ids_and_strings, $sym172$_, $sym173$FIRST );
      SubLObject node_id_and_string = NIL;
      node_id_and_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = node_id_and_string;
        SubLObject node_id = NIL;
        SubLObject string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list170 );
        node_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list170 );
        string = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != unicode_nauts.unicode_naut_p( string, UNPROVIDED ) )
          {
            string = cycl_utilities.formula_arg1( string, UNPROVIDED );
          }
          string = string_utilities.string_substitute( $str159$_, $str171$_ua0_, string, Symbols.symbol_function( EQUALP ) );
          final SubLObject ascii_string = unicode_strings.display_to_subl_string( string, UNPROVIDED, UNPROVIDED );
          print_high.princ( ascii_string, s );
          offset_list = ConsesLow.cons( ConsesLow.list( node_id, current_offset ), offset_list );
          current_offset = Numbers.add( current_offset, Sequences.length( ascii_string ) );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list170 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        node_id_and_string = cdolist_list_var.first();
      }
      doc_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return Values.values( doc_string, Sequences.nreverse( offset_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 38899L)
  public static SubLObject get_output_lists_for_word(final SubLObject word, final SubLObject offset_list, SubLObject return_individual_idsP)
  {
    if( return_individual_idsP == UNPROVIDED )
    {
      return_individual_idsP = $term_learner_keep_concepts_distinct$.getDynamicValue();
    }
    final SubLObject cycls_id = ( NIL != return_individual_idsP ) ? Mapping.mapcar( $sym37$TERM_LEARNER_ID, Mapping.mapcar( $sym174$CANONICALIZE_TERM, document.word_cycls( word ) ) )
        : ConsesLow.list( term_learner_id( Mapping.mapcar( $sym174$CANONICALIZE_TERM, document.word_cycls( word ) ) ) );
    final SubLObject length = document.word_length( word );
    final SubLObject node_num_and_node_offset = node_and_node_offset( document.word_offset( word ), offset_list );
    final SubLObject node_num = node_num_and_node_offset.first();
    final SubLObject offset = conses_high.second( node_num_and_node_offset );
    final SubLObject existing_conceptP = makeBoolean( NIL == new_named_entity_wordP( word ) );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = cycls_id;
    SubLObject cycl_id = NIL;
    cycl_id = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( ConsesLow.list( node_num, offset, length, cycl_id, existing_conceptP ), result );
      cdolist_list_var = cdolist_list_var.rest();
      cycl_id = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 39635L)
  public static SubLObject node_and_node_offset(final SubLObject global_offset, final SubLObject offset_list)
  {
    SubLObject previous_node_id = ZERO_INTEGER;
    SubLObject previous_node_start = ZERO_INTEGER;
    SubLObject cdolist_list_var = offset_list;
    SubLObject node_and_offset = NIL;
    node_and_offset = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = node_and_offset;
      SubLObject node_id = NIL;
      SubLObject offset = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      node_id = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      offset = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( offset.numG( global_offset ) )
        {
          return ConsesLow.list( previous_node_id, Numbers.subtract( global_offset, previous_node_start ) );
        }
        previous_node_id = node_id;
        previous_node_start = offset;
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list175 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      node_and_offset = cdolist_list_var.first();
    }
    return ConsesLow.list( previous_node_id, Numbers.subtract( global_offset, previous_node_start ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 40117L)
  public static SubLObject new_named_entity_wordP(final SubLObject word)
  {
    final SubLObject cycls = document.word_cycls( word );
    if( NIL != list_utilities.lengthG( cycls, ONE_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != constant_handles.constant_p( cycls.first() ) )
    {
      return NIL;
    }
    if( NIL != cycl_grammar.cycl_nat_p( cycls.first() ) && cycl_utilities.nat_functor( cycls.first() ).eql( $const176$InstanceNamedFn_Ternary ) && NIL != subl_promotions.memberP( cycl_utilities.nat_arg2( cycls.first(),
        UNPROVIDED ), $list177, UNPROVIDED, UNPROVIDED ) && ( NIL == narts_high.find_nart( cycls.first() ) || NIL != nart_has_non_derived_assertionsP( cycls.first() ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 40708L)
  public static SubLObject nart_has_non_derived_assertionsP(final SubLObject cycl)
  {
    return makeBoolean( NIL == narts_high.useless_nartP( czer_main.canonicalize_term( cycl, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 40823L)
  public static SubLObject find_interps_for_document_segments(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec_id, SubLObject user)
  {
    if( app_type == UNPROVIDED )
    {
      app_type = $str169$full;
    }
    if( filter_spec_id == UNPROVIDED )
    {
      filter_spec_id = $str166$Mww;
    }
    if( user == UNPROVIDED )
    {
      user = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == filter_spec_id )
    {
      filter_spec_id = $str166$Mww;
    }
    if( NIL != $trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user ) );
    }
    if( NIL != $doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $doc_search_trace_log_file$.getDynamicValue( thread ), $kw112$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings,
            app_type, filter_spec_id, user ) );
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
    final SubLObject filter_spec = term_learner_object_from_id( filter_spec_id );
    final SubLObject task = ( NIL != user ) ? cure_api.default_task_for_user( user ) : NIL;
    final SubLObject nl_mt = ( NIL != task ) ? cure_api.parsing_mt_for_task( task ) : NIL;
    final SubLObject lexicon = get_default_document_ingester_annotation_learning_lexicon( app_type, filter_spec, nl_mt );
    thread.resetMultipleValues();
    final SubLObject doc_string = get_doc_string_from_node_ids_and_strings( node_ids_and_strings );
    final SubLObject offset_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject dogs_have_four_feet = $str179$dogs_have_four_feet;
    final SubLObject location = Sequences.search( dogs_have_four_feet, doc_string, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject length = Sequences.length( dogs_have_four_feet );
    final SubLObject cycl = $list180;
    final SubLObject node_and_offset = node_and_node_offset( location, offset_list );
    final SubLObject node_num = node_and_offset.first();
    final SubLObject node_offset = conses_high.second( node_and_offset );
    if( NIL != location )
    {
      return ConsesLow.list( ConsesLow.list( node_num, node_offset, length, term_learner_id( cycl ), dogs_have_four_feet ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 43286L)
  public static SubLObject get_default_medical_tagging_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( $default_medical_tagging_lexicon$.getDynamicValue( thread ) ) )
    {
      $default_medical_tagging_lexicon$.setDynamicValue( make_default_document_annotation_lexicon( UNPROVIDED ), thread );
      methods.funcall_instance_method_with_1_args( $default_medical_tagging_lexicon$.getDynamicValue( thread ), $sym181$EXCLUDE_POS, $const182$Verb );
      methods.funcall_instance_method_with_1_args( $default_medical_tagging_lexicon$.getDynamicValue( thread ), $sym181$EXCLUDE_POS, $const183$Adjective );
      methods.funcall_instance_method_with_1_args( $default_medical_tagging_lexicon$.getDynamicValue( thread ), $sym181$EXCLUDE_POS, $const184$Adverb );
      methods.funcall_instance_method_with_1_args( $default_medical_tagging_lexicon$.getDynamicValue( thread ), $sym181$EXCLUDE_POS, $const185$Gerundive );
      methods.funcall_instance_method_with_1_args( $default_medical_tagging_lexicon$.getDynamicValue( thread ), $sym186$ADD_CONCEPT_FILTER_SPEC, $list187 );
    }
    return $default_medical_tagging_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 44026L)
  public static SubLObject clear_default_medical_tagging_lexicon()
  {
    $default_medical_tagging_lexicon$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 44149L)
  public static SubLObject augment_medical_html_file_with_cyc_terms(final SubLObject filepath, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = get_default_medical_tagging_lexicon();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject in_string = file_utilities.slurp_file( filepath );
    final SubLObject out_path = Sequences.cconcatenate( filepath, $str188$_tagged_html );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( out_path, $kw144$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, out_path );
      }
      final SubLObject s = stream;
      print_high.princ( augment_html_document_with_cyc_terms( in_string, lexicon ), s );
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
    return out_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 44519L)
  public static SubLObject augment_html_document_with_cyc_terms(final SubLObject html_string, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = get_default_document_ingester_annotation_lexicon( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject html_tokens = xml_parsing_utilities.xml_string_tokenize( html_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject id_num = ZERO_INTEGER;
    SubLObject output_string = NIL;
    thread.resetMultipleValues();
    final SubLObject text_string = get_text_string_from_tokens( html_tokens, UNPROVIDED );
    SubLObject tokens_to_text_string_mappings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject tag_locations = NIL;
    final SubLObject vector_var = document.document_paragraphs( new_tagged_document( text_string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$45;
    SubLObject backwardP_var_$46;
    SubLObject length_$47;
    SubLObject v_iteration_$48;
    SubLObject element_num_$49;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cycls;
    SubLObject word_start;
    SubLObject word_end;
    SubLObject start_tag;
    SubLObject end_tag;
    SubLObject cdolist_list_var_$50;
    SubLObject cycl;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$45 = document.paragraph_sentences( paragraph );
      backwardP_var_$46 = NIL;
      for( length_$47 = Sequences.length( vector_var_$45 ), v_iteration_$48 = NIL, v_iteration_$48 = ZERO_INTEGER; v_iteration_$48.numL( length_$47 ); v_iteration_$48 = Numbers.add( v_iteration_$48, ONE_INTEGER ) )
      {
        element_num_$49 = ( ( NIL != backwardP_var_$46 ) ? Numbers.subtract( length_$47, v_iteration_$48, ONE_INTEGER ) : v_iteration_$48 );
        sentence = Vectors.aref( vector_var_$45, element_num_$49 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cycls = document.word_cycls( word );
          word_start = document.word_offset( word );
          word_end = Numbers.add( word_start, document.word_length( word ) );
          if( NIL != cycls )
          {
            start_tag = $str111$;
            end_tag = $str111$;
            cdolist_list_var_$50 = cycls;
            cycl = NIL;
            cycl = cdolist_list_var_$50.first();
            while ( NIL != cdolist_list_var_$50)
            {
              if( NIL != forts.fort_p( cycl ) )
              {
                start_tag = Sequences.cconcatenate( start_tag, Sequences.cconcatenate( $str189$_span_property__cyc_termName__con, new SubLObject[] { format_nil.format_nil_a_no_copy( doc_tagger_rdf_name( cycl ) ),
                  $str190$___span_class__cycTerm__id__cycTe, format_nil.format_nil_a_no_copy( id_num ), $str191$__property__cyc_termId__content__, format_nil.format_nil_a_no_copy( doc_tagger_rdf_id( cycl ) ), $str192$__
                } ) );
                end_tag = Sequences.cconcatenate( end_tag, $str193$__span___span_ );
                id_num = Numbers.add( id_num, ONE_INTEGER );
              }
              cdolist_list_var_$50 = cdolist_list_var_$50.rest();
              cycl = cdolist_list_var_$50.first();
            }
            tag_locations = ConsesLow.cons( ConsesLow.list( word_start, start_tag ), tag_locations );
            tag_locations = ConsesLow.cons( ConsesLow.list( word_end, end_tag ), tag_locations );
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    tag_locations = Sequences.nreverse( tag_locations );
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject current_location = ZERO_INTEGER;
      SubLObject tag_index = NIL;
      SubLObject tag = NIL;
      if( NIL != tag_locations )
      {
        final SubLObject datum_evaluated_var = tag_locations.first();
        tag_index = datum_evaluated_var.first();
        tag = conses_high.cadr( datum_evaluated_var );
      }
      SubLObject current;
      final SubLObject datum = current = mapping_first_elt_info( tokens_to_text_string_mappings );
      SubLObject map_string_index = NIL;
      SubLObject map_string_end_index = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list194 );
      map_string_index = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list194 );
      map_string_end_index = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject token_index = NIL;
        list_var = html_tokens;
        token = list_var.first();
        for( token_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), token_index = Numbers.add( ONE_INTEGER, token_index ) )
        {
          if( NIL == tag_locations || NIL != xml_parsing_utilities.xml_tagP( token ) )
          {
            print_high.princ( token, s );
          }
          else if( map_string_end_index.numLE( tag_index ) )
          {
            print_high.princ( token, s );
            tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
            current_location = map_string_end_index;
            if( NIL != tokens_to_text_string_mappings )
            {
              final SubLObject datum_evaluated_var2 = mapping_first_elt_info( tokens_to_text_string_mappings );
              map_string_index = datum_evaluated_var2.first();
              map_string_end_index = conses_high.cadr( datum_evaluated_var2 );
            }
          }
          else
          {
            SubLObject current_location_in_token = ZERO_INTEGER;
            SubLObject tag_offset_into_current_token = Numbers.subtract( tag_index, map_string_index );
            while ( current_location_in_token.numL( Sequences.length( token ) ))
            {
              SubLObject next_tag_not_in_this_token = NIL;
              if( tag_offset_into_current_token.numG( Sequences.length( token ) ) )
              {
                next_tag_not_in_this_token = T;
              }
              SubLObject next_string_to_print = Sequences.subseq( token, current_location_in_token, ( NIL != next_tag_not_in_this_token ) ? NIL : tag_offset_into_current_token );
              print_high.princ( next_string_to_print, s );
              current_location_in_token = Numbers.add( current_location_in_token, Sequences.length( next_string_to_print ) );
              current_location = Numbers.add( current_location, Sequences.length( next_string_to_print ) );
              if( current_location.numGE( map_string_end_index ) )
              {
                tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                if( NIL != tokens_to_text_string_mappings )
                {
                  final SubLObject datum_evaluated_var3 = mapping_first_elt_info( tokens_to_text_string_mappings );
                  map_string_index = datum_evaluated_var3.first();
                  map_string_end_index = conses_high.cadr( datum_evaluated_var3 );
                }
              }
              if( NIL == next_tag_not_in_this_token )
              {
                print_high.princ( tag, s );
                tag_locations = tag_locations.rest();
              }
              if( NIL == tag_locations )
              {
                next_string_to_print = Sequences.subseq( token, current_location_in_token, UNPROVIDED );
                print_high.princ( next_string_to_print, s );
                current_location = Numbers.add( current_location, Sequences.length( next_string_to_print ) );
                current_location_in_token = Numbers.add( current_location_in_token, Sequences.length( next_string_to_print ) );
                if( current_location.numGE( map_string_end_index ) )
                {
                  tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                  if( NIL != tokens_to_text_string_mappings )
                  {
                    final SubLObject datum_evaluated_var4 = mapping_first_elt_info( tokens_to_text_string_mappings );
                    map_string_index = datum_evaluated_var4.first();
                    map_string_end_index = conses_high.cadr( datum_evaluated_var4 );
                  }
                }
                tag_index = NIL;
              }
              else
              {
                tag_index = tag_locations.first().first();
                tag = conses_high.second( tag_locations.first() );
                tag_offset_into_current_token = Numbers.subtract( tag_index, map_string_index );
              }
            }
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list194 );
      }
      output_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49007L)
  public static SubLObject doc_tagger_rdf_name(final SubLObject cycl)
  {
    if( NIL != forts.fort_p( cycl ) )
    {
      return web_utilities.html_url_encode( string_utilities.fort_print_name( cycl ), UNPROVIDED );
    }
    return web_utilities.html_url_encode( string_utilities.stringify_terms( cycl, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49182L)
  public static SubLObject doc_tagger_rdf_id(final SubLObject cycl)
  {
    return Sequences.cconcatenate( $str195$http___sw_cyc_com_concept_, kb_utilities.compact_hl_external_id_string( cycl ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49314L)
  public static SubLObject mapping_first_elt_info(final SubLObject tokens_to_text_string_mappings)
  {
    if( NIL == tokens_to_text_string_mappings )
    {
      return ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject mapping = tokens_to_text_string_mappings.first();
    final SubLObject mapping_string_index = conses_high.second( mapping );
    final SubLObject mapping_string_length = conses_high.third( mapping );
    return ConsesLow.list( mapping_string_index, Numbers.add( mapping_string_index, mapping_string_length ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49811L)
  public static SubLObject get_text_string_from_tokens(final SubLObject html_tokens, SubLObject tokens_to_ignore)
  {
    if( tokens_to_ignore == UNPROVIDED )
    {
      tokens_to_ignore = $list196;
    }
    SubLObject tokens_to_text_string_mappings = NIL;
    SubLObject text_string = NIL;
    SubLObject ignore_stack = NIL;
    SubLObject text_string_length = ZERO_INTEGER;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject list_var = NIL;
      SubLObject token = NIL;
      SubLObject token_index = NIL;
      list_var = html_tokens;
      token = list_var.first();
      for( token_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), token_index = Numbers.add( ONE_INTEGER, token_index ) )
      {
        if( NIL != xml_parsing_utilities.xml_opening_tag_p( token ) && NIL == xml_parsing_utilities.xml_closing_tag_p( token ) && NIL != string_utilities.starts_with_one_of( Sequences.subseq( token, ONE_INTEGER,
            UNPROVIDED ), tokens_to_ignore ) )
        {
          ignore_stack = ConsesLow.cons( xml_parsing_utilities.parse_html_token( token ).first(), ignore_stack );
        }
        else if( NIL != xml_parsing_utilities.xml_closing_tag_p( token ) && xml_parsing_utilities.parse_html_token( token ).first().equal( tokens_to_ignore.first() ) )
        {
          ignore_stack = ignore_stack.rest();
        }
        else if( NIL == xml_parsing_utilities.xml_tagP( token ) )
        {
          if( NIL == xml_parsing_utilities.xml_comment_p( token ) )
          {
            if( NIL == ignore_stack )
            {
              print_high.princ( token, s );
              tokens_to_text_string_mappings = ConsesLow.cons( ConsesLow.list( token_index, text_string_length, Sequences.length( token ) ), tokens_to_text_string_mappings );
              text_string_length = Numbers.add( text_string_length, Sequences.length( token ) );
            }
          }
        }
      }
      text_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return Values.values( text_string, Sequences.nreverse( tokens_to_text_string_mappings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 51353L)
  public static SubLObject tag_document_for_indexing_with_offsets(final SubLObject original_doc_string, SubLObject disambiguator, SubLObject lexicon, SubLObject include_stringsP)
  {
    if( disambiguator == UNPROVIDED )
    {
      disambiguator = $kw136$NEW;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = get_default_document_annotation_lexicon( UNPROVIDED );
    }
    if( include_stringsP == UNPROVIDED )
    {
      include_stringsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_disambiguator = Equality.eq( disambiguator, $kw136$NEW );
    final SubLObject v_document = new_tagged_document( original_doc_string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject concepts_string = $str111$;
    if( NIL != new_disambiguator )
    {
      disambiguator = rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED );
    }
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding( thread );
      try
      {
        lexicon_macros.$nl_trie_assumed_validP$.bind( T, thread );
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
        final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
          final SubLObject local_state;
          final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
          final SubLObject _prev_bind_0_$52 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              rule_disambiguation.rdis_disambiguate( disambiguator, v_document, UNPROVIDED );
              final SubLObject vector_var = document.document_paragraphs( v_document );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject element_num;
              SubLObject paragraph;
              SubLObject vector_var_$53;
              SubLObject backwardP_var_$54;
              SubLObject length_$55;
              SubLObject v_iteration_$56;
              SubLObject element_num_$57;
              SubLObject sentence;
              SubLObject cdolist_list_var;
              SubLObject word;
              SubLObject word_string;
              SubLObject word_start;
              SubLObject word_end;
              SubLObject string_words;
              SubLObject term_reln_pairs;
              SubLObject list_var;
              SubLObject interp;
              SubLObject interp_num;
              SubLObject v_term;
              SubLObject term_id;
              SubLObject item_var;
              SubLObject cdolist_list_var_$58;
              SubLObject justifications;
              SubLObject justification;
              SubLObject genl;
              SubLObject genl_id;
              SubLObject item_var2;
              SubLObject prev_partial_words_length;
              SubLObject cdolist_list_var_$59;
              SubLObject partial_word_string;
              SubLObject partial_word_start;
              SubLObject partial_word_length;
              SubLObject partial_word_end;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                paragraph = Vectors.aref( vector_var, element_num );
                vector_var_$53 = document.paragraph_sentences( paragraph );
                backwardP_var_$54 = NIL;
                for( length_$55 = Sequences.length( vector_var_$53 ), v_iteration_$56 = NIL, v_iteration_$56 = ZERO_INTEGER; v_iteration_$56.numL( length_$55 ); v_iteration_$56 = Numbers.add( v_iteration_$56,
                    ONE_INTEGER ) )
                {
                  element_num_$57 = ( ( NIL != backwardP_var_$54 ) ? Numbers.subtract( length_$55, v_iteration_$56, ONE_INTEGER ) : v_iteration_$56 );
                  sentence = Vectors.aref( vector_var_$53, element_num_$57 );
                  cdolist_list_var = document.sentence_yield_exhaustive( sentence );
                  word = NIL;
                  word = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    word_string = document.word_string( word );
                    word_start = document.word_offset( word );
                    word_end = Numbers.add( word_start, document.word_length( word ) );
                    string_words = string_utilities.split_string( word_string, UNPROVIDED );
                    term_reln_pairs = NIL;
                    if( NIL != include_stringsP && NIL == list_utilities.lengthG( string_words, ONE_INTEGER, UNPROVIDED ) )
                    {
                      term_reln_pairs = ConsesLow.cons( ConsesLow.list( word_string, $str197$s ), term_reln_pairs );
                    }
                    list_var = NIL;
                    interp = NIL;
                    interp_num = NIL;
                    list_var = document.word_interps( word );
                    interp = list_var.first();
                    for( interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), interp = list_var.first(), interp_num = Numbers.add( ONE_INTEGER, interp_num ) )
                    {
                      v_term = nl_api_datastructures.get_nl_interp_cycl( interp );
                      term_id = document_annotation_term_id( v_term, UNPROVIDED );
                      if( term_id.isString() )
                      {
                        item_var = ConsesLow.list( term_id, $str198$t );
                        if( NIL == conses_high.member( item_var, term_reln_pairs, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          term_reln_pairs = ConsesLow.cons( item_var, term_reln_pairs );
                        }
                        justifications = ( cdolist_list_var_$58 = get_upwards_closure_justifications_cached( v_term ) );
                        justification = NIL;
                        justification = cdolist_list_var_$58.first();
                        while ( NIL != cdolist_list_var_$58)
                        {
                          genl = get_closure_justification_genl( justification );
                          genl_id = document_annotation_term_id( genl, UNPROVIDED );
                          if( genl_id.isString() )
                          {
                            item_var2 = ConsesLow.list( genl_id, closure_justification_pred_id( justification ) );
                            if( NIL == conses_high.member( item_var2, term_reln_pairs, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
                            {
                              term_reln_pairs = ConsesLow.cons( item_var2, term_reln_pairs );
                            }
                          }
                          cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                          justification = cdolist_list_var_$58.first();
                        }
                      }
                    }
                    if( NIL != term_reln_pairs )
                    {
                      print_token( s, word_start, word_end, Sequences.nreverse( term_reln_pairs ) );
                    }
                    if( NIL != include_stringsP && NIL != Sequences.search( $str159$_, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                    {
                      prev_partial_words_length = ZERO_INTEGER;
                      cdolist_list_var_$59 = string_words;
                      partial_word_string = NIL;
                      partial_word_string = cdolist_list_var_$59.first();
                      while ( NIL != cdolist_list_var_$59)
                      {
                        if( NIL == string_utilities.empty_string_p( partial_word_string ) )
                        {
                          partial_word_start = Numbers.add( word_start, prev_partial_words_length );
                          partial_word_length = Sequences.length( partial_word_string );
                          partial_word_end = Numbers.add( partial_word_start, partial_word_length );
                          print_token( s, partial_word_start, partial_word_end, ConsesLow.list( ConsesLow.list( partial_word_string, $str197$s ) ) );
                          prev_partial_words_length = Numbers.add( prev_partial_words_length, partial_word_length, ONE_INTEGER );
                        }
                        cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                        partial_word_string = cdolist_list_var_$59.first();
                      }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
              }
            }
          }
          finally
          {
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$52, thread );
          }
        }
        finally
        {
          sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
          sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$51, thread );
        }
      }
      finally
      {
        lexicon_macros.$nl_trie_assumed_validP$.rebind( _prev_bind_0, thread );
      }
      concepts_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    if( NIL != new_disambiguator )
    {
      rule_disambiguation.finalize_rule_disambiguator( disambiguator );
    }
    return Values.values( string_utilities.strip_final( concepts_string, UNPROVIDED ), $str111$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55836L)
  public static SubLObject document_annotation_relation_from_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.rassoc( id, $predicate_id_table$.getDynamicValue( thread ), EQUAL, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55953L)
  public static SubLObject generate_retrieval_justification(final SubLObject spec_id, final SubLObject relation_id, final SubLObject genl_id)
  {
    final SubLObject spec_term = document_annotation_term_from_id( spec_id );
    final SubLObject genl_term = document_annotation_term_from_id( genl_id );
    final SubLObject relation = document_annotation_relation_from_id( relation_id );
    if( relation_id.equal( $str198$t ) )
    {
      return Sequences.cconcatenate( $str201$Meaning__, format_nil.format_nil_a_no_copy( pph_main.generate_phrase( spec_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    }
    if( spec_term.isKeyword() || genl_term.isKeyword() || NIL == relation )
    {
      return Sequences.cconcatenate( $str202$_, new SubLObject[] { format_nil.format_nil_a_no_copy( ( NIL != relation ) ? relation : relation_id ), $str159$_, format_nil.format_nil_a_no_copy( ( NIL != spec_term )
          ? spec_term
          : spec_id ), $str203$__, format_nil.format_nil_a_no_copy( ( NIL != genl_term ) ? genl_term : genl_id ), $str204$_
      } );
    }
    return pph_main.generate_phrase( substitute_template( predicate_template( relation ), spec_term, genl_term ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 57307L)
  public static SubLObject generate_retrieval_justification_from_justification_string(final SubLObject justification_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING, justification_string ) );
    }
    if( NIL != $doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $doc_search_trace_log_file$.getDynamicValue( thread ), $kw112$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING,
            justification_string ) );
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
    assert NIL != Types.stringp( justification_string ) : justification_string;
    final SubLObject justification_ids = string_utilities.split_string( justification_string, UNPROVIDED );
    if( NIL != list_utilities.lengthGE( justification_ids, THREE_INTEGER, UNPROVIDED ) )
    {
      final SubLObject justification_args = get_best_justifications_from_arg_list( justification_ids );
      return generate_retrieval_justification( justification_args.first(), conses_high.second( justification_args ), conses_high.third( justification_args ) );
    }
    if( NIL != list_utilities.lengthE( justification_ids, TWO_INTEGER, UNPROVIDED ) && NIL != Strings.string_equal( justification_ids.first(), $str197$s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return Sequences.cconcatenate( $str206$Text_Match__, format_nil.format_nil_a_no_copy( conses_high.second( justification_ids ) ) );
    }
    Errors.warn( $str207$Invalid_justification_string___S, justification_string );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 58344L)
  public static SubLObject get_best_justifications_from_arg_list(final SubLObject justification_id_list)
  {
    if( NIL != list_utilities.lengthE( justification_id_list, THREE_INTEGER, UNPROVIDED ) )
    {
      return justification_id_list;
    }
    SubLObject best_pred = conses_high.second( justification_id_list );
    SubLObject best_arg = conses_high.third( justification_id_list );
    SubLObject pred = NIL;
    SubLObject pred_$61 = NIL;
    SubLObject arg = NIL;
    SubLObject arg_$62 = NIL;
    pred = list_utilities.every_nth( TWO_INTEGER, justification_id_list.rest() );
    pred_$61 = pred.first();
    arg = list_utilities.every_nth( TWO_INTEGER, conses_high.cddr( justification_id_list ) );
    arg_$62 = arg.first();
    while ( NIL != arg || NIL != pred)
    {
      if( NIL != better_justification_pred( document_annotation_relation_from_id( pred_$61 ), document_annotation_relation_from_id( best_pred ) ) )
      {
        best_pred = pred_$61;
        best_arg = arg_$62;
      }
      pred = pred.rest();
      pred_$61 = pred.first();
      arg = arg.rest();
      arg_$62 = arg.first();
    }
    return ConsesLow.list( justification_id_list.first(), best_pred, best_arg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 58980L)
  public static SubLObject better_justification_pred(final SubLObject pred1, final SubLObject pred2)
  {
    if( pred1.eql( $const44$conditionsCommonlyCooccur ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 59206L)
  public static SubLObject generate_term_explanation(final SubLObject term_id_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym208$GENERATE_TERM_EXPLANATION, term_id_string ) );
    }
    if( NIL != $doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $doc_search_trace_log_file$.getDynamicValue( thread ), $kw112$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym208$GENERATE_TERM_EXPLANATION, term_id_string ) );
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
    assert NIL != Types.stringp( term_id_string ) : term_id_string;
    final SubLObject v_term = document_annotation_term_from_id( term_id_string );
    final SubLObject canonical_phrase = nl_generation_api.cycl_term_to_nl_string_internal( v_term, $kw209$DEFAULT ).first();
    final SubLObject userdoccomment = backward.removal_ask_variable( $sym59$_X, ConsesLow.listS( $const210$userDocComment, v_term, $list62 ), $const211$CCF_CAE_QueryMt, UNPROVIDED, UNPROVIDED ).first();
    final SubLObject pph_params = nl_generation_api.new_pph_parameters( ConsesLow.listS( $kw212$DEMERIT_CUTOFF, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue(), $list213 ) );
    final SubLObject other_strings = get_other_explanatory_strings_for_term( v_term );
    final SubLObject synonyms = nl_generation_api.cycl_term_to_nl_string_internal( v_term, pph_params ).rest();
    final SubLObject synonym_string = ( NIL != synonyms ) ? Sequences.cconcatenate( $str214$_b_Synonyms__b___, string_utilities.join_strings( synonyms, UNPROVIDED ) ) : $str111$;
    final SubLObject result_string = Sequences.cconcatenate( $str215$_b_, new SubLObject[] { canonical_phrase, $str216$__b___, ( NIL != userdoccomment ) ? userdoccomment : $str111$, $str217$_br_, other_strings,
      synonym_string
    } );
    return Sequences.cconcatenate( $str218$_div_style__background_color__whi, new SubLObject[] { result_string, $str219$__div_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 60352L)
  public static SubLObject get_other_explanatory_strings_for_term(final SubLObject v_term)
  {
    SubLObject output_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      if( NIL != genls.genlsP( v_term, $const220$SurgicalProcedure, $const76$InferencePSC, UNPROVIDED ) || NIL != genls.genlsP( v_term, $const221$Surgery, $const76$InferencePSC, UNPROVIDED ) )
      {
        final SubLObject experts = backward.removal_ask_variable( $sym222$_DOC, ConsesLow.list( $const223$expertAtSkill, $sym222$_DOC, v_term ), $const224$CCFPersonnelDataMt, UNPROVIDED, UNPROVIDED );
        SubLObject sentences = NIL;
        SubLObject cdolist_list_var = experts;
        SubLObject expert = NIL;
        expert = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          sentences = ConsesLow.cons( ConsesLow.list( $const223$expertAtSkill, expert, v_term ), sentences );
          cdolist_list_var = cdolist_list_var.rest();
          expert = cdolist_list_var.first();
        }
        if( NIL != sentences )
        {
          print_high.princ( $str225$_b_Specialists____b_, stream );
          print_high.princ( pph_document.pph_summarize_term( v_term, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), stream );
          print_high.princ( $str217$_br_, stream );
          streams_high.terpri( stream );
        }
      }
      output_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
  public static SubLObject clear_document_annotation_term_id()
  {
    final SubLObject cs = $document_annotation_term_id_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
  public static SubLObject remove_document_annotation_term_id(final SubLObject v_term, SubLObject hl_idsP)
  {
    if( hl_idsP == UNPROVIDED )
    {
      hl_idsP = $doc_annotation_use_hl_ids$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $document_annotation_term_id_caching_state$.getGlobalValue(), ConsesLow.list( v_term, hl_idsP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
  public static SubLObject document_annotation_term_id_internal(final SubLObject v_term, final SubLObject hl_idsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ret_value = NIL;
    final SubLObject _prev_bind_0 = cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.currentBinding( thread );
    try
    {
      cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.bind( NIL, thread );
      if( NIL != hl_idsP )
      {
        ret_value = kb_utilities.hl_external_id_string( cycl_utilities.hl_to_el( v_term ) );
      }
      else if( NIL != nart_handles.nart_p( v_term ) && get_cached_term_id( v_term ) != $kw49$NOT_FOUND )
      {
        ret_value = get_cached_term_id( v_term );
      }
      else
      {
        final SubLObject el_term = cycl_utilities.hl_to_el( v_term );
        final SubLObject el_id = get_cached_term_id( el_term );
        if( el_id == $kw49$NOT_FOUND && v_term.isNumber() )
        {
          ret_value = v_term;
        }
        else if( el_id == $kw49$NOT_FOUND )
        {
          ret_value = kb_utilities.hl_external_id_string( el_term );
        }
        else
        {
          ret_value = el_id;
        }
      }
    }
    finally
    {
      cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.rebind( _prev_bind_0, thread );
    }
    return ret_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
  public static SubLObject document_annotation_term_id(final SubLObject v_term, SubLObject hl_idsP)
  {
    if( hl_idsP == UNPROVIDED )
    {
      hl_idsP = $doc_annotation_use_hl_ids$.getDynamicValue();
    }
    SubLObject caching_state = $document_annotation_term_id_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym226$DOCUMENT_ANNOTATION_TERM_ID, $sym227$_DOCUMENT_ANNOTATION_TERM_ID_CACHING_STATE_, $int228$25000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, hl_idsP );
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
          if( NIL != cached_args && NIL == cached_args.rest() && hl_idsP.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( document_annotation_term_id_internal( v_term, hl_idsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, hl_idsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
  public static SubLObject clear_document_annotation_term_from_id()
  {
    final SubLObject cs = $document_annotation_term_from_id_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
  public static SubLObject remove_document_annotation_term_from_id(final SubLObject id)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $document_annotation_term_from_id_caching_state$.getGlobalValue(), ConsesLow.list( id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
  public static SubLObject document_annotation_term_from_id_internal(final SubLObject id)
  {
    return get_term_from_cached_id( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
  public static SubLObject document_annotation_term_from_id(final SubLObject id)
  {
    SubLObject caching_state = $document_annotation_term_from_id_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID, $sym230$_DOCUMENT_ANNOTATION_TERM_FROM_ID_CACHING_STATE_, $int231$5000, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( document_annotation_term_from_id_internal( id ) ) );
      memoization_state.caching_state_put( caching_state, id, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62423L)
  public static SubLObject get_cached_term_id(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    maybe_initialize_doc_annotator_term_id_fbc( UNPROVIDED );
    final SubLObject cached_id = file_backed_cache.file_backed_cache_lookup( v_term, $doc_annotator_term_id_fbc$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( cached_id.isNumber() )
    {
      return PrintLow.write_to_string( cached_id, EMPTY_SUBL_OBJECT_ARRAY );
    }
    return cached_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62687L)
  public static SubLObject get_term_from_cached_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    maybe_initialize_doc_annotator_id_term_fbc( UNPROVIDED );
    SubLObject v_term = file_backed_cache.file_backed_cache_lookup( ( NIL != number_utilities.number_string_p( id ) ) ? reader.read_from_string( id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : id,
        $doc_annotator_id_term_fbc$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( v_term == $kw49$NOT_FOUND )
    {
      v_term = kb_utilities.maybe_find_object_by_compact_hl_external_id_string( id );
    }
    return ( NIL != v_term ) ? v_term : $kw49$NOT_FOUND;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 63186L)
  public static SubLObject get_default_document_ingester_annotation_learning_lexicon(SubLObject app_type, SubLObject filter_spec, SubLObject nl_mt)
  {
    if( app_type == UNPROVIDED )
    {
      app_type = NIL;
    }
    if( filter_spec == UNPROVIDED )
    {
      filter_spec = NIL;
    }
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( dictionary.dictionary_lookup( $default_document_ingester_annotation_learning_lexicons$.getDynamicValue( thread ), ConsesLow.list( app_type, filter_spec, nl_mt ),
        UNPROVIDED ) ) )
    {
      final SubLObject lex = make_default_document_annotation_lexicon( nl_mt );
      methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const182$Verb );
      methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const183$Adjective );
      methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const184$Adverb );
      methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const185$Gerundive );
      if( NIL != constant_handles.valid_constant( $const232$PredicateTaxonomy, UNPROVIDED ) )
      {
        methods.funcall_instance_method_with_1_args( lex, $sym186$ADD_CONCEPT_FILTER_SPEC, $list233 );
      }
      if( NIL != filter_spec )
      {
        methods.funcall_instance_method_with_1_args( lex, $sym186$ADD_CONCEPT_FILTER_SPEC, filter_spec );
      }
      if( NIL != named_entity_recognizer.stanford_ner_ping( UNPROVIDED, UNPROVIDED ) && !app_type.equal( $str234$vocabMarking ) )
      {
        methods.funcall_instance_method_with_1_args( lex, $sym235$ADD_LEARNER, $sym236$STANFORD_NER_LEARN );
      }
      dictionary.dictionary_enter( $default_document_ingester_annotation_learning_lexicons$.getDynamicValue( thread ), ConsesLow.list( app_type, filter_spec ), lex );
    }
    return dictionary.dictionary_lookup( $default_document_ingester_annotation_learning_lexicons$.getDynamicValue( thread ), ConsesLow.list( app_type, filter_spec ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64505L)
  public static SubLObject clear_default_document_ingester_annotation_learning_lexicon(SubLObject app_type)
  {
    if( app_type == UNPROVIDED )
    {
      app_type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == app_type )
    {
      dictionary.clear_dictionary( $default_document_ingester_annotation_learning_lexicons$.getDynamicValue( thread ) );
    }
    else
    {
      dictionary.dictionary_enter( $default_document_ingester_annotation_learning_lexicons$.getDynamicValue( thread ), app_type, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
  public static SubLObject clear_get_default_document_ingester_annotation_lexicon()
  {
    final SubLObject cs = $get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
  public static SubLObject remove_get_default_document_ingester_annotation_lexicon(SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue(), ConsesLow.list( nl_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
  public static SubLObject get_default_document_ingester_annotation_lexicon_internal(final SubLObject nl_mt)
  {
    final SubLObject lex = make_default_document_annotation_lexicon( nl_mt );
    methods.funcall_instance_method_with_1_args( lex, $sym238$SET_CASE_SENSITIVITY, $kw239$OFF );
    methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const183$Adjective );
    methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const184$Adverb );
    methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const185$Gerundive );
    methods.funcall_instance_method_with_1_args( lex, $sym240$EXCLUDE_PREDICATE, $const241$countryCodeTrigraph );
    methods.funcall_instance_method_with_1_args( lex, $sym240$EXCLUDE_PREDICATE, $const242$countryCodeDigraph );
    methods.funcall_instance_method_with_1_args( lex, $sym243$ALLOW_POS, $const244$ClosedClassWord );
    methods.funcall_instance_method_with_1_args( lex, $sym235$ADD_LEARNER, $sym245$SCALAR_INTERVAL_LEARN );
    methods.funcall_instance_method_with_1_args( lex, $sym235$ADD_LEARNER, $sym246$DATE_LEARN );
    if( NIL == lex )
    {
      methods.funcall_instance_method_with_1_args( lex, $sym181$EXCLUDE_POS, $const182$Verb );
      if( NIL != constant_handles.valid_constant( $const232$PredicateTaxonomy, UNPROVIDED ) )
      {
        methods.funcall_instance_method_with_1_args( lex, $sym186$ADD_CONCEPT_FILTER_SPEC, $list233 );
      }
    }
    return lex;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
  public static SubLObject get_default_document_ingester_annotation_lexicon(SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = NIL;
    }
    SubLObject caching_state = $get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON, $sym247$_GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON_CACHING_STATE_, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, nl_mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_default_document_ingester_annotation_lexicon_internal( nl_mt ) ) );
      memoization_state.caching_state_put( caching_state, nl_mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 65879L)
  public static SubLObject clear_default_document_ingester_annotation_lexicon_for_mt(final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue(), ConsesLow.list( mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66175L)
  public static SubLObject get_default_document_annotation_learning_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( $default_document_annotation_learning_lexicon$.getDynamicValue( thread ) ) )
    {
      $default_document_annotation_learning_lexicon$.setDynamicValue( make_default_document_annotation_lexicon( UNPROVIDED ), thread );
      if( NIL != named_entity_recognizer.stanford_ner_ping( UNPROVIDED, UNPROVIDED ) )
      {
        methods.funcall_instance_method_with_1_args( $default_document_annotation_learning_lexicon$.getDynamicValue( thread ), $sym235$ADD_LEARNER, $sym236$STANFORD_NER_LEARN );
      }
    }
    return $default_document_annotation_learning_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66613L)
  public static SubLObject clear_default_document_annotation_learning_lexicon()
  {
    $default_document_annotation_learning_lexicon$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66834L)
  public static SubLObject clear_default_document_annotation_lexicon()
  {
    $default_document_annotation_lexicon$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
  public static SubLObject clear_get_default_document_annotation_lexicon()
  {
    final SubLObject cs = $get_default_document_annotation_lexicon_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
  public static SubLObject remove_get_default_document_annotation_lexicon(SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $get_default_document_annotation_lexicon_caching_state$.getGlobalValue(), ConsesLow.list( nl_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
  public static SubLObject get_default_document_annotation_lexicon_internal(final SubLObject nl_mt)
  {
    return make_default_document_annotation_lexicon( nl_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
  public static SubLObject get_default_document_annotation_lexicon(SubLObject nl_mt)
  {
    if( nl_mt == UNPROVIDED )
    {
      nl_mt = NIL;
    }
    SubLObject caching_state = $get_default_document_annotation_lexicon_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON, $sym249$_GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, nl_mt, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_default_document_annotation_lexicon_internal( nl_mt ) ) );
      memoization_state.caching_state_put( caching_state, nl_mt, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 67118L)
  public static SubLObject make_default_document_annotation_lexicon(SubLObject base_mt)
  {
    if( base_mt == UNPROVIDED )
    {
      base_mt = NIL;
    }
    final SubLObject lexicon = object.new_class_instance( $sym250$TERM_LEXICON );
    methods.funcall_instance_method_with_0_args( lexicon, $sym251$IGNORE_CACHE );
    methods.funcall_instance_method_with_1_args( lexicon, $sym238$SET_CASE_SENSITIVITY, $kw252$PREFERRED );
    methods.funcall_instance_method_with_1_args( lexicon, $sym253$ALLOW_PREDICATE, $const254$preferredNameString );
    methods.funcall_instance_method_with_1_args( lexicon, $sym240$EXCLUDE_PREDICATE, $const255$ksTermString );
    methods.funcall_instance_method_with_1_args( lexicon, $sym240$EXCLUDE_PREDICATE, $const256$alias );
    methods.funcall_instance_method_with_1_args( lexicon, $sym240$EXCLUDE_PREDICATE, $const257$programStrings );
    methods.funcall_instance_method_with_1_args( lexicon, $sym240$EXCLUDE_PREDICATE, $const258$airportHasIATACode );
    methods.funcall_instance_method_with_1_args( lexicon, $sym240$EXCLUDE_PREDICATE, $const259$airportHasICAOCode );
    methods.funcall_instance_method_with_1_args( lexicon, $sym181$EXCLUDE_POS, $const244$ClosedClassWord );
    if( NIL != base_mt )
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym260$SET_BASE_MT, base_mt );
    }
    else
    {
      methods.funcall_instance_method_with_1_args( lexicon, $sym261$ALLOW_MT, $const262$TechnicalEnglishLexicalMt );
      methods.funcall_instance_method_with_1_args( lexicon, $sym261$ALLOW_MT, $const263$MedicalLexicalMt );
      if( NIL != constant_handles.valid_constant( constants_high.find_constant( $str264$CCFLexicalMt ), UNPROVIDED ) )
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym261$ALLOW_MT, $const265$CCFLexicalMt );
      }
    }
    methods.funcall_instance_method_with_1_args( lexicon, $sym186$ADD_CONCEPT_FILTER_SPEC, $list266 );
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 68507L)
  public static SubLObject get_default_document_annotation_rule_disambiguator()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == rule_disambiguation.rule_disambiguator_p( $default_document_annotation_rule_disambiguator$.getDynamicValue( thread ) ) )
    {
      $default_document_annotation_rule_disambiguator$.setDynamicValue( rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED ), thread );
    }
    return $default_document_annotation_rule_disambiguator$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 68814L)
  public static SubLObject maybe_initialize_doc_annotator_term_id_fbc(SubLObject file_path)
  {
    if( file_path == UNPROVIDED )
    {
      file_path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == file_backed_cache.file_backed_cache_p( $doc_annotator_term_id_fbc$.getDynamicValue( thread ) ) )
    {
      $doc_annotator_term_id_fbc$.setDynamicValue( file_backed_cache.file_backed_cache_create( file_path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    }
    return $doc_annotator_term_id_fbc$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 69189L)
  public static SubLObject maybe_initialize_doc_annotator_id_term_fbc(SubLObject file_path)
  {
    if( file_path == UNPROVIDED )
    {
      file_path = $doc_annotator_id_term_fbc_path$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == file_backed_cache.file_backed_cache_p( $doc_annotator_id_term_fbc$.getDynamicValue( thread ) ) )
    {
      $doc_annotator_id_term_fbc$.setDynamicValue( file_backed_cache.file_backed_cache_create( file_path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    }
    return $doc_annotator_id_term_fbc$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 69492L)
  public static SubLObject rebuild_doc_annotator_term_id_fbc(SubLObject overwrite, SubLObject path)
  {
    if( overwrite == UNPROVIDED )
    {
      overwrite = NIL;
    }
    if( path == UNPROVIDED )
    {
      path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == overwrite )
    {
      return $kw267$NOTHING_DONE;
    }
    final SubLObject fht = file_hash_table.create_file_hash_table( path, forts.fort_count(), TEN_INTEGER, EQUAL, $kw52$IMAGE_INDEPENDENT_CFASL );
    SubLObject id = ZERO_INTEGER;
    final SubLObject message = $str268$rebuilding_term_id_FHT;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw269$SKIP ) )
          {
            final SubLObject idx_$63 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$63, $kw269$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$63 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id_$64;
              SubLObject fort;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id_$64 = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id_$64 );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw269$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw269$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  file_hash_table.put_file_hash_table( cycl_utilities.hl_to_el( fort ), fht, id );
                  id = Numbers.add( id, ONE_INTEGER );
                }
              }
            }
            final SubLObject idx_$64 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$64 ) || NIL == id_index.id_index_skip_tombstones_p( $kw269$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$64 );
              SubLObject id_$65 = id_index.id_index_sparse_id_threshold( idx_$64 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$64 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw269$SKIP ) ) ? NIL : $kw269$SKIP;
              while ( id_$65.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id_$65, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw269$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  file_hash_table.put_file_hash_table( cycl_utilities.hl_to_el( fort2 ), fht, id );
                  id = Numbers.add( id, ONE_INTEGER );
                }
                id_$65 = Numbers.add( id_$65, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$67, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    file_hash_table.finalize_file_hash_table( fht );
    return path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 69965L)
  public static SubLObject build_id_to_term_fbc(SubLObject path, SubLObject term_to_id_path)
  {
    if( path == UNPROVIDED )
    {
      path = $doc_annotator_id_term_fbc_path$.getDynamicValue();
    }
    if( term_to_id_path == UNPROVIDED )
    {
      term_to_id_path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fht = file_hash_table.create_file_hash_table( path, TEN_INTEGER, TEN_INTEGER, EQUAL, $kw52$IMAGE_INDEPENDENT_CFASL );
    final SubLObject table_var;
    final SubLObject term_id_fht = table_var = file_hash_table.open_file_hash_table( term_to_id_path, UNPROVIDED, UNPROVIDED );
    utilities_macros.$progress_note$.setDynamicValue( $str270$Rebuilding_id__term_map, thread );
    utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
    utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( table_var ), thread );
    utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject continuation = NIL;
        SubLObject next;
        for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
        {
          thread.resetMultipleValues();
          final SubLObject the_key = file_hash_table.get_file_hash_table_any( table_var, continuation, NIL );
          final SubLObject the_value = thread.secondMultipleValue();
          next = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != next )
          {
            final SubLObject v_term = the_key;
            final SubLObject id = the_value;
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            file_hash_table.put_file_hash_table( id, fht, v_term );
          }
          continuation = next;
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return $kw135$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 70430L)
  public static SubLObject augment_doc_annotator_term_fht(SubLObject path)
  {
    if( path == UNPROVIDED )
    {
      path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fht = file_hash_table.open_file_hash_table( path, EQUAL, UNPROVIDED );
    SubLObject biggest_id = ZERO_INTEGER;
    SubLObject new_terms = NIL;
    final SubLObject message = $str271$Augmenting_term_id_FHT;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw269$SKIP ) )
          {
            final SubLObject idx_$69 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$69, $kw269$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$69 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject id_$70;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw269$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw269$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  id_$70 = file_hash_table.get_file_hash_table( fort, fht, $kw272$NO_ID );
                  if( id_$70.isNumber() && id_$70.numG( biggest_id ) )
                  {
                    biggest_id = id_$70;
                  }
                  else if( id_$70 == $kw272$NO_ID )
                  {
                    new_terms = ConsesLow.cons( fort, new_terms );
                  }
                }
              }
            }
            final SubLObject idx_$70 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$70 ) || NIL == id_index.id_index_skip_tombstones_p( $kw269$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$70 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$70 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$70 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw269$SKIP ) ) ? NIL : $kw269$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw269$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  final SubLObject id_$71 = file_hash_table.get_file_hash_table( fort2, fht, $kw272$NO_ID );
                  if( id_$71.isNumber() && id_$71.numG( biggest_id ) )
                  {
                    biggest_id = id_$71;
                  }
                  else if( id_$71 == $kw272$NO_ID )
                  {
                    new_terms = ConsesLow.cons( fort2, new_terms );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$73, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = new_terms;
    SubLObject new_fort = NIL;
    new_fort = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      biggest_id = Numbers.add( biggest_id, ONE_INTEGER );
      file_hash_table.put_file_hash_table( new_fort, fht, biggest_id );
      cdolist_list_var2 = cdolist_list_var2.rest();
      new_fort = cdolist_list_var2.first();
    }
    file_hash_table.finalize_file_hash_table( fht );
    return biggest_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 71026L)
  public static SubLObject document_query(final SubLObject text_query)
  {
    SubLObject ids = NIL;
    SubLObject cdolist_list_var = terms_for_cyc_semantic_query( text_query );
    SubLObject record = NIL;
    record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$74 = record.rest();
      SubLObject interps = NIL;
      interps = cdolist_list_var_$74.first();
      while ( NIL != cdolist_list_var_$74)
      {
        ids = ConsesLow.cons( conses_high.getf( interps, $kw273$INTERP_ID, UNPROVIDED ), ids );
        cdolist_list_var_$74 = cdolist_list_var_$74.rest();
        interps = cdolist_list_var_$74.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      record = cdolist_list_var.first();
    }
    return lucene_double_query( text_query, string_utilities.bunge( Sequences.nreverse( ids ), UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 71375L)
  public static SubLObject lucene_text_query(final SubLObject text_query, SubLObject max_ans_count)
  {
    if( max_ans_count == UNPROVIDED )
    {
      max_ans_count = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hits = NIL;
    SubLObject text_session = NIL;
    try
    {
      text_session = lucene_session.new_lucene_session( lucene_session.get_lucene_host(), lucene_session.get_lucene_port(), get_text_index(), $kw103$TEXT, UNPROVIDED );
      SubLObject cdolist_list_var;
      final SubLObject text_hits = cdolist_list_var = lucene_session.lucene_query( text_session, text_query, max_ans_count );
      SubLObject hit = NIL;
      hit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( $annotated_document_format$.getDynamicValue( thread ) == $kw158$SIMPLE )
        {
          hits = ConsesLow.cons( ConsesLow.append( hit, $list274 ), hits );
        }
        else
        {
          hits = ConsesLow.cons( ConsesLow.list( $kw275$DOC_TEXT, hit, $kw276$SEARCH_TYPE, $kw103$TEXT ), hits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        hit = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != lucene_session.lucene_session_p( text_session ) )
        {
          lucene_session.lucene_finalize( text_session );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return Sequences.nreverse( hits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 72004L)
  public static SubLObject lucene_sem_query_with_sem_search_string(final SubLObject sem_query, SubLObject max_ans_count)
  {
    if( max_ans_count == UNPROVIDED )
    {
      max_ans_count = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hits = NIL;
    SubLObject sem_session = NIL;
    try
    {
      sem_session = lucene_session.new_lucene_session( lucene_session.get_lucene_host(), lucene_session.get_lucene_port(), get_semantic_index(), $kw104$CYC, UNPROVIDED );
      SubLObject cdolist_list_var = lucene_session.lucene_query( sem_session, sem_query, max_ans_count );
      SubLObject hit = NIL;
      hit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( $annotated_document_format$.getDynamicValue( thread ) == $kw158$SIMPLE )
        {
          hits = ConsesLow.cons( conses_high.putf( hit, $kw276$SEARCH_TYPE, $kw104$CYC ), hits );
        }
        else
        {
          hits = ConsesLow.cons( ConsesLow.list( $kw275$DOC_TEXT, hit, $kw276$SEARCH_TYPE, $kw104$CYC ), hits );
        }
        cdolist_list_var = cdolist_list_var.rest();
        hit = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != lucene_session.lucene_session_p( sem_session ) )
        {
          lucene_session.lucene_finalize( sem_session );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    hits = clean_semantic_search_hits( hits );
    return Sequences.nreverse( hits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 72744L)
  public static SubLObject lucene_sem_query(final SubLObject text_query, SubLObject max_ans_count)
  {
    if( max_ans_count == UNPROVIDED )
    {
      max_ans_count = TEN_INTEGER;
    }
    SubLObject ids = NIL;
    SubLObject cdolist_list_var = terms_for_cyc_semantic_query( text_query );
    SubLObject record = NIL;
    record = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$75 = record.rest();
      SubLObject interps = NIL;
      interps = cdolist_list_var_$75.first();
      while ( NIL != cdolist_list_var_$75)
      {
        ids = ConsesLow.cons( conses_high.getf( interps, $kw273$INTERP_ID, UNPROVIDED ), ids );
        cdolist_list_var_$75 = cdolist_list_var_$75.rest();
        interps = cdolist_list_var_$75.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      record = cdolist_list_var.first();
    }
    return lucene_sem_query_with_sem_search_string( string_utilities.bunge( Sequences.nreverse( ids ), UNPROVIDED ), max_ans_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 73346L)
  public static SubLObject lucene_double_query(final SubLObject text_query, final SubLObject sem_query, SubLObject max_answer_count)
  {
    if( max_answer_count == UNPROVIDED )
    {
      max_answer_count = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym277$LUCENE_DOUBLE_QUERY, text_query, sem_query, max_answer_count ) );
    }
    if( NIL != $doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $doc_search_trace_log_file$.getDynamicValue( thread ), $kw112$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym277$LUCENE_DOUBLE_QUERY, text_query, sem_query,
            max_answer_count ) );
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
    return ConsesLow.append( lucene_text_query( text_query, max_answer_count ), lucene_sem_query_with_sem_search_string( sem_query, max_answer_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 73678L)
  public static SubLObject cyc_semantic_search_token(final SubLObject token, final SubLObject interp)
  {
    if( NIL != cycl_grammar.cycl_nat_p( interp ) || NIL != forts.fort_p( interp ) )
    {
      return Sequences.cconcatenate( $str278$0_0_t___, new SubLObject[] { format_nil.format_nil_a_no_copy( document_annotation_term_id( interp, UNPROVIDED ) ), $str142$_
      } );
    }
    return Sequences.cconcatenate( $str279$0_0_s___, new SubLObject[] { format_nil.format_nil_a_no_copy( token ), $str142$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 73913L)
  public static SubLObject terms_for_cyc_semantic_query(final SubLObject query_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trace_doc_search_interface$.getDynamicValue( thread ) )
    {
      PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list(
          $sym280$TERMS_FOR_CYC_SEMANTIC_QUERY, query_string ) );
    }
    if( NIL != $doc_search_trace_log_file$.getDynamicValue( thread ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $doc_search_trace_log_file$.getDynamicValue( thread ), $kw112$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject out = stream;
        Errors.warn( $str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue( thread ) );
        PrintLow.format( out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), ConsesLow.list( $sym280$TERMS_FOR_CYC_SEMANTIC_QUERY, query_string ) );
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
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw281$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym282$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject stream2 = NIL;
          try
          {
            stream2 = compatibility.open_text( $str283$_cyc_projects_doc_annotation_quer, $kw112$APPEND );
            if( !stream2.isStream() )
            {
              Errors.error( $str113$Unable_to_open__S, $str283$_cyc_projects_doc_annotation_quer );
            }
            final SubLObject log = stream2;
            PrintLow.format( log, $str284$_A___S__, numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ), query_string );
          }
          finally
          {
            final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$76, thread );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw281$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    SubLObject word_interp_map = NIL;
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_assumed_validP$.bind( T, thread );
      final SubLObject tokenizations = qua_query.get_tokenizations_for_aq_string( query_string, UNPROVIDED );
      SubLObject remove_stopwordsP = NIL;
      SubLObject cdolist_list_var = tokenizations;
      SubLObject tokenization = NIL;
      tokenization = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject token_num = NIL;
        list_var = tokenization;
        token = list_var.first();
        for( token_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), token_num = Numbers.add( ONE_INTEGER, token_num ) )
        {
          final SubLObject string = qua_query.aq_term_original_string( token );
          SubLObject interps = qua_query.aq_term_raw_meanings( token );
          if( Sequences.length( interps ).numG( ONE_INTEGER ) )
          {
            interps = Sequences.remove_if( $sym161$STRINGP, interps, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          SubLObject cdolist_list_var_$77 = interps;
          SubLObject interp_cycl = NIL;
          interp_cycl = cdolist_list_var_$77.first();
          while ( NIL != cdolist_list_var_$77)
          {
            if( NIL == list_utilities.every_in_list( $sym161$STRINGP, interps, UNPROVIDED ) )
            {
              remove_stopwordsP = T;
            }
            final SubLObject word = encode_word_for_semantic_query( string, interp_cycl );
            word_interp_map = list_utilities.alist_push( word_interp_map, ConsesLow.list( string, token_num ), word, EQUAL );
            cdolist_list_var_$77 = cdolist_list_var_$77.rest();
            interp_cycl = cdolist_list_var_$77.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        tokenization = cdolist_list_var.first();
      }
      if( NIL != remove_stopwordsP )
      {
        word_interp_map = Sequences.remove_if( $sym285$STOPWORD_IN_SEM_QUERY_, word_interp_map, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      lexicon_macros.$nl_trie_assumed_validP$.rebind( _prev_bind_0, thread );
    }
    return Mapping.mapcar( $sym286$REMOVE_CDAR, Sort.sort( word_interp_map, $sym172$_, $sym287$CADAR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75315L)
  public static SubLObject remove_cdar(final SubLObject item)
  {
    return ConsesLow.cons( conses_high.caar( item ), item.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75392L)
  public static SubLObject stopword_in_sem_queryP(final SubLObject encoded_word)
  {
    return makeBoolean( NIL != lexicon_utilities.denots_of_string_stop_word( conses_high.caar( encoded_word ) ) && NIL != string_utilities.starts_with( conses_high.getf( conses_high.second( encoded_word ),
        $kw273$INTERP_ID, UNPROVIDED ), $str288$0_0_s ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75598L)
  public static SubLObject encode_word_for_semantic_query(final SubLObject string, final SubLObject interp_cycl)
  {
    return ConsesLow.list( $kw289$INTERP, interp_cycl, $kw273$INTERP_ID, cyc_semantic_search_token( string, interp_cycl ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75894L)
  public static SubLObject terms_for_focused_cyc_semantic_query(final SubLObject query_string, final SubLObject term_id)
  {
    final SubLObject interp_cycl = kb_utilities.maybe_find_object_by_compact_hl_external_id_string( term_id );
    if( NIL != forts.fort_p( interp_cycl ) || NIL != cycl_grammar.cycl_nat_p( interp_cycl ) )
    {
      final SubLObject interpretations = terms_for_cyc_semantic_query( query_string );
      SubLObject results = NIL;
      SubLObject cdolist_list_var = interpretations;
      SubLObject interpretation = NIL;
      interpretation = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = interpretation;
        SubLObject word = NIL;
        SubLObject details = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list291 );
        details = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject cycl_interpretation = conses_high.getf( details, $kw289$INTERP, NIL );
          if( cycl_interpretation.equal( interp_cycl ) )
          {
            results = ConsesLow.cons( interpretation, results );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list291 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        interpretation = cdolist_list_var.first();
      }
      if( NIL == results )
      {
        results = ConsesLow.cons( ConsesLow.list( query_string, encode_word_for_semantic_query( query_string, interp_cycl ) ), results );
      }
      return results;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 76810L)
  public static SubLObject simple_terms_for_cyc_semantic_query(final SubLObject query_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word_interp_map = dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), TWENTY_INTEGER );
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_assumed_validP$.bind( T, thread );
      SubLObject cdolist_list_var;
      final SubLObject tokenizations = cdolist_list_var = qua_query.get_tokenizations_for_aq_string( query_string, UNPROVIDED );
      SubLObject tokenization = NIL;
      tokenization = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$78 = tokenization;
        SubLObject token = NIL;
        token = cdolist_list_var_$78.first();
        while ( NIL != cdolist_list_var_$78)
        {
          final SubLObject string = qua_query.aq_term_original_string( token );
          SubLObject cdolist_list_var_$79 = qua_query.aq_term_raw_meanings( token );
          SubLObject interp_cycl = NIL;
          interp_cycl = cdolist_list_var_$79.first();
          while ( NIL != cdolist_list_var_$79)
          {
            if( !interp_cycl.isString() )
            {
              final SubLObject word = interp_cycl;
              dictionary_utilities.dictionary_push( word_interp_map, string, word );
            }
            cdolist_list_var_$79 = cdolist_list_var_$79.rest();
            interp_cycl = cdolist_list_var_$79.first();
          }
          cdolist_list_var_$78 = cdolist_list_var_$78.rest();
          token = cdolist_list_var_$78.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        tokenization = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_macros.$nl_trie_assumed_validP$.rebind( _prev_bind_0, thread );
    }
    return dictionary_utilities.dictionary_to_alist( word_interp_map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77984L)
  public static SubLObject get_compiled_regexp(final SubLObject regexp)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cached_version = list_utilities.alist_lookup( $cached_regexps$.getDynamicValue( thread ), regexp, EQUAL, UNPROVIDED );
    if( NIL != regular_expressions.regular_expression_p( cached_version ) )
    {
      return cached_version;
    }
    $cached_regexps$.setDynamicValue( list_utilities.alist_enter( $cached_regexps$.getDynamicValue( thread ), regexp, regular_expressions.compile_regular_expression( regexp, UNPROVIDED ), UNPROVIDED ), thread );
    return list_utilities.alist_lookup( $cached_regexps$.getDynamicValue( thread ), regexp, EQUAL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 78353L)
  public static SubLObject clean_semantic_search_hits(final SubLObject hit_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject output = NIL;
    SubLObject cdolist_list_var = hit_list;
    SubLObject hit = NIL;
    hit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject snippet = conses_high.getf( hit, $kw298$SNIPPET, UNPROVIDED );
      SubLObject title = conses_high.getf( hit, $kw299$TITLE, UNPROVIDED );
      SubLObject cdolist_list_var_$80 = ConsesLow.list( $remove_pictures_regexp$.getDynamicValue( thread ), $remove_hyphens_regexp$.getDynamicValue( thread ), $remove_underscores_regexp$.getDynamicValue( thread ),
          $remove_dots_regexp$.getDynamicValue( thread ), $remove_equals_regexp$.getDynamicValue( thread ), $remove_unicode_regexp$.getDynamicValue( thread ) );
      SubLObject regexp = NIL;
      regexp = cdolist_list_var_$80.first();
      while ( NIL != cdolist_list_var_$80)
      {
        if( title.isString() )
        {
          title = regular_expression_utilities.regex_subst( get_compiled_regexp( regexp ), $str111$, title, UNPROVIDED );
        }
        if( snippet.isString() )
        {
          snippet = regular_expression_utilities.regex_subst( get_compiled_regexp( regexp ), $str111$, snippet, UNPROVIDED );
        }
        cdolist_list_var_$80 = cdolist_list_var_$80.rest();
        regexp = cdolist_list_var_$80.first();
      }
      hit = conses_high.putf( hit, $kw299$TITLE, title );
      hit = conses_high.putf( hit, $kw298$SNIPPET, snippet );
      output = ConsesLow.cons( hit, output );
      cdolist_list_var = cdolist_list_var.rest();
      hit = cdolist_list_var.first();
    }
    return Sequences.nreverse( output );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 79153L)
  public static SubLObject do_lexified_forts(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject fort = NIL;
    SubLObject lexicon = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    fort = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    lexicon = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject seenP = $sym301$SEEN_;
      return ConsesLow.list( $sym101$CLET, ConsesLow.list( fort, reader.bq_cons( seenP, $list302 ) ), ConsesLow.list( $sym303$DO_LEXICON, ConsesLow.list( $sym304$STRING, $sym305$LEX, lexicon ), $list306, ConsesLow.listS(
          $sym307$CSETQ, fort, $list308 ), ConsesLow.listS( $sym309$PUNLESS, ConsesLow.list( $sym310$GETHASH_WITHOUT_VALUES, fort, seenP ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym311$SETHASH, fort,
              seenP, $list312 ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 79727L)
  public static SubLObject simple_document_tagging_results(final SubLObject doc_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_document = new_tagged_document( doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED );
    SubLObject result = NIL;
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
      final SubLObject _prev_bind_0_$81 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          rule_disambiguation.rdis_disambiguate( disambiguator, v_document, UNPROVIDED );
          final SubLObject vector_var = document.document_paragraphs( v_document );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject paragraph;
          SubLObject vector_var_$82;
          SubLObject backwardP_var_$83;
          SubLObject length_$84;
          SubLObject v_iteration_$85;
          SubLObject element_num_$86;
          SubLObject sentence;
          SubLObject cdolist_list_var;
          SubLObject word;
          SubLObject word_string;
          SubLObject word_result;
          SubLObject interps;
          SubLObject list_var;
          SubLObject interp;
          SubLObject interp_num;
          SubLObject v_term;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            paragraph = Vectors.aref( vector_var, element_num );
            vector_var_$82 = document.paragraph_sentences( paragraph );
            backwardP_var_$83 = NIL;
            for( length_$84 = Sequences.length( vector_var_$82 ), v_iteration_$85 = NIL, v_iteration_$85 = ZERO_INTEGER; v_iteration_$85.numL( length_$84 ); v_iteration_$85 = Numbers.add( v_iteration_$85, ONE_INTEGER ) )
            {
              element_num_$86 = ( ( NIL != backwardP_var_$83 ) ? Numbers.subtract( length_$84, v_iteration_$85, ONE_INTEGER ) : v_iteration_$85 );
              sentence = Vectors.aref( vector_var_$82, element_num_$86 );
              cdolist_list_var = document.sentence_yield_exhaustive( sentence );
              word = NIL;
              word = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                word_string = document.word_string( word );
                word_result = ConsesLow.list( word_string );
                interps = document.word_interps( word );
                list_var = NIL;
                interp = NIL;
                interp_num = NIL;
                list_var = interps;
                interp = list_var.first();
                for( interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), interp = list_var.first(), interp_num = Numbers.add( ONE_INTEGER, interp_num ) )
                {
                  v_term = nl_api_datastructures.get_nl_interp_cycl( interp );
                  word_result = ConsesLow.cons( v_term, word_result );
                }
                if( NIL != interps )
                {
                  result = ConsesLow.cons( Sequences.nreverse( word_result ), result );
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$82, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$81, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 80742L)
  public static SubLObject show_document_tagging_results(final SubLObject doc_string, SubLObject strings_per_concept)
  {
    if( strings_per_concept == UNPROVIDED )
    {
      strings_per_concept = ONE_INTEGER;
    }
    SubLObject result = NIL;
    final SubLObject doc_tagging_result = simple_document_tagging_results( doc_string );
    final SubLObject params;
    final SubLObject generation_params = params = nl_generation_api.new_pph_parameters( UNPROVIDED );
    pph_parameter_declarations.set_pph_generation_count_internal( params, strings_per_concept );
    SubLObject cdolist_list_var = doc_tagging_result;
    SubLObject word_result = NIL;
    word_result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject concepts = word_result.rest();
      SubLObject new_word_result = ConsesLow.list( word_result.first() );
      SubLObject cdolist_list_var_$88 = concepts;
      SubLObject concept = NIL;
      concept = cdolist_list_var_$88.first();
      while ( NIL != cdolist_list_var_$88)
      {
        SubLObject cdolist_list_var_$89 = nl_generation_api.cycl_term_to_nl_internal( concept, generation_params );
        SubLObject map = NIL;
        map = cdolist_list_var_$89.first();
        while ( NIL != cdolist_list_var_$89)
        {
          new_word_result = ConsesLow.cons( nl_generation_api.pph_output_map_to_text_internal( map, NIL, ZERO_INTEGER, NIL, NIL ), new_word_result );
          cdolist_list_var_$89 = cdolist_list_var_$89.rest();
          map = cdolist_list_var_$89.first();
        }
        cdolist_list_var_$88 = cdolist_list_var_$88.rest();
        concept = cdolist_list_var_$88.first();
      }
      result = ConsesLow.cons( Sequences.nreverse( new_word_result ), result );
      cdolist_list_var = cdolist_list_var.rest();
      word_result = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 81612L)
  public static SubLObject document_tagging_results_for_human_review(final SubLObject doc_string, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_document = new_tagged_document( doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED );
    SubLObject sentence_count = ZERO_INTEGER;
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
      final SubLObject _prev_bind_0_$90 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          rule_disambiguation.rdis_disambiguate( disambiguator, v_document, UNPROVIDED );
          final SubLObject vector_var = document.document_paragraphs( v_document );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject paragraph;
          SubLObject vector_var_$91;
          SubLObject backwardP_var_$92;
          SubLObject length_$93;
          SubLObject v_iteration_$94;
          SubLObject element_num_$95;
          SubLObject sentence;
          SubLObject cdolist_list_var;
          SubLObject word;
          SubLObject word_string;
          SubLObject interps;
          SubLObject cdolist_list_var_$96;
          SubLObject interp;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            paragraph = Vectors.aref( vector_var, element_num );
            vector_var_$91 = document.paragraph_sentences( paragraph );
            backwardP_var_$92 = NIL;
            for( length_$93 = Sequences.length( vector_var_$91 ), v_iteration_$94 = NIL, v_iteration_$94 = ZERO_INTEGER; v_iteration_$94.numL( length_$93 ); v_iteration_$94 = Numbers.add( v_iteration_$94, ONE_INTEGER ) )
            {
              element_num_$95 = ( ( NIL != backwardP_var_$92 ) ? Numbers.subtract( length_$93, v_iteration_$94, ONE_INTEGER ) : v_iteration_$94 );
              sentence = Vectors.aref( vector_var_$91, element_num_$95 );
              sentence_count = Numbers.add( sentence_count, ONE_INTEGER );
              PrintLow.format( stream, $str313$_A___A__, sentence_count, document.sentence_string( sentence ) );
              cdolist_list_var = document.sentence_yield_exhaustive( sentence );
              word = NIL;
              word = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                word_string = document.word_string( word );
                interps = document.word_cycls( word );
                PrintLow.format( stream, $str314$____A__, word_string );
                cdolist_list_var_$96 = interps;
                interp = NIL;
                interp = cdolist_list_var_$96.first();
                while ( NIL != cdolist_list_var_$96)
                {
                  PrintLow.format( stream, $str315$_A_, interp );
                  cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                  interp = cdolist_list_var_$96.first();
                }
                PrintLow.format( stream, $str316$__ );
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$90, thread );
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return $kw135$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 82578L)
  public static SubLObject remove_pictures_regexp_test(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return regular_expression_utilities.find_all_matches_for_regular_expression( $remove_pictures_regexp$.getDynamicValue( thread ), string, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 82578L)
  public static SubLObject get_doc_string_from_node_ids_and_strings_values(final SubLObject arg)
  {
    return Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_doc_string_from_node_ids_and_strings( arg ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 83584L)
  public static SubLObject get_interpretation_rules_for_mt(SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $document_interpretation_default_elmt$.getDynamicValue();
    }
    SubLObject known_rules = dictionary.dictionary_lookup( $document_interpretation_rules_by_mt$.getGlobalValue(), mt, UNPROVIDED );
    if( NIL != known_rules )
    {
      return known_rules;
    }
    known_rules = initialize_interpretation_rules( mt );
    return known_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 83996L)
  public static SubLObject tag_document_for_interpretation(final SubLObject document_as_string, SubLObject lexicon)
  {
    if( lexicon == UNPROVIDED )
    {
      lexicon = get_default_document_annotation_lexicon( UNPROVIDED );
    }
    final SubLObject v_document = new_tagged_document( document_as_string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return v_document;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 84328L)
  public static SubLObject get_concept_bag_from_document(final SubLObject v_document)
  {
    final SubLObject concept_bag = bag.new_bag( UNPROVIDED, UNPROVIDED );
    final SubLObject vector_var = document.document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    SubLObject vector_var_$98;
    SubLObject backwardP_var_$99;
    SubLObject length_$100;
    SubLObject v_iteration_$101;
    SubLObject element_num_$102;
    SubLObject sentence;
    SubLObject cdolist_list_var;
    SubLObject word;
    SubLObject cdolist_list_var_$103;
    SubLObject interpretation;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$98 = document.paragraph_sentences( paragraph );
      backwardP_var_$99 = NIL;
      for( length_$100 = Sequences.length( vector_var_$98 ), v_iteration_$101 = NIL, v_iteration_$101 = ZERO_INTEGER; v_iteration_$101.numL( length_$100 ); v_iteration_$101 = Numbers.add( v_iteration_$101,
          ONE_INTEGER ) )
      {
        element_num_$102 = ( ( NIL != backwardP_var_$99 ) ? Numbers.subtract( length_$100, v_iteration_$101, ONE_INTEGER ) : v_iteration_$101 );
        sentence = Vectors.aref( vector_var_$98, element_num_$102 );
        cdolist_list_var = document.sentence_yield_exhaustive( sentence );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cdolist_list_var_$103 = document.word_cycls( word );
          interpretation = NIL;
          interpretation = cdolist_list_var_$103.first();
          while ( NIL != cdolist_list_var_$103)
          {
            bag.bag_add( czer_main.canonicalize_term( interpretation, UNPROVIDED ), concept_bag );
            cdolist_list_var_$103 = cdolist_list_var_$103.rest();
            interpretation = cdolist_list_var_$103.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
      }
    }
    return concept_bag;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 84654L)
  public static SubLObject do_interpretation_rules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject rule = NIL;
    SubLObject rule_set = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    rule = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list329 );
    rule_set = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym330$DO_SET, ConsesLow.list( rule, rule_set ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list329 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 84786L)
  public static SubLObject interpret_document_via_suggestions(final SubLObject document_as_string)
  {
    final SubLObject v_document = tag_document_for_interpretation( document_as_string, UNPROVIDED );
    final SubLObject raw_concept_bag = get_concept_bag_from_document( v_document );
    return suggest_interpretations( raw_concept_bag, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 85055L)
  public static SubLObject suggest_interpretations(final SubLObject original_concept_bag, SubLObject rule_set, SubLObject elmt)
  {
    if( rule_set == UNPROVIDED )
    {
      rule_set = get_interpretation_rules_for_mt( UNPROVIDED );
    }
    if( elmt == UNPROVIDED )
    {
      elmt = $document_interpretation_default_elmt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject concept_bag = bag.copy_bag( original_concept_bag );
    final SubLObject sentence_bag = bag.new_bag( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject justifications = NIL;
    SubLObject changes;
    for( SubLObject quiescentP = NIL; NIL == quiescentP; quiescentP = Numbers.zerop( changes ) )
    {
      changes = ZERO_INTEGER;
      final SubLObject set_contents_var = set.do_set_internal( rule_set );
      SubLObject basis_object;
      SubLObject state;
      SubLObject rule;
      SubLObject _prev_bind_0;
      SubLObject _prev_bind_2;
      SubLObject applies_p;
      SubLObject v_bindings;
      SubLObject insights;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        rule = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, rule ) )
        {
          _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym331$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( elmt, thread );
            thread.resetMultipleValues();
            applies_p = interpretation_rule_appliesP( rule, concept_bag, sentence_bag );
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != applies_p )
            {
              insights = update_interpretation_with_rule( rule, concept_bag, sentence_bag, v_bindings );
              if( !insights.isZero() )
              {
                justifications = ConsesLow.cons( rule, justifications );
                changes = Numbers.add( changes, ONE_INTEGER );
              }
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    return Values.values( concept_bag, sentence_bag, Sequences.nreverse( justifications ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 86316L)
  public static SubLObject interpretation_rule_appliesP(final SubLObject rule, final SubLObject concept_bag, final SubLObject sentence_bag)
  {
    final SubLObject preconditions = interpretation_rule_description_preconditions( rule );
    final SubLObject logical_operator = cycl_utilities.formula_arg0( preconditions );
    final SubLObject tests = cycl_utilities.formula_args( preconditions, UNPROVIDED );
    SubLObject v_bindings = NIL;
    SubLObject concepts = NIL;
    SubLObject cdolist_list_var = tests;
    SubLObject test = NIL;
    test = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject test_result = NIL;
      if( NIL != forts.fort_p( test ) )
      {
        if( NIL == concepts )
        {
          concepts = bag.bag_unique_element_list( concept_bag );
        }
        final SubLObject candidates = genls.all_specs_among( test, concepts, UNPROVIDED, UNPROVIDED );
        test_result = list_utilities.sublisp_boolean( candidates );
        if( NIL != test_result )
        {
          v_bindings = ConsesLow.cons( ConsesLow.cons( test, candidates ), v_bindings );
        }
      }
      else if( NIL != el_utilities.el_formula_p( test ) )
      {
        Errors.error( $str332$Dont_know_yet_how_to_unify_a_sent );
      }
      else
      {
        Errors.error( $str333$Dont_know_how_to_deal_with_test__, test );
      }
      if( NIL != test_result && logical_operator.eql( $const60$or ) )
      {
        return Values.values( T, v_bindings );
      }
      if( NIL == test_result && logical_operator.eql( $const91$and ) )
      {
        return Values.values( NIL, NIL );
      }
      cdolist_list_var = cdolist_list_var.rest();
      test = cdolist_list_var.first();
    }
    return Values.values( logical_operator.eql( $const60$or ) ? NIL : ( logical_operator.eql( $const91$and ) ? T : NIL ), v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 87735L)
  public static SubLObject update_interpretation_with_rule(final SubLObject rule, final SubLObject concept_bag, final SubLObject sentence_bag, final SubLObject v_bindings)
  {
    final SubLObject suggestions = interpretation_rule_description_suggestions( rule );
    SubLObject changes = ZERO_INTEGER;
    SubLObject cdolist_list_var = suggestions;
    SubLObject suggestion = NIL;
    suggestion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( $kw334$ADD_CONCEPT == cycl_utilities.formula_arg0( suggestion ) )
      {
        final SubLObject concept = cycl_utilities.formula_arg1( suggestion, UNPROVIDED );
        if( NIL == bag.bag_memberP( concept, concept_bag ) )
        {
          changes = Numbers.add( changes, ONE_INTEGER );
          bag.bag_add( concept, concept_bag );
        }
      }
      else if( $kw335$ADD_SENTENCE == cycl_utilities.formula_arg0( suggestion ) )
      {
        final SubLObject sentence_template = cycl_utilities.formula_arg1( suggestion, UNPROVIDED );
        SubLObject cdolist_list_var_$104 = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var_$104.first();
        while ( NIL != cdolist_list_var_$104)
        {
          final SubLObject concept2 = binding.first();
          final SubLObject mentioned_concepts = binding.rest();
          if( NIL != list_utilities.tree_find( concept2, sentence_template, UNPROVIDED, UNPROVIDED ) )
          {
            SubLObject cdolist_list_var_$105 = mentioned_concepts;
            SubLObject mentioned_concept = NIL;
            mentioned_concept = cdolist_list_var_$105.first();
            while ( NIL != cdolist_list_var_$105)
            {
              final SubLObject sentence = list_utilities.tree_substitute( conses_high.copy_tree( sentence_template ), concept2, mentioned_concept );
              if( NIL == bag.bag_memberP( sentence, sentence_bag ) )
              {
                changes = Numbers.add( changes, ONE_INTEGER );
                bag.bag_add( sentence, sentence_bag );
              }
              cdolist_list_var_$105 = cdolist_list_var_$105.rest();
              mentioned_concept = cdolist_list_var_$105.first();
            }
          }
          cdolist_list_var_$104 = cdolist_list_var_$104.rest();
          binding = cdolist_list_var_$104.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      suggestion = cdolist_list_var.first();
    }
    return changes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 89207L)
  public static SubLObject initialize_interpretation_rules(SubLObject elmt)
  {
    if( elmt == UNPROVIDED )
    {
      elmt = $document_interpretation_default_elmt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject interp_rules = set.new_set( EQUAL, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym331$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( elmt, thread );
      final SubLObject pred_var = $const336$interpretationSuggestion;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$106 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$107 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw337$GAF, $kw338$TRUE, NIL );
                SubLObject done_var_$108 = NIL;
                final SubLObject token_var_$109 = NIL;
                while ( NIL == done_var_$108)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$109 );
                  final SubLObject valid_$110 = makeBoolean( !token_var_$109.eql( assertion ) );
                  if( NIL != valid_$110 )
                  {
                    add_interpretation_rule( assertion, interp_rules );
                  }
                  done_var_$108 = makeBoolean( NIL == valid_$110 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$107, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$107, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$106, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    dictionary.dictionary_enter( $document_interpretation_rules_by_mt$.getGlobalValue(), elmt, interp_rules );
    return elmt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 89605L)
  public static SubLObject add_interpretation_rule(final SubLObject assertion, final SubLObject rule_set)
  {
    final SubLObject antecedent = assertions_high.gaf_arg1( assertion );
    final SubLObject consequent = assertions_high.gaf_arg2( assertion );
    add_interpretation_rule_clauses( rule_set, antecedent, consequent );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 89844L)
  public static SubLObject add_interpretation_rule_clauses(final SubLObject rule_set, final SubLObject antecedent, final SubLObject consequent)
  {
    final SubLObject preconditions = extract_interpretation_rule_preconditions( antecedent );
    final SubLObject suggestions = extract_interpretation_rule_suggestions( consequent );
    final SubLObject rule = make_interpretation_rule_description( antecedent, consequent, preconditions, suggestions );
    store_interpretation_rule( rule_set, rule );
    return interpretation_rules_count( rule_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90311L)
  public static SubLObject interpretation_rules_count(final SubLObject rule_set)
  {
    return set.set_size( rule_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90398L)
  public static SubLObject clear_interpretation_rules()
  {
    return set.clear_set( get_interpretation_rules_for_mt( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90502L)
  public static SubLObject store_interpretation_rule(final SubLObject rule_set, final SubLObject rule)
  {
    return set.set_add( rule, rule_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90594L)
  public static SubLObject make_interpretation_rule_description(final SubLObject antecedent, final SubLObject consequent, final SubLObject preconditions, final SubLObject suggestions)
  {
    return ConsesLow.list( $kw339$ANTECEDENT, antecedent, $kw340$CONSEQUENT, consequent, $kw341$PRECONDITIONS, preconditions, $kw342$SUGGESTIONS, suggestions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90853L)
  public static SubLObject interpretation_rule_description_antecedent(final SubLObject description)
  {
    return conses_high.getf( description, $kw339$ANTECEDENT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90968L)
  public static SubLObject interpretation_rule_description_consequent(final SubLObject description)
  {
    return conses_high.getf( description, $kw340$CONSEQUENT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 91082L)
  public static SubLObject interpretation_rule_description_preconditions(final SubLObject description)
  {
    return conses_high.getf( description, $kw341$PRECONDITIONS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 91202L)
  public static SubLObject interpretation_rule_description_suggestions(final SubLObject description)
  {
    return conses_high.getf( description, $kw342$SUGGESTIONS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 91318L)
  public static SubLObject extract_interpretation_rule_preconditions(final SubLObject antecedent)
  {
    if( $const91$and.eql( cycl_utilities.formula_arg0( antecedent ) ) )
    {
      SubLObject precondition = NIL;
      final SubLObject operator = cycl_utilities.formula_arg0( antecedent );
      SubLObject cdolist_list_var;
      final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args( antecedent, UNPROVIDED );
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        precondition = ConsesLow.cons( extract_interpretation_rule_precondition( clause ), precondition );
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
      precondition = ConsesLow.cons( operator, precondition );
      return precondition;
    }
    if( $const60$or.eql( cycl_utilities.formula_arg0( antecedent ) ) )
    {
      SubLObject precondition = NIL;
      final SubLObject operator = cycl_utilities.formula_arg0( antecedent );
      SubLObject cdolist_list_var;
      final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args( antecedent, UNPROVIDED );
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        precondition = ConsesLow.cons( extract_interpretation_rule_precondition( clause ), precondition );
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
      precondition = ConsesLow.cons( operator, precondition );
      return precondition;
    }
    final SubLObject precondition2 = extract_interpretation_rule_precondition( antecedent );
    return ConsesLow.list( $const91$and, precondition2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 92268L)
  public static SubLObject extract_interpretation_rule_suggestions(final SubLObject consequent)
  {
    if( $const91$and.eql( cycl_utilities.formula_arg0( consequent ) ) )
    {
      SubLObject suggestions = NIL;
      SubLObject cdolist_list_var;
      final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args( consequent, UNPROVIDED );
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        suggestions = ConsesLow.cons( extract_interpretation_rule_suggestion( clause ), suggestions );
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
      suggestions = Sequences.nreverse( suggestions );
      return suggestions;
    }
    if( $const60$or.eql( cycl_utilities.formula_arg0( consequent ) ) )
    {
      SubLObject suggestions = NIL;
      SubLObject cdolist_list_var;
      final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args( consequent, UNPROVIDED );
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        suggestions = ConsesLow.cons( extract_interpretation_rule_suggestion( clause ), suggestions );
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
      suggestions = Sequences.nreverse( suggestions );
      return suggestions;
    }
    if( $const343$containsProposition_CW.eql( cycl_utilities.formula_arg0( consequent ) ) )
    {
      final SubLObject sub_consequent = cycl_utilities.formula_arg2( consequent, UNPROVIDED );
      return extract_interpretation_rule_suggestions( sub_consequent );
    }
    final SubLObject suggestion = extract_interpretation_rule_suggestion( consequent );
    return ConsesLow.list( suggestion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 93299L)
  public static SubLObject extract_interpretation_rule_precondition(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject operator = cycl_utilities.formula_arg0( clause );
    if( $const344$thingDescribed.eql( operator ) )
    {
      final SubLObject the_expression = cycl_utilities.formula_arg2( clause, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !cycl_utilities.formula_arg0( the_expression ).eql( $const345$The ) )
      {
        Errors.error( $str346$Invalid_THE_expression__A___, the_expression );
      }
      return cycl_utilities.formula_arg1( the_expression, UNPROVIDED );
    }
    Errors.error( $str347$Dont_know_how_to_handle_precondit, operator, clause );
    return clause;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 93804L)
  public static SubLObject extract_interpretation_rule_suggestion(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject operator = cycl_utilities.formula_arg0( clause );
    if( $const344$thingDescribed.eql( operator ) )
    {
      final SubLObject the_expression = cycl_utilities.formula_arg2( clause, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !cycl_utilities.formula_arg0( the_expression ).eql( $const345$The ) )
      {
        Errors.error( $str346$Invalid_THE_expression__A___, the_expression );
      }
      final SubLObject concept = cycl_utilities.formula_arg1( the_expression, UNPROVIDED );
      return ConsesLow.list( $kw334$ADD_CONCEPT, concept );
    }
    return ConsesLow.list( $kw335$ADD_SENTENCE, clause );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 94296L)
  public static SubLObject cb_document_interpretation_show_concept(final SubLObject concept, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = ONE_INTEGER;
    }
    cb_utilities.cb_form( concept, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    if( ONE_INTEGER.numG( count ) )
    {
      html_utilities.html_princ( $str202$_ );
      html_utilities.html_princ( count );
      html_utilities.html_princ( $str204$_ );
      html_utilities.html_indent( UNPROVIDED );
    }
    return concept;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 94593L)
  public static SubLObject cb_document_interpretation_show_sentence(final SubLObject sentence, SubLObject count)
  {
    if( count == UNPROVIDED )
    {
      count = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_utilities.cb_form( sentence, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 94760L)
  public static SubLObject cb_document_interpretation_show_rule(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      final SubLObject antecedent = interpretation_rule_description_antecedent( rule );
      final SubLObject consequent = interpretation_rule_description_consequent( rule );
      html_utilities.html_princ( $str348$If_it_is_the_case_that__ );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( antecedent, ZERO_INTEGER, T );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str349$then_one_might_conclude_that__ );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( consequent, ZERO_INTEGER, T );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
    return rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 95227L)
  public static SubLObject cb_document_interpretation_suggestions(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject text = html_utilities.html_extract_input( $str119$text, args );
    final SubLObject mt_string = ( NIL != html_utilities.html_extract_input( $str350$mt, args ) ) ? html_utilities.html_extract_input( $str350$mt, args )
        : string_utilities.string_remove_constant_reader_prefixes( format_cycl_expression.format_cycl_expression_to_string( $document_interpretation_default_elmt$.getDynamicValue( thread ), UNPROVIDED ) );
    final SubLObject mt = cb_utilities.cb_guess_term( mt_string, UNPROVIDED );
    final SubLObject title_var = $str351$Document_Interpretation_Suggestio;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str352$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str353$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$112 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw24$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw354$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$113 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str357$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str358$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str359$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str360$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str361$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_paragraph_head$.getGlobalValue() );
            html_utilities.html_princ( $str362$Enter_the_text_to_interpret_ );
            html_utilities.html_markup( html_macros.$html_paragraph_tail$.getGlobalValue() );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str363$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str364$cb_document_interpretation_sugges, T, UNPROVIDED );
              html_utilities.html_submit_input( $str365$Submit, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_reset_input( $str366$Clear );
              html_utilities.html_newline( TWO_INTEGER );
              final SubLObject current_text = text.isString() ? text : $str111$;
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str119$text );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int367$80 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( FIFTEEN_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( current_text );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str368$Rule_Mt__ );
              html_utilities.html_text_input( $str350$mt, mt_string, $int369$40 );
              html_complete.html_complete_button( mt_string, $str370$Complete, $const371$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            if( NIL != text )
            {
              final SubLObject v_document = tag_document_for_interpretation( text, UNPROVIDED );
              final SubLObject raw_concept_bag = get_concept_bag_from_document( v_document );
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( $str372$Identified_Concepts );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_paragraph_head$.getGlobalValue() );
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( bag.do_bag_repeat_internal( raw_concept_bag ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject concept = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                cb_document_interpretation_show_concept( concept, count );
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
              final SubLObject count2 = ONE_INTEGER;
              final SubLObject set_contents_var = bag.do_bag_unique_internal( raw_concept_bag );
              SubLObject basis_object;
              SubLObject state;
              SubLObject concept2;
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                concept2 = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, concept2 ) )
                {
                  cb_document_interpretation_show_concept( concept2, count2 );
                }
              }
              html_utilities.html_markup( html_macros.$html_paragraph_tail$.getGlobalValue() );
              thread.resetMultipleValues();
              final SubLObject concept_bag = suggest_interpretations( raw_concept_bag, get_interpretation_rules_for_mt( mt ), mt );
              final SubLObject sentence_bag = thread.secondMultipleValue();
              final SubLObject justifications = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if( !bag.bag_size( concept_bag ).numE( bag.bag_size( raw_concept_bag ) ) )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( THREE_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( $str373$Suggested_Concepts );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( THREE_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                SubLObject iteration_state2;
                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( bag.do_bag_repeat_internal( concept_bag ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                    iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject concept3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                  final SubLObject count3 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL == bag.bag_memberP( concept3, raw_concept_bag ) )
                  {
                    cb_document_interpretation_show_concept( concept3, count3 );
                  }
                }
                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                final SubLObject count4 = ONE_INTEGER;
                final SubLObject set_contents_var2 = bag.do_bag_unique_internal( concept_bag );
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject concept4;
                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                {
                  concept4 = set_contents.do_set_contents_next( basis_object2, state2 );
                  if( NIL != set_contents.do_set_contents_element_validP( state2, concept4 ) && NIL == bag.bag_memberP( concept4, raw_concept_bag ) )
                  {
                    cb_document_interpretation_show_concept( concept4, count4 );
                  }
                }
              }
              if( NIL == bag.bag_emptyP( sentence_bag ) )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( THREE_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( $str374$Suggested_Sentences );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( THREE_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_unordered_list_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject iteration_state3;
                  for( iteration_state3 = dictionary_contents.do_dictionary_contents_state( bag.do_bag_repeat_internal( sentence_bag ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                      iteration_state3 ); iteration_state3 = dictionary_contents.do_dictionary_contents_next( iteration_state3 ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject sentence = dictionary_contents.do_dictionary_contents_key_value( iteration_state3 );
                    final SubLObject count5 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cb_document_interpretation_show_sentence( sentence, count5 );
                  }
                  dictionary_contents.do_dictionary_contents_finalize( iteration_state3 );
                  final SubLObject count3 = ONE_INTEGER;
                  final SubLObject set_contents_var3 = bag.do_bag_unique_internal( sentence_bag );
                  SubLObject basis_object3;
                  SubLObject state3;
                  SubLObject sentence2;
                  for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                      set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                  {
                    sentence2 = set_contents.do_set_contents_next( basis_object3, state3 );
                    if( NIL != set_contents.do_set_contents_element_validP( state3, sentence2 ) )
                    {
                      cb_document_interpretation_show_sentence( sentence2, count3 );
                    }
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$118, thread );
                }
                html_utilities.html_markup( html_macros.$html_unordered_list_tail$.getGlobalValue() );
              }
              if( NIL != justifications )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( THREE_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( $str375$Applied_Rules );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( THREE_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_unordered_list_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject cdolist_list_var = justifications;
                  SubLObject rule = NIL;
                  rule = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    cb_document_interpretation_show_rule( rule );
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$119, thread );
                }
                html_utilities.html_markup( html_macros.$html_unordered_list_tail$.getGlobalValue() );
              }
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$114, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$113, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$112, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return $kw135$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 99173L)
  public static SubLObject cb_annotate_tagged_concepts(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject previous_input_file = html_utilities.html_extract_input( $str379$previous_input_file, args );
    final SubLObject filename = ( NIL != html_utilities.html_extract_input( $str380$input_file, args ) ) ? html_utilities.html_extract_input( $str380$input_file, args ) : $str111$;
    final SubLObject next_index_from_page = reader.read_from_string( ( NIL != html_utilities.html_extract_input( $str381$next_index, args ) ) ? html_utilities.html_extract_input( $str381$next_index, args ) : $str382$0,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject next_index = filename.equal( previous_input_file ) ? next_index_from_page : ZERO_INTEGER;
    final SubLObject count = $int383$30;
    final SubLObject data = annotation_data_from_file( filename, next_index, count );
    handle_submitted_manual_annotation_data( args );
    final SubLObject title_var = $str384$Manual_Concept_Annotation;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str352$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str353$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$120 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw24$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw354$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$121 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str357$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str358$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str359$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str360$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str361$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$123, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_script_utilities.cb_hoverover_page_init();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str363$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str385$cb_annotate_tagged_concepts, T, UNPROVIDED );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_style_head$.getGlobalValue() );
              html_utilities.html_princ( concept_tagger.$doc_tagger_default_style$.getDynamicValue( thread ) );
              html_utilities.html_markup( html_macros.$html_style_tail$.getGlobalValue() );
              html_utilities.html_hidden_input( $str379$previous_input_file, filename, UNPROVIDED );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str386$Tagging_File_Name__ );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str119$text );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str380$input_file );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != filename )
              {
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( filename );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_markup( html_macros.$html_input_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int369$40 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_style_head$.getGlobalValue() );
              html_utilities.html_princ( $str387$tr__border_color__black__________ );
              html_utilities.html_markup( html_macros.$html_style_tail$.getGlobalValue() );
              if( NIL != data )
              {
                SubLObject current;
                final SubLObject datum = current = data;
                SubLObject text = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list388 );
                text = current.first();
                final SubLObject strings_and_concepts;
                current = ( strings_and_concepts = current.rest() );
                next_index = Numbers.add( next_index, Sequences.length( strings_and_concepts ) );
                html_utilities.html_hidden_input( $str381$next_index, next_index, UNPROVIDED );
                html_utilities.html_markup( $manual_document_annotation_instructions$.getDynamicValue( thread ) );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( ONE_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject cdolist_list_var = strings_and_concepts;
                  SubLObject string_and_concepts = NIL;
                  string_and_concepts = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject string_frequency = string_and_concepts.first();
                    final SubLObject string = conses_high.second( string_and_concepts );
                    final SubLObject concepts = string_and_concepts.rest().rest();
                    final SubLObject concept_count = Sequences.length( concepts );
                    SubLObject list_var = NIL;
                    SubLObject concept = NIL;
                    SubLObject concept_number = NIL;
                    list_var = concepts;
                    concept = list_var.first();
                    for( concept_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), concept = list_var.first(), concept_number = Numbers.add( ONE_INTEGER, concept_number ) )
                    {
                      final SubLObject v_class = concept_number.eql( ZERO_INTEGER ) ? $str389$first : $str390$other;
                      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                      if( NIL != v_class )
                      {
                        html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( v_class );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        if( concept_number.eql( ZERO_INTEGER ) )
                        {
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          if( NIL != concept_count )
                          {
                            html_utilities.html_markup( html_macros.$html_table_data_rowspan$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( concept_count );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str391$_S, string );
                            html_utilities.html_newline( UNPROVIDED );
                            html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
                            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str392$frequency___S__, string_frequency );
                            html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$127, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str393$30_ );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          cb_utilities.cb_form( concept, UNPROVIDED, UNPROVIDED );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$128, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str394$_CCFFCC );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_radio_input( kb_utilities.compact_hl_internal_id_string( concept ), $str395$primary, NIL, UNPROVIDED );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str396$Primary_Meaning___ );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$129, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str397$_CCFFFF );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_radio_input( kb_utilities.compact_hl_internal_id_string( concept ), $str398$contextual, NIL, UNPROVIDED );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str399$Contextually_Dependent___ );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$130, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str400$_FFCCFF );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_radio_input( kb_utilities.compact_hl_internal_id_string( concept ), $str401$very_rare, NIL, UNPROVIDED );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str402$Rare___ );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$131, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str403$_FFCCCC );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_radio_input( kb_utilities.compact_hl_internal_id_string( concept ), $str404$indecipherable, NIL, UNPROVIDED );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str405$Indecipherable__ );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$132, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str406$_FFFFCC );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_radio_input( kb_utilities.compact_hl_internal_id_string( concept ), $str407$merge_candidate, NIL, UNPROVIDED );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str408$Merge_away );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$133, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( $str409$_CCCCFF );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_radio_input( kb_utilities.compact_hl_internal_id_string( concept ), $str410$kill_candidate, NIL, UNPROVIDED );
                          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str411$Invalid );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$134, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$126, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                      html_utilities.html_source_readability_terpri( UNPROVIDED );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    string_and_concepts = cdolist_list_var.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$125, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              }
              html_utilities.html_submit_input( $str365$Submit, UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$124, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$122, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$121, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$120, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 102422L)
  public static SubLObject handle_submitted_manual_annotation_data(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject input_file = html_utilities.html_extract_input( $str380$input_file, args );
    final SubLObject output_file_name = Sequences.cconcatenate( ( NIL != input_file ) ? input_file : $str111$, $str413$_out );
    if( NIL == input_file )
    {
      return NIL;
    }
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( output_file_name, $kw112$APPEND );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, output_file_name );
      }
      final SubLObject s = stream;
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( arg.isList() && NIL != kb_utilities.compact_hl_external_id_string_p( arg.first() ) && NIL != list_utilities.lengthE( arg, TWO_INTEGER, UNPROVIDED ) )
        {
          final SubLObject v_term = kb_utilities.maybe_find_object_by_compact_hl_internal_id_string( arg.first() );
          if( NIL != v_term )
          {
            PrintLow.format( s, $str414$_A__A__A__, new SubLObject[] { kb_utilities.compact_hl_external_id_string( v_term ), conses_high.second( arg ), v_term
            } );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 103049L)
  public static SubLObject annotation_data_from_file(final SubLObject filename, final SubLObject next_index, final SubLObject desired_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == string_utilities.non_empty_string_p( filename ) || NIL == Filesys.probe_file( filename ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject read_result = NIL;
    SubLObject count = ZERO_INTEGER;
    SubLObject doneP = NIL;
    final SubLObject final_index = Numbers.subtract( Numbers.add( next_index, desired_count ), ONE_INTEGER );
    final SubLObject file_string = file_utilities.slurp_file( filename );
    for( SubLObject error = NIL; NIL == error && !read_result.equal( $kw415$EOF ) && NIL == doneP; doneP = T )
    {
      thread.resetMultipleValues();
      final SubLObject read_result_$135 = reader.read_from_string( file_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject error_$136 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      read_result = read_result_$135;
      error = error_$136;
      PrintLow.format( T, $str416$_ );
      final SubLObject context_string = read_result.first();
      final SubLObject concept_pairs = read_result.rest();
      if( count.numGE( next_index ) )
      {
        result = ConsesLow.cons( context_string, result );
      }
      if( NIL == doneP )
      {
        SubLObject csome_list_var = concept_pairs;
        SubLObject concept_pair = NIL;
        concept_pair = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          if( count.numG( final_index ) )
          {
            doneP = T;
          }
          else if( count.numGE( next_index ) )
          {
            result = ConsesLow.cons( concept_pair, result );
          }
          count = Numbers.add( count, ONE_INTEGER );
          csome_list_var = csome_list_var.rest();
          concept_pair = csome_list_var.first();
        }
      }
      if( count.numG( next_index ) )
      {
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 104121L)
  public static SubLObject get_manual_annotations(SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = $str417$_cyc_projects_sabre_data_july_200;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject file_var = filename;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file_var, $kw148$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, file_var );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$137 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$137 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$137 ) )
        {
          final SubLObject line_$138 = string_utilities.string_tokenize( line, $list418, ConsesLow.list( ConsesLow.list( $str419$_, $str419$_ ) ), NIL, NIL, ConsesLow.list( Characters.CHAR_backslash ), UNPROVIDED );
          SubLObject current;
          final SubLObject datum = current = line_$138;
          SubLObject hl_id = NIL;
          SubLObject judgment = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list420 );
          hl_id = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list420 );
          judgment = current.first();
          final SubLObject ignore;
          current = ( ignore = current.rest() );
          final SubLObject v_term = kb_utilities.maybe_find_object_by_compact_hl_internal_id_string( hl_id );
          result = ConsesLow.cons( ConsesLow.list( v_term, judgment ), result );
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 104620L)
  public static SubLObject get_manual_annotations_with_strings(SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = $str421$_cyc_projects_sabre_data_july_200;
    }
    SubLObject result = NIL;
    SubLObject intermed_result = NIL;
    SubLObject previous_strings = NIL;
    final SubLObject concept_to_strings_map = get_concept_to_strings_map_from_input_data( filename );
    final SubLObject annotated_filename = Sequences.cconcatenate( filename, $str413$_out );
    SubLObject cdolist_list_var = get_manual_annotations( annotated_filename );
    SubLObject annotation = NIL;
    annotation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = annotation;
      SubLObject v_term = NIL;
      SubLObject judgment = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list422 );
      v_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list422 );
      judgment = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != conses_high.intersection( previous_strings, dictionary.dictionary_lookup( concept_to_strings_map, v_term, UNPROVIDED ), EQUAL, UNPROVIDED ) )
        {
          previous_strings = conses_high.intersection( previous_strings, dictionary.dictionary_lookup( concept_to_strings_map, v_term, UNPROVIDED ), EQUAL, UNPROVIDED );
          intermed_result = ConsesLow.cons( annotation, intermed_result );
        }
        else if( NIL == previous_strings )
        {
          previous_strings = dictionary.dictionary_lookup( concept_to_strings_map, v_term, UNPROVIDED );
          intermed_result = ConsesLow.list( annotation );
        }
        else
        {
          SubLObject cdolist_list_var_$139 = intermed_result;
          SubLObject intermed_annotation = NIL;
          intermed_annotation = cdolist_list_var_$139.first();
          while ( NIL != cdolist_list_var_$139)
          {
            SubLObject current_$141;
            final SubLObject datum_$140 = current_$141 = intermed_annotation;
            SubLObject intermed_term = NIL;
            SubLObject intermed_judgment = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$141, datum_$140, $list423 );
            intermed_term = current_$141.first();
            current_$141 = current_$141.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$141, datum_$140, $list423 );
            intermed_judgment = current_$141.first();
            current_$141 = current_$141.rest();
            if( NIL == current_$141 )
            {
              SubLObject cdolist_list_var_$140 = previous_strings;
              SubLObject string = NIL;
              string = cdolist_list_var_$140.first();
              while ( NIL != cdolist_list_var_$140)
              {
                result = ConsesLow.cons( ConsesLow.list( intermed_term, intermed_judgment, string ), result );
                cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                string = cdolist_list_var_$140.first();
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$140, $list423 );
            }
            cdolist_list_var_$139 = cdolist_list_var_$139.rest();
            intermed_annotation = cdolist_list_var_$139.first();
          }
          previous_strings = dictionary.dictionary_lookup( concept_to_strings_map, v_term, UNPROVIDED );
          intermed_result = ConsesLow.list( annotation );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list422 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      annotation = cdolist_list_var.first();
    }
    cdolist_list_var = intermed_result;
    SubLObject intermed_annotation2 = NIL;
    intermed_annotation2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = intermed_annotation2;
      SubLObject v_term = NIL;
      SubLObject judgment = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list422 );
      v_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list422 );
      judgment = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$141 = previous_strings;
        SubLObject string2 = NIL;
        string2 = cdolist_list_var_$141.first();
        while ( NIL != cdolist_list_var_$141)
        {
          result = ConsesLow.cons( ConsesLow.list( v_term, judgment, string2 ), result );
          cdolist_list_var_$141 = cdolist_list_var_$141.rest();
          string2 = cdolist_list_var_$141.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list422 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      intermed_annotation2 = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 106220L)
  public static SubLObject get_concept_to_strings_map_from_input_data(SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = $str421$_cyc_projects_sabre_data_july_200;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file_string = file_utilities.slurp_file( filename );
    final SubLObject string_to_concepts_map = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    SubLObject read_result = NIL;
    SubLObject error = NIL;
    while ( NIL == error && !read_result.equal( $kw415$EOF ))
    {
      thread.resetMultipleValues();
      final SubLObject read_result_$144 = reader.read_from_string_ignoring_errors( file_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject error_$145 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      read_result = read_result_$144;
      error = error_$145;
      SubLObject cdolist_list_var;
      final SubLObject weight_string_concepts_tuples = cdolist_list_var = read_result.rest();
      SubLObject concept_pair = NIL;
      concept_pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject string = conses_high.second( concept_pair );
        SubLObject cdolist_list_var_$146;
        final SubLObject concepts = cdolist_list_var_$146 = conses_high.cddr( concept_pair );
        SubLObject concept = NIL;
        concept = cdolist_list_var_$146.first();
        while ( NIL != cdolist_list_var_$146)
        {
          dictionary_utilities.dictionary_push( string_to_concepts_map, concept, string );
          cdolist_list_var_$146 = cdolist_list_var_$146.rest();
          concept = cdolist_list_var_$146.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        concept_pair = cdolist_list_var.first();
      }
    }
    return string_to_concepts_map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 107043L)
  public static SubLObject get_assertions_for_concept_and_string(final SubLObject concept, final SubLObject string)
  {
    SubLObject assertions = NIL;
    SubLObject cdolist_list_var = nl_trie.nl_trie_search( string, UNPROVIDED, UNPROVIDED );
    SubLObject trie_entry = NIL;
    trie_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( concept, nl_trie.nl_trie_entry_denots( trie_entry ), UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject cdolist_list_var_$147 = nl_trie.nl_trie_entry_semantic_support_list( trie_entry );
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var_$147.first();
        while ( NIL != cdolist_list_var_$147)
        {
          if( NIL != assertion_handles.assertion_p( v_assert ) && lexicon_accessors.assertion_denotation( v_assert ).equal( concept ) )
          {
            final SubLObject item_var = v_assert;
            if( NIL == conses_high.member( item_var, assertions, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              assertions = ConsesLow.cons( item_var, assertions );
            }
          }
          cdolist_list_var_$147 = cdolist_list_var_$147.rest();
          v_assert = cdolist_list_var_$147.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      trie_entry = cdolist_list_var.first();
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 107482L)
  public static SubLObject ke_text_from_manual_annotations(SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = $str421$_cyc_projects_sabre_data_july_200;
    }
    final SubLObject annotations = get_manual_annotations_with_strings( filename );
    SubLObject result_items = NIL;
    SubLObject cdolist_list_var = annotations;
    SubLObject annotation = NIL;
    annotation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = annotation;
      SubLObject v_term = NIL;
      SubLObject judgment = NIL;
      SubLObject string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list424 );
      v_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list424 );
      judgment = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list424 );
      string = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$148 = get_assertions_for_concept_and_string( v_term, string );
        SubLObject v_assert = NIL;
        v_assert = cdolist_list_var_$148.first();
        while ( NIL != cdolist_list_var_$148)
        {
          final SubLObject assert_formula = assertions_high.assertion_ist_formula( v_assert );
          if( judgment.equal( $str395$primary ) )
          {
            final SubLObject item_var = Sequences.cconcatenate( $str425$f_____strengthOfLexicalMapping_, new SubLObject[] { format_nil.format_nil_s_no_copy( assert_formula ), $str426$___PrimaryLexicalMapping__
            } );
            if( NIL == conses_high.member( item_var, result_items, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              result_items = ConsesLow.cons( item_var, result_items );
            }
          }
          else if( judgment.equal( $str401$very_rare ) )
          {
            final SubLObject item_var = Sequences.cconcatenate( $str425$f_____strengthOfLexicalMapping_, new SubLObject[] { format_nil.format_nil_s_no_copy( assert_formula ), $str427$___VanishinglyRareLexicalMapping_
            } );
            if( NIL == conses_high.member( item_var, result_items, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              result_items = ConsesLow.cons( item_var, result_items );
            }
          }
          else if( judgment.equal( $str398$contextual ) )
          {
            final SubLObject item_var = Sequences.cconcatenate( $str425$f_____strengthOfLexicalMapping_, new SubLObject[] { format_nil.format_nil_s_no_copy( assert_formula ), $str428$___ContextuallyDependentLexicalMa
            } );
            if( NIL == conses_high.member( item_var, result_items, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              result_items = ConsesLow.cons( item_var, result_items );
            }
          }
          else if( judgment.equal( $str410$kill_candidate ) )
          {
            final SubLObject item_var = Sequences.cconcatenate( $str429$kill__, new SubLObject[] { format_nil.format_nil_s_no_copy( v_term ), $str416$_
            } );
            if( NIL == conses_high.member( item_var, result_items, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              result_items = ConsesLow.cons( item_var, result_items );
            }
          }
          cdolist_list_var_$148 = cdolist_list_var_$148.rest();
          v_assert = cdolist_list_var_$148.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list424 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      annotation = cdolist_list_var.first();
    }
    cdolist_list_var = result_items;
    SubLObject result_item = NIL;
    result_item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.princ( result_item, T );
      streams_high.terpri( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      result_item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 108731L)
  public static SubLObject output_webgame_qs(final SubLObject doc_index_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject output_files = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( doc_index_file, $kw148$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str113$Unable_to_open__S, doc_index_file );
      }
      final SubLObject stream_var = stream;
      if( stream_var.isStream() )
      {
        final SubLObject stream_var_$149 = stream_var;
        SubLObject line_number_var = NIL;
        SubLObject line = NIL;
        line_number_var = ZERO_INTEGER;
        for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$149 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$149 ) )
        {
          final SubLObject line_elts = string_utilities.string_tokenize( line, $list418, ConsesLow.list( ConsesLow.list( $str419$_, $str419$_ ) ), NIL, NIL, ConsesLow.list( Characters.CHAR_backslash ), UNPROVIDED );
          SubLObject current;
          final SubLObject datum = current = line_elts;
          SubLObject id = NIL;
          SubLObject url = NIL;
          SubLObject filedir = NIL;
          SubLObject time_stamp = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
          id = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
          url = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
          filedir = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list430 );
          time_stamp = current.first();
          current = current.rest();
          if( NIL == current )
          {
            Errors.warn( $str431$input_file_line___S__, line_elts );
            final SubLObject filename = Sequences.cconcatenate( filedir, time_stamp );
            final SubLObject output_file = Sequences.cconcatenate( filename, $str413$_out );
            final SubLObject file_string = file_utilities.slurp_file( filename );
            final SubLObject plain_doc = new_tagged_document( file_string, concept_tagger.get_browser_tagging_lexicon( NIL, $list432, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            final SubLObject disambiguated_doc = rule_disambiguation.rdis_disambiguate( rule_disambiguation.new_rule_disambiguator( UNPROVIDED, UNPROVIDED ), plain_doc, UNPROVIDED );
            SubLObject stream_$150 = NIL;
            try
            {
              final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding( thread );
              try
              {
                stream_macros.$stream_requires_locking$.bind( NIL, thread );
                stream_$150 = compatibility.open_text( output_file, $kw144$OUTPUT );
              }
              finally
              {
                stream_macros.$stream_requires_locking$.rebind( _prev_bind_2, thread );
              }
              if( !stream_$150.isStream() )
              {
                Errors.error( $str113$Unable_to_open__S, output_file );
              }
              final SubLObject s = stream_$150;
              final SubLObject vector_var = document.document_paragraphs( disambiguated_doc );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject element_num;
              SubLObject paragraph;
              SubLObject vector_var_$151;
              SubLObject backwardP_var_$152;
              SubLObject length_$153;
              SubLObject v_iteration_$154;
              SubLObject element_num_$155;
              SubLObject sent;
              SubLObject cdolist_list_var;
              SubLObject word;
              SubLObject cdolist_list_var_$156;
              SubLObject cycl;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                paragraph = Vectors.aref( vector_var, element_num );
                vector_var_$151 = document.paragraph_sentences( paragraph );
                backwardP_var_$152 = NIL;
                for( length_$153 = Sequences.length( vector_var_$151 ), v_iteration_$154 = NIL, v_iteration_$154 = ZERO_INTEGER; v_iteration_$154.numL( length_$153 ); v_iteration_$154 = Numbers.add( v_iteration_$154,
                    ONE_INTEGER ) )
                {
                  element_num_$155 = ( ( NIL != backwardP_var_$152 ) ? Numbers.subtract( length_$153, v_iteration_$154, ONE_INTEGER ) : v_iteration_$154 );
                  sent = Vectors.aref( vector_var_$151, element_num_$155 );
                  cdolist_list_var = document.sentence_yield_exhaustive( sent );
                  word = NIL;
                  word = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    cdolist_list_var_$156 = document.word_cycls( word );
                    cycl = NIL;
                    cycl = cdolist_list_var_$156.first();
                    while ( NIL != cdolist_list_var_$156)
                    {
                      PrintLow.format( s, $str433$__S__S__S___, new SubLObject[] { document.word_string( word ), cycl, document.sentence_string( sent )
                      } );
                      cdolist_list_var_$156 = cdolist_list_var_$156.rest();
                      cycl = cdolist_list_var_$156.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( stream_$150.isStream() )
                {
                  streams_high.close( stream_$150, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
              }
            }
            output_files = ConsesLow.cons( output_file, output_files );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list430 );
          }
          line_number_var = number_utilities.f_1X( line_number_var );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return output_files;
  }

  public static SubLObject declare_document_annotation_widgets_file()
  {
    SubLFiles.declareMacro( me, "trace_doc_search", "TRACE-DOC-SEARCH" );
    SubLFiles.declareFunction( me, "get_text_index", "GET-TEXT-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "get_semantic_index", "GET-SEMANTIC-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "semantic_index_initializedP", "SEMANTIC-INDEX-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "use_daves_temp_indexes", "USE-DAVES-TEMP-INDEXES", 0, 0, false );
    SubLFiles.declareFunction( me, "use_development_indexes", "USE-DEVELOPMENT-INDEXES", 0, 0, false );
    SubLFiles.declareFunction( me, "use_development_disambiguated_indexes", "USE-DEVELOPMENT-DISAMBIGUATED-INDEXES", 0, 0, false );
    SubLFiles.declareFunction( me, "use_hezbollah_indexes", "USE-HEZBOLLAH-INDEXES", 0, 0, false );
    SubLFiles.declareFunction( me, "new_closure_justification", "NEW-CLOSURE-JUSTIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "get_closure_justification_gaf", "GET-CLOSURE-JUSTIFICATION-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "get_closure_justification_spec", "GET-CLOSURE-JUSTIFICATION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "get_closure_justification_genl", "GET-CLOSURE-JUSTIFICATION-GENL", 1, 0, false );
    SubLFiles.declareFunction( me, "closure_justification_predicate", "CLOSURE-JUSTIFICATION-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "closure_justification_pred_id", "CLOSURE-JUSTIFICATION-PRED-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "substitute_template", "SUBSTITUTE-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "predicate_template", "PREDICATE-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_justifications", "MAKE-JUSTIFICATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "doc_annotation_irrelevant_term", "DOC-ANNOTATION-IRRELEVANT-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_object_from_id", "CLEAR-TERM-LEARNER-OBJECT-FROM-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_object_from_id", "REMOVE-TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_object_from_id_internal", "TERM-LEARNER-OBJECT-FROM-ID-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_object_from_id", "TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_term_learner_object_from_id", "MAYBE-TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_learner_id_for_cycl_string", "GET-TERM-LEARNER-ID-FOR-CYCL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_term_learner_id", "CLEAR-TERM-LEARNER-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_term_learner_id", "REMOVE-TERM-LEARNER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_id_internal", "TERM-LEARNER-ID-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "term_learner_id", "TERM-LEARNER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_upwards_closure_justifications_internal", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_upwards_closure_justifications", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_upwards_closure", "GET-UPWARDS-CLOSURE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_upwards_closure_justifications_cached", "CLEAR-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_upwards_closure_justifications_cached", "REMOVE-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_upwards_closure_justifications_cached_internal", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_upwards_closure_justifications_cached", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "caching_upwards_closure_justificationsP", "CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?", 0, 0, false );
    SubLFiles.declareFunction( me, "cache_upwards_closure_justifications", "CACHE-UPWARDS-CLOSURE-JUSTIFICATIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "cache_upwards_closure_justification", "CACHE-UPWARDS-CLOSURE-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "treatment_for_somethingP", "TREATMENT-FOR-SOMETHING?", 1, 0, false );
    SubLFiles.declareFunction( me, "ailmentP", "AILMENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "agentP", "AGENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_treated_condition", "CLEAR-GET-TREATED-CONDITION", 0, 0, false );
    new $clear_get_treated_condition$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_get_treated_condition", "REMOVE-GET-TREATED-CONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_treated_condition_internal", "GET-TREATED-CONDITION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_treated_condition", "GET-TREATED-CONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_treatments_for_condition", "CLEAR-GET-TREATMENTS-FOR-CONDITION", 0, 0, false );
    new $clear_get_treatments_for_condition$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_get_treatments_for_condition", "REMOVE-GET-TREATMENTS-FOR-CONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_treatments_for_condition_internal", "GET-TREATMENTS-FOR-CONDITION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_treatments_for_condition", "GET-TREATMENTS-FOR-CONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_affected_parts", "CLEAR-GET-AFFECTED-PARTS", 0, 0, false );
    new $clear_get_affected_parts$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_get_affected_parts", "REMOVE-GET-AFFECTED-PARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_affected_parts_internal", "GET-AFFECTED-PARTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_affected_parts", "GET-AFFECTED-PARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_cooccurring_conditions", "CLEAR-GET-COOCCURRING-CONDITIONS", 0, 0, false );
    new $clear_get_cooccurring_conditions$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_get_cooccurring_conditions", "REMOVE-GET-COOCCURRING-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cooccurring_conditions_internal", "GET-COOCCURRING-CONDITIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cooccurring_conditions", "GET-COOCCURRING-CONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_groups", "GET-GROUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_groups_non_cached", "GET-GROUPS-NON-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_leaders_to_groups", "CLEAR-LEADERS-TO-GROUPS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_leaders_to_groups", "REMOVE-LEADERS-TO-GROUPS", 0, 0, false );
    SubLFiles.declareFunction( me, "leaders_to_groups_internal", "LEADERS-TO-GROUPS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "leaders_to_groups", "LEADERS-TO-GROUPS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_city_regions", "GET-CITY-REGIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_city_countries", "GET-CITY-COUNTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cities_to_countries", "CLEAR-CITIES-TO-COUNTRIES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cities_to_countries", "REMOVE-CITIES-TO-COUNTRIES", 0, 0, false );
    SubLFiles.declareFunction( me, "cities_to_countries_internal", "CITIES-TO-COUNTRIES-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cities_to_countries", "CITIES-TO-COUNTRIES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_city_countries_non_cached", "GET-CITY-COUNTRIES-NON-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_country_regions", "GET-COUNTRY-REGIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_country_regions_non_cached", "GET-COUNTRY-REGIONS-NON-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_countries_to_regions", "CLEAR-COUNTRIES-TO-REGIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_countries_to_regions", "REMOVE-COUNTRIES-TO-REGIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "countries_to_regions_internal", "COUNTRIES-TO-REGIONS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "countries_to_regions", "COUNTRIES-TO-REGIONS", 0, 0, false );
    SubLFiles.declareMacro( me, "with_dual_lucene_sessions", "WITH-DUAL-LUCENE-SESSIONS" );
    SubLFiles.declareFunction( me, "add_fully_indexed_documents_from_dir", "ADD-FULLY-INDEXED-DOCUMENTS-FROM-DIR", 6, 0, false );
    SubLFiles.declareFunction( me, "add_fully_indexed_documents", "ADD-FULLY-INDEXED-DOCUMENTS", 6, 0, false );
    SubLFiles.declareFunction( me, "tag_xml_documents_with_urls", "TAG-XML-DOCUMENTS-WITH-URLS", 1, 2, false );
    SubLFiles.declareFunction( me, "tag_xml_document_filespec", "TAG-XML-DOCUMENT-FILESPEC", 3, 1, false );
    SubLFiles.declareFunction( me, "read_original_doc", "READ-ORIGINAL-DOC", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_xml_doc_set_with_urls", "TAG-XML-DOC-SET-WITH-URLS", 1, 2, false );
    SubLFiles.declareFunction( me, "index_xml_doc_set_from_map_file", "INDEX-XML-DOC-SET-FROM-MAP-FILE", 2, 4, false );
    SubLFiles.declareFunction( me, "index_pre_tagged_xml_docs", "INDEX-PRE-TAGGED-XML-DOCS", 6, 0, false );
    SubLFiles.declareFunction( me, "index_pre_tagged_xml_doc", "INDEX-PRE-TAGGED-XML-DOC", 4, 0, false );
    SubLFiles.declareFunction( me, "lucene_add_document_semantic", "LUCENE-ADD-DOCUMENT-SEMANTIC", 6, 0, false );
    SubLFiles.declareFunction( me, "lucene_add_document_keyword", "LUCENE-ADD-DOCUMENT-KEYWORD", 4, 0, false );
    SubLFiles.declareFunction( me, "add_fully_indexed_document", "ADD-FULLY-INDEXED-DOCUMENT", 5, 0, false );
    SubLFiles.declareFunction( me, "print_offset_info", "PRINT-OFFSET-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "print_term_and_reln", "PRINT-TERM-AND-RELN", 3, 0, false );
    SubLFiles.declareFunction( me, "print_token", "PRINT-TOKEN", 4, 0, false );
    SubLFiles.declareFunction( me, "new_tagged_document", "NEW-TAGGED-DOCUMENT", 1, 4, false );
    SubLFiles.declareFunction( me, "find_concepts_for_document_segments", "FIND-CONCEPTS-FOR-DOCUMENT-SEGMENTS", 1, 3, false );
    SubLFiles.declareFunction( me, "tag_document_nodes_for_display", "TAG-DOCUMENT-NODES-FOR-DISPLAY", 1, 4, false );
    SubLFiles.declareFunction( me, "get_doc_string_from_node_ids_and_strings", "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_output_lists_for_word", "GET-OUTPUT-LISTS-FOR-WORD", 2, 1, false );
    SubLFiles.declareFunction( me, "node_and_node_offset", "NODE-AND-NODE-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "new_named_entity_wordP", "NEW-NAMED-ENTITY-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_has_non_derived_assertionsP", "NART-HAS-NON-DERIVED-ASSERTIONS?", 1, 0, false );
    SubLFiles.declareFunction( me, "find_interps_for_document_segments", "FIND-INTERPS-FOR-DOCUMENT-SEGMENTS", 1, 3, false );
    SubLFiles.declareFunction( me, "get_default_medical_tagging_lexicon", "GET-DEFAULT-MEDICAL-TAGGING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_default_medical_tagging_lexicon", "CLEAR-DEFAULT-MEDICAL-TAGGING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "augment_medical_html_file_with_cyc_terms", "AUGMENT-MEDICAL-HTML-FILE-WITH-CYC-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "augment_html_document_with_cyc_terms", "AUGMENT-HTML-DOCUMENT-WITH-CYC-TERMS", 1, 1, false );
    SubLFiles.declareFunction( me, "doc_tagger_rdf_name", "DOC-TAGGER-RDF-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "doc_tagger_rdf_id", "DOC-TAGGER-RDF-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "mapping_first_elt_info", "MAPPING-FIRST-ELT-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "get_text_string_from_tokens", "GET-TEXT-STRING-FROM-TOKENS", 1, 1, false );
    SubLFiles.declareFunction( me, "tag_document_for_indexing_with_offsets", "TAG-DOCUMENT-FOR-INDEXING-WITH-OFFSETS", 1, 3, false );
    SubLFiles.declareFunction( me, "document_annotation_relation_from_id", "DOCUMENT-ANNOTATION-RELATION-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_retrieval_justification", "GENERATE-RETRIEVAL-JUSTIFICATION", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_retrieval_justification_from_justification_string", "GENERATE-RETRIEVAL-JUSTIFICATION-FROM-JUSTIFICATION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_best_justifications_from_arg_list", "GET-BEST-JUSTIFICATIONS-FROM-ARG-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "better_justification_pred", "BETTER-JUSTIFICATION-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_term_explanation", "GENERATE-TERM-EXPLANATION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_other_explanatory_strings_for_term", "GET-OTHER-EXPLANATORY-STRINGS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_document_annotation_term_id", "CLEAR-DOCUMENT-ANNOTATION-TERM-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_document_annotation_term_id", "REMOVE-DOCUMENT-ANNOTATION-TERM-ID", 1, 1, false );
    SubLFiles.declareFunction( me, "document_annotation_term_id_internal", "DOCUMENT-ANNOTATION-TERM-ID-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "document_annotation_term_id", "DOCUMENT-ANNOTATION-TERM-ID", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_document_annotation_term_from_id", "CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_document_annotation_term_from_id", "REMOVE-DOCUMENT-ANNOTATION-TERM-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "document_annotation_term_from_id_internal", "DOCUMENT-ANNOTATION-TERM-FROM-ID-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "document_annotation_term_from_id", "DOCUMENT-ANNOTATION-TERM-FROM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_cached_term_id", "GET-CACHED-TERM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_term_from_cached_id", "GET-TERM-FROM-CACHED-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_document_ingester_annotation_learning_lexicon", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICON", 0, 3, false );
    SubLFiles.declareFunction( me, "clear_default_document_ingester_annotation_learning_lexicon", "CLEAR-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_get_default_document_ingester_annotation_lexicon", "CLEAR-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_default_document_ingester_annotation_lexicon", "REMOVE-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "get_default_document_ingester_annotation_lexicon_internal", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_document_ingester_annotation_lexicon", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_default_document_ingester_annotation_lexicon_for_mt", "CLEAR-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-FOR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_document_annotation_learning_lexicon", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_default_document_annotation_learning_lexicon", "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_default_document_annotation_lexicon", "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_get_default_document_annotation_lexicon", "CLEAR-GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_default_document_annotation_lexicon", "REMOVE-GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "get_default_document_annotation_lexicon_internal", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_document_annotation_lexicon", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "make_default_document_annotation_lexicon", "MAKE-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "get_default_document_annotation_rule_disambiguator", "GET-DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_doc_annotator_term_id_fbc", "MAYBE-INITIALIZE-DOC-ANNOTATOR-TERM-ID-FBC", 0, 1, false );
    SubLFiles.declareFunction( me, "maybe_initialize_doc_annotator_id_term_fbc", "MAYBE-INITIALIZE-DOC-ANNOTATOR-ID-TERM-FBC", 0, 1, false );
    SubLFiles.declareFunction( me, "rebuild_doc_annotator_term_id_fbc", "REBUILD-DOC-ANNOTATOR-TERM-ID-FBC", 0, 2, false );
    SubLFiles.declareFunction( me, "build_id_to_term_fbc", "BUILD-ID-TO-TERM-FBC", 0, 2, false );
    SubLFiles.declareFunction( me, "augment_doc_annotator_term_fht", "AUGMENT-DOC-ANNOTATOR-TERM-FHT", 0, 1, false );
    SubLFiles.declareFunction( me, "document_query", "DOCUMENT-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lucene_text_query", "LUCENE-TEXT-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "lucene_sem_query_with_sem_search_string", "LUCENE-SEM-QUERY-WITH-SEM-SEARCH-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "lucene_sem_query", "LUCENE-SEM-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "lucene_double_query", "LUCENE-DOUBLE-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_semantic_search_token", "CYC-SEMANTIC-SEARCH-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "terms_for_cyc_semantic_query", "TERMS-FOR-CYC-SEMANTIC-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_cdar", "REMOVE-CDAR", 1, 0, false );
    SubLFiles.declareFunction( me, "stopword_in_sem_queryP", "STOPWORD-IN-SEM-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_word_for_semantic_query", "ENCODE-WORD-FOR-SEMANTIC-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "terms_for_focused_cyc_semantic_query", "TERMS-FOR-FOCUSED-CYC-SEMANTIC-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_terms_for_cyc_semantic_query", "SIMPLE-TERMS-FOR-CYC-SEMANTIC-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_compiled_regexp", "GET-COMPILED-REGEXP", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_semantic_search_hits", "CLEAN-SEMANTIC-SEARCH-HITS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_lexified_forts", "DO-LEXIFIED-FORTS" );
    SubLFiles.declareFunction( me, "simple_document_tagging_results", "SIMPLE-DOCUMENT-TAGGING-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "show_document_tagging_results", "SHOW-DOCUMENT-TAGGING-RESULTS", 1, 1, false );
    SubLFiles.declareFunction( me, "document_tagging_results_for_human_review", "DOCUMENT-TAGGING-RESULTS-FOR-HUMAN-REVIEW", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_pictures_regexp_test", "REMOVE-PICTURES-REGEXP-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_doc_string_from_node_ids_and_strings_values", "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_interpretation_rules_for_mt", "GET-INTERPRETATION-RULES-FOR-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "tag_document_for_interpretation", "TAG-DOCUMENT-FOR-INTERPRETATION", 1, 1, false );
    SubLFiles.declareFunction( me, "get_concept_bag_from_document", "GET-CONCEPT-BAG-FROM-DOCUMENT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_interpretation_rules", "DO-INTERPRETATION-RULES" );
    SubLFiles.declareFunction( me, "interpret_document_via_suggestions", "INTERPRET-DOCUMENT-VIA-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "suggest_interpretations", "SUGGEST-INTERPRETATIONS", 1, 2, false );
    SubLFiles.declareFunction( me, "interpretation_rule_appliesP", "INTERPRETATION-RULE-APPLIES?", 3, 0, false );
    SubLFiles.declareFunction( me, "update_interpretation_with_rule", "UPDATE-INTERPRETATION-WITH-RULE", 4, 0, false );
    SubLFiles.declareFunction( me, "initialize_interpretation_rules", "INITIALIZE-INTERPRETATION-RULES", 0, 1, false );
    SubLFiles.declareFunction( me, "add_interpretation_rule", "ADD-INTERPRETATION-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "add_interpretation_rule_clauses", "ADD-INTERPRETATION-RULE-CLAUSES", 3, 0, false );
    SubLFiles.declareFunction( me, "interpretation_rules_count", "INTERPRETATION-RULES-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_interpretation_rules", "CLEAR-INTERPRETATION-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "store_interpretation_rule", "STORE-INTERPRETATION-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_interpretation_rule_description", "MAKE-INTERPRETATION-RULE-DESCRIPTION", 4, 0, false );
    SubLFiles.declareFunction( me, "interpretation_rule_description_antecedent", "INTERPRETATION-RULE-DESCRIPTION-ANTECEDENT", 1, 0, false );
    SubLFiles.declareFunction( me, "interpretation_rule_description_consequent", "INTERPRETATION-RULE-DESCRIPTION-CONSEQUENT", 1, 0, false );
    SubLFiles.declareFunction( me, "interpretation_rule_description_preconditions", "INTERPRETATION-RULE-DESCRIPTION-PRECONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "interpretation_rule_description_suggestions", "INTERPRETATION-RULE-DESCRIPTION-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_interpretation_rule_preconditions", "EXTRACT-INTERPRETATION-RULE-PRECONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_interpretation_rule_suggestions", "EXTRACT-INTERPRETATION-RULE-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_interpretation_rule_precondition", "EXTRACT-INTERPRETATION-RULE-PRECONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_interpretation_rule_suggestion", "EXTRACT-INTERPRETATION-RULE-SUGGESTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_document_interpretation_show_concept", "CB-DOCUMENT-INTERPRETATION-SHOW-CONCEPT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_document_interpretation_show_sentence", "CB-DOCUMENT-INTERPRETATION-SHOW-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_document_interpretation_show_rule", "CB-DOCUMENT-INTERPRETATION-SHOW-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_document_interpretation_suggestions", "CB-DOCUMENT-INTERPRETATION-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_annotate_tagged_concepts", "CB-ANNOTATE-TAGGED-CONCEPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_submitted_manual_annotation_data", "HANDLE-SUBMITTED-MANUAL-ANNOTATION-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "annotation_data_from_file", "ANNOTATION-DATA-FROM-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "get_manual_annotations", "GET-MANUAL-ANNOTATIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "get_manual_annotations_with_strings", "GET-MANUAL-ANNOTATIONS-WITH-STRINGS", 0, 1, false );
    SubLFiles.declareFunction( me, "get_concept_to_strings_map_from_input_data", "GET-CONCEPT-TO-STRINGS-MAP-FROM-INPUT-DATA", 0, 1, false );
    SubLFiles.declareFunction( me, "get_assertions_for_concept_and_string", "GET-ASSERTIONS-FOR-CONCEPT-AND-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "ke_text_from_manual_annotations", "KE-TEXT-FROM-MANUAL-ANNOTATIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "output_webgame_qs", "OUTPUT-WEBGAME-QS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_document_annotation_widgets_file()
  {
    $text_index$ = SubLFiles.defparameter( "*TEXT-INDEX*", $str0$_host_george_super_index_hezbolla );
    $semantic_index$ = SubLFiles.defparameter( "*SEMANTIC-INDEX*", $str1$_host_george_super_index_hezbolla );
    $text_index_override$ = SubLFiles.defparameter( "*TEXT-INDEX-OVERRIDE*", NIL );
    $semantic_index_override$ = SubLFiles.defparameter( "*SEMANTIC-INDEX-OVERRIDE*", NIL );
    $trace_doc_search_interface$ = SubLFiles.defparameter( "*TRACE-DOC-SEARCH-INTERFACE*", NIL );
    $doc_search_trace_log_file$ = SubLFiles.defparameter( "*DOC-SEARCH-TRACE-LOG-FILE*", NIL );
    $predicate_id_table$ = SubLFiles.defparameter( "*PREDICATE-ID-TABLE*", $list21 );
    $predicate_template_table$ = SubLFiles.defparameter( "*PREDICATE-TEMPLATE-TABLE*", $list22 );
    $upwards_closure_justification_fbc$ = SubLFiles.defparameter( "*UPWARDS-CLOSURE-JUSTIFICATION-FBC*", NIL );
    $upwards_closure_justification_fht_path$ = SubLFiles.defparameter( "*UPWARDS-CLOSURE-JUSTIFICATION-FHT-PATH*", $str23$data_doc_tagging_upwards_closure_ );
    $doc_annotation_thcl_verboseP$ = SubLFiles.defparameter( "*DOC-ANNOTATION-THCL-VERBOSE?*", NIL );
    $term_learner_object_from_id_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-OBJECT-FROM-ID-CACHING-STATE*", NIL );
    $term_learner_id_caching_state$ = SubLFiles.deflexical( "*TERM-LEARNER-ID-CACHING-STATE*", NIL );
    $upwards_closure_query_mt$ = SubLFiles.defparameter( "*UPWARDS-CLOSURE-QUERY-MT*", $list39 );
    $get_upwards_closure_justifications_cached_caching_state$ = SubLFiles.deflexical( "*GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-CACHING-STATE*", NIL );
    $caching_upwards_closure_justificationsP$ = SubLFiles.defparameter( "*CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?*", NIL );
    $get_treated_condition_caching_state$ = SubLFiles.deflexical( "*GET-TREATED-CONDITION-CACHING-STATE*", NIL );
    $get_treatments_for_condition_caching_state$ = SubLFiles.deflexical( "*GET-TREATMENTS-FOR-CONDITION-CACHING-STATE*", NIL );
    $get_affected_parts_caching_state$ = SubLFiles.deflexical( "*GET-AFFECTED-PARTS-CACHING-STATE*", NIL );
    $get_cooccurring_conditions_caching_state$ = SubLFiles.deflexical( "*GET-COOCCURRING-CONDITIONS-CACHING-STATE*", NIL );
    $leaders_to_groups_caching_state$ = SubLFiles.deflexical( "*LEADERS-TO-GROUPS-CACHING-STATE*", NIL );
    $cities_to_countries_caching_state$ = SubLFiles.deflexical( "*CITIES-TO-COUNTRIES-CACHING-STATE*", NIL );
    $countries_to_regions_caching_state$ = SubLFiles.deflexical( "*COUNTRIES-TO-REGIONS-CACHING-STATE*", NIL );
    $tagged_xml_doc_directory$ = SubLFiles.defparameter( "*TAGGED-XML-DOC-DIRECTORY*", $str115$_host_george_scratch_tagged_xml_d );
    $tagged_doc_title_name$ = SubLFiles.defconstant( "*TAGGED-DOC-TITLE-NAME*", $str116$title );
    $tagged_doc_title_token$ = SubLFiles.defconstant( "*TAGGED-DOC-TITLE-TOKEN*", $str117$_title_ );
    $tagged_doc_title_close_token$ = SubLFiles.defconstant( "*TAGGED-DOC-TITLE-CLOSE-TOKEN*", $str118$__title_ );
    $tagged_doc_text_name$ = SubLFiles.defconstant( "*TAGGED-DOC-TEXT-NAME*", $str119$text );
    $tagged_doc_text_token$ = SubLFiles.defconstant( "*TAGGED-DOC-TEXT-TOKEN*", $str120$_text_ );
    $tagged_doc_text_close_token$ = SubLFiles.defconstant( "*TAGGED-DOC-TEXT-CLOSE-TOKEN*", $str121$__text_ );
    $tagged_doc_keystring_name$ = SubLFiles.defconstant( "*TAGGED-DOC-KEYSTRING-NAME*", $str122$keystring );
    $tagged_doc_keystring_token$ = SubLFiles.defconstant( "*TAGGED-DOC-KEYSTRING-TOKEN*", $str123$_keystring_ );
    $tagged_doc_confirmed_concepts_keystring_token$ = SubLFiles.defconstant( "*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-TOKEN*", $str124$_confirmed_concept_keystring_ );
    $tagged_doc_confirmed_concepts_keystring_name$ = SubLFiles.defconstant( "*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-NAME*", $str124$_confirmed_concept_keystring_ );
    $tagged_doc_original_filename_name$ = SubLFiles.defconstant( "*TAGGED-DOC-ORIGINAL-FILENAME-NAME*", $str125$original_filename );
    $tagged_doc_original_filename_token$ = SubLFiles.defconstant( "*TAGGED-DOC-ORIGINAL-FILENAME-TOKEN*", $str126$_original_filename_ );
    $tagged_doc_url_name$ = SubLFiles.defconstant( "*TAGGED-DOC-URL-NAME*", $str127$url );
    $tagged_doc_url_token$ = SubLFiles.defconstant( "*TAGGED-DOC-URL-TOKEN*", $str128$_url_ );
    $tagged_doc_url_close_token$ = SubLFiles.defconstant( "*TAGGED-DOC-URL-CLOSE-TOKEN*", $str129$__url_ );
    $tagged_doc_parent_filename_name$ = SubLFiles.defconstant( "*TAGGED-DOC-PARENT-FILENAME-NAME*", $str130$parent_filename );
    $tagged_doc_parent_filename_token$ = SubLFiles.defconstant( "*TAGGED-DOC-PARENT-FILENAME-TOKEN*", $str131$_parent_filename_ );
    $semantic_index_dir_name$ = SubLFiles.defparameter( "*SEMANTIC-INDEX-DIR-NAME*", $str132$sem );
    $text_index_dir_name$ = SubLFiles.defparameter( "*TEXT-INDEX-DIR-NAME*", $str119$text );
    $annotated_document_format$ = SubLFiles.defparameter( "*ANNOTATED-DOCUMENT-FORMAT*", $kw158$SIMPLE );
    $term_learner_keep_concepts_distinct$ = SubLFiles.defparameter( "*TERM-LEARNER-KEEP-CONCEPTS-DISTINCT*", T );
    $default_medical_tagging_lexicon$ = SubLFiles.defparameter( "*DEFAULT-MEDICAL-TAGGING-LEXICON*", NIL );
    $doc_annotation_use_hl_ids$ = SubLFiles.defparameter( "*DOC-ANNOTATION-USE-HL-IDS*", NIL );
    $doc_annotator_term_id_fbc_path$ = SubLFiles.defparameter( "*DOC-ANNOTATOR-TERM-ID-FBC-PATH*", $str199$data_doc_tagging_term_id_fht );
    $doc_annotator_id_term_fbc_path$ = SubLFiles.defparameter( "*DOC-ANNOTATOR-ID-TERM-FBC-PATH*", $str200$data_doc_tagging_id_term_fht );
    $doc_annotator_term_id_fbc$ = SubLFiles.defparameter( "*DOC-ANNOTATOR-TERM-ID-FBC*", NIL );
    $doc_annotator_id_term_fbc$ = SubLFiles.defparameter( "*DOC-ANNOTATOR-ID-TERM-FBC*", NIL );
    $document_annotation_term_id_caching_state$ = SubLFiles.deflexical( "*DOCUMENT-ANNOTATION-TERM-ID-CACHING-STATE*", NIL );
    $document_annotation_term_from_id_caching_state$ = SubLFiles.deflexical( "*DOCUMENT-ANNOTATION-TERM-FROM-ID-CACHING-STATE*", NIL );
    $default_document_ingester_annotation_learning_lexicons$ = SubLFiles.defparameter( "*DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICONS*", dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    $get_default_document_ingester_annotation_lexicon_caching_state$ = SubLFiles.deflexical( "*GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-CACHING-STATE*", NIL );
    $default_document_annotation_learning_lexicon$ = SubLFiles.defparameter( "*DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON*", NIL );
    $default_document_annotation_lexicon$ = SubLFiles.defparameter( "*DEFAULT-DOCUMENT-ANNOTATION-LEXICON*", NIL );
    $get_default_document_annotation_lexicon_caching_state$ = SubLFiles.deflexical( "*GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-CACHING-STATE*", NIL );
    $default_document_annotation_rule_disambiguator$ = SubLFiles.defparameter( "*DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR*", NIL );
    $remove_pictures_regexp$ = SubLFiles.defparameter( "*REMOVE-PICTURES-REGEXP*", $str292$_____a_z0_9A_Z_________ );
    $remove_hyphens_regexp$ = SubLFiles.defparameter( "*REMOVE-HYPHENS-REGEXP*", $str293$__ );
    $remove_underscores_regexp$ = SubLFiles.defparameter( "*REMOVE-UNDERSCORES-REGEXP*", $str294$__ );
    $remove_equals_regexp$ = SubLFiles.defparameter( "*REMOVE-EQUALS-REGEXP*", $str295$__ );
    $remove_dots_regexp$ = SubLFiles.defparameter( "*REMOVE-DOTS-REGEXP*", $str296$_____________ );
    $remove_unicode_regexp$ = SubLFiles.defparameter( "*REMOVE-UNICODE-REGEXP*", $str297$__0_9a_fA_F___ );
    $cached_regexps$ = SubLFiles.defparameter( "*CACHED-REGEXPS*", NIL );
    $document_interpretation_rules_by_mt$ = SubLFiles.deflexical( "*DOCUMENT-INTERPRETATION-RULES-BY-MT*", maybeDefault( $sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_, $document_interpretation_rules_by_mt$,
        () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $document_interpretation_default_elmt$ = SubLFiles.defparameter( "*DOCUMENT-INTERPRETATION-DEFAULT-ELMT*", $const328$PiracyReportInterpretationMt );
    $manual_document_annotation_instructions$ = SubLFiles.defparameter( "*MANUAL-DOCUMENT-ANNOTATION-INSTRUCTIONS*", $str378$For_each_string____concept_mappin );
    return NIL;
  }

  public static SubLObject setup_document_annotation_widgets_file()
  {
    $text_index_override$.setDynamicValue( $str2$_cyc_projects_ccf_document_search );
    $semantic_index_override$.setDynamicValue( $str3$_cyc_projects_ccf_document_search );
    $text_index_override$.setDynamicValue( $str4$_host_achernar_daves_ccf_lucene_t );
    $semantic_index_override$.setDynamicValue( $str5$_host_achernar_daves_ccf_lucene_s );
    $semantic_index_override$.setDynamicValue( $str6$_cyc_projects_ccf_document_search );
    $text_index_override$.setDynamicValue( $str7$_cyc_projects_ccf_document_search );
    memoization_state.note_globally_cached_function( $sym33$TERM_LEARNER_OBJECT_FROM_ID );
    memoization_state.note_globally_cached_function( $sym37$TERM_LEARNER_ID );
    memoization_state.note_memoized_function( $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS );
    memoization_state.note_globally_cached_function( $sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED );
    memoization_state.note_globally_cached_function( $sym58$GET_TREATED_CONDITION );
    memoization_state.note_globally_cached_function( $sym66$GET_TREATMENTS_FOR_CONDITION );
    memoization_state.note_globally_cached_function( $sym69$GET_AFFECTED_PARTS );
    memoization_state.note_globally_cached_function( $sym72$GET_COOCCURRING_CONDITIONS );
    memoization_state.note_globally_cached_function( $sym77$LEADERS_TO_GROUPS );
    memoization_state.note_globally_cached_function( $sym82$CITIES_TO_COUNTRIES );
    memoization_state.note_globally_cached_function( $sym95$COUNTRIES_TO_REGIONS );
    access_macros.register_external_symbol( $sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS );
    access_macros.register_external_symbol( $sym168$TAG_DOCUMENT_NODES_FOR_DISPLAY );
    access_macros.register_external_symbol( $sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS );
    access_macros.register_external_symbol( $sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING );
    access_macros.register_external_symbol( $sym208$GENERATE_TERM_EXPLANATION );
    memoization_state.note_globally_cached_function( $sym226$DOCUMENT_ANNOTATION_TERM_ID );
    memoization_state.note_globally_cached_function( $sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID );
    memoization_state.note_globally_cached_function( $sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON );
    memoization_state.note_globally_cached_function( $sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON );
    access_macros.register_external_symbol( $sym290$TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY );
    generic_testing.define_test_case_table_int( $sym317$REMOVE_PICTURES_REGEXP_TEST, ConsesLow.list( new SubLObject[] { $kw318$TEST, NIL, $kw319$OWNER, NIL, $kw320$CLASSES, NIL, $kw321$KB, $kw322$TINY, $kw323$WORKING_, T
    } ), $list324 );
    generic_testing.define_test_case_table_int( $sym325$GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES, ConsesLow.list( new SubLObject[] { $kw318$TEST, NIL, $kw319$OWNER, NIL, $kw320$CLASSES, NIL, $kw321$KB,
      $kw322$TINY, $kw323$WORKING_, T
    } ), $list326 );
    subl_macro_promotions.declare_defglobal( $sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_ );
    html_macros.note_cgi_handler_function( $sym376$CB_DOCUMENT_INTERPRETATION_SUGGESTIONS, $kw377$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym412$CB_ANNOTATE_TAGGED_CONCEPTS, $kw377$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_document_annotation_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_document_annotation_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_document_annotation_widgets_file();
  }
  static
  {
    me = new document_annotation_widgets();
    $text_index$ = null;
    $semantic_index$ = null;
    $text_index_override$ = null;
    $semantic_index_override$ = null;
    $trace_doc_search_interface$ = null;
    $doc_search_trace_log_file$ = null;
    $predicate_id_table$ = null;
    $predicate_template_table$ = null;
    $upwards_closure_justification_fbc$ = null;
    $upwards_closure_justification_fht_path$ = null;
    $doc_annotation_thcl_verboseP$ = null;
    $term_learner_object_from_id_caching_state$ = null;
    $term_learner_id_caching_state$ = null;
    $upwards_closure_query_mt$ = null;
    $get_upwards_closure_justifications_cached_caching_state$ = null;
    $caching_upwards_closure_justificationsP$ = null;
    $get_treated_condition_caching_state$ = null;
    $get_treatments_for_condition_caching_state$ = null;
    $get_affected_parts_caching_state$ = null;
    $get_cooccurring_conditions_caching_state$ = null;
    $leaders_to_groups_caching_state$ = null;
    $cities_to_countries_caching_state$ = null;
    $countries_to_regions_caching_state$ = null;
    $tagged_xml_doc_directory$ = null;
    $tagged_doc_title_name$ = null;
    $tagged_doc_title_token$ = null;
    $tagged_doc_title_close_token$ = null;
    $tagged_doc_text_name$ = null;
    $tagged_doc_text_token$ = null;
    $tagged_doc_text_close_token$ = null;
    $tagged_doc_keystring_name$ = null;
    $tagged_doc_keystring_token$ = null;
    $tagged_doc_confirmed_concepts_keystring_token$ = null;
    $tagged_doc_confirmed_concepts_keystring_name$ = null;
    $tagged_doc_original_filename_name$ = null;
    $tagged_doc_original_filename_token$ = null;
    $tagged_doc_url_name$ = null;
    $tagged_doc_url_token$ = null;
    $tagged_doc_url_close_token$ = null;
    $tagged_doc_parent_filename_name$ = null;
    $tagged_doc_parent_filename_token$ = null;
    $semantic_index_dir_name$ = null;
    $text_index_dir_name$ = null;
    $annotated_document_format$ = null;
    $term_learner_keep_concepts_distinct$ = null;
    $default_medical_tagging_lexicon$ = null;
    $doc_annotation_use_hl_ids$ = null;
    $doc_annotator_term_id_fbc_path$ = null;
    $doc_annotator_id_term_fbc_path$ = null;
    $doc_annotator_term_id_fbc$ = null;
    $doc_annotator_id_term_fbc$ = null;
    $document_annotation_term_id_caching_state$ = null;
    $document_annotation_term_from_id_caching_state$ = null;
    $default_document_ingester_annotation_learning_lexicons$ = null;
    $get_default_document_ingester_annotation_lexicon_caching_state$ = null;
    $default_document_annotation_learning_lexicon$ = null;
    $default_document_annotation_lexicon$ = null;
    $get_default_document_annotation_lexicon_caching_state$ = null;
    $default_document_annotation_rule_disambiguator$ = null;
    $remove_pictures_regexp$ = null;
    $remove_hyphens_regexp$ = null;
    $remove_underscores_regexp$ = null;
    $remove_equals_regexp$ = null;
    $remove_dots_regexp$ = null;
    $remove_unicode_regexp$ = null;
    $cached_regexps$ = null;
    $document_interpretation_rules_by_mt$ = null;
    $document_interpretation_default_elmt$ = null;
    $manual_document_annotation_instructions$ = null;
    $str0$_host_george_super_index_hezbolla = makeString( "/host/george/super-index-hezbollah/text" );
    $str1$_host_george_super_index_hezbolla = makeString( "/host/george/super-index-hezbollah/sem" );
    $str2$_cyc_projects_ccf_document_search = makeString( "/cyc/projects/ccf/document-search/doc-corpus/currently-installed-at-ccf/super-index/text" );
    $str3$_cyc_projects_ccf_document_search = makeString( "/cyc/projects/ccf/document-search/doc-corpus/currently-installed-at-ccf/super-index/sem" );
    $str4$_host_achernar_daves_ccf_lucene_t = makeString( "/host/achernar/daves/ccf-lucene/text" );
    $str5$_host_achernar_daves_ccf_lucene_s = makeString( "/host/achernar/daves/ccf-lucene/sem-20070720" );
    $str6$_cyc_projects_ccf_document_search = makeString( "/cyc/projects/ccf/document-search/doc-corpus/20091021-133607/super-index/sem/" );
    $str7$_cyc_projects_ccf_document_search = makeString( "/cyc/projects/ccf/document-search/doc-corpus/20091021-133607/super-index/text/" );
    $list8 = ConsesLow.list( makeSymbol( "LIST" ) );
    $sym9$OUT = makeUninternedSymbol( "OUT" );
    $sym10$PROGN = makeSymbol( "PROGN" );
    $sym11$PWHEN = makeSymbol( "PWHEN" );
    $sym12$_TRACE_DOC_SEARCH_INTERFACE_ = makeSymbol( "*TRACE-DOC-SEARCH-INTERFACE*" );
    $sym13$FORMAT = makeSymbol( "FORMAT" );
    $sym14$_TRACE_OUTPUT_ = makeSymbol( "*TRACE-OUTPUT*" );
    $str15$___A__entering__S__ = makeString( "~&~A: entering ~S~%" );
    $list16 = ConsesLow.list( makeSymbol( "TIMESTAMP-WITH-MILLISECONDS" ) );
    $sym17$_DOC_SEARCH_TRACE_LOG_FILE_ = makeSymbol( "*DOC-SEARCH-TRACE-LOG-FILE*" );
    $sym18$WITH_PRIVATE_TEXT_FILE = makeSymbol( "WITH-PRIVATE-TEXT-FILE" );
    $list19 = ConsesLow.list( makeSymbol( "*DOC-SEARCH-TRACE-LOG-FILE*" ), makeKeyword( "APPEND" ) );
    $list20 = ConsesLow.list( makeSymbol( "WARN" ), makeString( "writing to ~S" ), makeSymbol( "*DOC-SEARCH-TRACE-LOG-FILE*" ) );
    $list21 = ConsesLow.list( ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeString( "g" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
        makeString( "i" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), makeString( "r" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
            "hasLeaders" ) ), makeString( "l" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "standardTreatmentTypeForConditionType" ) ), makeString( "c" ) ), ConsesLow.cons(
                constant_handles.reader_make_constant_shell( makeString( "ailmentTypeAfflictsPartType" ) ), makeString( "a" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString(
                    "conditionsCommonlyCooccur" ) ), makeString( "o" ) ) );
    $list22 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "SPEC" ), makeKeyword(
        "GENL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), makeKeyword( "SPEC" ), makeKeyword(
            "GENL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "inRegion" ) ), makeKeyword( "SPEC" ),
                makeKeyword( "GENL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasLeaders" ) ), constant_handles.reader_make_constant_shell( makeString( "hasLeaders" ) ), makeKeyword(
                    "GENL" ), makeKeyword( "SPEC" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "standardTreatmentTypeForConditionType" ) ), constant_handles.reader_make_constant_shell(
                        makeString( "standardTreatmentTypeForConditionType" ) ), makeKeyword( "SPEC" ), makeKeyword( "GENL" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "ailmentTypeAfflictsPartType" ) ), constant_handles.reader_make_constant_shell( makeString( "ailmentTypeAfflictsPartType" ) ), makeKeyword( "SPEC" ), makeKeyword( "GENL" ) ), ConsesLow.list(
                                constant_handles.reader_make_constant_shell( makeString( "conditionsCommonlyCooccur" ) ), constant_handles.reader_make_constant_shell( makeString( "conditionsCommonlyCooccur" ) ),
                                makeKeyword( "SPEC" ), makeKeyword( "GENL" ) ) );
    $str23$data_doc_tagging_upwards_closure_ = makeString( "data/doc-tagging/upwards-closure-justifications.fht" );
    $kw24$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str25$_host_george_scratch_text_index = makeString( "/host/george/scratch/text-index" );
    $str26$_host_george_scratch_sem_index = makeString( "/host/george/scratch/sem-index" );
    $str27$_host_george_simple_tagged_index_ = makeString( "/host/george/simple-tagged-index/textual" );
    $str28$_host_george_simple_tagged_index_ = makeString( "/host/george/simple-tagged-index/semantic" );
    $str29$_host_george_disambiguated_index_ = makeString( "/host/george/disambiguated-index/text" );
    $str30$_host_george_disambiguated_index_ = makeString( "/host/george/disambiguated-index/sem" );
    $kw31$SPEC = makeKeyword( "SPEC" );
    $kw32$GENL = makeKeyword( "GENL" );
    $sym33$TERM_LEARNER_OBJECT_FROM_ID = makeSymbol( "TERM-LEARNER-OBJECT-FROM-ID" );
    $sym34$_TERM_LEARNER_OBJECT_FROM_ID_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-OBJECT-FROM-ID-CACHING-STATE*" );
    $int35$4096 = makeInteger( 4096 );
    $kw36$ERROR = makeKeyword( "ERROR" );
    $sym37$TERM_LEARNER_ID = makeSymbol( "TERM-LEARNER-ID" );
    $sym38$_TERM_LEARNER_ID_CACHING_STATE_ = makeSymbol( "*TERM-LEARNER-ID-CACHING-STATE*" );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) ),
        constant_handles.reader_make_constant_shell( makeString( "CCF-CAEQueryMt" ) ) );
    $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS = makeSymbol( "GET-UPWARDS-CLOSURE-JUSTIFICATIONS" );
    $const41$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const42$standardTreatmentTypeForCondition = constant_handles.reader_make_constant_shell( makeString( "standardTreatmentTypeForConditionType" ) );
    $const43$ailmentTypeAfflictsPartType = constant_handles.reader_make_constant_shell( makeString( "ailmentTypeAfflictsPartType" ) );
    $const44$conditionsCommonlyCooccur = constant_handles.reader_make_constant_shell( makeString( "conditionsCommonlyCooccur" ) );
    $const45$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const46$inRegion = constant_handles.reader_make_constant_shell( makeString( "inRegion" ) );
    $const47$hasLeaders = constant_handles.reader_make_constant_shell( makeString( "hasLeaders" ) );
    $sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED = makeSymbol( "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED" );
    $kw49$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $sym50$_GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED_CACHING_STATE_ = makeSymbol( "*GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-CACHING-STATE*" );
    $str51$_cyc_top_data_doc_tagging_upwards = makeString( "/cyc/top/data/doc-tagging/upwards-closure-justifications.fht" );
    $kw52$IMAGE_INDEPENDENT_CFASL = makeKeyword( "IMAGE-INDEPENDENT-CFASL" );
    $str53$Caching_upwards_closure_justifica = makeString( "Caching upwards-closure justifications" );
    $const54$MedicalDevice = constant_handles.reader_make_constant_shell( makeString( "MedicalDevice" ) );
    $const55$MedicalTreatmentEvent = constant_handles.reader_make_constant_shell( makeString( "MedicalTreatmentEvent" ) );
    $const56$AilmentCondition = constant_handles.reader_make_constant_shell( makeString( "AilmentCondition" ) );
    $const57$IntelligentAgent = constant_handles.reader_make_constant_shell( makeString( "IntelligentAgent" ) );
    $sym58$GET_TREATED_CONDITION = makeSymbol( "GET-TREATED-CONDITION" );
    $sym59$_X = makeSymbol( "?X" );
    $const60$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $const61$deviceTypeTreatsConditionType = constant_handles.reader_make_constant_shell( makeString( "deviceTypeTreatsConditionType" ) );
    $list62 = ConsesLow.list( makeSymbol( "?X" ) );
    $list63 = ConsesLow.list( makeKeyword( "TRANSITIVE-CLOSURE-MODE" ), makeKeyword( "ALL" ) );
    $sym64$_GET_TREATED_CONDITION_CACHING_STATE_ = makeSymbol( "*GET-TREATED-CONDITION-CACHING-STATE*" );
    $sym65$CLEAR_GET_TREATED_CONDITION = makeSymbol( "CLEAR-GET-TREATED-CONDITION" );
    $sym66$GET_TREATMENTS_FOR_CONDITION = makeSymbol( "GET-TREATMENTS-FOR-CONDITION" );
    $sym67$_GET_TREATMENTS_FOR_CONDITION_CACHING_STATE_ = makeSymbol( "*GET-TREATMENTS-FOR-CONDITION-CACHING-STATE*" );
    $sym68$CLEAR_GET_TREATMENTS_FOR_CONDITION = makeSymbol( "CLEAR-GET-TREATMENTS-FOR-CONDITION" );
    $sym69$GET_AFFECTED_PARTS = makeSymbol( "GET-AFFECTED-PARTS" );
    $sym70$_GET_AFFECTED_PARTS_CACHING_STATE_ = makeSymbol( "*GET-AFFECTED-PARTS-CACHING-STATE*" );
    $sym71$CLEAR_GET_AFFECTED_PARTS = makeSymbol( "CLEAR-GET-AFFECTED-PARTS" );
    $sym72$GET_COOCCURRING_CONDITIONS = makeSymbol( "GET-COOCCURRING-CONDITIONS" );
    $sym73$_GET_COOCCURRING_CONDITIONS_CACHING_STATE_ = makeSymbol( "*GET-COOCCURRING-CONDITIONS-CACHING-STATE*" );
    $sym74$CLEAR_GET_COOCCURRING_CONDITIONS = makeSymbol( "CLEAR-GET-COOCCURRING-CONDITIONS" );
    $sym75$_GROUP = makeSymbol( "?GROUP" );
    $const76$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym77$LEADERS_TO_GROUPS = makeSymbol( "LEADERS-TO-GROUPS" );
    $list78 = ConsesLow.cons( makeSymbol( "LEADER" ), makeSymbol( "GROUP" ) );
    $list79 = ConsesLow.cons( makeSymbol( "?LEADER" ), makeSymbol( "?GROUP" ) );
    $list80 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasLeaders" ) ), makeSymbol( "?GROUP" ), makeSymbol( "?LEADER" ) );
    $sym81$_LEADERS_TO_GROUPS_CACHING_STATE_ = makeSymbol( "*LEADERS-TO-GROUPS-CACHING-STATE*" );
    $sym82$CITIES_TO_COUNTRIES = makeSymbol( "CITIES-TO-COUNTRIES" );
    $str83$Caching_countries_of_all_cities__ = makeString( "Caching countries of all cities..." );
    $list84 = ConsesLow.cons( makeSymbol( "?CITY" ), makeSymbol( "?COUNTRY" ) );
    $list85 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) ), makeSymbol( "?COUNTRY" ), makeSymbol( "?CITY" ) );
    $list86 = ConsesLow.cons( makeSymbol( "CITY" ), makeSymbol( "COUNTRY" ) );
    $sym87$_CITIES_TO_COUNTRIES_CACHING_STATE_ = makeSymbol( "*CITIES-TO-COUNTRIES-CACHING-STATE*" );
    $sym88$_COUNTRY = makeSymbol( "?COUNTRY" );
    $const89$countryOfCity = constant_handles.reader_make_constant_shell( makeString( "countryOfCity" ) );
    $sym90$_REGION = makeSymbol( "?REGION" );
    $const91$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list92 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?COUNTRYTYPE" ), constant_handles.reader_make_constant_shell( makeString( "CountryTypeByGeneralRegion" ) ) );
    $list93 = ConsesLow.list( makeSymbol( "?COUNTRYTYPE" ) );
    $list94 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regionOfCountryTypeByGeneralRegion" ) ), makeSymbol( "?COUNTRYTYPE" ), makeSymbol( "?REGION" ) ) );
    $sym95$COUNTRIES_TO_REGIONS = makeSymbol( "COUNTRIES-TO-REGIONS" );
    $list96 = ConsesLow.cons( makeSymbol( "COUNTRY" ), makeSymbol( "REGION" ) );
    $list97 = ConsesLow.cons( makeSymbol( "?COUNTRY" ), makeSymbol( "?REGION" ) );
    $list98 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?COUNTRYTYPE" ),
        constant_handles.reader_make_constant_shell( makeString( "CountryTypeByGeneralRegion" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?COUNTRY" ),
            makeSymbol( "?COUNTRYTYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "regionOfCountryTypeByGeneralRegion" ) ), makeSymbol( "?COUNTRYTYPE" ), makeSymbol( "?REGION" ) ) );
    $sym99$_COUNTRIES_TO_REGIONS_CACHING_STATE_ = makeSymbol( "*COUNTRIES-TO-REGIONS-CACHING-STATE*" );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "SEMANTIC-SESSION" ), makeSymbol( "KEYWORD-SESSION" ), makeSymbol( "HOST" ), makeSymbol( "PORT" ), makeSymbol( "TEXT-INDEX-FILE" ), makeSymbol(
        "SEM-INDEX-FILE" ), makeSymbol( "OVERWRITE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym101$CLET = makeSymbol( "CLET" );
    $sym102$NEW_LUCENE_SESSION = makeSymbol( "NEW-LUCENE-SESSION" );
    $kw103$TEXT = makeKeyword( "TEXT" );
    $kw104$CYC = makeKeyword( "CYC" );
    $sym105$LUCENE_OPTIMIZE = makeSymbol( "LUCENE-OPTIMIZE" );
    $sym106$LUCENE_FINALIZE = makeSymbol( "LUCENE-FINALIZE" );
    $str107$_indexed_docs_txt = makeString( "/indexed-docs.txt" );
    $sym108$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $str109$Indexing_files = makeString( "Indexing files" );
    $str110$cdolist = makeString( "cdolist" );
    $str111$ = makeString( "" );
    $kw112$APPEND = makeKeyword( "APPEND" );
    $str113$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str114$_A__ = makeString( "~A~%" );
    $str115$_host_george_scratch_tagged_xml_d = makeString( "/host/george/scratch/tagged-xml-docs/" );
    $str116$title = makeString( "title" );
    $str117$_title_ = makeString( "<title>" );
    $str118$__title_ = makeString( "</title>" );
    $str119$text = makeString( "text" );
    $str120$_text_ = makeString( "<text>" );
    $str121$__text_ = makeString( "</text>" );
    $str122$keystring = makeString( "keystring" );
    $str123$_keystring_ = makeString( "<keystring>" );
    $str124$_confirmed_concept_keystring_ = makeString( "<confirmed_concept_keystring>" );
    $str125$original_filename = makeString( "original_filename" );
    $str126$_original_filename_ = makeString( "<original_filename>" );
    $str127$url = makeString( "url" );
    $str128$_url_ = makeString( "<url>" );
    $str129$__url_ = makeString( "</url>" );
    $str130$parent_filename = makeString( "parent_filename" );
    $str131$_parent_filename_ = makeString( "<parent_filename>" );
    $str132$sem = makeString( "sem" );
    $str133$_host_george_scratch_tagged_docs_ = makeString( "/host/george/scratch/tagged-docs/" );
    $str134$Tagging_files = makeString( "Tagging files" );
    $kw135$DONE = makeKeyword( "DONE" );
    $kw136$NEW = makeKeyword( "NEW" );
    $list137 = ConsesLow.list( makeSymbol( "ORG-FILE" ), makeSymbol( "TEXT-FPATH" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "THE-URL" ), makeSymbol( "THE-PARENT" ) );
    $str138$_S_tagging__S__ = makeString( "~S tagging ~S~%" );
    $str139$_txt = makeString( ".txt" );
    $str140$_cyc_idx = makeString( ".cyc-idx" );
    $list141 = ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "DOC-TEXT" ) );
    $str142$_ = makeString( "#" );
    $str143$_ = makeString( "^" );
    $kw144$OUTPUT = makeKeyword( "OUTPUT" );
    $str145$Doc = makeString( "Doc" );
    $str146$There_is_no_text_in_the_body_of_t = makeString( "There is no text in the body of this doc.  Please remove it from the corpus.~%" );
    $str147$Couldn_t_find_source_file__S__Mov = makeString( "Couldn't find source file ~S. Moving on to next file." );
    $kw148$INPUT = makeKeyword( "INPUT" );
    $sym149$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $list150 = ConsesLow.list( makeSymbol( "IDX-FILE" ), makeSymbol( "TXT-FILE" ) );
    $sym151$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str152$problem_indexing__a_____moving_on = makeString( "problem indexing ~a  ...moving on to next file: ~A" );
    $str153$http___doc_cyc_com_ = makeString( "http://doc.cyc.com/" );
    $str154$_cyc_ = makeString( "/cyc/" );
    $str155$title___S__ = makeString( "title: ~S~%" );
    $str156$url___S__ = makeString( "url: ~S~%" );
    $sym157$LUCENE_ADD_DOCUMENT = makeSymbol( "LUCENE-ADD-DOCUMENT" );
    $kw158$SIMPLE = makeKeyword( "SIMPLE" );
    $str159$_ = makeString( " " );
    $sym160$POS_TAGGING_CONCEPT_TAGGER = makeSymbol( "POS-TAGGING-CONCEPT-TAGGER" );
    $sym161$STRINGP = makeSymbol( "STRINGP" );
    $kw162$LEXICON = makeKeyword( "LEXICON" );
    $kw163$SENSE_TAGGER = makeKeyword( "SENSE-TAGGER" );
    $sym164$_EXIT = makeSymbol( "%EXIT" );
    $sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS = makeSymbol( "FIND-CONCEPTS-FOR-DOCUMENT-SEGMENTS" );
    $str166$Mww = makeString( "Mww" );
    $str167$writing_to__S = makeString( "writing to ~S" );
    $sym168$TAG_DOCUMENT_NODES_FOR_DISPLAY = makeSymbol( "TAG-DOCUMENT-NODES-FOR-DISPLAY" );
    $str169$full = makeString( "full" );
    $list170 = ConsesLow.list( makeSymbol( "NODE-ID" ), makeSymbol( "STRING" ) );
    $str171$_ua0_ = makeString( "&ua0;" );
    $sym172$_ = makeSymbol( "<" );
    $sym173$FIRST = makeSymbol( "FIRST" );
    $sym174$CANONICALIZE_TERM = makeSymbol( "CANONICALIZE-TERM" );
    $list175 = ConsesLow.list( makeSymbol( "NODE-ID" ), makeSymbol( "OFFSET" ) );
    $const176$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) );
    $list177 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Place" ) ) );
    $sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS = makeSymbol( "FIND-INTERPS-FOR-DOCUMENT-SEGMENTS" );
    $str179$dogs_have_four_feet = makeString( "dogs have four feet" );
    $list180 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "relationAllExistsCount" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalParts" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Foot-AnimalBodyPart" ) ), constant_handles.reader_make_constant_shell( makeString( "Dog" ) ), FOUR_INTEGER );
    $sym181$EXCLUDE_POS = makeSymbol( "EXCLUDE-POS" );
    $const182$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const183$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $const184$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $const185$Gerundive = constant_handles.reader_make_constant_shell( makeString( "Gerundive" ) );
    $sym186$ADD_CONCEPT_FILTER_SPEC = makeSymbol( "ADD-CONCEPT-FILTER-SPEC" );
    $list187 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "CCFExplanationWorthyConceptFilter" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptAndInstancesFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TriggerFromConceptOrInstance" ) ) );
    $str188$_tagged_html = makeString( "-tagged.html" );
    $str189$_span_property__cyc_termName__con = makeString( "<span property='cyc:termName' content='" );
    $str190$___span_class__cycTerm__id__cycTe = makeString( "'><span class='cycTerm' id='cycTerm" );
    $str191$__property__cyc_termId__content__ = makeString( "' property='cyc:termId' content='" );
    $str192$__ = makeString( "'>" );
    $str193$__span___span_ = makeString( "</span></span>" );
    $list194 = ConsesLow.list( makeSymbol( "MAP-STRING-INDEX" ), makeSymbol( "MAP-STRING-END-INDEX" ) );
    $str195$http___sw_cyc_com_concept_ = makeString( "http://sw.cyc.com/concept/" );
    $list196 = ConsesLow.list( makeString( "script" ), makeString( "style" ), makeString( "iframe" ), makeString( "select" ), makeString( "noscript" ), makeString( "pre" ), makeString( "code" ) );
    $str197$s = makeString( "s" );
    $str198$t = makeString( "t" );
    $str199$data_doc_tagging_term_id_fht = makeString( "data/doc-tagging/term-id.fht" );
    $str200$data_doc_tagging_id_term_fht = makeString( "data/doc-tagging/id-term.fht" );
    $str201$Meaning__ = makeString( "Meaning: " );
    $str202$_ = makeString( "(" );
    $str203$__ = makeString( ", " );
    $str204$_ = makeString( ")" );
    $sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING = makeSymbol( "GENERATE-RETRIEVAL-JUSTIFICATION-FROM-JUSTIFICATION-STRING" );
    $str206$Text_Match__ = makeString( "Text Match: " );
    $str207$Invalid_justification_string___S = makeString( "Invalid justification string: ~S" );
    $sym208$GENERATE_TERM_EXPLANATION = makeSymbol( "GENERATE-TERM-EXPLANATION" );
    $kw209$DEFAULT = makeKeyword( "DEFAULT" );
    $const210$userDocComment = constant_handles.reader_make_constant_shell( makeString( "userDocComment" ) );
    $const211$CCF_CAE_QueryMt = constant_handles.reader_make_constant_shell( makeString( "CCF-CAE-QueryMt" ) );
    $kw212$DEMERIT_CUTOFF = makeKeyword( "DEMERIT-CUTOFF" );
    $list213 = ConsesLow.list( makeKeyword( "PPH-AGREEMENT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) ), makeKeyword( "PPH-GENERATION-COUNT" ), EIGHT_INTEGER );
    $str214$_b_Synonyms__b___ = makeString( "<b>Synonyms</b>: " );
    $str215$_b_ = makeString( "<b>" );
    $str216$__b___ = makeString( "</b>: " );
    $str217$_br_ = makeString( "<br>" );
    $str218$_div_style__background_color__whi = makeString( "<div style=\"background-color: white; margin-left: 3em; margin-right: 3em\">" );
    $str219$__div_ = makeString( "</div>" );
    $const220$SurgicalProcedure = constant_handles.reader_make_constant_shell( makeString( "SurgicalProcedure" ) );
    $const221$Surgery = constant_handles.reader_make_constant_shell( makeString( "Surgery" ) );
    $sym222$_DOC = makeSymbol( "?DOC" );
    $const223$expertAtSkill = constant_handles.reader_make_constant_shell( makeString( "expertAtSkill" ) );
    $const224$CCFPersonnelDataMt = constant_handles.reader_make_constant_shell( makeString( "CCFPersonnelDataMt" ) );
    $str225$_b_Specialists____b_ = makeString( "<b>Specialists: </b>" );
    $sym226$DOCUMENT_ANNOTATION_TERM_ID = makeSymbol( "DOCUMENT-ANNOTATION-TERM-ID" );
    $sym227$_DOCUMENT_ANNOTATION_TERM_ID_CACHING_STATE_ = makeSymbol( "*DOCUMENT-ANNOTATION-TERM-ID-CACHING-STATE*" );
    $int228$25000 = makeInteger( 25000 );
    $sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID = makeSymbol( "DOCUMENT-ANNOTATION-TERM-FROM-ID" );
    $sym230$_DOCUMENT_ANNOTATION_TERM_FROM_ID_CACHING_STATE_ = makeSymbol( "*DOCUMENT-ANNOTATION-TERM-FROM-ID-CACHING-STATE*" );
    $int231$5000 = makeInteger( 5000 );
    $const232$PredicateTaxonomy = constant_handles.reader_make_constant_shell( makeString( "PredicateTaxonomy" ) );
    $list233 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString( "PredicateTaxonomy" ) ),
        constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString( "TriggerFromConcept" ) ) );
    $str234$vocabMarking = makeString( "vocabMarking" );
    $sym235$ADD_LEARNER = makeSymbol( "ADD-LEARNER" );
    $sym236$STANFORD_NER_LEARN = makeSymbol( "STANFORD-NER-LEARN" );
    $sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON = makeSymbol( "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON" );
    $sym238$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw239$OFF = makeKeyword( "OFF" );
    $sym240$EXCLUDE_PREDICATE = makeSymbol( "EXCLUDE-PREDICATE" );
    $const241$countryCodeTrigraph = constant_handles.reader_make_constant_shell( makeString( "countryCodeTrigraph" ) );
    $const242$countryCodeDigraph = constant_handles.reader_make_constant_shell( makeString( "countryCodeDigraph" ) );
    $sym243$ALLOW_POS = makeSymbol( "ALLOW-POS" );
    $const244$ClosedClassWord = constant_handles.reader_make_constant_shell( makeString( "ClosedClassWord" ) );
    $sym245$SCALAR_INTERVAL_LEARN = makeSymbol( "SCALAR-INTERVAL-LEARN" );
    $sym246$DATE_LEARN = makeSymbol( "DATE-LEARN" );
    $sym247$_GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON_CACHING_STATE_ = makeSymbol( "*GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-CACHING-STATE*" );
    $sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON = makeSymbol( "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON" );
    $sym249$_GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON_CACHING_STATE_ = makeSymbol( "*GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-CACHING-STATE*" );
    $sym250$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $sym251$IGNORE_CACHE = makeSymbol( "IGNORE-CACHE" );
    $kw252$PREFERRED = makeKeyword( "PREFERRED" );
    $sym253$ALLOW_PREDICATE = makeSymbol( "ALLOW-PREDICATE" );
    $const254$preferredNameString = constant_handles.reader_make_constant_shell( makeString( "preferredNameString" ) );
    $const255$ksTermString = constant_handles.reader_make_constant_shell( makeString( "ksTermString" ) );
    $const256$alias = constant_handles.reader_make_constant_shell( makeString( "alias" ) );
    $const257$programStrings = constant_handles.reader_make_constant_shell( makeString( "programStrings" ) );
    $const258$airportHasIATACode = constant_handles.reader_make_constant_shell( makeString( "airportHasIATACode" ) );
    $const259$airportHasICAOCode = constant_handles.reader_make_constant_shell( makeString( "airportHasICAOCode" ) );
    $sym260$SET_BASE_MT = makeSymbol( "SET-BASE-MT" );
    $sym261$ALLOW_MT = makeSymbol( "ALLOW-MT" );
    $const262$TechnicalEnglishLexicalMt = constant_handles.reader_make_constant_shell( makeString( "TechnicalEnglishLexicalMt" ) );
    $const263$MedicalLexicalMt = constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) );
    $str264$CCFLexicalMt = makeString( "CCFLexicalMt" );
    $const265$CCFLexicalMt = constant_handles.reader_make_constant_shell( makeString( "CCFLexicalMt" ) );
    $list266 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TriggerFromConcept" ) ) );
    $kw267$NOTHING_DONE = makeKeyword( "NOTHING-DONE" );
    $str268$rebuilding_term_id_FHT = makeString( "rebuilding term-id FHT" );
    $kw269$SKIP = makeKeyword( "SKIP" );
    $str270$Rebuilding_id__term_map = makeString( "Rebuilding id->term map" );
    $str271$Augmenting_term_id_FHT = makeString( "Augmenting term-id FHT" );
    $kw272$NO_ID = makeKeyword( "NO-ID" );
    $kw273$INTERP_ID = makeKeyword( "INTERP-ID" );
    $list274 = ConsesLow.list( makeKeyword( "SEARCH-TYPE" ), makeKeyword( "TEXT" ) );
    $kw275$DOC_TEXT = makeKeyword( "DOC-TEXT" );
    $kw276$SEARCH_TYPE = makeKeyword( "SEARCH-TYPE" );
    $sym277$LUCENE_DOUBLE_QUERY = makeSymbol( "LUCENE-DOUBLE-QUERY" );
    $str278$0_0_t___ = makeString( "0#0#t\\\\^" );
    $str279$0_0_s___ = makeString( "0#0#s\\\\^" );
    $sym280$TERMS_FOR_CYC_SEMANTIC_QUERY = makeSymbol( "TERMS-FOR-CYC-SEMANTIC-QUERY" );
    $kw281$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym282$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str283$_cyc_projects_doc_annotation_quer = makeString( "/cyc/projects/doc-annotation/query-logs/log.txt" );
    $str284$_A___S__ = makeString( "~A: ~S~%" );
    $sym285$STOPWORD_IN_SEM_QUERY_ = makeSymbol( "STOPWORD-IN-SEM-QUERY?" );
    $sym286$REMOVE_CDAR = makeSymbol( "REMOVE-CDAR" );
    $sym287$CADAR = makeSymbol( "CADAR" );
    $str288$0_0_s = makeString( "0#0#s" );
    $kw289$INTERP = makeKeyword( "INTERP" );
    $sym290$TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY = makeSymbol( "TERMS-FOR-FOCUSED-CYC-SEMANTIC-QUERY" );
    $list291 = ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "DETAILS" ) );
    $str292$_____a_z0_9A_Z_________ = makeString( "[\\[][a-z0-9A-Z._:]*[\\]]" );
    $str293$__ = makeString( "--" );
    $str294$__ = makeString( "__" );
    $str295$__ = makeString( "==" );
    $str296$_____________ = makeString( "[.][.][.][.]+" );
    $str297$__0_9a_fA_F___ = makeString( "&[0-9a-fA-F]+;" );
    $kw298$SNIPPET = makeKeyword( "SNIPPET" );
    $kw299$TITLE = makeKeyword( "TITLE" );
    $list300 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORT" ), makeSymbol( "LEXICON" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym301$SEEN_ = makeUninternedSymbol( "SEEN?" );
    $list302 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 1024 ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ) );
    $sym303$DO_LEXICON = makeSymbol( "DO-LEXICON" );
    $sym304$STRING = makeSymbol( "STRING" );
    $sym305$LEX = makeSymbol( "LEX" );
    $list306 = ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "STRING" ) );
    $sym307$CSETQ = makeSymbol( "CSETQ" );
    $list308 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "DENOT" ) ) );
    $sym309$PUNLESS = makeSymbol( "PUNLESS" );
    $sym310$GETHASH_WITHOUT_VALUES = makeSymbol( "GETHASH-WITHOUT-VALUES" );
    $sym311$SETHASH = makeSymbol( "SETHASH" );
    $list312 = ConsesLow.list( T );
    $str313$_A___A__ = makeString( "~A. ~A~%" );
    $str314$____A__ = makeString( "   ~A: " );
    $str315$_A_ = makeString( "~A " );
    $str316$__ = makeString( "~%" );
    $sym317$REMOVE_PICTURES_REGEXP_TEST = makeSymbol( "REMOVE-PICTURES-REGEXP-TEST" );
    $kw318$TEST = makeKeyword( "TEST" );
    $kw319$OWNER = makeKeyword( "OWNER" );
    $kw320$CLASSES = makeKeyword( "CLASSES" );
    $kw321$KB = makeKeyword( "KB" );
    $kw322$TINY = makeKeyword( "TINY" );
    $kw323$WORKING_ = makeKeyword( "WORKING?" );
    $list324 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "some text and [a_picture.png] followed by some other stuff" ) ), ConsesLow.list( makeString( "[a_picture.png]" ) ) ) );
    $sym325$GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES = makeSymbol( "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS-VALUES" );
    $list326 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ZERO_INTEGER, makeString( "this" ) ), ConsesLow.list( ONE_INTEGER, makeString( " is " ) ), ConsesLow.list( TWO_INTEGER,
        makeString( "a " ) ), ConsesLow.list( THREE_INTEGER, makeString( "cat" ) ) ) ), ConsesLow.list( makeString( "this is a cat" ), ConsesLow.list( ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER ), ConsesLow.list(
            ONE_INTEGER, FOUR_INTEGER ), ConsesLow.list( TWO_INTEGER, EIGHT_INTEGER ), ConsesLow.list( THREE_INTEGER, TEN_INTEGER ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ZERO_INTEGER,
                makeString( "this" ) ), ConsesLow.list( ONE_INTEGER, makeString( " is " ) ), ConsesLow.list( TWO_INTEGER, makeString( "a cat" ) ) ) ), ConsesLow.list( makeString( "this is a cat" ), ConsesLow.list(
                    ConsesLow.list( ZERO_INTEGER, ZERO_INTEGER ), ConsesLow.list( ONE_INTEGER, FOUR_INTEGER ), ConsesLow.list( TWO_INTEGER, EIGHT_INTEGER ) ) ) ) );
    $sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_ = makeSymbol( "*DOCUMENT-INTERPRETATION-RULES-BY-MT*" );
    $const328$PiracyReportInterpretationMt = constant_handles.reader_make_constant_shell( makeString( "PiracyReportInterpretationMt" ) );
    $list329 = ConsesLow.list( ConsesLow.list( makeSymbol( "RULE" ), makeSymbol( "RULE-SET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym330$DO_SET = makeSymbol( "DO-SET" );
    $sym331$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $str332$Dont_know_yet_how_to_unify_a_sent = makeString( "Dont know yet how to unify a sentence with the sentence bag." );
    $str333$Dont_know_how_to_deal_with_test__ = makeString( "Dont know how to deal with test ~A." );
    $kw334$ADD_CONCEPT = makeKeyword( "ADD-CONCEPT" );
    $kw335$ADD_SENTENCE = makeKeyword( "ADD-SENTENCE" );
    $const336$interpretationSuggestion = constant_handles.reader_make_constant_shell( makeString( "interpretationSuggestion" ) );
    $kw337$GAF = makeKeyword( "GAF" );
    $kw338$TRUE = makeKeyword( "TRUE" );
    $kw339$ANTECEDENT = makeKeyword( "ANTECEDENT" );
    $kw340$CONSEQUENT = makeKeyword( "CONSEQUENT" );
    $kw341$PRECONDITIONS = makeKeyword( "PRECONDITIONS" );
    $kw342$SUGGESTIONS = makeKeyword( "SUGGESTIONS" );
    $const343$containsProposition_CW = constant_handles.reader_make_constant_shell( makeString( "containsProposition-CW" ) );
    $const344$thingDescribed = constant_handles.reader_make_constant_shell( makeString( "thingDescribed" ) );
    $const345$The = constant_handles.reader_make_constant_shell( makeString( "The" ) );
    $str346$Invalid_THE_expression__A___ = makeString( "Invalid THE expression ~A.~%" );
    $str347$Dont_know_how_to_handle_precondit = makeString( "Dont know how to handle precondition operator ~A in ~A." );
    $str348$If_it_is_the_case_that__ = makeString( "If it is the case that: " );
    $str349$then_one_might_conclude_that__ = makeString( "then one might conclude that: " );
    $str350$mt = makeString( "mt" );
    $str351$Document_Interpretation_Suggestio = makeString( "Document Interpretation Suggestions" );
    $str352$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str353$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw354$CB_CYC = makeKeyword( "CB-CYC" );
    $kw355$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw356$SHA1 = makeKeyword( "SHA1" );
    $str357$yui_skin_sam = makeString( "yui-skin-sam" );
    $str358$reloadFrameButton = makeString( "reloadFrameButton" );
    $str359$button = makeString( "button" );
    $str360$reload = makeString( "reload" );
    $str361$Refresh_Frames = makeString( "Refresh Frames" );
    $str362$Enter_the_text_to_interpret_ = makeString( "Enter the text to interpret." );
    $str363$post = makeString( "post" );
    $str364$cb_document_interpretation_sugges = makeString( "cb-document-interpretation-suggestions" );
    $str365$Submit = makeString( "Submit" );
    $str366$Clear = makeString( "Clear" );
    $int367$80 = makeInteger( 80 );
    $str368$Rule_Mt__ = makeString( "Rule Mt: " );
    $int369$40 = makeInteger( 40 );
    $str370$Complete = makeString( "Complete" );
    $const371$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str372$Identified_Concepts = makeString( "Identified Concepts" );
    $str373$Suggested_Concepts = makeString( "Suggested Concepts" );
    $str374$Suggested_Sentences = makeString( "Suggested Sentences" );
    $str375$Applied_Rules = makeString( "Applied Rules" );
    $sym376$CB_DOCUMENT_INTERPRETATION_SUGGESTIONS = makeSymbol( "CB-DOCUMENT-INTERPRETATION-SUGGESTIONS" );
    $kw377$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str378$For_each_string____concept_mappin = makeString(
        "For each string -> concept mapping, rate the mapping. <ul><li>'Primary Meaning' means that, acontextually, this is what one would think of when seeing the string.  Most words will only have one primary meaning.\n<li>'Contextually Dependent' means that this is a reasonable mapping, but would not be the primary mapping.  It would really only be used when there is something else in the context to license the meaning.\n<li>'Rare' means that, while the string could mean this, it's fairly hard to imagine contexts in which it would mean this, and we could effectively treat this as not being mapped.\n<li>'Indecipherable' means that this concept is not something that a user is ever likely to be able to understand, and should suppress the entire concept when interacting with end users.\n<li>'Merge away' should be used when the concept itself should not exist.   For example, when we have both  #$EducationalOrganization-Rutgers-University and #$RutgersUniversity, one of them should be merged away, and the other should be the primary meaning.\n<li>'Invalid' means that the mapping between the string and the concept is faulty, and should likely be eliminated.</ul>" );
    $str379$previous_input_file = makeString( "previous-input-file" );
    $str380$input_file = makeString( "input-file" );
    $str381$next_index = makeString( "next-index" );
    $str382$0 = makeString( "0" );
    $int383$30 = makeInteger( 30 );
    $str384$Manual_Concept_Annotation = makeString( "Manual Concept Annotation" );
    $str385$cb_annotate_tagged_concepts = makeString( "cb-annotate-tagged-concepts" );
    $str386$Tagging_File_Name__ = makeString( "Tagging File Name: " );
    $str387$tr__border_color__black__________ = makeString(
        "tr {border-color: black}\n                                .first {border-top-width: 10}\n                                .first td {border-top-width: 5; border-top-color: gray}" );
    $list388 = ConsesLow.list( makeSymbol( "TEXT" ), makeSymbol( "&REST" ), makeSymbol( "STRINGS-AND-CONCEPTS" ) );
    $str389$first = makeString( "first" );
    $str390$other = makeString( "other" );
    $str391$_S = makeString( "~S" );
    $str392$frequency___S__ = makeString( "frequency: ~S~%" );
    $str393$30_ = makeString( "30%" );
    $str394$_CCFFCC = makeString( "#CCFFCC" );
    $str395$primary = makeString( "primary" );
    $str396$Primary_Meaning___ = makeString( "Primary Meaning   " );
    $str397$_CCFFFF = makeString( "#CCFFFF" );
    $str398$contextual = makeString( "contextual" );
    $str399$Contextually_Dependent___ = makeString( "Contextually Dependent   " );
    $str400$_FFCCFF = makeString( "#FFCCFF" );
    $str401$very_rare = makeString( "very-rare" );
    $str402$Rare___ = makeString( "Rare   " );
    $str403$_FFCCCC = makeString( "#FFCCCC" );
    $str404$indecipherable = makeString( "indecipherable" );
    $str405$Indecipherable__ = makeString( "Indecipherable  " );
    $str406$_FFFFCC = makeString( "#FFFFCC" );
    $str407$merge_candidate = makeString( "merge-candidate" );
    $str408$Merge_away = makeString( "Merge away" );
    $str409$_CCCCFF = makeString( "#CCCCFF" );
    $str410$kill_candidate = makeString( "kill-candidate" );
    $str411$Invalid = makeString( "Invalid" );
    $sym412$CB_ANNOTATE_TAGGED_CONCEPTS = makeSymbol( "CB-ANNOTATE-TAGGED-CONCEPTS" );
    $str413$_out = makeString( ".out" );
    $str414$_A__A__A__ = makeString( "~A ~A ~A~%" );
    $kw415$EOF = makeKeyword( "EOF" );
    $str416$_ = makeString( "." );
    $str417$_cyc_projects_sabre_data_july_200 = makeString( "/cyc/projects/sabre/data/july-2007-questions-answers-profiles-activities/combined-sabre-local-for-manual-annotation.txt.out" );
    $list418 = ConsesLow.list( Characters.CHAR_space );
    $str419$_ = makeString( "\"" );
    $list420 = ConsesLow.list( makeSymbol( "HL-ID" ), makeSymbol( "JUDGMENT" ), makeSymbol( "&REST" ), makeSymbol( "IGNORE" ) );
    $str421$_cyc_projects_sabre_data_july_200 = makeString( "/cyc/projects/sabre/data/july-2007-questions-answers-profiles-activities/combined-sabre-local-for-manual-annotation.txt" );
    $list422 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "JUDGMENT" ) );
    $list423 = ConsesLow.list( makeSymbol( "INTERMED-TERM" ), makeSymbol( "INTERMED-JUDGMENT" ) );
    $list424 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "JUDGMENT" ), makeSymbol( "STRING" ) );
    $str425$f_____strengthOfLexicalMapping_ = makeString( "f: (#$strengthOfLexicalMapping " );
    $str426$___PrimaryLexicalMapping__ = makeString( " #$PrimaryLexicalMapping)." );
    $str427$___VanishinglyRareLexicalMapping_ = makeString( " #$VanishinglyRareLexicalMapping)." );
    $str428$___ContextuallyDependentLexicalMa = makeString( " #$ContextuallyDependentLexicalMapping)." );
    $str429$kill__ = makeString( "kill: " );
    $list430 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "URL" ), makeSymbol( "FILEDIR" ), makeSymbol( "TIME-STAMP" ) );
    $str431$input_file_line___S__ = makeString( "input-file-line: ~S~%" );
    $list432 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TriggerFromConcept" ) ) ) );
    $str433$__S__S__S___ = makeString( "(~S ~S ~S)~%" );
  }

  public static final class $clear_get_treated_condition$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_get_treated_condition$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-GET-TREATED-CONDITION" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_get_treated_condition();
    }
  }

  public static final class $clear_get_treatments_for_condition$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_get_treatments_for_condition$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-GET-TREATMENTS-FOR-CONDITION" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_get_treatments_for_condition();
    }
  }

  public static final class $clear_get_affected_parts$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_get_affected_parts$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-GET-AFFECTED-PARTS" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_get_affected_parts();
    }
  }

  public static final class $clear_get_cooccurring_conditions$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_get_cooccurring_conditions$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-GET-COOCCURRING-CONDITIONS" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_get_cooccurring_conditions();
    }
  }
}
/*
 * 
 * Total time: 3665 ms
 * 
 */