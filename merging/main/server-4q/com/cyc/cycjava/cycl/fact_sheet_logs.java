package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class fact_sheet_logs extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new fact_sheet_logs();

    public static final String myName = "com.cyc.cycjava_2.cycl.fact_sheet_logs";




    // defparameter
    public static final SubLSymbol $fact_sheet_log_stream$ = makeSymbol("*FACT-SHEET-LOG-STREAM*");



    // defparameter
    public static final SubLSymbol $next_fact_sheet_hourly_report_time$ = makeSymbol("*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*");

    // defparameter
    public static final SubLSymbol $hourly_fact_sheet_stats$ = makeSymbol("*HOURLY-FACT-SHEET-STATS*");

    // deflexical
    private static final SubLSymbol $fact_sheet_log_file_properties$ = makeSymbol("*FACT-SHEET-LOG-FILE-PROPERTIES*");



    // deflexical
    private static final SubLSymbol $fact_sheet_log_file_uniquifier_lock$ = makeSymbol("*FACT-SHEET-LOG-FILE-UNIQUIFIER-LOCK*");



    private static final SubLList $list1 = list(list(makeSymbol("*FACT-SHEET-LOG-STREAM*"), makeSymbol("*NULL-OUTPUT*")));

    private static final SubLSymbol LOG_FACT_SHEET_MESSAGE = makeSymbol("LOG-FACT-SHEET-MESSAGE");

    private static final SubLList $list3 = list(makeSymbol("LOG-FACT-SHEET-WARNING"), makeSymbol("LOG-FACT-SHEET-NOTE"));

    private static final SubLList $list4 = list(makeSymbol("MSG-TYPE"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol $sym5$STREAM = makeUninternedSymbol("STREAM");

    private static final SubLList $list6 = list(list(makeSymbol("FACT-SHEET-LOG-STREAM")));







    private static final SubLList $list10 = list(list(EQ, list(makeSymbol("CURRENT-PROCESS")), list(makeSymbol("INITIAL-PROCESS"))));





    private static final SubLSymbol PRINT_FACT_SHEET_LOG_HEADER = makeSymbol("PRINT-FACT-SHEET-LOG-HEADER");





    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str17$__ = makeString(": ");

    private static final SubLList $list18 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLString $$$WARN = makeString("WARN");

    private static final SubLString $$$NOTE = makeString("NOTE");

    private static final SubLList $list21 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $fact_sheet_log_file$ = makeSymbol("*FACT-SHEET-LOG-FILE*");



    private static final SubLList $list24 = list(makeSymbol("*FACT-SHEET-LOG-STREAM*"), makeSymbol("*FACT-SHEET-LOG-FILE*"), makeKeyword("APPEND"));

    private static final SubLSymbol $sym25$DIRECTORY = makeUninternedSymbol("DIRECTORY");

    private static final SubLSymbol $sym26$FILENAME = makeUninternedSymbol("FILENAME");

    private static final SubLSymbol $sym27$ALREADY_LOGGING_ = makeUninternedSymbol("ALREADY-LOGGING?");

    private static final SubLSymbol $sym28$USE_NEW_SETUP_ = makeUninternedSymbol("USE-NEW-SETUP?");

    private static final SubLList $list29 = list(list(makeSymbol("STRINGP"), makeSymbol("*FACT-SHEET-LOG-FILE*")));





    private static final SubLList $list32 = list(list(makeSymbol("OPEN-NEW-UNIQUE-FACT-SHEET-LOG-FILE")));







    private static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

    private static final SubLString $str37$__Logging_Fact_Sheet_generation_t = makeString("~&Logging Fact-Sheet generation to file:~% ~S~%");

    private static final SubLList $list38 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*STANDARD-OUTPUT*")));

    private static final SubLSymbol WITH_FACT_SHEET_LOG_FILE = makeSymbol("WITH-FACT-SHEET-LOG-FILE");



    private static final SubLList $list41 = list(makeSymbol("*FACT-SHEET-LOG-FILE*"));

    private static final SubLList $list42 = list(list(makeSymbol("LOG-FACT-SHEET-NOTE"), makeString("Closing log.")), list(makeSymbol("NOTE-FACT-SHEET-LOG-FILE-CLOSED")));

    private static final SubLSymbol $closed_fact_sheet_log_files$ = makeSymbol("*CLOSED-FACT-SHEET-LOG-FILES*");

    private static final SubLSymbol NOTE_FACT_SHEET_LOG_FILE_CLOSED = makeSymbol("NOTE-FACT-SHEET-LOG-FILE-CLOSED");

    private static final SubLSymbol WITH_FACT_SHEET_LOGGING = makeSymbol("WITH-FACT-SHEET-LOGGING");

    private static final SubLList $list46 = list(list(makeSymbol("*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*")), list(makeSymbol("*HOURLY-FACT-SHEET-STATS*"), list(makeSymbol("MAKE-VECTOR"), TWO_INTEGER, ZERO_INTEGER)));

    private static final SubLList $list47 = list(makeSymbol("RESET-HOURLY-REPORT-TIME"));

    private static final SubLSymbol RESET_HOURLY_REPORT_TIME = makeSymbol("RESET-HOURLY-REPORT-TIME");

    private static final SubLSymbol WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING = makeSymbol("WITH-FACT-SHEET-LOGGING-AND-HOURLY-REPORTING");

    private static final SubLString $str50$Hourly_report__Generated__S_fact_ = makeString("Hourly report: Generated ~S fact sheets. Suffered ~S query timeouts.");

    private static final SubLString $$$Counting_fact_sheets_in_ = makeString("Counting fact sheets in ");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str53$Gathering_time_info_for_fact_shee = makeString("Gathering time info for fact sheets in ");



    private static final SubLList $list55 = cons(makeSymbol("DATE-STRING"), makeSymbol("COUNT"));

    private static final SubLSymbol $sym56$DATESTRING_ = makeSymbol("DATESTRING<");

    private static final SubLSymbol $XDATA = makeKeyword("XDATA");

    private static final SubLString $$$time = makeString("time");

    private static final SubLSymbol $TIMEFMT = makeKeyword("TIMEFMT");

    private static final SubLString $str60$__m__d__Y_ = makeString("\"%m/%d/%Y\"");



    private static final SubLString $$$Date = makeString("Date");



    private static final SubLString $str64$__of_Fact_Sheets = makeString("# of Fact Sheets");





    private static final SubLList $list67 = list(makeString("Fact Sheets per Day"));



    private static final SubLString $$$Categorizing_fact_sheets_in_ = makeString("Categorizing fact sheets in ");

    private static final SubLString $$$_by_date = makeString(" by date");

    private static final SubLSymbol $END_DATE = makeKeyword("END-DATE");

    private static final SubLString $$$Analyzing_fact_sheet_times_in_ = makeString("Analyzing fact sheet times in ");

    private static final SubLString $str73$Analyzing_fact_sheet_categorizati = makeString("Analyzing fact sheet categorization in ");

    private static final SubLSymbol $CATEGORY_COUNT = makeKeyword("CATEGORY-COUNT");

    private static final SubLString $str75$Analyzing_fact_sheet_sentence_cou = makeString("Analyzing fact sheet sentence count in ");

    private static final SubLSymbol $PPH_SENTENCE_COUNT = makeKeyword("PPH-SENTENCE-COUNT");

    private static final SubLString $str77$Analyzing_fact_sheet_uncategorize = makeString("Analyzing fact sheet uncategorized sentence count in ");

    private static final SubLSymbol $MISC_SENTENCE_COUNT = makeKeyword("MISC-SENTENCE-COUNT");

    private static final SubLList $list79 = cons(makeSymbol("DATE-STRING"), makeSymbol("FAILURES"));

    private static final SubLSymbol $sym80$_ = makeSymbol(">");

    private static final SubLList $list81 = list(makeSymbol("DATE-STRING"), makeSymbol("FAILURES"));

    private static final SubLString $$$Failure_Rate = makeString("Failure Rate");

    private static final SubLString $$$Query_Failure_Rates_by_Day = makeString("Query Failure Rates by Day");

    private static final SubLString $$$Analyzing_query_failure_rates_in_ = makeString("Analyzing query failure rates in ");

    private static final SubLList $list85 = cons(makeSymbol("DATE-STRING"), makeSymbol("INFO-CONS"));

    private static final SubLList $list86 = cons(makeSymbol("TOTAL-COUNT"), makeSymbol("QUERY-FAILURE-DICTIONARY"));









    private static final SubLSymbol $QUERY_TIMEOUT_INFO = makeKeyword("QUERY-TIMEOUT-INFO");

    private static final SubLString $$$_generated_on_ = makeString(" generated on ");

    private static final SubLString $$$Finished_fact_sheet = makeString("Finished fact sheet");

    private static final SubLString $str94$____Finished_fact_sheet = makeString(" .* Finished fact sheet");

    private static final SubLList $list95 = list(new SubLObject[]{ makeKeyword("VERBOSITY"), $TERM, makeKeyword("STATUS"), makeKeyword("START-DATE"), makeKeyword("START-TIME"), makeKeyword("END-DATE"), makeKeyword("END-TIME"), makeKeyword("QUERY-TIMEOUTS"), makeKeyword("QUERY-TIMEOUT-INFO"), makeKeyword("MISC-SENTENCE-COUNT"), makeKeyword("MISC-SENTENCE-TIME"), makeKeyword("FILTERED-REDUNDANT-FACT-COUNT"), makeKeyword("CATEGORY-COUNT"), makeKeyword("INFO-GATHERING-TIME"), makeKeyword("PPH-PARAGRAPH-COUNT"), makeKeyword("PPH-SENTENCE-COUNT"), makeKeyword("PPH-FAILURE-COUNT"), makeKeyword("PPH-TIME"), makeKeyword("TOTAL-TIME") });

    private static final SubLSymbol GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED = makeSymbol("GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED");



    private static final SubLSymbol $get_fact_sheet_log_directory_data_cached_caching_state$ = makeSymbol("*GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-CACHING-STATE*");

    private static final SubLString $str99$Ensuring_data_file_is_up_to_date_ = makeString("Ensuring data file is up to date...");

    private static final SubLString $str100$_log = makeString(".log");

    private static final SubLString $$$Parsing_data_from_ = makeString("Parsing data from ");

    private static final SubLString $str102$___ = makeString("...");

    private static final SubLSymbol $sym103$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");

    private static final SubLString $str104$ = makeString("");

    private static final SubLString $str105$parsed_data_cfasl = makeString("parsed-data.cfasl");

    private static final SubLString $str106$MM_DD_YYYY_HH_MM_SS_ = makeString("MM/DD/YYYY HH:MM:SS ");



    private static final SubLString $str108$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str109$NOTE__Starting__ = makeString("NOTE: Starting :");

    private static final SubLSymbol $PARSING_DATUM = makeKeyword("PARSING-DATUM");

    private static final SubLString $str111$_Verbosity__ = makeString(" Verbosity: ");

    private static final SubLString $str112$NOTE__Dequeuing_ = makeString("NOTE: Dequeuing ");

    private static final SubLSymbol $DEQUEUED_TERM = makeKeyword("DEQUEUED-TERM");

    private static final SubLString $str114$NOTE__Skipping_ = makeString("NOTE: Skipping ");

    private static final SubLString $str115$NOTE__Updating_ = makeString("NOTE: Updating ");

    private static final SubLString $str116$NOTE__Updating_all_stale_fact_she = makeString("NOTE: Updating all stale fact sheets from ");

    private static final SubLString $str117$NOTE__Updating_stale_fact_sheet_f = makeString("NOTE: Updating stale fact sheet for ");

    private static final SubLString $str118$WARN__Hit_soft_timeout_of_ = makeString("WARN: Hit soft timeout of ");

    private static final SubLSymbol $QUERY_TIMEOUTS = makeKeyword("QUERY-TIMEOUTS");



    private static final SubLSymbol $HIT_QUERY_TIMEOUT = makeKeyword("HIT-QUERY-TIMEOUT");

    private static final SubLString $str122$NOTE__ = makeString("NOTE: ");

    private static final SubLSymbol $LOOKING_FOR_TIMED_OUT_QUERY_YIELD = makeKeyword("LOOKING-FOR-TIMED-OUT-QUERY-YIELD");

    private static final SubLString $$$_yielded_ = makeString(" yielded ");

    private static final SubLSymbol $PARAGRAPH_COUNT = makeKeyword("PARAGRAPH-COUNT");

    private static final SubLString $str126$WARN__Launching_make_up_updater = makeString("WARN: Launching make-up updater");

    private static final SubLString $str127$We_appear_to_have_aborted_the_fac = makeString("We appear to have aborted the fact-sheet generation for~% ~S (launched make-up updater)~% ~S");



    private static final SubLString $str129$NOTE__Added_ = makeString("NOTE: Added ");

    private static final SubLString $str130$NOTE__Gathered_ = makeString("NOTE: Gathered ");

    private static final SubLString $$$_implies_ = makeString(" implies ");

    private static final SubLSymbol $FILTERED_REDUNDANT_FACT_COUNT = makeKeyword("FILTERED-REDUNDANT-FACT-COUNT");

    private static final SubLString $str133$NOTE__Generated_ = makeString("NOTE: Generated ");

    private static final SubLString $str134$WARN__Failed_to_paraphrase_ = makeString("WARN: Failed to paraphrase ");

    private static final SubLString $str135$WARN__Query_failed_to_get_mini_fa = makeString("WARN: Query failed to get mini fact sheet for ");

    private static final SubLString $str136$NOTE__Query_got_mini_fact_sheet_o = makeString("NOTE: Query got mini fact sheet of length 120 for ");

    private static final SubLString $str137$NOTE__Finished_fact_sheet_for_ = makeString("NOTE: Finished fact sheet for ");

    private static final SubLString $str138$Found_finish_line__but_state_is__ = makeString("Found finish line, but state is ~S~% Current datum: ~S~%~S~%~S");

    private static final SubLString $str139$We_appear_to_have_aborted_the_fac = makeString("We appear to have aborted the fact-sheet generation for~% ~S (end of log file)~% ~S");

    private static final SubLInteger $int$35 = makeInteger(35);

    private static final SubLString $$$update_on_ = makeString("update on ");

    private static final SubLString $str142$__Status = makeString(". Status");

    private static final SubLString $str143$__Status__ = makeString(". Status: ");



    private static final SubLSymbol $START_DATE = makeKeyword("START-DATE");





    private static final SubLInteger $int$46 = makeInteger(46);

    private static final SubLSymbol $TIMEOUT_TIME = makeKeyword("TIMEOUT-TIME");

    private static final SubLString $$$seconds_after_getting = makeString("seconds after getting");

    private static final SubLSymbol $RESULT_COUNT = makeKeyword("RESULT-COUNT");

    private static final SubLString $$$THCL_sentences_in = makeString("THCL sentences in");

    private static final SubLSymbol $MISC_SENTENCE_TIME = makeKeyword("MISC-SENTENCE-TIME");

    private static final SubLSymbol $PPH_PARAGRAPH_COUNT = makeKeyword("PPH-PARAGRAPH-COUNT");

    private static final SubLString $$$paragraphs_containing_ = makeString("paragraphs containing ");

    private static final SubLString $$$sentences_for_ = makeString("sentences for ");

    private static final SubLString $str157$Must_have_missed_the__Finished__l = makeString("Must have missed the 'Finished' line for ~S");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLSymbol $PPH_TIME = makeKeyword("PPH-TIME");

    private static final SubLSymbol $PPH_FAILURE_COUNT = makeKeyword("PPH-FAILURE-COUNT");

    private static final SubLString $$$groups_of_sentences_for_ = makeString("groups of sentences for ");

    private static final SubLSymbol $INFO_GATHERING_TIME = makeKeyword("INFO-GATHERING-TIME");



    private static final SubLString $str164$___ = makeString("#<(");

    private static final SubLString $str165$__ = makeString("#<");

    private static final SubLString $str166$Couldn_t_determine_term_from__S = makeString("Couldn't determine term from ~S");

    private static final SubLString $str167$fact_sheet_log_file_uniquifier_lo = makeString("fact-sheet-log-file-uniquifier-lock");

    private static final SubLString $str168$_ = makeString("-");

    private static final SubLString $$$0775 = makeString("0775");

    private static final SubLString $$$logs = makeString("logs");

    private static final SubLString $str171$_5__0D = makeString("~5,'0D");



    private static final SubLString $str173$Opening_log_ = makeString("Opening log.");

    private static final SubLString $$$755 = makeString("755");

    private static final SubLSymbol LIST_OF_STRING_P = makeSymbol("LIST-OF-STRING-P");

    private static final SubLString $str176$_ = makeString("/");

    public static SubLObject fact_sheet_log_stream() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $fact_sheet_log_stream$.getDynamicValue(thread);
    }

    public static SubLObject with_quiet_fact_sheet_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject log_fact_sheet_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject msg_type = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        msg_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject stream = $sym5$STREAM;
        return list(CLET, list(bq_cons(stream, $list6)), list(PWHEN, list(COR, listS(CAND, list(EQ, T, stream), $list10), list(CAND, list(STREAMP, stream), list(OUTPUT_STREAM_P, stream))), list(PRINT_FACT_SHEET_LOG_HEADER, msg_type, stream), listS(FORMAT, stream, format_str, append(args, NIL)), list(FORCE_OUTPUT, stream)));
    }

    public static SubLObject print_fact_sheet_log_header(final SubLObject msg_type, final SubLObject stream) {
        terpri(stream);
        princ(numeric_date_utilities.datestring(UNPROVIDED), stream);
        princ($$$_, stream);
        princ(numeric_date_utilities.secondstring(UNPROVIDED), stream);
        princ($$$_, stream);
        princ(msg_type, stream);
        princ($str17$__, stream);
        return NIL;
    }

    public static SubLObject log_fact_sheet_warning(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(LOG_FACT_SHEET_MESSAGE, $$$WARN, format_str, append(args, NIL));
    }

    public static SubLObject log_fact_sheet_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(LOG_FACT_SHEET_MESSAGE, $$$NOTE, format_str, append(args, NIL));
    }

    public static SubLObject with_fact_sheet_log_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(list($fact_sheet_log_file$, filename)), listS(WITH_PRIVATE_TEXT_FILE, $list24, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list21);
        return NIL;
    }

    public static SubLObject with_fact_sheet_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject directory = $sym25$DIRECTORY;
        final SubLObject filename = $sym26$FILENAME;
        final SubLObject already_loggingP = $sym27$ALREADY_LOGGING_;
        final SubLObject use_new_setupP = $sym28$USE_NEW_SETUP_;
        return list(CLET, list(bq_cons(already_loggingP, $list29), directory, filename, use_new_setupP), list(PUNLESS, already_loggingP, listS(CMULTIPLE_VALUE_SETQ, list(directory, filename), $list32), list(CSETQ, use_new_setupP, list(CAND, list(DIRECTORY_P, directory), list(STRINGP, filename)))), listS(PWHEN, use_new_setupP, list(FORMAT, $standard_output$, $str37$__Logging_Fact_Sheet_generation_t, filename), $list38), listS(WITH_FACT_SHEET_LOG_FILE, list(listS(FIF, use_new_setupP, filename, $list41)), append(body, list(listS(PWHEN, use_new_setupP, $list42)))));
    }

    public static SubLObject note_fact_sheet_log_file_closed(SubLObject file) {
        if (file == UNPROVIDED) {
            file = $fact_sheet_log_file$.getDynamicValue();
        }
        $closed_fact_sheet_log_files$.setGlobalValue(cons(file, $closed_fact_sheet_log_files$.getGlobalValue()));
        return $closed_fact_sheet_log_files$.getGlobalValue();
    }

    public static SubLObject fact_sheet_log_file_closed_p(final SubLObject file) {
        return subl_promotions.memberP(file, $closed_fact_sheet_log_files$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject hourly_fact_sheet_stats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hourly_fact_sheet_stats$.getDynamicValue(thread);
    }

    public static SubLObject with_fact_sheet_logging_and_hourly_reporting(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_FACT_SHEET_LOGGING, listS(CLET, $list46, $list47, append(body, NIL)));
    }

    public static SubLObject fact_sheet_hourly_reporting_onP() {
        return vectorp(hourly_fact_sheet_stats());
    }

    public static SubLObject reset_hourly_report_time(SubLObject time) {
        if (time == UNPROVIDED) {
            time = numeric_date_utilities.universal_time_from_now(ZERO_INTEGER, ZERO_INTEGER, ONE_INTEGER);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $next_fact_sheet_hourly_report_time$.setDynamicValue(time, thread);
        return $next_fact_sheet_hourly_report_time$.getDynamicValue(thread);
    }

    public static SubLObject clear_hourly_fact_sheet_stats() {
        clear_hourly_fact_sheet_update_count();
        clear_hourly_fact_sheet_query_timeout_count();
        return hourly_fact_sheet_stats();
    }

    public static SubLObject add_fact_sheet_info_to_hourly_stats(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hourly_fact_sheet_stats().isVector()) {
            set_aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ZERO_INTEGER, add(aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ZERO_INTEGER), ONE_INTEGER));
        }
        return v_term;
    }

    public static SubLObject get_hourly_fact_sheet_update_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ZERO_INTEGER);
    }

    public static SubLObject clear_hourly_fact_sheet_update_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ZERO_INTEGER, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject note_fact_sheet_query_timeout_in_hourly_stats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != fact_sheet_hourly_reporting_onP()) {
            set_aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ONE_INTEGER, add(aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ONE_INTEGER), ONE_INTEGER));
        }
        return NIL;
    }

    public static SubLObject get_hourly_fact_sheet_query_timeout_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ONE_INTEGER);
    }

    public static SubLObject clear_hourly_fact_sheet_query_timeout_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_aref($hourly_fact_sheet_stats$.getDynamicValue(thread), ONE_INTEGER, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject maybe_log_fact_sheet_hourly_report() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != numeric_date_utilities.universal_time_p($next_fact_sheet_hourly_report_time$.getDynamicValue(thread))) && get_universal_time().numG($next_fact_sheet_hourly_report_time$.getDynamicValue(thread))) {
            log_fact_sheet_hourly_report();
        }
        return NIL;
    }

    public static SubLObject log_fact_sheet_hourly_report() {
        final SubLObject fact_sheet_count = get_hourly_fact_sheet_update_count();
        final SubLObject timeout_count = get_hourly_fact_sheet_query_timeout_count();
        final SubLObject stream = fact_sheet_log_stream();
        if (((T == stream) && current_process().eql(subl_promotions.initial_process())) || (stream.isStream() && (NIL != output_stream_p(stream)))) {
            print_fact_sheet_log_header($$$NOTE, stream);
            format(stream, $str50$Hourly_report__Generated__S_fact_, fact_sheet_count, timeout_count);
            force_output(stream);
        }
        clear_hourly_fact_sheet_stats();
        reset_hourly_report_time(UNPROVIDED);
        return NIL;
    }

    public static SubLObject fact_sheet_log_directory_generated_count(final SubLObject log_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = cconcatenate($$$Counting_fact_sheets_in_, format_nil.format_nil_s_no_copy(log_directory));
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$1 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        total = add(total, fact_sheet_log_file_generated_count(file, UNPROVIDED));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject fact_sheet_log_file_generated_count(final SubLObject log_file, SubLObject data) {
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        return length(data);
    }

    public static SubLObject fact_sheet_log_directory_average_total_time(final SubLObject log_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject time = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = cconcatenate($str53$Gathering_time_info_for_fact_shee, format_nil.format_nil_s_no_copy(log_directory));
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$3 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject this_count = fact_sheet_log_file_generated_count(file, UNPROVIDED);
                        final SubLObject this_time = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        count = add(count, this_count);
                        time = add(time, this_time);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return divide(time, count);
    }

    public static SubLObject fact_sheet_log_file_count_and_total_time(final SubLObject log_file, SubLObject data) {
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject count = fact_sheet_log_file_generated_count(log_file, data);
        SubLObject total_time = ZERO_INTEGER;
        SubLObject cdolist_list_var = data;
        SubLObject plist = NIL;
        plist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject this_time = getf(plist, $TOTAL_TIME, NIL);
            if (NIL != this_time) {
                total_time = add(total_time, this_time);
            } else {
                count = subtract(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            plist = cdolist_list_var.first();
        } 
        return values(count, total_time);
    }

    public static SubLObject plot_fact_sheet_log_directory_generated_count_by_date(final SubLObject log_directory, SubLObject output_file, SubLObject ensure_up_to_dateP) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLObject v_dictionary = fact_sheet_log_directory_generated_count_by_date(log_directory, ensure_up_to_dateP);
        SubLObject data = NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(v_dictionary, $sym56$DATESTRING_);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject date_string = NIL;
            SubLObject count = NIL;
            destructuring_bind_must_consp(current, datum, $list55);
            date_string = current.first();
            current = count = current.rest();
            data = cons(list(date_string, count), data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        plot_generation.generate_lines_graph(list(nreverse(data)), list(new SubLObject[]{ $XDATA, $$$time, $TIMEFMT, $str60$__m__d__Y_, $XLABEL, $$$Date, $YLABEL, $str64$__of_Fact_Sheets, $PLOT_TITLE, log_directory, $LINE_LABELS, $list67, $OUTPUT_FILE, output_file }));
        return output_file;
    }

    public static SubLObject fact_sheet_log_directory_generated_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject progress_message = cconcatenate($$$Categorizing_fact_sheets_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_by_date });
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$5 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        fact_sheet_log_file_generated_count_by_date(file, v_dictionary, file_data);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_file_generated_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED);
            dictionary_utilities.dictionary_increment(v_dictionary, date_string, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_directory_average_total_time_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject progress_message = cconcatenate($$$Analyzing_fact_sheet_times_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_by_date });
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$7 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        fact_sheet_log_file_average_total_time_by_date(file, v_dictionary, file_data);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$7, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_file_average_total_time_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED);
            final SubLObject seconds = list_utilities.plist_lookup(datum, $TOTAL_TIME, ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, NIL);
            if (NIL == date_string_data) {
                date_string_data = cons(ZERO_INTEGER, ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = cons(number_utilities.f_1X(date_string_data.first()), add(seconds, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_directory_average_category_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject progress_message = cconcatenate($str73$Analyzing_fact_sheet_categorizati, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_by_date });
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        fact_sheet_log_file_average_category_count_by_date(file, v_dictionary, file_data);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$9, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_file_average_category_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED);
            final SubLObject count = list_utilities.plist_lookup(datum, $CATEGORY_COUNT, ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, NIL);
            if (NIL == date_string_data) {
                date_string_data = cons(ZERO_INTEGER, ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = cons(number_utilities.f_1X(date_string_data.first()), add(count, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_directory_average_sentence_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject progress_message = cconcatenate($str75$Analyzing_fact_sheet_sentence_cou, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_by_date });
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$11 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        fact_sheet_log_file_average_sentence_count_by_date(file, v_dictionary, file_data);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$11, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_file_average_sentence_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED);
            final SubLObject count = list_utilities.plist_lookup(datum, $PPH_SENTENCE_COUNT, ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, NIL);
            if (NIL == date_string_data) {
                date_string_data = cons(ZERO_INTEGER, ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = cons(number_utilities.f_1X(date_string_data.first()), add(count, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_directory_average_uncategorized_sentence_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject progress_message = cconcatenate($str77$Analyzing_fact_sheet_uncategorize, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_by_date });
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$13 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        fact_sheet_log_file_average_uncategorized_sentence_count_by_date(file, v_dictionary, file_data);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$13, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_file_average_uncategorized_sentence_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED);
            final SubLObject count = list_utilities.plist_lookup(datum, $MISC_SENTENCE_COUNT, ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, NIL);
            if (NIL == date_string_data) {
                date_string_data = cons(ZERO_INTEGER, ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = cons(number_utilities.f_1X(date_string_data.first()), add(count, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject plot_fact_sheet_log_directory_query_failure_rate_by_date(final SubLObject log_directory, SubLObject top_n, SubLObject output_file, SubLObject ensure_up_to_dateP) {
        if (top_n == UNPROVIDED) {
            top_n = FIVE_INTEGER;
        }
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        SubLObject line_labels = NIL;
        SubLObject all_data = NIL;
        SubLObject line_data = NIL;
        SubLObject top_n_queries = NIL;
        SubLObject cdolist_list_var = fact_sheet_log_directory_query_failure_rate_by_date(log_directory, ensure_up_to_dateP);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject date_string = NIL;
            SubLObject failures = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            date_string = current.first();
            current = failures = current.rest();
            all_data = cons(cons(date_string, failures), all_data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        final SubLObject most_recent_failures = all_data.first().rest();
        final SubLObject sorted = dictionary_utilities.sort_dictionary_by_values(most_recent_failures, symbol_function($sym80$_));
        top_n_queries = cdolist_list_var = list_utilities.first_n(top_n, list_utilities.alist_keys(sorted));
        SubLObject top_query = NIL;
        top_query = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject line_datum = NIL;
            SubLObject cdolist_list_var_$15 = all_data;
            SubLObject datum2 = NIL;
            datum2 = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject current2;
                final SubLObject datum_$16 = current2 = datum2;
                SubLObject date_string2 = NIL;
                SubLObject failures2 = NIL;
                destructuring_bind_must_consp(current2, datum_$16, $list81);
                date_string2 = current2.first();
                current2 = current2.rest();
                destructuring_bind_must_consp(current2, datum_$16, $list81);
                failures2 = current2.first();
                current2 = current2.rest();
                if (NIL == current2) {
                    final SubLObject failure_rate_for_query_on_date = dictionary.dictionary_lookup_without_values(failures2, top_query, UNPROVIDED);
                    line_datum = cons(list(date_string2, failure_rate_for_query_on_date), line_datum);
                } else {
                    cdestructuring_bind_error(datum_$16, $list81);
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                datum2 = cdolist_list_var_$15.first();
            } 
            line_data = cons(line_datum, line_data);
            line_labels = cons(princ_to_string(top_query), line_labels);
            cdolist_list_var = cdolist_list_var.rest();
            top_query = cdolist_list_var.first();
        } 
        plot_generation.generate_lines_graph(line_data, list(new SubLObject[]{ $XDATA, $$$time, $TIMEFMT, $str60$__m__d__Y_, $XLABEL, $$$Date, $YLABEL, $$$Failure_Rate, $PLOT_TITLE, cconcatenate($$$Query_Failure_Rates_by_Day, new SubLObject[]{ format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_s_no_copy(log_directory) }), $LINE_LABELS, line_labels, $OUTPUT_FILE, output_file }));
        return output_file;
    }

    public static SubLObject fact_sheet_log_directory_query_failure_rate_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject progress_message = cconcatenate($$$Analyzing_query_failure_rates_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_by_date });
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$17 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        fact_sheet_log_file_query_failure_rate_by_date(file, v_dictionary, file_data);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$17, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        SubLObject results = NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(v_dictionary, $sym56$DATESTRING_);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject date_string = NIL;
            SubLObject info_cons = NIL;
            destructuring_bind_must_consp(current, datum, $list85);
            date_string = current.first();
            current = info_cons = current.rest();
            final SubLObject dictionary_for_date = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject current_$20;
            final SubLObject datum_$19 = current_$20 = info_cons;
            SubLObject total_count = NIL;
            SubLObject query_failure_dictionary = NIL;
            destructuring_bind_must_consp(current_$20, datum_$19, $list86);
            total_count = current_$20.first();
            current_$20 = query_failure_dictionary = current_$20.rest();
            if (total_count.isPositive()) {
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(query_failure_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject failure_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    dictionary.dictionary_enter(dictionary_for_date, query, divide(failure_count, total_count));
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                results = cons(cons(date_string, dictionary_for_date), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    public static SubLObject fact_sheet_log_file_query_failure_rate_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED);
            SubLObject date_string_entry = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, $NOT_FOUND);
            if ($NOT_FOUND == date_string_entry) {
                date_string_entry = cons(ZERO_INTEGER, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_entry);
            }
            if ($NORMAL == list_utilities.plist_lookup(datum, $VERBOSITY, UNPROVIDED)) {
                rplaca(date_string_entry, add(date_string_entry.first(), ONE_INTEGER));
                SubLObject cdolist_list_var_$21 = list_utilities.plist_lookup(datum, $QUERY_TIMEOUT_INFO, NIL);
                SubLObject query_info = NIL;
                query_info = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    final SubLObject query = list_utilities.plist_lookup(query_info, $QUERY, UNPROVIDED);
                    dictionary_utilities.dictionary_increment(date_string_entry.rest(), query, UNPROVIDED);
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    query_info = cdolist_list_var_$21.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return v_dictionary;
    }

    public static SubLObject fact_sheet_log_directory_generated_count_for_date(final SubLObject log_directory, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, UNPROVIDED);
        SubLObject total = ZERO_INTEGER;
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = cconcatenate($$$Counting_fact_sheets_in_, new SubLObject[]{ format_nil.format_nil_s_no_copy(log_directory), $$$_generated_on_, format_nil.format_nil_s_no_copy(universal_date) });
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$22 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), NIL);
                        total = add(total, fact_sheet_log_file_generated_count_for_date(file, universal_date, file_data));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$22, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject fact_sheet_log_file_generated_count_for_date(final SubLObject log_file, SubLObject universal_date, SubLObject data) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (data == UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject datestring = numeric_date_utilities.datestring(universal_date);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = data;
            SubLObject datum = NIL;
            datum = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL == numeric_date_utilities.datestringL(list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED), datestring)) {
                    if (list_utilities.plist_lookup(datum, $END_DATE, UNPROVIDED).equal(datestring)) {
                        count = add(count, ONE_INTEGER);
                    } else {
                        doneP = T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                datum = csome_list_var.first();
            } 
        }
        return count;
    }

    public static SubLObject fact_sheet_log_file_generated_count_old(final SubLObject log_file) {
        return length(regular_expression_utilities.file_grep($$$Finished_fact_sheet, log_file, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject fact_sheet_log_file_generated_count_for_date_old(final SubLObject log_file, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return length(regular_expression_utilities.file_grep(cconcatenate(format_nil.format_nil_a_no_copy(numeric_date_utilities.datestring(universal_date)), $str94$____Finished_fact_sheet), log_file, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject get_fact_sheet_log_file_data(final SubLObject log_file) {
        final SubLObject cfasl_file = parse_and_save_fact_sheet_log_file_data(log_file, UNPROVIDED, UNPROVIDED);
        final SubLObject dictionary_or_alist = cfasl_utilities.cfasl_load(cfasl_file);
        return NIL != dictionary.dictionary_p(dictionary_or_alist) ? dictionary.dictionary_lookup(dictionary_or_alist, file_utilities.pathstring_filename(log_file), NIL) : list_utilities.alist_lookup(dictionary_or_alist, file_utilities.pathstring_filename(log_file), symbol_function(EQUAL), NIL);
    }

    public static SubLObject get_fact_sheet_log_directory_data(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        if (NIL != ensure_up_to_dateP) {
            remove_get_fact_sheet_log_directory_data_cached(log_directory, T);
        }
        return get_fact_sheet_log_directory_data_cached(log_directory, ensure_up_to_dateP);
    }

    public static SubLObject clear_get_fact_sheet_log_directory_data_cached() {
        final SubLObject cs = $get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_fact_sheet_log_directory_data_cached(final SubLObject log_directory, final SubLObject ensure_up_to_dateP) {
        return memoization_state.caching_state_remove_function_results_with_args($get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue(), list(log_directory, ensure_up_to_dateP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_fact_sheet_log_directory_data_cached_internal(final SubLObject log_directory, final SubLObject ensure_up_to_dateP) {
        final SubLObject cfasl_file = find_or_create_fact_sheet_log_directory_data_file(log_directory, ensure_up_to_dateP);
        final SubLObject data = cfasl_utilities.cfasl_load(cfasl_file);
        assert NIL != dictionary.dictionary_p(data) : "dictionary.dictionary_p(data) " + "CommonSymbols.NIL != dictionary.dictionary_p(data) " + data;
        return data;
    }

    public static SubLObject get_fact_sheet_log_directory_data_cached(final SubLObject log_directory, final SubLObject ensure_up_to_dateP) {
        SubLObject caching_state = $get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED, $get_fact_sheet_log_directory_data_cached_caching_state$, NIL, EQUALP, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(log_directory, ensure_up_to_dateP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (log_directory.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && ensure_up_to_dateP.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_fact_sheet_log_directory_data_cached_internal(log_directory, ensure_up_to_dateP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(log_directory, ensure_up_to_dateP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_or_create_fact_sheet_log_directory_data_file(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == UNPROVIDED) {
            ensure_up_to_dateP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject cfasl_file = fact_sheet_log_directory_parsed_data_filename(log_directory);
        if (NIL == file_utilities.file_existsP(cfasl_file)) {
            return parse_and_save_fact_sheet_log_directory_data(log_directory);
        }
        final SubLObject file_write_date = Filesys.file_write_date(cfasl_file);
        SubLObject directory_data = (NIL != file_utilities.file_existsP(cfasl_file)) ? cfasl_utilities.cfasl_load(cfasl_file) : NIL;
        final SubLObject progress_message = $str99$Ensuring_data_file_is_up_to_date_;
        if (NIL == dictionary.dictionary_p(directory_data)) {
            directory_data = dictionary_utilities.new_dictionary_from_alist(directory_data, symbol_function(EQUAL));
            cfasl_utilities.cfasl_save_externalized(directory_data, cfasl_file);
        }
        if (NIL != ensure_up_to_dateP) {
            assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
            SubLObject directory_contents_var = Filesys.directory(log_directory, T);
            final SubLObject progress_message_var = progress_message;
            final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$24 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject log_file = NIL;
                        log_file = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if ((NIL != string_utilities.ends_with(log_file, $str100$_log, UNPROVIDED)) && file_write_date.numL(Filesys.file_write_date(log_file))) {
                                parse_and_save_fact_sheet_log_file_data(log_file, cfasl_file, directory_data);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            log_file = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$24, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0, thread);
            }
        }
        return cfasl_file;
    }

    public static SubLObject ensure_fact_sheet_log_directories_are_up_to_date() {
        SubLObject stopP = NIL;
        SubLObject data_files = NIL;
        if (NIL == stopP) {
            SubLObject kb = NIL;
            kb = number_utilities.f_1_(kb_loaded());
            while (NIL == stopP) {
                final SubLObject directory_list = fact_sheet_log_directory_path_for_kb(kb);
                final SubLObject directory = file_utilities.cyc_home_subdirectory(directory_list);
                if (NIL != Filesys.directory_p(directory)) {
                    data_files = cons(find_or_create_fact_sheet_log_directory_data_file(directory, T), data_files);
                } else {
                    stopP = T;
                }
                kb = add(kb, MINUS_ONE_INTEGER);
            } 
        }
        return data_files;
    }

    public static SubLObject parse_and_save_fact_sheet_log_directory_data(final SubLObject log_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        final SubLObject cfasl_file = fact_sheet_log_directory_parsed_data_filename(log_directory);
        SubLObject directory_data = (NIL != file_utilities.file_existsP(cfasl_file)) ? cfasl_utilities.cfasl_load(cfasl_file) : NIL;
        final SubLObject progress_message = cconcatenate($$$Parsing_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(log_directory), $str102$___ });
        if (NIL == dictionary.dictionary_p(directory_data)) {
            directory_data = dictionary_utilities.new_dictionary_from_alist(directory_data, symbol_function(EQUAL));
        }
        assert NIL != Filesys.directory_p(log_directory) : "Filesys.directory_p(log_directory) " + "CommonSymbols.NIL != Filesys.directory_p(log_directory) " + log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$26 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject log_file = NIL;
                    log_file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if ((NIL != string_utilities.ends_with(log_file, $str100$_log, UNPROVIDED)) && (NIL != file_utilities.file_existsP(log_file))) {
                            parse_and_save_fact_sheet_log_file_data(log_file, cfasl_file, directory_data);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        log_file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$26, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return cfasl_file;
    }

    public static SubLObject parse_and_save_fact_sheet_log_file_data(final SubLObject log_file, SubLObject cfasl_file, SubLObject directory_data) {
        if (cfasl_file == UNPROVIDED) {
            cfasl_file = fact_sheet_log_file_parsed_data_filename(log_file);
        }
        if (directory_data == UNPROVIDED) {
            directory_data = (NIL != file_utilities.file_existsP(cfasl_file)) ? cfasl_utilities.cfasl_load(cfasl_file) : NIL;
        }
        assert NIL != file_utilities.file_existsP(log_file) : "file_utilities.file_existsP(log_file) " + "CommonSymbols.NIL != file_utilities.file_existsP(log_file) " + log_file;
        final SubLObject local_filename = nth_value_step_2(nth_value_step_1(ONE_INTEGER), file_utilities.deconstruct_path(log_file));
        final SubLObject new_data = fact_sheet_log_file_parse_data(log_file);
        dictionary.dictionary_enter(directory_data, local_filename, new_data);
        cfasl_utilities.cfasl_save_externalized(directory_data, cfasl_file);
        return cfasl_file;
    }

    public static SubLObject fact_sheet_log_file_parsed_data_filename(final SubLObject log_file) {
        final SubLObject directory = file_utilities.reconstruct_path(file_utilities.deconstruct_path(log_file), $str104$, UNPROVIDED);
        return fact_sheet_log_directory_parsed_data_filename(directory);
    }

    public static SubLObject fact_sheet_log_directory_parsed_data_filename(final SubLObject directory) {
        return cconcatenate(directory, $str105$parsed_data_cfasl);
    }

    public static SubLObject fact_sheet_log_file_parse_data(final SubLObject log_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        SubLObject current_datum = NIL;
        SubLObject query_timeout_info = NIL;
        SubLObject state = NIL;
        SubLObject stale_fact_sheet_updater_logP = NIL;
        SubLObject file_level_verbosity = NIL;
        final SubLObject timestamp_length = length($str106$MM_DD_YYYY_HH_MM_SS_);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(log_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str108$Unable_to_open__S, log_file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject offset;
                SubLObject term_end;
                SubLObject timed_out_query;
                SubLObject paragraph_count;
                SubLObject finished_term;
                SubLObject current_term;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    if ((NIL == state) && (NIL != fact_sheet_log_line_starts_withP(line, $str109$NOTE__Starting__, timestamp_length))) {
                        current_datum = fact_sheet_log_file_parse_start_line_data(line);
                        if ((NIL != file_level_verbosity) && (NIL == list_utilities.plist_lookup(current_datum, $VERBOSITY, NIL))) {
                            current_datum = putf(current_datum, $VERBOSITY, file_level_verbosity);
                        }
                        state = $PARSING_DATUM;
                    } else
                        if ((NIL == state) && (NIL != fact_sheet_log_line_starts_withP(line, $str111$_Verbosity__, ZERO_INTEGER))) {
                            file_level_verbosity = read_from_string(line, NIL, NIL, length($str111$_Verbosity__), UNPROVIDED, UNPROVIDED);
                        } else
                            if ((NIL == state) && (NIL != fact_sheet_log_line_starts_withP(line, $str112$NOTE__Dequeuing_, timestamp_length))) {
                                current_datum = fact_sheet_log_file_parse_dequeue_line_data(line, timestamp_length);
                                state = $DEQUEUED_TERM;
                            } else
                                if ((state == $DEQUEUED_TERM) && (NIL != fact_sheet_log_line_starts_withP(line, $str114$NOTE__Skipping_, timestamp_length))) {
                                    state = NIL;
                                } else
                                    if ((state == $DEQUEUED_TERM) && (NIL != fact_sheet_log_line_starts_withP(line, $str115$NOTE__Updating_, timestamp_length))) {
                                        if ((NIL != file_level_verbosity) && (NIL == list_utilities.plist_lookup(current_datum, $VERBOSITY, NIL))) {
                                            current_datum = putf(current_datum, $VERBOSITY, file_level_verbosity);
                                        }
                                        state = $PARSING_DATUM;
                                    } else
                                        if ((NIL == state) && (NIL != fact_sheet_log_line_starts_withP(line, $str116$NOTE__Updating_all_stale_fact_she, timestamp_length))) {
                                            stale_fact_sheet_updater_logP = T;
                                        } else
                                            if ((NIL == state) && (NIL != fact_sheet_log_line_starts_withP(line, $str117$NOTE__Updating_stale_fact_sheet_f, timestamp_length))) {
                                                current_datum = fact_sheet_log_file_parse_stale_start_line_data(line, timestamp_length);
                                                state = $PARSING_DATUM;
                                            } else
                                                if ((state == $PARSING_DATUM) && (NIL != fact_sheet_log_line_starts_withP(line, $str118$WARN__Hit_soft_timeout_of_, timestamp_length))) {
                                                    current_datum = putf(current_datum, $QUERY_TIMEOUTS, add(list_utilities.plist_lookup(current_datum, $QUERY_TIMEOUTS, ZERO_INTEGER), ONE_INTEGER));
                                                    query_timeout_info = fact_sheet_log_file_parse_new_query_timeout_line_data(line);
                                                    if (!$MINI.eql(list_utilities.plist_lookup(current_datum, $VERBOSITY, UNPROVIDED))) {
                                                        state = $HIT_QUERY_TIMEOUT;
                                                    }
                                                } else
                                                    if (state == $HIT_QUERY_TIMEOUT) {
                                                        offset = add(timestamp_length, length($str122$NOTE__));
                                                        term_end = position(CHAR_colon, line, symbol_function(EQ), symbol_function(IDENTITY), offset, UNPROVIDED);
                                                        timed_out_query = fact_sheet_term_from_string(line, offset, term_end, NIL);
                                                        if (NIL != cycl_grammar.cycl_denotational_term_p(timed_out_query)) {
                                                            query_timeout_info = putf(query_timeout_info, $QUERY, timed_out_query);
                                                        }
                                                        state = $LOOKING_FOR_TIMED_OUT_QUERY_YIELD;
                                                    } else
                                                        if (state == $LOOKING_FOR_TIMED_OUT_QUERY_YIELD) {
                                                            paragraph_count = read_from_string_ignoring_errors(line, NIL, NIL, length($$$_yielded_), UNPROVIDED);
                                                            if (paragraph_count.isInteger()) {
                                                                query_timeout_info = putf(query_timeout_info, $PARAGRAPH_COUNT, paragraph_count);
                                                            }
                                                            current_datum = putf(current_datum, $QUERY_TIMEOUT_INFO, cons(query_timeout_info, list_utilities.plist_lookup(current_datum, $QUERY_TIMEOUT_INFO, NIL)));
                                                            state = $PARSING_DATUM;
                                                        } else
                                                            if (NIL != fact_sheet_log_line_starts_withP(line, $str126$WARN__Launching_make_up_updater, timestamp_length)) {
                                                                Errors.warn($str127$We_appear_to_have_aborted_the_fac, list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED), log_file);
                                                                state = NIL;
                                                            } else
                                                                if ((state == $PARSING_DATUM) && (NIL != fact_sheet_log_line_starts_withP(line, $str129$NOTE__Added_, timestamp_length))) {
                                                                    current_datum = update_current_datum_for_misc_sentence_stats(current_datum, line, timestamp_length);
                                                                } else
                                                                    if ((state == $PARSING_DATUM) && (NIL != fact_sheet_log_line_starts_withP(line, $str130$NOTE__Gathered_, timestamp_length))) {
                                                                        current_datum = update_current_datum_for_info_gather_stats(current_datum, line, timestamp_length);
                                                                    } else
                                                                        if ((state == $PARSING_DATUM) && (NIL != string_utilities.starts_with(line, $$$_implies_))) {
                                                                            current_datum = putf(current_datum, $FILTERED_REDUNDANT_FACT_COUNT, add(list_utilities.plist_lookup(current_datum, $FILTERED_REDUNDANT_FACT_COUNT, ZERO_INTEGER), ONE_INTEGER));
                                                                        } else
                                                                            if ((state == $PARSING_DATUM) && (NIL != fact_sheet_log_line_starts_withP(line, $str133$NOTE__Generated_, timestamp_length))) {
                                                                                current_datum = update_current_datum_for_pph_stats(current_datum, line, timestamp_length);
                                                                                if (NIL != stale_fact_sheet_updater_logP) {
                                                                                    add_end_date_and_time_to_datum(current_datum, line);
                                                                                    add_total_time_to_datum(current_datum, UNPROVIDED);
                                                                                    data = cons(current_datum, data);
                                                                                    state = NIL;
                                                                                }
                                                                            } else
                                                                                if ((state == $PARSING_DATUM) && (NIL != fact_sheet_log_line_starts_withP(line, $str134$WARN__Failed_to_paraphrase_, timestamp_length))) {
                                                                                    current_datum = update_current_datum_for_pph_failure_stats(current_datum, line, timestamp_length);
                                                                                } else
                                                                                    if (NIL != fact_sheet_log_line_starts_withP(line, $str135$WARN__Query_failed_to_get_mini_fa, timestamp_length)) {
                                                                                        state = NIL;
                                                                                    } else
                                                                                        if (NIL != fact_sheet_log_line_starts_withP(line, $str136$NOTE__Query_got_mini_fact_sheet_o, timestamp_length)) {
                                                                                            add_end_date_and_time_to_datum(current_datum, line);
                                                                                            add_total_time_to_datum(current_datum, UNPROVIDED);
                                                                                            data = cons(current_datum, data);
                                                                                            state = NIL;
                                                                                        } else
                                                                                            if (NIL != fact_sheet_log_line_starts_withP(line, $str137$NOTE__Finished_fact_sheet_for_, timestamp_length)) {
                                                                                                if (state == $PARSING_DATUM) {
                                                                                                    current_datum = finalize_current_datum(current_datum, line, timestamp_length);
                                                                                                    data = cons(current_datum, data);
                                                                                                } else {
                                                                                                    finished_term = term_from_fact_sheet_log_finish_line(line, timestamp_length);
                                                                                                    current_term = getf(current_datum, $TERM, UNPROVIDED);
                                                                                                    if (!finished_term.equal(current_term)) {
                                                                                                        Errors.sublisp_break($str138$Found_finish_line__but_state_is__, new SubLObject[]{ state, current_datum, line, log_file });
                                                                                                    }
                                                                                                    current_datum = NIL;
                                                                                                }
                                                                                                state = NIL;
                                                                                            }


















                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != state) {
            Errors.warn($str139$We_appear_to_have_aborted_the_fac, list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED), log_file);
        }
        return nreverse(data);
    }

    public static SubLObject fact_sheet_log_line_starts_withP(final SubLObject line, final SubLObject string, final SubLObject timestamp_length) {
        final SubLObject end_pos = add(timestamp_length, length(string));
        return makeBoolean((NIL != list_utilities.lengthG(line, end_pos, UNPROVIDED)) && string_utilities.substring(line, timestamp_length, end_pos).equal(string));
    }

    public static SubLObject fact_sheet_log_file_parse_start_line_data(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_datum = NIL;
        thread.resetMultipleValues();
        final SubLObject verbosity = read_from_string(line, NIL, NIL, $int$35, UNPROVIDED, UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject term_start = add(i, length($$$update_on_));
        final SubLObject term_end = search($str142$__Status, line, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, term_start, UNPROVIDED);
        final SubLObject v_term = fact_sheet_term_from_string(line, term_start, term_end, UNPROVIDED);
        final SubLObject status = read_from_string(line, NIL, NIL, add(term_end, length($str143$__Status__)), UNPROVIDED, UNPROVIDED);
        current_datum = list(new SubLObject[]{ $VERBOSITY, verbosity, $TERM, v_term, $STATUS, status, $START_DATE, string_utilities.substring(line, ZERO_INTEGER, TEN_INTEGER), $START_TIME, string_utilities.substring(line, ELEVEN_INTEGER, NINETEEN_INTEGER) });
        return current_datum;
    }

    public static SubLObject fact_sheet_log_file_parse_stale_start_line_data(final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_datum = NIL;
        thread.resetMultipleValues();
        final SubLObject v_term = fact_sheet_term_from_string(line, add(timestamp_length, length($str117$NOTE__Updating_stale_fact_sheet_f)), UNPROVIDED, UNPROVIDED);
        final SubLObject term_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != cycl_grammar.cycl_denotational_term_p(v_term)) {
            final SubLObject verbosity = read_from_string(line, NIL, NIL, term_end, UNPROVIDED, UNPROVIDED);
            final SubLObject status = $STALE;
            current_datum = list(new SubLObject[]{ $VERBOSITY, verbosity, $TERM, v_term, $STATUS, status, $START_DATE, string_utilities.substring(line, ZERO_INTEGER, TEN_INTEGER), $START_TIME, string_utilities.substring(line, ELEVEN_INTEGER, NINETEEN_INTEGER) });
        }
        return current_datum;
    }

    public static SubLObject fact_sheet_log_file_parse_dequeue_line_data(final SubLObject line, final SubLObject timestamp_length) {
        SubLObject current_datum = NIL;
        final SubLObject term_start = add(timestamp_length, length($str112$NOTE__Dequeuing_));
        final SubLObject term_end = (constant_reader.constant_reader_prefix().equal(string_utilities.substring(line, term_start, add(term_start, TWO_INTEGER)))) ? position(CHAR_period, line, symbol_function(EQL), symbol_function(IDENTITY), term_start, UNPROVIDED) : nart_end_from_string(line, term_start);
        final SubLObject v_term = fact_sheet_term_from_string(line, term_start, term_end, UNPROVIDED);
        final SubLObject status_start = add(term_end, length($str143$__Status__));
        final SubLObject status_end = position(CHAR_period, line, symbol_function(EQL), symbol_function(IDENTITY), status_start, UNPROVIDED);
        final SubLObject status = make_keyword(Strings.string_upcase(string_utilities.substring(line, status_start, status_end), UNPROVIDED, UNPROVIDED));
        current_datum = list($TERM, v_term, $STATUS, status, $START_DATE, string_utilities.substring(line, ZERO_INTEGER, TEN_INTEGER), $START_TIME, string_utilities.substring(line, ELEVEN_INTEGER, NINETEEN_INTEGER));
        return current_datum;
    }

    public static SubLObject fact_sheet_log_file_parse_new_query_timeout_line_data(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_timeout_info = NIL;
        thread.resetMultipleValues();
        final SubLObject timeout_time = read_from_string(line, NIL, NIL, $int$46, UNPROVIDED, UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (timeout_time.isInteger()) {
            query_timeout_info = putf(query_timeout_info, $TIMEOUT_TIME, timeout_time);
            final SubLObject query_result_count = read_from_string(line, NIL, NIL, add(i, length($$$seconds_after_getting)), UNPROVIDED, UNPROVIDED);
            query_timeout_info = putf(query_timeout_info, $RESULT_COUNT, query_result_count);
        }
        return query_timeout_info;
    }

    public static SubLObject update_current_datum_for_misc_sentence_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_count = read_from_string(line, NIL, NIL, add(timestamp_length, length($str129$NOTE__Added_)), UNPROVIDED, UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sentence_count.isInteger()) {
            current_datum = putf(current_datum, $MISC_SENTENCE_COUNT, sentence_count);
            final SubLObject time = read_from_string(line, NIL, NIL, add(i, length($$$THCL_sentences_in)), UNPROVIDED, UNPROVIDED);
            if (time.isNumber()) {
                current_datum = putf(current_datum, $MISC_SENTENCE_TIME, time);
            }
        }
        return current_datum;
    }

    public static SubLObject update_current_datum_for_pph_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pph_paragraph_count = read_from_string(line, NIL, NIL, add(timestamp_length, length($str133$NOTE__Generated_)), UNPROVIDED, UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_paragraph_count.isInteger()) {
            current_datum = putf(current_datum, $PPH_PARAGRAPH_COUNT, pph_paragraph_count);
            thread.resetMultipleValues();
            final SubLObject pph_sentence_count = read_from_string(line, NIL, NIL, add(i, length($$$paragraphs_containing_)), UNPROVIDED, UNPROVIDED);
            final SubLObject i_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_sentence_count.isInteger()) {
                current_datum = putf(current_datum, $PPH_SENTENCE_COUNT, pph_sentence_count);
                final SubLObject offset = add(i_$28, length($$$sentences_for_));
                thread.resetMultipleValues();
                final SubLObject v_term = fact_sheet_term_from_string(line, offset, NIL, UNPROVIDED);
                final SubLObject term_end = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != cycl_grammar.cycl_denotational_term_p(v_term)) {
                    if (!v_term.equal(list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED))) {
                        Errors.sublisp_break($str157$Must_have_missed_the__Finished__l, new SubLObject[]{ list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED) });
                    }
                    final SubLObject time = read_from_string(line, NIL, NIL, add(term_end, length($$$_in_)), UNPROVIDED, UNPROVIDED);
                    if (time.isNumber()) {
                        current_datum = putf(current_datum, $PPH_TIME, time);
                    }
                }
            }
        }
        return current_datum;
    }

    public static SubLObject update_current_datum_for_pph_failure_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLObject start_char = add(timestamp_length, length($str134$WARN__Failed_to_paraphrase_));
        final SubLObject sentence_count = read_from_string(line, NIL, NIL, start_char, UNPROVIDED, UNPROVIDED);
        if (sentence_count.isInteger()) {
            current_datum = putf(current_datum, $PPH_FAILURE_COUNT, add(list_utilities.plist_lookup(current_datum, $PPH_FAILURE_COUNT, ZERO_INTEGER), sentence_count));
        }
        return current_datum;
    }

    public static SubLObject update_current_datum_for_info_gather_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject category_count = read_from_string(line, NIL, NIL, add(timestamp_length, length($str130$NOTE__Gathered_)), UNPROVIDED, UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (category_count.isInteger()) {
            current_datum = putf(current_datum, $CATEGORY_COUNT, category_count);
            final SubLObject offset = add(i, length($$$groups_of_sentences_for_));
            thread.resetMultipleValues();
            final SubLObject v_term = fact_sheet_term_from_string(line, offset, NIL, UNPROVIDED);
            final SubLObject term_end = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != cycl_grammar.cycl_denotational_term_p(v_term)) {
                if (!v_term.equal(list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED))) {
                    Errors.sublisp_break($str157$Must_have_missed_the__Finished__l, new SubLObject[]{ list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED) });
                }
                final SubLObject time = read_from_string(line, NIL, NIL, add(term_end, length($$$_in_)), UNPROVIDED, UNPROVIDED);
                if (time.isNumber()) {
                    current_datum = putf(current_datum, $INFO_GATHERING_TIME, time);
                }
            }
        }
        return current_datum;
    }

    public static SubLObject finalize_current_datum(final SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_term = term_from_fact_sheet_log_finish_line(line, timestamp_length);
        final SubLObject term_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        add_end_date_and_time_to_datum(current_datum, line);
        if ((NIL != cycl_grammar.cycl_denotational_term_p(v_term)) && (!v_term.equal(list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED)))) {
            Errors.sublisp_break($str157$Must_have_missed_the__Finished__l, new SubLObject[]{ list_utilities.plist_lookup(current_datum, $TERM, UNPROVIDED) });
        }
        if (term_end.isInteger()) {
            final SubLObject time = read_from_string(line, NIL, NIL, add(term_end, length($$$_in_)), UNPROVIDED, UNPROVIDED);
            add_total_time_to_datum(current_datum, time);
        }
        return current_datum;
    }

    public static SubLObject compute_total_time_from_start_and_end(final SubLObject current_datum) {
        SubLObject total_time = NIL;
        final SubLObject start_time_tail = property_list_member($START_TIME, current_datum);
        final SubLObject start_time = (NIL != start_time_tail) ? cadr(start_time_tail) : NIL;
        final SubLObject start_date_tail = property_list_member($START_DATE, current_datum);
        final SubLObject start_date = (NIL != start_date_tail) ? cadr(start_date_tail) : NIL;
        final SubLObject end_time_tail = property_list_member($END_TIME, current_datum);
        final SubLObject end_time = (NIL != end_time_tail) ? cadr(end_time_tail) : NIL;
        final SubLObject end_date_tail = property_list_member($END_DATE, current_datum);
        final SubLObject end_date = (NIL != end_date_tail) ? cadr(end_date_tail) : NIL;
        if (((start_time.isString() && start_date.isString()) && end_time.isString()) && end_date.isString()) {
            total_time = add(numeric_date_utilities.secondstring_(end_time, start_time), numeric_date_utilities.datestring_(end_date, start_date));
        }
        return total_time;
    }

    public static SubLObject term_from_fact_sheet_log_finish_line(final SubLObject line, final SubLObject timestamp_length) {
        final SubLObject offset = add(timestamp_length, length($str137$NOTE__Finished_fact_sheet_for_));
        return fact_sheet_term_from_string(line, offset, NIL, UNPROVIDED);
    }

    public static SubLObject add_total_time_to_datum(SubLObject current_datum, SubLObject time) {
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (!time.isNumber()) {
            time = compute_total_time_from_start_and_end(current_datum);
        }
        if (time.isNumber()) {
            current_datum = putf(current_datum, $TOTAL_TIME, time);
        }
        return current_datum;
    }

    public static SubLObject add_end_date_and_time_to_datum(SubLObject current_datum, final SubLObject line) {
        current_datum = putf(current_datum, $END_DATE, string_utilities.substring(line, ZERO_INTEGER, TEN_INTEGER));
        current_datum = putf(current_datum, $END_TIME, string_utilities.substring(line, ELEVEN_INTEGER, NINETEEN_INTEGER));
        return current_datum;
    }

    public static SubLObject fact_sheet_term_from_string(final SubLObject string, SubLObject term_start, SubLObject term_end, SubLObject warn_on_failureP) {
        if (term_start == UNPROVIDED) {
            term_start = ZERO_INTEGER;
        }
        if (term_end == UNPROVIDED) {
            term_end = NIL;
        }
        if (warn_on_failureP == UNPROVIDED) {
            warn_on_failureP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        if (constant_reader.constant_reader_prefix().equal(string_utilities.substring(string, term_start, add(term_start, TWO_INTEGER)))) {
            thread.resetMultipleValues();
            final SubLObject value1 = read_from_string_ignoring_errors(string, NIL, NIL, term_start, term_end);
            final SubLObject value2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != forts.fort_p(value1)) {
                v_term = value1;
                term_end = value2;
            }
        } else
            if ($str164$___.equal(string_utilities.substring(string, term_start, add(term_start, THREE_INTEGER)))) {
                final SubLObject unstripped = string_utilities.substring(string, term_start, term_end);
                final SubLObject stripped = string_utilities.remove_substring(remove(CHAR_greater, unstripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str165$__);
                final SubLObject possibly_naut = read_from_string_ignoring_errors(stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_term = (NIL != possibly_naut) ? possibly_naut : NIL;
                if (NIL != v_term) {
                    term_end = nart_end_from_string(string, term_start);
                }
            }

        if ((NIL != warn_on_failureP) && (NIL == cycl_grammar.cycl_denotational_term_p(v_term))) {
            Errors.warn($str166$Couldn_t_determine_term_from__S, string_utilities.substring(string, term_start, term_end));
        }
        return values(v_term, term_end);
    }

    public static SubLObject nart_end_from_string(final SubLObject string, final SubLObject term_start) {
        SubLObject term_end = NIL;
        SubLObject bracket_count = ZERO_INTEGER;
        final SubLObject doneP = NIL;
        final SubLObject end_var = length(string);
        if (NIL == doneP) {
            SubLObject end_var_$29;
            SubLObject char_num;
            SubLObject pcase_var;
            SubLObject v_char;
            for (end_var_$29 = end_var, char_num = NIL, char_num = term_start; (NIL == doneP) && (!char_num.numGE(end_var_$29)); char_num = number_utilities.f_1X(char_num)) {
                v_char = pcase_var = Strings.sublisp_char(string, char_num);
                if (pcase_var.eql(CHAR_less)) {
                    bracket_count = add(bracket_count, ONE_INTEGER);
                } else
                    if (pcase_var.eql(CHAR_greater)) {
                        bracket_count = subtract(bracket_count, ONE_INTEGER);
                        if (bracket_count.isZero()) {
                            term_end = number_utilities.f_1X(char_num);
                        }
                    }

            }
        }
        return term_end;
    }

    public static SubLObject open_new_unique_fact_sheet_log_file() {
        final SubLObject directory_list = fact_sheet_log_directory_path_for_kb(kb_loaded());
        final SubLObject directory = physical_directory_from_path(directory_list);
        final SubLObject image_id_string = Strings.string_downcase(cyc_image_id(), UNPROVIDED, UNPROVIDED);
        final SubLObject uniquifier = ZERO_INTEGER;
        final SubLObject filename_base = cconcatenate(format_nil.format_nil_a_no_copy(image_id_string), new SubLObject[]{ $str168$_, format_nil.format_nil_d_no_copy(uniquifier) });
        SubLObject filename = cconcatenate(directory, new SubLObject[]{ filename_base, $str100$_log });
        if (NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, NIL, NIL != fact_sheets.chmod_safe_to_useP() ? $$$0775 : NIL);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($fact_sheet_log_file_uniquifier_lock$.getGlobalValue());
            filename = uniquify_fact_sheet_log_filename(directory, filename, image_id_string);
        } finally {
            if (NIL != release) {
                release_lock($fact_sheet_log_file_uniquifier_lock$.getGlobalValue());
            }
        }
        return values(directory, filename);
    }

    public static SubLObject fact_sheet_log_directory_path_for_kb(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        return append(fact_sheets.fact_sheet_data_path(), list($$$logs, format(NIL, $str171$_5__0D, kb)));
    }

    public static SubLObject uniquify_fact_sheet_log_filename(final SubLObject parent_directory, SubLObject filename, final SubLObject image_id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uniquifier = ZERO_INTEGER;
        for (SubLObject filename_base = NIL; NIL != file_utilities.file_existsP(filename); filename = cconcatenate(parent_directory, new SubLObject[]{ filename_base, $str100$_log })) {
            uniquifier = add(uniquifier, ONE_INTEGER);
            filename_base = cconcatenate(format_nil.format_nil_a_no_copy(image_id_string), new SubLObject[]{ $str168$_, format_nil.format_nil_d_no_copy(uniquifier) });
        }
        final SubLObject _prev_bind_0 = $fact_sheet_log_file$.currentBinding(thread);
        try {
            $fact_sheet_log_file$.bind(filename, thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$30 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($fact_sheet_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$30, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str108$Unable_to_open__S, $fact_sheet_log_file$.getDynamicValue(thread));
                }
                final SubLObject _prev_bind_0_$31 = $fact_sheet_log_stream$.currentBinding(thread);
                try {
                    $fact_sheet_log_stream$.bind(stream, thread);
                    final SubLObject stream_$32 = fact_sheet_log_stream();
                    if (((T == stream_$32) && current_process().eql(subl_promotions.initial_process())) || (stream_$32.isStream() && (NIL != output_stream_p(stream_$32)))) {
                        print_fact_sheet_log_header($$$NOTE, stream_$32);
                        format(stream_$32, $str173$Opening_log_);
                        force_output(stream_$32);
                    }
                } finally {
                    $fact_sheet_log_stream$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            $fact_sheet_log_file$.rebind(_prev_bind_0, thread);
        }
        if (NIL != fact_sheets.chmod_safe_to_useP()) {
            file_utilities.chmod(filename, $$$755);
        }
        return filename;
    }

    public static SubLObject physical_directory_from_path(final SubLObject path) {
        assert NIL != string_utilities.list_of_string_p(path) : "string_utilities.list_of_string_p(path) " + "CommonSymbols.NIL != string_utilities.list_of_string_p(path) " + path;
        return cconcatenate(string_utilities.bunge(path, CHAR_slash), $str176$_);
    }

    public static SubLObject declare_fact_sheet_logs_file() {
        declareFunction("fact_sheet_log_stream", "FACT-SHEET-LOG-STREAM", 0, 0, false);
        declareMacro("with_quiet_fact_sheet_logging", "WITH-QUIET-FACT-SHEET-LOGGING");
        declareMacro("log_fact_sheet_message", "LOG-FACT-SHEET-MESSAGE");
        declareFunction("print_fact_sheet_log_header", "PRINT-FACT-SHEET-LOG-HEADER", 2, 0, false);
        declareMacro("log_fact_sheet_warning", "LOG-FACT-SHEET-WARNING");
        declareMacro("log_fact_sheet_note", "LOG-FACT-SHEET-NOTE");
        declareMacro("with_fact_sheet_log_file", "WITH-FACT-SHEET-LOG-FILE");
        declareMacro("with_fact_sheet_logging", "WITH-FACT-SHEET-LOGGING");
        declareFunction("note_fact_sheet_log_file_closed", "NOTE-FACT-SHEET-LOG-FILE-CLOSED", 0, 1, false);
        declareFunction("fact_sheet_log_file_closed_p", "FACT-SHEET-LOG-FILE-CLOSED-P", 1, 0, false);
        declareFunction("hourly_fact_sheet_stats", "HOURLY-FACT-SHEET-STATS", 0, 0, false);
        declareMacro("with_fact_sheet_logging_and_hourly_reporting", "WITH-FACT-SHEET-LOGGING-AND-HOURLY-REPORTING");
        declareFunction("fact_sheet_hourly_reporting_onP", "FACT-SHEET-HOURLY-REPORTING-ON?", 0, 0, false);
        declareFunction("reset_hourly_report_time", "RESET-HOURLY-REPORT-TIME", 0, 1, false);
        declareFunction("clear_hourly_fact_sheet_stats", "CLEAR-HOURLY-FACT-SHEET-STATS", 0, 0, false);
        declareFunction("add_fact_sheet_info_to_hourly_stats", "ADD-FACT-SHEET-INFO-TO-HOURLY-STATS", 1, 0, false);
        declareFunction("get_hourly_fact_sheet_update_count", "GET-HOURLY-FACT-SHEET-UPDATE-COUNT", 0, 0, false);
        declareFunction("clear_hourly_fact_sheet_update_count", "CLEAR-HOURLY-FACT-SHEET-UPDATE-COUNT", 0, 0, false);
        declareFunction("note_fact_sheet_query_timeout_in_hourly_stats", "NOTE-FACT-SHEET-QUERY-TIMEOUT-IN-HOURLY-STATS", 0, 0, false);
        declareFunction("get_hourly_fact_sheet_query_timeout_count", "GET-HOURLY-FACT-SHEET-QUERY-TIMEOUT-COUNT", 0, 0, false);
        declareFunction("clear_hourly_fact_sheet_query_timeout_count", "CLEAR-HOURLY-FACT-SHEET-QUERY-TIMEOUT-COUNT", 0, 0, false);
        declareFunction("maybe_log_fact_sheet_hourly_report", "MAYBE-LOG-FACT-SHEET-HOURLY-REPORT", 0, 0, false);
        declareFunction("log_fact_sheet_hourly_report", "LOG-FACT-SHEET-HOURLY-REPORT", 0, 0, false);
        declareFunction("fact_sheet_log_directory_generated_count", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT", 1, 0, false);
        declareFunction("fact_sheet_log_file_generated_count", "FACT-SHEET-LOG-FILE-GENERATED-COUNT", 1, 1, false);
        declareFunction("fact_sheet_log_directory_average_total_time", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-TOTAL-TIME", 1, 0, false);
        declareFunction("fact_sheet_log_file_count_and_total_time", "FACT-SHEET-LOG-FILE-COUNT-AND-TOTAL-TIME", 1, 1, false);
        declareFunction("plot_fact_sheet_log_directory_generated_count_by_date", "PLOT-FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-BY-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_directory_generated_count_by_date", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-BY-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_generated_count_by_date", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-BY-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_directory_average_total_time_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-TOTAL-TIME-BY-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_average_total_time_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-TOTAL-TIME-BY-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_directory_average_category_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-CATEGORY-COUNT-BY-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_average_category_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-CATEGORY-COUNT-BY-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_directory_average_sentence_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-SENTENCE-COUNT-BY-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_average_sentence_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-SENTENCE-COUNT-BY-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_directory_average_uncategorized_sentence_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-UNCATEGORIZED-SENTENCE-COUNT-BY-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_average_uncategorized_sentence_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-UNCATEGORIZED-SENTENCE-COUNT-BY-DATE", 1, 2, false);
        declareFunction("plot_fact_sheet_log_directory_query_failure_rate_by_date", "PLOT-FACT-SHEET-LOG-DIRECTORY-QUERY-FAILURE-RATE-BY-DATE", 1, 3, false);
        declareFunction("fact_sheet_log_directory_query_failure_rate_by_date", "FACT-SHEET-LOG-DIRECTORY-QUERY-FAILURE-RATE-BY-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_query_failure_rate_by_date", "FACT-SHEET-LOG-FILE-QUERY-FAILURE-RATE-BY-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_directory_generated_count_for_date", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-FOR-DATE", 1, 1, false);
        declareFunction("fact_sheet_log_file_generated_count_for_date", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-FOR-DATE", 1, 2, false);
        declareFunction("fact_sheet_log_file_generated_count_old", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-OLD", 1, 0, false);
        declareFunction("fact_sheet_log_file_generated_count_for_date_old", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-FOR-DATE-OLD", 1, 1, false);
        declareFunction("get_fact_sheet_log_file_data", "GET-FACT-SHEET-LOG-FILE-DATA", 1, 0, false);
        declareFunction("get_fact_sheet_log_directory_data", "GET-FACT-SHEET-LOG-DIRECTORY-DATA", 1, 1, false);
        declareFunction("clear_get_fact_sheet_log_directory_data_cached", "CLEAR-GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 0, 0, false);
        declareFunction("remove_get_fact_sheet_log_directory_data_cached", "REMOVE-GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 2, 0, false);
        declareFunction("get_fact_sheet_log_directory_data_cached_internal", "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-INTERNAL", 2, 0, false);
        declareFunction("get_fact_sheet_log_directory_data_cached", "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 2, 0, false);
        declareFunction("find_or_create_fact_sheet_log_directory_data_file", "FIND-OR-CREATE-FACT-SHEET-LOG-DIRECTORY-DATA-FILE", 1, 1, false);
        declareFunction("ensure_fact_sheet_log_directories_are_up_to_date", "ENSURE-FACT-SHEET-LOG-DIRECTORIES-ARE-UP-TO-DATE", 0, 0, false);
        declareFunction("parse_and_save_fact_sheet_log_directory_data", "PARSE-AND-SAVE-FACT-SHEET-LOG-DIRECTORY-DATA", 1, 0, false);
        declareFunction("parse_and_save_fact_sheet_log_file_data", "PARSE-AND-SAVE-FACT-SHEET-LOG-FILE-DATA", 1, 2, false);
        declareFunction("fact_sheet_log_file_parsed_data_filename", "FACT-SHEET-LOG-FILE-PARSED-DATA-FILENAME", 1, 0, false);
        declareFunction("fact_sheet_log_directory_parsed_data_filename", "FACT-SHEET-LOG-DIRECTORY-PARSED-DATA-FILENAME", 1, 0, false);
        declareFunction("fact_sheet_log_file_parse_data", "FACT-SHEET-LOG-FILE-PARSE-DATA", 1, 0, false);
        declareFunction("fact_sheet_log_line_starts_withP", "FACT-SHEET-LOG-LINE-STARTS-WITH?", 3, 0, false);
        declareFunction("fact_sheet_log_file_parse_start_line_data", "FACT-SHEET-LOG-FILE-PARSE-START-LINE-DATA", 1, 0, false);
        declareFunction("fact_sheet_log_file_parse_stale_start_line_data", "FACT-SHEET-LOG-FILE-PARSE-STALE-START-LINE-DATA", 2, 0, false);
        declareFunction("fact_sheet_log_file_parse_dequeue_line_data", "FACT-SHEET-LOG-FILE-PARSE-DEQUEUE-LINE-DATA", 2, 0, false);
        declareFunction("fact_sheet_log_file_parse_new_query_timeout_line_data", "FACT-SHEET-LOG-FILE-PARSE-NEW-QUERY-TIMEOUT-LINE-DATA", 1, 0, false);
        declareFunction("update_current_datum_for_misc_sentence_stats", "UPDATE-CURRENT-DATUM-FOR-MISC-SENTENCE-STATS", 3, 0, false);
        declareFunction("update_current_datum_for_pph_stats", "UPDATE-CURRENT-DATUM-FOR-PPH-STATS", 3, 0, false);
        declareFunction("update_current_datum_for_pph_failure_stats", "UPDATE-CURRENT-DATUM-FOR-PPH-FAILURE-STATS", 3, 0, false);
        declareFunction("update_current_datum_for_info_gather_stats", "UPDATE-CURRENT-DATUM-FOR-INFO-GATHER-STATS", 3, 0, false);
        declareFunction("finalize_current_datum", "FINALIZE-CURRENT-DATUM", 3, 0, false);
        declareFunction("compute_total_time_from_start_and_end", "COMPUTE-TOTAL-TIME-FROM-START-AND-END", 1, 0, false);
        declareFunction("term_from_fact_sheet_log_finish_line", "TERM-FROM-FACT-SHEET-LOG-FINISH-LINE", 2, 0, false);
        declareFunction("add_total_time_to_datum", "ADD-TOTAL-TIME-TO-DATUM", 1, 1, false);
        declareFunction("add_end_date_and_time_to_datum", "ADD-END-DATE-AND-TIME-TO-DATUM", 2, 0, false);
        declareFunction("fact_sheet_term_from_string", "FACT-SHEET-TERM-FROM-STRING", 1, 3, false);
        declareFunction("nart_end_from_string", "NART-END-FROM-STRING", 2, 0, false);
        declareFunction("open_new_unique_fact_sheet_log_file", "OPEN-NEW-UNIQUE-FACT-SHEET-LOG-FILE", 0, 0, false);
        declareFunction("fact_sheet_log_directory_path_for_kb", "FACT-SHEET-LOG-DIRECTORY-PATH-FOR-KB", 0, 1, false);
        declareFunction("uniquify_fact_sheet_log_filename", "UNIQUIFY-FACT-SHEET-LOG-FILENAME", 3, 0, false);
        declareFunction("physical_directory_from_path", "PHYSICAL-DIRECTORY-FROM-PATH", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_fact_sheet_logs_file() {
        defparameter("*FACT-SHEET-LOG-FILE*", NIL);
        defparameter("*FACT-SHEET-LOG-STREAM*", T);
        deflexical("*CLOSED-FACT-SHEET-LOG-FILES*", SubLTrampolineFile.maybeDefault($closed_fact_sheet_log_files$, $closed_fact_sheet_log_files$, NIL));
        defparameter("*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*", NIL);
        defparameter("*HOURLY-FACT-SHEET-STATS*", NIL);
        deflexical("*FACT-SHEET-LOG-FILE-PROPERTIES*", $list95);
        deflexical("*GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-CACHING-STATE*", NIL);
        deflexical("*FACT-SHEET-LOG-FILE-UNIQUIFIER-LOCK*", make_lock($str167$fact_sheet_log_file_uniquifier_lo));
        return NIL;
    }

    public static SubLObject setup_fact_sheet_logs_file() {
        register_macro_helper(LOG_FACT_SHEET_MESSAGE, $list3);
        register_macro_helper(PRINT_FACT_SHEET_LOG_HEADER, LOG_FACT_SHEET_MESSAGE);
        declare_defglobal($closed_fact_sheet_log_files$);
        register_macro_helper(NOTE_FACT_SHEET_LOG_FILE_CLOSED, WITH_FACT_SHEET_LOGGING);
        register_macro_helper(RESET_HOURLY_REPORT_TIME, WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING);
        memoization_state.note_globally_cached_function(GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_fact_sheet_logs_file();
    }

    @Override
    public void initializeVariables() {
        init_fact_sheet_logs_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_fact_sheet_logs_file();
    }

    
}

/**
 * Total time: 962 ms
 */
