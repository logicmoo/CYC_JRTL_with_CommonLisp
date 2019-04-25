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

public final class query_library_utils extends SubLTranslatedFile
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
    public static SubLObject log_query_library_search(final SubLObject query_string, SubLObject user, SubLObject mt, SubLObject task) {
        if (user == query_library_utils.UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (mt == query_library_utils.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (task == query_library_utils.UNPROVIDED) {
            task = (SubLObject)query_library_utils.NIL;
        }
        final SubLObject search_constant = fi.fi_create_int(constants_high.suggest_constant_name(query_string, (SubLObject)query_library_utils.$str8$UserSearch_, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), (SubLObject)query_library_utils.UNPROVIDED);
        ke.ke_assert((SubLObject)ConsesLow.listS(query_library_utils.$const9$isa, search_constant, (SubLObject)query_library_utils.$list10), mt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        ke.ke_assert((SubLObject)ConsesLow.list(query_library_utils.$const11$searchStringsUsed, search_constant, query_string), mt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        ke.ke_assert((SubLObject)ConsesLow.list(query_library_utils.$const12$performedBy, search_constant, user), mt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        ke.ke_assert((SubLObject)ConsesLow.listS(query_library_utils.$const13$dateOfEvent, search_constant, (SubLObject)query_library_utils.$list14), mt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        if (query_library_utils.NIL != task) {
            ke.ke_assert((SubLObject)ConsesLow.list(query_library_utils.$const15$properSubEvents, (SubLObject)ConsesLow.list(query_library_utils.$const16$WorkEventOnSpecificationFn, task), search_constant), mt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return search_constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 2549L)
    public static SubLObject unindexed_queries_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ql_parses = get_cycls_for_unindexed_string(string);
        if (query_library_utils.NIL == ql_parse_cycl(ql_parses.first())) {
            return (SubLObject)query_library_utils.NIL;
        }
        SubLObject generations = (SubLObject)query_library_utils.NIL;
        SubLObject new_queries = (SubLObject)query_library_utils.NIL;
        SubLObject cdolist_list_var = ql_parses;
        SubLObject ql_parse = (SubLObject)query_library_utils.NIL;
        ql_parse = cdolist_list_var.first();
        while (query_library_utils.NIL != cdolist_list_var) {
            set_ql_parse_cycl(ql_parse, el_utilities.optimize_el_formula_variable_names(ql_parse_cycl(ql_parse), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ql_parse = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        try {
            pph_vars.$pph_maximize_linksP$.bind((SubLObject)query_library_utils.NIL, thread);
            final SubLObject cycls = Mapping.mapcar((SubLObject)query_library_utils.$sym19$QL_PARSE_CYCL, ql_parses);
            generations = pph_main.generate_disambiguation_phrases(cycls, (SubLObject)query_library_utils.$kw20$INTERROGATIVE, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_0, thread);
        }
        SubLObject list_var = (SubLObject)query_library_utils.NIL;
        ql_parse = (SubLObject)query_library_utils.NIL;
        SubLObject number = (SubLObject)query_library_utils.NIL;
        list_var = ql_parses;
        ql_parse = list_var.first();
        for (number = (SubLObject)query_library_utils.ZERO_INTEGER; query_library_utils.NIL != list_var; list_var = list_var.rest(), ql_parse = list_var.first(), number = Numbers.add((SubLObject)query_library_utils.ONE_INTEGER, number)) {
            final SubLObject cycl = ql_parse_cycl(ql_parse);
            final SubLObject weight = ql_parse_weight(ql_parse);
            final SubLObject gloss = ConsesLow.nth(number, generations).rest();
            final SubLObject template_id = new_query_id();
            final SubLObject template = formula_templates.new_formula_template(template_id, (SubLObject)query_library_utils.UNPROVIDED);
            final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
            formula_templates.formula_template_set_gloss(template, gloss);
            new_cycl_query_specification.set_new_cycl_query_specification_comment(query_spec, formula_templates.formula_template_gloss(template));
            new_cycl_query_specification.set_new_cycl_query_specification_formula(query_spec, cycl);
            new_cycl_query_specification.set_new_cycl_query_specification_mt(query_spec, query_library_utils.$ql_default_mt$.getDynamicValue(thread));
            new_cycl_query_specification.set_new_cycl_query_specification_properties(query_spec, inference_datastructures_enumerated_types.merge_query_properties(new_cycl_query_specification.new_cycl_query_specification_properties(query_spec), query_library_api.guess_inference_parameters_for_query(query_spec, query_library_utils.$ql_default_mt$.getDynamicValue(thread))));
            new_cycl_query_specification.set_new_cycl_query_specification_cycl_id(query_spec, template_id);
            formula_templates.formula_template_set_elmt(template, query_library_utils.$ql_default_mt$.getDynamicValue(thread));
            formula_templates.formula_template_set_query_specification(template, query_spec);
            store_original_string_for_template_id(template_id, string);
            SubLObject xml_string = (SubLObject)query_library_utils.NIL;
            SubLObject stream = (SubLObject)query_library_utils.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    formula_templates.xml_serialize_formula_template_as_document(template, (SubLObject)query_library_utils.UNPROVIDED);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
                }
                xml_string = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_utils.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)query_library_utils.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            new_queries = (SubLObject)ConsesLow.cons(xml_string, new_queries);
        }
        return new_queries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 4647L)
    public static SubLObject unindexed_queries_from_string_with_confidences(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ql_parses = get_cycls_for_unindexed_string(string);
        final SubLObject cycls = Mapping.mapcar((SubLObject)query_library_utils.$sym19$QL_PARSE_CYCL, ql_parses);
        if (query_library_utils.NIL == cycls.first()) {
            return (SubLObject)query_library_utils.NIL;
        }
        SubLObject generations = (SubLObject)query_library_utils.NIL;
        SubLObject new_queries_with_confidences = (SubLObject)query_library_utils.NIL;
        SubLObject cdolist_list_var = ql_parses;
        SubLObject ql_parse = (SubLObject)query_library_utils.NIL;
        ql_parse = cdolist_list_var.first();
        while (query_library_utils.NIL != cdolist_list_var) {
            set_ql_parse_cycl(ql_parse, el_utilities.optimize_el_formula_variable_names(ql_parse_cycl(ql_parse), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ql_parse = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        try {
            pph_vars.$pph_maximize_linksP$.bind((SubLObject)query_library_utils.NIL, thread);
            final SubLObject cycls_$1 = Mapping.mapcar((SubLObject)query_library_utils.$sym19$QL_PARSE_CYCL, ql_parses);
            generations = pph_main.generate_disambiguation_phrases(cycls_$1, (SubLObject)query_library_utils.$kw20$INTERROGATIVE, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_0, thread);
        }
        SubLObject list_var = (SubLObject)query_library_utils.NIL;
        ql_parse = (SubLObject)query_library_utils.NIL;
        SubLObject number = (SubLObject)query_library_utils.NIL;
        list_var = ql_parses;
        ql_parse = list_var.first();
        for (number = (SubLObject)query_library_utils.ZERO_INTEGER; query_library_utils.NIL != list_var; list_var = list_var.rest(), ql_parse = list_var.first(), number = Numbers.add((SubLObject)query_library_utils.ONE_INTEGER, number)) {
            final SubLObject cycl = ql_parse_cycl(ql_parse);
            final SubLObject weight = ql_parse_weight(ql_parse);
            final SubLObject v_2nd_weight = ql_parse_2nd_weight(ql_parse);
            final SubLObject gloss = ConsesLow.nth(number, generations).rest();
            final SubLObject formula_wXrenamed_vars = el_utilities.optimize_el_formula_variable_names(cycl, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
            final SubLObject template_id = new_query_id();
            final SubLObject template = formula_templates.new_formula_template(template_id, (SubLObject)query_library_utils.UNPROVIDED);
            final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
            final SubLObject offset = (SubLObject)query_library_utils.ZERO_INTEGER;
            final SubLObject end = (SubLObject)query_library_utils.NIL;
            formula_templates.formula_template_set_gloss(template, gloss);
            new_cycl_query_specification.set_new_cycl_query_specification_comment(query_spec, formula_templates.formula_template_gloss(template));
            new_cycl_query_specification.set_new_cycl_query_specification_formula(query_spec, formula_wXrenamed_vars);
            new_cycl_query_specification.set_new_cycl_query_specification_mt(query_spec, query_library_utils.$ql_default_mt$.getDynamicValue(thread));
            new_cycl_query_specification.set_new_cycl_query_specification_properties(query_spec, inference_datastructures_enumerated_types.merge_query_properties(new_cycl_query_specification.new_cycl_query_specification_properties(query_spec), query_library_api.guess_inference_parameters_for_query(query_spec, query_library_utils.$ql_default_mt$.getDynamicValue(thread))));
            new_cycl_query_specification.set_new_cycl_query_specification_cycl_id(query_spec, template_id);
            formula_templates.formula_template_set_elmt(template, query_library_utils.$ql_default_mt$.getDynamicValue(thread));
            formula_templates.formula_template_set_query_specification(template, query_spec);
            store_original_string_for_template_id(template_id, string);
            SubLObject xml_string = (SubLObject)query_library_utils.NIL;
            SubLObject stream = (SubLObject)query_library_utils.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    formula_templates.xml_serialize_formula_template_as_document(template, (SubLObject)query_library_utils.UNPROVIDED);
                }
                finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
                }
                xml_string = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_library_utils.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)query_library_utils.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            final SubLObject xml_string_with_confidence = new_weighted_xml(xml_string, weight, v_2nd_weight, offset, end, (SubLObject)query_library_utils.UNPROVIDED);
            new_queries_with_confidences = (SubLObject)ConsesLow.cons(xml_string_with_confidence, new_queries_with_confidences);
        }
        return new_queries_with_confidences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 7061L)
    public static SubLObject new_weighted_xml(final SubLObject xml, SubLObject weight, SubLObject v_2nd_weight, SubLObject offset, SubLObject end, SubLObject justification) {
        if (weight == query_library_utils.UNPROVIDED) {
            weight = (SubLObject)query_library_utils.ZERO_INTEGER;
        }
        if (v_2nd_weight == query_library_utils.UNPROVIDED) {
            v_2nd_weight = (SubLObject)query_library_utils.ZERO_INTEGER;
        }
        if (offset == query_library_utils.UNPROVIDED) {
            offset = (SubLObject)query_library_utils.ZERO_INTEGER;
        }
        if (end == query_library_utils.UNPROVIDED) {
            end = (SubLObject)query_library_utils.NIL;
        }
        if (justification == query_library_utils.UNPROVIDED) {
            justification = (SubLObject)query_library_utils.NIL;
        }
        SubLObject result = (SubLObject)ConsesLow.list((SubLObject)query_library_utils.$kw22$XML, xml);
        if (query_library_utils.NIL != weight) {
            result = conses_high.putf(result, (SubLObject)query_library_utils.$kw23$WEIGHT, weight);
        }
        if (query_library_utils.NIL != v_2nd_weight) {
            result = conses_high.putf(result, (SubLObject)query_library_utils.$kw24$2ND_WEIGHT, v_2nd_weight);
        }
        if (query_library_utils.NIL != offset) {
            result = conses_high.putf(result, (SubLObject)query_library_utils.$kw25$OFFSET, offset);
        }
        if (query_library_utils.NIL != end) {
            result = conses_high.putf(result, (SubLObject)query_library_utils.$kw26$END, end);
        }
        if (query_library_utils.NIL != justification) {
            result = conses_high.putf(result, (SubLObject)query_library_utils.$kw27$JUSTIFICATION, justification);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 7595L)
    public static SubLObject register_all_query_library_parsers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        register_cyclify_parser();
        register_cyclify_link_parser();
        register_template_parser();
        register_text_answers_as_last_resort();
        register_ebmt();
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 7918L)
    public static SubLObject register_cyclify_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = (SubLObject)query_library_utils.$kw29$CYCLIFY;
        if (query_library_utils.NIL == conses_high.member(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)query_library_utils.EQL), Symbols.symbol_function((SubLObject)query_library_utils.IDENTITY))) {
            query_library_utils.$registered_ql_parsers$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8147L)
    public static SubLObject register_cyclify_link_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = (SubLObject)query_library_utils.$kw30$CYCLIFY_LINK;
        if (query_library_utils.NIL == conses_high.member(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)query_library_utils.EQL), Symbols.symbol_function((SubLObject)query_library_utils.IDENTITY))) {
            query_library_utils.$registered_ql_parsers$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8279L)
    public static SubLObject deregister_cyclify_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_library_utils.$registered_ql_parsers$.setDynamicValue(Sequences.delete((SubLObject)query_library_utils.$kw29$CYCLIFY, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), thread);
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8436L)
    public static SubLObject register_template_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = (SubLObject)query_library_utils.$kw31$RTP;
        if (query_library_utils.NIL == conses_high.member(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)query_library_utils.EQL), Symbols.symbol_function((SubLObject)query_library_utils.IDENTITY))) {
            query_library_utils.$registered_ql_parsers$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8676L)
    public static SubLObject deregister_template_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_library_utils.$registered_ql_parsers$.setDynamicValue(Sequences.delete((SubLObject)query_library_utils.$kw31$RTP, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), thread);
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 8830L)
    public static SubLObject register_text_answers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (query_library_utils.NIL != Sequences.find((SubLObject)query_library_utils.$kw32$TEXT_ANSWERS, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED) || query_library_utils.NIL != Sequences.find((SubLObject)query_library_utils.$kw33$TEXT_ANSWERS_LAST_RESORT, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED)) {
            deregister_text_answers();
        }
        query_library_utils.$registered_ql_parsers$.setDynamicValue(list_utilities.snoc((SubLObject)query_library_utils.$kw32$TEXT_ANSWERS, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 9255L)
    public static SubLObject register_text_answers_as_last_resort() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (query_library_utils.NIL != Sequences.find((SubLObject)query_library_utils.$kw32$TEXT_ANSWERS, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED) || query_library_utils.NIL != Sequences.find((SubLObject)query_library_utils.$kw33$TEXT_ANSWERS_LAST_RESORT, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED)) {
            deregister_text_answers();
        }
        query_library_utils.$registered_ql_parsers$.setDynamicValue(list_utilities.snoc((SubLObject)query_library_utils.$kw33$TEXT_ANSWERS_LAST_RESORT, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 9707L)
    public static SubLObject deregister_text_answers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_library_utils.$registered_ql_parsers$.setDynamicValue(Sequences.delete((SubLObject)query_library_utils.$kw32$TEXT_ANSWERS, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), thread);
        query_library_utils.$registered_ql_parsers$.setDynamicValue(Sequences.delete((SubLObject)query_library_utils.$kw33$TEXT_ANSWERS_LAST_RESORT, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), thread);
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 9961L)
    public static SubLObject register_ebmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = (SubLObject)query_library_utils.$kw34$EBMT;
        if (query_library_utils.NIL == conses_high.member(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)query_library_utils.EQL), Symbols.symbol_function((SubLObject)query_library_utils.IDENTITY))) {
            query_library_utils.$registered_ql_parsers$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 10186L)
    public static SubLObject deregister_ebmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_library_utils.$registered_ql_parsers$.setDynamicValue(Sequences.delete((SubLObject)query_library_utils.$kw34$EBMT, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), thread);
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 10330L)
    public static SubLObject register_default_ql_parsers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_library_utils.$registered_ql_parsers$.setDynamicValue((SubLObject)query_library_utils.NIL, thread);
        SubLObject cdolist_list_var = cfasl.cfasl_decode(vector_utilities.hex_char_string_to_byte_vector(query_library_utils.$ql_default_parsers$.getDynamicValue(thread)));
        SubLObject v_parser = (SubLObject)query_library_utils.NIL;
        v_parser = cdolist_list_var.first();
        while (query_library_utils.NIL != cdolist_list_var) {
            final SubLObject pcase_var = v_parser;
            if (pcase_var.eql((SubLObject)query_library_utils.$kw36$CYCL)) {
                final SubLObject item_var = (SubLObject)query_library_utils.$kw36$CYCL;
                if (query_library_utils.NIL == conses_high.member(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)query_library_utils.EQL), Symbols.symbol_function((SubLObject)query_library_utils.IDENTITY))) {
                    query_library_utils.$registered_ql_parsers$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, query_library_utils.$registered_ql_parsers$.getDynamicValue(thread)), thread);
                }
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw29$CYCLIFY)) {
                register_cyclify_parser();
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw30$CYCLIFY_LINK)) {
                register_cyclify_link_parser();
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw31$RTP)) {
                register_template_parser();
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw32$TEXT_ANSWERS)) {
                register_text_answers();
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw33$TEXT_ANSWERS_LAST_RESORT)) {
                register_text_answers_as_last_resort();
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw34$EBMT)) {
                register_ebmt();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_parser = cdolist_list_var.first();
        }
        return query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 10972L)
    public static SubLObject new_ql_parse(SubLObject cycl, SubLObject weight, SubLObject v_2nd_weight) {
        if (cycl == query_library_utils.UNPROVIDED) {
            cycl = (SubLObject)query_library_utils.NIL;
        }
        if (weight == query_library_utils.UNPROVIDED) {
            weight = (SubLObject)query_library_utils.ZERO_INTEGER;
        }
        if (v_2nd_weight == query_library_utils.UNPROVIDED) {
            v_2nd_weight = (SubLObject)query_library_utils.ZERO_INTEGER;
        }
        SubLObject parse = (SubLObject)query_library_utils.NIL;
        if (query_library_utils.NIL != cycl) {
            parse = conses_high.putf(parse, (SubLObject)query_library_utils.$kw36$CYCL, cycl);
        }
        if (query_library_utils.NIL != weight) {
            parse = conses_high.putf(parse, (SubLObject)query_library_utils.$kw23$WEIGHT, weight);
        }
        if (query_library_utils.NIL != v_2nd_weight) {
            parse = conses_high.putf(parse, (SubLObject)query_library_utils.$kw24$2ND_WEIGHT, v_2nd_weight);
        }
        return parse;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11373L)
    public static SubLObject set_ql_parse_cycl(final SubLObject ql_parse, final SubLObject cycl) {
        return conses_high.putf(ql_parse, (SubLObject)query_library_utils.$kw36$CYCL, cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11462L)
    public static SubLObject set_ql_parse_weight(final SubLObject ql_parse, final SubLObject weight) {
        return conses_high.putf(ql_parse, (SubLObject)query_library_utils.$kw23$WEIGHT, weight);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11559L)
    public static SubLObject set_ql_parse_2nd_weight(final SubLObject ql_parse, final SubLObject v_2nd_weight) {
        return conses_high.putf(ql_parse, (SubLObject)query_library_utils.$kw24$2ND_WEIGHT, v_2nd_weight);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11672L)
    public static SubLObject ql_parse_cycl(final SubLObject ql_parse) {
        return conses_high.getf(ql_parse, (SubLObject)query_library_utils.$kw36$CYCL, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11747L)
    public static SubLObject ql_parse_weight(final SubLObject ql_parse) {
        return conses_high.getf(ql_parse, (SubLObject)query_library_utils.$kw23$WEIGHT, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11826L)
    public static SubLObject ql_parse_2nd_weight(final SubLObject ql_parse) {
        return conses_high.getf(ql_parse, (SubLObject)query_library_utils.$kw24$2ND_WEIGHT, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 11914L)
    public static SubLObject ql_parse_equalP(final SubLObject ql_parse1, final SubLObject ql_parse2) {
        return czer_utilities.equals_elP(ql_parse_cycl(ql_parse1), ql_parse_cycl(ql_parse2), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 12045L)
    public static SubLObject get_cycls_for_unindexed_string(final SubLObject raw_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = preprocess_query_string(raw_string);
        SubLObject result = (SubLObject)query_library_utils.NIL;
        SubLObject cdolist_list_var = query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
        SubLObject v_parser = (SubLObject)query_library_utils.NIL;
        v_parser = cdolist_list_var.first();
        while (query_library_utils.NIL != cdolist_list_var) {
            final SubLObject pcase_var = v_parser;
            if (pcase_var.eql((SubLObject)query_library_utils.$kw30$CYCLIFY_LINK)) {
                result = ql_cyclify_link(string, result);
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw29$CYCLIFY)) {
                result = ql_cyclify(string, result);
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw31$RTP)) {
                result = ql_template_parse_query(string, result);
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw36$CYCL)) {
                result = ql_interpret_cycl(string, result);
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw32$TEXT_ANSWERS)) {
                result = ql_text_answer_query(string, result, (SubLObject)query_library_utils.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)query_library_utils.$kw33$TEXT_ANSWERS_LAST_RESORT)) {
                result = ql_text_answer_query(string, result, (SubLObject)query_library_utils.T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_parser = cdolist_list_var.first();
        }
        return Sort.sort(Sequences.delete_duplicates(result, (SubLObject)query_library_utils.$sym37$QL_PARSE_EQUAL_, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED), (SubLObject)query_library_utils.$sym38$_, (SubLObject)query_library_utils.$sym39$QL_PARSE_WEIGHT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 12787L)
    public static SubLObject preprocess_query_string(final SubLObject string) {
        if (query_library_utils.NIL != string_utilities.starts_with(string, (SubLObject)query_library_utils.$str40$and)) {
            return string_utilities.replace_substring_once(string, (SubLObject)query_library_utils.$str40$and, (SubLObject)query_library_utils.$str41$what, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 12948L)
    public static SubLObject ql_cyclify(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == query_library_utils.UNPROVIDED) {
            existing_parses = (SubLObject)query_library_utils.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combined_result = existing_parses;
        SubLObject msg = (SubLObject)query_library_utils.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)query_library_utils.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject cdolist_list_var = cyclifier.cyclify(string, (SubLObject)ConsesLow.list((SubLObject)query_library_utils.$kw44$OUTPUT, (SubLObject)query_library_utils.$kw45$VERBOSE, (SubLObject)query_library_utils.$kw46$SCORE_FUNCTION, (SubLObject)query_library_utils.$sym47$CYCLIFICATION_COVERAGE, (SubLObject)query_library_utils.$kw48$LEXICON, new_ql_lexicon(), (SubLObject)query_library_utils.$kw49$PARSER, parser.new_stanford_parser((SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED)));
                    SubLObject raw_result = (SubLObject)query_library_utils.NIL;
                    raw_result = cdolist_list_var.first();
                    while (query_library_utils.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = raw_result;
                        SubLObject raw_cycl = (SubLObject)query_library_utils.NIL;
                        SubLObject weight = (SubLObject)query_library_utils.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_utils.$list43);
                        raw_cycl = current.first();
                        current = (weight = current.rest());
                        final SubLObject processed_cycl = ql_postprocess_cyclify_cycl(raw_cycl);
                        if (query_library_utils.NIL != processed_cycl) {
                            combined_result = (SubLObject)ConsesLow.cons(new_ql_parse(processed_cycl, weight, (SubLObject)query_library_utils.UNPROVIDED), combined_result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        raw_result = cdolist_list_var.first();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)query_library_utils.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (query_library_utils.NIL != msg) {
            Errors.warn((SubLObject)query_library_utils.$str50$caught_error__S_while_link_parsin, msg, string);
        }
        return combined_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 13673L)
    public static SubLObject new_ql_lexicon() {
        final SubLObject lexicon = object.new_class_instance((SubLObject)query_library_utils.$sym51$CYCLIFIER_LEXICON_W_O_FABRICATION);
        methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)query_library_utils.$sym52$FORBID_MT, query_library_utils.$const53$NameLexicalMt);
        return lexicon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 13932L)
    public static SubLObject ql_postprocess_cyclify_cycl(final SubLObject cycl) {
        if (query_library_utils.NIL != cycl_utilities.expression_contains_keywordp(cycl, (SubLObject)query_library_utils.UNPROVIDED)) {
            return (SubLObject)query_library_utils.NIL;
        }
        final SubLObject transformed_result = convert_instancefns_to_variables(cycl);
        final SubLObject final_result = ql_pred_strengthen_sentence(transformed_result, query_library_utils.$const54$InferencePSC);
        return final_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 14217L)
    public static SubLObject ql_pred_strengthen_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)query_library_utils.NIL;
        final SubLObject _prev_bind_0 = predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.currentBinding(thread);
        try {
            predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.bind((SubLObject)query_library_utils.T, thread);
            result = predicate_strengthener.typed_pred_strengthen_formula_unambiguously(sentence, mt, (SubLObject)query_library_utils.UNPROVIDED).first();
        }
        finally {
            predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 15082L)
    public static SubLObject ql_cyclify_link(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == query_library_utils.UNPROVIDED) {
            existing_parses = (SubLObject)query_library_utils.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combined_result = existing_parses;
        SubLObject msg = (SubLObject)query_library_utils.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)query_library_utils.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject v_parser = parser.new_link_parser(linkage.$link_parse_options$.getDynamicValue(thread), (SubLObject)query_library_utils.$kw55$WARN, (SubLObject)query_library_utils.UNPROVIDED);
                    SubLObject cdolist_list_var;
                    final SubLObject raw_results = cdolist_list_var = cyclifier.cyclify(string, (SubLObject)ConsesLow.list((SubLObject)query_library_utils.$kw49$PARSER, v_parser, (SubLObject)query_library_utils.$kw44$OUTPUT, (SubLObject)query_library_utils.$kw45$VERBOSE, (SubLObject)query_library_utils.$kw46$SCORE_FUNCTION, (SubLObject)query_library_utils.$sym47$CYCLIFICATION_COVERAGE, (SubLObject)query_library_utils.$kw48$LEXICON, new_ql_lexicon()));
                    SubLObject raw_result = (SubLObject)query_library_utils.NIL;
                    raw_result = cdolist_list_var.first();
                    while (query_library_utils.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = raw_result;
                        SubLObject raw_parse = (SubLObject)query_library_utils.NIL;
                        SubLObject weight = (SubLObject)query_library_utils.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_library_utils.$list56);
                        raw_parse = current.first();
                        current = (weight = current.rest());
                        final SubLObject processed_cycl = ql_postprocess_cyclify_cycl(raw_parse);
                        if (query_library_utils.NIL != processed_cycl) {
                            combined_result = (SubLObject)ConsesLow.cons(new_ql_parse(processed_cycl, weight, (SubLObject)query_library_utils.UNPROVIDED), combined_result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        raw_result = cdolist_list_var.first();
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)query_library_utils.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (query_library_utils.NIL != msg) {
            Errors.warn((SubLObject)query_library_utils.$str50$caught_error__S_while_link_parsin, msg, string);
        }
        return combined_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 15989L)
    public static SubLObject convert_instancefns_to_variables(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_vars = (SubLObject)query_library_utils.NIL;
        SubLObject new_sentence = (SubLObject)query_library_utils.NIL;
        final SubLObject _prev_bind_0 = query_library_utils.$new_vars$.currentBinding(thread);
        try {
            query_library_utils.$new_vars$.bind((SubLObject)query_library_utils.NIL, thread);
            new_sentence = cycl_utilities.expression_transform(obj, (SubLObject)query_library_utils.$sym58$INSTANCEFN_, (SubLObject)query_library_utils.$sym59$VAR_FROM_INSTANCEFN, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
            new_vars = query_library_utils.$new_vars$.getDynamicValue(thread);
        }
        finally {
            query_library_utils.$new_vars$.rebind(_prev_bind_0, thread);
        }
        return Values.values(new_sentence, new_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 16289L)
    public static SubLObject instancefnP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(query_library_utils.NIL != cycl_grammar.cycl_expression_p(v_object) && cycl_utilities.formula_arg0(v_object).eql(query_library_utils.$const60$InstanceFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 16418L)
    public static SubLObject var_from_instancefn(final SubLObject instancefn_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)query_library_utils.NIL;
        result = reader.read_from_string_ignoring_errors(cycl_utilities.formula_arg1(instancefn_naut, (SubLObject)query_library_utils.UNPROVIDED), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        if (query_library_utils.NIL != result) {
            query_library_utils.$new_vars$.setDynamicValue((SubLObject)ConsesLow.cons(result, query_library_utils.$new_vars$.getDynamicValue(thread)), thread);
        }
        return (query_library_utils.NIL != result) ? result : instancefn_naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 16673L)
    public static SubLObject ql_template_parse_query(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == query_library_utils.UNPROVIDED) {
            existing_parses = (SubLObject)query_library_utils.NIL;
        }
        SubLObject full_results = existing_parses;
        final SubLObject domain_mt = query_library_utils.$const61$RKFParsingMt;
        SubLObject cdolist_list_var = rkf_text_processors.parse_a_question_completely(string, domain_mt, (SubLObject)query_library_utils.UNPROVIDED);
        SubLObject cycl = (SubLObject)query_library_utils.NIL;
        cycl = cdolist_list_var.first();
        while (query_library_utils.NIL != cdolist_list_var) {
            if (query_library_utils.NIL == contains_nlrequestfnP(cycl) && query_library_utils.NIL == cycl_utilities.expression_find(query_library_utils.$const62$playsActiveSubjectRole, cycl, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED) && query_library_utils.NIL != cyclifier.quick_sentential_parse_wffP(cycl)) {
                cycl = ql_pred_strengthen_sentence(cycl, domain_mt);
                full_results = (SubLObject)ConsesLow.cons(new_ql_parse(cycl, (SubLObject)query_library_utils.ONE_INTEGER, template_parse_complexity_weight(cycl)), full_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        }
        return Sort.sort(full_results, Symbols.symbol_function((SubLObject)query_library_utils.$sym38$_), (SubLObject)query_library_utils.$sym63$QL_PARSE_2ND_WEIGHT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 17737L)
    public static SubLObject template_parse_complexity_weight(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.expt(query_library_utils.$template_parse_complexity_weight_factor$.getDynamicValue(thread), function_terms.term_relational_complexity(cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18051L)
    public static SubLObject ql_interpret_cycl(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == query_library_utils.UNPROVIDED) {
            existing_parses = (SubLObject)query_library_utils.NIL;
        }
        final SubLObject result = reader.read_from_string_ignoring_errors(string_utilities.cyclify_string(string), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        if (query_library_utils.NIL != cycl_grammar.cycl_sentence_p(result)) {
            existing_parses = (SubLObject)ConsesLow.cons(new_ql_parse(result, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.UNPROVIDED), existing_parses);
        }
        return existing_parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18318L)
    public static SubLObject ql_text_answer_query(final SubLObject string, SubLObject existing_parses, SubLObject last_resortP) {
        if (existing_parses == query_library_utils.UNPROVIDED) {
            existing_parses = (SubLObject)query_library_utils.NIL;
        }
        if (last_resortP == query_library_utils.UNPROVIDED) {
            last_resortP = (SubLObject)query_library_utils.NIL;
        }
        if (query_library_utils.NIL == existing_parses || query_library_utils.NIL == last_resortP) {
            existing_parses = (SubLObject)ConsesLow.cons(new_ql_parse((SubLObject)ConsesLow.listS(query_library_utils.$const65$textAnswer, string, (SubLObject)query_library_utils.$list66), (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.UNPROVIDED), existing_parses);
        }
        return existing_parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18572L)
    public static SubLObject contains_nlrequestfnP(final SubLObject cycl) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find(query_library_utils.$const67$NLRequestFn, cycl, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 18828L)
    public static SubLObject clear_cae_kb_parameters() {
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
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 20762L)
    public static SubLObject default_inference_parameters_for_task(SubLObject task) {
        if (task == query_library_utils.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject ip = (SubLObject)query_library_utils.NIL;
        final SubLObject default_transformations_for_task = query_library_default_transformation_depth(task);
        final SubLObject default_max_time = query_library_default_max_time(task);
        final SubLObject default_indeterminate_terms_allowedP = query_library_default_indeterminate_terms_allowed(task);
        final SubLObject default_new_new_terms_allowedP = query_library_default_new_terms_allowed(task);
        final SubLObject default_disjunction_el_vars_policy = query_library_default_disjunction_free_el_vars_policy(task);
        final SubLObject default_max_productivity = query_library_default_max_productivity(task);
        final SubLObject default_compute_answer_justificationsP = query_library_default_compute_answer_justifications(task);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw68$MAX_TRANSFORMATION_DEPTH, default_transformations_for_task);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw69$ALLOW_INDETERMINATE_RESULTS_, default_indeterminate_terms_allowedP);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw70$NEW_TERMS_ALLOWED_, default_new_new_terms_allowedP);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw71$MAX_TIME, default_max_time);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw72$DISJUNCTION_FREE_EL_VARS_POLICY, default_disjunction_el_vars_policy);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw73$PRODUCTIVITY_LIMIT, default_max_productivity);
        ip = conses_high.putf(ip, (SubLObject)query_library_utils.$kw74$COMPUTE_ANSWER_JUSTIFICATIONS_, default_compute_answer_justificationsP);
        return ip;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 22182L)
    public static SubLObject get_auto_unification_mt(SubLObject task) {
        if (task == query_library_utils.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return get_default_wff_checking_mt(task);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 22306L)
    public static SubLObject cae_single_value_task_dependent_query_answer(final SubLObject task, final SubLObject query_template, SubLObject result_var, SubLObject default_value) {
        if (result_var == query_library_utils.UNPROVIDED) {
            result_var = (SubLObject)query_library_utils.NIL;
        }
        if (default_value == query_library_utils.UNPROVIDED) {
            default_value = (SubLObject)query_library_utils.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)query_library_utils.NIL;
        if (query_library_utils.NIL != forts.valid_fortP(query_template)) {
            final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
            try {
                cae_query_search.$current_cae_task$.bind(task, thread);
                final SubLObject v_bindings = kb_query.new_cyc_query_from_kbq(query_template, (SubLObject)query_library_utils.$list76, (SubLObject)query_library_utils.UNPROVIDED).first();
                if (query_library_utils.NIL == result_var && query_library_utils.NIL != list_utilities.singletonP(v_bindings)) {
                    result_var = bindings.variable_binding_variable(v_bindings.first());
                }
                if (query_library_utils.NIL != result_var) {
                    v_answer = bindings.variable_lookup(result_var, v_bindings);
                }
            }
            finally {
                cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
            }
        }
        return (query_library_utils.NIL != v_answer) ? v_answer : default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 22865L)
    public static SubLObject cae_multiple_value_task_dependent_query_answer(final SubLObject task, final SubLObject query_template, SubLObject result_var, SubLObject default_value) {
        if (result_var == query_library_utils.UNPROVIDED) {
            result_var = (SubLObject)query_library_utils.NIL;
        }
        if (default_value == query_library_utils.UNPROVIDED) {
            default_value = (SubLObject)query_library_utils.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = (SubLObject)query_library_utils.NIL;
        if (query_library_utils.NIL != forts.valid_fortP(query_template)) {
            final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
            try {
                cae_query_search.$current_cae_task$.bind(task, thread);
                SubLObject cdolist_list_var;
                final SubLObject v_bindings = cdolist_list_var = kb_query.new_cyc_query_from_kbq(query_template, (SubLObject)query_library_utils.$list77, (SubLObject)query_library_utils.UNPROVIDED);
                SubLObject binding = (SubLObject)query_library_utils.NIL;
                binding = cdolist_list_var.first();
                while (query_library_utils.NIL != cdolist_list_var) {
                    if (query_library_utils.NIL == result_var && query_library_utils.NIL != list_utilities.singletonP(binding)) {
                        result_var = bindings.variable_binding_variable(binding.first());
                    }
                    if (query_library_utils.NIL != result_var) {
                        final SubLObject item_var = bindings.variable_lookup(result_var, binding);
                        if (query_library_utils.NIL == conses_high.member(item_var, v_answer, Symbols.symbol_function((SubLObject)query_library_utils.EQL), Symbols.symbol_function((SubLObject)query_library_utils.IDENTITY))) {
                            v_answer = (SubLObject)ConsesLow.cons(item_var, v_answer);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    binding = cdolist_list_var.first();
                }
            }
            finally {
                cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
            }
        }
        return (query_library_utils.NIL != v_answer) ? v_answer : default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
    public static SubLObject clear_cae_fact_editor_focal_types() {
        final SubLObject cs = query_library_utils.$cae_fact_editor_focal_types_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
    public static SubLObject remove_cae_fact_editor_focal_types(SubLObject task) {
        if (task == query_library_utils.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_fact_editor_focal_types_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
    public static SubLObject cae_fact_editor_focal_types_internal(final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_template = query_library_utils.$const79$CAEFactEditorFocalTypeQuery;
        SubLObject result = (SubLObject)query_library_utils.NIL;
        final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
        try {
            cae_query_search.$current_cae_task$.bind(task, thread);
            SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq(query_template, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
            SubLObject binding = (SubLObject)query_library_utils.NIL;
            binding = cdolist_list_var.first();
            while (query_library_utils.NIL != cdolist_list_var) {
                final SubLObject Ptemplate = conses_high.sublis(binding, (SubLObject)query_library_utils.$sym80$_TEMPLATE, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
                result = (SubLObject)ConsesLow.cons(Ptemplate, result);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
        }
        finally {
            cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23461L)
    public static SubLObject cae_fact_editor_focal_types(SubLObject task) {
        if (task == query_library_utils.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject caching_state = query_library_utils.$cae_fact_editor_focal_types_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym78$CAE_FACT_EDITOR_FOCAL_TYPES, (SubLObject)query_library_utils.$sym81$_CAE_FACT_EDITOR_FOCAL_TYPES_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_fact_editor_focal_types_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
    public static SubLObject clear_get_default_wff_checking_mt() {
        final SubLObject cs = query_library_utils.$get_default_wff_checking_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
    public static SubLObject remove_get_default_wff_checking_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$get_default_wff_checking_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
    public static SubLObject get_default_wff_checking_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const83$CAEWFFCheckingMtQuery, (SubLObject)query_library_utils.$sym84$_MT, query_library_utils.$const85$CurrentWorldDataCollectorMt_NonHo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 23806L)
    public static SubLObject get_default_wff_checking_mt(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$get_default_wff_checking_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym82$GET_DEFAULT_WFF_CHECKING_MT, (SubLObject)query_library_utils.$sym86$_GET_DEFAULT_WFF_CHECKING_MT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_default_wff_checking_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
    public static SubLObject clear_get_default_cae_guidance_mt() {
        final SubLObject cs = query_library_utils.$get_default_cae_guidance_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
    public static SubLObject remove_get_default_cae_guidance_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$get_default_cae_guidance_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
    public static SubLObject get_default_cae_guidance_mt_internal(final SubLObject task) {
        SubLObject v_answer = (SubLObject)query_library_utils.NIL;
        if (query_library_utils.NIL != constant_handles.valid_constantP(query_library_utils.$const88$CAEGuidanceMtQuery, (SubLObject)query_library_utils.UNPROVIDED)) {
            v_answer = cae_single_value_task_dependent_query_answer(task, query_library_utils.$const88$CAEGuidanceMtQuery, (SubLObject)query_library_utils.$sym84$_MT, query_library_utils.$const85$CurrentWorldDataCollectorMt_NonHo);
        }
        if (query_library_utils.NIL == v_answer) {
            v_answer = cae_single_value_task_dependent_query_answer(task, query_library_utils.$const83$CAEWFFCheckingMtQuery, (SubLObject)query_library_utils.$sym84$_MT, query_library_utils.$const85$CurrentWorldDataCollectorMt_NonHo);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24034L)
    public static SubLObject get_default_cae_guidance_mt(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$get_default_cae_guidance_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym87$GET_DEFAULT_CAE_GUIDANCE_MT, (SubLObject)query_library_utils.$sym89$_GET_DEFAULT_CAE_GUIDANCE_MT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)query_library_utils.$sym90$CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_default_cae_guidance_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24639L)
    public static SubLObject get_all_default_wff_checking_mts() {
        return ask_utilities.query_variable((SubLObject)query_library_utils.$sym84$_MT, (SubLObject)query_library_utils.$list91, query_library_utils.$const92$CycArchitectureMt, (SubLObject)query_library_utils.$list93);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
    public static SubLObject clear_query_library_default_query_mt() {
        final SubLObject cs = query_library_utils.$query_library_default_query_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
    public static SubLObject remove_query_library_default_query_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_query_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
    public static SubLObject query_library_default_query_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const95$CAEDefaultQueryMtQuery, (SubLObject)query_library_utils.$sym84$_MT, query_library_utils.$const85$CurrentWorldDataCollectorMt_NonHo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 24825L)
    public static SubLObject query_library_default_query_mt(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_query_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT, (SubLObject)query_library_utils.$sym96$_QUERY_LIBRARY_DEFAULT_QUERY_MT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_query_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
    public static SubLObject clear_query_library_query_search_fact_sheet_links_enabledP() {
        final SubLObject cs = query_library_utils.$query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
    public static SubLObject remove_query_library_query_search_fact_sheet_links_enabledP(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
    public static SubLObject query_library_query_search_fact_sheet_links_enabledP_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, query_library_query_search_fact_sheet_links_enabledP_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25057L)
    public static SubLObject query_library_query_search_fact_sheet_links_enabledP(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_, (SubLObject)query_library_utils.$sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_query_search_fact_sheet_links_enabledP_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25258L)
    public static SubLObject query_library_query_search_fact_sheet_links_enabledP_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const100$CAEQuerySearchFactSheetLinksEnabl, (SubLObject)query_library_utils.$sym101$_VALUE, query_library_utils.$const98$True);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
    public static SubLObject clear_rtv_panel_enabled_for_task() {
        final SubLObject cs = query_library_utils.$rtv_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
    public static SubLObject remove_rtv_panel_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$rtv_panel_enabled_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
    public static SubLObject rtv_panel_enabled_for_task_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, rtv_panel_enabled_for_task_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25460L)
    public static SubLObject rtv_panel_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$rtv_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym102$RTV_PANEL_ENABLED_FOR_TASK, (SubLObject)query_library_utils.$sym103$_RTV_PANEL_ENABLED_FOR_TASK_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rtv_panel_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25609L)
    public static SubLObject rtv_panel_enabled_for_task_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const104$CAERTVPanelEnabledQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
    public static SubLObject clear_document_search_panel_enabled_for_task() {
        final SubLObject cs = query_library_utils.$document_search_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
    public static SubLObject remove_document_search_panel_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$document_search_panel_enabled_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
    public static SubLObject document_search_panel_enabled_for_task_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, document_search_panel_enabled_for_task_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25757L)
    public static SubLObject document_search_panel_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$document_search_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK, (SubLObject)query_library_utils.$sym107$_DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(document_search_panel_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 25930L)
    public static SubLObject document_search_panel_enabled_for_task_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const108$CAETextSearchPanelEnabledQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const98$True;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const108$CAETextSearchPanelEnabledQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
    public static SubLObject clear_source_information_enabled_for_task() {
        final SubLObject cs = query_library_utils.$source_information_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
    public static SubLObject remove_source_information_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$source_information_enabled_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
    public static SubLObject source_information_enabled_for_task_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, source_information_enabled_for_task_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26179L)
    public static SubLObject source_information_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$source_information_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK, (SubLObject)query_library_utils.$sym110$_SOURCE_INFORMATION_ENABLED_FOR_TASK_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(source_information_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26346L)
    public static SubLObject source_information_enabled_for_task_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const111$CAESourceInformationEnabledQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const98$True;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const111$CAESourceInformationEnabledQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
    public static SubLObject clear_irrelevant_results_allowed_for_task() {
        final SubLObject cs = query_library_utils.$irrelevant_results_allowed_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
    public static SubLObject remove_irrelevant_results_allowed_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$irrelevant_results_allowed_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
    public static SubLObject irrelevant_results_allowed_for_task_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, irrelevant_results_allowed_for_task_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26596L)
    public static SubLObject irrelevant_results_allowed_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$irrelevant_results_allowed_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK, (SubLObject)query_library_utils.$sym113$_IRRELEVANT_RESULTS_ALLOWED_FOR_TASK_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(irrelevant_results_allowed_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 26763L)
    public static SubLObject irrelevant_results_allowed_for_task_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const114$CAEIrrelevantTermAllowedQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const114$CAEIrrelevantTermAllowedQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
    public static SubLObject clear_report_generation_enabled_for_task() {
        final SubLObject cs = query_library_utils.$report_generation_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
    public static SubLObject remove_report_generation_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$report_generation_enabled_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
    public static SubLObject report_generation_enabled_for_task_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, report_generation_enabled_for_task_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27008L)
    public static SubLObject report_generation_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$report_generation_enabled_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym116$REPORT_GENERATION_ENABLED_FOR_TASK, (SubLObject)query_library_utils.$sym117$_REPORT_GENERATION_ENABLED_FOR_TASK_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(report_generation_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27173L)
    public static SubLObject report_generation_enabled_for_task_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const118$CAEReportGenerationEnabledQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const118$CAEReportGenerationEnabledQuery, (SubLObject)query_library_utils.$sym105$_TV, query_library_utils.$const115$False);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
    public static SubLObject clear_report_generation_template_root_collection_for_task() {
        final SubLObject cs = query_library_utils.$report_generation_template_root_collection_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
    public static SubLObject remove_report_generation_template_root_collection_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$report_generation_template_root_collection_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
    public static SubLObject report_generation_template_root_collection_for_task_internal(final SubLObject task) {
        return report_generation_template_root_collection_for_task_int(task);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27429L)
    public static SubLObject report_generation_template_root_collection_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$report_generation_template_root_collection_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK, (SubLObject)query_library_utils.$sym120$_REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK_CACHING_STAT, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(report_generation_template_root_collection_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27616L)
    public static SubLObject report_generation_template_root_collection_for_task_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const121$CAEReportGenerationTemplateRootCo, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const122$ReportGenerationTemplate;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const121$CAEReportGenerationTemplateRootCo, (SubLObject)query_library_utils.$sym123$_COL, query_library_utils.$const122$ReportGenerationTemplate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
    public static SubLObject clear_task_allows_not() {
        final SubLObject cs = query_library_utils.$task_allows_not_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
    public static SubLObject remove_task_allows_not(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$task_allows_not_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
    public static SubLObject task_allows_not_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, task_allows_not_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 27958L)
    public static SubLObject task_allows_not(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$task_allows_not_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym124$TASK_ALLOWS_NOT, (SubLObject)query_library_utils.$sym125$_TASK_ALLOWS_NOT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(task_allows_not_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28085L)
    public static SubLObject task_allows_not_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const126$CAEAllowsNotQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const126$CAEAllowsNotQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
    public static SubLObject clear_task_allows_implies() {
        final SubLObject cs = query_library_utils.$task_allows_implies_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
    public static SubLObject remove_task_allows_implies(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$task_allows_implies_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
    public static SubLObject task_allows_implies_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, task_allows_implies_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28286L)
    public static SubLObject task_allows_implies(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$task_allows_implies_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym127$TASK_ALLOWS_IMPLIES, (SubLObject)query_library_utils.$sym128$_TASK_ALLOWS_IMPLIES_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(task_allows_implies_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28421L)
    public static SubLObject task_allows_implies_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const129$CAEAllowsImpliesQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const129$CAEAllowsImpliesQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
    public static SubLObject clear_task_allows_and() {
        final SubLObject cs = query_library_utils.$task_allows_and_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
    public static SubLObject remove_task_allows_and(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$task_allows_and_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
    public static SubLObject task_allows_and_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, task_allows_and_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28634L)
    public static SubLObject task_allows_and(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$task_allows_and_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym130$TASK_ALLOWS_AND, (SubLObject)query_library_utils.$sym131$_TASK_ALLOWS_AND_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(task_allows_and_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28761L)
    public static SubLObject task_allows_and_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const132$CAEAllowsAndQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const132$CAEAllowsAndQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
    public static SubLObject clear_task_allows_or() {
        final SubLObject cs = query_library_utils.$task_allows_or_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
    public static SubLObject remove_task_allows_or(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$task_allows_or_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
    public static SubLObject task_allows_or_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, task_allows_or_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 28962L)
    public static SubLObject task_allows_or(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$task_allows_or_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym133$TASK_ALLOWS_OR, (SubLObject)query_library_utils.$sym134$_TASK_ALLOWS_OR_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(task_allows_or_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29087L)
    public static SubLObject task_allows_or_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const135$CAEAllowsOrQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const135$CAEAllowsOrQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
    public static SubLObject clear_task_allows_unknown_sentence() {
        final SubLObject cs = query_library_utils.$task_allows_unknown_sentence_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
    public static SubLObject remove_task_allows_unknown_sentence(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$task_allows_unknown_sentence_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
    public static SubLObject task_allows_unknown_sentence_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, task_allows_unknown_sentence_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29285L)
    public static SubLObject task_allows_unknown_sentence(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$task_allows_unknown_sentence_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym136$TASK_ALLOWS_UNKNOWN_SENTENCE, (SubLObject)query_library_utils.$sym137$_TASK_ALLOWS_UNKNOWN_SENTENCE_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(task_allows_unknown_sentence_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29438L)
    public static SubLObject task_allows_unknown_sentence_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const138$CAEAllowsUnknownSentenceQuery, (SubLObject)query_library_utils.T)) {
            return query_library_utils.$const115$False;
        }
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const138$CAEAllowsUnknownSentenceQuery, (SubLObject)query_library_utils.$sym105$_TV, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
    public static SubLObject clear_sparql_browser_urls_for_task() {
        final SubLObject cs = query_library_utils.$sparql_browser_urls_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
    public static SubLObject remove_sparql_browser_urls_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$sparql_browser_urls_for_task_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
    public static SubLObject sparql_browser_urls_for_task_internal(final SubLObject task) {
        return sparql_browser_urls_for_task_int(task);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29676L)
    public static SubLObject sparql_browser_urls_for_task(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$sparql_browser_urls_for_task_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym139$SPARQL_BROWSER_URLS_FOR_TASK, (SubLObject)query_library_utils.$sym140$_SPARQL_BROWSER_URLS_FOR_TASK_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sparql_browser_urls_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 29817L)
    public static SubLObject sparql_browser_urls_for_task_int(final SubLObject task) {
        if (query_library_utils.NIL == constant_handles.valid_constantP(query_library_utils.$const141$CAESPARQLBrowserAddressQuery, (SubLObject)query_library_utils.T)) {
            return (SubLObject)query_library_utils.NIL;
        }
        return Mapping.mapcar((SubLObject)query_library_utils.$sym142$URL_STRING, cae_multiple_value_task_dependent_query_answer(task, query_library_utils.$const141$CAESPARQLBrowserAddressQuery, (SubLObject)query_library_utils.$sym143$_URL, (SubLObject)query_library_utils.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
    public static SubLObject clear_query_library_root_folder() {
        final SubLObject cs = query_library_utils.$query_library_root_folder_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
    public static SubLObject remove_query_library_root_folder(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_root_folder_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
    public static SubLObject query_library_root_folder_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const145$CAEQueryLibraryRootFolderQuery, (SubLObject)query_library_utils.$sym84$_MT, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30072L)
    public static SubLObject query_library_root_folder(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_root_folder_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym144$QUERY_LIBRARY_ROOT_FOLDER, (SubLObject)query_library_utils.$sym146$_QUERY_LIBRARY_ROOT_FOLDER_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_root_folder_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
    public static SubLObject clear_query_library_should_suggestions_be_intersected() {
        final SubLObject cs = query_library_utils.$query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
    public static SubLObject remove_query_library_should_suggestions_be_intersected(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
    public static SubLObject query_library_should_suggestions_be_intersected_internal(final SubLObject task) {
        return Equality.eq(query_library_utils.$const98$True, cae_single_value_task_dependent_query_answer(task, query_library_utils.$const148$CAEQueryLibraryShouldSuggestionsB, (SubLObject)query_library_utils.$sym149$_TRUTH, (SubLObject)query_library_utils.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30260L)
    public static SubLObject query_library_should_suggestions_be_intersected(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED, (SubLObject)query_library_utils.$sym150$_QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_should_suggestions_be_intersected_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
    public static SubLObject clear_query_library_default_transformation_depth() {
        final SubLObject cs = query_library_utils.$query_library_default_transformation_depth_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
    public static SubLObject remove_query_library_default_transformation_depth(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_transformation_depth_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
    public static SubLObject query_library_default_transformation_depth_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const152$CAEQueryLibraryDefaultTransformat, (SubLObject)query_library_utils.$sym84$_MT, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30505L)
    public static SubLObject query_library_default_transformation_depth(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_transformation_depth_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH, (SubLObject)query_library_utils.$sym153$_QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_transformation_depth_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
    public static SubLObject clear_query_library_default_compute_answer_justifications() {
        final SubLObject cs = query_library_utils.$query_library_default_compute_answer_justifications_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
    public static SubLObject remove_query_library_default_compute_answer_justifications(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_compute_answer_justifications_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
    public static SubLObject query_library_default_compute_answer_justifications_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(cae_single_value_task_dependent_query_answer(task, query_library_utils.$const155$CAEQueryLibraryDefaultComputeAnsw, (SubLObject)query_library_utils.$sym101$_VALUE, (SubLObject)query_library_utils.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30731L)
    public static SubLObject query_library_default_compute_answer_justifications(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_compute_answer_justifications_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS, (SubLObject)query_library_utils.$sym156$_QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS_CACHING_STAT, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_compute_answer_justifications_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
    public static SubLObject clear_query_library_default_max_time() {
        final SubLObject cs = query_library_utils.$query_library_default_max_time_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
    public static SubLObject remove_query_library_default_max_time(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_max_time_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
    public static SubLObject query_library_default_max_time_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const158$CAEQueryLibraryDefaultMaxTimeQuer, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 30998L)
    public static SubLObject query_library_default_max_time(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_max_time_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME, (SubLObject)query_library_utils.$sym159$_QUERY_LIBRARY_DEFAULT_MAX_TIME_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_max_time_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
    public static SubLObject clear_query_library_default_max_productivity() {
        final SubLObject cs = query_library_utils.$query_library_default_max_productivity_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
    public static SubLObject remove_query_library_default_max_productivity(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_max_productivity_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
    public static SubLObject query_library_default_max_productivity_internal(final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = cae_single_value_task_dependent_query_answer(task, query_library_utils.$const161$CAEQueryLibraryDefaultMaxProducti, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
        if (query_library_utils.NIL != value && query_library_utils.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && query_library_utils.NIL == number_utilities.non_negative_number_p(value) && !value.eql(query_library_utils.$const162$PlusInfinity)) {
            Errors.error((SubLObject)query_library_utils.$str163$Got_invalid_default__productivity, value, task);
        }
        return (query_library_utils.NIL != value) ? value : inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31190L)
    public static SubLObject query_library_default_max_productivity(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_max_productivity_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY, (SubLObject)query_library_utils.$sym164$_QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_max_productivity_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
    public static SubLObject clear_query_library_default_new_terms_allowed() {
        final SubLObject cs = query_library_utils.$query_library_default_new_terms_allowed_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
    public static SubLObject remove_query_library_default_new_terms_allowed(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_new_terms_allowed_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
    public static SubLObject query_library_default_new_terms_allowed_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(query_library_default_new_terms_allowed_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31626L)
    public static SubLObject query_library_default_new_terms_allowed(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_new_terms_allowed_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED, (SubLObject)query_library_utils.$sym166$_QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_new_terms_allowed_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31814L)
    public static SubLObject query_library_default_new_terms_allowed_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const167$CAEQueryLibraryDefaultNewTermsAll, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
    public static SubLObject clear_allow_arbitrary_assertion_deletion() {
        final SubLObject cs = query_library_utils.$allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
    public static SubLObject remove_allow_arbitrary_assertion_deletion(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
    public static SubLObject allow_arbitrary_assertion_deletion_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(allow_arbitrary_assertion_deletion_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 31988L)
    public static SubLObject allow_arbitrary_assertion_deletion(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym168$ALLOW_ARBITRARY_ASSERTION_DELETION, (SubLObject)query_library_utils.$sym169$_ALLOW_ARBITRARY_ASSERTION_DELETION_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(allow_arbitrary_assertion_deletion_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32166L)
    public static SubLObject allow_arbitrary_assertion_deletion_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const170$AppAllowsArbitraryAssertionDeleti, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
    public static SubLObject clear_query_library_default_indeterminate_terms_allowed() {
        final SubLObject cs = query_library_utils.$query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
    public static SubLObject remove_query_library_default_indeterminate_terms_allowed(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
    public static SubLObject query_library_default_indeterminate_terms_allowed_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(query_library_default_indeterminate_terms_allowed_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32333L)
    public static SubLObject query_library_default_indeterminate_terms_allowed(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED, (SubLObject)query_library_utils.$sym172$_QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_indeterminate_terms_allowed_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32541L)
    public static SubLObject query_library_default_indeterminate_terms_allowed_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const173$CAEQueryLibraryDefaultIndetermina, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
    public static SubLObject clear_query_library_default_disjunction_free_el_vars_policy() {
        final SubLObject cs = query_library_utils.$query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
    public static SubLObject remove_query_library_default_disjunction_free_el_vars_policy(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
    public static SubLObject query_library_default_disjunction_free_el_vars_policy_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(query_library_default_disjunction_free_el_vars_policy_int(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32735L)
    public static SubLObject query_library_default_disjunction_free_el_vars_policy(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY, (SubLObject)query_library_utils.$sym175$_QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY_CACHING_ST, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_default_disjunction_free_el_vars_policy_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 32951L)
    public static SubLObject query_library_default_disjunction_free_el_vars_policy_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const176$CAEQueryLibraryDefaultDisjunction, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
    public static SubLObject clear_cae_query_search_filter() {
        final SubLObject cs = query_library_utils.$cae_query_search_filter_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
    public static SubLObject remove_cae_query_search_filter(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_query_search_filter_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
    public static SubLObject cae_query_search_filter_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const178$CAEQuerySearchFilterQuery, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33151L)
    public static SubLObject cae_query_search_filter(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_query_search_filter_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym177$CAE_QUERY_SEARCH_FILTER, (SubLObject)query_library_utils.$sym179$_CAE_QUERY_SEARCH_FILTER_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_query_search_filter_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
    public static SubLObject clear_cae_query_search_filter_specification() {
        final SubLObject cs = query_library_utils.$cae_query_search_filter_specification_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
    public static SubLObject remove_cae_query_search_filter_specification(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_query_search_filter_specification_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
    public static SubLObject cae_query_search_filter_specification_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const181$CAEQuerySearchFilterSpecification, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33325L)
    public static SubLObject cae_query_search_filter_specification(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_query_search_filter_specification_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION, (SubLObject)query_library_utils.$sym182$_CAE_QUERY_SEARCH_FILTER_SPECIFICATION_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_query_search_filter_specification_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
    public static SubLObject clear_cae_query_search_filter_string() {
        final SubLObject cs = query_library_utils.$cae_query_search_filter_string_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
    public static SubLObject remove_cae_query_search_filter_string(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_query_search_filter_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
    public static SubLObject cae_query_search_filter_string_internal(final SubLObject task) {
        final SubLObject filter = cae_query_search_filter(task);
        final SubLObject filter_tree = ask_utilities.query_variable((SubLObject)query_library_utils.$sym184$_TREE, (SubLObject)ConsesLow.listS(query_library_utils.$const185$and, (SubLObject)ConsesLow.listS(query_library_utils.$const186$conceptFilterDecisionTree, filter, (SubLObject)query_library_utils.$list187), (SubLObject)query_library_utils.$list188), query_library_utils.$const54$InferencePSC, (SubLObject)query_library_utils.UNPROVIDED).first();
        return filter_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33526L)
    public static SubLObject cae_query_search_filter_string(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_query_search_filter_string_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym183$CAE_QUERY_SEARCH_FILTER_STRING, (SubLObject)query_library_utils.$sym189$_CAE_QUERY_SEARCH_FILTER_STRING_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_query_search_filter_string_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
    public static SubLObject clear_cae_query_search_term_classification_tree() {
        final SubLObject cs = query_library_utils.$cae_query_search_term_classification_tree_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
    public static SubLObject remove_cae_query_search_term_classification_tree(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_query_search_term_classification_tree_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
    public static SubLObject cae_query_search_term_classification_tree_internal(final SubLObject task) {
        return decision_tree.new_decision_tree_from_weka_j48_format(cae_query_search_filter_string(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 33998L)
    public static SubLObject cae_query_search_term_classification_tree(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_query_search_term_classification_tree_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE, (SubLObject)query_library_utils.$sym191$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_query_search_term_classification_tree_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
    public static SubLObject clear_cae_query_search_term_classification_tree_collections() {
        final SubLObject cs = query_library_utils.$cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
    public static SubLObject remove_cae_query_search_term_classification_tree_collections(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
    public static SubLObject cae_query_search_term_classification_tree_collections_internal(final SubLObject task) {
        return term_classification_tree.create_term_classification_tree_collections(cae_query_search_term_classification_tree(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34306L)
    public static SubLObject cae_query_search_term_classification_tree_collections(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS, (SubLObject)query_library_utils.$sym193$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS_CACHING_ST, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_query_search_term_classification_tree_collections_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
    public static SubLObject clear_cae_default_paraphrase_mt() {
        final SubLObject cs = query_library_utils.$cae_default_paraphrase_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
    public static SubLObject remove_cae_default_paraphrase_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_default_paraphrase_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
    public static SubLObject cae_default_paraphrase_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const195$CAEDefaultParaphraseMtQuery, (SubLObject)query_library_utils.$sym84$_MT, query_library_utils.$const196$EnglishParaphraseMt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34655L)
    public static SubLObject cae_default_paraphrase_mt(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_default_paraphrase_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym194$CAE_DEFAULT_PARAPHRASE_MT, (SubLObject)query_library_utils.$sym197$_CAE_DEFAULT_PARAPHRASE_MT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_default_paraphrase_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
    public static SubLObject clear_cae_default_parsing_mt() {
        final SubLObject cs = query_library_utils.$cae_default_parsing_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
    public static SubLObject remove_cae_default_parsing_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_default_parsing_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
    public static SubLObject cae_default_parsing_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const199$CAEDefaultParsingMtQuery, (SubLObject)query_library_utils.$sym84$_MT, (SubLObject)query_library_utils.$list200);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 34862L)
    public static SubLObject cae_default_parsing_mt(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_default_parsing_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym198$CAE_DEFAULT_PARSING_MT, (SubLObject)query_library_utils.$sym201$_CAE_DEFAULT_PARSING_MT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_default_parsing_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
    public static SubLObject clear_cae_default_nl_domain_mt() {
        final SubLObject cs = query_library_utils.$cae_default_nl_domain_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
    public static SubLObject remove_cae_default_nl_domain_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_default_nl_domain_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
    public static SubLObject cae_default_nl_domain_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, query_library_utils.$const203$CAEDefaultNLDomainMtQuery, (SubLObject)query_library_utils.$sym84$_MT, query_library_utils.$const85$CurrentWorldDataCollectorMt_NonHo);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35130L)
    public static SubLObject cae_default_nl_domain_mt(final SubLObject task) {
        SubLObject caching_state = query_library_utils.$cae_default_nl_domain_mt_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym202$CAE_DEFAULT_NL_DOMAIN_MT, (SubLObject)query_library_utils.$sym204$_CAE_DEFAULT_NL_DOMAIN_MT_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_default_nl_domain_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35358L)
    public static SubLObject cae_get_nl_mts_from_task(final SubLObject task) {
        return (SubLObject)ConsesLow.list(cae_default_nl_domain_mt(task), cae_default_paraphrase_mt(task), cae_default_parsing_mt(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35531L)
    public static SubLObject cae_get_cae_mts_from_task(final SubLObject task) {
        return (SubLObject)ConsesLow.list(cae_default_nl_domain_mt(task), cae_default_paraphrase_mt(task), cae_default_parsing_mt(task), query_library_default_query_mt(task));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
    public static SubLObject clear_cae_topic() {
        final SubLObject cs = query_library_utils.$cae_topic_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
    public static SubLObject remove_cae_topic(SubLObject task) {
        if (task == query_library_utils.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$cae_topic_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(task), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
    public static SubLObject cae_topic_internal(final SubLObject task) {
        return (SubLObject)((query_library_utils.NIL != misc_utilities.initialized_p(task)) ? ask_utilities.query_variable((SubLObject)query_library_utils.$sym208$_TOPIC, (SubLObject)ConsesLow.list(query_library_utils.$const185$and, (SubLObject)query_library_utils.$list209, (SubLObject)ConsesLow.listS(query_library_utils.$const210$topicOfIndividual, task, (SubLObject)query_library_utils.$list211)), query_library_utils.$const54$InferencePSC, (SubLObject)query_library_utils.$list212).first() : query_library_utils.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 35749L)
    public static SubLObject cae_topic(SubLObject task) {
        if (task == query_library_utils.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject caching_state = query_library_utils.$cae_topic_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym207$CAE_TOPIC, (SubLObject)query_library_utils.$sym213$_CAE_TOPIC_CACHING_STATE_, (SubLObject)query_library_utils.NIL, (SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cae_topic_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 36072L)
    public static SubLObject cae_task_topic_changed(final SubLObject argument, final SubLObject assertion) {
        final SubLObject task = assertions_high.gaf_arg1(assertion);
        remove_get_default_wff_checking_mt(task);
        remove_cae_fact_editor_focal_types(task);
        remove_query_library_root_folder(task);
        remove_query_library_default_query_mt(task);
        remove_cae_query_search_filter(task);
        remove_cae_query_search_filter_string(task);
        remove_cae_query_search_term_classification_tree(task);
        remove_cae_query_search_term_classification_tree_collections(task);
        remove_cae_default_paraphrase_mt(task);
        remove_cae_default_parsing_mt(task);
        remove_cae_default_nl_domain_mt(task);
        remove_cae_topic(task);
        return (SubLObject)query_library_utils.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 36989L)
    public static SubLObject store_original_string_for_template_id(final SubLObject template_id, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter(query_library_utils.$original_query_strings$.getDynamicValue(thread), template_id, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 37139L)
    public static SubLObject get_original_string_for_query(final SubLObject template_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_string = dictionary.dictionary_lookup(query_library_utils.$original_query_strings$.getDynamicValue(thread), narts_high.nart_substitute(template_id), (SubLObject)query_library_utils.$str215$failed_to_find_original_query_str);
        return original_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 37372L)
    public static SubLObject parsed_query_template_p(final SubLObject template_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup(query_library_utils.$original_query_strings$.getDynamicValue(thread), narts_high.nart_substitute(template_id), (SubLObject)query_library_utils.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 37523L)
    public static SubLObject new_query_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)query_library_utils.NIL;
        if (query_library_utils.NIL != constant_handles.valid_constant(query_library_utils.$const217$QueryLibrary_QueryCreationTemplat, (SubLObject)query_library_utils.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(query_library_template_forward_rules(query_library_utils.$const217$QueryLibrary_QueryCreationTemplat), thread);
                result = czer_main.cyc_find_or_create_nart((SubLObject)ConsesLow.list(query_library_utils.$const218$TemplateFromTestQueryFn, rkf_term_utilities.create_new_constant((SubLObject)query_library_utils.$str219$UserQuery, (SubLObject)query_library_utils.$list220, (SubLObject)query_library_utils.NIL, query_library_utils.$const221$TestVocabularyMt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED)), (SubLObject)query_library_utils.UNPROVIDED);
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            result = czer_main.cyc_find_or_create_nart((SubLObject)ConsesLow.list(query_library_utils.$const218$TemplateFromTestQueryFn, rkf_term_utilities.create_new_constant((SubLObject)query_library_utils.$str219$UserQuery, (SubLObject)query_library_utils.$list220, (SubLObject)query_library_utils.NIL, query_library_utils.$const221$TestVocabularyMt, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED)), (SubLObject)query_library_utils.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38240L)
    public static SubLObject next_query_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_library_utils.$latest_query_id$.setDynamicValue(Numbers.add(query_library_utils.$latest_query_id$.getDynamicValue(thread), (SubLObject)query_library_utils.ONE_INTEGER), thread);
        return query_library_utils.$latest_query_id$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
    public static SubLObject clear_query_library_template_forward_rules() {
        final SubLObject cs = query_library_utils.$query_library_template_forward_rules_caching_state$.getGlobalValue();
        if (query_library_utils.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
    public static SubLObject remove_query_library_template_forward_rules(final SubLObject creation_template) {
        return memoization_state.caching_state_remove_function_results_with_args(query_library_utils.$query_library_template_forward_rules_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(creation_template), (SubLObject)query_library_utils.UNPROVIDED, (SubLObject)query_library_utils.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
    public static SubLObject query_library_template_forward_rules_internal(final SubLObject creation_template) {
        return forward.creation_template_forward_rules_via_exemplars(creation_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 38328L)
    public static SubLObject query_library_template_forward_rules(final SubLObject creation_template) {
        SubLObject caching_state = query_library_utils.$query_library_template_forward_rules_caching_state$.getGlobalValue();
        if (query_library_utils.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_library_utils.$sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES, (SubLObject)query_library_utils.$sym223$_QUERY_LIBRARY_TEMPLATE_FORWARD_RULES_CACHING_STATE_, (SubLObject)query_library_utils.TEN_INTEGER, (SubLObject)query_library_utils.EQ, (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)query_library_utils.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, creation_template, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(query_library_template_forward_rules_internal(creation_template)));
            memoization_state.caching_state_put(caching_state, creation_template, results, (SubLObject)query_library_utils.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 39353L)
    public static SubLObject kill_query_template_and_query(final SubLObject query_template) {
        final SubLObject possible_test_query = inverted_index_query_library.test_query_for_template(query_template, query_library_utils.$const54$InferencePSC);
        final SubLObject possible_query_spec = (SubLObject)((query_library_utils.NIL != nart_handles.nart_p(possible_test_query) && cycl_utilities.nat_functor(possible_test_query).eql(query_library_utils.$const225$TestQueryFn)) ? cycl_utilities.nat_arg1(possible_test_query, (SubLObject)query_library_utils.UNPROVIDED) : query_library_utils.NIL);
        final SubLObject result = (SubLObject)((query_library_utils.NIL != forts.fort_p(possible_query_spec)) ? ke.ke_kill_now(possible_query_spec) : ((query_library_utils.NIL != kb_query.kbq_query_spec_p(possible_test_query)) ? ke.ke_kill_now(possible_test_query) : ((query_library_utils.NIL != forts.fort_p(query_template)) ? ke.ke_kill_now(query_template) : query_library_utils.NIL)));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 40062L)
    public static SubLObject kill_query_library(final SubLObject query_library) {
        api_widgets.kill_constant(query_library);
        return (SubLObject)query_library_utils.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 40194L)
    public static SubLObject pred_strengthen_unambiguously_test(final SubLObject new_answer, final SubLObject expected) {
        if (query_library_utils.NIL != subl_promotions.memberP(expected, new_answer, (SubLObject)query_library_utils.$sym227$EQUALS_EL_, (SubLObject)query_library_utils.UNPROVIDED)) {
            return (SubLObject)query_library_utils.T;
        }
        return (SubLObject)query_library_utils.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-library-utils.lisp", position = 40194L)
    public static SubLObject get_cycls_for_unindexed_string_tct(final SubLObject string, final SubLObject target_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject registered_ql_parsers_old = query_library_utils.$registered_ql_parsers$.getDynamicValue(thread);
        SubLObject result = (SubLObject)query_library_utils.NIL;
        register_default_ql_parsers();
        final SubLObject ql_parses = get_cycls_for_unindexed_string(string);
        final SubLObject cycls = Mapping.mapcar((SubLObject)query_library_utils.$sym19$QL_PARSE_CYCL, ql_parses);
        result = subl_promotions.memberP(target_cycl, cycls, (SubLObject)query_library_utils.$sym227$EQUALS_EL_, (SubLObject)query_library_utils.UNPROVIDED);
        query_library_utils.$registered_ql_parsers$.setDynamicValue(registered_ql_parsers_old, thread);
        return result;
    }
    
    public static SubLObject declare_query_library_utils_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "log_query_library_search", "LOG-QUERY-LIBRARY-SEARCH", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "unindexed_queries_from_string", "UNINDEXED-QUERIES-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "unindexed_queries_from_string_with_confidences", "UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "new_weighted_xml", "NEW-WEIGHTED-XML", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_all_query_library_parsers", "REGISTER-ALL-QUERY-LIBRARY-PARSERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_cyclify_parser", "REGISTER-CYCLIFY-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_cyclify_link_parser", "REGISTER-CYCLIFY-LINK-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "deregister_cyclify_parser", "DEREGISTER-CYCLIFY-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_template_parser", "REGISTER-TEMPLATE-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "deregister_template_parser", "DEREGISTER-TEMPLATE-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_text_answers", "REGISTER-TEXT-ANSWERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_text_answers_as_last_resort", "REGISTER-TEXT-ANSWERS-AS-LAST-RESORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "deregister_text_answers", "DEREGISTER-TEXT-ANSWERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_ebmt", "REGISTER-EBMT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "deregister_ebmt", "DEREGISTER-EBMT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "register_default_ql_parsers", "REGISTER-DEFAULT-QL-PARSERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "new_ql_parse", "NEW-QL-PARSE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "set_ql_parse_cycl", "SET-QL-PARSE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "set_ql_parse_weight", "SET-QL-PARSE-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "set_ql_parse_2nd_weight", "SET-QL-PARSE-2ND-WEIGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_parse_cycl", "QL-PARSE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_parse_weight", "QL-PARSE-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_parse_2nd_weight", "QL-PARSE-2ND-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_parse_equalP", "QL-PARSE-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_cycls_for_unindexed_string", "GET-CYCLS-FOR-UNINDEXED-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "preprocess_query_string", "PREPROCESS-QUERY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_cyclify", "QL-CYCLIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "new_ql_lexicon", "NEW-QL-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_postprocess_cyclify_cycl", "QL-POSTPROCESS-CYCLIFY-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_pred_strengthen_sentence", "QL-PRED-STRENGTHEN-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_cyclify_link", "QL-CYCLIFY-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "convert_instancefns_to_variables", "CONVERT-INSTANCEFNS-TO-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "instancefnP", "INSTANCEFN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "var_from_instancefn", "VAR-FROM-INSTANCEFN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_template_parse_query", "QL-TEMPLATE-PARSE-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "template_parse_complexity_weight", "TEMPLATE-PARSE-COMPLEXITY-WEIGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_interpret_cycl", "QL-INTERPRET-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "ql_text_answer_query", "QL-TEXT-ANSWER-QUERY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "contains_nlrequestfnP", "CONTAINS-NLREQUESTFN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_kb_parameters", "CLEAR-CAE-KB-PARAMETERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "default_inference_parameters_for_task", "DEFAULT-INFERENCE-PARAMETERS-FOR-TASK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_auto_unification_mt", "GET-AUTO-UNIFICATION-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_single_value_task_dependent_query_answer", "CAE-SINGLE-VALUE-TASK-DEPENDENT-QUERY-ANSWER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_multiple_value_task_dependent_query_answer", "CAE-MULTIPLE-VALUE-TASK-DEPENDENT-QUERY-ANSWER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_fact_editor_focal_types", "CLEAR-CAE-FACT-EDITOR-FOCAL-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_fact_editor_focal_types", "REMOVE-CAE-FACT-EDITOR-FOCAL-TYPES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_fact_editor_focal_types_internal", "CAE-FACT-EDITOR-FOCAL-TYPES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_fact_editor_focal_types", "CAE-FACT-EDITOR-FOCAL-TYPES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_get_default_wff_checking_mt", "CLEAR-GET-DEFAULT-WFF-CHECKING-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_get_default_wff_checking_mt", "REMOVE-GET-DEFAULT-WFF-CHECKING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_default_wff_checking_mt_internal", "GET-DEFAULT-WFF-CHECKING-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_default_wff_checking_mt", "GET-DEFAULT-WFF-CHECKING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_get_default_cae_guidance_mt", "CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_get_default_cae_guidance_mt", "REMOVE-GET-DEFAULT-CAE-GUIDANCE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_default_cae_guidance_mt_internal", "GET-DEFAULT-CAE-GUIDANCE-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_default_cae_guidance_mt", "GET-DEFAULT-CAE-GUIDANCE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_all_default_wff_checking_mts", "GET-ALL-DEFAULT-WFF-CHECKING-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_query_mt", "CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_query_mt", "REMOVE-QUERY-LIBRARY-DEFAULT-QUERY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_query_mt_internal", "QUERY-LIBRARY-DEFAULT-QUERY-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_query_mt", "QUERY-LIBRARY-DEFAULT-QUERY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_query_search_fact_sheet_links_enabledP", "CLEAR-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_query_search_fact_sheet_links_enabledP", "REMOVE-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_query_search_fact_sheet_links_enabledP_internal", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_query_search_fact_sheet_links_enabledP", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_query_search_fact_sheet_links_enabledP_int", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_rtv_panel_enabled_for_task", "CLEAR-RTV-PANEL-ENABLED-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_rtv_panel_enabled_for_task", "REMOVE-RTV-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "rtv_panel_enabled_for_task_internal", "RTV-PANEL-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "rtv_panel_enabled_for_task", "RTV-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "rtv_panel_enabled_for_task_int", "RTV-PANEL-ENABLED-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_document_search_panel_enabled_for_task", "CLEAR-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_document_search_panel_enabled_for_task", "REMOVE-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "document_search_panel_enabled_for_task_internal", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "document_search_panel_enabled_for_task", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "document_search_panel_enabled_for_task_int", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_source_information_enabled_for_task", "CLEAR-SOURCE-INFORMATION-ENABLED-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_source_information_enabled_for_task", "REMOVE-SOURCE-INFORMATION-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "source_information_enabled_for_task_internal", "SOURCE-INFORMATION-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "source_information_enabled_for_task", "SOURCE-INFORMATION-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "source_information_enabled_for_task_int", "SOURCE-INFORMATION-ENABLED-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_irrelevant_results_allowed_for_task", "CLEAR-IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_irrelevant_results_allowed_for_task", "REMOVE-IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "irrelevant_results_allowed_for_task_internal", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "irrelevant_results_allowed_for_task", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "irrelevant_results_allowed_for_task_int", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_report_generation_enabled_for_task", "CLEAR-REPORT-GENERATION-ENABLED-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_report_generation_enabled_for_task", "REMOVE-REPORT-GENERATION-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "report_generation_enabled_for_task_internal", "REPORT-GENERATION-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "report_generation_enabled_for_task", "REPORT-GENERATION-ENABLED-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "report_generation_enabled_for_task_int", "REPORT-GENERATION-ENABLED-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_report_generation_template_root_collection_for_task", "CLEAR-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_report_generation_template_root_collection_for_task", "REMOVE-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "report_generation_template_root_collection_for_task_internal", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "report_generation_template_root_collection_for_task", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "report_generation_template_root_collection_for_task_int", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_task_allows_not", "CLEAR-TASK-ALLOWS-NOT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_task_allows_not", "REMOVE-TASK-ALLOWS-NOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_not_internal", "TASK-ALLOWS-NOT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_not", "TASK-ALLOWS-NOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_not_int", "TASK-ALLOWS-NOT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_task_allows_implies", "CLEAR-TASK-ALLOWS-IMPLIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_task_allows_implies", "REMOVE-TASK-ALLOWS-IMPLIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_implies_internal", "TASK-ALLOWS-IMPLIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_implies", "TASK-ALLOWS-IMPLIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_implies_int", "TASK-ALLOWS-IMPLIES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_task_allows_and", "CLEAR-TASK-ALLOWS-AND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_task_allows_and", "REMOVE-TASK-ALLOWS-AND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_and_internal", "TASK-ALLOWS-AND-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_and", "TASK-ALLOWS-AND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_and_int", "TASK-ALLOWS-AND-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_task_allows_or", "CLEAR-TASK-ALLOWS-OR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_task_allows_or", "REMOVE-TASK-ALLOWS-OR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_or_internal", "TASK-ALLOWS-OR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_or", "TASK-ALLOWS-OR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_or_int", "TASK-ALLOWS-OR-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_task_allows_unknown_sentence", "CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_task_allows_unknown_sentence", "REMOVE-TASK-ALLOWS-UNKNOWN-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_unknown_sentence_internal", "TASK-ALLOWS-UNKNOWN-SENTENCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_unknown_sentence", "TASK-ALLOWS-UNKNOWN-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "task_allows_unknown_sentence_int", "TASK-ALLOWS-UNKNOWN-SENTENCE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_sparql_browser_urls_for_task", "CLEAR-SPARQL-BROWSER-URLS-FOR-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_sparql_browser_urls_for_task", "REMOVE-SPARQL-BROWSER-URLS-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "sparql_browser_urls_for_task_internal", "SPARQL-BROWSER-URLS-FOR-TASK-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "sparql_browser_urls_for_task", "SPARQL-BROWSER-URLS-FOR-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "sparql_browser_urls_for_task_int", "SPARQL-BROWSER-URLS-FOR-TASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_root_folder", "CLEAR-QUERY-LIBRARY-ROOT-FOLDER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_root_folder", "REMOVE-QUERY-LIBRARY-ROOT-FOLDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_root_folder_internal", "QUERY-LIBRARY-ROOT-FOLDER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_root_folder", "QUERY-LIBRARY-ROOT-FOLDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_should_suggestions_be_intersected", "CLEAR-QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_should_suggestions_be_intersected", "REMOVE-QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_should_suggestions_be_intersected_internal", "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_should_suggestions_be_intersected", "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_transformation_depth", "CLEAR-QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_transformation_depth", "REMOVE-QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_transformation_depth_internal", "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_transformation_depth", "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_compute_answer_justifications", "CLEAR-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_compute_answer_justifications", "REMOVE-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_compute_answer_justifications_internal", "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_compute_answer_justifications", "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_max_time", "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_max_time", "REMOVE-QUERY-LIBRARY-DEFAULT-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_max_time_internal", "QUERY-LIBRARY-DEFAULT-MAX-TIME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_max_time", "QUERY-LIBRARY-DEFAULT-MAX-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_max_productivity", "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_max_productivity", "REMOVE-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_max_productivity_internal", "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_max_productivity", "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_new_terms_allowed", "CLEAR-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_new_terms_allowed", "REMOVE-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_new_terms_allowed_internal", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_new_terms_allowed", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_new_terms_allowed_int", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_allow_arbitrary_assertion_deletion", "CLEAR-ALLOW-ARBITRARY-ASSERTION-DELETION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_allow_arbitrary_assertion_deletion", "REMOVE-ALLOW-ARBITRARY-ASSERTION-DELETION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "allow_arbitrary_assertion_deletion_internal", "ALLOW-ARBITRARY-ASSERTION-DELETION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "allow_arbitrary_assertion_deletion", "ALLOW-ARBITRARY-ASSERTION-DELETION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "allow_arbitrary_assertion_deletion_int", "ALLOW-ARBITRARY-ASSERTION-DELETION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_indeterminate_terms_allowed", "CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_indeterminate_terms_allowed", "REMOVE-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_indeterminate_terms_allowed_internal", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_indeterminate_terms_allowed", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_indeterminate_terms_allowed_int", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_default_disjunction_free_el_vars_policy", "CLEAR-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_default_disjunction_free_el_vars_policy", "REMOVE-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_disjunction_free_el_vars_policy_internal", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_disjunction_free_el_vars_policy", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_default_disjunction_free_el_vars_policy_int", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_query_search_filter", "CLEAR-CAE-QUERY-SEARCH-FILTER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_query_search_filter", "REMOVE-CAE-QUERY-SEARCH-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_filter_internal", "CAE-QUERY-SEARCH-FILTER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_filter", "CAE-QUERY-SEARCH-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_query_search_filter_specification", "CLEAR-CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_query_search_filter_specification", "REMOVE-CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_filter_specification_internal", "CAE-QUERY-SEARCH-FILTER-SPECIFICATION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_filter_specification", "CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_query_search_filter_string", "CLEAR-CAE-QUERY-SEARCH-FILTER-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_query_search_filter_string", "REMOVE-CAE-QUERY-SEARCH-FILTER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_filter_string_internal", "CAE-QUERY-SEARCH-FILTER-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_filter_string", "CAE-QUERY-SEARCH-FILTER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_query_search_term_classification_tree", "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_query_search_term_classification_tree", "REMOVE-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_term_classification_tree_internal", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_term_classification_tree", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_query_search_term_classification_tree_collections", "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_query_search_term_classification_tree_collections", "REMOVE-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_term_classification_tree_collections_internal", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_query_search_term_classification_tree_collections", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_default_paraphrase_mt", "CLEAR-CAE-DEFAULT-PARAPHRASE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_default_paraphrase_mt", "REMOVE-CAE-DEFAULT-PARAPHRASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_default_paraphrase_mt_internal", "CAE-DEFAULT-PARAPHRASE-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_default_paraphrase_mt", "CAE-DEFAULT-PARAPHRASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_default_parsing_mt", "CLEAR-CAE-DEFAULT-PARSING-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_default_parsing_mt", "REMOVE-CAE-DEFAULT-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_default_parsing_mt_internal", "CAE-DEFAULT-PARSING-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_default_parsing_mt", "CAE-DEFAULT-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_default_nl_domain_mt", "CLEAR-CAE-DEFAULT-NL-DOMAIN-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_default_nl_domain_mt", "REMOVE-CAE-DEFAULT-NL-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_default_nl_domain_mt_internal", "CAE-DEFAULT-NL-DOMAIN-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_default_nl_domain_mt", "CAE-DEFAULT-NL-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_get_nl_mts_from_task", "CAE-GET-NL-MTS-FROM-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_get_cae_mts_from_task", "CAE-GET-CAE-MTS-FROM-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_cae_topic", "CLEAR-CAE-TOPIC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_cae_topic", "REMOVE-CAE-TOPIC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_topic_internal", "CAE-TOPIC-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_topic", "CAE-TOPIC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "cae_task_topic_changed", "CAE-TASK-TOPIC-CHANGED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "store_original_string_for_template_id", "STORE-ORIGINAL-STRING-FOR-TEMPLATE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_original_string_for_query", "GET-ORIGINAL-STRING-FOR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "parsed_query_template_p", "PARSED-QUERY-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "new_query_id", "NEW-QUERY-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "next_query_id", "NEXT-QUERY-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "clear_query_library_template_forward_rules", "CLEAR-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "remove_query_library_template_forward_rules", "REMOVE-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_template_forward_rules_internal", "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "query_library_template_forward_rules", "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "kill_query_template_and_query", "KILL-QUERY-TEMPLATE-AND-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "kill_query_library", "KILL-QUERY-LIBRARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "pred_strengthen_unambiguously_test", "PRED-STRENGTHEN-UNAMBIGUOUSLY-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_library_utils", "get_cycls_for_unindexed_string_tct", "GET-CYCLS-FOR-UNINDEXED-STRING-TCT", 2, 0, false);
        return (SubLObject)query_library_utils.NIL;
    }
    
    public static SubLObject init_query_library_utils_file() {
        query_library_utils.$registered_ql_parsers$ = SubLFiles.defparameter("*REGISTERED-QL-PARSERS*", (SubLObject)query_library_utils.$list0);
        query_library_utils.$ql_default_mt$ = SubLFiles.defparameter("*QL-DEFAULT-MT*", (SubLObject)query_library_utils.$list1);
        query_library_utils.$ql_default_parsed_query_properties$ = SubLFiles.defparameter("*QL-DEFAULT-PARSED-QUERY-PROPERTIES*", (SubLObject)query_library_utils.$list2);
        query_library_utils.$ql_default_parsers$ = SubLFiles.defparameter("*QL-DEFAULT-PARSERS*", red_infrastructure_macros.red_def_helper((SubLObject)(query_library_utils.$list3.isSymbol() ? Symbols.symbol_value((SubLObject)query_library_utils.$list3) : query_library_utils.$list3), (SubLObject)query_library_utils.$sym4$_QL_DEFAULT_PARSERS_, (SubLObject)(query_library_utils.$str5$330D840A0F844359434C0A0F8445424D5.isSymbol() ? Symbols.symbol_value((SubLObject)query_library_utils.$str5$330D840A0F844359434C0A0F8445424D5) : query_library_utils.$str5$330D840A0F844359434C0A0F8445424D5), (SubLObject)query_library_utils.$kw6$PARAMETER, (SubLObject)query_library_utils.UNPROVIDED));
        query_library_utils.$new_vars$ = SubLFiles.defparameter("*NEW-VARS*", (SubLObject)query_library_utils.$str57$what_new_vars_were_created_by_con);
        query_library_utils.$template_parse_complexity_weight_factor$ = SubLFiles.defparameter("*TEMPLATE-PARSE-COMPLEXITY-WEIGHT-FACTOR*", (SubLObject)query_library_utils.$float64$0_9);
        query_library_utils.$cae_fact_editor_focal_types_caching_state$ = SubLFiles.deflexical("*CAE-FACT-EDITOR-FOCAL-TYPES-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$get_default_wff_checking_mt_caching_state$ = SubLFiles.deflexical("*GET-DEFAULT-WFF-CHECKING-MT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$get_default_cae_guidance_mt_caching_state$ = SubLFiles.deflexical("*GET-DEFAULT-CAE-GUIDANCE-MT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_query_mt_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-QUERY-MT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_query_search_fact_sheet_links_enabledP_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$rtv_panel_enabled_for_task_caching_state$ = SubLFiles.deflexical("*RTV-PANEL-ENABLED-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$document_search_panel_enabled_for_task_caching_state$ = SubLFiles.deflexical("*DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$source_information_enabled_for_task_caching_state$ = SubLFiles.deflexical("*SOURCE-INFORMATION-ENABLED-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$irrelevant_results_allowed_for_task_caching_state$ = SubLFiles.deflexical("*IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$report_generation_enabled_for_task_caching_state$ = SubLFiles.deflexical("*REPORT-GENERATION-ENABLED-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$report_generation_template_root_collection_for_task_caching_state$ = SubLFiles.deflexical("*REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$task_allows_not_caching_state$ = SubLFiles.deflexical("*TASK-ALLOWS-NOT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$task_allows_implies_caching_state$ = SubLFiles.deflexical("*TASK-ALLOWS-IMPLIES-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$task_allows_and_caching_state$ = SubLFiles.deflexical("*TASK-ALLOWS-AND-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$task_allows_or_caching_state$ = SubLFiles.deflexical("*TASK-ALLOWS-OR-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$task_allows_unknown_sentence_caching_state$ = SubLFiles.deflexical("*TASK-ALLOWS-UNKNOWN-SENTENCE-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$sparql_browser_urls_for_task_caching_state$ = SubLFiles.deflexical("*SPARQL-BROWSER-URLS-FOR-TASK-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_root_folder_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-ROOT-FOLDER-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_should_suggestions_be_intersected_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_transformation_depth_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_compute_answer_justifications_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_max_time_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-MAX-TIME-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_max_productivity_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_new_terms_allowed_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$allow_arbitrary_assertion_deletion_caching_state$ = SubLFiles.deflexical("*ALLOW-ARBITRARY-ASSERTION-DELETION-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_indeterminate_terms_allowed_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$query_library_default_disjunction_free_el_vars_policy_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_query_search_filter_caching_state$ = SubLFiles.deflexical("*CAE-QUERY-SEARCH-FILTER-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_query_search_filter_specification_caching_state$ = SubLFiles.deflexical("*CAE-QUERY-SEARCH-FILTER-SPECIFICATION-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_query_search_filter_string_caching_state$ = SubLFiles.deflexical("*CAE-QUERY-SEARCH-FILTER-STRING-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_query_search_term_classification_tree_caching_state$ = SubLFiles.deflexical("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_query_search_term_classification_tree_collections_caching_state$ = SubLFiles.deflexical("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_default_paraphrase_mt_caching_state$ = SubLFiles.deflexical("*CAE-DEFAULT-PARAPHRASE-MT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_default_parsing_mt_caching_state$ = SubLFiles.deflexical("*CAE-DEFAULT-PARSING-MT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_default_nl_domain_mt_caching_state$ = SubLFiles.deflexical("*CAE-DEFAULT-NL-DOMAIN-MT-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$cae_topic_caching_state$ = SubLFiles.deflexical("*CAE-TOPIC-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        query_library_utils.$original_query_strings$ = SubLFiles.defparameter("*ORIGINAL-QUERY-STRINGS*", dictionary.new_dictionary((SubLObject)query_library_utils.EQUAL, (SubLObject)query_library_utils.UNPROVIDED));
        query_library_utils.$latest_query_id$ = SubLFiles.defparameter("*LATEST-QUERY-ID*", (SubLObject)query_library_utils.ZERO_INTEGER);
        query_library_utils.$query_library_template_forward_rules_caching_state$ = SubLFiles.deflexical("*QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-CACHING-STATE*", (SubLObject)query_library_utils.NIL);
        return (SubLObject)query_library_utils.NIL;
    }
    
    public static SubLObject setup_query_library_utils_file() {
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym7$LOG_QUERY_LIBRARY_SEARCH);
        access_macros.define_obsolete_register((SubLObject)query_library_utils.$sym17$UNINDEXED_QUERIES_FROM_STRING, (SubLObject)query_library_utils.$list18);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym21$UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym28$REGISTER_ALL_QUERY_LIBRARY_PARSERS);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym35$REGISTER_DEFAULT_QL_PARSERS);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym75$GET_AUTO_UNIFICATION_MT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym78$CAE_FACT_EDITOR_FOCAL_TYPES);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym82$GET_DEFAULT_WFF_CHECKING_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym82$GET_DEFAULT_WFF_CHECKING_MT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym87$GET_DEFAULT_CAE_GUIDANCE_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym87$GET_DEFAULT_CAE_GUIDANCE_MT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym102$RTV_PANEL_ENABLED_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym102$RTV_PANEL_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym116$REPORT_GENERATION_ENABLED_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym116$REPORT_GENERATION_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym124$TASK_ALLOWS_NOT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym124$TASK_ALLOWS_NOT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym127$TASK_ALLOWS_IMPLIES);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym127$TASK_ALLOWS_IMPLIES);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym130$TASK_ALLOWS_AND);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym130$TASK_ALLOWS_AND);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym133$TASK_ALLOWS_OR);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym133$TASK_ALLOWS_OR);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym136$TASK_ALLOWS_UNKNOWN_SENTENCE);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym136$TASK_ALLOWS_UNKNOWN_SENTENCE);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym139$SPARQL_BROWSER_URLS_FOR_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym139$SPARQL_BROWSER_URLS_FOR_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym144$QUERY_LIBRARY_ROOT_FOLDER);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym144$QUERY_LIBRARY_ROOT_FOLDER);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym168$ALLOW_ARBITRARY_ASSERTION_DELETION);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym168$ALLOW_ARBITRARY_ASSERTION_DELETION);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym177$CAE_QUERY_SEARCH_FILTER);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym183$CAE_QUERY_SEARCH_FILTER_STRING);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym183$CAE_QUERY_SEARCH_FILTER_STRING);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym194$CAE_DEFAULT_PARAPHRASE_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym194$CAE_DEFAULT_PARAPHRASE_MT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym198$CAE_DEFAULT_PARSING_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym198$CAE_DEFAULT_PARSING_MT);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym202$CAE_DEFAULT_NL_DOMAIN_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym202$CAE_DEFAULT_NL_DOMAIN_MT);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym205$CAE_GET_NL_MTS_FROM_TASK);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym206$CAE_GET_CAE_MTS_FROM_TASK);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym207$CAE_TOPIC);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym207$CAE_TOPIC);
        utilities_macros.register_kb_function((SubLObject)query_library_utils.$sym214$CAE_TASK_TOPIC_CHANGED);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym216$NEW_QUERY_ID);
        memoization_state.note_globally_cached_function((SubLObject)query_library_utils.$sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym224$KILL_QUERY_TEMPLATE_AND_QUERY);
        access_macros.register_external_symbol((SubLObject)query_library_utils.$sym226$KILL_QUERY_LIBRARY);
        generic_testing.define_test_case_table_int((SubLObject)query_library_utils.$sym228$QL_PRED_STRENGTHEN_SENTENCE, (SubLObject)ConsesLow.list(new SubLObject[] { query_library_utils.$kw229$TEST, query_library_utils.NIL, query_library_utils.$kw230$OWNER, query_library_utils.NIL, query_library_utils.$kw231$CLASSES, query_library_utils.NIL, query_library_utils.$kw232$KB, query_library_utils.$kw233$FULL, query_library_utils.$kw234$WORKING_, query_library_utils.T }), (SubLObject)query_library_utils.$list235);
        generic_testing.define_test_case_table_int((SubLObject)query_library_utils.$sym236$TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY, (SubLObject)ConsesLow.list(new SubLObject[] { query_library_utils.$kw229$TEST, query_library_utils.$sym237$PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST, query_library_utils.$kw230$OWNER, query_library_utils.NIL, query_library_utils.$kw231$CLASSES, query_library_utils.NIL, query_library_utils.$kw232$KB, query_library_utils.$kw233$FULL, query_library_utils.$kw234$WORKING_, query_library_utils.T }), (SubLObject)query_library_utils.$list238);
        generic_testing.define_test_case_table_int((SubLObject)query_library_utils.$sym239$GET_CYCLS_FOR_UNINDEXED_STRING_TCT, (SubLObject)ConsesLow.list(new SubLObject[] { query_library_utils.$kw229$TEST, query_library_utils.EQ, query_library_utils.$kw230$OWNER, query_library_utils.NIL, query_library_utils.$kw231$CLASSES, query_library_utils.NIL, query_library_utils.$kw232$KB, query_library_utils.$kw233$FULL, query_library_utils.$kw234$WORKING_, query_library_utils.NIL }), (SubLObject)query_library_utils.$list240);
        return (SubLObject)query_library_utils.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_query_library_utils_file();
    }
    
    @Override
	public void initializeVariables() {
        init_query_library_utils_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_query_library_utils_file();
    }
    
    static {
        me = (SubLFile)new query_library_utils();
        query_library_utils.$registered_ql_parsers$ = null;
        query_library_utils.$ql_default_mt$ = null;
        query_library_utils.$ql_default_parsed_query_properties$ = null;
        query_library_utils.$ql_default_parsers$ = null;
        query_library_utils.$new_vars$ = null;
        query_library_utils.$template_parse_complexity_weight_factor$ = null;
        query_library_utils.$cae_fact_editor_focal_types_caching_state$ = null;
        query_library_utils.$get_default_wff_checking_mt_caching_state$ = null;
        query_library_utils.$get_default_cae_guidance_mt_caching_state$ = null;
        query_library_utils.$query_library_default_query_mt_caching_state$ = null;
        query_library_utils.$query_library_query_search_fact_sheet_links_enabledP_caching_state$ = null;
        query_library_utils.$rtv_panel_enabled_for_task_caching_state$ = null;
        query_library_utils.$document_search_panel_enabled_for_task_caching_state$ = null;
        query_library_utils.$source_information_enabled_for_task_caching_state$ = null;
        query_library_utils.$irrelevant_results_allowed_for_task_caching_state$ = null;
        query_library_utils.$report_generation_enabled_for_task_caching_state$ = null;
        query_library_utils.$report_generation_template_root_collection_for_task_caching_state$ = null;
        query_library_utils.$task_allows_not_caching_state$ = null;
        query_library_utils.$task_allows_implies_caching_state$ = null;
        query_library_utils.$task_allows_and_caching_state$ = null;
        query_library_utils.$task_allows_or_caching_state$ = null;
        query_library_utils.$task_allows_unknown_sentence_caching_state$ = null;
        query_library_utils.$sparql_browser_urls_for_task_caching_state$ = null;
        query_library_utils.$query_library_root_folder_caching_state$ = null;
        query_library_utils.$query_library_should_suggestions_be_intersected_caching_state$ = null;
        query_library_utils.$query_library_default_transformation_depth_caching_state$ = null;
        query_library_utils.$query_library_default_compute_answer_justifications_caching_state$ = null;
        query_library_utils.$query_library_default_max_time_caching_state$ = null;
        query_library_utils.$query_library_default_max_productivity_caching_state$ = null;
        query_library_utils.$query_library_default_new_terms_allowed_caching_state$ = null;
        query_library_utils.$allow_arbitrary_assertion_deletion_caching_state$ = null;
        query_library_utils.$query_library_default_indeterminate_terms_allowed_caching_state$ = null;
        query_library_utils.$query_library_default_disjunction_free_el_vars_policy_caching_state$ = null;
        query_library_utils.$cae_query_search_filter_caching_state$ = null;
        query_library_utils.$cae_query_search_filter_specification_caching_state$ = null;
        query_library_utils.$cae_query_search_filter_string_caching_state$ = null;
        query_library_utils.$cae_query_search_term_classification_tree_caching_state$ = null;
        query_library_utils.$cae_query_search_term_classification_tree_collections_caching_state$ = null;
        query_library_utils.$cae_default_paraphrase_mt_caching_state$ = null;
        query_library_utils.$cae_default_parsing_mt_caching_state$ = null;
        query_library_utils.$cae_default_nl_domain_mt_caching_state$ = null;
        query_library_utils.$cae_topic_caching_state$ = null;
        query_library_utils.$original_query_strings$ = null;
        query_library_utils.$latest_query_id$ = null;
        query_library_utils.$query_library_template_forward_rules_caching_state$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"));
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)query_library_utils.T, (SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)query_library_utils.T, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeInteger(60));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.ql.default-parsers"));
        $sym4$_QL_DEFAULT_PARSERS_ = SubLObjectFactory.makeSymbol("*QL-DEFAULT-PARSERS*");
        $str5$330D840A0F844359434C0A0F8445424D5 = SubLObjectFactory.makeString("330D840A0F844359434C0A0F8445424D540A0F8C4359434C4946592D4C494E4B0A0F874359434C494659");
        $kw6$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $sym7$LOG_QUERY_LIBRARY_SEARCH = SubLObjectFactory.makeSymbol("LOG-QUERY-LIBRARY-SEARCH");
        $str8$UserSearch_ = SubLObjectFactory.makeString("UserSearch-");
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SearchingForACycLTerm")));
        $const11$searchStringsUsed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("searchStringsUsed"));
        $const12$performedBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy"));
        $const13$dateOfEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndexicalReferentFn-EvaluateAtEL")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now-Indexical"))));
        $const15$properSubEvents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properSubEvents"));
        $const16$WorkEventOnSpecificationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WorkEventOnSpecificationFn"));
        $sym17$UNINDEXED_QUERIES_FROM_STRING = SubLObjectFactory.makeSymbol("UNINDEXED-QUERIES-FROM-STRING");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES"));
        $sym19$QL_PARSE_CYCL = SubLObjectFactory.makeSymbol("QL-PARSE-CYCL");
        $kw20$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $sym21$UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES = SubLObjectFactory.makeSymbol("UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES");
        $kw22$XML = SubLObjectFactory.makeKeyword("XML");
        $kw23$WEIGHT = SubLObjectFactory.makeKeyword("WEIGHT");
        $kw24$2ND_WEIGHT = SubLObjectFactory.makeKeyword("2ND-WEIGHT");
        $kw25$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
        $kw26$END = SubLObjectFactory.makeKeyword("END");
        $kw27$JUSTIFICATION = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $sym28$REGISTER_ALL_QUERY_LIBRARY_PARSERS = SubLObjectFactory.makeSymbol("REGISTER-ALL-QUERY-LIBRARY-PARSERS");
        $kw29$CYCLIFY = SubLObjectFactory.makeKeyword("CYCLIFY");
        $kw30$CYCLIFY_LINK = SubLObjectFactory.makeKeyword("CYCLIFY-LINK");
        $kw31$RTP = SubLObjectFactory.makeKeyword("RTP");
        $kw32$TEXT_ANSWERS = SubLObjectFactory.makeKeyword("TEXT-ANSWERS");
        $kw33$TEXT_ANSWERS_LAST_RESORT = SubLObjectFactory.makeKeyword("TEXT-ANSWERS-LAST-RESORT");
        $kw34$EBMT = SubLObjectFactory.makeKeyword("EBMT");
        $sym35$REGISTER_DEFAULT_QL_PARSERS = SubLObjectFactory.makeSymbol("REGISTER-DEFAULT-QL-PARSERS");
        $kw36$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $sym37$QL_PARSE_EQUAL_ = SubLObjectFactory.makeSymbol("QL-PARSE-EQUAL?");
        $sym38$_ = SubLObjectFactory.makeSymbol(">");
        $sym39$QL_PARSE_WEIGHT = SubLObjectFactory.makeSymbol("QL-PARSE-WEIGHT");
        $str40$and = SubLObjectFactory.makeString("and");
        $str41$what = SubLObjectFactory.makeString("what");
        $sym42$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list43 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RAW-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT"));
        $kw44$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw45$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $kw46$SCORE_FUNCTION = SubLObjectFactory.makeKeyword("SCORE-FUNCTION");
        $sym47$CYCLIFICATION_COVERAGE = SubLObjectFactory.makeSymbol("CYCLIFICATION-COVERAGE");
        $kw48$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $kw49$PARSER = SubLObjectFactory.makeKeyword("PARSER");
        $str50$caught_error__S_while_link_parsin = SubLObjectFactory.makeString("caught error ~S while link-parsing ~S~%");
        $sym51$CYCLIFIER_LEXICON_W_O_FABRICATION = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION");
        $sym52$FORBID_MT = SubLObjectFactory.makeSymbol("FORBID-MT");
        $const53$NameLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NameLexicalMt"));
        $const54$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw55$WARN = SubLObjectFactory.makeKeyword("WARN");
        $list56 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RAW-PARSE"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT"));
        $str57$what_new_vars_were_created_by_con = SubLObjectFactory.makeString("what new vars were created by convert-instancefns-to-variables");
        $sym58$INSTANCEFN_ = SubLObjectFactory.makeSymbol("INSTANCEFN?");
        $sym59$VAR_FROM_INSTANCEFN = SubLObjectFactory.makeSymbol("VAR-FROM-INSTANCEFN");
        $const60$InstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn"));
        $const61$RKFParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt"));
        $const62$playsActiveSubjectRole = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("playsActiveSubjectRole"));
        $sym63$QL_PARSE_2ND_WEIGHT = SubLObjectFactory.makeSymbol("QL-PARSE-2ND-WEIGHT");
        $float64$0_9 = (SubLFloat)SubLObjectFactory.makeDouble(0.9);
        $const65$textAnswer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("textAnswer"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ANSWER"));
        $const67$NLRequestFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLRequestFn"));
        $kw68$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw69$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw70$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $kw71$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw72$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $kw73$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw74$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $sym75$GET_AUTO_UNIFICATION_MT = SubLObjectFactory.makeSymbol("GET-AUTO-UNIFICATION-MT");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)query_library_utils.NIL);
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)query_library_utils.NIL);
        $sym78$CAE_FACT_EDITOR_FOCAL_TYPES = SubLObjectFactory.makeSymbol("CAE-FACT-EDITOR-FOCAL-TYPES");
        $const79$CAEFactEditorFocalTypeQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEFactEditorFocalTypeQuery"));
        $sym80$_TEMPLATE = SubLObjectFactory.makeSymbol("?TEMPLATE");
        $sym81$_CAE_FACT_EDITOR_FOCAL_TYPES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-FACT-EDITOR-FOCAL-TYPES-CACHING-STATE*");
        $sym82$GET_DEFAULT_WFF_CHECKING_MT = SubLObjectFactory.makeSymbol("GET-DEFAULT-WFF-CHECKING-MT");
        $const83$CAEWFFCheckingMtQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEWFFCheckingMtQuery"));
        $sym84$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const85$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym86$_GET_DEFAULT_WFF_CHECKING_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-DEFAULT-WFF-CHECKING-MT-CACHING-STATE*");
        $sym87$GET_DEFAULT_CAE_GUIDANCE_MT = SubLObjectFactory.makeSymbol("GET-DEFAULT-CAE-GUIDANCE-MT");
        $const88$CAEGuidanceMtQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEGuidanceMtQuery"));
        $sym89$_GET_DEFAULT_CAE_GUIDANCE_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-DEFAULT-CAE-GUIDANCE-MT-CACHING-STATE*");
        $sym90$CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT = SubLObjectFactory.makeSymbol("CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT");
        $list91 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultWellformednessCheckingMt")), (SubLObject)SubLObjectFactory.makeSymbol("?SPECIFICATION"), (SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $const92$CycArchitectureMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycArchitectureMt"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym94$QUERY_LIBRARY_DEFAULT_QUERY_MT = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-QUERY-MT");
        $const95$CAEDefaultQueryMtQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEDefaultQueryMtQuery"));
        $sym96$_QUERY_LIBRARY_DEFAULT_QUERY_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-QUERY-MT-CACHING-STATE*");
        $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_ = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?");
        $const98$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*");
        $const100$CAEQuerySearchFactSheetLinksEnabl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQuerySearchFactSheetLinksEnabledQuery"));
        $sym101$_VALUE = SubLObjectFactory.makeSymbol("?VALUE");
        $sym102$RTV_PANEL_ENABLED_FOR_TASK = SubLObjectFactory.makeSymbol("RTV-PANEL-ENABLED-FOR-TASK");
        $sym103$_RTV_PANEL_ENABLED_FOR_TASK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RTV-PANEL-ENABLED-FOR-TASK-CACHING-STATE*");
        $const104$CAERTVPanelEnabledQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAERTVPanelEnabledQuery"));
        $sym105$_TV = SubLObjectFactory.makeSymbol("?TV");
        $sym106$DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK = SubLObjectFactory.makeSymbol("DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK");
        $sym107$_DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-CACHING-STATE*");
        $const108$CAETextSearchPanelEnabledQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAETextSearchPanelEnabledQuery"));
        $sym109$SOURCE_INFORMATION_ENABLED_FOR_TASK = SubLObjectFactory.makeSymbol("SOURCE-INFORMATION-ENABLED-FOR-TASK");
        $sym110$_SOURCE_INFORMATION_ENABLED_FOR_TASK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SOURCE-INFORMATION-ENABLED-FOR-TASK-CACHING-STATE*");
        $const111$CAESourceInformationEnabledQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAESourceInformationEnabledQuery"));
        $sym112$IRRELEVANT_RESULTS_ALLOWED_FOR_TASK = SubLObjectFactory.makeSymbol("IRRELEVANT-RESULTS-ALLOWED-FOR-TASK");
        $sym113$_IRRELEVANT_RESULTS_ALLOWED_FOR_TASK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-CACHING-STATE*");
        $const114$CAEIrrelevantTermAllowedQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEIrrelevantTermAllowedQuery"));
        $const115$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $sym116$REPORT_GENERATION_ENABLED_FOR_TASK = SubLObjectFactory.makeSymbol("REPORT-GENERATION-ENABLED-FOR-TASK");
        $sym117$_REPORT_GENERATION_ENABLED_FOR_TASK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*REPORT-GENERATION-ENABLED-FOR-TASK-CACHING-STATE*");
        $const118$CAEReportGenerationEnabledQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEReportGenerationEnabledQuery"));
        $sym119$REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK = SubLObjectFactory.makeSymbol("REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK");
        $sym120$_REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK_CACHING_STAT = SubLObjectFactory.makeSymbol("*REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-CACHING-STATE*");
        $const121$CAEReportGenerationTemplateRootCo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEReportGenerationTemplateRootCollectionQuery"));
        $const122$ReportGenerationTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReportGenerationTemplate"));
        $sym123$_COL = SubLObjectFactory.makeSymbol("?COL");
        $sym124$TASK_ALLOWS_NOT = SubLObjectFactory.makeSymbol("TASK-ALLOWS-NOT");
        $sym125$_TASK_ALLOWS_NOT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TASK-ALLOWS-NOT-CACHING-STATE*");
        $const126$CAEAllowsNotQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAllowsNotQuery"));
        $sym127$TASK_ALLOWS_IMPLIES = SubLObjectFactory.makeSymbol("TASK-ALLOWS-IMPLIES");
        $sym128$_TASK_ALLOWS_IMPLIES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TASK-ALLOWS-IMPLIES-CACHING-STATE*");
        $const129$CAEAllowsImpliesQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAllowsImpliesQuery"));
        $sym130$TASK_ALLOWS_AND = SubLObjectFactory.makeSymbol("TASK-ALLOWS-AND");
        $sym131$_TASK_ALLOWS_AND_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TASK-ALLOWS-AND-CACHING-STATE*");
        $const132$CAEAllowsAndQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAllowsAndQuery"));
        $sym133$TASK_ALLOWS_OR = SubLObjectFactory.makeSymbol("TASK-ALLOWS-OR");
        $sym134$_TASK_ALLOWS_OR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TASK-ALLOWS-OR-CACHING-STATE*");
        $const135$CAEAllowsOrQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAllowsOrQuery"));
        $sym136$TASK_ALLOWS_UNKNOWN_SENTENCE = SubLObjectFactory.makeSymbol("TASK-ALLOWS-UNKNOWN-SENTENCE");
        $sym137$_TASK_ALLOWS_UNKNOWN_SENTENCE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TASK-ALLOWS-UNKNOWN-SENTENCE-CACHING-STATE*");
        $const138$CAEAllowsUnknownSentenceQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAllowsUnknownSentenceQuery"));
        $sym139$SPARQL_BROWSER_URLS_FOR_TASK = SubLObjectFactory.makeSymbol("SPARQL-BROWSER-URLS-FOR-TASK");
        $sym140$_SPARQL_BROWSER_URLS_FOR_TASK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SPARQL-BROWSER-URLS-FOR-TASK-CACHING-STATE*");
        $const141$CAESPARQLBrowserAddressQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAESPARQLBrowserAddressQuery"));
        $sym142$URL_STRING = SubLObjectFactory.makeSymbol("URL-STRING");
        $sym143$_URL = SubLObjectFactory.makeSymbol("?URL");
        $sym144$QUERY_LIBRARY_ROOT_FOLDER = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-ROOT-FOLDER");
        $const145$CAEQueryLibraryRootFolderQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryRootFolderQuery"));
        $sym146$_QUERY_LIBRARY_ROOT_FOLDER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-ROOT-FOLDER-CACHING-STATE*");
        $sym147$QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED");
        $const148$CAEQueryLibraryShouldSuggestionsB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryShouldSuggestionsBeIntersectedQuery"));
        $sym149$_TRUTH = SubLObjectFactory.makeSymbol("?TRUTH");
        $sym150$_QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-CACHING-STATE*");
        $sym151$QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH");
        $const152$CAEQueryLibraryDefaultTransformat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultTransformationDepthQuery"));
        $sym153$_QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-CACHING-STATE*");
        $sym154$QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS");
        $const155$CAEQueryLibraryDefaultComputeAnsw = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultComputeAnswerJustificationsQuery"));
        $sym156$_QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS_CACHING_STAT = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-CACHING-STATE*");
        $sym157$QUERY_LIBRARY_DEFAULT_MAX_TIME = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-MAX-TIME");
        $const158$CAEQueryLibraryDefaultMaxTimeQuer = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultMaxTimeQuery"));
        $sym159$_QUERY_LIBRARY_DEFAULT_MAX_TIME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-MAX-TIME-CACHING-STATE*");
        $sym160$QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY");
        $const161$CAEQueryLibraryDefaultMaxProducti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultMaxProductivityQuery"));
        $const162$PlusInfinity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusInfinity"));
        $str163$Got_invalid_default__productivity = SubLObjectFactory.makeString("Got invalid default :productivity-limit ~S for ~S");
        $sym164$_QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-CACHING-STATE*");
        $sym165$QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED");
        $sym166$_QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-CACHING-STATE*");
        $const167$CAEQueryLibraryDefaultNewTermsAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultNewTermsAllowedQuery"));
        $sym168$ALLOW_ARBITRARY_ASSERTION_DELETION = SubLObjectFactory.makeSymbol("ALLOW-ARBITRARY-ASSERTION-DELETION");
        $sym169$_ALLOW_ARBITRARY_ASSERTION_DELETION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALLOW-ARBITRARY-ASSERTION-DELETION-CACHING-STATE*");
        $const170$AppAllowsArbitraryAssertionDeleti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AppAllowsArbitraryAssertionDeletionQuery"));
        $sym171$QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED");
        $sym172$_QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-CACHING-STATE*");
        $const173$CAEQueryLibraryDefaultIndetermina = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultIndeterminateTermsAllowedQuery"));
        $sym174$QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY");
        $sym175$_QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY_CACHING_ST = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-CACHING-STATE*");
        $const176$CAEQueryLibraryDefaultDisjunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQueryLibraryDefaultDisjunctionFreeELVarsPolicyQuery"));
        $sym177$CAE_QUERY_SEARCH_FILTER = SubLObjectFactory.makeSymbol("CAE-QUERY-SEARCH-FILTER");
        $const178$CAEQuerySearchFilterQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQuerySearchFilterQuery"));
        $sym179$_CAE_QUERY_SEARCH_FILTER_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-QUERY-SEARCH-FILTER-CACHING-STATE*");
        $sym180$CAE_QUERY_SEARCH_FILTER_SPECIFICATION = SubLObjectFactory.makeSymbol("CAE-QUERY-SEARCH-FILTER-SPECIFICATION");
        $const181$CAEQuerySearchFilterSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEQuerySearchFilterSpecificationQuery"));
        $sym182$_CAE_QUERY_SEARCH_FILTER_SPECIFICATION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-QUERY-SEARCH-FILTER-SPECIFICATION-CACHING-STATE*");
        $sym183$CAE_QUERY_SEARCH_FILTER_STRING = SubLObjectFactory.makeSymbol("CAE-QUERY-SEARCH-FILTER-STRING");
        $sym184$_TREE = SubLObjectFactory.makeSymbol("?TREE");
        $const185$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const186$conceptFilterDecisionTree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptFilterDecisionTree"));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TREENAT"));
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate")), (SubLObject)SubLObjectFactory.makeSymbol("?TREE"), (SubLObject)SubLObjectFactory.makeSymbol("?TREENAT")));
        $sym189$_CAE_QUERY_SEARCH_FILTER_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-QUERY-SEARCH-FILTER-STRING-CACHING-STATE*");
        $sym190$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE = SubLObjectFactory.makeSymbol("CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE");
        $sym191$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-CACHING-STATE*");
        $sym192$CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS = SubLObjectFactory.makeSymbol("CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS");
        $sym193$_CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS_CACHING_ST = SubLObjectFactory.makeSymbol("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-CACHING-STATE*");
        $sym194$CAE_DEFAULT_PARAPHRASE_MT = SubLObjectFactory.makeSymbol("CAE-DEFAULT-PARAPHRASE-MT");
        $const195$CAEDefaultParaphraseMtQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEDefaultParaphraseMtQuery"));
        $const196$EnglishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $sym197$_CAE_DEFAULT_PARAPHRASE_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-DEFAULT-PARAPHRASE-MT-CACHING-STATE*");
        $sym198$CAE_DEFAULT_PARSING_MT = SubLObjectFactory.makeSymbol("CAE-DEFAULT-PARSING-MT");
        $const199$CAEDefaultParsingMtQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEDefaultParsingMtQuery"));
        $list200 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC")));
        $sym201$_CAE_DEFAULT_PARSING_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-DEFAULT-PARSING-MT-CACHING-STATE*");
        $sym202$CAE_DEFAULT_NL_DOMAIN_MT = SubLObjectFactory.makeSymbol("CAE-DEFAULT-NL-DOMAIN-MT");
        $const203$CAEDefaultNLDomainMtQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEDefaultNLDomainMtQuery"));
        $sym204$_CAE_DEFAULT_NL_DOMAIN_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-DEFAULT-NL-DOMAIN-MT-CACHING-STATE*");
        $sym205$CAE_GET_NL_MTS_FROM_TASK = SubLObjectFactory.makeSymbol("CAE-GET-NL-MTS-FROM-TASK");
        $sym206$CAE_GET_CAE_MTS_FROM_TASK = SubLObjectFactory.makeSymbol("CAE-GET-CAE-MTS-FROM-TASK");
        $sym207$CAE_TOPIC = SubLObjectFactory.makeSymbol("CAE-TOPIC");
        $sym208$_TOPIC = SubLObjectFactory.makeSymbol("?TOPIC");
        $list209 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TOPIC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CAEAnalysisTopic")));
        $const210$topicOfIndividual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("topicOfIndividual"));
        $list211 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TOPIC"));
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)query_library_utils.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $sym213$_CAE_TOPIC_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CAE-TOPIC-CACHING-STATE*");
        $sym214$CAE_TASK_TOPIC_CHANGED = SubLObjectFactory.makeSymbol("CAE-TASK-TOPIC-CHANGED");
        $str215$failed_to_find_original_query_str = SubLObjectFactory.makeString("failed to find original query string");
        $sym216$NEW_QUERY_ID = SubLObjectFactory.makeSymbol("NEW-QUERY-ID");
        $const217$QueryLibrary_QueryCreationTemplat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryLibrary-QueryCreationTemplate"));
        $const218$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $str219$UserQuery = SubLObjectFactory.makeString("UserQuery");
        $list220 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLQuerySpecification")));
        $const221$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $sym222$QUERY_LIBRARY_TEMPLATE_FORWARD_RULES = SubLObjectFactory.makeSymbol("QUERY-LIBRARY-TEMPLATE-FORWARD-RULES");
        $sym223$_QUERY_LIBRARY_TEMPLATE_FORWARD_RULES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-CACHING-STATE*");
        $sym224$KILL_QUERY_TEMPLATE_AND_QUERY = SubLObjectFactory.makeSymbol("KILL-QUERY-TEMPLATE-AND-QUERY");
        $const225$TestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestQueryFn"));
        $sym226$KILL_QUERY_LIBRARY = SubLObjectFactory.makeSymbol("KILL-QUERY-LIBRARY");
        $sym227$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $sym228$QL_PRED_STRENGTHEN_SENTENCE = SubLObjectFactory.makeSymbol("QL-PRED-STRENGTHEN-SENTENCE");
        $kw229$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw230$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw231$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw232$KB = SubLObjectFactory.makeKeyword("KB");
        $kw233$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw234$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list235 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanAdult"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanAdult"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"))))));
        $sym236$TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY = SubLObjectFactory.makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY");
        $sym237$PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST = SubLObjectFactory.makeSymbol("PRED-STRENGTHEN-UNAMBIGUOUSLY-TEST");
        $list238 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanAdult"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanAdult"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("politicalPartyMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("?PLACE"))))));
        $sym239$GET_CYCLS_FOR_UNINDEXED_STRING_TCT = SubLObjectFactory.makeSymbol("GET-CYCLS-FOR-UNINDEXED-STRING-TCT");
        $list240 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Which terrorist groups have carried out suicide bombings in Israel?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST-SUICIDE-BOMBING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST-SUICIDE-BOMBING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristSuicideBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST-SUICIDE-BOMBING"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Israel"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST-SUICIDE-BOMBING"), (SubLObject)SubLObjectFactory.makeSymbol("?CULPRIT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?CULPRIT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristGroup")))))), (SubLObject)query_library_utils.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What attacks has Hezbollah carried out since 2002?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttackOnObject"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterThan")), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2002))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah"))))), (SubLObject)query_library_utils.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What types of attacks has Hezbollah performed?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE-OF-ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AttackType"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nearestIsa")), (SubLObject)SubLObjectFactory.makeSymbol("?ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE-OF-ATTACK"))))), (SubLObject)query_library_utils.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Where were the members of Hizballah born?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthPlace")), (SubLObject)SubLObjectFactory.makeSymbol("?MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("?BIRTHPLACE"))))), (SubLObject)query_library_utils.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Where do members of Hizballah live?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("residesInRegion")), (SubLObject)SubLObjectFactory.makeSymbol("?INHABITANT"), (SubLObject)SubLObjectFactory.makeSymbol("?GEOGRAPHICAL-REGION"))))), (SubLObject)query_library_utils.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What terrorist groups is Hezbollah financially linked to?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST-ORGANIZATION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristGroup"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LebaneseHizballah")), (SubLObject)SubLObjectFactory.makeSymbol("?TERRORIST-ORGANIZATION"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("financiallyLinked"))), (SubLObject)query_library_utils.THREE_INTEGER))), (SubLObject)query_library_utils.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What types of financial links are there?"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)SubLObjectFactory.makeSymbol("?BINARY-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("financiallyLinked")))), (SubLObject)query_library_utils.T));
    }
}

/*

	Total time: 1256 ms
	
*/