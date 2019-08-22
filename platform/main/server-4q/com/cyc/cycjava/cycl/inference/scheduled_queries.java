package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_list_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_items;
import static com.cyc.cycjava.cycl.el_utilities.el_set_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_unquote;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cae_query_search;
import com.cyc.cycjava.cycl.cfasl_kernel;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
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
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transform_list_utilities;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class scheduled_queries extends SubLTranslatedFile {
    public static final SubLFile me = new scheduled_queries();

    public static final String myName = "com.cyc.cycjava.cycl.inference.scheduled_queries";

    public static final String myFingerPrint = "2c03141e7eea0a4a2b5b028a926d2f3494778309b0498b1d514a0f263eea0bf2";

    // deflexical
    /**
     * Priority queue of kb-queries to be run, annotated with the next time they
     * should be run.
     */
    private static final SubLSymbol $scheduled_query_queue$ = makeSymbol("*SCHEDULED-QUERY-QUEUE*");

    // deflexical
    private static final SubLSymbol $scheduled_query_queue_lock$ = makeSymbol("*SCHEDULED-QUERY-QUEUE-LOCK*");

    // deflexical
    private static final SubLSymbol $ut_offset_to_unix_time$ = makeSymbol("*UT-OFFSET-TO-UNIX-TIME*");



    // deflexical
    // LISTP of KBQs currently running or being prepared for running.
    private static final SubLSymbol $in_progress_queries$ = makeSymbol("*IN-PROGRESS-QUERIES*");

    // deflexical
    private static final SubLSymbol $completed_queries$ = makeSymbol("*COMPLETED-QUERIES*");







    // deflexical
    private static final SubLSymbol $scheduled_query_cleanup_lock$ = makeSymbol("*SCHEDULED-QUERY-CLEANUP-LOCK*");

    // deflexical
    private static final SubLSymbol $scheduled_query_results_message_template$ = makeSymbol("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*");



    // deflexical
    private static final SubLSymbol $scheduled_query_computer_info_mt$ = makeSymbol("*SCHEDULED-QUERY-COMPUTER-INFO-MT*");

    // deflexical
    private static final SubLSymbol $run_scheduled_queries_on_this_imageP$ = makeSymbol("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*");

    // deflexical
    private static final SubLSymbol $scheduled_query_runner_isg$ = makeSymbol("*SCHEDULED-QUERY-RUNNER-ISG*");

    // defparameter
    private static final SubLSymbol $sqd_new_forts_to_cleanup$ = makeSymbol("*SQD-NEW-FORTS-TO-CLEANUP*");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLString $str1$__Scheduling_test_query_____ = makeString("~&Scheduling test query...~%");

    public static final SubLString $str2$__Timed_out_after__D_seconds___ = makeString("~&Timed out after ~D seconds.~%");

    public static final SubLString $str3$Failed_to_get_test_query_results_ = makeString("Failed to get test query results.");

    public static final SubLString $str4$__Got_results___S__ = makeString("~&Got results: ~S~%");

    public static final SubLSymbol ADD_RECURRING_QUERY_SCHEDULE = makeSymbol("ADD-RECURRING-QUERY-SCHEDULE");







    public static final SubLString $$$ScheduledQuerySeries = makeString("ScheduledQuerySeries");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLList $list12 = list(reader_make_constant_shell(makeString("PeriodicEventSeries")), reader_make_constant_shell(makeString("PurposefulAction")));

    private static final SubLObject $const13$resultsShouldBeEmailedToAddress_C = reader_make_constant_shell(makeString("resultsShouldBeEmailedToAddress-CC"));

    public static final SubLList $list14 = list(reader_make_constant_shell(makeString("InformationGathering")));

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLObject $$intervalTypeOfPeriodicSeries = reader_make_constant_shell(makeString("intervalTypeOfPeriodicSeries"));

    private static final SubLObject $$ScheduledQueryDaemon = reader_make_constant_shell(makeString("ScheduledQueryDaemon"));

    private static final SubLObject $$querySchedulingComplete = reader_make_constant_shell(makeString("querySchedulingComplete"));

    public static final SubLSymbol ADD_SINGLE_QUERY_SCHEDULE = makeSymbol("ADD-SINGLE-QUERY-SCHEDULE");

    public static final SubLString $$$ScheduledQuery = makeString("ScheduledQuery");

    public static final SubLList $list21 = list(reader_make_constant_shell(makeString("CycQueryRunning")), reader_make_constant_shell(makeString("ScheduledAction")));

    private static final SubLObject $$ScheduledFn = reader_make_constant_shell(makeString("ScheduledFn"));

    private static final SubLObject $$CycQueryRunningFromFn = reader_make_constant_shell(makeString("CycQueryRunningFromFn"));

    private static final SubLObject $$scheduledStartingDate = reader_make_constant_shell(makeString("scheduledStartingDate"));

    private static final SubLObject $$directingAgent = reader_make_constant_shell(makeString("directingAgent"));

    public static final SubLList $list26 = list(reader_make_constant_shell(makeString("ScheduledQueryDaemon")));

    private static final SubLObject $$scheduledBy = reader_make_constant_shell(makeString("scheduledBy"));

    public static final SubLSymbol REMOVE_RECURRING_QUERY_SCHEDULE = makeSymbol("REMOVE-RECURRING-QUERY-SCHEDULE");

    public static final SubLList $list29 = list(makeSymbol("THIS-CYCLIST"), makeSymbol("QUERY-SERIES"), makeSymbol("THIS-INTERVAL-TYPE"), makeSymbol("THIS-TASK"));

    private static final SubLObject $$KBQ_FindScheduledQuerySeries = reader_make_constant_shell(makeString("KBQ-FindScheduledQuerySeries"));

    public static final SubLList $list31 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?CYCLIST"), makeSymbol("?SERIES"), makeSymbol("?INTERVAL-TYPE"), makeSymbol("?TASK"))));

    public static final SubLSymbol REMOVE_SINGLE_QUERY_SCHEDULE = makeSymbol("REMOVE-SINGLE-QUERY-SCHEDULE");

    public static final SubLList $list33 = list(makeSymbol("THIS-CYCLIST"), makeSymbol("QUERY-EVENT"), makeSymbol("THIS-DATE"), makeSymbol("THIS-TASK"));

    private static final SubLObject $$KBQ_FindScheduledQueries = reader_make_constant_shell(makeString("KBQ-FindScheduledQueries"));

    public static final SubLList $list35 = list(makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list(makeSymbol("?CYCLIST"), makeSymbol("?QUERY-EVENT"), makeSymbol("?DATE"), makeSymbol("?TASK"))));

    private static final SubLObject $$SeriesOfTypeFn = reader_make_constant_shell(makeString("SeriesOfTypeFn"));

    private static final SubLObject $$SubcollectionOfWithRelationToFn = reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn"));

    public static final SubLList $list38 = list(reader_make_constant_shell(makeString("directingAgent")), reader_make_constant_shell(makeString("ScheduledQueryDaemon")));



    public static final SubLList $list40 = list(makeKeyword("BIND"), makeSymbol("THIS-SCHEDULER"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLSymbol THIS_SCHEDULER = makeSymbol("THIS-SCHEDULER");

    private static final SubLObject $$ModelMtByUserAndTaskFn = reader_make_constant_shell(makeString("ModelMtByUserAndTaskFn"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLSymbol GET_CACHED_RESULTS_FOR_CYCL_QUERY = makeSymbol("GET-CACHED-RESULTS-FOR-CYCL-QUERY");

    private static final SubLObject $$queryInferences = reader_make_constant_shell(makeString("queryInferences"));

    private static final SubLObject $$inferenceStartTime = reader_make_constant_shell(makeString("inferenceStartTime"));

    private static final SubLObject $$cycProblemStoreInferences = reader_make_constant_shell(makeString("cycProblemStoreInferences"));

    private static final SubLObject $$problemStoreSnapshotPathnames = reader_make_constant_shell(makeString("problemStoreSnapshotPathnames"));

    public static final SubLString $$$_ = makeString(" ");





    private static final SubLSymbol $PROBLEM_STORE_FILE = makeKeyword("PROBLEM-STORE-FILE");

    public static final SubLSymbol $sym56$_COUNT = makeSymbol("?COUNT");

    private static final SubLObject $$inferenceAnswerCount = reader_make_constant_shell(makeString("inferenceAnswerCount"));

    public static final SubLList $list58 = list(makeSymbol("?COUNT"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLList $list60 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    public static final SubLSymbol $sym61$_BINDINGS = makeSymbol("?BINDINGS");

    private static final SubLObject $$inferenceBindings = reader_make_constant_shell(makeString("inferenceBindings"));

    public static final SubLList $list63 = list(makeSymbol("?BINDINGS"));

    public static final SubLSymbol GET_SCHEDULES_FOR_CYCL_QUERY = makeSymbol("GET-SCHEDULES-FOR-CYCL-QUERY");

    private static final SubLObject $$scheduledQuerySpecification = reader_make_constant_shell(makeString("scheduledQuerySpecification"));

    private static final SubLSymbol $NEXT_RUN_DATE = makeKeyword("NEXT-RUN-DATE");

    private static final SubLObject $$Series = reader_make_constant_shell(makeString("Series"));



    public static final SubLList $list69 = list(reader_make_constant_shell(makeString("resultsShouldBeEmailedToAddress-CC")));

    public static final SubLList $list70 = list(makeKeyword("EMAIL-RECIPIENTS"), makeKeyword("EMAIL-CC"));



    private static final SubLSymbol SCHEDULED_QUERY_SCHEDULED_RUN_TIME = makeSymbol("SCHEDULED-QUERY-SCHEDULED-RUN-TIME");

    private static final SubLString $str73$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLString $$$Scheduled_Query_Queue_Lock = makeString("Scheduled Query Queue Lock");

    private static final SubLInteger $int$2208988800 = makeInteger("2208988800");

    private static final SubLSymbol GET_SCHEDULED_QUERY_QUEUE = makeSymbol("GET-SCHEDULED-QUERY-QUEUE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list79 = list(makeSymbol("GET-SCHEDULED-QUERY-QUEUE"), NIL, NIL);

    private static final SubLSymbol $sym80$INVALID_FORT_ = makeSymbol("INVALID-FORT?");









    private static final SubLSymbol $SCHEDULED_RUN_TIME_UNIVERSAL = makeKeyword("SCHEDULED-RUN-TIME-UNIVERSAL");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_UNIX = makeKeyword("SCHEDULED-RUN-TIME-UNIX");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_CYCL = makeKeyword("SCHEDULED-RUN-TIME-CYCL");

    private static final SubLSymbol $SCHEDULED_RUN_TIME_DECODED = makeKeyword("SCHEDULED-RUN-TIME-DECODED");











    private static final SubLObject $$scheduledReportSpecification = reader_make_constant_shell(makeString("scheduledReportSpecification"));

    private static final SubLObject $$reportSpecificationTemplate = reader_make_constant_shell(makeString("reportSpecificationTemplate"));





    private static final SubLSymbol $REPORT_TEMPLATE_GLOSS = makeKeyword("REPORT-TEMPLATE-GLOSS");

    private static final SubLSymbol $scheduled_query_index$ = makeSymbol("*SCHEDULED-QUERY-INDEX*");

    private static final SubLSymbol SCHEDULED_QUERY_P = makeSymbol("SCHEDULED-QUERY-P");





    private static final SubLList $list103 = list(makeSymbol("SCHEDULED-QUERY"), makeSymbol("KBQ"));

    private static final SubLObject $$KBQ_FindOneTimeScheduledQueries = reader_make_constant_shell(makeString("KBQ-FindOneTimeScheduledQueries"));

    private static final SubLList $list105 = list(makeSymbol("SCHEDULED-QUERY-SERIES"), makeSymbol("KBQ"));

    private static final SubLObject $$KBQ_FindRepeatingScheduledQueries = reader_make_constant_shell(makeString("KBQ-FindRepeatingScheduledQueries"));

    private static final SubLSymbol ADD_SCHEDULED_QUERY = makeSymbol("ADD-SCHEDULED-QUERY");

    private static final SubLList $list108 = list(reader_make_constant_shell(makeString("DaysDuration")), SEVEN_INTEGER);

    private static final SubLObject $const109$KBQ_FindNextFutureStartDateForQue = reader_make_constant_shell(makeString("KBQ-FindNextFutureStartDateForQueryInSeries"));

    private static final SubLObject $const110$KBQ_FindNextStartDateForQueryInSe = reader_make_constant_shell(makeString("KBQ-FindNextStartDateForQueryInSeries"));

    private static final SubLObject $const111$KBQ_FindStartDateForScheduledQuer = reader_make_constant_shell(makeString("KBQ-FindStartDateForScheduledQuery"));

    private static final SubLObject $$KBQ_FindScheduledKBQ = reader_make_constant_shell(makeString("KBQ-FindScheduledKBQ"));

    private static final SubLSymbol $max_number_of_simultaneous_scheduled_queries$ = makeSymbol("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*");

    private static final SubLSymbol $active_scheduled_queries$ = makeSymbol("*ACTIVE-SCHEDULED-QUERIES*");

    private static final SubLSymbol GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES = makeSymbol("GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES");

    private static final SubLList $list116 = cons(makeSymbol("PACKAGED-QUERY"), makeSymbol("PROBLEM-STORE"));

    private static final SubLSymbol $PROBLEM_STORE_ID = makeKeyword("PROBLEM-STORE-ID");







    private static final SubLSymbol $TIME_SO_FAR = makeKeyword("TIME-SO-FAR");



    private static final SubLSymbol $aborted_scheduled_queries$ = makeSymbol("*ABORTED-SCHEDULED-QUERIES*");

    private static final SubLSymbol ABORT_SCHEDULED_QUERY = makeSymbol("ABORT-SCHEDULED-QUERY");

    private static final SubLSymbol VALID_PROBLEM_STORE_P = makeSymbol("VALID-PROBLEM-STORE-P");



    private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

    private static final SubLString $$$Scheduled_Query_Cleanup_Lock = makeString("Scheduled Query Cleanup Lock");

    private static final SubLObject $$inferenceDatastructure = reader_make_constant_shell(makeString("inferenceDatastructure"));

    private static final SubLString $str130$text_csv = makeString("text/csv");

    private static final SubLString $str131$text_tsv = makeString("text/tsv");

    private static final SubLString $str132$text_plain = makeString("text/plain");



    private static final SubLList $list134 = list(reader_make_constant_shell(makeString("stringVersionOfCharacter")), reader_make_constant_shell(makeString("termStrings")));

    private static final SubLString $str135$6cb141db_9948_4a5b_b7ae_a86899c41 = makeString("6cb141db-9948-4a5b-b7ae-a86899c41036");

    private static final SubLString $str136$The_following_query_has_been_run_ = makeString("The following query has been run:\n\nName: ~S\nParaphrase: ~S\nResults: ~D~%");

    private static final SubLObject $$KBQ_FindGlossForScheduledQuery = reader_make_constant_shell(makeString("KBQ-FindGlossForScheduledQuery"));

    private static final SubLObject $$KBQ_FindFormulaForScheduledQuery = reader_make_constant_shell(makeString("KBQ-FindFormulaForScheduledQuery"));



    private static final SubLString $str140$Scheduled_Query_Results__ = makeString("Scheduled Query Results: ");

    private static final SubLString $$$_answers_for_ = makeString(" answers for ");

    private static final SubLString $$$tsv = makeString("tsv");

    private static final SubLString $$$csv = makeString("csv");

    private static final SubLString $$$txt = makeString("txt");

    private static final SubLString $$$Report_run_successfully = makeString("Report run successfully");

    private static final SubLString $str146$Report_generation_failed__ = makeString("Report generation failed (");

    private static final SubLString $str147$_problems_ = makeString(" problems)");

    public static final SubLList $list148 = list(list(makeSymbol("CYCLIST"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list149 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym152$EL_LIST = makeUninternedSymbol("EL-LIST");

    private static final SubLSymbol $sym153$SMTP_ACCOUNT = makeUninternedSymbol("SMTP-ACCOUNT");

    private static final SubLSymbol $sym154$INFO = makeUninternedSymbol("INFO");



    private static final SubLSymbol NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ = makeSymbol("NEW-CYC-QUERY-FROM-INDEXICALIZED-KBQ");

    private static final SubLObject $$KBQ_FindSMTPAccountsForCyclist = reader_make_constant_shell(makeString("KBQ-FindSMTPAccountsForCyclist"));



    private static final SubLObject $$KBQ_FindSMTPInfoForAccount = reader_make_constant_shell(makeString("KBQ-FindSMTPInfoForAccount"));



    private static final SubLList $list161 = cons(makeSymbol("PORT"), makeSymbol("HOST"));

    private static final SubLString $str162$scheduled_query_daemon_cyc_com = makeString("scheduled-query-daemon@cyc.com");

    private static final SubLObject $$seriesMembers = reader_make_constant_shell(makeString("seriesMembers"));

    private static final SubLObject $$CycQueryRunning = reader_make_constant_shell(makeString("CycQueryRunning"));











    private static final SubLString $str170$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str175$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str176$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str177$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLObject $$seriesOfType = reader_make_constant_shell(makeString("seriesOfType"));

    private static final SubLString $str179$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");





    private static final SubLString $str182$data_problem_stores_ = makeString("data/problem-stores/");

    private static final SubLString $$$0775 = makeString("0775");

    private static final SubLString $str184$_ = makeString("/");

    private static final SubLString $str185$store_ = makeString("store-");

    private static final SubLString $str186$_cfasl = makeString(".cfasl");

    private static final SubLSymbol $scheduled_query_daemon$ = makeSymbol("*SCHEDULED-QUERY-DAEMON*");

    private static final SubLObject $$QuerySchedulerDaemonComputersMt = reader_make_constant_shell(makeString("QuerySchedulerDaemonComputersMt"));

    private static final SubLSymbol $sym189$_RUN_SCHEDULED_QUERIES_ON_THIS_IMAGE__ = makeSymbol("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*");

    private static final SubLObject $$programOnPort = reader_make_constant_shell(makeString("programOnPort"));

    private static final SubLObject $$ScheduledQueryDaemon_CW = reader_make_constant_shell(makeString("ScheduledQueryDaemon-CW"));

    private static final SubLObject $$CFASLProtocol = reader_make_constant_shell(makeString("CFASLProtocol"));

    private static final SubLSymbol FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES = makeSymbol("FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES");

    private static final SubLObject $$FindRunningScheduledQueryDaemons = reader_make_constant_shell(makeString("FindRunningScheduledQueryDaemons"));

    private static final SubLString $$$Scheduled_Query_Runner_ = makeString("Scheduled Query Runner ");

    private static final SubLSymbol RUN_PACKAGED_SCHEDULED_QUERY = makeSymbol("RUN-PACKAGED-SCHEDULED-QUERY");

    private static final SubLString $$$Scheduled_Query_Daemon = makeString("Scheduled Query Daemon");

    private static final SubLSymbol RUN_SCHEDULED_QUERIES = makeSymbol("RUN-SCHEDULED-QUERIES");

    private static final SubLSymbol START_DAEMON_AND_SCHEDULE_QUERY_ONCE = makeSymbol("START-DAEMON-AND-SCHEDULE-QUERY-ONCE");



    private static final SubLSymbol TREE_MATCHES_PATTERN = makeSymbol("TREE-MATCHES-PATTERN");





    private static final SubLList $list204 = list(makeSymbol("SCHEDULED-QUERY-TEST-CASE-TABLES"));







    private static final SubLList $list208 = list(list(NIL, list(list(makeKeyword("DATE"), makeKeyword("ANYTHING"), makeKeyword("ANSWER-COUNT"), ONE_INTEGER, makeKeyword("PROBLEM-STORE-FILE"), makeKeyword("ANYTHING")))));

    private static final SubLSymbol SCHEDULE_QUERY_ONCE_AND_START_DAEMON = makeSymbol("SCHEDULE-QUERY-ONCE-AND-START-DAEMON");

    private static final SubLList $list210 = list(reader_make_constant_shell(makeString("TestQueryFn")), reader_make_constant_shell(makeString("CST-WhatIsNegativeThreePlusFive")));

    private static final SubLString $str211$Couldn_t_find_valid_test_query__S = makeString("Couldn't find valid test query ~S");

    private static final SubLList $list212 = list(list(makeSymbol("TIMEOUT"), makeSymbol("TIMED-OUT?")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list215 = list(list(makeSymbol("*SQD-NEW-FORTS-TO-CLEANUP*"), list(makeSymbol("CREATE-QUEUE"))));





    private static final SubLList $list218 = list(list(makeSymbol("SQD-CLEANUP-NEW-FORTS")));

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLString $str220$___D_existing_result__P___S___D_n = makeString("~&~D existing result~:P: ~S~%~D new result~:P: ~S~%");

    private static final SubLString $str221$Timed_out_after__S_second__P_duri = makeString("Timed out after ~S second~:P during START-DAEMON-AND-SCHEDULE-QUERY-ONCE.");

    private static final SubLString $str222$__Finished_START_DAEMON_AND_SCHED = makeString("~&Finished START-DAEMON-AND-SCHEDULE-QUERY-ONCE in ~A.~%");

    private static final SubLString $str223$Timed_out_after__S_second__P_duri = makeString("Timed out after ~S second~:P during SCHEDULE-QUERY-ONCE-AND-START-DAEMON");

    private static final SubLString $str224$__Finished_SCHEDULE_QUERY_ONCE_AN = makeString("~&Finished SCHEDULE-QUERY-ONCE-AND-START-DAEMON in ~A.~%");

    private static final SubLString $$$no = makeString("no");

    private static final SubLObject $$ScheduledQueryTesting_Allotment = reader_make_constant_shell(makeString("ScheduledQueryTesting-Allotment"));

    

    public static SubLObject start_scheduled_query_processing(SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = $int$30;
        }
        final SubLObject queue_size = start_scheduled_query_processing_internal();
        maybe_verify_test_query(timeout);
        return queue_size;
    }

    public static SubLObject maybe_verify_test_query(final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format_nil.force_format(T, $str1$__Scheduling_test_query_____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject kbq = scheduled_query_test_query();
        if (NIL != forts.valid_fortP(kbq)) {
            thread.resetMultipleValues();
            final SubLObject results = schedule_test_query_and_wait_for_results(kbq, timeout);
            final SubLObject timed_outP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != timed_outP) {
                format_nil.force_format(T, $str2$__Timed_out_after__D_seconds___, timeout, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == results)) {
                Errors.error($str3$Failed_to_get_test_query_results_);
            }
            format_nil.force_format(T, $str4$__Got_results___S__, results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject halt_scheduled_query_processing() {
        set_scheduled_query_image_flag(NIL);
        clear_scheduled_query_queue();
        return NIL;
    }

    public static SubLObject add_recurring_query_schedule(final SubLObject query, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        assert NIL != indexed_term_p(query) : "kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) " + query;
        SubLObject list_var = email_recipients;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        list_var = email_carbon_copies;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        cdolist_list_var = list_var;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject series = make_recurring_query_schedule_assertions(query, interval_type, email_recipients, email_carbon_copies, cyclist, task);
        if (NIL != series) {
            note_query_scheduling_complete(series);
        }
        return series;
    }

    public static SubLObject make_recurring_query_schedule_assertions(final SubLObject query, final SubLObject interval_type, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = get_query_scheduling_mt(cyclist, task);
        final SubLObject series = ke.ke_create_now($$$ScheduledQuerySeries, UNPROVIDED);
        SubLObject failP = sublisp_null(series);
        sqd_note_new_fort(series);
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            SubLObject cdolist_list_var = $list12;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert_now(list($$isa, series, v_isa), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
            cdolist_list_var = email_recipients;
            SubLObject recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert_now(list(results_should_be_emailed_to_address(), series, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = email_carbon_copies;
            recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert_now(list($const13$resultsShouldBeEmailedToAddress_C, series, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = list(list($$isa, series, scheduled_query_series_type(query, cyclist)), listS($$isa, series, $list14), list($$definingMt, series, mt), list($$intervalTypeOfPeriodicSeries, series, interval_type));
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                    failP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL != failP ? NIL : series;
    }

    public static SubLObject note_query_scheduling_complete(final SubLObject event_or_series) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failP = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
            if (NIL == ke.ke_assert_now(list($$querySchedulingComplete, event_or_series), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                failP = T;
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject add_single_query_schedule(final SubLObject query, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        assert NIL != indexed_term_p(query) : "kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) " + query;
        SubLObject list_var = email_recipients;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        list_var = email_carbon_copies;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        cdolist_list_var = list_var;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject event = make_single_query_schedule_assertions(query, date, email_recipients, email_carbon_copies, cyclist, task);
        if (NIL != event) {
            note_query_scheduling_complete(event);
        }
        return event;
    }

    public static SubLObject make_single_query_schedule_assertions(final SubLObject query, final SubLObject date, SubLObject email_recipients, SubLObject email_carbon_copies, SubLObject cyclist, SubLObject task) {
        if (email_recipients == UNPROVIDED) {
            email_recipients = NIL;
        }
        if (email_carbon_copies == UNPROVIDED) {
            email_carbon_copies = NIL;
        }
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = get_query_scheduling_mt(cyclist, task);
        final SubLObject scheduled_query = ke.ke_create_now($$$ScheduledQuery, UNPROVIDED);
        SubLObject failP = sublisp_null(scheduled_query);
        sqd_note_new_fort(scheduled_query);
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist(cyclist);
            SubLObject cdolist_list_var = $list21;
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert_now(list($$isa, scheduled_query, v_isa), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
            cdolist_list_var = email_recipients;
            SubLObject recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert_now(list(results_should_be_emailed_to_address(), scheduled_query, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = email_carbon_copies;
            recpt = NIL;
            recpt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ke.ke_assert_now(list($const13$resultsShouldBeEmailedToAddress_C, scheduled_query, recpt), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                recpt = cdolist_list_var.first();
            } 
            cdolist_list_var = list(list($$isa, scheduled_query, list($$ScheduledFn, list($$CycQueryRunningFromFn, query))), list($$scheduledStartingDate, scheduled_query, date), list($$definingMt, scheduled_query, mt), listS($$directingAgent, scheduled_query, $list26), list($$scheduledBy, scheduled_query, cyclist));
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == ke.ke_assert_now(sentence, mt, UNPROVIDED, UNPROVIDED)) {
                    failP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return NIL != failP ? NIL : scheduled_query;
    }

    public static SubLObject remove_recurring_query_schedule(final SubLObject query, final SubLObject interval_type, SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) " + query;
        SubLObject cdolist_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindScheduledQuerySeries, query, $list31);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject this_cyclist = NIL;
            SubLObject query_series = NIL;
            SubLObject this_interval_type = NIL;
            SubLObject this_task = NIL;
            destructuring_bind_must_consp(current, datum, $list29);
            this_cyclist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            query_series = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            this_interval_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list29);
            this_task = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((this_cyclist.equal(cyclist) && this_task.equal(task)) && this_interval_type.equal(interval_type)) {
                    remove_query_or_series_from_queue(query_series);
                    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist(cyclist);
                        ke.ke_kill(query_series);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject remove_single_query_schedule(final SubLObject query, final SubLObject date, SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) " + query;
        SubLObject cdolist_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindScheduledQueries, query, $list35);
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject this_cyclist = NIL;
            SubLObject query_event = NIL;
            SubLObject this_date = NIL;
            SubLObject this_task = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            this_cyclist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list33);
            query_event = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list33);
            this_date = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list33);
            this_task = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((this_cyclist.equal(cyclist) && this_task.equal(task)) && this_date.equal(date)) {
                    remove_query_or_series_from_queue(query_event);
                    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(NIL, thread);
                        operation_communication.set_the_cyclist(cyclist);
                        ke.ke_kill(query_event);
                    } finally {
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject scheduled_query_series_type(final SubLObject query, final SubLObject cyclist) {
        return list($$SeriesOfTypeFn, listS($$SubcollectionOfWithRelationToFn, list($$SubcollectionOfWithRelationToFn, list($$ScheduledFn, list($$CycQueryRunningFromFn, query)), $$scheduledBy, cyclist), $list38));
    }

    public static SubLObject get_series_scheduler(final SubLObject series) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template = scheduled_query_series_type($ANYTHING, $list40);
        SubLObject scheduler = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject v_isa = NIL;
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(series, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(series, ONE_INTEGER, pred_var);
                SubLObject done_var = scheduler;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$1 = scheduler;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                if (NIL != valid_$3) {
                                    v_isa = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                    thread.resetMultipleValues();
                                    final SubLObject success = formula_pattern_match.formula_matches_pattern(cycl_utilities.hl_to_el(v_isa), template);
                                    final SubLObject v_bindings = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != success) {
                                        final SubLObject this_scheduler = scheduler = list_utilities.alist_lookup_without_values(v_bindings, THIS_SCHEDULER, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                                done_var_$1 = makeBoolean((NIL == valid_$3) || (NIL != scheduler));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != scheduler));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return scheduler;
    }

    public static SubLObject get_query_scheduling_mt(SubLObject cyclist, SubLObject task) {
        if (cyclist == UNPROVIDED) {
            cyclist = operation_communication.the_cyclist();
        }
        if (task == UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        if ((NIL != cyclist) && (NIL != task)) {
            return hlmt_czer.canonicalize_hlmt(make_binary_formula($$ModelMtByUserAndTaskFn, cyclist, task));
        }
        return $$BaseKB;
    }

    public static SubLObject get_cached_results_for_cycl_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) " + query;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject inference = NIL;
            final SubLObject pred_var = $$queryInferences;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$5 = NIL;
                            final SubLObject token_var_$6 = NIL;
                            while (NIL == done_var_$5) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(assertion));
                                if (NIL != valid_$7) {
                                    inference = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                    if (NIL != indexed_term_p(inference)) {
                                        final SubLObject start_time = kb_mapping_utilities.fpred_value(inference, $$inferenceStartTime, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        final SubLObject answer_count = get_reified_inference_answer_count(inference);
                                        final SubLObject problem_store = kb_mapping_utilities.fpred_value(inference, $$cycProblemStoreInferences, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                                        SubLObject path = NIL;
                                        SubLObject save_date = NIL;
                                        SubLObject date = NIL;
                                        if ((NIL != indexed_term_p(problem_store)) && answer_count.isInteger()) {
                                            SubLObject this_path = NIL;
                                            final SubLObject pred_var_$8 = $$problemStoreSnapshotPathnames;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(problem_store, NIL, pred_var_$8)) {
                                                final SubLObject iterator_var_$9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(problem_store, NIL, pred_var_$8);
                                                SubLObject done_var_$6 = NIL;
                                                final SubLObject token_var_$7 = NIL;
                                                while (NIL == done_var_$6) {
                                                    final SubLObject final_index_spec_$12 = iteration.iteration_next_without_values_macro_helper(iterator_var_$9, token_var_$7);
                                                    final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(final_index_spec_$12));
                                                    if (NIL != valid_$8) {
                                                        SubLObject final_index_iterator_$14 = NIL;
                                                        try {
                                                            final_index_iterator_$14 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$12, $GAF, NIL, NIL);
                                                            SubLObject done_var_$7 = NIL;
                                                            final SubLObject token_var_$8 = NIL;
                                                            while (NIL == done_var_$7) {
                                                                final SubLObject assertion_$17 = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$14, token_var_$8);
                                                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion_$17));
                                                                if (NIL != valid_$9) {
                                                                    this_path = assertions_high.gaf_arg(assertion_$17, TWO_INTEGER);
                                                                    if (NIL != file_utilities.file_existsP(this_path)) {
                                                                        final SubLObject file_write_date = Filesys.file_write_date(this_path);
                                                                        if (((NIL == path) || (NIL == save_date)) || ((NIL != file_write_date) && file_write_date.numL(save_date))) {
                                                                            path = this_path;
                                                                            save_date = file_write_date;
                                                                        }
                                                                    }
                                                                }
                                                                done_var_$7 = makeBoolean(NIL == valid_$9);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator_$14) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$14);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var_$6 = makeBoolean(NIL == valid_$8);
                                                } 
                                            }
                                            if (NIL != path) {
                                                final SubLObject utime = (NIL != save_date) ? save_date : NIL != start_time ? date_utilities.cycl_date_to_universal_time(start_time) : NIL;
                                                if (NIL != utime) {
                                                    date = cconcatenate(numeric_date_utilities.datestring(numeric_date_utilities.get_universal_date(utime, UNPROVIDED)), new SubLObject[]{ $$$_, numeric_date_utilities.secondstring(numeric_date_utilities.get_universal_second(utime)) });
                                                }
                                                ans = cons(list($DATE, date, $ANSWER_COUNT, answer_count, $PROBLEM_STORE_FILE, path), ans);
                                            }
                                        }
                                    }
                                }
                                done_var_$5 = makeBoolean(NIL == valid_$7);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject get_reified_inference_answer_count(final SubLObject inference) {
        SubLObject count = ask_utilities.query_variable($sym56$_COUNT, listS($$inferenceAnswerCount, inference, $list58), $$InferencePSC, $list60).first();
        if (NIL == count) {
            SubLObject csome_list_var;
            SubLObject v_bindings;
            for (csome_list_var = ask_utilities.query_variable($sym61$_BINDINGS, listS($$inferenceBindings, inference, $list63), $$InferencePSC, $list60), v_bindings = NIL, v_bindings = csome_list_var.first(); (NIL == count) && (NIL != csome_list_var); count = (NIL != el_set_p(v_bindings)) ? length(el_set_items(v_bindings)) : NIL , csome_list_var = csome_list_var.rest() , v_bindings = csome_list_var.first()) {
            }
        }
        return count;
    }

    public static SubLObject get_schedules_for_cycl_query(final SubLObject query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(query) : "kb_indexing_datastructures.indexed_term_p(query) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(query) " + query;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject query_event_or_series = NIL;
            final SubLObject pred_var = $$scheduledQuerySpecification;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(query, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(query, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$21 = NIL;
                            final SubLObject token_var_$22 = NIL;
                            while (NIL == done_var_$21) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(assertion));
                                if (NIL != valid_$23) {
                                    query_event_or_series = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                    final SubLObject cycl_date = find_next_scheduled_date(query_event_or_series, NIL);
                                    SubLObject plist = NIL;
                                    if (NIL != cycl_date) {
                                        plist = putf(plist, $NEXT_RUN_DATE, cycl_date);
                                        if (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series)) {
                                            final SubLObject recurrence_interval = kb_mapping_utilities.fpred_value(query_event_or_series, $$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != recurrence_interval) {
                                                plist = putf(plist, $RECURRENCE_INTERVAL, recurrence_interval);
                                            }
                                        }
                                        SubLObject pred = NIL;
                                        SubLObject pred_$24 = NIL;
                                        SubLObject key = NIL;
                                        SubLObject key_$25 = NIL;
                                        pred = bq_cons(results_should_be_emailed_to_address(), $list69);
                                        pred_$24 = pred.first();
                                        key = $list70;
                                        key_$25 = key.first();
                                        while ((NIL != key) || (NIL != pred)) {
                                            final SubLObject email = kb_mapping_utilities.pred_values(query_event_or_series, pred_$24, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                                            if (NIL != list_utilities.non_empty_list_p(email)) {
                                                plist = putf(plist, key_$25, email);
                                            }
                                            pred = pred.rest();
                                            pred_$24 = pred.first();
                                            key = key.rest();
                                            key_$25 = key.first();
                                        } 
                                        ans = cons(plist, ans);
                                    }
                                }
                                done_var_$21 = makeBoolean(NIL == valid_$23);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject scheduled_query_queue() {
        if ($scheduled_query_queue$.getGlobalValue() == $UNINITIALIZED) {
            final SubLObject init_value = queues.create_p_queue(NIL, SCHEDULED_QUERY_SCHEDULED_RUN_TIME, UNPROVIDED);
            if (init_value == $UNINITIALIZED) {
                Errors.error($str73$Unable_to_initialize__A__, $scheduled_query_queue$.getGlobalValue());
            }
            $scheduled_query_queue$.setGlobalValue(init_value);
        }
        return $scheduled_query_queue$.getGlobalValue();
    }

    public static SubLObject get_scheduled_query_queue(SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queue = NIL;
        if ((NIL != machine_name) && (NIL != port)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject connection = remote_image.new_remote_image_connection(remote_image.new_remote_image(machine_name, port, UNPROVIDED));
                        try {
                            remote_image.open_remote_image_connection(connection);
                            final SubLObject _prev_bind_0_$27 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                            try {
                                remote_image.$current_remote_image_connection$.bind(connection, thread);
                                queue = remote_image.current_remote_image_connection_eval($list79);
                            } finally {
                                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0_$27, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                remote_image.close_remote_image_connection(connection);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else {
            SubLObject cdolist_list_var = queues.p_queue_elements(scheduled_query_queue());
            SubLObject sq = NIL;
            sq = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == find_if($sym80$INVALID_FORT_, sq, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    queue = cons(scheduled_query_plist(sq), queue);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sq = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var2;
        final SubLObject plists = cdolist_list_var2 = append(get_currently_running_scheduled_queries(machine_name, port), queue);
        SubLObject plist = NIL;
        plist = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            transform_list_utilities.ntransform(plist, $sym80$INVALID_FORT_, symbol_function(NULL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            plist = cdolist_list_var2.first();
        } 
        return delete_duplicates(plists, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_scheduled_query_queue() {
        while (NIL == queues.p_queue_empty_p(scheduled_query_queue())) {
            queues.p_dequeue(scheduled_query_queue(), UNPROVIDED);
        } 
        return scheduled_query_queue();
    }

    public static SubLObject scheduled_query_plist(final SubLObject sq) {
        SubLObject plist = NIL;
        final SubLObject kbq = scheduled_query_kbq(sq);
        final SubLObject scheduled_run_time_universal = scheduled_query_scheduled_run_time(sq);
        final SubLObject scheduled_run_time_cycl = date_utilities.universal_time_to_cycl_date(scheduled_run_time_universal);
        final SubLObject scheduled_run_time_decoded = arg2(resetMultipleValues(), multiple_value_list(decode_universal_time(scheduled_run_time_universal, UNPROVIDED)));
        final SubLObject event_or_series = scheduled_query_instance(sq);
        plist = putf(plist, $GUID_STRING, index_scheduled_query(sq));
        plist = putf(plist, $KBQ, kbq);
        plist = putf(plist, $GLOSS, kb_query.kbq_comments(kbq).first());
        plist = putf(plist, $SCHEDULED_RUN_TIME_UNIVERSAL, scheduled_run_time_universal);
        plist = putf(plist, $SCHEDULED_RUN_TIME_UNIX, subtract(scheduled_run_time_universal, $ut_offset_to_unix_time$.getGlobalValue()));
        plist = putf(plist, $SCHEDULED_RUN_TIME_CYCL, scheduled_run_time_cycl);
        plist = putf(plist, $SCHEDULED_RUN_TIME_DECODED, scheduled_run_time_decoded);
        if (NIL != isa.isa_in_any_mtP(event_or_series, $$Series)) {
            plist = putf(plist, $RECURRING_, T);
            plist = putf(plist, $SCHEDULER, get_series_scheduler(event_or_series));
            plist = putf(plist, $SERIES, event_or_series);
            plist = putf(plist, $INTERVAL_TYPE, kb_mapping_utilities.fpred_value_in_any_mt(event_or_series, $$intervalTypeOfPeriodicSeries, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            plist = putf(plist, $RECURRING_, NIL);
            plist = putf(plist, $EVENT, event_or_series);
            plist = putf(plist, $SCHEDULER, kb_mapping_utilities.fpred_value_in_any_mt(event_or_series, $$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        if (NIL != kb_mapping_utilities.some_pred_value_in_any_mt(event_or_series, $$scheduledReportSpecification, UNPROVIDED, UNPROVIDED)) {
            final SubLObject report = kb_mapping_utilities.fpred_value_in_any_mt(event_or_series, $$scheduledReportSpecification, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject template = kb_mapping_utilities.fpred_value_in_any_mt(report, $$reportSpecificationTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            plist = putf(plist, $REPORT, report);
            plist = putf(plist, $REPORT_TEMPLATE, template);
            plist = putf(plist, $REPORT_TEMPLATE_GLOSS, pph_main.generate_phrase(template, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return plist;
    }

    public static SubLObject index_scheduled_query(final SubLObject sq) {
        final SubLObject guid_string = Guids.guid_to_string(Guids.new_guid());
        dictionary.dictionary_enter($scheduled_query_index$.getGlobalValue(), guid_string, sq);
        return guid_string;
    }

    public static SubLObject lookup_scheduled_query(final SubLObject guid_string) {
        return dictionary.dictionary_lookup_without_values($scheduled_query_index$.getGlobalValue(), guid_string, UNPROVIDED);
    }

    public static SubLObject scheduled_query_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED)));
    }

    public static SubLObject scheduled_query_kbq(final SubLObject sq) {
        assert NIL != scheduled_query_p(sq) : "scheduled_queries.scheduled_query_p(sq) " + "CommonSymbols.NIL != scheduled_queries.scheduled_query_p(sq) " + sq;
        return sq.first();
    }

    public static SubLObject scheduled_query_scheduled_run_time(final SubLObject sq) {
        assert NIL != scheduled_query_p(sq) : "scheduled_queries.scheduled_query_p(sq) " + "CommonSymbols.NIL != scheduled_queries.scheduled_query_p(sq) " + sq;
        return second(sq);
    }

    public static SubLObject scheduled_query_instance(final SubLObject sq) {
        assert NIL != scheduled_query_p(sq) : "scheduled_queries.scheduled_query_p(sq) " + "CommonSymbols.NIL != scheduled_queries.scheduled_query_p(sq) " + sq;
        return third(sq);
    }

    public static SubLObject package_scheduled_query(final SubLObject kbq, final SubLObject time, final SubLObject query_event_or_series) {
        assert NIL != forts.fort_p(kbq) : "forts.fort_p(kbq) " + "CommonSymbols.NIL != forts.fort_p(kbq) " + kbq;
        assert NIL != numeric_date_utilities.universal_time_p(time) : "numeric_date_utilities.universal_time_p(time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(time) " + time;
        assert NIL != forts.fort_p(query_event_or_series) : "forts.fort_p(query_event_or_series) " + "CommonSymbols.NIL != forts.fort_p(query_event_or_series) " + query_event_or_series;
        return list(kbq, time, query_event_or_series);
    }

    public static SubLObject remove_query_or_series_from_queue(final SubLObject query_or_series) {
        SubLObject survivors = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            while (NIL == queues.p_queue_empty_p(scheduled_query_queue())) {
                final SubLObject sq = queues.p_dequeue(scheduled_query_queue(), UNPROVIDED);
                if (!query_or_series.equal(scheduled_query_instance(sq))) {
                    survivors = cons(sq, survivors);
                }
            } 
            SubLObject cdolist_list_var = survivors;
            SubLObject survivor = NIL;
            survivor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.p_enqueue(survivor, scheduled_query_queue());
                cdolist_list_var = cdolist_list_var.rest();
                survivor = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return scheduled_query_queue();
    }

    public static SubLObject enqueue_scheduled_query(final SubLObject packaged_query) {
        SubLObject query = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            if (NIL == queues.p_queue_find(packaged_query, scheduled_query_queue(), symbol_function(EQUAL), UNPROVIDED)) {
                query = queues.p_enqueue(packaged_query, scheduled_query_queue());
            }
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static SubLObject dequeue_scheduled_query() {
        SubLObject query = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            query = queues.p_dequeue(scheduled_query_queue(), UNPROVIDED);
            note_scheduled_query_in_progress(scheduled_query_kbq(query));
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static SubLObject next_scheduled_query() {
        SubLObject query = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            query = queues.p_queue_best(scheduled_query_queue());
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return query;
    }

    public static SubLObject populate_scheduled_query_queue() {
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            clear_scheduled_query_queue();
            SubLObject cdolist_list_var = kb_query.new_cyc_query_from_kbq($$KBQ_FindOneTimeScheduledQueries, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject scheduled_query = NIL;
                SubLObject kbq = NIL;
                destructuring_bind_must_consp(current, datum, $list103);
                scheduled_query = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list103);
                kbq = current.first();
                current = current.rest();
                if (NIL == current) {
                    schedule_query(kbq, scheduled_query, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list103);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
            cdolist_list_var = kb_query.new_cyc_query_from_kbq($$KBQ_FindRepeatingScheduledQueries, UNPROVIDED, UNPROVIDED);
            result = NIL;
            result = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = result;
                SubLObject scheduled_query_series = NIL;
                SubLObject kbq = NIL;
                destructuring_bind_must_consp(current, datum, $list105);
                scheduled_query_series = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list105);
                kbq = current.first();
                current = current.rest();
                if (NIL == current) {
                    schedule_query(kbq, scheduled_query_series, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum, $list105);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return scheduled_query_queue();
    }

    public static SubLObject schedule_query(final SubLObject kbq, final SubLObject query_event_or_series, SubLObject just_ranP) {
        if (just_ranP == UNPROVIDED) {
            just_ranP = NIL;
        }
        final SubLObject scheduled_time = find_next_scheduled_time(query_event_or_series, just_ranP);
        if (NIL != numeric_date_utilities.universal_time_p(scheduled_time)) {
            final SubLObject sq = package_scheduled_query(kbq, scheduled_time, query_event_or_series);
            enqueue_scheduled_query(sq);
        }
        return scheduled_time;
    }

    public static SubLObject add_scheduled_query(final SubLObject argument, final SubLObject assertion) {
        if (NIL != run_scheduled_queries_on_this_imageP()) {
            ensure_scheduled_query_daemon_is_running();
            final SubLObject query_event_or_series = assertions_high.gaf_arg1(assertion);
            final SubLObject kbq = kbq_for_query_event_or_series(query_event_or_series);
            if (NIL != kbq) {
                schedule_query(kbq, query_event_or_series, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject find_next_scheduled_time(final SubLObject query_event_or_series, final SubLObject just_ranP) {
        final SubLObject cycl_date = find_next_scheduled_date(query_event_or_series, just_ranP);
        return (NIL != cycl_date) && (NIL == date_utilities.dateL(cycl_date, date_utilities.date_before(date_utilities.indexical_now(), $list108))) ? date_utilities.cycl_date_to_universal_time(cycl_date) : NIL;
    }

    public static SubLObject find_next_scheduled_date(final SubLObject query_event_or_series, final SubLObject just_ranP) {
        return NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series) ? next_run_date_for_query_series(query_event_or_series, just_ranP) : scheduled_run_date_for_query(query_event_or_series);
    }

    public static SubLObject next_run_date_for_query_series(final SubLObject query_series, final SubLObject just_ranP) {
        final SubLObject kbq = (NIL != just_ranP) ? $const109$KBQ_FindNextFutureStartDateForQue : $const110$KBQ_FindNextStartDateForQueryInSe;
        final SubLObject cycl_date = query_utilities.new_cyc_query_from_indexicalized_kbq(kbq, query_series, UNPROVIDED).first();
        return cycl_date;
    }

    public static SubLObject scheduled_run_date_for_query(final SubLObject query_event) {
        final SubLObject cycl_date = query_utilities.new_cyc_query_from_indexicalized_kbq($const111$KBQ_FindStartDateForScheduledQuer, query_event, UNPROVIDED).first();
        return cycl_date;
    }

    public static SubLObject kbq_for_query_event_or_series(final SubLObject query_event_or_series) {
        return query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindScheduledKBQ, query_event_or_series, UNPROVIDED).first();
    }

    public static SubLObject get_currently_running_scheduled_queries(SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if ((NIL != machine_name) && (NIL != port)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject connection = remote_image.new_remote_image_connection(remote_image.new_remote_image(machine_name, port, UNPROVIDED));
                        try {
                            remote_image.open_remote_image_connection(connection);
                            final SubLObject _prev_bind_0_$29 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                            try {
                                remote_image.$current_remote_image_connection$.bind(connection, thread);
                                ans = get_currently_running_scheduled_queries_internal();
                            } finally {
                                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0_$29, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                remote_image.close_remote_image_connection(connection);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else {
            ans = get_currently_running_scheduled_queries_internal();
        }
        return ans;
    }

    public static SubLObject get_currently_running_scheduled_queries_internal() {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = $active_scheduled_queries$.getGlobalValue();
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject packaged_query = NIL;
            SubLObject problem_store = NIL;
            destructuring_bind_must_consp(current, datum, $list116);
            packaged_query = current.first();
            current = problem_store = current.rest();
            if (NIL != inference_datastructures_problem_store.valid_problem_store_p(problem_store)) {
                SubLObject plist = scheduled_query_plist(packaged_query);
                plist = putf(plist, $PROBLEM_STORE_ID, inference_datastructures_problem_store.problem_store_suid(problem_store));
                plist = putf(plist, $INFERENCES, scheduled_query_problem_store_inferences_plists(problem_store));
                ans = cons(plist, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject scheduled_query_problem_store_inferences_plists(final SubLObject problem_store) {
        SubLObject plists = NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$31 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$31);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        plists = cons(scheduled_query_inference_plist(inference), plists);
                    }
                }
            }
            final SubLObject idx_$32 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$32)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$32);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        plists = cons(scheduled_query_inference_plist(inference2), plists);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return plists;
    }

    public static SubLObject scheduled_query_inference_plist(final SubLObject inference) {
        SubLObject plist = list($INFERENCE_ID, inference_datastructures_inference.inference_suid(inference));
        plist = putf(plist, $TIME_SO_FAR, inference_datastructures_inference.inference_time_so_far(inference, UNPROVIDED));
        plist = putf(plist, $ANSWER_COUNT, inference_datastructures_inference.inference_answer_count(inference));
        plist = putf(plist, $STATUS, inference_datastructures_inference.inference_status(inference));
        return plist;
    }

    public static SubLObject abort_scheduled_query(final SubLObject guid_string, SubLObject machine_name, SubLObject port) {
        if (machine_name == UNPROVIDED) {
            machine_name = NIL;
        }
        if (port == UNPROVIDED) {
            port = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != machine_name) && (NIL != port)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject connection = remote_image.new_remote_image_connection(remote_image.new_remote_image(machine_name, port, UNPROVIDED));
                        try {
                            remote_image.open_remote_image_connection(connection);
                            final SubLObject _prev_bind_0_$33 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                            try {
                                remote_image.$current_remote_image_connection$.bind(connection, thread);
                                abort_scheduled_query(guid_string, NIL, NIL);
                            } finally {
                                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0_$33, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                remote_image.close_remote_image_connection(connection);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject scheduled_query = lookup_scheduled_query(guid_string);
            if (NIL != scheduled_query) {
                abort_scheduled_query_internal(scheduled_query);
            }
        }
        return NIL;
    }

    public static SubLObject abort_active_scheduled_queries() {
        SubLObject cdolist_list_var = $active_scheduled_queries$.getGlobalValue();
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject packaged_query = NIL;
            SubLObject problem_store = NIL;
            destructuring_bind_must_consp(current, datum, $list116);
            packaged_query = current.first();
            current = problem_store = current.rest();
            abort_scheduled_query_internal(packaged_query);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject abort_scheduled_query_internal(final SubLObject scheduled_query) {
        $aborted_scheduled_queries$.setGlobalValue(cons(scheduled_query, $aborted_scheduled_queries$.getGlobalValue()));
        final SubLObject problem_store = list_utilities.alist_lookup_without_values($active_scheduled_queries$.getGlobalValue(), scheduled_query, symbol_function(EQUAL), UNPROVIDED);
        if (NIL != problem_store) {
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(problem_store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$35 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$35, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$35);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        inference = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(inference)) {
                                inference = $SKIP;
                            }
                            inference_strategist.inference_abort(inference);
                        }
                    }
                }
                final SubLObject idx_$36 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$36)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$36);
                    SubLObject id2 = NIL;
                    SubLObject inference2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            inference2 = getEntryValue(cdohash_entry);
                            inference_strategist.inference_abort(inference2);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        SubLObject survivors = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            while (NIL == queues.p_queue_empty_p(scheduled_query_queue())) {
                final SubLObject sq = queues.p_dequeue(scheduled_query_queue(), UNPROVIDED);
                if (!scheduled_query.equal(sq)) {
                    survivors = cons(sq, survivors);
                }
            } 
            SubLObject cdolist_list_var = survivors;
            SubLObject survivor = NIL;
            survivor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                queues.p_enqueue(survivor, scheduled_query_queue());
                cdolist_list_var = cdolist_list_var.rest();
                survivor = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject should_skipXabort_scheduled_queryP(final SubLObject scheduled_query) {
        return subl_promotions.memberP(scheduled_query, $aborted_scheduled_queries$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject note_scheduled_query_in_progress(final SubLObject kbq) {
        $in_progress_queries$.setGlobalValue(cons(kbq, $in_progress_queries$.getGlobalValue()));
        return $in_progress_queries$.getGlobalValue();
    }

    public static SubLObject note_scheduled_query_finished_running(final SubLObject kbq) {
        $in_progress_queries$.setGlobalValue(remove(kbq, $in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $active_scheduled_queries$.setGlobalValue(list_utilities.remove_if_not(VALID_PROBLEM_STORE_P, $active_scheduled_queries$.getGlobalValue(), symbol_function(CDR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $completed_queries$.setGlobalValue(cons(kbq, $completed_queries$.getGlobalValue()));
        return $in_progress_queries$.getGlobalValue();
    }

    public static SubLObject scheduled_query_in_progressP(final SubLObject kbq) {
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
            ans = subl_promotions.memberP(kbq, $in_progress_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_queue_lock$.getGlobalValue());
            }
        }
        return ans;
    }

    public static SubLObject run_packaged_scheduled_query(final SubLObject packaged_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        if (NIL != packaged_query) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject kbq = scheduled_query_kbq(packaged_query);
                        final SubLObject query_event_or_series = scheduled_query_instance(packaged_query);
                        if (NIL != forts.valid_fortP(query_event_or_series)) {
                            final SubLObject _prev_bind_0_$37 = api_control_vars.$the_cyclist$.currentBinding(thread);
                            try {
                                api_control_vars.$the_cyclist$.bind(NIL, thread);
                                operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
                                if (NIL == should_skipXabort_scheduled_queryP(packaged_query)) {
                                    try {
                                        final SubLObject problem_store_properties = list_utilities.filter_plist(kb_query.kbq_query_properties(kbq), PROBLEM_STORE_PROPERTY_P);
                                        SubLObject store = NIL;
                                        try {
                                            store = inference_datastructures_problem_store.new_problem_store(problem_store_properties);
                                            $active_scheduled_queries$.setGlobalValue(cons(cons(packaged_query, store), $active_scheduled_queries$.getGlobalValue()));
                                            successP = run_scheduled_query_internal(packaged_query, store);
                                        } finally {
                                            final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                inference_datastructures_problem_store.destroy_problem_store(store);
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                            }
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            note_scheduled_query_finished_running(kbq);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                        }
                                    }
                                }
                                if ((NIL == successP) || (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series))) {
                                    schedule_query(kbq, query_event_or_series, T);
                                } else {
                                    cleanup_scheduled_query(query_event_or_series);
                                }
                            } finally {
                                api_control_vars.$the_cyclist$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return successP;
    }

    public static SubLObject cleanup_scheduled_query(final SubLObject query_event) {
        SubLObject release = NIL;
        try {
            release = seize_lock($scheduled_query_cleanup_lock$.getGlobalValue());
            if (NIL != forts.valid_fortP(query_event)) {
                ke.ke_kill_now(query_event);
            }
        } finally {
            if (NIL != release) {
                release_lock($scheduled_query_cleanup_lock$.getGlobalValue());
            }
        }
        return query_event;
    }

    public static SubLObject run_scheduled_query_internal(final SubLObject packaged_query, final SubLObject store) {
        final SubLObject kbq = scheduled_query_kbq(packaged_query);
        final SubLObject query_event_or_series = scheduled_query_instance(packaged_query);
        SubLObject successP = NIL;
        final SubLObject inference = run_scheduled_query(kbq, store);
        final SubLObject location = new_path_for_scheduled_query_problem_store(store);
        if (NIL != inference) {
            inference_serialization.save_problem_store(store, location, UNPROVIDED);
            final SubLObject defining_mt = kb_accessors.defining_mt(query_event_or_series);
            final SubLObject mt = (NIL != defining_mt) ? defining_mt : $scheduled_query_computer_info_mt$.getGlobalValue();
            final SubLObject inference_datastructure = inference_utilities.cycl_term_for_inference(inference);
            ke.ke_assert_now(list($$problemStoreSnapshotPathnames, inference_utilities.cycl_term_for_problem_store(store), location), mt, UNPROVIDED, UNPROVIDED);
            inference_utilities.assert_problem_store_data(store, mt, UNPROVIDED);
            inference_utilities.assert_inference_data(inference, mt, UNPROVIDED);
            ke.ke_assert_now(list($$queryInferences, kbq, inference_datastructure), mt, UNPROVIDED, UNPROVIDED);
            if (NIL != isa.isa_in_any_mtP(query_event_or_series, $$Series)) {
                ke.ke_assert_now(list($$inferenceDatastructure, reify_scheduled_query_in_series(query_event_or_series, defining_mt), inference_datastructure), mt, UNPROVIDED, UNPROVIDED);
            }
            maybe_email_scheduled_query_results(query_event_or_series, inference);
            successP = T;
        }
        return successP;
    }

    public static SubLObject get_mime_type_for_delimiter(final SubLObject delimiter) {
        if (delimiter.eql(CHAR_comma)) {
            return $str130$text_csv;
        }
        if (delimiter.eql(CHAR_tab)) {
            return $str131$text_tsv;
        }
        return $str132$text_plain;
    }

    public static SubLObject get_subl_character(final SubLObject cycl_character) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subl_char = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == subl_char) {
                SubLObject csome_list_var = $list134;
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while ((NIL == subl_char) && (NIL != csome_list_var)) {
                    SubLObject string = NIL;
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cycl_character, NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cycl_character, NIL, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$40 = NIL;
                                    final SubLObject token_var_$41 = NIL;
                                    while (NIL == done_var_$40) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                        final SubLObject valid_$42 = makeBoolean(!token_var_$41.eql(assertion));
                                        if (NIL != valid_$42) {
                                            string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                            if (NIL != list_utilities.lengthE(string, ONE_INTEGER, UNPROVIDED)) {
                                                subl_char = string_utilities.first_char(string);
                                            }
                                        }
                                        done_var_$40 = makeBoolean(NIL == valid_$42);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return subl_char;
    }

    public static SubLObject maybe_email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference) {
        final SubLObject to = get_email_recipients_for_scheduled_query_results(query_event_or_series);
        final SubLObject cc = get_email_cc_for_scheduled_query_results(query_event_or_series);
        final SubLObject cyclist = kb_mapping_utilities.fpred_value_in_any_mt(query_event_or_series, $$scheduledBy, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != cyclist) && (NIL != list_utilities.non_empty_list_p(to))) {
            try_to_email_scheduled_query_results(query_event_or_series, inference, to, cc, cyclist);
        }
        return NIL;
    }

    public static SubLObject results_should_be_emailed_to_address() {
        return constants_high.find_constant_by_guid_string($str135$6cb141db_9948_4a5b_b7ae_a86899c41);
    }

    public static SubLObject get_email_recipients_for_scheduled_query_results(final SubLObject query_event_or_series) {
        return kb_mapping_utilities.pred_values_in_any_mt(query_event_or_series, results_should_be_emailed_to_address(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject get_email_cc_for_scheduled_query_results(final SubLObject query_event_or_series) {
        return kb_mapping_utilities.pred_values_in_any_mt(query_event_or_series, $const13$resultsShouldBeEmailedToAddress_C, ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
    }

    public static SubLObject get_scheduled_query_results_message(final SubLObject query_event_or_series, final SubLObject inference) {
        final SubLObject name = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED).first();
        final SubLObject sentence = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindFormulaForScheduledQuery, query_event_or_series, UNPROVIDED).first();
        final SubLObject paraphrase = pph_main.generate_text_wXsentential_force(possibly_unquote(sentence), $INTERROGATIVE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject result_count = inference_datastructures_inference.inference_answer_count(inference);
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, $scheduled_query_results_message_template$.getGlobalValue(), new SubLObject[]{ name, cycl_string.cycl_string_to_utf8_string(paraphrase), result_count });
            terpri(stream);
            operation_communication.server_summary(stream);
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject get_scheduled_query_results_subject(final SubLObject query_event_or_series, final SubLObject inference) {
        final SubLObject name = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindGlossForScheduledQuery, query_event_or_series, UNPROVIDED).first();
        final SubLObject result_count = inference_datastructures_inference.inference_answer_count(inference);
        return cconcatenate($str140$Scheduled_Query_Results__, new SubLObject[]{ format_nil.format_nil_d_no_copy(result_count), $$$_answers_for_, format_nil.format_nil_s_no_copy(name) });
    }

    public static SubLObject extension_for_delimiter(final SubLObject delimiter) {
        if (delimiter.eql(CHAR_tab)) {
            return $$$tsv;
        }
        if (delimiter.eql(CHAR_comma)) {
            return $$$csv;
        }
        return $$$txt;
    }

    public static SubLObject get_scheduled_report_results_subject(final SubLObject file_name, final SubLObject successP, final SubLObject report_generator) {
        final SubLObject problem_count = sksi_reports_by_column.report_generator_problem_count(report_generator);
        return (NIL != successP) && problem_count.isZero() ? $$$Report_run_successfully : cconcatenate($str146$Report_generation_failed__, new SubLObject[]{ format_nil.format_nil_d_no_copy(problem_count), $str147$_problems_ });
    }

    public static SubLObject do_smtp_accounts_for_cyclist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list148);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyclist = NIL;
        SubLObject host = NIL;
        SubLObject port = NIL;
        destructuring_bind_must_consp(current, datum, $list148);
        cyclist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list148);
        host = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list148);
        port = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$44 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list148);
            current_$44 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list148);
            if (NIL == member(current_$44, $list149, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$44 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list148);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject el_list = $sym152$EL_LIST;
        final SubLObject smtp_account = $sym153$SMTP_ACCOUNT;
        final SubLObject info = $sym154$INFO;
        return list(CSOME, list(el_list, list(NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, $$KBQ_FindSMTPAccountsForCyclist, cyclist), done), list(CSOME, list(smtp_account, list(EL_LIST_ITEMS, el_list), done), list(CSOME, list(info, list(NEW_CYC_QUERY_FROM_INDEXICALIZED_KBQ, $$KBQ_FindSMTPInfoForAccount, smtp_account), done), listS(CDESTRUCTURING_BIND, bq_cons(port, host), info, append(body, NIL)))));
    }

    public static SubLObject try_to_email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference, final SubLObject to, final SubLObject cc, final SubLObject cyclist) {
        SubLObject sentP = NIL;
        if (NIL == sentP) {
            SubLObject csome_list_var = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindSMTPAccountsForCyclist, cyclist, UNPROVIDED);
            SubLObject el_list = NIL;
            el_list = csome_list_var.first();
            while ((NIL == sentP) && (NIL != csome_list_var)) {
                if (NIL == sentP) {
                    SubLObject csome_list_var_$45 = el_list_items(el_list);
                    SubLObject smtp_account = NIL;
                    smtp_account = csome_list_var_$45.first();
                    while ((NIL == sentP) && (NIL != csome_list_var_$45)) {
                        if (NIL == sentP) {
                            SubLObject csome_list_var_$46 = query_utilities.new_cyc_query_from_indexicalized_kbq($$KBQ_FindSMTPInfoForAccount, smtp_account, UNPROVIDED);
                            SubLObject info = NIL;
                            info = csome_list_var_$46.first();
                            while ((NIL == sentP) && (NIL != csome_list_var_$46)) {
                                SubLObject current;
                                final SubLObject datum = current = info;
                                SubLObject port = NIL;
                                SubLObject host = NIL;
                                destructuring_bind_must_consp(current, datum, $list161);
                                port = current.first();
                                current = host = current.rest();
                                sentP = email_scheduled_query_results(query_event_or_series, inference, to, cc, host, port);
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

    public static SubLObject email_scheduled_query_results(final SubLObject query_event_or_series, final SubLObject inference, final SubLObject to, final SubLObject cc, final SubLObject host, final SubLObject port) {
        final SubLObject message = get_scheduled_query_results_message(query_event_or_series, inference);
        final SubLObject subject = get_scheduled_query_results_subject(query_event_or_series, inference);
        return mail_utilities.mail_message($str162$scheduled_query_daemon_cyc_com, to, message, subject, host, NIL, port, TEN_INTEGER, cc, NIL);
    }

    public static SubLObject reify_scheduled_query_in_series(final SubLObject query_series, final SubLObject defining_mt) {
        final SubLObject query_event = ke.ke_create_now($$$ScheduledQuery, UNPROVIDED);
        sqd_note_new_fort(query_event);
        ke.ke_assert_now(list($$isa, query_event, scheduled_query_series_query_type(query_series)), defining_mt, UNPROVIDED, UNPROVIDED);
        ke.ke_assert_now(list($$seriesMembers, query_series, query_event), defining_mt, UNPROVIDED, UNPROVIDED);
        return query_event;
    }

    public static SubLObject scheduled_query_series_query_type(final SubLObject query_series) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = $$CycQueryRunning;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0_$47 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$48 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$49 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str175$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str170$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(query_series, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$51 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = function_terms.naut_to_nart(query_series);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$52 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$58;
                                                                    for (iteration_state_$58 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$58); iteration_state_$58 = dictionary_contents.do_dictionary_contents_next(iteration_state_$58)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$58);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str176$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$53, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$58);
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$52, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str177$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$60;
                                                    final SubLObject new_list = cdolist_list_var_$60 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$60.first();
                                                    while (NIL != cdolist_list_var_$60) {
                                                        final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str176$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$54, thread);
                                                        }
                                                        cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                                                        generating_fn = cdolist_list_var_$60.first();
                                                    } 
                                                }

                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$52, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$51, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    SubLObject node_var = deck.deck_pop(recur_deck);
                                    final SubLObject _prev_bind_0_$55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$55 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        while (NIL != node_var) {
                                            final SubLObject col = node_var;
                                            SubLObject this_type = NIL;
                                            final SubLObject pred_var = $$seriesOfType;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(col, TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(col, TWO_INTEGER, pred_var);
                                                SubLObject done_var = NIL;
                                                final SubLObject token_var = NIL;
                                                while (NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                            SubLObject done_var_$65 = NIL;
                                                            final SubLObject token_var_$66 = NIL;
                                                            while (NIL == done_var_$65) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                                                final SubLObject valid_$67 = makeBoolean(!token_var_$66.eql(assertion));
                                                                if (NIL != valid_$67) {
                                                                    this_type = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                    if ((NIL != genls.genlP(this_type, type, UNPROVIDED, UNPROVIDED)) && (NIL == genls.genlP(type, this_type, UNPROVIDED, UNPROVIDED))) {
                                                                        type = this_type;
                                                                    }
                                                                }
                                                                done_var_$65 = makeBoolean(NIL == valid_$67);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                } 
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$57 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$58 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$59;
                                                                            for (iteration_state_$59 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$59); iteration_state_$59 = dictionary_contents.do_dictionary_contents_next(iteration_state_$59)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$59);
                                                                                final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes3;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node5;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (NIL != csome_list_var3) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str176$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$59, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$59);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$58, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str177$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$61;
                                                            final SubLObject new_list2 = cdolist_list_var_$61 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$61.first();
                                                            while (NIL != cdolist_list_var_$61) {
                                                                final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject node_vars_link_node2;
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var4 = sol4;
                                                                            SubLObject node_vars_link_node7 = NIL;
                                                                            node_vars_link_node7 = csome_list_var4.first();
                                                                            while (NIL != csome_list_var4) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node7, recur_deck);
                                                                                }
                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                node_vars_link_node7 = csome_list_var4.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str176$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$60, thread);
                                                                }
                                                                cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                                                                generating_fn2 = cdolist_list_var_$61.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$54, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$57, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$55, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$53, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$55, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$54, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$51, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$50, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str179$Node__a_does_not_pass_sbhl_type_t, query_series, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$50, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$49, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$49, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$48, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$47, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return type;
    }

    public static SubLObject run_scheduled_query(final SubLObject kbq, final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = kb_query.new_cyc_query_from_kbq(kbq, list($PROBLEM_STORE, store, $CONTINUABLE_, T), UNPROVIDED);
        final SubLObject halt_reason = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        final SubLObject metric_values = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return inference;
    }

    public static SubLObject scheduled_query_problem_store_directory() {
        final SubLObject directory = $str182$data_problem_stores_;
        if (NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, NIL, $$$0775);
        }
        return directory;
    }

    public static SubLObject new_path_for_scheduled_query_problem_store(final SubLObject store) {
        final SubLObject directory = cconcatenate(scheduled_query_problem_store_directory(), new SubLObject[]{ string_utilities.char_subst(CHAR_slash, CHAR_hyphen, cyc_image_id()), $str184$_ });
        if (NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, NIL, $$$0775);
        }
        return cconcatenate(directory, new SubLObject[]{ $str185$store_, princ_to_string(inference_datastructures_problem_store.problem_store_suid(store)), $str186$_cfasl });
    }

    public static SubLObject start_scheduled_query_processing_internal() {
        inference_utilities.ensure_term_for_machine($scheduled_query_computer_info_mt$.getGlobalValue(), $$ScheduledQueryDaemon);
        set_scheduled_query_image_flag(T);
        final SubLObject queue = populate_scheduled_query_queue();
        ensure_scheduled_query_daemon_is_running();
        return queues.p_queue_size(queue);
    }

    public static SubLObject set_scheduled_query_image_flag(final SubLObject runP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $run_scheduled_queries_on_this_imageP$.setGlobalValue(list_utilities.sublisp_boolean(runP));
        final SubLObject mt = $scheduled_query_computer_info_mt$.getGlobalValue();
        final SubLObject term_for_machine = inference_utilities.ensure_term_for_machine(mt, $$ScheduledQueryDaemon);
        final SubLObject sentence = list($$programOnPort, $$ScheduledQueryDaemon_CW, $$CFASLProtocol, cfasl_kernel.cfasl_port(), term_for_machine);
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(NIL, thread);
            operation_communication.set_the_cyclist($$ScheduledQueryDaemon);
            if (NIL != runP) {
                ke.ke_assert(sentence, mt, UNPROVIDED, UNPROVIDED);
            } else {
                ke.ke_unassert(sentence, mt);
            }
        } finally {
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return $run_scheduled_queries_on_this_imageP$.getGlobalValue();
    }

    public static SubLObject find_possible_scheduled_query_daemon_images() {
        return kb_query.new_cyc_query_from_kbq($$FindRunningScheduledQueryDaemons, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_scheduled_queries_on_this_imageP() {
        return list_utilities.sublisp_boolean($run_scheduled_queries_on_this_imageP$.getGlobalValue());
    }

    public static SubLObject ensure_scheduled_query_daemon_is_running() {
        if (NIL == valid_process_p($scheduled_query_daemon$.getGlobalValue())) {
            $scheduled_query_daemon$.setGlobalValue(launch_scheduled_query_daemon());
        }
        return $scheduled_query_daemon$.getGlobalValue();
    }

    public static SubLObject launch_scheduled_query_runner(final SubLObject packaged_query) {
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next($scheduled_query_runner_isg$.getGlobalValue());
        final SubLObject name = cconcatenate($$$Scheduled_Query_Runner_, format_nil.format_nil_d_no_copy(id));
        final SubLObject runner = process_utilities.make_cyc_server_process_with_args(name, RUN_PACKAGED_SCHEDULED_QUERY, list(packaged_query));
        return runner;
    }

    public static SubLObject launch_scheduled_query_daemon() {
        final SubLObject name = copy_seq($$$Scheduled_Query_Daemon);
        return process_utilities.make_cyc_server_process(name, RUN_SCHEDULED_QUERIES);
    }

    public static SubLObject run_scheduled_queries() {
        while (NIL != run_scheduled_queries_on_this_imageP()) {
            while (NIL != queues.p_queue_empty_p(scheduled_query_queue())) {
                sleep(ONE_INTEGER);
            } 
            if (NIL != run_scheduled_queries_on_this_imageP()) {
                maybe_run_next_scheduled_query();
                sleep(ONE_INTEGER);
            }
        } 
        return NIL;
    }

    public static SubLObject maybe_run_next_scheduled_query() {
        if (NIL == list_utilities.lengthGE($active_scheduled_queries$.getGlobalValue(), $max_number_of_simultaneous_scheduled_queries$.getGlobalValue(), UNPROVIDED)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($scheduled_query_queue_lock$.getGlobalValue());
                final SubLObject packaged_query = next_scheduled_query();
                if (NIL != packaged_query) {
                    final SubLObject time = scheduled_query_scheduled_run_time(packaged_query);
                    final SubLObject seconds_to_wait = subtract(time, get_universal_time());
                    if (!seconds_to_wait.isPositive()) {
                        launch_scheduled_query_runner(dequeue_scheduled_query());
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock($scheduled_query_queue_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject sqd_note_new_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != misc_utilities.initialized_p($sqd_new_forts_to_cleanup$.getDynamicValue(thread)) ? queues.enqueue(fort, $sqd_new_forts_to_cleanup$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject sqd_cleanup_new_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p($sqd_new_forts_to_cleanup$.getDynamicValue(thread))) {
            while (NIL == queues.queue_empty_p($sqd_new_forts_to_cleanup$.getDynamicValue(thread))) {
                cleanup_scheduled_query(queues.dequeue($sqd_new_forts_to_cleanup$.getDynamicValue(thread)));
            } 
        }
        return $sqd_new_forts_to_cleanup$.getDynamicValue(thread);
    }

    public static SubLObject scheduled_query_test_query() {
        final SubLObject test_query_naut = $list210;
        final SubLObject kbq = narts_high.find_nart(test_query_naut);
        if (NIL == forts.valid_fortP(kbq)) {
            Errors.warn($str211$Couldn_t_find_valid_test_query__S, test_query_naut);
        }
        return kbq;
    }

    public static SubLObject with_sqd_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject timeout = NIL;
        SubLObject timed_outP = NIL;
        destructuring_bind_must_consp(current, datum, $list212);
        timeout = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list212);
        timed_outP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_TIMEOUT, list(timeout, timed_outP), list(CLET, $list215, listS(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), $list218)));
        }
        cdestructuring_bind_error(datum, $list212);
        return NIL;
    }

    public static SubLObject start_daemon_and_schedule_query_once(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = $int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_results = get_cached_results_for_cycl_query(kbq);
        SubLObject new_results = NIL;
        SubLObject timed_outP = NIL;
        SubLObject time = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$77 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        final SubLObject _prev_bind_0_$78 = $sqd_new_forts_to_cleanup$.currentBinding(thread);
                        try {
                            $sqd_new_forts_to_cleanup$.bind(queues.create_queue(UNPROVIDED), thread);
                            try {
                                final SubLObject time_var = get_internal_real_time();
                                start_daemon_and_stop_receiving();
                                schedule_query_and_wait_for_processing(kbq);
                                new_results = get_scheduled_query_results(kbq, existing_results);
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            } finally {
                                final SubLObject _prev_bind_0_$79 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sqd_cleanup_new_forts();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                                }
                            }
                        } finally {
                            $sqd_new_forts_to_cleanup$.rebind(_prev_bind_0_$78, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$77, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$80 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        format(T, $str220$___D_existing_result__P___S___D_n, new SubLObject[]{ length(existing_results), existing_results, length(new_results), new_results });
        if (NIL != timed_outP) {
            Errors.warn($str221$Timed_out_after__S_second__P_duri, timeout);
        } else {
            format(T, $str222$__Finished_START_DAEMON_AND_SCHED, numeric_date_utilities.readable_elapsed_time_string(time, UNPROVIDED));
        }
        return new_results;
    }

    public static SubLObject schedule_test_query_and_wait_for_results(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = $int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_results = get_cached_results_for_cycl_query(kbq);
        SubLObject timed_outP = NIL;
        SubLObject new_results = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$81 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        final SubLObject _prev_bind_0_$82 = $sqd_new_forts_to_cleanup$.currentBinding(thread);
                        try {
                            $sqd_new_forts_to_cleanup$.bind(queues.create_queue(UNPROVIDED), thread);
                            try {
                                schedule_query_and_wait_for_processing(kbq);
                                new_results = get_scheduled_query_results(kbq, existing_results);
                            } finally {
                                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sqd_cleanup_new_forts();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        } finally {
                            $sqd_new_forts_to_cleanup$.rebind(_prev_bind_0_$82, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$81, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        return values(new_results, timed_outP);
    }

    public static SubLObject schedule_query_once_and_start_daemon(SubLObject kbq, SubLObject timeout) {
        if (kbq == UNPROVIDED) {
            kbq = scheduled_query_test_query();
        }
        if (timeout == UNPROVIDED) {
            timeout = $int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_results = get_cached_results_for_cycl_query(kbq);
        SubLObject new_results = NIL;
        SubLObject timed_outP = NIL;
        SubLObject time = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$85 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        final SubLObject _prev_bind_0_$86 = $sqd_new_forts_to_cleanup$.currentBinding(thread);
                        try {
                            $sqd_new_forts_to_cleanup$.bind(queues.create_queue(UNPROVIDED), thread);
                            try {
                                final SubLObject time_var = get_internal_real_time();
                                halt_scheduled_query_processing();
                                schedule_query_and_wait_for_processing(kbq);
                                start_daemon_and_stop_receiving();
                                sleep(ONE_INTEGER);
                                new_results = get_scheduled_query_results(kbq, existing_results);
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            } finally {
                                final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sqd_cleanup_new_forts();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                                }
                            }
                        } finally {
                            $sqd_new_forts_to_cleanup$.rebind(_prev_bind_0_$86, thread);
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$85, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        format(T, $str220$___D_existing_result__P___S___D_n, new SubLObject[]{ length(existing_results), existing_results, length(new_results), new_results });
        if (NIL != timed_outP) {
            Errors.warn($str223$Timed_out_after__S_second__P_duri, timeout);
        } else {
            format(T, $str224$__Finished_SCHEDULE_QUERY_ONCE_AN, numeric_date_utilities.readable_elapsed_time_string(time, UNPROVIDED));
        }
        return new_results;
    }

    public static SubLObject start_daemon_and_stop_receiving() {
        start_scheduled_query_processing_internal();
        operation_communication.set_receive_state($$$no);
        while (NIL == agenda.agenda_idleP()) {
            sleep(ONE_INTEGER);
        } 
        return NIL;
    }

    public static SubLObject schedule_query_and_wait_for_processing(final SubLObject kbq) {
        final SubLObject already_done_count = count(kbq, $completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject query_event = add_single_query_schedule(kbq, date_utilities.indexical_now(), NIL, NIL, $$ScheduledQueryDaemon, $$ScheduledQueryTesting_Allotment);
        try {
            if (NIL != run_scheduled_queries_on_this_imageP()) {
                while (!count(kbq, $completed_queries$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).numG(already_done_count)) {
                    sleep(ONE_INTEGER);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                cleanup_scheduled_query(query_event);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static SubLObject get_scheduled_query_results(final SubLObject kbq, SubLObject existing_results) {
        if (existing_results == UNPROVIDED) {
            existing_results = get_cached_results_for_cycl_query(kbq);
        }
        while ((NIL != scheduled_query_in_progressP(kbq)) || (NIL == operation_queues.local_queue_empty())) {
            sleep(ONE_INTEGER);
        } 
        return set_difference(get_cached_results_for_cycl_query(kbq), existing_results, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_scheduled_queries_file() {
        declareFunction(me, "start_scheduled_query_processing", "START-SCHEDULED-QUERY-PROCESSING", 0, 1, false);
        declareFunction(me, "maybe_verify_test_query", "MAYBE-VERIFY-TEST-QUERY", 1, 0, false);
        declareFunction(me, "halt_scheduled_query_processing", "HALT-SCHEDULED-QUERY-PROCESSING", 0, 0, false);
        declareFunction(me, "add_recurring_query_schedule", "ADD-RECURRING-QUERY-SCHEDULE", 2, 4, false);
        declareFunction(me, "make_recurring_query_schedule_assertions", "MAKE-RECURRING-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
        declareFunction(me, "note_query_scheduling_complete", "NOTE-QUERY-SCHEDULING-COMPLETE", 1, 0, false);
        declareFunction(me, "add_single_query_schedule", "ADD-SINGLE-QUERY-SCHEDULE", 2, 4, false);
        declareFunction(me, "make_single_query_schedule_assertions", "MAKE-SINGLE-QUERY-SCHEDULE-ASSERTIONS", 2, 4, false);
        declareFunction(me, "remove_recurring_query_schedule", "REMOVE-RECURRING-QUERY-SCHEDULE", 2, 2, false);
        declareFunction(me, "remove_single_query_schedule", "REMOVE-SINGLE-QUERY-SCHEDULE", 2, 2, false);
        declareFunction(me, "scheduled_query_series_type", "SCHEDULED-QUERY-SERIES-TYPE", 2, 0, false);
        declareFunction(me, "get_series_scheduler", "GET-SERIES-SCHEDULER", 1, 0, false);
        declareFunction(me, "get_query_scheduling_mt", "GET-QUERY-SCHEDULING-MT", 0, 2, false);
        declareFunction(me, "get_cached_results_for_cycl_query", "GET-CACHED-RESULTS-FOR-CYCL-QUERY", 1, 0, false);
        declareFunction(me, "get_reified_inference_answer_count", "GET-REIFIED-INFERENCE-ANSWER-COUNT", 1, 0, false);
        declareFunction(me, "get_schedules_for_cycl_query", "GET-SCHEDULES-FOR-CYCL-QUERY", 1, 0, false);
        declareFunction(me, "scheduled_query_queue", "SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction(me, "get_scheduled_query_queue", "GET-SCHEDULED-QUERY-QUEUE", 0, 2, false);
        declareFunction(me, "clear_scheduled_query_queue", "CLEAR-SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction(me, "scheduled_query_plist", "SCHEDULED-QUERY-PLIST", 1, 0, false);
        declareFunction(me, "index_scheduled_query", "INDEX-SCHEDULED-QUERY", 1, 0, false);
        declareFunction(me, "lookup_scheduled_query", "LOOKUP-SCHEDULED-QUERY", 1, 0, false);
        declareFunction(me, "scheduled_query_p", "SCHEDULED-QUERY-P", 1, 0, false);
        declareFunction(me, "scheduled_query_kbq", "SCHEDULED-QUERY-KBQ", 1, 0, false);
        declareFunction(me, "scheduled_query_scheduled_run_time", "SCHEDULED-QUERY-SCHEDULED-RUN-TIME", 1, 0, false);
        declareFunction(me, "scheduled_query_instance", "SCHEDULED-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "package_scheduled_query", "PACKAGE-SCHEDULED-QUERY", 3, 0, false);
        declareFunction(me, "remove_query_or_series_from_queue", "REMOVE-QUERY-OR-SERIES-FROM-QUEUE", 1, 0, false);
        declareFunction(me, "enqueue_scheduled_query", "ENQUEUE-SCHEDULED-QUERY", 1, 0, false);
        declareFunction(me, "dequeue_scheduled_query", "DEQUEUE-SCHEDULED-QUERY", 0, 0, false);
        declareFunction(me, "next_scheduled_query", "NEXT-SCHEDULED-QUERY", 0, 0, false);
        declareFunction(me, "populate_scheduled_query_queue", "POPULATE-SCHEDULED-QUERY-QUEUE", 0, 0, false);
        declareFunction(me, "schedule_query", "SCHEDULE-QUERY", 2, 1, false);
        declareFunction(me, "add_scheduled_query", "ADD-SCHEDULED-QUERY", 2, 0, false);
        declareFunction(me, "find_next_scheduled_time", "FIND-NEXT-SCHEDULED-TIME", 2, 0, false);
        declareFunction(me, "find_next_scheduled_date", "FIND-NEXT-SCHEDULED-DATE", 2, 0, false);
        declareFunction(me, "next_run_date_for_query_series", "NEXT-RUN-DATE-FOR-QUERY-SERIES", 2, 0, false);
        declareFunction(me, "scheduled_run_date_for_query", "SCHEDULED-RUN-DATE-FOR-QUERY", 1, 0, false);
        declareFunction(me, "kbq_for_query_event_or_series", "KBQ-FOR-QUERY-EVENT-OR-SERIES", 1, 0, false);
        declareFunction(me, "get_currently_running_scheduled_queries", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES", 0, 2, false);
        declareFunction(me, "get_currently_running_scheduled_queries_internal", "GET-CURRENTLY-RUNNING-SCHEDULED-QUERIES-INTERNAL", 0, 0, false);
        declareFunction(me, "scheduled_query_problem_store_inferences_plists", "SCHEDULED-QUERY-PROBLEM-STORE-INFERENCES-PLISTS", 1, 0, false);
        declareFunction(me, "scheduled_query_inference_plist", "SCHEDULED-QUERY-INFERENCE-PLIST", 1, 0, false);
        declareFunction(me, "abort_scheduled_query", "ABORT-SCHEDULED-QUERY", 1, 2, false);
        declareFunction(me, "abort_active_scheduled_queries", "ABORT-ACTIVE-SCHEDULED-QUERIES", 0, 0, false);
        declareFunction(me, "abort_scheduled_query_internal", "ABORT-SCHEDULED-QUERY-INTERNAL", 1, 0, false);
        declareFunction(me, "should_skipXabort_scheduled_queryP", "SHOULD-SKIP/ABORT-SCHEDULED-QUERY?", 1, 0, false);
        declareFunction(me, "note_scheduled_query_in_progress", "NOTE-SCHEDULED-QUERY-IN-PROGRESS", 1, 0, false);
        declareFunction(me, "note_scheduled_query_finished_running", "NOTE-SCHEDULED-QUERY-FINISHED-RUNNING", 1, 0, false);
        declareFunction(me, "scheduled_query_in_progressP", "SCHEDULED-QUERY-IN-PROGRESS?", 1, 0, false);
        declareFunction(me, "run_packaged_scheduled_query", "RUN-PACKAGED-SCHEDULED-QUERY", 1, 0, false);
        declareFunction(me, "cleanup_scheduled_query", "CLEANUP-SCHEDULED-QUERY", 1, 0, false);
        declareFunction(me, "run_scheduled_query_internal", "RUN-SCHEDULED-QUERY-INTERNAL", 2, 0, false);
        declareFunction(me, "get_mime_type_for_delimiter", "GET-MIME-TYPE-FOR-DELIMITER", 1, 0, false);
        declareFunction(me, "get_subl_character", "GET-SUBL-CHARACTER", 1, 0, false);
        declareFunction(me, "maybe_email_scheduled_query_results", "MAYBE-EMAIL-SCHEDULED-QUERY-RESULTS", 2, 0, false);
        declareFunction(me, "results_should_be_emailed_to_address", "RESULTS-SHOULD-BE-EMAILED-TO-ADDRESS", 0, 0, false);
        declareFunction(me, "get_email_recipients_for_scheduled_query_results", "GET-EMAIL-RECIPIENTS-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
        declareFunction(me, "get_email_cc_for_scheduled_query_results", "GET-EMAIL-CC-FOR-SCHEDULED-QUERY-RESULTS", 1, 0, false);
        declareFunction(me, "get_scheduled_query_results_message", "GET-SCHEDULED-QUERY-RESULTS-MESSAGE", 2, 0, false);
        declareFunction(me, "get_scheduled_query_results_subject", "GET-SCHEDULED-QUERY-RESULTS-SUBJECT", 2, 0, false);
        declareFunction(me, "extension_for_delimiter", "EXTENSION-FOR-DELIMITER", 1, 0, false);
        declareFunction(me, "get_scheduled_report_results_subject", "GET-SCHEDULED-REPORT-RESULTS-SUBJECT", 3, 0, false);
        declareMacro(me, "do_smtp_accounts_for_cyclist", "DO-SMTP-ACCOUNTS-FOR-CYCLIST");
        declareFunction(me, "try_to_email_scheduled_query_results", "TRY-TO-EMAIL-SCHEDULED-QUERY-RESULTS", 5, 0, false);
        declareFunction(me, "email_scheduled_query_results", "EMAIL-SCHEDULED-QUERY-RESULTS", 6, 0, false);
        declareFunction(me, "reify_scheduled_query_in_series", "REIFY-SCHEDULED-QUERY-IN-SERIES", 2, 0, false);
        declareFunction(me, "scheduled_query_series_query_type", "SCHEDULED-QUERY-SERIES-QUERY-TYPE", 1, 0, false);
        declareFunction(me, "run_scheduled_query", "RUN-SCHEDULED-QUERY", 2, 0, false);
        declareFunction(me, "scheduled_query_problem_store_directory", "SCHEDULED-QUERY-PROBLEM-STORE-DIRECTORY", 0, 0, false);
        declareFunction(me, "new_path_for_scheduled_query_problem_store", "NEW-PATH-FOR-SCHEDULED-QUERY-PROBLEM-STORE", 1, 0, false);
        declareFunction(me, "start_scheduled_query_processing_internal", "START-SCHEDULED-QUERY-PROCESSING-INTERNAL", 0, 0, false);
        declareFunction(me, "set_scheduled_query_image_flag", "SET-SCHEDULED-QUERY-IMAGE-FLAG", 1, 0, false);
        declareFunction(me, "find_possible_scheduled_query_daemon_images", "FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES", 0, 0, false);
        declareFunction(me, "run_scheduled_queries_on_this_imageP", "RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?", 0, 0, false);
        declareFunction(me, "ensure_scheduled_query_daemon_is_running", "ENSURE-SCHEDULED-QUERY-DAEMON-IS-RUNNING", 0, 0, false);
        declareFunction(me, "launch_scheduled_query_runner", "LAUNCH-SCHEDULED-QUERY-RUNNER", 1, 0, false);
        declareFunction(me, "launch_scheduled_query_daemon", "LAUNCH-SCHEDULED-QUERY-DAEMON", 0, 0, false);
        declareFunction(me, "run_scheduled_queries", "RUN-SCHEDULED-QUERIES", 0, 0, false);
        declareFunction(me, "maybe_run_next_scheduled_query", "MAYBE-RUN-NEXT-SCHEDULED-QUERY", 0, 0, false);
        declareFunction(me, "sqd_note_new_fort", "SQD-NOTE-NEW-FORT", 1, 0, false);
        declareFunction(me, "sqd_cleanup_new_forts", "SQD-CLEANUP-NEW-FORTS", 0, 0, false);
        declareFunction(me, "scheduled_query_test_query", "SCHEDULED-QUERY-TEST-QUERY", 0, 0, false);
        declareMacro(me, "with_sqd_timeout", "WITH-SQD-TIMEOUT");
        declareFunction(me, "start_daemon_and_schedule_query_once", "START-DAEMON-AND-SCHEDULE-QUERY-ONCE", 0, 2, false);
        declareFunction(me, "schedule_test_query_and_wait_for_results", "SCHEDULE-TEST-QUERY-AND-WAIT-FOR-RESULTS", 0, 2, false);
        declareFunction(me, "schedule_query_once_and_start_daemon", "SCHEDULE-QUERY-ONCE-AND-START-DAEMON", 0, 2, false);
        declareFunction(me, "start_daemon_and_stop_receiving", "START-DAEMON-AND-STOP-RECEIVING", 0, 0, false);
        declareFunction(me, "schedule_query_and_wait_for_processing", "SCHEDULE-QUERY-AND-WAIT-FOR-PROCESSING", 1, 0, false);
        declareFunction(me, "get_scheduled_query_results", "GET-SCHEDULED-QUERY-RESULTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_scheduled_queries_file() {
        deflexical("*SCHEDULED-QUERY-QUEUE*", $UNINITIALIZED);
        deflexical("*SCHEDULED-QUERY-QUEUE-LOCK*", make_lock($$$Scheduled_Query_Queue_Lock));
        deflexical("*UT-OFFSET-TO-UNIX-TIME*", $int$2208988800);
        deflexical("*SCHEDULED-QUERY-INDEX*", SubLTrampolineFile.maybeDefault($scheduled_query_index$, $scheduled_query_index$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*IN-PROGRESS-QUERIES*", NIL);
        deflexical("*COMPLETED-QUERIES*", NIL);
        deflexical("*MAX-NUMBER-OF-SIMULTANEOUS-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault($max_number_of_simultaneous_scheduled_queries$, $max_number_of_simultaneous_scheduled_queries$, ONE_INTEGER));
        deflexical("*ACTIVE-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault($active_scheduled_queries$, $active_scheduled_queries$, NIL));
        deflexical("*ABORTED-SCHEDULED-QUERIES*", SubLTrampolineFile.maybeDefault($aborted_scheduled_queries$, $aborted_scheduled_queries$, NIL));
        deflexical("*SCHEDULED-QUERY-CLEANUP-LOCK*", make_lock($$$Scheduled_Query_Cleanup_Lock));
        deflexical("*SCHEDULED-QUERY-RESULTS-MESSAGE-TEMPLATE*", $str136$The_following_query_has_been_run_);
        deflexical("*SCHEDULED-QUERY-DAEMON*", SubLTrampolineFile.maybeDefault($scheduled_query_daemon$, $scheduled_query_daemon$, () -> misc_utilities.uninitialized()));
        deflexical("*SCHEDULED-QUERY-COMPUTER-INFO-MT*", $$QuerySchedulerDaemonComputersMt);
        deflexical("*RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?*", SubLTrampolineFile.maybeDefault($sym189$_RUN_SCHEDULED_QUERIES_ON_THIS_IMAGE__, $run_scheduled_queries_on_this_imageP$, NIL));
        deflexical("*SCHEDULED-QUERY-RUNNER-ISG*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defparameter("*SQD-NEW-FORTS-TO-CLEANUP*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject setup_scheduled_queries_file() {
        register_external_symbol(ADD_RECURRING_QUERY_SCHEDULE);
        register_external_symbol(ADD_SINGLE_QUERY_SCHEDULE);
        register_external_symbol(REMOVE_RECURRING_QUERY_SCHEDULE);
        register_external_symbol(REMOVE_SINGLE_QUERY_SCHEDULE);
        register_external_symbol(GET_CACHED_RESULTS_FOR_CYCL_QUERY);
        register_external_symbol(GET_SCHEDULES_FOR_CYCL_QUERY);
        register_external_symbol(GET_SCHEDULED_QUERY_QUEUE);
        declare_defglobal($scheduled_query_index$);
        register_kb_function(ADD_SCHEDULED_QUERY);
        declare_defglobal($max_number_of_simultaneous_scheduled_queries$);
        declare_defglobal($active_scheduled_queries$);
        register_external_symbol(GET_CURRENTLY_RUNNING_SCHEDULED_QUERIES);
        declare_defglobal($aborted_scheduled_queries$);
        register_external_symbol(ABORT_SCHEDULED_QUERY);
        declare_defglobal($scheduled_query_daemon$);
        declare_defglobal($sym189$_RUN_SCHEDULED_QUERIES_ON_THIS_IMAGE__);
        register_external_symbol(FIND_POSSIBLE_SCHEDULED_QUERY_DAEMON_IMAGES);
        define_test_case_table_int(START_DAEMON_AND_SCHEDULE_QUERY_ONCE, list(new SubLObject[]{ $TEST, TREE_MATCHES_PATTERN, $OWNER, NIL, $CLASSES, $list204, $KB, $FULL, $WORKING_, NIL }), $list208);
        define_test_case_table_int(SCHEDULE_QUERY_ONCE_AND_START_DAEMON, list(new SubLObject[]{ $TEST, TREE_MATCHES_PATTERN, $OWNER, NIL, $CLASSES, $list204, $KB, $FULL, $WORKING_, NIL }), $list208);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_scheduled_queries_file();
    }

    @Override
    public void initializeVariables() {
        init_scheduled_queries_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_scheduled_queries_file();
    }
}

