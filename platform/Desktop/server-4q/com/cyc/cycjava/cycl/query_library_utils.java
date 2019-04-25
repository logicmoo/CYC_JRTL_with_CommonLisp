package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class query_library_utils
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.query_library_utils";
  public static final String myFingerPrint = "39de3abddae5b135ce7f10486c60a89629e2c7ca811fcaf233a7b0d741a79225";
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 852L)
  private static SubLSymbol $registered_ql_parsers$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 965L)
  public static SubLSymbol $ql_default_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 1063L)
  public static SubLSymbol $ql_default_parsed_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 1195L)
  private static SubLSymbol $ql_default_parsers$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 15889L)
  private static SubLSymbol $new_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 17467L)
  private static SubLSymbol $template_parse_complexity_weight_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
  private static SubLSymbol $cae_fact_editor_focal_types_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
  private static SubLSymbol $get_default_wff_checking_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
  private static SubLSymbol $get_default_cae_guidance_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
  private static SubLSymbol $query_library_default_query_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
  private static SubLSymbol $query_library_query_search_fact_sheet_links_enabledP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
  private static SubLSymbol $rtv_panel_enabled_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
  private static SubLSymbol $document_search_panel_enabled_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
  private static SubLSymbol $source_information_enabled_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
  private static SubLSymbol $irrelevant_results_allowed_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
  private static SubLSymbol $report_generation_enabled_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
  private static SubLSymbol $report_generation_template_root_collection_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
  private static SubLSymbol $task_allows_not_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
  private static SubLSymbol $task_allows_implies_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
  private static SubLSymbol $task_allows_and_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
  private static SubLSymbol $task_allows_or_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
  private static SubLSymbol $task_allows_unknown_sentence_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
  private static SubLSymbol $sparql_browser_urls_for_task_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
  private static SubLSymbol $query_library_root_folder_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
  private static SubLSymbol $query_library_should_suggestions_be_intersected_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
  private static SubLSymbol $query_library_default_transformation_depth_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
  private static SubLSymbol $query_library_default_compute_answer_justifications_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
  private static SubLSymbol $query_library_default_max_time_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
  private static SubLSymbol $query_library_default_max_productivity_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
  private static SubLSymbol $query_library_default_new_terms_allowed_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
  private static SubLSymbol $allow_arbitrary_assertion_deletion_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
  private static SubLSymbol $query_library_default_indeterminate_terms_allowed_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
  private static SubLSymbol $query_library_default_disjunction_free_el_vars_policy_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
  private static SubLSymbol $cae_query_search_filter_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
  private static SubLSymbol $cae_query_search_filter_specification_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
  private static SubLSymbol $cae_query_search_filter_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
  private static SubLSymbol $cae_query_search_term_classification_tree_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
  private static SubLSymbol $cae_query_search_term_classification_tree_collections_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
  private static SubLSymbol $cae_default_paraphrase_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
  private static SubLSymbol $cae_default_parsing_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
  private static SubLSymbol $cae_default_nl_domain_mt_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
  private static SubLSymbol $cae_topic_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 36815L)
  private static SubLSymbol $original_query_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38195L)
  private static SubLSymbol $latest_query_id$;
  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
  private static SubLSymbol $query_library_template_forward_rules_caching_state$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$_QL_DEFAULT_PARSERS_;
  private static final SubLString $str5$330D840A0F844359434C0A0F8445424D5;
  private static final SubLSymbol $kw6$PARAMETER;
  private static final SubLSymbol $sym7$LOG_QUERY_LIBRARY_SEARCH;
  private static final SubLString $str8$UserSearch_;
  private static final SubLObject $const9$isa;
  private static final SubLList $list10;
  private static final SubLObject $const11$searchStringsUsed;
  private static final SubLObject $const12$performedBy;
  private static final SubLObject $const13$dateOfEvent;
  private static final SubLList $list14;
  private static final SubLObject $const15$properSubEvents;
  private static final SubLObject $const16$WorkEventOnSpecificationFn;
  private static final SubLSymbol $sym17$UNINDEXED_QUERIES_FROM_STRING;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$QL_PARSE_CYCL;
  private static final SubLSymbol $kw20$INTERROGATIVE;
  private static final SubLSymbol $sym21$UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES;
  private static final SubLSymbol $kw22$XML;
  private static final SubLSymbol $kw23$WEIGHT;
  private static final SubLSymbol $kw24$2ND_WEIGHT;
  private static final SubLSymbol $kw25$OFFSET;
  private static final SubLSymbol $kw26$END;
  private static final SubLSymbol $kw27$JUSTIFICATION;
  private static final SubLSymbol $sym28$REGISTER_ALL_QUERY_LIBRARY_PARSERS;
  private static final SubLSymbol $kw29$CYCLIFY;
  private static final SubLSymbol $kw30$CYCLIFY_LINK;
  private static final SubLSymbol $kw31$RTP;
  private static final SubLSymbol $kw32$TEXT_ANSWERS;
  private static final SubLSymbol $kw33$TEXT_ANSWERS_LAST_RESORT;
  private static final SubLSymbol $kw34$EBMT;
  private static final SubLSymbol $sym35$REGISTER_DEFAULT_QL_PARSERS;
  private static final SubLSymbol $kw36$CYCL;
  private static final SubLSymbol $sym37$QL_PARSE_EQUAL_;
  private static final SubLSymbol $sym38$_;
  private static final SubLSymbol $sym39$QL_PARSE_WEIGHT;
  private static final SubLString $str40$and;
  private static final SubLString $str41$what;
  private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$OUTPUT;
  private static final SubLSymbol $kw45$VERBOSE;
  private static final SubLSymbol $kw46$SCORE_FUNCTION;
  private static final SubLSymbol $sym47$CYCLIFICATION_COVERAGE;
  private static final SubLSymbol $kw48$LEXICON;
  private static final SubLSymbol $kw49$PARSER;
  private static final SubLString $str50$caught_error__S_while_link_parsin;
  private static final SubLSymbol $sym51$CYCLIFIER_LEXICON_W_O_FABRICATION;
  private static final SubLSymbol $sym52$FORBID_MT;
  private static final SubLObject $const53$NameLexicalMt;
  private static final SubLObject $const54$InferencePSC;
  private static final SubLSymbol $kw55$WARN;
  private static final SubLList $list56;
  private static final SubLString $str57$what_new_vars_were_created_by_con;
  private static final SubLSymbol $sym58$INSTANCEFN_;
  private static final SubLSymbol $sym59$VAR_FROM_INSTANCEFN;
  private static final SubLObject $const60$InstanceFn;
  private static final SubLObject $const61$RKFParsingMt;
  private static final SubLObject $const62$playsActiveSubjectRole;
  private static final SubLSymbol $sym63$QL_PARSE_2ND_WEIGHT;
  private static final SubLFloat $float64$0_9;
  private static final SubLObject $const65$textAnswer;
  private static final SubLList $list66;
  private static final SubLObject $const67$NLRequestFn;
  private static final SubLSymbol $kw68$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw69$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw70$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw71$MAX_TIME;
  private static final SubLSymbol $kw72$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw73$PRODUCTIVITY_LIMIT;
  private static final SubLSymbol $kw74$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $sym75$GET_AUTO_UNIFICATION_MT;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$CAE_FACT_EDITOR_FOCAL_TYPES;
  private static final SubLObject $const79$CAEFactEditorFocalTypeQuery;
  private static final SubLSymbol $sym80$_TEMPLATE;
  private static final SubLSymbol $sym81$_CAE_FACT_EDITOR_FOCAL_TYPES_CACHING_STATE_;
  private static final SubLSymbol $sym82$GET_DEFAULT_WFF_CHECKING_MT;
  private static final SubLObject $const83$CAEWFFCheckingMtQuery;
  private static final SubLSymbol $sym84$_MT;
  private static final SubLObject $const85$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym86$_GET_DEFAULT_WFF_CHECKING_MT_CACHING_STATE_;
  private static final SubLSymbol $sym87$GET_DEFAULT_CAE_GUIDANCE_MT;
  private static final SubLObject $const88$CAEGuidanceMtQuery;
  private static final SubLSymbol $sym89$_GET_DEFAULT_CAE_GUIDANCE_MT_CACHING_STATE_;
  private static final SubLSymbol $sym90$CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT;
  private static final SubLList $list91;
  private static final SubLObject $const92$CycArchitectureMt;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT;
  private static final SubLObject $const95$CAEDefaultQueryMtQuery;
  private static final SubLSymbol $sym96$_QUERY_LIBRARY_DEFAULT_QUERY_MT_CACHING_STATE_;
  private static final SubLSymbol $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_;
  private static final SubLObject $const98$True;
  private static final SubLSymbol $sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA;
  private static final SubLObject $const100$CAEQuerySearchFactSheetLinksEnabl;
  private static final SubLSymbol $sym101$_VALUE;
  private static final SubLSymbol $sym102$RTV_PANEL_ENABLED_FOR_TASK;
  private static final SubLSymbol $sym103$_RTV_PANEL_ENABLED_FOR_TASK_CACHING_STATE_;
  private static final SubLObject $const104$CAERTVPanelEnabledQuery;
  private static final SubLSymbol $sym105$_TV;
  private static final SubLSymbol $sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK;
  private static final SubLSymbol $sym107$_DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK_CACHING_STATE_;
  private static final SubLObject $const108$CAETextSearchPanelEnabledQuery;
  private static final SubLSymbol $sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK;
  private static final SubLSymbol $sym110$_SOURCE_INFORMATION_ENABLED_FOR_TASK_CACHING_STATE_;
  private static final SubLObject $const111$CAESourceInformationEnabledQuery;
  private static final SubLSymbol $sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK;
  private static final SubLSymbol $sym113$_IRRELEVANT_RESULTS_ALLOWED_FOR_TASK_CACHING_STATE_;
  private static final SubLObject $const114$CAEIrrelevantTermAllowedQuery;
  private static final SubLObject $const115$False;
  private static final SubLSymbol $sym116$REPORT_GENERATION_ENABLED_FOR_TASK;
  private static final SubLSymbol $sym117$_REPORT_GENERATION_ENABLED_FOR_TASK_CACHING_STATE_;
  private static final SubLObject $const118$CAEReportGenerationEnabledQuery;
  private static final SubLSymbol $sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK;
  private static final SubLSymbol $sym120$_REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK_CACHING_STAT;
  private static final SubLObject $const121$CAEReportGenerationTemplateRootCo;
  private static final SubLObject $const122$ReportGenerationTemplate;
  private static final SubLSymbol $sym123$_COL;
  private static final SubLSymbol $sym124$TASK_ALLOWS_NOT;
  private static final SubLSymbol $sym125$_TASK_ALLOWS_NOT_CACHING_STATE_;
  private static final SubLObject $const126$CAEAllowsNotQuery;
  private static final SubLSymbol $sym127$TASK_ALLOWS_IMPLIES;
  private static final SubLSymbol $sym128$_TASK_ALLOWS_IMPLIES_CACHING_STATE_;
  private static final SubLObject $const129$CAEAllowsImpliesQuery;
  private static final SubLSymbol $sym130$TASK_ALLOWS_AND;
  private static final SubLSymbol $sym131$_TASK_ALLOWS_AND_CACHING_STATE_;
  private static final SubLObject $const132$CAEAllowsAndQuery;
  private static final SubLSymbol $sym133$TASK_ALLOWS_OR;
  private static final SubLSymbol $sym134$_TASK_ALLOWS_OR_CACHING_STATE_;
  private static final SubLObject $const135$CAEAllowsOrQuery;
  private static final SubLSymbol $sym136$TASK_ALLOWS_UNKNOWN_SENTENCE;
  private static final SubLSymbol $sym137$_TASK_ALLOWS_UNKNOWN_SENTENCE_CACHING_STATE_;
  private static final SubLObject $const138$CAEAllowsUnknownSentenceQuery;
  private static final SubLSymbol $sym139$SPARQL_BROWSER_URLS_FOR_TASK;
  private static final SubLSymbol $sym140$_SPARQL_BROWSER_URLS_FOR_TASK_CACHING_STATE_;
  private static final SubLObject $const141$CAESPARQLBrowserAddressQuery;
  private static final SubLSymbol $sym142$URL_STRING;
  private static final SubLSymbol $sym143$_URL;
  private static final SubLSymbol $sym144$QUERY_LIBRARY_ROOT_FOLDER;
  private static final SubLObject $const145$CAEQueryLibraryRootFolderQuery;
  private static final SubLSymbol $sym146$_QUERY_LIBRARY_ROOT_FOLDER_CACHING_STATE_;
  private static final SubLSymbol $sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED;
  private static final SubLObject $const148$CAEQueryLibraryShouldSuggestionsB;
  private static final SubLSymbol $sym149$_TRUTH;
  private static final SubLSymbol $sym150$_QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED_CACHING_STATE_;
  private static final SubLSymbol $sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH;
  private static final SubLObject $const152$CAEQueryLibraryDefaultTransformat;
  private static final SubLSymbol $sym153$_QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH_CACHING_STATE_;
  private static final SubLSymbol $sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS;
  private static final SubLObject $const155$CAEQueryLibraryDefaultComputeAnsw;
  private static final SubLSymbol $sym156$_QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS_CACHING_STAT;
  private static final SubLSymbol $sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME;
  private static final SubLObject $const158$CAEQueryLibraryDefaultMaxTimeQuer;
  private static final SubLSymbol $sym159$_QUERY_LIBRARY_DEFAULT_MAX_TIME_CACHING_STATE_;
  private static final SubLSymbol $sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY;
  private static final SubLObject $const161$CAEQueryLibraryDefaultMaxProducti;
  private static final SubLObject $const162$PlusInfinity;
  private static final SubLString $str163$Got_invalid_default__productivity;
  private static final SubLSymbol $sym164$_QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY_CACHING_STATE_;
  private static final SubLSymbol $sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED;
  private static final SubLSymbol $sym166$_QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED_CACHING_STATE_;
  private static final SubLObject $const167$CAEQueryLibraryDefaultNewTermsAll;
  private static final SubLSymbol $sym168$ALLOW_ARBITRARY_ASSERTION_DELETION;
  private static final SubLSymbol $sym169$_ALLOW_ARBITRARY_ASSERTION_DELETION_CACHING_STATE_;
  private static final SubLObject $const170$AppAllowsArbitraryAssertionDeleti;
  private static final SubLSymbol $sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED;
  private static final SubLSymbol $sym172$_QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED_CACHING_STATE_;
  private static final SubLObject $const173$CAEQueryLibraryDefaultIndetermina;
  private static final SubLSymbol $sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $sym175$_QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY_CACHING_ST;
  private static final SubLObject $const176$CAEQueryLibraryDefaultDisjunction;
  private static final SubLSymbol $sym177$CAE_QUERY_SEARCH_FILTER;
  private static final SubLObject $const178$CAEQuerySearchFilterQuery;
  private static final SubLSymbol $sym179$_CAE_QUERY_SEARCH_FILTER_CACHING_STATE_;
  private static final SubLSymbol $sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION;
  private static final SubLObject $const181$CAEQuerySearchFilterSpecification;
  private static final SubLSymbol $sym182$_CAE_QUERY_SEARCH_FILTER_SPECIFICATION_CACHING_STATE_;
  private static final SubLSymbol $sym183$CAE_QUERY_SEARCH_FILTER_STRING;
  private static final SubLSymbol $sym184$_TREE;
  private static final SubLObject $const185$and;
  private static final SubLObject $const186$conceptFilterDecisionTree;
  private static final SubLList $list187;
  private static final SubLList $list188;
  private static final SubLSymbol $sym189$_CAE_QUERY_SEARCH_FILTER_STRING_CACHING_STATE_;
  private static final SubLSymbol $sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE;
  private static final SubLSymbol $sym191$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_CACHING_STATE_;
  private static final SubLSymbol $sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS;
  private static final SubLSymbol $sym193$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS_CACHING_ST;
  private static final SubLSymbol $sym194$CAE_DEFAULT_PARAPHRASE_MT;
  private static final SubLObject $const195$CAEDefaultParaphraseMtQuery;
  private static final SubLObject $const196$EnglishParaphraseMt;
  private static final SubLSymbol $sym197$_CAE_DEFAULT_PARAPHRASE_MT_CACHING_STATE_;
  private static final SubLSymbol $sym198$CAE_DEFAULT_PARSING_MT;
  private static final SubLObject $const199$CAEDefaultParsingMtQuery;
  private static final SubLList $list200;
  private static final SubLSymbol $sym201$_CAE_DEFAULT_PARSING_MT_CACHING_STATE_;
  private static final SubLSymbol $sym202$CAE_DEFAULT_NL_DOMAIN_MT;
  private static final SubLObject $const203$CAEDefaultNLDomainMtQuery;
  private static final SubLSymbol $sym204$_CAE_DEFAULT_NL_DOMAIN_MT_CACHING_STATE_;
  private static final SubLSymbol $sym205$CAE_GET_NL_MTS_FROM_TASK;
  private static final SubLSymbol $sym206$CAE_GET_CAE_MTS_FROM_TASK;
  private static final SubLSymbol $sym207$CAE_TOPIC;
  private static final SubLSymbol $sym208$_TOPIC;
  private static final SubLList $list209;
  private static final SubLObject $const210$topicOfIndividual;
  private static final SubLList $list211;
  private static final SubLList $list212;
  private static final SubLSymbol $sym213$_CAE_TOPIC_CACHING_STATE_;
  private static final SubLSymbol $sym214$CAE_TASK_TOPIC_CHANGED;
  private static final SubLString $str215$failed_to_find_original_query_str;
  private static final SubLSymbol $sym216$NEW_QUERY_ID;
  private static final SubLObject $const217$QueryLibrary_QueryCreationTemplat;
  private static final SubLObject $const218$TemplateFromTestQueryFn;
  private static final SubLString $str219$UserQuery;
  private static final SubLList $list220;
  private static final SubLObject $const221$TestVocabularyMt;
  private static final SubLSymbol $sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES;
  private static final SubLSymbol $sym223$_QUERY_LIBRARY_TEMPLATE_FORWARD_RULES_CACHING_STATE_;
  private static final SubLSymbol $sym224$KILL_QUERY_TEMPLATE_AND_QUERY;
  private static final SubLObject $const225$TestQueryFn;
  private static final SubLSymbol $sym226$KILL_QUERY_LIBRARY;
  private static final SubLSymbol $sym227$EQUALS_EL_;
  private static final SubLSymbol $sym228$QL_PRED_STRENGTHEN_SENTENCE;
  private static final SubLSymbol $kw229$TEST;
  private static final SubLSymbol $kw230$OWNER;
  private static final SubLSymbol $kw231$CLASSES;
  private static final SubLSymbol $kw232$KB;
  private static final SubLSymbol $kw233$FULL;
  private static final SubLSymbol $kw234$WORKING_;
  private static final SubLList $list235;
  private static final SubLSymbol $sym236$TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY;
  private static final SubLSymbol $sym237$PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST;
  private static final SubLList $list238;
  private static final SubLSymbol $sym239$GET_CYCLS_FOR_UNINDEXED_STRING_TCT;
  private static final SubLList $list240;

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 1902L)
  public static SubLObject log_query_library_search(final SubLObject query_string, SubLObject user, SubLObject mt, SubLObject task)
  {
    if( user == UNPROVIDED )
    {
      user = api_control_vars.$the_cyclist$.getDynamicValue();
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( task == UNPROVIDED )
    {
      task = NIL;
    }
    final SubLObject search_constant = fi.fi_create_int( constants_high.suggest_constant_name( query_string, $str8$UserSearch_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    ke.ke_assert( ConsesLow.listS( $const9$isa, search_constant, $list10 ), mt, UNPROVIDED, UNPROVIDED );
    ke.ke_assert( ConsesLow.list( $const11$searchStringsUsed, search_constant, query_string ), mt, UNPROVIDED, UNPROVIDED );
    ke.ke_assert( ConsesLow.list( $const12$performedBy, search_constant, user ), mt, UNPROVIDED, UNPROVIDED );
    ke.ke_assert( ConsesLow.listS( $const13$dateOfEvent, search_constant, $list14 ), mt, UNPROVIDED, UNPROVIDED );
    if( NIL != task )
    {
      ke.ke_assert( ConsesLow.list( $const15$properSubEvents, ConsesLow.list( $const16$WorkEventOnSpecificationFn, task ), search_constant ), mt, UNPROVIDED, UNPROVIDED );
    }
    return search_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 2549L)
  public static SubLObject unindexed_queries_from_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ql_parses = get_cycls_for_unindexed_string( string );
    if( NIL == ql_parse_cycl( ql_parses.first() ) )
    {
      return NIL;
    }
    SubLObject generations = NIL;
    SubLObject new_queries = NIL;
    SubLObject cdolist_list_var = ql_parses;
    SubLObject ql_parse = NIL;
    ql_parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set_ql_parse_cycl( ql_parse, el_utilities.optimize_el_formula_variable_names( ql_parse_cycl( ql_parse ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      ql_parse = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_maximize_linksP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_maximize_linksP$.bind( NIL, thread );
      final SubLObject cycls = Mapping.mapcar( $sym19$QL_PARSE_CYCL, ql_parses );
      generations = pph_main.generate_disambiguation_phrases( cycls, $kw20$INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_maximize_linksP$.rebind( _prev_bind_0, thread );
    }
    SubLObject list_var = NIL;
    ql_parse = NIL;
    SubLObject number = NIL;
    list_var = ql_parses;
    ql_parse = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), ql_parse = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject cycl = ql_parse_cycl( ql_parse );
      final SubLObject weight = ql_parse_weight( ql_parse );
      final SubLObject gloss = ConsesLow.nth( number, generations ).rest();
      final SubLObject template_id = new_query_id();
      final SubLObject template = formula_templates.new_formula_template( template_id, UNPROVIDED );
      final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
      formula_templates.formula_template_set_gloss( template, gloss );
      new_cycl_query_specification.set_new_cycl_query_specification_comment( query_spec, formula_templates.formula_template_gloss( template ) );
      new_cycl_query_specification.set_new_cycl_query_specification_formula( query_spec, cycl );
      new_cycl_query_specification.set_new_cycl_query_specification_mt( query_spec, $ql_default_mt$.getDynamicValue( thread ) );
      new_cycl_query_specification.set_new_cycl_query_specification_properties( query_spec, inference_datastructures_enumerated_types.merge_query_properties( new_cycl_query_specification
          .new_cycl_query_specification_properties( query_spec ), query_library_api.guess_inference_parameters_for_query( query_spec, $ql_default_mt$.getDynamicValue( thread ) ) ) );
      new_cycl_query_specification.set_new_cycl_query_specification_cycl_id( query_spec, template_id );
      formula_templates.formula_template_set_elmt( template, $ql_default_mt$.getDynamicValue( thread ) );
      formula_templates.formula_template_set_query_specification( template, query_spec );
      store_original_string_for_template_id( template_id, string );
      SubLObject xml_string = NIL;
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( stream, thread );
          formula_templates.xml_serialize_formula_template_as_document( template, UNPROVIDED );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
        }
        xml_string = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      new_queries = ConsesLow.cons( xml_string, new_queries );
    }
    return new_queries;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 4647L)
  public static SubLObject unindexed_queries_from_string_with_confidences(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ql_parses = get_cycls_for_unindexed_string( string );
    final SubLObject cycls = Mapping.mapcar( $sym19$QL_PARSE_CYCL, ql_parses );
    if( NIL == cycls.first() )
    {
      return NIL;
    }
    SubLObject generations = NIL;
    SubLObject new_queries_with_confidences = NIL;
    SubLObject cdolist_list_var = ql_parses;
    SubLObject ql_parse = NIL;
    ql_parse = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set_ql_parse_cycl( ql_parse, el_utilities.optimize_el_formula_variable_names( ql_parse_cycl( ql_parse ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      ql_parse = cdolist_list_var.first();
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_maximize_linksP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_maximize_linksP$.bind( NIL, thread );
      final SubLObject cycls_$1 = Mapping.mapcar( $sym19$QL_PARSE_CYCL, ql_parses );
      generations = pph_main.generate_disambiguation_phrases( cycls_$1, $kw20$INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_maximize_linksP$.rebind( _prev_bind_0, thread );
    }
    SubLObject list_var = NIL;
    ql_parse = NIL;
    SubLObject number = NIL;
    list_var = ql_parses;
    ql_parse = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), ql_parse = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject cycl = ql_parse_cycl( ql_parse );
      final SubLObject weight = ql_parse_weight( ql_parse );
      final SubLObject v_2nd_weight = ql_parse_2nd_weight( ql_parse );
      final SubLObject gloss = ConsesLow.nth( number, generations ).rest();
      final SubLObject formula_wXrenamed_vars = el_utilities.optimize_el_formula_variable_names( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject template_id = new_query_id();
      final SubLObject template = formula_templates.new_formula_template( template_id, UNPROVIDED );
      final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
      final SubLObject offset = ZERO_INTEGER;
      final SubLObject end = NIL;
      formula_templates.formula_template_set_gloss( template, gloss );
      new_cycl_query_specification.set_new_cycl_query_specification_comment( query_spec, formula_templates.formula_template_gloss( template ) );
      new_cycl_query_specification.set_new_cycl_query_specification_formula( query_spec, formula_wXrenamed_vars );
      new_cycl_query_specification.set_new_cycl_query_specification_mt( query_spec, $ql_default_mt$.getDynamicValue( thread ) );
      new_cycl_query_specification.set_new_cycl_query_specification_properties( query_spec, inference_datastructures_enumerated_types.merge_query_properties( new_cycl_query_specification
          .new_cycl_query_specification_properties( query_spec ), query_library_api.guess_inference_parameters_for_query( query_spec, $ql_default_mt$.getDynamicValue( thread ) ) ) );
      new_cycl_query_specification.set_new_cycl_query_specification_cycl_id( query_spec, template_id );
      formula_templates.formula_template_set_elmt( template, $ql_default_mt$.getDynamicValue( thread ) );
      formula_templates.formula_template_set_query_specification( template, query_spec );
      store_original_string_for_template_id( template_id, string );
      SubLObject xml_string = NIL;
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding( thread );
        try
        {
          xml_vars.$xml_stream$.bind( stream, thread );
          formula_templates.xml_serialize_formula_template_as_document( template, UNPROVIDED );
        }
        finally
        {
          xml_vars.$xml_stream$.rebind( _prev_bind_2, thread );
        }
        xml_string = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      final SubLObject xml_string_with_confidence = new_weighted_xml( xml_string, weight, v_2nd_weight, offset, end, UNPROVIDED );
      new_queries_with_confidences = ConsesLow.cons( xml_string_with_confidence, new_queries_with_confidences );
    }
    return new_queries_with_confidences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 7061L)
  public static SubLObject new_weighted_xml(final SubLObject xml, SubLObject weight, SubLObject v_2nd_weight, SubLObject offset, SubLObject end, SubLObject justification)
  {
    if( weight == UNPROVIDED )
    {
      weight = ZERO_INTEGER;
    }
    if( v_2nd_weight == UNPROVIDED )
    {
      v_2nd_weight = ZERO_INTEGER;
    }
    if( offset == UNPROVIDED )
    {
      offset = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( justification == UNPROVIDED )
    {
      justification = NIL;
    }
    SubLObject result = ConsesLow.list( $kw22$XML, xml );
    if( NIL != weight )
    {
      result = conses_high.putf( result, $kw23$WEIGHT, weight );
    }
    if( NIL != v_2nd_weight )
    {
      result = conses_high.putf( result, $kw24$2ND_WEIGHT, v_2nd_weight );
    }
    if( NIL != offset )
    {
      result = conses_high.putf( result, $kw25$OFFSET, offset );
    }
    if( NIL != end )
    {
      result = conses_high.putf( result, $kw26$END, end );
    }
    if( NIL != justification )
    {
      result = conses_high.putf( result, $kw27$JUSTIFICATION, justification );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 7595L)
  public static SubLObject register_all_query_library_parsers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    register_cyclify_parser();
    register_cyclify_link_parser();
    register_template_parser();
    register_text_answers_as_last_resort();
    register_ebmt();
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 7918L)
  public static SubLObject register_cyclify_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject item_var = $kw29$CYCLIFY;
    if( NIL == conses_high.member( item_var, $registered_ql_parsers$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $registered_ql_parsers$.setDynamicValue( ConsesLow.cons( item_var, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
    }
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8147L)
  public static SubLObject register_cyclify_link_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject item_var = $kw30$CYCLIFY_LINK;
    if( NIL == conses_high.member( item_var, $registered_ql_parsers$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $registered_ql_parsers$.setDynamicValue( ConsesLow.cons( item_var, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
    }
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8279L)
  public static SubLObject deregister_cyclify_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $registered_ql_parsers$.setDynamicValue( Sequences.delete( $kw29$CYCLIFY, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8436L)
  public static SubLObject register_template_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject item_var = $kw31$RTP;
    if( NIL == conses_high.member( item_var, $registered_ql_parsers$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $registered_ql_parsers$.setDynamicValue( ConsesLow.cons( item_var, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
    }
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8676L)
  public static SubLObject deregister_template_parser()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $registered_ql_parsers$.setDynamicValue( Sequences.delete( $kw31$RTP, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8830L)
  public static SubLObject register_text_answers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Sequences.find( $kw32$TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.find( $kw33$TEXT_ANSWERS_LAST_RESORT,
        $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      deregister_text_answers();
    }
    $registered_ql_parsers$.setDynamicValue( list_utilities.snoc( $kw32$TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 9255L)
  public static SubLObject register_text_answers_as_last_resort()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Sequences.find( $kw32$TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.find( $kw33$TEXT_ANSWERS_LAST_RESORT,
        $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      deregister_text_answers();
    }
    $registered_ql_parsers$.setDynamicValue( list_utilities.snoc( $kw33$TEXT_ANSWERS_LAST_RESORT, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 9707L)
  public static SubLObject deregister_text_answers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $registered_ql_parsers$.setDynamicValue( Sequences.delete( $kw32$TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    $registered_ql_parsers$.setDynamicValue( Sequences.delete( $kw33$TEXT_ANSWERS_LAST_RESORT, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 9961L)
  public static SubLObject register_ebmt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject item_var = $kw34$EBMT;
    if( NIL == conses_high.member( item_var, $registered_ql_parsers$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $registered_ql_parsers$.setDynamicValue( ConsesLow.cons( item_var, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
    }
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 10186L)
  public static SubLObject deregister_ebmt()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $registered_ql_parsers$.setDynamicValue( Sequences.delete( $kw34$EBMT, $registered_ql_parsers$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 10330L)
  public static SubLObject register_default_ql_parsers()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $registered_ql_parsers$.setDynamicValue( NIL, thread );
    SubLObject cdolist_list_var = cfasl.cfasl_decode( vector_utilities.hex_char_string_to_byte_vector( $ql_default_parsers$.getDynamicValue( thread ) ) );
    SubLObject v_parser = NIL;
    v_parser = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = v_parser;
      if( pcase_var.eql( $kw36$CYCL ) )
      {
        final SubLObject item_var = $kw36$CYCL;
        if( NIL == conses_high.member( item_var, $registered_ql_parsers$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          $registered_ql_parsers$.setDynamicValue( ConsesLow.cons( item_var, $registered_ql_parsers$.getDynamicValue( thread ) ), thread );
        }
      }
      else if( pcase_var.eql( $kw29$CYCLIFY ) )
      {
        register_cyclify_parser();
      }
      else if( pcase_var.eql( $kw30$CYCLIFY_LINK ) )
      {
        register_cyclify_link_parser();
      }
      else if( pcase_var.eql( $kw31$RTP ) )
      {
        register_template_parser();
      }
      else if( pcase_var.eql( $kw32$TEXT_ANSWERS ) )
      {
        register_text_answers();
      }
      else if( pcase_var.eql( $kw33$TEXT_ANSWERS_LAST_RESORT ) )
      {
        register_text_answers_as_last_resort();
      }
      else if( pcase_var.eql( $kw34$EBMT ) )
      {
        register_ebmt();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_parser = cdolist_list_var.first();
    }
    return $registered_ql_parsers$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 10972L)
  public static SubLObject new_ql_parse(SubLObject cycl, SubLObject weight, SubLObject v_2nd_weight)
  {
    if( cycl == UNPROVIDED )
    {
      cycl = NIL;
    }
    if( weight == UNPROVIDED )
    {
      weight = ZERO_INTEGER;
    }
    if( v_2nd_weight == UNPROVIDED )
    {
      v_2nd_weight = ZERO_INTEGER;
    }
    SubLObject parse = NIL;
    if( NIL != cycl )
    {
      parse = conses_high.putf( parse, $kw36$CYCL, cycl );
    }
    if( NIL != weight )
    {
      parse = conses_high.putf( parse, $kw23$WEIGHT, weight );
    }
    if( NIL != v_2nd_weight )
    {
      parse = conses_high.putf( parse, $kw24$2ND_WEIGHT, v_2nd_weight );
    }
    return parse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11373L)
  public static SubLObject set_ql_parse_cycl(final SubLObject ql_parse, final SubLObject cycl)
  {
    return conses_high.putf( ql_parse, $kw36$CYCL, cycl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11462L)
  public static SubLObject set_ql_parse_weight(final SubLObject ql_parse, final SubLObject weight)
  {
    return conses_high.putf( ql_parse, $kw23$WEIGHT, weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11559L)
  public static SubLObject set_ql_parse_2nd_weight(final SubLObject ql_parse, final SubLObject v_2nd_weight)
  {
    return conses_high.putf( ql_parse, $kw24$2ND_WEIGHT, v_2nd_weight );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11672L)
  public static SubLObject ql_parse_cycl(final SubLObject ql_parse)
  {
    return conses_high.getf( ql_parse, $kw36$CYCL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11747L)
  public static SubLObject ql_parse_weight(final SubLObject ql_parse)
  {
    return conses_high.getf( ql_parse, $kw23$WEIGHT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11826L)
  public static SubLObject ql_parse_2nd_weight(final SubLObject ql_parse)
  {
    return conses_high.getf( ql_parse, $kw24$2ND_WEIGHT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11914L)
  public static SubLObject ql_parse_equalP(final SubLObject ql_parse1, final SubLObject ql_parse2)
  {
    return czer_utilities.equals_elP( ql_parse_cycl( ql_parse1 ), ql_parse_cycl( ql_parse2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 12045L)
  public static SubLObject get_cycls_for_unindexed_string(final SubLObject raw_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string = preprocess_query_string( raw_string );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = $registered_ql_parsers$.getDynamicValue( thread );
    SubLObject v_parser = NIL;
    v_parser = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = v_parser;
      if( pcase_var.eql( $kw30$CYCLIFY_LINK ) )
      {
        result = ql_cyclify_link( string, result );
      }
      else if( pcase_var.eql( $kw29$CYCLIFY ) )
      {
        result = ql_cyclify( string, result );
      }
      else if( pcase_var.eql( $kw31$RTP ) )
      {
        result = ql_template_parse_query( string, result );
      }
      else if( pcase_var.eql( $kw36$CYCL ) )
      {
        result = ql_interpret_cycl( string, result );
      }
      else if( pcase_var.eql( $kw32$TEXT_ANSWERS ) )
      {
        result = ql_text_answer_query( string, result, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw33$TEXT_ANSWERS_LAST_RESORT ) )
      {
        result = ql_text_answer_query( string, result, T );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_parser = cdolist_list_var.first();
    }
    return Sort.sort( Sequences.delete_duplicates( result, $sym37$QL_PARSE_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym38$_, $sym39$QL_PARSE_WEIGHT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 12787L)
  public static SubLObject preprocess_query_string(final SubLObject string)
  {
    if( NIL != string_utilities.starts_with( string, $str40$and ) )
    {
      return string_utilities.replace_substring_once( string, $str40$and, $str41$what, UNPROVIDED );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 12948L)
  public static SubLObject ql_cyclify(final SubLObject string, SubLObject existing_parses)
  {
    if( existing_parses == UNPROVIDED )
    {
      existing_parses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject combined_result = existing_parses;
    SubLObject msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject cdolist_list_var = cyclifier.cyclify( string, ConsesLow.list( $kw44$OUTPUT, $kw45$VERBOSE, $kw46$SCORE_FUNCTION, $sym47$CYCLIFICATION_COVERAGE, $kw48$LEXICON, new_ql_lexicon(), $kw49$PARSER, parser
              .new_stanford_parser( UNPROVIDED, UNPROVIDED ) ) );
          SubLObject raw_result = NIL;
          raw_result = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = raw_result;
            SubLObject raw_cycl = NIL;
            SubLObject weight = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list43 );
            raw_cycl = current.first();
            current = ( weight = current.rest() );
            final SubLObject processed_cycl = ql_postprocess_cyclify_cycl( raw_cycl );
            if( NIL != processed_cycl )
            {
              combined_result = ConsesLow.cons( new_ql_parse( processed_cycl, weight, UNPROVIDED ), combined_result );
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_result = cdolist_list_var.first();
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
      msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != msg )
    {
      Errors.warn( $str50$caught_error__S_while_link_parsin, msg, string );
    }
    return combined_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 13673L)
  public static SubLObject new_ql_lexicon()
  {
    final SubLObject lexicon = object.new_class_instance( $sym51$CYCLIFIER_LEXICON_W_O_FABRICATION );
    methods.funcall_instance_method_with_1_args( lexicon, $sym52$FORBID_MT, $const53$NameLexicalMt );
    return lexicon;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 13932L)
  public static SubLObject ql_postprocess_cyclify_cycl(final SubLObject cycl)
  {
    if( NIL != cycl_utilities.expression_contains_keywordp( cycl, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject transformed_result = convert_instancefns_to_variables( cycl );
    final SubLObject final_result = ql_pred_strengthen_sentence( transformed_result, $const54$InferencePSC );
    return final_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 14217L)
  public static SubLObject ql_pred_strengthen_sentence(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.currentBinding( thread );
    try
    {
      predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.bind( T, thread );
      result = predicate_strengthener.typed_pred_strengthen_formula_unambiguously( sentence, mt, UNPROVIDED ).first();
    }
    finally
    {
      predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 15082L)
  public static SubLObject ql_cyclify_link(final SubLObject string, SubLObject existing_parses)
  {
    if( existing_parses == UNPROVIDED )
    {
      existing_parses = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject combined_result = existing_parses;
    SubLObject msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject v_parser = parser.new_link_parser( linkage.$link_parse_options$.getDynamicValue( thread ), $kw55$WARN, UNPROVIDED );
          SubLObject cdolist_list_var;
          final SubLObject raw_results = cdolist_list_var = cyclifier.cyclify( string, ConsesLow.list( $kw49$PARSER, v_parser, $kw44$OUTPUT, $kw45$VERBOSE, $kw46$SCORE_FUNCTION, $sym47$CYCLIFICATION_COVERAGE,
              $kw48$LEXICON, new_ql_lexicon() ) );
          SubLObject raw_result = NIL;
          raw_result = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = raw_result;
            SubLObject raw_parse = NIL;
            SubLObject weight = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list56 );
            raw_parse = current.first();
            current = ( weight = current.rest() );
            final SubLObject processed_cycl = ql_postprocess_cyclify_cycl( raw_parse );
            if( NIL != processed_cycl )
            {
              combined_result = ConsesLow.cons( new_ql_parse( processed_cycl, weight, UNPROVIDED ), combined_result );
            }
            cdolist_list_var = cdolist_list_var.rest();
            raw_result = cdolist_list_var.first();
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
      msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != msg )
    {
      Errors.warn( $str50$caught_error__S_while_link_parsin, msg, string );
    }
    return combined_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 15989L)
  public static SubLObject convert_instancefns_to_variables(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_vars = NIL;
    SubLObject new_sentence = NIL;
    final SubLObject _prev_bind_0 = $new_vars$.currentBinding( thread );
    try
    {
      $new_vars$.bind( NIL, thread );
      new_sentence = cycl_utilities.expression_transform( obj, $sym58$INSTANCEFN_, $sym59$VAR_FROM_INSTANCEFN, UNPROVIDED, UNPROVIDED );
      new_vars = $new_vars$.getDynamicValue( thread );
    }
    finally
    {
      $new_vars$.rebind( _prev_bind_0, thread );
    }
    return Values.values( new_sentence, new_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 16289L)
  public static SubLObject instancefnP(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_expression_p( v_object ) && cycl_utilities.formula_arg0( v_object ).eql( $const60$InstanceFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 16418L)
  public static SubLObject var_from_instancefn(final SubLObject instancefn_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    result = reader.read_from_string_ignoring_errors( cycl_utilities.formula_arg1( instancefn_naut, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != result )
    {
      $new_vars$.setDynamicValue( ConsesLow.cons( result, $new_vars$.getDynamicValue( thread ) ), thread );
    }
    return ( NIL != result ) ? result : instancefn_naut;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 16673L)
  public static SubLObject ql_template_parse_query(final SubLObject string, SubLObject existing_parses)
  {
    if( existing_parses == UNPROVIDED )
    {
      existing_parses = NIL;
    }
    SubLObject full_results = existing_parses;
    final SubLObject domain_mt = $const61$RKFParsingMt;
    SubLObject cdolist_list_var = rkf_text_processors.parse_a_question_completely( string, domain_mt, UNPROVIDED );
    SubLObject cycl = NIL;
    cycl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == contains_nlrequestfnP( cycl ) && NIL == cycl_utilities.expression_find( $const62$playsActiveSubjectRole, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != cyclifier.quick_sentential_parse_wffP(
          cycl ) )
      {
        cycl = ql_pred_strengthen_sentence( cycl, domain_mt );
        full_results = ConsesLow.cons( new_ql_parse( cycl, ONE_INTEGER, template_parse_complexity_weight( cycl ) ), full_results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cycl = cdolist_list_var.first();
    }
    return Sort.sort( full_results, Symbols.symbol_function( $sym38$_ ), $sym63$QL_PARSE_2ND_WEIGHT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 17737L)
  public static SubLObject template_parse_complexity_weight(final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.expt( $template_parse_complexity_weight_factor$.getDynamicValue( thread ), function_terms.term_relational_complexity( cycl ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18051L)
  public static SubLObject ql_interpret_cycl(final SubLObject string, SubLObject existing_parses)
  {
    if( existing_parses == UNPROVIDED )
    {
      existing_parses = NIL;
    }
    final SubLObject result = reader.read_from_string_ignoring_errors( string_utilities.cyclify_string( string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != cycl_grammar.cycl_sentence_p( result ) )
    {
      existing_parses = ConsesLow.cons( new_ql_parse( result, ONE_INTEGER, UNPROVIDED ), existing_parses );
    }
    return existing_parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18318L)
  public static SubLObject ql_text_answer_query(final SubLObject string, SubLObject existing_parses, SubLObject last_resortP)
  {
    if( existing_parses == UNPROVIDED )
    {
      existing_parses = NIL;
    }
    if( last_resortP == UNPROVIDED )
    {
      last_resortP = NIL;
    }
    if( NIL == existing_parses || NIL == last_resortP )
    {
      existing_parses = ConsesLow.cons( new_ql_parse( ConsesLow.listS( $const65$textAnswer, string, $list66 ), ONE_INTEGER, UNPROVIDED ), existing_parses );
    }
    return existing_parses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18572L)
  public static SubLObject contains_nlrequestfnP(final SubLObject cycl)
  {
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( $const67$NLRequestFn, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18828L)
  public static SubLObject clear_cae_kb_parameters()
  {
    clear_cae_fact_editor_focal_types();
    clear_get_default_wff_checking_mt();
    clear_query_library_default_query_mt();
    clear_query_library_query_search_fact_sheet_links_enabledP();
    clear_rtv_panel_enabled_for_task();
    clear_document_search_panel_enabled_for_task();
    clear_source_information_enabled_for_task();
    clear_task_allows_not();
    clear_task_allows_implies();
    clear_task_allows_unknown_sentence();
    clear_task_allows_or();
    clear_task_allows_and();
    clear_query_library_root_folder();
    clear_query_library_default_transformation_depth();
    clear_query_library_default_max_time();
    clear_query_library_default_max_productivity();
    clear_query_library_default_new_terms_allowed();
    clear_query_library_default_indeterminate_terms_allowed();
    clear_query_library_default_disjunction_free_el_vars_policy();
    clear_cae_query_search_filter();
    clear_cae_query_search_filter_specification();
    clear_cae_query_search_filter_string();
    clear_cae_query_search_term_classification_tree();
    clear_cae_query_search_term_classification_tree_collections();
    clear_cae_default_paraphrase_mt();
    clear_cae_default_parsing_mt();
    clear_cae_default_nl_domain_mt();
    clear_cae_topic();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 20762L)
  public static SubLObject default_inference_parameters_for_task(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    SubLObject ip = NIL;
    final SubLObject default_transformations_for_task = query_library_default_transformation_depth( task );
    final SubLObject default_max_time = query_library_default_max_time( task );
    final SubLObject default_indeterminate_terms_allowedP = query_library_default_indeterminate_terms_allowed( task );
    final SubLObject default_new_new_terms_allowedP = query_library_default_new_terms_allowed( task );
    final SubLObject default_disjunction_el_vars_policy = query_library_default_disjunction_free_el_vars_policy( task );
    final SubLObject default_max_productivity = query_library_default_max_productivity( task );
    final SubLObject default_compute_answer_justificationsP = query_library_default_compute_answer_justifications( task );
    ip = conses_high.putf( ip, $kw68$MAX_TRANSFORMATION_DEPTH, default_transformations_for_task );
    ip = conses_high.putf( ip, $kw69$ALLOW_INDETERMINATE_RESULTS_, default_indeterminate_terms_allowedP );
    ip = conses_high.putf( ip, $kw70$NEW_TERMS_ALLOWED_, default_new_new_terms_allowedP );
    ip = conses_high.putf( ip, $kw71$MAX_TIME, default_max_time );
    ip = conses_high.putf( ip, $kw72$DISJUNCTION_FREE_EL_VARS_POLICY, default_disjunction_el_vars_policy );
    ip = conses_high.putf( ip, $kw73$PRODUCTIVITY_LIMIT, default_max_productivity );
    ip = conses_high.putf( ip, $kw74$COMPUTE_ANSWER_JUSTIFICATIONS_, default_compute_answer_justificationsP );
    return ip;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 22182L)
  public static SubLObject get_auto_unification_mt(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    return get_default_wff_checking_mt( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 22306L)
  public static SubLObject cae_single_value_task_dependent_query_answer(final SubLObject task, final SubLObject query_template, SubLObject result_var, SubLObject default_value)
  {
    if( result_var == UNPROVIDED )
    {
      result_var = NIL;
    }
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != forts.valid_fortP( query_template ) )
    {
      final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding( thread );
      try
      {
        cae_query_search.$current_cae_task$.bind( task, thread );
        final SubLObject v_bindings = kb_query.new_cyc_query_from_kbq( query_template, $list76, UNPROVIDED ).first();
        if( NIL == result_var && NIL != list_utilities.singletonP( v_bindings ) )
        {
          result_var = bindings.variable_binding_variable( v_bindings.first() );
        }
        if( NIL != result_var )
        {
          v_answer = bindings.variable_lookup( result_var, v_bindings );
        }
      }
      finally
      {
        cae_query_search.$current_cae_task$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != v_answer ) ? v_answer : default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 22865L)
  public static SubLObject cae_multiple_value_task_dependent_query_answer(final SubLObject task, final SubLObject query_template, SubLObject result_var, SubLObject default_value)
  {
    if( result_var == UNPROVIDED )
    {
      result_var = NIL;
    }
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != forts.valid_fortP( query_template ) )
    {
      final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding( thread );
      try
      {
        cae_query_search.$current_cae_task$.bind( task, thread );
        SubLObject cdolist_list_var;
        final SubLObject v_bindings = cdolist_list_var = kb_query.new_cyc_query_from_kbq( query_template, $list77, UNPROVIDED );
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == result_var && NIL != list_utilities.singletonP( binding ) )
          {
            result_var = bindings.variable_binding_variable( binding.first() );
          }
          if( NIL != result_var )
          {
            final SubLObject item_var = bindings.variable_lookup( result_var, binding );
            if( NIL == conses_high.member( item_var, v_answer, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              v_answer = ConsesLow.cons( item_var, v_answer );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          binding = cdolist_list_var.first();
        }
      }
      finally
      {
        cae_query_search.$current_cae_task$.rebind( _prev_bind_0, thread );
      }
    }
    return ( NIL != v_answer ) ? v_answer : default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
  public static SubLObject clear_cae_fact_editor_focal_types()
  {
    final SubLObject cs = $cae_fact_editor_focal_types_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
  public static SubLObject remove_cae_fact_editor_focal_types(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $cae_fact_editor_focal_types_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
  public static SubLObject cae_fact_editor_focal_types_internal(final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_template = $const79$CAEFactEditorFocalTypeQuery;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding( thread );
    try
    {
      cae_query_search.$current_cae_task$.bind( task, thread );
      SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq( query_template, UNPROVIDED, UNPROVIDED );
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject Ptemplate = conses_high.sublis( binding, $sym80$_TEMPLATE, UNPROVIDED, UNPROVIDED );
        result = ConsesLow.cons( Ptemplate, result );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    finally
    {
      cae_query_search.$current_cae_task$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
  public static SubLObject cae_fact_editor_focal_types(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    SubLObject caching_state = $cae_fact_editor_focal_types_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym78$CAE_FACT_EDITOR_FOCAL_TYPES, $sym81$_CAE_FACT_EDITOR_FOCAL_TYPES_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_fact_editor_focal_types_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
  public static SubLObject clear_get_default_wff_checking_mt()
  {
    final SubLObject cs = $get_default_wff_checking_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
  public static SubLObject remove_get_default_wff_checking_mt(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_default_wff_checking_mt_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
  public static SubLObject get_default_wff_checking_mt_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const83$CAEWFFCheckingMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
  public static SubLObject get_default_wff_checking_mt(final SubLObject task)
  {
    SubLObject caching_state = $get_default_wff_checking_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym82$GET_DEFAULT_WFF_CHECKING_MT, $sym86$_GET_DEFAULT_WFF_CHECKING_MT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_default_wff_checking_mt_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
  public static SubLObject clear_get_default_cae_guidance_mt()
  {
    final SubLObject cs = $get_default_cae_guidance_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
  public static SubLObject remove_get_default_cae_guidance_mt(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_default_cae_guidance_mt_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
  public static SubLObject get_default_cae_guidance_mt_internal(final SubLObject task)
  {
    SubLObject v_answer = NIL;
    if( NIL != constant_handles.valid_constantP( $const88$CAEGuidanceMtQuery, UNPROVIDED ) )
    {
      v_answer = cae_single_value_task_dependent_query_answer( task, $const88$CAEGuidanceMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo );
    }
    if( NIL == v_answer )
    {
      v_answer = cae_single_value_task_dependent_query_answer( task, $const83$CAEWFFCheckingMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
  public static SubLObject get_default_cae_guidance_mt(final SubLObject task)
  {
    SubLObject caching_state = $get_default_cae_guidance_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym87$GET_DEFAULT_CAE_GUIDANCE_MT, $sym89$_GET_DEFAULT_CAE_GUIDANCE_MT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym90$CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_default_cae_guidance_mt_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24639L)
  public static SubLObject get_all_default_wff_checking_mts()
  {
    return ask_utilities.query_variable( $sym84$_MT, $list91, $const92$CycArchitectureMt, $list93 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
  public static SubLObject clear_query_library_default_query_mt()
  {
    final SubLObject cs = $query_library_default_query_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
  public static SubLObject remove_query_library_default_query_mt(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_query_mt_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
  public static SubLObject query_library_default_query_mt_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const95$CAEDefaultQueryMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
  public static SubLObject query_library_default_query_mt(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_query_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT, $sym96$_QUERY_LIBRARY_DEFAULT_QUERY_MT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_query_mt_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
  public static SubLObject clear_query_library_query_search_fact_sheet_links_enabledP()
  {
    final SubLObject cs = $query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
  public static SubLObject remove_query_library_query_search_fact_sheet_links_enabledP(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
  public static SubLObject query_library_query_search_fact_sheet_links_enabledP_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, query_library_query_search_fact_sheet_links_enabledP_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
  public static SubLObject query_library_query_search_fact_sheet_links_enabledP(final SubLObject task)
  {
    SubLObject caching_state = $query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_, $sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_query_search_fact_sheet_links_enabledP_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25258L)
  public static SubLObject query_library_query_search_fact_sheet_links_enabledP_int(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const100$CAEQuerySearchFactSheetLinksEnabl, $sym101$_VALUE, $const98$True );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
  public static SubLObject clear_rtv_panel_enabled_for_task()
  {
    final SubLObject cs = $rtv_panel_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
  public static SubLObject remove_rtv_panel_enabled_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rtv_panel_enabled_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
  public static SubLObject rtv_panel_enabled_for_task_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, rtv_panel_enabled_for_task_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
  public static SubLObject rtv_panel_enabled_for_task(final SubLObject task)
  {
    SubLObject caching_state = $rtv_panel_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym102$RTV_PANEL_ENABLED_FOR_TASK, $sym103$_RTV_PANEL_ENABLED_FOR_TASK_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rtv_panel_enabled_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25609L)
  public static SubLObject rtv_panel_enabled_for_task_int(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const104$CAERTVPanelEnabledQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
  public static SubLObject clear_document_search_panel_enabled_for_task()
  {
    final SubLObject cs = $document_search_panel_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
  public static SubLObject remove_document_search_panel_enabled_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $document_search_panel_enabled_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
  public static SubLObject document_search_panel_enabled_for_task_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, document_search_panel_enabled_for_task_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
  public static SubLObject document_search_panel_enabled_for_task(final SubLObject task)
  {
    SubLObject caching_state = $document_search_panel_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK, $sym107$_DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( document_search_panel_enabled_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25930L)
  public static SubLObject document_search_panel_enabled_for_task_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const108$CAETextSearchPanelEnabledQuery, T ) )
    {
      return $const98$True;
    }
    return cae_single_value_task_dependent_query_answer( task, $const108$CAETextSearchPanelEnabledQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
  public static SubLObject clear_source_information_enabled_for_task()
  {
    final SubLObject cs = $source_information_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
  public static SubLObject remove_source_information_enabled_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $source_information_enabled_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
  public static SubLObject source_information_enabled_for_task_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, source_information_enabled_for_task_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
  public static SubLObject source_information_enabled_for_task(final SubLObject task)
  {
    SubLObject caching_state = $source_information_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK, $sym110$_SOURCE_INFORMATION_ENABLED_FOR_TASK_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( source_information_enabled_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26346L)
  public static SubLObject source_information_enabled_for_task_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const111$CAESourceInformationEnabledQuery, T ) )
    {
      return $const98$True;
    }
    return cae_single_value_task_dependent_query_answer( task, $const111$CAESourceInformationEnabledQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
  public static SubLObject clear_irrelevant_results_allowed_for_task()
  {
    final SubLObject cs = $irrelevant_results_allowed_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
  public static SubLObject remove_irrelevant_results_allowed_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $irrelevant_results_allowed_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
  public static SubLObject irrelevant_results_allowed_for_task_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, irrelevant_results_allowed_for_task_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
  public static SubLObject irrelevant_results_allowed_for_task(final SubLObject task)
  {
    SubLObject caching_state = $irrelevant_results_allowed_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK, $sym113$_IRRELEVANT_RESULTS_ALLOWED_FOR_TASK_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( irrelevant_results_allowed_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26763L)
  public static SubLObject irrelevant_results_allowed_for_task_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const114$CAEIrrelevantTermAllowedQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const114$CAEIrrelevantTermAllowedQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
  public static SubLObject clear_report_generation_enabled_for_task()
  {
    final SubLObject cs = $report_generation_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
  public static SubLObject remove_report_generation_enabled_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $report_generation_enabled_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
  public static SubLObject report_generation_enabled_for_task_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, report_generation_enabled_for_task_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
  public static SubLObject report_generation_enabled_for_task(final SubLObject task)
  {
    SubLObject caching_state = $report_generation_enabled_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym116$REPORT_GENERATION_ENABLED_FOR_TASK, $sym117$_REPORT_GENERATION_ENABLED_FOR_TASK_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( report_generation_enabled_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27173L)
  public static SubLObject report_generation_enabled_for_task_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const118$CAEReportGenerationEnabledQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const118$CAEReportGenerationEnabledQuery, $sym105$_TV, $const115$False );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
  public static SubLObject clear_report_generation_template_root_collection_for_task()
  {
    final SubLObject cs = $report_generation_template_root_collection_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
  public static SubLObject remove_report_generation_template_root_collection_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $report_generation_template_root_collection_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
  public static SubLObject report_generation_template_root_collection_for_task_internal(final SubLObject task)
  {
    return report_generation_template_root_collection_for_task_int( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
  public static SubLObject report_generation_template_root_collection_for_task(final SubLObject task)
  {
    SubLObject caching_state = $report_generation_template_root_collection_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK, $sym120$_REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK_CACHING_STAT, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( report_generation_template_root_collection_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27616L)
  public static SubLObject report_generation_template_root_collection_for_task_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const121$CAEReportGenerationTemplateRootCo, T ) )
    {
      return $const122$ReportGenerationTemplate;
    }
    return cae_single_value_task_dependent_query_answer( task, $const121$CAEReportGenerationTemplateRootCo, $sym123$_COL, $const122$ReportGenerationTemplate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
  public static SubLObject clear_task_allows_not()
  {
    final SubLObject cs = $task_allows_not_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
  public static SubLObject remove_task_allows_not(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $task_allows_not_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
  public static SubLObject task_allows_not_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, task_allows_not_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
  public static SubLObject task_allows_not(final SubLObject task)
  {
    SubLObject caching_state = $task_allows_not_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym124$TASK_ALLOWS_NOT, $sym125$_TASK_ALLOWS_NOT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( task_allows_not_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28085L)
  public static SubLObject task_allows_not_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const126$CAEAllowsNotQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const126$CAEAllowsNotQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
  public static SubLObject clear_task_allows_implies()
  {
    final SubLObject cs = $task_allows_implies_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
  public static SubLObject remove_task_allows_implies(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $task_allows_implies_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
  public static SubLObject task_allows_implies_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, task_allows_implies_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
  public static SubLObject task_allows_implies(final SubLObject task)
  {
    SubLObject caching_state = $task_allows_implies_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym127$TASK_ALLOWS_IMPLIES, $sym128$_TASK_ALLOWS_IMPLIES_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( task_allows_implies_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28421L)
  public static SubLObject task_allows_implies_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const129$CAEAllowsImpliesQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const129$CAEAllowsImpliesQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
  public static SubLObject clear_task_allows_and()
  {
    final SubLObject cs = $task_allows_and_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
  public static SubLObject remove_task_allows_and(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $task_allows_and_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
  public static SubLObject task_allows_and_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, task_allows_and_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
  public static SubLObject task_allows_and(final SubLObject task)
  {
    SubLObject caching_state = $task_allows_and_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym130$TASK_ALLOWS_AND, $sym131$_TASK_ALLOWS_AND_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( task_allows_and_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28761L)
  public static SubLObject task_allows_and_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const132$CAEAllowsAndQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const132$CAEAllowsAndQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
  public static SubLObject clear_task_allows_or()
  {
    final SubLObject cs = $task_allows_or_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
  public static SubLObject remove_task_allows_or(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $task_allows_or_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
  public static SubLObject task_allows_or_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, task_allows_or_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
  public static SubLObject task_allows_or(final SubLObject task)
  {
    SubLObject caching_state = $task_allows_or_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym133$TASK_ALLOWS_OR, $sym134$_TASK_ALLOWS_OR_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( task_allows_or_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29087L)
  public static SubLObject task_allows_or_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const135$CAEAllowsOrQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const135$CAEAllowsOrQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
  public static SubLObject clear_task_allows_unknown_sentence()
  {
    final SubLObject cs = $task_allows_unknown_sentence_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
  public static SubLObject remove_task_allows_unknown_sentence(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $task_allows_unknown_sentence_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
  public static SubLObject task_allows_unknown_sentence_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, task_allows_unknown_sentence_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
  public static SubLObject task_allows_unknown_sentence(final SubLObject task)
  {
    SubLObject caching_state = $task_allows_unknown_sentence_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym136$TASK_ALLOWS_UNKNOWN_SENTENCE, $sym137$_TASK_ALLOWS_UNKNOWN_SENTENCE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( task_allows_unknown_sentence_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29438L)
  public static SubLObject task_allows_unknown_sentence_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const138$CAEAllowsUnknownSentenceQuery, T ) )
    {
      return $const115$False;
    }
    return cae_single_value_task_dependent_query_answer( task, $const138$CAEAllowsUnknownSentenceQuery, $sym105$_TV, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
  public static SubLObject clear_sparql_browser_urls_for_task()
  {
    final SubLObject cs = $sparql_browser_urls_for_task_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
  public static SubLObject remove_sparql_browser_urls_for_task(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sparql_browser_urls_for_task_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
  public static SubLObject sparql_browser_urls_for_task_internal(final SubLObject task)
  {
    return sparql_browser_urls_for_task_int( task );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
  public static SubLObject sparql_browser_urls_for_task(final SubLObject task)
  {
    SubLObject caching_state = $sparql_browser_urls_for_task_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym139$SPARQL_BROWSER_URLS_FOR_TASK, $sym140$_SPARQL_BROWSER_URLS_FOR_TASK_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sparql_browser_urls_for_task_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29817L)
  public static SubLObject sparql_browser_urls_for_task_int(final SubLObject task)
  {
    if( NIL == constant_handles.valid_constantP( $const141$CAESPARQLBrowserAddressQuery, T ) )
    {
      return NIL;
    }
    return Mapping.mapcar( $sym142$URL_STRING, cae_multiple_value_task_dependent_query_answer( task, $const141$CAESPARQLBrowserAddressQuery, $sym143$_URL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
  public static SubLObject clear_query_library_root_folder()
  {
    final SubLObject cs = $query_library_root_folder_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
  public static SubLObject remove_query_library_root_folder(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_root_folder_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
  public static SubLObject query_library_root_folder_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const145$CAEQueryLibraryRootFolderQuery, $sym84$_MT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
  public static SubLObject query_library_root_folder(final SubLObject task)
  {
    SubLObject caching_state = $query_library_root_folder_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym144$QUERY_LIBRARY_ROOT_FOLDER, $sym146$_QUERY_LIBRARY_ROOT_FOLDER_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_root_folder_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
  public static SubLObject clear_query_library_should_suggestions_be_intersected()
  {
    final SubLObject cs = $query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
  public static SubLObject remove_query_library_should_suggestions_be_intersected(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
  public static SubLObject query_library_should_suggestions_be_intersected_internal(final SubLObject task)
  {
    return Equality.eq( $const98$True, cae_single_value_task_dependent_query_answer( task, $const148$CAEQueryLibraryShouldSuggestionsB, $sym149$_TRUTH, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
  public static SubLObject query_library_should_suggestions_be_intersected(final SubLObject task)
  {
    SubLObject caching_state = $query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED, $sym150$_QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED_CACHING_STATE_, NIL, EQUAL,
          ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_should_suggestions_be_intersected_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
  public static SubLObject clear_query_library_default_transformation_depth()
  {
    final SubLObject cs = $query_library_default_transformation_depth_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
  public static SubLObject remove_query_library_default_transformation_depth(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_transformation_depth_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
  public static SubLObject query_library_default_transformation_depth_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const152$CAEQueryLibraryDefaultTransformat, $sym84$_MT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
  public static SubLObject query_library_default_transformation_depth(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_transformation_depth_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH, $sym153$_QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH_CACHING_STATE_, NIL, EQUAL,
          ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_transformation_depth_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
  public static SubLObject clear_query_library_default_compute_answer_justifications()
  {
    final SubLObject cs = $query_library_default_compute_answer_justifications_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
  public static SubLObject remove_query_library_default_compute_answer_justifications(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_compute_answer_justifications_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
  public static SubLObject query_library_default_compute_answer_justifications_internal(final SubLObject task)
  {
    return subl_identifier.sublid_from_cyc_entity( cae_single_value_task_dependent_query_answer( task, $const155$CAEQueryLibraryDefaultComputeAnsw, $sym101$_VALUE, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
  public static SubLObject query_library_default_compute_answer_justifications(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_compute_answer_justifications_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS, $sym156$_QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS_CACHING_STAT, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_compute_answer_justifications_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
  public static SubLObject clear_query_library_default_max_time()
  {
    final SubLObject cs = $query_library_default_max_time_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
  public static SubLObject remove_query_library_default_max_time(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_max_time_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
  public static SubLObject query_library_default_max_time_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const158$CAEQueryLibraryDefaultMaxTimeQuer, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
  public static SubLObject query_library_default_max_time(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_max_time_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME, $sym159$_QUERY_LIBRARY_DEFAULT_MAX_TIME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_max_time_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
  public static SubLObject clear_query_library_default_max_productivity()
  {
    final SubLObject cs = $query_library_default_max_productivity_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
  public static SubLObject remove_query_library_default_max_productivity(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_max_productivity_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
  public static SubLObject query_library_default_max_productivity_internal(final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject value = cae_single_value_task_dependent_query_answer( task, $const161$CAEQueryLibraryDefaultMaxProducti, UNPROVIDED, UNPROVIDED );
    if( NIL != value && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == number_utilities.non_negative_number_p( value ) && !value.eql( $const162$PlusInfinity ) )
    {
      Errors.error( $str163$Got_invalid_default__productivity, value, task );
    }
    return ( NIL != value ) ? value : inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
  public static SubLObject query_library_default_max_productivity(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_max_productivity_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY, $sym164$_QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_max_productivity_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
  public static SubLObject clear_query_library_default_new_terms_allowed()
  {
    final SubLObject cs = $query_library_default_new_terms_allowed_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
  public static SubLObject remove_query_library_default_new_terms_allowed(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_new_terms_allowed_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
  public static SubLObject query_library_default_new_terms_allowed_internal(final SubLObject task)
  {
    return subl_identifier.sublid_from_cyc_entity( query_library_default_new_terms_allowed_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
  public static SubLObject query_library_default_new_terms_allowed(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_new_terms_allowed_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED, $sym166$_QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_new_terms_allowed_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31814L)
  public static SubLObject query_library_default_new_terms_allowed_int(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const167$CAEQueryLibraryDefaultNewTermsAll, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
  public static SubLObject clear_allow_arbitrary_assertion_deletion()
  {
    final SubLObject cs = $allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
  public static SubLObject remove_allow_arbitrary_assertion_deletion(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
  public static SubLObject allow_arbitrary_assertion_deletion_internal(final SubLObject task)
  {
    return subl_identifier.sublid_from_cyc_entity( allow_arbitrary_assertion_deletion_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
  public static SubLObject allow_arbitrary_assertion_deletion(final SubLObject task)
  {
    SubLObject caching_state = $allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym168$ALLOW_ARBITRARY_ASSERTION_DELETION, $sym169$_ALLOW_ARBITRARY_ASSERTION_DELETION_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( allow_arbitrary_assertion_deletion_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32166L)
  public static SubLObject allow_arbitrary_assertion_deletion_int(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const170$AppAllowsArbitraryAssertionDeleti, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
  public static SubLObject clear_query_library_default_indeterminate_terms_allowed()
  {
    final SubLObject cs = $query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
  public static SubLObject remove_query_library_default_indeterminate_terms_allowed(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
  public static SubLObject query_library_default_indeterminate_terms_allowed_internal(final SubLObject task)
  {
    return subl_identifier.sublid_from_cyc_entity( query_library_default_indeterminate_terms_allowed_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
  public static SubLObject query_library_default_indeterminate_terms_allowed(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED, $sym172$_QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED_CACHING_STATE_, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_indeterminate_terms_allowed_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32541L)
  public static SubLObject query_library_default_indeterminate_terms_allowed_int(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const173$CAEQueryLibraryDefaultIndetermina, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
  public static SubLObject clear_query_library_default_disjunction_free_el_vars_policy()
  {
    final SubLObject cs = $query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
  public static SubLObject remove_query_library_default_disjunction_free_el_vars_policy(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
  public static SubLObject query_library_default_disjunction_free_el_vars_policy_internal(final SubLObject task)
  {
    return subl_identifier.sublid_from_cyc_entity( query_library_default_disjunction_free_el_vars_policy_int( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
  public static SubLObject query_library_default_disjunction_free_el_vars_policy(final SubLObject task)
  {
    SubLObject caching_state = $query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY, $sym175$_QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY_CACHING_ST, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_default_disjunction_free_el_vars_policy_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32951L)
  public static SubLObject query_library_default_disjunction_free_el_vars_policy_int(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const176$CAEQueryLibraryDefaultDisjunction, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
  public static SubLObject clear_cae_query_search_filter()
  {
    final SubLObject cs = $cae_query_search_filter_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
  public static SubLObject remove_cae_query_search_filter(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_query_search_filter_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
  public static SubLObject cae_query_search_filter_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const178$CAEQuerySearchFilterQuery, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
  public static SubLObject cae_query_search_filter(final SubLObject task)
  {
    SubLObject caching_state = $cae_query_search_filter_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym177$CAE_QUERY_SEARCH_FILTER, $sym179$_CAE_QUERY_SEARCH_FILTER_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_query_search_filter_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
  public static SubLObject clear_cae_query_search_filter_specification()
  {
    final SubLObject cs = $cae_query_search_filter_specification_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
  public static SubLObject remove_cae_query_search_filter_specification(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_query_search_filter_specification_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
  public static SubLObject cae_query_search_filter_specification_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const181$CAEQuerySearchFilterSpecification, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
  public static SubLObject cae_query_search_filter_specification(final SubLObject task)
  {
    SubLObject caching_state = $cae_query_search_filter_specification_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION, $sym182$_CAE_QUERY_SEARCH_FILTER_SPECIFICATION_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_query_search_filter_specification_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
  public static SubLObject clear_cae_query_search_filter_string()
  {
    final SubLObject cs = $cae_query_search_filter_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
  public static SubLObject remove_cae_query_search_filter_string(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_query_search_filter_string_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
  public static SubLObject cae_query_search_filter_string_internal(final SubLObject task)
  {
    final SubLObject filter = cae_query_search_filter( task );
    final SubLObject filter_tree = ask_utilities.query_variable( $sym184$_TREE, ConsesLow.listS( $const185$and, ConsesLow.listS( $const186$conceptFilterDecisionTree, filter, $list187 ), $list188 ), $const54$InferencePSC,
        UNPROVIDED ).first();
    return filter_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
  public static SubLObject cae_query_search_filter_string(final SubLObject task)
  {
    SubLObject caching_state = $cae_query_search_filter_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym183$CAE_QUERY_SEARCH_FILTER_STRING, $sym189$_CAE_QUERY_SEARCH_FILTER_STRING_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_query_search_filter_string_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
  public static SubLObject clear_cae_query_search_term_classification_tree()
  {
    final SubLObject cs = $cae_query_search_term_classification_tree_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
  public static SubLObject remove_cae_query_search_term_classification_tree(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_query_search_term_classification_tree_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
  public static SubLObject cae_query_search_term_classification_tree_internal(final SubLObject task)
  {
    return decision_tree.new_decision_tree_from_weka_j48_format( cae_query_search_filter_string( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
  public static SubLObject cae_query_search_term_classification_tree(final SubLObject task)
  {
    SubLObject caching_state = $cae_query_search_term_classification_tree_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE, $sym191$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_query_search_term_classification_tree_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
  public static SubLObject clear_cae_query_search_term_classification_tree_collections()
  {
    final SubLObject cs = $cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
  public static SubLObject remove_cae_query_search_term_classification_tree_collections(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
  public static SubLObject cae_query_search_term_classification_tree_collections_internal(final SubLObject task)
  {
    return term_classification_tree.create_term_classification_tree_collections( cae_query_search_term_classification_tree( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
  public static SubLObject cae_query_search_term_classification_tree_collections(final SubLObject task)
  {
    SubLObject caching_state = $cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS, $sym193$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS_CACHING_ST, NIL,
          EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_query_search_term_classification_tree_collections_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
  public static SubLObject clear_cae_default_paraphrase_mt()
  {
    final SubLObject cs = $cae_default_paraphrase_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
  public static SubLObject remove_cae_default_paraphrase_mt(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_default_paraphrase_mt_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
  public static SubLObject cae_default_paraphrase_mt_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const195$CAEDefaultParaphraseMtQuery, $sym84$_MT, $const196$EnglishParaphraseMt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
  public static SubLObject cae_default_paraphrase_mt(final SubLObject task)
  {
    SubLObject caching_state = $cae_default_paraphrase_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym194$CAE_DEFAULT_PARAPHRASE_MT, $sym197$_CAE_DEFAULT_PARAPHRASE_MT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_default_paraphrase_mt_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
  public static SubLObject clear_cae_default_parsing_mt()
  {
    final SubLObject cs = $cae_default_parsing_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
  public static SubLObject remove_cae_default_parsing_mt(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_default_parsing_mt_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
  public static SubLObject cae_default_parsing_mt_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const199$CAEDefaultParsingMtQuery, $sym84$_MT, $list200 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
  public static SubLObject cae_default_parsing_mt(final SubLObject task)
  {
    SubLObject caching_state = $cae_default_parsing_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym198$CAE_DEFAULT_PARSING_MT, $sym201$_CAE_DEFAULT_PARSING_MT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_default_parsing_mt_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
  public static SubLObject clear_cae_default_nl_domain_mt()
  {
    final SubLObject cs = $cae_default_nl_domain_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
  public static SubLObject remove_cae_default_nl_domain_mt(final SubLObject task)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cae_default_nl_domain_mt_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
  public static SubLObject cae_default_nl_domain_mt_internal(final SubLObject task)
  {
    return cae_single_value_task_dependent_query_answer( task, $const203$CAEDefaultNLDomainMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
  public static SubLObject cae_default_nl_domain_mt(final SubLObject task)
  {
    SubLObject caching_state = $cae_default_nl_domain_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym202$CAE_DEFAULT_NL_DOMAIN_MT, $sym204$_CAE_DEFAULT_NL_DOMAIN_MT_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_default_nl_domain_mt_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35358L)
  public static SubLObject cae_get_nl_mts_from_task(final SubLObject task)
  {
    return ConsesLow.list( cae_default_nl_domain_mt( task ), cae_default_paraphrase_mt( task ), cae_default_parsing_mt( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35531L)
  public static SubLObject cae_get_cae_mts_from_task(final SubLObject task)
  {
    return ConsesLow.list( cae_default_nl_domain_mt( task ), cae_default_paraphrase_mt( task ), cae_default_parsing_mt( task ), query_library_default_query_mt( task ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
  public static SubLObject clear_cae_topic()
  {
    final SubLObject cs = $cae_topic_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
  public static SubLObject remove_cae_topic(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $cae_topic_caching_state$.getGlobalValue(), ConsesLow.list( task ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
  public static SubLObject cae_topic_internal(final SubLObject task)
  {
    return ( NIL != misc_utilities.initialized_p( task ) ) ? ask_utilities.query_variable( $sym208$_TOPIC, ConsesLow.list( $const185$and, $list209, ConsesLow.listS( $const210$topicOfIndividual, task, $list211 ) ),
        $const54$InferencePSC, $list212 ).first() : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
  public static SubLObject cae_topic(SubLObject task)
  {
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    SubLObject caching_state = $cae_topic_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym207$CAE_TOPIC, $sym213$_CAE_TOPIC_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cae_topic_internal( task ) ) );
      memoization_state.caching_state_put( caching_state, task, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 36072L)
  public static SubLObject cae_task_topic_changed(final SubLObject argument, final SubLObject assertion)
  {
    final SubLObject task = assertions_high.gaf_arg1( assertion );
    remove_get_default_wff_checking_mt( task );
    remove_cae_fact_editor_focal_types( task );
    remove_query_library_root_folder( task );
    remove_query_library_default_query_mt( task );
    remove_cae_query_search_filter( task );
    remove_cae_query_search_filter_string( task );
    remove_cae_query_search_term_classification_tree( task );
    remove_cae_query_search_term_classification_tree_collections( task );
    remove_cae_default_paraphrase_mt( task );
    remove_cae_default_parsing_mt( task );
    remove_cae_default_nl_domain_mt( task );
    remove_cae_topic( task );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 36989L)
  public static SubLObject store_original_string_for_template_id(final SubLObject template_id, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_enter( $original_query_strings$.getDynamicValue( thread ), template_id, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 37139L)
  public static SubLObject get_original_string_for_query(final SubLObject template_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject original_string = dictionary.dictionary_lookup( $original_query_strings$.getDynamicValue( thread ), narts_high.nart_substitute( template_id ), $str215$failed_to_find_original_query_str );
    return original_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 37372L)
  public static SubLObject parsed_query_template_p(final SubLObject template_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( dictionary.dictionary_lookup( $original_query_strings$.getDynamicValue( thread ), narts_high.nart_substitute( template_id ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 37523L)
  public static SubLObject new_query_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != constant_handles.valid_constant( $const217$QueryLibrary_QueryCreationTemplat, UNPROVIDED ) )
    {
      final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding( thread );
      try
      {
        kb_control_vars.$forward_inference_allowed_rules$.bind( query_library_template_forward_rules( $const217$QueryLibrary_QueryCreationTemplat ), thread );
        result = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const218$TemplateFromTestQueryFn, rkf_term_utilities.create_new_constant( $str219$UserQuery, $list220, NIL, $const221$TestVocabularyMt, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
      }
      finally
      {
        kb_control_vars.$forward_inference_allowed_rules$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      result = czer_main.cyc_find_or_create_nart( ConsesLow.list( $const218$TemplateFromTestQueryFn, rkf_term_utilities.create_new_constant( $str219$UserQuery, $list220, NIL, $const221$TestVocabularyMt, UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38240L)
  public static SubLObject next_query_id()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $latest_query_id$.setDynamicValue( Numbers.add( $latest_query_id$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return $latest_query_id$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
  public static SubLObject clear_query_library_template_forward_rules()
  {
    final SubLObject cs = $query_library_template_forward_rules_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
  public static SubLObject remove_query_library_template_forward_rules(final SubLObject creation_template)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $query_library_template_forward_rules_caching_state$.getGlobalValue(), ConsesLow.list( creation_template ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
  public static SubLObject query_library_template_forward_rules_internal(final SubLObject creation_template)
  {
    return forward.creation_template_forward_rules_via_exemplars( creation_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
  public static SubLObject query_library_template_forward_rules(final SubLObject creation_template)
  {
    SubLObject caching_state = $query_library_template_forward_rules_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES, $sym223$_QUERY_LIBRARY_TEMPLATE_FORWARD_RULES_CACHING_STATE_, TEN_INTEGER, EQ, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, creation_template, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( query_library_template_forward_rules_internal( creation_template ) ) );
      memoization_state.caching_state_put( caching_state, creation_template, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 39353L)
  public static SubLObject kill_query_template_and_query(final SubLObject query_template)
  {
    final SubLObject possible_test_query = inverted_index_query_library.test_query_for_template( query_template, $const54$InferencePSC );
    final SubLObject possible_query_spec = ( NIL != nart_handles.nart_p( possible_test_query ) && cycl_utilities.nat_functor( possible_test_query ).eql( $const225$TestQueryFn ) ) ? cycl_utilities.nat_arg1(
        possible_test_query, UNPROVIDED ) : NIL;
    final SubLObject result = ( NIL != forts.fort_p( possible_query_spec ) ) ? ke.ke_kill_now( possible_query_spec )
        : ( ( NIL != kb_query.kbq_query_spec_p( possible_test_query ) ) ? ke.ke_kill_now( possible_test_query ) : ( ( NIL != forts.fort_p( query_template ) ) ? ke.ke_kill_now( query_template ) : NIL ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 40062L)
  public static SubLObject kill_query_library(final SubLObject query_library)
  {
    api_widgets.kill_constant( query_library );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 40194L)
  public static SubLObject pred_strengthen_unambiguously_test(final SubLObject new_answer, final SubLObject expected)
  {
    if( NIL != subl_promotions.memberP( expected, new_answer, $sym227$EQUALS_EL_, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 40194L)
  public static SubLObject get_cycls_for_unindexed_string_tct(final SubLObject string, final SubLObject target_cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject registered_ql_parsers_old = $registered_ql_parsers$.getDynamicValue( thread );
    SubLObject result = NIL;
    register_default_ql_parsers();
    final SubLObject ql_parses = get_cycls_for_unindexed_string( string );
    final SubLObject cycls = Mapping.mapcar( $sym19$QL_PARSE_CYCL, ql_parses );
    result = subl_promotions.memberP( target_cycl, cycls, $sym227$EQUALS_EL_, UNPROVIDED );
    $registered_ql_parsers$.setDynamicValue( registered_ql_parsers_old, thread );
    return result;
  }

  public static SubLObject declare_query_library_utils_file()
  {
    SubLFiles.declareFunction( me, "log_query_library_search", "LOG-QUERY-LIBRARY-SEARCH", 1, 3, false );
    SubLFiles.declareFunction( me, "unindexed_queries_from_string", "UNINDEXED-QUERIES-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "unindexed_queries_from_string_with_confidences", "UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "new_weighted_xml", "NEW-WEIGHTED-XML", 1, 5, false );
    SubLFiles.declareFunction( me, "register_all_query_library_parsers", "REGISTER-ALL-QUERY-LIBRARY-PARSERS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_cyclify_parser", "REGISTER-CYCLIFY-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "register_cyclify_link_parser", "REGISTER-CYCLIFY-LINK-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "deregister_cyclify_parser", "DEREGISTER-CYCLIFY-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "register_template_parser", "REGISTER-TEMPLATE-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "deregister_template_parser", "DEREGISTER-TEMPLATE-PARSER", 0, 0, false );
    SubLFiles.declareFunction( me, "register_text_answers", "REGISTER-TEXT-ANSWERS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_text_answers_as_last_resort", "REGISTER-TEXT-ANSWERS-AS-LAST-RESORT", 0, 0, false );
    SubLFiles.declareFunction( me, "deregister_text_answers", "DEREGISTER-TEXT-ANSWERS", 0, 0, false );
    SubLFiles.declareFunction( me, "register_ebmt", "REGISTER-EBMT", 0, 0, false );
    SubLFiles.declareFunction( me, "deregister_ebmt", "DEREGISTER-EBMT", 0, 0, false );
    SubLFiles.declareFunction( me, "register_default_ql_parsers", "REGISTER-DEFAULT-QL-PARSERS", 0, 0, false );
    SubLFiles.declareFunction( me, "new_ql_parse", "NEW-QL-PARSE", 0, 3, false );
    SubLFiles.declareFunction( me, "set_ql_parse_cycl", "SET-QL-PARSE-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ql_parse_weight", "SET-QL-PARSE-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "set_ql_parse_2nd_weight", "SET-QL-PARSE-2ND-WEIGHT", 2, 0, false );
    SubLFiles.declareFunction( me, "ql_parse_cycl", "QL-PARSE-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_parse_weight", "QL-PARSE-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_parse_2nd_weight", "QL-PARSE-2ND-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_parse_equalP", "QL-PARSE-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cycls_for_unindexed_string", "GET-CYCLS-FOR-UNINDEXED-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "preprocess_query_string", "PREPROCESS-QUERY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_cyclify", "QL-CYCLIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "new_ql_lexicon", "NEW-QL-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "ql_postprocess_cyclify_cycl", "QL-POSTPROCESS-CYCLIFY-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_pred_strengthen_sentence", "QL-PRED-STRENGTHEN-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "ql_cyclify_link", "QL-CYCLIFY-LINK", 1, 1, false );
    SubLFiles.declareFunction( me, "convert_instancefns_to_variables", "CONVERT-INSTANCEFNS-TO-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "instancefnP", "INSTANCEFN?", 1, 0, false );
    SubLFiles.declareFunction( me, "var_from_instancefn", "VAR-FROM-INSTANCEFN", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_template_parse_query", "QL-TEMPLATE-PARSE-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "template_parse_complexity_weight", "TEMPLATE-PARSE-COMPLEXITY-WEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "ql_interpret_cycl", "QL-INTERPRET-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "ql_text_answer_query", "QL-TEXT-ANSWER-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "contains_nlrequestfnP", "CONTAINS-NLREQUESTFN?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_kb_parameters", "CLEAR-CAE-KB-PARAMETERS", 0, 0, false );
    SubLFiles.declareFunction( me, "default_inference_parameters_for_task", "DEFAULT-INFERENCE-PARAMETERS-FOR-TASK", 0, 1, false );
    SubLFiles.declareFunction( me, "get_auto_unification_mt", "GET-AUTO-UNIFICATION-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "cae_single_value_task_dependent_query_answer", "CAE-SINGLE-VALUE-TASK-DEPENDENT-QUERY-ANSWER", 2, 2, false );
    SubLFiles.declareFunction( me, "cae_multiple_value_task_dependent_query_answer", "CAE-MULTIPLE-VALUE-TASK-DEPENDENT-QUERY-ANSWER", 2, 2, false );
    SubLFiles.declareFunction( me, "clear_cae_fact_editor_focal_types", "CLEAR-CAE-FACT-EDITOR-FOCAL-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_fact_editor_focal_types", "REMOVE-CAE-FACT-EDITOR-FOCAL-TYPES", 0, 1, false );
    SubLFiles.declareFunction( me, "cae_fact_editor_focal_types_internal", "CAE-FACT-EDITOR-FOCAL-TYPES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_fact_editor_focal_types", "CAE-FACT-EDITOR-FOCAL-TYPES", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_get_default_wff_checking_mt", "CLEAR-GET-DEFAULT-WFF-CHECKING-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_default_wff_checking_mt", "REMOVE-GET-DEFAULT-WFF-CHECKING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_wff_checking_mt_internal", "GET-DEFAULT-WFF-CHECKING-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_wff_checking_mt", "GET-DEFAULT-WFF-CHECKING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_get_default_cae_guidance_mt", "CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_default_cae_guidance_mt", "REMOVE-GET-DEFAULT-CAE-GUIDANCE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_cae_guidance_mt_internal", "GET-DEFAULT-CAE-GUIDANCE-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_cae_guidance_mt", "GET-DEFAULT-CAE-GUIDANCE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_default_wff_checking_mts", "GET-ALL-DEFAULT-WFF-CHECKING-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_query_mt", "CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_query_mt", "REMOVE-QUERY-LIBRARY-DEFAULT-QUERY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_query_mt_internal", "QUERY-LIBRARY-DEFAULT-QUERY-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_query_mt", "QUERY-LIBRARY-DEFAULT-QUERY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_query_search_fact_sheet_links_enabledP", "CLEAR-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_query_search_fact_sheet_links_enabledP", "REMOVE-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_query_search_fact_sheet_links_enabledP_internal", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_query_search_fact_sheet_links_enabledP", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_query_search_fact_sheet_links_enabledP_int", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_rtv_panel_enabled_for_task", "CLEAR-RTV-PANEL-ENABLED-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rtv_panel_enabled_for_task", "REMOVE-RTV-PANEL-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "rtv_panel_enabled_for_task_internal", "RTV-PANEL-ENABLED-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rtv_panel_enabled_for_task", "RTV-PANEL-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "rtv_panel_enabled_for_task_int", "RTV-PANEL-ENABLED-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_document_search_panel_enabled_for_task", "CLEAR-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_document_search_panel_enabled_for_task", "REMOVE-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "document_search_panel_enabled_for_task_internal", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "document_search_panel_enabled_for_task", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "document_search_panel_enabled_for_task_int", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_source_information_enabled_for_task", "CLEAR-SOURCE-INFORMATION-ENABLED-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_source_information_enabled_for_task", "REMOVE-SOURCE-INFORMATION-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "source_information_enabled_for_task_internal", "SOURCE-INFORMATION-ENABLED-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "source_information_enabled_for_task", "SOURCE-INFORMATION-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "source_information_enabled_for_task_int", "SOURCE-INFORMATION-ENABLED-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_irrelevant_results_allowed_for_task", "CLEAR-IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_irrelevant_results_allowed_for_task", "REMOVE-IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "irrelevant_results_allowed_for_task_internal", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "irrelevant_results_allowed_for_task", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "irrelevant_results_allowed_for_task_int", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_report_generation_enabled_for_task", "CLEAR-REPORT-GENERATION-ENABLED-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_report_generation_enabled_for_task", "REMOVE-REPORT-GENERATION-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "report_generation_enabled_for_task_internal", "REPORT-GENERATION-ENABLED-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "report_generation_enabled_for_task", "REPORT-GENERATION-ENABLED-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "report_generation_enabled_for_task_int", "REPORT-GENERATION-ENABLED-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_report_generation_template_root_collection_for_task", "CLEAR-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_report_generation_template_root_collection_for_task", "REMOVE-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "report_generation_template_root_collection_for_task_internal", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "report_generation_template_root_collection_for_task", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "report_generation_template_root_collection_for_task_int", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_task_allows_not", "CLEAR-TASK-ALLOWS-NOT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_task_allows_not", "REMOVE-TASK-ALLOWS-NOT", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_not_internal", "TASK-ALLOWS-NOT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_not", "TASK-ALLOWS-NOT", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_not_int", "TASK-ALLOWS-NOT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_task_allows_implies", "CLEAR-TASK-ALLOWS-IMPLIES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_task_allows_implies", "REMOVE-TASK-ALLOWS-IMPLIES", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_implies_internal", "TASK-ALLOWS-IMPLIES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_implies", "TASK-ALLOWS-IMPLIES", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_implies_int", "TASK-ALLOWS-IMPLIES-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_task_allows_and", "CLEAR-TASK-ALLOWS-AND", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_task_allows_and", "REMOVE-TASK-ALLOWS-AND", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_and_internal", "TASK-ALLOWS-AND-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_and", "TASK-ALLOWS-AND", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_and_int", "TASK-ALLOWS-AND-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_task_allows_or", "CLEAR-TASK-ALLOWS-OR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_task_allows_or", "REMOVE-TASK-ALLOWS-OR", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_or_internal", "TASK-ALLOWS-OR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_or", "TASK-ALLOWS-OR", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_or_int", "TASK-ALLOWS-OR-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_task_allows_unknown_sentence", "CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_task_allows_unknown_sentence", "REMOVE-TASK-ALLOWS-UNKNOWN-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_unknown_sentence_internal", "TASK-ALLOWS-UNKNOWN-SENTENCE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_unknown_sentence", "TASK-ALLOWS-UNKNOWN-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "task_allows_unknown_sentence_int", "TASK-ALLOWS-UNKNOWN-SENTENCE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sparql_browser_urls_for_task", "CLEAR-SPARQL-BROWSER-URLS-FOR-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sparql_browser_urls_for_task", "REMOVE-SPARQL-BROWSER-URLS-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_browser_urls_for_task_internal", "SPARQL-BROWSER-URLS-FOR-TASK-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_browser_urls_for_task", "SPARQL-BROWSER-URLS-FOR-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "sparql_browser_urls_for_task_int", "SPARQL-BROWSER-URLS-FOR-TASK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_root_folder", "CLEAR-QUERY-LIBRARY-ROOT-FOLDER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_root_folder", "REMOVE-QUERY-LIBRARY-ROOT-FOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_root_folder_internal", "QUERY-LIBRARY-ROOT-FOLDER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_root_folder", "QUERY-LIBRARY-ROOT-FOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_should_suggestions_be_intersected", "CLEAR-QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_should_suggestions_be_intersected", "REMOVE-QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_should_suggestions_be_intersected_internal", "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_should_suggestions_be_intersected", "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_transformation_depth", "CLEAR-QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_transformation_depth", "REMOVE-QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_transformation_depth_internal", "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_transformation_depth", "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_compute_answer_justifications", "CLEAR-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_compute_answer_justifications", "REMOVE-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_compute_answer_justifications_internal", "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_compute_answer_justifications", "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_max_time", "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_max_time", "REMOVE-QUERY-LIBRARY-DEFAULT-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_max_time_internal", "QUERY-LIBRARY-DEFAULT-MAX-TIME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_max_time", "QUERY-LIBRARY-DEFAULT-MAX-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_max_productivity", "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_max_productivity", "REMOVE-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_max_productivity_internal", "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_max_productivity", "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_new_terms_allowed", "CLEAR-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_new_terms_allowed", "REMOVE-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_new_terms_allowed_internal", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_new_terms_allowed", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_new_terms_allowed_int", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_allow_arbitrary_assertion_deletion", "CLEAR-ALLOW-ARBITRARY-ASSERTION-DELETION", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_allow_arbitrary_assertion_deletion", "REMOVE-ALLOW-ARBITRARY-ASSERTION-DELETION", 1, 0, false );
    SubLFiles.declareFunction( me, "allow_arbitrary_assertion_deletion_internal", "ALLOW-ARBITRARY-ASSERTION-DELETION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "allow_arbitrary_assertion_deletion", "ALLOW-ARBITRARY-ASSERTION-DELETION", 1, 0, false );
    SubLFiles.declareFunction( me, "allow_arbitrary_assertion_deletion_int", "ALLOW-ARBITRARY-ASSERTION-DELETION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_indeterminate_terms_allowed", "CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_indeterminate_terms_allowed", "REMOVE-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_indeterminate_terms_allowed_internal", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_indeterminate_terms_allowed", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_indeterminate_terms_allowed_int", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_default_disjunction_free_el_vars_policy", "CLEAR-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_default_disjunction_free_el_vars_policy", "REMOVE-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_disjunction_free_el_vars_policy_internal", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_disjunction_free_el_vars_policy", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_default_disjunction_free_el_vars_policy_int", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_query_search_filter", "CLEAR-CAE-QUERY-SEARCH-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_query_search_filter", "REMOVE-CAE-QUERY-SEARCH-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_filter_internal", "CAE-QUERY-SEARCH-FILTER-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_filter", "CAE-QUERY-SEARCH-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_query_search_filter_specification", "CLEAR-CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_query_search_filter_specification", "REMOVE-CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_filter_specification_internal", "CAE-QUERY-SEARCH-FILTER-SPECIFICATION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_filter_specification", "CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_query_search_filter_string", "CLEAR-CAE-QUERY-SEARCH-FILTER-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_query_search_filter_string", "REMOVE-CAE-QUERY-SEARCH-FILTER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_filter_string_internal", "CAE-QUERY-SEARCH-FILTER-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_filter_string", "CAE-QUERY-SEARCH-FILTER-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_query_search_term_classification_tree", "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_query_search_term_classification_tree", "REMOVE-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_term_classification_tree_internal", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_term_classification_tree", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_query_search_term_classification_tree_collections", "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_query_search_term_classification_tree_collections", "REMOVE-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_term_classification_tree_collections_internal", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_query_search_term_classification_tree_collections", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_default_paraphrase_mt", "CLEAR-CAE-DEFAULT-PARAPHRASE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_default_paraphrase_mt", "REMOVE-CAE-DEFAULT-PARAPHRASE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_default_paraphrase_mt_internal", "CAE-DEFAULT-PARAPHRASE-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_default_paraphrase_mt", "CAE-DEFAULT-PARAPHRASE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_default_parsing_mt", "CLEAR-CAE-DEFAULT-PARSING-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_default_parsing_mt", "REMOVE-CAE-DEFAULT-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_default_parsing_mt_internal", "CAE-DEFAULT-PARSING-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_default_parsing_mt", "CAE-DEFAULT-PARSING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_default_nl_domain_mt", "CLEAR-CAE-DEFAULT-NL-DOMAIN-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_default_nl_domain_mt", "REMOVE-CAE-DEFAULT-NL-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_default_nl_domain_mt_internal", "CAE-DEFAULT-NL-DOMAIN-MT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_default_nl_domain_mt", "CAE-DEFAULT-NL-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_get_nl_mts_from_task", "CAE-GET-NL-MTS-FROM-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_get_cae_mts_from_task", "CAE-GET-CAE-MTS-FROM-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cae_topic", "CLEAR-CAE-TOPIC", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cae_topic", "REMOVE-CAE-TOPIC", 0, 1, false );
    SubLFiles.declareFunction( me, "cae_topic_internal", "CAE-TOPIC-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cae_topic", "CAE-TOPIC", 0, 1, false );
    SubLFiles.declareFunction( me, "cae_task_topic_changed", "CAE-TASK-TOPIC-CHANGED", 2, 0, false );
    SubLFiles.declareFunction( me, "store_original_string_for_template_id", "STORE-ORIGINAL-STRING-FOR-TEMPLATE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_original_string_for_query", "GET-ORIGINAL-STRING-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "parsed_query_template_p", "PARSED-QUERY-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_query_id", "NEW-QUERY-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "next_query_id", "NEXT-QUERY-ID", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_query_library_template_forward_rules", "CLEAR-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_query_library_template_forward_rules", "REMOVE-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_template_forward_rules_internal", "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "query_library_template_forward_rules", "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_query_template_and_query", "KILL-QUERY-TEMPLATE-AND-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_query_library", "KILL-QUERY-LIBRARY", 1, 0, false );
    SubLFiles.declareFunction( me, "pred_strengthen_unambiguously_test", "PRED-STRENGTHEN-UNAMBIGUOUSLY-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cycls_for_unindexed_string_tct", "GET-CYCLS-FOR-UNINDEXED-STRING-TCT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_query_library_utils_file()
  {
    $registered_ql_parsers$ = SubLFiles.defparameter( "*REGISTERED-QL-PARSERS*", $list0 );
    $ql_default_mt$ = SubLFiles.defparameter( "*QL-DEFAULT-MT*", $list1 );
    $ql_default_parsed_query_properties$ = SubLFiles.defparameter( "*QL-DEFAULT-PARSED-QUERY-PROPERTIES*", $list2 );
    $ql_default_parsers$ = SubLFiles.defparameter( "*QL-DEFAULT-PARSERS*", red_infrastructure_macros.red_def_helper( $list3.isSymbol() ? Symbols.symbol_value( $list3 ) : $list3, $sym4$_QL_DEFAULT_PARSERS_,
        $str5$330D840A0F844359434C0A0F8445424D5.isSymbol() ? Symbols.symbol_value( $str5$330D840A0F844359434C0A0F8445424D5 ) : $str5$330D840A0F844359434C0A0F8445424D5, $kw6$PARAMETER, UNPROVIDED ) );
    $new_vars$ = SubLFiles.defparameter( "*NEW-VARS*", $str57$what_new_vars_were_created_by_con );
    $template_parse_complexity_weight_factor$ = SubLFiles.defparameter( "*TEMPLATE-PARSE-COMPLEXITY-WEIGHT-FACTOR*", $float64$0_9 );
    $cae_fact_editor_focal_types_caching_state$ = SubLFiles.deflexical( "*CAE-FACT-EDITOR-FOCAL-TYPES-CACHING-STATE*", NIL );
    $get_default_wff_checking_mt_caching_state$ = SubLFiles.deflexical( "*GET-DEFAULT-WFF-CHECKING-MT-CACHING-STATE*", NIL );
    $get_default_cae_guidance_mt_caching_state$ = SubLFiles.deflexical( "*GET-DEFAULT-CAE-GUIDANCE-MT-CACHING-STATE*", NIL );
    $query_library_default_query_mt_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-QUERY-MT-CACHING-STATE*", NIL );
    $query_library_query_search_fact_sheet_links_enabledP_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*", NIL );
    $rtv_panel_enabled_for_task_caching_state$ = SubLFiles.deflexical( "*RTV-PANEL-ENABLED-FOR-TASK-CACHING-STATE*", NIL );
    $document_search_panel_enabled_for_task_caching_state$ = SubLFiles.deflexical( "*DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-CACHING-STATE*", NIL );
    $source_information_enabled_for_task_caching_state$ = SubLFiles.deflexical( "*SOURCE-INFORMATION-ENABLED-FOR-TASK-CACHING-STATE*", NIL );
    $irrelevant_results_allowed_for_task_caching_state$ = SubLFiles.deflexical( "*IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-CACHING-STATE*", NIL );
    $report_generation_enabled_for_task_caching_state$ = SubLFiles.deflexical( "*REPORT-GENERATION-ENABLED-FOR-TASK-CACHING-STATE*", NIL );
    $report_generation_template_root_collection_for_task_caching_state$ = SubLFiles.deflexical( "*REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-CACHING-STATE*", NIL );
    $task_allows_not_caching_state$ = SubLFiles.deflexical( "*TASK-ALLOWS-NOT-CACHING-STATE*", NIL );
    $task_allows_implies_caching_state$ = SubLFiles.deflexical( "*TASK-ALLOWS-IMPLIES-CACHING-STATE*", NIL );
    $task_allows_and_caching_state$ = SubLFiles.deflexical( "*TASK-ALLOWS-AND-CACHING-STATE*", NIL );
    $task_allows_or_caching_state$ = SubLFiles.deflexical( "*TASK-ALLOWS-OR-CACHING-STATE*", NIL );
    $task_allows_unknown_sentence_caching_state$ = SubLFiles.deflexical( "*TASK-ALLOWS-UNKNOWN-SENTENCE-CACHING-STATE*", NIL );
    $sparql_browser_urls_for_task_caching_state$ = SubLFiles.deflexical( "*SPARQL-BROWSER-URLS-FOR-TASK-CACHING-STATE*", NIL );
    $query_library_root_folder_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-ROOT-FOLDER-CACHING-STATE*", NIL );
    $query_library_should_suggestions_be_intersected_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-CACHING-STATE*", NIL );
    $query_library_default_transformation_depth_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-CACHING-STATE*", NIL );
    $query_library_default_compute_answer_justifications_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-CACHING-STATE*", NIL );
    $query_library_default_max_time_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-MAX-TIME-CACHING-STATE*", NIL );
    $query_library_default_max_productivity_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-CACHING-STATE*", NIL );
    $query_library_default_new_terms_allowed_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-CACHING-STATE*", NIL );
    $allow_arbitrary_assertion_deletion_caching_state$ = SubLFiles.deflexical( "*ALLOW-ARBITRARY-ASSERTION-DELETION-CACHING-STATE*", NIL );
    $query_library_default_indeterminate_terms_allowed_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-CACHING-STATE*", NIL );
    $query_library_default_disjunction_free_el_vars_policy_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-CACHING-STATE*", NIL );
    $cae_query_search_filter_caching_state$ = SubLFiles.deflexical( "*CAE-QUERY-SEARCH-FILTER-CACHING-STATE*", NIL );
    $cae_query_search_filter_specification_caching_state$ = SubLFiles.deflexical( "*CAE-QUERY-SEARCH-FILTER-SPECIFICATION-CACHING-STATE*", NIL );
    $cae_query_search_filter_string_caching_state$ = SubLFiles.deflexical( "*CAE-QUERY-SEARCH-FILTER-STRING-CACHING-STATE*", NIL );
    $cae_query_search_term_classification_tree_caching_state$ = SubLFiles.deflexical( "*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-CACHING-STATE*", NIL );
    $cae_query_search_term_classification_tree_collections_caching_state$ = SubLFiles.deflexical( "*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-CACHING-STATE*", NIL );
    $cae_default_paraphrase_mt_caching_state$ = SubLFiles.deflexical( "*CAE-DEFAULT-PARAPHRASE-MT-CACHING-STATE*", NIL );
    $cae_default_parsing_mt_caching_state$ = SubLFiles.deflexical( "*CAE-DEFAULT-PARSING-MT-CACHING-STATE*", NIL );
    $cae_default_nl_domain_mt_caching_state$ = SubLFiles.deflexical( "*CAE-DEFAULT-NL-DOMAIN-MT-CACHING-STATE*", NIL );
    $cae_topic_caching_state$ = SubLFiles.deflexical( "*CAE-TOPIC-CACHING-STATE*", NIL );
    $original_query_strings$ = SubLFiles.defparameter( "*ORIGINAL-QUERY-STRINGS*", dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    $latest_query_id$ = SubLFiles.defparameter( "*LATEST-QUERY-ID*", ZERO_INTEGER );
    $query_library_template_forward_rules_caching_state$ = SubLFiles.deflexical( "*QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_query_library_utils_file()
  {
    access_macros.register_external_symbol( $sym7$LOG_QUERY_LIBRARY_SEARCH );
    access_macros.define_obsolete_register( $sym17$UNINDEXED_QUERIES_FROM_STRING, $list18 );
    access_macros.register_external_symbol( $sym21$UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES );
    access_macros.register_external_symbol( $sym28$REGISTER_ALL_QUERY_LIBRARY_PARSERS );
    access_macros.register_external_symbol( $sym35$REGISTER_DEFAULT_QL_PARSERS );
    access_macros.register_external_symbol( $sym75$GET_AUTO_UNIFICATION_MT );
    memoization_state.note_globally_cached_function( $sym78$CAE_FACT_EDITOR_FOCAL_TYPES );
    memoization_state.note_globally_cached_function( $sym82$GET_DEFAULT_WFF_CHECKING_MT );
    access_macros.register_external_symbol( $sym82$GET_DEFAULT_WFF_CHECKING_MT );
    memoization_state.note_globally_cached_function( $sym87$GET_DEFAULT_CAE_GUIDANCE_MT );
    access_macros.register_external_symbol( $sym87$GET_DEFAULT_CAE_GUIDANCE_MT );
    memoization_state.note_globally_cached_function( $sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT );
    access_macros.register_external_symbol( $sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT );
    memoization_state.note_globally_cached_function( $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_ );
    access_macros.register_external_symbol( $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_ );
    memoization_state.note_globally_cached_function( $sym102$RTV_PANEL_ENABLED_FOR_TASK );
    access_macros.register_external_symbol( $sym102$RTV_PANEL_ENABLED_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK );
    access_macros.register_external_symbol( $sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK );
    access_macros.register_external_symbol( $sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK );
    access_macros.register_external_symbol( $sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym116$REPORT_GENERATION_ENABLED_FOR_TASK );
    access_macros.register_external_symbol( $sym116$REPORT_GENERATION_ENABLED_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK );
    access_macros.register_external_symbol( $sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym124$TASK_ALLOWS_NOT );
    access_macros.register_external_symbol( $sym124$TASK_ALLOWS_NOT );
    memoization_state.note_globally_cached_function( $sym127$TASK_ALLOWS_IMPLIES );
    access_macros.register_external_symbol( $sym127$TASK_ALLOWS_IMPLIES );
    memoization_state.note_globally_cached_function( $sym130$TASK_ALLOWS_AND );
    access_macros.register_external_symbol( $sym130$TASK_ALLOWS_AND );
    memoization_state.note_globally_cached_function( $sym133$TASK_ALLOWS_OR );
    access_macros.register_external_symbol( $sym133$TASK_ALLOWS_OR );
    memoization_state.note_globally_cached_function( $sym136$TASK_ALLOWS_UNKNOWN_SENTENCE );
    access_macros.register_external_symbol( $sym136$TASK_ALLOWS_UNKNOWN_SENTENCE );
    memoization_state.note_globally_cached_function( $sym139$SPARQL_BROWSER_URLS_FOR_TASK );
    access_macros.register_external_symbol( $sym139$SPARQL_BROWSER_URLS_FOR_TASK );
    memoization_state.note_globally_cached_function( $sym144$QUERY_LIBRARY_ROOT_FOLDER );
    access_macros.register_external_symbol( $sym144$QUERY_LIBRARY_ROOT_FOLDER );
    memoization_state.note_globally_cached_function( $sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED );
    access_macros.register_external_symbol( $sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED );
    memoization_state.note_globally_cached_function( $sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH );
    access_macros.register_external_symbol( $sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH );
    memoization_state.note_globally_cached_function( $sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS );
    access_macros.register_external_symbol( $sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS );
    memoization_state.note_globally_cached_function( $sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME );
    access_macros.register_external_symbol( $sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME );
    memoization_state.note_globally_cached_function( $sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY );
    access_macros.register_external_symbol( $sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY );
    memoization_state.note_globally_cached_function( $sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED );
    access_macros.register_external_symbol( $sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED );
    memoization_state.note_globally_cached_function( $sym168$ALLOW_ARBITRARY_ASSERTION_DELETION );
    access_macros.register_external_symbol( $sym168$ALLOW_ARBITRARY_ASSERTION_DELETION );
    memoization_state.note_globally_cached_function( $sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED );
    access_macros.register_external_symbol( $sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED );
    memoization_state.note_globally_cached_function( $sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY );
    access_macros.register_external_symbol( $sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY );
    memoization_state.note_globally_cached_function( $sym177$CAE_QUERY_SEARCH_FILTER );
    memoization_state.note_globally_cached_function( $sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION );
    memoization_state.note_globally_cached_function( $sym183$CAE_QUERY_SEARCH_FILTER_STRING );
    access_macros.register_external_symbol( $sym183$CAE_QUERY_SEARCH_FILTER_STRING );
    memoization_state.note_globally_cached_function( $sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE );
    access_macros.register_external_symbol( $sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE );
    memoization_state.note_globally_cached_function( $sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS );
    access_macros.register_external_symbol( $sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS );
    memoization_state.note_globally_cached_function( $sym194$CAE_DEFAULT_PARAPHRASE_MT );
    access_macros.register_external_symbol( $sym194$CAE_DEFAULT_PARAPHRASE_MT );
    memoization_state.note_globally_cached_function( $sym198$CAE_DEFAULT_PARSING_MT );
    access_macros.register_external_symbol( $sym198$CAE_DEFAULT_PARSING_MT );
    memoization_state.note_globally_cached_function( $sym202$CAE_DEFAULT_NL_DOMAIN_MT );
    access_macros.register_external_symbol( $sym202$CAE_DEFAULT_NL_DOMAIN_MT );
    access_macros.register_external_symbol( $sym205$CAE_GET_NL_MTS_FROM_TASK );
    access_macros.register_external_symbol( $sym206$CAE_GET_CAE_MTS_FROM_TASK );
    memoization_state.note_globally_cached_function( $sym207$CAE_TOPIC );
    access_macros.register_external_symbol( $sym207$CAE_TOPIC );
    utilities_macros.register_kb_function( $sym214$CAE_TASK_TOPIC_CHANGED );
    access_macros.register_external_symbol( $sym216$NEW_QUERY_ID );
    memoization_state.note_globally_cached_function( $sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES );
    access_macros.register_external_symbol( $sym224$KILL_QUERY_TEMPLATE_AND_QUERY );
    access_macros.register_external_symbol( $sym226$KILL_QUERY_LIBRARY );
    generic_testing.define_test_case_table_int( $sym228$QL_PRED_STRENGTHEN_SENTENCE, ConsesLow.list( new SubLObject[] { $kw229$TEST, NIL, $kw230$OWNER, NIL, $kw231$CLASSES, NIL, $kw232$KB, $kw233$FULL, $kw234$WORKING_, T
    } ), $list235 );
    generic_testing.define_test_case_table_int( $sym236$TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY, ConsesLow.list( new SubLObject[] { $kw229$TEST, $sym237$PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST, $kw230$OWNER, NIL,
      $kw231$CLASSES, NIL, $kw232$KB, $kw233$FULL, $kw234$WORKING_, T
    } ), $list238 );
    generic_testing.define_test_case_table_int( $sym239$GET_CYCLS_FOR_UNINDEXED_STRING_TCT, ConsesLow.list( new SubLObject[] { $kw229$TEST, EQ, $kw230$OWNER, NIL, $kw231$CLASSES, NIL, $kw232$KB, $kw233$FULL,
      $kw234$WORKING_, NIL
    } ), $list240 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_query_library_utils_file();
  }

  @Override
  public void initializeVariables()
  {
    init_query_library_utils_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_query_library_utils_file();
  }
  static
  {
    me = new query_library_utils();
    $registered_ql_parsers$ = null;
    $ql_default_mt$ = null;
    $ql_default_parsed_query_properties$ = null;
    $ql_default_parsers$ = null;
    $new_vars$ = null;
    $template_parse_complexity_weight_factor$ = null;
    $cae_fact_editor_focal_types_caching_state$ = null;
    $get_default_wff_checking_mt_caching_state$ = null;
    $get_default_cae_guidance_mt_caching_state$ = null;
    $query_library_default_query_mt_caching_state$ = null;
    $query_library_query_search_fact_sheet_links_enabledP_caching_state$ = null;
    $rtv_panel_enabled_for_task_caching_state$ = null;
    $document_search_panel_enabled_for_task_caching_state$ = null;
    $source_information_enabled_for_task_caching_state$ = null;
    $irrelevant_results_allowed_for_task_caching_state$ = null;
    $report_generation_enabled_for_task_caching_state$ = null;
    $report_generation_template_root_collection_for_task_caching_state$ = null;
    $task_allows_not_caching_state$ = null;
    $task_allows_implies_caching_state$ = null;
    $task_allows_and_caching_state$ = null;
    $task_allows_or_caching_state$ = null;
    $task_allows_unknown_sentence_caching_state$ = null;
    $sparql_browser_urls_for_task_caching_state$ = null;
    $query_library_root_folder_caching_state$ = null;
    $query_library_should_suggestions_be_intersected_caching_state$ = null;
    $query_library_default_transformation_depth_caching_state$ = null;
    $query_library_default_compute_answer_justifications_caching_state$ = null;
    $query_library_default_max_time_caching_state$ = null;
    $query_library_default_max_productivity_caching_state$ = null;
    $query_library_default_new_terms_allowed_caching_state$ = null;
    $allow_arbitrary_assertion_deletion_caching_state$ = null;
    $query_library_default_indeterminate_terms_allowed_caching_state$ = null;
    $query_library_default_disjunction_free_el_vars_policy_caching_state$ = null;
    $cae_query_search_filter_caching_state$ = null;
    $cae_query_search_filter_specification_caching_state$ = null;
    $cae_query_search_filter_string_caching_state$ = null;
    $cae_query_search_term_classification_tree_caching_state$ = null;
    $cae_query_search_term_classification_tree_collections_caching_state$ = null;
    $cae_default_paraphrase_mt_caching_state$ = null;
    $cae_default_parsing_mt_caching_state$ = null;
    $cae_default_nl_domain_mt_caching_state$ = null;
    $cae_topic_caching_state$ = null;
    $original_query_strings$ = null;
    $latest_query_id$ = null;
    $query_library_template_forward_rules_caching_state$ = null;
    $list0 = ConsesLow.list( makeKeyword( "CYCL" ) );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "TKBSourceSpindleCollectorMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "AnytimePSC" ) ) );
    $list2 = ConsesLow.list( makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), T, makeKeyword( "NEW-TERMS-ALLOWED?" ), T, makeKeyword( "MAX-TIME" ), makeInteger( 60 ) );
    $list3 = ConsesLow.list( makeString( "application.ql.default-parsers" ) );
    $sym4$_QL_DEFAULT_PARSERS_ = makeSymbol( "*QL-DEFAULT-PARSERS*" );
    $str5$330D840A0F844359434C0A0F8445424D5 = makeString( "330D840A0F844359434C0A0F8445424D540A0F8C4359434C4946592D4C494E4B0A0F874359434C494659" );
    $kw6$PARAMETER = makeKeyword( "PARAMETER" );
    $sym7$LOG_QUERY_LIBRARY_SEARCH = makeSymbol( "LOG-QUERY-LIBRARY-SEARCH" );
    $str8$UserSearch_ = makeString( "UserSearch-" );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SearchingForACycLTerm" ) ) );
    $const11$searchStringsUsed = constant_handles.reader_make_constant_shell( makeString( "searchStringsUsed" ) );
    $const12$performedBy = constant_handles.reader_make_constant_shell( makeString( "performedBy" ) );
    $const13$dateOfEvent = constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) );
    $list14 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IndexicalReferentFn-EvaluateAtEL" ) ), constant_handles.reader_make_constant_shell( makeString(
        "Now-Indexical" ) ) ) );
    $const15$properSubEvents = constant_handles.reader_make_constant_shell( makeString( "properSubEvents" ) );
    $const16$WorkEventOnSpecificationFn = constant_handles.reader_make_constant_shell( makeString( "WorkEventOnSpecificationFn" ) );
    $sym17$UNINDEXED_QUERIES_FROM_STRING = makeSymbol( "UNINDEXED-QUERIES-FROM-STRING" );
    $list18 = ConsesLow.list( makeSymbol( "UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES" ) );
    $sym19$QL_PARSE_CYCL = makeSymbol( "QL-PARSE-CYCL" );
    $kw20$INTERROGATIVE = makeKeyword( "INTERROGATIVE" );
    $sym21$UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES = makeSymbol( "UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES" );
    $kw22$XML = makeKeyword( "XML" );
    $kw23$WEIGHT = makeKeyword( "WEIGHT" );
    $kw24$2ND_WEIGHT = makeKeyword( "2ND-WEIGHT" );
    $kw25$OFFSET = makeKeyword( "OFFSET" );
    $kw26$END = makeKeyword( "END" );
    $kw27$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $sym28$REGISTER_ALL_QUERY_LIBRARY_PARSERS = makeSymbol( "REGISTER-ALL-QUERY-LIBRARY-PARSERS" );
    $kw29$CYCLIFY = makeKeyword( "CYCLIFY" );
    $kw30$CYCLIFY_LINK = makeKeyword( "CYCLIFY-LINK" );
    $kw31$RTP = makeKeyword( "RTP" );
    $kw32$TEXT_ANSWERS = makeKeyword( "TEXT-ANSWERS" );
    $kw33$TEXT_ANSWERS_LAST_RESORT = makeKeyword( "TEXT-ANSWERS-LAST-RESORT" );
    $kw34$EBMT = makeKeyword( "EBMT" );
    $sym35$REGISTER_DEFAULT_QL_PARSERS = makeSymbol( "REGISTER-DEFAULT-QL-PARSERS" );
    $kw36$CYCL = makeKeyword( "CYCL" );
    $sym37$QL_PARSE_EQUAL_ = makeSymbol( "QL-PARSE-EQUAL?" );
    $sym38$_ = makeSymbol( ">" );
    $sym39$QL_PARSE_WEIGHT = makeSymbol( "QL-PARSE-WEIGHT" );
    $str40$and = makeString( "and" );
    $str41$what = makeString( "what" );
    $sym42$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list43 = ConsesLow.cons( makeSymbol( "RAW-CYCL" ), makeSymbol( "WEIGHT" ) );
    $kw44$OUTPUT = makeKeyword( "OUTPUT" );
    $kw45$VERBOSE = makeKeyword( "VERBOSE" );
    $kw46$SCORE_FUNCTION = makeKeyword( "SCORE-FUNCTION" );
    $sym47$CYCLIFICATION_COVERAGE = makeSymbol( "CYCLIFICATION-COVERAGE" );
    $kw48$LEXICON = makeKeyword( "LEXICON" );
    $kw49$PARSER = makeKeyword( "PARSER" );
    $str50$caught_error__S_while_link_parsin = makeString( "caught error ~S while link-parsing ~S~%" );
    $sym51$CYCLIFIER_LEXICON_W_O_FABRICATION = makeSymbol( "CYCLIFIER-LEXICON-W/O-FABRICATION" );
    $sym52$FORBID_MT = makeSymbol( "FORBID-MT" );
    $const53$NameLexicalMt = constant_handles.reader_make_constant_shell( makeString( "NameLexicalMt" ) );
    $const54$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw55$WARN = makeKeyword( "WARN" );
    $list56 = ConsesLow.cons( makeSymbol( "RAW-PARSE" ), makeSymbol( "WEIGHT" ) );
    $str57$what_new_vars_were_created_by_con = makeString( "what new vars were created by convert-instancefns-to-variables" );
    $sym58$INSTANCEFN_ = makeSymbol( "INSTANCEFN?" );
    $sym59$VAR_FROM_INSTANCEFN = makeSymbol( "VAR-FROM-INSTANCEFN" );
    $const60$InstanceFn = constant_handles.reader_make_constant_shell( makeString( "InstanceFn" ) );
    $const61$RKFParsingMt = constant_handles.reader_make_constant_shell( makeString( "RKFParsingMt" ) );
    $const62$playsActiveSubjectRole = constant_handles.reader_make_constant_shell( makeString( "playsActiveSubjectRole" ) );
    $sym63$QL_PARSE_2ND_WEIGHT = makeSymbol( "QL-PARSE-2ND-WEIGHT" );
    $float64$0_9 = makeDouble( 0.9 );
    $const65$textAnswer = constant_handles.reader_make_constant_shell( makeString( "textAnswer" ) );
    $list66 = ConsesLow.list( makeSymbol( "?ANSWER" ) );
    $const67$NLRequestFn = constant_handles.reader_make_constant_shell( makeString( "NLRequestFn" ) );
    $kw68$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw69$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw70$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw71$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw72$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw73$PRODUCTIVITY_LIMIT = makeKeyword( "PRODUCTIVITY-LIMIT" );
    $kw74$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $sym75$GET_AUTO_UNIFICATION_MT = makeSymbol( "GET-AUTO-UNIFICATION-MT" );
    $list76 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "BROWSABLE?" ), NIL );
    $list77 = ConsesLow.list( makeKeyword( "BROWSABLE?" ), NIL );
    $sym78$CAE_FACT_EDITOR_FOCAL_TYPES = makeSymbol( "CAE-FACT-EDITOR-FOCAL-TYPES" );
    $const79$CAEFactEditorFocalTypeQuery = constant_handles.reader_make_constant_shell( makeString( "CAEFactEditorFocalTypeQuery" ) );
    $sym80$_TEMPLATE = makeSymbol( "?TEMPLATE" );
    $sym81$_CAE_FACT_EDITOR_FOCAL_TYPES_CACHING_STATE_ = makeSymbol( "*CAE-FACT-EDITOR-FOCAL-TYPES-CACHING-STATE*" );
    $sym82$GET_DEFAULT_WFF_CHECKING_MT = makeSymbol( "GET-DEFAULT-WFF-CHECKING-MT" );
    $const83$CAEWFFCheckingMtQuery = constant_handles.reader_make_constant_shell( makeString( "CAEWFFCheckingMtQuery" ) );
    $sym84$_MT = makeSymbol( "?MT" );
    $const85$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym86$_GET_DEFAULT_WFF_CHECKING_MT_CACHING_STATE_ = makeSymbol( "*GET-DEFAULT-WFF-CHECKING-MT-CACHING-STATE*" );
    $sym87$GET_DEFAULT_CAE_GUIDANCE_MT = makeSymbol( "GET-DEFAULT-CAE-GUIDANCE-MT" );
    $const88$CAEGuidanceMtQuery = constant_handles.reader_make_constant_shell( makeString( "CAEGuidanceMtQuery" ) );
    $sym89$_GET_DEFAULT_CAE_GUIDANCE_MT_CACHING_STATE_ = makeSymbol( "*GET-DEFAULT-CAE-GUIDANCE-MT-CACHING-STATE*" );
    $sym90$CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT = makeSymbol( "CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT" );
    $list91 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "defaultWellformednessCheckingMt" ) ), makeSymbol( "?SPECIFICATION" ), makeSymbol( "?MT" ) );
    $const92$CycArchitectureMt = constant_handles.reader_make_constant_shell( makeString( "CycArchitectureMt" ) );
    $list93 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT = makeSymbol( "QUERY-LIBRARY-DEFAULT-QUERY-MT" );
    $const95$CAEDefaultQueryMtQuery = constant_handles.reader_make_constant_shell( makeString( "CAEDefaultQueryMtQuery" ) );
    $sym96$_QUERY_LIBRARY_DEFAULT_QUERY_MT_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-DEFAULT-QUERY-MT-CACHING-STATE*" );
    $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_ = makeSymbol( "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?" );
    $const98$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA = makeSymbol( "*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*" );
    $const100$CAEQuerySearchFactSheetLinksEnabl = constant_handles.reader_make_constant_shell( makeString( "CAEQuerySearchFactSheetLinksEnabledQuery" ) );
    $sym101$_VALUE = makeSymbol( "?VALUE" );
    $sym102$RTV_PANEL_ENABLED_FOR_TASK = makeSymbol( "RTV-PANEL-ENABLED-FOR-TASK" );
    $sym103$_RTV_PANEL_ENABLED_FOR_TASK_CACHING_STATE_ = makeSymbol( "*RTV-PANEL-ENABLED-FOR-TASK-CACHING-STATE*" );
    $const104$CAERTVPanelEnabledQuery = constant_handles.reader_make_constant_shell( makeString( "CAERTVPanelEnabledQuery" ) );
    $sym105$_TV = makeSymbol( "?TV" );
    $sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK = makeSymbol( "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK" );
    $sym107$_DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK_CACHING_STATE_ = makeSymbol( "*DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-CACHING-STATE*" );
    $const108$CAETextSearchPanelEnabledQuery = constant_handles.reader_make_constant_shell( makeString( "CAETextSearchPanelEnabledQuery" ) );
    $sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK = makeSymbol( "SOURCE-INFORMATION-ENABLED-FOR-TASK" );
    $sym110$_SOURCE_INFORMATION_ENABLED_FOR_TASK_CACHING_STATE_ = makeSymbol( "*SOURCE-INFORMATION-ENABLED-FOR-TASK-CACHING-STATE*" );
    $const111$CAESourceInformationEnabledQuery = constant_handles.reader_make_constant_shell( makeString( "CAESourceInformationEnabledQuery" ) );
    $sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK = makeSymbol( "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK" );
    $sym113$_IRRELEVANT_RESULTS_ALLOWED_FOR_TASK_CACHING_STATE_ = makeSymbol( "*IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-CACHING-STATE*" );
    $const114$CAEIrrelevantTermAllowedQuery = constant_handles.reader_make_constant_shell( makeString( "CAEIrrelevantTermAllowedQuery" ) );
    $const115$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $sym116$REPORT_GENERATION_ENABLED_FOR_TASK = makeSymbol( "REPORT-GENERATION-ENABLED-FOR-TASK" );
    $sym117$_REPORT_GENERATION_ENABLED_FOR_TASK_CACHING_STATE_ = makeSymbol( "*REPORT-GENERATION-ENABLED-FOR-TASK-CACHING-STATE*" );
    $const118$CAEReportGenerationEnabledQuery = constant_handles.reader_make_constant_shell( makeString( "CAEReportGenerationEnabledQuery" ) );
    $sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK = makeSymbol( "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK" );
    $sym120$_REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK_CACHING_STAT = makeSymbol( "*REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-CACHING-STATE*" );
    $const121$CAEReportGenerationTemplateRootCo = constant_handles.reader_make_constant_shell( makeString( "CAEReportGenerationTemplateRootCollectionQuery" ) );
    $const122$ReportGenerationTemplate = constant_handles.reader_make_constant_shell( makeString( "ReportGenerationTemplate" ) );
    $sym123$_COL = makeSymbol( "?COL" );
    $sym124$TASK_ALLOWS_NOT = makeSymbol( "TASK-ALLOWS-NOT" );
    $sym125$_TASK_ALLOWS_NOT_CACHING_STATE_ = makeSymbol( "*TASK-ALLOWS-NOT-CACHING-STATE*" );
    $const126$CAEAllowsNotQuery = constant_handles.reader_make_constant_shell( makeString( "CAEAllowsNotQuery" ) );
    $sym127$TASK_ALLOWS_IMPLIES = makeSymbol( "TASK-ALLOWS-IMPLIES" );
    $sym128$_TASK_ALLOWS_IMPLIES_CACHING_STATE_ = makeSymbol( "*TASK-ALLOWS-IMPLIES-CACHING-STATE*" );
    $const129$CAEAllowsImpliesQuery = constant_handles.reader_make_constant_shell( makeString( "CAEAllowsImpliesQuery" ) );
    $sym130$TASK_ALLOWS_AND = makeSymbol( "TASK-ALLOWS-AND" );
    $sym131$_TASK_ALLOWS_AND_CACHING_STATE_ = makeSymbol( "*TASK-ALLOWS-AND-CACHING-STATE*" );
    $const132$CAEAllowsAndQuery = constant_handles.reader_make_constant_shell( makeString( "CAEAllowsAndQuery" ) );
    $sym133$TASK_ALLOWS_OR = makeSymbol( "TASK-ALLOWS-OR" );
    $sym134$_TASK_ALLOWS_OR_CACHING_STATE_ = makeSymbol( "*TASK-ALLOWS-OR-CACHING-STATE*" );
    $const135$CAEAllowsOrQuery = constant_handles.reader_make_constant_shell( makeString( "CAEAllowsOrQuery" ) );
    $sym136$TASK_ALLOWS_UNKNOWN_SENTENCE = makeSymbol( "TASK-ALLOWS-UNKNOWN-SENTENCE" );
    $sym137$_TASK_ALLOWS_UNKNOWN_SENTENCE_CACHING_STATE_ = makeSymbol( "*TASK-ALLOWS-UNKNOWN-SENTENCE-CACHING-STATE*" );
    $const138$CAEAllowsUnknownSentenceQuery = constant_handles.reader_make_constant_shell( makeString( "CAEAllowsUnknownSentenceQuery" ) );
    $sym139$SPARQL_BROWSER_URLS_FOR_TASK = makeSymbol( "SPARQL-BROWSER-URLS-FOR-TASK" );
    $sym140$_SPARQL_BROWSER_URLS_FOR_TASK_CACHING_STATE_ = makeSymbol( "*SPARQL-BROWSER-URLS-FOR-TASK-CACHING-STATE*" );
    $const141$CAESPARQLBrowserAddressQuery = constant_handles.reader_make_constant_shell( makeString( "CAESPARQLBrowserAddressQuery" ) );
    $sym142$URL_STRING = makeSymbol( "URL-STRING" );
    $sym143$_URL = makeSymbol( "?URL" );
    $sym144$QUERY_LIBRARY_ROOT_FOLDER = makeSymbol( "QUERY-LIBRARY-ROOT-FOLDER" );
    $const145$CAEQueryLibraryRootFolderQuery = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryRootFolderQuery" ) );
    $sym146$_QUERY_LIBRARY_ROOT_FOLDER_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-ROOT-FOLDER-CACHING-STATE*" );
    $sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED = makeSymbol( "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED" );
    $const148$CAEQueryLibraryShouldSuggestionsB = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryShouldSuggestionsBeIntersectedQuery" ) );
    $sym149$_TRUTH = makeSymbol( "?TRUTH" );
    $sym150$_QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-CACHING-STATE*" );
    $sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH = makeSymbol( "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH" );
    $const152$CAEQueryLibraryDefaultTransformat = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultTransformationDepthQuery" ) );
    $sym153$_QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-CACHING-STATE*" );
    $sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS = makeSymbol( "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS" );
    $const155$CAEQueryLibraryDefaultComputeAnsw = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultComputeAnswerJustificationsQuery" ) );
    $sym156$_QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS_CACHING_STAT = makeSymbol( "*QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-CACHING-STATE*" );
    $sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME = makeSymbol( "QUERY-LIBRARY-DEFAULT-MAX-TIME" );
    $const158$CAEQueryLibraryDefaultMaxTimeQuer = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultMaxTimeQuery" ) );
    $sym159$_QUERY_LIBRARY_DEFAULT_MAX_TIME_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-DEFAULT-MAX-TIME-CACHING-STATE*" );
    $sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY = makeSymbol( "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY" );
    $const161$CAEQueryLibraryDefaultMaxProducti = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultMaxProductivityQuery" ) );
    $const162$PlusInfinity = constant_handles.reader_make_constant_shell( makeString( "PlusInfinity" ) );
    $str163$Got_invalid_default__productivity = makeString( "Got invalid default :productivity-limit ~S for ~S" );
    $sym164$_QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-CACHING-STATE*" );
    $sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED = makeSymbol( "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED" );
    $sym166$_QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-CACHING-STATE*" );
    $const167$CAEQueryLibraryDefaultNewTermsAll = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultNewTermsAllowedQuery" ) );
    $sym168$ALLOW_ARBITRARY_ASSERTION_DELETION = makeSymbol( "ALLOW-ARBITRARY-ASSERTION-DELETION" );
    $sym169$_ALLOW_ARBITRARY_ASSERTION_DELETION_CACHING_STATE_ = makeSymbol( "*ALLOW-ARBITRARY-ASSERTION-DELETION-CACHING-STATE*" );
    $const170$AppAllowsArbitraryAssertionDeleti = constant_handles.reader_make_constant_shell( makeString( "AppAllowsArbitraryAssertionDeletionQuery" ) );
    $sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED = makeSymbol( "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED" );
    $sym172$_QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-CACHING-STATE*" );
    $const173$CAEQueryLibraryDefaultIndetermina = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultIndeterminateTermsAllowedQuery" ) );
    $sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol( "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY" );
    $sym175$_QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY_CACHING_ST = makeSymbol( "*QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-CACHING-STATE*" );
    $const176$CAEQueryLibraryDefaultDisjunction = constant_handles.reader_make_constant_shell( makeString( "CAEQueryLibraryDefaultDisjunctionFreeELVarsPolicyQuery" ) );
    $sym177$CAE_QUERY_SEARCH_FILTER = makeSymbol( "CAE-QUERY-SEARCH-FILTER" );
    $const178$CAEQuerySearchFilterQuery = constant_handles.reader_make_constant_shell( makeString( "CAEQuerySearchFilterQuery" ) );
    $sym179$_CAE_QUERY_SEARCH_FILTER_CACHING_STATE_ = makeSymbol( "*CAE-QUERY-SEARCH-FILTER-CACHING-STATE*" );
    $sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION = makeSymbol( "CAE-QUERY-SEARCH-FILTER-SPECIFICATION" );
    $const181$CAEQuerySearchFilterSpecification = constant_handles.reader_make_constant_shell( makeString( "CAEQuerySearchFilterSpecificationQuery" ) );
    $sym182$_CAE_QUERY_SEARCH_FILTER_SPECIFICATION_CACHING_STATE_ = makeSymbol( "*CAE-QUERY-SEARCH-FILTER-SPECIFICATION-CACHING-STATE*" );
    $sym183$CAE_QUERY_SEARCH_FILTER_STRING = makeSymbol( "CAE-QUERY-SEARCH-FILTER-STRING" );
    $sym184$_TREE = makeSymbol( "?TREE" );
    $const185$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const186$conceptFilterDecisionTree = constant_handles.reader_make_constant_shell( makeString( "conceptFilterDecisionTree" ) );
    $list187 = ConsesLow.list( makeSymbol( "?TREENAT" ) );
    $list188 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?TREE" ), makeSymbol( "?TREENAT" ) ) );
    $sym189$_CAE_QUERY_SEARCH_FILTER_STRING_CACHING_STATE_ = makeSymbol( "*CAE-QUERY-SEARCH-FILTER-STRING-CACHING-STATE*" );
    $sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE = makeSymbol( "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE" );
    $sym191$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_CACHING_STATE_ = makeSymbol( "*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-CACHING-STATE*" );
    $sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS = makeSymbol( "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS" );
    $sym193$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS_CACHING_ST = makeSymbol( "*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-CACHING-STATE*" );
    $sym194$CAE_DEFAULT_PARAPHRASE_MT = makeSymbol( "CAE-DEFAULT-PARAPHRASE-MT" );
    $const195$CAEDefaultParaphraseMtQuery = constant_handles.reader_make_constant_shell( makeString( "CAEDefaultParaphraseMtQuery" ) );
    $const196$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $sym197$_CAE_DEFAULT_PARAPHRASE_MT_CACHING_STATE_ = makeSymbol( "*CAE-DEFAULT-PARAPHRASE-MT-CACHING-STATE*" );
    $sym198$CAE_DEFAULT_PARSING_MT = makeSymbol( "CAE-DEFAULT-PARSING-MT" );
    $const199$CAEDefaultParsingMtQuery = constant_handles.reader_make_constant_shell( makeString( "CAEDefaultParsingMtQuery" ) );
    $list200 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) ), constant_handles.reader_make_constant_shell( makeString( "RelationParaphraseMt" ) ), constant_handles
        .reader_make_constant_shell( makeString( "AllGeneralEnglishValidatedLexicalMicrotheoryPSC" ) ) );
    $sym201$_CAE_DEFAULT_PARSING_MT_CACHING_STATE_ = makeSymbol( "*CAE-DEFAULT-PARSING-MT-CACHING-STATE*" );
    $sym202$CAE_DEFAULT_NL_DOMAIN_MT = makeSymbol( "CAE-DEFAULT-NL-DOMAIN-MT" );
    $const203$CAEDefaultNLDomainMtQuery = constant_handles.reader_make_constant_shell( makeString( "CAEDefaultNLDomainMtQuery" ) );
    $sym204$_CAE_DEFAULT_NL_DOMAIN_MT_CACHING_STATE_ = makeSymbol( "*CAE-DEFAULT-NL-DOMAIN-MT-CACHING-STATE*" );
    $sym205$CAE_GET_NL_MTS_FROM_TASK = makeSymbol( "CAE-GET-NL-MTS-FROM-TASK" );
    $sym206$CAE_GET_CAE_MTS_FROM_TASK = makeSymbol( "CAE-GET-CAE-MTS-FROM-TASK" );
    $sym207$CAE_TOPIC = makeSymbol( "CAE-TOPIC" );
    $sym208$_TOPIC = makeSymbol( "?TOPIC" );
    $list209 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TOPIC" ), constant_handles.reader_make_constant_shell( makeString( "CAEAnalysisTopic" ) ) );
    $const210$topicOfIndividual = constant_handles.reader_make_constant_shell( makeString( "topicOfIndividual" ) );
    $list211 = ConsesLow.list( makeSymbol( "?TOPIC" ) );
    $list212 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $sym213$_CAE_TOPIC_CACHING_STATE_ = makeSymbol( "*CAE-TOPIC-CACHING-STATE*" );
    $sym214$CAE_TASK_TOPIC_CHANGED = makeSymbol( "CAE-TASK-TOPIC-CHANGED" );
    $str215$failed_to_find_original_query_str = makeString( "failed to find original query string" );
    $sym216$NEW_QUERY_ID = makeSymbol( "NEW-QUERY-ID" );
    $const217$QueryLibrary_QueryCreationTemplat = constant_handles.reader_make_constant_shell( makeString( "QueryLibrary-QueryCreationTemplate" ) );
    $const218$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TemplateFromTestQueryFn" ) );
    $str219$UserQuery = makeString( "UserQuery" );
    $list220 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLQuerySpecification" ) ) );
    $const221$TestVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) );
    $sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES = makeSymbol( "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES" );
    $sym223$_QUERY_LIBRARY_TEMPLATE_FORWARD_RULES_CACHING_STATE_ = makeSymbol( "*QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-CACHING-STATE*" );
    $sym224$KILL_QUERY_TEMPLATE_AND_QUERY = makeSymbol( "KILL-QUERY-TEMPLATE-AND-QUERY" );
    $const225$TestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TestQueryFn" ) );
    $sym226$KILL_QUERY_LIBRARY = makeSymbol( "KILL-QUERY-LIBRARY" );
    $sym227$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $sym228$QL_PRED_STRENGTHEN_SENTENCE = makeSymbol( "QL-PRED-STRENGTHEN-SENTENCE" );
    $kw229$TEST = makeKeyword( "TEST" );
    $kw230$OWNER = makeKeyword( "OWNER" );
    $kw231$CLASSES = makeKeyword( "CLASSES" );
    $kw232$KB = makeKeyword( "KB" );
    $kw233$FULL = makeKeyword( "FULL" );
    $kw234$WORKING_ = makeKeyword( "WORKING?" );
    $list235 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?MEMBER" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?MEMBER" ), constant_handles.reader_make_constant_shell(
            makeString( "HumanAdult" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasMembers" ) ), constant_handles.reader_make_constant_shell( makeString( "LebaneseHizballah" ) ),
                makeSymbol( "?MEMBER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthPlace" ) ), makeSymbol( "?MEMBER" ), makeSymbol( "?PLACE" ) ) ) ), constant_handles
                    .reader_make_constant_shell( makeString( "InferencePSC" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?MEMBER" ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?MEMBER" ), constant_handles
                            .reader_make_constant_shell( makeString( "HumanAdult" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasMembers" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "LebaneseHizballah" ) ), makeSymbol( "?MEMBER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthPlace" ) ),
                                    makeSymbol( "?MEMBER" ), makeSymbol( "?PLACE" ) ) ) ) ) );
    $sym236$TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY = makeSymbol( "TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY" );
    $sym237$PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST = makeSymbol( "PRED-STRENGTHEN-UNAMBIGUOUSLY-TEST" );
    $list238 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?MEMBER" ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?MEMBER" ), constant_handles.reader_make_constant_shell(
            makeString( "HumanAdult" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasMembers" ) ), constant_handles.reader_make_constant_shell( makeString( "LebaneseHizballah" ) ),
                makeSymbol( "?MEMBER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthPlace" ) ), makeSymbol( "?MEMBER" ), makeSymbol( "?PLACE" ) ) ) ), constant_handles
                    .reader_make_constant_shell( makeString( "InferencePSC" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?MEMBER" ), ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?MEMBER" ), constant_handles
                            .reader_make_constant_shell( makeString( "HumanAdult" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "politicalPartyMembers" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "LebaneseHizballah" ) ), makeSymbol( "?MEMBER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthPlace" ) ),
                                    makeSymbol( "?MEMBER" ), makeSymbol( "?PLACE" ) ) ) ) ) );
    $sym239$GET_CYCLS_FOR_UNINDEXED_STRING_TCT = makeSymbol( "GET-CYCLS-FOR-UNINDEXED-STRING-TCT" );
    $list240 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "Which terrorist groups have carried out suicide bombings in Israel?" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "thereExists" ) ), makeSymbol( "?TERRORIST-SUICIDE-BOMBING" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
            makeString( "isa" ) ), makeSymbol( "?TERRORIST-SUICIDE-BOMBING" ), constant_handles.reader_make_constant_shell( makeString( "TerroristSuicideBombing" ) ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "eventOccursAt" ) ), makeSymbol( "?TERRORIST-SUICIDE-BOMBING" ), constant_handles.reader_make_constant_shell( makeString( "Israel" ) ) ), ConsesLow.list(
                    constant_handles.reader_make_constant_shell( makeString( "perpetrator" ) ), makeSymbol( "?TERRORIST-SUICIDE-BOMBING" ), makeSymbol( "?CULPRIT" ) ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?CULPRIT" ), constant_handles.reader_make_constant_shell( makeString( "TerroristGroup" ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow
                            .list( makeString( "What attacks has Hezbollah carried out since 2002?" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?ATTACK" ), constant_handles.reader_make_constant_shell( makeString( "AttackOnObject" ) ) ), ConsesLow.list(
                                    constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeSymbol( "?ATTACK" ), makeSymbol( "?DATE" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "laterThan" ) ), makeSymbol( "?DATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                            2002 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "perpetrator" ) ), makeSymbol( "?ATTACK" ), constant_handles.reader_make_constant_shell(
                                                makeString( "LebaneseHizballah" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "What types of attacks has Hezbollah performed?" ), ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?ACTION" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                        makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TYPE-OF-ATTACK" ), constant_handles
                                                            .reader_make_constant_shell( makeString( "AttackType" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "performedBy" ) ),
                                                                makeSymbol( "?ACTION" ), constant_handles.reader_make_constant_shell( makeString( "LebaneseHizballah" ) ) ), ConsesLow.list( constant_handles
                                                                    .reader_make_constant_shell( makeString( "nearestIsa" ) ), makeSymbol( "?ACTION" ), makeSymbol( "?TYPE-OF-ATTACK" ) ) ) ) ), T ), ConsesLow.list(
                                                                        ConsesLow.list( makeString( "Where were the members of Hizballah born?" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                            "thereExists" ) ), makeSymbol( "?MEMBER" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                constant_handles.reader_make_constant_shell( makeString( "hasMembers" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                    "LebaneseHizballah" ) ), makeSymbol( "?MEMBER" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                        "birthPlace" ) ), makeSymbol( "?MEMBER" ), makeSymbol( "?BIRTHPLACE" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                            "Where do members of Hizballah live?" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                "thereExists" ) ), makeSymbol( "?INHABITANT" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                    "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "hasMembers" ) ), constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "LebaneseHizballah" ) ), makeSymbol( "?INHABITANT" ) ), ConsesLow.list(
                                                                                                            constant_handles.reader_make_constant_shell( makeString( "residesInRegion" ) ), makeSymbol( "?INHABITANT" ),
                                                                                                            makeSymbol( "?GEOGRAPHICAL-REGION" ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                "What terrorist groups is Hezbollah financially linked to?" ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TERRORIST-ORGANIZATION" ),
                                                                                                                        constant_handles.reader_make_constant_shell( makeString( "TerroristGroup" ) ) ), ConsesLow.list(
                                                                                                                            constant_handles.reader_make_constant_shell( makeString( "relatedToVia" ) ), constant_handles
                                                                                                                                .reader_make_constant_shell( makeString( "LebaneseHizballah" ) ), makeSymbol(
                                                                                                                                    "?TERRORIST-ORGANIZATION" ), ConsesLow.list( constant_handles
                                                                                                                                        .reader_make_constant_shell( makeString( "TheSet" ) ), constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "financiallyLinked" ) ) ),
                                                                                                                            THREE_INTEGER ) ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
                                                                                                                                "What types of financial links are there?" ), ConsesLow.list( constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "genlPreds" ) ), makeSymbol(
                                                                                                                                        "?BINARY-PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                            "financiallyLinked" ) ) ) ), T ) );
  }
}
/*
 * 
 * Total time: 1256 ms
 * 
 */