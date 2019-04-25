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

public final class document_annotation_widgets extends SubLTranslatedFile
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
    public static SubLObject trace_doc_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)document_annotation_widgets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list8);
        list = current.first();
        current = current.rest();
        if (document_annotation_widgets.NIL == current) {
            final SubLObject out = (SubLObject)document_annotation_widgets.$sym9$OUT;
            return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym10$PROGN, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym11$PWHEN, (SubLObject)document_annotation_widgets.$sym12$_TRACE_DOC_SEARCH_INTERFACE_, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym13$FORMAT, (SubLObject)document_annotation_widgets.$sym14$_TRACE_OUTPUT_, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, (SubLObject)document_annotation_widgets.$list16, list)), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym11$PWHEN, (SubLObject)document_annotation_widgets.$sym17$_DOC_SEARCH_TRACE_LOG_FILE_, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym18$WITH_PRIVATE_TEXT_FILE, reader.bq_cons(out, (SubLObject)document_annotation_widgets.$list19), (SubLObject)document_annotation_widgets.$list20, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym13$FORMAT, out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, (SubLObject)document_annotation_widgets.$list16, list))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list8);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2882L)
    public static SubLObject get_text_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (document_annotation_widgets.NIL != document_annotation_widgets.$text_index_override$.getDynamicValue(thread)) ? document_annotation_widgets.$text_index_override$.getDynamicValue(thread) : document_annotation_widgets.$text_index$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 2974L)
    public static SubLObject get_semantic_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (document_annotation_widgets.NIL != document_annotation_widgets.$semantic_index_override$.getDynamicValue(thread)) ? document_annotation_widgets.$semantic_index_override$.getDynamicValue(thread) : document_annotation_widgets.$semantic_index$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4228L)
    public static SubLObject semantic_index_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((document_annotation_widgets.$semantic_index$.getDynamicValue(thread) == document_annotation_widgets.$kw24$UNINITIALIZED) ? document_annotation_widgets.NIL : document_annotation_widgets.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4334L)
    public static SubLObject use_daves_temp_indexes() {
        document_annotation_widgets.$text_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str25$_host_george_scratch_text_index);
        document_annotation_widgets.$semantic_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str26$_host_george_scratch_sem_index);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4501L)
    public static SubLObject use_development_indexes() {
        document_annotation_widgets.$text_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str27$_host_george_simple_tagged_index_);
        document_annotation_widgets.$semantic_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str28$_host_george_simple_tagged_index_);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4687L)
    public static SubLObject use_development_disambiguated_indexes() {
        document_annotation_widgets.$text_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str29$_host_george_disambiguated_index_);
        document_annotation_widgets.$semantic_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str30$_host_george_disambiguated_index_);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 4879L)
    public static SubLObject use_hezbollah_indexes() {
        document_annotation_widgets.$text_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str0$_host_george_super_index_hezbolla);
        document_annotation_widgets.$semantic_index$.setDynamicValue((SubLObject)document_annotation_widgets.$str1$_host_george_super_index_hezbolla);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5061L)
    public static SubLObject new_closure_justification(final SubLObject template, final SubLObject spec, final SubLObject genl) {
        return (SubLObject)ConsesLow.list(template, spec, genl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5209L)
    public static SubLObject get_closure_justification_gaf(final SubLObject cj) {
        return cj.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5281L)
    public static SubLObject get_closure_justification_spec(final SubLObject cj) {
        return conses_high.second(cj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5355L)
    public static SubLObject get_closure_justification_genl(final SubLObject cj) {
        return conses_high.third(cj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5430L)
    public static SubLObject closure_justification_predicate(final SubLObject justification) {
        return cycl_utilities.formula_operator(get_closure_justification_gaf(justification));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5617L)
    public static SubLObject closure_justification_pred_id(final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.assoc(closure_justification_predicate(justification), document_annotation_widgets.$predicate_id_table$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 5830L)
    public static SubLObject substitute_template(final SubLObject template, final SubLObject spec, final SubLObject genl) {
        SubLObject formula = el_utilities.variable_subst(spec, (SubLObject)document_annotation_widgets.$kw31$SPEC, template);
        formula = el_utilities.variable_subst(genl, (SubLObject)document_annotation_widgets.$kw32$GENL, formula);
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6112L)
    public static SubLObject predicate_template(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.assoc(predicate, document_annotation_widgets.$predicate_template_table$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6259L)
    public static SubLObject make_justifications(final SubLObject template, final SubLObject v_term, final SubLObject v_genls) {
        SubLObject justifications = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)document_annotation_widgets.NIL;
        genl = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            if (document_annotation_widgets.NIL == doc_annotation_irrelevant_term(genl)) {
                justifications = (SubLObject)ConsesLow.cons(new_closure_justification(template, v_term, genl), justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return justifications;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6706L)
    public static SubLObject doc_annotation_irrelevant_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL == thcl.thcl_fortP(v_term, document_annotation_widgets.$doc_annotation_thcl_verboseP$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
    public static SubLObject clear_term_learner_object_from_id() {
        final SubLObject cs = document_annotation_widgets.$term_learner_object_from_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
    public static SubLObject remove_term_learner_object_from_id(final SubLObject id_string) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$term_learner_object_from_id_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(id_string), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
    public static SubLObject term_learner_object_from_id_internal(final SubLObject id_string) {
        if (document_annotation_widgets.NIL == id_string) {
            return (SubLObject)document_annotation_widgets.NIL;
        }
        return kb_utilities.maybe_find_object_by_compact_hl_external_id_string(id_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 6828L)
    public static SubLObject term_learner_object_from_id(final SubLObject id_string) {
        SubLObject caching_state = document_annotation_widgets.$term_learner_object_from_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym33$TERM_LEARNER_OBJECT_FROM_ID, (SubLObject)document_annotation_widgets.$sym34$_TERM_LEARNER_OBJECT_FROM_ID_CACHING_STATE_, (SubLObject)document_annotation_widgets.$int35$4096, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_learner_object_from_id_internal(id_string)));
            memoization_state.caching_state_put(caching_state, id_string, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7067L)
    public static SubLObject maybe_term_learner_object_from_id(final SubLObject id_string) {
        final SubLObject v_object = term_learner_object_from_id(id_string);
        if (document_annotation_widgets.NIL != cycl_grammar.cycl_represented_term_p(v_object)) {
            return v_object;
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7271L)
    public static SubLObject get_term_learner_id_for_cycl_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cycl = reader.read_from_string_ignoring_errors(string, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)((error == document_annotation_widgets.$kw36$ERROR) ? document_annotation_widgets.NIL : term_learner_id(cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
    public static SubLObject clear_term_learner_id() {
        final SubLObject cs = document_annotation_widgets.$term_learner_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
    public static SubLObject remove_term_learner_id(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$term_learner_id_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_object), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
    public static SubLObject term_learner_id_internal(final SubLObject v_object) {
        return kb_utilities.compact_hl_external_id_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7678L)
    public static SubLObject term_learner_id(final SubLObject v_object) {
        SubLObject caching_state = document_annotation_widgets.$term_learner_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym37$TERM_LEARNER_ID, (SubLObject)document_annotation_widgets.$sym38$_TERM_LEARNER_ID_CACHING_STATE_, (SubLObject)document_annotation_widgets.$int35$4096, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_learner_id_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7953L)
    public static SubLObject get_upwards_closure_justifications_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject fortified_term = narts_high.nart_substitute(v_term);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(document_annotation_widgets.$upwards_closure_query_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (document_annotation_widgets.NIL != fort_types_interface.collectionP(fortified_term)) {
                result = make_justifications(predicate_template(document_annotation_widgets.$const41$genls), fortified_term, Sequences.remove(fortified_term, genls.all_genls(fortified_term, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED));
                if (document_annotation_widgets.NIL != treatment_for_somethingP(fortified_term)) {
                    result = Sequences.cconcatenate(result, make_justifications(predicate_template(document_annotation_widgets.$const42$standardTreatmentTypeForCondition), fortified_term, get_treated_condition(fortified_term)));
                }
                if (document_annotation_widgets.NIL != ailmentP(fortified_term)) {
                    result = Sequences.cconcatenate(result, make_justifications(predicate_template(document_annotation_widgets.$const43$ailmentTypeAfflictsPartType), fortified_term, get_affected_parts(fortified_term)));
                    result = Sequences.cconcatenate(result, make_justifications(predicate_template(document_annotation_widgets.$const44$conditionsCommonlyCooccur), fortified_term, get_cooccurring_conditions(fortified_term)));
                    SubLObject cdolist_list_var = get_treatments_for_condition(fortified_term);
                    SubLObject treatment = (SubLObject)document_annotation_widgets.NIL;
                    treatment = cdolist_list_var.first();
                    while (document_annotation_widgets.NIL != cdolist_list_var) {
                        result = Sequences.cconcatenate(make_justifications(predicate_template(document_annotation_widgets.$const42$standardTreatmentTypeForCondition), treatment, (SubLObject)ConsesLow.list(fortified_term)), result);
                        cdolist_list_var = cdolist_list_var.rest();
                        treatment = cdolist_list_var.first();
                    }
                }
            }
            else if (document_annotation_widgets.NIL != kb_accessors.individualP(fortified_term)) {
                result = make_justifications(predicate_template(document_annotation_widgets.$const45$isa), fortified_term, isa.all_isa(fortified_term, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED));
                if (document_annotation_widgets.NIL != fort_types_interface.city_in_any_mtP(fortified_term)) {
                    result = ConsesLow.append(result, make_justifications(predicate_template(document_annotation_widgets.$const46$inRegion), fortified_term, get_city_regions(fortified_term)));
                }
                else if (document_annotation_widgets.NIL != fort_types_interface.country_in_any_mtP(fortified_term)) {
                    result = ConsesLow.append(result, make_justifications(predicate_template(document_annotation_widgets.$const46$inRegion), fortified_term, get_country_regions(fortified_term)));
                }
                else if (document_annotation_widgets.NIL != agentP(fortified_term)) {
                    result = ConsesLow.append(result, make_justifications(predicate_template(document_annotation_widgets.$const47$hasLeaders), fortified_term, get_groups(fortified_term)));
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 7953L)
    public static SubLObject get_upwards_closure_justifications(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)document_annotation_widgets.NIL;
        if (document_annotation_widgets.NIL == v_memoization_state) {
            return get_upwards_closure_justifications_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)document_annotation_widgets.$sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)document_annotation_widgets.$sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)document_annotation_widgets.$sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_upwards_closure_justifications_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10260L)
    public static SubLObject get_upwards_closure(final SubLObject v_term) {
        SubLObject closure = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = get_upwards_closure_justifications_cached(v_term);
        SubLObject justification = (SubLObject)document_annotation_widgets.NIL;
        justification = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            closure = (SubLObject)ConsesLow.cons(get_closure_justification_genl(justification), closure);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        }
        return closure;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
    public static SubLObject clear_get_upwards_closure_justifications_cached() {
        final SubLObject cs = document_annotation_widgets.$get_upwards_closure_justifications_cached_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
    public static SubLObject remove_get_upwards_closure_justifications_cached(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_upwards_closure_justifications_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
    public static SubLObject get_upwards_closure_justifications_cached_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == file_backed_cache.file_backed_cache_p(document_annotation_widgets.$upwards_closure_justification_fbc$.getDynamicValue(thread))) {
            document_annotation_widgets.$upwards_closure_justification_fbc$.setDynamicValue(file_backed_cache.file_backed_cache_create(document_annotation_widgets.$upwards_closure_justification_fht_path$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
        }
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        result = file_backed_cache.file_backed_cache_lookup(v_term, document_annotation_widgets.$upwards_closure_justification_fbc$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (result == document_annotation_widgets.$kw49$NOT_FOUND) {
            result = get_upwards_closure_justifications(v_term);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 10559L)
    public static SubLObject get_upwards_closure_justifications_cached(final SubLObject v_term) {
        SubLObject caching_state = document_annotation_widgets.$get_upwards_closure_justifications_cached_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED, (SubLObject)document_annotation_widgets.$sym50$_GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_upwards_closure_justifications_cached_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 11282L)
    public static SubLObject caching_upwards_closure_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return document_annotation_widgets.$caching_upwards_closure_justificationsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 11393L)
    public static SubLObject cache_upwards_closure_justifications(SubLObject cache_file) {
        if (cache_file == document_annotation_widgets.UNPROVIDED) {
            cache_file = (SubLObject)document_annotation_widgets.$str51$_cyc_top_data_doc_tagging_upwards;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_annotation_widgets.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject v_cache = file_hash_table.create_file_hash_table(cache_file, forts.fort_count(), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = document_annotation_widgets.$caching_upwards_closure_justificationsP$.currentBinding(thread);
                    try {
                        document_annotation_widgets.$caching_upwards_closure_justificationsP$.bind((SubLObject)document_annotation_widgets.T, thread);
                        final SubLObject table_var;
                        final SubLObject term_fht = table_var = file_hash_table.open_file_hash_table(document_annotation_widgets.$doc_annotator_term_id_fbc_path$.getDynamicValue(thread), file_hash_table.$default_fht_test_function$.getGlobalValue(), (SubLObject)document_annotation_widgets.$kw52$IMAGE_INDEPENDENT_CFASL);
                        utilities_macros.$progress_note$.setDynamicValue((SubLObject)document_annotation_widgets.$str53$Caching_upwards_closure_justifica, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                        final SubLObject _prev_bind_0_$3 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$5 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                            try {
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                SubLObject continuation = (SubLObject)document_annotation_widgets.NIL;
                                SubLObject next;
                                for (SubLObject completeP = (SubLObject)document_annotation_widgets.NIL; document_annotation_widgets.NIL == completeP; completeP = Types.sublisp_null(next)) {
                                    thread.resetMultipleValues();
                                    final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)document_annotation_widgets.NIL);
                                    final SubLObject the_value = thread.secondMultipleValue();
                                    next = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (document_annotation_widgets.NIL != next) {
                                        final SubLObject fort = the_key;
                                        final SubLObject id = the_value;
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.ONE_INTEGER), thread);
                                        final SubLObject value = get_upwards_closure_justifications(fort);
                                        file_hash_table.put_file_hash_table(fort, v_cache, value);
                                    }
                                    continuation = next;
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    utilities_macros.noting_percent_progress_postamble();
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$5, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
                        }
                        file_hash_table.finalize_file_hash_table(v_cache);
                        file_hash_table.finalize_file_hash_table(term_fht);
                    }
                    finally {
                        document_annotation_widgets.$caching_upwards_closure_justificationsP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return cache_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12173L)
    public static SubLObject cache_upwards_closure_justification(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fht = (SubLObject)document_annotation_widgets.NIL;
        try {
            fht = file_hash_table.open_file_hash_table(document_annotation_widgets.$upwards_closure_justification_fht_path$.getDynamicValue(thread), file_hash_table.$default_fht_test_function$.getGlobalValue(), (SubLObject)document_annotation_widgets.$kw52$IMAGE_INDEPENDENT_CFASL);
            final SubLObject _prev_bind_0 = document_annotation_widgets.$caching_upwards_closure_justificationsP$.currentBinding(thread);
            try {
                document_annotation_widgets.$caching_upwards_closure_justificationsP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject value = get_upwards_closure_justifications(v_term);
                file_hash_table.put_file_hash_table(v_term, fht, value);
            }
            finally {
                document_annotation_widgets.$caching_upwards_closure_justificationsP$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (document_annotation_widgets.NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12594L)
    public static SubLObject treatment_for_somethingP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL != genls.genl_in_any_mtP(v_term, document_annotation_widgets.$const54$MedicalDevice) || document_annotation_widgets.NIL != genls.genl_in_any_mtP(v_term, document_annotation_widgets.$const55$MedicalTreatmentEvent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12750L)
    public static SubLObject ailmentP(final SubLObject v_term) {
        return genls.genl_in_any_mtP(v_term, document_annotation_widgets.$const56$AilmentCondition);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12834L)
    public static SubLObject agentP(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, document_annotation_widgets.$const57$IntelligentAgent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
    public static SubLObject clear_get_treated_condition() {
        final SubLObject cs = document_annotation_widgets.$get_treated_condition_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
    public static SubLObject remove_get_treated_condition(final SubLObject device_or_treatment) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_treated_condition_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(device_or_treatment), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
    public static SubLObject get_treated_condition_internal(final SubLObject device_or_treatment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable((SubLObject)document_annotation_widgets.$sym59$_X, (SubLObject)ConsesLow.list(document_annotation_widgets.$const60$or, (SubLObject)ConsesLow.listS(document_annotation_widgets.$const61$deviceTypeTreatsConditionType, device_or_treatment, (SubLObject)document_annotation_widgets.$list62), (SubLObject)ConsesLow.listS(document_annotation_widgets.$const42$standardTreatmentTypeForCondition, device_or_treatment, (SubLObject)document_annotation_widgets.$list62)), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$list63);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 12915L)
    public static SubLObject get_treated_condition(final SubLObject device_or_treatment) {
        SubLObject caching_state = document_annotation_widgets.$get_treated_condition_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym58$GET_TREATED_CONDITION, (SubLObject)document_annotation_widgets.$sym64$_GET_TREATED_CONDITION_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)document_annotation_widgets.$sym65$CLEAR_GET_TREATED_CONDITION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, device_or_treatment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_treated_condition_internal(device_or_treatment)));
            memoization_state.caching_state_put(caching_state, device_or_treatment, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
    public static SubLObject clear_get_treatments_for_condition() {
        final SubLObject cs = document_annotation_widgets.$get_treatments_for_condition_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
    public static SubLObject remove_get_treatments_for_condition(final SubLObject ailment) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_treatments_for_condition_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(ailment), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
    public static SubLObject get_treatments_for_condition_internal(final SubLObject ailment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable((SubLObject)document_annotation_widgets.$sym59$_X, (SubLObject)ConsesLow.list(document_annotation_widgets.$const60$or, (SubLObject)ConsesLow.list(document_annotation_widgets.$const61$deviceTypeTreatsConditionType, (SubLObject)document_annotation_widgets.$sym59$_X, ailment), (SubLObject)ConsesLow.list(document_annotation_widgets.$const42$standardTreatmentTypeForCondition, (SubLObject)document_annotation_widgets.$sym59$_X, ailment)), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$list63);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13221L)
    public static SubLObject get_treatments_for_condition(final SubLObject ailment) {
        SubLObject caching_state = document_annotation_widgets.$get_treatments_for_condition_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym66$GET_TREATMENTS_FOR_CONDITION, (SubLObject)document_annotation_widgets.$sym67$_GET_TREATMENTS_FOR_CONDITION_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)document_annotation_widgets.$sym68$CLEAR_GET_TREATMENTS_FOR_CONDITION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_treatments_for_condition_internal(ailment)));
            memoization_state.caching_state_put(caching_state, ailment, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
    public static SubLObject clear_get_affected_parts() {
        final SubLObject cs = document_annotation_widgets.$get_affected_parts_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
    public static SubLObject remove_get_affected_parts(final SubLObject ailment) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_affected_parts_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(ailment), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
    public static SubLObject get_affected_parts_internal(final SubLObject ailment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable((SubLObject)document_annotation_widgets.$sym59$_X, (SubLObject)ConsesLow.listS(document_annotation_widgets.$const43$ailmentTypeAfflictsPartType, ailment, (SubLObject)document_annotation_widgets.$list62), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13497L)
    public static SubLObject get_affected_parts(final SubLObject ailment) {
        SubLObject caching_state = document_annotation_widgets.$get_affected_parts_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym69$GET_AFFECTED_PARTS, (SubLObject)document_annotation_widgets.$sym70$_GET_AFFECTED_PARTS_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)document_annotation_widgets.$sym71$CLEAR_GET_AFFECTED_PARTS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_affected_parts_internal(ailment)));
            memoization_state.caching_state_put(caching_state, ailment, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
    public static SubLObject clear_get_cooccurring_conditions() {
        final SubLObject cs = document_annotation_widgets.$get_cooccurring_conditions_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
    public static SubLObject remove_get_cooccurring_conditions(final SubLObject ailment) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_cooccurring_conditions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(ailment), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
    public static SubLObject get_cooccurring_conditions_internal(final SubLObject ailment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable((SubLObject)document_annotation_widgets.$sym59$_X, (SubLObject)ConsesLow.listS(document_annotation_widgets.$const44$conditionsCommonlyCooccur, ailment, (SubLObject)document_annotation_widgets.$list62), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13667L)
    public static SubLObject get_cooccurring_conditions(final SubLObject ailment) {
        SubLObject caching_state = document_annotation_widgets.$get_cooccurring_conditions_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym72$GET_COOCCURRING_CONDITIONS, (SubLObject)document_annotation_widgets.$sym73$_GET_COOCCURRING_CONDITIONS_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)document_annotation_widgets.$sym74$CLEAR_GET_COOCCURRING_CONDITIONS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_cooccurring_conditions_internal(ailment)));
            memoization_state.caching_state_put(caching_state, ailment, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 13843L)
    public static SubLObject get_groups(final SubLObject agent) {
        if (document_annotation_widgets.NIL != caching_upwards_closure_justificationsP()) {
            return list_utilities.alist_lookup_without_values(leaders_to_groups(), agent, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return get_groups_non_cached(agent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14042L)
    public static SubLObject get_groups_non_cached(final SubLObject agent) {
        if (document_annotation_widgets.NIL == forts.fort_p(narts_high.nart_substitute(agent))) {
            return (SubLObject)document_annotation_widgets.NIL;
        }
        return ask_utilities.query_template((SubLObject)document_annotation_widgets.$sym75$_GROUP, (SubLObject)ConsesLow.list(document_annotation_widgets.$const47$hasLeaders, (SubLObject)document_annotation_widgets.$sym75$_GROUP, agent), document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
    public static SubLObject clear_leaders_to_groups() {
        final SubLObject cs = document_annotation_widgets.$leaders_to_groups_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
    public static SubLObject remove_leaders_to_groups() {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$leaders_to_groups_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(document_annotation_widgets.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
    public static SubLObject leaders_to_groups_internal() {
        SubLObject alist = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = ask_utilities.query_template((SubLObject)document_annotation_widgets.$list79, (SubLObject)document_annotation_widgets.$list80, document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject pair = (SubLObject)document_annotation_widgets.NIL;
        pair = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject leader = (SubLObject)document_annotation_widgets.NIL;
            SubLObject group = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list78);
            leader = current.first();
            current = (group = current.rest());
            alist = list_utilities.alist_pushnew(alist, leader, group, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14227L)
    public static SubLObject leaders_to_groups() {
        SubLObject caching_state = document_annotation_widgets.$leaders_to_groups_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym77$LEADERS_TO_GROUPS, (SubLObject)document_annotation_widgets.$sym81$_LEADERS_TO_GROUPS_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(leaders_to_groups_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14550L)
    public static SubLObject get_city_regions(final SubLObject city) {
        SubLObject regions = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = get_city_countries(city);
        SubLObject country = (SubLObject)document_annotation_widgets.NIL;
        country = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            regions = (SubLObject)ConsesLow.cons(country, regions);
            regions = ConsesLow.append(get_country_regions(country), regions);
            cdolist_list_var = cdolist_list_var.rest();
            country = cdolist_list_var.first();
        }
        return regions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14783L)
    public static SubLObject get_city_countries(final SubLObject city) {
        if (document_annotation_widgets.NIL != caching_upwards_closure_justificationsP()) {
            return list_utilities.alist_lookup_without_values(cities_to_countries(), city, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return get_city_countries_non_cached(city);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
    public static SubLObject clear_cities_to_countries() {
        final SubLObject cs = document_annotation_widgets.$cities_to_countries_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
    public static SubLObject remove_cities_to_countries() {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$cities_to_countries_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(document_annotation_widgets.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
    public static SubLObject cities_to_countries_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)document_annotation_widgets.$str83$Caching_countries_of_all_cities__);
                final SubLObject template = (SubLObject)document_annotation_widgets.$list84;
                final SubLObject sentence = (SubLObject)document_annotation_widgets.$list85;
                SubLObject cdolist_list_var;
                final SubLObject pairs = cdolist_list_var = ask_utilities.query_template(template, sentence, document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED);
                SubLObject pair = (SubLObject)document_annotation_widgets.NIL;
                pair = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = pair;
                    SubLObject city = (SubLObject)document_annotation_widgets.NIL;
                    SubLObject country = (SubLObject)document_annotation_widgets.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list86);
                    city = current.first();
                    current = (country = current.rest());
                    alist = list_utilities.alist_pushnew(alist, city, country, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    pair = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 14997L)
    public static SubLObject cities_to_countries() {
        SubLObject caching_state = document_annotation_widgets.$cities_to_countries_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym82$CITIES_TO_COUNTRIES, (SubLObject)document_annotation_widgets.$sym87$_CITIES_TO_COUNTRIES_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cities_to_countries_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 15453L)
    public static SubLObject get_city_countries_non_cached(final SubLObject city) {
        if (document_annotation_widgets.NIL != forts.fort_p(narts_high.nart_substitute(city))) {
            return ask_utilities.query_template((SubLObject)document_annotation_widgets.$sym88$_COUNTRY, (SubLObject)ConsesLow.list(document_annotation_widgets.$const89$countryOfCity, (SubLObject)document_annotation_widgets.$sym88$_COUNTRY, city), document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 15641L)
    public static SubLObject get_country_regions(final SubLObject country) {
        if (document_annotation_widgets.NIL != caching_upwards_closure_justificationsP()) {
            return list_utilities.alist_lookup_without_values(countries_to_regions(), country, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return get_country_regions_non_cached(country);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 15867L)
    public static SubLObject get_country_regions_non_cached(final SubLObject country) {
        if (document_annotation_widgets.NIL != forts.fort_p(narts_high.nart_substitute(country))) {
            return ask_utilities.query_template((SubLObject)document_annotation_widgets.$sym90$_REGION, (SubLObject)ConsesLow.listS(document_annotation_widgets.$const91$and, (SubLObject)document_annotation_widgets.$list92, (SubLObject)ConsesLow.listS(document_annotation_widgets.$const45$isa, country, (SubLObject)document_annotation_widgets.$list93), (SubLObject)document_annotation_widgets.$list94), document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
    public static SubLObject clear_countries_to_regions() {
        final SubLObject cs = document_annotation_widgets.$countries_to_regions_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
    public static SubLObject remove_countries_to_regions() {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$countries_to_regions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(document_annotation_widgets.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
    public static SubLObject countries_to_regions_internal() {
        SubLObject alist = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = ask_utilities.query_template((SubLObject)document_annotation_widgets.$list97, (SubLObject)document_annotation_widgets.$list98, document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject pair = (SubLObject)document_annotation_widgets.NIL;
        pair = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject country = (SubLObject)document_annotation_widgets.NIL;
            SubLObject region = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list96);
            country = current.first();
            current = (region = current.rest());
            alist = list_utilities.alist_pushnew(alist, country, region, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16204L)
    public static SubLObject countries_to_regions() {
        SubLObject caching_state = document_annotation_widgets.$countries_to_regions_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym95$COUNTRIES_TO_REGIONS, (SubLObject)document_annotation_widgets.$sym99$_COUNTRIES_TO_REGIONS_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQL, (SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(countries_to_regions_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 16678L)
    public static SubLObject with_dual_lucene_sessions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject semantic_session = (SubLObject)document_annotation_widgets.NIL;
        SubLObject keyword_session = (SubLObject)document_annotation_widgets.NIL;
        SubLObject host = (SubLObject)document_annotation_widgets.NIL;
        SubLObject port = (SubLObject)document_annotation_widgets.NIL;
        SubLObject text_index_file = (SubLObject)document_annotation_widgets.NIL;
        SubLObject sem_index_file = (SubLObject)document_annotation_widgets.NIL;
        SubLObject overwriteP = (SubLObject)document_annotation_widgets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        semantic_session = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        keyword_session = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        host = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        port = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        text_index_file = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        sem_index_file = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list100);
        overwriteP = current.first();
        current = current.rest();
        if (document_annotation_widgets.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document_annotation_widgets.$sym101$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(keyword_session, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym102$NEW_LUCENE_SESSION, host, port, text_index_file, (SubLObject)document_annotation_widgets.$kw103$TEXT, overwriteP)), (SubLObject)ConsesLow.list(semantic_session, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym102$NEW_LUCENE_SESSION, host, port, sem_index_file, (SubLObject)document_annotation_widgets.$kw104$CYC, overwriteP))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym105$LUCENE_OPTIMIZE, keyword_session), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym105$LUCENE_OPTIMIZE, semantic_session), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym106$LUCENE_FINALIZE, keyword_session), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym106$LUCENE_FINALIZE, semantic_session))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list100);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 17222L)
    public static SubLObject add_fully_indexed_documents_from_dir(final SubLObject directory, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file, final SubLObject overwriteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_annotation_widgets.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject keyword_session = lucene_session.new_lucene_session(host, port, text_index_file, (SubLObject)document_annotation_widgets.$kw103$TEXT, overwriteP);
            final SubLObject semantic_session = lucene_session.new_lucene_session(host, port, sem_index_file, (SubLObject)document_annotation_widgets.$kw104$CYC, overwriteP);
            if (document_annotation_widgets.NIL != overwriteP) {
                file_utilities.delete_file_if_exists(Sequences.cconcatenate(lucene_session.lucene_index(semantic_session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt));
                file_utilities.delete_file_if_exists(Sequences.cconcatenate(lucene_session.lucene_index(keyword_session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt));
            }
            assert document_annotation_widgets.NIL != Filesys.directory_p(directory) : directory;
            SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)document_annotation_widgets.T);
            final SubLObject progress_message_var = (SubLObject)document_annotation_widgets.$str109$Indexing_files;
            final SubLObject _prev_bind_0_$9 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                if (document_annotation_widgets.NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$10 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$11 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$12 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((document_annotation_widgets.NIL != progress_message_var) ? progress_message_var : document_annotation_widgets.$str110$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = (SubLObject)document_annotation_widgets.NIL;
                        file = csome_list_var.first();
                        while (document_annotation_widgets.NIL != csome_list_var) {
                            if (document_annotation_widgets.NIL == Filesys.directory_p(file)) {
                                final SubLObject local_state;
                                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                                final SubLObject _prev_bind_0_$11 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject doc_string = string_utilities.read_string_from_file(file, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        add_fully_indexed_document(doc_string, file, (SubLObject)document_annotation_widgets.$str111$, semantic_session, keyword_session);
                                        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(keyword_session, semantic_session);
                                        SubLObject session = (SubLObject)document_annotation_widgets.NIL;
                                        session = cdolist_list_var.first();
                                        while (document_annotation_widgets.NIL != cdolist_list_var) {
                                            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
                                            try {
                                                stream = compatibility.open_text(Sequences.cconcatenate(lucene_session.lucene_index(session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                                                if (!stream.isStream()) {
                                                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, Sequences.cconcatenate(lucene_session.lucene_index(session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt));
                                                }
                                                final SubLObject s = stream;
                                                PrintLow.format(s, (SubLObject)document_annotation_widgets.$str114$_A__, file);
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (stream.isStream()) {
                                                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            session = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_2_$12, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$11, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$10, thread);
                }
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0_$9, thread);
            }
            lucene_session.lucene_optimize(keyword_session);
            lucene_session.lucene_optimize(semantic_session);
            lucene_session.lucene_finalize(keyword_session);
            lucene_session.lucene_finalize(semantic_session);
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_annotation_widgets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 18315L)
    public static SubLObject add_fully_indexed_documents(final SubLObject doc_strings, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file, final SubLObject overwriteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyword_session = lucene_session.new_lucene_session(host, port, text_index_file, (SubLObject)document_annotation_widgets.$kw103$TEXT, overwriteP);
        final SubLObject semantic_session = lucene_session.new_lucene_session(host, port, sem_index_file, (SubLObject)document_annotation_widgets.$kw104$CYC, overwriteP);
        SubLObject cdolist_list_var = doc_strings;
        SubLObject doc_string = (SubLObject)document_annotation_widgets.NIL;
        doc_string = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    add_fully_indexed_document(doc_string, (SubLObject)document_annotation_widgets.$str111$, (SubLObject)document_annotation_widgets.$str111$, semantic_session, keyword_session);
                }
                finally {
                    final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            doc_string = cdolist_list_var.first();
        }
        lucene_session.lucene_optimize(keyword_session);
        lucene_session.lucene_optimize(semantic_session);
        lucene_session.lucene_finalize(keyword_session);
        lucene_session.lucene_finalize(semantic_session);
        return (SubLObject)document_annotation_widgets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 20169L)
    public static SubLObject tag_xml_documents_with_urls(final SubLObject filespecs, SubLObject overwriteP, SubLObject out_directory) {
        if (overwriteP == document_annotation_widgets.UNPROVIDED) {
            overwriteP = (SubLObject)document_annotation_widgets.NIL;
        }
        if (out_directory == document_annotation_widgets.UNPROVIDED) {
            out_directory = (SubLObject)document_annotation_widgets.$str133$_host_george_scratch_tagged_docs_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_annotation_widgets.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$20 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$21 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)document_annotation_widgets.$str134$Tagging_files, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(filespecs), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = filespecs;
                            SubLObject filespec = (SubLObject)document_annotation_widgets.NIL;
                            filespec = csome_list_var.first();
                            while (document_annotation_widgets.NIL != csome_list_var) {
                                tag_xml_document_filespec(filespec, overwriteP, out_directory, disambiguator);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                filespec = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_2_$21, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$20, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$19, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$18, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_annotation_widgets.$kw135$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 21099L)
    public static SubLObject tag_xml_document_filespec(final SubLObject filespec, final SubLObject overwriteP, final SubLObject out_directory, SubLObject disambiguator) {
        if (disambiguator == document_annotation_widgets.UNPROVIDED) {
            disambiguator = (SubLObject)document_annotation_widgets.$kw136$NEW;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_disambiguator = Equality.eq(disambiguator, (SubLObject)document_annotation_widgets.$kw136$NEW);
        SubLObject original_file = (SubLObject)document_annotation_widgets.NIL;
        SubLObject text_file_path = (SubLObject)document_annotation_widgets.NIL;
        SubLObject url = (SubLObject)document_annotation_widgets.NIL;
        SubLObject parent_file = (SubLObject)document_annotation_widgets.NIL;
        if (document_annotation_widgets.NIL != new_disambiguator) {
            disambiguator = rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        if (filespec.isString()) {
            original_file = filespec;
            text_file_path = filespec;
        }
        if (filespec.isList()) {
            SubLObject org_file = (SubLObject)document_annotation_widgets.NIL;
            SubLObject text_fpath = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(filespec, filespec, (SubLObject)document_annotation_widgets.$list137);
            org_file = filespec.first();
            SubLObject current = filespec.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, filespec, (SubLObject)document_annotation_widgets.$list137);
            text_fpath = current.first();
            current = current.rest();
            final SubLObject the_url = (SubLObject)(current.isCons() ? current.first() : document_annotation_widgets.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, filespec, (SubLObject)document_annotation_widgets.$list137);
            current = current.rest();
            final SubLObject the_parent = (SubLObject)(current.isCons() ? current.first() : document_annotation_widgets.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, filespec, (SubLObject)document_annotation_widgets.$list137);
            current = current.rest();
            if (document_annotation_widgets.NIL == current) {
                original_file = org_file;
                text_file_path = text_fpath;
                url = the_url;
                parent_file = the_parent;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(filespec, (SubLObject)document_annotation_widgets.$list137);
            }
        }
        Errors.warn((SubLObject)document_annotation_widgets.$str138$_S_tagging__S__, numeric_date_utilities.timestamp((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), text_file_path);
        thread.resetMultipleValues();
        final SubLObject path = file_utilities.deconstruct_path(text_file_path);
        final SubLObject filename = thread.secondMultipleValue();
        final SubLObject type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (document_annotation_widgets.NIL != Filesys.probe_file(text_file_path)) {
            final SubLObject out_file = Sequences.cconcatenate(out_directory, new SubLObject[] { string_utilities.post_remove(filename, (SubLObject)document_annotation_widgets.$str139$_txt, (SubLObject)document_annotation_widgets.UNPROVIDED), document_annotation_widgets.$str140$_cyc_idx });
            if (document_annotation_widgets.NIL == string_utilities.ends_with(original_file, (SubLObject)document_annotation_widgets.$str140$_cyc_idx, (SubLObject)document_annotation_widgets.UNPROVIDED) && (document_annotation_widgets.NIL != overwriteP || document_annotation_widgets.NIL == Filesys.probe_file(out_file))) {
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        SubLObject current2;
                        final SubLObject datum = current2 = read_original_doc(text_file_path);
                        SubLObject title = (SubLObject)document_annotation_widgets.NIL;
                        SubLObject doc_text = (SubLObject)document_annotation_widgets.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)document_annotation_widgets.$list141);
                        title = current2.first();
                        current2 = current2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum, (SubLObject)document_annotation_widgets.$list141);
                        doc_text = current2.first();
                        current2 = current2.rest();
                        if (document_annotation_widgets.NIL == current2) {
                            if (document_annotation_widgets.NIL != doc_text) {
                                if (document_annotation_widgets.NIL != Sequences.search((SubLObject)document_annotation_widgets.$str142$_, doc_text, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED) || document_annotation_widgets.NIL != Sequences.search((SubLObject)document_annotation_widgets.$str143$_, doc_text, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                                    doc_text = string_utilities.remove_substring(string_utilities.remove_substring(doc_text, (SubLObject)document_annotation_widgets.$str142$_), (SubLObject)document_annotation_widgets.$str143$_);
                                }
                                SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
                                try {
                                    stream = compatibility.open_text(text_file_path, (SubLObject)document_annotation_widgets.$kw144$OUTPUT);
                                    if (!stream.isStream()) {
                                        Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, text_file_path);
                                    }
                                    final SubLObject s = stream;
                                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(s, thread);
                                        final SubLObject name_var = (SubLObject)document_annotation_widgets.$str145$Doc;
                                        xml_utilities.xml_start_tag_internal(name_var, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        final SubLObject name_var_$25 = document_annotation_widgets.$tagged_doc_title_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$25, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        xml_utilities.xml_markup(title);
                                        xml_utilities.xml_end_tag_internal(name_var_$25);
                                        final SubLObject name_var_$26 = document_annotation_widgets.$tagged_doc_text_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$26, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        xml_utilities.xml_markup(doc_text);
                                        xml_utilities.xml_end_tag_internal(name_var_$26);
                                        if (parent_file.isString()) {
                                            final SubLObject name_var_$27 = document_annotation_widgets.$tagged_doc_parent_filename_name$.getGlobalValue();
                                            xml_utilities.xml_start_tag_internal(name_var_$27, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                            xml_utilities.xml_markup(parent_file);
                                            xml_utilities.xml_end_tag_internal(name_var_$27);
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var);
                                    }
                                    finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (stream.isStream()) {
                                            streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                                stream = (SubLObject)document_annotation_widgets.NIL;
                                try {
                                    stream = compatibility.open_text(out_file, (SubLObject)document_annotation_widgets.$kw144$OUTPUT);
                                    if (!stream.isStream()) {
                                        Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, out_file);
                                    }
                                    final SubLObject out = stream;
                                    final SubLObject _prev_bind_0_$26 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(out, thread);
                                        SubLObject tagged_doc_text = tag_document_for_indexing_with_offsets(doc_text, disambiguator, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        if (document_annotation_widgets.NIL == tagged_doc_text) {
                                            Errors.warn((SubLObject)document_annotation_widgets.$str146$There_is_no_text_in_the_body_of_t);
                                            tagged_doc_text = (SubLObject)document_annotation_widgets.$str111$;
                                        }
                                        final SubLObject name_var2 = (SubLObject)document_annotation_widgets.$str145$Doc;
                                        xml_utilities.xml_start_tag_internal(name_var2, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        final SubLObject name_var_$28 = document_annotation_widgets.$tagged_doc_title_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$28, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        xml_utilities.xml_markup(title);
                                        xml_utilities.xml_end_tag_internal(name_var_$28);
                                        final SubLObject name_var_$29 = document_annotation_widgets.$tagged_doc_original_filename_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$29, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        xml_utilities.xml_markup(original_file);
                                        xml_utilities.xml_end_tag_internal(name_var_$29);
                                        if (document_annotation_widgets.NIL != url) {
                                            final SubLObject name_var_$30 = document_annotation_widgets.$tagged_doc_url_name$.getGlobalValue();
                                            xml_utilities.xml_start_tag_internal(name_var_$30, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                            xml_utilities.xml_markup(url);
                                            xml_utilities.xml_end_tag_internal(name_var_$30);
                                        }
                                        xml_utilities.xml_terpri();
                                        if (parent_file.isString()) {
                                            final SubLObject name_var_$31 = document_annotation_widgets.$tagged_doc_parent_filename_name$.getGlobalValue();
                                            xml_utilities.xml_start_tag_internal(name_var_$31, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                            xml_utilities.xml_markup(parent_file);
                                            xml_utilities.xml_end_tag_internal(name_var_$31);
                                            xml_utilities.xml_terpri();
                                        }
                                        final SubLObject name_var_$32 = document_annotation_widgets.$tagged_doc_keystring_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$32, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        xml_utilities.xml_write_string(tagged_doc_text, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        xml_utilities.xml_end_tag_internal(name_var_$32);
                                        xml_utilities.xml_end_tag_internal(name_var2);
                                    }
                                    finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$26, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (stream.isStream()) {
                                            streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list141);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            Errors.warn((SubLObject)document_annotation_widgets.$str147$Couldn_t_find_source_file__S__Mov, text_file_path);
        }
        if (document_annotation_widgets.NIL != new_disambiguator) {
            rule_disambiguation.finalize_rule_disambiguator(disambiguator);
        }
        return (SubLObject)document_annotation_widgets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 24790L)
    public static SubLObject read_original_doc(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doc_string = (SubLObject)document_annotation_widgets.$str111$;
        SubLObject title = (SubLObject)document_annotation_widgets.$str111$;
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(path, (SubLObject)document_annotation_widgets.$kw148$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, path);
            }
            final SubLObject s = stream;
            SubLObject tokens = xml_parsing_utilities.xml_tokenize(s, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
            while (document_annotation_widgets.NIL != tokens) {
                final SubLObject token_head = tokens.first();
                if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_title_token$.getGlobalValue())) {
                    if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(conses_high.second(tokens), document_annotation_widgets.$tagged_doc_title_close_token$.getGlobalValue())) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.TWO_INTEGER);
                    }
                    else {
                        title = conses_high.second(tokens);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
                    }
                }
                else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_text_token$.getGlobalValue())) {
                    final SubLObject close_tag_location = xml_parsing_utilities.next_xml_token_position(tokens, document_annotation_widgets.$tagged_doc_text_close_token$.getGlobalValue(), (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject text_tokens = Sequences.subseq(tokens, (SubLObject)document_annotation_widgets.ONE_INTEGER, close_tag_location);
                    final SubLObject text = doc_string = Functions.apply((SubLObject)document_annotation_widgets.$sym149$CCONCATENATE, text_tokens);
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, close_tag_location);
                }
                else {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)ConsesLow.list(title, doc_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 25773L)
    public static SubLObject tag_xml_doc_set_with_urls(final SubLObject filename, SubLObject overwriteP, SubLObject out_directory) {
        if (overwriteP == document_annotation_widgets.UNPROVIDED) {
            overwriteP = (SubLObject)document_annotation_widgets.NIL;
        }
        if (out_directory == document_annotation_widgets.UNPROVIDED) {
            out_directory = document_annotation_widgets.$tagged_xml_doc_directory$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject file_list = (SubLObject)document_annotation_widgets.NIL;
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)document_annotation_widgets.$kw148$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject in_file;
                SubLObject line;
                for (in_file = (SubLObject)document_annotation_widgets.NIL, in_file = file_utilities.cdolines_get_next_line(infile); document_annotation_widgets.NIL != in_file; in_file = file_utilities.cdolines_get_next_line(infile)) {
                    line = reader.read_from_string_ignoring_errors(in_file, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    if (line.isList()) {
                        file_list = (SubLObject)ConsesLow.cons(line, file_list);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return tag_xml_documents_with_urls(file_list, overwriteP, out_directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 26688L)
    public static SubLObject index_xml_doc_set_from_map_file(final SubLObject filename, final SubLObject out_dir, SubLObject overwriteP, SubLObject port, SubLObject tagged_doc_directory, SubLObject lucene_host) {
        if (overwriteP == document_annotation_widgets.UNPROVIDED) {
            overwriteP = (SubLObject)document_annotation_widgets.T;
        }
        if (port == document_annotation_widgets.UNPROVIDED) {
            port = lucene_session.get_lucene_port();
        }
        if (tagged_doc_directory == document_annotation_widgets.UNPROVIDED) {
            tagged_doc_directory = document_annotation_widgets.$tagged_xml_doc_directory$.getDynamicValue();
        }
        if (lucene_host == document_annotation_widgets.UNPROVIDED) {
            lucene_host = lucene_session.get_lucene_host();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text_index_file = Sequences.cconcatenate(out_dir, document_annotation_widgets.$text_index_dir_name$.getDynamicValue(thread));
        final SubLObject sem_index_file = Sequences.cconcatenate(out_dir, document_annotation_widgets.$semantic_index_dir_name$.getDynamicValue(thread));
        SubLObject file_list = (SubLObject)document_annotation_widgets.NIL;
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)document_annotation_widgets.$kw148$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject file_line_as_list;
                SubLObject txt_file;
                SubLObject path;
                SubLObject simple_filename;
                SubLObject type;
                for (line = (SubLObject)document_annotation_widgets.NIL, line = file_utilities.cdolines_get_next_line(infile); document_annotation_widgets.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    file_line_as_list = reader.read_from_string_ignoring_errors(line, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    if (file_line_as_list.isList()) {
                        txt_file = conses_high.second(file_line_as_list);
                        thread.resetMultipleValues();
                        path = file_utilities.deconstruct_path(txt_file);
                        simple_filename = thread.secondMultipleValue();
                        type = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        file_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Sequences.cconcatenate(tagged_doc_directory, new SubLObject[] { string_utilities.post_remove(simple_filename, (SubLObject)document_annotation_widgets.$str139$_txt, (SubLObject)document_annotation_widgets.UNPROVIDED), document_annotation_widgets.$str140$_cyc_idx }), txt_file), file_list);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return index_pre_tagged_xml_docs(file_list, lucene_host, port, text_index_file, sem_index_file, overwriteP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 28246L)
    public static SubLObject index_pre_tagged_xml_docs(final SubLObject filenames, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file, final SubLObject overwriteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyword_session = lucene_session.new_lucene_session(host, port, text_index_file, (SubLObject)document_annotation_widgets.$kw103$TEXT, overwriteP);
        final SubLObject semantic_session = lucene_session.new_lucene_session(host, port, sem_index_file, (SubLObject)document_annotation_widgets.$kw104$CYC, overwriteP);
        if (document_annotation_widgets.NIL != overwriteP) {
            file_utilities.delete_file_if_exists(Sequences.cconcatenate(lucene_session.lucene_index(semantic_session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt));
            file_utilities.delete_file_if_exists(Sequences.cconcatenate(lucene_session.lucene_index(keyword_session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt));
        }
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)document_annotation_widgets.$str109$Indexing_files, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(filenames), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = filenames;
                SubLObject file = (SubLObject)document_annotation_widgets.NIL;
                file = csome_list_var.first();
                while (document_annotation_widgets.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = file;
                    SubLObject idx_file = (SubLObject)document_annotation_widgets.NIL;
                    SubLObject txt_file = (SubLObject)document_annotation_widgets.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list150);
                    idx_file = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list150);
                    txt_file = current.first();
                    current = current.rest();
                    if (document_annotation_widgets.NIL == current) {
                        if (document_annotation_widgets.NIL == Filesys.directory_p(idx_file) && document_annotation_widgets.NIL != string_utilities.ends_with(idx_file, (SubLObject)document_annotation_widgets.$str140$_cyc_idx, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                            SubLObject error_message = (SubLObject)document_annotation_widgets.NIL;
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)document_annotation_widgets.$sym151$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        index_pre_tagged_xml_doc(idx_file, txt_file, keyword_session, semantic_session);
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)document_annotation_widgets.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (document_annotation_widgets.NIL != error_message) {
                                Errors.warn((SubLObject)document_annotation_widgets.$str152$problem_indexing__a_____moving_on, file, error_message);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list150);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    file = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        lucene_session.lucene_optimize(keyword_session);
        lucene_session.lucene_optimize(semantic_session);
        lucene_session.lucene_finalize(keyword_session);
        lucene_session.lucene_finalize(semantic_session);
        return (SubLObject)document_annotation_widgets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 29859L)
    public static SubLObject index_pre_tagged_xml_doc(final SubLObject idx_doc_name, final SubLObject txt_xml_doc_name, final SubLObject keyword_session, final SubLObject semantic_session) {
        SubLObject original_filename = (SubLObject)document_annotation_widgets.$str111$;
        SubLObject key_string = (SubLObject)document_annotation_widgets.$str111$;
        SubLObject confirmed_concepts_key_string = (SubLObject)document_annotation_widgets.$str111$;
        SubLObject title = (SubLObject)document_annotation_widgets.$str111$;
        final SubLObject text_xml = string_utilities.read_string_from_file(txt_xml_doc_name, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject tokens = xml_parsing_utilities.xml_string_tokenize(text_xml, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject url = (SubLObject)document_annotation_widgets.$str111$;
        SubLObject parent_file = (SubLObject)document_annotation_widgets.NIL;
        SubLObject text = (SubLObject)document_annotation_widgets.NIL;
        while (document_annotation_widgets.NIL != tokens) {
            final SubLObject token_head = tokens.first();
            if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_original_filename_token$.getGlobalValue())) {
                original_filename = conses_high.second(tokens);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_parent_filename_token$.getGlobalValue())) {
                parent_file = conses_high.second(tokens);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_keystring_token$.getGlobalValue())) {
                key_string = conses_high.second(tokens);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_url_token$.getGlobalValue())) {
                url = conses_high.second(tokens);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_title_token$.getGlobalValue())) {
                if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(conses_high.second(tokens), document_annotation_widgets.$tagged_doc_title_close_token$.getGlobalValue())) {
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.TWO_INTEGER);
                }
                else {
                    title = conses_high.second(tokens);
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
                }
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head, document_annotation_widgets.$tagged_doc_text_token$.getGlobalValue())) {
                text = conses_high.second(tokens);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else {
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)document_annotation_widgets.UNPROVIDED);
            }
        }
        final SubLObject idx_xml = string_utilities.read_string_from_file(idx_doc_name, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject tokens_$39 = xml_parsing_utilities.xml_string_tokenize(idx_xml, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        while (document_annotation_widgets.NIL != tokens_$39) {
            final SubLObject token_head2 = tokens_$39.first();
            if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head2, document_annotation_widgets.$tagged_doc_original_filename_token$.getGlobalValue())) {
                original_filename = conses_high.second(tokens_$39);
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head2, document_annotation_widgets.$tagged_doc_keystring_token$.getGlobalValue())) {
                key_string = conses_high.second(tokens_$39);
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head2, document_annotation_widgets.$tagged_doc_confirmed_concepts_keystring_token$.getGlobalValue())) {
                confirmed_concepts_key_string = conses_high.second(tokens_$39);
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head2, document_annotation_widgets.$tagged_doc_title_token$.getGlobalValue())) {
                if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(conses_high.second(tokens_$39), document_annotation_widgets.$tagged_doc_title_close_token$.getGlobalValue())) {
                    tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.TWO_INTEGER);
                }
                else {
                    title = conses_high.second(tokens_$39);
                    tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.THREE_INTEGER);
                }
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head2, document_annotation_widgets.$tagged_doc_text_token$.getGlobalValue())) {
                text = conses_high.second(tokens_$39);
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_token_matches(token_head2, document_annotation_widgets.$tagged_doc_url_token$.getGlobalValue())) {
                url = conses_high.second(tokens_$39);
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.THREE_INTEGER);
            }
            else {
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, (SubLObject)document_annotation_widgets.UNPROVIDED);
            }
        }
        if (document_annotation_widgets.NIL != string_utilities.empty_string_p(url)) {
            url = Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str153$http___doc_cyc_com_, format_nil.format_nil_a_no_copy(string_utilities.pre_remove(original_filename, (SubLObject)document_annotation_widgets.$str154$_cyc_, (SubLObject)document_annotation_widgets.UNPROVIDED)));
        }
        Errors.warn((SubLObject)document_annotation_widgets.$str155$title___S__, title);
        Errors.warn((SubLObject)document_annotation_widgets.$str156$url___S__, url);
        SubLObject semantics = (SubLObject)ConsesLow.list(semantic_session, text, key_string, confirmed_concepts_key_string, url, title, lucene_session.default_lucene_confirmed_terms_boost());
        if (parent_file.isString()) {
            semantics = ConsesLow.append(semantics, (SubLObject)ConsesLow.list(parent_file));
        }
        Functions.apply((SubLObject)document_annotation_widgets.$sym157$LUCENE_ADD_DOCUMENT, semantics);
        lucene_session.lucene_add_document(keyword_session, text, text, (SubLObject)document_annotation_widgets.$str111$, url, title, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(keyword_session, semantic_session);
        SubLObject session = (SubLObject)document_annotation_widgets.NIL;
        session = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                stream = compatibility.open_text(Sequences.cconcatenate(lucene_session.lucene_index(session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, Sequences.cconcatenate(lucene_session.lucene_index(session), (SubLObject)document_annotation_widgets.$str107$_indexed_docs_txt));
                }
                final SubLObject s = stream;
                PrintLow.format(s, (SubLObject)document_annotation_widgets.$str114$_A__, idx_doc_name);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document_annotation_widgets.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            session = cdolist_list_var.first();
        }
        return (SubLObject)document_annotation_widgets.$kw135$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 33853L)
    public static SubLObject lucene_add_document_semantic(final SubLObject session, final SubLObject text, final SubLObject keystring, final SubLObject confirmed_term_keystring, final SubLObject url, final SubLObject title) {
        return lucene_session.lucene_add_document(session, text, keystring, confirmed_term_keystring, url, title, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34047L)
    public static SubLObject lucene_add_document_keyword(final SubLObject session, final SubLObject text, final SubLObject url, final SubLObject title) {
        return lucene_session.lucene_add_document(session, text, text, (SubLObject)document_annotation_widgets.$str111$, url, title, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34178L)
    public static SubLObject add_fully_indexed_document(final SubLObject doc_string, final SubLObject url, final SubLObject title, final SubLObject sem_session, final SubLObject keyword_session) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject keystring = tag_document_for_indexing_with_offsets(doc_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject confirmed_term_keystring = thread.secondMultipleValue();
        thread.resetMultipleValues();
        lucene_add_document_semantic(sem_session, doc_string, keystring, confirmed_term_keystring, url, title);
        lucene_add_document_keyword(keyword_session, doc_string, url, title);
        return (SubLObject)document_annotation_widgets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34590L)
    public static SubLObject print_offset_info(final SubLObject stream, final SubLObject offset, final SubLObject end) {
        print_high.princ(offset, stream);
        print_high.princ((SubLObject)document_annotation_widgets.$str142$_, stream);
        print_high.princ(end, stream);
        print_high.princ((SubLObject)document_annotation_widgets.$str142$_, stream);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34747L)
    public static SubLObject print_term_and_reln(final SubLObject stream, final SubLObject v_term, final SubLObject reln) {
        print_high.princ(reln, stream);
        print_high.princ((SubLObject)document_annotation_widgets.$str143$_, stream);
        print_high.princ(v_term, stream);
        print_high.princ((SubLObject)document_annotation_widgets.$str142$_, stream);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 34902L)
    public static SubLObject print_token(final SubLObject stream, final SubLObject offset, final SubLObject end, final SubLObject term_reln_pairs) {
        print_offset_info(stream, offset, end);
        SubLObject cdolist_list_var = term_reln_pairs;
        SubLObject term_reln_pair = (SubLObject)document_annotation_widgets.NIL;
        term_reln_pair = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            print_term_and_reln(stream, term_reln_pair.first(), conses_high.second(term_reln_pair));
            cdolist_list_var = cdolist_list_var.rest();
            term_reln_pair = cdolist_list_var.first();
        }
        print_high.princ((SubLObject)document_annotation_widgets.$str159$_, stream);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 35166L)
    public static SubLObject new_tagged_document(final SubLObject doc_string, SubLObject lexicon, SubLObject disambiguateP, SubLObject tagger, SubLObject sentencifyP) {
        if (lexicon == document_annotation_widgets.UNPROVIDED) {
            lexicon = get_default_document_annotation_lexicon((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        if (disambiguateP == document_annotation_widgets.UNPROVIDED) {
            disambiguateP = (SubLObject)document_annotation_widgets.NIL;
        }
        if (tagger == document_annotation_widgets.UNPROVIDED) {
            tagger = (SubLObject)document_annotation_widgets.$sym160$POS_TAGGING_CONCEPT_TAGGER;
        }
        if (sentencifyP == document_annotation_widgets.UNPROVIDED) {
            sentencifyP = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert document_annotation_widgets.NIL != Types.stringp(doc_string) : doc_string;
        final SubLObject _prev_bind_0 = document.$perform_dot_analysis_on_docs$.currentBinding(thread);
        try {
            document.$perform_dot_analysis_on_docs$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject doc = document.new_document(doc_string, sentencifyP, (SubLObject)document_annotation_widgets.UNPROVIDED);
            final SubLObject si = concept_tagger.tag_concepts(doc, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw162$LEXICON, lexicon, (SubLObject)document_annotation_widgets.$kw163$SENSE_TAGGER, tagger));
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)document_annotation_widgets.NIL; document_annotation_widgets.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject sentence = iteration.iteration_next(si);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (document_annotation_widgets.NIL != valid) {}
            }
            if (document_annotation_widgets.NIL != disambiguateP) {
                final SubLObject rdis = rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                rule_disambiguation.rdis_disambiguate(rdis, doc, (SubLObject)document_annotation_widgets.UNPROVIDED);
                rule_disambiguation.finalize_rule_disambiguator(rdis);
            }
            return doc;
        }
        finally {
            document.$perform_dot_analysis_on_docs$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 36135L)
    public static SubLObject find_concepts_for_document_segments(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec_id, SubLObject user) {
        if (app_type == document_annotation_widgets.UNPROVIDED) {
            app_type = (SubLObject)document_annotation_widgets.NIL;
        }
        if (filter_spec_id == document_annotation_widgets.UNPROVIDED) {
            filter_spec_id = (SubLObject)document_annotation_widgets.$str166$Mww;
        }
        if (user == document_annotation_widgets.UNPROVIDED) {
            user = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == filter_spec_id) {
            filter_spec_id = (SubLObject)document_annotation_widgets.$str166$Mww;
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn((SubLObject)document_annotation_widgets.$str167$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                PrintLow.format(out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return tag_document_nodes_for_display(node_ids_and_strings, app_type, term_learner_object_from_id(filter_spec_id), (SubLObject)document_annotation_widgets.NIL, user);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 36569L)
    public static SubLObject tag_document_nodes_for_display(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec, SubLObject lexicon, SubLObject user) {
        if (app_type == document_annotation_widgets.UNPROVIDED) {
            app_type = (SubLObject)document_annotation_widgets.$str169$full;
        }
        if (filter_spec == document_annotation_widgets.UNPROVIDED) {
            filter_spec = (SubLObject)document_annotation_widgets.NIL;
        }
        if (lexicon == document_annotation_widgets.UNPROVIDED) {
            lexicon = (SubLObject)document_annotation_widgets.NIL;
        }
        if (user == document_annotation_widgets.UNPROVIDED) {
            user = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == lexicon) {
            final SubLObject task = (SubLObject)((document_annotation_widgets.NIL != user) ? cure_api.default_task_for_user(user) : document_annotation_widgets.NIL);
            final SubLObject nl_mt = (SubLObject)((document_annotation_widgets.NIL != task) ? cure_api.parsing_mt_for_task(task) : document_annotation_widgets.NIL);
            lexicon = get_default_document_ingester_annotation_learning_lexicon(app_type, filter_spec, nl_mt);
        }
        thread.resetMultipleValues();
        final SubLObject doc_string = get_doc_string_from_node_ids_and_strings(node_ids_and_strings);
        final SubLObject offset_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject doc = new_tagged_document(doc_string, lexicon, (SubLObject)document_annotation_widgets.T, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject output = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
            element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$40 = document.paragraph_sentences(paragraph);
            backwardP_var_$41 = (SubLObject)document_annotation_widgets.NIL;
            for (length_$42 = Sequences.length(vector_var_$40), v_iteration_$43 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$43 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$43.numL(length_$42); v_iteration_$43 = Numbers.add(v_iteration_$43, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                element_num_$44 = ((document_annotation_widgets.NIL != backwardP_var_$41) ? Numbers.subtract(length_$42, v_iteration_$43, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$43);
                sentence = Vectors.aref(vector_var_$40, element_num_$44);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)document_annotation_widgets.NIL;
                word = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    if (document_annotation_widgets.NIL != document.word_cycls(word)) {
                        output = Sequences.cconcatenate(get_output_lists_for_word(word, offset_list, (SubLObject)document_annotation_widgets.UNPROVIDED), output);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return Sequences.nreverse(output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 38128L)
    public static SubLObject get_doc_string_from_node_ids_and_strings(final SubLObject node_ids_and_strings) {
        SubLObject doc_string = (SubLObject)document_annotation_widgets.NIL;
        SubLObject offset_list = (SubLObject)document_annotation_widgets.NIL;
        SubLObject current_offset = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject s = (SubLObject)document_annotation_widgets.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = Sort.sort(node_ids_and_strings, (SubLObject)document_annotation_widgets.$sym172$_, (SubLObject)document_annotation_widgets.$sym173$FIRST);
            SubLObject node_id_and_string = (SubLObject)document_annotation_widgets.NIL;
            node_id_and_string = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = node_id_and_string;
                SubLObject node_id = (SubLObject)document_annotation_widgets.NIL;
                SubLObject string = (SubLObject)document_annotation_widgets.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list170);
                node_id = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list170);
                string = current.first();
                current = current.rest();
                if (document_annotation_widgets.NIL == current) {
                    if (document_annotation_widgets.NIL != unicode_nauts.unicode_naut_p(string, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                        string = cycl_utilities.formula_arg1(string, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    string = string_utilities.string_substitute((SubLObject)document_annotation_widgets.$str159$_, (SubLObject)document_annotation_widgets.$str171$_ua0_, string, Symbols.symbol_function((SubLObject)document_annotation_widgets.EQUALP));
                    final SubLObject ascii_string = unicode_strings.display_to_subl_string(string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    print_high.princ(ascii_string, s);
                    offset_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node_id, current_offset), offset_list);
                    current_offset = Numbers.add(current_offset, Sequences.length(ascii_string));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list170);
                }
                cdolist_list_var = cdolist_list_var.rest();
                node_id_and_string = cdolist_list_var.first();
            }
            doc_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document_annotation_widgets.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document_annotation_widgets.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Values.values(doc_string, Sequences.nreverse(offset_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 38899L)
    public static SubLObject get_output_lists_for_word(final SubLObject word, final SubLObject offset_list, SubLObject return_individual_idsP) {
        if (return_individual_idsP == document_annotation_widgets.UNPROVIDED) {
            return_individual_idsP = document_annotation_widgets.$term_learner_keep_concepts_distinct$.getDynamicValue();
        }
        final SubLObject cycls_id = (SubLObject)((document_annotation_widgets.NIL != return_individual_idsP) ? Mapping.mapcar((SubLObject)document_annotation_widgets.$sym37$TERM_LEARNER_ID, Mapping.mapcar((SubLObject)document_annotation_widgets.$sym174$CANONICALIZE_TERM, document.word_cycls(word))) : ConsesLow.list(term_learner_id(Mapping.mapcar((SubLObject)document_annotation_widgets.$sym174$CANONICALIZE_TERM, document.word_cycls(word)))));
        final SubLObject length = document.word_length(word);
        final SubLObject node_num_and_node_offset = node_and_node_offset(document.word_offset(word), offset_list);
        final SubLObject node_num = node_num_and_node_offset.first();
        final SubLObject offset = conses_high.second(node_num_and_node_offset);
        final SubLObject existing_conceptP = (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL == new_named_entity_wordP(word));
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = cycls_id;
        SubLObject cycl_id = (SubLObject)document_annotation_widgets.NIL;
        cycl_id = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(node_num, offset, length, cycl_id, existing_conceptP), result);
            cdolist_list_var = cdolist_list_var.rest();
            cycl_id = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 39635L)
    public static SubLObject node_and_node_offset(final SubLObject global_offset, final SubLObject offset_list) {
        SubLObject previous_node_id = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject previous_node_start = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject cdolist_list_var = offset_list;
        SubLObject node_and_offset = (SubLObject)document_annotation_widgets.NIL;
        node_and_offset = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = node_and_offset;
            SubLObject node_id = (SubLObject)document_annotation_widgets.NIL;
            SubLObject offset = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list175);
            node_id = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list175);
            offset = current.first();
            current = current.rest();
            if (document_annotation_widgets.NIL == current) {
                if (offset.numG(global_offset)) {
                    return (SubLObject)ConsesLow.list(previous_node_id, Numbers.subtract(global_offset, previous_node_start));
                }
                previous_node_id = node_id;
                previous_node_start = offset;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list175);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_and_offset = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(previous_node_id, Numbers.subtract(global_offset, previous_node_start));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 40117L)
    public static SubLObject new_named_entity_wordP(final SubLObject word) {
        final SubLObject cycls = document.word_cycls(word);
        if (document_annotation_widgets.NIL != list_utilities.lengthG(cycls, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
            return (SubLObject)document_annotation_widgets.NIL;
        }
        if (document_annotation_widgets.NIL != constant_handles.constant_p(cycls.first())) {
            return (SubLObject)document_annotation_widgets.NIL;
        }
        if (document_annotation_widgets.NIL != cycl_grammar.cycl_nat_p(cycls.first()) && cycl_utilities.nat_functor(cycls.first()).eql(document_annotation_widgets.$const176$InstanceNamedFn_Ternary) && document_annotation_widgets.NIL != subl_promotions.memberP(cycl_utilities.nat_arg2(cycls.first(), (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.$list177, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED) && (document_annotation_widgets.NIL == narts_high.find_nart(cycls.first()) || document_annotation_widgets.NIL != nart_has_non_derived_assertionsP(cycls.first()))) {
            return (SubLObject)document_annotation_widgets.T;
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 40708L)
    public static SubLObject nart_has_non_derived_assertionsP(final SubLObject cycl) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL == narts_high.useless_nartP(czer_main.canonicalize_term(cycl, (SubLObject)document_annotation_widgets.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 40823L)
    public static SubLObject find_interps_for_document_segments(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec_id, SubLObject user) {
        if (app_type == document_annotation_widgets.UNPROVIDED) {
            app_type = (SubLObject)document_annotation_widgets.$str169$full;
        }
        if (filter_spec_id == document_annotation_widgets.UNPROVIDED) {
            filter_spec_id = (SubLObject)document_annotation_widgets.$str166$Mww;
        }
        if (user == document_annotation_widgets.UNPROVIDED) {
            user = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == filter_spec_id) {
            filter_spec_id = (SubLObject)document_annotation_widgets.$str166$Mww;
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn((SubLObject)document_annotation_widgets.$str167$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                PrintLow.format(out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject filter_spec = term_learner_object_from_id(filter_spec_id);
        final SubLObject task = (SubLObject)((document_annotation_widgets.NIL != user) ? cure_api.default_task_for_user(user) : document_annotation_widgets.NIL);
        final SubLObject nl_mt = (SubLObject)((document_annotation_widgets.NIL != task) ? cure_api.parsing_mt_for_task(task) : document_annotation_widgets.NIL);
        final SubLObject lexicon = get_default_document_ingester_annotation_learning_lexicon(app_type, filter_spec, nl_mt);
        thread.resetMultipleValues();
        final SubLObject doc_string = get_doc_string_from_node_ids_and_strings(node_ids_and_strings);
        final SubLObject offset_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject dogs_have_four_feet = (SubLObject)document_annotation_widgets.$str179$dogs_have_four_feet;
        final SubLObject location = Sequences.search(dogs_have_four_feet, doc_string, (SubLObject)document_annotation_widgets.EQUALP, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject length = Sequences.length(dogs_have_four_feet);
        final SubLObject cycl = (SubLObject)document_annotation_widgets.$list180;
        final SubLObject node_and_offset = node_and_node_offset(location, offset_list);
        final SubLObject node_num = node_and_offset.first();
        final SubLObject node_offset = conses_high.second(node_and_offset);
        if (document_annotation_widgets.NIL != location) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(node_num, node_offset, length, term_learner_id(cycl), dogs_have_four_feet));
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 43286L)
    public static SubLObject get_default_medical_tagging_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == abstract_lexicon.abstract_lexicon_p(document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread))) {
            document_annotation_widgets.$default_medical_tagging_lexicon$.setDynamicValue(make_default_document_annotation_lexicon((SubLObject)document_annotation_widgets.UNPROVIDED), thread);
            methods.funcall_instance_method_with_1_args(document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const182$Verb);
            methods.funcall_instance_method_with_1_args(document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const183$Adjective);
            methods.funcall_instance_method_with_1_args(document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const184$Adverb);
            methods.funcall_instance_method_with_1_args(document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const185$Gerundive);
            methods.funcall_instance_method_with_1_args(document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$sym186$ADD_CONCEPT_FILTER_SPEC, (SubLObject)document_annotation_widgets.$list187);
        }
        return document_annotation_widgets.$default_medical_tagging_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 44026L)
    public static SubLObject clear_default_medical_tagging_lexicon() {
        document_annotation_widgets.$default_medical_tagging_lexicon$.setDynamicValue((SubLObject)document_annotation_widgets.NIL);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 44149L)
    public static SubLObject augment_medical_html_file_with_cyc_terms(final SubLObject filepath, SubLObject lexicon) {
        if (lexicon == document_annotation_widgets.UNPROVIDED) {
            lexicon = get_default_medical_tagging_lexicon();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject in_string = file_utilities.slurp_file(filepath);
        final SubLObject out_path = Sequences.cconcatenate(filepath, (SubLObject)document_annotation_widgets.$str188$_tagged_html);
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(out_path, (SubLObject)document_annotation_widgets.$kw144$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, out_path);
            }
            final SubLObject s = stream;
            print_high.princ(augment_html_document_with_cyc_terms(in_string, lexicon), s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return out_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 44519L)
    public static SubLObject augment_html_document_with_cyc_terms(final SubLObject html_string, SubLObject lexicon) {
        if (lexicon == document_annotation_widgets.UNPROVIDED) {
            lexicon = get_default_document_ingester_annotation_lexicon((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject html_tokens = xml_parsing_utilities.xml_string_tokenize(html_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject id_num = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject output_string = (SubLObject)document_annotation_widgets.NIL;
        thread.resetMultipleValues();
        final SubLObject text_string = get_text_string_from_tokens(html_tokens, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject tokens_to_text_string_mappings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject tag_locations = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject vector_var = document.document_paragraphs(new_tagged_document(text_string, lexicon, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED));
        final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
            element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$45 = document.paragraph_sentences(paragraph);
            backwardP_var_$46 = (SubLObject)document_annotation_widgets.NIL;
            for (length_$47 = Sequences.length(vector_var_$45), v_iteration_$48 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$48 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$48.numL(length_$47); v_iteration_$48 = Numbers.add(v_iteration_$48, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                element_num_$49 = ((document_annotation_widgets.NIL != backwardP_var_$46) ? Numbers.subtract(length_$47, v_iteration_$48, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$48);
                sentence = Vectors.aref(vector_var_$45, element_num_$49);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)document_annotation_widgets.NIL;
                word = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    cycls = document.word_cycls(word);
                    word_start = document.word_offset(word);
                    word_end = Numbers.add(word_start, document.word_length(word));
                    if (document_annotation_widgets.NIL != cycls) {
                        start_tag = (SubLObject)document_annotation_widgets.$str111$;
                        end_tag = (SubLObject)document_annotation_widgets.$str111$;
                        cdolist_list_var_$50 = cycls;
                        cycl = (SubLObject)document_annotation_widgets.NIL;
                        cycl = cdolist_list_var_$50.first();
                        while (document_annotation_widgets.NIL != cdolist_list_var_$50) {
                            if (document_annotation_widgets.NIL != forts.fort_p(cycl)) {
                                start_tag = Sequences.cconcatenate(start_tag, Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str189$_span_property__cyc_termName__con, new SubLObject[] { format_nil.format_nil_a_no_copy(doc_tagger_rdf_name(cycl)), document_annotation_widgets.$str190$___span_class__cycTerm__id__cycTe, format_nil.format_nil_a_no_copy(id_num), document_annotation_widgets.$str191$__property__cyc_termId__content__, format_nil.format_nil_a_no_copy(doc_tagger_rdf_id(cycl)), document_annotation_widgets.$str192$__ }));
                                end_tag = Sequences.cconcatenate(end_tag, (SubLObject)document_annotation_widgets.$str193$__span___span_);
                                id_num = Numbers.add(id_num, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                            }
                            cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                            cycl = cdolist_list_var_$50.first();
                        }
                        tag_locations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(word_start, start_tag), tag_locations);
                        tag_locations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(word_end, end_tag), tag_locations);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        tag_locations = Sequences.nreverse(tag_locations);
        SubLObject s = (SubLObject)document_annotation_widgets.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject current_location = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
            SubLObject tag_index = (SubLObject)document_annotation_widgets.NIL;
            SubLObject tag = (SubLObject)document_annotation_widgets.NIL;
            if (document_annotation_widgets.NIL != tag_locations) {
                final SubLObject datum_evaluated_var = tag_locations.first();
                tag_index = datum_evaluated_var.first();
                tag = conses_high.cadr(datum_evaluated_var);
            }
            SubLObject current;
            final SubLObject datum = current = mapping_first_elt_info(tokens_to_text_string_mappings);
            SubLObject map_string_index = (SubLObject)document_annotation_widgets.NIL;
            SubLObject map_string_end_index = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list194);
            map_string_index = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list194);
            map_string_end_index = current.first();
            current = current.rest();
            if (document_annotation_widgets.NIL == current) {
                SubLObject list_var = (SubLObject)document_annotation_widgets.NIL;
                SubLObject token = (SubLObject)document_annotation_widgets.NIL;
                SubLObject token_index = (SubLObject)document_annotation_widgets.NIL;
                list_var = html_tokens;
                token = list_var.first();
                for (token_index = (SubLObject)document_annotation_widgets.ZERO_INTEGER; document_annotation_widgets.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), token_index = Numbers.add((SubLObject)document_annotation_widgets.ONE_INTEGER, token_index)) {
                    if (document_annotation_widgets.NIL == tag_locations || document_annotation_widgets.NIL != xml_parsing_utilities.xml_tagP(token)) {
                        print_high.princ(token, s);
                    }
                    else if (map_string_end_index.numLE(tag_index)) {
                        print_high.princ(token, s);
                        tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                        current_location = map_string_end_index;
                        if (document_annotation_widgets.NIL != tokens_to_text_string_mappings) {
                            final SubLObject datum_evaluated_var2 = mapping_first_elt_info(tokens_to_text_string_mappings);
                            map_string_index = datum_evaluated_var2.first();
                            map_string_end_index = conses_high.cadr(datum_evaluated_var2);
                        }
                    }
                    else {
                        SubLObject current_location_in_token = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
                        SubLObject tag_offset_into_current_token = Numbers.subtract(tag_index, map_string_index);
                        while (current_location_in_token.numL(Sequences.length(token))) {
                            SubLObject next_tag_not_in_this_token = (SubLObject)document_annotation_widgets.NIL;
                            if (tag_offset_into_current_token.numG(Sequences.length(token))) {
                                next_tag_not_in_this_token = (SubLObject)document_annotation_widgets.T;
                            }
                            SubLObject next_string_to_print = Sequences.subseq(token, current_location_in_token, (SubLObject)((document_annotation_widgets.NIL != next_tag_not_in_this_token) ? document_annotation_widgets.NIL : tag_offset_into_current_token));
                            print_high.princ(next_string_to_print, s);
                            current_location_in_token = Numbers.add(current_location_in_token, Sequences.length(next_string_to_print));
                            current_location = Numbers.add(current_location, Sequences.length(next_string_to_print));
                            if (current_location.numGE(map_string_end_index)) {
                                tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                                if (document_annotation_widgets.NIL != tokens_to_text_string_mappings) {
                                    final SubLObject datum_evaluated_var3 = mapping_first_elt_info(tokens_to_text_string_mappings);
                                    map_string_index = datum_evaluated_var3.first();
                                    map_string_end_index = conses_high.cadr(datum_evaluated_var3);
                                }
                            }
                            if (document_annotation_widgets.NIL == next_tag_not_in_this_token) {
                                print_high.princ(tag, s);
                                tag_locations = tag_locations.rest();
                            }
                            if (document_annotation_widgets.NIL == tag_locations) {
                                next_string_to_print = Sequences.subseq(token, current_location_in_token, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                print_high.princ(next_string_to_print, s);
                                current_location = Numbers.add(current_location, Sequences.length(next_string_to_print));
                                current_location_in_token = Numbers.add(current_location_in_token, Sequences.length(next_string_to_print));
                                if (current_location.numGE(map_string_end_index)) {
                                    tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                                    if (document_annotation_widgets.NIL != tokens_to_text_string_mappings) {
                                        final SubLObject datum_evaluated_var4 = mapping_first_elt_info(tokens_to_text_string_mappings);
                                        map_string_index = datum_evaluated_var4.first();
                                        map_string_end_index = conses_high.cadr(datum_evaluated_var4);
                                    }
                                }
                                tag_index = (SubLObject)document_annotation_widgets.NIL;
                            }
                            else {
                                tag_index = tag_locations.first().first();
                                tag = conses_high.second(tag_locations.first());
                                tag_offset_into_current_token = Numbers.subtract(tag_index, map_string_index);
                            }
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list194);
            }
            output_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document_annotation_widgets.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49007L)
    public static SubLObject doc_tagger_rdf_name(final SubLObject cycl) {
        if (document_annotation_widgets.NIL != forts.fort_p(cycl)) {
            return web_utilities.html_url_encode(string_utilities.fort_print_name(cycl), (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return web_utilities.html_url_encode(string_utilities.stringify_terms(cycl, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49182L)
    public static SubLObject doc_tagger_rdf_id(final SubLObject cycl) {
        return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str195$http___sw_cyc_com_concept_, kb_utilities.compact_hl_external_id_string(cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49314L)
    public static SubLObject mapping_first_elt_info(final SubLObject tokens_to_text_string_mappings) {
        if (document_annotation_widgets.NIL == tokens_to_text_string_mappings) {
            return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        final SubLObject mapping = tokens_to_text_string_mappings.first();
        final SubLObject mapping_string_index = conses_high.second(mapping);
        final SubLObject mapping_string_length = conses_high.third(mapping);
        return (SubLObject)ConsesLow.list(mapping_string_index, Numbers.add(mapping_string_index, mapping_string_length));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 49811L)
    public static SubLObject get_text_string_from_tokens(final SubLObject html_tokens, SubLObject tokens_to_ignore) {
        if (tokens_to_ignore == document_annotation_widgets.UNPROVIDED) {
            tokens_to_ignore = (SubLObject)document_annotation_widgets.$list196;
        }
        SubLObject tokens_to_text_string_mappings = (SubLObject)document_annotation_widgets.NIL;
        SubLObject text_string = (SubLObject)document_annotation_widgets.NIL;
        SubLObject ignore_stack = (SubLObject)document_annotation_widgets.NIL;
        SubLObject text_string_length = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject s = (SubLObject)document_annotation_widgets.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject list_var = (SubLObject)document_annotation_widgets.NIL;
            SubLObject token = (SubLObject)document_annotation_widgets.NIL;
            SubLObject token_index = (SubLObject)document_annotation_widgets.NIL;
            list_var = html_tokens;
            token = list_var.first();
            for (token_index = (SubLObject)document_annotation_widgets.ZERO_INTEGER; document_annotation_widgets.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), token_index = Numbers.add((SubLObject)document_annotation_widgets.ONE_INTEGER, token_index)) {
                if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_opening_tag_p(token) && document_annotation_widgets.NIL == xml_parsing_utilities.xml_closing_tag_p(token) && document_annotation_widgets.NIL != string_utilities.starts_with_one_of(Sequences.subseq(token, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED), tokens_to_ignore)) {
                    ignore_stack = (SubLObject)ConsesLow.cons(xml_parsing_utilities.parse_html_token(token).first(), ignore_stack);
                }
                else if (document_annotation_widgets.NIL != xml_parsing_utilities.xml_closing_tag_p(token) && xml_parsing_utilities.parse_html_token(token).first().equal(tokens_to_ignore.first())) {
                    ignore_stack = ignore_stack.rest();
                }
                else if (document_annotation_widgets.NIL == xml_parsing_utilities.xml_tagP(token)) {
                    if (document_annotation_widgets.NIL == xml_parsing_utilities.xml_comment_p(token)) {
                        if (document_annotation_widgets.NIL == ignore_stack) {
                            print_high.princ(token, s);
                            tokens_to_text_string_mappings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(token_index, text_string_length, Sequences.length(token)), tokens_to_text_string_mappings);
                            text_string_length = Numbers.add(text_string_length, Sequences.length(token));
                        }
                    }
                }
            }
            text_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document_annotation_widgets.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document_annotation_widgets.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Values.values(text_string, Sequences.nreverse(tokens_to_text_string_mappings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 51353L)
    public static SubLObject tag_document_for_indexing_with_offsets(final SubLObject original_doc_string, SubLObject disambiguator, SubLObject lexicon, SubLObject include_stringsP) {
        if (disambiguator == document_annotation_widgets.UNPROVIDED) {
            disambiguator = (SubLObject)document_annotation_widgets.$kw136$NEW;
        }
        if (lexicon == document_annotation_widgets.UNPROVIDED) {
            lexicon = get_default_document_annotation_lexicon((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        if (include_stringsP == document_annotation_widgets.UNPROVIDED) {
            include_stringsP = (SubLObject)document_annotation_widgets.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_disambiguator = Equality.eq(disambiguator, (SubLObject)document_annotation_widgets.$kw136$NEW);
        final SubLObject v_document = new_tagged_document(original_doc_string, lexicon, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject concepts_string = (SubLObject)document_annotation_widgets.$str111$;
        if (document_annotation_widgets.NIL != new_disambiguator) {
            disambiguator = rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        SubLObject s = (SubLObject)document_annotation_widgets.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
            try {
                lexicon_macros.$nl_trie_assumed_validP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_annotation_widgets.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                    final SubLObject _prev_bind_0_$52 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            rule_disambiguation.rdis_disambiguate(disambiguator, v_document, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            final SubLObject vector_var = document.document_paragraphs(v_document);
                            final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                                element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
                                paragraph = Vectors.aref(vector_var, element_num);
                                vector_var_$53 = document.paragraph_sentences(paragraph);
                                backwardP_var_$54 = (SubLObject)document_annotation_widgets.NIL;
                                for (length_$55 = Sequences.length(vector_var_$53), v_iteration_$56 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$56 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$56.numL(length_$55); v_iteration_$56 = Numbers.add(v_iteration_$56, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                                    element_num_$57 = ((document_annotation_widgets.NIL != backwardP_var_$54) ? Numbers.subtract(length_$55, v_iteration_$56, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$56);
                                    sentence = Vectors.aref(vector_var_$53, element_num_$57);
                                    cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                    word = (SubLObject)document_annotation_widgets.NIL;
                                    word = cdolist_list_var.first();
                                    while (document_annotation_widgets.NIL != cdolist_list_var) {
                                        word_string = document.word_string(word);
                                        word_start = document.word_offset(word);
                                        word_end = Numbers.add(word_start, document.word_length(word));
                                        string_words = string_utilities.split_string(word_string, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                        term_reln_pairs = (SubLObject)document_annotation_widgets.NIL;
                                        if (document_annotation_widgets.NIL != include_stringsP && document_annotation_widgets.NIL == list_utilities.lengthG(string_words, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                                            term_reln_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(word_string, (SubLObject)document_annotation_widgets.$str197$s), term_reln_pairs);
                                        }
                                        list_var = (SubLObject)document_annotation_widgets.NIL;
                                        interp = (SubLObject)document_annotation_widgets.NIL;
                                        interp_num = (SubLObject)document_annotation_widgets.NIL;
                                        list_var = document.word_interps(word);
                                        interp = list_var.first();
                                        for (interp_num = (SubLObject)document_annotation_widgets.ZERO_INTEGER; document_annotation_widgets.NIL != list_var; list_var = list_var.rest(), interp = list_var.first(), interp_num = Numbers.add((SubLObject)document_annotation_widgets.ONE_INTEGER, interp_num)) {
                                            v_term = nl_api_datastructures.get_nl_interp_cycl(interp);
                                            term_id = document_annotation_term_id(v_term, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                            if (term_id.isString()) {
                                                item_var = (SubLObject)ConsesLow.list(term_id, (SubLObject)document_annotation_widgets.$str198$t);
                                                if (document_annotation_widgets.NIL == conses_high.member(item_var, term_reln_pairs, Symbols.symbol_function((SubLObject)document_annotation_widgets.EQUAL), Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                                                    term_reln_pairs = (SubLObject)ConsesLow.cons(item_var, term_reln_pairs);
                                                }
                                                justifications = (cdolist_list_var_$58 = get_upwards_closure_justifications_cached(v_term));
                                                justification = (SubLObject)document_annotation_widgets.NIL;
                                                justification = cdolist_list_var_$58.first();
                                                while (document_annotation_widgets.NIL != cdolist_list_var_$58) {
                                                    genl = get_closure_justification_genl(justification);
                                                    genl_id = document_annotation_term_id(genl, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    if (genl_id.isString()) {
                                                        item_var2 = (SubLObject)ConsesLow.list(genl_id, closure_justification_pred_id(justification));
                                                        if (document_annotation_widgets.NIL == conses_high.member(item_var2, term_reln_pairs, (SubLObject)document_annotation_widgets.EQUAL, Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                                                            term_reln_pairs = (SubLObject)ConsesLow.cons(item_var2, term_reln_pairs);
                                                        }
                                                    }
                                                    cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                    justification = cdolist_list_var_$58.first();
                                                }
                                            }
                                        }
                                        if (document_annotation_widgets.NIL != term_reln_pairs) {
                                            print_token(s, word_start, word_end, Sequences.nreverse(term_reln_pairs));
                                        }
                                        if (document_annotation_widgets.NIL != include_stringsP && document_annotation_widgets.NIL != Sequences.search((SubLObject)document_annotation_widgets.$str159$_, word_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                                            prev_partial_words_length = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
                                            cdolist_list_var_$59 = string_words;
                                            partial_word_string = (SubLObject)document_annotation_widgets.NIL;
                                            partial_word_string = cdolist_list_var_$59.first();
                                            while (document_annotation_widgets.NIL != cdolist_list_var_$59) {
                                                if (document_annotation_widgets.NIL == string_utilities.empty_string_p(partial_word_string)) {
                                                    partial_word_start = Numbers.add(word_start, prev_partial_words_length);
                                                    partial_word_length = Sequences.length(partial_word_string);
                                                    partial_word_end = Numbers.add(partial_word_start, partial_word_length);
                                                    print_token(s, partial_word_start, partial_word_end, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(partial_word_string, (SubLObject)document_annotation_widgets.$str197$s)));
                                                    prev_partial_words_length = Numbers.add(prev_partial_words_length, partial_word_length, (SubLObject)document_annotation_widgets.ONE_INTEGER);
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
                        finally {
                            final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$52, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$51, thread);
                }
            }
            finally {
                lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
            }
            concepts_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document_annotation_widgets.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (document_annotation_widgets.NIL != new_disambiguator) {
            rule_disambiguation.finalize_rule_disambiguator(disambiguator);
        }
        return Values.values(string_utilities.strip_final(concepts_string, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.$str111$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55836L)
    public static SubLObject document_annotation_relation_from_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.rassoc(id, document_annotation_widgets.$predicate_id_table$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 55953L)
    public static SubLObject generate_retrieval_justification(final SubLObject spec_id, final SubLObject relation_id, final SubLObject genl_id) {
        final SubLObject spec_term = document_annotation_term_from_id(spec_id);
        final SubLObject genl_term = document_annotation_term_from_id(genl_id);
        final SubLObject relation = document_annotation_relation_from_id(relation_id);
        if (relation_id.equal((SubLObject)document_annotation_widgets.$str198$t)) {
            return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str201$Meaning__, format_nil.format_nil_a_no_copy(pph_main.generate_phrase(spec_term, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)));
        }
        if (spec_term.isKeyword() || genl_term.isKeyword() || document_annotation_widgets.NIL == relation) {
            return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str202$_, new SubLObject[] { format_nil.format_nil_a_no_copy((document_annotation_widgets.NIL != relation) ? relation : relation_id), document_annotation_widgets.$str159$_, format_nil.format_nil_a_no_copy((document_annotation_widgets.NIL != spec_term) ? spec_term : spec_id), document_annotation_widgets.$str203$__, format_nil.format_nil_a_no_copy((document_annotation_widgets.NIL != genl_term) ? genl_term : genl_id), document_annotation_widgets.$str204$_ });
        }
        return pph_main.generate_phrase(substitute_template(predicate_template(relation), spec_term, genl_term), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 57307L)
    public static SubLObject generate_retrieval_justification_from_justification_string(final SubLObject justification_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING, justification_string));
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn((SubLObject)document_annotation_widgets.$str167$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                PrintLow.format(out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING, justification_string));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        assert document_annotation_widgets.NIL != Types.stringp(justification_string) : justification_string;
        final SubLObject justification_ids = string_utilities.split_string(justification_string, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (document_annotation_widgets.NIL != list_utilities.lengthGE(justification_ids, (SubLObject)document_annotation_widgets.THREE_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
            final SubLObject justification_args = get_best_justifications_from_arg_list(justification_ids);
            return generate_retrieval_justification(justification_args.first(), conses_high.second(justification_args), conses_high.third(justification_args));
        }
        if (document_annotation_widgets.NIL != list_utilities.lengthE(justification_ids, (SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED) && document_annotation_widgets.NIL != Strings.string_equal(justification_ids.first(), (SubLObject)document_annotation_widgets.$str197$s, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
            return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str206$Text_Match__, format_nil.format_nil_a_no_copy(conses_high.second(justification_ids)));
        }
        Errors.warn((SubLObject)document_annotation_widgets.$str207$Invalid_justification_string___S, justification_string);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 58344L)
    public static SubLObject get_best_justifications_from_arg_list(final SubLObject justification_id_list) {
        if (document_annotation_widgets.NIL != list_utilities.lengthE(justification_id_list, (SubLObject)document_annotation_widgets.THREE_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
            return justification_id_list;
        }
        SubLObject best_pred = conses_high.second(justification_id_list);
        SubLObject best_arg = conses_high.third(justification_id_list);
        SubLObject pred = (SubLObject)document_annotation_widgets.NIL;
        SubLObject pred_$61 = (SubLObject)document_annotation_widgets.NIL;
        SubLObject arg = (SubLObject)document_annotation_widgets.NIL;
        SubLObject arg_$62 = (SubLObject)document_annotation_widgets.NIL;
        pred = list_utilities.every_nth((SubLObject)document_annotation_widgets.TWO_INTEGER, justification_id_list.rest());
        pred_$61 = pred.first();
        arg = list_utilities.every_nth((SubLObject)document_annotation_widgets.TWO_INTEGER, conses_high.cddr(justification_id_list));
        arg_$62 = arg.first();
        while (document_annotation_widgets.NIL != arg || document_annotation_widgets.NIL != pred) {
            if (document_annotation_widgets.NIL != better_justification_pred(document_annotation_relation_from_id(pred_$61), document_annotation_relation_from_id(best_pred))) {
                best_pred = pred_$61;
                best_arg = arg_$62;
            }
            pred = pred.rest();
            pred_$61 = pred.first();
            arg = arg.rest();
            arg_$62 = arg.first();
        }
        return (SubLObject)ConsesLow.list(justification_id_list.first(), best_pred, best_arg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 58980L)
    public static SubLObject better_justification_pred(final SubLObject pred1, final SubLObject pred2) {
        if (pred1.eql(document_annotation_widgets.$const44$conditionsCommonlyCooccur)) {
            return (SubLObject)document_annotation_widgets.T;
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 59206L)
    public static SubLObject generate_term_explanation(final SubLObject term_id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym208$GENERATE_TERM_EXPLANATION, term_id_string));
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn((SubLObject)document_annotation_widgets.$str167$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                PrintLow.format(out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym208$GENERATE_TERM_EXPLANATION, term_id_string));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        assert document_annotation_widgets.NIL != Types.stringp(term_id_string) : term_id_string;
        final SubLObject v_term = document_annotation_term_from_id(term_id_string);
        final SubLObject canonical_phrase = nl_generation_api.cycl_term_to_nl_string_internal(v_term, (SubLObject)document_annotation_widgets.$kw209$DEFAULT).first();
        final SubLObject userdoccomment = backward.removal_ask_variable((SubLObject)document_annotation_widgets.$sym59$_X, (SubLObject)ConsesLow.listS(document_annotation_widgets.$const210$userDocComment, v_term, (SubLObject)document_annotation_widgets.$list62), document_annotation_widgets.$const211$CCF_CAE_QueryMt, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED).first();
        final SubLObject pph_params = nl_generation_api.new_pph_parameters((SubLObject)ConsesLow.listS((SubLObject)document_annotation_widgets.$kw212$DEMERIT_CUTOFF, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue(), (SubLObject)document_annotation_widgets.$list213));
        final SubLObject other_strings = get_other_explanatory_strings_for_term(v_term);
        final SubLObject synonyms = nl_generation_api.cycl_term_to_nl_string_internal(v_term, pph_params).rest();
        final SubLObject synonym_string = (SubLObject)((document_annotation_widgets.NIL != synonyms) ? Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str214$_b_Synonyms__b___, string_utilities.join_strings(synonyms, (SubLObject)document_annotation_widgets.UNPROVIDED)) : document_annotation_widgets.$str111$);
        final SubLObject result_string = Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str215$_b_, new SubLObject[] { canonical_phrase, document_annotation_widgets.$str216$__b___, (document_annotation_widgets.NIL != userdoccomment) ? userdoccomment : document_annotation_widgets.$str111$, document_annotation_widgets.$str217$_br_, other_strings, synonym_string });
        return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str218$_div_style__background_color__whi, new SubLObject[] { result_string, document_annotation_widgets.$str219$__div_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 60352L)
    public static SubLObject get_other_explanatory_strings_for_term(final SubLObject v_term) {
        SubLObject output_string = (SubLObject)document_annotation_widgets.NIL;
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            if (document_annotation_widgets.NIL != genls.genlsP(v_term, document_annotation_widgets.$const220$SurgicalProcedure, document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED) || document_annotation_widgets.NIL != genls.genlsP(v_term, document_annotation_widgets.$const221$Surgery, document_annotation_widgets.$const76$InferencePSC, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                final SubLObject experts = backward.removal_ask_variable((SubLObject)document_annotation_widgets.$sym222$_DOC, (SubLObject)ConsesLow.list(document_annotation_widgets.$const223$expertAtSkill, (SubLObject)document_annotation_widgets.$sym222$_DOC, v_term), document_annotation_widgets.$const224$CCFPersonnelDataMt, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                SubLObject sentences = (SubLObject)document_annotation_widgets.NIL;
                SubLObject cdolist_list_var = experts;
                SubLObject expert = (SubLObject)document_annotation_widgets.NIL;
                expert = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(document_annotation_widgets.$const223$expertAtSkill, expert, v_term), sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    expert = cdolist_list_var.first();
                }
                if (document_annotation_widgets.NIL != sentences) {
                    print_high.princ((SubLObject)document_annotation_widgets.$str225$_b_Specialists____b_, stream);
                    print_high.princ(pph_document.pph_summarize_term(v_term, sentences, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), stream);
                    print_high.princ((SubLObject)document_annotation_widgets.$str217$_br_, stream);
                    streams_high.terpri(stream);
                }
            }
            output_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document_annotation_widgets.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
    public static SubLObject clear_document_annotation_term_id() {
        final SubLObject cs = document_annotation_widgets.$document_annotation_term_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
    public static SubLObject remove_document_annotation_term_id(final SubLObject v_term, SubLObject hl_idsP) {
        if (hl_idsP == document_annotation_widgets.UNPROVIDED) {
            hl_idsP = document_annotation_widgets.$doc_annotation_use_hl_ids$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$document_annotation_term_id_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, hl_idsP), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
    public static SubLObject document_annotation_term_id_internal(final SubLObject v_term, final SubLObject hl_idsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_value = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject _prev_bind_0 = cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.currentBinding(thread);
        try {
            cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.bind((SubLObject)document_annotation_widgets.NIL, thread);
            if (document_annotation_widgets.NIL != hl_idsP) {
                ret_value = kb_utilities.hl_external_id_string(cycl_utilities.hl_to_el(v_term));
            }
            else if (document_annotation_widgets.NIL != nart_handles.nart_p(v_term) && get_cached_term_id(v_term) != document_annotation_widgets.$kw49$NOT_FOUND) {
                ret_value = get_cached_term_id(v_term);
            }
            else {
                final SubLObject el_term = cycl_utilities.hl_to_el(v_term);
                final SubLObject el_id = get_cached_term_id(el_term);
                if (el_id == document_annotation_widgets.$kw49$NOT_FOUND && v_term.isNumber()) {
                    ret_value = v_term;
                }
                else if (el_id == document_annotation_widgets.$kw49$NOT_FOUND) {
                    ret_value = kb_utilities.hl_external_id_string(el_term);
                }
                else {
                    ret_value = el_id;
                }
            }
        }
        finally {
            cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.rebind(_prev_bind_0, thread);
        }
        return ret_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 61014L)
    public static SubLObject document_annotation_term_id(final SubLObject v_term, SubLObject hl_idsP) {
        if (hl_idsP == document_annotation_widgets.UNPROVIDED) {
            hl_idsP = document_annotation_widgets.$doc_annotation_use_hl_ids$.getDynamicValue();
        }
        SubLObject caching_state = document_annotation_widgets.$document_annotation_term_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym226$DOCUMENT_ANNOTATION_TERM_ID, (SubLObject)document_annotation_widgets.$sym227$_DOCUMENT_ANNOTATION_TERM_ID_CACHING_STATE_, (SubLObject)document_annotation_widgets.$int228$25000, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, hl_idsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)document_annotation_widgets.NIL;
            collision = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (document_annotation_widgets.NIL != cached_args && document_annotation_widgets.NIL == cached_args.rest() && hl_idsP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(document_annotation_term_id_internal(v_term, hl_idsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, hl_idsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
    public static SubLObject clear_document_annotation_term_from_id() {
        final SubLObject cs = document_annotation_widgets.$document_annotation_term_from_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
    public static SubLObject remove_document_annotation_term_from_id(final SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$document_annotation_term_from_id_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(id), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
    public static SubLObject document_annotation_term_from_id_internal(final SubLObject id) {
        return get_term_from_cached_id(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62204L)
    public static SubLObject document_annotation_term_from_id(final SubLObject id) {
        SubLObject caching_state = document_annotation_widgets.$document_annotation_term_from_id_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID, (SubLObject)document_annotation_widgets.$sym230$_DOCUMENT_ANNOTATION_TERM_FROM_ID_CACHING_STATE_, (SubLObject)document_annotation_widgets.$int231$5000, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(document_annotation_term_from_id_internal(id)));
            memoization_state.caching_state_put(caching_state, id, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62423L)
    public static SubLObject get_cached_term_id(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        maybe_initialize_doc_annotator_term_id_fbc((SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject cached_id = file_backed_cache.file_backed_cache_lookup(v_term, document_annotation_widgets.$doc_annotator_term_id_fbc$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (cached_id.isNumber()) {
            return PrintLow.write_to_string(cached_id, document_annotation_widgets.EMPTY_SUBL_OBJECT_ARRAY);
        }
        return cached_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 62687L)
    public static SubLObject get_term_from_cached_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        maybe_initialize_doc_annotator_id_term_fbc((SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject v_term = file_backed_cache.file_backed_cache_lookup((document_annotation_widgets.NIL != number_utilities.number_string_p(id)) ? reader.read_from_string(id, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED) : id, document_annotation_widgets.$doc_annotator_id_term_fbc$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (v_term == document_annotation_widgets.$kw49$NOT_FOUND) {
            v_term = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(id);
        }
        return (SubLObject)((document_annotation_widgets.NIL != v_term) ? v_term : document_annotation_widgets.$kw49$NOT_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 63186L)
    public static SubLObject get_default_document_ingester_annotation_learning_lexicon(SubLObject app_type, SubLObject filter_spec, SubLObject nl_mt) {
        if (app_type == document_annotation_widgets.UNPROVIDED) {
            app_type = (SubLObject)document_annotation_widgets.NIL;
        }
        if (filter_spec == document_annotation_widgets.UNPROVIDED) {
            filter_spec = (SubLObject)document_annotation_widgets.NIL;
        }
        if (nl_mt == document_annotation_widgets.UNPROVIDED) {
            nl_mt = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == abstract_lexicon.abstract_lexicon_p(dictionary.dictionary_lookup(document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), (SubLObject)ConsesLow.list(app_type, filter_spec, nl_mt), (SubLObject)document_annotation_widgets.UNPROVIDED))) {
            final SubLObject lex = make_default_document_annotation_lexicon(nl_mt);
            methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const182$Verb);
            methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const183$Adjective);
            methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const184$Adverb);
            methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const185$Gerundive);
            if (document_annotation_widgets.NIL != constant_handles.valid_constant(document_annotation_widgets.$const232$PredicateTaxonomy, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym186$ADD_CONCEPT_FILTER_SPEC, (SubLObject)document_annotation_widgets.$list233);
            }
            if (document_annotation_widgets.NIL != filter_spec) {
                methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym186$ADD_CONCEPT_FILTER_SPEC, filter_spec);
            }
            if (document_annotation_widgets.NIL != named_entity_recognizer.stanford_ner_ping((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED) && !app_type.equal((SubLObject)document_annotation_widgets.$str234$vocabMarking)) {
                methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym235$ADD_LEARNER, (SubLObject)document_annotation_widgets.$sym236$STANFORD_NER_LEARN);
            }
            dictionary.dictionary_enter(document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), (SubLObject)ConsesLow.list(app_type, filter_spec), lex);
        }
        return dictionary.dictionary_lookup(document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), (SubLObject)ConsesLow.list(app_type, filter_spec), (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64505L)
    public static SubLObject clear_default_document_ingester_annotation_learning_lexicon(SubLObject app_type) {
        if (app_type == document_annotation_widgets.UNPROVIDED) {
            app_type = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == app_type) {
            dictionary.clear_dictionary(document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread));
        }
        else {
            dictionary.dictionary_enter(document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), app_type, (SubLObject)document_annotation_widgets.NIL);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
    public static SubLObject clear_get_default_document_ingester_annotation_lexicon() {
        final SubLObject cs = document_annotation_widgets.$get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
    public static SubLObject remove_get_default_document_ingester_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == document_annotation_widgets.UNPROVIDED) {
            nl_mt = (SubLObject)document_annotation_widgets.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nl_mt), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
    public static SubLObject get_default_document_ingester_annotation_lexicon_internal(final SubLObject nl_mt) {
        final SubLObject lex = make_default_document_annotation_lexicon(nl_mt);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym238$SET_CASE_SENSITIVITY, (SubLObject)document_annotation_widgets.$kw239$OFF);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const183$Adjective);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const184$Adverb);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const185$Gerundive);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const241$countryCodeTrigraph);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const242$countryCodeDigraph);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym243$ALLOW_POS, document_annotation_widgets.$const244$ClosedClassWord);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym235$ADD_LEARNER, (SubLObject)document_annotation_widgets.$sym245$SCALAR_INTERVAL_LEARN);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym235$ADD_LEARNER, (SubLObject)document_annotation_widgets.$sym246$DATE_LEARN);
        if (document_annotation_widgets.NIL == lex) {
            methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const182$Verb);
            if (document_annotation_widgets.NIL != constant_handles.valid_constant(document_annotation_widgets.$const232$PredicateTaxonomy, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lex, (SubLObject)document_annotation_widgets.$sym186$ADD_CONCEPT_FILTER_SPEC, (SubLObject)document_annotation_widgets.$list233);
            }
        }
        return lex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 64821L)
    public static SubLObject get_default_document_ingester_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == document_annotation_widgets.UNPROVIDED) {
            nl_mt = (SubLObject)document_annotation_widgets.NIL;
        }
        SubLObject caching_state = document_annotation_widgets.$get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON, (SubLObject)document_annotation_widgets.$sym247$_GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nl_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_default_document_ingester_annotation_lexicon_internal(nl_mt)));
            memoization_state.caching_state_put(caching_state, nl_mt, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 65879L)
    public static SubLObject clear_default_document_ingester_annotation_lexicon_for_mt(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66175L)
    public static SubLObject get_default_document_annotation_learning_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == abstract_lexicon.abstract_lexicon_p(document_annotation_widgets.$default_document_annotation_learning_lexicon$.getDynamicValue(thread))) {
            document_annotation_widgets.$default_document_annotation_learning_lexicon$.setDynamicValue(make_default_document_annotation_lexicon((SubLObject)document_annotation_widgets.UNPROVIDED), thread);
            if (document_annotation_widgets.NIL != named_entity_recognizer.stanford_ner_ping((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(document_annotation_widgets.$default_document_annotation_learning_lexicon$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$sym235$ADD_LEARNER, (SubLObject)document_annotation_widgets.$sym236$STANFORD_NER_LEARN);
            }
        }
        return document_annotation_widgets.$default_document_annotation_learning_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66613L)
    public static SubLObject clear_default_document_annotation_learning_lexicon() {
        document_annotation_widgets.$default_document_annotation_learning_lexicon$.setDynamicValue((SubLObject)document_annotation_widgets.NIL);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66834L)
    public static SubLObject clear_default_document_annotation_lexicon() {
        document_annotation_widgets.$default_document_annotation_lexicon$.setDynamicValue((SubLObject)document_annotation_widgets.NIL);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
    public static SubLObject clear_get_default_document_annotation_lexicon() {
        final SubLObject cs = document_annotation_widgets.$get_default_document_annotation_lexicon_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
    public static SubLObject remove_get_default_document_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == document_annotation_widgets.UNPROVIDED) {
            nl_mt = (SubLObject)document_annotation_widgets.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(document_annotation_widgets.$get_default_document_annotation_lexicon_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nl_mt), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
    public static SubLObject get_default_document_annotation_lexicon_internal(final SubLObject nl_mt) {
        return make_default_document_annotation_lexicon(nl_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 66963L)
    public static SubLObject get_default_document_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == document_annotation_widgets.UNPROVIDED) {
            nl_mt = (SubLObject)document_annotation_widgets.NIL;
        }
        SubLObject caching_state = document_annotation_widgets.$get_default_document_annotation_lexicon_caching_state$.getGlobalValue();
        if (document_annotation_widgets.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document_annotation_widgets.$sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON, (SubLObject)document_annotation_widgets.$sym249$_GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON_CACHING_STATE_, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nl_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_default_document_annotation_lexicon_internal(nl_mt)));
            memoization_state.caching_state_put(caching_state, nl_mt, results, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 67118L)
    public static SubLObject make_default_document_annotation_lexicon(SubLObject base_mt) {
        if (base_mt == document_annotation_widgets.UNPROVIDED) {
            base_mt = (SubLObject)document_annotation_widgets.NIL;
        }
        final SubLObject lexicon = object.new_class_instance((SubLObject)document_annotation_widgets.$sym250$TERM_LEXICON);
        methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)document_annotation_widgets.$sym251$IGNORE_CACHE);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym238$SET_CASE_SENSITIVITY, (SubLObject)document_annotation_widgets.$kw252$PREFERRED);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym253$ALLOW_PREDICATE, document_annotation_widgets.$const254$preferredNameString);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const255$ksTermString);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const256$alias);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const257$programStrings);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const258$airportHasIATACode);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym240$EXCLUDE_PREDICATE, document_annotation_widgets.$const259$airportHasICAOCode);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym181$EXCLUDE_POS, document_annotation_widgets.$const244$ClosedClassWord);
        if (document_annotation_widgets.NIL != base_mt) {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym260$SET_BASE_MT, base_mt);
        }
        else {
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym261$ALLOW_MT, document_annotation_widgets.$const262$TechnicalEnglishLexicalMt);
            methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym261$ALLOW_MT, document_annotation_widgets.$const263$MedicalLexicalMt);
            if (document_annotation_widgets.NIL != constant_handles.valid_constant(constants_high.find_constant((SubLObject)document_annotation_widgets.$str264$CCFLexicalMt), (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym261$ALLOW_MT, document_annotation_widgets.$const265$CCFLexicalMt);
            }
        }
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)document_annotation_widgets.$sym186$ADD_CONCEPT_FILTER_SPEC, (SubLObject)document_annotation_widgets.$list266);
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 68507L)
    public static SubLObject get_default_document_annotation_rule_disambiguator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == rule_disambiguation.rule_disambiguator_p(document_annotation_widgets.$default_document_annotation_rule_disambiguator$.getDynamicValue(thread))) {
            document_annotation_widgets.$default_document_annotation_rule_disambiguator$.setDynamicValue(rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
        }
        return document_annotation_widgets.$default_document_annotation_rule_disambiguator$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 68814L)
    public static SubLObject maybe_initialize_doc_annotator_term_id_fbc(SubLObject file_path) {
        if (file_path == document_annotation_widgets.UNPROVIDED) {
            file_path = document_annotation_widgets.$doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == file_backed_cache.file_backed_cache_p(document_annotation_widgets.$doc_annotator_term_id_fbc$.getDynamicValue(thread))) {
            document_annotation_widgets.$doc_annotator_term_id_fbc$.setDynamicValue(file_backed_cache.file_backed_cache_create(file_path, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
        }
        return document_annotation_widgets.$doc_annotator_term_id_fbc$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 69189L)
    public static SubLObject maybe_initialize_doc_annotator_id_term_fbc(SubLObject file_path) {
        if (file_path == document_annotation_widgets.UNPROVIDED) {
            file_path = document_annotation_widgets.$doc_annotator_id_term_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == file_backed_cache.file_backed_cache_p(document_annotation_widgets.$doc_annotator_id_term_fbc$.getDynamicValue(thread))) {
            document_annotation_widgets.$doc_annotator_id_term_fbc$.setDynamicValue(file_backed_cache.file_backed_cache_create(file_path, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
        }
        return document_annotation_widgets.$doc_annotator_id_term_fbc$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 69492L)
    public static SubLObject rebuild_doc_annotator_term_id_fbc(SubLObject overwrite, SubLObject path) {
        if (overwrite == document_annotation_widgets.UNPROVIDED) {
            overwrite = (SubLObject)document_annotation_widgets.NIL;
        }
        if (path == document_annotation_widgets.UNPROVIDED) {
            path = document_annotation_widgets.$doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == overwrite) {
            return (SubLObject)document_annotation_widgets.$kw267$NOTHING_DONE;
        }
        final SubLObject fht = file_hash_table.create_file_hash_table(path, forts.fort_count(), (SubLObject)document_annotation_widgets.TEN_INTEGER, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.$kw52$IMAGE_INDEPENDENT_CFASL);
        SubLObject id = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        final SubLObject message = (SubLObject)document_annotation_widgets.$str268$rebuilding_term_id_FHT;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)document_annotation_widgets.NIL;
                table_var = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (document_annotation_widgets.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                        final SubLObject idx_$63 = idx;
                        if (document_annotation_widgets.NIL == id_index.id_index_dense_objects_empty_p(idx_$63, (SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$63);
                            final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id_$64;
                            SubLObject fort;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                                id_$64 = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id_$64);
                                if (document_annotation_widgets.NIL == id_index.id_index_tombstone_p(fort) || document_annotation_widgets.NIL == id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                                    if (document_annotation_widgets.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)document_annotation_widgets.$kw269$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    file_hash_table.put_file_hash_table(cycl_utilities.hl_to_el(fort), fht, id);
                                    id = Numbers.add(id, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                }
                            }
                        }
                        final SubLObject idx_$64 = idx;
                        if (document_annotation_widgets.NIL == id_index.id_index_sparse_objects_empty_p(idx_$64) || document_annotation_widgets.NIL == id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$64);
                            SubLObject id_$65 = id_index.id_index_sparse_id_threshold(idx_$64);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$64);
                            final SubLObject v_default = (SubLObject)((document_annotation_widgets.NIL != id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP)) ? document_annotation_widgets.NIL : document_annotation_widgets.$kw269$SKIP);
                            while (id_$65.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id_$65, sparse, v_default);
                                if (document_annotation_widgets.NIL == id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP) || document_annotation_widgets.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    file_hash_table.put_file_hash_table(cycl_utilities.hl_to_el(fort2), fht, id);
                                    id = Numbers.add(id, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                }
                                id_$65 = Numbers.add(id_$65, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.finalize_file_hash_table(fht);
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 69965L)
    public static SubLObject build_id_to_term_fbc(SubLObject path, SubLObject term_to_id_path) {
        if (path == document_annotation_widgets.UNPROVIDED) {
            path = document_annotation_widgets.$doc_annotator_id_term_fbc_path$.getDynamicValue();
        }
        if (term_to_id_path == document_annotation_widgets.UNPROVIDED) {
            term_to_id_path = document_annotation_widgets.$doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = file_hash_table.create_file_hash_table(path, (SubLObject)document_annotation_widgets.TEN_INTEGER, (SubLObject)document_annotation_widgets.TEN_INTEGER, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.$kw52$IMAGE_INDEPENDENT_CFASL);
        final SubLObject table_var;
        final SubLObject term_id_fht = table_var = file_hash_table.open_file_hash_table(term_to_id_path, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        utilities_macros.$progress_note$.setDynamicValue((SubLObject)document_annotation_widgets.$str270$Rebuilding_id__term_map, thread);
        utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
        utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
        utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject continuation = (SubLObject)document_annotation_widgets.NIL;
                SubLObject next;
                for (SubLObject completeP = (SubLObject)document_annotation_widgets.NIL; document_annotation_widgets.NIL == completeP; completeP = Types.sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)document_annotation_widgets.NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (document_annotation_widgets.NIL != next) {
                        final SubLObject v_term = the_key;
                        final SubLObject id = the_value;
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.ONE_INTEGER), thread);
                        file_hash_table.put_file_hash_table(id, fht, v_term);
                    }
                    continuation = next;
                }
            }
            finally {
                final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_annotation_widgets.$kw135$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 70430L)
    public static SubLObject augment_doc_annotator_term_fht(SubLObject path) {
        if (path == document_annotation_widgets.UNPROVIDED) {
            path = document_annotation_widgets.$doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = file_hash_table.open_file_hash_table(path, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject biggest_id = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject new_terms = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject message = (SubLObject)document_annotation_widgets.$str271$Augmenting_term_id_FHT;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)document_annotation_widgets.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)document_annotation_widgets.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)document_annotation_widgets.NIL;
                table_var = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (document_annotation_widgets.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                        final SubLObject idx_$69 = idx;
                        if (document_annotation_widgets.NIL == id_index.id_index_dense_objects_empty_p(idx_$69, (SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$69);
                            final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject id_$70;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                                id = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (document_annotation_widgets.NIL == id_index.id_index_tombstone_p(fort) || document_annotation_widgets.NIL == id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                                    if (document_annotation_widgets.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)document_annotation_widgets.$kw269$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    id_$70 = file_hash_table.get_file_hash_table(fort, fht, (SubLObject)document_annotation_widgets.$kw272$NO_ID);
                                    if (id_$70.isNumber() && id_$70.numG(biggest_id)) {
                                        biggest_id = id_$70;
                                    }
                                    else if (id_$70 == document_annotation_widgets.$kw272$NO_ID) {
                                        new_terms = (SubLObject)ConsesLow.cons(fort, new_terms);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$70 = idx;
                        if (document_annotation_widgets.NIL == id_index.id_index_sparse_objects_empty_p(idx_$70) || document_annotation_widgets.NIL == id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$70);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$70);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$70);
                            final SubLObject v_default = (SubLObject)((document_annotation_widgets.NIL != id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP)) ? document_annotation_widgets.NIL : document_annotation_widgets.$kw269$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (document_annotation_widgets.NIL == id_index.id_index_skip_tombstones_p((SubLObject)document_annotation_widgets.$kw269$SKIP) || document_annotation_widgets.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    final SubLObject id_$71 = file_hash_table.get_file_hash_table(fort2, fht, (SubLObject)document_annotation_widgets.$kw272$NO_ID);
                                    if (id_$71.isNumber() && id_$71.numG(biggest_id)) {
                                        biggest_id = id_$71;
                                    }
                                    else if (id_$71 == document_annotation_widgets.$kw272$NO_ID) {
                                        new_terms = (SubLObject)ConsesLow.cons(fort2, new_terms);
                                    }
                                }
                                id2 = Numbers.add(id2, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = new_terms;
        SubLObject new_fort = (SubLObject)document_annotation_widgets.NIL;
        new_fort = cdolist_list_var2.first();
        while (document_annotation_widgets.NIL != cdolist_list_var2) {
            biggest_id = Numbers.add(biggest_id, (SubLObject)document_annotation_widgets.ONE_INTEGER);
            file_hash_table.put_file_hash_table(new_fort, fht, biggest_id);
            cdolist_list_var2 = cdolist_list_var2.rest();
            new_fort = cdolist_list_var2.first();
        }
        file_hash_table.finalize_file_hash_table(fht);
        return biggest_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 71026L)
    public static SubLObject document_query(final SubLObject text_query) {
        SubLObject ids = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = terms_for_cyc_semantic_query(text_query);
        SubLObject record = (SubLObject)document_annotation_widgets.NIL;
        record = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$74 = record.rest();
            SubLObject interps = (SubLObject)document_annotation_widgets.NIL;
            interps = cdolist_list_var_$74.first();
            while (document_annotation_widgets.NIL != cdolist_list_var_$74) {
                ids = (SubLObject)ConsesLow.cons(conses_high.getf(interps, (SubLObject)document_annotation_widgets.$kw273$INTERP_ID, (SubLObject)document_annotation_widgets.UNPROVIDED), ids);
                cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                interps = cdolist_list_var_$74.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        }
        return lucene_double_query(text_query, string_utilities.bunge(Sequences.nreverse(ids), (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 71375L)
    public static SubLObject lucene_text_query(final SubLObject text_query, SubLObject max_ans_count) {
        if (max_ans_count == document_annotation_widgets.UNPROVIDED) {
            max_ans_count = (SubLObject)document_annotation_widgets.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hits = (SubLObject)document_annotation_widgets.NIL;
        SubLObject text_session = (SubLObject)document_annotation_widgets.NIL;
        try {
            text_session = lucene_session.new_lucene_session(lucene_session.get_lucene_host(), lucene_session.get_lucene_port(), get_text_index(), (SubLObject)document_annotation_widgets.$kw103$TEXT, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject text_hits = cdolist_list_var = lucene_session.lucene_query(text_session, text_query, max_ans_count);
            SubLObject hit = (SubLObject)document_annotation_widgets.NIL;
            hit = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                if (document_annotation_widgets.$annotated_document_format$.getDynamicValue(thread) == document_annotation_widgets.$kw158$SIMPLE) {
                    hits = (SubLObject)ConsesLow.cons(ConsesLow.append(hit, (SubLObject)document_annotation_widgets.$list274), hits);
                }
                else {
                    hits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw275$DOC_TEXT, hit, (SubLObject)document_annotation_widgets.$kw276$SEARCH_TYPE, (SubLObject)document_annotation_widgets.$kw103$TEXT), hits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hit = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (document_annotation_widgets.NIL != lucene_session.lucene_session_p(text_session)) {
                    lucene_session.lucene_finalize(text_session);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 72004L)
    public static SubLObject lucene_sem_query_with_sem_search_string(final SubLObject sem_query, SubLObject max_ans_count) {
        if (max_ans_count == document_annotation_widgets.UNPROVIDED) {
            max_ans_count = (SubLObject)document_annotation_widgets.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hits = (SubLObject)document_annotation_widgets.NIL;
        SubLObject sem_session = (SubLObject)document_annotation_widgets.NIL;
        try {
            sem_session = lucene_session.new_lucene_session(lucene_session.get_lucene_host(), lucene_session.get_lucene_port(), get_semantic_index(), (SubLObject)document_annotation_widgets.$kw104$CYC, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject cdolist_list_var = lucene_session.lucene_query(sem_session, sem_query, max_ans_count);
            SubLObject hit = (SubLObject)document_annotation_widgets.NIL;
            hit = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                if (document_annotation_widgets.$annotated_document_format$.getDynamicValue(thread) == document_annotation_widgets.$kw158$SIMPLE) {
                    hits = (SubLObject)ConsesLow.cons(conses_high.putf(hit, (SubLObject)document_annotation_widgets.$kw276$SEARCH_TYPE, (SubLObject)document_annotation_widgets.$kw104$CYC), hits);
                }
                else {
                    hits = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw275$DOC_TEXT, hit, (SubLObject)document_annotation_widgets.$kw276$SEARCH_TYPE, (SubLObject)document_annotation_widgets.$kw104$CYC), hits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hit = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (document_annotation_widgets.NIL != lucene_session.lucene_session_p(sem_session)) {
                    lucene_session.lucene_finalize(sem_session);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        hits = clean_semantic_search_hits(hits);
        return Sequences.nreverse(hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 72744L)
    public static SubLObject lucene_sem_query(final SubLObject text_query, SubLObject max_ans_count) {
        if (max_ans_count == document_annotation_widgets.UNPROVIDED) {
            max_ans_count = (SubLObject)document_annotation_widgets.TEN_INTEGER;
        }
        SubLObject ids = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = terms_for_cyc_semantic_query(text_query);
        SubLObject record = (SubLObject)document_annotation_widgets.NIL;
        record = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$75 = record.rest();
            SubLObject interps = (SubLObject)document_annotation_widgets.NIL;
            interps = cdolist_list_var_$75.first();
            while (document_annotation_widgets.NIL != cdolist_list_var_$75) {
                ids = (SubLObject)ConsesLow.cons(conses_high.getf(interps, (SubLObject)document_annotation_widgets.$kw273$INTERP_ID, (SubLObject)document_annotation_widgets.UNPROVIDED), ids);
                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                interps = cdolist_list_var_$75.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        }
        return lucene_sem_query_with_sem_search_string(string_utilities.bunge(Sequences.nreverse(ids), (SubLObject)document_annotation_widgets.UNPROVIDED), max_ans_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 73346L)
    public static SubLObject lucene_double_query(final SubLObject text_query, final SubLObject sem_query, SubLObject max_answer_count) {
        if (max_answer_count == document_annotation_widgets.UNPROVIDED) {
            max_answer_count = (SubLObject)document_annotation_widgets.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym277$LUCENE_DOUBLE_QUERY, text_query, sem_query, max_answer_count));
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn((SubLObject)document_annotation_widgets.$str167$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                PrintLow.format(out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym277$LUCENE_DOUBLE_QUERY, text_query, sem_query, max_answer_count));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return ConsesLow.append(lucene_text_query(text_query, max_answer_count), lucene_sem_query_with_sem_search_string(sem_query, max_answer_count));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 73678L)
    public static SubLObject cyc_semantic_search_token(final SubLObject token, final SubLObject interp) {
        if (document_annotation_widgets.NIL != cycl_grammar.cycl_nat_p(interp) || document_annotation_widgets.NIL != forts.fort_p(interp)) {
            return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str278$0_0_t___, new SubLObject[] { format_nil.format_nil_a_no_copy(document_annotation_term_id(interp, (SubLObject)document_annotation_widgets.UNPROVIDED)), document_annotation_widgets.$str142$_ });
        }
        return Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str279$0_0_s___, new SubLObject[] { format_nil.format_nil_a_no_copy(token), document_annotation_widgets.$str142$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 73913L)
    public static SubLObject terms_for_cyc_semantic_query(final SubLObject query_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL != document_annotation_widgets.$trace_doc_search_interface$.getDynamicValue(thread)) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym280$TERMS_FOR_CYC_SEMANTIC_QUERY, query_string));
        }
        if (document_annotation_widgets.NIL != document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                    stream = compatibility.open_text(document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$kw112$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn((SubLObject)document_annotation_widgets.$str167$writing_to__S, document_annotation_widgets.$doc_search_trace_log_file$.getDynamicValue(thread));
                PrintLow.format(out, (SubLObject)document_annotation_widgets.$str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym280$TERMS_FOR_CYC_SEMANTIC_QUERY, query_string));
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject ignore_errors_tag = (SubLObject)document_annotation_widgets.NIL;
        try {
            thread.throwStack.push(document_annotation_widgets.$kw281$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)document_annotation_widgets.$sym282$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream2 = (SubLObject)document_annotation_widgets.NIL;
                    try {
                        stream2 = compatibility.open_text((SubLObject)document_annotation_widgets.$str283$_cyc_projects_doc_annotation_quer, (SubLObject)document_annotation_widgets.$kw112$APPEND);
                        if (!stream2.isStream()) {
                            Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, (SubLObject)document_annotation_widgets.$str283$_cyc_projects_doc_annotation_quer);
                        }
                        final SubLObject log = stream2;
                        PrintLow.format(log, (SubLObject)document_annotation_widgets.$str284$_A___S__, numeric_date_utilities.timestamp((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), query_string);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (stream2.isStream()) {
                                streams_high.close(stream2, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)document_annotation_widgets.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)document_annotation_widgets.$kw281$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        SubLObject word_interp_map = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject tokenizations = qua_query.get_tokenizations_for_aq_string(query_string, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject remove_stopwordsP = (SubLObject)document_annotation_widgets.NIL;
            SubLObject cdolist_list_var = tokenizations;
            SubLObject tokenization = (SubLObject)document_annotation_widgets.NIL;
            tokenization = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                SubLObject list_var = (SubLObject)document_annotation_widgets.NIL;
                SubLObject token = (SubLObject)document_annotation_widgets.NIL;
                SubLObject token_num = (SubLObject)document_annotation_widgets.NIL;
                list_var = tokenization;
                token = list_var.first();
                for (token_num = (SubLObject)document_annotation_widgets.ZERO_INTEGER; document_annotation_widgets.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), token_num = Numbers.add((SubLObject)document_annotation_widgets.ONE_INTEGER, token_num)) {
                    final SubLObject string = qua_query.aq_term_original_string(token);
                    SubLObject interps = qua_query.aq_term_raw_meanings(token);
                    if (Sequences.length(interps).numG((SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                        interps = Sequences.remove_if((SubLObject)document_annotation_widgets.$sym161$STRINGP, interps, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$77 = interps;
                    SubLObject interp_cycl = (SubLObject)document_annotation_widgets.NIL;
                    interp_cycl = cdolist_list_var_$77.first();
                    while (document_annotation_widgets.NIL != cdolist_list_var_$77) {
                        if (document_annotation_widgets.NIL == list_utilities.every_in_list((SubLObject)document_annotation_widgets.$sym161$STRINGP, interps, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                            remove_stopwordsP = (SubLObject)document_annotation_widgets.T;
                        }
                        final SubLObject word = encode_word_for_semantic_query(string, interp_cycl);
                        word_interp_map = list_utilities.alist_push(word_interp_map, (SubLObject)ConsesLow.list(string, token_num), word, (SubLObject)document_annotation_widgets.EQUAL);
                        cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                        interp_cycl = cdolist_list_var_$77.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                tokenization = cdolist_list_var.first();
            }
            if (document_annotation_widgets.NIL != remove_stopwordsP) {
                word_interp_map = Sequences.remove_if((SubLObject)document_annotation_widgets.$sym285$STOPWORD_IN_SEM_QUERY_, word_interp_map, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
            }
        }
        finally {
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar((SubLObject)document_annotation_widgets.$sym286$REMOVE_CDAR, Sort.sort(word_interp_map, (SubLObject)document_annotation_widgets.$sym172$_, (SubLObject)document_annotation_widgets.$sym287$CADAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75315L)
    public static SubLObject remove_cdar(final SubLObject item) {
        return (SubLObject)ConsesLow.cons(conses_high.caar(item), item.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75392L)
    public static SubLObject stopword_in_sem_queryP(final SubLObject encoded_word) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL != lexicon_utilities.denots_of_string_stop_word(conses_high.caar(encoded_word)) && document_annotation_widgets.NIL != string_utilities.starts_with(conses_high.getf(conses_high.second(encoded_word), (SubLObject)document_annotation_widgets.$kw273$INTERP_ID, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.$str288$0_0_s));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75598L)
    public static SubLObject encode_word_for_semantic_query(final SubLObject string, final SubLObject interp_cycl) {
        return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw289$INTERP, interp_cycl, (SubLObject)document_annotation_widgets.$kw273$INTERP_ID, cyc_semantic_search_token(string, interp_cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 75894L)
    public static SubLObject terms_for_focused_cyc_semantic_query(final SubLObject query_string, final SubLObject term_id) {
        final SubLObject interp_cycl = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(term_id);
        if (document_annotation_widgets.NIL != forts.fort_p(interp_cycl) || document_annotation_widgets.NIL != cycl_grammar.cycl_nat_p(interp_cycl)) {
            final SubLObject interpretations = terms_for_cyc_semantic_query(query_string);
            SubLObject results = (SubLObject)document_annotation_widgets.NIL;
            SubLObject cdolist_list_var = interpretations;
            SubLObject interpretation = (SubLObject)document_annotation_widgets.NIL;
            interpretation = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = interpretation;
                SubLObject word = (SubLObject)document_annotation_widgets.NIL;
                SubLObject details = (SubLObject)document_annotation_widgets.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list291);
                word = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list291);
                details = current.first();
                current = current.rest();
                if (document_annotation_widgets.NIL == current) {
                    final SubLObject cycl_interpretation = conses_high.getf(details, (SubLObject)document_annotation_widgets.$kw289$INTERP, (SubLObject)document_annotation_widgets.NIL);
                    if (cycl_interpretation.equal(interp_cycl)) {
                        results = (SubLObject)ConsesLow.cons(interpretation, results);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list291);
                }
                cdolist_list_var = cdolist_list_var.rest();
                interpretation = cdolist_list_var.first();
            }
            if (document_annotation_widgets.NIL == results) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(query_string, encode_word_for_semantic_query(query_string, interp_cycl)), results);
            }
            return results;
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 76810L)
    public static SubLObject simple_terms_for_cyc_semantic_query(final SubLObject query_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_interp_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)document_annotation_widgets.EQUALP), (SubLObject)document_annotation_widgets.TWENTY_INTEGER);
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind((SubLObject)document_annotation_widgets.T, thread);
            SubLObject cdolist_list_var;
            final SubLObject tokenizations = cdolist_list_var = qua_query.get_tokenizations_for_aq_string(query_string, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject tokenization = (SubLObject)document_annotation_widgets.NIL;
            tokenization = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$78 = tokenization;
                SubLObject token = (SubLObject)document_annotation_widgets.NIL;
                token = cdolist_list_var_$78.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$78) {
                    final SubLObject string = qua_query.aq_term_original_string(token);
                    SubLObject cdolist_list_var_$79 = qua_query.aq_term_raw_meanings(token);
                    SubLObject interp_cycl = (SubLObject)document_annotation_widgets.NIL;
                    interp_cycl = cdolist_list_var_$79.first();
                    while (document_annotation_widgets.NIL != cdolist_list_var_$79) {
                        if (!interp_cycl.isString()) {
                            final SubLObject word = interp_cycl;
                            dictionary_utilities.dictionary_push(word_interp_map, string, word);
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
        finally {
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return dictionary_utilities.dictionary_to_alist(word_interp_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 77984L)
    public static SubLObject get_compiled_regexp(final SubLObject regexp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_version = list_utilities.alist_lookup(document_annotation_widgets.$cached_regexps$.getDynamicValue(thread), regexp, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (document_annotation_widgets.NIL != regular_expressions.regular_expression_p(cached_version)) {
            return cached_version;
        }
        document_annotation_widgets.$cached_regexps$.setDynamicValue(list_utilities.alist_enter(document_annotation_widgets.$cached_regexps$.getDynamicValue(thread), regexp, regular_expressions.compile_regular_expression(regexp, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
        return list_utilities.alist_lookup(document_annotation_widgets.$cached_regexps$.getDynamicValue(thread), regexp, (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 78353L)
    public static SubLObject clean_semantic_search_hits(final SubLObject hit_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = hit_list;
        SubLObject hit = (SubLObject)document_annotation_widgets.NIL;
        hit = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject snippet = conses_high.getf(hit, (SubLObject)document_annotation_widgets.$kw298$SNIPPET, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject title = conses_high.getf(hit, (SubLObject)document_annotation_widgets.$kw299$TITLE, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject cdolist_list_var_$80 = (SubLObject)ConsesLow.list(document_annotation_widgets.$remove_pictures_regexp$.getDynamicValue(thread), document_annotation_widgets.$remove_hyphens_regexp$.getDynamicValue(thread), document_annotation_widgets.$remove_underscores_regexp$.getDynamicValue(thread), document_annotation_widgets.$remove_dots_regexp$.getDynamicValue(thread), document_annotation_widgets.$remove_equals_regexp$.getDynamicValue(thread), document_annotation_widgets.$remove_unicode_regexp$.getDynamicValue(thread));
            SubLObject regexp = (SubLObject)document_annotation_widgets.NIL;
            regexp = cdolist_list_var_$80.first();
            while (document_annotation_widgets.NIL != cdolist_list_var_$80) {
                if (title.isString()) {
                    title = regular_expression_utilities.regex_subst(get_compiled_regexp(regexp), (SubLObject)document_annotation_widgets.$str111$, title, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                if (snippet.isString()) {
                    snippet = regular_expression_utilities.regex_subst(get_compiled_regexp(regexp), (SubLObject)document_annotation_widgets.$str111$, snippet, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                regexp = cdolist_list_var_$80.first();
            }
            hit = conses_high.putf(hit, (SubLObject)document_annotation_widgets.$kw299$TITLE, title);
            hit = conses_high.putf(hit, (SubLObject)document_annotation_widgets.$kw298$SNIPPET, snippet);
            output = (SubLObject)ConsesLow.cons(hit, output);
            cdolist_list_var = cdolist_list_var.rest();
            hit = cdolist_list_var.first();
        }
        return Sequences.nreverse(output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 79153L)
    public static SubLObject do_lexified_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)document_annotation_widgets.NIL;
        SubLObject lexicon = (SubLObject)document_annotation_widgets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list300);
        fort = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list300);
        lexicon = current.first();
        current = current.rest();
        if (document_annotation_widgets.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject seenP = (SubLObject)document_annotation_widgets.$sym301$SEEN_;
            return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym101$CLET, (SubLObject)ConsesLow.list(fort, reader.bq_cons(seenP, (SubLObject)document_annotation_widgets.$list302)), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym303$DO_LEXICON, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym304$STRING, (SubLObject)document_annotation_widgets.$sym305$LEX, lexicon), (SubLObject)document_annotation_widgets.$list306, (SubLObject)ConsesLow.listS((SubLObject)document_annotation_widgets.$sym307$CSETQ, fort, (SubLObject)document_annotation_widgets.$list308), (SubLObject)ConsesLow.listS((SubLObject)document_annotation_widgets.$sym309$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$sym310$GETHASH_WITHOUT_VALUES, fort, seenP), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)document_annotation_widgets.$sym311$SETHASH, fort, seenP, (SubLObject)document_annotation_widgets.$list312))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list300);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 79727L)
    public static SubLObject simple_document_tagging_results(final SubLObject doc_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = new_tagged_document(doc_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_annotation_widgets.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$81 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    rule_disambiguation.rdis_disambiguate(disambiguator, v_document, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject vector_var = document.document_paragraphs(v_document);
                    final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                        element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
                        paragraph = Vectors.aref(vector_var, element_num);
                        vector_var_$82 = document.paragraph_sentences(paragraph);
                        backwardP_var_$83 = (SubLObject)document_annotation_widgets.NIL;
                        for (length_$84 = Sequences.length(vector_var_$82), v_iteration_$85 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$85 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$85.numL(length_$84); v_iteration_$85 = Numbers.add(v_iteration_$85, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                            element_num_$86 = ((document_annotation_widgets.NIL != backwardP_var_$83) ? Numbers.subtract(length_$84, v_iteration_$85, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$85);
                            sentence = Vectors.aref(vector_var_$82, element_num_$86);
                            cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                            word = (SubLObject)document_annotation_widgets.NIL;
                            word = cdolist_list_var.first();
                            while (document_annotation_widgets.NIL != cdolist_list_var) {
                                word_string = document.word_string(word);
                                word_result = (SubLObject)ConsesLow.list(word_string);
                                interps = document.word_interps(word);
                                list_var = (SubLObject)document_annotation_widgets.NIL;
                                interp = (SubLObject)document_annotation_widgets.NIL;
                                interp_num = (SubLObject)document_annotation_widgets.NIL;
                                list_var = interps;
                                interp = list_var.first();
                                for (interp_num = (SubLObject)document_annotation_widgets.ZERO_INTEGER; document_annotation_widgets.NIL != list_var; list_var = list_var.rest(), interp = list_var.first(), interp_num = Numbers.add((SubLObject)document_annotation_widgets.ONE_INTEGER, interp_num)) {
                                    v_term = nl_api_datastructures.get_nl_interp_cycl(interp);
                                    word_result = (SubLObject)ConsesLow.cons(v_term, word_result);
                                }
                                if (document_annotation_widgets.NIL != interps) {
                                    result = (SubLObject)ConsesLow.cons(Sequences.nreverse(word_result), result);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                word = cdolist_list_var.first();
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$82 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$81, thread);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 80742L)
    public static SubLObject show_document_tagging_results(final SubLObject doc_string, SubLObject strings_per_concept) {
        if (strings_per_concept == document_annotation_widgets.UNPROVIDED) {
            strings_per_concept = (SubLObject)document_annotation_widgets.ONE_INTEGER;
        }
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject doc_tagging_result = simple_document_tagging_results(doc_string);
        final SubLObject params;
        final SubLObject generation_params = params = nl_generation_api.new_pph_parameters((SubLObject)document_annotation_widgets.UNPROVIDED);
        pph_parameter_declarations.set_pph_generation_count_internal(params, strings_per_concept);
        SubLObject cdolist_list_var = doc_tagging_result;
        SubLObject word_result = (SubLObject)document_annotation_widgets.NIL;
        word_result = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            final SubLObject concepts = word_result.rest();
            SubLObject new_word_result = (SubLObject)ConsesLow.list(word_result.first());
            SubLObject cdolist_list_var_$88 = concepts;
            SubLObject concept = (SubLObject)document_annotation_widgets.NIL;
            concept = cdolist_list_var_$88.first();
            while (document_annotation_widgets.NIL != cdolist_list_var_$88) {
                SubLObject cdolist_list_var_$89 = nl_generation_api.cycl_term_to_nl_internal(concept, generation_params);
                SubLObject map = (SubLObject)document_annotation_widgets.NIL;
                map = cdolist_list_var_$89.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$89) {
                    new_word_result = (SubLObject)ConsesLow.cons(nl_generation_api.pph_output_map_to_text_internal(map, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL), new_word_result);
                    cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                    map = cdolist_list_var_$89.first();
                }
                cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                concept = cdolist_list_var_$88.first();
            }
            result = (SubLObject)ConsesLow.cons(Sequences.nreverse(new_word_result), result);
            cdolist_list_var = cdolist_list_var.rest();
            word_result = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 81612L)
    public static SubLObject document_tagging_results_for_human_review(final SubLObject doc_string, SubLObject stream) {
        if (stream == document_annotation_widgets.UNPROVIDED) {
            stream = (SubLObject)document_annotation_widgets.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = new_tagged_document(doc_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject sentence_count = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)document_annotation_widgets.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$90 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    rule_disambiguation.rdis_disambiguate(disambiguator, v_document, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject vector_var = document.document_paragraphs(v_document);
                    final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                        element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
                        paragraph = Vectors.aref(vector_var, element_num);
                        vector_var_$91 = document.paragraph_sentences(paragraph);
                        backwardP_var_$92 = (SubLObject)document_annotation_widgets.NIL;
                        for (length_$93 = Sequences.length(vector_var_$91), v_iteration_$94 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$94 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$94.numL(length_$93); v_iteration_$94 = Numbers.add(v_iteration_$94, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                            element_num_$95 = ((document_annotation_widgets.NIL != backwardP_var_$92) ? Numbers.subtract(length_$93, v_iteration_$94, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$94);
                            sentence = Vectors.aref(vector_var_$91, element_num_$95);
                            sentence_count = Numbers.add(sentence_count, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                            PrintLow.format(stream, (SubLObject)document_annotation_widgets.$str313$_A___A__, sentence_count, document.sentence_string(sentence));
                            cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                            word = (SubLObject)document_annotation_widgets.NIL;
                            word = cdolist_list_var.first();
                            while (document_annotation_widgets.NIL != cdolist_list_var) {
                                word_string = document.word_string(word);
                                interps = document.word_cycls(word);
                                PrintLow.format(stream, (SubLObject)document_annotation_widgets.$str314$____A__, word_string);
                                cdolist_list_var_$96 = interps;
                                interp = (SubLObject)document_annotation_widgets.NIL;
                                interp = cdolist_list_var_$96.first();
                                while (document_annotation_widgets.NIL != cdolist_list_var_$96) {
                                    PrintLow.format(stream, (SubLObject)document_annotation_widgets.$str315$_A_, interp);
                                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                    interp = cdolist_list_var_$96.first();
                                }
                                PrintLow.format(stream, (SubLObject)document_annotation_widgets.$str316$__);
                                cdolist_list_var = cdolist_list_var.rest();
                                word = cdolist_list_var.first();
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$90, thread);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_annotation_widgets.$kw135$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 82578L)
    public static SubLObject remove_pictures_regexp_test(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return regular_expression_utilities.find_all_matches_for_regular_expression(document_annotation_widgets.$remove_pictures_regexp$.getDynamicValue(thread), string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 82578L)
    public static SubLObject get_doc_string_from_node_ids_and_strings_values(final SubLObject arg) {
        return Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_doc_string_from_node_ids_and_strings(arg)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 83584L)
    public static SubLObject get_interpretation_rules_for_mt(SubLObject mt) {
        if (mt == document_annotation_widgets.UNPROVIDED) {
            mt = document_annotation_widgets.$document_interpretation_default_elmt$.getDynamicValue();
        }
        SubLObject known_rules = dictionary.dictionary_lookup(document_annotation_widgets.$document_interpretation_rules_by_mt$.getGlobalValue(), mt, (SubLObject)document_annotation_widgets.UNPROVIDED);
        if (document_annotation_widgets.NIL != known_rules) {
            return known_rules;
        }
        known_rules = initialize_interpretation_rules(mt);
        return known_rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 83996L)
    public static SubLObject tag_document_for_interpretation(final SubLObject document_as_string, SubLObject lexicon) {
        if (lexicon == document_annotation_widgets.UNPROVIDED) {
            lexicon = get_default_document_annotation_lexicon((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        final SubLObject v_document = new_tagged_document(document_as_string, lexicon, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        return v_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 84328L)
    public static SubLObject get_concept_bag_from_document(final SubLObject v_document) {
        final SubLObject concept_bag = bag.new_bag((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
            element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$98 = document.paragraph_sentences(paragraph);
            backwardP_var_$99 = (SubLObject)document_annotation_widgets.NIL;
            for (length_$100 = Sequences.length(vector_var_$98), v_iteration_$101 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$101 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$101.numL(length_$100); v_iteration_$101 = Numbers.add(v_iteration_$101, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                element_num_$102 = ((document_annotation_widgets.NIL != backwardP_var_$99) ? Numbers.subtract(length_$100, v_iteration_$101, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$101);
                sentence = Vectors.aref(vector_var_$98, element_num_$102);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)document_annotation_widgets.NIL;
                word = cdolist_list_var.first();
                while (document_annotation_widgets.NIL != cdolist_list_var) {
                    cdolist_list_var_$103 = document.word_cycls(word);
                    interpretation = (SubLObject)document_annotation_widgets.NIL;
                    interpretation = cdolist_list_var_$103.first();
                    while (document_annotation_widgets.NIL != cdolist_list_var_$103) {
                        bag.bag_add(czer_main.canonicalize_term(interpretation, (SubLObject)document_annotation_widgets.UNPROVIDED), concept_bag);
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
    public static SubLObject do_interpretation_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule = (SubLObject)document_annotation_widgets.NIL;
        SubLObject rule_set = (SubLObject)document_annotation_widgets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list329);
        rule = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list329);
        rule_set = current.first();
        current = current.rest();
        if (document_annotation_widgets.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document_annotation_widgets.$sym330$DO_SET, (SubLObject)ConsesLow.list(rule, rule_set), ConsesLow.append(body, (SubLObject)document_annotation_widgets.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list329);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 84786L)
    public static SubLObject interpret_document_via_suggestions(final SubLObject document_as_string) {
        final SubLObject v_document = tag_document_for_interpretation(document_as_string, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject raw_concept_bag = get_concept_bag_from_document(v_document);
        return suggest_interpretations(raw_concept_bag, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 85055L)
    public static SubLObject suggest_interpretations(final SubLObject original_concept_bag, SubLObject rule_set, SubLObject elmt) {
        if (rule_set == document_annotation_widgets.UNPROVIDED) {
            rule_set = get_interpretation_rules_for_mt((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        if (elmt == document_annotation_widgets.UNPROVIDED) {
            elmt = document_annotation_widgets.$document_interpretation_default_elmt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concept_bag = bag.copy_bag(original_concept_bag);
        final SubLObject sentence_bag = bag.new_bag(Symbols.symbol_function((SubLObject)document_annotation_widgets.EQUAL), (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject justifications = (SubLObject)document_annotation_widgets.NIL;
        SubLObject changes;
        for (SubLObject quiescentP = (SubLObject)document_annotation_widgets.NIL; document_annotation_widgets.NIL == quiescentP; quiescentP = Numbers.zerop(changes)) {
            changes = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
            final SubLObject set_contents_var = set.do_set_internal(rule_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject rule;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject applies_p;
            SubLObject v_bindings;
            SubLObject insights;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)document_annotation_widgets.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); document_annotation_widgets.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                rule = set_contents.do_set_contents_next(basis_object, state);
                if (document_annotation_widgets.NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                    _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)document_annotation_widgets.$sym331$RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(elmt, thread);
                        thread.resetMultipleValues();
                        applies_p = interpretation_rule_appliesP(rule, concept_bag, sentence_bag);
                        v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (document_annotation_widgets.NIL != applies_p) {
                            insights = update_interpretation_with_rule(rule, concept_bag, sentence_bag, v_bindings);
                            if (!insights.isZero()) {
                                justifications = (SubLObject)ConsesLow.cons(rule, justifications);
                                changes = Numbers.add(changes, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return Values.values(concept_bag, sentence_bag, Sequences.nreverse(justifications));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 86316L)
    public static SubLObject interpretation_rule_appliesP(final SubLObject rule, final SubLObject concept_bag, final SubLObject sentence_bag) {
        final SubLObject preconditions = interpretation_rule_description_preconditions(rule);
        final SubLObject logical_operator = cycl_utilities.formula_arg0(preconditions);
        final SubLObject tests = cycl_utilities.formula_args(preconditions, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject v_bindings = (SubLObject)document_annotation_widgets.NIL;
        SubLObject concepts = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = tests;
        SubLObject test = (SubLObject)document_annotation_widgets.NIL;
        test = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject test_result = (SubLObject)document_annotation_widgets.NIL;
            if (document_annotation_widgets.NIL != forts.fort_p(test)) {
                if (document_annotation_widgets.NIL == concepts) {
                    concepts = bag.bag_unique_element_list(concept_bag);
                }
                final SubLObject candidates = genls.all_specs_among(test, concepts, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                test_result = list_utilities.sublisp_boolean(candidates);
                if (document_annotation_widgets.NIL != test_result) {
                    v_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(test, candidates), v_bindings);
                }
            }
            else if (document_annotation_widgets.NIL != el_utilities.el_formula_p(test)) {
                Errors.error((SubLObject)document_annotation_widgets.$str332$Dont_know_yet_how_to_unify_a_sent);
            }
            else {
                Errors.error((SubLObject)document_annotation_widgets.$str333$Dont_know_how_to_deal_with_test__, test);
            }
            if (document_annotation_widgets.NIL != test_result && logical_operator.eql(document_annotation_widgets.$const60$or)) {
                return Values.values((SubLObject)document_annotation_widgets.T, v_bindings);
            }
            if (document_annotation_widgets.NIL == test_result && logical_operator.eql(document_annotation_widgets.$const91$and)) {
                return Values.values((SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        }
        return Values.values((SubLObject)(logical_operator.eql(document_annotation_widgets.$const60$or) ? document_annotation_widgets.NIL : (logical_operator.eql(document_annotation_widgets.$const91$and) ? document_annotation_widgets.T : document_annotation_widgets.NIL)), v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 87735L)
    public static SubLObject update_interpretation_with_rule(final SubLObject rule, final SubLObject concept_bag, final SubLObject sentence_bag, final SubLObject v_bindings) {
        final SubLObject suggestions = interpretation_rule_description_suggestions(rule);
        SubLObject changes = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = (SubLObject)document_annotation_widgets.NIL;
        suggestion = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            if (document_annotation_widgets.$kw334$ADD_CONCEPT == cycl_utilities.formula_arg0(suggestion)) {
                final SubLObject concept = cycl_utilities.formula_arg1(suggestion, (SubLObject)document_annotation_widgets.UNPROVIDED);
                if (document_annotation_widgets.NIL == bag.bag_memberP(concept, concept_bag)) {
                    changes = Numbers.add(changes, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                    bag.bag_add(concept, concept_bag);
                }
            }
            else if (document_annotation_widgets.$kw335$ADD_SENTENCE == cycl_utilities.formula_arg0(suggestion)) {
                final SubLObject sentence_template = cycl_utilities.formula_arg1(suggestion, (SubLObject)document_annotation_widgets.UNPROVIDED);
                SubLObject cdolist_list_var_$104 = v_bindings;
                SubLObject binding = (SubLObject)document_annotation_widgets.NIL;
                binding = cdolist_list_var_$104.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$104) {
                    final SubLObject concept2 = binding.first();
                    final SubLObject mentioned_concepts = binding.rest();
                    if (document_annotation_widgets.NIL != list_utilities.tree_find(concept2, sentence_template, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                        SubLObject cdolist_list_var_$105 = mentioned_concepts;
                        SubLObject mentioned_concept = (SubLObject)document_annotation_widgets.NIL;
                        mentioned_concept = cdolist_list_var_$105.first();
                        while (document_annotation_widgets.NIL != cdolist_list_var_$105) {
                            final SubLObject sentence = list_utilities.tree_substitute(conses_high.copy_tree(sentence_template), concept2, mentioned_concept);
                            if (document_annotation_widgets.NIL == bag.bag_memberP(sentence, sentence_bag)) {
                                changes = Numbers.add(changes, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                                bag.bag_add(sentence, sentence_bag);
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
    public static SubLObject initialize_interpretation_rules(SubLObject elmt) {
        if (elmt == document_annotation_widgets.UNPROVIDED) {
            elmt = document_annotation_widgets.$document_interpretation_default_elmt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interp_rules = set.new_set((SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)document_annotation_widgets.$sym331$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(elmt, thread);
            final SubLObject pred_var = document_annotation_widgets.$const336$interpretationSuggestion;
            if (document_annotation_widgets.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)document_annotation_widgets.NIL;
                final SubLObject _prev_bind_0_$106 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$107 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)document_annotation_widgets.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((document_annotation_widgets.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : document_annotation_widgets.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)document_annotation_widgets.NIL;
                    final SubLObject token_var = (SubLObject)document_annotation_widgets.NIL;
                    while (document_annotation_widgets.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (document_annotation_widgets.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)document_annotation_widgets.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)document_annotation_widgets.$kw337$GAF, (SubLObject)document_annotation_widgets.$kw338$TRUE, (SubLObject)document_annotation_widgets.NIL);
                                SubLObject done_var_$108 = (SubLObject)document_annotation_widgets.NIL;
                                final SubLObject token_var_$109 = (SubLObject)document_annotation_widgets.NIL;
                                while (document_annotation_widgets.NIL == done_var_$108) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$109);
                                    final SubLObject valid_$110 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$109.eql(assertion));
                                    if (document_annotation_widgets.NIL != valid_$110) {
                                        add_interpretation_rule(assertion, interp_rules);
                                    }
                                    done_var_$108 = (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL == valid_$110);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (document_annotation_widgets.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(document_annotation_widgets.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$107, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$106, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        dictionary.dictionary_enter(document_annotation_widgets.$document_interpretation_rules_by_mt$.getGlobalValue(), elmt, interp_rules);
        return elmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 89605L)
    public static SubLObject add_interpretation_rule(final SubLObject assertion, final SubLObject rule_set) {
        final SubLObject antecedent = assertions_high.gaf_arg1(assertion);
        final SubLObject consequent = assertions_high.gaf_arg2(assertion);
        add_interpretation_rule_clauses(rule_set, antecedent, consequent);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 89844L)
    public static SubLObject add_interpretation_rule_clauses(final SubLObject rule_set, final SubLObject antecedent, final SubLObject consequent) {
        final SubLObject preconditions = extract_interpretation_rule_preconditions(antecedent);
        final SubLObject suggestions = extract_interpretation_rule_suggestions(consequent);
        final SubLObject rule = make_interpretation_rule_description(antecedent, consequent, preconditions, suggestions);
        store_interpretation_rule(rule_set, rule);
        return interpretation_rules_count(rule_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90311L)
    public static SubLObject interpretation_rules_count(final SubLObject rule_set) {
        return set.set_size(rule_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90398L)
    public static SubLObject clear_interpretation_rules() {
        return set.clear_set(get_interpretation_rules_for_mt((SubLObject)document_annotation_widgets.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90502L)
    public static SubLObject store_interpretation_rule(final SubLObject rule_set, final SubLObject rule) {
        return set.set_add(rule, rule_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90594L)
    public static SubLObject make_interpretation_rule_description(final SubLObject antecedent, final SubLObject consequent, final SubLObject preconditions, final SubLObject suggestions) {
        return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw339$ANTECEDENT, antecedent, (SubLObject)document_annotation_widgets.$kw340$CONSEQUENT, consequent, (SubLObject)document_annotation_widgets.$kw341$PRECONDITIONS, preconditions, (SubLObject)document_annotation_widgets.$kw342$SUGGESTIONS, suggestions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90853L)
    public static SubLObject interpretation_rule_description_antecedent(final SubLObject description) {
        return conses_high.getf(description, (SubLObject)document_annotation_widgets.$kw339$ANTECEDENT, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 90968L)
    public static SubLObject interpretation_rule_description_consequent(final SubLObject description) {
        return conses_high.getf(description, (SubLObject)document_annotation_widgets.$kw340$CONSEQUENT, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 91082L)
    public static SubLObject interpretation_rule_description_preconditions(final SubLObject description) {
        return conses_high.getf(description, (SubLObject)document_annotation_widgets.$kw341$PRECONDITIONS, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 91202L)
    public static SubLObject interpretation_rule_description_suggestions(final SubLObject description) {
        return conses_high.getf(description, (SubLObject)document_annotation_widgets.$kw342$SUGGESTIONS, (SubLObject)document_annotation_widgets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 91318L)
    public static SubLObject extract_interpretation_rule_preconditions(final SubLObject antecedent) {
        if (document_annotation_widgets.$const91$and.eql(cycl_utilities.formula_arg0(antecedent))) {
            SubLObject precondition = (SubLObject)document_annotation_widgets.NIL;
            final SubLObject operator = cycl_utilities.formula_arg0(antecedent);
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(antecedent, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject clause = (SubLObject)document_annotation_widgets.NIL;
            clause = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                precondition = (SubLObject)ConsesLow.cons(extract_interpretation_rule_precondition(clause), precondition);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            precondition = (SubLObject)ConsesLow.cons(operator, precondition);
            return precondition;
        }
        if (document_annotation_widgets.$const60$or.eql(cycl_utilities.formula_arg0(antecedent))) {
            SubLObject precondition = (SubLObject)document_annotation_widgets.NIL;
            final SubLObject operator = cycl_utilities.formula_arg0(antecedent);
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(antecedent, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject clause = (SubLObject)document_annotation_widgets.NIL;
            clause = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                precondition = (SubLObject)ConsesLow.cons(extract_interpretation_rule_precondition(clause), precondition);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            precondition = (SubLObject)ConsesLow.cons(operator, precondition);
            return precondition;
        }
        final SubLObject precondition2 = extract_interpretation_rule_precondition(antecedent);
        return (SubLObject)ConsesLow.list(document_annotation_widgets.$const91$and, precondition2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 92268L)
    public static SubLObject extract_interpretation_rule_suggestions(final SubLObject consequent) {
        if (document_annotation_widgets.$const91$and.eql(cycl_utilities.formula_arg0(consequent))) {
            SubLObject suggestions = (SubLObject)document_annotation_widgets.NIL;
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(consequent, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject clause = (SubLObject)document_annotation_widgets.NIL;
            clause = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                suggestions = (SubLObject)ConsesLow.cons(extract_interpretation_rule_suggestion(clause), suggestions);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            suggestions = Sequences.nreverse(suggestions);
            return suggestions;
        }
        if (document_annotation_widgets.$const60$or.eql(cycl_utilities.formula_arg0(consequent))) {
            SubLObject suggestions = (SubLObject)document_annotation_widgets.NIL;
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(consequent, (SubLObject)document_annotation_widgets.UNPROVIDED);
            SubLObject clause = (SubLObject)document_annotation_widgets.NIL;
            clause = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                suggestions = (SubLObject)ConsesLow.cons(extract_interpretation_rule_suggestion(clause), suggestions);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            suggestions = Sequences.nreverse(suggestions);
            return suggestions;
        }
        if (document_annotation_widgets.$const343$containsProposition_CW.eql(cycl_utilities.formula_arg0(consequent))) {
            final SubLObject sub_consequent = cycl_utilities.formula_arg2(consequent, (SubLObject)document_annotation_widgets.UNPROVIDED);
            return extract_interpretation_rule_suggestions(sub_consequent);
        }
        final SubLObject suggestion = extract_interpretation_rule_suggestion(consequent);
        return (SubLObject)ConsesLow.list(suggestion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 93299L)
    public static SubLObject extract_interpretation_rule_precondition(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(clause);
        if (document_annotation_widgets.$const344$thingDescribed.eql(operator)) {
            final SubLObject the_expression = cycl_utilities.formula_arg2(clause, (SubLObject)document_annotation_widgets.UNPROVIDED);
            if (document_annotation_widgets.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !cycl_utilities.formula_arg0(the_expression).eql(document_annotation_widgets.$const345$The)) {
                Errors.error((SubLObject)document_annotation_widgets.$str346$Invalid_THE_expression__A___, the_expression);
            }
            return cycl_utilities.formula_arg1(the_expression, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        Errors.error((SubLObject)document_annotation_widgets.$str347$Dont_know_how_to_handle_precondit, operator, clause);
        return clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 93804L)
    public static SubLObject extract_interpretation_rule_suggestion(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(clause);
        if (document_annotation_widgets.$const344$thingDescribed.eql(operator)) {
            final SubLObject the_expression = cycl_utilities.formula_arg2(clause, (SubLObject)document_annotation_widgets.UNPROVIDED);
            if (document_annotation_widgets.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !cycl_utilities.formula_arg0(the_expression).eql(document_annotation_widgets.$const345$The)) {
                Errors.error((SubLObject)document_annotation_widgets.$str346$Invalid_THE_expression__A___, the_expression);
            }
            final SubLObject concept = cycl_utilities.formula_arg1(the_expression, (SubLObject)document_annotation_widgets.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw334$ADD_CONCEPT, concept);
        }
        return (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$kw335$ADD_SENTENCE, clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 94296L)
    public static SubLObject cb_document_interpretation_show_concept(final SubLObject concept, SubLObject count) {
        if (count == document_annotation_widgets.UNPROVIDED) {
            count = (SubLObject)document_annotation_widgets.ONE_INTEGER;
        }
        cb_utilities.cb_form(concept, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        html_utilities.html_indent((SubLObject)document_annotation_widgets.UNPROVIDED);
        if (document_annotation_widgets.ONE_INTEGER.numG(count)) {
            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str202$_);
            html_utilities.html_princ(count);
            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str204$_);
            html_utilities.html_indent((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        return concept;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 94593L)
    public static SubLObject cb_document_interpretation_show_sentence(final SubLObject sentence, SubLObject count) {
        if (count == document_annotation_widgets.UNPROVIDED) {
            count = (SubLObject)document_annotation_widgets.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
            cb_utilities.cb_form(sentence, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 94760L)
    public static SubLObject cb_document_interpretation_show_rule(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
            final SubLObject antecedent = interpretation_rule_description_antecedent(rule);
            final SubLObject consequent = interpretation_rule_description_consequent(rule);
            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str348$If_it_is_the_case_that__);
            html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
            cb_utilities.cb_form(antecedent, (SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.T);
            html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str349$then_one_might_conclude_that__);
            html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
            cb_utilities.cb_form(consequent, (SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.T);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 95227L)
    public static SubLObject cb_document_interpretation_suggestions(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text = html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str119$text, args);
        final SubLObject mt_string = (document_annotation_widgets.NIL != html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str350$mt, args)) ? html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str350$mt, args) : string_utilities.string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string(document_annotation_widgets.$document_interpretation_default_elmt$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.UNPROVIDED));
        final SubLObject mt = cb_utilities.cb_guess_term(mt_string, (SubLObject)document_annotation_widgets.UNPROVIDED);
        final SubLObject title_var = (SubLObject)document_annotation_widgets.$str351$Document_Interpretation_Suggestio;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((document_annotation_widgets.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str352$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (document_annotation_widgets.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str353$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
            final SubLObject _prev_bind_0_$112 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == document_annotation_widgets.$kw24$UNINITIALIZED) ? ConsesLow.list(document_annotation_widgets.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)document_annotation_widgets.$kw354$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (document_annotation_widgets.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                final SubLObject _prev_bind_0_$113 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (document_annotation_widgets.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)document_annotation_widgets.$str357$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)document_annotation_widgets.$str358$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str359$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str360$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str361$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            if (document_annotation_widgets.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (document_annotation_widgets.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)document_annotation_widgets.$str362$Enter_the_text_to_interpret_);
                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)document_annotation_widgets.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)document_annotation_widgets.$str363$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        if (document_annotation_widgets.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)document_annotation_widgets.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)document_annotation_widgets.$str364$cb_document_interpretation_sugges, (SubLObject)document_annotation_widgets.T, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)document_annotation_widgets.$str365$Submit, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)document_annotation_widgets.TWO_INTEGER);
                            html_utilities.html_reset_input((SubLObject)document_annotation_widgets.$str366$Clear);
                            html_utilities.html_newline((SubLObject)document_annotation_widgets.TWO_INTEGER);
                            final SubLObject current_text = (SubLObject)(text.isString() ? text : document_annotation_widgets.$str111$);
                            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str119$text);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$int367$80);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.FIFTEEN_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                html_utilities.html_princ(current_text);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str368$Rule_Mt__);
                            html_utilities.html_text_input((SubLObject)document_annotation_widgets.$str350$mt, mt_string, (SubLObject)document_annotation_widgets.$int369$40);
                            html_complete.html_complete_button(mt_string, (SubLObject)document_annotation_widgets.$str370$Complete, document_annotation_widgets.$const371$Microtheory, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        if (document_annotation_widgets.NIL != text) {
                            final SubLObject v_document = tag_document_for_interpretation(text, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            final SubLObject raw_concept_bag = get_concept_bag_from_document(v_document);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str372$Identified_Concepts);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(raw_concept_bag)); document_annotation_widgets.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject concept = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject count = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cb_document_interpretation_show_concept(concept, count);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            final SubLObject count2 = (SubLObject)document_annotation_widgets.ONE_INTEGER;
                            final SubLObject set_contents_var = bag.do_bag_unique_internal(raw_concept_bag);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject concept2;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)document_annotation_widgets.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); document_annotation_widgets.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                concept2 = set_contents.do_set_contents_next(basis_object, state);
                                if (document_annotation_widgets.NIL != set_contents.do_set_contents_element_validP(state, concept2)) {
                                    cb_document_interpretation_show_concept(concept2, count2);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            thread.resetMultipleValues();
                            final SubLObject concept_bag = suggest_interpretations(raw_concept_bag, get_interpretation_rules_for_mt(mt), mt);
                            final SubLObject sentence_bag = thread.secondMultipleValue();
                            final SubLObject justifications = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (!bag.bag_size(concept_bag).numE(bag.bag_size(raw_concept_bag))) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)document_annotation_widgets.$str373$Suggested_Concepts);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                SubLObject iteration_state2;
                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(concept_bag)); document_annotation_widgets.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                    thread.resetMultipleValues();
                                    final SubLObject concept3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                    final SubLObject count3 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (document_annotation_widgets.NIL == bag.bag_memberP(concept3, raw_concept_bag)) {
                                        cb_document_interpretation_show_concept(concept3, count3);
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                final SubLObject count4 = (SubLObject)document_annotation_widgets.ONE_INTEGER;
                                final SubLObject set_contents_var2 = bag.do_bag_unique_internal(concept_bag);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject concept4;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)document_annotation_widgets.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); document_annotation_widgets.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    concept4 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (document_annotation_widgets.NIL != set_contents.do_set_contents_element_validP(state2, concept4) && document_annotation_widgets.NIL == bag.bag_memberP(concept4, raw_concept_bag)) {
                                        cb_document_interpretation_show_concept(concept4, count4);
                                    }
                                }
                            }
                            if (document_annotation_widgets.NIL == bag.bag_emptyP(sentence_bag)) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)document_annotation_widgets.$str374$Suggested_Sentences);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                    SubLObject iteration_state3;
                                    for (iteration_state3 = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(sentence_bag)); document_annotation_widgets.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state3); iteration_state3 = dictionary_contents.do_dictionary_contents_next(iteration_state3)) {
                                        thread.resetMultipleValues();
                                        final SubLObject sentence = dictionary_contents.do_dictionary_contents_key_value(iteration_state3);
                                        final SubLObject count5 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        cb_document_interpretation_show_sentence(sentence, count5);
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state3);
                                    final SubLObject count3 = (SubLObject)document_annotation_widgets.ONE_INTEGER;
                                    final SubLObject set_contents_var3 = bag.do_bag_unique_internal(sentence_bag);
                                    SubLObject basis_object3;
                                    SubLObject state3;
                                    SubLObject sentence2;
                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)document_annotation_widgets.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); document_annotation_widgets.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                        sentence2 = set_contents.do_set_contents_next(basis_object3, state3);
                                        if (document_annotation_widgets.NIL != set_contents.do_set_contents_element_validP(state3, sentence2)) {
                                            cb_document_interpretation_show_sentence(sentence2, count3);
                                        }
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            }
                            if (document_annotation_widgets.NIL != justifications) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)document_annotation_widgets.$str375$Applied_Rules);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.THREE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                    SubLObject cdolist_list_var = justifications;
                                    SubLObject rule = (SubLObject)document_annotation_widgets.NIL;
                                    rule = cdolist_list_var.first();
                                    while (document_annotation_widgets.NIL != cdolist_list_var) {
                                        cb_document_interpretation_show_rule(rule);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        rule = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            }
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$113, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$112, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_annotation_widgets.$kw135$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 99173L)
    public static SubLObject cb_annotate_tagged_concepts(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject previous_input_file = html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str379$previous_input_file, args);
        final SubLObject filename = (SubLObject)((document_annotation_widgets.NIL != html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str380$input_file, args)) ? html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str380$input_file, args) : document_annotation_widgets.$str111$);
        final SubLObject next_index_from_page = reader.read_from_string((SubLObject)((document_annotation_widgets.NIL != html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str381$next_index, args)) ? html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str381$next_index, args) : document_annotation_widgets.$str382$0), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject next_index = (SubLObject)(filename.equal(previous_input_file) ? next_index_from_page : document_annotation_widgets.ZERO_INTEGER);
        final SubLObject count = (SubLObject)document_annotation_widgets.$int383$30;
        final SubLObject data = annotation_data_from_file(filename, next_index, count);
        handle_submitted_manual_annotation_data(args);
        final SubLObject title_var = (SubLObject)document_annotation_widgets.$str384$Manual_Concept_Annotation;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((document_annotation_widgets.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str352$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (document_annotation_widgets.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str353$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
            final SubLObject _prev_bind_0_$120 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == document_annotation_widgets.$kw24$UNINITIALIZED) ? ConsesLow.list(document_annotation_widgets.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)document_annotation_widgets.$kw354$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (document_annotation_widgets.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                final SubLObject _prev_bind_0_$121 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)document_annotation_widgets.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (document_annotation_widgets.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)document_annotation_widgets.$str357$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)document_annotation_widgets.$str358$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str359$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str360$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str361$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            if (document_annotation_widgets.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (document_annotation_widgets.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        }
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)document_annotation_widgets.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)document_annotation_widgets.$str363$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        if (document_annotation_widgets.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)document_annotation_widgets.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)document_annotation_widgets.$str385$cb_annotate_tagged_concepts, (SubLObject)document_annotation_widgets.T, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_style_head$.getGlobalValue());
                            html_utilities.html_princ(concept_tagger.$doc_tagger_default_style$.getDynamicValue(thread));
                            html_utilities.html_markup(html_macros.$html_style_tail$.getGlobalValue());
                            html_utilities.html_hidden_input((SubLObject)document_annotation_widgets.$str379$previous_input_file, filename, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str386$Tagging_File_Name__);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str119$text);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$str380$input_file);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            if (document_annotation_widgets.NIL != filename) {
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_princ(filename);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_input_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)document_annotation_widgets.$int369$40);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            if (document_annotation_widgets.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_style_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)document_annotation_widgets.$str387$tr__border_color__black__________);
                            html_utilities.html_markup(html_macros.$html_style_tail$.getGlobalValue());
                            if (document_annotation_widgets.NIL != data) {
                                SubLObject current;
                                final SubLObject datum = current = data;
                                SubLObject text = (SubLObject)document_annotation_widgets.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list388);
                                text = current.first();
                                final SubLObject strings_and_concepts;
                                current = (strings_and_concepts = current.rest());
                                next_index = Numbers.add(next_index, Sequences.length(strings_and_concepts));
                                html_utilities.html_hidden_input((SubLObject)document_annotation_widgets.$str381$next_index, next_index, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_markup(document_annotation_widgets.$manual_document_annotation_instructions$.getDynamicValue(thread));
                                html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)document_annotation_widgets.ONE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                    SubLObject cdolist_list_var = strings_and_concepts;
                                    SubLObject string_and_concepts = (SubLObject)document_annotation_widgets.NIL;
                                    string_and_concepts = cdolist_list_var.first();
                                    while (document_annotation_widgets.NIL != cdolist_list_var) {
                                        final SubLObject string_frequency = string_and_concepts.first();
                                        final SubLObject string = conses_high.second(string_and_concepts);
                                        final SubLObject concepts = string_and_concepts.rest().rest();
                                        final SubLObject concept_count = Sequences.length(concepts);
                                        SubLObject list_var = (SubLObject)document_annotation_widgets.NIL;
                                        SubLObject concept = (SubLObject)document_annotation_widgets.NIL;
                                        SubLObject concept_number = (SubLObject)document_annotation_widgets.NIL;
                                        list_var = concepts;
                                        concept = list_var.first();
                                        for (concept_number = (SubLObject)document_annotation_widgets.ZERO_INTEGER; document_annotation_widgets.NIL != list_var; list_var = list_var.rest(), concept = list_var.first(), concept_number = Numbers.add((SubLObject)document_annotation_widgets.ONE_INTEGER, concept_number)) {
                                            final SubLObject v_class = (SubLObject)(concept_number.eql((SubLObject)document_annotation_widgets.ZERO_INTEGER) ? document_annotation_widgets.$str389$first : document_annotation_widgets.$str390$other);
                                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            if (document_annotation_widgets.NIL != v_class) {
                                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup(v_class);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                            }
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                if (concept_number.eql((SubLObject)document_annotation_widgets.ZERO_INTEGER)) {
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (document_annotation_widgets.NIL != concept_count) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                        html_utilities.html_markup(concept_count);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str391$_S, string);
                                                        html_utilities.html_newline((SubLObject)document_annotation_widgets.UNPROVIDED);
                                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str392$frequency___S__, string_frequency);
                                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str393$30_);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    cb_utilities.cb_form(concept, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str394$_CCFFCC);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    html_utilities.html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), (SubLObject)document_annotation_widgets.$str395$primary, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str396$Primary_Meaning___);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str397$_CCFFFF);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    html_utilities.html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), (SubLObject)document_annotation_widgets.$str398$contextual, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str399$Contextually_Dependent___);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str400$_FFCCFF);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    html_utilities.html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), (SubLObject)document_annotation_widgets.$str401$very_rare, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str402$Rare___);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str403$_FFCCCC);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    html_utilities.html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), (SubLObject)document_annotation_widgets.$str404$indecipherable, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str405$Indecipherable__);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str406$_FFFFCC);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    html_utilities.html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), (SubLObject)document_annotation_widgets.$str407$merge_candidate, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str408$Merge_away);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_markup((SubLObject)document_annotation_widgets.$str409$_CCCCFF);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)document_annotation_widgets.T, thread);
                                                    html_utilities.html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), (SubLObject)document_annotation_widgets.$str410$kill_candidate, (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)document_annotation_widgets.$str411$Invalid);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        string_and_concepts = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            html_utilities.html_submit_input((SubLObject)document_annotation_widgets.$str365$Submit, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$121, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$120, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 102422L)
    public static SubLObject handle_submitted_manual_annotation_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_file = html_utilities.html_extract_input((SubLObject)document_annotation_widgets.$str380$input_file, args);
        final SubLObject output_file_name = Sequences.cconcatenate((SubLObject)((document_annotation_widgets.NIL != input_file) ? input_file : document_annotation_widgets.$str111$), (SubLObject)document_annotation_widgets.$str413$_out);
        if (document_annotation_widgets.NIL == input_file) {
            return (SubLObject)document_annotation_widgets.NIL;
        }
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(output_file_name, (SubLObject)document_annotation_widgets.$kw112$APPEND);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, output_file_name);
            }
            final SubLObject s = stream;
            SubLObject cdolist_list_var = args;
            SubLObject arg = (SubLObject)document_annotation_widgets.NIL;
            arg = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                if (arg.isList() && document_annotation_widgets.NIL != kb_utilities.compact_hl_external_id_string_p(arg.first()) && document_annotation_widgets.NIL != list_utilities.lengthE(arg, (SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                    final SubLObject v_term = kb_utilities.maybe_find_object_by_compact_hl_internal_id_string(arg.first());
                    if (document_annotation_widgets.NIL != v_term) {
                        PrintLow.format(s, (SubLObject)document_annotation_widgets.$str414$_A__A__A__, new SubLObject[] { kb_utilities.compact_hl_external_id_string(v_term), conses_high.second(arg), v_term });
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 103049L)
    public static SubLObject annotation_data_from_file(final SubLObject filename, final SubLObject next_index, final SubLObject desired_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document_annotation_widgets.NIL == string_utilities.non_empty_string_p(filename) || document_annotation_widgets.NIL == Filesys.probe_file(filename)) {
            return (SubLObject)document_annotation_widgets.NIL;
        }
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        SubLObject read_result = (SubLObject)document_annotation_widgets.NIL;
        SubLObject count = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject final_index = Numbers.subtract(Numbers.add(next_index, desired_count), (SubLObject)document_annotation_widgets.ONE_INTEGER);
        final SubLObject file_string = file_utilities.slurp_file(filename);
        for (SubLObject error = (SubLObject)document_annotation_widgets.NIL; document_annotation_widgets.NIL == error && !read_result.equal((SubLObject)document_annotation_widgets.$kw415$EOF) && document_annotation_widgets.NIL == doneP; doneP = (SubLObject)document_annotation_widgets.T) {
            thread.resetMultipleValues();
            final SubLObject read_result_$135 = reader.read_from_string(file_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
            final SubLObject error_$136 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            read_result = read_result_$135;
            error = error_$136;
            PrintLow.format((SubLObject)document_annotation_widgets.T, (SubLObject)document_annotation_widgets.$str416$_);
            final SubLObject context_string = read_result.first();
            final SubLObject concept_pairs = read_result.rest();
            if (count.numGE(next_index)) {
                result = (SubLObject)ConsesLow.cons(context_string, result);
            }
            if (document_annotation_widgets.NIL == doneP) {
                SubLObject csome_list_var = concept_pairs;
                SubLObject concept_pair = (SubLObject)document_annotation_widgets.NIL;
                concept_pair = csome_list_var.first();
                while (document_annotation_widgets.NIL == doneP && document_annotation_widgets.NIL != csome_list_var) {
                    if (count.numG(final_index)) {
                        doneP = (SubLObject)document_annotation_widgets.T;
                    }
                    else if (count.numGE(next_index)) {
                        result = (SubLObject)ConsesLow.cons(concept_pair, result);
                    }
                    count = Numbers.add(count, (SubLObject)document_annotation_widgets.ONE_INTEGER);
                    csome_list_var = csome_list_var.rest();
                    concept_pair = csome_list_var.first();
                }
            }
            if (count.numG(next_index)) {}
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 104121L)
    public static SubLObject get_manual_annotations(SubLObject filename) {
        if (filename == document_annotation_widgets.UNPROVIDED) {
            filename = (SubLObject)document_annotation_widgets.$str417$_cyc_projects_sabre_data_july_200;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject file_var = filename;
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(file_var, (SubLObject)document_annotation_widgets.$kw148$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$137 = stream_var;
                SubLObject line_number_var = (SubLObject)document_annotation_widgets.NIL;
                SubLObject line = (SubLObject)document_annotation_widgets.NIL;
                line_number_var = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$137); document_annotation_widgets.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$137)) {
                    final SubLObject line_$138 = string_utilities.string_tokenize(line, (SubLObject)document_annotation_widgets.$list418, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$str419$_, (SubLObject)document_annotation_widgets.$str419$_)), (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)document_annotation_widgets.UNPROVIDED);
                    SubLObject current;
                    final SubLObject datum = current = line_$138;
                    SubLObject hl_id = (SubLObject)document_annotation_widgets.NIL;
                    SubLObject judgment = (SubLObject)document_annotation_widgets.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list420);
                    hl_id = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list420);
                    judgment = current.first();
                    final SubLObject ignore;
                    current = (ignore = current.rest());
                    final SubLObject v_term = kb_utilities.maybe_find_object_by_compact_hl_internal_id_string(hl_id);
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term, judgment), result);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 104620L)
    public static SubLObject get_manual_annotations_with_strings(SubLObject filename) {
        if (filename == document_annotation_widgets.UNPROVIDED) {
            filename = (SubLObject)document_annotation_widgets.$str421$_cyc_projects_sabre_data_july_200;
        }
        SubLObject result = (SubLObject)document_annotation_widgets.NIL;
        SubLObject intermed_result = (SubLObject)document_annotation_widgets.NIL;
        SubLObject previous_strings = (SubLObject)document_annotation_widgets.NIL;
        final SubLObject concept_to_strings_map = get_concept_to_strings_map_from_input_data(filename);
        final SubLObject annotated_filename = Sequences.cconcatenate(filename, (SubLObject)document_annotation_widgets.$str413$_out);
        SubLObject cdolist_list_var = get_manual_annotations(annotated_filename);
        SubLObject annotation = (SubLObject)document_annotation_widgets.NIL;
        annotation = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = annotation;
            SubLObject v_term = (SubLObject)document_annotation_widgets.NIL;
            SubLObject judgment = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list422);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list422);
            judgment = current.first();
            current = current.rest();
            if (document_annotation_widgets.NIL == current) {
                if (document_annotation_widgets.NIL != conses_high.intersection(previous_strings, dictionary.dictionary_lookup(concept_to_strings_map, v_term, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                    previous_strings = conses_high.intersection(previous_strings, dictionary.dictionary_lookup(concept_to_strings_map, v_term, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    intermed_result = (SubLObject)ConsesLow.cons(annotation, intermed_result);
                }
                else if (document_annotation_widgets.NIL == previous_strings) {
                    previous_strings = dictionary.dictionary_lookup(concept_to_strings_map, v_term, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    intermed_result = (SubLObject)ConsesLow.list(annotation);
                }
                else {
                    SubLObject cdolist_list_var_$139 = intermed_result;
                    SubLObject intermed_annotation = (SubLObject)document_annotation_widgets.NIL;
                    intermed_annotation = cdolist_list_var_$139.first();
                    while (document_annotation_widgets.NIL != cdolist_list_var_$139) {
                        SubLObject current_$141;
                        final SubLObject datum_$140 = current_$141 = intermed_annotation;
                        SubLObject intermed_term = (SubLObject)document_annotation_widgets.NIL;
                        SubLObject intermed_judgment = (SubLObject)document_annotation_widgets.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$141, datum_$140, (SubLObject)document_annotation_widgets.$list423);
                        intermed_term = current_$141.first();
                        current_$141 = current_$141.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$141, datum_$140, (SubLObject)document_annotation_widgets.$list423);
                        intermed_judgment = current_$141.first();
                        current_$141 = current_$141.rest();
                        if (document_annotation_widgets.NIL == current_$141) {
                            SubLObject cdolist_list_var_$140 = previous_strings;
                            SubLObject string = (SubLObject)document_annotation_widgets.NIL;
                            string = cdolist_list_var_$140.first();
                            while (document_annotation_widgets.NIL != cdolist_list_var_$140) {
                                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(intermed_term, intermed_judgment, string), result);
                                cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                                string = cdolist_list_var_$140.first();
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$140, (SubLObject)document_annotation_widgets.$list423);
                        }
                        cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                        intermed_annotation = cdolist_list_var_$139.first();
                    }
                    previous_strings = dictionary.dictionary_lookup(concept_to_strings_map, v_term, (SubLObject)document_annotation_widgets.UNPROVIDED);
                    intermed_result = (SubLObject)ConsesLow.list(annotation);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list422);
            }
            cdolist_list_var = cdolist_list_var.rest();
            annotation = cdolist_list_var.first();
        }
        cdolist_list_var = intermed_result;
        SubLObject intermed_annotation2 = (SubLObject)document_annotation_widgets.NIL;
        intermed_annotation2 = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = intermed_annotation2;
            SubLObject v_term = (SubLObject)document_annotation_widgets.NIL;
            SubLObject judgment = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list422);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list422);
            judgment = current.first();
            current = current.rest();
            if (document_annotation_widgets.NIL == current) {
                SubLObject cdolist_list_var_$141 = previous_strings;
                SubLObject string2 = (SubLObject)document_annotation_widgets.NIL;
                string2 = cdolist_list_var_$141.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$141) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term, judgment, string2), result);
                    cdolist_list_var_$141 = cdolist_list_var_$141.rest();
                    string2 = cdolist_list_var_$141.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list422);
            }
            cdolist_list_var = cdolist_list_var.rest();
            intermed_annotation2 = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 106220L)
    public static SubLObject get_concept_to_strings_map_from_input_data(SubLObject filename) {
        if (filename == document_annotation_widgets.UNPROVIDED) {
            filename = (SubLObject)document_annotation_widgets.$str421$_cyc_projects_sabre_data_july_200;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_string = file_utilities.slurp_file(filename);
        final SubLObject string_to_concepts_map = dictionary.new_dictionary((SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject read_result = (SubLObject)document_annotation_widgets.NIL;
        SubLObject error = (SubLObject)document_annotation_widgets.NIL;
        while (document_annotation_widgets.NIL == error && !read_result.equal((SubLObject)document_annotation_widgets.$kw415$EOF)) {
            thread.resetMultipleValues();
            final SubLObject read_result_$144 = reader.read_from_string_ignoring_errors(file_string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
            final SubLObject error_$145 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            read_result = read_result_$144;
            error = error_$145;
            SubLObject cdolist_list_var;
            final SubLObject weight_string_concepts_tuples = cdolist_list_var = read_result.rest();
            SubLObject concept_pair = (SubLObject)document_annotation_widgets.NIL;
            concept_pair = cdolist_list_var.first();
            while (document_annotation_widgets.NIL != cdolist_list_var) {
                final SubLObject string = conses_high.second(concept_pair);
                SubLObject cdolist_list_var_$146;
                final SubLObject concepts = cdolist_list_var_$146 = conses_high.cddr(concept_pair);
                SubLObject concept = (SubLObject)document_annotation_widgets.NIL;
                concept = cdolist_list_var_$146.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$146) {
                    dictionary_utilities.dictionary_push(string_to_concepts_map, concept, string);
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
    public static SubLObject get_assertions_for_concept_and_string(final SubLObject concept, final SubLObject string) {
        SubLObject assertions = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = nl_trie.nl_trie_search(string, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
        SubLObject trie_entry = (SubLObject)document_annotation_widgets.NIL;
        trie_entry = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            if (document_annotation_widgets.NIL != subl_promotions.memberP(concept, nl_trie.nl_trie_entry_denots(trie_entry), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED)) {
                SubLObject cdolist_list_var_$147 = nl_trie.nl_trie_entry_semantic_support_list(trie_entry);
                SubLObject v_assert = (SubLObject)document_annotation_widgets.NIL;
                v_assert = cdolist_list_var_$147.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$147) {
                    if (document_annotation_widgets.NIL != assertion_handles.assertion_p(v_assert) && lexicon_accessors.assertion_denotation(v_assert).equal(concept)) {
                        final SubLObject item_var = v_assert;
                        if (document_annotation_widgets.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)document_annotation_widgets.EQL), Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                            assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
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
    public static SubLObject ke_text_from_manual_annotations(SubLObject filename) {
        if (filename == document_annotation_widgets.UNPROVIDED) {
            filename = (SubLObject)document_annotation_widgets.$str421$_cyc_projects_sabre_data_july_200;
        }
        final SubLObject annotations = get_manual_annotations_with_strings(filename);
        SubLObject result_items = (SubLObject)document_annotation_widgets.NIL;
        SubLObject cdolist_list_var = annotations;
        SubLObject annotation = (SubLObject)document_annotation_widgets.NIL;
        annotation = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = annotation;
            SubLObject v_term = (SubLObject)document_annotation_widgets.NIL;
            SubLObject judgment = (SubLObject)document_annotation_widgets.NIL;
            SubLObject string = (SubLObject)document_annotation_widgets.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list424);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list424);
            judgment = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list424);
            string = current.first();
            current = current.rest();
            if (document_annotation_widgets.NIL == current) {
                SubLObject cdolist_list_var_$148 = get_assertions_for_concept_and_string(v_term, string);
                SubLObject v_assert = (SubLObject)document_annotation_widgets.NIL;
                v_assert = cdolist_list_var_$148.first();
                while (document_annotation_widgets.NIL != cdolist_list_var_$148) {
                    final SubLObject assert_formula = assertions_high.assertion_ist_formula(v_assert);
                    if (judgment.equal((SubLObject)document_annotation_widgets.$str395$primary)) {
                        final SubLObject item_var = Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str425$f_____strengthOfLexicalMapping_, new SubLObject[] { format_nil.format_nil_s_no_copy(assert_formula), document_annotation_widgets.$str426$___PrimaryLexicalMapping__ });
                        if (document_annotation_widgets.NIL == conses_high.member(item_var, result_items, (SubLObject)document_annotation_widgets.EQUAL, Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                            result_items = (SubLObject)ConsesLow.cons(item_var, result_items);
                        }
                    }
                    else if (judgment.equal((SubLObject)document_annotation_widgets.$str401$very_rare)) {
                        final SubLObject item_var = Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str425$f_____strengthOfLexicalMapping_, new SubLObject[] { format_nil.format_nil_s_no_copy(assert_formula), document_annotation_widgets.$str427$___VanishinglyRareLexicalMapping_ });
                        if (document_annotation_widgets.NIL == conses_high.member(item_var, result_items, (SubLObject)document_annotation_widgets.EQUAL, Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                            result_items = (SubLObject)ConsesLow.cons(item_var, result_items);
                        }
                    }
                    else if (judgment.equal((SubLObject)document_annotation_widgets.$str398$contextual)) {
                        final SubLObject item_var = Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str425$f_____strengthOfLexicalMapping_, new SubLObject[] { format_nil.format_nil_s_no_copy(assert_formula), document_annotation_widgets.$str428$___ContextuallyDependentLexicalMa });
                        if (document_annotation_widgets.NIL == conses_high.member(item_var, result_items, (SubLObject)document_annotation_widgets.EQUAL, Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                            result_items = (SubLObject)ConsesLow.cons(item_var, result_items);
                        }
                    }
                    else if (judgment.equal((SubLObject)document_annotation_widgets.$str410$kill_candidate)) {
                        final SubLObject item_var = Sequences.cconcatenate((SubLObject)document_annotation_widgets.$str429$kill__, new SubLObject[] { format_nil.format_nil_s_no_copy(v_term), document_annotation_widgets.$str416$_ });
                        if (document_annotation_widgets.NIL == conses_high.member(item_var, result_items, (SubLObject)document_annotation_widgets.EQUAL, Symbols.symbol_function((SubLObject)document_annotation_widgets.IDENTITY))) {
                            result_items = (SubLObject)ConsesLow.cons(item_var, result_items);
                        }
                    }
                    cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                    v_assert = cdolist_list_var_$148.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list424);
            }
            cdolist_list_var = cdolist_list_var.rest();
            annotation = cdolist_list_var.first();
        }
        cdolist_list_var = result_items;
        SubLObject result_item = (SubLObject)document_annotation_widgets.NIL;
        result_item = cdolist_list_var.first();
        while (document_annotation_widgets.NIL != cdolist_list_var) {
            print_high.princ(result_item, (SubLObject)document_annotation_widgets.T);
            streams_high.terpri((SubLObject)document_annotation_widgets.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result_item = cdolist_list_var.first();
        }
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document-annotation-widgets.lisp", position = 108731L)
    public static SubLObject output_webgame_qs(final SubLObject doc_index_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_files = (SubLObject)document_annotation_widgets.NIL;
        SubLObject stream = (SubLObject)document_annotation_widgets.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                stream = compatibility.open_text(doc_index_file, (SubLObject)document_annotation_widgets.$kw148$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, doc_index_file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$149 = stream_var;
                SubLObject line_number_var = (SubLObject)document_annotation_widgets.NIL;
                SubLObject line = (SubLObject)document_annotation_widgets.NIL;
                line_number_var = (SubLObject)document_annotation_widgets.ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$149); document_annotation_widgets.NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$149)) {
                    final SubLObject line_elts = string_utilities.string_tokenize(line, (SubLObject)document_annotation_widgets.$list418, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.$str419$_, (SubLObject)document_annotation_widgets.$str419$_)), (SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.NIL, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_backslash), (SubLObject)document_annotation_widgets.UNPROVIDED);
                    SubLObject current;
                    final SubLObject datum = current = line_elts;
                    SubLObject id = (SubLObject)document_annotation_widgets.NIL;
                    SubLObject url = (SubLObject)document_annotation_widgets.NIL;
                    SubLObject filedir = (SubLObject)document_annotation_widgets.NIL;
                    SubLObject time_stamp = (SubLObject)document_annotation_widgets.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list430);
                    id = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list430);
                    url = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list430);
                    filedir = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document_annotation_widgets.$list430);
                    time_stamp = current.first();
                    current = current.rest();
                    if (document_annotation_widgets.NIL == current) {
                        Errors.warn((SubLObject)document_annotation_widgets.$str431$input_file_line___S__, line_elts);
                        final SubLObject filename = Sequences.cconcatenate(filedir, time_stamp);
                        final SubLObject output_file = Sequences.cconcatenate(filename, (SubLObject)document_annotation_widgets.$str413$_out);
                        final SubLObject file_string = file_utilities.slurp_file(filename);
                        final SubLObject plain_doc = new_tagged_document(file_string, concept_tagger.get_browser_tagging_lexicon((SubLObject)document_annotation_widgets.NIL, (SubLObject)document_annotation_widgets.$list432, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        final SubLObject disambiguated_doc = rule_disambiguation.rdis_disambiguate(rule_disambiguation.new_rule_disambiguator((SubLObject)document_annotation_widgets.UNPROVIDED, (SubLObject)document_annotation_widgets.UNPROVIDED), plain_doc, (SubLObject)document_annotation_widgets.UNPROVIDED);
                        SubLObject stream_$150 = (SubLObject)document_annotation_widgets.NIL;
                        try {
                            final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)document_annotation_widgets.NIL, thread);
                                stream_$150 = compatibility.open_text(output_file, (SubLObject)document_annotation_widgets.$kw144$OUTPUT);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                            }
                            if (!stream_$150.isStream()) {
                                Errors.error((SubLObject)document_annotation_widgets.$str113$Unable_to_open__S, output_file);
                            }
                            final SubLObject s = stream_$150;
                            final SubLObject vector_var = document.document_paragraphs(disambiguated_doc);
                            final SubLObject backwardP_var = (SubLObject)document_annotation_widgets.NIL;
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
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document_annotation_widgets.NIL, v_iteration = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                                element_num = ((document_annotation_widgets.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration);
                                paragraph = Vectors.aref(vector_var, element_num);
                                vector_var_$151 = document.paragraph_sentences(paragraph);
                                backwardP_var_$152 = (SubLObject)document_annotation_widgets.NIL;
                                for (length_$153 = Sequences.length(vector_var_$151), v_iteration_$154 = (SubLObject)document_annotation_widgets.NIL, v_iteration_$154 = (SubLObject)document_annotation_widgets.ZERO_INTEGER; v_iteration_$154.numL(length_$153); v_iteration_$154 = Numbers.add(v_iteration_$154, (SubLObject)document_annotation_widgets.ONE_INTEGER)) {
                                    element_num_$155 = ((document_annotation_widgets.NIL != backwardP_var_$152) ? Numbers.subtract(length_$153, v_iteration_$154, (SubLObject)document_annotation_widgets.ONE_INTEGER) : v_iteration_$154);
                                    sent = Vectors.aref(vector_var_$151, element_num_$155);
                                    cdolist_list_var = document.sentence_yield_exhaustive(sent);
                                    word = (SubLObject)document_annotation_widgets.NIL;
                                    word = cdolist_list_var.first();
                                    while (document_annotation_widgets.NIL != cdolist_list_var) {
                                        cdolist_list_var_$156 = document.word_cycls(word);
                                        cycl = (SubLObject)document_annotation_widgets.NIL;
                                        cycl = cdolist_list_var_$156.first();
                                        while (document_annotation_widgets.NIL != cdolist_list_var_$156) {
                                            PrintLow.format(s, (SubLObject)document_annotation_widgets.$str433$__S__S__S___, new SubLObject[] { document.word_string(word), cycl, document.sentence_string(sent) });
                                            cdolist_list_var_$156 = cdolist_list_var_$156.rest();
                                            cycl = cdolist_list_var_$156.first();
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        word = cdolist_list_var.first();
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream_$150.isStream()) {
                                    streams_high.close(stream_$150, (SubLObject)document_annotation_widgets.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                            }
                        }
                        output_files = (SubLObject)ConsesLow.cons(output_file, output_files);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document_annotation_widgets.$list430);
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)document_annotation_widgets.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)document_annotation_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return output_files;
    }
    
    public static SubLObject declare_document_annotation_widgets_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document_annotation_widgets", "trace_doc_search", "TRACE-DOC-SEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_text_index", "GET-TEXT-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_semantic_index", "GET-SEMANTIC-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "semantic_index_initializedP", "SEMANTIC-INDEX-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "use_daves_temp_indexes", "USE-DAVES-TEMP-INDEXES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "use_development_indexes", "USE-DEVELOPMENT-INDEXES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "use_development_disambiguated_indexes", "USE-DEVELOPMENT-DISAMBIGUATED-INDEXES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "use_hezbollah_indexes", "USE-HEZBOLLAH-INDEXES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "new_closure_justification", "NEW-CLOSURE-JUSTIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_closure_justification_gaf", "GET-CLOSURE-JUSTIFICATION-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_closure_justification_spec", "GET-CLOSURE-JUSTIFICATION-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_closure_justification_genl", "GET-CLOSURE-JUSTIFICATION-GENL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "closure_justification_predicate", "CLOSURE-JUSTIFICATION-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "closure_justification_pred_id", "CLOSURE-JUSTIFICATION-PRED-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "substitute_template", "SUBSTITUTE-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "predicate_template", "PREDICATE-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "make_justifications", "MAKE-JUSTIFICATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "doc_annotation_irrelevant_term", "DOC-ANNOTATION-IRRELEVANT-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_term_learner_object_from_id", "CLEAR-TERM-LEARNER-OBJECT-FROM-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_term_learner_object_from_id", "REMOVE-TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "term_learner_object_from_id_internal", "TERM-LEARNER-OBJECT-FROM-ID-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "term_learner_object_from_id", "TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "maybe_term_learner_object_from_id", "MAYBE-TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_term_learner_id_for_cycl_string", "GET-TERM-LEARNER-ID-FOR-CYCL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_term_learner_id", "CLEAR-TERM-LEARNER-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_term_learner_id", "REMOVE-TERM-LEARNER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "term_learner_id_internal", "TERM-LEARNER-ID-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "term_learner_id", "TERM-LEARNER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_upwards_closure_justifications_internal", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_upwards_closure_justifications", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_upwards_closure", "GET-UPWARDS-CLOSURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_upwards_closure_justifications_cached", "CLEAR-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_upwards_closure_justifications_cached", "REMOVE-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_upwards_closure_justifications_cached_internal", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_upwards_closure_justifications_cached", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "caching_upwards_closure_justificationsP", "CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cache_upwards_closure_justifications", "CACHE-UPWARDS-CLOSURE-JUSTIFICATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cache_upwards_closure_justification", "CACHE-UPWARDS-CLOSURE-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "treatment_for_somethingP", "TREATMENT-FOR-SOMETHING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "ailmentP", "AILMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "agentP", "AGENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_treated_condition", "CLEAR-GET-TREATED-CONDITION", 0, 0, false);
        new $clear_get_treated_condition$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_treated_condition", "REMOVE-GET-TREATED-CONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_treated_condition_internal", "GET-TREATED-CONDITION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_treated_condition", "GET-TREATED-CONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_treatments_for_condition", "CLEAR-GET-TREATMENTS-FOR-CONDITION", 0, 0, false);
        new $clear_get_treatments_for_condition$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_treatments_for_condition", "REMOVE-GET-TREATMENTS-FOR-CONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_treatments_for_condition_internal", "GET-TREATMENTS-FOR-CONDITION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_treatments_for_condition", "GET-TREATMENTS-FOR-CONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_affected_parts", "CLEAR-GET-AFFECTED-PARTS", 0, 0, false);
        new $clear_get_affected_parts$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_affected_parts", "REMOVE-GET-AFFECTED-PARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_affected_parts_internal", "GET-AFFECTED-PARTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_affected_parts", "GET-AFFECTED-PARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_cooccurring_conditions", "CLEAR-GET-COOCCURRING-CONDITIONS", 0, 0, false);
        new $clear_get_cooccurring_conditions$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_cooccurring_conditions", "REMOVE-GET-COOCCURRING-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_cooccurring_conditions_internal", "GET-COOCCURRING-CONDITIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_cooccurring_conditions", "GET-COOCCURRING-CONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_groups", "GET-GROUPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_groups_non_cached", "GET-GROUPS-NON-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_leaders_to_groups", "CLEAR-LEADERS-TO-GROUPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_leaders_to_groups", "REMOVE-LEADERS-TO-GROUPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "leaders_to_groups_internal", "LEADERS-TO-GROUPS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "leaders_to_groups", "LEADERS-TO-GROUPS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_city_regions", "GET-CITY-REGIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_city_countries", "GET-CITY-COUNTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_cities_to_countries", "CLEAR-CITIES-TO-COUNTRIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_cities_to_countries", "REMOVE-CITIES-TO-COUNTRIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cities_to_countries_internal", "CITIES-TO-COUNTRIES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cities_to_countries", "CITIES-TO-COUNTRIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_city_countries_non_cached", "GET-CITY-COUNTRIES-NON-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_country_regions", "GET-COUNTRY-REGIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_country_regions_non_cached", "GET-COUNTRY-REGIONS-NON-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_countries_to_regions", "CLEAR-COUNTRIES-TO-REGIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_countries_to_regions", "REMOVE-COUNTRIES-TO-REGIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "countries_to_regions_internal", "COUNTRIES-TO-REGIONS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "countries_to_regions", "COUNTRIES-TO-REGIONS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document_annotation_widgets", "with_dual_lucene_sessions", "WITH-DUAL-LUCENE-SESSIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "add_fully_indexed_documents_from_dir", "ADD-FULLY-INDEXED-DOCUMENTS-FROM-DIR", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "add_fully_indexed_documents", "ADD-FULLY-INDEXED-DOCUMENTS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "tag_xml_documents_with_urls", "TAG-XML-DOCUMENTS-WITH-URLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "tag_xml_document_filespec", "TAG-XML-DOCUMENT-FILESPEC", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "read_original_doc", "READ-ORIGINAL-DOC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "tag_xml_doc_set_with_urls", "TAG-XML-DOC-SET-WITH-URLS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "index_xml_doc_set_from_map_file", "INDEX-XML-DOC-SET-FROM-MAP-FILE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "index_pre_tagged_xml_docs", "INDEX-PRE-TAGGED-XML-DOCS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "index_pre_tagged_xml_doc", "INDEX-PRE-TAGGED-XML-DOC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "lucene_add_document_semantic", "LUCENE-ADD-DOCUMENT-SEMANTIC", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "lucene_add_document_keyword", "LUCENE-ADD-DOCUMENT-KEYWORD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "add_fully_indexed_document", "ADD-FULLY-INDEXED-DOCUMENT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "print_offset_info", "PRINT-OFFSET-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "print_term_and_reln", "PRINT-TERM-AND-RELN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "print_token", "PRINT-TOKEN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "new_tagged_document", "NEW-TAGGED-DOCUMENT", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "find_concepts_for_document_segments", "FIND-CONCEPTS-FOR-DOCUMENT-SEGMENTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "tag_document_nodes_for_display", "TAG-DOCUMENT-NODES-FOR-DISPLAY", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_doc_string_from_node_ids_and_strings", "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_output_lists_for_word", "GET-OUTPUT-LISTS-FOR-WORD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "node_and_node_offset", "NODE-AND-NODE-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "new_named_entity_wordP", "NEW-NAMED-ENTITY-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "nart_has_non_derived_assertionsP", "NART-HAS-NON-DERIVED-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "find_interps_for_document_segments", "FIND-INTERPS-FOR-DOCUMENT-SEGMENTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_medical_tagging_lexicon", "GET-DEFAULT-MEDICAL-TAGGING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_default_medical_tagging_lexicon", "CLEAR-DEFAULT-MEDICAL-TAGGING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "augment_medical_html_file_with_cyc_terms", "AUGMENT-MEDICAL-HTML-FILE-WITH-CYC-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "augment_html_document_with_cyc_terms", "AUGMENT-HTML-DOCUMENT-WITH-CYC-TERMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "doc_tagger_rdf_name", "DOC-TAGGER-RDF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "doc_tagger_rdf_id", "DOC-TAGGER-RDF-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "mapping_first_elt_info", "MAPPING-FIRST-ELT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_text_string_from_tokens", "GET-TEXT-STRING-FROM-TOKENS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "tag_document_for_indexing_with_offsets", "TAG-DOCUMENT-FOR-INDEXING-WITH-OFFSETS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_annotation_relation_from_id", "DOCUMENT-ANNOTATION-RELATION-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "generate_retrieval_justification", "GENERATE-RETRIEVAL-JUSTIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "generate_retrieval_justification_from_justification_string", "GENERATE-RETRIEVAL-JUSTIFICATION-FROM-JUSTIFICATION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_best_justifications_from_arg_list", "GET-BEST-JUSTIFICATIONS-FROM-ARG-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "better_justification_pred", "BETTER-JUSTIFICATION-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "generate_term_explanation", "GENERATE-TERM-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_other_explanatory_strings_for_term", "GET-OTHER-EXPLANATORY-STRINGS-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_document_annotation_term_id", "CLEAR-DOCUMENT-ANNOTATION-TERM-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_document_annotation_term_id", "REMOVE-DOCUMENT-ANNOTATION-TERM-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_annotation_term_id_internal", "DOCUMENT-ANNOTATION-TERM-ID-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_annotation_term_id", "DOCUMENT-ANNOTATION-TERM-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_document_annotation_term_from_id", "CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_document_annotation_term_from_id", "REMOVE-DOCUMENT-ANNOTATION-TERM-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_annotation_term_from_id_internal", "DOCUMENT-ANNOTATION-TERM-FROM-ID-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_annotation_term_from_id", "DOCUMENT-ANNOTATION-TERM-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_cached_term_id", "GET-CACHED-TERM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_term_from_cached_id", "GET-TERM-FROM-CACHED-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_ingester_annotation_learning_lexicon", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICON", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_default_document_ingester_annotation_learning_lexicon", "CLEAR-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_default_document_ingester_annotation_lexicon", "CLEAR-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_default_document_ingester_annotation_lexicon", "REMOVE-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_ingester_annotation_lexicon_internal", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_ingester_annotation_lexicon", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_default_document_ingester_annotation_lexicon_for_mt", "CLEAR-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_annotation_learning_lexicon", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_default_document_annotation_learning_lexicon", "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_default_document_annotation_lexicon", "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_get_default_document_annotation_lexicon", "CLEAR-GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_get_default_document_annotation_lexicon", "REMOVE-GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_annotation_lexicon_internal", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_annotation_lexicon", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "make_default_document_annotation_lexicon", "MAKE-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_default_document_annotation_rule_disambiguator", "GET-DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "maybe_initialize_doc_annotator_term_id_fbc", "MAYBE-INITIALIZE-DOC-ANNOTATOR-TERM-ID-FBC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "maybe_initialize_doc_annotator_id_term_fbc", "MAYBE-INITIALIZE-DOC-ANNOTATOR-ID-TERM-FBC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "rebuild_doc_annotator_term_id_fbc", "REBUILD-DOC-ANNOTATOR-TERM-ID-FBC", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "build_id_to_term_fbc", "BUILD-ID-TO-TERM-FBC", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "augment_doc_annotator_term_fht", "AUGMENT-DOC-ANNOTATOR-TERM-FHT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_query", "DOCUMENT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "lucene_text_query", "LUCENE-TEXT-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "lucene_sem_query_with_sem_search_string", "LUCENE-SEM-QUERY-WITH-SEM-SEARCH-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "lucene_sem_query", "LUCENE-SEM-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "lucene_double_query", "LUCENE-DOUBLE-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cyc_semantic_search_token", "CYC-SEMANTIC-SEARCH-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "terms_for_cyc_semantic_query", "TERMS-FOR-CYC-SEMANTIC-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_cdar", "REMOVE-CDAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "stopword_in_sem_queryP", "STOPWORD-IN-SEM-QUERY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "encode_word_for_semantic_query", "ENCODE-WORD-FOR-SEMANTIC-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "terms_for_focused_cyc_semantic_query", "TERMS-FOR-FOCUSED-CYC-SEMANTIC-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "simple_terms_for_cyc_semantic_query", "SIMPLE-TERMS-FOR-CYC-SEMANTIC-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_compiled_regexp", "GET-COMPILED-REGEXP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clean_semantic_search_hits", "CLEAN-SEMANTIC-SEARCH-HITS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document_annotation_widgets", "do_lexified_forts", "DO-LEXIFIED-FORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "simple_document_tagging_results", "SIMPLE-DOCUMENT-TAGGING-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "show_document_tagging_results", "SHOW-DOCUMENT-TAGGING-RESULTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "document_tagging_results_for_human_review", "DOCUMENT-TAGGING-RESULTS-FOR-HUMAN-REVIEW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "remove_pictures_regexp_test", "REMOVE-PICTURES-REGEXP-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_doc_string_from_node_ids_and_strings_values", "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_interpretation_rules_for_mt", "GET-INTERPRETATION-RULES-FOR-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "tag_document_for_interpretation", "TAG-DOCUMENT-FOR-INTERPRETATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_concept_bag_from_document", "GET-CONCEPT-BAG-FROM-DOCUMENT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document_annotation_widgets", "do_interpretation_rules", "DO-INTERPRETATION-RULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpret_document_via_suggestions", "INTERPRET-DOCUMENT-VIA-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "suggest_interpretations", "SUGGEST-INTERPRETATIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpretation_rule_appliesP", "INTERPRETATION-RULE-APPLIES?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "update_interpretation_with_rule", "UPDATE-INTERPRETATION-WITH-RULE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "initialize_interpretation_rules", "INITIALIZE-INTERPRETATION-RULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "add_interpretation_rule", "ADD-INTERPRETATION-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "add_interpretation_rule_clauses", "ADD-INTERPRETATION-RULE-CLAUSES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpretation_rules_count", "INTERPRETATION-RULES-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "clear_interpretation_rules", "CLEAR-INTERPRETATION-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "store_interpretation_rule", "STORE-INTERPRETATION-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "make_interpretation_rule_description", "MAKE-INTERPRETATION-RULE-DESCRIPTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpretation_rule_description_antecedent", "INTERPRETATION-RULE-DESCRIPTION-ANTECEDENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpretation_rule_description_consequent", "INTERPRETATION-RULE-DESCRIPTION-CONSEQUENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpretation_rule_description_preconditions", "INTERPRETATION-RULE-DESCRIPTION-PRECONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "interpretation_rule_description_suggestions", "INTERPRETATION-RULE-DESCRIPTION-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "extract_interpretation_rule_preconditions", "EXTRACT-INTERPRETATION-RULE-PRECONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "extract_interpretation_rule_suggestions", "EXTRACT-INTERPRETATION-RULE-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "extract_interpretation_rule_precondition", "EXTRACT-INTERPRETATION-RULE-PRECONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "extract_interpretation_rule_suggestion", "EXTRACT-INTERPRETATION-RULE-SUGGESTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cb_document_interpretation_show_concept", "CB-DOCUMENT-INTERPRETATION-SHOW-CONCEPT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cb_document_interpretation_show_sentence", "CB-DOCUMENT-INTERPRETATION-SHOW-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cb_document_interpretation_show_rule", "CB-DOCUMENT-INTERPRETATION-SHOW-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cb_document_interpretation_suggestions", "CB-DOCUMENT-INTERPRETATION-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "cb_annotate_tagged_concepts", "CB-ANNOTATE-TAGGED-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "handle_submitted_manual_annotation_data", "HANDLE-SUBMITTED-MANUAL-ANNOTATION-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "annotation_data_from_file", "ANNOTATION-DATA-FROM-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_manual_annotations", "GET-MANUAL-ANNOTATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_manual_annotations_with_strings", "GET-MANUAL-ANNOTATIONS-WITH-STRINGS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_concept_to_strings_map_from_input_data", "GET-CONCEPT-TO-STRINGS-MAP-FROM-INPUT-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "get_assertions_for_concept_and_string", "GET-ASSERTIONS-FOR-CONCEPT-AND-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "ke_text_from_manual_annotations", "KE-TEXT-FROM-MANUAL-ANNOTATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document_annotation_widgets", "output_webgame_qs", "OUTPUT-WEBGAME-QS", 1, 0, false);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    public static SubLObject init_document_annotation_widgets_file() {
        document_annotation_widgets.$text_index$ = SubLFiles.defparameter("*TEXT-INDEX*", (SubLObject)document_annotation_widgets.$str0$_host_george_super_index_hezbolla);
        document_annotation_widgets.$semantic_index$ = SubLFiles.defparameter("*SEMANTIC-INDEX*", (SubLObject)document_annotation_widgets.$str1$_host_george_super_index_hezbolla);
        document_annotation_widgets.$text_index_override$ = SubLFiles.defparameter("*TEXT-INDEX-OVERRIDE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$semantic_index_override$ = SubLFiles.defparameter("*SEMANTIC-INDEX-OVERRIDE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$trace_doc_search_interface$ = SubLFiles.defparameter("*TRACE-DOC-SEARCH-INTERFACE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$doc_search_trace_log_file$ = SubLFiles.defparameter("*DOC-SEARCH-TRACE-LOG-FILE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$predicate_id_table$ = SubLFiles.defparameter("*PREDICATE-ID-TABLE*", (SubLObject)document_annotation_widgets.$list21);
        document_annotation_widgets.$predicate_template_table$ = SubLFiles.defparameter("*PREDICATE-TEMPLATE-TABLE*", (SubLObject)document_annotation_widgets.$list22);
        document_annotation_widgets.$upwards_closure_justification_fbc$ = SubLFiles.defparameter("*UPWARDS-CLOSURE-JUSTIFICATION-FBC*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$upwards_closure_justification_fht_path$ = SubLFiles.defparameter("*UPWARDS-CLOSURE-JUSTIFICATION-FHT-PATH*", (SubLObject)document_annotation_widgets.$str23$data_doc_tagging_upwards_closure_);
        document_annotation_widgets.$doc_annotation_thcl_verboseP$ = SubLFiles.defparameter("*DOC-ANNOTATION-THCL-VERBOSE?*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$term_learner_object_from_id_caching_state$ = SubLFiles.deflexical("*TERM-LEARNER-OBJECT-FROM-ID-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$term_learner_id_caching_state$ = SubLFiles.deflexical("*TERM-LEARNER-ID-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$upwards_closure_query_mt$ = SubLFiles.defparameter("*UPWARDS-CLOSURE-QUERY-MT*", (SubLObject)document_annotation_widgets.$list39);
        document_annotation_widgets.$get_upwards_closure_justifications_cached_caching_state$ = SubLFiles.deflexical("*GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$caching_upwards_closure_justificationsP$ = SubLFiles.defparameter("*CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$get_treated_condition_caching_state$ = SubLFiles.deflexical("*GET-TREATED-CONDITION-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$get_treatments_for_condition_caching_state$ = SubLFiles.deflexical("*GET-TREATMENTS-FOR-CONDITION-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$get_affected_parts_caching_state$ = SubLFiles.deflexical("*GET-AFFECTED-PARTS-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$get_cooccurring_conditions_caching_state$ = SubLFiles.deflexical("*GET-COOCCURRING-CONDITIONS-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$leaders_to_groups_caching_state$ = SubLFiles.deflexical("*LEADERS-TO-GROUPS-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$cities_to_countries_caching_state$ = SubLFiles.deflexical("*CITIES-TO-COUNTRIES-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$countries_to_regions_caching_state$ = SubLFiles.deflexical("*COUNTRIES-TO-REGIONS-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$tagged_xml_doc_directory$ = SubLFiles.defparameter("*TAGGED-XML-DOC-DIRECTORY*", (SubLObject)document_annotation_widgets.$str115$_host_george_scratch_tagged_xml_d);
        document_annotation_widgets.$tagged_doc_title_name$ = SubLFiles.defconstant("*TAGGED-DOC-TITLE-NAME*", (SubLObject)document_annotation_widgets.$str116$title);
        document_annotation_widgets.$tagged_doc_title_token$ = SubLFiles.defconstant("*TAGGED-DOC-TITLE-TOKEN*", (SubLObject)document_annotation_widgets.$str117$_title_);
        document_annotation_widgets.$tagged_doc_title_close_token$ = SubLFiles.defconstant("*TAGGED-DOC-TITLE-CLOSE-TOKEN*", (SubLObject)document_annotation_widgets.$str118$__title_);
        document_annotation_widgets.$tagged_doc_text_name$ = SubLFiles.defconstant("*TAGGED-DOC-TEXT-NAME*", (SubLObject)document_annotation_widgets.$str119$text);
        document_annotation_widgets.$tagged_doc_text_token$ = SubLFiles.defconstant("*TAGGED-DOC-TEXT-TOKEN*", (SubLObject)document_annotation_widgets.$str120$_text_);
        document_annotation_widgets.$tagged_doc_text_close_token$ = SubLFiles.defconstant("*TAGGED-DOC-TEXT-CLOSE-TOKEN*", (SubLObject)document_annotation_widgets.$str121$__text_);
        document_annotation_widgets.$tagged_doc_keystring_name$ = SubLFiles.defconstant("*TAGGED-DOC-KEYSTRING-NAME*", (SubLObject)document_annotation_widgets.$str122$keystring);
        document_annotation_widgets.$tagged_doc_keystring_token$ = SubLFiles.defconstant("*TAGGED-DOC-KEYSTRING-TOKEN*", (SubLObject)document_annotation_widgets.$str123$_keystring_);
        document_annotation_widgets.$tagged_doc_confirmed_concepts_keystring_token$ = SubLFiles.defconstant("*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-TOKEN*", (SubLObject)document_annotation_widgets.$str124$_confirmed_concept_keystring_);
        document_annotation_widgets.$tagged_doc_confirmed_concepts_keystring_name$ = SubLFiles.defconstant("*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-NAME*", (SubLObject)document_annotation_widgets.$str124$_confirmed_concept_keystring_);
        document_annotation_widgets.$tagged_doc_original_filename_name$ = SubLFiles.defconstant("*TAGGED-DOC-ORIGINAL-FILENAME-NAME*", (SubLObject)document_annotation_widgets.$str125$original_filename);
        document_annotation_widgets.$tagged_doc_original_filename_token$ = SubLFiles.defconstant("*TAGGED-DOC-ORIGINAL-FILENAME-TOKEN*", (SubLObject)document_annotation_widgets.$str126$_original_filename_);
        document_annotation_widgets.$tagged_doc_url_name$ = SubLFiles.defconstant("*TAGGED-DOC-URL-NAME*", (SubLObject)document_annotation_widgets.$str127$url);
        document_annotation_widgets.$tagged_doc_url_token$ = SubLFiles.defconstant("*TAGGED-DOC-URL-TOKEN*", (SubLObject)document_annotation_widgets.$str128$_url_);
        document_annotation_widgets.$tagged_doc_url_close_token$ = SubLFiles.defconstant("*TAGGED-DOC-URL-CLOSE-TOKEN*", (SubLObject)document_annotation_widgets.$str129$__url_);
        document_annotation_widgets.$tagged_doc_parent_filename_name$ = SubLFiles.defconstant("*TAGGED-DOC-PARENT-FILENAME-NAME*", (SubLObject)document_annotation_widgets.$str130$parent_filename);
        document_annotation_widgets.$tagged_doc_parent_filename_token$ = SubLFiles.defconstant("*TAGGED-DOC-PARENT-FILENAME-TOKEN*", (SubLObject)document_annotation_widgets.$str131$_parent_filename_);
        document_annotation_widgets.$semantic_index_dir_name$ = SubLFiles.defparameter("*SEMANTIC-INDEX-DIR-NAME*", (SubLObject)document_annotation_widgets.$str132$sem);
        document_annotation_widgets.$text_index_dir_name$ = SubLFiles.defparameter("*TEXT-INDEX-DIR-NAME*", (SubLObject)document_annotation_widgets.$str119$text);
        document_annotation_widgets.$annotated_document_format$ = SubLFiles.defparameter("*ANNOTATED-DOCUMENT-FORMAT*", (SubLObject)document_annotation_widgets.$kw158$SIMPLE);
        document_annotation_widgets.$term_learner_keep_concepts_distinct$ = SubLFiles.defparameter("*TERM-LEARNER-KEEP-CONCEPTS-DISTINCT*", (SubLObject)document_annotation_widgets.T);
        document_annotation_widgets.$default_medical_tagging_lexicon$ = SubLFiles.defparameter("*DEFAULT-MEDICAL-TAGGING-LEXICON*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$doc_annotation_use_hl_ids$ = SubLFiles.defparameter("*DOC-ANNOTATION-USE-HL-IDS*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$doc_annotator_term_id_fbc_path$ = SubLFiles.defparameter("*DOC-ANNOTATOR-TERM-ID-FBC-PATH*", (SubLObject)document_annotation_widgets.$str199$data_doc_tagging_term_id_fht);
        document_annotation_widgets.$doc_annotator_id_term_fbc_path$ = SubLFiles.defparameter("*DOC-ANNOTATOR-ID-TERM-FBC-PATH*", (SubLObject)document_annotation_widgets.$str200$data_doc_tagging_id_term_fht);
        document_annotation_widgets.$doc_annotator_term_id_fbc$ = SubLFiles.defparameter("*DOC-ANNOTATOR-TERM-ID-FBC*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$doc_annotator_id_term_fbc$ = SubLFiles.defparameter("*DOC-ANNOTATOR-ID-TERM-FBC*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$document_annotation_term_id_caching_state$ = SubLFiles.deflexical("*DOCUMENT-ANNOTATION-TERM-ID-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$document_annotation_term_from_id_caching_state$ = SubLFiles.deflexical("*DOCUMENT-ANNOTATION-TERM-FROM-ID-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$ = SubLFiles.defparameter("*DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICONS*", dictionary.new_dictionary((SubLObject)document_annotation_widgets.EQUAL, (SubLObject)document_annotation_widgets.UNPROVIDED));
        document_annotation_widgets.$get_default_document_ingester_annotation_lexicon_caching_state$ = SubLFiles.deflexical("*GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$default_document_annotation_learning_lexicon$ = SubLFiles.defparameter("*DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$default_document_annotation_lexicon$ = SubLFiles.defparameter("*DEFAULT-DOCUMENT-ANNOTATION-LEXICON*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$get_default_document_annotation_lexicon_caching_state$ = SubLFiles.deflexical("*GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-CACHING-STATE*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$default_document_annotation_rule_disambiguator$ = SubLFiles.defparameter("*DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$remove_pictures_regexp$ = SubLFiles.defparameter("*REMOVE-PICTURES-REGEXP*", (SubLObject)document_annotation_widgets.$str292$_____a_z0_9A_Z_________);
        document_annotation_widgets.$remove_hyphens_regexp$ = SubLFiles.defparameter("*REMOVE-HYPHENS-REGEXP*", (SubLObject)document_annotation_widgets.$str293$__);
        document_annotation_widgets.$remove_underscores_regexp$ = SubLFiles.defparameter("*REMOVE-UNDERSCORES-REGEXP*", (SubLObject)document_annotation_widgets.$str294$__);
        document_annotation_widgets.$remove_equals_regexp$ = SubLFiles.defparameter("*REMOVE-EQUALS-REGEXP*", (SubLObject)document_annotation_widgets.$str295$__);
        document_annotation_widgets.$remove_dots_regexp$ = SubLFiles.defparameter("*REMOVE-DOTS-REGEXP*", (SubLObject)document_annotation_widgets.$str296$_____________);
        document_annotation_widgets.$remove_unicode_regexp$ = SubLFiles.defparameter("*REMOVE-UNICODE-REGEXP*", (SubLObject)document_annotation_widgets.$str297$__0_9a_fA_F___);
        document_annotation_widgets.$cached_regexps$ = SubLFiles.defparameter("*CACHED-REGEXPS*", (SubLObject)document_annotation_widgets.NIL);
        document_annotation_widgets.$document_interpretation_rules_by_mt$ = SubLFiles.deflexical("*DOCUMENT-INTERPRETATION-RULES-BY-MT*", maybeDefault((SubLObject)document_annotation_widgets.$sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_, document_annotation_widgets.$document_interpretation_rules_by_mt$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)document_annotation_widgets.EQUAL), (SubLObject)document_annotation_widgets.UNPROVIDED))));
        document_annotation_widgets.$document_interpretation_default_elmt$ = SubLFiles.defparameter("*DOCUMENT-INTERPRETATION-DEFAULT-ELMT*", document_annotation_widgets.$const328$PiracyReportInterpretationMt);
        document_annotation_widgets.$manual_document_annotation_instructions$ = SubLFiles.defparameter("*MANUAL-DOCUMENT-ANNOTATION-INSTRUCTIONS*", (SubLObject)document_annotation_widgets.$str378$For_each_string____concept_mappin);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    public static SubLObject setup_document_annotation_widgets_file() {
        document_annotation_widgets.$text_index_override$.setDynamicValue((SubLObject)document_annotation_widgets.$str2$_cyc_projects_ccf_document_search);
        document_annotation_widgets.$semantic_index_override$.setDynamicValue((SubLObject)document_annotation_widgets.$str3$_cyc_projects_ccf_document_search);
        document_annotation_widgets.$text_index_override$.setDynamicValue((SubLObject)document_annotation_widgets.$str4$_host_achernar_daves_ccf_lucene_t);
        document_annotation_widgets.$semantic_index_override$.setDynamicValue((SubLObject)document_annotation_widgets.$str5$_host_achernar_daves_ccf_lucene_s);
        document_annotation_widgets.$semantic_index_override$.setDynamicValue((SubLObject)document_annotation_widgets.$str6$_cyc_projects_ccf_document_search);
        document_annotation_widgets.$text_index_override$.setDynamicValue((SubLObject)document_annotation_widgets.$str7$_cyc_projects_ccf_document_search);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym33$TERM_LEARNER_OBJECT_FROM_ID);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym37$TERM_LEARNER_ID);
        memoization_state.note_memoized_function((SubLObject)document_annotation_widgets.$sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym58$GET_TREATED_CONDITION);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym66$GET_TREATMENTS_FOR_CONDITION);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym69$GET_AFFECTED_PARTS);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym72$GET_COOCCURRING_CONDITIONS);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym77$LEADERS_TO_GROUPS);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym82$CITIES_TO_COUNTRIES);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym95$COUNTRIES_TO_REGIONS);
        access_macros.register_external_symbol((SubLObject)document_annotation_widgets.$sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS);
        access_macros.register_external_symbol((SubLObject)document_annotation_widgets.$sym168$TAG_DOCUMENT_NODES_FOR_DISPLAY);
        access_macros.register_external_symbol((SubLObject)document_annotation_widgets.$sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS);
        access_macros.register_external_symbol((SubLObject)document_annotation_widgets.$sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING);
        access_macros.register_external_symbol((SubLObject)document_annotation_widgets.$sym208$GENERATE_TERM_EXPLANATION);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym226$DOCUMENT_ANNOTATION_TERM_ID);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON);
        memoization_state.note_globally_cached_function((SubLObject)document_annotation_widgets.$sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON);
        access_macros.register_external_symbol((SubLObject)document_annotation_widgets.$sym290$TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY);
        generic_testing.define_test_case_table_int((SubLObject)document_annotation_widgets.$sym317$REMOVE_PICTURES_REGEXP_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { document_annotation_widgets.$kw318$TEST, document_annotation_widgets.NIL, document_annotation_widgets.$kw319$OWNER, document_annotation_widgets.NIL, document_annotation_widgets.$kw320$CLASSES, document_annotation_widgets.NIL, document_annotation_widgets.$kw321$KB, document_annotation_widgets.$kw322$TINY, document_annotation_widgets.$kw323$WORKING_, document_annotation_widgets.T }), (SubLObject)document_annotation_widgets.$list324);
        generic_testing.define_test_case_table_int((SubLObject)document_annotation_widgets.$sym325$GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES, (SubLObject)ConsesLow.list(new SubLObject[] { document_annotation_widgets.$kw318$TEST, document_annotation_widgets.NIL, document_annotation_widgets.$kw319$OWNER, document_annotation_widgets.NIL, document_annotation_widgets.$kw320$CLASSES, document_annotation_widgets.NIL, document_annotation_widgets.$kw321$KB, document_annotation_widgets.$kw322$TINY, document_annotation_widgets.$kw323$WORKING_, document_annotation_widgets.T }), (SubLObject)document_annotation_widgets.$list326);
        subl_macro_promotions.declare_defglobal((SubLObject)document_annotation_widgets.$sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_);
        html_macros.note_cgi_handler_function((SubLObject)document_annotation_widgets.$sym376$CB_DOCUMENT_INTERPRETATION_SUGGESTIONS, (SubLObject)document_annotation_widgets.$kw377$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)document_annotation_widgets.$sym412$CB_ANNOTATE_TAGGED_CONCEPTS, (SubLObject)document_annotation_widgets.$kw377$HTML_HANDLER);
        return (SubLObject)document_annotation_widgets.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_document_annotation_widgets_file();
    }
    
    @Override
	public void initializeVariables() {
        init_document_annotation_widgets_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_document_annotation_widgets_file();
    }
    
    static {
        me = (SubLFile)new document_annotation_widgets();
        document_annotation_widgets.$text_index$ = null;
        document_annotation_widgets.$semantic_index$ = null;
        document_annotation_widgets.$text_index_override$ = null;
        document_annotation_widgets.$semantic_index_override$ = null;
        document_annotation_widgets.$trace_doc_search_interface$ = null;
        document_annotation_widgets.$doc_search_trace_log_file$ = null;
        document_annotation_widgets.$predicate_id_table$ = null;
        document_annotation_widgets.$predicate_template_table$ = null;
        document_annotation_widgets.$upwards_closure_justification_fbc$ = null;
        document_annotation_widgets.$upwards_closure_justification_fht_path$ = null;
        document_annotation_widgets.$doc_annotation_thcl_verboseP$ = null;
        document_annotation_widgets.$term_learner_object_from_id_caching_state$ = null;
        document_annotation_widgets.$term_learner_id_caching_state$ = null;
        document_annotation_widgets.$upwards_closure_query_mt$ = null;
        document_annotation_widgets.$get_upwards_closure_justifications_cached_caching_state$ = null;
        document_annotation_widgets.$caching_upwards_closure_justificationsP$ = null;
        document_annotation_widgets.$get_treated_condition_caching_state$ = null;
        document_annotation_widgets.$get_treatments_for_condition_caching_state$ = null;
        document_annotation_widgets.$get_affected_parts_caching_state$ = null;
        document_annotation_widgets.$get_cooccurring_conditions_caching_state$ = null;
        document_annotation_widgets.$leaders_to_groups_caching_state$ = null;
        document_annotation_widgets.$cities_to_countries_caching_state$ = null;
        document_annotation_widgets.$countries_to_regions_caching_state$ = null;
        document_annotation_widgets.$tagged_xml_doc_directory$ = null;
        document_annotation_widgets.$tagged_doc_title_name$ = null;
        document_annotation_widgets.$tagged_doc_title_token$ = null;
        document_annotation_widgets.$tagged_doc_title_close_token$ = null;
        document_annotation_widgets.$tagged_doc_text_name$ = null;
        document_annotation_widgets.$tagged_doc_text_token$ = null;
        document_annotation_widgets.$tagged_doc_text_close_token$ = null;
        document_annotation_widgets.$tagged_doc_keystring_name$ = null;
        document_annotation_widgets.$tagged_doc_keystring_token$ = null;
        document_annotation_widgets.$tagged_doc_confirmed_concepts_keystring_token$ = null;
        document_annotation_widgets.$tagged_doc_confirmed_concepts_keystring_name$ = null;
        document_annotation_widgets.$tagged_doc_original_filename_name$ = null;
        document_annotation_widgets.$tagged_doc_original_filename_token$ = null;
        document_annotation_widgets.$tagged_doc_url_name$ = null;
        document_annotation_widgets.$tagged_doc_url_token$ = null;
        document_annotation_widgets.$tagged_doc_url_close_token$ = null;
        document_annotation_widgets.$tagged_doc_parent_filename_name$ = null;
        document_annotation_widgets.$tagged_doc_parent_filename_token$ = null;
        document_annotation_widgets.$semantic_index_dir_name$ = null;
        document_annotation_widgets.$text_index_dir_name$ = null;
        document_annotation_widgets.$annotated_document_format$ = null;
        document_annotation_widgets.$term_learner_keep_concepts_distinct$ = null;
        document_annotation_widgets.$default_medical_tagging_lexicon$ = null;
        document_annotation_widgets.$doc_annotation_use_hl_ids$ = null;
        document_annotation_widgets.$doc_annotator_term_id_fbc_path$ = null;
        document_annotation_widgets.$doc_annotator_id_term_fbc_path$ = null;
        document_annotation_widgets.$doc_annotator_term_id_fbc$ = null;
        document_annotation_widgets.$doc_annotator_id_term_fbc$ = null;
        document_annotation_widgets.$document_annotation_term_id_caching_state$ = null;
        document_annotation_widgets.$document_annotation_term_from_id_caching_state$ = null;
        document_annotation_widgets.$default_document_ingester_annotation_learning_lexicons$ = null;
        document_annotation_widgets.$get_default_document_ingester_annotation_lexicon_caching_state$ = null;
        document_annotation_widgets.$default_document_annotation_learning_lexicon$ = null;
        document_annotation_widgets.$default_document_annotation_lexicon$ = null;
        document_annotation_widgets.$get_default_document_annotation_lexicon_caching_state$ = null;
        document_annotation_widgets.$default_document_annotation_rule_disambiguator$ = null;
        document_annotation_widgets.$remove_pictures_regexp$ = null;
        document_annotation_widgets.$remove_hyphens_regexp$ = null;
        document_annotation_widgets.$remove_underscores_regexp$ = null;
        document_annotation_widgets.$remove_equals_regexp$ = null;
        document_annotation_widgets.$remove_dots_regexp$ = null;
        document_annotation_widgets.$remove_unicode_regexp$ = null;
        document_annotation_widgets.$cached_regexps$ = null;
        document_annotation_widgets.$document_interpretation_rules_by_mt$ = null;
        document_annotation_widgets.$document_interpretation_default_elmt$ = null;
        document_annotation_widgets.$manual_document_annotation_instructions$ = null;
        $str0$_host_george_super_index_hezbolla = SubLObjectFactory.makeString("/host/george/super-index-hezbollah/text");
        $str1$_host_george_super_index_hezbolla = SubLObjectFactory.makeString("/host/george/super-index-hezbollah/sem");
        $str2$_cyc_projects_ccf_document_search = SubLObjectFactory.makeString("/cyc/projects/ccf/document-search/doc-corpus/currently-installed-at-ccf/super-index/text");
        $str3$_cyc_projects_ccf_document_search = SubLObjectFactory.makeString("/cyc/projects/ccf/document-search/doc-corpus/currently-installed-at-ccf/super-index/sem");
        $str4$_host_achernar_daves_ccf_lucene_t = SubLObjectFactory.makeString("/host/achernar/daves/ccf-lucene/text");
        $str5$_host_achernar_daves_ccf_lucene_s = SubLObjectFactory.makeString("/host/achernar/daves/ccf-lucene/sem-20070720");
        $str6$_cyc_projects_ccf_document_search = SubLObjectFactory.makeString("/cyc/projects/ccf/document-search/doc-corpus/20091021-133607/super-index/sem/");
        $str7$_cyc_projects_ccf_document_search = SubLObjectFactory.makeString("/cyc/projects/ccf/document-search/doc-corpus/20091021-133607/super-index/text/");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $sym9$OUT = SubLObjectFactory.makeUninternedSymbol("OUT");
        $sym10$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym11$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym12$_TRACE_DOC_SEARCH_INTERFACE_ = SubLObjectFactory.makeSymbol("*TRACE-DOC-SEARCH-INTERFACE*");
        $sym13$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym14$_TRACE_OUTPUT_ = SubLObjectFactory.makeSymbol("*TRACE-OUTPUT*");
        $str15$___A__entering__S__ = SubLObjectFactory.makeString("~&~A: entering ~S~%");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMESTAMP-WITH-MILLISECONDS"));
        $sym17$_DOC_SEARCH_TRACE_LOG_FILE_ = SubLObjectFactory.makeSymbol("*DOC-SEARCH-TRACE-LOG-FILE*");
        $sym18$WITH_PRIVATE_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DOC-SEARCH-TRACE-LOG-FILE*"), (SubLObject)SubLObjectFactory.makeKeyword("APPEND"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("writing to ~S"), (SubLObject)SubLObjectFactory.makeSymbol("*DOC-SEARCH-TRACE-LOG-FILE*"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeString("g")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeString("i")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)SubLObjectFactory.makeString("r")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLeaders")), (SubLObject)SubLObjectFactory.makeString("l")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardTreatmentTypeForConditionType")), (SubLObject)SubLObjectFactory.makeString("c")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ailmentTypeAfflictsPartType")), (SubLObject)SubLObjectFactory.makeString("a")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionsCommonlyCooccur")), (SubLObject)SubLObjectFactory.makeString("o")));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), (SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLeaders")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLeaders")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)SubLObjectFactory.makeKeyword("SPEC")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardTreatmentTypeForConditionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardTreatmentTypeForConditionType")), (SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ailmentTypeAfflictsPartType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ailmentTypeAfflictsPartType")), (SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionsCommonlyCooccur")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionsCommonlyCooccur")), (SubLObject)SubLObjectFactory.makeKeyword("SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("GENL")));
        $str23$data_doc_tagging_upwards_closure_ = SubLObjectFactory.makeString("data/doc-tagging/upwards-closure-justifications.fht");
        $kw24$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str25$_host_george_scratch_text_index = SubLObjectFactory.makeString("/host/george/scratch/text-index");
        $str26$_host_george_scratch_sem_index = SubLObjectFactory.makeString("/host/george/scratch/sem-index");
        $str27$_host_george_simple_tagged_index_ = SubLObjectFactory.makeString("/host/george/simple-tagged-index/textual");
        $str28$_host_george_simple_tagged_index_ = SubLObjectFactory.makeString("/host/george/simple-tagged-index/semantic");
        $str29$_host_george_disambiguated_index_ = SubLObjectFactory.makeString("/host/george/disambiguated-index/text");
        $str30$_host_george_disambiguated_index_ = SubLObjectFactory.makeString("/host/george/disambiguated-index/sem");
        $kw31$SPEC = SubLObjectFactory.makeKeyword("SPEC");
        $kw32$GENL = SubLObjectFactory.makeKeyword("GENL");
        $sym33$TERM_LEARNER_OBJECT_FROM_ID = SubLObjectFactory.makeSymbol("TERM-LEARNER-OBJECT-FROM-ID");
        $sym34$_TERM_LEARNER_OBJECT_FROM_ID_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TERM-LEARNER-OBJECT-FROM-ID-CACHING-STATE*");
        $int35$4096 = SubLObjectFactory.makeInteger(4096);
        $kw36$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym37$TERM_LEARNER_ID = SubLObjectFactory.makeSymbol("TERM-LEARNER-ID");
        $sym38$_TERM_LEARNER_ID_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TERM-LEARNER-ID-CACHING-STATE*");
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-CAEQueryMt")));
        $sym40$GET_UPWARDS_CLOSURE_JUSTIFICATIONS = SubLObjectFactory.makeSymbol("GET-UPWARDS-CLOSURE-JUSTIFICATIONS");
        $const41$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const42$standardTreatmentTypeForCondition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardTreatmentTypeForConditionType"));
        $const43$ailmentTypeAfflictsPartType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ailmentTypeAfflictsPartType"));
        $const44$conditionsCommonlyCooccur = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionsCommonlyCooccur"));
        $const45$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const46$inRegion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion"));
        $const47$hasLeaders = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLeaders"));
        $sym48$GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED = SubLObjectFactory.makeSymbol("GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED");
        $kw49$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym50$_GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-CACHING-STATE*");
        $str51$_cyc_top_data_doc_tagging_upwards = SubLObjectFactory.makeString("/cyc/top/data/doc-tagging/upwards-closure-justifications.fht");
        $kw52$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $str53$Caching_upwards_closure_justifica = SubLObjectFactory.makeString("Caching upwards-closure justifications");
        $const54$MedicalDevice = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalDevice"));
        $const55$MedicalTreatmentEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalTreatmentEvent"));
        $const56$AilmentCondition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AilmentCondition"));
        $const57$IntelligentAgent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligentAgent"));
        $sym58$GET_TREATED_CONDITION = SubLObjectFactory.makeSymbol("GET-TREATED-CONDITION");
        $sym59$_X = SubLObjectFactory.makeSymbol("?X");
        $const60$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const61$deviceTypeTreatsConditionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deviceTypeTreatsConditionType"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $sym64$_GET_TREATED_CONDITION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-TREATED-CONDITION-CACHING-STATE*");
        $sym65$CLEAR_GET_TREATED_CONDITION = SubLObjectFactory.makeSymbol("CLEAR-GET-TREATED-CONDITION");
        $sym66$GET_TREATMENTS_FOR_CONDITION = SubLObjectFactory.makeSymbol("GET-TREATMENTS-FOR-CONDITION");
        $sym67$_GET_TREATMENTS_FOR_CONDITION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-TREATMENTS-FOR-CONDITION-CACHING-STATE*");
        $sym68$CLEAR_GET_TREATMENTS_FOR_CONDITION = SubLObjectFactory.makeSymbol("CLEAR-GET-TREATMENTS-FOR-CONDITION");
        $sym69$GET_AFFECTED_PARTS = SubLObjectFactory.makeSymbol("GET-AFFECTED-PARTS");
        $sym70$_GET_AFFECTED_PARTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-AFFECTED-PARTS-CACHING-STATE*");
        $sym71$CLEAR_GET_AFFECTED_PARTS = SubLObjectFactory.makeSymbol("CLEAR-GET-AFFECTED-PARTS");
        $sym72$GET_COOCCURRING_CONDITIONS = SubLObjectFactory.makeSymbol("GET-COOCCURRING-CONDITIONS");
        $sym73$_GET_COOCCURRING_CONDITIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-COOCCURRING-CONDITIONS-CACHING-STATE*");
        $sym74$CLEAR_GET_COOCCURRING_CONDITIONS = SubLObjectFactory.makeSymbol("CLEAR-GET-COOCCURRING-CONDITIONS");
        $sym75$_GROUP = SubLObjectFactory.makeSymbol("?GROUP");
        $const76$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym77$LEADERS_TO_GROUPS = SubLObjectFactory.makeSymbol("LEADERS-TO-GROUPS");
        $list78 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LEADER"), (SubLObject)SubLObjectFactory.makeSymbol("GROUP"));
        $list79 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?LEADER"), (SubLObject)SubLObjectFactory.makeSymbol("?GROUP"));
        $list80 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLeaders")), (SubLObject)SubLObjectFactory.makeSymbol("?GROUP"), (SubLObject)SubLObjectFactory.makeSymbol("?LEADER"));
        $sym81$_LEADERS_TO_GROUPS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*LEADERS-TO-GROUPS-CACHING-STATE*");
        $sym82$CITIES_TO_COUNTRIES = SubLObjectFactory.makeSymbol("CITIES-TO-COUNTRIES");
        $str83$Caching_countries_of_all_cities__ = SubLObjectFactory.makeString("Caching countries of all cities...");
        $list84 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?CITY"), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"));
        $list85 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), (SubLObject)SubLObjectFactory.makeSymbol("?CITY"));
        $list86 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CITY"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTRY"));
        $sym87$_CITIES_TO_COUNTRIES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CITIES-TO-COUNTRIES-CACHING-STATE*");
        $sym88$_COUNTRY = SubLObjectFactory.makeSymbol("?COUNTRY");
        $const89$countryOfCity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryOfCity"));
        $sym90$_REGION = SubLObjectFactory.makeSymbol("?REGION");
        $const91$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list92 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRYTYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountryTypeByGeneralRegion")));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COUNTRYTYPE"));
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regionOfCountryTypeByGeneralRegion")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRYTYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?REGION")));
        $sym95$COUNTRIES_TO_REGIONS = SubLObjectFactory.makeSymbol("COUNTRIES-TO-REGIONS");
        $list96 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COUNTRY"), (SubLObject)SubLObjectFactory.makeSymbol("REGION"));
        $list97 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), (SubLObject)SubLObjectFactory.makeSymbol("?REGION"));
        $list98 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRYTYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountryTypeByGeneralRegion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRY"), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRYTYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regionOfCountryTypeByGeneralRegion")), (SubLObject)SubLObjectFactory.makeSymbol("?COUNTRYTYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?REGION")));
        $sym99$_COUNTRIES_TO_REGIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*COUNTRIES-TO-REGIONS-CACHING-STATE*");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-SESSION"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-SESSION"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-INDEX-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("SEM-INDEX-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("OVERWRITE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym101$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym102$NEW_LUCENE_SESSION = SubLObjectFactory.makeSymbol("NEW-LUCENE-SESSION");
        $kw103$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw104$CYC = SubLObjectFactory.makeKeyword("CYC");
        $sym105$LUCENE_OPTIMIZE = SubLObjectFactory.makeSymbol("LUCENE-OPTIMIZE");
        $sym106$LUCENE_FINALIZE = SubLObjectFactory.makeSymbol("LUCENE-FINALIZE");
        $str107$_indexed_docs_txt = SubLObjectFactory.makeString("/indexed-docs.txt");
        $sym108$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str109$Indexing_files = SubLObjectFactory.makeString("Indexing files");
        $str110$cdolist = SubLObjectFactory.makeString("cdolist");
        $str111$ = SubLObjectFactory.makeString("");
        $kw112$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str113$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str114$_A__ = SubLObjectFactory.makeString("~A~%");
        $str115$_host_george_scratch_tagged_xml_d = SubLObjectFactory.makeString("/host/george/scratch/tagged-xml-docs/");
        $str116$title = SubLObjectFactory.makeString("title");
        $str117$_title_ = SubLObjectFactory.makeString("<title>");
        $str118$__title_ = SubLObjectFactory.makeString("</title>");
        $str119$text = SubLObjectFactory.makeString("text");
        $str120$_text_ = SubLObjectFactory.makeString("<text>");
        $str121$__text_ = SubLObjectFactory.makeString("</text>");
        $str122$keystring = SubLObjectFactory.makeString("keystring");
        $str123$_keystring_ = SubLObjectFactory.makeString("<keystring>");
        $str124$_confirmed_concept_keystring_ = SubLObjectFactory.makeString("<confirmed_concept_keystring>");
        $str125$original_filename = SubLObjectFactory.makeString("original_filename");
        $str126$_original_filename_ = SubLObjectFactory.makeString("<original_filename>");
        $str127$url = SubLObjectFactory.makeString("url");
        $str128$_url_ = SubLObjectFactory.makeString("<url>");
        $str129$__url_ = SubLObjectFactory.makeString("</url>");
        $str130$parent_filename = SubLObjectFactory.makeString("parent_filename");
        $str131$_parent_filename_ = SubLObjectFactory.makeString("<parent_filename>");
        $str132$sem = SubLObjectFactory.makeString("sem");
        $str133$_host_george_scratch_tagged_docs_ = SubLObjectFactory.makeString("/host/george/scratch/tagged-docs/");
        $str134$Tagging_files = SubLObjectFactory.makeString("Tagging files");
        $kw135$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw136$NEW = SubLObjectFactory.makeKeyword("NEW");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORG-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-FPATH"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("THE-URL"), (SubLObject)SubLObjectFactory.makeSymbol("THE-PARENT"));
        $str138$_S_tagging__S__ = SubLObjectFactory.makeString("~S tagging ~S~%");
        $str139$_txt = SubLObjectFactory.makeString(".txt");
        $str140$_cyc_idx = SubLObjectFactory.makeString(".cyc-idx");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("DOC-TEXT"));
        $str142$_ = SubLObjectFactory.makeString("#");
        $str143$_ = SubLObjectFactory.makeString("^");
        $kw144$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str145$Doc = SubLObjectFactory.makeString("Doc");
        $str146$There_is_no_text_in_the_body_of_t = SubLObjectFactory.makeString("There is no text in the body of this doc.  Please remove it from the corpus.~%");
        $str147$Couldn_t_find_source_file__S__Mov = SubLObjectFactory.makeString("Couldn't find source file ~S. Moving on to next file.");
        $kw148$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $sym149$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IDX-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("TXT-FILE"));
        $sym151$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str152$problem_indexing__a_____moving_on = SubLObjectFactory.makeString("problem indexing ~a  ...moving on to next file: ~A");
        $str153$http___doc_cyc_com_ = SubLObjectFactory.makeString("http://doc.cyc.com/");
        $str154$_cyc_ = SubLObjectFactory.makeString("/cyc/");
        $str155$title___S__ = SubLObjectFactory.makeString("title: ~S~%");
        $str156$url___S__ = SubLObjectFactory.makeString("url: ~S~%");
        $sym157$LUCENE_ADD_DOCUMENT = SubLObjectFactory.makeSymbol("LUCENE-ADD-DOCUMENT");
        $kw158$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $str159$_ = SubLObjectFactory.makeString(" ");
        $sym160$POS_TAGGING_CONCEPT_TAGGER = SubLObjectFactory.makeSymbol("POS-TAGGING-CONCEPT-TAGGER");
        $sym161$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw162$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $kw163$SENSE_TAGGER = SubLObjectFactory.makeKeyword("SENSE-TAGGER");
        $sym164$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym165$FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS = SubLObjectFactory.makeSymbol("FIND-CONCEPTS-FOR-DOCUMENT-SEGMENTS");
        $str166$Mww = SubLObjectFactory.makeString("Mww");
        $str167$writing_to__S = SubLObjectFactory.makeString("writing to ~S");
        $sym168$TAG_DOCUMENT_NODES_FOR_DISPLAY = SubLObjectFactory.makeSymbol("TAG-DOCUMENT-NODES-FOR-DISPLAY");
        $str169$full = SubLObjectFactory.makeString("full");
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $str171$_ua0_ = SubLObjectFactory.makeString("&ua0;");
        $sym172$_ = SubLObjectFactory.makeSymbol("<");
        $sym173$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym174$CANONICALIZE_TERM = SubLObjectFactory.makeSymbol("CANONICALIZE-TERM");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"));
        $const176$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $list177 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")));
        $sym178$FIND_INTERPS_FOR_DOCUMENT_SEGMENTS = SubLObjectFactory.makeSymbol("FIND-INTERPS-FOR-DOCUMENT-SEGMENTS");
        $str179$dogs_have_four_feet = SubLObjectFactory.makeString("dogs have four feet");
        $list180 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalParts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Foot-AnimalBodyPart")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dog")), (SubLObject)document_annotation_widgets.FOUR_INTEGER);
        $sym181$EXCLUDE_POS = SubLObjectFactory.makeSymbol("EXCLUDE-POS");
        $const182$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const183$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $const184$Adverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $const185$Gerundive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Gerundive"));
        $sym186$ADD_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("ADD-CONCEPT-FILTER-SPEC");
        $list187 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFExplanationWorthyConceptFilter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptOrInstance")));
        $str188$_tagged_html = SubLObjectFactory.makeString("-tagged.html");
        $str189$_span_property__cyc_termName__con = SubLObjectFactory.makeString("<span property='cyc:termName' content='");
        $str190$___span_class__cycTerm__id__cycTe = SubLObjectFactory.makeString("'><span class='cycTerm' id='cycTerm");
        $str191$__property__cyc_termId__content__ = SubLObjectFactory.makeString("' property='cyc:termId' content='");
        $str192$__ = SubLObjectFactory.makeString("'>");
        $str193$__span___span_ = SubLObjectFactory.makeString("</span></span>");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP-STRING-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("MAP-STRING-END-INDEX"));
        $str195$http___sw_cyc_com_concept_ = SubLObjectFactory.makeString("http://sw.cyc.com/concept/");
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("script"), (SubLObject)SubLObjectFactory.makeString("style"), (SubLObject)SubLObjectFactory.makeString("iframe"), (SubLObject)SubLObjectFactory.makeString("select"), (SubLObject)SubLObjectFactory.makeString("noscript"), (SubLObject)SubLObjectFactory.makeString("pre"), (SubLObject)SubLObjectFactory.makeString("code"));
        $str197$s = SubLObjectFactory.makeString("s");
        $str198$t = SubLObjectFactory.makeString("t");
        $str199$data_doc_tagging_term_id_fht = SubLObjectFactory.makeString("data/doc-tagging/term-id.fht");
        $str200$data_doc_tagging_id_term_fht = SubLObjectFactory.makeString("data/doc-tagging/id-term.fht");
        $str201$Meaning__ = SubLObjectFactory.makeString("Meaning: ");
        $str202$_ = SubLObjectFactory.makeString("(");
        $str203$__ = SubLObjectFactory.makeString(", ");
        $str204$_ = SubLObjectFactory.makeString(")");
        $sym205$GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING = SubLObjectFactory.makeSymbol("GENERATE-RETRIEVAL-JUSTIFICATION-FROM-JUSTIFICATION-STRING");
        $str206$Text_Match__ = SubLObjectFactory.makeString("Text Match: ");
        $str207$Invalid_justification_string___S = SubLObjectFactory.makeString("Invalid justification string: ~S");
        $sym208$GENERATE_TERM_EXPLANATION = SubLObjectFactory.makeSymbol("GENERATE-TERM-EXPLANATION");
        $kw209$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const210$userDocComment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userDocComment"));
        $const211$CCF_CAE_QueryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-CAE-QueryMt"));
        $kw212$DEMERIT_CUTOFF = SubLObjectFactory.makeKeyword("DEMERIT-CUTOFF");
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PPH-AGREEMENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"))), (SubLObject)SubLObjectFactory.makeKeyword("PPH-GENERATION-COUNT"), (SubLObject)document_annotation_widgets.EIGHT_INTEGER);
        $str214$_b_Synonyms__b___ = SubLObjectFactory.makeString("<b>Synonyms</b>: ");
        $str215$_b_ = SubLObjectFactory.makeString("<b>");
        $str216$__b___ = SubLObjectFactory.makeString("</b>: ");
        $str217$_br_ = SubLObjectFactory.makeString("<br>");
        $str218$_div_style__background_color__whi = SubLObjectFactory.makeString("<div style=\"background-color: white; margin-left: 3em; margin-right: 3em\">");
        $str219$__div_ = SubLObjectFactory.makeString("</div>");
        $const220$SurgicalProcedure = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure"));
        $const221$Surgery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Surgery"));
        $sym222$_DOC = SubLObjectFactory.makeSymbol("?DOC");
        $const223$expertAtSkill = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expertAtSkill"));
        $const224$CCFPersonnelDataMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFPersonnelDataMt"));
        $str225$_b_Specialists____b_ = SubLObjectFactory.makeString("<b>Specialists: </b>");
        $sym226$DOCUMENT_ANNOTATION_TERM_ID = SubLObjectFactory.makeSymbol("DOCUMENT-ANNOTATION-TERM-ID");
        $sym227$_DOCUMENT_ANNOTATION_TERM_ID_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DOCUMENT-ANNOTATION-TERM-ID-CACHING-STATE*");
        $int228$25000 = SubLObjectFactory.makeInteger(25000);
        $sym229$DOCUMENT_ANNOTATION_TERM_FROM_ID = SubLObjectFactory.makeSymbol("DOCUMENT-ANNOTATION-TERM-FROM-ID");
        $sym230$_DOCUMENT_ANNOTATION_TERM_FROM_ID_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DOCUMENT-ANNOTATION-TERM-FROM-ID-CACHING-STATE*");
        $int231$5000 = SubLObjectFactory.makeInteger(5000);
        $const232$PredicateTaxonomy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicateTaxonomy"));
        $list233 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicateTaxonomy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")));
        $str234$vocabMarking = SubLObjectFactory.makeString("vocabMarking");
        $sym235$ADD_LEARNER = SubLObjectFactory.makeSymbol("ADD-LEARNER");
        $sym236$STANFORD_NER_LEARN = SubLObjectFactory.makeSymbol("STANFORD-NER-LEARN");
        $sym237$GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON = SubLObjectFactory.makeSymbol("GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON");
        $sym238$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $kw239$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym240$EXCLUDE_PREDICATE = SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE");
        $const241$countryCodeTrigraph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryCodeTrigraph"));
        $const242$countryCodeDigraph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryCodeDigraph"));
        $sym243$ALLOW_POS = SubLObjectFactory.makeSymbol("ALLOW-POS");
        $const244$ClosedClassWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $sym245$SCALAR_INTERVAL_LEARN = SubLObjectFactory.makeSymbol("SCALAR-INTERVAL-LEARN");
        $sym246$DATE_LEARN = SubLObjectFactory.makeSymbol("DATE-LEARN");
        $sym247$_GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-CACHING-STATE*");
        $sym248$GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON = SubLObjectFactory.makeSymbol("GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON");
        $sym249$_GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-CACHING-STATE*");
        $sym250$TERM_LEXICON = SubLObjectFactory.makeSymbol("TERM-LEXICON");
        $sym251$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
        $kw252$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $sym253$ALLOW_PREDICATE = SubLObjectFactory.makeSymbol("ALLOW-PREDICATE");
        $const254$preferredNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $const255$ksTermString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ksTermString"));
        $const256$alias = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("alias"));
        $const257$programStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("programStrings"));
        $const258$airportHasIATACode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("airportHasIATACode"));
        $const259$airportHasICAOCode = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("airportHasICAOCode"));
        $sym260$SET_BASE_MT = SubLObjectFactory.makeSymbol("SET-BASE-MT");
        $sym261$ALLOW_MT = SubLObjectFactory.makeSymbol("ALLOW-MT");
        $const262$TechnicalEnglishLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TechnicalEnglishLexicalMt"));
        $const263$MedicalLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt"));
        $str264$CCFLexicalMt = SubLObjectFactory.makeString("CCFLexicalMt");
        $const265$CCFLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFLexicalMt"));
        $list266 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept")));
        $kw267$NOTHING_DONE = SubLObjectFactory.makeKeyword("NOTHING-DONE");
        $str268$rebuilding_term_id_FHT = SubLObjectFactory.makeString("rebuilding term-id FHT");
        $kw269$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str270$Rebuilding_id__term_map = SubLObjectFactory.makeString("Rebuilding id->term map");
        $str271$Augmenting_term_id_FHT = SubLObjectFactory.makeString("Augmenting term-id FHT");
        $kw272$NO_ID = SubLObjectFactory.makeKeyword("NO-ID");
        $kw273$INTERP_ID = SubLObjectFactory.makeKeyword("INTERP-ID");
        $list274 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEARCH-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $kw275$DOC_TEXT = SubLObjectFactory.makeKeyword("DOC-TEXT");
        $kw276$SEARCH_TYPE = SubLObjectFactory.makeKeyword("SEARCH-TYPE");
        $sym277$LUCENE_DOUBLE_QUERY = SubLObjectFactory.makeSymbol("LUCENE-DOUBLE-QUERY");
        $str278$0_0_t___ = SubLObjectFactory.makeString("0#0#t\\\\^");
        $str279$0_0_s___ = SubLObjectFactory.makeString("0#0#s\\\\^");
        $sym280$TERMS_FOR_CYC_SEMANTIC_QUERY = SubLObjectFactory.makeSymbol("TERMS-FOR-CYC-SEMANTIC-QUERY");
        $kw281$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym282$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str283$_cyc_projects_doc_annotation_quer = SubLObjectFactory.makeString("/cyc/projects/doc-annotation/query-logs/log.txt");
        $str284$_A___S__ = SubLObjectFactory.makeString("~A: ~S~%");
        $sym285$STOPWORD_IN_SEM_QUERY_ = SubLObjectFactory.makeSymbol("STOPWORD-IN-SEM-QUERY?");
        $sym286$REMOVE_CDAR = SubLObjectFactory.makeSymbol("REMOVE-CDAR");
        $sym287$CADAR = SubLObjectFactory.makeSymbol("CADAR");
        $str288$0_0_s = SubLObjectFactory.makeString("0#0#s");
        $kw289$INTERP = SubLObjectFactory.makeKeyword("INTERP");
        $sym290$TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY = SubLObjectFactory.makeSymbol("TERMS-FOR-FOCUSED-CYC-SEMANTIC-QUERY");
        $list291 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("DETAILS"));
        $str292$_____a_z0_9A_Z_________ = SubLObjectFactory.makeString("[\\[][a-z0-9A-Z._:]*[\\]]");
        $str293$__ = SubLObjectFactory.makeString("--");
        $str294$__ = SubLObjectFactory.makeString("__");
        $str295$__ = SubLObjectFactory.makeString("==");
        $str296$_____________ = SubLObjectFactory.makeString("[.][.][.][.]+");
        $str297$__0_9a_fA_F___ = SubLObjectFactory.makeString("&[0-9a-fA-F]+;");
        $kw298$SNIPPET = SubLObjectFactory.makeKeyword("SNIPPET");
        $kw299$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $list300 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym301$SEEN_ = SubLObjectFactory.makeUninternedSymbol("SEEN?");
        $list302 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(1024), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)document_annotation_widgets.EQUAL)));
        $sym303$DO_LEXICON = SubLObjectFactory.makeSymbol("DO-LEXICON");
        $sym304$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym305$LEX = SubLObjectFactory.makeSymbol("LEX");
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $sym307$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list308 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")));
        $sym309$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym310$GETHASH_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("GETHASH-WITHOUT-VALUES");
        $sym311$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $list312 = ConsesLow.list((SubLObject)document_annotation_widgets.T);
        $str313$_A___A__ = SubLObjectFactory.makeString("~A. ~A~%");
        $str314$____A__ = SubLObjectFactory.makeString("   ~A: ");
        $str315$_A_ = SubLObjectFactory.makeString("~A ");
        $str316$__ = SubLObjectFactory.makeString("~%");
        $sym317$REMOVE_PICTURES_REGEXP_TEST = SubLObjectFactory.makeSymbol("REMOVE-PICTURES-REGEXP-TEST");
        $kw318$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw319$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw320$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw321$KB = SubLObjectFactory.makeKeyword("KB");
        $kw322$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw323$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list324 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("some text and [a_picture.png] followed by some other stuff")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[a_picture.png]"))));
        $sym325$GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES = SubLObjectFactory.makeSymbol("GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS-VALUES");
        $list326 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("this")), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString(" is ")), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("a ")), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("cat")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("this is a cat"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)document_annotation_widgets.EIGHT_INTEGER), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.THREE_INTEGER, (SubLObject)document_annotation_widgets.TEN_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeString("this")), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString(" is ")), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("a cat")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("this is a cat"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ZERO_INTEGER, (SubLObject)document_annotation_widgets.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.ONE_INTEGER, (SubLObject)document_annotation_widgets.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)document_annotation_widgets.TWO_INTEGER, (SubLObject)document_annotation_widgets.EIGHT_INTEGER)))));
        $sym327$_DOCUMENT_INTERPRETATION_RULES_BY_MT_ = SubLObjectFactory.makeSymbol("*DOCUMENT-INTERPRETATION-RULES-BY-MT*");
        $const328$PiracyReportInterpretationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PiracyReportInterpretationMt"));
        $list329 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-SET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym330$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym331$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str332$Dont_know_yet_how_to_unify_a_sent = SubLObjectFactory.makeString("Dont know yet how to unify a sentence with the sentence bag.");
        $str333$Dont_know_how_to_deal_with_test__ = SubLObjectFactory.makeString("Dont know how to deal with test ~A.");
        $kw334$ADD_CONCEPT = SubLObjectFactory.makeKeyword("ADD-CONCEPT");
        $kw335$ADD_SENTENCE = SubLObjectFactory.makeKeyword("ADD-SENTENCE");
        $const336$interpretationSuggestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interpretationSuggestion"));
        $kw337$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw338$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw339$ANTECEDENT = SubLObjectFactory.makeKeyword("ANTECEDENT");
        $kw340$CONSEQUENT = SubLObjectFactory.makeKeyword("CONSEQUENT");
        $kw341$PRECONDITIONS = SubLObjectFactory.makeKeyword("PRECONDITIONS");
        $kw342$SUGGESTIONS = SubLObjectFactory.makeKeyword("SUGGESTIONS");
        $const343$containsProposition_CW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("containsProposition-CW"));
        $const344$thingDescribed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thingDescribed"));
        $const345$The = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("The"));
        $str346$Invalid_THE_expression__A___ = SubLObjectFactory.makeString("Invalid THE expression ~A.~%");
        $str347$Dont_know_how_to_handle_precondit = SubLObjectFactory.makeString("Dont know how to handle precondition operator ~A in ~A.");
        $str348$If_it_is_the_case_that__ = SubLObjectFactory.makeString("If it is the case that: ");
        $str349$then_one_might_conclude_that__ = SubLObjectFactory.makeString("then one might conclude that: ");
        $str350$mt = SubLObjectFactory.makeString("mt");
        $str351$Document_Interpretation_Suggestio = SubLObjectFactory.makeString("Document Interpretation Suggestions");
        $str352$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str353$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw354$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw355$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw356$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str357$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str358$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str359$button = SubLObjectFactory.makeString("button");
        $str360$reload = SubLObjectFactory.makeString("reload");
        $str361$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str362$Enter_the_text_to_interpret_ = SubLObjectFactory.makeString("Enter the text to interpret.");
        $str363$post = SubLObjectFactory.makeString("post");
        $str364$cb_document_interpretation_sugges = SubLObjectFactory.makeString("cb-document-interpretation-suggestions");
        $str365$Submit = SubLObjectFactory.makeString("Submit");
        $str366$Clear = SubLObjectFactory.makeString("Clear");
        $int367$80 = SubLObjectFactory.makeInteger(80);
        $str368$Rule_Mt__ = SubLObjectFactory.makeString("Rule Mt: ");
        $int369$40 = SubLObjectFactory.makeInteger(40);
        $str370$Complete = SubLObjectFactory.makeString("Complete");
        $const371$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str372$Identified_Concepts = SubLObjectFactory.makeString("Identified Concepts");
        $str373$Suggested_Concepts = SubLObjectFactory.makeString("Suggested Concepts");
        $str374$Suggested_Sentences = SubLObjectFactory.makeString("Suggested Sentences");
        $str375$Applied_Rules = SubLObjectFactory.makeString("Applied Rules");
        $sym376$CB_DOCUMENT_INTERPRETATION_SUGGESTIONS = SubLObjectFactory.makeSymbol("CB-DOCUMENT-INTERPRETATION-SUGGESTIONS");
        $kw377$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str378$For_each_string____concept_mappin = SubLObjectFactory.makeString("For each string -> concept mapping, rate the mapping. <ul><li>'Primary Meaning' means that, acontextually, this is what one would think of when seeing the string.  Most words will only have one primary meaning.\n<li>'Contextually Dependent' means that this is a reasonable mapping, but would not be the primary mapping.  It would really only be used when there is something else in the context to license the meaning.\n<li>'Rare' means that, while the string could mean this, it's fairly hard to imagine contexts in which it would mean this, and we could effectively treat this as not being mapped.\n<li>'Indecipherable' means that this concept is not something that a user is ever likely to be able to understand, and should suppress the entire concept when interacting with end users.\n<li>'Merge away' should be used when the concept itself should not exist.   For example, when we have both  #$EducationalOrganization-Rutgers-University and #$RutgersUniversity, one of them should be merged away, and the other should be the primary meaning.\n<li>'Invalid' means that the mapping between the string and the concept is faulty, and should likely be eliminated.</ul>");
        $str379$previous_input_file = SubLObjectFactory.makeString("previous-input-file");
        $str380$input_file = SubLObjectFactory.makeString("input-file");
        $str381$next_index = SubLObjectFactory.makeString("next-index");
        $str382$0 = SubLObjectFactory.makeString("0");
        $int383$30 = SubLObjectFactory.makeInteger(30);
        $str384$Manual_Concept_Annotation = SubLObjectFactory.makeString("Manual Concept Annotation");
        $str385$cb_annotate_tagged_concepts = SubLObjectFactory.makeString("cb-annotate-tagged-concepts");
        $str386$Tagging_File_Name__ = SubLObjectFactory.makeString("Tagging File Name: ");
        $str387$tr__border_color__black__________ = SubLObjectFactory.makeString("tr {border-color: black}\n                                .first {border-top-width: 10}\n                                .first td {border-top-width: 5; border-top-color: gray}");
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS-AND-CONCEPTS"));
        $str389$first = SubLObjectFactory.makeString("first");
        $str390$other = SubLObjectFactory.makeString("other");
        $str391$_S = SubLObjectFactory.makeString("~S");
        $str392$frequency___S__ = SubLObjectFactory.makeString("frequency: ~S~%");
        $str393$30_ = SubLObjectFactory.makeString("30%");
        $str394$_CCFFCC = SubLObjectFactory.makeString("#CCFFCC");
        $str395$primary = SubLObjectFactory.makeString("primary");
        $str396$Primary_Meaning___ = SubLObjectFactory.makeString("Primary Meaning   ");
        $str397$_CCFFFF = SubLObjectFactory.makeString("#CCFFFF");
        $str398$contextual = SubLObjectFactory.makeString("contextual");
        $str399$Contextually_Dependent___ = SubLObjectFactory.makeString("Contextually Dependent   ");
        $str400$_FFCCFF = SubLObjectFactory.makeString("#FFCCFF");
        $str401$very_rare = SubLObjectFactory.makeString("very-rare");
        $str402$Rare___ = SubLObjectFactory.makeString("Rare   ");
        $str403$_FFCCCC = SubLObjectFactory.makeString("#FFCCCC");
        $str404$indecipherable = SubLObjectFactory.makeString("indecipherable");
        $str405$Indecipherable__ = SubLObjectFactory.makeString("Indecipherable  ");
        $str406$_FFFFCC = SubLObjectFactory.makeString("#FFFFCC");
        $str407$merge_candidate = SubLObjectFactory.makeString("merge-candidate");
        $str408$Merge_away = SubLObjectFactory.makeString("Merge away");
        $str409$_CCCCFF = SubLObjectFactory.makeString("#CCCCFF");
        $str410$kill_candidate = SubLObjectFactory.makeString("kill-candidate");
        $str411$Invalid = SubLObjectFactory.makeString("Invalid");
        $sym412$CB_ANNOTATE_TAGGED_CONCEPTS = SubLObjectFactory.makeSymbol("CB-ANNOTATE-TAGGED-CONCEPTS");
        $str413$_out = SubLObjectFactory.makeString(".out");
        $str414$_A__A__A__ = SubLObjectFactory.makeString("~A ~A ~A~%");
        $kw415$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str416$_ = SubLObjectFactory.makeString(".");
        $str417$_cyc_projects_sabre_data_july_200 = SubLObjectFactory.makeString("/cyc/projects/sabre/data/july-2007-questions-answers-profiles-activities/combined-sabre-local-for-manual-annotation.txt.out");
        $list418 = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $str419$_ = SubLObjectFactory.makeString("\"");
        $list420 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("JUDGMENT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE"));
        $str421$_cyc_projects_sabre_data_july_200 = SubLObjectFactory.makeString("/cyc/projects/sabre/data/july-2007-questions-answers-profiles-activities/combined-sabre-local-for-manual-annotation.txt");
        $list422 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("JUDGMENT"));
        $list423 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERMED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("INTERMED-JUDGMENT"));
        $list424 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("JUDGMENT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $str425$f_____strengthOfLexicalMapping_ = SubLObjectFactory.makeString("f: (#$strengthOfLexicalMapping ");
        $str426$___PrimaryLexicalMapping__ = SubLObjectFactory.makeString(" #$PrimaryLexicalMapping).");
        $str427$___VanishinglyRareLexicalMapping_ = SubLObjectFactory.makeString(" #$VanishinglyRareLexicalMapping).");
        $str428$___ContextuallyDependentLexicalMa = SubLObjectFactory.makeString(" #$ContextuallyDependentLexicalMapping).");
        $str429$kill__ = SubLObjectFactory.makeString("kill: ");
        $list430 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)SubLObjectFactory.makeSymbol("FILEDIR"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-STAMP"));
        $str431$input_file_line___S__ = SubLObjectFactory.makeString("input-file-line: ~S~%");
        $list432 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TaxonomyOfEasilyUnderstandableConcepts")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConcept"))));
        $str433$__S__S__S___ = SubLObjectFactory.makeString("(~S ~S ~S)~%");
    }
    
    public static final class $clear_get_treated_condition$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_get_treated_condition$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-GET-TREATED-CONDITION"));
        }
        
        @Override
		public SubLObject processItem() {
            return document_annotation_widgets.clear_get_treated_condition();
        }
    }
    
    public static final class $clear_get_treatments_for_condition$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_get_treatments_for_condition$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-GET-TREATMENTS-FOR-CONDITION"));
        }
        
        @Override
		public SubLObject processItem() {
            return document_annotation_widgets.clear_get_treatments_for_condition();
        }
    }
    
    public static final class $clear_get_affected_parts$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_get_affected_parts$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-GET-AFFECTED-PARTS"));
        }
        
        @Override
		public SubLObject processItem() {
            return document_annotation_widgets.clear_get_affected_parts();
        }
    }
    
    public static final class $clear_get_cooccurring_conditions$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_get_cooccurring_conditions$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-GET-COOCCURRING-CONDITIONS"));
        }
        
        @Override
		public SubLObject processItem() {
            return document_annotation_widgets.clear_get_cooccurring_conditions();
        }
    }
}

/*

	Total time: 3665 ms
	
*/