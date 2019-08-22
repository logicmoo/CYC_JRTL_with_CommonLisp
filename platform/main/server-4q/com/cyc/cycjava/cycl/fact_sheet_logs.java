package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fact_sheet_logs
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.fact_sheet_logs";
  public static final String myFingerPrint = "13a798d5d2ed8e08040a0726e9effb60624b5c32e45264f4aeeeea579efe1fab";
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 854L)
  public static SubLSymbol $fact_sheet_log_file$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 970L)
  public static SubLSymbol $fact_sheet_log_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3455L)
  private static SubLSymbol $closed_fact_sheet_log_files$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3838L)
  public static SubLSymbol $next_fact_sheet_hourly_report_time$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3996L)
  public static SubLSymbol $hourly_fact_sheet_stats$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20996L)
  private static SubLSymbol $fact_sheet_log_file_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
  private static SubLSymbol $get_fact_sheet_log_directory_data_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 42315L)
  private static SubLSymbol $fact_sheet_log_file_uniquifier_lock$;
  private static final SubLSymbol $sym0$CLET;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$LOG_FACT_SHEET_MESSAGE;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$STREAM;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PWHEN;
  private static final SubLSymbol $sym8$COR;
  private static final SubLSymbol $sym9$CAND;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$STREAMP;
  private static final SubLSymbol $sym12$OUTPUT_STREAM_P;
  private static final SubLSymbol $sym13$PRINT_FACT_SHEET_LOG_HEADER;
  private static final SubLSymbol $sym14$FORMAT;
  private static final SubLSymbol $sym15$FORCE_OUTPUT;
  private static final SubLString $str16$_;
  private static final SubLString $str17$__;
  private static final SubLList $list18;
  private static final SubLString $str19$WARN;
  private static final SubLString $str20$NOTE;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$_FACT_SHEET_LOG_FILE_;
  private static final SubLSymbol $sym23$WITH_PRIVATE_TEXT_FILE;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$DIRECTORY;
  private static final SubLSymbol $sym26$FILENAME;
  private static final SubLSymbol $sym27$ALREADY_LOGGING_;
  private static final SubLSymbol $sym28$USE_NEW_SETUP_;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$PUNLESS;
  private static final SubLSymbol $sym31$CMULTIPLE_VALUE_SETQ;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$CSETQ;
  private static final SubLSymbol $sym34$DIRECTORY_P;
  private static final SubLSymbol $sym35$STRINGP;
  private static final SubLSymbol $sym36$_STANDARD_OUTPUT_;
  private static final SubLString $str37$__Logging_Fact_Sheet_generation_t;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$WITH_FACT_SHEET_LOG_FILE;
  private static final SubLSymbol $sym40$FIF;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$_CLOSED_FACT_SHEET_LOG_FILES_;
  private static final SubLSymbol $sym44$NOTE_FACT_SHEET_LOG_FILE_CLOSED;
  private static final SubLSymbol $sym45$WITH_FACT_SHEET_LOGGING;
  private static final SubLList $list46;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$RESET_HOURLY_REPORT_TIME;
  private static final SubLSymbol $sym49$WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING;
  private static final SubLString $str50$Hourly_report__Generated__S_fact_;
  private static final SubLString $str51$Counting_fact_sheets_in_;
  private static final SubLString $str52$cdolist;
  private static final SubLString $str53$Gathering_time_info_for_fact_shee;
  private static final SubLSymbol $kw54$TOTAL_TIME;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$DATESTRING_;
  private static final SubLSymbol $kw57$XDATA;
  private static final SubLString $str58$time;
  private static final SubLSymbol $kw59$TIMEFMT;
  private static final SubLString $str60$__m__d__Y_;
  private static final SubLSymbol $kw61$XLABEL;
  private static final SubLString $str62$Date;
  private static final SubLSymbol $kw63$YLABEL;
  private static final SubLString $str64$__of_Fact_Sheets;
  private static final SubLSymbol $kw65$PLOT_TITLE;
  private static final SubLSymbol $kw66$LINE_LABELS;
  private static final SubLList $list67;
  private static final SubLSymbol $kw68$OUTPUT_FILE;
  private static final SubLString $str69$Categorizing_fact_sheets_in_;
  private static final SubLString $str70$_by_date;
  private static final SubLSymbol $kw71$END_DATE;
  private static final SubLString $str72$Analyzing_fact_sheet_times_in_;
  private static final SubLString $str73$Analyzing_fact_sheet_categorizati;
  private static final SubLSymbol $kw74$CATEGORY_COUNT;
  private static final SubLString $str75$Analyzing_fact_sheet_sentence_cou;
  private static final SubLSymbol $kw76$PPH_SENTENCE_COUNT;
  private static final SubLString $str77$Analyzing_fact_sheet_uncategorize;
  private static final SubLSymbol $kw78$MISC_SENTENCE_COUNT;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$_;
  private static final SubLList $list81;
  private static final SubLString $str82$Failure_Rate;
  private static final SubLString $str83$Query_Failure_Rates_by_Day;
  private static final SubLString $str84$Analyzing_query_failure_rates_in_;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $kw87$NOT_FOUND;
  private static final SubLSymbol $kw88$NORMAL;
  private static final SubLSymbol $kw89$VERBOSITY;
  private static final SubLSymbol $kw90$QUERY;
  private static final SubLSymbol $kw91$QUERY_TIMEOUT_INFO;
  private static final SubLString $str92$_generated_on_;
  private static final SubLString $str93$Finished_fact_sheet;
  private static final SubLString $str94$____Finished_fact_sheet;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED;
  private static final SubLSymbol $sym97$DICTIONARY_P;
  private static final SubLSymbol $sym98$_GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED_CACHING_STATE_;
  private static final SubLString $str99$Ensuring_data_file_is_up_to_date_;
  private static final SubLString $str100$_log;
  private static final SubLString $str101$Parsing_data_from_;
  private static final SubLString $str102$___;
  private static final SubLSymbol $sym103$FILE_EXISTS_;
  private static final SubLString $str104$;
  private static final SubLString $str105$parsed_data_cfasl;
  private static final SubLString $str106$MM_DD_YYYY_HH_MM_SS_;
  private static final SubLSymbol $kw107$INPUT;
  private static final SubLString $str108$Unable_to_open__S;
  private static final SubLString $str109$NOTE__Starting__;
  private static final SubLSymbol $kw110$PARSING_DATUM;
  private static final SubLString $str111$_Verbosity__;
  private static final SubLString $str112$NOTE__Dequeuing_;
  private static final SubLSymbol $kw113$DEQUEUED_TERM;
  private static final SubLString $str114$NOTE__Skipping_;
  private static final SubLString $str115$NOTE__Updating_;
  private static final SubLString $str116$NOTE__Updating_all_stale_fact_she;
  private static final SubLString $str117$NOTE__Updating_stale_fact_sheet_f;
  private static final SubLString $str118$WARN__Hit_soft_timeout_of_;
  private static final SubLSymbol $kw119$QUERY_TIMEOUTS;
  private static final SubLSymbol $kw120$MINI;
  private static final SubLSymbol $kw121$HIT_QUERY_TIMEOUT;
  private static final SubLString $str122$NOTE__;
  private static final SubLSymbol $kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD;
  private static final SubLString $str124$_yielded_;
  private static final SubLSymbol $kw125$PARAGRAPH_COUNT;
  private static final SubLString $str126$WARN__Launching_make_up_updater;
  private static final SubLString $str127$We_appear_to_have_aborted_the_fac;
  private static final SubLSymbol $kw128$TERM;
  private static final SubLString $str129$NOTE__Added_;
  private static final SubLString $str130$NOTE__Gathered_;
  private static final SubLString $str131$_implies_;
  private static final SubLSymbol $kw132$FILTERED_REDUNDANT_FACT_COUNT;
  private static final SubLString $str133$NOTE__Generated_;
  private static final SubLString $str134$WARN__Failed_to_paraphrase_;
  private static final SubLString $str135$WARN__Query_failed_to_get_mini_fa;
  private static final SubLString $str136$NOTE__Query_got_mini_fact_sheet_o;
  private static final SubLString $str137$NOTE__Finished_fact_sheet_for_;
  private static final SubLString $str138$Found_finish_line__but_state_is__;
  private static final SubLString $str139$We_appear_to_have_aborted_the_fac;
  private static final SubLInteger $int140$35;
  private static final SubLString $str141$update_on_;
  private static final SubLString $str142$__Status;
  private static final SubLString $str143$__Status__;
  private static final SubLSymbol $kw144$STATUS;
  private static final SubLSymbol $kw145$START_DATE;
  private static final SubLSymbol $kw146$START_TIME;
  private static final SubLSymbol $kw147$STALE;
  private static final SubLInteger $int148$46;
  private static final SubLSymbol $kw149$TIMEOUT_TIME;
  private static final SubLString $str150$seconds_after_getting;
  private static final SubLSymbol $kw151$RESULT_COUNT;
  private static final SubLString $str152$THCL_sentences_in;
  private static final SubLSymbol $kw153$MISC_SENTENCE_TIME;
  private static final SubLSymbol $kw154$PPH_PARAGRAPH_COUNT;
  private static final SubLString $str155$paragraphs_containing_;
  private static final SubLString $str156$sentences_for_;
  private static final SubLString $str157$Must_have_missed_the__Finished__l;
  private static final SubLString $str158$_in_;
  private static final SubLSymbol $kw159$PPH_TIME;
  private static final SubLSymbol $kw160$PPH_FAILURE_COUNT;
  private static final SubLString $str161$groups_of_sentences_for_;
  private static final SubLSymbol $kw162$INFO_GATHERING_TIME;
  private static final SubLSymbol $kw163$END_TIME;
  private static final SubLString $str164$___;
  private static final SubLString $str165$__;
  private static final SubLString $str166$Couldn_t_determine_term_from__S;
  private static final SubLString $str167$fact_sheet_log_file_uniquifier_lo;
  private static final SubLString $str168$_;
  private static final SubLString $str169$0775;
  private static final SubLString $str170$logs;
  private static final SubLString $str171$_5__0D;
  private static final SubLSymbol $kw172$APPEND;
  private static final SubLString $str173$Opening_log_;
  private static final SubLString $str174$755;
  private static final SubLSymbol $sym175$LIST_OF_STRING_P;
  private static final SubLString $str176$_;

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1065L)
  public static SubLObject fact_sheet_log_stream()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $fact_sheet_log_stream$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1141L)
  public static SubLObject with_quiet_fact_sheet_logging(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$CLET, $list1, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1272L)
  public static SubLObject log_fact_sheet_message(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject msg_type = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    msg_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject stream = $sym5$STREAM;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( reader.bq_cons( stream, $list6 ) ), ConsesLow.list( $sym7$PWHEN, ConsesLow.list( $sym8$COR, ConsesLow.listS( $sym9$CAND, ConsesLow.list( EQ, T, stream ), $list10 ),
        ConsesLow.list( $sym9$CAND, ConsesLow.list( $sym11$STREAMP, stream ), ConsesLow.list( $sym12$OUTPUT_STREAM_P, stream ) ) ), ConsesLow.list( $sym13$PRINT_FACT_SHEET_LOG_HEADER, msg_type, stream ), ConsesLow.listS(
            $sym14$FORMAT, stream, format_str, ConsesLow.append( args, NIL ) ), ConsesLow.list( $sym15$FORCE_OUTPUT, stream ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1774L)
  public static SubLObject print_fact_sheet_log_header(final SubLObject msg_type, final SubLObject stream)
  {
    streams_high.terpri( stream );
    print_high.princ( numeric_date_utilities.datestring( UNPROVIDED ), stream );
    print_high.princ( $str16$_, stream );
    print_high.princ( numeric_date_utilities.secondstring( UNPROVIDED ), stream );
    print_high.princ( $str16$_, stream );
    print_high.princ( msg_type, stream );
    print_high.princ( $str17$__, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2059L)
  public static SubLObject log_fact_sheet_warning(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym2$LOG_FACT_SHEET_MESSAGE, $str19$WARN, format_str, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2213L)
  public static SubLObject log_fact_sheet_note(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym2$LOG_FACT_SHEET_MESSAGE, $str20$NOTE, format_str, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2378L)
  public static SubLObject with_fact_sheet_log_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    filename = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym0$CLET, ConsesLow.list( ConsesLow.list( $sym22$_FACT_SHEET_LOG_FILE_, filename ) ), ConsesLow.listS( $sym23$WITH_PRIVATE_TEXT_FILE, $list24, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2597L)
  public static SubLObject with_fact_sheet_logging(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject directory = $sym25$DIRECTORY;
    final SubLObject filename = $sym26$FILENAME;
    final SubLObject already_loggingP = $sym27$ALREADY_LOGGING_;
    final SubLObject use_new_setupP = $sym28$USE_NEW_SETUP_;
    return ConsesLow.list( $sym0$CLET, ConsesLow.list( reader.bq_cons( already_loggingP, $list29 ), directory, filename, use_new_setupP ), ConsesLow.list( $sym30$PUNLESS, already_loggingP, ConsesLow.listS(
        $sym31$CMULTIPLE_VALUE_SETQ, ConsesLow.list( directory, filename ), $list32 ), ConsesLow.list( $sym33$CSETQ, use_new_setupP, ConsesLow.list( $sym9$CAND, ConsesLow.list( $sym34$DIRECTORY_P, directory ), ConsesLow
            .list( $sym35$STRINGP, filename ) ) ) ), ConsesLow.listS( $sym7$PWHEN, use_new_setupP, ConsesLow.list( $sym14$FORMAT, $sym36$_STANDARD_OUTPUT_, $str37$__Logging_Fact_Sheet_generation_t, filename ), $list38 ),
        ConsesLow.listS( $sym39$WITH_FACT_SHEET_LOG_FILE, ConsesLow.list( ConsesLow.listS( $sym40$FIF, use_new_setupP, filename, $list41 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.listS( $sym7$PWHEN,
            use_new_setupP, $list42 ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3509L)
  public static SubLObject note_fact_sheet_log_file_closed(SubLObject file)
  {
    if( file == UNPROVIDED )
    {
      file = $fact_sheet_log_file$.getDynamicValue();
    }
    $closed_fact_sheet_log_files$.setGlobalValue( ConsesLow.cons( file, $closed_fact_sheet_log_files$.getGlobalValue() ) );
    return $closed_fact_sheet_log_files$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3723L)
  public static SubLObject fact_sheet_log_file_closed_p(final SubLObject file)
  {
    return subl_promotions.memberP( file, $closed_fact_sheet_log_files$.getGlobalValue(), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4114L)
  public static SubLObject hourly_fact_sheet_stats()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $hourly_fact_sheet_stats$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4194L)
  public static SubLObject with_fact_sheet_logging_and_hourly_reporting(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym45$WITH_FACT_SHEET_LOGGING, ConsesLow.listS( $sym0$CLET, $list46, $list47, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4452L)
  public static SubLObject fact_sheet_hourly_reporting_onP()
  {
    return Types.vectorp( hourly_fact_sheet_stats() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4549L)
  public static SubLObject reset_hourly_report_time(SubLObject time)
  {
    if( time == UNPROVIDED )
    {
      time = numeric_date_utilities.universal_time_from_now( ZERO_INTEGER, ZERO_INTEGER, ONE_INTEGER );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $next_fact_sheet_hourly_report_time$.setDynamicValue( time, thread );
    return $next_fact_sheet_hourly_report_time$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4801L)
  public static SubLObject clear_hourly_fact_sheet_stats()
  {
    clear_hourly_fact_sheet_update_count();
    clear_hourly_fact_sheet_query_timeout_count();
    return hourly_fact_sheet_stats();
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4975L)
  public static SubLObject add_fact_sheet_info_to_hourly_stats(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( hourly_fact_sheet_stats().isVector() )
    {
      Vectors.set_aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ZERO_INTEGER, Numbers.add( Vectors.aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ZERO_INTEGER ), ONE_INTEGER ) );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5159L)
  public static SubLObject get_hourly_fact_sheet_update_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Vectors.aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5258L)
  public static SubLObject clear_hourly_fact_sheet_update_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Vectors.set_aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ZERO_INTEGER, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5375L)
  public static SubLObject note_fact_sheet_query_timeout_in_hourly_stats()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != fact_sheet_hourly_reporting_onP() )
    {
      Vectors.set_aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ONE_INTEGER, Numbers.add( Vectors.aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ONE_INTEGER ), ONE_INTEGER ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5546L)
  public static SubLObject get_hourly_fact_sheet_query_timeout_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Vectors.aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5652L)
  public static SubLObject clear_hourly_fact_sheet_query_timeout_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    Vectors.set_aref( $hourly_fact_sheet_stats$.getDynamicValue( thread ), ONE_INTEGER, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5776L)
  public static SubLObject maybe_log_fact_sheet_hourly_report()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != numeric_date_utilities.universal_time_p( $next_fact_sheet_hourly_report_time$.getDynamicValue( thread ) ) && Time.get_universal_time().numG( $next_fact_sheet_hourly_report_time$.getDynamicValue(
        thread ) ) )
    {
      log_fact_sheet_hourly_report();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6024L)
  public static SubLObject log_fact_sheet_hourly_report()
  {
    final SubLObject fact_sheet_count = get_hourly_fact_sheet_update_count();
    final SubLObject timeout_count = get_hourly_fact_sheet_query_timeout_count();
    final SubLObject stream = fact_sheet_log_stream();
    if( ( T == stream && Threads.current_process().eql( subl_promotions.initial_process() ) ) || ( stream.isStream() && NIL != streams_high.output_stream_p( stream ) ) )
    {
      print_fact_sheet_log_header( $str20$NOTE, stream );
      PrintLow.format( stream, $str50$Hourly_report__Generated__S_fact_, fact_sheet_count, timeout_count );
      streams_high.force_output( stream );
    }
    clear_hourly_fact_sheet_stats();
    reset_hourly_report_time( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6408L)
  public static SubLObject fact_sheet_log_directory_generated_count(final SubLObject log_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = Sequences.cconcatenate( $str51$Counting_fact_sheets_in_, format_nil.format_nil_s_no_copy( log_directory ) );
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            total = Numbers.add( total, fact_sheet_log_file_generated_count( file, UNPROVIDED ) );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6763L)
  public static SubLObject fact_sheet_log_file_generated_count(final SubLObject log_file, SubLObject data)
  {
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    return Sequences.length( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6920L)
  public static SubLObject fact_sheet_log_directory_average_total_time(final SubLObject log_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject time = ZERO_INTEGER;
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = Sequences.cconcatenate( $str53$Gathering_time_info_for_fact_shee, format_nil.format_nil_s_no_copy( log_directory ) );
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            thread.resetMultipleValues();
            final SubLObject this_count = fact_sheet_log_file_generated_count( file, UNPROVIDED );
            final SubLObject this_time = thread.secondMultipleValue();
            thread.resetMultipleValues();
            count = Numbers.add( count, this_count );
            time = Numbers.add( time, this_time );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
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
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return Numbers.divide( time, count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 7367L)
  public static SubLObject fact_sheet_log_file_count_and_total_time(final SubLObject log_file, SubLObject data)
  {
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject count = fact_sheet_log_file_generated_count( log_file, data );
    SubLObject total_time = ZERO_INTEGER;
    SubLObject cdolist_list_var = data;
    SubLObject plist = NIL;
    plist = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject this_time = conses_high.getf( plist, $kw54$TOTAL_TIME, NIL );
      if( NIL != this_time )
      {
        total_time = Numbers.add( total_time, this_time );
      }
      else
      {
        count = Numbers.subtract( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      plist = cdolist_list_var.first();
    }
    return Values.values( count, total_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 7885L)
  public static SubLObject plot_fact_sheet_log_directory_generated_count_by_date(final SubLObject log_directory, SubLObject output_file, SubLObject ensure_up_to_dateP)
  {
    if( output_file == UNPROVIDED )
    {
      output_file = NIL;
    }
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLObject v_dictionary = fact_sheet_log_directory_generated_count_by_date( log_directory, ensure_up_to_dateP );
    SubLObject data = NIL;
    SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys( v_dictionary, $sym56$DATESTRING_ );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject date_string = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
      date_string = current.first();
      current = ( count = current.rest() );
      data = ConsesLow.cons( ConsesLow.list( date_string, count ), data );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    plot_generation.generate_lines_graph( ConsesLow.list( Sequences.nreverse( data ) ), ConsesLow.list( new SubLObject[] { $kw57$XDATA, $str58$time, $kw59$TIMEFMT, $str60$__m__d__Y_, $kw61$XLABEL, $str62$Date,
      $kw63$YLABEL, $str64$__of_Fact_Sheets, $kw65$PLOT_TITLE, log_directory, $kw66$LINE_LABELS, $list67, $kw68$OUTPUT_FILE, output_file
    } ) );
    return output_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 8567L)
  public static SubLObject fact_sheet_log_directory_generated_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, ensure_up_to_dateP );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject progress_message = Sequences.cconcatenate( $str69$Categorizing_fact_sheets_in_, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str70$_by_date
    } );
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            fact_sheet_log_file_generated_count_by_date( file, v_dictionary, file_data );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 9250L)
  public static SubLObject fact_sheet_log_file_generated_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data)
  {
    if( v_dictionary == UNPROVIDED )
    {
      v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date_string = list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED );
      dictionary_utilities.dictionary_increment( v_dictionary, date_string, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 9604L)
  public static SubLObject fact_sheet_log_directory_average_total_time_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, ensure_up_to_dateP );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject progress_message = Sequences.cconcatenate( $str72$Analyzing_fact_sheet_times_in_, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str70$_by_date
    } );
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            fact_sheet_log_file_average_total_time_by_date( file, v_dictionary, file_data );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
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
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$7, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 10297L)
  public static SubLObject fact_sheet_log_file_average_total_time_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data)
  {
    if( v_dictionary == UNPROVIDED )
    {
      v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date_string = list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED );
      final SubLObject seconds = list_utilities.plist_lookup( datum, $kw54$TOTAL_TIME, ZERO_INTEGER );
      SubLObject date_string_data = dictionary.dictionary_lookup_without_values( v_dictionary, date_string, NIL );
      if( NIL == date_string_data )
      {
        date_string_data = ConsesLow.cons( ZERO_INTEGER, ZERO_INTEGER );
        dictionary.dictionary_enter( v_dictionary, date_string, date_string_data );
      }
      final SubLObject new_data = ConsesLow.cons( number_utilities.f_1X( date_string_data.first() ), Numbers.add( seconds, date_string_data.rest() ) );
      dictionary.dictionary_enter( v_dictionary, date_string, new_data );
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 11098L)
  public static SubLObject fact_sheet_log_directory_average_category_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, ensure_up_to_dateP );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject progress_message = Sequences.cconcatenate( $str73$Analyzing_fact_sheet_categorizati, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str70$_by_date
    } );
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            fact_sheet_log_file_average_category_count_by_date( file, v_dictionary, file_data );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$9, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 11805L)
  public static SubLObject fact_sheet_log_file_average_category_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data)
  {
    if( v_dictionary == UNPROVIDED )
    {
      v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date_string = list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED );
      final SubLObject count = list_utilities.plist_lookup( datum, $kw74$CATEGORY_COUNT, ZERO_INTEGER );
      SubLObject date_string_data = dictionary.dictionary_lookup_without_values( v_dictionary, date_string, NIL );
      if( NIL == date_string_data )
      {
        date_string_data = ConsesLow.cons( ZERO_INTEGER, ZERO_INTEGER );
        dictionary.dictionary_enter( v_dictionary, date_string, date_string_data );
      }
      final SubLObject new_data = ConsesLow.cons( number_utilities.f_1X( date_string_data.first() ), Numbers.add( count, date_string_data.rest() ) );
      dictionary.dictionary_enter( v_dictionary, date_string, new_data );
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 12614L)
  public static SubLObject fact_sheet_log_directory_average_sentence_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, ensure_up_to_dateP );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject progress_message = Sequences.cconcatenate( $str75$Analyzing_fact_sheet_sentence_cou, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str70$_by_date
    } );
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$11 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            fact_sheet_log_file_average_sentence_count_by_date( file, v_dictionary, file_data );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$11, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 13317L)
  public static SubLObject fact_sheet_log_file_average_sentence_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data)
  {
    if( v_dictionary == UNPROVIDED )
    {
      v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date_string = list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED );
      final SubLObject count = list_utilities.plist_lookup( datum, $kw76$PPH_SENTENCE_COUNT, ZERO_INTEGER );
      SubLObject date_string_data = dictionary.dictionary_lookup_without_values( v_dictionary, date_string, NIL );
      if( NIL == date_string_data )
      {
        date_string_data = ConsesLow.cons( ZERO_INTEGER, ZERO_INTEGER );
        dictionary.dictionary_enter( v_dictionary, date_string, date_string_data );
      }
      final SubLObject new_data = ConsesLow.cons( number_utilities.f_1X( date_string_data.first() ), Numbers.add( count, date_string_data.rest() ) );
      dictionary.dictionary_enter( v_dictionary, date_string, new_data );
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 14142L)
  public static SubLObject fact_sheet_log_directory_average_uncategorized_sentence_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, ensure_up_to_dateP );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject progress_message = Sequences.cconcatenate( $str77$Analyzing_fact_sheet_uncategorize, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str70$_by_date
    } );
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$13 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            fact_sheet_log_file_average_uncategorized_sentence_count_by_date( file, v_dictionary, file_data );
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
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
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
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$13, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 14885L)
  public static SubLObject fact_sheet_log_file_average_uncategorized_sentence_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data)
  {
    if( v_dictionary == UNPROVIDED )
    {
      v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date_string = list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED );
      final SubLObject count = list_utilities.plist_lookup( datum, $kw78$MISC_SENTENCE_COUNT, ZERO_INTEGER );
      SubLObject date_string_data = dictionary.dictionary_lookup_without_values( v_dictionary, date_string, NIL );
      if( NIL == date_string_data )
      {
        date_string_data = ConsesLow.cons( ZERO_INTEGER, ZERO_INTEGER );
        dictionary.dictionary_enter( v_dictionary, date_string, date_string_data );
      }
      final SubLObject new_data = ConsesLow.cons( number_utilities.f_1X( date_string_data.first() ), Numbers.add( count, date_string_data.rest() ) );
      dictionary.dictionary_enter( v_dictionary, date_string, new_data );
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 15739L)
  public static SubLObject plot_fact_sheet_log_directory_query_failure_rate_by_date(final SubLObject log_directory, SubLObject top_n, SubLObject output_file, SubLObject ensure_up_to_dateP)
  {
    if( top_n == UNPROVIDED )
    {
      top_n = FIVE_INTEGER;
    }
    if( output_file == UNPROVIDED )
    {
      output_file = NIL;
    }
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    SubLObject line_labels = NIL;
    SubLObject all_data = NIL;
    SubLObject line_data = NIL;
    SubLObject top_n_queries = NIL;
    SubLObject cdolist_list_var = fact_sheet_log_directory_query_failure_rate_by_date( log_directory, ensure_up_to_dateP );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject date_string = NIL;
      SubLObject failures = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      date_string = current.first();
      current = ( failures = current.rest() );
      all_data = ConsesLow.cons( ConsesLow.cons( date_string, failures ), all_data );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    final SubLObject most_recent_failures = all_data.first().rest();
    final SubLObject sorted = dictionary_utilities.sort_dictionary_by_values( most_recent_failures, Symbols.symbol_function( $sym80$_ ) );
    top_n_queries = ( cdolist_list_var = list_utilities.first_n( top_n, list_utilities.alist_keys( sorted ) ) );
    SubLObject top_query = NIL;
    top_query = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject line_datum = NIL;
      SubLObject cdolist_list_var_$15 = all_data;
      SubLObject datum2 = NIL;
      datum2 = cdolist_list_var_$15.first();
      while ( NIL != cdolist_list_var_$15)
      {
        SubLObject current2;
        final SubLObject datum_$16 = current2 = datum2;
        SubLObject date_string2 = NIL;
        SubLObject failures2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum_$16, $list81 );
        date_string2 = current2.first();
        current2 = current2.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current2, datum_$16, $list81 );
        failures2 = current2.first();
        current2 = current2.rest();
        if( NIL == current2 )
        {
          final SubLObject failure_rate_for_query_on_date = dictionary.dictionary_lookup_without_values( failures2, top_query, UNPROVIDED );
          line_datum = ConsesLow.cons( ConsesLow.list( date_string2, failure_rate_for_query_on_date ), line_datum );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$16, $list81 );
        }
        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
        datum2 = cdolist_list_var_$15.first();
      }
      line_data = ConsesLow.cons( line_datum, line_data );
      line_labels = ConsesLow.cons( print_high.princ_to_string( top_query ), line_labels );
      cdolist_list_var = cdolist_list_var.rest();
      top_query = cdolist_list_var.first();
    }
    plot_generation.generate_lines_graph( line_data, ConsesLow.list( new SubLObject[] { $kw57$XDATA, $str58$time, $kw59$TIMEFMT, $str60$__m__d__Y_, $kw61$XLABEL, $str62$Date, $kw63$YLABEL, $str82$Failure_Rate,
      $kw65$PLOT_TITLE, Sequences.cconcatenate( $str83$Query_Failure_Rates_by_Day, new SubLObject[]
      { format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_s_no_copy( log_directory )
      } ), $kw66$LINE_LABELS, line_labels, $kw68$OUTPUT_FILE, output_file
    } ) );
    return output_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 17234L)
  public static SubLObject fact_sheet_log_directory_query_failure_rate_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, ensure_up_to_dateP );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject progress_message = Sequences.cconcatenate( $str84$Analyzing_query_failure_rates_in_, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str70$_by_date
    } );
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            fact_sheet_log_file_query_failure_rate_by_date( file, v_dictionary, file_data );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$17, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    SubLObject results = NIL;
    SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys( v_dictionary, $sym56$DATESTRING_ );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject date_string = NIL;
      SubLObject info_cons = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
      date_string = current.first();
      current = ( info_cons = current.rest() );
      final SubLObject dictionary_for_date = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
      SubLObject current_$20;
      final SubLObject datum_$19 = current_$20 = info_cons;
      SubLObject total_count = NIL;
      SubLObject query_failure_dictionary = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$20, datum_$19, $list86 );
      total_count = current_$20.first();
      current_$20 = ( query_failure_dictionary = current_$20.rest() );
      if( total_count.isPositive() )
      {
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( query_failure_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject query = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject failure_count = thread.secondMultipleValue();
          thread.resetMultipleValues();
          dictionary.dictionary_enter( dictionary_for_date, query, Numbers.divide( failure_count, total_count ) );
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        results = ConsesLow.cons( ConsesLow.cons( date_string, dictionary_for_date ), results );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return Sequences.nreverse( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 18554L)
  public static SubLObject fact_sheet_log_file_query_failure_rate_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data)
  {
    if( v_dictionary == UNPROVIDED )
    {
      v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject date_string = list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED );
      SubLObject date_string_entry = dictionary.dictionary_lookup_without_values( v_dictionary, date_string, $kw87$NOT_FOUND );
      if( $kw87$NOT_FOUND == date_string_entry )
      {
        date_string_entry = ConsesLow.cons( ZERO_INTEGER, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
        dictionary.dictionary_enter( v_dictionary, date_string, date_string_entry );
      }
      if( $kw88$NORMAL == list_utilities.plist_lookup( datum, $kw89$VERBOSITY, UNPROVIDED ) )
      {
        ConsesLow.rplaca( date_string_entry, Numbers.add( date_string_entry.first(), ONE_INTEGER ) );
        SubLObject cdolist_list_var_$21 = list_utilities.plist_lookup( datum, $kw91$QUERY_TIMEOUT_INFO, NIL );
        SubLObject query_info = NIL;
        query_info = cdolist_list_var_$21.first();
        while ( NIL != cdolist_list_var_$21)
        {
          final SubLObject query = list_utilities.plist_lookup( query_info, $kw90$QUERY, UNPROVIDED );
          dictionary_utilities.dictionary_increment( date_string_entry.rest(), query, UNPROVIDED );
          cdolist_list_var_$21 = cdolist_list_var_$21.rest();
          query_info = cdolist_list_var_$21.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return v_dictionary;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 19485L)
  public static SubLObject fact_sheet_log_directory_generated_count_for_date(final SubLObject log_directory, SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject directory_data = get_fact_sheet_log_directory_data( log_directory, UNPROVIDED );
    SubLObject total = ZERO_INTEGER;
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = Sequences.cconcatenate( $str51$Counting_fact_sheets_in_, new SubLObject[] { format_nil.format_nil_s_no_copy( log_directory ), $str92$_generated_on_, format_nil
        .format_nil_s_no_copy( universal_date )
    } );
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$22 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            final SubLObject file_data = dictionary.dictionary_lookup( directory_data, file_utilities.pathstring_filename( file ), NIL );
            total = Numbers.add( total, fact_sheet_log_file_generated_count_for_date( file, universal_date, file_data ) );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$22, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20098L)
  public static SubLObject fact_sheet_log_file_generated_count_for_date(final SubLObject log_file, SubLObject universal_date, SubLObject data)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    if( data == UNPROVIDED )
    {
      data = get_fact_sheet_log_file_data( log_file );
    }
    SubLObject count = ZERO_INTEGER;
    final SubLObject datestring = numeric_date_utilities.datestring( universal_date );
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject csome_list_var = data;
      SubLObject datum = NIL;
      datum = csome_list_var.first();
      while ( NIL == doneP && NIL != csome_list_var)
      {
        if( NIL == numeric_date_utilities.datestringL( list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED ), datestring ) )
        {
          if( list_utilities.plist_lookup( datum, $kw71$END_DATE, UNPROVIDED ).equal( datestring ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          else
          {
            doneP = T;
          }
        }
        csome_list_var = csome_list_var.rest();
        datum = csome_list_var.first();
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20617L)
  public static SubLObject fact_sheet_log_file_generated_count_old(final SubLObject log_file)
  {
    return Sequences.length( regular_expression_utilities.file_grep( $str93$Finished_fact_sheet, log_file, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20746L)
  public static SubLObject fact_sheet_log_file_generated_count_for_date_old(final SubLObject log_file, SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    return Sequences.length( regular_expression_utilities.file_grep( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( numeric_date_utilities.datestring( universal_date ) ), $str94$____Finished_fact_sheet ),
        log_file, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 22220L)
  public static SubLObject get_fact_sheet_log_file_data(final SubLObject log_file)
  {
    final SubLObject cfasl_file = parse_and_save_fact_sheet_log_file_data( log_file, UNPROVIDED, UNPROVIDED );
    final SubLObject dictionary_or_alist = cfasl_utilities.cfasl_load( cfasl_file );
    return ( NIL != dictionary.dictionary_p( dictionary_or_alist ) ) ? dictionary.dictionary_lookup( dictionary_or_alist, file_utilities.pathstring_filename( log_file ), NIL )
        : list_utilities.alist_lookup( dictionary_or_alist, file_utilities.pathstring_filename( log_file ), Symbols.symbol_function( EQUAL ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 22761L)
  public static SubLObject get_fact_sheet_log_directory_data(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    if( NIL != ensure_up_to_dateP )
    {
      remove_get_fact_sheet_log_directory_data_cached( log_directory, T );
    }
    return get_fact_sheet_log_directory_data_cached( log_directory, ensure_up_to_dateP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
  public static SubLObject clear_get_fact_sheet_log_directory_data_cached()
  {
    final SubLObject cs = $get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
  public static SubLObject remove_get_fact_sheet_log_directory_data_cached(final SubLObject log_directory, final SubLObject ensure_up_to_dateP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue(), ConsesLow.list( log_directory, ensure_up_to_dateP ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
  public static SubLObject get_fact_sheet_log_directory_data_cached_internal(final SubLObject log_directory, final SubLObject ensure_up_to_dateP)
  {
    final SubLObject cfasl_file = find_or_create_fact_sheet_log_directory_data_file( log_directory, ensure_up_to_dateP );
    final SubLObject data = cfasl_utilities.cfasl_load( cfasl_file );
    assert NIL != dictionary.dictionary_p( data ) : data;
    return data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
  public static SubLObject get_fact_sheet_log_directory_data_cached(final SubLObject log_directory, final SubLObject ensure_up_to_dateP)
  {
    SubLObject caching_state = $get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED, $sym98$_GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED_CACHING_STATE_, NIL, EQUALP, TWO_INTEGER,
          ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( log_directory, ensure_up_to_dateP );
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
        if( log_directory.equalp( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ensure_up_to_dateP.equalp( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_fact_sheet_log_directory_data_cached_internal( log_directory, ensure_up_to_dateP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( log_directory, ensure_up_to_dateP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23583L)
  public static SubLObject find_or_create_fact_sheet_log_directory_data_file(final SubLObject log_directory, SubLObject ensure_up_to_dateP)
  {
    if( ensure_up_to_dateP == UNPROVIDED )
    {
      ensure_up_to_dateP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject cfasl_file = fact_sheet_log_directory_parsed_data_filename( log_directory );
    if( NIL == file_utilities.file_existsP( cfasl_file ) )
    {
      return parse_and_save_fact_sheet_log_directory_data( log_directory );
    }
    final SubLObject file_write_date = Filesys.file_write_date( cfasl_file );
    SubLObject directory_data = ( NIL != file_utilities.file_existsP( cfasl_file ) ) ? cfasl_utilities.cfasl_load( cfasl_file ) : NIL;
    final SubLObject progress_message = $str99$Ensuring_data_file_is_up_to_date_;
    if( NIL == dictionary.dictionary_p( directory_data ) )
    {
      directory_data = dictionary_utilities.new_dictionary_from_alist( directory_data, Symbols.symbol_function( EQUAL ) );
      cfasl_utilities.cfasl_save_externalized( directory_data, cfasl_file );
    }
    if( NIL != ensure_up_to_dateP )
    {
      assert NIL != Filesys.directory_p( log_directory ) : log_directory;
      SubLObject directory_contents_var = Filesys.directory( log_directory, T );
      final SubLObject progress_message_var = progress_message;
      final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
        if( NIL.isFunctionSpec() )
        {
          directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
        }
        final SubLObject list_var = directory_contents_var;
        final SubLObject _prev_bind_0_$24 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
            SubLObject log_file = NIL;
            log_file = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              if( NIL != string_utilities.ends_with( log_file, $str100$_log, UNPROVIDED ) && file_write_date.numL( Filesys.file_write_date( log_file ) ) )
              {
                parse_and_save_fact_sheet_log_file_data( log_file, cfasl_file, directory_data );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              log_file = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
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
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$24, thread );
        }
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
      }
    }
    return cfasl_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 24681L)
  public static SubLObject ensure_fact_sheet_log_directories_are_up_to_date()
  {
    SubLObject stopP = NIL;
    SubLObject data_files = NIL;
    if( NIL == stopP )
    {
      SubLObject kb = NIL;
      kb = number_utilities.f_1_( control_vars.kb_loaded() );
      while ( NIL == stopP)
      {
        final SubLObject directory_list = fact_sheet_log_directory_path_for_kb( kb );
        final SubLObject directory = file_utilities.cyc_home_subdirectory( directory_list );
        if( NIL != Filesys.directory_p( directory ) )
        {
          data_files = ConsesLow.cons( find_or_create_fact_sheet_log_directory_data_file( directory, T ), data_files );
        }
        else
        {
          stopP = T;
        }
        kb = Numbers.add( kb, MINUS_ONE_INTEGER );
      }
    }
    return data_files;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 25154L)
  public static SubLObject parse_and_save_fact_sheet_log_directory_data(final SubLObject log_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    final SubLObject cfasl_file = fact_sheet_log_directory_parsed_data_filename( log_directory );
    SubLObject directory_data = ( NIL != file_utilities.file_existsP( cfasl_file ) ) ? cfasl_utilities.cfasl_load( cfasl_file ) : NIL;
    final SubLObject progress_message = Sequences.cconcatenate( $str101$Parsing_data_from_, new SubLObject[] { format_nil.format_nil_a_no_copy( log_directory ), $str102$___
    } );
    if( NIL == dictionary.dictionary_p( directory_data ) )
    {
      directory_data = dictionary_utilities.new_dictionary_from_alist( directory_data, Symbols.symbol_function( EQUAL ) );
    }
    assert NIL != Filesys.directory_p( log_directory ) : log_directory;
    SubLObject directory_contents_var = Filesys.directory( log_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( NIL.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str52$cdolist, thread );
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
          SubLObject log_file = NIL;
          log_file = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != string_utilities.ends_with( log_file, $str100$_log, UNPROVIDED ) && NIL != file_utilities.file_existsP( log_file ) )
            {
              parse_and_save_fact_sheet_log_file_data( log_file, cfasl_file, directory_data );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            log_file = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$26, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return cfasl_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 25904L)
  public static SubLObject parse_and_save_fact_sheet_log_file_data(final SubLObject log_file, SubLObject cfasl_file, SubLObject directory_data)
  {
    if( cfasl_file == UNPROVIDED )
    {
      cfasl_file = fact_sheet_log_file_parsed_data_filename( log_file );
    }
    if( directory_data == UNPROVIDED )
    {
      directory_data = ( NIL != file_utilities.file_existsP( cfasl_file ) ) ? cfasl_utilities.cfasl_load( cfasl_file ) : NIL;
    }
    assert NIL != file_utilities.file_existsP( log_file ) : log_file;
    final SubLObject local_filename = Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), file_utilities.deconstruct_path( log_file ) );
    final SubLObject new_data = fact_sheet_log_file_parse_data( log_file );
    dictionary.dictionary_enter( directory_data, local_filename, new_data );
    cfasl_utilities.cfasl_save_externalized( directory_data, cfasl_file );
    return cfasl_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 26488L)
  public static SubLObject fact_sheet_log_file_parsed_data_filename(final SubLObject log_file)
  {
    final SubLObject directory = file_utilities.reconstruct_path( file_utilities.deconstruct_path( log_file ), $str104$, UNPROVIDED );
    return fact_sheet_log_directory_parsed_data_filename( directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 26699L)
  public static SubLObject fact_sheet_log_directory_parsed_data_filename(final SubLObject directory)
  {
    return Sequences.cconcatenate( directory, $str105$parsed_data_cfasl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 26828L)
  public static SubLObject fact_sheet_log_file_parse_data(final SubLObject log_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject data = NIL;
    SubLObject current_datum = NIL;
    SubLObject query_timeout_info = NIL;
    SubLObject state = NIL;
    SubLObject stale_fact_sheet_updater_logP = NIL;
    SubLObject file_level_verbosity = NIL;
    final SubLObject timestamp_length = Sequences.length( $str106$MM_DD_YYYY_HH_MM_SS_ );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( log_file, $kw107$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str108$Unable_to_open__S, log_file );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject line;
        SubLObject offset;
        SubLObject term_end;
        SubLObject timed_out_query;
        SubLObject paragraph_count;
        SubLObject finished_term;
        SubLObject current_term;
        for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
        {
          if( NIL == state && NIL != fact_sheet_log_line_starts_withP( line, $str109$NOTE__Starting__, timestamp_length ) )
          {
            current_datum = fact_sheet_log_file_parse_start_line_data( line );
            if( NIL != file_level_verbosity && NIL == list_utilities.plist_lookup( current_datum, $kw89$VERBOSITY, NIL ) )
            {
              current_datum = conses_high.putf( current_datum, $kw89$VERBOSITY, file_level_verbosity );
            }
            state = $kw110$PARSING_DATUM;
          }
          else if( NIL == state && NIL != fact_sheet_log_line_starts_withP( line, $str111$_Verbosity__, ZERO_INTEGER ) )
          {
            file_level_verbosity = reader.read_from_string( line, NIL, NIL, Sequences.length( $str111$_Verbosity__ ), UNPROVIDED, UNPROVIDED );
          }
          else if( NIL == state && NIL != fact_sheet_log_line_starts_withP( line, $str112$NOTE__Dequeuing_, timestamp_length ) )
          {
            current_datum = fact_sheet_log_file_parse_dequeue_line_data( line, timestamp_length );
            state = $kw113$DEQUEUED_TERM;
          }
          else if( state == $kw113$DEQUEUED_TERM && NIL != fact_sheet_log_line_starts_withP( line, $str114$NOTE__Skipping_, timestamp_length ) )
          {
            state = NIL;
          }
          else if( state == $kw113$DEQUEUED_TERM && NIL != fact_sheet_log_line_starts_withP( line, $str115$NOTE__Updating_, timestamp_length ) )
          {
            if( NIL != file_level_verbosity && NIL == list_utilities.plist_lookup( current_datum, $kw89$VERBOSITY, NIL ) )
            {
              current_datum = conses_high.putf( current_datum, $kw89$VERBOSITY, file_level_verbosity );
            }
            state = $kw110$PARSING_DATUM;
          }
          else if( NIL == state && NIL != fact_sheet_log_line_starts_withP( line, $str116$NOTE__Updating_all_stale_fact_she, timestamp_length ) )
          {
            stale_fact_sheet_updater_logP = T;
          }
          else if( NIL == state && NIL != fact_sheet_log_line_starts_withP( line, $str117$NOTE__Updating_stale_fact_sheet_f, timestamp_length ) )
          {
            current_datum = fact_sheet_log_file_parse_stale_start_line_data( line, timestamp_length );
            state = $kw110$PARSING_DATUM;
          }
          else if( state == $kw110$PARSING_DATUM && NIL != fact_sheet_log_line_starts_withP( line, $str118$WARN__Hit_soft_timeout_of_, timestamp_length ) )
          {
            current_datum = conses_high.putf( current_datum, $kw119$QUERY_TIMEOUTS, Numbers.add( list_utilities.plist_lookup( current_datum, $kw119$QUERY_TIMEOUTS, ZERO_INTEGER ), ONE_INTEGER ) );
            query_timeout_info = fact_sheet_log_file_parse_new_query_timeout_line_data( line );
            if( !$kw120$MINI.eql( list_utilities.plist_lookup( current_datum, $kw89$VERBOSITY, UNPROVIDED ) ) )
            {
              state = $kw121$HIT_QUERY_TIMEOUT;
            }
          }
          else if( state == $kw121$HIT_QUERY_TIMEOUT )
          {
            offset = Numbers.add( timestamp_length, Sequences.length( $str122$NOTE__ ) );
            term_end = Sequences.position( Characters.CHAR_colon, line, Symbols.symbol_function( EQ ), Symbols.symbol_function( IDENTITY ), offset, UNPROVIDED );
            timed_out_query = fact_sheet_term_from_string( line, offset, term_end, NIL );
            if( NIL != cycl_grammar.cycl_denotational_term_p( timed_out_query ) )
            {
              query_timeout_info = conses_high.putf( query_timeout_info, $kw90$QUERY, timed_out_query );
            }
            state = $kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD;
          }
          else if( state == $kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD )
          {
            paragraph_count = reader.read_from_string_ignoring_errors( line, NIL, NIL, Sequences.length( $str124$_yielded_ ), UNPROVIDED );
            if( paragraph_count.isInteger() )
            {
              query_timeout_info = conses_high.putf( query_timeout_info, $kw125$PARAGRAPH_COUNT, paragraph_count );
            }
            current_datum = conses_high.putf( current_datum, $kw91$QUERY_TIMEOUT_INFO, ConsesLow.cons( query_timeout_info, list_utilities.plist_lookup( current_datum, $kw91$QUERY_TIMEOUT_INFO, NIL ) ) );
            state = $kw110$PARSING_DATUM;
          }
          else if( NIL != fact_sheet_log_line_starts_withP( line, $str126$WARN__Launching_make_up_updater, timestamp_length ) )
          {
            Errors.warn( $str127$We_appear_to_have_aborted_the_fac, list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED ), log_file );
            state = NIL;
          }
          else if( state == $kw110$PARSING_DATUM && NIL != fact_sheet_log_line_starts_withP( line, $str129$NOTE__Added_, timestamp_length ) )
          {
            current_datum = update_current_datum_for_misc_sentence_stats( current_datum, line, timestamp_length );
          }
          else if( state == $kw110$PARSING_DATUM && NIL != fact_sheet_log_line_starts_withP( line, $str130$NOTE__Gathered_, timestamp_length ) )
          {
            current_datum = update_current_datum_for_info_gather_stats( current_datum, line, timestamp_length );
          }
          else if( state == $kw110$PARSING_DATUM && NIL != string_utilities.starts_with( line, $str131$_implies_ ) )
          {
            current_datum = conses_high.putf( current_datum, $kw132$FILTERED_REDUNDANT_FACT_COUNT, Numbers.add( list_utilities.plist_lookup( current_datum, $kw132$FILTERED_REDUNDANT_FACT_COUNT, ZERO_INTEGER ),
                ONE_INTEGER ) );
          }
          else if( state == $kw110$PARSING_DATUM && NIL != fact_sheet_log_line_starts_withP( line, $str133$NOTE__Generated_, timestamp_length ) )
          {
            current_datum = update_current_datum_for_pph_stats( current_datum, line, timestamp_length );
            if( NIL != stale_fact_sheet_updater_logP )
            {
              add_end_date_and_time_to_datum( current_datum, line );
              add_total_time_to_datum( current_datum, UNPROVIDED );
              data = ConsesLow.cons( current_datum, data );
              state = NIL;
            }
          }
          else if( state == $kw110$PARSING_DATUM && NIL != fact_sheet_log_line_starts_withP( line, $str134$WARN__Failed_to_paraphrase_, timestamp_length ) )
          {
            current_datum = update_current_datum_for_pph_failure_stats( current_datum, line, timestamp_length );
          }
          else if( NIL != fact_sheet_log_line_starts_withP( line, $str135$WARN__Query_failed_to_get_mini_fa, timestamp_length ) )
          {
            state = NIL;
          }
          else if( NIL != fact_sheet_log_line_starts_withP( line, $str136$NOTE__Query_got_mini_fact_sheet_o, timestamp_length ) )
          {
            add_end_date_and_time_to_datum( current_datum, line );
            add_total_time_to_datum( current_datum, UNPROVIDED );
            data = ConsesLow.cons( current_datum, data );
            state = NIL;
          }
          else if( NIL != fact_sheet_log_line_starts_withP( line, $str137$NOTE__Finished_fact_sheet_for_, timestamp_length ) )
          {
            if( state == $kw110$PARSING_DATUM )
            {
              current_datum = finalize_current_datum( current_datum, line, timestamp_length );
              data = ConsesLow.cons( current_datum, data );
            }
            else
            {
              finished_term = term_from_fact_sheet_log_finish_line( line, timestamp_length );
              current_term = conses_high.getf( current_datum, $kw128$TERM, UNPROVIDED );
              if( !finished_term.equal( current_term ) )
              {
                Errors.sublisp_break( $str138$Found_finish_line__but_state_is__, new SubLObject[] { state, current_datum, line, log_file
                } );
              }
              current_datum = NIL;
            }
            state = NIL;
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
    if( NIL != state )
    {
      Errors.warn( $str139$We_appear_to_have_aborted_the_fac, list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED ), log_file );
    }
    return Sequences.nreverse( data );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 33351L)
  public static SubLObject fact_sheet_log_line_starts_withP(final SubLObject line, final SubLObject string, final SubLObject timestamp_length)
  {
    final SubLObject end_pos = Numbers.add( timestamp_length, Sequences.length( string ) );
    return makeBoolean( NIL != list_utilities.lengthG( line, end_pos, UNPROVIDED ) && string_utilities.substring( line, timestamp_length, end_pos ).equal( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 33605L)
  public static SubLObject fact_sheet_log_file_parse_start_line_data(final SubLObject line)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_datum = NIL;
    thread.resetMultipleValues();
    final SubLObject verbosity = reader.read_from_string( line, NIL, NIL, $int140$35, UNPROVIDED, UNPROVIDED );
    final SubLObject i = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject term_start = Numbers.add( i, Sequences.length( $str141$update_on_ ) );
    final SubLObject term_end = Sequences.search( $str142$__Status, line, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, term_start, UNPROVIDED );
    final SubLObject v_term = fact_sheet_term_from_string( line, term_start, term_end, UNPROVIDED );
    final SubLObject status = reader.read_from_string( line, NIL, NIL, Numbers.add( term_end, Sequences.length( $str143$__Status__ ) ), UNPROVIDED, UNPROVIDED );
    current_datum = ConsesLow.list( new SubLObject[] { $kw89$VERBOSITY, verbosity, $kw128$TERM, v_term, $kw144$STATUS, status, $kw145$START_DATE, string_utilities.substring( line, ZERO_INTEGER, TEN_INTEGER ),
      $kw146$START_TIME, string_utilities.substring( line, ELEVEN_INTEGER, NINETEEN_INTEGER )
    } );
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 34278L)
  public static SubLObject fact_sheet_log_file_parse_stale_start_line_data(final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_datum = NIL;
    thread.resetMultipleValues();
    final SubLObject v_term = fact_sheet_term_from_string( line, Numbers.add( timestamp_length, Sequences.length( $str117$NOTE__Updating_stale_fact_sheet_f ) ), UNPROVIDED, UNPROVIDED );
    final SubLObject term_end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != cycl_grammar.cycl_denotational_term_p( v_term ) )
    {
      final SubLObject verbosity = reader.read_from_string( line, NIL, NIL, term_end, UNPROVIDED, UNPROVIDED );
      final SubLObject status = $kw147$STALE;
      current_datum = ConsesLow.list( new SubLObject[] { $kw89$VERBOSITY, verbosity, $kw128$TERM, v_term, $kw144$STATUS, status, $kw145$START_DATE, string_utilities.substring( line, ZERO_INTEGER, TEN_INTEGER ),
        $kw146$START_TIME, string_utilities.substring( line, ELEVEN_INTEGER, NINETEEN_INTEGER )
      } );
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 34902L)
  public static SubLObject fact_sheet_log_file_parse_dequeue_line_data(final SubLObject line, final SubLObject timestamp_length)
  {
    SubLObject current_datum = NIL;
    final SubLObject term_start = Numbers.add( timestamp_length, Sequences.length( $str112$NOTE__Dequeuing_ ) );
    final SubLObject term_end = constant_reader.constant_reader_prefix().equal( string_utilities.substring( line, term_start, Numbers.add( term_start, TWO_INTEGER ) ) ) ? Sequences.position( Characters.CHAR_period, line,
        Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), term_start, UNPROVIDED ) : nart_end_from_string( line, term_start );
    final SubLObject v_term = fact_sheet_term_from_string( line, term_start, term_end, UNPROVIDED );
    final SubLObject status_start = Numbers.add( term_end, Sequences.length( $str143$__Status__ ) );
    final SubLObject status_end = Sequences.position( Characters.CHAR_period, line, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), status_start, UNPROVIDED );
    final SubLObject status = Symbols.make_keyword( Strings.string_upcase( string_utilities.substring( line, status_start, status_end ), UNPROVIDED, UNPROVIDED ) );
    current_datum = ConsesLow.list( $kw128$TERM, v_term, $kw144$STATUS, status, $kw145$START_DATE, string_utilities.substring( line, ZERO_INTEGER, TEN_INTEGER ), $kw146$START_TIME, string_utilities.substring( line,
        ELEVEN_INTEGER, NINETEEN_INTEGER ) );
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 35711L)
  public static SubLObject fact_sheet_log_file_parse_new_query_timeout_line_data(final SubLObject line)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_timeout_info = NIL;
    thread.resetMultipleValues();
    final SubLObject timeout_time = reader.read_from_string( line, NIL, NIL, $int148$46, UNPROVIDED, UNPROVIDED );
    final SubLObject i = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( timeout_time.isInteger() )
    {
      query_timeout_info = conses_high.putf( query_timeout_info, $kw149$TIMEOUT_TIME, timeout_time );
      final SubLObject query_result_count = reader.read_from_string( line, NIL, NIL, Numbers.add( i, Sequences.length( $str150$seconds_after_getting ) ), UNPROVIDED, UNPROVIDED );
      query_timeout_info = conses_high.putf( query_timeout_info, $kw151$RESULT_COUNT, query_result_count );
    }
    return query_timeout_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 36206L)
  public static SubLObject update_current_datum_for_misc_sentence_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sentence_count = reader.read_from_string( line, NIL, NIL, Numbers.add( timestamp_length, Sequences.length( $str129$NOTE__Added_ ) ), UNPROVIDED, UNPROVIDED );
    final SubLObject i = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( sentence_count.isInteger() )
    {
      current_datum = conses_high.putf( current_datum, $kw78$MISC_SENTENCE_COUNT, sentence_count );
      final SubLObject time = reader.read_from_string( line, NIL, NIL, Numbers.add( i, Sequences.length( $str152$THCL_sentences_in ) ), UNPROVIDED, UNPROVIDED );
      if( time.isNumber() )
      {
        current_datum = conses_high.putf( current_datum, $kw153$MISC_SENTENCE_TIME, time );
      }
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 36733L)
  public static SubLObject update_current_datum_for_pph_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject pph_paragraph_count = reader.read_from_string( line, NIL, NIL, Numbers.add( timestamp_length, Sequences.length( $str133$NOTE__Generated_ ) ), UNPROVIDED, UNPROVIDED );
    final SubLObject i = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( pph_paragraph_count.isInteger() )
    {
      current_datum = conses_high.putf( current_datum, $kw154$PPH_PARAGRAPH_COUNT, pph_paragraph_count );
      thread.resetMultipleValues();
      final SubLObject pph_sentence_count = reader.read_from_string( line, NIL, NIL, Numbers.add( i, Sequences.length( $str155$paragraphs_containing_ ) ), UNPROVIDED, UNPROVIDED );
      final SubLObject i_$28 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( pph_sentence_count.isInteger() )
      {
        current_datum = conses_high.putf( current_datum, $kw76$PPH_SENTENCE_COUNT, pph_sentence_count );
        final SubLObject offset = Numbers.add( i_$28, Sequences.length( $str156$sentences_for_ ) );
        thread.resetMultipleValues();
        final SubLObject v_term = fact_sheet_term_from_string( line, offset, NIL, UNPROVIDED );
        final SubLObject term_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != cycl_grammar.cycl_denotational_term_p( v_term ) )
        {
          if( !v_term.equal( list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED ) ) )
          {
            Errors.sublisp_break( $str157$Must_have_missed_the__Finished__l, new SubLObject[] { list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED )
            } );
          }
          final SubLObject time = reader.read_from_string( line, NIL, NIL, Numbers.add( term_end, Sequences.length( $str158$_in_ ) ), UNPROVIDED, UNPROVIDED );
          if( time.isNumber() )
          {
            current_datum = conses_high.putf( current_datum, $kw159$PPH_TIME, time );
          }
        }
      }
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 37840L)
  public static SubLObject update_current_datum_for_pph_failure_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLObject start_char = Numbers.add( timestamp_length, Sequences.length( $str134$WARN__Failed_to_paraphrase_ ) );
    final SubLObject sentence_count = reader.read_from_string( line, NIL, NIL, start_char, UNPROVIDED, UNPROVIDED );
    if( sentence_count.isInteger() )
    {
      current_datum = conses_high.putf( current_datum, $kw160$PPH_FAILURE_COUNT, Numbers.add( list_utilities.plist_lookup( current_datum, $kw160$PPH_FAILURE_COUNT, ZERO_INTEGER ), sentence_count ) );
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 38231L)
  public static SubLObject update_current_datum_for_info_gather_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject category_count = reader.read_from_string( line, NIL, NIL, Numbers.add( timestamp_length, Sequences.length( $str130$NOTE__Gathered_ ) ), UNPROVIDED, UNPROVIDED );
    final SubLObject i = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( category_count.isInteger() )
    {
      current_datum = conses_high.putf( current_datum, $kw74$CATEGORY_COUNT, category_count );
      final SubLObject offset = Numbers.add( i, Sequences.length( $str161$groups_of_sentences_for_ ) );
      thread.resetMultipleValues();
      final SubLObject v_term = fact_sheet_term_from_string( line, offset, NIL, UNPROVIDED );
      final SubLObject term_end = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != cycl_grammar.cycl_denotational_term_p( v_term ) )
      {
        if( !v_term.equal( list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED ) ) )
        {
          Errors.sublisp_break( $str157$Must_have_missed_the__Finished__l, new SubLObject[] { list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED )
          } );
        }
        final SubLObject time = reader.read_from_string( line, NIL, NIL, Numbers.add( term_end, Sequences.length( $str158$_in_ ) ), UNPROVIDED, UNPROVIDED );
        if( time.isNumber() )
        {
          current_datum = conses_high.putf( current_datum, $kw162$INFO_GATHERING_TIME, time );
        }
      }
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 39119L)
  public static SubLObject finalize_current_datum(final SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_term = term_from_fact_sheet_log_finish_line( line, timestamp_length );
    final SubLObject term_end = thread.secondMultipleValue();
    thread.resetMultipleValues();
    add_end_date_and_time_to_datum( current_datum, line );
    if( NIL != cycl_grammar.cycl_denotational_term_p( v_term ) && !v_term.equal( list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED ) ) )
    {
      Errors.sublisp_break( $str157$Must_have_missed_the__Finished__l, new SubLObject[] { list_utilities.plist_lookup( current_datum, $kw128$TERM, UNPROVIDED )
      } );
    }
    if( term_end.isInteger() )
    {
      final SubLObject time = reader.read_from_string( line, NIL, NIL, Numbers.add( term_end, Sequences.length( $str158$_in_ ) ), UNPROVIDED, UNPROVIDED );
      add_total_time_to_datum( current_datum, time );
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 39751L)
  public static SubLObject compute_total_time_from_start_and_end(final SubLObject current_datum)
  {
    SubLObject total_time = NIL;
    final SubLObject start_time_tail = cdestructuring_bind.property_list_member( $kw146$START_TIME, current_datum );
    final SubLObject start_time = ( NIL != start_time_tail ) ? conses_high.cadr( start_time_tail ) : NIL;
    final SubLObject start_date_tail = cdestructuring_bind.property_list_member( $kw145$START_DATE, current_datum );
    final SubLObject start_date = ( NIL != start_date_tail ) ? conses_high.cadr( start_date_tail ) : NIL;
    final SubLObject end_time_tail = cdestructuring_bind.property_list_member( $kw163$END_TIME, current_datum );
    final SubLObject end_time = ( NIL != end_time_tail ) ? conses_high.cadr( end_time_tail ) : NIL;
    final SubLObject end_date_tail = cdestructuring_bind.property_list_member( $kw71$END_DATE, current_datum );
    final SubLObject end_date = ( NIL != end_date_tail ) ? conses_high.cadr( end_date_tail ) : NIL;
    if( start_time.isString() && start_date.isString() && end_time.isString() && end_date.isString() )
    {
      total_time = Numbers.add( numeric_date_utilities.secondstring_( end_time, start_time ), numeric_date_utilities.datestring_( end_date, start_date ) );
    }
    return total_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40210L)
  public static SubLObject term_from_fact_sheet_log_finish_line(final SubLObject line, final SubLObject timestamp_length)
  {
    final SubLObject offset = Numbers.add( timestamp_length, Sequences.length( $str137$NOTE__Finished_fact_sheet_for_ ) );
    return fact_sheet_term_from_string( line, offset, NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40428L)
  public static SubLObject add_total_time_to_datum(SubLObject current_datum, SubLObject time)
  {
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( !time.isNumber() )
    {
      time = compute_total_time_from_start_and_end( current_datum );
    }
    if( time.isNumber() )
    {
      current_datum = conses_high.putf( current_datum, $kw54$TOTAL_TIME, time );
    }
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40695L)
  public static SubLObject add_end_date_and_time_to_datum(SubLObject current_datum, final SubLObject line)
  {
    current_datum = conses_high.putf( current_datum, $kw71$END_DATE, string_utilities.substring( line, ZERO_INTEGER, TEN_INTEGER ) );
    current_datum = conses_high.putf( current_datum, $kw163$END_TIME, string_utilities.substring( line, ELEVEN_INTEGER, NINETEEN_INTEGER ) );
    return current_datum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40912L)
  public static SubLObject fact_sheet_term_from_string(final SubLObject string, SubLObject term_start, SubLObject term_end, SubLObject warn_on_failureP)
  {
    if( term_start == UNPROVIDED )
    {
      term_start = ZERO_INTEGER;
    }
    if( term_end == UNPROVIDED )
    {
      term_end = NIL;
    }
    if( warn_on_failureP == UNPROVIDED )
    {
      warn_on_failureP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_term = NIL;
    if( constant_reader.constant_reader_prefix().equal( string_utilities.substring( string, term_start, Numbers.add( term_start, TWO_INTEGER ) ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject value1 = reader.read_from_string_ignoring_errors( string, NIL, NIL, term_start, term_end );
      final SubLObject value2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != forts.fort_p( value1 ) )
      {
        v_term = value1;
        term_end = value2;
      }
    }
    else if( $str164$___.equal( string_utilities.substring( string, term_start, Numbers.add( term_start, THREE_INTEGER ) ) ) )
    {
      final SubLObject unstripped = string_utilities.substring( string, term_start, term_end );
      final SubLObject stripped = string_utilities.remove_substring( Sequences.remove( Characters.CHAR_greater, unstripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str165$__ );
      final SubLObject possibly_naut = reader.read_from_string_ignoring_errors( stripped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      v_term = ( NIL != possibly_naut ) ? possibly_naut : NIL;
      if( NIL != v_term )
      {
        term_end = nart_end_from_string( string, term_start );
      }
    }
    if( NIL != warn_on_failureP && NIL == cycl_grammar.cycl_denotational_term_p( v_term ) )
    {
      Errors.warn( $str166$Couldn_t_determine_term_from__S, string_utilities.substring( string, term_start, term_end ) );
    }
    return Values.values( v_term, term_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 41946L)
  public static SubLObject nart_end_from_string(final SubLObject string, final SubLObject term_start)
  {
    SubLObject term_end = NIL;
    SubLObject bracket_count = ZERO_INTEGER;
    final SubLObject doneP = NIL;
    final SubLObject end_var = Sequences.length( string );
    if( NIL == doneP )
    {
      SubLObject end_var_$29;
      SubLObject char_num;
      SubLObject pcase_var;
      SubLObject v_char;
      for( end_var_$29 = end_var, char_num = NIL, char_num = term_start; NIL == doneP && !char_num.numGE( end_var_$29 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = ( pcase_var = Strings.sublisp_char( string, char_num ) );
        if( pcase_var.eql( Characters.CHAR_less ) )
        {
          bracket_count = Numbers.add( bracket_count, ONE_INTEGER );
        }
        else if( pcase_var.eql( Characters.CHAR_greater ) )
        {
          bracket_count = Numbers.subtract( bracket_count, ONE_INTEGER );
          if( bracket_count.isZero() )
          {
            term_end = number_utilities.f_1X( char_num );
          }
        }
      }
    }
    return term_end;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 42512L)
  public static SubLObject open_new_unique_fact_sheet_log_file()
  {
    final SubLObject directory_list = fact_sheet_log_directory_path_for_kb( control_vars.kb_loaded() );
    final SubLObject directory = physical_directory_from_path( directory_list );
    final SubLObject image_id_string = Strings.string_downcase( control_vars.cyc_image_id(), UNPROVIDED, UNPROVIDED );
    final SubLObject uniquifier = ZERO_INTEGER;
    final SubLObject filename_base = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( image_id_string ), new SubLObject[] { $str168$_, format_nil.format_nil_d_no_copy( uniquifier )
    } );
    SubLObject filename = Sequences.cconcatenate( directory, new SubLObject[] { filename_base, $str100$_log
    } );
    if( NIL == Filesys.directory_p( directory ) )
    {
      file_utilities.make_directory_recursive( directory, NIL, ( NIL != fact_sheets.chmod_safe_to_useP() ) ? $str169$0775 : NIL );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $fact_sheet_log_file_uniquifier_lock$.getGlobalValue() );
      filename = uniquify_fact_sheet_log_filename( directory, filename, image_id_string );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $fact_sheet_log_file_uniquifier_lock$.getGlobalValue() );
      }
    }
    return Values.values( directory, filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 43221L)
  public static SubLObject fact_sheet_log_directory_path_for_kb(SubLObject kb)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    return ConsesLow.append( fact_sheets.fact_sheet_data_path(), ConsesLow.list( $str170$logs, PrintLow.format( NIL, $str171$_5__0D, kb ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 43384L)
  public static SubLObject uniquify_fact_sheet_log_filename(final SubLObject parent_directory, SubLObject filename, final SubLObject image_id_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject uniquifier = ZERO_INTEGER;
    for( SubLObject filename_base = NIL; NIL != file_utilities.file_existsP( filename ); filename = Sequences.cconcatenate( parent_directory, new SubLObject[] { filename_base, $str100$_log
    } ) )
    {
      uniquifier = Numbers.add( uniquifier, ONE_INTEGER );
      filename_base = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( image_id_string ), new SubLObject[] { $str168$_, format_nil.format_nil_d_no_copy( uniquifier )
      } );
    }
    final SubLObject _prev_bind_0 = $fact_sheet_log_file$.currentBinding( thread );
    try
    {
      $fact_sheet_log_file$.bind( filename, thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$30 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $fact_sheet_log_file$.getDynamicValue( thread ), $kw172$APPEND );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$30, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str108$Unable_to_open__S, $fact_sheet_log_file$.getDynamicValue( thread ) );
        }
        final SubLObject _prev_bind_0_$31 = $fact_sheet_log_stream$.currentBinding( thread );
        try
        {
          $fact_sheet_log_stream$.bind( stream, thread );
          final SubLObject stream_$32 = fact_sheet_log_stream();
          if( ( T == stream_$32 && Threads.current_process().eql( subl_promotions.initial_process() ) ) || ( stream_$32.isStream() && NIL != streams_high.output_stream_p( stream_$32 ) ) )
          {
            print_fact_sheet_log_header( $str20$NOTE, stream_$32 );
            PrintLow.format( stream_$32, $str173$Opening_log_ );
            streams_high.force_output( stream_$32 );
          }
        }
        finally
        {
          $fact_sheet_log_stream$.rebind( _prev_bind_0_$31, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      $fact_sheet_log_file$.rebind( _prev_bind_0, thread );
    }
    if( NIL != fact_sheets.chmod_safe_to_useP() )
    {
      file_utilities.chmod( filename, $str174$755 );
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 43899L)
  public static SubLObject physical_directory_from_path(final SubLObject path)
  {
    assert NIL != string_utilities.list_of_string_p( path ) : path;
    return Sequences.cconcatenate( string_utilities.bunge( path, Characters.CHAR_slash ), $str176$_ );
  }

  public static SubLObject declare_fact_sheet_logs_file()
  {
    SubLFiles.declareFunction( me, "fact_sheet_log_stream", "FACT-SHEET-LOG-STREAM", 0, 0, false );
    SubLFiles.declareMacro( me, "with_quiet_fact_sheet_logging", "WITH-QUIET-FACT-SHEET-LOGGING" );
    SubLFiles.declareMacro( me, "log_fact_sheet_message", "LOG-FACT-SHEET-MESSAGE" );
    SubLFiles.declareFunction( me, "print_fact_sheet_log_header", "PRINT-FACT-SHEET-LOG-HEADER", 2, 0, false );
    SubLFiles.declareMacro( me, "log_fact_sheet_warning", "LOG-FACT-SHEET-WARNING" );
    SubLFiles.declareMacro( me, "log_fact_sheet_note", "LOG-FACT-SHEET-NOTE" );
    SubLFiles.declareMacro( me, "with_fact_sheet_log_file", "WITH-FACT-SHEET-LOG-FILE" );
    SubLFiles.declareMacro( me, "with_fact_sheet_logging", "WITH-FACT-SHEET-LOGGING" );
    SubLFiles.declareFunction( me, "note_fact_sheet_log_file_closed", "NOTE-FACT-SHEET-LOG-FILE-CLOSED", 0, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_closed_p", "FACT-SHEET-LOG-FILE-CLOSED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hourly_fact_sheet_stats", "HOURLY-FACT-SHEET-STATS", 0, 0, false );
    SubLFiles.declareMacro( me, "with_fact_sheet_logging_and_hourly_reporting", "WITH-FACT-SHEET-LOGGING-AND-HOURLY-REPORTING" );
    SubLFiles.declareFunction( me, "fact_sheet_hourly_reporting_onP", "FACT-SHEET-HOURLY-REPORTING-ON?", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_hourly_report_time", "RESET-HOURLY-REPORT-TIME", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_hourly_fact_sheet_stats", "CLEAR-HOURLY-FACT-SHEET-STATS", 0, 0, false );
    SubLFiles.declareFunction( me, "add_fact_sheet_info_to_hourly_stats", "ADD-FACT-SHEET-INFO-TO-HOURLY-STATS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_hourly_fact_sheet_update_count", "GET-HOURLY-FACT-SHEET-UPDATE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_hourly_fact_sheet_update_count", "CLEAR-HOURLY-FACT-SHEET-UPDATE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "note_fact_sheet_query_timeout_in_hourly_stats", "NOTE-FACT-SHEET-QUERY-TIMEOUT-IN-HOURLY-STATS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_hourly_fact_sheet_query_timeout_count", "GET-HOURLY-FACT-SHEET-QUERY-TIMEOUT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_hourly_fact_sheet_query_timeout_count", "CLEAR-HOURLY-FACT-SHEET-QUERY-TIMEOUT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_log_fact_sheet_hourly_report", "MAYBE-LOG-FACT-SHEET-HOURLY-REPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "log_fact_sheet_hourly_report", "LOG-FACT-SHEET-HOURLY-REPORT", 0, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_generated_count", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_generated_count", "FACT-SHEET-LOG-FILE-GENERATED-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_average_total_time", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-TOTAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_count_and_total_time", "FACT-SHEET-LOG-FILE-COUNT-AND-TOTAL-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "plot_fact_sheet_log_directory_generated_count_by_date", "PLOT-FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_generated_count_by_date", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-BY-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_generated_count_by_date", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_average_total_time_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-TOTAL-TIME-BY-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_average_total_time_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-TOTAL-TIME-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_average_category_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-CATEGORY-COUNT-BY-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_average_category_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-CATEGORY-COUNT-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_average_sentence_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-SENTENCE-COUNT-BY-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_average_sentence_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-SENTENCE-COUNT-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_average_uncategorized_sentence_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-UNCATEGORIZED-SENTENCE-COUNT-BY-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_average_uncategorized_sentence_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-UNCATEGORIZED-SENTENCE-COUNT-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "plot_fact_sheet_log_directory_query_failure_rate_by_date", "PLOT-FACT-SHEET-LOG-DIRECTORY-QUERY-FAILURE-RATE-BY-DATE", 1, 3, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_query_failure_rate_by_date", "FACT-SHEET-LOG-DIRECTORY-QUERY-FAILURE-RATE-BY-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_query_failure_rate_by_date", "FACT-SHEET-LOG-FILE-QUERY-FAILURE-RATE-BY-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_generated_count_for_date", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-FOR-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_generated_count_for_date", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-FOR-DATE", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_generated_count_old", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-OLD", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_generated_count_for_date_old", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-FOR-DATE-OLD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_fact_sheet_log_file_data", "GET-FACT-SHEET-LOG-FILE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_fact_sheet_log_directory_data", "GET-FACT-SHEET-LOG-DIRECTORY-DATA", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_get_fact_sheet_log_directory_data_cached", "CLEAR-GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_fact_sheet_log_directory_data_cached", "REMOVE-GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "get_fact_sheet_log_directory_data_cached_internal", "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_fact_sheet_log_directory_data_cached", "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_fact_sheet_log_directory_data_file", "FIND-OR-CREATE-FACT-SHEET-LOG-DIRECTORY-DATA-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "ensure_fact_sheet_log_directories_are_up_to_date", "ENSURE-FACT-SHEET-LOG-DIRECTORIES-ARE-UP-TO-DATE", 0, 0, false );
    SubLFiles.declareFunction( me, "parse_and_save_fact_sheet_log_directory_data", "PARSE-AND-SAVE-FACT-SHEET-LOG-DIRECTORY-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_and_save_fact_sheet_log_file_data", "PARSE-AND-SAVE-FACT-SHEET-LOG-FILE-DATA", 1, 2, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_parsed_data_filename", "FACT-SHEET-LOG-FILE-PARSED-DATA-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_parsed_data_filename", "FACT-SHEET-LOG-DIRECTORY-PARSED-DATA-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_parse_data", "FACT-SHEET-LOG-FILE-PARSE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_line_starts_withP", "FACT-SHEET-LOG-LINE-STARTS-WITH?", 3, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_parse_start_line_data", "FACT-SHEET-LOG-FILE-PARSE-START-LINE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_parse_stale_start_line_data", "FACT-SHEET-LOG-FILE-PARSE-STALE-START-LINE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_parse_dequeue_line_data", "FACT-SHEET-LOG-FILE-PARSE-DEQUEUE-LINE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_file_parse_new_query_timeout_line_data", "FACT-SHEET-LOG-FILE-PARSE-NEW-QUERY-TIMEOUT-LINE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "update_current_datum_for_misc_sentence_stats", "UPDATE-CURRENT-DATUM-FOR-MISC-SENTENCE-STATS", 3, 0, false );
    SubLFiles.declareFunction( me, "update_current_datum_for_pph_stats", "UPDATE-CURRENT-DATUM-FOR-PPH-STATS", 3, 0, false );
    SubLFiles.declareFunction( me, "update_current_datum_for_pph_failure_stats", "UPDATE-CURRENT-DATUM-FOR-PPH-FAILURE-STATS", 3, 0, false );
    SubLFiles.declareFunction( me, "update_current_datum_for_info_gather_stats", "UPDATE-CURRENT-DATUM-FOR-INFO-GATHER-STATS", 3, 0, false );
    SubLFiles.declareFunction( me, "finalize_current_datum", "FINALIZE-CURRENT-DATUM", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_total_time_from_start_and_end", "COMPUTE-TOTAL-TIME-FROM-START-AND-END", 1, 0, false );
    SubLFiles.declareFunction( me, "term_from_fact_sheet_log_finish_line", "TERM-FROM-FACT-SHEET-LOG-FINISH-LINE", 2, 0, false );
    SubLFiles.declareFunction( me, "add_total_time_to_datum", "ADD-TOTAL-TIME-TO-DATUM", 1, 1, false );
    SubLFiles.declareFunction( me, "add_end_date_and_time_to_datum", "ADD-END-DATE-AND-TIME-TO-DATUM", 2, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_term_from_string", "FACT-SHEET-TERM-FROM-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nart_end_from_string", "NART-END-FROM-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "open_new_unique_fact_sheet_log_file", "OPEN-NEW-UNIQUE-FACT-SHEET-LOG-FILE", 0, 0, false );
    SubLFiles.declareFunction( me, "fact_sheet_log_directory_path_for_kb", "FACT-SHEET-LOG-DIRECTORY-PATH-FOR-KB", 0, 1, false );
    SubLFiles.declareFunction( me, "uniquify_fact_sheet_log_filename", "UNIQUIFY-FACT-SHEET-LOG-FILENAME", 3, 0, false );
    SubLFiles.declareFunction( me, "physical_directory_from_path", "PHYSICAL-DIRECTORY-FROM-PATH", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_fact_sheet_logs_file()
  {
    $fact_sheet_log_file$ = SubLFiles.defparameter( "*FACT-SHEET-LOG-FILE*", NIL );
    $fact_sheet_log_stream$ = SubLFiles.defparameter( "*FACT-SHEET-LOG-STREAM*", T );
    $closed_fact_sheet_log_files$ = SubLFiles.deflexical( "*CLOSED-FACT-SHEET-LOG-FILES*", ( maybeDefault( $sym43$_CLOSED_FACT_SHEET_LOG_FILES_, $closed_fact_sheet_log_files$, NIL ) ) );
    $next_fact_sheet_hourly_report_time$ = SubLFiles.defparameter( "*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*", NIL );
    $hourly_fact_sheet_stats$ = SubLFiles.defparameter( "*HOURLY-FACT-SHEET-STATS*", NIL );
    $fact_sheet_log_file_properties$ = SubLFiles.deflexical( "*FACT-SHEET-LOG-FILE-PROPERTIES*", $list95 );
    $get_fact_sheet_log_directory_data_cached_caching_state$ = SubLFiles.deflexical( "*GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-CACHING-STATE*", NIL );
    $fact_sheet_log_file_uniquifier_lock$ = SubLFiles.deflexical( "*FACT-SHEET-LOG-FILE-UNIQUIFIER-LOCK*", Locks.make_lock( $str167$fact_sheet_log_file_uniquifier_lo ) );
    return NIL;
  }

  public static SubLObject setup_fact_sheet_logs_file()
  {
    access_macros.register_macro_helper( $sym2$LOG_FACT_SHEET_MESSAGE, $list3 );
    access_macros.register_macro_helper( $sym13$PRINT_FACT_SHEET_LOG_HEADER, $sym2$LOG_FACT_SHEET_MESSAGE );
    subl_macro_promotions.declare_defglobal( $sym43$_CLOSED_FACT_SHEET_LOG_FILES_ );
    access_macros.register_macro_helper( $sym44$NOTE_FACT_SHEET_LOG_FILE_CLOSED, $sym45$WITH_FACT_SHEET_LOGGING );
    access_macros.register_macro_helper( $sym48$RESET_HOURLY_REPORT_TIME, $sym49$WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING );
    memoization_state.note_globally_cached_function( $sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_fact_sheet_logs_file();
  }

  @Override
  public void initializeVariables()
  {
    init_fact_sheet_logs_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_fact_sheet_logs_file();
  }
  static
  {
    me = new fact_sheet_logs();
    $fact_sheet_log_file$ = null;
    $fact_sheet_log_stream$ = null;
    $closed_fact_sheet_log_files$ = null;
    $next_fact_sheet_hourly_report_time$ = null;
    $hourly_fact_sheet_stats$ = null;
    $fact_sheet_log_file_properties$ = null;
    $get_fact_sheet_log_directory_data_cached_caching_state$ = null;
    $fact_sheet_log_file_uniquifier_lock$ = null;
    $sym0$CLET = makeSymbol( "CLET" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "*FACT-SHEET-LOG-STREAM*" ), makeSymbol( "*NULL-OUTPUT*" ) ) );
    $sym2$LOG_FACT_SHEET_MESSAGE = makeSymbol( "LOG-FACT-SHEET-MESSAGE" );
    $list3 = ConsesLow.list( makeSymbol( "LOG-FACT-SHEET-WARNING" ), makeSymbol( "LOG-FACT-SHEET-NOTE" ) );
    $list4 = ConsesLow.list( makeSymbol( "MSG-TYPE" ), makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym5$STREAM = makeUninternedSymbol( "STREAM" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "FACT-SHEET-LOG-STREAM" ) ) );
    $sym7$PWHEN = makeSymbol( "PWHEN" );
    $sym8$COR = makeSymbol( "COR" );
    $sym9$CAND = makeSymbol( "CAND" );
    $list10 = ConsesLow.list( ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ) ), ConsesLow.list( makeSymbol( "INITIAL-PROCESS" ) ) ) );
    $sym11$STREAMP = makeSymbol( "STREAMP" );
    $sym12$OUTPUT_STREAM_P = makeSymbol( "OUTPUT-STREAM-P" );
    $sym13$PRINT_FACT_SHEET_LOG_HEADER = makeSymbol( "PRINT-FACT-SHEET-LOG-HEADER" );
    $sym14$FORMAT = makeSymbol( "FORMAT" );
    $sym15$FORCE_OUTPUT = makeSymbol( "FORCE-OUTPUT" );
    $str16$_ = makeString( " " );
    $str17$__ = makeString( ": " );
    $list18 = ConsesLow.list( makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $str19$WARN = makeString( "WARN" );
    $str20$NOTE = makeString( "NOTE" );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILENAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym22$_FACT_SHEET_LOG_FILE_ = makeSymbol( "*FACT-SHEET-LOG-FILE*" );
    $sym23$WITH_PRIVATE_TEXT_FILE = makeSymbol( "WITH-PRIVATE-TEXT-FILE" );
    $list24 = ConsesLow.list( makeSymbol( "*FACT-SHEET-LOG-STREAM*" ), makeSymbol( "*FACT-SHEET-LOG-FILE*" ), makeKeyword( "APPEND" ) );
    $sym25$DIRECTORY = makeUninternedSymbol( "DIRECTORY" );
    $sym26$FILENAME = makeUninternedSymbol( "FILENAME" );
    $sym27$ALREADY_LOGGING_ = makeUninternedSymbol( "ALREADY-LOGGING?" );
    $sym28$USE_NEW_SETUP_ = makeUninternedSymbol( "USE-NEW-SETUP?" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "*FACT-SHEET-LOG-FILE*" ) ) );
    $sym30$PUNLESS = makeSymbol( "PUNLESS" );
    $sym31$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "OPEN-NEW-UNIQUE-FACT-SHEET-LOG-FILE" ) ) );
    $sym33$CSETQ = makeSymbol( "CSETQ" );
    $sym34$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $sym35$STRINGP = makeSymbol( "STRINGP" );
    $sym36$_STANDARD_OUTPUT_ = makeSymbol( "*STANDARD-OUTPUT*" );
    $str37$__Logging_Fact_Sheet_generation_t = makeString( "~&Logging Fact-Sheet generation to file:~% ~S~%" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) );
    $sym39$WITH_FACT_SHEET_LOG_FILE = makeSymbol( "WITH-FACT-SHEET-LOG-FILE" );
    $sym40$FIF = makeSymbol( "FIF" );
    $list41 = ConsesLow.list( makeSymbol( "*FACT-SHEET-LOG-FILE*" ) );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "LOG-FACT-SHEET-NOTE" ), makeString( "Closing log." ) ), ConsesLow.list( makeSymbol( "NOTE-FACT-SHEET-LOG-FILE-CLOSED" ) ) );
    $sym43$_CLOSED_FACT_SHEET_LOG_FILES_ = makeSymbol( "*CLOSED-FACT-SHEET-LOG-FILES*" );
    $sym44$NOTE_FACT_SHEET_LOG_FILE_CLOSED = makeSymbol( "NOTE-FACT-SHEET-LOG-FILE-CLOSED" );
    $sym45$WITH_FACT_SHEET_LOGGING = makeSymbol( "WITH-FACT-SHEET-LOGGING" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*" ) ), ConsesLow.list( makeSymbol( "*HOURLY-FACT-SHEET-STATS*" ), ConsesLow.list( makeSymbol( "MAKE-VECTOR" ), TWO_INTEGER,
        ZERO_INTEGER ) ) );
    $list47 = ConsesLow.list( makeSymbol( "RESET-HOURLY-REPORT-TIME" ) );
    $sym48$RESET_HOURLY_REPORT_TIME = makeSymbol( "RESET-HOURLY-REPORT-TIME" );
    $sym49$WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING = makeSymbol( "WITH-FACT-SHEET-LOGGING-AND-HOURLY-REPORTING" );
    $str50$Hourly_report__Generated__S_fact_ = makeString( "Hourly report: Generated ~S fact sheets. Suffered ~S query timeouts." );
    $str51$Counting_fact_sheets_in_ = makeString( "Counting fact sheets in " );
    $str52$cdolist = makeString( "cdolist" );
    $str53$Gathering_time_info_for_fact_shee = makeString( "Gathering time info for fact sheets in " );
    $kw54$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $list55 = ConsesLow.cons( makeSymbol( "DATE-STRING" ), makeSymbol( "COUNT" ) );
    $sym56$DATESTRING_ = makeSymbol( "DATESTRING<" );
    $kw57$XDATA = makeKeyword( "XDATA" );
    $str58$time = makeString( "time" );
    $kw59$TIMEFMT = makeKeyword( "TIMEFMT" );
    $str60$__m__d__Y_ = makeString( "\"%m/%d/%Y\"" );
    $kw61$XLABEL = makeKeyword( "XLABEL" );
    $str62$Date = makeString( "Date" );
    $kw63$YLABEL = makeKeyword( "YLABEL" );
    $str64$__of_Fact_Sheets = makeString( "# of Fact Sheets" );
    $kw65$PLOT_TITLE = makeKeyword( "PLOT-TITLE" );
    $kw66$LINE_LABELS = makeKeyword( "LINE-LABELS" );
    $list67 = ConsesLow.list( makeString( "Fact Sheets per Day" ) );
    $kw68$OUTPUT_FILE = makeKeyword( "OUTPUT-FILE" );
    $str69$Categorizing_fact_sheets_in_ = makeString( "Categorizing fact sheets in " );
    $str70$_by_date = makeString( " by date" );
    $kw71$END_DATE = makeKeyword( "END-DATE" );
    $str72$Analyzing_fact_sheet_times_in_ = makeString( "Analyzing fact sheet times in " );
    $str73$Analyzing_fact_sheet_categorizati = makeString( "Analyzing fact sheet categorization in " );
    $kw74$CATEGORY_COUNT = makeKeyword( "CATEGORY-COUNT" );
    $str75$Analyzing_fact_sheet_sentence_cou = makeString( "Analyzing fact sheet sentence count in " );
    $kw76$PPH_SENTENCE_COUNT = makeKeyword( "PPH-SENTENCE-COUNT" );
    $str77$Analyzing_fact_sheet_uncategorize = makeString( "Analyzing fact sheet uncategorized sentence count in " );
    $kw78$MISC_SENTENCE_COUNT = makeKeyword( "MISC-SENTENCE-COUNT" );
    $list79 = ConsesLow.cons( makeSymbol( "DATE-STRING" ), makeSymbol( "FAILURES" ) );
    $sym80$_ = makeSymbol( ">" );
    $list81 = ConsesLow.list( makeSymbol( "DATE-STRING" ), makeSymbol( "FAILURES" ) );
    $str82$Failure_Rate = makeString( "Failure Rate" );
    $str83$Query_Failure_Rates_by_Day = makeString( "Query Failure Rates by Day" );
    $str84$Analyzing_query_failure_rates_in_ = makeString( "Analyzing query failure rates in " );
    $list85 = ConsesLow.cons( makeSymbol( "DATE-STRING" ), makeSymbol( "INFO-CONS" ) );
    $list86 = ConsesLow.cons( makeSymbol( "TOTAL-COUNT" ), makeSymbol( "QUERY-FAILURE-DICTIONARY" ) );
    $kw87$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $kw88$NORMAL = makeKeyword( "NORMAL" );
    $kw89$VERBOSITY = makeKeyword( "VERBOSITY" );
    $kw90$QUERY = makeKeyword( "QUERY" );
    $kw91$QUERY_TIMEOUT_INFO = makeKeyword( "QUERY-TIMEOUT-INFO" );
    $str92$_generated_on_ = makeString( " generated on " );
    $str93$Finished_fact_sheet = makeString( "Finished fact sheet" );
    $str94$____Finished_fact_sheet = makeString( " .* Finished fact sheet" );
    $list95 = ConsesLow.list( new SubLObject[] { makeKeyword( "VERBOSITY" ), makeKeyword( "TERM" ), makeKeyword( "STATUS" ), makeKeyword( "START-DATE" ), makeKeyword( "START-TIME" ), makeKeyword( "END-DATE" ),
      makeKeyword( "END-TIME" ), makeKeyword( "QUERY-TIMEOUTS" ), makeKeyword( "QUERY-TIMEOUT-INFO" ), makeKeyword( "MISC-SENTENCE-COUNT" ), makeKeyword( "MISC-SENTENCE-TIME" ), makeKeyword(
          "FILTERED-REDUNDANT-FACT-COUNT" ), makeKeyword( "CATEGORY-COUNT" ), makeKeyword( "INFO-GATHERING-TIME" ), makeKeyword( "PPH-PARAGRAPH-COUNT" ), makeKeyword( "PPH-SENTENCE-COUNT" ), makeKeyword(
              "PPH-FAILURE-COUNT" ), makeKeyword( "PPH-TIME" ), makeKeyword( "TOTAL-TIME" )
    } );
    $sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED = makeSymbol( "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED" );
    $sym97$DICTIONARY_P = makeSymbol( "DICTIONARY-P" );
    $sym98$_GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED_CACHING_STATE_ = makeSymbol( "*GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-CACHING-STATE*" );
    $str99$Ensuring_data_file_is_up_to_date_ = makeString( "Ensuring data file is up to date..." );
    $str100$_log = makeString( ".log" );
    $str101$Parsing_data_from_ = makeString( "Parsing data from " );
    $str102$___ = makeString( "..." );
    $sym103$FILE_EXISTS_ = makeSymbol( "FILE-EXISTS?" );
    $str104$ = makeString( "" );
    $str105$parsed_data_cfasl = makeString( "parsed-data.cfasl" );
    $str106$MM_DD_YYYY_HH_MM_SS_ = makeString( "MM/DD/YYYY HH:MM:SS " );
    $kw107$INPUT = makeKeyword( "INPUT" );
    $str108$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str109$NOTE__Starting__ = makeString( "NOTE: Starting :" );
    $kw110$PARSING_DATUM = makeKeyword( "PARSING-DATUM" );
    $str111$_Verbosity__ = makeString( " Verbosity: " );
    $str112$NOTE__Dequeuing_ = makeString( "NOTE: Dequeuing " );
    $kw113$DEQUEUED_TERM = makeKeyword( "DEQUEUED-TERM" );
    $str114$NOTE__Skipping_ = makeString( "NOTE: Skipping " );
    $str115$NOTE__Updating_ = makeString( "NOTE: Updating " );
    $str116$NOTE__Updating_all_stale_fact_she = makeString( "NOTE: Updating all stale fact sheets from " );
    $str117$NOTE__Updating_stale_fact_sheet_f = makeString( "NOTE: Updating stale fact sheet for " );
    $str118$WARN__Hit_soft_timeout_of_ = makeString( "WARN: Hit soft timeout of " );
    $kw119$QUERY_TIMEOUTS = makeKeyword( "QUERY-TIMEOUTS" );
    $kw120$MINI = makeKeyword( "MINI" );
    $kw121$HIT_QUERY_TIMEOUT = makeKeyword( "HIT-QUERY-TIMEOUT" );
    $str122$NOTE__ = makeString( "NOTE: " );
    $kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD = makeKeyword( "LOOKING-FOR-TIMED-OUT-QUERY-YIELD" );
    $str124$_yielded_ = makeString( " yielded " );
    $kw125$PARAGRAPH_COUNT = makeKeyword( "PARAGRAPH-COUNT" );
    $str126$WARN__Launching_make_up_updater = makeString( "WARN: Launching make-up updater" );
    $str127$We_appear_to_have_aborted_the_fac = makeString( "We appear to have aborted the fact-sheet generation for~% ~S (launched make-up updater)~% ~S" );
    $kw128$TERM = makeKeyword( "TERM" );
    $str129$NOTE__Added_ = makeString( "NOTE: Added " );
    $str130$NOTE__Gathered_ = makeString( "NOTE: Gathered " );
    $str131$_implies_ = makeString( " implies " );
    $kw132$FILTERED_REDUNDANT_FACT_COUNT = makeKeyword( "FILTERED-REDUNDANT-FACT-COUNT" );
    $str133$NOTE__Generated_ = makeString( "NOTE: Generated " );
    $str134$WARN__Failed_to_paraphrase_ = makeString( "WARN: Failed to paraphrase " );
    $str135$WARN__Query_failed_to_get_mini_fa = makeString( "WARN: Query failed to get mini fact sheet for " );
    $str136$NOTE__Query_got_mini_fact_sheet_o = makeString( "NOTE: Query got mini fact sheet of length 120 for " );
    $str137$NOTE__Finished_fact_sheet_for_ = makeString( "NOTE: Finished fact sheet for " );
    $str138$Found_finish_line__but_state_is__ = makeString( "Found finish line, but state is ~S~% Current datum: ~S~%~S~%~S" );
    $str139$We_appear_to_have_aborted_the_fac = makeString( "We appear to have aborted the fact-sheet generation for~% ~S (end of log file)~% ~S" );
    $int140$35 = makeInteger( 35 );
    $str141$update_on_ = makeString( "update on " );
    $str142$__Status = makeString( ". Status" );
    $str143$__Status__ = makeString( ". Status: " );
    $kw144$STATUS = makeKeyword( "STATUS" );
    $kw145$START_DATE = makeKeyword( "START-DATE" );
    $kw146$START_TIME = makeKeyword( "START-TIME" );
    $kw147$STALE = makeKeyword( "STALE" );
    $int148$46 = makeInteger( 46 );
    $kw149$TIMEOUT_TIME = makeKeyword( "TIMEOUT-TIME" );
    $str150$seconds_after_getting = makeString( "seconds after getting" );
    $kw151$RESULT_COUNT = makeKeyword( "RESULT-COUNT" );
    $str152$THCL_sentences_in = makeString( "THCL sentences in" );
    $kw153$MISC_SENTENCE_TIME = makeKeyword( "MISC-SENTENCE-TIME" );
    $kw154$PPH_PARAGRAPH_COUNT = makeKeyword( "PPH-PARAGRAPH-COUNT" );
    $str155$paragraphs_containing_ = makeString( "paragraphs containing " );
    $str156$sentences_for_ = makeString( "sentences for " );
    $str157$Must_have_missed_the__Finished__l = makeString( "Must have missed the 'Finished' line for ~S" );
    $str158$_in_ = makeString( " in " );
    $kw159$PPH_TIME = makeKeyword( "PPH-TIME" );
    $kw160$PPH_FAILURE_COUNT = makeKeyword( "PPH-FAILURE-COUNT" );
    $str161$groups_of_sentences_for_ = makeString( "groups of sentences for " );
    $kw162$INFO_GATHERING_TIME = makeKeyword( "INFO-GATHERING-TIME" );
    $kw163$END_TIME = makeKeyword( "END-TIME" );
    $str164$___ = makeString( "#<(" );
    $str165$__ = makeString( "#<" );
    $str166$Couldn_t_determine_term_from__S = makeString( "Couldn't determine term from ~S" );
    $str167$fact_sheet_log_file_uniquifier_lo = makeString( "fact-sheet-log-file-uniquifier-lock" );
    $str168$_ = makeString( "-" );
    $str169$0775 = makeString( "0775" );
    $str170$logs = makeString( "logs" );
    $str171$_5__0D = makeString( "~5,'0D" );
    $kw172$APPEND = makeKeyword( "APPEND" );
    $str173$Opening_log_ = makeString( "Opening log." );
    $str174$755 = makeString( "755" );
    $sym175$LIST_OF_STRING_P = makeSymbol( "LIST-OF-STRING-P" );
    $str176$_ = makeString( "/" );
  }
}
/*
 * 
 * Total time: 962 ms
 * 
 */