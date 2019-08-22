package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.cfasl_decode;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constant;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.optimize_el_formula_variable_names;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class query_library_utils extends SubLTranslatedFile {
    public static final SubLFile me = new query_library_utils();

    public static final String myName = "com.cyc.cycjava.cycl.query_library_utils";

    public static final String myFingerPrint = "39de3abddae5b135ce7f10486c60a89629e2c7ca811fcaf233a7b0d741a79225";

    // defparameter
    private static final SubLSymbol $registered_ql_parsers$ = makeSymbol("*REGISTERED-QL-PARSERS*");

    // defparameter
    public static final SubLSymbol $ql_default_mt$ = makeSymbol("*QL-DEFAULT-MT*");

    // defparameter
    public static final SubLSymbol $ql_default_parsed_query_properties$ = makeSymbol("*QL-DEFAULT-PARSED-QUERY-PROPERTIES*");



    // defparameter
    private static final SubLSymbol $new_vars$ = makeSymbol("*NEW-VARS*");

    // defparameter
    /**
     * Controls how much term complexity counts against a putative parse. Should be
     * a FLOATP; between 0 and 1, inclusive. 0 means more complex terms are
     * maximally penalized, 1 means not penalized at all.
     */
    private static final SubLSymbol $template_parse_complexity_weight_factor$ = makeSymbol("*TEMPLATE-PARSE-COMPLEXITY-WEIGHT-FACTOR*");









    // deflexical
    private static final SubLSymbol $query_library_query_search_fact_sheet_links_enabledP_caching_state$ = makeSymbol("*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*");































































    // defparameter
    private static final SubLSymbol $original_query_strings$ = makeSymbol("*ORIGINAL-QUERY-STRINGS*");

    // defparameter
    private static final SubLSymbol $latest_query_id$ = makeSymbol("*LATEST-QUERY-ID*");



    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("CYCL"));

    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("AnytimePSC")));

    public static final SubLList $list2 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-TIME"), makeInteger(60));

    public static final SubLList $list3 = list(makeString("application.ql.default-parsers"));

    public static final SubLSymbol $ql_default_parsers$ = makeSymbol("*QL-DEFAULT-PARSERS*");

    public static final SubLString $str5$330D840A0F844359434C0A0F8445424D5 = makeString("330D840A0F844359434C0A0F8445424D540A0F8C4359434C4946592D4C494E4B0A0F874359434C494659");



    public static final SubLSymbol LOG_QUERY_LIBRARY_SEARCH = makeSymbol("LOG-QUERY-LIBRARY-SEARCH");

    public static final SubLString $str8$UserSearch_ = makeString("UserSearch-");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list10 = list(reader_make_constant_shell(makeString("SearchingForACycLTerm")));

    private static final SubLObject $$searchStringsUsed = reader_make_constant_shell(makeString("searchStringsUsed"));

    private static final SubLObject $$performedBy = reader_make_constant_shell(makeString("performedBy"));

    private static final SubLObject $$dateOfEvent = reader_make_constant_shell(makeString("dateOfEvent"));

    public static final SubLList $list14 = list(list(reader_make_constant_shell(makeString("IndexicalReferentFn-EvaluateAtEL")), reader_make_constant_shell(makeString("Now-Indexical"))));

    private static final SubLObject $$properSubEvents = reader_make_constant_shell(makeString("properSubEvents"));

    private static final SubLObject $$WorkEventOnSpecificationFn = reader_make_constant_shell(makeString("WorkEventOnSpecificationFn"));

    public static final SubLSymbol UNINDEXED_QUERIES_FROM_STRING = makeSymbol("UNINDEXED-QUERIES-FROM-STRING");

    public static final SubLList $list18 = list(makeSymbol("UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES"));

    public static final SubLSymbol QL_PARSE_CYCL = makeSymbol("QL-PARSE-CYCL");



    public static final SubLSymbol UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES = makeSymbol("UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES");













    public static final SubLSymbol REGISTER_ALL_QUERY_LIBRARY_PARSERS = makeSymbol("REGISTER-ALL-QUERY-LIBRARY-PARSERS");









    private static final SubLSymbol $TEXT_ANSWERS_LAST_RESORT = makeKeyword("TEXT-ANSWERS-LAST-RESORT");



    public static final SubLSymbol REGISTER_DEFAULT_QL_PARSERS = makeSymbol("REGISTER-DEFAULT-QL-PARSERS");



    public static final SubLSymbol $sym37$QL_PARSE_EQUAL_ = makeSymbol("QL-PARSE-EQUAL?");

    public static final SubLSymbol $sym38$_ = makeSymbol(">");

    public static final SubLSymbol QL_PARSE_WEIGHT = makeSymbol("QL-PARSE-WEIGHT");

    public static final SubLString $$$and = makeString("and");

    public static final SubLString $$$what = makeString("what");



    public static final SubLList $list43 = cons(makeSymbol("RAW-CYCL"), makeSymbol("WEIGHT"));







    public static final SubLSymbol CYCLIFICATION_COVERAGE = makeSymbol("CYCLIFICATION-COVERAGE");





    public static final SubLString $str50$caught_error__S_while_link_parsin = makeString("caught error ~S while link-parsing ~S~%");

    public static final SubLSymbol $sym51$CYCLIFIER_LEXICON_W_O_FABRICATION = makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION");



    private static final SubLObject $$NameLexicalMt = reader_make_constant_shell(makeString("NameLexicalMt"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    public static final SubLList $list56 = cons(makeSymbol("RAW-PARSE"), makeSymbol("WEIGHT"));

    public static final SubLString $str57$what_new_vars_were_created_by_con = makeString("what new vars were created by convert-instancefns-to-variables");

    public static final SubLSymbol $sym58$INSTANCEFN_ = makeSymbol("INSTANCEFN?");

    public static final SubLSymbol VAR_FROM_INSTANCEFN = makeSymbol("VAR-FROM-INSTANCEFN");

    private static final SubLObject $$InstanceFn = reader_make_constant_shell(makeString("InstanceFn"));

    private static final SubLObject $$RKFParsingMt = reader_make_constant_shell(makeString("RKFParsingMt"));

    private static final SubLObject $$playsActiveSubjectRole = reader_make_constant_shell(makeString("playsActiveSubjectRole"));

    public static final SubLSymbol QL_PARSE_2ND_WEIGHT = makeSymbol("QL-PARSE-2ND-WEIGHT");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    private static final SubLObject $$textAnswer = reader_make_constant_shell(makeString("textAnswer"));

    public static final SubLList $list66 = list(makeSymbol("?ANSWER"));

    private static final SubLObject $$NLRequestFn = reader_make_constant_shell(makeString("NLRequestFn"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $kw69$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $kw70$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");



    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");



    private static final SubLSymbol $kw74$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    public static final SubLSymbol GET_AUTO_UNIFICATION_MT = makeSymbol("GET-AUTO-UNIFICATION-MT");

    public static final SubLList $list76 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("BROWSABLE?"), NIL);

    private static final SubLList $list77 = list(makeKeyword("BROWSABLE?"), NIL);

    private static final SubLSymbol CAE_FACT_EDITOR_FOCAL_TYPES = makeSymbol("CAE-FACT-EDITOR-FOCAL-TYPES");

    private static final SubLObject $$CAEFactEditorFocalTypeQuery = reader_make_constant_shell(makeString("CAEFactEditorFocalTypeQuery"));

    private static final SubLSymbol $sym80$_TEMPLATE = makeSymbol("?TEMPLATE");

    private static final SubLSymbol $cae_fact_editor_focal_types_caching_state$ = makeSymbol("*CAE-FACT-EDITOR-FOCAL-TYPES-CACHING-STATE*");

    public static final SubLSymbol GET_DEFAULT_WFF_CHECKING_MT = makeSymbol("GET-DEFAULT-WFF-CHECKING-MT");

    private static final SubLObject $$CAEWFFCheckingMtQuery = reader_make_constant_shell(makeString("CAEWFFCheckingMtQuery"));

    public static final SubLSymbol $sym84$_MT = makeSymbol("?MT");

    private static final SubLObject $const85$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

    public static final SubLSymbol $get_default_wff_checking_mt_caching_state$ = makeSymbol("*GET-DEFAULT-WFF-CHECKING-MT-CACHING-STATE*");

    public static final SubLSymbol GET_DEFAULT_CAE_GUIDANCE_MT = makeSymbol("GET-DEFAULT-CAE-GUIDANCE-MT");

    private static final SubLObject $$CAEGuidanceMtQuery = reader_make_constant_shell(makeString("CAEGuidanceMtQuery"));

    public static final SubLSymbol $get_default_cae_guidance_mt_caching_state$ = makeSymbol("*GET-DEFAULT-CAE-GUIDANCE-MT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT = makeSymbol("CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT");

    private static final SubLList $list91 = list(reader_make_constant_shell(makeString("defaultWellformednessCheckingMt")), makeSymbol("?SPECIFICATION"), makeSymbol("?MT"));

    private static final SubLObject $$CycArchitectureMt = reader_make_constant_shell(makeString("CycArchitectureMt"));

    private static final SubLList $list93 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_QUERY_MT = makeSymbol("QUERY-LIBRARY-DEFAULT-QUERY-MT");

    private static final SubLObject $$CAEDefaultQueryMtQuery = reader_make_constant_shell(makeString("CAEDefaultQueryMtQuery"));

    private static final SubLSymbol $query_library_default_query_mt_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-QUERY-MT-CACHING-STATE*");

    private static final SubLSymbol $sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_ = makeSymbol("QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?");

    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLSymbol $sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA = makeSymbol("*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*");

    private static final SubLObject $const100$CAEQuerySearchFactSheetLinksEnabl = reader_make_constant_shell(makeString("CAEQuerySearchFactSheetLinksEnabledQuery"));

    private static final SubLSymbol $sym101$_VALUE = makeSymbol("?VALUE");

    private static final SubLSymbol RTV_PANEL_ENABLED_FOR_TASK = makeSymbol("RTV-PANEL-ENABLED-FOR-TASK");

    private static final SubLSymbol $rtv_panel_enabled_for_task_caching_state$ = makeSymbol("*RTV-PANEL-ENABLED-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $$CAERTVPanelEnabledQuery = reader_make_constant_shell(makeString("CAERTVPanelEnabledQuery"));

    private static final SubLSymbol $sym105$_TV = makeSymbol("?TV");

    private static final SubLSymbol DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK = makeSymbol("DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK");

    private static final SubLSymbol $document_search_panel_enabled_for_task_caching_state$ = makeSymbol("*DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $$CAETextSearchPanelEnabledQuery = reader_make_constant_shell(makeString("CAETextSearchPanelEnabledQuery"));

    private static final SubLSymbol SOURCE_INFORMATION_ENABLED_FOR_TASK = makeSymbol("SOURCE-INFORMATION-ENABLED-FOR-TASK");

    private static final SubLSymbol $source_information_enabled_for_task_caching_state$ = makeSymbol("*SOURCE-INFORMATION-ENABLED-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $$CAESourceInformationEnabledQuery = reader_make_constant_shell(makeString("CAESourceInformationEnabledQuery"));

    private static final SubLSymbol IRRELEVANT_RESULTS_ALLOWED_FOR_TASK = makeSymbol("IRRELEVANT-RESULTS-ALLOWED-FOR-TASK");

    private static final SubLSymbol $irrelevant_results_allowed_for_task_caching_state$ = makeSymbol("*IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $$CAEIrrelevantTermAllowedQuery = reader_make_constant_shell(makeString("CAEIrrelevantTermAllowedQuery"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLSymbol REPORT_GENERATION_ENABLED_FOR_TASK = makeSymbol("REPORT-GENERATION-ENABLED-FOR-TASK");

    private static final SubLSymbol $report_generation_enabled_for_task_caching_state$ = makeSymbol("*REPORT-GENERATION-ENABLED-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $$CAEReportGenerationEnabledQuery = reader_make_constant_shell(makeString("CAEReportGenerationEnabledQuery"));

    private static final SubLSymbol REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK = makeSymbol("REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK");

    private static final SubLSymbol $report_generation_template_root_collection_for_task_caching_state$ = makeSymbol("*REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $const121$CAEReportGenerationTemplateRootCo = reader_make_constant_shell(makeString("CAEReportGenerationTemplateRootCollectionQuery"));

    private static final SubLObject $$ReportGenerationTemplate = reader_make_constant_shell(makeString("ReportGenerationTemplate"));

    private static final SubLSymbol $sym123$_COL = makeSymbol("?COL");

    private static final SubLSymbol TASK_ALLOWS_NOT = makeSymbol("TASK-ALLOWS-NOT");

    private static final SubLSymbol $task_allows_not_caching_state$ = makeSymbol("*TASK-ALLOWS-NOT-CACHING-STATE*");

    private static final SubLObject $$CAEAllowsNotQuery = reader_make_constant_shell(makeString("CAEAllowsNotQuery"));

    private static final SubLSymbol TASK_ALLOWS_IMPLIES = makeSymbol("TASK-ALLOWS-IMPLIES");

    private static final SubLSymbol $task_allows_implies_caching_state$ = makeSymbol("*TASK-ALLOWS-IMPLIES-CACHING-STATE*");

    private static final SubLObject $$CAEAllowsImpliesQuery = reader_make_constant_shell(makeString("CAEAllowsImpliesQuery"));

    private static final SubLSymbol TASK_ALLOWS_AND = makeSymbol("TASK-ALLOWS-AND");

    private static final SubLSymbol $task_allows_and_caching_state$ = makeSymbol("*TASK-ALLOWS-AND-CACHING-STATE*");

    private static final SubLObject $$CAEAllowsAndQuery = reader_make_constant_shell(makeString("CAEAllowsAndQuery"));

    private static final SubLSymbol TASK_ALLOWS_OR = makeSymbol("TASK-ALLOWS-OR");

    private static final SubLSymbol $task_allows_or_caching_state$ = makeSymbol("*TASK-ALLOWS-OR-CACHING-STATE*");

    private static final SubLObject $$CAEAllowsOrQuery = reader_make_constant_shell(makeString("CAEAllowsOrQuery"));

    private static final SubLSymbol TASK_ALLOWS_UNKNOWN_SENTENCE = makeSymbol("TASK-ALLOWS-UNKNOWN-SENTENCE");

    private static final SubLSymbol $task_allows_unknown_sentence_caching_state$ = makeSymbol("*TASK-ALLOWS-UNKNOWN-SENTENCE-CACHING-STATE*");

    private static final SubLObject $$CAEAllowsUnknownSentenceQuery = reader_make_constant_shell(makeString("CAEAllowsUnknownSentenceQuery"));

    private static final SubLSymbol SPARQL_BROWSER_URLS_FOR_TASK = makeSymbol("SPARQL-BROWSER-URLS-FOR-TASK");

    private static final SubLSymbol $sparql_browser_urls_for_task_caching_state$ = makeSymbol("*SPARQL-BROWSER-URLS-FOR-TASK-CACHING-STATE*");

    private static final SubLObject $$CAESPARQLBrowserAddressQuery = reader_make_constant_shell(makeString("CAESPARQLBrowserAddressQuery"));

    private static final SubLSymbol URL_STRING = makeSymbol("URL-STRING");

    private static final SubLSymbol $sym143$_URL = makeSymbol("?URL");

    private static final SubLSymbol QUERY_LIBRARY_ROOT_FOLDER = makeSymbol("QUERY-LIBRARY-ROOT-FOLDER");

    private static final SubLObject $$CAEQueryLibraryRootFolderQuery = reader_make_constant_shell(makeString("CAEQueryLibraryRootFolderQuery"));

    private static final SubLSymbol $query_library_root_folder_caching_state$ = makeSymbol("*QUERY-LIBRARY-ROOT-FOLDER-CACHING-STATE*");

    private static final SubLSymbol QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED = makeSymbol("QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED");

    private static final SubLObject $const148$CAEQueryLibraryShouldSuggestionsB = reader_make_constant_shell(makeString("CAEQueryLibraryShouldSuggestionsBeIntersectedQuery"));

    private static final SubLSymbol $sym149$_TRUTH = makeSymbol("?TRUTH");

    private static final SubLSymbol $query_library_should_suggestions_be_intersected_caching_state$ = makeSymbol("*QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-CACHING-STATE*");

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH = makeSymbol("QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH");

    private static final SubLObject $const152$CAEQueryLibraryDefaultTransformat = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultTransformationDepthQuery"));

    private static final SubLSymbol $query_library_default_transformation_depth_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-CACHING-STATE*");

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS = makeSymbol("QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS");

    private static final SubLObject $const155$CAEQueryLibraryDefaultComputeAnsw = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultComputeAnswerJustificationsQuery"));

    private static final SubLSymbol $query_library_default_compute_answer_justifications_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-CACHING-STATE*");

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_MAX_TIME = makeSymbol("QUERY-LIBRARY-DEFAULT-MAX-TIME");

    private static final SubLObject $const158$CAEQueryLibraryDefaultMaxTimeQuer = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultMaxTimeQuery"));

    private static final SubLSymbol $query_library_default_max_time_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-MAX-TIME-CACHING-STATE*");

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY = makeSymbol("QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY");

    private static final SubLObject $const161$CAEQueryLibraryDefaultMaxProducti = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultMaxProductivityQuery"));

    private static final SubLObject $$PlusInfinity = reader_make_constant_shell(makeString("PlusInfinity"));

    private static final SubLString $str163$Got_invalid_default__productivity = makeString("Got invalid default :productivity-limit ~S for ~S");

    private static final SubLSymbol $query_library_default_max_productivity_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-CACHING-STATE*");

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED = makeSymbol("QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED");

    private static final SubLSymbol $query_library_default_new_terms_allowed_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-CACHING-STATE*");

    private static final SubLObject $const167$CAEQueryLibraryDefaultNewTermsAll = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultNewTermsAllowedQuery"));

    private static final SubLSymbol ALLOW_ARBITRARY_ASSERTION_DELETION = makeSymbol("ALLOW-ARBITRARY-ASSERTION-DELETION");

    private static final SubLSymbol $allow_arbitrary_assertion_deletion_caching_state$ = makeSymbol("*ALLOW-ARBITRARY-ASSERTION-DELETION-CACHING-STATE*");

    private static final SubLObject $const170$AppAllowsArbitraryAssertionDeleti = reader_make_constant_shell(makeString("AppAllowsArbitraryAssertionDeletionQuery"));

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED = makeSymbol("QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED");

    private static final SubLSymbol $query_library_default_indeterminate_terms_allowed_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-CACHING-STATE*");

    private static final SubLObject $const173$CAEQueryLibraryDefaultIndetermina = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultIndeterminateTermsAllowedQuery"));

    private static final SubLSymbol QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY = makeSymbol("QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY");

    private static final SubLSymbol $query_library_default_disjunction_free_el_vars_policy_caching_state$ = makeSymbol("*QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-CACHING-STATE*");

    private static final SubLObject $const176$CAEQueryLibraryDefaultDisjunction = reader_make_constant_shell(makeString("CAEQueryLibraryDefaultDisjunctionFreeELVarsPolicyQuery"));

    private static final SubLSymbol CAE_QUERY_SEARCH_FILTER = makeSymbol("CAE-QUERY-SEARCH-FILTER");

    private static final SubLObject $$CAEQuerySearchFilterQuery = reader_make_constant_shell(makeString("CAEQuerySearchFilterQuery"));

    private static final SubLSymbol $cae_query_search_filter_caching_state$ = makeSymbol("*CAE-QUERY-SEARCH-FILTER-CACHING-STATE*");

    private static final SubLSymbol CAE_QUERY_SEARCH_FILTER_SPECIFICATION = makeSymbol("CAE-QUERY-SEARCH-FILTER-SPECIFICATION");

    private static final SubLObject $const181$CAEQuerySearchFilterSpecification = reader_make_constant_shell(makeString("CAEQuerySearchFilterSpecificationQuery"));

    private static final SubLSymbol $cae_query_search_filter_specification_caching_state$ = makeSymbol("*CAE-QUERY-SEARCH-FILTER-SPECIFICATION-CACHING-STATE*");

    private static final SubLSymbol CAE_QUERY_SEARCH_FILTER_STRING = makeSymbol("CAE-QUERY-SEARCH-FILTER-STRING");

    private static final SubLSymbol $sym184$_TREE = makeSymbol("?TREE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$conceptFilterDecisionTree = reader_make_constant_shell(makeString("conceptFilterDecisionTree"));

    private static final SubLList $list187 = list(makeSymbol("?TREENAT"));

    private static final SubLList $list188 = list(list(reader_make_constant_shell(makeString("evaluate")), makeSymbol("?TREE"), makeSymbol("?TREENAT")));

    private static final SubLSymbol $cae_query_search_filter_string_caching_state$ = makeSymbol("*CAE-QUERY-SEARCH-FILTER-STRING-CACHING-STATE*");

    private static final SubLSymbol CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE = makeSymbol("CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE");

    private static final SubLSymbol $cae_query_search_term_classification_tree_caching_state$ = makeSymbol("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-CACHING-STATE*");

    private static final SubLSymbol CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS = makeSymbol("CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS");

    private static final SubLSymbol $cae_query_search_term_classification_tree_collections_caching_state$ = makeSymbol("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-CACHING-STATE*");

    private static final SubLSymbol CAE_DEFAULT_PARAPHRASE_MT = makeSymbol("CAE-DEFAULT-PARAPHRASE-MT");

    private static final SubLObject $$CAEDefaultParaphraseMtQuery = reader_make_constant_shell(makeString("CAEDefaultParaphraseMtQuery"));

    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    private static final SubLSymbol $cae_default_paraphrase_mt_caching_state$ = makeSymbol("*CAE-DEFAULT-PARAPHRASE-MT-CACHING-STATE*");

    private static final SubLSymbol CAE_DEFAULT_PARSING_MT = makeSymbol("CAE-DEFAULT-PARSING-MT");

    private static final SubLObject $$CAEDefaultParsingMtQuery = reader_make_constant_shell(makeString("CAEDefaultParsingMtQuery"));

    public static final SubLList $list200 = list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC")));

    private static final SubLSymbol $cae_default_parsing_mt_caching_state$ = makeSymbol("*CAE-DEFAULT-PARSING-MT-CACHING-STATE*");

    private static final SubLSymbol CAE_DEFAULT_NL_DOMAIN_MT = makeSymbol("CAE-DEFAULT-NL-DOMAIN-MT");

    private static final SubLObject $$CAEDefaultNLDomainMtQuery = reader_make_constant_shell(makeString("CAEDefaultNLDomainMtQuery"));

    private static final SubLSymbol $cae_default_nl_domain_mt_caching_state$ = makeSymbol("*CAE-DEFAULT-NL-DOMAIN-MT-CACHING-STATE*");

    private static final SubLSymbol CAE_GET_NL_MTS_FROM_TASK = makeSymbol("CAE-GET-NL-MTS-FROM-TASK");

    private static final SubLSymbol CAE_GET_CAE_MTS_FROM_TASK = makeSymbol("CAE-GET-CAE-MTS-FROM-TASK");

    private static final SubLSymbol CAE_TOPIC = makeSymbol("CAE-TOPIC");

    private static final SubLSymbol $sym208$_TOPIC = makeSymbol("?TOPIC");

    private static final SubLList $list209 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TOPIC"), reader_make_constant_shell(makeString("CAEAnalysisTopic")));

    private static final SubLObject $$topicOfIndividual = reader_make_constant_shell(makeString("topicOfIndividual"));

    private static final SubLList $list211 = list(makeSymbol("?TOPIC"));

    private static final SubLList $list212 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol $cae_topic_caching_state$ = makeSymbol("*CAE-TOPIC-CACHING-STATE*");

    private static final SubLSymbol CAE_TASK_TOPIC_CHANGED = makeSymbol("CAE-TASK-TOPIC-CHANGED");

    private static final SubLString $str215$failed_to_find_original_query_str = makeString("failed to find original query string");

    private static final SubLSymbol NEW_QUERY_ID = makeSymbol("NEW-QUERY-ID");

    private static final SubLObject $const217$QueryLibrary_QueryCreationTemplat = reader_make_constant_shell(makeString("QueryLibrary-QueryCreationTemplate"));

    private static final SubLObject $$TemplateFromTestQueryFn = reader_make_constant_shell(makeString("TemplateFromTestQueryFn"));

    private static final SubLString $$$UserQuery = makeString("UserQuery");

    private static final SubLList $list220 = list(reader_make_constant_shell(makeString("CycLQuerySpecification")));

    private static final SubLObject $$TestVocabularyMt = reader_make_constant_shell(makeString("TestVocabularyMt"));

    private static final SubLSymbol QUERY_LIBRARY_TEMPLATE_FORWARD_RULES = makeSymbol("QUERY-LIBRARY-TEMPLATE-FORWARD-RULES");

    private static final SubLSymbol $query_library_template_forward_rules_caching_state$ = makeSymbol("*QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-CACHING-STATE*");

    private static final SubLSymbol KILL_QUERY_TEMPLATE_AND_QUERY = makeSymbol("KILL-QUERY-TEMPLATE-AND-QUERY");

    private static final SubLObject $$TestQueryFn = reader_make_constant_shell(makeString("TestQueryFn"));

    private static final SubLSymbol KILL_QUERY_LIBRARY = makeSymbol("KILL-QUERY-LIBRARY");

    private static final SubLSymbol $sym227$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol QL_PRED_STRENGTHEN_SENTENCE = makeSymbol("QL-PRED-STRENGTHEN-SENTENCE");













    private static final SubLList $list235 = list(list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MEMBER"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEMBER"), reader_make_constant_shell(makeString("HumanAdult"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?MEMBER")), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?MEMBER"), makeSymbol("?PLACE")))), reader_make_constant_shell(makeString("InferencePSC"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MEMBER"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEMBER"), reader_make_constant_shell(makeString("HumanAdult"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?MEMBER")), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?MEMBER"), makeSymbol("?PLACE"))))));

    private static final SubLSymbol TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY = makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA-UNAMBIGUOUSLY");

    private static final SubLSymbol PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST = makeSymbol("PRED-STRENGTHEN-UNAMBIGUOUSLY-TEST");

    private static final SubLList $list238 = list(list(list(list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MEMBER"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEMBER"), reader_make_constant_shell(makeString("HumanAdult"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?MEMBER")), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?MEMBER"), makeSymbol("?PLACE")))), reader_make_constant_shell(makeString("InferencePSC"))), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MEMBER"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?MEMBER"), reader_make_constant_shell(makeString("HumanAdult"))), list(reader_make_constant_shell(makeString("politicalPartyMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?MEMBER")), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?MEMBER"), makeSymbol("?PLACE"))))));

    private static final SubLSymbol GET_CYCLS_FOR_UNINDEXED_STRING_TCT = makeSymbol("GET-CYCLS-FOR-UNINDEXED-STRING-TCT");

    private static final SubLList $list240 = list(list(list(makeString("Which terrorist groups have carried out suicide bombings in Israel?"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?TERRORIST-SUICIDE-BOMBING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERRORIST-SUICIDE-BOMBING"), reader_make_constant_shell(makeString("TerroristSuicideBombing"))), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?TERRORIST-SUICIDE-BOMBING"), reader_make_constant_shell(makeString("Israel"))), list(reader_make_constant_shell(makeString("perpetrator")), makeSymbol("?TERRORIST-SUICIDE-BOMBING"), makeSymbol("?CULPRIT")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CULPRIT"), reader_make_constant_shell(makeString("TerroristGroup")))))), T), list(list(makeString("What attacks has Hezbollah carried out since 2002?"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("AttackOnObject"))), list(reader_make_constant_shell(makeString("dateOfEvent")), makeSymbol("?ATTACK"), makeSymbol("?DATE")), list(reader_make_constant_shell(makeString("laterThan")), makeSymbol("?DATE"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2002))), list(reader_make_constant_shell(makeString("perpetrator")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("LebaneseHizballah"))))), T), list(list(makeString("What types of attacks has Hezbollah performed?"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?ACTION"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TYPE-OF-ATTACK"), reader_make_constant_shell(makeString("AttackType"))), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?ACTION"), reader_make_constant_shell(makeString("LebaneseHizballah"))), list(reader_make_constant_shell(makeString("nearestIsa")), makeSymbol("?ACTION"), makeSymbol("?TYPE-OF-ATTACK"))))), T), list(list(makeString("Where were the members of Hizballah born?"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?MEMBER"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?MEMBER")), list(reader_make_constant_shell(makeString("birthPlace")), makeSymbol("?MEMBER"), makeSymbol("?BIRTHPLACE"))))), T), list(list(makeString("Where do members of Hizballah live?"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?INHABITANT"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?INHABITANT")), list(reader_make_constant_shell(makeString("residesInRegion")), makeSymbol("?INHABITANT"), makeSymbol("?GEOGRAPHICAL-REGION"))))), T), list(list(makeString("What terrorist groups is Hezbollah financially linked to?"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TERRORIST-ORGANIZATION"), reader_make_constant_shell(makeString("TerroristGroup"))), list(reader_make_constant_shell(makeString("relatedToVia")), reader_make_constant_shell(makeString("LebaneseHizballah")), makeSymbol("?TERRORIST-ORGANIZATION"), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("financiallyLinked"))), THREE_INTEGER))), T), list(list(makeString("What types of financial links are there?"), list(reader_make_constant_shell(makeString("genlPreds")), makeSymbol("?BINARY-PREDICATE"), reader_make_constant_shell(makeString("financiallyLinked")))), T));

    public static SubLObject log_query_library_search(final SubLObject query_string, SubLObject user, SubLObject mt, SubLObject task) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (task == UNPROVIDED) {
            task = NIL;
        }
        final SubLObject search_constant = fi.fi_create_int(constants_high.suggest_constant_name(query_string, $str8$UserSearch_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        ke.ke_assert(listS($$isa, search_constant, $list10), mt, UNPROVIDED, UNPROVIDED);
        ke.ke_assert(list($$searchStringsUsed, search_constant, query_string), mt, UNPROVIDED, UNPROVIDED);
        ke.ke_assert(list($$performedBy, search_constant, user), mt, UNPROVIDED, UNPROVIDED);
        ke.ke_assert(listS($$dateOfEvent, search_constant, $list14), mt, UNPROVIDED, UNPROVIDED);
        if (NIL != task) {
            ke.ke_assert(list($$properSubEvents, list($$WorkEventOnSpecificationFn, task), search_constant), mt, UNPROVIDED, UNPROVIDED);
        }
        return search_constant;
    }

    public static SubLObject unindexed_queries_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ql_parses = get_cycls_for_unindexed_string(string);
        if (NIL == ql_parse_cycl(ql_parses.first())) {
            return NIL;
        }
        SubLObject generations = NIL;
        SubLObject new_queries = NIL;
        SubLObject cdolist_list_var = ql_parses;
        SubLObject ql_parse = NIL;
        ql_parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_ql_parse_cycl(ql_parse, optimize_el_formula_variable_names(ql_parse_cycl(ql_parse), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ql_parse = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        try {
            pph_vars.$pph_maximize_linksP$.bind(NIL, thread);
            final SubLObject cycls = Mapping.mapcar(QL_PARSE_CYCL, ql_parses);
            generations = pph_main.generate_disambiguation_phrases(cycls, $INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_0, thread);
        }
        SubLObject list_var = NIL;
        ql_parse = NIL;
        SubLObject number = NIL;
        list_var = ql_parses;
        ql_parse = list_var.first();
        for (number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ql_parse = list_var.first() , number = add(ONE_INTEGER, number)) {
            final SubLObject cycl = ql_parse_cycl(ql_parse);
            final SubLObject weight = ql_parse_weight(ql_parse);
            final SubLObject gloss = nth(number, generations).rest();
            final SubLObject template_id = new_query_id();
            final SubLObject template = formula_templates.new_formula_template(template_id, UNPROVIDED);
            final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
            formula_templates.formula_template_set_gloss(template, gloss);
            new_cycl_query_specification.set_new_cycl_query_specification_comment(query_spec, formula_templates.formula_template_gloss(template));
            new_cycl_query_specification.set_new_cycl_query_specification_formula(query_spec, cycl);
            new_cycl_query_specification.set_new_cycl_query_specification_mt(query_spec, $ql_default_mt$.getDynamicValue(thread));
            new_cycl_query_specification.set_new_cycl_query_specification_properties(query_spec, inference_datastructures_enumerated_types.merge_query_properties(new_cycl_query_specification.new_cycl_query_specification_properties(query_spec), query_library_api.guess_inference_parameters_for_query(query_spec, $ql_default_mt$.getDynamicValue(thread))));
            new_cycl_query_specification.set_new_cycl_query_specification_cycl_id(query_spec, template_id);
            formula_templates.formula_template_set_elmt(template, $ql_default_mt$.getDynamicValue(thread));
            formula_templates.formula_template_set_query_specification(template, query_spec);
            store_original_string_for_template_id(template_id, string);
            SubLObject xml_string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    formula_templates.xml_serialize_formula_template_as_document(template, UNPROVIDED);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
                }
                xml_string = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            new_queries = cons(xml_string, new_queries);
        }
        return new_queries;
    }

    public static SubLObject unindexed_queries_from_string_with_confidences(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ql_parses = get_cycls_for_unindexed_string(string);
        final SubLObject cycls = Mapping.mapcar(QL_PARSE_CYCL, ql_parses);
        if (NIL == cycls.first()) {
            return NIL;
        }
        SubLObject generations = NIL;
        SubLObject new_queries_with_confidences = NIL;
        SubLObject cdolist_list_var = ql_parses;
        SubLObject ql_parse = NIL;
        ql_parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_ql_parse_cycl(ql_parse, optimize_el_formula_variable_names(ql_parse_cycl(ql_parse), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ql_parse = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        try {
            pph_vars.$pph_maximize_linksP$.bind(NIL, thread);
            final SubLObject cycls_$1 = Mapping.mapcar(QL_PARSE_CYCL, ql_parses);
            generations = pph_main.generate_disambiguation_phrases(cycls_$1, $INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_0, thread);
        }
        SubLObject list_var = NIL;
        ql_parse = NIL;
        SubLObject number = NIL;
        list_var = ql_parses;
        ql_parse = list_var.first();
        for (number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , ql_parse = list_var.first() , number = add(ONE_INTEGER, number)) {
            final SubLObject cycl = ql_parse_cycl(ql_parse);
            final SubLObject weight = ql_parse_weight(ql_parse);
            final SubLObject v_2nd_weight = ql_parse_2nd_weight(ql_parse);
            final SubLObject gloss = nth(number, generations).rest();
            final SubLObject formula_wXrenamed_vars = optimize_el_formula_variable_names(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject template_id = new_query_id();
            final SubLObject template = formula_templates.new_formula_template(template_id, UNPROVIDED);
            final SubLObject query_spec = new_cycl_query_specification.create_new_cycl_query_specification();
            final SubLObject offset = ZERO_INTEGER;
            final SubLObject end = NIL;
            formula_templates.formula_template_set_gloss(template, gloss);
            new_cycl_query_specification.set_new_cycl_query_specification_comment(query_spec, formula_templates.formula_template_gloss(template));
            new_cycl_query_specification.set_new_cycl_query_specification_formula(query_spec, formula_wXrenamed_vars);
            new_cycl_query_specification.set_new_cycl_query_specification_mt(query_spec, $ql_default_mt$.getDynamicValue(thread));
            new_cycl_query_specification.set_new_cycl_query_specification_properties(query_spec, inference_datastructures_enumerated_types.merge_query_properties(new_cycl_query_specification.new_cycl_query_specification_properties(query_spec), query_library_api.guess_inference_parameters_for_query(query_spec, $ql_default_mt$.getDynamicValue(thread))));
            new_cycl_query_specification.set_new_cycl_query_specification_cycl_id(query_spec, template_id);
            formula_templates.formula_template_set_elmt(template, $ql_default_mt$.getDynamicValue(thread));
            formula_templates.formula_template_set_query_specification(template, query_spec);
            store_original_string_for_template_id(template_id, string);
            SubLObject xml_string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    formula_templates.xml_serialize_formula_template_as_document(template, UNPROVIDED);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
                }
                xml_string = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
            final SubLObject xml_string_with_confidence = new_weighted_xml(xml_string, weight, v_2nd_weight, offset, end, UNPROVIDED);
            new_queries_with_confidences = cons(xml_string_with_confidence, new_queries_with_confidences);
        }
        return new_queries_with_confidences;
    }

    public static SubLObject new_weighted_xml(final SubLObject xml, SubLObject weight, SubLObject v_2nd_weight, SubLObject offset, SubLObject end, SubLObject justification) {
        if (weight == UNPROVIDED) {
            weight = ZERO_INTEGER;
        }
        if (v_2nd_weight == UNPROVIDED) {
            v_2nd_weight = ZERO_INTEGER;
        }
        if (offset == UNPROVIDED) {
            offset = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        SubLObject result = list($XML, xml);
        if (NIL != weight) {
            result = putf(result, $WEIGHT, weight);
        }
        if (NIL != v_2nd_weight) {
            result = putf(result, $2ND_WEIGHT, v_2nd_weight);
        }
        if (NIL != offset) {
            result = putf(result, $OFFSET, offset);
        }
        if (NIL != end) {
            result = putf(result, $END, end);
        }
        if (NIL != justification) {
            result = putf(result, $JUSTIFICATION, justification);
        }
        return result;
    }

    public static SubLObject register_all_query_library_parsers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        register_cyclify_parser();
        register_cyclify_link_parser();
        register_template_parser();
        register_text_answers_as_last_resort();
        register_ebmt();
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_cyclify_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = $CYCLIFY;
        if (NIL == member(item_var, $registered_ql_parsers$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $registered_ql_parsers$.setDynamicValue(cons(item_var, $registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_cyclify_link_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = $CYCLIFY_LINK;
        if (NIL == member(item_var, $registered_ql_parsers$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $registered_ql_parsers$.setDynamicValue(cons(item_var, $registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject deregister_cyclify_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $registered_ql_parsers$.setDynamicValue(delete($CYCLIFY, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_template_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = $RTP;
        if (NIL == member(item_var, $registered_ql_parsers$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $registered_ql_parsers$.setDynamicValue(cons(item_var, $registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject deregister_template_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $registered_ql_parsers$.setDynamicValue(delete($RTP, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_text_answers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != find($TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find($TEXT_ANSWERS_LAST_RESORT, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            deregister_text_answers();
        }
        $registered_ql_parsers$.setDynamicValue(list_utilities.snoc($TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue(thread)), thread);
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_text_answers_as_last_resort() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != find($TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find($TEXT_ANSWERS_LAST_RESORT, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            deregister_text_answers();
        }
        $registered_ql_parsers$.setDynamicValue(list_utilities.snoc($TEXT_ANSWERS_LAST_RESORT, $registered_ql_parsers$.getDynamicValue(thread)), thread);
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject deregister_text_answers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $registered_ql_parsers$.setDynamicValue(delete($TEXT_ANSWERS, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        $registered_ql_parsers$.setDynamicValue(delete($TEXT_ANSWERS_LAST_RESORT, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_ebmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item_var = $EBMT;
        if (NIL == member(item_var, $registered_ql_parsers$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $registered_ql_parsers$.setDynamicValue(cons(item_var, $registered_ql_parsers$.getDynamicValue(thread)), thread);
        }
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject deregister_ebmt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $registered_ql_parsers$.setDynamicValue(delete($EBMT, $registered_ql_parsers$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject register_default_ql_parsers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $registered_ql_parsers$.setDynamicValue(NIL, thread);
        SubLObject cdolist_list_var = cfasl_decode(vector_utilities.hex_char_string_to_byte_vector($ql_default_parsers$.getDynamicValue(thread)));
        SubLObject v_parser = NIL;
        v_parser = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = v_parser;
            if (pcase_var.eql($CYCL)) {
                final SubLObject item_var = $CYCL;
                if (NIL == member(item_var, $registered_ql_parsers$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $registered_ql_parsers$.setDynamicValue(cons(item_var, $registered_ql_parsers$.getDynamicValue(thread)), thread);
                }
            } else
                if (pcase_var.eql($CYCLIFY)) {
                    register_cyclify_parser();
                } else
                    if (pcase_var.eql($CYCLIFY_LINK)) {
                        register_cyclify_link_parser();
                    } else
                        if (pcase_var.eql($RTP)) {
                            register_template_parser();
                        } else
                            if (pcase_var.eql($TEXT_ANSWERS)) {
                                register_text_answers();
                            } else
                                if (pcase_var.eql($TEXT_ANSWERS_LAST_RESORT)) {
                                    register_text_answers_as_last_resort();
                                } else
                                    if (pcase_var.eql($EBMT)) {
                                        register_ebmt();
                                    }






            cdolist_list_var = cdolist_list_var.rest();
            v_parser = cdolist_list_var.first();
        } 
        return $registered_ql_parsers$.getDynamicValue(thread);
    }

    public static SubLObject new_ql_parse(SubLObject cycl, SubLObject weight, SubLObject v_2nd_weight) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = ZERO_INTEGER;
        }
        if (v_2nd_weight == UNPROVIDED) {
            v_2nd_weight = ZERO_INTEGER;
        }
        SubLObject parse = NIL;
        if (NIL != cycl) {
            parse = putf(parse, $CYCL, cycl);
        }
        if (NIL != weight) {
            parse = putf(parse, $WEIGHT, weight);
        }
        if (NIL != v_2nd_weight) {
            parse = putf(parse, $2ND_WEIGHT, v_2nd_weight);
        }
        return parse;
    }

    public static SubLObject set_ql_parse_cycl(final SubLObject ql_parse, final SubLObject cycl) {
        return putf(ql_parse, $CYCL, cycl);
    }

    public static SubLObject set_ql_parse_weight(final SubLObject ql_parse, final SubLObject weight) {
        return putf(ql_parse, $WEIGHT, weight);
    }

    public static SubLObject set_ql_parse_2nd_weight(final SubLObject ql_parse, final SubLObject v_2nd_weight) {
        return putf(ql_parse, $2ND_WEIGHT, v_2nd_weight);
    }

    public static SubLObject ql_parse_cycl(final SubLObject ql_parse) {
        return getf(ql_parse, $CYCL, UNPROVIDED);
    }

    public static SubLObject ql_parse_weight(final SubLObject ql_parse) {
        return getf(ql_parse, $WEIGHT, UNPROVIDED);
    }

    public static SubLObject ql_parse_2nd_weight(final SubLObject ql_parse) {
        return getf(ql_parse, $2ND_WEIGHT, UNPROVIDED);
    }

    public static SubLObject ql_parse_equalP(final SubLObject ql_parse1, final SubLObject ql_parse2) {
        return czer_utilities.equals_elP(ql_parse_cycl(ql_parse1), ql_parse_cycl(ql_parse2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cycls_for_unindexed_string(final SubLObject raw_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = preprocess_query_string(raw_string);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = $registered_ql_parsers$.getDynamicValue(thread);
        SubLObject v_parser = NIL;
        v_parser = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = v_parser;
            if (pcase_var.eql($CYCLIFY_LINK)) {
                result = ql_cyclify_link(string, result);
            } else
                if (pcase_var.eql($CYCLIFY)) {
                    result = ql_cyclify(string, result);
                } else
                    if (pcase_var.eql($RTP)) {
                        result = ql_template_parse_query(string, result);
                    } else
                        if (pcase_var.eql($CYCL)) {
                            result = ql_interpret_cycl(string, result);
                        } else
                            if (pcase_var.eql($TEXT_ANSWERS)) {
                                result = ql_text_answer_query(string, result, UNPROVIDED);
                            } else
                                if (pcase_var.eql($TEXT_ANSWERS_LAST_RESORT)) {
                                    result = ql_text_answer_query(string, result, T);
                                }





            cdolist_list_var = cdolist_list_var.rest();
            v_parser = cdolist_list_var.first();
        } 
        return Sort.sort(delete_duplicates(result, $sym37$QL_PARSE_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym38$_, QL_PARSE_WEIGHT);
    }

    public static SubLObject preprocess_query_string(final SubLObject string) {
        if (NIL != string_utilities.starts_with(string, $$$and)) {
            return string_utilities.replace_substring_once(string, $$$and, $$$what, UNPROVIDED);
        }
        return string;
    }

    public static SubLObject ql_cyclify(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == UNPROVIDED) {
            existing_parses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combined_result = existing_parses;
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject cdolist_list_var = cyclifier.cyclify(string, list($OUTPUT, $VERBOSE, $SCORE_FUNCTION, CYCLIFICATION_COVERAGE, $LEXICON, new_ql_lexicon(), $PARSER, parser.new_stanford_parser(UNPROVIDED, UNPROVIDED)));
                    SubLObject raw_result = NIL;
                    raw_result = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = raw_result;
                        SubLObject raw_cycl = NIL;
                        SubLObject weight = NIL;
                        destructuring_bind_must_consp(current, datum, $list43);
                        raw_cycl = current.first();
                        current = weight = current.rest();
                        final SubLObject processed_cycl = ql_postprocess_cyclify_cycl(raw_cycl);
                        if (NIL != processed_cycl) {
                            combined_result = cons(new_ql_parse(processed_cycl, weight, UNPROVIDED), combined_result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        raw_result = cdolist_list_var.first();
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != msg) {
            Errors.warn($str50$caught_error__S_while_link_parsin, msg, string);
        }
        return combined_result;
    }

    public static SubLObject new_ql_lexicon() {
        final SubLObject lexicon = object.new_class_instance($sym51$CYCLIFIER_LEXICON_W_O_FABRICATION);
        methods.funcall_instance_method_with_1_args(lexicon, FORBID_MT, $$NameLexicalMt);
        return lexicon;
    }

    public static SubLObject ql_postprocess_cyclify_cycl(final SubLObject cycl) {
        if (NIL != cycl_utilities.expression_contains_keywordp(cycl, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject transformed_result = convert_instancefns_to_variables(cycl);
        final SubLObject final_result = ql_pred_strengthen_sentence(transformed_result, $$InferencePSC);
        return final_result;
    }

    public static SubLObject ql_pred_strengthen_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.currentBinding(thread);
        try {
            predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.bind(T, thread);
            result = predicate_strengthener.typed_pred_strengthen_formula_unambiguously(sentence, mt, UNPROVIDED).first();
        } finally {
            predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ql_cyclify_link(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == UNPROVIDED) {
            existing_parses = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject combined_result = existing_parses;
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject v_parser = parser.new_link_parser(linkage.$link_parse_options$.getDynamicValue(thread), $WARN, UNPROVIDED);
                    SubLObject cdolist_list_var;
                    final SubLObject raw_results = cdolist_list_var = cyclifier.cyclify(string, list($PARSER, v_parser, $OUTPUT, $VERBOSE, $SCORE_FUNCTION, CYCLIFICATION_COVERAGE, $LEXICON, new_ql_lexicon()));
                    SubLObject raw_result = NIL;
                    raw_result = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = raw_result;
                        SubLObject raw_parse = NIL;
                        SubLObject weight = NIL;
                        destructuring_bind_must_consp(current, datum, $list56);
                        raw_parse = current.first();
                        current = weight = current.rest();
                        final SubLObject processed_cycl = ql_postprocess_cyclify_cycl(raw_parse);
                        if (NIL != processed_cycl) {
                            combined_result = cons(new_ql_parse(processed_cycl, weight, UNPROVIDED), combined_result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        raw_result = cdolist_list_var.first();
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != msg) {
            Errors.warn($str50$caught_error__S_while_link_parsin, msg, string);
        }
        return combined_result;
    }

    public static SubLObject convert_instancefns_to_variables(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_vars = NIL;
        SubLObject new_sentence = NIL;
        final SubLObject _prev_bind_0 = $new_vars$.currentBinding(thread);
        try {
            $new_vars$.bind(NIL, thread);
            new_sentence = cycl_utilities.expression_transform(obj, $sym58$INSTANCEFN_, VAR_FROM_INSTANCEFN, UNPROVIDED, UNPROVIDED);
            new_vars = $new_vars$.getDynamicValue(thread);
        } finally {
            $new_vars$.rebind(_prev_bind_0, thread);
        }
        return values(new_sentence, new_vars);
    }

    public static SubLObject instancefnP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_expression_p(v_object)) && cycl_utilities.formula_arg0(v_object).eql($$InstanceFn));
    }

    public static SubLObject var_from_instancefn(final SubLObject instancefn_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = read_from_string_ignoring_errors(cycl_utilities.formula_arg1(instancefn_naut, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != result) {
            $new_vars$.setDynamicValue(cons(result, $new_vars$.getDynamicValue(thread)), thread);
        }
        return NIL != result ? result : instancefn_naut;
    }

    public static SubLObject ql_template_parse_query(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == UNPROVIDED) {
            existing_parses = NIL;
        }
        SubLObject full_results = existing_parses;
        final SubLObject domain_mt = $$RKFParsingMt;
        SubLObject cdolist_list_var = rkf_text_processors.parse_a_question_completely(string, domain_mt, UNPROVIDED);
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (((NIL == contains_nlrequestfnP(cycl)) && (NIL == cycl_utilities.expression_find($$playsActiveSubjectRole, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != cyclifier.quick_sentential_parse_wffP(cycl))) {
                cycl = ql_pred_strengthen_sentence(cycl, domain_mt);
                full_results = cons(new_ql_parse(cycl, ONE_INTEGER, template_parse_complexity_weight(cycl)), full_results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return Sort.sort(full_results, symbol_function($sym38$_), QL_PARSE_2ND_WEIGHT);
    }

    public static SubLObject template_parse_complexity_weight(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return expt($template_parse_complexity_weight_factor$.getDynamicValue(thread), function_terms.term_relational_complexity(cycl));
    }

    public static SubLObject ql_interpret_cycl(final SubLObject string, SubLObject existing_parses) {
        if (existing_parses == UNPROVIDED) {
            existing_parses = NIL;
        }
        final SubLObject result = read_from_string_ignoring_errors(string_utilities.cyclify_string(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != cycl_grammar.cycl_sentence_p(result)) {
            existing_parses = cons(new_ql_parse(result, ONE_INTEGER, UNPROVIDED), existing_parses);
        }
        return existing_parses;
    }

    public static SubLObject ql_text_answer_query(final SubLObject string, SubLObject existing_parses, SubLObject last_resortP) {
        if (existing_parses == UNPROVIDED) {
            existing_parses = NIL;
        }
        if (last_resortP == UNPROVIDED) {
            last_resortP = NIL;
        }
        if ((NIL == existing_parses) || (NIL == last_resortP)) {
            existing_parses = cons(new_ql_parse(listS($$textAnswer, string, $list66), ONE_INTEGER, UNPROVIDED), existing_parses);
        }
        return existing_parses;
    }

    public static SubLObject contains_nlrequestfnP(final SubLObject cycl) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find($$NLRequestFn, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

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
        return NIL;
    }

    public static SubLObject default_inference_parameters_for_task(SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject ip = NIL;
        final SubLObject default_transformations_for_task = query_library_default_transformation_depth(task);
        final SubLObject default_max_time = query_library_default_max_time(task);
        final SubLObject default_indeterminate_terms_allowedP = query_library_default_indeterminate_terms_allowed(task);
        final SubLObject default_new_new_terms_allowedP = query_library_default_new_terms_allowed(task);
        final SubLObject default_disjunction_el_vars_policy = query_library_default_disjunction_free_el_vars_policy(task);
        final SubLObject default_max_productivity = query_library_default_max_productivity(task);
        final SubLObject default_compute_answer_justificationsP = query_library_default_compute_answer_justifications(task);
        ip = putf(ip, $MAX_TRANSFORMATION_DEPTH, default_transformations_for_task);
        ip = putf(ip, $kw69$ALLOW_INDETERMINATE_RESULTS_, default_indeterminate_terms_allowedP);
        ip = putf(ip, $kw70$NEW_TERMS_ALLOWED_, default_new_new_terms_allowedP);
        ip = putf(ip, $MAX_TIME, default_max_time);
        ip = putf(ip, $DISJUNCTION_FREE_EL_VARS_POLICY, default_disjunction_el_vars_policy);
        ip = putf(ip, $PRODUCTIVITY_LIMIT, default_max_productivity);
        ip = putf(ip, $kw74$COMPUTE_ANSWER_JUSTIFICATIONS_, default_compute_answer_justificationsP);
        return ip;
    }

    public static SubLObject get_auto_unification_mt(SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return get_default_wff_checking_mt(task);
    }

    public static SubLObject cae_single_value_task_dependent_query_answer(final SubLObject task, final SubLObject query_template, SubLObject result_var, SubLObject default_value) {
        if (result_var == UNPROVIDED) {
            result_var = NIL;
        }
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != forts.valid_fortP(query_template)) {
            final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
            try {
                cae_query_search.$current_cae_task$.bind(task, thread);
                final SubLObject v_bindings = kb_query.new_cyc_query_from_kbq(query_template, $list76, UNPROVIDED).first();
                if ((NIL == result_var) && (NIL != list_utilities.singletonP(v_bindings))) {
                    result_var = bindings.variable_binding_variable(v_bindings.first());
                }
                if (NIL != result_var) {
                    v_answer = bindings.variable_lookup(result_var, v_bindings);
                }
            } finally {
                cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != v_answer ? v_answer : default_value;
    }

    public static SubLObject cae_multiple_value_task_dependent_query_answer(final SubLObject task, final SubLObject query_template, SubLObject result_var, SubLObject default_value) {
        if (result_var == UNPROVIDED) {
            result_var = NIL;
        }
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL != forts.valid_fortP(query_template)) {
            final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
            try {
                cae_query_search.$current_cae_task$.bind(task, thread);
                SubLObject cdolist_list_var;
                final SubLObject v_bindings = cdolist_list_var = kb_query.new_cyc_query_from_kbq(query_template, $list77, UNPROVIDED);
                SubLObject binding = NIL;
                binding = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == result_var) && (NIL != list_utilities.singletonP(binding))) {
                        result_var = bindings.variable_binding_variable(binding.first());
                    }
                    if (NIL != result_var) {
                        final SubLObject item_var = bindings.variable_lookup(result_var, binding);
                        if (NIL == member(item_var, v_answer, symbol_function(EQL), symbol_function(IDENTITY))) {
                            v_answer = cons(item_var, v_answer);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    binding = cdolist_list_var.first();
                } 
            } finally {
                cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != v_answer ? v_answer : default_value;
    }

    public static SubLObject clear_cae_fact_editor_focal_types() {
        final SubLObject cs = $cae_fact_editor_focal_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_fact_editor_focal_types(SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return memoization_state.caching_state_remove_function_results_with_args($cae_fact_editor_focal_types_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_fact_editor_focal_types_internal(final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_template = $$CAEFactEditorFocalTypeQuery;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
        try {
            cae_query_search.$current_cae_task$.bind(task, thread);
            SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq(query_template, UNPROVIDED, UNPROVIDED);
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject Ptemplate = sublis(binding, $sym80$_TEMPLATE, UNPROVIDED, UNPROVIDED);
                result = cons(Ptemplate, result);
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
        } finally {
            cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject cae_fact_editor_focal_types(SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject caching_state = $cae_fact_editor_focal_types_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_FACT_EDITOR_FOCAL_TYPES, $cae_fact_editor_focal_types_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_fact_editor_focal_types_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_default_wff_checking_mt() {
        final SubLObject cs = $get_default_wff_checking_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_default_wff_checking_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($get_default_wff_checking_mt_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_default_wff_checking_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEWFFCheckingMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo);
    }

    public static SubLObject get_default_wff_checking_mt(final SubLObject task) {
        SubLObject caching_state = $get_default_wff_checking_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFAULT_WFF_CHECKING_MT, $get_default_wff_checking_mt_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_default_wff_checking_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_default_cae_guidance_mt() {
        final SubLObject cs = $get_default_cae_guidance_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_default_cae_guidance_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($get_default_cae_guidance_mt_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_default_cae_guidance_mt_internal(final SubLObject task) {
        SubLObject v_answer = NIL;
        if (NIL != valid_constantP($$CAEGuidanceMtQuery, UNPROVIDED)) {
            v_answer = cae_single_value_task_dependent_query_answer(task, $$CAEGuidanceMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo);
        }
        if (NIL == v_answer) {
            v_answer = cae_single_value_task_dependent_query_answer(task, $$CAEWFFCheckingMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo);
        }
        return v_answer;
    }

    public static SubLObject get_default_cae_guidance_mt(final SubLObject task) {
        SubLObject caching_state = $get_default_cae_guidance_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFAULT_CAE_GUIDANCE_MT, $get_default_cae_guidance_mt_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_DEFAULT_CAE_GUIDANCE_MT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_default_cae_guidance_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_all_default_wff_checking_mts() {
        return ask_utilities.query_variable($sym84$_MT, $list91, $$CycArchitectureMt, $list93);
    }

    public static SubLObject clear_query_library_default_query_mt() {
        final SubLObject cs = $query_library_default_query_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_query_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_query_mt_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_query_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEDefaultQueryMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo);
    }

    public static SubLObject query_library_default_query_mt(final SubLObject task) {
        SubLObject caching_state = $query_library_default_query_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_QUERY_MT, $query_library_default_query_mt_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_query_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_query_search_fact_sheet_links_enabledP() {
        final SubLObject cs = $query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_query_search_fact_sheet_links_enabledP(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_query_search_fact_sheet_links_enabledP_internal(final SubLObject task) {
        return eq($$True, query_library_query_search_fact_sheet_links_enabledP_int(task));
    }

    public static SubLObject query_library_query_search_fact_sheet_links_enabledP(final SubLObject task) {
        SubLObject caching_state = $query_library_query_search_fact_sheet_links_enabledP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_, $sym99$_QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED__CACHING_STA, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_query_search_fact_sheet_links_enabledP_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject query_library_query_search_fact_sheet_links_enabledP_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const100$CAEQuerySearchFactSheetLinksEnabl, $sym101$_VALUE, $$True);
    }

    public static SubLObject clear_rtv_panel_enabled_for_task() {
        final SubLObject cs = $rtv_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rtv_panel_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($rtv_panel_enabled_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rtv_panel_enabled_for_task_internal(final SubLObject task) {
        return eq($$True, rtv_panel_enabled_for_task_int(task));
    }

    public static SubLObject rtv_panel_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = $rtv_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RTV_PANEL_ENABLED_FOR_TASK, $rtv_panel_enabled_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtv_panel_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rtv_panel_enabled_for_task_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAERTVPanelEnabledQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_document_search_panel_enabled_for_task() {
        final SubLObject cs = $document_search_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_document_search_panel_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($document_search_panel_enabled_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject document_search_panel_enabled_for_task_internal(final SubLObject task) {
        return eq($$True, document_search_panel_enabled_for_task_int(task));
    }

    public static SubLObject document_search_panel_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = $document_search_panel_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK, $document_search_panel_enabled_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(document_search_panel_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject document_search_panel_enabled_for_task_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAETextSearchPanelEnabledQuery, T)) {
            return $$True;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAETextSearchPanelEnabledQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_source_information_enabled_for_task() {
        final SubLObject cs = $source_information_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_source_information_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($source_information_enabled_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject source_information_enabled_for_task_internal(final SubLObject task) {
        return eq($$True, source_information_enabled_for_task_int(task));
    }

    public static SubLObject source_information_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = $source_information_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOURCE_INFORMATION_ENABLED_FOR_TASK, $source_information_enabled_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(source_information_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject source_information_enabled_for_task_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAESourceInformationEnabledQuery, T)) {
            return $$True;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAESourceInformationEnabledQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_irrelevant_results_allowed_for_task() {
        final SubLObject cs = $irrelevant_results_allowed_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_irrelevant_results_allowed_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($irrelevant_results_allowed_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject irrelevant_results_allowed_for_task_internal(final SubLObject task) {
        return eq($$True, irrelevant_results_allowed_for_task_int(task));
    }

    public static SubLObject irrelevant_results_allowed_for_task(final SubLObject task) {
        SubLObject caching_state = $irrelevant_results_allowed_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(IRRELEVANT_RESULTS_ALLOWED_FOR_TASK, $irrelevant_results_allowed_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(irrelevant_results_allowed_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject irrelevant_results_allowed_for_task_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEIrrelevantTermAllowedQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEIrrelevantTermAllowedQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_report_generation_enabled_for_task() {
        final SubLObject cs = $report_generation_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_report_generation_enabled_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($report_generation_enabled_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject report_generation_enabled_for_task_internal(final SubLObject task) {
        return eq($$True, report_generation_enabled_for_task_int(task));
    }

    public static SubLObject report_generation_enabled_for_task(final SubLObject task) {
        SubLObject caching_state = $report_generation_enabled_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(REPORT_GENERATION_ENABLED_FOR_TASK, $report_generation_enabled_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(report_generation_enabled_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject report_generation_enabled_for_task_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEReportGenerationEnabledQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEReportGenerationEnabledQuery, $sym105$_TV, $$False);
    }

    public static SubLObject clear_report_generation_template_root_collection_for_task() {
        final SubLObject cs = $report_generation_template_root_collection_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_report_generation_template_root_collection_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($report_generation_template_root_collection_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject report_generation_template_root_collection_for_task_internal(final SubLObject task) {
        return report_generation_template_root_collection_for_task_int(task);
    }

    public static SubLObject report_generation_template_root_collection_for_task(final SubLObject task) {
        SubLObject caching_state = $report_generation_template_root_collection_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK, $report_generation_template_root_collection_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(report_generation_template_root_collection_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject report_generation_template_root_collection_for_task_int(final SubLObject task) {
        if (NIL == valid_constantP($const121$CAEReportGenerationTemplateRootCo, T)) {
            return $$ReportGenerationTemplate;
        }
        return cae_single_value_task_dependent_query_answer(task, $const121$CAEReportGenerationTemplateRootCo, $sym123$_COL, $$ReportGenerationTemplate);
    }

    public static SubLObject clear_task_allows_not() {
        final SubLObject cs = $task_allows_not_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_task_allows_not(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($task_allows_not_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject task_allows_not_internal(final SubLObject task) {
        return eq($$True, task_allows_not_int(task));
    }

    public static SubLObject task_allows_not(final SubLObject task) {
        SubLObject caching_state = $task_allows_not_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TASK_ALLOWS_NOT, $task_allows_not_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(task_allows_not_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject task_allows_not_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEAllowsNotQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEAllowsNotQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_task_allows_implies() {
        final SubLObject cs = $task_allows_implies_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_task_allows_implies(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($task_allows_implies_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject task_allows_implies_internal(final SubLObject task) {
        return eq($$True, task_allows_implies_int(task));
    }

    public static SubLObject task_allows_implies(final SubLObject task) {
        SubLObject caching_state = $task_allows_implies_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TASK_ALLOWS_IMPLIES, $task_allows_implies_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(task_allows_implies_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject task_allows_implies_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEAllowsImpliesQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEAllowsImpliesQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_task_allows_and() {
        final SubLObject cs = $task_allows_and_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_task_allows_and(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($task_allows_and_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject task_allows_and_internal(final SubLObject task) {
        return eq($$True, task_allows_and_int(task));
    }

    public static SubLObject task_allows_and(final SubLObject task) {
        SubLObject caching_state = $task_allows_and_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TASK_ALLOWS_AND, $task_allows_and_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(task_allows_and_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject task_allows_and_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEAllowsAndQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEAllowsAndQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_task_allows_or() {
        final SubLObject cs = $task_allows_or_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_task_allows_or(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($task_allows_or_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject task_allows_or_internal(final SubLObject task) {
        return eq($$True, task_allows_or_int(task));
    }

    public static SubLObject task_allows_or(final SubLObject task) {
        SubLObject caching_state = $task_allows_or_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TASK_ALLOWS_OR, $task_allows_or_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(task_allows_or_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject task_allows_or_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEAllowsOrQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEAllowsOrQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_task_allows_unknown_sentence() {
        final SubLObject cs = $task_allows_unknown_sentence_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_task_allows_unknown_sentence(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($task_allows_unknown_sentence_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject task_allows_unknown_sentence_internal(final SubLObject task) {
        return eq($$True, task_allows_unknown_sentence_int(task));
    }

    public static SubLObject task_allows_unknown_sentence(final SubLObject task) {
        SubLObject caching_state = $task_allows_unknown_sentence_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TASK_ALLOWS_UNKNOWN_SENTENCE, $task_allows_unknown_sentence_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(task_allows_unknown_sentence_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject task_allows_unknown_sentence_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAEAllowsUnknownSentenceQuery, T)) {
            return $$False;
        }
        return cae_single_value_task_dependent_query_answer(task, $$CAEAllowsUnknownSentenceQuery, $sym105$_TV, UNPROVIDED);
    }

    public static SubLObject clear_sparql_browser_urls_for_task() {
        final SubLObject cs = $sparql_browser_urls_for_task_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sparql_browser_urls_for_task(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($sparql_browser_urls_for_task_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sparql_browser_urls_for_task_internal(final SubLObject task) {
        return sparql_browser_urls_for_task_int(task);
    }

    public static SubLObject sparql_browser_urls_for_task(final SubLObject task) {
        SubLObject caching_state = $sparql_browser_urls_for_task_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SPARQL_BROWSER_URLS_FOR_TASK, $sparql_browser_urls_for_task_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sparql_browser_urls_for_task_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sparql_browser_urls_for_task_int(final SubLObject task) {
        if (NIL == valid_constantP($$CAESPARQLBrowserAddressQuery, T)) {
            return NIL;
        }
        return Mapping.mapcar(URL_STRING, cae_multiple_value_task_dependent_query_answer(task, $$CAESPARQLBrowserAddressQuery, $sym143$_URL, UNPROVIDED));
    }

    public static SubLObject clear_query_library_root_folder() {
        final SubLObject cs = $query_library_root_folder_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_root_folder(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_root_folder_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_root_folder_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEQueryLibraryRootFolderQuery, $sym84$_MT, UNPROVIDED);
    }

    public static SubLObject query_library_root_folder(final SubLObject task) {
        SubLObject caching_state = $query_library_root_folder_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_ROOT_FOLDER, $query_library_root_folder_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_root_folder_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_should_suggestions_be_intersected() {
        final SubLObject cs = $query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_should_suggestions_be_intersected(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_should_suggestions_be_intersected_internal(final SubLObject task) {
        return eq($$True, cae_single_value_task_dependent_query_answer(task, $const148$CAEQueryLibraryShouldSuggestionsB, $sym149$_TRUTH, UNPROVIDED));
    }

    public static SubLObject query_library_should_suggestions_be_intersected(final SubLObject task) {
        SubLObject caching_state = $query_library_should_suggestions_be_intersected_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED, $query_library_should_suggestions_be_intersected_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_should_suggestions_be_intersected_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_default_transformation_depth() {
        final SubLObject cs = $query_library_default_transformation_depth_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_transformation_depth(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_transformation_depth_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_transformation_depth_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const152$CAEQueryLibraryDefaultTransformat, $sym84$_MT, UNPROVIDED);
    }

    public static SubLObject query_library_default_transformation_depth(final SubLObject task) {
        SubLObject caching_state = $query_library_default_transformation_depth_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH, $query_library_default_transformation_depth_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_transformation_depth_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_default_compute_answer_justifications() {
        final SubLObject cs = $query_library_default_compute_answer_justifications_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_compute_answer_justifications(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_compute_answer_justifications_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_compute_answer_justifications_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(cae_single_value_task_dependent_query_answer(task, $const155$CAEQueryLibraryDefaultComputeAnsw, $sym101$_VALUE, UNPROVIDED));
    }

    public static SubLObject query_library_default_compute_answer_justifications(final SubLObject task) {
        SubLObject caching_state = $query_library_default_compute_answer_justifications_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS, $query_library_default_compute_answer_justifications_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_compute_answer_justifications_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_default_max_time() {
        final SubLObject cs = $query_library_default_max_time_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_max_time(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_max_time_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_max_time_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const158$CAEQueryLibraryDefaultMaxTimeQuer, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_max_time(final SubLObject task) {
        SubLObject caching_state = $query_library_default_max_time_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_MAX_TIME, $query_library_default_max_time_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_max_time_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_default_max_productivity() {
        final SubLObject cs = $query_library_default_max_productivity_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_max_productivity(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_max_productivity_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_max_productivity_internal(final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = cae_single_value_task_dependent_query_answer(task, $const161$CAEQueryLibraryDefaultMaxProducti, UNPROVIDED, UNPROVIDED);
        if ((((NIL != value) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL == number_utilities.non_negative_number_p(value))) && (!value.eql($$PlusInfinity))) {
            Errors.error($str163$Got_invalid_default__productivity, value, task);
        }
        return NIL != value ? value : inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue();
    }

    public static SubLObject query_library_default_max_productivity(final SubLObject task) {
        SubLObject caching_state = $query_library_default_max_productivity_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY, $query_library_default_max_productivity_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_max_productivity_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_query_library_default_new_terms_allowed() {
        final SubLObject cs = $query_library_default_new_terms_allowed_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_new_terms_allowed(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_new_terms_allowed_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_new_terms_allowed_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(query_library_default_new_terms_allowed_int(task));
    }

    public static SubLObject query_library_default_new_terms_allowed(final SubLObject task) {
        SubLObject caching_state = $query_library_default_new_terms_allowed_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED, $query_library_default_new_terms_allowed_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_new_terms_allowed_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject query_library_default_new_terms_allowed_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const167$CAEQueryLibraryDefaultNewTermsAll, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_allow_arbitrary_assertion_deletion() {
        final SubLObject cs = $allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_allow_arbitrary_assertion_deletion(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject allow_arbitrary_assertion_deletion_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(allow_arbitrary_assertion_deletion_int(task));
    }

    public static SubLObject allow_arbitrary_assertion_deletion(final SubLObject task) {
        SubLObject caching_state = $allow_arbitrary_assertion_deletion_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALLOW_ARBITRARY_ASSERTION_DELETION, $allow_arbitrary_assertion_deletion_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(allow_arbitrary_assertion_deletion_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject allow_arbitrary_assertion_deletion_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const170$AppAllowsArbitraryAssertionDeleti, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_query_library_default_indeterminate_terms_allowed() {
        final SubLObject cs = $query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_indeterminate_terms_allowed(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_indeterminate_terms_allowed_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(query_library_default_indeterminate_terms_allowed_int(task));
    }

    public static SubLObject query_library_default_indeterminate_terms_allowed(final SubLObject task) {
        SubLObject caching_state = $query_library_default_indeterminate_terms_allowed_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED, $query_library_default_indeterminate_terms_allowed_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_indeterminate_terms_allowed_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject query_library_default_indeterminate_terms_allowed_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const173$CAEQueryLibraryDefaultIndetermina, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_query_library_default_disjunction_free_el_vars_policy() {
        final SubLObject cs = $query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_default_disjunction_free_el_vars_policy(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_default_disjunction_free_el_vars_policy_internal(final SubLObject task) {
        return subl_identifier.sublid_from_cyc_entity(query_library_default_disjunction_free_el_vars_policy_int(task));
    }

    public static SubLObject query_library_default_disjunction_free_el_vars_policy(final SubLObject task) {
        SubLObject caching_state = $query_library_default_disjunction_free_el_vars_policy_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY, $query_library_default_disjunction_free_el_vars_policy_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_default_disjunction_free_el_vars_policy_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject query_library_default_disjunction_free_el_vars_policy_int(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const176$CAEQueryLibraryDefaultDisjunction, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_cae_query_search_filter() {
        final SubLObject cs = $cae_query_search_filter_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_query_search_filter(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_query_search_filter_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_filter_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEQuerySearchFilterQuery, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_filter(final SubLObject task) {
        SubLObject caching_state = $cae_query_search_filter_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_QUERY_SEARCH_FILTER, $cae_query_search_filter_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_query_search_filter_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_query_search_filter_specification() {
        final SubLObject cs = $cae_query_search_filter_specification_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_query_search_filter_specification(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_query_search_filter_specification_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_filter_specification_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $const181$CAEQuerySearchFilterSpecification, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_filter_specification(final SubLObject task) {
        SubLObject caching_state = $cae_query_search_filter_specification_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_QUERY_SEARCH_FILTER_SPECIFICATION, $cae_query_search_filter_specification_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_query_search_filter_specification_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_query_search_filter_string() {
        final SubLObject cs = $cae_query_search_filter_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_query_search_filter_string(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_query_search_filter_string_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_filter_string_internal(final SubLObject task) {
        final SubLObject filter = cae_query_search_filter(task);
        final SubLObject filter_tree = ask_utilities.query_variable($sym184$_TREE, listS($$and, listS($$conceptFilterDecisionTree, filter, $list187), $list188), $$InferencePSC, UNPROVIDED).first();
        return filter_tree;
    }

    public static SubLObject cae_query_search_filter_string(final SubLObject task) {
        SubLObject caching_state = $cae_query_search_filter_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_QUERY_SEARCH_FILTER_STRING, $cae_query_search_filter_string_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_query_search_filter_string_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_query_search_term_classification_tree() {
        final SubLObject cs = $cae_query_search_term_classification_tree_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_query_search_term_classification_tree(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_query_search_term_classification_tree_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_term_classification_tree_internal(final SubLObject task) {
        return decision_tree.new_decision_tree_from_weka_j48_format(cae_query_search_filter_string(task));
    }

    public static SubLObject cae_query_search_term_classification_tree(final SubLObject task) {
        SubLObject caching_state = $cae_query_search_term_classification_tree_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE, $cae_query_search_term_classification_tree_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_query_search_term_classification_tree_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_query_search_term_classification_tree_collections() {
        final SubLObject cs = $cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_query_search_term_classification_tree_collections(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_query_search_term_classification_tree_collections_internal(final SubLObject task) {
        return term_classification_tree.create_term_classification_tree_collections(cae_query_search_term_classification_tree(task));
    }

    public static SubLObject cae_query_search_term_classification_tree_collections(final SubLObject task) {
        SubLObject caching_state = $cae_query_search_term_classification_tree_collections_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS, $cae_query_search_term_classification_tree_collections_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_query_search_term_classification_tree_collections_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_default_paraphrase_mt() {
        final SubLObject cs = $cae_default_paraphrase_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_default_paraphrase_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_default_paraphrase_mt_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_default_paraphrase_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEDefaultParaphraseMtQuery, $sym84$_MT, $$EnglishParaphraseMt);
    }

    public static SubLObject cae_default_paraphrase_mt(final SubLObject task) {
        SubLObject caching_state = $cae_default_paraphrase_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_DEFAULT_PARAPHRASE_MT, $cae_default_paraphrase_mt_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_default_paraphrase_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_default_parsing_mt() {
        final SubLObject cs = $cae_default_parsing_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_default_parsing_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_default_parsing_mt_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_default_parsing_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEDefaultParsingMtQuery, $sym84$_MT, $list200);
    }

    public static SubLObject cae_default_parsing_mt(final SubLObject task) {
        SubLObject caching_state = $cae_default_parsing_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_DEFAULT_PARSING_MT, $cae_default_parsing_mt_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_default_parsing_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cae_default_nl_domain_mt() {
        final SubLObject cs = $cae_default_nl_domain_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_default_nl_domain_mt(final SubLObject task) {
        return memoization_state.caching_state_remove_function_results_with_args($cae_default_nl_domain_mt_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_default_nl_domain_mt_internal(final SubLObject task) {
        return cae_single_value_task_dependent_query_answer(task, $$CAEDefaultNLDomainMtQuery, $sym84$_MT, $const85$CurrentWorldDataCollectorMt_NonHo);
    }

    public static SubLObject cae_default_nl_domain_mt(final SubLObject task) {
        SubLObject caching_state = $cae_default_nl_domain_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_DEFAULT_NL_DOMAIN_MT, $cae_default_nl_domain_mt_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_default_nl_domain_mt_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject cae_get_nl_mts_from_task(final SubLObject task) {
        return list(cae_default_nl_domain_mt(task), cae_default_paraphrase_mt(task), cae_default_parsing_mt(task));
    }

    public static SubLObject cae_get_cae_mts_from_task(final SubLObject task) {
        return list(cae_default_nl_domain_mt(task), cae_default_paraphrase_mt(task), cae_default_parsing_mt(task), query_library_default_query_mt(task));
    }

    public static SubLObject clear_cae_topic() {
        final SubLObject cs = $cae_topic_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cae_topic(SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        return memoization_state.caching_state_remove_function_results_with_args($cae_topic_caching_state$.getGlobalValue(), list(task), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cae_topic_internal(final SubLObject task) {
        return NIL != misc_utilities.initialized_p(task) ? ask_utilities.query_variable($sym208$_TOPIC, list($$and, $list209, listS($$topicOfIndividual, task, $list211)), $$InferencePSC, $list212).first() : NIL;
    }

    public static SubLObject cae_topic(SubLObject task) {
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        SubLObject caching_state = $cae_topic_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CAE_TOPIC, $cae_topic_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, task, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cae_topic_internal(task)));
            memoization_state.caching_state_put(caching_state, task, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

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
        return T;
    }

    public static SubLObject store_original_string_for_template_id(final SubLObject template_id, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter($original_query_strings$.getDynamicValue(thread), template_id, string);
    }

    public static SubLObject get_original_string_for_query(final SubLObject template_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_string = dictionary.dictionary_lookup($original_query_strings$.getDynamicValue(thread), narts_high.nart_substitute(template_id), $str215$failed_to_find_original_query_str);
        return original_string;
    }

    public static SubLObject parsed_query_template_p(final SubLObject template_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($original_query_strings$.getDynamicValue(thread), narts_high.nart_substitute(template_id), UNPROVIDED));
    }

    public static SubLObject new_query_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != valid_constant($const217$QueryLibrary_QueryCreationTemplat, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(query_library_template_forward_rules($const217$QueryLibrary_QueryCreationTemplat), thread);
                result = czer_main.cyc_find_or_create_nart(list($$TemplateFromTestQueryFn, rkf_term_utilities.create_new_constant($$$UserQuery, $list220, NIL, $$TestVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
        } else {
            result = czer_main.cyc_find_or_create_nart(list($$TemplateFromTestQueryFn, rkf_term_utilities.create_new_constant($$$UserQuery, $list220, NIL, $$TestVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
        }
        return result;
    }

    public static SubLObject next_query_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $latest_query_id$.setDynamicValue(add($latest_query_id$.getDynamicValue(thread), ONE_INTEGER), thread);
        return $latest_query_id$.getDynamicValue(thread);
    }

    public static SubLObject clear_query_library_template_forward_rules() {
        final SubLObject cs = $query_library_template_forward_rules_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_query_library_template_forward_rules(final SubLObject creation_template) {
        return memoization_state.caching_state_remove_function_results_with_args($query_library_template_forward_rules_caching_state$.getGlobalValue(), list(creation_template), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject query_library_template_forward_rules_internal(final SubLObject creation_template) {
        return forward.creation_template_forward_rules_via_exemplars(creation_template);
    }

    public static SubLObject query_library_template_forward_rules(final SubLObject creation_template) {
        SubLObject caching_state = $query_library_template_forward_rules_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QUERY_LIBRARY_TEMPLATE_FORWARD_RULES, $query_library_template_forward_rules_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, creation_template, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(query_library_template_forward_rules_internal(creation_template)));
            memoization_state.caching_state_put(caching_state, creation_template, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject kill_query_template_and_query(final SubLObject query_template) {
        final SubLObject possible_test_query = inverted_index_query_library.test_query_for_template(query_template, $$InferencePSC);
        final SubLObject possible_query_spec = ((NIL != nart_handles.nart_p(possible_test_query)) && cycl_utilities.nat_functor(possible_test_query).eql($$TestQueryFn)) ? cycl_utilities.nat_arg1(possible_test_query, UNPROVIDED) : NIL;
        final SubLObject result = (NIL != forts.fort_p(possible_query_spec)) ? ke.ke_kill_now(possible_query_spec) : NIL != kb_query.kbq_query_spec_p(possible_test_query) ? ke.ke_kill_now(possible_test_query) : NIL != forts.fort_p(query_template) ? ke.ke_kill_now(query_template) : NIL;
        return result;
    }

    public static SubLObject kill_query_library(final SubLObject query_library) {
        api_widgets.kill_constant(query_library);
        return T;
    }

    public static SubLObject pred_strengthen_unambiguously_test(final SubLObject new_answer, final SubLObject expected) {
        if (NIL != subl_promotions.memberP(expected, new_answer, $sym227$EQUALS_EL_, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject get_cycls_for_unindexed_string_tct(final SubLObject string, final SubLObject target_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject registered_ql_parsers_old = $registered_ql_parsers$.getDynamicValue(thread);
        SubLObject result = NIL;
        register_default_ql_parsers();
        final SubLObject ql_parses = get_cycls_for_unindexed_string(string);
        final SubLObject cycls = Mapping.mapcar(QL_PARSE_CYCL, ql_parses);
        result = subl_promotions.memberP(target_cycl, cycls, $sym227$EQUALS_EL_, UNPROVIDED);
        $registered_ql_parsers$.setDynamicValue(registered_ql_parsers_old, thread);
        return result;
    }

    public static SubLObject declare_query_library_utils_file() {
        declareFunction(me, "log_query_library_search", "LOG-QUERY-LIBRARY-SEARCH", 1, 3, false);
        declareFunction(me, "unindexed_queries_from_string", "UNINDEXED-QUERIES-FROM-STRING", 1, 0, false);
        declareFunction(me, "unindexed_queries_from_string_with_confidences", "UNINDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES", 1, 0, false);
        declareFunction(me, "new_weighted_xml", "NEW-WEIGHTED-XML", 1, 5, false);
        declareFunction(me, "register_all_query_library_parsers", "REGISTER-ALL-QUERY-LIBRARY-PARSERS", 0, 0, false);
        declareFunction(me, "register_cyclify_parser", "REGISTER-CYCLIFY-PARSER", 0, 0, false);
        declareFunction(me, "register_cyclify_link_parser", "REGISTER-CYCLIFY-LINK-PARSER", 0, 0, false);
        declareFunction(me, "deregister_cyclify_parser", "DEREGISTER-CYCLIFY-PARSER", 0, 0, false);
        declareFunction(me, "register_template_parser", "REGISTER-TEMPLATE-PARSER", 0, 0, false);
        declareFunction(me, "deregister_template_parser", "DEREGISTER-TEMPLATE-PARSER", 0, 0, false);
        declareFunction(me, "register_text_answers", "REGISTER-TEXT-ANSWERS", 0, 0, false);
        declareFunction(me, "register_text_answers_as_last_resort", "REGISTER-TEXT-ANSWERS-AS-LAST-RESORT", 0, 0, false);
        declareFunction(me, "deregister_text_answers", "DEREGISTER-TEXT-ANSWERS", 0, 0, false);
        declareFunction(me, "register_ebmt", "REGISTER-EBMT", 0, 0, false);
        declareFunction(me, "deregister_ebmt", "DEREGISTER-EBMT", 0, 0, false);
        declareFunction(me, "register_default_ql_parsers", "REGISTER-DEFAULT-QL-PARSERS", 0, 0, false);
        declareFunction(me, "new_ql_parse", "NEW-QL-PARSE", 0, 3, false);
        declareFunction(me, "set_ql_parse_cycl", "SET-QL-PARSE-CYCL", 2, 0, false);
        declareFunction(me, "set_ql_parse_weight", "SET-QL-PARSE-WEIGHT", 2, 0, false);
        declareFunction(me, "set_ql_parse_2nd_weight", "SET-QL-PARSE-2ND-WEIGHT", 2, 0, false);
        declareFunction(me, "ql_parse_cycl", "QL-PARSE-CYCL", 1, 0, false);
        declareFunction(me, "ql_parse_weight", "QL-PARSE-WEIGHT", 1, 0, false);
        declareFunction(me, "ql_parse_2nd_weight", "QL-PARSE-2ND-WEIGHT", 1, 0, false);
        declareFunction(me, "ql_parse_equalP", "QL-PARSE-EQUAL?", 2, 0, false);
        declareFunction(me, "get_cycls_for_unindexed_string", "GET-CYCLS-FOR-UNINDEXED-STRING", 1, 0, false);
        declareFunction(me, "preprocess_query_string", "PREPROCESS-QUERY-STRING", 1, 0, false);
        declareFunction(me, "ql_cyclify", "QL-CYCLIFY", 1, 1, false);
        declareFunction(me, "new_ql_lexicon", "NEW-QL-LEXICON", 0, 0, false);
        declareFunction(me, "ql_postprocess_cyclify_cycl", "QL-POSTPROCESS-CYCLIFY-CYCL", 1, 0, false);
        declareFunction(me, "ql_pred_strengthen_sentence", "QL-PRED-STRENGTHEN-SENTENCE", 2, 0, false);
        declareFunction(me, "ql_cyclify_link", "QL-CYCLIFY-LINK", 1, 1, false);
        declareFunction(me, "convert_instancefns_to_variables", "CONVERT-INSTANCEFNS-TO-VARIABLES", 1, 0, false);
        declareFunction(me, "instancefnP", "INSTANCEFN?", 1, 0, false);
        declareFunction(me, "var_from_instancefn", "VAR-FROM-INSTANCEFN", 1, 0, false);
        declareFunction(me, "ql_template_parse_query", "QL-TEMPLATE-PARSE-QUERY", 1, 1, false);
        declareFunction(me, "template_parse_complexity_weight", "TEMPLATE-PARSE-COMPLEXITY-WEIGHT", 1, 0, false);
        declareFunction(me, "ql_interpret_cycl", "QL-INTERPRET-CYCL", 1, 1, false);
        declareFunction(me, "ql_text_answer_query", "QL-TEXT-ANSWER-QUERY", 1, 2, false);
        declareFunction(me, "contains_nlrequestfnP", "CONTAINS-NLREQUESTFN?", 1, 0, false);
        declareFunction(me, "clear_cae_kb_parameters", "CLEAR-CAE-KB-PARAMETERS", 0, 0, false);
        declareFunction(me, "default_inference_parameters_for_task", "DEFAULT-INFERENCE-PARAMETERS-FOR-TASK", 0, 1, false);
        declareFunction(me, "get_auto_unification_mt", "GET-AUTO-UNIFICATION-MT", 0, 1, false);
        declareFunction(me, "cae_single_value_task_dependent_query_answer", "CAE-SINGLE-VALUE-TASK-DEPENDENT-QUERY-ANSWER", 2, 2, false);
        declareFunction(me, "cae_multiple_value_task_dependent_query_answer", "CAE-MULTIPLE-VALUE-TASK-DEPENDENT-QUERY-ANSWER", 2, 2, false);
        declareFunction(me, "clear_cae_fact_editor_focal_types", "CLEAR-CAE-FACT-EDITOR-FOCAL-TYPES", 0, 0, false);
        declareFunction(me, "remove_cae_fact_editor_focal_types", "REMOVE-CAE-FACT-EDITOR-FOCAL-TYPES", 0, 1, false);
        declareFunction(me, "cae_fact_editor_focal_types_internal", "CAE-FACT-EDITOR-FOCAL-TYPES-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_fact_editor_focal_types", "CAE-FACT-EDITOR-FOCAL-TYPES", 0, 1, false);
        declareFunction(me, "clear_get_default_wff_checking_mt", "CLEAR-GET-DEFAULT-WFF-CHECKING-MT", 0, 0, false);
        declareFunction(me, "remove_get_default_wff_checking_mt", "REMOVE-GET-DEFAULT-WFF-CHECKING-MT", 1, 0, false);
        declareFunction(me, "get_default_wff_checking_mt_internal", "GET-DEFAULT-WFF-CHECKING-MT-INTERNAL", 1, 0, false);
        declareFunction(me, "get_default_wff_checking_mt", "GET-DEFAULT-WFF-CHECKING-MT", 1, 0, false);
        declareFunction(me, "clear_get_default_cae_guidance_mt", "CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT", 0, 0, false);
        declareFunction(me, "remove_get_default_cae_guidance_mt", "REMOVE-GET-DEFAULT-CAE-GUIDANCE-MT", 1, 0, false);
        declareFunction(me, "get_default_cae_guidance_mt_internal", "GET-DEFAULT-CAE-GUIDANCE-MT-INTERNAL", 1, 0, false);
        declareFunction(me, "get_default_cae_guidance_mt", "GET-DEFAULT-CAE-GUIDANCE-MT", 1, 0, false);
        declareFunction(me, "get_all_default_wff_checking_mts", "GET-ALL-DEFAULT-WFF-CHECKING-MTS", 0, 0, false);
        declareFunction(me, "clear_query_library_default_query_mt", "CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT", 0, 0, false);
        declareFunction(me, "remove_query_library_default_query_mt", "REMOVE-QUERY-LIBRARY-DEFAULT-QUERY-MT", 1, 0, false);
        declareFunction(me, "query_library_default_query_mt_internal", "QUERY-LIBRARY-DEFAULT-QUERY-MT-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_query_mt", "QUERY-LIBRARY-DEFAULT-QUERY-MT", 1, 0, false);
        declareFunction(me, "clear_query_library_query_search_fact_sheet_links_enabledP", "CLEAR-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 0, 0, false);
        declareFunction(me, "remove_query_library_query_search_fact_sheet_links_enabledP", "REMOVE-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 1, 0, false);
        declareFunction(me, "query_library_query_search_fact_sheet_links_enabledP_internal", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_query_search_fact_sheet_links_enabledP", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?", 1, 0, false);
        declareFunction(me, "query_library_query_search_fact_sheet_links_enabledP_int", "QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-INT", 1, 0, false);
        declareFunction(me, "clear_rtv_panel_enabled_for_task", "CLEAR-RTV-PANEL-ENABLED-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_rtv_panel_enabled_for_task", "REMOVE-RTV-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "rtv_panel_enabled_for_task_internal", "RTV-PANEL-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "rtv_panel_enabled_for_task", "RTV-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "rtv_panel_enabled_for_task_int", "RTV-PANEL-ENABLED-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_document_search_panel_enabled_for_task", "CLEAR-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_document_search_panel_enabled_for_task", "REMOVE-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "document_search_panel_enabled_for_task_internal", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "document_search_panel_enabled_for_task", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "document_search_panel_enabled_for_task_int", "DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_source_information_enabled_for_task", "CLEAR-SOURCE-INFORMATION-ENABLED-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_source_information_enabled_for_task", "REMOVE-SOURCE-INFORMATION-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "source_information_enabled_for_task_internal", "SOURCE-INFORMATION-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "source_information_enabled_for_task", "SOURCE-INFORMATION-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "source_information_enabled_for_task_int", "SOURCE-INFORMATION-ENABLED-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_irrelevant_results_allowed_for_task", "CLEAR-IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_irrelevant_results_allowed_for_task", "REMOVE-IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 1, 0, false);
        declareFunction(me, "irrelevant_results_allowed_for_task_internal", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "irrelevant_results_allowed_for_task", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK", 1, 0, false);
        declareFunction(me, "irrelevant_results_allowed_for_task_int", "IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_report_generation_enabled_for_task", "CLEAR-REPORT-GENERATION-ENABLED-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_report_generation_enabled_for_task", "REMOVE-REPORT-GENERATION-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "report_generation_enabled_for_task_internal", "REPORT-GENERATION-ENABLED-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "report_generation_enabled_for_task", "REPORT-GENERATION-ENABLED-FOR-TASK", 1, 0, false);
        declareFunction(me, "report_generation_enabled_for_task_int", "REPORT-GENERATION-ENABLED-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_report_generation_template_root_collection_for_task", "CLEAR-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_report_generation_template_root_collection_for_task", "REMOVE-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 1, 0, false);
        declareFunction(me, "report_generation_template_root_collection_for_task_internal", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "report_generation_template_root_collection_for_task", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK", 1, 0, false);
        declareFunction(me, "report_generation_template_root_collection_for_task_int", "REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_task_allows_not", "CLEAR-TASK-ALLOWS-NOT", 0, 0, false);
        declareFunction(me, "remove_task_allows_not", "REMOVE-TASK-ALLOWS-NOT", 1, 0, false);
        declareFunction(me, "task_allows_not_internal", "TASK-ALLOWS-NOT-INTERNAL", 1, 0, false);
        declareFunction(me, "task_allows_not", "TASK-ALLOWS-NOT", 1, 0, false);
        declareFunction(me, "task_allows_not_int", "TASK-ALLOWS-NOT-INT", 1, 0, false);
        declareFunction(me, "clear_task_allows_implies", "CLEAR-TASK-ALLOWS-IMPLIES", 0, 0, false);
        declareFunction(me, "remove_task_allows_implies", "REMOVE-TASK-ALLOWS-IMPLIES", 1, 0, false);
        declareFunction(me, "task_allows_implies_internal", "TASK-ALLOWS-IMPLIES-INTERNAL", 1, 0, false);
        declareFunction(me, "task_allows_implies", "TASK-ALLOWS-IMPLIES", 1, 0, false);
        declareFunction(me, "task_allows_implies_int", "TASK-ALLOWS-IMPLIES-INT", 1, 0, false);
        declareFunction(me, "clear_task_allows_and", "CLEAR-TASK-ALLOWS-AND", 0, 0, false);
        declareFunction(me, "remove_task_allows_and", "REMOVE-TASK-ALLOWS-AND", 1, 0, false);
        declareFunction(me, "task_allows_and_internal", "TASK-ALLOWS-AND-INTERNAL", 1, 0, false);
        declareFunction(me, "task_allows_and", "TASK-ALLOWS-AND", 1, 0, false);
        declareFunction(me, "task_allows_and_int", "TASK-ALLOWS-AND-INT", 1, 0, false);
        declareFunction(me, "clear_task_allows_or", "CLEAR-TASK-ALLOWS-OR", 0, 0, false);
        declareFunction(me, "remove_task_allows_or", "REMOVE-TASK-ALLOWS-OR", 1, 0, false);
        declareFunction(me, "task_allows_or_internal", "TASK-ALLOWS-OR-INTERNAL", 1, 0, false);
        declareFunction(me, "task_allows_or", "TASK-ALLOWS-OR", 1, 0, false);
        declareFunction(me, "task_allows_or_int", "TASK-ALLOWS-OR-INT", 1, 0, false);
        declareFunction(me, "clear_task_allows_unknown_sentence", "CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE", 0, 0, false);
        declareFunction(me, "remove_task_allows_unknown_sentence", "REMOVE-TASK-ALLOWS-UNKNOWN-SENTENCE", 1, 0, false);
        declareFunction(me, "task_allows_unknown_sentence_internal", "TASK-ALLOWS-UNKNOWN-SENTENCE-INTERNAL", 1, 0, false);
        declareFunction(me, "task_allows_unknown_sentence", "TASK-ALLOWS-UNKNOWN-SENTENCE", 1, 0, false);
        declareFunction(me, "task_allows_unknown_sentence_int", "TASK-ALLOWS-UNKNOWN-SENTENCE-INT", 1, 0, false);
        declareFunction(me, "clear_sparql_browser_urls_for_task", "CLEAR-SPARQL-BROWSER-URLS-FOR-TASK", 0, 0, false);
        declareFunction(me, "remove_sparql_browser_urls_for_task", "REMOVE-SPARQL-BROWSER-URLS-FOR-TASK", 1, 0, false);
        declareFunction(me, "sparql_browser_urls_for_task_internal", "SPARQL-BROWSER-URLS-FOR-TASK-INTERNAL", 1, 0, false);
        declareFunction(me, "sparql_browser_urls_for_task", "SPARQL-BROWSER-URLS-FOR-TASK", 1, 0, false);
        declareFunction(me, "sparql_browser_urls_for_task_int", "SPARQL-BROWSER-URLS-FOR-TASK-INT", 1, 0, false);
        declareFunction(me, "clear_query_library_root_folder", "CLEAR-QUERY-LIBRARY-ROOT-FOLDER", 0, 0, false);
        declareFunction(me, "remove_query_library_root_folder", "REMOVE-QUERY-LIBRARY-ROOT-FOLDER", 1, 0, false);
        declareFunction(me, "query_library_root_folder_internal", "QUERY-LIBRARY-ROOT-FOLDER-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_root_folder", "QUERY-LIBRARY-ROOT-FOLDER", 1, 0, false);
        declareFunction(me, "clear_query_library_should_suggestions_be_intersected", "CLEAR-QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 0, 0, false);
        declareFunction(me, "remove_query_library_should_suggestions_be_intersected", "REMOVE-QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 1, 0, false);
        declareFunction(me, "query_library_should_suggestions_be_intersected_internal", "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_should_suggestions_be_intersected", "QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED", 1, 0, false);
        declareFunction(me, "clear_query_library_default_transformation_depth", "CLEAR-QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 0, 0, false);
        declareFunction(me, "remove_query_library_default_transformation_depth", "REMOVE-QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction(me, "query_library_default_transformation_depth_internal", "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_transformation_depth", "QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH", 1, 0, false);
        declareFunction(me, "clear_query_library_default_compute_answer_justifications", "CLEAR-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 0, 0, false);
        declareFunction(me, "remove_query_library_default_compute_answer_justifications", "REMOVE-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "query_library_default_compute_answer_justifications_internal", "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_compute_answer_justifications", "QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "clear_query_library_default_max_time", "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-TIME", 0, 0, false);
        declareFunction(me, "remove_query_library_default_max_time", "REMOVE-QUERY-LIBRARY-DEFAULT-MAX-TIME", 1, 0, false);
        declareFunction(me, "query_library_default_max_time_internal", "QUERY-LIBRARY-DEFAULT-MAX-TIME-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_max_time", "QUERY-LIBRARY-DEFAULT-MAX-TIME", 1, 0, false);
        declareFunction(me, "clear_query_library_default_max_productivity", "CLEAR-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 0, 0, false);
        declareFunction(me, "remove_query_library_default_max_productivity", "REMOVE-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "query_library_default_max_productivity_internal", "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_max_productivity", "QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY", 1, 0, false);
        declareFunction(me, "clear_query_library_default_new_terms_allowed", "CLEAR-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 0, 0, false);
        declareFunction(me, "remove_query_library_default_new_terms_allowed", "REMOVE-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 1, 0, false);
        declareFunction(me, "query_library_default_new_terms_allowed_internal", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_new_terms_allowed", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED", 1, 0, false);
        declareFunction(me, "query_library_default_new_terms_allowed_int", "QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-INT", 1, 0, false);
        declareFunction(me, "clear_allow_arbitrary_assertion_deletion", "CLEAR-ALLOW-ARBITRARY-ASSERTION-DELETION", 0, 0, false);
        declareFunction(me, "remove_allow_arbitrary_assertion_deletion", "REMOVE-ALLOW-ARBITRARY-ASSERTION-DELETION", 1, 0, false);
        declareFunction(me, "allow_arbitrary_assertion_deletion_internal", "ALLOW-ARBITRARY-ASSERTION-DELETION-INTERNAL", 1, 0, false);
        declareFunction(me, "allow_arbitrary_assertion_deletion", "ALLOW-ARBITRARY-ASSERTION-DELETION", 1, 0, false);
        declareFunction(me, "allow_arbitrary_assertion_deletion_int", "ALLOW-ARBITRARY-ASSERTION-DELETION-INT", 1, 0, false);
        declareFunction(me, "clear_query_library_default_indeterminate_terms_allowed", "CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 0, 0, false);
        declareFunction(me, "remove_query_library_default_indeterminate_terms_allowed", "REMOVE-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 1, 0, false);
        declareFunction(me, "query_library_default_indeterminate_terms_allowed_internal", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_indeterminate_terms_allowed", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED", 1, 0, false);
        declareFunction(me, "query_library_default_indeterminate_terms_allowed_int", "QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-INT", 1, 0, false);
        declareFunction(me, "clear_query_library_default_disjunction_free_el_vars_policy", "CLEAR-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 0, 0, false);
        declareFunction(me, "remove_query_library_default_disjunction_free_el_vars_policy", "REMOVE-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        declareFunction(me, "query_library_default_disjunction_free_el_vars_policy_internal", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_default_disjunction_free_el_vars_policy", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY", 1, 0, false);
        declareFunction(me, "query_library_default_disjunction_free_el_vars_policy_int", "QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-INT", 1, 0, false);
        declareFunction(me, "clear_cae_query_search_filter", "CLEAR-CAE-QUERY-SEARCH-FILTER", 0, 0, false);
        declareFunction(me, "remove_cae_query_search_filter", "REMOVE-CAE-QUERY-SEARCH-FILTER", 1, 0, false);
        declareFunction(me, "cae_query_search_filter_internal", "CAE-QUERY-SEARCH-FILTER-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_query_search_filter", "CAE-QUERY-SEARCH-FILTER", 1, 0, false);
        declareFunction(me, "clear_cae_query_search_filter_specification", "CLEAR-CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 0, 0, false);
        declareFunction(me, "remove_cae_query_search_filter_specification", "REMOVE-CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 1, 0, false);
        declareFunction(me, "cae_query_search_filter_specification_internal", "CAE-QUERY-SEARCH-FILTER-SPECIFICATION-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_query_search_filter_specification", "CAE-QUERY-SEARCH-FILTER-SPECIFICATION", 1, 0, false);
        declareFunction(me, "clear_cae_query_search_filter_string", "CLEAR-CAE-QUERY-SEARCH-FILTER-STRING", 0, 0, false);
        declareFunction(me, "remove_cae_query_search_filter_string", "REMOVE-CAE-QUERY-SEARCH-FILTER-STRING", 1, 0, false);
        declareFunction(me, "cae_query_search_filter_string_internal", "CAE-QUERY-SEARCH-FILTER-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_query_search_filter_string", "CAE-QUERY-SEARCH-FILTER-STRING", 1, 0, false);
        declareFunction(me, "clear_cae_query_search_term_classification_tree", "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 0, 0, false);
        declareFunction(me, "remove_cae_query_search_term_classification_tree", "REMOVE-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 1, 0, false);
        declareFunction(me, "cae_query_search_term_classification_tree_internal", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_query_search_term_classification_tree", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE", 1, 0, false);
        declareFunction(me, "clear_cae_query_search_term_classification_tree_collections", "CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 0, 0, false);
        declareFunction(me, "remove_cae_query_search_term_classification_tree_collections", "REMOVE-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        declareFunction(me, "cae_query_search_term_classification_tree_collections_internal", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_query_search_term_classification_tree_collections", "CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS", 1, 0, false);
        declareFunction(me, "clear_cae_default_paraphrase_mt", "CLEAR-CAE-DEFAULT-PARAPHRASE-MT", 0, 0, false);
        declareFunction(me, "remove_cae_default_paraphrase_mt", "REMOVE-CAE-DEFAULT-PARAPHRASE-MT", 1, 0, false);
        declareFunction(me, "cae_default_paraphrase_mt_internal", "CAE-DEFAULT-PARAPHRASE-MT-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_default_paraphrase_mt", "CAE-DEFAULT-PARAPHRASE-MT", 1, 0, false);
        declareFunction(me, "clear_cae_default_parsing_mt", "CLEAR-CAE-DEFAULT-PARSING-MT", 0, 0, false);
        declareFunction(me, "remove_cae_default_parsing_mt", "REMOVE-CAE-DEFAULT-PARSING-MT", 1, 0, false);
        declareFunction(me, "cae_default_parsing_mt_internal", "CAE-DEFAULT-PARSING-MT-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_default_parsing_mt", "CAE-DEFAULT-PARSING-MT", 1, 0, false);
        declareFunction(me, "clear_cae_default_nl_domain_mt", "CLEAR-CAE-DEFAULT-NL-DOMAIN-MT", 0, 0, false);
        declareFunction(me, "remove_cae_default_nl_domain_mt", "REMOVE-CAE-DEFAULT-NL-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "cae_default_nl_domain_mt_internal", "CAE-DEFAULT-NL-DOMAIN-MT-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_default_nl_domain_mt", "CAE-DEFAULT-NL-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "cae_get_nl_mts_from_task", "CAE-GET-NL-MTS-FROM-TASK", 1, 0, false);
        declareFunction(me, "cae_get_cae_mts_from_task", "CAE-GET-CAE-MTS-FROM-TASK", 1, 0, false);
        declareFunction(me, "clear_cae_topic", "CLEAR-CAE-TOPIC", 0, 0, false);
        declareFunction(me, "remove_cae_topic", "REMOVE-CAE-TOPIC", 0, 1, false);
        declareFunction(me, "cae_topic_internal", "CAE-TOPIC-INTERNAL", 1, 0, false);
        declareFunction(me, "cae_topic", "CAE-TOPIC", 0, 1, false);
        declareFunction(me, "cae_task_topic_changed", "CAE-TASK-TOPIC-CHANGED", 2, 0, false);
        declareFunction(me, "store_original_string_for_template_id", "STORE-ORIGINAL-STRING-FOR-TEMPLATE-ID", 2, 0, false);
        declareFunction(me, "get_original_string_for_query", "GET-ORIGINAL-STRING-FOR-QUERY", 1, 0, false);
        declareFunction(me, "parsed_query_template_p", "PARSED-QUERY-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "new_query_id", "NEW-QUERY-ID", 0, 0, false);
        declareFunction(me, "next_query_id", "NEXT-QUERY-ID", 0, 0, false);
        declareFunction(me, "clear_query_library_template_forward_rules", "CLEAR-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 0, 0, false);
        declareFunction(me, "remove_query_library_template_forward_rules", "REMOVE-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 1, 0, false);
        declareFunction(me, "query_library_template_forward_rules_internal", "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-INTERNAL", 1, 0, false);
        declareFunction(me, "query_library_template_forward_rules", "QUERY-LIBRARY-TEMPLATE-FORWARD-RULES", 1, 0, false);
        declareFunction(me, "kill_query_template_and_query", "KILL-QUERY-TEMPLATE-AND-QUERY", 1, 0, false);
        declareFunction(me, "kill_query_library", "KILL-QUERY-LIBRARY", 1, 0, false);
        declareFunction(me, "pred_strengthen_unambiguously_test", "PRED-STRENGTHEN-UNAMBIGUOUSLY-TEST", 2, 0, false);
        declareFunction(me, "get_cycls_for_unindexed_string_tct", "GET-CYCLS-FOR-UNINDEXED-STRING-TCT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_query_library_utils_file() {
        defparameter("*REGISTERED-QL-PARSERS*", $list0);
        defparameter("*QL-DEFAULT-MT*", $list1);
        defparameter("*QL-DEFAULT-PARSED-QUERY-PROPERTIES*", $list2);
        defparameter("*QL-DEFAULT-PARSERS*", red_infrastructure_macros.red_def_helper($list3.isSymbol() ? symbol_value($list3) : $list3, $ql_default_parsers$, $str5$330D840A0F844359434C0A0F8445424D5.isSymbol() ? symbol_value($str5$330D840A0F844359434C0A0F8445424D5) : $str5$330D840A0F844359434C0A0F8445424D5, $PARAMETER, UNPROVIDED));
        defparameter("*NEW-VARS*", $str57$what_new_vars_were_created_by_con);
        defparameter("*TEMPLATE-PARSE-COMPLEXITY-WEIGHT-FACTOR*", $float$0_9);
        deflexical("*CAE-FACT-EDITOR-FOCAL-TYPES-CACHING-STATE*", NIL);
        deflexical("*GET-DEFAULT-WFF-CHECKING-MT-CACHING-STATE*", NIL);
        deflexical("*GET-DEFAULT-CAE-GUIDANCE-MT-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-QUERY-MT-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?-CACHING-STATE*", NIL);
        deflexical("*RTV-PANEL-ENABLED-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*SOURCE-INFORMATION-ENABLED-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*IRRELEVANT-RESULTS-ALLOWED-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*REPORT-GENERATION-ENABLED-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*TASK-ALLOWS-NOT-CACHING-STATE*", NIL);
        deflexical("*TASK-ALLOWS-IMPLIES-CACHING-STATE*", NIL);
        deflexical("*TASK-ALLOWS-AND-CACHING-STATE*", NIL);
        deflexical("*TASK-ALLOWS-OR-CACHING-STATE*", NIL);
        deflexical("*TASK-ALLOWS-UNKNOWN-SENTENCE-CACHING-STATE*", NIL);
        deflexical("*SPARQL-BROWSER-URLS-FOR-TASK-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-ROOT-FOLDER-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-SHOULD-SUGGESTIONS-BE-INTERSECTED-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-TRANSFORMATION-DEPTH-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-MAX-TIME-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED-CACHING-STATE*", NIL);
        deflexical("*ALLOW-ARBITRARY-ASSERTION-DELETION-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED-CACHING-STATE*", NIL);
        deflexical("*QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY-CACHING-STATE*", NIL);
        deflexical("*CAE-QUERY-SEARCH-FILTER-CACHING-STATE*", NIL);
        deflexical("*CAE-QUERY-SEARCH-FILTER-SPECIFICATION-CACHING-STATE*", NIL);
        deflexical("*CAE-QUERY-SEARCH-FILTER-STRING-CACHING-STATE*", NIL);
        deflexical("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-CACHING-STATE*", NIL);
        deflexical("*CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE-COLLECTIONS-CACHING-STATE*", NIL);
        deflexical("*CAE-DEFAULT-PARAPHRASE-MT-CACHING-STATE*", NIL);
        deflexical("*CAE-DEFAULT-PARSING-MT-CACHING-STATE*", NIL);
        deflexical("*CAE-DEFAULT-NL-DOMAIN-MT-CACHING-STATE*", NIL);
        deflexical("*CAE-TOPIC-CACHING-STATE*", NIL);
        defparameter("*ORIGINAL-QUERY-STRINGS*", dictionary.new_dictionary(EQUAL, UNPROVIDED));
        defparameter("*LATEST-QUERY-ID*", ZERO_INTEGER);
        deflexical("*QUERY-LIBRARY-TEMPLATE-FORWARD-RULES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_query_library_utils_file() {
        register_external_symbol(LOG_QUERY_LIBRARY_SEARCH);
        define_obsolete_register(UNINDEXED_QUERIES_FROM_STRING, $list18);
        register_external_symbol(UNINDEXED_QUERIES_FROM_STRING_WITH_CONFIDENCES);
        register_external_symbol(REGISTER_ALL_QUERY_LIBRARY_PARSERS);
        register_external_symbol(REGISTER_DEFAULT_QL_PARSERS);
        register_external_symbol(GET_AUTO_UNIFICATION_MT);
        memoization_state.note_globally_cached_function(CAE_FACT_EDITOR_FOCAL_TYPES);
        memoization_state.note_globally_cached_function(GET_DEFAULT_WFF_CHECKING_MT);
        register_external_symbol(GET_DEFAULT_WFF_CHECKING_MT);
        memoization_state.note_globally_cached_function(GET_DEFAULT_CAE_GUIDANCE_MT);
        register_external_symbol(GET_DEFAULT_CAE_GUIDANCE_MT);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_QUERY_MT);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_QUERY_MT);
        memoization_state.note_globally_cached_function($sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_);
        register_external_symbol($sym97$QUERY_LIBRARY_QUERY_SEARCH_FACT_SHEET_LINKS_ENABLED_);
        memoization_state.note_globally_cached_function(RTV_PANEL_ENABLED_FOR_TASK);
        register_external_symbol(RTV_PANEL_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function(DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK);
        register_external_symbol(DOCUMENT_SEARCH_PANEL_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function(SOURCE_INFORMATION_ENABLED_FOR_TASK);
        register_external_symbol(SOURCE_INFORMATION_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function(IRRELEVANT_RESULTS_ALLOWED_FOR_TASK);
        register_external_symbol(IRRELEVANT_RESULTS_ALLOWED_FOR_TASK);
        memoization_state.note_globally_cached_function(REPORT_GENERATION_ENABLED_FOR_TASK);
        register_external_symbol(REPORT_GENERATION_ENABLED_FOR_TASK);
        memoization_state.note_globally_cached_function(REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK);
        register_external_symbol(REPORT_GENERATION_TEMPLATE_ROOT_COLLECTION_FOR_TASK);
        memoization_state.note_globally_cached_function(TASK_ALLOWS_NOT);
        register_external_symbol(TASK_ALLOWS_NOT);
        memoization_state.note_globally_cached_function(TASK_ALLOWS_IMPLIES);
        register_external_symbol(TASK_ALLOWS_IMPLIES);
        memoization_state.note_globally_cached_function(TASK_ALLOWS_AND);
        register_external_symbol(TASK_ALLOWS_AND);
        memoization_state.note_globally_cached_function(TASK_ALLOWS_OR);
        register_external_symbol(TASK_ALLOWS_OR);
        memoization_state.note_globally_cached_function(TASK_ALLOWS_UNKNOWN_SENTENCE);
        register_external_symbol(TASK_ALLOWS_UNKNOWN_SENTENCE);
        memoization_state.note_globally_cached_function(SPARQL_BROWSER_URLS_FOR_TASK);
        register_external_symbol(SPARQL_BROWSER_URLS_FOR_TASK);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_ROOT_FOLDER);
        register_external_symbol(QUERY_LIBRARY_ROOT_FOLDER);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED);
        register_external_symbol(QUERY_LIBRARY_SHOULD_SUGGESTIONS_BE_INTERSECTED);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_TRANSFORMATION_DEPTH);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_COMPUTE_ANSWER_JUSTIFICATIONS);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_MAX_TIME);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_MAX_TIME);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_MAX_PRODUCTIVITY);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_NEW_TERMS_ALLOWED);
        memoization_state.note_globally_cached_function(ALLOW_ARBITRARY_ASSERTION_DELETION);
        register_external_symbol(ALLOW_ARBITRARY_ASSERTION_DELETION);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_INDETERMINATE_TERMS_ALLOWED);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY);
        register_external_symbol(QUERY_LIBRARY_DEFAULT_DISJUNCTION_FREE_EL_VARS_POLICY);
        memoization_state.note_globally_cached_function(CAE_QUERY_SEARCH_FILTER);
        memoization_state.note_globally_cached_function(CAE_QUERY_SEARCH_FILTER_SPECIFICATION);
        memoization_state.note_globally_cached_function(CAE_QUERY_SEARCH_FILTER_STRING);
        register_external_symbol(CAE_QUERY_SEARCH_FILTER_STRING);
        memoization_state.note_globally_cached_function(CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE);
        register_external_symbol(CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE);
        memoization_state.note_globally_cached_function(CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS);
        register_external_symbol(CAE_QUERY_SEARCH_TERM_CLASSIFICATION_TREE_COLLECTIONS);
        memoization_state.note_globally_cached_function(CAE_DEFAULT_PARAPHRASE_MT);
        register_external_symbol(CAE_DEFAULT_PARAPHRASE_MT);
        memoization_state.note_globally_cached_function(CAE_DEFAULT_PARSING_MT);
        register_external_symbol(CAE_DEFAULT_PARSING_MT);
        memoization_state.note_globally_cached_function(CAE_DEFAULT_NL_DOMAIN_MT);
        register_external_symbol(CAE_DEFAULT_NL_DOMAIN_MT);
        register_external_symbol(CAE_GET_NL_MTS_FROM_TASK);
        register_external_symbol(CAE_GET_CAE_MTS_FROM_TASK);
        memoization_state.note_globally_cached_function(CAE_TOPIC);
        register_external_symbol(CAE_TOPIC);
        register_kb_function(CAE_TASK_TOPIC_CHANGED);
        register_external_symbol(NEW_QUERY_ID);
        memoization_state.note_globally_cached_function(QUERY_LIBRARY_TEMPLATE_FORWARD_RULES);
        register_external_symbol(KILL_QUERY_TEMPLATE_AND_QUERY);
        register_external_symbol(KILL_QUERY_LIBRARY);
        define_test_case_table_int(QL_PRED_STRENGTHEN_SENTENCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list235);
        define_test_case_table_int(TYPED_PRED_STRENGTHEN_FORMULA_UNAMBIGUOUSLY, list(new SubLObject[]{ $TEST, PRED_STRENGTHEN_UNAMBIGUOUSLY_TEST, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list238);
        define_test_case_table_int(GET_CYCLS_FOR_UNINDEXED_STRING_TCT, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list240);
        return NIL;
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

    
}

/**
 * Total time: 1256 ms
 */
