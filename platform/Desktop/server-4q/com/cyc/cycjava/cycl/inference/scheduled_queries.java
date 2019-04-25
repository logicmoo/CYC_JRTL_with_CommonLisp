package com.cyc.cycjava.cycl.inference;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cae_query_search;
import com.cyc.cycjava.cycl.cfasl_kernel;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.query_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.remote_image;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_serialization;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.report_generation.sksi_reports_by_column;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scheduled_queries
    extends
      SubLTranslatedFile
{
  public static final SubLFile me = new scheduled_queries();
  public static final String myName = "com.cyc.cycjava.cycl.inference.scheduled_queries";
  public static final String myFingerPrint = "2c03141e7eea0a4a2b5b028a926d2f3494778309b0498b1d514a0f263eea0bf2";
  private static SubLSymbol $scheduled_query_queue$ = null;
  private static SubLSymbol $scheduled_query_queue_lock$ = null;
  private static SubLSymbol $ut_offset_to_unix_time$ = null;
  private static SubLSymbol $scheduled_query_index$ = null;
  private static SubLSymbol $in_progress_queries$ = null;
  private static SubLSymbol $completed_queries$ = null;
  private static SubLSymbol $max_number_of_simultaneous_scheduled_queries$ = null;
  private static SubLSymbol $active_scheduled_queries$ = null;
  private static SubLSymbol $aborted_scheduled_queries$ = null;
  private static SubLSymbol $scheduled_query_cleanup_lock$ = null;
  private static SubLSymbol $scheduled_query_results_message_template$ = null;
  private static SubLSymbol $scheduled_query_daemon$ = null;
  private static SubLSymbol $scheduled_query_computer_info_mt$ = null;
  private static SubLSymbol $run_scheduled_queries_on_this_imageP$ = null;
  private static SubLSymbol $scheduled_query_runner_isg$ = null;
  private static SubLSymbol $sqd_new_forts_to_cleanup$ = null;
  private static final SubLInteger $int0$30 = makeInteger( 30 );
  private static final SubLString $str1$__Scheduling_test_query_____ = makeString( "~&Scheduling test query...~%" );
  private static final SubLString $str2$__Timed_out_after__D_seconds___ = makeString( "~&Timed out after ~D seconds.~%" );
  private static final SubLString $str3$Failed_to_get_test_query_results_ = makeString( "Failed to get test query results." );
  private static final SubLString $str4$__Got_results___S__ = makeString( "~&Got results: ~S~%" );
  private static final SubLSymbol $sym5$ADD_RECURRING_QUERY_SCHEDULE = makeSymbol( "ADD-RECURRING-QUERY-SCHEDULE" );
  private static final SubLSymbol $sym6$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
  private static final SubLSymbol $sym7$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
  private static final SubLSymbol $sym8$STRINGP = makeSymbol( "STRINGP" );
  private static final SubLString $str9$ScheduledQuerySeries = makeString( "ScheduledQuerySeries" );
  private static final SubLObject $const10$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
  private static final SubLObject $const11$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
  private static final SubLList $list12 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "PeriodicEventSeries" ) ), constant_handles.reader_make_constant_shell( makeString(
      "PurposefulAction" ) ) );
  private static final SubLObject $const13$resultsShouldBeEmailedToAddress_C = constant_handles.reader_make_constant_shell( makeString( "resultsShouldBeEmailedToAddress-CC" ) );
  private static final SubLList $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InformationGathering" ) ) );
  private static final SubLObject $const15$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
  private static final SubLObject $const16$intervalTypeOfPeriodicSeries = constant_handles.reader_make_constant_shell( makeString( "intervalTypeOfPeriodicSeries" ) );
  private static final SubLObject $const17$ScheduledQueryDaemon = constant_handles.reader_make_constant_shell( makeString( "ScheduledQueryDaemon" ) );
  private static final SubLObject $const18$querySchedulingComplete = constant_handles.reader_make_constant_shell( makeString( "querySchedulingComplete" ) );
  private static final SubLSymbol $sym19$ADD_SINGLE_QUERY_SCHEDULE = makeSymbol( "ADD-SINGLE-QUERY-SCHEDULE" );
  private static final SubLString $str20$ScheduledQuery = makeString( "ScheduledQuery" );
  private static final SubLList $list21 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycQueryRunning" ) ), constant_handles.reader_make_constant_shell( makeString( "ScheduledAction" ) ) );
  private static final SubLObject $const22$ScheduledFn = constant_handles.reader_make_constant_shell( makeString( "ScheduledFn" ) );
  private static final SubLObject $const23$CycQueryRunningFromFn = constant_handles.reader_make_constant_shell( makeString( "CycQueryRunningFromFn" ) );
  private static final SubLObject $const24$scheduledStartingDate = constant_handles.reader_make_constant_shell( makeString( "scheduledStartingDate" ) );
  private static final SubLObject $const25$directingAgent = constant_handles.reader_make_constant_shell( makeString( "directingAgent" ) );
  private static final SubLList $list26 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ScheduledQueryDaemon" ) ) );
  private static final SubLObject $const27$scheduledBy = constant_handles.reader_make_constant_shell( makeString( "scheduledBy" ) );
  private static final SubLSymbol $sym28$REMOVE_RECURRING_QUERY_SCHEDULE = makeSymbol( "REMOVE-RECURRING-QUERY-SCHEDULE" );
  private static final SubLList $list29 = ConsesLow.list( makeSymbol( "THIS-CYCLIST" ), makeSymbol( "QUERY-SERIES" ), makeSymbol( "THIS-INTERVAL-TYPE" ), makeSymbol( "THIS-TASK" ) );
  private static final SubLObject $const30$KBQ_FindScheduledQuerySeries = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindScheduledQuerySeries" ) );
  private static final SubLList $list31 = ConsesLow.list( makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeSymbol( "?CYCLIST" ), makeSymbol( "?SERIES" ), makeSymbol(
      "?INTERVAL-TYPE" ), makeSymbol( "?TASK" ) ) ) );
  private static final SubLSymbol $sym32$REMOVE_SINGLE_QUERY_SCHEDULE = makeSymbol( "REMOVE-SINGLE-QUERY-SCHEDULE" );
  private static final SubLList $list33 = ConsesLow.list( makeSymbol( "THIS-CYCLIST" ), makeSymbol( "QUERY-EVENT" ), makeSymbol( "THIS-DATE" ), makeSymbol( "THIS-TASK" ) );
  private static final SubLObject $const34$KBQ_FindScheduledQueries = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindScheduledQueries" ) );
  private static final SubLList $list35 = ConsesLow.list( makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeSymbol( "?CYCLIST" ), makeSymbol( "?QUERY-EVENT" ), makeSymbol( "?DATE" ),
      makeSymbol( "?TASK" ) ) ) );
  private static final SubLObject $const36$SeriesOfTypeFn = constant_handles.reader_make_constant_shell( makeString( "SeriesOfTypeFn" ) );
  private static final SubLObject $const37$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) );
  private static final SubLList $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "directingAgent" ) ), constant_handles.reader_make_constant_shell( makeString(
      "ScheduledQueryDaemon" ) ) );
  private static final SubLSymbol $kw39$ANYTHING = makeKeyword( "ANYTHING" );
  private static final SubLList $list40 = ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "THIS-SCHEDULER" ) );
  private static final SubLSymbol $sym41$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
  private static final SubLObject $const42$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
  private static final SubLSymbol $kw43$GAF = makeKeyword( "GAF" );
  private static final SubLSymbol $sym44$THIS_SCHEDULER = makeSymbol( "THIS-SCHEDULER" );
  private static final SubLObject $const45$ModelMtByUserAndTaskFn = constant_handles.reader_make_constant_shell( makeString( "ModelMtByUserAndTaskFn" ) );
  private static final SubLObject $const46$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
  private static final SubLSymbol $sym47$GET_CACHED_RESULTS_FOR_CYCL_QUERY = makeSymbol( "GET-CACHED-RESULTS-FOR-CYCL-QUERY" );
  private static final SubLObject $const48$queryInferences = constant_handles.reader_make_constant_shell( makeString( "queryInferences" ) );
  private static final SubLObject $const49$inferenceStartTime = constant_handles.reader_make_constant_shell( makeString( "inferenceStartTime" ) );
  private static final SubLObject $const50$cycProblemStoreInferences = constant_handles.reader_make_constant_shell( makeString( "cycProblemStoreInferences" ) );
  private static final SubLObject $const51$problemStoreSnapshotPathnames = constant_handles.reader_make_constant_shell( makeString( "problemStoreSnapshotPathnames" ) );
  private static final SubLString $str52$_ = makeString( " " );
  private static final SubLSymbol $kw53$DATE = makeKeyword( "DATE" );
  private static final SubLSymbol $kw54$ANSWER_COUNT = makeKeyword( "ANSWER-COUNT" );
  private static final SubLSymbol $kw55$PROBLEM_STORE_FILE = makeKeyword( "PROBLEM-STORE-FILE" );
  private static final SubLSymbol $sym56$_COUNT = makeSymbol( "?COUNT" );
  private static final SubLObject $const57$inferenceAnswerCount = constant_handles.reader_make_constant_shell( makeString( "inferenceAnswerCount" ) );
  private static final SubLList $list58 = ConsesLow.list( makeSymbol( "?COUNT" ) );
  private static final SubLObject $const59$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$_BINDINGS = makeSymbol( "?BINDINGS" );
  private static final SubLObject $const62$inferenceBindings = constant_handles.reader_make_constant_shell( makeString( "inferenceBindings" ) );
  private static final SubLList $list63 = ConsesLow.list( makeSymbol( "?BINDINGS" ) );
  private static final SubLSymbol $sym64$GET_SCHEDULES_FOR_CYCL_QUERY = makeSymbol( "GET-SCHEDULES-FOR-CYCL-QUERY" );
  private static final SubLObject $const65$scheduledQuerySpecification = constant_handles.reader_make_constant_shell( makeString( "scheduledQuerySpecification" ) );
  private static final SubLSymbol $kw66$NEXT_RUN_DATE = makeKeyword( "NEXT-RUN-DATE" );
  private static final SubLObject $const67$Series = constant_handles.reader_make_constant_shell( makeString( "Series" ) );
  private static final SubLSymbol $kw68$RECURRENCE_INTERVAL = makeKeyword( "RECURRENCE-INTERVAL" );
  private static final SubLList $list69 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "resultsShouldBeEmailedToAddress-CC" ) ) );
  private static final SubLList $list70 = ConsesLow.list( makeKeyword( "EMAIL-RECIPIENTS" ), makeKeyword( "EMAIL-CC" ) );
  private static final SubLSymbol $kw71$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
  private static final SubLSymbol $sym72$SCHEDULED_QUERY_SCHEDULED_RUN_TIME = makeSymbol( "SCHEDULED-QUERY-SCHEDULED-RUN-TIME" );
  private static final SubLString $str73$Unable_to_initialize__A__ = makeString( "Unable to initialize ~A~%" );
  private static final SubLString $str74$Scheduled_Query_Queue_Lock = makeString( "Scheduled Query Queue Lock" );
  private static final SubLInteger $int75$2208988800 = makeInteger( "2208988800" );
  private static final SubLSymbol $sym76$GET_SCHEDULED_QUERY_QUEUE = makeSymbol( "GET-SCHEDULED-QUERY-QUEUE" );
  private static final SubLSymbol $kw77$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
  private static final SubLSymbol $sym78$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$INVALID_FORT_ = makeSymbol( "INVALID-FORT?" );
  private static final SubLSymbol $sym81$NULL = makeSymbol( "NULL" );
  private static final SubLSymbol $kw82$GUID_STRING = makeKeyword( "GUID-STRING" );
  private static final SubLSymbol $kw83$KBQ = makeKeyword( "KBQ" );
  private static final SubLSymbol $kw84$GLOSS = makeKeyword( "GLOSS" );
  private static final SubLSymbol $kw85$SCHEDULED_RUN_TIME_UNIVERSAL = makeKeyword( "SCHEDULED-RUN-TIME-UNIVERSAL" );
  private static final SubLSymbol $kw86$SCHEDULED_RUN_TIME_UNIX = makeKeyword( "SCHEDULED-RUN-TIME-UNIX" );
  private static final SubLSymbol $kw87$SCHEDULED_RUN_TIME_CYCL = makeKeyword( "SCHEDULED-RUN-TIME-CYCL" );
  private static final SubLSymbol $kw88$SCHEDULED_RUN_TIME_DECODED = makeKeyword( "SCHEDULED-RUN-TIME-DECODED" );
  private static final SubLSymbol $kw89$RECURRING_ = makeKeyword( "RECURRING?" );
  private static final SubLSymbol $kw90$SCHEDULER = makeKeyword( "SCHEDULER" );
  private static final SubLSymbol $kw91$SERIES = makeKeyword( "SERIES" );
  private static final SubLSymbol $kw92$INTERVAL_TYPE = makeKeyword( "INTERVAL-TYPE" );
  private static final SubLSymbol $kw93$EVENT = makeKeyword( "EVENT" );
  private static final SubLObject $const94$scheduledReportSpecification = constant_handles.reader_make_constant_shell( makeString( "scheduledReportSpecification" ) );
  private static final SubLObject $const95$reportSpecificationTemplate = constant_handles.reader_make_constant_shell( makeString( "reportSpecificationTemplate" ) );
  private static final SubLSymbol $kw96$REPORT = makeKeyword( "REPORT" );
  private static final SubLSymbol $kw97$REPORT_TEMPLATE = makeKeyword( "REPORT-TEMPLATE" );
  private static final SubLSymbol $kw98$REPORT_TEMPLATE_GLOSS = makeKeyword( "REPORT-TEMPLATE-GLOSS" );
  private static final SubLSymbol $sym99$_SCHEDULED_QUERY_INDEX_ = makeSymbol( "*SCHEDULED-QUERY-INDEX*" );
  private static final SubLSymbol $sym100$SCHEDULED_QUERY_P = makeSymbol( "SCHEDULED-QUERY-P" );
  private static final SubLSymbol $sym101$FORT_P = makeSymbol( "FORT-P" );
  private static final SubLSymbol $sym102$UNIVERSAL_TIME_P = makeSymbol( "UNIVERSAL-TIME-P" );
  private static final SubLList $list103 = ConsesLow.list( makeSymbol( "SCHEDULED-QUERY" ), makeSymbol( "KBQ" ) );
  private static final SubLObject $const104$KBQ_FindOneTimeScheduledQueries = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindOneTimeScheduledQueries" ) );
  private static final SubLList $list105 = ConsesLow.list( makeSymbol( "SCHEDULED-QUERY-SERIES" ), makeSymbol( "KBQ" ) );
  private static final SubLObject $const106$KBQ_FindRepeatingScheduledQueries = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindRepeatingScheduledQueries" ) );
  private static final SubLSymbol $sym107$ADD_SCHEDULED_QUERY = makeSymbol( "ADD-SCHEDULED-QUERY" );
  private static final SubLList $list108;
  private static final SubLObject $const109$KBQ_FindNextFutureStartDateForQue = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindNextFutureStartDateForQueryInSeries" ) );
  private static final SubLObject $const110$KBQ_FindNextStartDateForQueryInSe = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindNextStartDateForQueryInSeries" ) );
  private static final SubLObject $const111$KBQ_FindStartDateForScheduledQuer = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindStartDateForScheduledQuery" ) );
  private static final SubLObject $const112$KBQ_FindScheduledKBQ = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindScheduledKBQ" ) );
  private static final SubLSymbol $sym113$_MAX_NUMBER_OF_SIMULTANEOUS_SCHEDULED_QUERIES_ = makeSymbol( "*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*" );
  private static final SubLSymbol $sym114$_ACTIVE_SCHEDULED_QUERIES_ = makeSymbol( "*ACTIVE-SCHEDULED-QUERIES*" );
  private static final SubLSymbol $sym115$GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES = makeSymbol( "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES" );
  private static final SubLList $list116 = ConsesLow.cons( makeSymbol( "PACKAGED-QUERY" ), makeSymbol( "PROBLEM-STORE" ) );
  private static final SubLSymbol $kw117$PROBLEM_STORE_ID = makeKeyword( "PROBLEM-STORE-ID" );
  private static final SubLSymbol $kw118$INFERENCES = makeKeyword( "INFERENCES" );
  private static final SubLSymbol $kw119$SKIP = makeKeyword( "SKIP" );
  private static final SubLSymbol $kw120$INFERENCE_ID = makeKeyword( "INFERENCE-ID" );
  private static final SubLSymbol $kw121$TIME_SO_FAR = makeKeyword( "TIME-SO-FAR" );
  private static final SubLSymbol $kw122$STATUS = makeKeyword( "STATUS" );
  private static final SubLSymbol $sym123$_ABORTED_SCHEDULED_QUERIES_ = makeSymbol( "*ABORTED-SCHEDULED-QUERIES*" );
  private static final SubLSymbol $sym124$ABORT_SCHEDULED_QUERY = makeSymbol( "ABORT-SCHEDULED-QUERY" );
  private static final SubLSymbol $sym125$VALID_PROBLEM_STORE_P = makeSymbol( "VALID-PROBLEM-STORE-P" );
  private static final SubLSymbol $sym126$CDR = makeSymbol( "CDR" );
  private static final SubLSymbol $sym127$PROBLEM_STORE_PROPERTY_P = makeSymbol( "PROBLEM-STORE-PROPERTY-P" );
  private static final SubLString $str128$Scheduled_Query_Cleanup_Lock = makeString( "Scheduled Query Cleanup Lock" );
  private static final SubLObject $const129$inferenceDatastructure = constant_handles.reader_make_constant_shell( makeString( "inferenceDatastructure" ) );
  private static final SubLString $str130$text_csv = makeString( "text/csv" );
  private static final SubLString $str131$text_tsv = makeString( "text/tsv" );
  private static final SubLString $str132$text_plain = makeString( "text/plain" );
  private static final SubLSymbol $kw133$TRUE = makeKeyword( "TRUE" );
  private static final SubLList $list134 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "stringVersionOfCharacter" ) ), constant_handles.reader_make_constant_shell( makeString(
      "termStrings" ) ) );
  private static final SubLString $str135$6cb141db_9948_4a5b_b7ae_a86899c41 = makeString( "6cb141db-9948-4a5b-b7ae-a86899c41036" );
  private static final SubLString $str136$The_following_query_has_been_run_ = makeString( "The following query has been run:\n\nName: ~S\nParaphrase: ~S\nResults: ~D~%" );
  private static final SubLObject $const137$KBQ_FindGlossForScheduledQuery = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindGlossForScheduledQuery" ) );
  private static final SubLObject $const138$KBQ_FindFormulaForScheduledQuery = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindFormulaForScheduledQuery" ) );
  private static final SubLSymbol $kw139$INTERROGATIVE = makeKeyword( "INTERROGATIVE" );
  private static final SubLString $str140$Scheduled_Query_Results__ = makeString( "Scheduled Query Results: " );
  private static final SubLString $str141$_answers_for_ = makeString( " answers for " );
  private static final SubLString $str142$tsv = makeString( "tsv" );
  private static final SubLString $str143$csv = makeString( "csv" );
  private static final SubLString $str144$txt = makeString( "txt" );
  private static final SubLString $str145$Report_run_successfully = makeString( "Report run successfully" );
  private static final SubLString $str146$Report_generation_failed__ = makeString( "Report generation failed (" );
  private static final SubLString $str147$_problems_ = makeString( " problems)" );
  private static final SubLList $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYCLIST" ), makeSymbol( "HOST" ), makeSymbol( "PORT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ),
      makeSymbol( "BODY" ) );
  private static final SubLList $list149 = ConsesLow.list( makeKeyword( "DONE" ) );
  private static final SubLSymbol $kw150$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
  private static final SubLSymbol $kw151$DONE = makeKeyword( "DONE" );
  private static final SubLSymbol $sym152$EL_LIST = makeUninternedSymbol( "EL-LIST" );
  private static final SubLSymbol $sym153$SMTP_ACCOUNT = makeUninternedSymbol( "SMTP-ACCOUNT" );
  private static final SubLSymbol $sym154$INFO = makeUninternedSymbol( "INFO" );
  private static final SubLSymbol $sym155$CSOME = makeSymbol( "CSOME" );
  private static final SubLSymbol $sym156$NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ = makeSymbol( "NEW-CYC-QUERY-FROM-INDEXICALIZED-KBQ" );
  private static final SubLObject $const157$KBQ_FindSMTPAccountsForCyclist = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindSMTPAccountsForCyclist" ) );
  private static final SubLSymbol $sym158$EL_LIST_ITEMS = makeSymbol( "EL-LIST-ITEMS" );
  private static final SubLObject $const159$KBQ_FindSMTPInfoForAccount = constant_handles.reader_make_constant_shell( makeString( "KBQ-FindSMTPInfoForAccount" ) );
  private static final SubLSymbol $sym160$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
  private static final SubLList $list161 = ConsesLow.cons( makeSymbol( "PORT" ), makeSymbol( "HOST" ) );
  private static final SubLString $str162$scheduled_query_daemon_cyc_com = makeString( "scheduled-query-daemon@cyc.com" );
  private static final SubLObject $const163$seriesMembers = constant_handles.reader_make_constant_shell( makeString( "seriesMembers" ) );
  private static final SubLObject $const164$CycQueryRunning = constant_handles.reader_make_constant_shell( makeString( "CycQueryRunning" ) );
  private static final SubLSymbol $kw165$DEPTH = makeKeyword( "DEPTH" );
  private static final SubLSymbol $kw166$STACK = makeKeyword( "STACK" );
  private static final SubLSymbol $kw167$QUEUE = makeKeyword( "QUEUE" );
  private static final SubLSymbol $sym168$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
  private static final SubLSymbol $kw169$ERROR = makeKeyword( "ERROR" );
  private static final SubLString $str170$_A_is_not_a__A = makeString( "~A is not a ~A" );
  private static final SubLSymbol $sym171$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
  private static final SubLSymbol $kw172$CERROR = makeKeyword( "CERROR" );
  private static final SubLString $str173$continue_anyway = makeString( "continue anyway" );
  private static final SubLSymbol $kw174$WARN = makeKeyword( "WARN" );
  private static final SubLString $str175$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
  private static final SubLString $str176$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
  private static final SubLString $str177$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
  private static final SubLObject $const178$seriesOfType = constant_handles.reader_make_constant_shell( makeString( "seriesOfType" ) );
  private static final SubLString $str179$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
  private static final SubLSymbol $kw180$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
  private static final SubLSymbol $kw181$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
  private static final SubLString $str182$data_problem_stores_ = makeString( "data/problem-stores/" );
  private static final SubLString $str183$0775 = makeString( "0775" );
  private static final SubLString $str184$_ = makeString( "/" );
  private static final SubLString $str185$store_ = makeString( "store-" );
  private static final SubLString $str186$_cfasl = makeString( ".cfasl" );
  private static final SubLSymbol $sym187$_SCHEDULED_QUERY_DAEMON_ = makeSymbol( "*SCHEDULED-QUERY-DAEMON*" );
  private static final SubLObject $const188$QuerySchedulerDaemonComputersMt = constant_handles.reader_make_constant_shell( makeString( "QuerySchedulerDaemonComputersMt" ) );
  private static final SubLSymbol $sym189$_RUN_SCHEDULED_QUERIES_ON_THIS_IMAGE__ = makeSymbol( "*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*" );
  private static final SubLObject $const190$programOnPort = constant_handles.reader_make_constant_shell( makeString( "programOnPort" ) );
  private static final SubLObject $const191$ScheduledQueryDaemon_CW = constant_handles.reader_make_constant_shell( makeString( "ScheduledQueryDaemon-CW" ) );
  private static final SubLObject $const192$CFASLProtocol = constant_handles.reader_make_constant_shell( makeString( "CFASLProtocol" ) );
  private static final SubLSymbol $sym193$FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES = makeSymbol( "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES" );
  private static final SubLObject $const194$FindRunningScheduledQueryDaemons = constant_handles.reader_make_constant_shell( makeString( "FindRunningScheduledQueryDaemons" ) );
  private static final SubLString $str195$Scheduled_Query_Runner_ = makeString( "Scheduled Query Runner " );
  private static final SubLSymbol $sym196$RUN_PACKAGED_SCHEDULED_QUERY = makeSymbol( "RUN-PACKAGED-SCHEDULED-QUERY" );
  private static final SubLString $str197$Scheduled_Query_Daemon = makeString( "Scheduled Query Daemon" );
  private static final SubLSymbol $sym198$RUN_SCHEDULED_QUERIES = makeSymbol( "RUN-SCHEDULED-QUERIES" );
  private static final SubLSymbol $sym199$START_DAEMON_AND_SCHEDULE_QUERY_ONCE = makeSymbol( "START-DAEMON-AND-SCHEDULE-QUERY-ONCE" );
  private static final SubLSymbol $kw200$TEST = makeKeyword( "TEST" );
  private static final SubLSymbol $sym201$TREE_MATCHES_PATTERN = makeSymbol( "TREE-MATCHES-PATTERN" );
  private static final SubLSymbol $kw202$OWNER = makeKeyword( "OWNER" );
  private static final SubLSymbol $kw203$CLASSES = makeKeyword( "CLASSES" );
  private static final SubLList $list204 = ConsesLow.list( makeSymbol( "SCHEDULED-QUERY-TEST-CASE-TABLES" ) );
  private static final SubLSymbol $kw205$KB = makeKeyword( "KB" );
  private static final SubLSymbol $kw206$FULL = makeKeyword( "FULL" );
  private static final SubLSymbol $kw207$WORKING_ = makeKeyword( "WORKING?" );
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$SCHEDULE_QUERY_ONCE_AND_START_DAEMON = makeSymbol( "SCHEDULE-QUERY-ONCE-AND-START-DAEMON" );
  private static final SubLList $list210 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TestQueryFn" ) ), constant_handles.reader_make_constant_shell( makeString(
      "CST-WhatIsNegativeThreePlusFive" ) ) );
  private static final SubLString $str211$Couldn_t_find_valid_test_query__S = makeString( "Couldn't find valid test query ~S" );
  private static final SubLList $list212 = ConsesLow.list( ConsesLow.list( makeSymbol( "TIMEOUT" ), makeSymbol( "TIMED-OUT?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym213$WITH_TIMEOUT = makeSymbol( "WITH-TIMEOUT" );
  private static final SubLSymbol $sym214$CLET = makeSymbol( "CLET" );
  private static final SubLList $list215 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SQD-NEW-FORTS-TO-CLEANUP*" ), ConsesLow.list( makeSymbol( "CREATE-QUEUE" ) ) ) );
  private static final SubLSymbol $sym216$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
  private static final SubLSymbol $sym217$PROGN = makeSymbol( "PROGN" );
  private static final SubLList $list218 = ConsesLow.list( ConsesLow.list( makeSymbol( "SQD-CLEANUP-NEW-FORTS" ) ) );
  private static final SubLInteger $int219$300 = makeInteger( 300 );
  private static final SubLString $str220$___D_existing_result__P___S___D_n = makeString( "~&~D existing result~:P: ~S~%~D new result~:P: ~S~%" );
  private static final SubLString $str221$Timed_out_after__S_second__P_duri = makeString( "Timed out after ~S second~:P during START-DAEMON-AND-SCHEDULE-QUERY-ONCE." );
  private static final SubLString $str222$__Finished_START_DAEMON_AND_SCHED = makeString( "~&Finished START-DAEMON-AND-SCHEDULE-QUERY-ONCE in ~A.~%" );
  private static final SubLString $str223$Timed_out_after__S_second__P_duri = makeString( "Timed out after ~S second~:P during SCHEDULE-QUERY-ONCE-AND-START-DAEMON" );
  private static final SubLString $str224$__Finished_SCHEDULE_QUERY_ONCE_AN = makeString( "~&Finished SCHEDULE-QUERY-ONCE-AND-START-DAEMON in ~A.~%" );
  private static final SubLString $str225$no = makeString( "no" );
  private static final SubLObject $const226$ScheduledQueryTesting_Allotment = constant_handles.reader_make_constant_shell( makeString( "ScheduledQueryTesting-Allotment" ) );
  static
  {
    $list60 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL );
    $list79 = ConsesLow.list( makeSymbol( "GET-SCHEDULED-QUERY-QUEUE" ), NIL, NIL );
    $list108 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), SEVEN_INTEGER );
    $list208 = ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( ConsesLow.list( makeKeyword( "DATE" ), makeKeyword( "ANYTHING" ), makeKeyword( "ANSWER-COUNT" ), ONE_INTEGER, makeKeyword( "PROBLEM-STORE-FILE" ),
        makeKeyword( "ANYTHING" ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 841L)
  public static SubLObject start_scheduled_query_processing(SubLObject timeout)
  {
    if( timeout == UNPROVIDED )
    {
      timeout = $int0$30;
    }
    final SubLObject queue_size = start_scheduled_query_processing_internal();
    maybe_verify_test_query( timeout );
    return queue_size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 1153L)
  public static SubLObject maybe_verify_test_query(final SubLObject timeout)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    format_nil.force_format( T, $str1$__Scheduling_test_query_____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject kbq = scheduled_query_test_query();
    if( NIL != forts.valid_fortP( kbq ) )
    {
      thread.resetMultipleValues();
      final SubLObject results = schedule_test_query_and_wait_for_results( kbq, timeout );
      final SubLObject timed_outP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != timed_outP )
      {
        format_nil.force_format( T, $str2$__Timed_out_after__D_seconds___, timeout, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == results )
      {
        Errors.error( $str3$Failed_to_get_test_query_results_ );
      }
      format_nil.force_format( T, $str4$__Got_results___S__, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 1675L)
  public static SubLObject halt_scheduled_query_processing()
  {
    set_scheduled_query_image_flag( NIL );
    clear_scheduled_query_queue();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 1904L)
  public static SubLObject add_recurring_query_schedule(final SubLObject query, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task)
  {
    if( email_recipients == UNPROVIDED )
    {
      email_recipients = NIL;
    }
    if( email_carbon_copies == UNPROVIDED )
    {
      email_carbon_copies = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    assert NIL != kb_indexing_datastructures.indexed_term_p( query ) : query;
    SubLObject list_var = email_recipients;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    list_var = email_carbon_copies;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    cdolist_list_var = list_var;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject series = make_recurring_query_schedule_assertions( query, interval_type, email_recipients, email_carbon_copies, cyclist, task );
    if( NIL != series )
    {
      note_query_scheduling_complete( series );
    }
    return series;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 2656L)
  public static SubLObject make_recurring_query_schedule_assertions(final SubLObject query, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist,
      SubLObject task)
  {
    if( email_recipients == UNPROVIDED )
    {
      email_recipients = NIL;
    }
    if( email_carbon_copies == UNPROVIDED )
    {
      email_carbon_copies = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = get_query_scheduling_mt( cyclist, task );
    final SubLObject series = ke.ke_create_now( $str9$ScheduledQuerySeries, UNPROVIDED );
    SubLObject failP = Types.sublisp_null( series );
    sqd_note_new_fort( series );
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( cyclist );
      SubLObject cdolist_list_var = $list12;
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert_now( ConsesLow.list( $const10$isa, series, v_isa ), $const11$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
      cdolist_list_var = email_recipients;
      SubLObject recpt = NIL;
      recpt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert_now( ConsesLow.list( results_should_be_emailed_to_address(), series, recpt ), mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        recpt = cdolist_list_var.first();
      }
      cdolist_list_var = email_carbon_copies;
      recpt = NIL;
      recpt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert_now( ConsesLow.list( $const13$resultsShouldBeEmailedToAddress_C, series, recpt ), mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        recpt = cdolist_list_var.first();
      }
      cdolist_list_var = ConsesLow.list( ConsesLow.list( $const10$isa, series, scheduled_query_series_type( query, cyclist ) ), ConsesLow.listS( $const10$isa, series, $list14 ), ConsesLow.list( $const15$definingMt,
          series, mt ), ConsesLow.list( $const16$intervalTypeOfPeriodicSeries, series, interval_type ) );
      SubLObject sentence = NIL;
      sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == ke.ke_assert_now( sentence, mt, UNPROVIDED, UNPROVIDED ) )
        {
          failP = T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sentence = cdolist_list_var.first();
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != failP ) ? NIL : series;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 3774L)
  public static SubLObject note_query_scheduling_complete(final SubLObject event_or_series)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failP = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( $const17$ScheduledQueryDaemon );
      if( NIL == ke.ke_assert_now( ConsesLow.list( $const18$querySchedulingComplete, event_or_series ), $const11$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ) )
      {
        failP = T;
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 4062L)
  public static SubLObject add_single_query_schedule(final SubLObject query, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task)
  {
    if( email_recipients == UNPROVIDED )
    {
      email_recipients = NIL;
    }
    if( email_carbon_copies == UNPROVIDED )
    {
      email_carbon_copies = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    assert NIL != kb_indexing_datastructures.indexed_term_p( query ) : query;
    SubLObject list_var = email_recipients;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    list_var = email_carbon_copies;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    cdolist_list_var = list_var;
    elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject event = make_single_query_schedule_assertions( query, date, email_recipients, email_carbon_copies, cyclist, task );
    if( NIL != event )
    {
      note_query_scheduling_complete( event );
    }
    return event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 4733L)
  public static SubLObject make_single_query_schedule_assertions(final SubLObject query, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task)
  {
    if( email_recipients == UNPROVIDED )
    {
      email_recipients = NIL;
    }
    if( email_carbon_copies == UNPROVIDED )
    {
      email_carbon_copies = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = get_query_scheduling_mt( cyclist, task );
    final SubLObject scheduled_query = ke.ke_create_now( $str20$ScheduledQuery, UNPROVIDED );
    SubLObject failP = Types.sublisp_null( scheduled_query );
    sqd_note_new_fort( scheduled_query );
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( cyclist );
      SubLObject cdolist_list_var = $list21;
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert_now( ConsesLow.list( $const10$isa, scheduled_query, v_isa ), $const11$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
      cdolist_list_var = email_recipients;
      SubLObject recpt = NIL;
      recpt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert_now( ConsesLow.list( results_should_be_emailed_to_address(), scheduled_query, recpt ), mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        recpt = cdolist_list_var.first();
      }
      cdolist_list_var = email_carbon_copies;
      recpt = NIL;
      recpt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ke.ke_assert_now( ConsesLow.list( $const13$resultsShouldBeEmailedToAddress_C, scheduled_query, recpt ), mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        recpt = cdolist_list_var.first();
      }
      cdolist_list_var = ConsesLow.list( ConsesLow.list( $const10$isa, scheduled_query, ConsesLow.list( $const22$ScheduledFn, ConsesLow.list( $const23$CycQueryRunningFromFn, query ) ) ), ConsesLow.list(
          $const24$scheduledStartingDate, scheduled_query, date ), ConsesLow.list( $const15$definingMt, scheduled_query, mt ), ConsesLow.listS( $const25$directingAgent, scheduled_query, $list26 ), ConsesLow.list(
              $const27$scheduledBy, scheduled_query, cyclist ) );
      SubLObject sentence = NIL;
      sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == ke.ke_assert_now( sentence, mt, UNPROVIDED, UNPROVIDED ) )
        {
          failP = T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        sentence = cdolist_list_var.first();
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != failP ) ? NIL : scheduled_query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 5962L)
  public static SubLObject remove_recurring_query_schedule(final SubLObject query, final SubLObject interval_type, SubLObject cyclist, SubLObject task)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( query ) : query;
    SubLObject cdolist_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq( $const30$KBQ_FindScheduledQuerySeries, query, $list31 );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = result;
      SubLObject this_cyclist = NIL;
      SubLObject query_series = NIL;
      SubLObject this_interval_type = NIL;
      SubLObject this_task = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      this_cyclist = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      query_series = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      this_interval_type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      this_task = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( this_cyclist.equal( cyclist ) && this_task.equal( task ) && this_interval_type.equal( interval_type ) )
        {
          remove_query_or_series_from_queue( query_series );
          final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
          try
          {
            api_control_vars.$the_cyclist$.bind( NIL, thread );
            operation_communication.set_the_cyclist( cyclist );
            ke.ke_kill( query_series );
          }
          finally
          {
            api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 6711L)
  public static SubLObject remove_single_query_schedule(final SubLObject query, final SubLObject date, SubLObject cyclist, SubLObject task)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( query ) : query;
    SubLObject cdolist_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq( $const34$KBQ_FindScheduledQueries, query, $list35 );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = result;
      SubLObject this_cyclist = NIL;
      SubLObject query_event = NIL;
      SubLObject this_date = NIL;
      SubLObject this_task = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      this_cyclist = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      query_event = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      this_date = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      this_task = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( this_cyclist.equal( cyclist ) && this_task.equal( task ) && this_date.equal( date ) )
        {
          remove_query_or_series_from_queue( query_event );
          final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
          try
          {
            api_control_vars.$the_cyclist$.bind( NIL, thread );
            operation_communication.set_the_cyclist( cyclist );
            ke.ke_kill( query_event );
          }
          finally
          {
            api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 7389L)
  public static SubLObject scheduled_query_series_type(final SubLObject query, final SubLObject cyclist)
  {
    return ConsesLow.list( $const36$SeriesOfTypeFn, ConsesLow.listS( $const37$SubcollectionOfWithRelationToFn, ConsesLow.list( $const37$SubcollectionOfWithRelationToFn, ConsesLow.list( $const22$ScheduledFn, ConsesLow
        .list( $const23$CycQueryRunningFromFn, query ) ), $const27$scheduledBy, cyclist ), $list38 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 7680L)
  public static SubLObject get_series_scheduler(final SubLObject series)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject template = scheduled_query_series_type( $kw39$ANYTHING, $list40 );
    SubLObject scheduler = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const42$EverythingPSC, thread );
      SubLObject v_isa = NIL;
      final SubLObject pred_var = $const10$isa;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( series, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( series, ONE_INTEGER, pred_var );
        SubLObject done_var = scheduler;
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw43$GAF, NIL, NIL );
              SubLObject done_var_$1 = scheduler;
              final SubLObject token_var_$2 = NIL;
              while ( NIL == done_var_$1)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                if( NIL != valid_$3 )
                {
                  v_isa = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  thread.resetMultipleValues();
                  final SubLObject success = formula_pattern_match.formula_matches_pattern( cycl_utilities.hl_to_el( v_isa ), template );
                  final SubLObject v_bindings = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != success )
                  {
                    final SubLObject this_scheduler = scheduler = list_utilities.alist_lookup_without_values( v_bindings, $sym44$THIS_SCHEDULER, UNPROVIDED, UNPROVIDED );
                  }
                }
                done_var_$1 = makeBoolean( NIL == valid_$3 || NIL != scheduler );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != scheduler );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return scheduler;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 8072L)
  public static SubLObject get_query_scheduling_mt(SubLObject cyclist, SubLObject task)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( task == UNPROVIDED )
    {
      task = cae_query_search.current_cae_task();
    }
    if( NIL != cyclist && NIL != task )
    {
      return hlmt_czer.canonicalize_hlmt( el_utilities.make_binary_formula( $const45$ModelMtByUserAndTaskFn, cyclist, task ) );
    }
    return $const46$BaseKB;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 8328L)
  public static SubLObject get_cached_results_for_cycl_query(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( query ) : query;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const42$EverythingPSC, thread );
      SubLObject inference = NIL;
      final SubLObject pred_var = $const48$queryInferences;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw43$GAF, NIL, NIL );
              SubLObject done_var_$5 = NIL;
              final SubLObject token_var_$6 = NIL;
              while ( NIL == done_var_$5)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$6 );
                final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( assertion ) );
                if( NIL != valid_$7 )
                {
                  inference = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  if( NIL != kb_indexing_datastructures.indexed_term_p( inference ) )
                  {
                    final SubLObject start_time = kb_mapping_utilities.fpred_value( inference, $const49$inferenceStartTime, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    final SubLObject answer_count = get_reified_inference_answer_count( inference );
                    final SubLObject problem_store = kb_mapping_utilities.fpred_value( inference, $const50$cycProblemStoreInferences, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
                    SubLObject path = NIL;
                    SubLObject save_date = NIL;
                    SubLObject date = NIL;
                    if( NIL != kb_indexing_datastructures.indexed_term_p( problem_store ) && answer_count.isInteger() )
                    {
                      SubLObject this_path = NIL;
                      final SubLObject pred_var_$8 = $const51$problemStoreSnapshotPathnames;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( problem_store, NIL, pred_var_$8 ) )
                      {
                        final SubLObject iterator_var_$9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( problem_store, NIL, pred_var_$8 );
                        SubLObject done_var_$6 = NIL;
                        final SubLObject token_var_$7 = NIL;
                        while ( NIL == done_var_$6)
                        {
                          final SubLObject final_index_spec_$12 = iteration.iteration_next_without_values_macro_helper( iterator_var_$9, token_var_$7 );
                          final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( final_index_spec_$12 ) );
                          if( NIL != valid_$8 )
                          {
                            SubLObject final_index_iterator_$14 = NIL;
                            try
                            {
                              final_index_iterator_$14 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$12, $kw43$GAF, NIL, NIL );
                              SubLObject done_var_$7 = NIL;
                              final SubLObject token_var_$8 = NIL;
                              while ( NIL == done_var_$7)
                              {
                                final SubLObject assertion_$17 = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$14, token_var_$8 );
                                final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( assertion_$17 ) );
                                if( NIL != valid_$9 )
                                {
                                  this_path = assertions_high.gaf_arg( assertion_$17, TWO_INTEGER );
                                  if( NIL != file_utilities.file_existsP( this_path ) )
                                  {
                                    final SubLObject file_write_date = Filesys.file_write_date( this_path );
                                    if( NIL == path || NIL == save_date || ( NIL != file_write_date && file_write_date.numL( save_date ) ) )
                                    {
                                      path = this_path;
                                      save_date = file_write_date;
                                    }
                                  }
                                }
                                done_var_$7 = makeBoolean( NIL == valid_$9 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                if( NIL != final_index_iterator_$14 )
                                {
                                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$14 );
                                }
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                              }
                            }
                          }
                          done_var_$6 = makeBoolean( NIL == valid_$8 );
                        }
                      }
                      if( NIL != path )
                      {
                        final SubLObject utime = ( NIL != save_date ) ? save_date : ( ( NIL != start_time ) ? date_utilities.cycl_date_to_universal_time( start_time ) : NIL );
                        if( NIL != utime )
                        {
                          date = Sequences.cconcatenate( numeric_date_utilities.datestring( numeric_date_utilities.get_universal_date( utime, UNPROVIDED ) ), new SubLObject[] { $str52$_, numeric_date_utilities
                              .secondstring( numeric_date_utilities.get_universal_second( utime ) )
                          } );
                        }
                        ans = ConsesLow.cons( ConsesLow.list( $kw53$DATE, date, $kw54$ANSWER_COUNT, answer_count, $kw55$PROBLEM_STORE_FILE, path ), ans );
                      }
                    }
                  }
                }
                done_var_$5 = makeBoolean( NIL == valid_$7 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 9719L)
  public static SubLObject get_reified_inference_answer_count(final SubLObject inference)
  {
    SubLObject count = ask_utilities.query_variable( $sym56$_COUNT, ConsesLow.listS( $const57$inferenceAnswerCount, inference, $list58 ), $const59$InferencePSC, $list60 ).first();
    if( NIL == count )
    {
      SubLObject csome_list_var;
      SubLObject v_bindings;
      for( csome_list_var = ask_utilities.query_variable( $sym61$_BINDINGS, ConsesLow.listS( $const62$inferenceBindings, inference, $list63 ), $const59$InferencePSC,
          $list60 ), v_bindings = NIL, v_bindings = csome_list_var.first(); NIL == count && NIL != csome_list_var; count = ( NIL != el_utilities.el_set_p( v_bindings ) ) ? Sequences.length( el_utilities.el_set_items(
              v_bindings ) ) : NIL, csome_list_var = csome_list_var.rest(), v_bindings = csome_list_var.first() )
      {
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 10277L)
  public static SubLObject get_schedules_for_cycl_query(final SubLObject query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_indexing_datastructures.indexed_term_p( query ) : query;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const42$EverythingPSC, thread );
      SubLObject query_event_or_series = NIL;
      final SubLObject pred_var = $const65$scheduledQuerySpecification;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw43$GAF, NIL, NIL );
              SubLObject done_var_$21 = NIL;
              final SubLObject token_var_$22 = NIL;
              while ( NIL == done_var_$21)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$22 );
                final SubLObject valid_$23 = makeBoolean( !token_var_$22.eql( assertion ) );
                if( NIL != valid_$23 )
                {
                  query_event_or_series = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                  final SubLObject cycl_date = find_next_scheduled_date( query_event_or_series, NIL );
                  SubLObject plist = NIL;
                  if( NIL != cycl_date )
                  {
                    plist = conses_high.putf( plist, $kw66$NEXT_RUN_DATE, cycl_date );
                    if( NIL != isa.isa_in_any_mtP( query_event_or_series, $const67$Series ) )
                    {
                      final SubLObject recurrence_interval = kb_mapping_utilities.fpred_value( query_event_or_series, $const16$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      if( NIL != recurrence_interval )
                      {
                        plist = conses_high.putf( plist, $kw68$RECURRENCE_INTERVAL, recurrence_interval );
                      }
                    }
                    SubLObject pred = NIL;
                    SubLObject pred_$24 = NIL;
                    SubLObject key = NIL;
                    SubLObject key_$25 = NIL;
                    pred = reader.bq_cons( results_should_be_emailed_to_address(), $list69 );
                    pred_$24 = pred.first();
                    key = $list70;
                    key_$25 = key.first();
                    while ( NIL != key || NIL != pred)
                    {
                      final SubLObject email = kb_mapping_utilities.pred_values( query_event_or_series, pred_$24, ONE_INTEGER, UNPROVIDED, UNPROVIDED );
                      if( NIL != list_utilities.non_empty_list_p( email ) )
                      {
                        plist = conses_high.putf( plist, key_$25, email );
                      }
                      pred = pred.rest();
                      pred_$24 = pred.first();
                      key = key.rest();
                      key_$25 = key.first();
                    }
                    ans = ConsesLow.cons( plist, ans );
                  }
                }
                done_var_$21 = makeBoolean( NIL == valid_$23 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 11389L)
  public static SubLObject scheduled_query_queue()
  {
    if( $scheduled_query_queue$.getGlobalValue() == $kw71$UNINITIALIZED )
    {
      final SubLObject init_value = queues.create_p_queue( NIL, $sym72$SCHEDULED_QUERY_SCHEDULED_RUN_TIME, UNPROVIDED );
      if( init_value == $kw71$UNINITIALIZED )
      {
        Errors.error( $str73$Unable_to_initialize__A__, $scheduled_query_queue$.getGlobalValue() );
      }
      $scheduled_query_queue$.setGlobalValue( init_value );
    }
    return $scheduled_query_queue$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 11802L)
  public static SubLObject get_scheduled_query_queue(SubLObject machine_name, SubLObject port)
  {
    if( machine_name == UNPROVIDED )
    {
      machine_name = NIL;
    }
    if( port == UNPROVIDED )
    {
      port = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject queue = NIL;
    if( NIL != machine_name && NIL != port )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw77$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym78$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject connection = remote_image.new_remote_image_connection( remote_image.new_remote_image( machine_name, port, UNPROVIDED ) );
            try
            {
              remote_image.open_remote_image_connection( connection );
              final SubLObject _prev_bind_0_$27 = remote_image.$current_remote_image_connection$.currentBinding( thread );
              try
              {
                remote_image.$current_remote_image_connection$.bind( connection, thread );
                queue = remote_image.current_remote_image_connection_eval( $list79 );
              }
              finally
              {
                remote_image.$current_remote_image_connection$.rebind( _prev_bind_0_$27, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                remote_image.close_remote_image_connection( connection );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw77$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      SubLObject cdolist_list_var = queues.p_queue_elements( scheduled_query_queue() );
      SubLObject sq = NIL;
      sq = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == Sequences.find_if( $sym80$INVALID_FORT_, sq, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          queue = ConsesLow.cons( scheduled_query_plist( sq ), queue );
        }
        cdolist_list_var = cdolist_list_var.rest();
        sq = cdolist_list_var.first();
      }
    }
    SubLObject cdolist_list_var2;
    final SubLObject plists = cdolist_list_var2 = ConsesLow.append( get_currently_running_scheduled_queries( machine_name, port ), queue );
    SubLObject plist = NIL;
    plist = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      transform_list_utilities.ntransform( plist, $sym80$INVALID_FORT_, Symbols.symbol_function( $sym81$NULL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      plist = cdolist_list_var2.first();
    }
    return Sequences.delete_duplicates( plists, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 12621L)
  public static SubLObject clear_scheduled_query_queue()
  {
    while ( NIL == queues.p_queue_empty_p( scheduled_query_queue() ))
    {
      queues.p_dequeue( scheduled_query_queue(), UNPROVIDED );
    }
    return scheduled_query_queue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 12794L)
  public static SubLObject scheduled_query_plist(final SubLObject sq)
  {
    SubLObject plist = NIL;
    final SubLObject kbq = scheduled_query_kbq( sq );
    final SubLObject scheduled_run_time_universal = scheduled_query_scheduled_run_time( sq );
    final SubLObject scheduled_run_time_cycl = date_utilities.universal_time_to_cycl_date( scheduled_run_time_universal );
    final SubLObject scheduled_run_time_decoded = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( Time.decode_universal_time( scheduled_run_time_universal, UNPROVIDED ) ) );
    final SubLObject event_or_series = scheduled_query_instance( sq );
    plist = conses_high.putf( plist, $kw82$GUID_STRING, index_scheduled_query( sq ) );
    plist = conses_high.putf( plist, $kw83$KBQ, kbq );
    plist = conses_high.putf( plist, $kw84$GLOSS, kb_query.kbq_comments( kbq ).first() );
    plist = conses_high.putf( plist, $kw85$SCHEDULED_RUN_TIME_UNIVERSAL, scheduled_run_time_universal );
    plist = conses_high.putf( plist, $kw86$SCHEDULED_RUN_TIME_UNIX, Numbers.subtract( scheduled_run_time_universal, $ut_offset_to_unix_time$.getGlobalValue() ) );
    plist = conses_high.putf( plist, $kw87$SCHEDULED_RUN_TIME_CYCL, scheduled_run_time_cycl );
    plist = conses_high.putf( plist, $kw88$SCHEDULED_RUN_TIME_DECODED, scheduled_run_time_decoded );
    if( NIL != isa.isa_in_any_mtP( event_or_series, $const67$Series ) )
    {
      plist = conses_high.putf( plist, $kw89$RECURRING_, T );
      plist = conses_high.putf( plist, $kw90$SCHEDULER, get_series_scheduler( event_or_series ) );
      plist = conses_high.putf( plist, $kw91$SERIES, event_or_series );
      plist = conses_high.putf( plist, $kw92$INTERVAL_TYPE, kb_mapping_utilities.fpred_value_in_any_mt( event_or_series, $const16$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else
    {
      plist = conses_high.putf( plist, $kw89$RECURRING_, NIL );
      plist = conses_high.putf( plist, $kw93$EVENT, event_or_series );
      plist = conses_high.putf( plist, $kw90$SCHEDULER, kb_mapping_utilities.fpred_value_in_any_mt( event_or_series, $const27$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != kb_mapping_utilities.some_pred_value_in_any_mt( event_or_series, $const94$scheduledReportSpecification, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject report = kb_mapping_utilities.fpred_value_in_any_mt( event_or_series, $const94$scheduledReportSpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject template = kb_mapping_utilities.fpred_value_in_any_mt( report, $const95$reportSpecificationTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      plist = conses_high.putf( plist, $kw96$REPORT, report );
      plist = conses_high.putf( plist, $kw97$REPORT_TEMPLATE, template );
      plist = conses_high.putf( plist, $kw98$REPORT_TEMPLATE_GLOSS, pph_main.generate_phrase( template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 14768L)
  public static SubLObject index_scheduled_query(final SubLObject sq)
  {
    final SubLObject guid_string = Guids.guid_to_string( Guids.new_guid() );
    dictionary.dictionary_enter( $scheduled_query_index$.getGlobalValue(), guid_string, sq );
    return guid_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 14950L)
  public static SubLObject lookup_scheduled_query(final SubLObject guid_string)
  {
    return dictionary.dictionary_lookup_without_values( $scheduled_query_index$.getGlobalValue(), guid_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 15084L)
  public static SubLObject scheduled_query_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && NIL != list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 15183L)
  public static SubLObject scheduled_query_kbq(final SubLObject sq)
  {
    assert NIL != scheduled_query_p( sq ) : sq;
    return sq.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 15281L)
  public static SubLObject scheduled_query_scheduled_run_time(final SubLObject sq)
  {
    assert NIL != scheduled_query_p( sq ) : sq;
    return conses_high.second( sq );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 15395L)
  public static SubLObject scheduled_query_instance(final SubLObject sq)
  {
    assert NIL != scheduled_query_p( sq ) : sq;
    return conses_high.third( sq );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 15498L)
  public static SubLObject package_scheduled_query(final SubLObject kbq, final SubLObject time, final SubLObject query_event_or_series)
  {
    assert NIL != forts.fort_p( kbq ) : kbq;
    assert NIL != numeric_date_utilities.universal_time_p( time ) : time;
    assert NIL != forts.fort_p( query_event_or_series ) : query_event_or_series;
    return ConsesLow.list( kbq, time, query_event_or_series );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 15726L)
  public static SubLObject remove_query_or_series_from_queue(final SubLObject query_or_series)
  {
    SubLObject survivors = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      while ( NIL == queues.p_queue_empty_p( scheduled_query_queue() ))
      {
        final SubLObject sq = queues.p_dequeue( scheduled_query_queue(), UNPROVIDED );
        if( !query_or_series.equal( scheduled_query_instance( sq ) ) )
        {
          survivors = ConsesLow.cons( sq, survivors );
        }
      }
      SubLObject cdolist_list_var = survivors;
      SubLObject survivor = NIL;
      survivor = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        queues.p_enqueue( survivor, scheduled_query_queue() );
        cdolist_list_var = cdolist_list_var.rest();
        survivor = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return scheduled_query_queue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 16189L)
  public static SubLObject enqueue_scheduled_query(final SubLObject packaged_query)
  {
    SubLObject query = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      if( NIL == queues.p_queue_find( packaged_query, scheduled_query_queue(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        query = queues.p_enqueue( packaged_query, scheduled_query_queue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 16477L)
  public static SubLObject dequeue_scheduled_query()
  {
    SubLObject query = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      query = queues.p_dequeue( scheduled_query_queue(), UNPROVIDED );
      note_scheduled_query_in_progress( scheduled_query_kbq( query ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 16732L)
  public static SubLObject next_scheduled_query()
  {
    SubLObject query = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      query = queues.p_queue_best( scheduled_query_queue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 16918L)
  public static SubLObject populate_scheduled_query_queue()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      clear_scheduled_query_queue();
      SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq( $const104$KBQ_FindOneTimeScheduledQueries, UNPROVIDED, UNPROVIDED );
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = result;
        SubLObject scheduled_query = NIL;
        SubLObject kbq = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
        scheduled_query = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
        kbq = current.first();
        current = current.rest();
        if( NIL == current )
        {
          schedule_query( kbq, scheduled_query, UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
      cdolist_list_var = kb_query.new_cyc_query_from_kbq( $const106$KBQ_FindRepeatingScheduledQueries, UNPROVIDED, UNPROVIDED );
      result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = result;
        SubLObject scheduled_query_series = NIL;
        SubLObject kbq = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
        scheduled_query_series = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
        kbq = current.first();
        current = current.rest();
        if( NIL == current )
        {
          schedule_query( kbq, scheduled_query_series, UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list105 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return scheduled_query_queue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 17494L)
  public static SubLObject schedule_query(final SubLObject kbq, final SubLObject query_event_or_series, SubLObject just_ranP)
  {
    if( just_ranP == UNPROVIDED )
    {
      just_ranP = NIL;
    }
    final SubLObject scheduled_time = find_next_scheduled_time( query_event_or_series, just_ranP );
    if( NIL != numeric_date_utilities.universal_time_p( scheduled_time ) )
    {
      final SubLObject sq = package_scheduled_query( kbq, scheduled_time, query_event_or_series );
      enqueue_scheduled_query( sq );
    }
    return scheduled_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 17927L)
  public static SubLObject add_scheduled_query(final SubLObject argument, final SubLObject assertion)
  {
    if( NIL != run_scheduled_queries_on_this_imageP() )
    {
      ensure_scheduled_query_daemon_is_running();
      final SubLObject query_event_or_series = assertions_high.gaf_arg1( assertion );
      final SubLObject kbq = kbq_for_query_event_or_series( query_event_or_series );
      if( NIL != kbq )
      {
        schedule_query( kbq, query_event_or_series, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 18303L)
  public static SubLObject find_next_scheduled_time(final SubLObject query_event_or_series, final SubLObject just_ranP)
  {
    final SubLObject cycl_date = find_next_scheduled_date( query_event_or_series, just_ranP );
    return ( NIL != cycl_date && NIL == date_utilities.dateL( cycl_date, date_utilities.date_before( date_utilities.indexical_now(), $list108 ) ) ) ? date_utilities.cycl_date_to_universal_time( cycl_date ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 18666L)
  public static SubLObject find_next_scheduled_date(final SubLObject query_event_or_series, final SubLObject just_ranP)
  {
    return ( NIL != isa.isa_in_any_mtP( query_event_or_series, $const67$Series ) ) ? next_run_date_for_query_series( query_event_or_series, just_ranP ) : scheduled_run_date_for_query( query_event_or_series );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 18933L)
  public static SubLObject next_run_date_for_query_series(final SubLObject query_series, final SubLObject just_ranP)
  {
    final SubLObject kbq = ( NIL != just_ranP ) ? $const109$KBQ_FindNextFutureStartDateForQue : $const110$KBQ_FindNextStartDateForQueryInSe;
    final SubLObject cycl_date = query_utilities.new_cyc_query_from_indexicalized_kbq( kbq, query_series, UNPROVIDED ).first();
    return cycl_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 19250L)
  public static SubLObject scheduled_run_date_for_query(final SubLObject query_event)
  {
    final SubLObject cycl_date = query_utilities.new_cyc_query_from_indexicalized_kbq( $const111$KBQ_FindStartDateForScheduledQuer, query_event, UNPROVIDED ).first();
    return cycl_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 19450L)
  public static SubLObject kbq_for_query_event_or_series(final SubLObject query_event_or_series)
  {
    return query_utilities.new_cyc_query_from_indexicalized_kbq( $const112$KBQ_FindScheduledKBQ, query_event_or_series, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 19992L)
  public static SubLObject get_currently_running_scheduled_queries(SubLObject machine_name, SubLObject port)
  {
    if( machine_name == UNPROVIDED )
    {
      machine_name = NIL;
    }
    if( port == UNPROVIDED )
    {
      port = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( NIL != machine_name && NIL != port )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw77$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym78$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject connection = remote_image.new_remote_image_connection( remote_image.new_remote_image( machine_name, port, UNPROVIDED ) );
            try
            {
              remote_image.open_remote_image_connection( connection );
              final SubLObject _prev_bind_0_$29 = remote_image.$current_remote_image_connection$.currentBinding( thread );
              try
              {
                remote_image.$current_remote_image_connection$.bind( connection, thread );
                ans = get_currently_running_scheduled_queries_internal();
              }
              finally
              {
                remote_image.$current_remote_image_connection$.rebind( _prev_bind_0_$29, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                remote_image.close_remote_image_connection( connection );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw77$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      ans = get_currently_running_scheduled_queries_internal();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 20509L)
  public static SubLObject get_currently_running_scheduled_queries_internal()
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = $active_scheduled_queries$.getGlobalValue();
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject packaged_query = NIL;
      SubLObject problem_store = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
      packaged_query = current.first();
      current = ( problem_store = current.rest() );
      if( NIL != inference_datastructures_problem_store.valid_problem_store_p( problem_store ) )
      {
        SubLObject plist = scheduled_query_plist( packaged_query );
        plist = conses_high.putf( plist, $kw117$PROBLEM_STORE_ID, inference_datastructures_problem_store.problem_store_suid( problem_store ) );
        plist = conses_high.putf( plist, $kw118$INFERENCES, scheduled_query_problem_store_inferences_plists( problem_store ) );
        ans = ConsesLow.cons( plist, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 21035L)
  public static SubLObject scheduled_query_problem_store_inferences_plists(final SubLObject problem_store)
  {
    SubLObject plists = NIL;
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( problem_store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw119$SKIP ) )
    {
      final SubLObject idx_$31 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$31, $kw119$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$31 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw119$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw119$SKIP;
            }
            plists = ConsesLow.cons( scheduled_query_inference_plist( inference ), plists );
          }
        }
      }
      final SubLObject idx_$32 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$32 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$32 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            plists = ConsesLow.cons( scheduled_query_inference_plist( inference2 ), plists );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return plists;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 21282L)
  public static SubLObject scheduled_query_inference_plist(final SubLObject inference)
  {
    SubLObject plist = ConsesLow.list( $kw120$INFERENCE_ID, inference_datastructures_inference.inference_suid( inference ) );
    plist = conses_high.putf( plist, $kw121$TIME_SO_FAR, inference_datastructures_inference.inference_time_so_far( inference, UNPROVIDED ) );
    plist = conses_high.putf( plist, $kw54$ANSWER_COUNT, inference_datastructures_inference.inference_answer_count( inference ) );
    plist = conses_high.putf( plist, $kw122$STATUS, inference_datastructures_inference.inference_status( inference ) );
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 21738L)
  public static SubLObject abort_scheduled_query(final SubLObject guid_string, SubLObject machine_name, SubLObject port)
  {
    if( machine_name == UNPROVIDED )
    {
      machine_name = NIL;
    }
    if( port == UNPROVIDED )
    {
      port = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != machine_name && NIL != port )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw77$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym78$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject connection = remote_image.new_remote_image_connection( remote_image.new_remote_image( machine_name, port, UNPROVIDED ) );
            try
            {
              remote_image.open_remote_image_connection( connection );
              final SubLObject _prev_bind_0_$33 = remote_image.$current_remote_image_connection$.currentBinding( thread );
              try
              {
                remote_image.$current_remote_image_connection$.bind( connection, thread );
                abort_scheduled_query( guid_string, NIL, NIL );
              }
              finally
              {
                remote_image.$current_remote_image_connection$.rebind( _prev_bind_0_$33, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                remote_image.close_remote_image_connection( connection );
                Values.restoreValuesFromVector( _values );
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
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw77$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      final SubLObject scheduled_query = lookup_scheduled_query( guid_string );
      if( NIL != scheduled_query )
      {
        abort_scheduled_query_internal( scheduled_query );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 22245L)
  public static SubLObject abort_active_scheduled_queries()
  {
    SubLObject cdolist_list_var = $active_scheduled_queries$.getGlobalValue();
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject packaged_query = NIL;
      SubLObject problem_store = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
      packaged_query = current.first();
      current = ( problem_store = current.rest() );
      abort_scheduled_query_internal( packaged_query );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 22501L)
  public static SubLObject abort_scheduled_query_internal(final SubLObject scheduled_query)
  {
    $aborted_scheduled_queries$.setGlobalValue( ConsesLow.cons( scheduled_query, $aborted_scheduled_queries$.getGlobalValue() ) );
    final SubLObject problem_store = list_utilities.alist_lookup_without_values( $active_scheduled_queries$.getGlobalValue(), scheduled_query, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != problem_store )
    {
      final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( problem_store );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw119$SKIP ) )
      {
        final SubLObject idx_$35 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$35, $kw119$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$35 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject inference;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            inference = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw119$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( inference ) )
              {
                inference = $kw119$SKIP;
              }
              inference_strategist.inference_abort( inference );
            }
          }
        }
        final SubLObject idx_$36 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$36 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$36 );
          SubLObject id2 = NIL;
          SubLObject inference2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              inference2 = Hashtables.getEntryValue( cdohash_entry );
              inference_strategist.inference_abort( inference2 );
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
    }
    SubLObject survivors = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      while ( NIL == queues.p_queue_empty_p( scheduled_query_queue() ))
      {
        final SubLObject sq = queues.p_dequeue( scheduled_query_queue(), UNPROVIDED );
        if( !scheduled_query.equal( sq ) )
        {
          survivors = ConsesLow.cons( sq, survivors );
        }
      }
      SubLObject cdolist_list_var = survivors;
      SubLObject survivor = NIL;
      survivor = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        queues.p_enqueue( survivor, scheduled_query_queue() );
        cdolist_list_var = cdolist_list_var.rest();
        survivor = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 23260L)
  public static SubLObject should_skipXabort_scheduled_queryP(final SubLObject scheduled_query)
  {
    return subl_promotions.memberP( scheduled_query, $aborted_scheduled_queries$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 23403L)
  public static SubLObject note_scheduled_query_in_progress(final SubLObject kbq)
  {
    $in_progress_queries$.setGlobalValue( ConsesLow.cons( kbq, $in_progress_queries$.getGlobalValue() ) );
    return $in_progress_queries$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 23526L)
  public static SubLObject note_scheduled_query_finished_running(final SubLObject kbq)
  {
    $in_progress_queries$.setGlobalValue( Sequences.remove( kbq, $in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $active_scheduled_queries$.setGlobalValue( list_utilities.remove_if_not( $sym125$VALID_PROBLEM_STORE_P, $active_scheduled_queries$.getGlobalValue(), Symbols.symbol_function( $sym126$CDR ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
    $completed_queries$.setGlobalValue( ConsesLow.cons( kbq, $completed_queries$.getGlobalValue() ) );
    return $in_progress_queries$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 23830L)
  public static SubLObject scheduled_query_in_progressP(final SubLObject kbq)
  {
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      ans = subl_promotions.memberP( kbq, $in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 24017L)
  public static SubLObject run_packaged_scheduled_query(final SubLObject packaged_query)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    if( NIL != packaged_query )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw77$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym78$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject kbq = scheduled_query_kbq( packaged_query );
            final SubLObject query_event_or_series = scheduled_query_instance( packaged_query );
            if( NIL != forts.valid_fortP( query_event_or_series ) )
            {
              final SubLObject _prev_bind_0_$37 = api_control_vars.$the_cyclist$.currentBinding( thread );
              try
              {
                api_control_vars.$the_cyclist$.bind( NIL, thread );
                operation_communication.set_the_cyclist( $const17$ScheduledQueryDaemon );
                if( NIL == should_skipXabort_scheduled_queryP( packaged_query ) )
                {
                  try
                  {
                    final SubLObject problem_store_properties = list_utilities.filter_plist( kb_query.kbq_query_properties( kbq ), $sym127$PROBLEM_STORE_PROPERTY_P );
                    SubLObject store = NIL;
                    try
                    {
                      store = inference_datastructures_problem_store.new_problem_store( problem_store_properties );
                      $active_scheduled_queries$.setGlobalValue( ConsesLow.cons( ConsesLow.cons( packaged_query, store ), $active_scheduled_queries$.getGlobalValue() ) );
                      successP = run_scheduled_query_internal( packaged_query, store );
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        inference_datastructures_problem_store.destroy_problem_store( store );
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
                    final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values2 = Values.getValuesAsVector();
                      note_scheduled_query_finished_running( kbq );
                      Values.restoreValuesFromVector( _values2 );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
                    }
                  }
                }
                if( NIL == successP || NIL != isa.isa_in_any_mtP( query_event_or_series, $const67$Series ) )
                {
                  schedule_query( kbq, query_event_or_series, T );
                }
                else
                {
                  cleanup_scheduled_query( query_event_or_series );
                }
              }
              finally
              {
                api_control_vars.$the_cyclist$.rebind( _prev_bind_0_$37, thread );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw77$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 25214L)
  public static SubLObject cleanup_scheduled_query(final SubLObject query_event)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $scheduled_query_cleanup_lock$.getGlobalValue() );
      if( NIL != forts.valid_fortP( query_event ) )
      {
        ke.ke_kill_now( query_event );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $scheduled_query_cleanup_lock$.getGlobalValue() );
      }
    }
    return query_event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 25406L)
  public static SubLObject run_scheduled_query_internal(final SubLObject packaged_query, final SubLObject store)
  {
    final SubLObject kbq = scheduled_query_kbq( packaged_query );
    final SubLObject query_event_or_series = scheduled_query_instance( packaged_query );
    SubLObject successP = NIL;
    final SubLObject inference = run_scheduled_query( kbq, store );
    final SubLObject location = new_path_for_scheduled_query_problem_store( store );
    if( NIL != inference )
    {
      inference_serialization.save_problem_store( store, location, UNPROVIDED );
      final SubLObject defining_mt = kb_accessors.defining_mt( query_event_or_series );
      final SubLObject mt = ( NIL != defining_mt ) ? defining_mt : $scheduled_query_computer_info_mt$.getGlobalValue();
      final SubLObject inference_datastructure = inference_utilities.cycl_term_for_inference( inference );
      ke.ke_assert_now( ConsesLow.list( $const51$problemStoreSnapshotPathnames, inference_utilities.cycl_term_for_problem_store( store ), location ), mt, UNPROVIDED, UNPROVIDED );
      inference_utilities.assert_problem_store_data( store, mt, UNPROVIDED );
      inference_utilities.assert_inference_data( inference, mt, UNPROVIDED );
      ke.ke_assert_now( ConsesLow.list( $const48$queryInferences, kbq, inference_datastructure ), mt, UNPROVIDED, UNPROVIDED );
      if( NIL != isa.isa_in_any_mtP( query_event_or_series, $const67$Series ) )
      {
        ke.ke_assert_now( ConsesLow.list( $const129$inferenceDatastructure, reify_scheduled_query_in_series( query_event_or_series, defining_mt ), inference_datastructure ), mt, UNPROVIDED, UNPROVIDED );
      }
      maybe_email_scheduled_query_results( query_event_or_series, inference );
      successP = T;
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 29629L)
  public static SubLObject get_mime_type_for_delimiter(final SubLObject delimiter)
  {
    if( delimiter.eql( Characters.CHAR_comma ) )
    {
      return $str130$text_csv;
    }
    if( delimiter.eql( Characters.CHAR_tab ) )
    {
      return $str131$text_tsv;
    }
    return $str132$text_plain;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 30421L)
  public static SubLObject get_subl_character(final SubLObject cycl_character)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subl_char = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const42$EverythingPSC, thread );
      if( NIL == subl_char )
      {
        SubLObject csome_list_var = $list134;
        SubLObject pred = NIL;
        pred = csome_list_var.first();
        while ( NIL == subl_char && NIL != csome_list_var)
        {
          SubLObject string = NIL;
          final SubLObject pred_var = pred;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( cycl_character, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( cycl_character, NIL, pred_var );
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw43$GAF, $kw133$TRUE, NIL );
                  SubLObject done_var_$40 = NIL;
                  final SubLObject token_var_$41 = NIL;
                  while ( NIL == done_var_$40)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$41 );
                    final SubLObject valid_$42 = makeBoolean( !token_var_$41.eql( assertion ) );
                    if( NIL != valid_$42 )
                    {
                      string = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                      if( NIL != list_utilities.lengthE( string, ONE_INTEGER, UNPROVIDED ) )
                      {
                        subl_char = string_utilities.first_char( string );
                      }
                    }
                    done_var_$40 = makeBoolean( NIL == valid_$42 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
          }
          csome_list_var = csome_list_var.rest();
          pred = csome_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return subl_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 31345L)
  public static SubLObject maybe_email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference)
  {
    final SubLObject to = get_email_recipients_for_scheduled_query_results( query_event_or_series );
    final SubLObject cc = get_email_cc_for_scheduled_query_results( query_event_or_series );
    final SubLObject cyclist = kb_mapping_utilities.fpred_value_in_any_mt( query_event_or_series, $const27$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != cyclist && NIL != list_utilities.non_empty_list_p( to ) )
    {
      try_to_email_scheduled_query_results( query_event_or_series, inference, to, cc, cyclist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 31818L)
  public static SubLObject results_should_be_emailed_to_address()
  {
    return constants_high.find_constant_by_guid_string( $str135$6cb141db_9948_4a5b_b7ae_a86899c41 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 31954L)
  public static SubLObject get_email_recipients_for_scheduled_query_results(final SubLObject query_event_or_series)
  {
    return kb_mapping_utilities.pred_values_in_any_mt( query_event_or_series, results_should_be_emailed_to_address(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 32142L)
  public static SubLObject get_email_cc_for_scheduled_query_results(final SubLObject query_event_or_series)
  {
    return kb_mapping_utilities.pred_values_in_any_mt( query_event_or_series, $const13$resultsShouldBeEmailedToAddress_C, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 32463L)
  public static SubLObject get_scheduled_query_results_message(final SubLObject query_event_or_series, final SubLObject inference)
  {
    final SubLObject name = query_utilities.new_cyc_query_from_indexicalized_kbq( $const137$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED ).first();
    final SubLObject sentence = query_utilities.new_cyc_query_from_indexicalized_kbq( $const138$KBQ_FindFormulaForScheduledQuery, query_event_or_series, UNPROVIDED ).first();
    final SubLObject paraphrase = pph_main.generate_text_wXsentential_force( el_utilities.possibly_unquote( sentence ), $kw139$INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject result_count = inference_datastructures_inference.inference_answer_count( inference );
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      PrintLow.format( stream, $scheduled_query_results_message_template$.getGlobalValue(), new SubLObject[] { name, cycl_string.cycl_string_to_utf8_string( paraphrase ), result_count
      } );
      streams_high.terpri( stream );
      operation_communication.server_summary( stream );
      result = streams_high.get_output_stream_string( stream );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 33186L)
  public static SubLObject get_scheduled_query_results_subject(final SubLObject query_event_or_series, final SubLObject inference)
  {
    final SubLObject name = query_utilities.new_cyc_query_from_indexicalized_kbq( $const137$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED ).first();
    final SubLObject result_count = inference_datastructures_inference.inference_answer_count( inference );
    return Sequences.cconcatenate( $str140$Scheduled_Query_Results__, new SubLObject[] { format_nil.format_nil_d_no_copy( result_count ), $str141$_answers_for_, format_nil.format_nil_s_no_copy( name )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 35392L)
  public static SubLObject extension_for_delimiter(final SubLObject delimiter)
  {
    if( delimiter.eql( Characters.CHAR_tab ) )
    {
      return $str142$tsv;
    }
    if( delimiter.eql( Characters.CHAR_comma ) )
    {
      return $str143$csv;
    }
    return $str144$txt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 35556L)
  public static SubLObject get_scheduled_report_results_subject(final SubLObject file_name, final SubLObject successP, final SubLObject report_generator)
  {
    final SubLObject problem_count = sksi_reports_by_column.report_generator_problem_count( report_generator );
    return ( NIL != successP && problem_count.isZero() ) ? $str145$Report_run_successfully
        : Sequences.cconcatenate( $str146$Report_generation_failed__, new SubLObject[]
        { format_nil.format_nil_d_no_copy( problem_count ), $str147$_problems_
        } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 35902L)
  public static SubLObject do_smtp_accounts_for_cyclist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyclist = NIL;
    SubLObject host = NIL;
    SubLObject port = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    cyclist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    host = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    port = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$44 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list148 );
      current_$44 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list148 );
      if( NIL == conses_high.member( current_$44, $list149, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$44 == $kw150$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list148 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw151$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject el_list = $sym152$EL_LIST;
    final SubLObject smtp_account = $sym153$SMTP_ACCOUNT;
    final SubLObject info = $sym154$INFO;
    return ConsesLow.list( $sym155$CSOME, ConsesLow.list( el_list, ConsesLow.list( $sym156$NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, $const157$KBQ_FindSMTPAccountsForCyclist, cyclist ), done ), ConsesLow.list( $sym155$CSOME,
        ConsesLow.list( smtp_account, ConsesLow.list( $sym158$EL_LIST_ITEMS, el_list ), done ), ConsesLow.list( $sym155$CSOME, ConsesLow.list( info, ConsesLow.list( $sym156$NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ,
            $const159$KBQ_FindSMTPInfoForAccount, smtp_account ), done ), ConsesLow.listS( $sym160$CDESTRUCTURING_BIND, reader.bq_cons( port, host ), info, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 36387L)
  public static SubLObject try_to_email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference, final SubLObject to, final SubLObject cc, final SubLObject cyclist)
  {
    SubLObject sentP = NIL;
    if( NIL == sentP )
    {
      SubLObject csome_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq( $const157$KBQ_FindSMTPAccountsForCyclist, cyclist, UNPROVIDED );
      SubLObject el_list = NIL;
      el_list = csome_list_var.first();
      while ( NIL == sentP && NIL != csome_list_var)
      {
        if( NIL == sentP )
        {
          SubLObject csome_list_var_$45 = el_utilities.el_list_items( el_list );
          SubLObject smtp_account = NIL;
          smtp_account = csome_list_var_$45.first();
          while ( NIL == sentP && NIL != csome_list_var_$45)
          {
            if( NIL == sentP )
            {
              SubLObject csome_list_var_$46 = query_utilities.new_cyc_query_from_indexicalized_kbq( $const159$KBQ_FindSMTPInfoForAccount, smtp_account, UNPROVIDED );
              SubLObject info = NIL;
              info = csome_list_var_$46.first();
              while ( NIL == sentP && NIL != csome_list_var_$46)
              {
                SubLObject current;
                final SubLObject datum = current = info;
                SubLObject port = NIL;
                SubLObject host = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list161 );
                port = current.first();
                current = ( host = current.rest() );
                sentP = email_scheduled_query_results( query_event_or_series, inference, to, cc, host, port );
                csome_list_var_$46 = csome_list_var_$46.rest();
                info = csome_list_var_$46.first();
              }
            }
            csome_list_var_$45 = csome_list_var_$45.rest();
            smtp_account = csome_list_var_$45.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        el_list = csome_list_var.first();
      }
    }
    return sentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 37092L)
  public static SubLObject email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference, final SubLObject to, final SubLObject cc, final SubLObject host, final SubLObject port)
  {
    final SubLObject message = get_scheduled_query_results_message( query_event_or_series, inference );
    final SubLObject subject = get_scheduled_query_results_subject( query_event_or_series, inference );
    return mail_utilities.mail_message( $str162$scheduled_query_daemon_cyc_com, to, message, subject, host, NIL, port, TEN_INTEGER, cc, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 39146L)
  public static SubLObject reify_scheduled_query_in_series(final SubLObject query_series, final SubLObject defining_mt)
  {
    final SubLObject query_event = ke.ke_create_now( $str20$ScheduledQuery, UNPROVIDED );
    sqd_note_new_fort( query_event );
    ke.ke_assert_now( ConsesLow.list( $const10$isa, query_event, scheduled_query_series_query_type( query_series ) ), defining_mt, UNPROVIDED, UNPROVIDED );
    ke.ke_assert_now( ConsesLow.list( $const163$seriesMembers, query_series, query_event ), defining_mt, UNPROVIDED, UNPROVIDED );
    return query_event;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 39521L)
  public static SubLObject scheduled_query_series_query_type(final SubLObject query_series)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type = $const164$CycQueryRunning;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym41$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const42$EverythingPSC, thread );
      final SubLObject deck_type = $kw167$QUEUE;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym168$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw169$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str170$_A_is_not_a__A, tv_var, $sym171$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw172$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str173$continue_anyway, $str170$_A_is_not_a__A, tv_var, $sym171$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw174$WARN ) )
              {
                Errors.warn( $str170$_A_is_not_a__A, tv_var, $sym171$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str175$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str173$continue_anyway, $str170$_A_is_not_a__A, tv_var, $sym171$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const10$isa ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const10$isa ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const10$isa ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const10$isa ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( query_series, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  SubLObject cdolist_list_var;
                  final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const10$isa ) );
                  SubLObject module_var = NIL;
                  module_var = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject _prev_bind_0_$51 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                          .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                      final SubLObject node = function_terms.naut_to_nart( query_series );
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
                                final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                  SubLObject iteration_state_$58;
                                  for( iteration_state_$58 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state_$58 ); iteration_state_$58 = dictionary_contents.do_dictionary_contents_next( iteration_state_$58 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$58 );
                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                    {
                                      final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                          Errors.error( $str176$_A_is_neither_SET_P_nor_LISTP_, sol );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$53, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$58 );
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$52, thread );
                                }
                              }
                            }
                            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str177$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                      }
                      else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                      {
                        SubLObject cdolist_list_var_$60;
                        final SubLObject new_list = cdolist_list_var_$60 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                UNPROVIDED ) ) )
                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                .get_sbhl_module( UNPROVIDED ) ) );
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$60.first();
                        while ( NIL != cdolist_list_var_$60)
                        {
                          final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3, UNPROVIDED ) )
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
                              Errors.error( $str176$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                            }
                          }
                          finally
                          {
                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$54, thread );
                          }
                          cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                          generating_fn = cdolist_list_var_$60.first();
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$52, thread );
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$51, thread );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                  }
                  SubLObject node_var = deck.deck_pop( recur_deck );
                  final SubLObject _prev_bind_0_$55 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$55 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  try
                  {
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                    while ( NIL != node_var)
                    {
                      final SubLObject col = node_var;
                      SubLObject this_type = NIL;
                      final SubLObject pred_var = $const178$seriesOfType;
                      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( col, TWO_INTEGER, pred_var ) )
                      {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( col, TWO_INTEGER, pred_var );
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
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw43$GAF, NIL, NIL );
                              SubLObject done_var_$65 = NIL;
                              final SubLObject token_var_$66 = NIL;
                              while ( NIL == done_var_$65)
                              {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                                final SubLObject valid_$67 = makeBoolean( !token_var_$66.eql( assertion ) );
                                if( NIL != valid_$67 )
                                {
                                  this_type = assertions_high.gaf_arg( assertion, ONE_INTEGER );
                                  if( NIL != genls.genlP( this_type, type, UNPROVIDED, UNPROVIDED ) && NIL == genls.genlP( type, this_type, UNPROVIDED, UNPROVIDED ) )
                                  {
                                    type = this_type;
                                  }
                                }
                                done_var_$65 = makeBoolean( NIL == valid_$67 );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
                              }
                            }
                          }
                          done_var = makeBoolean( NIL == valid );
                        }
                      }
                      SubLObject cdolist_list_var2;
                      final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                      SubLObject module_var2 = NIL;
                      module_var2 = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        final SubLObject _prev_bind_0_$57 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node2 = function_terms.naut_to_nart( node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                          {
                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link2 )
                            {
                              final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links2 )
                              {
                                SubLObject iteration_state2;
                                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                  final SubLObject tv_links2 = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      SubLObject iteration_state_$59;
                                      for( iteration_state_$59 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$59 ); iteration_state_$59 = dictionary_contents.do_dictionary_contents_next( iteration_state_$59 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$59 );
                                        final SubLObject link_nodes3 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol3 = link_nodes3;
                                            if( NIL != set.set_p( sol3 ) )
                                            {
                                              final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                              SubLObject basis_object3;
                                              SubLObject state3;
                                              SubLObject node_vars_link_node5;
                                              for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                  set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                              {
                                                node_vars_link_node5 = set_contents.do_set_contents_next( basis_object3, state3 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node5 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                    node_vars_link_node5, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node5, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node5, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol3.isList() )
                                            {
                                              SubLObject csome_list_var3 = sol3;
                                              SubLObject node_vars_link_node6 = NIL;
                                              node_vars_link_node6 = csome_list_var3.first();
                                              while ( NIL != csome_list_var3)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node6, recur_deck );
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                node_vars_link_node6 = csome_list_var3.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str176$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$59, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$59 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$58, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str177$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$61;
                            final SubLObject new_list2 = cdolist_list_var_$61 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn2 = NIL;
                            generating_fn2 = cdolist_list_var_$61.first();
                            while ( NIL != cdolist_list_var_$61)
                            {
                              final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                final SubLObject sol4;
                                final SubLObject link_nodes4 = sol4 = Functions.funcall( generating_fn2, node2 );
                                if( NIL != set.set_p( sol4 ) )
                                {
                                  final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                  SubLObject node_vars_link_node2;
                                  SubLObject basis_object4;
                                  SubLObject state4;
                                  for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                      set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                  {
                                    node_vars_link_node2 = set_contents.do_set_contents_next( basis_object4, state4 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node2 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                    }
                                  }
                                }
                                else if( sol4.isList() )
                                {
                                  SubLObject csome_list_var4 = sol4;
                                  SubLObject node_vars_link_node7 = NIL;
                                  node_vars_link_node7 = csome_list_var4.first();
                                  while ( NIL != csome_list_var4)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node7, recur_deck );
                                    }
                                    csome_list_var4 = csome_list_var4.rest();
                                    node_vars_link_node7 = csome_list_var4.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str176$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$60, thread );
                              }
                              cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                              generating_fn2 = cdolist_list_var_$61.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$54, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$57, thread );
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        module_var2 = cdolist_list_var2.first();
                      }
                      node_var = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$55, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$53, thread );
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$55, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$54, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$51, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$50, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str179$Node__a_does_not_pass_sbhl_type_t, query_series, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                    UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$50, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$49, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$49, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$48, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$61, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$47, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 39884L)
  public static SubLObject run_scheduled_query(final SubLObject kbq, final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject result = kb_query.new_cyc_query_from_kbq( kbq, ConsesLow.list( $kw180$PROBLEM_STORE, store, $kw181$CONTINUABLE_, T ), UNPROVIDED );
    final SubLObject halt_reason = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    final SubLObject metric_values = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 40221L)
  public static SubLObject scheduled_query_problem_store_directory()
  {
    final SubLObject directory = $str182$data_problem_stores_;
    if( NIL == Filesys.directory_p( directory ) )
    {
      file_utilities.make_directory_recursive( directory, NIL, $str183$0775 );
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 40440L)
  public static SubLObject new_path_for_scheduled_query_problem_store(final SubLObject store)
  {
    final SubLObject directory = Sequences.cconcatenate( scheduled_query_problem_store_directory(), new SubLObject[] { string_utilities.char_subst( Characters.CHAR_slash, Characters.CHAR_hyphen, control_vars
        .cyc_image_id() ), $str184$_
    } );
    if( NIL == Filesys.directory_p( directory ) )
    {
      file_utilities.make_directory_recursive( directory, NIL, $str183$0775 );
    }
    return Sequences.cconcatenate( directory, new SubLObject[] { $str185$store_, print_high.princ_to_string( inference_datastructures_problem_store.problem_store_suid( store ) ), $str186$_cfasl
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 41020L)
  public static SubLObject start_scheduled_query_processing_internal()
  {
    inference_utilities.ensure_term_for_machine( $scheduled_query_computer_info_mt$.getGlobalValue(), $const17$ScheduledQueryDaemon );
    set_scheduled_query_image_flag( T );
    final SubLObject queue = populate_scheduled_query_queue();
    ensure_scheduled_query_daemon_is_running();
    return queues.p_queue_size( queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 41405L)
  public static SubLObject set_scheduled_query_image_flag(final SubLObject runP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $run_scheduled_queries_on_this_imageP$.setGlobalValue( list_utilities.sublisp_boolean( runP ) );
    final SubLObject mt = $scheduled_query_computer_info_mt$.getGlobalValue();
    final SubLObject term_for_machine = inference_utilities.ensure_term_for_machine( mt, $const17$ScheduledQueryDaemon );
    final SubLObject sentence = ConsesLow.list( $const190$programOnPort, $const191$ScheduledQueryDaemon_CW, $const192$CFASLProtocol, cfasl_kernel.cfasl_port(), term_for_machine );
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( $const17$ScheduledQueryDaemon );
      if( NIL != runP )
      {
        ke.ke_assert( sentence, mt, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        ke.ke_unassert( sentence, mt );
      }
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return $run_scheduled_queries_on_this_imageP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 41931L)
  public static SubLObject find_possible_scheduled_query_daemon_images()
  {
    return kb_query.new_cyc_query_from_kbq( $const194$FindRunningScheduledQueryDaemons, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 42248L)
  public static SubLObject run_scheduled_queries_on_this_imageP()
  {
    return list_utilities.sublisp_boolean( $run_scheduled_queries_on_this_imageP$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 42447L)
  public static SubLObject ensure_scheduled_query_daemon_is_running()
  {
    if( NIL == Threads.valid_process_p( $scheduled_query_daemon$.getGlobalValue() ) )
    {
      $scheduled_query_daemon$.setGlobalValue( launch_scheduled_query_daemon() );
    }
    return $scheduled_query_daemon$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 42666L)
  public static SubLObject launch_scheduled_query_runner(final SubLObject packaged_query)
  {
    final SubLObject id = integer_sequence_generator.integer_sequence_generator_next( $scheduled_query_runner_isg$.getGlobalValue() );
    final SubLObject name = Sequences.cconcatenate( $str195$Scheduled_Query_Runner_, format_nil.format_nil_d_no_copy( id ) );
    final SubLObject runner = process_utilities.make_cyc_server_process_with_args( name, $sym196$RUN_PACKAGED_SCHEDULED_QUERY, ConsesLow.list( packaged_query ) );
    return runner;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 42984L)
  public static SubLObject launch_scheduled_query_daemon()
  {
    final SubLObject name = Sequences.copy_seq( $str197$Scheduled_Query_Daemon );
    return process_utilities.make_cyc_server_process( name, $sym198$RUN_SCHEDULED_QUERIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 43155L)
  public static SubLObject run_scheduled_queries()
  {
    while ( NIL != run_scheduled_queries_on_this_imageP())
    {
      while ( NIL != queues.p_queue_empty_p( scheduled_query_queue() ))
      {
        Threads.sleep( ONE_INTEGER );
      }
      if( NIL != run_scheduled_queries_on_this_imageP() )
      {
        maybe_run_next_scheduled_query();
        Threads.sleep( ONE_INTEGER );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 43435L)
  public static SubLObject maybe_run_next_scheduled_query()
  {
    if( NIL == list_utilities.lengthGE( $active_scheduled_queries$.getGlobalValue(), $max_number_of_simultaneous_scheduled_queries$.getGlobalValue(), UNPROVIDED ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $scheduled_query_queue_lock$.getGlobalValue() );
        final SubLObject packaged_query = next_scheduled_query();
        if( NIL != packaged_query )
        {
          final SubLObject time = scheduled_query_scheduled_run_time( packaged_query );
          final SubLObject seconds_to_wait = Numbers.subtract( time, Time.get_universal_time() );
          if( !seconds_to_wait.isPositive() )
          {
            launch_scheduled_query_runner( dequeue_scheduled_query() );
          }
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $scheduled_query_queue_lock$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44102L)
  public static SubLObject sqd_note_new_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != misc_utilities.initialized_p( $sqd_new_forts_to_cleanup$.getDynamicValue( thread ) ) ) ? queues.enqueue( fort, $sqd_new_forts_to_cleanup$.getDynamicValue( thread ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44250L)
  public static SubLObject sqd_cleanup_new_forts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != misc_utilities.initialized_p( $sqd_new_forts_to_cleanup$.getDynamicValue( thread ) ) )
    {
      while ( NIL == queues.queue_empty_p( $sqd_new_forts_to_cleanup$.getDynamicValue( thread ) ))
      {
        cleanup_scheduled_query( queues.dequeue( $sqd_new_forts_to_cleanup$.getDynamicValue( thread ) ) );
      }
    }
    return $sqd_new_forts_to_cleanup$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject scheduled_query_test_query()
  {
    final SubLObject test_query_naut = $list210;
    final SubLObject kbq = narts_high.find_nart( test_query_naut );
    if( NIL == forts.valid_fortP( kbq ) )
    {
      Errors.warn( $str211$Couldn_t_find_valid_test_query__S, test_query_naut );
    }
    return kbq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject with_sqd_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list212 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject timeout = NIL;
    SubLObject timed_outP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list212 );
    timeout = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list212 );
    timed_outP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym213$WITH_TIMEOUT, ConsesLow.list( timeout, timed_outP ), ConsesLow.list( $sym214$CLET, $list215, ConsesLow.listS( $sym216$CUNWIND_PROTECT, reader.bq_cons( $sym217$PROGN, ConsesLow.append(
          body, NIL ) ), $list218 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list212 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject start_daemon_and_schedule_query_once(SubLObject kbq, SubLObject timeout)
  {
    if( kbq == UNPROVIDED )
    {
      kbq = scheduled_query_test_query();
    }
    if( timeout == UNPROVIDED )
    {
      timeout = $int219$300;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing_results = get_cached_results_for_cycl_query( kbq );
    SubLObject new_results = NIL;
    SubLObject timed_outP = NIL;
    SubLObject time = NIL;
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
          final SubLObject _prev_bind_0_$77 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
            final SubLObject _prev_bind_0_$78 = $sqd_new_forts_to_cleanup$.currentBinding( thread );
            try
            {
              $sqd_new_forts_to_cleanup$.bind( queues.create_queue( UNPROVIDED ), thread );
              try
              {
                final SubLObject time_var = Time.get_internal_real_time();
                start_daemon_and_stop_receiving();
                schedule_query_and_wait_for_processing( kbq );
                new_results = get_scheduled_query_results( kbq, existing_results );
                time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
              }
              finally
              {
                final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sqd_cleanup_new_forts();
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$79, thread );
                }
              }
            }
            finally
            {
              $sqd_new_forts_to_cleanup$.rebind( _prev_bind_0_$78, thread );
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$77, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$80, thread );
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
      timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    PrintLow.format( T, $str220$___D_existing_result__P___S___D_n, new SubLObject[] { Sequences.length( existing_results ), existing_results, Sequences.length( new_results ), new_results
    } );
    if( NIL != timed_outP )
    {
      Errors.warn( $str221$Timed_out_after__S_second__P_duri, timeout );
    }
    else
    {
      PrintLow.format( T, $str222$__Finished_START_DAEMON_AND_SCHED, numeric_date_utilities.readable_elapsed_time_string( time, UNPROVIDED ) );
    }
    return new_results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject schedule_test_query_and_wait_for_results(SubLObject kbq, SubLObject timeout)
  {
    if( kbq == UNPROVIDED )
    {
      kbq = scheduled_query_test_query();
    }
    if( timeout == UNPROVIDED )
    {
      timeout = $int219$300;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing_results = get_cached_results_for_cycl_query( kbq );
    SubLObject timed_outP = NIL;
    SubLObject new_results = NIL;
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
          final SubLObject _prev_bind_0_$81 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
            final SubLObject _prev_bind_0_$82 = $sqd_new_forts_to_cleanup$.currentBinding( thread );
            try
            {
              $sqd_new_forts_to_cleanup$.bind( queues.create_queue( UNPROVIDED ), thread );
              try
              {
                schedule_query_and_wait_for_processing( kbq );
                new_results = get_scheduled_query_results( kbq, existing_results );
              }
              finally
              {
                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sqd_cleanup_new_forts();
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$83, thread );
                }
              }
            }
            finally
            {
              $sqd_new_forts_to_cleanup$.rebind( _prev_bind_0_$82, thread );
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$81, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
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
      timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( new_results, timed_outP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject schedule_query_once_and_start_daemon(SubLObject kbq, SubLObject timeout)
  {
    if( kbq == UNPROVIDED )
    {
      kbq = scheduled_query_test_query();
    }
    if( timeout == UNPROVIDED )
    {
      timeout = $int219$300;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing_results = get_cached_results_for_cycl_query( kbq );
    SubLObject new_results = NIL;
    SubLObject timed_outP = NIL;
    SubLObject time = NIL;
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
          final SubLObject _prev_bind_0_$85 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
            timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
            final SubLObject _prev_bind_0_$86 = $sqd_new_forts_to_cleanup$.currentBinding( thread );
            try
            {
              $sqd_new_forts_to_cleanup$.bind( queues.create_queue( UNPROVIDED ), thread );
              try
              {
                final SubLObject time_var = Time.get_internal_real_time();
                halt_scheduled_query_processing();
                schedule_query_and_wait_for_processing( kbq );
                start_daemon_and_stop_receiving();
                Threads.sleep( ONE_INTEGER );
                new_results = get_scheduled_query_results( kbq, existing_results );
                time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
              }
              finally
              {
                final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  sqd_cleanup_new_forts();
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$87, thread );
                }
              }
            }
            finally
            {
              $sqd_new_forts_to_cleanup$.rebind( _prev_bind_0_$86, thread );
            }
          }
          finally
          {
            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$85, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            subl_macro_promotions.with_timeout_stop_timer( timer );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$88, thread );
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
      timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
    }
    finally
    {
      thread.throwStack.pop();
    }
    PrintLow.format( T, $str220$___D_existing_result__P___S___D_n, new SubLObject[] { Sequences.length( existing_results ), existing_results, Sequences.length( new_results ), new_results
    } );
    if( NIL != timed_outP )
    {
      Errors.warn( $str223$Timed_out_after__S_second__P_duri, timeout );
    }
    else
    {
      PrintLow.format( T, $str224$__Finished_SCHEDULE_QUERY_ONCE_AN, numeric_date_utilities.readable_elapsed_time_string( time, UNPROVIDED ) );
    }
    return new_results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject start_daemon_and_stop_receiving()
  {
    start_scheduled_query_processing_internal();
    operation_communication.set_receive_state( $str225$no );
    while ( NIL == agenda.agenda_idleP())
    {
      Threads.sleep( ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject schedule_query_and_wait_for_processing(final SubLObject kbq)
  {
    final SubLObject already_done_count = Sequences.count( kbq, $completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject query_event = add_single_query_schedule( kbq, date_utilities.indexical_now(), NIL, NIL, $const17$ScheduledQueryDaemon, $const226$ScheduledQueryTesting_Allotment );
    try
    {
      if( NIL != run_scheduled_queries_on_this_imageP() )
      {
        while ( !Sequences.count( kbq, $completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numG( already_done_count ))
        {
          Threads.sleep( ONE_INTEGER );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        cleanup_scheduled_query( query_event );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/scheduled-queries.lisp", position = 44507L)
  public static SubLObject get_scheduled_query_results(final SubLObject kbq, SubLObject existing_results)
  {
    if( existing_results == UNPROVIDED )
    {
      existing_results = get_cached_results_for_cycl_query( kbq );
    }
    while ( NIL != scheduled_query_in_progressP( kbq ) || NIL == operation_queues.local_queue_empty())
    {
      Threads.sleep( ONE_INTEGER );
    }
    return conses_high.set_difference( get_cached_results_for_cycl_query( kbq ), existing_results, Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  public static SubLObject declare_scheduled_queries_file()
  {
    SubLFiles.declareFunction( me, "start_scheduled_query_processing", "START-SCHEDULED-QUERY-PROCESSING", 0, 1, false );
    SubLFiles.declareFunction( me, "maybe_verify_test_query", "MAYBE-VERIFY-TEST-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "halt_scheduled_query_processing", "HALT-SCHEDULED-QUERY-PROCESSING", 0, 0, false );
    SubLFiles.declareFunction( me, "add_recurring_query_schedule", "ADD-RECURRING-QUERY-SCHEDULE", 2, 4, false );
    SubLFiles.declareFunction( me, "make_recurring_query_schedule_assertions", "MAKE-RECURRING-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false );
    SubLFiles.declareFunction( me, "note_query_scheduling_complete", "NOTE-QUERY-SCHEDULING-COMPLETE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_single_query_schedule", "ADD-SINGLE-QUERY-SCHEDULE", 2, 4, false );
    SubLFiles.declareFunction( me, "make_single_query_schedule_assertions", "MAKE-SINGLE-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false );
    SubLFiles.declareFunction( me, "remove_recurring_query_schedule", "REMOVE-RECURRING-QUERY-SCHEDULE", 2, 2, false );
    SubLFiles.declareFunction( me, "remove_single_query_schedule", "REMOVE-SINGLE-QUERY-SCHEDULE", 2, 2, false );
    SubLFiles.declareFunction( me, "scheduled_query_series_type", "SCHEDULED-QUERY-SERIES-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_series_scheduler", "GET-SERIES-SCHEDULER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_query_scheduling_mt", "GET-QUERY-SCHEDULING-MT", 0, 2, false );
    SubLFiles.declareFunction( me, "get_cached_results_for_cycl_query", "GET-CACHED-RESULTS-FOR-CYCL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_reified_inference_answer_count", "GET-REIFIED-INFERENCE-ANSWER-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_schedules_for_cycl_query", "GET-SCHEDULES-FOR-CYCL-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_queue", "SCHEDULED-QUERY-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "get_scheduled_query_queue", "GET-SCHEDULED-QUERY-QUEUE", 0, 2, false );
    SubLFiles.declareFunction( me, "clear_scheduled_query_queue", "CLEAR-SCHEDULED-QUERY-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_plist", "SCHEDULED-QUERY-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "index_scheduled_query", "INDEX-SCHEDULED-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_scheduled_query", "LOOKUP-SCHEDULED-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_p", "SCHEDULED-QUERY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_kbq", "SCHEDULED-QUERY-KBQ", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_scheduled_run_time", "SCHEDULED-QUERY-SCHEDULED-RUN-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_instance", "SCHEDULED-QUERY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "package_scheduled_query", "PACKAGE-SCHEDULED-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_query_or_series_from_queue", "REMOVE-QUERY-OR-SERIES-FROM-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "enqueue_scheduled_query", "ENQUEUE-SCHEDULED-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "dequeue_scheduled_query", "DEQUEUE-SCHEDULED-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "next_scheduled_query", "NEXT-SCHEDULED-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "populate_scheduled_query_queue", "POPULATE-SCHEDULED-QUERY-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "schedule_query", "SCHEDULE-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "add_scheduled_query", "ADD-SCHEDULED-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "find_next_scheduled_time", "FIND-NEXT-SCHEDULED-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "find_next_scheduled_date", "FIND-NEXT-SCHEDULED-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "next_run_date_for_query_series", "NEXT-RUN-DATE-FOR-QUERY-SERIES", 2, 0, false );
    SubLFiles.declareFunction( me, "scheduled_run_date_for_query", "SCHEDULED-RUN-DATE-FOR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_for_query_event_or_series", "KBQ-FOR-QUERY-EVENT-OR-SERIES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_currently_running_scheduled_queries", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES", 0, 2, false );
    SubLFiles.declareFunction( me, "get_currently_running_scheduled_queries_internal", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_problem_store_inferences_plists", "SCHEDULED-QUERY-PROBLEM-STORE-INFERENCES-PLISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_inference_plist", "SCHEDULED-QUERY-INFERENCE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "abort_scheduled_query", "ABORT-SCHEDULED-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "abort_active_scheduled_queries", "ABORT-ACTIVE-SCHEDULED-QUERIES", 0, 0, false );
    SubLFiles.declareFunction( me, "abort_scheduled_query_internal", "ABORT-SCHEDULED-QUERY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "should_skipXabort_scheduled_queryP", "SHOULD-SKIP/ABORT-SCHEDULED-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "note_scheduled_query_in_progress", "NOTE-SCHEDULED-QUERY-IN-PROGRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "note_scheduled_query_finished_running", "NOTE-SCHEDULED-QUERY-FINISHED-RUNNING", 1, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_in_progressP", "SCHEDULED-QUERY-IN-PROGRESS?", 1, 0, false );
    SubLFiles.declareFunction( me, "run_packaged_scheduled_query", "RUN-PACKAGED-SCHEDULED-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "cleanup_scheduled_query", "CLEANUP-SCHEDULED-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "run_scheduled_query_internal", "RUN-SCHEDULED-QUERY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_mime_type_for_delimiter", "GET-MIME-TYPE-FOR-DELIMITER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_subl_character", "GET-SUBL-CHARACTER", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_email_scheduled_query_results", "MAYBE-EMAIL-SCHEDULED-QUERY-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "results_should_be_emailed_to_address", "RESULTS-SHOULD-BE-EMAILED-TO-ADDRESS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_email_recipients_for_scheduled_query_results", "GET-EMAIL-RECIPIENTS-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_email_cc_for_scheduled_query_results", "GET-EMAIL-CC-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scheduled_query_results_message", "GET-SCHEDULED-QUERY-RESULTS-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scheduled_query_results_subject", "GET-SCHEDULED-QUERY-RESULTS-SUBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "extension_for_delimiter", "EXTENSION-FOR-DELIMITER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scheduled_report_results_subject", "GET-SCHEDULED-REPORT-RESULTS-SUBJECT", 3, 0, false );
    SubLFiles.declareMacro( me, "do_smtp_accounts_for_cyclist", "DO-SMTP-ACCOUNTS-FOR-CYCLIST" );
    SubLFiles.declareFunction( me, "try_to_email_scheduled_query_results", "TRY-TO-EMAIL-SCHEDULED-QUERY-RESULTS", 5, 0, false );
    SubLFiles.declareFunction( me, "email_scheduled_query_results", "EMAIL-SCHEDULED-QUERY-RESULTS", 6, 0, false );
    SubLFiles.declareFunction( me, "reify_scheduled_query_in_series", "REIFY-SCHEDULED-QUERY-IN-SERIES", 2, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_series_query_type", "SCHEDULED-QUERY-SERIES-QUERY-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "run_scheduled_query", "RUN-SCHEDULED-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_problem_store_directory", "SCHEDULED-QUERY-PROBLEM-STORE-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "new_path_for_scheduled_query_problem_store", "NEW-PATH-FOR-SCHEDULED-QUERY-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "start_scheduled_query_processing_internal", "START-SCHEDULED-QUERY-PROCESSING-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "set_scheduled_query_image_flag", "SET-SCHEDULED-QUERY-IMAGE-FLAG", 1, 0, false );
    SubLFiles.declareFunction( me, "find_possible_scheduled_query_daemon_images", "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES", 0, 0, false );
    SubLFiles.declareFunction( me, "run_scheduled_queries_on_this_imageP", "RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_scheduled_query_daemon_is_running", "ENSURE-SCHEDULED-QUERY-DAEMON-IS-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "launch_scheduled_query_runner", "LAUNCH-SCHEDULED-QUERY-RUNNER", 1, 0, false );
    SubLFiles.declareFunction( me, "launch_scheduled_query_daemon", "LAUNCH-SCHEDULED-QUERY-DAEMON", 0, 0, false );
    SubLFiles.declareFunction( me, "run_scheduled_queries", "RUN-SCHEDULED-QUERIES", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_run_next_scheduled_query", "MAYBE-RUN-NEXT-SCHEDULED-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "sqd_note_new_fort", "SQD-NOTE-NEW-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqd_cleanup_new_forts", "SQD-CLEANUP-NEW-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "scheduled_query_test_query", "SCHEDULED-QUERY-TEST-QUERY", 0, 0, false );
    SubLFiles.declareMacro( me, "with_sqd_timeout", "WITH-SQD-TIMEOUT" );
    SubLFiles.declareFunction( me, "start_daemon_and_schedule_query_once", "START-DAEMON-AND-SCHEDULE-QUERY-ONCE", 0, 2, false );
    SubLFiles.declareFunction( me, "schedule_test_query_and_wait_for_results", "SCHEDULE-TEST-QUERY-AND-WAIT-FOR-RESULTS", 0, 2, false );
    SubLFiles.declareFunction( me, "schedule_query_once_and_start_daemon", "SCHEDULE-QUERY-ONCE-AND-START-DAEMON", 0, 2, false );
    SubLFiles.declareFunction( me, "start_daemon_and_stop_receiving", "START-DAEMON-AND-STOP-RECEIVING", 0, 0, false );
    SubLFiles.declareFunction( me, "schedule_query_and_wait_for_processing", "SCHEDULE-QUERY-AND-WAIT-FOR-PROCESSING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_scheduled_query_results", "GET-SCHEDULED-QUERY-RESULTS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_scheduled_queries_file()
  {
    $scheduled_query_queue$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-QUEUE*", $kw71$UNINITIALIZED );
    $scheduled_query_queue_lock$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-QUEUE-LOCK*", Locks.make_lock( $str74$Scheduled_Query_Queue_Lock ) );
    $ut_offset_to_unix_time$ = SubLFiles.deflexical( "*UT-OFFSET-TO-UNIX-TIME*", $int75$2208988800 );
    $scheduled_query_index$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-INDEX*", maybeDefault( $sym99$_SCHEDULED_QUERY_INDEX_, $scheduled_query_index$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    $in_progress_queries$ = SubLFiles.deflexical( "*IN-PROGRESS-QUERIES*", NIL );
    $completed_queries$ = SubLFiles.deflexical( "*COMPLETED-QUERIES*", NIL );
    $max_number_of_simultaneous_scheduled_queries$ = SubLFiles.deflexical( "*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*", ( maybeDefault( $sym113$_MAX_NUMBER_OF_SIMULTANEOUS_SCHEDULED_QUERIES_,
        $max_number_of_simultaneous_scheduled_queries$, ONE_INTEGER ) ) );
    $active_scheduled_queries$ = SubLFiles.deflexical( "*ACTIVE-SCHEDULED-QUERIES*", ( maybeDefault( $sym114$_ACTIVE_SCHEDULED_QUERIES_, $active_scheduled_queries$, NIL ) ) );
    $aborted_scheduled_queries$ = SubLFiles.deflexical( "*ABORTED-SCHEDULED-QUERIES*", ( maybeDefault( $sym123$_ABORTED_SCHEDULED_QUERIES_, $aborted_scheduled_queries$, NIL ) ) );
    $scheduled_query_cleanup_lock$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-CLEANUP-LOCK*", Locks.make_lock( $str128$Scheduled_Query_Cleanup_Lock ) );
    $scheduled_query_results_message_template$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*", $str136$The_following_query_has_been_run_ );
    $scheduled_query_daemon$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-DAEMON*", maybeDefault( $sym187$_SCHEDULED_QUERY_DAEMON_, $scheduled_query_daemon$, () -> ( misc_utilities.uninitialized() ) ) );
    $scheduled_query_computer_info_mt$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-COMPUTER-INFO-MT*", $const188$QuerySchedulerDaemonComputersMt );
    $run_scheduled_queries_on_this_imageP$ = SubLFiles.deflexical( "*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*", ( maybeDefault( $sym189$_RUN_SCHEDULED_QUERIES_ON_THIS_IMAGE__, $run_scheduled_queries_on_this_imageP$,
        NIL ) ) );
    $scheduled_query_runner_isg$ = SubLFiles.deflexical( "*SCHEDULED-QUERY-RUNNER-ISG*", integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    $sqd_new_forts_to_cleanup$ = SubLFiles.defparameter( "*SQD-NEW-FORTS-TO-CLEANUP*", misc_utilities.uninitialized() );
    return NIL;
  }

  public static SubLObject setup_scheduled_queries_file()
  {
    access_macros.register_external_symbol( $sym5$ADD_RECURRING_QUERY_SCHEDULE );
    access_macros.register_external_symbol( $sym19$ADD_SINGLE_QUERY_SCHEDULE );
    access_macros.register_external_symbol( $sym28$REMOVE_RECURRING_QUERY_SCHEDULE );
    access_macros.register_external_symbol( $sym32$REMOVE_SINGLE_QUERY_SCHEDULE );
    access_macros.register_external_symbol( $sym47$GET_CACHED_RESULTS_FOR_CYCL_QUERY );
    access_macros.register_external_symbol( $sym64$GET_SCHEDULES_FOR_CYCL_QUERY );
    access_macros.register_external_symbol( $sym76$GET_SCHEDULED_QUERY_QUEUE );
    subl_macro_promotions.declare_defglobal( $sym99$_SCHEDULED_QUERY_INDEX_ );
    utilities_macros.register_kb_function( $sym107$ADD_SCHEDULED_QUERY );
    subl_macro_promotions.declare_defglobal( $sym113$_MAX_NUMBER_OF_SIMULTANEOUS_SCHEDULED_QUERIES_ );
    subl_macro_promotions.declare_defglobal( $sym114$_ACTIVE_SCHEDULED_QUERIES_ );
    access_macros.register_external_symbol( $sym115$GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES );
    subl_macro_promotions.declare_defglobal( $sym123$_ABORTED_SCHEDULED_QUERIES_ );
    access_macros.register_external_symbol( $sym124$ABORT_SCHEDULED_QUERY );
    subl_macro_promotions.declare_defglobal( $sym187$_SCHEDULED_QUERY_DAEMON_ );
    subl_macro_promotions.declare_defglobal( $sym189$_RUN_SCHEDULED_QUERIES_ON_THIS_IMAGE__ );
    access_macros.register_external_symbol( $sym193$FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES );
    generic_testing.define_test_case_table_int( $sym199$START_DAEMON_AND_SCHEDULE_QUERY_ONCE, ConsesLow.list( new SubLObject[] { $kw200$TEST, $sym201$TREE_MATCHES_PATTERN, $kw202$OWNER, NIL, $kw203$CLASSES, $list204,
      $kw205$KB, $kw206$FULL, $kw207$WORKING_, NIL
    } ), $list208 );
    generic_testing.define_test_case_table_int( $sym209$SCHEDULE_QUERY_ONCE_AND_START_DAEMON, ConsesLow.list( new SubLObject[] { $kw200$TEST, $sym201$TREE_MATCHES_PATTERN, $kw202$OWNER, NIL, $kw203$CLASSES, $list204,
      $kw205$KB, $kw206$FULL, $kw207$WORKING_, NIL
    } ), $list208 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_scheduled_queries_file();
  }

  @Override
  public void initializeVariables()
  {
    init_scheduled_queries_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_scheduled_queries_file();
  }
}